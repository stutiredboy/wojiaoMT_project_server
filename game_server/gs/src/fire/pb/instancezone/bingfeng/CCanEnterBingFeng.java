
package fire.pb.instancezone.bingfeng;
import fire.pb.util.DateValidate;
import mkdb.Procedure;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCanEnterBingFeng__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CCanEnterBingFeng extends __CCanEnterBingFeng__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid == -1)
			return;
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				BingFengRole bingFengRole = new BingFengRole(roleid, true);
				if (bingFengRole.getBingFengRoleBean().getTimes() <= 0) {
					//娆℃暟宸茬粡鐢ㄥ畬浜?
					xbean.RoleBFInfo rolebingFengInfo = BingFengLandMgr.getInstance().getRoleBingFengInfo(roleid, 0, false);
					bingFengRole.getBingFengRoleBean().setTimes(bingFengRole.getBingFengRoleBean().getTimes() - 1);
					long currentTime = System.currentTimeMillis();
					
					//濡傛灉鏄湪鍚屼竴澶?,鍒欑洿鎺ヨ繑鍥炰笉鑳藉啀鎵撳啺灏佺帇搴т簡
					if (DateValidate.inTheSameDay(currentTime, rolebingFengInfo.getLastchangetime())) {
						SCanEnterBingFeng scanenter = new SCanEnterBingFeng();
						scanenter.finish = 1;
						
						Procedure.psendWhileCommit(roleid, scanenter);
						return true;
					}
				}
				
				//涓嶆槸鍦ㄥ悓涓?澶?,鎴栬?呮鏁版病鏈夌敤瀹?,閮藉彲浠ュ啀鎵?
				SCanEnterBingFeng scanenter = new SCanEnterBingFeng();
				scanenter.finish = 0;
				Procedure.psendWhileCommit(roleid, scanenter);
				return true;
			}
			
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 804557;

	public int getType() {
		return 804557;
	}


	public CCanEnterBingFeng() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CCanEnterBingFeng) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CCanEnterBingFeng _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

