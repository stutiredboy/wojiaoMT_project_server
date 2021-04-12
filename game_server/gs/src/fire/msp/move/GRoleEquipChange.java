package fire.msp.move;

import java.util.HashSet;
import java.util.Set;

import fire.pb.item.EquipItemType;
import fire.pb.move.SRoleComponentsChange;
import fire.pb.move.SpriteComponents;
import fire.pb.scene.manager.SceneTeamManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GRoleEquipChange__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GRoleEquipChange extends __GRoleEquipChange__ {
	@Override
	protected void process() {
		// protocol handle
		final byte changetype = getType(pos);
		if (changetype == 0 && ride == -1) // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欌敍缂傚倸绉甸悧鐘诲箖濡ゅ懏鏅查幖绮瑰墲閻忓牏绱撴笟濠冨闁诲函缍嗛崑浣圭濠婂牊鐓欓柟浣冩珪濞呭懘鏌ｉ幒鏂垮妺缂佺粯鐩畷妤呮偂鎼粹剝鎳欐繝娈垮枛閿曪妇鍒掗鐐茬闁告稑鐡ㄩ幆鐐烘煟閻旂顥嬫い鎰亹缁辨捇宕掑▎鎴М濡炪倖鍨靛Λ婵嬬嵁閹达箑鐐婄憸蹇涘汲閿曞倹鐓欓悗娑欘焽婵″洦淇婇幓鎺斿ⅵ闁哄本娲濈粻娑㈠即閻愭劑鍎甸弻娑樜熼悡搴″缂備胶绮粙鎾绘晸閻ｅ本鏆╂い顓炵墕閻☆厽淇婇悙顏勶拷鏍垂閻㈢绠犳慨妤嬫嫹妤犵偛鍟撮幃娆戞啑娴ｈ銇濇い銏℃瀹曘劑顢涘顒傜杽闂傚倸鍊烽懗鍫曘�佹繝鍥ф槬闁搞儺鍓欑粈澶岋拷骞垮劚閹冲寮稿澶嬬厱闁靛鍠栨晶顖炴煟閹捐泛鏋涢柡灞诲妼閳规垿宕卞鍡橆棧闂備礁纾划顖毭哄锟介獮鍫ュΩ閿斿墽鐦堥梺鍛婂姀閺傚倹绂掗姀銈嗗�甸悷娆忓绾炬悂鏌涢弬璺ㄐら柟骞垮灩閳规垹锟斤綆浜為ˇ鏉款渻閵堝棗閲滈柟鐑芥敱缁绘盯宕ㄩ鍛杹濠殿喖锕︾划顖炲箯閸涘瓨鍋￠梺顓ㄧ畱濞堟繈鏌ｆ惔锝嗩仧闁归鍏橀弻鐔兼⒒鐎靛壊妲紓浣哄У閻楁绌辨繝鍥ч柛娑卞幗濞堫參姊洪崫鍕靛剰闁绘妫濋垾锔炬崉閵婏箑纾繛鎾村嚬閸ㄤ即宕滈弶娆炬富闁靛牆鎳橀悰婊堟煙閸戙倖瀚� by changhao
			return;
		Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		if (role == null)
			return;
		if (null == role.getScene())
			return;

		if (changetype != 0) // 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽濡搁埡鍌氬壒闂佺硶鍓濋妵婊堟晸閼恒儱绗掓い顐ｇ箞閹瑩顢楅敓浠嬵敂閼稿吀绻嗛柕鍫濇搐鍟搁梺绋款儐閻╊垶寮崘顔嘉ㄩ柍杞拌兌閻ｉ箖姊洪崫鍕殭闁绘妫欓崕顐︽⒑鐠囨彃鍤辩紓宥呮缁傚秴鈹戠�ｎ亞鐛ュ┑鈽嗗灡閻绂嶅鍫熺厪闊洤锕ラ～濠冪箾閸喓鐭岄柨鐔凤拷鐕佹綈婵炲弶绮撳畷浼村冀椤撴粣鎷锋笟锟藉鎾閻樻爠鍥ㄧ厱闁靛鍨甸崯浼存偩閸楃偐鏀介柣妯虹仛閺嗏晛鈹戦鎯у幋闁靛棗鍊块幐濠冪珶閳哄绉�规洏鍔戝鍫曞箣濠靛牞鎷烽鐔虹闁哄鍨甸幃鎴炵箾閸忚偐鎳呯紒顔垮吹閹叉挳宕熼埡锟界花濠氭⒑鐟欏嫬顎滄繛澶嬬洴閹礁顭ㄩ崼鐔哄幐婵炶揪绲芥竟濠囧磿閺冨牊鐓涢悘鐐额嚙婵倿鏌熼鍝勶拷婵嗙暦閹烘垟妲堟慨妤�妫旂槐锟� by changhao
		{
			role.components.put(changetype, itemid);
			if (changetype == SpriteComponents.SPRITE_WEAPON) {
				if (itemid != 0)
					role.components.put((byte) SpriteComponents.SPRITE_WEAPONCOLOR,	itemcolor);
				else
					role.components.remove((byte) SpriteComponents.SPRITE_WEAPONCOLOR);
			}
			// 闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繝闈涙川缁★拷闂佺鏈划宀劼烽敓浠嬫⒒娴ｄ警鐒炬い鎴炲灩閹广垹鈹戠�ｎ亣鎽曢悗骞垮劚椤︻垱瀵奸悩缁樼厱闁哄洢鍔屾晶顔界箾閸滃啰绉慨濠傤煼瀹曟帒顫濋璺ㄦ晼闂備焦鎮堕崝宀勬偉閻撳寒鍤曞┑鐘崇閺呮彃顭跨捄鐚村姛妞ゆ挻妞藉娲箰鎼达絿鐣甸梺鐟板级閻╊垶鐛Ο鑲╃＜婵☆垳鍘ч獮鍫ユ⒑鐠囨彃鍤辩紓宥呮缁傚秹宕奸弴鐐碉紵闂佸搫鍟悧濠囨偂濞嗘劑浜滈柡鍐ㄥ�哥敮鑸典繆閹绘帩鐓奸柡灞界Ф閹风娀宕ｆ径濠冩暘缂傚倷鑳舵慨鐢告儎椤栫偟宓佹繛鍡樻尭缁�鍐喐韫囨洖顥氬┑鐘崇閳锋帡鏌涚仦鍓ф噮妞わ讣绠撻弻鐔哄枈閸楃偘绨婚柧鑽ゅ仦缁绘盯宕卞Δ鍐┛濠电偛妯婃禍婊堝礃閿熻棄顪冮妶鍡樺鞍闁告劕顭烽獮蹇涙倻閼恒儲娅嗛梺缁樺姦閸撴瑧澹曢鐐粹拺闂傚牊渚楅悡顓犵磼閻樺啿鐏╁瑙勬礋椤㈡盯鎮欑划瑙勫闂備礁鎲＄粙鎴︽晝閿斿墽涓嶉柟鍓х帛閸婂灚鎱ㄥΟ鍨厫闁轰線浜堕幃妤呮濞戞牕浠梺杞扮劍閹歌崵绮嬮幒鏃撴嫹閿濆骸浜愰柟椋庣帛缁绘稒娼忛崜褎鍋ч梺鐑╁墲濡啫鐣烽悽绋跨妞ゆ梻鏅崢閬嶆⒑缂佹◤顏嗗椤撶喐娅犻柣銏犳啞閻撴稑霉閿濆浂鐒鹃柡鍡到閳规垿鏁嶉崟顒傚姽濡炪倧闄勯幐鎶藉蓟閿濆鏁囬柣鏃傚劋閸ｄ即姊洪崫鍕潶闁告梹鍨块獮鍐Χ婢跺﹦锛滃┑鐐村灦閿曗晜瀵奸敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂濠氭偄閸忓皷鎷婚柣搴＄仛閻℃洜绮ｅΔ鍛拺閺夌偞澹嗛ˇ锕傛倵濮橆偄宓嗙�殿喛顕ч埥澶愬閻橀潧濮堕梻浣告啞閸旀宕戦幘娲绘晣闁荤喐澹嬮弨浠嬫煟閹邦剛鎽犻悘蹇ｅ幗閵囧嫰顢橀悩鎻掑箣閻庢鍠涢褔鍩ユ径濠庢僵妞ゆ劧绲芥刊浼存⒒娴ｅ憡鍟為柟绋挎瀹曘劑顢涘顒傜懆闂傚倸鍊搁崐椋庣矆娓氾拷楠炴顭ㄩ崼婵嬫７闂佹寧娲栭崐鍝ョ不椤栫偞鐓ラ柣鏇炲�圭�氾拷?2
			if (changetype == SpriteComponents.ROLE_COLOR1) {
				xbean.Properties prop = xtable.Properties.select(roleid);
				role.components.put((byte) SpriteComponents.ROLE_COLOR2,
						prop.getRolecolor2());
			}
		}

		if (ride != -1) // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欌敍缂傚倸绉甸悧鐘诲箖濡ゅ懏鏅查幖绮瑰墲閻忓牏绱撴笟濠冨闁诲函缍嗛崑浣圭濠婂牊鐓欓柟浣冩珪濞呭懘鏌ｉ幒鏂垮妺缂佺粯鐩畷妤呮偂鎼粹剝鎳欐繝娈垮枛閿曪妇鍒掗鐐茬闁告稑鐡ㄩ幆鐐烘煟閻旂顥嬫い鎰亹缁辨捇宕掑▎鎴М濡炪倖鍨靛Λ婵嬬嵁閹达箑鐐婄憸蹇涘汲閿曞倹鐓欓弶鍫濆⒔閻ｉ亶宕堕幘顔解拺闁告稑锕ｇ欢閬嶆煕閵娿儱鑸归柍缁樻尰閵堬綁宕橀埞鐐闂備礁婀遍…鍫澝规搴ｄ笉闁瑰墽绮悡娆撴煕濞嗗浚妾ч柤鏉挎健閺岀喖顢欓崫鍕紙闂佽鍠掗崜婵嬪箚閺傚簱鏀介柛顐犲灩閿熺晫鍋ゅ濠氬磼濞嗘埈妲梺瑙勭ゴ閿熷�熺М濞差亝鍋勫┑鍌氼槺閸旂兘鎮峰鍐ч柛鈹垮灲楠炴绱掑Ο缁橆仧闂備浇娉曢崳锕傚箯閿燂拷 by changhao
		{
			role.components.put((byte) SpriteComponents.SPRITE_HORSEDRESS, ride);
		}
		
		if (effect != -1) {
			role.components.put((byte)SpriteComponents.SPRITE_EQUIP_EFFECT, effect);
		}

		role.marshal();
		if (role.checkVisible()) {
			SRoleComponentsChange send = new SRoleComponentsChange();
			send.roleid = roleid;

			if (changetype != 0) {
				send.components.put(changetype, itemid);
				if (changetype == SpriteComponents.SPRITE_WEAPON) {
					if (itemid != 0)
						send.components.put((byte) SpriteComponents.SPRITE_WEAPONCOLOR,	itemcolor);
					else
						send.components.put((byte) SpriteComponents.SPRITE_WEAPONCOLOR, 0);
				}
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繝闈涙川缁★拷闂佺鏈划宀劼烽敓浠嬫⒒娴ｄ警鐒炬い鎴炲灩閹广垹鈹戠�ｎ亣鎽曢悗骞垮劚椤︻垱瀵奸悩缁樼厱闁哄洢鍔屾晶顔界箾閸滃啰绉慨濠傤煼瀹曟帒顫濋璺ㄦ晼闂備焦鎮堕崝宀勬偉閻撳寒鍤曞┑鐘崇閺呮彃顭跨捄鐚村姛妞ゆ挻妞藉娲箰鎼达絿鐣甸梺鐟板级閻╊垶鐛Ο鑲╃＜婵☆垳鍘ч獮鍫ユ⒑鐠囨彃鍤辩紓宥呮缁傚秹宕奸弴鐐碉紵闂佸搫鍟悧濠囨偂濞嗘劑浜滈柡鍐ㄥ�哥敮鑸典繆閹绘帩鐓奸柡灞界Ф閹风娀宕ｆ径濠冩暘缂傚倷鑳舵慨鐢告儎椤栫偟宓佹繛鍡樻尭缁�鍐喐韫囨洖顥氬┑鐘崇閳锋帡鏌涚仦鍓ф噮妞わ讣绠撻弻鐔哄枈閸楃偘绨婚柧鑽ゅ仦缁绘盯宕卞Δ鍐┛濠电偛妯婃禍婊堝礃閿熻棄顪冮妶鍡樺鞍闁告劕顭烽獮蹇涙倻閼恒儲娅嗛梺缁樺姦閸撴瑧澹曢鐐粹拺闂傚牊渚楅悡顓犵磼閻樺啿鐏╁瑙勬礋椤㈡盯鎮欑划瑙勫闂備礁鎲＄粙鎴︽晝閿斿墽涓嶉柟鍓х帛閸婂灚鎱ㄥΟ鍨厫闁轰線浜堕幃妤呮濞戞牕浠梺杞扮劍閹歌崵绮嬮幒鏃撴嫹閿濆骸浜愰柟椋庣帛缁绘稒娼忛崜褎鍋ч梺鐑╁墲濡啫鐣烽悽绋跨妞ゆ梻鏅崢閬嶆⒑缂佹◤顏嗗椤撶喐娅犻柣銏犳啞閻撴稑霉閿濆浂鐒鹃柡鍡到閳规垿鏁嶉崟顒傚姽濡炪倧闄勯幐鎶藉蓟閿濆鏁囬柣鏃傚劋閸ｄ即姊洪崫鍕潶闁告梹鍨块獮鍐Χ婢跺﹦锛滃┑鐐村灦閿曗晜瀵奸敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂濠氭偄閸忓皷鎷婚柣搴＄仛閻℃洜绮ｅΔ鍛拺閺夌偞澹嗛ˇ锕傛倵濮橆偄宓嗙�殿喛顕ч埥澶愬閻橀潧濮堕梻浣告啞閸旀宕戦幘娲绘晣闁荤喐澹嬮弨浠嬫煟閹邦剛鎽犻悘蹇ｅ幗閵囧嫰顢橀悩鎻掑箣閻庢鍠涢褔鍩ユ径濠庢僵妞ゆ劧绲芥刊浼存⒒娴ｅ憡鍟為柟绋挎瀹曘劑顢涘顒傜懆闂傚倸鍊搁崐椋庣矆娓氾拷楠炴顭ㄩ崼婵嬫７闂佹寧娲栭崐鍝ョ不椤栫偞鐓ラ柣鏇炲�圭�氾拷?2
				if (changetype == SpriteComponents.ROLE_COLOR1) {
					xbean.Properties prop = xtable.Properties.select(roleid);
					send.components.put((byte) SpriteComponents.ROLE_COLOR2, prop.getRolecolor2());
				}
				if (effect != -1) {
					send.components.put((byte)SpriteComponents.SPRITE_EQUIP_EFFECT, effect);
				}
			}

			if (ride != -1) {
				send.components.put((byte) SpriteComponents.SPRITE_HORSEDRESS, ride);
			}
			send.spritetype = 0;
			role.sendAround(send);
			// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垹顭峰缁樻媴閻熼偊鍤嬪┑鐐插级閻楃姴鐣烽幇鏉跨濞达絿顭堥悗顓㈡⒑缁嬭法鐏遍柛瀣仱閹繝濡烽埡鍌滃幗闂佸搫娲ㄩ崑娑㈡晸閽樺璐￠柨鐔诲Г閻旑剟骞忛敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫ょ紓渚婃嫹濠电姴娲﹂悡銉╂煟閺冨浂鍤欑悮姘辩磽娴ｈ櫣甯涢柣鈺婂灠閻ｇ兘顢旈崼婵堫槰濡炪倕绻愰弻濠傤煥閸啿鎷虹紒缁㈠幖閹冲繘鎮甸鍡欑＜妞ゆ棁濮ょ亸顓㈡煟閿濆鏁辩紒铏规櫕缁瑩宕归鑲┿偖闂傚倷鑳剁划顖炲蓟閵娿儺鍤曢柛鎾茬筏閹峰嘲顫濋銈囩厯濠殿喖锕︾划顖炲箯閸涙潙宸濆┑鐘插�瑰▓姗�姊绘担鍛婂暈婵☆偅鍨垮浠嬪礋椤撶姷鐒块悗骞垮劚閹峰鎮￠妷鈺傜厱妞ゆ劧绲跨粻鎾绘煕閵堝棗鐏撮柡宀�鍠栧畷妤呮嚃閳哄倹顔冮梻浣告啞閺屻劎绮旇ぐ鎺戠畺闁炽儲鏋奸弸搴ㄦ煙閻愵剚缍戝ù鐙�鍨跺娲箹閻愭彃濮庡┑鐐茬湴閸婃鏁撻懞銉ュ毈闁告挾鍠栭妴渚�寮崼鐔告闂佽法鍣﹂幏锟�,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垹绠婚悗闈涙啞閸ｄ即姊虹拠鈥虫珝婵炰匠鍡欎航闂備胶鍘ч～鏇㈠磹濡ゅ懏鍎婇柛顐犲劜閳锋垿姊婚崼鐔烘创闁绘稒绮庣槐鎺楀箵閹烘垟鎸冨┑鐐村灥閻忔岸濡堕敐澶婄闁冲搫鍟獮鎰版⒒娴ｇ顥忛柛瀣浮瀹曟垿宕熼浣圭彿闂佸湱铏庨崰妤呮偂濞嗘劑浜滈柡鍥朵簼鐎氬湱绱撴担鍝勑ｉ柣妤冨Т椤曪絾绻濆顒�鑰垮┑掳鍊曢敃銈夊箖閹达附鈷戠紒顖涙礀婢ф煡鏌曢崶鈺佷槐鐎规洜濞�瀵粙顢橀悢鍙夊濠电偠鎻紞锟藉┑顔哄�楀☉鐢稿醇閺囩喓鍘遍梺鎸庣箓缁绘帡鎮鹃崹顐闁绘劘灏欑粻濠氭煛娴ｈ宕岄柡浣规崌閺佹捇鏁撻敓锟�?
			fire.pb.scene.movable.SceneTeam team = SceneTeamManager.getInstance().getTeamByID(roleid);
			if (team == null) {
				gnet.link.Onlines.getInstance().send(roleid, send);
				return;
			}
			Set<Long> roleids = new HashSet<Long>();
			for (Role member : team.getMembers()) {
				roleids.add(member.getRoleID());
			}
			
			if (!roleids.isEmpty())
				gnet.link.Onlines.getInstance().send(roleids, send);
		}
	}

	/**
	 * WEAPON		= 0; //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ姀鐘差棌闁轰礁锕弻鈥愁吋鎼粹�崇缂備焦鍔栭〃鍡樼┍婵犲洤围闁告侗鍘藉▓鏌ユ倵鐟欏嫭绀冮柣鎿勭節瀵鎮㈤崗鑲╁姺闂佹寧娲╅幏鐑芥煛鐎ｃ劌锟芥洟鍩ユ径鎰鐎规洖娉﹁閺屸�崇暆閿熶粙宕伴幘缁樻櫢闁兼亽鍎抽埦浣广亜椤撶偞澶勫ǎ鍥э躬瀹曞爼顢楁担鍝勫箰闂佽鍑界紞鍡樼閻愬瓨娅忛梻鍌欑閹碱偆鎮锕�绀夐柟杈剧畱缁犳牠鏌曢崼婵愭Ц缁炬儳鍚嬬换娑㈠箣閻戝洣绶垫繛瀵搞�嬮幏锟�
		ACCESSORY	= 2; //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柟缁㈠枟閸庡顭块懜闈涘缂佺嫏鍥ㄧ厱闁哄秲鍊曟晶鏌ユ倵濮橆剛绉洪柡灞革拷鎰佸悑閹肩补锟藉磭顔夐梻浣芥硶閸犳洖螞閸曨垰鐤柡澶嬪灩閺嗭箓鏌涘Δ鍐拷锝夊籍閿熺晫鎹㈠┑瀣妞ゆ劧绲惧В鍕節閻㈤潧校妞ゆ梹鐗犲畷鏉课旈崨顐嫹閸愵喖绠涢柡澶庢硶椤斿棝姊绘担鍝ヤ虎妞ゆ垶鍔曢埢鎾寸鐎ｎ偆鍘介梺褰掑亰閸擄箓宕甸悢濂夌唵鐟滃繘寮繝姘摕闁斥晛鍟刊鎾偡濞嗗繐顏╃痪鐐▕濮婄儤娼幍顔煎闂佸湱鎳撳ú顓烆嚕椤愶箑绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹
		ARMOR 		= 3; //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡欏⒈婵炲吋鍔栫换娑㈠川椤栨埃鏋呴梺鍝勮閸婃繈鐛笟锟介獮鎺楀箣濠靛棭娼ラ梻鍌欑閹诧繝鎮烽妷褎宕叉慨妤嬫嫹鐎殿喖顭烽弫鎰緞婵犲嫷鍚呴梻浣瑰缁诲倸螞椤撶倣娑㈠礋椤栨稈鎷洪梺鍛婄箓鐎氱兘宕曟惔锝囩＜闁兼悂娼ч崫铏癸拷娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�
		BELT 		= 4; //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟閹间礁绫嶉柛顐ｇ箘閻ｅ搫鈹戦埥鍡楃仧閻狅拷閿曪拷椤洭鍩￠崒妯圭盎闂佸湱鍎ら崺鍫澪ｅú顏呯厱闁绘劗鍎ゅ☉褔鏌嶇憴鍕伌妞ゃ垺鐟х划鐢碉拷锝庡亽閸氬懘姊绘担鍝ョШ妞ゃ儲鎹囧畷妤�顫滈敓钘夘嚕婵犳碍鍋勭痪鎷岄哺閺呪晠姊洪悡搴綗闁稿﹥顨婇幃锟犲箻缂佹ǚ鎷洪柡澶屽仦婢瑰棝宕濆澶嬬厵闁荤喓澧楅崰妯硷拷娈垮櫘閸嬪﹪鐛Ο鑲╃＜婵☆垳绮鐔兼⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�
		BOOT		= 5; //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庣數顭堟俊浠嬫⒑缁嬫鍎忔い鎴濇嚇閸╃偤骞嬮敂钘変汗闂佸湱绮敮濠勮姳娴犲鈷戠紓浣姑粭鈺佲攽椤斿搫锟芥骞戦姀鐘闁靛繒濮撮懓鍨攽閳藉棗鐏ユい鏇嗗洦顥夌�广儱顦伴埛鎴犵磼鐎ｎ偒鍎ラ柛搴＄Ч閺屾稒绻濋崘顏嗙杽閻庢鍠栭…閿嬩繆閹间礁鐓涢柛灞剧煯缁ㄤ粙姊绘担渚劸闁哄牜鍓涚划娆撳箣閿旂粯鏅滈梺璺ㄥ櫐閹凤拷
		HEADDRESS	= 6; //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟芥悂鍩為幋锕�纾兼繝濠傛捣閸旀悂姊洪崫鍕仴闁稿海鏁诲濠氬灳閹颁礁鎮戦柟鑲╄ˉ閿熻棄纾鎰磽閸屾瑨鍏屽┑顔藉▕瀹曪繝骞庨挊澶庢憰闂佺粯姊婚崢褏绮诲鑸电厽婵°倧鎷烽柣妤佺矊铻為柛鏇ㄥ灡閻撴洟鏌曟径娑㈡閻忓骏闄勯幈銊︾節閸涱噮浠╅梺鍦嚀鐎氱増淇婇幖浣肝ㄩ柨鏃�鍎崇紞鎺楁⒒閸屾瑨鍏岄柟铏崌瀹曠敻寮介鐐殿唵闂佽法鍣﹂幏锟�
	 * @param pos
	 * @return
	 */
	private final byte getType(final int pos) {
		switch (pos) {
		case EquipItemType.ARMS:
			return SpriteComponents.SPRITE_WEAPON;
		case EquipItemType.TIRE:
			return SpriteComponents.SPRITE_HEADDRESS;
		case EquipItemType.LORICAE:
		case EquipItemType.WAISTBAND:
		case EquipItemType.BOOT:
		case EquipItemType.ADORN:
		{
			return SpriteComponents.SPRITE_FASHION;
		}
//		case EquipItemType.EQUIP_EFFECT:
//			return SpriteComponents.SPRITE_EQUIP_EFFECT;
		case EquipItemType.ROLE_COLOR1:
			return SpriteComponents.ROLE_COLOR1;
		case EquipItemType.ROLE_COLOR2:
			return SpriteComponents.ROLE_COLOR2;
		default:
			return 0;
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 724929;

	public int getType() {
		return 724929;
	}

	public long roleid;
	public int itemid;
	public int itemcolor;
	public int pos;
	public int ride;
	public int effect;

	public GRoleEquipChange() {
	}

	public GRoleEquipChange(long _roleid_, int _itemid_, int _itemcolor_, int _pos_, int _ride_, int _effect_) {
		this.roleid = _roleid_;
		this.itemid = _itemid_;
		this.itemcolor = _itemcolor_;
		this.pos = _pos_;
		this.ride = _ride_;
		this.effect = _effect_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(itemid);
		_os_.marshal(itemcolor);
		_os_.marshal(pos);
		_os_.marshal(ride);
		_os_.marshal(effect);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		itemid = _os_.unmarshal_int();
		itemcolor = _os_.unmarshal_int();
		pos = _os_.unmarshal_int();
		ride = _os_.unmarshal_int();
		effect = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GRoleEquipChange) {
			GRoleEquipChange _o_ = (GRoleEquipChange)_o1_;
			if (roleid != _o_.roleid) return false;
			if (itemid != _o_.itemid) return false;
			if (itemcolor != _o_.itemcolor) return false;
			if (pos != _o_.pos) return false;
			if (ride != _o_.ride) return false;
			if (effect != _o_.effect) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += itemid;
		_h_ += itemcolor;
		_h_ += pos;
		_h_ += ride;
		_h_ += effect;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(itemid).append(",");
		_sb_.append(itemcolor).append(",");
		_sb_.append(pos).append(",");
		_sb_.append(ride).append(",");
		_sb_.append(effect).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GRoleEquipChange _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = itemid - _o_.itemid;
		if (0 != _c_) return _c_;
		_c_ = itemcolor - _o_.itemcolor;
		if (0 != _c_) return _c_;
		_c_ = pos - _o_.pos;
		if (0 != _c_) return _c_;
		_c_ = ride - _o_.ride;
		if (0 != _c_) return _c_;
		_c_ = effect - _o_.effect;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}
