
package fire.msp.move;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GNotifyMapPetInfo__ extends mkio.Protocol { }

/** GS 向 地图模块 发送消息， 通知展示宠物的信息, 并通知周围玩家
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GNotifyMapPetInfo extends __GNotifyMapPetInfo__ {
	@Override
	protected void process() {
		// protocol handle
		final fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		if (role == null) return;
		if(null == role.getScene()) return;
		if (showpetinfo.petid != 0){
			final fire.pb.scene.movable.ScenePet showpet = 
				fire.pb.scene.movable.God.createPet(showpetinfo.petkey, showpetinfo.petname, showpetinfo.petid,  showpetinfo.color, showpetinfo.bodysize,showpetinfo.showeffect);
			
			if(showpet.checkAllTheSame(role.getShowPet()))
				return;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К缂備胶鍋撻崕鍐差焽閿熺姴钃熼柨婵嗩槸椤懘鏌曡箛濠冩珖闁告梹鎮傚鍝勑ч崶褝鎷峰Δ鍛；闁规崘鍩栧畷鍙夌箾閹存瑥鐏╃紒鐙呯稻缁绘盯宕卞Δ鍐唺婵炲濮鹃崑鎰閹惧瓨濯撮柛婵嗗珔閵夆晜鐓曢幖瀛樼☉閿熻姤顨婇獮鎴﹀閻橆偅鏂�闂佹悶鍎弲婵嬫儊閸儲鈷戠紒瀣濠�鎵磼椤旇偐鐒哥捄顖炴煥閻斿墎鐭欐慨濠勭帛閹峰懏绗熼婊冨Ъ婵＄偑鍊栭崹鐢稿疮閺夋垹鏆﹂柟閭﹀厴閺�浠嬫倵閿濆簼娴烽柟鑺ユ礋濮婅櫣绱掑Ο鑽ゅ弳闂佺顕滅槐鏇犳閻愬搫鐐婃い鎺嶈兌閸橀亶姊洪崷顓炰壕妞ゃ劌鎳橀獮濠呯疀閹绢垱鐏侀梺鍛婄缚閸庡磭澹曟禒瀣厱閻忕偛澧介幊鍛磼濞戞绠婚柡宀�鍠愰ˇ鐗堟償閳ュ啿绠ｉ梻浣告惈閺堫剟鎯勯鐐叉槬闁告洦鍨扮粈鍐煕閹炬鍟缂傚倸鍊搁崐鐑芥嚄閼哥數绠鹃柨鐔烘櫕缁辨帡鎮╁畷鍥р拰閻庢鍠涢褔鍩ユ径鎰潊闁绘﹢娼ф慨鍫曟⒒娴ｅ憡鍟為柛鏃�顨婂畷鎴﹀箻缂佹ê浠奸梺缁樺灱婵倝鍩涢幋锔界厱闁挎棁顕ч獮妤併亜韫囨洖鏋旂紒杈ㄦ尭椤撳ジ宕熼鐘靛床闁诲孩顔栭崰鏍�﹂悜钘夋瀬闁归偊鍘肩欢鐐烘倵閿濆簼绨风紒銊ヮ煼濮婄粯鎷呴崨濠傛殘缂備礁鎼鈥崇暦閺囥垹绠柤鎭掑劚娴犻箖姊洪崨濠冨闁搞劑浜堕崺娑㈠箣閿旂晫鍘卞┑鐘绘涧濡顢旈锔界厽闁圭儤娲樼涵鍓佺磼鏉堛劌绗х紒杈ㄥ笒铻ｉ柤娴嬫櫇閺嗐倝姊绘担椋庝覆缂佹彃娼″畷妤�顫滈敓浠嬫偘椤曪拷瀹曞崬鈽夊▎鎴濆Ш闂備焦瀵ч弻銊ㄣ亹閵娾晩鏁嗛柛鏇ㄥ厴閹风粯绻涙潏鍓у埌闁硅绱曢幏褰掓晸閻樺磭鍘搁梺鍛婄矆缁�浣圭濠靛牏纾肩紓浣诡焽濞叉挳鏌℃担瑙勫鞍缂佸倹甯為敓鏂ょ秵閸嬪棝宕㈤幖浣圭厽闊洦娲栨禒杈ㄧ箾閻撳寒鐓兼鐐茬箰閻ｏ繝骞嶉鑺ヮ啎闂備焦鎮堕崕顖炲礉瀹ュ鍋╅柣鎴ｅГ閳锋垿鎮归崶銊ョ祷闁搞倛浜槐鎾愁吋閸涱噮妫﹂悗瑙勬礃閸ㄥ灝鐣烽悢纰辨晬闁挎繂妫欏▍鍡涙⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�
			role.setShowPet(showpet);
		}else{
			if(role.getShowPet() == null)
				return;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К缂備胶鍋撻崕鍐差焽閿熺姴钃熼柨婵嗩槸椤懘鏌曡箛濠冩珖闁告梹鎮傚鍝勑ч崶褝鎷峰Δ鍛；闁规崘鍩栧畷鍙夌箾閹存瑥鐏╃紒鐙呯稻缁绘盯宕卞Δ鍐唺婵炲濮鹃崑鎰閹惧瓨濯撮柛婵嗗珔閵夆晜鐓曢幖瀛樼☉閿熻姤顨婇獮鎴﹀閻橆偅鏂�闂佹悶鍎弲婵嬫儊閸儲鈷戠紒瀣濠�鎵磼椤旇偐鐒哥捄顖炴煥閻斿墎鐭欐慨濠勭帛閹峰懏绗熼婊冨Ъ婵＄偑鍊栭崹鐢稿疮閺夋垹鏆﹂柟閭﹀厴閺�浠嬫倵閿濆簼娴烽柟鑺ユ礋濮婅櫣绱掑Ο鑽ゅ弳闂佺顕滅槐鏇犳閻愬搫鐐婃い鎺嶈兌閸橀亶姊洪崷顓炰壕妞ゃ劌鎳橀獮濠呯疀閹绢垱鐏侀梺鍛婄缚閸庡磭澹曟禒瀣厱閻忕偛澧介幊鍛磼濞戞绠婚柡宀�鍠愰ˇ鐗堟償閳ュ啿绠ｉ梻浣告惈閺堫剟鎯勯鐐叉槬闁告洦鍨扮粈鍐煕閹炬鍟缂傚倸鍊搁崐鐑芥嚄閼哥數绠鹃柨鐔烘櫕缁辨帡鎮╁畷鍥р拰閻庢鍠涢褔鍩ユ径鎰潊闁绘﹢娼ф慨鍫曟⒒娴ｅ憡鍟為柛鏃�顨婂畷鎴﹀箻缂佹ê浠奸梺缁樺灱婵倝鍩涢幋锔界厱闁挎棁顕ч獮妤併亜韫囨洖鏋旂紒杈ㄦ尭椤撳ジ宕熼鐘靛床闁诲孩顔栭崰鏍�﹂悜钘夋瀬闁归偊鍘肩欢鐐烘倵閿濆簼绨风紒銊ヮ煼濮婄粯鎷呴崨濠傛殘缂備礁鎼鈥崇暦閺囥垹绠柤鎭掑劚娴犻箖姊洪崨濠冨闁搞劑浜堕崺娑㈠箣閿旂晫鍘卞┑鐘绘涧濡顢旈锔界厽闁圭儤娲樼涵鍓佺磼鏉堛劌绗х紒杈ㄥ笒铻ｉ柤娴嬫櫇閺嗐倝姊绘担椋庝覆缂佹彃娼″畷妤�顫滈敓浠嬫偘椤曪拷瀹曞崬鈽夊▎鎴濆Ш闂備焦瀵ч弻銊ㄣ亹閵娾晩鏁嗛柛鏇ㄥ厴閹风粯绻涙潏鍓у埌闁硅绱曢幏褰掓晸閻樺磭鍘搁梺鍛婄矆缁�浣圭濠靛牏纾肩紓浣诡焽濞叉挳鏌℃担瑙勫鞍缂佸倹甯為敓鏂ょ秵閸嬪棝宕㈤幖浣圭厽闊洦娲栨禒杈ㄧ箾閻撳寒鐓兼鐐茬箰閻ｏ繝骞嶉鑺ヮ啎闂備焦鎮堕崕顖炲礉瀹ュ鍋╅柣鎴ｅГ閳锋垿鎮归崶銊ョ祷闁搞倛浜槐鎾愁吋閸涱噮妫﹂悗瑙勬礃閸ㄥ灝鐣烽悢纰辨晬闁挎繂妫欏▍鍡涙⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�
			role.setShowPet(null);
		}
		
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬姘卞闂佹眹鍨归…宄邦潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙鎻掔骇闁绘濮撮悾鐑藉箛閺夎法顔愭繛杈剧悼椤牓鎮楅銏♀拺缂佸娉曢悘閬嶆煕鐎ｎ剙浠遍柟顕嗙節婵＄兘鍩￠崒婊冨箺闂備礁鎼ú銊╁磻濞戙垺鏅搁柦妯侯槹鐠愶繝鏌ㄩ悢璇残撻柣鏃戝墴楠炲繘鏁撻敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ銈囩磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿京纾藉ù锝堟鐢盯鏌ｉ埡濠傜仩闁伙絿鍏橀、鏃堝醇濠靛牜妲版俊鐐�曠换鎰板蓟婵犲偆鐓ラ柛顐ゅ暱閹疯櫣绱掔紒銏犲箹闁瑰啿绻橀幃鐢割敂閸℃瑧锛滃銈嗘婵倗浜搁銏＄厽闁挎繂顦伴弫杈╃磼閾忚娅曠紒顔界懇瀹曞綊顢欓懖鈹垮仏闂傚倸鍊烽懗鍓佸垝椤栫偛钃熼柕濞炬櫅缁犺銇勯幇璺侯洭鐎规挷绶氶弻娑㈩敃閵堝懏鐏佺紓浣叉閹风兘姊绘担鍦菇闁搞劏妫勯…鍥槼缂佸倹甯￠弫鍐磼濞戞艾骞堥梻渚�娼ч…鍫ュ磿閹惰棄鏄ラ柨婵嗩槹閻撴瑦銇勯弬璇插婵炲眰鍊濆畷锟犲箮閼恒儳鍘介梺鍝勫�搁悘婵嬨�傚畷鍥╃＜闁绘ê鍟块崫鐑樻叏婵犲懏顏犵紒顔界懅閹瑰嫰濡歌閸熷牓姊绘担渚劸妞ゆ垵妫濆畷婵單旈崘銊ョ亰缂傚倷鐒﹁彠闁稿鎳橀弻娑㈠箛閵婏附鐝栭梺鍛婎焽閺佸摜妲愰幘璇茬＜婵炲棙鍨垫俊浠嬫⒑閹稿孩鐨戠紒杈ㄥ笒铻栧ù锝囶焾閹界敻姊洪崫鍕拱缂佸鎹囬弫鎾诲棘閵堝洨銈烽梺鍛婃煥閻倸鐣峰┑瀣櫇闁稿本绋撻崢鎼佹倵閻у憡瀚归梺璺ㄥ枍缁瑥鐣锋导鏉戝唨妞ゆ挻绮ｉ幏閿嬫媴缁洘鐎婚梺鍦亾濞兼瑩鎯傞崟顒傜瘈闁靛骏绲剧涵鐐繆椤愶絿鎳囬柟顔斤耿瀹曞崬鈽夊▎灞惧濠电偠鎻紞锟芥繛鍜冪秮婵″瓨绻濋崶銊у幐闂佺鏈悷褏绮ｉ弮鍌︽嫹鐟欏嫭绀冪紒顔肩焸閸╃偤骞嬮敃锟介柋鍥煏韫囧鐏柡鍡愬劦濮婄粯鎷呴搹鐟扮濠殿喖锕ら…宄扮暦閵忥綆妯勯梺璇″枟閻燂妇鎹㈠┑瀣妞ゆ帪鎷烽柡瀣灴閺岀喖鎳栭埡鍕婂淇婇悪娆忔搐閸戠姷锟藉箍鍎遍ˇ浼存偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷
		final fire.pb.pet.SShowPetAround send = new fire.pb.pet.SShowPetAround();
		send.roleid = roleid;
		send.showpetid = showpetinfo.petid;
		send.showpetkey = (int)showpetinfo.petkey;
		send.showpetname = showpetinfo.petname;
		send.colour = (byte)showpetinfo.color;
		send.size = (byte)showpetinfo.bodysize;
		send.showeffect = (byte)showpetinfo.showeffect;
		role.sendWhoSeeMeAndMe(send);	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 724906;

	public int getType() {
		return 724906;
	}

	public long roleid;
	public fire.msp.showpetinfo showpetinfo;

	public GNotifyMapPetInfo() {
		showpetinfo = new fire.msp.showpetinfo();
	}

	public GNotifyMapPetInfo(long _roleid_, fire.msp.showpetinfo _showpetinfo_) {
		this.roleid = _roleid_;
		this.showpetinfo = _showpetinfo_;
	}

	public final boolean _validator_() {
		if (roleid <= 0) return false;
		if (!showpetinfo._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(showpetinfo);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		showpetinfo.unmarshal(_os_);
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GNotifyMapPetInfo) {
			GNotifyMapPetInfo _o_ = (GNotifyMapPetInfo)_o1_;
			if (roleid != _o_.roleid) return false;
			if (!showpetinfo.equals(_o_.showpetinfo)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += showpetinfo.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(showpetinfo).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

