
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
					//濞嗏剝鏆熷鑼病閻€劌鐣禍?
					xbean.RoleBFInfo rolebingFengInfo = BingFengLandMgr.getInstance().getRoleBingFengInfo(roleid, 0, false);
					bingFengRole.getBingFengRoleBean().setTimes(bingFengRole.getBingFengRoleBean().getTimes() - 1);
					long currentTime = System.currentTimeMillis();
					
					//婵″倹鐏夐弰顖氭躬閸氬奔绔存径?,閸掓瑧娲块幒銉ㄧ箲閸ョ偘绗夐懗钘夊晙閹垫挸鍟虹亸浣哄竾鎼囱傜啊
					if (DateValidate.inTheSameDay(currentTime, rolebingFengInfo.getLastchangetime())) {
						SCanEnterBingFeng scanenter = new SCanEnterBingFeng();
						scanenter.finish = 1;
						
						Procedure.psendWhileCommit(roleid, scanenter);
						return true;
					}
				}
				
				//娑撳秵妲搁崷銊ユ倱娑�?婢�?,閹存牞?鍛偧閺佺増鐥呴張澶屾暏鐎�?,闁棄褰叉禒銉ュ晙閹�?
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

