
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
				//闁告帇鍊栭弻鍥级閸愵喗顎欓柨娑樿嫰瑜把囧嫉婢跺﹤绨婚柛鏂烘櫅閹蜂即宕滈姘盎濞戞捁顕цぐ鍙夌?
				if (clanInfo.getClanmaster() != roleid && clanInfo.getClanvicemaster() != roleid) {
					// 濞戞挸绉靛Σ鍛婂濮樿埖姣愬☉鏃傚枍缁楀寮伴姘棇濞村吋宀搁弳锟�
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160243, null);//闁告瑯浜濆﹢浣瑰濮樿埖姣愰柟瀛樼墪婢瑰洦瀵煎鑸垫瘣闁规灚鍎插﹢渚�鏌呮径瀣仴闁哄鍟村锟�
					return false;
				}
				if(selecttype!=fire.pb.clan.PClanMedicItem.SELECT_BASE
						&&selecttype!=fire.pb.clan.PClanMedicItem.SELECT_DOUBLE&&selecttype!=fire.pb.clan.PClanMedicItem.SELECT_THREE){
					return false;
				}
				
				//闁稿浚鍏涚槐鎵導閸曨垰娅ㄥ☉鎾崇Х閸愬鏁嶇仦鐐骏婵炲娲戞繛鍥偨閵婏富鍔冮柛鏃傚枙閸忥拷
				int level = clanInfo.getHouse().get(fire.pb.clan.srv.ClanManage.DrugStone);
				fire.pb.clan.SClanDrugstore drugstone =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanDrugstore.class).get(level);
				if (drugstone == null){
					return false;
				}
				//闁圭顦抽～澶愬礆濞嗘挻顓归柡鍫ョ細瀹撳倿宕�?
				int cost=0;
				if(selecttype==fire.pb.clan.PClanMedicItem.SELECT_THREE){//濞戞挸顦�?瀹ュ嫰鐛撻柤锟�?
					//闁告帇鍊栭弻鍥╂導閸曨垰娅ㄩ悽顖ｅ枙缁辨壆鎸ч崟顖氭闁哄嫷鍨伴幆浣瑰緞?
					cost=drugstone.getTrimoney();
				}else if(selecttype==fire.pb.clan.PClanMedicItem.SELECT_DOUBLE){//2闁稿﹤绉虫鍥嚒?
					cost=drugstone.getDoublemoney();
				}
				//闁告帇鍊栭弻鍥╂導閸曨垰娅ㄩ悽顖ｅ枙缁辨壆鎸ч崟顖氭闁哄嫷鍨伴幆浣瑰緞?
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
				
				//闁圭粯鍔楅妵姘炽亹閹惧啿褰嗗ù鍏兼皑鐢櫣锟界娉涢崹蹇涘箲閵忊剝顦ч柨娑樼焷閻ㄧ喖鎮介妸銉悅闁规挳顥撻顒勫箵閹邦喓浠涢悶娑掑晱D闁匡拷?160442闁挎稑鑻顒勫极?1濞戞捁娅ｇ敮铏癸拷纭呮硾閹洜绮旂敮顔剧闁告瑥鍊归弳锟�2濞戞挸鎼紞瀣礈瀹ュ嫰鐛撻柤绛嬪灡鑶╃�殿喖绻�??
				// 闂侇偅姘ㄩ悡锟犲礂椤戣法绐楀☉鎿冨幘濞堟垿宕楅崟顐ゅ惞
				PropRole memberProp = new PropRole(roleid, true);
				MessageMgr.psendMsgNotifyWhileCommit(clanInfo.getMembers().keySet(), 160442, 0,Arrays.asList(memberProp.getName(),getTypeName(selecttype)));
				
				return true;
			}
		}.submit();
		
		
	}
	
	/**
	 * 闁兼儳鍢茬欢杈ㄧ瑜戝畵鍌滅尵鐠囪尙锟斤拷  287濞戞挶鍊�??    288濞戞挸顦�??  289婵繐绲介悥锟�
	 * @param type
	 * @return
	 */
	public static String getTypeName(int type){
		String name="";
		if(type==fire.pb.clan.PClanMedicItem.SELECT_THREE){
			name=StringConstant.ID2String("濞戞挸顦�??",288);
		}else if(type==fire.pb.clan.PClanMedicItem.SELECT_DOUBLE){
			name=StringConstant.ID2String("濞戞挶鍊�??",287);
		}else{
			name=StringConstant.ID2String("婵繐绲介悥锟�",289);
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

