
package fire.pb;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqHelpCountView__ extends mkio.Protocol { }

/** 客户端请求援助统计面板
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqHelpCountView extends __CReqHelpCountView__ {
	@Override
	protected void process() {
		// protocol handle
		long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		SReqHelpCountView sReqHelpCountView=new SReqHelpCountView();
		xbean.helpcount helpcount=xtable.Helpcount.select(roleid);
		if(helpcount!=null){
			sReqHelpCountView.expvalue=helpcount.getExpvalue();//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃闁硅櫕鎹囬垾鏃堝礃椤忓孩瀚归柨婵嗙凹缁ㄥジ鏌熼惂鍝ョМ闁哄矉缍侀、姗�鎮欓幖顓燁棧闂傚倸娲らˇ鐢稿蓟閵娿儮鏀介柛鈩兩戦幃娆撴⒑閸涘﹥鐓ユい鎴濇喘閺佹捇宕愰悤浣圭秷濠电偛寮堕悧鏇㈩敋閿濆閱囬柡鍥╁仧閻ゅ嫰姊洪棃娑辩劸闁稿孩鐟╁顕�宕掗敂钘夘伓闂佹寧绻傛鍛婄濠婂嫨浜滈煫鍥ㄦ尵閸╋絾鎱ㄦ繝鍕笡闁瑰嘲鎳愮划鐢碉拷锝庝簼閻ｄ即姊绘担鍛婃喐濠殿噣娼х叅闁绘棃顥撻弳锕傛煥閻斿搫孝缂佺媭鍣ｉ弻锕�螣娓氼垱效闂佽瀵掗崜鐔奉潖濞差亝鍋￠柡澶婄氨閹稿啰绱撴笟鍥ф珮闁搞劏娉涢锝夊蓟閵夈儳顔愭繛杈剧到濠�閬嶅矗閸℃稒鈷戠紓浣股戠粈锟介梺绋匡工濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹
			sReqHelpCountView.shengwangvalue=helpcount.getShengwangvalue();//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘劙婀侀梺绋跨箰閸氬绱為幋锔界厱闁靛鍎遍敓钘夋健瀵鏁愭径瀣簻閻庣懓瀚竟鍡涙儎鎼淬劍鈷戦柛蹇撳悑缁跺弶绻涚亸鏍垫嫹閹颁礁娈ㄩ梺鍓插亝濞叉牠鏌嬮崶銊х闁瑰浼濋鍫氾拷鏍ㄥ緞婵炵偓鏂�闂佺粯鍔曞鍫曞闯閽樺鏀芥い鏃囧亹娴犳稓绱掑畝鍐摵缂佺粯绻堝畷鍫曗�栭顒�娲ㄩ崣鎾绘煕閵夛絽濡介柣鎾卞劜閵囧嫯绠涢幘璺虹厽濠殿喖锕︾划顖炲箯閸涘瓨鍋￠梺顓ㄧ畱濞堟繃绻濋悽闈涗沪鐟滄澘鍟伴幑銏犖熼搹瑙勬闁荤喐鐟ョ�氼噣銆呴悜鑺ュ�甸柨婵嗙凹缁ㄥジ鏌ｆ惔顔煎⒋婵﹥妞介幃鐑藉级鎼存挻瀵栫紓鍌欑贰閸ｎ噣宕圭捄渚殨闁哄被鍎辩粻鐟懊归敐鍛础闁告瑥妫濆铏圭磼濡崵顦ラ梺绋匡工濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹
			sReqHelpCountView.factionvalue=helpcount.getClanvalue();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘鐓涢柛鏇楁櫅閸旓箓鏌＄仦鍓ф创鐎殿喗鎸虫俊鎼佸Ψ瑜岄崫妤呮⒒娴ｈ鍋犻柛鏂跨焸瀹曟劙骞栨担鍝ュ幋闂佺鎻粻鎴犲閸忚偐绡�濠电姴鍊归幑锝夋煕閺傛寧鎲哥紒杈ㄦ尰閹峰懘鎮烽弶娆炬綌婵＄偑鍊戦崝灞轿涘☉銏犵闁靛繒濮Σ鍫ユ煏韫囨洖啸妞ゆ挻妞藉铏圭磼濡搫顫嶅銈嗘⒐閻楃姴顕ｉ幎鑺ユ櫢闁绘ɑ鏋奸幏铏圭磽娴ｅ壊鍎撴繛澶嬫礈缁鎳犻鍌滐紲濡炪倖妫佹慨銈呯暦瀹�锟介敓鑺ヮ問閸犳牠鈥﹂柨瀣╃箚闁归棿绀侀悡娑㈡煕鐏炲墽鐓紒銊ょ矙濮婄粯鎷呮笟顖滃姼闂佸搫鐗滈崜娑氬垝濞嗘挸绠ｉ柨鏃傜帛閺呮粓姊虹捄銊ユ珢闁瑰嚖鎷�
			sReqHelpCountView.helpgiveitemnum=helpcount.getHelpgiveitemnum();
			sReqHelpCountView.helpitemnum=helpcount.getHelpitemnum();
		}
		sReqHelpCountView.expvaluemax=fire.pb.HelpCountManage.getInstance().getExpValueMax(roleid);//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃闁硅櫕鎹囬垾鏃堝礃椤忓孩瀚归柨婵嗙凹缁ㄥジ鏌熼惂鍝ョМ闁哄矉缍侀、姗�鎮欓幖顓燁棧闂傚倸娲らˇ鐢稿蓟閵娿儮鏀介柛鈩兩戦幃娆撴⒑閸涘﹥鐓ユい鎴濇喘閺佹捇宕愰悤浣圭秷濠电偛寮堕悧鏇㈩敋閿濆閱囬柡鍥╁仧閻ゅ嫰姊洪棃娑辩劸闁稿孩鐟╁顕�宕掗敂钘夘伓闂佹寧绻傛鍛婄濠婂嫨浜滈煫鍥ㄦ尵閸╋絾鎱ㄦ繝鍕笡闁瑰嘲鎳愮划鐢碉拷锝庝簼閻ｄ即姊绘担鍛婃喐濠殿喚鏁婚妴鍐川缁櫢鎷烽敃鍌氬瀭妞ゆ洖鎳忓娲⒑鐠恒劌鏋嶇紒顔界懃閻ｅ嘲煤椤忓嫷娼婇梺鏂ユ櫅閸燁偊宕濋崨瀛樷拺闂傚牊渚楅悞楣冩煕鎼淬垹鈻曟い銏＄懇楠炴帒螖娴ｅ弶瀚奸梻浣告啞缁嬫垿鏁冮妶鍡樺弿鐎癸拷閸曨剙锟藉爼鐓崶銊︹拻闁瑰啿妫濋弻鏇㈠炊閵娿儱顫掗梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘劙婀侀梺绋跨箰閸氬绱為幋锔界厱闁靛鍎遍敓钘夘煼楠炲骞栨担鐟颁罕闂佸壊鍋呯换鍕偡閺屻儲鈷戠紒瀣儥閸庡繑銇勯敂鐐毈鐎殿喖顭峰鎾晬閸曨厽婢戦梺璇插嚱缂嶅棙绂嶉悜钘夌闁绘垼妫勯崘锟藉銈嗘尵閸嬬喖寮昏濮婇缚銇愰幒鎿勭吹闂佺粯甯粻鎾诲箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫭宸濋柛瀣洴閺佹捇鎸婃径瀣闂佽法鍠曟慨銈夋偄椤掑嫬绠柨鐕傛嫹?缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槰闂佽鍨抽崑銈夌嵁閺嶎灔搴敆閿熻姤淇婃總鍛婄厽妞ゆ挾鍣ュ▓婊堟煛鐏炲墽娲存鐐叉喘濡啫鈽夊▎鎰毌婵犵數濮伴崹濂稿春閺嶎厼绀夐柡鍥╁Х娑撳秴鈹戦悩宕囶暡闁绘挻娲熼弻鐔煎箲閹邦剝鏁块梺绋跨箰閻倿寮婚敐澶婄闁瑰瓨鐟ユ禒顔尖攽椤旂》鏀绘俊鐐舵閻ｇ兘濡搁敂鍓х槇闂佸憡鍔﹂悡鍫澪ｉ柆宥嗏拻濞达絼璀﹂悞楣冩煥閺囨ê鍔︽鐐村姈缁绘繂顫濋鍌滄毎闂備礁鎼崯顐︽偋閸℃ê鍔旈梻鍌欑窔濞佳囨晬韫囨稑绀冮柟绋块椤忓爼姊虹紒妯哄闁稿簺鍊濋幃锟犳偄閸忚偐鍘藉┑鈽嗗灣閸樠囧礉鐎ｎ偁浜滈煫鍥ㄦ礀閳诲牓鏌＄仦鍓р檨闁诡垱鏌ㄩ埥澶婎潨閸喎顏跺┑鐘绘涧椤戝懐绮婚弽銊ょ箚妞ゆ牗鐟ㄩ鐔兼煕濮橆剦鍎忔い顓℃硶閹瑰嫭绗熼姘闂備礁缍婇弨鍗烆渻娴犲钃熼柍鈺佸暙缁剁偤鎮橀悙鏉戠亰婵炲矈浜濈换婵嬪閵忊�虫畬濠碘槅鍋呯换鍡椢涢悢鍏尖拺闁圭瀛╃粈锟介梺绋匡工缂嶅﹪骞冮敓鐘插嵆闁绘梻顭堝鍨攽椤旂瓔娈旀俊顐ｎ殕閺呰埖绻濆顓犲幈闁瑰吋鐣崹褰掓倶閳哄啰纾奸弶鍫涘妼濞搭喗銇勯姀锛勬噰闁诡喖澧芥禒锕傚箚瑜庨悵顒勬⒑鐠囨煡顎楅柣蹇旇壘椤灝螣绾攱瀚规慨妯煎帶濞呭秹鏌℃担瑙勫磳鐎殿噮鍓熸俊鍫曞炊閳瑰灝浠梻鍌欑閹诧繝寮婚妸鈺佸珘妞ゆ帒鍊婚惌澶岋拷骞垮劚濡顢氶柆宥嗗�垫繛鎴烆伄濮樿泛绠繛宸簼閳锋垿鏌涘☉姗堟敾鐎规洖瀚伴幃妯跨疀閺冨倹鍣伴悗瑙勬磸閸ㄥ綊鍩ユ径鎰潊闁挎稑瀚獮鍫ユ⒒娴ｈ櫣甯涢柨姘舵煕閻旈攱鍋ョ�规洦鍋婇幃婊兾熼梹鎰泿闂備線娼ф蹇曟閺囥垹绠犻柛銉㈡櫔閹烽鎲撮崟顒傤槬閻庤娲﹂崜鐔煎春閵夛箑绶炲┑鐐靛亾閻庡妫呴銏″偍闁稿氦灏欓敓鑺ヨ壘缂嶅﹪寮婚敐澶婎潊闁绘ê鍟块弳鍫ユ⒑缂佹ɑ灏甸柛鐘崇墵瀵寮撮敍鍕澑闁诲函缍嗘禍鐑藉箯閻戣棄鍐�鐟滃危閸垺鍠愰幖娣妼妗呴梺鍛婃处閸ㄩ亶寮查弻銉︾厱婵炴垵宕獮妤呮煕婵犲骸鐏︽慨濠冩そ濡啫鈽夊▎鎰�烽梺璇插濮樸劍鏅跺Δ浣衡攳濠电姴娲ょ粻鐟懊归敐鍫濓拷浠嬪Ω瑜庨崰鎰拷骞垮劚椤︻垶鎮炴繝姘拺妞ゆ帪鎷风紒澶屾暬閸╂盯骞嬮敂鐣屽幈濠电偞鍨堕敃顐㈩啅閵壯呯＜婵°倓绀侀崫娲煙椤旇崵鐭欐い銏＄洴婵″爼宕堕埡鍐╊潓闂佽姘﹂～澶娒哄Ο渚富闁芥ê顦遍弳锕傛煟閺冨倵鎷￠柡浣哥У閹便劌顫滈敓鐣屾兜缁嬭锝嗗鐎涙ǚ鎷绘繛杈剧秬濞咃絿鏁☉銏＄厱闁哄啯鎸鹃悾鐢碉拷瑙勬礃缁捇寮崘顔肩＜婵椴搁悞楣冩煟鎼达紕鐣柛搴ㄤ憾钘濆ù鐓庣摠閸嬪倿鏌ｉ弮鍌氬付缂佺姴缍婂鍫曞醇濠靛棌鎸冪紓浣割儑缁垶濡甸崟顔剧杸闁哄洨鍋為悘鍫ユ⒑閸濆嫮鐏遍柛鐘冲姍钘濋柣妤�鐗婇崕鐔兼煃閵夈儱鏆辩紒鐙呯秮濮婄粯鎷呴崨濠冨創闁荤偞鍑归崑濠傜暦濠靛绠ｉ柨鏇嫹缂佺姵鐗犻弻鏇＄疀鐎ｎ亞浼勭紒鐐劤閸氬骞堥妸銉庢棃鏁撻挊澹╂稑鈻庨幘宥咁槹瀵板嫰骞囬娑欏濠电偠鎻徊浠嬪箺濠婂牊鏅�广儱娲ㄧ壕鍏笺亜閺囩偞鍣归柣蹇ラ檮椤ㄣ儵鎮欓弶鎴犱紝閻庤娲栭悥濂搞�佸Δ鍛＜婵ü绌堕崑濠囨⒒娴ｇ瓔鍤欓柛鎴犳櫕缁辩偤宕卞Ο纰辨锤闂佸搫绋侀崢鑲╃磼閳轰急褰掓偐瀹割喖鍓遍梺缁樻尰濞茬喖寮婚悢鍏煎殝妞ゆ帪鎷峰┑陇濮ょ换娑㈠川椤撶喎鏋犻梺鍝勮閸旀垿骞冮姀銏㈢＜婵妫欓ˉ澶嬩繆閻愵亜锟姐倝宕㈡總绋垮簥闁哄被鍎荤紞鏍叓閸ャ劍濯兼繛宸憾閺佸倿鏌涢弴銊ュ⒒婵☆偆鍠栧缁樼瑹閿熻棄顭囪绡撻柨鐔剁矙濮婂宕熼銏╀純闂佽鍠氶弫璇差嚕椤曪拷瀹曞ジ鎮㈤崣澶婎伖闂傚倷绀侀幉锛勭紦閸ф纾块柛妤冨亹閺嬪秹鐓崶銊р檨闁绘挻娲熼弻鏇熺箾閸噯鎷烽弴鐐垫殼闁糕剝绋掗悡鏇㈡煃閻熸壆浠㈤柣蹇撳级椤ㄣ儵鎮欓幖顓犲姺闂佸綊顥撴繛锟界�殿喖顭锋俊鐑藉Ψ閿旇姤鐦戦梻鍌氬�搁崐椋庣矆娓氾拷楠炴牠顢曢埛姘そ婵℃悂鍩℃担铏瑰炊闂備浇顫夊畷姗�顢氳閹苯螖閸涱喚鍘遍梺鏂ユ櫅閸熶即鍩︽笟锟介弻宥夋煥鐎ｎ亞浼岄梺璇″枛缂嶅﹪鐛笟锟介獮鎺楀箣濠垫劗锟借櫕绻濋悽闈涗粶闁瑰啿绻樺畷婵嗏枎閹惧疇鎽曢梺缁樻⒒閸樠呯矆閸曨垱鐓忛柛顐ｇ箖椤ユ粍銇勮箛銉﹀?
		sReqHelpCountView.shengwangvaluemax=fire.pb.HelpCountManage.getInstance().getShengWangValueMax(roleid);//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘劙婀侀梺绋跨箰閸氬绱為幋锔界厱闁靛鍎遍敓钘夋健瀵鏁愭径瀣簻閻庣懓瀚竟鍡涙儎鎼淬劍鈷戦柛蹇撳悑缁跺弶绻涚亸鏍垫嫹閹颁礁娈ㄩ梺鍓插亝濞叉牠鏌嬮崶銊х闁瑰浼濋鍫氾拷鏍ㄥ緞婵炵偓鏂�闂佺粯鍔曞鍫曞闯閽樺鏀芥い鏃囧亹娴犳稓绱掑畝鍐摵缂佺粯绻堝畷鍫曗�栭顒�娲ㄩ崣鎾绘煕閵夛絽濡介柣鎾卞劜閵囧嫯绠涢幘璺虹厽濠殿喖锕︾划顖炲箯閸涘瓨鍋￠梺顓ㄧ畱濞堟繃绻濋悽闈涗沪鐟滄澘鍟伴幑銏犖熼搹瑙勬缂佺虎鍘奸幊灞剧瑜版帗鐓欓柛婵嗗閿涙棃鏌熸搴″幋闁轰礁鍟村畷鎺懶掔亸鏍ㄦ珚闁哄苯绉靛顏堝箥椤斿墽宕查梻浣告憸閸嬬姴鈻斿☉銏犵厴闁硅揪闄勯崑鎰磽娴ｈ偂鎴︽煥椤撶偐鏀介柍钘夋娴滄繄绱掔�ｎ偆澧靛┑锛勬暬楠炲洭鎮ч崼鐔割仧闂備浇娉曢崳锕傚箯閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘劙婀侀梺绋跨箰閸氬绱為幋锔界厱闁靛鍎遍敓钘夘煼楠炲骞栨担鐟颁罕闂佸壊鍋呯换鍕偡閺屻儲鈷戠紒瀣儥閸庡繑銇勯敂鐐毈鐎殿喖顭峰鎾晬閸曨厽婢戦梺璇插嚱缂嶅棙绂嶉悜钘夌闁绘垼妫勯崘锟藉銈嗘尵閸嬬喖寮昏濮婇缚銇愰幒鎿勭吹闂佺粯甯粻鎾诲箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫭宸濋柛瀣洴閺佹捇鎸婃径瀣闂佽法鍠曟慨銈夋偄椤掑嫬绠柨鐕傛嫹??
		sReqHelpCountView.factionvaluemax=fire.pb.HelpCountManage.getInstance().getClanValueMax(roleid);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘鐓涢柛鏇楁櫅閸旓箓鏌＄仦鍓ф创鐎殿喗鎸虫俊鎼佸Ψ瑜岄崫妤呮⒒娴ｈ鍋犻柛鏂跨焸瀹曟劙骞栨担鍝ュ幋闂佺鎻粻鎴犲閸忚偐绡�濠电姴鍊归幑锝夋煕閺傛寧鎲哥紒杈ㄦ尰閹峰懘鎮烽弶娆炬綌婵＄偑鍊戦崝灞轿涘☉銏犵闁靛繒濮Σ鍫ユ煏韫囨洖啸妞ゆ挻妞藉铏圭磼濡搫顫嶅銈嗘⒐閻楃姴顕ｉ幎鑺ユ櫢闁绘ɑ鏋奸幏铏圭磽娴ｅ壊鍎撴繛澶嬫礈缁鎳犻鍌滐紲濡炪倖妫佹慨銈呯暦瀹�锟介敓鑺ヮ問閸犳牠鈥﹂柨瀣╃箚闁归棿绀侀悡娑㈡煕鐏炲墽鐓紒銊ヮ煼濮婄粯鎷呴崨濠傛殘闂佺懓鎽滈崗姗�骞婂Δ鍛唶闁哄洨鍠庢禍妤呮⒑閻熸澘鈷旂紒顕呭灦閸╂盯骞嬮敂鐣屽幈濠电娀娼уΛ妤咁敂椤愶附鐓熼柟鐑樻礃绾墎绱掓潏銊ョ缂佽鲸甯掕灒闁兼祴鏅濋弶浠嬫煟鎼淬埄鍟忛柛锝庡櫍瀹曟垶绻濋崶鈺佺ウ濠碘槅鍨甸崑鎰閸忛棿绻嗘い鏍ㄧ矌鐢稒銇勮箛鏇炴灈婵﹦绮幏鍛存嚍閵壯侊拷濠囨⒑闂堚晝绉剁紒鐘虫崌閻涱喛绠涘☉娆愭闂佽法鍣﹂幏锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘劙婀侀梺绋跨箰閸氬绱為幋锔界厱闁靛鍎遍敓钘夘煼楠炲骞栨担鐟颁罕闂佸壊鍋呯换鍕偡閺屻儲鈷戠紒瀣儥閸庡繑銇勯敂鐐毈鐎殿喖顭峰鎾晬閸曨厽婢戦梺璇插嚱缂嶅棙绂嶉悜钘夌闁绘垼妫勯崘锟藉銈嗘尵閸嬬喖寮昏濮婇缚銇愰幒鎿勭吹闂佺粯甯粻鎾诲箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫭宸濋柛瀣洴閺佹捇鎸婃径瀣闂佽法鍠曟慨銈夋偄椤掑嫬绠柨鐕傛嫹??
		sReqHelpCountView.helpgiveitemnummax=fire.pb.HelpCountManage.getInstance().getHelpGiveItemNumMax(roleid);
		sReqHelpCountView.helpitemnummax=fire.pb.HelpCountManage.getInstance().getHelpItemNumMax(roleid);
		
		gnet.link.Onlines.getInstance().send(roleid, sReqHelpCountView);
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786532;

	public int getType() {
		return 786532;
	}


	public CReqHelpCountView() {
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
		if (_o1_ instanceof CReqHelpCountView) {
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

	public int compareTo(CReqHelpCountView _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

