
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
				//閸掋倖鏌囬弶鍐閿涘苯褰ч張澶婂簻閸斺晛鎷伴崜顖氬簻娑撹褰叉禒?
				if (clanInfo.getClanmaster() != roleid && clanInfo.getClanvicemaster() != roleid) {
					// 娑撳秵妲告导姘舵毐娑旂喍绗夐弰顖氬娴兼岸鏆�
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160243, null);//閸欘亝婀佹导姘舵毐閹存牕澹囨导姘舵毐閹枫儲婀侀柅澶嬪閺夊啴妾�
					return false;
				}
				if(selecttype!=fire.pb.clan.PClanMedicItem.SELECT_BASE
						&&selecttype!=fire.pb.clan.PClanMedicItem.SELECT_DOUBLE&&selecttype!=fire.pb.clan.PClanMedicItem.SELECT_THREE){
					return false;
				}
				
				//閸忣兛绱扮挧鍕櫨娑撳秷鍐婚敍灞炬￥濞夋洑濞囬悽銊︻劃閸旂喕鍏�
				int level = clanInfo.getHouse().get(fire.pb.clan.srv.ClanManage.DrugStone);
				fire.pb.clan.SClanDrugstore drugstone =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanDrugstore.class).get(level);
				if (drugstone == null){
					return false;
				}
				//閹稿顫夐崚娆撴閺堥缚宓傞崫?
				int cost=0;
				if(selecttype==fire.pb.clan.PClanMedicItem.SELECT_THREE){//娑撳?宥勯獓閼�?
					//閸掋倖鏌囩挧鍕櫨鐢喕绱扮挧鍕櫨閺勵垰鎯佹径?
					cost=drugstone.getTrimoney();
				}else if(selecttype==fire.pb.clan.PClanMedicItem.SELECT_DOUBLE){//2閸婂秳楠囬懡?
					cost=drugstone.getDoublemoney();
				}
				//閸掋倖鏌囩挧鍕櫨鐢喕绱扮挧鍕櫨閺勵垰鎯佹径?
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
				
				//閹绘劗銇氳ぐ鎾冲彆娴兼氨甯虹�硅泛鍨忛幑銏℃閿涘矁鐨熼悽銊ヮ吂閹撮顏幓鎰仛鐞涒問D閿�?160442閿涘苯寮弫?1娑撹櫣甯虹�硅泛鎮曠粔甯礉閸欏倹鏆�2娑撳搫缍嬮崜宥勯獓閼筋垱膩瀵繈??
				// 闁氨鐓￠崗顑跨窗娑擃厾娈戦崗鍕吹
				PropRole memberProp = new PropRole(roleid, true);
				MessageMgr.psendMsgNotifyWhileCommit(clanInfo.getMembers().keySet(), 160442, 0,Arrays.asList(memberProp.getName(),getTypeName(selecttype)));
				
				return true;
			}
		}.submit();
		
		
	}
	
	/**
	 * 閼惧嘲绶辨禍褑宓傜猾璇茬��  287娑撱倕??    288娑撳??  289濮濓絽鐖�
	 * @param type
	 * @return
	 */
	public static String getTypeName(int type){
		String name="";
		if(type==fire.pb.clan.PClanMedicItem.SELECT_THREE){
			name=StringConstant.ID2String("娑撳??",288);
		}else if(type==fire.pb.clan.PClanMedicItem.SELECT_DOUBLE){
			name=StringConstant.ID2String("娑撱倕??",287);
		}else{
			name=StringConstant.ID2String("濮濓絽鐖�",289);
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

