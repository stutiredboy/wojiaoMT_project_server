
package fire.pb.item;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CItemRecoverList__ extends mkio.Protocol { }

/** 客户端请求道具找回列表
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CItemRecoverList extends __CItemRecoverList__ {
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;

		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻愬搫绠板┑鐘崇閸嬪嫭銇勯幒鎴濐仼缂佺媭鍨抽敓鐣屾嚀鐎氼參宕抽幘顔藉仭闂侇叏濡囬崣鍡涙⒑閸撴彃浜栭柛銊ヮ煼瀵娊顢曢敂钘夛拷鐢告偡濞嗗繐顏紒锟介崘鈹夸簻闁靛鍎婚煬顒傦拷娈垮枛椤攱淇婂宀婃闂佸綊顥撻崗姗�寮幇顓熷劅婵犻潧娲ら弸銈嗙節绾版ɑ顫婇柛瀣瀹曚即寮借濞兼牗绻涘顔荤盎缂佺姴缍婇弻锝夊箛椤撶偟绁锋繝娈垮枔閸ㄨ棄顫忛搹鍦煓婵炲棙鍎抽崜閬嶆⒑閻戔晜娅撻柛銊ゅ嵆閹箖鎮块妯规睏闂佸湱鍎ょ换鍐疾濠婂牊鈷戠紒顖涙礀婢ф煡鏌ㄥ顑炲綊鎮崨顔碱伓?
				SItemRecoverList send = new SItemRecoverList();

				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌ㄩ悢鍝勑㈢痪鎯ь煼閺屾稑鈽夐崡鐐寸亾闂佸磭鎳撶粔褰掑蓟瑜戠粻娑橆潩閸忚偐绉烽柣搴ゎ潐濞叉﹢鎮￠敓鐘茶摕婵炴垶锕╅崥瀣煕閵夛絽濡跨憸鎵毘闂傚倸鍊搁崐鎼佸磹妞嬪孩顐芥慨姗嗗墻閻掍粙鏌ゆ慨鎰拷鏍拷姘煼閺岋綁寮崒姘粯缂備緤鎷峰鑸靛姈閸婂爼鏌ｉ幇顔芥毄闁告瑦鎸荤换娑橆啅椤旇崵鐩庨梺鍛婂姧閹烽攱淇婇悙顏勶拷鏍箰妤ｅ啫纾婚柣鏃傚帶娴肩姵淇婇妶鍛櫤闁抽攱鍨块弻娑樷槈濮楀牊鏁鹃柣蹇撴禋閸嬪﹪寮婚妶澶嬫優妞ゆ劑鍨规慨鎼佹⒑闂堟稒澶勯柛鏃�鐟╅悰顕�骞樼拠鑼唺闂佺硶鍓濋敃鈺侇焽閺冨牊鈷掑ù锝囧劋閸わ拷闂佽绻戠换鍫濈暦椤栫儐鏁冮柨鏃�鍎崇粊锕�鈹戞幊閸娧囧箯闁垮浜滄い鎾墲绾爼鏌熼崣澶嬪唉鐎规洜鍠栭獮鍡欐暜椤旇棄顏堕柣鐘辫閻撳骞忔搴㈠枂闁告洦鍓涢ˇ銊╂倵閻у憡瀚圭紓浣割儐椤戞瑩宕甸弴銏″仯濡わ箒锟ラ敓鏂ゆ嫹闂佸搫顑呴柊锝夊蓟閻旂⒈鏁嶉柛鈩冾殔椤忔挳鏌涢悢閿嬪殗婵﹦绮幏鍛村川婵犲懐顢呴梻浣告啞椤棝宕堕妸銉ゆ闂備線娼ч…鍫ュ磿閸濆嫷鐒介柡宥庡幗閸嬶綁鏌涢妷锝呭闁靛牊鎸抽弻锛勶拷锝庡亝椤ュ牓鏌″畝锟介崰鎰焽韫囨柣鍋呴柛鎰ㄦ櫓閿熻棄绉瑰铏圭磼濡櫣鐟ㄩ梺闈涚墛閹倸顕ｆ繝姘亜闁绘挸娴烽悾楣冩偡濠婂啰效鐎殿喛娅曞蹇涘煛鐎ｎ偄顏堕梻鍌氱墛缁嬫垹鑺辨繝姘厵闁告垯鍊栫�氾拷
				xbean.Itemrecoverlist itemRecoverList = xtable.Itemrecover.get(roleId);
				if (itemRecoverList != null) {
					long now = System.currentTimeMillis();
					java.util.List<Long> removeList = new java.util.LinkedList<Long>();
					for (Long uniqId : itemRecoverList.getUniqids()) {
						xbean.DiscardItem ditem = xtable.Itemrecyclebin.select(uniqId);
						if (ditem != null) {
//							// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔戒氦闂傚倷绀侀幉锟犳偡閵夆晜鏅濋柕澶嗘櫅妗呴梺鍛婃处閸ㄤ即宕橀敓浠嬫⒑闂堟丹娑氫沪閻愵剦鍟囬梻鍌氬�烽懗鍫曗�﹂崼鐕佹闁归棿鐒﹂弲婵囥亜韫囨挸顏撮柛銈嗘礋閺屾盯顢曢敐鍡欘槬闂佺粯鎸荤粙鎴︽箒闂佹寧绻傚ú锕傚吹閿熻棄顪冮妶蹇氬悅闁哄懏鐩崺鐐哄箣閿旇棄浜奸梺鍛婁緱閸犳牠顢旈崼鏇熲拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟�,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鐓熼幖鎼灣缁夌敻鏌涚�ｎ亜锟芥悂锝炲┑瀣櫇闁稿本绋堥幏娲⒑绾懎浜归柛瀣洴瀹曟繂顫滈敓浠嬪蓟濞戙垹妫橀悹鎭掑壉瑜忛敓鍊燁潐濞叉ê顪冮挊澶屾殾闁圭儤顨嗛崐鐑芥煛婢跺鐓�闁归鍏樺畷濂稿即閻樻彃绲奸梻浣规偠閸庮垶宕濆鍥︾剨妞ゆ挾濮风壕鐣岋拷骞垮劚鐎氼垶宕楀畝锟界槐鎺撴綇閵娿儳鐟ㄩ柧缁樼墵閺屻劑鎮㈤崜浣虹厯闁芥ɑ绻堝濠氬醇閻旀亽锟芥帡鏌￠崱顓犵暤闁哄被鍔戦幃銈夊磼濞戞﹩浼�?
//							fire.pb.item.ItemShuXing attr = Module.getInstance().getItemManager().getAttr(ditem.getItem().getId());
//							if (attr == null) {
//								Module.logger.error("[CItemRecoverList] roleId:" + roleId
//										+ " itemId:" + ditem.getItem().getId()
//										+ " uniqId:" + ditem.getItem().getUniqueid()
//										+ " ItemShuXing not found!");
//								continue;
//							}
//							long day = attr.getRecycletime(); // 濠电姷鏁告慨鐑藉极閹间礁纾块柟瀵稿Т缁躲倝鏌﹀Ο渚＆婵炲樊浜濋弲婊堟煟閹伴潧澧幖鏉戯躬濮婃椽宕ㄦ繝鍐槱闂佹悶鍔嶅妯绘櫏闂佸搫琚崕鏌ユ偂閵夆晜鐓熼柡鍌氱仢椤ｆ娊鏌ｉ鐔烘噰闁哄备锟藉磭鏆嗛悗锝庡墰閻﹀牓鎮楃憴鍕闁挎洏鍨烘穱濠傤潰瀹�濠冃╅梻浣虹帛閹搁箖宕版惔銊ョ厴闁硅揪绠戦悡锟犳煕閳╁啨浠﹀瑙勬礋濮婃椽鎮烽弶鎸庮唨闂佺懓鍤栭幏锟�:濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿﹤鐖奸弻娑㈩敃閻樻彃濮庨梺姹囧�楅崑鎾舵崲濠靛洨绡�闁稿本绮岄。鍝勨攽椤旀娼愰柣鎿勭節瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷
//							long validTime = day * 24L * 3600L * 1000L; // 濠电姷鏁告慨鐑藉极閹间礁纾块柟瀵稿Т缁躲倝鏌﹀Ο渚＆婵炲樊浜濋弲婊堟煟閹伴潧澧幖鏉戯躬濮婃椽宕ㄦ繝鍐槱闂佹悶鍔嶅妯绘櫏闂佸搫琚崕鏌ユ偂閵夆晜鐓熼柡鍌氱仢椤ｆ娊鏌ｉ鐔烘噰闁哄备锟藉磭鏆嗛悗锝庡墰閻﹀牓鎮楃憴鍕闁挎洏鍨烘穱濠傤潰瀹�濠冃╅梻浣虹帛閹搁箖宕版惔銊ョ厴闁硅揪绠戦悡锟犳煕閳╁啨浠﹀瑙勬礋濮婃椽鎮烽弶鎸庮唨闂佺懓鍤栭幏锟�:婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖闂傤垱銇勯弽銊х煂缂侊拷婵犲洦鐓曢柍鈺佸暟閳藉鐥幆褜鐓奸柡灞剧洴閸╁嫰宕橀妸銉︾亞缂傚倸鍊哥粔鐢告偋濡や胶鈹嶅┑鐘叉搐鍥撮梺鍛婁緱閸犳牕鈻嶉敐澶嬧拺闁告繂瀚烽崕婊堟煙閸戙倖瀚�?
//							long elapseTime = now - ditem.getDeletedate(); // 闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换娑㈠箣閻愨晜锛堝┑鐐叉▕娴滄粌娲垮┑鐘灱濞夋盯鎳熼婊呯焾闁挎洖鍊归埛鎴︽偡濞嗗繐顏╃紒锟介崘鈹夸簻闁哄洤妫楅幊鎰焊閻㈢鎷烽獮鍨姎妞わ缚鍗抽幃锟犲即閻旂繝绨婚梺瑙勬緲婢у海绮欓懡銈囩＜闁跨喍绮欏畷姗�顢欓悾灞藉汲婵犵數鍋為崹鐓庘枍閺囩媴鎷峰鐐:婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖闂傤垱銇勯弽銊х煂缂侊拷婵犲洦鐓曢柍鈺佸暟閳藉鐥幆褜鐓奸柡灞剧洴閸╁嫰宕橀妸銉︾亞缂傚倸鍊哥粔鐢告偋濡や胶鈹嶅┑鐘叉搐鍥撮梺鍛婁緱閸犳牕鈻嶉敐澶嬧拺闁告繂瀚烽崕婊堟煙閸戙倖瀚�?
//							long remainTime = validTime - elapseTime; // 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閼碱剦鍞堕梻浣告贡閾忓酣宕伴弽顓熷仾闁绘劦鍓涚粻楣冩煕閳╁厾顏堟倶閳哄啰纾奸柨鐔诲Г缁绘繈宕堕妸褍骞嶉梺鍝勵槸閻楀棙鏅舵禒瀣仼閺夊牃鏅濈壕鍏笺亜閹扳晛鐏弫鍫ユ⒑閸濆嫭婀伴柣鈺婂灦閵嗕線寮撮姀鈩冩珳闂佺硶鍓濋悷顖毼ｆ导瀛樷拻濞达絿鎳撻婊堟煕閹邦剦鐓兼鐐茬箻閺佹捇鏁撻敓锟�:婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖闂傤垱銇勯弽銊х煂缂侊拷婵犲洦鐓曢柍鈺佸暟閳藉鐥幆褜鐓奸柡灞剧洴閸╁嫰宕橀妸銉︾亞缂傚倸鍊哥粔鐢告偋濡や胶鈹嶅┑鐘叉搐鍥撮梺鍛婁緱閸犳牕鈻嶉敐澶嬧拺闁告繂瀚烽崕婊堟煙閸戙倖瀚�?
							long remainTime = ditem.getDeletedate() - now;
							if (remainTime > 0) {
								int cost = -1; // -1:闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾绾惧鏌ｉ幇顔芥毄闁活厽鐟╅悡顐﹀炊閵娧�妲堢紓渚婃嫹濠㈣埖鍔曠粻瑙勭箾閿濆骸澧┑锛勫帶椤╁ジ宕ㄩ娑欐杸濡炪倖姊归弸缁樼瑹濞戙垺鐓曢煫鍥ㄦ閼拌法锟芥鍠栭…鐑藉极閸愵喖纾兼繛鎴炶壘鐢姊绘担鍝ユ瀮婵℃ぜ鍔庣划鍫熺瑹閿熻棄顕ｉ幎鑺ュ�烽柣銏㈡暩閿涙粓姊虹紒妯忣亪宕崹顔氬綊顢欓幘鍛婵炲牆鐏濋弸娑㈡煟閺嵮佸仮鐎规洘妞介弫鎾绘偐閼碱剨绱叉繝鐢靛Т閿曘倗锟芥凹鍓欓埢宥堢疀濞戞瑢鎷婚梺绋挎湰閻熝囁囬敂鎾呮嫹濞堝灝鏋涘褍閰ｅ畷姘跺箳濡わ拷缁犲鎮归崶顏勮敿闁硅姤娲熷铏瑰寲閺囩偛鈷夌紓浣割儐閸ㄥ湱鍒掔紒妯肩瘈婵﹩鍘鹃崢閬嶆⒑瑜版帒浜伴柛妯垮亹瀵板﹪鎳￠妶鍥╋紲婵☆偆澧楃换鍌氣枍瀹ュ棙鍙忓┑鐘插�归幆鍫ュ极閸儲鐓曢柕澶嬪灥閸犳岸鎮楅幎鑺モ拺閻犲洦褰冮銏ゆ煟椤撗冩珝鐎规洩绻濆畷姗�鎳犻浣诡啎闂備線娼х换鍫ュ磹閺囩偞绾梻鍌欑劍閹爼宕曢锟藉鎻掆攽鐎ｎ偅娅栭梺璺ㄥ櫐閹凤拷?
								ItemShuXing itemAttrConf = Module.getInstance().getItemManager().getAttr(ditem.getItem().getId());
								if (itemAttrConf != null) {
									cost = itemAttrConf.getRecovercost();
								}
								ItemRecoverInfoBean info = new ItemRecoverInfoBean();
								info.itemid = ditem.getItem().getId();
								info.uniqid = uniqId;
								info.remaintime = (int) (remainTime / 1000); // 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閼碱剦鍞堕梻浣告贡閾忓酣宕伴弽顓熷仾闁绘劦鍓涚粻楣冩煕閳╁厾顏堟倶閳哄啰纾奸柨鐔诲Г缁绘繈宕堕妸褍骞嶉梺鍝勵槸閻楀棙鏅舵禒瀣仼閺夊牃鏅濈壕鍏笺亜閹扳晛鐏弫鍫ユ⒑閸濆嫭婀伴柣鈺婂灦閵嗕線寮撮姀鈩冩珳闂佺硶鍓濋悷顖毼ｆ导瀛樷拻濞达絿鎳撻婊堟煕閹邦剦鐓兼鐐茬箻閺佹捇鏁撻敓锟�:缂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐闁芥ɑ绻堥弻鐔封枔閸喗鐏嶉梺鍝勬缁秵绌辨繝鍥ч柛娑卞枛濞咃絽鈹戦娆炬綈闁绘搫绻濆濠氬Ω閳哄倸浜為梺绋挎湰缁嬫垿顢旈敓锟�
								info.cost = cost;
								send.items.add(info);
							}
						} else {
							// 缂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐闁芥ɑ绻冮妵鍕冀椤愵澀姹楅梺璺ㄥ枑閺嬭崵绮婚幋锔藉仼闁跨喓濮寸粻銉╂煣韫囷絽浜為柨鐔诲Г濡炰粙寮婚悢鐓庣闁兼祴鏅滃▓顒勬⒑閸涘﹥鐓ラ柣顒�銈搁幃顕�骞嗚閸氬顭跨捄渚剳闁告妫勯埞鎴﹀煡閸℃浠柣搴ｇ懗閸ャ劌浠у銈呯箰閹虫劗绮绘ィ鍐╃厱婵炴垵宕獮妯肩磼閻樺樊鐓奸柡灞革拷宕囨殕閻庯綆鍓涜ⅵ闂備浇妗ㄩ悞锕傚箲閸ヮ剙鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘?
							removeList.add(uniqId);
						}
					}
					// 缂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐闁芥ɑ绻冮妵鍕冀椤愵澀姹楅梺璺ㄥ枑閺嬭崵绮婚幋锔藉仼闁跨喓濮寸粻銉╂煣韫囷絽浜為柨鐔诲Г濡炰粙寮婚悢鐓庣闁兼祴鏅滃▓顒勬⒑閸涘﹥鐓ラ柣顒�銈搁幃顕�骞嗚閸氬顭跨捄渚剳闁告妫勯埞鎴﹀煡閸℃浠柣搴ｇ懗閸ャ劌浠у銈呯箰閹虫劗绮绘ィ鍐╃厱婵炴垵宕獮妯肩磼閻樺樊鐓奸柡灞革拷宕囨殕閻庯綆鍓涜ⅵ濠电姷顣介崜婵嬪箖閸屾稐绻嗛柣鎴ｆ鍞銈嗘⒒缁垶宕戦崨瀛樷拻闁稿本鐟чˇ锕�顭块悷甯含闁诡噯绻濆畷濂告偄娓氼垱閿ら梻浣虹帛閸旀洟骞栭銈囦笉闁哄稁鍘介悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?
					itemRecoverList.getUniqids().removeAll(removeList);
				}
				mkdb.Procedure.psendWhileCommit(roleId, send);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787793;

	public int getType() {
		return 787793;
	}


	public CItemRecoverList() {
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
		if (_o1_ instanceof CItemRecoverList) {
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

	public int compareTo(CItemRecoverList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

