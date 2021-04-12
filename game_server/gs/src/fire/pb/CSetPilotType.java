
package fire.pb;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSetPilotType__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSetPilotType extends __CSetPilotType__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid( this );
		if (roleId < 0)
			return ;
		new mkdb.Procedure()
		{
			protected boolean process() throws Exception {
				final xbean.Properties roleProp = xtable.Properties.get(roleId);
				if (null == roleProp)
					return false;
				roleProp.setPilot(pilottype);
				
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮村杈┬㈤梻浣规偠閸庢椽宕滈敃鍌氭瀬闁告劦鍠楅悡銉╂煛閸ユ湹绨奸悗姘秺濮婂搫效閸パ嶆嫹濡ゅ懎纾婚柟鎹愬煐瀹曞弶绻濋棃娑欏窛缂佲槄鎷烽梻浣侯焾閺堫剛鍒掑畝鍕╋拷鍌炴惞閸︻厾锛濇繛鎾磋壘閿曘儳锟芥俺顫夌换婵嬪閿濆棛銆愬銈嗗灥濡繂鐣烽敐鍫㈢杸闁哄倸澧界粻姘舵⒑闂堟稓澧曢柟宄邦儔瀹曟洟骞囬悧鍫濓拷鍨叏濡潡鍝洪柛銈忔嫹闂佸墽绮悧鐘诲蓟閿濆拋娼ㄩ柨鐔绘椤洩顦崇紒鍌涘笒椤劑宕熼鍡欑暰婵＄偑鍊栭崝褏寰婄捄銊т笉闁绘劗顣幏宄扳枔閸喗鐝梺绋款儏閿曨亪鎮伴鍢夌喓娑甸柨瀣伓闂傚倸鐗婄粙鎴λ夎箛鏃傜闁哄鍨甸顓㈡煛瀹�瀣ɑ闁诡垱妫冮、娑橆煥閸涘拑缍佸铏圭矙濞嗘儳鍓板┑鈽嗗亝缁诲倿鎮鹃悜钘夘潊闁靛牆鎳愰鎰箾鏉堝墽鍒伴柛妯荤矒楠炲繐煤椤忓應鎷洪梺鍛婄☉閿曪箓鍩ユ径鎰叆闁哄洦锚閿熻姤鐗犻獮鍫ュΩ椤垶鞋缂傚倷娴囨ご鍝ユ暜閿熺姴绠栭柍鍝勬噹缁�鍐煠绾板崬鍘哥紒杈ㄧ箞閺岋絾鎯旈妶搴㈢秷濠电偛寮堕…鍥箲閵忋倕纾奸柣鎴濇川缁嬪繐鈹戦悩缁樻锭婵炶濡囩槐鐐哄炊椤掍胶鍘撻梺鍛婄箓鐎氼剟寮搁敂鍓х＜閺夊牄鍔岀徊濠氭煃鐟欏嫬鐏撮柟顔界懅閿熻姤绋掗…鍥╃矙閸ヮ剚鈷戦柛娑橈龚婢规ɑ銇勯幋婵愭█妤犵偛鍟撮幃婊堟嚍閵夛附鐝曢梻浣筋潐閸庢娊骞婅箛鏇嫹濮樻剚娼愰柟渚垮妼铻ｉ柣鎾崇凹婢规洟鏌ｆ惔銏㈠暡闁瑰嚖鎷�
				fire.log.YYLogger.usrFlgLog(roleId, "E1 : " + pilottype);
				
				return true;
			};
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786543;

	public int getType() {
		return 786543;
	}

	public int pilottype; // 适配引导类型  0新手 1老手

	public CSetPilotType() {
	}

	public CSetPilotType(int _pilottype_) {
		this.pilottype = _pilottype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(pilottype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		pilottype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSetPilotType) {
			CSetPilotType _o_ = (CSetPilotType)_o1_;
			if (pilottype != _o_.pilottype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += pilottype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(pilottype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSetPilotType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = pilottype - _o_.pilottype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

