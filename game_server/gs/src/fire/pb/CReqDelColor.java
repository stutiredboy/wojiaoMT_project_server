
package fire.pb;
import org.apache.log4j.Logger;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqDelColor__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqDelColor extends __CReqDelColor__ {
	public static final Logger logger = Logger.getLogger("SYSTEM");
	@Override
	protected void process() {
//		闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣虹帛閸旀洟顢氶鐘典笉濡わ絽鍟悡銉╂煟閺冨浂鍤欑悮姘辩磽娴ｈ櫣甯涢柣鈺婂灠閻ｇ兘濡搁埡濠冩櫍闂佺粯姊婚…鍫ユ⒒椤栫偞鈷掑ù锝囩摂閸ゅ啴鏌涢悩铏鐎规洩绻濋獮搴ㄦ寠婢跺锟筋剟姊洪崷顓烆暭婵犮垺锕㈤悰顕�濮�閿涘嫮顔曢梺绯曞墲椤ㄥ牏绮婚幍顔剧＜闁绘﹢娼ч弸娑欐叏婵犲偆鐓肩�规洘甯掗埢搴ㄥ箣濠靛棭鐎村┑鐘垫暩婵即宕瑰ú顏侊拷锕傚炊閳轰礁鐏婇梺鍝勫暙閻楀﹪鎮￠妷鈺傚�甸柨婵嗛婢ф壆鎲搁幍顔间壕缂佺粯绻堥幃浠嬫濞磋翰鍨虹换娑氫沪閸屾熬鎷烽弴锛勪罕婵犳鍠楅〃鎰板箯閻戣姤鐓欐い鏃傚帶濡插鏌嶇拠鍙夊攭缂佺姵鐩獮娆撳礃瑜忕粈澶愭⒒閸屾瑨鍏岄悘蹇嬪姂楠炲繘鎮滈懞銉у弳闂佺粯娲栭崐鍦拷姘炬嫹
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				xbean.Properties prop=xtable.Properties.get(roleid);
				if(prop==null){
					return false;
				}
				java.util.List<xbean.RoleColorType> list=prop.getColorroomlist();
				if(removeindex<0||removeindex>=list.size()){
					return false;
				}
				list.remove(removeindex);
				
//				SReqDelColor sReqDelColor=new SReqDelColor();
//				gnet.link.Onlines.getInstance().send(roleid, sReqDelColor);
				CReqColorRoomView.sendColorRoomInfo(roleid);
				logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕鍏肩節婵犲倹濯奸柛搴嫹 "+roleid+"闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣虹帛閸旀洟顢氶鐘典笉濡わ絽鍟悡銉╂煟閺冨浂鍤欑悮姘辩磽娴ｈ櫣甯涢柣鈺婂灠閻ｇ兘濡搁埡濠冩櫍闂佺粯姊婚…鍫ユ⒒椤栫偞鈷掑ù锝囩摂閸ゅ啴鏌涢悩铏鐎规洩绻濋獮搴ㄦ寠婢跺锟筋剟姊洪崷顓烆暭婵犮垺锕㈤悰顕�濮�閵堝洤褰勯梺鎼炲劘閸斿秹鍩涢幇鐗堢厸闁糕剝鍔曢敓鑺ョ箓椤繒绱掑Ο璇差�撻梺闈╁瘜閸樹粙鎳ｉ崶顒佲拺闁告稑锕ラ悡銉╂煟椤掞拷閵堟悂寮幘缁樺殟闁靛鍎卞В鍫ユ⒑閸涘﹦鎳冮柛鐔告尦閻涱噣宕橀鑺ユ珫闂佸憡娲濋崺鏍拷姘秺閺屻劌鈹戦崱娑憋拷妤呮煛鐎ｎ剙鏋涢柡灞剧洴婵″爼宕ㄩ婊冨П闂備礁鎼張顒傜矙閹达箑鐓濋幖娣�楅悿锟介梺鎸庣箓閺屽﹨顦规慨濠呮缁辨帒螣鐠囨煡鐎洪梻浣藉吹閸ｏ箓姊介崟顓犵煔閺夊牄鍔庣弧锟介梺鎼炲劘閸斿秴鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�? "+removeindex);
				return true;
			}
		}.submit();
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786536;

	public int getType() {
		return 786536;
	}

	public int removeindex; // 删除索引

	public CReqDelColor() {
	}

	public CReqDelColor(int _removeindex_) {
		this.removeindex = _removeindex_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(removeindex);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		removeindex = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqDelColor) {
			CReqDelColor _o_ = (CReqDelColor)_o1_;
			if (removeindex != _o_.removeindex) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += removeindex;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(removeindex).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqDelColor _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = removeindex - _o_.removeindex;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

