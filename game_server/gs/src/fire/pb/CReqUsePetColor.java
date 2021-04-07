
package fire.pb;

import java.util.Map;

import org.apache.log4j.Logger;

import xbean.PetInfo;
import fire.pb.item.BagTypes;
import fire.pb.item.ItemMaps;
import fire.pb.item.Module;
import fire.pb.main.ConfigManager;
import fire.pb.pet.PetAttr;
import fire.pb.pet.PetColumn;
import fire.pb.pet.PetColumnTypes;
import fire.pb.pet.PetTypeEnum;
import fire.pb.pet.SRefreshPetInfo;
import fire.pb.role.SRoleRColorConfig;
import mkdb.Procedure;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqUsePetColor__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqUsePetColor extends __CReqUsePetColor__ {
	public static final Logger logger = Logger.getLogger("SYSTEM");
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				xbean.Properties prop=xtable.Properties.get(roleid);
				if(prop==null){
					return false;
				}
				Map<Integer, SRoleRColorConfig> sRoleRColorConfig = ConfigManager.getInstance().getConf(SRoleRColorConfig.class);
				if(sRoleRColorConfig==null){
					logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕鍏肩節婵犲倹濯奸柛搴嫹 "+roleid+"闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫锟芥艾顦伴妵鍕箳閹存繍浠肩紓浣哄У瑜板啴婀侀梺鎸庣箓閹冲繒鎷归敓鐘崇厽婵犻潧妫涢崺锝夋煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�"+"\t闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊瑜滃ù鏍煏婵炵偓娅嗛柛銈呭閺屻倗绮欑捄銊ょ驳濠电偛鎳愭慨鍨┍婵犲洤围闊洦鏌ㄩ鍫曟⒒娴ｉ涓茬紒韫矙閹ê顫濇潏鈺冪暥闂佺粯鏌ㄩ崥瀣疾缁嬫５褰掓偐瀹割喖鍓伴梺钘夊暟閸犳牠寮婚弴鐔虹闁割煈鍠栨慨澶愭⒑閸濆嫷鍎忛梺甯秮瀵鎮㈤崗鐓庯拷缁樹繆椤栨繂浜归柣锝夋涧閳规垿鎮欓懠顒�鈷婇梺鐟板殩閹凤拷");
					return false;
				}
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔芥祰闂傚倷鐒﹂幃鍫曞磹閺囩媴鎷峰顐㈠祮妤犵偛鍟～婊堟晸娴犲绠栨繛鍡樻尰閸ゅ绻涢崼鐔奉嚋妞ゃ儱顦靛缁樻媴妞嬪簼瑕嗙紓浣哄У閸ㄥ潡骞冮妷鈺傚亗閹兼惌鍠楃紞搴♀攽閻愬弶鈻曞ù婊勭矌缁鎮介崨濠勫幍闂佺粯鍨惰摫闁抽攱甯掗湁闁绘挸瀛╅幖鎰版煃鐟欏嫬鐏撮柟顔界懇閹崇娀顢楅敓浠嬄烽敓浠嬫⒒娴ｈ鍋犻柛鏂跨灱缁辩偞绻濋崶褎鐎梺鐟板⒔缁垳锟界數濮撮…璺ㄦ崉娓氼垰鍓电紒缁㈠弿閹烽攱绻濋悽闈浶ｆい鏃�鐗犲畷鎶芥晲婢跺﹦鍝楅梻渚囧墮缁夋挳鎮挎ィ鍐╃厱妞ゆ劧绲剧粈锟介梻浣斤骏閸婃牗绌辨繝鍥ч煫鍥ㄦ煥椤忓爼姊绘担鍛婂暈闁荤喆鍎甸弫鍐Ψ閳轰絼锕傛煕閺囥劌鐏犻柛鎰舵嫹闂備線娼ц噹閻忕偟鍋撻鎰版⒒閸屾瑨鍏屾い顓炵墛椤ㄣ儵骞栨担瑙勬珖濡炪倕绻愰悧鍡欑不閺嶃劋绻嗛柕鍫濈箲鐎氬綊姊虹�圭姵顥夋い锔诲灦閸┿垹顓兼径妯绘櫍閻熸粌鐬奸懞杈ㄧ節濮橆厾鍙嗛梺鍝勬处閿氶柣蹇旂叀閺屸剝鎷呯憴鍕３闂佽桨鐒﹂幑鍥极閹剧粯鏅搁柨鐕傛嫹
				PetColumn petColumn = new PetColumn(roleid, PetColumnTypes.PET,false);
				fire.pb.pet.Pet pet = petColumn.getPet(petkey);
				if(pet==null){
					logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕鍏肩節婵犲倹濯奸柛搴嫹 "+roleid+"闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫锟芥艾顦伴妵鍕箳閹存繍浠肩紓浣哄У瑜板啴婀侀梺鎸庣箓閹冲繒鎷归敓鐘崇厽婵犻潧锕ョ涵楣冩煃鐟欏嫬鐏撮柟顔规櫊瀹曪絾寰勬繝搴⑿熼梻鍌欒兌椤牊顨ラ崫銉х煋鐟滅増甯掗拑鐔哥箾閹存瑥鐏╅柛妤佸▕閺屾洘绻涢崹顔煎缂備降鍔嬬划娆忣潖濞差亜浼犻柛鏇㈡涧閸撲即姊洪崫銉ユ瀾闁圭鍟块锝嗙節濮橆厽娅滈梺鍛婄矆閻掞妇锟介潧鐬肩槐鎾诲磼濞嗘垵濡介柦鍐憾閺岋絽鈹戦崶褏顑傜紓浣介哺閹稿骞忛崨顖涘珰闁斥晛鍟伴弳銉︿繆閻愵亜锟窖呯不閹惧顩查柛顐ｆ礀閺嬩線鏌熼崜褏甯涢柛銈呯Ч閺屾洘绔熼銈嗗濠碘�插嫎閸旀垵顫忓ú顏勭閹艰揪缍嗛弳锛勭磽娴ｈ櫣甯涚紒璇茬墦瀵偊骞樼�靛壊娴勯柣搴秵閸嬪懎鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�"+"\t闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊瑜滃ù鏍煏婵炵偓娅嗛柛銈呭閺屻倗绮欑捄銊ょ驳濠电偛鎳愭慨鍨┍婵犲洤围闊洦鏌ㄩ鍫曟⒒娴ｉ涓茬紒韫矙閹ê顫濇潏鈺冪暥闂佺粯鏌ㄩ崥瀣疾缁嬫５褰掓偐瀹割喖鍓伴梺钘夊暟閸犳牠寮婚弴鐔虹闁割煈鍠栨慨澶愭⒑閸濆嫷鍎忛梺甯秮瀵鎮㈤崗鐓庯拷缁樹繆椤栨繂浜归柣锝夋涧閳规垿鎮欓懠顒�鈷婇梺鐟板殩閹凤拷");
					return false;
				}
				PetInfo petInfo = petColumn.getPetInfo(petkey);
				if (petInfo == null){
					logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕鍏肩節婵犲倹濯奸柛搴嫹 "+roleid+"闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫锟芥艾顦伴妵鍕箳閹存繍浠肩紓浣哄У瑜板啴婀侀梺鎸庣箓閹冲繒鎷归敓鐘崇厽婵犻潧锕ョ涵楣冩煃鐟欏嫬鐏撮柟顔规櫊瀹曪絾寰勬繝搴⑿熼梻鍌欒兌椤牊顨ラ崫銉х煋鐟滅増甯掗拑鐔哥箾閹存瑥鐏╅柛妤佸▕閺屾洘绻涢崹顔煎缂備降鍔嬬划娆忣潖濞差亜浼犻柛鏇㈡涧閸撲即姊洪崫銉ユ瀾闁圭鍟块锝嗙節濮橆厽娅滈梺鍛婄矆閻掞妇锟介潧鐬肩槐鎾诲磼濞嗘垵濡介柦鍐憾閺岋絽鈹戦崶褏顑傜紓浣介哺閹稿骞忛崨顖涘珰闁斥晛鍟伴弳銉︿繆閻愵亜锟窖呯不閹惧顩查柛顐ｆ礀閺嬩線鏌熼崜褏甯涢柛銈呯Ч閺屾洘绔熼銈嗗濠碘�插嫎閸旀垵顫忓ú顏勭閹艰揪缍嗛弳锛勭磽娴ｈ櫣甯涚紒璇茬墦瀵偊骞樼�靛壊娴勯柣搴秵閸嬪懎鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�"+"\t闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊瑜滃ù鏍煏婵炵偓娅嗛柛銈呭閺屻倗绮欑捄銊ょ驳濠电偛鎳愭慨鍨┍婵犲洤围闊洦鏌ㄩ鍫曟⒒娴ｉ涓茬紒韫矙閹ê顫濇潏鈺冪暥闂佺粯鏌ㄩ崥瀣疾缁嬫５褰掓偐瀹割喖鍓伴梺钘夊暟閸犳牠寮婚弴鐔虹闁割煈鍠栨慨澶愭⒑閸濆嫷鍎忛梺甯秮瀵鎮㈤崗鐓庯拷缁樹繆椤栨繂浜归柣锝夋涧閳规垿鎮欓懠顒�鈷婇梺鐟板殩閹凤拷");
					return false;
				}
				//闂傚倸鍊搁崐鎼佸磹閹间讲锟斤箓顢楅崟顐わ紱闂佸憡娲﹂崐瀣洪鍕幯冾熆鐠虹尨鍔熼柣銈呮搐閳规垿顢欑粵瀣吅闂佺懓鍢查崲鏌ュ煘閹达附鏅柛鏇炵仛椤ユ挾绱撴担鍝勑ｇ紒瀣灴閸┿儲寰勬繛銏㈠枛瀹曨偊宕熼锟介惃銊︾節绾板纾块柛瀣灴瀹曟劙寮介鐔蜂罕濠德板�曢幊蹇涘吹瀹�鍕厱闁圭偓顨呴幊鎰八囬娑氱閺夊牆澧介幃濂告倶韫囧濮傛鐐茬箰閻ｏ繝骞嶉搹顐や簴闂備礁澹婇悡鍫ュ窗濡ゅ懏鍊堕柛顐犲劜閳锋垹绱掔�ｎ亜鐨″顐ｇ閵囧嫰寮撮崱妤佹悙闁绘挻绻堥弻鐔煎箲閹伴潧娈紓浣哄缂嶄線寮婚敐鍛瀻闊洦鏌ㄥ▍銈夋煟鎼淬垼澹樼紓宥咃躬瀵鈽夐姀鈩冩珕闁荤姴娲﹁ぐ鍐不瑜版帗鐓曢柣鏃堟敱閸熺偟绱掔紒妯肩疄闁糕晜鐩弫鎾寸鐎ｎ亞顦ㄩ梺瀹犳〃濡炴帒菐椤旀垝绻嗛柕鍫濇搐鍟搁梺绋款儐缁嬫挾鍒掗弮鍫濈妞ゆ洖鎳忛弲锝嗙節闂堟稑锟藉鈥﹂崼婵愬晠婵犻潧娲㈡禍婊堟煙缂併垹鐏℃い顐躬閺屾盯鎮欓崹顐㈡畬闂佸疇顫夐崹鍧楀箖濞嗗浚鍟呮い鏂垮悑椤斿秴鈹戦悩鎰佸晱闁哥姵娲熷畷锟犲礃閼碱剚娈鹃梺鍝勬储閸ㄥ綊鎷戦悢鍏肩厪濠㈣埖绋撻悾鍗灻瑰鍕垫疁闁哄矉绲鹃幆鏃堫敍濠婂憛锝夋⒑閸濄儱校妞ゃ劌锕ら悾鐑芥偨閸涘﹥娅㈤梺璺ㄥ櫐閹凤拷?
				if(pet.getKind()!=PetTypeEnum.VARIATION){
					logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕鍏肩節婵犲倹濯奸柛搴嫹 "+roleid+"闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫锟芥艾顦伴妵鍕箳閹存繍浠肩紓浣哄У瑜板啴婀侀梺鎸庣箓閹冲繒鎷归敓鐘崇厽婵犻潧妫涢崺锝夋煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�"+"\t闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弮锟介幏婵嬪箯妞嬪海绠旀繛鎴炆戞径鍕煕鐎ｅ墎绡�闁哄本娲樼换娑㈡倷椤掍胶褰熼梻浣芥〃缁�渚�顢栨径鎰摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹1");
					return false;
				}
				if(petInfo.getPetdye1()==colorpos1){
					logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕鍏肩節婵犲倹濯奸柛搴嫹 "+roleid+"闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫锟芥艾顦伴妵鍕箳閹存繍浠肩紓浣哄У瑜板啴婀侀梺鎸庣箓閹冲繒鎷归敓鐘崇厽婵犻潧妫涢崺锝夋煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�"+"\t闂傚倸鍊峰ù鍥х暦閻㈢绐楅柟閭﹀枛閸ㄦ繈骞栧ǎ顒�鐏繛鍛У娣囧﹪濡堕崨顔兼缂備胶濮抽崡鎶藉蓟濞戞ǚ妲堟慨妤�鐗婇弫鎯р攽閻愬弶鍣藉┑鐑囨嫹闂佸搫鐭夌徊鍊熺亽濠电偛妫欓崕鍐测枔椤撱垺鈷戦柦妯侯槸閺嗙喖鏌涢悩宕囧⒌鐎殿喖顭烽幃銏ゆ偂鎼达綆妲堕柣鐔哥矊闁帮絽鐣烽悽鍛婃櫢闁芥ê顦藉〒濠氭煏閸繂鏆欓柛鏃�姘ㄧ槐鎺旂磼濮楀牐锟借法锟芥鍠栭…鐑藉极閹剧粯鍋愰柤纰卞墾缁卞弶绻濋悽闈浶㈤柣蹇斿哺瀹曟繈寮介銈囶槸闂佸壊鍋呯换宥呫�掓繝姘厪闁割偅绻傞弳娆撴煟韫囧﹥娅囩紒杈ㄥ笚瀵板嫭绻濋崟顓夈劌螖閻橀潧浠滄俊顐ｇ箓閻ｇ兘鎮㈢喊杈ㄦ櫍闂佺粯顭囬弫鎼佸储椤栫偞鈷掑ù锝呮啞鐠愨剝銇勯鐐靛妞ゃ劊鍎甸獮鏍ㄦ媴鐟欏嫭顏熷┑鐐差嚟婵挳顢栭崟顖氱疅濡わ絽鍟悡娑㈡倶閻愰鍤欏┑鈥炽偢閺屽秹鎸婃径妯恍﹂柧浼欑悼缁辨挻鎷呴懖鈩冨灩閿熻姤淇哄▍鏇犳崲濠靛牆鏋堟俊顖涙た濞兼垿姊虹粙娆惧剮缂佽埖鑹鹃悾鐑藉箛椤戣姤鏂�闂佸摜濯崰妤呮儎椤栫偛鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫锟芥艾顦伴妵鍕箳閹存繍浠肩紓浣哄У瑜板啴婀侀梺鎸庣箓閹冲繒鎷归敓鐘崇厽婵犻潧妫涢崺锝夋煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�");
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160380, null);
					return false;
				}
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴婵拷闁斥晛鍟拌ぐ锝夋⒒娴ｅ摜绉烘い銉︽崌瀹曟螣閾忚娈鹃梺缁樺灩閻℃棃寮崶顒佺厽闁归偊鍘兼慨鍌炴煕鎼淬劋鎲鹃柍銉畵閹虫顢涢敐鍠扳晜绻濋悽闈涗粶闁汇劎鍏橀弫鎾绘嚍閵夈儱顫梺鎼炲�栧ú鏍煘閹达附鍋愰悗鍦Т椤ユ繄绱撴担鍝勑㈡い顓犲厴瀵鏁愭径瀣簻闂佺粯鎸哥花濂稿窗婵犲倵鏀介柍钘夋娴滄粓鏌ｉ鐐诧拷鎼侊綖韫囨拋娲敂閸曨亞鐐婇梻浣告啞濞诧箓宕戦幘璇茬闂佸灝顑囬々鐑芥倵閿濆懎顣崇紒瀣箲缁绘繈濮�閿濆懐鍘梺鍛婃⒐閸ㄥ潡寮幘璇茬闁圭儤妫忓Σ顕�姊烘导娆戠Ф缂佺粯绻堥獮鍡涘炊椤掞拷绾拷闂佽法鍣﹂幏锟�.getBaseId()
				if(!isCanUseColor(pet.getBaseId(),colorpos1)){
					logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕鍏肩節婵犲倹濯奸柛搴嫹 "+roleid+"闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫锟芥艾顦伴妵鍕箳閹存繍浠肩紓浣哄У瑜板啴婀侀梺鎸庣箓閹冲繒鎷归敓鐘崇厽婵犻潧妫涢崺锝夋煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�"+"\t闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弮锟介幏婵嬪箯妞嬪海绠旀繛鎴炆戞径鍕煕鐎ｅ墎绡�闁哄本娲樼换娑㈡倷椤掍胶褰熼梻浣芥〃缁�渚�顢栨径鎰摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹2");
					return false;
				}
				
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔芥祰闂傚倷鑳剁划顖滄暜閹烘围闁归棿绀侀拑鐔兼煟閺冨倸甯剁紒鐘虫皑閹茬顓兼径濠冭緢闁哄鐗冮弲顏堝箯閻戣姤鍋ㄩ梻鍫熶緱閺嗩厼鈹戦埥鍡椾簻闁哥喐娼欓锝嗙節濮橆厽娅㈤梺缁橆焾鐏忔瑩藝娴煎瓨鈷掗柛灞炬皑婢ф稓绱掔�ｎ偅灏扮紒鍌涘浮閸╋繝宕ㄩ瑙勫闂佽崵濮村ú鐘绘晸閽樺锛嶅ù鐘欏洦鈷戠紓浣姑柌婊呯磼閻樺啿鐏存い銏″哺婵＄兘鍩￠崒娑欘仧闂備浇娉曢崳锕傚箯閿燂拷?
				ItemMaps bagContainer = Module.getInstance().getItemMaps(roleid, BagTypes.BAG, false);//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磸閿熸垝鐒︾换婵嬪炊妞嬪海鈼ゅ┑鐘灱閸╂牠宕濋弴鐘电焼濠㈣泛顑勭换鍡樸亜閺嶃劎绠撳ù婊冪秺閺岋綁顢橀悜鍡樷枅闂佸搫鐬奸崰鏍箖濠婂喚娼ㄩ柛鈩冾焽閺嗭箓姊绘担渚劸濡ょ姴鎽滅划鏃囥亹閹烘垼鎽曞┑鐐村灟閸ㄥ綊宕￠幎鑺ョ厪濠电偛鐏濋敓鑺ヮ殜瀹曟瑨銇愰幒鎾嫼濠电偠灏濠勮姳妞嬪海纾兼い鏃傛櫕閹冲洨锟芥鍠栭…閿嬩繆閼搁潧绶炲┑鐘插濡蹭即姊绘担钘夘棈濠㈢懓鐗嗛埢鏂库槈閵忊晜鏅滃銈嗘尪閸ㄦ椽鎮￠悢鐓庣閺夊牆澧界壕鍨归悩宕団檨闁靛洤瀚伴、姗�鎮欓弶鎴炵亷闂備浇妗ㄩ悞锕傚箲閸ヮ剙绠板┑鐘插暙缁剁偤鎮楅敐搴″箻妞ゃ垹鎳樺缁樻媴娓氼垱鏁┑鐐叉噺濞茬喖鐛幇鏉跨濞达絽鎽滈崢娲倵楠炲灝鍔氭い锔垮嵆瀵煡骞栨担鍦弳闂佺粯娲栭崐鍦拷姘炬嫹
				if(bagContainer==null){
					logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕鍏肩節婵犲倹濯奸柛搴嫹 "+roleid+"闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫锟芥艾顦伴妵鍕箳閹存繍浠肩紓浣哄У瑜板啴婀侀梺鎸庣箓閹冲繒鎷归敓鐘崇厽婵犻潧妫涢崺锝夋煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�"+"\t闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲搁弬璺ㄦ殾妞ゆ牜鍋涢柨銈嗕繆閵堝嫮顦︽繛鍫到椤啴濡堕崱娆忣潷缂備緡鍣紞渚�鐛箛娑欏�婚柦妯侯槸閻庮厼顪冮妶鍡楀Е闁告挻绻堥弫鎾绘寠婢跺浠撮梺鍝勭焿缁辨洘绂掗敂鐐珰闁圭粯甯╅悗鎶芥⒒娴ｅ摜鏋冩い鏇嗗洦鐓�闁挎繂顦卞畵渚�鏌熼悜妯虹亶闁猴拷娴犲鐓曢柍鈺佸枦娓氭盯鏌涢悜鍥ㄥ");
					return false;
				}
				SRoleRColorConfig sRoleRColorConfig1=sRoleRColorConfig.get(colorpos1);
				if(sRoleRColorConfig1==null){
					logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕鍏肩節婵犲倹濯奸柛搴嫹 "+roleid+"闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫锟芥艾顦伴妵鍕箳閹存繍浠肩紓浣哄У瑜板啴婀侀梺鎸庣箓閹冲繒鎷归敓鐘崇厽婵犻潧妫涢崺锝夋煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�"+"\t闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊瑜滃ù鏍煏婵炵偓娅嗛柛銈呭閺屻倗绮欑捄銊ょ驳濠电偛鎳愭慨鍨┍婵犲洤围闊洦鏌ㄩ鍫曟⒒娴ｉ涓茬紒韫矙閹ê顫濇潏鈺冪暥闂佺粯鏌ㄩ崥瀣疾缁嬫５褰掓偐瀹割喖鍓伴梺钘夊暟閸犳牠寮婚弴鐔虹闁割煈鍠栨慨澶愭⒑閸濆嫷鍎忛梺甯秮瀵鎮㈤崗鐓庯拷缁樹繆椤栨繂浜归柣锝夋涧閳规垿鎮欓懠顒�鈷婇梺鐟板殩閹凤拷");
					return false;
				}
				int cost=sRoleRColorConfig1.getItemnum();
				int itemcode=sRoleRColorConfig1.getItemcode();
				
				int havenum=bagContainer.getItemNum(itemcode, 0);
				if(havenum<cost){
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 150058, null);
					return false;
				}
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔鏌ユ晸閽樺锟藉潡銆佸▎鎾崇鐟滃繘藝椤栨稓绠鹃弶鍫濆⒔閹偐鐥鐐靛煟鐎殿喚顭堥鍏煎緞婵犲嫷鍟囨繝鐢靛剳缂嶅棝宕滃▎鎰箚濞寸姴顑嗛悡鐔兼煙閻戞ê鐏熼柛瀣ㄥ灲閺屸�崇暆閿熶粙宕伴弽顓犲祦闁糕剝鍑瑰Σ濠氭⒑閸濆嫭顥″ù婊庡墴閺佹挻绂掔�ｎ偅閿柟鐓庣摠缁捇鐛箛娑欐櫢闁跨噦鎷�
				int delnum=bagContainer.removeItemById(itemcode, cost, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_ranse, itemcode, "闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃酣銆冮妷褏鐭欓柛鏌倧鎷烽崸妤�绾ч柛顐ｇ☉婵′粙鏌涘▎蹇曠婵﹥妞藉畷褰掝敋閸涱厼澹夋繝鐢靛仜閹虫劖绻涢敓浠嬫煛鐏炲墽顬兼い锕佹珪閵囧嫰濡搁妷锕�娈楅梺褰掓敱閸ㄥ潡骞冮姀銈呯闁兼祴鏅涢獮宥夋⒒娴ｅ憡鍟為柟绋挎瀹曠喖顢曢敐鍥ㄦ婵犵绱曢崑鎴﹀磹閹达箑纾垮┑鐘宠壘缁狀垶鏌ㄩ悤鍌涘");
				if(delnum!=cost){
					return false;
				}
				petInfo.setPetdye1(colorpos1);
				petInfo.setPetdye2(colorpos2);
				SReqUsePetColor sReqUsePetColor=new SReqUsePetColor();
				sReqUsePetColor.colorpos1=colorpos1;
				sReqUsePetColor.colorpos2=colorpos2;
				sReqUsePetColor.petkey=petkey;
				Procedure.psendWhileCommit(roleid, sReqUsePetColor);
				// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣芥硶閸犳挻鎱ㄧ�靛摜纾奸柍鍝勬噺閳锋垶銇勯幒鐐村缂備礁顦伴幐鎶藉箯閹达附鍋勯悘蹇庣劍閺傦拷闂備胶绮摫鐟滄澘鍟撮、鏃堟偨閸涘﹦鍘垫俊鐐差儏妤犳悂宕㈢�甸潻鎷风憴鍕闁稿繑锕㈤妴浣割潨閿熶粙骞冨▎鎾崇疀闁宠桨绀佹慨搴☆渻閵堝骸寮ㄩ柛搴☆煼钘濋柟鎯板Г閸婄數绱掑Δ浣衡槈闁硅櫕鍔欓幆灞筋潩閼哥鎷哄銈嗗釜閹烽绱掓径瀣唉闁诡喚鍋涚叅妞ゅ繐鎳愰崢閬嶆⒑鐟欏嫭绶查柤娲诲灦楠炲﹪骞囬崗顐㈡喘閺佹捇鏁撻敓锟�
				final SRefreshPetInfo refresh = new SRefreshPetInfo(pet.getProtocolPet());
				psendWhileCommit(roleid, refresh);
				
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡寮堕崼姘珔闁搞劍绻冮妵鍕冀椤愵澀绮剁紓渚婃嫹濠㈣泛顑勭换鍡涙煏閸繃鍣洪柛锝囨嚀椤╁ジ宕ㄩ娑欐杸濡炪倖姊婚悺鏃堟倿閻愵剛绠惧璺侯儑濞叉挳鏌熼柨瀣伌闁诡喓鍨藉畷妤呮嚃閳轰礁绠ラ梻鍌欑閹诧繝骞愰崱娑樼妞ゆ劧绲块弳姘攽閿涘嫬浜奸柛濠冨灴瀹曟洘娼忛埡鍌氬簥濠殿喗顨愰幏椋庯拷娈垮枛椤兘骞冮姀銈嗗仏閻庢稒锚椤忚泛鈹戦悙鏉戠仸妞ゅ浚浜、鏃堝川椤旂厧浼庨梻浣规偠閸庢粓鏁撴禒瀣哗闁兼亽鍎禍婊堟煛閸モ晛浠︽い銉у仱閹顫濋悙顒�顏�
				fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160432, null);
				
				
				logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕鍏肩節婵犲倹濯奸柛搴嫹 "+roleid+"闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃酣銆冮妷褏鐭欓柛鏌倧鎷烽崸妤�绾ч柛顐ｇ☉婵′粙鏌涘▎蹇曠婵﹥妞藉畷褰掝敋閸涱厼澹夋繝鐢靛仜閹虫劖绻涢敓浠嬫煛鐏炲墽顬兼い锕佹珪閵囧嫰濡搁妷锕�娈楅梺褰掓敱閸ㄥ潡骞冮姀銈呯闁兼祴鏅涢獮宥夋⒒娴ｅ憡鍟為柟绋挎瀹曠喖顢曢敐鍥ㄦ婵犵绱曢崑鎴﹀磹閹达箑纾块弶鍫氭櫆瀹曞弶鎱ㄥΔ瀣閻庢鍠栭…鐑藉极瀹ュ绀嬫い蹇撴噹婵即姊绘担铏瑰笡闁告棑绠撳畷婊冣枎閹存繍妫滈梺鍐叉惈閸婅崵寮ч敓浠嬫⒑闂堟稓绠為柛銊︽そ瀹曠敻鏁撴禒瀣拺闁圭瀛╂径鍕瑰搴濈盎妞ゆ洩缍侀、鏇㈠閳轰焦鍊梻浣规偠閸庡姊介崟顖氱闁告劦鍠楅埛鎴澝归崗鑲╂噮闁告帊鍗抽弻锟犲醇椤愩垹鈷嬮梺璇″枟椤ㄥ﹪銆佸鑸垫櫢闁芥ê顦藉鏍煣韫囨挻璐＄痪鎯у悑閹便劌螖閿熻棄螞濞嗘搩鏁囬柧蹇撴贡绾捐棄霉閿濆懏鎯堟い搴℃湰娣囧﹪骞撻幒婵撴嫹閿燂拷"+petkey+"\t闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃酣銆冮妷褏鐭欓柛鏌倧鎷烽崸妤�绾ч柛顐ｇ☉婵′粙鏌涘▎蹇曠婵﹥妞藉畷褰掝敋閸涱厼澹夋繝鐢靛仜閹虫劖绻涢敓浠嬫煛鐏炲墽顬兼い锕佹珪閵囧嫰濡搁妷锕�娅ч梺鐟板级閹告娊寮崒鐐茬闁告侗鍠栭璺何旈悩闈涗粶闁诲繑绻堝畷婵嗩潩椤撶姷顔曟繝銏ｅ煐缁嬫捇鎮鹃悽鍛婄厵妞ゆ梻鐡斿▓婊咃拷瑙勬礃缁捇寮幘缁樻櫢闁跨噦鎷�"+petInfo.getName()+"\t闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔鏌ユ晸閽樺锟藉潡銆佸▎鎾崇鐟滃繘藝椤栨稓绠鹃弶鍫濆⒔閹偐鐥鐐靛煟鐎殿喚顭堥鍏煎緞婵犲嫷鍟囨繝鐢靛剳缂嶅棝宕滃▎鎰箚濞寸姴顑嗛悡鐔兼煙閻戞ê鐏熼柛瀣ㄥ灲閺屸�崇暆閿熶粙宕伴弽顓犲祦闁糕剝鍑瑰Σ濠氭⒑閸濆嫭顥″ù婊庡墴閺佹捇鎮剧仦鐐瘎婵犫拃鍕垫當閾荤偤鏌涢幇闈涙灈闁藉啰鍠栭弻鏇熺箾閸喖濮夊┑鈩冨絻閻楀﹥绌辨繝鍥舵晬婵犻潧妫斿Ч妤佺箾鐎电甯舵繛璇у閹广垹鈹戠�ｎ亞鍘遍梺璺ㄥ枍缁瑥鐣峰锟介崺鈩冩媴闁垮鈻曢梻浣筋嚙濮橈箓锝炴径濞掓椽鏁冮崒姘憋紱闂佸憡渚楅崹鎶芥儗濞嗗繆鏀介柣妯哄级婢跺嫰鏌涚�ｃ劌濮傞柡灞诲姂閹倝宕掑☉姗嗕紦"+itemcode+"闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊瑜滃ù鏍煏婵炲灝鍔存繛鎾愁煼閺岀喖鎮滃鍡樼暥缂佺虎鍙忛幏鐑芥⒒娴ｇ瓔娼愰柛搴ｅ帶铻為柛鏇ㄥ灡閳锋帗銇勯弽顐沪闁绘挶鍎甸弻锝夊即閻愯鎷烽崷顓ㄦ嫹濮樼偓瀚�"+cost+"闂傚倸鍊峰ù鍥х暦閻㈢绐楅柟閭﹀枛閸ㄦ繈骞栧ǎ顒�鐏繛鍛У娣囧﹪濡堕崨顔兼缂備胶濮抽崡鎶藉蓟濞戞ǚ妲堟慨妤�鐗婇弫鎯р攽閻愬弶鍣藉┑鐑囨嫹闂佸搫鐭夌徊鍊熺亽濠电偛妫欓崕鍐测枔椤撱垺鈷戦柦妯侯槸閺嗙喖鏌涢悩宕囧⒌鐎殿喖顭烽幃銏ゆ偂鎼达綆妲堕柣鐔哥矊闁帮絽鐣烽悽鍛婃櫢闁芥ê顦藉〒濠氭煏閸繂鏆欓柛鏃�姘ㄧ槐鎺旂磼濮楀牐锟借法锟芥鍠栭…鐑藉极閹剧粯鍋愰柤纰卞墾缁卞弶绻濋悽闈浶㈤柣蹇斿哺瀹曟繈寮介銈囶槸闂佸壊鍋呯换宥呫�掓繝姘厪闁割偅绻傞銏㈢磼閼哥數娲撮柡宀�鍠栧畷娆撳Χ閸℃浼� "+colorpos1);
				return true;
			}
		}.submit();
		
		
	}
	
	/**
	 * 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴婵拷闁斥晛鍟拌ぐ锝夋⒒娴ｅ摜绉烘い銉︽崌瀹曟螣閾忚娈鹃梺缁樺灩閻℃棃寮崶顒佺厽闁归偊鍘兼慨鍌炴煕鎼淬劋鎲鹃柍銉畵閹虫顢涢敐鍠扳晜绻濋悽闈涗粶闁汇劎鍏橀弫鎾绘嚍閵夈儱顫梺鎼炲�栧ú鏍箒闂佺绻愰崥瀣磿濡ゅ懏鐓涘ù锝呮憸鏍￠梺閫涚┒閸斿矂锝炲鍫濆耿婵°倧鎷风紒鐘茬秺濮婃椽宕ㄦ繝鍐ㄨ敿闂佸憡姊归崹鐢革綖韫囨拋娲敂閸曨偆鐛╁┑鐘垫暩婵锟芥凹鍙冨畷铏鐎ｎ偀鎷洪梺鍛婃崄鐏忔瑩宕㈠☉銏＄厱闁靛鍔嬮崥顐ょ磼椤旂⒈鍎忔い鎾冲悑瀵板嫭绻濋崟闈涙暯濠电姴鐥夐弶鍖℃嫹瑜旈獮蹇涙倻閼恒儳鍙冮梺鍛婂姦娴滄粓寮稿☉銏＄厸鐎癸拷閿熶粙宕伴弽褏鏆︽繝濠傛－濡插ジ姊洪幖鐐诧拷褔骞忛柨瀣╃箚闁绘劦浜滈敓鑺ュ灴瀹曟洘绻濆顒傤唵闂佽法鍣﹂幏锟�
	 * @param petId
	 * @param colorpos
	 * @return
	 */
	public boolean isCanUseColor(int petId,int colorpos){
		Map<Integer, PetAttr> confs = ConfigManager.getInstance().getConf(PetAttr.class);
		if (confs != null) {
			PetAttr conf = confs.get(petId);
			if (conf != null) {
				String str=conf.getColorselect();
				if(str==null){
					return false;
				}
				String pos[]=str.split(";");
				if(pos==null){
					return false;	
				}
				for(String p:pos){
					String pos1[]=p.split(",");
					if(colorpos==Integer.parseInt(pos1[0])){
						return true;
					}
				}
				
			}
		}
		return false;
	}
	
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786545;

	public int getType() {
		return 786545;
	}

	public int petkey; // 宠物ID
	public int colorpos1; // 部位1
	public int colorpos2; // 部位2

	public CReqUsePetColor() {
	}

	public CReqUsePetColor(int _petkey_, int _colorpos1_, int _colorpos2_) {
		this.petkey = _petkey_;
		this.colorpos1 = _colorpos1_;
		this.colorpos2 = _colorpos2_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(petkey);
		_os_.marshal(colorpos1);
		_os_.marshal(colorpos2);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		petkey = _os_.unmarshal_int();
		colorpos1 = _os_.unmarshal_int();
		colorpos2 = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqUsePetColor) {
			CReqUsePetColor _o_ = (CReqUsePetColor)_o1_;
			if (petkey != _o_.petkey) return false;
			if (colorpos1 != _o_.colorpos1) return false;
			if (colorpos2 != _o_.colorpos2) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += petkey;
		_h_ += colorpos1;
		_h_ += colorpos2;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(petkey).append(",");
		_sb_.append(colorpos1).append(",");
		_sb_.append(colorpos2).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqUsePetColor _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = petkey - _o_.petkey;
		if (0 != _c_) return _c_;
		_c_ = colorpos1 - _o_.colorpos1;
		if (0 != _c_) return _c_;
		_c_ = colorpos2 - _o_.colorpos2;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

