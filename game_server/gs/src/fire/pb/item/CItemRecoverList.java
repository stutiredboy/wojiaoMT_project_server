
package fire.pb.item;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CItemRecoverList__ extends mkio.Protocol { }

/** 客户端请求道具找回列表
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CItemRecoverList extends __CItemRecoverList__ {
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;

		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				// 鍙戦?侀亾鍏锋壘鍥炲垪琛?
				SItemRecoverList send = new SItemRecoverList();

				// 閫氳繃key鍦ㄥ洖鏀剁珯涓壘鍒板搴旂殑閬撳叿
				xbean.Itemrecoverlist itemRecoverList = xtable.Itemrecover.get(roleId);
				if (itemRecoverList != null) {
					long now = System.currentTimeMillis();
					java.util.List<Long> removeList = new java.util.LinkedList<Long>();
					for (Long uniqId : itemRecoverList.getUniqids()) {
						xbean.DiscardItem ditem = xtable.Itemrecyclebin.select(uniqId);
						if (ditem != null) {
//							// 鍒ゆ柇鏄惁杩囨湡,濡傛灉杩囨湡灏变笉鍙?
//							fire.pb.item.ItemShuXing attr = Module.getInstance().getItemManager().getAttr(ditem.getItem().getId());
//							if (attr == null) {
//								Module.logger.error("[CItemRecoverList] roleId:" + roleId
//										+ " itemId:" + ditem.getItem().getId()
//										+ " uniqId:" + ditem.getItem().getUniqueid()
//										+ " ItemShuXing not found!");
//								continue;
//							}
//							long day = attr.getRecycletime(); // 淇濈暀鏃堕棿:澶╂暟
//							long validTime = day * 24L * 3600L * 1000L; // 淇濈暀鏃堕棿:姣鏁?
//							long elapseTime = now - ditem.getDeletedate(); // 杩囧幓鏃堕棿:姣鏁?
//							long remainTime = validTime - elapseTime; // 鍓╀綑鏃堕棿:姣鏁?
							long remainTime = ditem.getDeletedate() - now;
							if (remainTime > 0) {
								int cost = -1; // -1:琛ㄧず娌℃湁杩欎釜閬撳叿鐨勯厤缃?
								ItemShuXing itemAttrConf = Module.getInstance().getItemManager().getAttr(ditem.getItem().getId());
								if (itemAttrConf != null) {
									cost = itemAttrConf.getRecovercost();
								}
								ItemRecoverInfoBean info = new ItemRecoverInfoBean();
								info.itemid = ditem.getItem().getId();
								info.uniqid = uniqId;
								info.remaintime = (int) (remainTime / 1000); // 鍓╀綑鏃堕棿:绉掓暟
								info.cost = cost;
								send.items.add(info);
							}
						} else {
							// 绉婚櫎鏃犳晥鐨?
							removeList.add(uniqId);
						}
					}
					// 绉婚櫎鏃犳晥鐨勫垪琛?
					itemRecoverList.getUniqids().removeAll(removeList);
				}
				mkdb.Procedure.psendWhileCommit(roleId, send);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787793;

	public int getType() {
		return 787793;
	}


	public CItemRecoverList() {
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
		if (_o1_ instanceof CItemRecoverList) {
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

	public int compareTo(CItemRecoverList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

