
package fire.pb.ranklist.getrankinfo;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRankGetInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忓爼鏌ｆ惔銈庢綈婵炴彃绻樺畷鏇㈠箮閼恒儲娅㈤梺鍝勫�堕崐妤冪矓閻㈠憡鐓曢柣妯虹－婢у崬顭跨憴鍕鐎规洜顭堣灃濞达絽鎼獮宥夋⒒娴ｇ瓔鍤冮柛銊ㄦ珪閺呰泛螖閸氳棄顦板鍕箛椤掑偆鍟囬梻浣告惈椤︿即宕烘繝鍥╁彆妞ゆ帒瀚悡娑㈡倶閻愰鍤欓柨鐔诲Г椤ㄥ﹤鐣烽悧鍫㈢瘈闁搞儜鍜佹敤闂備胶绮崝鏇炍熸繝鍌ょ劷闁兼亽鍎扮换鍡涙煟閹板吀绨婚柨鐔诲Г閻楃姴鐣峰┑瀣闁哄倸鐏濋悘濠傗攽閻愬弶顥滄繛瀛樿壘椤洭寮介妸褏顔曢悗鐟板閸犳洟骞夋ィ鍐╃厸濞达絽鎲￠ˉ銏ゆ煛鐏炶濮傞柟顔哄灲閹粌螣閼姐倕娑х紓鍌氬�风欢锟犲窗濡わ拷椤繑绻濆顓熸婵炲濮撮鍡椻槈瑜旈弻鐔兼嚍閵壯呯厑缂備礁顑呴ˇ顖烆敇閸忕厧绶為悗锝庡墮楠炲秹姊绘担绛嬪殐闁搞劌宕…鍨熷▎鐐瘣闂傚倸鍊烽懗鍓佸垝椤栫偛绠板┑鐘崇閸嬶繝鏌嶉崫鍕櫣闁藉啰鍠栭弻銊モ攽閸♀晜笑缂備胶濯寸紞渚�寮婚敐澶婄疀妞ゆ帊绶″Λ锟犳⒑閹肩偛濮�婵炲鐩、姘跺Ψ閳轰胶顦板銈嗙墬濮樸劑藝閺夋娓婚柕鍫濇婢ь剛绱掔�ｎ偅宕岀�规洏鍨介獮鏍ㄦ媴閸忓瀚奸梺鑽ゅУ娴滀粙宕濆畝鍕嚑鐎广儱娲ㄧ壕鍏笺亜閺冨倹娅曢柟鍐叉处椤ㄣ儵鎮欑拠褑鍚梺璇″枟閻熲晛鐣烽锕�绀嬮幖瀛樼☉婵倿鏌＄仦璇插鐎殿喗鎸抽、鏃堝川椤撗傜处闂備浇顕х�涒晠顢欓弽顓炵獥闁哄诞宀�鍔烽梺鐐藉劜閸撴艾顭囬弽銊х鐎瑰壊鍠曠花濠氭煙绾懎鐓愰柕鍥у楠炴鎹勬潪鎵崟濠电姷顣介崜婵嗩渻閽樺娼栭柧蹇氼潐閸犲棝鏌涢弴銊ュ闁跨喕濮ら崝妤冩閹烘鍋愮�规洖娲ら埛灞轿旈悩闈涗粶婵☆偅顨婇幃鎯р攽鐎ｎ偅娅㈡繛瀵稿Т椤戝棝寮查幖浣圭厸闁稿本锚閿熻姤顨堢划鏃堟偨閸涘﹦鍘遍梺缁樕戦崜姘枔濠婂牊鐓欐い鏃傛閹风兘寮妷锔绘綌闂備線娼ф蹇曟閺囥垹鍌ㄩ梺顒�绉甸埛鎴︽煛閸屾ê鍔滄繛鍛嚇閺屾盯鎮㈢捄鍝勭ギ濡ょ姷鍋涢敃顏勭暦濮楋拷椤㈡瑩鎮剧仦钘夌闂備浇顕ч崙鐣岀礊閸℃稑纾婚柛鈩冪☉閻撱垹霉閿濆懐鐣ù婊勭矒閺屾洘绻濊箛鏇炲煂闂佸憡妫戠粻鎾诲蓟閻旂⒈鏁婇柣锝呯灱閻撳鎮楃憴鍕闁绘牕鍚嬫穱濠囧箹娴ｈ倽銊︺亜閺冨洤鍚瑰璁规嫹?
 * @author changhao
 *
 */
