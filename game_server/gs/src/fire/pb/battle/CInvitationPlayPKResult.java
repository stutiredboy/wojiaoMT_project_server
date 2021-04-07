
package fire.pb.battle;

import java.util.Arrays;

import fire.pb.PropRole;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.talk.MessageMgr;


import fire.pb.team.Team;
import fire.pb.team.TeamManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CInvitationPlayPKResult__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CInvitationPlayPKResult extends __CInvitationPlayPKResult__ {
	@Override
	protected void process() {
		// protocol handle 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕妞ゎ偄顦遍敓浠嬫涧閵堢顕ｉ崼鏇炵闁绘ê鐏氬В搴㈢節閻㈤潧浠﹂柟绋款煼閹垽顢楅崟顐ゎ唵婵＄偛顑呴崙浠嬪箯妞嬪孩鍠嗛柛鏇ㄥ墰閿涙﹢姊虹粙鎸庡攭婵炲懏娲滅划瀣箳濡や焦娅囬梺绋挎湰濮樸劑鎮炬ィ鍐╁仭婵犲﹤鍟版晥闁芥鍠撻敓钘夌畭閸庨亶藝娴兼潙鐓曢柟杈鹃檮閻撴洘绻涢幋鐑囧叕鐎规悶鍎崇槐鎺懳旀担鍝ョ懖缂備胶绮粙鎾寸閿曞倸纾兼慨姗嗗墻濞煎酣姊洪懞銉劷闁哥姵鐗犲濠氬Ω閳哄倸浜為梺绋挎湰缁嬫垿顢旈敓锟�
		final long guestid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (guestid<0){
			return;
		}
		if(acceptresult==1){
			//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴閺佹劙宕ㄩ褏锟界兘姊绘担绋垮笭缂侀硸鍣ｉ獮蹇涙晸閿燂拷?濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏灪閸嬨倝鏌曟繛褍鍟悘濠囨倵楠炲灝鍔氭い锔垮嵆瀹曟洘鎯旈妸锔惧弳闂佺粯娲栭崐鍦拷姘炬嫹?闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曢妶蹇斿婵鍘ф晶浼存煙楠炲灝鐏叉鐐村浮瀵噣鏁撴禒瀣辈婵犲﹤鐗婇悡鏇㈡煃閳轰礁鏆熼柍鍙ョ窔閺岋綁骞橀崡鐐插缂備胶绮惄顖炵嵁鐎ｎ喗鍊婚柛鈩冪懃婵ジ姊虹拠鎻掝劉缁炬澘绉电粩鐔煎幢濞嗘劦娼熼梺鍦亾閸撴岸宕ョ�ｎ喗鐓曟繝濠忔嫹缂侊拷娓氾拷瀹曟粓宕奸弴鐔凤拷鐢告偡濞嗗繐顏紒锟介崘顏嗙＜妞ゆ棁鍋愰悞鍛娿亜閵忊埄鎴犵紦閻ｅ瞼鐭欓柛顭戝枦閿熻棄鐏濋埞鎴﹀煡閸℃浠梺绋垮閸ㄥ湱鍒掓繝姘闁挎洩鎷烽柣鎾拷鎰佺唵闁兼悂娼ф慨鍥╃磼閻樺搫鍚归柨鐔凤拷鐕佹綈婵炲弶鐗曢埢鏃堟晝閸屾稒娅滈梺绯曞墲濞叉粎绮诲鑸碘拺闁告稑锕﹂幊鍐┿亜閿斿灝宓嗙�规洘鍔欓獮鍥敋閸℃ê顏堕柣鐔哥懃鐎氼厾绮堥崼銉︾厱闊洦鏋忛幋鐐碘攳濠电姴娲ょ粻鐟懊归敐鍫濓拷鍊燁樄闁哄本鐩俊鐑芥晜閼恒儳锟筋垳绱撴担浠嬪摵闁挎洏鍨藉濠氭晲閸℃ê鍔呴梺闈涚箚閺呮盯寮查柆宥嗏拺闁告縿鍎辨牎缂佺偓婢樼粔褰掔嵁閸儱惟闁宠桨鑳舵鍥⒑鐟欏嫭鍎楅柛銊ф暬閺佹捇鎸婃径瀣淮闂佸搫鐬奸崰鎾舵閹烘顫呴柣妯虹－娴滎亪姊绘担铏瑰笡闁告梹娲熼弫鍐敂閸繆鎽曢梺缁樻⒒閸樠呯不濮樿鲸鍠愰幖娣妼闂傤垶鏌ｉ敐鍛伇缁炬儳銈搁弻銊╂偄鐠囨畫鎾讹拷鍨緲鐎氫即鐛崶顒夋晣闁绘ɑ褰冪粻銉╂⒒娴ｇ瓔鍤欓悗娑掓櫇缁瑩骞掑浼欐嫹閿曞倸鐐婇柕濠忛檮閻濈兘姊虹捄銊ユ珢闁瑰嚖鎷�?闂傚倸鍊搁崐椋庣矆娓氾拷楠炲鍩勯崘顏嗘嚌濠德板�曢幊搴ｇ玻濡や椒绻嗛柕鍫濇噹閺嗙喖鏌熼崘鍙夊櫤缂佺粯绻堥幃浠嬫濞戞鍕冮梻浣规偠閸斿矂鎮ユ總鍝ュ祦闁圭増婢樻导鐘绘煏婢诡垰鎳愰崢鐘绘⒒閸屾艾锟芥悂鎮ф繝鍥х婵鍩栭弲鎻掝熆鐠虹尨姊楃紒鍗炵埣濮婃椽妫冨☉杈�嗙紓浣哄У閸ㄨ绔熼弴銏╂晬婵﹫绲鹃弬锟介梻浣虹帛椤洨鍒掗姘ｆ鐟滄棃寮婚敐鍛傛梹鎷呴搹鍦帨闂備浇顕栭崰妤呫�冩繝鍥╁祦闁规崘顕х粻铏節闂堟稓澧曢柡浣侯焾閳规垿鍩ラ崱妞剧敖婵犫拃鍕垫畼闁瑰箍鍨介弫鎾绘嚍閵壯咁啎闂佸湱铏庨崳顔嘉涢幋鐘电＜閺夊牄鍔岀粭姘舵倵閻㈤潧甯堕柍璇查叄楠炲洭顢楁径澶屽
			xbean.Properties guestprop=xtable.Properties.select(guestid);
			if(guestprop.getCruise() > 0) {
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162103, null);
				return ;
			}
			//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴閺佹劙宕ㄩ褏锟界兘姊绘担鍝ワ紞缂侇噮鍨拌灋闁告劦鍠栭拑鐔兼煛閸ャ儱鐏╅梺鍗炴处缁绘繈妫冨☉娆欑礊婵炲鍘ч崯鏉戭潖濞差亜绠归柣鎰嚋閹风兘寮撮姀鈺傛櫈闂佸憡绋戦悺銊х不閹烘挾绡�闁汇垽娼у瓭闂佹寧娲忛崐婵嬬嵁婵犲啯鍎熼柕濞垮劤椤︻噣鏌ｆ惔顖滅У闁稿鍊婚幑銏ゅ幢濞戞瑧鍘电紓鍌欑劍閿氱紒妤佸哺閺屾盯鎮㈤崫鍕埛缂備浇椴哥敮鐐烘晸閺傘倗绉靛ù婊嗘硾鍗遍柛娑橆焾娴滄粓鏌熼崜褍浠洪柛瀣ㄥ灮閿熷�燁潐濞叉牕鐣烽鍐航闂備胶绮崹闈浢洪妸鈺傚仼闁汇垹鎲￠悡娑㈡倶閻愭彃鈷旀繛鍙夋尦閺屸剝鎷呯粙鍖℃嫹閸喚鏆︽い鎰剁畱缁�瀣亜閹伴潧浜為柨鐔诲Г婵炲﹤顫忕紒妯诲缂佹稑顑呭▓鎰版⒑閸濄儱校妞ゃ劌锕悰顕�骞囬悧鍫濇闂侀潧鐗嗗ú銊╂偂閹剧粯鈷戦悹鎭掑妼濞呮劙鏌熼崙銈嗗?濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨偓鎷锋繝姘ワ拷鍛村矗婢跺牅绨婚棅顐㈡处閹告悂鎮电�ｎ喗鐓ユ繝闈涙－濡插綊鏌￠崨顔剧煉闁哄矉绠戣灒濞撴凹鍨遍埢鎾绘⒑閹肩偛锟芥垿宕愬┑瀣畺婵°倕鎳愬畵渚�鏌涢…鎴濇灈濠殿喖閰ｉ弻锝嗘償閵忕姴姣堥梺鎼炲姀濞夋盯鎮鹃悜钘夘潊闁靛牆妫欏▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹
			//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔芥祰闂傚倷鑳堕…鍫燁殽閸濄儻鎷峰☉鎺撴珚濠碉紕鏁诲畷鐔碱敍濮樿京娼夐梻浣侯焾閺堫剛绮欓幒妤佸仧妞ゅ繐鐗婇埛鎴︽煙閼测晛浠滃┑鈥炽偢閺屾洟宕奸悢绋匡拷鎰拷娈垮枛椤兘寮幘缁樺亹闁肩⒈鍓﹀Σ褰掓⒒閸屾艾锟芥悂鎮ф繝鍕煓闁规儳顕々鐑芥煃閸濆嫭鍣洪柍閿嬪灴閹綊宕堕敐蹇斿鐎规洖娲ｉ幋椋庣磽閸屾瑦绁伴柛鈺傜墵閹虫繃銈ｉ崘鐐櫔闂佹寧绻傞ˇ顖炲垂閸屾稏浜滈柟鎵虫櫅閻忣喚绱掗幇顔间槐婵﹪缂氶妵鎰板箳閹存粌鏋堥梻浣告啞钃辩紒顔芥尭椤曪綁骞橀钘夛拷鍫曟偣閸ヮ亜鐨虹紒澶嬫そ閺岀喖顢欓悷鏉库拤闂佽鍨卞Λ鍐极閹版澘纾兼繛鎴炵啲閹风兘宕妷褏锛濋梺绋挎湰閻燂妇绮婇弶娆炬富闁哄鍨堕幉鎼佹煙楠炲灝鐏茬�规洜鍘ч…鍧楊敂閸涱垱鍒涢梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅絾绻濋姀锛勭畵缂傚秴锕顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷?闂傚倸鍊搁崐椋庣矆娓氾拷楠炲鏁撻悩鑼槷闂佹寧娲栭崐鎼佸磼閵娿儍褰掓偐瀹割喖鍓鹃梺杞版閻掞箓骞堥妸銉庣喖宕归鎯у缚闂備胶绮幐楣冨窗閺嶎厼钃熺�广儱顦导鐘绘煕閺団剝纭惧ù鍏煎姍濮婃椽宕崟闈涘壋闂佸摜濮甸悧鐘差嚕婵犳碍鏅插璺猴工閸炪劑姊哄Ч鍥х伄闁轰焦鐡曢埅鐢告⒑鐠囧弶鍞夋い顐㈩槸鐓ゆ繝濠傜墕缁�鍌涗繆椤栨繍鍞虹紒璇叉閺岀喖姊荤�靛壊妲梺缁樻尰閻╊垶寮诲☉姘勃闁芥ê顧�閹风兘鎮烽幊濠冩そ瀵粙顢橀悢铏规殺闂傚倸鍊烽懗鍓佸垝椤栫偛绠扮紒瀣紩閻熸壆鏆嬮柟娈垮枟閻︽捇姊婚崒姘拷鐑芥嚄閸洖鍌ㄧ憸鏃堝箖濡警娼╅悹鍝勬惈閻庮參姊虹粔鍡楀濞堟梻绱掗悩鍐插摵闁哄本鐩獮鍥濞戞瑧浜紓鍌欑筏閹风兘鎮楅敐搴′簴濞存粍绮撻弻鐔煎箲閹邦厾銆愰梺璺ㄥ枔閻℃棃宕戞繝鍥ф瀬闁告劦鍠栫壕鍏肩箾閹寸偠澹樻鐐茬Ч濮婄粯鎷呴懞銉с�婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�?
			Team guestteam = TeamManager.selectTeamByRoleId(guestid);
			//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔戒氦闂傚倷绀侀幉锟犳偡閵夆晜鏅濋柕澶嗘櫅妗呴梺鍛婃处閸ㄤ即宕橀敓浠嬫⒑闂堟丹娑氫沪閻愵剦鍟囬梻鍌氬�烽懗鍫曗�﹂崼鐕佹闁归棿鐒﹂弲婵囥亜韫囨挾澧曢柦鍐枛閺屻劑鎮㈤崫鍕戙垻绱掗敓鐣岋拷锝庡枟閳锋帡鏌涢銈呮灁闁靛棙甯掗湁闁绘ɑ鐟ラ幊鎰閽樺褰掓晲閸偅缍堥梺缁樻尪閸庣敻寮婚敐鍡楃疇闂佸憡鏌ㄥù鐑藉礆閹烘垟鏋庨柟閭﹀墰缁愮偤姊虹憴鍕凡闁诲繑宀稿鎻掝煥閸啿鎷洪梺鍛婃尰瑜板啯绂嶉悙鐑樼厱闁绘棃娼婚懓璺拷娈垮枟閹告娊骞冨Ο鍏煎珰闁肩⒈鍓涙闂備浇顕栭崰鎺楀礈濠靛绠氶柡鍐ㄧ墛閺咁剟鏌ら崜鎻掑闁跨喕濮ら悧婊堝箲閵忕姭妲堥柕蹇曞█閸炲爼姊虹紒妯活棃妞ゃ儲鎸荤�佃偐浠︽潪鎸庢閹晠妫冨☉妤冩崟婵＄偑鍊栭崹鐢杆囬悽鍛婂仒妞ゆ洩鎷风�规洖鐖奸、妤佸緞鐎ｎ偅鐝滄繝鐢靛仩閹活亞寰婃禒瀣疅闁跨喓濮甸崐鐢告煥閻曞倹瀚�
			if (guestteam != null){
				if(guestteam.getAllMemberIds().contains(sourceid)){
					fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 160460, null);//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡寮堕崼姘珔闁搞劍绻冮妵鍕冀椤愵澀绮剁紓渚婃嫹濠㈣泛顑勭换鍡涙煏閸繃鍣洪柛锝囨嚀椤╁ジ宕ㄩ娑欐杸濡炪倖姊归弸缁樼瑹濞戙垺鐓曟慨妤嬫嫹缂佺姵鐗犲畷娲閵堝懐鐫勯梺绋跨焿闂勫嫮锟芥俺顫夐〃銉╂倷閼碱兛铏庨梺鍛婃⒐瀹�鎼佸蓟閿濆憘鏃堟晸閽樺）娑樷攽閸℃瑦娈鹃梺闈涚箞閸婃洜绮荤紒妯镐簻闁哄啫娉﹂幒妤�绠繛宸簼閳锋垿鎮归幁鎺戝婵炲懏鍔欓弻鐔煎礄閵堝棗顏�?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜滃洿婵犮垼娉涢敃銈囪姳閵夆晜鈷戦柛婵嗗椤箓鏌涙惔銈勫惈缂侇喖顭峰浠嬵敇閻斿搫骞嶉梻浣筋嚃閸ㄥ酣宕橀悙顒侇啈缂傚倷鑳堕崑鎾诲磿閹惰棄围闁归棿绀侀拑鐔哥箾閹存瑥鐏╅柛妤佸▕閺屾洘绻涢崹顔煎Б婵炲濯崣鍐箖鐠轰警娼╂い鎾跺Х閻ゅ嫬鈹戦纭锋敾婵＄偠妫勮灋闁告劦鍠栭悡娑㈡煕鐏炴儳鍤ù纭锋嫹?
					CInvitationPlayPK.sendremoveTickTime(sourceid);//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌ㄩ悢鍝勑㈢痪鎯ь煼閺屾稑鈽夐崡鐐插濠电偛鐨烽弲鐘诲蓟閺囩喓绠鹃柣鎰靛墯閻濇洟姊虹粙娆惧剰闁稿﹤娼″濠氬Ω閵夈垺顫嶅┑鈽嗗灟鐠�锔藉閹烘鈷戠憸鐗堝俯濡垿鏌涜箛鏃撹�块柟顔诲嵆椤㈡岸鏁撻挊澶屾殾鐟滅増甯╅弫濠囨煕濞嗗秴鍔ゆ俊顐灦濮婂宕掑▎鎺戝帯缂佺虎鍘奸悥鐓庮嚕閹绘帩鐓ラ柛娑卞灣閻撴捇姊虹憴鍕婵炲鐩畷鐟扳攽鐎ｎ偆鍘撻梺鍛婄箓鐎氼厽鍒婃總鍛婄厸濞达絽鎽滄牎闂侀�涚┒閸斿矂锝炲鍫濆耿婵°倧鎷锋い顐亰濮婅櫣鎷犻垾铏亾闂佸憡顭嗛崶褏鍘撮梺纭呮彧闂勫嫰宕愰悜鑺ョ厸濠㈣泛顑呴悘鈺伱归悩铏唉婵﹨娅ｇ槐鎺戭潨閸℃鏆ユ繝纰樻閸嬪懐鎹㈤崼銉у祦闁告劦鍠楅崐閿嬨亜閹寸偛鍔ゅù婊勭箞濮婃椽宕ㄦ繝鍌氼潎闂佸憡鏌ㄩ柊锝夊箚閸儱绀嬫い鏍ㄧ〒閸樹粙姊虹紒姗嗙劷闁稿簺鍊濋、鏃堟偐缂佹鍘遍柟鐓庣摠缁嬫垿鏁撻懞銉х疄妤犵偛鍟撮幃浠嬪川婵犲啯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�
					return;
				}
			}
			// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴閺佹劙宕ㄩ褏锟界兘姊绘担鍝ワ紞缂侇噮鍨拌灋闁告劦鍠栭拑鐔兼煛閸ャ儱鐏╅梺鍗炴处閵囧嫰骞掑鍥舵М濡炪倕楠忛幏锟�?闂傚倸鍊搁崐椋庣矆娓氾拷楠炲鍩勯崘顏嗘嚌濠德板�曢幊搴ｇ矆閸喓绠鹃柟瀛樼懃閻掓椽鏌℃担鍛婂缂佺粯绋戦蹇涱敊閼姐倕鍤梻浣瑰▕閺�杈╂暜閿熺姴钃熸繛鎴炵煯濞岊亪鏌熼鍡楀暞閻︽捇姊绘担瑙勫仩闁稿﹥顨婂畷浼村箛椤旇棄搴婂┑鐐村灟閸ㄥ綊鏌嬮崶顒佺厽闁哄啫鐗滃Λ鎴澝归悩灞傚仮婵﹥妞藉畷鐑筋敇閻旈攱鐣梺璇插閸戝綊宕滈悢鐓庢槬闁绘劕鎼粻锝夋煥閺囶亝瀚归梻浣稿船濞诧箓濡甸崟顖氱疀闁宠桨绶ら幏鐤樄妤犵偛绻橀幃婊堟嚍閵夛附顏熼梻浣芥硶閸ｏ箓骞忛敓锟�
			if (!fire.pb.battle.PSendInvitePlayPK.checkRoleDistance(guestid, sourceid)){
	            fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 120063, 0, null);
	            fire.pb.talk.MessageMgr.sendMsgNotify(sourceid, 120063, 0, null);
	            CInvitationPlayPK.sendremoveTickTime(sourceid);//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌ㄩ悢鍝勑㈢痪鎯ь煼閺屾稑鈽夐崡鐐插濠电偛鐨烽弲鐘诲蓟閺囩喓绠鹃柣鎰靛墯閻濇洟姊虹粙娆惧剰闁稿﹤娼″濠氬Ω閵夈垺顫嶅┑鈽嗗灟鐠�锔藉閹烘鈷戠憸鐗堝俯濡垿鏌涜箛鏃撹�块柟顔诲嵆椤㈡岸鏁撻挊澶屾殾鐟滅増甯╅弫濠囨煕濞嗗秴鍔ゆ俊顐灦濮婂宕掑▎鎺戝帯缂佺虎鍘奸悥鐓庮嚕閹绘帩鐓ラ柛娑卞灣閻撴捇姊虹憴鍕婵炲鐩畷鐟扳攽鐎ｎ偆鍘撻梺鍛婄箓鐎氼厽鍒婃總鍛婄厸濞达絽鎽滄牎闂侀�涚┒閸斿矂锝炲鍫濆耿婵°倧鎷锋い顐亰濮婅櫣鎷犻垾铏亾闂佸憡顭嗛崶褏鍘撮梺纭呮彧闂勫嫰宕愰悜鑺ョ厸濠㈣泛顑呴悘鈺伱归悩铏唉婵﹨娅ｇ槐鎺戭潨閸℃鏆ユ繝纰樻閸嬪懐鎹㈤崼銉у祦闁告劦鍠楅崐閿嬨亜閹寸偛鍔ゅù婊勭箞濮婃椽宕ㄦ繝鍌氼潎闂佸憡鏌ㄩ柊锝夊箚閸儱绀嬫い鏍ㄧ〒閸樹粙姊虹紒姗嗙劷闁稿簺鍊濋、鏃堟偐缂佹鍘遍柟鐓庣摠缁嬫垿鏁撻懞銉х疄妤犵偛鍟撮幃浠嬪川婵犲啯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�
	            return ;
			}
			BuffAgent hostAgent = new BuffRoleImpl(sourceid, true);
			if (hostAgent.existBuff(BuffConstant.StateType.STATE_REPLAY)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_FIGHTER)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_WATCHER)) {
				MessageMgr.sendMsgNotify(guestid, 162126, Arrays.asList(new PropRole(sourceid,true).getName()));
				return ;
			}
			new PSendInvitePlayPK(sourceid,guestid).submit();
		}else{
			//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟缁�濠傗攽閻樺弶鎼愮紓浣叉櫊瀵爼宕煎顓熺彆闂佸搫妫欑划鎾诲蓟閿濆绠涢柣妤�鐗婇柨顓㈡⒑閹肩偛濡界紒璇茬墦瀵鏁愭径濠勵吅闂佹寧绻傚Λ顓炍涢崟顓犵＝濞撴艾锕ョ�氬綊姊虹化鏇炲⒉缂佸甯￠幃锟犲即閵忥紕鍘繝銏ｆ硾閻楀棝鎮橀鍛闁告侗鍠楃亸鏉壳庨崶褝韬い銏℃礋椤㈡鎷呴崜韫处
			fire.pb.talk.MessageMgr.sendMsgNotify(sourceid, 160425, 0, null);
			CInvitationPlayPK.sendremoveTickTime(sourceid);//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌ㄩ悢鍝勑㈢痪鎯ь煼閺屾稑鈽夐崡鐐插濠电偛鐨烽弲鐘诲蓟閺囩喓绠鹃柣鎰靛墯閻濇洟姊虹粙娆惧剰闁稿﹤娼″濠氬Ω閵夈垺顫嶅┑鈽嗗灟鐠�锔藉閹烘鈷戠憸鐗堝俯濡垿鏌涜箛鏃撹�块柟顔诲嵆椤㈡岸鏁撻挊澶屾殾鐟滅増甯╅弫濠囨煕濞嗗秴鍔ゆ俊顐灦濮婂宕掑▎鎺戝帯缂佺虎鍘奸悥鐓庮嚕閹绘帩鐓ラ柛娑卞灣閻撴捇姊虹憴鍕婵炲鐩畷鐟扳攽鐎ｎ偆鍘撻梺鍛婄箓鐎氼厽鍒婃總鍛婄厸濞达絽鎽滄牎闂侀�涚┒閸斿矂锝炲鍫濆耿婵°倧鎷锋い顐亰濮婅櫣鎷犻垾铏亾闂佸憡顭嗛崶褏鍘撮梺纭呮彧闂勫嫰宕愰悜鑺ョ厸濠㈣泛顑呴悘鈺伱归悩铏唉婵﹨娅ｇ槐鎺戭潨閸℃鏆ユ繝纰樻閸嬪懐鎹㈤崼銉у祦闁告劦鍠楅崐閿嬨亜閹寸偛鍔ゅù婊勭箞濮婃椽宕ㄦ繝鍌氼潎闂佸憡鏌ㄩ柊锝夊箚閸儱绀嬫い鏍ㄧ〒閸樹粙姊虹紒姗嗙劷闁稿簺鍊濋、鏃堟偐缂佹鍘遍柟鐓庣摠缁嬫垿鏁撻懞銉х疄妤犵偛鍟撮幃浠嬪川婵犲啯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�
			return;
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793689;

	public int getType() {
		return 793689;
	}

	public long sourceid; // 发起邀请人的id
	public int acceptresult; // 0拒绝  1接受

	public CInvitationPlayPKResult() {
	}

	public CInvitationPlayPKResult(long _sourceid_, int _acceptresult_) {
		this.sourceid = _sourceid_;
		this.acceptresult = _acceptresult_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(sourceid);
		_os_.marshal(acceptresult);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		sourceid = _os_.unmarshal_long();
		acceptresult = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CInvitationPlayPKResult) {
			CInvitationPlayPKResult _o_ = (CInvitationPlayPKResult)_o1_;
			if (sourceid != _o_.sourceid) return false;
			if (acceptresult != _o_.acceptresult) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)sourceid;
		_h_ += acceptresult;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(sourceid).append(",");
		_sb_.append(acceptresult).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CInvitationPlayPKResult _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(sourceid - _o_.sourceid);
		if (0 != _c_) return _c_;
		_c_ = acceptresult - _o_.acceptresult;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

