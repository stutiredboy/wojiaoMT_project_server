
package fire.pb.skill.liveskill;
import java.util.ArrayList;
import java.util.List;

import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.item.AddItemResult;
import fire.pb.item.BagTypes;
import fire.pb.item.Pack;
import fire.pb.talk.MessageMgr;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveSkillMakeEnhancement__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈囩磽瀹ュ拑韬�殿喛顕ч埥澶娢熼柨瀣澑闂備礁鎲″ú锕傚磻閸曨剚鍙忛柣鎴ｅГ閳锋垿鏌ｉ悢鍛婄凡婵℃彃顭烽弻娑㈠閿涘嫬寮ㄩ梺鎸庣箘閸嬫盯鍩為幋鐙呮嫹閿濆骸浜滃ù婊勵殜閺岀喖鎳栭埡鍕婂淇婇幓鎺撳櫣妞ゎ厼娲﹂妶锝夊礃閳圭偓瀚藉┑鐐舵彧缂嶏拷濠殿喓鍊楀☉鐢稿醇閺囩喓鍘遍梺缁橆焾濞呮洜绮堥崘顔界厵濞撴艾鐏濇慨鍌氣攽闄囬崺鏍ь嚗閸曨叏鎷烽敐搴濈盎濠㈣甯楁穱濠囨倷椤忓嫸鎷烽弽顬℃椽鍩￠崨顓狀唵婵＄偛顑呴崙浠嬪箯妞嬪孩鍠嗛柛鏇ㄥ墰閳规稓绱撴担铏瑰笡缂佽鐗撻幃浼搭敊閼恒儱鍔呴梺闈涱煭缁犳垿鎯傞崟顒傜瘈闁靛骏绲剧涵楣冩煟椤掞拷閵堢顕ｉ幎绛嬫晝闁挎繂娲ㄩ惁鍫ユ⒑濮瑰洤鐏叉繛浣冲嫮顩锋繝濠傚缁诲棙銇勯弽銊у暡闁猴拷閼姐倗纾奸柛灞炬皑瀛濋梺瀹狀潐閸ㄥ綊鏁撻弬銈囩У濞存粎鍋ら弫宥呪槈閵忊檧鎷洪梺鍛婄☉閿曘儲寰勯崟顖涚厱闁靛ň鏅欓幉楣冩煙椤曞棛绡�闁诡喓鍨藉畷妤呮嚃閳轰礁绠ラ梻鍌欒兌椤㈠﹪锝炴径鎰闁哄稁鍘介崑鐔搞亜韫囨挾澧涢柣鎾寸懇閺岋綀顦查柟鑺ョ矌缁瑦绻濆顓犲帾闂佹悶鍎滈崘鍙ョ磾闂備浇妗ㄧ粈渚�宕愭繝姘闁绘宕甸崣鎾淬亜閹捐泛浠﹂柣搴″暱閳规垿鎮╅幇浣告櫛闂佸摜濮甸悧鐘诲极閸愵喖唯闁靛鍠楃�靛矂姊洪懞銉冾亪藝闁秴姹查柨鏂款潟娴滄粓鏌熼弶鍨暢闁伙綀浜槐鎺楁晸閻ｅ矉鎷烽敐搴′簴濞存粍绮撻弻鐔煎箲閹邦厾銆愭繛瀛樼矊缂嶅﹪寮诲☉妯锋瀻婵炲棙鍨归惁鍫濃攽椤旂》鍔熺紒顕呭灦楠炲繘宕ㄧ�涙ê娈熼梺闈涱檧缂嶅洭骞忛悜钘夌妞ゅ繐妫涢敍婊堟⒑鐠恒劌鏋欏┑顔哄�楃划顓㈡偄閸忓吋娅㈡繛瀵稿Т椤戝洤鐣垫担閫涚箚闁靛牆绻戠�氱懓顪冮妶搴″箲闁告梹鍨甸悾鐑藉Ω閳哄﹥鏅ｉ梺缁樺姇閸氾拷闁哥姴锕ら埞鎴︽偐閸偅姣勯梺绋款儐缁嬫垼鐏嬪┑鐐叉閹稿摜绮婚弶搴撴斀闁绘ê鐤囨竟姗�鏌ｉ妶澶岀暫闁哄瞼鍠栧鑽わ拷鐢殿焾婵′粙姊虹紒妯诲蔼闁稿海鏁诲濠氭晲婢跺﹤宓嗛梺缁樺姌椤曟粓骞忛悜钘夋嵍妞ゆ挶鍔嶇�氳鎱ㄥΟ鐓庝壕閻庢熬鎷�
 * @author changhao
 *
 */
