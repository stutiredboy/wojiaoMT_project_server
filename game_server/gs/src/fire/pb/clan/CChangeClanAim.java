package fire.pb.clan;

import fire.log.beans.FactionOpbean;

import fire.pb.talk.MessageMgr;
import fire.pb.util.StringValidateUtil;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangeClanAim__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChangeClanAim extends __CChangeClanAim__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;

		if (!fire.pb.util.StringValidateUtil.checkIllegalWord(newaim)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 142261, null);
			return;
		}
		if (!StringValidateUtil.checkValidName(newaim)) {
			MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾捐鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ｅΟ鍏兼毄闁绘帒鍚嬬换娑㈠箻鐎电鏆￠梺褰掝棑閸忔﹢寮婚悢纰辨晬婵ê宕埅鐢告倵鐟欏嫭绀�鐎规洦鍓熼崺銉﹀緞婵炵偓鐎婚棅顐㈡处濞叉牜绱為敓锟�?$缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷鍫曟晸閽樺鏆ｆ鐐叉喘椤㈡瑩宕ｉ妷褏鎲归梻鍌欒兌椤㈠﹪骞撻鍡楃筏缂備焦顭囬々鑼喐閻楀牆绗氶柣鎾存礈閹插憡鎯旈妸锝忔嫹閸愵喖骞㈡繛鎴烆焽閺屟冾渻閵堝棗绗掗悗姘煎弮瀹曟劙宕奸弴鐔哄幗闂佸綊鍋婇崹浼存偂閹邦厹浜滈柕澶堝労濡叉椽鏌熼崣澶嬪�愮�殿喖鐖奸獮鎰償椤旀枻绱楅梻鍌欑閹碱偊寮甸鍌滅煓闁硅揪绠戦悡鈥愁熆鐠轰警鐓繛绗哄姂閺屾盯顢曢敐鍥╃暠缂備焦鍞荤紞渚�寮婚敐澶嬪亜闁告縿鍎抽悡浣糕攽閻橆喖鐏柨鏇樺灩閻ｇ兘骞囬弶鍧楁暅濠德板�ч幏鐑芥煢閸愵亜鏋涢柡灞剧☉閳藉宕￠悙瀵镐憾濠电姵顔栭崹浼搭敋椤撶姵顫曢柟鐑樻閹风兘鏁愭惔鈥崇缂佺虎鍘奸悥濂稿蓟濞戞鐔烘嫚閸欏鐧佹繝娈垮枛閿曘儱顪冩禒瀣畺闁斥晛鍟崕鐔兼⒔閸ヮ剙鏄ラ柣鎰劋閳锋垿鏌熺粙鍨劉缁剧偓鎮傞弻娑欑節閸愵亞鐣烘繛锝呮搐閿曨亜鐣疯ぐ鎺濇晝闁靛繈鍨婚悰顕�姊虹拠鎻掑毐缂傚秴妫濆畷妤�顫滈敓钘夘嚕閹间礁鍐�妞ゆ挾鍠庨敓钘夌仛椤ㄣ儵鎮欓懠顑胯檸闂佸憡姊瑰畝鎼佸蓟閿濆憘鏃堟晸閽樺）娑樷攽閸℃瑦娈鹃梺闈涚箞閸婃洜绮荤紒妯镐簻闁哄啫鍊瑰▍鏇㈡煕濡粯鍊愭慨濠呮閹瑰嫰濡搁妷锔惧綒闂備胶鎳撻崵鏍箯閿燂拷?$缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷鍫曟晸閽樺鏆ｆ鐐叉喘椤㈡瑩宕ｉ妷褏鎲归梻鍌欒兌椤㈠﹪骞撻鍡楃筏缂備焦顭囬々鑼喐閻楀牆绗氶柣鎾卞劦閺岋綁寮撮悙璇ф嫹閸︻叏鎷峰鐐
		if(newaim.contains("$")){
			MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		
		
		if (newaim.length() == 0) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 145091, null);
			return;
		}
		if (newaim.length() > fire.pb.clan.srv.ClanManage.AIMWORD_MAX) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 145112, null);
			return;
		}
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				xbean.ClanInfo clanInfo = ClanUtils.getClanInfoById(roleid, false);
				if (clanInfo == null) {
					fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 145077, null);
					return false;
				}
				if (clanInfo.getClanmaster() != roleid && clanInfo.getClanvicemaster() != roleid) {
					fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 150127, null);
					return false;
				}
				clanInfo.setClanaim(newaim);
				mkdb.Procedure.psendWhileCommit(roleid, new SChangeClanAim(newaim));
				fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 145074, null);
				// 闂傚倸鍊搁崐鎼佸磹妞嬪孩顐芥慨姗嗗墻閻掍粙鏌ゆ慨鎰拷鏍拷姘煼閺岋綁寮崒姘粯缂備緤鎷峰璺虹焿閹风兘鎯傞崨濠傤伓闂備礁鎲″ú锕傚磻閸℃稒鍋傞柟杈鹃檮閳锋垿鏌涘┑鍡楊仾鐎瑰憡绻堥弻娑㈡偐閺屻儱寮板銈冨灪绾板秴顭囪箛娑樜╅柨鏇嫹鐎殿喖鐏濋埞鎴︻敊缁涘顓洪梺鍦厴閺�閬嶅Φ閸曨垰围闁告侗鍙忛幏鐑藉垂椤曞懎娈ㄩ梺瑙勫劶濡嫬鏁梻浣稿暱閹碱偊宕愰悽绋跨闁告繂瀚峰〒濠氭煏閸繃顥滅紒妤�鍊块弻锝夊箳閻愬樊娲繛瀛樼矋閹倿銆佸锟介幃鈺呭礃閸欏锟介箖姊绘担鍛婃儓妞わ富鍨堕幃妯衡攽鐎ｎ偅娅㈤梺鑺ッˇ浼村磻閵壯嶆嫹濞堝灝鏋涙い顓炲槻閻ｇ兘濡搁埡濠冩櫓闂佽姤锚椤︿粙鏁撻懞銉﹀磳婵﹥妞藉Λ鍐煛娴ｇ儤袙闂備礁鎲¤摫缂侇喗鎸绘穱濠囨倻閽樺鍘搁梺绋挎湰缁矂鐛澶嬧拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟�?
				String name=xtable.Properties.selectRolename(roleid);
				if (name != null) {
					fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(clanInfo.getMembers().keySet(), 160367, 0,
							java.util.Arrays.asList(name, newaim));
				}
				// 闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾粌顣虹紓渚婃嫹濠㈣泛顑嗛崣蹇斾繆閵堝拋鍎愰悗姘辨嚀铻栭柣姗�娼ф禒婊勪繆椤愶絿绠炵�殿噮鍋婇獮妯硷拷闈涘濞村嫰鏌ｆ惔顖滅У闁稿妫濆畷銏ゅ箹娴ｅ厜鎷洪梺鍛婄☉閿曘倖鎱ㄨ缁辨帡鎮╅崘鑼紝閻庤娲樼换鍌烇綖濠靛洦缍囬柍鍝勫枦缁辨彃鈹戦悙瀛樼稇闁告艾顑夐幃鐑芥晜閹惧懏瀚规慨妯煎亾鐎氾拷
				xbean.ClanMemberInfo fmi = clanInfo.getMembers().get(roleid);
				FactionOpbean factionOpbean = new FactionOpbean(clanInfo.getKey(), clanInfo.getClanname(), 
						FactionOpbean.TYPE_CHANGE_AIM, fmi.getClanposition(), clanInfo.getMembers().size(),
						clanInfo.getClanlevel(), clanInfo.getHouse().entrySet());
				int weekpoint=fire.pb.clan.srv.ClanManage.getWeekclanpoint(roleid,clanInfo);
				fire.log.YYLogger.factionOPEventLog(roleid, factionOpbean,weekpoint);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808459;

	public int getType() {
		return 808459;
	}

	public java.lang.String newaim;

	public CChangeClanAim() {
		newaim = "";
	}

	public CChangeClanAim(java.lang.String _newaim_) {
		this.newaim = _newaim_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(newaim, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		newaim = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangeClanAim) {
			CChangeClanAim _o_ = (CChangeClanAim)_o1_;
			if (!newaim.equals(_o_.newaim)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += newaim.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(newaim.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}
