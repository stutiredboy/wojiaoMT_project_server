
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
		//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃闁硅櫕鎹囬垾鏃堝礃椤忓孩瀚归柨婵嗙凹缁ㄧ粯銇勯幒瀣仾闁靛洤瀚伴獮鍥敂閸℃瑧鍘梻浣告惈閺堫剙煤閻旈鏆﹂柣鎾崇岸閺�浠嬫煙闁箑甯ㄩ柨鏂垮⒔绾捐棄霉閿濆懏鎯堟い搴＄焸閺屾盯濡搁妷褍鐓熼悗娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮堥柕鍥у瀵挳鎮欓幖顓燂紒闂佽瀛╅懝鍓х礊婵犲洤钃熸繛鎴欏灩缁犳盯姊婚崼鐔衡檨闁诲繐鐗嗚灃闁绘﹢娼ф禍濂告煕閵娧冨妺缂佸矁椴哥换婵嬪炊閵娿儻鎷烽悜鑺ュ�垫繛鎴炵懐閻掕姤銇勯敂鍝勫闁宠鍨块弫宥夊礋椤愶紕閽电紓鍌欑贰閸犳鎮烽埡鍛仒妞ゆ洩鎷风�规洘锕㈤、娆戝枈鏉堛劎绉遍梻鍌欑窔濞佳囨偋閸℃稑绠犻柟鏉垮彄閸ヮ亶妯勫┑顔硷龚濞咃絿妲愰幒鎳崇喓鎷犻懠顒夋殹缂傚倸鍊烽梽宥夊礉韫囨稑纾婚柟鐗堟緲缁�鍡涙煙閻戞ɑ澶勬俊鑼跺亹缁辨挻鎷呴搹鐟扮缂備浇顕ч悧鎾荤嵁閸愨晝顩烽悗锝庡亽濡啫鈹戦悙鏉戠仸妞ゃ劌鐗撻獮鎴﹀即閻旇櫣鐦堢紒鍓у钃辨い顐躬閺屾稓锟斤綆浜濋崵鍥煙椤旀儳鍘撮柛鈹惧墲閹峰懘鎮滃Ο娲诲晭闂佽崵鍠愮划搴㈡櫠濡ゅ啯鏆滈柟鐑樻⒒閻棝鏌涢锝囩細闁跨喕濮ょ敮鎺楋綖濠靛鏁嗗┑鐘插暞閺嗕即姊虹拠鎻掝劉濞ｅ洦妞介敐鐐村緞閹邦剛鐤勯梺闈涱焾閸庢瑩鎮㈤崗鐓庝簵闁圭厧鐡ㄧ换鍌炈夊鑸碘拺閻犲洦褰冮銏ゆ煟閺冩垵澧存鐐茬箻閺佹捇鏁撻敓锟�?
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
			Module.logger.error("ERROR: 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煙椤旀娼愰柕鍫閹叉濡惰箛鏂款伓闂佽法鍠嶇划娆撳蓟閿涘嫸鎷烽敐搴濈敖閺佸牓姊洪崫鍕拱婵炲弶绻勭划璇测槈濮樼偓瀚归柨婵嗙凹閹秹鏌熸搴″幋鐎殿喗鎸抽幃鈺呭礂閸濄儳鎲瑰┑锛勫亼閸婃牠鎮у鍫濈；闁绘劗鍎ら崑鍌炴煏婢跺棙娅嗛柣鎾跺枛閺岋繝宕堕埡浣风捕闂佽法鍠曞Λ鍕耿闁秵鏅搁柤鎭掑劤閸熸煡鏌熼崙銈嗗?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤濠�閬嶆晸閻ｅ本鍤�閻庢凹鍙冨畷宕囧鐎ｃ劋姹楅梺鍦劋閸ㄥ綊宕愰悙鐑樷拺闂傚牊涓瑰☉銏犲窛妞ゆ挶鍨诲畷鏇㈡⒒閸屾艾锟介绮堟担鍦彾濠电姴娲ょ壕濠氭煕濞戝崬鐏ｇ紒鎲嬬畱铻栭柨婵嗘噹閺嗘瑩鏌涢幋鐘残ラ柨鐔绘缁犲秹宕曢柆宓ュ洦瀵肩�涙ê浜楀┑鐐村灟閸ㄦ椽鎮￠弴銏＄厪濠㈣埖绋撻崚浼存煕閺冿拷瀹�鎼佸蓟閿濆牏鐤�濠电姴鍟悵姘舵⒑閸濆嫭婀伴柣鈺婂灡娣囧﹪骞栨担鑲濄劑鏌曟径妯虹仭閻庢艾缍婇弻娑㈡晜鐠囨彃绠洪悗瑙勬礀瀵墎鎹㈠┑瀣棃婵炴垵宕崜鍗烆渻閵堝啫鍔氶柣妤�锕﹂幑銏犫槈閵忕姷顓洪梺缁樺姌濞夋盯藟濠靛鈷戦柟棰佹濞村嘲霉濠婂骸澧版俊鍙夊姍楠炴锟芥稒锚椤庢捇姊洪崨濠勭畵閻庢艾鎳橀弫鎰緞鐎ｎ剙骞愰梺璇茬箳閸嬬娀顢氳閹便劑宕掗悙瀵稿帗闂侀潧顦介崹浼淬�呴鍕厵闁荤喐婢橀顓炩攽閳╁啯鍊愰柡浣稿暣閺佹捇鎮剧仦绛嬫濡炪倖鐗滈崑鐐哄煕閹达附鐓欐い鏍ф閹虫劙顢欓崶褉鏀介柣娆忔噺鐎氬綊姊绘笟鍥у缂佸顕划鍫熷緞鐏炴儳鏋戦梺缁橆殔閻楀棛绮鑸电厓闂佸灝顑呴悘鎾煛瀹�瀣М闁诡喓鍨藉畷銊︾節閸曨偄娈ュ┑鐘殿暯閸撴繆銇愰崘顔癸拷锕傛倻閽樺鎽曞┑鐐村灟閸ㄥ綊锝為崨瀛樼叆婵炴垶锚椤忊晝锟芥鍠撻崝鎴濐潖閾忕懓瀵查柡鍥╁枑濠㈡捇姊虹粙鍨劉鐟滄澘鍟撮、姘跺Ψ閳轰胶顦板銈嗗笒閸婂顢欓弴銏♀拺缂備焦锚婵箓鏌涢幘瀵告创闁轰焦鎹囬幐濠冨緞鐎ｎ偄鍓垫俊鐐�ゆ禍婊堝疮鐎涙ü绻嗛柛顐ｆ礀楠炪垺淇婇婵囶仩婵☆垰鍊垮缁樻媴娓氼垳鍔搁梺鍝勭墱閸撴盯宕氶幒鎾村劅闁虫拝鎷烽柡瀣墵閺屾稖顦虫い銊ユ閸╂盯骞掗幊銊ョ秺閺佹劙宕堕妸銉︾暚婵＄偑鍊栧ú妯煎垝瀹ュ洦宕叉繛鎴欏灩缁犵敻鏌熼悜妯烩拻妞ゆ梹甯￠幃妤冩喆閸曨剛顦銈庡亜椤﹁京鍒掔�ｎ喖绠抽柡鍐╂尰鐎氬綊鏌ㄥ┑鍡欏嚬缂併劌銈搁弻锝嗘償椤旂厧鈷嬪┑顔硷攻濡炰粙骞冮悜钘夌骇閹煎瓨鎸荤�垫牜绱撻崒娆戣窗闁革綆鍣ｅ畷鍦崉娓氼垰娈ㄩ梺鍝勮閸庤京绮婚悷鎳婂綊鏁愰崨顔跨闂佸憡鐟ュΛ婵嗩潖閾忓湱纾兼俊顖濆吹椤︺儵姊虹粙鍖″伐婵狅拷闁秵鏅搁柤鎭掑劤閸熸煡鏌熼崙銈嗗. roleId = "+roleId+", skillId = " + skillid);
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

