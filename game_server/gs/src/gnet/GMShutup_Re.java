
package gnet;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GMShutup_Re__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GMShutup_Re extends __GMShutup_Re__ {
	@Override
	protected void process() {
		// protocol handle
		if (retcode == 0){
			new mkdb.Procedure(){
				public boolean process(){
					final long now = System.currentTimeMillis();
					xtable.Userid2forbidtime.remove(dstuserid);
					if(forbid_time <= 0)
						return true;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞楅梻渚�娼х换鍫ュ春閸曨垱鍊块柛鎾楀懐锛滈梺褰掑亰閸欏骸鈻撳鍫熺厸鐎癸拷閿熶粙宕伴弽顓犲祦鐎广儱顦介弫濠勭棯閹峰矂鍝烘慨锝咁樀濮婄粯鎷呮笟顖滃姼濡炪倖鍨堕崹褰掑箲閵忕姭鏀介柛鈾�鏅涘▓銊╂⒑閸撴彃浜濇繛鍙夌墵閺屽宕堕妸锕�寮垮┑顔筋殔濡鐛Δ鍛厽婵犻潧娲ㄦ晶杈╃磼鏉堛劍灏扮紒妤冨枑缁绘繈宕橀…鎴滅处濠电姷鏁告慨鐑藉极閸涘﹥鍙忛悗娑櫭閬嶆煕濞戞粌鐒藉ù婊冪秺閺岀喖鎮滃Ο璇查瀺濠电偛鎳忕划鎾愁潖濞差亜绠归柣鎰絻婵姊洪崫鍕拷鎼佸磹閸ф鏋侀柟鍓х帛鐎电姴顭块懜鐢殿灱闁告凹鍋婂娲传閸曨厾鍔圭紓浣介哺濞茬喖寮幘璇叉闁靛牆娲ㄦ牎濠电偛鐡ㄧ划搴ㄥ磻閻愬搫鐤鹃柕澶涚細缁诲棝鏌曢崼婵囨悙閸熸悂姊虹粙娆惧剳闁稿鍊濋獮鍐槻閾绘牠鏌ㄩ悢鍓佺煓闁炽儻绠撳畷鍫曨敂閸℃瑦婢戞繝鐢靛仦閸ㄥ爼鈥﹂崶顑﹀洭顢橀姀鈥充画濠电姴锕ら崯鎾矗閸曨叏鎷风憴鍕闁搞劌銈歌棟閻熸瑥瀚崣蹇撯攽閻樻彃锟藉綊骞嗛崼銉﹀亗闁靛牆顦伴崑锝夋煕閵夛絽濡肩紒鑼跺吹缁辨帡鎮╅崹顐㈡畬濡炪値浜滈崯瀛樹繆閹壆鐤�闁规崘鍩栬闂傚倷鐒﹂幃鍫曞礉韫囨挴鏋栨繛鎴欏灪閺呮繈鏌曡箛銉х？闁荤喎缍婇弻銊╂偄缂佹﹩妫勫銈庡亜缁绘劗鍙呭銈呯箰鐎氼噣顢欓崶顒佺厵闁煎湱澧楄ぐ褏绱掗幓鎺撳仴闁诡噣绠栭幃浠嬪川婵炵偓瀚肩紓鍌氬�烽悞锕佹懌闂佺粯鎸堕崕鍙夌┍婵犲浂鏁冮柨婵嗘川閻ゅ嫰姊虹紒妯圭繁闁革綇缍侀悰顕�骞掑Δ锟界粻鐘绘煣韫囷絽浜濇い銉ョ墦閺屸剝鎷呯憴鍕瀺缂備礁鍊圭敮鐐烘晸閺傘倗绉靛ù婊呭仱钘濋柍鍝勬噺閳锋垹绱撴担鐧镐緵闁绘帞鏅槐鎺楊敋閸涱厾浠搁梺璇″櫙缁绘繃淇婇悜钘夌厸闁稿本绮岄獮妤呮⒒娴ｅ憡鎯堟繛灞傚姂瀹曟垵鈽夐姀鈩冩闂佽姤锚椤︽壆鎷归敓鐘崇叆闁绘棁顕ц闂佺粯妫忛崜鐔肩嵁韫囨稒鏅搁柨鐕傛嫹
					xbean.forbidinfo forbid = xbean.Pod.newforbidinfo();
					forbid.setForbidtime(forbid_time*1000 + now);
					xtable.Userid2forbidtime.add(dstuserid, forbid);
					return true;
				}
			}.submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 357;

	public int getType() {
		return 357;
	}

	public int retcode;
	public int dstuserid;
	public int forbid_time;

	public GMShutup_Re() {
	}

	public GMShutup_Re(int _retcode_, int _dstuserid_, int _forbid_time_) {
		this.retcode = _retcode_;
		this.dstuserid = _dstuserid_;
		this.forbid_time = _forbid_time_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(retcode);
		_os_.marshal(dstuserid);
		_os_.marshal(forbid_time);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		retcode = _os_.unmarshal_int();
		dstuserid = _os_.unmarshal_int();
		forbid_time = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GMShutup_Re) {
			GMShutup_Re _o_ = (GMShutup_Re)_o1_;
			if (retcode != _o_.retcode) return false;
			if (dstuserid != _o_.dstuserid) return false;
			if (forbid_time != _o_.forbid_time) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += retcode;
		_h_ += dstuserid;
		_h_ += forbid_time;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(retcode).append(",");
		_sb_.append(dstuserid).append(",");
		_sb_.append(forbid_time).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GMShutup_Re _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = retcode - _o_.retcode;
		if (0 != _c_) return _c_;
		_c_ = dstuserid - _o_.dstuserid;
		if (0 != _c_) return _c_;
		_c_ = forbid_time - _o_.forbid_time;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

