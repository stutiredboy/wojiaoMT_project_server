
package fire.pb.circletask;
import java.util.Map;





import fire.pb.circletask.anye.RoleAnYeTask;
import fire.pb.mission.PAbandonScenarioMission;
import fire.pb.mission.Sbukefangqirenwu;
import fire.pb.mission.UtilHelper;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAbandonQuest__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAbandonQuest extends __CAbandonQuest__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		CircleTaskManager.logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴楠炴﹢宕ｆ径妯烩枈闂備胶绮敮鎺楁晝椤忓牆钃熼柡鍥╁枔缁犻箖鏌ｉ幇闈涘闁绘繃姊荤槐鎾存媴閸濆嫷锟藉矂鏌涢妸銉у煟鐎殿喖顭烽弫鎰緞婵犲嫷鍚呴梻浣瑰缁诲倿骞夊☉銏犵缂備焦顭囬崢閬嶆煟鎼搭垳鍒板褍娴风划鏃堫敋閿熶粙寮婚敍鍕勃闁告挆锟藉Σ鍫ユ⒑鐎圭媭娼愰柛銊ョ仢閻ｇ兘宕￠悙宥嗘⒐缁绘繃鎷呴悜姗堢础闂傚倸鍊搁崐宄懊归崶顒夋晪闁哄稁鍘奸崹鍌毭归悡搴ｆ憼闁稿顑夐弻鐔煎箲閹伴潧娈梺钘夊暟閸犳牠寮婚妸銉㈡斀闁糕檧鏅滅瑧缂傚倷鑳舵慨鎾�﹂悜钘夎摕婵炴垯鍨圭粻娑欍亜閺嶇數鍒版繛鍫熺箞濮婇缚銇愰幒婵囶棖闂佺绻戦敋闁伙綁顥撶划娆戞嫚閻愵剚顥堥柡浣规尰缁傛帞锟斤綆鍋勯悵鏃堟⒑缂佹ɑ鐓ラ柛姘儔閹繝濡烽埡鍌滃幗闂佸搫鍊圭�笛囧箚閸儱鍐�闁跨喓濮甸埛鎴︽煕濠靛棗顏柛锝堝Г閵囧嫰顢橀悙闈涒叺濠电媴鎷峰〒姘炬嫹婵﹨娅ｇ槐鎺懳熻箛锝勭盎閾伙絽鈹戦悩鍙夋悙缁炬儳娼￠悡顐﹀炊閵婏妇顦紒鐐劤閵堟悂寮婚敐鍛傜喖骞愭惔锝呮锭闂備焦鐪归崝宥夊垂閸ф钃熼柣鏃傚帶閻顭跨捄鐑樻拱闁瑰弶鐟х槐鎾存媴閸濆嫅锝夋煟閳哄﹤鐏犳い鏇秮楠炴﹢顢欓挊澶涙嫹婵犳碍鐓曢柍鈺佸枦娓氭稒淇婇鐘插姦婵﹤顭峰畷鎺戔枎閹邦喓鍋樻俊鐐�栧ú姗�鎮ч悩鑼殾閻熸瑥瀚梽鍕煕濞戞﹫宸ラ柨鐔绘閻栧ジ寮婚悢鍏肩劷闁挎洩鎷烽柣蹇旂☉闇夋繝濠傚暟缁夋椽鏌″畝锟介崰鏍箖濠婂吘鐔烘嫚閼碱剦鏆℃繝鐢靛仜閻°劎鍒掕箛娑崇稏濠㈣泛鏈畷鍙夌箾閹存瑥鐏╃紒鐘差煼閺屸剝寰勭�ｎ亞浠村┑顕嗙到閻楁挸顫忓ú顏勭闁绘劖褰冮‖澶娾攽閻橆喖鐏柨鏇樺灲瀹曟椽濮�閵堝懐顔掑┑鐐跺皺缁垶寮查敐澶嬧拺缂備焦蓱椤ュ棙绻涢崪鍐М闁诡垯绶氬畷鐓庘攽閸愨晜鏉搁梻浣虹帛閸旀浜稿▎鎰珷闁哄洢鍨洪悡鐔肩叓閸ャ劍鈷掔紒鐘靛仧閿熻姤顔栭崰妤呭箖閸屾稐绻嗛柤鎼佹涧缁剁偤鎮楅敐搴″妤犵偛鐗撳缁樻媴閾忕懓绗￠柦鍐憾閺岋綁骞欓崟顓犵槇閻庤娲╃紞浣哥暦閻旂⒈鏁嶆繛鎴炶壘楠炲牓姊绘担鍝ワ紞闁硅櫕鎹囬幃妯衡攽鐎ｎ亞顦┑鐘诧工閹锋垿骞忛悜钘夊瀭妞ゆ劧绲块崙锟犳煟鎼淬垻鐓柛妤佸▕閹即顢氶敓钘夌暦閸洦鏁嗗璺侯儐濞呭矂姊绘担鍛婂暈婵炶绠撳畷鎴﹀川閺夋垶杈堝銈呯箰閻楀﹪鍩涢幒妤佺厱閻忕偛澧介幊鍡涙煕韫囨挾鐏辩紒杈ㄥ浮椤㈡岸宕ㄩ鐘辨闁诲孩顔栭崰鏍�﹂柨瀣╃箚闁归棿鐒﹂弲婊堟煠閹帒鍔ょ憸鏉挎健濮婅櫣娑甸崨顓ф闂佽妞挎禍鐐差嚗婵犲洤閿ゆ俊銈勭閸撳綊姊虹化鏇炲⒉缂佸甯￠幃锟犲Ψ閳哄倻鍘介梺鍝勬川閸嬫盯鏁撻挊澶嬭础闁跨喕濮ら悢顒勫箯閿燂拷.闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽鐎ｎ亣鎽曢梺闈浥堥弲娑氱尵瀹ュ鐓曢悘鐐插⒔閻擃垰顭跨憴鍕婵﹥妞藉畷顐﹀礋椤掑锛佺紓鍌欑贰閸犳骞戦崶褜鍤曞┑鐘崇閺呮彃顭跨捄鐚存敾妞ゃ儲绻堝娲捶椤撗呭姼闁诲孩绋堥弲鐘茬暦娴兼潙绠涢柣妤�鐗冮幏铏圭磽閸屾瑧鍔嶆い顓炴川缁顫濋鐘殿啎婵犮垼娉涢鍥洪幘顔界厱闁冲搫鍟禒杈殽閻愬樊鍎旈柡浣稿暣閺佹捇鎮剧仦绛嬫婵犻潧鍊搁幉锟犳偂閵夆晜鐓涢柛鎰╁妽婢跺嫭銇勯妷銉Ч闁靛洤瀚粻娑㈠Ψ閿曪拷椤忥拷" + roleid + "]闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍蓟閸ヮ剚鏅濋柨鐔剁矙瀹曟繈骞掗幘鍓侇啎閻庣懓澹婇崰鏇犺姳閼姐倗纾奸柣娆忔噽缁夘噣鏌＄仦璇插鐎殿噮鍣ｅ畷鍫曗�﹂幋鐑嗘闂傚倷娴囧▔鏇㈠窗閺囩倣娑㈠礋椤愵偆鍔烽梺璺ㄥ枔婵挳鎷戦悢鍏肩厪濠电偟鍋撳▍鍛存煕濡や礁鈻曢柡宀嬬秮楠炲洭顢涢敐鍛杺闂備礁婀遍崗姗�藟閹捐泛鍨濇繛鍡樺灦鐎氭岸鏌ｉ幇闈涘闁宠棄顦甸幗鍫曟晲閸涱亝鏂�闂佺鏈换鍐夋径宀�纾界�广儱鎷戦煬顒傦拷娈垮櫘閸嬪﹪鐛崶顒�绾ч柛顭戝枤閻涒晜淇婇悙顏勶拷鏍箰閸℃稑绀嬮柛顭戝亽濡捇姊婚崒姘拷鎼佸磹閻戣姤鍊块柨鏇炲�哥粻鏍煕椤愶絾绀�缁炬儳缍婇弻鈥愁吋鎼达絼姹楀┑鐐叉▕娴滄繈宕戦崟顖涚厽闁规崘娅曢崬澶愭煙閼恒儲绀�闁宠鍨块幃娆撳级閹寸姳鎴烽梻浣规偠閸斿苯锕㈡潏鈺佸灊閻犲洦绁村Σ鍫ユ煏韫囧鎷风粵瑙勫闁割偅娲橀悡鐔兼煙闁箑鐏犻柣鎾村姈閵囧嫰濡烽妷顔叫ч梺闈涙搐鐎氼垳绮诲☉娆戠瘈闁告劏鏅濊ぐ瀣繆閵堝洤啸闁稿鍋ら幃褔鎮╁顔兼闂佸壊鍋呭ú鏍不閿濆棎浜滈柡宥冨妿缁犳捇鏌熼姘卞缂佺粯绻傞埢鎾诲垂椤旂晫浜梻浣瑰濞插繘宕曢柆宥侊拷鏃堝礃椤旇棄鐧勬繝銏犲帨閺呮粓鎯勯姘辨殾婵鎷锋い銏＄懇閹虫牠鍩℃担鍝ヮ唶闂傚倸鍊烽懗鍫曗�﹂崼銉ュ珘妞ゆ帒瀚粈鍕偡濞嗗繐顏╂い鏇憾閺屻劑鎮ら崒娑橆伓?:" + questid);
		if(questid == 1080000) {
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴楠炴﹢宕ｆ径妯烩枈闂備胶绮敮鎺楁晝椤忓牆钃熼柡鍥╁枔缁犻箖鏌ｉ幇闈涘闁绘繃姊荤槐鎾存媴閸濆嫷锟藉矂鏌涢妸銉у煟鐎殿喖顭烽弫鎰緞婵犲嫷鍚呴梻浣瑰缁诲倿骞夊☉銏犵缂備焦顭囬崢浠嬫⒑鐟欏嫬鍔ゆい鏇ㄥ弮楠炲﹪宕熼娑氬帾闂佹悶鍎滈崘鍙ョ磾闁诲孩顔栭崰鏍晸閻ｅ苯娅忔俊鑼帶椤啴濡堕崘銊ュ缂備緡鍠楅幑鍥ь嚕婵犳碍鍋勯柛蹇撳悑閸庮亜顪冮妶鍡楀闁搞劌缍婇敐鐐哄箳濡や讲鎷洪柡澶屽仦婢瑰棝藝閿斿墽纾煎璺猴功缁夌儤顨ラ悙鎻掓殭闁宠閰ｉ獮姗�寮堕幋顖涘缂備焦眉缁诲棙銇勯弽顐沪闁轰線浜堕幃妤�顫濋鎯т划濠殿喖锕︾划顖炲箯閸涙潙宸濆┑鐘插�瑰▓妯肩磽閸屾瑦绁版い鏇嗗洤纾瑰┑鐘崇閺呮悂鏌ら幁鎺戝姎闁搞値鍓熼弻娑樷枎韫囨挻娈哄┑鈽嗗亖閸ㄨ棄顫忛搹鍦＜婵☆垰鎼～宥夋⒑娴兼瑧绉靛ù婊勭箘缁顓奸崪浣哄弳闂佸壊鍋嗛崰鎾诲储椤忓懐绡�闁汇垽娼ф禒婊堟煟韫囨梻绠炵�规洘绻傞…銊╁醇閻斿搫骞堥梻渚�娼ч悧鍡涘箠韫囨搩鍟呮繝闈涚墳閹峰嘲鈻撻崹顔芥闂佹悶鍎滈崪浣告櫔闂備胶鍎甸崜婵堟暜婵犲嫮鐭嗗ù锝堟缁�濠傗攽閻樺弶鎼愰柡瀣╃窔閺岀喖鎮ч崼鐔哄嚒閻庣懓鎲＄换鍐Φ閸曨垰鍐�闁靛ě鍛帒婵犵數鍋涢悧婊堝垂娴兼潙鐓橀柟杈鹃檮閸婇锟界懓澹婇崰鏍р枔閼哥數绡�婵炲牆鐏濋弸銈夋煛娴ｈ鍊愮�规洜澧楃换婵嬪磼閵堝懏鍊┑鐘灱濞夋稖鐧岄梺鎸庢礀閸婂綊鎮￠弴銏＄厸闁搞儯鍎辨俊濂告煟韫囨洖啸缂佽鲸甯￠幃鈺呮嚑椤掑﹦绀婇梻浣芥硶閸犳洖螞閸曨厾涓嶇�广儱顦壕鍧楁煕濡ゅ啩绱崇憸鐗堝笒绾惧吋鎱ㄩ敐鍥ワ拷瀣礊娓氾拷閵嗕礁顫濋懜鍨闂佽姤锚椤﹁棄顭囬弽顓熺叄闊洦鍑瑰鎰版倵濮橆厼鍝洪柡灞诲�楅崰濠囧础閻愬樊娼炬俊鐐�栭弻銊ッ洪妶澶婄厴闁硅揪绠戦悡锟犳煕閳╁啨浠︾紒銊ㄥ亹缁辨挻鎷呯粵瀣闂佺粯顨呭Λ婵嬨�佸鑸垫櫜闁搞儯鍔岄悵鏉库攽閻愬瓨缍戞い鎴濇閿濈偛顓兼径瀣ф嫼闂傚倸鐗婄粙鎾剁不閸愭祴鏀芥い鏃囧亹婢э箑鈹戦埄鍐╁�愰柡浣稿�瑰顏堝箥椤旂偓鏅ㄩ梻鍌氬�风粈渚�骞栭锕�鐤い鎰剁畱绾惧綊鏌ｉ悢绋款棎闁哄绉归弻锟犲炊閳轰絿銉х棯閹佸仮闁哄瞼鍠栭弻鍥晝閿熶粙鐛Δ浣典簻闁靛鍎虫晶娑㈡煙娓氬灝濡界紒缁樼箞瀹曟﹢鍩炴径姝屾闂傚倷娴囬鏍窗濮樿泛绀傛慨妤嬫嫹闁绘侗鍠栭鍏煎緞濡粯娅撻梻浣虹帛閸旓箓宕滃棰濇晩闁糕剝绋掗埛鎺楁煕鐏炲墽鎳呴柛鏂跨Ч閺岀喖顢欓懖鈺佺厽閻庤娲樼换鍡欑不濞戙垹绠婚柟閭﹀幘濞插锟借娲滈崰鏍�佸☉妯锋婵☆垵顫夐崑鍛存⒑鐠囧弶鎹ｉ柟铏尵閿熻姤鍑归崢鐣岀博閻旂尨鎷烽敐搴℃灈缂備讲鏅涢湁闁绘ê妯婇崕鎰版煕婵犲嫭鏆柡灞诲妼閳规垿宕卞▎蹇撴瘓缂傚倷闄嶉崝蹇撐涢崟顖涚畳闂備胶绮幐鍝ワ拷鍨浮瀹曟洟寮敓浠嬪箞閵婏妇绡�闁告劏鏂傛禒銏ゆ⒑绾懏鐝柣妤冨█瀹曟椽鎮欓悜妯猴拷閿嬨亜閹虹偞瀚归梺缁樼箞娴滆泛顫忕紒妯诲闁告稑锕ら弳鍫ユ⒑閸︻収鐒炬い顓犲厴楠炲棝宕熼锝嗘櫖濠殿喗顭堟ご绋库枔妤ｅ啯鈷戦悷娆忓椤ュ顭胯椤ㄥ﹤鐣烽幇鐗堝�婚柤鎭掑劤閸樹粙姊洪悷閭﹀殶闁稿孩鍔欓幃鐐寸鐎ｎ偆鍘卞┑鈽嗗灠濠�閬嶆儗濞嗘劖鍙忓┑鐘叉噺椤忕姷绱掓潏銊ョ瑨閾伙綁鏌涜箛鏇炲付婵炲懏鍨垮缁樻媴閻戞ê娈岄梺鍝ュ枙濞夋洟骞戦姀銈呯婵°倓鐒﹀▍銏ゆ⒑閸忛棿鑸柛搴㈠▕瀹曨垶寮婚妷锔惧幍闂佸憡鍨崐鏍拷姘炬嫹?
			new mkdb.Procedure() {
				@Override
				protected boolean process() {
					RoleAnYeTask rayt = new RoleAnYeTask(roleid);
					rayt.endLegendAnYeTask();
					rayt.refreshAnYeTasks(-1);
					return true;
				}
			}.submit();
			return;
		}
		
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犲鏌＄仦绋垮⒉鐎垫澘瀚敓鏂ょ秵娴滄繈顢欓崨顓涙斀闁绘劕寮堕埢鏇灻瑰鍕煉闁挎繄鍋ゅ畷銊э拷娑欘焽閸橆亪姊洪崜鎻掍簼缂佽鍟村畷铏鐎ｎ偆鍙嗗┑鐐村灦閼归箖寮搁幋鐘电＜缂備焦顭囧ú瀵革拷娈垮枛閻栧ジ鐛�ｎ亖鏀介柛銉戝秵瀚规い鏍ㄥ焹閺�浠嬫煟閹邦厼绲婚柟顔藉灴閺岋綁鎮㈠┑鍡樺櫣闁搞劍绻傞埞鎴︽偐鐎圭姴顥濋梺钘夊暟閸犳牠寮婚弴鐔风窞婵炴垶锕╁ú顓㈡⒑閸涘渚涘ù婊庝簻铻為柛娑欐儗閺佸啴鏌曡箛濠傚⒉闁诡喗鐟ラ—鍐Χ閸℃浠撮梺纭呮珪閿曘垹顕ｉ锕�绠荤紓浣姑▓鐔兼⒑闂堟侗妾у┑鈥虫喘钘濇い鎾跺Х绾捐棄銆掑顒佹悙闁哄鐩弻锝呂旈敓浠嬫晝閵堝鏁嬮柕澶嗘櫅缁�瀣亜閺嶃劍鐨戦柣銈忔嫹濠碉紕鍋戦崐鏍箰閻愵剚鍙忛悗闈涙啞閺嗘粍淇婇妶鍛櫤闁抽攱甯掗妴鎺戭潩閻愵剙顏舵繝鐢靛仒閸栫娀宕舵担鍛婂枠妞ゃ垺锕㈡慨锟介柣妯活問濡茬兘鏌ｆ惔锝嗩仧闁归鍏橀弻娑㈠即閵娿儱顫╅梺鍛婃惄閸樺ジ鍩為幋锔藉�烽柛娆忣槴閺嬫瑦绻涚�涙鐭嬬紒璇茬墦楠炲啴鏁撻悩鍐蹭簻闂佺绻楅崑鎰板储娴犲鈷戦柛婵嗗閿熻棄婀遍敓鐣岀懗閸パ呯枀闂佸憡绺块崕宕囧婵傚憡鐓熸慨妤嬫嫹婵炰匠鍕浄闂侇剙绉甸悡娑氾拷鐧告嫹閻庯綆鍓涢敍鐔哥箾鐎电顎撶紒鐘虫尭閻ｅ嘲顭ㄩ崱鈺傂ユ繝纰樺墲瑜板啴鎮ч幘鎰佹綎闁惧繒娅㈤幏鐑藉捶椤撶儐锟藉矂鏌涢妶鍡欐噧閾绘牠鏌ｅΟ铏癸紞闁硅棄鍟撮弻锝堢疀閺傛寧璇炲┑顔硷攻濡炰粙鐛崱姘兼Ь缂備胶濮撮…鐑藉蓟閵娾晜鍋勯悹鍥ㄧ暙閹惧墎纾奸悗锝庡亜濞搭喚锟借娲栭幖顐﹀煡婢跺ň鏋庨柟瀵稿Х濡插洭姊绘担鍦菇闁搞劏妫勯…鍥槼缂佸倹甯掗…銊╁醇閻斿搫骞楅梺鍦劋婵炲﹤鐣峰┑鍥ㄥ劅闁靛鍎抽ˇ顐︽⒑閸︻厼鍔嬮柛鈺佺墦瀹曘儳锟斤綆鍠楅悡鏇㈡煏婢舵稓鍒板┑陇濮ょ换娑㈠醇濠婂啫绁┑顔硷攻濡炰粙骞冨▎鎾村癄濠㈣泛锕ら～姘舵⒒娴ｅ憡鍟為柟姝岊嚙閻ｆ繄绮欑捄銊︽闂佹眹鍨婚…鍫ュ础閹惰姤鐓忛煫鍥ュ劤绾惧潡鏌涘鍡曠凹缂佺粯绻堥幃浠嬫濞戞鍩涢梻浣侯焾椤戝棝骞愰幖浣哥厺鐎广儱顦婵囥亜閺嶃劎鐭岄柨娑欑矒濮婅櫣绱掑鍡欏姼濠电偛鎳忓ú鐔煎箚閸愵喖绠ｉ柨鏃傛櫕閸樼敻姊洪崨濠勬噧妞わ箓浜堕獮妤呭礃椤忓棛锛滈梺缁樏壕顓灻虹�甸潻鎷峰▓鍨灍闁瑰憡濞婇獮鍐煥閸繂鑰垮┑顔筋殔濡瑩鏁嶉崨瀛樷拻闁稿本鑹鹃敓钘夊槻闇夐柛銉戯拷閺嬫牠鏌￠崶銉ョ仼闂傚偆鍨堕弻銊╁即閻愯鎷烽崫銉т笉妞ゆ牜鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�
		if(questid == 205303){
			return;
		}
		Map<Integer,Sbukefangqirenwu> map =  fire.pb.main.ConfigManager.getInstance().getConf(Sbukefangqirenwu.class);
		if(map != null){
			if(map.get(questid) != null){
				fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 141484, null);
				return;
			}
		}
		
		if ( UtilHelper.isBranchScenarioMission( questid ) ) {
			new PAbandonScenarioMission( roleid, questid ).submit();
			return;
		}
		
		new PAbandonCircleTask(roleid, questid).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 807434;

	public int getType() {
		return 807434;
	}

	public int questid; // 放弃的任务id

	public CAbandonQuest() {
	}

	public CAbandonQuest(int _questid_) {
		this.questid = _questid_;
	}

	public final boolean _validator_() {
		if (questid <= 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(questid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		questid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAbandonQuest) {
			CAbandonQuest _o_ = (CAbandonQuest)_o1_;
			if (questid != _o_.questid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += questid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(questid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAbandonQuest _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = questid - _o_.questid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

