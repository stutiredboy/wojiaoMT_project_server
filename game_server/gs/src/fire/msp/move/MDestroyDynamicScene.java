
package fire.msp.move;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __MDestroyDynamicScene__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class MDestroyDynamicScene extends __MDestroyDynamicScene__ {
	@Override
	protected void process() {
		// protocol handle
		if (scenetype == fire.pb.move.DynamicSceneType.DREAMLAND_SCENE) {
			for (Long roleid : roleids) 
			if (fire.pb.mission.Module.getInstance().hasUnfinishedFairylandMission(roleid)>0) {
				     //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屻倗鍠婇崡鐐测拻闂佸摜鍠庡ú顓烆潖缂佹ɑ濯寸紒瀣濮ｆ劙姊洪崷顓涙嫛闁稿锕悰顔界節閸愨晛鍔呴梺闈涱焾閸庨亶鎮楅銏♀拺缂佸娉曢悘閬嶆煕鐎ｎ剙浠遍柟顕嗙節瀵挳鎮㈤崜浣虹暰闂備線娼ч悧鍡涘箠鎼淬劌姹叉繛鍡樻尰閻撴洟鏌熼悙顒佺稇闁崇粯娲熼弻锛勪沪鐠囪鎷峰┑鍡╁殨闁告挷鐒﹀畷澶愭煏婵炲灝锟芥稑顬婇幖浣光拻闁稿本纰嶉幖鎰亜閿旂偓鏆�殿喖顭烽弫鎰緞婵犲嫷鍟嬮梻浣瑰劤濞存岸宕戦崨顓犳殾闁规儼濮ら埛鎴︽煕閿旇骞楁繛鍛礀閳规垿鎮滈崶銊ヮ伓闂傚倷绀侀幖顐︽儗婢跺瞼绀婂〒姘炬嫹闁绘侗鍠栭埢搴ㄥ箻瀹曞浂妲规俊鐐�栫敮顏堝箯闁垮浜滈煫鍥ュ劜鐎氾拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊閻樺樊妫岄梺杞扮閿曨亪寮婚垾鎰佸悑閹肩补锟藉磭顔愰梻鍌氬�搁崑鍡涘垂闁秴桅闁告洦鍨伴崘锟介梺闈浤涢崨顖氬笌缂傚倸鍊峰ù鍥╃礄娴兼潙纾归柡鍥ュ灩閻撴﹢鏌熸潏鍓х暠缁炬儳鍚嬮幈銊ヮ潨閸℃绠归梺鍝勬閻楁挸顫忛搹鍦煓闁告牑锟藉厖绱ｆ繝鐢靛仧閵嗗鎹㈠┑鍡╁殨濠电姵鑹炬儫闂佸疇妗ㄧ粈浣哥暤閸℃娓婚柕鍫濇噽缁犱即鏌熼崘鏌ュ弰妞ゃ垺妫冮幊婊堝礂閸濄儳鐣鹃梻浣虹帛閸旓附绂嶅鍫熸櫢濠殿喗鍔曢敓鑺ョ墱缁顓奸崪浣哄弳闂佸壊鍋呯换鍕蓟閸儲鈷戦柛婵嗗濡插綊鏌涢妸銉хШ鐎殿喗濞婇弫鍐磼濞戞艾骞嶉梻浣虹帛閸ㄥ爼鏁嬮梺缁樺笧閸嬫挾鎹㈠☉姘剨闁哄秲鍔嶉悵姘舵⒑閸濆嫮鐒跨紓宥勭窔閻涱喖顫滈敓钘夌暦濡警鍟呮い鏃傚帶鍞繝纰夌磿閸嬫垿宕愰弽顓炵闁归棿鐒﹂崐鑸电節闂堟侗鍎忛柣鎾达耿閺岀喓锟界數顭堟禒婊呯磼閻橀潧鈻堟慨濠呮缁瑧澹曢弴鐔烘创鐎规洖鐖兼俊鎼佸閳ュ磭妲洪梻鍌氬�风粈渚�骞夐垾瓒佹椽鏁冮崒姘�繝闈涘�婚…鍫ュ几娓氾拷閺屾盯寮撮妸銉ヮ潾缂備胶濞�缁犳牠寮诲☉銏犵労闁稿繆鏅滈崹瑙勭閹间緡鏁囬柣妯兼暩閿涙繃绻涙潏鍓у埌鐎殿喛娉涢埢宥夊川鐎涙﹩姊挎繝銏ｅ煐閸旀牠鎮￠悢闀愮箚妞ゆ牗绮岄崝瀣煃缂佹ɑ绀嬮柡灞剧♁閹棃濮�閻樺樊娼氶梻浣告惈閺堫剛绮欓幘缁樻櫢闁哄倶鍊楅崚鏉款熆瑜嶅ù椋庡垝閺冨牜鏁嬮柨鐔剁矙瀵鏁嶉崟顏呭媰闂佸憡鎸嗛敓钘壩ｉ崼銉︹拺閻庡湱濯鎰版煕閵娿儳浠㈤柣锝囧厴瀹曪繝鎮欏鍡樷拹缂佺粯绻冮幏鍛存惞閻у摜骞㈤梻鍌氬�搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜缂佹ɑ娅堥梻浣告啞缁嬫帒顭囧▎鎾村仾妞ゆ柨顫曟禍婊堟煛瀹ュ啫濡块柣顓烆儑閿熷�燁潐濞叉牕顕ｉ崜浣瑰床婵炴垯鍨圭粻锝嗙箾閸℃绠冲ù鐘哄亹缁辨挻鎷呴崫鍕綑闂佹悶鍎崝搴ㄥ储閻㈠憡鐓熼幖杈剧稻閺嗏晜銇勯鐐靛ⅵ鐎规洘绮嶅蹇涘Ω閵堝洨鐣炬俊鐐�栭崝锕傚礈濞戙垺鍋╅柛顭戝亝閸欏繐鈹戦悩鍙夊櫤妞ゅ繒濞�閺岀喐顦版惔鈾�鏋呴梺鎼炲妽閸庢娊鎮鹃悜钘夌倞闁挎洩鎷烽柟钘夘儔濮婂宕掑▎鎴М闂佺濮ょ划鎾崇暦娴兼潙绠涙い鎺戭槺閸斿嘲鈹戦悙鍙夘棡闁圭顭峰畷鎴﹀煛閸涱喚鍘介梺纭呮彧缁插�燁暱闂備胶顭堥鍛拷姘煎櫍閹拷妞ゅ繐鐗嗙粻顖滐拷鐧告嫹闁告洦鍋呴幊娆撴⒒娴ｅ憡鎯堥柟閿嬪灩缁辩偞鎷呴崜鍙夌稁闂佹儳绻愬﹢杈╁閸忛棿绻嗘い鏍ㄧ♁閵囩喐鎱ㄦ繝鍌滀虎闁宠鍨块幃娆撳矗婢跺﹦褰呯紓鍌欐祰瀵挾鍒掑▎鎾崇畺濡わ絽鍟崐濠氭煢濡警妯�闁哥偛鐖煎娲传閸曨剙绐涢梺鍝ュ枎濞硷繝鐛箛鏇犵＜婵☆垵鍋愰鏇㈡煛婢跺﹦澧曞褌绮欏畷姘舵偋閸垻鐦堥梺璺ㄥ枍缁瑥鐣烽敓鐘冲�婚柛銉悍閹风兘宕归姘秺閹晛顔忛鐓庡闂備胶绮幐璇裁洪悢鐓庤摕闁跨喓濮寸壕鍏肩節闂堟稒宸濋柕鍡楋躬濮婅櫣鎷犻懠顒傤啋婵炲瓨绮岄悥鐓庮嚕婵犳艾惟闁冲搫鍊告禍婊堟煟閻樺弶澶勯柣锝庡亰楠炴绱掑Ο鐓庡箞闂備胶鎳撻悺銊ф崲閸曨厾鐭撻柧蹇曟閹烽鎲撮崟顒傤槰缂備緡鍠栭惌鍌炲春閵忊剝鍎熼柕濞垮劤椤旀帡鏌ｆ惔銏⑩檨閽冮亶鏌ｅ┑鍥╁⒌婵﹦绮粭鐔兼晸閽樺鐒界憸蹇涘箲閵忋倕閱囬柕澶堝劤閿涙瑩姊洪崫鍕窛濠殿噣鏀辩粙澶婎吋閸モ晝锛濇繛杈剧秮椤庡洤顭ㄩ崟顓ф锤濠电姴锕ら悧濠囨偂濞戙垺鐓曢柟鎵虫櫅婵¤棄顭跨捄鍝勵仾闁靛洤瀚版俊鐑藉Ψ椤斿彨褏绱撴担铏瑰笡闁烩晩鍨伴悾閿嬬附閸涘﹤浜滈悗鐟板閸嬪﹤顭囬幘缈犵箚闁绘劦浜滈敓濮愬�栫粋宥咁煥閸繄鏌堥柣搴㈢♁鐪夌紒璇叉閺屾盯顢曢敐鍡欘槬濡ょ姷鍋戦崹铏规崲濞戙垹骞㈡俊銈勮兌椤╂澘鈹戦悙灞傚仮闁猴拷鏉堚晜宕叉繝闈涙閺嬫棃鏌涢…鎴濇灍闁诲繐绉归弻銈夊垂閿曪拷濞诧箓鎮￠弴銏＄厸闁告劖瀵х�氬綊姊洪幖鐐插闁轰礁顭烽妴浣割潩閼稿灚娅滄繝銏ｆ硾閿曪箓顢欓崨瀛樷拺闁兼亽鍎嶉鍩跺洦娼忛…鎴烆啍闂佹悶鍎洪崜姘舵偂濞嗘挻鐓熼柟鎹愭珪閹癸綁鏌熼悾灞解枅闁哄瞼鍠撶划娆忊枎閸撗冩倯闂備焦瀵х换鍕磻濞戙埄鏁囬柛蹇曞帶缁剁偤鎮楅敍鍗炲椤忓綊姊绘担钘夊惞闁哥姵鍔欓幃鐑藉Ψ瑜濋幏宄邦潩閻撳骸鈷嬮悗瑙勬礃缁诲牊淇婇崼鏇炵倞闁冲搫鍋婄槐锛勭磽閸屾艾锟界兘姊藉澶婂瀭鐟滅増甯炲畵浣逛繆閵堝懏鍣洪柣鎾跺枑娣囧﹪濡惰箛鏂款伓闂佽瀛╃粙鍫ュ疾濠靛绠查柕蹇曞Л閺�浠嬫煕閳撅拷閺呮稑鈻撻锔解拺闁告繂瀚烽崕娑㈡煕鐎ｎ亜顏柡浣规崌閹崇偤濡烽敂缁㈡Ч闂備浇顕栭崹浼村疮閹绢喖绠栨繝濠傚悩閻斿吋鈷愰柟閭﹀枤濞夊灝鈹戦敍鍕杭闁稿﹥鐗犻獮鎰偅閸愩劎锛涢梺缁樻煥閹测�斥枍閻樼粯鐓ラ柡鍥╁仜閿熻棄缍婇幃锟犲Ψ閿斿墽鐦堥梻鍌氱墛缁嬫挻鏅堕弴鐏诲綊鎮╅锝嗙彇缂備浇椴哥敮锟犲箖閳轰胶鏆﹂柛銉稻椤秹姊绘担鍝ユ瀮婵☆偄瀚拌棟妞ゆ牜鍋涢悡婵嬪箹濞ｎ剙濡肩紒鐘崇♁閵囧嫰骞樼捄鐩掋垻绱掗幓鎺撳仴婵﹤顭峰畷鎺戭潩椤掑﹥瀚圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃寮搁弽顓熺厸闁搞儯鍎遍悘鈺冪磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽濡舵径濠傜�┑鐘绘涧濞层劎绮绘ィ鍐╃厱闁斥晛鍙愰幋鐘辩剨妞ゆ挾鍠愭禍銈嗙節闂堟侗鍎愰柍閿嬪灩缁辨帞锟斤綆鍘界涵鍫曟煟韫囨稐鎲鹃柡灞剧〒閿熸枻缍嗛崜娆愮鏉堚晪鎷峰▓鍨灍闁绘搫绻濋悰顕�寮介妸锕�顎撻梺闈╁瘜閸樼厧顕ｉ幎鑺モ拻濞达綀娅ｇ敮娑欑箾閸欏澧电�规洘鍔欏畷鐑筋敇閵婏箑顏跺┑顔筋焽閸嬫挾锟芥熬鎷�,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍蓟閸ヮ剚鏅濋柨鐔剁矙瀹曟繈骞掗幘鍓侇啎閻庣懓澹婇崰鏇犺姳閼姐倗纾奸柣娆忔噽缁夘噣鏌″畝瀣埌閾伙綁鎮归崶銊ョ祷妞ゎ偒浜铏圭矙濞嗘儳鍓梺鍛婃⒐閸ㄧ敻锝炶箛娑欐優閻熸瑥瀚壕顖炴⒑闂堟侗鐒鹃柛搴㈢叀閹敻濮�閵堝棌鎷洪梺鑽ゅ枑濠㈡ê鈻撻埡鍛厵闁告垯鍊栫�氾拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ姀鐘差棌闁轰礁锕弻鈥愁吋鎼粹�崇缂備焦鍔栭〃鍡樼┍婵犲洤围闁告侗鍠栧▍婵嬫⒑鐠恒劌鏋戦柡瀣吹缁骞樺畷鍥ㄦ婵犻潧鍊搁幉锟犲磻閸曨偁锟芥帒顫濋悡搴ｄ画闂備浇锟ラ崐鏍ㄧ┍婵犲洦鍊锋い蹇撳閹风兘寮介锝嗘闂佸湱鍎ゅΛ鎴﹀箯瀹勯偊娼╅柣鎾抽閳峰姊虹拠鈥崇仩闁兼椿鍨甸悘鍐⒑閸涘﹣绶遍柛鐘冲哺瀹曪綁宕卞☉娆屾嫼缂傚倷鐒﹁摫闁绘挶鍎遍…鑳槻闂佸府缍侀獮鍡欎沪鐟欙絾鐎婚梺瑙勫劤椤曨參宕㈤幖浣瑰�甸柣褍鎲＄�氬綊鏌ｆ惔顖滅У闁告挻绋栭幗顐︽⒒閸屾瑦绁版い鏇熺墵瀹曞綊宕￠悙宥嗙洴瀹曟﹢顢欓崗鑲╋拷顒勬倵楠炲灝鍔氭い锔诲灣缁牏锟斤綆鍋佹禍婊堟煙閹规劖纭鹃柡瀣灦閵囧嫰寮幐搴＆濠殿喖锕ら…宄扮暦閹烘垟鏋庨柟瀛樼箓椤姊绘担绛嬪殐闁哥姵鐗犻幃銉╂偂鎼达絾娈惧┑鐘绘涧濡參宕ョ�ｎ喗鐓曟繝濠忔嫹闁绘帪濡囬敓浠嬫涧閻倸顫忓ú顏呭殟闁靛鍠氭禍顏囨闂備緡鍓欑粔鏉懶ч弻銉︾叆闁哄洨鍋涢敓钘夌秺閹繝寮撮悢铏圭槇闂傚倸鐗婄粙鎺椝夊鍕╀簻闊洤顑呴敓鑺ョ墬缁岃鲸绻濋崶褏顔岄梺鍦劋閺屻劑路閿熶粙姊绘笟锟介敓鑺ョ〒閳规帡鏌涢弬璺ㄧ劮闁诲繑甯″娲川婵犲嫮鐣甸柣搴㈠嚬閸ㄨ泛鐣峰ú顏呭�烽柣鎴灻敓鐣屾暬閹嘲鈻庤箛鎿冧痪缂備礁鑻锟犲蓟閻旂厧绀勯柕鍫濇椤忥拷?
					fire.pb.mission.SFairylandStatus sds = new fire.pb.mission.SFairylandStatus();
					sds.status = fire.pb.mission.FairylandStatus.LANDABSENT;
					if (mkdb.Transaction.current()==null) 
					    gnet.link.Onlines.getInstance().send(roleid, sds);
					else 
						mkdb.Procedure.psendWhileCommit(roleid, sds);
				
			}else {//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃缂侇噮鍨抽幑銏犫槈閵忕姷顓洪梺缁樺姇閻忔岸宕宠缁辨挻鎷呯粙娆炬殺闂佺顑冮崐婵嗩嚕鐠囨祴妲堥柕蹇曞閵婏负浜滈柡鍐ㄥ�哥敮鑸点亜椤愮喐娅囩紒杈ㄦ尰缁楃喐绻濋崘顭戜紦闂傚倷绀佹竟濠囧磻閸℃稑绐楅柟鎹愭硾婵剟鏌ㄩ悢鍓佺煓婵﹤顭峰畷鎺戭潩閸楃儐鏉哥紓鍌欑椤戝棛鏁敓鐘叉瀬鐎广儱顦猾宥夋煕椤愩倕鏋旈柛姗�绠栧娲传閸曞灚歇濠电偛顦板ú妯肩矉閹烘顫呴柕鍫濇－濮婃寧绻濋姀锝呯厫闁告梹鐗犻幃锟犲Ψ閿斿墽鐦堥梻鍌氱墛缁嬫帡藟閻愮儤鐓曢柨婵嗙墱濞兼劙鏌曢崶褍顏┑锛勫厴婵＄柉顦存い鏂款槺缁辨挻鎷呴搹鐟扮闂佺儵鏅╅崹浼存偩瀹勬嫈鏃堝川椤斿吋鐣伴梻浣哥枃濡椼劎鎷嬮弻銉ョ濞寸厧鐡ㄩ埛鎺懨归敐鍛暈闁诡垰鐗撻幃璺侯潩閻撳簼鍠婇悗瑙勬礃缁诲牓鐛�ｎ亖鏀介柟閭﹀墯椤撳潡姊绘担鍛婅础闁惧繐閰ｅ畷鎶筋敋閿熻棄顕ｉ锕�纾奸柣鎰嚟閸樺崬鈹戦悙鏉戠仴鐎规洦鍓欓锝夊箚椤�崇秺瀹曟宕楅悡搴ｎ暡闂備礁鐤囬～澶愬垂閸ф鏋佺�广儱顦粈瀣亜閹般劌澧叉繝顫嫹闂傚倸鍊烽懗鍫曗�﹂崼锝呮闂備礁鎲℃笟妤呭储閸撗呴┏闊洦姊荤弧锟介梺姹囧灲濞佳勭墡闂備浇鍋愰幊鎾存櫠閻ｅ苯鍨濋柛顐ゅ枎缁剁偟锟界櫢鎷烽悗锝庡亜椤忚泛螖閻橀潧浠滈柣蹇旂箞瀹曟繂顫濋鐘殿啎闁诲繒鍋涢崐鍛婃叏閸岀偞鐓欐い鏍ㄧ濠�鎵拷鍨緲鐎氫即鐛崶顒夋晣闁绘ɑ褰冪粻銉╂⒒閸屾瑨鍏岀紒顕呭灦瀹曞綊骞嗛悧鍫熷櫡闂傚倷鐒︽繛濠囧绩闁秴绀夋繛鍡樻尭缁犳牗淇婇妶蹇斿濡炪値鍋呯换鍫ャ�佸锟介幃娆撳矗婢跺娈橀梻鍌氬�风粈渚�骞栭锔藉剶濠靛倻顭堢粣妤呮煙閹规劕鐓愭い顐ｆ礋閺岀喖鎮滃Ο鐑橆啎闂佺粯鏌ㄩ幉鈩冩叏濠婂牊鐓涘璺猴功娴犮垽鏌ｈ箛搴ｎ槮闁宠鍨块幃鈺呭垂椤愶絾鐦庨梻浣侯焾椤戝洭宕伴弽銊ょ箚閻庣敻娼婚幏鐑芥晲鎼粹剝鐏堢紓浣哄閸ㄥ爼寮婚妸鈺傚亞闁稿本绋戦锟�
				fire.pb.mission.SFairylandStatus sds = new fire.pb.mission.SFairylandStatus();
				sds.status = fire.pb.mission.FairylandStatus.LANDOUT;
				if (mkdb.Transaction.current()==null) 
				    gnet.link.Onlines.getInstance().send(roleid, sds);
				else 
					mkdb.Procedure.psendWhileCommit(roleid, sds);
			}
		}
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 724913;

	public int getType() {
		return 724913;
	}

	public long sceneid; // 场景模块创建的场景ID
	public long ownerid; // 副本的所有者ID(可能是角色ID,也可能是团体ID)
	public int scenetype; // 副本场景的类型，如果为0，表示为静态场景
	public java.util.LinkedList<Long> roleids; // 副本销毁时被强行踢出副本的roleid

	public MDestroyDynamicScene() {
		roleids = new java.util.LinkedList<Long>();
	}

	public MDestroyDynamicScene(long _sceneid_, long _ownerid_, int _scenetype_, java.util.LinkedList<Long> _roleids_) {
		this.sceneid = _sceneid_;
		this.ownerid = _ownerid_;
		this.scenetype = _scenetype_;
		this.roleids = _roleids_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(sceneid);
		_os_.marshal(ownerid);
		_os_.marshal(scenetype);
		_os_.compact_uint32(roleids.size());
		for (Long _v_ : roleids) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		sceneid = _os_.unmarshal_long();
		ownerid = _os_.unmarshal_long();
		scenetype = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			long _v_;
			_v_ = _os_.unmarshal_long();
			roleids.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof MDestroyDynamicScene) {
			MDestroyDynamicScene _o_ = (MDestroyDynamicScene)_o1_;
			if (sceneid != _o_.sceneid) return false;
			if (ownerid != _o_.ownerid) return false;
			if (scenetype != _o_.scenetype) return false;
			if (!roleids.equals(_o_.roleids)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)sceneid;
		_h_ += (int)ownerid;
		_h_ += scenetype;
		_h_ += roleids.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(sceneid).append(",");
		_sb_.append(ownerid).append(",");
		_sb_.append(scenetype).append(",");
		_sb_.append(roleids).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

