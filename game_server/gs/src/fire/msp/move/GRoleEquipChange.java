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
		if (changetype == 0 && ride == -1) // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆屾晬缂傚倸鍊哥粔鐢告偋閻樿绠栨俊銈呮噺閺呮煡骞栫划鐟板⒉闁诲繐鐗忕槐鎾寸瑹婵犲啫顏堕梺璇插嚱缂嶅棝宕戞担鍦洸婵犲﹤鐗婇悡娆撴煙娴ｅ啯鐝繛鍛嚇閺岋綁骞掗弬鍨缂備胶绮惄顖氱暦濡ゅ懏鍋傞幖绮瑰墲閹虫瑦绻濆▓鍨灈闁挎洩濡囬崚鎺楊敍閻愯尙顔嗛梺鍛婄☉閻°劑骞嗛悙鐑樼厽闁绘梻顭堥ˉ瀣亜閹邦垰浜圭紒杈ㄦ崌瀹曟帒鈻庨幋顓熜滄俊鐐�栭崹闈浳涘┑瀣祦闁硅揪绠戦悙濠勬喐韫囨稑姹查柨鏇炲�归悡娆撴倵濞戞瑯鐒藉┑鈥虫处娣囧﹪骞撻幒鏂库叺闂佸搫鏈ú婵堢不濞戙垹鍗抽柣鎰姂閸庣敻寮诲☉妯滅喖鎮℃惔鈥愁瀱缂傚倷鑳剁划顖滅矙閹剧粯鏅搁柣锝呮湰閺嗏晜銇勯鐐靛闁烩槅鍘芥穱濠囨倷椤忓嫸鎷烽弽顓炲瀭闁汇垻顭堢粻鐘虫叏濡ゅ瀚瑰Δ鐘靛仜閸熸挳骞冨▎鎴炲晳濞达綀顫夐妵婵囥亜閵忊剝顥堢�规洏鍔戦、娑橆潩椤掑倻鏉介梻鍌氬�搁崐鐑芥嚄閸洏锟戒焦绻濋崶褎妲梺鎼炲労閸撴瑧绮堟径宀嬫嫹楠炲灝鍔氶柟鍐差樀瀵顓兼径瀣幈闂侀潧顦介崰鏍ㄦ櫠椤栫偞鐓熼柟鎹愭硾閺嬫盯鏌＄仦璇插闁宠鍨垮畷鍗烆潨閸℃﹩妫ч梻鍌欑绾绢厾鍒掗姣搫顫滈敓浠嬬嵁閸儱惟闁挎柨澧介惁鍫ユ⒑閸涘﹤濮�闁哄倸鍊圭粋鎺楀閵堝棗锟界敻鎮峰▎蹇擃仾缁剧偓鎮傞弻娑㈠棘鐠恒剱銈夋煙楠炲灝鐏╅柍瑙勫灩閿熸枻缍嗘禍鐐核囬弶娆炬富闁靛牆妫楅柌婊堟煙閻戣姤鏁辩紒缁樼洴瀹曘劑顢氶崨顔炬澒婵犳鍠栭敃锔惧垝椤栫偛绠柛娑樼摠閸嬶繝姊洪銊х暠婵炲牊绻堥弻锝嗘償閿濆棭浠ч梺褰掝棑閸忔﹢寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磽娴ｅ搫校闁绘顨嗙粚杈ㄧ節閸ヮ灛褔鏌涘☉鍗炲箺婵炲牜鍙冨娲传閸曢潧鍓伴梺缁橆殔濡繈鍨鹃敂鐐磯闁靛绠戠壕顖涚箾閹炬潙鍤柛銊ゅ嵆瀹曟粓寮跺▎鐐瘜闂侀潧鐗嗛幊姗�鎮板鍫熺厵闁告垯鍊栫�氾拷 by changhao
			return;
		Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		if (role == null)
			return;
		if (null == role.getScene())
			return;

		if (changetype != 0) // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓姗�鏌ㄩ悢缁橆棄缂佺姴绉瑰畷鏇㈠础閻忕粯妞芥俊鎼佸煛閸屾艾澹掗梻浣虹《閸撴繈濡靛鍫熸櫢闁兼亽鍎辩粭鎺撱亜椤愶絿绠為柟顔界懇椤㈡鏁撴禒瀣垫晜闁肩鍚�缁诲棝鏌曢崼婵囨悙閸熸悂姊虹粙娆惧剱闁烩晩鍨跺顐﹀礃椤斿槈銊╂煃鏉炴媽鍏岄柣锝夌畺濮婃椽宕崟顐ｆ闂佺粯顨呭Λ娆撳磿椤愶附鈷戦悹鍥ㄥ絻閸よ京绱撳鍛棡缂佸倸绉撮埞鎴狅拷锝庝簽閻涖儱鈹戦埥鍡楃仭闁活亣顫夌粋宥咁煥閸喓鍘棅顐㈡搐閿曘儵锝炴繝鍐闁割偆鍠撻惌宀勬煥閻斿嚖鎷烽悤浣圭秷濠电偛寮剁划鎾崇暦娴兼潙鍐�妞ゆ挻绮ｉ幏閿嬬瑹閿熻棄顕ｉ幘顔碱潊闁绘ɑ鐖犻崶銊у幈闂侀潧顦伴崹鐢稿疮娴煎瓨鍋╅柛妤冨亹閺�浠嬫煟濡櫣浠涢柡鍡忔櫅閳规垿顢欓幆褍骞嬮梺闈涙閸婂潡骞愭繝鍐彾闁冲搫顑囩粔顔撅拷瑙勬磸閸旀垵顕ｉ崼鏇炵婵犻潧鐗為幏鐑筋敇閻旇櫣顔曢梺鍝勵槹閸ㄧ敻骞冮幋鐐电闁稿繗鍋愰幊鍛磼椤斿灝鍚归柟鍙夋尦瀹曠喖鍩￠敓鐣岃姳婵犳碍鈷戦悷娆忓椤庢粍绻涙径瀣创闁诡垯绀侀…銊╁醇閻斿搫骞愬┑鐐舵彧缁茶姤绔熸繝鍥х？闁哄啫鐗婇悡娑㈡倶閻愰鍤欏┑顔煎�块弻鐔碱敊閸濆嫸鎷峰┑鍡欐殾闁圭儤鍨熷Σ鍫熸叏濡わ拷濡梻妲愰敓锟� by changhao
		{
			role.components.put(changetype, itemid);
			if (changetype == SpriteComponents.SPRITE_WEAPON) {
				if (itemid != 0)
					role.components.put((byte) SpriteComponents.SPRITE_WEAPONCOLOR,	itemcolor);
				else
					role.components.remove((byte) SpriteComponents.SPRITE_WEAPONCOLOR);
			}
			// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮村杈┬㈤梻浣规偠閸庢椽宕滈敃鍌氭瀬闁告劦鍠楅悡銉╂煛閸ユ湹绨奸悗姘秺濮婂搫效閸パ嶆嫹濡ゅ懎纾婚柟鎹愬煐瀹曞弶绻濋棃娑欏窛缂佲槄鎷烽梻浣侯焾閺堫剛鍒掑畝鍔肩兘鏁撴禒瀣拻濞达絼璀﹂悞鐐亜閹寸偛鐏╅柟骞垮灩閳规垹锟斤綆浜ｉ幗鏇㈡倵楠炲灝鍔氭い锔诲灡鐎靛ジ鎮╃紒妯煎幈闂佸搫娲㈤崝灞炬櫠椤旂晫绠鹃柛婊冨暟缁夘喗鎱ㄦ繝鍌ょ吋鐎规洘甯掗～婵嬵敄鐠恒劍鏅奸梻鍌欑劍閹爼宕濆畝鍕亯闁绘挸瀵掗崵鏇炩攽閻樺磭顣查柡鍛絻椤法鎹勯悮鏉戝濡炪倖鎸诲钘夘潖濞差亜绠伴幖杈剧悼閻ｇ敻姊洪悷鏉跨骇闁烩晩鍨堕悰顔嘉熼懖鈺冿紲濠碘槅鍨抽崢褔鐛崼銉︹拺閻犲洦褰冮崵杈╃磽瀹ュ懏顥炵紒鍌氱Ч瀹曞ジ寮撮悙纰夌吹闂備礁鎼崯顐︽偋婵犲洦鍋傛繛鍡樺姂娴滄粓鏌￠崘銊ワ拷鍝ユ暜閼稿吀绻嗛柟缁樺俯閻撳ジ鏌＄仦鐣屝ら柟椋庡█瀹曪絾寰勬繝鍐╂殬缂傚倸鍊烽懗鑸垫叏閻㈠憡鍎庢い鏍仧瀹撲焦绻涢崱妯诲碍缂侊拷閸愵亝鍠愰煫鍥ㄦ礀椤ユ艾鈹戦悩宕囶暡闁抽攱甯￠弻娑氫沪閸撗勫櫘濡炪倧璁ｇ粻鎾诲蓟閻斿搫鏋堥柛妤冨仒缁ㄥ鏌ч懡銈呬沪缂佺粯鐩畷鍗炍旈崘顓犫敍婵犵數鍋涘Ο濠冪濠婂牆绀冮柨鐔绘椤啴濡堕崱妯洪瀺闂佸憡鍔曢…鐑界嵁韫囨稒鍊婚柤鎭掑劜濞呭棝姊虹紒妯哄Е闁告挻鐟ф竟鏇㈩敍閻愮补鎷洪梻鍌氱墛娓氭鎮￠鐘电＜闁绘ê鍟块悘鈺侇熆鐟欏嫭绀嬫い銏＄洴閹瑧鍒掔憴鍕伖闂傚倷绀侀幉锛勭矙閹达附鏅濋柨鏂垮⒔娑撳秹鏌熼崜褏甯涢柛濠傜仛閹便劌螣閸喚鍘梺杞扮窔娴滃爼骞冨Δ鍛棃婵炴垶鐗曟禒顕�姊烘潪鎵妽闁规瓕宕电划瀣箳閺冩挻瀚归柨婵嗛娴滄劙鏌熸搴ｅ笡缂佺粯绋掑蹇涘礈瑜庨崑褔姊洪悜鈺佸⒉婵☆偄鍟悾鐑芥偨缁嬭法顦ㄥ銈嗘⒒閺咁偊宕㈤柆宥嗏拺缂備焦鈼ら鍡楊棜妞ゆ挾鍠愬▍鐘绘煟閵忕姵鍟為柣鎾寸☉闇夐柨婵嗘祩閻掗箖鏌￠崱顓犲埌闁宠鍨块弫宥夊礋椤掑倸濮芥俊鐐�ч梽鍕箰閹惰棄钃熼柨婵嗩樈閺佸洭鏌ｉ弮鍌氬妺闁革絼鍗冲娲传閸曨噮娼堕梺鍛婃⒐閸ㄥ潡鐛崘顔嘉у璺猴功閿涙粌鈹戦悙鏉戠仸闁挎洍鏅滅�靛ジ鏁撻敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹤顕ｆ繝姘亜闁稿繐鐨烽幏濠氭煟鎼达紕浠涢柣鈩冩礈缁絽螖閸涱喒鎷洪柡澶屽仦婢瑰棝藝閿曞倹鍊垫慨姗嗗亜瀹撳棛锟芥鍠涢褔鍩ユ径鎰潊闁绘﹢娼ф慨鍫曟⒒娴ｅ憡鍟為柛鏃�顨婂畷鎴﹀箻濞茬粯鏅ｉ梺鑽ゅ枑婢瑰寮ㄦ禒瀣厽闁归偊鍓涢幗鐘绘倶韫囷絽骞楅柕鍥у椤㈡﹢鎮╅幓鎺戠闁诲孩顔栭崰娑㈩敋瑜旈崺銉﹀緞婵犲孩鍍靛銈嗗姧缁茶姤鍒婃导瀛樷拻濞达絽鎲￠崯鐐烘煙缁嬫寧顥㈢�规洏鍔戦、娑橆潩椤掑倻鎳嗛梻鍌氬�搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞顨呴…銊╁醇濠靛锛楅梻浣瑰濞叉牠宕愰崫銉т笉妞ゆ牜鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?2
			if (changetype == SpriteComponents.ROLE_COLOR1) {
				xbean.Properties prop = xtable.Properties.select(roleid);
				role.components.put((byte) SpriteComponents.ROLE_COLOR2,
						prop.getRolecolor2());
			}
		}

		if (ride != -1) // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆屾晬缂傚倸鍊哥粔鐢告偋閻樿绠栨俊銈呮噺閺呮煡骞栫划鐟板⒉闁诲繐鐗忕槐鎾寸瑹婵犲啫顏堕梺璇插嚱缂嶅棝宕戞担鍦洸婵犲﹤鐗婇悡娆撴煙娴ｅ啯鐝繛鍛嚇閺岋綁骞掗弬鍨缂備胶绮惄顖氱暦濡ゅ懏鍋傞幖绮瑰墲閹虫瑦绻濆▓鍨灈闁挎洩濡囬崚鎺楊敍閻愯尙顔嗛梺鍛婄☉閻°劑骞嗛悙鐑樼厽闁绘梻顭堥ˉ瀣亜閹邦垰浜圭紒杈ㄦ崌瀹曟帒鈻庨幋顓熜滄俊鐐�栭崹闈浳涘┑瀣祦闁硅揪绠戦悙濠勬喐韫囨稑姹查柨鏇炲�归悡娆撳级閸繂鈷旈柣锝変憾瀹曞爼骞橀瑙ｆ嫼闂佸憡绋戦敃锝囨闁秵鐓曢柕濞垮劚閼稿綊鏌嶇紒妯诲鞍闁靛牞缍佸畷姗�鍩為悙顒�顏归梻鍌欑濠�閬嶁�﹂崼婢濊顦版惔锝勭瑝闂佺懓澧界划顖炴偂濞嗘挻鐓曟繛鍡楁禋濡狙囨煠閺夋寧鍋ラ柡宀�鍠栭、娆撳传閸曨厺绱欓梻浣筋嚃閸犳帡宕滃┑瀣畾闁哄倸绨遍弨浠嬫煕椤愮姴鐏╅柨鐔烘櫕閸嬨倕顫忔繝姘＜婵炲棙鍩堝Σ顕�姊虹憴鍕偞闁跨喎锟界喓袦婵炲樊浜濋崑鍕攽閸屾凹妲洪柛鏃傚厴閹嘲顭ㄩ崘顎囨煕閳瑰灝鐏叉鐐搭焽缁辨帒螣缂佹﹩浠ч梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷� by changhao
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
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮村杈┬㈤梻浣规偠閸庢椽宕滈敃鍌氭瀬闁告劦鍠楅悡銉╂煛閸ユ湹绨奸悗姘秺濮婂搫效閸パ嶆嫹濡ゅ懎纾婚柟鎹愬煐瀹曞弶绻濋棃娑欏窛缂佲槄鎷烽梻浣侯焾閺堫剛鍒掑畝鍔肩兘鏁撴禒瀣拻濞达絼璀﹂悞鐐亜閹寸偛鐏╅柟骞垮灩閳规垹锟斤綆浜ｉ幗鏇㈡倵楠炲灝鍔氭い锔诲灡鐎靛ジ鎮╃紒妯煎幈闂佸搫娲㈤崝灞炬櫠椤旂晫绠鹃柛婊冨暟缁夘喗鎱ㄦ繝鍌ょ吋鐎规洘甯掗～婵嬵敄鐠恒劍鏅奸梻鍌欑劍閹爼宕濆畝鍕亯闁绘挸瀵掗崵鏇炩攽閻樺磭顣查柡鍛絻椤法鎹勯悮鏉戝濡炪倖鎸诲钘夘潖濞差亜绠伴幖杈剧悼閻ｇ敻姊洪悷鏉跨骇闁烩晩鍨堕悰顔嘉熼懖鈺冿紲濠碘槅鍨抽崢褔鐛崼銉︹拺閻犲洦褰冮崵杈╃磽瀹ュ懏顥炵紒鍌氱Ч瀹曞ジ寮撮悙纰夌吹闂備礁鎼崯顐︽偋婵犲洦鍋傛繛鍡樺姂娴滄粓鏌￠崘銊ワ拷鍝ユ暜閼稿吀绻嗛柟缁樺俯閻撳ジ鏌＄仦鐣屝ら柟椋庡█瀹曪絾寰勬繝鍐╂殬缂傚倸鍊烽懗鑸垫叏閻㈠憡鍎庢い鏍仧瀹撲焦绻涢崱妯诲碍缂侊拷閸愵亝鍠愰煫鍥ㄦ礀椤ユ艾鈹戦悩宕囶暡闁抽攱甯￠弻娑氫沪閸撗勫櫘濡炪倧璁ｇ粻鎾诲蓟閻斿搫鏋堥柛妤冨仒缁ㄥ鏌ч懡銈呬沪缂佺粯鐩畷鍗炍旈崘顓犫敍婵犵數鍋涘Ο濠冪濠婂牆绀冮柨鐔绘椤啴濡堕崱妯洪瀺闂佸憡鍔曢…鐑界嵁韫囨稒鍊婚柤鎭掑劜濞呭棝姊虹紒妯哄Е闁告挻鐟ф竟鏇㈩敍閻愮补鎷洪梻鍌氱墛娓氭鎮￠鐘电＜闁绘ê鍟块悘鈺侇熆鐟欏嫭绀嬫い銏＄洴閹瑧鍒掔憴鍕伖闂傚倷绀侀幉锛勭矙閹达附鏅濋柨鏂垮⒔娑撳秹鏌熼崜褏甯涢柛濠傜仛閹便劌螣閸喚鍘梺杞扮窔娴滃爼骞冨Δ鍛棃婵炴垶鐗曟禒顕�姊烘潪鎵妽闁规瓕宕电划瀣箳閺冩挻瀚归柨婵嗛娴滄劙鏌熸搴ｅ笡缂佺粯绋掑蹇涘礈瑜庨崑褔姊洪悜鈺佸⒉婵☆偄鍟悾鐑芥偨缁嬭法顦ㄥ銈嗘⒒閺咁偊宕㈤柆宥嗏拺缂備焦鈼ら鍡楊棜妞ゆ挾鍠愬▍鐘绘煟閵忕姵鍟為柣鎾寸☉闇夐柨婵嗘祩閻掗箖鏌￠崱顓犲埌闁宠鍨块弫宥夊礋椤掑倸濮芥俊鐐�ч梽鍕箰閹惰棄钃熼柨婵嗩樈閺佸洭鏌ｉ弮鍌氬妺闁革絼鍗冲娲传閸曨噮娼堕梺鍛婃⒐閸ㄥ潡鐛崘顔嘉у璺猴功閿涙粌鈹戦悙鏉戠仸闁挎洍鏅滅�靛ジ鏁撻敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹤顕ｆ繝姘亜闁稿繐鐨烽幏濠氭煟鎼达紕浠涢柣鈩冩礈缁絽螖閸涱喒鎷洪柡澶屽仦婢瑰棝藝閿曞倹鍊垫慨姗嗗亜瀹撳棛锟芥鍠涢褔鍩ユ径鎰潊闁绘﹢娼ф慨鍫曟⒒娴ｅ憡鍟為柛鏃�顨婂畷鎴﹀箻濞茬粯鏅ｉ梺鑽ゅ枑婢瑰寮ㄦ禒瀣厽闁归偊鍓涢幗鐘绘倶韫囷絽骞楅柕鍥у椤㈡﹢鎮╅幓鎺戠闁诲孩顔栭崰娑㈩敋瑜旈崺銉﹀緞婵犲孩鍍靛銈嗗姧缁茶姤鍒婃导瀛樷拻濞达絽鎲￠崯鐐烘煙缁嬫寧顥㈢�规洏鍔戦、娑橆潩椤掑倻鎳嗛梻鍌氬�搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞顨呴…銊╁醇濠靛锛楅梻浣瑰濞叉牠宕愰崫銉т笉妞ゆ牜鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?2
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
			// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬姘卞闂佹眹鍨归…宄邦潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙鎻掔骇闁绘濮撮悾鐑藉箛閺夎法顔愭繛杈剧悼椤牓鎮楅銏♀拺缂佸娉曢悘閬嶆煕鐎ｎ剙浠遍柟顕嗙節婵＄兘鍩￠崒婊冨箺闂備礁鎼ú銊╁磻濞戙垺鏅搁柦妯侯槹鐠愶繝鏌ㄩ悢璇残撻柣鏃戝墴楠炲繘鏁撻敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ銈囩磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿京纾藉ù锝堟鐢盯鏌ｉ埡濠傜仩闁伙絿鍏橀、鏃堝醇濠靛牜妲版俊鐐�曠换鎰板蓟婵犲偆鐓ラ柛顐ゅ暱閹疯櫣绱掔紒銏犲箹闁瑰啿绻橀幃鐢割敂閸℃瑧锛滃銈嗘婵倗浜搁銏＄厽闁挎繂顦伴弫杈╃磼閾忚娅曠紒顔界懇瀹曞綊顢欓懖鈹垮仏闂傚倸鍊烽懗鍓佸垝椤栫偛钃熼柕濞垮労閸ゆ洟鏌涢幘鑼瓘闁瑰嘲鍢查～婵嬵敃閵堝洨鍘繝娈垮枛閿曪妇鍒掗鐐茬闁告稒娼欏婵嗏攽閻樻彃锟界懓鈻撳锟藉缁樻媴閸涘﹤鏆堝┑鈽嗗亝閸ㄥ灝顫忔禒瀣妞ゆ挾濮烽悞鍧楁倵楠炲灝鍔氶柟宄邦儔閹繝濡烽埡鍌滃幈濡炪倖鍔х徊璺ㄧ不閹剧粯鐓曢柕鍫濇閻忔挳鏌″畝锟介崰鏍х暦濡ゅ懏鍤冮柍鍝勫�归鍐⒒娴ｅ憡鍟為柡灞诲妿缁棁銇愰幒鎴犵暫闂佺偨鍎查弸濂稿几鎼淬劍鐓欓柣鎰靛墯缂嶆垵霉閻欙拷閸ㄨ泛顫忓ú顏勭闁绘劖褰冩慨搴♀攽閻愯尙婀撮柛濠冾殜閺佹捇鎳為妷銉ユ瘓闂佸憡鎸鹃崰鏍Υ娓氾拷瀵噣宕奸悢鍛婎仧闂備浇娉曢崳锕傚箯閿燂拷,婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕烽鐘电効闂佸湱鍎ゅΛ鎴﹀箯閻戣姤鏅查幖绮癸拷鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼閸ゅ秹鏌曟径濠傛灓濞存粠浜ｅΛ鐔奉渻閵堝棛澧遍柛瀣☉鏁堥柡灞诲劜閳锋垶銇勯幒鐐村缂備礁顦遍弫濠氬箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫬鏆欓柛濠呭吹閺侇喖鈽夊▎宥勭盎闂侀潧顦崕鍝勎ｉ搹鍦＜閺夊牄鍔嶇亸顓熴亜閹剧偨鍋㈢�规洦浜畷姗�顢橀悙鏉戝壍婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴欏灩閻ゎ喗銇勯幇鈺佸姢濞存粈绮欏娲嚒閵堝憛銏＄箾濞村娅囧ù婊咁焾閳诲酣骞嬮悩闈涚闂備胶绮崝妤呭磿閵堝鐓曢柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘嚚鐟邦煥閿熶粙宕￠幎钘夎摕婵炴垯鍨圭粻濠氭倵闂堟稒鍟為柛锝勫嵆濮婅櫣鎷犻垾铏彎濠电偘鍖犻崱娆庤埅闂傚倷鑳堕崢褔锝為弴銏犵９婵°倕鎳忛崕濠囨煕椤愮姴鍔滈柍閿嬪灴濮婂宕奸悢鐑樺垱闂佺粯绋掔划搴ｆ閹烘绠甸柟鐑樺灍閹稿啫鈹戦悙鏉戠仴闁诲繑宀告俊鍫曟晲婢跺﹦顦ㄩ梺鍐叉惈閸燁偊鐛幇鐗堚拻濞达絿顭堥ˉ蹇涙煕鐎ｎ偄娴�规洘鍨垮畷鐔碱敆娴ｅ湱褰块梻浣告贡閾忓酣宕板Δ鍛亗婵炲棙鍔戞禍婊堟煛閸ユ湹绨奸悗姘贡缁辨挻鎷呴崫鍕戯綁鏌ｅΔ鍐ㄐ㈡い鏇稻缁绘繂顫濋锟介懓鍨攽鎺抽崐鏇㈡晝閵堝绠栭柟杈鹃檮閳锋垹绱掗娑欑濠⒀勭叀閺屾洟宕堕埡浣锋閻庤娲滄繛锟界�殿喕绮欓、姗�鎮㈤崣澶婎伜婵犵數鍋犻幓顏嗙礊閿熻棄鈹戦鍝勶拷妤�鈽夐悽绋块唶闁哄洨鍠撻崢閬嶆⒑閹稿海绠撶紒缁樺浮閹箖宕归顐ｎ啍闂佺粯鍔樼亸娆戠不婵犳碍鐓涘ù锝堫潐瀹曞矂鏌℃担瑙勫磳闁轰焦鎹囬弫鎾绘晸閿燂拷?
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
	 * WEAPON		= 0; //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊閻樺樊妫岄梺杞扮閿曨亪寮婚垾鎰佸悑閹肩补锟藉磭顔愮紓鍌欑劍閸旀牠銆冮崱妯尖攳濠电姴娲ゅ洿闂佸憡渚楅崢钘夆枔閺屻儲鍊甸悷娆忓缁�鍐煟閹垮嫮绡�鐎殿喖顭烽幃銏ゅ礂閼测晛濮洪梻浣瑰濞测晠骞忛悜鑺ョ厸閻庯絻鍔岄敓鑺ユ礋閸┿儲寰勯幇顒傤啋閻庤娲栧▔锕侇樄闁哄备锟藉磭鏆嗛柨鐔剁矙瀹曚即骞樼紒妯绘闂佸吋浜介崕鎶藉煢娴ｅ箍浜滄い鎾跺仦婢跺嫬菐閸パ嶈含鐎规洖鐖奸、妤佹媴閸濆嫬绠伴梻浣筋嚙閸戠晫绱為崱妯碱洸闁绘劕鐡ㄥ▍蹇涙⒒閸屾瑧顦﹂柟纰卞亞閹噣顢曢敃锟界粈澶愭煙鏉堝墽鐣辩紒鐘崇墵閺屾洟宕煎┑鎰︾紒鐐劤閸氬鎹㈠☉銏犵闁绘垵娲ｇ欢鍨箾鐎垫悶锟藉骞忛敓锟�
		ACCESSORY	= 2; //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌熺紒銏犳灍闁稿骸顦…鍧楁嚋闂堟稑顫岀紓浣哄珡閸ャ劎鍘遍梺鍝勭Р閸婃洘鏅堕弻銉﹀�垫慨姗嗗墰缁夋椽鏌＄仦闈╂嫹閹颁礁鎮戦柟鑲╄ˉ閿熻棄纾澶愭⒒娴ｈ姤纭堕柛鐘虫礀铻為柛鏇ㄥ灠閻ゎ噣鏌℃径瀣仼闁哄棴绠撻弻娑樜旈崘顭掓嫹閿濆绫嶉柨鐔烘櫕閹广垹鈹戠�ｎ亞顦板銈嗗姧缁叉儳袙閸曨剛绡�闁汇垽娼ф牎濡炪倖姊归悧鐘茬暦閺夎鏃堝川椤愵剚瀚归柛鎰靛枛缁犳盯鏌℃径搴㈢《妞ゆ柨妫濆缁樻媴閸濄儰铏庡銈嗗灦閸旀洟鍩㈤幘瀵割浄閻庯綆鍋嗛崢浠嬫⒑瑜版帒浜伴柛鎿勭畵瀹曠敻鎮㈡總澶屽數閻熸粌绻樺顐ｇ節濮橆剝鎽曢梺鏂ユ櫅閸燁垱鍒婇幘顔藉仭婵炲棗绻愰鈺冪棯閻愵剙鈻曟慨濠勫劋濞碱亪骞嶉鐓庮瀴闂備礁婀遍幊鎾趁洪鐑嗗殨妞ゆ劧绠戠粻鑽ょ磽娴ｈ偂鎴濃枍閵忋倖鈷戦悹鎭掑妼濞呮劙鏌熼崙銈嗗
		ARMOR 		= 3; //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂傚洤顦甸弻銊モ攽閸℃瑥鈷堝┑鐐插悑閸旀牜鎹㈠☉銏犲窛妞ゆ牗鍩冮弸鍛存⒑閸濆嫯顫﹂柛濠冪箞閻涱喗绗熼敓浠嬬嵁閹烘绠ｆ繝闈涙－濞笺儵姊婚崒娆戭槮闁硅绻濋幃鐑藉Ψ瑜庡畷鍙夋叏濡ゅ瀚归悗娈垮枛椤兘寮幇顓炵窞濠电姴瀚烽崥鍛存⒒娴ｇ懓顕滅紒璇插�歌灋妞ゆ挾鍊ｅ☉銏犵妞ゆ牗绋堥幏娲⒑閸涘﹦绠撻悗姘卞厴瀹曟洘鎯旈敐鍥╋紲闂佸吋鎮傚褔宕搹鐧告嫹濞堝灝鏋涙い顓㈡敱娣囧﹪骞栨担鍝ュ幐闂佺鏈惌顔捐姳娴犲鈷掑ù锝勮閻掗箖鏌￠崼顐㈠缂侇喗鐟╅獮瀣晜缂佹ɑ娅嗛梻浣芥硶閸ｏ箓骞忛敓锟�
		BELT 		= 4; //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К闂備胶顭堢悮顐﹀礉鎼淬劌绠熼柟闂寸缁秹鏌涢锝囩畼闁伙絽鎼埞鎴﹀煡閸℃浠ч柣鐙呮嫹闁挎洩鎷锋い顓炴喘閸╋繝宕掑Ο鍦泿闂備礁婀遍崕銈夊春閸惊锝吤洪鍛幈闂佺粯鍔楅崕銈呪槈瑜旈弻宥囨喆閸曨偆浼屽銈冨灪閻熝呭垝閻㈢鎷烽敐搴′航闁告艾鎳樺缁樻媴閸濄儳楔濡炪們鍎查幑鍥х暦濡わ拷椤粓鏁撻挊澶樺殨濠电姵纰嶉崑鍕棯閹峰矂鍝洪柡鍛櫊濮婃椽鎮℃惔顔界稐闂佺锕ラ〃濠囧箖閿熺姴绠荤紓浣骨氶幏娲煛婢跺苯浠﹀鐟版瀹曟繂顓兼径瀣幍闂佽崵鍠撴晶妤呭窗濡》鎷峰▓鍨珮闁稿锕悰顔嘉熼懖鈺冿紲濠碘槅鍨崇划顖烆敂閻斿吋鈷掑ù锝堝Г绾爼鏌涢敐蹇曠暤妤犵偛绻橀弫鎾绘晸閿燂拷
		BOOT		= 5; //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲海鏁搁…鍫熶繆娴犲鈷戠紒瀣儥閸庡繑銇勯幋婵囧殗闁糕晝鍋ら獮瀣晜閽樺姹楅梻浣告贡缁垳鏁繝鍕С濞寸姴顑嗛埛鎴犵磽娴ｅ顏嗙箔閳轰讲鏀芥い鏂挎惈閿熻姤顨婇獮鎴﹀閻橆偅顫嶉梺闈涚箳婵挳鎳撻崹顔规斀闁宠棄妫楅悘銉︺亜閺囧棗娲﹂ˉ澶岋拷骞垮劚椤︿即鍩涢幋鐘电＜閻庯綆鍋掗崕銉╂煕鎼达紕效闁哄本绋掔换婵嬪礃椤忓棛鏉介柣搴㈩問閸犳牠鈥﹂柨瀣╃箚闁归棿绀侀悡娑㈡煕鐏炲墽鐓紒銊ょ矙濮婄粯鎷呮笟顖滃姼闂佸搫鐗滈崜娑氬垝濞嗘挸绠ｉ柨鏃傜帛閺呮粓姊虹捄銊ユ珢闁瑰嚖鎷�
		HEADDRESS	= 6; //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘劙婀侀梺绋跨箰閸氬绱為幋锔界厱闁靛鍎遍敓鑺ユ倐閸╃偤骞嬮敃锟界壕鍏肩節婵犲倹鎹ｉ柛鏃�鎮傚娲传閸曨偒浠撮梺绋挎捣閺佽顕ｆ繝姘伋闁归绀侀幃鎴︽煙閼测晞藟闁跨喕妫勭壕顓㈩敊閹邦喚纾介柛灞剧懆閸忓苯鈹戦钘夆枙鐎规洩绻濋獮搴ㄦ寠婢跺孩鎲伴梻浣虹帛濮婂宕㈣缁顫濋懜鐢靛幗濠德板�ч幏鐑芥煟濡や胶鐭婇摶鐐烘煕閺囥劌鐏￠柣鎾存礋閺屾洘寰勫☉銏☆�嶉柣蹇撻獜闂勫嫰骞堥妸锔剧瘈闁告侗鍣禒鈺呮⒑閸︻厽鍤�閻庢氨澧楁穱濠囧箹娴ｈ倽銊╂煥閺冿拷閸庡磭绱為幒妤佲拻闁稿本鐟ㄩ崗宀勬煙閾忣偅宕岀�规洜鏁诲浠嬵敇閻愭鍞甸梻浣芥硶閸ｏ箓骞忛敓锟�
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
