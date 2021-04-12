
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestHaveTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞稿墲瀵板嫮锟斤綆浜濋鍛攽閻愬弶鈻曞ù婊勭矒閿濈偤宕ㄧ�涙鍘梺鍓插亝缁诲啴宕宠ぐ鎺撶厽閹兼惌鍠栧顔芥叏婵犲啯銇濋柟宕囧仱婵＄兘宕橀崣銉╁仐闂佽桨绀佺粔闈涱嚗閸曨剛绠鹃柣鎰靛墻濞兼棃姊绘笟锟藉褏鎹㈤幒鎾剁闁跨喍绮欓弻娑㈡倷閼碱剙鐓熷┑顔硷攻濡炶棄鐣烽锕�绀嬫い鎺炴嫹缂佹劖鐩铏圭矙濞嗘儳鍓辩紓浣割儐閸ㄥ潡銆佸鑸垫櫜闁告侗鍨卞▓婵嬫⒒娓氬洤寮块梻鍕閿熶粙娼ч惌鍌氼潖濞差亝顥堟繛鎴炶壘椤ｅ搫鈹戦埥鍡椾簼缂佸甯″鏌ュ醇閺囥劍鏅㈤梺绋挎湰缁秹鏁嶈箛娑欌拺闁告繂瀚峰Σ鍏肩箾婢跺绀冮柡鍛劦閺岋絾鎯旈妶搴㈢秷濠电偛寮堕敋閻撱倖淇婇姘倯鐎规洖寮剁换婵嬫濞戝崬鍓伴梺缁樺姇閿曨亪寮婚弴鐔虹鐟滃秹宕銈囦笉濞寸厧鐡ㄩ埛鎺楁煕鐏炲墽鎳呮い锔肩畱椤潡鎮风敮顔垮惈閻庤娲橀崹鍨暦閵娾晩鏁嶆繛鎴灻花銉╂煟鎼达紕鐣柛搴ㄤ憾楠炲顫滈敓浠嬪箖閵忋倕绀傞柛蹇撳悑椤忕喖姊绘担钘壭撻柨姘亜閿旇浜扮�殿喓鍔嶇粋鎺旓拷锝庡亐閹稿啴姊洪幖鐐插姶闁告搫绠撳顐わ拷锝庡亞缁★拷婵犵數濮撮崐缁樻櫠閺囩姷纾奸柣娆欐嫹闁搞劌鐖煎濠氬Ω閳哄倸浜為梺绋挎湰缁嬫垿顢旈敓锟�
 * @author changhao
 *
 */
public class CRequestHaveTeam extends __CRequestHaveTeam__ {
	@Override
	protected void process() {
		// protocol handle
		
		Long teamid = xtable.Roleid2teamid.select(roleid);
		
		SRequestHaveTeam msg = new SRequestHaveTeam();
		msg.ret = 0;
		if (teamid != null)
		{
			msg.ret = 1;
		}
		
		final long r = gnet.link.Onlines.getInstance().findRoleid(this);
		if (r < 0)
			return;
		
		gnet.link.Onlines.getInstance().send(r, msg);			
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794515;

	public int getType() {
		return 794515;
	}

	public long roleid; // 某个人是否有队 by changhao

	public CRequestHaveTeam() {
	}

	public CRequestHaveTeam(long _roleid_) {
		this.roleid = _roleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestHaveTeam) {
			CRequestHaveTeam _o_ = (CRequestHaveTeam)_o1_;
			if (roleid != _o_.roleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestHaveTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

