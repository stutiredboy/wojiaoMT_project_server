
package fire.pb.clan;

import java.util.Arrays;





import fire.pb.PropRole;
import fire.pb.clan.srv.ClanManage;
import fire.pb.talk.MessageMgr;
import fire.pb.util.StringConstant;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestSelectType__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRequestSelectType extends __CRequestSelectType__ {
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
				xbean.ClanInfo clanInfo = ClanUtils.getClanInfoById(roleid, true);
				if (clanInfo == null || !clanInfo.getMembers().containsKey(roleid)) {
					return false;
				}
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔戒氦缂傚倸鍊烽懗鍓侊拷姘箻瀹曞爼濡歌楠炲牓姊绘笟锟介敓鑺ョ☉瀹撳棙绻涙担鍐叉搐閸戠娀鏌ｉ弮锟介幃鑸电濠婂牆绠规繛锝庡墮閻忣噣鏌熼崘鍙夊枠闁哄矉绱曟禒锔炬嫚閹绘帩鐎抽梻浣哥枃濡嫰藝椤栨繄浜介梻浣稿閻撳牓宕抽钘夘嚤闁告劦鍠楅悡鐔兼煟閺傛寧鎲搁柣顓烆儏閳规垿鍩勯崘鈺侊拷鎰拷瑙勬礃閸庡ジ藝閺屻儲鐓熸繝闈涙閹寸姵宕叉繝闈涱儏椤懘鏌ㄥ┑鍡橆棤闁靛棙鍔欏娲箰鎼淬垻锛橀梺绋匡攻椤ㄥ﹪骞婇悙瀛樼秶闁靛ě鍛婵犳鍠楅敃鈺呭储妤ｅ啫鍌ㄩ梺顒�绉甸埛鎴︽煕濠靛棗顏╅柨鐔绘椤嘲鐣烽弴銏犖ч柛娑变簼閻庢椽姊洪崨濠勨槈闁宦板姂閹�斥枎閹惧鍙勫┑顔斤供閸撴瑩鏁撻悾宀婄劸闁伙絿鏁诲畷鍗炩枎濞嗘劕顏堕柣鐔哥懃鐎氼厾绮堥崘顏嗙＜妞ゆ棁濮ゅ畷宀勬煏閸℃洜顦﹂柍钘夘槸椤粓宕卞Ο鍝勫帪濠碉紕鍋戦崐鏍暜閹烘纾归悹鍥ㄧゴ閺嬫牠鏌涢…鎴濇灀闁猴拷娴犲鐓熼柟閭﹀幗缂嶆垿鏌ｈ箛銉х暤闁哄瞼鍠栭弻鍛槈濮樿京宕叉俊鐐�戦崹鐑樼┍濞差�洭宕奸弴鐔哄帾闂佹悶鍎崝灞炬叏瀹ュ浄鎷风憴鍕┛缂佸弶鍎抽銉╁礋椤愩倖娈曟繝鐢靛Т閸熶即濡堕敓锟�?
				if (clanInfo.getClanmaster() != roleid && clanInfo.getClanvicemaster() != roleid) {
					// 濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洤顫忔繝姘唶闁绘柨鍢查獮蹇涙⒑閹稿海绠撴い锔诲灠椤斿繐鈹戦崱蹇旀杸闂佺粯蓱瑜板啯绂嶉悙鐑樼厱闁靛牆鍟敓鑺ユ礋閸╃偤骞嬮敂缁樻櫓缂備焦绋戦鍥礉閹间焦鈷戠紒顖涙礃濞呭棝鏌ｅΔ浣圭妞わ綁绠栧楦裤亹閹烘垳鍠婇梺绋跨箲閿氶崡閬嶆煕椤愮姴鍔滈柣鎾寸洴閺屾盯骞囬埡浣割瀳闂佽法鍠曟慨銈夊箖閸屾凹鍤曠紒瀣儥閸氬鏌涢妷銏℃珖闁挎稒绮岄埞鎴炲箠闁稿ě鍥х闂佸灝顑冩禍婊堟煥閺囩偛锟界懓鈽夎閵囧嫰寮撮鍡櫳戦柣搴ㄦ涧閵堟悂鐛弽顓ф晣闁绘柨鎲￠悵顐⑩攽閻樻剚鍟忛柛鐘愁殜閺佸啴鍩￠崨顓狀槶闂佹寧娲╅幏鐑芥懚閻愮儤鐓曢柕澶涚到婵¤法绱掗悩鑽ょ暫闁哄备鍓濆鍕拷锝庝簽娴犳挳姊虹拠鈥虫灍闁搞劌缍婇弫鎾绘偩鐏炵虎浠ч梺褰掝棑閸忔﹢寮婚悢鍏尖拻閻庨潧澹婂Σ顔尖攽椤旀娼愰柣鎿勭節瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160243, null);//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢绘俊鐐�栭悧妤冪矙閹炬眹锟藉懘宕ｆ径宀�鐦堥梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ婢舵劖鐓ユ繝闈涙婢跺嫰鏌涢妶蹇斿濠碉紕鍋戦崐鏍哄┑鍥ヤ粓闁归棿绀佺粻鐐烘煏婵炲灝鍓婚柣鏃傚帶閸ㄥ倹銇勯弮锟介崕宕囨暜閹稿海绡�婵炲牆鐏濆▍娆戠磼閺屻儳鐣虹�规洘绻傞埢搴ㄥ箻鐎圭姵鎲伴梻浣虹帛濮婅崵浜搁妸鈺佺鐎瑰嫭澹嬪Σ鍫熺箾閸℃﹩鐒介柛鏃堟敱缁绘繈鍩涢敓鐣屼沪閼测晝娉挎俊鐐�ら崢鐓庮焽閿熺姴绠栭柣鎴ｅГ閸嬪鏌涢锝囩婵℃煡浜跺铏规嫚閸欏宕抽梺杞扮劍閹倸鐣烽姀锝庢▌闂佹寧绻勯崑娑㈠煘閹寸媴鎷烽敐搴′簻婵炲牊绻堝娲礈閼碱剙甯ラ梺绋款儏濡宓勫銈呯箰閻楀﹪鍩涢幒鎳ㄥ綊鏁愰崶鈺傛啒濠电偛鍚嬮崝娆撳蓟閿濆牏鐤�闁哄倸鐏濋幗鐢告倵鐟欏嫭绀冩繛鑼枛閻涱噣骞樼拠鑼唺闂佺粯鍔橀鎰板箯閻戣棄鍨傛い鏃傚皑閹风兘骞掗幋顓熷兊闂佺粯鍔﹂崜娆擃敂閸洘鈷掑ù锝呮啞閹牓鏌ゅú璇茬仸妤犵偛锕ㄧ粻娑㈠箼閸愩劍顔傞梻浣告啞濞诧箓宕ｈ箛娑樼闁绘垼濮ら弲鏌ュ箹鐎涙绠栭柛鐘崇缁绘稓锟界數顭堟牎闂佸湱顭堥崯鍧楋綖韫囨拋娲敂閸曨亞鐐婇梻浣告啞濞叉牠鎮樺杈╂噮闂傚倸鍊风粈渚�骞楀鍫濈獥闁归偊鍓﹂悞鑺ョ箾閸℃ɑ灏ㄩ柨鐔诲Г閻楁鎹㈠┑瀣倞闁靛闄勯鐔兼⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�
					return false;
				}
				if(selecttype!=fire.pb.clan.PClanMedicItem.SELECT_BASE
						&&selecttype!=fire.pb.clan.PClanMedicItem.SELECT_DOUBLE&&selecttype!=fire.pb.clan.PClanMedicItem.SELECT_THREE){
					return false;
				}
				
				//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷鐓庮熆濠靛牊鍤�妞ゎ偅绻勯幑鍕惞鐠団剝袧濠电姷鏁搁崑鐐哄垂閸撲礁鏋堢�广儱顧�缂嶆牠鏌￠崶銉ョ仾闁绘挻鐟︾换娑㈠醇濠靛牅铏庨梺鍝勵儑閸犳牠骞冨Ο璺ㄧ杸闁规崘顕у浼存⒑閸濆嫭婀伴柣鈺婂灠椤曪綁骞橀鍢夆晠鏌曟竟顖氬�搁幗瀣攽閻樺灚鏆╅柛瀣洴楠炲﹤鐣濋崟顐ゎ槷閻庣櫢鎷烽柛鏇ㄥ亞閸欙拷濠电姰鍨奸崺鏍礉閺囩姷涓嶉柤濮愬�ч幏椋庢喆閸曨剛顦ュ┑鐐差檧缁犳挻淇婇悜钘夌厸闁稿本绮岄獮鍫ユ⒒娴ｅ摜绉洪柛瀣躬瀹曟粓鏁冮崒娑樹簵婵犻潧鍊搁幉锟犳偂濞戞◤褰掓晲閸涱喗鍠愰柤鍙夌墬缁绘稓锟界數顭堥鎾剁磼閻樿櫕宕屾鐐插暙閳诲酣骞欓崘鈺傛珜濠电姷鏁告慨鏉懨洪妸銉ф殾妞ゅ繐瀚ч弨浠嬫煟濡櫣浠涢柡鍡忔櫊閺屾稓锟斤綆鍋嗗ú鎾寠濠靛鐓涘璺侯儜缁扁晜绻涘顔荤盎缂佺媴缍侀弻锝夊箛椤旇姤姣勫銈嗘⒐濞茬喎顫忓ú顏勭闁绘劖褰冩慨鍫曟⒑閸涘﹥灏扮�癸拷缁嬭法鏆﹂柟杈剧畱鎯熼梺鍐叉惈閸婂宕㈤鍛瘈闁汇垽娼у瓭缂備胶绮崝娆撳箚娴ｅ壊鐓ラ柛顐ゅ枔閸橀亶姊洪崫鍕拷鎼佹倶濠靛姹查柨婵嗩槹閻撴盯鎮橀悙鎻掆挃婵炴彃顕敓鑺ヮ問閸ｎ噣宕抽敐鍛殾闁圭儤鍩堝鈺傘亜閹捐泛小缂併劋绮欏濠氬磼濞嗘帒鍘″銈庡幖閻楀﹪銆冮妷銊х杸婵炴垶顭囬鍡涙⒑鐠恒劌娅愰柟鍑ゆ嫹
				int level = clanInfo.getHouse().get(fire.pb.clan.srv.ClanManage.DrugStone);
				fire.pb.clan.SClanDrugstore drugstone =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanDrugstore.class).get(level);
				if (drugstone == null){
					return false;
				}
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔顕�鏁撻弬銈囩暤鐎规洖銈告俊椋庯拷锝庝簼閸犳ɑ顨ラ悙鏌ュ弰鐎殿噮鍓熸俊鍫曞炊閳圭偓锛堝┑鐘垫暩婵即宕规總绋挎槬闁哄稁鍘肩粈澶愭煛閸モ晛啸闁活厼妫濋弻娑㈠焺閸愬墽鍔风紓浣哄█缁犳牠寮诲☉銏犵労闁稿繆鏅滈崹瑙勭閹间焦鍋嬮柛顐ｇ◥缁ㄥ姊虹憴鍕姢缁剧虎鍘剧划鏂棵洪鍛幐閻庣櫢鎷烽悗锝庡墰閻﹀牓鎮楃憴鍕闁靛牆鎲℃穱濠囨偪椤栵絾鞋缂傚倷鐒﹂崝鏍�冩繝鍥х畺婵°倕鍟崰鍡涙煕閺囥劌澧痪鏉跨Ч濮婅櫣绮欓崠鈥充紣闂佽绻戠换鍫ュ箖妤ｅ啯鍊婚柤鎭掑劜濞呫垽姊虹捄銊ユ珢闁瑰嚖鎷�?
				int cost=0;
				if(selecttype==fire.pb.clan.PClanMedicItem.SELECT_THREE){//濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻鐔兼⒒鐎垫瓕绠為梺鎼炲労閸撴岸寮查幖浣圭叆闁绘洖鍊圭�氾拷?闂傚倷娴囬褎顨ラ崫銉т笉鐎广儱顦壕鍧楀级閸碍娅旈柟宄板槻椤繈顢曢姀鐘点偖闂備浇顕栭崰鏇㈠础閹剁晫宓佹俊顖濆亹绾惧吋淇婇婊冨付妤犵偞锕㈠缁樻媴閼恒儳銆婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�?
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴婵拷闁斥晛鍟拌ぐ鍡涙⒑鐠囪尙绠扮紒缁樺姍閺屽﹪鏁愭径濠呮憰濠电偞鍨崹褰掑础閹惰姤鐓忓┑鐐茬仢閸斻倕霉閻橆偅娅呴柍瑙勫灴閹瑩宕ｆ径濠冾仦闂備礁鎲″褰掑垂閸ф宓侀柛鎰ㄦ櫇椤╃兘鎮楅敐鍛粵闁哄拋鍓熷娲箰鎼达絿鐣甸梺鐟板暱缁绘﹢骞冨锟藉畷鍗炩枎閹寸媴绱冲┑鐐舵彧缁茶偐鍒掑▎鎾充紶闁告繂瀚烽悢鍡涙煟閻斿搫顣兼い銉ｅ灪椤ㄣ儵鎮欓弶鎴濐潙濡炪倧绠戝﹢閬嶆晸閸婄噥娼愭繛鍙夌矒瀹曚即寮介婊愭嫹娴ｇ硶妲堟慨妤�妫欓崓闈涱渻閵堝棙瀵欓柛灞剧♁閳绘洟姊婚崒姘拷鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕妞ゎ偄顦遍敓浠嬫涧閵堢顕ｉ崼鏇炵闁绘ê鐏氬В搴㈢節閻㈤潧浠╅柟娲讳簽瀵板﹪宕稿Δ锟界粻鐘绘煙閹规劕鐓愭い鎰矙閺屻劑鎮ら崒娑橆伓?
					cost=drugstone.getTrimoney();
				}else if(selecttype==fire.pb.clan.PClanMedicItem.SELECT_DOUBLE){//2闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿Ψ閿旇姤鐝栭梻渚�娼ч悧鍡椕洪妸鈺傚剹闁瑰墽绮悡锝夌叓閸ラ鍒板ù婊嗗Г缁绘盯宕煎鍛厯闂佸搫鏈惄顖涗繆閻戠瓔鏁婇柣鎾冲瘨濞间粙姊绘担瑙勫仩闁稿ě鍥х闁跨噦鎷�?
					cost=drugstone.getDoublemoney();
				}
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴婵拷闁斥晛鍟拌ぐ鍡涙⒑鐠囪尙绠扮紒缁樺姍閺屽﹪鏁愭径濠呮憰濠电偞鍨崹褰掑础閹惰姤鐓忓┑鐐茬仢閸斻倕霉閻橆偅娅呴柍瑙勫灴閹瑩宕ｆ径濠冾仦闂備礁鎲″褰掑垂閸ф宓侀柛鎰ㄦ櫇椤╃兘鎮楅敐鍛粵闁哄拋鍓熷娲箰鎼达絿鐣甸梺鐟板暱缁绘﹢骞冨锟藉畷鍗炩枎閹寸媴绱冲┑鐐舵彧缁茶偐鍒掑▎鎾充紶闁告繂瀚烽悢鍡涙煟閻斿搫顣兼い銉ｅ灪椤ㄣ儵鎮欓弶鎴濐潙濡炪倧绠戝﹢閬嶆晸閸婄噥娼愭繛鍙夌矒瀹曚即寮介婊愭嫹娴ｇ硶妲堟慨妤�妫欓崓闈涱渻閵堝棙瀵欓柛灞剧♁閳绘洟姊婚崒姘拷鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕妞ゎ偄顦遍敓浠嬫涧閵堢顕ｉ崼鏇炵闁绘ê鐏氬В搴㈢節閻㈤潧浠╅柟娲讳簽瀵板﹪宕稿Δ锟界粻鐘绘煙閹规劕鐓愭い鎰矙閺屻劑鎮ら崒娑橆伓?
				if(clanInfo.getMoney()<cost){
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160244, null);
					return false;
				}
				if(selecttype==fire.pb.clan.PClanMedicItem.SELECT_THREE&&clanInfo.getMoney()<ClanManage.getThreeMedicBaseMoney()){
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160244, null);
					return false;
				}
				if(selecttype==fire.pb.clan.PClanMedicItem.SELECT_DOUBLE&&clanInfo.getMoney()<ClanManage.getTwoMedicBaseMoney()){
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160244, null);
					return false;
				}
				
				
				
				
				xbean.MedicItemList itemlist=xtable.Medicitemlisttab.get(clanInfo.getKey());
				if(itemlist==null){
					itemlist=xbean.Pod.newMedicItemList();
					xtable.Medicitemlisttab.insert(clanInfo.getKey(), itemlist);
				}
				itemlist.setSelecttype(selecttype);
				SRequestSelectType sRequestSelectType=new SRequestSelectType();
				sRequestSelectType.selecttype=selecttype;
				gnet.link.Onlines.getInstance().send(roleid, sRequestSelectType);
				
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡寮堕崼姘珔闁搞劍绻冮妵鍕冀椤愵澀绮剁紓渚婃嫹濠㈣泛顑勭换鍡涙煏閸繃鍣洪柛锝囨嚀椤╁ジ宕ㄩ娑欐杸濡炪倖姊婚悺鏃堟倿娴犲鐓曢悗锝冨妼婵＄晫绱掗崒姘毙ラ柕鍥ㄥ姍楠炴帡骞樼捄鍝勭闂傚倷娴囬鏍垂鎼淬劌绀冮柍鍝勫�诲Σ顏堟⒑閼姐倕鏋戠紒顔肩Т椤灝螣娴ｆ洘绋戣灃闁告侗鍠氶悾鎶芥⒒閸屾瑨鍏屾い顓炵墢閹广垽骞囬弶鑳曢柣搴秵閸犳宕曞澶嬬厵閺夊牓绠栧顕�鏌涚�ｃ劌濡介柕鍥у瀵粙濡歌閻ｅ搫顪冮妶鍛濠电儑鎷烽梺鍝勮閸旀垿骞冮姀銈嗗�绘俊顖濆吹瑜把勪繆閻愵亜锟芥垿宕硅ぐ鎺撴櫇闁靛牆顦悡婵嬫煛閸屾氨姘ㄦ俊鎻掔墦閺屾洝绠涢弴鐐愩垽鏌ｆ惔顔煎籍婵☆偄鎳橀、鏇㈠閳ユ剚妲辩紓鍌欑椤戝棝宕归崷顓炲灊濠电姵鑹鹃拑鐔兼煏婢舵稑顩柛姗嗕邯濡懘顢曢姀鈩冩倷闂佹寧娲忛崐鏍疾閸洖鐭楀璺虹墔缁ㄥ鏌ㄥ鍐剧吋鐎规洖鐖兼俊姝岊槻鐎殿喛娅曠换婵嬫偨闂堟稐娌梺鎼炲妼閻栧ジ鍨鹃敃鍌氱倞妞ゆ帊绀侀敓钘夋健閺岋綁骞嬮敐鍛呮捇鏌ｉ幘璺烘灈闁哄本娲樼换娑滎槻闁哥噥鍨堕幃姗�宕奸妷锔规嫼闁荤姴娲犻敓鍊熸珪閻忓棛绱撴笟鍥ф灍闁荤噦闄勭粚杈ㄧ節閸パ咁啇婵炶揪缍�閸婁粙濡搁敂杞扮盎闂佸搫鍊搁悘婵嬪箖閹达附鐓曞┑鐘插暞缁�瀣叏婵犲嫮甯涢柟宄版噽缁數锟斤綆鍋嗙粔鐑芥⒒娴ｇ儤鍤�闁规祴鍓濈换娑欑節閸涱噯绱撻梻鍌欑濠�閬嶅磻閹炬剚娓婚柛褎顨呴弸渚�鏌涚仦鍓р棨濞存粍绮撻弻鐔兼倻濡櫣浠村銈呯箚閺呮繄妲愰幒妤佸亹闁割煈鍋呭В鍫ユ⒑閸濆嫮鐏遍柛鐘崇墵瀵宕堕浣规珖闂佽法鍠嶇划娆忣嚕閹间礁妫樻俊顐︽涧缂嶅﹪骞冮埡浣烘殾闁搞儯鍔岄崹閬嶆⒒娴ｇ瓔鍤冮柛鐘崇☉閳绘柨鈽夐姀鐘靛弨婵犮垼鍩栭崝鏇犵不閹惰姤鐓欓悗鐢殿焾娴狅箓鏌ｅ┑鍫熺倰闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟〃閻掑﹪鏌涘☉娆愮稇缂佺媭鍨堕弻銊╂偆閸屾稑顏�?160442闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏃�鎷濋幏椋庣箔濞戞ɑ鍣介柣顓熺懇閺岀喐娼忔ィ鍐╊�嶉梺鎼炲�栭崝鏍Φ閸曨垰鍐�闁靛鍎卞В鍫ユ⒑閹肩偛锟芥牕煤濮楋拷婵＄敻宕熼姘鳖唺闂佺懓鐡ㄧ换宥嗙婵傚憡鈷戦柛婵嗗閸庢粓鏌熼崙銈嗗?1濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姵褰冮湁闁挎繂娲ㄩ妴濠囨煛鐎ｎ亞效闁哄被鍔岄埞鎴﹀幢濡警妲遍梻浣告惈濡瑧鍒掗幘璇茶摕鐟滄垹绮诲☉銏犲嵆闁绘洑妞掗幋鐑芥⒒娴ｅ憡璐￠柛蹇旓耿钘熼柟鐐灱濡插牓鏌ｉ姀銏╃劸鐎瑰憡绻冮妵鍕棘閹冪彑闂佽法鍠曟慨銈夊礉濞嗗浚娼栭柧蹇氼潐鐎氭岸鏌嶉妷銊︾彧闁诲繐绉撮埞鎴︽倷閹绘帞楠囩紓渚囧枛闁帮絽鐣峰璺虹婵°倧鎷风紒顐㈢Ч閺屾稓浠﹂崜褉妾ㄥ┑鐐茬墛濠㈡﹢鈥旈崘顔嘉ч柛鈩冾焽閸欏棙绻濋埛锟介崒婊呯厯闁芥ɑ绻冮妵鍕即椤忓懎顏舵繝娈垮枛閿曘儱顪冮挊澶屾殾闁靛濡囩弧锟介梺鍛婃处閸撴瑥鈻嶉幋锔解拻濞达絼璀﹂悞楣冩煥閺囨ê锟芥妲愰悙瀵哥瘈闁稿被鍊曞▓銊╂⒑鐟欏嫬鍔跺┑顔哄�濆鏌ュ箹娴ｅ湱鍙嗛梺缁樻礀閸婂湱锟芥熬鎷�2濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻鐔兼⒒鐎靛壊妲紓浣哄Ь椤濡甸崟顖氱疀闁宠桨绶ら幏宄拔旈崘顏嗙劶婵犵數濮村ú锕傚磹閻㈠憡鐓ユ繝闈涙椤庢鏌＄�ｎ偆銆掔紒杈ㄥ浮閺佹挻绂掔�ｎ亪鍞跺銈庡亽閸犳锟芥俺顫夐〃銉╂倷閼碱兛铏庨梺鍛婃⒐瀹�鎼佸箖濡わ拷椤繈顢曢姀鐘点偖闂備浇顕栭崰鏇㈠础閹剁晫宓佹俊顖濆亹绾惧吋淇婇婊冨付妤犵偞顭囩槐鎾诲磼濞嗘垵濡界紓浣割儐閸ㄥ潡銆侀弽顓炲窛閻庢稒锚閿熻棄鐖奸弻銊╂偄閸濆嫅锝夋煕閵堝拋妯�闁哄苯绉瑰畷顐﹀礋椤愶絿浠岄梻浣烘嚀閸㈡煡宕查弻銉ョ厺闁规崘顕ч崹鍌涖亜閺冨倹娅曞ù婊庝簽缁辨捇宕掑▎鎰垫▊缂備線纭搁崳锝夌嵁韫囨稒鏅搁柨鐕傛嫹??
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌ㄩ悢鍝勑㈢痪鎯ь煼閺屾稑鈽夐崡鐐插濠电偛鐨烽弲鐘诲蓟閺囩喓绠鹃柣鎰靛墯閻濇洟姊虹粙娆惧剰闁稿﹤娼″濠氬Ω閳哄倸浜滈梺鍛婄箓鐎氬懘濮�閵忋垻锛滈梺璺ㄥ枍缁瑥鐣烽幒鎴旀闁哄稄濡囬惄搴ㄦ⒒娴ｄ警鏀伴柟娲讳簽瀵板﹪宕滆閸忔粓鏌涢幘鑼跺厡缁炬儳銈搁弻鐔兼焽閿曪拷瀵偓绻涢崼鐔割棃闁哄苯绉归幐濠冨緞濡儵鏋呮俊銈囧Х閸嬬偤鎮烽埡浣烘殾婵鎷峰┑鈩冩倐婵＄柉顧侀柛鐔奉儏閳规垿鎮╅崹顐ｆ瘎闂佺顑嗛惄顖炲箖瑜庣换婵嬪炊瑜嶉悗顓㈡⒑閸撹尙鍘涢柛鐘冲哺瀵娊鏁傞幋鎺旂畾闂侀潧鐗嗛幊蹇涘闯閸︻厾纾奸柨鐔烘櫕閿熸枻缍嗛崑浣圭濠婂牊鐓欓柟浣冩珪濞呭懘鏌ㄩ悢璇残撴繛鑼枛閻涱噣宕卞☉娆愭闂佽法鍣﹂幏锟�
				PropRole memberProp = new PropRole(roleid, true);
				MessageMgr.psendMsgNotifyWhileCommit(clanInfo.getMembers().keySet(), 160442, 0,Arrays.asList(memberProp.getName(),getTypeName(selecttype)));
				
				return true;
			}
		}.submit();
		
		
	}
	
	/**
	 * 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵閸犳牜澹曢崸妤佺厵闁诡垳澧楅ˉ澶愬箹閺夋埊韬柡灞诲�楅崰濠囧础閻愬樊娼芥俊鐐�栭崝鎺斿垝濞嗗浚鍤曢柛顐ｆ礀闁卞洦绻涢幋鐏活亪鈥栫�ｎ亶娓婚柕鍫濆�瑰▍鍫ユ倶韫囨梻鎳囨鐐差樀楠炴牗鎷呴崫銉悈婵犵數濞�濞佳囨偋婵犲倵鏋斿┑鍌氭啞閳锋垹绱掔�ｎ偄顕滄繝锟介幍顔剧＜妞ゆ柨鍚嬮幑锝吤瑰鍕�愰柟顔荤矙瀹曘劍绻濋崒娆忓闂傚倷鐒﹂幃鍫曞磿閻戞顩叉繝濠傜墛閸庡秵绻涘顔荤凹闁绘挶鍎甸弻锝夊棘閹稿骸鏆堥梺璇叉禋閸ｏ綁寮婚悢鐓庣闁靛牆妫楅锟�  287濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑㈩敃閿濆棛顦ョ紒鐐劤缂嶅﹪寮婚妸鈺傚亞闁稿本绋戦锟�??    288濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻鐔兼⒒鐎垫瓕绠為梺鎼炲労閸撴岸寮查幖浣圭叆闁绘洖鍊圭�氾拷??  289婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖缁愭淇婇妶鍛殲鐎规洘鐓￠弻鐔兼焽閿曪拷閺嬫稓绱掗煬鎻掞拷鏇㈡箒闂佺粯锚濡﹪宕曢幇鐗堢厱閻庯綆浜跺Ο锟介梺鍝勮閸旀垿骞冮妶澶婄＜婵炴垶锕╂导锟�
	 * @param type
	 * @return
	 */
	public static String getTypeName(int type){
		String name="";
		if(type==fire.pb.clan.PClanMedicItem.SELECT_THREE){
			name=StringConstant.ID2String("濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻鐔兼⒒鐎垫瓕绠為梺鎼炲労閸撴岸寮查幖浣圭叆闁绘洖鍊圭�氾拷??",288);
		}else if(type==fire.pb.clan.PClanMedicItem.SELECT_DOUBLE){
			name=StringConstant.ID2String("濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑㈩敃閿濆棛顦ョ紒鐐劤缂嶅﹪寮婚妸鈺傚亞闁稿本绋戦锟�??",287);
		}else{
			name=StringConstant.ID2String("婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖缁愭淇婇妶鍛殲鐎规洘鐓￠弻鐔兼焽閿曪拷閺嬫稓绱掗煬鎻掞拷鏇㈡箒闂佺粯锚濡﹪宕曢幇鐗堢厱閻庯綆浜跺Ο锟介梺鍝勮閸旀垿骞冮妶澶婄＜婵炴垶锕╂导锟�",289);
		}
		return name;
	}
	
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808505;

	public int getType() {
		return 808505;
	}

	public int selecttype; // 选择几倍产药

	public CRequestSelectType() {
	}

	public CRequestSelectType(int _selecttype_) {
		this.selecttype = _selecttype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(selecttype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		selecttype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestSelectType) {
			CRequestSelectType _o_ = (CRequestSelectType)_o1_;
			if (selecttype != _o_.selecttype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += selecttype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(selecttype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestSelectType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = selecttype - _o_.selecttype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

