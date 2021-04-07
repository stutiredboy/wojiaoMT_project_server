
package fire.pb.team;
import fire.pb.StateCommon;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestSetTeamLevel__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸偅缍堝┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锝呭悁闁垶鏌＄仦鍓ф创闁糕晛瀚板畷姗�顢旀担璇★拷鍥⒒娴ｇ懓鈻曢柡锟介柆宥呯闁搞儺鍓欓拑鐔兼煥濠靛棭妲告俊顐ｏ耿閺屾盯鈥﹂幋婵囩彯闂佸搫妫庨崹鑽ゆ閹惧鐟瑰┑鐘插暙椤忚泛鈹戦悩鍨毄濠殿喖顕敓鑺ュ嚬閸犳碍绔熼弴銏犵闁兼祴鏅濋鏇㈡⒑閻熼偊鍤熼柛搴㈠灦缁楃喎鈽夊▎搴ｇ畾闂佸湱绮敮妤呭箚閸儲鎳氶柡宥庡幗閻撶喐绻涢崱妤冪闁革絾妞介幃妤�顫濋悙顒�顏�
 * @author changhao
 *
 */
public class CRequestSetTeamLevel extends __CRequestSetTeamLevel__ {

	Team team;
	
	@Override
	protected void process() {
		// protocol handle
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long leaderRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (leaderRoleId < 0)
			return;
		mkdb.Procedure setTeamLevelP = new mkdb.Procedure()
		{

			@Override
			protected boolean process()
			{
				//lock start 
				Long teamId = xtable.Roleid2teamid.select(leaderRoleId);
				//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣筋潐婢瑰棙鏅跺Δ鍛；閻庯綆鍠楅悡娆撴煕閹炬鎳庣粭锟犳⒑缁嬫鍎愰拑杈╃磼缂佹娲寸�规洖宕灒闁惧繘锟芥稒顢橀梻浣筋嚙鐎涒晝鍠婂澶嬪殞濡わ絽鍟繚闂佸湱鍎ら崺鍫濐焽閳哄懏鐓熼柟浼存涧婢ь喗銇勮箛姘厫缂佺粯绻傞銉╁几椤愵澁鎷烽妶澶婂惞閻庯綆鍠楅埛鎺楁煕閺囥劌浜滄い蹇ｅ亰閺屻劑鎮㈤悜妯荤彧闂佽桨鐒﹂幃鍌氱暦閵忥綆妯勫銈冨灪钃辩紒铏规櫕缁瑩宕归鍖℃嫹閸喒鏀介柍钘夋閻忥綁鏌涙惔銏犵仼缂侇喖顭烽獮妯兼嫚閼艰埖鎲版繝鐢靛仦閸ㄥ爼鏁冮埡渚囩劷闁冲搫鎳忛悡鏇㈡煙閻愵剦娈旈柟铏姍閹即濡烽埡鍌楁嫼闂佺厧顫曢崐鏇熺墡闂備礁鎲″褰掋�冩繝鍌滄殾濞村吋娼欑粻濠氭偣閸濆嫭鎯堥柣蹇擄躬濮婅櫣鎹勯妸銉︾彚闂佺懓鍤栭幏锟�?
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				if(!team.isTeamLeader(leaderRoleId))
					return true;//濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氳淇婇妶鍕妽闁告瑥绻橀弻鐔虹磼閵忕姵鐏嶉梺绋垮椤ㄥ懘濡撮幒鎴僵闁绘劦鍓欓鍫曟⒒娴ｇ瓔鍤冮柛顭戝灦閹偤鏁冮敓浠嬵敋閵夆晛绀嬫い鎾寸箖閸曞啴姊虹拠鈥崇�婚柛娑卞弮閸欙繝姊婚崒姘拷椋庢濮橆剦鐒界憸鏃囨婵炲濮撮鍡涘磻閸岀偞鐓曟い鎰剁悼缁犮儵鏌ｉ幒宥囩煓闁哄被鍔戦幃銏ゅ传閸曟埊缍侀弻锝夊箻鐠鸿　鏋呴梺鍝勭焿缂嶄線骞冮姀銈呭窛濠电姴瀚崵鎺旂磽閸屾瑨鍏岄悗姘箻瀹曠喖顢旈崱娆戞毎闂傚倷绀侀幉锟犳偡閵夆敡鍥ㄥ閺夋垹锛欓梺褰掑亰閸ｎ垶骞忔搴㈠枂闁告洦鍓涢敍姗�姊虹粙鎸庢崳闁轰浇顕ч锝夘敃閿曪拷缁�鍐煃閸濆嫬锟芥悂顢撻幘缁樷拺闁诡垎鍛啈濡炪倖娲橀悧鐘茬暦椤栫偛纾奸柣鎰ˉ閹风粯绻涙潏鍓у埌闁硅绻濋獮鍡涘醇閵夛箑锟藉灚鎱ㄥΟ鍝勮埞闁告ê顕敓鍊燁潐濞叉牕锕㈤柆宥呯闁告洦鍓氭刊鎾煛閸ユ湹绨界紒澶樺櫍閺屸剝鎷呯粙鍖℃嫹閸ф绠板┑鐘插暙缁剁偞淇婇婊冨妺妞ゆ梹鎹囧铏规嫚閺屻儺锟芥绱掗悩鑼х�规洘娲熷畷锟犳倶缂佹ɑ銇濋柡浣稿暣瀹曟帒鈽夊Ο瑙勫亝闂傚倸鍊风欢锟犲礈濞嗘垹鐭撻柣銏㈩焾閻撴洟鏌熼悜姗嗘畷闁绘挻娲熼弻鐔煎级閸喗鍊庣紓浣靛妼椤兘寮婚敍鍕舵嫹閿濆骸浜炴繛鍙夋尦閺屸�崇暆鐎ｎ剛鐦堥悗瑙勬礋娴滃爼銆佸锟介幃銏＄附婢跺澶�
				Long[] roleids = new Long[1];
				roleids[0] = leaderRoleId;
				this.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK,(Object[])roleids));
				//lock end
				
				if(!checkOnline(leaderRoleId))
				{
					//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸偅缍堝┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锝呭悁闁垶鏌＄仦鍓ф创闁糕晛瀚板畷姗�顢旀担璇★拷鍥⒒娴ｈ鍋犻柛濞у洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬礃缁矂鍩ユ径鎰潊闁炽儱鍘栭悽缁樼節閻㈤潧鈻堟繛浣冲浂鏁勯柛鈩冪♁閸嬪倿鏌￠崶銉ョ仾闁绘挶鍎甸弻锟犲磼濞戞﹩鍤嬮梺璇″灠閻楀棝鍩為幋锕�鐏抽柧蹇ｅ亜娴犳挳姊洪崫鍕拱闁烩晩鍨辨穱濠囧醇閺囩偛绐涢梺鍝勵槹閸ㄧ敻宕ｆ繝鍥ㄢ拻濞达綀濮ら妴鍐磼閿熻姤鎷呴搹鍦厠闂佽崵鍠愭竟鍡涘汲閿曞倹鐓欓梻鍌氼嚟椤︼箓鏌涘▎蹇ュ姛缂佽鲸甯掗埥澶婎潩閸忚偐绉礸al闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟〃閻掑﹪鏌涘☉娆愮稇缂佺媭鍨堕弻銊╂偆閸屾稑顏�?
					TeamManager.logger.debug("FAIL:闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸偅缍堝┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锝呭悁闁垶鏌＄仦鍓ф创闁糕晛瀚板畷姗�顢旀担璇★拷鍥⒒娴ｈ鍋犻柛濞у洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬礃缁矂鍩ユ径鎰潊闁炽儱鍘栭悽缁樼節閻㈤潧鈻堟繛浣冲浂鏁勯柛鈩冪♁閸嬪倿鏌￠崶銉ョ仾闁绘挶鍎甸弻锟犲磼濞戞﹩鍤嬮梺璇″灠閻楀棝鍩為幋锕�鐏抽柧蹇ｅ亜娴犳挳姊洪崫鍕拱闁烩晩鍨辨穱濠囧箚閹殿喚鏉搁梺鍝勫�归娆愬閿燂拷,roleid: " + leaderRoleId);
				}
				else if(!checkSetedLevelValid(minlevel, maxlevel))
				{
					//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸偅缍堝┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锝呭悁闁垶鏌＄仦鍓ф创闁糕晛瀚板畷姗�顢旀担璇★拷鍥⒒娴ｄ警鐒惧Δ鐘叉憸缁棁銇愰幒鎴ｆ憰濠电偞鍨崹褰掑础閹惰姤鐓忓┑鐐茬仢閸旀氨绱掗悩宸吋婵﹨娅ｅ☉鐢稿川椤撗勵棈闂備胶顭堥鍡涘礉濡わ拷鍗遍柟鐗堟緲缁犺櫕淇婇妶鍕槮濞存粎鍘ч埞鎴︽倷閸欏妫炵紓浣虹帛閸旀瑩寮幘缁樺癄濠㈣埖顭囬崥瀣⒑鐠団�虫灈闁搞垺鐓￠崺鐐哄箣閻欏懏瀚归柨婵嗛娴滅偤鏌涘Ο鍝勮埞闁宠鍨块、娆撳棘閵堝嫮杩旈梻浣告啞閹歌崵绮欓幒妤�鐤鹃悹楦裤��濡插牊鎱ㄥΟ鍧楀摵闁挎稑绻愰—鍐Χ閸℃ê鏆楅梺绋款儑閸犳牕鐣峰ú顏呮櫜濠㈣泛顑囬崢鍛婄箾鏉堝墽鍒伴柟鑺ョ矋閺呫儵鏌ｆ惔銈庢綈婵炲弶锕㈤獮鍐磼濮樼厧娈ㄩ梺瑙勵問閸犳碍銇欏畷鍥╃＜濠㈣泛顦拌ぐ顧闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟〃閻掑﹪鏌涘☉娆愮稇缂佺媭鍨堕弻銊╂偆閸屾稑顏�?
					TeamManager.logger.debug("FAIL:闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸偅缍堝┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锝呭悁闁垶鏌＄仦鍓ф创闁糕晛瀚板畷姗�顢旀担璇★拷鍥⒒娴ｄ警鐒惧Δ鐘叉憸缁棁銇愰幒鎴ｆ憰濠电偞鍨崹褰掑础閹惰姤鐓忓┑鐐茬仢閸旀氨绱掗悩宸吋婵﹨娅ｅ☉鐢稿川椤撗勵棈闂備胶顭堥鍡涘礉濡わ拷鍗遍柟鐗堟緲缁犺櫕淇婇妶鍕槮濞存粎鍘ч埞鎴︽倷閸欏妫炵紓浣虹帛閸旀瑩寮幘缁樺癄濠㈣埖顭囬崥瀣⒑鐠団�虫灈闁搞垺鐓￠崺鐐哄箣閻欏懏瀚归柨婵嗛娴滅偤鏌涘Ο鍝勮埞闁宠鍨块、娆撳棘閵堝嫮杩旈梻浣告啞閹歌崵绮欓幒妤�鐤鹃悹楦裤��濡插牊鎱ㄥΟ鍧楀摵闁挎稑绻愰—鍐Χ閸℃ê钄奸梺鍛婃煥缁夊爼鏁撻懞銉у暡闁瑰嚖鎷�,minlevel: " + minlevel + " ;maxlevel: "+maxlevel);
				}
				else
				{
					TeamManager.logger.debug("SUCC:闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢绘俊鐐�栭悧婊堝磻濞戙垹鍨傞柛灞剧◤娴滄粓鏌″鍐ㄥ闁靛棙甯楅妵鍕煛閸屾粌寮ㄩ梺鍝勭灱閸犳牠骞冨鍏剧喖鎮滈埡鍌氼伕婵犵數濮甸鏍垂娴兼潙围闁归棿绀侀拑鐔哥箾閹存瑥鐏╃紒鐘电帛娣囧﹪濡惰箛鏂款伓闂備胶鎳撻崯璺ㄦ崲濮楋拷楠炲啫螖閸滀焦鏅ｉ梺闈涚箚濡狙囧箯婵犳碍鈷戠紒瀣濠�浼存煠瑜版帞鐣虹�殿喗濞婇幃銏ゅ礂閼测晛骞堥梻浣虹帛椤牏浜稿▎鎺戯拷瀛樼節绾版﹫鎷烽崘鑼獓闂佸憡姊归悷鈺呯嵁閸愩劉鏋庨柟鐐綑娴犳椽姊哄Ч鍥х伄缁绢厼鐖煎銊╁传閸曘劍鏂�闂佺粯锕╅崰鏍倶鏉堛劎绠惧璺侯儑濞叉挳鏌熼姘辩劯鐎规洘甯￠幃娆撳级閹存粎閽甸梻鍌欒兌閹虫挻鏅堕悾灞藉灊妞ゆ牜鍋涚壕濠氭煥閻斿搫校闁绘挻鐩弻娑㈠Ψ閿濆懎顬夐梺姹囧妽閸ㄥ潡寮诲☉銏犳閻犳亽鍓辫閺屸�崇暆鐎ｎ剛袦濡炪們鍨哄褰掑箚閺冨牆顫呴柣娆欐嫹濞寸》鎷�, minlevel: " + minlevel + " ;maxlevel: "+maxlevel);
					team.getTeamInfo().setMinlevel(minlevel);
					team.getTeamInfo().setMaxlevel(maxlevel);
					SSetTeamLevel sSetTeamLevel = new SSetTeamLevel();
					sSetTeamLevel.minlevel = minlevel;
					sSetTeamLevel.maxlevel = maxlevel;					
					mkdb.Procedure.psendWhileCommit(team.getTeamBroadcastSet(), sSetTeamLevel);//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱绱掔�ｎ偓绱╂繛宸簻椤懘鏌曢崼婵囧櫧闁挎稒鐟╁娲传閸曨剛妯堟俊顐︻暒閻掞箓鎯堣箛娑欌拻濞达絼璀﹂悞楣冩煟椤掞拷閵堢鐣烽幋锔藉�烽柛婵嗗閸橀亶姊洪悷鏉库挃缂侇噮鍨堕幃锟犳偄閸忚偐鍘搁梺绋挎湰濮樸劍绂掗姀掳浜滈柨婵嗘噽閿涘秶绱掓潏銊ユ诞闁轰焦鎹囬幊鐐哄Ψ瑜忛惁鍫ユ⒑閸涘﹥澶勯柛姗�绠栭弫宥咁煥閸愶絾鏂�闂佺粯鍔栧娆撴倶閿曞倹鐓ラ柡鍥殕濞呭懘宕￠柆宥嗙厱婵犻潧妫楅悵瀣煛閸愩劎澧涢柛瀣姍閺屾稑鈻庤箛锝喰﹂梺鍝勵儑婵挳鍩為幋锕�鐓￠柛鈩冦仦婢规洟姊洪悷鏉挎闁瑰嚖鎷�?婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖缁愭鎱ㄥΟ鎸庣【缂佺姷濞�閺岀喖骞戦幇闈涙缂佺偓宕橀～澶愬箞閵娿儮鏀介柛鈩冨嚬濞艰埖绻涚�涙鐭岄柟铏崌閳ワ箓宕稿Δ浣告疂闂傚倸鐗婄粙鎴︼綖瀹�鍕拺闁告稑顭▓锝夋煙閸戙倖瀚�?
				}
				return true;
			}
		};
		setTeamLevelP.submit();
	}

	//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸偅缍堝┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锝呭悁闁垶鏌＄仦鍓ф创闁糕晛瀚板畷姗�顢旀担璇★拷鍥⒒娴ｈ鍋犻柛濞у洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬磸閸ㄨ櫣绮嬮幒鏃撴嫹閿濆骸澧憸鏉挎椤啴濡堕崱妤冪懆闂佺锕ㄥ畷鍨珶閺囩喓闄勯柛娑橈功閸橀潧顪冮妶鍡欏ⅹ婵☆偅顨婂畷顖炲级鎼存挻鐏侀梺闈╁瘜閸樺墽澹曢挊澹濆綊鏁愰崱妤冧喊闂佸憡鍑归崑濠囧蓟閳╁啯濯寸紒娑橆儏濞堫參姊烘导娆戞偧闁稿繑锕㈠顐﹀箛椤撶偟绐炲┑鈽嗗灣缁垰鈻嶉崱娑欌拻濞达綀顫夐崑鐘绘煕鎼淬垻鐭掔�规洘锕㈡俊姝岊檨闁告艾鎳樺濠氬磼濮橆剨鎷锋搴㈩偨婵﹩鍓﹂悞钘夆攽閻樺磭顣查柛銈呯墦閹嘲鈻庤箛鎿冧痪濠电偛鎳愭慨鐢稿Φ閸曨噮妲鹃梺缁樼箘閻楁瓱dure濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨剙娅ｉ梺娲诲幗椤ㄥ﹪寮婚妸鈺傚亜閻犲洦鐣幘缁樼厪闁搞儜鍐句純濡炪們鍨哄ú鐔笺�佸Δ鍛櫢濞寸姴顑冮敓钘夋嚇椤㈡宕熼鍌氬箥濠电娀娼ч崐鎼佀囬娑氼洸闁规鍣幏椋庢喆閸曨剛顦ㄩ梺鎸庢磸閸ㄤ粙濡存笟锟藉顕�宕煎┑鍡欑崺婵＄偑鍊栧濠氭偤閺冨牆瑙﹂柨鐕傛嫹
	private boolean checkOnline(long roleId)
	{
		if(StateCommon.isOnline(roleId))
			return true;
		else
			return false;
	}	
	
	// 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸偅缍堝┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锝呭悁闁垶鏌＄仦鍓ф创闁糕晛瀚板畷姗�顢旀担璇★拷鍥⒒娴ｈ鍋犻柛濞у洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬礃濠㈡鐏冮梺鍛婂姦娴滄繈宕抽灏栨斀闁绘ê鐏氶弳鈺呮煕鐎ｎ剙浠辩�规洜鍎ょ换婵嬪炊瑜忛鍡涙⒑鐠恒劌娅愰柟鍑ゆ嫹?濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨偓鎷锋繝姘ワ拷鍛村矗婢跺牅绨婚棅顐㈡处閹告悂鎮电�ｎ喗鐓ユ繝闈涙－濡插綊鏌￠崨顔剧煉闁哄矉绠戣灒濞撴凹鍨遍埢鎾绘⒑閹肩偛锟芥垿宕愬┑瀣畺婵°倕鎳愬畵渚�鏌涢…鎴濇灈濠殿喖楠搁埞鎴︽倷妫版繂娈濈紓浣哄У閹瑰洭鐛崘鈹垮亝闁告劏鏅濋崝鍫曟倵楠炲灝鍔氭俊顐㈢焸楠炲繑绻濆顓涙嫼闂佸憡绋戦敃銈嗘叏閿曪拷闇夋繝濠傚閻帞锟芥鍠氶…鍫ュ煡婢舵劕顫呴柨娑樺楠炴劙姊绘担铏广�婇柛鎾寸箘缁瑩骞囬弶璺ㄧ枀婵°倧绲介崯顖炴偂濞戞◤褰掓晲閸涱喗鍠愰柡浣哥墦濮婅櫣鎷犻垾铏亖闂佹悶鍔岀紞濠囧箖妤ｅ啯鏅搁柣妯哄暱娴滈亶姊洪崜鎻掍簴闁稿孩鐓″鍐差潨閿熻棄顫忔繝姘＜婵炲棙甯掗崢锟犳⒑閸涘鐒奸柛銉ｅ妼娴犻箖姊洪幖鐐插姶闁诲繑绋戦埥澶愬閻樻妲规俊鐐�栭崝锕傚礈濠靛鏅搁柦妯侯槹閸嬨儵鏌″畝瀣埌闁宠閰ｉ獮瀣晲閸涱厾鐣眔cedure濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨剙娅ｉ梺娲诲幗椤ㄥ﹪寮婚妸鈺傚亜閻犲洦鐣幘缁樼厪闁搞儜鍐句純濡炪們鍨哄ú鐔笺�佸Δ鍛櫢濞寸姴顑冮敓钘夋嚇椤㈡宕熼鍌氬箥濠电娀娼ч崐鎼佀囬娑氼洸闁规鍣幏椋庢喆閸曨剛顦ㄩ梺鎸庢磸閸ㄤ粙濡存笟锟藉顕�宕煎┑鍡欑崺婵＄偑鍊栧濠氭偤閺冨牆瑙﹂柨鐕傛嫹
	@SuppressWarnings("unused")
	private boolean checkLeaderInTeam(long leaderRoleId,Team team)
	{
		if(team.getTeamInfo().getTeamleaderid() == leaderRoleId)
			return true;
		else
			return false;
	}
	
	//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸偅缍堝┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锝呭悁闁垶鏌＄仦鍓ф创闁糕晛瀚板畷姗�顢旀担璇★拷鍥⒒娴ｄ警鐒惧Δ鐘叉憸缁棁銇愰幒鎴ｆ憰濠电偞鍨崹褰掑础閹惰姤鐓忓┑鐐茬仢閸旀氨绱掗悩宸吋婵﹨娅ｅ☉鐢稿川椤撗勵棈闂備胶顭堥鍡涘礉濡わ拷鍗遍柟鐗堟緲缁犺櫕淇婇妶鍕槮濞存粎鍘ч埞鎴︽倷閸欏妫炵紓浣虹帛閸旀瑥顕ｉ幎鑺ュ�烽柣鎴烆焽閸樿鲸绻濋悽闈涗粶闁诲繑绻堥弫鎾绘嚍閵壯冣拡闂佺懓绠嶉崹褰掑煡婢跺ň鏋庨煫鍥ㄦ礈閻涱噣姊虹拠鎻掑毐缂傚秴妫濆畷鎴﹀幢濞戞鍘村┑鐐村灦濮樸劎澹曢挊澹濆綊鏁愰崱妤冧喊闂佸憡鍑归崑濠囧蓟閳╁啯濯寸紒娑橆儏濞堫參姊烘导娆戞偧闁稿繑锕㈠顐﹀箛椤撶偟绐炲┑鈽嗗灣缁垰鈻嶉崱娑欌拻濞达綀顫夐崑鐘绘煕鎼淬垻鐭掔�规洘锕㈡俊姝岊檨闁告艾鎳樺濠氬磼濮橆剨鎷锋搴㈩偨婵﹩鍓﹂悞钘夆攽閻樺磭顣查柛銈呯墦閹嘲鈻庤箛鎿冧痪濠电偛鎳愭慨鐢稿Φ閸曨噮妲惧Δ鐘靛仜濞煎坏dure濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨剙娅ｉ梺娲诲幗椤ㄥ﹪寮婚妸鈺傚亜閻犲洦鐣幘缁樼厪闁搞儜鍐句純濡炪們鍨哄ú鐔笺�佸Δ鍛櫢濞寸姴顑冮敓钘夋嚇椤㈡宕熼鍌氬箥濠电娀娼ч崐鎼佀囬娑氼洸闁规鍣幏椋庢喆閸曨剛顦ㄩ梺鎸庢磸閸ㄤ粙濡存笟锟藉顕�宕煎┑鍡欑崺婵＄偑鍊栧濠氭偤閺冨牆瑙﹂柨鐕傛嫹
	private boolean checkSetedLevelValid(int minLevel,int maxLevel)
	{
		if(minLevel > maxLevel)
			return false;
		else if( minLevel < TeamManager.LEVEL_REQUST_MIN || minLevel > TeamManager.LEVEL_REQUST_MAX )
			return false;
		else if( maxLevel < TeamManager.LEVEL_REQUST_MIN || maxLevel > TeamManager.LEVEL_REQUST_MAX)
			return false;
		else 
			return true;
	}
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794462;

	public int getType() {
		return 794462;
	}

	public int minlevel;
	public int maxlevel;

	public CRequestSetTeamLevel() {
	}

	public CRequestSetTeamLevel(int _minlevel_, int _maxlevel_) {
		this.minlevel = _minlevel_;
		this.maxlevel = _maxlevel_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(minlevel);
		_os_.marshal(maxlevel);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		minlevel = _os_.unmarshal_int();
		maxlevel = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestSetTeamLevel) {
			CRequestSetTeamLevel _o_ = (CRequestSetTeamLevel)_o1_;
			if (minlevel != _o_.minlevel) return false;
			if (maxlevel != _o_.maxlevel) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += minlevel;
		_h_ += maxlevel;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(minlevel).append(",");
		_sb_.append(maxlevel).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestSetTeamLevel _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = minlevel - _o_.minlevel;
		if (0 != _c_) return _c_;
		_c_ = maxlevel - _o_.maxlevel;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

