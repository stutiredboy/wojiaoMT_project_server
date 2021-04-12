
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
				//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘劙婀侀梺绋跨箰閸氬绱為幋锔界厱闁靛鍎遍敓钘夋健瀵鏁愭径濠勵啋閻庤娲栧ú銈夊传濞差亝鈷戦柛婵嗗閸庢劙鏌ｅΔ渚囨畼闁瑰箍鍨归埥澶愬閻樻鍚呴梻浣虹帛閸旀瑥顭囪瀵娊鏁撻悩鏂ユ嫼闂佽崵鍠愬妯何ｆ繝姘厱闁靛骏绱曢崣锟介梺鎸庣箘閸嬫盯鍩為幋鐙呮嫹閿濆骸浜滃ù婊勵殜閺岀喖宕楅懖鈺傛闂佹悶鍔嶅Σ鎺楀Φ閹邦厽鍎熸い顐幘缁犳岸姊洪棃娑氬婵炲眰鍊曢弳鈺呮⒒娴ｄ警鐒炬い鎴濇閹嫰顢涘杈ㄦ濡炪倖鐗滈崕鎰板极瀹ュ棛绡�濠电姴鍊搁鈺呭箹閺夋埊宸ラ柍瑙勫灴閹晝绱掑Ο濠氭暘婵＄偑鍊栭崹鐢稿箠閹邦喖鍨濋柛顐緛閹风兘鏁愭惔鈥茬按婵炲瓨绮嶇划鎾诲蓟閻旂厧浼犻柛鏇ㄥ帨閵堝鐓曢柡鍌濇硶鏍￠梺闈涙搐鐎氭澘顕ｉ鍕閹肩补妲呭Σ鍗炩攽閻戝洨鍒版繛灞傚�濋弫鍐敂閸繄鐣哄┑鐐叉閹尖晠寮崒鐐寸厱闁哄洠锟藉磭鍘柣搴㈣壘缂嶅﹪寮婚垾鎰佸悑閹艰揪绲肩划璺衡攽閻愭潙鐏﹂柣鐕傞檮閸掑﹪骞橀钘変画濠电偛妫楃换鎰邦敂閳哄喛鎷峰▓鍨灈婵炲皷锟芥剚娼栨繛宸簼椤ュ牊绻涢幋鐐跺妞わ絽鎼—鍐Χ韫囨洜绐楅梺鍛婎殔閸熷潡鎮鹃悜钘夌疀妞ゆ挾濮烽惁鍫濃攽椤旀枻渚涢柛姗�绠栧畷锝夊幢濞戞瑢鎷洪梺鍛婄箓鐎氼厾绮婇埡浼辩懓顭ㄩ崟顓犵暭闂佽法鍠曟慨銈夋嚌閸撗呯濠电姴鍋嗗鏍р攽閻樺疇澹橀柣鎰功閹茬顭ㄩ崗鎾呯秮瀹曠兘顢橀悩纰夌床缂傚倸鍊烽悞锕傗�﹂崶鈺冧笉闁哄稁鍋嗙壕鑲╃磽娴ｈ鐒界紒鐘靛仧閿熷�燁潐濞叉鏁幒妤嬬稏婵犻潧顑愰弫鍥煟濡搫鑸规い銉﹀哺濮婂宕掑顒婃嫹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂告偆娴ｈ鍟嶉梻浣告啞缁哄潡宕曟繝姘鐎瑰嫭澹嬪Σ鍫ユ煙閻戞ɑ灏伴柣婵囩墵濮婃椽鎮烽幍顔炬殯闂佹悶鍔岀紞濠囧春閵夛箑绶為柟閭﹀墻濞煎﹪姊虹紒姗嗙劸閻忓浚浜弫鎾绘寠婢跺奔铏庡銈庝簻閸熷瓨淇婇崼鏇炲耿婵☆垳鍎ゅ▓顐︽⒒娴ｅ憡鎲稿┑顔芥尦閺屽﹪鏁愭径鍫嫹娓氾拷瀵噣宕奸悢鍛婎仧闂備浇娉曢崳锕傚箯閿燂拷
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

