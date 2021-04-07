
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
		//闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�哥粻鏍煕椤愶絾绀�缁炬儳娼￠弻褑绠涢敐鍛凹闂佸憡鐟ョ换妯侯潖婵犳艾閱囬柣鏂垮槻閺嬫瑩姊洪崗鍏肩凡闁诲繑绻堝﹢渚�姊洪幐搴ｇ畵闁绘锕、鏃堟偐缂佹鍘藉銈嗘尵閸庢劕螣閿熶粙姊洪崫鍕潶闁稿﹥鐗犻獮鍫ュΩ閳轰胶鐤�濡炪倖甯掗敃銉э拷姘秺閺岋繝宕堕埡浣锋睏闂佸搫顑嗗Λ鍐蓟閿濆憘鐔兼嚃閳轰胶顐奸梻浣虹帛閹稿鎮烽埡鍛摕婵炴垟鎳囬敓鏂ょ畵楠炲鈹戦崨鏉跨劵闂傚倷鑳剁划顖滄暜閻斿憡鍙忛柕鍫濐槸妗呴梺鍛婃处閸ㄦ壆绮绘繝姘�垫繛鎴烆仾椤忓牊鏅搁柤鎭掑劚婵秹鏌″畝锟介崰鏍�佸☉姗嗘僵妞ゆ帊鐒﹂鎺楁煟鎼淬値娼愭繛鍙夌矒瀹曚即寮介婊愭嫹娴ｈ倽鏃堝川椤旇姤顏熷┑鐐差嚟婵挳顢栭崨顖滅焼闁割偅绶疯ぐ鎺撳亗閹艰揪绲鹃幉濂告⒑缂佹ɑ灏版繛鑼枛瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?,濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻鐔兼⒒鐎电濡介梺鍝勬噺缁诲牓寮婚妸鈺佸嵆闁绘劘顕滈幏鐑藉箹娴ｆ瓕袝閻熸粎澧楃敮鎺旂不鐟欏嫮绠鹃柨婵嗛婢ь喖鈹戦檱閸嬫劗妲愰幒妤婃晝闁靛繆鎳ｈ閺岀喖顢欓懖鈺冃ㄩ悗瑙勬处閸嬪﹤鐣烽悢纰辨晢濞达絿顭堟竟宥夋⒒娴ｅ湱婀介柛鈺佸瀹曞綊顢楅崟顐わ紵闂佽偐鈷堥崜姘暦閸欏绠鹃柟瀛樼懃閻忊晝绱掗悩宸吋闁哄睙鍡欑杸闁挎繂鎳嶇花璇测攽閻愬弶鍟氶柛銉ｅ妷閹锋椽鏌ｉ悩鍙夌闁跨喎锟界喐鐝柣蹇撶墦濮婃椽骞愭惔銏紭闂佺楠哥壕顓㈠礆閹烘垟鏋庨柟鎯х摠濞呫垽姊虹捄銊ユ珢闁瑰嚖鎷�?濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻鐔兼⒒鐎垫瓕绐楅梺杞扮鐎氫即寮诲☉銏╂晝闁绘ɑ褰冩慨搴ｇ磽娓氬﹥瀚归梺绋挎湰缁嬫帡宕ｈ箛鏂剧箚闁靛牆鎷嬮崕鎰版倵濮橆剛绉烘慨濠呮閹风娀鍨惧畷鍥﹀摋婵犵數鍋涢惇浼村礉閹达箑鏋侀柟鎹愵嚙濡﹢鏌曢崼婵囧窛閺嶏繝姊绘担鍛婂暈闁荤喆鍎查〃銉╁箹娴ｈ鎷烽敃鍌氱倞鐟滃繘寮抽崱娑欑厱闁哄洢鍔屾晶浼存煕濡湱鐭欐慨濠冩そ濡啫鈽夋潏鈺佸Ъ闂備胶顭堥柊锝嗙閸洏锟戒線寮崼顐ｆ櫌婵炶揪绲介崥锟界紒銊嚙椤啴濡堕崱妤�衼缂傚倸绉村Λ妤呭煝閹炬剚鐓ラ柛顐ゅ枔閸樼數绱撴担鍦灱妞ゎ偄顦遍敓鑺ョ啲閹凤拷?
		role.clearISee();
		
		role.enterScene();
		SceneTeam team = role.getTeam();
		if(team!=null)
			team.sendTeamInfoToRole(role);//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁�濠囨煥閻旇袚缂佺粯鐩畷顏堝礃椤忓柊婊堟⒑绾懏鐝紒顔芥尭閻ｉ攱绺界粙鍨祮闂佺粯妫佸〒褰掓偨缂佹绡�闁汇垽娼ф禒婊勪繆椤愶絿鎳囩�规洘绻堝鎾偐閻㈢數鏆ラ梻浣哥枃濡椼劎娆㈤敓鐘冲亜闁糕剝绋掗悡鐔兼煟閺傚灝妲荤紒銊ヮ煼濡懘顢楁径濠傗拫闂佸搫鐬奸崰鏍箹瑜版帩鏁冮柕鍫濇閸ㄨ鲸淇婇悙顏勶拷鎴﹀垂閸濆嫀娑㈠礃閵娧勬闂佺粯姊婚埛鍫ュ极閸ヮ剚鐓熸俊顖濇娴犳稒绻涢崼鐔搞仢婵﹤顭峰畷鎺戔枎閹存繂顬夐梻浣规た娴滄粎绱炴繝鍌滄殾婵犻潧妫涢弳鍡涙煥閻斿墎鐭欓柡浣规崌閹崇偤濡疯閺嗏�斥攽閻橆喖鐏柨姘憋拷瑙勬尭鐎氭澘顫忓ú顏勭閹兼番鍩勫鍨攽閳藉棗浜滈悗姘嵆閵嗕礁顫濋鐔虹Ф闂佸啿鎼鍡欙拷姘愁潐椤ㄣ儵鎮欓懠顑胯檸闂佸憡姊瑰畝鎼佸箖濡わ拷椤繈姊荤�靛憡鏅奸梻浣烘嚀缁犲秹宕归挊澶屾殾闁告鍋愬Σ鍫熺箾閸℃ê鐏ユ鐐茬Ч濮婄粯鎷呴懞銉с�婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�?
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

