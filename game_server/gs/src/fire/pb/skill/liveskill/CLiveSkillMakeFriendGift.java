
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
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顒�绾ч柣銈呭閳规垶骞婇柛濞у懎绶ゅù鐘差儏閻ゎ喗銇勯弽顐粶闁告艾缍婇弻鐔兼焽閿曪拷楠炴垵霉濠婂嫮鐭掗柡灞革拷鎰佸悑闁告劑鍔岄‖瀣⒑濞茶骞栭柣顒冨亹濡叉劙骞掑Δ锟界粻鐔兼倵閿濆骸澧伴柡鍡欏█閺屟呯磼濡厧鈷岄梺鍝勮閸斿矂鍩為幋锕�骞㈡俊顖滃劋椤忕娀姊绘担鍛婃儓婵☆偅鐟╅幃鐑藉煛閸涱叀鎽曢梺缁樻煥閸氬宕曞畝鍕厱婵炴垶锕銉︺亜韫囥儲瀚�?
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
						skilllevel,"濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堝姛缂佺娀绠栭弻銊╂偄鐠囨畫鎾剁磼缂佹鈾侀柟宄版嚇瀹曟﹢宕ｆ径瀣�风紓浣哄亾閸庡磭绱炴繝鍥ц摕闁挎洩鎷烽摶锝夋煟濮橆剦鍤熺紒锟介崱妞绘斀闁绘劖娼欓悘鐔兼煕閵娿儲璐＄紒顔肩墢閿熸枻缍嗛崑浣圭濠婂牊鐓欏ù鐓庣摠濞懷兠瑰鍕煁缂佺粯鐩畷鐓庘槈濡警娼庢繝娈垮枛閿曘儱顪冮挊澶屾殾闁靛濡囩弧锟介梺鍛婃处閸樺墽绮ｅΔ鍛拻濞达絼璀﹂悞楣冩倵濞戞帗娅嗙紒缁樼♁缁绘繈宕惰閻ｉ箖鎮楅惂鍛婂闂佸憡娲﹂崑鍕嚀閸喒鏀介柣鎰綑閻忥箓鏌ｉ悢婵嗘搐閸屻劑鏌熼鍡嫹闁猴拷娴犲鐓熼柟閭﹀墰閹界姷绱撳鍡楃仸闁靛洤瀚伴獮瀣攽閸ヨ埖顥ｉ梻浣哥枃椤曆呯矓閻熸壆鏆﹂柕濞у秵瀚规繛鎴炵懐閻掍粙鏌涘Ο缁樺磳婵﹥妞藉畷銊︾節閸屾粈鎴烽梻浣侯焾閿曘儵鎮у鍫熸櫢闁兼亽鍎抽崯鏌ユ煙閸戙倖瀚�", YYLoggerTuJingEnum.tujing_Value_friendgive, false);
				
				if (energyenough == false) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鏁愭径濠庢綂闂佺粯锚閸熷潡寮抽崼銉︹拺缂佸顑欓崕蹇斻亜閹存繍妯�鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柟缁㈠枟閸庡顭块懜闈涘缂佺嫏鍥ㄧ厱闁哄秲鍊曟晶鏌ユ倵濮橆剛绉洪柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑欑節閸屾稑浠撮梺鍝勮閸旀垵顕ｉ幘顔藉�烽悹鍥囧嫬顏堕梺鍛婄☉椤剟寮ㄦ导瀛樷拻闁稿本鐟ㄩ崗宀�绱掗鍛仸鐎殿喖顭锋俊鎼佸煛娴ｅ彨鏇㈡煟鎼搭垳绉甸柛鐘愁殜瀹曟垿宕掗悙瀵稿幐闂佹悶鍎崕閬嶆倶椤忓牊鐓熼柟鎯у船閸旓箓鏌″畝瀣М鐎殿喗鎸抽幃娆戞嫚瑜庣�氬綊鏌涢敂璇插伎闁瑰嘲鍢查～婵嬫倷椤掞拷椤忥拷? by changhao
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

