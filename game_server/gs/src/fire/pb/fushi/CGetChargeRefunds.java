
package fire.pb.fushi;

import org.apache.log4j.Logger;

import fire.pb.RoleConfigManager;
import fire.pb.common.SCommon;
import fire.pb.main.Gs;
import gnet.DataBetweenAuAnyAndGS;
import gnet.DeliveryManager;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGetChargeRefunds__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGetChargeRefunds extends __CGetChargeRefunds__ {
	private static Logger logger=Logger.getLogger("RECHARGE");
	
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		final int userid = ((gnet.link.Dispatch) this.getContext()).userid;
		if (roleid < 0 || userid <0) {
			logger.error("CGetChargeRefunds.userid:" + userid + ",roleid:" + roleid + ".闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弮锟介幏婵嬪箯妞嬪海绠旀繛鎴炆戞径鍕煕鐎ｅ墎绡�闁哄本娲樼换娑㈡倷椤掍胶褰熼梻浣芥〃缁�渚�顢栨径鎰摕闁哄洢鍨归柋鍥ㄧ節閸偄濮堥弫鍫ユ⒒娴ｅ憡鎯堥柟閿嬪灴楠炲繘鏁撻敓锟�?");
			return;
		}
		final SCommon cc = RoleConfigManager.getRoleCommonConfig(309);
		if (cc == null) {
			logger.error("CGetChargeRefunds.闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣告贡婢ф顭垮Ο鑲╀笉闁绘绮悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?闂傚倸鍊搁崐宄懊归崶銊х彾闁割偁鍎荤紞鏍ь熆鐠轰警鍎戦柣婵嗙埣閺屾盯鍩勯崘顏呭櫘婵炴垶鎸哥粔褰掑蓟閿涘嫪娌悹鍥ㄥ絻婵海绱撴担鍝勭彙闁搞儯鍔庨崢鎾绘⒑閸涘﹦绠撻悗姘煎墯缁傚秹鎮欓悜妯煎幗闂佺懓鎼粔鍫曟儗濞嗘挻鐓涚�癸拷鐎ｎ剛袦闂佺硶鏅涚�氭澘鐣峰锟芥俊姝岊槺闁诡噯缍佸缁樻媴閸︻厽鑿囬梺绋挎捣閸庛倗绮嬪澶嬫櫜濠㈢櫢绠戝ú顓㈠极閹剧粯鏅搁柨鐕傛嫹?濠电姷鏁告慨鐢割敊閺嶎厼绐楁俊銈呮噳閿熸枻绠撳畷濂告偄缂堢姷鐭掗梻浣哥秺濡法绮堟担鎰熝囧蓟閵壯冨絼闂佹悶鍎崝搴ㄥ煢娓氾拷閺屽秹鏌ㄧ�ｎ亞浼岄梺鍝勫閸撴繂顕ラ崟顒佸劅闁靛繆鍋撻敓钘夛躬閺屻倝宕ｆ径灞解拰濠殿喖锕ら幖顐ｆ櫏闂佹悶鍎滃鍡楊伓閻熸粍妫冮悰顔跨疀濞戞瑦娅㈤梺璺ㄥ櫐閹凤拷309濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姵婢樿灃闁挎繂鎳庨弳鐐烘煕鎼达紕效闁哄矉缍佸浠嬪Ω閵夛附娈!userid:" + userid + ",roleid:" + roleid);
			return;
		}
		int rolelevel = xtable.Properties.selectLevel(roleid);
		if(rolelevel < (cc == null ? 0 : Integer.parseInt(cc.getValue()))) {
			logger.error("CGetChargeRefunds.缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弬鍨挃闁活厽鐟╅弻鐔封枎闄囬褍煤閿曪拷椤洩绠涘☉鎺炴嫹閿曞倸绠ｉ柣鎴濇閺咁剟姊婚崒娆戝妽闁诡喖鐖煎畷鏇㈩敍閻愯尙顦柟鍏肩暘閸斿矂鎮″┑瀣厸闁告劑鍔屾禍浼存煙妞嬪骸鍘撮柣娑卞櫍瀹曞綊顢欓悡搴經闂傚倷鑳剁划顖炪�冮崨顓囨稑鈹戦崱娆愭婵炲鍘ч悺銊╁疾閹间焦鐓ラ柣鏇炲�圭�氾拷,濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹告悂鈥旈崘顏庢嫹閿濆簼绨绘い鎺嬪灮閿熷�燁潐濞叉﹢鎮￠敓鐘茶摕闁绘梻灏ㄩ幏鐑芥偨濞堣法鍔告繛瀵稿缁犳垿婀佸┑鐘诧攻閸旀牜锟芥熬鎷�?!userid:" + userid + ",roleid:" + roleid);
			return;
		}
		
		xbean.AUUserInfo userinfo = xtable.Auuserinfo.select(userid);
		if(userinfo == null) {
			logger.error("CGetChargeRefunds.AUUserInfo濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姵婢樿灃闁挎繂鎳庨弳鐐烘煕鎼达紕效闁哄矉缍佸浠嬪Ω閵夛附娈!userid:" + userid + ",roleid:" + roleid);
			return;
		}
		String username = userinfo.getUsername();
		DataBetweenAuAnyAndGS ausnd = new DataBetweenAuAnyAndGS();
		ausnd.flag = DataBetweenAuAnyAndGS.GS_TO_AuAny;
		ausnd.qtype = 9003;
		ausnd.userid = userid;
		OctetsStream temp = new OctetsStream();
		temp.marshal(username);
		temp.marshal(Gs.serverid);
		ausnd.info = temp;
		DeliveryManager.getInstance().send(ausnd);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812485;

	public int getType() {
		return 812485;
	}


	public CGetChargeRefunds() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGetChargeRefunds) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGetChargeRefunds _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

