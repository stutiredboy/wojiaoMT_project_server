
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
 * 濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閺勩儱鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐蹭簽闁轰礁瀚换娑㈠幢濡纰嶇紓浣瑰姈椤ㄥ﹪寮婚垾鎰佸悑閹肩补锟藉磭顔愰梻浣告啞閸ㄨ绻涢敓浠嬫煛鐏炲墽娲存い銏℃礋閹晠鎳犻璺ㄦ／闂備浇顕х�涒晠鎮㈤鍕闁跨噦鎷�?
 * @author by changhao
 *
 */
public class COneKeyTeamMatch extends __COneKeyTeamMatch__ {
	@Override
	protected void process() {
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		/*闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸崹楣冨箛娴ｅ湱绋佺紓鍌氬�烽悞锕傗�﹂崶鈺冧笉濡わ絽鍟悡銉╂煟閺傚灝顣抽柣顓熺懇閺屸�崇暆鐎ｎ剛鐦堥梺杞扮劍閹歌崵绮嬮幒鏃撴嫹閿濆骸浜濇繛鍛矒濮婅櫣鍖栭弴鐐测拤闂佸憡姊圭敮鐐烘嚍鏉堛劎绡�婵﹩鍘搁幏娲⒑閸涘﹦鈽夐柨鏇缁骞樼紒妯猴拷鍨叏濡厧甯堕柡瀣ㄥ�濋弻娑㈡偐鐠囇嗗惈闂佽桨鐒﹂幑鍥极閹剧粯鏅搁柨鐕傛嫹 team->roleid->match by changhao*/
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
				
				//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告噧妞ゆ洩绲介悾锟犳焽閿旇棄鐦滈梻渚�娼ч悧鍡椢涘☉娆愭珷妞ゆ帒瀚悡鐘绘偡濞嗗繐顏╃紒锟介崘顔界厪闁搞儯鍔屾慨宥囷拷瑙勬礀瀹曨剟鈥旈崘顔煎嵆闁绘劗鏁告闁诲氦顫夊ú姗�銆冩繝鍥х疇婵犻潧顑呯痪褎绻涢崱娆忎壕妞ゃ儯鍊濆娲嚒閵堝懏鐎剧紓渚囧枛缁夋挳鈥﹂崹顕呮建闁跨喕妫勯悾鐑藉箛閺夊潡鏁滃┑掳鍊ч幏鐑芥煢閸愵亜鏋涢柡灞剧☉閳藉宕￠悙瀵镐壕闂備浇宕甸崰鎾诲箠閹捐鐓橀柟杈鹃檮閸嬫劙鏌熺紒妯轰刊濞寸》鎷峰┑锛勫亼閸娧咃拷闈涚焸瀹曟娊鏁愰崪浣圭稁闂佸憡绻傛繛濠囨惞鐟欏嫬顎涢悗瑙勬礀濞层劌鈻旈幐搴濈箚闁绘劦浜滈敓鑺ョ墵瀹曞綊妫冨ù銏℃そ婵¤埖寰勭�ｎ偅鐝栭梻渚�娼х换鍫ュ磹閺囩儐鍟呮繝闈涱儐閻撴稑顭跨捄渚剰闁诲繈鍎抽敓鑺ヮ問閸犳牠宕查弻銉拷鏃堝礃椤斿槈褔鏌涢埄鍐噧妞ゎ値鍛＜闁绘劦鍓氱欢鑼磼婢跺本鍤�闁伙絿鍏樺鎾偄閾忓湱妲囬梻浣规偠閸庮垶宕濇惔銊ュ偍闁归棿鐒﹂埛鎴︽煕閹炬潙绲诲ù婊勭箘缁辨帞鎷犻懠顑垽宕￠柆宥嗙厵闂傚倸顕崝宥夋煟閹惧瓨绀冪紒缁樼洴瀹曞崬螣閸濆嫷娼旂紓鍌欑筏閹风兘鏌涢幇闈涙灍闁稿﹦鏁搁惀顏堝级濞嗙偓效闁诲孩鐔幏锟�? by changhao
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
					TeamManager.logger.error("COneKeyTeamMatch:闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲搁弮鍫澪ラ柛鎰ㄦ櫆閸庣喖鏌曡箛瀣労婵炶尙顭堥埞鎴︽偐鐠囇冧紣闂佺懓鍟跨换鎰版偩閻戣棄绠甸柟瑙勵殔缂嶅﹪寮幇鏉垮窛妞ゆ棁娉曢、鍛存⒒娴ｅ摜锛嶇紒顕呭灠椤繑绻濆顓熸闂佽姤锚椤﹂亶鎮鹃銏＄厱閹肩补锟藉疇鍩為柧鑽ゅ仦缁绘盯宕卞Ο铏逛患闂佺懓鍟块幊妯侯潖婵犳艾纾兼慨姗嗗墾閹风兘骞栨担鍝ワ紮闂佸綊妫跨粈渚�鎮块娴庡綊宕楅崗鑲╃▏缂備焦鍔栭〃濠囧蓟閳ユ剚鍚嬮幖绮癸拷宕囶啇婵犳鍠涢～澶愭偂閿熺姴钃熼柕濞炬櫆閸嬪棝鏌涚仦鍓р槈妞ゅ骏鎷� "+roleid);
					
					msg.ret = 1;
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					return true;					
				}
				
