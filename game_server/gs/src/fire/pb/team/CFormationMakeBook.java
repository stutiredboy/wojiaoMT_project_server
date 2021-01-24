
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CFormationMakeBook__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闁告帗婀圭紞鏃堝礂婢跺苯绠氬☉锟�?
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
					TeamManager.logger.debug("CFormationMakeBook:濞戞挸绉堕悡锟犳焼閹捐埖鐣遍柛蹇擃槺楠炲棙绋�? "+roleid);
					return true;
				}
				
				if (config.getItemtypeid() == TeamManager.ITEMTYPE_FORMBOOK_ID)
				{
					psend(roleid, new STeamError(TeamError.UnKnuownFormBook));
					TeamManager.logger.debug("CFormationMakeBook:濞戞挸绉堕悡锟犳焼閹捐埖鐣遍柛蹇擃槺楠炲棙绋�? "+roleid);
					return true;					
				}
					
				fire.pb.common.SCommon itemidconfig = ConfigManager.getInstance().getConf(fire.pb.common.SCommon.class).get(TeamManager.FORMBOOKHALF_COMMON_ID);
				
				String str = itemidconfig.getValue(); //鐎电増顨呴崺灞解枔鐎ｎ亜绁归柣銊ュ娴滈箖宕楃粚鎶� by changhao
				int itemid = Integer.parseInt(str);
				
				Bag bag = new Bag(roleid, false);
				
				int number = bag.removeItemById(itemid, TeamManager.FORMBOOKHALF_COMBINE_NUM, fire.log.YYLogger.COUNTER_TYPE, 0, TeamManager.MAKE_FORMBOOK);
				if(number != TeamManager.FORMBOOKHALF_COMBINE_NUM){
					
					psend(roleid, new STeamError(TeamError.FormBookHalfNotEnough));
					TeamManager.logger.debug("CFormationMakeBook:闁稿繐顦遍獮鍡樼▕閿旂晫鏆欓柛妤勬腹缁楀鎼�? "+roleid);		
					return false;
				}				
				
				int added = BagUtil.addBindItem(roleid, bookid, 1, TeamManager.MAKE_FORMBOOK, fire.log.YYLogger.COUNTER_TYPE, 1, true);
				
				if (1 != added)
				{
					psend(roleid, new STeamError(TeamError.UnkownError));
					TeamManager.logger.debug("CFormationMakeBook:闁稿繐顦遍獮鍡樼▕閿曪拷閸ㄥ崬顕欓崫鍕╀杭閻狅拷? "+roleid);	
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

