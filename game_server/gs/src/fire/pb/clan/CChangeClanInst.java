
package fire.pb.clan;

import java.util.List;
import java.util.Map;

import fire.pb.PropRole;
import fire.pb.clan.srv.ClanManage;
import fire.pb.instance.SInstaceConfig;
import fire.pb.instancezone.conf.InstanceZoneConfig;
import fire.pb.main.ConfigManager;
import fire.pb.npc.NpcServiceManager;
import fire.pb.npc.SNpcServiceMapping;
import fire.pb.talk.MessageMgr;
import fire.pb.util.MessageUtil;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangeClanInst__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChangeClanInst extends __CChangeClanInst__ {
	@Override
	protected void process() {
		// protocol handle
	
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				xbean.ClanInfo clanInfo = ClanUtils.getClanInfoById(roleid, false);
				if (clanInfo == null)
					return false;

				if (clanInfo.getClanmaster() != roleid && clanInfo.getClanvicemaster() != roleid) {
					MessageMgr.psendMsgNotifyWhileRollback(roleid, 166115, null);
					return false;
				}
			
				SNpcServiceMapping conf = NpcServiceManager.getInstance().getServiceMappingByServiceID(claninstservice);
				if (conf == null)
					return false;
				
				Integer instid = conf.getParam1();
				long now = System.currentTimeMillis();
				InstanceZoneConfig zoneconfig = fire.pb.instancezone.Module.getInstance().getInstanceZoneConfigs().get(instid.intValue());
				if (zoneconfig == null)
					return false;
				if (zoneconfig.inEnterTime(now)) {
					fire.pb.talk.MessageMgr.psendMsgNotifyWhileRollback(roleid, 166122, null);
					return false;
				}

				Map<Integer, SInstaceConfig> sInstaceConfig = ConfigManager.getInstance().getConf(SInstaceConfig.class);
				if (!sInstaceConfig.containsKey(instid))
					return false;
				
				SInstaceConfig instanceOne = sInstaceConfig.get(instid);
				if (instanceOne.getServiceid() != claninstservice)
					return false;
				
				xbean.ClanInstances clanInst = xtable.Claninstances.select(clanInfo.getKey());
				if (zoneconfig.beforeZoneId != 0) {
					if (clanInst == null)
						return false;
					
					if (!clanInst.getInststate().containsKey(zoneconfig.beforeZoneId))
						return false;
					
					if (clanInst.getInststate().get(zoneconfig.beforeZoneId) != 1)
						return false;
				}

				clanInfo.setClaninstservice(claninstservice);
				
				String mastername = new PropRole(roleid, true).getName();
				//濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倿鏌ｉ幘宕囧哺闁哄鐗楃换娑㈠箣閻愰潧鏆￠梺鐟板槻閸㈡煡锝炲┑瀣亗閹兼番鍨昏ぐ搴繆閵堝洤啸闁稿鐩畷顖烆敍濠婂嫬搴婂┑鐘绘涧椤戝懐绮堢�ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡濞ｅ洤锕幃娆擃敂閸曡埖瀚归柡宥庣仜濞戞瑦濯撮悷娆忓瀵潡姊洪棃娑氬妞わ缚鍗冲畷鎰節濮橆厾鍙嗛梺鍝勬祩娴滄繄锟芥艾缍婂濠氬炊瑜滃Σ鍦磼缂佹绠栫紒缁樼箞瀹曟帒顫濋鐘卞闂傚倷鑳堕…鍫燁殽閸濄儻鎷峰☉鎺撴珖闁瑰箍鍨归埥澶愬閻樿尪锟藉灝顪冮妶鍡樺暗闁哥姴閰ｉ、鏃堟晸閿燂拷
				ClanManage.addDealClanEventInfo(clanInfo,ClanManage.EVENT_CHANGE_INST_MAN,roleid, mastername,zoneconfig.name,"");
				
				mkdb.Procedure.psendWhileCommit(roleid, new SChangeClanInst(claninstservice));
				List<String> paras = MessageUtil.getMsgParaList(zoneconfig.name);
				fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 166121, paras);
				//List<String> paras2 = MessageUtil.getMsgParaList(mastername, zoneconfig.name);
				//fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(clanInfo.getMembers().keySet(), 166124, 0, paras2);
				return true;
			}
		}.submit();
		
	}
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808524;

	public int getType() {
		return 808524;
	}

	public int claninstservice; // 进入副本服务编号

	public CChangeClanInst() {
	}

	public CChangeClanInst(int _claninstservice_) {
		this.claninstservice = _claninstservice_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(claninstservice);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		claninstservice = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangeClanInst) {
			CChangeClanInst _o_ = (CChangeClanInst)_o1_;
			if (claninstservice != _o_.claninstservice) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += claninstservice;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(claninstservice).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CChangeClanInst _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = claninstservice - _o_.claninstservice;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

