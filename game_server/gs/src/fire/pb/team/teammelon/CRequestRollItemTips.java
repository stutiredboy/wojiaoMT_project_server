
package fire.pb.team.teammelon;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestRollItemTips__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}
/***
 * 
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犲鏌＄仦绋垮⒉鐎垫澘瀚敓鏂ょ秵娴滄繈顢欓崨顓涙斀闁绘劕寮堕埢鏇灻瑰鍐煟鐎殿噮鍋婂畷鍫曨敆娴ｅ搫甯鹃梻濠庡亜濞诧箑煤閺嵮勬瘎闂傚倷绀侀幉锛勬崲閸愵喓锟藉啯绻濋崒銈嗙稁缂傚倷鐒﹂…鍥偡瑜版帗鐓曢柕澶嬪灥閸犳艾顭囬懡銈囩＝闁稿本鐟чˇ锔姐亜閿曞倷鎲剧�殿噮鍋嗛幏鐘绘嚑椤掍焦顔曢梻浣告惈濞层垽宕归崷顓犱笉闁挎繂顦伴悡銉╂煛閸愩劌锟界懓鈻嶉弴銏＄厱婵☆垰婀遍惌娆愭叏婵犲啯銇濇俊顐㈠暙閳藉娼忛埡浣感梻鍌欒兌椤牏锟藉灚甯″畷褰掑醇閺囩偞鐎梺鐟板⒔缁垳锟界數濮撮…璺ㄦ崉妤﹀灝顏梺缁樺姇椤╋拷 item tips 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤濞硷繝寮婚悢鐚存嫹閻㈡鐒剧�涙繄绱撴担鐣屽牚闁稿﹥绻堝濠氭晝閿熷�熺亽婵炴挻鍑归崹閬嶆晬閸℃せ鏀介柣鎰级閳绘洖霉濠婂嫮绠炵�规洘鍨块獮鍥偋閸繀鍖栭梻浣规偠閸庣儤绂嶅鍫熷剭闁绘垶菧娴滄粓鏌ㄩ弮鍥跺殭妤犵偞鐗犻弻宥囨喆閸曨偆浼岄梺璇″枓閺呮繄妲愰幒鎳崇喐绻濆顓熸婵犵數濮烽弫鎼佸磻濞戙垺鍎戝ù鍏兼綑绾捐绻濋棃娑卞剭闁跨喐鍨濈粈渚�锝炲┑瀣殝闁汇垽娼ф慨鎼佹煟鎼达紕鐣柛搴″船铻炴繛鎴欏灩閻鏌涢埄鍐檨闁抽攱鍨圭槐鎾存媴閼测剝鍨圭划鍫ユ晸娴犲鈷戠紒瀣皡瀹搞儲绻濋敓浠嬫焼瀹ュ棙娅㈤梺鍏间航閸庢娊宕弻銉︾厵闁告垯鍊栫�氾拷 by changhao
 *
 */
public class CRequestRollItemTips extends __CRequestRollItemTips__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		Long battlemelonid = xtable.Roleid2battlemelonid.select(roleid);
		if (battlemelonid != null)
		{
			xbean.ETeamMelon teammelon = xtable.Battlemelonid2melon.select(battlemelonid);
			if (teammelon != null)
			{
				xbean.TeamMelon melon = teammelon.getMelonid2melons().get(this.melonid);
				if (melon != null)
				{
					xbean.Item item = melon.getItemdata();
					if (item != null)
					{
						fire.pb.item.ItemBase basicitem = fire.pb.item.Module.getInstance().getItemManager().toItemBase(item, 0, 0, 0);
						if (basicitem != null)
						{
							fire.pb.talk.SChatItemTips msg = new fire.pb.talk.SChatItemTips();
							msg.tips = basicitem.getTips(); 
							
							fire.pb.talk.DisplayInfo displayInfo = new fire.pb.talk.DisplayInfo();
							msg.displayinfo = displayInfo;
							msg.displayinfo.displaytype = fire.pb.talk.DisplayInfo.DISPLAY_ROLL_ITEM;
							msg.displayinfo.counterid = item.getId();
							gnet.link.Onlines.getInstance().send(roleid, msg);			
						}					
					}				
				}				
			}
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794525;

	public int getType() {
		return 794525;
	}

	public long melonid;

	public CRequestRollItemTips() {
	}

	public CRequestRollItemTips(long _melonid_) {
		this.melonid = _melonid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(melonid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		melonid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestRollItemTips) {
			CRequestRollItemTips _o_ = (CRequestRollItemTips)_o1_;
			if (melonid != _o_.melonid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)melonid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(melonid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestRollItemTips _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(melonid - _o_.melonid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

