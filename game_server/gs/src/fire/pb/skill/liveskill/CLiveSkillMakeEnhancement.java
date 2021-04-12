
package fire.pb.skill.liveskill;
import java.util.ArrayList;
import java.util.List;

import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.item.AddItemResult;
import fire.pb.item.BagTypes;
import fire.pb.item.Pack;
import fire.pb.talk.MessageMgr;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveSkillMakeEnhancement__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮诲☉妯锋斀闁告洦鍋勬慨鐑芥⒑閻熸澘妲婚柛銏＄叀閿濈偛鈹戠�ｎ偄浜楅柟鑲╄ˉ濡插懎顭囨ィ鍐┾拻濞达綀濮ょ涵鍫曟煕閻樿櫕绀冮柟渚垮姂婵¤埖寰勭�ｎ亜澹掓俊鐐�栧ú鈺呭箯妞嬪函鎷风憴鍕┛缂佺粯绻堥悰顔芥償閵婏箑鐧勬繝銏ｆ硾閻ジ寮抽锝囩瘈闁汇垽娼ф禒婊勪繆椤栨熬鏀荤紒鍌氱Т閳规垹锟斤綆浜為敍娑㈡⒑閸涘﹥澶勯柛銊╀憾閹繝鎮㈤崗鑲╁幍闂佺顫夐崝鏍偟椤忓牊鐓欓柣褍鎽滅粙濠氭煏閸パ冾伃闁轰礁鍊婚幏鐘荤叓椤撶偞鐎冲┑鐘愁問閸犳牠鏁冮妷銉富闁芥ê顦遍弳锔姐亜閹板墎鐣辩紒锟界�ｎ偁浜滈柟鎹愭硾娴滃綊鏌涘▎娆戠瘈婵﹦绮幏鍛存嚍閵夛綇鎷烽崘顏嗙＜闁跨喕濮ょ粭鐔兼晸娴犲宓佹俊銈忔嫹妞ゎ厹鍔戝畷銊╊敇閻愬吀鍠婂┑鐘垫暩閸嬫稑螞濞嗘挸绠板┑鐘宠壘閻ら箖鏌熼梻瀵稿妽闁绘挶鍎甸弻锝夊即閻愯鎷烽崷顓ㄦ嫹濮樼偓瀚�
 * @author changhao
 *
 */
