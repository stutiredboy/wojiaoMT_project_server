
package fire.pb.mission;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqMissionCanAccept__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqMissionCanAccept extends __CReqMissionCanAccept__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid( this );
		if ( roleid < 0 )
			return;
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬姘卞闂佹眹鍨归…宄邦潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙鎻掔骇闁绘濮撮悾鐑藉箛閺夎法顔愭繛杈剧悼椤牓鎮楅銏♀拺缂佸娉曢悘閬嶆煕鐎ｎ剙浠遍柟顕嗙節婵＄兘鍩￠崒婊冨箺闂備礁鎼ú銊╁磻濞戙垺鏅搁柦妯侯槹鐠愶繝鏌ㄩ悢璇残撻柣鏃戝墴楠炲繘鏁撻敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ鐐电磽娴ｇ晫鍫柛濠冪箞瀵鈽夊搴⑿梻渚�娼уú锕傛儎椤栫偛鏋侀柟鎹愵嚙濡﹢鏌曢崼婵囧窛闁哄棎鍊濋幃妤冩喆閸曨剛顦ラ梺闈涚墕閹诧繝骞堥妸鈺傛櫢濞寸姴顑嗛悡鍐煏婢舵稓鐣卞褜鍨堕弻銊╂偄鐠囨畫鎾绘煟閳哄﹤鐏犳い顐㈢箰鐓ゆい蹇撳缁卞爼姊洪崨濠冨闁革綆鍠栭…鍥醇閺囩啿鎷虹紓浣割儏閻忔繈顢楅姀銈嗙厽闁瑰灝瀚弧锟藉Δ鐘靛仜閸熸挳宕规ィ鍐ㄦ闁靛濡囬敓钘夘煼濮婅櫣鎲撮崟顐㈠Б濡炪倖娲﹂崣鍐ㄧ暦閵忋倖顥堟繛鎴ｉ哺鐎靛矂姊洪棃娑氬婵☆偅鐟ф禍鎼佹偨閸涘﹦鍘遍梺缁樏鍫曞箲閿濆洨纾兼い鏇炴噹瀵喗顨ラ悙鏉戠瑨閾绘牕霉閿濆懏鎯堟鐐茬墦濮婄粯鎷呴崨濠冨創闂佸摜濮甸惄顖炵嵁韫囨稒鍊婚柤鎭掑劤閸樹粙姊虹紒妯荤叆鐎殿喛娉涢埢宥嗙節閸曡埖瀚规繛鍫濈仢閺嬫稒銇勯鐘插幋妤犵偛鍟存慨锟介柕鍫濇濞堟劙姊虹�圭姵銆冮柤鍐茬埣婵″爼鏁冮崒娑掓嫽婵炶揪绲块…鍫ニ夎箛娑欑厽闁规儳纾晶锔撅拷瑙勬礃濠㈡﹢锝炲┑瀣垫晣闁绘垵妫楀▓濂告⒒娴ｇ顥忛柛瀣╃窔瀹曟洟寮婚妷銉э紮闂佹眹鍨归幉锟犲磻閳╁啰绠鹃柛鈩冾殘缁犵増銇勮箛锝勭敖缂佽鲸甯炴禒锕傛嚍閵夈儰娣梻浣告惈閻ジ宕伴弽褏鏆︽繛鍡樻尭鍥撮梺绯曞墲椤ㄥ繑瀵奸敓锟�?
		SReqMissionCanAccept send = new SReqMissionCanAccept();
		Module.getInstance().getCanAcceptMission( roleid, send.missions );
		gnet.link.Onlines.getInstance().send( roleid, send );
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805456;

	public int getType() {
		return 805456;
	}


	public CReqMissionCanAccept() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqMissionCanAccept) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqMissionCanAccept _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

