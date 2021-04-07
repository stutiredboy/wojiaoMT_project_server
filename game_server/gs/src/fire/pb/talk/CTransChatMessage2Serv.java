
package fire.pb.talk;

import fire.pb.HelpCountManage;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CTransChatMessage2Serv__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CTransChatMessage2Serv extends __CTransChatMessage2Serv__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		if(fire.pb.talk.ChatChannel.isShutUp(roleId))
			return;
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔戒氦闂傚倷绀侀幉锟犳偡閵夆晜鏅濋柕澶嗘櫅妗呴梺鍛婃处閸ㄤ即宕橀敓浠嬫⒑闂堟丹娑氫沪閻愵剦鍟囬梻鍌氬�烽懗鍫曗�﹂崼鐕佹闁归棿鐒﹂弲婵囥亜韫囨挾澧曢柦鍐枛閺屻劑鎮㈤崫鍕戙垻绱掗敓鐣岋拷锝庡枟閳锋帡鏌涢銈呮灁闁靛棙甯掗湁闁绘瑱鎷烽柛娆忓暙椤繘宕崝鍊熸閹峰鐣烽崶顏勫幁闂傚倷绀侀幉锟犮�冮崨鏉戠柈闁秆勵殕閸嬧晝锟界懓瀚竟瀣绩娴犲鍊甸柨婵嗙凹缁ㄤ粙鏌涘Ο缁樺�愭慨濠冩そ瀹曘劍绻濋崒姣挎洟姊洪崨濠勬噧濡ょ姵鎮傞垾锕傚炊椤掞拷闁卞洭鏌￠崶鈺佹毐闁归攱妞藉铏规兜閸涱厺姹楅梺绋款儐缁嬫帗绌辨繝鍥х缂佹妗ㄧ花濠氭⒑閻熼偊鍤熼柛瀣洴閹﹢鍩￠崒娆戠畾闂佸憡鐟ラˇ顖涙叏閸ヮ剚鐓冮悷娆忓閻忓锟借娲栭悥濂稿极閸岀偛绀堢憸蹇涘汲娴煎瓨鈷掗柛灞剧懆閸忓本銇勯鐐靛ⅵ鐎殿喚鏁婚、妤呭磼濠婂懐鍘梻浣筋潐閸庢娊顢氶鈧拷鍛村矗婢跺牅绨婚梺鍝勭▉閸嬪嫭绂掗敃鍌涚厽闁规儳顕ú鎾煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�?1闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾绾惧鏌ｉ幇顔芥毄闁活厽鐟╅悡顐﹀炊閵娧�妲堢紓渚婃嫹濠㈣埖鍔曠粻瑙勭箾閿濆骸澧┑锛勫帶椤╁ジ宕ㄩ娑欐杸濡炪倖姊归弸缁樼瑹濞戙垺鐓曢幖杈剧稻閻掓寧銇勯敃锟藉﹢閬嶆晸閸婄噥娼愭繛鍙夘焽閺侇噣骞掑Δ瀣◤濠电娀娼ч鎰板极閸曨兙浜滈柟鏉垮缁夊爼鏌ら弶鎸庡仴闁哄矉绱曟禒锔炬嫚閹绘帩鐎抽梻浣哥枃濡嫰藝椤栨繄浜介梻浣稿悑缁佹挳寮插☉娆愬弿閺夊牄鍔庣弧锟介梺姹囧灲濞佳勭閿曞倹鐓欑紒瀣閸熺偤鏌￠崨鏉跨厫闁诡垱妫冩俊鎼佸Ψ瑜忛弸锟介梻鍌欒兌缁垶銆冮崨瀛樺亱濠电姴鍟崹鏃堟倵闂堟稒鎲哥痪鎯с偢閹鏁愭惔鈥崇缂佺虎鍙�濞夋盯婀侀梺缁樻尭濞撮攱鏅堕敂鑺ュ弿濠电姴鍟妵婵堬拷瑙勬处閸嬪﹤鐣烽悢纰辨晝闁挎稑瀚弲濂告⒒閸屾瑧顦﹂柟璇х磿濠�浣虹磽娓氬洤鏋熼柣鐔叉櫊閻涱噣宕卞☉妯煎�為梺闈涱焾閸庢椽宕甸妶澶嬧拺闁告繂瀚峰Σ褰掓煕閵娿儳绉洪挊婵囥亜閺囶亝瀚瑰┑顔硷攻濡炶棄鐣峰锟藉畷锝嗗緞鐎ｎ亜澹嶉梻鍌欑閹芥粓宕抽妷鈺佸瀭闁割偅娲栫粻鏍旈敐鍛殲闁绘帟鍋愰敓钘夌畭閸庡崬螞濞戙垹鍌ㄩ柟闂寸劍閳锋垿鎮归幁鎺戝婵炲懏鍔欓弻鐔煎礄閵堝棗顏�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿顦甸弻鏇＄疀鐎ｎ亷鎷烽弴鐘电焼閻庯綆鍠楅埛鎺楁煕椤愩倕鏋旈柍绗哄劦瀵爼鍩￠崒锕侊拷鎸庢叏婵犲嫮甯涢柟宄版嚇瀹曨偊宕熼鐕佸悋闂傚倷鑳堕幊鎾诲吹閺嶎厼绠柨鐕傛嫹?
		if(funtype==FunModelType.FUN_TASKITEM){
			xbean.helpcount helpcount = xtable.Helpcount.select(roleId);
	    	int max=HelpCountManage.getInstance().getHelpItemNumMax(roleId);
	    	if(helpcount!=null&&helpcount.getHelpitemnum()>=max){
	    		MessageMgr.sendMsgNotify(roleId, 166087, null);
	    		return;
	    	}
		}
		if (funtype == FunModelType.QIU_ZHU) {
			xbean.helpcount helpcount = xtable.Helpcount.select(roleId);
	    	int max=HelpCountManage.getInstance().getHelpItemNumMax(roleId);
	    	if(helpcount!=null&&helpcount.getHelpitemnum()>=max){
	    		MessageMgr.sendMsgNotify(roleId, 166087, null);
	    		return;
	    	}
			//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌熼幆鏉啃撻柛濠傛健閺屻劑寮撮鍛伓婵＄偑鍊ら崢濂告倶濠靛﹦浜介梻浣稿悑缁佹挳寮插┑瀣庡洭顢涢悙鏉戯拷鍨殽閻愯尙浠㈤柛鏃�纰嶉妵鍕晜閸喖绁悗瑙勬礃閸ㄧ敻鍩為幋鐙呮嫹閿濆骸浜為柛妯绘崌閺屸剝寰勭仦鎴掓勃婵犮垻鎳撳Λ娑㈠箯鐟欏嫬顕遍悗娑欘焽閸橀亶姊虹紒妯荤闁稿﹤婀遍敓鑺ヨ壘缂嶅﹤顫忔繝姘＜婵炲棙鍨归悰銏犫攽閻愯泛顥嶇�规洜鏁婚獮蹇氥亹閹烘挸浜滈梺缁樻尭濞寸兘藝椤曪拷濮婅櫣娑甸崨顔兼锭闁荤姵鍔楅崰鏍极閹剧粯瀵犲璺侯煭閹风兘宕归鐐婵犻潧鍊婚…鍫ュ础閹惰姤鐓熼柡鍌涘閹牆鈹戦鑺ュ�愭慨濠勭帛閹峰懐绮电�ｎ偆绉烽柣搴ゎ潐濞叉﹢鈥﹂崶銊ь洸闁归棿绶￠弫鍌炴煕椤愶絿绠撻柛瀣Т椤啴濡堕崱妤冪懆闁诲孩鍑归崣鍐箖閿熺姴鍗抽柣鏃囨椤旀洟姊虹化鏇炲⒉闁挎艾鈹戦鍏煎枠闁哄矉缍�缁犳稓锟斤綆浜滄慨銏㈢磽娴ｄ粙鍝洪悽顖楋拷鎰佸殨妞ゆ洩鎷风�规洘甯掗～婵嬵敆閿熺晫绮婚敐澶嬧拻濞达絿鐡旈崵鍐煕閵娿倕宓嗙�规洦鍨跺鍫曞箣閻樿櫕顔曢梻浣虹帛濮婂鍩涢崼銉ユ瀬闁稿瞼鍋為悡鏇熺箾閹存繂鑸规鐐寸墱缁辨帡濡搁敐鍛Е濠殿喖锕︾划顖炲箯閸涙潙宸濆┑鐘插�瑰▓姗�姊绘担鍛婃儓闁活厼顦遍幑銏犫攽閸℃瑦娈惧┑鐘诧工閸熺娀寮ㄦ禒瀣�甸柨婵嗛娴滄粓鏌涢幘瑙勭彧缂佺粯鐩鍫曞箣濠靛洤锟筋垰鈹戦悙鎻掓倯闁荤啙鍛灊闁割偆鍠庣欢鐐烘煙闁箑骞橀柛妯绘崌濮婅櫣绱掑Ο鍨棟闂佸鏉垮闁跨喕濮ゆ穱娲綖婢跺本宕叉繛鎴欏灪閺呮煡鏌涘☉鍗炴灍闁诡喗鐟╁娲箰鎼淬垹顦╂繛瀛樼矤娴滎亪骞冩导鎼晪闁跨喍绮欏顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷?
			new mkdb.Procedure() {
				@Override
				protected boolean process() throws Exception {
					xbean.RoleRecourse roleRec = xtable.Rolerecourse.get(roleId);
					if (roleRec == null) {
						roleRec = xbean.Pod.newRoleRecourse();
						xtable.Rolerecourse.insert(roleId, roleRec);
					}
					
					//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濆鍫曞醇濮橆厽鐝旂紓浣界堪閸婃洝鐏冮梺鎸庣箓閹冲酣寮抽悙鐑樼厱濠电姴娲﹀☉褔妫佹径鎰厽婵☆垳鍎ら埢鏇㈡煕鎼达紕绠崇紒杈ㄥ浮閺佹挻绂掔�ｎ亞顦板銈嗘尵婵兘鏁嶅鍫熲拺闂傚牊渚楅悞楣冩煕鎼淬垹鈻曞┑鈩冩綑椤繘篓閻穱
					xbean.TaskRecourse taskRec = roleRec.getRecoursetask().get(taskid);
					if (taskRec == null) {
						taskRec = xbean.Pod.newTaskRecourse();
						roleRec.getRecoursetask().put(taskid, taskRec);
					}
					
					//闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘鏁撻懞銉р枔闁哄懏绻勯崚鎺戔枎閹惧磭顔婂┑掳鍊撻悞锕�鈻嶉弮鍫熲拻闁稿本鐟ㄩ崗灞俱亜椤撶偟澧︽い銏＄墵瀹曘劑顢涘鍛帬闂備焦鐪归崹濠氬极閹间焦鍎楁慨妯垮煐閳锋垶銇勯幒鐐村缂備礁顦伴幐鎶藉箖閻愯娲敂閸涱垰骞堥梻浣筋潐濠㈡﹢鎳熼鐐茬疇闁规澘鍙撻崶顒佹櫢闁跨噦鎷�
					if (!taskRec.getChannellist().contains(Integer.valueOf(messagetype))) {
						taskRec.getChannellist().add(messagetype);
					}
					
					return true;
				}
			}.submit();
		}
		
		boolean flag=ChatChannel.getInstance().process(roleId, messagetype, message, checkshiedmessage, displayinfos, 0);
		if(flag==true&&(funtype==FunModelType.FUN_DIELIVE_CLAN||funtype==FunModelType.FUN_DIELIVE_WORLD)){
			MessageMgr.sendMsgNotify(roleId, 162127, null);
		}
		if(flag == true && funtype == FunModelType.QIU_ZHU) {
			SChatHelpResult snd = new SChatHelpResult();
			snd.result = 0;
			gnet.link.Onlines.getInstance().send(roleId, snd);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 792433;

	public int getType() {
		return 792433;
	}

	public int messagetype; // 消息频道 MsgTye中所定义的部分
	public java.lang.String message; // 内容
	public java.lang.String checkshiedmessage; // 检测屏蔽字的纯文本
	public java.util.ArrayList<fire.pb.talk.DisplayInfo> displayinfos; // 显示道具、宠物、技能
	public int funtype; // 功能类型  类型编号对应FunModelType
	public int taskid; // 任务id

	public CTransChatMessage2Serv() {
		message = "";
		checkshiedmessage = "";
		displayinfos = new java.util.ArrayList<fire.pb.talk.DisplayInfo>();
	}

	public CTransChatMessage2Serv(int _messagetype_, java.lang.String _message_, java.lang.String _checkshiedmessage_, java.util.ArrayList<fire.pb.talk.DisplayInfo> _displayinfos_, int _funtype_, int _taskid_) {
		this.messagetype = _messagetype_;
		this.message = _message_;
		this.checkshiedmessage = _checkshiedmessage_;
		this.displayinfos = _displayinfos_;
		this.funtype = _funtype_;
		this.taskid = _taskid_;
	}

	public final boolean _validator_() {
		for (fire.pb.talk.DisplayInfo _v_ : displayinfos)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(messagetype);
		_os_.marshal(message, "UTF-16LE");
		_os_.marshal(checkshiedmessage, "UTF-16LE");
		_os_.compact_uint32(displayinfos.size());
		for (fire.pb.talk.DisplayInfo _v_ : displayinfos) {
			_os_.marshal(_v_);
		}
		_os_.marshal(funtype);
		_os_.marshal(taskid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		messagetype = _os_.unmarshal_int();
		message = _os_.unmarshal_String("UTF-16LE");
		checkshiedmessage = _os_.unmarshal_String("UTF-16LE");
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.talk.DisplayInfo _v_ = new fire.pb.talk.DisplayInfo();
			_v_.unmarshal(_os_);
			displayinfos.add(_v_);
		}
		funtype = _os_.unmarshal_int();
		taskid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CTransChatMessage2Serv) {
			CTransChatMessage2Serv _o_ = (CTransChatMessage2Serv)_o1_;
			if (messagetype != _o_.messagetype) return false;
			if (!message.equals(_o_.message)) return false;
			if (!checkshiedmessage.equals(_o_.checkshiedmessage)) return false;
			if (!displayinfos.equals(_o_.displayinfos)) return false;
			if (funtype != _o_.funtype) return false;
			if (taskid != _o_.taskid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += messagetype;
		_h_ += message.hashCode();
		_h_ += checkshiedmessage.hashCode();
		_h_ += displayinfos.hashCode();
		_h_ += funtype;
		_h_ += taskid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(messagetype).append(",");
		_sb_.append("T").append(message.length()).append(",");
		_sb_.append("T").append(checkshiedmessage.length()).append(",");
		_sb_.append(displayinfos).append(",");
		_sb_.append(funtype).append(",");
		_sb_.append(taskid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

