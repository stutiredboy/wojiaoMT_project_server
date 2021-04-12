
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
				role.setTransformid(0);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垹顭峰缁樻媴閻熼偊鍤嬪┑鐐插级閻楃姴鐣烽幇鐗堝仺闁告稑锕ュ▍銏ゆ⒑閸濆嫬锟藉爼宕愬Δ鍛仼闁汇垻顣幏椋庢喆閸曨剛顦ラ梺闈涚墕閹测剝绌辨繝鍥ㄥ�婚柤鎭掑劜濞呭棛绱撻崒娆戝妽闁挎洍鏅涜灋闁告稑鐡ㄩ埛鎺楁煕鐏炲墽鎳呮い锔肩畵閺屾盯鎮㈤柨瀣淮濡ょ姷鍋為悧鐘汇�侀弴銏℃櫇闁跨喓鏅划濠氭偐鐠囪尙顔愬┑鐑囩秵閸撴瑦淇婃禒瀣厱濠电姴鍊稿Σ濠氭煃鐟欏嫬鐏撮柟顔规櫊瀹曪絾寰勬繝搴⑿熼梻鍌欒兌缁垶骞愭ィ鍐ㄧ獥闁哄稁鍘奸拑鐔兼煟閺傚灝鎮戦柣鎺嶇矙閺屻劑寮撮鍛伓婵°倗濮烽崑鐐烘偋濠婂懏顫曢柟鐑橆殔缁犵敻鏌熼悜妯肩畼闁告艾顑夊娲传閸曨厾鍔圭紓浣虹帛缁诲倿鎮鹃悜钘夌婵°倧鎷风紒锟介崘顔界厪濠电姴绻掗悾杈ㄣ亜閿旇娅婃慨濠呮缁辨帒螣鐠囨煡鐎虹紓鍌欑椤戝棝宕归崸妤�鐏抽柨鏃傚亾瀹曞鏌曟繝蹇曠暠缁剧虎鍨跺娲箚瑜忕粻鎶芥煙閾忣偅宕岄柕鍡楀�哥叅妞ゅ繐鎳夐幏娲⒑閸涘﹦鈽夐柨鏇樺劦閹繝鎮㈤崗鑲╁幈婵犵數濮撮崯鐗堟櫠闁秵鐓欐鐐茬仢閻忊晠鏌嶉挊澶樻█濠殿噯鎷烽梺缁橆焾椤曆囧极瑜版帗鈷掑ù锝堟鐢稒淇婇銏犳殻閽樼喖鏌熼悙顒佺稇妞ゆ洝浜敓鐣屾閹风兘鏌涢弴銊ュ闁跨喕妫勯悘姘辨崲濞戙垹閱囨繝闈涚墔閾忓酣姊洪崫鍕靛劀闂傚嫬瀚粚杈ㄧ節閸ヨ埖鏅濋梺闈涚箳婵厽瀵奸崘顔解拺閻犲洠锟借櫕鐝濈紓浣哄У閻楃姴顕ｉ锕�绠荤紓浣姑禍褰掓⒑閼测斁鎷￠柛鎿勭畵瀹曘儳锟斤綆鍋傜换鍡涙煟閹板吀绨婚柨鐔诲Г閻楁洝鐏嬫繛杈剧秬椤宕ｈ箛娑欑厪闁割偅绻嶅Σ鎼佹煟閵堝骸娅嶉柡灞炬礉缁犳稓锟斤綆浜烽幏鐑藉冀椤撶偟鍘遍梺鍦劋閸ゆ俺銇愰幒鎾存珳闂佹悶鍎崝灞解枔鐏炵瓔娓婚柕鍫濇缁�鍐磼椤斿吋鎹ｆ俊鍙夊姍楠炴帡寮幘鏉戭伓闂佹寧绻傛鍛婄濠婂牊鐓熼煫鍥ㄦ惄閸ょ喖鏌ㄩ悢璇残撴い鏃�鐗犲畷鏉款潩鐠虹儤鐎繝鐢靛У閸濆酣鏁撻幋鎺旑槮閾绘牠鏌涘☉鍗炲箻闁挎稒绮岄埞鎴︽偐鐠囇冧紣闂佸摜鍣ラ崑鍡涘箟閹绢喗鏅濋柨鐔剁矙閸╃偤骞嬮敂钘変汗闂佸壊鐓堥崑鍛掗崟顒傜瘈婵炲牆鐏濋弸銈夋煛娴ｈ鍊愮�规洜澧楃换婵嬪磼閵堝懏鍊┑鐘灱濞夋盯鏁冮敃鍌氬偍闂侇剙绉甸埛鎴︽煕濠靛棗顏╅柡鍡樼懇閺岋絽螖閿熶粙鏁冮鍫濈畺闂勫洨绮诲☉妯锋婵炲棙鍨甸獮鍫熶繆閻愵亜锟芥牠宕濊瀵板﹦鎹勯妸褌绗夐梺鍝勭▉閸樹粙鎮￠弴銏＄叆婵犻潧妫欓崳娲偣閹板墎纾跨紒杈ㄥ笚濞煎繘濡搁敃锟界喊宥咁渻閵堝棙灏柕鍫㈩焾閻ｇ兘鎮㈢喊杈ㄦ櫍闂佺粯锕㈠褎鎯旀繝鍌楁斀闁绘ɑ顔栭弳顖涗繆閹绘帗鍤囩�规洘鍨垮畷鐔碱敍濮樿京鏋冩繝娈垮枟椤ㄦ劙骞忔搴嫹濞堝灝娅橀柛瀣躬閻涱喖螣閼测晝锛滃┑鈽嗗灣缁垶顢旈悢鍏尖拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟�?
			}
			else
				role.setTransformid(shape);
			role.sendWhoSeeMeAndMe(send);
			Role addRole = RoleManager.getInstance().getRoleByID(role.getRoleID());
			SAddUserScreen sadduser = new SAddUserScreen();
			sadduser.rolelist.add(addRole.getRoleBasic());
			gnet.link.Onlines.getInstance().send(role.getRoleID(), sadduser);
		} else if(changetype == 1) {
			//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉潡寮婚敐澶婄鐎规洖娲ら崫娲⒑閸濆嫷鍎愰柣妤侇殘閹广垹鈽夐姀鐘殿吅闂佺粯鍔欏褔寮抽敓鐘斥拺闁荤喐婢樺Σ濠氭煕閵忥紕鍙�闁挎繄鍋涢埞鎴狅拷锝庡亜娴滄鏌熼崗鑲╂殬闁搞劍妲掗妵鎰償椤厾绠氶梺闈涚墕濞层倕鏆╅梻浣侯焾椤戝棝鎯勯姘辨殾妞ゆ牜鍎愰弫宥嗙箾閹寸偛鐒归柡锟介搹顐ょ瘈闁汇垽娼у瓭闁诲孩纰嶉幃鍌炵嵁韫囨稒鍊婚柦妯侯槹瀹撳秴顪冮妶鍡樺暗濠殿喖纾懞閬嶅箻椤旇В鎷婚梺绋挎湰閼归箖鏁撻挊澶婃Щ闂囧鏌涢妷鎴濇噺濞堥箖姊洪崜鑼帥闁稿鎳樺畷锝堢疀濞戞瑧鍘靛銈嗙墪濡挳骞忛悜鑺ョ厸閻庯綆浜炴晥闂佸搫琚崝宀勫煘閹达箑骞㈤柍鍝勫�愰敂鍓х＝濞达絿鎳撴慨鍫熴亜閵娿儻韬�殿喖顭烽崹鎯х暦閸ャ劍顔撴俊鐐�栧ú鏍涘▎鎴嫹濮橆剛绉烘慨濠冩そ瀹曨偊宕熼棃娑樺婵犵妲呴崑鍕疮閺夋埈鍤曞┑鐘宠壘鎯熼梺鍐叉惈閸婂憡绂嶉悙鐑樷拺缂佸瀵у﹢鎵磼鐎ｎ偄鐏存い銏℃閺佹捇鏁撻敓锟�
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
			//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉潡寮婚敐澶婄鐎规洖娲ら崫娲⒑閸濆嫷鍎愰柣妤侇殘閹广垹鈽夐姀鐘殿吅闂佺粯鍔欏褔寮抽敓鐘斥拺闁荤喐婢樺Σ濠氭煕閵忥紕鍙�闁挎繄鍋涢埞鎴狅拷锝庡亜娴滄鏌熼崗鑲╂殬闁搞劍妲掗妵鎰償椤厾绠氶梺闈涚墕濞层倕鏆╅梻浣侯焾椤戝棝鎯勯姘辨殾妞ゆ牜鍎愰弫宥嗙節婵犲倸顏╅幖鏉戯工閳规垿鎮╃紒妯婚敪濡炪倖鍨甸幊姗�骞冨▎鎰瘈闁告洦鍓欓弸鎴︽倵楠炲灝鍔氭い锔垮嵆瀹曟垿鎮㈤梹鎰畾濡炪倖鐗楃换鍌炲触閸︻厾纾奸柍钘夋噺鐎氬綊姊婚崒娆戠獢婵炰匠鍕垫闊洦娲栫欢銈夋煕閹炬瀚崢瑙勪繆閵堝繒鍒伴柛鐕佸灦閹繝濡烽埡鍌滃幐闂佹悶鍎洪悡渚�顢旈崼婵堫槷闂侀潧鐗嗗ú銊у婵傜绾ч柛顐ｇ濞呭懎霉閻橆偅娅囩紒杈ㄥ浮閹晛鐣烽崶銊ュ灡婵°倗濮烽崑鐐烘晝閵忋倗宓侀柛銉墻閺佸洭鏌ｉ弴姘卞妽妞ゃ儱鐗撳缁樻媴缁涘娈愰梺鍝ュУ鐢�愁嚕閺屻儲鍋愰柤纰卞墯濞堟儳鈹戦绛嬫闁归鍏橀弻鐔风暦閸パ�鏋呭銈冨灪閻楃娀鐛幇顓熷劅闁炽儴灏欓崙瑙勭節閻㈤潧啸闁轰礁鎲￠幈銊╂倻閽樺鐎梺褰掓？缁�浣哄缂佹绠鹃柟瀛樼懃閻忣亪鏌涚�ｎ亶鍎忛柍瑙勫灴閹晠宕ｆ径瀣�烽梻浣规偠閸斿矂宕愰崸妤�钃熸繛鎴旀噰閿熸枻绠撻獮瀣攽閸モ晛钂嬮梻鍌欑劍閹爼宕愰弽顬″搫顫滈敓鑺ヤ繆閻㈢绀嬫い鏍ㄦ皑閻嫰姊虹粙鎸庢拱闁活収鍠楃粩鐔煎即閵忊�筹拷鐢告偡濞嗗繐顏紒锟介敓钘夘渻閵堝繐顩柡浣筋嚙椤曪絾绻濆顑┾晠鏌嶉崫鍕拷鍛婄閻愮儤鈷戠紒瀣濠�鎵磼鐎ｎ偄鐏存い銏℃閺佹捇鏁撻敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁惧墽绮换娑㈠箣閻戝棛鍔┑鐐村灦鑿ら柡瀣叄閺岀喖鎮欓浣虹▏婵炲濯崣鍐箖瀹勯偊鐓ラ柛鏇ㄥ墰閸欏棝姊烘导娆戞偧闁稿繑蓱娣囧﹪鎮滈挊澶屽幐闂佺鏈粙鎺楊敂閻斿吋鈷掑ù锝堝Г绾爼鏌涢敐蹇曠暤妤犵偛绻橀弫鎾绘晸閿燂拷
			xbean.TransfromInfo ti = xtable.Transfromroles.select(playerid);
			int rideid = 0;
			if (ti != null) {
				rideid = ti.getRide();
			}
			fire.pb.move.STransfromShape send = new fire.pb.move.STransfromShape();
			send.shape = shape;
			send.playerid = playerid;
			if(role.getModeid() == shape) {
				role.setTransformid(0);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垹顭峰缁樻媴閻熼偊鍤嬪┑鐐插级閻楃姴鐣烽幇鐗堝仺闁告稑锕ュ▍銏ゆ⒑閸濆嫬锟藉爼宕愬Δ鍛仼闁汇垻顣幏椋庢喆閸曨剛顦ラ梺闈涚墕閹测剝绌辨繝鍥ㄥ�婚柤鎭掑劜濞呭棛绱撻崒娆戝妽闁挎洍鏅涜灋闁告稑鐡ㄩ埛鎺楁煕鐏炲墽鎳呮い锔肩畵閺屾盯鎮㈤柨瀣淮濡ょ姷鍋為悧鐘汇�侀弴銏℃櫇闁跨喓鏅划濠氭偐鐠囪尙顔愬┑鐑囩秵閸撴瑦淇婃禒瀣厱濠电姴鍊稿Σ濠氭煃鐟欏嫬鐏撮柟顔规櫊瀹曪絾寰勬繝搴⑿熼梻鍌欒兌缁垶骞愭ィ鍐ㄧ獥闁哄稁鍘奸拑鐔兼煟閺傚灝鎮戦柣鎺嶇矙閺屻劑寮撮鍛伓婵°倗濮烽崑鐐烘偋濠婂懏顫曢柟鐑橆殔缁犵敻鏌熼悜妯肩畼闁告艾顑夊娲传閸曨厾鍔圭紓浣虹帛缁诲倿鎮鹃悜钘夌婵°倧鎷风紒锟介崘顔界厪濠电姴绻掗悾杈ㄣ亜閿旇娅婃慨濠呮缁辨帒螣鐠囨煡鐎虹紓鍌欑椤戝棝宕归崸妤�鐏抽柨鏃傚亾瀹曞鏌曟繝蹇曠暠缁剧虎鍨跺娲箚瑜忕粻鎶芥煙閾忣偅宕岄柕鍡楀�哥叅妞ゅ繐鎳夐幏娲⒑閸涘﹦鈽夐柨鏇樺劦閹繝鎮㈤崗鑲╁幈婵犵數濮撮崯鐗堟櫠闁秵鐓欐鐐茬仢閻忊晠鏌嶉挊澶樻█濠殿噯鎷烽梺缁橆焾椤曆囧极瑜版帗鈷掑ù锝堟鐢稒淇婇銏犳殻閽樼喖鏌熼悙顒佺稇妞ゆ洝浜敓鐣屾閹风兘鏌涢弴銊ュ闁跨喕妫勯悘姘辨崲濞戙垹閱囨繝闈涚墔閾忓酣姊洪崫鍕靛劀闂傚嫬瀚粚杈ㄧ節閸ヨ埖鏅濋梺闈涚箳婵厽瀵奸崘顔解拺閻犲洠锟借櫕鐝濈紓浣哄У閻楃姴顕ｉ锕�绠荤紓浣姑禍褰掓⒑閼测斁鎷￠柛鎿勭畵瀹曘儳锟斤綆鍋傜换鍡涙煟閹板吀绨婚柨鐔诲Г閻楁洝鐏嬫繛杈剧秬椤宕ｈ箛娑欑厪闁割偅绻嶅Σ鎼佹煟閵堝骸娅嶉柡灞炬礉缁犳稓锟斤綆浜烽幏鐑藉冀椤撶偟鍘遍梺鍦劋閸ゆ俺銇愰幒鎾存珳闂佹悶鍎崝灞解枔鐏炵瓔娓婚柕鍫濇缁�鍐磼椤斿吋鎹ｆ俊鍙夊姍楠炴帡寮幘鏉戭伓闂佹寧绻傛鍛婄濠婂牊鐓熼煫鍥ㄦ惄閸ょ喖鏌ㄩ悢璇残撴い鏃�鐗犲畷鏉款潩鐠虹儤鐎繝鐢靛У閸濆酣鏁撻幋鎺旑槮閾绘牠鏌涘☉鍗炲箻闁挎稒绮岄埞鎴︽偐鐠囇冧紣闂佸摜鍣ラ崑鍡涘箟閹绢喗鏅濋柨鐔剁矙閸╃偤骞嬮敂钘変汗闂佸壊鐓堥崑鍛掗崟顒傜瘈婵炲牆鐏濋弸銈夋煛娴ｈ鍊愮�规洜澧楃换婵嬪磼閵堝懏鍊┑鐘灱濞夋盯鏁冮敃鍌氬偍闂侇剙绉甸埛鎴︽煕濠靛棗顏╅柡鍡樼懇閺岋絽螖閿熶粙鏁冮鍫濈畺闂勫洨绮诲☉妯锋婵炲棙鍨甸獮鍫熶繆閻愵亜锟芥牠宕濊瀵板﹦鎹勯妸褌绗夐梺鍝勭▉閸樹粙鎮￠弴銏＄叆婵犻潧妫欓崳娲偣閹板墎纾跨紒杈ㄥ笚濞煎繘濡搁敃锟界喊宥咁渻閵堝棙灏柕鍫㈩焾閻ｇ兘鎮㈢喊杈ㄦ櫍闂佺粯锕㈠褎鎯旀繝鍌楁斀闁绘ɑ顔栭弳顖涗繆閹绘帗鍤囩�规洘鍨垮畷鐔碱敍濮樿京鏋冩繝娈垮枟椤ㄦ劙骞忔搴嫹濞堝灝娅橀柛瀣躬閻涱喖螣閼测晝锛滃┑鈽嗗灣缁垶顢旈悢鍏尖拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟�?
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
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊炲銈嗗笒閿曪妇绮欒箛鏃傜瘈闁靛骏绲剧涵鐐亜閹存繃鍠橀柕鍡楁嚇楠炴捇骞戝Δ锟界紞濠囧箖閳轰緡鍟呮い鏃傚帶婢瑰牏绱撴担鍝勪壕闁稿孩濞婇幃妯衡攽鐎ｎ偆鐣抽梻鍌欒兌椤牏鎹㈤幇鏉胯Е閻庯綆鍓涚粈濠囨煙鐎电啸缁炬儳銈搁弻锝呂熼搹鐧哥礊闂佸憡鐟遍幏鐑芥⒒娴ｅ憡鎯堥柡鍫墮鐓ゆ繝闈涚墢娑撳秵绻涢幋鐐靛暡闁归鍏橀弫鎰償濠靛洤锟斤綁姊鸿ぐ鎺濇闁稿繑锚椤曪綁骞橀钘変汗闂佹眹鍨婚弫鎼佸礉鐠鸿　鏀介柣姗嗗枛閻忛亶鏌涢埡鍌滃⒌鐎规洘绻堝浠嬵敇閻旇渹绨甸梻浣告啞閸旓箓宕板Δ鍛亗闁告劦鍠栫痪褔鏌ｉ幇顓熺稇妞ゃ儱顑嗛妵鍕晜閼测晝鏆ら梺鍝勭焿缁绘繂鐣烽崡鐐╂瀻闊洤瀛╅崟鍐⒒娓氾拷濞佳兠洪妶鍥锋嫹濮樼厧鐏﹂柟顔哄灪缁楃喖鏁撴禒瀣摕婵炴垶锕╅悡銉╂煕閹扳晛濡芥繛鍫熺叀閺岋絾鎯旈姀锝咁棟濠电媴鎷烽梺顒�绉甸崕澶嬨亜韫囨挾澧曠紒鐙欏嫮绠鹃柛鈩冪懃娴滈箖寮崼銉︹拺閻犲洦褰冮銏ゆ煟閺冩垵澧存鐐茬箻閺佹捇鏁撻敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊閻樺樊妫岄梺杞扮閿曨亪寮婚垾鎰佸悑閹肩补锟藉磭顔愮紓鍌欑劍閸旀牠銆冩繝鍥ц摕闁炽儲鍓氶崥瀣箹缁櫢鎷烽崘宸妧闂傚倷娴囧銊х矆娴ｇ尨鎷峰顐㈠祮鐎殿喛顕ч埥澶娢熼柨瀣垫綌闂備礁鎲￠〃鍫ュ磻閻斿摜顩锋い鎾卞灪閻撶喖骞栧ǎ顒�鐏卞瑙勆戦妵鍕敇閻樻彃骞嬮悗娈垮枛椤兘宕洪崟顖氱闁靛ě鍛祦闂備胶鎳撻崥瀣箚瀹�鍕瀭闁割偅娲橀崑妯荤節婵犲倻澧涢柍閿嬪灴閹綊骞侀幒鎴濐瀳闂佸搫顑嗛崹鍧楀蓟閿涘嫸鎷烽敐搴濇喚闁绘挸鍚嬮〃銉╂倷閼碱剛顔掗梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�?
		//	role.setCruiseid(shape);//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠抽柨鐔凤拷鐕佹綈婵炲弶鐗曠叅闁靛ň鏅滈崕妤呮煕閳╁喚妯呯憸鐗堝笚閺呮煡鏌涢顐簼缂傚秴鐗嗛埞鎴︽倷閸欏娅ф繝娈垮枟閹稿啿锕㈡笟锟藉铏圭磼濡浚浜滆灒濠电姴娲ょ壕鍧楁煙閹殿喖顣奸柣鎾存礋閹鏁愰崨顓熷�庨梻渚囧弾閸ㄥ爼寮婚敍鍕勃闁告挆鍕灡闂備胶纭堕弲娑氾拷姘緲閻ｅ嘲顫滈敓浠嬪箖濞嗘搩鏁嗗璺猴攻閸婃洟姊婚崒姘拷椋庣矆娓氾拷楠炴顭ㄩ崼婵堢崶闁瑰吋鐣崝宀�绮婚悩铏弿婵°倕顑嗙�氬綊鎮楀▓鍨灕妞ゆ泦鍥舵晣闁稿繒鍘х欢鐐测攽閻樻彃顏╂鐐村姇閳规垿鎮欓懜闈涙锭缂備浇寮撶划娆撶嵁婢舵劕鐏抽柡鍌樺劜閻忎線姊洪崜鎻掍簼婵炲弶锕㈤崺娑㈠箣閻樼數锛滃銈嗙墬缁嬫帞绮堥崘鈺冪闁告侗鍘介ˉ鐐烘煏閸パ冾伃濠碘剝鎮傛俊鐑筋敍濠靛棙鍎撻梺璇插椤旀牠宕伴弽顓涳拷锕傛倻閽樺鐎梺鍦濠㈡ê顔忓┑瀣厱閻忕偛澧介惌濠囨煛鐎ｎ偆銆掗柨鐔凤拷鐕佹綈婵炲弶鐗滅槐鐐寸節閸ャ儻鎷锋担绯曟瀻闁规儳纾悾楣冩偡濠婂啰肖缂佽鲸鎹囬弫鎾绘晸閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓缂佺姵婢橀埞鎴︽偐瀹曞浂鏆￠梺鎼炲�曢懟顖濈亙闂佹寧绻傞幊搴ㄥ汲閻愮儤鐓涢柛娑卞枤缁犵偤鏌＄仦璇插鐎殿噮鍓熷畷褰掝敊鐟欏嫬鐦遍梻鍌欑劍濡炲潡宕㈤悡骞稑螖閸涱厾鍘撮梺鐟邦嚟閸嬫稓娆㈤悙娴嬫斀闁绘ɑ褰冮銈夋煛閿熶粙鎮烽敓绲猦al()
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
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰效婵狅拷娓氾拷濮婅櫣绱掑Ο铏逛紘濠碘槅鍋勭�氼喚鍒掓繝姘亹缂備焦顭囬崢鐢告⒑绾拋娼愰柛鏃撶畵瀹曢潧鈻庨幘鏉戯拷鍨叏濮楀棗澧绘俊鎻掔秺閺屾洟宕惰椤忣厽顨ラ悙鏉戞诞妤犵偛顑呴埞鎴﹀箛椤忓懎浜濋梻鍌氬�烽悞锕傚箖閸洖绀夌�癸拷閸曨偆锛欓悷婊呭鐢帞绮婚悙鐑樼厪濠电偛鐏濋崝瀛樼箾缁楀搫濮傞柡灞剧洴閸╁嫰宕橀悙顒傛殽缂傚倷鑳舵慨楣冾敋瑜旈垾鏃堝礃椤斿槈褔鏌涚仦鍓р檨闁绘繃鐗犲铏圭矙鐠恒劎顔夐梺鎸庢磸閸ㄤ粙鎮伴锟藉畷姗�顢樺锟藉Ч妤呮⒑閸︻厼鍔嬮柛銊ョ秺瀹曟劙鎮欓悜妯锋嫼闂傚倸鐗婃笟妤呮倿妤ｅ啯鐓曢幖杈剧磿閿涘秶绱掗纭峰伐闁伙綇绻濋弻鍥晜閽樺妲ｉ梻鍌欑窔濞佳囨偋閸℃﹩娈介柛娑橈功椤╂煡鏌″搴″箺闁绘挻娲栭埞鎴︽偐閹绘帗娈剁紓浣哄Х閸嬬喖鏁撻懞銉晱闁哥姵鐗犻垾锕傛倻閽樺鐣洪梺闈涚箞閸婃牠宕戦弽顓熷�垫繛鎴烆仾椤忓牜鏁傞悹楦裤��閺�浠嬫煟閹邦厽缍戦柣蹇ョ畵閺岋綁鎮ゆ担鍝ヤ桓闂佽鍠氶崑銈夊箰婵犲啫绶炴俊顖滃帶閺佹悂鏌ｉ悢鍝ョ煁缂佽鐗撻悰顔跨疀濞戞瑦娅㈤梺璺ㄥ櫐閹凤拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋涢ˇ鐢稿春閸曨垰绀冩い蹇撴閸ゅ本绻濆閿嬫緲閿熻姤娲熼獮濠冩償閿濆洨鐒奸梺鍓插亞閸犳挾绮绘ィ鍐╃厵閻庢稒顭囬幊鍐煟韫囷絼閭柡灞剧〒閿熸枻绲芥晶搴ｅ姬閿熶粙姊洪崫鍕伇闁哥姵鐗犻悰顕�宕卞鍏夹╂俊鐐�х徊鐣屽椤撱垺鍎夋い蹇撶墕缁犳氨鎲哥�ｎ喖纾婚柕蹇嬪�栭悡娑氾拷鐧告嫹閻庯綆鍓涜ⅵ婵°倗濮烽崑娑樏洪鐐嶆盯宕橀妸銏☆潔濠殿喗顨呭Λ娆愮閵堝應鏀介柨娑樺娴滃ジ鏌涙繝鍐ⅹ閻撱倖淇婇婊冨付闁搞劍绻勯敓钘夌畭閸庡崬螞濞戙垹鐓樼�广儱鎳夐弨浠嬫煟濡搫绾у璺哄閺屾稒绻濋崟顐㈠箣闂佸搫鐬奸崰鎾舵閹烘嚦鐔访洪鍕杺闂傚倷绀佺紞濠囁夐幘璇茬婵☆垵娅ｉ弳锔炬喐閻楀牆淇柡浣革躬閺岋綁骞囬棃娑橆潽濡炪倖姊瑰ú鐔奉潖缂佹ɑ濯撮柣鐔煎亰閸ゅ绱撴担绛嬪殭闁稿﹨鍎诲Λ鐔奉渻閵堝棛澧遍柛瀣〒缁牓宕橀鐣屽弳闂佺粯鏌ㄦ晶搴ㄦ儗濞嗘劖鍙忓┑鐘插暞閵囨繃淇婇銏犳殭闁宠棄顦板蹇涘煛娴ｅ摜绋婚梻鍌氬�峰ù鍥敋瑜忛幑銏ゅ箣閻樺啿搴婇梺鍓插亞閸犲秶鎹㈤崱娑欑厽闁靛牆楠搁悘杈ㄤ繆缂侇澀閭慨濠囩細閵囨劙骞掑┑鍥舵闂備胶顭堢换鎴︽晪闂佷紮绲块崗姗�骞冨鍛┏閻庯綆鍋呭▍宥夋⒒娴ｈ櫣甯涢柨鏇楁櫊瀹曟娊顢涢悙鑼唵闂備礁鐏濋鍥╁姬閿熶粙姊洪幖鐐插姌闁告柨閰ｅ畷銏ゆ焼瀹ュ棌鎷洪柣鐔哥懃鐎氼剟宕濋妶鍡愪簻闁哄洢鍔岄獮妯肩磼椤旂⒈鐓奸柟顔界懇閹粌螣閻撳骸绠ュ┑锛勫亼閸婃牠寮婚妸鈺佺妞ゆ劧绠戠粈澶愭煥閺囩偛锟藉綊鎮″☉妯忓綊鏁愰崼顐ｇ秷閻庤娲栭惌鍌炲蓟閳╁啯濯撮悷娆忓绾炬娊姊烘潪鎵妽闁圭懓娲顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷
			if(role.getCruiseid() == shape || role.getCruiseid() == 0) {
				role.setCruiseid(0);//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠抽柨鐔凤拷鐕佹綈婵炲弶鐗曠叅闁靛ň鏅滈崕妤呮煕閳╁喚妯呯憸鐗堝笚閺呮煡鏌涢顐簼缂傚秴鐗嗛埞鎴︽倷閸欏娅ф繝娈垮枟閹稿啿锕㈡笟锟藉铏圭磼濡浚浜滆灒濠电姴娲ょ壕鍧楁煙閹殿喖顣奸柣鎾存礋閹鏁愰崨顓熷�庨梻渚囧弾閸ㄥ爼寮婚敍鍕勃闁告挆鍕灡闂備胶纭堕弲娑氾拷姘緲閻ｅ嘲顫滈敓浠嬪箖濞嗘搩鏁嗗璺猴攻閸婃洟姊婚崒姘拷椋庣矆娓氾拷楠炴顭ㄩ崼婵堢崶闁瑰吋鐣崝宀�绮婚悩铏弿婵°倕顑嗙�氬綊鎮楀▓鍨灕妞ゆ泦鍥舵晣闁稿繒鍘х欢鐐测攽閻樻彃顏╂鐐村姇閳规垿鎮欓懜闈涙锭缂備浇寮撶划娆撶嵁婢舵劕鐏抽柡鍌樺劜閻忎線姊洪崜鎻掍簼婵炲弶锕㈤崺娑㈠箣閻樼數锛滃銈嗙墬缁嬫帞绮堥崘鈺冪闁告侗鍘介ˉ鐐烘煏閸パ冾伃濠碘剝鎮傛俊鐑筋敍濠靛棙鍎撻梺璇插椤旀牠宕伴弽顓涳拷锕傛倻閽樺鐎梺鍦濠㈡ê顔忓┑瀣厱閻忕偛澧介惌濠囨煛鐎ｎ偆銆掗柨鐔凤拷鐕佹綈婵炲弶鐗滅槐鐐寸節閸ャ儻鎷锋担绯曟瀻闁规儳纾悾楣冩偡濠婂啰肖缂佽鲸鎹囬弫鎾绘晸閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓缂佺姵婢橀埞鎴︽偐瀹曞浂鏆￠梺鎼炲�曢懟顖濈亙闂佹寧绻傞幊搴ㄥ汲閻愮儤鐓涢柛娑卞枤缁犵偤鏌＄仦璇插鐎殿噮鍓熷畷褰掝敊鐟欏嫬鐦遍梻鍌欑劍濡炲潡宕㈤悡骞稑螖閸涱厾鍘撮梺鐟邦嚟閸嬫稓娆㈤悙娴嬫斀闁绘ɑ褰冮銈夋煛閿熶粙鎮烽敓绲猦al()
				role.setCruiseid2(0);
				role.setCruiseid3(0);
				Role addRole = RoleManager.getInstance().getRoleByID(role.getRoleID());
				SAddUserScreen sadduser = new SAddUserScreen();
				sadduser.rolelist.add(addRole.getRoleBasic());
				role.sendWhoSeeMe(sadduser);
				//gnet.link.Onlines.getInstance().send(role.getRoleID(), sadduser);
			}
		} else if (changetype == 5) {
				//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫孝缂傚秴锕璇差吋婢跺﹣绱堕梺鍛婃处閸撴瑥鈻嶉敐澶嬧拺婵炶尪顕ч獮妤併亜閵娿儻韬�殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴銏℃櫇闁跨喓鏅划锝呂旀担铏诡啎闂佺懓鐡ㄩ悷銉╂倶閳哄啰纾奸柣娆欐嫹闁搞劏娉涢～蹇撁洪鍕�銈嗘礀閹冲酣宕滃畷鍥╃＝濞达絽鎼埢鍫㈢磼閻樺磭澧电�殿喖顭烽幃銏ゆ惞閸︻叏绱叉繝纰樻閸ㄩ潧鈻嶉敐澶嬪仭闁哄被鍎查埛鎴犵磼鐎ｎ偒鍎ラ柛搴＄Ч閺屾稒鎯旈姀鐘灆闂佽桨鐒﹂幑鍥箠閻愬搫唯妞ゆ柨鍚嬪▍娑㈡⒒娓氾拷濞艰崵绱為崱娑樺瀭闁割偅娲滃畵渚�鐓崶銊р檨闁哄懏鎮傞弻銊╂偆閸屾稑顏�? by changhao
				role.setCruiseid(shape);//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠抽柨鐔凤拷鐕佹綈婵炲弶鐗曠叅闁靛ň鏅滈崕妤呮煕閳╁喚妯呯憸鐗堝笚閺呮煡鏌涢顐簼缂傚秴鐗嗛埞鎴︽倷閸欏娅ф繝娈垮枟閹稿啿锕㈡笟锟藉铏圭磼濡浚浜滆灒濠电姴娲ょ壕鍧楁煙閹殿喖顣奸柣鎾存礋閹鏁愰崨顓熷�庨梻渚囧弾閸ㄥ爼寮婚敍鍕勃闁告挆鍕灡闂備胶纭堕弲娑氾拷姘緲閻ｅ嘲顫滈敓浠嬪箖濞嗘搩鏁嗗璺猴攻閸婃洟姊婚崒姘拷椋庣矆娓氾拷楠炴顭ㄩ崼婵堢崶闁瑰吋鐣崝宀�绮婚悩铏弿婵°倕顑嗙�氬綊鎮楀▓鍨灕妞ゆ泦鍥舵晣闁稿繒鍘х欢鐐测攽閻樻彃顏╂鐐村姇閳规垿鎮欓懜闈涙锭缂備浇寮撶划娆撶嵁婢舵劕鐏抽柡鍌樺劜閻忎線姊洪崜鎻掍簼婵炲弶锕㈤崺娑㈠箣閻樼數锛滃銈嗙墬缁嬫帞绮堥崘鈺冪闁告侗鍘介ˉ鐐烘煏閸パ冾伃濠碘剝鎮傛俊鐑筋敍濠靛棙鍎撻梺璇插椤旀牠宕伴弽顓涳拷锕傛倻閽樺鐎梺鍦濠㈡ê顔忓┑瀣厱閻忕偛澧介惌濠囨煛鐎ｎ偆銆掗柨鐔凤拷鐕佹綈婵炲弶鐗滅槐鐐寸節閸ャ儻鎷锋担绯曟瀻闁规儳纾悾楣冩偡濠婂啰肖缂佽鲸鎹囬弫鎾绘晸閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓缂佺姵婢橀埞鎴︽偐瀹曞浂鏆￠梺鎼炲�曢懟顖濈亙闂佹寧绻傞幊搴ㄥ汲閻愮儤鐓涢柛娑卞枤缁犵偤鏌＄仦璇插鐎殿噮鍓熷畷褰掝敊鐟欏嫬鐦遍梻鍌欑劍濡炲潡宕㈤悡骞稑螖閸涱厾鍘撮梺鐟邦嚟閸嬫稓娆㈤悙娴嬫斀闁绘ɑ褰冮銈夋煛閿熶粙鎮烽敓绲猦al()
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

