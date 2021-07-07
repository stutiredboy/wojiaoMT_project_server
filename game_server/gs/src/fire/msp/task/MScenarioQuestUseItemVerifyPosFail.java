
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
		// Module.logger.error( "濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愰崨鍌滃枎閳诲酣骞嗚椤斿嫮绱撻崒娆掑厡濠殿喗鎸抽幃妯侯潩鐠轰綍锕傛煕閺囥劌鏋ら柣銈忔嫹闂備礁婀遍崑鎾诲箚鐏炶娇娑㈡倷閻㈢數锛濇繛杈剧悼閺咁偊宕奸鍫熺厱濠电姴鍟扮粻鐐碉拷娈垮枛椤兘寮幇顓炵窞閻庯綆鍋呴悵鎶芥⒒娴ｅ憡鍟炲〒姘殜瀹曞綊鎼归銏╁殼闂佹悶鍎洪崜姘跺煕閹寸偟绠鹃柤濂割杺閸ゆ瑦顨ラ悙鎼疁闁哄瞼鍠栭幃鐑芥偋閸繃鐏庨柣搴㈩問閸犳盯顢氳閸┿儲寰勯幇顒夋綂闂佸啿鎼崐鐟扳枍閸ヮ剚鈷掑ù锝囨嚀椤曟粎绱掔拠鎻掞拷姝岀亱濠电偞鍨熼幊鐐哄炊椤掞拷鎯熼梺鍐叉惈閸婄敻骞忛搹鍦＝濞达絽澹婇崕鎰亜閹寸偟鎳囩�规洘娲栭埥澶娢熻箛鏇熷殌妞ゎ厹鍔嶉幆鏂库攽鐎ｎ亙绮ｉ梺璇插椤旀牠宕板☉銏╂晪鐟滄棃宕洪妷锕�绶為柟閭﹀墻濞煎﹪姊虹紒姗堣�挎繛浣冲嫭鍙忛柛顐ｆ礃閳锋帒霉閿濆懏鍟為柛鐔哄仱閺屾盯寮敓钘壝哄锟藉鏌ユ嚋閻㈡娴勯柣搴秵娴滅偤藝椤曪拷濮婅櫣绱掑Ο铏逛紘婵犳鍠撻崐婵嬪春濞戙垹绠ｉ柣娆忔噺鐎氬綊鎮峰▎蹇擃仾缂侊拷閿熻棄鈹戦悙鑼勾闁告柨閰ｅ顐︻敊鐏忔牗顫嶅┑鐐叉閸旀洖顕ｉ幐搴ｇ瘈闁汇垽娼у瓭闂佺顑呭Λ婵嬪箖閳╁啰闄勯柛娑橈功閸樺憡绻涙潏鍓хК妞ゎ偄顦悾宄扮暆閸曨剛鍘电紓浣割儏鐏忓懘寮ㄩ懡銈忔嫹閸偅绶查悗姘煎墴閹儳鈹戠�ｎ偅娅㈡繛瀵稿Т椤戝懎效閸欏绠鹃柟瀛樼懃閻忣亪鏌嶉柨瀣仼缂佽鲸甯為敓鏂ょ秵娴滄繈宕戦妷鈺傜厱婵炲棗绻愰鈺呮婢跺绡�濠电姴鍊搁弳鐔兼煕閳哄绉柡宀嬬到閳藉宕￠悙瀵镐粚缂傚倷鑳舵慨鐢告儎椤栨凹鍤曢柟缁㈠櫘閺佸倿鏌涘☉鍗炲季濞村吋鎹囧缁樻媴閻熼偊鍤嬬紓浣筋嚙閸婂綊銆冮妷鈺佺濞达絿顭堥崵鎴濃攽閻愭潙鐏熼柛銊︽そ閹繝寮撮悢绋垮伎濠殿喗顨呭Λ妤佹櫠閹殿喚纾煎璺侯儐閵囨繈鏌″畝瀣？濞寸媴濡囬幏鐘诲箵閹烘繃缍嗛梻鍌欐祰椤曟牠宕伴幘璇茬９婵犻潧妫涢弳锕傛煙閻戞ê鐏嶆俊鎻掔墛閹便劌螖閿熻棄螞閺冨倹顫曢柨鐕傛嫹" );
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

