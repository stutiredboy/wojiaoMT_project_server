
package fire.pb.mission;

import fire.pb.map.DuplicateHelper;
import fire.pb.map.GridPos;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.move.DynamicSceneType;
import fire.pb.move.SRoleEnterScene;
import fire.pb.talk.MessageMgr;
import fire.pb.team.PAbsentReturnTeam;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;






// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CDefineTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CDefineTeam extends __CDefineTeam__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid <= 0) {
			return;
		}
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				Long teamId = xtable.Roleid2teamid.select(roleid);
				if (teamId == null)
					return false;
				
				Team team = TeamManager.selectTeamByTeamID(teamId);
				if (team == null)
					return false;
				
				if (answer == 1) {
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂佺偓鍎冲锟犲蓟閿濆顫呴柕蹇婃櫇閸旀悂姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繛鎴欏灩缁狅絾绻涢崱妤冪濞寸娀绠栧铏圭矙濞嗘儳鍓梺绋匡攻缁诲牆顕ｆ繝姘嵆闁绘棁娅ｉ鏇㈡偡濠婂啰肖闁跨喕濮ら崙褰掑储婵傜鐓濋柟鐐綑椤曢亶鎮楀☉娆樼劷闁告ü绮欓弻鐔煎礂閼测晜娈梺鎼炲妼椤兘宕洪敂鐣岀懝闁跨喍绮欓獮蹇涘箣閿曪拷绾拷闂佽绻楀畷鐢稿箠閹捐鐓橀柛鎰靛枛閸ㄥ倹銇勯弴鐐搭棡閻庢艾缍婇弻鈥愁吋鎼粹�茬凹閻庤娲栧鍓佹崲濞戙垹绠ｆ繛鍡楃箳娴犺偐绱撴担鍝勵�撶紓宥勭窔瀵鏁愰崼銏㈡澑闂佸搫鍠涢幏鐑芥煏閸モ晛鏋庨棁澶嬬節婵犲倸顏柣顓熷笚閵囧嫰濮�閳ュ啿鎽甸梺杞扮劍閸旀牕顕ラ崟顒傜瘈闁告洟娼ч弫鍫曟⒒閸屾瑧顦﹂柛姘儐缁傚秵绂掔�ｎ亞锛熷銈嗘穿閹烽攱顨ラ悙鑼缂佺粯绻傞～婵嬵敇濞戞瑥顏归梻鍌欑閹诧紕绮欓幋锔芥櫇闁靛牆妫欓崣蹇涙煥閺囶亝瀚归梻鍥ь槹缁绘繃绻濋崒姘间紑闂佹椿鍘界敮鐐烘晸閼恒儺鍟忛柛鐘冲哺閳ワ箓宕奸妷銉у弨婵犮垼鍩栭崝鏇綖閸涘瓨鐓ユ繛鎴灻鈺傤殽閻愭潙濮嶆慨濠勭帛閹峰懘鎼归獮鍖℃嫹婵犲洦鐓曢柟鎯ь嚟缁犳绱掗鐣屾噰妤犵偛娲鍓佹崉閵娧勭�梻鍌欒兌缁垶宕濋敃鍌氱闁挎洩鎷烽柍缁樻尰缁傛帞锟斤綆鍋嗛崢浠嬫⒑閻熸壆鎽犵紒璇插暞瀵板嫰宕熼娑橈拷鍨叏濡厧浜鹃悗姘炬嫹?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亜顒㈡い鎰Г閹便劌顫滈崱妤�鈷掗梺缁樺笂缁瑩寮婚妶鍡樺弿闁归偊鍓ㄩ幏鐑藉冀椤愵剚瀚规慨姗嗗墻閻撳ジ鏌″畝瀣М鐎殿噮鍣ｅ畷鎺戭潩椤戣法甯涚紓鍌氬�风欢銈夊箯瀹勯偊鐔嗛柤鎼佹涧婵洨绱掗悩鍙夎础缂佽鲸甯￠、娆忊枎閻愵剛绉锋俊鐐�曟绋课涘┑瀣摕闁挎稑瀚搁幏鐑芥晲鎼粹�茬凹濡炪們鍎遍悧鎾诲蓟閳ュ磭鏆嗛柨鐔剁矙瀹曚即骞囬澶屽姺闂婎偄娲︾粙鎴犵矆閸垺鍠愰煫鍥ㄧ☉濮规煡鏌ｅΟ鍏兼毄缁炬崘妫勯妴鎺戭潩椤掑﹥鏁鹃柣搴亢椤鎹㈠┑瀣潊闁挎繂鎳愰崢顐︽⒑閸涘﹥鈷愰柣妤冨█楠炲啴妾辩紒鐘崇洴楠炴﹢顢涘☉娆愭緫闂傚倷鑳剁划顖炩�﹂崼顫剨婵炲棙鍨规稉宥夋煛鐏炶鍔滈柛濠傜仛閹便劌螣閻撳簼澹曢柣搴㈢啲閹凤拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫炵紓浣界堪閸婃洟婀侀梺缁樏Ο濠囧磿韫囨洜纾奸柣姗�娼ч弸娑㈡煛鐏炶濡奸柍钘夘槸铻ｅ〒姘煎灟缁辨挸鈹戦悩鎰佸晱闁哥姵绋戦埢宥夊即閵忕姷鐤勯梺闈涱焾閸庢瑩鎮㈤悡搴＄�銈嗘⒐閸庡磭鏁崸妤佲拻濞达綀娅ｇ敮娑㈡煙缁嬫鐓奸柟顖氬椤㈡盯鎮欓懠鑸垫啺婵犵數鍋為崹鍫曟晝閳哄懏鍋傞柕澶嗘櫆閻撱儵鏌ｉ弮鍌氬妺婵炲懏娲滅槐鎺楊敊閼测晛顤�缂備焦顨堥崰鏍极閹惧顩烽悗锝庝簽閻ｅ搫鈹戦绛嬫闁归鍏橀弻鐔碱敊閸濆嫮浼堥悗瑙勬礃椤ㄥ﹪骞婇弽顓炵厸濞达絽鎽滈鎺旂磽閸屾艾锟界兘鎳楅崼鏇炵；闁圭偓鍓氶悢鍡樻叏濡ゅ瀚归柦妯荤箞閺岀喎鈻撻崹顔界彲闂佺懓鍢查崲鏌ワ綖濠靛鍊锋い鎺炴嫹妞ゅ骏鎷�
					long leaderroleId = team.getTeamInfo().getTeamleaderid();
					
					Role leaderRole = RoleManager.getInstance().getRoleByID(leaderroleId);
					
					GridPos gridPos = leaderRole.getPos().toGridPos();
					DuplicateHelper.enterDynamicSceneByIdWhileCommit(roleid, leaderRole.getMapId(), leaderRole.getScene(),
							gridPos.getX(), gridPos.getY(),
							DynamicSceneType.NORMAL_SCENE, SRoleEnterScene.CHEFU);
					
					PAbsentReturnTeam absentReturnTeamP = new PAbsentReturnTeam(roleid, 0);	
					mkdb.Executor.getInstance().schedule(new Runnable() {
						@Override
						public void run() {
							absentReturnTeamP.submit();
						}
					}, 2, TimeUnit.SECONDS);
				}
				else {
					String roleName = xtable.Properties.selectRolename(roleid);
					if (roleName == null)
						return false;
					List<String> para = new ArrayList<String>(1);
					para.add(roleName);
					for (Long rid : team.getNormalMemberIds()) {
						if (rid != roleid) {
							MessageMgr.psendMsgNotifyWhileCommit(rid, 160211, para);
						}
					}
				}
				return true;
			}
			
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805548;

	public int getType() {
		return 805548;
	}

	public short answer; // 1表示同意, 0表示不同意

	public CDefineTeam() {
	}

	public CDefineTeam(short _answer_) {
		this.answer = _answer_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(answer);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		answer = _os_.unmarshal_short();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CDefineTeam) {
			CDefineTeam _o_ = (CDefineTeam)_o1_;
			if (answer != _o_.answer) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += answer;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(answer).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CDefineTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = answer - _o_.answer;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

