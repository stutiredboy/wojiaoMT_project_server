
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
				// 闁告瑦鍨�?娓氾拷娴滈箖宕楅柨瀣棟闁搞儳鍋涢崹顏嗘偘?
				SItemRecoverList send = new SItemRecoverList();

				// 闂侇偅淇虹换鍍癳y闁革负鍔屽ú鏍绩閸撲胶褰插☉鎿冨幗婢规﹢宕氶弶娆惧殸閹煎瓨姊诲▓鎴︽焼閹惧啿寰�
				xbean.Itemrecoverlist itemRecoverList = xtable.Itemrecover.get(roleId);
				if (itemRecoverList != null) {
					long now = System.currentTimeMillis();
					java.util.List<Long> removeList = new java.util.LinkedList<Long>();
					for (Long uniqId : itemRecoverList.getUniqids()) {
						xbean.DiscardItem ditem = xtable.Itemrecyclebin.select(uniqId);
						if (ditem != null) {
//							// 闁告帇鍊栭弻鍥及椤栨碍鍎婇弶鈺佹处濠�锟�,濠碘�冲�归悘澶嬫交閸ャ劍鍩傞悘蹇撳綁缁楀宕�?
//							fire.pb.item.ItemShuXing attr = Module.getInstance().getItemManager().getAttr(ditem.getItem().getId());
//							if (attr == null) {
//								Module.logger.error("[CItemRecoverList] roleId:" + roleId
//										+ " itemId:" + ditem.getItem().getId()
//										+ " uniqId:" + ditem.getItem().getUniqueid()
//										+ " ItemShuXing not found!");
//								continue;
//							}
//							long day = attr.getRecycletime(); // 濞ｅ洦绻勯弳锟介柡鍐ㄧ埣濡拷:濠㈠灈鏅滈弳锟�
//							long validTime = day * 24L * 3600L * 1000L; // 濞ｅ洦绻勯弳锟介柡鍐ㄧ埣濡拷:婵綆鍋嗛～妤呭极?
//							long elapseTime = now - ditem.getDeletedate(); // 閺夆晛娲ら獮鎾诲籍閸洘锛�:婵綆鍋嗛～妤呭极?
//							long remainTime = validTime - elapseTime; // 闁告挴鏅欑紞鎴﹀籍閸洘锛�:婵綆鍋嗛～妤呭极?
							long remainTime = ditem.getDeletedate() - now;
							if (remainTime > 0) {
								int cost = -1; // -1:閻炴稏鍔庨妵姘柦閳╁啯绠掗弶鈺傜懁闁叉粓鏌嗛幘鍐插緮闁汇劌瀚伴崢銈囩磾?
								ItemShuXing itemAttrConf = Module.getInstance().getItemManager().getAttr(ditem.getItem().getId());
								if (itemAttrConf != null) {
									cost = itemAttrConf.getRecovercost();
								}
								ItemRecoverInfoBean info = new ItemRecoverInfoBean();
								info.itemid = ditem.getItem().getId();
								info.uniqid = uniqId;
								info.remaintime = (int) (remainTime / 1000); // 闁告挴鏅欑紞鎴﹀籍閸洘锛�:缂佸甯楅弳锟�
								info.cost = cost;
								send.items.add(info);
							}
						} else {
							// 缂佸顭峰▍搴ㄥ籍閻樿櫕娅忛柣锟�?
							removeList.add(uniqId);
						}
					}
					// 缂佸顭峰▍搴ㄥ籍閻樿櫕娅忛柣銊ュ閸亞鎮�?
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

