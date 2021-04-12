
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
//		if (force==0&&(hasRole && forbiden())){//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垹绠婚悗闈涙啞閸ｄ即姊虹拠鈥虫珝婵炰匠鍡欎航闂備胶鍘ч～鏇㈠磹濡ゅ懏鍎婇柛顐犲劜閳锋垿姊婚崼鐔烘创闁绘稒绮庣槐鎺楀箵閹烘垟鎸冨┑鐐村灥閻忔岸濡堕敐澶婄闁宠桨绶ら幏鐑芥偨閸涘﹦鍘卞銈庡幗閸ㄥ灚绂嶅鍛＜婵°倓绀佺粭姘舵煏閸パ冾伃妞ゃ垺锕㈤幃娆撳级閹寸偟浜烽梻鍌欐祰濡椼劑鎮為敃鍌氱闁搞儺鍓欑粻鏍煃鏉炴媽鍏岄柡鍡畵閺屾盯濡烽幋婵嗘殶妞ゆ梹甯″濠氬磼濮橆剨鎷峰畡鎳婂綊宕惰閺嬫牠鏌￠崶銉ョ仼闂傚偆鍨堕弻銊╁即閻愯鎷烽崫銉т笉妞ゆ牜鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婇獮鍐亹閹烘垹鍊為悷婊冪Т铻炴俊顖濆吹缁犻箖鏌熺�电浠ч柟鍐插閳规垿顢涘☉娆忓攭闂佸搫鐭夌紞渚�骞冮姀銏㈢煓婵炲棛鍋撻ˉ瀣磽閸屾瑧鍔嶉柛鏃�顨婂畷鎴﹀Χ閸滀焦缍庡┑鐐叉▕娴滄粌顔忓┑鍡忔斀闁绘ɑ褰冮弳娆愩亜閿旇娅婃慨濠冩そ楠炴牠鎮欓幓鎺濈�遍梻浣告啞椤ㄥ棙绻涙繝鍥╁祦闁糕剝鐟ゅ▽顏堝级閻愭潙顕滄俊顐㈠暙閻ｅ嘲顫滈敓浠嬬嵁閹邦厽鍎熼柍钘夋缁憋箓姊婚崒娆愮グ鐎规洜鏁诲畷浼村箛椤掑鍞靛┑顔筋殣閹烽攱銇勯姀鈩冾棃妞ゃ垺锕㈡慨锟介柨娑樺楠炲牓姊虹拠鎻掑毐缂傚秴妫欑粋宥呯暋闁箑鏅犻梺闈涱槴閺呮稓娑甸敓浠嬫⒒娓氬洤澧紒澶屾暬閹繝寮撮悢鍓佺畾闂侀潧鐗嗛幊搴ㄥ汲閺囩姷纾奸弶鍫涘妼閳绘洟鏌″畝瀣М闁诡喓鍨介幃鈩冩償濠靛棙鐎抽梻鍌欒兌缁垶骞愰崼鏇炵？闁汇垻顭堥拑鐔哥箾閹存瑥鐏╃紒鐘崇洴濮婂宕奸悢琛℃闂佺粯绻嶉崳锝咁潖閾忚宕夐柕濞垮劜閻忓棙绻濆▓鍨灁闁稿﹥绻堟俊鎾礃閳哄啰鐦堥梺鎼炲劀閸℃ɑ鍟洪梻鍌欑劍鐎笛呮崲閸岀倛鍥敍濞戞ê濮呴梻鍌氬�烽悞锔撅拷绗涘洤钃熼柕濠忛檮濞呯姴霉閻樺樊鍎愰柛瀣ф櫊閺屻倕霉鐎ｎ偅鐝栫紒鐐礃濡嫰濡撮幒鎴僵妞ゆ帊鐒﹂幃娆撴⒑閸濆嫷鍎愮紒瀣浮婵＄敻宕熼姘鳖吅濠电娀娼уù鍌毼涢敃锟借灃闁绘﹢娼ф禒婊呯磼缂佹◤顏堟偩閻戣棄惟闁宠桨鑳舵鍥⒑閻熸壆鎽犵紒顔奸叄閹瑦绻濋崶銊㈡嫽婵炶揪绲介幉锟犲疮閻愬绠鹃柛娆忣檧閼拌法锟借娲滈崕銈囨崲濠靛绀嬫い鎾寸箘閻熸繈姊绘担绛嬫綈鐎规洘锕㈤、姘愁樄闁归攱鍨块幃銏ゅ礂閼测晛骞楅梻浣告惈閸婃悂鎮樺┑瀣畺闁硅揪闄勯悡娑㈡煕濞戝崬鏋熼柛濠冨姍閺岋紕浠︾拠鎻掝潎闂佽鍠撻崐婵嗙暦閹烘垟妲堟慨妤�妫旂槐锟�?
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

