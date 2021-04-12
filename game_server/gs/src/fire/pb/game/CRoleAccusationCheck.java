
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
				
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡╂Ч濞存嚎鍊濋弻銈夊级閹稿骸浠村┑顔硷攻濡炰粙銆佸Δ鍛櫢闁伙絽鐬奸惌鎾绘煛鐏炶鍔滈柡鍛倐閺岋箑螣娓氼垱笑闂佽法鍠曞Λ鍕焽閿熺姴违濞达絿纭堕弸搴ㄦ煙閹咃紞妞わ富鍙冮幃宄邦煥閸愵亞顔掗柦妯荤箖閵囧嫰寮介妸褋锟芥帞绱掗悩鑽ょ暫闁哄瞼鍠栭獮鍡氼檨闁搞倗鍠栭弻娑㈡偄閸濄儱寮ㄩ梺鍝勭灱閸犳牠骞冨鍫熷殟闁靛闄勫▓鍛婁繆閻愵亜锟芥垿宕濇繝鍥х？闁汇垻顭堢粻鏍ㄧ箾閸℃ɑ灏紒鐙欏洦鐓欓悗娑欘焽缁犮儲绻涢崗鐓庡摵婵﹦绮幏鍛存嚍閵夛綇鎷烽崘顔界厽闁硅櫣鍋熼悾鍨殽閻愭潙鐏寸�规洖鐖奸、妤呮晸娴犲鍑犲〒姘炬嫹闁哄瞼鍠栧畷婊嗩槾閻㈩垱鐩弻锟犲川椤旇棄锟芥劙鏌＄仦璇插闁诡喓鍊濆畷鎺戔槈濮楀棔绱�
				if (bag.subMoney(-money, Commontext.REASON_STRING,
						fire.log.enums.YYLoggerTuJingEnum.tujing_Value_jubao, 0) != -money) {
					MessageMgr.sendMsgNotify(roleId, 120025, null);
					return true;
				}
				
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡╂Ч濞存嚎鍊濋弻銈夊级閹稿骸浠村┑顔硷攻濡炰粙銆佸Δ鍛櫢闁伙絽鐬奸惌鎾绘煛鐏炶鍔滈柡鍛倐閺岋箑螣娓氼垱笑闂佽法鍠曞Λ鍕焽閿熺姴违濞达絿纭堕弸搴ㄦ煙閹咃紞闁伙綁绠栭幃宄邦煥閸愵亞顔婄紓渚囧枙缁茶崵绮诲☉銏犳闁告挆鍛毎闂傚倷绶氬褔鎮ч崱娆愬床闁圭儤顨呯粈鍡椕归悡搴ｆ憼闁绘挻娲熼弻锝呂熼崫鍕瘣闂佸憡绻嗗▍锝夋晸閼恒儺鍟忛柛锝庡櫍瀹曟垶绻濋崒婊勬闂佺粯姊婚埛鍫ュ极閸℃稒鐓曢悘鐐插⒔閻倝鏌涢悢鐑藉弰婵﹦绮幏鍛存惞楠炲尅鎷锋繝鍥ㄧ厱闁规儳顕粻姘舵煙缁涘浜伴柡宀嬬秬缁犳盯骞樼�靛壊娲堕梻浣告啞閿氬褑妫勫嵄闁圭増婢樼粻铏繆閵堝嫮顦﹀ù婊冦偢濮婃椽宕ㄦ繝浣虹箒闂佹悶鍔岄悿鍥焻閻㈠憡鈷掗柛灞剧懅椤︼箓鏌熺喊鍗炰喊闁诡垰顦扮缓鐣岀矙鐠恒劎宕堕梻浣告惈缁嬩線宕㈡總鍛婂珔闁绘柨鍚嬮悡鏇㈡煏婢舵ê鏋涘褜鍨堕弻锟犲川椤斿墽鐤勯梺鍝勮閸旀垿骞冮姀銏″珰婵炲牆顑嗛幑鍥蓟閿熺姴宸濇い鎾跺Т閻撶喎顪冮妶鍐ㄧ仾闁荤噦绠撻獮鍫ュΩ閳轰胶鐤�濡炪倕绻愬Λ娑樷枖閸喒鏀介柨娑樺娴滃ジ鏌涙繝鍐⒌鐎规洘绻堥弫鍐磼濮橀硸妲舵繝娈垮枟钃遍柛鐐差煼楠炲繐鐣￠柇锔藉兊闂佺粯鍔﹂崜娆擃敂閿燂拷
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

