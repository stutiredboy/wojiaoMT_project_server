
package fire.msp.task;

import fire.pb.mission.SUseMissionItemFail;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __MScenarioQuestUseItemVerifyPosFail__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class MScenarioQuestUseItemVerifyPosFail extends __MScenarioQuestUseItemVerifyPosFail__ {
	@Override
	protected void process() {
		// protocol handle
		// Module.logger.error( "濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ鐐电磽娴ｇ晫鍫柛濠冪箞瀵鏁愭径瀣珳闂佸憡渚楅崹铏閸ヮ剚鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ω閳哄倵鎷虹紓浣割儐椤戞瑩宕曞☉妯忕懓顭ㄦ惔婵嬪仐閻庢鍠涢褔鍩ユ径鎰潊闁绘﹢娼ф慨鍫曟⒒娴ｅ憡鍟為柛鏃�娲橀弲鑸电鐎ｎ亞顦梺缁樺灱婵倝鍩涢幋鐙呮嫹鐟欏嫭绀�婵炲眰鍔庨弫顔尖槈濞嗘劕寮挎繝鐢靛Т閸嬪棝鎮℃總鍛婄厸濞达綀顫夊畷宀勬煙缁嬪尅鏀荤�垫澘瀚悾婵嬫晸娴犲姹叉繛鎴欏灪閳锋垹绱掔�ｎ亝鍋ラ柛娆忓闇夋繝濠傚暟閸╋綁鏌ｅ☉鍗炴灕缂佺姵鐩鎾敂閸涱収浼撻梻浣瑰缁诲倹顨ラ幖浣稿嚑婵炴垯鍨洪悡鏇熸叏濮楀棗澧扮紒澶嬫そ閺岋紕浠︾拠鎻掝潎闂佽鍠撻崐婵嗙暦閹烘垟妲堟慨妤�妫旂槐锟�" );
		SUseMissionItemFail send = new SUseMissionItemFail();
	    gnet.link.Onlines.getInstance().send( roleid, send );
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				xtable.Bagtimelock.remove( roleid );
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 739905;

	public int getType() {
		return 739905;
	}

	public long roleid;
	public int scenarioquestid;
	public int useitemid;

	public MScenarioQuestUseItemVerifyPosFail() {
	}

	public MScenarioQuestUseItemVerifyPosFail(long _roleid_, int _scenarioquestid_, int _useitemid_) {
		this.roleid = _roleid_;
		this.scenarioquestid = _scenarioquestid_;
		this.useitemid = _useitemid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(scenarioquestid);
		_os_.marshal(useitemid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		scenarioquestid = _os_.unmarshal_int();
		useitemid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof MScenarioQuestUseItemVerifyPosFail) {
			MScenarioQuestUseItemVerifyPosFail _o_ = (MScenarioQuestUseItemVerifyPosFail)_o1_;
			if (roleid != _o_.roleid) return false;
			if (scenarioquestid != _o_.scenarioquestid) return false;
			if (useitemid != _o_.useitemid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += scenarioquestid;
		_h_ += useitemid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(scenarioquestid).append(",");
		_sb_.append(useitemid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(MScenarioQuestUseItemVerifyPosFail _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = scenarioquestid - _o_.scenarioquestid;
		if (0 != _c_) return _c_;
		_c_ = useitemid - _o_.useitemid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

