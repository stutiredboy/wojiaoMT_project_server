
package fire.pb.school;

import fire.pb.school.shouxi.ProfessionLeaderManager;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSendElectorWords__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁�濠囨煥閻旇袚缂佺粯鐩畷顏堝礃椤忓柊姘舵⒑闂堟稒澶勯柛鏃�鐗滅划瀣箳閺冩挻瀚归柨婵嗛娴滄劙鏌熷畡鐗堟儓妞ゎ亜鍟存俊鍫曞幢濡わ拷椤洭姊虹化鏇熸珔閻庢凹鍓欏畵鍕⒑閸涘﹦鈽夋い顓炵墛缁傚秴顭ㄩ崼鐔哄幍闂佺顫夐崝锕�顭囬幇顓滀簻闊洦娲栭埢鍫ユ煛瀹�锟介崰鎾跺垝閻㈠灚鍠嗛柛鏇ㄥ亽娴硷拷? by changhao
 *
 */
public class CSendElectorWords extends __CSendElectorWords__ {
	@Override
	protected void process()
	{
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		fire.pb.PropRole propRole=new fire.pb.PropRole(roleid,true);
		final int school=propRole.getSchool();
		xbean.ProfessionLeaderVoteInfo voteInfo=xtable.Professionleadervotechallenge.select(roleid);
		
		boolean b = false;
		
		if (voteInfo != null)
		{
			b = ProfessionLeaderManager.getInstance().isInChallengePeriod(voteInfo.getChallengetime());
		}
		
		xbean.ProfessionLeaderInfo shouxiInfo=xtable.Professionleader.select(school);
		if(shouxiInfo != null && shouxiInfo.getRoleid() == roleid)
		{
			b = true;
		}		
		
		//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾侗妫￠梺鐟板暱閻倸顫忕紒妯诲闁革富鍘介懣鍥⒑缁嬪潡鍙勫ù婊冪埣閻涱喗绻濋崒銈嗗缓闂佽法鍠嶇划娆撳箖娴兼惌鏁嬮柨鐔剁矙閻涱噣宕堕锟界痪褔鎮规笟顖滃帥闁告艾鎳樺缁樻媴閾忕懓绗￠梺鍛婃⒐椤洦绂嶇粙搴撴瀻闁归偊鍣ù鍕攽閻樿宸ラ柣妤�锕崺娑㈠箣閿旂晫鍘介梺缁樻⒒椤牓藟鐎ｎ喗鐓欓柣锝呰嫰閳诲牓鏌＄仦鍓ф创鐎殿噮鍣ｉ弫鎾绘寠婢规繂鎼～婊堟晸娴犲宓侀柛顐犲劚鎯熼梺鍐叉惈閸婄懓鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�  by changhao
		if(b == false)
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 170009, null);	
			return ;
		}
		
		//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愬绡�闁汇垽娼у瓭婵°倗濮甸幃鍌氼嚕閺屻儲鍋愮紓浣骨氶幏娲⒑闂堚晛鐦滈柛妯哄⒔閺侇喖鈽夐姀鈥充缓濡炪倖鐗楃粙鎴犵箔閹烘鎳氶柣鎰摠閸欏繑淇婇妶鍜佸剱閻庢艾缍婂娲传閸曨剚鎷遍梺鐑╂櫓閸ㄤ即顢氶敐澶樻晪闁跨喕妫勯悾鐑藉箳閹宠埖甯為幉妤呭Χ閸涱厼袝闂備礁鎼惌澶屽緤娴犲鐓橀柟杈剧畱闁卞洭鏌ｉ弬鎸庡暈闁伙附鎹囧缁樻媴閸涘﹥鍎撻梺鍏兼た閸ㄥ爼鐛繝鍛杸闁瑰灝鍟▓顐︽⒑閸涘﹥澶勯柛銊﹀缁鈽夊▎宥勭盎闂佺鎻徊鍓ф兜閸洘鐓曢柟瀵稿У閸わ拷闂佸疇顫夐崹鍧楀箖濞嗘挸绾ч柟瀵稿С濡楁捇姊绘担鍛婃儓閻炴凹鍋婂畷婵嬪箣閿曪拷缁犳牜鎲搁弬璺ㄦ殾闁靛ň鏅涚痪褔鏌熺�电啸闁哄绮欏缁樼瑹閿熻棄顭囪婢ф繈姊洪崫鍕櫤缂佸鎸惧Σ鎰板箳濡わ拷閻撴盯鏌涘☉鍗炴灓闁告﹢浜跺娲箰鎼淬埄姊垮銈嗘肠閸モ晛绁﹀┑鈽嗗灠閸氬宕伴幇顑╂稒锛愭担钘夊帯闂佹椿鍘介悷锕傚箞閵婏妇绡�闁告劏鏂傛禒銏狀渻閵堝啫鐏繛鑼枑閹便劑鏁撴禒瀣厓闁告繂瀚敓鑺ュ姍椤㈡棃宕奸悢鍙夊濠电偞娼欓崥瀣偡閵娾晩鏁囨繛宸簼閻撴瑩鏌涢幋娆忥拷鏍拷姘炬嫹 by changhao
		boolean modify = false;
        xbean.ProfessionLeaderTicketInfo candInfo=fire.pb.school.shouxi.ProfessionLeaderManager.getInstance().getCandInfoFromRoleid(roleid, school);
        if(candInfo!=null)
        {
        	modify = true;
        }
        
        if (modify == false)
        {
    		if (!ProfessionLeaderManager.getInstance().isInChallengePeriod(System.currentTimeMillis()))
    		{//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磸閿熸垝鐒︾换婵嬪炊瑜庡Σ顒勬⒑閸濆嫮鈻夐柣蹇斿姍瀹曨偊宕熼悽闈涘汲闂備礁澹婇崑鍛村箚婵犲拋妯勯梺鍝勬湰濞叉鎹㈠☉婊庢Щ闁诲孩鍑归崜娑欑珶閺囥埄鏁嶉柣鎰ˉ閹疯櫣绱撻崒娆戝妽閽冭鲸銇勯妷銉︻棡缂佺粯鐩畷顏堝礃椤忓柊姘舵⒑闂堟稒澶勯柛鏃�鐗滅划瀣箳閺冩挻瀚归柨婵嗛娴滄劙鏌熷畡鐗堟儓妞ゎ亜鍟存俊鍫曞幢濡わ拷椤洭姊虹化鏇熸珔閻庢凹鍓欏畵鍕煟閻斿摜鎳冮悗姘间簽閹广垽宕卞☉娆戝幗闂佸綊鍋婇崢鑲╁緤婵犳碍鐓ラ柣鏃傜帛椤ュ绻濋敓鑺ユ綇閳轰礁鐏婂┑鐐叉閹稿寮查幖浣圭叆闁绘洖鍊圭�氾拷?濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨偓鎷锋繝姘ワ拷鍛村矗婢跺瞼鐦堥梻鍌氱墛缁嬫帡鏁嶅鍡欑闁圭偓鍓氶悡濂告煛鐏炲墽鈽夐柣锝嗙箞閺佹挻绂掔�ｎ亞锛涢梺缁樺姇閹碱偊鎮￠弴銏＄厵闁绘垶锕╁▓鏇㈡煕婵犲倻浠涚紒缁樼洴楠炲鎮欓崹顐㈡畯濠电偞鎸荤喊宥夋儎椤栫偛钃熸繛鎴欏灪閸婂鏌涢妷锝呭妞ゅ骏鎷�
    			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 141983, null);
    			return;
    		}        	
        }
        
        if (electorwords.length()>25)
        {
			return;
		}
        
		new fire.pb.school.shouxi.PSendElectorWords(roleid,electorwords, modify).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810435;

	public int getType() {
		return 810435;
	}

	public java.lang.String electorwords;

	public CSendElectorWords() {
		electorwords = "";
	}

	public CSendElectorWords(java.lang.String _electorwords_) {
		this.electorwords = _electorwords_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(electorwords, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		electorwords = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSendElectorWords) {
			CSendElectorWords _o_ = (CSendElectorWords)_o1_;
			if (!electorwords.equals(_o_.electorwords)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += electorwords.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(electorwords.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

