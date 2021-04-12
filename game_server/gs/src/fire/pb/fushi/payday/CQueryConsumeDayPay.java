
package fire.pb.fushi.payday;

import fire.pb.fushi.DayPayManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CQueryConsumeDayPay__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囩叓閸ャ劍鐓ユい蹇氭硾閳规垿顢欓惌顐簻閻ｇ兘顢楅崟顐㈠亶闁诲海鏁诲濠氬箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︻喖顪冮妶搴′簻妞わ箓浜堕弫鎾寸鐎ｎ偅閿梺闈涚墢椤牓顢氶敐澶婇唶闁哄洨鍋熼娲⒑缂佹◤顏堟倶濮橆儷鎺撴償閵忋垻鐦堥梺姹囧灲濞佳勭閿曞倹鐓欑紒瀣儥閻撳ジ鏌熼鍝勭伈妞ゃ垺顨婂畷鐔碱敃閵堝骸鏁搁梻鍌氬�风粈渚�鎮樺┑瀣垫晞闁归偊鍏橀弸鏂棵归悩宸剱闁绘挾鍠栭弻鐔兼焽閿曪拷閻忕娀鏌ｉ妸锔姐仢鐎殿噮鍋婂畷濂稿Ψ閿旇瀚奸梺鍝勵槺閸嬬偞绔熼崱娑樼鐎广儱顦伴悡鏇㈡煛閸愭寧瀚归梺鑽ゅ枂閸庣敻骞冩ィ鍐╁�婚柦妯侯槺椤㈠懘姊虹紒妯虹仴婵☆偅鐟ラ娆徝洪鍛嫼闂佸憡鎸昏ぐ鍐╃閺嶎厽鐓曢柕濞垮労閻撳ジ鎸婂┑鍥ヤ簻闁规澘鐖煎顕�鏌嶉柨瀣诞闁哄本绋撴禒锕傚礈瑜庨崳顔剧磽娴ｇ懓濮堟慨濠傛贡閹广垹鈽夐姀鈥充簵闁瑰吋鎯岄崰姘跺触鐎ｎ�棃鎮╅棃娑楃捕缂備胶绮敃銏狀嚕椤愶箑绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹? by changhao
 */
public class CQueryConsumeDayPay extends __CQueryConsumeDayPay__ {
	@Override
	protected void process() {
		
		if (yesorno == 1)
		{			
			final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
			if (roleid < 0)
				return;
			mkdb.Procedure queryconsumedaypay = new mkdb.Procedure()
			{
				@Override
				protected boolean process()
				{		
					gnet.link.Role linkrole = gnet.link.Onlines.getInstance().find(roleid);
					if (linkrole != null)
					{
						int userid = linkrole.getUserid();
						if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�妞ゆ劦婢�缁墎绱撴笟濠冨婵犮垼娉涢鍕崲閸℃稒鐓忛柛顐ｇ箖閸ｆ椽鏌涢敐鍛础缂佽鲸甯￠幃鈺呮濞戞帗鐎伴梻浣告惈閻ジ宕伴弽顓犲祦闁糕剝鍑瑰Σ楣冩⒑閹稿海鈽夌紒澶婄秺瀵鏁撻悩鎻掕�垮銈嗘尵婵兘寮抽妶鍛斀妞ゆ梻銆嬮弨缁樹繆閻愭壆鐭欓柕鍡曠铻栭柛娑卞枟濞呫垽姊烘导娆戝埌闁活剙銈搁幆宀勫箻缂佹ê锟界敻鏌ｉ姀鐘冲暈濞存嚎鍊濋弻鐔风暋閺夋寧些濡炪値鍋呯换鍫ャ�佸Δ浣哥窞閻庯絾鎸堕崝鎴濐潖閾忚宕夐柕濞垮劜閻忓棗鈹戦埥鍡椾簻閻庢凹鍠氶崚鎺旀嫚瀹割喖鎮戞繝銏ｆ硾閿曪箓鏁嶉悢鍏尖拻濞撴艾娲ゆ晶顔剧磼婢跺鍤熺紒顔碱煼閹晝鎷犻懠顒夊晣闂備礁婀遍埛鍫ュ储妤ｅ啫鍌ㄦ繝濠傛噽绾剧晫锟藉箍鍎卞Λ娑欐櫠閻㈠憡鐓涢悘鐐靛亾缁�瀣拷瑙勬礈閸樠囧煘閹达箑绠涙い鎾筹紡閸ャ劉鎷虹紓鍌欑劍钃遍悘蹇曞缁绘盯鎳犻锟介弸娑氾拷娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�? by changhao
						{
							fire.pb.fushi.DayPayManager.getInstance().ProcessDayPay(userid, roleid);	
						}					
					}
					
					return true;
				}
			};
			
			queryconsumedaypay.submit();	
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812595;

	public int getType() {
		return 812595;
	}

	public int yesorno; // 0是没有1是消耗 by changhao

	public CQueryConsumeDayPay() {
	}

	public CQueryConsumeDayPay(int _yesorno_) {
		this.yesorno = _yesorno_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(yesorno);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		yesorno = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CQueryConsumeDayPay) {
			CQueryConsumeDayPay _o_ = (CQueryConsumeDayPay)_o1_;
			if (yesorno != _o_.yesorno) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += yesorno;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(yesorno).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CQueryConsumeDayPay _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = yesorno - _o_.yesorno;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

