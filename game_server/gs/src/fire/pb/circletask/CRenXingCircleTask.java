
package fire.pb.circletask;



import fire.pb.circletask.SpecialQuestState;
import fire.pb.fushi.FushiManager;
import fire.pb.npc.NpcServiceManager;
import fire.pb.npc.SNpcServiceMapping;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRenXingCircleTask__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRenXingCircleTask extends __CRenXingCircleTask__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		/*
		if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴楠炴﹢鎳犻澶嬓滈梻浣规偠閸斿秶鎹㈤崘顔嘉﹂柛鏇ㄥ灠閸愶拷濡炪倖鍔﹀锟界紒顔煎缁辨挻绗熸繝鍐伓濠电姰鍨煎▔娑㈩敄閸曨厽宕查柛鈩冪♁閻撳繘鏌涢锝囩畺闁革絾妞介弻娑㈡晲閸涱喛纭�缂備浇椴哥敮锟犲箖閳哄懏顥堟繛鎴炲笚閻庝即姊绘担鍛婃儓闁活剙銈稿畷浼村冀椤撶姴绁﹂梺绯曞墲閸戠懓危妤ｅ啯鈷戦柟绋挎捣閳藉绱掓径濠勭Ш鐎殿喖顭烽弫鎾绘偐閹绘帟锟藉灝顪冮妶鍡樺暗濠殿喚鍏樺鎶藉Χ閸涱亝鏂�濡炪倖姊婚妴瀣绩缂佹ü绻嗛柣鎰閻瑩鏌曢崱鏇狀槮閾绘牠鏌涘☉鍗炴灍婵炲懌鍨藉鐑樺濞嗘垵鍩岄梺娲诲墮閵堟悂骞嗗畝鍕缂備焦锚閿熺晫鏁婚弻锝夊閻樺啿鏆堟繛瀛樺殠閸婃繈寮婚悢椋庢殝闁哄瀵т簺婵＄偑鍊ら崑鍛崲閸儯锟戒礁螖娴ｅ摜绐為柣搴稻閹稿爼宕濋幋婵愭綎闁惧繗顫夊畷澶愭煏婵炲灝鍔滈柣蹇撴閳规垿鍩ラ崱妞剧盎闁诲孩鍑归崰姘跺礆閹烘梹瀚氱�瑰壊鍠栭幃鎴炵節閵忥絾纭鹃柨鏇畵閺佸秹鎮㈤崗灏栨嫽婵炴挻鑹惧ú銈嗘櫠椤斿墽纾煎璺侯煬閸ょ喓绱掗纰辩吋闁诡喒鏅濋幏鐘绘嚑椤掑鏅ｉ梻鍌欑濠�閬嶅煕閸儱鍌ㄥΔ锝呭暙閸屻劍绻濇繝鍌涘櫧缁惧墽鏅敓钘夌畭閸庡崬螞濞戞瑦娅犻柣銏犳啞閻撴盯鎮橀悙闈涗壕缂侊拷鐎ｎ剨鎷风憴鍕闁告鍥х厴闁硅揪绠戠粻娑欍亜閹剧绱￠柛銉ｅ妷閹疯櫣绱撻崒娆戝妽閽冮亶鎮樿箛鏇烆暭缂佺粯鐩幊鐘活敆閿熶粙寮稿☉姘炬嫹濞堝灝鏋涙い顓㈡敱娣囧﹪骞栨担鍝ュ幐闂佺鏈惌顔捐姳娴犲鈷掑ù锝勮閻掗箖鏌￠崼顐㈠缂侇喗鐟╅獮瀣晜缂佹ɑ娅嗛梻浣芥硶閸ｏ箓骞忛敓锟�? by changhao
		{
			boolean ok = fire.pb.fushi.DayPayManager.getInstance().CheckDayPayWithLevel(roleid);
			if (ok == false)
			{
				FushiManager.logger.error("CRenXingCircleTask: 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃缂侇噮鍨抽幑銏犫槈閵忕姷顓洪梺缁樺姇閻忔岸宕宠缁辨挻鎷呯粙娆炬殺闂佺顑冮崐婵嗩嚕鐠囨祴妲堥柕蹇曞閵婏负浜滈柡鍐ㄥ�哥敮鑸点亜椤愮喐娅囩紒杈ㄦ尰缁楃喐绻濋崘顭戜紦闂傚倷绀佹竟濠囧磻閸℃稑绐楅柟鎹愭硾婵剟鏌ㄩ悢鍓佺煓婵﹤顭峰畷鎺戭潩閸楃儐鏉哥紓鍌欑椤戝棛鏁敓鐘叉瀬鐎广儱顦猾宥夋煕椤愩倕鏋旈柛姗�绠栧娲传閸曞灚歇濠电偛顦板ú妯肩矉閹烘顫呴柕鍫濇閸橆亪姊虹化鏇炲⒉闁挎氨绱掑Δ浣哥瑲闁靛洤瀚伴、鏇㈡晲閸モ晝鏉介梻浣筋嚃閸犳鎮烽埡鍛拷浣肝旈崨顔芥婵炲濮撮鎰板极閸岀偞鐓曟い鎰剁稻缁�鍐煃闁垮绗掗棁澶愭煥濠靛棙宸濋柟钘夊�块弻娑㈠Χ閸涱厽娈婚梺鍝勬湰閻╊垶骞冮埡鍛疀濞达絽婀遍弶褰掓⒒娴ｇ瓔鍤冮柛鐘冲哺瀹曟顫滈敓钘夌暦濞差亝鏅搁柣妯诲絻缁愭稑顪冮妶鍡樺暗濠殿喚鍏樺鎶筋敃閿旇В鎷绘繛杈剧秬濞咃絿鏁☉銏＄厱闁靛ě鍐ㄤ粯闁捐崵鍋ら弻娑㈠即閵娿儱绠诲┑鈽嗗亽閸ㄦ娊骞夐幖浣哥睄闁割偅绻嗛幗鏇炩攽閻愭潙鐏嶉柟鍐叉喘閺佹捇寮妶鍥╂殼濡ょ姷鍋涢鍛村煘閹达箑鐐婇柍鐚存嫹缂侇喗宀稿濠氬磼濞嗘劗銈板┑鐐差槹濞茬喎鐣锋导鏉戠疀闁哄鐏濋崵鎴炵節閻㈤潧校闁肩懓澧界划濠氼敍閻愬鍙嗛梺缁樻礀閸婂湱锟芥熬鎷�");
				return;
			}
		}
		*/			
		
		SNpcServiceMapping conf = NpcServiceManager.getInstance().getServiceMappingByServiceID(serviceid);
		if(null == conf)
			return;
		final int userid = ((gnet.link.Dispatch) this.getContext()).userid;
		new RenXingCircleTaskProc(userid, roleid, conf.getParam1(), SpecialQuestState.DONE, moneytype).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 807451;

	public int getType() {
		return 807451;
	}

	public int serviceid; // 该服务id
	public int moneytype; // 货币类型

	public CRenXingCircleTask() {
	}

	public CRenXingCircleTask(int _serviceid_, int _moneytype_) {
		this.serviceid = _serviceid_;
		this.moneytype = _moneytype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(serviceid);
		_os_.marshal(moneytype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		serviceid = _os_.unmarshal_int();
		moneytype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRenXingCircleTask) {
			CRenXingCircleTask _o_ = (CRenXingCircleTask)_o1_;
			if (serviceid != _o_.serviceid) return false;
			if (moneytype != _o_.moneytype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += serviceid;
		_h_ += moneytype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(serviceid).append(",");
		_sb_.append(moneytype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRenXingCircleTask _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = serviceid - _o_.serviceid;
		if (0 != _c_) return _c_;
		_c_ = moneytype - _o_.moneytype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

