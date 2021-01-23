
package fire.pb.battle.livedie;

import org.apache.log4j.Logger;

import fire.pb.PropRole;
import fire.pb.talk.MessageMgr;
import gnet.link.Onlines;

import java.util.ArrayList;
import java.util.Arrays;


import java.util.List;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAcceptInvitationLiveDieBattle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAcceptInvitationLiveDieBattle extends __CAcceptInvitationLiveDieBattle__ {
	@Override
	protected void process() {
		//缁绢収鍠栭悾楣冨及椤栨碍鍎婇柟鎭掑劚瑜板牓骞嬪Ο鐟板
		final long guestid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (guestid <= 0)
			return;
		
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				Long hostid=xtable.Livedie2key.select(guestid);
				//闁告帇鍊栭弻鍥及椤栨碍鍎婇柡鍫濐槷缁楀懘骞嬪Ο鐟板闁汇劌瀚Ч锟�
				if(hostid==null){
					return false;
				}
				String hostname=new PropRole(hostid,true).getName();
				String guestname=new PropRole(guestid,true).getName();
				if(hostname==null||guestname==null){
					return false;
				}
				List<Long> list = new ArrayList<Long>();
				list.add(hostid);
				list.add(guestid);
				mkdb.Lockeys.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, list));
				
				//闁兼儳鍢茬欢杈ㄧ▔鐎ｎ偄鐏涘☉鏃撶細娣囧﹪骞侀銈囩闁告帇鍊栭弻鍥及椤栨碍鍎婇弶鈺佹处濠�锟�
				xbean.LiveDieRoleInfo hostliveDieRoleInfo=xtable.Livedieroleinfotab.get(hostid);
				if(hostliveDieRoleInfo==null){
					return false;
				}
				if(System.currentTimeMillis()-hostliveDieRoleInfo.getInvitationtime()>LiveDieMange.getLiveDieTime()){
					logger.info("闁瑰瓨眉閸旂喎顔忛懠顒傜梾閺夆晛娲﹀﹢鈩冪?");
					return false;
				}
				//閻炴凹鍋呯�殿偊骞嬪Ο鐓庤礋閻庣娉涢々褔寮稿鍕彆缂備焦绻冪�殿偊骞嬪鍫㈢濞村吋鑹鹃懘濠囧礄閾忓綊鍏囩紓浣哄枛椤ｅ爼鏌嗛幘鏉戠倒缂侊拷缁♀晹X闁煎啿妫�?椤栨瑧鍟婂☉鎾崇У閺嗗秵绋夊绫漎濞戯拷?闁瑰瓨锕槐婵囦繆閸屾稓浜柟鎭掑劚瑜板牓骞愰幋鐐茬仜闁挎稑鑻崹顖氼嚕閻熸澘姣夌紒顖濆吹缁儤锛愰幋锔垮闁圭粯鍔楅妵姝慩X闁规亽鍎辫ぐ鍫熺閸濈悩Y闁汇劌瀚�殿偊骞嬪鍫㈢濞戞挸绨肩划顒佺▔?闁癸拷?
				if(acceptresult==1){//闁规亽鍎辫ぐ锟�
					hostliveDieRoleInfo.setAcceptflag(1);
					MessageMgr.sendSystemMsg(162067,Arrays.asList(guestname,hostname));
					SAcceptInvitationLiveDieBattle sAcceptInvitationLiveDieBattle=new SAcceptInvitationLiveDieBattle();
					Onlines.getInstance().send(guestid, sAcceptInvitationLiveDieBattle);
					//缂備焦鐟ラ妶浠嬪矗鐎ｎ偄绲圭紒锟�?
					MessageMgr.psendSystemMessageToRole(hostid,162115, Arrays.asList(guestname));
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162114, Arrays.asList(guestname));
					//婵烇綀顕ф慨鐐哄箣濡粯鐏�
					LiveDieMange.liveDieRoleids.put(hostid, guestid);
				}else{
					xtable.Livedie2key.remove(guestid);
					xtable.Livedieroleinfotab.remove(hostid);
					//閻庝絻顫夐弻鐔哥▔瀹ュ棙娈熼弶鈺佸閸剟宕氬▎鎰╅梺鍊熺簿缁绘洜绱掑▎蹇嬪仯
					fire.pb.item.Pack bag = new fire.pb.item.Pack(hostid, false);
					int cost=LiveDieMange.getLiveDieCostMoney();
					bag.addSysMoney(cost, "闁汇垻鍠愰鎾箣濮楋拷??闁搞儳鍋炴繛鍌炴煂?", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_shengsizhanyajin, 0);
					//缂備焦鐟ラ妶浠嬪矗鐎ｎ偄绲圭紒锟�?
					MessageMgr.psendSystemMessageToRole(hostid, 162087, Arrays.asList(guestname));
					MessageMgr.sendSystemMsg(162068,Arrays.asList(guestname,hostname));
					logger.info("闁汇垻鍠愰鎾箣濮楀牏绀夐悗浣冾潐婢ф粓骞忛幒鏃傚崪闁瑰憡鍨堕崹顒勬晬瀹�锟�??闁搞儳鍋炴繛鍌炴煂?,閻熸瑦甯熸竟濂縟"+hostid+"闂佸弶鍨块幐鍫曞极娴兼潙娅�"+cost);
				}
				return true;
			};
		}.submit();
	}
	public static final Logger logger = Logger.getLogger("BATTLE");
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793837;

	public int getType() {
		return 793837;
	}

	public long sourceid; // 目标玩家id
	public int acceptresult; // 0拒绝  1接受

	public CAcceptInvitationLiveDieBattle() {
	}

	public CAcceptInvitationLiveDieBattle(long _sourceid_, int _acceptresult_) {
		this.sourceid = _sourceid_;
		this.acceptresult = _acceptresult_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(sourceid);
		_os_.marshal(acceptresult);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		sourceid = _os_.unmarshal_long();
		acceptresult = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAcceptInvitationLiveDieBattle) {
			CAcceptInvitationLiveDieBattle _o_ = (CAcceptInvitationLiveDieBattle)_o1_;
			if (sourceid != _o_.sourceid) return false;
			if (acceptresult != _o_.acceptresult) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)sourceid;
		_h_ += acceptresult;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(sourceid).append(",");
		_sb_.append(acceptresult).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAcceptInvitationLiveDieBattle _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(sourceid - _o_.sourceid);
		if (0 != _c_) return _c_;
		_c_ = acceptresult - _o_.acceptresult;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

