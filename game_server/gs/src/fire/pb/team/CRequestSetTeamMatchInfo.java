
package fire.pb.team;
import fire.pb.main.ConfigManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestSetTeamMatchInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸偅缍堝┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锝呭悁闁垶鏌＄仦鍓ф创闁糕晛瀚板畷姗�顢旀担璇℃綌缂傚倸鍊风欢銈夊箯妞嬪函鎷烽惂鍛婂闂佽法鍠嶇划娆撶嵁婢舵劕绠瑰ù锝囨嚀娴滈亶姊洪崜鎻掍簼缂佽瀚伴幃鐑藉Ω閳哄倻鍘介梺闈涚箚閺呮盯鎮橀悩缁樼厱闁绘棁顕ч崝鐢垫喐妫颁胶绐旀慨濠冩そ楠炴牠鎮欓幓鎺懶ョ紓鍌欐祰鐏忣亝鎱ㄩ妶澶婄柧闁割偅娲栫粻鐢告煙鐟欏嫷娈旀繝锟介崡鐐╂闁汇垹鎲￠悡銉╂倵閿濆簼鎲惧ù纭锋嫹
 * @author changhao
 *
 */
public class CRequestSetTeamMatchInfo extends __CRequestSetTeamMatchInfo__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestsetteammatchinfo = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{	
				if (!checkLevel()) //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閻撴瑩鏌熼娑欑凡鐞氭岸姊虹粙娆惧剭闁稿﹥绻堝濠氭偄閻氬瓨瀚归柣銏☆問閻掗箖宕粙搴撴斀闁宠棄妫楁禍楣冩煙閸戙倖瀚�? by changhao
				{
					psend(roleid, new STeamError(TeamError.LevelError));
					TeamManager.logger.debug("CRequestSetTeamMatchInfo闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓缃曢梻浣告惈濞层劍鎱ㄦ搴ｇ焼濠电姴鍊甸弨浠嬫煟濡搫绾ч柟鍏煎姍閺屾稓浠︾拠鎻掝潎闂佸搫鏈ú鐔风暦閻撳簶鏀介柛銉戝懐宕烘繝纰夌磿閸嬬喖骞婇幘璇茬柈闁秆勩仜閿熸枻濡囬幑鍕Ω閿曪拷绾绢垶姊洪幆褏绠版繝锟介柆宥呯妞ゆ牜鍋為埛鎴犵磽娴ｈ鐒介柍鍙ョ窔閺岀喖鎮烽悧鍫濇灎濡ょ姷鍋涢崯浼村箟閹绢喖绀嬫い鎺炴嫹妞ゅ孩鎸剧槐鎾存媴閸撴彃鍓扮紓浣靛姂娴滃爼鐛幇鏉跨妞ゆ棁袙閹峰搫鈹戦鐐殌婵炲眰鍊濋弫鎾绘嚍閵夛妇顦ラ柧鑽ゅ仦缁绘繈妫冨☉鍗炲壈闂佽棄鍟伴崰鏍蓟閺囩喓绠鹃柛顭戝枛婵姊洪崫鍕靛剰闂佸府缍佸濠氭偄閸忕厧锟界粯淇婇婵嗕汗闁伙綁娼ч埞鎴︽倷閼碱剙鈷婇梺鐟板殩閹凤拷 "+roleid);
					return true;					
				}				
				
