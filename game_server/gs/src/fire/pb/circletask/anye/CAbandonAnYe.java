
package fire.pb.circletask.anye;
import fire.pb.circletask.CircleTaskManager;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAbandonAnYe__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAbandonAnYe extends __CAbandonAnYe__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		CircleTaskManager.logger.info("闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾叉閻掑﹪鏌曟繛鐐珔缂佺媭鍨堕弻锝夊箣閿濆憛鎾绘煕鐎ｅ墎绉柡灞剧☉閳规垿宕卞Δ濠佺棯闂備浇顕栭崹浼存偋閹捐钃熼柨婵嗩槸缁犲鏌涢幇顖ｅ殝闁归鍏樺畷绋课旈敓浠嬫嫅閻斿吋鐓ラ柣鏂挎惈鏍￠梺鍝勬噽椤牓婀侀梺缁樏Ο濠囧磿韫囨洜纾奸柣妯挎珪閻ㄦ垿鏌熼崣澶屾憙缂佺姵鐩鎾倻閸℃﹩妫ユ繝寰锋澘锟窖呭緤娴犲鐤い鏍仦閸嬪倹绻涢幋娆忕仾闁绘挻娲熼弻宥夊煛娴ｅ憡鐏曟繛鎾寸缁嬫帞鎹㈠☉銏犻唶闁绘梻纭堕幏褰掓⒑闂堟稒鎼愰悗姘煎灦钘濋梺顒�绉甸悡鐔兼煙閾忕懓浠滄い鈺婂墰缁辨帡顢欑喊鍗炲壎濡ょ姷鍋炵敮鈥愁嚕椤曪拷閺佹捇鎮惧畝瀣婵﹩鍘奸崫娲煛瀹�锟介崰鎾舵閹烘嚦鐔告姜閺夊灝鐏佸┑鐘垫暩閸嬬喖宕㈣瀹曨垶宕稿Δ锟介悡姗�鏌熸潏楣冩闁稿﹦鍏橀弻鈩冨緞鐎ｎ亞浠兼繛瀵稿У閹稿啿顫忛搹鍦＜婵妫欓悾鍫曟⒑閹稿孩纾搁柛搴㈠▕閺佹挻绂掔�ｎ偅閿梺闈涚墛閹倸顕ｉ锕�绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹.闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕濂告煥閺冨洦顥夋い蹇ユ嫹" + roleid + "]闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ㄩ弮鍥棄闁跨喕妫勫锟犲蓟閵娾晛鍗抽柣鎰嚋閹烽绮欑拠鐐☉铻ｅ┑鍌濇缂嶅﹪寮幇鏉垮窛妞ゆ挆鍕垫闂傚倷鐒﹂幃鍫曞磹閺嶎灐娲偄閻撳氦鎽曞┑鐐村灟閸ㄥ湱绮诲☉銏＄厪濠电姴绻樺顕�鏌ｅ┑鍥ㄧ妞ゎ亜鍟存俊鍫曞幢濡厧寮抽梻浣侯焾閿曘儵骞冮崒鐐茬伋闁挎洖鍊搁柨銈嗕繆閵堝嫮顦︽繛鍫熺箞濮婂搫效閸パ呬紕闂佽桨鐒﹂幃鍌炲箖閻愬闄勯柛娑樑堥幏娲⒑閼姐倕鏋戝鐟版閹箖顢橀姀锛勫幈闂侀潧顭堥崝宥壦夋径鎰厽闁挎繂娲ら崢鎾煛娴ｈ宕岄柡浣规崌閺佹捇鏁撻敓锟�?:" + questid);
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				RoleAnYeTask rayt = new RoleAnYeTask(roleid);
				rayt.abandonTask();
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 807460;

	public int getType() {
		return 807460;
	}

	public int questid; // 放弃的任务id(暗夜马戏团1080000)

	public CAbandonAnYe() {
	}

	public CAbandonAnYe(int _questid_) {
		this.questid = _questid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(questid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		questid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAbandonAnYe) {
			CAbandonAnYe _o_ = (CAbandonAnYe)_o1_;
			if (questid != _o_.questid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += questid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(questid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAbandonAnYe _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = questid - _o_.questid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

