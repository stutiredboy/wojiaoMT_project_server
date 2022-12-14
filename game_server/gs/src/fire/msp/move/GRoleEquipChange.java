package fire.msp.move;

import java.util.HashSet;
import java.util.Set;

import fire.pb.item.EquipItemType;
import fire.pb.move.SRoleComponentsChange;
import fire.pb.move.SpriteComponents;
import fire.pb.scene.manager.SceneTeamManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GRoleEquipChange__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GRoleEquipChange extends __GRoleEquipChange__ {
	@Override
	protected void process() {
		// protocol handle
		final byte changetype = getType(pos);
		if (changetype == 0 && ride == -1) // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎灞炬櫖缂傚倸鍊搁崐鍝ョ矓閻㈠憡鍋嬮柣妯款嚙缁犳牗淇婇妶鍛櫤闁哄懏鐓￠獮鏍垝閻熸澘鈷夐梺璇茬箰閻楀繒妲愰幘瀵哥懝濠电姴鍟鍫曟⒑鐠囨彃鍤辩紓宥呮瀹曟垶鎷呴崷顓ф锤濠电姴锕ら悧濠囨偂濞嗘挻鐓欏ù锝呭暞閻濐亝绻涢崨顓熷殗闁哄矉缍侀獮鎺楀棘閸喖顬嗙紓鍌欒兌缁垶鎯勯姘辨殾婵°倕鎳忛崑鍌炲箹缁懓澧查柟铏懄缁绘繂鈻撻崹顔界亪闂佹寧娲╂俊鍥礆閹烘鏁嶉柣鎰皺椤斿棝姊洪崨濠勨槈闁宦板姂楠炲棝鎮欓悜妯煎幗闂佺粯姊婚…鍫ニ夌�ｎ偁浜滈柟閭﹀灠娴滃湱绱掓潏銊﹀磳鐎规洘甯掗埢搴ㄥ箣椤撶啘婊勪繆閻愵亜锟芥牠宕归棃娴虫稑鈹戠�ｎ剙绁﹂梺纭呮彧缁犳垿鎮欐繝鍕枑闊洦绋戝Ч鏌ユ煥閺囩偛锟藉綊鎮″▎鎾村�垫繛鎴炵懐閻掕棄鈹戦垾铏濞ｅ洤锕獮鎾诲箳閺傚簱鍙洪梻浣告惈閺堫剙煤濠靛牏涓嶆繛鎴欏灩閸楁娊鏌ｉ幇顓炲闁稿海鏁诲璇测槈濡粎鍠栭幃鈩冩償閳ユ剚鐎辩紓鍌氬�烽懗鍓佸垝椤栨粎鐭欓柟鍓х帛閺呮悂鏌ｉ敐鍛拱闁哄棌鏅滈妵鍕敇閻愰潧顣洪梺鐑╂閸樿姤绌辨繝鍥ㄥ�锋い蹇撳閹风兘寮介鐐茬�梺姹囧灮椤牏绮婚悩铏弿婵°倕顑嗙�氱懓螖閻橀潧浠滈柛鐔告尦楠炲啫鈻庨幋鐐叉櫝婵炶揪缍�椤濡靛┑鍥ヤ簻闁靛繆鍓濋ˉ鍫拷瑙勬磸閸旀垿銆佸☉姗嗘僵妞ゆ帒鍊婚弶浠嬫⒒閸屾艾锟芥悂宕愰悜鑺ュ殑闁割偅娲忛敓鎴掔劍缁绘繈宕惰濡差剟姊洪幖鐐插姶闁告挻鐟х划鍫熷緞瀹�瀣妤犵偛鐏濋崝姘舵煙閸愬樊妯�鐎殿喚顭堥鍏煎緞鐎ｎ剙骞堥梻渚�娼чˇ浠嬪窗閺嶃劍娅犳い鏍仦閻撶喖鏌熼幑鎰【闁哄鐩弻锛勪沪鐠囨彃顬堥梺瀹狀潐閸ㄥ灝鐣烽崡鐑嗘建闁糕剝锕╁Λ褔姊婚崒娆戭槮缁剧虎鍘鹃崚鎺楊敍濮ｎ厼鎼～婊堟晸娴犲宓侀柛顐犲劚鎯熼梺鎸庢煥婢т粙鎯侀崼銉︹拺闁告稑锕ゆ慨锟介梺鍝勫�搁崐鍦矉閹烘顫呴柕鍫濇閿熺晫鏁婚幃宄扳枎韫囨搩浠剧紒鍓у亾閹倿寮诲☉銏犳閻犳亽鍓遍妶澶嬬厵妤犵偛鐏濋悘鈺呮煃鐟欏嫬鐏╅柨鐔告灮缂嶅棙绂嶉悙鏍稿洭寮跺▎鐐瘜闂侀潧鐗嗗Λ妤呮煂濠婂牊鐓欓柣鎴ｅГ閺佽京绱掔紒妯兼创鐎规洏鍔戦、姘跺川椤旂偓婢掑┑鐘愁問閸犳牠鏁冮敂鎯у灊妞ゆ牜鍋涚粻顖炴煕濞戞鎽犻柛瀣剁節濮婃椽顢橀妸褏鏆犲┑鐐茬墛缁诲牓寮婚敐鍡樺劅闁挎繂妫禒褔姊鸿ぐ鎺濇闁稿繑锕㈠濠氭偄閸忓皷鎷婚柣搴ㄦ涧婢瑰﹤危椤斿墽纾藉ù锝呮惈鏍￠梺缁橆殕椤ㄥ棛绮氭潏銊х瘈闁搞儺鐏涜閺屾稑鈽夐崡鐐茬濠电偛鐗滈崣鍐潖濞差亜浼犻柛鏇㈡涧閸撲即姊虹紒姗嗘當婵☆偅绻堥崹楣冩晜閻愵剙纾梺闈涱煭缁犳垹澹曢娑氱闁圭偓娼欓崵顒勬煕閵娿倕宓嗙�规洘绮撳璺衡枎閻愵剙鐦滈梻渚�娼ч悧鍡涘箠濮楋拷閹澘顭ㄩ崼鐔哄幍闂佸憡鍨崐鏍拷姘炬嫹 by changhao
			return;
		Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		if (role == null)
			return;
		if (null == role.getScene())
			return;

		if (changetype != 0) // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞楅梻渚�娼х换鍫ュ春閸曨垱鍊块柛鎾楀懐锛滈梺褰掑亰閸欏骸鈻撳锟介弻銊╂偄缂佹﹩妫勭紓浣哄Т缁夌懓鐣烽弴銏犵闁诲繒绮鑺ヤ繆閹间礁鐓涢柛灞捐壘婢规帡姊绘担铏广�婇柛鎾寸箞婵￠潧顭ㄩ崼鐔告闂佸吋浜介崕杈╃箔閹烘挶浜滄い鎰剁悼缁犵偤鏌熼鐣屾噰妞ゃ垺顨婇弫鎾寸鐎ｅ灚鏅滈梺鑲╊焾閸氾拷缂佽妫濋弻鏇㈠醇濠靛洦鎮欓柛鐔告倐濮婅櫣绮欏▎鎯у壉闂佺儵鏅╅崹璺侯嚕椤愶箑绀冩い鏂挎閵娾晜鐓冮弶鐐村閸忓矂鏌ｉ敐澶岀暫婵﹥妞藉畷顐﹀礋椤愶絾顔勯梻浣虹帛椤ㄥ懎螞濞嗘挸纾挎い鎰堕檮閳锋垿鎮归崶銊ョ祷闁搞倛浜槐鎾愁吋閸涱噮妫＄紓浣稿�哥粔鎾煘閹寸媴鎷烽敐搴濈敖闁绘稏鍎遍埞鎴﹀煡閸℃浠梺娲讳海椤绮嬪鍜佺叆闁割偆鍠撻崢顏堟椤愩垺鎼愰柨鏇樺劦閿濈偞绻濋崘顏嗩啎闂佸壊鍋嗛崰鎾绘儗瀹�鍕叆闁绘柨鍤栭幏鐑芥偆娴ｅ湱绉锋繝鐢靛仜瀵墎鍒掗幘宕囨殾濞村吋娼欓崘锟藉銈嗘尰缁綁骞忛柨瀣懝闁跨喕妫勯锝夊箻椤旂⒈娼婇梺缁樕戦悥鐘诲炊閵娧冨箞闂備線娼чˇ浼村垂閻㈢鐤ù鐓庣摠閸嬧晠鏌涘Δ鍐ㄤ汗闁猴拷娴犲鐓熸俊顖濇娴犳盯鏌￠崱蹇旀珔闁宠鍨块、娆撳箚瑜嶉獮瀣⒑闂堟稒顥滈柛濠傛健楠炴劖绻濋崘顏嗗骄闂佸啿鎼鍥╃矓椤旀拝鎷风憴鍕８闁告梹鍨甸锝夊醇閺囩偟顓哄┑鐘绘涧閻楃偤骞忛悜绛嬫晣闁绘棁娅ｉ鏇㈡⒑閸濆嫷妲归柛銊ф暬楠炲啴骞嬮悙鐢殿啎闂佺绻楅崑鎰板箠閸涱垳纾兼い鏂跨仢閸氬綊鏌熼崣澶嬪唉鐎规洜鍠栭崺锟犳晸閻ｅ矁濮冲┑鐘崇閳锋垿鎮峰▎蹇擃仼妞ゅ孩绮嶇换娑欏緞鐎ｎ剚鍒涢梺璇″灟缁�渚�鈥﹂妸鈺侀唶闁绘柨鎼獮鎰攽閻愯埖褰х紒鑼跺Г缁旂喐绻濋崶褏锛熼梺鍝勫暙閻楀﹪鎮″☉銏″�堕柣鎰邦杺閸ゆ瑥鈹戦鐓庯拷鍧楀蓟閻旂⒈鏁婇柛婵嗗閹峰嘲鈹戦崱娆愭闂佸湱鍎ら崹鐔肺ｉ崼鐔稿弿婵°倧鎷锋俊顐ｆ⒒濡叉劙鏁撻敓锟� by changhao
		{
			role.components.put(changetype, itemid);
			if (changetype == SpriteComponents.SPRITE_WEAPON) {
				if (itemid != 0)
					role.components.put((byte) SpriteComponents.SPRITE_WEAPONCOLOR,	itemcolor);
				else
					role.components.remove((byte) SpriteComponents.SPRITE_WEAPONCOLOR);
			}
			// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鏉戭潩鏉堚敩銏ゆ⒒娴ｈ鍋犻柛搴㈡そ瀹曟粓鏁冮崒姘�梺鍛婂姦閸犳鎮￠妷鈺傜厸闁搞儲婀圭花濂告倵濮橆剛绉烘慨濠傛惈鏁堥柛銉戝秵瀚规俊銈呮噹绾惧鏌熼幑鎰厫鐎规洖寮剁换婵嬫濞戞瑥绐涚紓浣叉閹风兘姊绘担渚劸闁哄牜鍓涢崚鎺戠暆閸旇偐鍏橀弫鎾寸鐎ｎ偀鎷绘繛杈剧导鐠�锕傛倿閻愵兙浜滈柟瀵稿仜閻忊晠鏌熼獮鍨仼闁宠鍨归敓鏂ょ秵娴滐綁骞楅弴銏″�垫鐐茬仢閸旀碍銇勯敂璇茬仭閻庨潧銈搁幃鈺冪磼濡厧骞堥梻浣告惈濞层垽宕濈仦鐐珷妞ゆ梻鏅粻楣冩煕濠婂啫鏆熺紒澶樺枟閹便劍绻濋崒銈囧悑閻庤娲樼敮鎺楋綖濠靛鏁勯悹鎭掑妽閺呭ジ姊婚崒娆戝妽闁诡喖鐖煎畷婵嗙暆閸曨剙浜梺缁樻尭鐎垫帡宕甸弴鐐╂斀闁绘ê纾。鏌ユ煛閸涱喖绲绘い顓℃硶閹瑰嫰鎮弶鎴濐潬婵＄偑鍊栭幐璇差渻閽樺娼栨繛宸簻缁犱即骞栨潏鍓ф偧闁伙絿鏁诲娲偡閺夎法楠囬梺鐑╂櫓閸ㄥ爼鎮伴鍢夌喖鎳栭埡鍐跨床婵犵妲呴崹鎶藉储瑜旈悰顕�宕奸妷锔规嫼闁荤姴娲﹁ぐ鍐吹鏉堚晝纾界�广儱鎳忛ˉ鐐电磼閸屾氨效鐎规洖銈稿鎾倷绾板鍚归梻鍌欑閹碱偊宕锔藉亱濠电姴娲﹂崑鍌涚箾閸℃ê濮傚ù婊勭矒閺岋繝宕橀妸銉嫹閸濄儲鏆滈柤绋垮悁缁诲棝鏌熺紒妯轰刊闁绘挸銈搁弻锛勪沪閻ｅ睗銈夋煙妞嬪骸鈻堢�规洩绲惧鍕節閸愨晜娈紓鍌氬�搁崐鐑芥嚄閼稿灚鍙忛柣銏犳啞閸庡孩銇勯弽顐户鐎规挷鐒︾换娑㈠幢濡纰嶇紓渚婃嫹闁告劦浜濋崰鎰扮叓閸ャ劍绀�妞ゃ儲鑹鹃埞鎴︽偐瀹曞浂鏆￠梺鎶芥敱鐢繝寮诲☉姘勃闁告挆鍕珮婵＄偑鍊х拋锝囩不閹捐钃熼柣鏂挎惈閺嬪牓鏌涘Δ鍐ㄤ粧缂併劌顭烽弻褔鎳￠妶鍛勃缂備胶绮惄顖氱暦閸楃倣鏃堝礃椤撶姭鏁嶅┑鐘垫暩閸嬫稑螣婵犲啰顩叉繝濠傜墕缁�鍐煥閻旂粯顥夋い顏勫暣婵″爼宕卞Ο娲�洪梻浣告啞閸旀洟鈥﹂悜鐣屽祦闊洦绋掗崐濠氭煠閹帒鍔滄繛鍛濮婅櫣绱掑Ο鍝勑曢梺鍛婃尰閻熝勭珶閺囥埄鏁嶉柣鎰ˉ閹锋椽姊婚崒姘卞濞撴碍顨婇幃锟狀敇閻樼數锛滈梺缁樏崯鍧楁倶閳轰緡鐔嗛悷娆忓缁�瀣亜閵忥紕娲撮柟顔界懅閸掓帞鎲撮崟顐紪闂傚倸鍊风粈渚�骞夐敍鍕煓闁硅揪闄勯弲婵嬫煥閺傚灝鈷斿☉鎾崇Ч閺岀喖宕滆鐢盯鏌涙繝鍌滀粵闁逛究鍔岃灒闁割煈鍠氶崢顐︽⒑鏉炴壆绐斿ù婊冪埣楠炲啫螖閸涱噮妫冨┑鐐村灦閻楁洘绂掗锟藉鐑樻姜閹殿喖濡介梺瑙勭摃瀹曠數鍒掔�ｎ喖绠抽柡鍐╂尰鐎氬綊鏌ㄥ┑鍡涱�楀ù婊勫姍閺岀喐顦版惔锝呯缂備胶绮粙鎺戭焽韫囨稑绀堢憸搴ㄥ磻瑜斿娲倻閳轰礁鈷夊┑鈽嗗亜閸燁偊鎮鹃悜鑺ュ仺缂佸娉曢ˇ銊ヮ渻閵堝棙鈷掗柡鍜佸亰瀹曘垽鏌嗗鍡忔嫼缂傚倷鐒﹂埣銈夘敂閸℃妫滃銈嗘尵閸犳劕鈻嶉悩缁樼厽闁靛繒濮甸崯鐐烘煟閹惧鈽夐棁澶愭煥濠靛棙绁╅柣鎺楃畺閺岋繝宕遍鐘插煂闂佸疇顫夐崹鍧楀极瀹ュ绀嬫い鎺戝�告慨鑺ヤ繆閻愵亜锟窖囨⒔閸曨垰绠伴柟鎯版閽冪喖鏌ㄥ┑鍡╂▓闁轰礁娲弻锝夊籍閸屾艾濡洪梺闈╃导閸楀啿顫忓ú顏勪紶闁告洦鍣鍫曟⒑閸涘﹥鈷愰柛銊ユ健閻涱噣宕橀鍢壯冾熆鐠虹尨鍔熼柨娑欑矊閳规垿鎮欓弶鎴犱桓闂佹寧娲嶉弲婊咃拷闈涖偢閺佹捇鏁撻敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ψ瑜忕壕钘壝归敐鍛儓鐏忓繘姊洪崨濠庢畷濠电偛锕ら锝嗙節濮橆厼浜滈梺绋跨箰閻ㄧ兘骞忔繝姘厽閹艰揪绱曟禒娑㈡煟閳╁啯绀堢紒顕嗙到铻栭柛娑卞枓閹锋椽鏌℃径灞戒沪濠㈢懓妫濊棟闁挎洖鍊归崐鍨叏濮楀棗浜滅�规挸妫涢敓鑺ヮ問閸犳盯顢氳閸┿儲寰勯幇顒夋綂闂佺粯锕㈠褎鎱ㄩ崼鏇熲拻濞达絽鎲￠崯鐐烘煕閺冿拷椤ㄥ﹤鐣烽幋锕�绠绘繛鑼帛閺咃綁姊洪懡銈呮瀾濠㈢懓顑夊銊︾鐎ｎ偆鍘介梺褰掑亰閸撴盯骞楅悩缁樺�堕煫鍥风到楠炴鏌曢崶褍顏い銏★耿閹晠骞撻幒鎴狀吅闂佽瀛╅鏍窗濞戙埄鏁嬬憸鏃堝春閵夛箑绶炲┑鐘插閸嶉潧顪冮妶鍡楀Ё缂佽尪濮ら崚濠冨鐎涙ǚ鎷绘繛杈剧到閹诧繝宕悙鐑樼厵缂佸瀵чˉ銏拷瑙勬磸閸旀垿銆佸☉姗嗘僵妞ゆ帒鍊婚幊鍡涙⒒閸屾艾锟芥悂宕愰幖浣哥９濡炲娴烽惌鍡椼�掑鐐濡ょ姷鍋為〃鍛粹�﹂妸鈺侀唶婵犻潧顑嗛敍妤呮⒒娴ｇ懓顕滄繛鍙夌墵瀹曟劙宕妷褌绗夊銈嗙墱閸嬬偤鎮￠妷鈺傜厽闁哄洨鍋涢敓钘夋贡閿熻姤鐔幏锟�?2
			if (changetype == SpriteComponents.ROLE_COLOR1) {
				xbean.Properties prop = xtable.Properties.select(roleid);
				role.components.put((byte) SpriteComponents.ROLE_COLOR2,
						prop.getRolecolor2());
			}
		}

		if (ride != -1) // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎灞炬櫖缂傚倸鍊搁崐鍝ョ矓閻㈠憡鍋嬮柣妯款嚙缁犳牗淇婇妶鍛櫤闁哄懏鐓￠獮鏍垝閻熸澘鈷夐梺璇茬箰閻楀繒妲愰幘瀵哥懝濠电姴鍟鍫曟⒑鐠囨彃鍤辩紓宥呮瀹曟垶鎷呴崷顓ф锤濠电姴锕ら悧濠囨偂濞嗘挻鐓欏ù锝呭暞閻濐亝绻涢崨顓熷殗闁哄矉缍侀獮鎺楀棘閸喖顬嗙紓鍌欒兌缁垶鎯勯姘辨殾婵°倕鎳忛崑鍌炲箹缁懓澧查柟铏懄缁绘繂鈻撻崹顔界亪闂佹寧娲╂俊鍥礆閹烘鏁嶉柣鎰皺椤斿棝姊洪崨濠勨槈闁宦板姂楠炲棝鎮欓悜妯煎幗闂佺粯姊婚…鍫ニ夌�ｎ偁浜滈柟閭﹀灠娴滃湱绱掓潏銊﹀磳鐎规洘甯掗埢搴ㄥ箣椤撶啘婊勪繆閻愵亜锟芥牠宕归棃娴虫稑鈹戠�ｎ剙绁﹂梺纭呮彧缁犳垿鎮欐繝鍕枑闊洦绋戝Ч鏌ユ煥閺囩偛锟藉綊鎮″▎鎾崇骇闁割偅绻傞埛鏃堟煟閿濆鎲剧�规洖鐖奸獮姗�顢欑憴锝嗗闂備礁鎲＄粙鎴︽晝閿濆洦顐介梺顒�绉甸悡鏇㈡煏婵炲灝鍔氶柤绋跨秺閺屽秶绱掑Ο璇查瀺闂侀潧鐗炵紞浣哥暦濮楋拷閸╃偤鎮欓锟介褰掓⒒閸屾瑧顦︽繝锟介柆宥侊拷锕傚醇濠㈡繆顫夐ˇ鐗堟償閿濆嫮鐟濋梻浣烘嚀婢х晫鍒掗鐐村亗婵炲棙鎸婚悡鏇熺箾閸℃绂嬫俊鐙欏洦鐓犻柡澶嬪閸嬨儵鏌″畝锟介崰鏍�佸▎鎾充紶闁告洦鍘虹槐娆撴⒒娴ｇ瓔鍤冮柛鐘冲浮瀹曟粌鈹戠�ｎ亞鐣鹃梺鍝勫�哥花閬嶅绩娴犲鐓曟い鎰Т閻忊晠鏌ㄩ悢鐑樻珪闁稿鍊曢～蹇旂節濮橆剛锛滃┑鐐叉閸╁牆危椤曪拷濮婅櫣鎲撮崟顓滃仦闂佽法鍠庨敓鐣屽枔琚﹀┑鐐叉▕娴滄繈宕戦崟顐熸斀闁稿本鍑瑰Σ娲煕閺冨倸鍘撮柟顔煎槻椤劑宕橀顖嗗洦鐓曢柍鐟扮仢閻忓弶顨ラ悙鎼劷缂佽鲸甯掕灒缂備焦锕╂禒褔姊婚崒娆愮グ婵炲娲熷畷鎶芥晝閸屾氨顔嗛梺璺ㄥ櫐閹凤拷 by changhao
		{
			role.components.put((byte) SpriteComponents.SPRITE_HORSEDRESS, ride);
		}
		
		if (effect != -1) {
			role.components.put((byte)SpriteComponents.SPRITE_EQUIP_EFFECT, effect);
		}

		role.marshal();
		if (role.checkVisible()) {
			SRoleComponentsChange send = new SRoleComponentsChange();
			send.roleid = roleid;

			if (changetype != 0) {
				send.components.put(changetype, itemid);
				if (changetype == SpriteComponents.SPRITE_WEAPON) {
					if (itemid != 0)
						send.components.put((byte) SpriteComponents.SPRITE_WEAPONCOLOR,	itemcolor);
					else
						send.components.put((byte) SpriteComponents.SPRITE_WEAPONCOLOR, 0);
				}
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鏉戭潩鏉堚敩銏ゆ⒒娴ｈ鍋犻柛搴㈡そ瀹曟粓鏁冮崒姘�梺鍛婂姦閸犳鎮￠妷鈺傜厸闁搞儲婀圭花濂告倵濮橆剛绉烘慨濠傛惈鏁堥柛銉戝秵瀚规俊銈呮噹绾惧鏌熼幑鎰厫鐎规洖寮剁换婵嬫濞戞瑥绐涚紓浣叉閹风兘姊绘担渚劸闁哄牜鍓涢崚鎺戠暆閸旇偐鍏橀弫鎾寸鐎ｎ偀鎷绘繛杈剧导鐠�锕傛倿閻愵兙浜滈柟瀵稿仜閻忊晠鏌熼獮鍨仼闁宠鍨归敓鏂ょ秵娴滐綁骞楅弴銏″�垫鐐茬仢閸旀碍銇勯敂璇茬仭閻庨潧銈搁幃鈺冪磼濡厧骞堥梻浣告惈濞层垽宕濈仦鐐珷妞ゆ梻鏅粻楣冩煕濠婂啫鏆熺紒澶樺枟閹便劍绻濋崒銈囧悑閻庤娲樼敮鎺楋綖濠靛鏁勯悹鎭掑妽閺呭ジ姊婚崒娆戝妽闁诡喖鐖煎畷婵嗙暆閸曨剙浜梺缁樻尭鐎垫帡宕甸弴鐐╂斀闁绘ê纾。鏌ユ煛閸涱喖绲绘い顓℃硶閹瑰嫰鎮弶鎴濐潬婵＄偑鍊栭幐璇差渻閽樺娼栨繛宸簻缁犱即骞栨潏鍓ф偧闁伙絿鏁诲娲偡閺夎法楠囬梺鐑╂櫓閸ㄥ爼鎮伴鍢夌喖鎳栭埡鍐跨床婵犵妲呴崹鎶藉储瑜旈悰顕�宕奸妷锔规嫼闁荤姴娲﹁ぐ鍐吹鏉堚晝纾界�广儱鎳忛ˉ鐐电磼閸屾氨效鐎规洖銈稿鎾倷绾板鍚归梻鍌欑閹碱偊宕锔藉亱濠电姴娲﹂崑鍌涚箾閸℃ê濮傚ù婊勭矒閺岋繝宕橀妸銉嫹閸濄儲鏆滈柤绋垮悁缁诲棝鏌熺紒妯轰刊闁绘挸銈搁弻锛勪沪閻ｅ睗銈夋煙妞嬪骸鈻堢�规洩绲惧鍕節閸愨晜娈紓鍌氬�搁崐鐑芥嚄閼稿灚鍙忛柣銏犳啞閸庡孩銇勯弽顐户鐎规挷鐒︾换娑㈠幢濡纰嶇紓渚婃嫹闁告劦浜濋崰鎰扮叓閸ャ劍绀�妞ゃ儲鑹鹃埞鎴︽偐瀹曞浂鏆￠梺鎶芥敱鐢繝寮诲☉姘勃闁告挆鍕珮婵＄偑鍊х拋锝囩不閹捐钃熼柣鏂挎惈閺嬪牓鏌涘Δ鍐ㄤ粧缂併劌顭烽弻褔鎳￠妶鍛勃缂備胶绮惄顖氱暦閸楃倣鏃堝礃椤撶姭鏁嶅┑鐘垫暩閸嬫稑螣婵犲啰顩叉繝濠傜墕缁�鍐煥閻旂粯顥夋い顏勫暣婵″爼宕卞Ο娲�洪梻浣告啞閸旀洟鈥﹂悜鐣屽祦闊洦绋掗崐濠氭煠閹帒鍔滄繛鍛濮婅櫣绱掑Ο鍝勑曢梺鍛婃尰閻熝勭珶閺囥埄鏁嶉柣鎰ˉ閹锋椽姊婚崒姘卞濞撴碍顨婇幃锟狀敇閻樼數锛滈梺缁樏崯鍧楁倶閳轰緡鐔嗛悷娆忓缁�瀣亜閵忥紕娲撮柟顔界懅閸掓帞鎲撮崟顐紪闂傚倸鍊风粈渚�骞夐敍鍕煓闁硅揪闄勯弲婵嬫煥閺傚灝鈷斿☉鎾崇Ч閺岀喖宕滆鐢盯鏌涙繝鍌滀粵闁逛究鍔岃灒闁割煈鍠氶崢顐︽⒑鏉炴壆绐斿ù婊冪埣楠炲啫螖閸涱噮妫冨┑鐐村灦閻楁洘绂掗锟藉鐑樻姜閹殿喖濡介梺瑙勭摃瀹曠數鍒掔�ｎ喖绠抽柡鍐╂尰鐎氬綊鏌ㄥ┑鍡涱�楀ù婊勫姍閺岀喐顦版惔锝呯缂備胶绮粙鎺戭焽韫囨稑绀堢憸搴ㄥ磻瑜斿娲倻閳轰礁鈷夊┑鈽嗗亜閸燁偊鎮鹃悜鑺ュ仺缂佸娉曢ˇ銊ヮ渻閵堝棙鈷掗柡鍜佸亰瀹曘垽鏌嗗鍡忔嫼缂傚倷鐒﹂埣銈夘敂閸℃妫滃銈嗘尵閸犳劕鈻嶉悩缁樼厽闁靛繒濮甸崯鐐烘煟閹惧鈽夐棁澶愭煥濠靛棙绁╅柣鎺楃畺閺岋繝宕遍鐘插煂闂佸疇顫夐崹鍧楀极瀹ュ绀嬫い鎺戝�告慨鑺ヤ繆閻愵亜锟窖囨⒔閸曨垰绠伴柟鎯版閽冪喖鏌ㄥ┑鍡╂▓闁轰礁娲弻锝夊籍閸屾艾濡洪梺闈╃导閸楀啿顫忓ú顏勪紶闁告洦鍣鍫曟⒑閸涘﹥鈷愰柛銊ユ健閻涱噣宕橀鍢壯冾熆鐠虹尨鍔熼柨娑欑矊閳规垿鎮欓弶鎴犱桓闂佹寧娲嶉弲婊咃拷闈涖偢閺佹捇鏁撻敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ψ瑜忕壕钘壝归敐鍛儓鐏忓繘姊洪崨濠庢畷濠电偛锕ら锝嗙節濮橆厼浜滈梺绋跨箰閻ㄧ兘骞忔繝姘厽閹艰揪绱曟禒娑㈡煟閳╁啯绀堢紒顕嗙到铻栭柛娑卞枓閹锋椽鏌℃径灞戒沪濠㈢懓妫濊棟闁挎洖鍊归崐鍨叏濮楀棗浜滅�规挸妫涢敓鑺ヮ問閸犳盯顢氳閸┿儲寰勯幇顒夋綂闂佺粯锕㈠褎鎱ㄩ崼鏇熲拻濞达絽鎲￠崯鐐烘煕閺冿拷椤ㄥ﹤鐣烽幋锕�绠绘繛鑼帛閺咃綁姊洪懡銈呮瀾濠㈢懓顑夊銊︾鐎ｎ偆鍘介梺褰掑亰閸撴盯骞楅悩缁樺�堕煫鍥风到楠炴鏌曢崶褍顏い銏★耿閹晠骞撻幒鎴狀吅闂佽瀛╅鏍窗濞戙埄鏁嬬憸鏃堝春閵夛箑绶炲┑鐘插閸嶉潧顪冮妶鍡楀Ё缂佽尪濮ら崚濠冨鐎涙ǚ鎷绘繛杈剧到閹诧繝宕悙鐑樼厵缂佸瀵чˉ銏拷瑙勬磸閸旀垿銆佸☉姗嗘僵妞ゆ帒鍊婚幊鍡涙⒒閸屾艾锟芥悂宕愰幖浣哥９濡炲娴烽惌鍡椼�掑鐐濡ょ姷鍋為〃鍛粹�﹂妸鈺侀唶婵犻潧顑嗛敍妤呮⒒娴ｇ懓顕滄繛鍙夌墵瀹曟劙宕妷褌绗夊銈嗙墱閸嬬偤鎮￠妷鈺傜厽闁哄洨鍋涢敓钘夋贡閿熻姤鐔幏锟�?2
				if (changetype == SpriteComponents.ROLE_COLOR1) {
					xbean.Properties prop = xtable.Properties.select(roleid);
					send.components.put((byte) SpriteComponents.ROLE_COLOR2, prop.getRolecolor2());
				}
				if (effect != -1) {
					send.components.put((byte)SpriteComponents.SPRITE_EQUIP_EFFECT, effect);
				}
			}

			if (ride != -1) {
				send.components.put((byte) SpriteComponents.SPRITE_HORSEDRESS, ride);
			}
			send.spritetype = 0;
			role.sendAround(send);
			// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞剧洴楠炲洭顢涘鍗烆槱闂備焦鐪归崹褰掆�﹀畡閭︽綎缂備焦蓱婵挳鏌ｉ悢鐓庝喊闁搞倕顑呴埞鎴︽倷閹绘帞楠囬梺缁橆殘婵挳鎮鹃悜钘夌疀闁哄娉曢鎰箾鏉堝墽鎮兼い顓炵墦閹顢橀姀鈾�鎷虹紓浣割儓濞夋洟鎮橀柆宥嗙厱閻庯綆鍓欐禒閬嶆煙椤曞棛绡�濠碉紕鍏橀崺锟犲磼濠婂啫绠洪梻鍌欑閹碱偄煤閵娾晛纾绘繛鎴欏灪閺呮悂鏌﹀Ο渚Ч閻犳劧绻濋弻銊╂偄鐠囨畫鎾绘煟閺冩垵澧存鐐茬箻閺佹捇鏁撻敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐鍛傜喎鈻庨幆褎顔勭紓鍌欒兌婵挳鎮樺璺何﹂柛鏇ㄥ枤閻わ拷闂佸湱鍋撻幆灞轿涢妶鍥╃＝濞撴艾锕ョ�氳绻濋悽闈浶㈡繛璇х畵閹繝濡烽埡鍌滃幗闂佸搫鍟ù鍌炲吹濞嗘垶鍋栨慨妯夸含绾捐棄霉閿濆牊顏犻悽顖涚洴閺岋綁鍩℃繝鍌滀哗闂佷紮绲块崗姗�銆侀弮鍫濋唶婵犻潧鐗滃Σ鐗堜繆閻愵亜锟芥洜鎹㈤幇鏉胯摕濠电姴鍋嗛悡銉╂煕椤愩倕鏆遍柟鐤缁辨帞绱掗姀鐘茬闂佺懓鍟跨换姗�骞冮悽鍓叉晜闁糕剝鐟ч敍婊冾渻閵堝棙顥嗗┑顔哄�楁禍鎼侇敇閵忥紕鍘介梺鎸庣箓椤︿即寮潏鈺冪＜闁惧繗顫夊▍鏇犵磼椤旂晫鎳囩�规洖缍婇、娆撴嚃閳瑰灝浠忛梻鍌氬�搁崐鐑芥嚄閸撲礁鍨濇い鏍仜閽冪喖鏌曟繛鍨姶闁搞倖娲熼弻娑㈠箻閼碱剛鐡橀梺鐟板槻閸㈡煡锝炲┑瀣垫晝闁靛牆娲ㄩ崢顖涚節濞堝灝鏋涢柨鏇閸掓帡顢涢悙鑼唵闂佸憡绋掑娆忣啅濠靛棌鏀介柣妯诲絻閿熺晫鎳撻埢鎾愁潨閿熻棄顫忕紒妯诲闁告稑锕ら弳鍫濃攽閳藉棗浜濋柛銊ョ仢椤繑绂掔�ｎ亞顦板銈嗘尵婵兘鎮為崸妤佸�垫鐐茬仢閸旀岸鏌熷畡閭﹀剶闁诡噯绻濇俊鐑藉煛閸屾粌骞堟俊鐐�栭崝褏寰婄捄銊т笉闁瑰墽绮悡鏇㈡煏閸繃顥滈柣蹇旀尦閺屸�崇暆閿熶粙宕伴弽褏鏆︽俊銈呮噺閸ゅ啴鏌嶉崫鍕拷褰掝敊閸愵喗鈷掑ù锝呮啞閸熺偤鏌＄仦璇插缂侇喗妫侀妵鎰板箳閹寸姷鏆梻浣哄仺閸庢煡寮告總绋垮嚑閹兼番鍔嶉悡娆撴煟閹伴潧澧紓宥嗗灥闇夐柣娆欐嫹闁搞劏娉涢～蹇撁洪鍕啇闂佺粯鍔栬ぐ鍐╂叏鎼粹檧鏀介柣鎰皺濠�鎾煕婵犲喚娈滈柡浣规崌閹崇偤濡烽妷銉︾槗闂備礁鎲￠幐楣冨窗閺嶎厼违濞撴熬鎷风�殿噮鍣ｅ畷濂告偄閸涘浠ч梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁橈耿瀵鏁愭径濠勵吅濠电姴鐏氶崝鏍礊濡ゅ懏鈷戦悹鎭掑妼閺嬫瑦淇婇銏狀伃鐎规洘鍔欏畷鐑筋敇閻樼數鍔归梻浣告贡閸庛倕螞閹达箑绠柣鎴ｅГ閺呮煡骞栫划鐧告嫹閼碱剙鍤┑鐘垫暩閸嬫盯骞婂畝鍕瀭闁芥ê顦藉鏍ㄧ箾瀹割喕绨奸柛銈呯Ч閺屾洘寰勬繝鍌涚亾婵炲瓨绮犳禍锝呂涢悢濂夋富闁靛牆妫涙晶閬嶆煕鐎ｎ偆鈽夐弫鍫ユ煛鐏炶鍔滈柍閿嬪灦閵囧嫰骞掗悙鏉戭伓缂傚倷绀侀ˇ閬嶅极婵犳艾绠栭柨鐔哄Т鍞梺鍐叉惈閸婂宕㈡禒瀣拺闁告繂瀚弳娆撴煕婵犲懎鍚归柡渚囧枛閳藉鈻庡鍕泿闂備線娼чˇ顓㈠磿閸濆嫀锝夋惞閸︻厾锛滈柡澶婄墑閸斿秶浜搁鐔翠簻闁瑰墽鍋ㄩ崑銏拷瑙勬处娴滎亜鐣峰锟介、姗�鎮欓弶鎴濆濠电姴鐥夐弶鍖℃嫹濡や焦鍙忛柣鎴ｆ绾剧粯绻涢幋娆忕仼闁汇値鍠楅妵鍕箛閳轰礁濮㈡繛瀛樼矆缁瑥顫忓ú顏呭殥闁靛牆鎲涢姀锛勭婵炴潙顑嗗▍鍥瑰鍜佺劸闁宠閰ｉ獮瀣偐闂堟稓顔岄梻鍌欒兌缁垶宕濆Δ鍛？闁靛牆顦悡鏇㈡煙鐎电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑樺殮閻熼偊鐓ラ柨鐔剁矙瀹曪繝骞庨挊澶庢憰濠电偞鍨崹鍦不婵犳碍鍊甸梻鍫熺♁閸熺偤鏌涢敐鍕祮婵﹨娅ｉ幏鐘诲灳閾忣偆褰庢繝鐢靛仒閸栫娀宕卞▎搴ゅ焻闂傚倸鍊烽懗鍫曞储瑜旈敐鐐哄即閵忕姷锛欏┑掳鍊曢幊蹇涘磿婵犲洦鐓曟い鎰Т閸旀粓鏌嶉柨瀣伌婵﹤顭峰畷濂告偄閻戞ê鍨遍梻浣虹帛缁嬫帞鍒掓惔锝嗩潟闁圭儤顨呯粻鐢告煙閻戞ê鐏嶉柟绋垮暙閳规垿鎮欓弶鎴犱淮闂佽绻戝畝鍛婁繆閸洘鏅插璺猴功椤︺劑姊洪崘鍙夋儓闁哥噥鍋婇悰顕�骞囬悧鍫氭嫽婵炶揪绲块…鍫ニ夎箛娑欑厱閻庯綆鍋勫ù顔撅拷瑙勬礃閸ㄥ灝鐣烽悢纰辨晢濞达絽婀辫ぐ鍧楁⒒娴ｅ憡璐￠柧蹇撻叄瀹曟澘螖閸涱喖浜楀┑鐐叉閸旀垶绂嶅鍫熺厸闁搞儲婀圭花濂告倵濮橆剚璐＄紒杈ㄦ尰閹峰懘宕崟鎴秮閺岋絽螖閸愩剱銏°亜閺囶亞绋荤紒缁樼箓椤繈顢楅敓浠嬫嚀閸喒鏀介幒鎶藉磹閺囥垺鏅濋柕鍫濐槸缁犳牠鏌熸潏楣冩闁抽攱鍨圭槐鎺楊敍濞戞瑧顦ユ繝鈷�鍕弨闁哄本娲熷畷鍫曞煛娴ｉ攱顫曢柣搴ゎ潐濞叉粍绻涢敓鐣岋拷娈垮枙缁瑩銆佸锟介幃銏ゅ矗婢跺浼滃┑鐘垫暩閸嬬娀骞撻鍡欑闁跨喕妫勯埞鎴︻敊閸濆嫸鎷峰Δ锟介埥澶愭偨缁嬪潡鍞堕梺鍝勬川閸犳捇宕㈤柆宥嗏拺闁圭娴风粻鎾剁磼缂佹ê娴柟顕�绠栧畷褰掝敃椤愶綆鍟嶉梻浣虹帛閸旀浜稿▎鎴犱笉濠电姵纰嶉悡娑樏归敐鍫綈鐎规洖鐭傞弻鈩冩媴鐟欏嫬纾抽梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�?
			fire.pb.scene.movable.SceneTeam team = SceneTeamManager.getInstance().getTeamByID(roleid);
			if (team == null) {
				gnet.link.Onlines.getInstance().send(roleid, send);
				return;
			}
			Set<Long> roleids = new HashSet<Long>();
			for (Role member : team.getMembers()) {
				roleids.add(member.getRoleID());
			}
			
			if (!roleids.isEmpty())
				gnet.link.Onlines.getInstance().send(roleids, send);
		}
	}

	/**
	 * WEAPON		= 0; //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婎潊闁绘ê妯婂Λ宀勬⒑鏉炴壆顦﹂柨鏇ㄤ邯瀵鍨鹃幇浣告倯闁硅偐琛ラ敓钘夌－椤旀劗绱撻崒娆戝妽闁告梹鐗犻妴鍐幢濡皷鏀虫繝鐢靛Т濞层倕娲块梻浣告啞娓氭宕㈤挊澶嗘灁闁哄被鍎查崐鐢告偡濞嗗繐顏紒锟介崘顔界厽闁瑰灝瀚弧锟介悗娈垮枛椤兘骞冮姀銈呯闁兼祴鏅涙慨娲⒒娴ｇ懓顕滄繛娴嬫櫊楠炲繘鎮滈懞銉у幐闁诲函绲婚崝宀勬晸閼恒儲绀嬮柛鈹垮劜瀵板嫰骞囬鍌ゅ晪闁诲氦顫夊ú鏍р枖閿曚緡妯勯梺鍝勫閿熻棄纾弳鍡涙煥閻斿墎鐭欑�规洑鍗抽獮妯肩磼濡粯顏熼梻浣稿悑娴滀粙宕曢幎钘夌參濞达絽绠嶆禍婊勩亜閹捐泛浠﹀璺哄鑿愰柛銉戝秷鍚悗瑙勬礀閻栧ジ銆佸Δ浣瑰闁告繂瀚粻浼存⒒娴ｇ瓔鍤欓柛鎴犳櫕缁辩偤宕卞Ο纰辨锤闂佺粯鍔曢悺銊モ枍韫囨稒鈷掗柛灞剧懅椤︼箓鏌熺喊鍗炰簽闁诡噮鍣ｉ、鏇㈡晝閿熺晫绮堟径鎰厵閺夊牆澧介悾杈╃磼閻樺磭澧甸柡灞炬礋瀹曠厧鈹戦幇顓夛妇绱掗悙顒�鍔ら柛姘儑閹广垹鈽夐姀鐘殿吅闂佺粯鍨靛ú锝囨閸偆绠鹃悗鍨偠閿熻棄顑夐獮蹇涙晸閿燂拷
		ACCESSORY	= 2; //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻鐔虹磼閵忕姵鐏嶉梺绋块椤︻垶鈥﹂崸妤佸殝闂傚牊绋戦～宀�绱撴担鍝勭彙闁搞儯鍔庨崢閬嶆⒑閸濆嫮袪闁稿﹥娲橀弲鍫曞蓟閵夛箑锟藉灚鎱ㄥ鍡楀缂佸妞介弻锛勪沪闂堚晜瀚归柟棰佺閹垿鏌熼懖鈺勊夐柨鐔绘绾绢參顢欐径鎰拻濞达綀濮ょ涵鍫曟煕閻樿櫕绀�閾荤偤鏌涢弴銊ョ仩闁汇値鍣ｉ弻鈩冨緞鐎ｎ亞浠奸梺鍝勬４缁犳捇寮诲☉妯滄棃宕橀…鎺撳闁挎繂顦猾宥夋煥閻旂儤娅曢柟骞垮灩閳规垹锟斤綆浜為ˇ鏉款渻閵堝棗濮х紒鍙夊劤琚欓柛鏇ㄥ墰缁★拷闂佹眹鍨藉褎鐗庢俊鐐�栧褰掓偋閻樿尙鏆﹂柡澶庮嚦閺冨牆宸濇い鎰靛墯鐎氬綊鏌涢幇闈涙灈缂佺姵鐩弻鈩冨緞鎼淬垻銆婂銈嗘煥濡繂顫忕紒妯诲闁告縿鍎伴搹搴☆渻閵堝棗鐏﹂柛鏃�娲熼崺銏ゅ箻鐎靛壊娴勯柣搴秵閸嬪棝宕㈡禒瀣拺鐟滅増甯掓禍浼存煕閹垮嫮鐣电�规洜鏁婚幃銏＄附婢跺苯鏁搁柣鐔哥矊缁绘ê顕ｉ锝囩瘈婵﹩鍓濋幗鏇㈡⒑閺傘儲娅呴柛鐕佸灡閸掑﹪骞橀钘変画濠电偛妫楃换鎰邦敂閳哄啰妫柣鎰靛墮閳绘洘鎱ㄦ繝鍕妺婵炵⒈浜獮宥夘敊閻撳寒鐎撮梻鍌欑濠�閬嶅箠閹捐秮娲敇閻戝棗娈ㄥ銈嗗姧缁犳垹绮婚懡銈囩＝濞达綀鍋傞幋婵冩瀺闁靛繈鍊栭埛鎴︽偣閹帒濡兼繛鍛姍閺岀喖宕欓妶鍡楊伓
		ARMOR 		= 3; //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃闁硅櫕鎹囬垾鏃堝礃椤忓孩瀚归柨婵嗙凹缁ㄥジ鏌熼惂鍝ョМ闁哄矉缍侀、姗�鎮欓幖顓燁棧闂傚倸娲らˇ鐢稿蓟閵娿儮鏀介柛鈩冪懃閳峰牆鈹戦悙鎻掓倯闁告梹鐗滈幑銏犫槈閵忕姴绐涘銈嗙墬閸╁啴寮搁崨瀛樷拺闁告繂瀚～锕傛煕婵犲啰绠為柣娑卞枟缁楃喖鏁撴禒瀣祦闁圭儤顨呯粻锝嗙節闂堟稒锛嶆繛绗哄劦濮婂宕掑▎鎴М闂佺顕滅换婵嬪箖閻戣棄唯鐟滃骸鐣烽崣澶嬪弿婵°倕顑嗙�氬綊鎮楀▓鍨灈妞ゎ厾鍏樺顐﹀箛椤撶偟绐炴繝鐢靛Т鐎氱兘宕ラ崨瀛樷拻濞达絿鎳撻婊呯磼鐠囨彃锟芥瓕鐏嬪銈嗘尵閸婏絽鈽夐姀鐘殿槹濡炪倖鐗楃粙鍫ュ箯濞差亝鈷戦柛娑橈功缁犳捇鎮楀鍗炲幋鐎规洘娲橀幆鏃堟晲閸モ晪绱查梻浣稿悑閹倸顭囪瀹曨偊鎼归惂鍛婂婵炲牆鐏濋弸娑欍亜椤撱垺鏁卞ǎ鍥э躬楠炴牗鎷呴崫銉ュ箰闂備胶顭堥張顒勬儗椤旀崘濮冲ù鐘差儐閳锋帒霉閿濆嫯顒熼柣鎺楃畺閺岋繝宕奸銏狀潾缂備緡鍠楅悷鈺呯嵁鐎ｎ喗鏅滅紓浣股戝▍鍡涙⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�
		BELT 		= 4; //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氶梻鍌欒兌椤牏鎮锕�绀夐幖娣妼缁犵喖鏌熼梻瀵割槮缂侇偄绉归弻娑㈩敃閿濆洨鐣奸梺浼欑到閹碱偊鍩為幋锕�鐓￠柛鈩冾殘娴犙囨煟閻欏懏瀚归梺鎸庢穿閹烽攱銇勯鐐村枠闁糕晪绻濆畷鎺懳熼崷顓犳晨闂傚倷绀佸﹢閬嶅磿閵堝鏄ラ柛顐ｆ儕閿濆悿娲敂閸涱垰骞堥梻浣虹帛閸旀宕曢妶鍛鐟滄棃寮诲鍥ㄥ枂闁告洦鍋嗘导灞筋渻閵堝啫鐏柣鐔濆懎鍨濋柣銏㈩暜閹风兘鏁愭惔鈥茶埅闂佸憡鑹鹃幊妯侯潖缂佹ɑ濯撮柛婵勫劤妤旀俊鐐�戦崕鏌ュ箲閸パ呮殾婵°倧鎷锋い顐ｇ矒閺佹捇鎸婃径妯烘婵犵數濮电喊宥夊磻閸曨厾妫柟宄扮焸閸濇椽鏌￠崨顏呮珚婵﹥妞介幃鈩冩償椤旂晫绋愰梻浣侯焾閿曘儵銆冩繝鍥х畺闁跨喓濮寸粻鑽ょ磽娴ｉ姘跺箯濞差亝鐓涘璺鸿嫰娴狅箑顭块悷鐗堫棦鐎规洘绻傞鍏煎緞鐎ｎ剙骞嶉梻浣藉吹閸犳挻鏅跺Δ鍛獥婵☆垳銆嬮幏宄扳枔閸喗鐝梺绋款儏閿曨亪鎮伴鍢夌喖鎳栭埡鍐跨床婵犵妲呴崹宕囧垝椤栫儐鏁傞柣鏂垮悑閳锋帒霉閿濆牆袚缁绢厼鐖奸弻娑㈡晲韫囨洜鏆ゅΔ鐘靛仜缁绘﹢寮幘缁樻櫢闁跨噦鎷�
		BOOT		= 5; //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈囩磽瀹ュ拑韬�殿喖顭烽幃銏ゅ礂鐏忔牗瀚介梺璇叉捣閺佹悂鈥﹂崼鐔剁箚濞寸姴顑嗛埛鎴犵磼鐎ｎ偒鍎ラ柛搴＄箲閵囧嫰骞嬪┑鍥ф畻闂佺硶鏅濋崑銈夌嵁鐎ｎ喗鏅滈柦妯侯槷濮规姊绘担鍛婅础缂侇噮鍨抽弫顔界節閸曨喖小婵炲濮撮鍡涘煕閹寸姷纾藉ù锝咁潠椤忓棛绠旈柍杞拌閺�鑺ャ亜閺傛寧鎯堥柨鐔诲Г椤ㄥ﹪鐛幋锕�顫呴柣姗嗗亝椤秹姊洪棃娑氱濠殿喗鎸抽幊鎾诲垂椤旇鏂�闂佸疇妫勫Λ妤呮倶閵夛负浜滈柡鍥ф濞诧箓藟婢跺矉鎷烽獮鍨姎妞わ缚鍗抽崺娑㈠箣閻樼數锛滈柣搴秵閸嬫帡宕曢妷鈺傜厱閹艰揪绱曟晥闂佸搫鏈粙鎺旀崲濠靛绀冩い蹇撴閺変粙鏌ｆ惔銏╁晱闁哥姵鐗犻垾锕傛煥鐎ｂ晝绠氶梺褰掓？缁�渚�鎮″☉銏＄厱閻忕偛澧介悡顖滅磼閵娿倗鐭欐慨濠勭帛閹峰懏绗熼婊冨Ъ闂備礁鎼悧婊堝礈濞戞艾鍨濇繛鍡樻尭缁狅綁鏌ㄩ弮鍌滃笡闁哄懏绮撳铏规崉閵娿儲鐝㈤梺鐟板殩閹凤拷
		HEADDRESS	= 6; //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁樺姍濠�渚�姊虹粙璺ㄧ闁告艾顑囩槐鐐哄箣閿旂晫鍘遍梺闈涱焾閸庨亶鏁撻懞銉﹀�愰柛鈺冨仱楠炲鏁冮敓鐣屽閸忚偐绡�濠电姴鍊归幑锝夋煕閺冿拷閹倸顫忓ú顏勪紶闁告洦鍋掓禒鎾⒑缁嬫寧鎹ｉ柡浣筋嚙椤曪絾绻濆顒備紜闂佸綊顣︾粈渚�骞冮幋锔界厵闁兼祴鏅炶棢闂佽法鍠曞Λ鍕椤撱埄鏁婇柟閭﹀枤绾句粙鏌涚仦鍓ф噯闁稿繐鑻埞鎴︻敊閽樺鏋欓悗瑙勬穿缁绘繈鐛惔銊﹀癄濠㈣泛瀛╅幉浼存⒒娴ｈ櫣甯涙慨濠傤煼瀹曘垼顦寸紒顔款嚙椤繈鎳滈悽闈涘箺婵犲痉鏉匡拷褔骞忛悜鑺ョ厽婵°倓鑳堕惌濠囨懚閻愮儤鐓曢柡鍥ュ妼閻忥繝鏌ｉ幘瀛樼闁哄本娲樺鍕槈閵忊槅锟藉秹鏌ｈ箛鎾荤崪闂傚嫬瀚伴獮鍫ュΩ閿斿墽鐦堥梺鍛婁緱閸ｎ喗绂掗埡鍛拺闁革富鍘介崵锟介柣搴㈡皑婢ф绌辨繝鍥х濞达綀鍊介妸鈺傜叆闁哄喛鎷烽柛搴＄－缁辩偤骞掑Δ浣叉嫽闂佺鏈悷銊╁礂瀹�鍕厵闁惧浚鍋呭畷宀�锟借娲滈弫璇差嚕娴犲鏁囬柣鎰問閸炵敻姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷
	 * @param pos
	 * @return
	 */
	private final byte getType(final int pos) {
		switch (pos) {
		case EquipItemType.ARMS:
			return SpriteComponents.SPRITE_WEAPON;
		case EquipItemType.TIRE:
			return SpriteComponents.SPRITE_HEADDRESS;
		case EquipItemType.LORICAE:
		case EquipItemType.WAISTBAND:
		case EquipItemType.BOOT:
		case EquipItemType.ADORN:
		{
			return SpriteComponents.SPRITE_FASHION;
		}
//		case EquipItemType.EQUIP_EFFECT:
//			return SpriteComponents.SPRITE_EQUIP_EFFECT;
		case EquipItemType.ROLE_COLOR1:
			return SpriteComponents.ROLE_COLOR1;
		case EquipItemType.ROLE_COLOR2:
			return SpriteComponents.ROLE_COLOR2;
		default:
			return 0;
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 724929;

	public int getType() {
		return 724929;
	}

	public long roleid;
	public int itemid;
	public int itemcolor;
	public int pos;
	public int ride;
	public int effect;

	public GRoleEquipChange() {
	}

	public GRoleEquipChange(long _roleid_, int _itemid_, int _itemcolor_, int _pos_, int _ride_, int _effect_) {
		this.roleid = _roleid_;
		this.itemid = _itemid_;
		this.itemcolor = _itemcolor_;
		this.pos = _pos_;
		this.ride = _ride_;
		this.effect = _effect_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(itemid);
		_os_.marshal(itemcolor);
		_os_.marshal(pos);
		_os_.marshal(ride);
		_os_.marshal(effect);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		itemid = _os_.unmarshal_int();
		itemcolor = _os_.unmarshal_int();
		pos = _os_.unmarshal_int();
		ride = _os_.unmarshal_int();
		effect = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GRoleEquipChange) {
			GRoleEquipChange _o_ = (GRoleEquipChange)_o1_;
			if (roleid != _o_.roleid) return false;
			if (itemid != _o_.itemid) return false;
			if (itemcolor != _o_.itemcolor) return false;
			if (pos != _o_.pos) return false;
			if (ride != _o_.ride) return false;
			if (effect != _o_.effect) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += itemid;
		_h_ += itemcolor;
		_h_ += pos;
		_h_ += ride;
		_h_ += effect;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(itemid).append(",");
		_sb_.append(itemcolor).append(",");
		_sb_.append(pos).append(",");
		_sb_.append(ride).append(",");
		_sb_.append(effect).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GRoleEquipChange _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = itemid - _o_.itemid;
		if (0 != _c_) return _c_;
		_c_ = itemcolor - _o_.itemcolor;
		if (0 != _c_) return _c_;
		_c_ = pos - _o_.pos;
		if (0 != _c_) return _c_;
		_c_ = ride - _o_.ride;
		if (0 != _c_) return _c_;
		_c_ = effect - _o_.effect;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}
