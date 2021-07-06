
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
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ剙浠遍柟顔ㄥ洦鍋愭慨鐟版祫閹烽攱绗熼敓钘夘嚕閹绢喖顫呴柣妯荤垹閸モ晛褰勯梺鎼炲劘閸斿秹鎮￠妷锔轰簻闊洦纰嶇涵楣冩煃鐟欏嫬鐏存い銏＄懅缁數锟斤綆鍓欐慨娲⒒娴ｅ憡鍟炴い顓炴瀹曠喖顢楁担鍝勫▏濠碉紕鍋戦崐鏍偋濠婂牆纾婚柣鎰劋閸嬪倹绻涢幋娆忕仾闁绘挻娲樼换娑㈠箣閻愬灚鍣紓浣藉煐閻擄繝寮婚敐澶婄闁哄鍨甸～搴ｇ磽娴ｄ粙鍝洪悽顖楋拷宕囨殾闁圭儤鍨熷Σ鍫熶繆椤栨壕鎷￠柛搴＄焸濮婄粯鎷呴懞銉с�婇梺鍝ュУ閸旀瑥顕ｉ幖浣瑰殥闁靛牆娲ㄩˇ顖炴⒑缁洖澧茬紒瀣浮瀵煡宕妷褏锛滃┑鐐村灦閿曗晠宕曡箛鏇嫹濞堝灝鏋︽繛澶嬫礈濡叉劙骞掑Δ浣镐汗闂佹儳娴氶崑鍕閹惰姤鍊垫繛鍫濈仢閺嬫稒銇勯銏℃暠濞ｅ洤锕獮鏍ㄦ媴閸濄儱骞愰梻浣侯焾閺堫剟鎯岄鎹愬С濞寸姴顑嗛埛鎺懨归敐鍕劅闁绘帡绠栭弻锟犲醇椤愩垹顫紓渚囧枟閻熲晠鐛�ｎ喗鏅滅紓浣股戝▍鍡涙⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�    婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈嗙箾绾绡�鐎殿喖顭烽幃銏ゆ偖鐎涙ê顏堕梺姹囧灪椤旀牠鎮炴ィ鍐ㄧ柈闁告縿鍎崇壕钘夈�掑顒婃敾閻庢俺顫夌换婵嬫偨闂堟刀銏＄箾鐠囇呯暤闁诡噯绻濇俊鐑藉煛閸屾粌骞楅梻浣告惈閸燁偄霉閸岀偛鍚规繛鍡樺灦閸嬫牗鎱ㄥΟ鍨厫闁抽攱鍨垮濠氬醇閻旇　妾ㄩ梺鐟板悑閸旀瑩骞冨Δ锟介～婵嬵敇閻斿搫鍤掓俊鐐�栧ú鈺冪礊娓氾拷閻涱喖顫滈敓浠嬨�佸▎鎾村亗閹兼番鍊ч幏鐑藉垂椤旇鏂�闁圭儤濞婂畷鎰樄妤犵偛绻橀弻銊э拷锝冨妺缁ㄥ妫呴銏＄カ缂佹彃銈搁弻鍥敍閻愬鍘搁柣蹇曞仜婢т粙鍩ユ径鎰厓閻犲洤寮堕崬澶岀磼閻樺磭娲寸�殿喗鎸抽幃顏堟晸娴犲鐤悗锝庡枟閳锋帒霉閿濆懏鍟為柟顖氱墦閺岋綁顢橀悜鍡樞ㄧ紓浣戒含閸嬬偟绮悢鍏兼櫢濞寸姴顑嗛崑妯汇亜閺囶亝瀚归悗瑙勬礀閻栧ジ銆佸Δ浣哥窞閻庯綆鍋呴悵锕傛⒒閸屾瑨鍏岀紒顕呭灦楠炴劙宕ㄦ繝搴㈩啍闂佸綊妫跨拋鏌ユ晸閼恒儳澧电�规洖宕埥澶娾枎鐏炴儳顏烘繝鐢靛仩閹活亞绱為敓鑺ョ箾閸滃啰鎮奸柡渚囧枛閳藉濮�閳ュ厖缂撴俊鐐�栭悧妤冨垝鐏炲墽顩风憸鏃堝蓟濞戙垹绠抽柟鎹愭珪鐠囩偛顪冮妶鍐ㄧ仾闁烩晩鍨堕獮鍐ㄢ枎閹炬潙娈ゅ銈嗗笒閸婄懓顭块弽顓熲拻闁稿本鐟х粣鏃�绻涙担鍐叉礌閿熸枻绠撳畷濂稿Ψ閵壯嶇吹婵犵數鍋涘Λ娆撳箰婵犳艾纾婚柛鏇ㄥ幘绾惧ジ鎮楅敐搴″箺缁绢厼澧庣槐鎺楀箛椤旈棿鎴风紓浣介哺閹稿骞忛崨鏉戠闁圭粯甯掓竟澶愭⒑鐠囧弶鎹ｉ柣鐔稿▕瀹曟儼顦撮柨娑氬枛濮婃椽鎮烽弶搴撴寖缂備緡鍣崹鍫曞春濞戙垹绠抽柟鐐藉妼缂嶅﹪寮幇鏉垮窛妞ゆ柨鍚嬪▓姗�姊绘担鍛婃喐闁哥姵鎹囧畷鎴﹀Χ婢跺﹨鎽曢梺鎸庣箓椤︿即宕戦崟顖涒拻闁稿本姘ㄩ幗鐘绘煕閻樺疇澹橀摶鏍煟濮楋拷濞佳勭濠婂懐纾肩紓浣癸公閼版寧顨ラ悙鎻掓殭妞ゎ厹鍔戝畷濂告偄闁垮鏋�闂傚倷绶氬褔藝椤撱垹鍨傞柧蹇曟閹峰嘲顫濋鎯т划濠殿喖锕ュ浠嬪箠閿熺姴围闁告稑鎳岄崹铏规崲濞戞碍瀚氱憸蹇涙偩閻㈠憡鐓欐い鏇炴缁★拷闂佽桨鐒﹂幑鍥箖椤忓牊鏅稿ù鐘差儏閺嬩礁霉閿濆鎷峰☉姘辩暰闂備線娼ч悧鍡涘箠鎼淬劌姹查柣鏃囨濡垶鏌熼鍡曠娴狀噣姊洪崫鍕効缂佹彃锟界喓浜介梻浣稿閻撳牓宕板顑帡濮�閵堝棛鍘告繛杈剧到閹芥粍鏅堕敃鍌涚厵妞ゆ梻鐡斿▓姗�鏌熼崣澶嬪唉鐎规洜鍠栭、妤呭磼閵堝柊銈夋⒒閸屾瑨鍏屾い銏狅工閳诲秹寮撮姀鐘殿唶婵°倧绲介崯顐︽儗濡ゅ懏鐓曟繛鎴濆船瀵偓绻涢幘鎰佺吋闁哄本娲熷畷鐓庘攽閸パ勵仱缂傚倷鑳舵慨鎶藉础閹惰棄绠栨俊銈忔嫹妞ゎ偅绻堥幃鈩冩償閿涘嫷鍟囬梻浣告啞椤ㄥ銇旈幖浣肝﹂柛鏇ㄥ灠缁犳娊鏌ｉ幇顓熺稇妞ゅ繐鐖煎缁樻媴閸濄儲鐎銈庡亜椤﹂潧鐣疯ぐ鎺戦敜婵°倧鎷风紒鐘崇墬缁绘盯宕卞Ο璇茬缂備胶瀚忛崶銊у幍闁诲海鏁搁…鍫濈毈婵犵鍓濋〃鍡涘箰閼姐倖宕叉繝闈涙閺嬫棃鏌涢…鎴濇灍闁诲繐绉归弻銈夊垂閿曪拷濞诧箓鎮￠弴銏＄厸闁告劖瀵х�氬綊姊洪幖鐐插闁轰礁顭烽獮鍐┿偅閸愨晛锟藉鏌﹀Ο渚Ш濞寸厧顑夊楦裤亹閹烘繃娈ラ梺缁樺釜缁犳挸鐣烽幘缁橆棃婵炴垼椴哥�靛矂姊洪棃娑氬婵☆偅鐟ф禍鎼佸箥椤斿墽锛滃銈嗘閸嬫劖鏅堕姀銈嗙厾濡わ箑娼￠崫铏圭磼缂佹绠撴い顐ｇ箞椤㈡ê鈽夊▎蹇ｄ紪闂傚倸鍊风粈渚�骞夐敍鍕床闁稿本绮ｉ幏宄邦潩閻撳孩鐏曢梺鎰佷簻缂嶅﹤顫忕紒妯诲闁告稑锕ら弳鍫ユ⒑閸濆嫯顫﹂柛鏃�鍨垮缁樼節閸ャ劍娅滄繝銏ｆ硾閿曘儱危椤掑嫭鈷戦梻鍫熶緱濡狙呯磼閻樺啿鐏╂繛鍡愬灲閹瑩鎮滃Ο鐚存嫹閻㈠憡鐓ユ繝闈涙椤庢顭胯婢ф濡甸崟顖氱睄闁跨喕妫勭叅闁绘柨顨庡鏍煣韫囨挻璐￠柣顓熺懇閹綊骞侀幒鎴濐瀷濡炪倖鏌ㄩ敃顏勵潖濞差亜宸濆┑鐘叉捣閸斿爼姊洪幖鐐插姌闁告柨鐭傞弫鎾绘寠婢跺苯鐓熼梺鍝勭灱閸犳挾妲愰幒妤�顫呴柣妯虹－娴滃爼姊绘担铏瑰笡闁圭顭烽幆鍕敍閻愯尙鐣哄┑顔筋殣閹风兘鏌熼鐣屾噰妤犵偞鎹囬獮鎺楀幢濡櫣妲烘繝鐢靛Х閺佹悂宕戦悙韬蹭汗闁告劦鍣弫瀣亜閹惧崬鐏柡鍛倐閺屻倝骞侀幒鎴濆Ф闂佸摜鍠庣换姗�寮诲☉銏℃櫜閹肩补鍓濋悵婵嬫倵鐟欏嫭绀冨┑鐐诧躬瀵偊骞囬弶鍨獩濡炪倖鐗楃粙鎺楊敊閺囥垺鈷掑ù锝呮啞鐠愶繝鏌涙惔娑橈拷婵嗙暦濞差亜閱囨繝鍨姉閸旂兘姊洪崘鍙夋儓闁稿﹨鍩栫粋宥咁煥閸喓鍘甸梺缁樺姦閸擄箑鈻撻弮鍫熺厱闁绘洑绀侀悘锔撅拷娈垮枛閸熻儻鐏冪紓浣稿亰閹凤拷
				for (fire.pb.scene.movable.NPC npc : npcs){
					npc.setVisible(true);
					final SAddUserScreen snd = new SAddUserScreen();
					snd.npclist.add(npc.getNpcBase());
					npc.sendAround(snd);
				}
			}
			else if (state == 1){
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈囩磽瀹ュ拑韬�殿喖顭烽幃銏ゅ礂鐏忔牗瀚介梺璇查叄濞佳勭珶婵犲伣锝夘敊閸撗咃紳婵炶揪绲介幖顐㈡毄濠电姷鏁搁崕鎴﹀箯閻戣姤鈷戠紓浣股戦幆鍕煕鐎ｎ亷宸ラ柣锝囧厴瀹曞ジ寮撮悙宥佹櫇閹插憡寰勬繛顫秮瀹曞ジ濮�閵忣澁绱冲┑鐐存尰閼归箖鏁冮妷褝鎷峰鎰佹綈缂佺粯绻堟慨锟介柨婵嗘閵嗘劕顪冮妶鍡楃仴閻庢凹鍣ｉ獮鎴﹀閵堝懎鑰垮┑鈽嗗灦閺呰尙鑺辨繝姘拺闁告繂瀚ⅹ闂佸憡鏌ㄩ柊锝夌嵁婵犲洤宸濇い鏍ㄧ矌閿涙粍绻濋姀锝嗙【妞ゆ垵鎳橀、姘煥閸涱垳锛滅紓鍌欑劍椤洤煤鐎涙﹩娈介柣鎰▕閸庡繘鏌嶇拠鍙夊攭缂佺姵鐩鏉戭潩鏉堫煉绱￠梻鍌氬�搁崐椋庣矆娓氾拷楠炴牠顢曢敃锟界粻鐘荤叓閸ャ劎鈽夌紒鐘崇墵閺屾稑鐣濋敓浠嬪磻濞戙垺瀚呴柣鏂垮悑閻撳繐鈹戦悙闈涗壕婵炲懎妫濋弻娑氾拷锝庝簼椤ャ垽鏌＄仦鍓с�掑ù鐙呯畵瀹曟粏顦俊鎻掔墕椤啴濡堕崨瀵稿椽闂佺懓鍤栭幏锟�
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

