
package fire.pb.move;
import fire.pb.scene.Scene;
import fire.pb.scene.movable.SceneTeam;
import fire.pb.scene.sPos.Position;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRelocateRolePos__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRelocateRolePos extends __CRelocateRolePos__ {
	@Override
	protected void process() {
		final fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByProtocol(this);
		if(null == role)
			return;
		if(sceneid != role.getScene().getSceneID())
		{
			Scene.LOG.info("CRelocateRolePos闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為崑锝夊级閻愭潙顎滄い鎺斿枛閺岋綁骞掑鍥╃厯闂佸搫鐭夌紞浣规叏閿熶粙鏌ｅΟ鍝勬毐闁哄棗鐗撳铏圭矙閸ф锟芥绱掓径濠勭Ш鐎殿喛顕ч埥澶愬閻樻彃绁梻渚�娼ч…鍫ュ磿閹殿喛濮抽柤娴嬫櫇绾捐棄霉閿濆娑у┑锛勬櫕閿熺晫娅㈤幏鐑芥煙闂傚顦﹂柦鍐枛閺屻劑鎮㈤崫鍕戙垺淇婇悙鑸殿棄闂囧鏌ㄥ┑鍡樺櫤闁硅尙顭堥湁闁绘ê妯婇崵鐔虹磼鏉堛劍灏伴柟宄版嚇閹兘寮堕崯鍐ц兌缁辨挻鎷呮禒瀣懙濠电偠灏欓崰鏍偘椤旇棄绶為柟閭﹀墰椤旀帒顪冮妶鍡橆梿闁稿鍔欓、娆愮節閸ャ劉鎷洪梺鍛婄箓鐎氼厼顔忓┑瀣厱閹兼番鍨规慨鍥懚閻愮鎷烽惂鍛婂闂佸憡娲﹂崜娆愮椤撶偐鏀介柣妯款嚋瀹搞儵鏌熼崘鏌ュ弰闁靛棗鍊圭缓浠嬪川婵犲嫬骞嶇紓鍌欑椤戝棛锟界瑳鍥х柈闁绘劗鍎ら悡娑㈡煕濞戝崬骞橀柛鈺嬬秮閺岀喖顢欑憴鍕彇缂備浇椴哥敮鎺曠亽闂佸憡绻傜�氼剟藟婢舵劖鈷掗柛灞剧懅椤︼箓鏌熷ù瀣舵嫹鐡掍焦妞介弫鍐磼濮樻唻绱遍梻浣告啞娓氭宕归崹顐ｅ弿闁惧浚鍋呴崣蹇斾繆椤栨氨浠㈤柣鎾村姍閺岋綁骞樼�靛憡鍒涢梺鍝勬湰缁嬫垿鈥﹂妸鈺傛櫢闁伙絽鐬奸惌鍡椼�掑鐐闂佽鍠楅敃銏ゅ箖閵忋倖鎯為柛锔诲弿缁卞弶绻濆閿嬫緲閿熺獤鍥х闂佸灝顑冩禍婊堟煥閺冨洦顥夋い銉ヮ儑缁辨帡顢欓悾灞惧櫚闂佽桨鐒﹂幑鍥极閹剧粯鏅搁柨鐕傛嫹?闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掞拷绾惧鏌熼悧鍫熺凡闁藉啰鍠庨…鍧楁嚋闂堟稑顫岀紓浣哄Т閻忔岸濡甸崟顔剧杸闁圭偓鎯屽Λ鈥愁渻閵堝骸浜濇繛鍙夘焽閹广垹鈹戠�ｎ偒妫冨┑鐐村灦閼归箖路閿熶粙姊绘担鍛婃喐濠殿喗娼欒灋婵犻潧顑呴拑鐔兼煟閺傚灝鎮戦柛濠勭帛娣囧﹪顢涘┑鍡楁優濡炪倧璐熼崕閬嶁�旈崘顔嘉ч柛鎰╁妼婵海绱撴担铏瑰笡闁挎洏鍨归锝囨嫚濞村顫嶅┑顔筋殔濡瑩宕撻棃娑辨富闁靛牆妫楃粭鎺楁煕婵犲啫濮嶅┑鈥崇埣瀹曞爼濡搁妷銈囩梾闂傚倷绶氬褑澧濋梺鍝勬噺缁捇骞冮敓鐘参ㄩ柍鍝勫�婚崣鍡涙⒑缂佹ɑ绀�闁稿﹤婀遍敓鑺ョ啲閹凤拷?" + role.getName());
			return;
		}
		if(SceneTeam.TEAM_NORMAL == role.getTeamState()){
			Scene.LOG.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱婢у鏌涢妶鍥ф灈闁哄苯绉剁槐鎺懳熼悜鈺傚闂備線娼уú銈囷拷姘嵆閻涱喖螣閸忕厧纾梺缁樺灦椤洭鏁撴禒瀣暫婵﹨娅ｇ槐鎺懳熼懖鈺婂悑闂備線娼荤紞鍥╁緤娴犲缍栭煫鍥ㄦ媼濞差亶鏁傜�广儱妫欏▍鍥⒒娴ｇ懓顕滅紒璇插�块獮濠冩償閵娿儳顔戦梻鍌氱墛缁嬪牓寮ㄦ禒瀣挃闁搞儺鍓﹂弫瀣節婵犲倹鍣藉☉鎾崇Ч閺岀喖骞嗚閿涘秹鏌￠崱顓犵暤闁哄本娲樼换娑㈠垂椤旂厧顥欓梻浣虹帛濮婂宕㈣鐎靛ジ鎮╃紒妯煎幈闂佸搫娲㈤崝宀勭嵁閺嶎厽鐓熸い鎾跺枔缁犵偞鎱ㄦ繝鍕笡闁瑰嘲鎳樺畷銊︾節閸愩劌澹嶅┑锛勫亼閸娧呯不閹烘嚦娑㈠礋椤栨氨鍘洪悗骞垮劚濡盯鍩炲鍡愪簻鐟滃繘鎮橀幎宄歵e婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓闁搞劌鍊块弻锝夊閻樺啿鏆堥梺绋款儏椤戝懘鍩為幋锔藉亹闁圭粯甯楀▓顓烆渻閵堝棙绀嬪ù婊冪埣瀵鈽夐姀鐘插敤濡炪倖鍔戦崐褏妲愰敓锟�" + role.getName());
			return;
		}
		if(! role.checkNeedCheckPos())
			return;
		
		role.clearNeedCheckPos();
		
		final Position  pos = new Position(curpos.x, curpos.y, locz);
		if(role.getScene().checkBlock(pos.toGridPos(), pos.getWalkBlockType()))
		{
			role.broadResetPosition();
			return;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴姘舵濞存粌缍婇弻娑㈠箛閸忓摜鏁栭梺娲诲幗閹瑰洭寮诲☉銏╂晝闁挎繂妫涢ˇ銊╂⒑缁嬫鍎涘ù婊庝邯瀵鈽夐姀鐘靛姶闂佸憡鍔︽禍鏍ｉ崼銏㈢＝濞撴艾锕ョ�氬綊姊虹化鏇炲⒉妞わ箓缂氶妵鎰板箳閹惧厖绨甸梺纭呭閹活亞寰婃ィ鍐ㄧ疅濠靛倸鎲￠埛鎴︽倵閸︻厼顎岄柛銈嗙懇濮婅櫣鏁鍓滈悗娈垮枛椤兘骞冮姀銈呯缁炬媽椴搁ˉ鍫ユ⒒娴ｇ鏆遍柟纰卞亰瀹曨垱瀵肩�涙ɑ娅栭梺缁樻煥閸氬鍩涢幋鐘电＜閻庯綆鍋掗崕銉╂煕鎼淬垻鐭岀紒杈ㄦ尭椤撳ジ宕熼褎袦婵＄偑鍊栧ú鈺冪礊娓氾拷閵嗕礁鈻庨幘鏉戯拷閿嬨亜閹虹偞瀚瑰銈呭閻╊垰顫忓ú顏咁棃闁宠桨鑳跺Σ锝夋⒑閸涘鑰跨紒鐘崇墳濡喎顪冮妶鍡樷拻闁哄拋鍋嗙划缁樸偅閸愨晝鍘甸柣搴ｆ暩椤牊绂掗敃鍌涘�堕煫鍥风到楠炴绱掓潏銊ョ瑲鐎垫澘瀚敓鏂ょ秵閸嬪嫰宕径鎰�甸悷娆忓绾炬悂鏌涢妸銈囩煓闁绘侗鍠氶敓鏂ょ秵閸犳宕戦幇鐗堢厱闁归偊鍓氶埢鏇㈡煥閻斿憡鐏柟鍑ゆ嫹?
		}
		if(SRelocateRolePos.MAX_DISTANCE < pos.getDistance(role.getPos()))
		{
			role.broadResetPosition();
			return;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴姘舵濞存粌缍婇弻娑㈠箛閸忓摜鏁栭梺娲诲幗閹瑰洭寮诲☉銏╂晝闁挎繂妫涢ˇ銊╂⒑缁嬫鍎涘ù婊庝邯瀵鈽夐姀鐘靛姶闂佸憡鍔︽禍婵嬪闯椤撱垺鍊甸悷娆忓缁�锟藉銈忛檮婢瑰棝骞戦姀鐘斀閻庯綆鍋掑Λ鍐ㄢ攽閻愭潙鐏﹂柤褰掔畺閸╂盯宕奸妷锔规嫼闁荤姴娲﹁ぐ鍐敆閵忋倖鐓熼柟缁㈠灲閹风兘骞囨担鍛婎吙闂備礁澹婇崑鍛洪弽顓熷亗婵炴垶鈼よぐ鎺撴櫜闁告侗鍠涚涵锟介梻浣哥枃椤绮欓幘鑸殿潟闁规儳鐡ㄦ刊鎾煣韫囨洘鍤�缂佹绻濆娲嚒閵堝懏姣愰梺鍝勬噺閻╊垶銆佸鑸垫櫜濠㈣埖蓱閺呪晠姊虹紒妯哄Е闁告挻鐟╅、鎾斥槈閵忊檧鎷洪梻鍌氱墐閺呮盯鎯佸鍫熺厱婵鎷风紒鐘崇墳濡喎顪冮妶鍡樷拻闁哄拋鍋嗙划缁樸偅閸愨晝鍘甸柣搴ｆ暩椤牊绂掗敃鍌涘�堕煫鍥风到楠炴绱掓潏銊ョ瑲鐎垫澘瀚敓鏂ょ秵閸嬪嫰宕径鎰�甸悷娆忓绾炬悂鏌涢妸銈囩煓闁绘侗鍠氶敓鏂ょ秵閸犳宕戦幇鐗堢厱闁归偊鍓氶埢鏇㈡煥閻斿憡鐏柟鍑ゆ嫹?
		}
		
		// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢绘俊鐐�栭悧妤冪矙閹炬眹锟藉懘寮婚妷锔惧弳濠电娀娼уΛ顓炍ｈぐ鎺撶厱閹艰揪绱曟晥闂佸搫鐭夌紞浣割嚕椤曪拷瀹曟帒顫濋璺ㄥ笡闂傚倷绀侀幖顐︻敄閸曨垱鍤勯柛鎾茬劍椤洟鏌熼幑鎰靛殭闂佸崬娲弻鏇＄疀閺囩儐娼欓梺闈涳紡閸涱垽绱插┑鐘灱濞夋盯鈥﹂鍕惞闁绘棁娅ｇ壕濂稿级閸稑濡界�规洖鐭傞弻鈩冩媴鐟欏嫬纾抽梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�?,濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洤顫忔繝姘唶闁绘柧绱幏鐑芥寠婢规繃妞介、鏃堝礋椤栨稒娈斿┑鐘茬棄閺夊尅鎷疯楠炲繘鏌ㄧ�ｂ晝绠氬銈嗗姧缂嶅洭鎳撻崸妤佺厸閻忕偟顭堟晶鑼拷鍨緲鐎氼參骞嗛弮鍫濐潊闁逞屽墾閹烽攱绻濋崒妤佹杸闂佺粯鍔欏褏鏁崼鏇熺厸闁割偒鍋勬晶鎾煏閸℃鏆ｅ┑锛勫厴閸╋繝宕掑鐐闁绘垼濮ら崐鍨箾閹寸偟鎳愰柣鎺嶇矙閺屻劌鈽夊▎鎴旀缂備胶绮惄顖炲极閹版澘宸濇い鏃囧Г閸婄兘姊绘担鐟邦嚋婵炶闄勭粋宥夘敂閸喎浠掑銈嗘穿閹风兘鏌℃担瑙勫磳闁轰焦鎹囬弫鎾绘晸閿燂拷?,闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘骞戦姀銈呯疀妞ゆ棁妫勬惔濠囨⒑瑜版帒浜伴柛顭戝墯缁傚秹鎮烽柇锔惧數闁荤姾娅ｉ崕銈咃耿閻楀牄浜滄い鎰剁稻缁�瀣煛瀹�锟介崰搴ㄥ煝閹捐鍨傛い鏃傛櫕瑜版煡姊绘担鍛婅础闁稿繑锕㈠銊╂焼瀹ュ懐顔嗛梺鍛婄♁濞兼瑧绮堥崘鈹夸簻妞ゆ挾鍠庨悘锔姐亜閵夈儳效婵﹦绮幏鍛喆閸曨偂鍝楀┑鐐差嚟閸樠兠洪鐐垫殾闁靛ň鏅╅弫濠囨煕韫囨艾浜归柨鐔虹摂閸欏啫顫忕紒妯诲闁告稑锕ㄧ涵锟介梻浣侯焾缁ㄦ椽宕愰弴鐘插疾闂備礁鎼粙渚�宕㈤弮锟藉鍕償閿濆洦婢戞繝鐢靛仦閸ㄥ爼鎮烽姀銈呯闁告繂瀚峰〒濠氭煏閸繃顥滅紒妤�鍊荤槐鎺楀垂濞戣櫕瀚归柡鍌樺劜閻忎礁鈹戦绛嬫闁归鍏橀弻鈥崇暆鐎ｎ剛鐦堥悗瑙勬礋娴滃爼銆佸锟介幃銏＄附婢跺澶勯梻鍌氬�搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳顭烽弻娑㈠焺閸愵亖妲堥梻鍌氬亞閸ㄥ爼寮婚妸銉㈡斀闁糕檧鏅滆倴闂備浇娉曢崰鏇炍涢崟顖氱９闁秆勵殔閺嬩線鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓
		role.updatePosition(pos);
		role.clearCurDestPos();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 790447;

	public int getType() {
		return 790447;
	}

	public long sceneid;
	public fire.pb.move.Pos curpos;
	public byte locz; // RelocateRolePos的z坐标

	public CRelocateRolePos() {
		curpos = new fire.pb.move.Pos();
	}

	public CRelocateRolePos(long _sceneid_, fire.pb.move.Pos _curpos_, byte _locz_) {
		this.sceneid = _sceneid_;
		this.curpos = _curpos_;
		this.locz = _locz_;
	}

	public final boolean _validator_() {
		if (!curpos._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(sceneid);
		_os_.marshal(curpos);
		_os_.marshal(locz);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		sceneid = _os_.unmarshal_long();
		curpos.unmarshal(_os_);
		locz = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRelocateRolePos) {
			CRelocateRolePos _o_ = (CRelocateRolePos)_o1_;
			if (sceneid != _o_.sceneid) return false;
			if (!curpos.equals(_o_.curpos)) return false;
			if (locz != _o_.locz) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)sceneid;
		_h_ += curpos.hashCode();
		_h_ += (int)locz;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(sceneid).append(",");
		_sb_.append(curpos).append(",");
		_sb_.append(locz).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRelocateRolePos _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(sceneid - _o_.sceneid);
		if (0 != _c_) return _c_;
		_c_ = curpos.compareTo(_o_.curpos);
		if (0 != _c_) return _c_;
		_c_ = locz - _o_.locz;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

