
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
					logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟锟�"+"\t闁轰胶澧楀畵渚�鏌ㄥ▎鎺濆殩");
					return false;
				}
				//闁告帇鍊栭弻鍥嚄鐏炶棄鐦堕梺鎻掔灱濞堟垹锟藉湱濮锋晶鍧楀及椤栨碍鍎婇悗娑櫭﹢锟�
				PetColumn petColumn = new PetColumn(roleid, PetColumnTypes.PET,false);
				fire.pb.pet.Pet pet = petColumn.getPet(petkey);
				if(pet==null){
					logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟濠囨儍閸曨偆鏋冮柣妞绘櫃缁楀锟芥稒锚濠�锟�"+"\t闁轰胶澧楀畵渚�鏌ㄥ▎鎺濆殩");
					return false;
				}
				PetInfo petInfo = petColumn.getPetInfo(petkey);
				if (petInfo == null){
					logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟濠囨儍閸曨偆鏋冮柣妞绘櫃缁楀锟芥稒锚濠�锟�"+"\t闁轰胶澧楀畵渚�鏌ㄥ▎鎺濆殩");
					return false;
				}
				//闊洤鎳橀妴蹇涘及椤栨艾缍佺�殿喖鍊诲▓鎴狅拷鍦Х婢у潡骞嶅鍛濞寸姰鍎查悡瀣嚌?
				if(pet.getKind()!=PetTypeEnum.VARIATION){
					logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟锟�"+"\t闂佹寧鐟ㄩ锟�1");
					return false;
				}
				if(petInfo.getPetdye1()==colorpos1){
					logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟锟�"+"\t鐟滅増鎸告晶鐘诲蓟閹剧懓顥忛柡鍌濐潐椤㈠秹鎯勭粙鎸庡�遍柨娑樻湰濡倝妫�?闁哄本鎹佹竟锟�");
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160380, null);
					return false;
				}
				//闁告帇鍊栭弻鍥╋拷鍦Х婢у潡寮婚幘鐟邦棌闁哄倽顫夐、宄眅t.getBaseId()
				if(!isCanUseColor(pet.getBaseId(),colorpos1)){
					logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟锟�"+"\t闂佹寧鐟ㄩ锟�2");
					return false;
				}
				
				//闁告帇鍊栭弻鍥焼閹惧啿寰旈柡鍕靛灠閹焦寰�?
				ItemMaps bagContainer = Module.getInstance().getItemMaps(roleid, BagTypes.BAG, false);//闁硅鍔樼粋鎺楁儍閸曨亝鐪介柤鍐茶嫰鐎垫锟藉湱鎳撳▍锟�
				if(bagContainer==null){
					logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟锟�"+"\t闁煎啿鑻�垫﹢鏌ㄥ▎鎺濆殩");
					return false;
				}
				SRoleRColorConfig sRoleRColorConfig1=sRoleRColorConfig.get(colorpos1);
				if(sRoleRColorConfig1==null){
					logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"闁哄本鎹佹竟锟�"+"\t闁轰胶澧楀畵渚�鏌ㄥ▎鎺濆殩");
					return false;
				}
				int cost=sRoleRColorConfig1.getItemnum();
				int itemcode=sRoleRColorConfig1.getItemcode();
				
				int havenum=bagContainer.getItemNum(itemcode, 0);
				if(havenum<cost){
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 150058, null);
					return false;
				}
				//闁圭缍佸▍搴ㄦ焼閹惧啿寰�
				int delnum=bagContainer.removeItemById(itemcode, cost, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_ranse, itemcode, "閻庡湱濮锋晶鍧楀蓟閹剧懓顥�");
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
				// 闁告帡鏀遍弻濠勶拷鍦Х婢ф寧绌遍埄鍐х礀
				final SRefreshPetInfo refresh = new SRefreshPetInfo(pet.getProtocolPet());
				psendWhileCommit(roleid, refresh);
				
				//闁圭粯鍔楅妵姘跺蓟閹剧懓顥忛柟瀛樺姇婵拷
				fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160432, null);
				
				
				logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"閻庡湱濮锋晶鍧楀蓟閹剧懓顥忛柡灞炬崄婢瑰﹪鏁嶇仦鐣屾瀮闁绘绠y"+petkey+"\t閻庡湱濮锋晶鍧楀触瀹ュ泦鐎則"+petInfo.getName()+"\t闁圭缍佸▍搴ㄦ焼閹惧啿寰旈柨娑樼灱婢у潡宕稊鐢�"+itemcode+"闁轰椒鍗抽崳锟�"+cost+"鐟滅増鎸告晶鐘诲蓟閹剧懓顥忛柡鍌濐潐椤拷 "+colorpos1);
				return true;
			}
		}.submit();
		
		
	}
	
	/**
	 * 闁告帇鍊栭弻鍥╋拷鍦Х婢у潡寮伴姘剨闁告瑯鍨禍鎺楀蓟閹剧懓顥�
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

