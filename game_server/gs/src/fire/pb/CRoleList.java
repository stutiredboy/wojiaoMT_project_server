
package fire.pb;
import java.util.Properties;

import gnet.link.Dispatch;
import gnet.link.Kick;
import gnet.link.Onlines;
import mkdb.util.UniqName;
import fire.log.Module;
import fire.pb.main.ConfigManager;
import fire.pb.state.StateManager;

import com.locojoy.base.Octets;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRoleList__ extends mkio.Protocol { }

/** 客户端发给服务器，请求已有角色列表
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRoleList extends __CRoleList__ {
	@Override
	protected void process() {
		
		final int userID = ((Dispatch)this.getContext()).userid;
		if(userID == -1){
			kickUser(-1000);
			 mkdb.Trace.info("CRoleList====userid = -1  闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒绾惧鍞归梺璺ㄥ枑閺嬭崵绮婚幘姹囷拷浣肝旀担鐟邦�撴繛鎾村嚬閸ㄩ亶鏌ㄩ妶鍡欑瘈鐎典即鏀卞姗�鏁撻懞銉︾妤犵偛锕ラ幆鏃堝Ω閵夈儳锟筋參姊虹粙璺ㄧ伇闁稿鍋ら幃锟犳晲婢跺苯褰勯梺鎼炲劘閸斿矂宕甸浣虹闁稿繒鍘ф慨宥夋煛瀹�瀣瘈鐎规洖宕灒闁兼祴鏅濋崢婊堟⒒娴ｅ憡鎯堥悶姘煎亰瀹曟繈骞嬮敃锟界粻鏍煏閸繍妲哥痪鎯у悑缁绘盯骞嬮悜鍥︾返婵炲銆嬮幏锟�  =============");
			return;
		}
		StateManager.logger.info(new StringBuilder("userID=").append(userID).append(" CRoleList"));
		
		fire.pb.main.ConfigManager manager = fire.pb.main.ConfigManager.getInstance();
		if (manager.isNeedActive()) {
			if (!checkUserAccount(userID)) {
				SUserNeedActive sUserNeedActive = new SUserNeedActive((byte) 0);
				Onlines.getInstance().sendResponse(this, sUserNeedActive);	
				return;
			}
		}
		if(manager.getLoginLimitType() != Module.LIMIT_NORMAL_MODE && manager.getUserIDList().size() != 0){
			if(manager.getLoginLimitType() == Module.LIMIT_BLACLIST_MODE){
				if(manager.getUserIDList().contains(userID)){
					Onlines.getInstance().sendResponse(this, new SCreateRoleError(manager.getErrorType()));	
					return;
				}
			}else if(manager.getLoginLimitType() == Module.LIMIT_WHITELIST_MODE){
				if(!manager.getUserIDList().contains(userID)){
					Onlines.getInstance().sendResponse(this, new SCreateRoleError(manager.getErrorType()));	
					return;
				}
			}
		}
		
		long curTime = System.currentTimeMillis();
		xbean.UserPunish userPunish = xtable.Userpunish.select(userID);
		if (userPunish!=null){
			if (curTime<userPunish.getReleasetime()){
				if (!userPunish.getRecords().isEmpty()) {
					try {
						String reason = userPunish.getRecords().get(userPunish.getRecords().size()-1).getReason();
						long endtime = userPunish.getReleasetime();
						Onlines.getInstance().sendResponse(this, new SGACDKickoutMsg(reason, endtime));
					} catch (Exception e) {
						Module.logger.error("send kickoutmsg error", e);
					}
				}
			//	Onlines.getInstance().kick(roleid, -1000);
				kickUser(-1000);
				//p1.send(this.getConnection());
				return;
			}
		}
		
		Integer blisgm = xtable.Auuserinfo.selectBlisgm(userID);
		boolean isGm = false;
		if (blisgm!=null&&(blisgm==1||blisgm==2)) 
			isGm = true;
		Onlines.getInstance().getConnectedUsers().online(this,isGm);
		Properties prop = ConfigManager.getInstance().getPropConf("sys");
		String value = prop.getProperty("sys.apps.cheat");
		fire.pb.SNotifyShieldState sNotifyShieldState = new SNotifyShieldState((byte) 0);
		if (value!=null&&value.equals("0")){
			sNotifyShieldState.state = 1;
		}
		Onlines.getInstance().sendResponse(this, sNotifyShieldState);	
	}
	
	private boolean checkUserAccount(int userID) {
		if (UniqName.exist("activeuser", String.valueOf(userID))!= UniqName.RPC_NOT_EXISTS) //闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰绠婚柡浣规崌閹崇偤濡疯閺嬫棃姊洪崫鍕櫤缂佽瀚板畷姘跺箳閹存梹鐎婚梺瑙勫劤绾绢參顢欐繝鍌楁斀閹烘娊宕愰幘缁樺�块柨鏇嫹闁宠绉瑰顒佹償閹惧瓨鏉搁梻浣虹帛閿氶柣蹇斿哺瀵娊鍩℃担鍙夋杸濡炪倖鐗楃粙鎺斾焊閿旂瓔娈介柣鎰皺缁犲鏌＄仦璇插闁跨喐鏋荤徊濠氬礉鐎ｎ剝濮冲┑鐘崇椤ュ﹥銇勯幇鈺佺仾濠㈣泛瀚伴弻鐔虹矙濞嗗墽鍚嬮柦妯煎枛閺岋綁骞囬鐓庡闂佺锕ら悘姘跺箞閵娿儺娼ㄩ柛鈩冾殔缁犲綊姊洪崨濠勭畺婵＄偘绮欏濠氭偄绾拌鲸鏅╃紓浣圭☉椤戝棝鎮鹃崼鏇熲拺閻庡湱濮甸ˉ澶嬨亜閿旇鐏﹂柛鈹垮灩椤撳吋寰勭�ｎ偄鍔掓俊鐐�栭崝鎴﹀垂缂佹ê顕辩�癸拷閸曨兘鎷洪梺鍦焾濞撮绮诲锟介弻娑氾拷锝冨妼閿熻姤娲熼、姘舵晲閸℃瑯娴勯柣搴到閻忔岸寮插┑鍡╂富闁靛牆妫楃粭鍌滅磼閿熻姤绗熼敓浠嬨�侀弮鍫濋唶闁哄洨鍠撻崢浠嬫⒑缂佹ɑ鐓ラ柟鑺ョ矒楠炲﹪宕橀钘夛拷鍨叏濡厧甯舵繛鍛У椤ㄣ儵鎮欓幖顓熺杹閻庤娲橀敃銏ゃ�佸▎鎾村癄濠㈣埖绋掔�氬綊鏌涢锝嗙闁告瑦鎹囬弻娑㈠Ψ閿濆懎顬夐梺鎶芥敱鐢繝寮婚悢鐓庣闁告瑥顦▓妤呮⒑閸濆嫭婀伴柣鈺婂灦閻涱噣骞掑Δ锟界粻濠氭煣韫囷絽浜柣褌绶氬缁樻媴鐟欏嫬浠╅梺鍛婃⒐閸ㄥ湱鍒掓繝姘唨鐟滄粓宕甸弴鐔翠簻闁圭儤鍨甸鈺呭船椤栫偞鈷戦柟绋垮椤ュ棗鈹戦鍝勶拷鏇⑩�﹂崸妤佹櫢闁跨噦鎷�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤濞硷繝寮婚悢鍛婄秶闁告挆鍛缂傚倷鑳舵刊顓㈠垂閸洖钃熼柕濞炬櫆閸嬪棝鏌涚仦鍓р槈妞ゅ骏鎷�?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垻绮穱濠囨倷椤忓嫸鎷烽弽顓熷亱婵犲﹤鐗嗙壕缁樼箾閹存瑥鐏╅柛銊ュ�块弻娑氫沪閸撗�妫ㄦ繛瀛樼矋缁捇寮婚垾鎰佸悑闁告劑鍔岄‖瀣⒑闂堟稒顥為悽顖涱殜婵＄敻宕熼姘卞幐闂佺鏈划灞筋嚕閵娾晜鈷戦柛婵嗗閻忛亶鏌涢悩宕囧⒌妤犵偛鍟…銊╁礃閻愵剙缂撻梻浣虹《閸撴繈鈥﹂崶顒�姹查柨鏇炲�归埛鎺懨归敐鍕劅闁绘帗鍎宠灃闁绘娅曢崐鎰版煛鐏炴枻韬柡浣瑰姈瀵板嫭绻濋崟顓熸瘒濠电姴鐥夐弶鍖℃嫹瑜旈獮蹇涙倻閼恒儳鍘撻梺鑺ッˇ钘壩ｉ幖浣圭厓閻犲洩灏欐晥濡炪們鍨洪…鍫ニ囨潏鈺冪＜闁靛鍔屾禍褰掓煥閻旂粯顥夐柣蹇旇壘椤灝螣绾攱瀚规慨妯煎帶婢у瓨銇勯姀鈽呰�跨�规洘顨婇幃鈩冩償閿濆洨宓佹繝鐢靛Х閺佸憡鎱ㄧ�甸潻鎷峰顐㈠祮闁诡喕鍗抽獮妯肩磼濡攱瀚藉┑鐐舵彧缁插潡鈥﹂崼銉ユ辈闂侇剙绉甸悡娆戠棯閺夊灝鑸瑰ù婊勫閿熷�燁潐濞叉﹢宕濋弽顐ｅ床婵犻潧妫鈺傘亜閹烘垵锟界顕ｉ妸銉㈡斀闁绘﹩鍠栭悘閬嶆煕閳哄倻澧电�规洘绻堝浠嬵敇閻旇渹绨甸梻浣告惈濞层劑宕伴幘鍓佷笉濡わ絽鍟悡鏇㈡煃閳轰礁鏋ゆ繛鍫燁焽缁辨帡鎮╅幓鎺旈獓闂侀潧娲ょ�氱増淇婇悜鑺ユ櫆闁告挆鍛辅闂傚倷绀侀幖顐﹀嫉椤掞拷鐓ら柣鏃堫棑閺嗭箓鏌涘Δ鍐拷锝夋偄閸忕厧锟界粯淇婇婵囩《婵′勘鍔戝铏规嫚閸欏鏀銈庡亜椤︻垳鍙呴棅顐㈡处缁嬫垹绮堟径宀嬫嫹楠炲灝鍔氭繛璇х畱閻ｇ兘宕ｆ径宀�鐦堥梻鍌氱墛娓氭宕曡箛鏇犳／闁诡垎鍐╁�紓浣虹帛缁诲啰鎹㈠┑濠勭杸闁哄倹顑欐导鎾剁磽閸屾艾锟介娆㈤敓鐘冲亗濠㈣埖鍔曠粻顖炴煥閻曞倹瀚�
			return true;
		
		return false;
	}

	private void kickUser(int error) {
		Kick p1 = new Kick();
		p1.linksid = ((Dispatch)this.getContext()).linksid;
		p1.action = Kick.A_QUICK_CLOSE;
		p1.error = error;
		Onlines.sendProtocl(p1, this.getConnection());
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786433;

	public int getType() {
		return 786433;
	}


	public CRoleList() {
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
		if (_o1_ instanceof CRoleList) {
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

	public int compareTo(CRoleList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

