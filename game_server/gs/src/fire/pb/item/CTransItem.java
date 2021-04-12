package fire.pb.item;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CTransItem__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CTransItem extends __CTransItem__ {
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		if (srcpackid == BagTypes.DEPOT || dstpackid == BagTypes.DEPOT) {
			if (!Depot.useDepotCheck(roleId, npcid))
				return;
		}

		if (!checkMove(roleId))
			return;

		if (dstpackid == BagTypes.BAG)
			page = -1; // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴楠炴﹢鎳犻澶嬓滈梻浣规偠閸斿秶鎹㈤崘顔嘉﹂柛鏇ㄥ灠閸愶拷闂侀潧臎閸涱垰甯庨梻鍌欑劍閹爼宕濆鍥ㄥ床闁告洦鍨遍弲鎼佹煢濡警妲洪柣锝庡弮閺屾稒鎯旈妸銈嗗枤濡ょ姷鍋涚换鎺楁晸閺傘倗绉甸柛鐘愁殜瀹曟垿宕熼娑氬幈闂佹枼鏅涢崢楣冩嚃閳哄倸搴婇梺绯曞墲鑿уù婊勭矒閺屸�愁吋閸愩劌顬嬮梺娲诲幖閿曨亪寮婚敐澶娢╅柨鏇嫹闁诲繑鎸抽弻锛勪沪鐠囪鎷峰┑瀣畺鐟滄柨鐣烽悡搴樻斀闁归偊鍓氶悿鍌炴⒒閸屾瑧绐旀繛浣冲厾娲Χ閸ラ攱瀚规慨妯煎帶閻忥絿绱掗娆惧殭闁宠棄顦垫慨锟介柣妯活問閸熷姊洪懡銈呅俊妞煎妿閹峰啴鏁冮崒姘遍獓闂佸綊妫块悞锕傚煕閹烘嚚褰掓晲閸偅缍堥梺绋款儑婵烇拷闁哄本绋掔换婵嬪礃閳哄喚妲堕梻浣芥硶閸犳洘鎱ㄩ妶澶嬪剹妞ゆ洩鎷风�规洩绻濋獮搴ㄦ偩鐏炵晫銈﹂梻浣告啞閸旓箓鎮￠崼婵愮劷闁靛ň鏅滈悡銉╂煟閺傚灝顣抽柣顓熺懄椤ㄣ儵鎮欓幓鎺撴闂佸疇顕ч柊锝夌嵁濮楋拷瀵爼骞嬮悙鍨緭婵犵數濮烽弫鎼佸磻濞戙垺鍋嬪┑鐘插閹烽绮☉妯荤〗濠㈣泛顑呯欢鐐烘煙闁箑骞愰柟椋庣帛缁绘稒娼忛崜褏袦濡炪們鍎查幐鑽ょ矙婢舵劖鍤戞い鎺戝�婚敍婊堟⒑缂佹◤顏堝疮閸啔褰掝敊閹惧懏瀚归悷娆忓缁�鍐╀繆閻愯埖顥夋い鏇稻缁傛帞锟斤絽鐏氶弲婵嬫⒑閹稿海绠撻柟鍐叉捣閼洪亶濡烽敂鍓х槇闂佹眹鍨藉褎绂掗敃鍌涚厱闁靛鍎抽崺锝夋煙椤栨氨鐒告い銏＄懅娴滄悂寮介妸褍寮┑锛勫亼閸婃洜鎹㈤幇顑╂稑鈽夊顒夋婵犻潧鍊搁幉锟犲磹閻㈠憡鐓ユ繝闈涙閸戝湱绱掗妸銊︻棄闂囧鏌ｅ鍡楁灈闁诲繑鐓￠弻锛勪沪閻ｅ睗銏ゆ煟閿濆繒绡�闁哄苯娲弫鍌炲矗椤愵剛鐣垫慨濠呮閿熻棄婀辨刊顓烆焽閹扮増鐓曢柕濞垮劜閸嬨儲顨ラ悙鎻掓殻妞ゃ垺妫冨畷鐓庘攽閸℃瑧宕哄┑锛勫亼閸婃牕顫忔繝姘厱闁割偆鍠庨閬嶆煙閹屽殶缂佲槄鎷烽梻浣圭湽閸ㄨ棄顭囪缁傛帡鏁冮崒娑氬幈闂侀潧顭堥崝宥囨兜閻愵兙浜滄い鎰╁灮缁犺尙绱掔紒妯肩畵妞ゎ偅绻堥、姗�鎮欓悧鍫濈厱婵犵數濮烽弫鎼佸磻閻愬搫绠扮紒瀣儥閻掍粙鏌熼悜姗嗘畷闁抽攱甯￠弻娑氫沪閹规劕顥濋梺璺ㄥ枙婵倝骞冮崒姘辨殾闁规壆澧楅崐濠氭煠閹帒鍔氶柨鐔绘濞硷繝寮婚妸鈺佸嵆闁绘劘顕滈幏鐤亹閹烘垹锛熼梺鐟邦嚟婵敻宕伴幇鐗堢厽婵°倧鎷烽柣妤�妫涚划顓㈠箳閺冨倻锛滈梺璺ㄥ枙婵倕顕ラ崟顐ゆ殕閻庯綆鍋勯鍫曟⒑鐠嬪骸鍟崯鐐烘倵濮橆剛绉烘慨濠呮閹瑰嫰濡搁妷锔撅拷铏圭磽娓氬洤鏋熼柣鐔叉櫅椤曪綁顢曢敃锟界粻鑽ょ磽娴ｅ顏勨枔閻斿吋鈷戦梻鍫熶緱濡插爼鏌涙惔鈥宠埞鐞氭瑩鏌涢鐘插姕闁抽攱鍨块弻娑樷槈濮楀牆濮涢梺鐟板暱閸熸挳寮诲☉銏″亜濡炲瀛╅幉鍏肩箾閿濆懏鎼愰柨鏇ㄤ邯閻涱喖顫滈敓浠嬨�佸▎鎾村亗閹艰揪绲垮畷娲⒒閸屾艾锟介娆㈤敓鐘茬煑闊洦绋掗埛鏃堟煕閺囥劌鐏犻柣鎾寸箓椤法鎹勯搹鍦紘缂佹儳褰炵划娆撳蓟濞戞矮娌柛鎾楀嫬娅欓梻浣侯焾缁绘劙鎳熼鐐茬厴闁硅揪瀵岄弫濠囨煟閹伴潧澧慨锝呯墦濮婅櫣鎷犻垾宕囦哗闁诲孩鐭崡鎶藉Υ娴ｇ硶妲堟慨妤�妫欓崓鐢告煛婢跺﹦澧戦柛鏂跨Ч椤㈡瑩寮撮悢铏圭槇閻庡吀鍗抽弨鍗烆熆濮楋拷閺佹捇鎳為妷锔绢槹濡ょ姷鍋涢敃銉╁箚閺冨牆顫呴柣娆欐嫹闁搞們鍊濆铏圭磼濮楀棛鍔风紓渚囧櫘閸ㄥ爼骞冮檱缁犳盯骞欓崘顏勬暩闂佽崵濞�缂傛艾鈻嶉敐鍡樻珷闁哄洢鍨洪悡鏇㈡煛閸愭寧瀚圭紓渚囧枛缁夊爼骞戦姀鐘闁靛繒濮甸妵婵嬫⒑閸涘﹤濮�闁哄懏鐩、鏃堟晸閿燂拷
		new PMoveItemProc(roleId, srckey, number, srcpackid, dstpackid, dstpos,
				page).submit();
	}

	private boolean checkMove(final long roleId) {
		if (srcpackid == BagTypes.QUEST) {
			if (dstpackid != BagTypes.QUEST)
				return false;
		} else {
			if (srcpackid != BagTypes.BAG && srcpackid != BagTypes.DEPOT
					&& srcpackid != BagTypes.TEMP) {
				return false;
			}
			if (dstpackid != BagTypes.BAG && dstpackid != BagTypes.DEPOT) {
				return false;
			}
		}
		return true;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787447;

	public int getType() {
		return 787447;
	}

	public int srcpackid;
	public int srckey;
	public int number;
	public int dstpackid;
	public int dstpos;
	public int page;
	public long npcid;

	public CTransItem() {
		npcid = -1;
	}

	public CTransItem(int _srcpackid_, int _srckey_, int _number_, int _dstpackid_, int _dstpos_, int _page_, long _npcid_) {
		this.srcpackid = _srcpackid_;
		this.srckey = _srckey_;
		this.number = _number_;
		this.dstpackid = _dstpackid_;
		this.dstpos = _dstpos_;
		this.page = _page_;
		this.npcid = _npcid_;
	}

	public final boolean _validator_() {
		if (srcpackid < 1) return false;
		if (srckey < 1) return false;
		if (number < -1) return false;
		if (dstpackid < 1) return false;
		if (dstpos < -1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(srcpackid);
		_os_.marshal(srckey);
		_os_.marshal(number);
		_os_.marshal(dstpackid);
		_os_.marshal(dstpos);
		_os_.marshal(page);
		_os_.marshal(npcid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		srcpackid = _os_.unmarshal_int();
		srckey = _os_.unmarshal_int();
		number = _os_.unmarshal_int();
		dstpackid = _os_.unmarshal_int();
		dstpos = _os_.unmarshal_int();
		page = _os_.unmarshal_int();
		npcid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CTransItem) {
			CTransItem _o_ = (CTransItem)_o1_;
			if (srcpackid != _o_.srcpackid) return false;
			if (srckey != _o_.srckey) return false;
			if (number != _o_.number) return false;
			if (dstpackid != _o_.dstpackid) return false;
			if (dstpos != _o_.dstpos) return false;
			if (page != _o_.page) return false;
			if (npcid != _o_.npcid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += srcpackid;
		_h_ += srckey;
		_h_ += number;
		_h_ += dstpackid;
		_h_ += dstpos;
		_h_ += page;
		_h_ += (int)npcid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(srcpackid).append(",");
		_sb_.append(srckey).append(",");
		_sb_.append(number).append(",");
		_sb_.append(dstpackid).append(",");
		_sb_.append(dstpos).append(",");
		_sb_.append(page).append(",");
		_sb_.append(npcid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CTransItem _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = srcpackid - _o_.srcpackid;
		if (0 != _c_) return _c_;
		_c_ = srckey - _o_.srckey;
		if (0 != _c_) return _c_;
		_c_ = number - _o_.number;
		if (0 != _c_) return _c_;
		_c_ = dstpackid - _o_.dstpackid;
		if (0 != _c_) return _c_;
		_c_ = dstpos - _o_.dstpos;
		if (0 != _c_) return _c_;
		_c_ = page - _o_.page;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(npcid - _o_.npcid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}
