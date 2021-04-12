
package fire.msp.circletask;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GFindShoolQuestDemonsNpc__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GFindShoolQuestDemonsNpc extends __GFindShoolQuestDemonsNpc__ {
	@Override
	protected void process() {
		// protocol handle
		
		java.util.Set<Long> objlist = fire.pb.scene.manager.RoleManager.getInstance().getSchoolRoles(objschool);
		java.util.List<fire.pb.scene.movable.Role> objrolelist = new java.util.ArrayList<fire.pb.scene.movable.Role>();
		if (objlist != null){
			for (Long rid:objlist){
				fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(rid);
				if (role == null)
					continue;
				if (role.getLevel() >= levelmin && role.getLevel() <= levelmax)
					objrolelist.add(role);
			}
		}
		if (!objrolelist.isEmpty()){
			int rand = fire.pb.util.Misc.getRandomBetween(0, objrolelist.size()-1);
			fire.pb.scene.movable.Role dstrole = objrolelist.get(rand);
			npcinfo.name = dstrole.getName();
			npcinfo.shape = dstrole.getModeid();
		}
		
		java.util.List<fire.msp.npc.NpcInfo> rlist = fire.pb.scene.manager.SceneNpcManager.getInstance().createNpc(npcinfo);
		
		// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉湱鎹㈠☉姗嗗晠妞ゆ棁宕甸惄搴ｇ磼閻愵剙鍔ゆ繛纭风節瀵濡堕崥銈呮贡閿熸枻缍嗛崑鍛存偟閺冨牊鈷戦柟鑲╁仜婵＄晫绱掔拠鑼ⅵ鐎殿喛顕ч埥澶愬閻樻鍟嬫繝寰锋澘锟窖囧箯閻戣姤鍊垫慨妯煎帶婢у锟芥鍠楅幃鍌氱暦閹烘鍊风紒顔款潐鐎氬ジ姊绘担鍛婅础妞ゎ厼鐗忛敓鑺ョ▓閺呯姾妫㈤梺绯曞墲閵囨盯寮ㄩ懞銉ｄ簻闁哄倹瀵ч幆鍫ユ煥閻旇袚闁绘绮庨崚鎺旓拷锝庝憾閸氬顭跨捄濂铰ゎ槻妞ゎ叀娉曢幑鍕瑹椤栨艾澹嬮梻浣告啞钃遍柟顔煎�搁～蹇涙惞閸︻厾鐓撻梺鍦焾鐎涒晠骞忔潏鈺冪＝濞达絽澹婇崕鎰版煕閵娿儲鍋ラ柕鍡曠椤繈顢楁径灞藉汲闂備礁鎲℃笟妤呭垂閹惰姤鏅繝濠傜墛閳锋垿鎮归幁鎺戝闁哄绉剁槐鎺楊敊閻ｅ本鍣伴悗娈垮櫘閸嬪﹪鐛锟介幊婊冣枔閹稿海绋愮紓鍌氬�搁崐鍝ョ矙閸曨垰绠柨鐕傛嫹
		if (rlist == null || rlist.isEmpty() || rlist.size() < npcinfo.num){
			fire.msp.npc.MCreateNpcUniversalRet mret = new fire.msp.npc.MCreateNpcUniversalRet();
			mret.interfaceid = interfaceid;
			mret.result = 0;
			fire.pb.scene.SceneClient.pSend(mret);
			return;
		}
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備胶濮锋繛锟介柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑氾拷锝冨妼閿熻姤绻堝濠氬即閻旇櫣顔曢梺缁樺姦閸撴岸鎮甸弮鍌滅＝濞撴艾锕ョ�氳绻濋姀锝呯厫闁告梹鐗犻幃鈥斥槈閵忥紕鍘遍梺闈涱槶閸ㄥ搫鈻嶉崨瀛樼厸閻庯綆鍋勯悘鎾煛鐏炲墽鈽夐柍璇叉唉缁犳盯寮撮悪锟介崯瀣⒒娴ｅ憡鎯堥悶姘煎亰瀹曟繈骞嬮敃锟界粻鏍煏閸繍妲哥痪鎯у悑缁绘盯骞嬮悜鍥︾返婵炲銆嬮幏锟�  闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顒�绾ч柣銈呭閳规垶骞婇柛濞у懎绶ゅù鐘差儏閻ゎ喗銇勯幇鈺侊拷褔骞忓畡閭︽僵妞ゆ帒顦版晥闂備線娼уú銈囷拷姘嵆閻涱噣骞掑Δ锟界粻锝嗙節閸偄濮冪紒杈ㄧ箞濮婄粯鎷呴懞銉ｏ拷鍐磼閿熻姤鎷呴懖婵囩☉閳规垹锟斤綆浜ｉ幗鏇㈡⒑閹稿海绠撴い锔诲灣缁鈽夊▎宥勭盎闂佺懓鎼粔鍫曞礉瀹ュ鐓曢幖娣灪鐏忕數绱掓潏銊﹀鞍缂佹鍠愮换婵嬪礃椤垳绱﹂梻鍌氬�烽懗鍓佹兜閸洖绀堟繝闈涚墢閻瑩鏌熼悜姗嗘畷闁稿鍊块弻锝夊籍閸屾艾濡洪梺鍝ュУ閸旀鏁撻挊澶岀暛闁稿酣浜堕獮鍐垂椤旀碍妞介、鏃堝川椤旂瓔浠ч梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷� NPC闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘梻纾奸柨鐔诲Г瀵板嫬鐣濈�ｎ偄顏堕梺璋庡啯鍟為悗姘秺濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熲晛顕ｉ锕�绠荤紓浣姑▓鐔兼⒑闂堟侗妲堕柛搴″船琚欓柛顐ゅ枔缁犻箖鎮楀☉娆樼劷闁活厼顑囩槐鎺旀嫚閹绘帩浼�闂佸憡甯楃敮鎺楋綖濠靛鏁囬柣鏃囨鑲栭梻鍌欑窔濞佳嗗櫣闂佸憡渚楅崹閬嶏綖瀹�鍕拻闁稿本鐟ч崝宥夋煙椤旇偐鍩ｇ�规洘娲栭…銊╁醇濠靛棛鐛╂俊鐐�栭悧妤冪矙閹烘鏁婇柨鐕傛嫹?
		fire.msp.npc.MUpdateNpcInfo mUpdateNpcInfo = new fire.msp.npc.MUpdateNpcInfo();
		mUpdateNpcInfo.npcs.addAll(rlist);
		fire.pb.scene.SceneClient.pSend(mUpdateNpcInfo);
		
		if (interfaceid > 0){
			fire.msp.npc.MCreateNpcUniversalRet mret = new fire.msp.npc.MCreateNpcUniversalRet();
			mret.interfaceid = interfaceid;
			mret.result = 1;
			mret.npclist.addAll(rlist);
			fire.pb.scene.SceneClient.pSend(mret);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 741900;

	public int getType() {
		return 741900;
	}

	public long interfaceid;
	public int objschool; // 寻找玩家所属的门派
	public int levelmin; // 最低等级
	public int levelmax; // 最高等级
	public fire.msp.npc.CreateNpcInfoUniverse npcinfo; // 找不到玩家时，按照npcinfo生成任务npc

	public GFindShoolQuestDemonsNpc() {
		npcinfo = new fire.msp.npc.CreateNpcInfoUniverse();
	}

	public GFindShoolQuestDemonsNpc(long _interfaceid_, int _objschool_, int _levelmin_, int _levelmax_, fire.msp.npc.CreateNpcInfoUniverse _npcinfo_) {
		this.interfaceid = _interfaceid_;
		this.objschool = _objschool_;
		this.levelmin = _levelmin_;
		this.levelmax = _levelmax_;
		this.npcinfo = _npcinfo_;
	}

	public final boolean _validator_() {
		if (!npcinfo._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(interfaceid);
		_os_.marshal(objschool);
		_os_.marshal(levelmin);
		_os_.marshal(levelmax);
		_os_.marshal(npcinfo);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		interfaceid = _os_.unmarshal_long();
		objschool = _os_.unmarshal_int();
		levelmin = _os_.unmarshal_int();
		levelmax = _os_.unmarshal_int();
		npcinfo.unmarshal(_os_);
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GFindShoolQuestDemonsNpc) {
			GFindShoolQuestDemonsNpc _o_ = (GFindShoolQuestDemonsNpc)_o1_;
			if (interfaceid != _o_.interfaceid) return false;
			if (objschool != _o_.objschool) return false;
			if (levelmin != _o_.levelmin) return false;
			if (levelmax != _o_.levelmax) return false;
			if (!npcinfo.equals(_o_.npcinfo)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)interfaceid;
		_h_ += objschool;
		_h_ += levelmin;
		_h_ += levelmax;
		_h_ += npcinfo.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(interfaceid).append(",");
		_sb_.append(objschool).append(",");
		_sb_.append(levelmin).append(",");
		_sb_.append(levelmax).append(",");
		_sb_.append(npcinfo).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

