
package fire.pb.fushi.monthcard;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CBuyMonthCard__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡宀嬬秮婵拷闁靛繆鏅濋崝鍝ョ磽娓氬﹥瀚规繝銏ｅ煐閸旀牠鎮￠妷鈺傜厸闁搞儮鏅涙禒婊堟煥閻旇袚闁诡喖鍊搁悾鐑藉箳濡わ拷鎯熼梺鎸庢煥婢т粙顢欓弴銏″�甸柣鐔告緲椤ュ繘鏌涢悩铏闁兼椽浜堕幊锟犲Χ閸モ晪绱查梻浣虹帛閻熼亶骞忛悜鑺ョ厱闁靛鍔嶇涵鐐亜椤愩垻绠伴悡銈嗐亜韫囨挾校闁哄懌鍨藉铏规崉閵娿儲鐏侀梺鍝勬媼閸嬪棝宕氶幒妤�绫嶉柛宀嬮檮鐎氬綊鏌ｉ姀鐘冲暈濞存嚎鍊濋弻鐔风暋閺夋寧些濡炪値鍋呯换鍫ャ�佸Δ浣哥窞閻庯急鍕拷浼存⒒閸屾瑧顦﹂柟纰卞亰瀵敻顢楅崟顒�鍓銈嗙墱閸嬫垿鏁撻幋鎺旂獢鐎殿喗鎸虫慨锟介柍鈺佸暞閻濇娊姊绘担瑙勫仩闁稿寒鍣ｅ鎻掆攽鐎ｎ亝杈堥梺闈涚墕濡梻鎹㈤崱娑欑厪闁割偅绻冮幖鎰板疮閹间焦鈷戠紒瀣仢椤掋垽鏌涢妸銉﹀仴闁绘侗鍠涚粻娑樷槈濞嗘劖顏熼梻浣芥硶閸ｏ箓骞忛敓锟� by changhao
 */
public class CBuyMonthCard extends __CBuyMonthCard__ {
	@Override
	protected void process() {
		// protocol handle
		
 		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
		{
			return;
		}
		
		mkdb.Procedure buymonthcard = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				if (fire.pb.fushi.Module.GetPayServiceType() == 0) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珖闂佽法鍠撻弲顐ゅ垝婵犳凹鏁嶉柣鎰綑閿熺晫鏁婚弻銊モ攽閸℃侗锟芥鏌＄�ｎ偆娲存慨濠傤煼瀹曟帡濡堕崨顖欐闂備礁鎼悮顐﹀礉閹达箑绠栭柕鍫濐槸绾惧吋绻涢幋鐑囦緵濞寸》鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣銏犲閺佸﹪鏌″搴″箹缂佹劖顨嗘穱濠囧Χ閸涱喖娅ら梺鍝勬噺缁诲牓寮诲澶婁紶闁告洦鍓欏▍锝夋⒑缁嬭儻顫﹂柛鏃�鍨垮濠氭晲婢跺娅滈梺鍛婁緱閸ㄨ櫕瀵奸崶銊х闁瑰鍋炵亸顓犵磼婢跺本鏆╅柟骞垮灩閳藉濮�閻樻鍚呮繝鐢靛仜濡鎹㈤幒鎾额浄濡わ絽鍟埛鎴犵磽娴ｈ偂鎴犱焊娴煎瓨鐓熼柣鏂垮级濞呭懏銇勯銏㈢缂佺粯绻傞～婵嬵敆閸曨偅鏆梻鍌欒兌缁垰顫忕憴鍕洸濞寸姴顑嗛弲鎼佹煠閹帒鍔氭繛鎼枤閿熷�燁潐濞诧箓宕归崼鏇犲祦闁哄秲鍔嶆刊鎾煕韫囨搩妲归悗姘冲亹缁辨捇宕掑▎鎴М濡炪倖鍨甸悧鍡涘煝閺冨牆鍗抽柣妯哄悁缁楀姊洪崨濠勬噧妞わ富鍘界粋宥咁煥閸曗晙绨婚梺瑙勫礃濞夋稒绂掗敃鍌涚厱闁绘ɑ鍨氶幋锔猴拷鍐Ψ閳哄倸锟界兘鏌ょ喊鍗炲妞ゆ梹鍨垮娲濞戞瑥顦╅梺鍛婃⒐閻熲晠鎮伴锟介獮鎺楀箣閺冿拷閺傦拷闂備焦鎮堕崕顖炲礉瀹ュ鍋熸繝闈涙閺�浠嬫煟濡櫣浠涢柡鍡忔櫅閳规垿鎮滈崶銊ヮ伓濠电姷鏁搁崑姗�宕犻悩璇茬闁绘娅曢妵婵嗏攽闄囬崺鏍ь嚗閸曨倠鐔虹磼濡崵褰嗗┑鐘垫暩閸嬫盯顢氶銏犲偍鐟滄棃骞冨ú顏勎╅柍杞拌兌閸橀亶姊虹涵鍛涧闂傚嫬瀚伴幃锟犲即閻旇櫣鐦堥梻鍌氱墛缁嬫帡藟濠婂嫨浜滈煫鍥风到娴滄粍銇勯鈥冲姷妞わ箒娅曠换娑㈡嚑椤掞拷閺嬫稓锟芥鍠栭…鐑藉极閹版澘宸濋柛灞剧♁椤ュ牓鏌℃担瑙勫磳闁圭锕ョ粩鐔煎煛閸屾壕妲堥柧缁樼墵閺屾稑鈽夐崡鐐寸亪婵炲濮撮妶绋款潖閾忓湱纾兼俊顖濇娴煎洦绻濆▓鍨灁闁稿﹥绻傞锝夊蓟閵夈儳顔愭繛杈剧到濠�閬嶅矗閸℃稒鈷戠紓浣股戠粈锟介梺绋匡工濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹  by changhao
				{
					boolean ok = fire.pb.fushi.MonthCardManager.getInstance().CheckMonthCardLimit(roleid);
					if (ok)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 190067, null);					
					}
					else
					{
						xbean.Properties prop = xtable.Properties.select(roleid);
						if (prop != null)
						{
							fire.pb.fushi.MonthCardManager.getInstance().ProcessMonthCard(prop.getUserid(), roleid);						
						}
					}					
				}
							
				return true;
			}
		};
		buymonthcard.submit();		
		
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812687;

	public int getType() {
		return 812687;
	}


	public CBuyMonthCard() {
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
		if (_o1_ instanceof CBuyMonthCard) {
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

	public int compareTo(CBuyMonthCard _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

