
package fire.pb.battle;

import fire.pb.map.GridPos;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.scene.AreaInfo;
import fire.pb.util.MapUtil;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSendInvitePlayPK__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSendInvitePlayPK extends __CSendInvitePlayPK__ {
	public static final int PVP_LEVEL=20;//PVP缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿噮鍓熷畷褰掝敊鐟欏嫬鐦遍梻鍌欑劍濡炲潡宕㈡禒瀣仭闁冲搫鎳庨拑鐔兼煟閺傝法娈遍柡瀣叄濮婁粙宕堕澶嬫櫔閻熸粌绉堕崣鍛存⒑閹稿孩绌块柟鐑芥敱閵囧嫰顢橀悙瀵糕敍缂備胶濮电粙鎴﹀煡婢舵劕绠抽柣鎰綑椤忓爼姊洪幐搴㈢闁稿﹤鎽滅划濠氭晲婢跺鍘介梺鐟扮摠缁诲啴藟濠婂牊鐓涢柛婊�绀佹晶瀛樻叏婵犲偆鐓肩�规洘甯掗埢搴ㄥ箣濠靛棭鐎撮梻鍌欐祰椤曟牠宕伴弽顓熷亯闁绘挸娴烽弳锕傛煛閸モ晙绱虫繛宸憾閺佸倿鏌涢弴銊ュ季婵¤尪鍩栫换婵嗏枔閸喗鐏嶅銈庡幖濞差參銆侀弮鍫晢濞达絽鎽滅粣鐐烘⒑瑜版帒浜伴柛妯挎閳诲秹濮�閵堝棌鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊閻樺樊妫岄梺杞扮閿曨亪寮婚垾鎰佸悑閹肩补锟藉磭顔愰梻鍌氬�搁崑鍡涘垂闁秴桅闁告洦鍨伴崘锟藉銈嗗姦濠拷缂侇喖澧庣槐鎾存媴閸濆嫷锟藉矂鏌涢妸銉у煟鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?
	@Override
	protected void process() {
		final long hostid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (-1 == hostid){
			return;
		}
		Role hostRole = RoleManager.getInstance().getRoleByID(hostid);
		if (hostRole == null)
			return ;
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡枠婵﹦绮幏鍛喆閸曨偂鍝楅梻浣侯焾鐎涒晛顪冮挊澶屾殾婵犲﹤鍟犻弸搴ㄦ煙鐎涙绠ユ俊顐ｇ矒閹嘲顭ㄩ崨顓ф毉闁汇埄鍨遍〃濠囧箖閳ユ枼妲堟慨妯煎亾鐎氳顨ラ悙鑼虎闁告梹鑹捐灃闁绘娅曢崐鎰版煟濞戝崬娅嶇�殿喕绮欓、姗�鎮㈤崫鍕睄闂傚倷绀侀幉锟犲礉閿旂晫顩叉繝濠傜墕閸戠姵绻涢幋娆忕仾闁绘挻鐩幃姗�鎮欓幓鎺嗘寖濠电偛寮跺娆撳煘閹达附鏅柛鏇ㄥ亜楠炲顪冮妶鍐ㄧ仾闁荤啿鏅犻獮鍐焺閸愨晛鍔呭銈嗘婵倗绮婃导瀛樷拻闁稿本鑹鹃敓鐣屽厴閹虫宕奸弴妤嬫嫹閿曞倸閱囬柣鏇氱劍椤旀棃姊洪崨濠勭細闁稿骸顭烽獮蹇撶暋閹佃櫕顫嶉梺鍦劋閹稿鎮靛顓犵瘈缁炬澘顦辩壕鍧楁煛娴ｇ瓔鍤欓柣锝囧厴閹垻鍠婃潏銊︽珫婵犳鍠楅…鍫熺椤掞拷椤洦寰勯幇顓涙嫽婵炶揪绲肩拃锕傛倿妤ｅ啯鐓涢柛顐亜婢ф壆绱掗鐣屾噰妤犵偞甯掕灃濞达綁鏅查幋閿嬩繆閻愵亜锟芥洜鎹㈤幇鐗堝亱濠电姴娲ら悡鏇㈡煙鏉堥箖妾柣鎾寸懇閺屻倕霉鐎ｎ偅鐝旀繛瀵稿У缁矂鍩為幋锕�鐏抽柣鎰娴狀噣姊洪崫鍕拱婵炶尙鍠庨悾閿嬬附閸涘﹤浜滅紓浣割儏鐏忓懘骞忛悜钘夌疀妞ゆ洖妫欑�氳绻涢崼婵堜虎闁哄绋掗妵鍕敇閻樻彃骞嬮悗娈垮櫘閸嬪﹪鐛Ο鑲╃＜婵☆垵妗ㄥЧ妤呮⒒娴ｈ棄浜归柍宄扮墦瀹曟粓鏁冮敓钘夊祫閻熸粎澧楃敮妤呭煕閹烘鐓曢悘鐐村礃婢规﹢鏌ㄩ悢璇残撻柟顔煎�块獮鍐槼缂佺粯绻堝畷鐔碱敇閻橀潧骞嗛梻鍌欐祰椤宕曢幎绛嬫晪妞ゆ挴鍋撻敓钘夋嚇閹粓鎳為妷褍甯楅梻浣告啞缁诲倻锟芥凹鍙冨畷鍐裁洪鍛帗闂備礁鐏濋鍛存倶閹绢喗鐓欐い鏃囧亹缁夎櫣锟借娲栭悥濂稿极閹邦垳鐤�闁哄倹顑欐导鎾绘煟鎼淬値娼愭繛鍙夌墪鐓ら柨婵嗩槸缁狅絽顪冪�ｎ亝鎹ｇ痪鍙ョ矙閺屾稓浠﹂崜褎鍣紓浣锋閸楁娊寮诲☉銏犵厸闁稿本绮岄埛宀勬⒑绾懏鐝紒璇插暣婵″爼鏁愭径濠勵槰闂佸疇妗ㄥ鎺楀箖閿濆鈷掑ù锝堟鐢盯鏌涢妸銉ユ倯闁逛究鍔戞俊鑸靛緞婵犲嫸绱┑鐘垫暩婵數鍠婂澶嬪亗闁靛繆锟借尙绠氬銈嗙墬缁矂鎯冮幋鐘电＜閺夊牄鍔岄崫娲煛鐏炵晫效鐎规洦鍋婂畷鐔碱敆閿熻棄鈻嶉妶澶嬧拺缂備焦蓱鐏忣亪鏌涙惔锝嗘毈鐎殿喖顭烽弫鎾绘偐閼碱剦妲伴梻渚�娼ч…顓㈡⒔閸曨垰绠栨繛鍡樻尰閸嬬姵鎱ㄥ鍡楀箹闁告繄鍎ら幈銊︾節閸涱噮浠╃紓渚囧枟閻熲晛鐣风粙璇炬梹绻濊箛鏂款伓濠德板�曢崯鎵閻撳寒鐔嗛悹铏瑰劋濠�浼存煕閵堝繑瀚瑰┑锛勫亼閸娿倝宕戦崟顓熷床闁归偊鍠栧鍙変繆閻愵亜锟芥洜鎹㈤幇鏉跨閻庯綆锟筋厽鐩畷姗�顢欑憴锝嗗闂備礁鎲￠崝鏇烆嚕閸洖绠氶柛顐犲劜閻撴洖鈹戦悩鎻掓殲闁稿﹥鍔栭妵鍕閳╁喚妫冮梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�?
		Role gRole = RoleManager.getInstance().getRoleByID(guestroleid);
		if (gRole == null){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
			return ;
		}
		GridPos gpos = gRole.getPos().toGridPos();
		AreaInfo gareaInfo = MapUtil.getAreaInfo(hostRole.getMapId(), gpos.getX(), gpos.getY());
		if(gareaInfo==null){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162065, null);
			return ;
		}
		if(!gareaInfo.isQiecuoArea()){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162065, null);
			return ;
		}
		
		
		new PSendInvitePlayPK(hostid,guestroleid).submit();
		return;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793564;

	public int getType() {
		return 793564;
	}

	public long guestroleid; // 被邀请角色ID

	public CSendInvitePlayPK() {
	}

	public CSendInvitePlayPK(long _guestroleid_) {
		this.guestroleid = _guestroleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(guestroleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		guestroleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSendInvitePlayPK) {
			CSendInvitePlayPK _o_ = (CSendInvitePlayPK)_o1_;
			if (guestroleid != _o_.guestroleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)guestroleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(guestroleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSendInvitePlayPK _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(guestroleid - _o_.guestroleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

