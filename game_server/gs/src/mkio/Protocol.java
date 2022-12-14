package mkio;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.locojoy.base.Octets;
import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.MarshalException;
import com.locojoy.base.Marshal.OctetsStream;

import fire.pb.hotdeploy.Module;

public abstract class Protocol implements Marshal, Runnable {
	private Mkio connection;
	private Object context;

	private Object sender = null;
	private Object receiver = null;

	public final void setSender(Object s) {
		sender = s;
	}

	public final Object getSender() {
		return sender;
	}

	public final void setReceiver(Object r) {
		receiver = r;
	}

	public final Object getReceiver() {
		return receiver;
	}

	public final Object getContext() {
		return context;
	}

	public final void setContext(Object context) {
		this.context = context;
	}

	public final void setConnection(Mkio connection) {
		this.connection = connection;
	}

	public final Mkio getConnection() {
		return connection;
	}

	public final Manager getManager() {
		return connection.getCreator().getManager();
	}

	public abstract int getType();

	public String str() {
		StringBuilder ss = new StringBuilder();
		if (sender != null) {
			ss.append("sender=" + sender.toString() + " ");
		}
		if (receiver != null) {
			ss.append("receiver=" + receiver.toString() + " ");
		}
		ss.append("type=" + getType() + " class=" + getClass().getName() + " this=" + this);
		return ss.toString();
	}

	@Override
	public final void run() {
		try {
			if (Module.hasNewProtocolClass()) {// if new classes are loaded
				Protocol hotdeployProt = Module.getHotdeployProtocol(this.getClass().getName(), this);
				if (hotdeployProt == null) {// if this procedure has no new
											// version
					process();
				} else {
					hotdeployProt.process();
				}

			} else {
				process();
			}
		} catch (Throwable e) {
			// ???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
			// ??????????????????????????? getConnection().close();
			mkdb.Trace.error("Protocol.run ", e);
		}
	}

	public void dispatch(Stub stub) throws Exception {
		if (mkdb.Trace.isDebugEnabled()) {
			if (str().indexOf("gnet.ServerIDResponse") == -1) {
				mkdb.Trace.debug("mkio.Protocol execute " + str());
			}

		}
		getManager().execute(this);
	}

	protected void process() {
		throw new UnsupportedOperationException("process of " + getClass().getName());
	}

	/////////////////////////////////////////////////////////////
	// ????????????
	public boolean send(Mkio to) {
		if (null != to)
			return checkSend(to, new OctetsStream().marshal(this));
		return false;
	}

	public final boolean send(Manager manager) {
		return send(manager.get());
	}

	private static mkdb.util.Counter counterSend = new mkdb.util.Counter(Engine.mbeans(), "mkdb", "Protocols.send");

	/**
	 * ????????????????????????????????? ???????????????????????????????????????
	 * 
	 * @param to
	 * @param parameter
	 * @return ???????????????????????? false????????????????????????
	 */
	protected final boolean checkSend(Mkio to, Octets parameter) {
		Protocol.Coder coder = (Protocol.Coder) to.getCreator().getManager().getCoder();
		coder.getStub(this.getType()).checkSend(this, parameter.size());
		if (to.write(new OctetsStream().compact_uint32(this.getType()).marshal(parameter).getByteBuffer())) {
			counterSend.increment(this.getClass().getName());
			return true;
		}
		return false;
	}

	public static class Stub {
		private int type;
		private Class<Protocol> cls;
		private int maxSize;

		public int getType() {
			return type;
		}

		public Class<Protocol> getCls() {
			return cls;
		}

		public Protocol newInstance() throws Exception {
			return cls.newInstance();
		}

		@SuppressWarnings("unchecked")
		public Stub(Element self) throws Exception {
			// ??????????????????????????????????????????????????????????????????????????????????????????Xdb??????????????????
			// ??????????????????????????????????????????????????????????????????Manager????????????????????????????????????
			this.cls = (Class<Protocol>) Class.forName(self.getAttribute("class"));
			Protocol p = cls.newInstance();
			this.type = p.getType();

			String tmp = self.getAttribute("maxSize");
			this.maxSize = tmp.isEmpty() ? 0 : Integer.parseInt(tmp);
		}

