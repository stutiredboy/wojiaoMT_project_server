
package fire.pb.fushi.monthcard;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGrabMonthCardRewardAll__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊块幐濠冪珶閳哄绉�规洏鍔戝鍫曞箣閻欏懐骞㈤梻鍌欑閹测剝绗熷Δ鍛煑閹兼番鍔嶉崑鍕煕閳╁厾鑲╂崲閸℃ǜ浜滈柡宥冨妿閹冲懐绱掓径瀣嚋缂佺粯鐩獮瀣倻閸℃瑥濮遍梻浣告惈閸燁偊鎮ч崱娆戠焼閻庯綆鍠楅悡鍐煟濮橆剛鎽犻悗姘辨嚀閳规垿顢欏▎鐐秷濡炪們鍔岄敃銈夛綖韫囨拋娲敂閸曨収鍟囬梻浣虹帛閸旀牞銇愰崘鈺傚弿闁割偅娲橀埛鎴︽煕濞戞﹫鏀婚悘蹇庡嵆閺岋綁鎮㈠┑鍡樺闁哄懏鎮傞弻銈夊箒閹烘垵濮ゆ繝銏ｎ潐钃遍柕鍥у閺佸倿鎮欓浣圭槗闁诲孩顔栭崰娑㈩敋瑜旈崺銉﹀緞閹邦剦娼婇梺鍐叉惈閸婄懓鈻嶉崶顒佲拻濞达絿鎳撻婊呯磼鐠囨彃锟藉摜鍙呴梺闈浥堥弲婊堝磻閳哄懏鈷掗柛顐ゅ枎閸樼兘鏌￠崘銊у闁稿鍔欏濠氬醇閻旇　妫╅梺鍝勵樈閸欏啫顫忓ú顏勭闁绘劖褰冮‖鍫㈢磽閸屾氨孝闁挎洦浜滈悾宄懊洪鍛拷鐑芥煕濠靛棗顏い鎾存そ濮婃椽骞愭惔銏⑩敍闂佸湱鍏橀ˉ鎾绘儉椤忓牆绠氱憸宥夊箖閹寸姷纾肩紓浣诡焽濞插瓨顨ラ悙宸剶闁诡喗鐟ч幑鍕瑹椤栨侗妫ㄩ梻鍌氬�烽悞锕傚礈濮橆厾顩查柨婵嗩檧缂嶆牕顭跨捄鐑樻拱鐎规洖寮剁换婵嬫濞戞瑯妫忛梺鍝勵儐濡啴寮诲☉鈶╋拷锕傚箣濠靛洨浜堕梻浣虹帛缁诲秹宕圭捄渚綎婵炲樊浜濋崑锟犳煛婢跺顕滄い鏃撴嫹闂傚倷鑳堕幊鎾诲吹閺嶎厼绠柨鐕傛嫹 by changhao
 *
 */
