
package fire.pb.friends;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestUpdateRoleInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRequestUpdateRoleInfo extends __CRequestUpdateRoleInfo__ {
	@Override
	protected void process() {
		final long currentRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (currentRoleId < 0)
			return;

		mkdb.Procedure proc = new mkdb.Procedure() {
			@Override
			public boolean process() {

				if (xtable.Properties.selectRolename(roleid) == null) {
					// 闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾粌顤�闂佺顑戠换婵嬪蓟瀹ュ浼犻柛鏇ㄥ墮濞咃綁姊婚崒姘簽闁搞劋鍗抽垾鏃堝礃椤忓孩瀚归柨婵嗙凹缁ㄥ鏌涢妶澶夋喚闁哄瞼鍠庨悾锟犲级閹稿巩鈺呮⒑鐎圭姵顥夋い锔诲灦閸┿垹顓兼径妯绘櫍閻熸粌鐬奸懞杈ㄧ節濮橆厾鍙嗛梺鍝勬处閿氶柣蹇撳级閵囧嫰濮�閳╁喚妫冮悗瑙勬礀閵堟悂骞冮姀鐘垫殝闁哄顑欏Λ鍕⒒閸屾艾锟介绮堟笟锟介獮澶愬灳鐡掍焦妞介弫鍐磼濮樻唻绱遍梻浣告啞濞诧箓宕归弶璇炬稑螣閸忕厧鏋戦梺鍝勫暙閻楀棝鎷戦悢鍝ョ闁瑰瓨鐟ラ悘鈺呭船椤栫偞鍋℃繝濠傚暟鏍￠梺缁橆殔鐎涒晝鎹㈠┑鍡╁殫闁哄鍋勯敓濮愬�濆畷鐢碉拷锝庡枟閻撴瑩鏌涢幋娆忥拷鏍拷姘炬嫹:闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎮疯閹矂骞樼紒妯猴拷鍨箾閹寸儐浼嗛柟杈剧畱閻鐓崶銊р檨闁绘挾鍠栭弻锟犲礃閵娿儻鎷烽崫銉︽殰闁割偅娲橀埛鎺楁煕鐏炶锟芥洟鎮橀敃鍌涚厸閻忕偟鍋撶粈鍐磼缂佹娲寸�规洖缍婇、娆撴偂鎼搭喗缍撻梻鍌氬�峰ù鍥敋瑜忛幑銏ゅ幢濞戞鏌у┑鐘诧工鐎氼噣鍩炲鍛斀闁绘寮撴潻褰掓煛閸愩劌浜伴柟椋庡厴閺佹劖鎯旈垾鎰佹交婵＄偑鍊栧ú婵囩椤掑倹顫曢柟鎯ь嚟閻熷綊鏌涢妷銏℃珔閻㈩垬鍔戝娲偡閺夋寧顔�闂佺懓鍤栭幏锟�,闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵娴滃爼鎮㈤崱妯诲弿婵°倕顑嗙�氬綊姊洪悷鎵紞闁哥姵鐗犻妴浣糕槈閵忊�筹拷濠氭煕閳╁叐鎴濃枍瀹ュ鐓熼柣鏂挎憸閻苯顭胯椤ㄥ牓寮锟介獮鎺楀籍閸屾瑧鐟濋梻浣瑰缁诲倿骞忕�ｎ亗锟芥帗绻濆顓烇拷鐢告煥濠靛棛鍑圭紒銊ヮ煼閺岋綁鏁傞崫鍕瀳闂傚洤顦甸弻锝夊箻閹剁瓔锟芥鏌ㄩ悢缁橆棄婵炲皷锟芥剚鍤曞┑鐘崇閺呮悂鏌ｅΟ鑽ゅ弨闁哥偠娉涢—鍐Χ閸℃顫囬梺鎼炲妼缂嶅﹪鏁愰悙鍝勭厸濞达絽寮堕弬锟介梻浣虹帛閻熴儵骞婅箛鏇嫹濮橆剛绉烘慨濠冩そ瀹曠兘顢橀埄鍐撅拷妤呮⒑閸濄儱校妞ゃ劌锕ら悾鐑藉即閻戝棗鎮戞繝銏ｆ硾椤戝洭宕㈤柆宥嗏拺闁告繂瀚崒銊╂煕閺傛寧婀伴柡鍛埣椤㈡稑袙椤撶偟绉洪柟顔规櫇缁數娑甸崪鍐╁閻犱警鐓夐幏宄扳枔閸喗鐏堥梺缁樼墪閵堢鐣峰ú顏呮櫢闁绘灏欓敍婊冣攽椤旂煫顏囥亹婢跺本顫曟俊顖濄��閺�浠嬫煟閹邦剚鈻曢柛銈囧枎閳规垿顢欓懞銉ュ攭闂佽鍟崱娆戞澑濠电偞鍨堕…鍥囬柆宥嗏拺闁告繂瀚埢澶愭煕鐎ｎ亝鍣洪柛鎺戯攻缁轰粙宕ㄦ繝鍕及闂傚鍋勫ù鍕緤閼恒儳顩查柣鎰嚟缁★拷閻熸粌绉堕敓鑺ョ濠㈡﹢锝炶箛鎾佹椽顢旈崟顐ょ崺濠电姷鏁告慨鎾磹婵犳碍鍋￠柟缁樺俯濞撳鏌曢崼婵嗘殭濠碘�冲悑閵囧嫰鏁冮敓浠嬫倶濮橆厾鈹嶅┑鐘叉搐缁犵粯銇勯弮鍥т汗妞わ负鍔岄—鍐Χ閸℃ǚ鎷婚梺鍛婎焼閸ャ劌浠у┑鈽嗗灟鐠�锕�銆掓繝姘厪闁割偅绻冮崳鐣岀磼閻樺崬宓嗛柟顔筋殔椤繈鎮℃惔鈾�鎷梻浣筋嚃閸犳鏁冮姀銈呮槬闁跨喓濮村婵囥亜閺冨浂娼愰悗姘矙濮婄粯鎷呴懞銉с�婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�?
					Module.logger.warn("[CRequestUpdateRoleInfo] find non-existent role info, roleId:" + currentRoleId
							+ " targetRoleId:" + roleid);
					return true;
				}
				String clanname ="";
				Long factionId = xtable.Roleidclan.select(roleid);
				if (factionId != null && factionId > 0) {
					clanname = xtable.Clans.selectClanname(factionId);
				}
				SRequestUpdateRoleInfo send = new SRequestUpdateRoleInfo();
				send.friendinfobean = FriendHelper.toInfoBean(currentRoleId, roleid);
				if (clanname != null) {
					send.friendinfobean.factionname = clanname;
				}
				mkdb.Procedure.psendWhileCommit(currentRoleId, send);
				return true;
			}
		};
		proc.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 806533;

	public int getType() {
		return 806533;
	}

	public long roleid;

	public CRequestUpdateRoleInfo() {
	}

	public CRequestUpdateRoleInfo(long _roleid_) {
		this.roleid = _roleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestUpdateRoleInfo) {
			CRequestUpdateRoleInfo _o_ = (CRequestUpdateRoleInfo)_o1_;
			if (roleid != _o_.roleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestUpdateRoleInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

