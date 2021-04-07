
package fire.msp.battle;

import fire.pb.scene.MonsterInfo;
import fire.pb.scene.SceneClient;
import fire.pb.scene.manager.SceneNpcManager;
import fire.pb.scene.movable.NPC;
import fire.pb.scene.movable.SceneTeam;
import fire.pb.scene.sPos.GridPos;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GFortyThievesBattle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GFortyThievesBattle extends __GFortyThievesBattle__ {
	@Override
	protected void process() {
		// protocol handle
		fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		if(null == role) return;
		SceneTeam team = role.getTeam();
		NPC npc =SceneNpcManager.getInstance().getNpcByKey(npckey);
		if(team == null)
		{
			//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ煏閸℃ê绗掓い顐ｇ箞閹瑩顢楅敓浠嬵敂閼哥數绡�婵炲牆鐏濋弸娑㈡煥閺囨ê锟芥繃淇婇崼鏇炵濞达絽鎽滈悾娲⒑闂堟稓绠為柛濠冩礈缁牓宕煎婵嗙秺閺佹劙宕熼鍛Τ婵犲痉銈庡殝闁瑰嚖鎷�
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 141485, npc.getNpcID(), null);
			return;
		}
		//if(team.getNormalTeamMemebers().size()<2)
		if(team.size() < 2)
		{
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱婢у鏌涢妶鍥ф瀾闁靛洤瀚伴崺锟犲磼濠婂啫缁╅梻浣告惈閻绱炴笟锟介悰顔撅拷锝庡枟閸婄兘鏌涢埄鍏狀亪鎮橀妷鈺傜厓缂備焦蓱瀹曞瞼锟借娲栭妶绋款嚕閹绢喗鍋勯柛鎴欏�栫�氬綊鏌涢锝嗙闁告瑦鎹囬弻娑㈠Ψ閿濆懎顬夐柣蹇撶箳閺佸摜妲愰幒妤佸亼闁告侗鍨遍崑褏绱撴担浠嬪摵閻㈩垽绻濋崹楣冩晝閸屾氨顔婇梺鍦亾閸撴碍瀵奸敓锟�3濠电姷鏁告慨鐑藉极閹间礁纾婚柣妯款嚙缁犲灚銇勮箛鎾跺缂佺媭鍨堕弻銊╂偆閸屾稑顏�?
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 141485, npc.getNpcID(),null);
			return;
		}
		
	
		
		MonsterInfo monsterInfo = npc.getScene().getMapInfo().getMonsterInfo();	
		if(monsterInfo == null)
			return;//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓缃曢梻浣告惈濞层垽宕归崷顓犱笉閻熸瑥瀚ㄦ禍婊堟煙閺夎法鍩ｆ俊缁㈠櫍閺屾稓锟斤綆浜滈敓钘夋贡閹广垹鈽夐姀鐘茶�垮┑鈽嗗灥椤曆呭枈瀹ュ應鏀芥い鏃傚亾閸わ拷閻庢鍠涢崺鏍矚鏉堛劎绡�闁搞儺鐏涜閺屾稑鈽夐崡鐐寸亪濠电偛鎳岄崐妤冩閹惧瓨濯村瀣唉缁愭姊虹粙娆惧剰闁挎洦浜滈锝嗙節濮橆厼浜滅紒鐐妞存悂寮查姀锛勭瘈闁靛骏绲剧涵鐐亜閿曞倷鎲鹃柟铏殜閹粌螣閼测晩鍟庨梻浣瑰缁诲倿骞婅箛娑樼闁规壆澧楅悡銉╂煛閸ャ儱濡洪梺顓у灦閺岋絽鈽夐崡鐐寸亶缂備焦顨堥崰鏍极閹惧顩烽悗锝庣厜閹烽攱鎷呯化鏇燁潔濠碘槅鍨堕弨閬嶆倵婵犳碍鈷戦柛锔诲幖閸斿淇婇銏㈢閸楅亶鏌涢敂璇插箻缁惧彞绮欓弻娑氫沪閸撗勫櫘缂備焦绋戠换姗�寮婚悢鐓庣闁靛牆妫楅锟�?
		
		GridPos pos = npc.getPos().toGridPos();
		int areaconf = monsterInfo.getMonsterConfig(pos.getX(), pos.getY());
		if(areaconf == 0)
			return;//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ煏閸℃ê绗掓い顐ｇ箞閹瑩顢楅敓浠嬵敂閸洘鐓熼幖娣焺閸熷繘鏌涢悩宕囧⒌鐎规洦鍨堕幊妤咁敍濠婏拷缁ㄧ兘姊婚崒娆戭槮闁规祴鍓濈粭鐔肺旈崨顓犵崶濠殿喗顭堝▔娑樻纯婵＄偑鍊栭崝褔姊介崟顖氱厱闁硅揪闄勯悡鏇熺箾閹寸儑鍏柛鏃傚枎椤儻顧佸ù婊庝邯瀵鎮㈤崫鍕�抽梺鍛婎殘閸嬫﹢宕版繝鍥ㄢ拺閻犲洠锟借櫕鐏�闂佽法鍠曟慨銈夊几婵傜鍑犻幖娣妽閻撴瑩鏌熼鍡楄嫰濞堝爼姊洪崨濞氭垿宕濆▎鎾崇畺婵°倕鎳愬畵渚�鏌涢…鎴濇灈濠殿喖楠搁埞鎴︽倷閼碱剚鍕鹃梺鍛婃⒐閸ㄧ敻顢氶敐澶婄濞达綀顫夊▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹
		
		
		SceneClient.pSend(new MFortyThievesBattle(roleid, npckey,areaconf));
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 727898;

	public int getType() {
		return 727898;
	}

	public long roleid;
	public long npckey; // 四十大盗的npckey

	public GFortyThievesBattle() {
	}

	public GFortyThievesBattle(long _roleid_, long _npckey_) {
		this.roleid = _roleid_;
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GFortyThievesBattle) {
			GFortyThievesBattle _o_ = (GFortyThievesBattle)_o1_;
			if (roleid != _o_.roleid) return false;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GFortyThievesBattle _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

