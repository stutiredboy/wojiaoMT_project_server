
package fire.pb;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import fire.msp.move.GRoleEquipChange;
import fire.pb.common.SCommon;
import fire.pb.item.BagTypes;
import fire.pb.item.EquipItemType;
import fire.pb.item.ItemMaps;
import fire.pb.item.Module;
import fire.pb.main.ConfigManager;
import fire.pb.role.SRoleRColorConfig;
import mkdb.Procedure;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqUseColor__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqUseColor extends __CReqUseColor__ {
	public static final Logger logger = Logger.getLogger("SYSTEM");
	@Override
	protected void process() {
		// protocol handle
		//浣跨敤鏌撹壊鍔熻兘
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				xbean.Properties prop=xtable.Properties.get(roleid);
				if(prop==null){
					return false;
				}
				Map<Integer, SRoleRColorConfig> sRoleRColorConfig = ConfigManager.getInstance().getConf(SRoleRColorConfig.class);
				if(sRoleRColorConfig==null){
					logger.info("瑙掕壊id "+roleid+"鏌撹壊"+"\t鏁版嵁閿欒");
					return false;
				}
				if(rolecolorinfo.colorpos1==0&&rolecolorinfo.colorpos2==0){
					logger.info("瑙掕壊id "+roleid+"鏌撹壊"+"\t褰撳墠鏌撹壊鏂规鐩稿悓锛屾棤闇?鏌撹壊");
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160380, null);
					return false;
				}
				if(rolecolorinfo.colorpos1<0||rolecolorinfo.colorpos2<0){
					logger.info("瑙掕壊id "+roleid+"鏌撹壊"+"\t鏁版嵁閿欒");
					return false;
				}
				
				//鍒ゆ柇鏄惁鍜岃韩涓婄殑鏌撹壊鏂规鐩稿悓
				int curpos1=prop.getRolecolor1();
				int curpos2=prop.getRolecolor2();
				if(rolecolorinfo.colorpos1==curpos1&&rolecolorinfo.colorpos2==curpos2){
					logger.info("瑙掕壊id "+roleid+"鏌撹壊"+"\t褰撳墠鏌撹壊鏂规鐩稿悓锛屾棤闇?鏌撹壊");
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160380, null);
					return false;
				}
				SRoleRColorConfig sRoleRColorConfig1=null;
				SRoleRColorConfig sRoleRColorConfig2=null;
				if(rolecolorinfo.colorpos1!=0&&rolecolorinfo.colorpos1!=curpos1){
					//鍒ゆ柇閮ㄤ綅鐨勬柟妗堟槸鍚﹀瓨鍦?
					sRoleRColorConfig1=sRoleRColorConfig.get(rolecolorinfo.colorpos1);
					//鍒ゆ柇鏄惁鏄儴浣?1
					if(sRoleRColorConfig1.getRolepos()!=1){
						logger.info("瑙掕壊id "+roleid+"鏌撹壊"+"\t瀹㈡埛绔彂閫佹暟鎹敊璇?");
						return false;
					}
				}
				if(rolecolorinfo.colorpos2!=0&&rolecolorinfo.colorpos2!=curpos2){
					//鍒ゆ柇閮ㄤ綅鐨勬柟妗堟槸鍚﹀瓨鍦?
					sRoleRColorConfig2=sRoleRColorConfig.get(rolecolorinfo.colorpos2);
					//鍒ゆ柇鏄惁鏄儴浣?2
					if(sRoleRColorConfig2.getRolepos()!=2){
						logger.info("瑙掕壊id "+roleid+"鏌撹壊"+"\t瀹㈡埛绔彂閫佹暟鎹敊璇?");
						return false;
					}
				}
				//濡傛灉鏌撹壊閮ㄤ綅1鍜?2閮戒负绌猴紝鏃犻渶鏌撹壊
				if(sRoleRColorConfig1==null&&sRoleRColorConfig2==null){
					logger.info("瑙掕壊id "+roleid+"鏌撹壊"+"\t褰撳墠鏌撹壊鏂规鐩稿悓锛屾棤闇?鏌撹壊");
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160380, null);
					return false;
				}
				//璁＄畻骞舵墸闄ゆ秷鑰?
				double delpre=1;//鏌撹壊琛ｆ煖鎶樻崯绯绘暟
				boolean ischange1=rolecolorinfo.colorpos1!=curpos1;//鏄惁鏀瑰彉
				boolean ischange2=rolecolorinfo.colorpos2!=curpos2;//鏄惁鏀瑰彉
				
				
				//鍒ゆ柇褰撳墠鏄惁鍦ㄨ。姗变腑瀛樺湪杩欎釜鏌撹壊鏂规锛屽瓨鍦ㄦ煋鑹叉柟妗堥渶瑕佹墦鎶?
				boolean havetype=false;
				for(xbean.RoleColorType type:prop.getColorroomlist()){
					if(type!=null&&type.getColorpos1()==rolecolorinfo.colorpos1&&type.getColorpos2()==rolecolorinfo.colorpos2){
						havetype=true;
						break;
					}
				}
				//璁＄畻娑堣??
				if(havetype){
					Map<Integer, SCommon> commonMap = ConfigManager.getInstance().getConf(SCommon.class);
					if(commonMap!=null){
						SCommon sCommon=commonMap.get(226);
						if(sCommon!=null){
							delpre=Double.parseDouble(sCommon.getValue());
						}
					}
				}
				ItemMaps bagContainer = Module.getInstance().getItemMaps(roleid, BagTypes.BAG, false);//鎹愯禒鐨勪汉鑳屽寘瀹瑰櫒
				if(bagContainer==null){
					logger.info("瑙掕壊id "+roleid+"鏌撹壊"+"\t鑳屽寘閿欒");
					return false;
				}
				
				HashMap<Integer, Integer> costitems=new HashMap<Integer, Integer>();
				//鍒ゆ柇閬撳叿鏄惁瓒冲
				dealCostItemNum(roleid,delpre,sRoleRColorConfig1,ischange1,costitems);//閬撳叿1
				dealCostItemNum(roleid,delpre,sRoleRColorConfig2,ischange2,costitems);//閬撳叿2
				String loginfo="";
				for (Entry<Integer, Integer> entry : costitems.entrySet()) {
					if(entry.getKey()>0&&entry.getValue()>0){
						int havenum=bagContainer.getItemNum(entry.getKey(), 0);
						if(havenum<entry.getValue()){
							fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 150058, null);
							return false;
						}
						//鎵ｉ櫎閬撳叿
						int delnum=bagContainer.removeItemById(entry.getKey(), entry.getValue(), fire.log.enums.YYLoggerTuJingEnum.tujing_Value_ranse, entry.getKey(), "瑙掕壊鏌撹壊");
						if(delnum!=entry.getValue()){
							return false;
						}
						loginfo="瑙掕壊id "+roleid+"鏌撹壊"+"\t鎵ｉ櫎閬撳叿锛岀墿鍝乮d"+entry.getKey()+"鏁伴噺"+entry.getValue();
					}
				}
				
				logger.info(loginfo);
				
				//璁剧疆鏌撹壊淇℃伅
				prop.setRolecolor1(rolecolorinfo.colorpos1);
				prop.setRolecolor2(rolecolorinfo.colorpos2);
				
				//閫氱煡鍦烘櫙涓殑鍏朵粬浜猴紝褰撳墠浜虹墿澶栧舰鍙樺寲
				//娉ㄦ剰杩欓噷鍜屽鎴风鏍″鐨勬椂鍊欓渶瑕丷oleBasicOctets鍦ㄨ繖閲岄潰娣诲姞瀛楁锛屾槸鍦‥:\MT-G\server\server\protocols\move.xml杩欎釜鍗忚閲岋紝鐜板湪鍏堜笉鍔?
