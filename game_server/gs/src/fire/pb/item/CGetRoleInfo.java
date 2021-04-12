
package fire.pb.item;

import java.util.Properties;

import fire.pb.Item;
import fire.pb.util.FireProp;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGetRoleInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGetRoleInfo extends __CGetRoleInfo__ {
	@Override
	protected void process() {
		// protocol handle
		final long thisroleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (thisroleId < 0)
			return;
		Properties prop = fire.pb.item.Module.getInstance().getProp();
		final fire.pb.map.Role thisrole = fire.pb.map.RoleManager.getInstance().getRoleByID(thisroleId);
		if (null == thisrole)
			return;
		final fire.pb.map.Role role = fire.pb.map.RoleManager.getInstance().getRoleByID(roleid);
		if (role == null){
			final int failed = FireProp.getIntValue(prop, "check.equip.failed");	
			fire.pb.talk.MessageMgr.sendMsgNotify(thisroleId, failed, null);
			return;
		}
		
		final ItemMaps bag=Module.getInstance().getItemMaps(roleid,BagTypes.EQUIP,true);
		final SGetRoleInfo res=new SGetRoleInfo();
		res.roleid = roleid;
		
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К缂備胶鍋撻崕鍐差焽閿熺姴钃熼柨婵嗩槸椤懘鏌曡箛濠冩珖闁告梹鎮傚鍝勑ч崶褝鎷峰┑鍫笉闁哄稁鍘奸拑鐔猴拷骞垮劚椤︻垱瀵奸悩缁樼厱闁哄洢鍔屾晶顔界箾閸滃啰鎮肩紒杈ㄦ尰閹峰懘鎮烽弶娆炬綌婵＄偑鍊戦崝灞轿涘▎鎴犵煔閺夊牄鍔庣弧锟介梺鎼炲労閻忔稖顦归柡灞剧☉閳藉宕￠悙瀵镐邯婵犵數鍋涢幊宀勫磹濠靛棭娼栭柧蹇撴贡閻瑦绻涢崱妯哄姢闁告挻婢橀—鍐Χ韫囨搩娲梺杞版祰椤曆囶敋閿濆棛绡�婵﹩鍎甸埡鍛厪濠㈣泛鐗嗛悘顏堟煛閸岋附瀚归梻鍌氬�烽懗鍓佹兜閸洖绀堟繝闈涱儌閿熸枻绠撳畷鍫曨敆閿熻棄娲挎俊鐐�栭崝褔姊介崟顖氱厱闁瑰濮甸崰鎰版煟濡わ拷閻楀棙绌遍娑楃箚妞ゆ劧绲介悘鎾煛鐏炲墽顬肩紒鐘崇洴瀵噣骞橀惂鍛婂闁圭瀵掑▓浠嬫煟閹邦厼绲婚柡鍡秮閺岀喓绮欓崠鈩冩暰閻庡灚婢樼�氭澘鐣烽崡鐐嶇喖姊荤�靛憡瀵滈梻鍌氬�搁崐椋庣矆娴ｉ潻鑰块梺顒�绉敓鏂ょ畵瀹曞ジ锝為钘夘伓濠电偞鍨剁敮妤�鈻嶆繝鍕舵嫹濞堝灝鏋熷┑鐐诧躬楠炲啫鈻庨幘鏉戯拷缁樹繆椤栫偞鏁遍悗姘虫閳规垿鎮欓懜闈涙锭缂傚倸绋勯幏宄扳攽閳藉棗浜滈悗姘煎灦閵嗗倿宕稿Δ浣叉嫽婵炶揪缍�濞咃絿鏁☉娆嶄簻闁靛鍎崇粻鑽わ拷瑙勬穿缂嶄礁鐣峰锟介、娆撳箚瑜忛妶锕傛⒒婵犲骸浜滄繛璇у缁瑩骞掑Δ锟介悿楣冩煙闂傚鍔嶉柣鎾卞劦閺岋綁寮撮悙璇ф嫹閸︻叏鎷峰鐐
		xbean.Properties targetRoleProp=xtable.Properties.select(roleid);
		
		res.rolename = targetRoleProp.getRolename();
		res.shape = targetRoleProp.getShape();
		res.level =targetRoleProp.getLevel();
		res.school =targetRoleProp.getSchool();
		
		res.packinfo=bag.getPackInfo();
		res.equipscore = Module.getInstance().getEquipTotalScore(roleid);
		for (Item item : res.packinfo.items){
			ItemBase bitem = bag.getItem(item.key);
			if (bitem == null)
				continue;
			res.tips.put( item.key, bitem.getTips() );
		
		}
		gnet.link.Onlines.getInstance().send(thisroleId, res);
		
		SNoticeRoleGetInfo sSendGetOtherRoloeInfoMsg = new SNoticeRoleGetInfo();
		sSendGetOtherRoloeInfoMsg.roleid = thisroleId;
		sSendGetOtherRoloeInfoMsg.rolename = xtable.Properties.selectRolename(thisroleId);
		gnet.link.Onlines.getInstance().send(roleid, sSendGetOtherRoloeInfoMsg);
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787709;

	public int getType() {
		return 787709;
	}

	public long roleid;

	public CGetRoleInfo() {
	}

	public CGetRoleInfo(long _roleid_) {
		this.roleid = _roleid_;
	}

	public final boolean _validator_() {
		if (roleid < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGetRoleInfo) {
			CGetRoleInfo _o_ = (CGetRoleInfo)_o1_;
			if (roleid != _o_.roleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGetRoleInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

