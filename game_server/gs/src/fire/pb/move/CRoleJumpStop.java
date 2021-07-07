
package fire.pb.move;

import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;
import fire.pb.scene.sPos.Position;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRoleJumpStop__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRoleJumpStop extends __CRoleJumpStop__ {
	@Override
	protected void process() {
		final Role role = RoleManager.getInstance().getRoleByProtocol(this);
		if(null == role)
			return;
		
		if(! role.checkMoveUnit()) return;
		
		if(! role.isJumping()) return;
		
		//checkmove 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柛婵嗗椤忋儵鏌涙惔銊ゆ喚闁糕晝鍋ら獮瀣晜閽樺姹楅梻浣告啞閻熴儵藝娴兼潙绠栨繛鍡樺灩绾捐棄霉閿濆懏鎯堟い搴＄焸閺屾盯濡搁妷褍鐓熼悗娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈嗙箾绾绡�鐎殿喖顭烽幃銏ゅ川婵犲嫮肖闂備礁鎲￠幐鍡涘川椤旂瓔鍟呯紓鍌氬�搁崐鐑芥嚄閼搁潧鍨旀い鎾卞灩閸ㄥ倿鏌涢锝嗙闁藉啰鍠栭弻鏇熺箾閻愵剚鐝曢梺绋款儏濡繈寮诲☉姘勃闁告挆锟藉Σ鍫濐渻閵堝懘鐛滈柟鍑ゆ嫹?
		/*final long curTick = System.currentTimeMillis();
		if(!CCheckMove.checkmove(role,sceneid, destpos, poslist,curTick))
		{
			return;//checkmove婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁诡垎鍐ｆ寖缂備緡鍣崹鎶藉箲閵忕姭妲堥柕蹇曞Х椤撴椽姊虹紒妯哄闁诲繑宀稿畷瀹狀槾缂佽鲸鎸婚幏鍛矙濞嗙偓娈洪梻浣侯焾椤戝啴宕愬┑鍡╁殨閻犲洦绁村Σ鍫ユ煏韫囨洖顫嶉柕濠忚礋娴滄粓鏌￠崘銊ワ拷鍝ユ暜閼哥偣浜滄い鎰枑濞呭洨绱掓潏銊﹀鞍缂佹鍠愮换婵嬪礃椤垳绱﹂梻鍌氬�风粈浣圭珶婵犲洤纾婚柛鈩冪☉缁愭鏌熼幑鎰【濠殿噮鍓熼弻銊╂偄閸撲胶鐓撳┑顔硷工椤嘲鐣烽幒鎴僵闁告鍎愰弶绋库攽閻愬瓨灏扮痪鏉跨Ч閵嗗啯绻濋崒婊勬闂佸搫娴勭槐鏇㈡偪閿熻棄鈹戦悙鏉戠仸闁荤啙鍥у偍闂侇剙绉甸埛鎴︽⒒閸喍绶遍柣鎺楃畺閺屾稒鎯旈妸銈嗗枤闂佽桨鐒﹂幑鍥箰婵犲啫绶炵�癸拷閿熻姤顨欏┑掳鍊楁慨鐑藉磻濞戙垺鍋嬮柟鍓х節缁诲棝鏌熼梻瀵割槮閸烆垶鏌熼懝鐗堝涧缂佽弓绮欏绋库槈濞嗘ɑ顔旈梺缁樺姈濞兼瑦鎱ㄩ崼銉︾厵妞ゆ牗绋掗ˉ鍫ユ煛娴ｇ懓濮嶇�规洘锕㈤獮鎰償閳藉棔绱﹂梻鍌欑缂嶅﹪宕戞繝鍥х獥婵ê宕ˉ姘舵煢濡警妲堕柨鐔诲Г鐢帡锝炲┑瀣垫晢濠电姴鍟弳浼存⒑鐠囨彃顒㈤柤鐟板⒔缁辩偞绻濋崒銈嗙稁闂佹儳绻楅～澶婄暦婢舵劖鐓忓┑鐐茬仢閸旀粓鏌ｅ┑鍕伈婵﹥妞介幃鐑藉级閹稿寒鍞ㄩ梻浣烘嚀閸ゆ牠骞忛敓锟�?
		}*/
		Position stoppos = new Position(destpos.x, destpos.y, destz);
		role.stopJump(stoppos);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 790479;

	public int getType() {
		return 790479;
	}

	public fire.pb.move.Pos destpos; // 飞越停止点
	public byte destz; // 飞越停止z坐标

	public CRoleJumpStop() {
		destpos = new fire.pb.move.Pos();
	}

	public CRoleJumpStop(fire.pb.move.Pos _destpos_, byte _destz_) {
		this.destpos = _destpos_;
		this.destz = _destz_;
	}

	public final boolean _validator_() {
		if (!destpos._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(destpos);
		_os_.marshal(destz);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		destpos.unmarshal(_os_);
		destz = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRoleJumpStop) {
			CRoleJumpStop _o_ = (CRoleJumpStop)_o1_;
			if (!destpos.equals(_o_.destpos)) return false;
			if (destz != _o_.destz) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += destpos.hashCode();
		_h_ += (int)destz;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(destpos).append(",");
		_sb_.append(destz).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRoleJumpStop _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = destpos.compareTo(_o_.destpos);
		if (0 != _c_) return _c_;
		_c_ = destz - _o_.destz;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

