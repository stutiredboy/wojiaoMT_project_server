
package fire.pb.team;
import fire.pb.main.ConfigManager;
import fire.pb.talk.MessageMgr;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestTeamMatch__ extends mkio.Protocol { }

/** 最新加入功能 by changhao
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸崹楣冨箛娴ｅ湱绋佺紓鍌氬�烽悞锕佹懌闂佸憡鐟ョ换姗�寮婚悢铏圭＜闁靛繒濮甸悘鍫ユ⒑濞茶骞楁い銊ワ躬瀵鈽夐姀鐘靛姶闂佸憡鍔︽禍鏍ｉ崼銏㈢＝濞撴艾锕ョ�氬綊鎮楅惂鍛婂闂佽法鍠嶇划娆撶嵁婢舵劕绠瑰ù锝囨嚀娴滈亶姊洪崜鎻掍簼缂佽瀚伴幃鐑藉Ω閳哄倻鍘介梺闈涚箚閺呮盯鎮橀弻銉︾厵闁告垯鍊栫�氾拷
 * @author changhao
 *
 */
public class CRequestTeamMatch extends __CRequestTeamMatch__ {
	@Override
	protected void process() {
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestteammatch = new mkdb.Procedure()
		{
			@Override
			/*闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸崹楣冨箛娴ｅ湱绋佺紓鍌氬�烽悞锕傗�﹂崶鈺冧笉濡わ絽鍟悡銉╂煟閺傚灝顣抽柣顓熺懇閺屸�崇暆鐎ｎ剛鐦堥梺杞扮劍閹歌崵绮嬮幒鏃撴嫹閿濆骸浜濇繛鍛矒濮婅櫣鍖栭弴鐐测拤闂佸憡姊圭敮鐐烘嚍鏉堛劎绡�婵﹩鍘搁幏娲⒑閸涘﹦鈽夐柨鏇缁骞樼紒妯猴拷鍨叏濡厧甯堕柡瀣ㄥ�濋弻娑㈡偐鐠囇嗗惈闂佽桨鐒﹂幑鍥极閹剧粯鏅搁柨鐕傛嫹 team->roleid->match by changhao*/
			protected boolean process()
			{	
				if (!checkLevel()) //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閻撴瑩鏌熼娑欑凡鐞氭岸姊虹粙娆惧剭闁稿﹥绻堝濠氭偄閻氬瓨瀚归柣銏☆問閻掗箖宕粙搴撴斀闁宠棄妫楁禍楣冩煙閸戙倖瀚�? by changhao
				{
					psend(roleid, new STeamError(TeamError.LevelError));
					TeamManager.logger.debug("FAIL:CRequestTeamMatch闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓缃曢梻浣告惈濞层劍鎱ㄦ搴ｇ焼濠电姴鍊甸弨浠嬫煟濡搫绾ч柟鍏煎姍閺屾稓浠︾拠鎻掝潎闂佸搫鏈ú鐔风暦閻撳簶鏀介柛銉戝懐宕烘繝纰夌磿閸嬬喖骞婇幘璇茬柈闁秆勩仜閿熸枻濡囬幑鍕Ω閿曪拷绾绢垶姊洪幆褏绠版繝锟介柆宥呯妞ゆ牜鍋為埛鎴犵磽娴ｈ鐒介柍鍙ョ窔閺岀喖鎮烽悧鍫濇灎濡ょ姷鍋涢崯浼村箟閹绢喖绀嬫い鎺炴嫹妞ゅ孩鎸剧槐鎾存媴閸撴彃鍓扮紓浣靛姂娴滃爼鐛幇鏉跨妞ゆ棁袙閹峰搫鈹戦鐐殌婵炲眰鍊濋弫鎾绘嚍閵夛妇顦ラ柧鑽ゅ仦缁绘繈妫冨☉鍗炲壈闂佽棄鍟伴崰鏍蓟閺囩喓绠鹃柛顭戝枛婵姊洪崫鍕靛剰闂佸府缍佸濠氭偄閸忕厧锟界粯淇婇婵嗕汗闁伙綁娼ч埞鎴︽倷閼碱剙鈷婇梺鐟板殩閹凤拷 "+roleid);
					return true;					
				}
				
				if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽顐粶缂侊拷婢跺绻嗛柕鍫濇噺閸ｅ湱绱掗悩闈涒枅闁哄瞼鍠栭獮鍡氼槾闁挎稑绉归弻锟犲幢椤撶姷鏆ゅ┑顔硷攻濡炰粙銆佸Δ鍛櫢闁伙絽鐬奸惌鎾绘倵閻㈠憡浜ら柟宄板槻椤繈顢楁径瀣撱劑姊虹捄銊ユ灆婵☆偄瀚划璇差吋婢跺﹦锛熼梻渚囧墮缁夊绮婚悩璇茬闁圭⒈鍘鹃崢婊呯磽瀹ュ棛澧甸柡灞炬礋瀹曠厧鈹戦幇顓壯囨⒑缂佹ɑ灏版繛鑼枛瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷? by changhao
				{
					DSTeamMatchInfo config = ConfigManager.getInstance().getConf(DSTeamMatchInfo.class).get(targetid);
					if (config == null)
					{
						psend(roleid, new STeamError(TeamError.NoTarget));
						TeamManager.logger.debug("FAIL:CRequestTeamMatch:闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倝绠栭弻宥夊传閸曨剙娅ｇ紓浣瑰姈椤ㄥ棙绌辨繝鍥ч柛娑卞枛濞呫倝姊虹粙娆惧剰妞わ缚鍗虫俊鐢稿礋椤栨褔鏌涘☉鍗炵仯闁绘挻妫冨濠氬磼濮橆剨鎷烽幖浣哥９闁绘垼濮ら崐鍧楁煥閺冿拷閹锋繈骞忔搴ｇ當婵炴垶蓱婢跺嫰鏌涚�ｅ墎绡�闁哄本娲樼换娑㈡倷椤掍胶褰熼梻浣芥〃缁�渚�顢栨径鎰摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹 "+roleid);
						return true;					
					}						
				}
				else
				{
					STeamMatchInfo config = ConfigManager.getInstance().getConf(STeamMatchInfo.class).get(targetid);
					if (config == null)
					{
						psend(roleid, new STeamError(TeamError.NoTarget));
						TeamManager.logger.debug("FAIL:CRequestTeamMatch:闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倝绠栭弻宥夊传閸曨剙娅ｇ紓浣瑰姈椤ㄥ棙绌辨繝鍥ч柛娑卞枛濞呫倝姊虹粙娆惧剰妞わ缚鍗虫俊鐢稿礋椤栨褔鏌涘☉鍗炵仯闁绘挻妫冨濠氬磼濮橆剨鎷烽幖浣哥９闁绘垼濮ら崐鍧楁煥閺冿拷閹锋繈骞忔搴ｇ當婵炴垶蓱婢跺嫰鏌涚�ｅ墎绡�闁哄本娲樼换娑㈡倷椤掍胶褰熼梻浣芥〃缁�渚�顢栨径鎰摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹 "+roleid);
						return true;					
					}					
				}
				
				Long clanfightid = xtable.Roleid2clanfightid.select(roleid);
				if (clanfightid != null)//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷鐓庮熆濠靛牊鍤�妞ゎ偅绻勯幑鍕惞鐠団剝袧濠电姷鏁搁崑鐐哄垂閸撲礁鏋堢�广儱顧�缂嶆牠鏌￠崶鈺�绱崇憸鐗堝笒缁�鍌炴煕韫囨艾浜圭紒瀣川缁辨挻鎷呴崫鍕碉拷鎾剁磼閼碱剙浜剧紒宀冮哺缁绘繈宕堕懜鍨珫婵犵數濮撮敃銈夊疮椤愶絼绻嗛柧蹇撴贡绾捐棄霉閿濆娑у┑鈥茬矙閺屻倛銇愰幒鏃傛毇闂佺硶鏂傞崕鎻掝嚗閸曨垰绠涙い鎺戝亞閸熷矂姊绘担鍛婂暈闁告梹鍨垮畷婵嗙暆閿熺晫鍒掔拠鑼殾闁搞儮鏅濋敍婵囩箾鏉堝墽绉い鏇熺墪閳绘捇寮敓浠嬪Φ閸曨垱鏅滈柣鎰靛墯濮ｅ牆螖閻橀潧浠滈柨鏇樺�涢悘鍐⒑閸涘﹣绶遍柛姗�绠栭弫宥呪枎閹剧补鎷虹紓鍌欑劍钃辨い銉ョ墦閺岋繝鏁撴禒瀣劶鐎广儱瀛╅弲鈺呮⒑閹肩偛鍔撮柛鎾村哺閸╂盯骞嬮敂鐣屽幈濠电偞鍨堕敃顐﹀绩婵犳碍鐓熼柟鎹愭硾閺嬫盯鏌＄仦鍓ф创鐎殿噮鍓涢幑鍕Ω瑜岀槐妯衡攽閻愯尙鎽犵紒顔肩Ч楠炲啴宕掗悙顏庢嫹娴ｅ壊娼╅柤绋跨仛濞呫垺绻涚�电孝妞ゆ垵鎳橀幏鎴︽偄閸忚偐鍙嗛梺缁樻礀閸婂湱锟芥熬鎷�? by changhao
				{ 
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 410040, null);
					return true;
				}
								
				Long teamid = xtable.Roleid2teamid.select(roleid);
				
				Team team = null;
				
				final java.util.ArrayList<Long> roleids = new java.util.ArrayList<Long>();
				if(teamid != null)
				{
					team = TeamManager.getTeamByTeamID(teamid);	//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎽傜�ｎ喖鐐婃い鎺嶇贰濡啫鈹戦悙宸殶妞ゆ帟灏欑槐鐐寸瑹閿熻棄顕ｉ锕�绀冩い鏃囧亹閿涙粌鈹戦鏂よ�跨痪顓狀焾鍗辨い鏍仦閳锋帒霉閿濆浂鐒炬い銉ョ箻閺屾稓锟斤綆浜濋ˉ銏拷瑙勬礈婢ф骞嗛弮鍫濐潊闁绘ɑ褰冮～濠囨⒒閸屾艾锟芥悂宕愰幖浣哥９闁归棿绀佺壕褰掓煙闂傚顦﹂柣銈庡枛闇夐柛蹇撳悑缂嶆垹绱掗幇顓ф畼闁跨喕妫勭粻宥夊磿閸楃伝娲晝閸岋妇绋忛梺鍝勬储閸ㄦ椽鎮￠悢鍏肩厵闂侇叏绠戦弸娑㈡煕閺傛鍎旈柡宀嬬秮楠炴﹢宕￠悙鎻掝潛闂傚倸娲らˇ鐢稿蓟閵娿儮鏀介柛鈾�鏅滈埢鎾斥攽閳藉棗浜濋柛銊ユ贡濡叉劙骞掗幘宕囩獮濠电偞鍨堕悷銉╊敂閿燂拷 by changhao
					
					if (!team.isTeamLeader(roleid))
					{
						psend(roleid, new STeamError(TeamError.SelfNOtLeader));
						TeamManager.logger.debug("FAIL:CRequestTeamMatch:濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洤顫忔繝姘唶闁绘柨鍢查獮蹇涙⒑閹稿海绠撴い锔诲灣缁鎮烽幊濠傜秺閺佹劙宕ㄩ鐐剁窡闂備礁缍婂濠氬箯閻戣姤鈷掗柛灞剧懆閸忓瞼绱掗鍛仸鐎殿喖顭锋俊鎼佸煛娴ｅ彨鏇㈡煟鎼搭垳绉甸柨鐔虹摂閸ㄨ京鏁敓鐘靛祦闁搞儺鍓﹂弫鍕煠閹帒鍔存繛鍏兼濮婄粯鎷呯粵瀣秷闂佺楠哥壕顓熺珶閺囥埄鏁囬柣鎰摠閻﹀酣姊婚崒姘拷鐑芥嚄閸洍锟斤箓宕奸姀鈥冲簥闂佺鎻梽鍕疾濠靛鐓忛煫鍥ь儏閿熻姤娲滅划濠氭偐瀹曞洨顔曢梺鐟扮摠閻熴儵鎮炲ú顏呯厸濞达絿顭堥敓钘夋健瀵鈽夐姀鐘插祮闂侀潧顭堥崕濠氬箯閻戣姤鏅查柛娑樺�瑰Λ鍐ㄧ暦閵娾晩鏁婇柟顖嗗啰鐤勯梻鍌氬�风粈渚�骞栭銈嗗珰闁绘劕鎼婵囥亜閺嵮勫櫡闁告梹鍨甸～蹇撁洪鍕獩婵犵數濮寸换鎰板矗閺囥垺鈷戦柣鐔告緲濞堚晠鏌熼崙銈嗗 "+roleid);
						return true;						
					}
					else if (team.getTeamInfo().getMembers().size() >= TeamManager.MAX_MEMBER_COUNT)
					{
						psend(roleid, new STeamError(TeamError.TeamFull));
						TeamManager.logger.debug("FAIL:CRequestTeamMatch:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱婢ь垶鏌嶇紒妯荤闁哄矉缍侀獮姗�宕￠悙鎻捫曢梻浣告惈閼活垳绮旂憴鍕箚闁绘垼妫勬儫闂侀潧锛忛崟闈涙畱闂傚倸鍊风粈渚�骞楀鍫濋棷闁挎洖鍊哥粻顖炴煥閻曞倹瀚� "+roleid);
						return true;						
					}
					
					team.getTeamInfo().setTargetid(targetid);
					team.getTeamInfo().setMinlevel(levelmin);
					team.getTeamInfo().setMaxlevel(levelmax);
					
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐婵犵绻濆褔锝炲鍫熸櫢濞寸姴顑呯粻鏍煟閹邦喖鍔嬮柡鍛矒閺屻倝骞侀幒鎴濆闂佺粯绻勯崗姗�骞冨Δ鍛祦闁割煈鍠栨慨搴☆渻閵堝繐鐦滈柛銊﹀▕閺佹捇鎳為妷銊ヮ棟濡炪倧瀵岄崹鍫曞灳閿旂偓宕夐柕濠忕畱绾绢垱绻涢幘鏉戝毈闁搞劏椴搁弲銉╂⒒閸屾瑧鍔嶆俊鐐村缁傚秹鎮滈挊澶岊唵闂佽法鍣﹂幏锟�  by changhao
					roleids.addAll(team.getAllMemberIds());
					this.lock(xtable.Locks.ROLELOCK, roleids);
				}
				else
				{
					roleids.add(roleid);
				}
				
				Long roleidteamId = xtable.Roleid2teamid.get(roleid);
				if (teamid != roleidteamId)
				{
					psend(roleid, new STeamError(TeamError.UnkownError));
					TeamManager.logger.debug("FAIL:CRequestTeamMatch:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲ㄩ崰鎾跺姬閿熶粙姊哄Ч鍥х仼闁诲繑宀搁幃娆撳箳濡や讲鎷婚梺绋挎湰閻熝囁囬敃鍌涚厵缁炬澘宕禍浼存煙椤斻劌娲ら獮銏＄箾鐎涙ɑ绶叉繛宸弮閵嗕礁鈽夊Ο閿嬫杸闂佸憡娲︽禍婵嬫儓韫囨挴鏀介柣姗嗗枛閻忛亶鏌涢埡鍌滃⒌鐎规洘绻堝鎾偐閻㈢數鍔堕梻浣芥硶閸ｏ箓骞忛敓锟�? "+roleid);
					return true;
				}
				
				if (!checkTeamState(team, roleid)) //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閳锋帡鏌涢銈呮瀻闁告鍏橀弻銊モ攽閸♀晜效闂佸搫鎳忕划鎾诲蓟閿曪拷铻ｅ〒姘煎灡閳绘捇姊洪幖鐐诧拷鎴﹀磹濠靛绠栨俊銈呮噽瀹撲線鏌涢…鎴濇灈濠殿喖楠搁埞鎴︽倷閼碱剚鍕鹃梺绋匡攻椤ㄥ﹪骞冮悿顖ｆ▌濠殿喖锕︾划顖炲箯閸涘瓨鍊绘慨妤�妫旈幋鐑芥⒒娴ｇ儤鍤�闁搞倖鐗犻獮蹇涙晸閿燂拷? by changhao
				{
					psend(roleid, new STeamError(TeamError.TeamStateError));
					TeamManager.logger.debug("FAIL:CRequestTeamMatch缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗘搐閻ㄦ垿鏌熷畡鏉挎Щ妞ゎ偅绻堥、姗�鎮㈤崫鍕闂備礁鎲￠〃濠冪閸洖钃熼柕濞炬櫅閸楁娊鏌ｉ幇顖ｅ殝闁归鍏樺畷顐﹀Ψ瑜忛悞濂告倵閻у憡瀚归梺璺ㄥ枍缁瑩鐛径鎰濞达絿鎳撴禍閬嶆⒑閸撴彃浜濈紒璇插閹兘濡搁埡鍌滃幗闂侀潧绻嗛弲娑㈡倶閳ユ枼鏀介柣鎰嚋闊剚顨ラ悙鎻掓殭閾绘牠鏌涘☉鍗炵仩缂佷緤绠撳娲礈閼碱剙甯ラ梺鍝ュУ绾板秶绮嬮幒鎾卞亝闁告劏鏂侀幏铏圭磽娓氬洤鐏℃繛鍙壝埢宥夊幢濞嗘垹锛滈柣搴秵閸嬪懐浜搁悽鍛婄厱闁圭儤鎸稿ù顕�鏌涢埡瀣瘈鐎规洦浜濋幏鍛喆閸曨剛褰ㄦ繝鐢靛Х閺佹悂宕戦悙鍝勫瀭闁割偅娲橀崑锛勬喐閺冨牆绠栭柛褎顨嗛弲绋棵归悩宸剱闁抽攱甯掗湁闁挎繂鎳忛崯鐐烘煕閻斿搫浠遍柡灞革拷宕囨殕閻庯綆鍓涢惁鍫ユ⒑鏉炴壆鍔嶉柟鐟版搐閻ｇ兘骞囬悧鍫濅簻闂佸憡绺块崕鍗炩槈瑜斿缁樻媴閾忕懓绗＄紓浣告惈濞尖�崇暦閹版澘鍗抽柕蹇曞Х閸欙拷濠电姰鍨奸崺鏍礉閺囩姷涓嶉柤濮愬�ч幏椋庢喆閸曨剛顦ュ┑鐐差檧缁犳挻鎱ㄩ敓浠嬫煏閸繃顥犻柛姗�娼ч—鍐Χ閸℃﹩姊挎繝娈垮枔閸婃绂嶉幖渚囨晣闁绘梻绻濈花璇差渻閵堝棗濮﹂柛鎾存皑閿熻姤鐔幏锟�? "+roleid);
					return true;
				}
				
				if (!checkTeamMemberNum(team)) //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閳锋帡鏌涢銈呮瀻闁告鍏橀弻銊モ攽閸♀晜效闂佸搫鎳忕划鎾诲蓟閿曪拷铻ｅ〒姘煎灡閳绘捇姊洪幖鐐诧拷鎴﹀磹濠靛绠栨俊銈呮噽瀹撲線鏌涢…鎴濇灈濠殿喖閰ｉ弻锝嗘償閵忕姴姣堥梺鍛婄懃閸熸挳鐛崱娑樼倞闁靛ě灞剧カ闂佽鍑界紞鍡涘磻閸℃稑鍌ㄩ柟闂寸劍閳锋垿鎮归幁鎺戝婵炲懏鍔欓弻鐔煎礄閵堝棗顏�? by changhao
				{
					psend(roleid, new STeamError(TeamError.TeamEnoughFull));
					TeamManager.logger.debug("FAIL:CRequestTeamMatch闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱婢ь垶鏌嶇紒妯荤闁哄本鐩幃銏ゆ煥鐎ｎ亝鐣婚梻浣告惈鐞氼偊宕愬Δ鍛獥濠电姴娲ょ涵锟介梺缁樺姇濡﹤顭囨ィ鍐┾拻濞达絽婀卞﹢浠嬫煕鎼淬劋鎲炬鐐诧躬楠炲洭顢欑粵瀣稐闂備浇顫夐崕鎶芥偤閵婏箑鍨旈悗闈涙憸绾惧ジ鎮楅敐搴′航闁稿簺鍎遍湁闁绘宕甸悾娲煙椤旂瓔娈旈柍缁樻崌瀹曞綊顢欓悾灞借闂傚倷鑳堕幊鎾诲吹閺嶎厼绠柨鐕傛嫹 "+roleid);
					return true;												
				}
				
				if (!checkFaction(roleid)) //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閳锋帡鏌涢銈呮瀻闁告﹢鏀辩换娑㈠箣濞嗗繒鍔撮梺杞扮濡繈寮婚妸鈺傚亜闁绘垶蓱閻濐亪姊洪崨濠勬嚂闁瑰嚖鎷�? by changhao
				{
					psend(roleid, new STeamError(TeamError.NoFaction));
					TeamManager.logger.debug("FAIL:CRequestTeamMatch婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ婢舵劖鐓ユ繝闈涙閸ｈ銇勯妷銉х闁哄本鐩幃銏ゆ煥鐎ｎ亝鐣婚梻浣告惈閺堫剙煤濡警鍤楅柛鏇ㄥ灠闁卞洦绻濋崹顐ｅ鞍閻庢俺顫夋穱濠囧Χ閸涱厽娈堕梺缁樼矊椤兘寮婚妸鈺傚亞闁稿本绋戦锟� "+roleid);
					return true;					
				}
				
				if (!checkActiveTime()) //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閻撴瑧绱撴担濮戭亝绌遍娑氱闁圭偓鍓氶悡濂告煛鐏炲墽顬兼い锕佹珪閵囧嫰濡搁妷锕�娅х紓渚囧枛閻楀﹤顕ラ崟顖氱疀妞ゆ挾濮寸敮鎯р攽閻樺灚鏆╅柛瀣洴閹ê鈹戠�ｎ亞顦梺闈涚墕濞层劌螞椤栫偞鐓欐い鏍ф閻ジ宕ョ�ｎ喗鈷戦柛婵嗗閻掕法绱掔紒妯肩疄鐎殿噮鍋婇獮妯硷拷闈涘濞村嫰鏌ｆ惔顖滅У闁稿瀚伴弫鎾寸鐎ｎ偅鏆犻梺闈涙搐鐎氫即鐛幒鎴悑闁搞儺浜為悰銉︾節绾版﹫鎷烽搹顐熸灆闂佹悶鍔忓▔娑綖韫囨梻绡�婵﹩鍓涢敍婊堟⒑閹稿孩顥嗘俊顐㈠椤㈡棃鏁撻敓锟�? by changhao
				{
					psend(roleid, new STeamError(TeamError.ActiveNotOpen));
					TeamManager.logger.debug("FAIL:CRequestTeamMatch婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ鍝勬倎闁绘帒锕ラ妵鍕疀閹捐泛鈷堥梺杞扮椤戝洭骞夐崨濠冨劅闁靛鍎抽悿鍕⒑闂堟单鍫ュ疾濞戙垺鍋傛繛鎴欏灪閻撴洘绻涢幋婵嗚埞妤犵偞鐗犻弻锝呪攽閸ゅ壊浜垾鏃堝礃椤斿槈褔鏌涘☉鍗炵仯妞ゆ柨娲弻锝嗘償閵忕姴姣堥梺鍝ュУ绾板秶绮╅悢鐓庡嵆闁绘棁娅ｉ惁鍫濃攽椤旀枻渚涢柛姗�绠栧畷銏ゅ箹娴ｅ厜鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷? "+roleid);
					return true;						
				}
				
				/*if (fire.pb.buff.Module.existState(roleid,
						BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
					psend(roleid, new STeamError(TeamError.SelfInUnteamState));
					TeamManager.logger.debug("FAIL:闂傚倸鍊搁崐鎼佸磹妞嬪孩顐芥慨姗嗗墻閻掍粙鏌ゆ慨鎰拷鏍拷姘煼閺岋綁寮崒姘粯缂備緤鎷峰鑸靛姈閸婂爼鏌ｉ幇顓炵祷闁抽攱妫冮弻锝呪攽閸℃瑥鐓熼梺鍝勬湰閻╊垱淇婇悜绛嬫晩闁绘挸瀵掑濠氭⒑鐠囨彃顒㈤柤褰掔畺钘濆ù鍏兼綑妗呴梺鍛婃处閸ㄦ壆绮婚敐澶嬬叆婵犻潧妫欓崳鐟扳攽椤旀儳鍘存慨濠冩そ瀹曘劍绻濊箛搴ｈ繑闂備礁鎲￠幐楣冨窗閺嵮屽殨閻犲洦绁村Σ鍫ユ煏韫囧﹤澧叉繛鍛灲濮婅櫣鎹勯妸銉︾彚闂佺懓鍤栭幏锟�? "+roleid);
					return true;
				}*/

				if (checkPvP(roleid) != 0) {
					return true;
				}

				addTeamMatch(roleid, roleidteamId); //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸崹楣冨箛娴ｅ湱绋佺紓鍌氬�烽悞锕佹懌闂佸憡鐟ョ换鎺楁晸閸婄噥娼愭繛鍙夌墪鐓ら柕濞炬櫅绾拷濠殿喗顭堥崺鏍磹閸偆绠鹃柟瀵稿仧閹虫劙鏌ｉ幒宥囩煓闁哄苯绉剁槐鎺懳熼悜鈺傚闂備線娼уú銈囷拷姘煎灣缁鈽夐姀鐘殿啋闂佸綊顣﹀鎺楀箖閿濆鈷掑ù锝堟鐢盯鏌ｅΔ鍐ㄐｇ紒鍌氱Ф閹瑰嫭绗熼娑氱▉婵犵數鍋涘Ο濠冪濠婂懐妫憸鏃堝箖瑜版帒绠掗柟鐑樺灥椤ュ酣姊洪棃娑氱疄闁稿﹥鐗犻幃锟犲即閵忥紕鍘撻柡澶屽仦婵粙宕楀畝鍕厽闊洦绋愰幉楣冩煛瀹�锟介崰鏍�佸璺哄耿婵☆垯璀︽导锟�? by changhao
								
				SRequestTeamMatch msg = new SRequestTeamMatch();
				msg.levelmin = levelmin;
				msg.levelmax = levelmax;
				msg.targetid = targetid;
				msg.typematch = typematch;
				
				for (Long roleid : roleids)
				{
					mkdb.Procedure.psendWhileCommit(roleid, msg);					
				}
				
				return true;
			}
			
		};
		requestteammatch.submit();	
	}
	
	private void addTeamMatch(long roleid, Long teamid)
	{
		xbean.TeamMatch teammatch = xbean.Pod.newTeamMatch();
		
		teammatch.setRoleid(roleid);
		teammatch.setLevelmin(this.levelmin);
		teammatch.setLevelmax(this.levelmax);
		teammatch.setTargetid(this.targetid);
		teammatch.setMatchtype(typematch);
		teammatch.setOnekeytimestamp(0);
		teammatch.setTimestamp(0);
		
		TeamManager.getInstance().addTeamMatch(teammatch, teamid);			
	}
	
	private boolean checkTeamState(Team team, long roleid) //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜閻犱警鐓夐幏椋庢喆閸曨剛顦ュ┑鐐茬湴閸婃繂鐣烽悷鎵虫斀闁割偒鍓氱�氳顨ラ悙鑼虎闁告梹纰嶉妵鍕晜閸喖绁梺绯曟櫆閻╊垶鐛Ο鑲╃＜婵☆垳鍘ч獮妤呮⒒娴ｅ憡鎯堥柛濠傛贡閿熺晫鐟抽崶褏鐣鹃梺鍓插亖閸ㄨ崵绮婚弮鍫熺厵閺夊牓绠栧顕�鏌嶉柨瀣伌闁诡喖缍婂畷鍫曟晲韫囨柨顏堕梺鍛婂姈瑜板啰绮婚幍顔剧＝闁稿本鐟х粵蹇涙煙瀹勬澘妲婚柕鍡樺笒椤繈鎮欓锟介鑸典繆閵堝洤啸闁稿绋撻幑銏狀潨閿熶粙鎮伴纰卞悑濠㈣埖蓱閺咁亪姊虹化鏇炲⒉闁挎碍銇勮箛姘【閾绘牠鏌ｅ锟藉褎绂掑鍫熺厽闊洦姊荤粻鐐烘煙椤旀枻鑰挎い銏℃瀹曞ジ鎮㈤崫鍕疄闂傚倷绀侀崯鍧楀箹椤愶箑纾瑰┑鐘宠壘杩濋梺鍦劋濮婅崵澹曢崗绗轰簻闁哄啫娴傚鎰箾閸涱叏鏀婚柕鍥у婵拷闁挎稑瀚уΣ鍫ユ⒑鐎圭姵顥夋い锔诲灦閸┿垹顓兼径瀣粡闁诲酣娼ч幗婊堝汲閵堝鈷戦柛婵嗗濠�鎵磼鐎ｎ偄鐏撮柨婵堝仜閳规垹锟斤綆浜為ˇ顓㈡偡濠婂啰绠荤�殿喗濞婇幃鈺冪磼濡厧骞楅梻濠庡亜濞诧箓骞愰懡銈囩焿閻庯綆鍠楅悡鏇㈡煥濠靛棛绠崇紒澶樺枤閿熻姤顔栭崰鏍�﹂悜钘夋瀬闁瑰墽绮弲鎼佹煥閻曞倹瀚�? by changhao
	{
		if (this.typematch == 0 && team == null)
		{			
			return true;
		}
		
		if (this.typematch == 1 && team != null)
		{
			return team.isTeamLeader(roleid);
			
		}
		
		return false;
	}
	
	private boolean checkLevel() //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閻撴瑩鏌熼娑欑凡鐞氭岸姊虹粙娆惧剭闁稿﹥绻堝濠氭偄閻氬瓨瀚归柣銏☆問閻掗箖宕粙搴撴斀闁宠棄妫楁禍浠嬫煕閵婏箑鈻曟鐐差槸椤垹鐣濋敓浠嬫偪閿熶粙姊洪悷鏉跨稏婵炴潙娲敐鐐村緞婵犲骸娈梺鍛婃处閸ㄦ壆绮诲☉娆嶄簻闁圭儤鍨垫禍鐐翠繆瀹割喖鐏︽慨濠勭帛閹峰懐绮电�ｎ偆绉烽梻浣侯焾妤犳悂宕ョ�ｎ喖绠為柕濞炬櫅鍥存繝銏ｆ硾閿曪箓寮昏濮婃椽宕橀崣澶嬪創闂佺懓鍟跨换妯虹暦閹达附鏅插璺侯儑閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷? by changhao
	{
		if (this.levelmin > this.levelmax)
		{
			return false;
		}
		
		if (this.levelmin <= 0 || this.levelmax <= 0)
		{
			return false;
		}
		
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愯ぐ鎺戠；閻庯綆鍠楅悡鐔兼煙闁箑澧柟顖氱墛濞艰鈹戠�ｎ偀鎷洪梺鍛婄☉閿曘倖鎱ㄩ敃鍌涚厱闁绘ê纾晶鐢碉拷娈垮枛閹诧紕绮悢鍏兼櫢濞寸姴顑呴拑鐔兼煥濠靛棙鍟掗柡鍐ㄧ墛閺呯霉閻樺樊鍎愰柛瀣儔閺屾盯鍩勯崘顏呭櫘闂佹椿鍘奸悧鎾诲蓟閵娾晛绫嶉柨鐔剁矙瀹曠懓鈹戦崼鐔峰簥闂佺硶鍓濈粙鎺楁偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閻撴瑧绱撴担濮戭亪宕归崒鐐寸叆婵犻潧妫Σ鍝ョ磼閻樺灚鍤�闂囧鏌ㄥ┑鍡橆棤闁硅棄鍟伴幃顔尖攽鐎ｎ偀鎷绘繛杈剧悼閹虫捇顢氬鍕闁告瑥顦悘鈺冪磼椤旇偐澧涚紒妤冨枛閺佹挻绂掔�ｎ亞鐣炬繛鎾寸啲閹风兘鏌＄仦鑺ヮ棞妞ゆ挸銈稿畷鍗炩枎韫囨挾鐤勯梻鍌氬�风欢姘焽瑜旂瘬闁跨喍绮欏濠氬礋椤愩埄浼�缂備浇浜崑銈夌嵁鐎ｎ喗鏅滈柣锝呰嫰楠炲牓姊绘担铏瑰笡闁搞劑娼х叅闁挎梹鎷濋幏宄邦潩閻愵剙顏� by changhao
		
		return true;
	}
	
	private boolean checkTeamMemberNum(Team team) //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閻撴稑顭跨捄鐚存敾婵炲懎娲ㄩ幉鍛婃償閳藉棗娈梺鍛婃处閸ㄦ壆绮诲☉娆嶄簻闁瑰搫绉烽崗宀勬煥閻斿憡鐏柟鍑ゆ嫹? by changhao
	{
		return true;	
	}
	
	private boolean checkFaction(long roleid) //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閳锋垶銇勯幒鐐村缂備礁顦伴幐鎶藉箚鐏炶娇鏃堝川椤旀儳骞愰梻浣规偠閸庮噣寮插☉銏犲嚑閹肩补鍋撴禍婊堟煛閸ラ绡�闁告繃妞介弻鐔哥瑹閸喖顬堥柧浼欑秮閺屾稖顦虫い銊ユ嚇楠炴鎮介悽鐢碉紳婵炶揪缍侀ˉ鎾诲礉瀹ュ鐓熼柟鍨缁★拷閻庢鍠涢褔鍩ユ径鎰潊闁斥晛鍟鐔兼⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�? by changhao
	{
		return true;
	}
	
	private boolean checkActiveTime() //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閻撴瑧绱撴担濮戭亝绌遍娑氱闁圭偓鍓氶悡濂告煛鐏炲墽顬兼い锕佹珪閵囧嫰濡搁妷锕�娅х紓渚囧枛閻楀﹤顕ラ崟顖氱疀妞ゆ挾濮寸敮鎯р攽閻樺灚鏆╁┑顔碱嚟閹广垹螣娓氼垳锟借埖銇勯弬娆炬綗濞存粍绮撻弫搴㈢節濮橆剛鍊為梺闈涱焾閸ㄨ櫣锟芥矮绮欏缁樻媴閼恒儳銆婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�? by changhao
	{
		
		return true;
	}

	// 婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佲枙闁绘帟濮ょ换娑㈠幢濡纰嶉梺缁樻尰閿曘垽寮婚悢鐑樺磯妞ゎ厽鍨堕锟�
	private static int checkPvP(long roleId) {
		// 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜堕弫鍥煏韫囨洖啸闁告繃顨婂缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閺囥垹绠ｆ繝銏＄箓缂嶅﹪骞冮埄鍐╁劅闁挎繂妫欓崰鏍⒒娴ｈ鍋犻柛濠冩礋閺佸啴濡烽埡浣勶箓鏌涢弴銊ユ灓闁汇倧鎷烽梻浣告贡閸嬫捇宕滃顓狀浄濠靛倸鎲￠崑鐘虫叏濡搫鑸归柡瀣♁閹便劍绻濋崘鈹夸虎閻庤娲忛崝宥囨崲濠靛绀嬫い鎰枎閹懐绱撻崒姘拷鎼佸磹閸濄儳鐭撻柟缁㈠枟閺呮繃銇勮箛鎾愁伀闁哄棴绠撻弻鏇＄疀鐎ｎ亷鎷烽弽顓炵柧闁归棿鐒﹂悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�
		return fire.pb.battle.pvp.PvPTeamHandle.onRequestTeamMatch(roleId);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794494;

	public int getType() {
		return 794494;
	}

	public int typematch; // 类型为0是个人组队匹配1是队伍匹配 by changhao
	public int targetid; // 目标id by changhao
	public int levelmin; // 等级下限 如果是个人匹配这个忽略 by changhao
	public int levelmax; // 等级上限 如果是个人匹配这个忽略 by changhao

	public CRequestTeamMatch() {
	}

	public CRequestTeamMatch(int _typematch_, int _targetid_, int _levelmin_, int _levelmax_) {
		this.typematch = _typematch_;
		this.targetid = _targetid_;
		this.levelmin = _levelmin_;
		this.levelmax = _levelmax_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(typematch);
		_os_.marshal(targetid);
		_os_.marshal(levelmin);
		_os_.marshal(levelmax);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		typematch = _os_.unmarshal_int();
		targetid = _os_.unmarshal_int();
		levelmin = _os_.unmarshal_int();
		levelmax = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestTeamMatch) {
			CRequestTeamMatch _o_ = (CRequestTeamMatch)_o1_;
			if (typematch != _o_.typematch) return false;
			if (targetid != _o_.targetid) return false;
			if (levelmin != _o_.levelmin) return false;
			if (levelmax != _o_.levelmax) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += typematch;
		_h_ += targetid;
		_h_ += levelmin;
		_h_ += levelmax;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(typematch).append(",");
		_sb_.append(targetid).append(",");
		_sb_.append(levelmin).append(",");
		_sb_.append(levelmax).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestTeamMatch _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = typematch - _o_.typematch;
		if (0 != _c_) return _c_;
		_c_ = targetid - _o_.targetid;
		if (0 != _c_) return _c_;
		_c_ = levelmin - _o_.levelmin;
		if (0 != _c_) return _c_;
		_c_ = levelmax - _o_.levelmax;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

