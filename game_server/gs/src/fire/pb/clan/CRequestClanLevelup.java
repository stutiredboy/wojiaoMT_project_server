
package fire.pb.clan;

import java.util.ArrayList;
import java.util.List;

import fire.log.beans.ClanBuildUPBean;
import fire.log.beans.FactionOpbean;
import fire.pb.clan.srv.ClanManage;
import fire.pb.clan.srv.ClanRank;
import fire.pb.talk.MessageMgr;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestClanLevelup__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRequestClanLevelup extends __CRequestClanLevelup__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		/***
		 * 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸崹楣冨箛娴ｅ湱绋佺紓鍌氬�烽悞锕傗�﹂崶鈺冧笉濡わ絽鍟悡銉╂煟閺傚灝顣抽柣顓熺懇閺屸�崇暆鐎ｎ剛鐦堥梺杞扮劍閹歌崵绮嬮幒鏃撴嫹閿濆骸浜濇繛鍛矒濮婅櫣鍖栭弴鐐测拤闂佸憡姊圭敮鐐烘嚍鏉堛劎绡�婵﹩鍘搁幏娲⒑閸涘﹦鈽夐柨鏇缁骞樼紒妯猴拷鍨叏濡厧甯堕柡瀣ㄥ�濋弻娑㈡偐鐠囇冧紣闂佷紮缍囩换婵嬪箖閻愮鎷风憴鍕暬ion2->role by changhao
		 */
		mkdb.Procedure requestfactionlevelup = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				SClanLevelup sClanLevelup = new SClanLevelup();
				
				Long factionid = xtable.Roleidclan.select(roleid);
				xbean.ClanInfo clan = xtable.Clans.get(factionid);
				
				if (clan.getClanmaster() != roleid && clan.getClanvicemaster() != roleid)
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 150127, null);
					return true;
				}
				
				int money = clan.getMoney();
				int uplevel=0;//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐椤曞棙瀚归柛鎰靛枛瀹告繃銇勯幒鎴濇倯婵＄偠濮ゆ穱濠囧箹娴ｈ娅嗙紓鍌欑劍閿曗晠宕澶嬧拻濞达綀顫夐崑鐘绘煕鎼淬垺銇濈�规洘绮岄埢搴ㄥ箣閻愬弶鐎梻浣瑰濞叉牠宕愰崫銉т笉鐟滅増甯掔痪褔鏌涢锝囩畵闁抽攱姊荤槐鎺旓拷锝庝憾閻撳ジ鏌″畝瀣М闁轰焦鍔欏畷鐓庮煥閸愨晛鍓电紓鍌氬�峰ù鍥ㄣ仈閸濄儲鏆滈柟鐑橆殔閻撯�愁熆鐠轰警鐓繛绗哄姂閺屾盯鍩勯崘鍓у姶闂侀潧顭紓姘辨崲閸℃稒鐓忛柛顐ｇ箖閹兼劖銇勬惔銏″磳闁哄瞼鍠栧畷娆撳Χ閸℃浼�
				int cost=0;//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓闁搞劌鍊块弻锝夊閻樺啿鏆堥梺绋款儏椤戝寮婚妸鈺傚亞闁稿本绋戦锟�??
				int opid=0;//
				if (id == ClanManage.Lobby) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿顦甸弻鏇＄疀鐎ｎ亷鎷烽弴鐘电焼闁告劦鍠楅悡蹇撯攽閻樿尙绠版い鈺婂墴閺屾洟宕卞Ο鍝勵潚濠殿喖锕︾划顖炲箯閸涙潙宸濆┑鐘插�瑰▓妯讳繆閻愵亜锟芥垿宕濆畝鍕疇閹艰揪绲藉鏌ユ⒒娓氾拷濞佳団�﹂鐙呮嫹闂堟稖瀚伴柍缁樻尰缁傛帞锟斤綆鍋嗛崣鍡涙⒑缂佹ɑ绀�闁稿﹤婀遍敓鑺ョ啲閹凤拷 by changhao
				{
					int level = clan.getClanlevel();
					int sumlevel = 0;
					sumlevel += clan.getHouse().get(ClanManage.GoldBank);
					sumlevel += clan.getHouse().get(ClanManage.DrugStone);
					sumlevel += clan.getHouse().get(ClanManage.Hotel);

					fire.pb.clan.SClanLobby lobby =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanLobby.class).get(level);
					if (lobby == null)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 143583, null);
						return true;
					}
				
					fire.pb.clan.SClanLobby l =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanLobby.class).get(level + 1);
					if (l == null) //濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚敐澶婄闁挎繂妫Λ鍕磽娓氬﹥瀚归梺绋挎湰缁嬫帡宕ｈ箛鏂剧箚闁靛牆鎷嬮崕鎰版倵濮橆剛绉洪柟顔筋殘閹叉挳宕熼鍌ゆО闂備焦瀵х喊宥夊Φ閸曨垰绠婚柣鎰娴狀噣鎮楃憴鍕８闁告梹鍨块妴浣割潨閿熶粙骞冮鍫濆窛妞ゆ牗鍑瑰Σ杈ㄧ節閻㈤潧啸闁轰焦鎮傚畷鎴︽偐鐠囪尙顔屽銈呯箰閻楀棛绮婚鐐寸叆闁绘洖鍊圭�氾拷? by changhao
					{
						java.util.ArrayList<String> args = new java.util.ArrayList<String>();
						Integer s = level;
						args.add(s.toString());
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160226, args);
						return true;						
					}
					
					int sum = lobby.othersum;
					if (sumlevel < sum) //闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ㄩ弮鍥棄闁跨喕妫勫锟犲蓟閵娾晛鍗抽柣鎰嚋閹风柉銇愰幒鎴狅紵闂佺鎻梽鍕偂閻旈晲绻嗛柕鍫濈箲鐎氬綊姊虹紒姗嗘當缂佺粯锕㈠畷娲閵堝懐鐫勯梺绋跨焿闂勫嫮锟芥俺顫夐〃銉╂倷閼碱兛铏庨梺鍛婃⒐瀹�鎼佸蓟閻旈鏆嬮梺顓ㄧ畱閸撴澘顪冮妶搴″闁挎洦浜顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷 by changhao
					{
						//java.util.List<String> parameters = new java.util.ArrayList<String>();
						//parameters.add(attr.name);
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160225, null);
						return true;
					}
				
					if (money < ClanUtils.getBuildLevelupMax(clan).get(ClanManage.Lobby)) //闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌ｉ姀銏╃劸缂侊拷婢舵劖鐓ラ柡鍥╁仜閿熻棄鎽滅划锝呂旈崨顔惧幐閻庡箍鍎辨鍝ユ暜閻愮儤鐓曢柕澶樺枛婢у鏌℃担鍛婎棦闁哄本鐩鎾Ω閵夈儺娼婚梻浣告啞閹尖晠宕ｉ崘顭戞綎婵炲樊浜滃婵嗏攽閻樻彃鏆欐い锔规櫊濮婃椽骞栭悙鎻掝瀴濠电姰鍨洪敃銏ゅ春閵忕媭鍚嬪璺好￠埡鍛厓闁告繂瀚敓鐣屾暬楠炲繐煤椤忓應鎷洪梺鍏间航閸庡秹顢旈崺璺烘喘椤㈡稑顭ㄩ崨顖ｆЦ濠电偠鎻紞锟芥繛鍜冪悼婢规洟宕楅梻瀵哥畾闂侀潧鐗嗙换鎴狅拷姘辨嚀椤啴濡惰箛鏇犳殼婵炲瓨绮岄悥濂告偘椤曪拷瀵粙顢橀悢鍛婎仧闂備浇娉曢崳锕傚箯閿燂拷? by changhao
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔鏌ユ晸閽樺锟藉潡銆佸▎鎾崇鐟滃繘藝椤栨稓绠鹃柟鎯ь嚟閸熸煡鏌熼悜鑺ユ暠妞ゃ劊鍎甸幃娆撳级閹存繍娼氶梻浣芥〃閻掞箓骞戦崶顒�鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘 by changhao
					boolean ok = ClanManage.AddClanMoney(-lobby.levelupcost, clan);
					if (ok == false)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					clan.setClanlevel(level + 1);
					
					sClanLevelup.change.put(ClanManage.Lobby, level + 1);
					sClanLevelup.money = clan.getMoney();	
					uplevel=level + 1;//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐椤曞棙瀚归柛鎰靛枛瀹告繃銇勯幒鎴濇倯婵＄偠濮ゆ穱濠囧箹娴ｈ娅嗙紓鍌欑劍閿曗晠宕澶嬧拻濞达綀顫夐崑鐘绘煕鎼淬垺銇濈�规洘绮岄埢搴ㄥ箣閻愬弶鐎梻浣瑰濞叉牠宕愰崫銉т笉鐟滅増甯掔痪褔鏌涢锝囩畵闁抽攱姊荤槐鎺旓拷锝庝憾閻撳ジ鏌″畝瀣М闁轰焦鍔欏畷鐓庮煥閸愨晛鍓电紓鍌氬�峰ù鍥ㄣ仈閸濄儲鏆滈柟鐑橆殔閻撯�愁熆鐠轰警鐓繛绗哄姂閺屾盯鍩勯崘鍓у姶闂侀潧顭紓姘辨崲閸℃稒鐓忛柛顐ｇ箖閹兼劖銇勬惔銏″磳闁哄瞼鍠栧畷娆撳Χ閸℃浼�
					cost=lobby.levelupcost;//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓闁搞劌鍊块弻锝夊閻樺啿鏆堥梺绋款儏椤戝寮婚妸鈺傚亞闁稿本绋戦锟�??
					opid=FactionOpbean.TYPE_LOBBY_UP;
					
					SendAllFactionMemeber(clan, ClanManage.Lobby, level + 1);
					
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠煕濮橆厽銇濆┑陇鍩栧鍕拷锝庝簷濡叉劙姊绘笟锟藉褑澧濋梺鍝勬噺閻╊垶骞忛幋锔藉亜閻忓繋鐒﹂弬锟介梻浣虹帛閿氱�殿喖鐖奸獮鏍箛椤斿墽锛滈梺璺ㄥ枍缁瑥鐣烽幒鎴旀闁哄稄濡囬惄搴ㄦ⒒娴ｄ警鏀伴柟娲讳簽瀵板﹪宕滆閸忔粓鏌涢幘鑼跺厡缁炬儳銈搁弻鐔兼焽閿曪拷瀵偓绻涢崼鐕佺劷缂佽鲸甯楀蹇涘Ω閵壯呮噯闂備礁鐤囧Λ鍕囬鐑囩稏婵犲﹤鐗嗛獮銏′繆椤栨粌浜奸柛鏂跨У缁岃鲸绻濋崶顬囨煕閵夘喚浠㈤柕蹇ョ磿缁犲墽锟界懓澹婇崰鏍ь嚕椤曪拷閺岋絽鈽夐崡鐐寸彎濡ょ姷鍋炵敮鎺曠亙闂佽法鍠撻弲顐ゅ垝婵犳艾绠柤鎭掑劤閸樻悂姊洪幖鐐插姌闁稿氦椴告穱濠冪鐎ｎ偆鍘搁梺绋跨焿闂勫嫮锟芥熬鎷� by changhao
					mkdb.Procedure.pexecuteWhileCommit(new ClanRank(clan.toData()));
					mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PFactionZongHeProc(clan.getKey(), false));
					mkdb.Procedure.pexecuteWhileCommit(new fire.pb.clan.fight.PClanFightUpdateClanLevel(clan.getKey(), clan.getClanlevel()));
				}
				else if (id == ClanManage.GoldBank)
				{
					int level = clan.getHouse().get(ClanManage.GoldBank);
					fire.pb.clan.SClanGoldBank bank =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanGoldBank.class).get(level);
					if (bank == null)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 143583, null);
						return true;
					}
				
					fire.pb.clan.SClanGoldBank l =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanGoldBank.class).get(level + 1);
					if (l == null) //濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚敐澶婄闁挎繂妫Λ鍕磽娓氬﹥瀚归梺绋挎湰缁嬫帡宕ｈ箛鏂剧箚闁靛牆鎷嬮崕鎰版倵濮橆剛绉洪柟顔筋殘閹叉挳宕熼鍌ゆО闂備焦瀵х喊宥夊Φ閸曨垰绠婚柣鎰娴狀噣鎮楃憴鍕８闁告梹鍨块妴浣割潨閿熶粙骞冮鍫濆窛妞ゆ牗鍑瑰Σ杈ㄧ節閻㈤潧啸闁轰焦鎮傚畷鎴︽偐鐠囪尙顔屽銈呯箰閻楀棛绮婚鐐寸叆闁绘洖鍊圭�氾拷? by changhao
					{
						java.util.ArrayList<String> args = new java.util.ArrayList<String>();
						Integer s = level;
						args.add(s.toString());
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160226, args);
						return true;						
					}
					
					if (money < ClanUtils.getBuildLevelupMax(clan).get(ClanManage.GoldBank)) //闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌ｉ姀銏╃劸缂侊拷婢舵劖鐓ラ柡鍥╁仜閿熻棄鎽滅划锝呂旈崨顔惧幐閻庡箍鍎辨鍝ユ暜閻愮儤鐓曢柕澶樺枛婢у鏌℃担鍛婎棦闁哄本鐩鎾Ω閵夈儺娼婚梻浣告啞閹尖晠宕ｉ崘顭戞綎婵炲樊浜滃婵嗏攽閻樻彃鏆欐い锔规櫊濮婃椽骞栭悙鎻掝瀴濠电姰鍨洪敃銏ゅ春閵忕媭鍚嬪璺好￠埡鍛厓闁告繂瀚敓鐣屾暬楠炲繐煤椤忓應鎷洪梺鍏间航閸庡秹顢旈崺璺烘喘椤㈡稑顭ㄩ崨顖ｆЦ濠电偠鎻紞锟芥繛鍜冪悼婢规洟宕楅梻瀵哥畾闂侀潧鐗嗙换鎴狅拷姘辨嚀椤啴濡惰箛鏇犳殼婵炲瓨绮岄悥濂告偘椤曪拷瀵粙顢橀悢鍛婎仧闂備浇娉曢崳锕傚箯閿燂拷? by changhao
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔鏌ユ晸閽樺锟藉潡銆佸▎鎾崇鐟滃繘藝椤栨稓绠鹃柟鎯ь嚟閸熸煡鏌熼悜鑺ユ暠妞ゃ劊鍎甸幃娆撳级閹存繍娼氶梻浣芥〃閻掞箓骞戦崶顒�鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘 by changhao
					boolean ok = ClanManage.AddClanMoney(-bank.levelupcost, clan);
					if (ok == false)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					clan.getHouse().put(ClanManage.GoldBank, level + 1);
					
					sClanLevelup.change.put(ClanManage.GoldBank, level + 1);
					sClanLevelup.money = clan.getMoney();	
					uplevel=level + 1;//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐椤曞棙瀚归柛鎰靛枛瀹告繃銇勯幒鎴濇倯婵＄偠濮ゆ穱濠囧箹娴ｈ娅嗙紓鍌欑劍閿曗晠宕澶嬧拻濞达綀顫夐崑鐘绘煕鎼淬垺銇濈�规洘绮岄埢搴ㄥ箣閻愬弶鐎梻浣瑰濞叉牠宕愰崫銉т笉鐟滅増甯掔痪褔鏌涢锝囩畵闁抽攱姊荤槐鎺旓拷锝庝憾閻撳ジ鏌″畝瀣М闁轰焦鍔欏畷鐓庮煥閸愨晛鍓电紓鍌氬�峰ù鍥ㄣ仈閸濄儲鏆滈柟鐑橆殔閻撯�愁熆鐠轰警鐓繛绗哄姂閺屾盯鍩勯崘鍓у姶闂侀潧顭紓姘辨崲閸℃稒鐓忛柛顐ｇ箖閹兼劖銇勬惔銏″磳闁哄瞼鍠栧畷娆撳Χ閸℃浼�
					cost=bank.levelupcost;//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓闁搞劌鍊块弻锝夊閻樺啿鏆堥梺绋款儏椤戝寮婚妸鈺傚亞闁稿本绋戦锟�??
					opid=FactionOpbean.TYPE_GOLD_UP;
					
					SendAllFactionMemeber(clan, ClanManage.GoldBank, level + 1);
				}
				else if (id == ClanManage.DrugStone)
				{
					int level = clan.getHouse().get(ClanManage.DrugStone);
					fire.pb.clan.SClanDrugstore drugstone =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanDrugstore.class).get(level);
					if (drugstone == null)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 143583, null);
						return true;
					}
				
					fire.pb.clan.SClanDrugstore l =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanDrugstore.class).get(level + 1);
					if (l == null) //濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚敐澶婄闁挎繂妫Λ鍕磽娓氬﹥瀚归梺绋挎湰缁嬫帡宕ｈ箛鏂剧箚闁靛牆鎷嬮崕鎰版倵濮橆剛绉洪柟顔筋殘閹叉挳宕熼鍌ゆО闂備焦瀵х喊宥夊Φ閸曨垰绠婚柣鎰娴狀噣鎮楃憴鍕８闁告梹鍨块妴浣割潨閿熶粙骞冮鍫濆窛妞ゆ牗鍑瑰Σ杈ㄧ節閻㈤潧啸闁轰焦鎮傚畷鎴︽偐鐠囪尙顔屽銈呯箰閻楀棛绮婚鐐寸叆闁绘洖鍊圭�氾拷? by changhao
					{
						java.util.ArrayList<String> args = new java.util.ArrayList<String>();
						Integer s = level;
						args.add(s.toString());
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160226, args);
						return true;						
					}
					
					if (money < ClanUtils.getBuildLevelupMax(clan).get(ClanManage.DrugStone)) //闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌ｉ姀銏╃劸缂侊拷婢舵劖鐓ラ柡鍥╁仜閿熻棄鎽滅划锝呂旈崨顔惧幐閻庡箍鍎辨鍝ユ暜閻愮儤鐓曢柕澶樺枛婢у鏌℃担鍛婎棦闁哄本鐩鎾Ω閵夈儺娼婚梻浣告啞閹尖晠宕ｉ崘顭戞綎婵炲樊浜滃婵嗏攽閻樻彃鏆欐い锔规櫊濮婃椽骞栭悙鎻掝瀴濠电姰鍨洪敃銏ゅ春閵忕媭鍚嬪璺好￠埡鍛厓闁告繂瀚敓鐣屾暬楠炲繐煤椤忓應鎷洪梺鍏间航閸庡秹顢旈崺璺烘喘椤㈡稑顭ㄩ崨顖ｆЦ濠电偠鎻紞锟芥繛鍜冪悼婢规洟宕楅梻瀵哥畾闂侀潧鐗嗙换鎴狅拷姘辨嚀椤啴濡惰箛鏇犳殼婵炲瓨绮岄悥濂告偘椤曪拷瀵粙顢橀悢鍛婎仧闂備浇娉曢崳锕傚箯閿燂拷? by changhao
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔鏌ユ晸閽樺锟藉潡銆佸▎鎾崇鐟滃繘藝椤栨稓绠鹃柟鎯ь嚟閸熸煡鏌熼悜鑺ユ暠妞ゃ劊鍎甸幃娆撳级閹存繍娼氶梻浣芥〃閻掞箓骞戦崶顒�鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘 by changhao
					boolean ok = ClanManage.AddClanMoney(-drugstone.levelupcost, clan);
					if (ok == false)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					clan.getHouse().put(ClanManage.DrugStone, level + 1);
					
					sClanLevelup.change.put(ClanManage.DrugStone, level + 1);
					sClanLevelup.money = clan.getMoney();
					
					uplevel=level + 1;//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐椤曞棙瀚归柛鎰靛枛瀹告繃銇勯幒鎴濇倯婵＄偠濮ゆ穱濠囧箹娴ｈ娅嗙紓鍌欑劍閿曗晠宕澶嬧拻濞达綀顫夐崑鐘绘煕鎼淬垺銇濈�规洘绮岄埢搴ㄥ箣閻愬弶鐎梻浣瑰濞叉牠宕愰崫銉т笉鐟滅増甯掔痪褔鏌涢锝囩畵闁抽攱姊荤槐鎺旓拷锝庝憾閻撳ジ鏌″畝瀣М闁轰焦鍔欏畷鐓庮煥閸愨晛鍓电紓鍌氬�峰ù鍥ㄣ仈閸濄儲鏆滈柟鐑橆殔閻撯�愁熆鐠轰警鐓繛绗哄姂閺屾盯鍩勯崘鍓у姶闂侀潧顭紓姘辨崲閸℃稒鐓忛柛顐ｇ箖閹兼劖銇勬惔銏″磳闁哄瞼鍠栧畷娆撳Χ閸℃浼�
					cost=drugstone.levelupcost;//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓闁搞劌鍊块弻锝夊閻樺啿鏆堥梺绋款儏椤戝寮婚妸鈺傚亞闁稿本绋戦锟�??
					opid=FactionOpbean.TYPE_DRUGSTONE_UP;
					
					SendAllFactionMemeber(clan, ClanManage.DrugStone, level + 1);
					//濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倿鏌ｉ幘宕囧哺闁哄鐗楃换娑㈠箣閻愰潧鏆￠梺鐟板槻閸㈡煡锝炲┑瀣亗閹兼番鍨昏ぐ搴繆閵堝洤啸闁稿鐩畷顖烆敍濠婂嫬搴婂┑鐘绘涧椤戝懐绮堥崘顔界厽闁逛即娼ч崢鍝ョ磼椤曞懎鐏＄紒缁樼箘閸犲﹤螣濞茬粯缍夐梻浣规偠閸旀垶绂嶉崼鏇橈拷渚�寮借閺嬪酣鏌熼幆褏鏋冪悮婵嬫⒒娴ｈ鍋犻柛搴㈡そ瀹曟粌顫濋懜闈涗簵闂佸搫娲㈤崹娲偂濞嗘挻鐓熼柟瀵稿�栭幋锕�鐓曢柟鎵閻撶喖鏌熼悜妯荤缁绢厼鐖奸弻銊╂偄閸戙倖瀚归柣鏇氱劍缂嶅牓姊洪悷鐗堝暈闁诡喖鍊搁悾鐑藉箛閺夊潡鏁滃┑掳鍊ч幏鐑芥煢閸愵亜鏋涢柡灞剧☉閳藉鈻庨幇顔锯枏闂備礁鎲￠悷銉╂晝椤忓牊鍋傛い鎰剁畱閻愬﹪鏌曟繝蹇擃洭妞わ负鍎崇槐鎾存媴鐟欏嫷妫栭梺鐟板殩閹凤拷
					if(level==0){
						mkdb.Procedure proc=fire.pb.clan.srv.ClanManage.refreshMedic(clan.getKey());
						mkdb.Procedure.pexecuteWhileCommit(proc);
					}
				}
				else if (id == ClanManage.Hotel)
				{
					int level = clan.getHouse().get(ClanManage.Hotel);
					fire.pb.clan.SClanHotel hotel =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanHotel.class).get(level);
					if (hotel == null)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 143583, null);
						return true;
					}
				
					fire.pb.clan.SClanDrugstore l =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanDrugstore.class).get(level + 1);
					if (l == null) //濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚敐澶婄闁挎繂妫Λ鍕磽娓氬﹥瀚归梺绋挎湰缁嬫帡宕ｈ箛鏂剧箚闁靛牆鎷嬮崕鎰版倵濮橆剛绉洪柟顔筋殘閹叉挳宕熼鍌ゆО闂備焦瀵х喊宥夊Φ閸曨垰绠婚柣鎰娴狀噣鎮楃憴鍕８闁告梹鍨块妴浣割潨閿熶粙骞冮鍫濆窛妞ゆ牗鍑瑰Σ杈ㄧ節閻㈤潧啸闁轰焦鎮傚畷鎴︽偐鐠囪尙顔屽銈呯箰閻楀棛绮婚鐐寸叆闁绘洖鍊圭�氾拷? by changhao
					{
						java.util.ArrayList<String> args = new java.util.ArrayList<String>();
						Integer s = level;
						args.add(s.toString());
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160226, args);
						return true;						
					}
					
					if (money < ClanUtils.getBuildLevelupMax(clan).get(ClanManage.Hotel)) //闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌ｉ姀銏╃劸缂侊拷婢舵劖鐓ラ柡鍥╁仜閿熻棄鎽滅划锝呂旈崨顔惧幐閻庡箍鍎辨鍝ユ暜閻愮儤鐓曢柕澶樺枛婢у鏌℃担鍛婎棦闁哄本鐩鎾Ω閵夈儺娼婚梻浣告啞閹尖晠宕ｉ崘顭戞綎婵炲樊浜滃婵嗏攽閻樻彃鏆欐い锔规櫊濮婃椽骞栭悙鎻掝瀴濠电姰鍨洪敃銏ゅ春閵忕媭鍚嬪璺好￠埡鍛厓闁告繂瀚敓鐣屾暬楠炲繐煤椤忓應鎷洪梺鍏间航閸庡秹顢旈崺璺烘喘椤㈡稑顭ㄩ崨顖ｆЦ濠电偠鎻紞锟芥繛鍜冪悼婢规洟宕楅梻瀵哥畾闂侀潧鐗嗙换鎴狅拷姘辨嚀椤啴濡惰箛鏇犳殼婵炲瓨绮岄悥濂告偘椤曪拷瀵粙顢橀悢鍛婎仧闂備浇娉曢崳锕傚箯閿燂拷? by changhao
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔鏌ユ晸閽樺锟藉潡銆佸▎鎾崇鐟滃繘藝椤栨稓绠鹃柟鎯ь嚟閸熸煡鏌熼悜鑺ユ暠妞ゃ劊鍎甸幃娆撳级閹存繍娼氶梻浣芥〃閻掞箓骞戦崶顒�鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘 by changhao
					boolean ok = ClanManage.AddClanMoney(-hotel.levelupcost, clan);
					if (ok == false)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					clan.getHouse().put(ClanManage.Hotel, level + 1);
					
					sClanLevelup.change.put(ClanManage.Hotel, level + 1);
					sClanLevelup.money = clan.getMoney();
					uplevel=level + 1;//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐椤曞棙瀚归柛鎰靛枛瀹告繃銇勯幒鎴濇倯婵＄偠濮ゆ穱濠囧箹娴ｈ娅嗙紓鍌欑劍閿曗晠宕澶嬧拻濞达綀顫夐崑鐘绘煕鎼淬垺銇濈�规洘绮岄埢搴ㄥ箣閻愬弶鐎梻浣瑰濞叉牠宕愰崫銉т笉鐟滅増甯掔痪褔鏌涢锝囩畵闁抽攱姊荤槐鎺旓拷锝庝憾閻撳ジ鏌″畝瀣М闁轰焦鍔欏畷鐓庮煥閸愨晛鍓电紓鍌氬�峰ù鍥ㄣ仈閸濄儲鏆滈柟鐑橆殔閻撯�愁熆鐠轰警鐓繛绗哄姂閺屾盯鍩勯崘鍓у姶闂侀潧顭紓姘辨崲閸℃稒鐓忛柛顐ｇ箖閹兼劖銇勬惔銏″磳闁哄瞼鍠栧畷娆撳Χ閸℃浼�
					cost=hotel.levelupcost;//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓闁搞劌鍊块弻锝夊閻樺啿鏆堥梺绋款儏椤戝寮婚妸鈺傚亞闁稿本绋戦锟�??
					opid=FactionOpbean.TYPE_HOTEL_UP;
					
					SendAllFactionMemeber(clan, ClanManage.Hotel, level + 1);
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠煕濮橆厽銇濆┑陇鍩栧鍕拷锝庝簷濡叉劙姊绘笟锟藉褑澧濋梺鍝勬噺閻╊垶骞忛幋锔藉亜閻忓繋鐒﹂弬锟介梻浣虹帛閿氱�殿喖鐖奸獮鏍箛椤斿墽锛滈梺璺ㄥ枍缁瑥鐣烽幒鎴旀闁哄稄濡囬惄搴ㄦ⒒娴ｄ警鏀伴柟娲讳簽瀵板﹪宕滆閸忔粓鏌涢幘鑼跺厡缁炬儳銈搁弻鐔兼焽閿曪拷瀵偓绻涢崼鐕佺劷缂佽鲸甯楀蹇涘Ω閵壯呮噯闂備礁鐤囧Λ鍕囬鐑囩稏婵犲﹤鐗嗛獮銏′繆椤栨粌浜奸柛鏂跨У缁岃鲸绻濋崶顬囨煕閵夘喚浠㈤柕蹇ョ磿缁犲墽锟界懓澹婇崰鏍ь嚕椤曪拷閺岋絽鈽夐崡鐐寸彎濡ょ姷鍋炵敮鎺曠亙闂佽法鍠撻弲顐ゅ垝婵犳艾绠柤鎭掑劤閸樻悂姊洪幖鐐插姌闁稿氦椴告穱濠冪鐎ｎ偆鍘搁梺绋跨焿闂勫嫮锟芥熬鎷� by changhao
					mkdb.Procedure.pexecuteWhileCommit(new ClanRank(clan.toData()));
					mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PFactionZongHeProc(clan.getKey(), false));
				}
				
				sClanLevelup.costmax.putAll(ClanUtils.getBuildLevelupMax(clan));
				mkdb.Procedure.psendWhileCommit(clan.getMembers().keySet(), sClanLevelup); //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁�濠囨煥閻旇袚缂佺粯鐩畷顏堝礃椤忓柊婊堟⒑绾懏鐝紒顔芥尭閻ｉ攱绺界粙鍨祮闂佺粯鏌ㄩ幖顐︾嵁瀹ュ鈷掑ù锝堝Г绾爼鏌涢敐蹇曠暤妤犵偛绻橀弫鎾绘晸閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎽傜�ｎ喖鐐婃い鎺戭槹閺呪晠姊虹紒妯哄Е闁告搫绠戦…鍥偄閸濄儳顔曢梺鍝勵槹閸ㄧ敻骞冮幋鐐电闁稿繗鍋愰幊鍐┿亜閺傝法绠婚柡浣规崌閺佹捇鏁撻敓锟�? by changhao
				//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾粌顣虹紓渚婃嫹濠㈣泛顑嗛崣蹇斾繆閵堝拋鍎愰悗姘辨嚀铻栭柣姗�娼ф禒婊勪繆椤愶絿绠炵�殿噮鍋婇獮妯硷拷闈涘濞村嫰鏌ｆ惔顖滅У闁稿妫濆畷銏ゅ箹娴ｅ厜鎷洪梺鍛婄☉閿曘倖鎱ㄨ缁辨帡鎮╅崘鑼紝閻庤娲樼换鍌烇綖濠靛洦缍囬柍鍝勫枦缁辨彃鈹戦悙瀛樼稇闁告艾顑夐幃鐑芥晜閹惧懏瀚规慨妯煎亾鐎氾拷
				ClanBuildUPBean factionOpbean=new ClanBuildUPBean(clan.getKey(),opid, uplevel -1, uplevel,cost);
				fire.log.YYLogger.factionBuildUPLog(roleid,factionOpbean);
				
				return true;
			}
		};
		
		requestfactionlevelup.submit();	
	}
	
	public void SendAllFactionMemeber(xbean.ClanInfo clanInfo, int type, int data)
	{
		List<String> paras = new ArrayList<String>();
		paras.add(String.valueOf(data));
		int msgid = 160200;
		if (type == ClanManage.GoldBank)
		{
			msgid = 160219;
		}
		else if (type == ClanManage.DrugStone)
		{
			msgid = 160220;
		}
		else if (type == ClanManage.Hotel)
		{
			msgid = 160221;
		}
		
		for (long roleid : clanInfo.getMembers().keySet())
		{
			MessageMgr.psendSystemMessageToRole(roleid, msgid, paras);				
		}
		
		//濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倿鏌ｉ幘宕囧哺闁哄鐗楃换娑㈠箣閻愰潧鏆￠梺鐟板槻閸㈡煡锝炲┑瀣亗閹兼番鍨昏ぐ搴繆閵堝洤啸闁稿鐩畷顖烆敍濠婂嫬搴婂┑鐘绘涧椤戝懐绮堢�ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡濞ｅ洤锕幃娆擃敂閸曡埖瀚归柡宥庣仜濞戞瑦濯撮悷娆忓瀵潡姊洪棃娑氬妞わ缚鍗冲畷鎰節濮橆厾鍙嗛梺鍝勬祩娴滄繄锟芥艾缍婂濠氬炊瑜滃Σ鍦磼缂佹绠栫紒缁樼箞瀹曟帒顫濋鐘卞闂傚倷鑳堕…鍫燁殽閸濄儻鎷峰☉鎺撴珖闁瑰箍鍨归埥澶愬閻樿尪锟藉灝顪冮妶鍡樺暗闁哥姴閰ｉ、鏃堟晸閿燂拷
		fire.pb.clan.srv.ClanManage.addDealClanEventInfo(clanInfo,fire.pb.clan.srv.ClanManage.EVENT_BUILD_UP,0,fire.pb.clan.srv.ClanManage.getClanBuildNameByType(type),data+"","");
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808472;

	public int getType() {
		return 808472;
	}

	public int id; // 1大厅2金库3药店4旅馆 by changhao

	public CRequestClanLevelup() {
	}

	public CRequestClanLevelup(int _id_) {
		this.id = _id_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestClanLevelup) {
			CRequestClanLevelup _o_ = (CRequestClanLevelup)_o1_;
			if (id != _o_.id) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += id;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestClanLevelup _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = id - _o_.id;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