				if (targetid != 0)
				{
					if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽顐粶缂侊拷婢跺绻嗛柕鍫濇噺閸ｅ湱绱掗悩闈涒枅闁哄瞼鍠栭獮鍡氼槾闁挎稑绉归弻锟犲幢椤撶姷鏆ゅ┑顔硷攻濡炰粙銆佸Δ鍛櫢闁伙絽鐬奸惌鎾绘倵閻㈠憡浜ら柟宄板槻椤繈顢楁径瀣撱劑姊虹捄銊ユ灆婵☆偄瀚划璇差吋婢跺﹦锛熼梻渚囧墮缁夊绮婚悩璇茬闁圭⒈鍘鹃崢婊呯磽瀹ュ棛澧甸柡灞炬礋瀹曠厧鈹戦幇顓壯囨⒑缂佹ɑ灏版繛鑼枛瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷? by changhao
					{
						DSTeamMatchInfo config = ConfigManager.getInstance().getConf(DSTeamMatchInfo.class).get(targetid);
						if (config == null)
						{
							psend(roleid, new STeamError(TeamError.NoTarget));
							TeamManager.logger.debug("CRequestSetTeamMatchInfo:闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倝绠栭弻宥夊传閸曨剙娅ｇ紓浣瑰姈椤ㄥ棙绌辨繝鍥ч柛娑卞枛濞呫倝姊虹粙娆惧剰妞わ缚鍗虫俊鐢稿礋椤栨褔鏌涘☉鍗炵仯闁绘挻妫冨濠氬磼濮橆剨鎷烽幖浣哥９闁绘垼濮ら崐鍧楁煥閺冿拷閹锋繈骞忔搴ｇ當婵炴垶蓱婢跺嫰鏌涚�ｅ墎绡�闁哄本娲樼换娑㈡倷椤掍胶褰熼梻浣芥〃缁�渚�顢栨径鎰摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹 "+roleid);
							return true;					
						}							
					}
					else
					{
						STeamMatchInfo config = ConfigManager.getInstance().getConf(STeamMatchInfo.class).get(targetid);
						if (config == null)
						{
							psend(roleid, new STeamError(TeamError.NoTarget));
							TeamManager.logger.debug("CRequestSetTeamMatchInfo:闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倝绠栭弻宥夊传閸曨剙娅ｇ紓浣瑰姈椤ㄥ棙绌辨繝鍥ч柛娑卞枛濞呫倝姊虹粙娆惧剰妞わ缚鍗虫俊鐢稿礋椤栨褔鏌涘☉鍗炵仯闁绘挻妫冨濠氬磼濮橆剨鎷烽幖浣哥９闁绘垼濮ら崐鍧楁煥閺冿拷閹锋繈骞忔搴ｇ當婵炴垶蓱婢跺嫰鏌涚�ｅ墎绡�闁哄本娲樼换娑㈡倷椤掍胶褰熼梻浣芥〃缁�渚�顢栨径鎰摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹 "+roleid);
							return true;					
						}							
					}				
				}
				
				Long teamid = xtable.Roleid2teamid.select(roleid);
				
				Team team = null;
				if(teamid != null)
				{
					team = TeamManager.getTeamByTeamID(teamid);	//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎽傜�ｎ喖鐐婃い鎺嶇贰濡啫鈹戦悙宸殶妞ゆ帟灏欑槐鐐寸瑹閿熻棄顕ｉ锕�绀冩い鏃囧亹閿涙粌鈹戦鏂よ�跨痪顓狀焾鍗辨い鏍仦閳锋帒霉閿濆浂鐒炬い銉ョ箻閺屾稓锟斤綆浜濋ˉ銏拷瑙勬礈婢ф骞嗛弮鍫濐潊闁绘ɑ褰冮～濠囨⒒閸屾艾锟芥悂宕愰幖浣哥９闁归棿绀佺壕褰掓煙闂傚顦﹂柣銈庡枛闇夐柛蹇撳悑缂嶆垹绱掗幇顓ф畼闁跨喕妫勭粻宥夊磿閸楃伝娲晝閸岋妇绋忛梺鍝勬储閸ㄦ椽鎮￠悢鍏肩厵闂侇叏绠戦弸娑㈡煕閺傛鍎旈柡宀嬬秮楠炴﹢宕￠悙鎻掝潛闂傚倸娲らˇ鐢稿蓟閵娿儮鏀介柛鈾�鏅滈埢鎾斥攽閳藉棗浜濋柛銊ユ贡濡叉劙骞掗幘宕囩獮濠电偞鍨堕悷銉╊敂閿燂拷 by changhao
					team.getTeamInfo().setTargetid(targetid);
					team.getTeamInfo().setMinlevel(levelmin);
					team.getTeamInfo().setMaxlevel(levelmax);
				}
				
				Long roleidteamId = xtable.Roleid2teamid.get(roleid);
				if (teamid != roleidteamId)
				{
					psend(roleid, new STeamError(TeamError.UnkownError));
					TeamManager.logger.debug("CRequestSetTeamMatchInfo:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲ㄩ崰鎾跺姬閿熶粙姊哄Ч鍥х仼闁诲繑宀搁幃娆撳箳濡や讲鎷婚梺绋挎湰閻熝囁囬敃鍌涚厵缁炬澘宕禍浼存煙椤斻劌娲ら獮銏＄箾鐎涙ɑ绶叉繛宸弮閵嗕礁鈽夊Ο閿嬫杸闂佸憡娲︽禍婵嬫儓韫囨挴鏀介柣姗嗗枛閻忛亶鏌涢埡鍌滃⒌鐎规洘绻堝鎾偐閻㈢數鍔堕梻浣芥硶閸ｏ箓骞忛敓锟�? "+roleid);
					return true;
				}
								