				Team team = null;
				team = TeamManager.getTeamByTeamID(teamid);	//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎽傜�ｎ喖鐐婃い鎺嶇贰濡啫鈹戦悙宸殶妞ゆ帟灏欑槐鐐寸瑹閿熻棄顕ｉ锕�绀冩い鏃囧亹閿涙粌鈹戦鏂よ�跨痪顓狀焾鍗辨い鏍仦閳锋帒霉閿濆浂鐒炬い銉ョ箻閺屾稓锟斤綆浜濋ˉ銏拷瑙勬礈婢ф骞嗛弮鍫濐潊闁绘ɑ褰冮～濠囨⒒閸屾艾锟芥悂宕愰幖浣哥９闁归棿绀佺壕褰掓煙闂傚顦﹂柣銈庡枛闇夐柛蹇撳悑缂嶆垹绱掗幇顓ф畼闁跨喕妫勭粻宥夊磿閸楃伝娲晝閸岋妇绋忛梺鍝勬储閸ㄦ椽鎮￠悢鍏肩厵闂侇叏绠戦弸娑㈡煕閺傛鍎旈柡宀嬬秮楠炴﹢宕￠悙鎻掝潛闂傚倸娲らˇ鐢稿蓟閵娿儮鏀介柛鈾�鏅滈埢鎾斥攽閳藉棗浜濋柛銊ユ贡濡叉劙骞掗幘宕囩獮濠电偞鍨堕悷銉╊敂閿燂拷 by changhao	
				if (!team.isTeamLeader(roleid))
				{
					psend(roleid, new STeamError(TeamError.SelfNOtLeader));
					TeamManager.logger.error("COneKeyTeamMatch:闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲搁弮鍫澪ラ柛鎰ㄦ櫆閸庣喖鏌曡箛瀣労婵炶尙顭堥埞鎴︽偐鐠囇冧紣闂佺懓鍟跨换鎰版偩閻戣棄绠甸柟瑙勵殔缂嶅﹪寮幇鏉垮窛妞ゆ棁娉曢、鍛存⒒娴ｅ摜锛嶇紒顕呭灠椤繑绻濆顓熸闂佽姤锚椤﹂亶鎮鹃銏＄厱閹肩补锟藉疇鍩為柧鑽ゅ仦缁绘盯宕卞Ο铏逛患闂佺懓鍟块幊妯侯潖婵犳艾纾兼慨姗嗗墾閹风兘骞栨担鍝ワ紮闂佸綊妫跨粈渚�鎮块娴庡綊宕楅崗鑲╃▏缂備焦鍔栭〃濠囧蓟閳ユ剚鍚嬮幖绮癸拷宕囶啇婵犳鍠涢～澶愭偂閿熺姴钃熼柕濞炬櫆閸嬪棝鏌涚仦鍓р槈妞ゅ骏鎷� "+roleid);
					
					msg.ret = 1;
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					return true;						
				}
				
