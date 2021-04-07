
package fire.pb.skill.liveskill;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestAttr__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜堕弫鍥煏韫囨洖啸闁告繃顨婂缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閺囥垹绠ｆ繝銏＄箓缂嶅﹤鐣峰Δ鍛闁兼祴鏅濋埢蹇涙⒒娴ｈ姤顥夐柛鐔跺嵆瀹曚即寮介鐐舵憰闂佺粯鏌ㄩ崥瀣倿娴犲鐓ラ柡鍐ㄦ处绾爼鏌℃担鍦⒌婵﹥妞藉畷顐﹀礋椤愵偂鎮ｉ梻浣侯焾閿曘倕顭囬敓鐘靛祦闁告劦鐓堝銊╂煥閻斿墎鐭欐鐐插暙閳诲酣骞橀幖顓燁棃婵犵數鍋為崹鍫曘�冮崱娑樼闁跨噦鎷�?? by changhao
 */
public class CRequestAttr extends __CRequestAttr__ {
	private static Logger logger = Logger.getLogger("ITEM");
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestattr = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				xbean.Properties prop = xtable.Properties.select(roleid);
				if (prop == null)
				{
					return false;
				}
				
				fire.pb.attr.SRefreshRoleData refreshdata = new fire.pb.attr.SRefreshRoleData();
				if (attrid.contains(fire.pb.attr.AttrType.ENERGY))
				{
					int energy = prop.getEnergy();
					refreshdata.datas.put( fire.pb.attr.AttrType.ENERGY, (float)energy);					
				}
				logger.error("------------濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏灪閸嬨倝鏌曟繛褍鍟悘濠囨椤愩垺澶勯柟鍛婃尦瀵顓兼径瀣弳濠电娀娼уΛ娆撍夐悙瀵哥闁告侗鍨伴埢鍫ユ煙椤旇偐绉烘鐐扮窔楠炴帡骞嬪┑鎰拷杈ㄧ節閻㈤潧浠滈柣顓炵墛缁傚秹顢旈崼婵婃憰闂佹寧绻傞ˇ顖滅不濞戙垺鐓犻柟闂寸劍濞懷勩亜韫囥儲瀚�??-闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟〃閻掑﹪鏌涘☉娆愮稇缂佺媭鍨堕弻銊╂偆閸屾稑顏�?------------------"+refreshdata.datas);
				mkdb.Procedure.psendWhileCommit(roleid, refreshdata);					
				
				return true;
			}
		};
		
		requestattr.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800530;

	public int getType() {
		return 800530;
	}

	public java.util.LinkedList<Integer> attrid;

	public CRequestAttr() {
		attrid = new java.util.LinkedList<Integer>();
	}

	public CRequestAttr(java.util.LinkedList<Integer> _attrid_) {
		this.attrid = _attrid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(attrid.size());
		for (Integer _v_ : attrid) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			int _v_;
			_v_ = _os_.unmarshal_int();
			attrid.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestAttr) {
			CRequestAttr _o_ = (CRequestAttr)_o1_;
			if (!attrid.equals(_o_.attrid)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += attrid.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(attrid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

