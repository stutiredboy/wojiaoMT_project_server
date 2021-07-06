
package fire.pb.shop;

import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.game.MoneyType;

import fire.pb.main.Gs;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CExchangeCurrency__ extends mkio.Protocol { }

/** 货币兑换
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CExchangeCurrency extends __CExchangeCurrency__ {
	@Override
	protected void process() {
		// protocol handle
		
		long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		final int userid = ((gnet.link.Dispatch) this.getContext()).userid;
		
		new mkdb.Procedure() {
			
			@Override
			protected boolean process() throws Exception {
				fire.pb.item.Pack bag = new fire.pb.item.Pack(roleid, false);
				
				long ret = 0;
				int newMoney = 0;
				// 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮枟閹告娊骞冨▎鎴炲珰鐟滃海锟芥艾缍婇弻娑㈩敃閿濆棛顦ㄩ梺鍝勬噺閹倿寮婚敃锟借灒濞撴凹鍨辩瑧闂備礁鎼Λ瀵稿緤妤ｅ啨锟藉啴濡烽埡鍌氾拷鐑芥煕濞嗗浚妲搁柡瀣Т椤啴濡堕崘銊т痪闂佹寧宀搁弻宥囨喆閸曨偆浼岄悗瑙勬礀閵堝憡鎱ㄩ敓浠嬫煏韫囧﹤澧查柣锔惧仱濮婂宕掑顒婃嫹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷鍝ョ不閺嶎厽鐓曟い鎰剁稻缁�锟界紒鍓у亾鐎笛呮崲濞戞﹩鍟呮い鏃囧吹閻╁海绱撴笟濠冨闂佸壊鍋嗛崰鎰板矗韫囨柧绻嗘い鏍ㄧ☉椤曟粎鐥鐐测挃闁汇儺浜獮鍡氼檨闁绘挸銈搁弻锛勪沪閸撗�妲堥梺浼欑稻缁诲牓寮幘瀵割浄閻庯綆浜為敍娑㈡⒑缂佹ê濮夐柛搴涘�濆畷鎴﹀磼閻愬鍘搁梺鎼炲劗閺呮盯寮搁崒姣懓顭ㄩ崟顓犵厜闂佸搫鐬奸崰鏍ь嚕閸洖鍨傛い鏇炴噺濞堣櫣绱撻崒娆戭槮妞ゆ垵鐗嗛悾鐑芥偨閸偒娼熼梺鍦劋椤ㄥ棝寮茬粙妫靛綊鎮╁顔煎壉闂佸搫鎳忛幃鍌炲蓟閿濆鏅查柛娑卞灣娴煎洨绱掗悙顒�绀冩俊顐㈠婵℃挳骞掗幋顓熷兊濡炪倖甯掗敃銉╁极妤ｅ啯鐓熼幖娣灱婢规绱撳鍜冨伐妞ゎ偄绻橀幖褰掑捶椤撶姷鍘梺鑽ゅУ娴滀粙宕濇惔銏狀嚤闁搞儺鍓氶埛鎴犵磼鐎ｎ偒鍎ラ柛搴㈠灴閺屾稓锟斤絻鍔岄敓鑺ョ箞閻涱噣宕橀鑲╀紜闂佸搫鍊堕崕鏌ユ倵婵犳碍鈷戦柛锔诲幖娴滅偓绻涢崗鑲╂噰闁轰焦鎹囬幃鍓т沪閻愵剚鐦撻梻浣告惈閻绱炴担瑙勫弿闁跨喍绮欓弻宥夋寠婢跺妫為梺鍝勬嚇娴滆泛顫忛搹鍦＜婵☆垵娅ｉ悷鏌ユ⒑缁嬪灝顒㈠┑鐐诧工閿曘垺绗熼敓钘夘潖閾忓湱纾兼俊顖氭禋娴滅偞绔熼弴銏╂晣闁靛繆锟藉啿澹掗梻浣告贡閸庛倝骞栭埡浣叉灁濞寸姴顑嗛悡鐔兼煙闁箑澧婚柛銈囧枎椤儻顧侀柛鎾存皑閹广垹鈽夐姀鈥充簵闁硅壈鎻徊鍧楊敊閹烘鈷戦悹鍥ｏ拷铏亶闂佽崵鍟块弲鐘诲Υ娴ｈ倽鏃堝川椤旇姤顏熷┑鐐差嚟婵挳顢栭幇鏉挎瀬闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�
				if (srcmoneytype == fire.pb.game.MoneyType.MoneyType_HearthStone) {
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎娆戠┛闂傚倷娴囧▔鏇㈠窗閹版澘鍑犻柤濮愬�楁稉宥夋煙閹咃紞闁哄棴绠戦埞鎴﹀磼濠婂海鍔稿銈庡亜閹虫﹢寮诲澶娢ㄩ柕澶堝劜濮ｆ劗绱撴担闈涘Ω闁稿酣娼ч～蹇曠磼濡顎撴繛鎾村嚬閸ㄩ亶寮鐐粹拺閻熸瑥瀚妵鐔访瑰鍛户闁告帗甯楃换婵嗩潩椤掑偆鍚呴梻浣瑰濞测晠骞忛悜鑺ョ厱闁靛鍎遍敓钘夋健瀵鈽夊Ο鍏兼畷闂佽法鍠嶇划娆忕暦閹达附鍊烽柛婵嗗閿涙盯姊洪幐搴ｇ畵闁瑰弶锕㈠顕�宕奸悢鍛婄彆闂備浇濮ら敋妞わ缚绮欏畷鐢碉拷锝庝憾濞撳鏌曢崼婵囧櫧缂佺姴鍟块埞鎴︽倻閸ャ劌顏堕梻鍌欑閹碱偊鎯屾径灞惧床婵犻潧妫涢弳锕傛⒑椤掞拷缁嬩線寮崶顒佺厽婵☆垵娅ｆ禒娑欑箾閸縿鍋㈡慨濠勭帛閹峰懘宕ㄦ繝鍐ㄥ壍闂備焦妞块崢濂杆囬崡鐐嶏綁骞囬弶鍨祮闂佺粯鏌х拃锕�霉閸曨垱鈷戦柟绋垮閳锋帡鏌涚�ｎ偅灏甸柨鐔诲Г绾板秴鐣濋幖浣歌摕闁绘棁娅ｇ壕鍏间繆椤栨繃顏犻柣鐔村妼椤啴濡舵惔鈥茬凹閻庣櫢鎷风紒瀣儥濞兼牜绱撴担鑲℃垶鍒婇幘顔界叄闊洦娲橀崵锟界紓浣诡殣缁绘繂顫忓ú顏勬嵍妞ゆ挻绋掔�氭盯姊虹粙娆惧剰婵☆偅绋戝嵄闁规壆澧楅崐鐑芥倵闂堟稒鎲搁柟铏箞濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熲晠骞冩导鎼晪闁跨喕妫勯悾宄邦潨閿熶粙銆侀弮鍫濆窛妞ゆ挾鍠撻敓绛嬪弮濮婄粯鎷呴崨濠傛殘濠电偞褰冪粔鐟邦嚕閹绘巻妲堟繛鍡樺焾濞插憡绻涚�电甯堕柣掳鍔戦崺娑㈠箣閿旂晫鍘遍梺鎸庢椤曆冾嚕妤ｅ啯鐓熼柟鐑橆殘閻ｆ椽鏌熼绛嬫疁鐎规洖缍婇、鏇㈠閵忋垺鍤冪紓鍌氬�风粈渚�宕愰崷顓熸殰闁跨喓濮撮弰銉╂煃閳轰礁鏆熼柣鐔风秺閺屾盯濡烽敐鍛瀳闂佷紮闄勭划鎾愁潖缂佹鐟归柨鐔绘椤洩顦归柟顔ㄥ洤骞㈡繛鎴烆焽閻ゅ洤鈹戦绛嬫闁归鍏橀弻鐔碱敊閼恒儳鍑″銈庡幑閸旀垵鐣锋總鍛婂亜闁告繂瀚粻銉╂⒒閸屾瑧顦﹂柟璇х節瀹曞綊顢涢悙鑼紮闂佸搫绋侀崑鎾诲箯瀹勯偊娼╅柣鎰靛墮椤忥拷.
					if (fire.pb.fushi.Module.GetPayServiceType() == 1)
						return false;
					
					if (dstmoneytype == fire.pb.game.MoneyType.MoneyType_SilverCoin && this.dealHearthStone()) {
						newMoney = money * 10000;
						ret = bag.addSysMoney(newMoney, "1缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮枟閹告娊骞冨▎鎴炲珰鐟滃海锟芥艾缍婇弻娑㈩敃閿濆棛顦ㄩ梺鍝勬噺閹倿寮婚敃锟借灒濞撴凹鍨辩瑧闂備礁鎼Λ瀵稿緤妤ｅ啨锟藉啴濡烽埡鍌氾拷鐑芥煕濞嗗浚妲搁柡瀣Т椤啴濡堕崘銊т痪闂佹寧宀搁弻宥囨喆閸曨偆浼岄悗瑙勬礀閵堝憡鎱ㄩ敓浠嬫煏韫囧﹤澧查柣锔惧仱濮婂宕掑顒婃嫹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷鍝ョ不閺嶎厽鐓曟い鎰剁稻缁�锟界紒鍓у亾鐎笛呮崲濞戞﹩鍟呮い鏃囧吹閻╁海绱撴笟濠冨闂佸壊鍋嗛崰鎰板矗韫囨柧绻嗘い鏍ㄧ☉椤曟粎鐥鐐测挃闁汇儺浜獮鍡氼檨闁绘挸銈搁弻锛勪沪閸撗�妲堥梺浼欑稻缁诲牓寮幘瀵割浄閻庯綆浜為敍娑㈡⒑缂佹ê濮夐柛搴涘�濆畷鎴﹀磼閻愬鍘搁梺鎼炲劗閺呮盯寮搁崒姣懓顭ㄩ崟顓犵厜闂佸搫鐬奸崰鏍ь嚕閸洖鍨傛い鏇炴噺濞堣櫣绱撻崒娆戭槮妞ゆ垵鐗嗛悾鐑芥偨閸偒娼熼梺鍦劋椤ㄥ棝寮茬粙妫靛綊鎮╁顔煎壉闂佸搫鎳忛幃鍌炲蓟閿濆鏅查柛娑卞灣娴煎洨绱掗悙顒�绀冩俊顐㈠婵℃挳骞掗幋顓熷兊濡炪倖甯掗敃銉╁极妤ｅ啯鐓熼幖娣灱婢规绱撳鍜冨伐妞ゎ偄绻橀幖褰掑捶椤撶姷鍘梺鑽ゅУ娴滀粙宕濇惔銏狀嚤闁搞儺鍓氶埛鎴犵磼鐎ｎ偒鍎ラ柛搴㈠灴閺屾稓锟斤絻鍔岄敓鑺ョ箞閻涱噣宕橀鑲╀紜闂佸搫鍊堕崕鏌ユ倵婵犳碍鈷戦柛锔诲幖娴滅偓绻涢崗鑲╂噰闁轰焦鎹囬幃鍓т沪閻愵剚鐦撻梻浣告惈閻绱炴担瑙勫弿闁跨喍绮欓弻宥夋寠婢跺妫為梺鍝勬嚇娴滆泛顫忛搹鍦＜婵☆垵娅ｉ悷鏌ユ⒑缁嬪灝顒㈠┑鐐诧工閿曘垺绗熼敓钘夘潖閾忓湱纾兼俊顖氭禋娴滅偞绔熼弴銏╂晣闁靛繆锟藉啿澹掗梻浣告贡閸庛倝骞栭埡浣叉灁濞寸姴顑嗛悡鐔兼煙闁箑澧婚柛銈囧枎椤儻顧侀柛鎾存皑閹广垹鈽夐姀鈥充簵闁硅壈鎻徊鍧楊敊閹烘鈷戦悹鍥ｏ拷铏亶闂佽崵鍟块弲鐘诲Υ娴ｈ倽鏃堝川椤旇姤顏熷┑鐐差嚟婵挳顢栭幇鏉挎瀬闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�10000闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮枟閹告娊銆侀弮鍫濆窛妞ゆ挆鍌滃闂傚倸鍊搁崐宄邦渻閹烘梹顫曟い鏃�鍎崇欢銈吤归悩宸剰閹兼潙锕弻銈夋偂鎼粹槅鏆㈡繛瀛樼矆缁瑥顫忓ú顏呭殥闁靛牆鎳嶅▽顏嗙磽娴ｅ壊鍎忛柣妤佹尭閻ｅ嘲顭ㄩ崘锝嗘杸闁诲函缍嗛崑鍕晸閽樺鍩ｉ柡灞剧洴楠炲洭鍩℃担鑲濄劑姊洪悮瀛樺婵炲濮撮鍡涙偂閻斿吋鐓欓梺顓ㄧ畱楠炴绱撳鍡楃伌闁哄矉缍�缁犳盯濡烽埡鍌わ拷宥夋⒑闁稓鈹掗柛鏂跨焷閻忔帞绱撴担鍓插剰闁诲繑绻堥敐鐐哄炊椤掍礁锟界敻鎮峰▎蹇擃仾缁惧墽鏁婚弻銊╂偄鐠囨畫鎾绘煕閹剧澹樻い顓炴喘閸╋繝宕ㄩ鎯у箻闂備礁鎲＄缓鍧楀磿閺屻儱姹查柍鍝勬噺閻撴洘绻涢崱妤冪妞ゃ儯鍨洪幈銊︾節閸涱噮浠╃紓浣介哺鐢帟鐏掗梺鐓庮潟閸娿倕危椤掑嫭鈷掑ù锝勮閻掗箖鏌ㄩ弴妯猴拷鏇㈡晝閵忋倖鐒肩�广儱妫欏▍銏ゆ⒑閸忛棿鑸柛搴㈠▕瀹曨垶寮婚妷锔惧幍闂佸憡鍨崐鏍拷姘炬嫹", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuan, 0);
						if (ret != 0) {
							fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 160402, java.util.Arrays.asList(Integer.toString(money), Integer.toString(newMoney)));
						}
					} 
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎娆戠┛闂傚倷娴囧▔鏇㈠窗閹版澘鍑犻柤濮愬�楁稉宥夋煙閹咃紞闁哄棴绠戦埞鎴﹀磼濠婂海鍔稿銈庡亜閹虫﹢寮诲澶娢ㄩ柕澶堝劜濮ｆ劗绱撴担闈涘Ω闁稿酣娼ч～蹇曠磼濡顎撴繛鎾村嚬閸ㄩ亶寮鐐粹拺閻熸瑥瀚妵鐔访瑰鍛户闁告帗甯楃换婵嗩潩椤掑偆鍚呴梻浣瑰濞测晠骞忛悜鑺ョ厱闁靛鍎遍敓钘夋健瀵鈽夊Ο鍏兼畷闂佽法鍠嶇划娆忕暦閹达附鍊烽柛婵嗗閿涙盯姊洪幐搴ｇ畵闁瑰弶锕㈠顕�宕奸悢鍛婄彆闂備浇濮ら敋妞わ缚绮欏畷鐢碉拷锝庝憾濞撳鏌曢崼婵囧櫧缂佺姴鍟块埞鎴︽倻閸ャ劌顏堕梻鍌欑閹碱偊鎯屾径灞惧床婵犻潧妫涢弳锕傛⒑椤掞拷缁嬩線寮崶顒佺厽婵☆垵娅ｆ禒娑欑箾閸縿鍋㈡慨濠勭帛閹峰懘宕ㄦ繝鍐ㄥ壍闂備焦妞块崢濂杆囬崡鐐嶏綁骞囬弶鍨祮闂佺粯鏌х拃锕�霉閸曨垱鈷戦柟绋垮閳锋帡鏌涚�ｎ偅灏甸柨鐔诲Г绾板秴鐣濋幖浣歌摕闁绘棁娅ｇ壕鍏间繆椤栨繃顏犻柣鐔村妼椤啴濡舵惔鈥茬凹閻庣櫢鎷风紒瀣儥濞兼牜绱撴担鑲℃垶鍒婇幘顔界叄闊洦娲橀崵锟界紓浣诡殣缁绘繂顫忓ú顏呭仭闁绘鐗嗛弳鍫ユ⒑鐠団�虫灈闁稿﹥鎮傞幃楣冩倻閽樺鐤�闂佸搫顦锟犲极濠婂啠鏀介幒鎶藉磹瑜旈獮蹇涙倻閼恒儳鍙冮梺鍛婂姦娴滄粓寮稿☉銏＄厸鐎癸拷鐎ｎ剛袦閻庢鍣崳锝呯暦閹烘埈娼╅弶鍫厛閸氬洭姊婚崒娆掑厡闁硅櫕鎹囧畷鏌ュ蓟閵夈儱绨ラ梺鍝勮閸庨亶鎮￠垾鎰佺唵閻犲搫褰块崼銉ュ嚑閹兼惌婢�缁诲棙銇勯弽銊х煀閻㈩垵娉涢埞鎴︻敊閹稿寒浠╃紓浣介哺閹瑰洤鐣烽幒鎴旀瀻闁圭儤鍨电敮顖氣攽閻樻剚鍟忛柛鐘虫礈瀵板﹥绻濆顒傤啈濡炪倖鍔ч梽鍕煕閹达附鈷掗柛顐ゅ枔閳句線鏌熼崗鐓庡闁诡喗顨呴～婵嬫偂鎼达絼鍖栫紓鍌欑贰閸犳盯顢氳閸┿儲寰勯幇顒夋綂闂佺粯蓱閻楁捇宕濋幋锕�钃熼柕濞炬櫅閸楄櫕銇勮箛鎾村櫣妞ゅ繗鍩栨穱濠囨倷椤忓嫸鎷烽弴鐕佹闊洦绋戠粻顖炴煥閻曞倹瀚�
					else if (dstmoneytype == fire.pb.game.MoneyType.MoneyType_GoldCoin && this.dealHearthStone()) {
						newMoney = money * 100;
						ret = bag.addSysGold(newMoney, "1缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮枟閹告娊骞冨▎鎴炲珰鐟滃海锟芥艾缍婇弻娑㈩敃閿濆棛顦ㄩ梺鍝勬噺閹倿寮婚敃锟借灒濞撴凹鍨辩瑧闂備礁鎼Λ瀵稿緤妤ｅ啨锟藉啴濡烽埡鍌氾拷鐑芥煕濞嗗浚妲搁柡瀣Т椤啴濡堕崘銊т痪闂佹寧宀搁弻宥囨喆閸曨偆浼岄悗瑙勬礀閵堝憡鎱ㄩ敓浠嬫煏韫囧﹤澧查柣锔惧仱濮婂宕掑顒婃嫹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷鍝ョ不閺嶎厽鐓曟い鎰剁稻缁�锟界紒鍓у亾鐎笛呮崲濞戞﹩鍟呮い鏃囧吹閻╁海绱撴笟濠冨闂佸壊鍋嗛崰鎰板矗韫囨柧绻嗘い鏍ㄧ☉椤曟粎鐥鐐测挃闁汇儺浜獮鍡氼檨闁绘挸銈搁弻锛勪沪閸撗�妲堥梺浼欑稻缁诲牓寮幘瀵割浄閻庯綆浜為敍娑㈡⒑缂佹ê濮夐柛搴涘�濆畷鎴﹀磼閻愬鍘搁梺鎼炲劗閺呮盯寮搁崒姣懓顭ㄩ崟顓犵厜闂佸搫鐬奸崰鏍ь嚕閸洖鍨傛い鏇炴噺濞堣櫣绱撻崒娆戭槮妞ゆ垵鐗嗛悾鐑芥偨閸偒娼熼梺鍦劋椤ㄥ棝寮茬粙妫靛綊鎮╁顔煎壉闂佸搫鎳忛幃鍌炲蓟閿濆鏅查柛娑卞灣娴煎洨绱掗悙顒�绀冩俊顐㈠婵℃挳骞掗幋顓熷兊濡炪倖甯掗敃銉╁极妤ｅ啯鐓熼幖娣灱婢规绱撳鍜冨伐妞ゎ偄绻橀幖褰掑捶椤撶姷鍘梺鑽ゅУ娴滀粙宕濇惔銏狀嚤闁搞儺鍓氶埛鎴犵磼鐎ｎ偒鍎ラ柛搴㈠灴閺屾稓锟斤絻鍔岄敓鑺ョ箞閻涱噣宕橀鑲╀紜闂佸搫鍊堕崕鏌ユ倵婵犳碍鈷戦柛锔诲幖娴滅偓绻涢崗鑲╂噰闁轰焦鎹囬幃鍓т沪閻愵剚鐦撻梻浣告惈閻绱炴担瑙勫弿闁跨喍绮欓弻宥夋寠婢跺妫為梺鍝勬嚇娴滆泛顫忛搹鍦＜婵☆垵娅ｉ悷鏌ユ⒑缁嬪灝顒㈠┑鐐诧工閿曘垺绗熼敓钘夘潖閾忓湱纾兼俊顖氭禋娴滅偞绔熼弴銏╂晣闁靛繆锟藉啿澹掗梻浣告贡閸庛倝骞栭埡浣叉灁濞寸姴顑嗛悡鐔兼煙闁箑澧婚柛銈囧枎椤儻顧侀柛鎾存皑閹广垹鈽夐姀鈥充簵闁硅壈鎻徊鍧楊敊閹烘鈷戦悹鍥ｏ拷铏亶闂佽崵鍟块弲鐘诲Υ娴ｈ倽鏃堝川椤旇姤顏熷┑鐐差嚟婵挳顢栭幇鏉挎瀬闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�100闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃闁硅櫕鎹囬垾鏃堝礃椤忓孩瀚归柨婵嗙凹缁ㄥジ鏌熼惂鍝ョМ闁哄矉缍侀、姗�鎮欓幖顓燁棧闂傚倸娲らˇ鐢稿蓟閵娿儮鏀介柛鈩兠▍锝咁渻閵堝啫鍔氱紒缁橈耿瀵鈽夐姀鐘栄囨煕閳╁喚鐒芥い锔垮嵆濮婃椽宕崟顒佹嫳闂佺儵鏅╅崹鍫曞Υ娓氾拷瀵挳濮�閳╁啯鐝抽梻浣虹《閸撴繈鎮烽姣硷綁顢楅崟顑芥嫽婵炶揪缍�椤宕戦悩缁樼厱闁哄倽娉曢悞鍝ワ拷瑙勬礃閸旀瑥鐣风粙璇炬棃鏁撴禒瀣珔闁绘柨鍚嬮悡銉︾節闂堟稒锛嶆俊鎻掓啞閵囧嫰顢曢姀鈥虫畻闂佸搫鏈ú婵堢不濞戞瑧绡�闁稿本鍩冮幏銈嗙節濞堝灝娅欑紒鑼櫕閿熻姤纰嶅姗�锝炶箛鎾佹椽顢旈崟顐ょ崺濠电姷鏁告慨瀵革拷娑掓櫊閹箖鎮滈懞銉ワ拷鐢告煟瑜嶉幉锛勶拷姘秺濮婇缚銇愰幒鎿勭吹缂備緤鎷峰〒姘炬嫹闁归攱鍨块幃銏ゅ礂閼测晛甯惧┑鐘垫暩閸嬬喖宕戦幘鏂ユ瀺闁糕剝绋掗悡鏇㈡倵閿濆簼绨兼い銉ｅ灲閺岋紕浠﹂崜褋锟芥帒霉閻欏懐鐣电�规洘绮忛ˇ顔戒繆閹绘帞澧曟い顏勫暣婵″爼宕ㄧ�电妞介梻浣烘嚀閸ゆ牠骞忛敓锟�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuan, 0);						
						if (ret != 0) {
							ret = bag.addSysCurrency((long)(newMoney*fire.pb.fushi.Module.getCreditPointValue(fire.pb.fushi.Module.CREDITPOINT_IN_FS2GOLD))
									, MoneyType.MoneyType_EreditPoint, "1缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮枟閹告娊骞冨▎鎴炲珰鐟滃海锟芥艾缍婇弻娑㈩敃閿濆棛顦ㄩ梺鍝勬噺閹倿寮婚敃锟借灒濞撴凹鍨辩瑧闂備礁鎼Λ瀵稿緤妤ｅ啨锟藉啴濡烽埡鍌氾拷鐑芥煕濞嗗浚妲搁柡瀣Т椤啴濡堕崘銊т痪闂佹寧宀搁弻宥囨喆閸曨偆浼岄悗瑙勬礀閵堝憡鎱ㄩ敓浠嬫煏韫囧﹤澧查柣锔惧仱濮婂宕掑顒婃嫹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷鍝ョ不閺嶎厽鐓曟い鎰剁稻缁�锟界紒鍓у亾鐎笛呮崲濞戞﹩鍟呮い鏃囧吹閻╁海绱撴笟濠冨闂佸壊鍋嗛崰鎰板矗韫囨柧绻嗘い鏍ㄧ☉椤曟粎鐥鐐测挃闁汇儺浜獮鍡氼檨闁绘挸銈搁弻锛勪沪閸撗�妲堥梺浼欑稻缁诲牓寮幘瀵割浄閻庯綆浜為敍娑㈡⒑缂佹ê濮夐柛搴涘�濆畷鎴﹀磼閻愬鍘搁梺鎼炲劗閺呮盯寮搁崒姣懓顭ㄩ崟顓犵厜闂佸搫鐬奸崰鏍ь嚕閸洖鍨傛い鏇炴噺濞堣櫣绱撻崒娆戭槮妞ゆ垵鐗嗛悾鐑芥偨閸偒娼熼梺鍦劋椤ㄥ棝寮茬粙妫靛綊鎮╁顔煎壉闂佸搫鎳忛幃鍌炲蓟閿濆鏅查柛娑卞灣娴煎洨绱掗悙顒�绀冩俊顐㈠婵℃挳骞掗幋顓熷兊濡炪倖甯掗敃銉╁极妤ｅ啯鐓熼幖娣灱婢规绱撳鍜冨伐妞ゎ偄绻橀幖褰掑捶椤撶姷鍘梺鑽ゅУ娴滀粙宕濇惔銏狀嚤闁搞儺鍓氶埛鎴犵磼鐎ｎ偒鍎ラ柛搴㈠灴閺屾稓锟斤絻鍔岄敓鑺ョ箞閻涱噣宕橀鑲╀紜闂佸搫鍊堕崕鏌ユ倵婵犳碍鈷戦柛锔诲幖娴滅偓绻涢崗鑲╂噰闁轰焦鎹囬幃鍓т沪閻愵剚鐦撻梻浣告惈閻绱炴担瑙勫弿闁跨喍绮欓弻宥夋寠婢跺妫為梺鍝勬嚇娴滆泛顫忛搹鍦＜婵☆垵娅ｉ悷鏌ユ⒑缁嬪灝顒㈠┑鐐诧工閿曘垺绗熼敓钘夘潖閾忓湱纾兼俊顖氭禋娴滅偞绔熼弴銏╂晣闁靛繆锟藉啿澹掗梻浣告贡閸庛倝骞栭埡浣叉灁濞寸姴顑嗛悡鐔兼煙闁箑澧婚柛銈囧枎椤儻顧侀柛鎾存皑閹广垹鈽夐姀鈥充簵闁硅壈鎻徊鍧楊敊閹烘鈷戦悹鍥ｏ拷铏亶闂佽崵鍟块弲鐘诲Υ娴ｈ倽鏃堝川椤旇姤顏熷┑鐐差嚟婵挳顢栭幇鏉挎瀬闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�100闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃闁硅櫕鎹囬垾鏃堝礃椤忓孩瀚归柨婵嗙凹缁ㄥジ鏌熼惂鍝ョМ闁哄矉缍侀、姗�鎮欓幖顓燁棧闂傚倸娲らˇ鐢稿蓟閵娿儮鏀介柛鈩兠▍锝咁渻閵堝啫鍔氱紒缁橈耿瀵鈽夐姀鐘栄囨煕閳╁喚鐒芥い锔垮嵆濮婃椽宕崟顒佹嫳闂佺儵鏅╅崹鍫曞Υ娓氾拷瀵挳濮�閳╁啯鐝抽梻浣虹《閸撴繈鎮烽姣硷綁顢楅崟顑芥嫽婵炶揪缍�椤宕戦悩缁樼厱闁哄倽娉曢悞鍝ワ拷瑙勬礃閸旀瑥鐣风粙璇炬棃鏁撴禒瀣珔闁绘柨鍚嬮悡銉︾節闂堟稒锛嶆俊鎻掓啞閵囧嫰顢曢姀鈥虫畻闂佸搫鏈ú婵堢不濞戞瑧绡�闁稿本鍩冮幏銈嗙節濞堝灝娅欑紒鑼櫕閿熻姤纰嶅姗�锝炶箛鎾佹椽顢旈崟顐ょ崺濠电姷鏁告慨瀵革拷娑掓櫊閹箖鎮滈懞銉ワ拷鐢告煟瑜嶉幉锛勶拷姘秺濮婇缚銇愰幒鎿勭吹缂備緤鎷峰〒姘炬嫹闁归攱鍨块幃銏ゅ礂閼测晛甯惧┑鐘垫暩閸嬬喖宕戦幘鏂ユ瀺闁糕剝绋掗悡鏇㈡倵閿濆簼绨兼い銉ｅ灲閺岋紕浠﹂崜褋锟芥帒霉閻欏懐鐣电�规洘绮忛ˇ顔戒繆閹绘帞澧曟い顏勫暣婵″爼宕ㄧ�电妞介梻浣烘嚀閸ゆ牠骞忛敓锟�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuan, 0);
							fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 160403, java.util.Arrays.asList(Integer.toString(money), Integer.toString(newMoney)));
						}
					}
				}
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃闁硅櫕鎹囬垾鏃堝礃椤忓孩瀚归柨婵嗙凹缁ㄥジ鏌熼惂鍝ョМ闁哄矉缍侀、姗�鎮欓幖顓燁棧闂傚倸娲らˇ鐢稿蓟閵娿儮鏀介柛鈩兠▍锝咁渻閵堝啫鍔氱紒缁橈耿瀵鈽夐姀鐘栄囨煕閳╁喚鐒芥い锔垮嵆濮婃椽宕崟顒佹嫳闂佺儵鏅╅崹鍫曞Υ娓氾拷瀵挳濮�閳╁啯鐝抽梻浣虹《閸撴繈鎮烽姣硷綁顢楅崟顑芥嫽婵炶揪缍�椤宕戦悩缁樼厱闁哄倽娉曢悞鍝ワ拷瑙勬礃閸旀瑥鐣风粙璇炬棃鏁撴禒瀣珔闁绘柨鍚嬮悡銉︾節闂堟稒锛嶆俊鎻掓啞閵囧嫰顢曢姀鈥虫畻闂佸搫鏈ú婵堢不濞戞瑧绡�闁稿本鍩冮幏銈嗙節濞堝灝娅欑紒鑼櫕閿熻姤纰嶅姗�锝炶箛鎾佹椽顢旈崟顐ょ崺濠电姷鏁告慨瀵革拷娑掓櫊閹箖鎮滈懞銉ワ拷鐢告煟瑜嶉幉锛勶拷姘秺濮婇缚銇愰幒鎿勭吹缂備緤鎷峰〒姘炬嫹闁归攱鍨块幃銏ゅ礂閼测晛寮虫繝鐢靛█濞佳兾涢鐐嶏綁宕ㄦ繛澶哥盎濡炪倖鍔戦崹娲吹閸ヮ剚鐓涢悘鐐靛亾缁�澶岀磼閻樺磭鈾佺紒缁樼箞瀹曟﹢鍩￠崘銊ф偧闂傚倸鍊风粈渚�骞夐敓鐘茶摕闁靛ň鏅涚粻鐑樼節婵犲倹鍣烘い顐ｆ礋閺岀喖骞嗚閸ょ喖鏌ｉ悢鐑樺殌闁宠鍨块幃鈺呭箵閹烘挻顔勬俊鐐�曠换鎰版偉閻撳寒娼栫紓浣股戞刊鏉戙�掑鐓庣仯闁告梹鎮傚鍝劽虹拠鎻掝潻闂侀潧鐗忛…鍫ユ偩閻戣棄绠ｉ柨鏃囨閿熺晫鍏橀弻锝夊箣閻忔椿浜濈粋宥呂旈敓浠嬪煘閹达附鍊烽柛娆忣樈濡繝姊洪崷顓х劸妞ゎ厼鍢查悾鐑藉箛閻楀牆浠洪梺鍛婄☉閿曪箓宕㈡禒瀣拺闂傚牊绋撶粻姘繆閹绘帗鍤囩�规洦鍨电粻娑樷槈濞嗘垵骞楅梻浣告贡閸庛倝骞愰幖浣哥闁靛牆顦伴ˉ鍡楊熆閼搁潧濮堥柣鎾跺枑娣囧﹪顢涘┑鍥朵哗闂佹寧绋戠粔褰掑蓟閿濆鏁囬柣鏃堫棑閻熸彃顪冮妶鍐ㄥΩ闁稿海鏁婚獮鍐ㄢ枎閹搭垱瀚归柣銏☆問閻掔偓銇勯搴″暊閺�浠嬫煟閹扮増娑ч悽顖氬缁辨帞绱掑鍫ｏ拷鎸庮殽閻愭彃鏆欓柍璇查叄楠炴瑩宕橀埡鍌涚彍闂傚倷娴囧▔鏇㈠窗瀹ュ洤鍨濇繛鍡樻尪閿熸垝绶氬顕�宕奸悢鍛婎仧闂備浇娉曢崳锕傚箯閿燂拷
				else if (srcmoneytype == fire.pb.game.MoneyType.MoneyType_GoldCoin && this.dealGold()) {
					newMoney = money * 100;
					ret = bag.addSysMoney(newMoney, "1闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃闁硅櫕鎹囬垾鏃堝礃椤忓孩瀚归柨婵嗙凹缁ㄥジ鏌熼惂鍝ョМ闁哄矉缍侀、姗�鎮欓幖顓燁棧闂傚倸娲らˇ鐢稿蓟閵娿儮鏀介柛鈩兠▍锝咁渻閵堝啫鍔氱紒缁橈耿瀵鈽夐姀鐘栄囨煕閳╁喚鐒芥い锔垮嵆濮婃椽宕崟顒佹嫳闂佺儵鏅╅崹鍫曞Υ娓氾拷瀵挳濮�閳╁啯鐝抽梻浣虹《閸撴繈鎮烽姣硷綁顢楅崟顑芥嫽婵炶揪缍�椤宕戦悩缁樼厱闁哄倽娉曢悞鍝ワ拷瑙勬礃閸旀瑥鐣风粙璇炬棃鏁撴禒瀣珔闁绘柨鍚嬮悡銉︾節闂堟稒锛嶆俊鎻掓啞閵囧嫰顢曢姀鈥虫畻闂佸搫鏈ú婵堢不濞戞瑧绡�闁稿本鍩冮幏銈嗙節濞堝灝娅欑紒鑼櫕閿熻姤纰嶅姗�锝炶箛鎾佹椽顢旈崟顐ょ崺濠电姷鏁告慨瀵革拷娑掓櫊閹箖鎮滈懞銉ワ拷鐢告煟瑜嶉幉锛勶拷姘秺濮婇缚銇愰幒鎿勭吹缂備緤鎷峰〒姘炬嫹闁归攱鍨块幃銏ゅ礂閼测晛寮虫繝鐢靛█濞佳兾涢鐐嶏綁宕ㄦ繛澶哥盎濡炪倖鍔戦崹娲吹閸ヮ剚鐓涢悘鐐靛亾缁�澶岀磼閻樺磭鈾佺紒缁樼箞瀹曟﹢鍩￠崘銊ф偧闂傚倸鍊风粈渚�骞夐敓鐘茶摕闁靛ň鏅涚粻鐑樼節婵犲倹鍣烘い顐ｆ礋閺岀喖骞嗚閸ょ喖鏌ｉ悢鐑樺殌闁宠鍨块幃鈺呭箵閹烘挻顔勬俊鐐�曠换鎰版偉閻撳寒娼栫紓浣股戞刊鏉戙�掑鐓庣仯闁告梹鎮傚鍝劽虹拠鎻掝潻闂侀潧鐗忛…鍫ユ偩閻戣棄绠ｉ柨鏃囨閿熺晫鍏橀弻锝夊箣閻忔椿浜濈粋宥呂旈敓浠嬪煘閹达附鍊烽柛娆忣樈濡繝姊洪崷顓х劸妞ゎ厼鍢查悾鐑藉箛閻楀牆浠洪梺鍛婄☉閿曪箓宕㈡禒瀣拺闂傚牊绋撶粻姘繆閹绘帗鍤囩�规洦鍨电粻娑樷槈濞嗘垵骞楅梻浣告贡閸庛倝骞愰幖浣哥闁靛牆顦伴ˉ鍡楊熆閼搁潧濮堥柣鎾跺枑娣囧﹪顢涘┑鍥朵哗闂佹寧绋戠粔褰掑蓟閿濆鏁囬柣鏃堫棑閻熸彃顪冮妶鍐ㄥΩ闁稿海鏁婚獮鍐ㄢ枎閹搭垱瀚归柣銏☆問閻掔偓銇勯搴″暊閺�浠嬫煟閹扮増娑ч悽顖氬缁辨帞绱掑鍫ｏ拷鎸庮殽閻愭彃鏆欓柍璇查叄楠炴瑩宕橀埡鍌涚彍闂傚倷娴囧▔鏇㈠窗瀹ュ洤鍨濇繛鍡樻尪閿熸垝绶氬顕�宕奸悢鍛婎仧闂備浇娉曢崳锕傚箯閿燂拷100闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮枟閹告娊銆侀弮鍫濆窛妞ゆ挆鍌滃闂傚倸鍊搁崐宄邦渻閹烘梹顫曟い鏃�鍎崇欢銈吤归悩宸剰閹兼潙锕弻銈夋偂鎼粹槅鏆㈡繛瀛樼矆缁瑥顫忓ú顏呭殥闁靛牆鎳嶅▽顏嗙磽娴ｅ壊鍎忛柣妤佹尭閻ｅ嘲顭ㄩ崘锝嗘杸闁诲函缍嗛崑鍕晸閽樺鍩ｉ柡灞剧洴楠炲洭鍩℃担鑲濄劑姊洪悮瀛樺婵炲濮撮鍡涙偂閻斿吋鐓欓梺顓ㄧ畱楠炴绱撳鍡楃伌闁哄矉缍�缁犳盯濡烽埡鍌わ拷宥夋⒑闁稓鈹掗柛鏂跨焷閻忔帞绱撴担鍓插剰闁诲繑绻堥敐鐐哄炊椤掍礁锟界敻鎮峰▎蹇擃仾缁惧墽鏁婚弻銊╂偄鐠囨畫鎾绘煕閹剧澹樻い顓炴喘閸╋繝宕ㄩ鎯у箻闂備礁鎲＄缓鍧楀磿閺屻儱姹查柍鍝勬噺閻撴洘绻涢崱妤冪妞ゃ儯鍨洪幈銊︾節閸涱噮浠╃紓浣介哺鐢帟鐏掗梺鐓庮潟閸娿倕危椤掑嫭鈷掑ù锝勮閻掗箖鏌ㄩ弴妯猴拷鏇㈡晝閵忋倖鐒肩�广儱妫欏▍銏ゆ⒑閸忛棿鑸柛搴㈠▕瀹曨垶寮婚妷锔惧幍闂佸憡鍨崐鏍拷姘炬嫹", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuan, 0);
					if (ret != 0) {
						fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 160404, java.util.Arrays.asList(Integer.toString(money), Integer.toString(newMoney)));
					}
				}
				
				return ret == 0 ? false : true ;
			}
			
			
			/**
			 * 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮枟閹告娊骞冨▎鎴炲珰鐟滃海锟芥艾缍婇弻娑㈩敃閿濆棛顦ㄩ梺鍝勬噺閹倿寮婚敃锟借灒濞撴凹鍨辩瑧闂備礁鎼Λ瀵稿緤妤ｅ啨锟藉啴濡烽埡鍌氾拷鐑芥煕濞嗗浚妲搁柡瀣Т椤啴濡堕崘銊т痪闂佹寧宀搁弻宥囨喆閸曨偆浼岄悗瑙勬礀閵堝憡鎱ㄩ敓浠嬫煏韫囧﹤澧查柣锔惧仱濮婂宕掑顒婃嫹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷鍝ョ不閺嶎厽鐓曟い鎰剁稻缁�锟界紒鍓у亾鐎笛呮崲濞戞﹩鍟呮い鏃囧吹閻╁海绱撴笟濠冨闂佸壊鍋嗛崰鎰板矗韫囨柧绻嗘い鏍ㄧ☉椤曟粎鐥鐐测挃闁汇儺浜獮鍡氼檨闁绘挸銈搁弻锛勪沪閸撗�妲堥梺浼欑稻缁诲牓寮幘瀵割浄閻庯綆浜為敍娑㈡⒑缂佹ê濮囬柟纰卞亞婢规洘绻濆顓犲弳濠电娀娼уΛ顓炍ｉ崫銉х＜闁绘瑦鐟ュú锕傛偂閻斿吋鐓欓梺顓ㄧ畱楠炴绱撳鍡楃仸闁靛洤瀚版俊鐑藉Ψ椤旂厧澹嬬紓鍌欐祰妞村摜鏁Δ锟介銉╁礋椤掑倻鐦堥梺鍛婂姂閸斿菐椤曪拷濮婄粯鎷呴崨濠冨創闁荤偞鍑归崑濠傜暦濠靛绠ｉ柨鏇嫹缂佺姵鐗犻弻鏇㈠醇濠垫劖笑缂佺偓鍎抽崥瀣崲濞戙垹绠ｉ柣鎴濇矗缁跺灚绻涚�垫悶锟藉骞忛敓锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ剙浠遍柟顔ㄥ洦鍋愭慨鐟版祫閹烽攱绗熼敓钘夘嚕閹绢喖顫呴柣妯荤垹閸ャ劎鍘遍梺鏂ユ櫅閸熴劍绂掗敂鍓х＜妞ゆ梻鎳撴晶鎻捛庨崶褝韬柟顔界懇椤㈡棃宕熼懜闈涱伓闂佸搫绋侀崢鑲╃矆婢跺本鍠愰煫鍥ㄦ礀閸ㄦ繂鈹戦悩瀹犲缂佺媴缍侀弻锝呂熼悜妯锋灆濠碘槅鍋呯划鎾愁潖閾忓湱鐭撻柛鈩冾殔椤忓瓨绻涢崼鐔哥闁哄苯绉归弻銊э拷锝庝簽娴犳悂姊洪棃娑欐悙閻庢矮鍗抽悰顕�骞掑Δ浣革拷鐑芥煛婢跺鐒惧ù鍏兼尵缁辨捇宕掑顒婃嫹妞嬪海鐭嗗〒姘炬嫹閽樻繈姊洪锟界粔鎾几娓氾拷閹綊宕堕鍕闂佸搫妫寸粻鎾诲蓟閿濆顫呴柕蹇婃櫇閸斿摜绱撴担鍝勑ｉ柣鈺婂灦瀵鏁愰崨鍌涙閺佹挻绂掔�ｎ偄浜遍棅顐㈡处缁嬫垿宕掗妸銉冨綊鎮╁顔煎壉闂佹娊鏀遍崹鍧楀蓟濞戞ǚ鏀介柛鈩冾殢娴犲ジ姊洪崫鍕棡闁荤啿鏅犲璇测槈濞嗘垹鐦堥梺绋挎湰缁嬫帡宕伴幇鐗堚拺閺夌偞澹嗙拹浼存煕閿濆繒鍒伴柣锝呭槻椤劑宕熼锟介鎾绘⒑閹呯婵炲懌鍨诲Σ鎰板蓟閵夛腹鎷绘繛杈剧秬濞咃絿鏁☉銏＄叆闁哄洦顨嗗▍濠勶拷瑙勬磻閸楀啿顕ｆ禒瀣垫晣闁绘劖顔栧Σ鐑芥⒒娴ｇ懓顕滄繛鍙夌墵瀹曟劘銇愰幒鎾充簵濠电偞鍨崹娲磹閸洘鐓熼柟浼村亰閺夋椽鏌涢妶鍡欐噧闁宠鍨块崹楣冩倷閽樺鍒掗梻浣告惈閼活垳绮旈崼鏇炵疅闁圭虎鍠栫粈瀣亜閹扳晛锟芥挾妲愬┑瀣厽閹兼番鍊ゅ鎰箾閼碱剙鏋戠紒鍌氱Ч瀹曞ジ寮撮悙瀛樞氶梻浣芥硶閸犳挻鎱ㄧ�电顥氬┑鍌氭啞閻撴洟鎮橀悙鑸殿棄闁哄棙鐟︾换娑氭嫚瑜忛悾鐢告煕閳哄倻娲存鐐差儔閹晠鎮界喊澶岄棷婵犵數鍋犻幓顏嗙礊閿熻姤銇勯弴鐔哄⒌闁诡喚鍋ら幃鎯х暆閿熺晫澹曟總鍛婄厽婵☆垰鎼懜鍦拷瑙勬尭濡繈寮婚垾宕囨殕闁跨喍绮欏畷浼村冀瑜忛弳锔界箾閸℃ɑ灏崶鎾⒑缁洖澧叉い銊ョ箲鐎靛ジ鏁撻敓锟�
			 * @return true ok
			 */
			public boolean dealHearthStone() {
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繐鐖奸弻锝嗘償閵堝孩缍堝┑鐐村絻缁绘ê鐣烽弴銏犵闁兼亽鍎插▍銏ゆ⒑閸濆嫬锟藉爼宕愬Δ鍐煋闁汇垹鎲￠悡鏇㈡煟濡櫣锛嶅褍宕…璺ㄦ喆閸曨剛顦伴悗瑙勬礈椤牐鐏冩繛杈剧到閹碱偊鐛澶嬧拻濞达絿鐡旈崵鍐煕閵娿劍鐝柡鍛版硾铻栭柛姘虫椤︽澘顕ラ崟顖氱疀妞ゆ帒鍋嗛崯鍥⒒娴ｅ憡鎯堟い锔垮嵆瀹曠儤绻濋崶鈺佸絾濡炪倖甯掔�氼參鎮″☉銏″�堕柣鎰邦杺閸ゆ瑩鏌ㄩ悢璇残撶紒璇茬墦閻涱喗绻濋崒妤佹杸闁诲函缍嗘禍鐐侯敇閻撳寒娓婚柕鍫濇椤ュ棝鏌涚�ｎ偄濮堥柡鍛埣椤㈡稑顫濋敐鍡樻澑闂備胶绮崝妯间焊濞嗘挸绠洪柣妯兼暩绾惧吋銇勯弮鍥т汗闁诲繗浜槐鎺撴綇閳轰椒娌紓浣虹帛缁诲牆鐣烽幆閭︽▉闂佺濮ゅú鏍煘閹达附鍊烽柡澶嬪灩娴犙囨⒑閹肩偛濡块柟铏崌瀵偊顢氶敓钘夘潖缂佹鐟归柨鐔绘椤洩顦撮柟骞垮灲瀹曞崬鈽夊Ο纰辨Ф婵犵數濞�濞佳囶敄閸℃稑纾婚柣鏂垮悑閻撴稓锟藉箍鍎辨鍛婄閻愮數妫柟瑙勫姈椤ュ妫佹径鎰叆婵犻潧妫欓崳娲煙椤栨氨澧︾�殿喕绮欓崹楣冨棘閵夛附鏉搁梻浣哥枃濡嫬螞濡や胶顩叉繝濠傜墛閻撴洟鏌ｉ弬鎸庡暈缂傚秵鍨堕妵鍕即椤忓棛蓱缂備胶绮换鍌烇綖濠靛鏁勯柍鍦亾濞呭﹪鏌＄仦鐣屝ｆ繛纰变邯楠炲秹顢欓悡搴�村┑锛勫亼閸婃垿宕曢懠顒佸床闁割偅绻嶅鏍ㄧ箾瀹割喕绨荤紒锟介崼銉︾厾缁炬澘宕晶顕�鎮介妯哄姦婵﹥妞藉畷顐﹀Ψ閵夋劧缍侀幃浠嬵敍閵堝洨鐦堥梺缁樹緱閸ｏ綁鐛崶顒�绾ч悹渚厛濡茬増淇婇悙顏勶拷鏍涙担绛嬫毎闂備礁缍婇弨鍗烆渻閽樺娼栨繛宸簻瀹告繂鈹戦悩鎻掝仱婵℃彃鐗撳娲箰鎼淬垻鈹涚紓浣哄У閹瑰洭鎮伴鐣岀瘈闁搞儜鍐ㄧギ闂備線娼ф蹇曟閺囥垹鍌ㄩ柣銏犳啞閳锋垿鏌涘☉姗堝伐闁诲繒鍠栭弻娑欑節閸愵亜鈷堥梺璺ㄥ枙婵倝鎮㈤鍕闁跨噦鎷�
				if (fire.pb.fushi.Module.getIsYYBUser(userid)) {
					return fire.pb.fushi.FushiManager.subFushiFromUser(userid, roleid, money, 0, 0,
							fire.pb.fushi.FushiConst.REASON_SUB_EXCHANGE_CURRENCY, YYLoggerTuJingEnum.tujing_Value_huobiduihuancost, true);
				}
				else {
					xbean.YbNums ybNums = xtable.Fushinum.get(userid);
					if (ybNums == null) {
						return false;
					}
					xbean.YbNum ybNum = ybNums.getRoleyb().get(roleid);
					if (ybNum == null) {
						return false;
					}
					if (ybNum.getNum() < 0 || ybNum.getSysnum() < 0) {
						return false;
					}

					return fire.pb.fushi.FushiManager.subFushiFromUser(userid, roleid, money, 0, 0,
							fire.pb.fushi.FushiConst.REASON_SUB_EXCHANGE_CURRENCY, YYLoggerTuJingEnum.tujing_Value_huobiduihuancost, true);
				}
			}
			
			/**
			 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂傚洤顦甸弻銊モ攽閸♀晜效婵炲瓨鍤庨崐婵嬪蓟閵堝绾ч柟绋块娴犳潙鈹戦纭锋敾婵＄偘绮欓妴浣肝旈崨顔芥闂佷紮绲介惉濂告儗閹剧粯鐓涢悘鐐额嚙閸旀粓鏌￠崨顔藉�愰柡宀嬬畱铻ｅ〒姘煎灡绗戦梻浣芥硶閸犳洖螞閸曨偒鐒介柨鐔哄Т杩濇繛杈剧悼绾爼寮告惔銊︾厵闁诡垎鍜冪礊濡炪倧瀵岄崣鍐箖瀹勯偊鐓ラ柛鎰典簽椤旀帡鏌﹀Ο鑽ょ畺闁靛洤瀚板浠嬪Ω瑜嬮敓鑺ュ笧缁辨帡鎮╅懡銈囨毇閻庢鍠栭悥鐓庣暦閻撳簶鏀介柛鈥崇箲鐎垫牠姊绘担绛嬪殐闁哥姵鐩畷鎴﹀箛閻楀牆鍓﹀銈呯箰閻楁粓寮崶顒佺厽闁规壆澧楀☉褔鏌ｉ幘璺烘灈闁诡喗顨呴埢鎾诲垂椤旂晫浜炬俊鐐�ら崢濂告偋閹炬眹锟戒礁顫滈敓钘夌暦濡ゅ懏鍋傞幖杈剧悼閻涱喖鈹戦悩鍨毄濠殿喖顕敓鑺ユ皑閸忔ê鐣烽鐐茬倞闁靛ě鍛闂備焦鐪归崹钘夘焽瑜斿畷婊冪暦閸モ晝锛濋悗骞垮劚閹冲繘藟閵忣澁鎷风憴鍕缂侇喖鐭傞崺銏℃償閵娿儳鐤�濡炪倕绻愬Λ娑㈡偩閹�鏀介柣鎰▕閸ょ喎鈹戦鑺ュ唉妞ゃ垺鐗犲畷鍗炩槈濞嗗繋绨甸梻浣虹帛閺屻劑宕ョ�ｎ喗鍋傛繛鍡樻尰閻撴瑦銇勯弽褎顥滈柛鐕佸灠琚欓柟鎵閳锋垿鎮归幁鎺戝闁哄鐟︽穱濠囶敃閵忕媭浠煎銈庡幖濞差參宕规ィ鍐ㄧ疀濞达絽鎲￠鍨攽閻樺灚鏆╁┑顔炬暩閸犲﹤顓兼径濠勶紱闂佸憡娲﹂崹閬嶆偂閻斿憡鍙忔慨妤�妫楁晶浼存煙閻ｅ苯鈻堥柟顔筋殔椤繈骞囨担鍦Х缂傚倷鑳剁划顖炴儎椤栫偟宓侀悗锝庡枟閸婄兘鏌涢…鎴濅簻婵炲憞鍥ㄢ拻濞达綀娅ｇ敮娑㈡偨椤栨粌浠辩�殿喗鐓￠、鏇㈠Χ閸♀晜缍楅梻浣告贡閸庛倝銆冮崱娑樼；闁规壆澧楅悡娆撴倵濞戞顏呮叏閸儲鐓曢柕濠忕畱椤曟粌菐閸パ嶈含闁诡喚鏅划娆戞崉椤垶效濠碉紕鍋戦崐鏍蓟閵婏附娅犲ù鐘差儏缁狙囨煙闂傚鍔嶉柍閿嬪灴濮婂宕奸悢鍓佺箒濠碉紕瀚忛崨顖滐紲闂佺粯锚閸熷潡鎮樼�涙ǜ浜滈柕蹇婂墲椤ュ牓鏌℃担瑙勫磳闁轰焦鎹囬弫鎾绘晸閿燂拷
			 * @return true ok
			 */
			public boolean dealGold() {
				fire.pb.item.Pack bag = new fire.pb.item.Pack(roleid, false);
				long ret = bag.subGold(-money, "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞堟俊鐐�ら崢浠嬪垂閸偆顩叉繝闈涱儐閻撴洘绻涢崱妤冪缂佺姴顭烽弻鈥崇暆鐎ｎ剛袦婵犳鍣幏鐑芥⒑闂堟稓绠氶柡鍛箞瀹曟繈宕妷褏锛濇繛鎾磋壘閿曘儳锟芥艾缍婂娲礈閹绘帊绨介梺鍝ュТ濡瑧绮嬪鍜佺叆闁割偆鍠撻崢鐢告⒑缂佹ê鐏﹂柨姘舵煟韫囧鍔滈柕鍥у缁犳稒绻濋崘鈺冨絿缂傚倷娴囨ご鍝ユ暜閿熺姴鏋侀柟鎯ь嚟椤╃兘鎮楅敐搴濈敖妞わ负鍔戝鍝勭暦閸ャ劌娈岄梺闈涙处椤洭鎳炴潏銊х瘈婵﹩鍙庡Λ鍛渻閵堝棗濮傞柛銊у劋瀵板嫰宕熼娑氬幍闂佸憡绋戦敃銈夊礉閵堝鐓熸い顓熷灥婢ф壆绱掓潏銊﹀磳鐎规洘甯掗埢搴ㄥ箛椤斿搫浠掓繝纰夌磿閸嬫盯鎮洪妸鈺佺畺闁稿瞼鍋涚粻鏍煟閹达絾顥夐柣鎾寸☉閵嗘帒顫濋浣割槱缂傚倸绉村ù椋庢閹捐纾兼繛鍡樺灥婵′粙鏌﹂崘銊ヨ埞闁宠鍨块、娑樷槈濞嗘垹鈻忛梻渚�娼уΛ娆戞暜閹烘缍栨繝闈涱儐閸嬪倿骞栨潏鍓у闁告牗鐗犲缁樻媴閸涘﹤鏆堥梺鍝勮閸旀垿鐛Δ锟介…銊╁川椤曞懏缍楅梻浣筋潐閸庢娊鎮洪妸锕�鍨旈柟缁㈠枟閻擄綁鐓崶銊︾闁搞倧鎷风紓鍌欑劍椤ㄦ劗鎹㈠┑鍡╂綎婵炲樊浜滅粻褰掓煟閹邦厼绲绘い顒�鐗撳铏规嫚閼碱剛顔夌紓浣筋嚙閻楁捇鐛崘鈹垮亝闁告劏鏅涢敓钘夘煼閺岋箑螣娓氼垱效閻庤鎸哥粔鎾�旈崘顔嘉ч柛鈩兠弳妤呮⒑閸濄儱孝婵炴挳鏀辩粩鐔煎即閵忊晜鏅梺缁樺姉鐞涖儵骞忓ú顏呪拺閻犲洠锟藉磭锟藉鏌涘☉鍗炵伇闁哥喎鐗婃穱濠囨倷椤忓嫸鎷烽妶澶婄；闁告洦鍨侀崶顒夋晬闁绘劘灏欓崢娲⒑閸︻厼浜鹃柣锝庝邯瀹曟垿宕ㄧ�涙鍘遍梺纭呭焽閸斿秹寮惰ぐ鎺撶厵闂佸灝顑嗛妵婵嬫煛瀹�瀣М闁诡喒鏅犲畷妤呭川閺夎法鍔甸梻鍌欑閹诧繝寮婚妸鈺傚殣妞ゆ牜鍋涢悡婵堬拷骞垮劚椤︻垳绮诲☉銏＄厽婵°倧鎷烽柣妤�绻樺畷銏ゆ偨閸涘ň鎷洪梺鍛婄☉閿曘倝鎮橀悢鍏肩厱濠电姴鍟版晶閬嶆煥閻旇袚闁绘棏鍓熼獮蹇涙晸閿燂拷", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuancost, 0);
				return ret == 0 ? false : true ;
			}
			
			
		}.submit();
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810653;

	public int getType() {
		return 810653;
	}

	public int srcmoneytype; // 源类型 参考game.xml中MoneyType
	public int dstmoneytype; // 目标类型 参考game.xml中MoneyType
	public int money; // 数量

	public CExchangeCurrency() {
	}

	public CExchangeCurrency(int _srcmoneytype_, int _dstmoneytype_, int _money_) {
		this.srcmoneytype = _srcmoneytype_;
		this.dstmoneytype = _dstmoneytype_;
		this.money = _money_;
	}

	public final boolean _validator_() {
		if (srcmoneytype < 1 || srcmoneytype > 10) return false;
		if (dstmoneytype < 1 || dstmoneytype > 10) return false;
		if (money < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(srcmoneytype);
		_os_.marshal(dstmoneytype);
		_os_.marshal(money);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		srcmoneytype = _os_.unmarshal_int();
		dstmoneytype = _os_.unmarshal_int();
		money = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CExchangeCurrency) {
			CExchangeCurrency _o_ = (CExchangeCurrency)_o1_;
			if (srcmoneytype != _o_.srcmoneytype) return false;
			if (dstmoneytype != _o_.dstmoneytype) return false;
			if (money != _o_.money) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += srcmoneytype;
		_h_ += dstmoneytype;
		_h_ += money;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(srcmoneytype).append(",");
		_sb_.append(dstmoneytype).append(",");
		_sb_.append(money).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CExchangeCurrency _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = srcmoneytype - _o_.srcmoneytype;
		if (0 != _c_) return _c_;
		_c_ = dstmoneytype - _o_.dstmoneytype;
		if (0 != _c_) return _c_;
		_c_ = money - _o_.money;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

