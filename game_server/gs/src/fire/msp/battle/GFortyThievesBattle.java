
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
			//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸缂備礁顑嗙敮锟犲极瀹ュ绫嶉柛顐ゅ枔閸橀箖姊洪崫鍕垫Ъ婵炲娲樼粋鎺楀閵堝棛鍘梺绯曞墲閿氱紒妤佸笚閵囧嫰顢曢敐鍥╃杽闂佽鍠楅悷鈺呫�佸Δ鍛櫢濞寸姴顑愰弫鍌炴煠閸濄儲鏆╃紒鈽呮嫹婵犵數鍋涢悧鍡涙倶濠靛鍑犳繛鎴欏灪閻撱儵鏌￠崶顭嬵亪鏁撻懞銉х畺濞ｅ洤锕畷濂稿即閻愭鍟囧┑鐐舵彧缁蹭粙骞楀鍫熷仼婵炲樊浜濋埛鎴︽⒒閸喓銆掔紒鐘靛仱閺屾稒绻濋崘鈺冾槶缂備緡鍠栭悧鎾崇暦閻撳寒鐔嗘繝闈涙缁夋椽鏌℃担鐟板鐎规洜鍠栭、姘跺川椤撶倣銈呪攽閻樿尙妫勯柕鍫濋濞堟繈姊洪悷鏉挎闁瑰嚖鎷�
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 141485, npc.getNpcID(), null);
			return;
		}
		//if(team.getNormalTeamMemebers().size()<2)
		if(team.size() < 2)
		{
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顕�姊哄Ч鍥э拷銈夊窗閺嶎厽绠掗梻浣侯焾缁绘劙宕ョ�ｎ剛绀婇柟瀵稿Х绾惧ジ鏌熼柇锕�寮炬繛鍫燂耿閺屻劑鎮㈢紒姗嗘缂備胶濮寸粔鐟扮暦閺囥垹纭�闁诲繒绮浠嬪极閸愵喖纾奸柨鏂垮⒔閳笺倝姊绘担鍛婃儓婵炲眰鍨藉畷鐟懊洪鍛簵闂佺粯鏌ㄩ崥瀣偂濞嗘挻鈷戞い鎾卞妿閻ｅ崬顭胯椤兘寮诲☉銏犖ч柛銉戝嫮锟介箖姊洪棃娑欐悙閻庢矮鍗冲畷娲晸閻樿尙锛滃┑鐘诧工閸燁偆绱掗埡鍛拻濞达絽鎲￠幆鍫ユ煟椤撶儐妲虹紒杈╁仦缁楃喖鏁撴禒瀣仒妞ゆ梹鎷濋幏鐑芥晲鎼粹剝鐏嶉梺绋匡功閸忔﹢寮诲☉銏犵労闁稿繒濯禍顏堝箖濮楋拷婵＄兘鍩￠崒婊冨笚缂傚倸鍊烽悞锕佹懌閻庤娲栭惉濂告晸閸婄噥娼愭繛鍙夌墵婵″墎绮欏▎鎯ф闂佸湱铏庨崰妤呭磻閸曨垱鐓曢柟瀛樼懃閿熻姤鐗滈敓鑺ヨ壘缂嶅﹪寮诲☉銏╂晝闁挎繂妫涢ˇ顓㈡⒑閸涘﹦鎳勯柟鐟版喘瀵鈽夐姀鐘栥劑鏌ㄥ┑鍡樺櫣妞ゎ剙顦甸弻锝堢疀閹惧墎顔婇梺杞扮閹芥粌危閹版澘绠虫俊銈勭娴滃ジ姊洪崨濠佺繁闁搞劑浜跺畷鎴ｎ槾缂佽鲸鎸婚幏鍛鐎ｎ亝鎳欓梺姹囧焺閸ㄧ晫鎹㈠┑瀣瀭濡わ絽鍟弲婵嬫煕鐏炵偓鐨戞い鏂匡躬濮婃椽宕烽鐐板闂佸憡鎸荤喊宥囷拷闈涖偢閺佹捇鏁撻敓锟�3濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁规崘娉涢。铏圭磽娴ｅ搫顎岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 141485, npc.getNpcID(),null);
			return;
		}
		
	
		
		MonsterInfo monsterInfo = npc.getScene().getMapInfo().getMonsterInfo();	
		if(monsterInfo == null)
			return;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处缂傚啯娲熷缁樻媴閸涘﹥鍎撳┑鐐茬湴閸ㄨ棄鐣疯ぐ鎺戞嵍妞ゆ挾濮崇粭澶愭煟閻斿摜鎳冮悗姘ュ妽缁傚秴顭ㄩ崼鐔哄幍闂佸搫顦冲▔鏇㈠春閿濆棔绻嗙紓浣靛灩濞呭秹鏌＄仦鍓с�掗柨鐔告灮缂嶅棙绂嶅鍫熸櫢闁芥ê顦扮拹锟犳煙楠炲灝鐏╅柍钘夘樀婵拷闁绘灏敓钘夌仢閳规垿鍩ラ崱妤冧淮濡炪倖娉﹂崨顓熺�抽悗骞垮劚閹冲寮ㄩ懞銉ｄ簻闁哄啫鍊告禍楣冩煕閵堝繑瀚归梺璇插椤旀牠宕板☉銏犳槬闁哄稁鍋嗛惌姘跺级閸稑濡跨紒鈽呮嫹闂備焦鎮堕崕娲倶濞戞粠妯勯梺鍝勬湰缁嬫垿鍩ユ径鎰闁绘劕顕禍顏呯節閻㈤潧浠滈柟鍐茬焸瀹曟劕螖閸愨晩娼熼梺瑙勫劤閻°劍鍒婇弶鎴富閻庯綆浜濋崬澶岀磼閹邦収娈滄慨濠呮缁瑥鈻庨幆褍澹堥梻浣瑰濞诧附绂嶅鍫晪闁挎繂妫涚弧锟藉┑顔斤供閸樺吋绂嶅鍛＜闁绘劦鍓欓婊冾渻鐎涙ɑ鍊愮�殿喗鐓℃慨锟介柨娑樺閻﹀牓姊洪棃娑㈢崪缂佹彃澧藉☉鐢告倷椤戝彞绨婚梺鎸庢礀閸婄兘骞夋ィ鍐╃厵闁惧浚鍋掑▓婊堟煙椤旂晫鐭婇摶锝夋煠濞村娅撻柛鐔烽叄濮婄粯鎷呴悷閭﹀殝缂備浇顕ч崐鍧楃嵁婵犲懐鐤�婵炴垶顭囬鎰版⒑鐟欏嫬顥嬪褎顨婇幃锟犲Ψ閳哄倻鍘搁梺鎼炲劘閸庤鲸淇婂ú顏呪拺妞ゆ挆鍐桓闂佸搫鐭夌徊浠嬪煡婢舵劕纭�闁绘劕顕禍鍓佺磽閸屾瑧鍔嶆い銊ョ墦瀹曚即寮介鐐寸�梺瑙勫劤椤曨參銆呴悜鑺ュ�甸柨婵嗘捣閸樻粓鏌熼悜鑺ユ暠闁瑰嘲鎳愰崠鏍即閻曚焦缍屽┑鐘殿暯濡插懘宕归崼鏇炵哗闂侇剙绉甸崐闈涒攽閻樺磭顣查柍閿嬪灴閺屾盯鏁傜拠鎻掔闂佸憡鏌ㄩ鍡樼┍婵犲浂鏁冮柕蹇嬪灮椤斿洭鏌涘Δ鍛喚闁哄本鐩弫鍌滄嫚閹绘帞顔掔紓浣瑰劤瑜扮偟鍒掑▎鎾宠摕婵炴垶鐭▽顏堟煕閹炬瀚▍妯肩磽閸屾瑧鍔嶇紒瀣灩閹广垹顫滈敓钘夘嚕婵犳碍鍋勯柣鎾虫捣椤︹晠姊洪棃娑氬婵☆偅顨婇、鏃堟晸閿燂拷?
		
		GridPos pos = npc.getPos().toGridPos();
		int areaconf = monsterInfo.getMonsterConfig(pos.getX(), pos.getY());
		if(areaconf == 0)
			return;//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸缂備礁顑嗙敮锟犲极瀹ュ绫嶉柛顐ゅ枔閸橀箖姊洪崫鍕垫Ъ婵炲娲樼粋鎺楀閵堝棛鍘梺绯曞墲閿氱紒妤佸笚閵囧嫰顢曢敐鍥╃杽闂佽鍠楅悷鈺呫�佸Δ鍛櫢濞寸姴顑愰弫鍌炴煕椤愶絾绀冮柣鎾跺枛楠炴牕菐椤掞拷閻掓椽鏌涢悢椋庣闁哄本鐩幃鈺佺暦閸パ�鎷伴柣搴ゎ潐濞诧箓宕归崼鏇炵疇婵°倕鎷嬮弫宥嗙節婵犲繑瀚圭紓浣靛妿閸忔ê顫忔繝姘＜婵炲棙鍩堝Σ顕�姊虹憴鍕偞闁告挻绻勭划顓㈡偄閼茬儤妫冨畷銊╊敇閻橀潧鐐婂┑鐘愁問閸犳鈥﹂崼婵冩灃婵炴垶蓱缁绢垰鈹戦敍鍕杭闁稿﹥鐗犲畷婵婎樄婵﹣绮欏畷鐔碱敍濮樺崬骞堥梻浣侯攰閹活亪姊介崟顖涘亗闁哄洨鍠撶粻楣冩煙鐎电鍓抽柛蹇ｅ墴閺屾盯寮崒姘�诲銈庡弨閸庡篓娴ｈ鐟邦煥鎼存繈鍋楅悗娈垮枛椤兘骞冮姀銈呬紶闁告洦鍓涢敓鑺ュ▕濮婃椽宕ㄦ繝搴㈢暭闂佺顑嗛敃銏犵暦閻楀牏绡�闁搞儯鍔夐幏娲煟閻樺弶绀岄柨鐔凤拷鐔哥彧闁诲骏鎷烽梻鍌欐祰濞夋洟宕伴弴鐔稿弿闁靛牆顦崙鐘测攽閸屾粠鐒鹃柛鎴犲█楠炴牕菐椤掞拷婵′粙鏌ｉ幘瀵告噰闁哄瞼鍠栭、娑㈠幢濡ゅ嫬顏┑鐐茬墕閻栫厧顫忓ú顏勫窛濠电偞纰嶉崹鍨暦濠靛棌鏋庨柟鎯х－閻ｅ搫鈹戞幊閸婃洟骞婇幇顒傛殼濞撴熬鎷烽柡灞剧洴閳ワ箓骞嬪┑鍥╀邯濠电姵顔栭崰鏍殽閹间礁鐓橀柟杈鹃檮閸婄兘鏌ょ喊鍗炲闁告洟绠栧娲川婵犲啠鎷归梺鎼炲妿閺佸銆佸鑸垫櫜濠㈣泛锕﹂鎰箾鏉堝墽绉い顐㈩槸閳诲秹濮�閵堝棌鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷
		
		
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

