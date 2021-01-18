
package fire.pb;

import java.util.Map;

import org.apache.log4j.Logger;

import xbean.PetInfo;
import fire.pb.item.BagTypes;
import fire.pb.item.ItemMaps;
import fire.pb.item.Module;
import fire.pb.main.ConfigManager;
import fire.pb.pet.PetAttr;
import fire.pb.pet.PetColumn;
import fire.pb.pet.PetColumnTypes;
import fire.pb.pet.PetTypeEnum;
import fire.pb.pet.SRefreshPetInfo;
import fire.pb.role.SRoleRColorConfig;
import mkdb.Procedure;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqUsePetColor__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqUsePetColor extends __CReqUsePetColor__ {
	public static final Logger logger = Logger.getLogger("SYSTEM");
	@Override
	protected void process() {
		// protocol handle
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
				//閸掋倖鏌囬懗灞藉瘶闁插瞼娈戠�圭姷澧块弰顖氭儊鐎涙ê婀�
				PetColumn petColumn = new PetColumn(roleid, PetColumnTypes.PET,false);
				fire.pb.pet.Pet pet = petColumn.getPet(petkey);
				if(pet==null){
					logger.info("鐟欐帟澹奿d "+roleid+"閺屾捁澹婇惃鍕枃閻椻晙绗夌�涙ê婀�"+"\t閺佺増宓侀柨娆掝嚖");
					return false;
				}
				PetInfo petInfo = petColumn.getPetInfo(petkey);
				if (petInfo == null){
					logger.info("鐟欐帟澹奿d "+roleid+"閺屾捁澹婇惃鍕枃閻椻晙绗夌�涙ê婀�"+"\t閺佺増宓侀柨娆掝嚖");
					return false;
				}
				//韫囧懘銆忛弰顖氬綁瀵倻娈戠�圭姷澧块幍宥呭讲娴犮儲鐓嬮懝?
				if(pet.getKind()!=PetTypeEnum.VARIATION){
					logger.info("鐟欐帟澹奿d "+roleid+"閺屾捁澹�"+"\t闁挎瑨顕�1");
					return false;
				}
				if(petInfo.getPetdye1()==colorpos1){
					logger.info("鐟欐帟澹奿d "+roleid+"閺屾捁澹�"+"\t瑜版挸澧犻弻鎾瑰閺傝顢嶉惄绋挎倱閿涘本妫ら棁?閺屾捁澹�");
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160380, null);
					return false;
				}
				//閸掋倖鏌囩�圭姷澧块弻鎾瑰閺傝顢峱et.getBaseId()
				if(!isCanUseColor(pet.getBaseId(),colorpos1)){
					logger.info("鐟欐帟澹奿d "+roleid+"閺屾捁澹�"+"\t闁挎瑨顕�2");
					return false;
				}
				
				//閸掋倖鏌囬柆鎾冲徔閺勵垰鎯佹径?
				ItemMaps bagContainer = Module.getInstance().getItemMaps(roleid, BagTypes.BAG, false);//閹规劘绂掗惃鍕眽閼冲苯瀵樼�圭懓娅�
				if(bagContainer==null){
					logger.info("鐟欐帟澹奿d "+roleid+"閺屾捁澹�"+"\t閼冲苯瀵橀柨娆掝嚖");
					return false;
				}
				SRoleRColorConfig sRoleRColorConfig1=sRoleRColorConfig.get(colorpos1);
				if(sRoleRColorConfig1==null){
					logger.info("鐟欐帟澹奿d "+roleid+"閺屾捁澹�"+"\t閺佺増宓侀柨娆掝嚖");
					return false;
				}
				int cost=sRoleRColorConfig1.getItemnum();
				int itemcode=sRoleRColorConfig1.getItemcode();
				
				int havenum=bagContainer.getItemNum(itemcode, 0);
				if(havenum<cost){
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 150058, null);
					return false;
				}
				//閹碉綁娅庨柆鎾冲徔
				int delnum=bagContainer.removeItemById(itemcode, cost, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_ranse, itemcode, "鐎圭姷澧块弻鎾瑰");
				if(delnum!=cost){
					return false;
				}
				petInfo.setPetdye1(colorpos1);
				petInfo.setPetdye2(colorpos2);
				SReqUsePetColor sReqUsePetColor=new SReqUsePetColor();
				sReqUsePetColor.colorpos1=colorpos1;
				sReqUsePetColor.colorpos2=colorpos2;
				sReqUsePetColor.petkey=petkey;
				Procedure.psendWhileCommit(roleid, sReqUsePetColor);
				// 閸掗攱鏌婄�圭姷澧挎穱鈩冧紖
				final SRefreshPetInfo refresh = new SRefreshPetInfo(pet.getProtocolPet());
				psendWhileCommit(roleid, refresh);
				
				//閹绘劗銇氶弻鎾瑰閹存劕濮�
				fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160432, null);
				
				
				logger.info("鐟欐帟澹奿d "+roleid+"鐎圭姷澧块弻鎾瑰閺屾捁澹婇敍灞界枃閻楋箤ey"+petkey+"\t鐎圭姷澧块崥宥囆瀄t"+petInfo.getName()+"\t閹碉綁娅庨柆鎾冲徔閿涘瞼澧块崫涔甦"+itemcode+"閺佷即鍣�"+cost+"瑜版挸澧犻弻鎾瑰閺傝顢� "+colorpos1);
				return true;
			}
		}.submit();
		
		
	}
	
	/**
	 * 閸掋倖鏌囩�圭姷澧块弰顖氭儊閸欘垯浜掗弻鎾瑰
	 * @param petId
	 * @param colorpos
	 * @return
	 */
	public boolean isCanUseColor(int petId,int colorpos){
		Map<Integer, PetAttr> confs = ConfigManager.getInstance().getConf(PetAttr.class);
		if (confs != null) {
			PetAttr conf = confs.get(petId);
			if (conf != null) {
				String str=conf.getColorselect();
				if(str==null){
					return false;
				}
				String pos[]=str.split(";");
				if(pos==null){
					return false;	
				}
				for(String p:pos){
					String pos1[]=p.split(",");
					if(colorpos==Integer.parseInt(pos1[0])){
						return true;
					}
				}
				
			}
		}
		return false;
	}
	
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786545;

	public int getType() {
		return 786545;
	}

	public int petkey; // 宠物ID
	public int colorpos1; // 部位1
	public int colorpos2; // 部位2

	public CReqUsePetColor() {
	}

	public CReqUsePetColor(int _petkey_, int _colorpos1_, int _colorpos2_) {
		this.petkey = _petkey_;
		this.colorpos1 = _colorpos1_;
		this.colorpos2 = _colorpos2_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(petkey);
		_os_.marshal(colorpos1);
		_os_.marshal(colorpos2);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		petkey = _os_.unmarshal_int();
		colorpos1 = _os_.unmarshal_int();
		colorpos2 = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqUsePetColor) {
			CReqUsePetColor _o_ = (CReqUsePetColor)_o1_;
			if (petkey != _o_.petkey) return false;
			if (colorpos1 != _o_.colorpos1) return false;
			if (colorpos2 != _o_.colorpos2) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += petkey;
		_h_ += colorpos1;
		_h_ += colorpos2;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(petkey).append(",");
		_sb_.append(colorpos1).append(",");
		_sb_.append(colorpos2).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqUsePetColor _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = petkey - _o_.petkey;
		if (0 != _c_) return _c_;
		_c_ = colorpos1 - _o_.colorpos1;
		if (0 != _c_) return _c_;
		_c_ = colorpos2 - _o_.colorpos2;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

