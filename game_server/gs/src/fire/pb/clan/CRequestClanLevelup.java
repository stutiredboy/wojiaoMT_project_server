
package fire.pb.clan;

import java.util.ArrayList;
import java.util.List;

import fire.log.beans.ClanBuildUPBean;
import fire.log.beans.FactionOpbean;
import fire.pb.clan.srv.ClanManage;
import fire.pb.clan.srv.ClanRank;
import fire.pb.talk.MessageMgr;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestClanLevelup__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRequestClanLevelup extends __CRequestClanLevelup__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		/***
		 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鍨傚Δ锝呭暙缁犳稑霉閿濆懏璐＄紒瀣╄兌缁辨捇宕掑顒婃嫹閻戣姤鍊块柨鏇炲�甸敓鏂ょ畵瀹曞爼鍩￠崘褏鐟濆┑掳鍊х徊浠嬪疮椤栫偞鍋傞柕澶嗘櫆閻撶喖鏌￠崒姘变虎妞わ絾濞婇弻锝夘敇閻旂儤鍣伴梺鍝勫閿熻棄纾弳鍡涙倵閿濆骸澧伴柣锕�鐗撳鐑樻姜閹殿喖濡介梺瑙勭摃瀹曠數鍒掔�ｎ喖绠抽柡鍐╂尰鐎氬綊鏌ㄥ┑鍡涱�楀ù婊勭箖缁绘盯宕ㄩ鍓х厜濠殿喖锕ㄥ▍锝夊礌閺嶎厼鍗抽柣鎰ゴ閹枫倝姊绘担鍛婂暈婵﹤婀遍弫顕�鎮欓悜妯烘疅闁哄鐗勯崝搴ｅ姬閿熻棄鈹戦鏂や緵闁告ɑ鎮傞獮蹇撁洪鍛嫼闂佸憡绋戦敃锕傚煡婢舵劖鐓ラ柡鍥朵簻椤╊剛绱掗纰辩吋妤犵偞顭囩槐鎺懳熼悮瀛樺闁割煈鍋呴崣蹇斾繆椤栨粌甯堕悽顖氱埣閺岋紕锟斤絻鍔岄敓鑺ョ箞瀵鈽夐姀鈥充汗闁荤姴娉ч崘褏鐭楅梻鍌欐缁鳖喚绱為崶鈺傚床婵犻潧顑呯粻鏍煟閹邦噮鏆滈柟鐑筋棑閹叉挳宕熼锝嗘瘓ion2->role by changhao
		 */
		mkdb.Procedure requestfactionlevelup = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				SClanLevelup sClanLevelup = new SClanLevelup();
				
				Long factionid = xtable.Roleidclan.select(roleid);
				xbean.ClanInfo clan = xtable.Clans.get(factionid);
				
				if (clan.getClanmaster() != roleid && clan.getClanvicemaster() != roleid)
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 150127, null);
					return true;
				}
				
				int money = clan.getMoney();
				int uplevel=0;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯弴鐐搭棡閻庢艾缍婇弻娑㈠箛闂堟稒鐏堥悗鐟版啞缁诲啴濡甸崟顖氱闁瑰瓨绻冮崐顖氣攽閿涘嫬浠╁┑顔哄�栫粚杈ㄧ節閸パ咁啇婵炶揪缍�椤鈻嶉崱娆戠＝闁稿本鐟ч崝宥夋煥閺囨娅婄�规洦鍨伴鍏煎緞鐎Ｑ勫濠电偠鎻紞锟芥い顐㈩樀瀹曟垿鎮╃紒妯煎幈闁瑰吋鐣崹娲Φ濠靛牞鎷风憴鍕缂侇喖鐭傞崺銏℃償閵娿儳顓洪梺缁樺姇瀵爼鎮楅銏♀拻濞达絿鎳撻婊勭箾閸欏澧电�规洘鍔欏畷顐﹀Ψ瑜岀粭澶愭偡濠婂懎顣奸悽顖涘笧閻ヮ亣顦归柡灞剧洴椤㈡洟鏁愰崶鈺冩殼闂備焦濞婇弨鍗烆潖閼姐倖顫曢柟鐑樻閹风兘鏁愭惔婵囧枤闂佺粯鎸搁妶鎼佸蓟閳ュ磭鏆嗛悗锝庡墰琚﹂梻浣芥〃閻掞箓宕濆▎蹇曟殾闁绘挸瀵掗悡銉╂煕閹般劍娅呴柛鎾舵暩缁辨捇宕掑顒婃嫹瀹勬噴褰掑炊閵婏絼绮撻梺鍛婄缚閸庢煡寮冲鍫熺厵闁绘垶锕╁▓鏃堟煟閹绢垽鎷烽幇浣哄數闁荤姾妗ㄧ拃锕傛偂椤掍胶绠剧紒妤�鎼慨鍌炴煛鐏炲墽娲撮柛鈺佸瀹曟﹢宕滆婵爼姊绘笟锟藉褔鈥﹂鐘电＝婵椴稿畷鏌ユ煕閳╁啰鈾侀柣鎾崇箻閺屾盯顢曢敐鍥╃暫闂佺懓鍚嬮崝鏍Φ閸曨剚鍎熼柕蹇婏拷宕囷紦闂備礁鎼惉濂稿窗閺嵮呮殾婵炲棙鎸稿洿闂佺硶鍓濋〃蹇斿閿燂拷
				int cost=0;//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鏁愭径濠庢綂闂佺粯锚閸熷潡寮抽崼銉︹拺缂佸顑欓崕蹇斻亜閹存繍妯�鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�??
				int opid=0;//
				if (id == ClanManage.Lobby) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉骞夐幖浣瑰亱闁割偅绻勯悷鏌ユ⒑缁嬫鍎忔い锔炬暬瀵寮撮敍鍕澑闁诲函缍嗘禍鐑藉箯閻戣棄鍗抽柣妯兼暩閻掑ジ姊洪崨濠傚Е闁哥姵顨婇幃陇绠涢幘顖涙杸闂佺粯顭堢亸娆戠不閻楀牄浜滈柍鍝勶工婢ф挳鏌＄仦鐐鐎规洖宕灒闁告繂瀚峰姘節濞堝灝鏋涢柨鏇閸掓帡顢涢悙鑼唵闂佸憡绋掑娆忣啅濠靛棌鏀介柣妯诲絻閿熺晫鎳撻埢鎾澄熺拋宕囩畾闂佺粯鍔︽禍婊堟晸閼恒儱鐏寸�规洘绻傞悾婵嬪礋椤愩倗鏋冮梺纭呭閹活亞寰婇挊澶樺殨闁哄被鍎查埛鎺戙�掑鐐濠电偘鍖犻崶锝忔嫹閿曞偆鏁囬柣娆忔噺鐎氬綊姊婚崼鐔侯灱閻庢矮鍗抽弻宥囩磼濡闉嶇紓浣稿�圭敮鐐烘晸閺傘倗绉甸柛瀣瀹曪綁宕卞☉娆屾嫼缂傚倷鐒﹁摫缂侊拷閿熶粙姊虹粙鍖″伐婵狅拷闁秵鏅搁柤鎭掑劤閸熸煡鏌熼崙銈嗗 by changhao
				{
					int level = clan.getClanlevel();
					int sumlevel = 0;
					sumlevel += clan.getHouse().get(ClanManage.GoldBank);
					sumlevel += clan.getHouse().get(ClanManage.DrugStone);
					sumlevel += clan.getHouse().get(ClanManage.Hotel);

					fire.pb.clan.SClanLobby lobby =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanLobby.class).get(level);
					if (lobby == null)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 143583, null);
						return true;
					}
				
					fire.pb.clan.SClanLobby l =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanLobby.class).get(level + 1);
					if (l == null) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喖顭烽弫鎰緞婵犲嫷鍚呴梻浣瑰缁诲倸螞椤撶倣娑㈠礋椤撶姷锛濇繛鎾磋壘閿曘儳锟芥艾缍婂铏圭矙閹稿孩鎷辩紓浣割儐鐢�崇暦閿濆牏鐤�闁哄倸澧界粻姘舵⒑闂堟稓澧曢柟宄邦儔瀹曟洟骞囬悧鍫濓拷鍨叏濮楀棗澧扮紒澶嬫そ閺岀喖顢欑粵瀣暭闂佺懓寮堕幐鍐茬暦閻旂⒈鏁嗛柛灞诲�栬ⅷ闂傚倸鍊烽悞锔撅拷绗涘懎鏋堢�广儱顦闂佸憡娲﹂崹鎵不婵犳碍鐓熼柟閭﹀灡椤ュ霉閻欙拷閸ｏ綁骞冨Δ鍐╁枂闁告洦鍓涢敍姗�姊洪崨濠冣拹闁搞劌娼℃俊瀛樻媴閸撳弶寤洪梺璺ㄥ枍缁瑩鐛崘顕呮晜闁割偅绻傜粣娑橆渻閵堝棛澧柛鎴犳嚀鍗遍弶鍫涘妿缁★拷闂佹眹鍨藉褍鏆╅梻浣芥〃閻掞箓骞冮崒姘辨殾闁硅揪闄勯崑鎰版偣閸ヮ亜鐨烘い鏂胯嫰椤啴濡堕崨顖滎唶闂佺粯顨呭Λ娑氬垝婵犳凹鏁嶉柣鎰嚟閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷? by changhao
					{
						java.util.ArrayList<String> args = new java.util.ArrayList<String>();
						Integer s = level;
						args.add(s.toString());
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160226, args);
						return true;						
					}
					
					int sum = lobby.othersum;
					if (sumlevel < sum) //闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绉柡灞诲姂瀵噣宕堕…鎴烆棄闂備浇娉曢崰鏇炍涢崟顐劷闁跨喓濮撮拑鐔兼煏婵炵偓娅呴柛妤佸▕閺岋綁骞囬锝呮疂闂佸綊顥撻弻澶愬Φ閹版澘绠抽柟瀵稿缁辩敻姊绘担渚敯闁规椿浜浠嬪礋椤栨稑浜楅梺缁樻閺呰尙鎹㈤崱娑欑厪闁割偅绻勭粻鏌ユ倵濮橆剛绉烘慨濠呮缁辨帒顫滈崱妯兼殽缂傚倷鑳剁划顖炴晝閵忕姷鏆︽繛宸簻椤懘鏌曢崼婵囧櫧闁活偄瀚板铏圭矙鐠恒劎鍔归梻鍌氬鐎氼噣鏁撻懞銉や孩妞ゎ偄顦甸妴鍐Ψ閳哄倸锟界兘鏌ょ喊鍗炲幐闁惧繐閰ｅ娲川婵犲啠鎷归悗鐧告嫹闁归棿绀侀拑鐔兼煟閺冨牜妫戦柡鍡楊儔濮婃椽顢橀妸褏鏆犻梺鍛婃尰濠㈡﹢鈥旈崘顔嘉ч幖绮癸拷鎰佹交闂備焦瀵уú锔界椤忓嫷鍤曟い鎰剁畱缁犺崵绱撴担鑲℃垵鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚� by changhao
					{
						//java.util.List<String> parameters = new java.util.ArrayList<String>();
						//parameters.add(attr.name);
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160225, null);
						return true;
					}
				
					if (money < ClanUtils.getBuildLevelupMax(clan).get(ClanManage.Lobby)) //闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡宀嬬秮婵拷闁靛繆鏅濋崝鍝ョ磽娓氬﹥瀚规繝銏ｅ煐閸旀牠鎮￠妷鈺傜厸闁搞儮鏅涙禒婊堟煥閻旂粯顥夐柟鑺ョ矌閸掓帡鏁愰崨鍌涙瀹曘劑顢欓幆褍绠伴梺璇查缁犲秹宕曟潏顭戞闁告縿鍎查弳婊堟煟閹邦喖鍔嬮柣鎾存礋閺屾洘寰勫Ο鐑樼亪婵犫拃鍐剧吋闁哄备鍓濋幏鍛村川婵犲孩锛嗛梻浣告惈閺堫剟鎯勯姘煎殨闁圭虎鍠栨儫闂侀潧顦崕鍝勵焽婵犳碍鈷掑ù锝呮啞閸熺偤鏌熺亸鏍ㄦ珚鐎规洩缍佸畷姗�鈥﹂幋鐐电▉婵犵數鍋涘Ο濠冪濠婂喚鍟呮繝闈涙閺�浠嬫煟濡绲婚柡鍡樼懄閵囧嫰鏁傜憴鍕彋濠殿喖锕ュ浠嬬嵁閺嶎厽鍊烽柟缁樺俯閻庡瓨绻濋悽闈浶為柛銊︽そ閺佸啴濮�閵堝懏妲梺闈涚箳婵參宕ョ�ｎ亶鐔嗛悹鍝勩偨閿熺姴鐓涢柛娑卞枤閸樻捇姊洪崨濠勭畵閻庢凹鍓熼弫鎾绘偩鐏炵偓姣堝Δ鐘靛仜缁绘劗鍙呭銈呯箰閹冲骞忓ú顏呪拺闁稿繘妫块懜顏堟煕鎼达紕效妞ゃ垺妫冨畷铏规崉閻戞ê鏋犲銈冨灪缁嬫垿鈥﹂妸鈺佸窛妞ゆ牭绲剧瑧濠电姷鏁搁崑鐘诲箵椤忓棛绀婇柨鐔诲Г缁绘盯宕崘顏呭仹婵犮垼顫夊ú鐔风暦濡ゅ懏鈷掗悗闈涙憸閻ｉ箖姊绘笟锟藉褔鎮ч崱娆愬床闁瑰濯撮幏宄邦潩鏉堛劌娈屽銈庝簻閸熷瓨淇婇幆鎵杸闁哄洨濮靛▓鐓庘攽閻愯尙鎽犵紒顔肩焸閹儲绺介崨濠備粧濡炪倖娲╅幏椋庯拷娈垮枙缁瑩銆佸锟介幃銏ゅ川婵犲簼鎴烽梻鍌氬�峰ù鍥р枖閺囥垹闂柨鏇炲�哥粻顖炴煥閻曞倹瀚�? by changhao
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撻柡灞诲劜閺呮悂鏌﹀Ο渚Ц闁跨喕妫勫锟犲Υ娴ｇ硶鏋庨柟鎯х－椤︻參鎮峰鍐閽樻繃銇勯弽銊с�掔紒鐘荤畺閺岀喖骞嗚閸ょ喖鏌涢悢鍝ュ弨闁哄瞼鍠栭幃婊堟嚍閵夛附娈告俊鐐�戦崝濠囧磿閻㈢绠栨繛鍡樻尭缁狙囨煙鐎涙绠ユ繛鍏煎哺濮婄粯鎷呴懞銉ｏ拷鍐煟閹虹偟鐣垫鐐村灴瀹曞爼顢楅敓浠嬪几娓氾拷閺岀喖宕滆鐢盯鏌￠崨顔藉�愰柡灞诲姂閹倝宕掑☉姗嗕紦 by changhao
					boolean ok = ClanManage.AddClanMoney(-lobby.levelupcost, clan);
					if (ok == false)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					clan.setClanlevel(level + 1);
					
					sClanLevelup.change.put(ClanManage.Lobby, level + 1);
					sClanLevelup.money = clan.getMoney();	
					uplevel=level + 1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯弴鐐搭棡閻庢艾缍婇弻娑㈠箛闂堟稒鐏堥悗鐟版啞缁诲啴濡甸崟顖氱闁瑰瓨绻冮崐顖氣攽閿涘嫬浠╁┑顔哄�栫粚杈ㄧ節閸パ咁啇婵炶揪缍�椤鈻嶉崱娆戠＝闁稿本鐟ч崝宥夋煥閺囨娅婄�规洦鍨伴鍏煎緞鐎Ｑ勫濠电偠鎻紞锟芥い顐㈩樀瀹曟垿鎮╃紒妯煎幈闁瑰吋鐣崹娲Φ濠靛牞鎷风憴鍕缂侇喖鐭傞崺銏℃償閵娿儳顓洪梺缁樺姇瀵爼鎮楅銏♀拻濞达絿鎳撻婊勭箾閸欏澧电�规洘鍔欏畷顐﹀Ψ瑜岀粭澶愭偡濠婂懎顣奸悽顖涘笧閻ヮ亣顦归柡灞剧洴椤㈡洟鏁愰崶鈺冩殼闂備焦濞婇弨鍗烆潖閼姐倖顫曢柟鐑樻閹风兘鏁愭惔婵囧枤闂佺粯鎸搁妶鎼佸蓟閳ュ磭鏆嗛悗锝庡墰琚﹂梻浣芥〃閻掞箓宕濆▎蹇曟殾闁绘挸瀵掗悡銉╂煕閹般劍娅呴柛鎾舵暩缁辨捇宕掑顒婃嫹瀹勬噴褰掑炊閵婏絼绮撻梺鍛婄缚閸庢煡寮冲鍫熺厵闁绘垶锕╁▓鏃堟煟閹绢垽鎷烽幇浣哄數闁荤姾妗ㄧ拃锕傛偂椤掍胶绠剧紒妤�鎼慨鍌炴煛鐏炲墽娲撮柛鈺佸瀹曟﹢宕滆婵爼姊绘笟锟藉褔鈥﹂鐘电＝婵椴稿畷鏌ユ煕閳╁啰鈾侀柣鎾崇箻閺屾盯顢曢敐鍥╃暫闂佺懓鍚嬮崝鏍Φ閸曨剚鍎熼柕蹇婏拷宕囷紦闂備礁鎼惉濂稿窗閺嵮呮殾婵炲棙鎸稿洿闂佺硶鍓濋〃蹇斿閿燂拷
					cost=lobby.levelupcost;//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鏁愭径濠庢綂闂佺粯锚閸熷潡寮抽崼銉︹拺缂佸顑欓崕蹇斻亜閹存繍妯�鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�??
					opid=FactionOpbean.TYPE_LOBBY_UP;
					
					SendAllFactionMemeber(clan, ClanManage.Lobby, level + 1);
					
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘靛幈濠殿喗锕╅崢浠嬪Φ濠靛棌鏀介梽鍥春閺嵮屽殫闁告洦鍙忛幏鐑芥晲鎼存繄鑳哄┑鈥冲级閸旀瑥顫忕紒妯肩懝闁跨喕妫勯…鍥樁濠⒀勭箞濮婃椽宕崟顒�娅ら梺鐑╂櫓閸ㄥ爼鐛箛娑樼闁挎棁妫勬禍婊堟煟韫囨挾绠ｉ柣鎺炵畵瀵剟鏁撴禒瀣拻濞达綀娅ｇ敮娑㈡煥濮樻唻鎷峰▓鍨灈闁绘牕銈搁悰顕�寮介鐐电杸濡炪倖鏌ㄦ晶浠嬫晬濠婂牊鈷戦悹鎭掑妼閺嬪秶绱掗鐣屾噧闁伙絿鍏橀獮鎺楀箣閺冿拷椤秹姊洪崫鍕枌濠碘�虫喘閹嫭鎯旈妸锔规嫽婵炶揪绲肩拃锕傚绩娴煎瓨鐓欐繛鑼额唺缁ㄧ晫锟藉灚婢橀敃顏勭暦濠婂棭妲奸梺绋跨箲缁捇寮诲☉銏犵闁艰壈娉涢崢锛勭磼閻愵剙鍔ら柕鍫熸倐瀵鎮㈤崗鑲╁姺闂佹寧娲╅幏椋庯拷娈垮枤閸嬫挾鎹㈠☉銏犻唶闁绘洑鑳堕崝椋庣磽娴ｄ粙鍝洪悽顖涱殔椤洩绠涘☉妯溾晠鏌曟竟顖氭噺閸ｎ垶姊婚崒娆戭槮闁汇倕娲よ灋闁告洦鍨侀崶顒夋晬闁绘垵娲ㄧ粙蹇撯攽閻樿宸ラ柣妤�妫濋悰顕�濮�閳ヨ尙绠氬銈嗙墬缁本绂嶆總鍛婄厱闁哄倽娉曟牎缂備礁鐭佹ご鍝ユ崲濠靛鐐婃い顒夊劯閸ャ劎鍘遍梺闈涱樈閸犳碍绂掗姀銈嗙厪闊洢鍎崇壕璺ㄧ磼閻樻彃鈷旈柨鐔烘櫕閹虫挻绔熸繝鍥х獥闁哄诞灞芥濡炪倖娲╅幏鐑芥煛瀹�瀣埌闁宠棄顦靛畷锟犳倷鐎电缍嗗┑掳鍊楁慨鐑藉磻閻愬灚鏆滈柟鐑樻礈娴滄瑩姊绘担鑺ョ《闁哥姵鎹囧鏌ヮ敃閵堝懎鐏婃繝鐢靛У閼瑰墽绮婚锟介弻銈夊箒閹烘垵濮㈤梺鍛娚戦幃鍌氼潖濞差亜绠归柣鎰絻婵矂姊虹粙鎸庡攭濡炴潙鎲＄粚杈ㄧ節閸愵亶娴勯柣搴秵閸嬪棝宕㈤幖浣光拺缂佸娉曢悞鍧楁⒒閸曨偄顏柨鐔诲Г閻旑剟骞忛敓锟� by changhao
					mkdb.Procedure.pexecuteWhileCommit(new ClanRank(clan.toData()));
					mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PFactionZongHeProc(clan.getKey(), false));
					mkdb.Procedure.pexecuteWhileCommit(new fire.pb.clan.fight.PClanFightUpdateClanLevel(clan.getKey(), clan.getClanlevel()));
				}
				else if (id == ClanManage.GoldBank)
				{
					int level = clan.getHouse().get(ClanManage.GoldBank);
					fire.pb.clan.SClanGoldBank bank =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanGoldBank.class).get(level);
					if (bank == null)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 143583, null);
						return true;
					}
				
					fire.pb.clan.SClanGoldBank l =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanGoldBank.class).get(level + 1);
					if (l == null) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喖顭烽弫鎰緞婵犲嫷鍚呴梻浣瑰缁诲倸螞椤撶倣娑㈠礋椤撶姷锛濇繛鎾磋壘閿曘儳锟芥艾缍婂铏圭矙閹稿孩鎷辩紓浣割儐鐢�崇暦閿濆牏鐤�闁哄倸澧界粻姘舵⒑闂堟稓澧曢柟宄邦儔瀹曟洟骞囬悧鍫濓拷鍨叏濮楀棗澧扮紒澶嬫そ閺岀喖顢欑粵瀣暭闂佺懓寮堕幐鍐茬暦閻旂⒈鏁嗛柛灞诲�栬ⅷ闂傚倸鍊烽悞锔撅拷绗涘懎鏋堢�广儱顦闂佸憡娲﹂崹鎵不婵犳碍鐓熼柟閭﹀灡椤ュ霉閻欙拷閸ｏ綁骞冨Δ鍐╁枂闁告洦鍓涢敍姗�姊洪崨濠冣拹闁搞劌娼℃俊瀛樻媴閸撳弶寤洪梺璺ㄥ枍缁瑩鐛崘顕呮晜闁割偅绻傜粣娑橆渻閵堝棛澧柛鎴犳嚀鍗遍弶鍫涘妿缁★拷闂佹眹鍨藉褍鏆╅梻浣芥〃閻掞箓骞冮崒姘辨殾闁硅揪闄勯崑鎰版偣閸ヮ亜鐨烘い鏂胯嫰椤啴濡堕崨顖滎唶闂佺粯顨呭Λ娑氬垝婵犳凹鏁嶉柣鎰嚟閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷? by changhao
					{
						java.util.ArrayList<String> args = new java.util.ArrayList<String>();
						Integer s = level;
						args.add(s.toString());
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160226, args);
						return true;						
					}
					
					if (money < ClanUtils.getBuildLevelupMax(clan).get(ClanManage.GoldBank)) //闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡宀嬬秮婵拷闁靛繆鏅濋崝鍝ョ磽娓氬﹥瀚规繝銏ｅ煐閸旀牠鎮￠妷鈺傜厸闁搞儮鏅涙禒婊堟煥閻旂粯顥夐柟鑺ョ矌閸掓帡鏁愰崨鍌涙瀹曘劑顢欓幆褍绠伴梺璇查缁犲秹宕曟潏顭戞闁告縿鍎查弳婊堟煟閹邦喖鍔嬮柣鎾存礋閺屾洘寰勫Ο鐑樼亪婵犫拃鍐剧吋闁哄备鍓濋幏鍛村川婵犲孩锛嗛梻浣告惈閺堫剟鎯勯姘煎殨闁圭虎鍠栨儫闂侀潧顦崕鍝勵焽婵犳碍鈷掑ù锝呮啞閸熺偤鏌熺亸鏍ㄦ珚鐎规洩缍佸畷姗�鈥﹂幋鐐电▉婵犵數鍋涘Ο濠冪濠婂喚鍟呮繝闈涙閺�浠嬫煟濡绲婚柡鍡樼懄閵囧嫰鏁傜憴鍕彋濠殿喖锕ュ浠嬬嵁閺嶎厽鍊烽柟缁樺俯閻庡瓨绻濋悽闈浶為柛銊︽そ閺佸啴濮�閵堝懏妲梺闈涚箳婵參宕ョ�ｎ亶鐔嗛悹鍝勩偨閿熺姴鐓涢柛娑卞枤閸樻捇姊洪崨濠勭畵閻庢凹鍓熼弫鎾绘偩鐏炵偓姣堝Δ鐘靛仜缁绘劗鍙呭銈呯箰閹冲骞忓ú顏呪拺闁稿繘妫块懜顏堟煕鎼达紕效妞ゃ垺妫冨畷铏规崉閻戞ê鏋犲銈冨灪缁嬫垿鈥﹂妸鈺佸窛妞ゆ牭绲剧瑧濠电姷鏁搁崑鐘诲箵椤忓棛绀婇柨鐔诲Г缁绘盯宕崘顏呭仹婵犮垼顫夊ú鐔风暦濡ゅ懏鈷掗悗闈涙憸閻ｉ箖姊绘笟锟藉褔鎮ч崱娆愬床闁瑰濯撮幏宄邦潩鏉堛劌娈屽銈庝簻閸熷瓨淇婇幆鎵杸闁哄洨濮靛▓鐓庘攽閻愯尙鎽犵紒顔肩焸閹儲绺介崨濠備粧濡炪倖娲╅幏椋庯拷娈垮枙缁瑩銆佸锟介幃銏ゅ川婵犲簼鎴烽梻鍌氬�峰ù鍥р枖閺囥垹闂柨鏇炲�哥粻顖炴煥閻曞倹瀚�? by changhao
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撻柡灞诲劜閺呮悂鏌﹀Ο渚Ц闁跨喕妫勫锟犲Υ娴ｇ硶鏋庨柟鎯х－椤︻參鎮峰鍐閽樻繃銇勯弽銊с�掔紒鐘荤畺閺岀喖骞嗚閸ょ喖鏌涢悢鍝ュ弨闁哄瞼鍠栭幃婊堟嚍閵夛附娈告俊鐐�戦崝濠囧磿閻㈢绠栨繛鍡樻尭缁狙囨煙鐎涙绠ユ繛鍏煎哺濮婄粯鎷呴懞銉ｏ拷鍐煟閹虹偟鐣垫鐐村灴瀹曞爼顢楅敓浠嬪几娓氾拷閺岀喖宕滆鐢盯鏌￠崨顔藉�愰柡灞诲姂閹倝宕掑☉姗嗕紦 by changhao
					boolean ok = ClanManage.AddClanMoney(-bank.levelupcost, clan);
					if (ok == false)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					clan.getHouse().put(ClanManage.GoldBank, level + 1);
					
					sClanLevelup.change.put(ClanManage.GoldBank, level + 1);
					sClanLevelup.money = clan.getMoney();	
					uplevel=level + 1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯弴鐐搭棡閻庢艾缍婇弻娑㈠箛闂堟稒鐏堥悗鐟版啞缁诲啴濡甸崟顖氱闁瑰瓨绻冮崐顖氣攽閿涘嫬浠╁┑顔哄�栫粚杈ㄧ節閸パ咁啇婵炶揪缍�椤鈻嶉崱娆戠＝闁稿本鐟ч崝宥夋煥閺囨娅婄�规洦鍨伴鍏煎緞鐎Ｑ勫濠电偠鎻紞锟芥い顐㈩樀瀹曟垿鎮╃紒妯煎幈闁瑰吋鐣崹娲Φ濠靛牞鎷风憴鍕缂侇喖鐭傞崺銏℃償閵娿儳顓洪梺缁樺姇瀵爼鎮楅銏♀拻濞达絿鎳撻婊勭箾閸欏澧电�规洘鍔欏畷顐﹀Ψ瑜岀粭澶愭偡濠婂懎顣奸悽顖涘笧閻ヮ亣顦归柡灞剧洴椤㈡洟鏁愰崶鈺冩殼闂備焦濞婇弨鍗烆潖閼姐倖顫曢柟鐑樻閹风兘鏁愭惔婵囧枤闂佺粯鎸搁妶鎼佸蓟閳ュ磭鏆嗛悗锝庡墰琚﹂梻浣芥〃閻掞箓宕濆▎蹇曟殾闁绘挸瀵掗悡銉╂煕閹般劍娅呴柛鎾舵暩缁辨捇宕掑顒婃嫹瀹勬噴褰掑炊閵婏絼绮撻梺鍛婄缚閸庢煡寮冲鍫熺厵闁绘垶锕╁▓鏃堟煟閹绢垽鎷烽幇浣哄數闁荤姾妗ㄧ拃锕傛偂椤掍胶绠剧紒妤�鎼慨鍌炴煛鐏炲墽娲撮柛鈺佸瀹曟﹢宕滆婵爼姊绘笟锟藉褔鈥﹂鐘电＝婵椴稿畷鏌ユ煕閳╁啰鈾侀柣鎾崇箻閺屾盯顢曢敐鍥╃暫闂佺懓鍚嬮崝鏍Φ閸曨剚鍎熼柕蹇婏拷宕囷紦闂備礁鎼惉濂稿窗閺嵮呮殾婵炲棙鎸稿洿闂佺硶鍓濋〃蹇斿閿燂拷
					cost=bank.levelupcost;//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鏁愭径濠庢綂闂佺粯锚閸熷潡寮抽崼銉︹拺缂佸顑欓崕蹇斻亜閹存繍妯�鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�??
					opid=FactionOpbean.TYPE_GOLD_UP;
					
					SendAllFactionMemeber(clan, ClanManage.GoldBank, level + 1);
				}
				else if (id == ClanManage.DrugStone)
				{
					int level = clan.getHouse().get(ClanManage.DrugStone);
					fire.pb.clan.SClanDrugstore drugstone =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanDrugstore.class).get(level);
					if (drugstone == null)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 143583, null);
						return true;
					}
				
					fire.pb.clan.SClanDrugstore l =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanDrugstore.class).get(level + 1);
					if (l == null) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喖顭烽弫鎰緞婵犲嫷鍚呴梻浣瑰缁诲倸螞椤撶倣娑㈠礋椤撶姷锛濇繛鎾磋壘閿曘儳锟芥艾缍婂铏圭矙閹稿孩鎷辩紓浣割儐鐢�崇暦閿濆牏鐤�闁哄倸澧界粻姘舵⒑闂堟稓澧曢柟宄邦儔瀹曟洟骞囬悧鍫濓拷鍨叏濮楀棗澧扮紒澶嬫そ閺岀喖顢欑粵瀣暭闂佺懓寮堕幐鍐茬暦閻旂⒈鏁嗛柛灞诲�栬ⅷ闂傚倸鍊烽悞锔撅拷绗涘懎鏋堢�广儱顦闂佸憡娲﹂崹鎵不婵犳碍鐓熼柟閭﹀灡椤ュ霉閻欙拷閸ｏ綁骞冨Δ鍐╁枂闁告洦鍓涢敍姗�姊洪崨濠冣拹闁搞劌娼℃俊瀛樻媴閸撳弶寤洪梺璺ㄥ枍缁瑩鐛崘顕呮晜闁割偅绻傜粣娑橆渻閵堝棛澧柛鎴犳嚀鍗遍弶鍫涘妿缁★拷闂佹眹鍨藉褍鏆╅梻浣芥〃閻掞箓骞冮崒姘辨殾闁硅揪闄勯崑鎰版偣閸ヮ亜鐨烘い鏂胯嫰椤啴濡堕崨顖滎唶闂佺粯顨呭Λ娑氬垝婵犳凹鏁嶉柣鎰嚟閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷? by changhao
					{
						java.util.ArrayList<String> args = new java.util.ArrayList<String>();
						Integer s = level;
						args.add(s.toString());
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160226, args);
						return true;						
					}
					
					if (money < ClanUtils.getBuildLevelupMax(clan).get(ClanManage.DrugStone)) //闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡宀嬬秮婵拷闁靛繆鏅濋崝鍝ョ磽娓氬﹥瀚规繝銏ｅ煐閸旀牠鎮￠妷鈺傜厸闁搞儮鏅涙禒婊堟煥閻旂粯顥夐柟鑺ョ矌閸掓帡鏁愰崨鍌涙瀹曘劑顢欓幆褍绠伴梺璇查缁犲秹宕曟潏顭戞闁告縿鍎查弳婊堟煟閹邦喖鍔嬮柣鎾存礋閺屾洘寰勫Ο鐑樼亪婵犫拃鍐剧吋闁哄备鍓濋幏鍛村川婵犲孩锛嗛梻浣告惈閺堫剟鎯勯姘煎殨闁圭虎鍠栨儫闂侀潧顦崕鍝勵焽婵犳碍鈷掑ù锝呮啞閸熺偤鏌熺亸鏍ㄦ珚鐎规洩缍佸畷姗�鈥﹂幋鐐电▉婵犵數鍋涘Ο濠冪濠婂喚鍟呮繝闈涙閺�浠嬫煟濡绲婚柡鍡樼懄閵囧嫰鏁傜憴鍕彋濠殿喖锕ュ浠嬬嵁閺嶎厽鍊烽柟缁樺俯閻庡瓨绻濋悽闈浶為柛銊︽そ閺佸啴濮�閵堝懏妲梺闈涚箳婵參宕ョ�ｎ亶鐔嗛悹鍝勩偨閿熺姴鐓涢柛娑卞枤閸樻捇姊洪崨濠勭畵閻庢凹鍓熼弫鎾绘偩鐏炵偓姣堝Δ鐘靛仜缁绘劗鍙呭銈呯箰閹冲骞忓ú顏呪拺闁稿繘妫块懜顏堟煕鎼达紕效妞ゃ垺妫冨畷铏规崉閻戞ê鏋犲銈冨灪缁嬫垿鈥﹂妸鈺佸窛妞ゆ牭绲剧瑧濠电姷鏁搁崑鐘诲箵椤忓棛绀婇柨鐔诲Г缁绘盯宕崘顏呭仹婵犮垼顫夊ú鐔风暦濡ゅ懏鈷掗悗闈涙憸閻ｉ箖姊绘笟锟藉褔鎮ч崱娆愬床闁瑰濯撮幏宄邦潩鏉堛劌娈屽銈庝簻閸熷瓨淇婇幆鎵杸闁哄洨濮靛▓鐓庘攽閻愯尙鎽犵紒顔肩焸閹儲绺介崨濠備粧濡炪倖娲╅幏椋庯拷娈垮枙缁瑩銆佸锟介幃銏ゅ川婵犲簼鎴烽梻鍌氬�峰ù鍥р枖閺囥垹闂柨鏇炲�哥粻顖炴煥閻曞倹瀚�? by changhao
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撻柡灞诲劜閺呮悂鏌﹀Ο渚Ц闁跨喕妫勫锟犲Υ娴ｇ硶鏋庨柟鎯х－椤︻參鎮峰鍐閽樻繃銇勯弽銊с�掔紒鐘荤畺閺岀喖骞嗚閸ょ喖鏌涢悢鍝ュ弨闁哄瞼鍠栭幃婊堟嚍閵夛附娈告俊鐐�戦崝濠囧磿閻㈢绠栨繛鍡樻尭缁狙囨煙鐎涙绠ユ繛鍏煎哺濮婄粯鎷呴懞銉ｏ拷鍐煟閹虹偟鐣垫鐐村灴瀹曞爼顢楅敓浠嬪几娓氾拷閺岀喖宕滆鐢盯鏌￠崨顔藉�愰柡灞诲姂閹倝宕掑☉姗嗕紦 by changhao
					boolean ok = ClanManage.AddClanMoney(-drugstone.levelupcost, clan);
					if (ok == false)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					clan.getHouse().put(ClanManage.DrugStone, level + 1);
					
					sClanLevelup.change.put(ClanManage.DrugStone, level + 1);
					sClanLevelup.money = clan.getMoney();
					
					uplevel=level + 1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯弴鐐搭棡閻庢艾缍婇弻娑㈠箛闂堟稒鐏堥悗鐟版啞缁诲啴濡甸崟顖氱闁瑰瓨绻冮崐顖氣攽閿涘嫬浠╁┑顔哄�栫粚杈ㄧ節閸パ咁啇婵炶揪缍�椤鈻嶉崱娆戠＝闁稿本鐟ч崝宥夋煥閺囨娅婄�规洦鍨伴鍏煎緞鐎Ｑ勫濠电偠鎻紞锟芥い顐㈩樀瀹曟垿鎮╃紒妯煎幈闁瑰吋鐣崹娲Φ濠靛牞鎷风憴鍕缂侇喖鐭傞崺銏℃償閵娿儳顓洪梺缁樺姇瀵爼鎮楅銏♀拻濞达絿鎳撻婊勭箾閸欏澧电�规洘鍔欏畷顐﹀Ψ瑜岀粭澶愭偡濠婂懎顣奸悽顖涘笧閻ヮ亣顦归柡灞剧洴椤㈡洟鏁愰崶鈺冩殼闂備焦濞婇弨鍗烆潖閼姐倖顫曢柟鐑樻閹风兘鏁愭惔婵囧枤闂佺粯鎸搁妶鎼佸蓟閳ュ磭鏆嗛悗锝庡墰琚﹂梻浣芥〃閻掞箓宕濆▎蹇曟殾闁绘挸瀵掗悡銉╂煕閹般劍娅呴柛鎾舵暩缁辨捇宕掑顒婃嫹瀹勬噴褰掑炊閵婏絼绮撻梺鍛婄缚閸庢煡寮冲鍫熺厵闁绘垶锕╁▓鏃堟煟閹绢垽鎷烽幇浣哄數闁荤姾妗ㄧ拃锕傛偂椤掍胶绠剧紒妤�鎼慨鍌炴煛鐏炲墽娲撮柛鈺佸瀹曟﹢宕滆婵爼姊绘笟锟藉褔鈥﹂鐘电＝婵椴稿畷鏌ユ煕閳╁啰鈾侀柣鎾崇箻閺屾盯顢曢敐鍥╃暫闂佺懓鍚嬮崝鏍Φ閸曨剚鍎熼柕蹇婏拷宕囷紦闂備礁鎼惉濂稿窗閺嵮呮殾婵炲棙鎸稿洿闂佺硶鍓濋〃蹇斿閿燂拷
					cost=drugstone.levelupcost;//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鏁愭径濠庢綂闂佺粯锚閸熷潡寮抽崼銉︹拺缂佸顑欓崕蹇斻亜閹存繍妯�鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�??
					opid=FactionOpbean.TYPE_DRUGSTONE_UP;
					
					SendAllFactionMemeber(clan, ClanManage.DrugStone, level + 1);
					//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉潡寮婚敐澶婄鐎规洖娲ら崫娲⒑閸濆嫷鍎愰柣妤侇殘閹广垹鈽夐姀鐘殿吅闂佺粯鍔欏褔寮抽敓鐘斥拺闁荤喐婢樺Σ濠氭煕閵忥紕鍙�闁挎繄鍋涢埞鎴狅拷锝庡亜娴滄鏌熼崗鑲╂殬闁搞劍妲掗妵鎰償椤厾绠氶梺闈涚墕濞层倕鏆╅梻浣侯焾椤戝棝鎯勯姘辨殾妞ゆ牜鍎愰弫宥嗙節婵犲倸顏╅幖鏉戯工閳规垿鎮╃紒妯婚敪濡炪倖鍨甸幊鎰垝閸儱绀冩い鏃傛櫕閸樹粙姊洪柅娑樺祮婵炰匠鍥у偍闁告縿鍎崇壕鍏笺亜閺囩偞鍣归柣蹇ョ磿缁辨帞绱掑Ο鑲╃暭闂佸摜濮撮敃銈堢亽濠电偠灏欑划顖滅礊婢舵劖鈷掑ù锝堫潐閸嬬娀鏌涢弮锟介崹鍓佺矉瀹ュ閱囬柡鍥公閹烽攱绗熼敓钘夘嚕閸婄噥妲烽梺鍝勵儏闁帮綁寮婚悢鐓庣畾鐟滃繘寮搁崘顏呭仏婵犻潧顑嗛埛鎺懨归敐鍫綈闁稿濞�閺屾稒鎯旈姀掳浠㈤悗瑙勬礃缁矂锝炲┑瀣殝闂傚牊绋愮花鐢告⒒娴ｅ憡鎯堟繛灞傚灲瀹曠懓煤椤忓懎浜楀┑鐐叉閹稿鎮￠悢鍏肩厵閻庣數顭堥敓鑺ョ墵楠炲鏁冮敓浠嬫偂閺囥垺鐓欓柟娈垮枛椤ｅジ鏌ｉ幘璺烘灈闁哄瞼鍠栭幃婊兾熼懡銈庢О缂備胶铏庨崢濂告偉婵傜钃熼柕濞炬櫆閸嬪嫰鏌涢幋娆忥拷鏍拷姘秺閺岋綁寮村鍗炲缂傚倸绉撮悧鎾愁潖濞差亝鍋￠柣妤�鐗嗛弳鍫ユ⒑鐠団�虫灈闁稿﹥鎮傞幃楣冩倻閽樺鐤�闂佸搫顦锟犲极濠婂啠鏀介幒鎶藉磹瑜旈獮蹇涙倻閼恒儳鍙冮梺鍛婂姦娴滄粓寮稿☉銏＄厸閻忕偛澧介埥澶愭煃閽樺妲搁柍璇查叄楠炲洭顢欓柨顖涚�奸梻鍌氬�风粈渚�骞夐敓鐘冲仭闁靛鏅滈弲婵囥亜韫囨挾澧涢柛瀣�归妵鍕箛閸撲胶鏆犻梺缁樺姇閿曨亪寮婚弴鐔虹瘈闊洦鎼╁ú顓烆渻閵堝繗绀嬮柛搴＄－濡叉劙骞樼�涙ê顎撻柣鐔哥懃鐎氬嘲螞閺嶎厽鈷戦柣鐔告緲濞堚晠鏌熼崙銈嗗
					if(level==0){
						mkdb.Procedure proc=fire.pb.clan.srv.ClanManage.refreshMedic(clan.getKey());
						mkdb.Procedure.pexecuteWhileCommit(proc);
					}
				}
				else if (id == ClanManage.Hotel)
				{
					int level = clan.getHouse().get(ClanManage.Hotel);
					fire.pb.clan.SClanHotel hotel =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanHotel.class).get(level);
					if (hotel == null)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 143583, null);
						return true;
					}
				
					fire.pb.clan.SClanDrugstore l =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanDrugstore.class).get(level + 1);
					if (l == null) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喖顭烽弫鎰緞婵犲嫷鍚呴梻浣瑰缁诲倸螞椤撶倣娑㈠礋椤撶姷锛濇繛鎾磋壘閿曘儳锟芥艾缍婂铏圭矙閹稿孩鎷辩紓浣割儐鐢�崇暦閿濆牏鐤�闁哄倸澧界粻姘舵⒑闂堟稓澧曢柟宄邦儔瀹曟洟骞囬悧鍫濓拷鍨叏濮楀棗澧扮紒澶嬫そ閺岀喖顢欑粵瀣暭闂佺懓寮堕幐鍐茬暦閻旂⒈鏁嗛柛灞诲�栬ⅷ闂傚倸鍊烽悞锔撅拷绗涘懎鏋堢�广儱顦闂佸憡娲﹂崹鎵不婵犳碍鐓熼柟閭﹀灡椤ュ霉閻欙拷閸ｏ綁骞冨Δ鍐╁枂闁告洦鍓涢敍姗�姊洪崨濠冣拹闁搞劌娼℃俊瀛樻媴閸撳弶寤洪梺璺ㄥ枍缁瑩鐛崘顕呮晜闁割偅绻傜粣娑橆渻閵堝棛澧柛鎴犳嚀鍗遍弶鍫涘妿缁★拷闂佹眹鍨藉褍鏆╅梻浣芥〃閻掞箓骞冮崒姘辨殾闁硅揪闄勯崑鎰版偣閸ヮ亜鐨烘い鏂胯嫰椤啴濡堕崨顖滎唶闂佺粯顨呭Λ娑氬垝婵犳凹鏁嶉柣鎰嚟閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷? by changhao
					{
						java.util.ArrayList<String> args = new java.util.ArrayList<String>();
						Integer s = level;
						args.add(s.toString());
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160226, args);
						return true;						
					}
					
					if (money < ClanUtils.getBuildLevelupMax(clan).get(ClanManage.Hotel)) //闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡宀嬬秮婵拷闁靛繆鏅濋崝鍝ョ磽娓氬﹥瀚规繝銏ｅ煐閸旀牠鎮￠妷鈺傜厸闁搞儮鏅涙禒婊堟煥閻旂粯顥夐柟鑺ョ矌閸掓帡鏁愰崨鍌涙瀹曘劑顢欓幆褍绠伴梺璇查缁犲秹宕曟潏顭戞闁告縿鍎查弳婊堟煟閹邦喖鍔嬮柣鎾存礋閺屾洘寰勫Ο鐑樼亪婵犫拃鍐剧吋闁哄备鍓濋幏鍛村川婵犲孩锛嗛梻浣告惈閺堫剟鎯勯姘煎殨闁圭虎鍠栨儫闂侀潧顦崕鍝勵焽婵犳碍鈷掑ù锝呮啞閸熺偤鏌熺亸鏍ㄦ珚鐎规洩缍佸畷姗�鈥﹂幋鐐电▉婵犵數鍋涘Ο濠冪濠婂喚鍟呮繝闈涙閺�浠嬫煟濡绲婚柡鍡樼懄閵囧嫰鏁傜憴鍕彋濠殿喖锕ュ浠嬬嵁閺嶎厽鍊烽柟缁樺俯閻庡瓨绻濋悽闈浶為柛銊︽そ閺佸啴濮�閵堝懏妲梺闈涚箳婵參宕ョ�ｎ亶鐔嗛悹鍝勩偨閿熺姴鐓涢柛娑卞枤閸樻捇姊洪崨濠勭畵閻庢凹鍓熼弫鎾绘偩鐏炵偓姣堝Δ鐘靛仜缁绘劗鍙呭銈呯箰閹冲骞忓ú顏呪拺闁稿繘妫块懜顏堟煕鎼达紕效妞ゃ垺妫冨畷铏规崉閻戞ê鏋犲銈冨灪缁嬫垿鈥﹂妸鈺佸窛妞ゆ牭绲剧瑧濠电姷鏁搁崑鐘诲箵椤忓棛绀婇柨鐔诲Г缁绘盯宕崘顏呭仹婵犮垼顫夊ú鐔风暦濡ゅ懏鈷掗悗闈涙憸閻ｉ箖姊绘笟锟藉褔鎮ч崱娆愬床闁瑰濯撮幏宄邦潩鏉堛劌娈屽銈庝簻閸熷瓨淇婇幆鎵杸闁哄洨濮靛▓鐓庘攽閻愯尙鎽犵紒顔肩焸閹儲绺介崨濠備粧濡炪倖娲╅幏椋庯拷娈垮枙缁瑩銆佸锟介幃銏ゅ川婵犲簼鎴烽梻鍌氬�峰ù鍥р枖閺囥垹闂柨鏇炲�哥粻顖炴煥閻曞倹瀚�? by changhao
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撻柡灞诲劜閺呮悂鏌﹀Ο渚Ц闁跨喕妫勫锟犲Υ娴ｇ硶鏋庨柟鎯х－椤︻參鎮峰鍐閽樻繃銇勯弽銊с�掔紒鐘荤畺閺岀喖骞嗚閸ょ喖鏌涢悢鍝ュ弨闁哄瞼鍠栭幃婊堟嚍閵夛附娈告俊鐐�戦崝濠囧磿閻㈢绠栨繛鍡樻尭缁狙囨煙鐎涙绠ユ繛鍏煎哺濮婄粯鎷呴懞銉ｏ拷鍐煟閹虹偟鐣垫鐐村灴瀹曞爼顢楅敓浠嬪几娓氾拷閺岀喖宕滆鐢盯鏌￠崨顔藉�愰柡灞诲姂閹倝宕掑☉姗嗕紦 by changhao
					boolean ok = ClanManage.AddClanMoney(-hotel.levelupcost, clan);
					if (ok == false)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					clan.getHouse().put(ClanManage.Hotel, level + 1);
					
					sClanLevelup.change.put(ClanManage.Hotel, level + 1);
					sClanLevelup.money = clan.getMoney();
					uplevel=level + 1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯弴鐐搭棡閻庢艾缍婇弻娑㈠箛闂堟稒鐏堥悗鐟版啞缁诲啴濡甸崟顖氱闁瑰瓨绻冮崐顖氣攽閿涘嫬浠╁┑顔哄�栫粚杈ㄧ節閸パ咁啇婵炶揪缍�椤鈻嶉崱娆戠＝闁稿本鐟ч崝宥夋煥閺囨娅婄�规洦鍨伴鍏煎緞鐎Ｑ勫濠电偠鎻紞锟芥い顐㈩樀瀹曟垿鎮╃紒妯煎幈闁瑰吋鐣崹娲Φ濠靛牞鎷风憴鍕缂侇喖鐭傞崺銏℃償閵娿儳顓洪梺缁樺姇瀵爼鎮楅銏♀拻濞达絿鎳撻婊勭箾閸欏澧电�规洘鍔欏畷顐﹀Ψ瑜岀粭澶愭偡濠婂懎顣奸悽顖涘笧閻ヮ亣顦归柡灞剧洴椤㈡洟鏁愰崶鈺冩殼闂備焦濞婇弨鍗烆潖閼姐倖顫曢柟鐑樻閹风兘鏁愭惔婵囧枤闂佺粯鎸搁妶鎼佸蓟閳ュ磭鏆嗛悗锝庡墰琚﹂梻浣芥〃閻掞箓宕濆▎蹇曟殾闁绘挸瀵掗悡銉╂煕閹般劍娅呴柛鎾舵暩缁辨捇宕掑顒婃嫹瀹勬噴褰掑炊閵婏絼绮撻梺鍛婄缚閸庢煡寮冲鍫熺厵闁绘垶锕╁▓鏃堟煟閹绢垽鎷烽幇浣哄數闁荤姾妗ㄧ拃锕傛偂椤掍胶绠剧紒妤�鎼慨鍌炴煛鐏炲墽娲撮柛鈺佸瀹曟﹢宕滆婵爼姊绘笟锟藉褔鈥﹂鐘电＝婵椴稿畷鏌ユ煕閳╁啰鈾侀柣鎾崇箻閺屾盯顢曢敐鍥╃暫闂佺懓鍚嬮崝鏍Φ閸曨剚鍎熼柕蹇婏拷宕囷紦闂備礁鎼惉濂稿窗閺嵮呮殾婵炲棙鎸稿洿闂佺硶鍓濋〃蹇斿閿燂拷
					cost=hotel.levelupcost;//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鏁愭径濠庢綂闂佺粯锚閸熷潡寮抽崼銉︹拺缂佸顑欓崕蹇斻亜閹存繍妯�鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�??
					opid=FactionOpbean.TYPE_HOTEL_UP;
					
					SendAllFactionMemeber(clan, ClanManage.Hotel, level + 1);
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘靛幈濠殿喗锕╅崢浠嬪Φ濠靛棌鏀介梽鍥春閺嵮屽殫闁告洦鍙忛幏鐑芥晲鎼存繄鑳哄┑鈥冲级閸旀瑥顫忕紒妯肩懝闁跨喕妫勯…鍥樁濠⒀勭箞濮婃椽宕崟顒�娅ら梺鐑╂櫓閸ㄥ爼鐛箛娑樼闁挎棁妫勬禍婊堟煟韫囨挾绠ｉ柣鎺炵畵瀵剟鏁撴禒瀣拻濞达綀娅ｇ敮娑㈡煥濮樻唻鎷峰▓鍨灈闁绘牕銈搁悰顕�寮介鐐电杸濡炪倖鏌ㄦ晶浠嬫晬濠婂牊鈷戦悹鎭掑妼閺嬪秶绱掗鐣屾噧闁伙絿鍏橀獮鎺楀箣閺冿拷椤秹姊洪崫鍕枌濠碘�虫喘閹嫭鎯旈妸锔规嫽婵炶揪绲肩拃锕傚绩娴煎瓨鐓欐繛鑼额唺缁ㄧ晫锟藉灚婢橀敃顏勭暦濠婂棭妲奸梺绋跨箲缁捇寮诲☉銏犵闁艰壈娉涢崢锛勭磼閻愵剙鍔ら柕鍫熸倐瀵鎮㈤崗鑲╁姺闂佹寧娲╅幏椋庯拷娈垮枤閸嬫挾鎹㈠☉銏犻唶闁绘洑鑳堕崝椋庣磽娴ｄ粙鍝洪悽顖涱殔椤洩绠涘☉妯溾晠鏌曟竟顖氭噺閸ｎ垶姊婚崒娆戭槮闁汇倕娲よ灋闁告洦鍨侀崶顒夋晬闁绘垵娲ㄧ粙蹇撯攽閻樿宸ラ柣妤�妫濋悰顕�濮�閳ヨ尙绠氬銈嗙墬缁本绂嶆總鍛婄厱闁哄倽娉曟牎缂備礁鐭佹ご鍝ユ崲濠靛鐐婃い顒夊劯閸ャ劎鍘遍梺闈涱樈閸犳碍绂掗姀銈嗙厪闊洢鍎崇壕璺ㄧ磼閻樻彃鈷旈柨鐔烘櫕閹虫挻绔熸繝鍥х獥闁哄诞灞芥濡炪倖娲╅幏鐑芥煛瀹�瀣埌闁宠棄顦靛畷锟犳倷鐎电缍嗗┑掳鍊楁慨鐑藉磻閻愬灚鏆滈柟鐑樻礈娴滄瑩姊绘担鑺ョ《闁哥姵鎹囧鏌ヮ敃閵堝懎鐏婃繝鐢靛У閼瑰墽绮婚锟介弻銈夊箒閹烘垵濮㈤梺鍛娚戦幃鍌氼潖濞差亜绠归柣鎰絻婵矂姊虹粙鎸庡攭濡炴潙鎲＄粚杈ㄧ節閸愵亶娴勯柣搴秵閸嬪棝宕㈤幖浣光拺缂佸娉曢悞鍧楁⒒閸曨偄顏柨鐔诲Г閻旑剟骞忛敓锟� by changhao
					mkdb.Procedure.pexecuteWhileCommit(new ClanRank(clan.toData()));
					mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PFactionZongHeProc(clan.getKey(), false));
				}
				
				sClanLevelup.costmax.putAll(ClanUtils.getBuildLevelupMax(clan));
				mkdb.Procedure.psendWhileCommit(clan.getMembers().keySet(), sClanLevelup); //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垹顭峰缁樻媴閻熼偊鍤嬪┑鐐插级閻楃姴鐣烽幇鏉跨濞达絿顭堥悗顓㈡⒑缁嬭法鐏遍柛瀣仱閹繝濡烽埡鍌滃幗闂佸搫娲ㄩ崑娑㈡晸閽樺璐￠柨鐔诲Г閻旑剟骞忛敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫ょ紓渚婃嫹濠电姴娲﹂悡銉╂煟閺冨浂鍤欑悮姘辩磽娴ｈ櫣甯涢柣鈺婂灠閻ｇ兘顢旈崼婵堫槰濡炪倕绻愰弻濠傤煥閸啿鎷虹紒缁㈠幖閹冲繘鎮甸鍡欑＜妞ゆ棁濮ょ亸顓㈡煟閿濆鏁辩紒铏规櫕缁瑩宕归鑲┿偖闂傚倷鑳剁划顖炲蓟閵娾晛绠规い鎰跺瀹撲胶锟藉箍鍎遍ˇ浼村煕閹烘嚚褰掓晲閸粳鎾剁棯椤撶偟鍩ｉ柡灞剧洴閺佹劘绠涢弴鐘虫婵°倗濮烽崑娑氭崲濮楋拷瀵偊骞樼紒妯绘闂佽法鍣﹂幏锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠為柟钘夊�婚敓鏂ょ秵閸犳牠鎮欐繝鍐︿簻闁圭儤鍩堝Σ褰掓煛閸涱亝娅婃慨濠呮缁辨帒螣閸濆嫅鏇㈡⒑閸涘﹥鎯堢紒鐘冲灴閳ワ箓宕堕浣镐簻闂佸憡绺块崕鎶筋敊閺囥垺鈷戦柛婵嗗濡插綊鏌涢妸褎鏆鐐插暣楠炲鎮欓悽娈垮晭闂備胶顭堢换妤呭磻閹版澘绠犻柛鎰ㄦ杺娴滄粓鏌￠崒婵囩《缂佺姴顭烽弻鈩冩媴鐟欏嫬纾抽梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�? by changhao
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繝闈涙川缁★拷闂佺鏈划宀勩�傞搹鍦＝濞撴艾锕ョ�氳绻濋姀锝嗙【妞ゆ垵妫濆畷锝堢疀閺傚墽绠氶梺闈涚墕閹峰宕曢幇鐗堝�垫慨妯块哺閸わ拷闁剧粯鐗犻弻锝咁潨閿熻棄顭囪缁傛帒顭ㄩ崟顏嗙畾濡炪倖鍔х徊璺ㄧ不閻愮鎷峰▓鍨珮闁稿锕悰顔嘉熺涵閿嬪闂傚牊绋戦ˉ蹇旂箾閺夋垵顏柡宀嬬稻閹棃顢涘鍛咃綁姊虹粙娆惧剰婵☆偅绻傞悾鐑藉閵堝懐顔愭繛杈剧到閸樻粓骞忓ú顏呪拺闁告稑锕﹂埥澶愭煥閺囨ê锟芥牠骞堥妸顭戞Ь缂備浇椴哥敮锟犲箖閳哄懎绀冮柤纰卞厸缁辨繈鏌ｆ惔銈庢綈婵炲弶顭囬幑銏ゅ磼閻戝洨绋忓┑鐘绘涧濞诧妇绱為崶顒佺厓闁告繂瀚弸锔剧磼鏉堛劌绲婚柍瑙勫灴閹瑧锟芥稒顭囩粙鍥⒑閸涘﹨澹樻い鎴濐樀楠炲啴鎮滈懞銉︽珕闂佽鍎抽幊蹇曪拷姘愁潐閹便劌螣閻撳簼澹曢柣搴㈢啲閹凤拷
				ClanBuildUPBean factionOpbean=new ClanBuildUPBean(clan.getKey(),opid, uplevel -1, uplevel,cost);
				fire.log.YYLogger.factionBuildUPLog(roleid,factionOpbean);
				
				return true;
			}
		};
		
		requestfactionlevelup.submit();	
	}
	
	public void SendAllFactionMemeber(xbean.ClanInfo clanInfo, int type, int data)
	{
		List<String> paras = new ArrayList<String>();
		paras.add(String.valueOf(data));
		int msgid = 160200;
		if (type == ClanManage.GoldBank)
		{
			msgid = 160219;
		}
		else if (type == ClanManage.DrugStone)
		{
			msgid = 160220;
		}
		else if (type == ClanManage.Hotel)
		{
			msgid = 160221;
		}
		
		for (long roleid : clanInfo.getMembers().keySet())
		{
			MessageMgr.psendSystemMessageToRole(roleid, msgid, paras);				
		}
		
		//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉潡寮婚敐澶婄鐎规洖娲ら崫娲⒑閸濆嫷鍎愰柣妤侇殘閹广垹鈽夐姀鐘殿吅闂佺粯鍔欏褔寮抽敓鐘斥拺闁荤喐婢樺Σ濠氭煕閵忥紕鍙�闁挎繄鍋涢埞鎴狅拷锝庡亜娴滄鏌熼崗鑲╂殬闁搞劍妲掗妵鎰償椤厾绠氶梺闈涚墕濞层倕鏆╅梻浣侯焾椤戝棝鎯勯姘辨殾妞ゆ牜鍎愰弫宥嗙節婵犲倸顏╅幖鏉戯工閳规垿鎮╃紒妯婚敪濡炪倖鍨甸幊鎰垝閸澁鎷烽敐搴′簴濞存粍绮撻弻鐔煎传閸曨厜銈夋煕閺傝法校闁靛洤瀚板顒勫箰鎼粹槅妲卞┑鐑囩到濞层倝鏁冮鍫濈畺婵炲棙鎼╅弫鍌炴煕閺団�崇厫閻庢艾缍婇弻鈥愁吋鎼达絼绮跺┑鐐村灦閻燂附鍒婇幘顔藉仭婵炲棗绻愰鈺冿拷娈垮枛濞尖�愁潖濞差亝顥堟繛鎴炶壘椤ｅ搫顪冮妶蹇曠窗闁告鍟块悾鐑藉箛椤撶姷鐦堝┑顔斤供閸橀箖宕ｉ崱娑欌拺闁告繂瀚粊鈺伱瑰鍕畼闁跨喕濮ら懝鍓х礊婵犲偆娼栧┑鐘宠壘閻愬﹦鎲稿鍏撅綁宕烽鐘碉紲缂傚倷鐒﹂…鍥╃不閺嶎偆纾肩紓浣诡焽缁犵偟锟借娲樼敮鎺楋綖濠靛鏁囬柣妯哄船椤ユ岸姊婚崒姘拷鐑芥嚄閸洍锟斤箓宕奸悤浣诡啍闂佸憡绺块崕濠氬箯瀹勬壋妲堥柟鐑樻尰閻濇牠姊洪悷鎵暛闁搞劌缍婇崺銉﹀緞閹邦剦娼婇梺缁橆焾鐏忣亪鏁撻挊澶屼虎妞ゎ亜鍟存俊鍫曞幢濡儤娈梻浣告憸婵挳鏌婇敐澶堬拷渚�寮崼鐔告闂佽法鍣﹂幏锟�
		fire.pb.clan.srv.ClanManage.addDealClanEventInfo(clanInfo,fire.pb.clan.srv.ClanManage.EVENT_BUILD_UP,0,fire.pb.clan.srv.ClanManage.getClanBuildNameByType(type),data+"","");
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808472;

	public int getType() {
		return 808472;
	}

	public int id; // 1大厅2金库3药店4旅馆 by changhao

	public CRequestClanLevelup() {
	}

	public CRequestClanLevelup(int _id_) {
		this.id = _id_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestClanLevelup) {
			CRequestClanLevelup _o_ = (CRequestClanLevelup)_o1_;
			if (id != _o_.id) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += id;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestClanLevelup _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = id - _o_.id;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

