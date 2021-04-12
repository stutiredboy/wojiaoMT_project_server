
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __COneKeyApplyTeamInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class COneKeyApplyTeamInfo extends __COneKeyApplyTeamInfo__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure onekeyteammatch = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{					
				Team team = null;
								
				team = TeamManager.getTeamByTeamID(teamid);	//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閳╁啯鐝曢梻浣藉Г閿氭い锔诲枤缁辨棃寮撮姀鈾�鎷绘繛杈剧秬濞咃綁濡存繝鍥ㄧ厱闁规儳顕粻鐐烘煙閽樺锟藉鏁撻弬銈囩У闁哥姵鐗犻幃娆愮節閸愶缚绨婚梺鐟版惈缁夊墎鎷归悧鍫滅箚妞ゆ劑鍨归弳娆撴煃鐟欏嫬鐏撮柟顔界懃椤斿繘顢欓崗纰卞晙濠碉紕鍋戦崐鏍暜閻旇桨鐒婃繛鍡樺灦椤洟鏌ｉ幇顒夊殶闁荤喎缍婇弻銊╂偄缂佹﹩妫勫銈嗘穿缂嶄線銆侀弴銏℃櫇闁跨喓鏅划鍫ュ礃閳瑰じ绨婚梺鍝勫暙濞层倖绂嶈ぐ鎺撶叆婵炴垶鐟ч惌濠囨煃鐟欏嫬鐏存い銏＄懇瀵剟濡堕崼顒佸閻犳亽鍔庡Λ顖涖亜閹捐泛顎岄柣鎺楃畺瀹曗剝娼忛妸锝勭盎闂佸搫绋侀崑鍕閿曞倹鐓冮梺鍨儏缁楁帡妫佹径鎰叆婵犻潧妫欑粊鈺呮煟閹烘柨浜鹃柕鍥у婵＄兘濡疯椤旀帡姊洪崫鍕拱缂佸鎹囬弫鎾诲棘閵堝洨校婵炲瓨绮嶇换鍫ｆ＂闂侀潧娴氬渚�骞忔搴㈠枂闁告洦鍓涢ˇ顓熺節閳凤拷閸曞灚鐤佸Δ鐘靛仜濡繂顕ｉ锟藉畷鐓庘攽閹邦厾绉遍梻鍌欒兌缁垵鎽悷婊勬緲閸熸挳鏁愰悙瀵哥瘈闁搞儯鍔夐幏濠氭⒑缁嬫寧婀伴柤褰掔畺閺佹捇鎳為妷锕�锟芥劗锟借娲橀崝娆撶嵁閺嶃劍濯撮柛婵勫劵缁鳖噣姊绘担鍝ョШ婵☆偉娉曠划鍫熸媴閸濆嫷妫滈悷婊呭鐢鎮″▎鎾粹拻闁稿本鍑归崵鐔搞亜閿旇偐鐣甸柡宀嬬秮婵¤埖鎯旈埄鍐邯闂傚倸娲らˇ鐢稿蓟濞戞粎鐤�闁规崘娅曢崐顖滅磽閸屾氨校闁搞劌婀卞Σ鎰板箳濡わ拷缁犳稒銇勯幘妤�瀚弳顓㈡⒒娴ｈ姤纭堕柛鐘虫礀铻為柛鏇ㄥ幘娑撳秶锟藉箍鍎遍ˇ顖滃閸ф鐓曟俊銈呭暕缁辫櫕绻涘顔荤凹闁哄懏绻堥弻娑樼暆鐎ｎ亶娲紓浣割儏缁绘ê顫忓ú顏勪紶闁告洦鍓欓崑宥夋⒑閹肩偛濡芥俊鐐扮矙楠炲啴鏁撻悩鍐蹭簻闂佺绻楅崑鎰板储閻㈠憡鈷掑〒姘搐瀵法绱掗悩鍐茬伌鐎殿喚顭堥埥澶愬閿涘嫬骞堥梻浣告惈閸婂綊顢栧▎鎾崇？闁哄啫鐗婇悡娑氾拷鐧告嫹閻庯綆鍓涜ⅵ婵°倗濮烽崑鐐烘晝閵忕姷鏆﹂柨鐔哄У閸婄兘鏌熺紒妯轰刊婵炲吋鐩濠氬磼濮橆剨鎷风粙妫垫椽濡舵竟锕�娲幃鐣岀矙閼愁垱鎲伴梻渚�娼ч…鍫ュ磿椤曪拷瀵劍绂掔�ｎ偆鍘遍梺铏嫕閹风兘鏌￠崨顔剧煉闁糕斂鍨介獮姗�寮妷锔芥澑闂備礁鐤囧Λ鍕涘Δ浣侯洸婵犻潧顑嗛悡鏇㈡煏婵炲灝鍔滈悹鎰ㄥ墲娣囧﹪宕ｆ径濠傤潚濡ょ姷鍋炵敮锟犵嵁濡櫣鏆﹂柛銉㈡櫇瀹撲礁鈹戦悩鍨毄闁稿鍋ゅ畷褰掑醇閺囩喎浠梺闈涱槴閺呪晠寮崒鐐寸叆闁绘洖鍊圭�氾拷 by changhao	
				if (team != null)
				{
					SOneKeyApplyTeamInfo msg = new SOneKeyApplyTeamInfo();
					
					msg.teamid = teamid;
					
					msg.memberlist.add(team.getTeamMemeberSimple(team.getTeamLeaderId()));
					
					for (xbean.TeamMember member : team.getTeamInfo().getMembers())
					{
						long memberid = member.getRoleid();
						
						msg.memberlist.add(team.getTeamMemeberSimple(memberid));
					}
					
					mkdb.Procedure.psendWhileCommit(roleid, msg);
				}
						
				return true;
			}
			
		};
		
		onekeyteammatch.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794517;

	public int getType() {
		return 794517;
	}

	public long teamid; // 队伍的ID by changhao

	public COneKeyApplyTeamInfo() {
	}

	public COneKeyApplyTeamInfo(long _teamid_) {
		this.teamid = _teamid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(teamid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		teamid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof COneKeyApplyTeamInfo) {
			COneKeyApplyTeamInfo _o_ = (COneKeyApplyTeamInfo)_o1_;
			if (teamid != _o_.teamid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)teamid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(teamid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(COneKeyApplyTeamInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(teamid - _o_.teamid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

