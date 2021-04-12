
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
			// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡缂佺粯绻傞銉╂煥鐎ｎ偆鍑￠梺璺ㄥ枙婵倕煤閻旈鏆︽い鏍ㄧ☉椤曢亶鎮楀☉娅亪宕滈悷鎵虫斀闁绘劕寮堕ˉ鐐烘煙缁嬫鐓奸柟顔癸拷鏂ユ瀻闁圭偓娼欓敓鐣屾暬閺岋綁濮�閳藉棗鏅遍梺缁樺浮缁犳牕鐣烽鐐蹭紶闁靛／鍜冪床闂備浇顕栭崹搴ㄥ礃椤忓棌妫ㄧ紓鍌氬�风欢锟犲窗濡ゅ懏鍋￠柍杞扮贰閸ゆ洖鈹戦悩宕囶暡闁稿瀚伴弻褑绠涢幘纾嬬闂佹寧绋掔划宀勫煘閹达箑鐓￠柛鈩冾殘娴狀垰顪冮妶搴″箹闁绘锕︾划瀣箳濡わ拷杩濋梺璺ㄥ櫐閹凤拷
			java.util.List<fire.msp.npc.NpcInfo> resultlist = new java.util.LinkedList<fire.msp.npc.NpcInfo>();
			
			for (CreateNpcInfoUniverse info:npclist){
				java.util.List<fire.msp.npc.NpcInfo> rlist = fire.pb.scene.manager.SceneNpcManager.getInstance().createNpc(info);
				// 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘劙婀侀梺绋跨箰閸氬绱為幋锔界厱闁靛鍎遍敓钘夋贡閹广垹鈽夊鍡楁櫊濡炪倖妫佸畷鐢告儎鎼达絿纾奸柣鎰靛墮閸斻倖绻涚涵椋庣瘈鐎殿喖顭锋俊鍫曞触閵堝懏璐￠柨鐔告灮缂嶅棝宕戦崨瀛樺仧闁哄啫鐗婇埛鎴︽煙閼测晛浠滃┑锛勬櫕缁辨帞鎷犻懠顒�鈪甸悗娈垮枦椤曆囧煡婢舵劕顫呴柣妯活問閸熷绻濆閿嬫緲閿熺獤鍥х闁绘垼濮ら崐鍨叏濡厧甯跺褍顕敓鑺ヮ問閸犳骞冮崒姘辨殾闁圭儤顨嗛崐椋庣磼椤旀娼愰悗姘偢濮婄粯鎷呴崨濠呯濡炪値鍘奸悧蹇涙晸閼恒儳鈻撻柡鍛Ь濡垽姊虹化鏇炲⒉闁靛洦鐩銊╂嚍閵夛絼绨婚梺鍝勫�圭�笛囧箚閸儲鐓ラ柣鏃囶嚙琚氶梺缁橆殕缁酣宕氶幒鏃撴嫹閿濆簼鎲鹃柛姘儏椤法鎹勬總閾般値妲诲銈庡弨濞夋洟骞戦崟顒傜懝妞ゆ牗鑹炬竟瀣⒒娴ｅ憡鍟為拑閬嶆煙椤旂厧锟芥悂锝炶箛娑欐優闁革富鍘鹃悡鎾绘⒑閸︻収鐒鹃悗娑掓櫊楠炲繑娼忛埡鍐紳婵炶揪绲芥竟濠囧磿閹扮増鐓曢柕濞垮劜閸嬨儵鏌曢崱鏇狀槮妞ゎ偅绻堥、妤佸緞鐏炶棄姹查梻鍌欑閹测剝绗熷Δ鍛瀭闁规儼濮ら弲顒佺節婵犲倻澧涢柍閿嬪灴閹綊骞侀幒鎴濐瀳闂佸搫顑呯粔鍓佹閹烘鏁婇柣锝呮湰閸ｄ即鎮楀▓鍨珮闁稿锕悰顔碱潨閿熶粙骞婂鍐ｆ灁闁圭娴风粙鎰磽閸屾艾锟芥悂宕愰崫銉х煓闁告洦鍨扮粻顖炴煥閻曞倹瀚�
				if (rlist == null || rlist.isEmpty() || rlist.size() < info.num){
					MCreateNpcUniversalRet mret = new MCreateNpcUniversalRet();
					mret.interfaceid = interfaceid;
					mret.result = 0;
					fire.pb.scene.SceneClient.pSend(mret);
					break;
				}
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К缂傚倷鑳舵慨閿嬬箾閿熶粙鏌″畝锟介崰鏍х暦濠婂棭妲鹃柣銏╁灡閻╊垶寮诲☉姘炬嫹閿濆啫濡奸柨鐔诲Г缁诲牆顕ｆ繝姘嵆闁绘棁娅ｉ鏇㈡⒑缂佹ê濮﹂柛鎾村哺閹敻寮崒婊咃紳婵炴挻鑹鹃敃銉э拷姘愁潐缁绘繈濮�閿濆懐鍘梺鍛婃⒐閻楃娀骞冮垾鏂ユ闁靛骏绱曢崢閬嶆⒑闂堟侗妲堕柛銊ユ惈閳诲秹宕ㄧ�涙鍘搁柣搴秵閸嬪嫰鎮橀幘顔界厸閻忕偛澧介埥澶愭煃鐠囧弶鍞夌紒鐘崇洴瀵挳鎮敓浠嬪疮鐎ｎ喗鈷掑ù锝呮啞閹牓鎮跺鐓庝喊鐎规洘绻堥獮瀣晝閿熺晫绮婚弽顓熺厪闁割偅绻嶅Σ鍝ョ棯閹冩倯缂佺粯鐩獮瀣倻閸ワ妇杩斿┑鐐差嚟閵嗗骞忛敓锟�
				resultlist.addAll(rlist);
			}
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬锟界痪褔鏌ｉ妶鍛仼闁宠鍨堕獮濠囨煕婵炑冩噹缁躲倕霉閻樺樊鍎忛柣銈庡枟閵囧嫰骞囬埡渚婃嫹瑜旈獮蹇撶暋闁附鍍靛銈嗗笒椤︾増鏅ラ梻鍌欑窔濞佳兠洪妶鍥锋嫹濮橆偄宓嗛柣娑卞櫍楠炴帒螖閿熺晫绮婚敐鍡欑瘈闁割煈鍋勬慨鍐磼鏉堛劎绠炴慨濠勭帛閹峰懘鎳為妷锝忔嫹閸愵亞纾奸柨鐔诲Г閹峰懘鎳栧┑鍥┾槈闁宠鍨归敓鏂ょ秵娴滐綁骞楅弴銏♀拺闁圭娴风粻鎾淬亜閿旇鐏ｇ紒顔款嚙閳藉鈻庡鍕泿闂備胶鎳撻幖顐ょ矓閸洖绀夌�广儱顦伴悡鏇㈠箹濞ｎ剙鐏悘蹇曟暩缁辨帗娼忛妸锕�闉嶇紓浣诡殘閸犳劗鎹㈠┑瀣妞ゎ厽鍨崇槐锕傛⒒閸屾艾锟界兘鎳楅崜浣瑰厹闁割偅娲栫粈鍫熺節闂堟稓澧㈤柣顓熺懇閺岀喖鎮滃鍡樼暦闂佺顑呴崐鍧楀蓟閿濆绫嶉柛灞捐壘婵℃椽姊洪崫銉バｉ柛鏃�顨婇弫鎾绘寠婢跺瞼鏆涢梺绋块叄娴滃爼鐛崘顔煎瀭妞ゆ梹纰嶅浠嬨�侀弮鍫濆窛妞ゆ梻鐡旀禒褔姊婚崒娆愮グ婵炲娲熷畷鎶芥晝閸屾氨顔嗛梺璺ㄥ櫐閹凤拷 NPC闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚圭憸鐗堝笒绾惧潡鏌熺�电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑樻⒒绾惧ジ鏌ㄩ悢璇残撶�垫澘瀚悾婵堬拷锝庡亜椤忓爼姊虹拫搴″暞閸熺偤鎮楀顒傜Ш婵﹨娅ｉ幑鍕Ω閵夛妇锟借櫣绱撴笟鍥ф灍闁荤啿鏅涢锝夘敃閿曪拷缁犺崵绱撴担濮戭亜鈻撻悢鍏尖拺闂傚牊渚楀Σ鍫曟煕鎼粹�宠埞鐞氭瑩鏌涢銈呮灁缂佺娀绠栭幃妤�鈽夊▎妯煎姺闂佹椿鍘奸鍥╂閹烘梹瀚氶柟缁樺俯娴硷拷闂備礁鎲＄敮妤冩暜閹烘缍栨繝闈涱儛閺佸洭鏌ｉ弮鍥仩閼叉牠姊婚崒娆戠獢婵炰匠鍡楁闂備礁鎲℃笟妤呭垂闁稄缍栫�癸拷閸曨兘鎷婚梺绋挎湰閻熝囧礉瀹ュ鐓欐い鏃囧亹閸╋絿锟借娲樺ú鏍�﹂妸鈺侀唶婵犻潧妫涢悰鈺備繆閻愵亜锟芥牠鎮уΔ鍐煓闁圭儤顨忛弫濠囨煥閻曞倹瀚�?
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

