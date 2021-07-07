
package fire.pb.move;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRoleStop__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRoleStop extends __CRoleStop__ {
	@Override
	protected void process() {
		// protocol handle
		final Role role = RoleManager.getInstance().getRoleByProtocol(this);
		if(null == role)
			return;
		if(sceneid != role.getScene().getSceneID())
			return;
		
		role.clearCurDestPos();
		
		if(! role.checkMoveUnit()) return;
		
		//checkmove濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柛婵嗗椤忋儵鏌涙惔銊ゆ喚闁糕晝鍋ら獮瀣晜閽樺姹楅梻浣告啞閻熴儵藝娴兼潙绠栨繛鍡樺灩绾捐棄霉閿濆懏鎯堟い搴＄焸閺屾盯濡搁妷褍鐓熼悗娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈嗙箾绾绡�鐎殿喖顭烽幃銏ゅ川婵犲嫮肖闂備礁鎲￠幐鍡涘川椤旂瓔鍟呯紓鍌氬�搁崐鐑芥嚄閼搁潧鍨旀い鎾卞灩閸ㄥ倿鏌涢锝嗙闁藉啰鍠栭弻鏇熺箾閻愵剚鐝曢梺绋款儏濡繈寮诲☉姘勃闁告挆锟藉Σ鍫濐渻閵堝懘鐛滈柟鍑ゆ嫹?
		if(!CCheckMove.checkmove(role, role.getScene().getSceneID(), pos, poslist, System.currentTimeMillis()))
		{
			return;	
		}
		
		role.clearCurDestPos();

		/*濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ψ瑜忕壕钘壝归敐鍛儓鐏忓繘姊洪崨濠庢畷濠电偛锕ら锝囨嫚濞村顫嶅┑鈽嗗灦閺�閬嶅棘閿熶粙姊绘担鍛婂暈婵炶绠撳畷鎴﹀礋椤掍礁寮块梺闈涚箞閸婃牠鍩涢幋鐐电闁煎ジ顤傞崵娆愵殽閻愭惌娈滈柡宀�鍠栭幃鐑芥偋閸繃鐏庢俊銈囧Х閸嬫盯宕銉т簷闂備礁鎲℃笟妤呭闯椤斿槈娑㈠礃閵娿垺鏂�闂佺粯鍔栧娆撴倶閿曞倹鐓熼柣鏇炲�婚悾鐢碉拷瑙勬磻閸楁娊鐛崶顒夋晣闁绘ɑ顔栭崯搴ㄦ⒒娴ｇ儤鍤�妞ゆ洦鍙冨畷鎴︽倷閸忓摜鍓ㄥ銈嗘尵婵澹曢悡搴唵閻犺櫣灏ㄩ崝鐔兼煕閳哄绉柡灞稿墲閹峰懐鎲撮崟顐わ紦闂備礁婀遍…鍫ユ晝閵夈儺鍤楅柛鏇ㄥ亞閺嗗棝鏌ㄩ悢鍓佺煓鐎殿喖鍟块埥澶愬閳撅拷閹疯櫣绱撴担鍓插剰婵炵》绻濆畷锝夊礋椤愶拷閻熼偊鐓ラ柛鏇ㄥ亜婵鈹戦埥鍡椾簽闁哥姴閰ｉ垾鏃堝礃椤斿槈褔鏌涢埄鍐噧妞ゎ値鍛＝濞撴艾娲ら弸娑㈡倵濞戞帗娅囩紒顔界懄瀵板嫭绻濇惔鈩冨�┑鐘灱濞夋盯顢栭崶顒�鐭楅柛鈩冪♁閳锋垹绱撴担鑲℃垹绮堥敓浠嬫⒑缁嬪尅宸ユ繝锟介柆宥嗘櫢闁兼亽鍎抽崯鏌ユ煙閸戙倖瀚�? final SRoleStop snd = new SRoleStop();
		snd.roleid = role.getRoleID();
		snd.pos = role.getPos().toProtocolPos();
		role.sendWhoSeeMe(snd);*/
		/*濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ψ瑜忕壕钘壝归敐鍛儓鐏忓繘姊洪崨濠庢畷濠电偛锕ら锝囨嫚濞村顫嶅┑鈽嗗灦閺�閬嶅棘閿熶粙姊绘担鍛婂暈婵炶绠撳畷鎴﹀礋椤掍礁寮块梺闈涚箞閸婃牠鍩涢幋鐐电闁煎ジ顤傞崵娆愵殽閻愭惌娈滈柡宀�鍠栭幃鐑芥偋閸繃鐏庢俊銈囧Х閸嬫盯宕銉т簷闂備礁鎲℃笟妤呭闯椤斿槈娑㈠礃閵娿垺鏂�闂佺粯鍔栧娆撴倶閿曞倹鐓熼柣鏇炲�婚悾鐢碉拷瑙勬磻閸楁娊鐛崶顒夋晣闁绘ɑ顔栭崯搴ㄦ⒒娴ｇ儤鍤�妞ゆ洦鍙冨畷鎴︽倷閸忓摜鍓ㄥ銈嗘尵婵澹曢悡搴唵閻犺櫣灏ㄩ崝鐔兼煕閳哄绉柡灞稿墲閹峰懐鎲撮崟顐わ紦闂備礁婀遍…鍫ユ晝閵夈儺鍤楅柛鏇ㄥ亞閺嗗棝鏌ㄩ悢鍓佺煓鐎殿喖鍟块埥澶愬閳撅拷閹疯櫣绱撴担鍓插剰婵炵》绻濆畷锝夊礋椤愶拷閻熼偊鐓ラ柛鏇ㄥ亜婵鈹戦埥鍡椾簽闁哥姴閰ｉ垾鏃堝礃椤斿槈褔鏌涢埄鍐噧妞ゎ値鍛＝濞撴艾娲ら弸娑㈡倵濞戞帗娅囩紒顔界懄瀵板嫭绻濇惔鈩冨�┑鐘灱濞夋盯顢栭崶顒�鐭楅柛鈩冪♁閳锋垹绱撴担鑲℃垹绮堥敓浠嬫⒑缁嬪尅宸ユ繝锟介柆宥嗘櫢闁兼亽鍎抽崯鏌ユ煙閸戙倖瀚�?2 final SRoleMove snd = new SRoleMove();
		snd.roleid = role.getRoleID();
		snd.destpos = role.getPos().toProtocolPos();
		role.sendWhoSeeMe(snd);*/

	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 790442;

	public int getType() {
		return 790442;
	}

	public java.util.LinkedList<fire.pb.move.Pos> poslist; // 路径上的关键点
	public fire.pb.move.Pos pos; // 位置
	public long sceneid;

	public CRoleStop() {
		poslist = new java.util.LinkedList<fire.pb.move.Pos>();
		pos = new fire.pb.move.Pos();
	}

	public CRoleStop(java.util.LinkedList<fire.pb.move.Pos> _poslist_, fire.pb.move.Pos _pos_, long _sceneid_) {
		this.poslist = _poslist_;
		this.pos = _pos_;
		this.sceneid = _sceneid_;
	}

	public final boolean _validator_() {
		for (fire.pb.move.Pos _v_ : poslist)
			if (!_v_._validator_()) return false;
		if (!pos._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(poslist.size());
		for (fire.pb.move.Pos _v_ : poslist) {
			_os_.marshal(_v_);
		}
		_os_.marshal(pos);
		_os_.marshal(sceneid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.move.Pos _v_ = new fire.pb.move.Pos();
			_v_.unmarshal(_os_);
			poslist.add(_v_);
		}
		pos.unmarshal(_os_);
		sceneid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRoleStop) {
			CRoleStop _o_ = (CRoleStop)_o1_;
			if (!poslist.equals(_o_.poslist)) return false;
			if (!pos.equals(_o_.pos)) return false;
			if (sceneid != _o_.sceneid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += poslist.hashCode();
		_h_ += pos.hashCode();
		_h_ += (int)sceneid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(poslist).append(",");
		_sb_.append(pos).append(",");
		_sb_.append(sceneid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

