
package fire.msp.role;

import fire.pb.main.ConfigManager;
import fire.pb.map.MapConfig;
import fire.pb.move.SAddUserScreen;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GAddUserScreen__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GAddUserScreen extends __GAddUserScreen__ {
	@Override
	protected void process() {
		// protocol handle
		Role reqRole = RoleManager.getInstance().getRoleByID(reqroleid);
		Role addRole = RoleManager.getInstance().getRoleByID(addroleid);
		if(reqRole == null || addRole == null)
			return;
		if(reqRole.getScene().getSceneID() != addRole.getScene().getSceneID())
			return;//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹤顕ｇ拠娴嬫婵☆垶鏀遍弬锟介梻浣告啞濞诧箓宕戦崟顒佸弿闁靛繈鍊栭埛鎴炵箾閼奸鍤欐鐐搭殜閺岀喖鎮烽悧鍫濇灎閻庢鍠栭…鐑藉春閸曨垰绀冮柕濞у懐宓侀梻浣筋嚙閸戠晫绱為崱妯碱洸闁绘劕鎼崒銊╂煙閹殿喖顣奸柍閿嬪灴閺屻倕霉鐎ｎ偅鐝斿銈忕到閵堟悂骞冨Δ鍐當婵炴垶蓱閹兼劕顩奸崨瀛樷拺闁告稑锕ユ径鍕煕閻樺啿鍝洪柟顔兼健閺佹挻绂掔�ｎ偀鎷洪柣鐔哥懃鐎氼剛绮堥崘鈺冪濠㈣泛顑囧ú鎾煏閸℃锟藉摜鍙呭銈呯箰閹虫劙宕㈡禒瀣拺缂備焦蓱閻撱儵鏌熼懞銉х煉妤犵偛锕鎾偐閻㈢绱查梻浣虹帛椤牆鈻嶉弴鐐垫殾閻忕偟铏庡▓浠嬫煟閹邦厼绲婚柡鍡樼懄閵囧嫰顢曢敐鍥╃厜闂佽桨鐒﹂幐鑽ょ矉閹烘棑鎷烽敐搴濈敖闁伙絽鎼埞鎴︽倷閸欏妫￠梺鎼炲姀濞夋盯鎮鹃柨瀣窞闁归偊鍓涙鍥⒑缂佹ê濮嶆繛浣冲洢锟藉倹绺介崨濠勫幗濡炪倖鍔戦崹鑽ょ不閹绘崨搴ㄥ炊瑜濋煬顒勬煙椤旂晫鎳囨い銏℃瀹曠喖鎳滈棃娑变紦闂備礁鎼ú銊︽叏闂堟稓鏆﹂柛娆忣槷缁诲棙銇勯弽銊х畵闁告俺顫夐妵鍕煛閸屾粌寮ㄩ梺鍝勬湰閻╊垶銆侀弴銏℃櫜闁糕剝鐟Σ顒勬⒒娴ｈ姤顥夐柛鐔跺嵆瀹曚即骞囬钘夊簥濠电偞鍨崹鍦不閿濆棛绠鹃柛鈩冾殘缁犲啿霉閻樿崵鐣烘慨濠冩そ瀹曨偊宕熼锟藉▍銈囩磽娓氬洤鏋熼柟鐟版搐椤曪絾绻濆顓炰簻缂佺偓濯芥ご鎼佸疾椤掑嫭鈷戠紒顖涙礀婢у弶銇勯妸銉﹀殗鐎殿喖鍟块埢搴ㄥ箛閳猴拷缁ㄨ顪冮妶鍡楅嚋闁圭兘鏀辨穱濠囶敃閿濆洦鍣梺鐟扮畭閸ㄥ綊鍩為幋鐙呮嫹閿濆骸浜滃ù鐘虫そ濮婂宕掑鍗烆杸缂備礁顑嗛崝妤呭礆閹烘閱囬柡鍥╁暱閹锋椽姊洪懡銈呮瀾婵犮垺锕㈠铏綇閳哄啰锛滅紓鍌欑劍閿曨偊鎳撻幐搴闁绘劖褰冮弳锝夋煙椤旂晫鐭掗柟宕囧仱婵＄兘鏁傞悾灞界稻闂傚倸鍊风粈渚�骞夐敓鐘茬闁糕剝绋戝婵囥亜閺嶃劏澹樼紒鐘宠壘閳规垿鎮╅崹顐ｆ瘎婵犳鍠曢崡鍐茬暦瑜版帗鍋傞幖瀛樕戦悘鍐ㄢ攽閻愭潙鐏熼柛銊︽そ瀵彃鈹戠�ｎ偆鍙嗛梺鍝勬川閸嬫盯鏁撻悾宀婄劸閺佸牓鏌＄仦璇插姕闁稿﹦鏁婚弻銊モ攽閸℃侗锟芥霉濠婂嫮绠為柡灞剧☉閳诲氦绠涢弴鐙�鍞圭紓鍌欒兌缁垳鎹㈤崼婢盯宕橀妸銏☆潔濠殿喗锕╅崗姗�骞忛鍫熲拻濞达絽鎽滅粔鐑樸亜閵夛附宕岀�规洘顨呴～婊堟晸閽樺鍤曟い鎰剁畱缁犺崵绱撴担鑲℃垵鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�
		MapConfig mapcfg = ConfigManager.getInstance().getConf(MapConfig.class).get(reqRole.getScene().getMapID());
		if(mapcfg == null)
			return;
		if(mapcfg.getVisibletype() == 1)//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К闂備胶顭堢悮顐﹀礉鎼淬劌绠熼柟闂寸缁秹鏌涢锝嗗剷闁靛鏅滈悡鏇㈡煙閼割剙濡芥繛鍛閺屾稒鎯旈敐鍛亪闂佸搫鏈ú婵堢不濞戞熬鎷烽敐搴濈敖闁告梹娼欓埞鎴︽倷鐠鸿櫣姣㈠銈庡幖閻楁捇宕洪悙鍝勭闁挎棁妫勬禍褰掓煟閻樺弶鍘傞柛鎰屽懐鐓戦梻鍌氬�烽懗鍫曞箠閹捐鐤悹鎭掑妽瀹曟煡鏌熼幍顔碱暭闁稿鏅犻弻锝夊箣閿濆棭妫勭紓浣哄Х閺佸寮婚悢鐓庝紶闁告洟娼ч崝锟介梻浣哥秺椤ユ捇宕楀锟介悰顕�骞掑Δ锟界粻锝嗐亜閹捐泛鏋庨柛蹇擄躬濮婄粯鎷呴搹鐟扮闂佸憡妫戠粻鎾崇暦濠婂啠鏋庨柟鍨暞閺呮粓姊洪崜鎻掍簼婵炲弶锕㈤幃锟犳偄閻撳海顔愬┑鐑囩秵閸撴瑩鏁撴慨鎰拷鏇⑩�﹂崶顒�绠涙い鎾跺Х椤旀洖鈹戦悙瀛樼稇妞ゆ垵妫楅埢宥夊炊閳哄啰锛滈柡澶婄墐閺呮稒绂掗敂鍓х＜婵°倕鍟弸娑㈡煛娴ｈ灏扮紒鍌涘笧閿熸枻缍嗛敓绛嬪幑閸庨亶婀侀梺鎸庣箓濞层劑濡存繝鍐х箚闁圭粯甯炴晶娑樓庨崶褝韬い銏＄洴閹瑧锟芥稒蓱濞堟悂姊绘担鍛婃儓闁稿锕獮蹇涙倻閼恒儮鎷婚梺绋挎湰閻熝囁囬敂鍓х＝鐎广儱鎷戦煬顒傦拷瑙勬礃閸ㄥ墎鎹㈠┑瀣倞鐟滃秹宕戝澶嬧拺闁告稑锕ョ�垫瑩鏌涘☉鍗炵仯闁告濞�濮婄粯鎷呴懞銉с�婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�
			return;
		if(mapcfg.getVisibletype() == 2)//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊炲銈嗗笒椤︿即寮查鍫熷仭婵犲﹤鍟扮粻缁橆殽閻愭潙鐏村┑顕嗘嫹闂侀潧鐗嗛幊鎰版偪閿熻姤淇婇悙顏勶拷鏍涙担鑲濇盯宕熼浣稿妳婵犵數濮村ú锕傚煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垺鍋愰柟棰佺劍閻ｅ爼姊烘导娆戞偧闁稿繑锚閻ｇ兘鏁愰崱妤冪獮婵犮垼娉涢惉濂告偩閻愵兛绻嗛柣鎰典簻閿熻姤鐗犻幃褍螖閸涱喖浠悷婊冪箳閸掓帡寮崼婵嬫暅濠德板�撻懗鍫曞矗閸℃せ鏀介柣妯肩帛濞懷勪繆椤愵偄骞栭崡杈╂喐閻楀牆绗氶柣鎾寸洴閺屾稑鈽夐崡鐐寸亾缂備胶濮烽崑銈夊蓟閿涘嫪娌柛鎾椾緤鎷烽幒鎳ㄥ綊鎮崨顖滄殼闂佽鍠楅悷鈺呫�佸Δ鍛＜婵炴垵宕幃瀣⒒閸屾艾锟界兘鎳楅崜浣稿灊妞ゆ牜鍋涚粻鏉库攽閻樺疇澹橀柛銊ュ�块弻锝夊閵忊偓锟藉﹪鏌ㄩ悢璇残撴俊顐㈠暙閻ｅ嘲顫滈敓浠嬨�佸▎鎾冲簥濠㈣鍨板ú锕傛偂閺囥垺鐓冮柍杞扮閺嗙喖鏌熼崘鎻掓殲闁靛洤瀚伴、鏇熸償閳╁啫娅х紒鐐礃濡嫰婀侀梺鎸庣箓濞层劑骞楅崒鐐寸厱闁靛牆妫涢幊鍛磼鏉堛劌绗氱�垫澘瀚敓鏂ょ秵閸嬪嫰宕径鎰拺闁绘劘妫勯崝鐢电磼閻樿櫕灏柣锝囧厴瀹曞ジ寮撮妸锔芥珜濠电偠鎻紞锟芥い顐㈩樀椤㈡棃鎮㈤崗灏栨嫽婵炶揪缍�婵倗娑甸崼鏇熺厱闁挎繂绻掗悾鍨殽閻愯尙绠婚柡浣规崌閺佹捇鏁撻敓锟�
		{
			final long reqteamid = reqRole.getTeamID();
			final long addteamid = addRole.getTeamID();
			if(reqteamid == 0 || addteamid == 0 || reqteamid != addteamid)
				return;
		}
		
		SAddUserScreen sadduser = new SAddUserScreen();
		sadduser.rolelist.add(addRole.getRoleBasic());
		gnet.link.Onlines.getInstance().send(reqroleid, sadduser);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730909;

	public int getType() {
		return 730909;
	}

	public long reqroleid;
	public long addroleid;

	public GAddUserScreen() {
	}

	public GAddUserScreen(long _reqroleid_, long _addroleid_) {
		this.reqroleid = _reqroleid_;
		this.addroleid = _addroleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(reqroleid);
		_os_.marshal(addroleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		reqroleid = _os_.unmarshal_long();
		addroleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GAddUserScreen) {
			GAddUserScreen _o_ = (GAddUserScreen)_o1_;
			if (reqroleid != _o_.reqroleid) return false;
			if (addroleid != _o_.addroleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)reqroleid;
		_h_ += (int)addroleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(reqroleid).append(",");
		_sb_.append(addroleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GAddUserScreen _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(reqroleid - _o_.reqroleid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(addroleid - _o_.addroleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

