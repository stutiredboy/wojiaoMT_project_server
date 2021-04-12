
package fire.msp.npc;


import fire.pb.scene.Scene;
import fire.pb.scene.SceneManager;
import fire.pb.scene.manager.SceneNpcManager;
import fire.pb.scene.movable.NPC;
import fire.pb.scene.sPos.Position;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GCreateNPCWithRoleids__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GCreateNPCWithRoleids extends __GCreateNPCWithRoleids__ {
	
	public static final int HUA_JIAO_NPC_ID = 11153;
	public static final int SURPER_HUA_JIAO_NPC_ID = 11270;
	
	@Override
	protected void process() {
		// protocol handle
		NPC n = SceneNpcManager.getInstance().createNpcWithKey(npc.npckey,npc.npcbaseid, npc.name, npc.dir);
		Scene scene = SceneManager.getInstance().getSceneByID(npc.sceneid);
		SceneNpcManager.getInstance().summonNpcAndUpdateGS(scene, new Position(posx, posy), n,npc.time);
		
		//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垹绠婚悗闈涙啞閸掓稑顪冮妶鍐ㄧ仾闁荤啿鏅涢悾鐑藉础閻戝棙瀵岀紓鍌欑劍钃遍柡澶嬫倐濮婄粯鎷呴搹鐟扮闂佸憡姊归悧鏇⑩�﹂崶褉鏋庨柟鐐綑閿熻棄鐖奸弻銊╁即閻愯鎷疯ぐ鎺撳亗闁靛闄勯崣蹇旀叏濡わ拷濡鐛Δ鍛厱婵炲棗绻掔粻濠氭煛鐏炶濡奸柍瑙勫灴瀹曞崬螣娓氼垽鎷峰☉妯锋斀闁宠棄妫楅悘鏌ユ煙妞嬪骸鍘存慨濠勭帛閹峰懘宕ㄦ繝鍐ㄥ壍濠电姰鍨煎▔娑樏洪鐐垫殾婵犲﹤鍟犻弨浠嬫煕閳撅拷閺呮稑鈻撻锔解拺闁告稑锕ユ径鍕煕閵娿倕宓嗛柡灞筋儔瀹曞爼濡歌閻﹀牓姊婚崒姘卞缂佸甯¤棢婵犲﹤鎳忛崑鏍ㄤ繆椤栨縿锟斤拷闁猴拷娴犲鐓熸俊顖濇娴犳盯鏌￠崱蹇旀珚闁哄本绋撻敓鏂ょ秵閸嬪棗煤閹绢喗鐓欐い鏂诲妼鐎氼喚寮ч敓浠嬫⒑閹肩偛鍔�闁告劑鍔嬮幉鍓х磽閸屾艾锟界兘鎮為敃鍌氱婵°倕鎷嬮弫鍕叓閸ャ劎鈾侀柍閿嬪浮閺屾稓浠﹂幑鎰棟闂佽法鍠嶇划娆撍夐幘璺哄灊闁割偆鍠撻悷褰掓煥閻斿墎鐭欓柣娑卞櫍瀵粙顢樿閺呮繈姊洪棃娑氬缂佺粯鍨归敓鑺ヤ亢椤骞堥妸銉庣喖宕崟顔肩厴闂備礁鎲￠敋妞ゆ洦鍙冮弫鎾诲磹閻曚焦缍堝┑鐐插级閻楁粎妲愰悙瀵哥瘈闁稿本绮嶅▓楣冩偡濠婂懎顣奸悽顖楁櫊瀵偊宕橀鐣屽弳濠电娀娼уΛ娆撳闯閻熸噴褰掓偂鎼淬劌寮板┑顔硷功缁垶骞忛崨瀛樺仭闁哄鐏濊濠电姷鏁搁崑娑㈡偤閵娿儳鏆嗙紒瀣硶閺嗭箓鏌熸潏鍓х暠鐎瑰憡绻冮妵鍕籍閸ヮ煈妫勯悗娈垮枛閻忔繈鍩為幋锔藉亹閻犲泧鍐х矗闂備胶绮〃鍛存晝椤忓嫮鏆﹂柟杈鹃檮閺呮彃顭跨捄渚剳闁告﹢娼ч—鍐Χ閸℃ê鏆楅梺鍝ュТ濞撮鍒掗銏犵闁瑰瓨姊归弬锟介梻浣哄仺閸庡浜稿▎鎾村剹婵炲棙鎸婚悡娑氾拷鐧告嫹閻庯綆鍓涜ⅵ闂備浇妗ㄩ悞锕傚礉閺嵮屽殫闁告洦鍓欑欢鐐烘倵閿濆簼绨奸柣蹇旀崌濮婂宕掑▎鎰偘濡炪倖娲橀悧鐘茬暦娴兼潙鍐�妞ゆ劑鍊楅ˇ顖涚節閻㈤潧孝闁稿﹤顭峰鎶芥晝閸屾稓鍘卞銈嗗姧缁插墽绮堥敓浠嬫煙椤栨粌鏋涢柟顔煎槻椤劑宕橀鍡╁晪婵＄偑鍊戦崹娲偡閳轰胶鏆﹂柛顐ｆ礀閻撴盯鏌涢幇鍏告倣缂佸崬鍟块埞鎴︽倷閼搁潧娑х紓浣藉蔼閸嬫劙宕氶幒鎴旀瀻闁规儳鍘栫槐鍫曟⒑閹呯婵狅拷鏉堚晛顥氬┑鍌氭啞閸嬶綁鏌涢妷顔荤盎闁汇劌鎼…鑳槼婵炶尙鍠栭獮妤呭醇閺囩喎锟界兘鏌ｉ幋鐑嗙劷闁告瑥妫濆铏圭磼濡崵顦ラ梺绋匡工濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绉柡灞诲姂瀵噣宕堕…鎴烆棄闂備浇娉曢崰鏇炍涢崟顐劷闁跨喓濮撮拑鐔兼煏婵炵偓娅呯紒顐㈢Ч閺屻劑鎮㈤崜浣虹厯濡ょ姷鍋涚换鎰板煘閹寸媴鎷烽敐搴濈敖妞ゆ柨妫濆铏圭磼濡櫣浼囧┑鈽嗗亜鐎氭澘鐣疯ぐ鎺戠＜婵炴垶鐗旂花濠氭⒑鐟欏嫬顥愰柡鍛洴閺佹捇鎳為妷顔界杹闂佽鍠掗崜婵嗩嚗閸曨垰绠涙い鎾寸♁鐎氬ジ姊洪懡銈呅㈡繛鑼█閺佹捇宕愰悢鍝ュ涧濠电偛鎳岄崹钘夘潖濞差亝顥堟繛鎴炶壘椤ｆ椽鏌ｆ惔銏⑩枔闁哄懐濞�閹鐣￠幍铏杸闂佺粯锚閻忔岸寮抽埡浣叉斀妞ゆ棁顕у畵鍡欙拷瑙勬礉椤缂撴禒瀣棃闁冲搫鍟伴埣銈呪攽閻橆喖鐏辨繛澶嬬洴瀵敻顢楅崟顐ｈ緢濠电姴锕ら悧濠囨偂閻斿吋鐓欓梺顓ㄧ畱閺嬫盯鏌涢弬娆惧剶闁哄矉绻濆畷銊╊敊閽樺鎷烽幇鐗堢厸閻忕偛澧介埦浣虹磼缂佹绠炵�规洜鍠栭、鏇㈡晲閸パ呯▏婵犵數濮烽弫鎼佸磻濞戙垹瑙﹂悗锝庡枛缁�澶愭煛瀹ュ骸骞栫紒鐘靛仱閺屾洘绻涢崹顔煎闂佺粯妫佸▍锝夋儗濞嗘挻鐓曟い顓熷灥濞呮﹢鏌ｆ惔銏犫枙婵﹦绮幏鍛村传閵夘垳绀婄紓鍌欑贰閸ｎ噣宕归崼鏇犲祦闁硅揪绠戦悙濠冦亜閹烘垵锟藉摜绮婇敃鍌涒拺闁告挻褰冩禍鐐烘煕閻樿櫕灏电紒顔款嚙閳诲酣骞樼�电骞堟俊鐐�栭崝妤佹叏閹绢喖绀夋繝濠傜墛閻撳啴姊洪崹顕呭剰闁诲繑鎸抽弻锛勪沪閸撗�妲堥梺瀹狀潐閸ㄥ灝鐣烽崡鐐嶆梹绻濇担铏诡槷婵犵數濮烽。浠嬪礈濠靛浜归柛鎰靛枟閸嬪鈹戦崒婊庣劸闁藉啰鍠愮换娑㈠箣閻愬灚鍣梺绋挎捣閸犳牠寮婚弴锛勭杸濠电姴绻戠�氬綊鏌涢幇顒�绾ч柡渚囦簻閳规垿鏁嶉崟顐℃澀闂佺锕ラ崹鍨暦閻熸噴娲敂閸涱厺鐢婚梻浣稿暱閹碱偊骞婃惔銊ュ嚑濞撴熬鎷烽柡宀�鍠栭獮鎴﹀箛椤撶姰锟芥劗绱撴担鐣屽牚闁稿﹥绻堝璇测槈閵忕姴鍞ㄥ銈嗗姂閸ㄨ鈻旈弴銏♀拻闁稿本鑹鹃敓鑺ユ倐瀹曟劕鐣￠幊濠傜秺瀹曟儼顦撮柡鍡畵閺岋綁濮�閵忊晝鍔哥紒鐐劤椤兘寮婚敐澶婄疀妞ゆ棁濮ゅВ鍕⒑濞茶骞楅柣鐔叉櫊瀵鎮㈤崨濠勭Ф婵°倧绲介崯顖烆敁瀹ュ鈷戠紒瀣仢椤掋垺銇勯妸銉﹀殗濠碘剝鎸抽獮鎺楀箣椤撶喎鍏婇梻浣虹帛閸旓箓宕滃▎鎿冩晜闁割偅娲橀埛鎺懨归敐鍕劅闁猴拷閻楀牅绻嗘い鎰╁灩椤忣厾锟借娲橀崝娆忕暦缁嬭鏃堟晸娴犲鍑犲〒姘炬嫹闁哄瞼鍠栧畷婊嗩槾閻㈩垱鐩弻锟犲川椤旇棄锟芥劙鏌＄仦璇插闁诡喓鍊濆畷鎺戔槈濮楀棔绱�
		if(this.npc.npcbaseid == HUA_JIAO_NPC_ID || this.npc.npcbaseid == SURPER_HUA_JIAO_NPC_ID){
			fire.pb.scene.npcai.AIManager.getInstance().npcMoveByAiID(this.npc.npckey, 1, roleids);
		}
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730435;

	public int getType() {
		return 730435;
	}

	public fire.msp.npc.CreateNpcInfo npc;
	public int posx;
	public int posy;
	public java.util.HashSet<Long> roleids;

	public GCreateNPCWithRoleids() {
		npc = new fire.msp.npc.CreateNpcInfo();
		roleids = new java.util.HashSet<Long>();
	}

	public GCreateNPCWithRoleids(fire.msp.npc.CreateNpcInfo _npc_, int _posx_, int _posy_, java.util.HashSet<Long> _roleids_) {
		this.npc = _npc_;
		this.posx = _posx_;
		this.posy = _posy_;
		this.roleids = _roleids_;
	}

	public final boolean _validator_() {
		if (!npc._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npc);
		_os_.marshal(posx);
		_os_.marshal(posy);
		_os_.compact_uint32(roleids.size());
		for (Long _v_ : roleids) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npc.unmarshal(_os_);
		posx = _os_.unmarshal_int();
		posy = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			long _v_;
			_v_ = _os_.unmarshal_long();
			roleids.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GCreateNPCWithRoleids) {
			GCreateNPCWithRoleids _o_ = (GCreateNPCWithRoleids)_o1_;
			if (!npc.equals(_o_.npc)) return false;
			if (posx != _o_.posx) return false;
			if (posy != _o_.posy) return false;
			if (!roleids.equals(_o_.roleids)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += npc.hashCode();
		_h_ += posx;
		_h_ += posy;
		_h_ += roleids.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npc).append(",");
		_sb_.append(posx).append(",");
		_sb_.append(posy).append(",");
		_sb_.append(roleids).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

