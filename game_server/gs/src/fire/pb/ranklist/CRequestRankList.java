
package fire.pb.ranklist;

import fire.pb.ranklist.proc.RankListManager;
import mkdb.Procedure;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestRankList__ extends mkio.Protocol { }

/** �ͻ����������ĳ�����а��б�
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRequestRankList extends __CRequestRankList__ {
	@Override
		
	protected void process() {
		// protocol handle
		final long srcRoleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (srcRoleid < 0)
			return;
		
 		SRequestRankList requestRankList = RankListManager.getInstance().getRankListResponse(ranktype, srcRoleid, page);
		gnet.link.Onlines.getInstance().send(srcRoleid, requestRankList);
		
		new Procedure() {
			@Override
			protected boolean process() throws Exception {
				fire.pb.course.CourseManager.achieveCourse(srcRoleid, fire.pb.course.CourseType.OPEN_PAIHANGBANG_COURSE, 1, 0);
				return true;
			}
			
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810233;

	public int getType() {
		return 810233;
	}

	public int ranktype; // ���а�����
	public int page; // ҳ��  ��0��ʼ

	public CRequestRankList() {
	}

	public CRequestRankList(int _ranktype_, int _page_) {
		this.ranktype = _ranktype_;
		this.page = _page_;
	}

	public final boolean _validator_() {
		if (ranktype < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(ranktype);
		_os_.marshal(page);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		ranktype = _os_.unmarshal_int();
		page = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestRankList) {
			CRequestRankList _o_ = (CRequestRankList)_o1_;
			if (ranktype != _o_.ranktype) return false;
			if (page != _o_.page) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += ranktype;
		_h_ += page;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(ranktype).append(",");
		_sb_.append(page).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestRankList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = ranktype - _o_.ranktype;
		if (0 != _c_) return _c_;
		_c_ = page - _o_.page;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

