
package fire.msp.move;
import fire.pb.scene.BlockInfo;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GGoto__ extends mkio.Protocol { }

/** Transfor相关的方法
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GGoto extends __GGoto__ {
	@Override
	protected void process() {
		// protocol handle
		fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		if(null == role) return;
		
		if(gototype == fire.pb.move.SRoleEnterScene.SYSTEM_DRAG){
			//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簻椤掋垺銇勯幇顏嗙煓闁哄被鍔戦幃銏ゅ传閸曟垯鍨介弻娑㈠Ω閵夈儻鎷烽崹顕呮綎濠电姵鑹鹃柋鍥煟閺冿拷娴滀粙鏁撻懞銉ユ诞闁哄矉绻濆畷閬嶎敇閻樺灚娈奸梻浣告惈閻绱炴担瑙勫弿闁跨喍绮欓弻鏇㈠醇濠靛浂妫￠梻浣诡儥閸欏啫顫忓ú顏勭闁绘劖褰冮‖澶岀磽娴ｇ瓔鍤欓柛鐔跺嵆楠炴垿濮�閻橆偅顫嶅┑顔筋殔濡寮查悩宸富闁靛牆妫欓ˉ鍡欙拷瑙勬礈閺佸骞嗛崟顒佸劅闁挎繂娲ㄩ敍婵囩箾鏉堝墽鍒伴柟纰卞亰椤㈡挸鐣濋崟顒傚幈闂侀潧顭堥崐鏇炵暤閸℃稒鐓冮柕澶樺灠椤╊剟鏌熼悷鏉款伃濠碘剝鎮傞弫鍐晸閻ｅ苯顥氭い鏍ㄧ〒缁犻箖鏌熼悙顒佺稇闁搞値鍓熼弻娑㈠Ω閵娾晛鎽甸梺鍝勬噷閸庨潧顫忔繝姘＜婵炲棙鍨垫俊钘夆攽閿涘嫬浠﹂悗绗涘懐鐭夌�广儱顦伴弲鏌ユ煕濞戞ê锟藉綊鎯勯姘辨殾闁绘梻鈷堥弫宥嗙箾閹寸偞鐨戦柡鍡愬灲濮婂宕掑顒婃嫹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ユ繝寰锋澘锟芥洟骞婃惔锝咁棜濠电姵纰嶉悡娆撴煙瀹勬媽瀚伴柣鎺嶇矙閺屻劑鎮㈢紒姗嗘闂佺锕ゅ锟犳偘椤曪拷楠炴鎷犻懠顒夊敽闂備胶纭堕崜婵婃懌闂佸搫顦幉鈩冪┍婵犲洦鍊锋い蹇撳閹风兘寮介鐔蜂罕濠德板�曢崯浼存儗濞嗘挻鐓欓柣鎴烇供濞堟柨顩奸崨顓涙斀闁绘绮☉褔鏌ｅΔ鍐ㄤ槐妤犵偛绻戦ˇ鐗堟償閵忕姵鐎梻浣告啞濞诧箓宕滃☉鈶哄洭濡搁埡鍌氾拷鐢告煟瑜嶉幉锛勶拷姘秺濮婇缚銇愰幒鎿勭吹缂備緤鎷峰ù锝堟娑撳秹鏌″搴′簼闁哥姵鍔欓弻锟犲磼濠靛洨銆婇梺鍝勬４缁犳捇寮婚敐澶婄鐎规洖娲ら崫娲⒑閻氬瓨瀚规繛瀵稿Т椤戝棝鎮￠弴鐔翠簻闁规壋鏅涢敓鑺ユ礋瀵娊鏌嗗鍡欏幐闁诲函缍嗘禍鐐烘倿閸涘﹥鍙忓┑鐘插鐢盯鏌熷畡鐗堝櫧缂侇喚鏁搁敓鏂ょ秵娴滄繈顢欓崟顒傜瘈婵炲牆鐏濋弸鐔兼煥閺囥劌浜炵紒顔碱煼楠炴绱掑Ο缁樼彸闂備胶绮崝鏍ь焽濞嗘垶顐介柣鎰ゴ閺�浠嬫煟濡绲绘い鎺嬪灲閺屾稑顓奸崶銊︽瘓濠殿喖锕ュ钘壩涢崘顭嬪綊濡烽妷褍鈪甸悗娈垮枟瑜板啴鍩ユ径濠庢僵妞ゆ帒顦伴ˉ鈥斥攽閻樺灚鏆╁┑顔炬暩閸犲﹤顓兼径瀣簵闂侀潧顧�婵″洨寮ч敓浠嬫⒒閸屾氨澧涚紒瀣浮閺佸秴顓奸崱鏇犵畾闂佸湱绮敮鐐电矓濞差亝鐓涢悘鐐插⒔閳句線鏌熼娑欘棃闁轰礁绉瑰畷鐔煎箠瀹勭増澶勯柣鎾寸洴閹﹢鎮欓幓鎺嗘寖濠电偞褰冮顓㈡晸閼恒儺鍟忛柛鐘愁殜楠炴劙鎼归锛勭畾闂佸綊妫跨粈浣告暜闁荤喐绮岄惌鍌炲箖閻ｅ瞼纾兼俊顖氭贡缁犳岸姊虹紒妯哄Е濞存粍绮撻弫鎾绘嚍閵夛妇顦ㄥ銈冨妸閸庨潧鐣烽锕�唯鐟滃繘鎮＄�ｎ喗鈷戦柤濮愬�曢弸娑㈡煕鐎ｎ亷韬�规洜鏁诲鎾閿涘嫬骞堟俊鐐�栭崝褏寰婇崜褏鐭嗛柛鎰靛枟閻撴盯鏌涘☉鍗炴灍闁稿﹥鍔欓弻锛勪沪鐠囨彃顫囬梺璇″枔閸婃繂鐣烽幒鎴旀婵妫旂槐锟�?
			role.justGoto(sceneid, xpos, ypos, BlockInfo.FLOOR_0_Z, gototype);
			return;
		}else if (delta <= 0){
			//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔曢顓犲姬閿熶粙姊哄Ч鍥х伈婵炰匠鍕浄鐟滄棃寮诲☉姘炬嫹閿濆骸浜濈�规洖鐭傞弻鐔碱敋閸℃瑧鐦堟繝娈垮櫙閹风兘姊洪棃娑氬婵☆偄鐭傞獮蹇撁洪鍛嫼闂佸憡绻傜�氼剟鏁撻挊澶屽煟鐎规洘娲熼獮鎾诲箳閸℃锟芥椽姊洪崨濠勨槈闁宦板姂閹繝寮撮姀锛勫幗闂佸搫娲﹀銊┧囬敃鍌涚厽闊洢鍎抽幃鑲╃磼鏉堛劌娴い銏＄懅閸犲﹥娼忛埡浣瑰�┑掳鍊楁慨鐑藉磻閻愬灚鏆滈柟鐑樻礈娴滄瑥鈹戦悙鑸靛涧缂傚秳绶氬鏌ュ蓟閵夈儳顦遍梺鍝勭▉閸樹粙鍩涢幒鎳ㄥ綊鏁愰崼顐ｇ秷闂佺顑囨繛锟介柡灞剧♁閹棃濮�閿涘嫮鈻忛梻浣哥－缁垶寮婚妸鈺佺叀濠㈣埖鍔曢～鍛存煃閵壯屽姕闁归鍏樺畷濂稿即閻斿搫骞楁繝纰樻閸ㄤ即骞栭銈嗘殰闁绘鏁哥壕濂告偣閸パ冪骇妞ゃ儳鍋ら弻鏇㈠炊瑜嶉顓狅拷娈垮枙缁瑦淇婂宀婃Щ闂佸搫妫寸换婵嗩潖缂佹绡�閹肩补锟芥枼鎷婚梻浣告啞閹搁箖宕伴弽褜鍤曞┑鐘崇閸嬪嫬顪冪�ｎ亜顒㈡繛鍫ョ畺濮婃椽骞栭悙鎻掑Η闂佽法鍠嶇划娆忣嚕閹间礁宸濋悗娑櫭敓鐣屾暬閹嘲鈻庤箛鎿冧痪缂備緤鎷烽柛鎰靛枟閻撱儵鏌￠崶顭嬵亪鎮橀鍕勫酣宕惰闊剚顨ラ悙瀵稿闁瑰嘲鎳愰幉鎾礋椤掑倸绲鹃梻鍌氬�峰ù鍥敋閺嶎厼鍨傞幖娣妼缁�鍐煃閸濆嫬鏆炵悮鐘绘⒒閸屾艾锟芥悂宕愰幖浣哥９闁归棿绀佺壕褰掓煟閹达絽袚闁稿﹤娼￠弻銊╁籍閿熶粙骞忓┑瀣濡炲娴风粻鏃�绻涢幋鐐嗘垿宕虫禒瀣厽妞ゆ挾鍠撻幊鍥煛瀹�锟介崰鎰焽韫囨柣鍋呴柛鎰ㄦ櫓閿熻棄绉瑰铏圭矙閸噮鍔夊┑鈽嗗亜閸熸潙顕ｆ繝姘ч柛姘ュ�曞﹢閬嶆晸閺傘倗绉甸柛瀣嚇閹潧螖娴ｈ櫣鐦堝┑鐐茬墕閻忔繈寮搁悢灏佹斀闁绘劘顕滈煬顒侇殽閻愭彃鏆㈤柕鍥ㄥ姍楠炴帡骞嬮悩鍨闂傚倷绀佸﹢閬嶅磿閵堝鍨傞柣銏㈢《閿熻姤鐗楀鍕箛椤撴稒瀚肩紓鍌欑椤戝牆鈻旈弴鐘典笉闁肩⒈鍓涚壕鍏笺亜閺冨洤浜归弫鍫熺節绾板纾块柡浣筋嚙閻ｇ兘鎮㈢喊杈ㄦ櫖濠殿喗顭堟禍顒�顭囨径鎰拻濞达綀顫夐崑鐘绘煕鎼淬垺銇濋柟顕嗙節瀹曠厧顭块鍛创鐎规洜鍠栭、鏇㈩敃閿濆懐妲ｉ梻鍌欑窔濞佳囨偋閸℃稑绠犻幖鎼厛閺佸棝鏌曡箛瀣拷鏍偂閻斿吋鐓熼柡鍌氱仢缁狙勭箾閸涱叏鍔熼柨鐔诲Г椤旀牠宕板☉銏╂晪鐟滄棃宕洪妷锕�绶為柟閭﹀墻濞煎﹪姊虹紒妯曟垿顢欓弽顓炶埞婵炲樊浜濋埛鎺懨归敐鍛暈闁诡垰鐗撻弻娑欑節閸屾粎楔濡炪們鍨洪悧鏇㈠煝鎼淬劌绠婚柧蹇ｅ亯缁躲垺淇婇悙顏勶拷鏍箰閸洖鍨傛繛宸簼閸嬪倿鏌ｉ弮鍌氬付缂佺姴缍婂鍫曞醇濠靛棌鎸冪紒鐐劤閻忔繈婀侀梺缁樏壕顓㈠煢娓氾拷閺岀喐绗熼崹顔碱瀳闁句紮绲跨槐鎺旓拷锝庝簽娴犮垺銇勯銏″枠婵﹦鍎ゅ顏堝箥椤旂厧顬夐梻浣告贡閹虫挸煤閵堝鍋╅柣鎴ｆ缁犳盯鏌ｅΔ锟介悧鍡樼閻愬绠鹃弶鍫濆⒔閸掔増绻濋敓鑺ユ綇閳哄啰鐓嬮梺缁樺灱婵倝鍩涢幒鎳ㄥ綊鏁愰崼鐕佹濡炪們鍎辩粔鐢稿Φ閸曨垼鏁冮柕蹇婃櫆閳诲牓鎮楃憴鍕婵炶尙鍠栭悰顔芥償閿濆棗鏋傞梺鎸庣箓缁绘垹锟芥艾缍婇弻銊╁即閻愯鎷烽幖浣瑰�峰┑鐘插暔娴滄粍銇勯幒鎴Ц濠⒀屽灡娣囧﹪顢曢姀鐘虫闂佷紮绲块崗妯讳繆閹间礁鐓涘┑鐘插暞濞呭秹姊绘担铏瑰笡闁告梹娲栭锝夊醇閺囩偞杈堥梺璺ㄥ櫐閹凤拷?
			role.justGoto(sceneid, xpos, ypos, BlockInfo.FLOOR_0_Z, gototype);
			return;
		}else{
			//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垹绠婚悗闈涙啞閸ｄ即姊虹拠鈥虫珝婵炰匠鍡欎航闂備胶鍘ч～鏇㈠磹濡ゅ懏鍎婇柛顐犲劜閳锋垿姊婚崼鐔烘创闁绘稒绮庣槐鎺楀箵閹烘垟鎸冨┑鐐村灥閻忔岸濡堕敐澶婄闁宠桨绶ら幏鐑芥偨閸涘﹦鍘卞銈庡幗閸ㄥ灚绂嶅鍕闁圭⒈鍘奸弸銈夋煥閻斿嚖鎷烽悤浣圭秷濠电偛寮剁划鎾愁嚕椤愩倖瀚氱�瑰壊鍠栧▓銊︾箾鐎电孝妞ゆ垶鍔欏顐﹀礃閳瑰じ绨婚梺鐟版惈缁夊爼藝閿斿浜滈煫鍥ㄦ尵閸╋絾鎱ㄦ繝鍐┿仢闁圭绻濇俊鍫曞川椤旀拝鎷烽幆褉鏀介柣姗嗗枛閻忣亪鏌ㄩ弴妯虹伇婵☆偁鍨藉Λ鍛搭敃閵忊�愁槱缂備礁顑嗙敮锟犲箖閿熺姴鍗抽柕蹇ョ磿閸樿棄鈹戦埥鍡楃仴婵炲拑缍侀弫宥咁吋婢跺鍘梺绯曞墲閿氭繛鎼櫍閺岋紕浠︾拠鎻掝潎闂佽鍠撻崹鑽ゆ閹烘埈娼ㄩ柛鈩冿供濡嫰姊婚崒娆愮グ妞ゆ泦鍛床闁瑰瓨绻勯弳鍡涙煙闂傚顦︾紒鐘崇墱閹叉悂寮崼婵堢暫闂佸啿鎼幊蹇涘吹閹寸偑浜滈柟鍝勭Ф閸斿秵銇勯弮锟藉ú鐔奉潖缂佹ɑ濯撮柦妯侯槷濮规顪冮妶搴″箹闁绘鎹囬獮鍐ㄎ熸笟顖涘兊闁哄鐗冮弲婵嬎囬鐐粹拺闁硅偐鍋涢崝鎾煕閹炬潙鍝洪柟顕嗙節瀵挳濮�閿涘嫬骞嶉梻浣虹帛閸旓箓宕滈敃锟介埢鎾诲籍閸喓鍘甸悗鐟板閸嬪﹪宕曡箛娑樼闂侇剙绉甸悡鐔兼煙鏉堝墽鍒扮悮姘舵⒑閹惰姤鏁遍悽顖ょ節瀵鈽夊顐ｅ媰闂佺顫夐崝鏇⑺夊┑瀣拺閻犳亽鍔岄弸娆忊攽椤斿搫锟芥繈鐛崘顔肩＜闁绘劙娼х粊锔界節閻㈤潧孝闁哥噥鍨跺畷鏇㈡偄閸忚偐鍙嗗┑鐘绘涧濡瑩藟濠婂牆绠归柡澶嬪煀闊剚鎱ㄦ繝鍐┿仢闁诡喚鍏橀獮宥夘敊閼恒儱鏋涚紓鍌氬�烽悞锕�顪冮悾宀�涓嶉柡宓苯娈ㄩ梺闈浥堥弲婊堝疾濠靛鐓曢悘鐐插⒔閵嗘帡鏌涘▎蹇旑棦婵﹨娅ｇ槐鎺懳熼悜鈺傚缂傚倷绶￠崳顕�宕归幆鐗堬紓濠电姰鍨奸崺鏍礉閺嶎厽鍋傞柛鎰靛枟閻撱垺淇婇娆掝劅婵☆垰鐗婃穱濠囶敍閵堝棗顏堕梻鍌氬�峰ù鍥ь浖閵娾晜鍊块柨鏇炲�哥粻鏌ユ煕閵夘喖澧柡瀣╃窔閺岀喖宕滆鐢盯鏌￠崨顔藉�愰柡灞诲姂閹倝宕掑☉姗嗕紦?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫孝缂傚秴锕璇差吋婢跺﹣绱堕梺鍛婃处閸嬫捇骞忛柨瀣瘈婵ǜ鍎婚幏鐑藉川閺夋垹鐓戞繝銏ｆ硾閻ジ鎯侀崼鐔虹瘈闁汇垽娼у瓭闂佺锕ょ紞濠呮＂闂佽宕樼粔顕�鎮烽柇锔惧弳闂佸憡鍔︽禍鐐搭殭闂傚倷绀侀幖顐︽儗婢跺本顫曢柡鍥╁枔椤╃兘鏌ㄩ弮鍌氫壕閻庢碍宀搁弻鐔虹磼濡櫣鐟ㄥ銈庡亝瀹�绋款潖缂佹ɑ濯村〒姘煎灣閸旂顪冮妶鍡楃仴闁哥喐娼欓悾宄扳攽鐎ｎ亞顓洪梺鎸庢穿閹风兘鏌﹂崘顏勬灈闁哄矉绻濆畷鍫曞煛娴ｅ湱浜栫紓鍌欒兌婵烇拷缂佺姵鐗犲璇测槈閳垛晪鎷烽敃鍌氱婵犻潧娲ㄦ禍顏勨攽閻樻剚鍟忛柛鐘愁殔鐓ゆ繝濠傛噺椤洟鏌熼幑鎰靛殭缁炬儳鍚嬮幈銊ノ熼懡銈嗏枈闂侀潧绻堥崹鑽ゅ閼测晝纾藉ù锝囨閸忣剟鏌ら幏灞剧《闁跨喕濮ら鏍窗閺嶎厸锟斤箓鎮滈挊澶嬬�梺鐟板⒔缁垶宕戦幇鐗堢叄闊浄绲芥禍婵囥亜韫囨洖鏋涙慨濠勭帛閹峰懘鎳為妷褋锟藉﹪姊洪棃鈺冪Ф缂佺姵鎹囬悰顔跨疀濞戞瑦娅㈤梺璺ㄥ櫐閹凤拷?
			java.util.Random r = fire.pb.scene.MapHelper.getRandom();
			int gox = xpos + (r.nextInt(1) * 2 - 1) * r.nextInt(delta);
			int goy = ypos + (r.nextInt(1) * 2 - 1) * r.nextInt(delta);
			role.justGoto(sceneid, gox, goy, BlockInfo.FLOOR_0_Z, gototype);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 724898;

	public int getType() {
		return 724898;
	}

	public long roleid;
	public long sceneid; // 场景id
	public int xpos;
	public int ypos;
	public int delta; // 允许误差
	public int gototype; // 跳转类型

	public GGoto() {
	}

	public GGoto(long _roleid_, long _sceneid_, int _xpos_, int _ypos_, int _delta_, int _gototype_) {
		this.roleid = _roleid_;
		this.sceneid = _sceneid_;
		this.xpos = _xpos_;
		this.ypos = _ypos_;
		this.delta = _delta_;
		this.gototype = _gototype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(sceneid);
		_os_.marshal(xpos);
		_os_.marshal(ypos);
		_os_.marshal(delta);
		_os_.marshal(gototype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		sceneid = _os_.unmarshal_long();
		xpos = _os_.unmarshal_int();
		ypos = _os_.unmarshal_int();
		delta = _os_.unmarshal_int();
		gototype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GGoto) {
			GGoto _o_ = (GGoto)_o1_;
			if (roleid != _o_.roleid) return false;
			if (sceneid != _o_.sceneid) return false;
			if (xpos != _o_.xpos) return false;
			if (ypos != _o_.ypos) return false;
			if (delta != _o_.delta) return false;
			if (gototype != _o_.gototype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += (int)sceneid;
		_h_ += xpos;
		_h_ += ypos;
		_h_ += delta;
		_h_ += gototype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(sceneid).append(",");
		_sb_.append(xpos).append(",");
		_sb_.append(ypos).append(",");
		_sb_.append(delta).append(",");
		_sb_.append(gototype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GGoto _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(sceneid - _o_.sceneid);
		if (0 != _c_) return _c_;
		_c_ = xpos - _o_.xpos;
		if (0 != _c_) return _c_;
		_c_ = ypos - _o_.ypos;
		if (0 != _c_) return _c_;
		_c_ = delta - _o_.delta;
		if (0 != _c_) return _c_;
		_c_ = gototype - _o_.gototype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

