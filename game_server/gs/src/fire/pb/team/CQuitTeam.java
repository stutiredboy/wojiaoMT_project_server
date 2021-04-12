
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CQuitTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繐鐖奸弻锝嗘償閵堝孩缍堝┑鐐插级閿曘垹鐣峰┑瀣唨妞ゆ劑鍊楅悞鍧楁⒑閸︻厼鍔嬫俊顐ｅ灴楠炲繘鎮滈懞銉︽珳闂佸憡渚楅崹顖滃垝閻㈠憡鈷戦柛婵嗗婵厧霉濠婂簼閭鐐插暙閻ｏ繝鏌囬敂鎯у汲闂備礁鎲￠崝锔界閻愪警鏁婇柛銉墯閻撴洘淇婇妶鍛櫢闁规煡绠栭弻鈥崇暆閿熶粙宕伴弽顓炵畺鐟滄柨鐣锋總鍛婂亜闁告繂瀚▓銉х磽閸屾艾锟界兘鎳楅懜闈涘灁閻庨潧鎽滅粈濠傘�掑鐐閻庢鍠栭…閿嬩繆閹间礁鐓涘ù锝堟濞煎姊绘担瑙勫仩闁稿骸宕灋婵炲棙鍨堕弳婊堟煥閻斿搫啸鐎规挷绶氶弻鐔煎箥椤旂⒈鏆梺鍝勬噽椤牓婀侀梺缁樏Ο濠囧磿閹扮増鐓冮梺鍨儏缁楁帡妫佹径鎰叆婵犻潧妫涙晶娑欍亜韫囨洖鈻堥柟顔荤矙椤㈡稑鈽夊顓炲灡闂備礁鎼惌澶屾閺囩喓顩烽柨鏃傚亾鐎氭岸鏌熺紒妯轰刊闁诲孩鎸冲缁樻媴閸涘﹥鍎撻梺纭呮珪閹瑰洤鐣峰ú顏勫唨妞ゆ挾鍋熼悾楣冩⒑閸濆嫬鏆欓柣妤�锕鏌ュ蓟閵夛妇鍘遍梺闈涱槶閸ㄥ搫鈻嶉崶顒佺厱闁哄倽娉曢崺锝嗘叏婵犲嫮甯涢柟宄版嚇閹崇偤濡疯閿熻棄锕娲閳哄啰肖缂備胶濮甸幑鍥偘椤旇法鐤�婵炴垶鐟﹀▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹
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

