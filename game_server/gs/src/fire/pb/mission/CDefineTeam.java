
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
					//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倗鍋撶换娑㈠箣濞嗗繒浠鹃梺绋款儍閸婃繈寮婚弴鐔虹鐟滃秶锟芥凹鍘奸埢鎾村鐎涙鍘介柟鍏肩暘閸ㄥ鍩︽笟锟介幏鎴﹀础閻忚崵鎳撻埞鍐垂椤曞棙瀚归柡宥庡亝瀹曞弶绻涢幋娆忕仼缂佺媴缍侀弻锝堢疀閺冿拷閵囩喎霉濠婂嫮鐭掓い銏″哺閺佹劖寰勬繝鍕靛敶闂備礁鍚嬫禍浠嬪磿椤曪拷楠炲繑绻濆顓涙嫼闂佸憡绋戦敃銈嗘叏閿曪拷闇夋繝濠傚閻帞锟芥鍠氶…鍫ュ煡婢舵劕顫呴柨娑樺楠炴劙姊绘担铏广�婇柛鎾寸箘缁瑩骞囬弶璺ㄧ枀闂佺粯鍔﹂崜锕�鈻撴禒瀣厽闁瑰瓨绻冩径鍕倵濮樼偓瀚�?闂傚倸鍊搁崐鎼佸磹妞嬪孩顐芥慨姗嗗墻閻掍粙鏌ゆ慨鎰拷鏍拷姘煼閺岋綁寮崒姘粯缂備緤鎷峰鑸靛姇缁犲湱绱掗娆炬綈妞ゅ骸妫濋弻锛勶拷锝庡亝椤ュ牓鏌″畝锟介崰鎰焽韫囨稑绀堢憸蹇涘汲閻樼數纾藉〒姘攻鐎氳绻濋姀锝呯厫闁告梹鐗犻幃陇绠涢幘顖涙杸闂佺粯顭堢亸娆戠不閺屻儲鍊垫慨妯煎亾鐎氾拷?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁躲倕霉閻樺樊鍎忕紒鐘靛枛閺屻劌鈽夊Ο渚紓婵犳鍠涘▍鏇㈠箞閵娿儙鐔煎垂椤旀儳甯块梻浣虹帛閹稿鎯勯鐐茶摕婵炴垶锕╅悡銉╂煥閻旂儤娅曠紒顔肩墛缁楃喖鏁撴禒瀣畺婵鎷烽柟顔哄灲瀹曟鎳栭埡浣哥缂傚倷鑳堕崑鎾愁熆濮楋拷钘濋柟娈垮櫙閹峰嘲顫濋悙顒�顏�
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

