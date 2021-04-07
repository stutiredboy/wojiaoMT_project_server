
package gnet;


import fire.pb.fushi.FushiManager;
import fire.pb.main.Gs;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __QueryOrderResponse__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class QueryOrderResponse extends __QueryOrderResponse__ {
	@Override
	protected void process() {
		fire.log.LogManager.logger.info("receive QueryOrderResponse.platid:"+platid+",platsn:"+orderserialplat+",gamesn:"+orderserialgame+",errorcode:"+errorcode);
		if (fire.pb.fushi.Module.getIsYYBUser(userid)) {
			FushiManager.logger.error("闂傚倸鍊搁崐椋庣矆娴ｉ潻鑰块梺顒�绉撮崒銊ф喐閺冨牆绠栨繛宸簻鎯熼梺闈涱樈閸犳绱炴惔銏㈢瘈闁汇垽娼ф牎闂佺厧缍婄粻鏍ь嚕閸涘﹦鐟归柨鐔剁矙瀵寮撮姀鐘诲敹濠电娀娼уú銊╁Χ椤愶附鈷戦柛锔诲幖閸樺瓨銇勯妷锔藉磳妤犵偛顦甸獮姗�顢欓懖鈺婃Ч婵＄偑鍊栭幐鐐叏閻戣棄姹叉い鎰剁悼缁★拷闂佹眹鍨藉褔顢撻幘缁樼厵濡炲楠搁崢鎾煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔戒氦缂傚倸鍊风欢銈夊箯瀹勯偊鐔嗛柤鎼佹涧婵牓鏌ｉ幘鍐叉殻闁哄本娲樺鍕醇濠靛棭鐎撮梻浣虹帛缁诲秵绂嶉鍫濊摕闁挎繂鎳夐弨浠嬫煕閺囥劌浜鹃柟宄板槻閳规垹锟斤綆浜ｉ幗鏇㈡⒑闂堟侗鐒鹃柛搴枛鍗遍柛顐ゅ枍缁诲棙銇勯弽銊х畵濞存粎鎳撻湁闁绘挸瀛╅幖鎰亜椤忓嫬鏆ｅ┑鈥崇埣瀹曞崬螖閸愌冨缂傚倸鍊峰ù鍥春閺嵮呮殕闁归棿鑳跺畵渚�鏌涢埄鍐炬畼闁哄棗妫濋弻娑㈠即閵娿儰绨藉銈忚礋閸旀垵顫忓ú顏呭殐闁冲湱鍋撶�氭盯姊洪崨濠冨鞍闁煎綊绠栭崺銏ゅ箻濞茬粯鏅梺璺ㄥ枙濡嫰锝炶箛娑欐優闁革富鍘鹃悡鎾绘煟閻樺厖鑸柛鏂块叄閹潡宕熼娑掓嫼闂佸憡绋戦敃銉╂偂閵壯呯＜濠㈣泛鏈弳顒傦拷娈垮枟閻撯�崇暦婵傜鍗抽柕濠忛檮濞呭秹姊绘担铏瑰笡闁挎岸鏌涘鐐缂傚倷鐒﹂〃鍛此囬棃娑辨綎闁惧繒娅㈤幏鐑藉捶椤撶倫锝嗐亜閵夈儺妯�闁哄瞼鍠栭幖褰掝敃閵忕媭娼曠紓鍌欑贰閸犳牠鎮ф繝鍌ゅ殫闁告洦鍋嗛弳鍡涙煥閻旂儤娅曞瑙勬礃缁轰粙宕ㄦ繝鍕箞闂佽绻掗崑娑欐櫠娴犲绠犻柛鈩冪♁閻撴洟鐓崶銊﹀暗闁绘帗鎮傞弻锛勪沪缁嬪灝鈷夐梺鐟板槻閹虫ê螞閸愩劉妲堥柧蹇ｅ亜椤忚泛鈹戦悩缁樻锭婵☆偅鐩鎶芥晝閸屾稓鍘棅顐㈡搐椤戝懘鏁撻懞銉у⒌鐎规洘鍨垮畷鐔碱敍濞戞艾骞堟繝鐢靛仦閸ㄥ爼鏁冮锔惧彆妞ゆ帊妞掔换鍡涙煕閹炬鍟獮瀣⒑閸濆嫮鐒跨紓宥勭窔楠炲啴鍩￠崨顔惧姸閻庡箍鍎卞Λ顓㈡晸閼恒儳澧垫慨濠冩そ楠炴牠鎮欓幓鎺濈�烽梻浣侯攰濞呮洟骞戦崶顒�绠栧Δ锝呭暞閸婂鏌ら幁鎺戝姎濞存粍绮撳铏圭磼濡纰嶅┑鐐差嚟閸忔妫熼悷婊勬煥椤繐煤椤忓嫬绐涙繝鐢靛Т閸婃悂寮稿▎鎾粹拺闁荤喐婢樺▓鈺呮煙閸戙倖瀚�?婵犵數濮烽弫鍛婄箾閿熻姤绻涙担鍐叉搐绾捐鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�?闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曢妶蹇斿婵鍘ф晶浼存煙楠炲灝鐏叉鐐村浮瀵噣鏁撴禒瀣辈婵犲﹤鐗婇悡鏇㈡煃閳轰礁鏆熼柍鍙ョ窔閺岋綁骞橀崡鐐插Е闂佸搫琚崝鎴﹀箖閵堝纾兼繛鎴烇供娴硷拷?");
			return;
		}
		new fire.pb.fushi.PQueryOrderResponseNew(this).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 8905;

	public int getType() {
		return 8905;
	}

	public final static int restype_query = 0; // 查询返回结果
	public final static int restype_notify = 0; // 主动通告返回结果

	public int errorcode;
	public int restype;
	public java.lang.String platid; // 平台唯一标识
	public java.lang.String orderserialplat; // 平台用的订单号
	public java.lang.String orderserialgame; // 游戏内自己用的订单号
	public int userid; // 如果返回的结果中，并没有userid的信息，该值为-1
	public com.locojoy.base.Octets vars;

	public QueryOrderResponse() {
		errorcode = ErrorCodes.error_succeed;
		restype = restype_query;
		platid = "";
		orderserialplat = "";
		orderserialgame = "";
		userid = -1;
		vars = new com.locojoy.base.Octets();
	}

	public QueryOrderResponse(int _errorcode_, int _restype_, java.lang.String _platid_, java.lang.String _orderserialplat_, java.lang.String _orderserialgame_, int _userid_, com.locojoy.base.Octets _vars_) {
		this.errorcode = _errorcode_;
		this.restype = _restype_;
		this.platid = _platid_;
		this.orderserialplat = _orderserialplat_;
		this.orderserialgame = _orderserialgame_;
		this.userid = _userid_;
		this.vars = _vars_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(errorcode);
		_os_.marshal(restype);
		_os_.marshal(platid, "UTF-16LE");
		_os_.marshal(orderserialplat, "UTF-16LE");
		_os_.marshal(orderserialgame, "UTF-16LE");
		_os_.marshal(userid);
		_os_.marshal(vars);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		errorcode = _os_.unmarshal_int();
		restype = _os_.unmarshal_int();
		platid = _os_.unmarshal_String("UTF-16LE");
		orderserialplat = _os_.unmarshal_String("UTF-16LE");
		orderserialgame = _os_.unmarshal_String("UTF-16LE");
		userid = _os_.unmarshal_int();
		vars = _os_.unmarshal_Octets();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof QueryOrderResponse) {
			QueryOrderResponse _o_ = (QueryOrderResponse)_o1_;
			if (errorcode != _o_.errorcode) return false;
			if (restype != _o_.restype) return false;
			if (!platid.equals(_o_.platid)) return false;
			if (!orderserialplat.equals(_o_.orderserialplat)) return false;
			if (!orderserialgame.equals(_o_.orderserialgame)) return false;
			if (userid != _o_.userid) return false;
			if (!vars.equals(_o_.vars)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += errorcode;
		_h_ += restype;
		_h_ += platid.hashCode();
		_h_ += orderserialplat.hashCode();
		_h_ += orderserialgame.hashCode();
		_h_ += userid;
		_h_ += vars.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(errorcode).append(",");
		_sb_.append(restype).append(",");
		_sb_.append("T").append(platid.length()).append(",");
		_sb_.append("T").append(orderserialplat.length()).append(",");
		_sb_.append("T").append(orderserialgame.length()).append(",");
		_sb_.append(userid).append(",");
		_sb_.append("B").append(vars.size()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

