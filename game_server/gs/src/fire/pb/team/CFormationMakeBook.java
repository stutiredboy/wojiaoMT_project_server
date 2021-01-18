
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CFormationMakeBook__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 閸掓湹缍旈崗澶屽箚娑�?
 * @author changhao
 *
 */
public class CFormationMakeBook extends __CFormationMakeBook__ {
	@Override
	protected void process() {
		// protocol handle
		
		//final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		
		mkdb.Procedure formationmakebook = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				/*
				fire.pb.item.GroceryItemAttr config = ConfigManager.getInstance().getConf(fire.pb.item.GroceryItemAttr.class).get(bookid);
				if (config == null)
				{
					psend(roleid, new STeamError(TeamError.UnKnuownFormBook));
					TeamManager.logger.debug("CFormationMakeBook:娑撳秶鐓￠柆鎾舵畱閸忓骞嗘稊? "+roleid);
					return true;
				}
				
				if (config.getItemtypeid() == TeamManager.ITEMTYPE_FORMBOOK_ID)
				{
					psend(roleid, new STeamError(TeamError.UnKnuownFormBook));
					TeamManager.logger.debug("CFormationMakeBook:娑撳秶鐓￠柆鎾舵畱閸忓骞嗘稊? "+roleid);
					return true;					
				}
					
				fire.pb.common.SCommon itemidconfig = ConfigManager.getInstance().getConf(fire.pb.common.SCommon.class).get(TeamManager.FORMBOOKHALF_COMMON_ID);
				
				String str = itemidconfig.getValue(); //瀵版鍩屽▓瀣祹閻ㄥ嫰浜鹃崗绌抎 by changhao
				int itemid = Integer.parseInt(str);
				
				Bag bag = new Bag(roleid, false);
				
				int number = bag.removeItemById(itemid, TeamManager.FORMBOOKHALF_COMBINE_NUM, fire.log.YYLogger.COUNTER_TYPE, 0, TeamManager.MAKE_FORMBOOK);
				if(number != TeamManager.FORMBOOKHALF_COMBINE_NUM){
					
					psend(roleid, new STeamError(TeamError.FormBookHalfNotEnough));
					TeamManager.logger.debug("CFormationMakeBook:閸忓骞嗘稊锔界暙閸楄渹绗夌搾? "+roleid);		
					return false;
				}				
				
				int added = BagUtil.addBindItem(roleid, bookid, 1, TeamManager.MAKE_FORMBOOK, fire.log.YYLogger.COUNTER_TYPE, 1, true);
				
				if (1 != added)
				{
					psend(roleid, new STeamError(TeamError.UnkownError));
					TeamManager.logger.debug("CFormationMakeBook:閸忓骞嗘稊锕�鍨卞鍝勩亼鐠�? "+roleid);	
					return false;						
				}				
				*/
				return true;
			}
		};
		
		formationmakebook.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794552;

	public int getType() {
		return 794552;
	}


	public CFormationMakeBook() {
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
		if (_o1_ instanceof CFormationMakeBook) {
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

	public int compareTo(CFormationMakeBook _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

