
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
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞稿墲瀵板嫮锟斤綆浜濋鍛攽閻愬弶鈻曞ù婊冪埣瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎲＄换鍐�冩繝鍌ゆ綎缂備焦顭囬悷褰掓煕閵夋垵鍠氬鑽ょ磽閸屾瑧顦︽い锕備憾瀵偆鎷犻懠顒佹闂佸搫娲㈤崹鍦不閿濆鐓ラ柡鍐ㄥ�瑰▍鏇㈡煕濡湱鐭欐慨濠冩そ濡啫鈽夋潏鈺佸Ъ闂備胶顭堢�垫帡宕归崼鏇炴瀬闁瑰墽绮�电姴顭跨捄楦垮闁绘劕顩� item tips 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳娼￠弻鐔猴拷鐢殿焾瀛濈紓浣界堪閸婃繈寮婚敃锟借灒濞撴凹鍨遍敍鍡椻攽閻愬弶鈻曞ù婊勭箞瀹曟垿骞囬悧鍫濅化闂佹悶鍎烘禍婊堟儍閻戞ǜ浜滈柨鏃囶嚙楠炴牠鏌嶇憴鍕伌闁诡喒鏅濈槐鎺懳熸繝姘殬濠电姷鏁搁崑娑㈡儑娴兼潙纾规繝闈涱儍閿熸垝绀侀～婵嬫嚋閻㈤潧濮搁柣搴＄畭閸庡崬螞濞戙垹鐭楅柛鈩冪♁閳锋垹绱撴担鑲℃垹绮堥敓浠嬫⒑缁嬪尅宸ユ繝锟介柆宥嗘櫢闁兼亽鍎抽崯鏌ユ煙閸戙倖瀚� by changhao
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

