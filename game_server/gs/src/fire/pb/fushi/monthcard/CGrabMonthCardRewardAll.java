
package fire.pb.fushi.monthcard;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGrabMonthCardRewardAll__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋婵愭綗闁跨喕妫勯崐鍧楀箰婵犲啰鐝堕柍鍝勵儑缁夘喚锟借娲忛崝鎴濐嚕閸洖绠ｉ柣娆忔噽楠炪垽姊婚崒娆戭槮闁规祴鍓濈粭鐔肺旈崨顓犵厬闁瑰吋鐣崝宥夊磻閸曨垱鐓曢柍鈺佸幘閼测晜宕查柛鈩兦滄禍婊堟煛瀹ュ啫濡块柟鍐叉噽缁辨帗寰勭�ｎ亶鍤嬬紓浣虹帛閻╊垶鐛�ｎ喗鍊婚柛鈩冪懃婵亶姊绘担鍛婃儓闁哥噥鍋婇幃褔宕卞▎鎴犵劶闁诲函缍嗛崰妤呮偂閸愵喗鐓熸慨姗嗗墰閹界娀鎮楀杈ㄥ殌闁宠鍨块、娆忊枎閻愵剛绉锋俊鐐�戦崝宀勬晝閵堝缍栭煫鍥ㄦ媼濞差亶鏁傞柛鏇ㄥ弾閸熷洭姊绘担铏瑰笡闁告梹鐗為妵鎰板礃閳哄倸寮块梺鍓插亝濞叉﹢鍩涢幋锔界厱婵炴垶锕弨濠氭倶韫囧骸宓嗛柡宀嬬秮閹垹鈹戦崱妯侯槱闂佸搫鎳忛幃鍌炲蓟閵堝绠掗柟鐑樺灥婵倖绻濋姀锝庢綈閽冮亶鏌曢崶褍顏柡浣稿�块幃娆擃敆娴ｅ湱妲楅梺璇插椤旀牠宕板☉銏╂晪鐟滄棃宕洪妷锕�绶為柟閭﹀墻濞煎﹪姊洪崘鍙夋儓闁稿﹦鎳撻埢宥夊炊椤掍讲鎷绘繛杈剧悼閹虫捇顢氬鍛＜閻犲洦褰冮敓钘夋憸閸欏懘姊洪棃娴ュ牓寮插鍫濈；闁冲搫鎳忛埛鎺楁煕椤愩倕鏋庨柛妯煎厴閺岋繝宕橀妸褍顤�闂佺顑嗛崝娆忣潖婵犳艾閱囬柣鏃囥��濡晠姊洪崫鍕垫▓闁告瑥鍟～蹇撁洪鍕啇闂佺粯鍔栬ぐ鍐�栭崼銏㈢＝闁稿本姘ㄥ瓭闂佹寧娲︽禍婊堟偩瀹勬噴娲敂閸涱叏鎷烽悜鑺ョ厱婵犻潧妫楅顐ｃ亜閹惧瓨銇濇慨濠冩そ楠炴劖鎯旈姀鈶╂晬闂備礁婀遍崗姗�藟閹剧粯鍎夋い蹇撶墕缁犳氨鎲稿澶婄畺闁瑰濮风壕鑲╃磽娴ｈ鐒芥繛鎻掔摠椤ㄣ儵鎮欏顔煎壎闂佽鍠楅悷褔骞戦崟顒傜懝妞ゆ牗渚楀Λ銊╂⒒閸屾艾锟界兘鎮為敃鍌氱婵﹩鍘鹃々鏌ユ煥濠靛棭妾х紓宥嗙墪椤法鎹勯悜妯绘嫳閻庤娲栧鍓佹崲濠靛顥堟繛鎴炵懐濡繘姊洪崫鍕靛剱婵☆偄鍟村璇测槈閳垛晪鎷烽敃鍌氱婵犻潧娲ㄦ禍鍫曟⒒娴ｈ櫣甯涚紒璇茬Ч瀹曞湱鎹勬笟顖涚稁濠电偛妯婃禍婵嬪磻閿熺姵鐓涘璺侯儏椤曟粍銇勯弮鎾村闂傚倸鍊烽懗鍫曞箠閹捐鍚归柡宥庡幖缁狀垶鏌ㄩ悤鍌涘 by changhao
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
					if (grab == true) //闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰效闁挎繄鍋涢埞鎴狅拷锝庡亝濞呭洭姊虹粙璺ㄧ効濠碘�虫川缁瑨绠涢弮鍌滅槇闂侀潧楠忕徊浠嬫偂閹扮増鐓曢柡鍐挎嫹闁绘濮撮悾鐑藉箣閿曪拷鍥存繝銏ｆ硾椤戝洭宕㈤幖浣光拺闁硅偐鍋涢崝妤呮煛閸涱喚鈽夐柣顭戝墴濮婄粯鎷呴搹鐟扮闁汇埄鍨辩敮锟犲极閸愵喖唯鐟滃骸鐣烽崣澶岀闁瑰瓨鐟ラ悘鈺傤殽閻愵亜鐏ǎ鍥э躬椤㈡稑鈹戦崶鏈靛摋濠电偛顕慨鐢稿箰閸愬樊娼栨繛宸簻缁犲綊鏌ｉ幇顓炵祷妞ゎ剙顦辩槐鎾存媴缁涘娈梺缁橆殕閹告悂顢氶敐鍥ㄥ珰鐎瑰壊鍠栭幃鎴炵節閵忥絾纭鹃柨鏇畵瀹曘垽宕ㄦ繝鍕啎闁哄鐗嗘晶浠嬪礆娴煎瓨鐓欓悹鍥囧懐鐦堥梺璇″枟閿曘垹顕ｉ幘顔藉亹闁汇垻顣槐鍐测攽閻愯埖褰х紒鎻掓健楠炲﹪骞樼拠鍙夌�梺鍛婃寙閸涱垽绱抽柣搴＄畭閸庤京锟芥凹鍠氱划锝夊籍閸岋附瀚规繛鍫濈仢閺嬶附銇勯弴鍡楁搐閻撯�愁熆閼搁潧濮囨い顐㈡嚇閺岋絽顫滈敓钘夘焽瑜庨幈銊╁醇閺囩啿鎷绘繛杈剧到閹诧繝宕悙鐑樼厱闁哄喛鎷锋い銊ワ工閻ｇ兘骞嬮敃锟界粻鑽ょ磽娴ｅ顏呯婵傚憡鈷戦柛娑橈攻鐏忣偊鏌ら崘鎻掝暢濠㈣娲熼幐濠冪珶濠靛棛绉洪柡浣瑰姍瀹曞爼濡搁妷锔炬殮缂傚倸鍊峰ù鍥╀焊濞嗘垵鍨濇い鏍ㄧ矋瀹曞弶绻涢幋鐐电叝闁绘帒锕弻鈥愁吋閸涱垯绮甸柣搴㈣壘缂嶅﹪寮婚悢闈╃矗濞达絼璀﹀Σ顔尖攽閻愯尙澧戦柛鏃�鍨甸～蹇撁洪鍕槶闂佸湱绮敮濠勮姳閻撳簶鏀介柣鎰絻缁狙囨煟濡ゅ啫鈻堟鐐插暣閸ㄩ箖寮妷锔绘綌婵犵妲呴崹鎵崲閹邦喚绀婂┑鐘叉搐閺嬩線鏌熼悧鍫熺凡闂佸崬娲﹂妵鍕箛閸撲焦鍋х紓浣割槺閸忔ê顫忕紒妯诲缂佹稑顑呭▓鎰版⒑閸濄儱校妞ゃ劌锕獮鍐倻閽樺）銊╂煃鐟欏嫭瀚曢柟椋庡厴瀵噣宕煎┑鍫О婵＄偑鍊栭弻銊ノｉ崼锝庢▌闂佸搫鏈惄顖炵嵁閸ヮ剙鐓涘ù锝呭閻庤櫕淇婇悙顏勶拷銈夊礈濞嗘拲鍥濞戣鲸缍庡┑鐐叉▕娴滄繈宕愭繝姘厓闁告繂瀚敓钘夌秺閹敻鏁冮崒娑掓嫼闂佺鍋愰崑娑欎繆濞差亝鐓曟俊銈勭閳绘洘顨ラ悙鎻掓殻妤犵偛妫滈ˇ鎾煛閸℃鍎旈柡宀�鍠愰幏鍛村礃閳哄啫娑ч梻浣告惈閸嬪﹪骞忛悜鑺モ拻濞达絿鐡旈崵娆撴煕閹寸姵娅曠紒杈╁仱瀹曞崬螣绾拌鲸閿ら梻浣虹帛閸旀宕曢妶澶婄；闁稿瞼鍋為悡娆撴倵濞戞瑯鐒藉┑鈥虫喘閺岋繝鏁撻懞銉ь浄閻庯綆鍋嗛崢鎾绘⒑閼恒儍顏埶囨导姝ゅ顭ㄩ崼鐔哄幗闂婎偄娲㈤崕宕囩矓椤曪拷閺岋紕浠﹂崜褉妲堥柧浼欑秮閺岋絽螣閸濆嫮楠囬梺鐟板悑閸旀瑩寮婚敐澶娢у璺虹灱閺嗩偊姊洪崫鍕潶闁告梹鍨块獮鍐Χ婢跺﹦锛滃┑鐐村灦閿曗晜瀵奸敓锟� by changhao
					{
						return false;
					}
					
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬姘卞闂佹眹鍨荤划顖涚┍婵犲洦鍊锋い蹇撳閹风兘寮介鐔蜂罕濠电姴锕ら悧鍡欏缂佹绠鹃柟瀛樼懃閻忊晠鏌涢妸銉ワ拷鍧楀蓟濞戞矮娌柛鎾楋拷濡劍绻涚�涙鐭嬬紒顔芥崌瀵鍨鹃幇浣告倯闂佸憡鍔戦崝宀勨�栫�ｎ喗鈷戦梻鍫熺♁椤ョ偤鎮介娑辨疁濠碉紕鏁诲畷鐔碱敍濮樺崬骞愰梻浣侯焾閺堫剛鍒掔仦绛嬪殨闁靛ň鏅滈埛鎴︽煕濠靛棗顏柣蹇涗憾閺屾盯鎮╁畷鍥р拰濡ょ姷鍋涢崯顐︹�﹂妸鈺佺闁告挆鍐╃亖缂備浇椴哥敮鎺曠亽闂佸憡绻傜�氼剟藟閹烘梻纾介柛灞捐壘閿熻姤鎮傚畷鎰版倻閼恒儱锟藉潡鏌ㄩ弴鐐诧拷鎼佹嚋瑜版帗鐓犲┑顔藉姇閿熻姤顨堢划鍫熺節閸屾﹫鎷烽幒鎴僵闁绘劦鍓欓鍫曟煟鎼淬埄鍟忛柛鐘崇洴椤㈡俺顦归柛鈹垮劜瀵板嫰骞囬澶嬬秱闂備胶绮敃銏狀焽瑜庨幈銊╁醇閺囩啿鎷绘繛杈剧到閹诧繝宕悙鐑樼厱闁哄喛鎷锋い銊ワ工閻ｇ兘骞嬮敃锟界粻鑽ょ磽娴ｅ顏呯婵傚憡鈷戦柛娑橈攻鐏忣偊鏌ら崘鎻掝暢濠㈣娲熼幐濠冪珶濠靛棛绉洪柡浣瑰姍瀹曞爼濡搁妷锔炬殮缂傚倸鍊烽悞锕併亹閸愵喒锟斤箓鎮滈挊澶庢憰闂佹寧绻傞悧蹇涙偪閿熶粙姊洪崫鍕殭闁稿﹤顭烽幃鍧楀礋椤栨稈鎷虹紓渚囧灡濞叉ê鈻嶉崶顒佺厱閻庯絻鍔岄敓鑺ョ箞閹即顢欓幘鍛闁挎繂楠搁弸鐔兼煛閸涱喚绠為柡灞诲姂閹垽鎮滃Ο鑽ゅ涧濠电姰鍨奸～澶娒洪悢椋庢殾婵°倕鎳忛崵鍐煃閸濆嫬鏋ら柛鐔烽叄濮婄粯鎷呴悜妯烘畬濡炪倖娲﹂崣鍐ㄧ暦閹达附鍋愮�规洖娲ㄨぐ鎯р攽椤旂瓔娈ｉ柟椋庡厴閺岋紕浠﹂悾灞澭勩亜閵忊剝顥堢�规洖鐖奸幊婊堟偨閻㈡晫銉х磽閸屾艾锟界兘鎳楅崜浣稿灊妞ゆ牗绮嶅畷鏌ユ煕瀹�锟介崑娑㈡偂濠靛鐓欓柟瑙勫姦閸ゆ瑩鏌涢妸銉ワ拷褰掑Φ閸曨垰绫嶉柛灞剧♁閻濐亪鎮峰鍛暭闁绘挴锟芥剚娼栫紓浣股戞刊鎾煟閹寸伝顏勨枔瀹�鍕拺闁硅偐鍋涢敓鑺ョ墵閹囨偐閼姐倕绁﹂棅顐㈡处缁嬫帡寮查幖浣圭叆闁绘洖鍊圭�氾拷 by changhao
					{
						xbean.Properties prop = xtable.Properties.select(roleid);
						if (prop == null)
						{
							return false;
						}
						
						fire.pb.item.Pack bag = (fire.pb.item.Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, false);

						if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴楠炴﹢鎳犻澶嬓滈梻浣规偠閸斿秶鎹㈤崘顔嘉﹂柛鏇ㄥ灠閸愶拷濡炪倖鍔﹀锟界紒顔煎缁辨挻绗熸繝鍐伓濠电姰鍨煎▔娑㈩敄閸曨厽宕查柛鈩冪♁閻撳繘鏌涢锝囩畺闁革絾妞介弻娑㈡晲閸涱喛纭�缂備浇椴哥敮锟犲箖閳哄懏顥堟繛鎴炲笚閻庝即姊绘担鍛婃儓闁活剙銈稿畷浼村冀椤撶姴绁﹂梺绯曞墲閸戠懓危妤ｅ啯鈷戦柟绋挎捣閳藉绱掓径濠勭Ш鐎殿喖顭烽弫鎾绘偐閹绘帟锟藉灝顪冮妶鍡樺暗濠殿喚鍏樺鎶藉Χ閸涱亝鏂�濡炪倖姊婚妴瀣绩缂佹ü绻嗛柣鎰閻瑩鏌曢崱鏇狀槮閾绘牠鏌涘☉鍗炴灍婵炲懌鍨藉鐑樺濞嗘垵鍩岄梺娲诲墮閵堟悂骞嗗畝鍕缂備焦锚閿熺晫鏁婚弻锝夊閻樺啿鏆堟繛瀛樺殠閸婃繈寮婚悢椋庢殝闁哄瀵т簺婵＄偑鍊ら崑鍛崲閸儯锟戒礁螖娴ｅ摜绐為柣搴稻閹稿爼宕濋幋婵愭綎闁惧繗顫夊畷澶愭煏婵炲灝鍔滈柣蹇撴閳规垿鍩ラ崱妞剧盎闁诲孩鍑归崰姘跺礆閹烘梹瀚氱�瑰壊鍠栭幃鎴炵節閵忥絾纭鹃柨鏇畵閺佸秹鎮㈤崗灏栨嫽婵炴挻鑹惧ú銈嗘櫠椤斿墽纾煎璺侯煬閸ょ喓绱掗纰辩吋闁诡喒鏅濋幏鐘绘嚑椤掑鏅ｉ梻鍌欑濠�閬嶅煕閸儱鍌ㄥΔ锝呭暙閸屻劍绻濇繝鍌涘櫧缁惧墽鏅敓钘夌畭閸庡崬螞濞戞瑦娅犻柣銏犳啞閻撴盯鎮橀悙闈涗壕缂侊拷鐎ｎ剨鎷风憴鍕闁告鍥х厴闁硅揪绠戠粻娑欍亜閹剧绱￠柛銉ｅ妷閹疯櫣绱撻崒娆戝妽閽冮亶鎮樿箛鏇烆暭缂佺粯鐩幊鐘活敆閿熶粙寮稿☉姘炬嫹濞堝灝鏋涙い顓㈡敱娣囧﹪骞栨担鍝ュ幐闂佺鏈惌顔捐姳娴犲鈷掑ù锝勮閻掗箖鏌￠崼顐㈠缂侇喗鐟╅獮瀣晜缂佹ɑ娅嗛梻浣芥硶閸ｏ箓骞忛敓锟�? by changhao
						{
							java.util.Map<Integer, fire.pb.fushi.SMonthCardConfigDayPay> config = fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.fushi.SMonthCardConfigDayPay.class);
							for (fire.pb.fushi.SMonthCardConfigDayPay e : config.values())
							{
								if (e.getType() == 1)
								{
									java.util.Map<String, Object> paras = new java.util.HashMap<String, Object>(10);
									paras.put(fire.pb.activity.award.RewardMgr.ROLE_LEVEL, prop.getLevel());
									fire.pb.activity.award.RewardMgr.getInstance().distributeAllAward(roleid, e.getRewardid(), paras, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 0,fire.pb.PAddExpProc.OTHER, "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閳╁啯鐝曢梻浣藉Г閿氭い锔诲枤缁辨棃寮撮姀鈾�鎷绘繛杈剧秬濞咃綁濡存繝鍥ㄧ厱闁规儳顕粻妯肩磼椤旂晫鎳囨鐐村笒铻栭柨鐔烘櫕婢规洘绻濆顓烇拷鐢告煥濠靛棝顎楅柡瀣枛閺岋綁骞樼�涙顦伴梺鍝勮嫰缁夊綊宕洪埄鍐╁闁告稑锕︽禍鐐節閻㈤潧浠滈柣妤�锕弫鍐閵堝懓鎽曢梺璺ㄥ枔婵挳鐛姀掳浜滈柟鎹愭硾鍟搁梺鍝勬閸婃繈骞冨Δ锟介埢鎾诲垂椤旂晫浜梻浣虹帛閻楁粓宕㈣閹箖鎮滈懞銉ヤ簵闁圭厧鐡ㄨ摫妞ゎ偄绉撮埞鎴﹀煡閸℃浠ч柣鐙呮嫹闁挎洖鍊归崐鐢告煟閹达絽袚闁抽攱甯￠弻娑氫沪閹规劕顥濋梺璺ㄥ枙濡嫰骞楀鍫熸櫢闁兼亽鍎遍崵顒勬煕閹惧娲撮柡浣规崌閹崇偤濡疯閸欐繈姊洪崨濠庢當闁哥喎娼￠、姘舵晲閸℃瑧鐦堝┑顔斤供閸撴稒瀵肩�ｎ喗鍊甸悷娆忓缁�锟藉┑鐐额嚋缁犳垿鍩㈤幘缁樺亗閹兼惌鍠楃�靛矂姊洪棃娑氬婵☆偅鐟╅崺娑㈠箳濡や胶鍘卞┑鈽嗗灣婵潙煤閵堝鍑犲ù锝呯畭娴滄粓鐓崶銊﹀暗濠⒀勭洴閺岋綁骞橀崡鐐插Е闂佸搫鐭夌紞浣割嚕閹绢喗鍊烽悹鍥囧嫬顏堕梺闈╁瘜閸欏繘骞忓畡閭︽僵闁绘劦鍓欓锟�");										
								}
								else if (e.getType() == 0)
								{
									if (bag.isFull())
									{
										fire.pb.item.ItemMaps tempBag = fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.TEMP, false);
										
										if (tempBag.doAddItem(e.getItemid(), e.getItemnum(), "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閳╁啯鐝曢梻浣藉Г閿氭い锔诲枤缁辨棃寮撮姀鈾�鎷绘繛杈剧秬濞咃綁濡存繝鍥ㄧ厱闁规儳顕粻妯肩磼椤旂晫鎳囨鐐村笒铻栭柨鐔烘櫕婢规洘绻濆顓烇拷鐢告煥濠靛棝顎楅柡瀣枛閺岋綁骞樼�涙顦伴梺鍝勮嫰缁夊綊宕洪埄鍐╁闁告稑锕︽禍鐐節閻㈤潧浠滈柣妤�锕弫鍐閵堝懓鎽曢梺璺ㄥ枔婵挳鐛姀掳浜滈柟鎹愭硾鍟搁梺鍝勬閸婃繈骞冨Δ锟介埢鎾诲垂椤旂晫浜梻浣虹帛閻楁粓宕㈣閹箖鎮滈懞銉ヤ簵闁圭厧鐡ㄨ摫妞ゎ偄绉撮埞鎴﹀煡閸℃浠ч柣鐙呮嫹闁挎洖鍊归崐鐢告煟閹达絽袚闁抽攱甯￠弻娑氫沪閹规劕顥濋梺璺ㄥ枙濡嫰骞楀鍫熸櫢闁兼亽鍎遍崵顒勬煕閹惧娲撮柡浣规崌閹崇偤濡疯閸欐繈姊洪崨濠庢當闁哥喎娼￠、姘舵晲閸℃瑧鐦堝┑顔斤供閸撴稒瀵肩�ｎ喗鍊甸悷娆忓缁�锟藉┑鐐额嚋缁犳垿鍩㈤幘缁樺亗閹兼惌鍠楃�靛矂姊洪棃娑氬婵☆偅鐟╅崺娑㈠箳濡や胶鍘卞┑鈽嗗灣婵潙煤閵堝鍑犲ù锝呯畭娴滄粓鐓崶銊﹀暗濠⒀勭洴閺岋綁骞橀崡鐐插Е闂佸搫鐭夌紞浣割嚕閹绢喗鍊烽悹鍥囧嫬顏堕梺闈╁瘜閸欏繘骞忓畡閭︽僵闁绘劦鍓欓锟�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != e.getItemnum())
										{
											return false;
										}
									}
									else
									{
										if (bag.doAddItem(e.getItemid(), e.getItemnum(), "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閳╁啯鐝曢梻浣藉Г閿氭い锔诲枤缁辨棃寮撮姀鈾�鎷绘繛杈剧秬濞咃綁濡存繝鍥ㄧ厱闁规儳顕粻妯肩磼椤旂晫鎳囨鐐村笒铻栭柨鐔烘櫕婢规洘绻濆顓烇拷鐢告煥濠靛棝顎楅柡瀣枛閺岋綁骞樼�涙顦伴梺鍝勮嫰缁夊綊宕洪埄鍐╁闁告稑锕︽禍鐐節閻㈤潧浠滈柣妤�锕弫鍐閵堝懓鎽曢梺璺ㄥ枔婵挳鐛姀掳浜滈柟鎹愭硾鍟搁梺鍝勬閸婃繈骞冨Δ锟介埢鎾诲垂椤旂晫浜梻浣虹帛閻楁粓宕㈣閹箖鎮滈懞銉ヤ簵闁圭厧鐡ㄨ摫妞ゎ偄绉撮埞鎴﹀煡閸℃浠ч柣鐙呮嫹闁挎洖鍊归崐鐢告煟閹达絽袚闁抽攱甯￠弻娑氫沪閹规劕顥濋梺璺ㄥ枙濡嫰骞楀鍫熸櫢闁兼亽鍎遍崵顒勬煕閹惧娲撮柡浣规崌閹崇偤濡疯閸欐繈姊洪崨濠庢當闁哥喎娼￠、姘舵晲閸℃瑧鐦堝┑顔斤供閸撴稒瀵肩�ｎ喗鍊甸悷娆忓缁�锟藉┑鐐额嚋缁犳垿鍩㈤幘缁樺亗閹兼惌鍠楃�靛矂姊洪棃娑氬婵☆偅鐟╅崺娑㈠箳濡や胶鍘卞┑鈽嗗灣婵潙煤閵堝鍑犲ù锝呯畭娴滄粓鐓崶銊﹀暗濠⒀勭洴閺岋綁骞橀崡鐐插Е闂佸搫鐭夌紞浣割嚕閹绢喗鍊烽悹鍥囧嫬顏堕梺闈╁瘜閸欏繘骞忓畡閭︽僵闁绘劦鍓欓锟�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != e.getItemnum())
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
									fire.pb.activity.award.RewardMgr.getInstance().distributeAllAward(roleid, e.getRewardid(), paras, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 0,fire.pb.PAddExpProc.OTHER, "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閳╁啯鐝曢梻浣藉Г閿氭い锔诲枤缁辨棃寮撮姀鈾�鎷绘繛杈剧秬濞咃綁濡存繝鍥ㄧ厱闁规儳顕粻妯肩磼椤旂晫鎳囨鐐村笒铻栭柨鐔烘櫕婢规洘绻濆顓烇拷鐢告煥濠靛棝顎楅柡瀣枛閺岋綁骞樼�涙顦伴梺鍝勮嫰缁夊綊宕洪埄鍐╁闁告稑锕︽禍鐐節閻㈤潧浠滈柣妤�锕弫鍐閵堝懓鎽曢梺璺ㄥ枔婵挳鐛姀掳浜滈柟鎹愭硾鍟搁梺鍝勬閸婃繈骞冨Δ锟介埢鎾诲垂椤旂晫浜梻浣虹帛閻楁粓宕㈣閹箖鎮滈懞銉ヤ簵闁圭厧鐡ㄨ摫妞ゎ偄绉撮埞鎴﹀煡閸℃浠ч柣鐙呮嫹闁挎洖鍊归崐鐢告煟閹达絽袚闁抽攱甯￠弻娑氫沪閹规劕顥濋梺璺ㄥ枙濡嫰骞楀鍫熸櫢闁兼亽鍎遍崵顒勬煕閹惧娲撮柡浣规崌閹崇偤濡疯閸欐繈姊洪崨濠庢當闁哥喎娼￠、姘舵晲閸℃瑧鐦堝┑顔斤供閸撴稒瀵肩�ｎ喗鍊甸悷娆忓缁�锟藉┑鐐额嚋缁犳垿鍩㈤幘缁樺亗閹兼惌鍠楃�靛矂姊洪棃娑氬婵☆偅鐟╅崺娑㈠箳濡や胶鍘卞┑鈽嗗灣婵潙煤閵堝鍑犲ù锝呯畭娴滄粓鐓崶銊﹀暗濠⒀勭洴閺岋綁骞橀崡鐐插Е闂佸搫鐭夌紞浣割嚕閹绢喗鍊烽悹鍥囧嫬顏堕梺闈╁瘜閸欏繘骞忓畡閭︽僵闁绘劦鍓欓锟�");										
								}
								else if (e.getType() == 0)
								{
									if (bag.isFull())
									{
										fire.pb.item.ItemMaps tempBag = fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.TEMP, false);
										
										if (tempBag.doAddItem(e.getItemid(), e.getItemnum(), "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閳╁啯鐝曢梻浣藉Г閿氭い锔诲枤缁辨棃寮撮姀鈾�鎷绘繛杈剧秬濞咃綁濡存繝鍥ㄧ厱闁规儳顕粻妯肩磼椤旂晫鎳囨鐐村笒铻栭柨鐔烘櫕婢规洘绻濆顓烇拷鐢告煥濠靛棝顎楅柡瀣枛閺岋綁骞樼�涙顦伴梺鍝勮嫰缁夊綊宕洪埄鍐╁闁告稑锕︽禍鐐節閻㈤潧浠滈柣妤�锕弫鍐閵堝懓鎽曢梺璺ㄥ枔婵挳鐛姀掳浜滈柟鎹愭硾鍟搁梺鍝勬閸婃繈骞冨Δ锟介埢鎾诲垂椤旂晫浜梻浣虹帛閻楁粓宕㈣閹箖鎮滈懞銉ヤ簵闁圭厧鐡ㄨ摫妞ゎ偄绉撮埞鎴﹀煡閸℃浠ч柣鐙呮嫹闁挎洖鍊归崐鐢告煟閹达絽袚闁抽攱甯￠弻娑氫沪閹规劕顥濋梺璺ㄥ枙濡嫰骞楀鍫熸櫢闁兼亽鍎遍崵顒勬煕閹惧娲撮柡浣规崌閹崇偤濡疯閸欐繈姊洪崨濠庢當闁哥喎娼￠、姘舵晲閸℃瑧鐦堝┑顔斤供閸撴稒瀵肩�ｎ喗鍊甸悷娆忓缁�锟藉┑鐐额嚋缁犳垿鍩㈤幘缁樺亗閹兼惌鍠楃�靛矂姊洪棃娑氬婵☆偅鐟╅崺娑㈠箳濡や胶鍘卞┑鈽嗗灣婵潙煤閵堝鍑犲ù锝呯畭娴滄粓鐓崶銊﹀暗濠⒀勭洴閺岋綁骞橀崡鐐插Е闂佸搫鐭夌紞浣割嚕閹绢喗鍊烽悹鍥囧嫬顏堕梺闈╁瘜閸欏繘骞忓畡閭︽僵闁绘劦鍓欓锟�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != e.getItemnum())
										{
											return false;
										}
									}
									else
									{
										if (bag.doAddItem(e.getItemid(), e.getItemnum(), "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閳╁啯鐝曢梻浣藉Г閿氭い锔诲枤缁辨棃寮撮姀鈾�鎷绘繛杈剧秬濞咃綁濡存繝鍥ㄧ厱闁规儳顕粻妯肩磼椤旂晫鎳囨鐐村笒铻栭柨鐔烘櫕婢规洘绻濆顓烇拷鐢告煥濠靛棝顎楅柡瀣枛閺岋綁骞樼�涙顦伴梺鍝勮嫰缁夊綊宕洪埄鍐╁闁告稑锕︽禍鐐節閻㈤潧浠滈柣妤�锕弫鍐閵堝懓鎽曢梺璺ㄥ枔婵挳鐛姀掳浜滈柟鎹愭硾鍟搁梺鍝勬閸婃繈骞冨Δ锟介埢鎾诲垂椤旂晫浜梻浣虹帛閻楁粓宕㈣閹箖鎮滈懞銉ヤ簵闁圭厧鐡ㄨ摫妞ゎ偄绉撮埞鎴﹀煡閸℃浠ч柣鐙呮嫹闁挎洖鍊归崐鐢告煟閹达絽袚闁抽攱甯￠弻娑氫沪閹规劕顥濋梺璺ㄥ枙濡嫰骞楀鍫熸櫢闁兼亽鍎遍崵顒勬煕閹惧娲撮柡浣规崌閹崇偤濡疯閸欐繈姊洪崨濠庢當闁哥喎娼￠、姘舵晲閸℃瑧鐦堝┑顔斤供閸撴稒瀵肩�ｎ喗鍊甸悷娆忓缁�锟藉┑鐐额嚋缁犳垿鍩㈤幘缁樺亗閹兼惌鍠楃�靛矂姊洪棃娑氬婵☆偅鐟╅崺娑㈠箳濡や胶鍘卞┑鈽嗗灣婵潙煤閵堝鍑犲ù锝呯畭娴滄粓鐓崶銊﹀暗濠⒀勭洴閺岋綁骞橀崡鐐插Е闂佸搫鐭夌紞浣割嚕閹绢喗鍊烽悹鍥囧嫬顏堕梺闈╁瘜閸欏繘骞忓畡閭︽僵闁绘劦鍓欓锟�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != e.getItemnum())
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

