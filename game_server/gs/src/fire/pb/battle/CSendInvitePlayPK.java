
package fire.pb.battle;

import fire.pb.map.GridPos;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.scene.AreaInfo;
import fire.pb.util.MapUtil;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSendInvitePlayPK__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSendInvitePlayPK extends __CSendInvitePlayPK__ {
	public static final int PVP_LEVEL=20;//PVP缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮櫘閸撶喎鐣疯ぐ鎺濇晩閻熸瑥瀚惁閬嶆⒒閸屾瑧鍔嶆俊鐐叉健瀹曘垺绂掔�ｎ偄浠梺鍐叉惈閹冲酣鎷戦悢鍏肩厽闁哄倽娉曞▓閬嶆煛鐎ｎ亪鍙勬慨濠佺矙瀹曞爼顢楁径瀣珨闁荤喐绮岀粔鍫曞矗閸涘瓨鈷戦柟绋垮缁屽潡鏌熼悜鑺ユ暠闁靛洤瀚伴、姗�鎮欑�电硶鏁嶇紓鍌欒兌婵數绮欓幋锕�鐓″鑸靛姇缁犳娊鏌ｉ幇顓熺稇妞ゅ繐鐖煎娲箰鎼淬垻顦ラ梺绋匡工閹芥粎鍒掓繝姘櫜濠㈣泛顑囬崢浠嬫⒑閻熸壆鎽犵紒璇插暣钘熸繝濠傜墛閻撴盯鏌涘锟界粈浣规櫠鐎涙ɑ鍙忓┑鐘插亞閻撹偐锟借娲樼敮鎺楀煝鎼淬劌绠ｆ繝闈涙－閻庢挳姊婚崒娆愮グ妞ゆ洘鐗犲畷浼村冀椤撶喎浜梺缁樻尭濞寸兘寮抽敃鍌涚厸闁搞儮鏅欑槐铏箾瀹割喕鎲鹃柡浣稿�块弻娑㈠即閵娿儱瀛ｅ┑陇灏崺鏍崲濠靛棌鏋旈柛顭戝枟閻忓秴顪冮妶搴″箹婵炲樊鍙冮妴渚�寮崼顐ｆ櫌婵炶揪绲介幗婊呯玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涘Ο鎸庮棄闁宠绉规慨锟介柕鍫濇閹锋椽鏌ｉ悩鍏呰埅闁告柨鑻埢宥夊箛閻楀牏鍘甸梺鍛婂灟閸婃牜锟芥熬鎷�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婎潊闁绘ê妯婂Λ宀勬⒑鏉炴壆顦﹂柨鏇ㄤ邯瀵鍨鹃幇浣告倯闁硅偐琛ラ敓钘夌－椤旀劙姊婚崒姘拷鎼佸磻閸℃稑鍨傞梺顒�绉存闂佸憡娲﹂崹浼村礃閿熻棄顪冮妶鍡楀Е婵狀澁鎷风紓渚囧枛婢у海妲愰幘瀛樺闁告繂瀚烽敓钘夌焸閺屾盯濡搁妷褍鐓熼悗娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�?
	@Override
	protected void process() {
		final long hostid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (-1 == hostid){
			return;
		}
		Role hostRole = RoleManager.getInstance().getRoleByID(hostid);
		if (hostRole == null)
			return ;
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╄兌閿熻棄绠嶉崕閬嵥囬婊呯焼閻庯綆鍋佹禍婊堟煙閸濆嫮肖闁告柨绉甸妵鍕棘閹稿骸鏋犲┑顔硷功缁垶骞忛崨顖涘枂闁告洦鍋傞崫妤呮⒒娴ｄ警鐒鹃悗娑掓櫅椤啴鎸婃径灞炬濠电姴锕ら崯鐘诲几鎼淬劍鐓欓悗娑欘焽缁犮儲淇婇锝囩煉闁诡喖鍢查…銊╁川椤撗勬瘔闂佹眹鍩勯崹閬嶃�冩繝鍥х畺闁炽儲鏋煎Σ鍫熸叏濡厧浜鹃悗姘愁潐椤ㄣ儵鎮欓懠顑胯檸闂佸憡姊归懝鎹愮亙闂佺粯顭堝▍鏇㈠磹閹扮増鐓熸繛鎴濆船濞呭秶锟芥鍠曠划娆撱�佸锟介幃銏ゅ传閸曨偆鐫勯梻鍌氬�风粈渚�骞夐敓鐘茬闁挎梻鏅々鍙夌節婵犲倻澧曢柛鎴犲У缁绘盯骞嬪▎蹇曚痪闂佺粯鎸婚惄顖炲箖濮楋拷閹瑩骞撻幒鍡樺瘱婵犵數鍋涘璺侯焽濞嗘挸鐓橀柟杈鹃檮閺咁剟鏌涢弴銊ヤ簻妤犵偛顑呴—鍐Χ閸愩劎浠鹃梺鑽ゅ暱閺呯娀鐛崘顔肩労闁告劏鏅涢崝鍛渻閵堝棙顥嗗┑顔哄�楃划濠冨鐎涙ǚ鎷婚梺绋挎湰閼归箖鏁撻悾灞藉幋闁硅櫕顨婂畷濂稿即濡ゅ瀚归柨鏇炲�搁柋鍥煟閺囨氨鍔嶆い鏃�妫冨娲川婵犲嫮绱伴梺绋块椤兘鐛箛鎾舵殝闁逛絻娅曢～宥夋⒑閸︻厼鍔嬮柟绋款煼閹潧顫濋鐘电槇缂佺偓婢橀ˇ杈╁閸ф鐓涘ù锝囩摂閸ゆ瑩鏌ｉ敐鍥у幋闁诡喓鍨婚崰濠冩綇閵婏附鐝┑鐘愁問閸犳鈥﹂崼鐔侯洸妞ゆ帪鎷锋い顓炴处瀵板嫰骞囬娑欏濠电偠鎻徊鑲╂媰閿曞倹鍊垮Δ锝呭暞閻撴盯鏌涢顐簻濠⒀勫缁辨帡顢欓悾灞惧櫚濡ょ姷鍋炵敮鎺曠亙婵炶揪缍侀弲鏌ュ箣闁垮绻嗛柣鎰典簻閿熻姤娲滈幑銏ゅ箛閻楀牆浜辨繝鐢靛Т濞层倝鎮￠弴銏＄厵閺夊牓绠栧顕�鏌ｉ幘瀵告噰闁哄被鍊曢湁閻庯綆鍋呴悵鏃�绻涚�电校缂侇喖鐭傞崺鐐哄箣閿曪拷閻忔娊鏌ｉ幇顖涱棄濞寸媭鍣ｅ娲传閸曨剚鎷卞┑鐐跺皺閸犲酣鎮鹃柨瀣檮闁告稑锕ゆ禍婊呯磽娴ｅ壊鍎忛悘蹇撴嚇楠炲繘鎮滈挊澶岀杸濡炪倖娲栧Λ娆戯拷姘愁潐缁绘盯宕煎┑鍫滆檸闂佸搫顑嗙粙鎺楀Φ閸曨垼鏁囬柣妯诲絻楠炲鎮楀▓鍨珮闁稿锕悰顔嘉熼懖鈺冿紲濠碘槅鍨靛銊バуΔ鍛拻濞达綀妫勬禍褰掓煃瀹勬壆澧︾�规洘绮撻弫鍐晸閽樺绁柣鐔哥矌婢ф鏁Δ鍛厱闁圭儤顨嗛悡鏇㈡倶閻愭潙绀冨瑙勶耿閺屻劑鎮㈢拠娈嬫捇鏌熼鐓庯拷鍧楃嵁閸愵収妲肩紓浣虹帛缁诲牆鐣烽悢纰辨晣闁绘﹢娼ч獮鍡涙⒒閸屾瑦绁版い顐㈩樀瀹曟洟骞庣粵瀣櫔濡炪倖鎸撮崑鎾绘晸閽樺鍤囬柟顔界矒閹崇偤濡疯鐢姊绘担鍛婂暈缂佽鍊婚敓鑺ュ嚬閸欏啫鐣烽崘瑁佹椽顢旈崨顖氬笚闂傚倷绀侀悘婵嬵敄閸涘瓨鍊堕柟缁㈠枟閻撴瑦銇勯弮鍥т汗缂佸娅ｉ敓鍊燁潐濞叉牠鎮ユ總绋挎瀬闁归偊鍨抽悿锟介梺鍝勫�归娆愬閹剧粯鐓熼幖娣�ゅ鎰箾閸欏澧悡銈夋煥濠靛棭妲哥紒鐙呯到椤啰锟斤綆浜濋幑锝囩棯閸欍儳鐭欓柡灞剧〒娴狅箓宕滆閸ｎ厾绱撴担閿嬵樂闁告濞婂璇测槈閵忕姷鍘搁梺绋挎湰缁矂鍩涘畝鍕拺缁绢厼鎳忛悵顏嗙磼鐠囨彃鏆ｅ┑鈥崇埣閺佹劖寰勬繝鍕垫О闂備礁鐤囧銊ヮ渻閹烘绠栭柨婵嗩槹閳锋帒霉閿濆牊顏犻悽顖涚洴閺屾盯濡搁妷銉﹀�梺閫涚┒閸旀垶淇婇懜闈涚窞濠电姴瀚哥槐顔尖攽閻樺灚鏆╁┑顔炬暩閸犲﹤顓兼径瀣簵闂侀潧绻嗛敓鍊熷皺缁犳艾顪冮妶鍡欏缂侇喖鐭傞幆鍐箣閻樼數锛滈柡澶婄墑閸斿矂宕ú顏呯厸閻忕偟鏅晥閻庤娲﹂崑濠傜暦閻旂⒈鏁嗛柨鐔绘閳诲秹濡舵径瀣ф嫼缂傚倷鐒﹁摫閻忓浚浜弻娑欐償閿濆棙姣堥悗娈垮枛椤兘寮幘缁樺亹闁肩⒈鍓﹀Σ浼存⒒娓氾拷濞佳団�﹂銏♀挃闁告洦鍨扮粻鏍ㄧ箾閸℃ɑ灏伴柛瀣У閹便劌顫滈崱妤�绠归梺鍛婄箘閸庛倝骞堥妸锔剧瘈闁告侗鍣禒鈺冪磽娓氬洤鏋熼柣鐔叉櫅閻ｉ绮欑拠鐐⒐缁绘繆绠涢弬娆句紦婵犲痉鏉匡拷鏇㈠疮閹殿喖顥氶柣鎾冲瘨閻斿棝鎮归搹鐟板妺婵狅拷娴煎瓨鐓曢柕鍫濈箲鐎氱懓鈹戦敍鍕杭闁稿鍊濆畷鎴﹀礋椤撶喎搴婇梺褰掑亰閸犳牕顕ｉ崣澶夌箚闁绘劦浜滈敓鑺ユ礈閹广垽骞囬弶璺唵闁诲函缍嗛敓绛嬪幗閻╊垰鐣峰锟介、娆戞喆閿濆棗顏归梻鍌欑閹诧繝宕濋弴鐑嗗殨闁割偅娲栫粻姘舵煕椤愮姴鍔滈柣鎾存礀閳规垿鎮╅幓鎺撴闂佺锕ラ崝鏍Φ閸曨垰顫呴柍鈺佸枤濡啴姊烘潪鎵妽闁圭懓娲顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷?
		Role gRole = RoleManager.getInstance().getRoleByID(guestroleid);
		if (gRole == null){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
			return ;
		}
		GridPos gpos = gRole.getPos().toGridPos();
		AreaInfo gareaInfo = MapUtil.getAreaInfo(hostRole.getMapId(), gpos.getX(), gpos.getY());
		if(gareaInfo==null){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162065, null);
			return ;
		}
		if(!gareaInfo.isQiecuoArea()){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162065, null);
			return ;
		}
		
		
		new PSendInvitePlayPK(hostid,guestroleid).submit();
		return;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793564;

	public int getType() {
		return 793564;
	}

	public long guestroleid; // 被邀请角色ID

	public CSendInvitePlayPK() {
	}

	public CSendInvitePlayPK(long _guestroleid_) {
		this.guestroleid = _guestroleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(guestroleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		guestroleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSendInvitePlayPK) {
			CSendInvitePlayPK _o_ = (CSendInvitePlayPK)_o1_;
			if (guestroleid != _o_.guestroleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)guestroleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(guestroleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSendInvitePlayPK _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(guestroleid - _o_.guestroleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

