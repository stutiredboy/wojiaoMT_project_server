
package fire.pb;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqHelpCountView__ extends mkio.Protocol { }

/** 客户端请求援助统计面板
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqHelpCountView extends __CReqHelpCountView__ {
	@Override
	protected void process() {
		// protocol handle
		long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		SReqHelpCountView sReqHelpCountView=new SReqHelpCountView();
		xbean.helpcount helpcount=xtable.Helpcount.select(roleid);
		if(helpcount!=null){
			sReqHelpCountView.expvalue=helpcount.getExpvalue();//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂傚洤顦甸弻銊モ攽閸℃ɑ鎮欓梺鍛婃煥椤戝洭鏁撻崐鐕佹綈婵炲弶鐗曢锝夊醇閺囩偟鐤勯梺闈涱焾閸庢瑩寮崒锔藉闁挎繂楠告禍婊勩亜韫囨挾鍩ｆ慨濠勭帛閹峰懐绮电�ｎ亝鐣伴梻浣告憸婵潧煤閻旈鏆﹂柨鐔哄Т缁狀噣鏌﹀Ο渚Ч闁诲寒鍓熷娲偡閺夊簱鎸冪紓渚囧櫘閸ㄨ泛顕ｉ弻銉ョ濞达絽婀遍崣鍡涙⒑缂佹ɑ绀�闁稿﹤婀遍敓鑺ョ啲閹凤拷
			sReqHelpCountView.shengwangvalue=helpcount.getShengwangvalue();//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉潡寮婚敐澶嬪亜鐎瑰嫭澹嗛惄搴ㄦ⒑閸忓吋绶叉繛灏栵拷鎰佸殨闁割偅娲栭柋鍥ㄧ箾閹寸伝顏堚�栨径濞炬斀闁绘劕寮堕崳钘夆攽椤旇偐浠涚紒宀冮哺缁绘繈宕堕‖顑洨鍙撻柛銉ｅ妽閻撱儲銇勮箛鎾跺煟婵﹦绮幏鍛存偡闁箑娈濇繝鐢靛仦瑜板啰鎹㈠Ο铏规殾閻熸瑥瀚々鐑芥倵閿濆簼绨奸柣搴墴濮婃椽鎮烽弶搴撴寖缂備緡鍣崹璺侯嚕閺屻儱绠瑰ù锝呮贡閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷
			sReqHelpCountView.factionvalue=helpcount.getClanvalue();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷褰掑磿閹寸姵鍠愰柣妤�鐗嗙粭鎺楁煛閸曗晛鍔﹂柡灞剧洴瀵挳濡搁妷褌鍝楅梻浣规偠閸斿矂宕愰幖浣哥厴闁硅揪绠戠壕鍏肩節婵犲倹鎹ｉ柛鏂挎憸缁辨挻鎷呴悷鏉款潔濡炪們鍔屽Λ娑㈠箲閵忕姭妲堥柕蹇曞Х椤撴椽姊虹紒妯哄妞ゆ梹鐗犲鎶芥晸閻樻枼鎷虹紓浣割儓濞夋洜绮婚懠顒傜＜妞ゆ棁濮ゅ畷宀�锟芥鍠栭…閿嬩繆閹间礁鐓涢柛灞剧煯缁ㄤ粙姊绘担渚劸闁哄牜鍓涚划娆撳箣閿旂粯鏅滈梺璺ㄥ櫐閹凤拷
			sReqHelpCountView.helpgiveitemnum=helpcount.getHelpgiveitemnum();
			sReqHelpCountView.helpitemnum=helpcount.getHelpitemnum();
		}
		sReqHelpCountView.expvaluemax=fire.pb.HelpCountManage.getInstance().getExpValueMax(roleid);//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂傚洤顦甸弻銊モ攽閸℃ɑ鎮欓梺鍛婃煥椤戝洭鏁撻崐鐕佹綈婵炲弶鐗曢锝夊醇閺囩偟鐤勯梺闈涱焾閸庢瑩寮崒锔藉闁挎繂楠告禍婊勩亜韫囨挾鍩ｆ慨濠勭帛閹峰懐绮电�ｎ亝鐣伴梻浣告憸婵敻銆冮崨绮癸拷锕傚垂椤曞懏寤洪梺璺ㄥ枍缁瑥鐣峰ú顏勵潊闁斥晛鍟崝鍛存⒑闂堟侗鐒鹃柛搴㈠▕椤㈡瑩骞掑Δ浣叉嫼闂佸憡绋戦敃銈嗘叏瀹�鍕�堕煫鍥ㄦ⒒閹冲棝鏌曢崶銊ュ闁轰焦鎹囬弫鎾绘晸閿燂拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉骞夐幖浣瑰亱闁割偅绻勯悷鏌ユ⒑缁嬫鍎忔い锔炬暬瀵寮撮敍鍕澑闁诲函缍嗘禍鐑藉箯閻戣棄鍐�妞ゆ挾鍋熼弻褔姊鸿ぐ鎺擄紵闁绘帪绠撻幃锟犲Ψ閳哄倻鍘介梺鍝勬川閸嬫盯鏁撻挊澶嬭础闁跨喕濮ら悢顒勫箯閿燂拷?缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸ゅ嫰鏌涢锝嗙闁诡垳鍋ら獮鏍庨锟芥俊濂告煟椤撶噥娈滈柡灞剧洴楠炲洭妫冨☉娆愮暯濠电姰鍨奸崺鏍礉閺囩姷涓嶅┑鐘崇閻撴洟鏌熼幑鎰敿闁稿繐鐭傞弻锝夊箳閹存瑥浠┑顔硷攻濡炶棄鐣烽妸锔剧瘈闁告劦鐓堝Σ閬嶆⒒娴ｄ警鐒鹃柨鏇樺劦楠炴劖绻濆顒傜暰闂佸搫鍟悧鍡樺劔闂備線娼ч敍蹇涘礃閹稿骸顏堕梺缁樺姉閸庛倝鎮￠悢鍏肩厽婵☆垳鍘ч崝瀣亜韫囨洖鈻堥柡灞剧♁閹柨鈽夊鍫熷婵犻潧顑呯粻鏍ㄤ繆椤栨瑨顒熼柛姘儏椤法鎹勬笟顖氬壃闂佸綊鏀卞浠嬪蓟閳╁啫绶為悘鐐村灊濞岊亝绻濋姀銏″殌婵☆偅绻嗗Λ鐔兼⒑閹稿孩绀�闁稿﹤缍婇幃锟犲即閻旂寮垮┑顔筋殔濡鏅舵繝姘厱閹兼番鍨归悘鈺冪磼鏉堛劌娴い銏＄懇閹墽浠﹂幆褎鐝梺璇查閻忔艾顭垮Ο纭锋嫹濮樼厧娅嶉柡浣规崌瀵剟濡堕崶鈹垮仭闂備礁鎲￠弻銊╁嫉椤掑倻鐭夌�广儱妫楅閬嶆倵濞戞姘跺箯濞差亝鈷戦柛娑橈攻瀹曞嫰鎮樿箛鏃傛噰鐎规洏鍨归埥澶愬閿涘嫬骞堥梻浣虹帛閿氶柛鐔锋健瀹曨偊鎮滃Ο闀愮盎闂侀潧楠忕槐鏇㈠箠閸モ晪鎷风憴鍕鐎规洦鍓熼崺銉﹀緞婵炵偓鐎婚棅顐㈡储閸庤尙锟芥艾缍婇弻锝夊閻樺啿鏆堥梺缁樻尵閸犳牠寮婚弴锛勭杸閻庯綆浜烽幏鐑藉冀瑜夊Σ鍫㈡喐鎼淬劌桅闁告洦鍨遍弲鏌ユ煕濞戝崬骞楅柛濠庡灦濮婃椽妫冨☉娆愭倷闁诲孩姘ㄦ晶妤佺┍婵犲洤绠瑰ù锝堝�介妸褎鍠愮�广儱顦悞濠氭⒑椤掞拷缁夌敻鍩涢幋锔界厱婵炴垶锕銉х磼濡や礁鍝洪柟顔荤矙椤㈡盯濡堕崶鈺冩闁诲氦顫夊ú妯侯渻閽樺鏆﹂柣鏃傗拡閺佸秵鎱ㄥ锟界涵绋课ｆ导瀛樷拻濞达綀娅ｇ敮娑㈡煕閺冩挾鐣电�规洘绮撻弫鍐磼濮樿鲸鐒鹃柣搴＄畭閸庨亶藝娴煎瓨鍋傞柣鏃傚帶缁犲綊寮堕崼婵嗏挃缂佸绮妵鍕疀閺囩偞鐏堥梺鍝勭灱閸犳劙藝閻楀牊鍎熼柍銉ュ暱缁狅綁姊绘担鍛婃儓閻炴凹鍋婂畷婵嬪箣閿曪拷缁犳牠鏌曡箛瀣伄缁炬儳鍚嬮幈銊ノ旈敓钘壩涘▎鎾嶅寰勯幇顓涙嫽婵炶揪绲介幗婊堟晬瀹ュ洨纾兼い鏇炴噹閻忥附顨ラ悙鏉戠伌鐎规洖鐖奸、妤呭磼濮樹究鍋婇梻浣筋嚙閸戠晫绱為崱妯碱洸闁哄稁鍘肩紒鈺伱归悩宸剱闁绘挻娲熼弻鐔兼嚋椤掞拷婵¤姤绻涢崨顓熷枠闁哄被鍔戦幃銏㈢磼濮楀棙顥夋俊鐐�ら崢濂稿床閺屻儻缍栭煫鍥ㄦ媼濞差亶鏁傞柛鏇ㄥ墻濡喖姊绘笟锟藉褔篓閿熶粙姊婚崟顐㈩伃闁诡喚鏁诲顕�宕奸悢鍙夊闂備礁鎲＄缓鍧楀磿閸楃偐鏋嶉煫鍥ㄧ♁閻撴洟鏌曟繛鍨拷鏇炵暤閸℃稒鐓曢柍鐟扮仢閻忓弶顨ラ悙鎼劷闁归濞�瀵濡烽妷锔芥瘑闂傚倸鍊风粈渚�骞栭鈷氭椽濡搁埡浣虹崶闂佽宕橀褔鎯屽Δ鍛厱闁斥晛鍟伴埦渚�鏌嶉柨瀣伌闁诡喖缍婇獮渚�骞掗幋婵愮�虫繝鐢靛仜閹冲繘宕濆▎鎾宠摕闁绘梻鍘х粈鍕煏閸繃顥滄い蹇ユ嫹?
		sReqHelpCountView.shengwangvaluemax=fire.pb.HelpCountManage.getInstance().getShengWangValueMax(roleid);//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉潡寮婚敐澶嬪亜鐎瑰嫭澹嗛惄搴ㄦ⒑閸忓吋绶叉繛灏栵拷鎰佸殨闁割偅娲栭柋鍥ㄧ箾閹寸伝顏堚�栨径濞炬斀闁绘劕寮堕崳钘夆攽椤旇偐浠涚紒宀冮哺缁绘繈宕堕‖顑洨鍙撻柛銉ｅ妽閻撱儲銇勮箛鎾跺煟婵﹦绮幏鍛存偡闁箑娈濇繝鐢靛仦瑜板啰鎹㈠Ο铏规殾缁绢厼鎳屾禍褰掓煙閸濆嫭锛旈柟椋庡厴閺佸啴宕掑В灏栨櫊閺屽秵娼幍顔剧崲闂佸摜鍋犲▔娑㈠煘閹达附鍋愮紓浣股戦柨顓炩攽閳藉棗浜濈紒瀣墵婵＄敻骞囬悧鍫熸闂佽法鍣﹂幏锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉骞夐幖浣瑰亱闁割偅绻勯悷鏌ユ⒑缁嬫鍎忔い锔炬暬瀵寮撮敍鍕澑闁诲函缍嗘禍鐑藉箯閻戣棄鍐�妞ゆ挾鍋熼弻褔姊鸿ぐ鎺擄紵闁绘帪绠撻幃锟犲Ψ閳哄倻鍘介梺鍝勬川閸嬫盯鏁撻挊澶嬭础闁跨喕濮ら悢顒勫箯閿燂拷??
		sReqHelpCountView.factionvaluemax=fire.pb.HelpCountManage.getInstance().getClanValueMax(roleid);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷褰掑磿閹寸姵鍠愰柣妤�鐗嗙粭鎺楁煛閸曗晛鍔﹂柡灞剧洴瀵挳濡搁妷褌鍝楅梻浣规偠閸斿矂宕愰幖浣哥厴闁硅揪绠戠壕鍏肩節婵犲倹鎹ｉ柛鏂挎憸缁辨挻鎷呴悷鏉款潔濡炪們鍔屽Λ娑㈠箲閵忕姭妲堥柕蹇曞Х椤撴椽姊虹紒妯哄妞ゆ梹鐗犲鎶芥晸閻樻枼鎷虹紓浣割儓濞夋洜绮婚懠顒傜＜妞ゆ棁濮ゅ畷宀�锟芥鍠栭…閿嬩繆閹间礁鐓涢柛灞剧煯缁ㄥ姊绘担鍛婂暈闁瑰摜鍏橀幊妤呭醇閺囩喎浜楅梺鐟板⒔缁垶鍩涢幋锔界厱婵犻潧妫楅顐︽煟閹烘洘纭剁紒杈ㄥ笧缁辨帒螣閼测晝鏉介柣搴㈩問閸ｎ噣宕戞繝鍥╁祦婵☆垵鍋愮壕鍏间繆椤栨粎甯涙い蹇曞枛濮婄粯鎷呴懞銉с�婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉骞夐幖浣瑰亱闁割偅绻勯悷鏌ユ⒑缁嬫鍎忔い锔炬暬瀵寮撮敍鍕澑闁诲函缍嗘禍鐑藉箯閻戣棄鍐�妞ゆ挾鍋熼弻褔姊鸿ぐ鎺擄紵闁绘帪绠撻幃锟犲Ψ閳哄倻鍘介梺鍝勬川閸嬫盯鏁撻挊澶嬭础闁跨喕濮ら悢顒勫箯閿燂拷??
		sReqHelpCountView.helpgiveitemnummax=fire.pb.HelpCountManage.getInstance().getHelpGiveItemNumMax(roleid);
		sReqHelpCountView.helpitemnummax=fire.pb.HelpCountManage.getInstance().getHelpItemNumMax(roleid);
		
		gnet.link.Onlines.getInstance().send(roleid, sReqHelpCountView);
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786532;

	public int getType() {
		return 786532;
	}


	public CReqHelpCountView() {
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
		if (_o1_ instanceof CReqHelpCountView) {
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

	public int compareTo(CReqHelpCountView _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

