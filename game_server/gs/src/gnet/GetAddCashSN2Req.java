
package gnet;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GetAddCashSN2Req__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GetAddCashSN2Req extends __GetAddCashSN2Req__ {
	@Override
	protected void process() {
		// protocol handle
		int sn = 0;
		boolean hasRole = false;
		final xbean.User u = xtable.User.select(userid);
		GetAddCashSN2Rep getAddCashSNRep = new GetAddCashSN2Rep();
		long roleid = 0;
		if (u!=null){
            for (Long rid : u.getIdlist()) {
				xbean.Properties prop = xtable.Properties.select(rid);
				if (prop!=null&&prop.getDeletetime()==0) {
					hasRole = true;
					break;
				}
			}			
            roleid = u.getPrevloginroleid();
		}
//		if (force==0&&(hasRole && forbiden())){//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告噰闁诡噣娼ц灒闁煎鍊楅惁鍫ユ⒑闂堟盯鐛滅紒鎻掑⒔濞戝灚銈ｉ崘鈺侊拷鐢告煕椤垵浜滅紒妤佸笚閵囧嫰顢橀悙鏉戞灎闂佽桨鐒﹂幑鍥箖閳轰胶鏆﹂柛銉戝啰顔掗梻鍌氬�峰ù鍥р枖閺囥垹闂柨鏇炲�哥粻顖炴煥閻曞倹瀚�?,濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽幃褰掑炊瑜嶅Λ妯荤箾閹寸偟鎳勫┑顖涙尦閺岋綁鎮㈢粙娆炬缂備焦鍔楅崑銈咁潖濞差亜宸濆┑鐘插暙椤︹晠姊洪幖鐐插闁告濞婇獮鍡欎沪鏉炴寧妫冨畷姗�骞愭惔鈽嗕紦闂備浇宕甸崰鎰熆濮楋拷椤㈡棃顢橀姀锛勫幈闁诲函缍嗘禍宄邦啅閵夆晛纭�闂侇剙绉甸悡鏇熶繆閵堝懎鏆曠紒杈ㄥ▕閺岋綁鎮㈤悡搴濆枈闂佺粯鎸堕崕鐢稿蓟濞戙垹绠涢梻鍫熺♁閻濐噣姊虹捄銊ユ灆濠殿喓鍊濋妴鍐╃節閸パ嗘憰闂佹寧绻傞ˇ顖涘劔闂備焦瀵ч弻銊︽櫠娴犲鍋╅柤娴嬫櫇绾捐棄銆掑顒佹悙闁哄绋掗妵鍕箣濠靛浂妫﹀Δ鐘靛仜缁绘ê鐣烽妸鈺佺骇闁瑰瓨绮庨悙濠囨⒒娴ｅ憡鍟炴繛鍙夛耿瀹曠儤绻濋崟顓濈瑝闂佽宕橀褔鎷戦悢鍏肩厽闁哄倸鐏濋幃鎴︽煛閸涱喗鍊愰柡灞诲姂閹倝宕掑☉姗嗕紦?
//			getAddCashSNRep.sn = sn+1;
//			getAddCashSNRep.userid = userid;
//			getAddCashSNRep.xid = xid;
//			getAddCashSNRep.zoneid = zoneid;
//			getAddCashSNRep.retcode = -19;
//			DeliveryManager.getInstance().send(getAddCashSNRep);
//			return ;
//		}
		if (hasRole && roleid > 0){

			getAddCashSNRep.sn = sn+1;
			getAddCashSNRep.userid = userid;
			getAddCashSNRep.xid = xid;
			getAddCashSNRep.zoneid = zoneid;
			getAddCashSNRep.retcode = 0;
		}else  {
			getAddCashSNRep.sn = sn+1;
			getAddCashSNRep.userid = userid;
			getAddCashSNRep.xid = xid;
			getAddCashSNRep.zoneid = zoneid;
			getAddCashSNRep.retcode = -19;
		}

		DeliveryManager.getInstance().send(getAddCashSNRep);
	}



	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 202;

	public int getType() {
		return 202;
	}

	public int xid;
	public int userid;
	public int zoneid;
	public byte force;

	public GetAddCashSN2Req() {
		xid = -1;
		userid = -1;
		zoneid = -1;
		force = -1;
	}

	public GetAddCashSN2Req(int _xid_, int _userid_, int _zoneid_, byte _force_) {
		this.xid = _xid_;
		this.userid = _userid_;
		this.zoneid = _zoneid_;
		this.force = _force_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(xid);
		_os_.marshal(userid);
		_os_.marshal(zoneid);
		_os_.marshal(force);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		xid = _os_.unmarshal_int();
		userid = _os_.unmarshal_int();
		zoneid = _os_.unmarshal_int();
		force = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GetAddCashSN2Req) {
			GetAddCashSN2Req _o_ = (GetAddCashSN2Req)_o1_;
			if (xid != _o_.xid) return false;
			if (userid != _o_.userid) return false;
			if (zoneid != _o_.zoneid) return false;
			if (force != _o_.force) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += xid;
		_h_ += userid;
		_h_ += zoneid;
		_h_ += (int)force;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(xid).append(",");
		_sb_.append(userid).append(",");
		_sb_.append(zoneid).append(",");
		_sb_.append(force).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GetAddCashSN2Req _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = xid - _o_.xid;
		if (0 != _c_) return _c_;
		_c_ = userid - _o_.userid;
		if (0 != _c_) return _c_;
		_c_ = zoneid - _o_.zoneid;
		if (0 != _c_) return _c_;
		_c_ = force - _o_.force;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