		public void dispatch(OctetsStream os, Mkio from, Object context) throws Exception {
			Protocol p = newInstance();
			p.unmarshal(os);
			p.setConnection(from);
			p.setContext(context);
			p.dispatch(this);
		}

		public void checkSend(Protocol p, int size) {
			if (p.getClass() != cls)
				throw new mkio.MarshalError("checkSend of " + this + " class mismatch!");
			if (mkdb.Trace.isDebugEnabled())
				mkdb.Trace.debug("mkio.send " + p.str() + ",size=" + size);
			checkSize(size);
		}

		public void checkSize(int size) {
			if (size < 0 || (maxSize > 0 && size > maxSize))
				throw new mkio.MarshalError("checkSize of " + this + " size=" + size);
		}

		@Override
		public String toString() {
			return "Stub(" + type + ", " + cls.getName() + ")";
		}
	}

	// ??????????????????????????????
	public static final class Coder extends Manager.Coder {
		private Map<Integer, Stub> stubs = new HashMap<Integer, Stub>();

		public Stub getStub(int type) {
			Stub stub = stubs.get(type);
			if (null == stub)
				throw new mkio.MarshalError("Protocol.Stub NOT found type=" + type);
			return stub;
		}

		@Override
		public void checkSend(Protocol p, int psize) {
			getStub(p.getType()).checkSend(p, psize);
		}

		@Override
		public void dispatch(int type, OctetsStream os, Mkio from, Object context) throws Exception {
			getStub(type).dispatch(os, from, context);
		}

		@Override
		public void initFilterList(Filter.List input, Filter.List output) {
			input.addLast(new Protocol.Decoder(this));
		}

		@Override
		public void parse(Manager manager, Element self) throws Exception {
			NodeList childnodes = self.getChildNodes();
			for (int i = 0; i < childnodes.getLength(); ++i) {
				Node node = childnodes.item(i);
				if (Node.ELEMENT_NODE != node.getNodeType())
					continue;
				Element e = (Element) node;
				String n = e.getNodeName();
				if (n.equals("Protocol"))
					add(new Protocol.Stub(e));
				if (n.equals("Rpc"))
					add(new Rpc.Stub(e));
				// else
				// throw new RuntimeException("Unkown! node=" + n +
				// " parent=" + self.getNodeName() + "@" + manager);
			}
		}

		void add(Stub stub) {
			if (null != stubs.put(stub.getType(), stub))
				throw new RuntimeException("duplicate type of " + stub);
		}
	}

	private static mkdb.util.Counter counterRecv = new mkdb.util.Counter(Engine.mbeans(), "mkdb", "Protocols.recv");

	// ????????????????????????
	public static class Decoder extends Filter {
		private ByteBuffer buffer;
		private Protocol.Coder coder;

		public Decoder(Protocol.Coder coder) {
			super("mkio.Protocol.Decoder");
			this.coder = coder;
		}

		@Override
		public void doFilter(Filter.Iterator it, ByteBuffer b, Mkio x) {
			buffer = Helper.realloc(buffer, b.remaining());
			buffer.put(b).flip();
			buffer.position(decode(buffer.array(), buffer.limit(), x));
			buffer.compact();
			if (0 == buffer.position()) // isEmpty
				buffer = null;
		}

		private int decode(byte[] bytes, int length, Mkio x) {
			OctetsStream os = OctetsStream.wrap(Octets.wrap(bytes, length));
			int mark = 0; // os.position(); MUSTBE ZERO
			try {
				while (os.size() > mark) {
					int type = os.uncompact_uint32();
					int size = os.uncompact_uint32();
					Protocol.Stub stub = coder.getStub(type);
					stub.checkSize(size);
					mkdb.Trace.debug("protocol type:" + type + ",size:" + size);
					if (size > os.remain())
						break; // not enough
					mark = os.position() + size;
					try {
						counterRecv.increment(stub.getCls().getName());
						stub.dispatch(os, x, null);
					} catch (Throwable e) {
						throw new mkio.MarshalError("(" + type + ", " + size + ")", e);
					}
					// p ?????????????????????????????????????????????????????????????????????
					if (os.position() != mark) {
						throw new mkio.MarshalError("(" + type + ", " + size + ")=" + (mark - os.position()));
					}
				}
			} catch (MarshalException e) {
				// SKIP! ???????????????????????????????????????????????????????????????????????????????????????????????????
			}
			return mark;
		}
	}
}
