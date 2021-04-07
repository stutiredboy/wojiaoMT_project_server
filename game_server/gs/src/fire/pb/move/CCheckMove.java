
package fire.pb.move;
import java.util.List;


import fire.pb.move.Pos;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;
import fire.pb.scene.sPos.Position;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCheckMove__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CCheckMove extends __CCheckMove__ {

	@Override
	protected void process() {
		final Role role = RoleManager.getInstance().getRoleByProtocol(this);
		if(null == role) return;
		if(null == role.getScene()) return;
		
		final long curTick = System.currentTimeMillis();
		if(! role.checkValidFrequency(curTick)){
			return;//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢绘俊鐐�栭悧妤冪矙閹炬眹锟藉懘宕ｆ径宀�鐦堟繝鐢靛Т閸婄粯鏅堕弴鐘电＜闁绘瑱鎷烽柛銊ョ埣瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘遍柣搴�ラ崟顒傚綃闂備礁鎼張顒�煤濡警鍤楅柛鏇ㄥ�犻悢鍏兼優闂侇偅绋戠�佃尙绱撻崒姘拷椋庢閵堝绠�瑰嫰鍋婇悢鍡涙偣閸濆嫬濞囬柛顐ｆ儕閿濆閱囬柕澶涘閸樼敻姊虹拠鈥崇�婚柛婊冨暟缁�濠囨⒑閸濄儱鏋旀い顓炵墦閸╃偤骞嬮敂钘夛拷鐑芥煛婢跺鐏╅柛鏂挎啞缁绘稓锟芥稒顭囬惌銈吤瑰搴濋偗闁诡喕鍗抽、姘舵晸娴犲鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘?
		}
		
		checkmove(role, sceneid, curpos, poslist,curTick);
		
	}
	
	public static boolean checkmove(Role role,long sceneid, fire.pb.move.Pos curpos,List<fire.pb.move.Pos> poslist, long curTick)
	{
		if(role.getScene().getSceneID() != sceneid) return false;
		
		if(! role.checkMoveUnit())
		{
			//Scene.logger.debug("闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎽傜�ｎ喖鐐婃い鎺炴嫹缂佺媭鍣ｉ弻锟犲磼濡尨鎷峰Δ鍐煓闊洦鎸撮弨浠嬪箳閹惰棄纾归柡鍥ュ灩缁犵娀鐓崶銊р槈闁告艾婀遍敓鐣屾閹风兘鏌涢弴銊ュ闁告ɑ鎮傞弻锝堢疀閺囩偘鍝楀銈嗘肠閸パ咁槷濠电姴锕ら幊蹇涘磻閺嶃劎绡�闂傚牊绋掑婵堢磼閻樿崵鐣洪柟顔筋殜閹棄鈻撶捄銊ュЪ闂佹眹鍩勯崹鐗堟櫠鎼达絾顫曢柟鐑樻尭缁剁偤鎮楅敐搴濈按闁哄鐟╁铏规兜閸涱喚褰ч梺鑽ゅ暱閺呯姴顕ｉ锕�绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹, 濠电姷鏁告慨鐑藉极閹间礁纾婚柣妯款嚙缁犲灚銇勮箛鎾搭棞缂佽翰鍊濋弻锕�螣閻氬绀嗗┑鐐村灦鑿ら柡锟芥禒瀣厱闁虫拝鎷烽柡鍛箞瀹曟繂鐣￠柇锔藉瘜闂侀潧鐗嗛幊鎰不娴煎瓨鐓熸俊銈忔嫹闁挎洦浜畷鍝勨槈閵忕姷顔掔紓鍌欑劍椤洭宕㈡禒瀣拺闁告繂瀚敓鑺ユ倐閹ê鈹戠�ｎ亞鐣洪梺鐟邦嚟閸嬬偤宕ｈ箛娑欑叆婵犻潧妫欓ˉ婊冣攽椤旇偐效闁哄矉绱曟禒锕傚礈瑜夊Σ鍫ユ⒑鐎圭媭鍤欓梺甯秮閻涱噣宕堕澶嬫櫌闂佺鏈悷锕傘�佸Ο琛℃斀闁绘ê鐏氶弳鈺呮煕鐎ｎ偆娲村┑鈥冲缁瑥鈻庨崜褍濮洪柣鐔哥矋閸ㄥ潡骞冨锟介弫鎾绘晸閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佲枙闁绘帟濮ょ换娑㈠幢濡粯鍎庨梺杞扮鐎氫即寮诲☉銏犵労闁告劦浜濋崳顕�姊哄ú璇插箺闁圭懓娲濠氭晲婢跺﹦顓洪梺鎸庣箓濡厼螞閸曨厾纾藉ù锝呮惈鏍￠柣銏╁灲缁绘繂顕ｆ繝姘櫜濠㈣泛谩閵娾晜鐓忓鑸得▍娆撴煙妞嬪骸鍘撮柡浣规崌閺佹捇鏁撻敓锟�" + role.getName() + "\t" + role.getTeamIndex());
			return false;
		}
		
		if (!role.canMove())
		{
			role.confirmCurPosition();
			return false;
		}
		
		if(role.isJumping())
		{
			//role.getJumpRole().confirmPositionToStart();
			return false;
		}
		
		int z = role.getPos().getZ();
		final Position destPos = new Position(curpos.x, curpos.y, z);
		final java.util.List<Position> positions = new java.util.ArrayList<Position>();
		positions.add(role.getPos());// 闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘骞戦姀銈呯疀妞ゆ棁妫勬惔濠囨⒑瑜版帒浜伴柛搴ㄦ涧閳藉螣闁垮锟藉妫呴銏″偍闁稿孩鎸抽弫鎾绘寠婢跺浠撮梺鍝勬湰閻╊垱淇婇悜绛嬫晩闁绘挸瀵掑鑽ょ磽閸屾瑧绛忛柟宄板槻椤潡鎳滈棃娑橆潔闂佺粯鎸搁崯鎾蓟閺囩喎绶為柛顐ｇ箓椤姊虹紒妯肩濞存粠浜濠氭晲閸涱亝鏂�闂佸憡娲﹂崑鎾诲箯閻戣棄鍗抽柕蹇曞Х閸欙拷濠电姰鍨奸崺鏍礉閺囩姷涓嶉柤濮愬�楃壕鍏肩箾閹寸偟顣查柛銈忔嫹濠电姵顔栭崰妤冪矙閹达箑鐓橀柟杈鹃檮閸婄兘鏌ょ喊鍗炲妞ゃ倧鎷烽梻鍌欑劍閹爼宕濆畝鍕ч柛娑橈梗缁诲棝鏌ｉ姀銏╃劸缂佺姵鐩弻鈩冨緞鎼淬垻銆婂銈嗘⒐鐢�愁潖濞差亜宸濆┑鐘插�搁～灞解攽閳藉棗鐏犻柨鏇ㄤ簻椤曪綁骞栨担瑙勬婵炲濮撮鍡涘煕閹烘嚚褰掓晲婢舵ɑ顥栨繛鎴炴尰閻擄繝寮婚悢鐓庣闁靛牆妫楅锟�? 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸崹楣冨箛娴ｅ湱绋佺紓鍌氬�烽悞锕佹懌闂佸憡鐟ョ换姗�寮婚悢铏圭＜闁靛繒濮甸悘鍫ユ⒑濞茶骞楁い銊ワ躬瀵鈽夐姀鐘靛姶闂佸憡鍔︽禍鏍ｉ崼銏㈢＝濞撴艾锕ョ�氬綊姊虹化鏇炲⒉妞わ箓缂氶妵鎰板箳閹惧厖绨甸梺鐟板悑閹矂宕伴弽褉鏋旈柛顐ｆ礃閸婄敻鎮峰▎蹇擃仾缂佸矁娉曠槐鎾愁吋閸曨厾鐛㈠Δ鐘靛仜閸熸娊濡甸幇鏉跨闁瑰濮撮敓鐣屽仱濮婃椽骞愭惔銏紱缂備緤鎷峰〒姘炬嫹鐎规洏鍨介弫鎾绘偐閺傘儲瀚肩紓鍌欑椤戝棝顢栧▎鎾崇？婵犲﹤鎳愮壕鐣岋拷骞垮劚鐎氼噣藝閿曞倹鐓熼柨婵嗘噹濡茬粯銇勯锝囩疄妞ゃ垺顨嗗鍕拷锝庝簽濡诧綁姊婚崒娆掑厡妞ゃ垹锕敐鐐村緞閹邦剛顦梺鍝勬储閸ㄨ鐣垫笟锟介弻銊╂偆閸屾稑顏�
		for(final Pos p : poslist)
			positions.add(new Position(p.x, p.y, z));
		
		final int length = destPos.getDistance(role.getPos());
		if(role.isJumping())
		{
			//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愬绡�闁汇垽娼у瓭闁诲孩绋堥弲娑€�呮總绋课╅柍鍝勫�甸幏娲⒑閸︻収鐒炬繛鎾棑缁骞樼紒妯煎幍闂佸憡鍔樼亸娆戠不婵犳碍鐓熼柟鍨暙婢у瓨銇勯姀鈽嗘疁鐎规洜鍠栭、妤呮晸閼恒儳顩锋い鏍仦閳锋垿鏌涘☉姗堝姛缂佺姵鎹囬幃妤�顫濋悡搴㈢彎閻庢鍠楅幃鍌氱暦濮楋拷椤㈡棃宕卞▎娆戝簥闂佽娴峰▍銏ゅ箯閻戣姤鍊甸柨婵嗛娴滄粍銇勮箛銉﹀
			if(!role.getJumpRole().checkValidJump(positions, destPos))
			{
				role.getJumpRole().confirmPositionToStart();
				return false;
			}
		}
		else
		{
			// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸モ晝鍘犻梻浣虹帛閸ㄥ爼寮搁懡銈囩闁哄诞宀�鍞甸柣鐘烘鐏忋劑宕濋悢鍏肩厸闁糕剝鍔曢敓鑺ユ礋濠�渚�姊洪幐搴ｇ畵婵炲眰鍊濆畷婵堬拷锝庡墾閹烽鎲撮崟顒傤槬濡炪倧缂氶崡铏繆閻㈢绀嬫い鏍ㄨ壘閸炪劑姊洪棃娴ゆ盯宕ㄩ姘瑢婵犵數濮烽弫鎼佸磻濞戙垺鍋嬮煫鍥ㄦ⒒缁犻箖鏌ㄩ悢璇残撻柟渚垮妽缁绘繈宕掗妶鍥ф倯闂備浇妗ㄩ悞锕傚箰閼姐倗鐭夐柟鐑樻閹风兘鏁愭惔婵堢泿闂佽瀵掗崢濂糕�旈崘顔嘉ч柛鈩兦氶幏濠氭⒑閸愭彃妲婚柣妤佹尭閻ｇ兘顢楅敓鐣屽弲濡炪倕绻愰幊鎰板储閸涘﹦绡�闁靛骏绲剧涵鐐繆椤愶絿鎳冮柍璇茬Ч瀹曞崬鈻庨幋鐙呯床闂佽鍑界紞鍡涘磻閸℃ɑ娅犻柣銏犳啞閻撳繘鏌涢埄鍐╃缂佹劖姊归〃銉╂倷瀹割喖鍓堕梺杞扮閸婂潡骞冮崜褌娌柦妯猴紞閵夆晜鈷掗柛灞剧懆閸忓瞼绱掗鍛仸鐎殿喖顭锋俊鎼佸煛娴ｅ摜鍝庨梻浣告惈鐞氼偊宕曞ú顏勬瀬濠电姴鍊甸弨浠嬫煟濡搫绾у璺哄閺岋綁骞樼�涙顦伴梺鍝勭灱閸犳牕鐣烽锕�绀嬮梻鍫熺☉婢瑰牓姊绘担鑺ョ《闁哥姵娲橀幈銊╁Χ婢跺浜遍梺缁樏Ο濠囧吹閺囩偐鏀介柣妯虹－椤ｆ煡鏌￠崨顔藉�愰柡灞诲姂閹倝宕掑☉姗嗕紦
			int cruiseid = role.getCruiseid();
			if(! role.checkValidMove(cruiseid, positions, destPos, curTick, length))
			{
				role.confirmCurPosition();
				return false;
			}
		}
		role.move(destPos);
		if(!role.isJumping())
			SceneBattle.process(role, length, curTick);
		return true;
	}
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 790435;

	public int getType() {
		return 790435;
	}

	public fire.pb.move.Pos curpos; // 人物当前点
	public java.util.LinkedList<fire.pb.move.Pos> poslist; // 路径上的关键点
	public long sceneid; // 场景id

	public CCheckMove() {
		curpos = new fire.pb.move.Pos();
		poslist = new java.util.LinkedList<fire.pb.move.Pos>();
	}

	public CCheckMove(fire.pb.move.Pos _curpos_, java.util.LinkedList<fire.pb.move.Pos> _poslist_, long _sceneid_) {
		this.curpos = _curpos_;
		this.poslist = _poslist_;
		this.sceneid = _sceneid_;
	}

	public final boolean _validator_() {
		if (!curpos._validator_()) return false;
		for (fire.pb.move.Pos _v_ : poslist)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(curpos);
		_os_.compact_uint32(poslist.size());
		for (fire.pb.move.Pos _v_ : poslist) {
			_os_.marshal(_v_);
		}
		_os_.marshal(sceneid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		curpos.unmarshal(_os_);
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.move.Pos _v_ = new fire.pb.move.Pos();
			_v_.unmarshal(_os_);
			poslist.add(_v_);
		}
		sceneid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CCheckMove) {
			CCheckMove _o_ = (CCheckMove)_o1_;
			if (!curpos.equals(_o_.curpos)) return false;
			if (!poslist.equals(_o_.poslist)) return false;
			if (sceneid != _o_.sceneid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += curpos.hashCode();
		_h_ += poslist.hashCode();
		_h_ += (int)sceneid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(curpos).append(",");
		_sb_.append(poslist).append(",");
		_sb_.append(sceneid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

