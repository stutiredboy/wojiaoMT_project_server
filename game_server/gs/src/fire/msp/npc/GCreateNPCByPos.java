
package fire.msp.npc;
import fire.msp.move.DynamicSceneParams;
import fire.pb.move.DynamicSceneType;
import fire.pb.scene.Scene;
import fire.pb.scene.SceneFactory;
import fire.pb.scene.SceneManager;
import fire.pb.scene.manager.SceneNpcManager;
import fire.pb.scene.movable.NPC;
import fire.pb.scene.sPos.Position;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GCreateNPCByPos__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GCreateNPCByPos extends __GCreateNPCByPos__ {
	@Override
	protected void process() {
		// protocol handle
		Scene scene = null;
		try {
			NPC n = SceneNpcManager.getInstance().createNpcWithKey(npc.npckey,npc.npcbaseid, npc.name, npc.dir);
			if (n == null) {
				if (SceneManager.logger.isInfoEnabled()) {
					SceneManager.logger.info(new StringBuilder().append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎娆戠┛闂傚倷娴囧▔鏇㈠窗閹版澘鍑犻柤濮愬�楁稉宥夋煙閹咃紞闁哄棴绠撻弻锝夊箻閸愯尙妲伴梺缁樻煥濡瑧鎹㈠┑瀣棃婵炴垶鑹鹃·锟介梻浣规偠閸娧囧箯闁垮绻嗛柣鎰典簻閿熷鍊濆畷鎴﹀川椤栨稑搴婇梺鍛婃处閸ㄦ壆绮婚弻銉︾厱闁哄洢鍔岄悘锟犳煙椤栨粌浠遍柟顔肩秺瀹曞爼鏁愰崨顓涙嫟闁荤偞鐨滈崟顓犵槇闂佹眹鍨藉褍鏆╅梻浣芥〃閻掞箓骞冮崒姘辨殾闁硅揪闄勯崐鐑芥煕濠靛棗顏╅柣搴弮濮婃椽宕ㄦ繝鍐ㄧ煯缂備緤鎷峰〒姘炬嫹鐎殿喗鎮傚畷濂革綖椤旇棄顏跺Δ鐘靛仜閻忔繈宕濆顓滀簻鐟滄繈骞忔搴ｇ＝闁稿本姘ㄦ牎闂佺粯顨堟繛锟界�殿喖顭烽弫鎾绘偐閼碱剙锟界偤姊哄畷鍥х殤闁圭兘顥撶槐鎺楀础閻愮绱為梺鐟板级閹倿骞冭瀹曠厧鈹戦崼銏″櫙缂傚倸鍊风欢銈夊箯閻戣姤鐓曠�癸拷閿熶粙宕戦悙鐑樺亗闁哄洢鍨婚崣鎾绘煕閵夛絽濮�濠㈣锚闇夋繝濠傚暞鐠愶紕绱掓潏銊ョ闁跨喐鏋荤紞鍡樼濠靛棭鍟呮繝闈涚墢绾惧ジ寮堕崼娑樺閻忓繑澹嗙槐鎺懳旈崘銊︾�剧紓浣虹帛缁诲牆鐣峰锟介垾锕傚箣濠婂懎顦╅梻鍌氬�搁崐鎼佸磹妞嬪海鐭嗗ù锝呮贡閻濊泛鈹戦悩鍙夋悙缁炬儳顭烽弻娑㈠焺閸愵亖妲堢紓浣瑰姈椤ㄥ﹪寮诲☉銏犵労闁告劕澧介崝宄邦渻閵堝倹娅呯�殿喖澧庨幑銏犫攽閸モ晝鐦堥梺绋挎湰缁矂路閿熶粙姊绘担铏瑰笡闁规瓕宕电划娆撳箻缂佹ɑ娅㈤梺鑺ッˇ閬嶆偩椤撱垺鐓曢幖娣妺閹插墽锟借娲﹂崹鍫曘�侀弴銏℃櫜闁告洦鍘鹃悾楣冩⒒娴ｄ警娼掗柛鏇炵仛閻ｇ兘姊虹紒妯诲碍闁哥喐鎸冲璇测槈濡攱鐎婚悗骞垮劚閹冲孩鎱ㄩ姀銏㈢＝濞达絿鎳撴慨鍫熶繆椤愩垹鏆ｇ�殿喖顭烽崹鎯х暦閸ャ劍鐣烽梻浣芥硶閸犲秶鍒掑▎蹇曟殾濞村吋娼欓崘锟藉銈嗘尵閸嬬喖鎮鹃崫鍕ㄦ斀闁绘顕滃銉╂煟濡わ拷濡稓鍒掓繝姘櫜濠㈣泛顑囬崢鐢告⒑缂佹ê鐏﹂拑閬嶆倶韫囷絽寮柡宀嬬磿閿熸枻绲婚崝宀勬晸閼恒儳绠撴い顐㈢箳缁辨帒螣鐠囧樊锟芥捇姊洪崨濠勨槈闁挎洏鍎靛畷鏇㈠箻缂佹ǚ鎷洪梺鍛婄箓鐎氼喗鏅堕柆宥嗙厱闁规崘娉涢弸娑欘殽閻愬弶顥㈢�规洜鍠栭、娑㈡晲閸℃ɑ鐝梻鍌欒兌缁垶宕濆▎蹇ｇ劷鐟滃繒鍒掓繝鍥ㄦ櫇闁稿本绋堥幏娲⒑闂堚晛鐦滈柛妯恒偢瀹曟繄锟斤綆鍠楅悡鏇㈡煏閸繄绠抽柣锝囨暩閿熻姤顔栭崳顕�宕抽敐澶婃瀬闁规儳顕々鐑芥倵閿濆簼绨芥い鏂挎濮婃椽宕ㄦ繝浣虹箒闂佹悶鍔戞禍璺虹暦娴兼潙骞㈡繛鎴炵懅閸橀亶姊洪崫鍕偍闁告柨鏈弲鑸电節濮橆厾鍘遍梺缁樻礀閸婂湱锟芥熬鎷�??:").append(npc.npcbaseid)
							.append(",sceneid:").append(npc.sceneid)
							.append(",ownerid:").append(npc.ownerid));
				}
			}
			
			if (npc.ownerid > 0) {
				scene = SceneManager.getInstance().getSceneByMapAndOwner((int) npc.sceneid, npc.ownerid);
				if (scene == null) {
					DynamicSceneParams params = new DynamicSceneParams();
					scene = SceneFactory.createDynamicScene((int) npc.sceneid,
							npc.ownerid, "", -1, DynamicSceneType.NORMAL_SCENE,
							params.marshal(new OctetsStream()));
					
					SceneManager.logger.error(new StringBuilder().append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎娆戠┛闂傚倷娴囧▔鏇㈠窗閹版澘鍑犻柤濮愬�楁稉宥夋煙閹咃紞闁哄棴绠撻弻锝夊箻閸愯尙妲伴梺缁樻煥濡瑧鎹㈠┑瀣棃婵炴垶鑹鹃·锟介梻浣规偠閸娧囧箯闁垮绻嗛柣鎰典簻閿熷鍊濆畷鎴﹀川椤栨稑搴婇梺鍛婃处閸ㄦ壆绮婚弻銉︾厱闁哄洢鍔岄悘锟犳煙椤栨粌浠遍柟顔肩秺瀹曞爼鏁愰崨顓涙嫟闁荤偞鐨滈崟顓犵槇闂佹眹鍨藉褍鏆╅梻浣芥〃閻掞箓骞冮崒姘辨殾闁硅揪闄勯崐鐑芥煕濠靛棗顏╅柣搴弮濮婃椽宕ㄦ繝鍐ㄧ煯缂備緤鎷峰〒姘炬嫹鐎殿喗鎮傚畷濂革綖椤旇棄顏跺Δ鐘靛仜閻忔繈宕濆顓滀簻鐟滄繈骞忔搴ｇ＝闁稿本姘ㄦ牎闂佺粯顨堟繛锟界�殿喖顭烽弫鎾绘偐閼碱剙锟界偤姊哄畷鍥х殤闁圭兘顥撶槐鎺楀础閻愮绱為梺鐟板级閹倿骞冭瀹曠厧鈹戦崼銏″櫙缂傚倸鍊风欢銈夊箯閻戣姤鐓曠�癸拷閿熶粙宕戦悙鐑樺亗闁哄洢鍨婚崣鎾绘煕閵夛絽濮�濠㈣锚闇夋繝濠傚暞鐠愶紕绱掓潏銊ョ闁跨喐鏋荤紞鍡樼濠靛棭鍟呮繝闈涚墢绾惧ジ寮堕崼娑樺閻忓繑澹嗙槐鎺懳旈崘銊︾�剧紓浣虹帛缁诲牆鐣峰锟介垾锕傚箣濠婂懎顦╅梻鍌氬�搁崐鎼佸磹妞嬪海鐭嗗ù锝呮贡閻濊泛鈹戦悩鍙夋悙缁炬儳顭烽弻娑㈠焺閸愵亖妲堢紓浣瑰姈椤ㄥ﹪寮诲☉銏犵労闁告劕澧介崝宄邦渻閵堝倹娅呯�殿喖澧庨幑銏犫攽閸モ晝鐦堥梺绋挎湰缁矂路閿熶粙姊绘担铏瑰笡闁规瓕宕电划娆撳箻缂佹ɑ娅㈤梺鑺ッˇ閬嶆偩椤撱垺鐓曢幖娣妺閹插墽锟借娲﹂崹鍫曘�侀弴銏℃櫜闁告洦鍘鹃悾楣冩⒒娴ｄ警娼掗柛鏇炵仛閻ｇ兘姊虹紒妯诲碍闁哥喐鎸冲璇测槈濡攱鐎婚悗骞垮劚閹冲孩鎱ㄩ姀銏㈢＝濞达絿鎳撴慨鍫熶繆椤愩垹鏆ｇ�殿喖顭烽崹鎯х暦閸ャ劍鐣烽梻浣芥硶閸犲秶鍒掑▎蹇曟殾濞村吋娼欓崘锟藉銈嗘尵閸嬬喖鎮鹃崫鍕ㄦ斀闁绘顕滃銉╂煟濡わ拷濡稓鍒掓繝姘櫜濠㈣泛顑囬崢鐢告⒑缂佹ê鐏﹂拑閬嶆倶韫囷絽寮柡宀嬬磿閿熸枻绲婚崝宀勬晸閼恒儳绠撴い顐㈢箳缁辨帒螣鐠囧樊锟芥捇姊洪崨濠勨槈闁挎洏鍎靛畷鏇㈠箻缂佹ǚ鎷洪梺鍛婄箓鐎氼喗鏅堕柆宥嗙厱闁规崘娉涢弸娑欘殽閻愬弶顥㈢�规洜鍠栭、娑㈡晲閸℃ɑ鐝梻鍌欒兌缁垶宕濆▎蹇ｇ劷鐟滃繒鍒掓繝鍥ㄦ櫇闁稿本绋堥幏娲⒑闂堚晛鐦滈柛妯恒偢瀹曟繄锟斤綆鍠楅悡鏇㈡煏閸繄绠抽柣锝囨暩閿熻姤顔栭崳顕�宕抽敐澶婃瀬闁规儳顕々鐑芥倵閿濆簼绨芥い鏂挎濮婃椽宕ㄦ繝浣虹箒闂佹悶鍔戞禍璺虹暦娴兼潙骞㈡繛鎴炵懅閸橀亶姊洪崫鍕偍闁告柨鏈弲鑸电節濮橆厾鍘遍梺缁樻礀閸婂湱锟芥熬鎷�??:").append(npc.npcbaseid)
							.append(",sceneid:").append(npc.sceneid)
							.append(",ownerid:").append(npc.ownerid)
							.append(",sceneidlong:").append(scene.getSceneID()));
				}
			}
			else
				scene = SceneManager.getInstance().getSceneByID(npc.sceneid);
			SceneNpcManager.getInstance().summonNpcAndUpdateGS(scene, new Position(posx, posy), n,npc.time);
			
			int mapid = (int) npc.sceneid;
			if (mapid >= 1851 && mapid <= 1870) {
				if (SceneManager.logger.isInfoEnabled()) {
					SceneManager.logger.info(new StringBuilder().append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎娆戠┛闂傚倷娴囧▔鏇㈠窗閹版澘鍑犻柤濮愬�楁稉宥夋煙閹咃紞闁哄棴绠撻弻锝夊箻閸愯尙妲伴梺缁樻煥濡瑧鎹㈠┑瀣棃婵炴垶鑹鹃·锟介梻浣规偠閸娧囧箯闁垮绻嗛柣鎰典簻閿熷鍊濆畷鎴﹀川椤栨稑搴婇梺鍛婃处閸ㄦ壆绮婚弻銉︾厱闁哄洢鍔岄悘锟犳煙椤栨粌浠遍柟顔肩秺瀹曞爼鏁愰崨顓涙嫟闁荤偞鐨滈崟顓犵槇闂佹眹鍨藉褍鏆╅梻浣芥〃閻掞箓骞冮崒姘辨殾闁硅揪闄勯崐鐑芥煕濠靛棗顏╅柣搴弮濮婃椽宕ㄦ繝鍐ㄧ煯缂備緤鎷峰〒姘炬嫹鐎殿喗鎮傚畷濂革綖椤旇棄顏跺Δ鐘靛仜閻忔繈宕濆顓滀簻鐟滄繈骞忔搴ｇ＝闁稿本姘ㄦ牎闂佺粯顨堟繛锟界�殿喖顭烽弫鎾绘偐閼碱剙锟界偤姊哄畷鍥х殤闁圭兘顥撶槐鎺楀础閻愮绱為梺鐟板级閹倿骞冭瀹曠厧鈹戦崼銏″櫙缂傚倸鍊风欢銈夊箯閻戣姤鐓曠�癸拷閿熶粙宕戦悙鐑樺亗闁哄洢鍨婚崣鎾绘煕閵夛絽濮�濠㈣锚闇夋繝濠傚暞鐠愶紕绱掓潏銊ョ闁跨喐鏋荤紞鍡樼濠靛棭鍟呮繝闈涚墢绾惧ジ寮堕崼娑樺閻忓繑澹嗙槐鎺懳旈崘銊︾�剧紓浣虹帛缁诲牆鐣峰锟介垾锕傚箣濠婂懎顦╅梻鍌氬�搁崐鎼佸磹妞嬪海鐭嗗ù锝呮贡閻濊泛鈹戦悩鍙夋悙缁炬儳顭烽弻娑㈠焺閸愵亖妲堢紓浣瑰姈椤ㄥ﹪寮诲☉銏犵労闁告劕澧介崝宄邦渻閵堝倹娅呯�殿喖澧庨幑銏犫攽閸モ晝鐦堥梺绋挎湰缁矂路閿熶粙姊绘担铏瑰笡闁规瓕宕电划娆撳箻缂佹ɑ娅㈤梺鑺ッˇ閬嶆偩椤撱垺鐓曢幖娣妺閹插墽锟借娲﹂崹鍫曘�侀弴銏℃櫜闁告洦鍘鹃悾楣冩⒒娴ｄ警娼掗柛鏇炵仛閻ｇ兘姊虹紒妯诲碍闁哥喐鎸冲璇测槈濡攱鐎婚悗骞垮劚閹冲孩鎱ㄩ姀銏㈢＝濞达絿鎳撴慨鍫熶繆椤愩垹鏆ｇ�殿喖顭烽崹鎯х暦閸ャ劍鐣烽梻浣芥硶閸犲秶鍒掑▎蹇曟殾濞村吋娼欓崘锟藉銈嗘尵閸嬬喖鎮鹃崫鍕ㄦ斀闁绘顕滃銉╂煟濡わ拷濡稓鍒掓繝姘櫜濠㈣泛顑囬崢鐢告⒑缂佹ê鐏﹂拑閬嶆倶韫囷絽寮柡宀嬬磿閿熸枻绲婚崝宀勬晸閼恒儳绠撴い顐㈢箳缁辨帒螣鐠囧樊锟芥捇姊洪崨濠勨槈闁挎洏鍎靛畷鏇㈠箻缂佹ǚ鎷洪梺鍛婄箓鐎氼喗鏅堕柆宥嗙厱闁规崘娉涢弸娑欘殽閻愬弶顥㈢�规洜鍠栭、娑㈡晲閸℃ɑ鐝梻鍌欒兌缁垶宕濆▎蹇ｇ劷鐟滃繒鍒掓繝鍥ㄦ櫇闁稿本绋堥幏娲⒑闂堚晛鐦滈柛妯恒偢瀹曟繄锟斤綆鍠楅悡鏇㈡煏閸繄绠抽柣锝囨暩閿熻姤顔栭崳顕�宕抽敐澶婃瀬闁规儳顕々鐑芥倵閿濆簼绨芥い鏂挎濮婃椽宕ㄦ繝浣虹箒闂佹悶鍔戞禍璺虹暦娴兼潙骞㈡繛鎴炵懅閸橀亶姊洪崫鍕偍闁告柨鏈弲鑸电節濮橆厾鍘遍梺缁樻礀閸婂湱锟芥熬鎷�??:").append(npc.npcbaseid)
							.append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎灞炬櫖缂傚倸鍊搁崐鍝ョ矓閻㈠憡鍋嬮柣妯款嚙缁犳牗淇婇妶鍛櫤闁哄懏鐓￠獮鏍垝閻熸澘鈷夐梺璇茬箰閻楀繒妲愰幘瀵哥懝濠电姴鍟鍫曟⒑鐠囨彃鍤辩紓宥呮瀹曟垶鎷呴崷顓ф锤濠电姴锕ら悧濠囨偂濞嗘挻鐓欏ù锝呭暞閻濐亝绻涢崨顓熷殗闁哄矉缍侀獮鎺楀棘閸喖顬嗙紓鍌欒兌缁垶鎯勯姘辨殾婵°倕鎳庣粈鍌滅棯閹峰矂鍝烘い銉ョ墛缁绘繂鈻撻崹顔界亪闂佹寧娲╂俊鍥礆閹烘鏁嶉柣鎰皺椤斿棝姊洪崨濠勨槈闁宦板姂楠炲棝鎮欓悜妯煎幗闂佺粯姊婚…鍫ニ夌�ｎ偁浜滈柟閭﹀厵閸嬨垺鎱ㄦ繝鍕笡闁瑰嘲鎳橀幖褰掓偡閹殿噮鍋у┑锛勫亼閸婃垿宕濆畝锟介幑銏犖熼搹瑙勬闂侀潧绻堥崐鏇犵矆閸垺鍠愰幖鎼厜缂嶆牠鏌￠崶銉ョ仾闁绘挾鍠栭弻鐔兼焽閿曪拷婢т即鏌熼悾灞叫㈤柍瑙勫灴椤㈡稑鈽夊▎蹇撴敪闂備礁鎼張顒勬儎椤栫偟宓佹慨妤嬫嫹鐎殿喖鐖奸獮瀣偐閻愮懓浠繝鐢靛Х閺佹悂宕戝☉銏″亱闁告洦鍨扮粈澶岋拷骞垮劚濞诧箑鐣烽崣澶岀闁瑰瓨鐟ラ悘鈺冪磼閻欐瑥娲﹂悡娆撴倵濞戞瑯鐒界紒鐘崇墵閺屾稒绻濇惔锛勪桓濠殿喖锕ㄥ▍锝夊箯閻樿鐏崇�规洖娲ｉ崫妤呮⒒娴ｈ銇熼柛妯恒偢瀹曟劙骞栨笟鍥ㄦ櫔闂佹寧绻傞ˇ浠嬪极閸愵喗鐓忛煫鍥э攻濞呭懘鏌熼钘夌仸缂佺粯绻堟慨锟介柨婵嗘閵嗘劕顪冮妶鍡楃仴婵炲樊鍘奸悾鐑藉閵堝孩鏅滈梺鍓插亞閸熷潡骞忓ú顏呪拺闁告稑锕ョ亸鎵喐閺夊灝鏆炵紒鍌氱Т閳规垿宕奸姀顫床闂佽崵濮村ú锕併亹閸愵喖姹叉繛鍡樺姂娴滄粓鏌￠崒婵囩《缂佺姳鍗抽弻宥囨喆閸曨偆浠奸梺璺ㄥ枑閺嬭崵绱為崱娑樼；闁糕剝绋戦崒銊╂煢濡警妲撮柡锟芥禒瀣厽闁归偊鍘界紞鎴︽煟韫囨岸鍝虹紒缁樼洴瀹曘劑顢欓悾宀婃Ф闂備浇娉曢崰鏇熸叏閵堝鍋勬い鎺戝缁狀垶鏌ㄩ悤鍌涘 X 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氱紓鍌欒兌閸嬫捇宕曢幎瑙ｏ拷锕傛倻閽樺鎽曢梺鍝勬川閸犳挾绮绘ィ鍐╃厽闁逛即娼ф晶顖炴煟濠靛洦鈷掔紒杈ㄥ浮閹瑩顢楅敓浠嬪礉閵堝棛绠剧痪顓㈩棑缁★拷閻庢鍠栭…鐑藉极瀹ュ绀嬫い蹇撴噹婵即姊洪懡銈呅㈡繛璇х畳閵囨劙宕橀埡鍌氬伎闁瑰吋鐣崝宥夊煕閹达附鐓㈡俊顖欒濡叉悂鏌￠崱娆忔灈闁哄本鐩幃鈺佺暦閸パ�鎷伴柣搴㈩問閸犳牠鈥﹂柨瀣╃箚闁归棿绀侀悡娑㈡煕鐏炲墽鐓紒銊ょ矙濮婄粯鎷呮笟顖滃姼闂佸搫鐗滈崜娑氬垝濞嗘挸绠ｉ柨鏃傜帛閺呮粓姊虹捄銊ユ珢闁瑰嚖鎷�??").append(posx)
							.append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎灞炬櫖缂傚倸鍊搁崐鍝ョ矓閻㈠憡鍋嬮柣妯款嚙缁犳牗淇婇妶鍛櫤闁哄懏鐓￠獮鏍垝閻熸澘鈷夐梺璇茬箰閻楀繒妲愰幘瀵哥懝濠电姴鍟鍫曟⒑鐠囨彃鍤辩紓宥呮瀹曟垶鎷呴崷顓ф锤濠电姴锕ら悧濠囨偂濞嗘挻鐓欏ù锝呭暞閻濐亝绻涢崨顓熷殗闁哄矉缍侀獮鎺楀棘閸喖顬嗙紓鍌欒兌缁垶鎯勯姘辨殾婵°倕鎳庣粈鍌滅棯閹峰矂鍝烘い銉ョ墛缁绘繂鈻撻崹顔界亪闂佹寧娲╂俊鍥礆閹烘鏁嶉柣鎰皺椤斿棝姊洪崨濠勨槈闁宦板姂楠炲棝鎮欓悜妯煎幗闂佺粯姊婚…鍫ニ夌�ｎ偁浜滈柟閭﹀厵閸嬨垺鎱ㄦ繝鍕笡闁瑰嘲鎳橀幖褰掓偡閹殿噮鍋у┑锛勫亼閸婃垿宕濆畝锟介幑銏犖熼搹瑙勬闂侀潧绻堥崐鏇犵矆閸垺鍠愰幖鎼厜缂嶆牠鏌￠崶銉ョ仾闁绘挾鍠栭弻鐔兼焽閿曪拷婢т即鏌熼悾灞叫㈤柍瑙勫灴椤㈡稑鈽夊▎蹇撴敪闂備礁鎼張顒勬儎椤栫偟宓佹慨妤嬫嫹鐎殿喖鐖奸獮瀣偐閻愮懓浠繝鐢靛Х閺佹悂宕戝☉銏″亱闁告洦鍨扮粈澶岋拷骞垮劚濞诧箑鐣烽崣澶岀闁瑰瓨鐟ラ悘鈺冪磼閻欐瑥娲﹂悡娆撴倵濞戞瑯鐒界紒鐘崇墵閺屾稒绻濇惔锛勪桓濠殿喖锕ㄥ▍锝夊箯閻樿鐏崇�规洖娲ｉ崫妤呮⒒娴ｈ銇熼柛妯恒偢瀹曟劙骞栨笟鍥ㄦ櫔闂佹寧绻傞ˇ浠嬪极閸愵喗鐓忛煫鍥э攻濞呭懘鏌熼钘夌仸缂佺粯绻堟慨锟介柨婵嗘閵嗘劕顪冮妶鍡楃仴婵炲樊鍘奸悾鐑藉閵堝孩鏅滈梺鍓插亞閸熷潡骞忓ú顏呪拺闁告稑锕ョ亸鎵喐閺夊灝鏆炵紒鍌氱Т閳规垿宕奸姀顫床闂佽崵濮村ú锕併亹閸愵喖姹叉繛鍡樺姂娴滄粓鏌￠崒婵囩《缂佺姳鍗抽弻宥囨喆閸曨偆浠奸梺璺ㄥ枑閺嬭崵绱為崱娑樼；闁糕剝绋戦崒銊╂煢濡警妲撮柡锟芥禒瀣厽闁归偊鍘界紞鎴︽煟韫囨岸鍝虹紒缁樼洴瀹曘劑顢欓悾宀婃Ф闂備浇娉曢崰鏇熸叏閵堝鍋勬い鎺戝缁狀垶鏌ㄩ悤鍌涘 Y 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氱紓鍌欒兌閸嬫捇宕曢幎瑙ｏ拷锕傛倻閽樺鎽曢梺鍝勬川閸犳挾绮绘ィ鍐╃厽闁逛即娼ф晶顖炴煟濠靛洦鈷掔紒杈ㄥ浮閹瑩顢楅敓浠嬪礉閵堝棛绠剧痪顓㈩棑缁★拷閻庢鍠栭…鐑藉极瀹ュ绀嬫い蹇撴噹婵即姊洪懡銈呅㈡繛璇х畳閵囨劙宕橀埡鍌氬伎闁瑰吋鐣崝宥夊煕閹达附鐓㈡俊顖欒濡叉悂鏌￠崱娆忔灈闁哄本鐩幃鈺佺暦閸パ�鎷伴柣搴㈩問閸犳牠鈥﹂柨瀣╃箚闁归棿绀侀悡娑㈡煕鐏炲墽鐓紒銊ょ矙濮婄粯鎷呮笟顖滃姼闂佸搫鐗滈崜娑氬垝濞嗘挸绠ｉ柨鏃傜帛閺呮粓姊虹捄銊ユ珢闁瑰嚖鎷�??").append(posx)
							.append(",sceneid:").append(npc.sceneid)
							.append(",ownerid:").append(npc.ownerid)
							.append(",sceneidlong:").append(scene.getSceneID()));
				}
			}
		}
		catch (Exception e) {
			SceneManager.logger.error("create npc by map failed.npcid:"
					+ npc.npcbaseid + ",sceneid:" + npc.sceneid + ",ownerid:" + npc.ownerid + ",scene:" + scene
					, e);
			if (scene != null) {
				SceneManager.logger.error("sceneidlong:" + scene.getSceneID());
			}
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730399;

	public int getType() {
		return 730399;
	}

	public fire.msp.npc.CreateNpcInfo npc;
	public int posx;
	public int posy;

	public GCreateNPCByPos() {
		npc = new fire.msp.npc.CreateNpcInfo();
	}

	public GCreateNPCByPos(fire.msp.npc.CreateNpcInfo _npc_, int _posx_, int _posy_) {
		this.npc = _npc_;
		this.posx = _posx_;
		this.posy = _posy_;
	}

	public final boolean _validator_() {
		if (!npc._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npc);
		_os_.marshal(posx);
		_os_.marshal(posy);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npc.unmarshal(_os_);
		posx = _os_.unmarshal_int();
		posy = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GCreateNPCByPos) {
			GCreateNPCByPos _o_ = (GCreateNPCByPos)_o1_;
			if (!npc.equals(_o_.npc)) return false;
			if (posx != _o_.posx) return false;
			if (posy != _o_.posy) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += npc.hashCode();
		_h_ += posx;
		_h_ += posy;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npc).append(",");
		_sb_.append(posx).append(",");
		_sb_.append(posy).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

