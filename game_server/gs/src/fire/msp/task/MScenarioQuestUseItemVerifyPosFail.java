
package fire.msp.task;

import fire.pb.mission.SUseMissionItemFail;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __MScenarioQuestUseItemVerifyPosFail__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class MScenarioQuestUseItemVerifyPosFail extends __MScenarioQuestUseItemVerifyPosFail__ {
	@Override
	protected void process() {
		// protocol handle
		// Module.logger.error( "婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐鍛傜喎鈻庨幆褎顔勭紓鍌欒兌婵挳鎮樺璺何﹂柛鏇ㄥ枤閻わ拷闂佸湱鍋撻幆灞轿涢悙鐢电＝濞达絿鏅崼顏堟煕婵犲啰绠炵�殿喖顭烽弫鎰緞鐎ｎ偅鐝抽梻浣告啞娓氭宕归搹顐㈩嚤闁搞儺鍓氶埛鎴炵箾閼奸鍤欐鐐搭殜閺岀喖鎮烽悧鍫濇灎閻庢鍠涢褔鍩ユ径鎰潊闁冲搫鍊瑰▍鍥⒒娴ｇ懓顕滅紒璇插�歌灋婵炴垟鎳為崶顒�惟闁冲搫鍊甸幏铏圭磽娴ｅ壊鍎愭い鎴炵懇瀹曟洖鈽夊Ο蹇曟嚀椤劍鎯斿┑瀣粣闁诲孩顔栭崰娑㈩敋瑜旈崺銉﹀緞閹邦剦娼婇梺缁橈耿濞佳勬叏閸洘鈷掑ù锝呮啞閸熺偤鏌涢弮锟藉ú姗�寮查懜鐢殿浄閻庯綆浜為ˇ顕�姊虹紒妯虹伇濠殿喓鍊濋崺娑㈠箣閻欏懏瀚归悷娆忓缁�锟藉┑鐐茬湴閸斿酣寮灏栨婵炲棙鍔曞鎸庣節閻㈤潧孝闁稿妫濋幃鈩冪附閸涘﹦鍘告繛杈剧秬椤鐣峰畝鍕厵缂佸灏呴弨鑽わ拷鍨緲鐎氼剟鎮惧┑瀣櫢濞寸姴顑呭Ч鍙夌箾閹存瑥鐏柍閿嬪灩缁辨帞锟斤綆浜濋崑銉╂煕濞嗗繐顏╅棁澶嬬節婵犲倸鏆熼柛鈺嬬秮閺岋絽鈽夐崡鐐寸仌缂備胶濮甸惄顖氼嚕閹绢噮鏁傞柛娑卞弾娴兼捇姊绘担鐟邦嚋缂佽鍊归〃銉╁箹娴ｇ鍤戝┑鐐村灟閸ㄦ椽鎮￠弴鐔稿弿婵妫楁晶鎵磼婢跺銇濋柡宀嬬磿娴狅妇鎷犻幓鎺濇綆闂備浇顕栭崰鎾诲磹濠靛棛鏆﹂柟鐑樺灍濡插牊鎱ㄥΔ锟藉Λ鏃傛閿燂拷" );
		SUseMissionItemFail send = new SUseMissionItemFail();
	    gnet.link.Onlines.getInstance().send( roleid, send );
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				xtable.Bagtimelock.remove( roleid );
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 739905;

	public int getType() {
		return 739905;
	}

	public long roleid;
	public int scenarioquestid;
	public int useitemid;

	public MScenarioQuestUseItemVerifyPosFail() {
	}

	public MScenarioQuestUseItemVerifyPosFail(long _roleid_, int _scenarioquestid_, int _useitemid_) {
		this.roleid = _roleid_;
		this.scenarioquestid = _scenarioquestid_;
		this.useitemid = _useitemid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(scenarioquestid);
		_os_.marshal(useitemid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		scenarioquestid = _os_.unmarshal_int();
		useitemid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof MScenarioQuestUseItemVerifyPosFail) {
			MScenarioQuestUseItemVerifyPosFail _o_ = (MScenarioQuestUseItemVerifyPosFail)_o1_;
			if (roleid != _o_.roleid) return false;
			if (scenarioquestid != _o_.scenarioquestid) return false;
			if (useitemid != _o_.useitemid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += scenarioquestid;
		_h_ += useitemid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(scenarioquestid).append(",");
		_sb_.append(useitemid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(MScenarioQuestUseItemVerifyPosFail _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = scenarioquestid - _o_.scenarioquestid;
		if (0 != _c_) return _c_;
		_c_ = useitemid - _o_.useitemid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

