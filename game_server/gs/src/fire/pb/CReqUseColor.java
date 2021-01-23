
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
		//濞达綀娉曢弫銈夊蓟閹剧懓顥忛柛鏃傚枙閸忥拷
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
					logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟锟�"+"\t闁轰胶澧楀畵渚�鏌ㄥ▎鎺濆殩");
					return false;
				}
				if(rolecolorinfo.colorpos1==0&&rolecolorinfo.colorpos2==0){
					logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟锟�"+"\t鐟滅増鎸告晶鐘诲蓟閹剧懓顥忛柡鍌濐潐椤㈠秹鎯勭粙鎸庡�遍柨娑樻湰濡倝妫�?闁哄本鎹佹竟锟�");
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160380, null);
					return false;
				}
				if(rolecolorinfo.colorpos1<0||rolecolorinfo.colorpos2<0){
					logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟锟�"+"\t闁轰胶澧楀畵渚�鏌ㄥ▎鎺濆殩");
					return false;
				}
				
				//闁告帇鍊栭弻鍥及椤栨碍鍎婇柛婊冪焷闂娾晜绋夋繝鍕暠闁哄本鎹佹竟濠囧棘鐟欏嫷鏀抽柣鈺冾焾閹拷
				int curpos1=prop.getRolecolor1();
				int curpos2=prop.getRolecolor2();
				if(rolecolorinfo.colorpos1==curpos1&&rolecolorinfo.colorpos2==curpos2){
					logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟锟�"+"\t鐟滅増鎸告晶鐘诲蓟閹剧懓顥忛柡鍌濐潐椤㈠秹鎯勭粙鎸庡�遍柨娑樻湰濡倝妫�?闁哄本鎹佹竟锟�");
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160380, null);
					return false;
				}
				SRoleRColorConfig sRoleRColorConfig1=null;
				SRoleRColorConfig sRoleRColorConfig2=null;
				if(rolecolorinfo.colorpos1!=0&&rolecolorinfo.colorpos1!=curpos1){
					//闁告帇鍊栭弻鍥焾閵娿倗绉撮柣銊ュ閺岀喎顩奸崼鐔感﹂柛姘剧畱閻°劑宕�?
					sRoleRColorConfig1=sRoleRColorConfig.get(rolecolorinfo.colorpos1);
					//闁告帇鍊栭弻鍥及椤栨碍鍎婇柡鍕靛灦閸庡瓨鎷�?1
					if(sRoleRColorConfig1.getRolepos()!=1){
						logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟锟�"+"\t閻庡箍鍨洪崺娑氱博椤栨艾绲洪梺顐＄劍閺嗙喖骞戦锟介弫濠勬嫚?");
						return false;
					}
				}
				if(rolecolorinfo.colorpos2!=0&&rolecolorinfo.colorpos2!=curpos2){
					//闁告帇鍊栭弻鍥焾閵娿倗绉撮柣銊ュ閺岀喎顩奸崼鐔感﹂柛姘剧畱閻°劑宕�?
					sRoleRColorConfig2=sRoleRColorConfig.get(rolecolorinfo.colorpos2);
					//闁告帇鍊栭弻鍥及椤栨碍鍎婇柡鍕靛灦閸庡瓨鎷�?2
					if(sRoleRColorConfig2.getRolepos()!=2){
						logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟锟�"+"\t閻庡箍鍨洪崺娑氱博椤栨艾绲洪梺顐＄劍閺嗙喖骞戦锟介弫濠勬嫚?");
						return false;
					}
				}
				//濠碘�冲�归悘澶愬蓟閹剧懓顥忛梺顔哄妺缂嶏拷1闁革拷?2闂侇喗鍨濈拹鐔虹矚閻氬绀夐柡鍐█濞撳爼寮婚幘鐟邦棌
				if(sRoleRColorConfig1==null&&sRoleRColorConfig2==null){
					logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟锟�"+"\t鐟滅増鎸告晶鐘诲蓟閹剧懓顥忛柡鍌濐潐椤㈠秹鎯勭粙鎸庡�遍柨娑樻湰濡倝妫�?闁哄本鎹佹竟锟�");
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160380, null);
					return false;
				}
				//閻犱緤绱曢悾濠氱嵁閼搁潧鈷忛梻鍕╁�栫粔鐑芥嚀?
				double delpre=1;//闁哄本鎹佹竟濠勬偘閿濆棛鍘查柟鑸瞪戝畷顖滃寲缂佹ɑ娈�
				boolean ischange1=rolecolorinfo.colorpos1!=curpos1;//闁哄嫷鍨伴幆渚�寮ㄩ悷鏉跨秮
				boolean ischange2=rolecolorinfo.colorpos2!=curpos2;//闁哄嫷鍨伴幆渚�寮ㄩ悷鏉跨秮
				
				
				//闁告帇鍊栭弻鍥亹閹惧啿顤呴柡鍕靛灠閹線宕烽妸銊ｏ拷鍌氼潨閸欐鍘悗娑櫭﹢顏呮交濞嗗酣鍤嬮柡灞炬崄婢瑰﹪寮憴鍕垫敵闁挎稑鑻悺銊╁捶閵婏妇鍘犻柤鐟板级閺岀喎顩奸崼銉︿粯閻熸洑鐒︽晶锕傚箮?
				boolean havetype=false;
				for(xbean.RoleColorType type:prop.getColorroomlist()){
					if(type!=null&&type.getColorpos1()==rolecolorinfo.colorpos1&&type.getColorpos2()==rolecolorinfo.colorpos2){
						havetype=true;
						break;
					}
				}
				//閻犱緤绱曢悾璇测槈閸拷??
				if(havetype){
					Map<Integer, SCommon> commonMap = ConfigManager.getInstance().getConf(SCommon.class);
					if(commonMap!=null){
						SCommon sCommon=commonMap.get(226);
						if(sCommon!=null){
							delpre=Double.parseDouble(sCommon.getValue());
						}
					}
				}
				ItemMaps bagContainer = Module.getInstance().getItemMaps(roleid, BagTypes.BAG, false);//闁硅鍔樼粋鎺楁儍閸曨亝鐪介柤鍐茶嫰鐎垫锟藉湱鎳撳▍锟�
				if(bagContainer==null){
					logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟锟�"+"\t闁煎啿鑻�垫﹢鏌ㄥ▎鎺濆殩");
					return false;
				}
				
				HashMap<Integer, Integer> costitems=new HashMap<Integer, Integer>();
				//闁告帇鍊栭弻鍥焼閹惧啿寰旈柡鍕靛灠閹胶鎼鹃崘宸
				dealCostItemNum(roleid,delpre,sRoleRColorConfig1,ischange1,costitems);//闂侇剚鎸搁崣锟�1
				dealCostItemNum(roleid,delpre,sRoleRColorConfig2,ischange2,costitems);//闂侇剚鎸搁崣锟�2
				String loginfo="";
				for (Entry<Integer, Integer> entry : costitems.entrySet()) {
					if(entry.getKey()>0&&entry.getValue()>0){
						int havenum=bagContainer.getItemNum(entry.getKey(), 0);
						if(havenum<entry.getValue()){
							fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 150058, null);
							return false;
						}
						//闁圭缍佸▍搴ㄦ焼閹惧啿寰�
						int delnum=bagContainer.removeItemById(entry.getKey(), entry.getValue(), fire.log.enums.YYLoggerTuJingEnum.tujing_Value_ranse, entry.getKey(), "閻熸瑦甯熸竟濠囧蓟閹剧懓顥�");
						if(delnum!=entry.getValue()){
							return false;
						}
						loginfo="閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟锟�"+"\t闁圭缍佸▍搴ㄦ焼閹惧啿寰旈柨娑樼灱婢у潡宕稊鐢�"+entry.getKey()+"闁轰椒鍗抽崳锟�"+entry.getValue();
					}
				}
				
				logger.info(loginfo);
				
				//閻犱礁澧介悿鍡涘蓟閹剧懓顥忓ǎ鍥ｅ墲娴硷拷
				prop.setRolecolor1(rolecolorinfo.colorpos1);
				prop.setRolecolor2(rolecolorinfo.colorpos2);
				
				//闂侇偅姘ㄩ悡锟犲捶閻戞ɑ鐝☉鎿冨幘濞堟垿宕楅張鐢甸搨濞存粎灏ㄧ槐婵娿亹閹惧啿顤呭ù婊嗘婢ф寧寰勯弽褑鍩岄柛娆惷�碉拷
				//婵炲鍔嶉崜鐗堟交濞嗘挸娅￠柛婊冭嫰椤撳綊骞嬫搴紓闁哄秮锟芥剚鍤犻柣銊ュ濡炲倿宕愬▎鎾翠粯閻熸洑闃渙leBasicOctets闁革负鍔忕换鏍煂瀹�鍕〃婵烇綀顕ф慨鐐碉拷娑欘殕椤斿矂鏁嶇仦鐐﹂柛锔癸拷锟�:\MT-G\server\server\protocols\move.xml閺夆晜鐟ら柌婊堝础韫囨凹鍞撮梺鎻掔焿缁辨繈鎮抽弶鎸庤含闁稿繐鐗呯粭澶愬礉?
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
				//濞ｅ洦绻傞悺銊╁礆閹峰被锟藉倸顫滄潏顐ょ闁搞儳鍋犻妴鍌氼潨閸欐ü绻嗛柟锟�?
				saveColor(roleid,prop);
				
				fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleid);
				if (team != null){
					team.updateTeamMemberBasic2Others(roleid);
				}
				logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟濠囧箣閹邦剙顫犻柨娑樿嫰缂嶅宕滃鍡欏帬闁肩懓寮堕弻鐔奉浖?"+prop.getRolecolor1()+" "+prop.getRolecolor2());
				return true;
			}
		}.submit();
	}
	
	/**
	 * 濞ｅ洦绻傞悺銊╁蓟閹剧懓顥忛柡鍌濐潐椤拷
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
	 * 閻犱緤绱曢悾濠氭?閻熸洑鑳跺▓鎴︽焼閹惧啿寰旈柡浣峰嵆閸ｏ拷
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

