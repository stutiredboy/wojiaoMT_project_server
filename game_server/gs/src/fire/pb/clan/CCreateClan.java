
package fire.pb.clan;

import fire.pb.clan.srv.ClanBaseManager;
import fire.pb.talk.MessageMgr;
import fire.pb.util.CheckName;
import fire.pb.util.StringValidateUtil;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCreateClan__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CCreateClan extends __CCreateClan__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0 || clanname == null || clanaim == null)
			return;
		int resultCode = CheckName.checkValid(clanname);
		if (resultCode == CheckName.WORD_ILLEGALITY) {
			MessageMgr.sendMsgNotify(roleid, 142260, null);
			return;
		} else if (resultCode == CheckName.SPECIAL_WORD_TOO_MANY) {
			MessageMgr.sendMsgNotify(roleid, 142294, null);
			return;
		} else if (resultCode == CheckName.NONE_CHARACTER) {
			MessageMgr.sendMsgNotify(roleid, 146238, null);
			return;
		}

		if (!StringValidateUtil.checkValidName(clanaim)) {
			MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾捐鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ｅΟ鍏兼毄闁绘帒鍚嬬换娑㈠箻鐎电鏆￠梺褰掝棑閸忔﹢寮婚悢纰辨晬婵ê宕埅鐢告倵鐟欏嫭绀�鐎规洦鍓熼崺銉﹀緞婵炵偓鐎婚棅顐㈡处濞叉牜绱為敓锟�?$缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷鍫曟晸閽樺鏆ｆ鐐叉喘椤㈡瑩宕ｉ妷褏鎲归梻鍌欒兌椤㈠﹪骞撻鍡楃筏缂備焦顭囬々鑼喐閻楀牆绗氶柣鎾存礈閹插憡鎯旈妸锝忔嫹閸愵喖骞㈡繛鎴烆焽閺屟冾渻閵堝棗绗掗悗姘煎弮瀹曟劙宕奸弴鐔哄幗闂佸綊鍋婇崹浼存偂閹邦厹浜滈柕澶堝労濡叉椽鏌熼崣澶嬪�愮�殿喖鐖奸獮鎰償椤旀枻绱楅梻鍌欑閹碱偊寮甸鍌滅煓闁硅揪绠戦悡鈥愁熆鐠轰警鐓繛绗哄姂閺屾盯顢曢敐鍥╃暠缂備焦鍞荤紞渚�寮婚敐澶嬪亜闁告縿鍎抽悡浣糕攽閻橆喖鐏柨鏇樺灩閻ｇ兘骞囬弶鍧楁暅濠德板�ч幏鐑芥煢閸愵亜鏋涢柡灞剧☉閳藉宕￠悙瀵镐憾濠电姵顔栭崹浼搭敋椤撶姵顫曢柟鐑樻閹风兘鏁愭惔鈥崇缂佺虎鍘奸悥濂稿蓟濞戞鐔烘嫚閸欏鐧佹繝娈垮枛閿曘儱顪冩禒瀣畺闁斥晛鍟崕鐔兼⒔閸ヮ剙鏄ラ柣鎰劋閳锋垿鏌熺粙鍨劉缁剧偓鎮傞弻娑欑節閸愵亞鐣烘繛锝呮搐閿曨亜鐣疯ぐ鎺濇晝闁靛繈鍨婚悰顕�姊虹拠鎻掑毐缂傚秴妫濆畷妤�顫滈敓钘夘嚕閹间礁鍐�妞ゆ挾鍠庨敓钘夌仛椤ㄣ儵鎮欓懠顑胯檸闂佸憡姊瑰畝鎼佸蓟閿濆憘鏃堟晸閽樺）娑樷攽閸℃瑦娈鹃梺闈涚箞閸婃洜绮荤紒妯镐簻闁哄啫鍊瑰▍鏇㈡煕濡粯鍊愭慨濠呮閹瑰嫰濡搁妷锔惧綒闂備胶鎳撻崵鏍箯閿燂拷?$缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷鍫曟晸閽樺鏆ｆ鐐叉喘椤㈡瑩宕ｉ妷褏鎲归梻鍌欒兌椤㈠﹪骞撻鍡楃筏缂備焦顭囬々鑼喐閻楀牆绗氶柣鎾卞劦閺岋綁寮撮悙璇ф嫹閸︻叏鎷峰鐐
		if(clanaim.contains("$")){
			MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		int chineseCnt = 0;
		int otherCnt = 0;
		for (int i = 0; i < clanname.length(); i++) {
			// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓缃曢梻浣告惈濞层劍鎱ㄦ搴ｇ焼濠电姴鍊甸弨浠嬫煟濡搫绾ч柟鍏煎姍閺屾稓浠︾拠鎻掝潎闂佸搫鏈ú鐔风暦閻撳簶鏀介柛銉戝嫭顏ら梺鑽ゅ枑缁本顨ラ幖渚囨晪闁靛鏅涚粈瀣亜閹烘垵锟藉鎯侀崼銉︹拺闁告稑锕ユ径鍕煕閹炬潙鍝虹�规洑鍗抽弫鎾绘晸閿燂拷
			String regexStr = CheckName.getRegexStr();
			if (clanname.substring(i, i + 1).matches(regexStr)) {
				chineseCnt++;
			} else {
				otherCnt++;
			}
		}
		double total = chineseCnt + otherCnt / 2.0;
		int factionNameLen = 5;
		if (total < 2 || total > factionNameLen) {
			MessageMgr.sendMsgNotify(roleid, 145088, null);
			return;
		}
		if (clanaim.length() == 0) {
			MessageMgr.sendMsgNotify(roleid, 145091, null);
			return;
		}
		if (clanaim.length() > fire.pb.clan.srv.ClanManage.AIMWORD_MAX) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 145112, null);
			return;
		}
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				return ClanBaseManager.getInstance().createClan(roleid, clanname, clanaim);
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808450;

	public int getType() {
		return 808450;
	}

	public java.lang.String clanname; // 公会名字
	public java.lang.String clanaim; // 公会宗旨（公告）

	public CCreateClan() {
		clanname = "";
		clanaim = "";
	}

	public CCreateClan(java.lang.String _clanname_, java.lang.String _clanaim_) {
		this.clanname = _clanname_;
		this.clanaim = _clanaim_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(clanname, "UTF-16LE");
		_os_.marshal(clanaim, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		clanname = _os_.unmarshal_String("UTF-16LE");
		clanaim = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CCreateClan) {
			CCreateClan _o_ = (CCreateClan)_o1_;
			if (!clanname.equals(_o_.clanname)) return false;
			if (!clanaim.equals(_o_.clanaim)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += clanname.hashCode();
		_h_ += clanaim.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(clanname.length()).append(",");
		_sb_.append("T").append(clanaim.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

