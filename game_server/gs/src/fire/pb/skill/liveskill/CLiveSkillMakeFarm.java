
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
 * 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍讲鏋欓梺缁樺笩婵倗鎹㈠☉銏犲耿婵☆垵顕х喊宥夋煟閻斿摜鎳曠紒鐘虫崌楠炲啫螖閸涱喗娅滈柟鑲╄ˉ閸撴繈鎮橀崼銏㈢＝濞撴艾锕ョ�氳绻濋姀锝呯厫闁告梹鐗犻幃鈥斥槈濮樼偓瀚归悷娆忓閹嫰鏌涢悩宕囧⒈缂侇喗妫冮幃婊堟嚍閵夛附顏熼梻浣藉Г閿氭い锔垮嵆瀹曟垿濡烽埡鍌滃幐闁诲繒鍋犻褎鎱ㄩ崒鐐寸厵妞ゆ柨鎼敓鑺ョ箓閻ｇ兘骞掗幋鏃�顫嶅┑顔筋殔濡梻妲愰敓锟�
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
						LiveSkillManager.LIVE_SKILL_TYPE_MAKE_FARM, skilllevel,"闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備胶濮锋繛锟介柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑欑節閸涱厾鍘梺閫涚┒閸斿矁鐏掗梺鍦焾濞寸兘濡撮幇顔剧＝濞达絽鎼皬闂佸憡顨嗘繛濠傤嚕鐠囨祴妲堟俊顖炴敱椤秴鈹戦绛嬫當闁绘妫欑�靛ジ骞囬澶嬪瘜闂侀潧鐗嗗Λ娆戠矆鐎ｎ�㈢懓顭ㄩ崘顏勭厽閻庢鍠栭…閿嬩繆閹间礁鐓涢柛灞剧煯缁ㄤ粙姊绘担渚劸闁哄牜鍓涚划娆撳箣閿旂粯鏅滈梺璺ㄥ櫐閹凤拷",
						YYLoggerTuJingEnum.tujing_Value_dagong, false);
				
				if (energyenough == false) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鏁愭径濠庢綂闂佺粯锚閸熷潡寮抽崼銉︹拺缂佸顑欓崕蹇斻亜閹存繍妯�鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柟缁㈠枟閸庡顭块懜闈涘缂佺嫏鍥ㄧ厱闁哄秲鍊曟晶鏌ユ倵濮橆剛绉洪柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑欑節閸屾稑浠撮梺鍝勮閸旀垵顕ｉ幘顔藉�烽悹鍥囧嫬顏堕梺鍛婄☉椤剟寮ㄦ导瀛樷拻闁稿本鐟ㄩ崗宀�绱掗鍛仸鐎殿喖顭锋俊鎼佸煛娴ｅ彨鏇㈡煟鎼搭垳绉甸柛鐘愁殜瀹曟垿宕掗悙瀵稿幐闂佹悶鍎崕閬嶆倶椤忓牊鐓熼柟鎯у船閸旓箓鏌″畝瀣М鐎殿喗鎸抽幃娆戞嫚瑜庣�氬綊鏌涢敂璇插伎闁瑰嘲鍢查～婵嬫倷椤掞拷椤忥拷? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.EnergyNotEnough));
					return true;						
				}
				
				Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, false);
				
				if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�妞ゆ劦婢�缁墎绱撴笟濠冨婵犮垼娉涢鍕崲閸℃稒鐓忛柛顐ｇ箖閸ｆ椽鏌涢敐鍛础缂佽鲸甯￠幃鈺呮濞戞帗鐎伴梻浣告惈閻ジ宕伴弽顓犲祦闁糕剝鍑瑰Σ楣冩⒑閹稿海鈽夌紒澶婄秺瀵鏁撻悩鎻掕�垮銈嗘尵婵兘寮抽妶鍛斀妞ゆ梻銆嬮弨缁樹繆閻愭壆鐭欓柕鍡曠铻栭柛娑卞枟濞呫垽姊烘导娆戝埌闁活剙銈搁幆宀勫箻缂佹ê锟界敻鏌ｉ姀鐘冲暈濞存嚎鍊濋弻鐔风暋閺夋寧些濡炪値鍋呯换鍫ャ�佸Δ浣哥窞閻庯絾鎸堕崝鎴濐潖閾忚宕夐柕濞垮劜閻忓棗鈹戦埥鍡椾簻閻庢凹鍠氶崚鎺旀嫚瀹割喖鎮戞繝銏ｆ硾閿曪箓鏁嶉悢鍏尖拻濞撴艾娲ゆ晶顔剧磼婢跺鍤熺紒顔碱煼閹晝鎷犻懠顒夊晣闂備礁婀遍埛鍫ュ储妤ｅ啫鍌ㄦ繝濠傛噽绾剧晫锟藉箍鍎卞Λ娑欐櫠閻㈠憡鐓涢悘鐐靛亾缁�瀣拷瑙勬礈閸樠囧煘閹达箑绠涙い鎾筹紡閸ャ劉鎷虹紓鍌欑劍钃遍悘蹇曞缁绘盯鎳犻锟介弸娑氾拷娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�? by changhao
				{
					fire.pb.fushi.SCommonDayPay cost = ConfigManager.getInstance().getConf(fire.pb.fushi.SCommonDayPay.class).get(7);
					money = cost.getServerdata();
					
					//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻戦妵鍕箻閸楃偟浠肩紓浣哄閸ㄥ爼寮诲☉銏犵疀闂傚牊绋掗悘鍫ユ倵閻熺増鍟炵紒璇插暣婵＄敻宕熼姘鳖啋闁诲酣娼ч幗婊堟偩婵傚憡鈷戠痪顓炴媼濞兼劖绻涢崣澶屽⒌闁糕晝鍋ら獮瀣晜閽樺姹楅梻浣哥秺椤ｏ妇绮堟笟锟藉鏌ユ焼瀹ュ棌鎷洪梺鍛婄缚閸庤鲸鐗庨柣搴ｆ閹烽绱掔�ｎ厽纭堕柡鍡畵閺岀喐娼忛崜褏鏆犻柛銉ョ摠缁绘繈濮�閿濆棛銆愰梺鎸庢磸閸旀垿鐛Δ鍛嵆闁靛繆锟藉厖鐢绘繝鐢靛Т閿曘倝宕幍顔句笉缂備焦锕╁▓浠嬫煟閹邦厽缍戦柣蹇擃嚟閿熷�燁潐濞叉粓宕伴弽顓滐拷浣糕槈濡攱顫嶅┑鐐叉缁绘劖鎱ㄩ崘顔解拻濞达綀妫勯崥鐟扳攽椤旇姤缍戦悡銈夋煟濡偐甯涢柡鍛倐閺屾稒绻濋崟顐ｇ�婚梺姹囧姀濞咃絿妲愰幒妤佹櫢濞寸姴顑嗛弲鎼佹煥閻曞倹瀚� by changhao
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
					
					//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻戦妵鍕箻閸楃偟浠肩紓浣哄閸ㄥ爼寮诲☉銏犵疀闂傚牊绋掗悘鍫ユ倵閻熺増鍟炵紒璇插暣婵＄敻宕熼姘鳖啋闁诲酣娼ч幗婊堟偩婵傚憡鈷戠痪顓炴媼濞兼劖绻涢崣澶屽⒌闁糕晝鍋ら獮瀣晜閽樺姹楅梻浣哥秺椤ｏ妇绮堟笟锟藉鏌ユ焼瀹ュ棌鎷洪梺鍛婄缚閸庤鲸鐗庨柣搴ｆ閹烽绱掔�ｎ厽纭堕柡鍡畵閺岀喐娼忛崜褏鏆犻柛銉ョ摠缁绘繈濮�閿濆棛銆愰梺鎸庢磸閸旀垿鐛Δ鍛嵆闁靛繆锟界鎷烽悽鍛婄厽鐟滃秹骞夐敍鍕舵嫹濮橆剛绉烘慨濠冩そ瀹曘劍绻濋崘顭戞П闂備胶顭堥鍛涘┑瀣拷浣割潨閿熻棄鐣烽锕�绀嬮柕濠忛檮閺夋悂姊绘担铏瑰笡妞ゎ厼娲ㄩ崚鎺楊敍濮橈絾顫嶉悷婊勬瀵鏁愰崨鍌涙⒐閹峰懘鎼归崷顓炲笒闂備浇顕ч柊锝咁焽瑜旀俊鍫曞箹娴ｅ憡鐎梺鐟板⒔缁垶寮查幖浣圭叆闁绘洖鍊圭�氾拷 by changhao
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

