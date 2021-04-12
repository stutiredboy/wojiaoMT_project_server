
package fire.pb.friends;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestSpaceRoleInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRequestSpaceRoleInfo extends __CRequestSpaceRoleInfo__ {
	@Override
	protected void process() {
		// protocol handle
		final long currentRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (currentRoleId < 0)
			return;

		int curtype = reqtype;
		mkdb.Procedure proc = new mkdb.Procedure() {
			@Override
			public boolean process() {
				if (xtable.Properties.selectRolename(roleid) == null) {
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮村杈┬㈤梻浣规偠閸庢椽宕滈敃鍌氭瀬闁告劦鍠楅悡銉╂煛閸ユ湹绨奸悗姘秺濮婂搫效閸パ嶆嫹濡ゅ懎纾婚柟鎹愬煐瀹曞弶绻濋棃娑欏窛缂佲槄鎷烽梻浣侯焾閺堫剛鍒掑畝鍔肩兘鏁撴禒瀣拻濞达絼璀﹂悞鐐亜閹寸偛鐏╅柟骞垮灩閳规垹锟斤綆浜ｉ幗鏇㈡倵楠炲灝鍔氭い锔诲灡鐎靛ジ鎮╃紒妯煎幈闂佸搫娲㈤崝灞炬櫠椤旂晫绠鹃柛婊冨暟缁夘喗鎱ㄦ繝鍌ょ吋鐎规洘甯掗～婵嬵敄鐠恒劍鏅奸梻鍌欑劍閹爼宕濈�ｎ喖纭�闁规儼妫勯悘鎶芥煛閸愩劎澧曠紒锟介崘鈹夸簻闊洦鎸搁銏ゆ倵濮橆剛绉洪柡灞诲妼閳规垿宕卞▎蹇撴瘓缂傚倷闄嶉崝宀勨�﹂悜钘夎摕婵炴垯鍨瑰洿婵犮垼娉涢ˇ浼村窗濮樿埖鈷戦柛婵嗗閻忛亶鏌涢悩鏌ュ弰闁诡噣绠栭弫鎾绘偐閼碱剟鐛撻梻浣告贡椤牆顔忛埡鍛厸闁告侗鍠掗幏娲煟鎼粹剝璐″┑顔炬暬钘熷璺侯儍娴滄粓鏌ㄩ弮鍥跺殭闁诲骏绠撻弻娑㈠煘閸喚浠煎銈嗘尭閸氬顕ラ崟顐嬬喓绱掑Ο鑽ゅ綆闂備浇宕甸崰鎰垝瀹�鍕剶濠靛倸鎲￠崵宥夊级閸稑濡跨紒鈽呮嫹婵犳鍠楅敃鈺呭储妤ｅ啫鐭楅柛鈩冪♁閳锋垿鏌涘┑鍡楊仾濠㈣泛瀚伴弻銊ヮ潩閼哥數鍘介棅顐㈡处閹稿摜鐥閺屾洟宕惰椤忣厼鈹戦鍡樺闂備焦鏋奸弲娑㈠窗濮橆儵娑㈠礃椤旇棄锟界敻鎮峰▎蹇擃仾缂侊拷閿熶粙姊洪棃娑氬闁诡喖鍊块悰顕�宕橀纰辨綂闂佺粯锚閻忔艾鈻撳┑瀣拺闁告繂瀚峰Σ瑙勩亜閹寸偟鎳冮摶鐐烘煕閺囥劌鐏￠柍閿嬪浮閺屾稓浠﹂幑鎰棟闂佽法鍠嶇划娆撍夐幘璺哄灊闁割偆鍠撻悷褰掓煥閻斿墎鐭欓柣娑卞枟瀵板嫰骞囬鍌欑礈闂佺儵鍓濈敮濠囨倿閿曪拷椤啯绂掔�ｎ亝鐎梺鍛婂姦閸犳牜澹曢崗鍏煎弿婵☆垵顕ч弫鍓х磼闁秳鎲炬慨濠勭帛閹峰懘宕ㄦ繝鍌涙畼婵犵數鍋犻婊呯不閹惧磭鏆︾憸鐗堝笒缁狙囨偣閸モ晛浜剧紒瀣灱閻忔帡姊虹粙璺ㄧ闁告鍥у嚑闁硅揪闄勯埛鎴︽煕濠靛棗顏╅柡鍡樼懇閺岋絽螖閿熻棄螞濠靛绠柟杈鹃檮閸嬪嫰鏌涘┑鍕姢妞ゆ梹娲熷娲偡閹殿喗鎲奸梺鑽ゅ枂閸庣敻骞冨锟介崺锟犲川椤撯�崇厴婵＄偑鍊栭悧婊堝磻閻愬搫纾婚柍鈺佸暟缁★拷婵犵數濮撮崐鎼佸汲閻旂厧鍐�闁跨喓濮甸埛鎴犵磽娴ｇ櫢渚涙繛鍫熸閹鈽夐幒鎾寸彇闂佺懓绠嶉崹褰掑煘閹达箑骞㈤柍杞扮劍椤斿倿姊绘担鍛婃儓妞ゆ垶鍔欏畷鎴﹀礋椤栨稒娅㈡繝娈垮枟閸旀洟鏁撻懞銉х畵闁伙絿鍏橀幃鐣屽枈婢跺顏堕梺鎸庣箓妤犳悂寮搁悢鍏肩厽闁规儳顕幊鍥煛鐏炲墽娲存鐐差儏閳诲氦绠涢妷锕�顏堕梺鍝勭▉閸嬫捇骞忓畡閭︽僵闁绘劦鍓欓锟�:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閳╁啯鐝曢梻浣藉Г閿氭い锔诲枤缁辨棃寮撮姀鈾�鎷绘繛杈剧秬濞咃綁濡存繝鍥ㄧ厱闁规儳顕粻鐐烘煙椤旂偓鐒挎い锕�缍婇弻鐔碱敍濮樿京鍔Δ鐘靛仦椤洨妲愰幒鎳崇喖鎮�涙ê顏堕梺鍓茬厛閸嬪棛绮绘ィ鍐╃厵閻庣數顭堥崜鍗灻归悡搴㈩棦闁哄瞼鍠愬蹇涘礈瑜忛弳鐘绘⒑濞茶骞楁い銊ワ躬閹繝顢曢敃锟介悙濠囨煏婵炑嶆嫹婵′勘鍔戝铏圭磼濡鏆楅梺鍝ュУ閻楃姴顕ｆ繝姘櫢闁绘灏欓ˇ銊╂⒑闂堟侗鐒鹃柛搴☆煼楠炲繘鎮滈挊澶夌炊闂侀潧顧�闂勫嫬鈻撴导瀛樷拺闁告挻褰冩禍婵囩箾閸欏鑰块柛鈺傜洴楠炴帒螖娴ｅ搫骞堥梺璇茬箳閸嬬娀顢氳閺佹捇鎳為妷锔绢槹闂佽鍠楅敃銏ゅ极閸愵喖纾兼繛鎴炶壘楠炴劙姊虹拠鑼闁稿鍠栧畷鎴﹀箻閸撲胶鐒奸梺鍛婂姦娴滅偟澹曢懖鈺冪＝濞达綀顕栭悞鑺ョ箾閹绘帩鍤熼柨鐔凤拷鐕佹綈婵炲弶鐗滅槐鐐寸節閸ャ儻鎷锋担绯曟瀻闁圭偓娼欐禍妤呮煙閸忓吋鍎楅柛鐘愁殘缁辩偤骞樼紒妯锋嫽闂佺鏈懝楣冩晸閽樺妲婚棁澶愭煕閵夘喖澧婚柡浣割儑閹叉瓕绠涘☉妯碱唹闂侀潧绻堥崐鏇㈢嵁閵忥紕绠鹃柟瀵稿剱閻掍粙鏌＄仦鐔峰暊閺�浠嬫煟濡鍤嬬�规悶鍎甸幃妤�顫濋悡搴㈢彎闂佺硶鏅濋崑娑㈩敇婵傜宸濇い蹇撴噺閺夋悂姊绘担铏瑰笡妞ゎ厼鐗嗛锝夊箻鐎涙ü姘﹂悷婊呭鐢鎮″☉銏＄厱闁规壋鏅涙俊鐓幟瑰锟介崡鎶藉蓟閻斿壊妲归幖绮癸拷鍐茬闂備浇妗ㄩ悞锕傚礉閺嶎厼绠氶柡鍐ㄧ墕閻忔娊鏌熸０浣哄妽濞存嚎鍊曢埞鎴︽晬閸曨偂鏉梺绋匡攻閻楁洜鍙呭┑鐘绘涧濞层劑銆呴崣澶堜簻闁圭儤鍨甸敓钘夌秺閿濈偤寮撮姀锛勫幍闂佽鍨庣仦鑺ヮ啀闂備浇宕甸崰搴ｇ礊婵犲洤钃熸繛鎴欏灩鍞梺闈涚箚閸撴繈鎮甸弮鍫熺厽闁靛繆鏅涢悘娑㈡煕閺冿拷閸ㄧ敻锝炶箛鎾佹椽顢旈崨顓濈敾闂備礁鎼ˇ鎵拷绗涘浂鏁婇柨鐔剁矙濮婄粯鎷呴悜妯烘畬闂佹悶鍊栭悧鐘荤嵁韫囨稒鏅搁柨鐕傛嫹,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忓爼鏌ｆ惔銈庢綈婵炴彃绻樺畷鏇㈠箮閼恒儲娅㈤梺鍝勫�堕崐妤冪矓闂堟耽鐟邦煥閸愵亜鐓熼梺璇″枔閸ㄨ棄鐣烽崡鐐嶇喓鎷犻幓鎺嶇礋濠电姴鐥夐弶鍖℃嫹閺囥埄鏁勯柛鈩冪懕閹峰嘲顫濋鍌溞ㄥ┑顔硷攻濡炰粙骞冮悜钘夌妞ゆ洖妫涚粈濠囨⒒娴ｅ憡鎲稿┑顔炬暬閹囨偐鐠囧弬銉ッ归敐鍥┿�婃俊鎻掔墦閺屾洝绠涙繝蹇斿缂佹稖顫夌�氱懓鈹戦悩宕囶暡闁绘挻娲熼弻宥夊煛娴ｇ绲归梺鐟扮摠缁洪箖寮稿鍥锋嫹楠炲灝鍔氭い锔垮嵆閹繝鎮㈤崗鑲╁幗闂佸搫鍊圭�笛囧箟閹间焦鐓熸い鎾跺仩鐎氱増銇勯鈥冲姷妞わ箒娅曢妵鍕Ω閵壯冣叺閻庢鍣崑濠囥�佸鑸垫櫢濞寸姴顑囧畵渚�鏌熼悜姗嗘當缂侇偄绉归弻娑氫沪閸撗勫櫘闂佽崵鍠愮换鍫濐潖缂佹ɑ濯撮柣鐔煎亰閸ゅ绱撴担绛嬪殭闁稿﹤娼￠悰顔跨疀閺囶亝瀚归柨婵嗙凹缁ㄧ敻鏌ㄩ悢璇残撻悽顖涱殘閹广垹鈹戦崱鈺傚兊濡炪倖鎸鹃崕鎴﹀箯閻戣姤鍋ㄩ柛娑橈功閸欏棗鈹戦悩缁樻锭婵☆偅鐩畷娆撳捶椤撶姷锛滈梺闈涱焾閸庢椽鎮℃總鍛婄厸鐎癸拷鐎ｎ剛袦闂佽桨绀侀崐鍨暦椤愶箑绀嬫い鎰靛亞閿熻姤濞婂濠氬磼濮橆厽鎮欏銈忓閺佽顕ｆ繝姘櫜濠㈣泛锕﹂鎺楁⒑閻熸澘顣抽柣鈩冩閺佹捇鎳為妷顔界杹闂佸搫琚崝鎴﹀箖閵忋垻纾兼慨妤�妫欓ˉ澶嬬節閻㈤潧浠滈柣銊у厴閺佹捇鎳為妷銉ヮ潽闂佹悶鍊栧ú鏍煘閹达附鍋愮�规洖娴傞弳锟犳⒑閸濆嫭鍣洪柟顔煎�垮濠氭晲閸涘倻鍠栭幊锟犲Χ閸涱厾鍝楅梻鍌欑閹芥粓宕戦悩娴嬫灃婵炴垟鎳囬敓鑺ユ瀹曟﹢顢欓崲澹洦鐓曢柍鈺佸枤濞堟梹銇勯銏″枠婵﹥妞介獮鏍倷閹绘帩鐎崇紓鍌氬�哥粔鎾晝椤忓牆鏋侀柟鎵閸婄兘鏌涘┑鍡楊伀闁告ê鎲＄换娑欐綇閸撗冨煂閻庢鍠栭悥鐓庮嚕椤掑嫭鏅稿ù鐘差儐閳锋帒霉閿濆牊顏犻悽顖涚洴閺岋綁鎮㈤弶鎴濆Е濡ょ姷鍋涢敃銊х不濞戙垹鍗虫い蹇撴噹椤忚泛鈹戦鏂や緵闁告挻绋撶划鏃堟倻濡寮挎繝鐢靛Т閸燁垶濡靛┑鍫嫹鐟欏嫭绀堥柛蹇旓耿閵嗕礁顫滈敓浠嬪春閸曨垰绀冮柟鎯ф噺鐎氳淇婇妶鍛櫤闁抽攱鍨块弻娑樷攽閸曨偄濮庨柡宥侊拷鎰佹富闁靛牆鍟俊濂告煥閺囨ê锟芥繈骞冩ィ鍐╁�婚柦妯侯槸瀹撳棝姊虹紒妯虹仴婵☆偅顨婇獮鍐箣閻愮數鐦堥梺闈涢獜缁插墽娑甸悙顑句簻闁瑰瓨绻冮崰妯硷拷瑙勬磸閸ㄤ粙寮婚崱妤婂悑闁糕�崇箲鐎氬ジ姊绘担鍛婂暈缂佽鍊婚敓鑺ュ嚬閸欏啫鐣烽幒妤�惟闁冲搫鍊婚崢閬嶆⒑閸濆嫬锟藉湱锟界瑳鍐胯�垮ù鐓庣摠閻撴盯鏌涘☉鍗炲箻闁糕晪绲鹃妵鍕閿涘嫧妲堥悶姘懄閵囧嫰骞樼捄杞版埛缂備礁顦板浠嬪蓟閻旂⒈鏁婇悷娆忓閻濇牜绱撴笟鍥ф灓闁轰胶顭堥埥澶愭偨缁嬫寧銇濋梺鍛婂姀閺呮盯顢旈崼鏇熺厽闁绘绮鹃鐔兼煟閹炬剚妯�妤犵偛绻愰悾锟犲箥閾忣偆浜栭梻浣稿閻撳牓宕板Δ鍛�堕柛顐犲劜閳锋垹绱撴担璇＄劷濠⒀屼邯閺屾洟宕奸姀鈺冨姼闂佷紮绲介崲鑼弲濡炪倕绻愰幊蹇撯枍閵忋倖鈷戠紓浣癸供閻掗箖鎮樿箛鏃傛噰闁轰礁绉撮…銊╁礃閿濆棙鏉告俊鐐�栧濠氭偂椤愶富鏁傞柛銉ｅ劙濮规绻濋姀锝嗙【闁哄牜鍓熼敐鐐哄即閻斿墎绠氬銈嗙墬缁哄潡鏁撻弬銈嗗闂備胶灏ㄩ幏宄懊归悩宸剱闁绘挾鍠栭弻鐔兼焽閿曪拷婢ь垶鏌嶇紒妯荤闁哄本鐩俊鍫曞炊瑜庨悗濠氭⒑鐎圭媭娼愰柛銊ユ健閵嗕礁鈻庨幘鏉戞疅闂侀潧顦崕閬嶅绩椤撱垺鈷掑ù锝囩摂閸ゅ啴鏌涢悤浣镐喊鐎规洖宕埢搴ㄥ箣閻愬甯嗘繝鐢靛Х閺佹悂宕戦悙鍝勫瀭闁割偅娲嶉敓鏂ょ畵瀹曞爼顢栭敃锟藉ú顓㈠蓟閸℃鍚嬮柛鈥崇箲鐎氬ジ姊绘担鍛婂暈缂佽鍊婚敓鑺ュ嚬閸ｏ綁宕洪姀鈥崇窞闁归偊鍘鹃崢閬嶆煟鎼搭垳绉靛ù婊勭箞瀹曞啿煤椤忓懐鍘遍梺鍦劋閸╁﹪寮ㄩ懡銈囩＜閺夌偞澹嗛惌娆戯拷瑙勬磸閸斿秶鎹㈠┑瀣妞ゆ劑鍨瑰鐑芥⒒閸屾艾锟芥悂鈥﹂鍕；闁告洦鍊嬭ぐ鎺戠妞ゆ挾鍋熺粵蹇涙⒑閸忛棿鑸柛搴㈠▕閵嗗懘寮婚妷锔惧幗闂佸綊鍋婇崜锕傚吹閻旇櫣纾奸柍钘夋噺鐎氬綊姊洪懡銈呮瀾缂侇喖鐬肩划鏃堝醇閺囩喐娅㈤梺鍏间航閸庢娊銆傞崣澶岀瘈闁靛繆妲勯懓鍧楁煥濠靛牆浠╃紒鐘崇洴楠炴ɑ鎷呯憴鍕╀虎濡炪們鍨哄Λ鍐ㄧ暦閻旂⒈鏁冮柕鍫濇搐閺勩儱鈹戦悩鍨毄濠殿喚鍏樺顐﹀川婵犲啫寮块梺鍦檸閸犳牜澹曢悷鎵虫斀闁绘ê纾。鏌ユ煕鐎ｅ墎绡�闁哄瞼鍠撶槐鎺懳熸潪鏉垮灁婵犵數鍋為幐鎼佲�﹂悜钘夎摕闁哄洢鍨归柋鍥ㄧ節闂堟稒顥炴繛鍫幗缁绘繄鍠婂鍫熷闁告劕寮堕崐顖炴⒑闂堟稒鎼愰悗姘嵆瀵偊宕橀鑺ユ婵炲濮撮鍡涘磹閼稿灚鍙忔慨妤�妫楅獮姗�鏌嶉悷鎵㈤柍瑙勫灴閹晠宕ｆ径瀣�风紓鍌欒兌婵鍒掗鐐参﹂柛鏇ㄥ灠缁秹鏌涢妷鎴濆�归惈蹇斾繆閻愵亜锟窖呮嫻閻旂厧绀夌�癸拷閸曨煉鎷烽弮鍫濈妞ゆ柨妲堣閺屾盯鍩勯崗锔藉哺楠炲繑绻濆顓涙嫼闂佸憡绋戦…顒勬倿婵傚憡鐓曢柕澶涚到婵＄厧霉閻樻瑥鍟犻弨浠嬫煃閽樺顥滈柣蹇曞枛閹綊鏁撴禒瀣櫇闁跨喍绮欐俊鎾箳閹惧墎鐦堝┑顔斤供閸橀箖宕㈤鍫熲拺闁告挻褰冩禍婵堢磼鐠囨彃鏆ｇ�规洘濞婇幃鎯х暆閿熺晫澹曟總鍛婄厽婵☆垰鎼懜鍦拷瑙勬尭濡繈寮婚悢纰辨晩缂佹稑顑嗛悾璺侯渻閵堝骸浜濈紒璇茬墦楠炲啴鍩勯崘鈺佸妳闂佽櫕鎷濋幏鐑芥煙婵傚浜版慨濠勭帛閹峰懐绮电�ｎ亝鐣伴梻浣告憸婵敻銆冩繝鍥ф瀬闁告劦鍠栭～鍛存煏閸繃鍣烘俊宸墴濮婅櫣鎹勯妸銉︾亖婵犳鍠楀娆擃敊韫囨挴鏀介柛銉ｅ劙缁ㄥ姊洪崫鍕殭婵炴潙鍊搁…鍥箛閻楀牆锟藉灚鎱ㄥ鍡椾簽闁活厽鐟﹂幈銊︾節閸曨厼绗￠梺鐟板槻閹虫﹢骞婇悙鍝勎ㄧ憸瀣晸閽樺韬慨濠冩そ濡啴鍩￠崘顎倗绱撴担鍝勑ｉ柟鐟版喘閹即顢欑捄銊ф澑濠电偞鍨堕悷锕�鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�?
					Module.logger.warn("[CRequestSpaceRoleInfo] find non-existent role info, roleId:" + currentRoleId
							+ " targetRoleId:" + roleid);
					return false;
				}

				SRequestSpaceRoleInfo send = new SRequestSpaceRoleInfo();
				send.friendinfobean = FriendHelper.toInfoBean(currentRoleId, roleid);
				if (send.friendinfobean.factionid > 0) {
					String clanname = xtable.Clans.selectClanname(send.friendinfobean.factionid);
					if (clanname != null) {
						send.friendinfobean.factionname = clanname;
					}
				}
				send.title = xtable.Properties.selectTitle(roleid);
				send.reqtype = curtype;
				fire.pb.map.Role.getPlayerComponents(roleid, send.components);
				mkdb.Procedure.psendWhileCommit(currentRoleId, send);
				return true;
			}
		};
		proc.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 806538;

	public int getType() {
		return 806538;
	}

	public long roleid;
	public int reqtype;

	public CRequestSpaceRoleInfo() {
	}

	public CRequestSpaceRoleInfo(long _roleid_, int _reqtype_) {
		this.roleid = _roleid_;
		this.reqtype = _reqtype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(reqtype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		reqtype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestSpaceRoleInfo) {
			CRequestSpaceRoleInfo _o_ = (CRequestSpaceRoleInfo)_o1_;
			if (roleid != _o_.roleid) return false;
			if (reqtype != _o_.reqtype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += reqtype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(reqtype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestSpaceRoleInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = reqtype - _o_.reqtype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

