
package fire.pb.circletask;



import fire.pb.circletask.SpecialQuestState;
import fire.pb.fushi.FushiManager;
import fire.pb.npc.NpcServiceManager;
import fire.pb.npc.SNpcServiceMapping;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRenXingCircleTask__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRenXingCircleTask extends __CRenXingCircleTask__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		/*
		if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�妞ゆ劦婢�缁墎绱撴笟濠冨婵犮垼娉涢鍕崲閸℃稒鐓忛柛顐ｇ箖閸ｆ椽鏌涢敐鍛础缂佽鲸甯￠幃鈺呮濞戞帗鐎伴梻浣告惈閻ジ宕伴弽顓犲祦闁糕剝鍑瑰Σ楣冩⒑閹稿海鈽夌紒澶婄秺瀵鏁撻悩鎻掕�垮銈嗘尵婵兘寮抽妶鍛斀妞ゆ梻銆嬮弨缁樹繆閻愭壆鐭欓柕鍡曠铻栭柛娑卞枟濞呫垽姊烘导娆戝埌闁活剙銈搁幆宀勫箻缂佹ê锟界敻鏌ｉ姀鐘冲暈濞存嚎鍊濋弻鐔风暋閺夋寧些濡炪値鍋呯换鍫ャ�佸Δ浣哥窞閻庯絾鎸堕崝鎴濐潖閾忚宕夐柕濞垮劜閻忓棗鈹戦埥鍡椾簻閻庢凹鍠氶崚鎺旀嫚瀹割喖鎮戞繝銏ｆ硾閿曪箓鏁嶉悢鍏尖拻濞撴艾娲ゆ晶顔剧磼婢跺鍤熺紒顔碱煼閹晝鎷犻懠顒夊晣闂備礁婀遍埛鍫ュ储妤ｅ啫鍌ㄦ繝濠傛噽绾剧晫锟藉箍鍎卞Λ娑欐櫠閻㈠憡鐓涢悘鐐靛亾缁�瀣拷瑙勬礈閸樠囧煘閹达箑绠涙い鎾筹紡閸ャ劉鎷虹紓鍌欑劍钃遍悘蹇曞缁绘盯鎳犻锟介弸娑氾拷娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�? by changhao
		{
			boolean ok = fire.pb.fushi.DayPayManager.getInstance().CheckDayPayWithLevel(roleid);
			if (ok == false)
			{
				FushiManager.logger.error("CRenXingCircleTask: 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸缂備礁顑嗙敮锟犲极瀹ュ绫嶉柛顐ゅ枔閸橀箖姊洪崫鍕垫Ъ婵炲娲樼粋鎺楀閵堝棛鍘梺绯曞墲閿氱紒妤佸笚閵囧嫰顢曢敐鍥╃杽闂佽鍠楅悷鈺呫�佸Δ鍛櫢濞寸姴顑愰弫鍌炴煕椤愶絾绀冮柍閿嬪笒闇夐柨婵嗘川閹藉倿鏌涢妶鍛殻闁哄本鐩幃鈺呭箛娴ｅ湱鏉归梻浣筋嚃閸犳岸宕楀锟藉畷娲晸閻樻彃绐涘銈嗘尵婵兘寮抽锔解拻濞达綀娅ｇ敮娑㈡煕閵娧冨付閾荤偤鏌涢弴銊ュ箻婵☆偒鍨抽幉鎼佸籍閸繆鎽曞┑鐐村灍閹冲洭鏁撻弬銈囩暤妤犵偛顑呴埞鎴﹀炊閳猴拷缁岸姊婚崒娆愮グ婵炲娲熷畷浼村箛閺夊灝鍤戞繝鐢靛У閼瑰墽绮婚鐐寸叆闁绘洖鍊圭�氾拷");
				return;
			}
		}
		*/			
		
		SNpcServiceMapping conf = NpcServiceManager.getInstance().getServiceMappingByServiceID(serviceid);
		if(null == conf)
			return;
		final int userid = ((gnet.link.Dispatch) this.getContext()).userid;
		new RenXingCircleTaskProc(userid, roleid, conf.getParam1(), SpecialQuestState.DONE, moneytype).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 807451;

	public int getType() {
		return 807451;
	}

	public int serviceid; // 该服务id
	public int moneytype; // 货币类型

	public CRenXingCircleTask() {
	}

	public CRenXingCircleTask(int _serviceid_, int _moneytype_) {
		this.serviceid = _serviceid_;
		this.moneytype = _moneytype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(serviceid);
		_os_.marshal(moneytype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		serviceid = _os_.unmarshal_int();
		moneytype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRenXingCircleTask) {
			CRenXingCircleTask _o_ = (CRenXingCircleTask)_o1_;
			if (serviceid != _o_.serviceid) return false;
			if (moneytype != _o_.moneytype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += serviceid;
		_h_ += moneytype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(serviceid).append(",");
		_sb_.append(moneytype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRenXingCircleTask _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = serviceid - _o_.serviceid;
		if (0 != _c_) return _c_;
		_c_ = moneytype - _o_.moneytype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