public class CLiveSkillMakeEnhancement extends __CLiveSkillMakeEnhancement__ {
	@Override
	protected void process() {
		// protocol handle

		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure liveskillmakeenhancement = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				xbean.Properties prop = xtable.Properties.select(roleid);
				int school = prop.getSchool();
				
				int skilllevel = LiveSkillManager.getInstance().GetEnhanceLevelBySchool(roleid, school);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞剧洴楠炲洭顢涘鍗烆槱闂備焦鐪归崹褰掆�﹀畡閭︽綎缂備焦蓱婵挳鏌ｉ悢鐓庝喊闁搞倕顑呴埞鎴︽倷閹绘帞楠囬梺缁橆殘婵挳鎮鹃悜钘夌疀妞ゆ牗眉濮规姊洪崷顓炲妺闁搞劌缍婇弫宥呪槈閵忥紕鍘介柟鍏兼儗閸ㄥ磭绮旈悽鍛婄厱闁绘ɑ鍓氬▓婊堟煙椤旂櫢鎷烽弬銉︻潔闂侀潧楠忕槐鏇㈠储闁秵鈷戦梻鍫熶緱濡插爼鏌涢妸銉︽儓闁宠绉瑰畷銊╁级閹存繂鏁ら梻浣哄仺閸庢煡宕滃顑撅拷鎺撶節濮橆厾鍘梺鍓插亝缁诲啴藟濠婂啠鏀芥い鏃傚帶閺嗙喓绱掓潏銊ユ诞妞ゃ垺鐟╅幃鍓т沪閹勭彛濠碉紕鍋戦崐銈夊磻閸曨厽宕查柟閭﹀枛瀵弶淇婇悙顏勶拷鏇犳崲閹邦喚鐭撻柣銏㈩焾閻ら箖鏌曡箛瀣拷鏍煕閹达附鍋ｉ柟顓熷笒婵″ジ鏌＄�ｎ偅顥堥柡宀嬬節瀹曨亝鎷呴梹鎰晼闂備礁鎲＄敮妤冩暜閳ユ剚鍤曟い鏇嫹鐎规洖銈搁幃銏ゆ憥閸屾粎澶勭紓鍌氬�搁崐椋庣矆娓氾拷椤㈡牠宕ㄧ�涙ê锟借埖绻濋棃娑卞剰缂佺姵宀搁弻锝夊箛椤旂厧濡洪梺鎶芥敱閸ㄥ湱妲愰幒鏃撴嫹閿濆骸骞楃痪顓炵埣閺岋綀绠涘☉妤佸枤闂佸搫鏈粙鎾绘晸閺傘倗绉甸柛鎾寸懄缁傛帗娼忛埡瀣閻熸瑥瀚粈鍐煕閺冿拷閻熴儵鎮鹃柨瀣檮缂佸鐏濆畵鍡涙⒑缂佹ɑ鐓ラ柟纰卞亰閻涱喖螖閸涱喒鎷绘繛杈剧到閹芥粎绮斿ú顏呯厱閻庯綆浜烽煬顒傦拷瑙勬礉椤顭囪箛娑樼厸闁稿本鑹鹃獮鎴︽⒒娴ｇ瓔鍤冮柛銊ャ偢閹﹢骞囬悧鍫濅画闂備緡鍙忔俊鍥矗閸℃稒鈷戦柛娑橈工婵箑霉濠婂懎浠︽い銊︾懇濮婂宕掑▎鎴М闂佸湱鈷堥崑濠囧箚鐏炴儳绶炵�癸拷閿熺晫绮堟繝鍌橈拷鎺戭潩閻愵剙顏舵俊銈囧Х閸嬫盯宕�涙ɑ鍙忛柨鐔剁矙閺屽秹鎸婃径瀣垫！闁轰礁鐗撳铏规兜閸涱収妫堥梺瑙勬た娴滎亜鐣烽敐鍡欑瘈闁搞儺鐏涢埡鍛厓闁告繂瀚敓鐣屾暬楠炲繐煤椤忓應鎷洪梺鍛婄☉閿曪妇绮婚幘缁樺�垫慨妯煎帶濞呭秹鏌熼鏂よ�块柡灞芥椤撳ジ宕卞▎蹇撶疄闂傚倷鑳剁划顖炴晪缂佸墽铏庨崢浠嬪疾閸洘鍋ㄧ痪鏉款槹鐎氳绻涢崼婵堜虎婵炲懏锕㈤弻娑氾拷锝庝悍闊剟鏌ｅ☉鍗炴灈閾伙綁鏌ゅù瀣珖闁挎稒绮岄埞鎴﹀煡閸℃浠紓渚囧櫘閸ㄥ爼銆侀弮鍫熷亜闁稿繐鐨烽幏缁樼箾鏉堝墽绉┑顔哄�楀☉鐢稿醇閺囩喓鍘遍梺鎸庣箓缁绘帡鎮鹃崹顐闁绘劘灏欑粻濠氭煛娴ｈ宕岄柡浣规崌閺佹捇鏁撻敓锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氶梻鍌欒兌椤牏鎮锕�绀夐幖娣妼缁犵喐鎱ㄥ┑鍡欑伇闁汇倧鎷烽梻浣告惈閸燁偊宕愰弰蹇嬩汗濡わ絽鍟埛鎴︽煕濠靛棗顏柛灞诲姂閺屾盯鍩℃担鍓蹭純閻庢鍣崑濠傜暦閸洦鏁嗗ù锝呮惈鐢箖姊绘繝搴′簻婵炶绠戠叅闁哄诞鍕槑闂傚倸鍊风粈渚�骞栭锔藉創婵炲棙鎸哥粈鍐煟閹伴潧澧柣锔界矒濮婄粯绗熼敓钘夘焽瑜旈幃褔宕卞銏＄☉铻栧ù锝囨嚀瀵潡鎮峰鍕叆妞ゎ偄绻戠换婵嗩潩椤掑偆妲规俊鐐�栭崝鎴﹀春閸曨剙顕遍柛鎰靛枟閸婄敻鎮峰▎蹇擃仾缂侊拷閸愵喗鐓曢柕濠忕畱椤曟粌菐閸パ嶈含闁硅櫕绮撳Λ鍐ㄢ槈濮樿京宓侀梻浣筋嚙閸戠晫绱為崱娑樼婵炲棙鎸惧畵浣猴拷骞垮劚椤︿即鍩涢幋锔藉仯闁搞儜鍐獓闂佸湱娅㈢紞渚�寮婚埄鍐╁閻熸瑥瀚敓鑺ュ姍閺屽秹濡烽婊呮殼閻庤娲滈崢褔鍩為幋锕�鐐婇柕濞у嫷娼犲┑鐘垫暩婵兘寮崨濠冨弿闁绘垵顫曢敓钘夊�块幐濠冪珶閳哄绉�规洏鍔戝鍫曞箣閻欏懐骞㈤梻鍌欐祰椤鐣峰锟介、姘愁槾缂侇喖顭烽、娑㈡倷鐎电寮抽梻浣虹帛濞叉牠宕愰崷顓ㄦ嫹濮樼偓瀚�?  by changhao
				if (skilllevel == 0)
				{
					LiveSkillManager.logger.debug("CLiveSkillMakeEnhancement skilllevel error:" + roleid);
					return true;
				}
				
				int liveskillid = LiveSkillManager.getInstance().GetEnhanceLiveSkillBySchool(school);
				int itemid = LiveSkillManager.getInstance().GetEnhanceItemIdBySchool(school);
							
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(roleid, 
						liveskillid, skilllevel,"闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈囩磽瀹ュ拑韬�殿喛顕ч埥澶娢熼柨瀣澑闂備礁鎲″ú锕傚磻閸曨剚鍙忛柣鎴ｅГ閳锋垿鏌ｉ悢鍛婄凡婵℃彃顭烽弻娑㈠閿涘嫬寮ㄩ梺鎸庣箘閸嬫盯鍩為幋鐙呮嫹閿濆骸浜滃ù婊勵殜閺岀喖鎳栭埡鍕婂淇婇幓鎺撳櫣妞ゎ厼娲﹂妶锝夊礃閳圭偓瀚藉┑鐐舵彧缂嶏拷濠殿喓鍊楀☉鐢稿醇閺囩喓鍘遍梺缁橆焾濞呮洜绮堥崘顔界厵濞撴艾鐏濇慨鍌氣攽闄囬崺鏍ь嚗閸曨叏鎷烽敐搴濈盎濠㈣甯楁穱濠囨倷椤忓嫸鎷烽弽顬℃椽鍩￠崨顓狀唵婵＄偛顑呴崙浠嬪箯妞嬪孩鍠嗛柛鏇ㄥ墰閳规稓绱撴担铏瑰笡缂佽鐗撻幃浼搭敊閼恒儱鍔呴梺闈涱煭缁犳垿鎯傞崟顒傜瘈闁靛骏绲剧涵楣冩煟椤掞拷閵堢顕ｉ幎绛嬫晝闁挎繂娲ㄩ惁鍫ユ⒑濮瑰洤鐏叉繛浣冲嫮顩锋繝濠傚缁诲棙銇勯弽銊у暡闁猴拷閼姐倗纾奸柛灞炬皑瀛濋梺瀹狀潐閸ㄥ綊鏁撻弬銈囩У濞存粎鍋ゅ鏄忣樄婵﹪缂氶妵鎰板箳閹垮嫮鍚归梻浣虹帛鐢亞绮婚幘璇茬畺闁跨喓濮村敮闂佸啿鎼崐濠氬储娴犲鈷戦柛婵嗗瀹告繈鏌涚�ｎ偆娲撮柡浣规崌閹稿﹥寰勭�ｎ厾顢呴梻浣芥硶閸犳洘鎱ㄩ妶澶嬪亜妞ゆ帒瀚粻顖炴煥閻曞倹瀚�", YYLoggerTuJingEnum.tujing_Value_fumo, false);
				
				if (energyenough == false) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈嗐亜椤撶姴鍘寸�殿喖顭烽弫鎰緞婵犲嫮鏉告俊鐐�栫敮濠囨倿閿曞倸纾块柟鍓х帛閳锋垿鏌熼懖鈺佷粶濠碘�炽偢閺屾稒绻濋崒娑樹淮閻庢鍠栭…鐑藉极閹邦厼绶炲┑鐘插缂嶅倿姊绘担铏瑰笡闁挎岸鏌涢悢閿嬪仴鐎殿喗濞婂畷濂稿Ψ閿旇瀚肩紓鍌欑椤戝棝顢栧▎鎾崇？闊洦鏌ｆ禍婊堟煙鐎涙绠ユ俊顖ゆ嫹闁诲孩顔栭崰鏍�﹂柨瀣╃箚闁归棿绀侀悡娑㈡煕鐏炲墽鐓紒銊ょ矙濮婄粯鎷呮笟顖滃姼闂佸搫鐗滈崜娑氬垝濞嗘挸绠ｉ柨鏃傜帛閺呮粓姊虹捄銊ユ珢闁瑰嚖鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻鐔虹磼閵忕姵鐏嶉梺绋块椤︻垶鈥﹂崸妤佸殝闂傚牊绋戦～宀�绱撴担鍝勭彙闁搞儯鍔庨崢閬嶆⒑閸濆嫮袪闁稿﹥娲橀弲鍫曞蓟閵夛箑锟藉灚鎱ㄥ鍡楀缂佸妞介弻鈥崇暆閿熶粙宕伴弽褏鏆︽繝濠傛－濡查箖鏌ｉ姀鈺佺仭闁烩晩鍨跺璇测槈濞嗘垹鐦堥梺绋挎湰缁嬫垶绂掗幘顔解拺闁告繂瀚～锕傛煕閺冿拷閸ㄧ敻顢氶敐澶婄妞ゆ棁妫勯敓鐣屽厴閹綊宕堕崶褍顏╂い蹇撶埣濮婃椽宕ㄦ繝鍕ㄦ濡炪値鍙庨崜鐔奉嚕閵婏箑顕遍悗娑櫱氶幏濠氭⒑缁嬫寧婀伴柣鐔村姂瀹曟鐣濋敓鐣屾閹烘鏁嬮柛娑卞幘娴犳悂鎮楀▓鍨灈妞ゎ參鏀辨穱濠囧箹娴ｅ摜鍘告繛杈剧到瑜般劑寮撮姀锛勫幗闁瑰吋鎯岄崹宕囩矓閻㈠憡鐓曢柣妯诲墯濞堟粎锟借娲橀崹鍨暦閹烘鍊烽悗鐢殿焾楠炴劙姊绘担瑙勫仩闁稿寒鍨跺畷鏇㈡焼瀹ュ棗锟借埖銇勮箛鎾跺闁绘挾鍠栭弻鐔煎箚瑜嶉懜褰掓煕閺冩挾鐣甸柡灞革拷宕囨殕閻庯綆鍓涜ⅵ闁诲孩顔栭崰妤呭箰閹惰棄绠栨繛鍡樺灦鐎氭氨鎲告惔锝忔嫹濮橆剛绉洪柡灞剧洴閺佸倻鎷犻幓鎺嶇礋闂備胶鎳撻崲鏌ュ床閺屻儻缍栨繝闈涱儐閸婇攱銇勯幒鐐村濡炪倕楠忛幏锟�? by changhao
				{
					java.util.List<String> parameters = new java.util.ArrayList<String>();
					String s = Integer.toString(LiveSkillManager.getInstance().NeedEnergy(liveskillid, skilllevel));
					parameters.add(s);
					MessageMgr.psendMsgNotify(roleid, 143432, parameters);
					return true;						
				}							
				
				Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, false);
								
