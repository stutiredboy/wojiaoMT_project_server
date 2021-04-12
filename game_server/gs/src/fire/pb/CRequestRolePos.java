
package fire.pb;

import java.util.List;

import fire.pb.map.GridPos;
import fire.pb.map.MapConfig;
import fire.pb.map.Role;
import fire.pb.util.MapUtil;
import fire.pb.util.MessageUtil;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestRolePos__ extends mkio.Protocol { }

/** 客户端使用千里寻踪蝶请求玩家坐标
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRequestRolePos extends __CRequestRolePos__ {
	@Override
	protected void process() {
		final long findroleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(findroleid < 0) {
			return;
		}
		new mkdb.Procedure(){

			@Override
			protected boolean process() throws Exception {
				if (searchtype == BYID){
					return findRoleByID(roleid);
				}
				if (searchtype == BYNAME) {
					Long rid = xtable.Rolename2key.select(rolename);
					if (rid!=null){
						return findRoleByID(rid);
					}else {
						fire.pb.talk.MessageMgr.psendMsgNotify(findroleid, 142707, null);
						return false;
					}
				}
				return true;
			}

			private boolean findRoleByID(Long rid) {
				if (xtable.Properties.select(rid)==null){
					fire.pb.talk.MessageMgr.psendMsgNotify(findroleid, 142707, null);
					return false;
				}
				if (!StateCommon.isOnline(rid)) {
					fire.pb.talk.MessageMgr.psendMsgNotify(findroleid, 142708, null);
					return false;
				}
				Role role =fire.pb.map.RoleManager.getInstance().getRoleByID(rid);
				if (role == null)
					return false;
				int basemapid = MapUtil.getBaseMapIdBySceneId(role.getScene());
				MapConfig conf =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.map.MapConfig.class).get(basemapid);
				if (conf!=null){
					String mapName = conf.getMapName();
					GridPos gridPos = role.getPos().toGridPos();
					PropRole pRole = new PropRole(rid, true);
					String roleName = pRole.getName();
					List<String> paras = MessageUtil.getMsgParaList(roleName,mapName,String.valueOf(gridPos.getX()),String.valueOf(gridPos.getY()));
					fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(findroleid, 142709, paras);
				    //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡╂Ч濞存嚎鍊濋弻銈夊级閹稿骸浠村┑顔硷攻濡炰粙銆佸Δ鍛櫢闁伙絽鐬奸惌鎾绘煛鐏炶鍔滈柡鍛倐閺岋箑螣娓氼垱笑闂佽法鍠曞Λ鍕焽閿熺姴违濞达絿纭堕弸搴ㄦ煙閹咃紞闁伙綁绠栭幃宄邦煥閸愵亞顔婄紓渚囧枙缁茶崵绮诲☉妯锋婵炲棗鏈�氬ジ姊绘担鍛婂暈缂佸鍨块弫鍐Ψ瑜濋幏鐑藉垂椤愩倖鍣伴梺鍝勬湰閻╊垰顕ｉ幘顔嘉╅柕澶堝労濞艰姤淇婇悙顏勶拷鏍蓟閵娿儍娲敇閻戝棙缍庣紓鍌欑劍钃卞┑顖涙尦閺屻倝骞侀幒鎴濆Б闂侀潧妫楅敃顏勵潖濞差亜浼犻柕澶堝剾閵忋垻纾煎璺猴功閸╋絿锟借娲樺畝鎼佺嵁閹烘绠ｉ柡鍐挎嫹闁诲骸顭峰铏规喆閸曨偄濮㈤梺姹囧�曞ú顓㈢嵁濡ゅ懎鍗抽柕蹇婃閹锋椽姊洪崷顓х劸婵炴挳顥撶划濠氬箻缂佹鍘甸悗鐟板閸嬪﹪宕曡箛娑欑厪闁糕剝锚濞搭噣鏌熺粵鍦瘈濠碘�崇埣瀹曞爼鍩＄�ｎ剟妫峰┑鐘垫暩閸嬬娀骞撻鍡欑闁跨喍绮欓弻娑氾拷锝庝簻閿熻棄娼￠悰顔撅拷锝庡枟閺呮粓鏌﹀Ο渚Х闁瑰鍏樺缁樻媴閸涘﹥鍎撻梺鍝ュ櫏閸嬪﹪骞冭缁绘繈宕惰閸橀亶姊虹涵鍛涧闂傚嫬瀚伴幃锟犲即閵忥紕鍙嗛梺鍝勫暙濞村倿宕靛▎鎰垫闁绘劖娼欓悘鎾煛鐏炶濮傞柟顔哄灮缁辨帒顫滈崱姗嗘濠碉紕鍋戦崐鏍垂閻㈡潌鍥偨閸涘﹤浠掑銈嗘濞夋洟鎮块敓钘夆攽閻愭潙鐏﹂柣鐕傜畱閳诲秹濮�閵堝棌鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷
					fire.pb.item.Pack bag = new fire.pb.item.Pack(findroleid, false);
					int realSub = bag.removeItemById(36253, 1, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_qianlixunzong, 36253, "use qianlixunzongdie",true);
				    if (realSub!=1)
				    	return false;
				}
				return true;
			}
			
		}.submit();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786487;

	public int getType() {
		return 786487;
	}

	public final static int BYNAME = 1; // 按名字查找
	public final static int BYID = 2; // 按id查找

	public long roleid; // 玩家id
	public java.lang.String rolename; // 玩家名
	public byte searchtype; // 查找类型

	public CRequestRolePos() {
		rolename = "";
	}

	public CRequestRolePos(long _roleid_, java.lang.String _rolename_, byte _searchtype_) {
		this.roleid = _roleid_;
		this.rolename = _rolename_;
		this.searchtype = _searchtype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(rolename, "UTF-16LE");
		_os_.marshal(searchtype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		rolename = _os_.unmarshal_String("UTF-16LE");
		searchtype = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestRolePos) {
			CRequestRolePos _o_ = (CRequestRolePos)_o1_;
			if (roleid != _o_.roleid) return false;
			if (!rolename.equals(_o_.rolename)) return false;
			if (searchtype != _o_.searchtype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += rolename.hashCode();
		_h_ += (int)searchtype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append("T").append(rolename.length()).append(",");
		_sb_.append(searchtype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

