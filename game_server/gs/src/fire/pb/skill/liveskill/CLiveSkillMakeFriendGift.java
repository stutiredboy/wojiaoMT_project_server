
package fire.pb.skill.liveskill;




import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.main.ConfigManager;
import fire.pb.skill.SSkillError;
import fire.pb.skill.SkillConstant;
import fire.pb.util.BagUtil;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveSkillMakeFriendGift__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愬弶鐤勫┑掳鍊х徊浠嬪疮椤栫偛鍚归柟閭﹀幑娴滄粓鏌″鍐ㄥ闁活厼鐬肩槐鎺楀箟鐎ｎ剛鏆犻柧缁樼墵閺屻劌鈹戦崱妯烘闂佸搫妫欓悷鈺呭蓟閻斿吋鍎岄柛娑橈工椤忥拷?
 * @author changhao
 *
 */
public class CLiveSkillMakeFriendGift extends __CLiveSkillMakeFriendGift__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure liveskillmakefriendgift = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				int skilllevel = 1;
				
				fire.pb.skill.SLifeSkill config = ConfigManager.getInstance().getConf(fire.pb.skill.SLifeSkill.class).get(LiveSkillManager.LIVE_SKILL_TYPE_MAKE_FRIEND_GIFT);
				
				if (config == null)
				{
					LiveSkillManager.logger.error("CLiveSkillMakeFriendGift config error:" + LiveSkillManager.LIVE_SKILL_TYPE_MAKE_FRIEND_GIFT);
					
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return true;						
				}
				
				fire.pb.skill.SLifeSkillCost cost = ConfigManager.getInstance().getConf(fire.pb.skill.SLifeSkillCost.class).get(skilllevel);
				if (cost == null)
				{
					LiveSkillManager.logger.error("CLiveSkillMakeFriendGift skill level error:" + skilllevel);
					
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return true;					
				}
				
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(roleid, LiveSkillManager.LIVE_SKILL_TYPE_MAKE_FRIEND_GIFT, 
						skilllevel,"濠电姷鏁告慨鐑藉极閸涘﹦绠鹃柨鐔诲Г缁绘稒鎷呴崘鍙夋悙缁炬儳缍婇弻锕�螣閻氬绀嗗┑鐐村灟閸ㄥ湱绮堢�ｎ偁浜滈柟浼存涧娴滄粍绻涢崼娑樺婵﹥妞藉畷銊︾節閸曨厾绐楅梻浣侯焾鐎涒晜绻涙繝鍥х畾鐎癸拷閸曨偄鑰垮┑鐐村灦閻熝囧储閹�鏀介柣鎰摠缂嶆垶銇勯幋婵囶棞闁宠绉瑰畷銊э拷娑欘焽閸樻捇姊洪崨濠傜仧闁稿﹥鐗滈敓鑺ョ啲閹凤拷", YYLoggerTuJingEnum.tujing_Value_friendgive, false);
				
				if (energyenough == false) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓闁搞劌鍊块弻锝夊閻樺啿鏆堥梺绋款儏椤戝寮婚妸鈺傚亞闁稿本绋戦锟�?濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氬綊鏌熼崜褏甯涢柛濠傛健閺屻劑寮撮悙璇ф嫹閸涘鏀伴梻鍌欒兌缁垶寮婚妸鈺佽Е閻庯綆鍠楅崑鍌炴煛閸ャ儱鐏柣鎾卞劦閺岋綁寮撮悙璇ф嫹閸︻叏鎷峰鐐? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.EnergyNotEnough));
					return true;						
				}				
				
				int added = BagUtil.addItem(roleid, LiveSkillManager.ITEM_TYPE_FRIEND_GIFT, 1, LiveSkillManager.MakeStuff, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_tongxinjie, 1, true);
				
				if (1 != added)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.UnkownError));
					return false;						
				}
				
				SLiveSkillMakeFriendGift msg = new SLiveSkillMakeFriendGift();
				msg.itemid = LiveSkillManager.ITEM_TYPE_FRIEND_GIFT;
				mkdb.Procedure.psendWhileCommit(roleid, msg);	
				
				return true;
			}
		};
		
		liveskillmakefriendgift.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800523;

	public int getType() {
		return 800523;
	}


	public CLiveSkillMakeFriendGift() {
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
		if (_o1_ instanceof CLiveSkillMakeFriendGift) {
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

	public int compareTo(CLiveSkillMakeFriendGift _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

