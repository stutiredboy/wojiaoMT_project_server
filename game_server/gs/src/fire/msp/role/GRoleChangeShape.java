
package fire.msp.role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GRoleChangeShape__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GRoleChangeShape extends __GRoleChangeShape__ {
	@Override
	protected void process() {
		// protocol handle
		fire.pb.scene.movable.Role  role = 
				fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
			if(role == null) return;
			if(null == role.getScene()) return;
			role.setModeid(shape);
			mkio.Protocol send;
			if (reason == HUANSE) {
				send = new fire.pb.move.SRoleModelChange();
				((fire.pb.move.SRoleModelChange)send).roleid = roleid;
				((fire.pb.move.SRoleModelChange)send).shape = shape;
			} else {
				send = new fire.pb.move.SRoleChangeShape();
				((fire.pb.move.SRoleChangeShape)send).roleid = roleid;
				((fire.pb.move.SRoleChangeShape)send).shape = shape;
			}
		//	role.sendWhoSeeMeAndMe(send);
			if(role.checkVisible())
			{
				role.sendAround(send);
			}
			// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垹顭峰缁樻媴閻熼偊鍤嬪┑鐐插级閻楃姴鐣烽幇鏉跨濞达絿顭堥悗顓㈡⒑缁嬭法鐏遍柛瀣仱閹繝濡烽埡鍌滃幗闂佸搫娲ㄩ崑娑㈡晸閽樺璐￠柨鐔诲Г閻旑剟骞忛敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫ょ紓渚婃嫹濠电姴娲﹂悡銉╂煟閺冨浂鍤欑悮姘辩磽娴ｈ櫣甯涢柣鈺婂灠閻ｇ兘顢旈崼婵堫槰濡炪倕绻愰弻濠傤煥閸啿鎷虹紒缁㈠幖閹冲繘鎮甸鍡欑＜妞ゆ棁濮ょ亸顓㈡煟閿濆鏁辩紒铏规櫕缁瑩宕归鑲┿偖闂傚倷鑳剁划顖炲蓟閵娿儺鍤曢柛鎾茬筏閹峰嘲顫濋銈囩厯濠殿喖锕︾划顖炲箯閸涙潙宸濆┑鐘插�瑰▓姗�姊绘担鍛婂暈婵☆偅鍨垮浠嬪礋椤撶姷鐒块悗骞垮劚閹峰鎮￠妷鈺傜厱妞ゆ劧绲跨粻鎾绘煕閵堝棗鐏撮柡宀�鍠栧畷妤呮嚃閳哄倹顔冮梻浣告啞閺屻劎绮旇ぐ鎺戠畺闁炽儲鏋奸弸搴ㄦ煙閻愵剚缍戝ù鐙�鍨跺娲箹閻愭彃濮庡┑鐐茬湴閸婃鏁撻懞銉ュ毈闁告挾鍠栭妴渚�寮崼鐔告闂佽法鍣﹂幏锟�,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垹绠婚悗闈涙啞閸ｄ即姊虹拠鈥虫珝婵炰匠鍡欎航闂備胶鍘ч～鏇㈠磹濡ゅ懏鍎婇柛顐犲劜閳锋垿姊婚崼鐔烘创闁绘稒绮庣槐鎺楀箵閹烘垟鎸冨┑鐐村灥閻忔岸濡堕敐澶婄闁冲搫鍟獮鎰版⒒娴ｇ顥忛柛瀣浮瀹曟垿宕熼浣圭彿闂佸湱铏庨崰妤呮偂濞嗘劑浜滈柡鍥朵簼鐎氬湱绱撴担鍝勑ｉ柣妤冨Т椤曪絾绻濆顒�鑰垮┑掳鍊曢敃銈夊箖閹达附鈷戠紒顖涙礀婢ф煡鏌曢崶鈺佷槐鐎规洜濞�瀵粙顢橀悢鍙夊濠电偠鎻紞锟藉┑顔哄�楀☉鐢稿醇閺囩喓鍘遍梺鎸庣箓缁绘帡鎮鹃崹顐闁绘劘灏欑粻濠氭煛娴ｈ宕岄柡浣规崌閺佹捇鏁撻敓锟�?
			if (!teammembers.isEmpty())
				gnet.link.Onlines.getInstance().send(teammembers, send);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730914;

	public int getType() {
		return 730914;
	}

	public final static int TUIBIAN = 0;
	public final static int HUANSE = 1;
	public final static int OTHER = 2;

	public long roleid;
	public int shape;
	public int reason;
	public java.util.HashSet<Long> teammembers;

	public GRoleChangeShape() {
		teammembers = new java.util.HashSet<Long>();
	}

	public GRoleChangeShape(long _roleid_, int _shape_, int _reason_, java.util.HashSet<Long> _teammembers_) {
		this.roleid = _roleid_;
		this.shape = _shape_;
		this.reason = _reason_;
		this.teammembers = _teammembers_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(shape);
		_os_.marshal(reason);
		_os_.compact_uint32(teammembers.size());
		for (Long _v_ : teammembers) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		shape = _os_.unmarshal_int();
		reason = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			long _v_;
			_v_ = _os_.unmarshal_long();
			teammembers.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GRoleChangeShape) {
			GRoleChangeShape _o_ = (GRoleChangeShape)_o1_;
			if (roleid != _o_.roleid) return false;
			if (shape != _o_.shape) return false;
			if (reason != _o_.reason) return false;
			if (!teammembers.equals(_o_.teammembers)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += shape;
		_h_ += reason;
		_h_ += teammembers.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(shape).append(",");
		_sb_.append(reason).append(",");
		_sb_.append(teammembers).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

