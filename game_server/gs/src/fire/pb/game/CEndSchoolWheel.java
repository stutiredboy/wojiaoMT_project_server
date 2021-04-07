
package fire.pb.game;

import java.util.ArrayList;
import java.util.List;

import fire.pb.team.TeamManager;
import fire.pb.util.BagUtil;
import fire.pb.util.MessageUtil;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CEndSchoolWheel__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CEndSchoolWheel extends __CEndSchoolWheel__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid <= 0) return;
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				TeamManager.getTeamByRoleId(roleid);//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐婵犵绻濆褑鐏掗梺绋跨箳閳峰牓宕戦妸銉㈡斀妞ゆ梹鏋绘笟娑㈡煕鎼达絾鏆柡浣瑰姈瀵板嫮锟斤綆鍋呴悵鏇㈡⒒娴ｈ棄袚闁挎碍銇勯敂璺ㄧ煓鐎规洜鏁婚弫鎾绘晸閿燂拷?
				List<Long> list = new ArrayList<Long>();
				list.add(roleid);
				lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, list));//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐婵犵绻濆褑鐏掗梺鍏肩ゴ閺呮繈鎮為崗鑲╃閺夊牆澧界粔顒佺箾閸滃啰鎮肩紒顔肩墛缁绘繈宕堕妸銉嫹閻㈠憡鐓ユ繝闈涙椤庢鏌＄�ｎ偆銆掔紒杈ㄥ浮閺佹挻绂掔�ｎ亪鍞跺銈庡亽閸犳锟芥俺顫夐〃銉╂倷閼碱兛铏庨梺鍛婃⒐瀹�鎼佸蓟閿濆憘鏃�鎷呴搹鍦帎婵＄偑鍊ら崢鐓幟洪銏犳瀬闁瑰墽绮崑鎰拷瑙勬礀濞层倝鐛锟藉缁樻媴閼恒儳銆婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�?
				xbean.SchoolWheel schoolWheel = xtable.Openschoolwheeltable.get(roleid);
				if (schoolWheel == null) {
					return false;
				}
				
				WheelAwardItem awardItem = GameManager.getInstance().getAwardItem(GameManager.SCHOOLWHEEL, schoolWheel.getItemindex());
				if (awardItem == null)
					return false;
				
				int realAdd = BagUtil.addItem(roleid, awardItem.itemid, awardItem.itemnum, "schoolwheel", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_rollschoolwheel, awardItem.itemid);
				
				if (realAdd == awardItem.itemnum) {
					MessageUtil.psendAddItemWhileCommit(roleid, awardItem.itemid, realAdd);
				}
				
				int mustAdd = 0;
				if (awardItem.mustitem > 0)
					mustAdd = BagUtil.addItem(roleid, awardItem.mustitem, awardItem.mustnum, "schoolwheel", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_rollschoolwheel, awardItem.mustitem);
				if (mustAdd > 0 && mustAdd == awardItem.mustnum) {
					MessageUtil.psendAddItemWhileCommit(roleid, awardItem.mustitem, mustAdd);
				}
				
				xtable.Openschoolwheeltable.remove(roleid);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810365;

	public int getType() {
		return 810365;
	}


	public CEndSchoolWheel() {
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
		if (_o1_ instanceof CEndSchoolWheel) {
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

	public int compareTo(CEndSchoolWheel _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

