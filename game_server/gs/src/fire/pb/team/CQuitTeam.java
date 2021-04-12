
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CQuitTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忓爼鏌ｆ惔銈庢綈婵炲弶锕㈠畷婵嬪冀椤愩倗鐒块梺鍦劋濡垿骞忛悜鑺ユ櫜闁告侗鍨划鐢告⒑閸濆嫭濯煎ù婊庝邯楠炲啫鐣￠柇锔惧弳闂佸憡鍔︽禍鐐侯敊閸ヮ剚鐓曟俊銈呮噸閹查箖鏌″畝锟介崰鏍箖瑜斿畷濂告偄閸濆嫬娈ョ紓鍌氬�烽懗鑸靛垔鐎靛摜绀婂〒姘炬嫹鐎殿喖顭锋俊鎼佸煛娴ｈ櫣娼夐梻浣规偠閸庡崬螞濞嗘垶鏆滈柨鐔哄Х瀹撲線鏌熼幍顔碱暭闁哄懐顭堥湁闁绘ê妯婇崕鎰版煃闁垮绗掗棁澶愭煥濠靛棛澧涙い蹇曞█閹粙顢涘☉姘垱闂佸搫鐭夌槐鏇熺閿旂偓瀚氶柟缁樺俯閻庢挳姊绘担鍛婃儓闁硅櫕鎹囧畷娲冀椤撶偟鐣鹃梺鍝勫暙閻楀﹪寮查弻銉︾厱闁靛鍨哄▍鍥煕閺傝法鍩ｆ慨濠勭帛閹峰懘鎳為妷褋锟藉﹪姊洪棃鈺冪Ф缂佺姵鎹囬悰顔跨疀濞戞瑦娅㈤梺璺ㄥ櫐閹凤拷
 * @author changhao
 *
 */
public class CQuitTeam extends __CQuitTeam__ {
	@Override
	protected void process() {
		// protocol handle
		final long leverRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if(leverRoleId >0){
			new PQuitTeamProc(leverRoleId).submit();
		}
	}
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794440;

	public int getType() {
		return 794440;
	}


	public CQuitTeam() {
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
		if (_o1_ instanceof CQuitTeam) {
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

	public int compareTo(CQuitTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

