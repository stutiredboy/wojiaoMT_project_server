
package fire.pb.school.change;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __COldSchoolList__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class COldSchoolList extends __COldSchoolList__ {
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;

		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁�濠囨煥閻旂粯顥夐柍瑙勫灴椤㈡瑩宕崟鑸靛婵°倕鍟崹婵嗏攽閻樺弶绁╅柡浣割儔閺屻劑鎮㈤崜浣虹厯閻庢鍠栭…閿嬩繆閼搁潧绶炲┑鐘插閺�銊╂⒒娴ｈ櫣甯涢柛鏃�娲栬灒濠电姴鍊甸弸鏃�銇勯幘璺烘灁缂佺娀绠栭弻銊モ攽閸℃ê娅ら梺鐟板悑閸旀瑩寮婚妸鈺佸嵆闁靛鍊濋崑妤呮⒑缂佹ü绶遍柛锝忕秮瀵偊骞樼紒妯绘闂佽法鍣﹂幏锟�?
				SOldSchoolList send = new SOldSchoolList();
				xbean.ChangeSchoolInfo info = xtable.Changeschool.select(roleId);
				if (info != null) {
					for (xbean.ChangeSchoolRecord record : info.getRecords()) {
						send.oldshapelist.add(record.getShape());
						send.oldschoollist.add(record.getSchool());
					}
				}
				mkdb.Procedure.psendWhileCommit(roleId, send);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810483;

	public int getType() {
		return 810483;
	}


	public COldSchoolList() {
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
		if (_o1_ instanceof COldSchoolList) {
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

	public int compareTo(COldSchoolList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

