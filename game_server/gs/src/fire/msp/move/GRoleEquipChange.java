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
		if (changetype == 0 && ride == -1) // 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ穿缂嶆牠鎮楅敐搴℃灈缂侊拷鐎ｎ偁浜滈柟鎵虫櫅閻掔儤绻涢崗鐓庡摵婵﹦绮幏鍛存惞閻熸壆顐肩紓鍌欑椤戝棝骞戦崶褏鏆﹂柟瀛樼妇濡插牓鏌曡箛鏇炐ラ柛妯煎劋缁绘稓锟界數顭堝瓭濡炪倖鍨甸幊姗�骞冮悙瑁佹椽顢旈崨顖氬箞闂備胶顢婇崺鍥礉瀹ュ應鏋嶉柛銉墯閻撶喖鏌ㄥ┑鍡橆棞闁崇粯娲橀幈銊︾節閸愨斂浠㈤悗瑙勬磸閸斿秶鎹㈠┑瀣妞ゆ帪鎷锋繛鍛殜濮婄粯鎷呴悷閭﹀殝閻庣櫢鎷烽柟闂寸缁犳牗淇婇妶鍛殭闁哄鐗嗛…璺ㄦ崉娓氼垰鍓板銈呴獜閹凤拷 by changhao
			return;
		Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		if (role == null)
			return;
		if (null == role.getScene())
			return;

		if (changetype != 0) // 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭锟藉箍鍎卞ú銊╂儗閸℃ぜ锟芥帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯鏁冮妷鈺佺畾闁哄啫鐗嗘儫闁诲函缍嗘禍婵嬪窗濡眹浜滈柕蹇婃濞堟粎锟借娲滈崰鏍�侀弴銏犖ч柛銉戝啰鐣卞┑鐘垫暩婵兘銆傞挊澹╋綁宕ㄩ弶鎴濈�繛鏉戝悑濞兼瑧绮荤憴鍕╀簻闁规媽娉涢惁婊堟煛娴ｅ壊鍎旈柡灞诲姂閹倝宕掑☉姗嗕紦 by changhao
		{
			role.components.put(changetype, itemid);
			if (changetype == SpriteComponents.SPRITE_WEAPON) {
				if (itemid != 0)
					role.components.put((byte) SpriteComponents.SPRITE_WEAPONCOLOR,	itemcolor);
				else
					role.components.remove((byte) SpriteComponents.SPRITE_WEAPONCOLOR);
			}
			// 闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾粌顤�闂佺顑戠换婵嬪蓟瀹ュ浼犻柛鏇ㄥ墮濞咃綁姊婚崒姘簽闁搞劌鐖煎濠氭晲婢跺﹦顓洪梺鎸庣箓閹叉盯骞樼紒妯煎幈闁诲函缍嗘禍鍫曞磿閺冨牊鐓欐い鏃傚帶濡插鏌嶇拠鍙夊攭缂佺姵鐩獮娆撳礃瑜忕壕濠氭⒒閸屾瑧顦﹂柟纰卞亜铻炴繛鍡楃贩濞差亜鍐�妞ゆ挻鍐婚幏鐑芥晜閻愵剙纾梺闈涱煭缁犳垹澹曢鐐粹拺闁告稑锕︾粻鎾绘倵濮樿埖鏁遍悗闈涖偢閺佹挻绂掔�ｎ偀鎷绘繛杈剧悼閻℃棃宕甸崘顔界厱闁绘ê纾晶鐢告煛娴ｇ鏆ｅ┑锛勬焿椤︽挳鏌ｉ鐔烘噰闁哄被鍔戦幃銈夊磼濞戞﹩浼�?濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻鐔兼⒒鐎垫瓕绐楅梺杞扮鐎氫即寮诲☉銏犵労闁告劗鍋撻鐟扳攽閻愬瓨灏い顓犲厴瀵鈽夊顐ｅ媰闂佸憡鎸嗛崨顖氬笒闂傚倷绀侀幗婊堝闯閿曞倸绠柨鐕傛嫹?2
			if (changetype == SpriteComponents.ROLE_COLOR1) {
				xbean.Properties prop = xtable.Properties.select(roleid);
				role.components.put((byte) SpriteComponents.ROLE_COLOR2,
						prop.getRolecolor2());
			}
		}

		if (ride != -1) // 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ穿缂嶆牠鎮楅敐搴℃灈缂侊拷鐎ｎ偁浜滈柟鎵虫櫅閻掔儤绻涢崗鐓庡摵婵﹦绮幏鍛存惞閻熸壆顐肩紓鍌欑椤戝棝骞戦崶褏鏆﹂柟杈剧畱鍥撮梺鍛婁緱閸ㄥ崬鈻撴ィ鍐┾拺闁圭娴风粻鎾绘煙閸欏鑰块柟顔哄灲閹剝鎯斿┑鍫㈠�為梻鍌欑閹测�趁洪悢濂夌劷鐟滃秹鍩㈤幘缁樻櫢闁跨噦鎷� by changhao
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
				// 闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾粌顤�闂佺顑戠换婵嬪蓟瀹ュ浼犻柛鏇ㄥ墮濞咃綁姊婚崒姘簽闁搞劌鐖煎濠氭晲婢跺﹦顓洪梺鎸庣箓閹叉盯骞樼紒妯煎幈闁诲函缍嗘禍鍫曞磿閺冨牊鐓欐い鏃傚帶濡插鏌嶇拠鍙夊攭缂佺姵鐩獮娆撳礃瑜忕壕濠氭⒒閸屾瑧顦﹂柟纰卞亜铻炴繛鍡楃贩濞差亜鍐�妞ゆ挻鍐婚幏鐑芥晜閻愵剙纾梺闈涱煭缁犳垹澹曢鐐粹拺闁告稑锕︾粻鎾绘倵濮樿埖鏁遍悗闈涖偢閺佹挻绂掔�ｎ偀鎷绘繛杈剧悼閻℃棃宕甸崘顔界厱闁绘ê纾晶鐢告煛娴ｇ鏆ｅ┑锛勬焿椤︽挳鏌ｉ鐔烘噰闁哄被鍔戦幃銈夊磼濞戞﹩浼�?濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻鐔兼⒒鐎垫瓕绐楅梺杞扮鐎氫即寮诲☉銏犵労闁告劗鍋撻鐟扳攽閻愬瓨灏い顓犲厴瀵鈽夊顐ｅ媰闂佸憡鎸嗛崨顖氬笒闂傚倷绀侀幗婊堝闯閿曞倸绠柨鐕傛嫹?2
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
			// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁�濠囨煥閻旇袚缂佺粯鐩畷顏堝礃椤忓柊婊堟⒑绾懏鐝紒顔芥尭閻ｉ攱绺界粙鍨祮闂佺粯鏌ㄥ鍓侊拷姘矙濮婄粯鎷呴崨濠傛殘闂佸憡妫戦梽鍕矉瀹ュ拋鐓ラ柛顐ｇ箓閸ゆ垿鏌熼崗鑲╂殬闁告柨绉归幃鈥斥枎閹炬潙浠梺鎼炲劚濞层倗锟芥凹鍓熼、鏃堟晸閿燂拷,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告噰闁诡噣娼ц灒闁煎鍊楅惁鍫ユ⒑闂堟盯鐛滅紒鎻掑⒔濞戝灚銈ｉ崘鈺冨幐闂佸壊鍋掗崑鍕櫠閹绢喗鐓欐い鏇嫹缂佺姵鐗犲濠氬幢濡ゅ﹤鎮戦梺绯曞墲閵囩偤宕犻弽顓熲拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟�?
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
	 * WEAPON		= 0; //婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖缁愭淇婇妶鍛殲鐎规洘鐓￠弻鐔兼焽閿曪拷閺嬨倕鈽夐幘宕囆ч柡宀�鍠撻敓鑺ョ♁椤洦淇婇崶顒佺厸閻庯綆浜炴晥闂佸搫琚崝鎴﹀箖閵堝纾兼繛鎴烇供娴硷拷
		ACCESSORY	= 2; //濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氬綊鏌″搴″箲闁跨喕妫勯崯鏉戠暦閸楃倣鏃�绻濋崟顐ｆ毄濠电姵顔栭崰妤呫�冮幇鏉跨闂佸灝顑愬▓浠嬫煟閹邦剦鍤熷褏鏁婚弻鈩冩媴鐟欏嫬纾抽梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�
		ARMOR 		= 3; //闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗霉閿濆牜娼愭繛鍛█閺屻倝骞侀幒鎴濆闂佸憡鐟ョ换姗�寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷
		BELT 		= 4; //闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲搁弮鍫濈畺婵☆垯璀﹀鈺傘亜閹烘埈妲洪柛鐐烘涧閳规垿顢欑粵瀣吅闂佸綊顥撻崗姗�寮婚悢纰辨晩闁煎鍊楅悡鎾绘⒑鏉炴壆鍔嶉柟鐟版喘瀵偊骞樼紒妯绘闂佽法鍣﹂幏锟�
		BOOT		= 5; //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵稿妽闁稿顑呴埞鎴︽偐閹绘帊绨介梺缁樺笩婵倗鎹㈠☉銏犲耿婵☆垵顕ч棄宥夋⒑缁嬫鍎嶉柛濠冪箞瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷
		HEADDRESS	= 6; //濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倸鈹戦崒婊庣劸闁哄嫨鍎甸弻鈥愁吋鎼粹�崇缂備胶濮抽崡鎶藉蓟閻旂厧绠氶柣妤�鐗滃Λ鍕煕閵夛附灏︽慨濠呮閹瑰嫰濡搁妷锔惧綒闂備胶鎳撻崵鏍箯閿燂拷
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
