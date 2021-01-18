
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
				// 閸欐垿?渚�浜鹃崗閿嬪閸ョ偛鍨悰?
				SItemRecoverList send = new SItemRecoverList();

				// 闁俺绻僰ey閸︺劌娲栭弨鍓佺彲娑擃厽澹橀崚鏉款嚠鎼存梻娈戦柆鎾冲徔
				xbean.Itemrecoverlist itemRecoverList = xtable.Itemrecover.get(roleId);
				if (itemRecoverList != null) {
					long now = System.currentTimeMillis();
					java.util.List<Long> removeList = new java.util.LinkedList<Long>();
					for (Long uniqId : itemRecoverList.getUniqids()) {
						xbean.DiscardItem ditem = xtable.Itemrecyclebin.select(uniqId);
						if (ditem != null) {
//							// 閸掋倖鏌囬弰顖氭儊鏉╁洦婀�,婵″倹鐏夋潻鍥ㄦ埂鐏忓彉绗夐崣?
//							fire.pb.item.ItemShuXing attr = Module.getInstance().getItemManager().getAttr(ditem.getItem().getId());
//							if (attr == null) {
//								Module.logger.error("[CItemRecoverList] roleId:" + roleId
//										+ " itemId:" + ditem.getItem().getId()
//										+ " uniqId:" + ditem.getItem().getUniqueid()
//										+ " ItemShuXing not found!");
//								continue;
//							}
//							long day = attr.getRecycletime(); // 娣囨繄鏆�閺冨爼妫�:婢垛晜鏆�
//							long validTime = day * 24L * 3600L * 1000L; // 娣囨繄鏆�閺冨爼妫�:濮ｎ偆顫楅弫?
//							long elapseTime = now - ditem.getDeletedate(); // 鏉╁洤骞撻弮鍫曟？:濮ｎ偆顫楅弫?
//							long remainTime = validTime - elapseTime; // 閸撯晙缍戦弮鍫曟？:濮ｎ偆顫楅弫?
							long remainTime = ditem.getDeletedate() - now;
							if (remainTime > 0) {
								int cost = -1; // -1:鐞涖劎銇氬▽鈩冩箒鏉╂瑤閲滈柆鎾冲徔閻ㄥ嫰鍘ょ純?
								ItemShuXing itemAttrConf = Module.getInstance().getItemManager().getAttr(ditem.getItem().getId());
								if (itemAttrConf != null) {
									cost = itemAttrConf.getRecovercost();
								}
								ItemRecoverInfoBean info = new ItemRecoverInfoBean();
								info.itemid = ditem.getItem().getId();
								info.uniqid = uniqId;
								info.remaintime = (int) (remainTime / 1000); // 閸撯晙缍戦弮鍫曟？:缁夋帗鏆�
								info.cost = cost;
								send.items.add(info);
							}
						} else {
							// 缁夊娅庨弮鐘虫櫏閻�?
							removeList.add(uniqId);
						}
					}
					// 缁夊娅庨弮鐘虫櫏閻ㄥ嫬鍨悰?
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

