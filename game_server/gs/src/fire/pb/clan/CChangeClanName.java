
package fire.pb.clan;

import java.util.Arrays;
import java.util.List;

import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.PropRole;
import fire.pb.clan.srv.ClanManage;
import fire.pb.ranklist.RankType;
import fire.pb.ranklist.proc.PRoleZongheRankProc;
import fire.pb.talk.MessageMgr;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangeClanName__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChangeClanName extends __CChangeClanName__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0 || newname == null)
			return;
		
		final int userid = ((gnet.link.Dispatch) this.getContext()).userid;
		
		int resultCode = fire.pb.util.CheckName.checkValid(newname);
		if (resultCode == fire.pb.util.CheckName.WORD_ILLEGALITY) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 142260, null);
			return;
		} else if (resultCode == fire.pb.util.CheckName.SPECIAL_WORD_TOO_MANY) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 142294, null);
			return;
		} else if (resultCode == fire.pb.util.CheckName.NONE_CHARACTER) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 146238, null);
			return;
		}

		if (!fire.pb.util.StringValidateUtil.checkIllegalWord(newname)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		int chineseCnt = 0;
		int otherCnt = 0;
		for (int i = 0; i < newname.length(); i++) {
			// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处缂傚啯娲熷缁樻媴閸涘﹥鍎撳┑鐐茬湴閸斿秹骞堥妸锔绘Ч閹艰揪绲块悞鍏肩節閻㈤潧孝闁稿﹦鏁诲銊︾鐎ｎ偆鍘藉┑鈽嗗灠閹碱偆鐥閺岀喖宕楅悡搴☆潚闂佸搫鏈粙鎾寸閿旂偓瀚氶柟缁樺俯濞煎酣姊绘担鍛婃儓闁哄牜鍓欑叅闁绘棃顥撻弳锕傛煟閹惧磭宀搁柡锟芥禒瀣厱闁靛鍨电�氼參顢旈妶澶嬧拺闁煎鍊曢弸鎴犵磼椤斿吋婀版い銊ｅ劦楠炴牗绗熼崶銊︽珨闂備線娼чˇ顐﹀疾濞戞氨鐭嗛悗锝庡亖娴滄粓鏌熼悜妯虹仴闁跨喕妫勯…鐑藉箚娓氾拷瀹曞ジ濡烽敂瑙勫闂備礁鎲＄粙鎴︽晝閵夛箑绶為柛鏇ㄥ灡閻撴洟鏌熼悙顒佺稇闁告繆娅ｉ敓鍊燁潐濞叉垿宕￠幎钘夋瀬闁瑰墽绮弲鎼佹煥閻曞倹瀚�
			String regexStr = fire.pb.util.CheckName.getRegexStr();
			if (newname.substring(i, i + 1).matches(regexStr)) {
				chineseCnt++;
			} else {
				otherCnt++;
			}
		}
		double total = chineseCnt + otherCnt / 2.0;
		int factionNameLen = 5;
		if (total < 2 || total > factionNameLen) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 145088, null);
			return;
		}
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				
				if (!mkdb.util.UniqName.allocate("clan", newname)) {
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 142402, null);
					return false;
				}
				
				xbean.ClanInfo clanInfo = ClanUtils.getClanInfoById(roleid, false);
				if (clanInfo == null) {
					fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 145077, null);
					return false;
				}
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬮梺杞扮劍閸旀瑥鐣烽妸鈺婃晣鐟滃繘鏁撻悾灞藉幋婵﹦绮幏鍛村传閵夘垳绀婇梻浣侯攰濞呮洟骞愰崜褍鍨濋柡鍐ㄧ墛閸嬨劎绱掔�ｎ収鍤﹂柨鏇炲�归悡鏇㈡煛閸ャ儱濡奸柣蹇曞Х缁辨帡顢曢姀鈶垦囨煛鐏炲墽娲村┑锛勫厴椤㈡瑩宕ｉ妷銊︻�楅梻鍌欒兌閹虫挻鏅堕悾灞藉灊妞ゆ牜鍋為崑鍌涚箾閹存瑥鐏柣鎾存礋閺屽秹骞橀崨顔碱伓闂備礁鎼幊蹇曠矙閹达富鏁嬮柨婵嗩樈閺佸鏌ㄩ悢鍓佺煓鐎殿喖顭烽弫宥夊礋椤忓懎濯扮紓鍌欑椤戝懘鎮樺┑瀣厱濠㈣埖鍔栭崐鐢告煕椤垵浜濈紒鑸电叀閹顫濋悡搴＄闂佺懓绠嶉崹褰掑煘閹寸媴鎷烽敐搴濈敖闁挎稒绮岄埞鎴︽倷閺夋垹浠搁梺鑽ゅ櫏閸ㄨ泛鐣烽婊愭嫹閿濆簼绨撮柡锟芥禒瀣厽婵☆垱妞块崯蹇涙煛閸℃鐭岀紒杈ㄥ笚濞煎繘濡搁敂缁㈡Ч闁诲氦顫夊ú姗�宕归崸妤冨祦婵鎷锋鐐叉处閹峰懘鎮烽幍顔叫掑┑鐘垫暩閸嬫盯顢氶鐔稿弿闁圭虎鍣弫鍕煕濞戞瑦缍戦柛鎴犲Т闇夐柨婵嗘搐閻ㄦ垿鏌熸搴″幋闁绘侗鍣ｅ畷褰掝敊閻撳寒娼涘┑鐘垫暩閸嬬娀顢氬鍛筏濞寸姴顑呴悡婵喢归悩宸剾闁轰礁鍊块弻娑㈩敃閵堝懏鐏侀梺鍛婄懃閸燁偊鍩為幋锕�鐓￠柛鈩冾殘娴犙囨煟閻欏懏瀚归梺鎸庢穿閹风兘宕℃潏鈺傚枑闁绘鐗嗙粭姘舵煃闁垮鐏︾紒缁樼洴瀹曞崬螣閸濆嫬袘闁诲孩顔栭崳顕�宕板Δ鍛疄闁靛濡囩弧锟介梺鍛婂姀閺傚倹绂掗姀銈嗗�甸悷娆忓婢跺嫰鏌涚�ｎ亷宸ラ柣锝囧厴閹垻鍠婃潏銊︽珝闂備胶绮崹闈浳涘▎寰帡宕惰閺�浠嬫煥濞戞ê顏╁ù婊冦偢閺屾稒绻涜閹锋垿骞忛悜鑺ヮ棃婵炴垶姘ㄩ崝顖炴倵鐟欏嫭绀冩繝銏★耿閿濈偛鈹戠�ｅ灚鏅為梺鍐叉惈椤戝洨绮旈绛嬫闁绘劕寮堕崰妯汇亜閵忊槄鑰块柟顔界矒瀹曞崬螖娓氬洤鏅梻鍌氬�峰ù鍥敋瑜忛敓鑺ョ▓閺呮繄鍒掑▎鎾崇闁哄洨鍋熺粙濠囨⒒閸屾瑨鍏岄柟铏崌瀹曟煡鎳犻鍌滎槸婵犵數濮撮崑鍡楊焽閺嶃劎绠剧�瑰壊鍠曠花鑽ょ磼閿熶粙宕奸妷锔惧幘缂佺偓婢樺畷顒佹櫠椤曪拷閹粙顢涘Ο鍝勫Е濠殿喖锕ュ钘夌暦椤愶箑唯闁靛鍔х紞渚�寮婚敐鍛傛梹鎷呴搹鍦帨婵°倗濮烽崑娑氭崲閹烘鏅搁柡鍌樺�楃粔鐢告煕閻樺磭澧辩紒顔碱煼閹粙宕ㄦ繝鍕箥闂佽崵鍠愰悷銉э拷姘槻閳绘捇寮崒婊咃紳閻庡箍鍎遍幏鎴︾叕椤掍緡娈介柣鎰絻閺嗭綁鏌涢埡瀣瘈鐎规洦浜濋幏鍛喆閸曨剛褰熼梻鍌氬�烽懗鍓佸垝椤栫偛绠伴柛娑橆煬濞堜粙鏌熼梻瀵哥瓘缂傚秵鐗犻弻鐔兼倻濮楀棙鐣烽梺鎶芥敱鐢帡濡撮幒鎴僵闁绘劦鍓欓鍫曟⒒娴ｈ姤纭堕柛鐘虫礃閹便劑濡堕崶鈺冪厯闂佽宕橀褔鎮″锟介弻鐔兼倻濮楀棙鐣烽梺缁樻尰濞茬喖寮婚敓鐘茬闁圭楠搁鍫曟⒒娴ｈ鍋犻柛鏂块叄瀵偅绻濆銉嫹娴ｅ壊娼╅柤绋跨仛濞呮粍绻濋姀锝嗙【妞ゆ垵妫楅埢宥夊閵堝棌鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷?
				if (clanInfo.getClanmaster() != roleid) {
					fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 150127, null);
					return false;
				}
				clanInfo.setOldclanname(clanInfo.getClanname());// 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰绠绘鐐村灴婵拷闁靛牆鎳愰悿锟芥俊鐐�栧Λ浣肝涢崟顒佸劅濠电姴娲﹂埛鎴犳喐閻楀牆绗掑ù婊�鍗抽弻娑欐償閵婏附閿梺瀹犳椤︻垵鐏掑┑鐘诧工鐎氼參藟閸澁鎷风憴鍕闁挎洏鍨介妴渚�寮崼婵嗚�块梺鍐叉惈閸婃劙鏁冮崒娑掓嫽婵炶揪绲块悺鏃堝吹濞嗘挻鐓曢柟瀵稿У濞呮洜绱掓潏鈺佷槐鐎规洖宕埥澶娢熼懖鈺佺倞闂傚倷绀侀幖顐ょ矙娓氾拷瀹曟垿宕卞☉娆忓壒闂佺硶鍓濈粙鎺楁偂閺囩喆浜滈柟浼存涧娴滄繄绱掗懜鐢垫创闁哄瞼鍠愰ˇ鐗堟償閳ュ啿绠ｉ梻浣虹帛娓氭宕抽敐鍛殾鐟滅増甯╅弫濠囨煟閹惧啿鐦ㄦ繛鍏肩洴濮婂宕掑▎鎺戝帯闂佺娅曢幑鍥х暦椤栫偛鍨傛い鏇炴噺閸嶇敻姊洪幐搴㈢闁稿﹤鎲￠、濠囨⒒娴ｅ憡璐″褎顨呴…鍨潨閿熶粙鎮伴锟芥慨锟介柍銉ㄥ皺缁犳岸姊虹紒妯哄闁宦板妿缁牓鏁撻悾宀�纾介柛灞炬皑瀛濋梺鎸庢磸閸婃繈骞冮幆褏鏆嬮柟閿嬫⒐濡啫鐣烽妸鈺婃晩闁稿繗鍋愰弶浠嬫⒒閸屾瑧顦﹂柟纰卞亰钘濆ù鍏兼儗閺佸嫭绻涢崱妤冪翱婵炴垯鍨洪崑鍕煕韫囨挾姣為柟椋庣帛缁绘稒娼忛崜褎鍋ч梺鐑╁墲濡啫鐣烽悽绋跨妞ゆ梻鏅崢閬嶆⒑缂佹〞鎴﹀礈濮橆兘鏋旈柡鍐ㄧ墛閸嬪倿鏌曢崼婵囶棤缂佲槄鎷峰┑鐘垫暩婵挳宕愯ぐ鎺戦棷鐟滅増甯楅悡鏇㈡煏婵犲繐顩紒鐘靛仱閺屸�崇暆鐎ｎ剛鐦堥悗瑙勬礃閿曘垺淇婂宀婃Щ濡炪倧缍�濞咃絿妲愰幘瀛樺闁告繂瀚烽敓钘夌焸閺屾盯濡搁敃锟介埢鏇㈡煛娴ｈ宕岄柟顔煎⒔娴狅妇绱掗～顓熷煕闂傚倷鑳堕幊鎾诲床閺屻儱搴婇柡灞诲劚閻撴﹢鏌熸潏楣冩闁稿鍔欓弻鐔虹磼濡椽鍤嬮梺褰掝棑閸忔﹢骞冮悜钘夌闁惧浚鍋嗛敓钘夋惈閳规垶骞婇柛濠冩礋瀹曨垶骞嶉纰辨婵炲濮撮鍡涙偂閺囥垺鍊堕柣鎰綑缁�鍐熆鐟欏嫸鑰块柡灞诲姂閹垻鎷犲▓瀣崌閺岀喖顢欓悡搴嫹閹间焦鍋╅柣鎴ｆ缁狙勭箾閸℃瑥浜鹃柛宥囨暬閺岋綁鎮╅懡銈囩獥濠电偛鎷戠紞渚�骞冩导鏉懳ㄩ柍鍝勫�甸幏娲⒑閸涘﹦绠撻悗姘煎櫍閸┿垺寰勯幇顓犲幈濠碘槅鍨辨禍浠嬪磻閵忣澁鎷峰▓鍨灆闁告娅曟穱濠囨偪椤栵絾顎夐梻浣哥秺椤ユ捇宕楀锟介獮鍡涘磼閻愭彃绐涙繝鐢靛Т閸嬪棙瀵奸幘缁樷拻闁稿本鐟чˇ锕傛煙濞村鎷风搾浣规そ閺佸啴宕掑鎲嬬幢闂備礁鎲″ú锕傚磻閸℃稑姹查柕鍫濐槹閻撴洟鏌嶉埡浣告殶闁冲彞绶氶弻宥夋煥鐎ｎ亞浼岄梺鍝勬湰缁嬫垿鍩ユ径濠庢建闁割偆鍠愰弳浼存⒑鐠囨煡顎楅柣蹇斿哺閹兘鍩￠崨顓℃憰濠电偞鍨崹褰掑础閹惰姤鐓忓┑鐐茬仢閸旀碍銇勯顐＄盎妞ゎ亜鍟存俊鍫曞幢濡櫣顣茬紓鍌氬�哥粔鎾晝閵堝缍栭煫鍥ㄦ礈绾惧吋淇婇婵愬殭妞ゅ孩鎹囧娲川婵犲嫧妲堥梺鎸庢磸閸婃繂顕ｉ幎钘夐唶闁靛鑵归幏娲⒑閸忚偐銈撮柡鍛矒瀹曠敻鏁撻懞銉х瘈闁冲嚖鎷烽柛娑卞枟閻濐亪姊洪崨濠傜瑲閻㈩垪锟芥剚鍤曟い鏇嫹鐎规洜鍘ч埞鎴﹀醇椤愩垺鏆ラ梻鍌氬�风粈渚�宕ョ�ｎ偆顩插ù鐘差儏绾惧潡鏌涘Δ鍐ㄤ汗闁哄姊归幈銊ノ旂�ｎ偄顏舵繝娈垮枛閿曘劌鈻嶉敐澶婄闁告洦鍨版儫闂侀潧顧�婵″洩銇愬鑸碘拻濞达絿鍎ら崵锟介梺鎼炲�栭悧鐘荤嵁韫囨稒鏅搁柨鐕傛嫹
				clanInfo.setClanname(newname);
				
				int costHearthStone = fire.pb.clan.srv.ClanAuthManager.getInstance().getChangeClanNameCostHearthStone();
				
				if (!fire.pb.fushi.FushiManager.subFushiFromUser(userid, 
						roleid, costHearthStone, 0, 0,
						fire.pb.fushi.FushiConst.REASON_SUB_CHANGEFACTIONNAME,
						YYLoggerTuJingEnum.tujing_Value_gonghuigaiming,true
						)) {
					return false;
				}
				
				for (java.util.Map.Entry<Long, xbean.ClanMemberInfo> entry : clanInfo.getMembers().entrySet()) {
					mkdb.Procedure.pexecuteWhileCommit(ClanUtils.addClanTitleByPositionProc(entry.getKey(), clanInfo.getClanname(), entry.getValue().getClanposition()));
				}
				
				mkdb.Procedure.psendWhileCommit(roleid, new SChangeClanName(newname));
				fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 160068, null);
				
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹂柣鎾冲瘨閻斿棙绻濋棃娑氬闁搞倧鎷锋俊鐐�ら崑鍛崲閸曨垰绠查柛鏇ㄥ灡閹偤鎮归崶锝呭⒉鐞氀勭節閻㈤潧啸闁轰焦鎮傚畷鎴︽倷閸濆嫬鐎梺鍛婃尫缁�渚�寮搁崼顫嫹楠炲灝鍔氭い褝鎷风紓鍌氱У閻楃娀寮婚敓鐘茬倞闁靛鍎虫禒楣冩⒑缂佹ɑ灏甸柛鐘冲姈缁岃鲸绻濋崶顬囩叓閸ャ劍鐓ユい蹇撶埣濮婄粯鎷呴搹鐟扮濡炪們鍔岄悧鎾崇暦閹达附鍋勯柤鑼皑缂嶄線鐛崶顒佸亱闁割偆鍠愰悵鍐测攽閻橆喖鐏辨繛澶嬬洴椤㈡牠宕堕锟介崒銊╂煟閵忕姵鍟為柣鎾寸☉椤法鎹勯悮鏉戝婵犫拃鍕妞ゎ叀鍎婚ˇ鎾煛閸滀礁浜滈崡閬嶆煙閻楀牊绶茬紒鐙欏嫮绠鹃柛鈩冾殔閳锋棃鏌涢悙鍨毈闁哄矉缍侀幃銏ゅ传閵夛箑娅戦梺璇插閸戝綊宕㈤崜褍鍨濋柛顐緛閹风兘鏁愭惔鈩冪亶闂佺粯鎸婚惄顖炲箖濮楋拷閹瑩骞撻幒鍡樺瘱闂備礁鐤囧Λ鍕囬悽绋胯摕鐎广儱娲︾�氭岸鏌＄仦璇插姎鐎殿喗婢樿灃闁绘﹢娼ф禒婊勭箾瀹割喖寮柕鍡曠铻栭柛娑卞幘閿涙粌鈹戦悙鍙夘棡闁搞劌缍婅棟闁跨噦鎷�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫炵紓浣界堪閸婃繈寮婚敃锟借灒濞撴凹鍨遍鍡涙⒑閸忓吋绶叉繛纭风節瀵鈽夊Ο婊勬瀹曟﹢濡搁妶鍡楀濠电姵顔栭崳顖滃緤閻ｅ矉鎷峰顓熺凡妞ゎ偄绻戠换婵嗩潩椤掑偊绱叉繝鐢靛仜濡瑧鏁幒妤�鍌ㄩ柍銉︽灱閺�浠嬫煟閹邦剙绾ч柛锝囧厴閺屾盯濡搁妶鍥╃厯闂佺粯渚楅崰娑氱不濞戞ǚ妲堟繛鍡樺姈椤忕喖姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷?
				MessageMgr.psendMsgNotifyWhileCommit(clanInfo.getMembers().keySet(), 160396, 0,Arrays.asList(newname));
				//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堝姛缂佺娀绠栭弻銊╂偄鐠囨畫鎾剁磼缂佹鈾侀柟宄版嚇瀹曟﹢宕ｆ径瀣�风紓浣哄亾閸庡磭绱炴繝鍥ц摕闁挎洩鎷烽摶锝夋煟濮橆剦鍤熺紒锟介崱妞绘斀闁绘劖娼欓悘鐔兼煕閵娿儲璐＄紒顔肩墢閿熸枻缍嗛崑浣圭濠婂牊鐓欏ù鐓庣摠濞懷兠瑰鍕煁缂佺粯鐩畷鐓庘槈濡警娼庢繝娈垮枛閿曘儱顪冮挊澶屾殾闁靛濡囩弧锟介梺鍛婃磸閸斿秹锝炲鍡曠箚闁绘劦浜滈敓濮愬�濆畷锝嗘償閵娿儱鍋嶉梺璇″灱閻忔盯鏁愭径濠勭杸闂佺粯顨呴悧濠傗枍濠婂嫮绡�闁靛骏绲剧涵鐐亜閹存繃鍠樼�规洏鍨介幃浠嬪川婵犲嫬骞愬┑鐘灱濞夋盯鏁冮敂鑺ユ珷闁哄洨鍎愰悢鍡欐喐韫囨稑鐤炬い鎰ㄦ嚒閿濆绠涢柡澶庢硶妤犲洤鈹戦悙鍙夘棞濠⒀傜矙瀹曨剟鎮介崨濠勫幗闂佺粯鏌ㄩ幗婊堝箠閸愵喗鍊垫慨妯煎帶楠炴绱掗鑲╁ⅱ闁跨喐鏋荤紞鍡涘窗濡ゅ懏鍋傛繛鎴炵啲閹风兘鎯傞崨濠傤伓闂備浇娉曢崰宥囧垝濞嗗繒鏆﹀ù鍏兼綑缁犲鏌ら崨濠庡晱婵炶偐鍠栧娲捶椤撶偛濡洪梺鎼炲�х粻鎾诲箖閵忋倖鍋傞幖瀛樼箘閻愬﹪姊绘担鍛婂暈婵炲弶鐗犻幃妯侯潩鏉堚晝顦悗骞垮劚椤︿即鍩涢幒妤佺厱閻忕偛澧介幊鍛磼閹邦厽鈷愮紒缁樼♁閹峰懘宕橀幓鎺戠閻熸粎澧楃敮鎺旂矆鐎ｎ偁浜滈柡宥冨妽閻ㄦ垶銇勯弬鎸庮棦婵﹨娅ｉ幑鍕Ω閵夛妇褰氶梻浣烘嚀閸ゆ牠骞忛敓锟�
				MessageMgr.psendSystemMessageToRoles(clanInfo.getMembers().keySet(), 160396, Arrays.asList(newname));
				
				fire.pb.clan.srv.ClanManage.logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�闁靛ě渚婃嫹閹烘鐓熸繝闈涙閸╋綁鏌″畝瀣瘈鐎规洖鐖兼俊鐑藉Ψ瑜岄幃锝夋⒒娴ｅ湱婀介柛濠冾殜瀹曟垿骞橀懜闈涘簥濠电偞鍨崹鍦不閿濆棛绠鹃柛鈩冾殘缁犳娊鏌涢弮锟介幐鍐差潖閻戞ɑ濮滈柟娈垮櫘濡差噣姊洪幐搴㈢┛缂佺姵鎹囧顐﹀箻缂佹ê鐧勬繝銏ｆ硾閻ジ寮冲☉銏♀拺缂佸娼￠妤冿拷瑙勬处閸撴盯宕ｉ崨瀛樷拺闁圭瀛╃粈锟介梺绋匡工閹芥粎鍒掗敐鍛傛棃宕ㄩ鎯у箞闂備焦鏋奸弲娑㈠疮娴兼潙鐓㈠〒姘炬嫹闁哄矉缍侀獮妯硷拷闈涙啞閸ｄ即姊洪崫鍕効缂傚秳绶氶悰顔撅拷锝庡枟閸婄兘鏌涢埄鍏狀亪鎮橀埡鍐＜妞ゆ棁鍋愭晶锕傛煛娴ｈ宕岄柟绋匡攻瀵板嫬螣鐠囪尙妲ｉ梻鍌欑窔濞佳囨偋閸℃稑鐤い鎰剁畱缁�澶嬫叏濡灝鐓愰柣鎾寸懄閵囧嫰寮撮悙鏉戞闂佺粯甯幏锟� "+roleid+"\t濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳娼￠弻鐔猴拷鐢殿焾瀛濈紓浣界堪閸婃繈寮婚敃锟借灒濞撴凹鍨遍敍鍡涙偡濠婂懎顣奸悽顖涘笧婢规洘绺介崨濠勫幗闂佸綊鍋婇崹浼存儍濞差亝鐓熸繛鎴炵墪閸旀岸鏌嶇憴鍕仸妤犵偛锕弻娑欑節閸愨晝顦板Δ鐘靛仜閿曘儵骞嗛弮鍫澪╅柕澶堝劚濞堛倕鈹戦悙鑸靛涧缂佽尪娉曞☉鐢稿醇閺囩偟鍝楁繛瀵稿Т椤戝棝鎮￠弴銏″�堕柣鎰絻閳锋棃鏌ｉ婊冿拷婵嬪蓟閿濆绠抽柟瀛樼妇閹稿啰绱撴担浠嬪摵閻㈩垽绻濆顐﹀箻鐎靛壊娴勯柣搴秵娴滅偤鏁嶅鍐ｆ斀闁绘劖娼欓悘锕傛煟濡や焦鈷掗柤楦块哺缁绘繂顫濋娑欏缂備胶铏庨崢濂稿箠韫囨哎浜圭憸蹇曟閹烘绠甸柟鐑樺灍閹稿啫鈹戦悙鏉戠仼闁轰浇顕ч悾宄邦煥閸曨剙顎撻梺鎯х箳濞呫垻妲愰弻銉︹拻濞达絽鎽滅粔娲煕鐎ｎ亷韬�规洩绲鹃幆鏃堝煢閿熶粙寮搁弮锟界换婵囩節閸屾粌顤�闂佺粯鎸婚惄顖炲箖濮楋拷閹瑩骞撻幒鍡樺瘱闂備礁鐤囧Λ鍕囨导鏉懳﹂柛鏇ㄥ灱閺佸啴鏌ㄥ┑鍡樺窛闁汇倕瀚—鍐Χ閸愩劎浠惧銈冨妼閿曘倝鎮鹃悜钘夌婵°倧鎷风痪鎯у悑娣囧﹪顢涘鍐闂佺懓鍢查崲鑼剁亙闂佸憡渚楅崢楣冩偩閸濆嫷娓婚柕鍫濇缁屽潡鏌熷畡鏉挎Щ闁宠鍨块崺鍕礃閳轰緤鎷烽幇鐗堢厱闁冲搫顑囩弧锟介悗瑙勬礃鐢帡鈥﹂妸鈺佺闁靛绠掔欢銏犫攽閻樺灚鏆╁┑顔惧厴瀵偊骞栨担鍝ワ紱闂佺粯鍔曢幖顐﹀垂閸岀偞鐓欐い鏍ㄧ矊椤ｅジ鏌熼崘鍙夋拱缂佺粯绻堥幃浠嬫濞戞唻鎷烽幘缁樼厵濡炲楠搁崢鎾煛瀹�锟介崰搴ㄥ煝閹捐鍨傛い鏃傛櫕娴滃墽绱撴担鐟板姢濠⒀傜矙瀹曘垼顦归柍銉閹瑰嫰濡搁敃锟界壕顖涗繆閵堝繒鐣遍柣蹇旂箞椤㈡棃顢橀姀鈾�鎷洪梺鍛婄☉椤拷闁硅揪绠戠粻浼存煙閹増顥夐柦鍐枛閺岋綁寮崹顔藉�梺璇″灣閸嬬偤濡甸崟顖氱疀闁告挷绀侀崺宀�绱掗悙顒佺凡缂佸缍婂鏄忣槾缂佽鲸甯掕灒闁绘挸绨堕幏浼存⒒娴ｅ憡鎯堥柡鍫墴閹嫰顢涢悙闈涚ウ闂佹悶鍎洪崜锕傚极閸ヮ剚鐓熼柟閭﹀幖缁茶崵鎮锟藉濠氬磼濞嗘埈妲梺纭咁嚋缁绘繈鐛幇鏉块唶闁哄洨鍋熼ˇ顕�姊洪悷鎵憼缂佽绉撮…鍥冀椤撶喓鍘介梺鐟邦嚟娴兼繈顢旈崼顐ｆ櫔闁哄鐗勯崝搴ｇ不妤ｅ啯鐓曢柍鈺佸幘椤忓懏鍙忛柛銉ｅ妸娴滄粓鐓崶銉ュ姕閻庢熬鎷�? "+costHearthStone);
				
				for (long members : clanInfo.getMembers().keySet())
				{
					mkdb.Procedure.pexecuteWhileCommit(new PRoleZongheRankProc(members));
				}
				
				mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PFactionZongHeProc(clanInfo.getKey(), false));
				mkdb.Procedure.pexecuteWhileCommit(new fire.pb.clan.srv.PClanUpdateChangeName(clanInfo.getKey(), newname));	
				mkdb.Procedure.pexecuteWhileCommit(new fire.pb.clan.fight.PClanFightUpdateChangeName(clanInfo.getKey(), clanInfo.getClanname()));					
				
				String mastername = new PropRole(roleid, true).getName();
				//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉潡寮婚敐澶婄鐎规洖娲ら崫娲⒑閸濆嫷鍎愰柣妤侇殘閹广垹鈽夐姀鐘殿吅闂佺粯鍔欏褔寮抽敓鐘斥拺闁荤喐婢樺Σ濠氭煕閵忥紕鍙�闁挎繄鍋涢埞鎴狅拷锝庡亜娴滄鏌熼崗鑲╂殬闁搞劍妲掗妵鎰償椤厾绠氶梺闈涚墕濞层倕鏆╅梻浣侯焾椤戝棝鎯勯姘辨殾妞ゆ牜鍎愰弫宥嗙節婵犲倸顏╅幖鏉戯工閳规垿鎮╃紒妯婚敪濡炪倖鍨甸幊鎰垝閸澁鎷烽敐搴′簴濞存粍绮撻弻鐔煎传閸曨厜銈夋煕閺傝法校闁靛洤瀚板顒勫箰鎼粹槅妲卞┑鐑囩到濞层倝鏁冮鍫濈畺婵炲棙鎼╅弫鍌炴煕閺団�崇厫閻庢艾缍婇弻鈥愁吋鎼达絼绮跺┑鐐村灦閻燂附鍒婇幘顔藉仭婵炲棗绻愰鈺冿拷娈垮枛濞尖�愁潖濞差亝顥堟繛鎴炶壘椤ｅ搫顪冮妶蹇曠窗闁告鍟块悾鐑藉箛椤撶姷鐦堝┑顔斤供閸橀箖宕ｉ崱娑欌拺闁告繂瀚粊鈺伱瑰鍕畼闁跨喕濮ら懝鍓х礊婵犲偆娼栧┑鐘宠壘閻愬﹦鎲稿鍏撅綁宕烽鐘碉紲缂傚倷鐒﹂…鍥╃不閺嶎偆纾肩紓浣诡焽缁犵偟锟借娲樼敮鎺楋綖濠靛鏁囬柣妯哄船椤ユ岸姊婚崒姘拷鐑芥嚄閸洍锟斤箓宕奸悤浣诡啍闂佸憡绺块崕濠氬箯瀹勬壋妲堥柟鐑樻尰閻濇牠姊洪悷鎵暛闁搞劌缍婇崺銉﹀緞閹邦剦娼婇梺缁橆焾鐏忣亪鏁撻挊澶屼虎妞ゎ亜鍟存俊鍫曞幢濡儤娈梻浣告憸婵挳鏌婇敐澶堬拷渚�寮崼鐔告闂佽法鍣﹂幏锟�
				ClanManage.addDealClanEventInfo(clanInfo,ClanManage.EVENT_CHANGE_NAME,roleid,mastername,newname,"");
								
				//闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冪Ч閿濈偛鈹戠�ｎ偅娅囬梺绋跨焿婵″洨绮欒箛鏃傜瘈闁靛骏绲介悡鎰版煕閺冿拷濞叉粎鍒掓繝姘唨妞ゆ挾鍠撻崢鍗烆渻閵堝棗濮х紒鎻掑⒔缁牓鏁撻悾宀�纾奸柣鎰靛墮閸斻倖绻涚涵椋庣瘈鐎殿喖顭烽幃銏焊娴ｅ湱浜栭梻浣稿閻撳牓宕板Δ鍛�剁�广儱鎷嬪〒濠氭煏閸繈顎楀ù婊勭箖缁绘盯鎳犻锟介弸娑氾拷娈垮枛椤兘骞冮姀顫剨濞达絽婀辨禍鏍⒒娴ｇ顥忛柣鎾崇墦瀹曟澘螖閸涱喖锟藉爼鏌熼崜褏甯涢柍閿嬪灴閺屾稑鈽夊鍡欏彆濠电偛鐗婂ú婊堟晸閻ｅ本顏熼柟椋庡厴閺岀喖姊荤�靛壊妲梺钘夊暟閸犳牠寮婚妸銉㈡斀闁糕檧鏅滅瑧缂傚倷鑳舵慨鐢告儎椤栫偛钃熼柕鍫濐槸缁犵懓霉閿濆牜娼愰梺娆惧幖椤啴濡堕崨瀵稿椽闂佺懓鍤栭幏锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸ゅ嫰鏌涢幘鑼槮闁搞劍绻冮妵鍕冀椤愵澀绮堕梺钘夊暟閸犳牠寮婚弴鐔虹瘈闊洦鎼╁ú顓㈡⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敂钘変汗闂佸湱绮敮顏堝箯閻戣棄閱囬柡鍥╁枑濞呫垽姊洪崗闂磋埅闁稿骸宕湁妞ゆ洩鎷烽柡宀�鍠栭、娆撴偩瀹�锟介悡澶愭⒑閻熸壆锛嶉柛瀣ㄥ�栨穱濠囨偪椤栵絾些婵°倗濮烽崑娑㈡偋閹炬剚娼栫紓浣股戞刊鎾煕濞戞﹫榫氱痪顓ㄦ嫹闂傚倷鑳堕…鍫㈣姳濞差亜纾规繝闈涙－閸ゆ洖鈹戦悩瀹犲閹喖姊虹�圭姵銆冮柤鍐茬埣瀹曘垹煤椤忓應鎷洪梺鍛婃尰瑜板啯绂嶉悙鐑樼厱闁绘娅曠亸鐢电磼椤斿墽甯涢柕鍫秮瀹曟﹢鍩￠崘銊ョ疄濠电姷鏁告慨鎾晝閵堝鐤い鎰剁畱濮规煡鏌ｉ幇顔煎妺闁稿﹤鐏氶幈銊ノ熼悡搴濆闁诲孩鐔幏锟� by changhao
				xbean.ClanProgressRankList clanprogressrankmclist = xtable.Clanprogressranklist.get(RankType.FACTION_COPY);
				if(null != clanprogressrankmclist)
				{
					List<xbean.ClanProgressRankRecord> list = clanprogressrankmclist.getRecords();
					for(xbean.ClanProgressRankRecord record : list)
					{
						if(record.getClankey() == clanInfo.getKey())
						{
							record.setClanname(newname);
							break;
						}
					}
				}
				
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808484;

	public int getType() {
		return 808484;
	}

	public java.lang.String newname;

	public CChangeClanName() {
		newname = "";
	}

	public CChangeClanName(java.lang.String _newname_) {
		this.newname = _newname_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(newname, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		newname = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangeClanName) {
			CChangeClanName _o_ = (CChangeClanName)_o1_;
			if (!newname.equals(_o_.newname)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += newname.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(newname.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

