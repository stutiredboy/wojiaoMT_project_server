
package fire.pb.skill.liveskill;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestAttr__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 璇锋眰鏌愪簺灞炴?? by changhao
 */
public class CRequestAttr extends __CRequestAttr__ {
	private static Logger logger = Logger.getLogger("ITEM");
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestattr = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				xbean.Properties prop = xtable.Properties.select(roleid);
				if (prop == null)
				{
					return false;
				}
				
				fire.pb.attr.SRefreshRoleData refreshdata = new fire.pb.attr.SRefreshRoleData();
				if (attrid.contains(fire.pb.attr.AttrType.ENERGY))
				{
					int energy = prop.getEnergy();
					refreshdata.datas.put( fire.pb.attr.AttrType.ENERGY, (float)energy);					
				}
				logger.error("------------浜虹墿灞炴??-锛?------------------"+refreshdata.datas);
				mkdb.Procedure.psendWhileCommit(roleid, refreshdata);					
				
				return true;
			}
		};
		
		requestattr.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800530;

	public int getType() {
		return 800530;
	}

	public java.util.LinkedList<Integer> attrid;

	public CRequestAttr() {
		attrid = new java.util.LinkedList<Integer>();
	}

	public CRequestAttr(java.util.LinkedList<Integer> _attrid_) {
		this.attrid = _attrid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(attrid.size());
		for (Integer _v_ : attrid) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			int _v_;
			_v_ = _os_.unmarshal_int();
			attrid.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestAttr) {
			CRequestAttr _o_ = (CRequestAttr)_o1_;
			if (!attrid.equals(_o_.attrid)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += attrid.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(attrid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

