
package fire.pb.team;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAcceptToTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑﹦绋忔繝銏ｆ硾椤戝洭銆呴幓鎹楀綊鎮╁顔煎壈缂佺偓鍎冲鈥愁嚕閸洖閱囨い鎰垫線缁ㄥ瓨绻涚�涙鐭婄紓宥咃躬瀵鈽夐姀鈺傛櫇闂佺粯蓱瑜板啯鎱ㄦ惔锝囩＝濞撴艾锕ョ�氬綊姊虹粙璺ㄧ伇闁稿鍋ら幃陇绠涢幙鍐數闁荤姾娅ｉ崕銈壦夐悙瀵哥闁告侗鍘介ˉ鐘绘煙椤曞懎娅嶉柡浣规崌閺佹捇鏁撻敓锟�
 * @author changhao
 *
 */
public class CAcceptToTeam extends __CAcceptToTeam__ {
	
	
	@Override
	protected void process() {
		// protocol handle
		TeamManager.logger.info("Enter: " + this.getClass());
		final long leaderRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		final long applierRoleId  = this.roleid;
		if (leaderRoleId < 0)
			return;
		if (applierRoleId != 0)
		{
			fire.pb.PropRole applierprop = new fire.pb.PropRole(applierRoleId, true);
			if(applierprop.getProperties().getCruise() > 0) {
				TeamManager.logger.info("CAcceptToTeam:闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掗懖鈺冪＝濞撴艾锕ョ�氬綊姊虹粙璺ㄧ伇闁稿鍋ら幃陇绠涢幙鍐數闁荤姾娅ｉ崕銈壦夐悙瀵哥闁告侗鍘介ˉ鐘绘煙椤曞懎鏋涢柍瑙勫灩閿熸枻缍嗛崑锟介柟鐤缁辨帞绱掗姀鐘茬睄闂佺尨鎷烽弶鍫氭櫔閹峰嘲顫濋悙顒�顏�?" + applierRoleId + "闂傚倸鍊搁崐鎼佸磹妞嬪孩顐芥慨姗嗗墻閻掍粙鏌ゆ慨鎰拷鏍拷姘煼閺岋綁寮崒姘粯缂備緤鎷峰璺虹焿閹风兘鎯傞崨濠傤伓闂備浇娉曢崰宥囧垝濞嗘挾宓侀煫鍥ㄥ搸娴滃綊鏌熼悜妯虹仼濡ょ姴娲弻锝夋偄閸洘顎栭梺绋磕涢崶褏顔嗛梺缁樺灱濡嫮绮婚搹顐＄箚闁靛牆绻戠�氳绻涚壕瀣汗濠电儑鎷烽梺鍝勬湰濞叉ê顕ラ崟顖氶唶婵犻潧妫楅ˉ婵嬫⒒娴ｇ懓顕滄繛鍙夌墵瀹曟劘銇愰幒鎾充簵濠电偛妫欓幐濠氭偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷?,婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖缁愭淇婇妶鍛殶缂佹唻绠撻弻娑滎槼妞ゃ劌鎳愭竟鏇°亹閹烘挾鍘搁悗瑙勬惄閸犳牠寮甸鍌︽嫹闂堟稓鐒告慨濠呮缁瑩骞愭惔銏″缂傚倷绀侀鍡涘箲閸ヮ剙鏄ラ柕蹇嬪�曠猾宥夋煕瀹�瀣閻庢俺顫夐〃銉╂倷閼碱兛铏庨梺鍛婃⒐瀹�鎼佸蓟閿濆憘鏃堟晸閽樺）娑樷攽閸℃瑦娈鹃梺闈涚箞閸婃洜绮荤紒妯镐簻闁哄啫鍊瑰▍鏇㈡煕濡湱鐭欐慨濠冩そ濡啫鈽夊槌栧敽濠电姵顔栭崰姘跺礂濡警鍤曢柟闂寸缁�鍐煃閻熻埇浠掔紒銊ヮ煼濮婃椽宕崟顒�鍋嶉梺鍛婃煥閺堫剟寮查崜渚婃嫹閻㈠憡浜ら柟鐑筋棑閹叉挳宕熼鍌ゆО婵＄偑鍊戦崝宀勬晝閵夛妇鈹嶅┑鐘叉处閸婂鏌﹀Ο渚Ш闁告ɑ鎮傚铏圭矙閼愁垰顏梺绋款儏閿曨亪鐛箛娑欐櫢闁跨噦鎷�");
				fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 162027, null);
				fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 162026, null);
				return;
			}
			
