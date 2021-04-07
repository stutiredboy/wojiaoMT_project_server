
package fire.pb;

import fire.pb.util.CGPlayUtil;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CEndPlayCG__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CEndPlayCG extends __CEndPlayCG__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid <= 0)
			return;
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐椤愵剚瀚归柨鏇炲�搁悙濠囨煃鏉炴壆顦﹂柣蹇擄工椤啴濡堕崱娆忣潷缂備緡鍠栫粔鐟邦嚕閸愬樊鐓ラ柛顐ゅ枔閸欏棝姊虹紒妯荤叆濠⒀冮叄閹苯鈻庨幘瀵稿幐閻庣櫢鎷烽悗锝庡墮閸╁矂姊哄畷鍥ㄥ殌闁哥喐鎸抽獮鍐ㄢ枎閹垮啯鏅㈡繛杈剧到閹碱偆寰婇挊澶嗘斀闁挎稑瀚禍濂告煕婵犲啰澧电�殿喖顭锋俊姝岊槾闁活厽鎸鹃幉鎼佹偋閸繄鐟查梺绋款儏閸婂綊濡甸崟顖氱闁瑰瓨绻嶆导宀勬⒑鏉炴壆顦﹂柛鐔告尦瀵濡搁妷銏☆潔濠碘槅鍨拃锔藉閿熶粙姊绘担鐑樺殌婵☆垰锕ョ粋宥夘敂閸曞灚缍庨梺鍛婄箓鐎氬懓顦圭�规洘鍎奸ˇ鍙夈亜椤掞拷閻楁捇寮婚敐鍡樺劅闁靛繒濮村В鍫ユ⒑閸涘﹦鎳冮柛鐔告尦閹即顢氶敓浠嬬嵁閸ヮ剚鍋嬮柛顐犲灩婵悂鏌ｆ惔锛勭暛闁稿酣浜堕獮濠囧箛閺夊じ绱跺┑掳鍊曢幊蹇涘煕閹达附鍋ｉ柛銉秶閹峰嘲鐣烽崶閿嬪濠电姵纰嶉悡鏇㈡煙闁箑澧柡鍡欏仦閵囧嫰濡搁妷顖濆惈閻庢鍠栭…鐑藉极閹邦厼绶炲┑鐘插缂嶅倿姊绘笟锟藉褏鎹㈤幒鎾村弿闁绘垼妫勭痪褏绱掗妸銉р攺f
		new mkdb.Procedure(){

			@Override
			protected boolean process() throws Exception {
				
				fire.pb.buff.BuffAgent agent = new fire.pb.buff.BuffRoleImpl(roleid,false);
				agent.removeCBuffWithSP(CGPlayUtil.cgBuffID);
				/*fire.pb.map.Role role = RoleManager.getInstance().getRoleByID(roleid);
				if(id >= 11001 && id <= 11009)
				{
					Transfer.justGotoWhileCommit(roleid, role.getScene(), role.getPos().toGridPos().getX(), role.getPos().toGridPos().getY(), SRoleEnterScene.QUEST);
				}*/
				//GsClient.sendToScene(new GSetPlayCGState(roleid,(byte)0));
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786456;

	public int getType() {
		return 786456;
	}

	public int id; // 动画的id

	public CEndPlayCG() {
	}

	public CEndPlayCG(int _id_) {
		this.id = _id_;
	}

	public final boolean _validator_() {
		if (id <= 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CEndPlayCG) {
			CEndPlayCG _o_ = (CEndPlayCG)_o1_;
			if (id != _o_.id) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += id;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CEndPlayCG _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = id - _o_.id;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

