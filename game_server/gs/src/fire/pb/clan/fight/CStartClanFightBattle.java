
package fire.pb.clan.fight;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CStartClanFightBattle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊峰ù鍥敋瑜嶉湁闁绘垵顫曢敓钘夊�块、姘舵晸娴犲宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣銏犲閺佸﹪鏌″搴″箹缂佹劖顨婇弻鈥愁吋鎼粹�冲闂佽桨绀佺�氫即寮诲☉妯锋婵炲棙鍔楃粙鍥⒑濞茶骞楁い銊ワ躬瀵鏁撻悩鑼�為梺瀹犳〃閻掞箓鎮楃拠宸富闁靛牆妫欑粈澶婎渻鐎涙ɑ鍊愭鐐茬墦婵℃悂濡烽钘夌紦闂備胶纭堕崜婵嬨�冮崨顖滀笉鐟滅増甯楅埛鎴︽偣閸ャ劎鍙�闁绘稒绮撻弻鐔煎礄閵堝棗顏� battle PK by changhao
 * @author Administrator
 *
 */
public class CStartClanFightBattle extends __CStartClanFightBattle__ {
	@Override
	protected void process() {
		// protocol handle
				
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		mkdb.Procedure startclanfightbattle = new mkdb.Procedure()
		{
			@Override
			protected boolean process()  throws Exception
			{
				long cur = System.currentTimeMillis();
				
				Long battleid = xtable.Roleid2battleid.select(roleid);
				if (battleid != null)
				{
					String srcname = xtable.Properties.selectRolename(roleid);
					String targetname = xtable.Properties.selectRolename(targetid);
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠撻柣鏍с偢瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷(ID = " + roleid + ") " + srcname + " 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠撻柣鏍с偢瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷(ID = " + targetid + ") " + targetname + " 闂傚倸鍊搁崐鎼佸磹妞嬪孩顐芥慨姗嗗墻閻掍粙鏌ゆ慨鎰拷鏍拷姘煼閺岋綁寮崒姘粯缂備緤鎷峰璺虹焿閹风兘鐛崹顔煎濡炪倧瀵岄崹璺虹暦瑜版帒纾兼繛鎴炵墧缁ㄥ姊洪崷顓炲妺闁搞劎鏁婚、鏃堝煛閸屾瑧绠氬銈嗗姧缂傚骞嬮悙纰樻敵婵犵數濮村ú锕傚磹閻戣姤鐓涘璺侯儏閻忊晜銇勯敂鍝勫婵﹥妞藉畷銊︾節韫囨挸褰嗛梻浣烘嚀閸ゆ牠骞忛敓锟�");
					return false;
				}
				
				Long targetbattleid = xtable.Roleid2battleid.select(targetid);
				if (targetbattleid != null)
				{
					String srcname = xtable.Properties.selectRolename(roleid);
					String targetname = xtable.Properties.selectRolename(targetid);
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠撻柣鏍с偢瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷(ID = " + roleid + ") " + srcname + " 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠撻柣鏍с偢瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷(ID = " + targetid + ") " + targetname + " 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倝绠栭弻宥夊传閸曨剙娅ｇ紓浣瑰姈椤ㄥ棙绌辨繝鍥ч柛娑卞枛濞呫倝姊虹粙娆惧剰妞わ妇鏁诲濠氬Ω閵夈垺鏂�闂佺硶妾ч弲婊呯懅闂傚倷绀佸﹢閬嶅箠閹剧粯鍋夊┑鍌滎焾閽冪喖鏌￠崶鈺佹灁缂佲槄鎷烽梻濠庡亜濞诧箑煤濠婂牆姹查柣妯肩帛閳锋垿鎮归崶顏勭毢缂佺姵鐓￠弻锝夊煛婵犲倻浠搁悗娈垮枛椤兘寮幘缁樺亹闁肩⒈鍓ㄧ槐鍙夌節閻㈤潧浠﹂柛銊ョ埣閹囧棘鎼存挻鐓㈠銈呯箰閻楀﹪鍩涢幋锔界厾婵炴潙顑嗗▍鎾绘煛閸℃鐭掗柡宀�鍠栧畷娆撳Χ閸℃浼�");
					return false;
				}
				
				Long c1 = xtable.Roleid2clanfightid.select(roleid); //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佲枙闁绘帟濮ょ换娑㈠幢濡粯鍎庨梺杞扮鐎氫即寮诲☉銏犵労闁告劧缂氱花鐢告⒑閹稿海绠撴い锔诲灣缁鎮烽幊濠傜秺閺佹劙宕卞▎鎰晸闁荤偞纰嶇换鍫濐潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙瀵搞偞闁哄懐濞�閻涱喛绠涘☉娆戝弳闁诲函缍嗛崜娑㈡儊閸儲鈷戦悹鎭掑妼閺嬪秶绱掗鐣屾噰闁靛棔绶氬顕�宕煎┑瀣暪婵犵數濞�濞佳囨偋濠婂牆瑙﹂柛娑卞枤缁★拷缂佸墽澧楄摫妞ゎ偄锕弻娑㈠Ω閿曪拷閳绘洜锟借娲樺ú鐔镐繆閸洖鐐婃い蹇撳珔閳ユ枼鏀芥い鏃�鏋绘笟娑㈡煕韫囨枂顏勫祫闂佸壊鍋侀崕鏌ユ偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷? by changhao
				if (c1 == null)
				{
					String srcname = xtable.Properties.selectRolename(roleid);
					String targetname = xtable.Properties.selectRolename(targetid);
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠撻柣鏍с偢瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷(ID = " + roleid + ") " + srcname + " 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠撻柣鏍с偢瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷(ID = " + targetid + ") " + targetname + " 濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚埄鍐ㄧ窞閻庯綆浜為崢鎰版⒑閼测晛顣奸悗绗涘洤桅闁告洦鍠氶悿锟介梺瑙勫礃濞夋盯銆傞搹鍦＝濞达絽鎼鎾剁磼閼碱剙浜剧紒宀冮哺缁绘繈宕堕懜鍨珫婵犵數濮撮敃銈夊疮椤愶絼绻嗛柧蹇撴贡绾捐棄銆掑顒佸窛闁告ɑ绮撻弻鐔煎礄閵堝棗顏�");

					return false;
				}
				
				Long c2 = xtable.Roleid2clanfightid.select(targetid); //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佲枙闁绘帟濮ょ换娑㈠幢濡粯鍎庨梺杞扮鐎氫即寮诲☉銏犵労闁告劧缂氱花鐢告⒑閹稿海绠撴い锔诲灣缁鎮烽幊濠傜秺閺佹劙宕卞▎鎰晸闁荤偞纰嶇换鍫濐潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙瀵搞偞闁哄懐濞�閻涱喛绠涘☉娆戝弳闁诲函缍嗛崜娑㈡儊閸儲鈷戦悹鎭掑妼閺嬪秶绱掗鐣屾噰闁靛棔绶氬顕�宕煎┑瀣暪婵犵數濞�濞佳囨偋濠婂牆瑙﹂柛娑卞枤缁★拷缂佸墽澧楄摫妞ゎ偄锕弻娑㈠Ω閿曪拷閳绘洜锟借娲樺ú鐔镐繆閸洖鐐婃い蹇撳珔閳ユ枼鏀芥い鏃�鏋绘笟娑㈡煕韫囨枂顏勫祫闂佸壊鍋侀崕鏌ユ偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷? by changhao
				if (c2 == null)
				{
					String srcname = xtable.Properties.selectRolename(roleid);
					String targetname = xtable.Properties.selectRolename(targetid);
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠撻柣鏍с偢瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷(ID = " + roleid + ") " + srcname + " 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠撻柣鏍с偢瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷(ID = " + targetid + ") " + targetname + " 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倝绠栭弻宥夊传閸曨剙娅ｇ紓浣瑰姈椤ㄥ棙绌辨繝鍥ч柛娑卞枛濞呫倝姊虹粙娆惧剰妞わ妇鏁诲濠氬Ω閵夈垺鏂�闂佺硶鍓濋敃鈺佄涢妶澶嬧拺鐎规洖娲ㄧ敮娑欐叏婵犲偆鐓奸柡浣规崌閹稿﹥寰勫畝锟介弳娑㈡⒑缁嬪潡鍙勫ù婊冪埣閻涱喗绻濋崨顖滄澑濠电偞鍨堕懝鎹愩亹閸℃娓婚柕鍫濇缁楁帡鎮楀鐓庡籍闁诡喒锟芥枼鏋庨柟鐐綑閿熻棄鐏氱换娑㈠箣閻愬灚鍠涘┑鈽嗗亖閸斿秹濡甸崟顔剧杸闁圭偓鍓氭禒閬嶆⒑閻氬瓨瀚归梺鎸庢礀閸婂綊鎮￠妷鈺傜厽闁哄洨鍋涢敓钘夋贡閿熻姤鐔幏锟�");

					return false;
				}
				
				if (!c1.equals(c2)) //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕妞ゎ偄顦遍敓浠嬫涧閵堢顕ｉ崼鏇炵闁绘ê鐏氬В搴㈢節閻㈤潧浠﹂柟绋款煼閹垽顢楅崟顐ゎ唵婵＄偛顑呴崙浠嬪箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︻參姊虹粙璺ㄧ閽冨崬菐閸パ嶈含妤犵偞鐗楅幏鍛存嚃濠靛嫬濮傞柡灞诲姂瀵挳顢旈崨顓т紦闂傚倷娴囧▔鏇㈠窗閺囩倣娑㈠礋椤愩倖娈惧銈嗗笒鐎氼剟鎮￠垾鎰佺唵闁兼悂娼ф慨鍫ユ煛閸涱喗鍊愰柡灞诲姂閹倝宕掑☉姗嗕紦?闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷鐓庮熆濠靛牊鍤�妞ゎ偅绻勯幑鍕惞鐠団剝袧濠电姷鏁搁崑鐐哄垂閸撲礁鏋堢�广儱顧�缂嶆牠鏌￠崶鈺�绱崇憸鐗堝笒缁�鍌炴煕韫囨艾浜圭紒瀣川缁辨挻鎷呴崫鍕碉拷鎾剁磼閺屻儳鐣烘鐐茬墦婵℃悂濡锋惔銏♀拻闁跨喐鏋荤紞鍡涘磻閸曨垼鏁傞柛顐ｆ礃閳锋帒銆掑鐐濠电偠澹堝畷鐢垫閻愬搫鐐婃い鎺炴嫹缂佺媭鍨堕弻銊╂偆閸屾稑顏� by changhao
				{
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠撻柣鏍с偢瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷(ID = " + roleid + ")闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愬弶鐤勯梻浣虹帛閸旓箓宕滃☉銏♀挃闁告洦鍨遍悡娑㈡煕閹扳晛濡奸柨鐔绘椤嘲鐣烽垾鎰佹僵闁煎摜鏁搁崢鐢电磽閸屾瑩妾烽柛銊ョ秺瀵鈽夊杈╋紲闂佽法鍠嶇划娆忕暦閹烘垟妲堥柡宥忓閻╁酣姊绘担渚敯闁规椿浜炲濠囧礈瑜庨崗婊堟煕閹捐尪鍏岀痪鎯с偢閺岀喖骞忕仦鐣屽帿闁诲孩鐔幏锟�");
					return false;
				}
				
				xbean.EClanFightStatistics statistics1 = xtable.Roleid2clanfightstatistics.select(roleid);
				if (statistics1 == null)
				{
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠撻柣鏍с偢瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷(ID = " + roleid + ")婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ煏閸℃ê绗掓い顐ｇ箞閹瑩顢楅敓浠嬵敂閸洘鐓熼幖娣焺閸熷繘鏌涢敐搴℃珝鐎规洘鍨剁换婵嬪炊瑜忛悾娲偡濠婂嫭鐓ラ柣锝囧厴閹剝鎯斿Ο缁樻澑闂備礁澹婇崑鍛矙閹寸偟顩查柣妤�鐗忕弧锟介梺姹囧灲濞佳囧礈瀹曞洨纾奸柤鑹板煐椤ュ鎮￠妶澶嬬厽婵☆垱顑欓崵娆戠磼閿熶粙宕奸悢铏圭槇闂傚倸鐗婄粙鎺楀箹閹邦厹浜滈柡鍥舵線閹查箖鏌＄仦璇插闁诡喓鍊濆畷鎺戔槈濮楀棔绱�");
					return false;
				}
				
				xbean.EClanFightStatistics statistics2 = xtable.Roleid2clanfightstatistics.select(targetid);
				if (statistics2 == null)
				{
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠撻柣鏍с偢瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷(ID = " + targetid + ")闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倝绠栭弻宥夊传閸曨剙娅ｇ紓浣瑰姈椤ㄥ棙绌辨繝鍥ч柛娑卞枛濞呫倝姊虹粙娆惧剰妞わ妇鏁诲濠氬Ω閵夈垺鏂�闂佺硶鍓濋敋婵炲懏绻堝娲传閸曨厾鍔圭紓浣哄У閹瑰洤顕ｇ拠宸悑濠㈣泛锕﹂崢鍛婄箾鏉堝墽鍒伴柟娴嬶拷鏂ユ灁闁肩⒈鍓涚壕钘壝归敐鍛儓閺嶏繝鏌ｉ姀鈺佺伈缂佺粯绻傞锝嗙節濮橆剛鍔撮梺鍛婂姀閺呮盯顢撻幘缁樷拺闁告稑锕︾粻鎾绘倵濮樺崬鍘寸�殿喗濞婇、姗�濮�閳ョ鎷烽悽鍛婂仭婵炲棗绻愰顏堟倶韫囷絽浜伴柡宀嬬秮楠炴帡鎮欏顔藉枠缂傚倷绶￠崰妤�鐣濋幖浣歌摕闁糕剝顨忛崥瀣煕濞戝崬鐏犲┑顔肩埣濮婄粯鎷呴崨濠傛殘闂佸憡鎼╅崜鐔风暦閵娾晩鏁嶉柨婵嗘煀閿燂拷");
					return false;
				}
				
				if (cur < statistics2.getLastlosestamp() + 10 * 1000)
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 410062, null);
					return false;
				}
				
				if (statistics2.getAct() <= 0)
				{
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠撻柣鏍с偢瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷(ID = " + roleid + ")闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倝绠栭弻宥夊传閸曨剙娅ｇ紓浣瑰姈椤ㄥ棙绌辨繝鍥ч柛娑卞枛濞呫倝姊虹粙娆惧剰妞わ妇鏁诲濠氬Ω閵夈垺鏂�闂佺硶鍓濋敋婵炲懏绻堝娲传閸曨厾鍔圭紓浣哄У閹瑰洤顕ｇ拠宸悑濠㈣泛锕﹂崢鍛婄箾鏉堝墽鍒伴柟娴嬶拷鏂ユ灁闁肩⒈鍓涚壕钘壝归敐鍛儓閺嶏繝鏌ｉ姀鈺佺伈缂佺粯绻堥悰顕�宕橀鍛／闁荤偞绋堥崜婵嬶綖瀹ュ應鏀介柍钘夋閻忕娀鏌ｈ箛鏃傜疄妞ゃ垺妫冮、姗�鎮㈤搹鍦婵犵數鍋涢悧鍡涙倶濠靛鍑犻柟鍓х帛閻撴盯鏌涘☉鍗炵仩鐎涙繈姊烘导娆戞偧闁稿繑锕㈠顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷? ");
					return false;
				}
				
				if (statistics1.getAct() < fire.pb.activity.clanfight.ActivityClanFightManager.ATTACK_SUB_ACT)
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 410056, null);
					return false;
				}
				
				int which1 = -1;
				int which2 = -1;
				fire.pb.clan.fight.ClanFightBattleField bf1 = fire.pb.clan.fight.ClanFightFactory.getClanFightBattleField(c1, true);
				if (bf1 == null)
				{
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠撻柣鏍с偢瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷(ID = " + roleid + ")闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛瀣ㄥ�濋弻鏇熺箾閻愵剚鐝曢梺鍝勬媼娴滄繄鎹㈠┑瀣仺闂傚牊渚楀姘舵倵楠炲灝鍔氭俊顐ｎ殜椤㈡棃鎳滈悽鐢电槇闂佹眹鍨藉褎绂掗敃鍌涚厱闁靛鍎抽崺锝嗩殽閻愭潙濮嶇�规洦鍋婃俊鐤槾闁绘挸顑夊娲捶椤撯剝顎楅梺鍝ュУ椤ㄥ﹤鐣烽幋锕�围濠㈣泛顑囬崢顏呯節閻㈤潧浠ч柛瀣尭閳诲秹宕ㄧ�涙鍘甸梺璋庡啯鍟為悗姘炬嫹?");
					return false;
				}
				
				which1 = bf1.getSideByRoleId(roleid);
				
				fire.pb.clan.fight.ClanFightBattleField bf2 = fire.pb.clan.fight.ClanFightFactory.getClanFightBattleField(c2, true);
				if (bf2 == null)
				{
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠撻柣鏍с偢瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷(ID = " + roleid + ")闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛瀣ㄥ�濋弻鏇熺箾閻愵剚鐝曢梺鍝勬媼娴滄繄鎹㈠┑瀣仺闂傚牊渚楀姘舵倵楠炲灝鍔氭俊顐ｎ殜椤㈡棃鎳滈悽鐢电槇闂佹眹鍨藉褎绂掗敃鍌涚厱闁靛鍎抽崺锝嗩殽閻愭潙濮嶇�规洦鍋婃俊鐤槾闁绘挸顑夊娲捶椤撯剝顎楅梺鍝ュУ椤ㄥ﹤鐣烽幋锕�围濠㈣泛顑囬崢顏呯節閻㈤潧浠ч柛瀣尭閳诲秹宕ㄧ�涙鍘甸梺璋庡啯鍟為悗姘炬嫹?");
					return false;
				}
				
				which2 = bf2.getSideByRoleId(targetid);
				
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔戒氦闂傚倷绀侀幉锟犳偡閵夆晜鏅濋柕澶嗘櫅妗呴梺鍛婃处閸ㄤ即宕橀敓浠嬫⒑闂堟丹娑氫沪閻愵剦鍟囬梻鍌氬�烽懗鍫曗�﹂崼鐕佹闁归棿鐒﹂弲婵囥亜韫囨挾澧曢柦鍐枛閺屻劑鎮㈤崫鍕戙垻绱掗敓鐣岋拷锝庡枟閳锋帡鏌涢銈呮灁闁靛棙甯掗湁闁绘﹩鍋呭▍鍛亜椤忓嫬鏆ｅ┑鈥崇埣瀹曞崬螣娓氼垱袩闂傚倷绀侀幗婊勬叏闂堟侗娼╅柕濞炬櫅缁�鍡涙煙閻戞﹩娈曢柡鍛倐閺屻劑鎮ら崒娑橆伓? by changhao
				if (!(which1 == 0 && which2 == 1) && !(which1 == 1 && which2 == 0))
				{
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠撻柣鏍с偢瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷(ID = " + roleid + ")闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倝绠栭弻宥夊传閸曨剙娅ｇ紓浣瑰姈椤ㄥ棙绌辨繝鍥ч柛娑卞枛濞呫倝姊虹粙娆惧剰妞わ妇鏁诲濠氬Ω閵夈垺鏂�闂佺硶妾ч弲婊勬櫏闂傚倷鐒︽繛濠囧绩闁秴绠伴柟闂寸劍缁犳帡姊绘担鐟邦嚋缂佽鍊块獮濠冩償閵娿儲杈堥梺缁樺姉閸庛倝鎮￠弴銏犵缂侇喛顫夐～濠冧繆閸欏鍊愰柡灞界Ч閹稿﹥寰勫Ο鐑╂瀰婵°倗濮烽崑鐐烘晪闂佷紮绲块崗妯虹暦閸洖骞㈤柟閭﹀墰娴犻箖姊洪棃娑欐悙閻庢碍婢橀锝夊箻椤曞懏鏅滈梺鍛婁緱閸欏孩瀵奸敓锟�");
					return false;
				}
				
				if (bf1.getClanfightBean().getState() == xbean.ClanFightBattleField.STATE_CLAN_FIGHT_OVER)
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 410055, null);
					return false;
				}
				
				if (cur > bf1.getClanfightBean().getActivitystarttime() && cur < bf1.getClanfightBean().getActivitypreparetime())
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 410052, null);
					return false;
				}
				
				if (cur < bf1.getClanfightBean().getActivitypreparetime() || cur > bf1.getClanfightBean().getActivityendtime())
				{
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠撻柣鏍с偢瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷(ID = " + roleid + ")濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚埄鍐ㄧ窞閻庯綆浜為崢鎰版⒑閸忓吋绶叉繛纭风節瀵鏁愰崨顏呯�婚梺鐟邦嚟婵厽瀵奸弽顓熲拻闁稿本鑹鹃敓浠嬵棑缁牊绗熼敓浠嬬嵁閺嶎収鏁冮柨鏇嫹闁汇値鍠楅妵鍕箛閸洘顎嶉梺绋款儏椤︾敻寮婚敐澶婄闁告劕妯婇崬顐⑩攽閻愭潙鐏熼柛銊ョ秺閺屻劑濡堕崱鏇犵畾闂侀潧鐗嗙换鎴狅拷姘贡缁辨挻绗熸繝鍐伓闂備浇娉曢崳锕傚箯閿燂拷?");
					return false;
				}
				
				long attackerclanid = 0;
				long hitclanid = 0;
				if (which1 == 0)
				{
					attackerclanid = bf1.getClanfightBean().getClanid1();
					hitclanid = bf1.getClanfightBean().getClanid2();
				}
				else
				{
					attackerclanid = bf1.getClanfightBean().getClanid2();
					hitclanid = bf1.getClanfightBean().getClanid1();
				}
				
				fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(targetid);
				if (team != null)
				{
					if (team.isNormalMember(targetid)) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告噧妞ゆ洩绲介悾锟犳焽閿旇棄鐦滈梻渚�娼ч悧鍡椢涘☉娆愭珷妞ゆ帪鎷烽柕鍡樺笒椤繈顢樿閻や線鎮楃憴鍕缂佽鐗撳顐﹀箻鐎靛壊娴勯柣搴秵閸嬪棝宕㈡禒瀣拺闂傚牊绋撶粻姘舵煛閸涱喚娲撮柟顔斤耿閺佹捇鎮╁畷鍥у箥婵＄偑鍊栧濠氬储瑜旈弫鎾绘偩瀹�濠勫姼閻庤鎸哥�氭澘顫忓ú顏勭閹兼番鍨婚ˇ銉╂⒑缁嬪尅鍔熸い顓炵墦椤㈡瑨绠涘☉娆愭闂佽法鍣﹂幏锟�? by changhao
					{
						targetid = team.getTeamLeaderId();
					}
				}
				
				if (xtable.Watcherid2battleid.select(targetid) != null)
				{
					new fire.pb.battle.watch.PEndWatchBattle(targetid).call();				
				}
								
				ClanFightEndHandler handler = new ClanFightEndHandler(c1, roleid, targetid, attackerclanid, hitclanid);
				fire.pb.battle.PNewBattle p = new fire.pb.battle.PNewBattle(roleid, targetid, fire.pb.battle.BattleType.BATTLE_CLAN_FIGHT, handler);
				p.call();
				
				return true;
			}
		};
		
		startclanfightbattle.submit();	
	}
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808534;

	public int getType() {
		return 808534;
	}

	public long targetid; // 目标id by changhao

	public CStartClanFightBattle() {
	}

	public CStartClanFightBattle(long _targetid_) {
		this.targetid = _targetid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(targetid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		targetid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CStartClanFightBattle) {
			CStartClanFightBattle _o_ = (CStartClanFightBattle)_o1_;
			if (targetid != _o_.targetid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)targetid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(targetid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CStartClanFightBattle _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(targetid - _o_.targetid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

