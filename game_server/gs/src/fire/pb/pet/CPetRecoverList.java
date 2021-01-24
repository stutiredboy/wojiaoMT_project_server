
package fire.pb.pet;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CPetRecoverList__ extends mkio.Protocol { }

/** 客户端请求宠物找回列表
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CPetRecoverList extends __CPetRecoverList__ {
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				// 闁告瑦鍨�?娴ｅ摜鏋冮柣妞绘櫆婢规﹢宕堕悙鎻掔仚閻烇拷?
				SPetRecoverList send = new SPetRecoverList();

				// 闂侇偅淇虹换鍍癳y闁革负鍔屽ú鏍绩閸撲胶褰插☉鎿冨幗婢规﹢宕氶弶娆惧殸閹煎瓨姊诲▓鎴狅拷鍦Х婢э拷
				xbean.Petrecoverlist petRecoverList = xtable.Petrecover.get(roleId);
				if (petRecoverList != null) {
					java.util.List<Long> removeList = new java.util.LinkedList<Long>();
					long now = System.currentTimeMillis();
					for (Long uniqId : petRecoverList.getUniqids()) {
						xbean.DiscardPet dpet = xtable.Petrecyclebin.select(uniqId);
						if (dpet != null) {
							// 闁告帇鍊栭弻鍥及椤栨碍鍎婇弶鈺佹处濠�锟�,濠碘�冲�归悘澶嬫交閸ャ劍鍩傞悘蹇撳綁缁楀宕�?
							long day = fire.pb.pet.Module.OUTTIME_OF_PET; // 濞ｅ洦绻勯弳锟介柡鍐ㄧ埣濡拷:濠㈠灈鏅滈弳锟�
							long validTime = day * 24L * 3600L * 1000L; // 濞ｅ洦绻勯弳锟介柡鍐ㄧ埣濡拷:婵綆鍋嗛～妤呭极?
							long elapseTime = now - dpet.getDeletedate(); // 閺夆晛娲ら獮鎾诲籍閸洘锛�:婵綆鍋嗛～妤呭极?
							long remainTime = validTime - elapseTime; // 闁告挴鏅欑紞鎴﹀籍閸洘锛�:婵綆鍋嗛～妤呭极?
							if (remainTime > 0) {
								int cost = -1; // -1:閻炴稏鍔庨妵姘柦閳╁啯绠掗弶鈺傜懁闁叉粎锟藉湱濮锋晶鍧楁儍閸曨垰甯崇紓锟�?
								PetAttr petAttrConf = Module.getInstance().getPetManager().getAttr(dpet.getPet().getId());
								if (petAttrConf != null) {
									cost = petAttrConf.getRecovercost();
								}
								PetRecoverInfoBean info = new PetRecoverInfoBean();
								info.petid = dpet.getPet().getId();
								info.uniqid = uniqId;
								info.remaintime = (int) (remainTime / 1000); // 闁告挴鏅欑紞鎴﹀籍閸洘锛�:缂佸甯楅弳锟�
								info.cost = cost;
								send.pets.add(info);
							}
						} else {
							// 缂佸顭峰▍搴ㄥ籍閻樿櫕娅忛柣锟�?
							removeList.add(uniqId);
						}
					}
					// 缂佸顭峰▍搴ㄥ籍閻樿櫕娅忛柣銊ュ閸亞鎮�?
					petRecoverList.getUniqids().removeAll(removeList);
				}
				mkdb.Procedure.psendWhileCommit(roleId, send);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788583;

	public int getType() {
		return 788583;
	}


	public CPetRecoverList() {
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
		if (_o1_ instanceof CPetRecoverList) {
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

	public int compareTo(CPetRecoverList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

