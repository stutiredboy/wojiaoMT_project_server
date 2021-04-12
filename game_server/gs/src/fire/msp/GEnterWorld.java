
package fire.msp;


import fire.pb.scene.SceneClient;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.God;
import fire.pb.scene.movable.Role;
import fire.pb.scene.movable.SceneTeam;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GEnterWorld__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GEnterWorld extends __GEnterWorld__ {
	@Override
	protected void process() {
		
		Role role = RoleManager.getInstance().getRoleByID(roleid);
		if(null == role)
		{
			role = God.createRole(roleid, rolename, level, schoolid, mapinfo, laststaticmapinfo, 0 != protect, 0, 0);
			if (null == role)
				return;

			role.init(showpet);
			role.init(mode);
			role.init(title);
			role.init(components);
			role.setSceneState(scenestate);
			role.setLastStaticMapInfo(laststaticmapinfo);
			role.setMaxShowNum(this.showrolenum);
			role.setEquipEffect(equipeffect);
		}
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹閸濄儳涓嶉柡宥庡幗閻撴洘銇勯幇鍓佺ɑ缂侊拷閿熺晫绱掗悙顒�鍔ゆ繛纭风節瀵槒顦剁紒鐘崇洴閺佹劙宕ㄩ鍌氬毈闂傚倷绀侀幉锟犳偡閵壯勫床婵☆垯璀﹀鏍р攽閻樺疇澹橀梺鍗炴喘閺岋綁寮崹顔叫╅梺鍝勵儐閻熲晛顫忓ú顏勭闁稿繗鍋愰崙锟犳⒑鐠囪尙绠茬紒璇茬墕閿曘垺绗熼敓钘夘潖濞差亜绠伴幖杈剧悼閻ｇ敻姊虹紒姗嗘當闁挎洦浜妴渚�寮崼鐔蜂汗缂傚倷鐒﹂…鍥储閽樺娓婚柕鍫濇鐏忕敻鏌涙惔銏犲閾伙綁鏌ㄩ悢鍓佺煓婵﹥妞藉畷顐﹀礋椤曞懏钑夐梻浣侯焾閿曘儵鎮ч悩鑽ゅ祦闁割偁鍎辨儫闂佸疇妗ㄩ懗鍫曟偪閿熻姤淇婇悙顏勶拷鏍暜閹烘鏅濋柕澹秵瀚规慨姗嗗墰缁夋椽鏌″畝瀣瘈鐎规洖鐖奸崺鈩冩媴闁垮娼栭梻鍌欑閹碱偊顢栭崱妞㈡盯宕橀鑹版憰闂佹寧绻傞幉姗�鎮㈤崗鐓庢異闂佸疇妗ㄩ懗鍫曨敃婵傚憡鈷掑ù锝堟鐢盯鏌熺粙娆剧吋闁诡喚鍏橀崺锟犲川椤撯剝鎲版繝鐢靛仦閸ㄧ喖骞婇崶顒佹櫢闁哄倶鍊楅悾鍨殽閻愬樊鍎忛柍瑙勫灴瀹曘劑寮剁捄銊ュХ闂傚倸鍊搁崐鐑芥嚄閸撲礁鍨濇い鏍ㄧ矋閺嗘粓鏌ｉ弬鎸庡暈闁告瑥绻橀弻鏇㈠醇濠垫劖笑婵℃鎳樺娲川婵犲啫顦╅梺鎼炲妽婢瑰棛鍒掔紒妯肩瘈婵﹩鍘奸敓钘夌仛缁绘盯骞嬮悜鍡曠棯濡炪倕绻愰悧濠囧疾閹间焦鐓犻柟顓熷笒閸旀艾鈹戦鑲┬ч柡灞革拷宕囨殕闁跨喍绮欏畷浼村冀椤撴粣鎷锋担绯曟婵妫欓崓闈涱渻閵堝棗绗傞柣鎺炵畵椤㈡瑩骞掑Δ浣哄幗闁瑰吋鐣崐銈咁焽閹邦厾绠鹃柛娆忣槺閻帞锟借娲戦崡鍐差嚕娴犲鏁囨繝濠冨姈鐎氱懓霉閿濆牆锟戒粙寮崼婵嗙獩濡炪倖妫佹慨銈夘敂閻斿皝鏀介柣鎰▕閸ょ喎鈹戦鑺ュ唉妞ゃ垺鐗犲畷銊╊敍濠婂懐鍔堕梻浣稿閸嬪懐娆㈤悿顖樹汗闁圭儤鎸告禍妤呮煙閼圭増褰х紒鏌ョ畺楠炲绺介崨濞炬嫼缂傚倷鐒﹁摫閻忓繒澧楃换娑㈡嚑椤掞拷閺嬫稓锟芥鍠栭…閿嬩繆閹间礁鐓涢柛灞剧煯缁ㄤ粙姊绘担渚劸闁哄牜鍓涚划娆撳箣閿旂粯鏅滈梺璺ㄥ櫐閹凤拷?,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂濠氭偄閸忓皷鎷婚柣搴ｆ暩椤牊淇婃禒瀣拺闁告繂瀚崳铏圭磼鐠囪尙澧︾�殿喖顭锋俊鎼佸煛娴ｇ绁梻浣虹帛閸旀﹢顢氬鍫濈闁绘垼妫勭粻鐟懊归敐鍡欐憙鐞氭繈鏌ｉ悢鍝ョ煂濠⒀勵殘閺侇噣骞掗弮鍌欑瑝闁荤喐鐟ョ�氼喚绮绘ィ鍐╃叆婵犻潧妫濋妤�顭胯閸犳牠鍩為幋锔筋�愰梺绋款儐閸旀危閹版澘绠虫俊銈咃攻閺呮繈姊洪棃娑氱畾闁圭缍�椤﹀綊鏌″畝锟介崰鏍�佸▎鎾村殐闁冲搫鍞妸鈺傚�甸悷娆忓婢跺嫰鏌涚�ｎ亷宸ラ柣锝囧厴閹垻鍠婃潏銊︽珜濠电偠鎻徊鍧椻�﹂崼鐔虹彾鐎广儱顦伴埛鎺懨归敐鍛础婵狅拷娴犲鐓曢柍杞扮椤忣厾锟借娲栫紞濠囥�佸Δ鍛妞ゆ劑鍊х槐鐢告⒒娴ｈ棄浜归柍宄扮墦瀹曟粌顫濋鍌涙闂佸憡鐟ラˇ杈╃不妤ｅ啯鐓欓悗娑欘焽閹冲啴鏌ｈ箛濠冩珖缂佽鲸甯￠幃鈺侇啅椤旀儳鎮戦梻浣告惈閻瑩宕卞▎鎴炴緫闂備焦瀵х换鍌炲箠瀹ュ洩濮抽悹鍥ㄧゴ閺�浠嬫煟閹邦剙绾ч柛鐔稿哺閺屾盯濡烽敐鍛ㄩ梺褰掓敱濡炰粙寮婚敐澶嬪亹闁告瑥顦遍ˇ閬嶆⒑鐠恒劌鏋庨柨鐔烘櫕閸犳劙鎮甸鍫熺厽闊洦鎸炬晶锔芥叏婵犲啯銇濇鐐村姈閹棃濮�椤喚鍠橀梻鍌欒兌椤牊顨ラ崫銉ヮ棜妞ゆ挶鍨圭粈鍡涙煙閻戞ê鐏嶉柡瀣叄閺岀喖骞嗚閹界姵绻涢崨顐㈢伈婵﹨娅ｉ幑鍕Ω閵夛妇褰氶梻浣烘嚀閸ゆ牠骞忛敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂濠氭偄閸忓皷鎷婚柣搴＄仛閻℃洜绮ｅΔ鍛拺閺夌偞澹嗛ˇ锕傛倵濮橆偄宓嗙�殿喛顕ч埥澶愬閳哄倹娅囬梻浣虹帛钃辩憸鏉垮暞閹便劍鎯旈敐鍥╋紳婵炴挻鑹鹃敃銉э拷姘秺濮婅櫣绮欓幐搴㈡嫳缂備礁顑嗙敮鈥崇暦閿濆牏鐤�闁哄倸澧界粻姘舵⒑闂堟稓澧曢柟宄邦儔瀹曟洟骞囬悧鍫濓拷鍨叏濮楀棗澧扮紒澶屽劋閹便劍绻濋崨顕呬哗闂佸綊顥撴繛锟介柛銊﹀劤閻ｇ兘宕堕敃锟介幗瀣攽閻樺灚鏆╅柛瀣洴閹洦瀵奸弶鎴狀槷闂佺鎻粻鎴﹀几娓氾拷閺岀喖骞戦幇闈涙濠碘槅鍋呴敃銏ゅ蓟閺囥垹閱囨繝闈涙搐缁愭盯鏌″蹇曠瘈婵﹦绮幏鍛村川婵犲倹娈橀梻浣藉吹閸犲棝宕曢弻銉ｏ拷鍐Ψ閳轰胶顔愭繛杈剧秬椤曟粓骞忛悜鑺ユ櫇闁稿本姘ㄩ崐鐐烘偡濠婂啰绠荤�殿喗濞婂畷鍗炩槈濞嗘垵骞堥梻浣告惈濞层垽宕濈仦鐐珷濞寸厧鐡ㄩ悡鏇熶繆椤栨碍璐￠柣顓熺懄閹便劍绻濋崘鈹夸虎濠碘槅鍋勯崯顐﹀煡婢跺缍囬柍杞扮姝囬梻鍌氬�烽懗鍫曗�﹂崼銉︾厐闁挎繂妫涢々鏌ユ煕椤愶絾纾搁柨鐔稿灊缁舵艾顕ｉ锟藉畷濂割敃閿濆棙鐝滄繝鐢靛仩閹活亞寰婃禒瀣Е闁跨喓鏅槐鎺楀Ω椤垵娈銈庝簻閸熷瓨淇婇崼鏇炲耿婵°倧鎷风悰鑲╃磽閸屾艾锟藉摜绮旈弶鎳虫稑螖閸涱厾鍘洪梺鍦亾閸撴岸鎮￠妷鈺傜厱妞ゆ劑鍊曢弸鏃堟煕濡吋鏆╃紒杈ㄦ尰閹峰懘宕烽褏浼囨俊鐐�ら崑鍕囬柆宥嗘櫢闁兼亽鍎抽崯鏌ユ煙閸戙倖瀚�?
		role.clearISee();
		
		role.enterScene();
		SceneTeam team = role.getTeam();
		if(team!=null)
			team.sendTeamInfoToRole(role);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垹顭峰缁樻媴閻熼偊鍤嬪┑鐐插级閻楃姴鐣烽幇鏉跨濞达絿顭堥悗顓㈡⒑缁嬭法鐏遍柛瀣仱閹繝濡烽埡鍌滃幗闂佸搫娲ㄩ崑娑㈡晸閽樺璐￠柨鐔诲Г閻旑剟骞忛敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫ょ紓渚婃嫹濠电姴娲﹂悡銉╂煟閺冨浂鍤欑悮姘辩磽娴ｈ櫣甯涢柣鈺婂灠閻ｇ兘顢旈崼婵堫槰濡炪倕绻愰弻濠傤煥閸啿鎷虹紒缁㈠幖閹冲繘鎮甸鍡欑＜妞ゆ棁濮ょ亸顓㈡煟閿濆鏁辩紒铏规櫕缁瑩宕归鑲┿偖闂傚倷鑳剁划顖毼涙担鎼烇拷鎺曘亹閹烘挸浠虹紓鍌欑劍椤洨寮ч敓浠嬫⒑濮瑰洤鐏叉繛浣冲嫮顩锋繝濠傚缁诲棙銇勯幇鍓佹偧闁瑰啿娲ㄩ敓鍊燁潐濞叉鎹㈤崼婵愬殨闁圭虎鍠楅崑鎰版煟閵忋垺鏆╅柡鍡愬劦濮婄粯鎷呴崫銉︾�┑鈩冦仠閸斿骸鈻庨姀銈嗘櫢闁绘ê鍟挎禍婊堟⒑缁洖澧茬紒瀣浮閹繝鎮㈤崗鑲╁幗闂佸搫鍊搁悘婵單ｉ懡銈囩＜闁靛鍎洪悡鍏间繆椤愩垺鍤囨い銏☆殕瀵板嫭绻濋崒妤佸闂傚倷绀侀幖顐︽儔婵傜绐楅柡宥庡幖缁犲湱鎲搁悧鍫濅刊闁轰礁鍟撮弻鏇㈠醇濠靛浂妫為梺鎼炲姀妞村憡绌辨繝鍥ㄥ�锋い蹇撳閹风兘骞嬮敃锟介崹鍌炴煕濠靛棗鐝嬫繛鎴欏灩缁�鍐煏婵炑冨椤旀洟姊绘担铏瑰笡婵﹤顭烽崺娑㈠醇閵夈儲鐎梺鎼炲労閸撴岸鎮￠悢闀愮箚妞ゆ牗绻冮鐘裁归悩宕団檨缂佺粯鐩畷濂告偄閹肩偘铏庢繝娈垮枛閿曘倝鈥﹀畡鎵殾闁圭儤鍨熼弸搴ㄦ煙鐎涙绠撴い顒�顦靛缁樻媴鐟欏嫨浠ф繛瀛樼矋缁海妲愰悙瀵哥瘈闁稿本绮嶅▓鎯р攽閻樼粯娑ф俊顐ｇ洴瀵娊宕卞☉娆戝弳闂佺粯鏌ㄦ晶搴ㄦ儗濞嗘挻鐓涘ù锝堫潐瀹曞矂鏌熷畷鍥т槐濠碉紕鏌夐¨渚�鏌￠崱蹇ユ嫹閺傘儲鏂�闂佺粯锕╅崰鏍倶椤忓牊鐓ユ慨妯诲敾閹烽鎲撮崟顒�纰嶉柣搴㈢濠㈡﹢锝炶箛鎾佹椽顢旈崟顓у敹闂佺懓鍚嬮悾顏堝春閸曨偒娼栭柛顭戝枓閺�浠嬫煃閽樺顥滃ù婊勭矒閹顫濋銏犵ギ闂侀潧妫旂粈渚�锝炲┑瀣垫晣闁绘棁娅ｈ倴闂傚倷绀侀崯鍧楀箹椤愶富鏁勯柛鈩冪懕閹峰嘲顫濋幇浣圭秷濡炪們鍔婇崕鐢稿箖濞嗘挻鍤戞い鎴ｅ劵濡炬悂姊绘担鍛婂暈婵﹦鎳撻悾婵嬪箹娴ｅ摜鐣哄┑掳鍊ч幏閿嬨亜椤愶絿绠炴慨濠呭吹閿熶粙娼ч幉锟犲疾婵傚憡鈷掑ù锝囧劋閸わ拷缂備胶濮寸粔鐟扮暦瑜版帗瀵犲璺烘湰濞堥箖姊洪崨濠庢畼闁稿鍔曞嵄闁割偆鍠撶粻楣冩煕閳╁厾顏堟倶閵夛富娈介柣鎰皺鏁堝┑顔硷功缁垶骞忛崨瀛樺殟闁靛／渚婃嫹婵犲洦鈷戦梻鍫氭櫇缁夊墎绱掗悩铏磳闁绘侗鍠涚粻娑樷槈濞嗘劖顏熼梻浣芥硶閸ｏ箓骞忛敓锟�?
		role.setBattleReplayStateAndBroacast(false);
		RoleManager.getInstance().addRoleToSchool(roleid, schoolid);
		RoleManager.getInstance().addRoleToCamp(roleid, 0);
		SceneClient.pSend(new MEnterScene(roleid,role.getScene().getSceneID(),role.getPos().getX(),role.getPos().getY()));
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 720897;

	public int getType() {
		return 720897;
	}

	public long roleid;
	public int level;
	public java.lang.String rolename;
	public fire.msp.RoleMapInfo mapinfo;
	public fire.msp.RoleMapInfo laststaticmapinfo;
	public int protect;
	public int schoolid;
	public java.util.HashMap<Byte,Integer> components; // 角色换装信息key值参考SpriteComponents的枚举
	public fire.msp.modeinfo mode;
	public fire.msp.showpetinfo showpet;
	public fire.msp.showtitleinfo title;
	public int scenestate;
	public int showrolenum;
	public int equipeffect;

	public GEnterWorld() {
		rolename = "";
		mapinfo = new fire.msp.RoleMapInfo();
		laststaticmapinfo = new fire.msp.RoleMapInfo();
		components = new java.util.HashMap<Byte,Integer>();
		mode = new fire.msp.modeinfo();
		showpet = new fire.msp.showpetinfo();
		title = new fire.msp.showtitleinfo();
	}

	public GEnterWorld(long _roleid_, int _level_, java.lang.String _rolename_, fire.msp.RoleMapInfo _mapinfo_, fire.msp.RoleMapInfo _laststaticmapinfo_, int _protect_, int _schoolid_, java.util.HashMap<Byte,Integer> _components_, fire.msp.modeinfo _mode_, fire.msp.showpetinfo _showpet_, fire.msp.showtitleinfo _title_, int _scenestate_, int _showrolenum_, int _equipeffect_) {
		this.roleid = _roleid_;
		this.level = _level_;
		this.rolename = _rolename_;
		this.mapinfo = _mapinfo_;
		this.laststaticmapinfo = _laststaticmapinfo_;
		this.protect = _protect_;
		this.schoolid = _schoolid_;
		this.components = _components_;
		this.mode = _mode_;
		this.showpet = _showpet_;
		this.title = _title_;
		this.scenestate = _scenestate_;
		this.showrolenum = _showrolenum_;
		this.equipeffect = _equipeffect_;
	}

	public final boolean _validator_() {
		if (!mapinfo._validator_()) return false;
		if (!laststaticmapinfo._validator_()) return false;
		if (!mode._validator_()) return false;
		if (!showpet._validator_()) return false;
		if (!title._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(level);
		_os_.marshal(rolename, "UTF-16LE");
		_os_.marshal(mapinfo);
		_os_.marshal(laststaticmapinfo);
		_os_.marshal(protect);
		_os_.marshal(schoolid);
		_os_.compact_uint32(components.size());
		for (java.util.Map.Entry<Byte, Integer> _e_ : components.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		_os_.marshal(mode);
		_os_.marshal(showpet);
		_os_.marshal(title);
		_os_.marshal(scenestate);
		_os_.marshal(showrolenum);
		_os_.marshal(equipeffect);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		level = _os_.unmarshal_int();
		rolename = _os_.unmarshal_String("UTF-16LE");
		mapinfo.unmarshal(_os_);
		laststaticmapinfo.unmarshal(_os_);
		protect = _os_.unmarshal_int();
		schoolid = _os_.unmarshal_int();
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			byte _k_;
			_k_ = _os_.unmarshal_byte();
			int _v_;
			_v_ = _os_.unmarshal_int();
			components.put(_k_, _v_);
		}
		mode.unmarshal(_os_);
		showpet.unmarshal(_os_);
		title.unmarshal(_os_);
		scenestate = _os_.unmarshal_int();
		showrolenum = _os_.unmarshal_int();
		equipeffect = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GEnterWorld) {
			GEnterWorld _o_ = (GEnterWorld)_o1_;
			if (roleid != _o_.roleid) return false;
			if (level != _o_.level) return false;
			if (!rolename.equals(_o_.rolename)) return false;
			if (!mapinfo.equals(_o_.mapinfo)) return false;
			if (!laststaticmapinfo.equals(_o_.laststaticmapinfo)) return false;
			if (protect != _o_.protect) return false;
			if (schoolid != _o_.schoolid) return false;
			if (!components.equals(_o_.components)) return false;
			if (!mode.equals(_o_.mode)) return false;
			if (!showpet.equals(_o_.showpet)) return false;
			if (!title.equals(_o_.title)) return false;
			if (scenestate != _o_.scenestate) return false;
			if (showrolenum != _o_.showrolenum) return false;
			if (equipeffect != _o_.equipeffect) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += level;
		_h_ += rolename.hashCode();
		_h_ += mapinfo.hashCode();
		_h_ += laststaticmapinfo.hashCode();
		_h_ += protect;
		_h_ += schoolid;
		_h_ += components.hashCode();
		_h_ += mode.hashCode();
		_h_ += showpet.hashCode();
		_h_ += title.hashCode();
		_h_ += scenestate;
		_h_ += showrolenum;
		_h_ += equipeffect;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(level).append(",");
		_sb_.append("T").append(rolename.length()).append(",");
		_sb_.append(mapinfo).append(",");
		_sb_.append(laststaticmapinfo).append(",");
		_sb_.append(protect).append(",");
		_sb_.append(schoolid).append(",");
		_sb_.append(components).append(",");
		_sb_.append(mode).append(",");
		_sb_.append(showpet).append(",");
		_sb_.append(title).append(",");
		_sb_.append(scenestate).append(",");
		_sb_.append(showrolenum).append(",");
		_sb_.append(equipeffect).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

