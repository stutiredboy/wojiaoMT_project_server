
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
								
				team = TeamManager.getTeamByTeamID(teamid);	//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠為柟钘夊�婚敓鏂ょ秵閸犳牠鎮欐繝鍐︿簻闁瑰搫绉剁拹鐗堜繆椤愩垹鏆欓柍瑙勫灴閹瑥顔忛鍏碱啀婵＄偑鍊栫敮鐔轰焊濞嗘垶顫曢柣鎰嚟閻熷綊鏌ㄩ悢缁橆棄妞ゆ洩缍侀、鏇㈡晝閿熺晫绮堥崘鈹夸簻闁哄啫娲ゆ禍褰掓煥濞戞瑧鐭婇柍瑙勫灴椤㈡瑩寮妶鍫嫹鐠恒劎妫い鎾跺閻掗箖宕℃潏銊ｄ簻闁哄稁鍋勬禒锕傛煃闁垮绗掗棁澶愭煥濠靛棙绁╅柣鎺斿亾閵囧嫰濡烽妷褏顔掗梺鍝勬湰缁嬫捇鏁撻弬銈囩У濞存粍绻堣棢闁靛浚婢侀幏椋庢喆閸曨剛顦繝鈷�鍕垫疁妤犵偛妫濆顕�宕煎┑鎰秱闂備胶绮摫鐟滄澘鍟撮敐鐐寸節閸ャ劉鎷婚梺绋挎湰閼归箖鏁撻懞銉﹀�愮�规洘鍔欓獮鏍ㄦ媴閸濄儻绱梻浣哥秺濡法绮堟担鍝勵棜鐟滅増甯楅悡娆撴⒒閸屾凹鍤熸い锔肩畵閺岋綁濡舵惔鈩冪亪闂傚洤顦甸弻娑滅疀閹捐櫕鍊紓鍌氱У閸ㄥ湱妲愰幒妤�绠涙い鎾楀嫮鏆梻浣芥硶閸犳洖螞閸曨厾涓嶇�广儱顦壕鍧楁煕濡ゅ啩绱虫繛宸簼閺呮繈鏌涘畝瀣洭缂佸绻樺娲传閸曨剙鍋嶉梺鎼炲妽濡炰粙骞冮敓鐘冲亜闁稿繗鍋愰崢鐢告⒒娓氬洤寮跨紒鐘冲灴瀵鈽夐姀锛勫幈闂佸搫鍊归娆撳磿閺冨牊鐓涚�癸拷鐎ｎ剛袦濡ょ姷鍋為敃銏犵暦閿熺姵鍊烽柟缁樺俯濞兼盯姊婚崒姘拷绋棵洪妶澹﹀洭鎮界粙鑳憰闂侀潧顭堥崕顕�寮ㄦ禒瀣厱闁虫拝鎷烽柡鍛矒閸┿垽骞橀弬銉︽杸闂佸疇妫勫Λ妤佺濠靛鐓曢柕濞垮劜鐠愨剝淇婇崣澶婂妤犵偞甯￠獮妯虹暦閸モ晝宓佸┑鐘垫暩閸嬬偤宕归崼鏇熷仭闁靛鏅╅弫鍌炴煥閻曞倹瀚� by changhao	
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

