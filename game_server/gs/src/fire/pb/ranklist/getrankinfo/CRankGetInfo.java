
package fire.pb.ranklist.getrankinfo;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRankGetInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏堕柣搴ゎ潐濞插繘宕曢幎鑺ユ櫢闁哄倶鍊楃粔鐢告煕閻樺磭澧卞瑙勬礋瀹曠螖娴ｅ搫骞嶉梻浣筋嚃閸ㄨ櫕鏅跺Δ鍚藉寰勯幇顒傤啇闂佸搫顦伴崺濠囩叕椤掑嫭鐓涢悘鐐额嚙閿熻姤顨婂畷鐗堢節閸パ咁攨闂佺粯鍔曞Ο濠傤焽閼恒儰绻嗛柣鎰典簻閿熻姤鐗犲畷婵嬪箳閺傚灝鐏婂┑鐐叉濞存艾顭囬弽銊х鐎瑰壊鍠曢幉楣冩煛娴ｅ憡顥㈤柡灞诲姂閹垽鎮滃Ο鑽ゅ涧缂傚倷绶￠崰妤�顫忔繝姘櫢濞寸姴顑嗗☉褔鏌熼懞銉х煁缂佸顦鍏煎緞鐎ｎ剙骞嶉梻浣筋嚃閸ㄥ崬顭垮Ο娆炬毐闂傚倷鑳剁划顖炲箰婵犳碍鍋￠柍鍝勬噹閽冪喖鏌ㄥ┑鍡╂Ц缂佺媴缍侀弻锝夊箛椤掍緡妫￠梺鎼炲姀濞夋盯顢氶妷鈺佺妞ゆ牗姘ㄩˇ鏉款渻閵堝棛澧紒瀣崌瀹曘垽骞栨担鍏夋嫼闁荤姵浜介崝宀勫几瀹ュ洨纾兼い鏃傛櫕閹冲洦顨ラ悙璇ц含闁诡喗鐟╁畷顐﹀礋鎼存稑濮傞柡灞诲姂瀵挳顢旈崨顓т紦闂佽瀛╅鏍窗閺嵮岀劷闁炽儲鍓氬鏍ㄧ箾瀹割喕绨婚柟纭呭煐閵囧嫰骞樼捄杞扮捕婵犵鍓濆钘夘潖閾忚鍠嗛柛鏇ㄥ墮閿熻姤鍔楃槐鎺楁偐瀹曞洤鈷屽Δ鐘靛仜濡鎮惧┑瀣櫢濞寸姴顑嗛弲鎼佹煛閸屾ê锟芥绮旈悽鍛婄厱闁绘ɑ鍓氬▓婊堟煙椤旂櫢鎷烽弬銉︻潔闂侀潧楠忕槐鏇㈠储闁秵鈷戦柡鍌樺劜濞呭懘鏌涢悢璺哄祮妤犵偛锕畷姗�顢欓悾灞藉箰闂佽鍑界紞鍡涘磻閸℃稑鐓㈠ù锝呯畭娴滄粓鏌曟繝蹇曞埌闁告棑绠撻弻鐔碱敊閻ｅ瞼鐓夐悗瑙勬礀閻栧吋淇婇幖浣肝ㄦい鏃囧吹婢讹拷?
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
		case fire.pb.ranklist.RankType.ROLE_ZONGHE_RANK: //缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氶梻鍌欒兌椤牏鎮锕�绀夐幖娣妼缁犵喖鏌熼梻瀵割槮缂侇偄绉归弻娑㈩敃閻樿尙浠肩紓浣风筏缁犳挸顫忓ú顏勫窛濠电姴鍊歌闂備礁鎽滄慨鐢搞�冩繝鍌ゅ殨闁哄被鍎辩粻鐟懊归敐鍛础闁告瑥妫濆铏圭磼濡崵顦ラ梺绋匡工濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟缁嬫鍚嬪璺侯儏娴犲ジ姊虹紒妯虹仼闁烩剝妫冨顐﹀幢濡炴洖缍婇弫鎰板幢濡晲铏庢繝纰夌磿閾忓酣宕抽敐鍜佹綎婵炲樊浜滄导鐘绘煕閺囥劌浜濇繛鍫弮濮婅櫣绮欓崠锟犵反閻庤娲滈弫鎼佸礆閹烘挾绡�婵﹩鍓涢惈鍕⒑閸撴彃浜為柛鐘虫崌瀹曘垺绂掔�ｎ偀鎷洪梺鍛婄箓鐎氼剟寮冲▎鎾寸厱濠电姴鍊归幉鎼佹煛娓氬洤娅嶇�规洘绮嶉幏鍛存惞閻у摜搴婇梻鍌欒兌缁垶鏁嬮梺鍝ュ枎濞硷繝宕洪姀銈呭嵆闁靛骏绱曢崢鎼佹倵閻у憡瀚归梺璺ㄥ枍缁瑥鐣锋导鏉戝唨妞ゆ挾鍋熼悾鍝勨攽閻樿宸ラ柛姘耿閹垽宕楅崗鐓庡姃闂傚倷绶￠崑鍛矙閹烘ぜ锟戒礁顫滈敓钘夘潖婵犳艾纾兼繛鍡樺笒閸樷�愁渻閵堝骸骞栭柣妤佹崌閸ㄩ箖鏁冮崒銈嗘櫍闂侀潧绻掓慨鐑筋敊閸℃稒鈷戦悹鎭掑妼濞呮劙鏌熼崙銈嗗 by changhao
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

