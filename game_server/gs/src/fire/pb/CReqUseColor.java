
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
		//使用染色功能
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
					logger.info("角色id "+roleid+"染色"+"\t数据错误");
					return false;
				}
				if(rolecolorinfo.colorpos1==0&&rolecolorinfo.colorpos2==0){
					logger.info("角色id "+roleid+"染色"+"\t当前染色方案相同，无�?染色");
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160380, null);
					return false;
				}
				if(rolecolorinfo.colorpos1<0||rolecolorinfo.colorpos2<0){
					logger.info("角色id "+roleid+"染色"+"\t数据错误");
					return false;
				}
				
				//判断是否和身上的染色方案相同
				int curpos1=prop.getRolecolor1();
				int curpos2=prop.getRolecolor2();
				if(rolecolorinfo.colorpos1==curpos1&&rolecolorinfo.colorpos2==curpos2){
					logger.info("角色id "+roleid+"染色"+"\t当前染色方案相同，无�?染色");
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160380, null);
					return false;
				}
				SRoleRColorConfig sRoleRColorConfig1=null;
				SRoleRColorConfig sRoleRColorConfig2=null;
				if(rolecolorinfo.colorpos1!=0&&rolecolorinfo.colorpos1!=curpos1){
					//判断部位的方案是否存�?
					sRoleRColorConfig1=sRoleRColorConfig.get(rolecolorinfo.colorpos1);
					//判断是否是部�?1
					if(sRoleRColorConfig1.getRolepos()!=1){
						logger.info("角色id "+roleid+"染色"+"\t客户端发送数据错�?");
						return false;
					}
				}
				if(rolecolorinfo.colorpos2!=0&&rolecolorinfo.colorpos2!=curpos2){
					//判断部位的方案是否存�?
					sRoleRColorConfig2=sRoleRColorConfig.get(rolecolorinfo.colorpos2);
					//判断是否是部�?2
					if(sRoleRColorConfig2.getRolepos()!=2){
						logger.info("角色id "+roleid+"染色"+"\t客户端发送数据错�?");
						return false;
					}
				}
				//如果染色部位1�?2都为空，无需染色
				if(sRoleRColorConfig1==null&&sRoleRColorConfig2==null){
					logger.info("角色id "+roleid+"染色"+"\t当前染色方案相同，无�?染色");
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160380, null);
					return false;
				}
				//计算并扣除消�?
				double delpre=1;//染色衣柜折损系数
				boolean ischange1=rolecolorinfo.colorpos1!=curpos1;//是否改变
				boolean ischange2=rolecolorinfo.colorpos2!=curpos2;//是否改变
				
				
				//判断当前是否在衣橱中存在这个染色方案，存在染色方案需要打�?
				boolean havetype=false;
				for(xbean.RoleColorType type:prop.getColorroomlist()){
					if(type!=null&&type.getColorpos1()==rolecolorinfo.colorpos1&&type.getColorpos2()==rolecolorinfo.colorpos2){
						havetype=true;
						break;
					}
				}
				//计算消�??
				if(havetype){
					Map<Integer, SCommon> commonMap = ConfigManager.getInstance().getConf(SCommon.class);
					if(commonMap!=null){
						SCommon sCommon=commonMap.get(226);
						if(sCommon!=null){
							delpre=Double.parseDouble(sCommon.getValue());
						}
					}
				}
				ItemMaps bagContainer = Module.getInstance().getItemMaps(roleid, BagTypes.BAG, false);//捐赠的人背包容器
				if(bagContainer==null){
					logger.info("角色id "+roleid+"染色"+"\t背包错误");
					return false;
				}
				
				HashMap<Integer, Integer> costitems=new HashMap<Integer, Integer>();
				//判断道具是否足够
				dealCostItemNum(roleid,delpre,sRoleRColorConfig1,ischange1,costitems);//道具1
				dealCostItemNum(roleid,delpre,sRoleRColorConfig2,ischange2,costitems);//道具2
				String loginfo="";
				for (Entry<Integer, Integer> entry : costitems.entrySet()) {
					if(entry.getKey()>0&&entry.getValue()>0){
						int havenum=bagContainer.getItemNum(entry.getKey(), 0);
						if(havenum<entry.getValue()){
							fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 150058, null);
							return false;
						}
						//扣除道具
						int delnum=bagContainer.removeItemById(entry.getKey(), entry.getValue(), fire.log.enums.YYLoggerTuJingEnum.tujing_Value_ranse, entry.getKey(), "角色染色");
						if(delnum!=entry.getValue()){
							return false;
						}
						loginfo="角色id "+roleid+"染色"+"\t扣除道具，物品id"+entry.getKey()+"数量"+entry.getValue();
					}
				}
				
				logger.info(loginfo);
				
				//设置染色信息
				prop.setRolecolor1(rolecolorinfo.colorpos1);
				prop.setRolecolor2(rolecolorinfo.colorpos2);
				
				//通知场景中的其他人，当前人物外形变化
				//注意这里和客户端校对的时候需要RoleBasicOctets在这里面添加字段，是在E:\MT-G\server\server\protocols\move.xml这个协议里，现在先不�?
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
				//保存到衣橱返回衣橱信�?
				saveColor(roleid,prop);
				
				fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleid);
				if (team != null){
					team.updateTeamMemberBasic2Others(roleid);
				}
				logger.info("角色id "+roleid+"染色成功，当前染色方�?"+prop.getRolecolor1()+" "+prop.getRolecolor2());
				return true;
			}
		}.submit();
	}
	
	/**
	 * 保存染色方案
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
	 * 计算�?要的道具数量
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

	public fire.pb.RoleColorType rolecolorinfo; // Ⱦɫ��Ϣ

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

