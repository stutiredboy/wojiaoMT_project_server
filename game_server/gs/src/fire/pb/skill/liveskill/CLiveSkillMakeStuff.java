
package fire.pb.skill.liveskill;




import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.item.GroceryItemShuXing;
import fire.pb.main.ConfigManager;
import fire.pb.skill.SSkillError;
import fire.pb.skill.SkillConstant;
import fire.pb.skill.SkillRole;
import fire.pb.util.BagUtil;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveSkillMakeStuff__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎处缁绘繂顕ラ柨瀣凡闁跨喓鐛ら崶褏顔嗛梺缁樺灱婵倝鎮￠妷鈺傜厸闁搞儺鐓侀鍫熷�堕柤纰卞墾閹烽鎲撮崟顒傤槶闂佺绻戦敃銏ゅΥ娴ｅ壊娼ㄩ柨鐔剁矙楠炲啴鍩℃担鍙夌亖闂佸湱顭堝鈺呮晝閸屾稈鎷婚梺绋挎湰閻熝囁囬敃鍌涚厵缁炬澘宕禍鎵拷瑙勬处閸ㄥ爼銆侀弴銏℃櫇闁跨喓鏅竟鏇°亹閹烘挾鍘炬繝娈垮枟閸旀洟鏁撻懞銉畷缂佸顦鍏煎緞鐎ｎ剙寮抽梻浣虹帛濞叉牠宕愰崷顓ㄦ嫹濮樼偓瀚�?
 * @author changhao
 *
 */
