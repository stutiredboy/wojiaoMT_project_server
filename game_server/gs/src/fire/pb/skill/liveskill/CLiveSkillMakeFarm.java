
package fire.pb.skill.liveskill;

import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.DataInit;
import fire.pb.RoleConfigManager;
import fire.pb.common.SCommon;
import fire.pb.item.Pack;
import fire.pb.main.ConfigManager;
import fire.pb.skill.SSkillError;
import fire.pb.skill.SkillConstant;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveSkillMakeFarm__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婄拋鏌ュ几濞嗘挻鈷戠紓浣姑粭鈺佲攽椤斿搫锟芥骞戦姀鐘闁靛繒濮撮懓鍨攽閳藉棗鐏ユい鏇嗗懎鏋堢�广儱顦伴悡鐔兼煟閺傛寧鎲搁柟铏礈缁辨帡鎮╅搹顐㈢３濡ょ姷鍋涢崯顐ョ亙闂佸憡渚楅崰妤�鈻嶅鍫熺厵闁兼祴鏅炶棢闂佸憡鎸荤换鍫ュ箖濮楋拷瀹曞ジ濮�閵忣澁绱冲┑鐐存尰閼归箖鏁冮妷褝鎷峰鎰佹綈缂佺粯绻堟慨锟介柨婵嗘噽閸橆偊姊洪崨濠冣拹闁绘濞�楠炲啴鍨鹃弬銉︻潔濠殿喗顭囬崑鎾讹拷姘秺閹嘲鈻庤箛鎿冧痪闂佽鍨扮�氫即寮诲☉銏″亹鐎规洖娲ら埛鍫㈢磽娓氬洤鏋熸俊顐㈠暣楠炲啫顭ㄩ崼鐔锋疅闂侀潧顧�闂勫嫰顢旈悢鍏尖拻濞达綀妫勮闂佹寧纰嶉妵鍕晜閸喖绁悗瑙勬礃閸ㄦ寧淇婇悜钘夌厸闁稿本绮岄獮鎰版⒑鐠囪尙绠抽柛瀣█椤㈡俺顦抽柟渚垮姂瀹曟帡鎮欑�电骞嶆俊鐐�栭弻銊╁箹椤愶附鏅搁柤鎭掑劤缁犳捇鏌ｉ敐鍥у幋妤犵偞甯￠獮瀣籍閿熶粙锝炲鍛斀妞ゆ梻鐡斿▓鏃�淇婇锝嗏拻婵″弶鍔欓弫鎾绘晸閿燂拷
 * @author changhao
 *
 */
