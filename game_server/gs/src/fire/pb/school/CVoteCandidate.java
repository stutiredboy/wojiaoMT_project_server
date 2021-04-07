
package fire.pb.school;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CVoteCandidate__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲稿澶嬪仼闁绘垹鐡旈弫鍡椕归敐鍡樸仢婵＄虎鍣ｅ娲传閸曨偅娈梺绋匡龚瀹曠數鍒掓繝姘睄闁割偆鍠撻崢浠嬫⒑閸濆嫬鏆欓柣妤�锕ョ粋宥夊Χ閸モ晝锛滈梺瑙勫絻椤戝洨绮旈锟介弻锛勪沪閸撗勫垱闂佺硶鏅涚�氭澘鐣峰锟芥俊鎼佸Ψ閿旂偓顫滈梻鍌氬�风粈渚�骞栭鈶芥盯顢橀姀鐘殿槶濠电偞鍨崹娲疾閹间焦鐓熼柨婵嗘噽閻掗箖鏌￠崱妯肩煉闁哄瞼鍠栧畷娆撳Χ閸℃浼�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣銏犲閺佸﹪鏌″搴″箹缂佹劖顨婇弻鈥愁吋鎼粹�冲闂佽桨绀佺�氫即寮诲☉銏犵労闁稿繆鏅滈崹鍨暦閿濆牏鐤�婵炴垶鐟ч崢閬嶆⒑闂堟侗妲堕柛銊ユ惈閳诲秹宕堕浣哄幗濡炪倖鎸堕崝宥囷拷姘炬嫹?
 * @author changhao
 *
 */
