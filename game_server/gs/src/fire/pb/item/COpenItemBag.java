
package fire.pb.item;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __COpenItemBag__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К缂傚倷鑳舵慨閿嬬箾閿熶粙鏌″畝锟介崰鏍х暦濠婂棭妲鹃柣銏╁灡閻╊垶寮诲☉娆戠瘈闁告侗鍘鹃崢顐︽⒑闁稓鈹掗柛鏂跨焷閻忔帡姊洪崷顓х劸婵炲鍏樻俊鎾箛椤斿墽锛濇繛杈剧到閹碱偄鐨梻浣告啞椤ㄥ棙绻涙繝鍌ゅ殨閻犲洦绁村Σ鍫熶繆椤栫偞鏁遍柡鍌︽嫹闂傚倷绀侀幉鈥趁洪敃鍌氱；闁告洦鍓氶崣蹇涙煛閸モ晛鍓辨繛鎾愁煼閺屾洟宕煎┑瀣碉拷妤�霉濠婂嫮绠栫紒缁樼洴閹崇娀顢楅敓浠嬪几濞戞熬鎷峰▓鍨灈妞ゎ厾鍏橀獮鍐閵堝懎绐涙繝鐢靛Т鐎氼喛鍊村┑鐘茬棄閺夊尅鎷疯瀵板﹥绂掔�ｎ亞鏌堝銈嗙墱閸庢劙寮担鐚存嫹楠炲灝鍔氭い锔垮嵆閸╂盯骞嬮悩鐢碉紳婵炶揪绲介～鏍敂閸℃瑧鐣堕梺鍦劋椤ㄥ棝鎮¤箛娑欑厱妞ゆ劑鍊曢弸鎴︽煕婵犲啫濮夐柨鐔诲Г椤旀牠宕伴弽顓涳拷锕傛倻閽樺鐣洪梺闈涚箞閸婃牠宕戦崒鐐茬閺夊牆澧介幃濂告煛閸℃洖宓嗛柡宀嬬秮閹垽宕妷褏鍘愮紓鍌欑椤﹂亶骞婇幘娲绘晪闁挎繂顦伴幆鐐淬亜閹板墎鎮肩紒澶婄埣濮婃椽宕橀崣澶嬪創濡炪倖鍨靛Λ娑㈡晸閼恒儴澹樼紓宥咃躬瀵鏁愭径濠庢綂闂侀潧鐗嗗Λ娆撴煥椤撶儐娓婚柕鍫濈箳閸掍即鏌涘顒夊剱缂佸矁椴哥换婵嬪炊閼稿灚娅囬梻渚�娼х换鎺撴叏闂堟稈鏋斿┑鐘崇閸婂灚绻涢崼婵堜虎闁哄绋掗妵鍕敇閵忊剝鏆犳繛锝呮搐閿曨亪骞婂鍫燁棃婵炴垶姘ㄩ悰顔尖攽閻樺灚鏆╁┑顔碱嚟閿熻姤鑹鹃崲鎻掑祫婵炲鍘ч悺銊╁煕閹烘嚚褰掓晲閸噥妫勫銈冨劚缁夋挳鈥﹂崸妤佸仭闁规鍠栭。娲⒑瀹曞洨甯涢柡灞诲姂閸┿儲寰勯幇顒夋綂闂佸啿鎼崐鐟扳枍閸℃ü绻嗛柣鎰典簻閿熻姤鐗犻獮鎰板醇閺囩偛鐎┑鐐叉▕娴滄繈宕戦崒鐐寸厽闁哄啫鍊哥敮鍓佺磼閻樿尙绉虹�殿喖鐖煎畷鐓庘攽閸″繑瀵栫紓鍌欑椤﹂亶寮繝姘摕闁跨喓濮撮獮銏′繆椤栨繂浜归柣鎾愁樀濮婃椽宕崟顓犱紘闂佸摜濮甸悧鏇㈡偩瀹勬壋鏋庨柟鐐窞瑜旈弻娑㈠焺閸愮偓顓规繛瀵搞�嬮幏锟� by changhao
public class COpenItemBag extends __COpenItemBag__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId == -1)
			return;
		
		PEnhancementTimeout p = new PEnhancementTimeout(roleId);
		p.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787655;

	public int getType() {
		return 787655;
	}


	public COpenItemBag() {
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
		if (_o1_ instanceof COpenItemBag) {
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

	public int compareTo(COpenItemBag _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

