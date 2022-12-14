package fire.msp.npc;

import fire.msp.move.DynamicSceneParams;
import fire.pb.move.DynamicSceneType;
import fire.pb.scene.MapUtil;
import fire.pb.scene.Scene;
import fire.pb.scene.SceneFactory;
import fire.pb.scene.SceneManager;
import fire.pb.scene.manager.SceneNpcManager;
import fire.pb.scene.movable.NPC;
import fire.pb.scene.sPos.GridPos;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GCreateNPCByMap__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GCreateNPCByMap extends __GCreateNPCByMap__ {
	@Override
	protected void process() {

		Scene scene = null;
		GridPos gpos = null;
		try {
			NPC n = SceneNpcManager.getInstance().createNpcWithKey(npc.npckey,
					npc.npcbaseid, npc.name, npc.dir);
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
					scene = SceneFactory.createDynamicScene((int)npc.sceneid, npc.ownerid, "",
							-1, DynamicSceneType.NORMAL_SCENE, params.marshal(new OctetsStream()));
					
					SceneManager.logger.error(new StringBuilder().append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎娆戠┛闂傚倷娴囧▔鏇㈠窗閹版澘鍑犻柤濮愬�楁稉宥夋煙閹咃紞闁哄棴绠撻弻锝夊箻閸愯尙妲伴梺缁樻煥濡瑧鎹㈠┑瀣棃婵炴垶鑹鹃·锟介梻浣规偠閸娧囧箯闁垮绻嗛柣鎰典簻閿熷鍊濆畷鎴﹀川椤栨稑搴婇梺鍛婃处閸ㄦ壆绮婚弻銉︾厱闁哄洢鍔岄悘锟犳煙椤栨粌浠遍柟顔肩秺瀹曞爼鏁愰崨顓涙嫟闁荤偞鐨滈崟顓犵槇闂佹眹鍨藉褍鏆╅梻浣芥〃閻掞箓骞冮崒姘辨殾闁硅揪闄勯崐鐑芥煕濠靛棗顏╅柣搴弮濮婃椽宕ㄦ繝鍐ㄧ煯缂備緤鎷峰〒姘炬嫹鐎殿喗鎮傚畷濂革綖椤旇棄顏跺Δ鐘靛仜閻忔繈宕濆顓滀簻鐟滄繈骞忔搴ｇ＝闁稿本姘ㄦ牎闂佺粯顨堟繛锟界�殿喖顭烽弫鎾绘偐閼碱剙锟界偤姊哄畷鍥х殤闁圭兘顥撶槐鎺楀础閻愮绱為梺鐟板级閹倿骞冭瀹曠厧鈹戦崼銏″櫙缂傚倸鍊风欢銈夊箯閻戣姤鐓曠�癸拷閿熶粙宕戦悙鐑樺亗闁哄洢鍨婚崣鎾绘煕閵夛絽濮�濠㈣锚闇夋繝濠傚暞鐠愶紕绱掓潏銊ョ闁跨喐鏋荤紞鍡樼濠靛棭鍟呮繝闈涚墢绾惧ジ寮堕崼娑樺閻忓繑澹嗙槐鎺懳旈崘銊︾�剧紓浣虹帛缁诲牆鐣峰锟介垾锕傚箣濠婂懎顦╅梻鍌氬�搁崐鎼佸磹妞嬪海鐭嗗ù锝呮贡閻濊泛鈹戦悩鍙夋悙缁炬儳顭烽弻娑㈠焺閸愵亖妲堢紓浣瑰姈椤ㄥ﹪寮诲☉銏犵労闁告劕澧介崝宄邦渻閵堝倹娅呯�殿喖澧庨幑銏犫攽閸モ晝鐦堥梺绋挎湰缁矂路閿熶粙姊绘担铏瑰笡闁规瓕宕电划娆撳箻缂佹ɑ娅㈤梺鑺ッˇ閬嶆偩椤撱垺鐓曢幖娣妺閹插墽锟借娲﹂崹鍫曘�侀弴銏℃櫜闁告洦鍘鹃悾楣冩⒒娴ｄ警娼掗柛鏇炵仛閻ｇ兘姊虹紒妯诲碍闁哥喐鎸冲璇测槈濡攱鐎婚悗骞垮劚閹冲孩鎱ㄩ姀銏㈢＝濞达絿鎳撴慨鍫熶繆椤愩垹鏆ｇ�殿喖顭烽崹鎯х暦閸ャ劍鐣烽梻浣芥硶閸犲秶鍒掑▎蹇曟殾濞村吋娼欓崘锟藉銈嗘尵閸嬬喖鎮鹃崫鍕ㄦ斀闁绘顕滃銉╂煟濡わ拷濡稓鍒掓繝姘櫜濠㈣泛顑囬崢鐢告⒑缂佹ê鐏﹂拑閬嶆倶韫囷絽寮柡宀嬬磿閿熸枻绲婚崝宀勬晸閼恒儳绠撴い顐㈢箳缁辨帒螣鐠囧樊锟芥捇姊洪崨濠勨槈闁挎洏鍎靛畷鏇㈠箻缂佹ǚ鎷洪梺鍛婄箓鐎氼喗鏅堕柆宥嗙厱闁规崘娉涢弸娑欘殽閻愬弶顥㈢�规洜鍠栭、娑㈡晲閸℃ɑ鐝梻鍌欒兌缁垶宕濆▎蹇ｇ劷鐟滃繒鍒掓繝鍥ㄦ櫇闁稿本绋堥幏娲⒑闂堚晛鐦滈柛妯恒偢瀹曟繄锟斤綆鍠楅悡鏇㈡煏閸繄绠抽柣锝囨暩閿熻姤顔栭崳顕�宕抽敐澶婃瀬闁规儳顕々鐑芥倵閿濆簼绨芥い鏂挎濮婃椽宕ㄦ繝浣虹箒闂佹悶鍔戞禍璺虹暦娴兼潙骞㈡繛鎴炵懅閸橀亶姊洪崫鍕偍闁告柨鏈弲鑸电節濮橆厾鍘遍梺缁樻礀閸婂湱锟芥熬鎷�??:").append(npc.npcbaseid)
							.append(",sceneid:").append(npc.sceneid)
							.append(",ownerid:").append(npc.ownerid)
							.append(",sceneidlong:").append(scene.getSceneID())
							.append(",npckey:").append(npc.npckey));
				}
			}
			else
				scene = SceneManager.getInstance().getSceneByID(npc.sceneid);
			gpos = MapUtil.getRandomArrivablePos(scene.getSceneID(), toufangareatype);
			int mapid = (int) npc.sceneid;
			if (mapid >= 1851 && mapid <= 1870) {
				if (SceneManager.logger.isInfoEnabled()) {
					SceneManager.logger.info(new StringBuilder().append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎娆戠┛闂傚倷娴囧▔鏇㈠窗閹版澘鍑犻柤濮愬�楁稉宥夋煙閹咃紞闁哄棴绠撻弻锝夊箻閸愯尙妲伴梺缁樻煥濡瑧鎹㈠┑瀣棃婵炴垶鑹鹃·锟介梻浣规偠閸娧囧箯闁垮绻嗛柣鎰典簻閿熷鍊濆畷鎴﹀川椤栨稑搴婇梺鍛婃处閸ㄦ壆绮婚弻銉︾厱闁哄洢鍔岄悘锟犳煙椤栨粌浠遍柟顔肩秺瀹曞爼鏁愰崨顓涙嫟闁荤偞鐨滈崟顓犵槇闂佹眹鍨藉褍鏆╅梻浣芥〃閻掞箓骞冮崒姘辨殾闁硅揪闄勯崐鐑芥煕濠靛棗顏╅柣搴弮濮婃椽宕ㄦ繝鍐ㄧ煯缂備緤鎷峰〒姘炬嫹鐎殿喗鎮傚畷濂革綖椤旇棄顏跺Δ鐘靛仜閻忔繈宕濆顓滀簻鐟滄繈骞忔搴ｇ＝闁稿本姘ㄦ牎闂佺粯顨堟繛锟界�殿喖顭烽弫鎾绘偐閼碱剙锟界偤姊哄畷鍥х殤闁圭兘顥撶槐鎺楀础閻愮绱為梺鐟板级閹倿骞冭瀹曠厧鈹戦崼銏″櫙缂傚倸鍊风欢銈夊箯閻戣姤鐓曠�癸拷閿熶粙宕戦悙鐑樺亗闁哄洢鍨婚崣鎾绘煕閵夛絽濮�濠㈣锚闇夋繝濠傚暞鐠愶紕绱掓潏銊ョ闁跨喐鏋荤紞鍡樼濠靛棭鍟呮繝闈涚墢绾惧ジ寮堕崼娑樺閻忓繑澹嗙槐鎺懳旈崘銊︾�剧紓浣虹帛缁诲牆鐣峰锟介垾锕傚箣濠婂懎顦╅梻鍌氬�搁崐鎼佸磹妞嬪海鐭嗗ù锝呮贡閻濊泛鈹戦悩鍙夋悙缁炬儳顭烽弻娑㈠焺閸愵亖妲堢紓浣瑰姈椤ㄥ﹪寮诲☉銏犵労闁告劕澧介崝宄邦渻閵堝倹娅呯�殿喖澧庨幑銏犫攽閸モ晝鐦堥梺绋挎湰缁矂路閿熶粙姊绘担铏瑰笡闁规瓕宕电划娆撳箻缂佹ɑ娅㈤梺鑺ッˇ閬嶆偩椤撱垺鐓曢幖娣妺閹插墽锟借娲﹂崹鍫曘�侀弴銏℃櫜闁告洦鍘鹃悾楣冩⒒娴ｄ警娼掗柛鏇炵仛閻ｇ兘姊虹紒妯诲碍闁哥喐鎸冲璇测槈濡攱鐎婚悗骞垮劚閹冲孩鎱ㄩ姀銏㈢＝濞达絿鎳撴慨鍫熶繆椤愩垹鏆ｇ�殿喖顭烽崹鎯х暦閸ャ劍鐣烽梻浣芥硶閸犲秶鍒掑▎蹇曟殾濞村吋娼欓崘锟藉銈嗘尵閸嬬喖鎮鹃崫鍕ㄦ斀闁绘顕滃銉╂煟濡わ拷濡稓鍒掓繝姘櫜濠㈣泛顑囬崢鐢告⒑缂佹ê鐏﹂拑閬嶆倶韫囷絽寮柡宀嬬磿閿熸枻绲婚崝宀勬晸閼恒儳绠撴い顐㈢箳缁辨帒螣鐠囧樊锟芥捇姊洪崨濠勨槈闁挎洏鍎靛畷鏇㈠箻缂佹ǚ鎷洪梺鍛婄箓鐎氼喗鏅堕柆宥嗙厱闁规崘娉涢弸娑欘殽閻愬弶顥㈢�规洜鍠栭、娑㈡晲閸℃ɑ鐝梻鍌欒兌缁垶宕濆▎蹇ｇ劷鐟滃繒鍒掓繝鍥ㄦ櫇闁稿本绋堥幏娲⒑闂堚晛鐦滈柛妯恒偢瀹曟繄锟斤綆鍠楅悡鏇㈡煏閸繄绠抽柣锝囨暩閿熻姤顔栭崳顕�宕抽敐澶婃瀬闁规儳顕々鐑芥倵閿濆簼绨芥い鏂挎濮婃椽宕ㄦ繝浣虹箒闂佹悶鍔戞禍璺虹暦娴兼潙骞㈡繛鎴炵懅閸橀亶姊洪崫鍕偍闁告柨鏈弲鑸电節濮橆厾鍘遍梺缁樻礀閸婂湱锟芥熬鎷�??:").append(npc.npcbaseid)
							.append(",闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎灞炬櫖缂傚倸鍊搁崐鍝ョ矓閻㈠憡鍋嬮柣妯款嚙缁犳牗淇婇妶鍛櫤闁哄懏鐓￠獮鏍垝閻熸澘鈷夐梺璇茬箰閻楀繒妲愰幘瀵哥懝濠电姴鍟鍫曟⒑鐠囨彃鍤辩紓宥呮瀹曟垶鎷呴崷顓ф锤濠电姴锕ら悧濠囨偂濞嗘挻鐓欏ù锝呭暞閻濐亝绻涢崨顓熷殗闁哄矉缍侀獮鎺楀棘閸喖顬嗙紓鍌欒兌缁垶鎯勯姘辨殾婵°倕鎳庣粈鍌滅棯閹峰矂鍝烘い銉ョ墛缁绘繂鈻撻崹顔界亪闂佹寧娲╂俊鍥礆閹烘鏁嶉柣鎰皺椤斿棝姊洪崨濠勨槈闁宦板姂楠炲棝鎮欓悜妯煎幗闂佺粯姊婚…鍫ニ夌�ｎ偁浜滈柟閭﹀厵閸嬨垺鎱ㄦ繝鍕笡闁瑰嘲鎳橀幖褰掓偡閹殿噮鍋у┑锛勫亼閸婃垿宕濆畝锟介幑銏犖熼搹瑙勬闂侀潧绻堥崐鏇犵矆閸垺鍠愰幖鎼厜缂嶆牠鏌￠崶銉ョ仾闁绘挾鍠栭弻鐔兼焽閿曪拷婢т即鏌熼悾灞叫㈤柍瑙勫灴椤㈡稑鈽夊▎蹇撴敪闂備礁鎼張顒勬儎椤栫偟宓佹慨妤嬫嫹鐎殿喖鐖奸獮瀣偐閻愮懓浠繝鐢靛Х閺佹悂宕戝☉銏″亱闁告洦鍨扮粈澶岋拷骞垮劚濞诧箑鐣烽崣澶岀闁瑰鍋熼崯鏌ユ煙妞嬪骸鍘撮柟顔挎閳绘挾鎹勯妸銉バ梻浣圭湽閸╁嫰宕规导瀛樺亯濠靛倻顭堥拑鐔兼煥濠靛棙顥滅紒鐘靛█濮婃椽宕ㄦ繝鍐ｆ嫻闂佹悶鍔庨弫濠氬箖妤ｅ啯鍊婚柦妯侯槺椤撴椽姊洪幐搴⑩拻缂侇噮鍨跺鎻掝煥閸啿鎷洪梺鍛婃尰瑜板啯绂嶉悙鐑樼厱闁绘娅曞畷宀�锟借娲╃紞浣哥暦閸楃偐妲堟繛鍡楁湰鐎氳偐绱撻崒姘拷鐑芥倿閿曚焦鎳岀紓鍌欑筏閹风兘鏌ㄩ悢鍓佺煓婵﹨娅ｇ划娆撳礌閳ュ厖绱ｆ繝鐢靛閹风兘姊洪锟界粔鐢稿疾閹间焦鐓犻柟顓熷笒閸斻倝鏌涢悢鍝ュ弨闁哄瞼鍠栧畷娆撳Χ閸℃浼�:").append(gpos.getX())
							.append(",闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎灞炬櫖缂傚倸鍊搁崐鍝ョ矓閻㈠憡鍋嬮柣妯款嚙缁犳牗淇婇妶鍛櫤闁哄懏鐓￠獮鏍垝閻熸澘鈷夐梺璇茬箰閻楀繒妲愰幘瀵哥懝濠电姴鍟鍫曟⒑鐠囨彃鍤辩紓宥呮瀹曟垶鎷呴崷顓ф锤濠电姴锕ら悧濠囨偂濞嗘挻鐓欏ù锝呭暞閻濐亝绻涢崨顓熷殗闁哄矉缍侀獮鎺楀棘閸喖顬嗙紓鍌欒兌缁垶鎯勯姘辨殾婵°倕鎳庣粈鍌滅棯閹峰矂鍝烘い銉ョ墛缁绘繂鈻撻崹顔界亪闂佹寧娲╂俊鍥礆閹烘鏁嶉柣鎰皺椤斿棝姊洪崨濠勨槈闁宦板姂楠炲棝鎮欓悜妯煎幗闂佺粯姊婚…鍫ニ夌�ｎ偁浜滈柟閭﹀厵閸嬨垺鎱ㄦ繝鍕笡闁瑰嘲鎳橀幖褰掓偡閹殿噮鍋у┑锛勫亼閸婃垿宕濆畝锟介幑銏犖熼搹瑙勬闂侀潧绻堥崐鏇犵矆閸垺鍠愰幖鎼厜缂嶆牠鏌￠崶銉ョ仾闁绘挾鍠栭弻鐔兼焽閿曪拷婢т即鏌熼悾灞叫㈤柍瑙勫灴椤㈡稑鈽夊▎蹇撴敪闂備礁鎼張顒勬儎椤栫偟宓佹慨妤嬫嫹鐎殿喖鐖奸獮瀣偐閻愮懓浠繝鐢靛Х閺佹悂宕戝☉銏″亱闁告洦鍨扮粈澶岋拷骞垮劚濞诧箑鐣烽崣澶岀闁瑰鍋熼崯鏌ユ煙妞嬪骸鍘撮柟顔挎閳绘挾鎹勯妸銉バ梻浣圭湽閸╁嫰宕规导瀛樺亯濠靛倻顭堥拑鐔兼煥濠靛棙顥滅紒鐘靛█濮婃椽宕ㄦ繝鍐ｆ嫻闂佹悶鍔庨弫濠氬箖妤ｅ啯鍊婚柦妯侯槸瀹撳棝姊虹紒妯活棃妞ゃ儲鎸剧划锝夋倷閻戞ǚ鎷洪悷婊呭鐢帗绂嶆导瀛樼厱婵鎷风紒鐘崇墪閻ｇ兘鏁愭径濠傝�垮┑鐐村灦閻熴垽骞忛搹鍦＝闁稿本鐟ч崝宥夋嫅鏉堚晝纾奸柨鐔剁矙閺佹挻绂掔�ｎ偀鎷虹紓浣割儏鐏忓懎顔忛妷锔剧瘈闁跨喍绮欓弻鍡楊吋閸℃ɑ顏熼梻浣稿悑娴滀粙宕曢幎钘夌柈闁哄被鍎查悡娆撴煕閹存瑥锟芥牜锟芥熬鎷�:").append(gpos.getY())
							.append(",sceneid:").append(npc.sceneid)
							.append(",ownerid:").append(npc.ownerid)
							.append(",sceneidlong:").append(scene.getSceneID())
							.append(",npckey:").append(npc.npckey));
				}
			}
				
			SceneNpcManager.getInstance().summonNpcAndUpdateGS(scene, gpos.toPosition(), n, npc.time);
		} catch (Exception e) {
			SceneManager.logger.error("create npc by map failed.npcid:"
					+ npc.npcbaseid + ",sceneid:" + npc.sceneid + ",ownerid:" + npc.ownerid + ",scene:" + scene
					+ ",pos:" + gpos, e);
			if (scene != null) {
				SceneManager.logger.error("sceneidlong:" + scene.getSceneID());
			}
		}
		// System.out.println("濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁樺姍濠�渚�姊虹粙璺ㄧ闁告艾顑囩槐鐐哄箣閿旂晫鍘遍梺闈涱焾閸庨亶鏁撻挊澶樼吋妤犵偛顦甸獮鏍ㄦ媴閻熼缃曢梻浣稿閸嬪懐鎹㈤崟顖涘仭闁哄被鍎查埛鎴犵磼鐎ｎ偒鍎ラ柛搴＄箲閵囧嫰鏁傞悙顒佹瘓閻庢鍠栭…宄邦嚕閹绢喗鏅柛鏇ㄥ幗濠㈡垿姊虹拠鎻掑毐缂傚秴妫欑粋宥夋倻閽樺顔嗛梺缁樺灱濡嫰宕￠幎鑺ョ厪闊洤顑呴悘鈺冪磼娓氬﹦鐣垫慨濠冩そ濡啫鈽夊杈╂毎闂備浇娉曢崰搴ㄦ晸閻ｅ苯鏋庨柣銊ㄦ缁辨帡鎮╃�圭姴顥濆銈庝簻閸熷瓨淇婇崼鏇炲耿婵炲棗娴氬椋庣磽閸屾瑧璐伴柛鐘崇墵閹绺界粙鎸庣�銈嗘穿閹风兘鏌熼搹顐ょ煉闁诡喕绮欓幃钘夆枔閸喗娅楅梻鍌氬�烽懗鍫曞箠閹捐鐤柛褎顨呮惔濠囨煙缂佹ê纭�婵炲樊浜濋弲婵嬫煕鐏炵偓鐨戦柛姗�浜跺娲捶椤撶偛濡洪梺鎼炲�栨穱娲Φ閹版澘绠抽柟鎯х摠閻濇娊姊绘担鍛婂暈濞撴碍顨婂畷浼村冀椤撶偞杈堥梺鍓插亖閸庢煡鍩涢幋锔界厱婵犻潧瀚崝姘舵煛鐎ｎ偅顥堥柡灞剧〒閿熸枻绲婚崝宀勬晸閼恒儳绠為柣娑卞櫍瀹曟﹢鍩￠崘鐐カ闂佽鍑界徊浠嬫倶濮樿泛鐤炬い鎺炴嫹闁宠鍨块幃娆撳级閹寸姳绱樺┑锛勫仜閻°劑骞冮崒鐐茬畺濡わ絽鍟崵鍐煃閸濆嫬鏆熼柨娑欑箖缁绘盯骞樼壕瀣棟濠电偛鐪伴崐婵嗩嚕閹间焦鍋勯柛蹇氬亹閸樹粙姊虹紒妯荤叆鐎殿喛娉涢埢宥嗙節閸ャ劎鍘藉┑鐐村灥瀹曨剟寮搁妶澶嬬叆闁绘柨鎲￠悘顔剧磽瀹ュ懏顥㈢�规洘婢樿灃闁告侗鍘鹃敍娑㈡⒑鐟欏嫬顥嬪褎顨婇幃锟犳偄閸忚偐鍘棅顐㈡搐椤戝懘鎮炲ú顏呯厸闁糕剝顭囬惌宀�绱掓潏銊ョ瑲婵炵厧绻樻俊鎼佸Ψ閵忥紕浜炲┑鐘愁問閸犳牠鏁冮敂鎯у灊妞ゆ牜鍋涚粻顖炴煕濞戝崬鐏ｅ瑙勫▕閹鏁愭惔鈥茬敖缂備礁顦遍崗妯侯潖缂佹ɑ濯村〒姘煎灣閸旀悂鏌ｆ惔銏⑩枔闁哄懏绮庨幑銏犫槈濞嗘垹鐦堥梺鎼炲劘閸庡骞忛柨瀣闁告挸寮堕崓鍨繆椤愩倕顣肩紒璇插暣瀵煡鏁愭径瀣ф嫼闂備緡鍋嗛崑娑㈡嚐椤栨稒娅犲Δ锝呭暞閻撴瑥顪冪�ｎ亪顎楅柛妯侯嚟閿熷�燁潐濞插繘宕濋幋婵愬殨闁割偅娲栫粻锝夋煥濠靛棙顥為柛鐔告そ濮婂宕掑▎鎴犵崲濠电偘鍖犻崵韬插姂閺佹捇鎸婃径鍡樻杸闂佺偨鍎村▍鏇㈠窗濡》鎷风憴鍕８闁搞劏妫勯悾鐑芥晸閻樺啿锟界兘鏌嶉崫鍕拷褰掑级閹间焦鈷掑ù锝堟鐢稒銇勯鐐村窛闁告帗甯￠、娑橆潩閿濆棭娼旈柣鐔哥矊鐎涒晝绮氭潏銊х瘈闁搞儴鍩栭弲婵嗩渻閵堝棗濮傞柛銊ユ贡缁槒銇愰幒鎾嫼閻庤娲栧ú銊ф暜濞戙垺鐓欓柛娑橈工閸斻倖銇勯弴顏嗙К妞わ箑缍婇弻鈩冩媴鐟欏嫬纾抽梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷� 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂傚洤顦甸弻銊モ攽閸℃瑥顤�闂侀潧妫楅崯鎾蓟閿濆绠抽柟鎼灥閸氼偊姊洪崫鍕拱缂佸鍨块崺銉﹀緞婵炵偓鐎婚梺褰掑亰閸犳岸鍩㈣箛鏇犵＝闁稿本鐟ㄩ崗灞解攽椤栵絽寮�规洖缍婂畷濂稿即閻愯埖鎲伴梻渚�娼ц墝闁哄懏绮撳畷鎴﹀幢濞戞瑧鍘遍柣蹇曞仜婢т粙鍩ユ径瀣ㄤ簻闊洢鍎茬�氾拷? " + n.getName() + "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎灞炬櫖缂傚倸鍊搁崐鍝ョ矓閻㈠憡鍋嬮柣妯款嚙缁犳牗淇婇妶鍛櫤闁哄懏鐓￠獮鏍垝閻熸澘鈷夐梺璇茬箰閻楀繒妲愰幘瀵哥懝濠电姴鍟鍫曟⒑鐠囨彃鍤辩紓宥呮瀹曟垶鎷呴崷顓ф锤濠电姴锕ら悧濠囨偂濞嗘挻鐓欏ù锝呭暞閻濐亝绻涢崨顓熷殗闁哄矉缍侀獮鎺楀棘閸喖顬嗙紓鍌欒兌缁垶鎯勯姘辨殾婵°倕鎳庣粈鍌滅棯閹峰矂鍝烘い銉ョ墛缁绘繂鈻撻崹顔界亪闂佹寧娲╂俊鍥礆閹烘鏁嶉柣鎰皺椤斿棝姊洪崨濠勨槈闁宦板姂楠炲棝鎮欓悜妯煎幗闂佺粯姊婚…鍫ニ夌�ｎ偁浜滈柟閭﹀厵閸嬨垺鎱ㄦ繝鍕笡闁瑰嘲鎳橀幖褰掓偡閹殿噮鍋у┑锛勫亼閸婃垿宕濆畝锟介幑銏犖熼搹瑙勬闂侀潧绻堥崐鏇犵矆閸垺鍠愰幖鎼厜缂嶆牠鏌￠崶銉ョ仾闁绘挾鍠栭弻鐔兼焽閿曪拷婢т即鏌熼悾灞叫㈤柍瑙勫灴椤㈡稑鈽夊▎蹇撴敪闂備礁鎼張顒勬儎椤栫偟宓佹慨妤嬫嫹鐎殿喖鐖奸獮瀣偐閻愮懓浠繝鐢靛Х閺佹悂宕戝☉銏″亱闁告洦鍨扮粈澶岋拷骞垮劚濞诧箑鐣烽崣澶岀闁瑰瓨鐟ラ悘鈺冪磼閻欐瑥娲﹂悡娆撴倵濞戞瑯鐒界紒鐘崇墵閺屾稒绻濇惔锛勪桓濠殿喖锕ㄥ▍锝夊箯閻樿鐏崇�规洖娲ｉ崫妤呮⒒娴ｈ銇熼柛妯恒偢瀹曟劙骞栨笟鍥ㄦ櫔闂佹寧绻傞ˇ浠嬪极閸愵喗鐓忛煫鍥э攻濞呭懘鏌熼钘夌仸缂佺粯绻堟慨锟介柨婵嗘閵嗘劕顪冮妶鍡楃仴婵炲樊鍘奸悾鐑藉閵堝孩鏅滈梺鍓插亞閸熷潡骞忓ú顏呪拺闁告稑锕ョ亸鎵喐閺夊灝鏆炵紒鍌氱Т閳规垿宕奸姀顫床闂佽崵濮村ú锕併亹閸愵喖姹叉繛鍡樺姂娴滄粓鏌￠崒婵囩《缂佺姳鍗抽弻宥囨喆閸曨偆浠奸梺璺ㄥ枑閺嬭崵绱為崱娑樼；闁糕剝绋戦崒銊╂煢濡警妲撮柡锟芥禒瀣厽闁归偊鍘界紞鎴︽煟韫囨岸鍝虹紒缁樼洴瀹曘劑顢欓悾宀婃Ф闂備浇娉曢崰鏇熸叏閵堝鍋勬い鎺戝缁狀垶鏌ㄩ悤鍌涘 X 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氱紓鍌欒兌閸嬫捇宕曢幎瑙ｏ拷锕傛倻閽樺鎽曢梺鍝勬川閸犳挾绮绘ィ鍐╃厽闁逛即娼ф晶顖炴煟濠靛洦鈷掔紒杈ㄥ浮閹瑩顢楅敓浠嬪礉閵堝棛绠剧痪顓㈩棑缁★拷閻庢鍠栭…鐑藉极瀹ュ绀嬫い蹇撴噹婵即姊洪懡銈呅㈡繛璇х畳閵囨劙宕橀埡鍌氬伎闁瑰吋鐣崝宥夊煕閹达附鐓㈡俊顖欒濡叉悂鏌￠崱娆忔灈闁哄本鐩幃鈺佺暦閸パ�鎷伴柣搴㈩問閸犳牠鈥﹂柨瀣╃箚闁归棿绀侀悡娑㈡煕鐏炲墽鐓紒銊ょ矙濮婄粯鎷呮笟顖滃姼闂佸搫鐗滈崜娑氬垝濞嗘挸绠ｉ柨鏃傜帛閺呮粓姊虹捄銊ユ珢闁瑰嚖鎷�??" +
		// gpos.getX() + "Y 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氱紓鍌欒兌閸嬫捇宕曢幎瑙ｏ拷锕傛倻閽樺鎽曢梺鍝勬川閸犳挾绮绘ィ鍐╃厽闁逛即娼ф晶顖炴煟濠靛洦鈷掔紒杈ㄥ浮閹瑩顢楅敓浠嬪礉閵堝棛绠剧痪顓㈩棑缁★拷閻庢鍠栭…鐑藉极瀹ュ绀嬫い蹇撴噹婵即姊洪懡銈呅㈡繛璇х畳閵囨劙宕橀埡鍌氬伎闁瑰吋鐣崝宥夊煕閹达附鐓㈡俊顖欒濡叉悂鏌￠崱娆忔灈闁哄本鐩幃鈺佺暦閸パ�鎷伴柣搴㈩問閸犳牠鈥﹂柨瀣╃箚闁归棿绀侀悡娑㈡煕鐏炲墽鐓紒銊ょ矙濮婄粯鎷呮笟顖滃姼闂佸搫鐗滈崜娑氬垝濞嗘挸绠ｉ柨鏃傜帛閺呮粓姊虹捄銊ユ珢闁瑰嚖鎷�??" + gpos.getY());

	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730398;

	public int getType() {
		return 730398;
	}

	public fire.msp.npc.CreateNpcInfo npc;
	public int toufangareatype; // 0-普通的投放区域,1-新的投放区域,包含1级轻功

	public GCreateNPCByMap() {
		npc = new fire.msp.npc.CreateNpcInfo();
	}

	public GCreateNPCByMap(fire.msp.npc.CreateNpcInfo _npc_, int _toufangareatype_) {
		this.npc = _npc_;
		this.toufangareatype = _toufangareatype_;
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
		_os_.marshal(toufangareatype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npc.unmarshal(_os_);
		toufangareatype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GCreateNPCByMap) {
			GCreateNPCByMap _o_ = (GCreateNPCByMap)_o1_;
			if (!npc.equals(_o_.npc)) return false;
			if (toufangareatype != _o_.toufangareatype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += npc.hashCode();
		_h_ += toufangareatype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npc).append(",");
		_sb_.append(toufangareatype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}
