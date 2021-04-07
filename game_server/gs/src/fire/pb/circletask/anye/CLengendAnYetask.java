
package fire.pb.circletask.anye;

import fire.pb.circletask.CircleTaskManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLengendAnYetask__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CLengendAnYetask extends __CLengendAnYetask__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;	
		CircleTaskManager.logger.info("闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾叉閻掑﹪鏌曟繛鐐珔缂佺媭鍨堕弻锝夊箣閿濆憛鎾绘煕鐎ｅ墎绉柡灞剧☉閳规垿宕卞Δ濠佺棯闂備浇顕栭崹浼存偋閹捐钃熼柨婵嗩槸缁犲鏌涢幇顖ｅ殝闁归鍏橀獮鏍ㄦ媴閸︻厾鏆㈤梻鍌氬�风粈渚�宕ョ�ｎ剛鐭堥柟缁㈠枛閻ょ偓绻涢幋娆忕伄闁跨喍绮欓弨杈ㄧ┍婵犲洦鍊锋い蹇撳閹风兘寮介‖鈥虫惈椤撳吋寰勬繝鍕叄婵犵數濮撮敃銈夊箠閹扮増鍎楀鑸靛姈閻撴瑩鏌ｉ幋鐐嗘垿鍩涢幇鐗堝�垫慨姗嗗幖閸濇椽鏌″畝锟介崰鎾舵閹烘嚦鐔告姜閺夊灝鐏佸┑鐘垫暩閸嬬喖宕㈣瀹曨垶宕稿Δ锟介悡姗�鏌熸潏楣冩闁稿﹦鍏橀弻鈩冨緞鐎ｎ亞浠兼繛瀵稿У閹稿啿顫忛搹鍦＜婵妫欓悾鍫曟⒑閹稿孩纾搁柛搴㈠▕閺佹挻绂掔�ｎ偅閿梺闈涚墛閹倸顕ｉ锕�绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹.闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕濂告煥閺冨洦顥夋い蹇ユ嫹" + roleid + "]闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅絾绻濋崹顐㈠閻庨潧鐭傚娲捶椤撶偛濡哄┑顔硷工缂嶅﹪鏁愰悙鍝勫嵆闁靛骏绱曢崢閬嶆⒑鐟欏嫬绀冮悘蹇旂懇瀹曟繂顓兼径瀣拷鍨叏濮楀棗骞楅柣銊﹀灩缁辨帗娼忛妸锕�纾抽悗瑙勬礀閵堝憡鎱ㄩ敓浠嬫煟濡：婊堝磿瀹曞洦顫曢柟鐑樻尭缁剁偛鈹戦悩鏌ヮ�楁繛鍫濆缁辨挻鎷呮禒瀣懙闂佸湱鎳撳ú顓烆嚕椤愶箑绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹?" + taskpos + "闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径宀嬫嫹閻у憡瀚归梺璺ㄥ枍缁瑩寮幘缁樺殟闁靛／鍛綆闂備礁鎲￠〃鍡樼箾婵犲倻鏆︽繛宸簼閸婄兘鏌涘┑鍡楊伃闁哥偛鐖煎娲濞戣鲸肖闂佺瀛╂繛濠囥�佸Ο濂芥椽顢旈崪浣诡棅婵＄偑鍊栭崝鎴﹀垂閻戞ê绶為柛鏇ㄥ灡閻撴瑦鎱ㄥ┑鍡氬闁告艾婀辩槐鎺楊敊閼测晛鈪遍梺璺ㄥ枑閺嬭崵绱為崱娑欐櫢濠殿喗鍔曢悘鈺冪磽瀹ュ拑韬鐐插暣閸╋繝宕掑鍛殞婵＄偑鍊栭悧妤冨枈瀹ュ鏁婇柛鏇ㄥ亐閺�浠嬫煟濡澧柛鐔风箻閺屾盯鏁愭惔锛勪桓濡ょ姷鍋涚换姗�寮幘缁樻櫢闁跨噦鎷�!");
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				RoleAnYeTask rayt = new RoleAnYeTask(roleid);
				rayt.startLegendAnYeTask(taskpos);
				rayt.refreshAnYeTasks(taskpos);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 807458;

	public int getType() {
		return 807458;
	}

	public int taskpos; // 任务栏位

	public CLengendAnYetask() {
	}

	public CLengendAnYetask(int _taskpos_) {
		this.taskpos = _taskpos_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(taskpos);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		taskpos = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLengendAnYetask) {
			CLengendAnYetask _o_ = (CLengendAnYetask)_o1_;
			if (taskpos != _o_.taskpos) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += taskpos;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(taskpos).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CLengendAnYetask _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = taskpos - _o_.taskpos;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

