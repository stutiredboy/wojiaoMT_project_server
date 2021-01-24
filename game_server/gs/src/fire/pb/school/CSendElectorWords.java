
package fire.pb.school;

import fire.pb.school.shouxi.ProfessionLeaderManager;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSendElectorWords__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闁告瑦鍨�?娴ｈ櫣褰介梺顐㈩槸椤撹櫣鎳�? by changhao
 *
 */
public class CSendElectorWords extends __CSendElectorWords__ {
	@Override
	protected void process()
	{
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		fire.pb.PropRole propRole=new fire.pb.PropRole(roleid,true);
		final int school=propRole.getSchool();
		xbean.ProfessionLeaderVoteInfo voteInfo=xtable.Professionleadervotechallenge.select(roleid);
		
		boolean b = false;
		
		if (voteInfo != null)
		{
			b = ProfessionLeaderManager.getInstance().isInChallengePeriod(voteInfo.getChallengetime());
		}
		
		xbean.ProfessionLeaderInfo shouxiInfo=xtable.Professionleader.select(school);
		if(shouxiInfo != null && shouxiInfo.getRoleid() == roleid)
		{
			b = true;
		}		
		
		//閺夆晜蓱閻ュ懘骞愰幋鐐茬仜闁瑰瓨鍔曟慨锟�  by changhao
		if(b == false)
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 170009, null);	
			return ;
		}
		
		//濠碘�冲�归悘澶婎啅閹绘帒妫橀柛鏃傚Х閻濈敻鏌呮径鎰簼濞戞柨鐗呴幈銊╁绩閸︻厾褰介梺顐㈩槼閻︼拷 by changhao
		boolean modify = false;
        xbean.ProfessionLeaderTicketInfo candInfo=fire.pb.school.shouxi.ProfessionLeaderManager.getInstance().getCandInfoFromRoleid(roleid, school);
        if(candInfo!=null)
        {
        	modify = true;
        }
        
        if (modify == false)
        {
    		if (!ProfessionLeaderManager.getInstance().isInChallengePeriod(System.currentTimeMillis()))
    		{//闁硅埖娲滈妶銊ф崉閻旇櫣褰介梺顐㈩槹濡炲倹绋�?濞戞搩浜濆鍌炴⒒鐎涙﹩鍞�
    			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 141983, null);
    			return;
    		}        	
        }
        
        if (electorwords.length()>25)
        {
			return;
		}
        
		new fire.pb.school.shouxi.PSendElectorWords(roleid,electorwords, modify).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810435;

	public int getType() {
		return 810435;
	}

	public java.lang.String electorwords;

	public CSendElectorWords() {
		electorwords = "";
	}

	public CSendElectorWords(java.lang.String _electorwords_) {
		this.electorwords = _electorwords_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(electorwords, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		electorwords = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSendElectorWords) {
			CSendElectorWords _o_ = (CSendElectorWords)_o1_;
			if (!electorwords.equals(_o_.electorwords)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += electorwords.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(electorwords.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

