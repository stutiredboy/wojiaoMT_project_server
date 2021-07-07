package fire.pb.clan;

import fire.log.beans.FactionOpbean;

import fire.pb.talk.MessageMgr;
import fire.pb.util.StringValidateUtil;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangeClanAim__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChangeClanAim extends __CChangeClanAim__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;

		if (!fire.pb.util.StringValidateUtil.checkIllegalWord(newaim)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 142261, null);
			return;
		}
		if (!StringValidateUtil.checkValidName(newaim)) {
			MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欑粈鍐┿亜閺囧棗娲ら悡姗�鏌熸潏楣冩闁稿鍔欓弻娑樷枎韫囷絾效闂佽鍠楅悷褏妲愰幘瀛樺闁告繂瀚烽敓钘夌焸閺屾盯濡搁妷褍鐓熼悗娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞楅梻渚�娼х换鍫ュ春閸曨垱鍊块柛鎾楀懐锛滈梺褰掑亰閸欏骸鈻撳鍫熺厸鐎癸拷閿熶粙宕伴弽顓炶摕闁搞儺鍓氶弲婵嬫煥閻斿墎鐭欑�规洘绻堥獮鎺楀箻閸撲緡鍟庨柣搴ｆ嚀婢瑰﹪宕伴弴鐘哄С闁煎鍊楃壕濂告煟濞嗗繑鍣界紒澶樺櫍閺屸�崇暆鐎ｎ剙鍩岄柧浼欑秮閺屾稖绠涢幘铏�┑顕嗙到鐎氭澘顫忛搹鍦＜婵☆垵娅ｉ悷銊╂⒑閸涘﹨澹樻い鎴濇喘楠炴垿濮�閻橆偅顫嶉梺闈涚箳婵兘顢欓幒妤佺厽閹艰揪绲鹃弳鈺傘亜椤撶偟澧︾�殿喗濞婇弫鎾绘偐閺傘儲瀚奸柣鐔哥矌婢ф鏁埡浣勬盯骞嬮敂鐣屽幈闂婎偄娲﹀Λ鎴︽嚀鐠侯煉鎷峰▓鍨灈妞ゎ厾鍏橀獮鍐閵忕姵鐎抽柡澶婄墑閸斿秴鈻嶉弽銊х瘈婵炲牆鐏濋弸鐔兼煥濮樻唻鎷风憴鍕闁告挾鍠栧畷娲川鐎涙ê浠洪梺鍛婄☉閿曘倝鏁撻悾灞炬毈闁诡喖鍢查埢搴ょ疀閹垮啩鐥紓鍌欑筏閹风兘鏌ㄩ悢鍓佺煓闁诡喗顨堥幉鎾礋椤掞拷椤︹晠姊洪崨濠冨暗闁哥姵鐗曢悾宄懊洪鍕庛劑鏌ㄩ弴顏呭缂備礁澧庨崑娑㈠煘閹达附鍊烽梻鍫熺◥婢规洟姊虹拠鏌ヮ�楁い顓炲槻铻為柛娑欐儗閺佸啴鏌曡箛濠忔嫹閹颁焦袩濠电姷鏁搁崑娑橆嚕閸洘鍋嬫繝濠傛噺椤洟鏌ｉ幇顔煎妺闁哄懏鎮傞弻銊╂偆閸屾稑顏�?$缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮枟閹告娊骞冨▎鎴炲珰鐟滃海锟芥艾缍婇弻娑㈩敃閿濆棛顦ㄩ梺鍝勬噺閹倿寮婚敃锟借灒濞撴凹鍨辩瑧闂備礁鎼Λ瀵稿緤妤ｅ啨锟藉啴濡烽埡鍌氾拷鐑芥煕濞嗗浚妲搁柡瀣Т椤啴濡堕崘銊т痪闂佽崵鍟块弲娑㈡偩閻戣姤鏅插璺好￠妸褎鍠愰煫鍥ㄧ☉缁犵喓鎲搁悧鍫濈瑲闁抽攱甯￠弻娑氫沪閸撗勫櫙闂佺绻愰張顒勫Φ閸曨垰顫呴柣娆忔嚀閸氼偄螖閻橀潧浠﹂柟鐟版喘閵嗕線寮崼婵嗚�垮┑掳鍊曢崯浼存偤濡偐纾介柛灞捐壘閿熺晫鍏橀幃鐐烘晝閸屾鎷烽敃鍌氱倞妞ゆ垶鎷濋幏鐑藉川鐎涙ê娈ゅ銈嗗笂缁�渚�寮搁幋锔解拺缂備焦锕╁▓鏃堟煟濡わ拷濡稓鍒掗鐑嗘僵闁煎摜鏁搁崢浠嬫⒑鐟欏嫬鍔ら柣掳鍔庣划鍫ュ醇閵夛妇鍘甸梺鍦帛鐢宕悙鐑樼厵妞ゆ牗绋掗ˉ鍫濃攽閳╁啯鍊愰柡浣瑰姌缁犳盯寮▎鍙ョ处闂傚倷绀侀幉锟犲礉閿曞倸绐楅柡宥庡幘瀹撲線鏌曡箛銉х？缂佺娀绠栭弻鐔猴拷鐢殿焾閸撻亶鏌ｉ幒宥囩煓闁哄矉绱曟禒锕傛偄瀹勭増鐏撳┑鐐存尭椤兘寮婚弴銏犻唶婵犻潧娴傚Λ鐐电磽娴ｈ娈曢悽顖ょ節楠炲啫螖閿熶粙锝炲┑瀣亗閹艰揪绱曢惈鍕煟鎼淬値娼愭繛鍙夛耿瀹曟繂鈻庤箛鏇熸婵犻潧鍊婚…鍫ュ础閹惰姤鐓熼柡鍌涘閹牊顨ラ悙鎼疁婵﹦绮幏鍛村传閵夘灝銊╂⒑缁嬫鍎忛柨鏇ㄤ簻閻ｉ鎲撮崟顐殼闁诲孩绋掗敋濞存粍顨婂楦裤亹閹烘垳鍠婇梺鍛婎焾椤绮嬪鍜佺叆闁割偆鍠撻崢顏呯節閵忥絾纭鹃柣妤�妫濆畷婵堬拷娑櫭肩换鍡涙煕濞嗗浚妲归柕鍥ㄧ箞閺屸�崇暆閿熶粙宕伴弽褏鏆﹂柨婵嗘缁剁偤鎮楅敐搴濇倣闁归鍏橀獮鍥敋閸℃ê顏跺┑鐐茬墕閻忔繈寮稿☉銏＄厽闁哄诞浣镐划闂佺粯渚楅崳锝夌嵁閸ヮ剦鏁囬柣鏂垮槻婵¤櫕淇婇悙顏勶拷鏍ь潖瑜版帒鍑犻柤濮愬�栭～鏇熶繆閵堝懏鍣洪柍閿嬪浮閺屾稓浠﹂崜褎鍣銈忚缁犳捇寮婚悢鍝勬瀳闁告鍋橀崰濠囨倵濞堝灝鏋ら柡浣割煼閵嗕礁螖閸涱厾锛滃┑鐘诧工閹虫劙宕㈤鐐粹拻濞达絼璀﹂弨浼存煙濞茶绨界紒顔碱煼楠炲鏁傞挊澶夌暗闂備胶鍋ㄩ崕鏌ュ礈濮樿埖鍋勯柛鈩冪♁閸嬶綁寮堕悙鏉戭�滄い鎺斿枛閺岋綁骞欓崘銊ヮ潽缂備胶绮粙鎾跺垝椤撱垹浼犻柛鏇ㄥ亽濞煎酣姊绘担鍛婃儓闁哄牜鍓熼幆鍕敍閻愵亷鎷锋笟锟藉鎾閳╁啯鐝抽梻浣规偠閸庮噣寮插┑瀣辈闁绘鏁哥壕浠嬫煕鐏炲墽鎳呴柛鏂跨Ч閺屾盯鎮欑捄鍝勬優缂備浇浜崑鐐电箔閻斿吋鏅搁柦妯侯樈閸ゆ洖鈹戦悩宕囶暡闁哄懏褰冮…璺ㄦ崉娓氼垰鍓版繛瀛樼矋缁挸顫忓ú顏勫窛濠电姴瀚槐浼存⒑缁嬪灝顒㈠┑鐐诧躬楠炲啴鍩勯崘鈺侇�撶紓渚囧灡濞叉﹢寮敓浠嬫⒒娴ｈ櫣甯涢柨鏇楁櫊瀹曚即寮介鐔凤拷鑸点亜韫囨挾澧涢柣鎾卞劦閺岋繝宕堕…瀣典邯閹﹢鍩￠崨顔惧幗闂佹寧绻傚ú銈夊储鐎涙﹩娈介柣鎰级閸犳锟芥鍠栭悥鐓庣暦缁嬭鏃�鎷呯憴鍕殽濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氬湱鎲搁弮鍫㈠祦闊洦绋掗崐濠氭煠閹帒鍔ら柛娆忓暣濮婃椽宕ㄦ繝鍌毿曟繛瀛樼矋缁挸顕ｇ粙搴撴闁靛骏绱曢崢鎼佹煟韫囨洖浠滃褌绮欓崺銉﹀緞閹邦厾鍘撻梺鑺ッˇ钘壩熼敓浠嬫倵鐟欏嫭绌跨紒缁樼箞楠炲啫鈻庨幋顖涘闁汇垹鎲″▍婊堟煙閼碱剙浜剧紒缁樼箞閹粙妫冨ù璁圭稻閵囧嫰寮敓浠嬫偋閻樿尙鏆﹂悷娆忓椤曢亶鏌熺喊鍗炲箺闁哄拋浜滈—鍐Χ閸℃ê鏆楁繝娈垮枤閺佸鏁愰悙鍝勫嵆闁靛骏绱曢崢鐢告⒑缂佹ê鐏﹂拑杈ㄣ亜閵夛妇澧甸柡宀�鍠愰ˇ鐗堟償閳ュ啿绠ｉ梻浣芥〃閻掞箓宕濋弽顓炵畾闁哄啫鐗嗛悘宕囷拷瑙勬礀濞村倿宕崼銏㈢＝闁稿本鐟ㄩ崗宀勬煣韫囨捇鍙勭�规洏鍨虹缓浠嬪川婵犲倷鍑藉┑鐘绘涧閸婂鈥﹂崼銉﹀珔闁绘柨鎽滅粻楣冩煙鐎电鍓遍柣鎺撴倐閺岋綁寮崒姘闁诲孩纰嶅畝鎼佸蓟濞戞ǚ鏋庨煫鍥风稻姝囬梻浣界毇閸屾粌濡界紓浣虹帛缁诲倿鍩㈤幘璇插瀭妞ゆ梻鏅禍顏堟⒒娴ｇ懓顕滄繛鎻掔箻瀹曟洟鏌嗗渚婃嫹閺冨牆绀冮柍鍝勫枤濞村嫰鏌ｆ惔顖滅У濞存粎鍋ら幃鎯洪鍛嫼闂佸搫鍊堕崕鎻掆枍閸涘瓨鐓曢柣鏇氱閻忥妇锟借娲樺ú鐔煎箖閵忋倕绀傞悘蹇旂墬鐎垫牠姊绘担瑙勫仩闁稿孩妞藉畷婊冣枎閹惧啿寮烽梺闈涱槴閺呮粓鎮￠悢鍏肩厵闂侇叏绠戦弸娑㈡煕閺傛鍎旈柡灞界Ч閺屻劎锟斤綆浜炴导宀勬⒑閸濆嫮鐏遍柛鐘虫尵閸掓帒鈻庨幘鍐茬�銈嗘礀閹冲孩淇婃搴ｇ＝濞达絿顭堥埛鏃堟煕鐎ｎ偅宕屾鐐插暣瀹曟帡鎮欓懠鑸垫啺婵犵數鍋為崹鍫曟偡瑜忓褔鏁撴禒瀣拺闁告稑锕ゆ慨锕�霉濠婂懎浠遍柟顕�绠栭幃婊兾熼懖鈺婂晭闂備焦瀵х换鍌炲箠韫囨稑绠归柟鎵閻撱儵鏌￠崶銉ュ缂併劌顭烽弻锝夋晲閸ャ劎鍔归梺闈涙处閸旀瑩鐛幒鎴旀斀闁搞儯鍔嶉悵鏍⒒閸屾瑧绐旀繛浣冲懏宕查柛顐犲劚閸ㄥ倸鈹戦悩宕囶暡闁稿蓱閵囧嫰寮撮鍛伓婵犳鍠栭敃銊モ枍閿濆绠柣妯款嚙缁犵敻鏌熼悜妯虹仸闁伙讣绲跨槐鎾诲磼濮橆剨鎷烽崫銉х煋闁哄鍤﹀☉妯锋斀闁糕剝鐟﹀▓鎯р攽鎺抽崐褔骞忛柨瀣ㄤ簻妞ゆ劧绲块惌鎺楁煛娴ｈ宕岄柟绋匡攻瀵板嫬螣閻戞﹩鍚欓梻鍌欑缂嶅﹤螞鐠恒劎鐭嗗〒姘炬嫹鐎规洘锕㈤弫鎾绘寠婢舵ɑ瀵岄梺闈涚墕濡瑧浜搁悽鍛婄厱闁绘ɑ鐓￠崣鍕煛娴ｈ宕岄柟绋匡攻瀵板嫮浠﹂懖鈺呪攺濠碉紕鍋戦崐鎴﹀礉婵犲洤纾块柣銏㈩焾缁犳牗绻涢崱妯诲鞍闁搞倖鍨堕妵鍕箣閿濆懎濮峰┑锛勫亾閹倸顫忕紒妯诲闁告稑锕ら弳鍫濃攽椤旂》鍔熼柟铏崌閹儳鈹戠�ｎ亞顔愭繛杈剧稻閻℃洟骞楅弴銏♀拺闁圭娴风粻鎾绘煙閸欏鑰跨�殿噮鍣ｅ畷濂告偄閸涘浠ч梻鍌欐祰婵倝鏁嬮梺鎸庣☉椤︻垶鍩ユ径濞㈢喖鏌ㄧ�ｎ偅婢戦梻鍌欒兌绾爼宕滃┑瀣仭闁挎洩鎷烽柍缁樻尰閵堬綁宕橀埞鐐闂傚倸鍊搁悧濠勭矙閹惧墎涓嶉柣鎰劋閻撴洖鈹戦悩鎻掓殲缂侊拷閸垻纾兼い鏂跨仢閸氬湱绱掓潏銊ョ瑨閾伙綁姊婚敓浠嬪箛椤旂偓鏅ㄩ梻鍌氬�风粈渚�骞栭锕�鐤い鎰剁畱绾惧綊鏌ｉ悢绋款棎闁哄绉归弻锟犲炊閵夈儳浠鹃梺缁樻尰濞叉ɑ绌辨繝鍥舵晬婵犲﹤鎳庣粭锟犳⒑缁嬪尅鏀婚柛鏃�鐗犻獮鍫ュΩ閿斿墽鐦堥梺鍛婁緱閸ｎ喗绂掗埡鍛拺闁革富鍘介崵锟介柣搴㈡皑婢ф绌辨繝鍥х濞达綀鍊介妸鈺傜叆闁哄喛鎷烽柛搴＄－缁辩偤骞掑Δ浣叉嫽闂佺鏈悷銊╁礂瀹�鍕厵闁惧浚鍋呭畷宀�锟借娲滈弫璇差嚕娴犲鏁囬柣鎰問閸炵敻姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷?$缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮枟閹告娊骞冨▎鎴炲珰鐟滃海锟芥艾缍婇弻娑㈩敃閿濆棛顦ㄩ梺鍝勬噺閹倿寮婚敃锟借灒濞撴凹鍨辩瑧闂備礁鎼Λ瀵稿緤妤ｅ啨锟藉啴濡烽埡鍌氾拷鐑芥煕濞嗗浚妲搁柡瀣Т椤啴濡堕崘銊т痪闂佽崵鍟块弲娑㈡偩閻戣姤鏅插璺好￠妸褎鍠愰煫鍥ㄧ☉缁犵喓鎲搁悧鍫濈瑲闁抽攱甯￠弻娑氫沪閸撗勫櫙闂佺绻愰張顒勫Φ閸曨垰顫呴柣娆忔嚀閸氼偄螖閻橀潧浠﹂柟鐟版喘閵嗕線寮崼婵嗚�垮┑掳鍊曢崯浼存偤濡偐纾介柛灞捐壘閿熺晫鍏橀幃鐐烘晝閸屾鎷烽敃鍌氱倞妞ゆ垶鎷濋幏鐑藉川鐎涙ê娈ゅ銈嗗笂缁�渚�寮搁幋锔解拺缂備焦锕╁▓鏃堟煟濡わ拷濡稓鍒掗鐑嗘僵闁煎摜鏁搁崢浠嬫⒑鐟欏嫬鍔ょ�规洦鍓熷畷婵嬫晝閸屾稓鍘搁悗鐧告嫹閻庯綆鍓涜ⅵ闁诲孩顔栭崰妤呭箰閹惰棄绠栨繛鍡樺灦鐎氭氨鎲告惔锝忔嫹濮橆剛绉洪柡灞剧洴閺佸倻鎷犻幓鎺嶇礋闂備胶鎳撻崲鏌ュ床閺屻儻缍栨繝闈涱儐閸婇攱銇勯幒鐐村濡炪倕楠忛幏锟�
		if(newaim.contains("$")){
			MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		
		
		if (newaim.length() == 0) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 145091, null);
			return;
		}
		if (newaim.length() > fire.pb.clan.srv.ClanManage.AIMWORD_MAX) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 145112, null);
			return;
		}
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				xbean.ClanInfo clanInfo = ClanUtils.getClanInfoById(roleid, false);
				if (clanInfo == null) {
					fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 145077, null);
					return false;
				}
				if (clanInfo.getClanmaster() != roleid && clanInfo.getClanvicemaster() != roleid) {
					fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 150127, null);
					return false;
				}
				clanInfo.setClanaim(newaim);
				mkdb.Procedure.psendWhileCommit(roleid, new SChangeClanAim(newaim));
				fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 145074, null);
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨绘い鎺嬪灪閵囧嫰骞囬姣挎捇鏌熸笟鍨妞ゎ偅绮撳畷鍗炍旈敓浠嬪煕閹烘鈷戠紓浣姑粭鍌滅磼椤旂晫鎳囩�殿喖顭锋俊鍫曞幢濡搫浼庨梻浣哥秺閸嬪﹪宕滈妸鈺佺闁绘垼妫勯崘锟藉銈嗗姦閸撴氨锟芥俺顫夐幈銊ヮ潨閸℃鈷掗梺缁樻尭閵堟悂寮婚垾宕囨殕閻庯綆鍓涜ⅵ闁诲孩顔栭崳顕�宕抽敐鍛殾闁圭儤鍩堝鈺傘亜閹达絾纭堕悽顖涚〒缁辨捇宕掑顒婃嫹妞嬪孩顐介柕鍫濐槸缁狀垳锟界懓瀚伴崑濠囨偄閸℃稒鍋ｅΔ锔藉椤忕娀鏌ｉ幒鎴炲仴闁哄瞼鍠愰ˇ鐗堟償閳ュ啿绠ｉ梻浣筋嚃閸ㄤ即宕愰崹顔炬殾闁靛濡囩弧锟介梺绋胯閸婃挾妲愰敃鍌涒拻闁稿本鑹鹃敓浠嬵棑缁牊绗熼敓浠嬬嵁婢舵劕鐏抽悺鎺嶇劍濡炰粙寮崘顔肩＜婵ɑ鍞荤槐閬嶆⒒娴ｈ櫣銆婇柛鎾寸箘缁瑩骞掑Δ锟界壕濠氭煕瀹�锟介崑鐐烘偂濞嗘挸绾ч柛顐犲劤閻ｇ儤淇婄紒銏犳珝闁哄苯绉归弻銊э拷锝庝簽娴煎矂姊洪崫鍕拱缂佸鍨块崺鐐哄箣閿曪拷楠炪垺淇婇妶鍜冩闁汇儺浜弻锝嗘償閿濆棗娈岄梺纭咁嚋缁辨洟骞戦姀銈呴唶闁靛鍎撮幗鏇炩攽閻愭潙鐏熼柛銊︽そ瀹曟垿骞囬悧鍫㈠幐闁诲繒鍋犻褔宕濆鎲嬫嫹濞堝灝鏋熸繝銏★耿閳ユ棃宕橀鍢壯囨煕閹扳晛濡垮ù鐘插⒔缁辨帡鎮欓浣哄嚒缂備礁顦伴幐鎶藉灳閿曞倸鐐婃い蹇撴閺夌鈹戦悙鏉戠仸妞ゎ厼鍊块崺锟犲川椤旀儳寮抽梻浣告惈濞村倹绂嶅┑鍫嫹濮橆剛绉洪柟顔筋殔閳绘捇宕归鐣屼邯闂備浇顕х换鎴犳崲閸儱鏄ラ柣鎰惈缁狅綁鏌ㄩ弮鍌滃笡闁哄應鏅濈槐鎾存媴閸︻厸妲堝銈嗗灥濡繈銆佸Ο濂芥椽顢旈崨顏呭闂備線娼荤�靛矂宕㈡總绋垮偍闁圭虎鍠楅悡娑㈡煥閻斿墎鐭欓柡灞芥椤撳ジ宕ㄩ崒锔剧暤闁哄本鐩鎾Ω閵壯傚摋闂佹悶鍎查幐鍐差潖濞差亜宸濆┑鐘辫兌缁讳線姊洪崨濠勬噧缂佺粯锕㈤悰顔跨疀濞戞瑥锟藉鏌﹀Ο渚Ц闁诲寒鍘奸—鍐Χ閸℃顦ラ梺鐟板暱妤犳悂鍩㈤幘璇参╅柍鍝勫�甸幏娲煟閻斿摜鎳冮悗姘煎墴瀹曟繈鎳滈崗鍝ョ畾濡炪倖鍔戦崹褰掝敂閳哄懏鐓涘〒姘搐濞呭秵鎱ㄦ繝鍕笡闁瑰嘲鎳愮划娆撳箰鎼淬垻妲梻鍌欑濠�閬嶅煕閸儱纾诲┑鐘插�婚弳锕傛煙閹殿喖顣奸柛瀣ㄥ妿缁辨帞锟斤綆鍘界涵鑸点亜閺傛寧顥㈡慨濠冩そ瀹曘劍绻濋崟顓犳殼闂佽瀛╅懝楣冨床閺屻儱违闁圭儤鎸剧弧锟藉┑顔斤供閸橀箖宕㈤鍫熲拺闁告挻褰冩禍婵堢磼鐠囨彃鏆ｉ挊鐔哥節婵犲倹鍣界痪鎯у悑娣囧﹪濡惰箛鏂款伓闂備胶顭堥敃銈咁焽閳ユ剚鍤曞┑鐘崇閺呮彃顭跨捄鐚村姛妞ゆ柨锕铏圭磼濡搫顫屽┑鈽嗗灠閿曘倗鍙呭銈嗘尵閸犳挾绮绘ィ鍐╁�垫繛鎴炵懐閻掍粙鏌ｉ鐑嗗剶闁哄瞼鍠栭、娆撴偂鎼搭垱瀚归柛褎顨呰繚婵炶揪绲芥竟濠傤焽閵娾晜鐓ラ柣鏂垮閻瑦顨ラ悙鎻掓殻闁糕晪绻濆畷銊╊敇閻欙拷濡蹭即姊绘担鍛婂暈闁荤喆鍎佃棟闂侇剙绉甸弲绋棵归悩宸剳闁伙絿鍎ら幈銊︾節閸曨厼绗￠梺鐟板槻閹虫ê鐣烽妸锔剧瘈闁告劑鍔屾竟宥呪攽閿涘嫬浜奸柛濞у拑鎷烽棃娑氱劯鐎规洖缍婂畷濂稿即閻愮數鏆繝纰樻閸ㄧ敻濡撮敓浠嬫煛閿熻姤绂掔�ｎ偄锟界敻鏌ㄥ┑鍡涱�楀ù婊勭箖缁绘盯宕ㄩ銏紙濠殿喖锕ュ浠嬪箠閻愬搫唯闁告劕褰為柇顖炴寠濠靛枹褰掑礂閸忚偐绋囩紒鐐劤椤兘寮婚弴鐔虹彾妞ゆ牗姘ㄦ牎闁诲孩淇洪～澶屾崲濞戙垹閱囨繝闈涚墔閾忓酣姊洪崫鍕靛剱缂佸甯℃俊鐢稿礋椤栵絾鏅ｉ梺缁樺姇瀵湹绨洪梻鍌欐缁鳖喚寰婇崸妤�绀傛俊顖濐唺缁诲棝鏌熼梻瀵割槮闁绘挻绋戦埞鎴︽偐閹绘帗娈插┑鐐叉噺閹瑰洤顫忕紒妯诲闁芥ê锛嶉幘缁樼叆婵﹩鍘规禍婊堟煥閺冨洦纭堕柣顓熺懇閺屸剝鎷呯憴鍕３闂佺懓纾崑銈嗕繆閻戣姤鏅濋柨鐔烘櫕婢规洟宕樺ù瀣杸濡炪倖姊婚妴瀣绩缂佹ü绻嗛柣鎰煐椤ュ鎽堕悙鐑樼厱闁逛即娼ч弸娑㈡煟閹惧鈽夐棁澶愭煥濠靛棙鎼愰柛鏂款儑閹喖鈻庨幘绮规嫽闂佺鏈悷褔藝閿曞倹鐓欓柣姘殠閸婃牠骞婂畝锟界槐鎾诲磼濞嗘垼绐楅梺鍝ュУ椤ㄥ﹪鐛幇顔剧＜婵☆垰鐨烽弨铏節閻㈤潧孝婵炶绠撳畷鎰節濮橆厾鍙冨┑鈽嗗灟鐠�锕�危濞差亝鐓曟俊顖滅帛閸婃劖鎱ㄦ繝鍛仩缂侇喗鐟╅獮鎰償閵忊�愁伆缂傚倸鍊风欢锟犲窗閺嶎厽鍎楅柛宀�鍋為崑妯汇亜閺冨倵鎷￠柛姘儏椤法鎹勬笟顖氬壃闂佸綊顥撶划顖滄崲濞戞瑦缍囬柛鎾楀憛姘節濞堝灝鏋旈柛濠冾殔閳藉鎮界粙鍧楀敹闂佸搫娲ㄩ崰鎾诲储闁秵鈷戦柟绋挎捣缁犳挾绱掔紒妯烘诞闁诡噣绠栧畷褰掝敃椤愶綆鍟嶉梻浣虹帛閸旀浜稿▎鎴犱笉濠电姵纰嶉悡娑樏归敐鍫綈鐎规洖鐭傞弻鈩冩媴鐟欏嫬纾抽梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�?
				String name=xtable.Properties.selectRolename(roleid);
				if (name != null) {
					fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(clanInfo.getMembers().keySet(), 160367, 0,
							java.util.Arrays.asList(name, newaim));
				}
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鏉戭潩鏉堚敩銏ゆ⒒娴ｈ鍋犻柛搴㈡そ瀹曟粓鏁冮崒姘�梺鍛婂姦閸犳鎮￠妷鈺傜厸闁搞儲婀圭花濂告倵濮橆剛绉烘慨濠傛惈鏁堥柛銉戝秵瀚规俊銈呮噹绾惧鏌熼幑鎰厫鐎规洖寮剁换婵嬫濞戞瑥绐涚紓浣叉閹风兘姊绘担渚劸闁哄牜鍓涢崚鎺戠暆閸曗晪鎷烽崒鐐存優闁革富鍘鹃敍婵囩箾閹剧澹橀柨鏇樺劤閿熻姤淇洪～澶屾崲濠靛顫呴柨婵嗘閵嗘劕顪冮妶鍡楃仴婵☆偅绻傞悾鐑芥晲閸垻鏉搁梺鍝勫�告晶鐣岀不濮樿埖鈷戦梻鍫熺〒婢ф洟鏌熷畡閭﹀剶鐎规洘娲熼獮鍥偋閸繐鎷烽崹顐ｅ弿婵☆垰娼￠崫娲煕閵堝繑瀚归梻浣稿⒔缁垶鎮ч悩璇茶摕闁挎繂鎷嬪銊╂煥閻旂粯顥夋い顓炴穿椤﹀磭绱掗崒娑樼瑨妞ゎ厹鍔戝畷鐔碱敂閸℃瑧鏆板┑锛勫亼閸婃牠宕濊瀵板﹦鎹勯妸褌绗夐梺缁樺姉椤ｎ噣骞忓畡鎵虫灁闁割煈鍠楅悵顕�姊虹粙娆惧剰闁挎洦浜幃浼搭敊閸㈠鍠撳☉鐢告煥鐎ｎ亶浼撻梻鍌氬�搁悧濠勭矙閹次诲绠涢弮鍌滎啎闂佸搫顦伴崹鐢割敂椤撱垺鐓涚�癸拷鐎ｎ剛蓱闂佽鍨卞Λ鍐�佸☉姗嗙叆闁告稑鎷戠紞浣割潖閾忓湱鐭欐繛鍡樺劤閸撴澘鈹戦埥鍡椾簼缂佽鍊块幃楣冩倻閽樺娼婇梺闈涚墕閹虫劙顢欓幇顓犵閺夊牆澧介崚浼存煕濡崵鐭掓鐐茬箰鐓ゆい蹇撴噳閹锋椽姊洪崨濠勨槈闁挎洩绠撻崺銉﹀緞閹邦厾鍙嗛梺鍝勬处閿氶柨鐔诲Г閻楃娀鐛崼銉ノ╂い顓熷灦闉嬬紓鍌氬�峰ù鍥ㄣ仈閸濄儲鏆滈柨鐔哄Т缁犳牠鏌嶉崫鍕櫣缂侊拷閸愵喗鐓犵痪鏉垮船閸樺摜绱掓潏銊х疄闁哄矉绲鹃幆鏃堝Χ鎼淬垻绉锋繝鐢靛仜瀵爼鈥﹂崶顒�绠查柕蹇嬪�曠壕濂告煟閹存繃宸濈紒瀣箰閳规垿鎮╃紒妯婚敪濠电偠顕滄俊鍥╂閻愬搫鐐婃い鎺嶈兌閸樻捇姊洪崨濠勭畵閻庢凹鍓熷鎼佹晜閸撗咃紲闁哄鐗勯崝宀�寰婃繝姘厓閻熸瑥瀚悘鎾煙椤旂晫鎳呴柨鐔诲Г缁嬫帡鈥﹂崶鈺冪煓闁搞儺鍓氶埛鎴︽煕濞戞﹫榫氬瑙勆戦妵鍕箣濠垫劖鈻堝Δ鐘靛仜閸熸挳骞冨鍫熷殟闁靛闄勯悵鏇㈡⒒娴ｇ瓔娼愰柛搴㈠▕楠炲﹨绠涢弴顏呭婵ɑ鍓氬鎰版煙娓氬灝濡奸摶锝夋煟閹惧磭鍑瑰瑙勬礋閺岋絾鎯旈姀銏犳殹闂佺懓鍤栭幏锟�
				xbean.ClanMemberInfo fmi = clanInfo.getMembers().get(roleid);
				FactionOpbean factionOpbean = new FactionOpbean(clanInfo.getKey(), clanInfo.getClanname(), 
						FactionOpbean.TYPE_CHANGE_AIM, fmi.getClanposition(), clanInfo.getMembers().size(),
						clanInfo.getClanlevel(), clanInfo.getHouse().entrySet());
				int weekpoint=fire.pb.clan.srv.ClanManage.getWeekclanpoint(roleid,clanInfo);
				fire.log.YYLogger.factionOPEventLog(roleid, factionOpbean,weekpoint);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808459;

	public int getType() {
		return 808459;
	}

	public java.lang.String newaim;

	public CChangeClanAim() {
		newaim = "";
	}

	public CChangeClanAim(java.lang.String _newaim_) {
		this.newaim = _newaim_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(newaim, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		newaim = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangeClanAim) {
			CChangeClanAim _o_ = (CChangeClanAim)_o1_;
			if (!newaim.equals(_o_.newaim)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += newaim.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(newaim.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}
