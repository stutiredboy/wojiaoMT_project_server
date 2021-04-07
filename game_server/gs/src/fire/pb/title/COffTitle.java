
package fire.pb.title;


import fire.pb.PropRole;
import fire.pb.battle.livedie.LiveDieMange;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __COffTitle__ extends mkio.Protocol { }

/** 客户端请求卸下称谓
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class COffTitle extends __COffTitle__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0 || !fire.pb.StateCommon.isOnline(roleid))
			return;
		if (checkCOfftitle(roleid))
			new POnTitleProc(roleid, -1).submit();
	}
	
	public boolean checkCOfftitle(long roleid){
		fire.pb.PropRole prole = new fire.pb.PropRole(roleid, true);
		Role role = RoleManager.getInstance().getRoleByID(roleid);
		if(role != null){
			if(isLiveDieTitle(prole)){
				fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 162120, null);
				return false;
			}
//			if(isFactionTitle(prole)){
//				fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 144142, null);
//				return false;
//			}
		}
		
		return true;
		
	}
	
	/**
	 * 闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�搁埞鎴︽偐鐎圭姴顥濈紓浣瑰姈椤ㄥ﹪寮婚悢绋款嚤闁哄鍨抽崰濠囨⒑鏉炴壆顦︽俊顐ｇ箞瀵鎮㈤搹鍦紲闂侀潧绻掓慨鐢告倶閸垻纾藉ù锝呮惈椤庢挾绱掗懠顒�浜剧紒宀冮哺缁绘繈宕堕懜鍨珫婵犳鍠楅敃鈺呭礈濮樿泛纾规い鏍仦閳锋垵霉閸忚偐鎳呯紒澶樺墮闇夋繝濠傞婢х増淇婇崣澶婂妤犵偞甯￠獮妯虹暦閸モ晝宓侀梻浣筋嚙閸戠晫绱為崱娑樼；闁糕剝绋戠粈鍕煥閻斿搫校闁稿鍓濈换婵囩節閸屾稑娅ｅ銈忕到閵堟悂骞冨Δ鍐當婵炴垶蓱閸ｄ粙鏌ｉ鐔烘噧妞ゎ叀娉曢幑鍕瑹椤栨粌褰嗛梻浣告啞閼归箖顢栨径鎰摕婵炴垯鍩勯弫鍐煥濠靛棙宸濋柣锝夋涧铻栭柣姗�娼ф禒婊勩亜閹存繍妯�鐎殿喖顭烽弫鎰緞鐎ｎ亷鎷烽悜鑺ョ厸濠㈣泛顑呴悘銉︽叏閿濆懐澧︽慨濠呮缁瑥鈻庨幆褍澹堥梻浣烘嚀閸熷潡鏌婇敐鍜冭�垮ù锝囩《閺�浠嬫煟閹邦厽缍戦柣蹇ョ畵閺岋綁鎮㈠┑鍡樻悙闁绘挻绻堥弻銊╂偆閸屾稑顏�?
	 * @param prole
	 * @return
	 */
	public static boolean isLiveDieTitle(PropRole prole){
		if(prole.getTitleID() == LiveDieMange.getLiveDieTitle()){
			return true;
		}
		return false;
	}
	
	
/*	private boolean isFactionTitle(PropRole prole) {
		if(prole.getTitleID() >= fire.pb.clan.Constant.FACTION_MASTER_TITLE && prole.getTitleID() <= fire.pb.clan.Constant.FACTION_MEMBER_TITLE)
			return true;
		return false;
	}*/

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 798437;

	public int getType() {
		return 798437;
	}


	public COffTitle() {
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
		if (_o1_ instanceof COffTitle) {
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

	public int compareTo(COffTitle _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

