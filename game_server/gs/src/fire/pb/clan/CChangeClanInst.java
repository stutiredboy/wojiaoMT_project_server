
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
				//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉潡寮婚敐澶婄鐎规洖娲ら崫娲⒑閸濆嫷鍎愰柣妤侇殘閹广垹鈽夐姀鐘殿吅闂佺粯鍔欏褔寮抽敓鐘斥拺闁荤喐婢樺Σ濠氭煕閵忥紕鍙�闁挎繄鍋涢埞鎴狅拷锝庡亜娴滄鏌熼崗鑲╂殬闁搞劍妲掗妵鎰償椤厾绠氶梺闈涚墕濞层倕鏆╅梻浣侯焾椤戝棝鎯勯姘辨殾妞ゆ牜鍎愰弫宥嗙節婵犲倸顏╅幖鏉戯工閳规垿鎮╃紒妯婚敪濡炪倖鍨甸幊鎰垝閸澁鎷烽敐搴′簴濞存粍绮撻弻鐔煎传閸曨厜銈夋煕閺傝法校闁靛洤瀚板顒勫箰鎼粹槅妲卞┑鐑囩到濞层倝鏁冮鍫濈畺婵炲棙鎼╅弫鍌炴煕閺団�崇厫閻庢艾缍婇弻鈥愁吋鎼达絼绮跺┑鐐村灦閻燂附鍒婇幘顔藉仭婵炲棗绻愰鈺冿拷娈垮枛濞尖�愁潖濞差亝顥堟繛鎴炶壘椤ｅ搫顪冮妶蹇曠窗闁告鍟块悾鐑藉箛椤撶姷鐦堝┑顔斤供閸橀箖宕ｉ崱娑欌拺闁告繂瀚粊鈺伱瑰鍕畼闁跨喕濮ら懝鍓х礊婵犲偆娼栧┑鐘宠壘閻愬﹦鎲稿鍏撅綁宕烽鐘碉紲缂傚倷鐒﹂…鍥╃不閺嶎偆纾肩紓浣诡焽缁犵偟锟借娲樼敮鎺楋綖濠靛鏁囬柣妯哄船椤ユ岸姊婚崒姘拷鐑芥嚄閸洍锟斤箓宕奸悤浣诡啍闂佸憡绺块崕濠氬箯瀹勬壋妲堥柟鐑樻尰閻濇牠姊洪悷鎵暛闁搞劌缍婇崺銉﹀緞閹邦剦娼婇梺缁橆焾鐏忣亪鏁撻挊澶屼虎妞ゎ亜鍟存俊鍫曞幢濡儤娈梻浣告憸婵挳鏌婇敐澶堬拷渚�寮崼鐔告闂佽法鍣﹂幏锟�
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