public class CGrabMonthCardRewardAll extends __CGrabMonthCardRewardAll__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
		{
			return;
		}
		
		mkdb.Procedure grabmonthcardreward = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				xbean.EMonthCard monthcard = xtable.Roleid2monthcard.get(roleid);
				if (monthcard != null)
				{
					boolean grab = fire.pb.fushi.MonthCardManager.getInstance().IsGrabReward(roleid, monthcard.getGrabtime());
					if (grab == true) //闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冪Ч閿濈偛鈹戠�ｎ偅娅囬梺绋跨焿婵″洨绮欒箛鏃傜瘈闁靛骏绲介悡鎰版煕閺冿拷閻楃姴鐣烽幋锕�围濠㈣泛顑囬崢鎼佹⒑閹肩偛鍔楅柡鍛☉閻剟姊绘担铏瑰笡閻㈩垱甯￠弫鍐Ψ瑜庡畷鍙夌箾閹存瑥鐏╂鐐灪娣囧﹪顢涘┑鍥朵哗婵炲濮甸幐鍐差潖濞差亜绠归柣鎰絻椤绱撴担绛嬪殭闁绘鎸搁锝囨嫚瀹割喖鎮戞繝銏ｆ硾閿曪箓宕㈤崨濠勭閺夊牆澧介崚浼存煙鐠囇呯瘈闁诡喗锕㈠鎾偐閻㈢绱冲┑鐐舵彧缁插潡骞婇幘璇叉瀬闁告挆鍛紳閻庡箍鍎辩�氼喚绮ｉ弮鍌︽嫹濞堝灝鏋︽い鏇嗗洤鐓″鑸靛姇椤懘鏌ｅ锟藉褎鎱ㄩ崼鏇熲拻濞达絽鎲￠崯鐐烘煕閺冿拷椤ㄥ﹤鐣烽幋锕�绠荤紓浣姑禒濂告⒑閸涘﹥灏柤鍐插婢规洟鎸婃竟婵嗙秺閺佹劙宕堕妸銉︾暚缂傚倷娴囩亸娆戝垝椤栨粍宕叉繛鎴炵煯閻掑﹪鏌″鍛粵閻庢艾缍婇弻鐔革紣娴ｄ警妲┑鐐茬墑閸旀垵顫忓ú顏勭闁圭粯甯婄花鐓庘攽閻愭彃绾ч柣妤冨█楠炲啴鍨鹃弬銉︻潔濠碘槅鍨扮换鎰礊婵犲洤鏋侀柟鐗堟緲闁卞洦銇勯幇鍓佹偧缂佸鍏樺缁樻媴缁涘娈愰梺鍝ュУ椤ㄥ﹪骞冮悜钘壩ㄩ柍瑙勬嫕閹风兘寮崼婵堫槰濡炪倖鏌ㄥΣ鍫ｎ樄闁哄本鐩獮鍥煛娴ｅ壊鐎虫俊鐐�ら崜娆撍囬棃娑辨綎婵炲樊浜濋崐濠氭煃閸濆嫬锟藉綊鎮甸敃鍌涒拺闁硅偐鍋涙俊娲煕濡や礁鈻曟鐐插暣楠炲棜顦撮柡鍡楊儔閺岀喐鎷呴崘鈺冨涧闂佸搫鍋婇幏鐑芥⒒娴ｇ瓔鍤欓柛鎴犳櫕缁辩偤宕卞Ο纰辨锤闂佺粯鍔楅崕銈夊磻閸岀偞鐓欓悗娑欘焽婵″洭鏌￠敓鑺ョ鐎ｎ偆鍘撻梺鑺ッˇ浼此夊鍫熺厽闊洢鍎崇粔顕�鏌＄仦鍓р槈閾伙綁鏌ｅΟ鍝勭骇闁瑰吋鍔欓弻锝夊Χ婢跺瞼鏆梺鍝勮閸旀垿骞冮妶澶婄＜婵炴垶锕╂导锟� by changhao
					{
						return false;
					}
					
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垻绮穱濠囨倷椤忓嫸鎷烽弽顓熷亱婵犲﹤鐗嗙壕缁樼箾閹存瑥鐏╅柛銊ュ�块弻娑氫沪閸撗�妫ㄦ繛瀛樼矋缁捇寮婚垾鎰佸悑闁告劑鍔岄‖瀣⒑闂堟稒顥為悽顖涱殜婵＄敻宕熼姘卞幐闂佺鏈划灞筋嚕閵娾晜鈷戦柛婵嗗閻忛亶鏌涢悩宕囧⒌妤犵偛鍟…銊╁礂閸撗冩灁缂佽鲸甯掕灒闁告繂瀚ˉ鎺旂磽閸屾艾锟芥悂宕愰悜鑺ュ�块柨鏇炲�搁懜褰掓煠婵劕锟芥绮堟繝鍌橈拷鎺戭潩閻愵剙顏堕柣搴㈩問閸犳盯顢氳閸┿儲寰勯幇顒夋綂闂佺粯锕㈠褎鎱ㄩ崼鏇熲拻濞达絽鎲￠崯鐐烘煕閺冿拷椤ㄥ﹤鐣烽幋锕�绠荤紓浣姑禒濂告⒑閸涘﹥灏柤鍐插婢规洟鎸婃竟婵嗙秺閺佹劙宕堕妸銉︾暚缂傚倷鐒﹁ぐ鍐�﹂悜钘夎摕闁挎繂鐗忛悿锟介梺鍝勫暙閸婂鎮块崟顖涒拺缂侇垱娲樺▍鍥煕鐎ｃ劌锟芥繈鎮伴鎾呮嫹閿濆骸鏋熼柡鍛箞閺屻劑鎮㈤悜妯荤彧婵犮垼顫夊ú鐔风暦濡ゅ懏鍤冮柍鍝勫枤閸熷酣姊绘担鐑樺殌妞ゆ洦鍙冨畷鎴︽偐瀹曞洨褰惧┑顔筋殣閹风兘鏌＄仦鐣屝фい銏℃瀹曞爼鎳滈悽鐢敌ョ紓鍌氬�烽懗鍓佸垝椤栨粍宕查柛宀�鍋涢悡婵嬫煙閹规劦鍤欓柛銊ュ�归妵鍕籍閸屾稒鐝悷婊呭閻撯�愁潖缂佹ɑ濯撮柣鎴灻▓宀勬⒑閹肩偛锟芥牠鎮ч悩鑽ゅ祦闊洦绋掗弲鎼佹煥閻曞倹瀚� by changhao
					{
						xbean.Properties prop = xtable.Properties.select(roleid);
						if (prop == null)
						{
							return false;
						}
						
						fire.pb.item.Pack bag = (fire.pb.item.Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, false);

						if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�妞ゆ劦婢�缁墎绱撴笟濠冨婵犮垼娉涢鍕崲閸℃稒鐓忛柛顐ｇ箖閸ｆ椽鏌涢敐鍛础缂佽鲸甯￠幃鈺呮濞戞帗鐎伴梻浣告惈閻ジ宕伴弽顓犲祦闁糕剝鍑瑰Σ楣冩⒑閹稿海鈽夌紒澶婄秺瀵鏁撻悩鎻掕�垮銈嗘尵婵兘寮抽妶鍛斀妞ゆ梻銆嬮弨缁樹繆閻愭壆鐭欓柕鍡曠铻栭柛娑卞枟濞呫垽姊烘导娆戝埌闁活剙銈搁幆宀勫箻缂佹ê锟界敻鏌ｉ姀鐘冲暈濞存嚎鍊濋弻鐔风暋閺夋寧些濡炪値鍋呯换鍫ャ�佸Δ浣哥窞閻庯絾鎸堕崝鎴濐潖閾忚宕夐柕濞垮劜閻忓棗鈹戦埥鍡椾簻閻庢凹鍠氶崚鎺旀嫚瀹割喖鎮戞繝銏ｆ硾閿曪箓鏁嶉悢鍏尖拻濞撴艾娲ゆ晶顔剧磼婢跺鍤熺紒顔碱煼閹晝鎷犻懠顒夊晣闂備礁婀遍埛鍫ュ储妤ｅ啫鍌ㄦ繝濠傛噽绾剧晫锟藉箍鍎卞Λ娑欐櫠閻㈠憡鐓涢悘鐐靛亾缁�瀣拷瑙勬礈閸樠囧煘閹达箑绠涙い鎾筹紡閸ャ劉鎷虹紓鍌欑劍钃遍悘蹇曞缁绘盯鎳犻锟介弸娑氾拷娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�? by changhao
						{
							java.util.Map<Integer, fire.pb.fushi.SMonthCardConfigDayPay> config = fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.fushi.SMonthCardConfigDayPay.class);
							for (fire.pb.fushi.SMonthCardConfigDayPay e : config.values())
							{
								if (e.getType() == 1)
								{
									java.util.Map<String, Object> paras = new java.util.HashMap<String, Object>(10);
									paras.put(fire.pb.activity.award.RewardMgr.ROLE_LEVEL, prop.getLevel());
									fire.pb.activity.award.RewardMgr.getInstance().distributeAllAward(roleid, e.getRewardid(), paras, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 0,fire.pb.PAddExpProc.OTHER, "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠樼紒顔界懇楠炴帒螖閿熺晫澹曟繝姘�甸柨婵嗛閺嬬喖鏌ｉ幘瀛樼闁哄苯绉归崺鈩冩媴閸涘﹦浜炬繝鐢靛仜閻楀﹪鏁冮姀銈呰摕闁跨喓濮撮獮銏°亜閹捐泛啸闁哄棎鍊濋幃妤�鈻撻崹顔界亪闂佺粯鐗滈崢褔鎮鹃悜鑺ュ亗閹煎瓨蓱椤秴鈹戦埥鍡楃仧閻狅拷閿曞倹鍊甸柣鎴ｅГ閳锋帡鏌涚仦鎹愬闁跨喕妫勯幗婊堟晸閼恒儱鍤柛鎾寸洴閺佹捇鎳為妷褏鍙濋梺鍛婎殔閸熷潡顢氶敐鍡欑瘈婵﹩鍓涙导瀣倵鐟欏嫭绀�婵炶绠戦埢鎾绘偂鎼搭喗瀵岄梺闈涚墕濡瑩鍩涢幒妤佺厱婵☆垳濮村ú銈夊几娴ｅ箍浜滈煫鍥ㄦ尵婢ф盯鏌ｉ幘鍗炲姦闁哄矉缍佸鎾倷鐠囇勫闁革富鍙忛幏宄邦潩閻愵剙顏�");										
								}
								else if (e.getType() == 0)
								{
									if (bag.isFull())
									{
										fire.pb.item.ItemMaps tempBag = fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.TEMP, false);
										
										if (tempBag.doAddItem(e.getItemid(), e.getItemnum(), "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠樼紒顔界懇楠炴帒螖閿熺晫澹曟繝姘�甸柨婵嗛閺嬬喖鏌ｉ幘瀛樼闁哄苯绉归崺鈩冩媴閸涘﹦浜炬繝鐢靛仜閻楀﹪鏁冮姀銈呰摕闁跨喓濮撮獮銏°亜閹捐泛啸闁哄棎鍊濋幃妤�鈻撻崹顔界亪闂佺粯鐗滈崢褔鎮鹃悜鑺ュ亗閹煎瓨蓱椤秴鈹戦埥鍡楃仧閻狅拷閿曞倹鍊甸柣鎴ｅГ閳锋帡鏌涚仦鎹愬闁跨喕妫勯幗婊堟晸閼恒儱鍤柛鎾寸洴閺佹捇鎳為妷褏鍙濋梺鍛婎殔閸熷潡顢氶敐鍡欑瘈婵﹩鍓涙导瀣倵鐟欏嫭绀�婵炶绠戦埢鎾绘偂鎼搭喗瀵岄梺闈涚墕濡瑩鍩涢幒妤佺厱婵☆垳濮村ú銈夊几娴ｅ箍浜滈煫鍥ㄦ尵婢ф盯鏌ｉ幘鍗炲姦闁哄矉缍佸鎾倷鐠囇勫闁革富鍙忛幏宄邦潩閻愵剙顏�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != e.getItemnum())
										{
											return false;
										}
									}
									else
									{
										if (bag.doAddItem(e.getItemid(), e.getItemnum(), "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠樼紒顔界懇楠炴帒螖閿熺晫澹曟繝姘�甸柨婵嗛閺嬬喖鏌ｉ幘瀛樼闁哄苯绉归崺鈩冩媴閸涘﹦浜炬繝鐢靛仜閻楀﹪鏁冮姀銈呰摕闁跨喓濮撮獮銏°亜閹捐泛啸闁哄棎鍊濋幃妤�鈻撻崹顔界亪闂佺粯鐗滈崢褔鎮鹃悜鑺ュ亗閹煎瓨蓱椤秴鈹戦埥鍡楃仧閻狅拷閿曞倹鍊甸柣鎴ｅГ閳锋帡鏌涚仦鎹愬闁跨喕妫勯幗婊堟晸閼恒儱鍤柛鎾寸洴閺佹捇鎳為妷褏鍙濋梺鍛婎殔閸熷潡顢氶敐鍡欑瘈婵﹩鍓涙导瀣倵鐟欏嫭绀�婵炶绠戦埢鎾绘偂鎼搭喗瀵岄梺闈涚墕濡瑩鍩涢幒妤佺厱婵☆垳濮村ú銈夊几娴ｅ箍浜滈煫鍥ㄦ尵婢ф盯鏌ｉ幘鍗炲姦闁哄矉缍佸鎾倷鐠囇勫闁革富鍙忛幏宄邦潩閻愵剙顏�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != e.getItemnum())
										{
											return false;
										}
									}				
								}
							}							
						}
						else
						{
							java.util.Map<Integer, fire.pb.fushi.SMonthCardConfig> config = fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.fushi.SMonthCardConfig.class);
							for (fire.pb.fushi.SMonthCardConfig e : config.values())
							{
								if (e.getType() == 1)
								{
									java.util.Map<String, Object> paras = new java.util.HashMap<String, Object>(10);
									paras.put(fire.pb.activity.award.RewardMgr.ROLE_LEVEL, prop.getLevel());
									fire.pb.activity.award.RewardMgr.getInstance().distributeAllAward(roleid, e.getRewardid(), paras, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 0,fire.pb.PAddExpProc.OTHER, "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠樼紒顔界懇楠炴帒螖閿熺晫澹曟繝姘�甸柨婵嗛閺嬬喖鏌ｉ幘瀛樼闁哄苯绉归崺鈩冩媴閸涘﹦浜炬繝鐢靛仜閻楀﹪鏁冮姀銈呰摕闁跨喓濮撮獮銏°亜閹捐泛啸闁哄棎鍊濋幃妤�鈻撻崹顔界亪闂佺粯鐗滈崢褔鎮鹃悜鑺ュ亗閹煎瓨蓱椤秴鈹戦埥鍡楃仧閻狅拷閿曞倹鍊甸柣鎴ｅГ閳锋帡鏌涚仦鎹愬闁跨喕妫勯幗婊堟晸閼恒儱鍤柛鎾寸洴閺佹捇鎳為妷褏鍙濋梺鍛婎殔閸熷潡顢氶敐鍡欑瘈婵﹩鍓涙导瀣倵鐟欏嫭绀�婵炶绠戦埢鎾绘偂鎼搭喗瀵岄梺闈涚墕濡瑩鍩涢幒妤佺厱婵☆垳濮村ú銈夊几娴ｅ箍浜滈煫鍥ㄦ尵婢ф盯鏌ｉ幘鍗炲姦闁哄矉缍佸鎾倷鐠囇勫闁革富鍙忛幏宄邦潩閻愵剙顏�");										
								}
								else if (e.getType() == 0)
								{
									if (bag.isFull())
									{
										fire.pb.item.ItemMaps tempBag = fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.TEMP, false);
										
										if (tempBag.doAddItem(e.getItemid(), e.getItemnum(), "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠樼紒顔界懇楠炴帒螖閿熺晫澹曟繝姘�甸柨婵嗛閺嬬喖鏌ｉ幘瀛樼闁哄苯绉归崺鈩冩媴閸涘﹦浜炬繝鐢靛仜閻楀﹪鏁冮姀銈呰摕闁跨喓濮撮獮銏°亜閹捐泛啸闁哄棎鍊濋幃妤�鈻撻崹顔界亪闂佺粯鐗滈崢褔鎮鹃悜鑺ュ亗閹煎瓨蓱椤秴鈹戦埥鍡楃仧閻狅拷閿曞倹鍊甸柣鎴ｅГ閳锋帡鏌涚仦鎹愬闁跨喕妫勯幗婊堟晸閼恒儱鍤柛鎾寸洴閺佹捇鎳為妷褏鍙濋梺鍛婎殔閸熷潡顢氶敐鍡欑瘈婵﹩鍓涙导瀣倵鐟欏嫭绀�婵炶绠戦埢鎾绘偂鎼搭喗瀵岄梺闈涚墕濡瑩鍩涢幒妤佺厱婵☆垳濮村ú銈夊几娴ｅ箍浜滈煫鍥ㄦ尵婢ф盯鏌ｉ幘鍗炲姦闁哄矉缍佸鎾倷鐠囇勫闁革富鍙忛幏宄邦潩閻愵剙顏�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != e.getItemnum())
										{
											return false;
										}
									}
									else
									{
										if (bag.doAddItem(e.getItemid(), e.getItemnum(), "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠樼紒顔界懇楠炴帒螖閿熺晫澹曟繝姘�甸柨婵嗛閺嬬喖鏌ｉ幘瀛樼闁哄苯绉归崺鈩冩媴閸涘﹦浜炬繝鐢靛仜閻楀﹪鏁冮姀銈呰摕闁跨喓濮撮獮銏°亜閹捐泛啸闁哄棎鍊濋幃妤�鈻撻崹顔界亪闂佺粯鐗滈崢褔鎮鹃悜鑺ュ亗閹煎瓨蓱椤秴鈹戦埥鍡楃仧閻狅拷閿曞倹鍊甸柣鎴ｅГ閳锋帡鏌涚仦鎹愬闁跨喕妫勯幗婊堟晸閼恒儱鍤柛鎾寸洴閺佹捇鎳為妷褏鍙濋梺鍛婎殔閸熷潡顢氶敐鍡欑瘈婵﹩鍓涙导瀣倵鐟欏嫭绀�婵炶绠戦埢鎾绘偂鎼搭喗瀵岄梺闈涚墕濡瑩鍩涢幒妤佺厱婵☆垳濮村ú銈夊几娴ｅ箍浜滈煫鍥ㄦ尵婢ф盯鏌ｉ幘鍗炲姦闁哄矉缍佸鎾倷鐠囇勫闁革富鍙忛幏宄邦潩閻愵剙顏�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != e.getItemnum())
										{
											return false;
										}
									}				
								}
							}								
						}
					}
					
					monthcard.setGrabtime(System.currentTimeMillis());
					
					fire.pb.fushi.MonthCardManager.getInstance().SendMonthCardInfo(roleid);
				}
				
				return true;
			}
		};
		grabmonthcardreward.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812690;

	public int getType() {
		return 812690;
	}


	public CGrabMonthCardRewardAll() {
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
		if (_o1_ instanceof CGrabMonthCardRewardAll) {
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

	public int compareTo(CGrabMonthCardRewardAll _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

