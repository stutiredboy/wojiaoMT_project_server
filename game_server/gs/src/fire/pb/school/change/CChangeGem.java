
package fire.pb.school.change;
import org.apache.log4j.Logger;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangeGem__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}
// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堝姛缂佺娀绠栭弻銊╂偄鐠囨畫鎾剁磼缂佹鈾侀柟宄版嚇瀹曟﹢宕ｆ径瀣�风紓浣哄亾閸庡啿锕㈤柆宥呯疅闁归棿鐒﹂崑瀣煕椤愶絿绠樻い蹇擃煼濮婅櫣鎹勯妸銉︾亞濠碘槅鍋勭�氭澘鐣烽鐑嗘晬婵鍘у▓顐︽⒑閸涘﹥澶勯柛銊﹀缁鈽夐姀锛勫幈闂佽澹嗛弫鎼佸储濞戞瑤绻嗛柟缁樺笚鐠愶紕绱掓潏銊ョ缂佽鲸甯掕灒闁兼祴鏅濋弶浠嬫煟鎼淬値娼愭繛鍙夌墵閹儵宕楅梻瀵哥畾闂佸綊妫跨粈浣告暜婵＄偑鍊栭悧妤冪矙閹达富鏁傞柛顐ｆ礃閳锋垹绱撴担濮戭亪鎮橀崡鐐╂斀妞ゆ柨鎼敓鑺ョ箞楠炲啴鏁撻悩鍐蹭簻闂佺绻楅崑鎰板储娴犲鈷戦柛婵嗗閿熻棄婀遍敓鐣岀懗閸パ呮焾闂佺粯鍔楅弫鍝ュ婵傚憡鍋ｉ柛婵嗗閹牏绱掗悪娆忔处閻撳繘鏌涢妷鎴濆枤娴煎啴鎮楀▓鍨灍闁瑰憡濞婇妴渚�寮崼婵嗙獩濡炪倖鎸嗛崒婊冾槱
public class CChangeGem extends __CChangeGem__ {
	public static final Logger logger = Logger.getLogger("ITEM");
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		logger.error("-----------------------------濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堝姛缂佺娀绠栭弻銊╂偄鐠囨畫鎾剁磼缂佹鈾侀柟宄版嚇瀹曟﹢宕ｆ径瀣�风紓浣哄亾閸庡啿锕㈤柆宥呯疅闁归棿鐒﹂崑瀣煕椤愶絿绠樻い蹇擃煼濮婅櫣鎹勯妸銉︾亞濠碘槅鍋勭�氭澘鐣烽鐑嗘晬婵鍘у▓顐︽⒑閸涘﹥澶勯柛銊﹀缁鈽夐姀锛勫幈闂佽澹嗛弫鎼佸储濞戞瑤绻嗛柟缁樺笚鐠愶紕绱掓潏銊ョ缂佽鲸甯掕灒闁兼祴鏅濋弶浠嬫煟鎼淬値娼愭繛鍙夌墵閹儵宕楅梻瀵哥畾闂佸綊妫跨粈浣告暜婵＄偑鍊栭悧妤冪矙閹达富鏁傞柛顐ｆ礃閳锋垹绱撴担濮戭亪鎮橀崡鐐╂斀妞ゆ柨鎼敓鑺ョ箞楠炲啴鏁撻悩鍐蹭簻闂佺绻楅崑鎰板储娴犲鈷戦柛婵嗗閿熻棄婀遍敓鐣岀懗閸パ呮焾闂佺粯鍔楅弫鍝ュ婵傚憡鍋ｉ柛婵嗗閹牏绱掗悪娆忔处閻撳繘鏌涢妷鎴濆枤娴煎啴鎮楀▓鍨灍闁瑰憡濞婇妴渚�寮崼婵嗙獩濡炪倖鎸嗛崒婊冾槱--濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堝姛缂佺娀绠栭弻銊╂偄鐠囨畫鎾剁磼缂佹鈾侀柟宄版嚇瀹曟﹢宕ｆ径瀣�风紓浣哄亾閸庡啿锕㈤柆宥呯疅闁归棿鐒﹂崑瀣煕椤愶絿绠樻い蹇擃煼濮婅櫣鎹勯妸銉︾亞濠碘槅鍋勭�氭澘鐣烽鐑嗘晬婵鍘у▓顐︽⒑閸涘﹥澶勯柛銊﹀缁鈽夐姀锛勫幈闂佽澹嗛弫鎼佸储濞戞瑤绻嗛柤纰卞墯閸わ拷闁兼寧鍔欓弻娑㈠Ψ閹存繄啸闁告凹鍋婇幃妤冩喆閸曨剛鈹涚紓浣虹帛缁诲牓鎮伴鐣岀懝闁跨喍绮欏顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷-"+tanzhuangKey+"--婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘垵娲ｇ欢鐢告⒑閹肩偛锟芥牕煤閻旂厧钃熸繛鎴欏焺閺佸啴鏌ㄥ┑鍡橆棤闁挎稒锕㈠铏规崉閵娿儲鐏嗗┑鈽嗗亜鐎氭澘鐣烽鐐茬骇闁瑰濮靛▓鐐節闂堟稑锟藉鈥﹂崼銉稏闁告稑鐡ㄩ悡鐔镐繆椤栨氨浠㈤柣銊ユ惈闇夋繝濠忔嫹闁告濞婂濠氭晲閸℃ê鍔呴梺鎸庣箓濡厽绂掕濮婇缚銇愰幒婵囶棖闂佺绻戦敃銏狀嚕鐠囨祴妲堥柕蹇曞Т瀹撳棝姊洪棃娑辩劸闁稿酣浜堕敐鐐哄煛閸涱喒鎷洪梺鍛婄☉閿曘儳浜搁鐘电＝鐎广儱鎷戝銉︺亜椤愩垻绠荤�规洦鍋婂畷婵嬪磹閻斿壊浠╅梺褰掝棑婵烇拷鐎规洩绲惧鍕沪閻撳寒妫滃┑鐘殿暜缁辨洟宕戦幋锕�纾归柕鍫濐槸绾惧鏌涢弴銊ヤ簮闁哄绉归弻銊╂偆閸屾稑顏�-"+xilianshiTypeId+"-----------------------------");
		new PChangeGem(roleId, tanzhuangKey, xilianshiTypeId).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810491;

	public int getType() {
		return 810491;
	}

	public int gemkey; // 要转换宝石的itemKey
	public int newgemitemid; // 要转换宝石的itemId

	public CChangeGem() {
	}

	public CChangeGem(int _gemkey_, int _newgemitemid_) {
		this.gemkey = _gemkey_;
		this.newgemitemid = _newgemitemid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(gemkey);
		_os_.marshal(newgemitemid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		gemkey = _os_.unmarshal_int();
		newgemitemid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangeGem) {
			CChangeGem _o_ = (CChangeGem)_o1_;
			if (gemkey != _o_.gemkey) return false;
			if (newgemitemid != _o_.newgemitemid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += gemkey;
		_h_ += newgemitemid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(gemkey).append(",");
		_sb_.append(newgemitemid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CChangeGem _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = gemkey - _o_.gemkey;
		if (0 != _c_) return _c_;
		_c_ = newgemitemid - _o_.newgemitemid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

