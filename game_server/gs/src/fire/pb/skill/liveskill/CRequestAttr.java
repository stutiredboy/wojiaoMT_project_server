
package fire.pb.skill.liveskill;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestAttr__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犲鏌＄仦绋垮⒉鐎垫澘瀚敓鏂ょ秵娴滄繈顢欓崨顓涙斀闁绘劕寮堕埢鏇灻瑰鍐煟鐎殿噮鍋婂畷鍫曨敆娴ｅ搫甯鹃梻濠庡亜濞诧箑煤閺嵮勬瘎闂傚倷绀侀幉锛勬崲閸愵喓锟藉啯绻濋崒銈嗙稁缂傚倷鐒﹂…鍥偡瑜版帗鐓曢柕澶嬪灥閸犳艾顭囬懡銈囩＝闁稿本鐟чˇ锔姐亜閿曞倷鎲剧�殿噮鍋嗛幏鐘绘嚑椤掍焦顔曢梻浣告惈濞层垽宕归崷顓犱笉闁挎繂妫涚弧锟介梺闈涢獜缁辨洜绮婚幘鍓佺＝鐎广儱鎷戝銉╂煟閿濆懎妲婚摶鏍煕濞戝崬骞樻い蟻鍥ㄢ拺闁稿繗鍋愰妶鎾煛閸涱喚绠為柛鈹垮灱缁犳稑鈽夊▎灞惧濠电偠鎻紞锟藉┑顔哄�濊棢濠㈣埖鍔栭悡鏇㈡煟閺冨洦纭剧�规挸妫涢敓鍊燁潐濞叉垿宕￠崘宸殨濞寸姴顑愰弫鍥煟閹邦垰鐓愰柟韫嵆濮婄粯鎷呴搹鐟扮闂佸搫琚崝鎴濈暦閵壯嶆嫹閿濆骸鏋熼柛濠傜仢闇夐柣妯烘▕閸庢劙鏌ｉ幘鍗炲姦闁哄矉绻濆畷姗�濡搁敃锟介ˇ鈺冪磼缂併垹骞栭柣鏍с偢瀵鍩勯崘鈺侇�撻梺闈╁瘜閸樺ジ鍩涚仦瑙ｆ斀妞ゆ梻銆嬮弨缁樹繆閻愯埖顥夐柣锝囧厴椤㈡洟鏁冮敓鐣岀矆鐎ｎ偁浜滈柟浼存涧娴滄鏌熼鍡欑М婵﹦绮幏鍛瑹椤栨粌濮奸梻浣瑰濞插繘宕愰弴鈶╋拷锕傚炊椤掍焦娅㈤梺缁橈耿濞佳呯矈閿曞倹鈷戦柛娑橈工婵箓鏌ｉ幘宕囧妞ゎ厼娲俊鎼佸煛閸屾粌寮抽梻浣虹帛閺屻劍鏅舵惔銊﹀剹婵炲棙鍔﹀▓浠嬫煟閹邦厼绲婚柡鍡樼懇閺屽秶鎷犻弻銉ュ及濡ょ姷鍋為敃銏ょ嵁閺嶎収鏁囬柣鏇氱劍椤ュ牊绻濋悽闈浶ラ柡浣规倐瀹曟垿鎮欓崫鍕�梺鍓插亝濞插繘鏁撻挊澶婃殻鐎规洖宕埥澶娢熺喊杈ㄐч梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�?? by changhao
 */
public class CRequestAttr extends __CRequestAttr__ {
	private static Logger logger = Logger.getLogger("ITEM");
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestattr = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				xbean.Properties prop = xtable.Properties.select(roleid);
				if (prop == null)
				{
					return false;
				}
				
				fire.pb.attr.SRefreshRoleData refreshdata = new fire.pb.attr.SRefreshRoleData();
				if (attrid.contains(fire.pb.attr.AttrType.ENERGY))
				{
					int energy = prop.getEnergy();
					refreshdata.datas.put( fire.pb.attr.AttrType.ENERGY, (float)energy);					
				}
				logger.error("------------婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵婵炲棗绻掓禒楣冩⒑缁嬫鍎嶉柛濠冪箞瀵寮撮悢铏诡啎閻熸粌绉瑰畷顖烆敃閿旇棄锟借泛鈹戦悩鍙夊妞ゃ儱锕ラ妵鍕箛閳轰胶浠炬繝銏ｆ硾鐎氫即寮婚悢鐓庡窛濠电姴鍟崬澶愭倵濞堝灝鏋ゆい顓炵墦椤㈡﹢宕楅悡搴ｇ獮闁诲函缍嗛崜娆忣嚕閾忣偆绡�闁汇垽娼ч埢鍫熺箾娴ｅ啿鍚樺☉妯锋瀻闁规儳绉撮ˇ鐢稿箖濞嗘埊鎷烽棃娑欐喐妞ゆ梹娲熷娲川婵犱胶绻侀梺鎼炲妺閸楁娊宕洪姀銈呴唶闁靛濡囬崢闈涱渻閵堝棙顥嗛柛瀣姉缁棃鎮滃鍡橆啍闂佺粯鍔栨竟鍡欑玻閺冿拷椤ㄣ儵鎮欓弶鎴炶癁濡ょ姷鍋涢鍛村煘閹达箑绠涙い鏇炴鐎氬綊寮堕崼娑樺缂佲槄鎷烽梻浣圭湽閸ㄨ棄顭囪缁傛帒顭ㄩ崼鐔哄幗濡炪倖鎸鹃崑鐔告櫠濞戞氨纾奸柛灞炬皑鏁堝銈冨灪濡啫鐣烽悡搴樻斀濠电姴鍟崯娲⒒閸屾瑧鍔嶉悗绗涘懏宕查柛宀�鍊涢崶顒夋晬婵犲﹤鎳嶇粭澶娾攽閻愭潙鐏熼柛銊︽そ閹繝鎮╃紒妯煎幍闂傚倸鍊搁顓㈠礉瀹ュ棛绠鹃柟鍐插槻鐎氥劍绂嶅鍫㈠彄闁搞儯鍎遍崝婊堟倵濮樼偓瀚�??-闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡欏闁靛棗鍟撮弻锝夊箳閹搭垵鍚梺鍝勬湰缁嬫垿鍩ユ径濞炬瀻闁归偊鍠氶埢蹇曠磽閸屾瑨鍏屽┑顖ｅ弮瀹曞綊宕奸弴鐐舵憰闂侀潧艌閺呮粓宕戦崱娑欑厱閻忕偛澧介埥澶嬨亜韫囥儲瀚�?------------------"+refreshdata.datas);
				mkdb.Procedure.psendWhileCommit(roleid, refreshdata);					
				
				return true;
			}
		};
		
		requestattr.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800530;

	public int getType() {
		return 800530;
	}

	public java.util.LinkedList<Integer> attrid;

	public CRequestAttr() {
		attrid = new java.util.LinkedList<Integer>();
	}

	public CRequestAttr(java.util.LinkedList<Integer> _attrid_) {
		this.attrid = _attrid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(attrid.size());
		for (Integer _v_ : attrid) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			int _v_;
			_v_ = _os_.unmarshal_int();
			attrid.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestAttr) {
			CRequestAttr _o_ = (CRequestAttr)_o1_;
			if (!attrid.equals(_o_.attrid)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += attrid.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(attrid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

