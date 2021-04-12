
package fire.pb.item;
import com.locojoy.base.Octets;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGetItemTips__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGetItemTips extends __CGetItemTips__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		ItemMaps bag = Module.getInstance().getItemMaps(roleId, packid, true);
		if (bag == null)
			return;
		final ItemBase item = bag.getItem(keyinpack);
		if (item == null) {
			return;
		}		

		Octets tips = item.getTips();
		if (tips == null) {
			Module.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿噮鍣ｉ弫鎾寸鐎ｎ亞顔嗗┑鐘绘涧椤戝懐绮婚姘兼富閻庯綆浜濋幑锝囩磼閻樿櫕鈷愮紒缁樼洴楠炲鎮欓崱妯虹仸鐎垫澘瀚板畷鐔碱敍濞戞艾骞堥梺璇插嚱缁茶姤鏅舵惔锝呭К闁跨喍绮欏娲传閸曨剚鎷卞┑鐐插级椤洭骞戦姀鐘闁靛繆锟界鎷烽柨瀣ㄤ簻闁瑰搫绉烽崗宀�鎲搁幍顔兼灈婵﹦绮幏鍛存嚍閵夛綇鎷烽崘顏嗙＜闁跨喕濮ょ粭鐔兼晸娴犲锟戒線寮介妸銉х獮闂佸綊鍋婇崜婵嬪箺閺囥垺鈷戦柛婵嗗閸屻劑鏌涢妸銉хШ闁哄苯顑夊畷鍫曞Ω瑜忛惁鍫ユ⒑閸撹尙鍘涢柛瀣閹便劑宕奸妷銉︾�梺鍓插亖閸庢煡鍩涢幒鎳ㄥ綊鏁愰崟顕呭妳闂佺粯甯楅崕瀹犵亙闂佺粯锚瀵爼骞夐崫銉х＜妞ゆ棁濮らˉ鍡涙煏閸ャ劌濮嶆鐐村浮楠炲鏁愰崱妯烘毇婵犵數濮烽弫鎼佸磻閻愬搫鍨傛い鏍仜閸ㄥ倿鏌涢敂璇插箻濞戞挸绉撮埞鎴︽偐瀹曞浂鏆￠梺缁樻惈缂嶄線鎮￠锕�鐐婂瀣閸╁本绻涚�涙鐭嗙紒顔界懇瀵濡搁埡鍌氫簻缂傚倷鐒﹂敃鈺佄涢崟顐熸斀闁绘劘娉涙禍褰掓煛閸滃啰绉慨濠傤煼瀹曟帒顫濋濠冨闁归棿绀佺壕鍦拷鐟板閸ｇ銇愰幒鎴犲�為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犲鏌＄仦绋垮⒉鐎垫澘瀚敓鏂ょ秵娴滄繈顢欓崨顓涙斀闁绘劕寮堕埢鏇灻瑰鍐煟鐎殿噮鍋婂畷鍫曨敆娴ｅ搫甯鹃梻濠庡亜濞诧箑煤閺嵮勬瘎闂傚倷绀侀幉锛勬崲閸愵喓锟藉啯绻濋崒銈嗙稁缂傚倷鐒﹂…鍥偡瑜版帗鐓曢柕澶嬪灥閸犳艾顭囬懡銈囩＝闁稿本鐟чˇ锔姐亜閿曞倷鎲剧�殿噮鍋嗛幏鐘绘嚑椤掍焦顔曢梻浣告惈濞层垽宕归崷顓犱笉闁挎繂顦伴悡銉╂煛閸愩劌锟界懓鈻嶉弴銏＄厱婵炲棗绻戦ˉ銏℃叏婵犲懏顏犵紒杈ㄥ笒铻ｉ柤濮愬�ゅΣ顒勬⒒娴ｄ警鐒鹃柨鏇樺�曢敃銏ゆ焼瀹ュ棙娅㈤梺鍏间航閸庢娊宕弻銉︾厵闁告垯鍊栫�氾拷,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴楠炴﹢鎳犻澶嬓滈梻浣规偠閸斿秶鎹㈤崘顔嘉﹂柛鏇ㄥ灠閸愶拷濡炪倖鍔﹀锟界紒顔垮煐娣囧﹤螖閿熶粙骞婃惔銊ョ厴闁硅揪闄勯崐鐑芥煛婢跺鐏╁ù鐘欏洦鈷戦柟鑲╁仜婵¤偐绱撳鍜冭含妤犵偛鍟村畷绋课旀担闈╂嫹闁垮浜滈柟鐑樺灥閿熻棄顭烽、娆撳即閵忊檧鎷洪梺鑽ゅ枑婢瑰棝骞楅悩缁樼厽闁绘梹娼欓崝锕傛煙椤旀枻鑰块柛鈺嬬節瀹曟﹢顢旈崱顓犲簥闂傚倷鑳剁划顖炴晪閻庢鍠栨晶搴ㄥ箯瑜版帗鏅搁柣妯虹－閸樼敻姊洪崨濠勬噧妞わ缚鍗冲畷鎰板箛椤曞棙瀚规繛鍫濈仢濞呮﹢鏌涢幘瀵告创妤犵偞鍨垮畷鐔碱敍濮ｅ皷鏅犻弻銊╁籍閸屾粍鎲橀梺鍝ュ枎闁帮絽顫忔繝姘＜婵炲棙鍔楅妶鏉库攽閻愬樊妲规繛鑼枎閻ｇ兘骞庨懞銉︽珖闂佺鏈銊╊敊閸℃稒鈷戦悹鎭掑妼濞呮劙鏌熼崙銈嗗?:" + item.getName());
			return;
		}
				
		SGetItemTips send = new SGetItemTips(packid, keyinpack, tips);
		gnet.link.Onlines.getInstance().sendResponse(this, send);
		
		if(item instanceof EquipItem)
		{
			PEnhancementTimeout p = new PEnhancementTimeout(roleId);
			p.submit();				
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787453;

	public int getType() {
		return 787453;
	}

	public int packid;
	public int keyinpack;

	public CGetItemTips() {
	}

	public CGetItemTips(int _packid_, int _keyinpack_) {
		this.packid = _packid_;
		this.keyinpack = _keyinpack_;
	}

	public final boolean _validator_() {
		if (packid < 1) return false;
		if (keyinpack < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(packid);
		_os_.marshal(keyinpack);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		packid = _os_.unmarshal_int();
		keyinpack = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGetItemTips) {
			CGetItemTips _o_ = (CGetItemTips)_o1_;
			if (packid != _o_.packid) return false;
			if (keyinpack != _o_.keyinpack) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += packid;
		_h_ += keyinpack;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(packid).append(",");
		_sb_.append(keyinpack).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGetItemTips _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = packid - _o_.packid;
		if (0 != _c_) return _c_;
		_c_ = keyinpack - _o_.keyinpack;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