//				Role addRole = RoleManager.getInstance().getRoleByID(roleid);
//				SAddUserScreen sadduser = new SAddUserScreen();
//				sadduser.rolelist.add(addRole.getRoleBasic());
//				gnet.link.Onlines.getInstance().send(roleid, sadduser);
				
				GRoleEquipChange notifymap = new GRoleEquipChange();
				notifymap.roleid = roleid;
				notifymap.pos = EquipItemType.ROLE_COLOR1;
				notifymap.itemid = rolecolorinfo.colorpos1;
				notifymap.ride = -1;
				notifymap.effect = 0;
				GsClient.pSendWhileCommit(notifymap);
				
				SReqUseColor sReqUseColor=new SReqUseColor();
				sReqUseColor.rolecolorinfo.colorpos1=prop.getRolecolor1();
				sReqUseColor.rolecolorinfo.colorpos2=prop.getRolecolor2();
//				gnet.link.Onlines.getInstance().send(roleid, sReqUseColor);
				Procedure.psendWhileCommit(roleid, sReqUseColor);
				fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160432, null);
				//淇濆瓨鍒拌。姗辫繑鍥炶。姗变俊鎭?
				saveColor(roleid,prop);
				
				fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleid);
				if (team != null){
					team.updateTeamMemberBasic2Others(roleid);
				}
				logger.info("瑙掕壊id "+roleid+"鏌撹壊鎴愬姛锛屽綋鍓嶆煋鑹叉柟妗?"+prop.getRolecolor1()+" "+prop.getRolecolor2());
				return true;
			}
		}.submit();
	}
	
	/**
	 * 淇濆瓨鏌撹壊鏂规
	 * @param roleid
	 * @param prop
	 */
	public void saveColor(long roleid,xbean.Properties prop){
		boolean havetype=false;
		java.util.List<xbean.RoleColorType> list=prop.getColorroomlist();
		for(xbean.RoleColorType type:list){
			if(type!=null&&type.getColorpos1()==prop.getRolecolor1()&&type.getColorpos2()==prop.getRolecolor2()){
				havetype=true;
				break;
			}
		}
		if(havetype==true){
			return ;
		}
		int max=0;
		Map<Integer, SCommon> commonMap = ConfigManager.getInstance().getConf(SCommon.class);
		if(commonMap!=null){
			SCommon sCommon=commonMap.get(228);
			if(sCommon!=null){
				max=Integer.parseInt(sCommon.getValue());
			}
		}
//		if(prop.getColorroomlist().size()>=max){
//			return ;
//		}
		xbean.RoleColorType roleColorType=xbean.Pod.newRoleColorType();
		roleColorType.setColorpos1(prop.getRolecolor1());
		roleColorType.setColorpos2(prop.getRolecolor2());
		prop.getColorroomlist().add(roleColorType);
		
		CReqColorRoomView.sendColorRoomInfo(roleid);
	}

	
	
	/**
	 * 璁＄畻闇?瑕佺殑閬撳叿鏁伴噺
	 * @param roleid
	 * @param delpre
	 * @param sRoleRColorConfig1
	 * @return
	 */
	public void dealCostItemNum(long roleid,double delpre,SRoleRColorConfig sRoleRColorConfig1,boolean flag,HashMap<Integer, Integer> costitems){
		if(sRoleRColorConfig1!=null&&flag==true){
			int costnum=(int) Math.ceil(sRoleRColorConfig1.getItemnum()*delpre);
			if(costnum<0){
				return ;
			}
			Integer num= costitems.get(sRoleRColorConfig1.getItemcode());
			if(num==null){
				costitems.put(sRoleRColorConfig1.getItemcode(), costnum);
			}else{
				costitems.put(sRoleRColorConfig1.getItemcode(), costnum+num);
			}
		}
	}
	
	
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786538;

	public int getType() {
		return 786538;
	}

	public fire.pb.RoleColorType rolecolorinfo; // 染色信息

	public CReqUseColor() {
		rolecolorinfo = new fire.pb.RoleColorType();
	}

	public CReqUseColor(fire.pb.RoleColorType _rolecolorinfo_) {
		this.rolecolorinfo = _rolecolorinfo_;
	}

	public final boolean _validator_() {
		if (!rolecolorinfo._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(rolecolorinfo);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		rolecolorinfo.unmarshal(_os_);
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqUseColor) {
			CReqUseColor _o_ = (CReqUseColor)_o1_;
			if (!rolecolorinfo.equals(_o_.rolecolorinfo)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += rolecolorinfo.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(rolecolorinfo).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqUseColor _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = rolecolorinfo.compareTo(_o_.rolecolorinfo);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

