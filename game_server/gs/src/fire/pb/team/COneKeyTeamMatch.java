
package fire.pb.team;
import java.util.Arrays;

import fire.pb.fushi.DayPayManager;
import fire.pb.main.ConfigManager;
import fire.pb.talk.ChatChannel;
import fire.pb.talk.ChatMsgId;
import fire.pb.talk.LastChatTime;
import fire.pb.talk.MessageMgr;
import fire.pb.util.FireProp;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __COneKeyTeamMatch__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 濞戯拷?闂佹鍠栭弸鍫㈡嫚?
 * @author by changhao
 *
 */
public class COneKeyTeamMatch extends __COneKeyTeamMatch__ {
	@Override
	protected void process() {
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		/*闁告梻濞�閺�锝嗐亜閸濆嫮纰� team->roleid->match by changhao*/
		mkdb.Procedure onekeyteammatch = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				
				fire.pb.team.SOneKeyTeamMatch msg = new fire.pb.team.SOneKeyTeamMatch();
				if (channeltype != fire.pb.talk.ChannelType.CHANNEL_TEAM_APPLY &&
					channeltype != fire.pb.talk.ChannelType.CHANNEL_WORLD &&
					channeltype != fire.pb.talk.ChannelType.CHANNEL_CURRENT &&
					channeltype != fire.pb.talk.ChannelType.CHANNEL_CLAN)
				{
					msg.ret = 1;
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					return false;
				}
				
				//濠碘�冲�归悘澶愬及椤栨艾褰嗗ù鍏艰壘瑜板倿鏌呮笟濠勭闁活亜顑囧﹢鍛村及椤栨碍鍎婇柡鍫濐槸閸欐洘瀵�? by changhao
				if (channeltype == fire.pb.talk.ChannelType.CHANNEL_CLAN)
				{
					xbean.Properties prop = xtable.Properties.select(roleid);
					if (prop != null)
					{
						if (prop.getClankey() <= 0)
						{
							MessageMgr.sendMsgNotify(roleid, 141053, null);	
							
							msg.ret = 1;
							mkdb.Procedure.psendWhileCommit(roleid, msg);
							return false;
						}
					}
				}
				
				Long teamid = xtable.Roleid2teamid.select(roleid);
				if (teamid == null)
				{
					psend(roleid, new STeamError(TeamError.SelfNOtLeader));
					TeamManager.logger.error("COneKeyTeamMatch:闁煎浜滅换浣圭▔瀹ュ棙笑闂傚啰鍠栭弳锟� "+roleid);
					
					msg.ret = 1;
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					return true;					
				}
				
				Team team = null;
				team = TeamManager.getTeamByTeamID(teamid);	//闁哄牆顦靛Σ锕傚礂閸喎惟闂傚啰鍠嶇槐鐐烘煥娴ｉ绉� by changhao	
				if (!team.isTeamLeader(roleid))
				{
					psend(roleid, new STeamError(TeamError.SelfNOtLeader));
					TeamManager.logger.error("COneKeyTeamMatch:闁煎浜滅换浣圭▔瀹ュ棙笑闂傚啰鍠栭弳锟� "+roleid);
					
					msg.ret = 1;
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					return true;						
				}
				
				teamid = xtable.Roleid2teamid.get(roleid);		
				if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闁绘劗鎳撳畷閬嶅嫉瀹ュ懎顫ら柛锟�? by changhao
				{
					DSTeamMatchInfo config = ConfigManager.getInstance().getConf(DSTeamMatchInfo.class).get(team.getTeamInfo().getTargetid());
					if (config == null)
					{
						psend(roleid, new STeamError(TeamError.NoTarget));
						TeamManager.logger.error("COneKeyTeamMatch:闁烩晩鍠楅悥顤廌闂佹寧鐟ㄩ锟� "+roleid);
						
						msg.ret = 1;
						mkdb.Procedure.psendWhileCommit(roleid, msg);
						return true;					
					}					
				}
				else
				{
					STeamMatchInfo config = ConfigManager.getInstance().getConf(STeamMatchInfo.class).get(team.getTeamInfo().getTargetid());
					if (config == null)
					{
						psend(roleid, new STeamError(TeamError.NoTarget));
						TeamManager.logger.error("COneKeyTeamMatch:闁烩晩鍠楅悥顤廌闂佹寧鐟ㄩ锟� "+roleid);
						
						msg.ret = 1;
						mkdb.Procedure.psendWhileCommit(roleid, msg);
						return true;					
					}						
				}
				
				long systemTime = System.currentTimeMillis();
				
				final long now = System.currentTimeMillis();
				final long delaytime = ChatChannel.getInstance().getWorldChatDelayTime();
				final LastChatTime rctime = new LastChatTime(roleid, false);
				if (channeltype == fire.pb.talk.ChannelType.CHANNEL_WORLD && rctime.getLastWorldChatTime() + delaytime > now) {
					java.util.ArrayList<String> args = new java.util.ArrayList<String>();
					args.add("" + (rctime.getLastWorldChatTime() + delaytime - now) / 1000);
					MessageMgr.sendMsgNotify(roleid, ChatMsgId.CHAT_WORLD_CHANNEL_TIME_LIMIT, args);
					
					msg.ret = 1;
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					return true;
				}
				
				long delta = systemTime - team.getTeamInfo().getOnekeytimestamp() - TeamManager.ONE_KEY_APPLY_TEAM;
				if (delta < 0)
				{
					String s = String.format("%d", (int)-delta / 1000);
					MessageMgr.sendMsgNotify(roleid, 150028, Arrays.asList(s));
					TeamManager.logger.info("COneKeyTeamMatch:濞戯拷?闂佹鍠栭弸鍫㈡嫚濠靛洦顦ч梻鍌涙尦濡潡姊�?60缂佸甯�?? "+roleid);
					
					msg.ret = 1;
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					return true;						
				}
				
				team.getTeamInfo().setOnekeytimestamp(systemTime);
				
				/*
				fire.pb.message.SStringRes msg1 = ConfigManager.getInstance().getConf(fire.pb.message.SStringRes.class).get(285);
				if (msg1 == null)
				{
					TeamManager.logger.error("COneKeyTeamMatch:闁归潧褰炵粭澶愬礆閺夎法鎽熺紒妤嬬細鐟曪拷 "+roleid);
					return false;						
				}
				*/
				
				fire.pb.message.SStringRes msg2 = ConfigManager.getInstance().getConf(fire.pb.message.SStringRes.class).get(286);
				if (msg2 == null)
				{
					TeamManager.logger.error("COneKeyTeamMatch:闁归潧褰炵粭澶愬礆閺夎法鎽熺紒妤嬬細鐟曪拷 "+roleid);
					
					msg.ret = 1;
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					return false;						
				}				
				
				//String msgstring1 = msg1.msg;
				String msgstring2 = msg2.msg;

				/*
				msgstring1 = msgstring1.replaceAll("\\$parameter1\\$", config.Target);
				msgstring1 = msgstring1.replaceAll("\\$parameter2\\$", Integer.toString(team.getTeamInfo().getMinlevel()));
				msgstring1 = msgstring1.replaceAll("\\$parameter3\\$", Integer.toString(team.getTeamInfo().getMaxlevel()));
				msgstring1 = msgstring1.replaceAll("\\$parameter4\\$", Long.toString(roleid));
				*/
				
				final java.util.ArrayList<fire.pb.talk.DisplayInfo> showinfos  = new java.util.ArrayList<fire.pb.talk.DisplayInfo>();
				
				boolean ret = ChatChannel.getInstance().process(roleid, channeltype, text, msgstring2, showinfos, 1);
				
				if (ret == true)
				{					
					MessageMgr.sendMsgNotify(roleid, 162025, null);					
				}
				else
				{
					msg.ret = 1;
				}
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);
								
				return ret;
			}
			
		};
		onekeyteammatch.submit();	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794498;

	public int getType() {
		return 794498;
	}

	public int channeltype; // 频道类型 14组队申请 1当前频道 4帮派 5世界频道 by changhao
	public java.lang.String text; // 发送的文本 by changhao

	public COneKeyTeamMatch() {
		text = "";
	}

	public COneKeyTeamMatch(int _channeltype_, java.lang.String _text_) {
		this.channeltype = _channeltype_;
		this.text = _text_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(channeltype);
		_os_.marshal(text, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		channeltype = _os_.unmarshal_int();
		text = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof COneKeyTeamMatch) {
			COneKeyTeamMatch _o_ = (COneKeyTeamMatch)_o1_;
			if (channeltype != _o_.channeltype) return false;
			if (!text.equals(_o_.text)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += channeltype;
		_h_ += text.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(channeltype).append(",");
		_sb_.append("T").append(text.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