public class CVoteCandidate extends __CVoteCandidate__ {
	@Override
	protected void process()
	{
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		fire.pb.PropRole prop=new fire.pb.PropRole(roleid,true);
		
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熶粙鎮块濮愪簻闁规澘鐖煎顕�鏌涚�ｎ亶妯�闁哄矉缍侀獮姗�宕樺顔兼暔婵犵數鍋為崹顖炲垂閸︻厾涓嶅ù鍏兼綑缁犲綊寮堕崼婵嗏挃鐎癸拷濞戙垺鐓涢悗锝庡亞婢х敻鏌熼绛嬫疁闁绘侗鍣ｅ畷褰掝敊閻撳寒娼涢梻鍌欒兌閹虫捇宕查弻銉晞濠㈣泛锕﹂弳锕傛煟閵忕姵鍟為柡鍛倐閺屻劑鎮ら崒娑橆伓 by changhao
		if(!fire.pb.school.shouxi.ProfessionLeaderManager.getInstance().checkCanVote(System.currentTimeMillis()))
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 190072, null);
			return;
		}
		
		//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽銊с�掗柣婵嗙埣閺岋繝宕堕妷銉т患闂佹眹鍊楅崑鎾舵崲濞戙垹绠ｆ繛鍡楃箳閸旀挳姊烘潪鎵槮闁挎洩绠撻弫鎾绘寠婢跺瞼鏆涢梺绋块瀹曨剛鍙呴梺闈涱煭鐠愮喐绂掑鑸电厱闁归偊鍓氶埢鏇㈡煟閺傛寧顥㈤柟顔款潐閵堬箓骞愭惔顔诲摋闂備胶绮敮妤呭箖閸岀偛钃熼柨婵嗘噳濡插牊绻涢崱妯哄缁炬澘绉撮—鍐Χ鎼粹�崇濠电偛鐨烽敓钘夌－閺嗭箑鈹戦崒婊庣劸妤犵偑鍨烘穱濠囧Χ韫囨柨顏堕梻浣芥硶閸犳洖螞閸曨垪锟斤箓鎮滈挊澶岀枃濠电娀娼ч鍛矆閸垺鍠愰煫鍥ㄦ礀椤ユ艾鈹戦崒姘暈闁绘挶鍎甸弻锝夊即閻愯鎷烽崷顓ㄦ嫹濮樼偓瀚�?50缂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌曢崼婵愭Ц缂佺媭鍨堕弻銊╂偆閸屾稑顏�? by changhao
		if(prop.getLevel() < SchoolConst.TOUPIAO_MINLEVEL)
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 190080, null);
			return;
		}
		
		long value = prop.getProperties().getHistorymaxprofessioncontribute();
		
		if (value < 100) //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閾忣偅鐝ㄦ繝鐢靛Х椤ｈ棄危閸涙潙纾婚柛娑欑暘閿熻棄鍟鍕箛椤戔晪绠撻弻鐔兼偋閸喓鍑￠梻浣稿船濞差參寮婚敓鐘茬倞闁宠桨鐒﹂悗璇测攽閻愯尙澧曠紒缁橈耿瀵鏁愰崼銏㈡澑闂佸搫娲ㄩ崑姗�宕Δ鍛拺缂佸顑欓崕鎰版煕閺冿拷閻熲晠鐛崘顔藉仾妞ゆ牗眉濮规姊洪崷顓炲妺闁圭鎲＄粋鎺楊敍閻愮补鎷洪柣鐔哥懃鐎氼厾娆㈤幓鎺濈唵鐟滃秴霉闁垮鐝堕柡鍥ュ灩闁裤倖淇婇妶鍕槮闁跨喕妫勯悥濂告偂椤愶箑鐐婇柕濠忓椤︺儲绻涚�电顎撶紒鐘虫崌瀵鎮㈢喊杈ㄦ櫖濠电偞鍨堕悷顖毼涢崘顔解拺閺夌偞澹嗛ˇ锕傛煕閻曚礁鐏ｇ紒顕呭弮閹垽鎮℃惔锝咃拷鐐烘⒑闂堟丹娑㈠川椤撶偟鐣遍梻鍌氬�搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁嶉柣鎰綑娴滆鲸绻濋悽闈浶㈡繛灞傚�楁竟鏇㈠锤濡や胶鍘甸梺璇″灣婢ф藟婢舵劖鐓涢柛鏇楁櫅閸旓箓鏌＄仦璇插闁诡喓鍊濆畷鎺戔槈濮楀棔绱�100闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟缁�濠傗攽閻樻彃浜為柣鎺旀櫕閹叉瓕绠涢弴鐐茬亰闂佸搫鍟悧濠囧磹婵犳碍鐓㈡俊顖欒濡茬儤銇勮熁閸愶絾鏂�濡炪倖姊婚悺鏂库枔閿濆鐓欓柣鎴ｅГ閺佽鲸銇勯妸锝呭姦闁诡喗鐟╁濠氬Ψ閵夈儱寮烽梺璇插椤旀牠宕板Δ鍛闁规儼妫勭粻鏍煃閸濆嫭濯奸柡浣革躬濮婂宕掑杈ㄦ喖闂佸摜濯撮幏锟� by changhao
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 190076, null);
			return;
		}
				
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕妞ゎ偄顦遍敓浠嬫涧閵堢顕ｉ崼鏇炵闁绘ê鐏氬В搴㈢節閻㈤潧浠╅柟娲讳簽瀵板﹪鎳為妷褏褰炬繝鐢靛Т濞层倝鎮块锟介弻娑樷槈濡吋鎲奸梺缁樻尵婵兘鎯�椤忓牆绾ч柛顭戝枦閸╃偞绻濋埛锟介崒姘ギ闂佸搫鐭夌紞浣逛繆閻戣棄唯闁挎洩鎷锋繛鍫燁殜濮婃椽宕崟顓犱紘闂佸摜濮甸悧鐘荤嵁婵犲偆鐓ラ柛顐ｇ箓閻庮厼顪冮妶鍡楀闁稿鍊曞嵄闁割偅娲橀埛鎺戙�掑鐐濠电偘鍖犻崶銊ヤ罕闂佺粯鍔曢幖顐ょ不椤栫偞鐓ラ柣鏇炲�圭�氾拷 by changhao
		if(fire.pb.school.shouxi.ProfessionLeaderManager.getInstance().checkAlreadyVote(roleid))
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 170014, null);
			return;
		}

		new fire.pb.school.shouxi.PVoteCandidate(roleid,candidateid,shouxikey).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810436;

	public int getType() {
		return 810436;
	}

	public long candidateid;
	public long shouxikey;

	public CVoteCandidate() {
	}

	public CVoteCandidate(long _candidateid_, long _shouxikey_) {
		this.candidateid = _candidateid_;
		this.shouxikey = _shouxikey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(candidateid);
		_os_.marshal(shouxikey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		candidateid = _os_.unmarshal_long();
		shouxikey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CVoteCandidate) {
			CVoteCandidate _o_ = (CVoteCandidate)_o1_;
			if (candidateid != _o_.candidateid) return false;
			if (shouxikey != _o_.shouxikey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)candidateid;
		_h_ += (int)shouxikey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(candidateid).append(",");
		_sb_.append(shouxikey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CVoteCandidate _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(candidateid - _o_.candidateid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(shouxikey - _o_.shouxikey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

