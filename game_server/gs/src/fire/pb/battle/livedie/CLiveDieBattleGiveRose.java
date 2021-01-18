
package fire.pb.battle.livedie;

import gnet.link.Onlines;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveDieBattleGiveRose__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CLiveDieBattleGiveRose extends __CLiveDieBattleGiveRose__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid <= 0)
			return;
		
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				//閸掋倖鏌囬悙纭呯閻ㄥ嫬缍嶉崓蹇旀Ц閸氾箑鐡ㄩ崷?
				xbean.LDVideoRoleInfoDes des = LiveDieMange.ldvideoroleinfodeslistall.get(vedioid);
				if(des==null){
					return false;
				}
				xbean.LDVideoRoleInfoDesList lDVideoRoleInfoDesList=xtable.Ldvideoroleinfodeslisttab.get(1);
				if(lDVideoRoleInfoDesList==null){
					return false;
				}
				xbean.LDVideoRoleRoseInfoList list = xtable.Ldvideoroleroseinfolisttab.get(roleid);
				if(list==null){
					list=xbean.Pod.newLDVideoRoleRoseInfoList();
					xtable.Ldvideoroleroseinfolisttab.insert(roleid, list);
				}
				xbean.LDVideoRoleRoseInfo lDVideoRoleRoseInfo=list.getLdvideoroleroseinfolist().get(vedioid);
				if(lDVideoRoleRoseInfo==null){
					lDVideoRoleRoseInfo=xbean.Pod.newLDVideoRoleRoseInfo();
					list.getLdvideoroleroseinfolist().put(vedioid, lDVideoRoleRoseInfo);
				}
				if(lDVideoRoleRoseInfo.getRosenum()>=LiveDieMange.GIVE_ROSE_NUM_MAX){
					return false;
				}else{
					//鐠佸墽鐤嗛悳鈺侇啀閻ㄥ嫮鍋ｇ挧鐐搭偧閺�?
					lDVideoRoleRoseInfo.setRosenum(lDVideoRoleRoseInfo.getRosenum()+1);
				}
				//鐠佸墽鐤嗚ぐ鎾冲瑜版洖鍎氶惃鍕仯鐠х偞顐奸弫?
				des.setRosenum(des.getRosenum()+1);
				for(xbean.LDVideoRoleInfoDes desdb:lDVideoRoleInfoDesList.getLdvideoroleinfodeslistall()){
					if(desdb.getVideoid().equals(vedioid)){
						desdb.setRosenum(des.getRosenum());
						break;
					}
				}
				SLiveDieBattleGiveRose sLiveDieBattleGiveRose=new SLiveDieBattleGiveRose();
				sLiveDieBattleGiveRose.vedioid = vedioid;
				sLiveDieBattleGiveRose.rosenum = des.getRosenum();
				sLiveDieBattleGiveRose.roseflag = lDVideoRoleRoseInfo.getRosenum();
				Onlines.getInstance().send(roleid, sLiveDieBattleGiveRose);
				return true;
			};
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793844;

	public int getType() {
		return 793844;
	}

	public java.lang.String vedioid; // 录像id

	public CLiveDieBattleGiveRose() {
		vedioid = "";
	}

	public CLiveDieBattleGiveRose(java.lang.String _vedioid_) {
		this.vedioid = _vedioid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(vedioid, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		vedioid = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLiveDieBattleGiveRose) {
			CLiveDieBattleGiveRose _o_ = (CLiveDieBattleGiveRose)_o1_;
			if (!vedioid.equals(_o_.vedioid)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += vedioid.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(vedioid.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

