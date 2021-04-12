
package fire.pb.npc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqQuestion__ extends mkio.Protocol { }

/** 向NPC请求问题
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqQuestion extends __CReqQuestion__ {
	@Override
	protected void process() {
		// protocol handle
		final long	roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (!validate(roleid)) {
			return;
		}
//		final fire.pb.mission.schoolanswerques.PReqQuestion pReq=new fire.pb.mission.schoolanswerques.PReqQuestion(npckey, roleid);
//		pReq.submit();
	}
	protected boolean validate(long roleid) {

		if (roleid < 0)
			return false;
//		if (xtable.Properties.select(roleid).getLevel() < 10)
//			return false;
		// TODO:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙绀冩い鏇嗗洤鐓橀柟杈鹃檮閸嬫劙鏌涘▎蹇ｆЧ闁诡喗鐟х槐鎾存媴閸濆嫷锟藉矂鏌涢妸銉у煟鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍蓟閸ヮ剚鏅濋柨鐔剁矙瀹曟繈骞掗幘鍓侇啎閻庣懓澹婇崰鏇犺姳閼姐倗纾奸柣娆忔噽缁夘噣鏌″畝瀣埌閾伙綁鏌涜箛鎾虫倯婵絽瀚板铏圭磼濡櫣鐟ㄩ梺鍛婅壘椤戝洭骞戦姀鐘闁靛繒濮烽鎺楁煟鎼达絾鏆╂い顓炵墦瀵娊鏁撻悩鏂ユ嫼闂侀潻瀵岄崢濂稿储鐎涙ǜ浜滈柕澶涢檮瀹曞矂鏌℃担瑙勫磳鐎规洘鍔欓幃銈嗘媴閸︻厾啸濠电姷鏁搁崑娑橆嚕閸撲焦宕查柛顐犲劜閺呮煡鏌ｉ幇顓熺稇缂佸墎鍋熼敓鐣屾閹风兘鏌ㄩ悢鍓佺煓闁诡垰鏈鍕箛椤撶姴骞嶉梻浣虹帛閸ㄦ儼鎽銈冨劜閻楃娀寮婚悢鍓叉Ч閹肩补锟藉啿绠ｉ梻浣芥〃閻掞箓宕濋弽顓炵畾闁哄倸绨遍弨浠嬫煕椤愶絿绠撴慨锝呯墕閳规垿鏁嶉崟顐℃澀闂佺锕ラ崹鍨暦閺囥垺鍤戞い鎺嶇鎼村﹪姊虹粙璺ㄧ伇闁稿鍔欓弫鎾绘嚍閵夛富妫冮悗瑙勬礃閿曘垽銆佸▎鎾冲簥濠㈣鍨板ú锕傛偂閺囥垺鐓冮柍杞扮楠炴ɑ銇勮箛鎾跺婵懓寮舵穱濠囧Χ閸曨喖鍘＄紓浣叉閹烽攱绻濋悽闈涗粶闁绘妫濋幃妯衡攽鐎ｎ亜鍤戝┑鐐村灦閻燂絾绂嶅鍫熺厸闁搞儯鍎辨俊鑲╋拷娈垮櫘閸犳銆冮妷鈺傚�烽柤纰卞墰椤旀垿姊洪棃娑欏闁告梹鐟╅悰顕�骞掑Δ锟界粻濠氭煕韫囨挻鍣介柣鈺侀叄濮婂宕掑▎鎺戝帯濡炪値鍘奸悧蹇涘箲閵忋倕绠虫俊銈忔嫹闁稿被鍔庨幉鎼佸籍閸繃鐎梺鐟板⒔缁垶宕戦埡鍛�堕柣鎰版涧娴滅偓鎱ㄩ敐鍛伃婵﹤鎼晥闁搞儜鍐ㄐゅ┑鐐茬摠缁姵绂嶉鍫澪ュù锝呭濞笺劑鏌ㄩ悢鍓佺煓妤犵偛鍟埢搴ㄥ箻瀹曞洭鐛撻梻浣烘嚀椤曨參宕曢幇顓狀浄妞ゆ挾濮风壕浠嬫煕鐏炲墽鎳嗛柛蹇撶焸閺屟嗙疀閹捐寮伴悗瑙勬穿缂嶄礁鐣峰锟介、鏃堝幢閺囩姷鎲归梻鍌欑閹碱偆绮欐笟锟藉畷銏＄附閸涘﹤鐝旈梺缁樻煥閸氬鎮￠悢鍏肩厸闁稿本姘ㄦ禒銏°亜閵夈儳绠插ǎ鍥э躬楠炴捇骞掗弮鍌傘劌螖閻橀潧浠﹂柣妤佹礉瑜颁礁顪冮妶鍡楅嚋闁归鍏橀弻锝堢疀閿濆懏鐝濋梺鍝勭焿缁绘繂鐣烽崡鐑嗘建闁糕剝顨呴～鍧堥梻鍌氬�搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚圭憸鐗堝笒绾惧潡鏌熺�电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑樻⒒绾惧ジ鏌ㄩ悢璇残撶�垫澘瀚悾婵堬拷锝庡亜椤忓爼姊虹拫搴″暞閸熺偤鎮楀顒傜Ш婵﹨娅ｉ幑鍕Ω閵夛妇锟借櫣绱撴笟鍥ф灍闁荤啿鏅涢锝夘敃閿曪拷缁犺崵绱撴担濮戭亜鈻撻悢鍏尖拺闂傚牊渚楀Σ鍫曟煕鎼粹�宠埞鐞氭瑩鏌涢銈呮灁缂佺娀绠栭幃妤�鈽夊▎妯煎姺闂佹椿鍘奸惌鍌炲蓟濞戞熬鎷烽敐搴″闁哄閰ｅ畷锟犳焼瀹ュ棛鍘甸梺瑙勵問閸犳牠銆傛總鍛婄厱濠电姴瀚崢鎾煛鐏炲墽鈽夐柍瑙勫灴瀹曞崬螖婵犱焦鍋呯紓鍌氬�烽悞锕傚礉閺嶎偆鐭欓柟杈捐吂閿熻姤妫冨畷姗�顢欓崲澹洦鐓曢柍鈺佸暟閹冲啯銇勯搴℃噽绾捐棄銆掑顒佹悙闁哄鐩铏规暜椤斿墽袦閻庢鍣崑鍕敇閸忕厧绶為悗锝庝悍閹烽攱顦版惔顖涘闁荤喐婢橀ˉ蹇涙煕閻樻剚娈橀柨鐔剁矙濞佳囨儗閸屾凹娼栨繛宸簼椤ュ牊绻涢幋鐐跺妞わ絽鎼埞鎴﹀煡閸℃ぞ绨奸梺鑽ゅ暱閺呯姴鐣烽崫鍕ㄦ闁靛繒濮烽濠傗攽鎺抽崐鎾绘嚄閸洖鍌ㄩ柛妤冨亹閺�浠嬫煃閽樺顥滈柣蹇ョ到閳规垿顢欓懞銉х▏闁捐崵鍋ら獮鏍庨锟介悘顔姐亜閳哄嫬鐨洪柟鍙夋倐閹囧醇濠靛牏鎳栭梻浣虹帛閹搁箖宕伴幇顓犫攳濠电姴娴傞弫宥嗘叏濮楀棗澧柛濠庡灦濮婃椽宕崟顒夋闂佸搫鎳忕换鍫ュ箚閿熻姤銇勮箛鎾跺缂佺姵姘ㄩ幉绋款吋婢跺﹦鐣洪梺纭呮彧闂勫嫰鎮¤箛娑欑厱闁靛鍨甸崰姘閸愵喗鍊垫繛鍫濈仢閺嬫瑧绱掗鐣屾噭濞ｅ洤锕ら～銏犵暆婵犲唭顒佷繆閻愵亜锟芥牠骞愰幖浣肝х紒瀣儥濞兼牗绻涘顔荤盎缂佺姴缍婇弻锝夊箛椤栵絽娈濋梺褰掝棑閸忔ê顕ｆ禒瀣垫晣闁绘棁娓归悽濠氭⒒娴ｇ鏆遍柟纰卞亰楠炲﹥鎯旈妸锕�鐝旈梺缁樻煥閸氬鎮￠悢鍏肩厸闁告劑鍔岄敓鐣屾暬楠炲繘鏁撻悩宕囧幐婵炶揪缍佸濠氱叕椤掑嫭鐓涢悘鐐靛亾缁�鍐磼缂佹娲寸�规洖缍婇、娆撴偂鎼搭喗娓愬┑鐘垫暩婵即宕归悡搴樻灃婵炴垶鐔幏宄邦潩椤愩垹绁悗娈垮枛椤兘寮幘缁樺亹闁告瑥顦禒銏ゆ⒒娴ｅ憡鍟為柛鏂跨箻瀵彃鈽夐姀鈺傛櫆闂佽法鍣﹂幏锟�?
		
		
		return true;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795439;

	public int getType() {
		return 795439;
	}

	public long npckey; // npckey为npc的唯一ID

	public CReqQuestion() {
	}

	public CReqQuestion(long _npckey_) {
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		if (npckey < 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqQuestion) {
			CReqQuestion _o_ = (CReqQuestion)_o1_;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqQuestion _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

