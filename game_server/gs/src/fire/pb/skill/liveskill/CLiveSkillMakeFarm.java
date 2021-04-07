
package fire.pb.skill.liveskill;

import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.DataInit;
import fire.pb.RoleConfigManager;
import fire.pb.common.SCommon;
import fire.pb.item.Pack;
import fire.pb.main.ConfigManager;
import fire.pb.skill.SSkillError;
import fire.pb.skill.SkillConstant;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveSkillMakeFarm__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰▕閻掕姤绻涢崱妯诲碍閻熸瑱绠撻幃妤呮晲鎼粹剝鐏堢紓渚婃嫹濠㈣埖鍔栭悡娑氾拷瑙勬惄閸犳牜绮旈悜鑺ユ櫢闁芥ê顦伴崑銉╂煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�
 * @author changhao
 *
 */
public class CLiveSkillMakeFarm extends __CLiveSkillMakeFarm__ {
	@Override
	protected void process() {
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);	
		if (roleid < 0)
			return;
		mkdb.Procedure liveskillmakefarm = new mkdb.Procedure()
		{			
			@Override
			protected boolean process()
			{
				int skilllevel = 1;
				int money = 100;
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(roleid, 
						LiveSkillManager.LIVE_SKILL_TYPE_MAKE_FARM, skilllevel,"闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛濠呭煐閹便劌螣閹稿海銆愮紓浣哄С閸楁娊寮诲☉妯锋婵鐗嗘导鎰渻閵堝棙绀嬪ù婊冪埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷",
						YYLoggerTuJingEnum.tujing_Value_dagong, false);
				
				if (energyenough == false) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓闁搞劌鍊块弻锝夊閻樺啿鏆堥梺绋款儏椤戝寮婚妸鈺傚亞闁稿本绋戦锟�?濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氬綊鏌熼崜褏甯涢柛濠傛健閺屻劑寮撮悙璇ф嫹閸涘鏀伴梻鍌欒兌缁垶寮婚妸鈺佽Е閻庯綆鍠楅崑鍌炴煛閸ャ儱鐏柣鎾卞劦閺岋綁寮撮悙璇ф嫹閸︻叏鎷峰鐐? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.EnergyNotEnough));
					return true;						
				}
				
				Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, false);
				
				if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽顐粶缂侊拷婢跺绻嗛柕鍫濇噺閸ｅ湱绱掗悩闈涒枅闁哄瞼鍠栭獮鍡氼槾闁挎稑绉归弻锟犲幢椤撶姷鏆ゅ┑顔硷攻濡炰粙銆佸Δ鍛櫢闁伙絽鐬奸惌鎾绘倵閻㈠憡浜ら柟宄板槻椤繈顢楁径瀣撱劑姊虹捄銊ユ灆婵☆偄瀚划璇差吋婢跺﹦锛熼梻渚囧墮缁夊绮婚悩璇茬闁圭⒈鍘鹃崢婊呯磽瀹ュ棛澧甸柡灞炬礋瀹曠厧鈹戦幇顓壯囨⒑缂佹ɑ灏版繛鑼枛瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷? by changhao
				{
					fire.pb.fushi.SCommonDayPay cost = ConfigManager.getInstance().getConf(fire.pb.fushi.SCommonDayPay.class).get(7);
					money = cost.getServerdata();
					
					//濠电姷鏁告慨鐑藉极閸涘﹥鍙忔い鎾卞灩缁狀垶鏌涢幇闈涙灈鐎瑰憡绻冮妵鍕箻鐎靛摜鐣奸梺纭咁潐濞叉牠鍩為幋锔藉亹闁归绀侀弲閬嶆⒑閸濄儱校鐎癸拷缁嬭法鏆﹂柟杈剧畱鍥存繝銏ｆ硾閿曘劑骞楅弴銏″仭婵犲﹤鍟扮粻缁橆殽閻愭潙鐏寸�规洜鍠栭、娑樷槈濞嗗繐濮冮梻浣藉吹婵潙煤閻樼粯鏅搁柛濠勫枎閻ㄨ櫣绱掗敓浠嬫晸閿燂拷 by changhao
					if(bag.addSysMoney(money, LiveSkillManager.MakeFarm, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuiyaofang, 0) != money)
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;					
					}		
				}
				else
				{
					final fire.pb.common.SCommon cc = fire.pb.RoleConfigManager.getRoleCommonConfig(109);
					money = Integer.parseInt(cc.getValue());
					
					//濠电姷鏁告慨鐑藉极閸涘﹥鍙忔い鎾卞灩缁狀垶鏌涢幇闈涙灈鐎瑰憡绻冮妵鍕箻鐎靛摜鐣奸梺纭咁潐濞叉牠鍩為幋锔藉亹闁归绀侀弲閬嶆⒑閸濄儱校鐎癸拷缁嬭法鏆﹂柟杈剧畱鍥存繝銏ｆ硾閿曘劑骞楅弴銏″�甸柣褍鎲＄�氬綊姊洪崨濠冨闁稿妫濋、姗�宕崟銊︽杸闂佺粯顭囩划顖氣槈瑜旈弻锝呂旀担铏圭厑闁诲酣娼ч妶鎼佸极閹剧粯鏅搁柨鐕傛嫹 by changhao
					if(bag.subGold(money, LiveSkillManager.MakeFarm, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuiyaofang, 0) != money)
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;					
					}					
				}
				
				SLiveSkillMakeFarm msg = new SLiveSkillMakeFarm();
				msg.addgold = money;
				mkdb.Procedure.psendWhileCommit(roleid, msg);					
		
				return true;
			}
		};
		
		liveskillmakefarm.submit();
		
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800527;

	public int getType() {
		return 800527;
	}


	public CLiveSkillMakeFarm() {
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
		if (_o1_ instanceof CLiveSkillMakeFarm) {
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

	public int compareTo(CLiveSkillMakeFarm _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

