
package fire.pb.fushi;

import org.apache.http.client.methods.HttpGet;
import fire.pb.main.Gs;
import gnet.link.Dispatch;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqFushiInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqFushiInfo extends __CReqFushiInfo__ {
	@Override
	protected void process() {
		final int userID = ((Dispatch)this.getContext()).userid;
		final long roleID = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleID < 0)
			return;
		FushiManager.logger.info("CReqFushiInfo:userid:" + userID + ",roleid:" + roleID);
		if (fire.pb.fushi.Module.getIsYYBUser(userID)){
			try {
				final HttpGet request = FushiManager.makeYybGetCurrencyRequest(userID, roleID);
				if(request != null) {
					Gs.getHttpClient().execute(request, 
						new YybGetCurrencyHandler(userID, roleID) {
						@Override
						protected boolean executeHandler(int balance, int genBalance, int firstSave, int saveAmt){
							return true;
						}
					});
				} 
				else {
					FushiManager.logger.error(new StringBuilder("roleId=").append(roleID).append("闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵閸犳牜澹曢崸妤佺厵闁诡垳澧楅ˉ澶愬箹閺夋埊韬柡灞诲�濋幊婵嬪箥椤旇偐澧┑鐐茬摠缁瞼绱炴繝鍥ц摕婵炴垯鍨瑰敮闂佹寧绻傞幊搴ㄢ�栨径鎰拺缂佸瀵ч幑锝夋煕閻樺磭澧电�殿喖顭烽弫鎾绘偐閼碱剦妲伴梻渚�娼ч…鍫ュ磿婵犳艾绠柣銈庡灛娴滃綊鏌熼悜妯虹仸閺夊牆鐗撳Λ鍛搭敃閵忊�愁槱缂備礁顑嗙敮鈥崇暦閹扮増鍋ㄩ柛娑橈工娴狀厼鈹戦悙鍙夘棞缂佺粯鍔欓、鏃堫敃閵堝洨锛滈梺缁樏壕顓熸櫠閻㈠憡鐓涚�癸拷鐎ｎ剛鐦堥悗瑙勬礀瀹曨剟鍩㈡惔銈囩杸闁哄啫鍊烽柇顖氣攽鎺抽崐妤佹叏閻戣棄纾婚柣鎰惈閸ㄥ倿鏌涜閵囨粓鏁撻幋鎺旑槮闁宠閰ｉ獮瀣偐閻㈠灚娈介梻浣告惈椤﹂亶宕戦悢鍛婃珷婵°倧鎷锋い顓炴健閺佹挻绂掔�ｎ偀鎷绘繛杈剧秬濡嫰宕ラ悷鎵虫斀妞ゆ梻鍋撻弳顒傦拷瑙勬礃缁诲牓鐛�ｎ喗鏅濋柨鐔烘櫕婢规洟宕稿Δ浣哄幘婵犳鍠楅崝鏇㈡晸閼恒儳澧甸柨婵堝仱瀵挳濮�閿涘嫬寮抽梻浣虹帛濞叉牠宕愰崷顓ㄦ嫹濮樼偓瀚�"));
				}
			}
			catch(Exception e){
				FushiManager.logger.error(new StringBuilder("roleId=").append(roleID).append("闂傚倸鍊搁崐椋庣矆娴ｉ潻鑰块梺顒�绉撮崒銊ф喐閺冨牆绠栨繛宸簻鎯熼梺闈涱樈閸犳绱炴惔銏㈢瘈闁汇垽娼ф牎闂佺厧缍婄粻鏍ь嚕閸涘﹦鐟归柨鐔剁矙瀵寮撮姀鐘诲敹濠电娀娼уú銊╁Χ椤愶附鈷戠憸鐗堝俯濡垿鏌涜箛鏃撹�跨�殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�? 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁躲倕霉閻樺樊鍎忕紒鐘侯潐閵囧嫰骞囬埡渚婃嫹閺嶎偓鎷峰顒夌吋闁哄矉缍佸顒勫垂椤旇棄锟筋垶姊虹粙鍖″姛闁轰礁顭峰濠氭晲婢跺浜滈梺鍛婄☉閿曪箓宕欓垾鎰佹富闁靛牆绻掔粔顒佺箾閸涱喗绀堥柟骞垮灩閳藉濮�閻樿鏁归梻浣虹帛濡啴藟閹惧顩烽柤娴嬫櫇绾捐棄銆掑顒佹悙婵炲懏锕㈤弻娑樷枎韫囨挻娈婚悗娈垮櫘閸嬪﹤鐣烽幒妤佸�烽柤纰卞墻濡插爼鏌ｉ悢鍝ョ煀缂佸鎸抽、姘跺Ψ閳轰胶顔掗柣搴ㄦ涧閹芥粓顢欓弴銏♀拺闁圭娴风粻鎾绘煙閸愯尙绠崇紒顔肩墕閻ｆ繈宕熼鍌氬箞闂備浇顫夐崕鎶筋敋椤撶姷涓嶉柡宥庡幗閸婄敻姊婚崼鐔衡棨闁稿鍨婚敓鍊燁潐濞插繘宕濇惔銊︽櫢闁兼亽鍎抽埦浣广亜椤撶偞鍠樼�规洩缍佸畷鍗烆渻缂佹ɑ鏉搁梻浣虹帛閸旀洖顕ｉ崼鏇�澶愭倷閻戞ê浠哄銈嗙墬椤ㄥ棗鈻嶆繝鍕舵嫹鐟欏嫭绀堥柡浣筋嚙椤曪絾绂掔�ｅ灚鏅ｉ梺缁樻煥閹碱偄顕ｉ幎鑺モ拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟�?") , e);
			}
		} 
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812490;

	public int getType() {
		return 812490;
	}


	public CReqFushiInfo() {
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
		if (_o1_ instanceof CReqFushiInfo) {
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

	public int compareTo(CReqFushiInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

