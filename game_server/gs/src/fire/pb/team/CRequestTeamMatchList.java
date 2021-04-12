
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestTeamMatchList__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞稿墲瀵板嫮锟斤綆浜濋鍛攽閻愬弶鈻曞ù婊冪埣瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎲＄换鍐�冩繝鍌ゆ綎缂備焦顭囬悷褰掓煕閵夋垵鍠氬鑽ょ磽閸屾瑧顦︽い锕備憾瀵偆鎷犻懠顒佹闂佸搫娲㈤崹鍦不閿濆棛绡�闁靛骏绱曠粻鎾剁磽瀹ュ拑宸ラ柣锝呭槻铻栭柛娑卞幘椤ρ囨⒑閸忚偐銈撮柡鍛箞閸┿垼绠涢弴鐘碉紳闂佺鏈悷褏绮佃箛娑欑厵闁绘垹鐡斿Λ鎴︽煥閻旂儤娅曟繛鍛灲楠炲繘鎮滈懞銉у弳闂佺粯鏌ㄦ晶搴ㄦ儗濞嗘劦娈介柣鎰▕濡拷濡ょ姷鍋為悧妤呭箯閸涘瓨鍋″Λ棰佽兌缂嶅秹姊婚崒娆戭槮濠㈢懓锕畷鎴﹀川椤栨稑搴婇梺鍛婃处閸ㄩ亶宕戦敓鐘崇厪濠电偟鍋撳▍鍡涙煟閹捐泛鏋涢柡灞炬礉缁犳稒绻濋崘鈺冨絽闂備浇顕х换鍡涙晸閼恒儲鐏遍柡锟芥禒瀣厽闁归偊鍨奸崵瀣拷瑙勬偠閸庢煡濡甸崟顖ｆ晝闁靛繈鍨婚鍥煟閹惧崬锟芥牠濡甸崟顔剧杸闁圭偓娼欏▍锝夋⒑鐠恒劌鏋嶇紒顔界懇瀵劑鏌嗗鍛傦箓鏌涢弴銊ョ仩缂佺姵濞婇弻锝夊箛椤撶喓绋囧銈呯箰婢у海妲愰幘璇茬＜婵炲棙鍨归悺姗�姊鸿ぐ鎺濇闁稿繑锕㈠璇测槈閵忕姷鐤�闂傚倸鐗婄粙鎺楁倶瀹ュ鈷戠紓浣股戠亸顓犵磼缂佹﹫鑰跨�殿喛顕ч埥澶愬閻橀潧寮ㄩ梻浣虹《閸撴繈銆冮崨顖滀笉婵炲樊浜濋悡鐔煎箹濞ｎ剙鐏柛鐔哥叀閺岀喖宕欓妶鍡楊伓
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
				
				if (num <= 0) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊勭矊闇夐柡宥庡幗閻撳繐鈹戦悙鑼虎闁告柨鐡ㄧ换娑㈠箻閹颁胶鍚嬮梺鍝勭灱閸犳牠骞冨鍐炬建闁糕剝顭囬弳銉х磽娴ｉ缚妾搁柛娆忕箻楠炲繘鎮滈懞銉㈡嫽婵炶揪绲块悺鏂款焽閹扮増鐓曢幖杈剧到鐢爼鎽堕悙鐑樼厱闁哄洢鍔岄悘锟犳煃闁垮绗氶柕鍥у瀵粙濡歌閿熻姤甯炵槐鎺楁偐閹绘巻鎸冮梺璺ㄥ枔閺咁偊骞婇幘瀵哥彾濠电姴娲ょ粣妤呮煛閸モ晛鞋濠殿喖鍟块埞鎴﹀磼濮橆厼鏆堥梺缁樻尵閸犳牠寮婚悢鐓庣畾鐟滃秹鎳滆ぐ鎺撶厱闁哄喛鎷风紒顔兼捣濡叉劙骞掗弮鍌滐紲濠碘槅鍨伴崥瀣礆濞戙垺鍊甸悷娆忓缁�锟介悗瑙勬处閸撴繈鎮橀幒妤佺厸濠㈣泛鑻禒锔界節閵忊槄鑰跨�规洖缍婂顕�宕奸悢鍙夊濠电偠鎻紞锟芥い顐㈩樀瀹曟垿鎮╃紒妯煎幈婵犵數鍊崘鈺傛倷缂備胶濯崹鍫曞蓟閵娾晜鍋嗛柛灞剧☉椤忥拷 by changhao
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
					if (targetid == 0 || (teammatch.getTargetid() == targetid && teammatch.getMatchtype() == 1)) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囩叓閸ャ劍鐓ユい蹇氭硾閳规垿顢欓惌顐簻閻ｇ兘顢楅崟顐㈠亶闁诲海鏁诲濠氬箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︺儱鈹戦悪鍛闂備緡鍓欑粔瀵哥不閺屻儲鐓曢柡鍥ュ妼婢ь垰鈹戦娑欏唉闁哄矉绻濆畷鍫曞嫉閻㈠灚鏅肩紓鍌欑椤︿粙宕抽敐澶婅摕闁斥晛鍟刊瀵哥磼鐎ｎ亜鐨￠柟椋庡厴瀹曠螖閿熺晫绮婚弶搴撴斀闁绘ɑ褰冮弳娆戠磼閸撲礁浠﹀ǎ鍥э躬椤㈡稑顭ㄩ崘銊ヮ瀱婵＄偑鍊栧褰掑箲閸パ屾綎闁惧繗顫夌�氭岸鏌＄仦璇插姶闁跨喕濮ら〃鍫㈡閹烘鍋愰柤纰卞劮瑜忛敓鍊燁潐濞叉ê煤閻旂厧钃熼柛鈩冾殢閸氬鏌涘☉鍗炵仯闁哄鍟村娲偡閺夋寧鍊梺浼欑秵娴滎亜鐣峰┑鍡╁悑濠㈣泛锕﹂敍娑欑節閵忥絽鐓愰柛鏃�鐗犻崺娑㈠箣閻愵亙绨婚梺纭呮閸嬬偟锟芥艾婀辩槐鎾存媴閸撳弶楔闂佽桨绀侀…宄扮暦閸濆嫧妲堥柕蹇曞Х椤撴椽姊洪幐搴⑩拻闁哄拋鍋婂畷锝夊幢濞戞瑢鎷虹紓鍌欑劍钃辩紒锟介敓浠嬫⒑缁嬪尅宸ユ繝锟介柆宥嗘櫢闁兼亽鍎抽崯鏌ユ煙閸戙倖瀚�? by changhao
					{
						Long teamid = xtable.Roleid2teamid.select(teammatch.getRoleid());
						if (teamid != null && teamid > startteamid) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁惧墽绮换娑㈠箣濞嗗繒鍔撮梺杞扮椤戝棝濡甸崟顖氱閻犺櫣鍎ら悗楣冩⒑閸涘﹦鎳冪紒缁橈耿楠炲啫螖閿熶粙鍩ユ径濞炬瀻婵炲棗娴锋潻鏃�绻濋悽闈涗粶闁绘鎳愰崚鎺戔枎閹惧疇鎽曞┑鐐村灦鑿ら柡锟芥禒瀣厱闁哄洢鍔屾禍婊冣攽椤旇姤绀�妞ゎ亜鍟存俊鑸垫償閳ヨ尙鍑规繝鐢靛仩鐏忔瑩宕伴弽褜鍤曞┑鐘崇閸嬪嫰鏌ｅ顒傛憼閻庢艾缍婇弻锝夊閳藉棗鏅遍梺缁樺笚閸庢娊婀侀梺缁樼懃閹虫劙鎮鹃悽鍛婄厸閻忕偛澧介埥澶愭煃鐠囧弶鍞夌紒鐘崇洴瀵挳鎮敓浠嬪疮鐎ｎ喗鈷掑ù锝囩摂閸ゅ啴鏌涢悩鎰佹疁闁靛棗鍟换婵嬪炊瑜庨悗顒勬⒑瑜版帒浜伴柛妯圭矙瀹曟洟鎮㈤崫銉х槇闂傚倸鐗婄粙鎾存櫠閵忥紕绠惧璺哄绾墎绱掓潏銊﹀磳鐎规洘甯掗埢搴ㄥ箛椤斿搫浠掑┑锛勫亼閸婃牕煤濡厧鍨濋柟鎹愬吹瀹撲線鐓崶銊р檨闁哄懏鎮傞弻銊╂偆閸屾稑顏� by changhao
						{
							Team team = new Team(teamid, true);
							
							if (!checkTeamFull(team.getTeamInfo())) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顕�姊哄Ч鍥э拷銈夊窗閺嶎厽绠掗梻浣侯焾缁绘劙宕ョ�ｎ剛绀婇柟瀵稿Х绾惧ジ鏌熼柇锕�寮炬繛鍫燂耿閺屻劑鎮㈢紒姗嗘缂備胶濮寸粔鐟扮暦閺囥垹纭�闁诲繒绮浠嬪极閸愵喖纾奸柨鏂垮⒔閳笺倝姊绘担鍛婃儓婵炲眰鍨藉畷鐟懊洪鍛簵闂佺粯鏌ㄩ崥瀣偂濞嗘挻鈷戞い鎾卞妿閻ｅ崬顭胯閸ㄥ爼寮诲鍥╃＜婵☆垵宕甸ˇ浼存⒑閸濆嫮鐒跨紓宥勭窔閻涱喖顫滈敓钘夌暦閿熺姵鍊烽柟缁樺醇閺囥垺鈷掑ù锝呮啞閹牓鏌ゅú璇茬仯缂侇喗姊婚幉鎾礋椤忓棛鐣鹃梻浣虹帛閸ㄧ厧螞閸曨剙鍔旈梻鍌欑窔濞佳囨晬韫囨稑绀嬮梻鍫熺♁閻ｉ亶姊婚崒姘拷鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞顨呴…銊╁醇濠靛锛楅梻浣瑰濞叉牠宕愰崫銉т笉妞ゆ牜鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷� by changhao
							{
								continue;
							}
							
							if (!checkLevel(teammatch, level)) //缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵剟宕归瑙勫瘱闂備焦妞块崢浠嬫偡閳哄懎钃熼柣鏂跨殱閺嬪酣姊介崶顒夋晪鐟滃秶鍙呴梺鎸庢穿閹烽攱銇勯鐐寸┛缂佺姵绋戦埥澶愬箳閻愭潙顏堕梺鎸庢礀閸婂摜绮婚敐澶嬬厽闁瑰瓨绻冮ˉ婊堟煛閸滀礁澧存慨濠傤煼瀹曟帒鈻庨幋婵嗩瀴闂備浇顕栭崰鏍偉閻撳海鏆﹂柡鍥ュ焺閺佸秹鏌ｉ幇顖氱毢妞わ富鍣ｉ弻鐔煎礂閼测晜娈梺鍛婃煥閻倿骞冮垾鏂ユ斀閻庯綆鍋嗛崢鎼佹⒑閸涘﹤濮傞柛鏂挎湰缁傚秵瀵肩�涙鍘垫俊鐐差儏妤犳悂宕㈤幘顔界厽婵炴垵宕▍宥囷拷瑙勬礀缂嶅﹪銆佸▎鎾村亗閹兼惌鍠楃紞鎾寸節閻㈤潧啸闁轰焦鎮傚畷鎴︽倷瀹割喚鍔峰┑鐐叉閹稿摜澹曡ぐ鎺撶厱妞ゎ厽鍨甸弸銈夋煛閸☆厾鐣甸柡宀嬬節瀹曞爼鍩℃担鍦簴缂傚倷璁插Σ鍕箯閻戣姤鈷掑ù锝堫潐閸嬬娀鏌涙惔顔肩仸鐎规洘绻冮幆鏃堝Ω閵夈儱浜堕梻鍌欑贰閸撴瑧绮旈悽绋跨厱闁硅揪闄勯崑锝夋煙椤撶喎绗掑┑鈥冲悑缁绘盯宕ㄩ鐓庮潚闂佸搫鐬奸崰鏍х暦濞嗘挸围闁糕剝顨忔导锟�? by changhao
							{
								continue;								
							}
									
							if (curnum >= num || curnum >= TeamManager.MAX_MATCH_LIST_COUNT) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀崣澶樻▊闂佺粯甯掗敃顏堝蓟閺囩喓绠鹃柣鎰靛墯閻濇梻绱撴担鍝勵�岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉骞夐幖浣瑰亱闁割偅绻勯悷鏌ユ⒑缁嬫鍎忔い锔炬暬瀵寮撮敍鍕澑闁诲函缍嗘禍鐑藉箯閻戣棄鍗抽柣妯兼暩閻掑ジ鏌ｆ惔顖滅У闁稿鐒︾粋宥咁煥閸喓鍘甸梺鍛婄箓鐎氼喛鍊撮梺鑽ゅУ閸旀帡宕￠幎钘夎摕婵炴垯鍨洪崑鍡涙煕鐏炲墽鈽夋い蹇撶埣濮婂宕掑顒婃嫹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵潙顫濋懜娈匡拷鏍ㄧ箾鐎涙鐭婄紓宥咃躬瀵鈽夐姀鐘电杸闂佺绻愰幗婊堝礄瑜版帗鍊甸悷娆忓缁�锟介悗娈垮枦閸╂牜绮氭潏銊х瘈闁搞儴鍩栭弲顒�鈹戦悙鍙夘棡閻㈩垪鏅犲畷婵嬪川鐎涙ǚ鎷洪柣鐘叉搐瀵爼宕径鎰厱闁冲搫鍊绘晶閬嶆煙楠炲灝鐏╅柍钘夘槸椤粓宕卞Δ浣圭彋濠碉紕鍋戦崐鏍涙担鍝ユ殾闁汇垹鎲￠崕搴ㄥ箹鏉堝墽鎮肩痪鎹愭閵嗘帒顫濋濠冩暰闁诲孩鑹剧紞濠傤潖閾忚宕夐柕濞垮劜閻濄垽姊洪悷鏉挎闁瑰嚖鎷�? by changhao
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
	 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻纾嬵唹闁跨喐鏋荤粻鎾汇�佸Δ鍛妞ゆ劑鍊х槐閬嶆⒒娴ｅ憡鍟炴繛璇х畵瀹曟劗锟斤綆锟姐垺妞介、鏃堝礋楠烆垰鍠氶悢鍡涙偣閾忕懓鐨戦柛鏃傚枛閺岋綁濡堕崨顔芥倷闂佸疇顫夐崹鍧椼�佸▎鎴犻┏閻庯綆鍋掗崥鍛存⒒娴ｇ儤鍤�闁搞垺鐓″畷鏌ュ蓟閵夈儳鍘撮梺纭呮彧闂勫嫰寮查鍕厱闁哄洨鍋熸禒娑欍亜閵夛附灏电紒杈ㄦ尰閹峰懘宕崟鎴悼缁辨帞锟斤綆鍋勯悘鎾煕閳瑰灝鍔滅�垫澘瀚换娑㈠閵忕姵鐏侀梺褰掝棑婵烇拷闁瑰磭濞�椤㈡牠骞嗚閸濇姊婚崒姘拷鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷鍝ョ矆閸喐鍙忔俊顖涘绾墽绱掗幇顓ф畷濞ｅ洤锕俊鍫曞礋椤撶偛顬夐梻浣告啞閻熴儳鎹㈠锟藉濠氭晲婢跺á鈺呮煏閸繃顥欑紒杈ㄦ敤dure闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵潙顫濋懜娈匡拷鏍ㄧ箾鐎涙鐭婄紓宥咃躬瀵鈽夐姀鐘电杸闂傚倸鐗婄粙鎺楁倶閸儲鐓熼幖娣灱婢规ɑ銇勯敂鍨祮濠碉紕鏁诲畷鐔碱敍濮橀硸鍞洪柣搴＄畭閸庡崬煤閵堝棔绻嗛柦妯侯槴閺�浠嬫煟閹邦剙绾ч柛锝堟閳规垿鎮滈崶銊ヮ伓闂傚倷绀侀幖顐︽儗婢跺瞼绀婂〒姘炬嫹鐎殿噮鍋婇獮鍥级閸喚鐛╂俊鐐�栧Λ浣规叏閵堝浄鎷峰顓炩枙婵﹦绮幏鍛瑹椤栨粌濮兼俊鐐�栭崹鍫曞垂閸ф宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘? 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎处缁绘繂顕ラ柨瀣凡闁跨喕濮ゅú鐔风暦椤栨稑顕遍悗娑櫭崜鐟扳攽閻愬弶顥為柟绋款煼閹�斥枎閹炬潙锟界敻鏌ｉ姀鈽嗗晱闁绘帡绠栧畷顖炲传閵壯咃紲闂佽鍨庨崘顏嗏棨缂傚倷绶￠崰妤呮偡閳轰緡鍤曞┑鐘崇閸嬪嫰鏌ｉ幘铏崳闁伙綁绠栭幃宄邦煥閸曨厾鐓夐悗瑙勬礈閺佸骞冮姀銈呯闁兼祴鏅涚敮妤�鈹戦悙瀛樼稇闁告艾顑夐幃鐑芥晜閹惧懏瀚规慨妯煎亾鐎氾拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫孝缂傚秴锕璇差吋婢跺﹣绱堕梺鍛婃处閸嬫捇骞忛柨瀣瘈婵ǜ鍎婚幏鐑藉川閺夋垹鐓戞繝銏ｆ硾閻楀懐鑺辨繝姘棅妞ゆ劑鍨烘径鍕煙閸涘﹥鍊愰柟顔炬暩閿熸枻缍嗛崰妤呮偂閵夛妇绡�闂傚牊绋掗敍宥嗕繆閹绘帞绉洪柡宀嬬節瀹曘劑顢欓崜褏鍘滈梻浣告惈閻绮婚幋锝囦航濠电偞鎸婚崙褰掑垂闁秴鐓濋柟鍓х帛閳锋垿鏌熼懖鈺佷粶闁跨喕濮ら崹鍨暦閹邦兘鏀介悗锝庝簽閻ｅ搫鈹戞幊閸婃洟骞婇幇顒傛殼濞撴熬鎷烽柡灞剧洴閳ワ箓骞嬪┑鍥╀邯濠电姵顔栭崰鏍殽閹间礁鐓橀柟杈鹃檮閸婂嘲螞閻楀牏绠撴繛鍫熺箘缁辨挻鎷呴崫鍕戯綁鏌熼悷鐗堝枠闁绘侗鍣ｅ畷姗�鍩為崹顔荤凹闂備礁鎲￠崝蹇涘疾濠靛绀夐柛顐ｆ礃閸婂灚顨ラ悙鑼虎闁告梹纰嶆穱濠囶敃閿濆洦鍒涢悗瑙勬磸閸ㄤ粙寮婚崱妤婂悑闁糕�崇箲鐎氬ジ姊绘担鍛婂暈闁告梹娲栭锝夊醇閺囩偟鐣鹃梺鍓插亖閸庢煡鎮￠弴銏＄厽闁哄洦姘ㄩˇ锕�霉濠婂嫬顥嬮柨鐔凤拷鐕佹綈婵炲弶顭囬幑銏ゅ礋椤栨稒娅㈤梺鍝勫�堕崐妤冪矓閻㈠憡鐓曢悗锝庝簼椤ョ姷锟芥鍟崶銊︽婵炲濮撮鍡涘煕閹达附鍋ｉ柟顓熷笒婵″ジ鏌＄�ｎ亞肖缂佽鲸甯￠、娆撴偩鐏炴儳娅氭俊銈囧Х閸嬫盯宕幎鍓垮洭宕烽銊﹀閻熸瑥瀚粈锟介梺闈涚墛閹倸鐣烽崫鍕庢棃宕ㄩ鐘插箰闂備胶顭堥張顒傜矙閹烘垟鏋斿┑鍌氭啞閳锋帡鏌涚仦鎹愬闁跨喓鏅崗姗�骞冮悙鐑樻櫇闁稿本鑹鹃崵鎴炵節闂堟稑锟藉鈥﹂崼銉﹀仾闁绘劦鍓涚粻楣冩煙鐎涙鎳冮柣蹇婃櫊閺岋綁濡舵惔鈩冪彎闂佸搫鑻粔鐟扮暦椤愶箑绀嬫い鎰剁稻椤斿淇婇悙顏勶拷銈夊磻閸涱劶娲偄閻撳氦鎽曢梺闈浥堥弲婊堝磻閸℃稒鐓曢悘鐐插⒔閳藉銇勮箛銉﹀ by changhao
	 * leaderid 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻纾嬵唹闁跨喐鏋荤粻鎾汇�佸Δ鍛妞ゆ劑鍊х槐閬嶆⒒娴ｅ憡鍟炴繛璇х畵瀹曟劗锟斤綆锟姐垺妞介、鏃堝礋楠烆垰鍠氶悢鍡涙偣閾忕懓鐨戦柛鏃傚枛閺岋綁濡堕崨顔芥倷闂佸疇顫夐崹鍧椼�佸▎鎴犻┏閻庯綆鍋掗崥鍛存⒒娴ｇ儤鍤�闁搞垺鐓″畷鏌ュ蓟閵夈儳鍘撮梺纭呮彧闂勫嫰寮查鍕厱闁哄洨鍋熸禒娑欍亜閵夛附灏电紒杈ㄦ尰閹峰懘宕崟鎴悼缁辨帞锟斤綆鍋勯悘鎾煕閳瑰灝鍔滅�垫澘瀚换娑㈠閵忕姵鐏堥悗瑙勬处閸嬪﹤鐣烽悢纰辨晢闁跨喍绮欓幆鍐Ω閿斿墽鐦堢紒鐐緲椤﹁京澹曢崸妤佺厱閻庯綆鍋勯悘瀵革拷瑙勬礃閸旀瑥顕ｆ禒瀣垫晣闁绘棁娓圭純鏇熺節閻㈤潧孝闁挎洏鍊濋幃褔宕卞▎蹇ｆ婵犵數濮电喊宥夋偂閻斿吋鐓欏ù鍏兼綑娴滀即鏌℃径瀣仢闁哄备鍓濆鍕沪閽樺顬嗙紓鍌欒兌缁垳鎹㈤崼銉ョ畺濞寸姴顑嗛ˉ鍫熺箾閹寸儐娈橀柟瑙勬礃娣囧﹪鎮欓鍕舵嫹閺嶎灐娲晝閸屾氨鐓戦梺鍛婂姂閸斿酣寮抽敃鍌涚厪闊洢鍎崇粔鍨繆閹绘帒鈷旂紒杈ㄦ尰缁楃喖宕惰閻忓秴鈹戦纭峰伐妞ゎ厾鍏橀悰顕�骞嬮敃锟界粈瀣亜閹捐泛鏋庡ù鐘冲浮濮婃椽寮妷锔界彅闂佸摜鍠撴晶妤冪矉瀹ュ鍐�妞ゆ挾鍟块幏缁樼箾鏉堝墽瀵奸悹锟介敃鍌氱哗濞寸厧鐡ㄩ悡娆愮箾閼奸鍞洪梺顓у灡閹便劍绻濇担铏圭厯閻庤娲滈崰鏍�佸☉姗嗘僵闁告鍋涚粻鐐烘⒒閸屾瑨鍏岄柟铏尰閺呭爼鎮剧仦钘夌亰濡炪倖鐗滈崑鐐哄磻閸岀偞鐓熼柡鍌氱仢閹垿鏌ｉ幘瀵告创闁哄本绋撴禒锕傛倷椤掑倹顓诲┑鐐差嚟婵即宕规禒瀣摕闁绘梻鈷堥弫濠囨煢濡警妲哄ù鐘虫倐濮婃椽鏌呭☉姘ｆ晙闂佸憡姊归崹鍨嚕椤愶箑绠涙い鏍ㄧ矌閺夋悂姊洪崫鍕拷褰掝敄濞嗘劕顕遍柨鐕傛嫹 by changhao
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
		teamInfoBasic.membermaxnum = TeamManager.MAX_MEMBER_COUNT + 1; //闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х棯閹岀吋闁哄矉缍侀獮鍥敊閼恒儲鐦庨梻浣规た閸樹粙鎮烽埡鍛亗妞ゆ劧绠戦悙濠囨煏婵炑嶆嫹婵℃彃鐗忕槐鎾寸瑹婵犲啫顏跺┑鐘灱閸╂牠宕濆Δ鍛煑闁瑰墽绮悡鏇㈡煏婢舵稓鍒板┑锛勬櫕缁辨帡鏁撴禒瀣妞ゅ繐瀛╃�氬綊鎮峰▎蹇擃仾缂侊拷閸愵喗鐓熼柟鍨缁★拷閻庢鍠栭…鐑藉极閹剧粯鍋愰柤纰卞墮閿熺晫鍋ゅ铏癸拷鍦У閵嗗啯淇婇悙鏉戠瑨閺佸牊淇婇妶鍛櫤闁抽攱鍨块弻娑樷攽閸℃浼�闂佺粯甯熷▔鏇犳閹烘鍋愰柧蹇ｅ亜绾炬娊鎮楀▓鍨灕妞ゆ泦鍥舵晣闁稿繒鍘х欢鐐测攽閻樻彃顏╂鐐村姇閳规垿鎮欓懜闈涙锭缂備浇寮撶划娆撶嵁婢舵劕鐏抽柡鍌樺劜閻忎線姊洪懖鈹炬嫛闁告挻绋撴竟鏇㈡寠婢规繂缍婇弫鎰板川椤旇棄鍓甸梺鍝勭▌缁绘繈寮婚敐澶婎潊闁宠桨鑳舵导鍫㈢磽娴ｈ櫣甯涚紒璇茬墦閹即顢氶敓钘夌暦濮楋拷椤㈡瑩鎸婃径娑欏濠电姵纰嶉悡銏′繆椤栨瑨顒熸俊鎻掓憸閿熷�燁潐閹哥螞濡ゅ懎鐓橀柟杈惧瘜閺佸﹪鏌￠崒妯猴拷娑㈡晸閸婄喐纭堕柣銉邯椤㈡﹢鎮敓浠嬫倿妤ｅ啫纭�閺夊牄鍔婃禍婊堟煛閸屾繃纭舵慨锝囧仱閺岋繝鏁撻懞銉ь浄閻庯綆鍋嗛崢钘夆攽閻愬弶顥滅紒缁樺灴瀹曞啿煤椤忓懎锟藉灚鎱ㄥΟ鍧楀摵闁搞倧鎷锋俊鐐�ゆ禍婊堝疮鐎涙ü绻嗛柛顐ｆ礀瀹告繃銇勯弽銊х煠闁哥偠鍩栫换婵堝枈濡椿娼戦梺绋款儏閹虫﹢骞冮悜钘夌厸濞达絿鍎ゅ▓楣冩⒑閻熸壆鎽犵紒璇茬Т椤洭濡搁埡鍌滃弳闂佺粯鏌ㄦ晶搴ㄦ儗濞嗘埊鎷峰▓鍨灈妞ゎ厼鍢查锝夊箻椤旇棄浜滈梺鎯х箺椤曟牠宕惔銊︹拻濞达綀娅ｇ敮娑㈡煕閺冩挾鐣电�规洘绮岄～婵嬫嚋闂堟稐鎴烽梻浣告惈閸婂摜鑺遍柆宥呯哗濞寸姴顑嗛悡鐔兼煙闁箑澧紒鐙欏洦鍊垫慨姗嗗墯閸ｇ晫绱掓潏銊ョ缂佽鲸甯掕灒闁兼祴鏅濋弶浠嬫煟鎼淬埄鍟忛柛鐘崇洴椤㈡俺顦归柛鈹垮劜瀵板嫰骞囬澶嬬秱闂備焦鏋奸弲娑㈠疮椤栫儐鏁傞柣鏂垮悑閳锋帒霉閿濆牆袚缁绢厼鐖奸弻娑㈡晲韫囨洜鏆ゅΔ鐘靛仜缁绘﹢寮幘缁樻櫢闁跨噦鎷�? by changhao 
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

