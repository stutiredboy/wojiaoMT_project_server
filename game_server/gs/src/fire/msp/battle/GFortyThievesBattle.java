
package fire.msp.battle;

import fire.pb.scene.MonsterInfo;
import fire.pb.scene.SceneClient;
import fire.pb.scene.manager.SceneNpcManager;
import fire.pb.scene.movable.NPC;
import fire.pb.scene.movable.SceneTeam;
import fire.pb.scene.sPos.GridPos;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GFortyThievesBattle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GFortyThievesBattle extends __GFortyThievesBattle__ {
	@Override
	protected void process() {
		// protocol handle
		fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		if(null == role) return;
		SceneTeam team = role.getTeam();
		NPC npc =SceneNpcManager.getInstance().getNpcByKey(npckey);
		if(team == null)
		{
			//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃缂侇噮鍨抽幑銏犫槈閵忕姷顓洪梺缁樺姇閻忔岸宕宠缁辨挻鎷呯粙娆炬殺闂佺顑冮崐婵嗩嚕鐠囨祴妲堥柕蹇曞閵婏负浜滈柡鍐ㄥ�哥敮鑸点亜椤愮喐娅囩紒杈ㄦ尰缁楃喐绻濋崘顭戜紦闂傚倷绀佹竟濠囧磻閸℃稑绐楅柟鎹愭硾婵剟鏌ㄩ悢鍓佺煓婵﹤顭峰畷鎺戭潩閸楃儐鏉哥紓鍌欑椤戝棛鏁敓鐘叉瀬鐎广儱顦猾宥夋煕椤愩倕鏋旈柛姗�绠栧娲传閸曞灚歇濠电偛顦板ú妯肩矉閹烘顫呴柕鍫濇閸橆亪姊虹化鏇炲⒉闁挎氨绱掑Δ浣哥瑲闁靛洤瀚伴、鏇㈡晲閸モ晝鏉介梻浣筋嚃閸犳鎮烽埡鍛拷浣肝旈崨顔芥婵炲濮撮鎰板极閸岀偞鐓犻柛婵勫劜閺嗏晝绱掗埥鍛濠电姷鏁搁崑娑㈡偋閸℃稒鍊舵繝闈涱儏閸戠姵绻涢幋娆忕仾闁绘挶鍎甸弻锟犲炊椤浜弫鎾绘嚍閵壯呯暫婵烇絽娲ら敃顏勭暦婵傜鍗抽柣鎰問閸熷洤鈹戦悙鑸靛涧缂佽弓绮欓獮妤�顭ㄩ崼鐔蜂患濠电偛妯婃禍婵嬪煕閹达附鈷掗柛顐ゅ枔閵嗘帞绱掗悩闈涗槐闁哄本绋掔换婵嬪礃閳哄喚妲剁紓鍌欑贰閸犳牠鎮ч幘宕囨殾闁绘挸瀵掗悢鍡樼節闂堟稒顥犵紒澶嬫そ閺屸剝鎷呴悷鏉款潚閻庤娲滈崰鏍�佸璺哄窛妞ゆ挾鍊ｉ妶鍛斀闁绘灏欏Λ鍕煏閸繈顎楁繛鍫熺箞濮婃椽鎮烽弶鎸庮唨闂佺懓鍤栭幏锟�
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 141485, npc.getNpcID(), null);
			return;
		}
		//if(team.getNormalTeamMemebers().size()<2)
		if(team.size() < 2)
		{
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ锟藉鍝勑ч崶褝鎷烽妶澶婄獥闁哄稁鍘界粻鎺楁⒒娴ｄ警鐒剧紒缁樺姍瀹曘儳锟斤綆鍓涚粈濠囨煙鐎电啸缁炬儳銈搁弻鐔兼焽閿曪拷瀵偓绻涢崼鐕傝�块柡灞诲姂閹垻绱掑鍡橆棄缂傚倷鑳舵慨瀵哥矓閻熸壆鏆﹂柡鍥ュ灩绾拷闂佽绻掔划顖氼渻娴犲鏋侀柛鎰靛枛绾惧ジ鏌ㄩ弬鍨挃闁崇鍊濆缁樻媴閸涘﹥鍎撳┑鐐茬湴閸ㄨ棄鐣烽悷鎳婃椽顢旈崨顓濈暗闂備胶绮弻銊╁触鐎ｎ喗鍋傛繛鍡樻尰閳锋垶銇勯幘鍗炲闁伙絽宕…鑳槻妞ゎ厾鍏樺璇测槈閵忕姈褔鏌涢妷鎴濆閿熶粙绠栧娲濞戞瑦鎮欓柣搴㈢煯閸楀啿鐣峰ú顏呮櫢闁绘灏欓敍婊冣攽閻樿宸ラ柛鐕佸亞缁辨帡鍩￠崨顔规嫽婵炶揪绲介幉锟犲箚閸儲鐓熸い鎾跺剱濡茶櫣绱掓潏鈺佷沪缂佹鍠栭弫鎾寸鐎ｎ偄浠掑銈嗘⒐閹锋繈骞忛悜鑺ユ櫜閹肩补鍓濋悘宥夋⒑缁嬪尅鍔熼柛蹇旓耿瀵鈽夐姀鐘靛姶闂佺绻掓刊顓熺椤忓牆绠栨慨妤嬫嫹濠碉紕鍏橀崺锟犲磼濠婂啫绗氱紓鍌氬�搁崐鐑芥倿閿曚焦鎳岄柣搴ゎ潐濞叉牠鎯夋總鍛婃櫢闁稿﹦鍣ュ鎰箾閸欏澧靛┑鈥冲缁瑥鈻庨幆褎顓块梻浣告贡閾忓酣宕板Δ鍛；闁告洦鍨遍悡鏇㈡煙鐎涙鎳冮柨鐔诲Г閻楁粓鏁撻懞銉ㄥ缂傚秴锕璇测槈閵忊晜鏅濋梺鎸庣箓濡盯藝椤撱垺鈷戦柛娑橈功閹冲嫰鏌熼悷鐗堝枠鐎殿喛顕ч埥澶愬閻樻牓鍔戦弻銊モ攽閸℃ê娅ｅ銈庡墮椤︾敻寮婚敐鍫㈢杸闁规儳澧庨濠囨⒑鏉炴壆顦﹂柟鑺ョ矊鍗遍柟鐗堟緲缁犺櫕淇婇妶鍕槮濞存粌銈稿娲川婵犱胶绻侀梺鎼炲姂娴滆泛鐣烽幋锝庢Ь缂備浇椴搁幐濠氬箯閸涱喚顩烽悗锝庝簼閹虫瑩姊哄Ч鍥х労闁搞劎鏅幑銏犫攽鐎ｎ亜鐎俊銈忕到閸燁垶寮插┑瀣厱閻忕偟鍋撻惃鎴炪亜閺傚尅韬慨濠冩そ瀹曠兘顢橀悙鏉款棜闂備礁鎲￠幐鑽ゅ枈瀹ュ浄鎷烽棃娑栧仮闁轰焦鎹囬弫鎾绘晸閿燂拷3婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐鍛傜喎鈻庨幆褎顔勭紓鍌欒兌婵挳鎮樺璺何﹂柛鏇ㄥ枤閻わ拷闂佽宕樺▔娑€�傞搹鍦＝濞达絽鎼宀勬煕閵娿儳鍩ｇ�殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 141485, npc.getNpcID(),null);
			return;
		}
		
	
		
		MonsterInfo monsterInfo = npc.getScene().getMapInfo().getMonsterInfo();	
		if(monsterInfo == null)
			return;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬姘卞缂傚倸鍟ú鐔奉潖缂佹ɑ濯撮柛娑橈攻閸庢挸鈹戦悙鑼勾闁搞劏妫勯悾鐤亹閹烘垶宓嶅銈嗘尵婵磭绮径鎰厽闁绘柨鎽滈幊鍐倵濮樸儱濡界紒鍌氱Т椤劑宕奸悢鍝勫箥闂備礁鎼ˇ鍐测枖閺囥垹鏄ラ柨婵嗘缁诲棛绱撴担闈涚仼婵炲懎绉归弻锛勪沪閸撗侊拷鎺楁煥閻斿憡鐏紓宥呮缁傚秴顭ㄩ崼鐔告闂佽姤锚椤︽壆鎷归敓鐘崇厵妤犵偛鐏濋悘鈺呮煃閽樺妯�濠殿噯鎷烽梺缁橆焾鐏忣亪鏁撻挊澶屼虎闁宠鍨块崺銉╁幢濡ゅ啩娣俊鐐�栧▔锕傚川椤撶喓锟芥娊鎮楅獮鍨姎闁瑰啿顦靛銊╂嚍閵夛絼绨婚梺鍝勫暙閸婂憡绂嶆ィ鍐╃厱闁靛牆绻戠�氬綊姊虹拠鎻掝劉妞ゆ梹鐗犲畷鏉库槈閵忕姵妲梺鍝勭▉閸嬪棝鎯屽璺虹骇闁割偅绋戞俊璺ㄧ磼閳藉懏瀚归梻鍌欑劍閹爼宕曞ú顏呭�舵繛鎴炵矤濡嫰姊洪崫鍕拱缂佸鍨块崺銉﹀緞閹邦剛顢呴梺缁樺姇椤曨厽绂嶉鍛瘈闁汇垽娼ф禒婊堟煙閸愯尙鐒哥�规洘鍔曡灃闁告劏鏅╁鐔兼⒑鐟欏嫬鍔ら柣掳鍔嶉崚濠囧级閹搭厽瀵岄柣搴秵娴滄繈宕径宀�纾奸柟閭﹀弾濞堟粍鎱ㄦ繝鍛仩缂侇喗鐟ラ埢搴ㄥ箚瑜嶆竟鍫ユ⒒娴ｇ懓顕滄繛璇ч檮缁傚秴顭ㄩ崼顐ｆ櫔闂佹寧绻傚Λ娑氬姬閿熻棄鈹戦鏂や緵闁告ê鍚嬬粋宥咁煥閸涱垳锛滈梺缁樺姦閸撴瑩顢撳鍐炬富閻庢稒蓱閸婃劗锟芥鍠楅悡鈩冩叏閿熶粙鏌ㄥ☉妯侯伀闁伙箑鐗撳娲濞戙垻宕紓浣瑰絻婢ц棄鈽夐悽鍛婂�锋い鎴濆綖缁ㄥ姊洪幐搴㈢闁稿﹦鍏橀獮澶嬨偅閸愨晝鍘甸梺鎯ф禋閸嬫帒鈻撳鍫熺厵妞ゆ梻鏅惌濠囨懚閿濆鐓犳繛鏉戭儐濞呮捇鏌涢悢鐑藉弰婵﹦绮幏鍛存偡闁箑娈濈紓鍌欐祰椤曆囧磹閸ф宓佸┑鐘叉噽閻わ拷濠电偞鍨堕…鍥敊閹扮増鈷戦悷娆忓椤ュ顭胯椤ㄥ﹪骞冮敓鐘参ㄩ柍鍝勫�婚崢鎼佹⒑閹肩偛鍔橀柛搴ら哺娣囧﹤煤椤忓應鎷哄銈嗘寙閸愵亙妗撻梻浣告惈閻寰婃禒瀣叀濠㈣埖鍔曠涵锟介梺缁樺姇椤曨厽绂嶉崜浣虹＝闁稿本鐟ч崝宥嗐亜閵娿儳澧︾�规洑鍗冲浠嬵敇閻愬锟筋剟姊虹憴鍕姢妞ゆ洦鍙冮妴鍛存倻閼恒儱锟界敻鏌ㄥ┑鍡樻崳闁告ɑ绮撻弻鐔兼倻閼恒儲鏆犻梺鐟板槻閹虫劙宕犻弽顓炲嵆闁绘洑鐒︾紞灞解攽閻樻鏆俊鎻掓嚇瀹曞綊宕奸弴鐐靛摋闂備緡鍓欑粔鐢稿磹闂堟稈鏀介柣妯虹－椤ｆ煡鏌嶉柨瀣伌闁哄本鐩弫鍌滄嫚閹绘帞顔愰梻浣告啞閺屻劑顢栭崱妯尖攳濠电姴娴傞弫鍐煏韫囧鐏い鏂挎喘閺屾稑螖閸涱剚鍠氶梺鍝勬湰閻╊垶寮崒婊勫珰闁圭粯甯為鎺旂磽娴ｇ懓鍔ょ憸鎵仧閸掓帒鈻庨幘瀹犳憰濠电偞鍨堕惌顔尖柦椤忓牊鐓曢柟鐐殔鐎氼剙鈻嶅Ο鑲╃＝闁稿本鐟ч崝宥囩磼鐎ｎ偄鐏╅柟骞垮灩椤粓鏁撻挊澶樺殨濠电姵纰嶉崑鍕煟閹捐櫕鎹ｆい锔规櫊濮婃椽妫冨☉姘暫濠碘槅鍋呴〃濠囥�侀弮鍫熸櫢闁跨噦鎷�?
		
		GridPos pos = npc.getPos().toGridPos();
		int areaconf = monsterInfo.getMonsterConfig(pos.getX(), pos.getY());
		if(areaconf == 0)
			return;//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃缂侇噮鍨抽幑銏犫槈閵忕姷顓洪梺缁樺姇閻忔岸宕宠缁辨挻鎷呯粙娆炬殺闂佺顑冮崐婵嗩嚕鐠囨祴妲堥柕蹇曞閵婏负浜滈柡鍐ㄥ�哥敮鑸点亜椤愮喐娅囩紒杈ㄦ尰缁楃喐绻濋崘顭戜紦闂傚倷绀佹竟濠囧磻閸℃稑绐楅柟鎹愭硾婵剟鏌ㄩ悢鍓佺煓婵﹤顭峰畷鎺戭潩閸楃儐鏉哥紓鍌欑椤戝棛鏁敓鐘叉瀬鐎广儱顦猾宥夋煕椤愩倕鏋旈柛姗�绠栧娲传閸曞灚歇濠电偛顦板ú妯肩矉閹烘顫呴柕鍫濇閸橆亪姊虹化鏇炲⒉闁挎氨绱掑Δ浣哥瑲闁靛洤瀚伴、鏇㈡晲閸モ晝鏉介梻浣筋嚃閸犳鎮烽埡鍛拷浣肝旈崨顔芥婵炲濮撮鎰板极閸岀偞鐓曟い鎰剁稻缁�鍐煟閹捐泛鏋涙鐐寸墪鑿愭い鎺炴嫹闁绘帗妞介弻娑㈡偄妞嬪海顔掗梺鍝勬湰閻╊垶骞冮埡浣烘殾闁搞儜锟介幏浼存煟鎼淬値娼愭繛璇х畵瀹曞綊宕奸弴鐐电枃濠德板�曢幏瀣极瀹ュ棛绡�濠电姴绻戠�氬湱绱撴担闈涘闁稿繑锚椤繑绻濆顒傦紲濠电偛妫欓崺鍫澪ｉ锟藉铏规喆閸曨厹鍋為梺鍛婃尰缁诲嫮鍒掗銏″亜闁艰尙鍎ゅΛ鍐ㄧ暦閵娾晩鏁囬柣姗�娼ч悙濠傗攽閻樻剚鍟忛柛鐘愁殜閳ワ箓宕煎┑鍐╃亙濠电偞鍨惰摫缂佺虎鍨伴埞鎴︽晬閸曨偂鏉梺绋匡攻閻楃姴鐣峰┑濠庢▌濠殿喖锕ｇ划娆忕暦閻旂⒈鏁嶆慨妯哄船楠炲牓姊绘担渚敯闁规椿浜浠嬪礋椤栨稑浜楅梺鍝勬川閸犳挾绮绘ィ鍐╃厵閻庣數顭堥崜鎶芥煕韫囷絽澧撮柡灞剧洴瀵噣宕掑顓狅拷璇差渻閵堝骸寮ㄩ柛搴☆煼绡撳ù锝堫嚉閻熼偊鐓ラ幖瀛樼箞閸嬫鎮楀▓鍨灈妞ゎ厾鍏橀獮鍐閵堝懍绱堕梺鍛婃处閸撴盯鏁撻懞銉モ枙婵﹥妞藉畷銊︾節鎼淬垻鏆梻浣侯焾椤戝棝鏁冮姀鐘垫殾闁绘鐗忕弧锟介梺鎼炲劘閸斿骞忓ú顏呯厽闁绘ê寮剁粈宀勬煥閻斿嚖鎷烽悢鍝ュ涧闂佽楠忛幏鐑芥⒒閸屾瑦绁版繛澶嬫礋瀹曚即寮撮悢绋垮伎闂侀潧鐗嗛ˇ顖炲礄閻樻祴鏀介柛灞剧矤閻掗箖鏌涢幋鐘测枅妤犵偞鐗曡彁妞ゆ帪鎷峰┑鈥茬矙閺岋綁骞樼�靛憡鍣伴梺鍝勭灱閸犳牠銆佸☉銏犲耿婵°倕瀚顓炩攽閻愯尙澧曢柣鏍帶椤繐煤椤忓嫬绐涙繝鐢靛仦绾板秹宕归崹顔炬殾婵犻潧妫岄弸搴ㄦ煙閹咃紞闁伙絽鎼埞鎴炲箠闁稿﹥娲熼獮濠囧箛椤掑倹娈兼繛鎾寸啲閹风兘鏌＄仦鍓ф创闁炽儻绠撻獮瀣攽閸モ晙閭繝鐢靛У椤旀牠宕伴弽顭戞闁归棿绀侀悡姗�鏌熸潏楣冩闁稿﹦鍏橀弻銈囧枈閸楃偛顫梺鍛婃礋缁犳牕顫忓ú顏勫窛濠电姴鍟犻幏褰掓⒑閹肩偛濡块柡浣割煼閵嗕礁顫濋懜鍨珳婵犮垼娉涢敃锕傤敊閹邦厾绠鹃弶鍫濆⒔缁夘剚銇勯銏╂Ц闁宠绉规慨锟介柕鍫濇閹锋椽鏌ｉ悩鍏呰埅闁告柨鑻埢宥夊箛閻楀牏鍘甸梺鍛婂灟閸婃牜锟芥熬鎷�
		
		
		SceneClient.pSend(new MFortyThievesBattle(roleid, npckey,areaconf));
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 727898;

	public int getType() {
		return 727898;
	}

	public long roleid;
	public long npckey; // 四十大盗的npckey

	public GFortyThievesBattle() {
	}

	public GFortyThievesBattle(long _roleid_, long _npckey_) {
		this.roleid = _roleid_;
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GFortyThievesBattle) {
			GFortyThievesBattle _o_ = (GFortyThievesBattle)_o1_;
			if (roleid != _o_.roleid) return false;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GFortyThievesBattle _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