				SRequestTeamMatch msg = new SRequestTeamMatch();
				msg.levelmin = levelmin;
				msg.levelmax = levelmax;
				msg.targetid = targetid;
				msg.typematch = 3;
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);
				
				return true;
			}
			
		};
		requestsetteammatchinfo.submit();	
	}
	
	private boolean checkLevel() //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閻撴瑩鏌熼娑欑凡鐞氭岸姊虹粙娆惧剭闁稿﹥绻堝濠氭偄閻氬瓨瀚归柣銏☆問閻掗箖宕粙搴撴斀闁宠棄妫楁禍浠嬫煕閵婏箑鈻曟鐐差槸椤垹鐣濋敓浠嬫偪閿熶粙姊洪悷鏉跨稏婵炴潙娲敐鐐村緞婵犲骸娈梺鍛婃处閸ㄦ壆绮诲☉娆嶄簻闁圭儤鍨垫禍鐐翠繆瀹割喖鐏︽慨濠勭帛閹峰懐绮电�ｎ偆绉烽梻浣侯焾妤犳悂宕ョ�ｎ喖绠為柕濞炬櫅鍥存繝銏ｆ硾閿曪箓寮昏濮婃椽宕橀崣澶嬪創闂佺懓鍟跨换妯虹暦閹达附鏅插璺侯儑閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷? by changhao
	{
		if (this.levelmin > this.levelmax)
		{
			return false;
		}
		
		if (this.levelmin <= 0 || this.levelmax <= 0)
		{
			return false;
		}
		
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愯ぐ鎺戠；閻庯綆鍠楅悡鐔兼煙闁箑澧柟顖氱墛濞艰鈹戠�ｎ偀鎷洪梺鍛婄☉閿曘倖鎱ㄩ敃鍌涚厱闁绘ê纾晶鐢碉拷娈垮枛閹诧紕绮悢鍏兼櫢濞寸姴顑呴拑鐔兼煥濠靛棙鍟掗柡鍐ㄧ墛閺呯霉閻樺樊鍎愰柛瀣儔閺屾盯鍩勯崘顏呭櫘闂佹椿鍘奸悧鎾诲蓟閵娾晛绫嶉柨鐔剁矙瀹曠懓鈹戦崼鐔峰簥闂佺硶鍓濈粙鎺楁偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閻撴瑧绱撴担濮戭亪宕归崒鐐寸叆婵犻潧妫Σ鍝ョ磼閻樺灚鍤�闂囧鏌ㄥ┑鍡橆棤闁硅棄鍟伴幃顔尖攽鐎ｎ偀鎷绘繛杈剧悼閹虫捇顢氬鍕闁告瑥顦悘鈺冪磼椤旇偐澧涚紒妤冨枛閺佹挻绂掔�ｎ亞鐣炬繛鎾寸啲閹风兘鏌＄仦鑺ヮ棞妞ゆ挸銈稿畷鍗炩枎韫囨挾鐤勯梻鍌氬�风欢姘焽瑜旂瘬闁跨喍绮欏濠氬礋椤愩埄浼�缂備浇浜崑銈夌嵁鐎ｎ喗鏅滈柣锝呰嫰楠炲牓姊绘担铏瑰笡闁搞劑娼х叅闁挎梹鎷濋幏宄邦潩閻愵剙顏� by changhao
		
		return true;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794499;

	public int getType() {
		return 794499;
	}

	public int targetid; // 目标id by changhao
	public int levelmin; // 等级下限 如果是个人匹配这个忽略 by changhao
	public int levelmax; // 等级上限 如果是个人匹配这个忽略 by changhao

	public CRequestSetTeamMatchInfo() {
	}

	public CRequestSetTeamMatchInfo(int _targetid_, int _levelmin_, int _levelmax_) {
		this.targetid = _targetid_;
		this.levelmin = _levelmin_;
		this.levelmax = _levelmax_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(targetid);
		_os_.marshal(levelmin);
		_os_.marshal(levelmax);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		targetid = _os_.unmarshal_int();
		levelmin = _os_.unmarshal_int();
		levelmax = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestSetTeamMatchInfo) {
			CRequestSetTeamMatchInfo _o_ = (CRequestSetTeamMatchInfo)_o1_;
			if (targetid != _o_.targetid) return false;
			if (levelmin != _o_.levelmin) return false;
			if (levelmax != _o_.levelmax) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += targetid;
		_h_ += levelmin;
		_h_ += levelmax;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(targetid).append(",");
		_sb_.append(levelmin).append(",");
		_sb_.append(levelmax).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestSetTeamMatchInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = targetid - _o_.targetid;
		if (0 != _c_) return _c_;
		_c_ = levelmin - _o_.levelmin;
		if (0 != _c_) return _c_;
		_c_ = levelmax - _o_.levelmax;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

