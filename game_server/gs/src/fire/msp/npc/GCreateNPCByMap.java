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
					SceneManager.logger.info(new StringBuilder().append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆欑穿闂備浇娉曢崰鎰板几閼姐倗涓嶉柟鎯х－閺嗭箓鏌ｉ幘鍐茬槰闁绘柨妫欑换婵嬫濞戞艾顤�闂佹悶鍊ч幏閿嬩繆閻愵亜锟姐倝宕戦崨顖涘床闁告洦鍨扮粻鏌ユ煕閺囥劌鐏￠柟顖滃仱閹綊宕堕敐鍛拤閻炴皜鍕瘈闁汇垽娼у暩闂佽桨鐒﹂幃鍌氱暦閹达附鍊烽柛婵嗗閻庮參姊洪崨濠冨矮缂侊拷娓氾拷瀵悂宕奸～顔藉妤犵偛鐏濋崝姘亜瑜濋幏椋庣磽閸屾氨校闁绘濞�瀵鏁撻悩鑼�為梺宕囧皑閹烽绱掗崡鐐碉紞闁瑰弶鎮傞幃褔宕煎┑鍫㈡噯缂傚倷绶ら幏鐑芥煕瀹�锟介崑鐐烘偂閺囥垻鍙撻柛銉ｅ姀婢规ê霉濠婂啯璐＄紒杈ㄥ笧閿熸枻缍嗘禍婵嗩啅濠靛牏纾奸弶鍫涘妽鐏忔壆绱掑Δ鍐ㄦ瀾缂佺粯绻堝畷姗�鈥﹂幋婊呭闂傚倸鍊搁崐椋庣矆娴ｅ湱鐝跺┑鐘叉搐绾惧鏌涢埄鍐槈缂佹劖顨婇弻娑㈠焺閸愬墽鍔峰銈傛櫅瀵墎鎹㈠┑鍥╃瘈闁稿本绮岄·锟介梻浣虹帛閹歌崵绮欓幘缁樻櫢闁芥ê顦遍悾顓㈡煕鎼淬劋鎲剧�规洦鍨堕、鏇㈡晲閸曨厾鐣鹃梻浣侯潒閸曞灚鐣烽梺缁樻尭閸熸挳寮诲☉妯锋瀻鐎广儱鎳庢慨銏㈢磽娴ｇ懓濮堟俊顐㈠暣瀵鍨惧畷鍥ㄦ畷闂佽法鍠嶇划娆忕暦娴兼潙鍐�妞ゆ挾鍋熼悾鍝勨攽閻樿宸ラ柣妤�妫涚划濠氭晲婢跺鍘甸梺缁樺灦钃遍悘蹇ｅ弮閺岋紕锟斤絻鍔岄敓鑺ョ箓椤繒绱掑Ο璇差�撻梺鍛婄☉閿曘儵宕曢幘缁樷拺闁告繂瀚晶閬嶆煕閹捐泛鏋涙鐐叉瀹曠喖顢涢敐鍡樻珫闂備胶绮崝娆忣焽瑜忕划濠囨晝閸屾稈鎷洪梺闈╁瘜閸樺ジ宕濈�ｎ喗鐓曢柕鍫濈箳閻ｇ數锟芥鍣崳锝夊极閹惧顩烽悗锝庝簽椤斿棝姊洪崨濠佺繁闁搞劑浜跺畷浼村幢濞戞瑧鍘遍梺鍝勬储閸斿本鏅舵繝姘厱闁绘洖鍊圭�氾拷??:").append(npc.npcbaseid)
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
					
					SceneManager.logger.error(new StringBuilder().append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆欑穿闂備浇娉曢崰鎰板几閼姐倗涓嶉柟鎯х－閺嗭箓鏌ｉ幘鍐茬槰闁绘柨妫欑换婵嬫濞戞艾顤�闂佹悶鍊ч幏閿嬩繆閻愵亜锟姐倝宕戦崨顖涘床闁告洦鍨扮粻鏌ユ煕閺囥劌鐏￠柟顖滃仱閹綊宕堕敐鍛拤閻炴皜鍕瘈闁汇垽娼у暩闂佽桨鐒﹂幃鍌氱暦閹达附鍊烽柛婵嗗閻庮參姊洪崨濠冨矮缂侊拷娓氾拷瀵悂宕奸～顔藉妤犵偛鐏濋崝姘亜瑜濋幏椋庣磽閸屾氨校闁绘濞�瀵鏁撻悩鑼�為梺宕囧皑閹烽绱掗崡鐐碉紞闁瑰弶鎮傞幃褔宕煎┑鍫㈡噯缂傚倷绶ら幏鐑芥煕瀹�锟介崑鐐烘偂閺囥垻鍙撻柛銉ｅ姀婢规ê霉濠婂啯璐＄紒杈ㄥ笧閿熸枻缍嗘禍婵嗩啅濠靛牏纾奸弶鍫涘妽鐏忔壆绱掑Δ鍐ㄦ瀾缂佺粯绻堝畷姗�鈥﹂幋婊呭闂傚倸鍊搁崐椋庣矆娴ｅ湱鐝跺┑鐘叉搐绾惧鏌涢埄鍐槈缂佹劖顨婇弻娑㈠焺閸愬墽鍔峰銈傛櫅瀵墎鎹㈠┑鍥╃瘈闁稿本绮岄·锟介梻浣虹帛閹歌崵绮欓幘缁樻櫢闁芥ê顦遍悾顓㈡煕鎼淬劋鎲剧�规洦鍨堕、鏇㈡晲閸曨厾鐣鹃梻浣侯潒閸曞灚鐣烽梺缁樻尭閸熸挳寮诲☉妯锋瀻鐎广儱鎳庢慨銏㈢磽娴ｇ懓濮堟俊顐㈠暣瀵鍨惧畷鍥ㄦ畷闂佽法鍠嶇划娆忕暦娴兼潙鍐�妞ゆ挾鍋熼悾鍝勨攽閻樿宸ラ柣妤�妫涚划濠氭晲婢跺鍘甸梺缁樺灦钃遍悘蹇ｅ弮閺岋紕锟斤絻鍔岄敓鑺ョ箓椤繒绱掑Ο璇差�撻梺鍛婄☉閿曘儵宕曢幘缁樷拺闁告繂瀚晶閬嶆煕閹捐泛鏋涙鐐叉瀹曠喖顢涢敐鍡樻珫闂備胶绮崝娆忣焽瑜忕划濠囨晝閸屾稈鎷洪梺闈╁瘜閸樺ジ宕濈�ｎ喗鐓曢柕鍫濈箳閻ｇ數锟芥鍣崳锝夊极閹惧顩烽悗锝庝簽椤斿棝姊洪崨濠佺繁闁搞劑浜跺畷浼村幢濞戞瑧鍘遍梺鍝勬储閸斿本鏅舵繝姘厱闁绘洖鍊圭�氾拷??:").append(npc.npcbaseid)
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
					SceneManager.logger.info(new StringBuilder().append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆欑穿闂備浇娉曢崰鎰板几閼姐倗涓嶉柟鎯х－閺嗭箓鏌ｉ幘鍐茬槰闁绘柨妫欑换婵嬫濞戞艾顤�闂佹悶鍊ч幏閿嬩繆閻愵亜锟姐倝宕戦崨顖涘床闁告洦鍨扮粻鏌ユ煕閺囥劌鐏￠柟顖滃仱閹綊宕堕敐鍛拤閻炴皜鍕瘈闁汇垽娼у暩闂佽桨鐒﹂幃鍌氱暦閹达附鍊烽柛婵嗗閻庮參姊洪崨濠冨矮缂侊拷娓氾拷瀵悂宕奸～顔藉妤犵偛鐏濋崝姘亜瑜濋幏椋庣磽閸屾氨校闁绘濞�瀵鏁撻悩鑼�為梺宕囧皑閹烽绱掗崡鐐碉紞闁瑰弶鎮傞幃褔宕煎┑鍫㈡噯缂傚倷绶ら幏鐑芥煕瀹�锟介崑鐐烘偂閺囥垻鍙撻柛銉ｅ姀婢规ê霉濠婂啯璐＄紒杈ㄥ笧閿熸枻缍嗘禍婵嗩啅濠靛牏纾奸弶鍫涘妽鐏忔壆绱掑Δ鍐ㄦ瀾缂佺粯绻堝畷姗�鈥﹂幋婊呭闂傚倸鍊搁崐椋庣矆娴ｅ湱鐝跺┑鐘叉搐绾惧鏌涢埄鍐槈缂佹劖顨婇弻娑㈠焺閸愬墽鍔峰銈傛櫅瀵墎鎹㈠┑鍥╃瘈闁稿本绮岄·锟介梻浣虹帛閹歌崵绮欓幘缁樻櫢闁芥ê顦遍悾顓㈡煕鎼淬劋鎲剧�规洦鍨堕、鏇㈡晲閸曨厾鐣鹃梻浣侯潒閸曞灚鐣烽梺缁樻尭閸熸挳寮诲☉妯锋瀻鐎广儱鎳庢慨銏㈢磽娴ｇ懓濮堟俊顐㈠暣瀵鍨惧畷鍥ㄦ畷闂佽法鍠嶇划娆忕暦娴兼潙鍐�妞ゆ挾鍋熼悾鍝勨攽閻樿宸ラ柣妤�妫涚划濠氭晲婢跺鍘甸梺缁樺灦钃遍悘蹇ｅ弮閺岋紕锟斤絻鍔岄敓鑺ョ箓椤繒绱掑Ο璇差�撻梺鍛婄☉閿曘儵宕曢幘缁樷拺闁告繂瀚晶閬嶆煕閹捐泛鏋涙鐐叉瀹曠喖顢涢敐鍡樻珫闂備胶绮崝娆忣焽瑜忕划濠囨晝閸屾稈鎷洪梺闈╁瘜閸樺ジ宕濈�ｎ喗鐓曢柕鍫濈箳閻ｇ數锟芥鍣崳锝夊极閹惧顩烽悗锝庝簽椤斿棝姊洪崨濠佺繁闁搞劑浜跺畷浼村幢濞戞瑧鍘遍梺鍝勬储閸斿本鏅舵繝姘厱闁绘洖鍊圭�氾拷??:").append(npc.npcbaseid)
							.append(",闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆屾晬缂傚倸鍊哥粔鐢告偋閻樿绠栨俊銈呮噺閺呮煡骞栫划鐟板⒉闁诲繐鐗忕槐鎾寸瑹婵犲啫顏堕梺璇插嚱缂嶅棝宕戞担鍦洸婵犲﹤鐗婇悡娆撴煙娴ｅ啯鐝繛鍛嚇閺岋綁骞掗弬鍨缂備胶绮惄顖氱暦濡ゅ懎绀傜痪鎷岄哺椤ュ牊绻濆▓鍨灈闁挎洩濡囬崚鎺楊敍閻愯尙顔嗛梺鍛婄☉閻°劑骞嗛悙鐑樼厽闁绘梻顭堥ˉ瀣亜閹邦兙鍋㈡慨濠勭帛閹峰懘鎼归悷鎵偧婵＄偑鍊戦崝宀�鎹㈠Ο铏规殾闁靛繈鍊曠粈鍫㈡喐鎼搭煉缍栭柡鍥ュ灪閻撶喖鏌熼柇锕�澧伴柟鐣屽Т閳规垿顢涘☉娆忓攭闂佸搫鏈惄顖炵嵁濮楋拷瀵爼骞嬮悩鐐瑰仭濠电姷鏁搁崑娑㈡偋閸曨垰绀夌�广儱娲﹀畷鍙夌箾閹寸偟鍟查柟椋庡厴閹棄鈻撶捄銊ュЪ闂佹眹鍩勯崹浼存偉婵傜钃熼柨婵嗘缁犵娀姊洪崨濠冣拹闁搞劎鏁婚幃楣冩倻閽樺顓洪梺鎸庢⒒缁垶寮插鍫熲拺闁告挻褰冩禍鐐烘煕閻樿櫕宕岀�规洩缍佸畷鍗炩槈濞嗗本瀚肩紓鍌氬�烽悞锕佹懌缂備緤鎷烽柨鐔剁矙濮婅櫣绮欓崠鈥充紣濠电媴鎷烽梺顒�绉甸弲鎼佹煠閹帒鍔ら柛鐔哥叀閺岀喖宕欓妶鍡楊伓:").append(gpos.getX())
							.append(",闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆屾晬缂傚倸鍊哥粔鐢告偋閻樿绠栨俊銈呮噺閺呮煡骞栫划鐟板⒉闁诲繐鐗忕槐鎾寸瑹婵犲啫顏堕梺璇插嚱缂嶅棝宕戞担鍦洸婵犲﹤鐗婇悡娆撴煙娴ｅ啯鐝繛鍛嚇閺岋綁骞掗弬鍨缂備胶绮惄顖氱暦濡ゅ懎绀傜痪鎷岄哺椤ュ牊绻濆▓鍨灈闁挎洩濡囬崚鎺楊敍閻愯尙顔嗛梺鍛婄☉閻°劑骞嗛悙鐑樼厽闁绘梻顭堥ˉ瀣亜閹邦兙鍋㈡慨濠勭帛閹峰懘鎼归悷鎵偧婵＄偑鍊戦崝宀�鎹㈠Ο铏规殾闁靛繈鍊曠粈鍫㈡喐鎼搭煉缍栭柡鍥ュ灪閻撶喖鏌熼柇锕�澧伴柟鐣屽Т閳规垿顢涘☉娆忓攭闂佸搫鏈惄顖炵嵁濮楋拷瀵爼骞嬮悩鐐瑰仭濠电姷鏁搁崑娑㈡偋閸曨垰绀夌�广儱娲﹀畷鍙夌箾閹寸偟鍟查柟椋庡厴閹棄鈻撶捄銊ュЪ闂佹眹鍩勯崹浼存偉婵傜钃熼柨婵嗘缁犵娀姊洪崨濠冣拹闁搞劎鏁婚幃楣冩倻閽樺宓嗛梺缁樻椤ユ挾绮ｉ悙鐑樷拺鐟滅増甯掓禍浼存煕濮楋拷缁犳牕鐣烽敐澶婂耿婵炴垶鐟㈤幏铏圭磽閸屾瑧鍔嶉拑杈╃磼閿熶粙鏁撴禒瀣拺缂佸灏呭銉︾節閿熶粙鏌嗗鍡樻闂佸吋浜介崕鎶藉疮閺屻儲鐓欓柛鎴欏�栫�氾拷:").append(gpos.getY())
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
		// System.out.println("婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘劙婀侀梺绋跨箰閸氬绱為幋锔界厱闁靛鍎遍敓钘夘煼楠炲骞栨担鐟颁罕闂佸壊鍋呯换鍕偡閺屻儲鈷戠紒瀣儥閸庡繑銇勯敂鐐毈鐎殿喖顭峰鎾晬閸曨厽婢戦梺璇插嚱缂嶅棙绂嶉悜钘夌闁绘垼妫勯崡鎶芥煏韫囧鐏╃紒渚婄畵濮婃椽妫冨☉姘辩暰闂佽法鍠庨敓鐣屽枎閻ㄨ櫣绱掗悩瀹犲妞ゎ亜鍟存俊鍫曞幢濞嗗浚娼风紓鍌欑贰閸犳牠鎯夋總绋挎瀬妞ゆ洩鎷烽柟铏矒閹粙鎮藉▓鍨櫗闂傚倷鑳堕幊鎾诲疮閸ф搴婇柟缁樺础濞差亝鏅濋柛灞炬皑閸橀亶姊洪崷顓炲妺闁搞倖淇洪妵鎰板箳閹惧瓨鐝抽梻浣告啞娓氭宕伴弽顓炴辈闁割偁鍎查埛鎴︽煕濠靛嫬鍔氶柡瀣閺屾稓锟斤絻鍔岄敓鑺ョ箞閻涱噣宕橀埡鍐炬祫闁诲函绲介悘姘跺疾椤掞拷閳规垿鎮欓弶鎴犱紘婵＄偛鐡ㄩ幃鍌炲箖妤ｅ啯鍤冮柍鍝勫暟閿涙繃绻涢幘纾嬪婵炲眰鍊濆鎼佹偄閸忚偐鍘介梺缁樻煥瀵泛鈻嶆繝鍥ㄧ厽婵炴垵宕弸銈夋煥閻斿憡鐏紓宥呮瀹曟澘螖閸涱厾锛涢梺瑙勫婢ф鎮￠悢鍏肩厪闊洤顑呴悞娲煛閸℃鐭岀紒杈ㄥ笚濞煎繘濡搁妷銏＄亞婵犳鍠栭敃锔惧垝椤栫偛绠柛娑卞灣妞规娊鎮楅敐搴′簽缂佸鍏樺缁樻媴娓氼垳鍔搁柣搴㈢▓閺呮粎鎹㈠☉娆戠瘈闁搞儯鍎婚幏閿嬫媴閸撳弶鍍垫俊顐ゅ缁诲啴寮查敐澶嬧拺闂侇偆鍋涢懟顖涙櫠妤ｅ啯鐓欏瀣閸樺锟借娲忛崝鎴濐嚕閸洖绠ｉ柨婵嗘閸熸椽姊婚崒娆戠獢婵炰匠鍤躲劑鏁撻挊澶嗘斀闁炽儴娅曢崰妯硷拷瑙勬磸閸ㄨ棄鐣烽敓鐘冲�烽柍鍝勫�归弶鎼佹⒒娴ｈ櫣甯涙い顓炴川閸掓帡顢涘锝嗩潔閻熸粌瀛╃粚杈ㄧ節閸ヨ埖鏅濆銈嗗姂閸ㄥ湱绮昏ぐ鎺撯拺鐎规洖娲ㄧ敮娑㈡煙閸涘﹤鍔ゆい鏇秬椤﹀綊鏌℃担瑙勫磳闁轰焦鎹囬弫鎾绘晸閿燂拷 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡欏闁靛棗鍟撮弻锝夊箳閹搭垵鍚梺鍝勬湰缁嬫垿鍩ユ径濞炬瀻闁归偊鍠氶埢蹇曠磽閸屾瑨鍏屽┑顖ｅ弮瀹曞綊宕奸弴鐐舵憰闂侀潧艌閺呮粓宕戦崱娑欑厱閻忕偛澧介埥澶嬨亜韫囥儲瀚�? " + n.getName() + "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆屾晬缂傚倸鍊哥粔鐢告偋閻樿绠栨俊銈呮噺閺呮煡骞栫划鐟板⒉闁诲繐鐗忕槐鎾寸瑹婵犲啫顏堕梺璇插嚱缂嶅棝宕戞担鍦洸婵犲﹤鐗婇悡娆撴煙娴ｅ啯鐝繛鍛嚇閺岋綁骞掗弬鍨缂備胶绮惄顖氱暦濡ゅ懎绀傜痪鎷岄哺椤ュ牊绻濆▓鍨灈闁挎洩濡囬崚鎺楊敍閻愯尙顔嗛梺鍛婄☉閻°劑骞嗛悙鐑樼厽闁绘梻顭堥ˉ瀣亜閹邦兙鍋㈡慨濠勭帛閹峰懘鎼归悷鎵偧婵＄偑鍊戦崝宀�鎹㈠Ο铏规殾闁靛繈鍊曠粈鍫㈡喐鎼搭煉缍栭柡鍥ュ灪閻撶喖鏌熼柇锕�澧伴柟鐣屽Т閳规垿顢涘☉娆忓攭闂佸搫鏈惄顖炵嵁濮楋拷瀵爼骞嬮悩鐐瑰仭濠电姷鏁搁崑娑㈡偋閸曨垰绀夌�广儱娲﹀畷鍙夌箾閹存瑥鐏╃紒鐙欏洦鐓欓悗娑欘焽缁犳牠鏌涙繝搴＄仸婵﹨娅ｉ幏鐘诲灳瀹曞洣鍝楅梻浣规た閸樺ジ宕愰幖渚囨晪闁挎繂顦介弫鍐煏韫囧﹥娅呴柟顔藉灦缁绘繈濮�閿濆棛銆愬銈嗗灥濞差厼鐣烽姀銈庢晜闁割偆鍟块幏娲⒑閸涘﹥灏扮憸鏉垮暞缁傚秴鈹戦崼銏紲闁荤姴娲﹁ぐ鍐汲濞嗘劑浜滈柡鍌濇硶缁犱即鏌嶇憴鍕仼闁跨喐鏋荤紞鍡涘磻閸℃稑鍌ㄩ柦妯侯槴閺�浠嬫煟閹邦厽缍戦柣蹇氶哺缁绘盯宕ㄩ鐣岊槶闂佽法鍠曟慨銈夋偄椤掑嫬绠柨鐕傛嫹 X 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К缂備胶鍋撻崕鎶解�﹂悜钘夎摕闁哄洨鍠撶粻楣冩煟閹伴潧澧柣婵囨⒒缁辨帡鎮欓锟介崝銈嗙箾绾绡�鐎殿喖顭烽弫宥夊礋椤忓懎濯伴梺鑽ゅТ濞诧箒銇愰崘鈺傚弿閹兼番鍔嶉埛鎴︽煢濡警妲搁柡鍡欏枛閺屾盯鎮╁畷鍥р拰閻庢鍠栭…閿嬩繆閹间礁鐓涢柛灞剧煯缁ㄤ粙姊绘担渚劸闁哄牜鍓涚划娆撳箣閿旂粯鏅滈梺璺ㄥ櫐閹凤拷??" +
		// gpos.getX() + "Y 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К缂備胶鍋撻崕鎶解�﹂悜钘夎摕闁哄洨鍠撶粻楣冩煟閹伴潧澧柣婵囨⒒缁辨帡鎮欓锟介崝銈嗙箾绾绡�鐎殿喖顭烽弫宥夊礋椤忓懎濯伴梺鑽ゅТ濞诧箒銇愰崘鈺傚弿閹兼番鍔嶉埛鎴︽煢濡警妲搁柡鍡欏枛閺屾盯鎮╁畷鍥р拰閻庢鍠栭…閿嬩繆閹间礁鐓涢柛灞剧煯缁ㄤ粙姊绘担渚劸闁哄牜鍓涚划娆撳箣閿旂粯鏅滈梺璺ㄥ櫐閹凤拷??" + gpos.getY());

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