public class CLiveSkillMakeEnhancement extends __CLiveSkillMakeEnhancement__ {
	@Override
	protected void process() {
		// protocol handle

		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure liveskillmakeenhancement = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				xbean.Properties prop = xtable.Properties.select(roleid);
				int school = prop.getSchool();
				
				int skilllevel = LiveSkillManager.getInstance().GetEnhanceLevelBySchool(roleid, school);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垹顭峰缁樻媴閻熼偊鍤嬪┑鐐插级閻楃姴鐣烽幇顖樹汗闁圭儤鍨归敍娑㈡煟鎼搭垳绉甸柛鐘愁殜閹�斥槈閵忥紕鍘遍梺闈涱槶閸ㄥ搫鈻嶉崨鏉戝唨闁炽儲鍓氬〒濠氭煏閸繃顥滃┑顔煎暟缁辨帡顢欓悾灞惧櫑濡炪値鍋勭换鎰弲濡炪倕绻愮粔鐢稿疾閵忋倖鈷戦悹鎭掑妼閺嬫棃鏌￠崪浣镐簽闁告帗甯″顕�宕奸悢铚傜紦缂傚倷绀侀鍛存倶濠靛绠氶柣鎰劋閳锋垹绱掔�ｎ厽纭堕柣蹇涗憾閺屾稓锟斤綆鍓欐禒杈╋拷瑙勬礃閸旀瑥鐣锋總绋垮嵆闁绘柨鎼獮妤呮⒒娴ｅ摜绉洪柛瀣躬瀹曡娼忛埡鍌氬幑闂佽鍨奸悘鎰版偡闁妇鍙嗛梺鍛婂姦娴滅偞顨欓梻鍌欑閹碱偊鎯屾径宀�绀婂〒姘炬嫹妤犵偛鍟存慨锟介柍钘夋鏁堥梺纭呭閹活亪宕ｆ繝鍥╅柍鍝勫�甸幏娲⒑閸涘﹦绠撻悗姘煎櫍閹﹢鏌嗗鍡欏幈闂佺粯锚绾绢厽鏅堕悽纰夋嫹濞堝灝娅橀柛瀣躬閻涱喖螣閼测晝锛滃┑鈽嗗灣缁垶顢旈悢鍏尖拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟濮濆瞼鐤�闁哄啫鍊昏ぐ楣冩⒑閸濆嫭鍌ㄩ柛鈺佸瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎼惈娆撳礃閻愵剙鐦滈梻渚�娼ч悧鍡椢涘Δ浣瑰弿鐟滄柨顫忔繝姘妞ゆ劑鍩勬导鍐倵鐟欏嫭绀冮柛銊﹀娣囧﹪鎳滈棃娑氱獮闁诲函缍嗛崜娆撶嵁瀹ュ鈷戦悹鍥у级閹癸綁鏌℃担瑙勫�愰柍銉畵瀹曠厧鈹戦崶銊ф濠电姷鏁告慨鐑姐�傞挊澹╋綁宕ㄩ弶鎴狅紱闂佽宕橀褏绮婚鐐寸叆闁绘洖鍊圭�氾拷?  by changhao
				if (skilllevel == 0)
				{
					LiveSkillManager.logger.debug("CLiveSkillMakeEnhancement skilllevel error:" + roleid);
					return true;
				}
				
				int liveskillid = LiveSkillManager.getInstance().GetEnhanceLiveSkillBySchool(school);
				int itemid = LiveSkillManager.getInstance().GetEnhanceItemIdBySchool(school);
							
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(roleid, 
						liveskillid, skilllevel,"闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮诲☉妯锋斀闁告洦鍋勬慨鐑芥⒑閻熸澘妲婚柛銏＄叀閿濈偛鈹戠�ｎ偄浜楅柟鑲╄ˉ濡插懎顭囨ィ鍐┾拻濞达綀濮ょ涵鍫曟煕閻樿櫕绀冮柟渚垮姂婵¤埖寰勭�ｎ亜澹掓俊鐐�栧ú鈺呭箯妞嬪函鎷风憴鍕┛缂佺粯绻堥悰顔芥償閵婏箑鐧勬繝銏ｆ硾閻ジ寮抽锝囩瘈闁汇垽娼ф禒婊勪繆椤栨熬鏀荤紒鍌氱Т閳规垹锟斤綆浜為弻褔姊鸿ぐ鎺擄紵闁绘帪绠撻幃锟犲Ψ閳哄倻鍘介梺鍝勬川閸嬫盯鏁撻挊澶嬭础闁跨喕濮ら悢顒勫箯閿燂拷", YYLoggerTuJingEnum.tujing_Value_fumo, false);
				
				if (energyenough == false) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鏁愭径濠庢綂闂佺粯锚閸熷潡寮抽崼銉︹拺缂佸顑欓崕蹇斻亜閹存繍妯�鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柟缁㈠枟閸庡顭块懜闈涘缂佺嫏鍥ㄧ厱闁哄秲鍊曟晶鏌ユ倵濮橆剛绉洪柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑欑節閸屾稑浠撮梺鍝勮閸旀垵顕ｉ幘顔藉�烽悹鍥囧嫬顏堕梺鍛婄☉椤剟寮ㄦ导瀛樷拻闁稿本鐟ㄩ崗宀�绱掗鍛仸鐎殿喖顭锋俊鎼佸煛娴ｅ彨鏇㈡煟鎼搭垳绉甸柛鐘愁殜瀹曟垿宕掗悙瀵稿幐闂佹悶鍎崕閬嶆倶椤忓牊鐓熼柟鎯у船閸旓箓鏌″畝瀣М鐎殿喗鎸抽幃娆戞嫚瑜庣�氬綊鏌涢敂璇插伎闁瑰嘲鍢查～婵嬫倷椤掞拷椤忥拷? by changhao
				{
					java.util.List<String> parameters = new java.util.ArrayList<String>();
					String s = Integer.toString(LiveSkillManager.getInstance().NeedEnergy(liveskillid, skilllevel));
					parameters.add(s);
					MessageMgr.psendMsgNotify(roleid, 143432, parameters);
					return true;						
				}							
				
				Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, false);
								
				SLiveSkillMakeEnhancement msg = new SLiveSkillMakeEnhancement();
				
				fire.pb.item.groceries.AttrUpItem item = (fire.pb.item.groceries.AttrUpItem)fire.pb.item.Module.getInstance().getItemManager().genItemBase(itemid, 1);
				item.GenAttr(skilllevel);
				
				if (bag.isFull())
				{
					fire.pb.item.ItemMaps tempBag = fire.pb.item.Module.getInstance().getItemMaps(roleid, BagTypes.TEMP, false);
					if (tempBag.doAddItem(item, -1, LiveSkillManager.Enhancement, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_fumoget, 2) != AddItemResult.SUCC)
					{
						return false;
					}
				}
				else
				{
					if(bag.doAddItem(item, -1, LiveSkillManager.Enhancement, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_fumoget, 2) != AddItemResult.SUCC)
					{
						return false;
					}						
				}
				
				List<String> param = new ArrayList<String>();
				param.add(item.getName());
				param.add("ffffff00");
				MessageMgr.psendMsgNotify(roleid, 150107, param);				
				mkdb.Procedure.psendWhileCommit(roleid, msg);
				
				return true;
			}
		};
		
		liveskillmakeenhancement.submit();			
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800525;

	public int getType() {
		return 800525;
	}


	public CLiveSkillMakeEnhancement() {
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
		if (_o1_ instanceof CLiveSkillMakeEnhancement) {
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

	public int compareTo(CLiveSkillMakeEnhancement _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