public class CRankGetInfo extends __CRankGetInfo__ {
	@Override
	protected void process() {
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		switch(ranktype){
		case fire.pb.ranklist.RankType.ROLE_ZONGHE_RANK: //缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘遍梺闈涚墕閹冲酣顢旈銏＄厸閻忕偛澧藉ú瀛樸亜閵忊剝绀嬮柡浣瑰姍瀹曞崬鈻庡Ο鎭嶆岸姊婚崒娆掑厡妞ゎ厼鐗忛幃顕�顢曢敃锟界粈澶愬箹濞ｎ剙濡肩紒鐘靛枛閺岀喖姊荤�靛壊妲紓渚囧亜缁夊綊寮诲☉銏╂晝闁绘灏欐禒鑲╃磽娴ｉ绛忕紒鐘虫尭椤繐煤椤忓嫬绐涙繝鐢靛Т閸婃瓕顤傞梻鍌欑閹芥粍鎱ㄩ悽鎼烇拷鍐╃節閸屻倕娈ㄩ梺鍝勮閸庤京绮婚悷鎳婂綊鏁愰崨顔跨闂佸憡鐟ュΛ婵嗩潖閾忓湱纾兼俊顖濆吹椤︺儵姊虹粙鍖″伐婵狅拷闁秵鏅搁柤鎭掑劤閸熸煡鏌熼崙銈嗗,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К闂備胶顭堢悮顐﹀礉鎼淬劌绠熺紒瀣儥閸氬顭跨捄渚剰濞寸姴銈稿铏圭磼濡櫣浠奸梺鐑╁墲濡啫顕ｉ锕�骞㈡俊鐐存礀缂嶅﹪寮幇鏉垮耿婵☆垶鏅查搹搴㈢節绾板纾块柧蹇撻叄瀹曟娊鏁愰崪浣圭稁濠电偛妯婃禍婊勫閻樼粯鐓曢柡鍥ュ妼娴滄繃绻涢崼顐㈠籍婵﹨娅ｇ划娆撳礌閿熺姷鍙嶉柣搴ゎ潐濞叉粓寮幖浣哥闁圭儤鎸剧弧锟藉┑顔斤供閸撴盯鎯堥崟顖涒拺闁告挻褰冩禍鐐烘煕閻樿櫕宕岀�规洏鍨虹粋鎺旓拷锝庡亐閹锋椽姊洪崨濠勭畵閻庢凹鍓熷鍐测枎閹惧鍘辨繝鐢靛Т閸婂綊骞夐幖浣圭厸濞撴艾娲ゅ▍宥囷拷瑙勬礃缁秹骞忛崨瀛樻優闁谎冩憸鎼村﹪姊婚崒娆掑厡缂侇噮鍨堕弫瀣⒑閸濄儱鏋庢繛纭风節瀹曟椽濮�閵堝懎宓嗛梺闈涢獜缁辨洟宕㈤幖浣瑰�甸柣褍鎲＄�氬綊姊虹捄銊ユ瀺缂侇喗鐟ラ悾閿嬪閺夋垵鍞ㄥ銈嗘尵閸嬬喖鎮鹃崫鍕ㄦ斀闁绘顕滃銉╂煕濮橆叏鑰块柟顔哄灲瀹曟宕楅悡搴″闂傚倸鍊风欢锟犲磻閸涱垳鐭欓柟鐑樸仠閿熸垝绀侀～婊堟晸閽樺娼栧┑鐘宠壘绾惧吋绻涢崱妯虹瑨闁告ǚ锟芥剚娓婚柕鍫濋楠炴牠鏌ｅΔ浣瑰磳闁搞劑绠栭弫鍐磼閵堝棙娅嶉梻渚�娼х换鎺撴叏閻戠瓔鏁婇柛鈩冪♁閳锋垿鎮归幁鎺戝婵炲懏鍔欓弻鐔煎礄閵堝棗顏� by changhao
		case fire.pb.ranklist.RankType.PROFESSION_WARRIOR_RANK:
		case fire.pb.ranklist.RankType.PROFESSION_MAGIC_RANK:
		case fire.pb.ranklist.RankType.PROFESSION_PRIEST_RANK:
		case fire.pb.ranklist.RankType.PROFESSION_PALADIN_RANK:
		case fire.pb.ranklist.RankType.PROFESSION_HUNTER_RANK:
		case fire.pb.ranklist.RankType.PROFESSION_DRUID_RANK:
		case fire.pb.ranklist.RankType.PROFESSION_ROGUE_RANK:
		case fire.pb.ranklist.RankType.PROFESSION_SAMAN_RANK:
		case fire.pb.ranklist.RankType.PROFESSION_WARLOCK_RANK:
		case fire.pb.ranklist.RankType.ROLE_RANK:
		case fire.pb.ranklist.RankType.PVP5_LAST_GRADE1:
		case fire.pb.ranklist.RankType.PVP5_LAST_GRADE2:
		case fire.pb.ranklist.RankType.PVP5_LAST_GRADE3:
		case fire.pb.ranklist.RankType.PVP5_HISTORY_GRADE1:
		case fire.pb.ranklist.RankType.PVP5_HISTORY_GRADE2:
		case fire.pb.ranklist.RankType.PVP5_HISTORY_GRADE3:
			new PRankGetRoleInfo(rank,roleId,ranktype, id).submit();
			break;
		case fire.pb.ranklist.RankType.PET_GRADE_RANK:
			new PGetPetData(rank,roleId,0, id).submit();
			break;
		case fire.pb.ranklist.RankType.LEVEL_RANK:
		case fire.pb.ranklist.RankType.RED_PACK_1:
		case fire.pb.ranklist.RankType.RED_PACK_2:
		case fire.pb.ranklist.RankType.FLOWER_RECEIVE:
		case fire.pb.ranklist.RankType.FLOWER_GIVE:
			new PRoleInfoGet(rank,roleId, id, ranktype).submit();
			break;
			
		case fire.pb.ranklist.RankType.FACTION_RANK_LEVEL:
			
			new fire.pb.ranklist.getrankinfo.PFactionRankInfo(rank, fire.pb.ranklist.RankType.FACTION_RANK_LEVEL, roleId, id).submit();
			
			break;
			
		case fire.pb.ranklist.RankType.FACTION_ZONGHE:
		
			new fire.pb.ranklist.getrankinfo.PFactionRankInfo(rank, fire.pb.ranklist.RankType.FACTION_ZONGHE, roleId, id).submit();
			
			break;
			
		case fire.pb.ranklist.RankType.FACTION_COPY:
			
			new fire.pb.ranklist.getrankinfo.PFactionRankInfo(rank, fire.pb.ranklist.RankType.FACTION_COPY, roleId, id).submit();
			
			break;
		}
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810256;

	public int getType() {
		return 810256;
	}

	public int ranktype; // 排行榜类型
	public int rank; // 排名
	public long id;

	public CRankGetInfo() {
	}

	public CRankGetInfo(int _ranktype_, int _rank_, long _id_) {
		this.ranktype = _ranktype_;
		this.rank = _rank_;
		this.id = _id_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(ranktype);
		_os_.marshal(rank);
		_os_.marshal(id);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		ranktype = _os_.unmarshal_int();
		rank = _os_.unmarshal_int();
		id = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRankGetInfo) {
			CRankGetInfo _o_ = (CRankGetInfo)_o1_;
			if (ranktype != _o_.ranktype) return false;
			if (rank != _o_.rank) return false;
			if (id != _o_.id) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += ranktype;
		_h_ += rank;
		_h_ += (int)id;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(ranktype).append(",");
		_sb_.append(rank).append(",");
		_sb_.append(id).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRankGetInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = ranktype - _o_.ranktype;
		if (0 != _c_) return _c_;
		_c_ = rank - _o_.rank;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(id - _o_.id);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

