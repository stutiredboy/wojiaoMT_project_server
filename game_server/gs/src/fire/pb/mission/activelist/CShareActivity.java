
package fire.pb.mission.activelist;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CShareActivity__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CShareActivity extends __CShareActivity__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				RoleLiveness actrole = RoleLiveness.getRoleLiveness(roleid);
				if (actrole != null){
					if(activityid == RoleLiveness.SHARE)
						actrole.handleActiveLivenessData(RoleLiveness.SHARE);
					else if(activityid == RoleLiveness.SHARE2)
						actrole.handleActiveLivenessData(RoleLiveness.SHARE2);
					else {
						RoleLivenessManager.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽鐎ｎ亣鎽曢梺闈浥堥弲娑氱尵瀹ュ鐓曢悘鐐插⒔閻擃垰顭跨憴鍕婵﹥妞藉畷顐﹀礋椤掑锛佺紓鍌欑贰閸犳骞戦崶褜鍤曞┑鐘崇閺呮彃顭跨捄鐚存敾妞ゃ儲绻堝娲捶椤撗呭姼闁诲孩绋堥弲鐘茬暦娴兼潙绠涢柣妤�鐗冮幏铏圭磽閸屾瑧鍔嶆い顓炴川缁顫濋鐘殿啎婵犮垼娉涢鍥洪幘顔界厱闁冲搫鍟禒杈殽閻愬樊鍎旈柡浣稿暣閺佹捇鎮剧仦绛嬫婵犻潧鍊搁幉锟犳偂閵夆晜鐓涢柛鎰╁妽婢跺嫭銇勯妷銉Ч闁靛洤瀚粻娑㈠Ψ閿曪拷椤忥拷" + roleid + "]闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺岀喓绱掑Ο铏诡儌闂佽法鍠撻悺鏃堝矗閸愵煈娼栧┑鐘宠壘绾惧吋鎱ㄥΟ鍝勮埞妞ゃ倧鎷烽梻鍌欒兌椤牏鎹㈤幋锔藉殞濡わ絽鍟悡鈥愁熆鐠哄ソ锟犳偄婵傚鍙嗛梺鍛婃处閸擄箑螞閸愵喗鍊甸悷娆忓绾炬悂鏌涙惔锝嗘毈妤犵偞鍔栫换婵嬪礃閵娧呯嵁闂佽鍑界紞鍡樼濠靛鍊堕幖鎼線缁诲棝鏌ｉ幇鍏哥盎闁跨喕濮ら崹鍨暦閻熸噴娲敂閸岋附瀚归柛鎰靛枛楠炪垺绻涢幋鐑嗙劷妞ゆ柨妫濆娲川婵犲嫧妾ㄥ┑鐐插悑閻燂妇锟介潧銈搁幃鈺冪磼濡厧甯惧┑鐘灱椤曟牠宕规导鏉戠疇閹艰揪绲块惌鍫ユ煥閺囩偛锟藉綊鍩涢幒妤佺厱閻忕偞宕樻竟姗�鏌ㄩ悢鍓佺煓妞ゃ儲鎸鹃崚鎺楀醇閻旇櫣鎳濋梺璺ㄥ枍缁瑩鎮伴钘夌窞闁归偊鍓涙导瀣煟閳╁啫绗傞柣鎺炵畱椤啯绂掔�ｎ亝鐎梺鍛婂姦閸犳牜澹曢崗鍏煎弿婵妫楁晶顔济瑰鍡樼【闁宠鍨块幃娆忣啅椤斿吋顔嶅┑鐘愁問閸犳骞愰幎濮愶拷渚�寮介鐐茬獩濡炪倖鐗楅崙鐟拔涘鍫熷仭婵犲﹤鎳庨。濂告偨椤栨侗娈滈柟顕嗙節閹垽宕楅懖鈺佸箥闂傚倷绶￠崣蹇曠不閹达箑鍑犳繛鎴欏灪閻撴洟鏌￠崒娑卞劌闁稿孩妫冮弻鈥崇暆鐎ｎ剛袦濡ょ姷鍋為…鍥晸閼恒儳鈾佹い顓炴喘钘濆ù鐓庣摠閳锋垿鏌涘┑鍡楊伀闁诲繘浜堕弻娑㈡偐瀹曞洤鈷屽Δ鐘靛仜閸燁偊鈥﹂妸鈺佺闁告挆鍐╃亪闂佸湱鍘х紞濠囧蓟閸涱厸妲堟繛鍡樕戦弲锝呪攽閻樻鏆滅紒杈ㄦ礋瀹曟垿骞嬮敃锟界壕褰掓煙鏉堝墽鐣辩痪鎯ф健閺岋紕浠︾拠鎻掑闂佺顑戠换婵嬪蓟瀹ュ棙濮滈柟娈垮枦缁愭鈹戦悙鎻掓倯闁绘绮庡Σ鎰板箻鐎涙ê顎撻柣鐘叉祫缁辨洟宕濇搴ｇ＝濞达絽鎼埢鍫㈢磼閻樺磭澧电�殿喖顭烽弫鎰緞婵犲嫮鏉搁梻鍌氬�搁悧濠勭矙閹达讣缍栨い蹇撶墛閳锋垹绱撴担璇＄劷缂佺姵鐗楁穱濠囶敃閵忕姵娈婚悗娈垮枛椤兘寮幇顓炵窞濠电姴瀚烽崯瀣⒒娴ｅ憡鍟炴い銊ョ墦瀹曟洟骞嬮敃锟界粻顖滐拷鐟板婢瑰寮ㄦ禒瀣�甸柨婵嗙凹缁ㄤ粙鏌ｉ敐鍡樸仢闁诡喖鍢查…銊╁川椤撗勬瘔闂佹眹鍩勯崹杈╂暜閿熺姴绠栨繛鍡樺姉缁★拷闂佹悶鍎崝搴ㄥ储椤忓懐绡�闁汇垽娼ф禒婊堟煟韫囨梻绠炵�规洘绻堟俊鍫曞炊閳哄喛绱插┑鐐舵彧缁蹭粙骞栭锕�鍌ㄩ柟缁㈠枟閻撴瑦銇勯弮锟界�笛呮兜閻愵兙浜滄い鎰剁悼缁犵偟锟借娲╃换婵嬪箖濞嗗緷鍦拷锝庡亜椤忥拷" + activityid + "]濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃缂侇噮鍨抽幑銏犫槈閵忕姷顓洪梺缁樺姇閻忔岸宕宠缁辨挻鎷呯粙娆炬殺闂佺顑冮崐婵嗩嚕鐠囨祴妲堥柕蹇曞閵婏负浜滈柡鍐ㄥ�哥敮鑸点亜椤愮喐娅囩紒杈ㄦ尰缁楃喐绻濋崘顭戜紦闂傚倷绀佹竟濠囧磻閸℃稑绐楅柟鎹愭硾婵剟鏌ㄩ悢鍓佺煓婵﹤顭峰畷鎺戭潩閸楃儐鏉哥紓鍌欑椤戝棛鏁敓鐘叉瀬鐎广儱顦猾宥夋煕椤愩倕鏋旈柛姗�绠栧娲传閸曞灚歇濠电偛顦板ú妯肩矉閹烘顫呴柕鍫濇閸橆亪姊虹化鏇炲⒉闁挎氨绱掑Δ浣哥瑲闁靛洤瀚伴、鏇㈡晲閸モ晝鏉介梻浣筋嚃閸犳鎮烽埡鍛拷浣肝旈崨顔芥婵炲濮撮鎰板极閸岀偞鐓曟い鎰剁稻缁�鍐煃闁垮绗掗棁澶愭煥濠靛棙鍣洪柛鐔哄仱閺岀喖顢涘鍗炩叺闂佸搫琚崐鏇犲弲闁荤姴娲╃亸娆愮閹间焦鈷戦弶鐐村椤︼箓鏌涢悢椋庢憼濞ｅ洤锕幊婊堟濞戞氨鐛繝纰樻閸ㄥ磭鍒掗姘ｆ瀺鐎广儱鎳夐弨浠嬫煟濡偐甯涙繛鎳峰洦鐓曞┑鐘插亞閻撳ジ鏌嶉妷顖滅暤鐎规洖銈告俊鐑芥晝閿熶粙鏁撻挊澶婃Щ闁宠鍨块幃鈺呭矗婢跺妲遍梻浣虹帛閹告悂宕幘顔艰摕婵炴垶菤閺�浠嬫煕閳╁喚娈㈠ù鐘层偢濮婅櫣鎹勯妸銉︾亞濠碘槅鍋勭�氫即鍨鹃敃鍌涘�婚柦妯侯槹閻庮剟姊虹憴鍕姢濠⒀冨閵囨瑩骞庨懞銉ワ拷鐢告煥濠靛棛鍑圭紒銊ㄥ吹缁辨帡顢曢姀鈶裤垽鏌嶇憴鍕伌妞ゃ垺鐟у☉鐢告煥鐎ｎ偅姣庡┑鐘殿暜缁辨洟宕戝Ο鐓庡灊婵炲棙鎸婚崑妯汇亜閺囶亝瀚瑰Δ鐘靛仜濞差參銆佸锟介幃銏犵暋閺夎銈夋⒒閸屾瑧鍔嶉悗绗涘懏宕查柛宀�鍋涚壕鍦喐閻楀牆绗氶柡鍜佸墮椤法鎹勯搹鍦紘缂佹儳褰炵划娆撳蓟濞戞矮娌柛鎾楀嫬娅樼紓鍌欑劍缁嬫垹鎹㈠锟藉濠氭偄妞嬪孩娈濋梺鍝勵槹鐎笛傜昂闂傚倸鍊稿ú銈壦囬悽绋胯摕闁靛鍎弨浠嬫煕閳╁啰鎳冩い銈忔嫹濠碉紕鍋戦崐鏇犳崲閹烘挻鍙忓瀣椤洟鏌熼悜姗嗘畷闁哄懏鎮傞弻銈夊箒閹烘垵濮㈢紓浣叉閹风兘姊绘担瑙勫仩闁稿寒鍨跺畷婵嗙暆閸曨剚娅㈤梺浼欑到閺堫剟寮抽鍕厸閻忕偠顕ф俊濂告煃鐟欏嫬鐏寸�规洖宕埥澶愬箟鐎ｎ偄顏跺┑掳鍊曢幊蹇涙偂濞戙垺鍊甸柨婵嗛娴滅偤鏌曢崱妯虹缂佽鲸甯楀蹇涘Ω閵夛箒鐧侀梻浣芥〃閻掞箓骞愰懡銈囩焿闁圭儤妫戦幏鐑芥晲鎼存繄鐩庨梺鍏兼緲閻忔繈鍩為幋锔藉�烽柡澶嬪灩娴犳悂姊洪懡銈呮殌闁搞儜鍐ㄤ憾闂傚倷绶￠崜娆戠矓閻㈢鐓曢柟杈鹃檮閻撴盯鏌涚仦涔咁亪宕濆鍕闁告侗鍘介崵鍥煛鐏炲墽娲撮柟顔哄�栭幏鍛村传閵夈倕瀵茬紓鍌氬�风欢锟犲窗閺嶎厽鍋嬮煫鍥ㄧ♁閺呮悂鏌￠崒妯猴拷妤冪矓閻㈠憡鐓曢柣妯诲墯濞堟粓鏌熼鍡欑瘈闁诡喓鍨藉畷妤呮嚃閳轰礁绠ラ梻鍌欑婢瑰﹪鎮￠崼銉ョ獥闁哄稁鍙庨弫鍌涖亜韫囨挾澧涢柛濠傜仛閹便劌螣閻撳簼澹曢柣搴㈢啲閹凤拷1濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愰崨鍌滃枛瀹曨偊宕熼锟介敓钘夐叄濮婅櫣绱掑Ο铏圭懆闂佹寧娲忛崕鍨繆閻㈢绀嬫い鏂垮⒔閺夋悂姊虹憴鍕婵炲鐩崺娑㈠醇閵夛腹鎷洪柡澶屽仦婢瑰棝藝閿斿浜滈柟瀛樼箖閸犳ɑ顨ラ悙宸█鐎规洏鍔嶇换婵嬪礃閵娿儱韦闂傚倷绶氬褔鈥﹂崼銉ョ？闁规儼濮ら崑顏堟煕閺囥劌鐏￠柍閿嬪灴濮婂宕奸悢宄扮闂佸壊鍋侀崕閬嶆偪閻愵剛绠鹃柟瀛樼懃閻忣亪鏌涚�ｎ亜锟藉湱鎹㈠☉銏犵婵炲棗绻掓禒楣冩⒑缂佹ɑ灏版繛鑼枛楠炲啫顫滈敓浠嬪箖濞嗘挻顥堟繛鎴烆殔椤ユ岸姊绘担鍦菇闁告柨绉瑰畷褰掑捶椤撶噥娼熼梺鍦劋椤ㄥ懐绮诲☉娆嶄簻闁哄啫鐗婇敍鐔镐繆閸欏濮囬柍瑙勫灴椤㈡瑧娑甸柨瀣毎婵犵绱曢崑鐘参涢崟顖涘仼闁绘垼妫勬儫闂佹寧鏌ㄦ晶浠嬫儊閸儲鈷戦柛娑橈工婵箓鏌ｉ幘宕囧閸楅亶姊洪锟界粔鐢稿煕閹烘嚚褰掓晲閸涱喖鏆堥梺鍝ュ枔閸嬨倝骞嗛崶銊ョ窞鐎癸拷閿熺晫澹曢崗绗轰簻闁哄啫鍊瑰▍鏇㈡煙閸愭彃鏆ｉ柡宀嬬秮閺佹劙宕惰楠炲螖閻橀潧浠滄繛宸弮楠炲啳顦圭�规洖銈搁幃銏ゅ礈闊厽鍩涢梻鍌氬�搁崐宄懊归崶褉鏋栭柡鍥ュ灩闂傤垶鏌ㄩ弴鐐诧拷鍝ョ不椤栫偞鐓ラ柣鏇炲�圭�氾拷.");
						if(activityid > 0)
							actrole.handleActiveLivenessData(activityid);
					}
				}
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805489;

	public int getType() {
		return 805489;
	}

	public int activityid;

	public CShareActivity() {
	}

	public CShareActivity(int _activityid_) {
		this.activityid = _activityid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(activityid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		activityid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CShareActivity) {
			CShareActivity _o_ = (CShareActivity)_o1_;
			if (activityid != _o_.activityid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += activityid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(activityid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CShareActivity _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = activityid - _o_.activityid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

