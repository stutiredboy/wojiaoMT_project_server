
package fire.msp.task;




import fire.pb.item.PEquipRideProc;
import fire.pb.item.Pack;
import fire.pb.move.SAddUserScreen;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GChangeShape__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GChangeShape extends __GChangeShape__ {
	@Override
	protected void process() {
		// protocol handle
		fire.pb.scene.movable.Role  role = 
			fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(playerid);
		if(role == null) return;
		if(null == role.getScene()) return;
		
		if(changetype == 0) {
			fire.pb.move.STransfromShape send = new fire.pb.move.STransfromShape();
			send.shape = shape;
			send.playerid = playerid;
			if(role.getModeid() == shape){
				role.setTransformid(0);//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰悽鍛婃櫢闁哄倶鍊楅悾鐢碉拷瑙勬礀閵堝憡淇婇悜鑺ユ櫆缂備焦锕╁Λ鍛存⒒閸屾瑧顦﹂柛鐔锋健楠炴牠顢曢敃锟界粻鐘诲箹濞ｎ剙濡介柛濠傚槻閳规垿鎮╅崣澶婎槱闂佺粯鎸鹃崰鏍蓟閻斿吋鐒介柨鏇嫹妤犵偞鐗滅槐鎺楀箵閹烘繄鍚嬮梺鍝勭焿缁绘繂鐣烽幒妤�绀冮柕濠忕畱椤︹晠姊虹紒妯诲鞍缂佸鍨块垾锔炬崉閵婏箑纾梺鎯х箳閹虫捇銆傚ú顏呪拺闁告稑锕ラ悡鐔兼煕婵犲啰澧遍柟骞垮灩閳藉濮�閻樿鏁归梻浣虹帛濡啴藟閹炬潙顕辩�癸拷閸曨剙锟藉灚绻涢崼婵堜虎闁哄闄勬穱濠囶敃閵忕媭浼冮梺璇″櫍缁犳牠寮幘缁樺亹闁肩⒈鍓﹂崥瀣繆閻愵亜锟芥牕螞娴ｈ鍙忛柕鍫濐槸閻ゎ噣鏌曡箛瀣拷鏍煕閹烘嚚褰掓晲閸ャ劌娈屽銈嗘礃缁海妲愰幒鏃撴嫹閿濆骸浜滈柣蹇擃嚟閿熻姤顔栭崰姘跺极婵犳哎锟戒礁螖閸涱厾锛滃┑鐘诧工閸燁偆鎲撮敃锟介埞鎴︽偐閸偅姣勬繝娈垮枤閺佹悂宕版繝鍌ゅ悑濠㈣泛锕﹂崢閬嶆⒑閸濆嫬鏆欓柣妤�锕幃陇绠涘☉娆戝幈濡炪倖鍔х徊璺ㄧ不閺嶎厽鐓曢柨婵嗘噺鐠愶紕绱掓潏銊﹀碍妞ゆ挸銈稿畷鐔碱敇閻橀潧搴婂┑鐘殿暯濡插懘宕戦崟顖氱疇婵鎷风�殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�?
			}
			else
				role.setTransformid(shape);
			role.sendWhoSeeMeAndMe(send);
			Role addRole = RoleManager.getInstance().getRoleByID(role.getRoleID());
			SAddUserScreen sadduser = new SAddUserScreen();
			sadduser.rolelist.add(addRole.getRoleBasic());
			gnet.link.Onlines.getInstance().send(role.getRoleID(), sadduser);
		} else if(changetype == 1) {
			//濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倿鏌ｉ幘宕囧哺闁哄鐗楃换娑㈠箣閻愰潧鏆￠梺鐟板槻閸㈡煡锝炲┑瀣亗閹兼番鍨昏ぐ搴繆閵堝洤啸闁稿鐩畷顖烆敍濞戞埃鏀虫繝鐢靛Т鐎氭悂骞忛悜钘夋嵍妞ゆ挾濮崇花鎾⒒閸屾艾锟藉嘲霉閸パ呮殾闁割煈鍋呴崣蹇涙煙椤栧棴鎷烽柡瀣Ч閺屻劌鈹戦崱鈺傂︾紓浣瑰姈椤ㄥ﹪寮婚垾宕囨殼妞ゆ洖妫欑�氬綊姊洪崫鍕靛剱婵☆偄鍟村濠氬Ω閳哄倸浜為梺绋挎湰缁嬫垿顢旈敓锟�
			if(shape == 0) {
				fire.pb.mission.SNpcFollowEnd send = new fire.pb.mission.SNpcFollowEnd();
				send.npcid = shape;
				role.send(send);
			} else {
				fire.pb.mission.SNpcFollowStart send = new fire.pb.mission.SNpcFollowStart();
				send.npcid = shape;
				role.send(send);
			}
		} else if(changetype == 2) {
			//濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倿鏌ｉ幘宕囧哺闁哄鐗楃换娑㈠箣閻愰潧鏆￠梺鐟板槻閸㈡煡锝炲┑瀣亗閹兼番鍨昏ぐ搴繆閵堝洤啸闁稿鐩畷顖烆敍濠婂嫬搴婂┑鐘绘涧椤戝懘鎮欐繝鍕枑鐎广儱顦伴崑鐔镐繆椤栨繂鍚圭紒鈽呮嫹闂備線娼ф蹇曞緤閸撗勫厹濡わ絽鍟悡銉╂煛閸ヮ煁顏堝礉閵堝洨纾奸弶鍫氭櫅娴犫晝绱掗悩宕囨创妤犵偞锕㈤獮鍥敇閻曚焦顥堥梻浣筋嚃閸犳帡寮查悩鑼殾婵鎷烽柟宕囧█椤㈡牠骞愭惔鈥茬凹濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏灪閸嬪鈹戦悩鍙夋悙闁搞劌鍊块弻娑⑩�﹂幋婵囩彯闂佹悶鍊栧ú姗�濡甸崟顖氱睄闁稿本鐭竟鏇㈡倵鐟欏嫭绀�妞わ妇鏁诲濠氬Ω閳哄倸浜為梺绋挎湰缁嬫垿顢旈敓锟�?濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴烆焸濞戞ǚ鏋庨柟鐐綑娴狀參鎮峰鍕叆闁伙絿鍏樻俊鐑藉煛閸屾稒顏熼梻浣芥硶閸ｏ箓骞忛敓锟�
			xbean.TransfromInfo ti = xtable.Transfromroles.select(playerid);
			int rideid = 0;
			if (ti != null) {
				rideid = ti.getRide();
			}
			fire.pb.move.STransfromShape send = new fire.pb.move.STransfromShape();
			send.shape = shape;
			send.playerid = playerid;
			if(role.getModeid() == shape) {
				role.setTransformid(0);//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰悽鍛婃櫢闁哄倶鍊楅悾鐢碉拷瑙勬礀閵堝憡淇婇悜鑺ユ櫆缂備焦锕╁Λ鍛存⒒閸屾瑧顦﹂柛鐔锋健楠炴牠顢曢敃锟界粻鐘诲箹濞ｎ剙濡介柛濠傚槻閳规垿鎮╅崣澶婎槱闂佺粯鎸鹃崰鏍蓟閻斿吋鐒介柨鏇嫹妤犵偞鐗滅槐鎺楀箵閹烘繄鍚嬮梺鍝勭焿缁绘繂鐣烽幒妤�绀冮柕濠忕畱椤︹晠姊虹紒妯诲鞍缂佸鍨块垾锔炬崉閵婏箑纾梺鎯х箳閹虫捇銆傚ú顏呪拺闁告稑锕ラ悡鐔兼煕婵犲啰澧遍柟骞垮灩閳藉濮�閻樿鏁归梻浣虹帛濡啴藟閹炬潙顕辩�癸拷閸曨剙锟藉灚绻涢崼婵堜虎闁哄闄勬穱濠囶敃閵忕媭浼冮梺璇″櫍缁犳牠寮幘缁樺亹闁肩⒈鍓﹂崥瀣繆閻愵亜锟芥牕螞娴ｈ鍙忛柕鍫濐槸閻ゎ噣鏌曡箛瀣拷鏍煕閹烘嚚褰掓晲閸ャ劌娈屽銈嗘礃缁海妲愰幒鏃撴嫹閿濆骸浜滈柣蹇擃嚟閿熻姤顔栭崰姘跺极婵犳哎锟戒礁螖閸涱厾锛滃┑鐘诧工閸燁偆鎲撮敃锟介埞鎴︽偐閸偅姣勬繝娈垮枤閺佹悂宕版繝鍌ゅ悑濠㈣泛锕﹂崢閬嶆⒑閸濆嫬鏆欓柣妤�锕幃陇绠涘☉娆戝幈濡炪倖鍔х徊璺ㄧ不閺嶎厽鐓曢柨婵嗘噺鐠愶紕绱掓潏銊﹀碍妞ゆ挸銈稿畷鐔碱敇閻橀潧搴婂┑鐘殿暯濡插懘宕戦崟顖氱疇婵鎷风�殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�?
			}
			else {
				role.setTransformid(shape);
			}
			role.sendWhoSeeMeAndMe(send);	
			if(rideid > 0){
				final Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(role.getRoleID(), fire.pb.item.BagTypes.BAG, true);
				if (bag.getItemNum(rideid, 0) > 0) 
					new PEquipRideProc(playerid, rideid, -1).submit();
			}
			Role addRole = RoleManager.getInstance().getRoleByID(role.getRoleID());
			SAddUserScreen sadduser = new SAddUserScreen();
			sadduser.rolelist.add(addRole.getRoleBasic());
			gnet.link.Onlines.getInstance().send(role.getRoleID(), sadduser);
		} else if (changetype == 3) {
			//闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑﹦绋忔繝銏ｆ硾椤戝洭銆呴幓鎹楀綊鎮╁顔煎壈缂佺偓鍎抽悘婵嬫箒闂佺绻愰崥瀣礊閹寸姷纾奸柣妯虹－閸欙拷闂佸搫鏈ú婵堢不濞戞熬鎷烽敐搴濇倣闁归鍏樺鎾偐閻㈢數鍔跺┑鐘灱閸╂牠宕濋弽顓熷亗闁告劦鍠楅悡鍐级閻愭潙顥嬫い锔肩畵閺岋繝宕卞▎蹇庢勃闂侀潧娲ょ�氼垶鎮㈡笟锟介弻娑橆煥閸愩劍娈查柣搴㈣壘濠�閬嶆儉椤忓牆绾ф繛鍡欏亾鏁堥梺璇插閻旑剟骞忛敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣銏犲閺佸﹪鏌″搴″箹缂佹劖顨婇弻鈥愁吋鎼粹�冲闂佽桨绀佺�氫即寮诲☉妯锋闁告鍋熸禒顓㈡煟鎼淬垼澹樻い顓犲厴瀵鍩勯崘銊х獮闁瑰吋鎯岄崹鍫曟偘濠婂牊鈷戦悹鎭掑妼閺嬫垿鏌＄�ｎ亶鐓兼鐐茬箻閺佹捇鏁撻敓锟�?
		//	role.setCruiseid(shape);//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸偅缍堝┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锝呭悁闁垶鏌＄仦鍓ф创闁糕晛瀚板畷姗�鎮欓澶婃倕闂傚倷绀侀幗婊堝窗鎼淬劌绠犳慨妤嬫嫹鐎殿喛顕ч鍏煎緞婵犲嫬骞愬┑鐐舵彧缁蹭粙骞夐垾鏂ユ灁闁割偅娲橀埛鎴犵磼椤栨稒绀冩繛鍛閵囧嫰濡搁妷顖濆惈閻庢鍠栭…鐑藉极閹版澘宸濋柛灞剧矊閺嬫稓锟借娲栫紞濠囥�佸▎鎾崇畾鐟滃秶绱撻敓锟�?婵犵數濮烽弫鎼佸磻閻愬搫绠板┑鐘崇閸ゅ苯螖閿濆懎鏆為柡鍛箞閺屻劑寮崹顔规寖闂佹椿鍘煎Λ妤呭煘閹寸偛绶炲┑鐘插閺�鐟�shal()
		//	role.setCruiseid2(shape2);
			//role.setCruiseid3(shape3);
		//	Role addRole = RoleManager.getInstance().getRoleByID(role.getRoleID());
		//	SAddUserScreen sadduser = new SAddUserScreen();
		//	sadduser.rolelist.add(addRole.getRoleBasic());
		//	role.sendWhoSeeMeAndMe(sadduser);
			//gnet.link.Onlines.getInstance().send(role.getRoleID(), sadduser);
		}
		else if (changetype == 4)
		{
			//闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃秹婀侀梺缁樺灱濡嫮绮婚悩缁樼厵闁硅鍔﹂崵娆撴倵濮橆剦妲归柕鍥у楠炴帡骞嬪┑鎰偅闂備焦鎮堕崝宀勫磹瑜版帒绠為柕濞垮労濞笺劑鏌涢埄鍐炬當缂佺姾顕ч—鍐Χ閸屾稒鐝栭梺绋跨箲閿曘垽鐛崘顓滀汗闁圭儤鍨归崐鐐烘⒑闂堟侗鐒鹃柛搴＄－缁﹤鐣￠柇锔藉瘜闂侀潧鐗嗘鍛婄閺嶎厽鐓曞┑鐘插暟缁犵偟锟芥鍠栭…鐑藉箖閵忋倖鍋栭悗娑櫭璺衡攽閻愭潙鐏﹂柣鐕佸灦閹偤鎸婃径妯煎數閻熸粍绻堥獮蹇涙晸閿燂拷?闂傚倸鍊搁崐椋庣矆娓氾拷楠炲鍩勯崘顏嗘嚌濠德板�曢幊搴ｇ矆閸喓绠鹃柟瀛樼懃閻忣亪鏌涚�ｅ墎绡�闁哄瞼鍠栭獮鍡氼槻妞わ絽纾惀顏堝箚瑜嬮崑銏ゆ煛瀹�瀣М妤犵偛娲Λ鍐ㄢ槈濮楀棙浜ゅ┑锛勫亼閸婃牕煤濡厧鍨濈�广儱妫涢埞宥呪攽閻樺弶澶勯柛濠勫厴閺岀喓绱掑Ο娲殝闂佸綊顥撻崗妯虹暦瑜版帩鏁婇柣鎰靛墯椤旀洟姊绘担鐟邦嚋缂佽鍊胯棟妞ゆ牜鍋涚粈鍐煥閻斿墎鐭欐慨濠冩そ濡啫鈽夋潏鈺佸絾闂備浇顕х换鎴犳崲閸喍绻嗛柣銈庡灱濡绢亪姊鸿ぐ鎺濇闁稿繑锚閻ｇ兘鎮滅粵瀣櫍闂佺粯锕╅崳顖炲箯闁垮绡�闁搞儯鍔庨崢閬嶆⒑鐟欏嫬鍔ゆい鏇ㄥ幘缁鎮欓悜妯煎幍濡炪倖鏌ㄩ幖顐﹀礉閿曞倹鐓涘ù锝堫潐瀹曞矂鏌℃担瑙勫磳闁轰焦鎹囬弫鎾绘晸閿燂拷
			if(role.getCruiseid() == shape || role.getCruiseid() == 0) {
				role.setCruiseid(0);//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸偅缍堝┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锝呭悁闁垶鏌＄仦鍓ф创闁糕晛瀚板畷姗�鎮欓澶婃倕闂傚倷绀侀幗婊堝窗鎼淬劌绠犳慨妤嬫嫹鐎殿喛顕ч鍏煎緞婵犲嫬骞愬┑鐐舵彧缁蹭粙骞夐垾鏂ユ灁闁割偅娲橀埛鎴犵磼椤栨稒绀冩繛鍛閵囧嫰濡搁妷顖濆惈閻庢鍠栭…鐑藉极閹版澘宸濋柛灞剧矊閺嬫稓锟借娲栫紞濠囥�佸▎鎾崇畾鐟滃秶绱撻敓锟�?婵犵數濮烽弫鎼佸磻閻愬搫绠板┑鐘崇閸ゅ苯螖閿濆懎鏆為柡鍛箞閺屻劑寮崹顔规寖闂佹椿鍘煎Λ妤呭煘閹寸偛绶炲┑鐘插閺�鐟�shal()
				role.setCruiseid2(0);
				role.setCruiseid3(0);
				Role addRole = RoleManager.getInstance().getRoleByID(role.getRoleID());
				SAddUserScreen sadduser = new SAddUserScreen();
				sadduser.rolelist.add(addRole.getRoleBasic());
				role.sendWhoSeeMe(sadduser);
				//gnet.link.Onlines.getInstance().send(role.getRoleID(), sadduser);
			}
		} else if (changetype == 5) {
				//濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨剙娅ｉ梺娲诲幗椤ㄥ﹪寮婚妸鈺傚亞闁稿本绋戦锟�?闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曢敃锟界粣妤佺箾閹存瑥鐏╃紒鐙�鍨跺娲垂椤曞懎鍓崇紓浣哄█缁犳牠寮婚悢铏圭＜婵☆垵娅ｉ悷鏌ユ⒑缁嬫鍎嶉柛搴㈠▕閺佹捇鎳為妷顔兼櫛闂侀潻缍嗛崹鍫曠嵁韫囨稒鏅搁柨鐕傛嫹? by changhao
				role.setCruiseid(shape);//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸偅缍堝┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锝呭悁闁垶鏌＄仦鍓ф创闁糕晛瀚板畷姗�鎮欓澶婃倕闂傚倷绀侀幗婊堝窗鎼淬劌绠犳慨妤嬫嫹鐎殿喛顕ч鍏煎緞婵犲嫬骞愬┑鐐舵彧缁蹭粙骞夐垾鏂ユ灁闁割偅娲橀埛鎴犵磼椤栨稒绀冩繛鍛閵囧嫰濡搁妷顖濆惈閻庢鍠栭…鐑藉极閹版澘宸濋柛灞剧矊閺嬫稓锟借娲栫紞濠囥�佸▎鎾崇畾鐟滃秶绱撻敓锟�?婵犵數濮烽弫鎼佸磻閻愬搫绠板┑鐘崇閸ゅ苯螖閿濆懎鏆為柡鍛箞閺屻劑寮崹顔规寖闂佹椿鍘煎Λ妤呭煘閹寸偛绶炲┑鐘插閺�鐟�shal()
				role.setCruiseid2(shape2);
				role.setCruiseid3(shape3);
				Role addRole = RoleManager.getInstance().getRoleByID(role.getRoleID());
				SAddUserScreen sadduser = new SAddUserScreen();
				sadduser.rolelist.add(addRole.getRoleBasic());
				role.sendWhoSeeMe(sadduser);
				//gnet.link.Onlines.getInstance().send(role.getRoleID(), sadduser);
			}

	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 739900;

	public int getType() {
		return 739900;
	}

	public long playerid; // 玩家id
	public int shape;
	public int shape2;
	public int shape3;
	public int changetype; // 0是变身，1是npc跟随，2有座骑时，3巡游，4取消巡游

	public GChangeShape() {
	}

	public GChangeShape(long _playerid_, int _shape_, int _shape2_, int _shape3_, int _changetype_) {
		this.playerid = _playerid_;
		this.shape = _shape_;
		this.shape2 = _shape2_;
		this.shape3 = _shape3_;
		this.changetype = _changetype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(playerid);
		_os_.marshal(shape);
		_os_.marshal(shape2);
		_os_.marshal(shape3);
		_os_.marshal(changetype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		playerid = _os_.unmarshal_long();
		shape = _os_.unmarshal_int();
		shape2 = _os_.unmarshal_int();
		shape3 = _os_.unmarshal_int();
		changetype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GChangeShape) {
			GChangeShape _o_ = (GChangeShape)_o1_;
			if (playerid != _o_.playerid) return false;
			if (shape != _o_.shape) return false;
			if (shape2 != _o_.shape2) return false;
			if (shape3 != _o_.shape3) return false;
			if (changetype != _o_.changetype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)playerid;
		_h_ += shape;
		_h_ += shape2;
		_h_ += shape3;
		_h_ += changetype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(playerid).append(",");
		_sb_.append(shape).append(",");
		_sb_.append(shape2).append(",");
		_sb_.append(shape3).append(",");
		_sb_.append(changetype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GChangeShape _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(playerid - _o_.playerid);
		if (0 != _c_) return _c_;
		_c_ = shape - _o_.shape;
		if (0 != _c_) return _c_;
		_c_ = shape2 - _o_.shape2;
		if (0 != _c_) return _c_;
		_c_ = shape3 - _o_.shape3;
		if (0 != _c_) return _c_;
		_c_ = changetype - _o_.changetype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

