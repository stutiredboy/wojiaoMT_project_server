
package fire.pb.pet;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRecoverPetInfo__ extends mkio.Protocol { }

/** 客户端请求查看一个找回宠物的信息
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRecoverPetInfo extends __CRecoverPetInfo__ {
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;

		new mkdb.Procedure() {
			@Override
			protected boolean process() {

				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏堕柣搴ゎ潐濞插繘宕曢幎鑺ユ櫢闁哄倶鍊楃粔鐢告煕閻樺磭澧卞瑙勬礋瀹曠螖娴ｅ搫骞嶉梻浣筋嚃閸ㄨ櫕鏅跺Δ鍚藉寰勯幇顒傤啇闂佸搫顦伴崺濠囩叕椤掑嫭鐓涢悘鐐额嚙閿熻姤顨婂畷鐗堢節閸パ咁攨闂佺粯鍔曞Ο濠傤焽閼恒儰绻嗛柣鎰典簻閿熻姤鐗犲畷婵嬪箳閺傚灝鐏婂┑鐐叉濞存艾顭囬弽銊х鐎瑰壊鍠曢幉楣冩煛娴ｅ憡顥㈤柡灞诲姂閹垽鎮滃Ο鑽ゅ涧缂傚倷绶￠崰妤�螞閸愵喚宓佹慨妤嬫嫹妞ゃ垺鐟╅幐濠冨緞婵犲偆妫楁繝鐢靛Т閻ュ寮堕崠鈩冨闁瑰墽绮埛鏃傦拷骞垮劚濡盯銆呴崣澶岀瘈濠电姴鍊绘晶娑㈡煟閹惧銆掗柨鐔绘缁犲秹宕曢柆宥呯柈妞ゆ劧绲肩换鍡涙煙缁嬭法鏄傚ù婊勭矒閺屻劌鈹戦崱娆忣暫闂佹眹鍔忓▍锝囨閹烘挻缍囬柕濞垮劜鐠囩偤姊烘潪鎵妽闁规瓕宕电划瀣箳閺冩挻瀚归柨婵嗛娴滄繃绻涢崨顐㈢仾缂佺粯绋撻敓鐣屾暩椤牆鐡俊鐐�栭崹闈浳涘┑瀣槬婵炴垯鍨圭粻锝夋煥閺冨倹娅曢柛妯挎閳规垿顢欓弬銈勭返闂佸憡鎸婚惄顖炵嵁濡ゅ懏鍋愮紓浣姑敓钘夌仛閹便劌顫滈崱妤�顫柣鐘冲姧缁辨洜妲愰幒鎾寸秶闁靛绠戦棄宥夋⒑閻熸澘妲婚柟铏悾宄邦煥閸繄鐓戞繝銏ｎ嚃閸樼偤宕堕妸銏″缂備胶铏庨崢濂稿箯鐎ｎ亶鐒介柟閭﹀幒缁诲棝鏌ょ喊鍗炲闁挎稑鎹刣闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎处缁绘繂顕ラ柨瀣凡闁跨喕濮ゅú鐔肩嵁婵犲倻鏆嗛柛鏇ㄥ墯濞呫垽姊洪懞銉冾亪藝椤栫偛姹查柣鎰暜閹风兘宕归锝囧嚒闁诲孩鐭崡鎶芥偘椤曪拷瀹曞爼顢楁径瀣珗闂備礁纾幊鎾绘倶濠靛绀夐柨鏇炲�归悡娑㈡倶閻愰鍤欏┑顔煎�块弻鐔碱敊閸濆嫸鎷峰┑鍡欐殾闁圭儤鍨熷Σ鍫熸叏濡わ拷濡梻妲愰敓锟�
				xbean.Petrecoverlist petRecoverList = xtable.Petrecover.select(roleId);
				if (petRecoverList == null) {
					return false;
				}

				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囩叓閸ャ劍鐓ユい蹇氭硾閳规垿顢欓惌顐簻閻ｇ兘顢楅崟顐㈠亶闁诲海鏁诲濠氬箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︻喖顪冮妶搴′簻妞わ箓浜堕弫鎾寸鐎ｎ偅閿梺闈涚墢椤牓顢氶敐澶婇唶闁哄洨鍋熼娲⒑缂佹◤顏堟倶濮橆儷鎺撴償閵忋垻鐦堥梺姹囧灲濞佳勭閳哄懏鐓欐繛鑼额唺缁ㄧ晫锟藉灚婢橀敃锕傚箲閸曨垰惟闁靛牆娲ゆ晶楣冩⒒娓氾拷濞佳嗗闂佸搫鎳忕粙鎾跺垝婵犳凹鏁嶆繝濠冨姈鐎氬綊鏌ｉ悢鍛婄凡妞ゅ浚浜滈…鍧楁偡闁箑鍓伴柛妤呬憾閺屾盯顢曢妶鍛亖缂備胶濞�缁犳牠寮诲☉姗嗙叆闁跨喓鏅划鍫熸媴閸撴彃娈ㄩ梺璇″灱閻忔劙鎮烽柇锔惧弳闂佸憡娲﹂崢楣冩偂婢舵劖鈷戦弶鐐村椤︼箓鏌涢悢椋庢憼闁逛究鍔戦弫鎾寸鐎ｎ偆鍘梺鍓插亝缁诲倿顢楅姀銈嗙厸闁告侗鍠氶惌鎺撴叏婵犲啯銇濈�规洘绮撻獮鎾诲箳瀹ュ洤鍤紓鍌氬�峰ù鍥敋瑜忛敓鑺ョ煯閸楁娊鐛崘顔芥櫢闁绘灏欓鍝勨攽閻樿尙浠涢柛鏃�鐗滈敓浠嬫涧閻倸顫忓ú顏咁棃婵炴垶鑹鹃。鍝勨攽閳藉棗浜濈紒瀣浮瀵煡宕奸弴銊︽櫌闂佺鏈划宥夋晬韫囨稒鈷戦柛婵嗗濡插吋绻涙径瀣闁稿﹤顕槐鎾诲磼濞嗘垼绐楅梺鍝ュУ閻楃娀骞冭楠炴鎷犻崣澶岋拷顒勬⒑鐟欏嫬鍔ゆい鏇ㄥ弮閵嗗懘鎮滈懞銉ワ拷鐢告煥濠靛棝顎楀ù婊勫姍閺岀喖鏌ㄧ�ｎ偁浠㈠┑顔硷龚濞咃絿妲愰幒鎳崇喖宕归鍛棨闂傚倷绀侀浠嬪级閸噮鐎烽梻浣芥硶閸犳洘鎱ㄩ妶澶嬪殞闁告挆鍛槸婵犵數濮撮崑鍡楊焽閺嶃劎绠剧�瑰壊鍠曠花鑽わ拷鐟版啞缁诲倿鍩為幋锔藉亹闁圭粯甯楀▓顓㈡⒑濞茶寮鹃柛锝忕到椤繘鎼归崷顓狅紲濠碘槅鍨卞浠嬪吹鐎ｎ剛纾藉ù锝呮惈鏍￠梺鍦嚀濞差參鎮伴锟藉畷姗�鍩為崹顔荤凹闂備礁鎲￠崝蹇涘疾濞戙垹绀堥柛鎰ゴ閺�浠嬫煟閹邦剛鎽犻悘蹇曞閵囧嫰顢旈崟顐ゃ偠Id
				if (petRecoverList.getUniqids().contains(uniqid) == false) {
					return false;
				}

				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏堕柣搴ゎ潐濞插繘宕曢幎鑺ユ櫢闁哄倶鍊楃粔鐢告煕閻樺磭澧卞瑙勬礋瀹曠螖娴ｅ搫骞嶉梻浣筋嚃閸ㄨ櫕鏅跺Δ鍚藉寰勯幇顒傤啇闂佸搫顦伴崺濠囩叕椤掑嫭鐓涢悘鐐额嚙閿熻姤顨婂畷鐗堢節閸パ咁攨闂佺粯鍔曞Ο濠傤焽閼恒儰绻嗛柣鎰典簻閿熻姤鐗犲畷婵嬪箳閺傚灝鐏婂┑鐐叉濞存岸宕甸弴銏＄厱妞ゆ劧绲剧粈锟介梻浣稿船濞诧妇鎹㈠☉銏犵闁诲繑妞挎禍顏堝灳閺嶎偓鎷烽敐搴℃灍闁抽攱鍨归敓鍊燁潐濞叉牕煤閵娧勬殰婵炴垶鐟ょ换鍡樸亜閹扳晛鐏╅柡鍡悼閿熻姤顔栭崰鏍�﹀畡閭﹀殨闁圭虎鍠楅弲顒勬煕閺囥劌骞楁繝銏″灴濮婄粯鎷呴崨濠冨創濠电偛鐪伴崝鎴濈暦閹伴偊鏁冮柨鏇嫹閸烆垶鎮峰鍐閾荤偞銇勯弽顭戝殼闁哄啫鐗婇弲鏌ユ煕濞戝崬骞楁繛鍫濈埣濮婄儤瀵煎▎鎴犐戝┑锛勫仒缁瑥顕ｆ繝姘伋鐎规洖娲﹀▓鏇㈡煟鎼搭垳绉甸柛鎾寸閳灚绻濋悽闈浶ユい锝勭矙瀹曟粌鈹戠�ｎ亞鐣洪梺绋挎湰缁嬫劗鎹㈤崱娑欑厽闁硅揪绲鹃ˉ澶愬船椤栨凹娓婚柕鍫濇閳锋帞绱掗鍛仸鐎规洘鍨垮畷銊э拷娑櫱氶幏濠氭⒑缁嬫寧婀伴柣鐔濆洤绀夌�广儱顦伴悡鐔搞亜韫囨挸顏紒澶庢閿熷�燁潐濞叉﹢宕濆▎蹇ｅ殨闁圭虎鍠楅崐鍓佺磽娴ｈ偂鎴﹀Φ濠靛洢浜滈柕蹇婃閼板灝鈹戦鍡樺闂備胶绮…鍥极閹间礁姹叉い鎰堕檮閳锋帒霉閿濆牆袚缁绢厼鐖奸弻娑㈡晲韫囨洜鏆ゅΔ鐘靛仜缁绘﹢寮幘缁樻櫢闁跨噦鎷�?
				xbean.DiscardPet discardPet = xtable.Petrecyclebin.select(uniqid);
				if (discardPet == null) {
					return false;
				}

				Pet pet = Pet.getPet(discardPet.getPet());

				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垹顭峰缁樻媴閻熼偊鍤嬪┑鐐插级閻楃姴鐣烽幇鏉跨濞达絿顭堥悗顓㈡⒑缁嬭法鐏遍柛瀣仱閹繝濡烽埡鍌滃幗闂佸搫娲ㄩ崑娑㈡晸閽樺璐￠柨鐔诲Г閻旑剟骞忛敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫ょ紓渚婃嫹濠电姴娲﹂悡銉╂煟閺冨浂鍤欑悮姘辩磽娴ｈ櫣甯涢柣鈺婂灠閻ｇ兘顢旈崼婵堫槰濡炪倕绻愰弻濠傤煥閸啿鎷虹紒缁㈠幖閹冲繘鎮甸鍡欑＜妞ゆ棁濮ょ亸顓㈡煟閿濆鏁辩紒铏规櫕缁瑩宕归鑲┿偖闂傚倷鑳剁划顖炲蓟閵娾晛鍚归柡宥庡幖缁狀垶鏌ｉ幋锝嗩棄闁搞劌鍊归妵鍕箛闂堟稐绨煎銈嗘⒐濡啫顫忛搹鍦＜婵☆垰鎼～鎴︽煟韫囨挾绠查柣鐕傚缁骞掑Δ锟介～鍛存煏閸繃顥犻柛妯圭矙濡懘顢曢姀锛勩偒缂備焦褰冮妶鎼佸蓟閸ヮ剦鏁嶉柣鎰嚟閸樻悂鏌ｈ箛鏇炰粶濠⒀嗘鐓ら柟缁㈠枟閻撴洟鏌嶉崫鍕靛剳缂佲槄鎷烽柣搴ゎ潐濞叉鏁幒妤�鐓橀柛鎰靛枛缁�宀勬煃閳轰礁鏆欐い蹇撶埣濮婃椽宕烽鐐插濠殿喖锕ㄥ畷鍨珶閺囥垹绀傜紒妤勬〃缁ㄥ姊洪崫鍕窛闁稿鍋よ棢闁绘劗鍎ら崐鍨叏濡厧浜鹃悗姘炬嫹?
				SRecoverPetInfo send = new SRecoverPetInfo();
				send.petinfo = pet.getProtocolPet();
				mkdb.Procedure.psendWhileCommit(roleId, send);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788587;

	public int getType() {
		return 788587;
	}

	public long uniqid; // 唯一id

	public CRecoverPetInfo() {
	}

	public CRecoverPetInfo(long _uniqid_) {
		this.uniqid = _uniqid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(uniqid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		uniqid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRecoverPetInfo) {
			CRecoverPetInfo _o_ = (CRecoverPetInfo)_o1_;
			if (uniqid != _o_.uniqid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)uniqid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(uniqid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRecoverPetInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(uniqid - _o_.uniqid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

