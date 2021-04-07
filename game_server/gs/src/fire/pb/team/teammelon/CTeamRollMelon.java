
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
			/*闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸崹楣冨箛娴ｅ湱绋佺紓鍌氬�烽悞锕傗�﹂崶鈺冧笉濡わ絽鍟悡銉╂煟閺傚灝顣抽柣顓熺懇閺屸�崇暆鐎ｎ剛鐦堥梺杞扮劍閹歌崵绮嬮幒鏃撴嫹閿濆骸浜濇繛鍛矒濮婅櫣鍖栭弴鐐测拤闂佸憡姊圭敮鐐烘嚍鏉堛劎绡�婵﹩鍘搁幏娲⒑閸涘﹦鈽夐柨鏇缁骞樼紒妯猴拷鍨叏濡厧甯堕柡瀣ㄥ�濋弻娑㈡偐鐠囇冧紣闂佷紮缍囩槐鏇犲垝閸垻鐭夌紒宀嬫嫹 by changhao*/
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
					fire.pb.team.TeamManager.logger.debug("CTeamRollMelon:婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ婢舵劖鐓ユ繝闈涙閸ｆ椽鎮归幇鍓佺瘈婵﹤顭峰畷鐔碱敃閵忊晙绱旈梻浣告惈婢跺洭鏁撻挊澶岋紞闁哄棎鍊栭妵鍕籍閸屾艾浠橀梺杞扮贰娴滎亪寮婚妸鈺傚亜闁告繂瀚呴敐澶嬬厽闁规儳鐡ㄧ粈鍐磼缂佹娲寸�规洖宕灒闊浄绲奸柇顖炴煙椤旀枻鑰块柟顔规櫇缁辨帒螣閻撳骸绠為梻鍌欑窔濞佳団�﹂崼銉ョ？闁汇垻顭堥惌妤呮煕閺囥劌鐏￠柣鎾寸〒閿熺晫娅㈤幏鐑芥倵閿濆骸浜滄い蹇ユ嫹?"+roleid);
					return true;					
				}
				
				xbean.TeamMelon teammelon = eteammelon.getMelonid2melons().get(melonid);
				if (teammelon == null)
				{
					psend(roleid, new fire.pb.team.STeamError(fire.pb.team.TeamError.SelfNotInTeam));
					fire.pb.team.TeamManager.logger.debug("CTeamRollMelon:婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ婢舵劖鐓ユ繝闈涙閸ｆ椽鎮归幇鍓佺瘈婵﹤顭峰畷鐔碱敃閵忊晙绱旈梻浣告惈婢跺洭鏁撻挊澶岋紞闁哄棎鍊栭妵鍕籍閸屾艾浠橀梺杞扮贰娴滎亪寮婚妸鈺傚亜闁告繂瀚呴敐澶嬬厽闁规儳鐡ㄧ粈鍐磼缂佹娲寸�规洖宕灒闊浄绲奸柇顖炴煙椤旀枻鑰块柟顔规櫇缁辨帒螣閻撳骸绠為梻鍌欑窔濞佳団�﹂崼銉ョ？闁汇垻顭堥惌妤呮煕閺囥劌鐏￠柣鎾寸〒閿熺晫娅㈤幏鐑芥倵閿濆骸浜滄い蹇ユ嫹?"+roleid);
					return true;					
				}
				
				//婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖缁愭淇婇妶鍛殶缂佹唻绠撻弻娑滎槼妞ゃ劌鎳愭竟鏇°亹閹烘挾鍘甸梺缁樺姦閸撴瑩藟閻愬灚鍠愰幖绮规閸ゆ鏌涢弴銊ュ缂佺娀绠栭弻锝夊箛闂堟稑顫梺鍛婄懃閸熸潙顫忕紒妯诲閻熸瑥瀚导鍥⒑閸濆嫭鍣洪柣鈺婂灠閻ｇ兘顢涢悜鍡樻櫖濠电姴锕ら幊宥囩箔婢舵劖鈷戦柛锔诲幖閸斿銇勯妸銉︻棦鐎规洘鍨块弫鎰板炊閵娿儲鐎鹃柣搴＄畭閸庡崬霉閸曨垰绠�瑰嫰鍋婂鈺呮煟閹炬娊顎楃紒顐㈢Ч濮婅櫣鎷犻垾铏闂佸憡渚楅崹鎶界嵁閹惧墎纾藉〒姘搐娴滄繄鎲搁弶鎸庢儎闂傚倸鍊搁崐鎼佸磹瀹勯偊娓婚柟鐑樻⒐椤洘銇勯弴顏呭濡ょ姷鍋涚换姗�寮幘缁樻櫢闁跨噦鎷�? by changhao
				Integer rollpoint = teammelon.getMelonroleids().get(roleid);
				if (rollpoint == null)
				{
					psend(roleid, new fire.pb.team.STeamError(fire.pb.team.TeamError.SelfNotInTeam));
					fire.pb.team.TeamManager.logger.debug("CTeamRollMelon:婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ婢舵劖鐓ユ繝闈涙閸ｆ椽鎮归幇鍓佺瘈婵﹤顭峰畷鐔碱敃閵忊晙绱旈梻浣告惈婢跺洭鏁撻挊澶岋紞闁哄棎鍊栭妵鍕籍閸屾艾浠橀梺杞扮贰娴滎亪寮婚妸鈺傚亜闁告繂瀚呴敐澶嬬厽闁规儳鐡ㄧ粈鍐磼缂佹娲寸�规洖宕灒闊浄绲奸柇顖炴煙椤旀枻鑰块柟顔规櫇缁辨帒螣閻撳骸绠為梻鍌欑窔濞佳団�﹂崼銉ョ？闁汇垻顭堥惌妤呮煕閺囥劌鐏￠柣鎾寸〒閿熺晫娅㈤幏鐑芥倵閿濆骸浜滄い蹇ユ嫹?"+roleid);
					return true;	
				}
				
				Integer alreadroll = teammelon.getOpmelonroleids().get(roleid);
				if (alreadroll != null)
				{
					fire.pb.team.TeamManager.logger.debug("CTeamRollMelon:闂傚倸鍊峰ù鍥敋瑜嶉～婵嬫晝閸岋妇绋忔繝銏ｅ煐閸旀牠宕戦妶澶嬬厸闁搞儮鏅涘皬闂佺粯甯掗敃銉ф崲濞戙垹骞㈡俊顖濇娴犳挳姊洪幖鐐插缂佽鍟存俊鐢稿礋椤栨氨鍔撮梺鍛婂姧缁犳垶绂掗—鎵￠梻鍌氬�搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换娑㈠箣閻愨晜锛堝┑鐐叉▕娴滄繈寮查弻銉︾厱闁靛鍠曠花鑽や焊韫囨稒鈷掑ù锝堝Г绾爼鏌涢敐蹇曠暤妤犵偛绻橀弫鎾绘晸閿燂拷"+roleid);
					return true;
				}
				
				if (status == 0) //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫锟芥艾顦伴妵鍕箳閹存繍浠肩紓渚婃嫹濠㈣埖鍔栭悡娆撴煟閹寸伝顏勑掗崟顓熷枑閹肩补妲呴崵妤呮煕閺囥劌寮块柟椋庡厴閺佹劙宕掑☉娆戝絿缂傚倷鑳舵慨闈涚暆缁嬫娼栭柧蹇撴贡閻瑩鏌熺粙鍨劉闁圭柉浜槐鎾存媴閸撴彃鍓遍梺瑙勭摃瀹曠數鍒掔�ｎ亶鍚嬪鑸瞪戦弲顒勬⒑缂佹ê濮囨い鏇ㄥ弮瀹曘垽骞栨担鍏夋嫼闁荤姵浜介崝宀勫几瀹ュ洨纾兼い鏃傛櫕閹冲洭鏌ｅ☉鍗炴珝鐎规洖宕～婵嬪礂婢惰鍓涚槐鎾存媴缁嬪簱鎸冮梺绋款儐閹瑰洤鐣烽弴銏犵闁兼亽鍎抽悾鎶芥⒒閸屾瑦绁版繛澶嬫礋瀹曟娊鏁冮崒姘鳖唵闂佽法鍣﹂幏锟�? by changhao
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
				
				for (Long e : eteammelon.getMelonerlist()) //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡鏇㈡煥閺冨浂鍤欐鐐寸墵閺屾盯濡搁敂鍓х暤闂傚洤顦甸弻娑滅疀閹捐櫕鍊紓鍌氱У閸ㄥ湱妲愰幒妤佸亼闁告侗鍠栭锟�?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎽傜�ｎ喖鐐婃い鎺嶇贰濡啫鈹戦悙宸殶妞ゆ帟灏欑槐鐐寸瑹閿熻棄顕ｉ锕�绀冩い鏃囧亹閿涙粌鈹戦鏂や緵闁告挻鐩幃浼村煛閸屾粎鐦堢紒鍓у钃辨い顐躬閺屾盯濡搁妷褝绱為梺鍛婂笚鐢繝銆佸☉妯锋婵ê鍚嬬粊顐ｇ節绾版ɑ顫婇柛銊ф暬瀹曟垿骞囬纰辨闂佽姤锚椤ャ垼銇愰幒鎾存珳闂佸憡渚楅崰妤呭窗閹邦厾绡�闁冲嚖鎷峰ù锝呮憸娴犲墽绱撴担铏瑰笡闁烩晩鍨伴悾閿嬬附閸涘﹤浜滄俊鐐差儏缁ㄧ厧顩奸幘瀵哥瘈闁汇垽娼ф禒鈺侇熆閻熸壆澧︽い銏′亢椤﹀綊鏌涢埞鍨仾闁诡垱妫冩慨锟介柍銉ュ暱婵℃娊姊绘笟锟藉褔鈥﹂崼銉ョ？闁哄被鍎查崑顏堟煕鐏炴儳鐒归柡锟芥禒瀣厽闁归偊鍨伴惃娲煙閻ｅ苯啸缂佽鲸甯￠、娆愮附缁嬪灝鍙婇梻浣筋嚃閸ㄤ即宕愰崷顓犵當闁绘柨鎼欢銈夋煕瀹ュ拋妯�婵﹤顭峰畷鎺戔枎閹烘垵甯紓鍌欑贰閸ｎ噣宕圭捄铏规殾婵犻潧妫銊╂煥閻斿墎鐭欓柡浣瑰姍閹瑩寮堕幋鐘电嵁闂備礁缍婇崑濠囧礈濞戙垺鏅柣鏂垮悑椤ュ﹥銇勯幇鈺佺仾濠㈣泛瀚槐鎺旓拷锝庡亜閻忊晝绱掗鑲╁ⅵ闁轰焦鎹囬弫鎾绘晸閿燂拷? by changhao
				{
					//TeamManager.logger.info("roll闂傚倸鍊搁崐鎼佸磹瀹勯偊娓婚柟鐑樻⒐椤洘銇勯弴顏呭濡ょ姷鍋涚换姗�寮幘缁樻櫢闁跨噦鎷�?:闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁�濠囨煥閻旇袚缂佺粯鐩畷顏堝礃椤忓柊婊堟⒑绾懏鐝紒顔兼捣閸掓帡寮▎鐐稁闂佺粯鐗曞鎶渄:" + e + "闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽顐粶缂侊拷婢跺鍙忔俊銈咁儐鐎氬綊姊洪幐搴ｇ畼闁稿鍋涢銉╁礋椤栨氨鐤�濡炪倖甯婂ù鍥╂閵忋倖鈷掑ù锝堝Г绾爼鏌涢敐蹇曠暤妤犵偛绻橀弫鎾绘晸閿燂拷:" + msg.rollinfo.roll);
					mkdb.Procedure.psendWhileCommit(e, msg);			
				}
				
				for (Long e : eteammelon.getWatchmelonerlist()) //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡鏇㈡煥閺冨浂鍤欐鐐寸墵閺屾盯濡搁敂鍓х杽闂佸搫鐬奸崰搴ㄥ煝閹捐鍨傛い鏃傛櫕娴滃爼姊绘担鍛婃喐濠殿喗娼欒灋婵犻潧顑呴拑鐔哥箾閹寸偟鐓繛宀婁邯閺屾盯骞樺Δ锟介幊鎰板储閹寸姷纾介柛灞剧懆閸忓苯鈹戦娑欏唉妤犵偛绻橀弫鎾绘晸閿燂拷 ROLL闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽顐粶缂侊拷婢舵劖鐓涢柛銉㈡櫅閸撴娊鏌ら弶鎸庡仴闁哄本绋戣灃闁告劑鍔嬪Ч妤呮⒑閸濆嫷鍎愭俊顐㈠暣瀵鎮㈤悮瀛樺闁汇垺顔栭悞鎯归悩娆忓娴滄粓鏌嶉崫鍕靛剱閻庢熬鎷�? by changhao
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
	 * 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾叉閻掑﹪鏌曟繛鐐珔缂佺媭鍨堕弻銊╂偆閸屾稑顏�?缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏堕梻浣筋嚃閸燁偊宕惰閼板灝鈹戦悙鏉戠仸妞ゎ厼娲幃浼村Ψ閳哄倵鎷洪梺鍛婄☉閿曪絿娆㈤柆宥嗙厱闁靛鍊楅惌娆愵殽閻愯尙绠叉い锔惧閹棃濮�閻樺磭锟筋參姊绘担鍛婂暈婵炶闄勭粋宥呪枎閹搭垱瀚规繛鎴炲笚濞呭﹥鎱ㄦ繝鍌涙儓閺佸牓鏌涢妷鎴濆枤閻庡绱撻崒娆愮グ妞ゆ泦鍥ㄥ亱闁规崘宕靛畵渚�鏌涢埄鍐槈缂侊拷閸愨斂浜滈柡鍐ㄦ搐娴滆銇勯敂鑺ョ凡妞ゎ亜鍟存俊鍫曞幢濡儤娈梻浣侯焾椤戝棝鏁冮姀鐘垫殾闁绘顕ч崘锟藉銈嗘尵閸熷潡骞忓ú顏呪拺缂備焦顭堟竟姗�鏌ｆ幊閸斿酣鏁撻懞銉у暡闁瑰嚖鎷�?濠电姷鏁告慨鐑藉极閸涘﹤鍨旀い鎾跺剱閻斿棗銆掑鐐濡ょ姷鍋涚换姗�寮幘缁樻櫢闁跨噦鎷�? by changhao
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

