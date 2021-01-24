
package fire.pb.team;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAcceptToTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闁规亽鍎辫ぐ鍫ュ礂閵夆晜袝
 * @author changhao
 *
 */
public class CAcceptToTeam extends __CAcceptToTeam__ {
	
	
	@Override
	protected void process() {
		// protocol handle
		TeamManager.logger.info("Enter: " + this.getClass());
		final long leaderRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		final long applierRoleId  = this.roleid;
		if (leaderRoleId < 0)
			return;
		if (applierRoleId != 0)
		{
			fire.pb.PropRole applierprop = new fire.pb.PropRole(applierRoleId, true);
			if(applierprop.getProperties().getCruise() > 0) {
				TeamManager.logger.info("CAcceptToTeam:闁汇垹鐤囬顒勫礂閵夆晜袝闁硷拷?" + applierRoleId + "闁革负鍔岀拹鏉裤�掗崫銉バ﹂柟锟�?,婵縿鍊栧鍌涚▔瀹ュ牆鍘撮柣銏犵枃椤曨剟宕楅妷鈺傂�");
				fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 162027, null);
				fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 162026, null);
				return;
			}
			
			fire.pb.PropRole leaderprop = new fire.pb.PropRole(roleid, true);
			if(leaderprop.getProperties().getCruise() > 0) {
				TeamManager.logger.info("CAcceptToTeam:闂傚啰鍠嶇槐鐐烘⒓閻斿吋姣�" + roleid + "闁汇垹鐤囬顒佺?" + applierRoleId + "闂傚啰鍠嶇槐鐐烘⒓閻斿吋姣愭慨婵撶到濠�顏勵啅閳╁啰鍩楅柣妯垮煐??,濞戞挸绉烽崗姗�鎮界�圭媭鍤為柛蹇嬪劦濡诧拷");
				fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 162026, null);
				fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 162027, null);
				return;
			}				
		}
		
		Long leaderclanfightid = xtable.Roleid2clanfightid.select(leaderRoleId);//濠碘�冲�归悘澶愭⒓閻斿墎绀婇柛锔哄妼閸欐洘瀵煎顓炵仜闁革箒妗ㄩ懙锟� by changhao
		if (leaderclanfightid != null)
		{
			Long applierclanfightid = xtable.Roleid2clanfightid.select(applierRoleId);//濠碘�冲�归悘澶愭偨鐎圭媭鍤為柤鏉挎噹濠�顏堝礂椤戣法绐楅柟瀛樏┃锟藉☉锟�? by changhao
			if (!leaderclanfightid.equals(applierclanfightid))
			{
 			    fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 410028,  null);
 			    return;
			}
			else
			{
				xbean.ClanInfo claninfo = fire.pb.clan.ClanUtils.getClanInfoById(roleid, true);
				if (claninfo == null)
				{
					return;
				}
				
				xbean.ClanMemberInfo memberinfo = claninfo.getMembers().get(applierRoleId);
				if (memberinfo == null)
				{
	 			    fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 410029,  null);
					return;
				}
			}
		}
		else
		{
			Long applierclanfightid = xtable.Roleid2clanfightid.select(applierRoleId);//闁汇垹鐤囬顒勬嚀閸涱厽韬柛蹇ｅ厸缁变即骞嬪Ο鐑樼皻濞戯拷? by changhao
			if (applierclanfightid != null)
			{
				if (!applierclanfightid.equals(leaderclanfightid))
				{
	 			    fire.pb.talk.MessageMgr.sendMsgNotify(applierclanfightid, 410030,  null);	
	 			    return;
				}				
			}
		}
		
		new PAcceptToTeam(leaderRoleId, applierRoleId, accept, true).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787235;

	public int getType() {
		return 787235;
	}

	public long roleid; // 申请组队者ID
	public int accept; // 0 表示拒绝，1表示接受（拒绝情况下，如果roleid为0，表示清空申请者列表）

	public CAcceptToTeam() {
	}

	public CAcceptToTeam(long _roleid_, int _accept_) {
		this.roleid = _roleid_;
		this.accept = _accept_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(accept);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		accept = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAcceptToTeam) {
			CAcceptToTeam _o_ = (CAcceptToTeam)_o1_;
			if (roleid != _o_.roleid) return false;
			if (accept != _o_.accept) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += accept;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(accept).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAcceptToTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = accept - _o_.accept;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

