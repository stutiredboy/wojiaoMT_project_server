
package fire.pb.npc;

import fire.pb.activity.award.RewardMgr;

import java.util.HashMap;
import java.util.Map;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGrabActivityReward__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGrabActivityReward extends __CGrabActivityReward__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure grabactivityreward = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				fire.pb.mission.activelist.RoleLiveness actrole = fire.pb.mission.activelist.RoleLiveness.getRoleLiveness(roleid, false);
				if (actrole != null)
				{
					xbean.ActivityQuestion activityquestion = xtable.Roleid2activityquestion.get(roleid);
					
					final long now = java.util.Calendar.getInstance().getTimeInMillis();
					if (activityquestion == null)
					{
						return true;
					}	
					else
					{
						long lasttime = activityquestion.getActivityquestionstarttime();
						
						if (!fire.pb.util.DateValidate.inTheSameDay(lasttime, now)) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁橈耿瀵鏁愭径濠勵吅濠电姴鐏氶崝鏍礊濡ゅ懏鈷戦悹鎭掑妼閺嬫瑦淇婇銏狀伃鐎规洘鍔欏畷鐑筋敇閻樼數鍔归梻浣告贡閸庛倕螞閹达箑绠柣鎴ｅГ閺呮煡骞栫划鐧告嫹閼碱剙鍤┑鐘垫暩閸嬫盯骞婂畝鍕瀭闁芥ê顦藉鏍ㄧ箾瀹割喕绨奸柛銈呯Ч閺屾洘寰勬繝鍌涚亾婵炲瓨绮犳禍锝呂涢悢濂夋富闁靛牆妫涙晶閬嶆煕鐎ｎ偆鈽夐弫鍫ユ煛鐏炶鍔滈柍閿嬪灦閵囧嫰骞掗悙鏉戭伓缂傚倷绀侀ˇ閬嶅极婵犳艾绠栭柨鐔哄Т鍞梺鍐叉惈閸婂宕㈡禒瀣拺闁告繂瀚弳娆撴煕婵犲懎鍚归柡渚囧枛閳藉鈻庡鍕泿闂備線娼чˇ顓㈠磿閸濆嫀锝夋惞閸︻厾锛滈柡澶婄墑閸斿秶浜搁鐔翠簻闁瑰墽鍋ㄩ崑銏拷瑙勬处娴滎亜鐣峰锟介、姗�鎮欓弶鎴濆濠电姴鐥夐弶鍖℃嫹濡や焦鍙忛柣鎴ｆ绾剧粯绻涢幋娆忕仼闁汇値鍠楅妵鍕箛閳轰礁濮㈡繛瀛樼矆缁瑥顫忓ú顏呭殥闁靛牆鎲涢姀锛勭婵炴潙顑嗗▍鍥瑰鍜佺劸闁宠閰ｉ獮瀣偐闂堟稓顔岄梻鍌欒兌缁垶宕濆Δ鍛？闁靛牆顦伴崑鍌炴煟閺冨倸甯剁紒鐘茬秺閺岀喓鍠婇崡鐐茬闂佽楠忕徊璺ㄦ閹烘挸绶為悘鐐靛亾濮ｅ牓姊洪崫鍕拱缂佸鐗滅划璇测槈閵忕姷鐫勯梺鐟板⒔濞呫垽骞忔搴㈠磯妞ゎ厽甯楃�氳绻涢崼婵堜虎闁哄鍠栭弻鐔碱敊閻撳函鎷烽幖渚囨晪闁挎繂妫涢々鐑芥倵閿濆懐浠涢柡鍜冪秮濮婅櫣绱掑Ο鑽ゅ弳闂佹悶鍊栭悧鐘荤嵁韫囨稒鍊婚柦妯侯槸閻庮厼顪冮妶鍡楀Е闁稿鎳橀、娆撳籍閸啿鎷虹紓鍌欑劍閿氬┑顔肩焸閹绠涢弮鍌涘櫗缂備礁鍊圭敮鈩冩叏閿熶粙鏌曢崼婵囶棤闁告﹢浜跺娲传閸曨偅鐏曢梺鍦厴椤ユ捇鎯�椤忓牆绾ч悹鎭掑壉閿濆洨纾肩�癸拷閸愵喖鎽电紓浣虹帛缁诲牆鐣烽崼鏇熷殝闁割煈鍋呴悵鏍⒒閸屾瑧鍔嶉悗绗涘懏宕查柛灞绢嚔濞差亝鏅濋柛灞惧哺濡嘲顪冮妶鍡樼┛闁圭兘鏀遍幈銊︾節閸愨斂浠㈤梺鍦劜缁绘繃淇婇崼鏇炲窛妞ゆ梻鏅弳姘舵⒒閸屾瑧鍔嶉柟顔肩埣瀹曟洟顢涢悙鑼槷婵犮垼鍩栭崝鏇犵不椤栨粎纾藉ù锝堫嚃閻掔晫绱掗悩鑽ょ暫鐎殿喖鐖煎畷鐓庘攽閸″繑瀵栭梻浣告啞鐢﹪宕￠幎钘夎摕闁绘梻鍎ょ�氭氨鎲歌箛鏇炲К闁跨喍绮欓幃妤冩喆閸曨剙顦╅梺鎼炲妼閻栧ジ鐛崘銊㈡瀻闁圭偓娼欓敓鐣岀帛娣囧﹪顢涘鍐ㄤ粯濡ょ姷鍋為敃銏狀潖缂佹鐟归柨鐔绘椤洭鎳￠妶蹇斿闂傚牊绋撻悞鍝ワ拷瑙勬磸閸ㄨ棄鐣峰Δ鍛殐闁冲搫锕ラ柨銈夋⒒娴ｅ憡鍟為柟绋挎瀹曘劑顢涢妶鍥х哎闂傚倷绀侀幖顐λ囬柆宥呯；闁绘劕顕悵鍫曟煕閳╁啰鈾侀柛搴㈩殕缁绘盯宕卞Ο铏瑰帎闂佺懓鍢查崲鏌ュ煝閹捐鍨傛い鏃傛櫕瑜邦垶姊绘笟锟藉鑽ょ礊閸モ晛绶ゅù鐘差儐閸嬧晠鏌ｉ幋锝嗩棄缂佺姵濞婇弻鐔煎箹椤撶偛绠婚梺鍛婄懃濡繂顫忓ú顏勫窛濠电姴鍊搁～鍥⒑閸涘﹥鐓ョ紒缁橆殜璺柛宀�鍋為埛鎺楁煕鐏炴崘澹橀柨鐔绘閸㈡煡婀侀梺鎼炲労閸擄箓寮�ｎ剚鍠愰煫鍥ㄧ♁閺呮悂鏌ら幁鎺戝姢闁崇粯鎹囬弻锟犲川椤斿墽鐣奸梺鍛婂笚鐢帡鍩㈡惔銊ョ鐎规洖娴傞崬鐑樼節瀵伴攱婢橀敓鑺ユ崌閹偤鏁冮敓浠嬪煝瀹ュ绫嶉柛灞剧矌閿涙繈姊虹粙鎸庢拱闁煎綊绠栭弫鎾寸鐎ｅ灚顥栫紓渚囧枛閻楀﹪骞忛崨顖涘枂闁告洦鍓涜ぐ鍧楁⒑閻熸澘鎮戦柣锝庝邯瀹曟繂鐣濋敓鑺ョ珶閺囩喓绡�婵﹩鍘鹃崢顏堟⒑閸撴彃浜濈紒璇茬Т鍗遍柟闂寸劍閻撱垽鏌涢幇鍏哥盎闁哄妫冮弻銊╂偄缂佹﹩妫勭紓浣哄Т缁夌懓鐣烽弴銏＄劶鐎规挶鍎卞ú顓€�佸☉妯锋婵妫楀▓濂告⒒娴ｈ櫣甯涙い顓炴川閸掓帡顢涢悙鏉戜簵闂佸搫娲㈤崹娲偂濞戙垺鐓曢柕澶涚到閸旀艾鈹戦敍鍕付闂囧绻濇繝鍌涱棡妞ゃ儱顦靛Λ浣瑰緞閹邦厾鍘介梺鍦亾婵炲﹪顢撳Δ鍛叆闁绘棁顕ц闂佽鍠栭崐鍨暦濞差亝鍊烽柛婵嗗椤撴椽姊洪幐搴㈩梿婵☆偄瀚伴弫鎾寸鐎ｅ灚顥栭梺璺ㄥ枔閺咁偊骞婇幘瀵哥彾濠电姴娲ょ粣妤佷繆閵堝嫮鍔嶆繛鍛箻濮婄粯鎷呴挊澶婃優闂佸摜濮甸崝妤呭礆閹烘埈鍚嬮柛婊�鑳堕崬闈涒攽椤旂瓔娈ｉ柟鐑筋棑閿熷�燁潐濞诧箓宕圭捄渚殨闁割偅娲栫粻锝嗐亜閺嶃劎绠伴柟椋庡厴瀹曞綊顢欏顒傜Ш闁轰焦鍔欏畷鍫曞煘閸栤剝瀚瑰┑鐘叉处閻撴盯鏌ㄩ悢璇残撶紒鍌涘笧閿熸枻缍嗛崑鍡涘储閽樺鏀介柍钘夋閻忊剝銇勯幋鐐垫噰鐎规洜鏁搁敓鏂ょ秵閸撱劑骞忔搴㈠枂闁告洦鍓欐禒鈺呮⒑缁嬫寧鎹ｉ柡浣筋嚙椤曪絾绻濆顓炰簻婵＄偛顑呯�涒晛鈻撳┑瀣拻濞撴艾娲ゅ璺ㄧ磼閻樺啿鐏寸�规洘绮撳畷濂稿即閻斿嚖鎷烽悽鍛婂仭婵炲棗绻愰顏嗙磼閿熺晫锟斤綆鍋嗙粻鎯归敐鍛毐婵炲眰鍊涚换姘舵⒒娴ｅ憡璐￠柛搴涘�濋妴鍐幢濞戞鏌ч梺褰掓？閻掞箓鎮￠妷鈺傜厽闁哄洨鍋涢敓钘夋贡閿熻姤鐔幏锟� changhao
						{
							return true;
						}
						
						if (activityquestion.getGrabreward() == 1)
						{
							fire.pb.common.SCommon c = fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.common.SCommon.class).get(236);
							int rewardid = Integer.parseInt(c.getValue());
							
							//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈嗙箾绾绡�鐎殿喖顭烽幃銏ゆ偖鐎涙ê顏堕梺姹囧灪椤旀牠鎮炴ィ鍐ㄧ柈闁告縿鍎崇壕钘夈�掑顒婃敾閻庢俺顫夌换婵嬫偨闂堟刀銏＄箾鐠囇呯暤闁诡噯绻濇俊鐑藉煛閸屾粌骞楅梻浣告惈閸燁偄霉閸岀偛鍚规繛鍡樺灦閸嬫牗鎱ㄥΟ鍨厫闁抽攱鍨垮濠氬醇閻旇　妾ㄩ梺鐟板悑閸旀瑩骞冨Δ锟介～婵嬵敇閻斿搫鍤掓俊鐐�栧ú鈺冪礊娓氾拷閻涱喖顫滈敓浠嬨�佸▎鎾村亗閹兼番鍊ч幏鐑藉垂椤旇鏂�闁圭儤濞婂畷鎰樄妤犵偛绻橀弻銊э拷锝冨妺缁ㄥ妫呴銏＄カ缂佹彃銈搁弻鍥敍閻愬鍘搁柣蹇曞仜婢т粙鍩ユ径鎰厓閻犲洤寮堕崬澶岀磼閻樺磭娲寸�殿喗鎸抽幃顏堟晸娴犲鐤悗锝庡枟閳锋帒霉閿濆懏鍟為柟顖氱墦閺岋綁顢橀悜鍡樞ㄧ紓浣戒含閸嬬偟绮悢鍏兼櫢濞寸姴顑嗛崑妯汇亜閺囶亝瀚归悗瑙勬礀閻栧ジ銆佸Δ浣哥窞閻庯綆鍋呴悵婊勭節閻㈤潧浠╅柟娲讳簽瀵板﹪宕稿Δ锟界粻鐘绘煙閹规劦鍤欑紒锟介崼銉︾厽闁靛繒濮甸崯鐐烘煃闁垮绗掗棁澶愭煥濠靛棛澧涙い蹇曞█閹粙顢涘☉姘垱闂佸搫鏈惄顖氼嚕椤曪拷閺佹捇鎸婃竟婵囨そ閹垽鎮℃惔銏拷顒勬⒑閸涘﹤濮﹂柛锝庡櫍瀵偊宕掗悙瀵稿幈濡炪倖鍔х徊璺ㄧ不濮樿埖鐓欓柤鎭掑劜缁�瀣叏婵犲啯銇濇鐐村姈閹棃鏁愰崶鈺傛濠碉紕鍋戦崐褏锟介潧鐭傚畷鐟扮暦閸パ冪亰闁荤姴娲︾粊鏉懳ｉ崼鐔虹闁糕剝顨堝皬缂備降鍔岄…宄邦潖濞差亜浼犻柛鏇ㄥ亝濞堫厼鈹戦悙鑼勾闁稿﹥鐩妴鍌炲箰鎼达絿鐦堝┑鐐茬墕閻忔繂鈻嶅▎鎴犵＜闁肩⒈鍓氬▍鏇㈡煥閻旇袚缁炬澘绉撮…鍨潨閿熶粙鏁愰悙鍓佺杸婵炴垶鐟﹂崕顏堟煟閻斿摜鎳冮悗姘煎墴瀹曘垼銇愰幒鎾嫼闂佸憡绋戦敃锝囨闁秵鐓曟俊顖濆吹閻帗顨ラ悙鎼劷闁跨喍绮欏褔骞楀鍫晩闁哄洢鍨洪埛鎴︽煕濞戞﹫鍔熼柟鍐插暞閵囧嫯顧傞柟椋庡厴濮婃椽鎳栭埡渚囨毉闁诲海鐟抽崶銉嫹閸愵喖唯闁冲搫鍊搁敓鐣屽厴閺屻倗鍠婇崡鐐差潻闂佹剚浜滈悘姘辨崲濠靛牆鏋堟俊顖氭惈閳峰姊虹拠鈥虫灈闁稿﹨顫夌粚杈ㄧ節閸ャ劌锟藉鏌﹀Ο渚▓婵炵厧锕娲棘閵夛附鐝旈梺鍝ュ櫏閸ㄤ即鈥﹂崸妤�绠ｉ柨鏃囆掗幏濠氭⒑缁嬫寧婀伴柣鐕傚缁﹪鎮ч崼娑楃盎濡炪倖鍔戦崺鍕ｉ幖浣圭厽闁挎繂鎳庡Σ缁樸亜椤愶絿鐭掗柡浣规崌閹稿﹥寰勭仦鐐啎婵犵數鍋涘Ο濠冪濠婂牆绀冮柨鐔绘椤啴濡堕崱妯烘殫闂佺顑囬崰鏍极瀹ュ應妲堥柕蹇婏拷鍏呯敾婵犵數濮撮敃銈囷拷姘煎弮閹繝濡烽敂杞扮盎濡炪倖鍔戦崹鑽ょ不娴煎瓨鍋傞柕鍫濇娴滄粓鐓崶銊﹀鞍闁革絽缍婇弻銊╂偄閻戞ɑ鐝梺绋跨箲閿曘垹顕ｆ繝姘櫇闁跨喎锟界喓浜藉┑鐐存尰閸戝綊宕规潏鈺冩噮濠电姷鏁告慨鐢割敊閺嶎厼绐楁俊銈忔嫹閻撱倝鏌ｉ弬娆炬疇婵炲吋鐗楃换娑橆啅椤旇崵鐩庣紓浣哄С閸楁娊鐛弽顬ュ酣顢楅敓浠嬫倶椤曪拷閺屻劌鈽夊▎娆掞拷鎸庢叏婵犲啯銇濇鐐寸墵閹瑩骞撻幒婵堬拷杈╃磽閸屾瑧璐伴柛鐘愁殜閹兘鍩￠崨顓犵暫婵炴潙鍚嬮幆宀勫极鐎ｎ喗鐓ラ柣鏃傜帛椤ュ鏌ｉ敐鍥у幋鐎规洩绻濋幃娆撳煛閸屻倖缍屽┑鐘殿暯濡插懘宕归幎钘夌厱闁割偅鎯婇敐澶嬪亱闁割偅绮庣粻姘舵⒑缂佹ê濮﹀ù婊勭矒閺佹捇鎳為妷褍鈪归柧鑽ゅ仜閵嗘帒顫濋悙顒�顏堕柣搴ゎ潐濞叉﹢宕归崸妤冨祦闁搞儺鍓欑粈鍌涖亜閹扳晛鐏柛鐘愁焽閿熻姤顔栭崰娑樷枖濞戙垹鐓濋幖娣妽閸婇攱銇勯幒鐐村闂佷紮闄勭划鎾愁潖缂佹鐟归柨鐔绘椤洩顦归柟顔ㄥ洤骞㈡俊鐐灪缁嬫垼鐏冩繛杈剧悼閹虫挸顕ｉ崸妤佲拺缂佸娉曢悘閬嶆煕鐎ｎ剙浠遍柟顕嗙節瀵挳濮�閿涘嫬甯惧┑鐘垫暩婵鎹㈠Ο渚�舵い鏇嫹闁哄本娲熷畷鍫曞Ω瑜忛悿鍕⒑閸︻収鐒鹃柨鏇ㄤ邯楠炲啴濮�閵堝懍绱堕梺闈涳紡閸涱噮娼撻梻鍌氬�搁崐鎼佸磹閹间焦鍋嬪┑鐘插暟閻熻淇婇妶鍛櫣缁炬儳娼￠弻鐔煎箥椤旂⒈鏆梺缁樻尭閸熸潙顫忓ú顏勫瀭妞ゆ洖鎳庨崜浼存⒑鐠囪尙绠查柟鍛婂▕瀵鍨惧畷鍥ㄦ畷闁诲函缍嗛崜娆撳春鐏炵瓔娓婚柕鍫濋娴滄繄绱掔拠鑼ⅵ闁靛棔绀佽灃闁告侗鍘鹃敍婊冣攽閻愭潙鐏﹂柣鐔村劦瀵鈽夐姀鈾�鎷绘繛杈剧悼閻℃棃宕靛▎鎾村�垫繛鎴炲笚濞呭﹪鏌熼鍝勭伈妞ゃ垺顨婂畷鐔碱敃閵堝骸鏁搁梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�?
							Map<String, Object> paras = new HashMap<String, Object>(10);
							paras.put(RewardMgr.ANSWER_RIGHT_TIMES, activityquestion.getAnswerrighttimes());
							fire.pb.activity.award.RewardMgr.getInstance().distributeAllAward(roleid, rewardid, paras, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_grab, 0,fire.pb.PAddExpProc.OTHER_QUEST, "缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮櫘閸撶喎鐣疯ぐ鎺濇晩閻熸瑥瀚惁閬嶆⒒閸屾瑧鍔嶆俊鐐叉健瀹曘垺绂掔�ｎ偄浠梺鍐叉惈閹冲酣鎷戦悢鍏肩厽闁哄倸鐏濋幃鎴︽煕婵犲嫮甯涘ǎ鍥э躬椤㈡稑顭ㄩ崘銊ヮ瀱婵＄偑鍊栧鐟懊洪弽顓炵厴闁硅揪闄勯崐鐑芥煛婢跺鐏╁ù鐘欏洦鈷戦柟鑲╁仜婵″吋绻濋敓鑺ユ綇閳轰礁鐏婇梺鍓插亖閸庤京绮堥崘顔界厓闁荤喕鍩囨禒鎺旂磼閵娿儺鐓兼慨濠冩そ瀹曨偊宕熼锝嗩唲闂備胶顭堥敃銉╁箖閸岀偛绠氶柛鎰靛枛缁狅綁鏌ㄩ弮鍌涙珪闁告ê鐏氭穱濠囨倷瀹割喖鍓版俊銈囧У閹倸鐣烽姀顫嫹閻㈠憡浜ら柟鐑筋棑閹叉挳宕熼鍌ゆО闂佹眹鍩勯崹鐣屾崲濠靛宓侀柛鎰╁妷閺嬪酣鏌熼幖顓炵仭閻庢俺顫夌换娑㈠箣閻戝棔绱楅梺纭呮彧鐎靛矂寮崒鐐寸厽闁哄倸鐏濋幃鎴︽煃闁垮绗掗棁澶愭煥濠靛棛澧曠悮姘辩磼缂併垹骞栭柣鏍с偢瀵鈽夐姀鈩冩珳闂婎偄娲﹀ú婊堝汲閵堝憘鏃堟偐闂堟稐绮剁紓浣虹帛閿曘垹顕ｉ锕�绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹");
							activityquestion.setGrabreward(2);
							
							fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160417, null);
														
							SGrabActivityReward msg = new SGrabActivityReward();
							mkdb.Procedure.psendWhileCommit(roleid, msg);						
						}
						else if (activityquestion.getGrabreward() == 2)
						{
							fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160418, null);	
						}
						else if (activityquestion.getGrabreward() == 3)
						{
							fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160416, null);								
						}
					}
				}
				
				return true;
			}
		};
		
		grabactivityreward.submit();		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795531;

	public int getType() {
		return 795531;
	}


	public CGrabActivityReward() {
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
		if (_o1_ instanceof CGrabActivityReward) {
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

	public int compareTo(CGrabActivityReward _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