public class CLiveSkillMakeFarm extends __CLiveSkillMakeFarm__ {
	@Override
	protected void process() {
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);	
		if (roleid < 0)
			return;
		mkdb.Procedure liveskillmakefarm = new mkdb.Procedure()
		{			
			@Override
			protected boolean process()
			{
				int skilllevel = 1;
				int money = 100;
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(roleid, 
						LiveSkillManager.LIVE_SKILL_TYPE_MAKE_FARM, skilllevel,"闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氱紓鍌氬�烽懗鑸垫叏闁垮绠鹃柨鐔剁矙閺屸�崇暆閿熶粙宕伴弽褏鏆︽繝濠傛－濡查箖鏌ｉ姀鈺佺仭闁烩晩鍨跺璇测槈濞嗘垹鐦堥梺鍛婁緱閸橀箖宕㈤锔解拺闂侇偅绋撻埞鎺楁煕閺傝法鐒烽柣蹇斿浮濮婃椽宕烽褏鍔稿┑鐐差嚟閸忔ɑ淇婇幘顔肩疀妞ゆ柨澧介敍婵囩箾鏉堝墽鍒伴柟纰卞亜閻剟姊绘担鍛婂暈妞ゃ劌妫欑换娑欑節閸屻倕娈ㄩ柣鐘叉处缁佹潙危閸喍绻嗘い鏍仦閺佽鲸銇勯銏⑿㈤柍瑙勫灴椤㈡瑧绮电�ｎ偆鏆ラ梻浣虹帛椤ㄥ懎螞濞嗘埊鎷烽棃娑栧仮妤犵偛娲、妤佸緞鐎ｎ亞妲ｉ梻鍌欑窔濞佳囨偋閸℃あ娑樷枎閹寸姷鐒奸柣搴秵閿熷鍨婚幊鎾烩�﹂妸鈺佺妞ゅ繐瀚崢浠嬫煟鎼淬埄鍟忛柛鐘崇墵閳ワ箓鏌ㄧ�ｂ晝绠氶梺褰掓？缁�渚�鎮″☉銏＄厱閻忕偛澧介悡顖滅磼閵娿倗鐭欐慨濠勭帛閹峰懏绗熼婊冨Ъ闂備礁鎼悧婊堝礈濞戞艾鍨濇繛鍡樻尭缁狅綁鏌ㄩ弮鍌滃笡闁哄懏绮撳铏规崉閵娿儲鐝㈤梺鐟板殩閹凤拷",
						YYLoggerTuJingEnum.tujing_Value_dagong, false);
				
				if (energyenough == false) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈嗐亜椤撶姴鍘寸�殿喖顭烽弫鎰緞婵犲嫮鏉告俊鐐�栫敮濠囨倿閿曞倸纾块柟鍓х帛閳锋垿鏌熼懖鈺佷粶濠碘�炽偢閺屾稒绻濋崒娑樹淮閻庢鍠栭…鐑藉极閹邦厼绶炲┑鐘插缂嶅倿姊绘担铏瑰笡闁挎岸鏌涢悢閿嬪仴鐎殿喗濞婂畷濂稿Ψ閿旇瀚肩紓鍌欑椤戝棝顢栧▎鎾崇？闊洦鏌ｆ禍婊堟煙鐎涙绠ユ俊顖ゆ嫹闁诲孩顔栭崰鏍�﹂柨瀣╃箚闁归棿绀侀悡娑㈡煕鐏炲墽鐓紒銊ょ矙濮婄粯鎷呮笟顖滃姼闂佸搫鐗滈崜娑氬垝濞嗘挸绠ｉ柨鏃傜帛閺呮粓姊虹捄銊ユ珢闁瑰嚖鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻鐔虹磼閵忕姵鐏嶉梺绋块椤︻垶鈥﹂崸妤佸殝闂傚牊绋戦～宀�绱撴担鍝勭彙闁搞儯鍔庨崢閬嶆⒑閸濆嫮袪闁稿﹥娲橀弲鍫曞蓟閵夛箑锟藉灚鎱ㄥ鍡楀缂佸妞介弻鈥崇暆閿熶粙宕伴弽褏鏆︽繝濠傛－濡查箖鏌ｉ姀鈺佺仭闁烩晩鍨跺璇测槈濞嗘垹鐦堥梺绋挎湰缁嬫垶绂掗幘顔解拺闁告繂瀚～锕傛煕閺冿拷閸ㄧ敻顢氶敐澶婄妞ゆ棁妫勯敓鐣屽厴閹綊宕堕崶褍顏╂い蹇撶埣濮婃椽宕ㄦ繝鍕ㄦ濡炪値鍙庨崜鐔奉嚕閵婏箑顕遍悗娑櫱氶幏濠氭⒑缁嬫寧婀伴柣鐔村姂瀹曟鐣濋敓鐣屾閹烘鏁嬮柛娑卞幘娴犳悂鎮楀▓鍨灈妞ゎ參鏀辨穱濠囧箹娴ｅ摜鍘告繛杈剧到瑜般劑寮撮姀锛勫幗闁瑰吋鎯岄崹宕囩矓閻㈠憡鐓曢柣妯诲墯濞堟粎锟借娲橀崹鍨暦閹烘鍊烽悗鐢殿焾楠炴劙姊绘担瑙勫仩闁稿寒鍨跺畷鏇㈡焼瀹ュ棗锟借埖銇勮箛鎾跺闁绘挾鍠栭弻鐔煎箚瑜嶉懜褰掓煕閺冩挾鐣甸柡灞革拷宕囨殕閻庯綆鍓涜ⅵ闁诲孩顔栭崰妤呭箰閹惰棄绠栨繛鍡樺灦鐎氭氨鎲告惔锝忔嫹濮橆剛绉洪柡灞剧洴閺佸倻鎷犻幓鎺嶇礋闂備胶鎳撻崲鏌ュ床閺屻儻缍栨繝闈涱儐閸婇攱銇勯幒鐐村濡炪倕楠忛幏锟�? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.EnergyNotEnough));
					return true;						
				}
				
				Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, false);
				
				if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存鐐达耿閹崇娀顢楁径瀣撴粓姊绘担瑙勫仩闁告柨绉堕幑銏ゅ礃椤斿槈锕傛煕閺囥劌鐏犻柛鎰舵嫹婵＄偑鍊栭崝锕�顭块敓鐣岀磼椤旂厧顣崇紒杈ㄦ尰缁楃喐绻濋崘顭戜紦婵犵數濮伴崹鐓庘枖濞戙埄鏁勯柛鏇ㄥ幗瀹曟煡鏌涢埄鍐檨闁绘挸绻橀弻娑㈩敃閿濆洨鐣洪梺闈╃稻濡炰粙寮诲☉銏℃櫜闁告侗鍠涚涵锟界紓鍌欐祰妞村摜鏁敓鐘茬畺闁冲搫鎳忛ˉ鍫熺箾閹寸偛绗氶柣搴濆嵆濮婄粯鎷呴崨濠冨創闂佹椿鍓欓妶绋跨暦娴兼潙鍐�妞ゆ挾濮寸粊锕傛⒑缁洖澧查柛鎴犳嚀鍗卞Δ锝呭暞閳锋垿鏌熺粙鎸庢崳闁宠棄顦辩槐鎺撳緞婵犲嫮楔閻庢鍠栭…鐑藉极閹剧粯鍋愰柟缁樺笩閿熻棄鐏濋—鍐Χ閸℃ê鏆楁繝娈垮枤閸忔ê顕ｉ幎钘壩ч柛娑变簼閺傦拷婵＄偑鍊栧濠氬Υ鐎ｎ喖缁╃紓浣姑肩换鍡涙煟閹邦厼顥嬮柣顓熺懇閺屾洟宕遍弴鐙�妲柧缁樼墵閺屾稑鈽夐崡鐐寸亶濠电偛鎳岄崹钘夘潖閻戞ê顕辨繛鍡樺灥閸╁矂姊哄ú璇插闁靛牊鎮傞獮鍡楃暆閸曨偆顔掔紓鍌欑劍閿氶柨鐔烘櫕閺佸寮婚敐澶婎潊闁绘ê鍟块弳鍫熺箾鐎涙ê娈犻柛濠冪箞瀵鎮㈡搴㈡疂闂佸搫顦扮�笛傜昂濠碉紕鍋戦崐銈夊磻閸涱垱宕查柛顐犲劘閿熸垝绀佽灃濞达絽鎽滅粣鐐烘煟鎼搭垳绋婚柟绋跨埣瀹曟繈骞嬪┑鎰稁闂佹儳绻楅～澶婄暦婢舵劖鐓忓┑鐐茬仢閸旀粓鏌ｈ箛鎾搭棞闁宠鍨块崺銉╁幢濡炲墽鐩庨梺璇插閸戝綊宕板璺虹闁圭儤姊圭�氭氨锟界懓澹婇崰鏍箖閹寸偟绡�闁靛骏绲剧涵楣冩煥閺囶亞鐣甸柡浣哥Ч閹垽宕楃亸鏍ㄥ濠电偞鎸婚懝鎯洪妶鍡樻珷妞ゆ柨澧界壕鐓庮熆鐠轰警鐓柛銈囧枔缁辨帡顢欑喊杈╁悑闂佽鍠掗弲婵嬪箯閻樼粯鍤戞い鎺戭槸閺咃綁姊婚崒娆戭槮婵狅拷闁秴鐓曢柛顐犲劚閸屻劌螖閿濆懎鏆欓柛灞诲妽缁绘繃绻濋崒娑樻缂佹儳澧介弲顐︽晸閽樺鐣柛搴″船铻炴繛鎴炵懄濞呯娀鏌ｉ姀鐘冲暈闁绘挻鐩幃姗�鎮欓棃娑楀缂備緤鎷烽悗锝庡墾閹烽鎲撮崟顒傤槶闂佸憡顭嗛崶褏鍘撮梺纭呮彧缁犳垹绮诲☉娆嶄簻闁瑰墽顒茬槐锟犳煕閵夛絽濡烽柟鐤缁辨捇宕掑▎鎴濆闁藉啴浜堕幃妯跨疀閺囩儐鏆紓浣虹帛閻╊垶骞婇悩娲绘晢闁跨喍绮欏绋库槈濮樼偓瀚规繛鍫濈仢閺嬫稒銇勯銏℃暠濞ｅ洤锕獮鏍ㄦ媴閸濄儱骞愰梻浣侯焾閺堫剟鎯岄鎹愬С濞寸姴顑嗛埛鎺懨归敐鍕劅闁绘帡绠栭弻锟犲醇椤愩垹顫紓渚囧枟閻熲晠鐛�ｎ喗鏅滅紓浣股戝▍鍡涙⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�? by changhao
				{
					fire.pb.fushi.SCommonDayPay cost = ConfigManager.getInstance().getConf(fire.pb.fushi.SCommonDayPay.class).get(7);
					money = cost.getServerdata();
					
					//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁樺灴婵＄敻宕熼姘鳖啋闂佸憡顨堥崑鐔哥閼测晝纾藉ù锝呮惈椤庡矂鏌涢妸銉у煟鐎殿喛顕ч埥澶愬閻樼數鏉搁梻鍌氬�搁悧濠勭矙閹烘鍊堕柛顐犲劜閸婄敻鏌ｉ悢鍝勵暭闁哥喓鍋熺槐鎺旀嫚閹绘帗娈绘繝纰夌磿閺佽鐣烽悢纰辨晬婵﹢纭搁崯瀣⒑鐠囨煡鍙勬繛浣冲洤绠烘繝濠傜墛閸嬧晛鈹戦崒姘暈闁抽攱鍨归惀顏堫敇閻愭潙顎涘┑鐐插悑閸旀牜鎹㈠☉銏犵煑濠㈣泛鑻埛宀勬⒑缁洘娅囬柛瀣ㄥ�濋悰顔撅拷锝庡枟閺呮粓鏌﹀Ο渚Х婵顨婂缁樻媴閸濄儳楔濡炪倧缍囨俊鍥╁垝閸喓鐟归柨鐔绘椤曪綁寮婚妷锔惧姸閻庡箍鍎卞Λ宀勫箯濞差亝鈷戦柛娑橈功缂傛岸鏌涙惔銈夊摵闁绘閰ｉ弻锝嗘償閿濆棭浠ч梺鍦厴椤ユ挾妲愰幒鏃撴嫹閿濆骸骞楃痪顓炵埣閺岋繝宕遍鐘垫殼闂佸搫鐬奸崰鎰焽韫囨稑绀堢憸蹇涘汲閻樼粯鐓曢柕澶堝劤閹界姷绱掔紒妯肩疄濠殿噯鎷烽梺鎸庣箓濡盯濡撮幇鐗堚拺闁圭瀛╃壕鎼佹煕閺冿拷閸ㄥ潡鎮伴鍢夋棃宕ㄩ鐐茬ギ闂備線娼х换鍡涙晸閽樺甯犻柣銏㈢帛缁绘繈鎮介棃娴躲垽鏌ㄩ弴妯猴拷婵嗙暦椤栫偛绠ユい鏂垮綖缁楀绱撻崒娆戝妽闁挎洍鏅涢埢鎾寸鐎ｎ偆鍘介梺褰掑亰閸樼晫绱為幋锔界厽闊洦鎼╅崵鐔兼煥閻斿嚖鎷烽悤浣圭秷濠电偛寮剁划鎾崇暦娴兼潙鍐�妞ゆ挻绮ｉ幏閿嬫媴缁洘顫嶅┑鈽嗗灦閺�閬嶏綖瀹ュ應鏀介柣鎰级椤ユ粎绱掔紒妯哄闁逛究鍔戝畷姗�顢欑憴锝嗗濠电偠鎻紞锟芥俊顐㈠瀹曘儵鎮烽幍铏杸濡炪倖妫佹慨銈囩礊閹达附鍋傞柕鍫濐槹閻撶喐淇婇婵嗕汗閻㈩垱鐩弻锟犲川椤旇棄锟芥劙鏌＄仦鍓р檨缂佺粯绻堝畷鐔碱敃閿濆浄鎷锋繝姘拺婵懓娲ゆ慨锟藉┑鐐叉嫅缁插灝危閹版澘绠虫俊銈勭劍濞呫垺绻涚�电孝妞ゆ垵妫濆鏌ュ箹娴ｅ湱鍙嗛梺缁樻礀閸婂湱锟芥熬鎷� by changhao
					if(bag.addSysMoney(money, LiveSkillManager.MakeFarm, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuiyaofang, 0) != money)
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;					
					}		
				}
				else
				{
					final fire.pb.common.SCommon cc = fire.pb.RoleConfigManager.getRoleCommonConfig(109);
					money = Integer.parseInt(cc.getValue());
					
					//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁樺灴婵＄敻宕熼姘鳖啋闂佸憡顨堥崑鐔哥閼测晝纾藉ù锝呮惈椤庡矂鏌涢妸銉у煟鐎殿喛顕ч埥澶愬閻樼數鏉搁梻鍌氬�搁悧濠勭矙閹烘鍊堕柛顐犲劜閸婄敻鏌ｉ悢鍝勵暭闁哥喓鍋熺槐鎺旀嫚閹绘帗娈绘繝纰夌磿閺佽鐣烽悢纰辨晬婵﹢纭搁崯瀣⒑鐠囨煡鍙勬繛浣冲洤绠烘繝濠傜墛閸嬧晛鈹戦崒姘暈闁抽攱鍨归惀顏堫敇閻愭潙顎涘┑鐐插悑閸旀牜鎹㈠☉銏犵煑濠㈣泛鑻埛宀勬⒑缁洘娅囬柛瀣ㄥ�濋悰顔撅拷锝庡枟閺呮粓鏌﹀Ο渚Х婵顨婂缁樻媴閸濄儳楔濡炪倧缍囨俊鍥╁垝閸喓鐟归柨鐔绘椤曪綁寮婚妷锔惧姸閻庡箍鍎卞Λ宀勫箯濞差亝鈷戦柛娑橈功缂傛岸鏌涙惔銈夊摵闁绘閰ｉ弻锝嗘償閿濆棭浠ч梺鍦厴椤ユ挾妲愰幒鏃撴嫹閿濆骸骞楃痪顓炵埣閺岋繝宕遍鐘垫殼闂佸搫鐬奸崰鎰焽韫囨稑绀堢憸蹇涘汲閻樼粯鐓曢柕澶堝劤閹界姷绱掔紒妯肩疄濠殿噯鎷烽梺鎸庣箓濡盯濡撮幇鐗堚拺闁圭瀛╃壕鎼佹煕閺冿拷閸ㄥ潡鎮伴鍢夋棃宕ㄩ鐐茬ギ闂備線娼х换鍡涙晸閻ｅ矈鍔滈柟椋庡厴閹粙宕ㄦ繝鍕箺闁荤喐绮岀粔褰掔嵁婢舵劖鏅柛鏇″煐鐎氳鎱ㄥ鍡楀缂佸鍎ら幈銊︾節閸愨斂浠㈤悗瑙勬磸閸斿秶鎹㈠┑瀣妞ゎ厽鍨惰ⅸ闂傚倸鍊烽懗鍫曗�﹂崼銉晞闁告侗鍘欏☉妯锋斀閻庯綆鐓夐幏閿嬫媴閸撳弶寤洪梺璺ㄥ枙濡嫰鎮鹃悜绛嬫晝闁挎洩鎷风紒锟界�ｎ喗鐓忓┑鐘茬箻濡绢噣鏌℃径瀣�愭慨濠勭帛閹峰懘鎼归悷鎵偧婵＄偑鍊ら崢鐓幟洪妸鈺佺闁圭儤顨忛弫宥嗘叏濮楀牏绋绘い顐㈢Ч閹嘲顭ㄩ崟顒夋閻庢鍠栭…鐑藉极閹版澘宸濋柛灞剧♁閳锋劙鏌熷畡鐗堝殗闁圭厧缍婂畷鐑筋敇閻愯尙鐟ㄩ梻鍌氬�峰ù鍥敋瑜旈弻濠囨晲閸滀胶鍔烽悷婊勬⒐娣囧﹪宕奸弴鐐殿啇婵炶揪绲介幉锟犳倵椤掑嫭鈷戦柣鐔告緲閳锋梻绱掗鍛仸鐎殿喗鐓￠獮鏍ㄦ媴閸︻厼寮抽梻浣虹帛濞叉牠宕愰崷顓ㄦ嫹濮樼偓瀚� by changhao
					if(bag.subGold(money, LiveSkillManager.MakeFarm, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuiyaofang, 0) != money)
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;					
					}					
				}
				
				SLiveSkillMakeFarm msg = new SLiveSkillMakeFarm();
				msg.addgold = money;
				mkdb.Procedure.psendWhileCommit(roleid, msg);					
		
				return true;
			}
		};
		
		liveskillmakefarm.submit();
		
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800527;

	public int getType() {
		return 800527;
	}


	public CLiveSkillMakeFarm() {
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
		if (_o1_ instanceof CLiveSkillMakeFarm) {
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

	public int compareTo(CLiveSkillMakeFarm _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

