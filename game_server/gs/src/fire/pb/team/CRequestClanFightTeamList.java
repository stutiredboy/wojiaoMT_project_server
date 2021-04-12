
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestClanFightTeamList__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞稿墲瀵板嫮锟斤綆浜濋鍛攽閻愬弶鈻曞ù婊冪埣瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎲＄换鍐�冩繝鍌ゆ綎缂備焦顭囬悷褰掓煕閵夋垵鍠氬鑽ょ磽閸屾瑧顦︽い锕備憾瀵偆鎷犻懠顒佹闂佸搫娲㈤崹鍦不閿濆棛绡�闁靛骏绱曠粻鎾剁磽瀹ュ拑宸ラ柣锝呭槻铻栭柛娑卞幘椤ρ囨⒑閸忚偐銈撮柡鍛箞閸┿垼绠涢弴鐘碉紳闂佺鏈悷褏绮佃箛娑欑厵濡炲楠搁崢鎾煛鐏炲墽銆掑ù鐙呯畵瀹曟粏顦俊顐犲妽缁绘稓锟芥稒顭囬惌瀣磼椤旇姤宕岀�殿喖顭烽幃銏ゅ川婵犲嫮肖闂備礁鎲￠幐鍡涘触闁垮鐏╃紒杈ㄥ笧缁辨帡濮�閻樿尙顔愬┑鐘媰閸愨晜宕冲┑鈥冲级閸旀瑩鐛幒鎳虫棃鏁撻悾宀�涓嶆繛鎴炵懀娴滄粓鏌熼悙顒夋當閻庢凹鍣ｅ鎯般亹閹烘挴鎷绘繛杈剧到閹诧繝骞嗛崼銉︾厽妞ゆ帪鎷烽柕鍫㈩焾閻ｉ攱瀵奸弶鎴狀啋缂傚倷鐒﹁摫婵炲懌鍨藉娲礂闂傜鍩呴梺绋垮婵炲﹪宕洪敂鐣岀懝闁跨喍绮欏璇差吋閸モ晝鐣堕梺鍛婄箓鐎氭悂骞忓畡鎵虫斀閻庯綆鐓夐幏閿嬬瑹閿熻棄顕ｉ锟藉畷鐓庘攽閸℃瑧宕哄┑锛勫亼閸婃牕顫忔繝姘偍鐟滃海锟介潧鍚嬮幆鏃堝Ω閿旇瀚藉┑鐘垫暩婵瓨顨ラ崨濠勵洸婵犲﹤瀚粻楣冩偣閸ュ洤鍠氬ú顓犵磽娓氬洤鏋熼柣鐔叉櫊閻涱噣骞掗幊铏閺佹挻绂掔�ｎ偄浜楅梺鍝勬储閸ㄦ椽鎮″▎鎾寸厱闁圭偓顨呴幊搴ｇ箔閿熺姵鈷戠紓浣股戠亸鐢告煕閻樺磭澧电�殿喖顭烽弫鎾绘偐閼碱剨绱叉繝娈垮枟閿氱憸鏉款樀閹艰鎯旈埥鍡樺瘜闂侀潧鐗嗙换鎺楀礆閹殿喚妫紓浣靛灩楠炴ɑ淇婇崣澶婂妤犵偞甯掕灃濞达綀顫夐鐔兼⒒娴ｇ鎮戝ù婊�绮欏畷鏇炵暦閸パ冃氶梺璺ㄥ枍缁瑥顫忛搹鍦煓婵炲棙鍎抽崜浼存⒑閸濄儱鏋庢繛纭风節瀵粯绻濋崶銊︽珳闂佸憡渚楅崹鍗炩枔妤ｅ啯鈷戦柛鎾村絻娴滄繃绻涢崣澶涜�跨�殿喗鐓″濠氬Ψ閿旀儳骞堟繝鐢靛仦閸ㄩ潧鐣烽鍕祦闁规壆澧楅悡娆撴煛鐎ｉ潧浜滈柨鐔诲Г濞茬喖宕洪悙鍝勭闁挎棁妫勯敓浠嬵棑閿熺晫鎳撴竟濠囧窗閺嵮�鏋旈柛顐ｆ礃閳锋垿姊婚崼鐔衡檨妞ゃ儲绮嶉妵鍕箣濠垫劖鈻堥梺缁樹緱閸犳稓绮诲☉妯锋婵炲棙鍔栭鐔兼⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟� by changhao
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
				Long c1 = xtable.Roleid2clanfightid.select(roleid); //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋婵愭綗闁跨喕妫勯崐鍧楀箰婵犲啰鐝堕柍鍝勵儑缁夘喚锟借娲滈崰鏍�佸☉姗嗘僵濡插本鐗曢弫鎼佹⒒閸屾瑦绁版繛澶嬫礋瀹曟娊鏁冮崒姘鳖唵闂佽法鍣﹂幏锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊璁查弸娆撴⒑缂佹ê绗╁┑顔哄�楅幑銏犫槈閵忕姴鑰垮┑鈽嗗灣缁垶宕曟惔銊︹拺閺夌偞澹嗛ˇ锕傛倵濮橆偄宓嗙�殿喛顕ч埥澶愬閻橀潧濮堕梻浣告啞閸斞呯磽濮樿精濮抽柣銏犳啞閳锋垿鏌熺粙鎸庢崳缂佺姵鎸婚妵鍕晜鐠囪尙浠紓渚囧枛椤兘骞冮悜钘夌疇濠电姴鍊荤粔娲煛娴ｇ懓濮嶇�规洖宕埢搴ㄥ箛椤撶偞娅㈤梻浣藉吹閸嬬偟鍠婂鍥ㄥ床闁割偅绻嶅鏍磽娴ｈ偂鎴炲垔閹绢喗鐓熼柣鏃傚帶娴滀即鏌涢妶鍜佸剰闁宠鍨块幃娆戯拷鍨偠閸嬬偤姊洪崫鍕櫧濠电儑鎷烽梺缁樹緱閸犳稓绮诲☉妯锋婵炲棙鍨靛鎶芥⒑鐠囨彃鍤辩紓宥呮瀹曟粌鈽夐姀鈥冲墾闂佸壊鍋侀崕鏌ュ煕閹达附鍋ｉ柟顓熷笒婵″ジ鏌＄�ｎ亞肖缂佽鲸甯￠、娆撴偩鐏炴儳娅氶梻渚�娼уΛ鏃傛濮橆剦鍤曟い鏇嫹鐎规洜鍘ч埞鎴狅拷锝庝簼閺嗩亜鈹戦悩鍨毄濠电儑鎷峰┑鐐板尃閸ャ劌浜卞┑鐘诧工閻楀棛鎲撮敃鍌涚厱婵炴垵宕弸銈囩磼閳藉懏瀚圭紓鍌欑婢ц姤鏅跺Δ鍕噷婵＄偑鍊ら崑鍕晝椤忓牆钃熸繛鎴欏灩鎯熼梺鎸庢穿閹风兘鏌嶇紒妯荤闁跨喎锟界噥娼愭繛鍙壝叅闁绘棃鏅茬换鍡涙煕椤愶絾绀�闁绘劕锕ラ妵鍕疀閹惧磭褰呴梺鐐藉劜閺嬪ジ寮ㄩ懞銉ｄ簻闁哄喛鎷烽柡瀣帛缁楃喎鈽夐姀锛勫幈闂婎偄娲﹂弸鍌烆敂閸曨偆銈梻鍌欑婢瑰﹪宕戞笟锟藉畷鏇㈠蓟閵夛箑浜楅梺闈涱槴閺呮粓鎮￠悢鍏肩厸闁搞儮鏅涙禒婊堟煥閻旂粯顥夋繝锟介柆宥嗘櫢闁兼亽鍎抽崯鏌ユ煙閸戙倖瀚�? by changhao
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
								if (teaminfo != null && !teamidset.contains(teamid)) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸缂備礁顑嗙敮锟犲极瀹ュ拋鍚嬪璺侯儑閸橀亶姊洪棃娑氬婵☆偅鐟х划鍫ュ醇閵夛妇鍘甸梺鍛婄懃椤︿即宕愰幇顕嗘嫹濞堝灝娅橀柛锝忕到閻ｇ兘鎮℃惔妯绘杸闂佸壊鍋侀崹鍝勑掓惔銊︹拻闁稿本鐟чˇ锕傛煙鐠囇呯瘈鐎规洘绻堥弫鍐磼濮樿京宕堕梻浣告惈缁嬩線宕戦崱娑欏剹闁糕剝绋掗崐鐢告煥濠靛棝顎楀ù婊勭墪闇夋繝濠傚閻帡鏌″畝锟介崰鏍箹瑜版帗鍋″Λ棰佺劍閸曞啴姊虹拠鎻掝劉婵ǜ鍔戦獮濠囧箻閻戔晪鎷烽弮鍫濈妞ゆ柨妲堣閺屾盯骞囬悽闈涘辅闂佸綊顥撻崗妯侯嚕閹绢喖顫呴柣妯兼暩閺嬪啯绻濆▓鍨灍妞ゃ劍鍔欓獮蹇旑槹鎼搭垱瀚规繛鍫濈仢閺嬶附銇勯弴鍡楁搐閻撯�愁熆鐠哄ソ锟犳偄閸忚偐鍙嗛柣搴秵閸撱劑骞忛柨瀣瘈婵﹩鍘搁幏娲偡濠婂懎顣奸悽顖涘笚缁傚秵瀵肩�涙鍘遍梺瑙勫劤椤曨參鍩︽笟锟介幃妤呮濞戞牕浠梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫炵紓浣界堪閸婃繈寮诲☉婊庢Ъ濡炪們鍔岄幊姗�骞冮崸妤佸�锋い鎴濆綖缁ㄥ姊虹憴鍕棎闁哄懏鐩弫鎾绘嚍閵夘喗鐣风紓浣割儏椤︻垶顢橀崗鐓庣窞閻庯綆鍓欓獮鎰版煟鎼达紕鐣柛搴ら哺椤ㄣ儵骞栨担鍝勭ウ濠德板�曢幊蹇涙偂閻斿吋鐓欓柟顖嗗懏鎲肩紓渚婃嫹閻庯綆鍠楅悡娑㈡倶閻愰鍤欏┑顔煎�块弻鐔碱敊閸濆嫸鎷峰┑鍡欐殾闁圭儤鍨熷Σ鍫熸叏濡わ拷濡梻妲愰敓锟�? by changhao
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
		teamInfoBasic.membermaxnum = TeamManager.MAX_MEMBER_COUNT + 1; //闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х棯閹岀吋闁哄矉缍侀獮鍥敊閼恒儲鐦庨梻浣规た閸樹粙鎮烽埡鍛亗妞ゆ劧绠戦悙濠囨煏婵炑嶆嫹婵℃彃鐗忕槐鎾寸瑹婵犲啫顏跺┑鐘灱閸╂牠宕濆Δ鍛煑闁瑰墽绮悡鏇㈡煏婢舵稓鍒板┑锛勬櫕缁辨帡鏁撴禒瀣妞ゅ繐瀛╃�氬綊鎮峰▎蹇擃仾缂侊拷閸愵喗鐓熼柟鍨缁★拷閻庢鍠栭…鐑藉极閹剧粯鍋愰柤纰卞墮閿熺晫鍋ゅ铏癸拷鍦У閵嗗啯淇婇悙鏉戠瑨閺佸牊淇婇妶鍛櫤闁抽攱鍨块弻娑樷攽閸℃浼�闂佺粯甯熷▔鏇犳閹烘鍋愰柧蹇ｅ亜绾炬娊鎮楀▓鍨灕妞ゆ泦鍥舵晣闁稿繒鍘х欢鐐测攽閻樻彃顏╂鐐村姇閳规垿鎮欓懜闈涙锭缂備浇寮撶划娆撶嵁婢舵劕鐏抽柡鍌樺劜閻忎線姊洪懖鈹炬嫛闁告挻绋撴竟鏇㈡寠婢规繂缍婇弫鎰板川椤旇棄鍓甸梺鍝勭▌缁绘繈寮婚敐澶婎潊闁宠桨鑳舵导鍫㈢磽娴ｈ櫣甯涚紒璇茬墦閹即顢氶敓钘夌暦濮楋拷椤㈡瑩鎸婃径娑欏濠电姵纰嶉悡銏′繆椤栨瑨顒熸俊鎻掓憸閿熷�燁潐閹哥螞濡ゅ懎鐓橀柟杈惧瘜閺佸﹪鏌￠崒妯猴拷娑㈡晸閸婄喐纭堕柣銉邯椤㈡﹢鎮敓浠嬫倿妤ｅ啫纭�閺夊牄鍔婃禍婊堟煛閸屾繃纭舵慨锝囧仱閺岋繝鏁撻懞銉ь浄閻庯綆鍋嗛崢钘夆攽閻愬弶顥滅紒缁樺灴瀹曞啿煤椤忓懎锟藉灚鎱ㄥΟ鍧楀摵闁搞倧鎷锋俊鐐�ゆ禍婊堝疮鐎涙ü绻嗛柛顐ｆ礀瀹告繃銇勯弽銊х煠闁哥偠鍩栫换婵堝枈濡椿娼戦梺绋款儏閹虫﹢骞冮悜钘夌厸濞达絿鍎ゅ▓楣冩⒑閻熸壆鎽犵紒璇茬Т椤洭濡搁埡鍌滃弳闂佺粯鏌ㄦ晶搴ㄦ儗濞嗘埊鎷峰▓鍨灈妞ゎ厼鍢查锝夊箻椤旇棄浜滈梺鎯х箺椤曟牠宕惔銊︹拻濞达綀娅ｇ敮娑㈡煕閺冩挾鐣电�规洘绮岄～婵嬫嚋闂堟稐鎴烽梻浣告惈閸婂摜鑺遍柆宥呯哗濞寸姴顑嗛悡鐔兼煙闁箑澧紒鐙欏洦鍊垫慨姗嗗墯閸ｇ晫绱掓潏銊ョ缂佽鲸甯掕灒闁兼祴鏅濋弶浠嬫煟鎼淬埄鍟忛柛鐘崇洴椤㈡俺顦归柛鈹垮劜瀵板嫰骞囬澶嬬秱闂備焦鏋奸弲娑㈠疮椤栫儐鏁傞柣鏂垮悑閳锋帒霉閿濆牆袚缁绢厼鐖奸弻娑㈡晲韫囨洜鏆ゅΔ鐘靛仜缁绘﹢寮幘缁樻櫢闁跨噦鎷�? by changhao 
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

