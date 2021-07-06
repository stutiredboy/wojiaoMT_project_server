
package fire.pb.skill;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CUpdateInborn__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CUpdateInborn extends __CUpdateInborn__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleId <= 0)
			return;
		final int apId = this.id;
		if(apId <= 0) return;
		if(flag == 0){
			new mkdb.Procedure(){
				@Override
				protected boolean process(){
					SkillRole srole = new SkillRole(roleId);
					srole.updateInbornWithValid(apId);
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ剙浠遍柟顔ㄥ洦鍋愭慨鐟版祫閹烽攱绗熼敓钘夘嚕閹绢喖顫呴柣姗�娼ч獮鍫熺節濞堝灝鏋熼柨鏇楁櫊瀹曘垺绂掔�ｎ�附绻濋棃娑欘棏闁猴拷娴犲鈷旈柛銉墮閺勩儵鏌″畵顔艰嫰濞堫偊姊洪崨濠冨闁告瑥绻橀獮蹇涙倻閼恒儲娅滈柟鐓庣摠缁诲嫰鎳楅崫鍕ㄦ斀闁炽儱鍟跨痪褔鏌涢弮锟介悷銉╋綖韫囨洜纾兼俊顖濆亹閹虫繈姊虹捄銊ユ灆婵☆偄瀚伴垾锕傚炊椤忓秵鈻夊┑鐘媰閸曨厾鐤勫┑顔硷攻濡炶棄鐣烽锕�绀嬫い鎺炴嫹婵炲懌鍊濆娲倻閳哄倹鐝﹂梺鎼炲妼閻栧ジ鎮伴璺ㄧ杸婵炴垶顭囬娲⒑閹稿孩顥嗘俊顐㈠缁傚秴顭ㄩ崼鐔哄幗闂婎偄娲﹂幐鍓х不閿濆鐓熼柟铏瑰仧閻ｇ數锟芥鍣崜鐔煎极閹惧顩烽悗锝庡亐閹风粯绻涙潏鍓хК婵炲拑绲块弫顔尖槈閵忥紕鍙嗗┑顔缴戦崬濠氬箯瀹勬壋鏋旈柛顭戝枟閻忔洟姊虹化鏇熸珕闁绘娲熼、姘跺Ψ閳轰胶顦板銈嗙墬濮樸劑藝閺夋娓婚柕鍫濇婢ь剛绱掔�ｎ偅宕岀�规洏鍨介弻鍡楊吋閸℃瑥骞楅梺鐟板悑閹矂宕瑰畷鍥╃煋闁汇垹鎲￠悡鏇㈡倵閿濆簼绨兼い銉уХ缁辨帡顢欑喊杈╁悑闂佽鍠楅悷鈺呭箖濠婂吘鐔兼偂鎼达紕顔囬梻鍌欐祰椤曆呮崲閹烘纾婚柣鏃傚帶閻ょ偓銇勯幇鍓佹偧濠⒀�锟芥枼鏀介柣妯虹仛閺嗏晠鏌涚�ｎ剙鏋涢柛鈺傜洴瀹曞ジ鎮㈡笟顖涢敜婵＄偑鍊曠换鎰版偋韫囨挾鏆ゅù锝囧皑閹风兘鐛崹顔煎濡炪倧缂氱划娆忣嚕椤愶絿绡�闁搞儯鍔屾禒顖炴⒑鐠団�冲箺閻㈩垱甯楁穱濠勬崉椤帗瀚归悷娆忓缁�锟介梺缁樼墱閸樠囷綖韫囨梻绡�婵﹩鍓涢敍婊冣攽閻愬弶顥為柛鈺佺墕鍗辨い鏇嫹婵﹨娅ｅ☉鐢稿川椤撳鎸剧槐鎺楊敊閼恒儱纰嶉梺浼欑悼閸忔﹢鐛惔銊﹀殟闁靛闄勯悵鏍⒒娴ｄ警鐒鹃柡鍫墮椤繈濡搁埡濠冩櫓闂佺硶鍓濈湁缂佽妫濋弻锝夊箛椤掍讲鏋欓梺绋块缁绘垹鎹㈠☉銏犵妞ゆ洖鎳忛ˉ鏍ㄧ節閵忥綆娼愭繛鍙夘焽缁骞掗弮鎾村闁挎繂楠告禍鐐烘煕濮楋拷娴滃爼寮婚敐鍫㈢杸闁哄洨鍋樺▽顏堟倵鐟欏嫭绀冮拑杈╃磼閺冨倸鏋庢い顐ｇ矒閺佹挻绂掔�ｎ亣鎽曢梺闈浥堥弲婊堝磻閸曨垱鐓熼柟瀵稿�栭幋锔藉仧妞ゅ繐鐗婇埛鎴犵磼鐎ｎ厽纭剁紒鐘崇叀閺屻劑寮村Ο铏逛紙闂佺粯渚楅崰妤冩崲濠靛纾婚柤鎭掑劜椤ュ牏锟借娲忛崝鎴︺�佸锟芥慨锟介柣妯挎珪濮ｅ棝姊婚崒姘拷椋庣矆娓氾拷楠炴牠顢曢埛姘そ婵℃悂鍩℃担鐚寸幢婵犵數鍋為崹顖炲垂閸︻厼顥氶柤濮愬�ч幏鐑界嵁閸喖濮庡銈忕細閸楀啿鐣烽幋锕�鐒洪柛鎰典簽閻﹀牊绻濋悽闈浶㈤柛濠冩倐椤㈡棃顢旈崨顐＄盎闂侀潧顦崕铏櫠閿曞倹鐓涚�癸拷鐎ｎ剙鍩岄梺瀹犳椤﹂潧鐣烽敓鐘冲�烽悗鐢殿焾缂嶅棝姊虹拠鍙夊攭妞ゎ偄顦叅婵鎷烽柡浣稿暣婵拷闁靛牆鎳忓Σ顒勬⒑鐠恒劌鏋斿┑顔碱嚟婢规洟宕楅崗鐓庡伎濠殿喗顨呭Λ妤佹櫠椤曪拷濡懘鏁冮崒娑掓嫽闂佺鏈懝楣冩晸閻ｅ苯鍘撮柟顔惧仱閺佸倿骞橀崨顔碱伓缂備焦顨嗙粙鎴﹀箠韫囨挾鏆﹂柡灞诲劜閻撴洟鎮橀悙鎻掆挃闁活厼顑囬敓鍊燁潐濞叉﹢鎮￠敓鐘茶摕闁绘梻灏ㄩ幏鐑芥偨濞堣法鍔稿銈呭閹瑰洭寮婚悢椋庢殝闁哄瀵т簺婵＄偑鍊ら崑鍛崲閸儯锟戒礁螖閸涱厾锛滃┑鐘欏懎浜奸柛鏃�鍨甸～蹇撁洪鍕炊闂佸憡娲﹂崜姘跺箯闁秵鈷戦柣鎴旀櫆濞呮捇鏌涢妸銊︾【妞ゆ洩缍侀、鏇㈡晝閿熺晫澹曢崗鑲╃瘈濠电姴鍊搁鈺呮煟濠靛懎宓嗘慨濠冩そ瀹曠兘顢橀悩鑼偧闂佹眹鍩勯崹鎶藉磻閵堝锟戒礁鈻庨幘宕囩杸濡炪倖鍨兼慨銈夊棘閿熶粙姊绘担铏瑰笡闁告梹娲栬灒濠电姴娲ら崥褰掓煟閺傝法娈遍柡锟介懞銉ｄ簻闁哄啫鍊告禍楣冩煛閸″繑娅婇柡灞剧洴楠炴帡骞樺畷鍥╂噯闂備椒绱徊鍓ф崲閸繄鏆﹂柣鏃傗拡閺佸啴鏌曢崼婵囧櫣缂佺媴缍佸濠氬磼濞嗘帒鍘″銈冨灩閿曨亪鐛幘娲绘晜闁糕槅鍘界�氬綊姊婚崼鐔恒�掗柣鎺戞憸閿熻姤顔栭崳顕�宕戦崨顖涘床婵犻潧顑呴悙濠囨煏婵炑冨暙缁犺鈹戦悩鍨毄闁稿鍋涢…鍥р枎閹垮啯鏅為梺绯曞墲閵囨盯寮稿澶嬬厱闁靛绲芥俊绋棵瑰鍕煉闁哄矉绻濆畷姗�骞愭惔鈽嗕紦闂備焦鐪归崺鍕垂鏉堚晜鏆滈柣鏂垮悑閸婂爼鏌涢幇闈涙灍闁抽攱鍨圭槐鎾存媴閻х鍙曢梺鑲╁鐎笛呮崲濞戞瑦濯撮柛鎰絻椤忣偅銇勯埡鍐ㄥ幋闁哄被鍔戝鎾倷鐠囇勫鐟滅増甯掔壕濠氭煏婵犲繗绀嬪ù婊勭矒閺屸�愁吋閸愩劌濮庨梺璺ㄥ枙婵倝銆冮崼婵愬殨鐟滄棃寮幘瀵割浄閻庯綆鍋�閹疯櫣绱撻崒娆戝妽閻绱掗崼鏇氭喚闁哄本鐩弫鎰疀閺囩姌婊堟⒑缂佹ü绶遍柛锝忕秮閻涱噣骞掑Δ锟界粻鐘绘煣韫囷絽浜濇い銉ョ墦閺屸剝鎷呯憴鍕瀺缂備礁鍊圭敮鐐烘晸閺傘倗绉靛ù婊呭仱閵嗕線宕ㄧ�涙ǚ鎷洪柣鐔哥懃鐎氼剟宕濈捄琛℃斀妞ゆ柨鎼敓鑺ョ箞楠炲啴妾辩紒鐘崇洴楠炴﹢顢涘☉娆愭緫闂傚倷鑳剁划顖炩�﹂崼顫剨婵炲棙鍨规稉宥囩磽娴ｅ鑲╂崲閸℃瑧纾藉ù锝夋涧閻忊晜绻涢崨顓犘ч柡宀嬬磿娴狅妇绮欓崹顔规嫟闁诲骸鐏氬妯硷拷姘煎幘閹广垹鈹戠�ｎ亞顦ㄩ梺闈涱煭闂勫嫰鎮鹃懖鈺冪＝闁稿本鑹鹃敓鐣屽厴閹虫宕滄担绋跨亰濡炪倖鐗楃划宥呯暦閺屻儲鐓曠�癸拷閿熶粙宕戝☉銏″亗婵犻潧顑嗛悡娆撴煙鐟欏嫬濮﹂柛銈嗙懇閺屾盯濡搁妷銉嫹瑜版帒桅闁告洦鍨扮猾宥夋煕鐏炲墽鈾侀柣婵愪邯閹嘲顭ㄩ崨顓ф毉闂佺粯鎸撮敓鑺ュ墯濞兼牜绱撴担鑲℃垶鍒婇幘顔界厽闁瑰浼濋鍕ㄦ灁鐎癸拷閸曨兘鎷洪梺纭呭亹閸嬫盯鏁撻懞銉у⒌闁诡啫鍥ㄥ亹闁煎鍊曠粊锕傛椤愩垺澶勭紒瀣浮瀵煡骞栨担鍦弳闂佺粯娲栭崐鍦拷姘炬嫹?
					mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PRoleZongheRankProc(roleId));
					return true;
				}
			}.submit();
		}else{
			new PInbornWithValidProc(roleId, apId).submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800445;

	public int getType() {
		return 800445;
	}

	public int id;
	public byte flag; // 0默认方式  1=一键

	public CUpdateInborn() {
	}

	public CUpdateInborn(int _id_, byte _flag_) {
		this.id = _id_;
		this.flag = _flag_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		_os_.marshal(flag);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_int();
		flag = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CUpdateInborn) {
			CUpdateInborn _o_ = (CUpdateInborn)_o1_;
			if (id != _o_.id) return false;
			if (flag != _o_.flag) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += id;
		_h_ += (int)flag;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(flag).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CUpdateInborn _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = id - _o_.id;
		if (0 != _c_) return _c_;
		_c_ = flag - _o_.flag;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

