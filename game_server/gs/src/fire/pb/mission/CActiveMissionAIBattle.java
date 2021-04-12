
package fire.pb.mission;
import fire.pb.battle.PSendCameraUrl;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CActiveMissionAIBattle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CActiveMissionAIBattle extends __CActiveMissionAIBattle__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid( this );
		if ( roleid < 0 )
			return;
		final MissionConfig conf = MissionManager.getInstance().getMissionConfig( missionid );
		if (conf == null)
			throw new NullPointerException( "濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁惧墽绮换娑㈠箣濞嗗繒鍔撮梺杞扮椤戝棝濡甸崟顖氱閻犺櫣鍎ら悗楣冩⒑閸涘﹦鎳冪紒缁樺姌閻忓啴姊洪幐搴ｇ畵闁瑰啿閰ｅ鎼佸Χ婢跺鍘告繛杈剧到婢瑰﹪宕曢幋锔界厵闁圭粯甯楅崯鐐烘煙椤栨稒顥堝┑鈩冩倐婵＄柉顦撮柡澶夌矙濮婄粯绗熼敓钘夘焽瑜戞晶婵嬫⒑閸濆嫭鍣虹紒顔芥尭閻ｇ兘骞囬弶璺唶闁硅壈鎻徊鍧楊敊閺囥垺鍊甸柣褍鎲＄�氬綊鏌ｆ惔顖滅У闁稿瀚伴、鏃堟晸閿燂拷=" + missionid + "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘梻纾奸柨鐔诲Г瀵板嫬鐣濈�ｎ偄顏堕梺璋庡啯鍟為悗姘秺濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熲晛顕ｉ锕�绠荤紓浣姑▓鐔兼⒑闂堟冻绱￠柛娑卞幖缂嶅棝姊婚崒娆戭槮闁硅绻濋妴鍐川閺夋垹鏌堥梺绉嗗嫷娈曢柛瀣ф櫊閺岋綁骞嬮敐鍡╂濡炪値鍋勯幊姗�寮婚弴銏犻唶婵犻潧娲ら弲鐢告偡濠婂嫭顥堢�殿喛顕ч埥澶愬閻樻牓鍔戦弻鏇＄疀婵犲倸鈷夐梺缁樼箖閻楃姴顫忓ú顏勭閹艰揪绲婚敓鑺ュ浮閺屾稓锟斤綆鍋嗗ú鎾煃閵夛附顥堢�规洘锕㈤、娆撳床婢诡垰娲﹂悡鏇㈡煃閳轰礁寮存慨妯挎硾缁狀垶鏌ｉ悢绋款棎闁猴拷娴犲鐓冮柕澶堝劚閺嗚京绱掗悪娆忔处閸嬨劍銇勯弽銊х煀濞寸姍鍥ㄧ厱闁圭儤鎸稿ù顔撅拷瑙勬礀閵堟悂骞冮姀鐘垫殝闁规鍠曠花鏉戔攽閻樻鏆滅紒杈ㄦ礋瀹曟垿骞橀崜浣虹暥闂佸湱銆嬮幏锟�" );
		if(activetype == 0){
			if (conf.exeIndo.share == 0) {
				fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleid);
				if (team != null){
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 174001, null);
					Module.logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸啴鏁撻悾灞筋棜濠靛倸鎲￠悡銉╂煛閸愩劍澶勬い銉ヮ槹閵囧嫯绠涢妷锕�顏�" + roleid + "]濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儱绾ч柛顐ｇ☉婵＄霉濠婂嫮鐭掗柣鎿冨亰瀹曡埖顦版惔鈽嗗殼闂傚倷绶￠崣搴ㄥ垂閸洖钃熼柨娑樺濞岊亪鏌涢幘妤�鐬兼导鍥╃磽閸屾瑨鍏屽┑顔炬暬閹嫰顢涢悙闈涚ウ濠碘槅鍨甸崑鎰仚閹惰姤鍋℃繛鍡楃箰椤忊晜銇勮箛鎾跺煟婵﹥妞藉畷婊堟嚑椤掞拷鐢儵姊洪崫銉バｇ�癸拷缁嬫鍤曢柟鎯板Г閺呮繈鏌涚仦鍓с�掗柛妯圭矙濮婅櫣娑甸崨顔兼锭缂備焦鐓＄粻鏍＂婵犮垼鍩栭崝鏇犵不濮樿埖鐓熼柡鍌氱仢閹垿鏌涚�Ｑ冨⒉缂佺粯绻冪换婵嬪磼濮橆厽顔嶇紓鍌欒兌婵挳鈥﹂悜钘夎摕闁绘梻鈷堥弫宥嗘叏濡じ鍚ù鐓庢喘濮婅櫣鎹勯妸銉︾�鹃梺鍝勵儓瀹曠數妲愰悙鍝勫耿婵炴垶顭囬悰銉モ攽鎺抽崐鏇㈠箠鎼淬劍鍋傞柡鍥ュ灪閻撴瑩鏌ｉ幋鐑囦緵婵炲牊娲熼弻锝夊箻鐎涙顦伴梺鍝勭灱閸犳牕顕ｉ崼鏇炲瀭妞ゆ棁妫勯敓钘夋捣缁辨挻鎷呴棃娑橆瀳濡炪値鍘鹃崗妯侯嚕婵犳碍鏅柛鏇″煐鐎氬綊鏌ㄥ┑鍡涱�楀ù婊勭箞閺岋綁骞橀崡鐐插Е闂佸搫鑻粔鍫曞箟閹绢喖绀嬫い鎰╁�撶槐婵囦繆閻愵亜锟芥垿宕瑰ú顏呭仭闁冲搫鎳庣粻鐘绘煟閹邦剚鎯堥崬顖炴⒑闂堟侗妯堥柛銊ㄤ含閿熻姤鑹剧紞濠囧蓟閻斿吋鐒介柨鏇嫹鐎殿喚鍋撶换娑㈠醇濠婂懐鐓撻梺鍝勭焿缂嶄線鐛�ｎ亖鏀介柛銉戝本袩闂備浇顕х�涒晛顫濋妸鈺佺疇闁规崘顕ч悡姗�鏌熸潏楣冩闁稿﹦鍏橀弻銈夊箹娴ｈ閿┑鐐村毆閸涱垳锛濋梺绋挎湰濮樸劌鐨紓鍌欐祰閸╂牗绌遍崫鍕庢盯濮�閵堝棌鎷洪梺鑽ゅ枑濠㈡﹢鍩涢弮鍌滅＜妞ゆ洖鎳庨悘锔撅拷瑙勬礃閸ㄥ潡寮幘缁樺亹鐎规洖娲ら獮宥夋⒒娴ｄ警鏀版い顐㈩樀瀹曟繈鏁冮崒姘優濠电偛妫欓崹鍦婵傚憡鐓熸繛鍡樺姉閹冲啯绻涚拠褏鐣甸柟顕嗙節瀹曟﹢顢欓悾灞藉箞婵犵數濞�濞佳兾涘Δ鍜佹晜闁冲搫鎳忛悡銉╂煟閺冨倻甯涙い銉ヮ槹閵囧嫰顢橀悩鎻掑箣閻庤娲樺鑺ヤ繆閻戣姤鏅濋柨鐔烘櫕濞嗐垽鎮欓悜妯煎幍闂備緡鍙忕粻鎴︾嵁濮楋拷閺屾稑螣閸濆嫯鍩為梺瀹狀潐閸ㄥ潡骞冨▎鎾崇煑濠㈣埖蓱椤ワ絿绱撻崒娆掑厡缂侇噮鍨跺畷褰掓嚄椤栨冻绱撻梻鍌欑窔濞佳呮崲閸℃稒鏅搁柛濠勫枎閻ㄨ櫣绱掗悩瀹犲妞ゎ亜鍟存俊鍫曞幢濡わ拷椤洭姊洪幖鐐插缂傚秴锕ら锝夊箮閼恒儲娅滄繝銏ｆ硾椤戝洭宕㈤棃娑辨富闁靛牆妫欓埛鎺楁煛閸滀礁浜版鐐诧躬瀹曞爼顢楁担鍝勫箥婵＄偑鍊栧Λ浣哥暦閻㈠憡鍎楁繛鍡樻尰閻撴瑦銇勯弮鍥у惞闁活厽鐟╅弻鐔碱敊閼姐倗鐓撳┑鈽嗗亜閸燁偊鍩ユ径濞㈢喖鎳栭埡鍌氭珯闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顕�姊哄Ч鍥э拷銈夊窗閺嶎厽绠掗梻浣侯焾缁绘劙宕ョ�ｎ剛绀婇柟瀵稿Х绾惧ジ鏌熼柇锕�寮炬繛鍫熺矋椤ㄣ儵鎮欑�电鈪归柤鎸庡姈閵囧嫰骞掗悙鏉戭伓濠电姷顣介敓鐣屽仺閸嬨垽鏌″畝瀣М妞ゃ垺锕㈤幃銈嗘媴閸︻厽婢掗梻鍌欑閹碱偊鎳熼婊呯煋鐟滅増甯掗弰銉╂煃閳轰礁鏆炲┑顖涙尦閺屾稑鈽夊鍫熸暰濡炪倖鏌ㄧ粔鍨┍婵犲洦鍊锋い蹇撳閹风兘骞囬弶璺ㄦ煣濠电偞鍨堕敃鈺呭吹閺囥垺鐓曟い鎰剁稻缁�锟芥俊妤�鎳樺娲川婵犲啫顦╅梺鎼炲妽婢瑰棛鍒掔拠娴嬫闁靛骏绱曢崢顏呯節閻㈤潧浠滈柣蹇旂箞瀹曟繂顫濋懜鐢靛帗閻庣懓瀚伴崑濠偽熼敓浠嬫⒑鐠団�虫灍妞ゃ劌鐗撻獮澶愬箻椤旇偐顦板銈嗗笒閸嬪棗危娴煎瓨鈷掑ù锝堟鐢盯鏌熺喊鍗炰簽闁瑰箍鍨归埞鎴﹀幢閳轰焦顓块梺鑽ゅТ濞诧妇绮婇弶鎳筹綁宕奸妷锔惧帾闂婎偄娲﹀ú鏍ф毄闂備焦妞块崑鍕拷姘緲椤繐煤椤忓懎浠梻渚囧弿缁犳垵鈻撻崼鏇熲拺缂佸顑欓崕鎴︽煕鐎ｃ劌锟芥洟鎮鹃悜绛嬫晬闁绘劕鐡ㄥ▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹" + missionid + "]闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘梻纾奸柨鐔诲Г瀵板嫬鐣濈�ｎ偄顏堕梺璋庡啯鍟為悗姘秺濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熲晛顕ｉ锕�绠荤紓浣姑▓鐔兼⒑闂堟侗妲堕柛搴″船琚欓柛顐犲劜閳锋垿鏌涘☉姗堝姛闁瑰啿鍟撮弻娑㈡偆娴ｉ晲鍠婇梺璇″櫍缁犳牠骞冮崸妤婃晬婵☆垵顫夐惈蹇涙⒒娴ｅ憡璐￠柛搴涘�楅幑銏ゅ礃椤旇偐鏌ч梺闈涚箞閸婃牠鍩涢幋锔界厱婵炴垶锕弨璇差熆鐠哄搫顏柡灞剧〒閿熸枻缍嗘禍婵嬪吹閸ヮ剚瀵犻柣鏂垮悑閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴鐐╂斀闁绘ê鐏氶弳鈺佲攽椤旇偐鎽犻悗闈涖偢瀹曘劑顢楅崗鍏笺仢妞ゃ垺妫冨畷鐔碱敇瑜嶉幃鍫ユ⒒閸屾瑨鍏岀紒顕呭灦閳ワ箓宕堕锟介弸渚�鏌熼梻瀵稿妽闁稿鏅犻弻銈夊传閵夛附姣勭紓浣叉閹风兘姊绘笟锟藉褎顨ヨ箛鏇炵筏濞寸姴顑嗛崑鍌炴煙閹殿喖顣奸柣鎾存礋閺岋繝宕橀幐搴☆伓婵犵數鍋涘鍓佸垝鎼淬劌绀嗛柟鐑橆殔闁卞洭鏌曟径鍫濆姢妞わ附婢橀—鍐Χ閸℃瑥顫х紓浣割儐閹瑰洤鐣烽姀銈嗙劶鐎广儱妫岄幏娲煟鎼粹剝璐″┑顔炬暬钘熷璺侯儎缁诲棙銇勯幇鍓佺У婵炲牊绮撻弻锝呪槈閸楃偞鐏堥柧浼欑秮閺屻倕霉鐎ｎ偅鐝曢梺鎸庣☉缁绘ê顫忛搹瑙勫枂闁告洦鍋勬慨銏ゆ⒑閻熸澘鏆辩紒缁樺浮閺佹捇鎳為妷褍鏆￠梺鐟板殩閹凤拷" );
					return;
				}
			}
			
			if ( !fire.pb.map.SceneNpcManager.checkDistance( npckey, roleid ) )
				return;
			
			final int npcid = fire.pb.npc.NpcServiceManager.getNpcIDByKey( npckey );
			if (npcid == -1)
				return;
		
			MissionColumn sml = new MissionColumn( roleid, true );
		
			RoleMission mission = sml.getMission(missionid);
			if ( mission == null ) {
				Module.logger.debug( "婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸缂備礁顑嗙敮锟犲极瀹ュ绫嶉柛顐ゅ枔閸橀箖姊洪崫鍕垫Ъ婵炲娲樼粋鎺楀閵堝棭姊挎繝銏ｅ煐閸旀牠鎮￠妷锔剧瘈闂傚牊绋掗ˉ鐐烘煙閸忕厧濮嶉柡灞剧洴瀵剙鈻庨幆褍澹庨梻浣筋嚃閸犳銆冮崨杈剧稏婵犻潧顑愰弫鍥煟閹邦剙绾ч柟铏懇濮婄粯鎷呴崨濠冨創闂佸搫鐗滈崜娆戝弲濠碘槅鍨拃锕傚吹濡ゅ懏鐓曢柡鍥ュ妼閻忕娀姊洪崡鐐村缂佺粯绻堝畷褰掝敃閿濆懘鐎洪梺璇插閼瑰墽绱炴繝鍥ц摕闁炽儱纾弳銈嗐亜閺傚灝鎮戦柛锝囧劋缁绘盯宕奸妷褏鏆┑顔硷攻濡炶棄鐣烽锕�绀嬫い鏇炴噺閽戝姊绘担渚劸閻庢稈鏅犻幃锟犳晸閻樿尙鐣洪梺璺ㄥ枔婵挳宕￠幎鑺ョ厪闊洢鍎崇壕鍧楁煕濡粯鍊愭慨濠冩そ瀹曘劍绻濋崒姘兼綂闂備礁鎼幊蹇曞垝鎼淬垻顩查柟闂寸劍閸嬨劑鏌ｉ姀鐘典粵闁挎稑绻樺铏圭磼濡搫袝闂佸憡鎸婚悷鈺呫�佸顒夌叆闁告侗鍨抽敍婊呯磽閸屾瑧鍔嶆い顓炴搐鐓ら悗鐢告交閹烽鎲撮崟顒傤槬闂侀潧鐗婇幃鍌炵嵁閸愵喖顫呴柍钘夋鏁堥梺鍦帶閻°劎鎹㈤崘顔猴拷浣肝熼懖鈺冿紳闂佺鏈懝楣冩晸娴犲妫戠紒顔肩墛缁楃喖鏁撴禒瀣畾鐎癸拷閸曨偆锛滃┑鐐村灦閸戠懓煤閹间焦鈷戦柛鎾村絻娴滄繃绻涢崣澶屽⒌鐎殿喕鍗虫俊鐑藉煛閸屾粌骞堥梻浣告惈濞层垽宕濆畝鍕�堕柣妯兼暩绾惧ジ鏌ㄩ悢鍓佺煓鐎规洘锕㈤、鏃堝川椤撶喓锟介箖姊绘繝搴′簻婵炶绠戠叅婵犲﹤鐗婇崕妤呮煕閳╁啰鈾侀柣鎾卞劦閺岋綁寮撮悙璇ф嫹閸︻叏鎷峰鐐" );
				return;
			}
			final int status = mission.getState();
		
			if ( npcid == conf.exeIndo.npcID && status == MissionStatus.PROCESSING ) {
				if ( !checkEnterBattle( roleid, conf ) ) {
					return;
				}
				final int aiid = conf.aiInfo.aIID;
				new MissionBattle(roleid, aiid, 
						new MissionBattleEndHandler(missionid, conf.aiInfo.battleResult, roleid),
						conf.scenarioInfo.animationID).submit();
			}
		} else if (activetype == 1) {
			//TODO:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備胶濮锋繛锟介柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑氾拷锝冨妼閿熻姤绻堝濠氬即閻旇櫣顔曢梺鍓茬厛閸犳牠鈥栨径鎰拺闁荤喐婢橀弳閬嶆煟椤撶偛锟芥悂锝炶箛鏇犵＜婵☆垵顕ч鎾绘⒑閸涘﹦鈽夐柨鏇樺劦瀹曟洟骞橀幇浣瑰瘜闂侀潧鐗嗗Λ妤呮倶閵夛妇绠剧�瑰壊鍠栭獮鏍煟閿濆鏁遍悗闈涖偢瀵爼骞嬪┑鍡欍偖闂傚倷绶氬褏鎹㈤幒鎾村弿闁割偁鍎查弲婵嬫煕鐏炲墽銆掗柛妯兼暬濮婅櫣绱掑鍡樼暥闂佺粯顨呴敃锕�鈻庨姀銈呰摕闁靛濡囬崢鍗炩攽鎺抽崐鎾剁矆娓氾拷閸┿垽寮撮姀锛勫幐閻庣櫢鎷烽悗锝庡墰琚︽俊銈囧Х閸嬫稑煤椤撯偓锟戒礁顫滈敓浠嬪箖濞嗘挻鍋ㄩ柣鎰嚀娴狀厼鈹戦悩鍨毄濠殿喕鍗冲畷瑙勭附闂堚晝绋忔繝銏ｅ煐閸旀牠宕戠�ｎ喗鐓熸俊顖滃劋閳绘洘绻涢崗鑲╁缂佺粯绋戦蹇涱敊閼姐倗娉块柣搴ｆ嚀閹诧紕鎹㈤崒鐐茬厴闁硅揪闄勯崑鎰版煙缂佹ê绗氭繛鍫熺矒濮婃椽鎮烽弶鎸幮╁銈庡幖閸㈡煡锝炶箛鎾佹椽顢旈崟顏嗙倞闂備線娼чˇ顓㈠磿濞戙垺鏅查柛鈩冪懅椤旀洟姊洪懖鈹炬嫛闁告挻鐟╁鍛婃償閵婏妇鍘介梺鎸庣箓閹冲骸危婵犳碍鎳氶柡宥庡幗閻撴洘绻涢幋婵嗚埞闁哄鍠愮换娑㈠川椤愩垻浼堝┑顔硷龚濞咃綁骞戦崟顖毼╅柕澶涘瑜版岸姊绘担鐑樺殌闁搞倖鐗犻獮蹇涙晸閿燂拷
			final int aiid = conf.aiInfo.aIID;
			new PSendCameraUrl(aiid,roleid).submit();
		}
	}
	
	private static boolean checkEnterBattle( final long roleid, final MissionConfig conf ) {
		fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId( roleid );
		if ( team == null && conf.exeIndo.teamState == 2 ) {
			return false;
		}
		if ( team != null && !team.isAbsentMember( roleid ) && conf.exeIndo.teamState == 0 ) {
			Module.logger.error( "濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁惧墽绮换娑㈠箣濞嗗繒鍔撮梺杞扮椤戝棝濡甸崟顖氱閻犺櫣鍎ら悗楣冩⒑閸涘﹦鎳冪紒缁樺姌閻忓啴姊洪幐搴ｇ畵闁瑰啿閰ｅ鎼佸Χ婢跺鍘告繛杈剧到婢瑰﹪宕曢幋锔界厵闁圭粯甯楅崯鐐烘煙椤栨稒顥堝┑鈩冩倐婵＄柉顦撮柡澶夌矙濮婄粯绗熼敓钘夘焽瑜戞晶婵嬫⒑閸濆嫭鍣虹紒顔芥尭椤曪綁寮婚妷銉ь啇婵炶揪绲藉﹢閬嶅矗閸℃稒鈷戠紓浣股戠粈锟介梺绋匡工濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹" + conf.missionId + "濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喖顭烽弫鎰緞婵犲嫷鍚呴梻浣瑰缁诲倸螞椤撶倣娑㈠礋椤撶姷锛濇繛鎾磋壘閿曘儳锟芥艾缍婂铏圭矙閹稿孩鎷辩紓浣割儐鐢�崇暦閿濆牏鐤�闁哄倸澧界粻姘舵⒑闂堟稓澧曢柟宄邦儔瀹曟洟骞囬悧鍫濓拷鍨叏濮楀棗澧扮紒澶嬫そ閺岀喖顢欑粵瀣暥闂佸磭绮幑鍥х暦瑜版帩鏁婇柣锝呭闁垶姊婚崒娆愮グ妞ゆ泦鍛床闁硅揪闄勯崵灞轿旈敐鍛灓闁轰礁顑夐弻鏇熷緞閸℃ɑ鐝旂紓渚婃嫹閻庯綆鍋佹禍婊堟煛瀹ュ啫濡介柣銊﹀灴閺岋綁濡惰箛鏂款伓濠电姷顣槐鏇㈠磻閹达箑纾归柡宥庡幖缁犱即鏌熼梻瀵歌箞闁搞儺鍓欑痪褎淇婇銏粵婵＄偠妫勯锝嗙鐎ｅ灚鏅ｉ梺缁樻濞咃綁寮抽姀銈嗏拻闁稿本鑹鹃敓鐣屽厴閹虫宕滄担绋跨亰濡炪倖鐗滈崑娑氱不閹殿喚纾奸悗锝庡亾缁扁晝鎲搁悧鍫濈瑲闁绘挶鍎甸幃妤呮晲鎼粹�愁潻闂佹剚浜欓崡鍐差潖缂佹ɑ濯撮柦妯侯槸閹偤姊洪崫銉バｉ柛鏃�顨婂畷姘跺箳濡わ拷缁犵粯鎱ㄩ悷鐗堢カ闁归鍏樺畷鎺楁倷鐎涙ɑ鐝栭梻浣侯焾閺堫剛绮欓幋锔芥櫢闁芥ê顦伴崑銉╂煛鐏炶濮傜�殿噮鍓熷畷褰掝敊鐟欏嫬鐦遍梻鍌欑劍濡炲潡宕㈡總鏉嗗洭鎮界粙鑳憰闂侀潧艌閺呮粓宕戦崱娑欑厱閻忕偛澧介埥澶嬨亜韫囥儲瀚�?" );
			fire.pb.talk.MessageMgr.sendMsgNotify( roleid, 141711, null );
			return false;
		}
		if ( conf.exeIndo.hasOtherLimit == 1 ) {
			final SSpecialScenarioQuestConfig sconf = conf.getSpecialScenarioQuestConfig();
			if ( sconf == null )
				return false;
			if ( sconf.缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簻椤掋垺銇勯幇顏嗙煓闁哄被鍔戦幃銏ゅ传閸曟垯鍨婚惀顏堝箲閹伴潧娈銈庡幖濞硷繝骞婂鍫燁棃婵炴垶顭勯弴銏♀拺閺夌偞澹嗛ˇ锔姐亜閹存繃鍠樻鐐差樀楠炴牗鎷呴崫銉ф綁闂備礁澹婇崑鍛崲閸曨垱鍋╅柛婵嗗閺�浠嬪箳閹惰棄纾归柡鍥ュ灩閻ゎ喖霉閻撳海鎽犻柛搴㈩殕缁绘盯宕卞Ο璇查瀺闂佺粯鎸哥换姗�寮诲☉銏犵叀闁糕剝顨呯粻娲煟鎼淬垻鍟查柟鍑ゆ嫹2 == 2 ) {
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬪銈冨灪閻熲晠骞冮埄鍐╁劅妞ゆ梹鍨濆锔剧磽閸屾艾锟芥悂宕愭搴㈩偨闁靛牆顦粻顖炴煟閹达絽袚闁绘挻娲熼弻锟犲炊閵夈儱顬堥梺璇查獜缁绘繈寮婚敐澶婄閻犺櫣鍎ら悘鍫ユ⒑閸濆嫮鐏遍柛鐘虫崌閺佹捇鎮剧仦鐐瘓闂佸搫鎳撶亸娆徫ｉ幇鐗堟優妞ゆ劗濮崇花濠氭椤愩垺澶勯柟鍝ュ亾閺呰泛鈽夐姀锛勫幈婵犵數濮撮幊搴ㄦ偂閹邦喚纾肩紓浣诡焽濞插瓨顨ラ悙宸剰闁宠姘︾粻娑㈠即濮樿鲸锛忛梻鍌氬�烽懗鍫曗�﹂崼銉︽櫇闁挎洖鍊搁弸浣糕攽閻樺疇澹橀柦鍐枑缁绘盯骞嬪▎蹇曚痪闂佸搫鎳忕划鎾诲箖瑜版帒鐐婇柕濞垮劤缁侀绱撴担鍝勑㈢紓宥咃躬瀵鈽夐姀鈥充簻闂備礁鐏濋鍛村汲閸垻纾藉ù锝堟鐢稓绱掔拠鑼ⅵ鐎规洖鎼埥澶愬閳╁啯顏熼梻浣藉Г閿氭い锔跨矙瀹曘儳锟斤綆鍠楅悡鏇㈡煃閳轰礁鏋ゆ繛鍫涘灩闇夌痪顓㈡敱鐎氾拷
				final int fightpetkey =
					xtable.Properties.selectFightpetkey( roleid );
				fire.pb.pet.PetColumn pc = new fire.pb.pet.PetColumn( roleid, 
						fire.pb.pet.PetColumnTypes.PET, true );
				xbean.PetInfo pi = pc.getPetInfo( fightpetkey );
				if ( pi == null || 
						(sconf.activeparams != null && 
						!sconf.activeparams.contains( pi.getId() ) ) ) {
					fire.pb.talk.MessageMgr.sendMsgNotify( roleid, sconf.emsg, conf.exeIndo.npcID, null );
					return false;
				}
			}
		}
		return true;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805452;

	public int getType() {
		return 805452;
	}

	public int missionid; // 任务id
	public long npckey; // npc的key
	public int activetype; // 激活类型:0进入AI战斗,1观看战斗录像

	public CActiveMissionAIBattle() {
	}

	public CActiveMissionAIBattle(int _missionid_, long _npckey_, int _activetype_) {
		this.missionid = _missionid_;
		this.npckey = _npckey_;
		this.activetype = _activetype_;
	}

	public final boolean _validator_() {
		if (missionid < 1001 || missionid >  999999) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(missionid);
		_os_.marshal(npckey);
		_os_.marshal(activetype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		missionid = _os_.unmarshal_int();
		npckey = _os_.unmarshal_long();
		activetype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CActiveMissionAIBattle) {
			CActiveMissionAIBattle _o_ = (CActiveMissionAIBattle)_o1_;
			if (missionid != _o_.missionid) return false;
			if (npckey != _o_.npckey) return false;
			if (activetype != _o_.activetype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += missionid;
		_h_ += (int)npckey;
		_h_ += activetype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(missionid).append(",");
		_sb_.append(npckey).append(",");
		_sb_.append(activetype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CActiveMissionAIBattle _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = missionid - _o_.missionid;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		_c_ = activetype - _o_.activetype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

