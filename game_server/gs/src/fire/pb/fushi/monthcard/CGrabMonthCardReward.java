
package fire.pb.fushi.monthcard;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGrabMonthCardReward__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/**
 * 濠电姷鏁告慨鐑藉极閹间礁纾婚柣妯款嚙缁犲灚銇勮箛鎾搭棤缂侊拷婵犲洦鐓ラ柣鏃囶嚙琚氱紓浣虹帛缁嬫帒顕ラ崟顓ㄦ嫹閿濆骸浜炴い锔垮嵆閹鈻撻崹顔界彯闂佺顑呴敃銉︾┍婵犲洦鍤嬮梻鍫熺〒缁愮偤鏌ｆ惔顖滅У濞存粍绻堥幃鎸庢媴闁稓绠氶梺缁樺姦娴滄粓鏁撻懞銉︾闁瑰箍鍨介獮鍥敄閳哄倻鈽夐柍璇查叄楠炴﹢鎼归銉у彂闂傚倷鑳剁划顖炩�﹂崶鈺佸灊妞ゆ牜鍋為崑鍌炴煛閸ャ儱鐏柣鎾寸懇閺岋綁骞嬮悘娲讳邯閹﹢鏁傛慨鎰盎闂侀潧顧�缁蹭粙鎮橀弻銉︾厸閻忕偛澧介埥澶愭懚閿濆洨纾奸悗锝庝簻閻繝鏌熷畡鏉挎Щ闁宠鍨归敓鏂ょ秵娴滐綁骞楅弴銏♀拺缂侇垱娲栨晶鑼磼鐎ｎ偄鐏╃紒顔剧帛缁绘繂顫濋鐘插箞闂備礁缍婇崑濠囧储閼测晛绶ら柤濮愬�楃壕濂告偣娴ｇ瓔娼愰悗姘炬嫹 by changhao
 * @author Administrator
 *
 */
