
package fire.pb.fushi.monthcard;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGrabMonthCardReward__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/**
 * 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ銈囩磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿京纾藉ù锝堟鐢稓绱掔�ｎ偄绗掓い鏇樺劦瀹曠喖顢橀妸锕�顏堕梺鎸庣箓妤犲憡绂嶉悙娣簻闁挎柨鐏濆畵鍡涙煙椤旂瓔娈旈柍缁樻崌瀹曞綊顢欓悾灞借拫闂傚倷鑳堕…鍫ヮ敄閸涘瓨鏅濋柕澶涘閳瑰秴鈹戦悩鍙夊闁搞倕顑夊濠氬醇閻旀亽锟芥帞绱掗幇顔间槐闁哄矉绲鹃幆鏃堫敍濠婂憛锝嗙箾鐎涙鐭嬬紒璇茬墦楠炲啴骞愭惔銏狀�撻梻渚囧亝缁嬫挾绮诲鑸碘拺缂備焦锚婵箑霉濠婂嫮鐭掗柡浣规崌閹崇偤濡烽敂缁㈡Ф闂備胶鎳撶粻宥夊垂娴犲宓侀柛銉墻閺佸嫰鏌嶉崫鍕拷濠氬煡婢舵劖鐓冮悹鍥ㄧ叀閸欏嫭顨ラ悙杈捐�块柟鐓庣秺椤㈡洟濡疯瑜板倿姊婚崒姘拷鐑芥嚄閸撲礁鍨濇い鏍亹閿熸枻绠撳畷鍫曞煛娴ｅ摜浜版俊鐐�栭悧婊堝磻閻愬搫纾婚柛宀�鍋為悡娑㈡煕閵夛絽鍔氶柣蹇ｄ邯閺岋綁骞樼�靛憡鍣伴梺鍝勭焿缂嶄線鐛�ｎ喗鍊舵繛鑼额唺闁垶鏌熼鏂よ�块柡浣稿�归幈銊╁箛椤忓棛娉块梻鍌欑窔濞佳嚶ㄩ敓鐣岀磼闊厾鐭欓柟顔斤耿瀵濡烽敂鎯у箰闂佽绻掗崑娑欐櫠娴犲鐓″鑸靛姈閹虫岸鏌ㄥ┑鍡樺窛缁炬儳銈搁幃妤呮晲鎼存繄鐩庨梺娲荤厜缁绘繈寮婚悢椋庢殝闁哄瀵т簺闂備礁鐤囬～澶愬垂瑜版帗鏅搁柡鍌樺�楃粔闈浢瑰鎰М妤犵偞顨婂鎾閳撅拷閹疯櫣绱撴笟鍥х仭婵炲弶鐗楅弲鍫曟嚑椤掑倻锛滈柣搴秵閸嬪嫰鎮橀埡鍐＜妞ゆ柨澧界敮娑氱磼缂佹绠撴い顐ｇ箞椤㈡﹢鎮╅幓鎺旂杽闂傚倸鍊风粈浣虹礊婵犲洤纾诲┑鐘叉搐閸屻劑鏌ゅù瀣珔缂佽翰鍊濋弻銈嗘叏閹邦剨鎷峰Δ鍐棜濠靛倸鎲￠崑锝吤归敐鍥╂憘婵炲吋鍔欓幃妤�顫濋悙顒�顏� by changhao
 * @author Administrator
 *
 */