public class CLiveSkillMakeStuff extends __CLiveSkillMakeStuff__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure livemakstuff = new mkdb.Procedure()
		{
			@Override
			/*闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鍨傚Δ锝呭暙缁犳稑霉閿濆懏璐＄紒瀣╄兌缁辨捇宕掑顒婃嫹閻戣姤鍊块柨鏇炲�甸敓鏂ょ畵瀹曞爼鍩￠崘褏鐟濆┑掳鍊х徊浠嬪疮椤栫偞鍋傞柕澶嗘櫆閻撶喖鏌￠崒姘变虎妞わ絾濞婇弻锝夘敇閻旂儤鍣伴梺鍝勫閿熻棄纾弳鍡涙倵閿濆骸澧伴柣锕�鐗撳鐑樻姜閹殿喖濡介梺瑙勭摃瀹曠數鍒掔�ｎ喖绠抽柡鍐╂尰鐎氬綊鏌ㄥ┑鍡涱�楀ù婊勭箖缁绘盯宕ㄩ鍓х厜濠殿喖锕ㄥ▍锝夊礌閺嶎厼鍗抽柣鎰ゴ閹枫倝姊绘担鍛婂暈婵﹤婀遍弫顕�鎮欓悜妯烘疅闁哄鐗勯崝搴ｅ姬閿熻棄鈹戦鏂や緵闁告ɑ鎮傞獮蹇撁洪鍛嫼闂佸憡绋戦敃锕傚煡婢舵劖鐓ラ柡鍥朵簻椤╊剛绱掗纰辩吋妤犵偞顭囩槐鎺懳熼悮瀛樺闁割煈鍋呴崣蹇斾繆椤栨粌甯堕悽顖氱埣閺岋紕锟斤絻鍔岄敓鑺ョ箞瀵鈽夐姀鈥充汗闁荤姴娉ч崱妤佸創闂傚倷娴囧銊╂倿閿曞倸绠查柛銉墮閺嬩線鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓 team->roleid->match by changhao*/
			protected boolean process()
			{	
				fire.pb.item.GroceryItemShuXing config = (GroceryItemShuXing) fire.pb.item.Module.getInstance().getItemManager().getAttr(itemid);
				if (config == null)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return true;						
				}
				
				int skillid = LiveSkillManager.getInstance().GetMakeStuffSkillIdByItemId(config);
				if (skillid == 0)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return true;						
				}
				
				SkillRole skillrole = new SkillRole(roleid);
				
				xbean.LiveSkill liveskill = skillrole.getLiveSkills().get(skillid);	//闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冪Ч濠�渚�姊虹紒妯虹伇婵☆偄瀚板鍛婄瑹閿熶粙寮诲☉妯锋婵鐗婇弫鎯р攽閻愬弶鍣藉┑顔肩仛缁岃鲸绻濋崶顬囨煕濞戝崬鏋涙繛鍜冪節濮婅櫣鎹勯妸銉︾亞濠碘槅鍋勭�氭澘鐣烽鐐茬骇闁瑰濮靛▓楣冩⒑闂堟单鍫ュ疾濞戞氨妫憸鏃堝蓟閻旂尨鎷烽悽娈跨劸濞寸媴濡囬幃顕�鏁愭径瀣ф嫼闁荤姴娲ゅ鍫曞箲閿濆棛绠鹃柛娑卞亜閻忓弶顨ラ悙鑼闁诡喗绮撻幊鐐哄Ψ瑜嶉獮鍫ユ⒒娴ｅ憡鎯堟繛灞傚灲瀹曟繄浠﹂悙顒佺彿濡炪倖姊圭粊纭呫亹閹烘挸浜归梺鎯ф禋閸嬩焦绂掗姀鐘斀妞ゆ梻銆嬫Λ姘箾閸滃啰鎮兼俊鍙夊姍楠炴帡骞婂畷鍥ф灈闁圭绻濇俊鍫曞川椤撶喕绶㈤梻鍌氬�搁崐鐑芥嚄閸洏锟戒焦绻濋崶鑸垫櫔濠电姴锕ら幊蹇撶暦閸欏绡�闂傚牊绋掗惌妤冪磼鐠囧弶顥㈤柡宀嬬秮婵拷闁绘ê鍟块弳鍫ユ⒑缁嬫鍎忛悗姘嵆瀵鈽夊鍛澑濠殿喗锕╅崗娑樞уΔ鍛拺闁告稑顭悞浠嬫煛娴ｇ瓔鍤欐い顐㈢箻閹煎湱鎲撮崟顐わ紡闂備線娼ч…鍫ュ磿閺屻儲鍋熼柕蹇嬪�栭埛鎴︽煟閻斿憡绶叉繛鍫氭櫊閺岀喖宕欓妶鍡楊伓?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟濮濆瞼鐤�闁哄啫鍊昏ぐ楣冩⒑閸濆嫭鍌ㄩ柛鈺佸瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎼惈娆撳礃閻愵剙鐦滈梻渚�娼ч悧鍡椢涘Δ浣瑰弿鐟滄柨顫忔繝姘妞ゆ劑鍩勬导鍐倵鐟欏嫭绀冮柛銊﹀娣囧﹪鎳滈棃娑氱獮闁诲函缍嗛崜娆撶嵁瀹ュ鈷戦悹鍥у级閹癸綁鏌℃担瑙勫�愰柍銉畵瀹曠厧鈹戦崶銊ф濠电姷鏁告慨鐑姐�傞挊澹╋綁宕ㄩ弶鎴狅紱闂佽宕橀褏绮婚鐐寸叆闁绘洖鍊圭�氾拷? by changhao			
				if (liveskill == null)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.SkillLevelNotEnough));
					return true;					
				}
				
				int skilllevel = liveskill.getLevel();
				
				int needlevel = LiveSkillManager.getInstance().GetMakeStuffNeedLevelByItemId(config);
				
				if (skilllevel < needlevel)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.SkillLevelNotEnough));
					return true;						
				}
							
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(roleid, skillid, 
						needlevel,"闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備胶濮锋繛锟介柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑欑節閸涱厾鍘梺閫涚┒閸斿矁鐏掗梺鍦焾濞寸兘濡撮幇顔剧＝濞达絽鎼牎濠电姰鍨洪…鍫ユ倶閸愵喗鈷戦柟绋挎捣缁犳捇鏌熼崘鏌ュ弰鐎殿喗鎮傛俊鑸靛緞鐎ｎ剙骞愬┑鐐舵彧缁插潡鈥﹂崼銉晜妞ゆ挶鍨洪悡娑㈡倶閻愰鍤欏┑顔煎�块弻鐔碱敊閸濆嫸鎷峰┑鍡欐殾闁圭儤鍨熷Σ鍫熸叏濡わ拷濡梻妲愰敓锟�", YYLoggerTuJingEnum.tujing_Value_liveskillcost, false);
				
				if (energyenough == false) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鏁愭径濠庢綂闂佺粯锚閸熷潡寮抽崼銉︹拺缂佸顑欓崕蹇斻亜閹存繍妯�鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柟缁㈠枟閸庡顭块懜闈涘缂佺嫏鍥ㄧ厱闁哄秲鍊曟晶鏌ユ倵濮橆剛绉洪柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑欑節閸屾稑浠撮梺鍝勮閸旀垵顕ｉ幘顔藉�烽悹鍥囧嫬顏堕梺鍛婄☉椤剟寮ㄦ导瀛樷拻闁稿本鐟ㄩ崗宀�绱掗鍛仸鐎殿喖顭锋俊鎼佸煛娴ｅ彨鏇㈡煟鎼搭垳绉甸柛鐘愁殜瀹曟垿宕掗悙瀵稿幐闂佹悶鍎崕閬嶆倶椤忓牊鐓熼柟鎯у船閸旓箓鏌″畝瀣М鐎殿喗鎸抽幃娆戞嫚瑜庣�氬綊鏌涢敂璇插伎闁瑰嘲鍢查～婵嬫倷椤掞拷椤忥拷? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.EnergyNotEnough));
					return true;						
				}
				
				int added = BagUtil.addItem(roleid, itemid, itemnum, LiveSkillManager.MakeStuff, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_zhizuofu, 1, true);
				
				if (itemnum != added)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.UnkownError));
					return false;						
				}
				
				SLiveSkillMakeStuff msg = new SLiveSkillMakeStuff();
				msg.ret = 0;
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);
				
				return true;
			}
			
		};
		livemakstuff.submit();	
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800517;

	public int getType() {
		return 800517;
	}

	public int itemid; // 物品的ID by changhao
	public int itemnum; // 物品数量 by changhao

	public CLiveSkillMakeStuff() {
	}

	public CLiveSkillMakeStuff(int _itemid_, int _itemnum_) {
		this.itemid = _itemid_;
		this.itemnum = _itemnum_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(itemid);
		_os_.marshal(itemnum);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		itemid = _os_.unmarshal_int();
		itemnum = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLiveSkillMakeStuff) {
			CLiveSkillMakeStuff _o_ = (CLiveSkillMakeStuff)_o1_;
			if (itemid != _o_.itemid) return false;
			if (itemnum != _o_.itemnum) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += itemid;
		_h_ += itemnum;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(itemid).append(",");
		_sb_.append(itemnum).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CLiveSkillMakeStuff _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = itemid - _o_.itemid;
		if (0 != _c_) return _c_;
		_c_ = itemnum - _o_.itemnum;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

