
package fire.pb;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqHelpCountView__ extends mkio.Protocol { }

/** 客户端请求援助统计面板
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqHelpCountView extends __CReqHelpCountView__ {
	@Override
	protected void process() {
		// protocol handle
		long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		SReqHelpCountView sReqHelpCountView=new SReqHelpCountView();
		xbean.helpcount helpcount=xtable.Helpcount.select(roleid);
		if(helpcount!=null){
			sReqHelpCountView.expvalue=helpcount.getExpvalue();//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗘搐閸斿锟借娲栧鍫曞箞閵娿儙鏃傦拷锝庡亜椤忓爼姊绘担绛嬪殐闁哥姵娲熷畷锟犲箮閽樺鐎梺鐟板⒔缁垶寮查幖浣圭叆闁绘洖鍊圭�氾拷
			sReqHelpCountView.shengwangvalue=helpcount.getShengwangvalue();//濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倿鏌ｉ悢宄扮盎闁兼澘娼″鍫曞醇濞戞ê顬夊┑鐐叉噽婵灚绌辨繝鍥ч煫鍥ㄦ煥椤忓爼姊绘担鐟邦嚋婵炴彃绻樺畷瑙勭鐎ｎ亝鐎梺鐟板⒔缁垶寮查幖浣圭叆闁绘洖鍊圭�氾拷
			sReqHelpCountView.factionvalue=helpcount.getClanvalue();//闂傚倸鍊搁崐鐑芥倿閿曞倹鍎戠憸鐗堝笒閺勩儵鏌涢弴銊ョ仩闁搞劌鍊搁埞鎴﹀磼濠婂海鍔哥紓浣瑰姈椤ㄥ棛鎹㈠☉銏犵闁绘劖顔栭弳锟犳⒑缁嬭法绠茬紒顔芥崌瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷
			sReqHelpCountView.helpgiveitemnum=helpcount.getHelpgiveitemnum();
			sReqHelpCountView.helpitemnum=helpcount.getHelpitemnum();
		}
		sReqHelpCountView.expvaluemax=fire.pb.HelpCountManage.getInstance().getExpValueMax(roleid);//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗘搐閸斿锟借娲栧鍫曞箞閵娿儙鏃傦拷锝庡亜椤忓爼姊绘担绛嬪殐闁哥姵顨呴…鍨潨閿熶粙宕洪姀鈩冨劅闁靛鍎抽鎺楁⒑閸涘﹤濮岄悘蹇旂懆閵囨劙鏁撻敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿顦甸弻鏇＄疀鐎ｎ亷鎷烽弽顓炵柧闁归棿鐒﹂悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?缂傚倸鍊搁崐鐑芥嚄閸洘鎯為幖娣妼閻鏌涢幇闈涙殙濠㈣埖鍔曠粻濠氭煕閹捐尪鍏岄柣鎺戙偢濮婃椽宕ㄦ繝鍐槱闂佺锕ラ幐濠氬箚閺冨牆惟闁靛／鍐挎嫹閻愮儤鐓熼柣妯煎劋椤忕娀鏌涙惔娑橈拷婵嬪箖濡警鍚嬪璺侯儌閹锋椽鏌℃径灞戒沪濠㈢懓妫濊棟闁挎洖鍊归悡鏇熸叏濮楀棗澧婚柛搴㈠灩缁辨帡顢欓悾灞惧櫗閻庡灚婢樼�氼噣鏁撻弬銈囩シ闁告柨鏈粋宥嗗鐎涙ǚ鎷洪梺鍛婃崄鐏忔瑩宕㈠☉銏＄厱闁绘ê鍟块崫鐑樸亜閵忥紕鎳囩�规洖宕埥澶娾枎韫囥儲瀚归柣銏犳啞閻撶喖鏌曡箛瀣拷鏍р槈瑜庨妵鍕晲閸涱厽鍊梺闈涙搐鐎氱増淇婇幖浣肝ㄧ憸宥夊焻闁秵鈷戦柛娑橈工缁楁岸鎮介銈囩瘈鐎规洘妞藉畷鐔碱敍濮橀硸妲伴梻浣虹帛閸旓箓宕滈敃鍌氱柈鐎广儱顦伴悡鐔煎箹鏉堝墽绋绘い蹇曞枛閺岀喐顦版惔鈥冲箣闂佸搫琚崝鎴﹀箖閵忋垻纾兼慨妤�妫欓ˉ澶愭⒒娴ｅ摜锛嶇紒顕呭灦楠炴垿宕堕鍌氱ウ闁诲函缍嗘禍鏍绩娴犲鐓曢柟鑸妽濞呭洭鏌ㄩ悢缁橆棄妞ゎ厼鍢查～蹇撁洪鍕棟闂侀潧顧�闂勫嫰鎮甸弮鍫熲拺闁告縿鍎卞▍蹇涙煕閵娿倕宓嗛柛鈹垮灲楠炴鎷犻弻銉ユ暪闂備礁鎼ú銊╁窗閹捐鐭楅柛鈩冪♁閳锋垿鎮归幁鎺戝婵炲懏鍔欓弻鐔煎礄閵堝棗顏�?
		sReqHelpCountView.shengwangvaluemax=fire.pb.HelpCountManage.getInstance().getShengWangValueMax(roleid);//濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倿鏌ｉ悢宄扮盎闁兼澘娼″鍫曞醇濞戞ê顬夊┑鐐叉噽婵灚绌辨繝鍥ч煫鍥ㄦ煥椤忓爼姊绘担鐟邦嚋婵炴彃绻樺畷纭呫亹閹哄棴鎷烽敃鍌毼╅柍杞扮窔閸炶泛鈹戦悩缁樻锭婵☆偅绋栭妵鎰版晸閿燂拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿顦甸弻鏇＄疀鐎ｎ亷鎷烽弽顓炵柧闁归棿鐒﹂悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�??
		sReqHelpCountView.factionvaluemax=fire.pb.HelpCountManage.getInstance().getClanValueMax(roleid);//闂傚倸鍊搁崐鐑芥倿閿曞倹鍎戠憸鐗堝笒閺勩儵鏌涢弴銊ョ仩闁搞劌鍊搁埞鎴﹀磼濠婂海鍔哥紓浣瑰姈椤ㄥ棛鎹㈠☉銏犵闁绘劖顔栭弳锟犳⒑缁嬭法绠茬紒顔芥崌瀵濡搁埡鍌氫簻闂佸憡鎸烽懗鍫曟偂閹剧粯鈷戦柛婵嗗閻掕法绱掔紒妯肩疄鐎殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿顦甸弻鏇＄疀鐎ｎ亷鎷烽弽顓炵柧闁归棿鐒﹂悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�??
		sReqHelpCountView.helpgiveitemnummax=fire.pb.HelpCountManage.getInstance().getHelpGiveItemNumMax(roleid);
		sReqHelpCountView.helpitemnummax=fire.pb.HelpCountManage.getInstance().getHelpItemNumMax(roleid);
		
		gnet.link.Onlines.getInstance().send(roleid, sReqHelpCountView);
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786532;

	public int getType() {
		return 786532;
	}


	public CReqHelpCountView() {
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
		if (_o1_ instanceof CReqHelpCountView) {
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

	public int compareTo(CReqHelpCountView _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

