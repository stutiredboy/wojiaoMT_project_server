
package fire.pb.gm;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSendCommand__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSendCommand extends __CSendCommand__ {
	@Override
	protected void process() {
		final long gmroleid=gnet.link.Onlines.getInstance().findRoleid(this);
		if (gmroleid < 0)
			return;
		final int userID=((gnet.link.Dispatch)this.getContext()).userid;
		final int localsid=((gnet.link.Dispatch)this.getContext()).linksid;
		GMInteface.execCommand(userID,gmroleid,localsid, cmd);
		//TODO:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎娆戝枠闂傚倷娴囧▔鏇㈠窗閹版澘鍨傛繝闈涱儐閸婂潡鏌ㄩ弮鍌氫壕鐎规洖寮剁换婵嬫濞戝崬鍓扮紒鐐劤閸氬绌辨繝鍥ч柛鏇ㄥ枛閸樷剝绻涚�涙鐭嬮柣鐕傚閹广垹鈹戠�ｎ偄浠洪梻鍌氱墛缁嬫劕鈻介鍫熲拺闁硅偐鍋涙俊鍧楁煕閻樺磭澧柣锝囧厴楠炲鏁冮敓鐣岀不閼姐倗纾藉ù锝堝亗閹存績鏋嶉柕蹇嬪�栭埛鎴︽煠閹帒鍓い蹇撶吇閸ャ劌顕遍柡澶嬪灴濡兘姊烘导娆戝埌闁活剝鍋愭竟鏇㈠礂缁楄桨绨婚梺鍝勫暙濞层倛顣挎俊鐐�戦崕閬嶆偋韫囨稒鏅搁柛濠勫櫏濞兼劖绻涢崣澶涜�跨�规洘绻傞埢搴ㄥ箻閾忣偆锟筋剟姊虹憴鍕姢妞ゆ洦鍙冮妴鍛存倻閼恒儱锟界敻鏌ㄥ┑鍡涱�楀ù婊勫姍閺岀喎鐣￠柇锔惧悑濠殿喖锕ㄥ▍锝囧垝濞嗘挸绠伴幖娣灪鐎氭娊姊绘担钘夊惞闁哥喐鐟╁畷鑸垫媴閸涘﹤鏋犻梺杞扮閸熸潙鐣烽幒鎴旀婵﹩鍓欑粻銉╂⒒娴ｈ棄鍚瑰┑顔芥綑閳绘棁顦圭�规洏鍔戦、娑㈠Χ閸パ勫劒缂傚倸鍊搁崐鎼佸磹妞嬪孩顐介柨鐔哄Т缁愭淇婇妶鍛櫤闁稿绻濋弻宥夊传閸曨剙娅ч悗瑙勬尫缁舵岸骞冨Δ鍛櫜閹肩补鍓濋悘宥夋⒑閸濆嫭鍣虹紒顔芥崌瀵濡舵径濠勭暢闂佸湱鍎ら崹鍨叏閺囥垺鈷戠紓浣诡焽缁犳牠鏌ｅΔ鍐ㄐ㈡い顐㈢箳缁辨帒螣閼测晜鍤岄梻浣芥硶閸犳洖螞閸曨垪锟斤箓宕堕宥嗏枆濠电姭鎷冮崟顓犵杽濠殿喖锕ュ钘夌暦椤愶箑绀嬫い鎺炴嫹婵炲懌鍊楃槐鎾寸瑹閸パ勭亶闂佺懓鎲￠幃鍌炲箖妤ｅ啯鍊婚柦妯侯槸瀹撳棝姊虹紒妯活梿婵炲拑缍侀幆渚�宕奸妷锔规嫼闂佺鍋愰崑娑㈠礉濮楋拷閺屾盯寮崸妤�寮伴悗瑙勬磸閸ㄤ粙鐛弽銊﹀闁稿繐顦扮�氬ジ姊绘担鍛婂暈缂佸鍨块弫鍐Χ閸℃ê寮块梺绋跨灱閸嬬偤鎮￠弴銏＄厸闁稿本绋戦婊勭節閿熶粙骞嶉鍓э紲闂佺鏈銊︾墡闂佽绨肩徊濠氬磻閹扮増鏅搁柤鎭掑劤閳句焦銇勯鐐村枠鐎规洏鍨藉畷褰掝敃閿涘嫮鐣鹃梻浣虹帛閸旀洖螣婵犲洤纾块煫鍥ㄦ嫻閺冨牊鍋愰柧蹇ｅ亜閿熻姤鍔楅敓鍊燁潐濞插繘宕规禒瀣祦婵鎷锋い銏＄懇閹墽浠﹂挊澶岊啈婵犵數濮烽弫鎼佸磻閻愬搫鍨傞梻鍫熺〒閺嗭附銇勯幒鐐村闂佸疇顕х粔鎾敇婵傜鐐婇梺鍨儏椤忓爼鏌ｉ悢鍝ユ噧閻庢凹鍘剧划鍫ユ晸閻ｅ瞼纾介柛灞炬皑瀛濋梺鎸庢处娴滎亝淇婄�涙ɑ濯寸紒顖涙礃閻庡姊虹憴鍕姢缁剧虎鍙冮幃锟犲箣閿旇В鎷洪梻鍌氱墛閸愯崵妲愰敓鐘崇厱闁哄洨鍋涢。宕囩棯椤撱劍瀚归梻鍌氬�搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴楠炴﹢鎳犻锟芥俊浠嬫⒑缁嬭法绠茬紒顔芥崌瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷鈺傗拺婵懓娲ら敓鑺ヮ殜瀹曟垿骞橀懜闈涘簥濠电娀娼уú銊у姬閿熶粙姊虹粙鎸庢拱缂佸鍨甸埢宥堫樄婵﹤鎼叅閻犲洦褰冪粻娲⒑閼姐倕鏆遍柡鍛Т椤曪絾绻濆顓炰簻闂佺粯鎸稿ù鐑筋敊婢舵劖鈷戠憸鐗堝笒娴滀即鏌涘锟界粻鏍ㄤ繆閹绢喖绠涢柣妤�鐗冮幏娲⒑绾懎浜归柛瀣♁娣囧﹪鎮惧畝锟界壕濂告偣閸ヮ亜鐨哄褝濡囬敓鑺ヮ問閸犳牠鈥﹂柨瀣╃箚闁归棿绀侀悡娑㈡煕鐏炲墽鐓紒銊ょ矙濮婄粯鎷呮笟顖滃姼闂佸搫鐗滈崜娑氬垝濞嗘挸绠ｉ柨鏃傜帛閺呮粓姊虹捄銊ユ珢闁瑰嚖鎷�?
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 791433;

	public int getType() {
		return 791433;
	}

	public java.lang.String cmd;

	public CSendCommand() {
		cmd = "";
	}

	public CSendCommand(java.lang.String _cmd_) {
		this.cmd = _cmd_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(cmd, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		cmd = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSendCommand) {
			CSendCommand _o_ = (CSendCommand)_o1_;
			if (!cmd.equals(_o_.cmd)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += cmd.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(cmd.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

