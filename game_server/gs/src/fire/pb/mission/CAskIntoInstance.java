
package fire.pb.mission;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

import fire.pb.mission.instance.PEnterInstanceMap;
import fire.pb.talk.MessageMgr;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAskIntoInstance__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAskIntoInstance extends __CAskIntoInstance__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		mkdb.Procedure askIntoInst = new mkdb.Procedure() {
			@Override
			protected boolean process()	{
				Long teamid = xtable.Roleid2teamid.select(roleid);
				if (teamid == null)
					return false;
				
				fire.pb.team.Team team = fire.pb.team.TeamManager.getTeamByTeamID(teamid);
				if (team == null)
					return false;
				
				final java.util.ArrayList<Long> roleids = new java.util.ArrayList<Long>();
				roleids.addAll(team.getNormalMemberIds());
				this.lock(xtable.Locks.ROLELOCK, roleids);
				
				xbean.InstanceAskInfo askInst = xtable.Instanceaskinfos.get(teamid);
				if (askInst == null)
					return false;
				
				if (!askInst.getAnswerinfo().containsKey(roleid)) {
					return false;
				}
				
				if (answer == 0) {
					askInst.getAnswerinfo().put(roleid, 0);
					String roleName = xtable.Properties.selectRolename(roleid);
					if (roleName == null)
						return false;
					List<String> para = new ArrayList<String>(1);
					para.add(roleName);
					for (Long rid : roleids) {
						if (rid != roleid) {
							MessageMgr.psendMsgNotifyWhileCommit(rid, 160211, para);
						}
					}
					
					/*if (insttype == 0) {
						ScheduledFuture<?> future = fire.pb.mission.instance.InstanceManager.askInstFuture.get(teamid);
						if (future != null) {
							future.cancel(true);
							fire.pb.mission.instance.InstanceManager.askInstFuture.remove(teamid);
						}
					}
					else if (insttype == 1) {
						ScheduledFuture<?> future = fire.pb.mission.instance.line.LineInstManager.askInstFuture.get(teamid);
						if (future != null) {
							future.cancel(true);
							fire.pb.mission.instance.line.LineInstManager.askInstFuture.remove(teamid);
						}
					}
					
					xtable.Instanceaskinfos.remove(teamid);*/
					
					SAnswerInstance answerInst = new SAnswerInstance();
					answerInst.roleid = roleid;
					answerInst.answer = 0;
					mkdb.Procedure.psendWhileCommit(roleids, answerInst);
					
					return true;
				}
				
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔芥祰闂傚倷鐒︽繛濠囧绩闁秴绠查柛銉墮閽冪喖鏌ㄥ┑鍡╂Ц婵☆偅锕㈤弻娑⑩�﹂幋婵囩彯闂佸搫妫庨崹鑽ゆ閹惧鐟瑰┑鐘插暙椤忚泛鈹戦悩鍨毄濠殿喖鐡ㄧ�靛ジ宕ㄧ�涙ê浠梻渚囧弿婵″洭宕ｉ崱娑欌拺闁告稑锕ｇ欢閬嶆煕濡搫鎮戝ǎ鍥э工鐓ゆい蹇撴噳閹锋椽姊洪崨濠勭畵閻庢凹鍙冭棢闁绘绮悡鏇㈡煟濡櫣锛嶅褜浜濋妵鍕即椤忓棛袦閻庤娲栫紞濠囥�侀弴銏狀潊闁靛繈鍨诲畵渚�姊绘担绛嬪殭闁告垹鏅槐鐐哄幢濞戞锛涢梺鍦亾閹苯鈻撴禒瀣彄闁搞儯鍔庨埦渚�鏌嶉柨瀣伌闁哄本绋戦埥澶婎潨閸繂顫犻梻浣烘嚀閸熻法锟芥矮鍗冲濠氬Ω閵夘喗鍍甸梺鍏兼倐濞佳囨晸閻ｅ本鏆╅柣銉邯瀵泛鈻庨悙顑囨煟鎼淬垻鍟查柟鍑ゆ嫹
				if (askInst.getAnswerinfo().size() != roleids.size()) {
					for (Long rid : roleids) {
						MessageMgr.psendMsgNotifyWhileCommit(rid, 166057, null);
					}

					if (insttype == 0) {
						ScheduledFuture<?> future = fire.pb.mission.instance.InstanceManager.askInstFuture.get(teamid);
						if (future != null) {
							future.cancel(true);
							fire.pb.mission.instance.InstanceManager.askInstFuture.remove(teamid);
						}
					}
					else if (insttype == 1) {
						ScheduledFuture<?> future = fire.pb.mission.instance.line.LineInstManager.askInstFuture.get(teamid);
						if (future != null) {
							future.cancel(true);
							fire.pb.mission.instance.line.LineInstManager.askInstFuture.remove(teamid);
						}
					}
					
					xtable.Instanceaskinfos.remove(teamid);
					return true;
				}
				
				//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸偅缍堝┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锝呭悁闁垶鏌＄仦鍓ф创闁糕晛瀚板畷姗�宕滆婵椽姊绘担鍝ワ紞缂侇噮鍨拌灋闁告劦鍠栭拑鐔哥箾閹寸們姘跺绩娴犲鐓曢柍鈺佸枤濞堛垹霉閻樿崵鐣烘慨濠呮缁瑩宕犻檱閸氼偅绻涚�涙鐭婇柣鏍帶椤曪絾绻濆顓炰簻闂佺绻愰崥瀣枍閵忋倖鈷戦悹鎭掑妼濞呮劙鏌熼崙銈嗗?
				SAnswerInstance answerInst = new SAnswerInstance();
				answerInst.roleid = roleid;
				answerInst.answer = 1;
				mkdb.Procedure.psendWhileCommit(roleids, answerInst);
				
				int nNum = 0;
				askInst.getAnswerinfo().put(roleid, 1);
				for (Integer ret : askInst.getAnswerinfo().values()) {
					if (ret == 1) nNum ++;
				}
				
				if (nNum == askInst.getAnswerinfo().size()) {
					xbean.InstanceInfoCol teamLeadreInfoCol = xtable.Roleinstancetask.get(team.getTeamLeaderId());
					if (teamLeadreInfoCol == null) {
						return false;
					}					
					int instanceZoneId = teamLeadreInfoCol.getLastinstanceid();
					
					if (insttype == 0) {
						ScheduledFuture<?> future = fire.pb.mission.instance.InstanceManager.askInstFuture.get(teamid);
						if (future == null)
							return false;
						future.cancel(true);
						
						fire.pb.mission.instance.InstanceManager.askInstFuture.remove(teamid);
						
						new PEnterInstanceMap(team.getTeamId(), instanceZoneId).call();
					}
					else if (insttype == 1) {
						ScheduledFuture<?> future = fire.pb.mission.instance.line.LineInstManager.askInstFuture.get(teamid);
						if (future == null)
							return false;
						future.cancel(true);
						
						fire.pb.mission.instance.line.LineInstManager.askInstFuture.remove(teamid);
						
						new fire.pb.mission.instance.line.PEnterLineMap(team.getTeamId(), instanceZoneId).call();
					}
					xtable.Instanceaskinfos.remove(teamid);
				}
				
				return true;
			}
		};
		
		askIntoInst.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805539;

	public int getType() {
		return 805539;
	}

	public short answer; // 1表示同意, 0表示不同意
	public int insttype; // 0 日常副本; 1时光之穴

	public CAskIntoInstance() {
	}

	public CAskIntoInstance(short _answer_, int _insttype_) {
		this.answer = _answer_;
		this.insttype = _insttype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(answer);
		_os_.marshal(insttype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		answer = _os_.unmarshal_short();
		insttype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAskIntoInstance) {
			CAskIntoInstance _o_ = (CAskIntoInstance)_o1_;
			if (answer != _o_.answer) return false;
			if (insttype != _o_.insttype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += answer;
		_h_ += insttype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(answer).append(",");
		_sb_.append(insttype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAskIntoInstance _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = answer - _o_.answer;
		if (0 != _c_) return _c_;
		_c_ = insttype - _o_.insttype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

