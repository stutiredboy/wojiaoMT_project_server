
package fire.pb.npc;
import fire.pb.mission.activelist.RoleLiveness;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestActivityAnswerQuestion__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRequestActivityAnswerQuestion extends __CRequestActivityAnswerQuestion__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestteammatchlist = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				fire.pb.mission.activelist.RoleLiveness actrole = fire.pb.mission.activelist.RoleLiveness.getRoleLiveness(roleid, false);
				if (actrole != null)
				{
					int count = actrole.getActiveNum(fire.pb.mission.activelist.RoleLiveness.ANSWER_QUESTION);
				
					fire.pb.activity.ActivityConfNew activity = RoleLiveness.getConfigActivity(fire.pb.mission.activelist.RoleLiveness.ANSWER_QUESTION);
					
					boolean start = fire.pb.activity.answerquestion.ActivityQuestionManager.getInstance().IsStart();
					if (count < activity.maxnum && start == true) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柛婵嗗椤忋儵鏌涙惔銊ゆ喚闁糕晝鍋ら獮瀣晜閽樺姹楅梻浣告啞閻熴儵藝娴兼潙绠栨繛鍡樺灩绾捐棄霉閿濆懏鎯堟い搴＄焸閺屾盯濡搁妷褍鐓熼悗娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁樺姍濠�渚�姊虹粙璺ㄧ闁告艾顑囩槐鐐哄箣閿旂晫鍘遍梺闈涱焾閸庨亶鏁撻挊澶樼吋妤犵偛顦甸獮鏍ㄦ媴閻熼缃曢梻浣稿閸嬪懐鎹㈤崟顖涘仭闁哄被鍎查埛鎴犵磼鐎ｎ亜鐨＄�规悶鍎甸弻锝夊冀瑜嬮崑銏拷娈垮枦椤曆囧煡婢舵劕顫呴柍鍝勫�瑰▍鍥⒒娴ｈ櫣甯涢拑杈╂喐閺夊灝鏆為柟渚垮妽閹棃濡搁敂瑙勫婵犳鍠氶幊鎾趁洪妶澶嬫櫢闁兼亽鍎哄▓婊咃拷瑙勬礃閸ㄥ潡鐛锟介幊婊堟濞戞鍝庡┑鐘垫暩婵烇拷婵炰匠鍏犳椽濡歌婵剟鏌ㄩ悢鍓佺煓婵﹨娅ｇ划娆撳箰鎼淬垺瀚崇紓鍌欑贰閸犳牠鎯岄崒鐐叉槬婵炴垯鍨归柋鍥煏婢舵稖鍚傞柟閿嬫そ閺屸剝寰勭仦鎴掓勃婵犮垻鎳撳Λ婵婃闂佹寧娲栭崐褰掓偂閺囥垺鐓熼柡鍥ㄦ皑椤︼箑霉濠婏拷閸楁娊寮诲☉銏犵厸闁告劑鍔嬪Σ鎰旈悩闈涗粶妞ゆ垵顦靛顐﹀礃椤旇姤娅㈤梺浼欑到閼活垶藟濮樿埖鐓曢煫鍥ㄨ壘娴滃湱绱掗埥鍛婵犵數濮烽弫鍛婃叏閹绢喖纾圭憸鐗堝笒缁犳煡鏌ㄥ┑鍡╂Ч闁绘挻娲熼弻锟犲礃閹稿骸顏堕梻浣筋嚃閸犳牠宕愰幖渚婄稏闊洦鎷嬪ú顏嶆晜闁告洦浜為悙濠囨⒒娴ｅ憡鍟炴繛鑼枎椤洩顦圭�规洘绮撻、娆撳礈瑜忛敍婵囩箾閹剧澹橀柨鏇樺劤閿熻姤淇洪～澶屾崲濞戞瑦缍囬柛鎾楀嫬浠归梻浣告惈閹峰宕戦崨顖滅焿鐎广儱顦涵锟介梺缁樺姀閺呮粓寮敓浠嬫⒒娴ｅ摜鏋冩俊顐㈠铻炴俊銈勮兌椤╂煡鏌ｅΔ锟介悧鍕濠婂牊鐓ユ繝闈涙缁犳娊鏌ｉ敐澶夋喚婵☆偂鐒﹀鍕箛椤撶姴骞堥梻渚�娼чˇ浠嬪窗閺嶃劍娅犳い鏂垮⒔绾惧ジ鏌ㄩ悢鍓佺煓鐎规洘甯掗…銊╁箛椤撶儐浼撻梻浣界毇閸愨晛鏆堥柣搴㈣壘缂嶅﹤顫忓ú顏勫窛濠电姴鍟ˇ鈺呮⒑閸涘﹥灏伴柣鈺婂灠閻ｇ兘濮�閿涘嫷娴勯柣搴秵閸嬶拷闁圭柉娅ｇ槐鎾诲磼濞嗘垵濡介柦鍐憾閺屽秹鏌ㄧ�ｎ亞鐟查梺闈涙搐鐎氫即銆佸锟介幃娆撴濞戣鲸婢戦梻鍌欑窔閿熻姤绋撻埞鎺楁煕閺傝法鐒告い銏∩戠缓鐣岀矙閸喛锟藉灝鈹戦埥鍡楃仩闁圭⒈鍋呯�靛吋鎯旈埦锟介弨浠嬫煟濡櫣浠涢柡鍡忔櫅閳规垿顢欓懞銉ュ攭閻庤娲橀崹鍨暦閸楃偐妲堟繛鍡楃箣缁ㄩ潧鈹戦悩缁樻锭闁稿﹥鎮傞獮澶愭晸閻樺啿浜楀┑鐐村灦閳笺倛銇愰幒鎾存珳闂佸壊鍋掗崑鍛礊閸儲鍊甸悷娆忓缁�锟介梺娲诲幖閸婂灝顕ｆ繝姘労闁告劏鏅涢鎾绘煟閻斿摜鎳冮悗姘煎墰婢规洟骞庨懞銉㈡嫼闁哄鍋炴竟鍡涘礉瀹ュ鐓欓柣鐔哄閸犳锟芥鍣崑濠囩嵁濡偐纾兼俊顖滅帛椤忕喖姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷? by changhao
					{
						xbean.Properties prop = xtable.Properties.select(roleid);
						if (prop == null)
						{
							return false;
						}
						
						if (prop.getLevel() < activity.level)
						{
							return false;
						}
						
						xbean.ActivityQuestion activityquestion = xtable.Roleid2activityquestion.get(roleid);
						
						final long now = java.util.Calendar.getInstance().getTimeInMillis();
						if (activityquestion == null) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柛銊ュ�歌灃闁挎繂鎳庨弳娆戠磼閻樺磭鈽夐棁澶愭煥濠靛棙鍣洪悹鎰剁磿缁辨帞锟斤絺鏅為崗宀�绱掓潏銊﹀磳鐎规洘甯掗～婵嬵敆婵犲啫顏堕梺缁樺灱婵倝宕愰崸妤佺叆闁哄洦姘ㄩ崝宥夋煙閸愯尙鐒告慨濠勭帛閹峰懘宕ㄦ繝鍌涙畼闂備浇宕甸崰鍡涘磿閹惰棄绠查柕蹇曞濞笺劑鏌ㄩ悢缁橆棄妞ゆ洩绲剧换婵嗩潩椤撶偘绨婚梻浣瑰劤缁绘劕锕㈤柆宥嗘櫖婵犲﹤鐗婇埛鎴︽⒒閸喓銆掔紒鐘插暱閳规垿顢欓悙顒佹瘓闂佽鍠楅敃銏犵暦婵傜唯闁挎棁顫夌�氬吋绻濋悽闈涗哗閻忓浚浜、姘愁樄闁绘侗鍠栬灃濞达絽鍚�缁ㄥ姊洪棃娑辩劸闁稿骸顭烽悡顒勵敆閸岋附瀚规繛鍫濈仢閺嬶附銇勯弴鍡楁搐閻撯�愁熆閼搁潧濮囨い顐㈡嚇閺岋絽顫滈敓钘夘焽瑜庨幈銊╁醇閺囩啿鎷绘繛杈剧到閹诧繝宕悙鐑樼厱闁哄喛鎷锋繛鍙夛耿瀵煡鎳滈悽娈挎祫闁诲函缍嗘禍鐐核囬锟藉铏圭磼濡櫣浼囨繝娈垮枔閸婃繈宕哄☉銏犵闁挎梻鏅崢閬嶆椤愩垺澶勯柟绋款煼瀹曟娊鎸婃径鍡橆潔闂佽鍎抽顓㈠矗閿熶粙姊洪崫鍕伇闁哥姵鐗曢悾宄扳枎閹炬緞褔鏌涢埄鍐炬濞寸》鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ψ瑜忕壕钘壝归敐鍛儓鐎涙繄绱撻崒姘毙㈤柨鏇ㄤ簻椤曪絿鎷犲顔兼倯婵犮垼娉涢敃锝囨閸洘鈷戦柛娑橈攻婢跺嫰鏌涚�ｎ偅宕屾鐐茬箻閺屻劎锟斤綆鍓涢惁鍫濃攽椤旇婊堝磿婵犳艾绠柣鎴ｆ瀹告繈鏌℃径瀣仼闁绘挻鍨剁换婵嬪閿濆棛銆愰梺娲诲墮閵堟悂骞嗘笟锟藉畷濂稿Ψ閿旇瀚介梻浣侯焾閺堫剙顫濋妸锔芥珷婵炴垶菧閿熻姤甯掗～婵嬵敇瑜庨悿渚�鎮楃憴鍕婵炲弶绻勭划璇测槈濡攱顫嶅┑鐐叉閸ㄩ潧顕ｉ锟藉缁樻媴閸涘﹤鏆堥梺鍛婃闂勫嫮绮嬪鍜佺叆闁割偅绻傞崵鎴︽煙閸忚偐鏆橀柛鏂跨Ч閹繝宕橀钘変画濠电偛妫楃换鎰邦敂閳哄懏鐓熼煫鍥ㄦ⒐鐏忥箓鏌″畝锟介崰鏍�佸▎鎴炲枂闁告洦鍓涜ぐ瀣煟鎼淬値娼愭繛娴嬫櫇瀵板﹪骞嗚閸ゆ鏌涢弴銊ュ缂佲槄鎷烽梺纭呭亹鐞涖儵骞婇敐澶嬪亜闁稿繐鐨烽幏濠氭⒑缁嬫寧婀伴柣鐔村姂瀹曟浠︽穱鍙樼盎濡炪倖鎸鹃崑鐔告櫠閿旀拝鎷风憴鍕闁荤噦濡囩划瀣箳閺冩挻瀚归柨婵嗙凹缁ㄨ姤銇勯弬鎸庮棦婵﹨娅ｉ幑鍕Ω閵夛妇褰氶梻浣烘嚀閸ゆ牠骞忛敓锟�? by changhao
						{
							activityquestion = xbean.Pod.newActivityQuestion();
							xtable.Roleid2activityquestion.insert(roleid, activityquestion);
							
							fire.pb.activity.answerquestion.ActivityQuestionManager.getInstance().ResetActivityQuestionData(activityquestion, now, true);
						}	
						else
						{
							long lasttime = activityquestion.getActivityquestionstarttime();
							
							if (!fire.pb.util.DateValidate.inTheSameDay(lasttime, now)) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁橈耿瀵鏁愭径濠勵吅濠电姴鐏氶崝鏍礊濡ゅ懏鈷戦悹鎭掑妼閺嬫瑦淇婇銏狀伃鐎规洘鍔欏畷鐑筋敇閻樼數鍔归梻浣告贡閸庛倕螞閹达箑绠柣鎴ｅГ閺呮煡骞栫划鐧告嫹閼碱剙鍤┑鐘垫暩閸嬫盯骞婂畝鍕瀭闁芥ê顦藉鏍ㄧ箾瀹割喕绨奸柛銈呯Ч閺屾洘寰勬繝鍌涚亾婵炲瓨绮犳禍锝呂涢悢濂夋富闁靛牆妫涙晶閬嶆煕鐎ｎ偆鈽夐弫鍫ユ煛鐏炶鍔滈柍閿嬪灦閵囧嫰骞掗悙鏉戭伓缂傚倷绀侀ˇ閬嶅极婵犳艾绠栭柨鐔哄Т鍞梺鍐叉惈閸婂宕㈡禒瀣拺闁告繂瀚弳娆撴煕婵犲懎鍚归柡渚囧枛閳藉鈻庡鍕泿闂備線娼чˇ顓㈠磿閸濆嫀锝夋惞閸︻厾锛滈柡澶婄墑閸斿秶浜搁鐔翠簻闁瑰墽鍋ㄩ崑銏拷瑙勬处娴滎亜鐣峰锟介、姗�鎮欓弶鎴濆濠电姴鐥夐弶鍖℃嫹濡や焦鍙忛柣鎴ｆ绾剧粯绻涢幋娆忕仼闁汇値鍠楅妵鍕箛閳轰礁濮㈡繛瀛樼矆缁瑥顫忓ú顏呭殥闁靛牆鎲涢姀锛勭婵炴潙顑嗗▍鍥瑰鍜佺劸闁宠閰ｉ獮瀣偐闂堟稓顔岄梻鍌欒兌缁垶宕濆Δ鍛？闁靛牆顦伴崑鍌炴煟閺冨倸甯剁紒鐘茬秺閺岀喓鍠婇崡鐐茬闂佽楠忕徊璺ㄦ閹烘挸绶為悘鐐靛亾濮ｅ牓姊洪崫鍕拱缂佸鐗滅划璇测槈閵忕姷鐫勯梺鐟板⒔濞呫垽骞忔搴㈠磯妞ゎ厽甯楃�氳绻涢崼婵堜虎闁哄鍠栭弻鐔碱敊閻撳函鎷烽幖渚囨晪闁挎繂妫涢々鐑芥倵閿濆懐浠涢柡鍜冪秮濮婅櫣绱掑Ο鑽ゅ弳闂佹悶鍊栭悧鐘荤嵁韫囨稒鍊婚柦妯侯槸閻庮厼顪冮妶鍡楀Е闁稿鎳橀、娆撳籍閸啿鎷虹紓鍌欑劍閿氬┑顔肩焸閹绠涢弮鍌涘櫗缂備礁鍊圭敮鈩冩叏閿熶粙鏌曢崼婵囶棤闁告﹢浜跺娲传閸曨偅鐏曢梺鍦厴椤ユ捇鎯�椤忓牆绾ч悹鎭掑壉閿濆洨纾肩�癸拷閸愵喖鎽电紓浣虹帛缁诲牆鐣烽崼鏇熷殝闁割煈鍋呴悵鏍⒒閸屾瑧鍔嶉悗绗涘懏宕查柛灞绢嚔濞差亝鏅濋柛灞惧哺濡嘲顪冮妶鍡樼┛闁圭兘鏀遍幈銊︾節閸愨斂浠㈤梺鍦劜缁绘繃淇婇崼鏇炲窛妞ゆ梻鏅弳姘舵⒒閸屾瑧鍔嶉柟顔肩埣瀹曟洟顢涢悙鑼槷婵犮垼鍩栭崝鏇犵不椤栨粎纾藉ù锝堫嚃閻掔晫绱掗悩鑽ょ暫鐎殿喖鐖煎畷鐓庘攽閸″繑瀵栭梻浣告啞鐢﹪宕￠幎钘夎摕闁绘梻鍎ょ�氭氨鎲歌箛鏇炲К闁跨喍绮欓幃妤冩喆閸曨剙顦╅梺鎼炲妼閻栧ジ鐛崘銊㈡瀻闁圭偓娼欓敓鐣岀帛娣囧﹪顢涘鍐ㄤ粯濡ょ姷鍋為敃銏狀潖缂佹鐟归柨鐔绘椤洭鎳￠妶蹇斿闂傚牊绋撻悞鍝ワ拷瑙勬磸閸ㄨ棄鐣峰Δ鍛殐闁冲搫锕ラ柨銈夋⒒娴ｅ憡鍟為柟绋挎瀹曘劑顢涢妶鍥х哎闂傚倷绀侀幖顐λ囬柆宥呯；闁绘劕顕悵鍫曟煕閳╁啰鈾侀柛搴㈩殕缁绘盯宕卞Ο铏瑰帎闂佺懓鍢查崲鏌ュ煝閹捐鍨傛い鏃傛櫕瑜邦垶姊绘笟锟藉鑽ょ礊閸モ晛绶ゅù鐘差儐閸嬧晠鏌ｉ幋锝嗩棄缂佺姵濞婇弻鐔煎箹椤撶偛绠婚梺鍛婄懃濡繂顫忓ú顏勫窛濠电姴鍊搁～鍥⒑閸涘﹥鐓ョ紒缁橆殜璺柛宀�鍋為埛鎺楁煕鐏炴崘澹橀柨鐔绘閸㈡煡婀侀梺鎼炲労閸擄箓寮�ｎ剚鍠愰煫鍥ㄧ♁閺呮悂鏌ら幁鎺戝姢闁崇粯鎹囬弻锟犲川椤斿墽鐣奸梺鍛婂笚鐢帡鍩㈡惔銊ョ鐎规洖娴傞崬鐑樼節瀵伴攱婢橀敓鑺ユ崌閹偤鏁冮敓浠嬪煝瀹ュ绫嶉柛灞剧矌閿涙繈姊虹粙鎸庢拱闁煎綊绠栭弫鎾寸鐎ｅ灚顥栫紓渚囧枛閻楀﹪骞忛崨顖涘枂闁告洦鍓涜ぐ鍧楁⒑閻熸澘鎮戦柣锝庝邯瀹曟繂鐣濋敓鑺ョ珶閺囩喓绡�婵﹩鍘鹃崢顏堟⒑閸撴彃浜濈紒璇茬Т鍗遍柟闂寸劍閻撱垽鏌涢幇鍏哥盎闁哄妫冮弻銊╂偄缂佹﹩妫勭紓浣哄Т缁夌懓鐣烽弴銏＄劶鐎规挶鍎卞ú顓€�佸☉妯锋婵妫楀▓濂告⒒娴ｈ櫣甯涙い顓炴川閸掓帡顢涢悙鏉戜簵闂佸搫娲㈤崹娲偂濞戙垺鐓曢柕澶涚到閸旀艾鈹戦敍鍕付闂囧绻濇繝鍌涱棡妞ゃ儱顦靛Λ浣瑰緞閹邦厾鍘介梺瑙勫礃濞呮洟宕径鎰�垫慨姗嗗亜瀹撳棝鏌＄仦鐣屝ら柟鍙夋尦瀹曠喖顢曢妶鍕闂傚倷娴囬鏍窗濡ゅ懏鍋￠柨鏇炲�归弲顒勬煙闁箑鍘撮柡锟芥禒瀣厱闁斥晛鍠氶悞浠嬫煛婢跺孩顏犵紒杈ㄦ崌瀹曟帒顫濋濠冨闁绘垼濮ら崐鍧楁煥閺囨岸妾峰ù婊冪秺閺屾盯骞囬妸锔界彆濠电偛鎳愭慨鎾箒闂佺粯锚濡﹪宕曡箛鏇犵＜闁绘ê纾崣锟介梺鍝勬湰濞叉繄绮诲☉銏犲嵆闁绘劖鍔栫粙鎺撶┍婵犲洤绠甸柟鐑樻煥閳敻姊洪崫鍕拱婵炲弶绻勭划璇测槈閵忕姴宓嗛梺缁樺姈閸旀垿宕曢弻銉ノ﹂柛鏇ㄥ灠缁秹鏌ㄩ悢鐑樻珪闁轰緡鍣ｉ崹楣冨箛娴ｅ湱绋佹繝鐢靛仜濡﹥绂嶅鍛笉婵椴搁崰鎰板箹鏉堝墽鎮奸柣顓烆樀閹鏁愭惔鈩冪亶闂佺粯鎸诲ú鐔煎箖濡ゅ懏鏅查幖瀛樼箘閻╁骸顪冮妶鍛畾闁哄懐濞�瀵顓奸崶銊ョ彴闂佽偐鈷堥崕鐑藉Ψ閿旇桨绨婚梺鎸庢磻缁垛�愁焽閹扮増鐓欏〒姘仢婵＄晫绱掔紒妯肩疄鐎规洘甯掗埥澶娾枎韫囨挸顥掗梻鍌氬�峰鎺旀椤旀儳绶ら柛褎顨呯粈鍌涗繆椤栨繃顏犻柡鍡畵閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹捐崵宓侀悗锝庝憾閻撱儵鏌涢弴銊ヤ簽闁告﹢浜跺濠氬磼濮橆剨鎷烽幖浣哥９闁绘垼濮ら崵鍕煕椤愶絾绀�缂佺姷濞�閺岀喖骞戦幇闈涙闂佸憡鑹剧紞濠囧蓟閳ユ剚鍚嬮幖绮癸拷宕囶啇缂傚倷鑳舵刊顓㈠垂閸洖钃熼柕濞炬櫆閸嬪棝鏌涚仦鍓р槈妞ゅ骏鎷� by changhao
							{
								fire.pb.activity.answerquestion.ActivityQuestionManager.getInstance().ResetActivityQuestionData(activityquestion, now, true);	
							}
						}
						
						//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞剧洴楠炲洭顢涘鍗烆槱闂備焦鐪归崹褰掆�﹀畡閭︽綎缂備焦蓱婵挳鏌ｉ悢鐓庝喊闁搞倕顑呴埞鎴︽倷閹绘帞楠囬梺缁橆殘婵挳鎮鹃悜钘夌疀闁哄娉曢鎰箾鏉堝墽鎮兼い顓炵墦閹顢橀姀鈾�鎷虹紓浣割儓濞夋洟鎮橀柆宥嗙厱閻庯綆鍓欐禒閬嶆煙椤曞棛绡�濠碉紕鍏橀崺锟犲磼濠婂啫绠洪梻鍌欑閹碱偄煤閵娾晛纾绘繛鎴欏灪閺呮悂鏌﹀Ο渚Ч閻犳劧绻濋弻銊╂偄鐠囨畫鎾绘煟閺冩垵澧存鐐茬箻閺佹捇鏁撻敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾剁磽娴ｅ搫校婵犮垺锕㈤崺鐐哄箣閿旇棄浜归悗瑙勬礀濞村倿寮抽敓鐘斥拺缂佸顑欓崕蹇涙倵濮樼厧寮┑锛勬暬瀹曠喖顢涘槌栧敽闂備胶鎳撻悺銊ф崲瀹ュ棛顩烽柤娴嬫櫇绾捐棄霉閿濆懏鎯堟い搴＄焸閺屾盯濡搁妸锔俱�愬銈庡亜缁绘劗鍙呭銈呯箰鐎氼剟鎮楅鐑嗘富闁靛牆妫欑粈锟介梺鐟板暱闁帮絽鐣峰鍫晣闁绘棁娅ｉ鏇㈡煟鎼淬垻鈾佹い顓炴喘閹瞼锟斤綆鍓涚壕鍏笺亜閺冨洤袚鐎规洖鐬奸敓鑺ヮ問閸犳牠鈥﹂柨瀣╃箚闁归棿绀佸敮闂侀潧绻嗛崜婵嬪级閹间焦鈷掑ù锝堟閵嗗﹪鏌涢幘瀵哥疄闁靛棗鍟崇粻娑㈠棘濞嗘儳娈奸梻浣芥硶閸犲秶鍒掑▎蹇ｆ綎缂備焦蓱婵挳鎮峰▎蹇擃仴濞寸姍鍥ㄢ拺闁告稑鈾侀懖鈺佸灊婵炲棙鎸哥粻鏍煟閹达絾顥夐柣鎾寸洴閺屾稑鈽夐崡鐐茬哗闂佺濮ゅú鐔奉潖閾忓湱纾兼俊顖滃劦閹峰姊洪崘鎻掓Щ闁绘鎸搁锝夘敃閵忊晛鎮戞繝銏ｆ硾椤戝洭宕㈤鍫熲拺闁告挻褰冩禍婵堢磼鐠囨彃鏆ｉ挊鐔哥節婵犲倸顏ュù婊勭矒閻擃偊宕堕妷銉ュ闁诲孩鐔幏锟�? by changhao
						fire.pb.activity.answerquestion.ActivityQuestionManager.getInstance().sendQuestion(roleid, activityquestion, (byte)0);
					}
				}
				
				return true;
			}
		};
		
		requestteammatchlist.submit();		
	}
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795527;

	public int getType() {
		return 795527;
	}


	public CRequestActivityAnswerQuestion() {
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
		if (_o1_ instanceof CRequestActivityAnswerQuestion) {
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

	public int compareTo(CRequestActivityAnswerQuestion _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

