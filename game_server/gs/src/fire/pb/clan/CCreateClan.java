
package fire.pb.clan;

import fire.pb.clan.srv.ClanBaseManager;
import fire.pb.talk.MessageMgr;
import fire.pb.util.CheckName;
import fire.pb.util.StringValidateUtil;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCreateClan__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CCreateClan extends __CCreateClan__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0 || clanname == null || clanaim == null)
			return;
		int resultCode = CheckName.checkValid(clanname);
		if (resultCode == CheckName.WORD_ILLEGALITY) {
			MessageMgr.sendMsgNotify(roleid, 142260, null);
			return;
		} else if (resultCode == CheckName.SPECIAL_WORD_TOO_MANY) {
			MessageMgr.sendMsgNotify(roleid, 142294, null);
			return;
		} else if (resultCode == CheckName.NONE_CHARACTER) {
			MessageMgr.sendMsgNotify(roleid, 146238, null);
			return;
		}

		if (!StringValidateUtil.checkValidName(clanaim)) {
			MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欑粈鍐┿亜閺囧棗娲ら悡姗�鏌熸潏楣冩闁稿鍔欓弻娑樷枎韫囷絾效闂佽鍠楅悷褏妲愰幘瀛樺闁告繂瀚烽敓钘夌焸閺屾盯濡搁妷褍鐓熼悗娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞楅梻渚�娼х换鍫ュ春閸曨垱鍊块柛鎾楀懐锛滈梺褰掑亰閸欏骸鈻撳鍫熺厸鐎癸拷閿熶粙宕伴弽顓炶摕闁搞儺鍓氶弲婵嬫煥閻斿墎鐭欑�规洘绻堥獮鎺楀箻閸撲緡鍟庨柣搴ｆ嚀婢瑰﹪宕伴弴鐘哄С闁煎鍊楃壕濂告煟濞嗗繑鍣界紒澶樺櫍閺屸�崇暆鐎ｎ剙鍩岄柧浼欑秮閺屾稖绠涢幘铏�┑顕嗙到鐎氭澘顫忛搹鍦＜婵☆垵娅ｉ悷銊╂⒑閸涘﹨澹樻い鎴濇喘楠炴垿濮�閻橆偅顫嶉梺闈涚箳婵兘顢欓幒妤佺厽閹艰揪绲鹃弳鈺傘亜椤撶偟澧︾�殿喗濞婇弫鎾绘偐閺傘儲瀚奸柣鐔哥矌婢ф鏁埡浣勬盯骞嬮敂鐣屽幈闂婎偄娲﹀Λ鎴︽嚀鐠侯煉鎷峰▓鍨灈妞ゎ厾鍏橀獮鍐閵忕姵鐎抽柡澶婄墑閸斿秴鈻嶉弽銊х瘈婵炲牆鐏濋弸鐔兼煥濮樻唻鎷风憴鍕闁告挾鍠栧畷娲川鐎涙ê浠洪梺鍛婄☉閿曘倝鏁撻悾灞炬毈闁诡喖鍢查埢搴ょ疀閹垮啩鐥紓鍌欑筏閹风兘鏌ㄩ悢鍓佺煓闁诡喗顨堥幉鎾礋椤掞拷椤︹晠姊洪崨濠冨暗闁哥姵鐗曢悾宄懊洪鍕庛劑鏌ㄩ弴顏呭缂備礁澧庨崑娑㈠煘閹达附鍊烽梻鍫熺◥婢规洟姊虹拠鏌ヮ�楁い顓炲槻铻為柛娑欐儗閺佸啴鏌曡箛濠忔嫹閹颁焦袩濠电姷鏁搁崑娑橆嚕閸洘鍋嬫繝濠傛噺椤洟鏌ｉ幇顔煎妺闁哄懏鎮傞弻銊╂偆閸屾稑顏�?$缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮枟閹告娊骞冨▎鎴炲珰鐟滃海锟芥艾缍婇弻娑㈩敃閿濆棛顦ㄩ梺鍝勬噺閹倿寮婚敃锟借灒濞撴凹鍨辩瑧闂備礁鎼Λ瀵稿緤妤ｅ啨锟藉啴濡烽埡鍌氾拷鐑芥煕濞嗗浚妲搁柡瀣Т椤啴濡堕崘銊т痪闂佽崵鍟块弲娑㈡偩閻戣姤鏅插璺好￠妸褎鍠愰煫鍥ㄧ☉缁犵喓鎲搁悧鍫濈瑲闁抽攱甯￠弻娑氫沪閸撗勫櫙闂佺绻愰張顒勫Φ閸曨垰顫呴柣娆忔嚀閸氼偄螖閻橀潧浠﹂柟鐟版喘閵嗕線寮崼婵嗚�垮┑掳鍊曢崯浼存偤濡偐纾介柛灞捐壘閿熺晫鍏橀幃鐐烘晝閸屾鎷烽敃鍌氱倞妞ゆ垶鎷濋幏鐑藉川鐎涙ê娈ゅ銈嗗笂缁�渚�寮搁幋锔解拺缂備焦锕╁▓鏃堟煟濡わ拷濡稓鍒掗鐑嗘僵闁煎摜鏁搁崢浠嬫⒑鐟欏嫬鍔ら柣掳鍔庣划鍫ュ醇閵夛妇鍘甸梺鍦帛鐢宕悙鐑樼厵妞ゆ牗绋掗ˉ鍫濃攽閳╁啯鍊愰柡浣瑰姌缁犳盯寮▎鍙ョ处闂傚倷绀侀幉锟犲礉閿曞倸绐楅柡宥庡幘瀹撲線鏌曡箛銉х？缂佺娀绠栭弻鐔猴拷鐢殿焾閸撻亶鏌ｉ幒宥囩煓闁哄矉绱曟禒锕傛偄瀹勭増鐏撳┑鐐存尭椤兘寮婚弴銏犻唶婵犻潧娴傚Λ鐐电磽娴ｈ娈曢悽顖ょ節楠炲啫螖閿熶粙锝炲┑瀣亗閹艰揪绱曢惈鍕煟鎼淬値娼愭繛鍙夛耿瀹曟繂鈻庤箛鏇熸婵犻潧鍊婚…鍫ュ础閹惰姤鐓熼柡鍌涘閹牊顨ラ悙鎼疁婵﹦绮幏鍛村传閵夘灝銊╂⒑缁嬫鍎忛柨鏇ㄤ簻閻ｉ鎲撮崟顐殼闁诲孩绋掗敋濞存粍顨婂楦裤亹閹烘垳鍠婇梺鍛婎焾椤绮嬪鍜佺叆闁割偆鍠撻崢顏呯節閵忥絾纭鹃柣妤�妫濆畷婵堬拷娑櫭肩换鍡涙煕濞嗗浚妲归柕鍥ㄧ箞閺屸�崇暆閿熶粙宕伴弽褏鏆﹂柨婵嗘缁剁偤鎮楅敐搴濇倣闁归鍏橀獮鍥敋閸℃ê顏跺┑鐐茬墕閻忔繈寮稿☉銏＄厽闁哄诞浣镐划闂佺粯渚楅崳锝夌嵁閸ヮ剦鏁囬柣鏂垮槻婵¤櫕淇婇悙顏勶拷鏍ь潖瑜版帒鍑犻柤濮愬�栭～鏇熶繆閵堝懏鍣洪柍閿嬪浮閺屾稓浠﹂崜褎鍣銈忚缁犳捇寮婚悢鍝勬瀳闁告鍋橀崰濠囨倵濞堝灝鏋ら柡浣割煼閵嗕礁螖閸涱厾锛滃┑鐘诧工閹虫劙宕㈤鐐粹拻濞达絼璀﹂弨浼存煙濞茶绨界紒顔碱煼楠炲鏁傞挊澶夌暗闂備胶鍋ㄩ崕鏌ュ礈濮樿埖鍋勯柛鈩冪♁閸嬶綁寮堕悙鏉戭�滄い鎺斿枛閺岋綁骞欓崘銊ヮ潽缂備胶绮粙鎾跺垝椤撱垹浼犻柛鏇ㄥ亽濞煎酣姊绘担鍛婃儓闁哄牜鍓熼幆鍕敍閻愵亷鎷锋笟锟藉鎾閳╁啯鐝抽梻浣规偠閸庮噣寮插┑瀣辈闁绘鏁哥壕浠嬫煕鐏炲墽鎳呴柛鏂跨Ч閺屾盯鎮欑捄鍝勬優缂備浇浜崑鐐电箔閻斿吋鏅搁柦妯侯樈閸ゆ洖鈹戦悩宕囶暡闁哄懏褰冮…璺ㄦ崉娓氼垰鍓版繛瀛樼矋缁挸顫忓ú顏勫窛濠电姴瀚槐浼存⒑缁嬪灝顒㈠┑鐐诧躬楠炲啴鍩勯崘鈺侇�撶紓渚囧灡濞叉﹢寮敓浠嬫⒒娴ｈ櫣甯涢柨鏇楁櫊瀹曚即寮介鐔凤拷鑸点亜韫囨挾澧涢柣鎾卞劦閺岋繝宕堕…瀣典邯閹﹢鍩￠崨顔惧幗闂佹寧绻傚ú銈夊储鐎涙﹩娈介柣鎰级閸犳锟芥鍠栭悥鐓庣暦缁嬭鏃�鎷呯憴鍕殽濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氬湱鎲搁弮鍫㈠祦闊洦绋掗崐濠氭煠閹帒鍔ら柛娆忓暣濮婃椽宕ㄦ繝鍌毿曟繛瀛樼矋缁挸顕ｇ粙搴撴闁靛骏绱曢崢鎼佹煟韫囨洖浠滃褌绮欓崺銉﹀緞閹邦厾鍘撻梺鑺ッˇ钘壩熼敓浠嬫倵鐟欏嫭绌跨紒缁樼箞楠炲啫鈻庨幋顖涘闁汇垹鎲″▍婊堟煙閼碱剙浜剧紒缁樼箞閹粙妫冨ù璁圭稻閵囧嫰寮敓浠嬫偋閻樿尙鏆﹂悷娆忓椤曢亶鏌熺喊鍗炲箺闁哄拋浜滈—鍐Χ閸℃ê鏆楁繝娈垮枤閺佸鏁愰悙鍝勫嵆闁靛骏绱曢崢鐢告⒑缂佹ê鐏﹂拑杈ㄣ亜閵夛妇澧甸柡宀�鍠愰ˇ鐗堟償閳ュ啿绠ｉ梻浣芥〃閻掞箓宕濋弽顓炵畾闁哄啫鐗嗛悘宕囷拷瑙勬礀濞村倿宕崼銏㈢＝闁稿本鐟ㄩ崗宀勬煣韫囨捇鍙勭�规洏鍨虹缓浠嬪川婵犲倷鍑藉┑鐘绘涧閸婂鈥﹂崼銉﹀珔闁绘柨鎽滅粻楣冩煙鐎电鍓遍柣鎺撴倐閺岋綁寮崒姘闁诲孩纰嶅畝鎼佸蓟濞戞ǚ鏋庨煫鍥风稻姝囬梻浣界毇閸屾粌濡界紓浣虹帛缁诲倿鍩㈤幘璇插瀭妞ゆ梻鏅禍顏堟⒒娴ｇ懓顕滄繛鎻掔箻瀹曟洟鏌嗗渚婃嫹閺冨牆绀冮柍鍝勫枤濞村嫰鏌ｆ惔顖滅У濞存粎鍋ら幃鎯洪鍛嫼闂佸搫鍊堕崕鎻掆枍閸涘瓨鐓曢柣鏇氱閻忥妇锟借娲樺ú鐔煎箖閵忋倕绀傞悘蹇旂墬鐎垫牠姊绘担瑙勫仩闁稿孩妞藉畷婊冣枎閹惧啿寮烽梺闈涱槴閺呮粓鎮￠悢鍏肩厵闂侇叏绠戦弸娑㈡煕閺傛鍎旈柡灞界Ч閺屻劎锟斤綆浜炴导宀勬⒑閸濆嫮鐏遍柛鐘虫尵閸掓帒鈻庨幘鍐茬�銈嗘礀閹冲孩淇婃搴ｇ＝濞达絿顭堥埛鏃堟煕鐎ｎ偅宕屾鐐插暣瀹曟帡鎮欓懠鑸垫啺婵犵數鍋為崹鍫曟偡瑜忓褔鏁撴禒瀣拺闁告稑锕ゆ慨锕�霉濠婂懎浠遍柟顕�绠栭幃婊兾熼懖鈺婂晭闂備焦瀵х换鍌炲箠韫囨稑绠归柟鎵閻撱儵鏌￠崶銉ュ缂併劌顭烽弻锝夋晲閸ャ劎鍔归梺闈涙处閸旀瑩鐛幒鎴旀斀闁搞儯鍔嶉悵鏍⒒閸屾瑧绐旀繛浣冲懏宕查柛顐犲劚閸ㄥ倸鈹戦悩宕囶暡闁稿蓱閵囧嫰寮撮鍛伓婵犳鍠栭敃銊モ枍閿濆绠柣妯款嚙缁犵敻鏌熼悜妯虹仸闁伙讣绲跨槐鎾诲磼濮橆剨鎷烽崫銉х煋闁哄鍤﹀☉妯锋斀闁糕剝鐟﹀▓鎯р攽鎺抽崐褔骞忛柨瀣ㄤ簻妞ゆ劧绲块惌鎺楁煛娴ｈ宕岄柟绋匡攻瀵板嫬螣閻戞﹩鍚欓梻鍌欑缂嶅﹤螞鐠恒劎鐭嗗〒姘炬嫹鐎规洘锕㈤弫鎾绘寠婢舵ɑ瀵岄梺闈涚墕濡瑧浜搁悽鍛婄厱闁绘ɑ鐓￠崣鍕煛娴ｈ宕岄柟绋匡攻瀵板嫮浠﹂懖鈺呪攺濠碉紕鍋戦崐鎴﹀礉婵犲洤纾块柣銏㈩焾缁犳牗绻涢崱妯诲鞍闁搞倖鍨堕妵鍕箣閿濆懎濮峰┑锛勫亾閹倸顫忕紒妯诲闁告稑锕ら弳鍫濃攽椤旂》鍔熼柟铏崌閹儳鈹戠�ｎ亞顔愭繛杈剧稻閻℃洟骞楅弴銏♀拺闁圭娴风粻鎾绘煙閸欏鑰跨�殿噮鍣ｅ畷濂告偄閸涘浠ч梻鍌欐祰婵倝鏁嬮梺鎸庣☉椤︻垶鍩ユ径濞㈢喖鏌ㄧ�ｎ偅婢戦梻鍌欒兌绾爼宕滃┑瀣仭闁挎洩鎷烽柍缁樻尰閵堬綁宕橀埞鐐闂傚倸鍊搁悧濠勭矙閹惧墎涓嶉柣鎰劋閻撴洖鈹戦悩鎻掓殲缂侊拷閸垻纾兼い鏂跨仢閸氬湱绱掓潏銊ョ瑨閾伙綁姊婚敓浠嬪箛椤旂偓鏅ㄩ梻鍌氬�风粈渚�骞栭锕�鐤い鎰剁畱绾惧綊鏌ｉ悢绋款棎闁哄绉归弻锟犲炊閵夈儳浠鹃梺缁樻尰濞叉ɑ绌辨繝鍥舵晬婵犲﹤鎳庣粭锟犳⒑缁嬪尅鏀婚柛鏃�鐗犻獮鍫ュΩ閿斿墽鐦堥梺鍛婁緱閸ｎ喗绂掗埡鍛拺闁革富鍘介崵锟介柣搴㈡皑婢ф绌辨繝鍥х濞达綀鍊介妸鈺傜叆闁哄喛鎷烽柛搴＄－缁辩偤骞掑Δ浣叉嫽闂佺鏈悷銊╁礂瀹�鍕厵闁惧浚鍋呭畷宀�锟借娲滈弫璇差嚕娴犲鏁囬柣鎰問閸炵敻姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷?$缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮枟閹告娊骞冨▎鎴炲珰鐟滃海锟芥艾缍婇弻娑㈩敃閿濆棛顦ㄩ梺鍝勬噺閹倿寮婚敃锟借灒濞撴凹鍨辩瑧闂備礁鎼Λ瀵稿緤妤ｅ啨锟藉啴濡烽埡鍌氾拷鐑芥煕濞嗗浚妲搁柡瀣Т椤啴濡堕崘銊т痪闂佽崵鍟块弲娑㈡偩閻戣姤鏅插璺好￠妸褎鍠愰煫鍥ㄧ☉缁犵喓鎲搁悧鍫濈瑲闁抽攱甯￠弻娑氫沪閸撗勫櫙闂佺绻愰張顒勫Φ閸曨垰顫呴柣娆忔嚀閸氼偄螖閻橀潧浠﹂柟鐟版喘閵嗕線寮崼婵嗚�垮┑掳鍊曢崯浼存偤濡偐纾介柛灞捐壘閿熺晫鍏橀幃鐐烘晝閸屾鎷烽敃鍌氱倞妞ゆ垶鎷濋幏鐑藉川鐎涙ê娈ゅ銈嗗笂缁�渚�寮搁幋锔解拺缂備焦锕╁▓鏃堟煟濡わ拷濡稓鍒掗鐑嗘僵闁煎摜鏁搁崢浠嬫⒑鐟欏嫬鍔ょ�规洦鍓熷畷婵嬫晝閸屾稓鍘搁悗鐧告嫹閻庯綆鍓涜ⅵ闁诲孩顔栭崰妤呭箰閹惰棄绠栨繛鍡樺灦鐎氭氨鎲告惔锝忔嫹濮橆剛绉洪柡灞剧洴閺佸倻鎷犻幓鎺嶇礋闂備胶鎳撻崲鏌ュ床閺屻儻缍栨繝闈涱儐閸婇攱銇勯幒鐐村濡炪倕楠忛幏锟�
		if(clanaim.contains("$")){
			MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		int chineseCnt = 0;
		int otherCnt = 0;
		for (int i = 0; i < clanname.length(); i++) {
			// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞剧洴楠炲洭顢涘鍗烆槱缂傚倸鍊搁崯顖毭洪悢濂夋綎缂備焦蓱婵挳鏌涘☉姗堟敾闁稿孩鎸搁埞鎴︽倷閼碱剚鍕鹃梺鍛婃煥缁夊綊鐛崼銉ノ╅柨鏃傜帛鏁堥梺纭呭閹活亞寰婇崸妤佸�块柛蹇氬亹缁★拷闂佹眹鍨藉褍鐡梻浣侯焾閿曪箓寮拠宸殨闁靛濡囬々鐑芥倵閿濆骸浜為柛妯挎閳规垿鍩ラ崱妤冧哗闂佸湱鈷堥崑鍡涙儉椤忓浂妯勯梺鍝勭灱閸犳牕鐣峰Δ鍛亗閹肩补妲呭姘舵⒒娴ｅ憡鎯堥柡鍫墰缁瑩骞樼�靛壊娴勯梺鎸庢⒒閸嬫挾锟芥碍宀搁弻鐔虹磼濡桨鍒婂┑鐐靛帶闁帮絽顫忕紒妯诲闁告稑锕ラ崕鎾绘⒑閸濆嫮澧遍柛鎾寸懅閸欏懘姊虹紒妯活棃妞ゃ儲鎹囧鎶芥晝閸屾稓鍘介梺瑙勫劤绾绢厼鐣濋幖浣圭厸闁跨喕濮ょ粋鎺旓拷锝庡亞閸橀亶姊洪棃娑辨Ч闁搞劎鏁搁敓鑺ュ嚬閸欏啴銆侀弮鍫澪у璺侯儌閹锋椽姊洪悡搴綗闁稿﹥娲熷鎼佸箣閻樼數锛滃銈嗘煥閸氬锕㈤悧鍫涗簻闁靛绲介崝锔筋殽閻愬澧紒妤冨枛瀹曞爼濡搁敂鐣屽剑闂傚倸鍊风欢姘焽瑜旇棟妞ゆ劧绠戦悿鐐箾閹寸偞鐨戦柣顓炴閹鏁愭惔鈥茬按婵炲瓨绮嶇划鎾诲蓟閻斿吋鍊绘俊顖濇娴犳挳姊虹捄銊ユ灆婵☆偄瀚伴垾锕傛倻閽樺鐣炬繛鎾寸啲閹烽锟借娲栭妶鍛婁繆閻戣姤鏅滈悷娆忓椤忓綊姊婚崒娆戭槮闁硅绱曠划娆撳箣閿旇姤娅囬梺闈涱檧缁犳垹娆㈤悙鐑樼厱闁哄洢鍔岄悘锟犳煟閹惧瓨绀嬮柡宀�鍠栭幃娆擃敆娴ｈ櫣鈻忛梻浣告啞缁诲棗鈻嶉敐澶嬫櫢闁稿﹦鍣ュ鎰箾閸欏鐏寸�规洩绻濋獮搴ㄦ寠婢跺锟筋剟姊洪悷鏉库挃缂侇噮鍨跺鏌ュ箹娴ｅ湱鍙嗛梺缁樻礀閸婂湱锟芥熬鎷�
			String regexStr = CheckName.getRegexStr();
			if (clanname.substring(i, i + 1).matches(regexStr)) {
				chineseCnt++;
			} else {
				otherCnt++;
			}
		}
		double total = chineseCnt + otherCnt / 2.0;
		int factionNameLen = 5;
		if (total < 2 || total > factionNameLen) {
			MessageMgr.sendMsgNotify(roleid, 145088, null);
			return;
		}
		if (clanaim.length() == 0) {
			MessageMgr.sendMsgNotify(roleid, 145091, null);
			return;
		}
		if (clanaim.length() > fire.pb.clan.srv.ClanManage.AIMWORD_MAX) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 145112, null);
			return;
		}
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				return ClanBaseManager.getInstance().createClan(roleid, clanname, clanaim);
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808450;

	public int getType() {
		return 808450;
	}

	public java.lang.String clanname; // 公会名字
	public java.lang.String clanaim; // 公会宗旨（公告）

	public CCreateClan() {
		clanname = "";
		clanaim = "";
	}

	public CCreateClan(java.lang.String _clanname_, java.lang.String _clanaim_) {
		this.clanname = _clanname_;
		this.clanaim = _clanaim_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(clanname, "UTF-16LE");
		_os_.marshal(clanaim, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		clanname = _os_.unmarshal_String("UTF-16LE");
		clanaim = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CCreateClan) {
			CCreateClan _o_ = (CCreateClan)_o1_;
			if (!clanname.equals(_o_.clanname)) return false;
			if (!clanaim.equals(_o_.clanaim)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += clanname.hashCode();
		_h_ += clanaim.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(clanname.length()).append(",");
		_sb_.append("T").append(clanaim.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

