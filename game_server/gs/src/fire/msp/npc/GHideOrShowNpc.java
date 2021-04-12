
package fire.msp.npc;
import fire.pb.move.SAddUserScreen;
import fire.pb.move.SRemoveUserScreen;
import fire.pb.scene.manager.SceneNpcManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GHideOrShowNpc__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GHideOrShowNpc extends __GHideOrShowNpc__ {
	@Override
	protected void process() {
		// protocol handle
		fire.pb.scene.config.TemplateNpc tnpc =  fire.pb.scene.manager.TemplateNpcManager.getInstance().getTemplateNpc(npcid);
		
		if(null == tnpc) return;
		if(tnpc.checkVisible() ==  (0==state)) return;
		
		tnpc.setVisible(0 == state);
		
		java.util.List<fire.pb.scene.movable.NPC> npcs = SceneNpcManager.getInstance().getNpcByID(npcid);
		if (!npcs.isEmpty()){
			if (state == 0){
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囩叓閸ャ劍鐓ユい蹇氭硾閳规垿顢欑粵瀣姺闂佸憡顭嗛崟顒佺彿濡炪倖鐗滈崑鐐烘偂濞戙垺鐓曟繛鎴炵懄缁舵煡鏌ｉ幘鏉戝缂佽鲸甯″畷鎺戔槈濡⒈鍎岄梻浣芥硶閸犳劙寮搁懡銈囩闁糕剝绋掗弲鍝ョ磼濞戞﹩鍎忕�殿喛娉曠槐鎺楁偐閾忣偄纾抽悗娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�    婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤濞硷繝寮婚悢鐚存嫹閻㈡鐒鹃崯鍝ョ磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿埖鈷戦梻鍫熺♁閹兼劙鎮楀顓熺凡妞ゆ洩缍侀獮姗�顢欓悡搴わ拷鍨攽鎺抽崐褔骞忛柨瀣ㄤ簻闊浄绲奸柇顖炴煛鐏炲墽鈽夐柍璇叉唉缁犳盯寮撮悪锟介崯瀣⒒娴ｅ憡鎯堥柣顓烆槺缁辩偞绗熼敓浠嬫偘椤曪拷瀹曞爼顢楁径瀣珦闂備胶绮幐鍛婎殽閹间讲锟芥牠宕卞☉娆屾嫽婵炶揪缍�濞咃絿鏁☉銏″仺妞ゆ牗绮屾禒褔鏌涢幒鎾虫诞妞ゃ垺鐩幃娆撴嚑椤掑倹婢栭梻鍌欑窔濞佳団�﹂崼銉ョ？婵炲棙鎸婚崑鍕磼鐎ｎ厽纭剁紒鎰仧缁辨挻鎷呴崜鎻掑壉闁诲海鐟抽崶褏锛熼梺鐟板⒔缁垶鍩涢幒鎳ㄥ綊鏁愰崨顔兼殘闂佸摜鍠撻崑銈夊蓟閿濆鍋勯梻鍌氱摠閸犳艾螖閻橀潧浠滅紒缁橈耿楠炲啫顭ㄩ崼鐔锋疅闂侀潧顦崹铏癸拷姘偢濮婃椽鎳￠妶鍛呫垺绻涚拠褏鐣甸柟顕嗙節閺佹捇鎮敓浠嬪极娴ｉ�涚箚闁靛牆鎳庨弳鐔虹棯閹佸仮闁哄矉绲借灒闁割煈鍠氬В銏ゆ煛娴ｅ摜澧﹂柟顔筋殘閹叉挳宕熼鍌ゆФ闂備胶顢婂▍鏇㈠箰妤ｅ啫鐭楅柛娑卞弾濞撳鏌曢崼婵囧櫧缂佺姳鍗抽幃妤�顫濋悡搴＄闁告椴搁妵鍕箳閻愭潙顏堕梻浣哥枃椤宕归崸妤�绠栨繛鍡樻尭缁狙囨煙鐎电小婵℃鎸荤换婵嗏枔閸喗鐏嶉柤鍨﹀洦鐓曢柡鍐挎嫹闁搞劎鏁婚幃楣冩倻閽樺浼嬮梺褰掝暒閻掞箓宕撻棃娑辨富闁靛牆妫欑亸鎵磼椤旇偐澧㈤柤楦块哺缁绘繂顫濋娑欏闂備礁鎲＄换鍌滐拷姘煎枦閳綊姊绘担鍛婂暈闁哄被鍔戦弻濠囨晲婢跺﹥妲梺闈涱檧缁犳垹娆㈤悙鐑樺�甸柨婵嗛婢х増銇勯弮锟藉ú鐔奉潖閾忓湱鐭欓悹鎭掑妿椤斿﹪姊洪崨濠庣劶闁搞儯鍔岄敓钘夌埣閺岀喓绱掗姀鐘崇亶闂佺粯鎸婚惄顖炲箖濮楋拷閹瑩骞撻幒鍡樺瘱婵犵數鍋炶ぐ鍐敋椤撱垺鏅搁柤鎭掑労閸熷繘鏌涢敐搴℃珝鐎规洘濞婇弫鎰板川椤栨稒顔曢梻浣告贡閸庛倝宕洪崼婵愮劷闁冲搫鍊舵禍婊堟煙閻愵剦娈旈柛鐕佸灦瀵啿螖缁傦拷
				for (fire.pb.scene.movable.NPC npc : npcs){
					npc.setVisible(true);
					final SAddUserScreen snd = new SAddUserScreen();
					snd.npclist.add(npc.getNpcBase());
					npc.sendAround(snd);
				}
			}
			else if (state == 1){
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磽娴ｅ搫啸濠电儑鎷烽梺缁樻惄閸嬪﹤鐣烽崼鏇炍╃憸澶娢ｉ崼銏㈢＝濞撴艾锕ョ�氳绻濋姀锝嗙【妞ゆ垵瀚幑銏ゅ幢濡晲绨婚梺鍝勭Р閸斿酣骞婇崨顖滅＜濠㈣泛顑呴婊呯磼缂佹娲存鐐差儏閳诲氦绠涢弴姘辨／闂傚倷绀侀幖顐﹀箠韫囨稑绠栭柛宀�鍋涢拑鐔兼煏婵炵偓娅嗛柛瀣閺屾稓浠﹂崜褉妲堝銈呴獜閹凤拷
				for (fire.pb.scene.movable.NPC npc : npcs){
					npc.setVisible(false);
					final SRemoveUserScreen snd = new SRemoveUserScreen();
					snd.npcids.add(npc.getUniqueID());
					//final int screenindex = npc.getPos().toScreenPos().getScreenIndex();
					npc.sendAround(snd);
				}
			}
		}
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730421;

	public int getType() {
		return 730421;
	}

	public int npcid; // 要隐藏或显示的npc
	public int state; // 1表示隐藏，0表示隐藏

	public GHideOrShowNpc() {
	}

	public GHideOrShowNpc(int _npcid_, int _state_) {
		this.npcid = _npcid_;
		this.state = _state_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npcid);
		_os_.marshal(state);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npcid = _os_.unmarshal_int();
		state = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GHideOrShowNpc) {
			GHideOrShowNpc _o_ = (GHideOrShowNpc)_o1_;
			if (npcid != _o_.npcid) return false;
			if (state != _o_.state) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += npcid;
		_h_ += state;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npcid).append(",");
		_sb_.append(state).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GHideOrShowNpc _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = npcid - _o_.npcid;
		if (0 != _c_) return _c_;
		_c_ = state - _o_.state;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

