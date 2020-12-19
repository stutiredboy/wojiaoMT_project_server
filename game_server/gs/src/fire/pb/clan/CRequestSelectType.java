
package fire.pb.clan;

import java.util.Arrays;





import fire.pb.PropRole;
import fire.pb.clan.srv.ClanManage;
import fire.pb.talk.MessageMgr;
import fire.pb.util.StringConstant;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestSelectType__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRequestSelectType extends __CRequestSelectType__ {
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
				xbean.ClanInfo clanInfo = ClanUtils.getClanInfoById(roleid, true);
				if (clanInfo == null || !clanInfo.getMembers().containsKey(roleid)) {
					return false;
				}
				//鍒ゆ柇鏉冮檺锛屽彧鏈夊府鍔╁拰鍓府涓诲彲浠?
				if (clanInfo.getClanmaster() != roleid && clanInfo.getClanvicemaster() != roleid) {
					// 涓嶆槸浼氶暱涔熶笉鏄壇浼氶暱
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160243, null);//鍙湁浼氶暱鎴栧壇浼氶暱鎷ユ湁閫夋嫨鏉冮檺
					return false;
				}
				if(selecttype!=fire.pb.clan.PClanMedicItem.SELECT_BASE
						&&selecttype!=fire.pb.clan.PClanMedicItem.SELECT_DOUBLE&&selecttype!=fire.pb.clan.PClanMedicItem.SELECT_THREE){
					return false;
				}
				
				//鍏細璧勯噾涓嶈冻锛屾棤娉曚娇鐢ㄦ鍔熻兘
				int level = clanInfo.getHouse().get(fire.pb.clan.srv.ClanManage.DrugStone);
				fire.pb.clan.SClanDrugstore drugstone =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanDrugstore.class).get(level);
				if (drugstone == null){
					return false;
				}
				//鎸夎鍒欓殢鏈鸿嵂鍝?
				int cost=0;
				if(selecttype==fire.pb.clan.PClanMedicItem.SELECT_THREE){//涓夊?嶄骇鑽?
					//鍒ゆ柇璧勯噾甯細璧勯噾鏄惁澶?
					cost=drugstone.getTrimoney();
				}else if(selecttype==fire.pb.clan.PClanMedicItem.SELECT_DOUBLE){//2鍊嶄骇鑽?
					cost=drugstone.getDoublemoney();
				}
				//鍒ゆ柇璧勯噾甯細璧勯噾鏄惁澶?
				if(clanInfo.getMoney()<cost){
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160244, null);
					return false;
				}
				if(selecttype==fire.pb.clan.PClanMedicItem.SELECT_THREE&&clanInfo.getMoney()<ClanManage.getThreeMedicBaseMoney()){
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160244, null);
					return false;
				}
				if(selecttype==fire.pb.clan.PClanMedicItem.SELECT_DOUBLE&&clanInfo.getMoney()<ClanManage.getTwoMedicBaseMoney()){
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160244, null);
					return false;
				}
				
				
				
				
				xbean.MedicItemList itemlist=xtable.Medicitemlisttab.get(clanInfo.getKey());
				if(itemlist==null){
					itemlist=xbean.Pod.newMedicItemList();
					xtable.Medicitemlisttab.insert(clanInfo.getKey(), itemlist);
				}
				itemlist.setSelecttype(selecttype);
				SRequestSelectType sRequestSelectType=new SRequestSelectType();
				sRequestSelectType.selecttype=selecttype;
				gnet.link.Onlines.getInstance().send(roleid, sRequestSelectType);
				
				//鎻愮ず褰撳叕浼氱帺瀹跺垏鎹㈡椂锛岃皟鐢ㄥ鎴风鎻愮ず琛↖D锛?160442锛屽弬鏁?1涓虹帺瀹跺悕绉帮紝鍙傛暟2涓哄綋鍓嶄骇鑽ā寮忋??
				// 閫氱煡鍏細涓殑鍏勫紵
				PropRole memberProp = new PropRole(roleid, true);
				MessageMgr.psendMsgNotifyWhileCommit(clanInfo.getMembers().keySet(), 160442, 0,Arrays.asList(memberProp.getName(),getTypeName(selecttype)));
				
				return true;
			}
		}.submit();
		
		
	}
	
	/**
	 * 鑾峰緱浜ц嵂绫诲瀷  287涓ゅ??    288涓夊??  289姝ｅ父
	 * @param type
	 * @return
	 */
	public static String getTypeName(int type){
		String name="";
		if(type==fire.pb.clan.PClanMedicItem.SELECT_THREE){
			name=StringConstant.ID2String("涓夊??",288);
		}else if(type==fire.pb.clan.PClanMedicItem.SELECT_DOUBLE){
			name=StringConstant.ID2String("涓ゅ??",287);
		}else{
			name=StringConstant.ID2String("姝ｅ父",289);
		}
		return name;
	}
	
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808505;

	public int getType() {
		return 808505;
	}

	public int selecttype; // 选择几倍产药

	public CRequestSelectType() {
	}

	public CRequestSelectType(int _selecttype_) {
		this.selecttype = _selecttype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(selecttype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		selecttype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestSelectType) {
			CRequestSelectType _o_ = (CRequestSelectType)_o1_;
			if (selecttype != _o_.selecttype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += selecttype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(selecttype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestSelectType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = selecttype - _o_.selecttype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

