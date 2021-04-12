
package fire.pb.skill;

import fire.pb.skill.scene.PSceneSkill;
import fire.pb.skill.scene.SceneSkillConfig;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CUseSceneSkill__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CUseSceneSkill extends __CUseSceneSkill__ {
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨绘い鎺嬪灪閵囧嫰骞囬鍡欑厯闂佸搫鏈ú鐔风暦閻撳簶鏀介柟閭﹀帨閿斿墽纾藉ù锝呮惈椤庡矂鏌涢妸銉у煟鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姈閵囧嫰寮撮悙鎼！闁诲孩鑹剧紞濠囧蓟濞戙垹绠涢梻鍫熺♁閻忓牆螖閻橀潧浜奸柛銊у劋缁岃鲸绻濋崶銊ワ拷鐑芥倵濞戞瑯鐒芥い锔哄妼閳规垿鏁嶉崟顐＄钵缂備緡鍠楅悷鈺呮偘椤曪拷瀹曟﹢顢欑喊杈ㄧ秱闂備線娼ч悧鍡涘箠閹板叓鍥樄婵﹨娅ｇ槐鎺懳熺拠鑼暡缂傚倷闄嶉崝蹇涘磻閹版澘绀嗛柟鐑樻处濡茶偐绱撴担铏瑰笡缂佽鐗撻獮鍐╃鐎ｎ偒妫冨┑鐐村灦椤ㄥ牓骞戦弴鐔虹瘈缁剧増蓱椤﹪鏌涚�ｎ亝鍤囬柟顔惧厴閸┾剝鎷呴悜妯活啎闁荤喐绮庢晶妤冩暜閹烘梻鐭嗛柛顐ｇ缚閿熻姤甯掗～婵嬵敆婵犲啯鏆伴梺璇插娣囨椽锝炴径鎰疄闁靛鍎欓悢鍏煎亗閹煎瓨绻傞ˉ姘舵⒑鐠囨彃顒㈤柣鏃戝墴楠炲繘鏁撻敓锟�?
		if(aimtype == PSceneSkill.GOAL_SELF_PET)
		{
			aimid = xtable.Properties.selectFightpetkey(roleId);
			if(aimid == -1)
				return;
		}
		else if(aimtype == PSceneSkill.GOAL_TEAM_ROLE)
		{
			Team team = TeamManager.selectTeamByRoleId(roleId);
			if(team == null)
				return;
			if(!team.getNormalMemberIds().contains(roleId))
				return;
			if(!team.getNormalMemberIds().contains(aimid))
				return;
		}
		SceneSkillConfig skillconfig = fire.pb.skill.Module.getInstance().getSceneSkillConfig(skillid);
		if(skillconfig == null)
		{
			Module.logger.error("ERROR: 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柟顔款潐閵堬妇鎲楅妶蹇斿闁跨喍绮欓弻锛勶拷锝庝簽鏁堥梺鍝勬湰濞叉繄绮诲☉姘炬嫹閿濆簼鎮嶉柟椋庡厴瀵挳鎮╅崗鍝ョ憹婵＄偑鍊栭悧婊堝磻閻愮儤鍋傞柕澶嗘櫆閻撶喖鏌￠崶鈺佷粶闁跨喕妫勫﹢閬嶆晸閼恒儳鍟查柟鍑ゆ嫹?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘⒑闂堟丹娑㈠川椤撱垻宕曢梻鍌氬�风粈浣圭珶婵犲洤纾婚柛娑卞灣缁憋箑螖閿濆懎鏆欓柛鎴犲Х閿熻棄绠嶉崕閬嵥囨导瀛樺亗婵炴垯鍨洪悡鏇㈡煏婢舵稓鍒伴柛鏃�宀搁弻锝堢疀婵犲啯鐝氶梺鍝勬湰閻╊垱淇婇幖浣肝ㄩ柕澶樺灡鐎氬綊鏌涢敂璇插箺鐎规洖寮剁换婵嬫濞戝崬鍓卞銈冨劚閻楀﹦鎹㈠☉銏犵闁绘劘娉涢ˉ婵嬫⒑閹颁椒娴峰ù婊庡墰濡叉劙骞樼�涙ê顎撻梺鍛婄箓鐎氬懘鏁愭径瀣幐闁诲繒鍋犻褎鎱ㄩ崒鐐寸厓闁靛鍨伴々顒勬煙閻熸澘顏┑鈩冩倐閺佸啴鏁撻悾灞筋棜妞ゆ牜鍋為埛鎴︽煙椤栧棗鎳愰鍥р攽閻欏懏瀚归梻渚囧墮缁夊绮堟径灞惧枑闁绘鐗嗙粭姘舵煃闁垮鐏撮柡宀嬬秮閹垽宕ㄦ繝鍕殥婵犵鍓濊ぐ鍐�﹂悜钘夎摕婵炴垯鍨归～鍛存煥濞戞ê顏╃�殿喓鍔戝铏瑰寲閺囩喐婢撻梺绋垮瑜板啴顢氶妷鈺佺妞ゆ帒鍊婚鏇㈡⒑缂佹ê濮﹂柛鎾寸洴閺佹捇鎸婃径瀣創濡炪値浜滈崯瀛樹繆閸洖骞㈡俊顖濇濡倿姊绘担渚劸闁哄牜鍓涢崚鎺撴償閳撅拷閺嬫牠鏌涜椤ㄥ棝鍩涢幒鎳ㄥ綊鏁愰崶銊ユ畬濡炪倖娲樼划宥囨崲濞戙垹绠甸柟鐑樻⒒椤旀帡鎮楃憴鍕妞ゎ偄顦辩划瀣箳閺冩挻瀚归柨婵嗙凹缁ㄥジ鏌ｆ惔顔煎⒋婵﹥妞介幃鐑藉级鎼存挻瀵栫紓鍌欑贰閸ｎ噣宕圭捄渚殨闁哄被鍎辩粻鐟懊归敐鍛础闁告瑥妫濆铏圭磼濡崵顦ラ梺绋匡工濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹. roleId = "+roleId+", skillId = " + skillid);
			return;
		}
		new PSceneSkill(roleId, skillid, aimid, aimtype).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800452;

	public int getType() {
		return 800452;
	}

	public int skillid; // 技能ID
	public int aimtype; // 技能使用目标类型 对自己角色使用==1，对自己战斗宠物使用==2，对正常队友角色使用==3
	public long aimid; // 技能使用目标ID，为队友角色ID

	public CUseSceneSkill() {
	}

	public CUseSceneSkill(int _skillid_, int _aimtype_, long _aimid_) {
		this.skillid = _skillid_;
		this.aimtype = _aimtype_;
		this.aimid = _aimid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(skillid);
		_os_.marshal(aimtype);
		_os_.marshal(aimid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		skillid = _os_.unmarshal_int();
		aimtype = _os_.unmarshal_int();
		aimid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CUseSceneSkill) {
			CUseSceneSkill _o_ = (CUseSceneSkill)_o1_;
			if (skillid != _o_.skillid) return false;
			if (aimtype != _o_.aimtype) return false;
			if (aimid != _o_.aimid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += skillid;
		_h_ += aimtype;
		_h_ += (int)aimid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(skillid).append(",");
		_sb_.append(aimtype).append(",");
		_sb_.append(aimid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CUseSceneSkill _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = skillid - _o_.skillid;
		if (0 != _c_) return _c_;
		_c_ = aimtype - _o_.aimtype;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(aimid - _o_.aimid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

