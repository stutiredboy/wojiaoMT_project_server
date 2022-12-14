package gnet.link;

import fire.log.Logger;

import fire.pb.EnterWorldThread;
import fire.pb.main.Gs;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __Dispatch__ extends mkio.Protocol { }

/** link to gs
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class Dispatch extends __Dispatch__ {
	
	static private final Logger logger=Logger.getLogger("SYSTEM");

	@Override
	public void dispatch(Stub stub) throws Exception {
		int error = Kick.E_PROTOCOL_UNKOWN;
		try {
			Stub stub2 = ((Coder) (getManager().getCoder()))
					.getStub(this.ptype);
			mkio.Protocol p = stub2.newInstance();
			OctetsStream octstram = OctetsStream.wrap(this.pdata);
			p.unmarshal(octstram);
			p.setConnection(this.getConnection());
			p.setContext(this);
			if(Gs.isShutDown.get())
				return;//如果正在关闭，则不接受任何协议了
			
			if(logger.isDebugEnabled())
				logger.debug(new StringBuilder("Recv : class=").append(p.getClass().getName()).append(" size=").append(octstram.size()));
			
			//地图协议
			if(fire.pb.scene.MapThread.getInstance().tryAdd(p,stub2))
				return;
			
			//如果是登陆协议，需要缓存一下再执行
			if(EnterWorldThread.getInstance().tryAdd(p))
				return;
			//摆摊协议
			if(fire.pb.shop.srv.market.MarketThread.getInstance().tryAdd(p))
				return;
			
			p.dispatch(stub);
			return;
		} catch (mkio.MarshalError e) {
			error = Kick.E_MARSHAL_EXCEPTION;
			//if(logger.isDebugEnabled())
				logger.error(new StringBuilder("Dispatch : error=E_MARSHAL_EXCEPTION ptype=")
											.append(this.ptype)	);
		} catch (Throwable e) {
			error = Kick.E_PROTOCOL_EXCEPTION;
			//if(logger.isDebugEnabled())
				logger.error(new StringBuilder("Dispatch : error=E_PROTOCOL_EXCEPTION ptype=")
											.append(this.ptype)	);
		}
		
		Kick kick = new Kick();
		kick.error = error;
		kick.action = Kick.A_DELAY_CLOSE;
		kick.linksid = this.linksid;
		kick.send(super.getConnection());
		
		logger.error(new StringBuilder("Kick User error=").append(error).append(" action=").append(Kick.A_DELAY_CLOSE).append(" linksid=").append(this.linksid)	);
		
	}

	@Override
	protected void process() {
		throw new UnsupportedOperationException();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 65541;

	public int getType() {
		return 65541;
	}

	public int linksid;
	public int userid;
	public int ptype;
	public com.locojoy.base.Octets pdata;

	public Dispatch() {
		pdata = new com.locojoy.base.Octets();
	}

	public Dispatch(int _linksid_, int _userid_, int _ptype_, com.locojoy.base.Octets _pdata_) {
		this.linksid = _linksid_;
		this.userid = _userid_;
		this.ptype = _ptype_;
		this.pdata = _pdata_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(linksid);
		_os_.marshal(userid);
		_os_.marshal(ptype);
		_os_.marshal(pdata);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		linksid = _os_.unmarshal_int();
		userid = _os_.unmarshal_int();
		ptype = _os_.unmarshal_int();
		pdata = _os_.unmarshal_Octets();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof Dispatch) {
			Dispatch _o_ = (Dispatch)_o1_;
			if (linksid != _o_.linksid) return false;
			if (userid != _o_.userid) return false;
			if (ptype != _o_.ptype) return false;
			if (!pdata.equals(_o_.pdata)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += linksid;
		_h_ += userid;
		_h_ += ptype;
		_h_ += pdata.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(linksid).append(",");
		_sb_.append(userid).append(",");
		_sb_.append(ptype).append(",");
		_sb_.append("B").append(pdata.size()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}
