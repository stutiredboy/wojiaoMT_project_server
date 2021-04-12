
package fire.pb.game;

import mkdb.Procedure;

import fire.pb.RoleConfigManager;
import fire.pb.item.Pack;
import fire.pb.product.Commontext;
import fire.pb.talk.MessageMgr;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRoleAccusationCheck__ extends mkio.Protocol { }

/** 举报时候客户端给服务器发消息,用于扣费
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRoleAccusationCheck extends __CRoleAccusationCheck__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid( this );
		if (roleId < 0)
			return;
		new mkdb.Procedure()
		{
			protected boolean process() throws Exception {
				int money = Integer.parseInt(RoleConfigManager.getRoleCommonConfig(332).getValue());
				Pack bag = (Pack) fire.pb.item.Module.getInstance().getItemMaps(roleId,
						fire.pb.item.BagTypes.BAG, false);
				if (money > bag.getMoney()) {
					MessageMgr.sendMsgNotify(roleId, 120025, null);
					return true;
				}
				
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撻柡灞诲劜閺呮悂鏌﹀Ο渚Ц闁跨喕妫勫锟犲Υ娴ｇ硶鏋庨柟鎯х－椤︻參鎮峰鍐閽樻繃銇勯弽銊с�掔紒鐘荤畺閺岀喖骞嗚閸ょ喖鏌涢悢鍝ュ弨闁哄瞼鍠栭幃婊堟嚍閵夛附娈告俊鐐�戦崝濠囧磿閻㈢绠栨繛鍡樻尭缁狙囨煙鐎涙绠ユ繛鍏煎哺濮婄粯鎷呴懞銉ｏ拷鍐煟閹虹偟鐣垫鐐村灴瀹曞爼顢楅敓浠嬪几娓氾拷閺岀喖宕滆鐢盯鏌￠崨顔藉�愰柡灞诲姂閹倝宕掑☉姗嗕紦
				if (bag.subMoney(-money, Commontext.REASON_STRING,
						fire.log.enums.YYLoggerTuJingEnum.tujing_Value_jubao, 0) != -money) {
					MessageMgr.sendMsgNotify(roleId, 120025, null);
					return true;
				}
				
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撻柡灞诲劜閺呮悂鏌﹀Ο渚Ц闁跨喕妫勫锟犲Υ娴ｇ硶鏋庨柟鎯х－閻ｉ箖鎮峰鍐缂侇喕绲荤粻娑㈠棘閸撗呯暰闂備線娼ч悧鍡欐崲閹烘绀嗗ù鐓庣摠閻撴洟鏌ｅΟ鍝勬毐闁告繆娅ｉ敓鑺ヮ問閸ｎ噣宕戞繝鍌滄殾闁绘梻鈷堥弫鍡涙煕鐏炲墽鐭ら柛鐔烽叄濮婄粯鎷呴搹骞匡拷濠囨煕閹惧绠氶柟绛嬪亰閺岋綀绠涢幘瀵割洶闂佸憡锚婢ц棄危閹版澘绠虫俊銈勭娴滃ジ姊洪崨濠佺繁闁搞劌鐤囬埅鐢告⒒閸屾瑧顦﹂柟纰卞亰閹绺界粙璺ㄧ崶闂佸搫绋侀崢濂告嫅閻斿吋鐓曢柕澶樺枛婢ь垶鏌￠崨顔剧疄闁哄被鍔戦幃銏㈡嫚濞堝鎹囬弻锟犲川椤撶姴鐓熷銈冨灪閻燂箓骞堥妸鈺佺疀妞ゅ繐妫涘▔鍨攽閿涘嫬浜奸柛濠冪墵瀹曟繈鏁冮崒姘鳖槶濠殿喗蓱閸炲骞忓畡閭︽僵闁绘劦鍓欓锟�
				Procedure.psendWhileCommit(roleId, new SRoleAccusationCheck(0));
				return true;
			};
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810372;

	public int getType() {
		return 810372;
	}


	public CRoleAccusationCheck() {
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
		if (_o1_ instanceof CRoleAccusationCheck) {
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

	public int compareTo(CRoleAccusationCheck _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

