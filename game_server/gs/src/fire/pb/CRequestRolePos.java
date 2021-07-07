
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
				    //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂傚洤顦甸弻銊モ攽閸♀晜效婵炲瓨鍤庨崐婵嬪蓟閵堝绾ч柟绋块娴犳潙鈹戦纭锋敾婵＄偘绮欓妴浣肝旈崨顔芥闂佷紮绲介惉濂告儗閹剧粯鐓涢悘鐐额嚙閸旀粓鏌￠崨顔藉�愰柡宀嬬畱铻ｅ〒姘煎灡绗戦梻浣芥硶閸犳洖螞閸曨偒鐒介柨鐔哄Т杩濇繛杈剧悼绾爼寮告惔銊︾厵闁诡垎鍜冪礊闂佷紮缍佺粻鏍箖瀹勯偊鐓ラ柛鎰典簽椤斿﹦绱撴笟鍥ф灆缂佽尪宕电划璇测槈濡攱顫嶅┑鐐叉閺堫剛锟芥艾銈稿缁樻媴閸涘﹤鏆堢紓浣割儐閸ㄥ潡寮崘顔嘉ㄧ憸婵嬪箯閻戣棄鍨傛い鎰╁�栭崳浼存⒑閸濆嫭婀伴柣鈺婂灠椤曪綁骞橀鍢夆晠鏌曟径鍫濆姶婵炶壈濮ゆ穱濠囨倷椤忓嫸鎷烽弽顓炶摕闁靛鍎嶅ú顏嶆晣闁绘垵妫欑紞搴ｇ磽閸屾瑧鍔嶉拑鍗炩攽椤栨稒灏﹂柡灞诲�濋獮渚�骞掗幋婵喰戦梻渚�娼уΛ妤呮晝椤忓嫷娼栨繛宸簻娴肩娀鏌曟径鍫濆壘闁靛繈鍨荤壕鐓庮熆鐠虹尨鍔熼柛鈺嬬悼閿熷�燁潐濞叉ê鐣濋幖浣哄祦闁圭儤顨呯粻锝夋煛閸愭寧瀚归梺璇查椤嘲顫忛搹瑙勫枂闁告洦鍋勬慨銏ゆ⒑濮瑰洤锟芥洖煤椤撱垻宓佹俊銈呮噹閸楁娊鏌曡箛濠冾�嗛柟閿嬫そ濮婃椽宕烽褏鍔稿┑鐐存尦椤ユ挾鍒掓繝姘缂備焦顭囬崢鐢告倵閻熸澘顏柛瀣躬瀹曟洝绠涘☉娆戝帾闂佺硶鍓濋敋婵炴惌鍣ｉ弻鐔虹驳閸︻厾鐦堟繝纰橈拷宕囧煟鐎规洖鐖奸崺锛勶拷锝庡墴濡嘲鈹戦悩鍨毄闁稿濞�楠炴捇顢旈崱娆戭槸闂佽法鍠嶇划娆撳蓟濞戞熬鎷烽敐搴濈盎闁跨喕妫勫锟犳偘椤旀拝鎷烽敐搴℃灍闁哄懏绮撻弻锕�螣娓氼垱啸闂佺懓顕崗妯侯潖缂佹ɑ濯撮柛娑橈攻閸庢捇姊洪崫銉ユ珡闁稿锕獮鍐槼缂佺粯绻堝畷鎯邦槾闁告﹢浜跺铏规兜閸涱喖娑ч梻鍌氬鐎氫即骞冮敓鐘插嵆闁靛骏绱曢崣鍡涙⒑閸濆嫬鏆欐繛鏉戝�垮畷闈涒枎閹板灚顔旈梺缁樺姈濞兼瑩鎮橀幘顔界厸閻忕偠顕ф慨鍌炴煙椤斿搫鐏紒杈ㄥ笒椤粓宕卞鍡橆棄婵犵绱曢崑鎴﹀磹閺嶎厼鍨傞柣銏℃綄閸ヮ剚鍋ㄩ柛娑橈工娴犳帒顪冮妶鍡橆梿婵炲娲熼幃鍧楁晸閽樺鏀介柣鎰綑閻忥箓鏌ｉ悤鍌滅暠闁宠绉规慨锟介柕鍫濇閹锋椽鏌ｉ悩鍏呰埅闁告柨鑻埢宥夊箛閻楀牏鍘甸梺鍛婂灟閸婃牜锟芥熬鎷�
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