public class CGrabMonthCardReward extends __CGrabMonthCardReward__ {
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
				//xbean.EMonthCard monthcard = xtable.Roleid2monthcard.get(roleid);
				if (true)
				{
					xbean.Properties prop = xtable.Properties.select(roleid);
					if (prop == null)
					{
						return false;
					}
					
					fire.pb.item.Pack bag = (fire.pb.item.Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, false);
					int num = bag.removeItemById(itemid, 1, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard, 0, "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟閹间礁绫嶉柛顐ｆ儕閵夆晜鐓曢柟鑸妽濞呭棝鏌涙惔锝呮灈闁哄本娲濈粻娑氾拷锝庝簽閸旀潙鈹戦悙鎻掔骇闁诡喖鍊搁～蹇涙惞閸︻厾锛滃┑鈽嗗灠閹碱偊锝炲畝鍕拺闁革富鍘搁幏锟犳煕鐎ｎ亷宸ユい鏇秮瀹曘劍绻濋崟顓熷殞闂備浇娉曢崰鏇炍涢崟顖ょ稏闊洦鎷嬪ú顏嶆晜鐎广儱妫欏▍宀勬⒒娴ｈ姤纭堕柛鐘虫崌瀵煡顢曢妶鍛亰闂佸搫鍟崑濠囧箯閻戣姤顥堟繛鎴炵懄閸犳劙姊哄ú璇插箹婵☆偅绻堝璇测槈閵忕姷鍔撮梺鍛婂姦娴滄牕顬婇妸鈺傗拺缂備焦蓱鐏忕増绻涢懠顒�鏋涚�殿喛顕ч鍏煎緞婵犲嫬骞愬┑鐐舵彧缁蹭粙骞夐垾鏂ユ灁闁割偅娲橀埛鎴︽倵閸︻厼校妞ゃ儱顦伴妵鍕晜閻愵剚姣堝Δ鐘靛仜閸燁垳绮嬮幒鏃撴嫹閿濆懐浠涢柡鍜佸墮閳规垿鎮欓弶鎴犱桓闁艰￥鍊濋弻锛勶拷锝庡亞閹冲啴鏌嶇憴鍕伌妞ゃ垺鐟у☉鐢告煥鐎ｎ偅姣庡┑鐘殿暜缁辨洟宕戝Ο鐓庡灊婵炲棙鎸歌繚婵炶揪缍�閸婁粙寮敓浠嬪箯閸涘瓨鍋￠梺顓ㄨ閹风兘骞樼紒妯锋嫼闂佺厧顫曢崐鏇㈠几閹存繍鐔嗛柣鐔哄椤ャ垽鏌曢崱妤�锟藉灝顕ｆ繝姘ㄩ柨鏃囶潐鐎氳棄鈹戦悙鑸靛涧缂佽弓绮欓獮澶愭晸閻樿尙鏌堥梺缁樺姉閸庛倝鎮￠悢鍏肩厽闁哄啫鐗婇敍鐔兼煙閼碱剙浜炬い銊ｅ劦閹瑩鎳犻鍌ゅ晪闂備浇妗ㄩ悞锕傚箲閸ヮ剙鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘");
					if (num != 1)
					{
						return false;
					}

					if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�妞ゆ劦婢�缁墎绱撴笟濠冨婵犮垼娉涢鍕崲閸℃稒鐓忛柛顐ｇ箖閸ｆ椽鏌涢敐鍛础缂佽鲸甯￠幃鈺呮濞戞帗鐎伴梻浣告惈閻ジ宕伴弽顓犲祦闁糕剝鍑瑰Σ楣冩⒑閹稿海鈽夌紒澶婄秺瀵鏁撻悩鎻掕�垮銈嗘尵婵兘寮抽妶鍛斀妞ゆ梻銆嬮弨缁樹繆閻愭壆鐭欓柕鍡曠铻栭柛娑卞枟濞呫垽姊烘导娆戝埌闁活剙銈搁幆宀勫箻缂佹ê锟界敻鏌ｉ姀鐘冲暈濞存嚎鍊濋弻鐔风暋閺夋寧些濡炪値鍋呯换鍫ャ�佸Δ浣哥窞閻庯絾鎸堕崝鎴濐潖閾忚宕夐柕濞垮劜閻忓棗鈹戦埥鍡椾簻閻庢凹鍠氶崚鎺旀嫚瀹割喖鎮戞繝銏ｆ硾閿曪箓鏁嶉悢鍏尖拻濞撴艾娲ゆ晶顔剧磼婢跺鍤熺紒顔碱煼閹晝鎷犻懠顒夊晣闂備礁婀遍埛鍫ュ储妤ｅ啫鍌ㄦ繝濠傛噽绾剧晫锟藉箍鍎卞Λ娑欐櫠閻㈠憡鐓涢悘鐐靛亾缁�瀣拷瑙勬礈閸樠囧煘閹达箑绠涙い鎾筹紡閸ャ劉鎷虹紓鍌欑劍钃遍悘蹇曞缁绘盯鎳犻锟介弸娑氾拷娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�? by changhao
					{
						fire.pb.fushi.SFreeDisRewardConfigDayPay e = fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.fushi.SFreeDisRewardConfigDayPay.class).get(itemid);
						if (e == null)
						{
							return false;
						}
						
						int count = 0;
						for (Integer id : e.itemids)
						{
							Integer itemnum = rewarddistribution.get(id);
							if (itemnum != null)
							{
								if (bag.isFull())
								{
									fire.pb.item.ItemMaps tempBag = fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.TEMP, false);
									
									if (tempBag.doAddItem(id, itemnum, "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟閹间礁绫嶉柛顐ｆ儕閵夆晜鐓曢柟鑸妽濞呭棝鏌涙惔锝呮灈闁哄本娲濈粻娑氾拷锝庝簽閸旀潙鈹戦悙鎻掔骇闁诡喖鍊搁～蹇涙惞閸︻厾锛滃┑鈽嗗灠閹碱偊锝炲畝鍕拺闁革富鍘搁幏锟犳煕鐎ｎ亷宸ユい鏇秮瀹曘劍绻濋崟顓熷殞闂備浇娉曢崰鏇炍涢崟顖ょ稏闊洦鎷嬪ú顏嶆晜鐎广儱妫欏▍宀勬⒒娴ｈ姤纭堕柛鐘虫崌瀵煡顢曢妶鍛亰闂佸搫鍟崑濠囧箯閻戣姤顥堟繛鎴炵懄閸犳劙姊哄ú璇插箹婵☆偅绻堝璇测槈閵忕姷鍔撮梺鍛婂姦娴滄牕顬婇妸鈺傗拺缂備焦蓱鐏忕増绻涢懠顒�鏋涚�殿喛顕ч鍏煎緞婵犲嫬骞愬┑鐐舵彧缁蹭粙骞夐垾鏂ユ灁闁割偅娲橀埛鎴︽倵閸︻厼校妞ゃ儱顦伴妵鍕晜閻愵剚姣堝Δ鐘靛仜閸燁垳绮嬮幒鏃撴嫹閿濆懐浠涢柡鍜佸墮閳规垿鎮欓弶鎴犱桓闁艰￥鍊濋弻锛勶拷锝庡亞閹冲啴鏌嶇憴鍕伌妞ゃ垺鐟у☉鐢告煥鐎ｎ偅姣庡┑鐘殿暜缁辨洟宕戝Ο鐓庡灊婵炲棙鎸歌繚婵炶揪缍�閸婁粙寮敓浠嬪箯閸涘瓨鍋￠梺顓ㄨ閹风兘骞樼紒妯锋嫼闂佺厧顫曢崐鏇㈠几閹存繍鐔嗛柣鐔哄椤ャ垽鏌曢崱妤�锟藉灝顕ｆ繝姘ㄩ柨鏃囶潐鐎氳棄鈹戦悙鑸靛涧缂佽弓绮欓獮澶愭晸閻樿尙鏌堥梺缁樺姉閸庛倝鎮￠悢鍏肩厽闁哄啫鐗婇敍鐔兼煙閼碱剙浜炬い銊ｅ劦閹瑩鎳犻鍌ゅ晪闂備浇妗ㄩ悞锕傚箲閸ヮ剙鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != itemnum)
									{
										return false;
									}
								}
								else
								{
									if (bag.doAddItem(id, itemnum, "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟閹间礁绫嶉柛顐ｆ儕閵夆晜鐓曢柟鑸妽濞呭棝鏌涙惔锝呮灈闁哄本娲濈粻娑氾拷锝庝簽閸旀潙鈹戦悙鎻掔骇闁诡喖鍊搁～蹇涙惞閸︻厾锛滃┑鈽嗗灠閹碱偊锝炲畝鍕拺闁革富鍘搁幏锟犳煕鐎ｎ亷宸ユい鏇秮瀹曘劍绻濋崟顓熷殞闂備浇娉曢崰鏇炍涢崟顖ょ稏闊洦鎷嬪ú顏嶆晜鐎广儱妫欏▍宀勬⒒娴ｈ姤纭堕柛鐘虫崌瀵煡顢曢妶鍛亰闂佸搫鍟崑濠囧箯閻戣姤顥堟繛鎴炵懄閸犳劙姊哄ú璇插箹婵☆偅绻堝璇测槈閵忕姷鍔撮梺鍛婂姦娴滄牕顬婇妸鈺傗拺缂備焦蓱鐏忕増绻涢懠顒�鏋涚�殿喛顕ч鍏煎緞婵犲嫬骞愬┑鐐舵彧缁蹭粙骞夐垾鏂ユ灁闁割偅娲橀埛鎴︽倵閸︻厼校妞ゃ儱顦伴妵鍕晜閻愵剚姣堝Δ鐘靛仜閸燁垳绮嬮幒鏃撴嫹閿濆懐浠涢柡鍜佸墮閳规垿鎮欓弶鎴犱桓闁艰￥鍊濋弻锛勶拷锝庡亞閹冲啴鏌嶇憴鍕伌妞ゃ垺鐟у☉鐢告煥鐎ｎ偅姣庡┑鐘殿暜缁辨洟宕戝Ο鐓庡灊婵炲棙鎸歌繚婵炶揪缍�閸婁粙寮敓浠嬪箯閸涘瓨鍋￠梺顓ㄨ閹风兘骞樼紒妯锋嫼闂佺厧顫曢崐鏇㈠几閹存繍鐔嗛柣鐔哄椤ャ垽鏌曢崱妤�锟藉灝顕ｆ繝姘ㄩ柨鏃囶潐鐎氳棄鈹戦悙鑸靛涧缂佽弓绮欓獮澶愭晸閻樿尙鏌堥梺缁樺姉閸庛倝鎮￠悢鍏肩厽闁哄啫鐗婇敍鐔兼煙閼碱剙浜炬い銊ｅ劦閹瑩鎳犻鍌ゅ晪闂備浇妗ㄩ悞锕傚箲閸ヮ剙鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != itemnum)
									{
										return false;
									}
								}												
							}
						}
						
						if (count > e.getNum()) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊勭矊闇夐柡宥庡幗閻撳繐鈹戦悙鑼虎闁告柨鐡ㄧ换娑㈠箻閹颁胶鍚嬮梺鍝勭灱閸犳牠骞冨鍐炬建闁糕剝顭囬弳銉х磽娴ｉ缚妾搁柛娆忕箻楠炲繘鎮滈懞銉㈡嫽婵炶揪绲块悺鏂款焽閹扮増鐓曢幖杈剧到鐢爼鎽堕悙鐑樼厱闁哄洢鍔岄悘锟犳煃闁垮绗氶柕鍥у瀵粙顢曢～顓熷媰闂備胶绮幖顐ょ礊娓氾拷閹繝顢曢敃锟介悙濠囨煏婵炲灝鍔氭慨锝呯墕閳规垿鎮欓幓鎺撳�梺鍛婃⒐閻熲晛顕ｆ繝姘亜缁炬媽椴搁弲顒�鈹戦埥鍡楃仩闁圭⒈鍋呴幈銊╂晝閸屾稈鎷洪梺鍛婄箓鐎氼厼锕㈤幍顔剧＜閻庯綆鍋勯悘鎾煕閳瑰灝鍔滅�垫澘瀚换娑㈠閵忕姵鐏堥悗瑙勬礃椤ㄥ﹤鐣峰Δ鍛亗閹兼番鍨绘禍顏勨攽閻樻鏆滅紒杈ㄦ礋瀹曟垿骞嬮敃锟界壕褰掓煛閸モ晛顎撻柟宄板槻閳藉骞掗幘瀵稿綃闂備浇顕栭崰姘跺礂濮楋拷瀹曟椽鏁撻悩鎻掔獩濡炪倖鎸撮崜婵嬪箟閻楀牏绡�闁汇垽娼ф禒锕傛煕椤垵鐏︾�规洜鎳撶叅妞ゅ繐瀚弻褔姊鸿ぐ鎺擄紵闁绘帪绠撻幃锟犲Ψ閳哄倻鍘介梺鍝勬川閸嬫盯鏁撻挊澶嬭础闁跨喕濮ら悢顒勫箯閿燂拷? 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹閸濄儳涓嶉柡宥庡幗閻撴洘銇勯幇鍓佺ɑ缂侊拷閿熺晫绱掗悙顒�鍔ゆ繛纭风節瀵鎮㈤悡搴ｇ暰闂佺粯顨呴悧婊兾涢崟顓犵＜闁绘劦鍓欓崝銈嗐亜椤撶姴鍘寸�殿喖顭烽弫鎰緞婵犲嫮鏉搁梻浣虹帛椤ㄥ懘鎮ф繝鍥ㄧ叆妞ゆ挶鍨洪埛鎴︽煙閼测晛浠滃┑锛勬櫕缁辨帞鎷犻懠顒�鈪甸悗娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟� by changhao
						{
							return false;
						}
					}
					else
					{
						fire.pb.fushi.SFreeDisRewardConfig e = fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.fushi.SFreeDisRewardConfig.class).get(itemid);
						if (e == null)
						{
							return false;
						}
						
						int count = 0;
						for (Integer id : e.itemids)
						{
							Integer itemnum = rewarddistribution.get(id);
							if (itemnum != null && itemnum > 0)
							{	
								count += itemnum;
								
								if (bag.isFull())
								{
									fire.pb.item.ItemMaps tempBag = fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.TEMP, false);
									
									if (tempBag.doAddItem(id, itemnum, "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟閹间礁绫嶉柛顐ｆ儕閵夆晜鐓曢柟鑸妽濞呭棝鏌涙惔锝呮灈闁哄本娲濈粻娑氾拷锝庝簽閸旀潙鈹戦悙鎻掔骇闁诡喖鍊搁～蹇涙惞閸︻厾锛滃┑鈽嗗灠閹碱偊锝炲畝鍕拺闁革富鍘搁幏锟犳煕鐎ｎ亷宸ユい鏇秮瀹曘劍绻濋崟顓熷殞闂備浇娉曢崰鏇炍涢崟顖ょ稏闊洦鎷嬪ú顏嶆晜鐎广儱妫欏▍宀勬⒒娴ｈ姤纭堕柛鐘虫崌瀵煡顢曢妶鍛亰闂佸搫鍟崑濠囧箯閻戣姤顥堟繛鎴炵懄閸犳劙姊哄ú璇插箹婵☆偅绻堝璇测槈閵忕姷鍔撮梺鍛婂姦娴滄牕顬婇妸鈺傗拺缂備焦蓱鐏忕増绻涢懠顒�鏋涚�殿喛顕ч鍏煎緞婵犲嫬骞愬┑鐐舵彧缁蹭粙骞夐垾鏂ユ灁闁割偅娲橀埛鎴︽倵閸︻厼校妞ゃ儱顦伴妵鍕晜閻愵剚姣堝Δ鐘靛仜閸燁垳绮嬮幒鏃撴嫹閿濆懐浠涢柡鍜佸墮閳规垿鎮欓弶鎴犱桓闁艰￥鍊濋弻锛勶拷锝庡亞閹冲啴鏌嶇憴鍕伌妞ゃ垺鐟у☉鐢告煥鐎ｎ偅姣庡┑鐘殿暜缁辨洟宕戝Ο鐓庡灊婵炲棙鎸歌繚婵炶揪缍�閸婁粙寮敓浠嬪箯閸涘瓨鍋￠梺顓ㄨ閹风兘骞樼紒妯锋嫼闂佺厧顫曢崐鏇㈠几閹存繍鐔嗛柣鐔哄椤ャ垽鏌曢崱妤�锟藉灝顕ｆ繝姘ㄩ柨鏃囶潐鐎氳棄鈹戦悙鑸靛涧缂佽弓绮欓獮澶愭晸閻樿尙鏌堥梺缁樺姉閸庛倝鎮￠悢鍏肩厽闁哄啫鐗婇敍鐔兼煙閼碱剙浜炬い銊ｅ劦閹瑩鎳犻鍌ゅ晪闂備浇妗ㄩ悞锕傚箲閸ヮ剙鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != itemnum)
									{
										return false;
									}
								}
								else
								{
									if (bag.doAddItem(id, itemnum, "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟閹间礁绫嶉柛顐ｆ儕閵夆晜鐓曢柟鑸妽濞呭棝鏌涙惔锝呮灈闁哄本娲濈粻娑氾拷锝庝簽閸旀潙鈹戦悙鎻掔骇闁诡喖鍊搁～蹇涙惞閸︻厾锛滃┑鈽嗗灠閹碱偊锝炲畝鍕拺闁革富鍘搁幏锟犳煕鐎ｎ亷宸ユい鏇秮瀹曘劍绻濋崟顓熷殞闂備浇娉曢崰鏇炍涢崟顖ょ稏闊洦鎷嬪ú顏嶆晜鐎广儱妫欏▍宀勬⒒娴ｈ姤纭堕柛鐘虫崌瀵煡顢曢妶鍛亰闂佸搫鍟崑濠囧箯閻戣姤顥堟繛鎴炵懄閸犳劙姊哄ú璇插箹婵☆偅绻堝璇测槈閵忕姷鍔撮梺鍛婂姦娴滄牕顬婇妸鈺傗拺缂備焦蓱鐏忕増绻涢懠顒�鏋涚�殿喛顕ч鍏煎緞婵犲嫬骞愬┑鐐舵彧缁蹭粙骞夐垾鏂ユ灁闁割偅娲橀埛鎴︽倵閸︻厼校妞ゃ儱顦伴妵鍕晜閻愵剚姣堝Δ鐘靛仜閸燁垳绮嬮幒鏃撴嫹閿濆懐浠涢柡鍜佸墮閳规垿鎮欓弶鎴犱桓闁艰￥鍊濋弻锛勶拷锝庡亞閹冲啴鏌嶇憴鍕伌妞ゃ垺鐟у☉鐢告煥鐎ｎ偅姣庡┑鐘殿暜缁辨洟宕戝Ο鐓庡灊婵炲棙鎸歌繚婵炶揪缍�閸婁粙寮敓浠嬪箯閸涘瓨鍋￠梺顓ㄨ閹风兘骞樼紒妯锋嫼闂佺厧顫曢崐鏇㈠几閹存繍鐔嗛柣鐔哄椤ャ垽鏌曢崱妤�锟藉灝顕ｆ繝姘ㄩ柨鏃囶潐鐎氳棄鈹戦悙鑸靛涧缂佽弓绮欓獮澶愭晸閻樿尙鏌堥梺缁樺姉閸庛倝鎮￠悢鍏肩厽闁哄啫鐗婇敍鐔兼煙閼碱剙浜炬い銊ｅ劦閹瑩鎳犻鍌ゅ晪闂備浇妗ㄩ悞锕傚箲閸ヮ剙鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != itemnum)
									{
										return false;
									}
								}												
							}
						}	
						
						if (count > e.getNum()) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊勭矊闇夐柡宥庡幗閻撳繐鈹戦悙鑼虎闁告柨鐡ㄧ换娑㈠箻閹颁胶鍚嬮梺鍝勭灱閸犳牠骞冨鍐炬建闁糕剝顭囬弳銉х磽娴ｉ缚妾搁柛娆忕箻楠炲繘鎮滈懞銉㈡嫽婵炶揪绲块悺鏂款焽閹扮増鐓曢幖杈剧到鐢爼鎽堕悙鐑樼厱闁哄洢鍔岄悘锟犳煃闁垮绗氶柕鍥у瀵粙顢曢～顓熷媰闂備胶绮幖顐ょ礊娓氾拷閹繝顢曢敃锟介悙濠囨煏婵炲灝鍔氭慨锝呯墕閳规垿鎮欓幓鎺撳�梺鍛婃⒐閻熲晛顕ｆ繝姘亜缁炬媽椴搁弲顒�鈹戦埥鍡楃仩闁圭⒈鍋呴幈銊╂晝閸屾稈鎷洪梺鍛婄箓鐎氼厼锕㈤幍顔剧＜閻庯綆鍋勯悘鎾煕閳瑰灝鍔滅�垫澘瀚换娑㈠閵忕姵鐏堥悗瑙勬礃椤ㄥ﹤鐣峰Δ鍛亗閹兼番鍨绘禍顏勨攽閻樻鏆滅紒杈ㄦ礋瀹曟垿骞嬮敃锟界壕褰掓煛閸モ晛顎撻柟宄板槻閳藉骞掗幘瀵稿綃闂備浇顕栭崰姘跺礂濮楋拷瀹曟椽鏁撻悩鎻掔獩濡炪倖鎸撮崜婵嬪箟閻楀牏绡�闁汇垽娼ф禒锕傛煕椤垵鐏︾�规洜鎳撶叅妞ゅ繐瀚弻褔姊鸿ぐ鎺擄紵闁绘帪绠撻幃锟犲Ψ閳哄倻鍘介梺鍝勬川閸嬫盯鏁撻挊澶嬭础闁跨喕濮ら悢顒勫箯閿燂拷? 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹閸濄儳涓嶉柡宥庡幗閻撴洘銇勯幇鍓佺ɑ缂侊拷閿熺晫绱掗悙顒�鍔ゆ繛纭风節瀵鎮㈤悡搴ｇ暰闂佺粯顨呴悧婊兾涢崟顓犵＜闁绘劦鍓欓崝銈嗐亜椤撶姴鍘寸�殿喖顭烽弫鎰緞婵犲嫮鏉搁梻浣虹帛椤ㄥ懘鎮ф繝鍥ㄧ叆妞ゆ挶鍨洪埛鎴︽煙閼测晛浠滃┑锛勬櫕缁辨帞鎷犻懠顒�鈪甸悗娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟� by changhao
						{
							return false;
						}
					}
				}
				
				return true;
			}
		};
		grabmonthcardreward.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812689;

	public int getType() {
		return 812689;
	}

	public int itemid; // 自由分配道具id by changhao
	public java.util.HashMap<Integer,Integer> rewarddistribution; // 道具分配 道具id value数量 by changhao

	public CGrabMonthCardReward() {
		rewarddistribution = new java.util.HashMap<Integer,Integer>();
	}

	public CGrabMonthCardReward(int _itemid_, java.util.HashMap<Integer,Integer> _rewarddistribution_) {
		this.itemid = _itemid_;
		this.rewarddistribution = _rewarddistribution_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(itemid);
		_os_.compact_uint32(rewarddistribution.size());
		for (java.util.Map.Entry<Integer, Integer> _e_ : rewarddistribution.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		itemid = _os_.unmarshal_int();
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			int _k_;
			_k_ = _os_.unmarshal_int();
			int _v_;
			_v_ = _os_.unmarshal_int();
			rewarddistribution.put(_k_, _v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGrabMonthCardReward) {
			CGrabMonthCardReward _o_ = (CGrabMonthCardReward)_o1_;
			if (itemid != _o_.itemid) return false;
			if (!rewarddistribution.equals(_o_.rewarddistribution)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += itemid;
		_h_ += rewarddistribution.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(itemid).append(",");
		_sb_.append(rewarddistribution).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

