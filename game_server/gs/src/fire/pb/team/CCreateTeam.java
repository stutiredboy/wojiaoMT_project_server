
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCreateTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎处缁绘繂顕ラ柨瀣凡闁跨喕濮ゅú鐔风暦椤栨稑顕遍悗娑櫭崜鐟扳攽閻愬弶顥為柟绋款煼閹�斥枎閹炬潙锟界敻鏌ｉ姀鈽嗗晱闁绘帡绠栧畷顖炲传閵壯咃紲闂佽鍨庨崘顏嗏棨缂傚倷绶￠崰妤呮偡閳轰緡鍤曞┑鐘崇閸嬪嫰鏌ｉ幘铏崳妞わ富鍙冮幃宄邦煥閸愵亞顔婇梺杞扮贰閸犳牠鍩ユ径鎰潊闁挎稑瀚敮妤呮⒒閸屾瑧顦﹂柣蹇旂箞椤㈡牠宕卞Δ鍐╂閻庣櫢鎷烽柛鏇ㄥ墰閸樻悂鎮楅惂鍛婂闁诲函缍嗛崜娑溾叺闂佽瀛╅鏍闯椤曪拷瀹曟粓鎮㈡搴㈡閻熸粎澧楃敮鈺呭极鐎ｎ喗鐓曟繛鎴濆船閺嬬喐銇勯弮锟介崹鍦閹捐纾兼慨姗嗗墾閹烽攱顦版惔銏╁仺闂侀潧鐗嗛ˇ顖滅不椤栫偞鐓熼柟杈剧到琚氶梺缁樻尪閸庣敻寮婚敐澶婂嵆闁绘劘顕滈幏鐑藉捶椤撱劍瀚规慨妯煎亾鐎氾拷
 * @author changhao
 *
 */
public class CCreateTeam extends __CCreateTeam__ {
	@Override
	protected void process() {
		// protocol handle	
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long leaderRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (leaderRoleId < 0)
			return;
		/*
		gnet.link.Role linkrole = gnet.link.Onlines.getInstance().find(leaderRoleId);
		if (linkrole != null)
		{
			int userid = linkrole.getUserid();
			if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�妞ゆ劦婢�缁墎绱撴笟濠冨婵犮垼娉涢鍕崲閸℃稒鐓忛柛顐ｇ箖閸ｆ椽鏌涢敐鍛础缂佽鲸甯￠幃鈺呮濞戞帗鐎伴梻浣告惈閻ジ宕伴弽顓犲祦闁糕剝鍑瑰Σ楣冩⒑閹稿海鈽夌紒澶婄秺瀵鏁撻悩鎻掕�垮銈嗘尵婵兘寮抽妶鍛斀妞ゆ梻銆嬮弨缁樹繆閻愭壆鐭欓柕鍡曠铻栭柛娑卞枟濞呫垽姊烘导娆戝埌闁活剙銈搁幆宀勫箻缂佹ê锟界敻鏌ｉ姀鐘冲暈濞存嚎鍊濋弻鐔风暋閺夋寧些濡炪値鍋呯换鍫ャ�佸Δ浣哥窞閻庯絾鎸堕崝鎴濐潖閾忚宕夐柕濞垮劜閻忓棗鈹戦埥鍡椾簻閻庢凹鍠氶崚鎺旀嫚瀹割喖鎮戞繝銏ｆ硾閿曪箓鏁嶉悢鍏尖拻濞撴艾娲ゆ晶顔剧磼婢跺鍤熺紒顔碱煼閹晝鎷犻懠顒夊晣闂備礁婀遍埛鍫ュ储妤ｅ啫鍌ㄦ繝濠傛噽绾剧晫锟藉箍鍎卞Λ娑欐櫠閻㈠憡鐓涢悘鐐靛亾缁�瀣拷瑙勬礈閸樠囧煘閹达箑绠涙い鎾筹紡閸ャ劉鎷虹紓鍌欑劍钃遍悘蹇曞缁绘盯鎳犻锟介弸娑氾拷娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�? by changhao
			{
				DayPayManager.getInstance().ProcessDayPay(userid, leaderRoleId);
			}					
		}
		*/
		
		new PCreateTeam(leaderRoleId).submit();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794433;

	public int getType() {
		return 794433;
	}


	public CCreateTeam() {
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
		if (_o1_ instanceof CCreateTeam) {
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

	public int compareTo(CCreateTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

