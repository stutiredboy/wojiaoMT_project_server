
package gnet;


import fire.pb.fushi.FushiManager;
import fire.pb.main.Gs;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __QueryOrderResponse__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class QueryOrderResponse extends __QueryOrderResponse__ {
	@Override
	protected void process() {
		fire.log.LogManager.logger.info("receive QueryOrderResponse.platid:"+platid+",platsn:"+orderserialplat+",gamesn:"+orderserialgame+",errorcode:"+errorcode);
		if (fire.pb.fushi.Module.getIsYYBUser(userid)) {
			FushiManager.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡╂Ч濞存嚎鍊濋弻銈夊级閹稿骸浠村┑顔硷攻濡炰粙銆佸Δ鍛櫢闁伙絽鐬奸惌鎾绘煙缂併垹鏋涚痪鎯с偢閺屾洘绻涜鐎氼剟寮搁幋锔解拺闁告繂瀚弳娆撴煟濡わ拷濡稓鍒掓繝姘唨闁靛ě鍜佸晭闁诲海鎳撴竟濠囧窗閺囩姾濮冲┑鐘宠壘缁犳岸鏌ｉ弬鍨倯闁抽攱鍨垮濠氬醇閻斿墎绻佸┑鈽嗗灠閻楁捇寮诲☉銏″亹闁归鐒﹂悾鑲╃磽娴ｆ垝鍚柛瀣仱楠炲棝寮崼婵愭綂闂侀潧绻堥崹璇参ｉ崶顒佲拻濞达絽婀卞﹢浠嬫煕閵娿劍顥夋い顓炴穿椤︽娊鏌ｅΔ锟介柊锝咁潖缂佹ɑ濯撮柛婵嗗娴犳绱撻崒姘毙㈤柨鏇閸掓帗绻濆顒�鍞ㄩ悷婊勭矒瀹曠敻寮撮姀锛勫幈濠电偞鍨堕敃顐﹀礉閻斿吋鐓熼柣鏃堫棑缁夋椽鏌＄仦璇插闁诡喓鍨藉畷婊勬媴閾忕懓骞嗛梺璇插椤旀牠宕伴弽顓涳拷锕�鐣￠柇锕�娈ㄩ梺鍦檸閸犳牠锝為崨瀛樼厽婵☆垱顑欓崵娆撴煛娴ｇ瓔娼愮紒缁樼箞閹粙妫冨☉鎺撶�版繝鐢靛仒閸栫娀宕楅悩铏仢濠碘剝鎮傞崺鈩冩媴閸曟挸瀚ㄦ禍婊堟煙閺夎法鍩ｆ俊缁㈠櫍閺屽秹鏌ㄧ�ｎ亞浼岄梺鍝勬湰閻╊垶寮崒婊勫珰闁圭粯甯為鎰版⒒娴ｅ憡鍟為柨姘舵煟鎺抽崝鎴炰繆閻㈢绀嬫い鏍嚤閵娾晜鐓ラ柡鍐ㄦ处椤ュ鐥幆褍鏆遍摶鏍煟濮楋拷濞佳勭濠婂嫨浜滈柨鏃傚亾閺嗩剟鏌ｅ☉鍗炴灈妞ゎ偅绮撻弫鎾寸鐎ｎ煉鎷锋担绯曟瀻闁圭偓娼欏▓鎰版⒑閸愬弶鎯堥柨鏇樺劜閺呫儱鈹戦悩娈挎殰缂佽鲸娲熷畷鎴﹀箣閿曪拷绾惧綊鏌″搴″箹缂佺姳鍗抽弻锝夊箛闂堟稑顫梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕攽椤旂偓鍤�鐎殿喖鐖兼俊鐢稿礋椤栨氨鐤�闂佸憡鎸烽悞锕傚磻瑜忕槐鎾存媴閸欏娼愰梺褰掝棑閸忔ê顫忕紒妯诲闁革富鍘介懣鍥⒑閹肩偛濮�婵☆偄瀚伴垾锕傚炊椤忓秵鈻屾俊鐐�戦崹娲箲閸ヮ剛宓佹俊顖濆亹绾惧吋淇婇婊冨付妤犵偛绉撮埞鎴︽晬閸曨偂绮跺銈嗗灥閹冲繘銆冮妷鈺佺濞达絿顭堥崑宥夋⒑閸︻叀妾搁柛鐘愁殜閹�斥槈閵忊�筹拷鍫曟煟閹邦厼绲婚柍閿嬫⒐缁绘盯宕ｆ径瀣▏闂佸疇顫夐崹鍧楀极瀹ュ绀嬫い鎰╁灩缁狅絾淇婇悙顏勶拷鎴﹀垂濞差亝鍋￠柍鍝勬噹缁犳牠鏌嶉埡浣告殲闁稿海鍠愰妵鍕籍閿熶粙宕瑰┑鍡╂僵闁挎柨澧界壕浠嬫煕鐏炴崘澹橀柨鐔诲Г閹倸鐣烽幇顓фЧ閹兼番鍩勯崑銊╂⒑闂堟稓澧曟い锔诲灣缁顢涘鎰闁荤喐婢橀顓㈡煕鐎ｎ亷韬柟顔哄灲瀹曞崬鈽夊▎鎴濆箻闂備礁缍婂Λ鍧楁倿閿曪拷閳藉顦查柍瑙勫灴椤㈡瑩鎳栭埡浣插徍闂備礁鎼惌澶岀礊娓氾拷閻涱喖顫滈敓钘夌暦濮楋拷瀹曪絾寰勭�ｉ潧鏅梻鍌氬�风粈渚�骞栭锕�瀚夋い鎺炴嫹閻撱倖淇婇娆掝劅闁搞倖顨婇弻娑㈠即閵娿儳浠╅梻浣稿船濞诧妇鎹㈠┑瀣棃婵炴垶鐟辩槐鐐烘⒑鐠囨彃顒㈤柟绋垮暱椤繒绱掑Ο璇差�撻梺鎯х箳閹虫挾绮敍鍕＝濞达絿鐡旈崵娆戠磼婢跺本鏆╃紒顔碱儏椤撳吋寰勫Ο缁樻珕闂備礁澹婇崑鍛崲閸℃稑绠洪柡鍥ュ灪閳锋垿鏌熺粙鎸庢崳缂佺姵鎹囬弻鐔煎礃瀹割喗鈻堥悗娈垮枔閸斿秶绮嬮幒鏃撴嫹閿濆骸浜為柛姗�浜跺娲传閸曨剙鍋嶉梺鍛婃煥閺堫剛绮嬪鍡愬亝闁告劏鏅濋崢鐢告倵閻熸澘顏繝銏∶嵄濠电姵纰嶉悡鍐偡濞嗗繐顏╅柣蹇婃櫊閺屻劑鎮㈤崨濠勪紕缂傚倸绉村Λ娆戠矉瀹ュ鏅插璺猴功椤旀垿姊洪崫鍕偍闁搞劍妞介崺娑㈠箣閿旇В鎷婚梺鍓插亞閸犲秶娆㈤柆宥嗙厽闁圭儤顨堥悾娲煛鐏炲墽鈾侀柟顖涙椤㈡瑩宕楅懖鈺�閭梻浣告啞椤ㄥ﹥绂嶉崼鏇炶摕婵炴垯鍩勯弫鍐煏閸繃鍣洪柣搴ゆ缁辨挻鎷呯粵瀣濠碘槅鍋呴悷鈺備繆閻㈢绀嬫い鏍ㄨ壘閸炪劑姊洪棃娴ゆ盯宕ㄩ娑欘啌濠电姷鏁搁崑娑㈡偤閵娧冨灊閹兼番鍔岀粻鐘绘煙閸撗呭笡缂佺姵甯″缁樻媴閾忕懓绗￠梺鍦焾閹芥粓鏁撻懞銉р枔闁哄懐濞�閻涱噣寮介鐐电杸濡炪倖鎸荤划鍫㈣姳鐠囧樊娓婚柕鍫濇噽缁犱即鎮楀鐓庡⒋鐎殿喗濞婇弫鎰板川椤忓懏鏉搁梻浣哄仺閸庤京澹曢銏犳槬闁挎繂娴勯幏椋庢喆閸曨剛顦ラ悗瑙勬处閸撴繈鎮橀崘顔解拺闁告稑锕ゆ竟鍐煕閹扮數鍘涢柛銈嗙懅缁辨捇宕掑顒婃嫹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊炲銈嗗釜閹风兘鏌￠崟鈺佸姦闁哄备锟藉磭鏆ゆい鏂垮悑閸ｇ儤绻涢崼鐔哥婵﹪缂氶妵鎰板箳閹垮嫮鍚归梻浣哄帶閻ゅ洤鈻斿☉銏″仼闁割煈鍋嗛悷褰掓煥閻斿墎鐭欑�殿喛顕ч埥澶愬閻橀潧濮堕梻浣告啞閸旀宕戦幘缁樺仼濠靛倸鎲￠埛鎴︽煕濠靛棗顏い銉︾矋娣囧﹪顢曢敐鍥╃杽閻庢鍠涢褔鍩ユ径鎰潊闁绘ɑ褰冪粊顕�姊绘笟锟藉褔鈥﹂崼銉ョ？闁规鍠涙慨鎶芥煢濡警妯堟繛鎾愁煼閺屾洟宕煎┑鍫㈩啈缂備緤鎷烽悗锝庡枟閻撴洟鏌￠崘鎸庡闂佹悶鍔庨弫濠氭晲閻愬墎鐤�闁瑰彞鐒﹀浠嬨�侀弮鍫濆窛妞ゆ挾鍠撻弳鐔兼⒒閸屾瑧顦﹂柛鐔风仢閿曘垽鏌嗗鍛紱闂佽宕橀鎰板箯瀹勯偊娼╂い鎾跺У閸掓稑鈹戦纭锋敾婵＄偠妫勯悾鐑藉Ω閿斿墽鐦堥梺鍛婂姂閸旀垿鎮楀ú顏呪拻濞达絽鎼敮鍓佺磽瀹ュ拑鍔熺紒顔碱煼瀵粙顢橀悙瀛樞氶梻渚�娼х换鍫ュ磹閺囩姷涓嶇紓浣诡焽缁犻箖鏌ょ喊鍗炲閻㈩垱鐩弻锟犲椽娴ｇ兘鍋楀┑顔硷龚濞咃綁骞戦崟顖毼╅柕澶涘娴滅偞绻濈喊妯活潑闁稿瀚敓鑺ョ煯閸楁娊寮幇鐗堝�烽柛鎾茶兌閺夌鈹戦悙鏉戠仸闁荤噦绠撳畷鏇㈩敂閸啿鎷洪梻鍌氱墐閺呮盯鎯佸鍫熺厱婵鎷风紒鐘崇墵楠炲啴鏁撻悩鑼啋缂傚倷鐒﹂…鍥储娴犲鈷戠紓浣光棨椤忓牆鍌ㄩ柡宥庡幗閸ゅ銇勮箛鎾跺闁绘挻娲熼弻锟犲磼濮橆厼浠撮梺鍛婄懃鐎氫即寮婚悢纰辨晩闁稿繒鍘ф禒鎾倵鐟欏嫭绀堥柛鐘崇墵閵嗕礁鈽夊Ο閿嬵潔闂佸湱鍎ら幐鎼侇敂瑜版帗鈷掗柛灞剧懅椤︼箓鏌熺拠褏纾跨紒顔界懇楠炲鏁傞懞銉︾彇闂備線娼чˇ顐﹀疾濠婂牆纾婚柛宀�鍋為悡蹇擃熆鐠団�崇仩闁硅櫕鍔欓弫宥咁煥閸曨厾鐦堥梺闈涢獜缁插墽娑垫ィ鍐╃厸闁割偒鍋勬晶瀵革拷娈垮枟婵炲﹪銆佸Δ鍛＜闁挎棁妫勯璺衡攽閻愯尙澧曢柣蹇旂箞瀵悂鎮㈤崗鑲╁幗闂佸湱铏庨崹浠嬪箯瀹勬壆鏆﹂柛銉ｅ妽椤旀洖鈹戦悩缁樻锭闁稿﹤顭烽垾锕傚醇閵夈儳顢呴梺瑙勫劶婵倝鎮¤箛鎾斀闁绘灏欑粻缁樹繆缂併垹鏋熺紒缁樼洴瀹曘劑顢橀悩妯犲嫭鍙忓┑鐘插鐢盯鏌熷畡鐗堝殗闁圭厧缍婇幃鐑藉箥椤曞懎浠归梻鍌氬�烽悞锔撅拷绗涘啰鏆嗛柟闂寸閽冪喐绻涢幋鐑囦緵婵炲皷鏅犻弻锝夊箛闂堟稑顫╁銈呯箰婢у海妲愰幘璇茬＜婵﹩鍓ㄩ幏鐑芥倻閼恒儱锟藉潡鏌ㄩ弴鐐诧拷鍫曟晸閽樺鏆ｇ�规洏鍔岄～銏ゅΧ閸涱喖鏋犲┑鈽嗗亜閸燁偊鍩ユ径瀣秶闁靛ě鍛瀱闂傚倸鍊烽悞锕傚磿瀹曞洦宕查柟鐑樺灍閺嬪秹鏌曡箛瀣拷鏇犵不椤栫偞鐓熼柟杈剧稻椤ュ鏌熺涵鍛厫闁靛洤瀚伴獮妯兼崉閻氬瓨瀚规い鎰堕檮閺呮煡鏌涢埄鍐ㄥ缂併劌顭峰娲濞戣鲸肖闂佺楠搁幖顐ョ亽闂佽法鍠嶇划娆忣潖濞差亜浼犻柛鏇ㄥ幘娴煎洭姊洪崫銉バｉ柣妤冨█閻涱噣寮介鍙ユ睏闂佸湱鍎ょ换鍐疾濠靛鈷戦梻鍫熺〒缁犲啿鈹戦锝呭箹妞ゎ厼娲鎾偐閻㈢绱抽梻浣侯焾閺堫剟鎮疯閹疯瀵肩�涙鍘遍梺缁樏壕顓熸櫠閻㈠憡鐓欐い鏂诲妼鐎氼喚寮ч敓浠嬫⒑缁嬭儻顫﹂柛濠冩礀閳绘捇顢曢敂瑙ｆ嫼闂佸憡绋戦敃銉﹀緞閸曨垱鐓曢悗锝庝簼椤ャ垻锟芥鍠楁繛濠傜暦閸楃偐妲堟繛鍡樺灥瀵娊姊绘担铏瑰笡婵﹤顭峰畷鏇㈠Χ閸涱亝鐎洪梺鍝勬川閸庢劙鎮㈤崱娑欏仭婵炲棗绻愰顏嗙磼閿熶粙宕橀鍡欙紲闁哄鍋炴竟鍡涙儗濞嗘埊鎷风憴鍕８闁告柨绉堕幑銏犫攽鐎ｎ亞顦板銈嗗姂閸ㄥ鎮块崟顖涒拻闁稿本鐟︾粊鐗堛亜閺囧棗鎳忓畷鏌ユ煙閻戞﹩娈旂痪鍓х帛缁绘盯骞嬮悙鍨櫗濠电偛鎳愭慨鎾箒闂佺粯锚濡﹪宕曡箛鏇犵＜闁绘﹢娼ч埢鍫ユ煛鐏炲墽娲撮柛鈺佸瀹曟﹢顢旀担璇★拷鍥⒒娴ｈ櫣甯涢柟姝岊嚙鐓ら柣鏂垮悑閸嬪倹銇勯幇鍓佺暠闁绘劕锕弻鏇熺節韫囨洜鏆犻梺鍝勬椤ㄥ﹤顫忛搹鍦＜婵☆垵娅ｉ悷鏌ユ⒑鐠団�虫灈闁稿﹤鐏濋锝嗙節濮橆厽娅栭梺鍛婃处娴滄繈宕熼崘顏嗙＝濞达絽澹婇崕蹇涙煟韫囨梻绠為柛鈺傜♁瀵板嫰骞囬娑欏闂備浇宕甸崰鎰熆濡綍锝嗙節濮橆厾鍘甸梺鎯ф禋閸婂顢旈崶鈺�缃曢梻鍌欑閹诧繝宕濋幋锕�绀夊璺好￠敐澶婇唶闁靛濡囬崣鍕椤愩垺绁紒鑼跺Г缁傚秴顭ㄩ崟鈺�绨婚棅顐㈡处绾板秶娑垫ィ鍐╃厓閻熸瑥瀚悘鎾煙椤旇娅囩紒杈ㄥ笒铻ｅ┑鐘崇閺嗘ê鈹戦悩娈挎毌婵℃彃鎳樺畷鎴﹀川鐎涙ê鍓銈嗙墬閸戝綊宕甸弴銏＄厵闁诡垱婢樿闂佸搫鎳忕换鍫ュ蓟濞戞矮娌柛鎾椾緤鎷烽幒妤佺厱婵妫旈柇顖涗繆椤愩垺鍤囨い銏℃礋婵拷闁斥晛鍟崐閿嬩繆閻愵亜锟芥牠宕归悽绋跨疇婵鎷风�殿噮鍋婇獮妯肩磼濡儤鐤呴梻渚�娼ч敍蹇涘礃閿濆棗顏梻浣筋嚙濮橈箓锝炴径濞掑搫顫滈敓钘夌暦瑜版帒鍨傛い鏃傚亾濞堥箖姊虹紒妯烩拻闁冲嘲鐗撳顐㈩吋閸℃瑧顔曢梺鐟邦嚟閸嬬姵绔熷Ο娲绘闁绘劘灏欐晶娑氱磼缂佹绠為柟顔荤矙濡啫鈽夊Δ浣稿闂傚倷鐒﹂幃鍫曞礉瀹�鍕亯濠靛倻顭堥弸渚�鏌涢幇闈涙珮闁轰礁鍟撮弻銊╁籍閿熶粙宕曠�圭姰浜归柛鈩冾殢濞撳鏌曢崼婵囶棞缂佹鍊规穱濠囨倷閺夋垹顑傞梺鐟扮畭閸ㄨ棄鐣烽崡鐐╂婵炲棙鍨甸獮鍫ユ⒒娴ｅ憡璐￠柛瀣崌閵嗗啴宕ㄩ弶鎴犳焾濡炪倖鍔ф俊鍥х暤娓氾拷閹鏁愭惔鈩冪亶闂佹娊鏀遍崹鍧楀蓟濞戞ǚ鏀介柛鈩冾殢娴硷拷闂備胶绮敮鐔封枖閺囩姵顫曢柟鐐墯閸氬鏌涢弴銊ュ箻闁绘稏鍨硅灃闁绘﹢娼ф禒婊堟煕閻斿憡灏︾�规洘妞介弫鎾绘偐閹绘帞鐛╂俊鐐�栧褰掑磿閾忣偅鍙忛柟闂寸劍閻撶喖骞栨潏鍓х？闁伙綆鍙冮弻娑欐償閳ュ疇鍩為柧鑽ゅ仦閵囧嫰骞橀崡鐐典痪闂佸搫鎳忛幃鍌炲蓟閵堝绠掗柟鐑樺灥婵垺绻濋埛锟介崘顏冪驳闂侀�涚┒閸斿秶鎹㈠┑瀣闁崇懓銇橀搹搴繆閵堝洤啸闁稿鍋ら幃褔鎮╃拠鑼暫濠电偛妫欓幐鍝ョ不閻㈠憡鐓欓柣鎴烆焽缁犳﹢鏌ㄩ悢鐑樻珪闁稿繑锚椤繒绱掑Ο璇差�撴繛鎾村嚬閸ㄩ亶寮姘ｆ斀闁绘劕寮堕崳鐑樼箾閼碱剙鏋涢柣娑卞櫍楠炲鏁冮敓浠嬫倷婵犲啨浜滈柟铏瑰仦鐎氬湱绱撴担鍝勑ｉ柣妤佹礉閻忓啴姊洪幐搴ｇ畵闁瑰啿閰ｅ鎶芥倷閻戞鍘辨繝鐢靛Т閸嬪棝鎮℃總鍛婄厸閻忕偠顕ч敓鑺ョ箞閻涱喗绗熼敓浠嬬嵁閹烘绠ｆ繝闈涙－濞兼稒绻濋悽闈涗粶闁宦板妿閸掓帒顓奸崶褍鐏婇梺鍦亾閸撴艾顭囬弽顓熺叄闊洦鎸荤拹锛勭棯閹冩倯濞ｅ洤锕、娑樷攽閹邦剚顔勭紓浣哄亾濠㈡绮旈幘顔肩厴闁硅揪闄勯崐椋庯拷鐟板閸犳牕鈻撻崼鏇熲拺缂佸娉曠粻鍙夈亜椤撶偟澧曢摶鐐烘煟閺傚灝鎮戦柛瀣у墲缁绘繃绻濋崒姘间痪闂佺粯鎸堕崕鏌ュΦ閸曨垼鏁冮柕蹇嬪灮椤斿洭鏌ｉ幘鍗烇拷鏍Φ閸曨喚鐤�闁圭偓鍓氭禒鑲╃磽娴ｇ懓濮堢紒瀣笧閹广垹鈹戠�ｎ偄浠洪梻鍌氱墛閸掞拷闁靛繈鍊栭悡鏇炩攽閻樻彃鏆為柛濠冨姉閿熻姤顔栭崰姘垛�﹂崼銉ョ厺閹兼番鍔岀粻鑽ょ磼椤旀娼愰悗姘偢濮婄粯鎷呴挊澶婃優闂佸摜濮甸崝鏇⑩�﹂崹顔ョ喓鎮伴埄鍐簴闂備礁鍟块幖顐﹀箠韫囨稒鍋傛繛鍡樻尰閻撴洟鏌熺�涙鎳冮柨鐔诲Г閻楁粓鏁撻懞銉у暡闁瑰嚖鎷�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牆濮涚紓浣哄█缁犳牠寮婚妸鈺傚亜閻犲洦鐣幘鍓佺＜缂備焦顭囬埦渚�鏌熷畡鐗堝殗鐎规洘锕㈠畷锝嗗緞鐎ｎ偄锟介绱撴担鍝勪壕鐎规洘锕㈤、姘愁樄闁糕晝鍋ら獮瀣晜閽樺姹楅梻浣告啞閻熴儵藝娴兼潙绠栨繛鍡樺灩绾捐棄霉閿濆懏鎯堟い搴＄焸閺屾盯濡搁妷褍鐓熼悗娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閻樻爠鍥╁彄闁搞儯鍔嶉悡銉︺亜韫囨碍纭鹃柍瑙勫灴椤㈡瑧绮电�ｎ剙濮洪梻浣告啞椤棝宕熼浣哄娇濠电偛顕崢褔鎮洪妸鈺傚亗婵炲棙鍔﹀▓浠嬫煟閹邦垰鐨哄ù鐘灲閺岋綀绠涢幘宕囬獓濡炪們鍔婇崕鐢稿箖濞嗘挸绾ч柟瀵稿仩閻т線鏌ｆ惔銏╁晱闁革綆鍣ｅ畷鎶芥晲婢跺﹥鐎梺瑙勫劤椤曨參銆呴悜鑺ュ�甸柨婵嗙凹缁ㄥジ寮堕崼婵堝闁宠鍨块幃鈺冩嫚瑜嶆导鎰版⒑缂佹﹩娈旈柨鏇ㄤ邯楠炲啴鏁撻悩鎻掑祮闂侀潧楠忕槐鏇㈠储閹剧粯鈷戦悗鍦У閵嗗啰绱掗敓鑺ョ瑹閿熻棄顕ｉ幎鑺ュ亜闁稿繗鍋愰崢鎾绘⒑閸涘﹦鎳�闁稿骸纾划锝夊籍閸喓鍘搁悗鐧告嫹閻庯綆鍓涜ⅵ婵°倗濮烽崑鐐烘晝閵忕姷鏆﹂柨鐔哄У閸婄兘鏌熺紒妯洪唶闁哄洢鍨洪埛鎺懨归敐鍛暈闁诡垰鐗撻幃璺侯潩閻撳簼鍠婇悗瑙勬礃缁诲牓鐛�ｎ喗鏅濋柨鐔烘櫕缁寮介鐔哄帾闂佸壊鍋呯换宥呂ｉ崫銉ф／闁诡垎鍐╁�紓浣虹帛閻╊垶鐛�ｎ喗鍊婚柛銉鏉╂柨鈹戦悙宸殶闁靛棗顑夐獮蹇涙晸閿燂拷?");
			return;
		}
		new fire.pb.fushi.PQueryOrderResponseNew(this).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 8905;

	public int getType() {
		return 8905;
	}

	public final static int restype_query = 0; // 查询返回结果
	public final static int restype_notify = 0; // 主动通告返回结果

	public int errorcode;
	public int restype;
	public java.lang.String platid; // 平台唯一标识
	public java.lang.String orderserialplat; // 平台用的订单号
	public java.lang.String orderserialgame; // 游戏内自己用的订单号
	public int userid; // 如果返回的结果中，并没有userid的信息，该值为-1
	public com.locojoy.base.Octets vars;

	public QueryOrderResponse() {
		errorcode = ErrorCodes.error_succeed;
		restype = restype_query;
		platid = "";
		orderserialplat = "";
		orderserialgame = "";
		userid = -1;
		vars = new com.locojoy.base.Octets();
	}

	public QueryOrderResponse(int _errorcode_, int _restype_, java.lang.String _platid_, java.lang.String _orderserialplat_, java.lang.String _orderserialgame_, int _userid_, com.locojoy.base.Octets _vars_) {
		this.errorcode = _errorcode_;
		this.restype = _restype_;
		this.platid = _platid_;
		this.orderserialplat = _orderserialplat_;
		this.orderserialgame = _orderserialgame_;
		this.userid = _userid_;
		this.vars = _vars_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(errorcode);
		_os_.marshal(restype);
		_os_.marshal(platid, "UTF-16LE");
		_os_.marshal(orderserialplat, "UTF-16LE");
		_os_.marshal(orderserialgame, "UTF-16LE");
		_os_.marshal(userid);
		_os_.marshal(vars);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		errorcode = _os_.unmarshal_int();
		restype = _os_.unmarshal_int();
		platid = _os_.unmarshal_String("UTF-16LE");
		orderserialplat = _os_.unmarshal_String("UTF-16LE");
		orderserialgame = _os_.unmarshal_String("UTF-16LE");
		userid = _os_.unmarshal_int();
		vars = _os_.unmarshal_Octets();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof QueryOrderResponse) {
			QueryOrderResponse _o_ = (QueryOrderResponse)_o1_;
			if (errorcode != _o_.errorcode) return false;
			if (restype != _o_.restype) return false;
			if (!platid.equals(_o_.platid)) return false;
			if (!orderserialplat.equals(_o_.orderserialplat)) return false;
			if (!orderserialgame.equals(_o_.orderserialgame)) return false;
			if (userid != _o_.userid) return false;
			if (!vars.equals(_o_.vars)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += errorcode;
		_h_ += restype;
		_h_ += platid.hashCode();
		_h_ += orderserialplat.hashCode();
		_h_ += orderserialgame.hashCode();
		_h_ += userid;
		_h_ += vars.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(errorcode).append(",");
		_sb_.append(restype).append(",");
		_sb_.append("T").append(platid.length()).append(",");
		_sb_.append("T").append(orderserialplat.length()).append(",");
		_sb_.append("T").append(orderserialgame.length()).append(",");
		_sb_.append(userid).append(",");
		_sb_.append("B").append(vars.size()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

