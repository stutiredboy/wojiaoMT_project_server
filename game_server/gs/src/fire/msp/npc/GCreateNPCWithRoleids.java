
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
		
		//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告创妞ゃ垺鐟╁畷鍗烆渻缂佹ɑ鏉搁梻浣虹帛閸旀牕顭囧▎鎾村�堕柨鏇炲�归悡銉︽叏濮楀棗骞楅柛娆忕箻閺屻劌鈹戦崱妯侯�涘┑鈽嗗灲閹风兘姊绘担鍛婃儓濠㈣泛娲畷婊冣攽閸♀晛娈梺鍛婃处閸ㄤ即鏌嬮崶銊х瘈闂傚牊绋掗ˉ婊呮偖濡　鏀介柣妯虹仛閺嗏晠鏌涚�ｎ偆娲撮柟顔ㄥ嫮绡�闁搞儜鍐ㄤ憾缂傚倷鐒﹂崝妤咁敄韫囨稒鈷掗柛灞捐壘閿熶粙顥撶划鍫熺瑹閿熶粙鐛弽顓ф晝闁靛牆绻戠�氳鎱ㄥΟ鍝勮埞闁告ê顕敓鍊燁潐濞叉牜绱炴繝鍌滄殾鐟滅増甯╅弫鍐煥濠靛棙鍣瑰ù鐓庨叄濮婄粯鎷呴悷鏉垮Б濠电偛鐡ㄥ畝绋跨暦閹达箑宸濇い鏃囨瀵灝鈹戦悩璇у伐闁绘锕畷鎴︽晲婢跺鍘靛銈嗘尵閸犲海绮幒鎴旀斀闁炽儴灏欓惌娆撴煛瀹�瀣М闁轰焦鍔栧鍕緞鐎ｎ亝鐏撻梻鍌欐祰椤曟牠宕伴弽顐ょ濠电姴鍊婚弳锕傛煕椤愶絾绀�閹喖鎮峰鍐妞ゃ垺鐟╁畷鍫曞煛閸愵亷绱冲┑鐐舵彧缁茶偐鍒掑▎鎾充紶闁惧繐婀辩壕濂告偣閸ヮ亜鐨哄褎娲熼幗鍫曟倷閻戞鍙嗛梺缁樻礀閸婂湱锟芥熬鎷�?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ㄩ弮鍥棄闁跨喕妫勫锟犲蓟閵娾晛绫嶉柨鐔剁矙楠炲繐鈹戠�ｎ亞顔嗛梺缁樺灱濡嫰宕归崒娑栦簻闁规壋鏅涢敓鑺ヮ殜閹剝寰勯幇顓涙嫼闁荤姴娲犻敓鍊熸珪濞呫垽姊洪棃娑氬閻庢稈鏅犻悗宄扳攽閻樺灚鏆╁┑顔诲嵆瀹曡绺介棃鈺冪◤婵犮垼娉涢張顒勫汲濠婂牊鐓熼柟閭﹀枛閸斿鏌￠崨顔藉�愰柡灞剧♁缁绘繈宕熼锝囧綑婵犵數鍋涢崥瀣礉閺嶎厼绠為柕濞垮剻閻旇櫣鐭欓柛顭戝櫘閻庢娊姊绘担鍝ワ紞缂侇噮鍨堕獮鎴﹀炊椤掑倸绁﹂梺鍓插亞閸犳挾绮诲▎鎾寸厱妞ゆ劗濮撮崝婊堟煃闁垮鐏撮柡灞剧☉閳规垿宕卞Δ濠佺礉婵犵鍓濊ぐ鍐偉婵傜钃熸繛鎴炵懄閸庣喖鏌曡箛濠忔嫹閸愬弶鏁┑锛勫亼閸婃垿宕瑰ú顏呭仭闁冲搫鎳庨弸渚�鏌熼幑鎰【缂佽翰鍊濋弻娑㈠冀椤愩垻娉曢梻鍌氬�搁崐宄懊归崶褏鏆﹂柣銏㈩焾绾惧鏌ｉ幇顔芥毄闁活厽鐟╅弻鐔告綇妤ｅ啯顎嶉梺绋垮椤ㄥ懘濡撮幒鎴僵闁绘劦鍓欓鍫曟⒒娴ｄ警鏀版俊顐㈠瀹曟劙宕稿Δ锟介弸渚�鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓
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

