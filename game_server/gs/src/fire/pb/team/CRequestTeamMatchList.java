
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestTeamMatchList__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜堕弫鍥煏韫囨洖啸闁告繃顨婂缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閺囥垹绠ｆ繝銏＄箓缂嶅﹤鐣峰Δ鍛闁兼祴鏅濋埢蹇曠磽閸屾瑧绛忛柟鐑筋棑閿熺晫娅㈤幏鐑芥煥閻斿墎鐭欐鐐差樀楠炴牗鎷呴悷棰佺綍闂備礁澹婇崑鍛崲閸曨垱鍋￠柕濞炬櫆閻撶喖鏌曡箛濠冩珔闁诲繆锟芥枼鏀介柣鎰嚋瀹搞儲銇勯銏㈢閻撱倖銇勮箛鎾村櫣闁跨喍绮欓弨閬嶅Φ閸曨垰绠抽柣鎰綑椤忓墎绱撻崒娆戠瓘闁归鍏橀弻娑㈠箛闂堟稒鐏嶉梺缁樻尭缁绘﹢寮诲☉銏犵叀闁糕剝顨呯粻娲煟鎼淬垻鍟查柟鍑ゆ嫹
 * @author changhao
 *
 */
public class CRequestTeamMatchList extends __CRequestTeamMatchList__ {
	@Override
	protected void process() {
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestteammatchlist = new mkdb.Procedure()
		{
			@Override
			protected boolean process() //role->teammatch by changhao
			{
				SRequestTeamMatchList msg = new SRequestTeamMatchList();
				xbean.Properties prop = xtable.Properties.select(roleid);
				if (prop == null)
				{
					msg.targetid = targetid;
					msg.ret = 0;
					
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					return true;
				}
				
				int level = prop.getLevel();
				
				xbean.ETeamMatch ematch = xtable.Targetid2teammatch.select(0);
				
				if (ematch == null)
				{
					msg.targetid = targetid;
					msg.ret = 0;
					
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					
					return true;
				}
				
				if (num <= 0) //闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊瑜滃ù鏍煏婵炲灝鍔存繛鎾愁煼閺岀喖鎮滃鍡樼暥缂佺虎鍙忛幏鐑芥⒒娴ｇ瓔娼愰柛搴ｅ帶铻為柛鏇ㄥ灡閳锋帗銇勯弽銊с�掔紒鐘插⒔閿熺晫鎳撴竟濠囧窗閺囩姾濮冲┑鍌氭啞閻撶喖鏌熼幆褍鑸归柛鏃�绮庣槐鎺旂磼濡吋鍒涢悗瑙勬礀瀹曨剝鐏掗柡澶屽仦濠㈡﹢宕归弮鍫熲拻濞达綀顫夐崑鐘绘煕婵炑冩搐缁狀垶鏌ㄩ悤鍌涘 by changhao
				{
					msg.targetid = targetid;
					msg.ret = 2;
					
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					return true;
				}
					
				int curnum = 0;
			
				for (java.util.Map.Entry<Long, xbean.TeamMatch> e : ematch.getTeamid2matchdata().entrySet())
				{
					xbean.TeamMatch teammatch = e.getValue();
					if (targetid == 0 || (teammatch.getTargetid() == targetid && teammatch.getMatchtype() == 1)) //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕婵狅拷闁秴绠查柛鏇ㄥ墯婵挳鏌￠崶鏈电敖缂佸鍣ｉ弻鈩冩媴缁嬪尅鎷烽崸妤�绠板┑鐘插暙缁剁偞淇婇婊冨妺妞ゆ梹鎹囧铏规嫚閺屻儺锟芥绱掗悩鑼х�规洘娲熼弻鍡楊吋閸涱垳鏋冮梺鐟板悑閻ｎ亪宕濆澶婄；濠㈣埖鍔栭埛鎴炪亜閹虹偞瀚圭紓浣割槺閺佸宕哄☉銏犵闁挎梻鏅崣鍡涙⒑缂佹ɑ绀�闁稿﹤婀遍敓鑺ョ啲閹凤拷? by changhao
					{
						Long teamid = xtable.Roleid2teamid.select(teammatch.getRoleid());
						if (teamid != null && teamid > startteamid) //濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏焺閺佸銇勯幘璺烘瀾闁告瑥绻橀幃妤�鈽夊▎娆庣返濠电偛鐗呯划娆撳蓟濞戞ǚ鏀介柛鏇ㄥ亜婵洖顪冮妶搴′簼婵炶尙鍠栧濠氭偄閻氬瓨瀚归柣銏☆問閻掓儳霉閻欏懐鐣甸柡灞剧☉閳诲氦绠涢弴鐙�鍟嬮梻浣筋嚃閸犳銆冩繝鍥ф瀬闁归偊鍘介崕鐔哥節闂堟稓澧㈡繛澶庢硶缁辨捇宕掑▎鎰偘濡炪倖娲樼划鎾荤嵁韫囨稒鏅搁柨鐕傛嫹 by changhao
						{
							Team team = new Team(teamid, true);
							
							if (!checkTeamFull(team.getTeamInfo())) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱婢ь垶鏌嶇紒妯荤闁哄矉缍侀獮姗�宕￠悙鎻捫曢梻浣告惈閼活垳绮旂憴鍕箚闁绘垼妫勬儫闂侀潧锛忛崟闈涙畱闂傚倸鍊风粈渚�骞楀鍫濋棷闁挎洖鍊哥粻顖炴煥閻曞倹瀚� by changhao
							{
								continue;
							}
							
							if (!checkLevel(teammatch, level)) //缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弬鍨挃闁活厽鐟╅弻鐔封枎闄囬褍煤閿曪拷椤洩绠涘☉鎺炴嫹閿曞倸绠ｉ柣鎴濇閺咁剟姊婚崒娆戝妽闁诡喖鐖煎畷鏇㈩敍閻愯尙顦柟鍏肩暘閸斿矂鎮″┑瀣厸闁告劑鍔屾禍浼存煙妞嬪骸鍘撮柣娑卞櫍瀹曞綊顢欓悡搴經濠电姷鏁搁崑鐐差焽濞嗘挸纾归柛顭戝枤閺嗭箓鏌￠崶鈺佹灁缂佲槄鎷烽梻浣规偠閸庮垶宕濇惔銊ュ偍闂侇剙绉甸埛鎴︽偣閹帒濡兼繛鍛姍閺岀喖宕欓妶鍡楊伓? by changhao
							{
								continue;								
							}
									
							if (curnum >= num || curnum >= TeamManager.MAX_MATCH_LIST_COUNT) //闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾叉閻掑﹪鏌曟繛鐐珔缂佺媭鍨堕弻銊╂偆閸屾稑顏�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿顦甸弻鏇＄疀鐎ｎ亷鎷烽弴鐘电焼閻庯綆鍋佹禍婊堟煙閸濆嫮肖閻犳劒鍗抽弻娑㈡偆閸屾稑顏堕梻鍌氬�搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴姘舵濞存粌缍婇弻娑㈠箛閸忓摜鍑归悗瑙勬礀瀵埖绌辨繝鍥舵晬婵炲棙甯╅崝鍛存⒑鐠囧弶鍞夐柛鈺傜墱閹广垹鈽夊鍡楁櫊濡炪倖妫佸畷鐢告儎鎼达絿纾藉〒姘攻鐎氬綊姊虹捄銊ユ珢闁瑰嚖鎷�? by changhao
							{
								break;
							}
														
							fire.pb.team.TeamInfoBasicWithMembers t = new fire.pb.team.TeamInfoBasicWithMembers();
							t.teaminfobasic = newTeamInfoBasic(teamid, teammatch, team.getTeamInfo());
							
							boolean ok = team.getTeamInfo().getApplierids().containsKey(roleid);
							if (ok == true)
							{
								t.status = 1;
							}
						
							t.memberlist.add(team.getTeamMemeberSimple(team.getTeamInfo().getTeamleaderid()));
							
							for (xbean.TeamMember e1 : team.getTeamInfo().getMembers())
							{
								t.memberlist.add(team.getTeamMemeberSimple(e1.getRoleid()));								
							}
							
							msg.teamlist.add(t);
							
							curnum ++;
						}
					}
				}
			/*	
				if (!msg.teamlist.isEmpty())
				{
					tmp = msg.teamlist.get(0);
				}
				
				if (tmp != null)
				for (int i = curnum; i < num ; i ++)
				{
					fire.pb.team.TeamInfoBasic tmp1 = new fire.pb.team.TeamInfoBasic();
					tmp1 = tmp;
					tmp1.teamid = tmp.teamid ++;
					msg.teamlist.add(tmp1);
				}
			*/
				msg.targetid = targetid;
				msg.ret = 0;
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);				
				
				return true;
			}		
		};
		requestteammatchlist.submit();			
	}
	
	public static fire.pb.team.TeamInfoBasic tmp;
	
	public boolean checkLevel(xbean.TeamMatch teammatch, int level)
	{		
		if (level >= teammatch.getLevelmin() && level <= teammatch.getLevelmax())
		{
			return true;
		}
		
		return false;
	}
	
	public boolean checkTeamFull(xbean.TeamInfo teaminfo)
	{
		if (teaminfo.getMembers().size() >= TeamManager.MAX_MEMBER_COUNT)
		{
			return false;
		}
		
		return true;
	}
	
	/**
	 * 闂傚倸鍊搁崐鎼佸磹閹间讲锟斤箓顢楅崟顐わ紱闂佸憡娲﹂崐瀣洪鍕幯冾熆鐠虹尨鍔熼柣銈呮搐閳规垿顢欑粵瀣吅闂佺懓鍢查崲鏌ュ煘閹达附鏅柛鏇炵仛椤ユ挾绱撴担鍝勑ｇ紒瀣灴閸┿儲寰勬繛銏㈠枔閹风娀鎳犻鎯т哗闂傚倸鍊搁崐鐑芥倿閿曞倸绀堟慨妯挎硾缁愭淇婇妶鍕妽闁告瑥绻橀弻锝夊Ω閵堝棔绱攅dure闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴姘舵濞存粌缍婇弻娑㈠箛闂堟稒鐏堥柣搴㈣壘椤︿即濡甸崟顖氱鐎广儱娲ゆ俊钘夆攽閻愬弶鍣藉┑鐑囨嫹闂佸搫鐭夌紞渚�寮幇鏉垮窛妞ゆ棁濮ょ�氭娊姊绘担渚劸妞ゆ垶鍨块獮蹇涙晸閿燂拷? 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囨繝寰锋澘锟芥洟宕导瀛樺剹婵炲棙鎸婚悡娆撴倵閻㈡鐒鹃崯鍝ョ磼閹冪稏缂侇喗鐟╁濠氭偄閻撳海鐣鹃悷婊勭矒瀹曠敻鎮㈤崗鑲╁帗婵炴潙鍚嬮悷锔撅拷姘炬嫹?濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨偓鎷锋繝姘ワ拷鍛村矗婢跺牅绨婚棅顐㈡处閹告悂鎮电�ｎ喗鐓ユ繝闈涙－濡插綊鏌￠崨顔剧煉闁哄矉绠戣灒濞撴凹鍨遍埢鎾绘⒑閹肩偛锟芥垿宕愬┑瀣畺婵°倕鎳愬畵渚�鏌涢…鎴濇灈濠殿喖楠搁埞鎴︽倷妫版繂娈濈紓浣哄У閹瑰洭鐛崘鈹垮亝闁告劏鏅濋崝鍫曟倵楠炲灝鍔氭俊顐ｇ洴瀹曘垽鏌嗗鍡忔嫼闂佸憡鍔曞鍫曞箚閸儲鐓曢柣鏇氱娴滄壆锟借娲樼换鍕晸閺傘倗绉甸柛瀣瀵囨晸娴犲鈷戦悹鎭掑妼閺嬪秶绱掗鐣屾噰妤犵偛鍟抽ˇ鍦拷瑙勬礀閵堟悂宕哄Δ鍛厸闁稿本绋掑▓濂告⒒閸屾艾锟界兘鎮為敃鍌氬嚑濠靛倻顭堥悿鐐箾閹存瑥鐏╅柣銈庡櫍閺屽秹宕崟顐ｆ濡炪値鍋呭ú鐔煎蓟閵娾晜鍋嗛柛灞剧☉椤忥拷 by changhao
	 * leaderid 闂傚倸鍊搁崐鎼佸磹閹间讲锟斤箓顢楅崟顐わ紱闂佸憡娲﹂崐瀣洪鍕幯冾熆鐠虹尨鍔熼柣銈呮搐閳规垿顢欑粵瀣吅闂佺懓鍢查崲鏌ュ煘閹达附鏅柛鏇炵仛椤ユ挾绱撴担鍝勑ｇ紒瀣灴閸┿儲寰勬繛銏㈠枛瀹曨偊宕熼锟介惃銊︾節绾板纾块柛瀣灴瀹曟劙寮介鐔蜂罕濠电姴锕ら悧鍡欏婵犳碍鐓熼柟浼村亰閺夋椽鏌℃径灞藉妺缂佺粯绻堥幃浠嬫濞戞鎹曟俊鐐�栧ú锕傚矗閸愩劎鏆﹂柕蹇ョ秵濡插墽绱撴笟鍥ф灍婵﹤顭烽獮鎴﹀礋椤撶喎浠掗梺鏂ユ櫅閸熺増绂嶉弽顓熲拻濞达絼璀﹂弨浼存煙濞茶閭慨濠佺矙瀹曠喖顢涘鍗炲箞闂備胶鎳撴晶鐣屽垝椤栫偞鍋傞柣鏂垮悑閻撴盯鏌涚仦鐐殤濞寸姰鍨介弻鐔碱敊閽樺浠搁梺閫涚┒閸旀垿寮幇顖滅杸闁哄倹顑欐导锟� by changhao
	 */		
	public TeamInfoBasic newTeamInfoBasic(long teamid, xbean.TeamMatch teammatch, xbean.TeamInfo teaminfo)
	{	
		xbean.Properties leaderprop = xtable.Properties.select(teaminfo.getTeamleaderid());
		TeamInfoBasic teamInfoBasic = new TeamInfoBasic();
		teamInfoBasic.leaderid = teaminfo.getTeamleaderid();
		teamInfoBasic.leaderlevel = leaderprop.getLevel();
		teamInfoBasic.leadername = leaderprop.getRolename();
		teamInfoBasic.leaderschool = leaderprop.getSchool();
		teamInfoBasic.minlevel = teammatch.getLevelmin();
		teamInfoBasic.maxlevel = teammatch.getLevelmax();
		teamInfoBasic.membernum = teaminfo.getMembers().size() + 1;
		teamInfoBasic.teamid = teamid;
		teamInfoBasic.membermaxnum = TeamManager.MAX_MEMBER_COUNT + 1; //闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾绾惧鏌ｉ幇顔芥毄闁活厽鐟╅悡顐﹀炊閵娧�妲堢紓渚婃嫹濠㈣埖鍔楅崣鎾绘煕閵夛絽濡界紒锟介崘顏庢嫹鐟欏嫭绀冮柣鎿勭節瀵鏁撻悩鑼�為梺瀹犳〃濡炴帒效濡ゅ懏鈷戦柛婵嗗閻掕法绱掗悩铏磳鐎殿喛顕ч鍏煎緞婵犲嫬骞愬┑鐐舵彧缁蹭粙骞夐垾鏂ユ灁闁肩⒈鍓涚壕钘壝归敐鍛儓閺嶏繝鏌ｉ姀鈺佺伈缂佺粯绻堥悰顕�宕橀钘夛拷濠氭煢濡警妲哥�规挸妫楅埞鎴︻敊閺傘倛锟借法鐥鐙�鐒鹃崡杈ㄣ亜閺傝法姣為柡锟芥禒瀣厽婵炲棗绻戦崳娲倵濮樿鲸鍤�妞ゎ亜鍟存俊鍫曞川椤栨粠鍞舵繝纰樻閸嬪懘鎮烽埡浣烘殾闁瑰瓨绻嶅銊╂煥閻斿墎鐭欑�殿喖顭峰鎾偄閾忚鍟庨梻浣虹帛閸旓箓宕滃鑸靛仧闁哄倸绨遍弨浠嬫煟閹邦剙绾ч悗姘噽缁辨帞绱掑Ο鑲╃杽閻庢鍠涢褔鍩ユ径鎰潊闁斥晛鍟鐔兼⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�? by changhao 
		teamInfoBasic.targetid = teammatch.getTargetid();
		
		return teamInfoBasic;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794509;

	public int getType() {
		return 794509;
	}

	public int targetid; // 目标ID by changhao
	public long startteamid; // 起始队伍ID （0的话就从头取）by changhao
	public int num; // 取起始队伍id后面的num个数据  by changhao

	public CRequestTeamMatchList() {
	}

	public CRequestTeamMatchList(int _targetid_, long _startteamid_, int _num_) {
		this.targetid = _targetid_;
		this.startteamid = _startteamid_;
		this.num = _num_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(targetid);
		_os_.marshal(startteamid);
		_os_.marshal(num);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		targetid = _os_.unmarshal_int();
		startteamid = _os_.unmarshal_long();
		num = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestTeamMatchList) {
			CRequestTeamMatchList _o_ = (CRequestTeamMatchList)_o1_;
			if (targetid != _o_.targetid) return false;
			if (startteamid != _o_.startteamid) return false;
			if (num != _o_.num) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += targetid;
		_h_ += (int)startteamid;
		_h_ += num;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(targetid).append(",");
		_sb_.append(startteamid).append(",");
		_sb_.append(num).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestTeamMatchList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = targetid - _o_.targetid;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(startteamid - _o_.startteamid);
		if (0 != _c_) return _c_;
		_c_ = num - _o_.num;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

