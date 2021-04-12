
package fire.pb.npc;

import fire.pb.PAddExpProc;
import fire.pb.activity.award.RewardMgr;
import fire.pb.activity.clanfight.ActivityClanFightManager;
import fire.pb.activity.timernpc.TimerNpcService;
import fire.pb.clan.ClanUtils;
import fire.pb.instancezone.InstanceZone;
import fire.pb.instancezone.InstanceZoneFactory;
import fire.pb.instancezone.conf.InstanceZoneConfig;
import fire.pb.instancezone.faction.FactionInstZone;
import fire.pb.map.Npc;
import fire.pb.map.SceneNpcManager;
import fire.pb.talk.MessageMgr;
import fire.pb.util.DateValidate;






// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __COpenChest__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class COpenChest extends __COpenChest__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId == -1)
			return;
		
		final fire.pb.map.Role role = fire.pb.map.RoleManager.getInstance().getRoleByID(roleId);
		if (null == role)
			return;
		
		InstanceZone instzone = InstanceZoneFactory.getRoleCurInstanceZone(roleId, true);
		if (instzone != null) {
			InstanceZoneConfig zoneconfig = fire.pb.instancezone.Module.getInstance().getInstanceZoneConfigs().get(instzone.getInstZoneId());
			if (zoneconfig != null) {
				long now = System.currentTimeMillis();
				if (zoneconfig.inEnterTime(now)) {
					new mkdb.Procedure() {
						protected boolean process() throws Exception {
							InstanceZone instzone = InstanceZoneFactory.getRoleCurInstanceZone(roleId, false);
							if (instzone instanceof FactionInstZone) {
								return ((FactionInstZone) instzone).openChest(roleId, chestnpckey);
							}

							return false;
						};
					}.submit();
					
					return;
				}
			}
			
			return;
		}

		if (!fire.pb.map.SceneNpcManager.checkDistance(chestnpckey, roleId))
			return;
		
		new mkdb.Procedure() {

			@Override
			protected boolean process() throws Exception {
				Npc npc = SceneNpcManager.getNpcByKey(chestnpckey);
				if (npc == null)
					return false;
				
				SBaoxiang chestcfg = ChestManager.getInstance().getChestConfig(npc.getNpcID());
				if (chestcfg == null)
					return false;
				
//////////////////////////////////////////////
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為梺闈浤涢崨顓㈢崕闂傚倷绀佹竟濠囧磻閸涱垳绱﹀Δ锝呭暙閸戠姷锟藉箍鍎遍ˇ浼存偂濞戙垺鐓曢柕澶堝灪濞呭懐锟芥稒绻堝娲箹閻愭彃顬夌紓浣筋嚙鐎氫即寮幘缁樺仼閻忕偟铏庢禒褔姊鸿ぐ鎺濇闁稿繑锕㈠璇测槈閵忕姴宓嗛梺闈涱焾閸庢壆鑺遍悡搴樻斀闁炽儴娅曢埢鏇㈡煕閹捐泛鏋庢い顐㈢箰鐓ゆい蹇撳缁愭稒绻濋悽闈浶㈤柛鐕佸亰钘濋柍鍝勬噺閳锋垿鏌熼懖鈺佷粶濠殿喖鍊搁湁婵犲﹤妫欑涵楣冩煟閿濆洤鍘撮柟顔荤矙瀹曘劍绻濋崘鈺婁户婵犵數鍋涢顓熸叏閹绢噮鏁勯柛鈩冪☉閻撴洟鏌熸潏楣冩闁绘挻娲樼换娑㈠箣閻戝洤鍙曞┑顔硷攻椤ㄥ牏妲愰幒妤�閱囬柡鍥ㄧ閸犳岸姊洪崫鍕拱闁烩晩鍨堕獮鍐煛娴ｇ儤娈鹃梺鎼炲劀閿熶粙骞忔导瀛樼厽闁绘绮鹃鐔兼煕閵娿儳鍩ｇ�殿喛顕ч埥澶娢熼柨瀣垫綌婵犵妲呴崹浼村触鐎ｎ喖绠熷┑鍌氭啞閳锋垹绱撴担鑲℃垹浜搁棃娑掓斀闁绘垵娲︾�氬綊姊绘担绛嬪殐闁哥姵顨婇妴鍐╃節閸屾粍娈鹃梺缁樺灩閻℃棃寮崶顒佺厽闁归偊鍘兼慨鍌炴煕閵娿儺鐓兼鐐插暣椤㈡瑧鍠婃潏銊ュ厞闂備胶鍘ч幗婊堝极閹间礁鍌ㄥù鐘差儐閻撴瑩鏌涜箛鎾虫倯闁稿孩顨婇弻娑㈠Ω閵壯嶇礊闂佽法鍠嶇划娆忣焽瑜旀俊鍫曞箹娴ｆ瓕鎽曢梺鎸庣箓椤︻垳绮婚幎鑺ョ厽闁归偊鍓氶埢鏇熺箾瀹割喖骞樼紒杈ㄦ崌瀹曟帒顫濋濠冨鐟滅増甯掔粻浼存煠婵劕锟芥鎯屾径鎰厵闁绘垶蓱椤ユ牠鏌熸搴″幋闁轰焦鍔栭幆鏂库攽閸垺鏅ㄩ梻鍌欑閹芥粓宕戦幋锕�绀夐柟杈剧畱缁犳牜锟界懓瀚伴崑濠囨偂閵夆晜鐓曢柟鎵暜閹风兘顢涘Ο铏逛紙闂佸搫鐭夌紞渚�鍨鹃敃鍌氱闁圭偓鍓氭导锟� by changhao
				Long clanfightid = xtable.Roleid2clanfightid.select(roleId);
				if (clanfightid != null && npc.getNpcID() == ActivityClanFightManager.VICTORY_BOX)
				{
					fire.pb.clan.fight.ClanFightBattleField bf = fire.pb.clan.fight.ClanFightFactory.getClanFightBattleField(clanfightid, true);
					if (bf != null)
					{
						if (!bf.getClanfightBean().getEnterroleids().containsKey(roleId))
						{
							return false;
						}
						
						boolean ok = bf.IsWinnerSide(roleId, true);
						if (ok == true)
						{
							mkdb.Procedure.pexecuteWhileCommit(new fire.pb.clan.fight.PClanFightOpenChest(clanfightid, roleId, chestnpckey));
							return true;
						}
					}
					
					return false;
				}
				
				xbean.Properties prop = xtable.Properties.select(roleId);
				if (prop == null)
				{
					return false;
				}
				
				int mapid = role.getMapId();
				if (mapid == ClanUtils.MAPID && npc.getNpcID() == ActivityClanFightManager.CELEBRATE_BOX) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戞鐔煎传閸曨剙锟筋垳绱撴担绋匡拷鍦暜閳╁啯鍙忛柨鐔剁矙閺屾洟宕煎┑鍥舵闂佸綊鏀卞浠嬪蓟閿濆棙鍎熼柍鈺佸暢绾拷濠电姵顔栭崰姘跺极缂佹ü绻嗛柟缁㈠枛缁�鍐┿亜韫囨挻顥犻柨娑欑矒閺岋綁鎮╂潏鈺婃М濠电媴鎷烽弶鍫氭櫅婵剟鏌ㄩ悢鍓佺煓闁诡喗顨堥幉鎾礋椤掞拷椤︹晠姊洪幖鐐插闁绘牜鍘ч锝夘敃閿曪拷缁犲鎮楅棃娑橆棌婵炴潙瀚伴弻锝嗘償椤栨粎校闂佺顑戦幏鐑芥⒑瑜版帗鏁辨俊鐐舵椤繑绻濆顒傦紲濠殿喗锚瀹曨剟銆傞悽鍛娾拺闁告繂瀚崳浠嬫煕鐎ｎ剙鏋旈柛鎺撳浮瀹曞ジ锝為钘夘伓闂佹寧绻傛鎼佸几閻斿吋鐓熼柟鎯х摠缁�瀣煛瀹�瀣瘈鐎规洘甯掗埞鎴﹀炊閳瑰尅鎷锋繝鍥ㄢ拺缂備焦锚缁楁帡鏌熼懞銉х煉闁轰焦鎹囧畷鎰版偆娴ｅ湱绉锋繝鐢靛仦缁佹挳寮插┑鍫燁潟闁绘劕鐡ㄦ刊鎾煕閹炬潙绲绘繛鍫涘姂濮婃椽宕烽鈩冾�楅梺鍝ュУ椤ㄥ﹤鐣烽幋锕�绀嬫い鎰枑閺傦拷闂備胶顭堥張顒勫礄閻熸嫈锝夊川婵犲嫮顔曢梺鍓插亝缁诲倿骞冮幋鐘电＜缂備焦顭囩粻鎾绘煃缂佹ɑ宕岀�规洖缍婇、娆撴偩鐏炲吋鍠氶梻鍌氬�烽悞锔撅拷绗涘厾楦跨疀濞戞ê鐎梺绋匡功閸犳捇鎮㈤崨瀛樷拻濞达絼璀﹂悞楣冩煟椤掞拷閵堢鐣烽幋婵冩婵☆垳鍊崶褏鐓戞繝銏ｆ硾閻ジ顢欓弴銏♀拺缂侇垱娲栨晶鏌ユ嫅闁秵鍊堕煫鍥ч瀹撳棝鏌″畝瀣М妤犵偞顭囬敓鑺ョ♁椤洭藝娴煎瓨鈷戦柛婵嗗椤箓鏌涢弮锟介崹鍧楃嵁閸愵喖围濠㈣泛锕﹂敍婊冣攽閻愭潙鐏﹂柨鏇楁櫆鐎靛ジ鏁撻敓锟�? by changhao
				{
					xbean.ClanInfo clanInfo = ClanUtils.getClanInfoById(roleId, true);
					if (clanInfo == null)
					{
						return false;
					}
						
					long clanid = clanInfo.getKey();
					xbean.EClanfightids ids = xtable.Clanid2clanfightids.select(clanid);
					for (Long i : ids.getIds())
					{
						fire.pb.clan.fight.ClanFightBattleField bf = fire.pb.clan.fight.ClanFightFactory.getClanFightBattleField(i, true);
						if (bf != null)
						{
							long day1 = 24 * 60 * 60 * 1000;
							long cur = System.currentTimeMillis();
							long t = bf.getClanfightBean().getDatetime() + day1;
							
							if(DateValidate.inTheSameDay(t, cur))
							{
								if (!bf.getClanfightBean().getEnterroleids().containsKey(roleId))
								{
									MessageMgr.sendMsgNotify(roleId, 410050, null); //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ鐐电磽娴ｇ晫鍫柛濠冪箞瀵鎮㈤搹鍦厯闂佸壊鐓堥崳顕�宕濇径鎰拺闁告稑锕﹂幊鍐磼缂佹﹫鑰跨�殿喖顭烽弫鎰緞婵犲孩缍傞梻浣虹帛閿氶柛鐔锋健瀵娊宕奸妷锔规嫼缂備礁顑呭锟狀敁濡や降浜滈柨鏃傚亾閺嗩剛锟芥鍠涢褔鍩ユ径濞㈢喖鏌ㄧ�ｅ灚缍屽┑鐘垫暩閸嬫稑螞濞嗘挸绀夋俊銈呭暟閻瑩鏌涢妷顔煎闁绘挾鍠栭獮鏍庨锟介悘鍗烆熆鐟欏媶鎴﹀Φ閸曨垱鏅滈悹鍥皺娴犳悂姊洪悙钘夊姷濠碘�虫喘楠炴垿宕熼姣尖晠鏌ㄩ弴顏呭缂佸墽铏庨崹璺侯潖閾忓湱纾兼俊顖濇娴犳悂鏌﹂崘顓濆惈闁跨喎锟界噥娼愭繛鍙壣戠换娑欑節閸屻倖缍庡┑鐐叉▕娴滄繈藟閸喓绠鹃柟瀵稿仩婢规﹢鏌嶅畡鎵ⅵ婵﹨娅ｇ划娆忊枎閹冨闂備焦瀵уú锔界濠婂牜鏁嬮柨婵嗘缁★拷濠殿喗锕╅崜娑欏鐎ｎ喗鈷戠憸鐗堝俯閺嗘帞绱掗敓鑺ョ瑹閿熶粙鐛崘顔肩闁挎棁袙閹锋椽姊洪崨濠勨槈闁挎洩绲垮▎銏ゆ焼瀹ュ棛鍘卞┑鈽嗗灠濠�閬嶆儗濞嗘埊鎷风憴鍕闁告梹鐟╅妴浣糕槈閵忊�筹拷鐑芥倵閻㈡鐒炬鐐搭殜濮婃椽鎮烽弶鎸庡�梺璇″灠閻倸鐣烽悷鎵殾闁搞儮鏅濋悡瀣⒑閸撴彃浜濇繛鍙夛耿閹�斥枎韫囷絾瀵岄柣搴秵娴滎亪顢撳Δ鍛厱婵☆垵娅ｉ幗鐘绘煙娓氬灝濡界紒缁樼箞瀹曟﹢鍩炴径姝屾濠电姷顣藉Σ鍛村磻閸曨垰鐤柟缁㈠枛閺勩儵鏌ㄩ悢鍝勑㈢痪鎯у悑閹便劌顫滈敓钘壩涚捄銊︻潟闁跨噦鎷�? by changhao	
									return false;
								}
								
								boolean ok = bf.IsWinnerSide(roleId, true);
								if (ok == true)
								{
									mkdb.Procedure.pexecuteWhileCommit(new fire.pb.clan.fight.PClanFightOpenChest(bf.getClanfightBean().getClanfightid(), roleId, chestnpckey));
									return true;
								}
								
								MessageMgr.sendMsgNotify(roleId, 410050, null); //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ鐐电磽娴ｇ晫鍫柛濠冪箞瀵鎮㈤搹鍦厯闂佸壊鐓堥崳顕�宕濇径鎰拺闁告稑锕﹂幊鍐磼缂佹﹫鑰跨�殿喖顭烽弫鎰緞婵犲孩缍傞梻浣虹帛閿氶柛鐔锋健瀵娊宕奸妷锔规嫼缂備礁顑呭锟狀敁濡や降浜滈柨鏃傚亾閺嗩剛锟芥鍠涢褔鍩ユ径濞㈢喖鏌ㄧ�ｅ灚缍屽┑鐘垫暩閸嬫稑螞濞嗘挸绀夋俊銈呭暟閻瑩鏌涢妷顔煎闁绘挾鍠栭獮鏍庨锟介悘鍗烆熆鐟欏媶鎴﹀Φ閸曨垱鏅滈悹鍥皺娴犳悂姊洪悙钘夊姷濠碘�虫喘楠炴垿宕熼姣尖晠鏌ㄩ弴顏呭缂佸墽铏庨崹璺侯潖閾忓湱纾兼俊顖濇娴犳悂鏌﹂崘顓濆惈闁跨喎锟界噥娼愭繛鍙壣戠换娑欑節閸屻倖缍庡┑鐐叉▕娴滄繈藟閸喓绠鹃柟瀵稿仩婢规﹢鏌嶅畡鎵ⅵ婵﹨娅ｇ划娆忊枎閹冨闂備焦瀵уú锔界濠婂牜鏁嬮柨婵嗘缁★拷濠殿喗锕╅崜娑欏鐎ｎ喗鈷戠憸鐗堝俯閺嗘帞绱掗敓鑺ョ瑹閿熶粙鐛崘顔肩闁挎棁袙閹锋椽姊洪崨濠勨槈闁挎洩绲垮▎銏ゆ焼瀹ュ棛鍘卞┑鈽嗗灠濠�閬嶆儗濞嗘埊鎷风憴鍕闁告梹鐟╅妴浣糕槈閵忊�筹拷鐑芥倵閻㈡鐒炬鐐搭殜濮婃椽鎮烽弶鎸庡�梺璇″灠閻倸鐣烽悷鎵殾闁搞儮鏅濋悡瀣⒑閸撴彃浜濇繛鍙夛耿閹�斥枎韫囷絾瀵岄柣搴秵娴滎亪顢撳Δ鍛厱婵☆垵娅ｉ幗鐘绘煙娓氬灝濡界紒缁樼箞瀹曟﹢鍩炴径姝屾濠电姷顣藉Σ鍛村磻閸曨垰鐤柟缁㈠枛閺勩儵鏌ㄩ悢鍝勑㈢痪鎯у悑閹便劌顫滈敓钘壩涚捄銊︻潟闁跨噦鎷�? by changhao	
								return false;
							}
						}
					}
					
					MessageMgr.sendMsgNotify(roleId, 410050, null); //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ鐐电磽娴ｇ晫鍫柛濠冪箞瀵鎮㈤搹鍦厯闂佸壊鐓堥崳顕�宕濇径鎰拺闁告稑锕﹂幊鍐磼缂佹﹫鑰跨�殿喖顭烽弫鎰緞婵犲孩缍傞梻浣虹帛閿氶柛鐔锋健瀵娊宕奸妷锔规嫼缂備礁顑呭锟狀敁濡や降浜滈柨鏃傚亾閺嗩剛锟芥鍠涢褔鍩ユ径濞㈢喖鏌ㄧ�ｅ灚缍屽┑鐘垫暩閸嬫稑螞濞嗘挸绀夋俊銈呭暟閻瑩鏌涢妷顔煎闁绘挾鍠栭獮鏍庨锟介悘鍗烆熆鐟欏媶鎴﹀Φ閸曨垱鏅滈悹鍥皺娴犳悂姊洪悙钘夊姷濠碘�虫喘楠炴垿宕熼姣尖晠鏌ㄩ弴顏呭缂佸墽铏庨崹璺侯潖閾忓湱纾兼俊顖濇娴犳悂鏌﹂崘顓濆惈闁跨喎锟界噥娼愭繛鍙壣戠换娑欑節閸屻倖缍庡┑鐐叉▕娴滄繈藟閸喓绠鹃柟瀵稿仩婢规﹢鏌嶅畡鎵ⅵ婵﹨娅ｇ划娆忊枎閹冨闂備焦瀵уú锔界濠婂牜鏁嬮柨婵嗘缁★拷濠殿喗锕╅崜娑欏鐎ｎ喗鈷戠憸鐗堝俯閺嗘帞绱掗敓鑺ョ瑹閿熶粙鐛崘顔肩闁挎棁袙閹锋椽姊洪崨濠勨槈闁挎洩绲垮▎銏ゆ焼瀹ュ棛鍘卞┑鈽嗗灠濠�閬嶆儗濞嗘埊鎷风憴鍕闁告梹鐟╅妴浣糕槈閵忊�筹拷鐑芥倵閻㈡鐒炬鐐搭殜濮婃椽鎮烽弶鎸庡�梺璇″灠閻倸鐣烽悷鎵殾闁搞儮鏅濋悡瀣⒑閸撴彃浜濇繛鍙夛耿閹�斥枎韫囷絾瀵岄柣搴秵娴滎亪顢撳Δ鍛厱婵☆垵娅ｉ幗鐘绘煙娓氬灝濡界紒缁樼箞瀹曟﹢鍩炴径姝屾濠电姷顣藉Σ鍛村磻閸曨垰鐤柟缁㈠枛閺勩儵鏌ㄩ悢鍝勑㈢痪鎯у悑閹便劌顫滈敓钘壩涚捄銊︻潟闁跨噦鎷�? by changhao	
					return false;
				}					
/////////////////////////////////////////////
				
				int biaoId = TimerNpcService.getInstance().getEventId(npc.getNpcID());
				
				int opentimes = chestcfg.getOpentimes();
				
				final long currentTime = System.currentTimeMillis();
				
				fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleId);
				if (null != team && team.isTeamLeader(roleId) && chestcfg.getOpenteam() == 1) {
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾椤懘鏌嶉妷銉ユ毐缂併劊鍎靛缁樻媴缁嬫妫岄梺绋款儎缁舵艾鐣烽弴鐔哥秶闁冲搫鍟伴悞鍏肩節閵忥絽鐓愰柛鏃�鐗犻幃鈥斥枎閹炬潙锟藉灚绻涢幋鐑嗕紗闁硅揪绠戠壕鍧楁煛閸ャ儱鐏柣鎾卞劜缁绘繈妫冨☉娆欑礊濠碘剝褰冪紞濠囧蓟閿熺姴宸濇い鏂垮⒔閻ゅ嫰姊洪崫鍕潶闁告梹鍨块獮鍐閵堝懐顦繛杈剧秬濞咃綁宕㈤鐐粹拻濞达絿鎳撻婊呯磼鐠囨彃顏�规洘鍨挎俊鍫曞幢濡搫浼庨梻浣芥硶閸犲秶鍒掑▎鎾宠摕闁哄洢鍨归柋鍥ㄧ節闂堟稒绁╂俊顐燂拷鏂ユ斀闁绘劕寮堕崳铏圭磼椤旇姤灏い顐㈢箰鐓ゆい蹇撳缁愭稒绻濋悽闈浶￠柤鍐插閹广垺绗熼敓钘夘潖濞差亜绠归柣鎰絻椤棝姊洪崨濠庢畷濠电偛锕悰顕�宕橀鑺ユ闂佺粯顭堢亸娆擃敇濞差亝鈷戦柟绋垮椤ュ棛鎮▎鎾寸厵闁汇値鍨遍鐘电磼鏉堛劍宕岀�规洘甯掗埢搴ㄥ箣濠靛棭鐎撮梻鍌欑劍鐎笛兠哄澶婄柧闁绘顕х粻鏍煟閹邦厾鏆橀柛瀣嚇閺屾盯骞囬妸锔界彇闂佸憡锕㈡禍璺侯潖濞差亜绀冮柛娆忣槹閸庢挸顪冮妶鍡楃仴婵☆偅鐩弫鎾绘嚍閵壯冩殹闂佺懓鍤栭幏锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫炵紓浣界堪閸婃繈寮诲☉婊庢Ъ濡炪們鍔岄幊鎰垝婵犳碍鍋愮紓浣诡焽閸樼敻姊洪崨濠冨瘷闁告侗鍘鹃濂告⒒娴ｄ警鐒鹃柨鏇樺�濋幃銉︾附缁嬭儻鎽曞┑鐐村灟閸ㄧ懓鏁俊鐐�栧濠氬储瑜旈敐鐐侯敂閸啿鎷虹紓鍌欑劍钃遍悘蹇曞缁绘盯鎳犻锟介弸娑氾拷娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�? 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鍨傚Δ锝呭暙缁犳稑霉閿濆懏璐＄紒瀣╄兌缁辨捇宕掑顒婃嫹閻戣姤鍊块柨鏇炲�甸敓鏂ょ畵瀹曞爼鍩￠崘褏鐟濆┑掳鍊х徊浠嬪疮椤栫偞鍋傞柕澶嗘櫆閻撶喖鏌￠崒姘变虎妞わ絾濞婇弻锝夘敇閻旂儤鍣伴梺鍝勫閿熻棄纾弳鍡涙倵閿濆骸澧伴柣锕�鐗撳鐑樻姜閹殿喖濡介梺瑙勭摃瀹曠數鍒掔�ｎ喖绠抽柡鍐╂尰鐎氬綊鏌ㄥ┑鍡涱�楀ù婊勭箖缁绘盯宕ㄩ銏紙濠殿喖锕ㄥ▍锝夊箲閸曨垰惟闁靛濡囪ぐ姘舵⒒娴ｇ儤鍤�闁搞倖鐗犻獮蹇涙晸閿燂拷
					final java.util.List<Long> members = team.getNormalMemberIds();
					this.lock(xtable.Locks.ROLELOCK, members);
					
					{
						xbean.BaoXiangInfo baoxiangInfo = xtable.Rolekaibaoxiang.select(roleId);
						if (baoxiangInfo != null) {
							if (DateValidate.inTheSameDay(baoxiangInfo.getLastopentime(), currentTime)) {
									if (baoxiangInfo.getOpentimes() >= opentimes) {
										MessageMgr.psendMsgNotifyWhileRollback(roleId, 166004, null);
										return false;
									}
							}	
						}
						int rolelevel = xtable.Properties.selectLevel(roleId);
						if (chestcfg.openlevel > rolelevel) {
							//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵剟宕归瑙勫瘱闂備焦妞块崢浠嬫偡閳哄懎钃熼柣鏂跨殱閺嬪酣姊介崶顒夋晪鐟滃秶鍙呴梺鎸庢穿閹烽攱銇勯鐐寸┛缂佺姵绋戦埥澶愬箳閻愭潙顏堕梺鎸庢礀閸婂摜绮婚敐澶嬬厽闁瑰瓨绻冮ˉ婊堟煛閸滀礁澧存慨濠傤煼瀹曟帒鈻庨幋婵嗩瀴闂備浇顕栭崰鏍偉閻撳海鏆﹂柡鍥ュ焺閺佸秹鏌ｉ幇顖氱毢妞わ富鍣ｉ弻鐔煎礂閼测晜娈梺鍛婃煥閻倿骞冮垾鏂ユ斀閻庯綆鍋嗛崢鎼佹⒑閸涘﹤濮傞柛鏂挎湰缁傚秵瀵肩�涙鍘垫俊鐐差儏妤犳悂宕㈤幘顔界厽婵炴垵宕▍宥囷拷瑙勬礀缂嶅﹪銆佸▎鎾村亗閹兼惌鍠楃紞鎾绘⒒閸屾艾锟界兘鎳楅崜浣稿灊妞ゆ牜鍋戦敓钘夊暣瀹曘劑顢橀崶銊р槈闁宠鍨垮畷鍗炩枎閹邦収鍟庢繝鐢靛仦濞兼瑩宕ョ�ｎ亶鐒芥繛鍡樻尭绾拷闂佽鍎兼慨銈夋偂韫囨稓鍙撻柛銉ｅ劚閸斻倗鐥幆褎鍋ラ柡灞剧☉铻ｉ柛锔诲幘閻撴挸鈹戦纭锋敾婵＄偠妫勮灋闁告劑鍔夊Σ鍫ュ级閸碍娅呭┑顔笺偢濮婄粯鎷呮笟顖滃姼闂備礁搴滅徊鍓х矉瀹ュ閱囬柡鍥公閹烽攱绗熼敓钘夘嚕椤曪拷瀹曞ジ顢曢敐鍡樼彆闂傚倷鑳剁涵鍫曞礈濠靛鏅梻浣告惈椤戝棝宕归懜鐢碘攳濠电姴娴傞弫鍐煥閺冨倻甯涙繛鍫涘劚閳规垿鎮欑�涙绋囧┑鐐叉▕閸樺ジ鎮惧畡鎷旀棃鏁撴禒瀣仼婵犻潧顑嗛弲鎼佹煟閿濆懏婀版い顐ｆ礋閺岀喖鎮滃鍡橆吂闂佽桨绀侀澶愬蓟濞戙垹鐒洪柛蹇曞娴滎亪銆侀弮鍫熸櫢闁跨噦鎷�?
							MessageMgr.sendMsgNotify(roleId, 166139, null);
							return false;
						}
					}
					
					for (Long rid : members) {
						xbean.BaoXiangInfo baoxiangInfo = xtable.Rolekaibaoxiang.get(rid);
						if (baoxiangInfo == null) {
							baoxiangInfo = xbean.Pod.newBaoXiangInfo();
							xtable.Rolekaibaoxiang.insert(rid, baoxiangInfo);
						}
						if (!DateValidate.inTheSameDay(baoxiangInfo.getLastopentime(), currentTime)) {
							baoxiangInfo.setOpentimes(0);
						}
						
						if (baoxiangInfo.getOpentimes() >= opentimes) {
							MessageMgr.psendMsgNotify(rid, 166003, null);
							continue;
						}
						
						// 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗鎸抽幃娆戞嫚瑜庣�氬湱鎲搁悧鍫濈瑨缁炬儳顭烽弻銊╂偄閸濆嫅锝夋煟閹惧磭绠婚柡灞剧洴椤㈡洟鏁愰崶鈺冩毇缂傚倷绀侀懟顖炴倶濠靛鐓橀柟杈惧瘜閺佸﹪鏌﹀Ο渚Т闁哄鐟╁娲传閸曨噮娼堕梺鍛婃煥閻倿宕洪悙鍝勭闁挎洩鎷锋鐐灪閹便劌螖閿熻棄螞濞嗘挻鏅搁柕澶嗘櫆閳锋帡鏌涚仦鎹愬闁跨喕妫勯幗婊堟晸閼恒儱鍤柛鎾寸洴閺佹捇鎳為妷褏鍙濋梺鍛婎殔閸熷潡顢氶敐鍡欑瘈婵﹩鍓涙导瀣倵鐟欏嫭绀�婵炶绠戦埢鎾绘偂鎼搭喗瀵岄梺闈涚墕濡瑩鍩涢幒妤佺厱婵☆垳濮村ú銈夊几娴ｅ箍浜滈煫鍥ㄦ尵婢ф盯鏌ｉ幘鍗炲姦闁哄矉缍佸鎾倷鐠囇勫闁革富鍙忛幏宄邦潩閻愵剙顏�
						RewardMgr.getInstance().distributeAllAward(rid,
								chestcfg.rewardid, null,
								fire.log.enums.YYLoggerTuJingEnum.tujing_Value_baoxiang, 0,
								PAddExpProc.OTHER_QUEST, "濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫校婵犮垺锕㈤崺鐐哄箣閿旇棄浜归悗瑙勬礀濞村倿寮抽敓鐘斥拺缂佸顑欓崕蹇斻亜閹存繃顥犻柟骞垮灩閳规垿宕堕埡鍐闂備胶顭堥張顒傚垝瀹�鍕╋拷鍌毭洪鍛嫼濠殿喚鎳撳ú銈夋晸閼恒儺娈滅�规洘鍨块獮妯兼嫚閸欏偊绠撻弻娑㈠即閵娿儳浠╃紓浣哄У閻╊垶寮诲鍡樺闁规鍠氶悺姗�姊鸿ぐ鎺濇闁哄苯顦佃棟閻熸瑥瀚峰▓浠嬫煟閹邦垰鐨虹紒鐘插级閵囧嫰鏁傞幆褜鏆梺璇″灡濡啯鎱ㄩ敓浠嬫煟濡櫣锛嶉柨鐔虹摂閸欏啫顫忕紒妯诲闁告稑锕ら弳鍫濃攽閻愰鍤嬬紒鐘虫尭閻ｇ兘濮�鎺抽崑鍛存煕閹般劍娅呭ù鐘层偢濮婅櫣绱掑Ο璇茬闁诲骸鐏氱敮鎺楀Υ閹烘挾绡�婵﹩鍘鹃崢顏堟⒑閸撴彃浜濈紒璇插暣钘熼柣鎰暘娴滄粓鏌曟径娑橆洭濠⒀呮暬閺屸�崇暆閿熶粙宕伴弽褏鏆︽繛鍡樻尭鍥撮梺绯曞墲椤ㄥ繑瀵奸敓锟�");
						
						baoxiangInfo.setOpentimes(baoxiangInfo.getOpentimes() + 1);
						baoxiangInfo.setLastopentime(currentTime);
					}
				}
				else {
					int rolelevel = xtable.Properties.selectLevel(roleId);
					if (chestcfg.openlevel > rolelevel) {
						//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵剟宕归瑙勫瘱闂備焦妞块崢浠嬫偡閳哄懎钃熼柣鏂跨殱閺嬪酣姊介崶顒夋晪鐟滃秶鍙呴梺鎸庢穿閹烽攱銇勯鐐寸┛缂佺姵绋戦埥澶愬箳閻愭潙顏堕梺鎸庢礀閸婂摜绮婚敐澶嬬厽闁瑰瓨绻冮ˉ婊堟煛閸滀礁澧存慨濠傤煼瀹曟帒鈻庨幋婵嗩瀴闂備浇顕栭崰鏍偉閻撳海鏆﹂柡鍥ュ焺閺佸秹鏌ｉ幇顖氱毢妞わ富鍣ｉ弻鐔煎礂閼测晜娈梺鍛婃煥閻倿骞冮垾鏂ユ斀閻庯綆鍋嗛崢鎼佹⒑閸涘﹤濮傞柛鏂挎湰缁傚秵瀵肩�涙鍘垫俊鐐差儏妤犳悂宕㈤幘顔界厽婵炴垵宕▍宥囷拷瑙勬礀缂嶅﹪銆佸▎鎾村亗閹兼惌鍠楃紞鎾绘⒒閸屾艾锟界兘鎳楅崜浣稿灊妞ゆ牜鍋戦敓钘夊暣瀹曘劑顢橀崶銊р槈闁宠鍨垮畷鍗炩枎閹邦収鍟庢繝鐢靛仦濞兼瑩宕ョ�ｎ亶鐒芥繛鍡樻尭绾拷闂佽鍎兼慨銈夋偂韫囨稓鍙撻柛銉ｅ劚閸斻倗鐥幆褎鍋ラ柡灞剧☉铻ｉ柛锔诲幘閻撴挸鈹戦纭锋敾婵＄偠妫勮灋闁告劑鍔夊Σ鍫ュ级閸碍娅呭┑顔笺偢濮婄粯鎷呮笟顖滃姼闂備礁搴滅徊鍓х矉瀹ュ閱囬柡鍥公閹烽攱绗熼敓钘夘嚕椤曪拷瀹曞ジ顢曢敐鍡樼彆闂傚倷鑳剁涵鍫曞礈濠靛鏅梻浣告惈椤戝棝宕归懜鐢碘攳濠电姴娴傞弫鍐煥閺冨倻甯涙繛鍫涘劚閳规垿鎮欑�涙绋囧┑鐐叉▕閸樺ジ鎮惧畡鎷旀棃鏁撴禒瀣仼婵犻潧顑嗛弲鎼佹煟閿濆懏婀版い顐ｆ礋閺岀喖鎮滃鍡橆吂闂佽桨绀侀澶愬蓟濞戙垹鐒洪柛蹇曞娴滎亪銆侀弮鍫熸櫢闁跨噦鎷�?
						MessageMgr.sendMsgNotify(roleId, 166139, null);
						return false;
					}
					
					if (npc.getNpcID() == 300002) {
						xbean.BestowNpcInfo npcInfo = xtable.Bestownpc.get(chestnpckey);
						if (npcInfo == null)
							return false;
						
						xbean.RoleBestowInfo bestowInfo = xtable.Rolebestow.get(roleId);
						if (bestowInfo == null) {
							bestowInfo = xbean.Pod.newRoleBestowInfo();
							xtable.Rolebestow.insert(roleId, bestowInfo);
						}
						
						long npcRoleId = npcInfo.getRoleid();
						xbean.RoleBestowCount bestowCount = bestowInfo.getRolebestowinfo().get(npcInfo.getRoleid());
						if (bestowCount == null) {
							bestowCount = xbean.Pod.newRoleBestowCount();
							bestowInfo.getRolebestowinfo().put(npcRoleId, bestowCount);
						}
						if (bestowCount.getOpentimes() >= opentimes) {
							MessageMgr.psendMsgNotifyWhileRollback(roleId, chestcfg.getOpenovermsg(), null);
							return false;
						}
						
						// 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗鎸抽幃娆戞嫚瑜庣�氬湱鎲搁悧鍫濈瑨缁炬儳顭烽弻銊╂偄閸濆嫅锝夋煟閹惧磭绠婚柡灞剧洴椤㈡洟鏁愰崶鈺冩毇缂傚倷绀侀懟顖炴倶濠靛鐓橀柟杈惧瘜閺佸﹪鏌﹀Ο渚Т闁哄鐟╁娲传閸曨噮娼堕梺鍛婃煥閻倿宕洪悙鍝勭闁挎洩鎷锋鐐灪閹便劌螖閿熻棄螞濞嗘挻鏅搁柕澶嗘櫆閳锋帡鏌涚仦鎹愬闁跨喕妫勯幗婊堟晸閼恒儱鍤柛鎾寸洴閺佹捇鎳為妷褏鍙濋梺鍛婎殔閸熷潡顢氶敐鍡欑瘈婵﹩鍓涙导瀣倵鐟欏嫭绀�婵炶绠戦埢鎾绘偂鎼搭喗瀵岄梺闈涚墕濡瑩鍩涢幒妤佺厱婵☆垳濮村ú銈夊几娴ｅ箍浜滈煫鍥ㄦ尵婢ф盯鏌ｉ幘鍗炲姦闁哄矉缍佸鎾倷鐠囇勫闁革富鍙忛幏宄邦潩閻愵剙顏�
						RewardMgr.getInstance().distributeAllAward(roleId,
								chestcfg.rewardid, null,
								fire.log.enums.YYLoggerTuJingEnum.tujing_Value_baoxiang, 0,
								PAddExpProc.OTHER_QUEST, "濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫校婵犮垺锕㈤崺鐐哄箣閿旇棄浜归悗瑙勬礀濞村倿寮抽敓鐘斥拺缂佸顑欓崕蹇斻亜閹存繃顥犻柟骞垮灩閳规垿宕堕埡鍐闂備胶顭堥張顒傚垝瀹�鍕╋拷鍌毭洪鍛嫼濠殿喚鎳撳ú銈夋晸閼恒儺娈滅�规洘鍨块獮妯兼嫚閸欏偊绠撻弻娑㈠即閵娿儳浠╃紓浣哄У閻╊垶寮诲鍡樺闁规鍠氶悺姗�姊鸿ぐ鎺濇闁哄苯顦佃棟閻熸瑥瀚峰▓浠嬫煟閹邦垰鐨虹紒鐘插级閵囧嫰鏁傞幆褜鏆梺璇″灡濡啯鎱ㄩ敓浠嬫煟濡櫣锛嶉柨鐔虹摂閸欏啫顫忕紒妯诲闁告稑锕ら弳鍫濃攽閻愰鍤嬬紒鐘虫尭閻ｇ兘濮�鎺抽崑鍛存煕閹般劍娅呭ù鐘层偢濮婅櫣绱掑Ο璇茬闁诲骸鐏氱敮鎺楀Υ閹烘挾绡�婵﹩鍘鹃崢顏堟⒑閸撴彃浜濈紒璇插暣钘熼柣鎰暘娴滄粓鏌曟径娑橆洭濠⒀呮暬閺屸�崇暆閿熶粙宕伴弽褏鏆︽繛鍡樻尭鍥撮梺绯曞墲椤ㄥ繑瀵奸敓锟�");
						
						bestowCount.setOpentimes(bestowCount.getOpentimes() + 1);
					
					}
					else {
						xbean.BaoXiangInfo baoxiangInfo = xtable.Rolekaibaoxiang.get(roleId);
						if (baoxiangInfo == null) {
							baoxiangInfo = xbean.Pod.newBaoXiangInfo();
							xtable.Rolekaibaoxiang.insert(roleId, baoxiangInfo);
						}
						
						if (!DateValidate.inTheSameDay(baoxiangInfo.getLastopentime(), currentTime)) {
							baoxiangInfo.setOpentimes(0);
						}
						
						if (baoxiangInfo.getOpentimes() >= opentimes) {
							MessageMgr.psendMsgNotifyWhileRollback(roleId, chestcfg.getOpenovermsg(), null);
							return false;
						}
						
						// 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗鎸抽幃娆戞嫚瑜庣�氬湱鎲搁悧鍫濈瑨缁炬儳顭烽弻銊╂偄閸濆嫅锝夋煟閹惧磭绠婚柡灞剧洴椤㈡洟鏁愰崶鈺冩毇缂傚倷绀侀懟顖炴倶濠靛鐓橀柟杈惧瘜閺佸﹪鏌﹀Ο渚Т闁哄鐟╁娲传閸曨噮娼堕梺鍛婃煥閻倿宕洪悙鍝勭闁挎洩鎷锋鐐灪閹便劌螖閿熻棄螞濞嗘挻鏅搁柕澶嗘櫆閳锋帡鏌涚仦鎹愬闁跨喕妫勯幗婊堟晸閼恒儱鍤柛鎾寸洴閺佹捇鎳為妷褏鍙濋梺鍛婎殔閸熷潡顢氶敐鍡欑瘈婵﹩鍓涙导瀣倵鐟欏嫭绀�婵炶绠戦埢鎾绘偂鎼搭喗瀵岄梺闈涚墕濡瑩鍩涢幒妤佺厱婵☆垳濮村ú銈夊几娴ｅ箍浜滈煫鍥ㄦ尵婢ф盯鏌ｉ幘鍗炲姦闁哄矉缍佸鎾倷鐠囇勫闁革富鍙忛幏宄邦潩閻愵剙顏�
						RewardMgr.getInstance().distributeAllAward(roleId,
								chestcfg.rewardid, null,
								fire.log.enums.YYLoggerTuJingEnum.tujing_Value_baoxiang, 0,
								PAddExpProc.OTHER_QUEST, "濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫校婵犮垺锕㈤崺鐐哄箣閿旇棄浜归悗瑙勬礀濞村倿寮抽敓鐘斥拺缂佸顑欓崕蹇斻亜閹存繃顥犻柟骞垮灩閳规垿宕堕埡鍐闂備胶顭堥張顒傚垝瀹�鍕╋拷鍌毭洪鍛嫼濠殿喚鎳撳ú銈夋晸閼恒儺娈滅�规洘鍨块獮妯兼嫚閸欏偊绠撻弻娑㈠即閵娿儳浠╃紓浣哄У閻╊垶寮诲鍡樺闁规鍠氶悺姗�姊鸿ぐ鎺濇闁哄苯顦佃棟閻熸瑥瀚峰▓浠嬫煟閹邦垰鐨虹紒鐘插级閵囧嫰鏁傞幆褜鏆梺璇″灡濡啯鎱ㄩ敓浠嬫煟濡櫣锛嶉柨鐔虹摂閸欏啫顫忕紒妯诲闁告稑锕ら弳鍫濃攽閻愰鍤嬬紒鐘虫尭閻ｇ兘濮�鎺抽崑鍛存煕閹般劍娅呭ù鐘层偢濮婅櫣绱掑Ο璇茬闁诲骸鐏氱敮鎺楀Υ閹烘挾绡�婵﹩鍘鹃崢顏堟⒑閸撴彃浜濈紒璇插暣钘熼柣鎰暘娴滄粓鏌曟径娑橆洭濠⒀呮暬閺屸�崇暆閿熶粙宕伴弽褏鏆︽繛鍡樻尭鍥撮梺绯曞墲椤ㄥ繑瀵奸敓锟�");
						
						baoxiangInfo.setOpentimes(baoxiangInfo.getOpentimes() + 1);
						baoxiangInfo.setLastopentime(currentTime);
					}
				}
				
				TimerNpcService.getInstance().removeEventNpc(biaoId, chestnpckey);
				return true;
			}
			
		}.submit();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795522;

	public int getType() {
		return 795522;
	}

	public long chestnpckey; // 宝箱的npckey

	public COpenChest() {
	}

	public COpenChest(long _chestnpckey_) {
		this.chestnpckey = _chestnpckey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(chestnpckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		chestnpckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof COpenChest) {
			COpenChest _o_ = (COpenChest)_o1_;
			if (chestnpckey != _o_.chestnpckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)chestnpckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(chestnpckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(COpenChest _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(chestnpckey - _o_.chestnpckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