public class CGrabMonthCardReward extends __CGrabMonthCardReward__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
		{
			return;
		}
		
		mkdb.Procedure grabmonthcardreward = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				//xbean.EMonthCard monthcard = xtable.Roleid2monthcard.get(roleid);
				if (true)
				{
					xbean.Properties prop = xtable.Properties.select(roleid);
					if (prop == null)
					{
						return false;
					}
					
					fire.pb.item.Pack bag = (fire.pb.item.Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, false);
					int num = bag.removeItemById(itemid, 1, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard, 0, "闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲搁弮鍫澪ラ柛鎰ㄦ櫆閸庣喖鏌曡箛瀣労婵炲弶鎮傚铏圭磼濡搫顫岄梺鍦拡閸嬪﹤顕ｉ崨濠勭懝闁跨喕妫勯～蹇撁洪宥嗘櫌闂佽法鍠撻弲顐ゅ垝閺冨偊鎷烽棃娑欐喐闁活厼妫濋弻娑㈠焺閸愵亖妾ㄩ梺缁樻尰濞茬喖寮诲澶婄厸濞达絽鎲″▓鍫曟⒑鐎圭姵顥夋い锔炬暬楠炲啯绂掔�ｅ灚鏅┑鐐村灦鑿ら柡瀣懃閳规垿顢欑涵閿嬫暰濠碉紕鍋樼划娆撳Υ娴ｈ倽鏃�鎷呴悷閭︼拷鎾绘⒑閼姐倕鏋戝鐟版閵嗗倿寮婚妷锔规嫽婵炶揪绲介幉锟犲疮閻愮儤鐓熼柣鏃堟？閹茬偓顨ラ悙鑼闁轰焦鎹囬弫鎾绘晸閿燂拷");
					if (num != 1)
					{
						return false;
					}

					if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽顐粶缂侊拷婢跺绻嗛柕鍫濇噺閸ｅ湱绱掗悩闈涒枅闁哄瞼鍠栭獮鍡氼槾闁挎稑绉归弻锟犲幢椤撶姷鏆ゅ┑顔硷攻濡炰粙銆佸Δ鍛櫢闁伙絽鐬奸惌鎾绘倵閻㈠憡浜ら柟宄板槻椤繈顢楁径瀣撱劑姊虹捄銊ユ灆婵☆偄瀚划璇差吋婢跺﹦锛熼梻渚囧墮缁夊绮婚悩璇茬闁圭⒈鍘鹃崢婊呯磽瀹ュ棛澧甸柡灞炬礋瀹曠厧鈹戦幇顓壯囨⒑缂佹ɑ灏版繛鑼枛瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷? by changhao
					{
						fire.pb.fushi.SFreeDisRewardConfigDayPay e = fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.fushi.SFreeDisRewardConfigDayPay.class).get(itemid);
						if (e == null)
						{
							return false;
						}
						
						int count = 0;
						for (Integer id : e.itemids)
						{
							Integer itemnum = rewarddistribution.get(id);
							if (itemnum != null)
							{
								if (bag.isFull())
								{
									fire.pb.item.ItemMaps tempBag = fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.TEMP, false);
									
									if (tempBag.doAddItem(id, itemnum, "闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲搁弮鍫澪ラ柛鎰ㄦ櫆閸庣喖鏌曡箛瀣労婵炲弶鎮傚铏圭磼濡搫顫岄梺鍦拡閸嬪﹤顕ｉ崨濠勭懝闁跨喕妫勯～蹇撁洪宥嗘櫌闂佽法鍠撻弲顐ゅ垝閺冨偊鎷烽棃娑欐喐闁活厼妫濋弻娑㈠焺閸愵亖妾ㄩ梺缁樻尰濞茬喖寮诲澶婄厸濞达絽鎲″▓鍫曟⒑鐎圭姵顥夋い锔炬暬楠炲啯绂掔�ｅ灚鏅┑鐐村灦鑿ら柡瀣懃閳规垿顢欑涵閿嬫暰濠碉紕鍋樼划娆撳Υ娴ｈ倽鏃�鎷呴悷閭︼拷鎾绘⒑閼姐倕鏋戝鐟版閵嗗倿寮婚妷锔规嫽婵炶揪绲介幉锟犲疮閻愮儤鐓熼柣鏃堟？閹茬偓顨ラ悙鑼闁轰焦鎹囬弫鎾绘晸閿燂拷", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != itemnum)
									{
										return false;
									}
								}
								else
								{
									if (bag.doAddItem(id, itemnum, "闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲搁弮鍫澪ラ柛鎰ㄦ櫆閸庣喖鏌曡箛瀣労婵炲弶鎮傚铏圭磼濡搫顫岄梺鍦拡閸嬪﹤顕ｉ崨濠勭懝闁跨喕妫勯～蹇撁洪宥嗘櫌闂佽法鍠撻弲顐ゅ垝閺冨偊鎷烽棃娑欐喐闁活厼妫濋弻娑㈠焺閸愵亖妾ㄩ梺缁樻尰濞茬喖寮诲澶婄厸濞达絽鎲″▓鍫曟⒑鐎圭姵顥夋い锔炬暬楠炲啯绂掔�ｅ灚鏅┑鐐村灦鑿ら柡瀣懃閳规垿顢欑涵閿嬫暰濠碉紕鍋樼划娆撳Υ娴ｈ倽鏃�鎷呴悷閭︼拷鎾绘⒑閼姐倕鏋戝鐟版閵嗗倿寮婚妷锔规嫽婵炶揪绲介幉锟犲疮閻愮儤鐓熼柣鏃堟？閹茬偓顨ラ悙鑼闁轰焦鎹囬弫鎾绘晸閿燂拷", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != itemnum)
									{
										return false;
									}
								}												
							}
						}
						
						if (count > e.getNum()) //闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊瑜滃ù鏍煏婵炲灝鍔存繛鎾愁煼閺岀喖鎮滃鍡樼暥缂佺虎鍙忛幏鐑芥⒒娴ｇ瓔娼愰柛搴ｅ帶铻為柛鏇ㄥ灡閳锋帗銇勯弽顐沪闁绘搫缍侀悡顐﹀炊閵娿儱姣堝┑鐐插悑閸旀瑩寮婚悢纰辨晬婵☆垰鎼慨锕傛⒑閸濆嫭婀扮紒瀣灴閸┿儲寰勬繛銏㈠枛瀹曟宕楅悡搴㈢亪婵犵绱曢崑鎴﹀磹閺囩媴鎷峰☉鎺撴珚闁诡喚鍏橀崺锟犲川椤撯剝鎲版繝鐢靛仦閸垶宕瑰ú顏勭柧闁归棿鐒﹂悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�? 闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�哥粻鏍煕椤愶絾绀�缁炬儳娼￠弻鐔煎箚閻楀牜妫勭紒鐐劤椤兘寮婚敐澶婄疀闁绘鐗婇柨顓㈡⒑閹肩偛濡界紒璇茬墦瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷 by changhao
						{
							return false;
						}
					}
					else
					{
						fire.pb.fushi.SFreeDisRewardConfig e = fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.fushi.SFreeDisRewardConfig.class).get(itemid);
						if (e == null)
						{
							return false;
						}
						
						int count = 0;
						for (Integer id : e.itemids)
						{
							Integer itemnum = rewarddistribution.get(id);
							if (itemnum != null && itemnum > 0)
							{	
								count += itemnum;
								
								if (bag.isFull())
								{
									fire.pb.item.ItemMaps tempBag = fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.TEMP, false);
									
									if (tempBag.doAddItem(id, itemnum, "闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲搁弮鍫澪ラ柛鎰ㄦ櫆閸庣喖鏌曡箛瀣労婵炲弶鎮傚铏圭磼濡搫顫岄梺鍦拡閸嬪﹤顕ｉ崨濠勭懝闁跨喕妫勯～蹇撁洪宥嗘櫌闂佽法鍠撻弲顐ゅ垝閺冨偊鎷烽棃娑欐喐闁活厼妫濋弻娑㈠焺閸愵亖妾ㄩ梺缁樻尰濞茬喖寮诲澶婄厸濞达絽鎲″▓鍫曟⒑鐎圭姵顥夋い锔炬暬楠炲啯绂掔�ｅ灚鏅┑鐐村灦鑿ら柡瀣懃閳规垿顢欑涵閿嬫暰濠碉紕鍋樼划娆撳Υ娴ｈ倽鏃�鎷呴悷閭︼拷鎾绘⒑閼姐倕鏋戝鐟版閵嗗倿寮婚妷锔规嫽婵炶揪绲介幉锟犲疮閻愮儤鐓熼柣鏃堟？閹茬偓顨ラ悙鑼闁轰焦鎹囬弫鎾绘晸閿燂拷", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != itemnum)
									{
										return false;
									}
								}
								else
								{
									if (bag.doAddItem(id, itemnum, "闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲搁弮鍫澪ラ柛鎰ㄦ櫆閸庣喖鏌曡箛瀣労婵炲弶鎮傚铏圭磼濡搫顫岄梺鍦拡閸嬪﹤顕ｉ崨濠勭懝闁跨喕妫勯～蹇撁洪宥嗘櫌闂佽法鍠撻弲顐ゅ垝閺冨偊鎷烽棃娑欐喐闁活厼妫濋弻娑㈠焺閸愵亖妾ㄩ梺缁樻尰濞茬喖寮诲澶婄厸濞达絽鎲″▓鍫曟⒑鐎圭姵顥夋い锔炬暬楠炲啯绂掔�ｅ灚鏅┑鐐村灦鑿ら柡瀣懃閳规垿顢欑涵閿嬫暰濠碉紕鍋樼划娆撳Υ娴ｈ倽鏃�鎷呴悷閭︼拷鎾绘⒑閼姐倕鏋戝鐟版閵嗗倿寮婚妷锔规嫽婵炶揪绲介幉锟犲疮閻愮儤鐓熼柣鏃堟？閹茬偓顨ラ悙鑼闁轰焦鎹囬弫鎾绘晸閿燂拷", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != itemnum)
									{
										return false;
									}
								}												
							}
						}	
						
						if (count > e.getNum()) //闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊瑜滃ù鏍煏婵炲灝鍔存繛鎾愁煼閺岀喖鎮滃鍡樼暥缂佺虎鍙忛幏鐑芥⒒娴ｇ瓔娼愰柛搴ｅ帶铻為柛鏇ㄥ灡閳锋帗銇勯弽顐沪闁绘搫缍侀悡顐﹀炊閵娿儱姣堝┑鐐插悑閸旀瑩寮婚悢纰辨晬婵☆垰鎼慨锕傛⒑閸濆嫭婀扮紒瀣灴閸┿儲寰勬繛銏㈠枛瀹曟宕楅悡搴㈢亪婵犵绱曢崑鎴﹀磹閺囩媴鎷峰☉鎺撴珚闁诡喚鍏橀崺锟犲川椤撯剝鎲版繝鐢靛仦閸垶宕瑰ú顏勭柧闁归棿鐒﹂悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�? 闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�哥粻鏍煕椤愶絾绀�缁炬儳娼￠弻鐔煎箚閻楀牜妫勭紒鐐劤椤兘寮婚敐澶婄疀闁绘鐗婇柨顓㈡⒑閹肩偛濡界紒璇茬墦瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷 by changhao
						{
							return false;
						}
					}
				}
				
				return true;
			}
		};
		grabmonthcardreward.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812689;

	public int getType() {
		return 812689;
	}

	public int itemid; // 自由分配道具id by changhao
	public java.util.HashMap<Integer,Integer> rewarddistribution; // 道具分配 道具id value数量 by changhao

	public CGrabMonthCardReward() {
		rewarddistribution = new java.util.HashMap<Integer,Integer>();
	}

	public CGrabMonthCardReward(int _itemid_, java.util.HashMap<Integer,Integer> _rewarddistribution_) {
		this.itemid = _itemid_;
		this.rewarddistribution = _rewarddistribution_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(itemid);
		_os_.compact_uint32(rewarddistribution.size());
		for (java.util.Map.Entry<Integer, Integer> _e_ : rewarddistribution.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		itemid = _os_.unmarshal_int();
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			int _k_;
			_k_ = _os_.unmarshal_int();
			int _v_;
			_v_ = _os_.unmarshal_int();
			rewarddistribution.put(_k_, _v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGrabMonthCardReward) {
			CGrabMonthCardReward _o_ = (CGrabMonthCardReward)_o1_;
			if (itemid != _o_.itemid) return false;
			if (!rewarddistribution.equals(_o_.rewarddistribution)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += itemid;
		_h_ += rewarddistribution.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(itemid).append(",");
		_sb_.append(rewarddistribution).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

