
package fire.pb.team.teammelon;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CTeamRollMelon__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CTeamRollMelon extends __CTeamRollMelon__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure teamrollmelon = new mkdb.Procedure() 
		{
			@Override
			/*闁告梻濞�閺�锝嗐亜閸濆嫮纰峵eam by changhao*/
			protected boolean process()
			{	
				xbean.Properties roleprop = xtable.Properties.select(roleid);
				
				Long battlemelonid = xtable.Roleid2battlemelonid.select(roleid);
				if (battlemelonid == null)
				{
					psend(roleid, new fire.pb.team.STeamError(fire.pb.team.TeamError.SelfNotInTeam));
					fire.pb.team.TeamManager.logger.debug("CTeamRollMelon: "+roleid);
					return true;					
				}
				
				xbean.ETeamMelon eteammelon = xtable.Battlemelonid2melon.get(battlemelonid);
				if (eteammelon == null)
				{
					psend(roleid, new fire.pb.team.STeamError(fire.pb.team.TeamError.SelfNotInTeam));
					fire.pb.team.TeamManager.logger.debug("CTeamRollMelon:婵炲备鍓濆﹢浣圭附閺嵮冃￠柛娆樺灠閸ㄥ酣鏌�?"+roleid);
					return true;					
				}
				
				xbean.TeamMelon teammelon = eteammelon.getMelonid2melons().get(melonid);
				if (teammelon == null)
				{
					psend(roleid, new fire.pb.team.STeamError(fire.pb.team.TeamError.SelfNotInTeam));
					fire.pb.team.TeamManager.logger.debug("CTeamRollMelon:婵炲备鍓濆﹢浣圭附閺嵮冃￠柛娆樺灠閸ㄥ酣鏌�?"+roleid);
					return true;					
				}
				
				//婵縿鍊撳Ч澶娾柦閳╁啯绠掗悹褍瀚悧绐籓LL闁伙拷? by changhao
				Integer rollpoint = teammelon.getMelonroleids().get(roleid);
				if (rollpoint == null)
				{
					psend(roleid, new fire.pb.team.STeamError(fire.pb.team.TeamError.SelfNotInTeam));
					fire.pb.team.TeamManager.logger.debug("CTeamRollMelon:婵炲备鍓濆﹢浣圭附閺嵮冃￠柛娆樺灠閸ㄥ酣鏌�?"+roleid);
					return true;	
				}
				
				Integer alreadroll = teammelon.getOpmelonroleids().get(roleid);
				if (alreadroll != null)
				{
					fire.pb.team.TeamManager.logger.debug("CTeamRollMelon:鐎规瓕灏欑划顡極LL閺夆晛娲ｇ花锟�"+roleid);
					return true;
				}
				
				if (status == 0) //闁哄本鍔掑Ч澶嬩繆閸屾稓浜柡锟介幆褏纾惧ù锟�? by changhao
				{					
					teammelon.getMelonroleids().put(roleid, 0);
				}
				
				int num = teammelon.getOpnum();
				num ++;
				teammelon.setOpnum(num);
				
				teammelon.getOpmelonroleids().put(roleid, teammelon.getMelonroleids().get(roleid));
				
				fire.pb.team.teammelon.SOneTeamRollMelonInfo msg = new fire.pb.team.teammelon.SOneTeamRollMelonInfo();
				msg.itemid = teammelon.getItemid();
				msg.melonid = melonid;
				msg.rollinfo.roleid = roleid;
				msg.rollinfo.rolename = roleprop.getRolename();
				msg.rollinfo.roll = teammelon.getMelonroleids().get(roleid);
				
				for (Long e : eteammelon.getMelonerlist()) //闁告瑦鍨圭划浼村箥?闁哄牆顦靛Σ锕傚川濡粯浠樼紓浣哥墢濞堟垶娼诲▎搴ㄥ殝濞存粎鐧侽LL闁绘劘顫夐崕蹇涘礃? by changhao
				{
					//TeamManager.logger.info("roll闁伙拷?:闁告瑦鍨�?娴ｈ櫣鑸秗oleid:" + e + "闁绘劘顫夐弳锟�:" + msg.rollinfo.roll);
					mkdb.Procedure.psendWhileCommit(e, msg);			
				}
				
				for (Long e : eteammelon.getWatchmelonerlist()) //闁告瑦鍨圭划鎵喆閸屾粍绠� ROLL闁绘劕婀卞▓鎴炵? by changhao
				{
					if (e != null)
						mkdb.Procedure.psendWhileCommit(e, msg);			
				}
				
				if (num >= teammelon.getMelonroleids().size())
				{
					new PTeamRollMelonInfo(battlemelonid, 0).call();
				}
				
				return true;
			}
			
		};
		teamrollmelon.submit();
	}
	
	/*
	 * 
	 * 闁猴拷?缂備礁鐗嗛崰鍛拷瑙勪亢閻ㄦ繈鎯冮崟顓炰化闁猴拷?濠拷? by changhao
	 */
	public long calcMaxRollPoint(java.util.ArrayList<Long> roleids, xbean.TeamMelon teammelon)
	{
		int max = 0;
		long maxroleid = 0;
		for (Long roleid : roleids)
		{
			Integer rollpoint = teammelon.getMelonroleids().get(roleid);
			if (rollpoint >= max)
			{
				max = rollpoint;
				maxroleid = roleid;
			}
		}
		
		return maxroleid;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794523;

	public int getType() {
		return 794523;
	}

	public long melonid; // 分赃id by changhao
	public int status; // 1是ROLL 0是放弃 by changhao

	public CTeamRollMelon() {
	}

	public CTeamRollMelon(long _melonid_, int _status_) {
		this.melonid = _melonid_;
		this.status = _status_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(melonid);
		_os_.marshal(status);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		melonid = _os_.unmarshal_long();
		status = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CTeamRollMelon) {
			CTeamRollMelon _o_ = (CTeamRollMelon)_o1_;
			if (melonid != _o_.melonid) return false;
			if (status != _o_.status) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)melonid;
		_h_ += status;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(melonid).append(",");
		_sb_.append(status).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CTeamRollMelon _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(melonid - _o_.melonid);
		if (0 != _c_) return _c_;
		_c_ = status - _o_.status;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

