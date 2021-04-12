
package fire.pb.npc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CStartFortuneWheel__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CStartFortuneWheel extends __CStartFortuneWheel__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		fire.pb.map.Npc npc = fire.pb.map.SceneNpcManager.selectNpcByKey(npckey);
		if (npc ==null){
			fire.log.LogManager.logger.info("npc is null.npckey:"+npckey);
			return;
		}
		// protocol handle
		//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁哄喛鎷烽柛銈呯Ч閺屾盯濡烽鐓庘拻闂佽桨绀佸ú顓㈠蓟閺囷紕鐤�闁哄洨鍊姀銈嗙厽閹兼惌鍠栭獮鏍煃鐟欏嫬鐏撮柟顔界懇瀹曪絾寰勯崱妯间簽婵犵數鍋涢悺銊у垝瀹ュ洤鍨濋柟鎹愵嚙缁狀垶鏌熸潏楣冩闁稿瀚埞鎴﹀磼濮樺吋楔闂佸摜鍋熼弫璇差潖濞差亜绀傞柛蹇曞帶閿熻姤鍔栫换娑欐媴閸愭彃顏柛娆忕箻閺屾盯濡烽鐓庮潽闂佺粯鎸鹃崰鏍蓟閺囥垹閱囨繝闈涱儛閿熻姤顨嗙换娑㈠川椤撶姌褔鏌″畝瀣？濞寸媴绠撳畷婊嗩槼闁告帗鐩铏瑰寲閺囩喐鐝旈柣搴㈢濠㈡﹢鎮惧畡閭︽建闁跨喍绮欏畷娲晸閻樿尙顦ㄩ梺缁樺姦閸庣兘鎮欓悜妯锋嫽闂佺鏈悷褔宕濆鍡曠箚闁绘劖娼欓婊呯磼閸屾氨孝闁宠閰ｉ獮瀣攽閸℃瑤鍠婂┑鐘垫暩閸嬫稑螞濞嗘挸绠伴柟闂寸劍鐎氬懘鏌ｉ弬鍨倯闁绘挶鍎茬换婵嬫濞戞瑱绱炲┑鈥冲级閹倿鐛崱娑欏亜闁稿繐鐨烽幏娲⒒閸屾氨澧涘〒姘殔鍗遍柛顐ｆ礃閻撴洟骞栨潏鍓у埌闁告柨顑囩槐鎺楀磼濞戞鐟茬紓浣芥〃缁瑥鐣烽妸锔剧闁绘劦鍓欓褰掓⒒閸屾艾锟芥悂宕愰幖浣瑰亱濠电姴瀚惌娆撴煙閻戞﹩娈旂紒鐘茬秺閺岀喖鏌囬敃锟介獮妯肩磼閻樿崵鐣洪柟顔肩秺瀹曞爼宕惰閸ｄ粙鏌￠崱娆徯㈡い顏勫暣婵¤埖鎯旈垾宕囶啇婵犵數鍋涘Ο濠囧矗閸愵喖违濞撴熬鎷风�殿噮鍣ｅ畷鐓庘攽鐎ｎ亝鏆┑锛勫亼閸婃牠宕濊瀵板﹪骞嗚閺嬪秶锟界櫢鎷烽柛鏇ㄥ厴閹风粯绻涙潏鍓у閻狅拷閿曞倹鍊垮Δ锝呭暞閻撴盯鏌涢顐簻濠⒀勫缁辨帡顢欓悾灞惧櫚濡ょ姷鍋為…鍥╂閹烘嚦鐔虹磼濡厧寤洪梻鍌氬�峰ù鍥р枖閺囥垹闂柨鏇炲�哥粻顖炴煥閻曞倹瀚�
		new PReqFortuneWheel(roleid, npckey,npc.getNpcID(),true,fire.pb.npc.NpcServices.FORTUNE_WHEEL).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795494;

	public int getType() {
		return 795494;
	}

	public long npckey; // 正在交互的Npckey

	public CStartFortuneWheel() {
	}

	public CStartFortuneWheel(long _npckey_) {
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CStartFortuneWheel) {
			CStartFortuneWheel _o_ = (CStartFortuneWheel)_o1_;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CStartFortuneWheel _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

