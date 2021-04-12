
package fire.msp;


import fire.pb.scene.SceneClient;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.God;
import fire.pb.scene.movable.Role;
import fire.pb.scene.movable.SceneTeam;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GEnterWorld__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GEnterWorld extends __GEnterWorld__ {
	@Override
	protected void process() {
		
		Role role = RoleManager.getInstance().getRoleByID(roleid);
		if(null == role)
		{
			role = God.createRole(roleid, rolename, level, schoolid, mapinfo, laststaticmapinfo, 0 != protect, 0, 0);
			if (null == role)
				return;

			role.init(showpet);
			role.init(mode);
			role.init(title);
			role.init(components);
			role.setSceneState(scenestate);
			role.setLastStaticMapInfo(laststaticmapinfo);
			role.setMaxShowNum(this.showrolenum);
			role.setEquipEffect(equipeffect);
		}
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚归柛婵勫劤娑撳秹鏌″搴″箺闁绘挻娲橀妵鍕箛閸撲胶蓱缂備緤鎷烽柨鐔烘櫕缁辨帡鎮欓锟介崝銈嗙箾绾绡�鐎殿喗妲掗ˇ鍓佺磼閻樺磭娲撮柡浣瑰姍瀹曘劑顢楅崒姘瘓闂傚倸鍊风粈渚�骞夐敓鐘冲仭闁靛／鍕簥濠碘槅鍨拃锕�顭囬弽褉鏀介柣妯虹枃婢规﹢姊洪崡鐐村枠闁哄矉缍佸顒勫垂椤斿彨鈺呮⒑閸濆嫷鍎愰柣鐔叉櫅椤繐煤椤忓嫮顦ч梺绋跨箺閸嬫劙宕欓敓鐘斥拺閻犲洩灏欑粻鑼磼鐠囪尙澧曢柨鏇樺灪缁楃喖鏁撻挊澶樻綎婵炲樊浜滅粻浼村箹鏉堝墽鎮奸柣锝囨暬濮婅櫣绱掑鍡樼暥闂佹寧娲︽禍顏堝Υ娓氾拷瀵噣宕奸悢铚傛睏缂傚倸鍊烽悞锕傗�﹂崶顒�鍌ㄩ柦妯侯樈濞撳鏌曢崼婵囶棡閻忓繒鏁婚弻娑欐償閵忕姴顫岄柧浼欑秮閺屻劑鎮㈤崜浣虹厯濠殿喖锕ュ钘夌暦椤愶箑绀嬫い鏇炴噺閽戝姊绘担渚劸闁挎洏鍎甸幃褔鎮╅懡銈呯ウ闂佸壊鍋侀崕杈ㄥ劔闂備礁鐤囧銊╂嚄閸洘鍋柨鐔诲Г娣囧﹪鎮欓鍕舵嫹閺嶎偅鏆滈柟鐑橆殕閺呮繈鏌曟竟顖氱У鐎氳鎱ㄥ鍡楀缂佸妞介弻鈥崇暆鐎ｎ剛鐦堥悗瑙勬礀閻栧ジ宕洪埄鍐╁闂佸灝顑囧鏍⒒閸屾瑧顦﹂柟纰卞亰椤㈡牠宕卞銏＄洴瀹曟﹢顢欓懝鐗堟啺闂備焦瀵х换鍌炲箟濮楋拷閹垽宕楅悡搴㈢暟闂備礁鐤囧銊╂嚄閸洦鏁冨┑鍌氭啞閳锋帒霉閿濆牊顏犻悽顖涚洴閺岀喓绮欏▎鍓у悑闂佽鍠氶崗姗�宕洪敓鐘插窛妞ゆ挴鍓濋幉鐗堢節閻㈤潧浠﹂柛銊у枛楠炲﹪宕堕浣规闂佸搫鍊堕崐妤呮偩閸偒娈介柣鎰▕閸庡繘鏌嶇憴鍕伌鐎规洏鍔戝鍓佹崉閵娿儱啸闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽銊х煁闁哄棙绮撻弻锝夊棘閹稿骸鏆堥梺鍛婄懃缁绘﹢寮婚弴銏犻唶婵犲灚鍔栫瑧濠碘剝顨呴幊妯侯潖濞差亜宸濆┑鐘插暙椤︹晠姊洪幖鐐插濠㈢懓妫涢崚鎺旂磼濡偐鐦堝┑顔斤供閸樺ジ鏁撻挊澶屼粵缂佺粯鐩獮瀣倻閸℃洜妫俊鐐�曠换鎰版偋婵犲洤鐤鹃柟闂寸劍閻撶娀鏌熼鐔风瑨闁告梹鑹鹃埞鎴︻敊閼测敩褔鏌＄仦闈╂嫹瀹曞洦娈曢梺璺ㄥ枍缁瑥鐣锋导鏉戝唨妞ゆ挻绮ｉ幏閿嬫媴缁洘顫嶅┑顔筋殔濡瑩宕撻棃娑辨富闁靛牆妫楃粭鍌炴煟閹虹偟鐣垫い銏＄懇楠炴帒螖娴ｅ搫骞楅梺鐟板悑閻ｎ亪宕愰妶鍜佺劷闁归偊鍘剧粻楣冩煕濞嗗浚妲洪柣顓熷笧閿熷�燁潐濞叉垿宕￠崘宸殨濞寸姴顑愰弫鍥ㄧ節婵犲啫濮堥悗姘辨嚀闇夐柨婵嗙墕閿熸垝绮欏顕�宕煎┑鍡欑崺婵＄偑鍊栧Λ浣规叏閵堝鏁傞柣鏂跨殱閺�浠嬫煟閹邦剚鈻曢柛銈囧枎閳规垿顢欓懞銉ュ攭濡炪們鍨洪悧鐘茬暦閵娾晩鏁嶆繝濠傛噽閸斿爼姊绘担绋款棌闁稿鎳愬▎銏ゆ偪椤栨ü姹楅梺鍦劋閹稿憡绂嶅Δ鍛厵闁煎湱澧楄ぐ褏绱掗弻銉х暫妤犵偛顦扮缓浠嬪川婵炵偓瀚肩紓鍌氬�烽悞锕佹懌闁诲繐绻掓晶妤冩崲濞戙垺鍤戞い鎺炴嫹闁哄绋撻敓鑺ヮ問閸犳牠鈥﹂柨瀣╃箚闁归棿绀侀悡娑㈡煕鐏炲墽鐓紒銊ょ矙濮婄粯鎷呮笟顖滃姼闂佸搫鐗滈崜娑氬垝濞嗘挸绠ｉ柨鏃傜帛閺呮粓姊虹捄銊ユ珢闁瑰嚖鎷�?,婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹤顕ｆ繝姘亜闁稿繐鐨烽幏濠氭煟鎼达絾鏆╂い顓炵墛娣囧﹥绂掔�ｎ偀鎷洪梺鍛婄箓鐎氼參宕抽搹鍦＜閻犲洩灏欐晶锔撅拷娈垮枛椤攱淇婇幖浣哥厸濞达絿顭堢粊顕�姊绘担铏瑰笡闁告梹锕㈤、姘煥閸繄顔嗛梺缁樺灱濡嫮绮婚悷鎳婂綊鏁愰崱娆愭啓閻炴碍绻堥弻锝夋偄閸濄儳鐓傛繝鈷�鍕垫畼闁轰緡鍣ｉ獮鎺楀籍閸屾瑧鐟濋梺鑽ゅ枑閻熴儳锟芥凹鍠氱划缁樸偅閸愨晝鍙嗗┑鐘绘涧濡繈顢撳Δ锟介…鑳檨闁哥姵鐗犻崺鐐哄箣閿旂瓔锟芥劙姊虹粙娆惧剱闁告梹顨呭嵄闁圭増婢樼粻铏繆閵堝拑鏀婚柡鍛箞濮婃椽妫冨☉姘辩暰闂佸湱顒茬紞锟芥い锕�缍婇弻鈥崇暆閿熶粙宕伴弽顓滐拷浣糕枎閹炬潙娈愰梺鍐叉惈閸烆參濡搁埡鍌氾拷鐢告偡濞嗗繐顏璺哄閺屾稓锟斤綆浜峰銉╂煟閿濆洤鍘撮柟顔哄灮閸犲﹥娼忛妸锔界彍婵犵數鍋犻幓顏嗗緤閸фせ锟斤箓宕奸悢铏瑰骄閻庡箍鍎遍ˇ浼村煕閹烘嚚褰掓晲閸涱喛纭�濠电媴鎷峰ù鐘差儐閻撴洟鏌嶆潪鎵槮妞ゅ浚鍘鹃敓鍊燁潐濞叉牜绱炴繝鍥ワ拷浣肝旈崨顓狀槹濡炪倖鍔戦崐褏妲愰悽鍛娾拻濞达綀妫勬禍褰掓煃瀹勬壆澧︾�规洘绮岄～婵嬵敆閸屾稒顔曢梻浣告啞閻熴儵藝鏉堚晝涓嶅Δ锝呭暞閻撴瑩鎮楀☉娆樼劷闁瑰啿鍟撮弻锝堢疀婵犲啯鐝栫紓浣介哺鐢繝骞冮埡渚囧晠妞ゆ梹鍎抽幃鎴︽⒒娴ｅ憡鎯堥柣顐ｇ懇瀹曞崬鈻庨幋鐐寸帆闂傚倷鐒︾�笛呮崲閸岀偛绠犵�广儱娲╂慨鎶芥偣閸ャ劎銈撮柡锟芥禒瀣厽闁归偊鍓欑痪褔鏌涢悢绋垮摵闁哄本鐩俊鐑芥晲閸涱厙銊╂⒑瑜版帗鏁辨俊鐐扮矙瀵鏁愭径瀣汗闂佸憡鐟ラˇ閬嵥囬柆宥嗏拺閻犳亽鍔岄弸搴ㄦ煥閻旂儤娅曢柛鐘冲姍閹敻顢旈崼鐔哄幗闂婎偄娲﹂幐鐐櫠閿旇姤鍙忓┑鐘插暞閵囨繃顨ラ悙鏉戝闁诡垱妫冩慨锟芥い顐枤閸犳﹢姊婚崒娆掑厡妞ゎ厼鐗婇〃銉╁传閵夈儺妫滃銈嗘尪閸ㄥ湱绮堥崱娑欑厵闁绘垶锚閻忓秹鏌＄�ｎ亪鍙勯柡宀�鍠栭獮鍡氼槾闁圭晫濮电换娑㈠川椤愩垻浼堝┑顔硷龚濞咃綁骞戦崟顖毼╅柕澶涘瑜版岸姊绘担鐑樺殌闁搞倖鐗犻獮蹇涙晸閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹤顕ｆ繝姘亜闁稿繐鐨烽幏濠氭煟鎼达紕浠涢柣鈩冩礈缁絽螖閸涱喒鎷洪柡澶屽仦婢瑰棝藝閿曞倹鍊垫慨姗嗗亜瀹撳棛锟芥鍠涢褔鍩ユ径鎰潊闁冲搫鍊瑰▍鍥⒒娴ｈ櫣甯涢拑杈╂喐閺夊灝鏆為柟渚垮妽閹棃鏁愰崶鈺嬬闯濠电偞鎸婚懝楣冩晝閵壯嶆嫹濮橆剛绉烘慨濠呮缁瑩骞愭惔銏″缂傚倷绀侀鍡欐暜閳ュ磭鏆﹂柨婵嗙墢閻わ拷闂佸搫鍊告晶鐣岀不濮樿埖鈷戦梻鍫熺〒婢ф洟鏌熷畡閭﹀剶鐎规洘娲熼獮鍥偋閸繐鎷烽崹顐ｅ弿婵妫楁晶鎵磼婢跺苯鍔嬮柟渚垮妽缁绘繈宕ㄩ鍛摋闂備礁缍婇ˉ鎾寸箾閿熶粙鏌涢妸锕�鍔ら柣锝囧厴瀹曞爼鏁冮敓浠嬪箺鐎ｎ亖鏀介柣妯虹仛閺嗏晠鏌涚�ｎ偆娲撮柟顖氭处鐎靛ジ寮堕幋鐙�妲烽梻浣侯攰閹活亞绮婚幋锕�鍑犲〒姘炬嫹闁哄瞼鍠栭獮鎴﹀箛闂堟稒顔勬繝纰樻閸嬪懘鏁冮姀銈呰摕闁哄洢鍨归柋鍥ㄧ節闂堟稒鎼愮紒鎰洴閺屸�愁吋韫囨洜鐦堝┑顔硷功缁垶骞忛崨鏉戝窛濠电姴鍊瑰▓姗�姊绘担钘夊惞闁哥姴妫濆畷鏇㈠蓟閵夛綇鎷烽崘顔嘉ㄩ柍杞拌兌椤旀劖绻涙潏鍓хК妞ゆ洘绮撻獮蹇涙倻閼恒儲娅囬梺绋挎湰濮樸劑宕愰悙鐑樺仭婵犲﹤鍟扮粻鑽わ拷娈垮枟婵炲﹤鐣烽崡鐐╂婵炲棙鍨甸獮鍫ユ⒒娴ｅ憡鎯堟繛灞傚灲瀹曟繄浠﹂悙顒佺彿婵炲鍘ч悺銊╂偂閺囩喍绻嗘い鏍ㄧ鐠愶繝鏌ｉ鐔烘噭闁逛究鍔嶇换婵嬪礃閳瑰じ铏庢繝纰樻閸嬪嫰宕锕�鐓″璺侯儐缂嶅洭鏌嶆潪鎵槮濮濆洭姊婚崒姘拷鐑芥嚄閸洍锟斤箓宕奸妷锔惧帎闂佹寧绻傚Λ娑€�呴弻銉︾厱妞ゆ劧绲剧壕鎼佹煥閻旂鐏婄紒鑸佃壘椤曪綁顢氶敓钘夌暦婵傚壊鏁冮柨婵嗘閻濇粍绻濋悽闈涗哗闁规椿浜炲濠冪鐎ｎ亣袝闂佽法鍠撻弲顐ゆ閹烘惟妞ゎ厽鍨靛▓顓烆渻閵堝簼绨婚柛鐔风摠娣囧﹪宕奸弴鐐茶�垮┑掳鍊ч幏椋庢偘閼测晝纾介柛灞捐壘閿熻棄鎽滅划鏃堝级閹宠櫕绋戣灃闁告侗鍘鹃崢娲⒑閸︻厼浜鹃柛鎾村哺閹繝濡烽埡鍌滃幈濡炪倖鍔戦崐鏇㈠几閺冨牊鐓曟俊顖氬悑閺嗏晝绱掓潏銊﹀鞍闁瑰嘲鎳樺畷鐑筋敇瑜忔导鍥ㄤ繆閻愵亜锟姐倝宕戦崟顖�鍥焼瀹ュ棙娅㈤梺鍏间航閸庢娊宕弻銉︾厵闁告垯鍊栫�氾拷?
		role.clearISee();
		
		role.enterScene();
		SceneTeam team = role.getTeam();
		if(team!=null)
			team.sendTeamInfoToRole(role);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬姘卞闂佹眹鍨归…宄邦潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙鎻掔骇闁绘濮撮悾鐑藉箛閺夎法顔愭繛杈剧悼椤牓鎮楅銏♀拺缂佸娉曢悘閬嶆煕鐎ｎ剙浠遍柟顕嗙節婵＄兘鍩￠崒婊冨箺闂備礁鎼ú銊╁磻濞戙垺鏅搁柦妯侯槹鐠愶繝鏌ㄩ悢璇残撻柣鏃戝墴楠炲繘鏁撻敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ銈囩磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿京纾藉ù锝堟鐢盯鏌ｉ埡濠傜仩闁伙絿鍏橀、鏃堝醇濠靛牜妲版俊鐐�曠换鎰板蓟婵犲偆鐓ラ柛顐ゅ暱閹疯櫣绱掔紒銏犲箹闁瑰啿绻橀幃鐢割敂閸℃瑧锛滃銈嗘婵倗浜搁銏＄厽闁挎繂顦伴弫杈╃磼閾忚娅曠紒顔界懇瀹曞綊顢欓懖鈹垮仏闂傚倸鍊烽懗鍓佸垝椤栨娑欐媴閹肩儑鎷烽幒鏇樹汗闁圭儤鎸告禒铏圭磽閸屾瑧鍔嶆い顓炴川瀵囨晸娴犲鈷戞慨鐟版搐閻忓弶绻涙担鍐插椤╅攱绻濇繝鍌氼仹缂佽妫欓妵鍕箛閸撲焦鍋ч梺鐟板暱濞层劑鏁撻崐鐕佹綈婵炲弶顭囬幑銏ゅ醇濠垫劕娈ㄩ梺鍦檸閸犳宕戦幇鐗堢厽闁靛繈鍨洪弳鈺呮煛閸℃劕鍔︽慨濠勭帛閹峰懘宕妷锔撅拷顔尖攽閳╁啨浠犻柛鏂块閳诲酣濮�閵堝棙娅㈤梺缁樏崯鎸庣濠婂牊鈷戠紒顖涙礀婢ц尙绱掔�ｎ偄娴柟顕嗙節閹垽宕楅懖鈺佸箺闂備礁鎼崐鎼佹倶濠靛柈锝夋嚒閵堝洨锛滈梺闈涱焾閸庢椽鎮￠崗闂寸箚妞ゆ劑鍨洪崵鍥ㄣ亜閵忊槅娈曠�垫澘瀚换婵嬪磼濡や礁顏╅梻鍌氬�风粈渚�骞栭锔藉剶濠靛倻顭堢粣妤呮煛瀹ュ骸骞栫紒鐘叉贡閹叉悂鎮ч崼婵呭垔闂佽桨绀侀崯鎾蓟閺囥垹閱囨繝闈涙祩濡偤姊洪幖鐐插濡炴潙鎲＄粚杈ㄧ節閸ャ劌锟介攱銇勮箛鎾愁伒闁归鍏橀獮瀣晝閿熶粙宕归崒鐐寸厱婵犻潧妫楅悵瀣箾閹存瑥鐏╃紒锟介崘顔界厪濠电倯鍐仾妞ゆ梹娲熷缁樻媴閾忕懓绗″┑顔硷工椤兘宕哄☉銏犻唶闁靛鍎查悗顒勬⒑閹肩偛鍔撮柛鎾村哺閹繝鎮㈤梹鎰畾濡炪倖鐗楃换鍐敂閻樿褰掓偐瀹曞洠妾ㄧ紓浣虹帛閻╊垰鐣锋總鍛婂亜闁硅偐鍋橀搹搴㈢節濞堝灝鏋涢柨鏇樺�濋垾锕�鐣￠幍顔芥闂佸湱鍎ら崹鐔煎几鎼淬劍鐓欓悗娑欘焽缁犳挻銇勯锟介ˇ闈涱潖缂佹ɑ濯撮悷娆忓娴犙勭箾鐎涙鐭嬬紒顔兼捣濡叉劙鎮欑�靛摜鐦堥梺绋挎湰缁秴鈻撻幆褉鏀介柣妯肩帛濞懷勪繆椤愶絿娲寸�殿喗濞婂畷鍗炩槈濞嗘垵寮抽梻浣虹帛閺屻劍鏅舵惔銊﹀剹婵炲棙鎸婚悡娑樏归敐鍫綈鐎规洖鐭傞弻鐔风暦閸パ傛婵犵绱曢弻澶惵ㄦ笟锟介弻锟犲幢韫囥儲瀚归柡鍌樺劜閺傦拷闂備胶绮敃鈺呭窗閺嶎厽鍊舵い蹇撶墛閻撱儲鎱ㄥΟ璇叉暰闁圭兘顥撻幉鎾礋椤掞拷绾板秹鏌ｆ惔銏㈩暡婵犮垺锕㈤敐鐐剁疀閹句焦妞介、鏃堝礋椤撗冩暪闂備胶鎳撻崥瀣偩椤忓牆鏄ラ柛鏇ㄥ亽濞兼牠鏌涢…鎴濇灀闁猴拷娴犲鐓冮柦妯侯槹椤ユ粌霉濠婂嫮鐭掗柟顔筋殔椤繈顢曢姀鐘点偖闂備線娼уΛ鏃傜矆娓氾拷閿濈偛鈹戠�ｅ灚鏅ｉ梺缁樻濞咃綀鍊撮梻鍌氬�风粈渚�宕崸妤�绠规い鎰跺瘜閺佸嫰鏌涢埄鍐嚂闁瑰嘲鍢查～婵嬪箛娴ｅ湱绉锋俊鐐�戦崝濠囧磿閻㈢绠栨繛鍡樻尰閸ゆ垶銇勯幋锝呭姷婵＄偓鎮傚缁樻媴閸涘﹤鏆堝┑顔硷功閹虫捇鎮惧┑瀣濞达絽鎽滈悾鍝勨攽鎺抽崐褔骞忛柨瀣ㄤ簻妞ゆ劧绲跨粻鐐存叏婵犲懎鍚归柨鐔剁矙濞佳囧箟閿熺姴鐤惧┑鍌氭啞閳锋帒霉閿濆洤鍔嬮柛銈忔嫹缂傚倷鑳舵慨瀵哥矓閻熸壆鏆︾憸鐗堝笚鐎电姴顭跨捄鐑樻拱婵炲牓绠栧娲川婵犲孩鐣奸梺绋款儐閸旀洖宓勯梺鍓插亞閸犳挾绮绘ィ鍐╃厱闁斥晛鍘鹃鍫熷�堕柕澶涘瘜濞堜粙鏌ｉ幇顖氱毢閺佸牆鈹戦纭峰姛缂侇噮鍨堕獮蹇涘川鐎涙ê娈熼梺闈涳紡娓氬﹥瀚瑰┑鐘叉处閳锋垿姊婚崼姘珖缂佸澧庣槐鎺楁偐閾忣偄纾抽梺缁樹緱閸犳稓绮诲☉妯锋婵炲棙鍔栭鐔兼⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�?
		role.setBattleReplayStateAndBroacast(false);
		RoleManager.getInstance().addRoleToSchool(roleid, schoolid);
		RoleManager.getInstance().addRoleToCamp(roleid, 0);
		SceneClient.pSend(new MEnterScene(roleid,role.getScene().getSceneID(),role.getPos().getX(),role.getPos().getY()));
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 720897;

	public int getType() {
		return 720897;
	}

	public long roleid;
	public int level;
	public java.lang.String rolename;
	public fire.msp.RoleMapInfo mapinfo;
	public fire.msp.RoleMapInfo laststaticmapinfo;
	public int protect;
	public int schoolid;
	public java.util.HashMap<Byte,Integer> components; // 角色换装信息key值参考SpriteComponents的枚举
	public fire.msp.modeinfo mode;
	public fire.msp.showpetinfo showpet;
	public fire.msp.showtitleinfo title;
	public int scenestate;
	public int showrolenum;
	public int equipeffect;

	public GEnterWorld() {
		rolename = "";
		mapinfo = new fire.msp.RoleMapInfo();
		laststaticmapinfo = new fire.msp.RoleMapInfo();
		components = new java.util.HashMap<Byte,Integer>();
		mode = new fire.msp.modeinfo();
		showpet = new fire.msp.showpetinfo();
		title = new fire.msp.showtitleinfo();
	}

	public GEnterWorld(long _roleid_, int _level_, java.lang.String _rolename_, fire.msp.RoleMapInfo _mapinfo_, fire.msp.RoleMapInfo _laststaticmapinfo_, int _protect_, int _schoolid_, java.util.HashMap<Byte,Integer> _components_, fire.msp.modeinfo _mode_, fire.msp.showpetinfo _showpet_, fire.msp.showtitleinfo _title_, int _scenestate_, int _showrolenum_, int _equipeffect_) {
		this.roleid = _roleid_;
		this.level = _level_;
		this.rolename = _rolename_;
		this.mapinfo = _mapinfo_;
		this.laststaticmapinfo = _laststaticmapinfo_;
		this.protect = _protect_;
		this.schoolid = _schoolid_;
		this.components = _components_;
		this.mode = _mode_;
		this.showpet = _showpet_;
		this.title = _title_;
		this.scenestate = _scenestate_;
		this.showrolenum = _showrolenum_;
		this.equipeffect = _equipeffect_;
	}

	public final boolean _validator_() {
		if (!mapinfo._validator_()) return false;
		if (!laststaticmapinfo._validator_()) return false;
		if (!mode._validator_()) return false;
		if (!showpet._validator_()) return false;
		if (!title._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(level);
		_os_.marshal(rolename, "UTF-16LE");
		_os_.marshal(mapinfo);
		_os_.marshal(laststaticmapinfo);
		_os_.marshal(protect);
		_os_.marshal(schoolid);
		_os_.compact_uint32(components.size());
		for (java.util.Map.Entry<Byte, Integer> _e_ : components.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		_os_.marshal(mode);
		_os_.marshal(showpet);
		_os_.marshal(title);
		_os_.marshal(scenestate);
		_os_.marshal(showrolenum);
		_os_.marshal(equipeffect);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		level = _os_.unmarshal_int();
		rolename = _os_.unmarshal_String("UTF-16LE");
		mapinfo.unmarshal(_os_);
		laststaticmapinfo.unmarshal(_os_);
		protect = _os_.unmarshal_int();
		schoolid = _os_.unmarshal_int();
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			byte _k_;
			_k_ = _os_.unmarshal_byte();
			int _v_;
			_v_ = _os_.unmarshal_int();
			components.put(_k_, _v_);
		}
		mode.unmarshal(_os_);
		showpet.unmarshal(_os_);
		title.unmarshal(_os_);
		scenestate = _os_.unmarshal_int();
		showrolenum = _os_.unmarshal_int();
		equipeffect = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GEnterWorld) {
			GEnterWorld _o_ = (GEnterWorld)_o1_;
			if (roleid != _o_.roleid) return false;
			if (level != _o_.level) return false;
			if (!rolename.equals(_o_.rolename)) return false;
			if (!mapinfo.equals(_o_.mapinfo)) return false;
			if (!laststaticmapinfo.equals(_o_.laststaticmapinfo)) return false;
			if (protect != _o_.protect) return false;
			if (schoolid != _o_.schoolid) return false;
			if (!components.equals(_o_.components)) return false;
			if (!mode.equals(_o_.mode)) return false;
			if (!showpet.equals(_o_.showpet)) return false;
			if (!title.equals(_o_.title)) return false;
			if (scenestate != _o_.scenestate) return false;
			if (showrolenum != _o_.showrolenum) return false;
			if (equipeffect != _o_.equipeffect) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += level;
		_h_ += rolename.hashCode();
		_h_ += mapinfo.hashCode();
		_h_ += laststaticmapinfo.hashCode();
		_h_ += protect;
		_h_ += schoolid;
		_h_ += components.hashCode();
		_h_ += mode.hashCode();
		_h_ += showpet.hashCode();
		_h_ += title.hashCode();
		_h_ += scenestate;
		_h_ += showrolenum;
		_h_ += equipeffect;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(level).append(",");
		_sb_.append("T").append(rolename.length()).append(",");
		_sb_.append(mapinfo).append(",");
		_sb_.append(laststaticmapinfo).append(",");
		_sb_.append(protect).append(",");
		_sb_.append(schoolid).append(",");
		_sb_.append(components).append(",");
		_sb_.append(mode).append(",");
		_sb_.append(showpet).append(",");
		_sb_.append(title).append(",");
		_sb_.append(scenestate).append(",");
		_sb_.append(showrolenum).append(",");
		_sb_.append(equipeffect).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

