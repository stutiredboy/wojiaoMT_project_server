
package fire.pb.fushi;

import org.apache.http.client.methods.HttpGet;
import fire.pb.main.Gs;
import fire.pb.state.StateManager;
import gnet.link.Dispatch;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CUpYingYongBaoInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CUpYingYongBaoInfo extends __CUpYingYongBaoInfo__ {
	@Override
	protected void process() {
		// protocol handle
		final int userID = ((Dispatch)this.getContext()).userid;
		final long roleID = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleID < 0)
			return;
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				String gsServer = Gs.serverid;
				FushiManager.logger.info(new StringBuilder().append("CUpYingYongBaoInfo,userID:").append(userID) 
						.append(",roleID:").append(roleID) 
						.append(",openid:").append(openid) 
						.append(",openkey:").append(openkey)
						.append(",paytoken:").append(paytoken)
						.append(",pf:").append(pf)
						.append(",pfkey:").append(pfkey)
						.append(",zoneid:").append(zoneid)
						.append(",platformname:").append(platformname));
				xbean.YingYongBao yyb = xtable.Yingyongbaoinfos.get(userID);
			    if (yyb == null){
			    	yyb = xbean.Pod.newYingYongBao();
			    	xtable.Yingyongbaoinfos.insert(userID, yyb);
			    }
			    
			    //openkey 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼幆褍顣冲☉鎾崇Ф閿熻棄绠嶉崕閬嵥囬鐐插瀭闁稿本绋撶粻鍓э拷鐟板閸犳洜鑺辨繝姘厱闁靛鍎遍敓钘夌秺楠炲牓濡搁妷顔藉缓闂佺硶鍓濋〃鍛不鐠囧樊娓婚柕鍫濆�瑰▍鍥煕韫囨棑鑰跨�殿喖顭峰鎾偄妞嬪海鐛梻浣稿閸嬪懐鎹㈤崒娑欏弿閹肩补妲呭〒濠氭煏閸繂鏆欓柨鐔诲Г濞茬喖鐛繝鍌ゆ建闁跨喕妫勯锝嗙節濮橆厽娅滄繝銏ｆ硾璋╅柍鍝勬噺閻撳繐顭跨捄铏瑰闁告柣鍊濋弻娑樷枎韫囨挸濮坹token濠电姷鏁告慨鐑藉极閹间礁纾婚柣妯款嚙缁犲灚銇勮箛鎾跺缂佺媭鍨堕弻銊╂偆閸屾稑顏�?,SDK缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗘搐閻ㄦ垿鏌熷畡鏉挎Щ妞ゎ偅绻堥幃鈩冩償閿濆嫬瀵查梻鍌欒兌閹虫挾绮诲澶婂瀭闁芥ê顦介崵鏇灻归悩宸剰閹喖鎮峰鍐炬█鐎殿喚顭堥埢搴ㄥ箻缁瀚奸梻浣告啞閹告槒銇愰崘鈺冾洸闁告挆鍛紳閻庡箍鍎遍幊蹇浰夊鍫熷亗闁靛牆顦伴悡銉︾節闂堟稒顥炴い銉у仱閺屾稑鈻庤箛鏇狀啋闂佸搫鐭夌紞渚�骞冮姀銈呭窛濠电姴瀚崵鎺楁⒒娴ｈ姤纭堕柛鐘查叄閺佹捇鎮剧仦鑺ョ彙闂佹悶鍊栭悷鈺呭蓟瀹ュ洨纾兼俊顖濐嚙绾炬娊姊烘潪鎵妽闁圭懓娲顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷
			    if (platformname.equals("qq")) {
			    	yyb.setOpenkey(paytoken);
			    }
			    else {
			    	yyb.setOpenkey(openkey);
			    }
			    
			    yyb.setOpenid(openid);
			    
//			    yyb.setPaytoken(paytoken);
			    
			    yyb.setPf(pf);
			    yyb.setPfkey(pfkey);
			    yyb.setZoneid(gsServer);
			    yyb.setPlatformname(platformname);
			    
			    try {
					final HttpGet request = FushiManager.makeYybGetCurrencyRequest(userID, roleID);
					if (request != null) {
						Gs.getHttpClient().execute(request, 
							new YybGetCurrencyHandler(userID, roleID){
							@Override
							protected boolean executeHandler(int balance, int genBalance, int firstSave, int saveAmt){
//								FushiManager.refreshRoleFushi(roleID, balance, saveAmt);
								return true;
							}
						});
					} else {
						StateManager.logger.error(new StringBuilder("roleId=").append(roleID).append("闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵閸犳牜澹曢崸妤佺厵闁诡垳澧楅ˉ澶愬箹閺夋埊韬柡灞诲�濋幊婵嬪箥椤旇偐澧┑鐐茬摠缁瞼绱炴繝鍥ц摕婵炴垯鍨瑰敮闂佹寧绻傞幊搴ㄢ�栨径鎰拺缂佸瀵ч幑锝夋煕閻樺磭澧电�殿喖顭烽弫鎾绘偐閼碱剦妲伴梻渚�娼ч…鍫ュ磿婵犳艾绠柣銈庡灛娴滃綊鏌熼悜妯虹仸閺夊牆鐗撳Λ鍛搭敃閵忊�愁槱缂備礁顑嗙敮鈥崇暦閹扮増鍋ㄩ柛娑橈工娴狀厼鈹戦悙鍙夘棞缂佺粯鍔欓、鏃堫敃閵堝洨锛滈梺缁樏壕顓熸櫠閻㈠憡鐓涚�癸拷鐎ｎ剛鐦堥悗瑙勬礀瀹曨剟鍩㈡惔銈囩杸闁哄啫鍊烽柇顖氣攽鎺抽崐妤佹叏閻戣棄纾婚柣鎰惈閸ㄥ倿鏌涜閵囨粓鏁撻幋鎺旑槮闁宠閰ｉ獮瀣偐閻㈠灚娈介梻浣告惈椤﹂亶宕戦悢鍛婃珷婵°倧鎷锋い顓炴健閺佹挻绂掔�ｎ偀鎷绘繛杈剧秬濡嫰宕ラ悷鎵虫斀妞ゆ梻鍋撻弳顒傦拷瑙勬礃缁诲牓鐛�ｎ喗鏅濋柨鐔烘櫕婢规洟宕稿Δ浣哄幘婵犳鍠楅崝鏇㈡晸閼恒儳澧甸柨婵堝仱瀵挳濮�閿涘嫬寮抽梻浣虹帛濞叉牠宕愰崷顓ㄦ嫹濮樼偓瀚�"));
					}
				}
				catch(Exception e){
					StateManager.logger.error(new StringBuilder("roleId=").append(roleID).append("闂傚倸鍊搁崐椋庣矆娴ｉ潻鑰块梺顒�绉撮崒銊ф喐閺冨牆绠栨繛宸簻鎯熼梺闈涱樈閸犳绱炴惔銏㈢瘈闁汇垽娼ф牎闂佺厧缍婄粻鏍ь嚕閸涘﹦鐟归柨鐔剁矙瀵寮撮姀鐘诲敹濠电娀娼уú銊╁Χ椤愶附鈷戠憸鐗堝俯濡垿鏌涜箛鏃撹�跨�殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�? 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁躲倕霉閻樺樊鍎忕紒鐘侯潐閵囧嫰骞囬埡渚婃嫹閺嶎偓鎷峰顒夌吋闁哄矉缍佸顒勫垂椤旇棄锟筋垶姊虹粙鍖″姛闁轰礁顭峰濠氭晲婢跺浜滈梺鍛婄☉閿曪箓宕欓垾鎰佹富闁靛牆绻掔粔顒佺箾閸涱喗绀堥柟骞垮灩閳藉濮�閻樿鏁归梻浣虹帛濡啴藟閹惧顩烽柤娴嬫櫇绾捐棄銆掑顒佹悙婵炲懏锕㈤弻娑樷枎韫囨挻娈婚悗娈垮櫘閸嬪﹤鐣烽幒妤佸�烽柤纰卞墻濡插爼鏌ｉ悢鍝ョ煀缂佸鎸抽、姘跺Ψ閳轰胶顔掗柣搴ㄦ涧閹芥粓顢欓弴銏♀拺闁圭娴风粻鎾绘煙閸愯尙绠崇紒顔肩墕閻ｆ繈宕熼鍌氬箞闂備浇顫夐崕鎶筋敋椤撶姷涓嶉柡宥庡幗閸婄敻姊婚崼鐔衡棨闁稿鍨婚敓鍊燁潐濞插繘宕濇惔銊︽櫢闁兼亽鍎抽埦浣广亜椤撶偞鍠樼�规洩缍佸畷鍗烆渻缂佹ɑ鏉搁梻浣虹帛閸旀洖顕ｉ崼鏇�澶愭倷閻戞ê浠哄銈嗙墬椤ㄥ棗鈻嶆繝鍕舵嫹鐟欏嫭绀堥柡浣筋嚙椤曪絾绂掔�ｅ灚鏅ｉ梺缁樻煥閹碱偄顕ｉ幎鑺モ拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟�?") , e);
				}
			    
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812492;

	public int getType() {
		return 812492;
	}

	public java.lang.String openid;
	public java.lang.String openkey;
	public java.lang.String paytoken;
	public java.lang.String pf;
	public java.lang.String pfkey;
	public java.lang.String zoneid;
	public java.lang.String platformname;

	public CUpYingYongBaoInfo() {
		openid = "";
		openkey = "";
		paytoken = "";
		pf = "";
		pfkey = "";
		zoneid = "";
		platformname = "";
	}

	public CUpYingYongBaoInfo(java.lang.String _openid_, java.lang.String _openkey_, java.lang.String _paytoken_, java.lang.String _pf_, java.lang.String _pfkey_, java.lang.String _zoneid_, java.lang.String _platformname_) {
		this.openid = _openid_;
		this.openkey = _openkey_;
		this.paytoken = _paytoken_;
		this.pf = _pf_;
		this.pfkey = _pfkey_;
		this.zoneid = _zoneid_;
		this.platformname = _platformname_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(openid, "UTF-16LE");
		_os_.marshal(openkey, "UTF-16LE");
		_os_.marshal(paytoken, "UTF-16LE");
		_os_.marshal(pf, "UTF-16LE");
		_os_.marshal(pfkey, "UTF-16LE");
		_os_.marshal(zoneid, "UTF-16LE");
		_os_.marshal(platformname, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		openid = _os_.unmarshal_String("UTF-16LE");
		openkey = _os_.unmarshal_String("UTF-16LE");
		paytoken = _os_.unmarshal_String("UTF-16LE");
		pf = _os_.unmarshal_String("UTF-16LE");
		pfkey = _os_.unmarshal_String("UTF-16LE");
		zoneid = _os_.unmarshal_String("UTF-16LE");
		platformname = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CUpYingYongBaoInfo) {
			CUpYingYongBaoInfo _o_ = (CUpYingYongBaoInfo)_o1_;
			if (!openid.equals(_o_.openid)) return false;
			if (!openkey.equals(_o_.openkey)) return false;
			if (!paytoken.equals(_o_.paytoken)) return false;
			if (!pf.equals(_o_.pf)) return false;
			if (!pfkey.equals(_o_.pfkey)) return false;
			if (!zoneid.equals(_o_.zoneid)) return false;
			if (!platformname.equals(_o_.platformname)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += openid.hashCode();
		_h_ += openkey.hashCode();
		_h_ += paytoken.hashCode();
		_h_ += pf.hashCode();
		_h_ += pfkey.hashCode();
		_h_ += zoneid.hashCode();
		_h_ += platformname.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(openid.length()).append(",");
		_sb_.append("T").append(openkey.length()).append(",");
		_sb_.append("T").append(paytoken.length()).append(",");
		_sb_.append("T").append(pf.length()).append(",");
		_sb_.append("T").append(pfkey.length()).append(",");
		_sb_.append("T").append(zoneid.length()).append(",");
		_sb_.append("T").append(platformname.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

