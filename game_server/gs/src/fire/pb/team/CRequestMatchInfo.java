
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestMatchInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜堕弫鍥煏韫囨洖啸闁告繃顨婂缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閺囥垹绠ｆ繝銏＄箓缂嶅﹤鐣峰Δ鍛闁兼祴鏅濋埢蹇曠磽閸屾瑧绛忛柟鐑筋棑閿熺晫娅㈤幏鐑芥煥閻斿墎鐭欐鐐差樀楠炴牗鎷呴悷棰佺綍闂備礁澹婇崑鍛崲閸曨垱鍋￠柕濞炬櫆閻撶喖鏌曡箛濠冩珔闁诲繒濞�閺屾盯鎮㈢拠鎻掑Х閻熸粓顣︾欢姘潖濞差亜绠归柣鎰絻婵绱撴担钘夎敿濠殿喓鍊濆鏌ュ醇閺囩偟顔岄梺纭咁潐椤ㄥ懎锕㈤崡鐐╂闁汇垹鎲￠悡銉╂倵閿濆簼鎲惧ù纭锋嫹
 * @author changhao
 *
 */
public class CRequestMatchInfo extends __CRequestMatchInfo__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestmatchinfo = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				SRequestMatchInfo msg = new SRequestMatchInfo();
				
				xbean.ETeamMatch ematch = xtable.Targetid2teammatch.get(0);
				if (ematch == null)
				{
					msg.playermatchnum = 0;
					msg.teammatchnum = 0;
				}
				else
				{
					msg.teammatchnum = ematch.getTeammatchdatalist().size();
					msg.playermatchnum = ematch.getRolematchdatalist().size();
				}
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);
				
				return true;
			}
		};
		
		requestmatchinfo.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794512;

	public int getType() {
		return 794512;
	}


	public CRequestMatchInfo() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestMatchInfo) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestMatchInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