				SLiveSkillMakeEnhancement msg = new SLiveSkillMakeEnhancement();
				
				fire.pb.item.groceries.AttrUpItem item = (fire.pb.item.groceries.AttrUpItem)fire.pb.item.Module.getInstance().getItemManager().genItemBase(itemid, 1);
				item.GenAttr(skilllevel);
				
				if (bag.isFull())
				{
					fire.pb.item.ItemMaps tempBag = fire.pb.item.Module.getInstance().getItemMaps(roleid, BagTypes.TEMP, false);
					if (tempBag.doAddItem(item, -1, LiveSkillManager.Enhancement, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_fumoget, 2) != AddItemResult.SUCC)
					{
						return false;
					}
				}
				else
				{
					if(bag.doAddItem(item, -1, LiveSkillManager.Enhancement, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_fumoget, 2) != AddItemResult.SUCC)
					{
						return false;
					}						
				}
				
				List<String> param = new ArrayList<String>();
				param.add(item.getName());
				param.add("ffffff00");
				MessageMgr.psendMsgNotify(roleid, 150107, param);				
				mkdb.Procedure.psendWhileCommit(roleid, msg);
				
				return true;
			}
		};
		
		liveskillmakeenhancement.submit();			
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800525;

	public int getType() {
		return 800525;
	}


	public CLiveSkillMakeEnhancement() {
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
		if (_o1_ instanceof CLiveSkillMakeEnhancement) {
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

	public int compareTo(CLiveSkillMakeEnhancement _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

