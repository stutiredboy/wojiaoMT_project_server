
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
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閻樻爠鍥╁彄闁搞儯鍔嶉悡銉︺亜韫囨碍纭鹃柍瑙勫灴椤㈡瑧绮电�ｎ剙濮洪梻浣告啞椤棝宕熼浣哄娇婵＄偑鍊栭悧婊堝磻閻愮儤鍋傛繛鎴欏灪閻撴洘绻涢幋鐐垫噭缂佽埖鐓￠弻锝夊箻閺夋垵顫庣紓浣介哺鐢�崇暦閹烘垟妲堟俊顖溾拡閸庡矂姊绘担鑺ョ《闁哥姵鍔欏鎼佹嚒閵堝洨顦梺绯曞墲缁嬫帡寮查崫銉х＜婵炴垶锕╅崕蹇曪拷娈垮枦濞夋洜妲愰幒妤佸亹闁惧浚鍋勭壕鎶芥倵濞堝灝鏋涙い顓㈡敱娣囧﹪骞栨担鍝ュ幐闂佺鏈惌顔捐姳娴犲鈷掑ù锝勮閻掗箖鏌￠崼顐㈠缂侇喗鐟╅獮瀣晜缂佹ɑ娅嗛梻浣芥硶閸ｏ箓骞忛敓锟�    濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆ繛纭风節瀵鎮㈤悮瀛樺闁汇垺顔栭悞楣冨疮閸濄儳纾藉〒姘攻鐎氳绻濋悽闈浶㈡繛璇х畵閹繝濡烽埡鍌滃幗闂佸搫鍟ù鍌炲吹濞嗘垶鍋栨慨妯垮煐閳锋垿姊婚崼鐔衡檨闁瑰吋鍔欓幃妤�顫濋鐔哄嚒濡炪倖娲╃紞渚�鐛锟介、娆撴偂鎼淬倧鎷烽崹顔规斀閹烘娊宕愯楠炲繘鏌ㄧ�ｃ劋绨婚棅顐㈡祫缁插ジ鏌囬鐐寸厸閻忕偛澧介埥澶愭煃鐠囧弶鍞夌紒鐘崇洴瀵挳鎮敓浠嬪疮鐎ｎ喗鈷掑ù锝呮啞閹牓鏌ｉ鐑嗘Ш缂佽京鍋炵粭鐔兼晸娴犲鍋樻い鏇嫹鐎规洖鐖奸、妤佸緞鐎ｎ偅鐝﹂梻鍌欒兌缁垶骞愰崨濠庢闁归棿璁查敓鑺ョ墵瀹曞崬鈽夊▎灞惧濠电偠鎻紞锟芥繛鍜冪悼閺侇喖鈽夐姀鈥充缓濡炪倖鐗楃划灞剧瑜旈弻娑㈠箳閹捐櫕璇炲銈冨灪閻╊垶骞冨▎鎾村殤妞ゆ帒鍊瑰鏍⒒閸屾瑧绐旀繛浣冲洠锟斤箓宕奸妷銉э紵濠电偛妫欓幐濠氬磻閸曨厾纾奸悗锝庡幗绾墎绱掗幇顔间户缂佽鲸鎸婚幏鍛村礈閹绘帒澹夐梺璇叉捣閻熸娊宕惰閿涚喖姊洪悷鏉库挃缂侇噮鍨堕崺娑㈠箳閹炽劌缍婇弫鎰板川椤斿吋娈橀梻浣告憸閸犳捇宕戦妶澶婅摕闁挎繂顦伴崑鍕⒒閸屾氨鎽犻柛鐘宠壘铻栭柣姗�娼ф禒婊呯磼缂佹﹫鑰挎鐐插暙椤劑宕奸悢閿嬬枀闂備線娼чˇ顓㈠垂閾忕櫢鎷峰顑惧仮婵﹥妞介幊锟犲Χ閸涘懌鍨虹换娑氭嫚瑜忛悾鐢告煙椤曞棛绡�闁轰焦鎹囬幃顏堟晸娴犲鏋佸ù锝夛拷娑氱畾闂侀潧鐗嗛幊搴ㄥ汲閻旇櫣妫柟顖嗕礁浠梺鍝勭焿缁插�熺亽闂佸壊鐓堥崰姘掗姀銈嗙厸濞达絽鎽滄晶锕傛煙椤旂瓔娈橀柟鍙夋尦瀹曠喖顢楅崒銈喰ら梻鍌欒兌椤㈠﹤鈻嶉弴銏犵濡わ絽鍟惌妤呮煕濞戝崬寮炬繛鎾愁煼閺屾洟宕煎┑鍥ф缂備胶濮抽崡鎶藉箖濡わ拷椤繈鎮℃惔锛勵啇闂佸憡顨夋ご鎼佸Φ閸曨垰绠抽柣鎰綑椤忓爼姊绘担鍝ユ瀮妞ゎ偄顦靛畷褰掑锤濡わ拷缁犳牗绻涢崱妯诲碍缂佺嫏鍥ㄧ厵閻庣數顭堝皬濠碘剝顨嗛幐鑽ゆ崲濠靛棌鏋旈柛顭戝枟閻忓秹鏌ら崹锕�娲﹂悡鏇㈡煛閸愭寧瀚归梺鎼炲妿閺佸骞冩ィ鍐╁�婚柦妯侯槺娴煎姊鸿ぐ鎺濇殥闁绘帪绠撳畷鎾绘濞戣鲸瀵岄梺闈涚墕濡瑧浜搁幍顔剧＜妞ゆ棁鍋愭晶銏ゆ煠妤﹀潡鍝虹紒缁樼箓椤繈顢樺☉娆忣伖闂傚倷绀侀幉锛勬崲閸屾粣鎷峰鐓庢灕闁愁亜缍婂缁樻媴閸涘﹤鏆堥梺鍝勮閸旀垿寮绘繝鍥ㄦ櫜濠㈣泛锕ュΣ顒勬⒑闂堟侗妾х紒鐘冲灩濞嗐垽鎮欓悜妯猴拷鐢告煥濠靛棝顎楀褏澧楅妵鍕籍閿熻棄煤閻斿娼栭柧蹇撴贡閻瑩鎮归幁鎺戝妞ゆ柨锕娲川婵犲海鍔堕梺鎼炲劘閸斿矂鏁撻挊澶屽煟闁哄瞼鍠撶槐鎺楀閻樺磭浜堕梻浣虹帛閹稿鎯勯鐐茬畺婵鎷烽柟顔界懇楠炴捇骞掗崱妯虹槺濠电姷鏁搁崑鐐躲亹閸愵噮鏁嬫い鎾卞灪閺呮悂鏌ら幁鎺戝姶闁哥喎绻橀弻娑㈡晲鎼粹剝鐝濋悗瑙勬礃婵炲﹪寮幇鏉垮窛妞ゆ牗绋掗鏇㈡⒒娴ｅ憡璐￠柛搴涘�濆畷娲醇濠垫劗鍔烽梺鍐叉惈閸婅埖绂嶅鍫熺厵闁绘劦鍓﹀▓鏃堟煕閻曚礁鐏︾�殿喖鍟胯灃缂佸偊鎷�
				for (fire.pb.scene.movable.NPC npc : npcs){
					npc.setVisible(true);
					final SAddUserScreen snd = new SAddUserScreen();
					snd.npclist.add(npc.getNpcBase());
					npc.sendAround(snd);
				}
			}
			else if (state == 1){
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＝濞达絽鎼暩婵犵數鍎戦幏鐑芥⒑缂佹ɑ鎯勯柛瀣工閻ｇ兘宕奸弴鐐嶁晝鎲告径濞綁宕奸姀銏紳婵炴挻鑹鹃敃銉э拷姘愁潐缁绘繈濮�閿濆棛銆愬銈嗗灥鐎氼噣骞戦姀銈呭耿婵☆垶鏅茬花濠氭⒑閸濆嫮袪闁告柨閰ｉ獮濠囧川椤栨粎锛滄繝銏ｆ硾椤戝懘顢氬鍛＜缂備焦顭囧ú瀛橆殽閻愬樊鍎忛柍璇叉唉缁犳盯寮村杈紡闂傚倸鍊风粈渚�骞栭锕�绠犻煫鍥ㄧ☉缁犳牠鏌涘畝锟介崑娑㈡嫅閻斿吋鐓忓┑鐐靛亾濞呭棝鏌涚�ｎ亝顥㈤柡灞剧〒娴狅箓宕滆濡插牆顪冮妶鍛寸崪闁瑰嚖鎷�
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

