
package fire.msp.npc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GCreateNpcUniversalReq__ extends mkio.Protocol { }

/** GS 发送地图模块 请求创建NPC
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GCreateNpcUniversalReq extends __GCreateNpcUniversalReq__ {
	@Override
	protected void process() {
		// protocol handle
		
		if (!npclist.isEmpty()){
			// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎处缁绘繂顕ラ柨瀣凡闁跨喕濮ゅú鐔风暦椤栨稑顕遍悗娑櫭崜鐟扳攽閻愬弶顥為柟绋款煼閹�斥枎閹炬潙锟界敻鏌ｉ姀鈽嗗晱闁绘帡绠栧畷顖炲传閵壯咃紲闂佽鍨庨崘顏嗏棨缂傚倷绶￠崰妤呮偡閳轰緡鍤曞┑鐘崇閸嬪嫰鏌ц箛鎾磋础闁挎稒绮岄埞鎴﹀煡閸℃浠銈庡幖閻楀﹦绮嬮幒妤�违闁跨噦鎷�
			java.util.List<fire.msp.npc.NpcInfo> resultlist = new java.util.LinkedList<fire.msp.npc.NpcInfo>();
			
			for (CreateNpcInfoUniverse info:npclist){
				java.util.List<fire.msp.npc.NpcInfo> rlist = fire.pb.scene.manager.SceneNpcManager.getInstance().createNpc(info);
				// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉湱鎹㈠☉姗嗗晠妞ゆ棁宕甸惄搴ｇ磼閻愵剙鍔ゆ繛纭风節瀵濡堕崥銈呮贡閿熸枻缍嗛崑鍛存偟閺冨牊鈷戦柟鑲╁仜婵＄晫绱掔拠鑼ⅵ鐎殿喛顕ч埥澶愬閻樻鍟嬫繝寰锋澘锟窖囧箯閻戣姤鍊垫慨妯煎帶婢у锟芥鍠楅幃鍌氱暦閹烘鍊风紒顔款潐鐎氬ジ姊绘担鍛婅础妞ゎ厼鐗忛敓鑺ョ▓閺呯姾妫㈤梺绯曞墲閵囨盯寮ㄩ懞銉ｄ簻闁哄倹瀵ч幆鍫ユ煥閻旇袚闁绘绮庨崚鎺旓拷锝庝憾閸氬顭跨捄濂铰ゎ槻妞ゎ叀娉曢幑鍕瑹椤栨艾澹嬮梻浣告啞钃遍柟顔煎�搁～蹇涙惞閸︻厾鐓撻梺鍦焾鐎涒晠骞忔潏鈺冪＝濞达絽澹婇崕鎰版煕閵娿儲鍋ラ柕鍡曠椤繈顢楁径灞藉汲闂備礁鎲℃笟妤呭垂閹惰姤鏅繝濠傜墛閳锋垿鎮归幁鎺戝闁哄绉剁槐鎺楊敊閻ｅ本鍣伴悗娈垮櫘閸嬪﹪鐛锟介幊婊冣枔閹稿海绋愮紓鍌氬�搁崐鍝ョ矙閸曨垰绠柨鐕傛嫹
				if (rlist == null || rlist.isEmpty() || rlist.size() < info.num){
					MCreateNpcUniversalRet mret = new MCreateNpcUniversalRet();
					mret.interfaceid = interfaceid;
					mret.result = 0;
					fire.pb.scene.SceneClient.pSend(mret);
					break;
				}
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備胶濮锋繛锟介柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑氾拷锝冨妼閿熻姤绻堝濠氬即閻旇櫣顔曢梺缁樺姦閸撴岸鎮甸弮鍌滅＝濞撴艾锕ョ�氳绻濋姀锝呯厫闁告梹鐗犻幃鈥斥槈閵忥紕鍘遍梺闈涱槶閸ㄥ搫鈻嶉崨瀛樼厸閻庯綆鍋勯悘鎾煛鐏炲墽鈽夐柍璇叉唉缁犳盯寮撮悪锟介崯瀣⒒娴ｅ憡鎯堥悶姘煎亰瀹曟繈骞嬮敃锟界粻鏍煏閸繍妲哥痪鎯у悑缁绘盯骞嬮悜鍥︾返婵炲銆嬮幏锟�
				resultlist.addAll(rlist);
			}
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顒�绾ч柣銈呭閳规垶骞婇柛濞у懎绶ゅù鐘差儏閻ゎ喗銇勯幇鈺侊拷褔骞忓畡閭︽僵妞ゆ帒顦版晥闂備線娼уú銈囷拷姘嵆閻涱噣骞掑Δ锟界粻锝嗙節閸偄濮冪紒杈ㄧ箞濮婄粯鎷呴懞銉ｏ拷鍐磼閿熻姤鎷呴懖婵囩☉閳规垹锟斤綆浜ｉ幗鏇㈡⒑閹稿海绠撴い锔诲灣缁鈽夊▎宥勭盎闂佺懓鎼粔鍫曞礉瀹ュ鐓曢幖娣灪鐏忕數绱掓潏銊﹀鞍缂佹鍠愮换婵嬪礃椤垳绱﹂梻鍌氬�烽懗鍓佹兜閸洖绀堟繝闈涚墢閻瑩鏌熼悜姗嗘畷闁稿鍊块弻锝夊籍閸屾艾濡洪梺鍝ュУ閸旀鏁撻挊澶岀暛闁稿酣浜堕獮鍐垂椤旀碍妞介、鏃堝川椤旂瓔浠ч梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷� NPC闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘梻纾奸柨鐔诲Г瀵板嫬鐣濈�ｎ偄顏堕梺璋庡啯鍟為悗姘秺濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熲晛顕ｉ锕�绠荤紓浣姑▓鐔兼⒑闂堟侗妲堕柛搴″船琚欓柛顐ゅ枔缁犻箖鎮楀☉娆樼劷闁活厼顑囩槐鎺旀嫚閹绘帩浼�闂佸憡甯楃敮鎺楋綖濠靛鏁囬柣鏃囨鑲栭梻鍌欑窔濞佳嗗櫣闂佸憡渚楅崹閬嶏綖瀹�鍕拻闁稿本鐟ч崝宥夋煙椤旇偐鍩ｇ�规洘娲栭…銊╁醇濠靛棛鐛╂俊鐐�栭悧妤冪矙閹烘鏁婇柨鐕傛嫹?
			MUpdateNpcInfo mUpdateNpcInfo = new MUpdateNpcInfo();
			mUpdateNpcInfo.npcs.addAll(resultlist);
			fire.pb.scene.SceneClient.pSend(mUpdateNpcInfo);
			
			if (interfaceid > 0){
				MCreateNpcUniversalRet mret = new MCreateNpcUniversalRet();
				mret.interfaceid = interfaceid;
				mret.result = 1;
				mret.npclist.addAll(resultlist);
				fire.pb.scene.SceneClient.pSend(mret);
			}
		}
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730416;

	public int getType() {
		return 730416;
	}

	public long interfaceid; // 逻辑接口ID，不需要返回的，interfaceid = 0
	public java.util.LinkedList<fire.msp.npc.CreateNpcInfoUniverse> npclist; // GS召NPC的要求条件
	public int toufangareatype; // 0-普通的投放区域,1-新的投放区域,包含1级轻功

	public GCreateNpcUniversalReq() {
		npclist = new java.util.LinkedList<fire.msp.npc.CreateNpcInfoUniverse>();
	}

	public GCreateNpcUniversalReq(long _interfaceid_, java.util.LinkedList<fire.msp.npc.CreateNpcInfoUniverse> _npclist_, int _toufangareatype_) {
		this.interfaceid = _interfaceid_;
		this.npclist = _npclist_;
		this.toufangareatype = _toufangareatype_;
	}

	public final boolean _validator_() {
		if (interfaceid < 0) return false;
		for (fire.msp.npc.CreateNpcInfoUniverse _v_ : npclist)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(interfaceid);
		_os_.compact_uint32(npclist.size());
		for (fire.msp.npc.CreateNpcInfoUniverse _v_ : npclist) {
			_os_.marshal(_v_);
		}
		_os_.marshal(toufangareatype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		interfaceid = _os_.unmarshal_long();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.msp.npc.CreateNpcInfoUniverse _v_ = new fire.msp.npc.CreateNpcInfoUniverse();
			_v_.unmarshal(_os_);
			npclist.add(_v_);
		}
		toufangareatype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GCreateNpcUniversalReq) {
			GCreateNpcUniversalReq _o_ = (GCreateNpcUniversalReq)_o1_;
			if (interfaceid != _o_.interfaceid) return false;
			if (!npclist.equals(_o_.npclist)) return false;
			if (toufangareatype != _o_.toufangareatype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)interfaceid;
		_h_ += npclist.hashCode();
		_h_ += toufangareatype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(interfaceid).append(",");
		_sb_.append(npclist).append(",");
		_sb_.append(toufangareatype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

