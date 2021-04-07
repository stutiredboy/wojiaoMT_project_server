
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestClanFightTeamList__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜堕弫鍥煏韫囨洖啸闁告繃顨婂缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閺囥垹绠ｆ繝銏＄箓缂嶅﹤鐣峰Δ鍛闁兼祴鏅濋埢蹇曠磽閸屾瑧绛忛柟椋庡厴閺屾稓浠﹂崜褉妫ㄦ繛瀛樼矋缁捇寮婚悢鍛婄秶闁告挆鍚锋垹绱掔紒銏犲箹濠⒀冩捣濡叉劙骞掑Δ锟界粻娑欍亜閹炬瀚弶褰掓⒒娴ｅ憡鎯堥柣顒�銈稿畷浼村箻缂佹ɑ娅㈤梺鍏间航閸庢娊鍩︽笟锟介弻宥囩箔閸濆嫸鎷峰┑瀣拷渚�寮崼婵嗙獩濡炪倖姊婚崢褎瀵兼惔銊︹拻濠电姴楠告禍婊勭箾鐠囇冾洭缂侇喗鐟╅獮鎺懳旈敓浠嬫偂閺囥垺鐓欓柛鎾楀懎绗￠梺缁樻尵閸犳牠寮婚敓鐘茬＜婵ê褰夐搹搴☆渻閵堝繒鍒扮痪缁㈠幘濡叉劙骞掑Δ浣规闂佸吋浜介崕宕囧姬閿熶粙姊虹粙娆惧剰闁哥喎娼￠弻濠囨晲閸涱垱娈鹃梺鍓插亝濞叉﹢寮查弻銉︾厱婵炴垵宕獮鎰版煙閺嬵偄锟芥洟鍩為幋锔藉�风�瑰壊鍠栧▓鍫曟⒑闂堟稒顥滄い鎴濐樀閻涱喛绠涘☉娆愭闂佽法鍣﹂幏锟� by changhao
 *
 */
