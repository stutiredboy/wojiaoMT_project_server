
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
			 mkdb.Trace.info("CRoleList====userid = -1  闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂磋閿熸枻绠撻、妤佹媴娓氼垱閿ゆ繝寰锋澘锟芥洟骞婃惔銊ュ瀭闁稿瞼鍋為悡锝夌叓閸ャ劌鍤繛鍏煎姍閺岋繝宕卞Ο鑲╃厜闂佸搫琚崝鎴﹀箖閵堝纾兼繛鎴烇供娴硷拷  =============");
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
		if (UniqName.exist("activeuser", String.valueOf(userID))!= UniqName.RPC_NOT_EXISTS) //闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘鏁撻懞銉р枔闁哄懏绻勯崚鎺戔枎閹惧磭顔婂┑掳鍊撻悞锕�鈻嶉弬搴撴斀闁绘ê鐏氶弳鈺佲攽椤栨稒灏︽鐐茬箻閺屻劎锟斤絻鍔嬬花濠氭椤愩垺澶勯柟绋款煼钘熼柣鎰劋閸婂灚鎱ㄥ鍡楀箹闁告繃妞介弻鐔碱敊缁涘鐣堕梺瀹犳椤︻垶鍩㈠澶嬫優妞ゆ劑鍨绘导宀勬⒑閹稿海绠橀柛瀣ㄥ�曢锝嗙鐎ｅ灚鏅濆銈嗗笂缁�渚�顢旈崼鏇熺厽闁绘柨鎽滈幊鍐倵濮樼厧娅嶆鐐搭殜瀹曟﹢顢欓挊澶涙嫹閸洜鍙撻柛銉ｅ妽閳锋帡鏌熼崘鍙夊殗闁哄本鐩獮鎺楀箻閾忣偉鐧侀梻浣规偠閸旀垹绮婚弽褜鍤曟い鎺戝鍞梺鎸庢婵倕顭块敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧潡鏌熸潏鍓х暠缂佺媭鍨堕弻銊╂偆閸屾稑顏�?,闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢绘俊鐐�栭悧婊堝磻濞戙垹鍨傞柛灞剧◤娴滄粓鏌″鍐ㄥ闁靛棙甯楅妵鍕煛閸屾粌寮ㄩ梺鍝勭灱閸犳牠骞冨鍐炬建闁糕剝顭囬弳锕傛⒒娴ｄ警鐒惧Δ鐘虫倐閺屽﹪鏁愭径濠勭暫濠德板�ч幏鐑芥煃閽樺妲搁柍璇茬Ч椤㈡顦辩紒銊ㄥ亹閿熻棄鐏氬妯硷拷姘煎墴椤㈡﹢宕楅悡搴ｇ獮婵犵數濮寸�氫即鎮伴幘缁樷拻濞达絿顭堥弳閬嶆煙绾板崬浜扮�规洘鍔栫换婵嗩潩椤掑倸寮ㄥ┑鐘灱閸╂牠宕濋弽顓熷亗闁哄洨鍠撶粻楣冩煕閳╁喚娈樼紒鐘插级閵囧嫰濡烽敂鍓х厜闂佸搫鏈ú鐔风暦閸楃倣鐔兼倻濡法妾ㄩ梺璇叉唉椤煤韫囨稑绀夌�广儱娲﹀畷鍙夌節闂堟侗鍎忕痪鎯у悑缁绘繃绻濊箛鏂款伓缂傚倷绶￠悡澶愬箯閿燂拷
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

