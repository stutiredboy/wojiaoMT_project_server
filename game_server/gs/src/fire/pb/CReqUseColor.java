
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
		//娴ｈ法鏁ら弻鎾瑰閸旂喕鍏�
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
					logger.info("鐟欐帟澹奿d "+roleid+"閺屾捁澹�"+"\t閺佺増宓侀柨娆掝嚖");
					return false;
				}
				if(rolecolorinfo.colorpos1==0&&rolecolorinfo.colorpos2==0){
					logger.info("鐟欐帟澹奿d "+roleid+"閺屾捁澹�"+"\t瑜版挸澧犻弻鎾瑰閺傝顢嶉惄绋挎倱閿涘本妫ら棁?閺屾捁澹�");
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160380, null);
					return false;
				}
				if(rolecolorinfo.colorpos1<0||rolecolorinfo.colorpos2<0){
					logger.info("鐟欐帟澹奿d "+roleid+"閺屾捁澹�"+"\t閺佺増宓侀柨娆掝嚖");
					return false;
				}
				
				//閸掋倖鏌囬弰顖氭儊閸滃矁闊╂稉濠勬畱閺屾捁澹婇弬瑙勵攳閻╃鎮�
				int curpos1=prop.getRolecolor1();
				int curpos2=prop.getRolecolor2();
				if(rolecolorinfo.colorpos1==curpos1&&rolecolorinfo.colorpos2==curpos2){
					logger.info("鐟欐帟澹奿d "+roleid+"閺屾捁澹�"+"\t瑜版挸澧犻弻鎾瑰閺傝顢嶉惄绋挎倱閿涘本妫ら棁?閺屾捁澹�");
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160380, null);
					return false;
				}
				SRoleRColorConfig sRoleRColorConfig1=null;
				SRoleRColorConfig sRoleRColorConfig2=null;
				if(rolecolorinfo.colorpos1!=0&&rolecolorinfo.colorpos1!=curpos1){
					//閸掋倖鏌囬柈銊ょ秴閻ㄥ嫭鏌熷鍫熸Ц閸氾箑鐡ㄩ崷?
					sRoleRColorConfig1=sRoleRColorConfig.get(rolecolorinfo.colorpos1);
					//閸掋倖鏌囬弰顖氭儊閺勵垶鍎存担?1
					if(sRoleRColorConfig1.getRolepos()!=1){
						logger.info("鐟欐帟澹奿d "+roleid+"閺屾捁澹�"+"\t鐎广垺鍩涚粩顖氬絺闁焦鏆熼幑顕�鏁婄拠?");
						return false;
					}
				}
				if(rolecolorinfo.colorpos2!=0&&rolecolorinfo.colorpos2!=curpos2){
					//閸掋倖鏌囬柈銊ょ秴閻ㄥ嫭鏌熷鍫熸Ц閸氾箑鐡ㄩ崷?
					sRoleRColorConfig2=sRoleRColorConfig.get(rolecolorinfo.colorpos2);
					//閸掋倖鏌囬弰顖氭儊閺勵垶鍎存担?2
					if(sRoleRColorConfig2.getRolepos()!=2){
						logger.info("鐟欐帟澹奿d "+roleid+"閺屾捁澹�"+"\t鐎广垺鍩涚粩顖氬絺闁焦鏆熼幑顕�鏁婄拠?");
						return false;
					}
				}
				//婵″倹鐏夐弻鎾瑰闁劋缍�1閸�?2闁垝璐熺粚鐚寸礉閺冪娀娓堕弻鎾瑰
				if(sRoleRColorConfig1==null&&sRoleRColorConfig2==null){
					logger.info("鐟欐帟澹奿d "+roleid+"閺屾捁澹�"+"\t瑜版挸澧犻弻鎾瑰閺傝顢嶉惄绋挎倱閿涘本妫ら棁?閺屾捁澹�");
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160380, null);
					return false;
				}
				//鐠侊紕鐣婚獮鑸靛⒏闂勩倖绉烽懓?
				double delpre=1;//閺屾捁澹婄悰锝嗙厲閹舵ɑ宕化缁樻殶
				boolean ischange1=rolecolorinfo.colorpos1!=curpos1;//閺勵垰鎯侀弨鐟板綁
				boolean ischange2=rolecolorinfo.colorpos2!=curpos2;//閺勵垰鎯侀弨鐟板綁
				
				
				//閸掋倖鏌囪ぐ鎾冲閺勵垰鎯侀崷銊ㄣ�傚鍙樿厬鐎涙ê婀潻娆庨嚋閺屾捁澹婇弬瑙勵攳閿涘苯鐡ㄩ崷銊︾厠閼瑰弶鏌熷鍫ユ付鐟曚焦澧﹂幎?
				boolean havetype=false;
				for(xbean.RoleColorType type:prop.getColorroomlist()){
					if(type!=null&&type.getColorpos1()==rolecolorinfo.colorpos1&&type.getColorpos2()==rolecolorinfo.colorpos2){
						havetype=true;
						break;
					}
				}
				//鐠侊紕鐣诲☉鍫�??
				if(havetype){
					Map<Integer, SCommon> commonMap = ConfigManager.getInstance().getConf(SCommon.class);
					if(commonMap!=null){
						SCommon sCommon=commonMap.get(226);
						if(sCommon!=null){
							delpre=Double.parseDouble(sCommon.getValue());
						}
					}
				}
				ItemMaps bagContainer = Module.getInstance().getItemMaps(roleid, BagTypes.BAG, false);//閹规劘绂掗惃鍕眽閼冲苯瀵樼�圭懓娅�
				if(bagContainer==null){
					logger.info("鐟欐帟澹奿d "+roleid+"閺屾捁澹�"+"\t閼冲苯瀵橀柨娆掝嚖");
					return false;
				}
				
				HashMap<Integer, Integer> costitems=new HashMap<Integer, Integer>();
				//閸掋倖鏌囬柆鎾冲徔閺勵垰鎯佺搾鍐差檮
				dealCostItemNum(roleid,delpre,sRoleRColorConfig1,ischange1,costitems);//闁挸鍙�1
				dealCostItemNum(roleid,delpre,sRoleRColorConfig2,ischange2,costitems);//闁挸鍙�2
				String loginfo="";
				for (Entry<Integer, Integer> entry : costitems.entrySet()) {
					if(entry.getKey()>0&&entry.getValue()>0){
						int havenum=bagContainer.getItemNum(entry.getKey(), 0);
						if(havenum<entry.getValue()){
							fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 150058, null);
							return false;
						}
						//閹碉綁娅庨柆鎾冲徔
						int delnum=bagContainer.removeItemById(entry.getKey(), entry.getValue(), fire.log.enums.YYLoggerTuJingEnum.tujing_Value_ranse, entry.getKey(), "鐟欐帟澹婇弻鎾瑰");
						if(delnum!=entry.getValue()){
							return false;
						}
						loginfo="鐟欐帟澹奿d "+roleid+"閺屾捁澹�"+"\t閹碉綁娅庨柆鎾冲徔閿涘瞼澧块崫涔甦"+entry.getKey()+"閺佷即鍣�"+entry.getValue();
					}
				}
				
				logger.info(loginfo);
				
				//鐠佸墽鐤嗛弻鎾瑰娣団剝浼�
				prop.setRolecolor1(rolecolorinfo.colorpos1);
				prop.setRolecolor2(rolecolorinfo.colorpos2);
				
				//闁氨鐓￠崷鐑樻珯娑擃厾娈戦崗鏈电铂娴滅尨绱濊ぐ鎾冲娴滆櫣澧挎径鏍ц埌閸欐ê瀵�
				//濞夈劍鍓版潻娆撳櫡閸滃苯顓归幋椋庮伂閺嶁�愁嚠閻ㄥ嫭妞傞崐娆撴付鐟曚阜oleBasicOctets閸︺劏绻栭柌宀勬桨濞ｈ濮炵�涙顔岄敍灞炬Ц閸︹��:\MT-G\server\server\protocols\move.xml鏉╂瑤閲滈崡蹇氼唴闁插矉绱濋悳鏉挎躬閸忓牅绗夐崝?
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
				//娣囨繂鐡ㄩ崚鎷屻�傚杈箲閸ョ偠銆傚鍙樹繆閹�?
				saveColor(roleid,prop);
				
				fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleid);
				if (team != null){
					team.updateTeamMemberBasic2Others(roleid);
				}
				logger.info("鐟欐帟澹奿d "+roleid+"閺屾捁澹婇幋鎰閿涘苯缍嬮崜宥嗙厠閼瑰弶鏌熷?"+prop.getRolecolor1()+" "+prop.getRolecolor2());
				return true;
			}
		}.submit();
	}
	
	/**
	 * 娣囨繂鐡ㄩ弻鎾瑰閺傝顢�
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
	 * 鐠侊紕鐣婚棁?鐟曚胶娈戦柆鎾冲徔閺佷即鍣�
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

