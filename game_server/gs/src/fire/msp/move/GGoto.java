
package fire.msp.move;
import fire.pb.scene.BlockInfo;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GGoto__ extends mkio.Protocol { }

/** Transfor相关的方法
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GGoto extends __GGoto__ {
	@Override
	protected void process() {
		// protocol handle
		fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		if(null == role) return;
		
		if(gototype == fire.pb.move.SRoleEnterScene.SYSTEM_DRAG){
			//缂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌ㄩ悢鍝勑㈤柛銊ュ�垮濠氬醇閻旀亽锟芥帡鏌￠崱顓犵暤闁哄矉缍佹慨锟介柕鍫濇闁款參姊洪幖鐐插缂佽鍟伴幑銏犫槈濮楀棗鏅犲銈嗘瀹曠敻鎯勬惔锝囩＝濞达絽鎼宀勬煕閵娿倕宓嗛柍銉閹瑰嫰濡搁敃锟界壕顖涚箾閹炬潙鍤柛銊ㄩ哺閺呫儵姊婚崒娆戝妽婵＄偞瀵х粋宥夋晲閸涘倹鐩畷鐔碱敍濞戞氨鏆㈤梻鍌氬�烽懗鍫曗�﹂崼銏″床婵°倕鎳庣壕濠氭煙閹峰苯鐒介柨鐔绘閸婂潡鐛幘璇茬闁糕剝蓱閺夊憡淇婇悙顏勶拷鏍偋濡ゅ啰鐭欓柟鐑橆殔妗呭┑鐘绘涧閻楃偤骞忔搴㈠枂闁告洦鍓涢ˇ銊╂倵閻у憡瀚归梺褰掓？缁�浣虹不閺嶎偅鍠愰柡鍌濇硶閺嗭箓鏌ｉ幘宕囧哺闁猴拷娴犲鐓曟い鎰╁�曢弳閬嶆煛鐎ｎ亞鐒告慨濠勭帛閹峰懐绮电�ｎ亝顔勬繝娈垮枟閿曨偆绮婚幘缁樻櫜闁绘劖娼欑欢鐐测攽閻樻彃顒㈤柛宥囨暬濮婃椽妫冨ù銉ョ墦瀵彃鈽夊顒夋婵犵數濮电喊宥夋偂閵夛妇绡�闂傚牊绋掗敍宥嗕繆閹绘帞绉洪柡灞剧♁閹棃鏁嶉崟鎳峰洦鐓涢悘鐐插⒔濞插锟芥鍠楅幐铏繆閹间礁唯鐟滃矂鎮界紒妯圭箚闁绘劦浜滈敓鑺ユ礃椤ㄣ儵宕妷褏鐓嬮梺鑽ゅ枛閸嬪﹪宕甸弴銏＄厱妞ゆ劧绲剧粈鍐煛閸涱喗鍊愰柡灞诲姂閹倝宕掑☉姗嗕紦?
			role.justGoto(sceneid, xpos, ypos, BlockInfo.FLOOR_0_Z, gototype);
			return;
		}else if (delta <= 0){
			//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愬绡�闁汇垽娼ф禒褔鏌涚�ｎ偅宕岄柟顕嗙節婵拷闁靛牆妫岄幏娲⒑閸濆嫬锟藉爼宕曢幓鎺嗘瀺闁告稑鐡ㄩ悡鏇㈡煟閺囨氨顦﹂柣蹇ョ悼缁辨帡顢欑喊杈╁悑濡ょ姷鍋炵敮鎺曠亙婵炶揪缍侀弲鏌ュ礌閺嶎厽鈷掑ù锝堫潐閸嬬娀鏌涙惔銏＄稇闁崇粯鏌ㄩ埥澶愬閳ョ鎷烽崼鏇熺厽婵☆垰鎼敮鐘电磼鐠囧弶顥為柕鍥у瀵粙濡歌閺嗭繝姊绘繝搴″⒒闁告挾鍠栧濠氭偄妞嬪孩娈鹃梺鎼炲劀閿熶粙寮搁崨瀛樺�甸悷娆忓缁�鍐煥閺囨ê鐏ǎ鍥э躬楠炴牗鎷呯憴鍕彆闂備浇顕栭崹搴ㄥ礃閳哄啯袠闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏃�鎷濋幏椋庣箔濞戞ɑ鍣介柣顓熺懇閺岀喐娼忔ィ鍐╊�嶉梺绋垮濡啴寮婚妶鍚ゅ湱锟斤綆鍋呴悵妤佺節濞堝灝鏋熷┑鐐诧躬楠炲啳銇愰幒鎴犵暢闂佸湱鍎ら崹鐢糕�栨径鎰拺缂佸娉曠粻鑼磼椤旇偐效濠碉紕鏁诲畷鐔碱敍濮樿京娼夐梻浣规偠閸庢椽鎮￠崼婢盯宕熼顐ｅ瘜闂侀潧鐗嗛幊搴敆閵忋倖鐓熼柣鏂垮级濞呭﹦锟芥鍠涢褔鍩ユ径鎰潊闁绘ɑ顔栭崬娲⒒娴ｅ憡鎯堥柛濠傜秺椤㈡牕鈻庨幘铏緢濡炪倖鎸堕崹娲偂閻旂厧绠归弶鍫濆⒔绾惧灝霉閻樺磭鈾侀柟渚垮妼铻ｇ紒瀣仢椤洭姊烘潪鎵妽闁圭懓娲ら悾鐑藉箛閻楀牆浜炴繛杈剧到濠�杈╃矓閻戣姤鈷掑ù锝堟椤ュ秵銇勯銏╂█鐎规洘娲熼獮搴ｆ喆閿濆繑瀚归柨鏇炲�搁悙濠冦亜椤掑澧俊顐㈠暙閻ｇ兘濡搁埡濠冩櫍闂佺粯鍔曞鍫曞汲閿燂拷?
			role.justGoto(sceneid, xpos, ypos, BlockInfo.FLOOR_0_Z, gototype);
			return;
		}else{
			//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告噰闁诡噣娼ц灒闁煎鍊楅惁鍫ユ⒑闂堟盯鐛滅紒鎻掑⒔濞戝灚銈ｉ崘鈺侊拷鐢告煕椤垵浜滄繛鎼枤閿熷�燁潐濞叉粓寮拠宸殨濞寸姴顑愰弫鍐┿亜閹哄秶顦︽い蹇撶埣濮婃椽鎳￠妶鍛�惧┑鐘灪閿曘垼妫㈤棅顐㈡处缁嬫帡鎮￠弴銏＄厽婵☆垵娅ｉ敍宥夋煏閸℃ê娴柡灞诲姂閹垻绱掑鍡橆棄闂備浇顕х换鎴濈暆閹间礁绠栫憸鏃堝箖閳哄懏鍤戞い鎺嶇劍椤旀洟姊绘担钘変汗妞ゎ厼鐗撻幃妯侯潩鏉堚晝顦梺鎼炲労閸撴岸鎮￠弴銏＄厵闁绘劦鍓﹀▓鏃堟煙瀹勯偊鍎忛崡閬嶆煟閹达絽袚闁抽攱甯￠弻娑氫沪閹规劕顥濋梺璺ㄥ枙婵倝骞冮崒鐐靛祦濠电姴鍟崕鐔兼煥濠靛棙顥滈幖鏉戯躬濮婃椽鎮烽幍顔芥喖缂備焦妞界粻鏍ь嚕閵娾晜鏅濋柛灞剧〒閸欏棝姊虹紒妯烩拻缂侇噮鍨惰棢濠㈣埖鍔栭悡鍐煢濡警妯堟俊顖ゆ嫹闂備浇妗ㄩ悞锕傚箲閸ヮ剙鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘?濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨偓鎷锋繝姘ワ拷鍛村矗婢跺瞼鐦堟繝鐢靛Т閸婂綊藟閹捐秮鐟邦煥閸愵亞楔闂佸搫鐭夌槐鏇熺閿旂偓瀚氶柟缁樺笒椤岸姊绘担渚劸妞ゆ垵鍟村畷婵嬪箣閿曪拷閽冪喖鏌￠崶鈺佹灁缂佺娀绠栭弻娑⑩�﹂幋婵囩亪婵犳鍠楀ú婊呮閹捐纾兼慨妯荤樂閵忋垻纾肩紓浣癸公閼拌法锟芥鍠栭…鐑藉极閹剧粯鍋愰柧蹇ｅ亝椤忕喖姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷?
			java.util.Random r = fire.pb.scene.MapHelper.getRandom();
			int gox = xpos + (r.nextInt(1) * 2 - 1) * r.nextInt(delta);
			int goy = ypos + (r.nextInt(1) * 2 - 1) * r.nextInt(delta);
			role.justGoto(sceneid, gox, goy, BlockInfo.FLOOR_0_Z, gototype);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 724898;

	public int getType() {
		return 724898;
	}

	public long roleid;
	public long sceneid; // 场景id
	public int xpos;
	public int ypos;
	public int delta; // 允许误差
	public int gototype; // 跳转类型

	public GGoto() {
	}

	public GGoto(long _roleid_, long _sceneid_, int _xpos_, int _ypos_, int _delta_, int _gototype_) {
		this.roleid = _roleid_;
		this.sceneid = _sceneid_;
		this.xpos = _xpos_;
		this.ypos = _ypos_;
		this.delta = _delta_;
		this.gototype = _gototype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(sceneid);
		_os_.marshal(xpos);
		_os_.marshal(ypos);
		_os_.marshal(delta);
		_os_.marshal(gototype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		sceneid = _os_.unmarshal_long();
		xpos = _os_.unmarshal_int();
		ypos = _os_.unmarshal_int();
		delta = _os_.unmarshal_int();
		gototype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GGoto) {
			GGoto _o_ = (GGoto)_o1_;
			if (roleid != _o_.roleid) return false;
			if (sceneid != _o_.sceneid) return false;
			if (xpos != _o_.xpos) return false;
			if (ypos != _o_.ypos) return false;
			if (delta != _o_.delta) return false;
			if (gototype != _o_.gototype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += (int)sceneid;
		_h_ += xpos;
		_h_ += ypos;
		_h_ += delta;
		_h_ += gototype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(sceneid).append(",");
		_sb_.append(xpos).append(",");
		_sb_.append(ypos).append(",");
		_sb_.append(delta).append(",");
		_sb_.append(gototype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GGoto _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(sceneid - _o_.sceneid);
		if (0 != _c_) return _c_;
		_c_ = xpos - _o_.xpos;
		if (0 != _c_) return _c_;
		_c_ = ypos - _o_.ypos;
		if (0 != _c_) return _c_;
		_c_ = delta - _o_.delta;
		if (0 != _c_) return _c_;
		_c_ = gototype - _o_.gototype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