public class CRequestClanFightTeamList extends __CRequestClanFightTeamList__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
		{
			return;
		}
		
		mkdb.Procedure r = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				if (num > 20)
				{
					return false;
				}
				
				int side = 0;
				Long c1 = xtable.Roleid2clanfightid.select(roleid); //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佲枙闁绘帟濮ょ换娑㈠幢濡粯鍎庨梺杞扮鐎氫即寮诲☉銏犵労闁告劧缂氱花鐢告⒑閹稿海绠撴い锔诲灣缁鎮烽幊濠傜秺閺佹劙宕卞▎鎰晸闁荤偞纰嶇换鍫濐潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙瀵搞偞闁哄懐濞�閻涱喛绠涘☉娆戝弳闁诲函缍嗛崜娑㈡儊閸儲鈷戦悹鎭掑妼閺嬪秶绱掗鐣屾噰闁靛棔绶氬顕�宕煎┑瀣暪婵犵數濞�濞佳囨偋濠婂牆瑙﹂柛娑卞枤缁★拷缂佸墽澧楄摫妞ゎ偄锕弻娑㈠Ω閿曪拷閳绘洜锟借娲樺ú鐔镐繆閸洖鐐婃い蹇撳珔閳ユ枼鏀芥い鏃�鏋绘笟娑㈡煕韫囨枂顏勫祫闂佸壊鍋侀崕鏌ユ偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷? by changhao
				if (c1 == null)
				{
					return false;
				}
			
				fire.pb.clan.fight.ClanFightBattleField bf = fire.pb.clan.fight.ClanFightFactory.getClanFightBattleField(c1, true);
				if (bf != null)
				{
					Long clanid = xtable.Roleidclan.select(roleid);
					if (clanid == null)
					{
						return false;
					}
					
					if (clanid == bf.getClanfightBean().getClanid1())
					{
						side = 0;
					}
					else if (clanid == bf.getClanfightBean().getClanid2())
					{
						side = 1;
					}
					else
					{
						return false;
					}
					
					SRequestClanFightTeamList msg = new SRequestClanFightTeamList();
					java.util.Map<Long, Integer> v = bf.getClanroleidsByWhich(side);
					java.util.List<Long> teamlist = new java.util.ArrayList<Long>();
					
					if (v != null)
					{
						for (Long e : v.keySet())
						{
							Long teamid = xtable.Roleid2teamid.select(e);
							if (teamid != null)
							{
								teamlist.add(teamid);
							}
						}
						
						teamlist.sort(new java.util.Comparator<Long>(){
							@Override
							public int compare(Long o1, Long o2)
							{
								if (o1 > o2)
								{
									return 1;
								}
								else
								{
									return -1;
								}
							}
						});						
						
						int curnum = 0;
						java.util.Set<Long> teamidset = new java.util.HashSet<Long>();
						for (Long teamid : teamlist)
						{	
							if (teamid != null)
							{
								if (start != 0 && teamid <= start)
								{
									continue;
								}
								
								xbean.TeamInfo teaminfo = xtable.Team.select(teamid);
								if (teaminfo != null && !teamidset.contains(teamid)) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶅澶嬬厱闁靛牆妫欑粈鍫ユ煙閸欏鍊愮�殿噮鍣ｅ畷鐓庘攽閸垺姣庨梻鍌欑閹诧繝宕濋敃鍌氱獥闁哄稁鍋嗛惌鍡涙倵閿濆骸浜栧ù婊勭矒閺岀喖鎼归悷棰佹勃闁诲孩姘ㄩ幊鎾烩�旈崘顔嘉ч柛鎰电厜閹风兘寮撮姀鐘电枃濠殿喗顨愰幏椋庯拷娈垮枦椤曆囧煡婢跺á鐔兼煥鐎ｎ剨鎷锋繝姘拺鐟滅増甯掓禍浼存煕閹惧鈾侀悗闈涖偢閺佹捇鏁撻敓锟�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁躲倝鏌涜椤ㄥ懘鎮块悙顑句簻闁规壋鏅涢敓鑺ヮ殕缁嬪顓兼径瀣幐閻庡箍鍎辨鎼佺嵁濡ゅ懏鐓熼柟鎯х摠缁�瀣煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�? by changhao
								{
									fire.pb.team.TeamInfoBasicWithMembers t = new fire.pb.team.TeamInfoBasicWithMembers();
									t.teaminfobasic = newTeamInfoBasic(teamid, teaminfo);
									msg.teamlist.add(t);
									
									t.memberlist.add(getTeamMemeberSimple(teaminfo.getTeamleaderid()));
									
									for (xbean.TeamMember e1 : teaminfo.getMembers())
									{
										t.memberlist.add(getTeamMemeberSimple(e1.getRoleid()));								
									}
									
									curnum ++;
									
									teamidset.add(teamid);
									if (curnum >= num)
									{
										break;
									}	
								}								
							}
						}						
					}
					
					msg.isfresh = isfresh;
					if (msg.teamlist.size() == 0)
					{
						msg.ret = -1;
					}
					
					mkdb.Procedure.psendWhileCommit(roleid, msg);
				}
				
				return true;
			}
		};
		
		r.submit();	
	}
	
	public TeamMemberSimple getTeamMemeberSimple(long memberRoleId) {

		TeamMemberSimple member = new TeamMemberSimple();
		member.roleid = memberRoleId;
		xbean.Properties newProperty = xtable.Properties.select(memberRoleId);
		if (newProperty != null) {
			member.level = newProperty.getLevel();
			member.rolename = newProperty.getRolename();
			member.school = newProperty.getSchool();
			member.shape = newProperty.getShape();
		}
		
		return member;
	}
	
	public TeamInfoBasic newTeamInfoBasic(long teamid, xbean.TeamInfo teaminfo)
	{	
		xbean.Properties leaderprop = xtable.Properties.select(teaminfo.getTeamleaderid());
		TeamInfoBasic teamInfoBasic = new TeamInfoBasic();
		teamInfoBasic.leaderid = teaminfo.getTeamleaderid();
		teamInfoBasic.leaderlevel = leaderprop.getLevel();
		teamInfoBasic.leadername = leaderprop.getRolename();
		teamInfoBasic.leaderschool = leaderprop.getSchool();
		teamInfoBasic.minlevel = 0;
		teamInfoBasic.maxlevel = 0;
		teamInfoBasic.membernum = teaminfo.getMembers().size() + 1;
		teamInfoBasic.teamid = teamid;
		teamInfoBasic.membermaxnum = TeamManager.MAX_MEMBER_COUNT + 1; //闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾绾惧鏌ｉ幇顔芥毄闁活厽鐟╅悡顐﹀炊閵娧�妲堢紓渚婃嫹濠㈣埖鍔楅崣鎾绘煕閵夛絽濡界紒锟介崘顏庢嫹鐟欏嫭绀冮柣鎿勭節瀵鏁撻悩鑼�為梺瀹犳〃濡炴帒效濡ゅ懏鈷戦柛婵嗗閻掕法绱掗悩铏磳鐎殿喛顕ч鍏煎緞婵犲嫬骞愬┑鐐舵彧缁蹭粙骞夐垾鏂ユ灁闁肩⒈鍓涚壕钘壝归敐鍛儓閺嶏繝鏌ｉ姀鈺佺伈缂佺粯绻堥悰顕�宕橀钘夛拷濠氭煢濡警妲哥�规挸妫楅埞鎴︻敊閺傘倛锟借法鐥鐙�鐒鹃崡杈ㄣ亜閺傝法姣為柡锟芥禒瀣厽婵炲棗绻戦崳娲倵濮樿鲸鍤�妞ゎ亜鍟存俊鍫曞川椤栨粠鍞舵繝纰樻閸嬪懘鎮烽埡浣烘殾闁瑰瓨绻嶅銊╂煥閻斿墎鐭欑�殿喖顭峰鎾偄閾忚鍟庨梻浣虹帛閸旓箓宕滃鑸靛仧闁哄倸绨遍弨浠嬫煟閹邦剙绾ч悗姘噽缁辨帞绱掑Ο鑲╃杽閻庢鍠涢褔鍩ユ径鎰潊闁斥晛鍟鐔兼⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�? by changhao 
		teamInfoBasic.targetid = 0;
		
		return teamInfoBasic;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794557;

	public int getType() {
		return 794557;
	}

	public int isfresh; // 客户端用 0刷新 1不刷新  by qyl
	public long start; // 起始teamid by changhao
	public int num; // 请求的数量 by changhao

	public CRequestClanFightTeamList() {
	}

	public CRequestClanFightTeamList(int _isfresh_, long _start_, int _num_) {
		this.isfresh = _isfresh_;
		this.start = _start_;
		this.num = _num_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(isfresh);
		_os_.marshal(start);
		_os_.marshal(num);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		isfresh = _os_.unmarshal_int();
		start = _os_.unmarshal_long();
		num = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestClanFightTeamList) {
			CRequestClanFightTeamList _o_ = (CRequestClanFightTeamList)_o1_;
			if (isfresh != _o_.isfresh) return false;
			if (start != _o_.start) return false;
			if (num != _o_.num) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += isfresh;
		_h_ += (int)start;
		_h_ += num;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(isfresh).append(",");
		_sb_.append(start).append(",");
		_sb_.append(num).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestClanFightTeamList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = isfresh - _o_.isfresh;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(start - _o_.start);
		if (0 != _c_) return _c_;
		_c_ = num - _o_.num;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