			fire.pb.PropRole leaderprop = new fire.pb.PropRole(roleid, true);
			if(leaderprop.getProperties().getCruise() > 0) {
				TeamManager.logger.info("CAcceptToTeam:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱閺嬫盯鏌涢弬娆惧剶闁哄苯绉归弻銊э拷锝庡亜绾炬娊姊洪崫鍕効缂傚秳绀侀锝夘敆閸曨偄鐎銈嗘濡嫰鏁撶粵瀣仩闁宠鍨块、姘跺幢濞嗘嚩銈夋⒑閻熸澘娈╅柟鍑ゆ嫹" + roleid + "闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇悗骞垮劚閻楀棝宕㈤垾鎰佹富闁靛牆鍊瑰▍鏃堟煙閸戙倖瀚�?" + applierRoleId + "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱閺嬫盯鏌涢弬娆惧剶闁哄苯绉归弻銊э拷锝庡亜绾炬娊姊洪崫鍕効缂傚秳绀侀锝夘敆閸曨偄鐎銈嗘濡嫰鏁撶粵瀣仩闁宠鍨块、姘跺幢濞嗘嚠鎴︽⒑閸涘﹥鈷愰柣妤冨█閻涱噣宕奸妷銉庘晠鏌曟径鍫濈仾闁哄偊鎷烽梻鍌欐祰椤鐣峰Ο琛℃灃婵炴垯鍨归弰銉╂倶閻愮紟鎺楀绩娴犲鐓熸繛鍡楃箲閸ｆ椽鎮楀杈ㄥ殌妞ゎ亜鍟存俊鍫曞川椤栨粠鍞堕梺璇插濮樸劑宕楀Ο铏规殾妞ゆ牜鍋涘婵嬫倵濞戞瑯鐒介柛妯绘崌濮婅櫣锟藉湱濮甸妴鍐磼閿熻姤绗熼敓钘夘嚕閹惰姤鍋勯柛蹇氬亹閸橀亶姊洪崘鍙夋儓闁稿妫楅埢鎾愁煥閸喓鍘搁悗鐧告嫹閻庯綆鍓欓崺宀勬煣娴兼瑧绉柡灞剧洴閳ワ箓骞嬪┑鍥╀壕闂備礁鎲￠敃顐﹀箯閿燂拷??,濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚敐澶婄闁挎繂妫Λ鍕磽娓氬﹥瀚归梺绋挎湰缁嬫帡宕ｈ箛鏂剧箚闁靛牆鎷嬮崕鎰版倵濮橆剛绉烘慨濠呮閹风娀鍨鹃搹顐や壕闂備礁鎼幏瀣磻婵犲洤鏋侀柟鍓х帛鐎电姴顭跨捄渚創缁绢叏鎷锋繝鐢靛У椤旀牠宕规總绋跨煑闁告劑鍔庨弳锕傛煟閵忕姵鍟為柛濠勫厴閺岋綁骞嬮悜鍡欏姺闂佸憡锕㈡禍璺何涢崨鎼晝闁靛繆鍓濋幃娆忣渻閵堝棗鐏ラ柟铏悾宄扳攽鐎ｎ偅娅嗛梺鐟扮摠鐢偟绮诲鑸电厽闁绘ê寮堕崢鍌炴煕閺囥劌浜藉ù纭锋嫹");
				fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 162026, null);
				fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 162027, null);
				return;
			}				
		}
		
		Long leaderclanfightid = xtable.Roleid2clanfightid.select(leaderRoleId);//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涘Ο缁樺�愭鐐村姍閺佹挻绂掔�ｎ偀鎷绘繛杈剧秬濞咃絿鏁☉銏＄厸閻忕偠顕ф俊浠嬫煛閸涙澘鐓愰柟顖涙閺佹劙宕堕埡鍐ㄥЦ婵犵數濮烽弫鍛婃叏閺夋嚚娲晝閸屾稑浜楅梺鍝勬储閸ㄦ椽鎮￠妷鈺傜厸闁稿本绋戦婊堟煙椤栨氨澧曢柍瑙勫灴閸ㄩ箖鎮欓挊澶夊垝闂備礁鎼張顒傜矙閹达箑鐓濋幖娣妼缁犳稒銇勯幘璺侯�屾俊韫嵆濮婅櫣鎷犻崣澶嬪闯闂佽桨鐒﹂幃鍌氱暦閵忥綆妯勯梺鎸庣箘閸嬫盯鍩為幋鐙呮嫹閿濆懐浠涢柡鍜冪秮濮婅櫣绱掑Ο鍝勵潓闂佸憡鐔幏椋庣磽娓氬洤鏋涢柣鏍帶椤繒绱掑Ο鑲╂嚌闂佽法鍠曞Λ鍕�﹂崶顒佸殥闁靛牆娲ｇ粭澶愭⒑閸︻厼鍔嬮柛鈺佺墕闇夐柡宥庡幗閻撳繐鈹戦悙闈涗壕婵炲懎妫濋弻娑㈠Χ閸涱垰鈪甸梺鍝勮閸旀垿骞冮妶澶婄＜婵炴垶锕╂导锟� by changhao
		if (leaderclanfightid != null)
		{
			Long applierclanfightid = xtable.Roleid2clanfightid.select(applierRoleId);//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涘Ο鍝勬倯缂佸倹甯掔叅妞ゅ繐鎳愰崢浠嬫煙閼测晞藟闁告挻绻勯幏褰掑灳閺傘儲鏂�濡炪倖鐗徊钘夘嚕椤旀拝鎷风憴鍕闁轰礁顭烽獮鍐ㄢ枎閹炬潙锟界粯淇婇婊冨付妤犵偞锕㈠缁樻媴閸涘﹥鍎撳銈忛檮婢瑰棝鏁撻悾宀�鎳楅柛銉戝洦锛楅梺鑽ゅ枑閻熴儳锟芥凹鍠氬褔鏁撴禒瀣拺閻犳亽鍔岄弸宥囩磼椤旂晫鎳囬柕鍡曠窔瀵噣宕煎┑瀣暪婵犵數濞�濞佳囨偋濠婂吘锝夘敍濞戞绠氶梺缁樺姦娴滄粓鏁撻懞銉у⒌鐎规洖缍婇幃鈩冩償濡崵浜欓梻浣告惈濞层劍鎱ㄩ悜鑺ュ仢缂備焦眉缁诲棝鏌曢崼婵囧櫤闁革絾妞介弻锝夊箻鐎靛憡鍣伴梺璇″枟椤ㄥ懘鍩ユ径濞炬瀻閻忕偞鎷濈槐娆愪繆閻愵亜锟芥洜鎹㈤幇顕嗘嫹濮橈拷閸パ呭摋闂佹寧娲栭崐褰掓偂閵夆晜鐓熼柡鍐ㄥ�荤敮娑欍亜閵夈儺妯�闁哄苯绉归幐濠冨緞濡儵鏋呴梻浣芥〃閻掞箓骞戦崶顒�鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘? by changhao
			if (!leaderclanfightid.equals(applierclanfightid))
			{
 			    fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 410028,  null);
 			    return;
			}
			else
			{
				xbean.ClanInfo claninfo = fire.pb.clan.ClanUtils.getClanInfoById(roleid, true);
				if (claninfo == null)
				{
					return;
				}
				
				xbean.ClanMemberInfo memberinfo = claninfo.getMembers().get(applierRoleId);
				if (memberinfo == null)
				{
	 			    fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 410029,  null);
					return;
				}
			}
		}
		else
		{
			Long applierclanfightid = xtable.Roleid2clanfightid.select(applierRoleId);//闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掓ィ鍐┾拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬磸閸ㄨ櫣绮嬮幒鏃撴嫹閿濆骸澧憸鏉挎椤啴濡堕崱妤冪懆闁诲孩鍑归崣鍐箖閿熺姴鍗抽柕蹇嬪灩瑜板嫰姊洪幖鐐插姦妞ゃ儲鎹囧畷姘鐎涙鍘卞┑鈽嗗灣閸庛倝骞夐崫銉х＜閺夊牄鍔屽ù顔撅拷瑙勬穿缁插�熺亽闂佸憡绻傜�氼噣濡堕鎴掔箚闁靛牆娲ゅ暩闂佺顑嗛惄顖炪�侀弽顓炲窛闁规鍠曢懜顏堟⒒閸屾瑨鍏岀紒顕呭灦瀹曞綊宕奸弴妤嬫嫹閿曞倸鐐婃い鎺嶇閸擃厾绱撻崒娆戝妽妞ゎ厼娲ㄧ划缁樸偅閸愨晝鍘甸梺鍦拡閸樺ジ鎮橀敓鐘冲�垫慨妯煎亾鐎氾拷? by changhao
			if (applierclanfightid != null)
			{
				if (!applierclanfightid.equals(leaderclanfightid))
				{
	 			    fire.pb.talk.MessageMgr.sendMsgNotify(applierclanfightid, 410030,  null);	
	 			    return;
				}				
			}
		}
		
		new PAcceptToTeam(leaderRoleId, applierRoleId, accept, true).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787235;

	public int getType() {
		return 787235;
	}

	public long roleid; // 申请组队者ID
	public int accept; // 0 表示拒绝，1表示接受（拒绝情况下，如果roleid为0，表示清空申请者列表）

	public CAcceptToTeam() {
	}

	public CAcceptToTeam(long _roleid_, int _accept_) {
		this.roleid = _roleid_;
		this.accept = _accept_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(accept);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		accept = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAcceptToTeam) {
			CAcceptToTeam _o_ = (CAcceptToTeam)_o1_;
			if (roleid != _o_.roleid) return false;
			if (accept != _o_.accept) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += accept;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(accept).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAcceptToTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = accept - _o_.accept;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

