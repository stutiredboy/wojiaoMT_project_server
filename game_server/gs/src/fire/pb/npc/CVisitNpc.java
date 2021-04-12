
package fire.pb.npc;

import java.util.Collections;

import fire.pb.PropRole;
import fire.pb.main.ConfigManager;
import fire.pb.map.Npc;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.map.SceneNpcManager;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CVisitNpc__ extends mkio.Protocol { }

/** 客户端请求访问 NPC
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CVisitNpc extends __CVisitNpc__ {
	private boolean checkGatherTask( long roleid, final SGatherConfig conf ) {
		if ( conf.tasks == null || conf.tasks.isEmpty() ) {
			Module.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵潙顫濋懜娈匡拷鏍ㄧ箾鐎涙鐭婄紓宥咃躬瀵鈽夐姀鐘电杸闂佹眹鍨藉褏鏁幒鎴旀斀闁绘劕寮堕埢鏇灻瑰鍐煟鐎殿噮鍋婂畷鍫曨敆娴ｅ搫骞楅梻浣侯攰閸╁洭宕濆鍛瀺闁糕剝绋掗悡鐔肩叓閸ャ劍灏柡鍡稻閹便劍绻濋崘鈹夸虎濡ょ姷鍋為崝鏍箚閺冨牆顫呴柕蹇婃櫆琚ｉ梻鍌氬�烽懗鍫曗�﹂崼銉︽櫇闁靛牆娲ㄧ粈濠傗攽閻樻彃锟藉寮抽敃鍌涚厵閻庣數顭堥鎾绘煙妞嬪骸鍘撮柡浣瑰姈閹棃鍩勯崘顏冩喚闂傚倷鑳剁划顖炲箰閹间礁鐤柟缁㈠枛閽冪喐绻涢幋鐐冩岸寮ㄦ禒瀣厱闁斥晛鍠氬▓銏犆归悩灞傚仮婵﹥妞藉畷顐﹀礋椤掑锟ラ梻浣侯焾椤戝啴宕愬┑鍡╁殨濠电姵纰嶉弲鎻掝熆鐠轰警鍎愭繛鍛矒濮婃椽骞栭悙鎻掑闂佸憡鏌ㄩ柊锝夈�佸▎鎾冲珘缂佸崬鍩峴闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰绠婚柡浣规崌閹崇偤濡疯閺嬫棃姊洪崫鍕櫤缂佽瀚板畷姘跺箳閹存梹鐎婚梺瑙勫劤绾绢參顢欐繝鍌楁斀闁挎稑瀚禒褔鏌曢崱妤婂剶妤犵偛绻橀幃婊堟寠婢跺矈妲版俊鐐�栧濠氬储瑜旈幊鎾诲垂椤旇鏂�闂佺粯鍔栧娆撴倶閸楃儐娓婚悗娑櫳戦崐鎰拷娈垮枟閻擄繝宕洪敓鐘插窛妞ゆ梹鍎抽獮妤呮⒒婵犲骸浜滄繛璇х畱鐓ら柡宥冨妿椤╅攱绻濇繝鍌氭灓闁绘柨妫涢幉绋跨暆閿熶粙宕氶幒鎴旀瀻闁规崘娅曞Σ顒勬⒑闂堟稓绠為柛濠冩礈閻氭儳顓兼径瀣幈濡炪倖鍔戦崐鏇㈠几閺冨牊鐓曟繛鍡楃箰椤忣厽淇婇銏″殗妞ゃ垺娲熸慨锟介柍銉﹀墯濡查亶姊绘担鍛婅础妞ゎ厼鐗撻獮妤�顭ㄩ崼婵囩�銈嗘穿閹峰嘲鈹戦埄鍐╁�愰柛鈺嬬節瀹曟帒顭ㄩ崘銊ь唶濠电姷鏁搁崑鐐哄箰婵犳碍鍤屽Δ锝呭暞閺呮繈鏌曟竟顖氱У鐎氳鎱ㄥΟ鐓庝壕閻庢熬鎷�");
			return true;
		}
		if ( fire.pb.mission.Module.getInstance().checkGather(roleid, conf) ) {
			return true;
		}
		return false;
	}
	private void gatherProcess( long roleid, int gatherid ) {
		// 
		SGatherConfig conf = ConfigManager.getInstance().getConf(fire.pb.npc.SGatherConfig.class).get(gatherid );
		if ( conf == null ) {
			Module.logger.error( "婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸缂備礁顑嗙敮锟犲极瀹ュ绫嶉柛顐ゅ枔閸橀箖姊洪崫鍕垫Ъ婵炲娲樼粋鎺楀閵堝棭姊挎繝銏ｅ煐閸旀牠鎮￠妷锔剧瘈闂傚牊绋掗ˉ鐐烘煙閸忕厧濮嶉柡灞剧洴瀵剙鈻庨幆褍澹庨梻浣筋嚃閸犳銆冮崨杈剧稏婵犻潧顑愰弫鍥煟閹邦剙绾ч柟铏懇濮婄粯鎷呴崨濠冨創闂佸搫鐗滈崜娆戝弲濠碘槅鍨拃锕傚吹濡ゅ懏鐓曢柡鍥ュ妼閻忕姵顨ラ悙顏勭仾濞ｅ洤锕、娑樷攽閸℃鍎柣鐔哥矋濠㈡﹢骞婅箛鏇熷床婵犻潧顑嗛崑銊╂⒒閸喓鈼ョ紒顔肩埣濮婃椽鎮烽弶鎸庢瘣缂備胶绮崝娆撳箖閹�鏀介柛顐犲灮閻撴挸鈹戦悙鍙夘棤闁稿鎸剧槐鐐存償閵忋垻鐦堥梺姹囧灲濞佳勭墡闂備胶鍘х紞濠勭不閺嶎厽鍋樻い鏇嫹濠殿噯鎷烽梺鐐藉劥鐏忔瑧绮诲鑸碘拺闂傚牊绋撴晶鏇㈡倵濮樼厧鏋ら柟宄扮秺閹囧醇濠婂懐鐣炬俊鐐�栭崝妤佹叏閹绢喗鏅搁柤鎭掑劤婢ч亶鏌熼獮鍨仼闁宠鍨归敓鏂ょ秵娴滅偤宕㈤柆宥嗏拺閻犳亽鍔岄弸宥囩磼椤旂晫鎳冮柣锝呭槻椤粓鏁撴禒瀣槬闁斥晛鍟刊鎾⒑閸噮鍎愰柍缁樻礋濮婂宕掑顒婃嫹瀹勬噴褰掑炊椤掑鏅梺鍝勭▉閸樺ジ宕归崒姣綊宕楅崗鑲╃▏闂佹眹鍊ら崳锝夊蓟閳╁啫绶為悗锝庝簽娴犲ジ姊洪崫鍕紨缂佺姵鎹囧濠氭晲婢跺﹦鐫勯梺绋挎湰椤ㄥ棛锟芥碍鐩鐑樻姜閹殿噮妲紓浣割槺閺佸鐛崼銉ノ╅柕澶樺枟瀵ゆ椽姊虹化鏇炲⒉妞ゃ劌鎳橀崺娑欏緞瀹�锟界壕钘壝归敐澶樻妞わ讣闄勯妵鍕即閵娿儱绠诲┑鈥冲级閸旀瑩鐛Ο鍏煎珰闁肩⒈鍓ㄧ槐鍙夌節濞堝灝鏋熼柨鏇楁櫊瀹曟鈽夐姀鐘电崶婵犵數濮村ú锕傚煕閹达附鐓熼柣鏂挎啞缁跺弶绻涢崼姘珚闁哄瞼鍠栧畷娆撳Χ閸℃浼�?" + gatherid );
			return;
		}

		if ( !checkGatherTask( roleid, conf ) )
			return;

		fire.msp.npc.GCheckGathering send = new fire.msp.npc.GCheckGathering();
		send.gatherkey = npckey;
		send.roleid = roleid;
		fire.pb.GsClient.sendToScene( send );
	}
	
	public static void getScenarioQuests( 
			final long roleid,
			final int npcid, 
			SVisitNpc svisitNpc ) {
		try {
			svisitNpc.scenarioquests.clear();
			svisitNpc.scenarioquests = new fire.pb.mission.MissionColumn(roleid, true).getMissionsByNpcid(npcid, svisitNpc);
			Collections.sort(svisitNpc.scenarioquests);

		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
	
	private void onVisitNpc( final long roleid, final SNpcShare share ) {
		//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垹绠婚悗闈涙啞閸Ｑ冾渻閵堝棙绌跨紒韫矙閹箖鏁撻悩宕囧姺闂佹寧妫佸Λ鍕儊濠婂牊鈷掑〒姘炬嫹婵炰匠鍥ㄥ亱闁糕剝銇傚☉妯锋婵炲棙鍔栭悵宄邦渻閵堝棗绗掗悗姘煎弮閹繝鎮╅崹顐㈡瀾闂佺粯顨呴悧鍡欑箔瑜旈弻锝夋晲閸℃ǜ浠㈤梺鍦焾閿曨亪骞冮姀銈嗗仏閻庢稒锚椤忓爼姊虹拫搴″暞閸熺偤鎮楀顒傜Ш婵﹥妞藉畷銊︾節閸愵煈妲遍梻浣告啞閹稿鎯勯姘辨殾闁靛繈鍊曠粻鐟懊归敐鍛辅闁归攱妞藉娲川婵犲啫闉嶉悷婊勬緲閸燁垳绮嬪鍡欘浄閻庯綆鍋嗛崢閬嶆煟鎼搭垳绉靛ù婊勭矒椤㈡棃顢旈崼鐔哄幐闂佸憡绋掑姗�鎮￠幇鐗堝�靛ù锝呭暙娴滃綊鏌ㄩ悢璇残撶紒瀣浮閺佸绻涚�电孝闁圭⒈鍋婇垾鏃堝礃椤斿槈褔鏌涢埄鍐噧妞ゎ値鍛＜闁绘劦鍓氱欢鑼磼婢跺﹦绉洪柣娑卞櫍瀹曞崬鈽夊锟介崬鍫曟⒑闂堟侗妾у┑鈥虫喘瀹曘垽骞橀崜浣猴紳闂佺鏈悷褔宕濆澶嬪珔閺夊牄鍔婃禍婊堟煏婢跺牆鍔ゅ褋鍨介弻銊╂偄鐠囨畫鎾淬亜閺冿拷閻楃姴鐣烽弶璇炬棃宕ㄩ鐙�鍞堕梻浣筋潐閸庣厧螞閸曨厾涓嶉柡宥冨妿缁犻箖鏌涢埄鍏╂垹浜搁銏＄厽妞ゆ挾鍣ュ▓鏃�銇勯鈩冪《闁圭懓瀚粭鐔碱敍濮橆剙顥庡┑锛勫亼閸婃牕顫忛悷鎷旀盯宕橀…鎴炵稁婵犵數濮甸懝鍓у閸忚偐绠鹃柛鈩兠悘銉モ攽閳ヨ尙鐭欐慨濠傛惈鐓ら悹浣哥－閻╁海绱撻崒姘毙㈤柨鏇樺�濋幃鎯х暋閹佃櫕鏂�闂佺硶鍓濋悷锕�鈻撻弴銏♀拺闁告稑锕ユ径鍕煕鐎ｎ亝鍣归崡杈ㄣ亜閹烘垵顏柍閿嬪灴閺屾稑鈹戦崱妤婁紝濠碘剝褰冪紞濠囧蓟閿濆應妲堟繛鍡楃箳娴煎苯鈹戦纭峰伐妞ゎ厼鍢查悾鐑藉箳閹存梹鐎婚梺鐟扮摠缁诲倿鈥栨径鎰拺閻犲洤寮堕幑锝夋煟閻旂鈻曠�规洏鍔戦、娑橆煥閸涱厼绠氶梻鍌氬�烽懗鍫曘�佹繝鍥х妞ゅ繐妫涙稉宥夋煙鐎电顎撻柟宄板槻椤繈顢楁径瀣撗囨⒑闂堟稒鎼愰悗姘嵆閻涱噣骞掑Δ锟界粻锝嗙節閸偄濮冮柟顕嗙秮濮婄粯鎷呴崨濠冨創闁诲孩鍝庨崝鎴濈暦閺囥垺鍋ㄧ紒瀣劵閹芥洖鈹戦悙鏉戠仸閼裤倖淇婇幓鎺斿ⅵ闁哄本绋戣灃闁告劑鍔嬮幋閿嬬箾鐎电顎岄柛娆忓暣瀵鏁愰崼銏㈡澑闂佽宕樺畷闈涚暦椤忓牊鈷戦柣鐔告緲濞堚晠鏌熼崙銈嗗?
		if (share.npctype == 16) {
			fire.pb.instancezone.Module.visitNpc(roleid, npckey, share);
			return;
		}
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珖闂佽法鍠嶇划娆撳箖閸ф鏁嬮柨鐔剁矙瀵寮撮悢铏诡啎闂佺粯鍔﹂崜姘舵偟閺冨倻纾奸柣鎰靛墮閸斻倖绻涚亸鏍垫嫹閹颁焦缍庡┑鐐叉▕娴滃爼寮崱娑欑叆闁绘梻鍎ゅ▍鏇犵磼椤旇姤顥堥柟顔炬櫕缁瑧鎹勯…鎺斿耿婵犵數濮伴崹濂稿春閺嶎厼绀夐柡宥庡幗閸嬪倿鏌￠崶鈺佹瀭濞存粍绮撻弻鐔煎级閸噮鏆㈢紓浣割儓瀹曠數妲愰幒妤佹櫢濞寸姴顑嗛弲鎼佹煟閿濆懐鐏辩痪鎹愭閵嗘帒顫濋濠冩暰闁诲孩鑹剧紞濠傤潖濞差亜绀堥柟缁樺笂缁ㄤ粙姊洪崫銉バ㈡俊顐ｇ懅缁顓奸崪浣哄弳闂佸壊鍋嗛崰鎾诲储閹间焦鍊垫鐐茬仢閸旀岸鏌涢悤浣镐簼濞ｅ洤锕畷绋课旀担鍝勫笚闂備礁鎲￠悷锝夊磿瀹曞洨鐜婚柡鍐ㄧ墛閻撴稓锟界櫢鎷烽柨鐔剁矙瀹曚即寮介鐐电暫濠电姴锕ら悧鍡欑不閿濆鐓欓柣鎴炆戠亸顓㈡煛鐎ｃ劌锟芥繂顫忕紒妯诲闁告稑锕ラ崕鎾绘⒑濞茶骞栨い锕�宕銉︾節閸愵亶娴勯柣搴秵娴滅偤宕㈤幘顔解拺闁告稑锕ゆ慨锕傛煕閻樻剚娈滅�规洘鍔欓弻銊э拷锝冨妺缁ㄥ姊洪悷鐗堟儓缂佸鍏樺畷妤�鐣濋敓浠嬪箟閹间礁绾ч柟绋垮瘨濡倗绱撴担浠嬪摵闁圭顭烽獮蹇涘川椤斿搫浜伴梺鍦焾鐎垫帡鏁撻懞銉疁婵﹥妞藉畷銊︾箾閹烘繀閭┑鈥崇埣楠炴牗鎷呴崫銉ф毇闂備線娼чˇ顐﹀疾濠婂牆纾婚柛宀�鍋涚粻褰掑级閸繂鈷旂紒瀣帛缁绘盯宕奸悢宄板Б闂佸疇顫夐崹鍧椼�佸▎鎴犻┏閻庯綆鍋掗崥鍛存⒒娴ｅ憡璐￠柛蹇旓耿钘熼柟鍓х帛閺呮悂鏌涙繝鍕珡婵炲吋鍔栫换娑㈠箵閹烘梻顔掗悗瑙勬礃缁诲牓鐛�ｎ喗鏅滈柣姘摠鐎氱懓霉閿濆洨銆婃俊鎻掔墛娣囧﹪顢涢悙瀛樻殸濡炪値鍋勭粔鎾煘閹达富鏁婇柡鍌樺�撶欢鐢告⒑閸涘♁鑲╁垝濞嗘挶锟戒礁鈻庤箛锝呮婵犻潧顦遍悵锟�
		if (share.npctype == 17) {
			fire.pb.mission.instance.InstanceManager.visitNpc(roleid, npckey, share);
			return;
		}
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撻悗闈涙憸娑撳秹鏌ｅΟ鑲╁笡闁绘挻鐟╅弻鐔碱敍閸℃鏆炴い鏃�鍨垮娲箹閻愭彃濮堕梺鍛婃尰瀹�绋跨暦閹达箑惟闁冲搫鍊婚崢閬嶆⒑鐟欏嫬鍔ら柛鐔绘硶閻ヮ亣顦归柡宀嬬節瀹曘劑顢涘顐ゆ崟闂備礁鐤囬～澶愬垂閸洜宓佸┑鐘叉处閻撴洖鈹戦悩鎻掓殲鐎规洖鐭傞弻鐔兼惞椤愵偅鐤侀悗瑙勬礀閵堢顕ｉ弶鎴建闁割偆鍠庨鍫曟⒑閸涘﹦鈽夐柣掳鍔戝畷鎰節濮橆厾鍘鹃梺璇″幗鐢帡宕濆顑炲綊鎮敓浠嬪垂鐠轰警娼栨繛宸簻缁犲綊鏌ｉ幇顓炵祷濠殿喖鐭傚娲川婵犲啰鍙嗛梺娲诲墰閸樠囶敋閵夛妇绡�闁告洦鍘鹃敍婊冣攽閳藉棗鐏﹂柡鍛板皺閼鸿京鎷犲顔藉瘜闂侀潧鐗嗗Λ妤佹叏婢跺ň鏀芥い鏃囧Г鐏忥箓鏌℃担瑙勫磳闁瑰磭鍋ゆ俊鐤槾闁汇倕瀚伴幃妤�鈻撻崹顔界亪濡炪値鍘鹃崗妯侯嚕椤愶箑绠涢柡澶婄仢缁愭稑顪冮妶鍛闁瑰啿绻樺铏節閸ャ劉鎷绘繛杈剧秬濞咃絿鏁☉銏＄厱闁哄啯鎸鹃悾鐢碉拷瑙勬礃缁矂锝炲┑瀣殝闂傚牊绋愰幋鐑芥⒒娴ｅ憡鎯堟繛灞傚妽閹便劍顦版惔鈽嗘闂佸吋绁撮弲婵堝閽樺褰掓晲婢跺閿梺璇茬箚閺呮粓銆冮妷鈺傚�烽悗鐢殿焾閳峰矂姊洪崫鍕効缂傚秳绀侀锝嗙鐎ｅ灚鏅濋梺闈涚箳婵磭鍒掗鐐粹拻濞达綁顥撴稉鑼磼闊厾鐭欑�规洘鐓″濠氬Ψ椤栨粎鈼ゆ繝鐢靛Т閿曘倝鎮ф繝鍥х柧闁归棿鐒﹂悡銏′繆椤栨瑨顒熸俊鍙夋そ閺岋繝宕遍鐘垫殼闂佸搫鏈ú妯兼崲濞戙垺鍊锋い鎺嶈兌瑜扮喖姊绘担鑺ャ�冪紒锟芥担铏圭煋闁汇垹鐏氬畷鍙夌箾閹存瑥鐏╃紒鐙呯秮閺岋綁骞囬褍鏅遍梺鍝勬閿熻姤鏋奸弨浠嬫煟閹邦垰鐨哄褋鍨介弻锝呪攽閸喓顔塩
		if (share.npctype == 28) {
			if (mkdb.Transaction.current() != null) {
				new fire.pb.circletask.catchit.PSendCatchItNpcService(share.getId(), npckey, roleid).call();
			}
			else {
				new fire.pb.circletask.catchit.PSendCatchItNpcService(share.getId(), npckey, roleid).submit();
			}
			return;
		}
		
		//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鍝勫閸庨亶鍩為幋锔藉亹闁告瑥顦伴幃娆戠磽娴ｅ搫顎岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘垵妫涢崝顖氣攽閻愭潙鐏︽い顓炴喘瀵娊宕卞☉娆戝幈闂佸搫娲㈤崝灞剧閻愭番浜滈柨鏃囶嚙瀵喗鎱ㄦ繝鍛仩闁圭懓瀚版俊鎼佸Ψ閿旀儳缍掗梻鍌欒兌閹虫捇宕甸弽顓炵闁跨噦鎷�?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鏋涢柛銊︾箘閿熺晫娅㈤幏鐑芥煥閻旂儤娅曢柛鎺撳浮瀵噣宕奸悢铚傜紦闂備焦鐪归崹钘夘焽瑜嶉悾鐑藉Ψ閳哄倵鎷虹紓鍌欑劍钃遍柍閿嬪浮閺屾稑螣閻樺弶澶勯柛濠傚槻閳规垿鎮╅幓鎺撴婵炲瓨绮嶇划鎾诲蓟閻斿吋鎯為柣鐔碱暒濞岊亪鏌ｆ惔銏ｅ缂傚秴锕濠氭晲閸℃ê鍔呴梺闈涢獜缁蹭粙藟濠靛棭娓婚柕鍫濈箳缁变即鏌涘Δ鍕彧濞ｅ洤锕幃鐣岀矙鐠侯煈妲规俊鐐�栭悧妤�顫濋妸鈺婃晩濠电姴娲﹂埛鎴︽煟閻旂顥嬮柟鐣屽Х缁辨帞绱掑Ο鍝勵潚濡ょ姷鍋涚换姗�骞冨鍫熷癄濠㈣泛顦遍悙濠囨⒒娓氾拷濞佳嚶ㄩ敓鐣岀磼閻樺啿鐏存い銏℃楠炴牗鎷呴崗澶嬪缂傚倸鍊烽悞锕佹懌闂佺粯鎸堕崕鐢稿蓟閻斿吋鍤嶉柕澹懐鍘掔紓鍌欑贰閸犳牠鈥﹂悜鐣屽祦闁糕剝鍑瑰銊╂⒑缂佹ɑ鐓ユ俊顐ｇ箞楠炲啰鎲撮崟顒�顫￠梺鐟板槻閻牓宕濋崨瀛樷拺缂佸鐏濋銏ゆ煕閺冿拷椤ㄥ牆危閹版澘绠虫俊銈勭劍濞呫垺绻涚�电孝妞ゆ垵妫濆鑼矙濡潧缍婇幃鈺侇啅椤旂厧澹夐梻浣瑰▕閺�閬嶅垂閸ф钃熸繛鎴炃氶弨浠嬫煕閺囥劌浜滃┑顔煎缁绘稓锟界數顭堥鎾剁磼閻樿櫕宕岀�殿喖顭烽幃銏ゆ偂鎼达紕鐛╁┑鐘垫暩婵挳宕愰悽绋垮嚑婵炲棗绮鹃弮鍫熷亹闂傚牊绋愮划璺衡攽閳藉棗浜濈紒璇插�块幃鎯х暋闁附寤洪梺璺ㄥ枍缁瑩濡存担绯曟瀻闁圭偓娼欏▓鎰版⒑閸愬弶鎯堥柨鏇樺劚閻☆厾绱撻崒姘拷鎼佸磹閹间礁纾圭�瑰嫰鍋婂〒濠氭煙閻戞ɑ鈷掗柣顓炴閵嗘帒顫濋悙顒�顏跺┑鐘殿暯閿熻棄纾崺锝夋煛娴ｈ宕岄柡浣规崌閺佹捇鏁撻敓锟�
		if (fire.pb.mission.instance.line.LineInstManager.getInstance().checkLineNpc(share.getId())) {
			fire.pb.mission.instance.line.LineInstManager.visitNpc(roleid, npckey, share);
			return;
		}
		// added by cn
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠為柟钘夊�婚敓鏂ょ秵閸犳牠鎮欐繝鍐︿簻闁硅櫣鍋炵�氬湱绱掔紒銏犲伎闁归鍏樺缁樻媴閾忕懓绗￠梺鍛婃煥缁绘ê顕ｉ幓鎺濈叆闁割偆鍠庨敓鍊熸硾閵嗘帒顫濋悙顒�顏舵繝娈垮枛閿曘儱顪冩禒瀣畺闁绘垼濮ら悞浠嬫煥閺囶亝瀚瑰┑鐐茬墕閻栫厧顫忛搹鍦煓婵炲棙鍎抽崜鎶芥⒑閸濄儱校闁绘濮垫穱濠囧箻椤旂厧绐涢柣搴㈢♁閿氶柨鐔绘椤兘寮婚妶澶婄畳闁圭儤鍨垫慨搴㈢箾鐎电顎岄柛銊ㄦ硾椤繐煤椤忓嫮顔愰梺缁樺姈瑜板啯鎱ㄥ畝鍕拺闁告稑锕ラ悡銉╂煟椤掑倸甯舵い鏇樺劜缁绘繈宕熼鐙呯床婵犵妲呴崹鍫曞疾閼碱剝濮抽悹鍥ф▕濞撳鏌曢崼婵囶棞濠殿喖顦埞鎴︻敊閼恒儱鍞夐梺杞扮劍閹瑰洭骞婇悙鍝勎ㄩ柨鏃傝檸濡插綊姊绘担铏广�婇柡鍌氬�垮畷鏇㈠箵閹烘繂娈梺鍛婃处閸ㄦ壆绮诲☉娆嶄簻闁规崘娉涢弸鎴炪亜韫囨洖鏋涙慨濠勭帛閹峰懘鎳為妷褋锟藉﹪姊洪棃鈺冪Ф缂佺姵鎹囬悰顔跨疀濞戞瑦娅㈤梺璺ㄥ櫐閹凤拷?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�闁靛ě渚婃嫹閹烘鐓熸繝闈涙閸╋綁鏌″畝瀣瘈鐎规洖鐖兼俊鐑藉Ψ瑜岄幃锝夋⒒娴ｅ湱婀介柛濠冾殜瀹曟垿骞橀懜闈涘簥濠电偞鍨崹鍦不閿濆棛绠鹃柛鈩冾殘缁犳娊鏌涢弮锟介幐鍐差潖閻戞ɑ濮滈柟娈垮櫘濡差噣姊洪幐搴㈢┛缂佺姵鎹囧顐﹀箻缂佹ê鐧勬繝銏ｆ硾閻ジ寮冲☉銏♀拺缂佸娼￠崣鍕瑰鍕姸婵☆偆鍠庨—鍐Χ閸℃瑥鈷堥梺绋款儑閸嬨倕鐣烽弴鐐嶆梹鎷呮搴ｇ暰闂備線娼ч悧鍡欙拷姘緲椤﹤鐣￠幊濠勬嚀椤劑宕熼鐘靛帨闂備礁鎼径鍥晸閼恒儱澧柛姘儔閺屾盯骞囬埡浣割瀳濡炪値鍓欓鍥╂閹惧瓨濯撮柛婵嗗珔閿濆鐓欓柣鐔哄閸犳锟芥鍠涢褔鍩ユ径濞㈢喎顭ㄩ崨顓熺亖缂備浇椴哥敮鎺曠亽闂佸憡绻傜�氼參寮鍫熲拻闁稿本鐟чˇ锕傛煙绾板崬浜濈�垫澘瀚板畷鍫曨敆娴ｈ顏熼梻浣稿悑娴滀粙宕曟潏銊︽珷妞ゆ牜鍋為悡鏇熸叏濮楀棗澧婚柛搴㈡閺岋紕浠﹂崜褎鍒涘銈冨灪濞茬喖銆侀弴顫稏妞ゆ挾濮撮崵顒傜磽閸屾艾锟芥悂宕愰崫銉х煋闁圭虎鍠楅崑瀣煕閳╁啰鈽夐柣鎾达耿閺岀喐娼忔ィ鍐╊�嶉梺绋款儐閸ㄥ潡寮诲☉妯锋闁告鍋為悘鍫濐渻閵堝懐绠伴柣鏍帶椤繒绱掑Ο璇差�撻梺鍛婄☉閿曘儵宕曢幘鎰佹富闁靛牆绻愰惁婊堟煕閵婏箑鈻曢柟宕囧仱閺屽棗顓奸崱娆忓Ц闁诲骸绠嶉崕閬嶅箠閹捐绠洪柡鍥ュ灪閳锋垿鏌熺粙鍨劉缂侊拷閿熶粙姊虹粙鍖″伐缂傚秴锕獮鍐晸閻樿尙顦ㄥ銈嗘⒒閺咁偊宕㈤幘缁樼厸濠㈣泛鑻禒锕�顭块悷鐗堫棦閽樻繈鏌ㄩ弴鐐诧拷褰掓偂濞戙垺鐓曢柍鈺佸暟閹冲啫霉閻樻瑥鎳愮壕濂稿级閸稑濡兼繛鎼櫍閺岀喖顢欑憴鍕彋閻庤娲橀敃銏犵暦閿濆棗绶為幖杈剧稻椤庡洭姊婚崒姘拷宄懊归崶顒夋晪闁哄稁鍘肩粣妤佺箾閹搭厽绶涚紓宥嗙墪椤潡鎳滈棃娑橆潓缂備胶濯崹鍫曞蓟濞戞ǚ妲堟繛鍡樺姉缁嬪洭鎮楅悷鐗堝暈缂佽鍊块崺鐐哄箣閿旇棄浜归梺鍦帛鐢亪骞忓畡鎵殝闁瑰灚甯掗柊锝夈�佸▎鎾村仼鐎癸拷閿熶粙鎯侀崼銏㈢＜闁告挆鍐炬毉闁藉啳椴搁妵鍕敃椤喛鍚梺鍝勬湰缁嬫捇鏁撻弬銈囩У濞存粍绻堣棢闁靛繈鍊栭悡銉︾節闂堟稓澧曞ù鐘轰含閿熻姤顔栭崰妤佺珶閸℃瑧纾介柟鍓х帛閸婄兘鏌ｉ幋鐐冩岸骞忔繝姘拺缂佸瀵у﹢浼存煟閻旀繂娲ょ粈澶岋拷骞垮劚椤︿即鎮￠悢鎼炰簻闊洦鎸搁顐ょ磼婢跺孩顏犻柨鐔凤拷鐕佹綈婵炲弶顭囬幑銏ゅ磼閻愭潙浠煎┑鐘绘涧椤戝棝寮茬粙妫靛綊鎮╁顔煎壉闂佸搫鎳忛幃鍌炲蓟閵堝绠掗柟鐑樺灥婵酣姊洪幖鐐诧拷銈夊礈閻旂厧钃熸繛鎴欏灩鎯熼梺闈涳紡瀹ュ洨顦梻鍌欑閹诧紕鏁Δ鍐╂殰婵°倕鍟畷鍙夌節闂堟侗鍎忛柣鎰躬閺屻倗绮欑捄銊ょ驳濠电偛鎳庡ú顓烆潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙瀵搞偞闁哄懐濞�閻涱喛绠涘☉娆忥拷濠氭煠閹帒鍔ら柛姗�浜跺铏规喆閸曨偒锟芥粓鏌涢埡鍌滃⒈闁跨喕濮ら悢顒勫箯閿燂拷?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂佺偓鍎冲锟犲蓟閿濆顫呴柕蹇婃櫇閸旀悂姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繛鎴欏灩缁狅絾绻涢崱妤冪濞寸娀绠栧铏圭矙濞嗘儳鍓梺绋匡攻缁诲牆顕ｆ繝姘嵆闁绘棁娅ｉ鏇㈡偡濠婂啰肖闁跨喕濮ら崙褰掑储婵傜鐓濋柟鐐綑椤曢亶鎮楀☉娆樼劷闁告ü绮欓弻鐔煎礂閼测晜娈梺鎼炲妼椤兘宕洪敂鐣岀懝闁跨喍绮欓獮蹇涘箣閿曪拷绾拷闂佽绻楀畷鐢稿箠閹捐鐓橀柛鎰靛枛閸ㄥ倹銇勯弴鐐搭棡閻庢俺顫夌换婵嬫濞戝崬鍓伴梺钘夊暟閸犳牠寮婚妸鈺傚亜闁告繂瀚呴姀銏㈡／闁诡垎鍐╁�紓浣虹帛閻╊垶鐛�ｎ喗鍊婚柛銉鏉╂棃姊绘担瑙勫仩闁稿﹥娲熼、鏍炊閳哄偆娼熼梺瑙勫劤椤曨參鎮烽悷鎵虫斀闁绘ɑ褰冮弳娆愩亜韫囨挾鍩ｆ慨濠勭帛閹峰懘鎳為妷褋锟藉﹪姊洪崫銉バ㈢紒澶婄埣瀹曟岸骞掗幋鏃�鐎婚棅顐㈡祫缁插墽绱炴惔鈾�鏀介柣鎰级閳绘洖霉濠婂嫮鐭掓鐐村灴閹虫粓鎮欓柅娑氱泿闂備浇顫夊畷妯衡枖濞戞鎽ョ紓鍌氬�烽悞锕傘�冮幇顔藉床婵犻潧妫鏍ㄧ箾瀹割喕绨荤�瑰憡绻傞埞鎴︽偐閹绘帗娈滈梺褰掝棑閹虫捇鈥旈崘顔嘉ч柛鎰╁妼椤牓姊洪幐搴㈢８闁稿氦灏欑划姘綇閵娧呯槇闂佹悶鍎洪悡鍫澪涢崘銊㈡斀闁绘劖娼欓悘鍗烆渻鐎涙ɑ鍊愮�规洘鎹囧Λ鍐ㄢ槈鏉堛劌鐦滈梻渚�娼ч悧鍡椢涘▎鎴滅剨闂傚牊绋堥弨鑺ャ亜閺囩偞鍣圭�殿噮鍠氶敓鑺ヮ問閸犳捇宕濋幋锔惧祦閹兼番鍔嶉崵宥夋煏婢跺牆鐏悗姘偢濮婄粯鎷呴崨濠冨創闂佺锕ら悥鐓庣暦閺囥垹绠甸柟鍝勬閻庢椽姊洪崨濠勨槈闁宦板姂閹繝寮撮姀锛勫幗闂佸搫鍊搁悘婵堢棯瑜庣换娑㈠川椤撶喎顦╂繛锝呮搐閿曨亜鐣烽敐鍡楃窞濠电姴鍋嗗姘舵⒒娴ｈ姤銆冮柣鎺炵畵楠炴垿宕堕锟介弸渚�鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喖顭烽弫鎰緞鐎ｎ亙绨婚梺鑽ゅТ濞测晝浜稿▎鎾崇闁绘垼濮ら埛鎴︽偣閹帒濡奸柡瀣懃閳规垿顢欓崫鍕舵嫹濡ゅ懎鏋佹い鏇嫹闁搞劍鍎抽悾鐑藉炊閵婏富鍟庡┑鐘垫暩婵挳鏁冮妶鍥锋嫹濮樼厧骞楅柛鎺戯躬楠炴﹢顢欓悾灞藉箺闂備胶绮弻銊╁箹椤愶负锟藉倿宕楅崗鐓庡伎闂佹寧绻傞幊蹇涘箹閹扮増鐓冮悷娆忓閻忔挳鏌熼鐣屾噰闁硅櫕绮撳Λ鍐ㄢ槈濞嗘挻鏆樼紓鍌氬�搁崐鐑芥倿閿曞倹鍋傞柨娑樺娑撳秹鏌″搴″箹缂佺姵鐗楃换娑橆啅椤旇崵鐩庨梺鍛婎殕婵炲﹪寮婚弴锛勭杸闁哄洨鍊妷锔轰簻闁挎棁顕у顔芥叏婵犲啯銇濇俊顐㈠暙闇夐柕澶堝劤婢э妇锟芥鍠楄ぐ鍐�﹂妸鈺侀唶闁绘棁娓圭花鐢告⒒娴ｅ憡鎯堟繛灞傚灲瀹曠懓煤椤忓懎浜楀┑鐐叉閹稿宕愰悽鍛婄厽闁靛繆妲呴崯蹇涙煟閹烘垵鈷旈柨鐔诲Г缁嬫帞鎹㈤崼婵愭綎婵炲樊浜滃婵嗏攽閻樻彃鏆熼柛娆忔椤啴濡堕崱妤冧淮濠碘槅鍋呴惄顖炵嵁閹达箑顫呴柣姗嗗亝閺傦拷闂佽鍑界紞鍡涘磻閸涱厸鏋嶉柕蹇ョ磿缁犻箖鎮楅悽娈跨劸鐎涙繂顪冮妶鍡楃仴闁硅櫕锕㈤獮鍐ㄢ枎閹邦喚鐦堥梺鍛婂姧缂傛氨鑺辨繝姘拺缁绢厼鎳忛鐘绘煕鐎ｎ剙浠ч柨鐔诲Г閼规儳锕㈡潏鈺傤潟闁规儳顕悷鐟扳攽閻樻彃鏆欐い蹇氭硾閳规垿鎮╅鑲╀紘闂佺硶鏅滈悧鐘茬暦濠靛鍐�妞ゆ挾鍠庢禍妤呮⒑閸涘﹤濮﹂柛鐘愁殜閹ょ疀閹垮啰鍞甸柣鐘荤細濞咃絾鏅堕弴銏＄厱闁哄喛鎷风�癸拷閹间礁钃熼柨鐔哄Т楠炪垺绻涢幋鐑嗘畷闁哥姵宀稿娲传閸曨厾鍔圭紓鍌氱▌閹烽绱撴担鍝勑ｉ柣鈺婂灠椤曪綁顢氶敓钘夌暦閹烘垟妲堟俊顖濆吹瑜版挳姊婚崒姘拷宄懊归崶顒夋晪闁哄稁鍘肩粣妤呮煛瀹ュ骸骞楅柛瀣槸閳规垿宕掑搴ｅ姼闂佸搫顑勭欢姘跺蓟閻旂厧绀堢憸蹇曟暜濞戙垺鐓涢柛娑卞枟閸婃劙鏌＄仦璇插闁诡喓鍊濆畷鎺戔槈濮楀棔绱�?,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垹绠婚悗闈涙啞閸ｄ即姊虹拠鈥虫珝婵炰匠鍡欎航闂備胶鍘ч～鏇㈠磹濡ゅ懏鍎婇柛顐犲劜閳锋垿姊婚崼鐔烘创闁绘稒绮庣槐鎺楀箵閹烘垟鎸冨┑鐐村灩閺佸骞冨▎鎿冩晢闁稿本绮犻崯搴ㄦ⒒娴ｅ憡璐￠柧蹇撻叄瀹曟娊顢欓崲澶嬬洴楠炲鎮╅悽纰夌床婵＄偑鍊栧濠氬煕閸儲鍋傞柤娴嬫櫔閹烽鎲撮崟顒傤槶闂佺绻戦敃銏ゅΥ娴ｅ壊娼ㄩ柨鐔剁矙楠炲啴鍩￠崘銊︾�虫繝銏ｆ硾閼活垳鑺遍妷銉㈡斀闁绘ê鐏氶弳鈺佲攽椤旇宓嗙�规洖缍婇幃鈩冩償濡崵浜欐繝鐢靛仦閸垶宕瑰ú顏勭柧婵犻潧顑嗛悡銉╂煛閸愩劌锟界懓鈻嶉弴鐑嗙唵鐟滄繄鎹㈠┑鍡╂綎濠电姵鑹剧壕鍏肩箾閸℃ê绗掗柛妯凤拷鎰佹富闁靛牆楠搁獮鏍煟濡わ拷閿曨亪濡撮崘顔嘉ㄩ柍杞版缁卞爼姊洪棃娑辨缂佺姵鍨堕幆鏃�绻濋崒妤佹杸闂佸疇妫勫Λ妤呮倶閵夛妇绠鹃柛婊冨暟缁夘喚锟芥鍠楁繛濠囧极閸愵喖纾兼繛鎴炶壘瀵娊姊绘担铏瑰笡婵炲弶鐗犲畷鎰板捶椤撱劍瀚规慨妯煎亾鐎氾拷?,缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氱紓鍌氬�烽悞锕傚礉閺嶎厹锟藉啴宕奸妷锔芥闂佽姤锚椤﹂亶鎮鹃銏＄厱閹肩补锟藉疇鍩為柣鎾卞�濋弻鏇熺箾閻愵剚鐝旂紒缁㈠弿閹烽攱绻濆▓鍨灍妞ゎ厼鐗撳畷娲冀椤撶喎浜楀┑鐐叉閸ㄥ湱澹曢挊澹濆綊鏁愭径瀣敪闂佽绻嗛弲鐘诲蓟閿涘嫸鎷烽敐搴′簽闁靛棙甯炵槐鎺撴綇閵娿儲璇為梺杞扮劍閹歌崵绮嬮幒鏃撴嫹閿濆簼绨芥い锔哄姂濮婃椽宕橀崣澶嬪創闂佸摜鍠嶉崡鎶姐�佸▎鎾冲嵆闁靛繆妾ч幏铏圭磽娓氬洤鐏℃繛鍙夌墬閺呭爼宕ｆ径鍫滅盎闂侀潧顭堥崕铏櫠閵忋垻纾兼い鏃傗拡閻撹偐锟芥鍠栭…閿嬩繆閻戣姤鏅滅紓浣癸供濡懎鈹戦敍鍕杭闁稿﹥鐗滈弫顕�骞掑婵嗘喘椤㈡稑鈽夊▎鎰娇闂佽娴烽弫璇差焽婵犳艾绠�瑰嫭澹嬮弸鏃堟煕椤垵鏋熼柣蹇撶墦濮婅櫣绱掑Ο鐓庘吂闂侀潧鐗忛…鍫ユ偩瀹勬噴娲敂閸涱喗顏熼梻浣虹帛椤牏浜稿▎鎾存櫖婵犲﹤鍟犻弨浠嬫煟濡鍤嬬�规悶鍎甸幃妤�顫濋悡搴☆潻闂佸疇顕х粔椋庣不濞戞ǚ妲堟繛鍡楁湰鐎氫粙姊绘担渚劸闁哄牜鍓熼幃鐑芥晜閸撗呯劸闂佺粯顨呴悧鍕濠婂牊鐓涢柛銉㈡櫅閺嬫棃鏌ｉ鐔风瑲妞ゃ劊鍎甸幃娆撴嚑椤掑偆鍟嬮梻浣芥〃閻掞箓骞戦崶顒�鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珖闂佽法鍠撻弲顐ｇ珶閺囥垺鍋￠柟鍐诧工缂嶅﹪骞冮埡渚囧晠妞ゆ梻鍘ф俊褏绱撻崒姘拷鍝ョ矓閻㈠憡鍋嬮柡鍥ｆ噰閿熸枻濡囬幑鍕Ω閿曪拷绾绢垶姊虹紒妯虹仸閽冮亶鏌熼悜鎴掓喚婵﹨娅ｇ划娆戞崉閵娧屽敼缂傚倷绶￠崰妤呭箲閸パ屽殨閻犲洦绁村Σ鍫ユ煏韫囧﹥娅嗛柡鍛箞濮婃椽骞愭惔锝囩暤濠碘槅鍋呴惄顖濇闂侀潧艌閺呮粓鍩涢幋鐘电＝濞达綀鍋傞幋锕�绠氶柛顐犲劜閻撴瑩鏌涢幋娆忥拷鏍拷姘炬嫹?
		if (!checkNpcVisitable(roleid)){
			Module.logger.info("npc is unvisitable");
			return;
		}
		
		//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垹绠婚悗闈涙啞閸Ｑ冾渻閵堝棙绌跨紒韫矙閹箖鏁撻悩宕囧姺闂佹寧妫佸Λ鍕儊濠婂牊鈷掑〒姘炬嫹婵炰匠鍥ㄥ亱闁糕剝銇傚☉妯锋婵炲棙鍔栭悵宄邦渻閵堝棗绗掗柛濠呭吹婢规洟宕楃粭杞扮盎闂佸搫鍟ú銈嗙瑜版帗鐓熼柟鐑樻尰閸婃劙鏌熺粙鍖¤含闁诡喓鍨藉褰掑箛椤斿墽鏆伴梻鍌欑窔濞佳囨偋閸℃瑱鎷峰鐓庣仸鐎规洘顨呴悾婵嬫晸閻ｅ本顫曢柟鐑橆殕閸嬫劙鏌ゆ慨鎰拷妤呭汲椤愶附鈷戦柛婵嗗濠�浼存煟閳哄﹤鐏﹂柕鍡曠窔瀵挳濮�閳╁啯鐝抽梻浣规偠閸庮噣寮查埡鍛埞闁割偅娲橀埛鎺懨归敐鍛暈闁哥喓鍋為幈銊︾節閸屻倗鍚嬮悗瑙勬磻閸楁娊鐛崶顒夋晩闁芥ê顦花銉︾節閻㈤潧浠﹂柛顭戝灦瀹曠銇愰幒鎾跺帒闂佹悶鍎洪崜姘舵偂閻斿吋鐓涢柛鎰╁妿婢ф盯鏌℃笟锟芥禍鍫曞蓟閿熺姴骞㈡俊顖滅帛閺夌珟闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠抽柨鐔凤拷鐕佹綈婵炲弶鐗曠叅闁靛ň鏅滈崕妤呮煕閳╁喚妯呯憸鐗堝笚閺呮煡鏌涘☉鍗炲季婵☆偄鐭傚铏圭磼濡櫣鐟愮紓渚囧枟閻熲晛顕ｇ拠宸悑濠㈣泛谩閵娾晜鐓ラ柡鍌氱仢閳锋棃鏌ｅ☉鍗炴灈闁宠鍨块幃娆撳级閹寸姳鎴烽梻浣规偠閸斿秴顪冮挊澶屾殾闁汇垻顣幏鐑芥晲鎼粹剝鐏嶉梺鎶芥敱鐢繝寮诲☉銏╂晝闁靛牆鎳忛悘渚�姊洪棃娑欘棡閻㈩垳鍋熷Σ鎰板箳濡わ拷缁犳稒銇勯弮鍫燂紵婵″弶鍔曢埞鎴︻敊绾攱鏁惧┑锛勫仩濡嫰鎮鹃悜钘壩╅柨鏂垮⒔閻﹀牓姊洪崨濠傚Е闁绘挸鐗嗗嵄闂侇剙绉甸埛鎺懨归敐鍛暈闁哥喓鍋ら幆鍥ㄥ緞瀹�锟界壕鍏笺亜閺冨倹娅曢柟鍐插暣閺岋綁鏁愰崶褍骞嬪Δ鐘靛仜濞差參骞冭瀹曠厧鈹戦幘鏉戭伓婵＄偛顑呭ù椋庡娴犲鐓曟い鎰Т閻忊晠宕崫銉х＝濞达絽鎼牎閻庣櫢鎷风紒瀣儥濞兼牠鏌ц箛姘兼綈鐎规洖顦甸弻鏇熺箾閸喖濮曢梺缁樼缚閸ㄨ棄顫忓ú顏呭仭闁哄瀵ч锟介梻浣烘嚀閸ゆ牠骞忛敓锟�?
		SpecialNpcDialogProcessor processor = SpecialVisitProcessCreator.getInstance().createNpcDialogProcessor(roleid, npckey);
		if(null != processor){
			Module.logger.info("specialNpcDialog. npcid:"+share.id);
			processor.onVisitNpc();
			return;
		}
		
		final SVisitNpc svisitNpc = new SVisitNpc();
		svisitNpc.npckey = npckey;
		final java.util.List<Integer> services = NpcServiceManager.getInstance().getShowServicesIDSByNpcKey(roleid, npckey);
		if (null != services) {
			svisitNpc.services.addAll(services);
		}
		getScenarioQuests(roleid, share.id, svisitNpc);
		
		gnet.link.Onlines.getInstance().send(roleid, svisitNpc);
		Module.logger.info("SVisitNpc闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯弴鐐搭棡閻庢艾缍婇弻娑㈠箛闂堟稒鐏堥悗鐟版啞缁诲啴濡甸崟顖氬唨闁靛ě锟藉Σ鍫ユ煙閸忓吋缍戦柨鏇樺�濋崺鐐哄箣閻愯尙鐤囬梻浣侯焾閿曘儱煤閻旇偐宓侀煫鍥ㄦ穿閹风兘鏁愭惔鈩冪亪闂佸搫顑勭粈渚�鍩為幋锔藉亹闁告瑥顦ˇ鈺呮⒑缂佹ɑ灏版繛鍙夘焽閹广垹鈽夐姀鐘殿吅闂佺粯鍔曢悘姘跺闯椤撶姷纾介柛灞炬皑鏍￠梺鎼炲妼濠�鍗炍ｉ幇鏉跨婵°倓鐒﹀▍銏＄箾鐎电孝妞ゆ垵鎳愮划鍫ュ礃閳瑰じ绨婚梺鍝勫暙閸婄懓鈻嶉弴銏＄厱婵☆垰鎼懜褰掓煃鐟欏嫬鐏撮柟顔界懇瀵爼骞嬮悩杈ㄦ▕闂佽姘﹂～澶娒洪敃鍌氱婵炲棙鎼╅弫瀣煥濠靛棙顥撻柛瀣嚇閺屾盯骞囬妸锔界彇闂佸憡锕㈡禍璺侯潖閾忓湱纾兼俊顖濆吹椤︺儵姊虹粙鍖″伐婵狅拷闁秵鏅搁柤鎭掑劤閸熸煡鏌熼崙銈嗗-" + getString(svisitNpc,share.id));
	}
	

	private String getString(SVisitNpc svisitNpc,int npcid) {
		StringBuffer sb = new StringBuffer();
		sb.append("NPC:[" + npcid + "],");
		sb.append("Services:[");
		for(Integer serviceid : svisitNpc.services){
			sb.append(serviceid +";");
		}
		sb.append("],");
		sb.append("ScenarioQuests:[");
		for(Integer serviceid : svisitNpc.scenarioquests){
			sb.append(serviceid +";");
		}
		sb.append("].");
		return sb.toString();
	}
	@Override
	protected void process() {

		//Module.logger.info("闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊瑜忛弳锕傛煟閵忋埄鐒剧紒鎰殜閺岀喖鏌囬敃锟介弸娑㈡煕閵婏妇绠炴鐐寸墪鑿愭い鎺炴嫹闁诲浚浜濈换娑㈠川椤栨锝吳庨崶褝韬┑鈥崇埣瀹曘劑顢欓崗纰变哗缂傚倸鍊烽懗鑸垫叏閹惰棄纭�闁规儼妫勯拑鐔哥箾閹寸們姘ｉ崼鐔稿弿婵°倧鎷烽柣妤�锕顐﹀箚瑜夐弨浠嬫煟閹邦剙绾ч柛锝堟閳规垿鎮滈崶銊ヮ伓闂傚倷绀侀幖顐︽儗婢跺苯绶ら柛濠勫枔娴滀粙姊绘担鐟板姢缂佺粯锕㈤弫鎾绘嚍閵壯侊拷鎺戭渻閻熸澘鏆遍柍瑙勫灴閹晠骞囨担鍛婃珱闂備焦鎮堕崝瀣础閾忣偂绻嗛柛顐ｆ礀缁犵懓霉閿濆棛鎽冮柟鑺ユ礀閳规垿鎮欓弶鎴犱桓缂備緡鍠氭慨鏉戝祫闂佺粯鎸哥�垫帒銆掓繝姘厪闁割偅绻傞弳娆忊攽閳ュ啿鎮戝ǎ鍥э躬椤㈡洟鏁愰崶鈺冩澖闁诲孩顔栭崳顕�宕戦崟顖ｆ晣闁稿繒鍘х欢鐐测攽閻樻彃顏柣娑欐尰缁绘繂鈻撻崹顔界亪濡炪値鍙庨崜鐔肩嵁濡ゅ懏鏅搁柨鐕傛嫹 id + " + NpcServiceManager.getNpcIDByKey(npckey));
		
		// protocol handle
		// TODO:濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁惧墽绮换娑㈠箣濞嗗繒浠鹃梺绋款儍閸婃繈寮婚弴鐔虹鐟滃秹宕锔藉�跺┑鐘叉处閳锋垿鎮峰▎蹇擃仼闁告柣鍊曢…鑳槻婵炴挳鏀辩粩鐔煎即閵忊�虫疅闂侀潧顧�缁犳垵顕ｉ崹顔规斀闁宠棄妫楅悘锟犳倵缁楁稑鎳忛崗婊堟煕閹炬鎳愰敍婊堟⒑鐠恒劌鏋嶇紒顔界懃閻ｇ兘骞掗幋鏃�顫嶅┑鐐叉缁绘劖瀵兼惔銏㈢瘈鐎典即鏀卞姗�鏁撻懞銉︾妞ゃ垺鐗犲畷鍗炩枎濞嗘劕顏跺┑顔斤供閸撴稓绮斿ú顏呯厵妞ゆ梻鐡斿▓姗�鏌熼崣澶嬪唉鐎规洜鍠栭、妤呭磼閿旀儳鏋犻梻鍌氬�烽懗鍫曗�﹂崼婢濆綊鎮滈挊澶嬬�柣鐘叉搐濡﹪宕甸弴鐔翠簻闁规澘澧庨悾杈╃磼閿熶粙宕橀鐣屽帗闂佸憡绻傜�氼剟寮抽悢鍏肩厵闁惧浚鍋嗙粻鐐存叏婵犲啯銇濇鐐寸墵閹瑩骞撻幒鎳虫姊绘担鍛婂暈婵炶绠撳畷婊冣槈濠уじ姹楅梺姹囧灩閹诧繝鍩涢幒妤佺厱閻忕偞宕樻竟姗�鏌ㄩ悢璇残撻柟顔煎�搁悾鐑藉箛閺夎法顔愭繛杈剧到閹芥粓鏁嶅▎鎾粹拺鐟滅増甯楅敍鐔虹磼閿熻姤鎷呴崫鍕垫闂佽崵鍠愭竟瀣绩娴犲鐓熸俊顖濇閺嬪啫顭跨憴鍕电劷缂佽鲸鎸婚幏鍛村矗婢跺褰嬮梻浣告惈閺堫剙煤閻斿鍤曢柛濠勫櫏濡茶鈹戦悙鑼⒊闁瑰嚖鎷�,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁惧墽绮换娑㈠箣濞嗗繒浠鹃梺绋款儍閸婃繈寮婚弴鐔虹鐟滃秹宕锔藉�跺┑鐘叉处椤ュ﹥銇勯幇鈺佺仾濠㈣泛瀚伴弻鐔煎川婵犲啫鍞夐悗娈垮枤椤牓顢橀崗鐓庣窞閻庯綆鍓欏铏節閻㈤潧鈻堟繛浣冲吘娑樷枎閹惧秴顦甸幃娆戯拷闈涙憸椤旀洟姊洪崨濠佺繁闁搞劋鍗抽崺銏ゅ醇閵夛妇鍘搁柣蹇曞仜婢т粙鈥栭崗绗轰簻闁挎洑鐒﹂悵顏堟煏閸パ冾伃濠碘剝鎮傛俊鐑芥晜缂佹﹫绱楅梺璇叉唉椤煤濮楋拷瀹曞綊宕稿Δ鍐ㄧウ闂佹悶鍎洪崜姘跺磻鐎ｎ喗鐓曟い鎰Т閻忊晜顨ラ悙杈捐�挎慨濠傤煼瀹曟帒顫濋濠冨闁归棿鐒﹂崑瀣煕閹伴潧鏋涢柣銈囧亾缁绘繃绻濋崒娑樼彅闂佺懓鍢查崲鏌ワ綖濠靛鍊锋い鎺炴嫹妞ゅ骏鎷�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫炵紓浣界堪閸婃繈寮诲☉婊庢Ъ濡炪們鍔岄幊鎰珶閺囥垹閿ゆ俊銈勮兌閸橆亪姊洪崜鎻掍簼缂佽绉村嵄鐟滅増甯楅悡鏇㈡倵閿涘崬瀚悵姘攽椤旂》鏀绘俊鐐扮矙閵嗕礁螖閸涱喗娅㈤梺浼欑到閻ジ鎯岄幘缁樼厽闁靛繒濮甸崯鐐烘煕鐎ｎ亜锟藉潡寮婚敓鐘茬倞闁靛鍎虫禒楣冩⒑缂佹ɑ灏伴柣鐔叉櫊瀵鈽夊Ο閿嬫杸闂佺硶鍓濋〃蹇斿瀹�鍕拺缂佸娼￠妤冪磼缂佹﹫鑰跨�殿喖顭锋俊鎼佸煛閸屾矮绨婚梺鑽ゅТ濞诧箓鎮鹃锕�绠荤紓浣诡焽閸樿棄鈹戞幊閸婃洟宕銏㈡懃濠碉紕鍋戦崐鏍洪埡鍐ㄧ筏闁告挆鍕簥濠电娀娼уΛ顓烆焽閳哄倶浜滈柟鐑樺灥閿熻姤鎮傞弫鎾绘偩鐏炴垝绮跺銈庝簻閸熷瓨淇婇崼鏇炲耿婵°倕鍟伴幉顏堟⒒娴ｈ櫣甯涢悽顖ｄ簽缁骞嬮敃锟介悡婵堬拷骞垮劚椤︻垶宕橀敓钘夘渻閵堝棙灏甸柛鐘虫崌瀹曘垺绂掔�ｎ偒妫呭銈嗗姂閸ㄧ儤寰勯崟顒傜闁告瑥顦辨晶顒傜磼閸屾稑娴柛鈺嬬節瀹曘劑顢欓幆褍绠為梻浣筋嚙閸戠晫绱為崱娑樼；闁告洦鍓氶崣蹇涙煕椤愮姴鍔滈柛濠勬暬濮婂宕奸悢琛℃（闂佺顑冮崹娲�冮妷鈺傚�烽柛娆忣槸閺嬬姴顪冮妶鍐ㄧ仾闁绘濞�楠炲﹪鎮欓崫鍕庛劑鏌ㄩ弮鍥撶紒棰濆亰濮婂宕掑顒婃嫹閻戣姤鍤勯柛顐ｆ礀绾惧鏌曟繛鐐珔缁炬儳娼″娲敆閿熺晫绮旈幘顔藉仾妞ゆ洩鎷烽柡灞剧椤﹁櫕銇勯妸銉︻棦鐎殿喗鐓￠獮鏍ㄦ媴閸︻厼寮繝纰樻閸垳鎷冮敃锟藉嵄闁告稑锕ｇ换鍡涙煠绾板崬澧伴悽顖涚洴閺屾洟宕惰椤忣厽銇勯姀鈩冪闁轰焦鍔欏畷鍫曞煛閸愨晜绶伴梻鍌氬�峰ù鍥ь浖閵娧呯焼濞撴熬鎷风�规洦鍨跺鍫曞箣閻樿櫕顔曢梻浣告贡閸庛倝宕洪崼婵愮劷闁冲搫鍊舵禍婊堟煙閾忕懓浠﹂悗姘秺濮婅櫣鎲撮崟顒�浠╅梺绋匡攻缁诲倿锝炶箛鏇犵＜婵☆垵顕ч鎾绘⒑缂佹ê鐏﹂柨姘箾閸繄鐒告慨濠呮閹风娀鎳犻鍌ゅ敼缂傚倷娴囬褏锟芥矮鍗冲顐﹀箻缂佹ê娈熼梺闈涱槶閸庡崬袙閸儲鈷戦柛婵勫劚鏍″┑顔角滈崝鎴濈暦濮樿泛绠虫俊銈忔嫹闂佸崬娲弻锝夊籍閸偅顥栫紓浣瑰姉閸嬨倕顫忔ウ瑁や汗闁圭儤鍨抽崰濠囨⒑閸涘鑰跨紒鐘崇墪閻ｇ兘濮�閵堝棗浠洪梺鍛婄☉閿曪箓宕㈡禒瀣厵闁稿繗鍋愰弳姗�鏌涢妸銉吋闁糕晪闄勭粭鐔兼晸娴犲钃熼柡鍥ュ灩楠炪垺绻涢崱妤冪婵″弶鍔曡灃闁绘﹢娼ф禒婊勩亜閹存繍妯�鐎殿噮鍋婂畷姗�顢欓懞銉︻仧濠电偛顕慨鎾敄閸涱垳鐭嗛柛鏇ㄥ灡閻撶喐淇婇婵嗕汗閻㈩垱鐩弻锝夊箻鐠虹儤鐏堥梺鍝勭焿缁绘繂鐣烽幒鎴旀婵妫楀▓婵嬫⒒娴ｇ儤鍤�鐎殿喖鐖奸獮鍐磼閻愯尪鎽曢悗骞垮劚濡顢氭潏銊х闁糕剝锚婵洦銇勮箛銉﹀?...
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0){
			Module.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠抽柨鐔凤拷鐕佹綈婵炲弶鐗曠叅闁靛ň鏅滈崕妤呮煕閳╁喚妯呯憸鐗堝笚閺呮煡鏌涘☉鍗炲季婵☆偄鐭傚铏圭磼濡櫣鐟愮紓渚囧枟閻熲晛顕ｇ拠宸悑濠㈣泛谩閵娾晜鐓ラ柡鍌氱仢閳锋棃鏌ｅ☉鍗炴灈闁宠鍨块幃娆撳级閹寸姳妗撴繝娈垮枟鑿ч柛鏃�鍨块獮鍡楃暆閸曨偆顔掔紓鍌欑劍椤洭宕㈤棃娑辨富闁靛牆妫欑亸鐢告煕閻樿櫕宕屾い銏℃楠炴﹢顢欑憴锝嗗闂備胶顭堥張顒勬嚌妤ｅ啯鏅搁柣锝呰嫰閸樻挳鏌熼鎯т槐闁轰礁鍟村畷鎺戔槈濡搫顥愰梺鑽ゅ枑缁孩鏅跺Δ鍐╂殰闁圭儤姊婚惌鍡楊熆鐠鸿櫣鐒块柟椋庡厴閹倿宕ㄦ繝鍌や紦闂傚倷娴囧▔鏇㈠窗瀹ュ洤鍨濇繛鍡樻尭閺嬩線鏌熼崜褏甯涢柛銈呯Ч閺屾洘寰勯崼婵嗗濠殿噯绲介悧鎾愁潖濞差亜绠归柣鎰絻椤牓姊虹紒妯煎ⅹ闁靛牏顭堥锝夘敃閿曪拷缁犳盯鏌ｅΔ锟介悧鍡涙晸閻ｅ苯鍘撮柡灞剧☉閳诲氦绠涢幙鍕闁荤喐瀚堝☉銏犵闁靛ě鍕啎闂備線娼ц墝闁哄應鏅犲顐ｇ節閸ャ劎鍘遍棅顐㈡处閼圭偓绂嶈ぐ鎺撶厸濠㈣埖绋掔�氾拷? 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗙墛閵嗗啴鏌ｉ幒鎴含闁哄本绋戦埥澶娾枎閹邦喚鈻忕紓鍌欒兌婵參宕归崼鏇炶摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹? " + roleid + "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠為柟钘夊�婚敓鏂ょ秵閸犳牠鎮欐繝鍐︿簻闁瑰搫绉堕ˇ锕�霉閻樼儤顏犵紒杈ㄦ尰閹峰懘宕滈幓鎺戝闂佽娴烽悷鎶藉炊閵娿儻鎷烽崹顐犱簻闁圭儤鍨甸顏堟煃闁垮鐏撮柟顔肩秺楠炰線骞掗幋婵愮�虫繝鐢靛仜閹冲繘宕濆▎鎾宠摕闁绘梻鍘х粈鍕煏閸繃顥滄い蹇ユ嫹");
			return;
		}
		
		PropRole prole = new PropRole(roleid, true);	
		if(prole.getProperties().getCruise() > 0) {
			Module.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠抽柨鐔凤拷鐕佹綈婵炲弶鐗曠叅闁靛ň鏅滈崕妤呮煕閳╁喚妯呯憸鐗堝笚閺呮煡鏌涘☉鍗炲季婵☆偄鐭傚铏圭磼濡櫣鐟愮紓渚囧枟閻熲晛顕ｇ拠宸悑濠㈣泛谩閵娾晜鐓ラ柡鍌氱仢閳锋棃鏌ｅ☉鍗炴灈闁宠鍨块幃娆撳级閹寸姳妗撴繝娈垮枟鑿ч柛鏃�鍨块獮鍡楃暆閸曨偆顔掔紓鍌欑劍椤洭宕㈤棃娑辨富闁靛牆妫欑亸鐢告煕閻樿櫕宕屾い銏℃楠炴﹢顢欑憴锝嗗闂備胶顭堥張顒勬嚌妤ｅ啯鏅搁柣锝呰嫰閸樻挳鏌熼鎯т槐闁轰礁鍟村畷鎺戔槈濡搫顥愰梺鑽ゅ枑缁孩鏅跺Δ鍐╂殰闁圭儤姊婚惌鍡楊熆鐠鸿櫣鐒块柟椋庡厴閹倿宕ㄦ繝鍌や紦闂傚倷娴囧▔鏇㈠窗瀹ュ洤鍨濇繛鍡樻尭閺嬩線鏌熼崜褏甯涢柛銈呯Ч閺屾洘寰勯崼婵嗗濠殿噯绲介悧鎾愁潖濞差亜绠归柣鎰絻椤牓姊虹紒妯煎ⅹ闁靛牏顭堥锝夘敃閿曪拷缁犳盯鏌ｅΔ锟介悧鍡涙晸閻ｅ苯鍘撮柡灞剧☉閳诲氦绠涢幙鍕闁荤喐瀚堝☉銏犵闁靛ě鍕啎闂備線娼ц墝闁哄應鏅犲顐ｇ節閸ャ劎鍘遍棅顐㈡处閼圭偓绂嶈ぐ鎺撶厸濠㈣埖绋掔�氾拷? 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗙墛閵嗗啴鏌ｉ幒鎴含闁哄本绋戦埥澶娾枎閹邦喚鈻忕紓鍌欒兌婵參宕归崼鏇炶摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹? " + roleid + "闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冮叄閵嗗啴濡疯閻瑩鏌涢弻顓滃�ч幏鐑藉锤濡わ拷缁狙囨煕椤愶絿顣叉繛鍛閺屾稖绠涢弮鍌滅厜闂佸搫鏈惄顖炪�侀弴銏℃櫜闁糕剝鐟Σ顒傜磽閸屾瑧绛忛柟椋庡厴閺屾盯顢曢妶鍛亖缂備讲妲勯幏鐑芥⒒閸屾艾锟芥悂鎮ф繝鍐懝婵°倕鎳庣壕鍧楁煙閹殿喖顣奸柣鎾存礋閹鏁愭惔婵囧枤濠碘槅鍨介幏鐑芥⒒娴ｅ憡鎯堥柡鍫墴閹嫰顢涢悙顏庢嫹娓氾拷瀵挳濮�閳╁啯鐝抽梻浣虹《閸撴繈鎮烽姣硷絾瀵肩�涙ǚ鎷绘繛杈剧导鐠�锕傛倿閻愵兙浜滈柟瀛樼箖椤ャ垻锟借娲樼换鍌炲煝鎼淬劌绠婚悗鍦У閹蹭即姊绘笟锟藉褔鎮ч崱娴板洦瀵煎銈咁樀瀹曞ジ濡烽敂鎯у笚闂備礁鎲＄换鍌滐拷姘煎墴閺佹捇鎳為妷锕�锟芥劖銇勯姀鈩冾棃闁轰焦鎹囬弫鎾绘晸閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓缂佺姵婢橀埞鎴︽偐瀹曞浂鏆￠梺鎼炲�曢懟顖濈亙闂佹寧绻傞幊搴ㄥ汲閻愮儤鐓涢柛娑卞枤缁犵偤鏌＄仦璇插鐎殿噮鍓熷畷褰掝敊鐟欏嫬鐦遍梻鍌欑劍濡炲潡宕㈤悡骞稑螖閸涱亷鎷烽敂鐐磯闁靛绠戠壕顖炴⒑閹呯婵狅拷鏉堛劌顕遍柛銉㈡櫇绾惧ジ鏌ｉ幇闈涘闁告柣鍊濋弻鏇㈠醇閻旂锟芥劗锟芥鍠涢褔鍩ユ径濠庢僵妞ゆ劧绲芥刊浼存⒒娴ｅ憡鍟為柟绋挎瀹曠喖顢曢敐鍥ц拫闂傚倸鍊搁崐椋庣矆娓氾拷楠炲鏁撻悩鑼舵憰闂侀潧臎閸涱垳鍘犻梻浣圭湽閸ㄥ鈥﹂崼鐕佹敯闂傚倷绀侀幉鈥趁洪敃鍌氬瀭闁规鍠氭稉宥夋煙閹澘袚闁绘挻鐟╅弻鐔烘喆閸曨偄顫庨梺鍓插亽娴滎亪寮婚妸鈺傚亜閻犲洦鐣幘缁樺仺妞ゆ牓鍊楃弧锟介悗娈垮枛椤兘骞冮姀鈽嗘Ч閹兼番鍨洪悿鍌炴⒒閸屾瑧璐伴柛娆忕箳缁骞嬮敃锟界粈鍫ユ煕椤愶絾绀冮柛濠勬暬閹嘲鈻庤箛鎿冧痪缂備緤鎷烽柛顐ゅ枂娴滄粍銇勯幘璺轰户濠⒀嶇秮閺岋綀绠涢幘铏缂備胶绮惄顖炵嵁濡厧顥氶悗锝庝憾濡喖姊绘担鐟邦嚋婵炴祴鏅濈划濠氬箣閿旂櫢鎷烽弮鍫濈妞ゆ棁濮ゅ▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹.");
			return;
		}

		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垻绮穱濠囨倷椤忓嫸鎷烽弽顓熷亱婵犲﹤鐗嗙壕缁樼箾閹存瑥鐏╅柛銊ュ�块弻娑氫沪缂併垹娈ч悷婊呭鐢帞绮堥崒鐐寸厱闊洦鑹炬禍鍦磼鐎ｎ亝鍠樻慨濠冩そ楠炴牠鎮欓幓鎺濈�抽梻浣侯焾閿曘倕顭囬敓鐘冲仒妞ゆ洩鎷风�殿喕绮欓垾鏍Ψ閵夆晛寮板銈冨灪椤ㄥ﹪寮幘瀵割浄閻庯綆鍋勯敓鍊熷煐閵囧嫰寮▎鐐稐婵炲瓨绮嶇划鎾诲蓟瀹ュ棙濮滈柟娈垮櫘濡差喚绱撴担鍝勭彙闁搞儯鍔庨崢顏堟⒑閹肩偛鍔�闁告劕褰炵槐鏃�淇婇妶鍥ラ柛瀣☉鐓ゆい鎾卞灩閺勩儵鏌嶉埡浣告殶闁荤喓鎳撻埞鎴︽偐閹绘帗娈銈呯箰閻栫厧顫忓ú顏勪紶闁告洦鍘搁弸鍡涙⒑閸涘♁鑲╁垝濞嗗繒鏆﹂柟杈剧畱閻撴盯鏌涘☉鍗炴灓闁告妫勯—鍐Χ閸涱垳顔囬梺鐟板暱缁绘ê鐣烽幇鐗堝剺妞ゅ繐鐗婇埛鎺楁煕鐏炴崘澹橀柨鐔诲Г閹倸鐣烽幇顓фЧ閹艰揪绲块悞鍏肩箾鏉堝墽绉俊妞煎姂閹偞绻濋崶銊у幈濠电偞鍨堕悷锔剧礊閹寸姷纾奸柣娆欐嫹闁搞劌鐖煎濠氬Ω閳哄倸浜為梺绋挎湰缁嬫垿顢旈敓锟�?
		Npc npc = SceneNpcManager.selectNpcByKey(npckey);
		if (npc == null){
			Module.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠抽柨鐔凤拷鐕佹綈婵炲弶鐗曠叅闁靛ň鏅滈崕妤呮煕閳╁喚妯呯憸鐗堝笚閺呮煡鏌涘☉鍗炲季婵☆偄鐭傚铏圭磼濡櫣鐟愮紓渚囧枟閻熲晛顕ｇ拠宸悑濠㈣泛谩閵娾晜鐓ラ柡鍌氱仢閳锋棃鏌ｅ☉鍗炴灈闁宠鍨块幃娆撳级閹寸姳妗撴繝娈垮枟鑿ч柛鏃�鍨块獮鍡楃暆閸曨偆顔掔紓鍌欑劍椤洭宕㈤棃娑辨富闁靛牆妫欑亸鐢告煕閻樿櫕宕屾い銏℃瀵爼骞嬮弮锟介弬锟介梻浣虹帛閿氶柣蹇斿哺瀵娊鍩￠崨顔惧幈闁诲函缍嗛崜娆愮鏉堚晪鎷风憴鍕缂傚秴锕ら悾閿嬬附缁嬪灝宓嗛梺缁樺姈椤旀牠宕崼鏇熲拻濞达絽鎲￠崯鐐电磼閸濆嫭鍋ョ�规洘娲熼獮搴ㄦ嚍閵夈儱澹掗梻浣烘嚀婢х晫鍒掗鐐村亗婵炲棙鍨圭壕钘壝归敐澶嬫锭闁诲繆鏅犻弻锛勶拷锝庡墮閺嬫盯鏌＄仦鍓с�掗柨鐔告灮缁插宕濆畝鍕櫢闁兼亽鍎崇粻鐐碉拷娈垮枛椤嘲顕ｉ幘顔藉亜闁惧繗顕栭崯搴ㄦ⒒娴ｈ櫣甯涢柛鏃撶畵瀹曟粌顫濋懜闈涗户闂佸搫鍟悧濠囧煕閹达附鐓曢柨鏃囶嚙楠炴銇勮箛鏇炴灈闁哄瞼鍠栧畷娆撳Χ閸℃浼�? 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗙墛閵嗗啴鏌ｉ幒鎴含闁哄本绋戦埥澶娾枎閹邦喚鈻忕紓鍌欒兌婵參宕归崼鏇炶摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹? " + npckey);
			return;
		}
		final SNpcShare share = NpcManager.getInstance().getNpcShareByID( npc.getNpcID() );
		if ( share == null ){
			Module.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠抽柨鐔凤拷鐕佹綈婵炲弶鐗曠叅闁靛ň鏅滈崕妤呮煕閳╁喚妯呯憸鐗堝笚閺呮煡鏌涘☉鍗炲季婵☆偄鐭傚铏圭磼濡櫣鐟愮紓渚囧枟閻熲晛顕ｇ拠宸悑濠㈣泛谩閵娾晜鐓ラ柡鍌氱仢閳锋棃鏌ｅ☉鍗炴灈闁宠鍨块幃娆撳级閹寸姳妗撴繝娈垮枟鑿ч柛鏃�鍨块獮鍡楃暆閸曨偆顔掔紓鍌欑劍椤洭宕㈤棃娑辨富闁靛牆妫欑亸鐢告煕閻樿櫕宕屾い銏℃楠炴﹢顢欑憴锝嗗闂備胶顭堥張顒勬嚌妤ｅ啯鏅搁柣锝呰嫰閸樻挳鏌熼鎯т槐闁轰礁鍟村畷鎺戔槈濡搫顥愰梺鑽ゅ枑缁孩鏅跺Δ鍐╂殰闁圭儤姊婚惌鍡楊熆鐠鸿櫣鐒块柟椋庡厴閹倿宕ㄦ繝鍌や紦闂傚倷绀侀幉鈥趁洪敃鍌氱；闁告侗鍘欓敐澶樻晢闁告洦鍏橀幏娲⒑閸涘﹥灏�殿喖澧庡▎銏犫槈閵忥紕鍘甸梺鍛婂灟閸婃牜锟芥熬鎷� 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗙墛閵嗗啴鏌ｉ幒鎴含闁哄本绋戦埥澶娾枎閹邦喚鈻忕紓鍌欒兌婵參宕归崼鏇炶摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹? " + npc.getNpcID() + "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠為柟钘夊�婚敓鏂ょ秵閸犳牠鎮欐繝鍐︿簻闁瑰搫绉堕ˇ锕�霉閻樼儤顏犵紒杈ㄦ尰閹峰懘宕滈幓鎺戝闂佽娴烽悷鎶藉炊閵娿儻鎷烽崹顐犱簻闁圭儤鍨甸顏堟煃闁垮鐏撮柟顔肩秺楠炰線骞掗幋婵愮�虫繝鐢靛仜閹冲繘宕濆▎鎾宠摕闁绘梻鍘х粈鍕煏閸繃顥滄い蹇ユ嫹 share濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫校婵犮垺顭堥悘鍐⒑閹稿海绠撻柟鍐查叄瀵娊鎮欓悜妯煎幈闁硅壈鎻槐鏇熸櫏闂備礁鎼惌澶岀礊娴ｅ壊鍤曞ù鐘差儏鎯熼梺闈涱檧闂勫嫬鈻撻。锟�");
			return;
		}
		if ( share.npctype == 5 ) {
			Role role = RoleManager.getInstance().getRoleByID(roleid);
			if(!role.checkDistance(npc,400)){
				Module.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠抽柨鐔凤拷鐕佹綈婵炲弶鐗曠叅闁靛ň鏅滈崕妤呮煕閳╁喚妯呯憸鐗堝笚閺呮煡鏌涘☉鍗炲季婵☆偄鐭傚铏圭磼濡櫣鐟愮紓渚囧枟閻熲晛顕ｇ拠宸悑濠㈣泛谩閵娾晜鐓ラ柡鍌氱仢閳锋棃鏌ｅ☉鍗炴灈闁宠鍨块幃娆撳级閹寸姳妗撴繝娈垮枟鑿ч柛鏃�鍨块獮鍡楃暆閸曨偆顔掔紓鍌欑劍椤洭宕㈤棃娑辨富闁靛牆妫欑亸鐢告煕閻樿櫕宕屾い銏℃楠炴﹢顢欑憴锝嗗闂備胶顭堥張顒勬嚌妤ｅ啯鏅搁柣锝呰嫰閸樻挳鏌熼鎯т槐闁轰礁鍟村畷鎺戔槈濡搫顥愰梺鑽ゅ枑缁孩鏅跺Δ鍐╂殰闁圭儤姊婚惌鍡楊熆鐠鸿櫣鐒块柟椋庡厴閹倿宕ㄦ繝鍌や紦闂傚倷娴囧▔鏇㈠窗瀹ュ洤鍨濇繛鍡樻尭閺嬩線鏌熼崜褏甯涢柛銈呯Ч閺屾洘寰勯崼婵嗗濠殿噯绲介悧鎾愁潖濞差亜绠归柣鎰絻椤牏绱掗崜褑妾搁柛娆忓暙閻ｅ嘲顫濈捄铏诡唺濠德板�撻悞锕�鈻嶅鍫熲拺闁告稑锕ｇ欢鍗灻瑰鍕疄闁挎繄鍋涢濂稿川椤忓懏鏉告俊鐐�栧濠氭偤閺冨牊鍊块柟顖ｇ亹閻熼偊鐓ラ幖绮癸拷鏂ユ嫬闂備浇顕栭崰姘跺磻閵堝懐鏆︾紒瀣嚦閺冿拷閹峰懘宕ｆ径濠庝紪闂傚倸鍊风粈渚�骞夐敍鍕床闁稿本绮ｉ幏宄邦潩閻撳骸鈷嬪銈冨灪濡啴宕洪敓鐘茬妞ゅ繐妫寸槐鑼磽閸屾艾锟界兘鎮為敃鍌涙櫔缂傚倷鐒﹂妵鍡涘川椤栨粣绱叉俊鐐�栧濠氬煕閸儲鍋傞柤娴嬫櫔閹峰嘲鈻撻崹顔界亞缂備緡鍠楅悷鈺呭Υ娴ｅ壊娼ㄩ柨鐔剁矙楠炲啫鈻庨幘鏉戜缓闂佸憡绺块崕杈╃矆閸儲鈷掗柛灞捐壘閿熻棄鍢查湁闁搞儜锟介弸鏍煛閸ャ儱鐏╅梻鍌ゅ灦閺屻劑寮撮悙璇ф嫹閸濄儳涓嶆い鏍仦閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹? 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗙墛閵嗗啴鏌ｉ幒鎴含闁哄本绋戦埥澶娾枎閹邦喚鈻忕紓鍌欒兌婵參宕归崼鏇炶摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹? " + npc.getNpcID());
				return;
			}
			gatherProcess( roleid, share.id );
			return;
		}
		if (!fire.pb.map.SceneNpcManager.checkDistance(npckey, roleid)){
			Module.logger.error("npc闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘梻纾奸柨鐔诲Г瀵板嫬鐣濈�ｎ偄顏堕梺璋庡啯鍟為悗姘秺濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熲晛顕ｉ锕�绠荤紓浣姑▓鐔兼⒑闂堟侗妲堕柛搴″船琚欓柛顐犲劜閳锋垿鏌熼懖鈺佷粶濠德ゅ亹閻ヮ亞绱掗姀鐘茬睄閻庤娲樺畝鎼佺嵁閹烘嚦鏃�鎷呯憴鍕礁闂傚倷绀侀幉鈩冪瑹濡や胶顩叉繝闈涱儜缂嶆牜锟藉箍鍎遍幊澶愬绩閼恒儯浜滈柡鍐ㄥ�婚幗鍌炴煟閹烘挸鍔ら棁澶嬬節婵犲倿顎楀褎鎸抽弻鐔碱敊閹傛閻庤娲滈…鍫ｇ亙婵炶揪绲藉鍓侊拷姘偢濮婄粯鎷呴崨濠傛殘缂備浇顕ч崐濠氭晸閼恒儱鍤柛鎾跺枛閵嗕線寮崼婵堝幐闂佸憡鍔︽禍鐐烘晬濠婂懐纾介柛灞剧懅閸斿秹鏌ㄥ杈╃＜婵＄儑绠戦幊鎰閸忕浜滈柡鍐ㄥ�甸幏锟犳煟閹剧懓浜归柨鐔诲Г椤旀牠宕伴弴鐘插灊婵炲棙鎸堕敓鎴掔椤粓鏁撴禒瀣畺婵炲棙鎸婚崑銊╂煕濠靛嫬鍔氱紒锟介崼銉︹拻闁稿本鑹鹃敓钘夊槻闇夐柛銉戯拷閺嬫牠鏌￠崶銉ョ仼闂傚偆鍨堕弻銊╁即閻愯鎷烽崫銉т笉妞ゆ牜鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�? 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗙墛閵嗗啴鏌ｉ幒鎴含闁哄本绋戦埥澶娾枎閹邦喚鈻忕紓鍌欒兌婵參宕归崼鏇炶摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹? " + npc.getNpcID());
			return;
		}
		fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleid);
		if (team != null) {
			if (team.isTeamLeader(roleid)) {
				if (share.share==1) {
					for (Long member : team.getNormalMemberIds()) {
						onVisitNpc( member, share );
					}
				} else {
					onVisitNpc( roleid, share );
				}
			} else {
				if ( team.isAbsentMember( roleid ) ) {
					onVisitNpc( roleid, share );
				}
			}
		} else {
			onVisitNpc( roleid, share );
		}
	}

	

	private boolean checkNpcVisitable(long roleid) {

		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珖闂佽法鍠撻弲顐ゅ垝婵犳碍鍋愰悹鍥皺椤旀劕鈹戦悜鍥╃У闁告挻鐟︽穱濠囨嚃閳哄啰锛滈梺缁樏肩拃锕�顭囬幇鐗堢厪闁搞儜鍐句純濡ょ姷鍋涘ú顓炵暦濠婂嫭濯撮柤浠嬫敱閸ㄥ灝顫忓ú顏勫窛濠电姴瀚崳褏绱撴担铏瑰笡闁挎洏鍨介獮鍐晸閻欙拷閺佸啴鏌ㄩ弴顏呭闂佺粯鍔曢敃顏堝蓟閺囩喓绡�闊洦鎼╁ú顓烆渻閵堝繗绀嬮柛鏃�鍨垮濠氭晲閸℃ê鍔呴梺闈涚箞閸╁嫰寮抽敓鐘冲�甸柣褍鎲＄�氬綊姊鸿ぐ鎺擄紵缂侊拷娓氾拷閹锋垿鎮㈤崗鑲╁弳闂佺粯鏌ㄩ幖顐㈢摥闂備胶绮崝鏇㈡晝椤忓牆钃熺�广儱妫欐慨婊堟煙濞堝灝鏋熼柛瀣斿洦鈷戦梻鍫熶緱濡叉挳鏌￠崨顔剧煉闁诡噯绻濋幃銏ゅ箹閻愭壆鐩庨梻浣筋潐瀹曟ê鈻斿☉銏犵闁规儼濮らˉ濠冦亜閹烘埈妲稿褎鎸抽弻锛勪沪闂堚晜瀚圭�规洖娲﹀▓鏇㈡煟鎼搭垳绉甸柛鎾寸閳灚绻濋悽闈浶ユい锝勭矙瀹曟粌鈹戠�ｎ亞鐣洪梺绋挎湰缁嬫劗鎹㈤崱娑欑厽闁硅揪绲鹃ˉ澶愬船椤栨凹娓婚柕鍫濇椤ュ棛锟借娲滈弫鍛婄珶閺囩姷纾兼俊顖濆亹閻﹀牓姊哄Ч鍥х伈婵炰匠鍡忓徔闂傚倷鐒﹂幃鍫曞礉瀹�鍕ч柟闂寸劍閺呮煡鏌ｉ幇顓熺稇缂佸墎鍋ら幃姗�鎮欓棃娑楀濠电偛鐗呴崡鍐差潖濞差亜鎹舵い鎾跺仜婵″搫顪冮妶鍐ㄥ闁硅櫕锕㈤獮鍐灳閺傘儲鏂�闁诲函缍嗛崑鍡涘储閻㈠憡鈷戦悹鍥ｏ拷宕囷拷濠氭倶閻愯泛袚妞ゆ柨绉剁槐鎾诲磼濞嗘帩鍞瑰┑鈩冨絻鐎氫即鐛箛娑欏�婚柤鎭掑劗閹风粯绻涙潏鍓у閻狅拷閿曞倹鍊垮Δ锝呭暞閸嬬姵鎱ㄥΟ鐓庡付濞存粍澹嗛敓鍊燁潐濞叉﹢宕濆▎蹇ｅ殨濞寸姴顑愰弫鍕煢濡警妲归柛濠傞叄濮婂宕掑顒婃嫹閹间礁纾归柟闂寸绾惧湱锟界懓瀚伴崑濠傘�掓繝姘厵闁绘垶蓱閳锋劖銇勯锝嗙闁靛洤瀚板鎾敂閸涱収浼撳┑掳鍊楁慨鐑藉磻濞戞碍宕叉慨妤嬫嫹鐎殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�?
//		if(!fire.pb.activity.keju.KejuManager.getInstance().checkNpcVisitable(roleid,npckey)){
//			Module.logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珖闂佽法鍠撻弲顐ゅ垝婵犳碍鍋愰悹鍥皺椤旀劕鈹戦悜鍥╃У闁告挻鐟︽穱濠囨嚃閳哄啰锛滈梺缁樏肩拃锕�顭囬幇鐗堢厪闁搞儜鍐句純濡ょ姷鍋涘ú顓炵暦濠婂嫭濯撮柤浠嬫敱閸ㄥ灝顫忓ú顏勫窛濠电姴瀚崳褏绱撴担铏瑰笡闁挎洏鍨介獮鍐晸閻欙拷閺佸啴鏌ㄩ弴顏呭闂佺粯鍔曢敃顏堝蓟閺囩喓绡�闊洦鎼╁ú顓烆渻閵堝繗绀嬮柛鏃�鍨垮濠氭晲閸℃ê鍔呴梺闈涚箞閸╁嫰寮抽敓鐘冲�甸柣褍鎲＄�氬綊姊鸿ぐ鎺擄紵缂侊拷娓氾拷閹锋垿鎮㈤崗鑲╁弳闂佺粯鏌ㄩ幖顐㈢摥闂備胶绮崝鏇㈡晝椤忓牆钃熺�广儱妫欐慨婊堟煙濞堝灝鏋熼柛瀣斿洦鈷戦梻鍫熶緱濡叉挳鏌￠崨顔剧煉闁诡噯绻濋幃銏ゅ箹閻愭壆鐩庨梻浣筋潐瀹曟ê鈻斿☉銏犵閺夊牄鍔庣粻楣冩煠绾板崬澧婚柣鎾跺发,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�闁靛ě渚婃嫹閹烘鐓熸繝闈涙閸╋綁鏌″畝瀣瘈鐎规洖鐖兼俊鐑藉Ψ瑜岄幃锝夋⒒娴ｅ湱婀介柛濠冾殜瀹曟垿骞橀懜闈涘簥濠电偞鍨崹鍦不閿濆棛绠鹃柛鈩冾殘缁犳娊鏌涢弮锟介幐鍐差潖閻戞ɑ濮滈柟娈垮櫘濡差噣姊洪幐搴㈢┛缂佺姵鎹囧顐﹀箻缂佹ê鐧勬繝銏ｆ硾閻ジ寮冲☉銏♀拺缂佸娼￠妤冿拷瑙勬处閸撴繈鎮樼�ｎ亖鏀介柣鎰綑閻忕喖鏌涢妸銉хШ闁诡喒锟芥枼鏀介悗锝庡亞閸樻悂姊洪崨濠傚闁告柨鏈粋宥嗗鐎涙鍘垫俊鐐差儏妤犳悂宕㈤幘顔界厽婵炴垵宕▍宥囷拷瑙勬礀缂嶅﹪銆佸▎鎾村亗閹兼惌鍠楃紞鎾绘⒒閸屾艾锟界兘鎳楅崜浣稿灊妞ゆ牜鍋戦敓钘夊暣瀹曘劑顢橀崶銊р槈闁宠鍨垮畷鍗炩枎閹邦収鍟庨梻鍌欑窔濞佳呮崲閸儱纾归柡鍥╁Х娑撳秶绱撴担楠ㄦ粍绂嶅鍫熺厸闁告劑鍔嶆径鍕亜閵夈儺妲搁棁澶愭煟濞嗘瑦瀚归梺鎼炲姀娴滎剟骞戦姀鐘婵炲棙鍔楃粔鍫曟⒑閸涘﹥瀵欓柛鎰╁妿閸樻帡姊婚崒娆掑厡妞ゃ垹锕、姘煥閸涱喖搴婂┑鐘绘涧濡盯寮抽敃鍌涚厵閺夊牆澧介悾閬嶅船椤栫偞鈷戦柟绋垮椤ュ棙绻涙径瀣缂侇喛顕ч～婵嬵敆婢跺鐦滈梻渚�娼ч悧鍡椢涘Δ浣瑰弿闁挎洖鍊归悡鏇㈡煙閹呮憼闁汇劍鍨块弻銊╂偄鐠囨畫鎾绘煟閺冩垵澧存鐐茬箻閺佹捇鏁撻敓锟�:"+roleid);
//			return false;
//		}
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珖闂佽法鍠撻弲顐ゅ垝婵犳碍鍋愰悹鍥皺椤旀劕鈹戦悜鍥╃У闁告挻鐟︽穱濠囨嚃閳哄啰锛滈梺缁樏肩拃锕�顭囬幇鐗堢厪闁搞儜鍐句純濡ょ姷鍋涘ú顓炵暦濠婂嫭濯撮柤浠嬫敱閸ㄥ灝顫忓ú顏勫窛濠电姴瀚崳褏绱撴担铏瑰笡闁挎洏鍨介獮鍐晸閻欙拷閺佸啴鏌ㄩ弴顏呭闂佺粯鍔曢敃顏堝蓟閺囩喓绡�闊洦鎼╁ú顓烆渻閵堝繗绀嬮柛鏃�鍨垮濠氭晲閸℃ê鍔呴梺闈涚箞閸╁嫰寮抽敓鐘冲�甸柣褍鎲＄�氬綊姊鸿ぐ鎺擄紵缂侊拷娓氾拷閹锋垿鎮㈤崗鑲╁弳闂佺粯鏌ㄩ幖顐㈢摥闂備胶绮崝鏇㈡晝椤忓牆钃熺�广儱妫欐慨婊堟煙濞堝灝鏋熼柛瀣斿洦鈷戦梻鍫熶緱濡叉挳鏌￠崨顔剧煉闁诡噯绻濋幃銏ゅ箹閻愭壆鐩庨梻浣筋潐瀹曟ê鈻斿☉銏犵闁规儼濮らˉ濠冦亜閹烘埈妲稿褎鎸抽弻锛勪沪闂堚晜瀚圭�规洖娲﹀▓鏇㈡煟鎼搭垳绉甸柛鎾寸閳灚绻濋悽闈浶ユい锝勭矙瀹曟粌鈹戠�ｎ亞鐣洪梺绋挎湰缁嬫劗鎹㈤崱娑欑厽闁硅揪绲鹃ˉ澶愬船椤栨凹娓婚柕鍫濇椤ュ棛锟借娲滈弫鍛婄珶閺囩姷纾兼俊顖濆亹閻﹀牓姊哄Ч鍥х伈婵炰匠鍡忓徔闂傚倷鐒﹂幃鍫曞礉瀹�鍕ч柟闂寸劍閺呮煡鏌ｉ幇顓熺稇缂佸墎鍋ら幃姗�鎮欓棃娑楀濠电偛鐗呴崡鍐差潖濞差亜鎹舵い鎾跺仜婵″搫顪冮妶鍐ㄥ闁硅櫕锕㈤獮鍐灳閺傘儲鏂�闁诲函缍嗛崑鍡涘储閻㈠憡鈷戦悹鍥ｏ拷宕囷拷濠氭倶閻愯泛袚妞ゆ柨绉剁槐鎾诲磼濞嗘帩鍞瑰┑鈩冨絻鐎氫即鐛箛娑欏�婚柤鎭掑劗閹风粯绻涙潏鍓у閻狅拷閿曞倹鍊垮Δ锝呭暞閸嬬姵鎱ㄥΟ鐓庡付濞存粍澹嗛敓鍊燁潐濞叉﹢宕濆▎蹇ｅ殨濞寸姴顑愰弫鍕煢濡警妲归柛濠傞叄濮婂宕掑顒婃嫹閹间礁纾归柟闂寸绾惧湱锟界懓瀚伴崑濠傘�掓繝姘厵闁绘垶蓱閳锋劖銇勯锝嗙闁靛洤瀚板鎾敂閸涱収浼撳┑掳鍊楁慨鐑藉磻濞戞碍宕叉慨妤嬫嫹鐎殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�? end
		return true;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795433;

	public int getType() {
		return 795433;
	}

	public long npckey; // npckey为npc的唯一ID

	public CVisitNpc() {
	}

	public CVisitNpc(long _npckey_) {
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		if (npckey < 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CVisitNpc) {
			CVisitNpc _o_ = (CVisitNpc)_o1_;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CVisitNpc _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}