				teamid = xtable.Roleid2teamid.get(roleid);		
				if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽顐粶缂侊拷婢跺绻嗛柕鍫濇噺閸ｅ湱绱掗悩闈涒枅闁哄瞼鍠栭獮鍡氼槾闁挎稑绉归弻锟犲幢椤撶姷鏆ゅ┑顔硷攻濡炰粙銆佸Δ鍛櫢闁伙絽鐬奸惌鎾绘倵閻㈠憡浜ら柟宄板槻椤繈顢楁径瀣撱劑姊虹捄銊ユ灆婵☆偄瀚划璇差吋婢跺﹦锛熼梻渚囧墮缁夊绮婚悩璇茬闁圭⒈鍘鹃崢婊呯磽瀹ュ棛澧甸柡灞炬礋瀹曠厧鈹戦幇顓壯囨⒑缂佹ɑ灏版繛鑼枛瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷? by changhao
				{
					DSTeamMatchInfo config = ConfigManager.getInstance().getConf(DSTeamMatchInfo.class).get(team.getTeamInfo().getTargetid());
					if (config == null)
					{
						psend(roleid, new STeamError(TeamError.NoTarget));
						TeamManager.logger.error("COneKeyTeamMatch:闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倝绠栭弻宥夊传閸曨剙娅ｇ紓浣瑰姈椤ㄥ棙绌辨繝鍥ч柛娑卞枛濞呫倝姊虹粙娆惧剰妞わ缚鍗虫俊鐢稿礋椤栨褔鏌涘☉鍗炵仯闁绘挻妫冨濠氬磼濮橆剨鎷烽幖浣哥９闁绘垼濮ら崐鍧楁煥閺冿拷閹锋繈骞忔搴ｇ當婵炴垶蓱婢跺嫰鏌涚�ｅ墎绡�闁哄本娲樼换娑㈡倷椤掍胶褰熼梻浣芥〃缁�渚�顢栨径鎰摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹 "+roleid);
						
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
						TeamManager.logger.error("COneKeyTeamMatch:闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倝绠栭弻宥夊传閸曨剙娅ｇ紓浣瑰姈椤ㄥ棙绌辨繝鍥ч柛娑卞枛濞呫倝姊虹粙娆惧剰妞わ缚鍗虫俊鐢稿礋椤栨褔鏌涘☉鍗炵仯闁绘挻妫冨濠氬磼濮橆剨鎷烽幖浣哥９闁绘垼濮ら崐鍧楁煥閺冿拷閹锋繈骞忔搴ｇ當婵炴垶蓱婢跺嫰鏌涚�ｅ墎绡�闁哄本娲樼换娑㈡倷椤掍胶褰熼梻浣芥〃缁�渚�顢栨径鎰摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹 "+roleid);
						
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
					TeamManager.logger.info("COneKeyTeamMatch:濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閺勩儱鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐蹭簽闁轰礁瀚换娑㈠幢濡纰嶇紓浣瑰姈椤ㄥ﹪寮婚垾鎰佸悑閹肩补锟藉磭顔愰梻浣告啞閸ㄨ绻涢敓浠嬫煛鐏炲墽娲存い銏℃礋閹晠鎳犻璺ㄦ／闂備浇顕х�涒晝鍠婂鍥ф瀳鐎广儱娲﹀畷鍙夌節闂堟侗鍎愭い銉ョ墛缁绘盯骞嬮悙鍨櫑濡炪倧鑵归弲娑⑩�旈崘顔嘉︽い鏍ㄧ懅椤︼附绻涚拠褏鐣甸柛鈺傜洴楠炴帒螖娴ｅ搫骞堥梺璇茬箳閸嬫稒鏅舵禒瀣參濞撴熬鎷烽柟顔筋焾缁犳盯濡烽埡鍌わ拷宥嗙箾閿濆懏鎼愰柨鏇ㄤ邯閵嗕線寮撮姀鐙�娼婇梺鐐藉劚閸樻牕菐椤旂晫绡�婵炲牆鐏濋弸娑欍亜椤撗冨籍妤犵偛绻橀弫鎾绘晸閿燂拷?60缂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐闁芥ɑ绻堥弻鐔封枔閸喗鐏嶉梺鍝勬缁捇寮婚妸鈺傚亞闁稿本绋戦锟�?? "+roleid);
					
					msg.ret = 1;
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					return true;						
				}
				
				team.getTeamInfo().setOnekeytimestamp(systemTime);
				
				/*
				fire.pb.message.SStringRes msg1 = ConfigManager.getInstance().getConf(fire.pb.message.SStringRes.class).get(285);
				if (msg1 == null)
				{
					TeamManager.logger.error("COneKeyTeamMatch:闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟缁�濠傗攽閻樻彃浜為柣鎺旀櫕閹叉悂骞嬮敃锟芥闂佽澹嗘晶妤呭磹閻戣姤鐓熼柕蹇嬪灪閺嗏晠鏌ｉ敐鍫濈厫缂佺粯绻堟慨锟介柨婵嗘噽閸橆偊姊洪崨濠冣拹婵炲弶绮庨崚鎺楀醇閵夈儱鑰垮┑鐐村灦閻熝囧储閸涘﹦绡�闁靛骏绲剧涵楣冩倵濞戞帗娅囨繛鎴犳暬瀹曞ジ寮撮悢鍝勫箥闂備椒绱徊浠嬫嚐椤栫偛鍑犻柡鍐ㄥ�荤壕濂稿级閸稑濡肩紒妤佸浮閹藉爼寮介鐔凤拷鐢告煥濠靛棝顎楀褎澹嗙槐鎺楀箛椤撗勭杹闂佸搫鐭夌紞渚�骞冮姀銈呭窛濠电姴瀚ч弫宥夋⒒娴ｇ儤鍤�闁搞倖鐗犻獮蹇涙晸閿燂拷 "+roleid);
					return false;						
				}
				*/
				
				fire.pb.message.SStringRes msg2 = ConfigManager.getInstance().getConf(fire.pb.message.SStringRes.class).get(286);
				if (msg2 == null)
				{
					TeamManager.logger.error("COneKeyTeamMatch:闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟缁�濠傗攽閻樻彃浜為柣鎺旀櫕閹叉悂骞嬮敃锟芥闂佽澹嗘晶妤呭磹閻戣姤鐓熼柕蹇嬪灪閺嗏晠鏌ｉ敐鍫濈厫缂佺粯绻堟慨锟介柨婵嗘噽閸橆偊姊洪崨濠冣拹婵炲弶绮庨崚鎺楀醇閵夈儱鑰垮┑鐐村灦閻熝囧储閸涘﹦绡�闁靛骏绲剧涵楣冩倵濞戞帗娅囨繛鎴犳暬瀹曞ジ寮撮悢鍝勫箥闂備椒绱徊浠嬫嚐椤栫偛鍑犻柡鍐ㄥ�荤壕濂稿级閸稑濡肩紒妤佸浮閹藉爼寮介鐔凤拷鐢告煥濠靛棝顎楀褎澹嗙槐鎺楀箛椤撗勭杹闂佸搫鐭夌紞渚�骞冮姀銈呭窛濠电姴瀚ч弫宥夋⒒娴ｇ儤鍤�闁搞倖鐗犻獮蹇涙晸閿燂拷 "+roleid);
					
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

