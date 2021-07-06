
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
		
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氱紓鍌欒兌閸嬫捇宕曢崘宸劷闁跨喓濮撮拑鐔兼煥濠靛棭妲告い顐㈡嚇閺屾洝绠涙繝鍐╃彇闂佸憡姊归幃鍌氼潖閸濆嫅褔宕惰閹峰嘲鈹戦崼顫瑝闂佸搫绋侀崢濂告嫅閻旂尨鎷烽獮鍨姎妞わ富鍨辩�靛ジ鎮╃紒妯煎幈闂佸搫娲㈤崝灞炬櫠椤旂晫绠鹃柛婊冨暟閹偐绱掓潏銊﹀鞍闁瑰嘲鎳橀幃鐑藉级濞嗙偓缍屽┑锛勫亼閸婃垿宕濈仦杞挎稑鈻庨幋鐘电厰闁哄鐗勯崝搴ｅ姬閿熶粙姊洪幖鐐插姶闁诲繑绋栭ˇ褰掓煛鐏炲墽鈽夐柍钘夘樀瀹曪繝鎮欑�甸晲閭┑鐘垫暩閸嬫盯骞婂畝鍕９婵犻潧妫鏍煣韫囨挻璐￠柣顓熺懄缁绘盯宕卞Ο鍝勫Б闂佸憡鎸诲姗�鈥旈崘顔嘉ч煫鍥ㄦ惄濞差參姊烘潪鐗堢グ妞ゆ泦鍥舵晪闁挎繂妫涚弧锟藉┑顔斤供閸庣敻鍩￠崨顔惧帾婵犮垼娉涢悧鍡涙倶椤忓牊鐓涢柛宀嬮檮鐎氬綊姊婚崒姘拷鐑芥嚄閸撲焦鍏滈柛顐ｆ礀缁�鍫熺節闂堟侗鍎岄柨鐔告灮缁犳挸鐣烽崼鏇ㄦ晢闁跨喕妫勫ú鎸庝繆閻愵亜锟芥牠宕濊濮婁粙宕熼姘卞幈闂佺懓顕慨鐢稿窗閹扮増鐓熸俊銈忔嫹闁绘妫欑粚閬嶎敍濞戞绠氬銈嗗姧缁蹭粙鎮橀幘顔界厸閻忕偛澧介‖鑲╃磼閻樺磭娲寸�殿噮鍣ｉ獮姗�鎯傞崨濠傤伓闂佸湱顭堢�垫帒鈻撴禒瀣厽闁归偊鍘肩徊濠氭煛閸☆厾绉柡宀�鍠撶划娆撳礌閳╁啯鏆伴柣搴＄仛濠㈡锟芥碍婢橀悾鐑藉础閻愬秶鍠栧鑽わ拷闈涙啞鐎垫粓姊婚崒姘拷鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔顕�鏁撻弬銈囩暤鐎规洖銈搁敐鐐侯敊閽樺浼撴繝鐢靛仦閸ㄥ墎鏁Δ锟介埢宥嗙節閸曡埖瀚规繛鍫濈仢閺嬬喎鈹戦悙璇ц含妤犵偛鍟埢搴ㄥ箻閺夋埊鎷风紒妯圭箚妞ゆ牜鍋為弫閬嶆倵濮樿櫕顥夐柍瑙勫灴閹瑩鎳滈棃娑欓敪缂傚倸鍊哥粙鍕箯瀹勬壋鏀介柍钘夋娴滄粓鎮楀鐓庣仸闁靛棗鍊垮畷绋课旀担鍙夊濠电偠鎻紞锟芥繛鍜冪悼閺侇喖鈽夊▎宥勭盎闂侀潧顭堥崕宕囩不閼姐倧鎷风憴鍕┛缂傚秳绀侀悾宄邦潨閿熶粙銆佸▎鎾崇畾鐟滃繘濡堕敃鍌涒拻濠电姴楠告禍婊勭箾鐠囇冾洭缂侇喗鐟╅獮鎺懳旈敓浠嬫偪妤ｅ啯鐓欓梻鍌氼嚟閸斿秹鏌ｉ幘鍗炲姦闁哄矉缍佸鎾倷鐠囇勫闁革富鍙忛幏宄邦潩閻愵剙顏�
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

