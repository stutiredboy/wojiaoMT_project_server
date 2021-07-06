
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
				//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁樺姍濠�渚�姊虹粙璺ㄧ闁告艾顑囩槐鐐哄箣閿旂晫鍘遍梺闈涱焾閸庨亶鏁撻挊澶嬪仴鐎殿喖顭烽弫鎰緞婵犲嫷鍟嬮柣搴ゎ潐濞叉牕煤閵堝浼犳繛宸簼閳锋垿鏌涘┑鍡楊伌闁稿孩鍔欓弻锝呂旀笟鍥ㄧ暭闂佺懓绠嶉崹褰掑煡婢舵劕顫呴柣妯活問閸氬懘姊绘担铏瑰笡闁告梹鐟ラ…鍥樄鐎殿喗濞婇弫鎾绘偐閺傘儲瀚奸梻浣藉吹閸犳劕顭垮Ο浣曪絾绻濆顓犲幈闂侀潧楠忕槐鏇㈠矗閿熶粙姊洪幐搴ｇ畼闁稿鐩崺鐐哄箣閻欏懏瀚归柨婵嗛娴滄粌霉濠婂嫷娈滈柡宀�鍠栧畷妤呮嚃閳哄倹顔冮梻浣规偠閸斿秴危閹烘桅闁归偊鍘介崕鐔搞亜椤愵偄骞樼紒鐘冲哺濮婃椽妫冨☉姘暫濠电偛鐪伴崐鏇㈠汲閳哄懏鈷掑ù锝勮閻掔偓銇勯幋婵囶棦闁诡垰瀚伴、娑橆潩鏉堛劍顔曟俊鐐�栭悧婊堝磿閹版澘鏋佺�广儱妫涚弧锟芥繝鐢靛Т閸婃悂顢旈埡鍛闁哄鍩婂銉╂煃鐟欏嫬鐏撮柟顔规櫇缁辨帒螣婵犳碍鏆樺┑锛勫亼閸婃牠宕归悽绋跨疇闁归偊鍠栭崹婵嬫煕椤愵偅绶涢柟椋庡厴閺佹劖鎯旈垾鑼寜濠电偛鐡ㄧ划宥囧垝閹捐钃熼柣鏃傚帶娴肩娀鏌涢弴銊ュ辅闁靛牆顦伴悡鏇㈡煛閸屾繃纭堕弽锟犳⒑闂堟稒鎼愰悗姘緲椤曪綁顢楅崟顐ゎ唶闁硅偐琛ュΣ鍛ｉ崡鐐╂斀闁绘垵娲ㄩ崚鐗堢箾鐏炲倸锟芥繈寮崘顕呮晜闁割偅绻勯悾鍝勨攽閻愬弶顥為柟灏栨櫊瀵偊宕掗悙瀵稿幈闂佸搫娲犻敓钘夌－閸橆偊鏌ｆ惔銏ｅ缂傚秴锕濠氬灳閹颁礁鎮戦柟鑹版彧缁茶偐鍒掔捄琛℃斀闁绘劖娼欓悘锕傛煟閻曞倿妾柛鎺戯躬楠炴﹢顢欓挊澶夌敾婵犵數鍋涘Λ妤冩崲閹伴偊鏁傞柍鍝勫枦閹峰嘲鈻撻崹顔界亪濠电偛鐨烽敓鑺ュ墯濞兼牗绻涘顔荤凹妞ゃ儱鐗婄换娑㈠箣閻愯泛顥濆銈忕到閹碱偊鈥旈崘顔嘉ч煫鍥ㄦ礈缁愭姊洪崨濠庢當闁哥喎娼￠幃楣冩倻閽樺鐤�濡炪倖鎸炬慨鐑芥儊閸績鏀芥い鏃�鏋绘笟娑㈡煕濮楋拷缁犳牕鐣烽敐澶婂耿婵炴垶鐟㈤幏娲⒑閸涘﹦绠撻悗姘煎幘缁﹪鍩℃导杈╂嚀椤劑宕熼鐘垫毉闂備浇娉曢崰鏇熸叏閵堝鍤岄柛鎾楀懐顦繝鐢靛Т閸嬪棗顭囬弽褉鏀介柣妯虹枃婢规﹢鏌ｉ幇顒婂姛闁硅尙顭堥…銊╁礂閹惧懐绉�规洜鍏橀、姗�鎮╃喊澶屽簥缂傚倸鍊搁崐鐑芥倿閿曞倵锟斤箓宕堕埡鍐х瑝闂佸搫绋侀崑鍡欏閼测晝纾藉ù锝堫嚃閻掔晫绱掗悩闈涗户闁跨喎锟界噥娼愭繛鍙夘焽閺侇噣骞掑Δ瀣◤濠电娀娼ч鎰板极閸ヮ剚鐓熸俊顖氭惈閼歌銇勯妷锕�鍝烘慨濠傤煼瀹曟帒顫濋濠冨闁绘垼濮ら崵鍕煕椤愶絾纾甸柨鐔告灮缁犳挸鐣锋總鍛婂亞濞达綀顕栭崯宥夋⒒娴ｅ憡鍟炵紒鍝勬健瀹曟洘绻濆顒傤唵閻庣懓瀚竟瀣ｉ崼銉︾厵闁绘垶蓱鐏忎即鏌ｅ┑鍥╁⒌婵﹥妞介幃鐑藉箥椤旂偓娈梻浣规偠閸斿瞼绱炴繝鍥ф槬闁靛绠戠欢鐐烘煙闁箑澧绘繛鐓庯躬濮婅櫣绱掑鍡欏姼闁诲繐娴氭禍顏堝极閹剧粯瀵犲璺哄閾忓骸顪冮妶搴濈盎闁哥喎鐡ㄦ穱濠囧醇閺囩偛鑰垮┑鈽嗗灣閸庛倕鈻撻锔解拻濞达絽鎲￠幉绋库攽椤旇姤灏﹂柡灞斤躬閺佹劖寰勯崼顒佸濞撴熬鎷风�殿噮鍣ｅ畷濂告偄閸涘浠ч梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�
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

