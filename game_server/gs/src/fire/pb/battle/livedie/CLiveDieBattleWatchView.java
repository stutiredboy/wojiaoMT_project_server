
package fire.pb.battle.livedie;

import fire.pb.PropRole;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
import gnet.link.Onlines;
import java.util.Map.Entry;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveDieBattleWatchView__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CLiveDieBattleWatchView extends __CLiveDieBattleWatchView__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				SLiveDieBattleWatchView sLiveDieBattleWatchView=new SLiveDieBattleWatchView();
				for(Entry<Long, Long> entry:LiveDieMange.liveDieFightRoleids.entrySet()){
					long oneid=entry.getKey();
					long otherid=entry.getValue();
					LDRoleInfoDes qCRoleInfoDes1 = createLDRoleInfoDes(oneid);
					LDRoleInfoDes qCRoleInfoDes2 = createLDRoleInfoDes(otherid);
					LDRoleInfoWatchDes lDRoleInfoWatchDes=new LDRoleInfoWatchDes();
					lDRoleInfoWatchDes.role1=qCRoleInfoDes1;
					lDRoleInfoWatchDes.role2=qCRoleInfoDes2;
					sLiveDieBattleWatchView.rolewatchlist.add(lDRoleInfoWatchDes);
				}
				Onlines.getInstance().send(roleid, sLiveDieBattleWatchView);
				return true;
			};
		}.submit();
		
	}
	
	/**
	 * 閻熸瑥鍊归崹顒傦拷浣冾潐婢ф粎鎷犻敂钘夊壈
	 * @param id
	 * @return
	 */
	public LDRoleInfoDes createLDRoleInfoDes(long id){
		PropRole propRole = new PropRole(id, true);
		LDRoleInfoDes lDRoleInfoDes = new LDRoleInfoDes();
		lDRoleInfoDes.roleid=propRole.getRoleId();//閻熸瑦甯熸竟濂峝
		lDRoleInfoDes.rolename=propRole.getName();//閻熸瑦甯熸竟濠囧触?
		lDRoleInfoDes.shape=propRole.getShape();//閻熸瑦甯熸竟濠囨焻閻樿尙锟斤拷
		lDRoleInfoDes.level=propRole.getLevel();//閻熸瑦甯熸竟濠勭驳婢跺矂鐛�
		lDRoleInfoDes.school=propRole.getSchool();//闂傚倶鍔嶅ǎ锟�
		Team team = TeamManager.selectTeamByRoleId(id);
		if(team!=null&&team.getTeamLeaderId()==id){
			lDRoleInfoDes.teamnum=team.getTeamInfo().getMembers().size()+1;//闂傚啰鍠嶇槐鐐躲亹閹惧啿顤呭ù婊呭劋閺嗭拷
			lDRoleInfoDes.teamnummax=TeamManager.MAX_MEMBER_COUNT+1;//闂傚啰鍠嶇槐鐐哄嫉?濠㈠爢鍌涚溄闁猴拷?
		}else{
			lDRoleInfoDes.teamnum=0;
			lDRoleInfoDes.teamnummax=0;
		}
		return lDRoleInfoDes;
	}
	
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793840;

	public int getType() {
		return 793840;
	}


	public CLiveDieBattleWatchView() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLiveDieBattleWatchView) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CLiveDieBattleWatchView _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

