package fire.pb.team;

import fire.pb.PropRole;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAbsentReturnTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}
//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠煑閼恒儳鈽夐摶鏍煕濞戝崬骞橀柨娑欑懄缁绘繈鎮介棃娴讹綁鏌涢埡浣告殻闁轰焦鎹囬幊鐐哄Ψ瑜嶉埛宀勬倵鐟欏嫭绀�闁绘牕銈搁妴浣肝旈崨顔芥闂佷紮绲介惉鍏肩▔瀹ュ鐓ユ繝闈涙－濡插綊鏌ｉ幘瀵搞�掗柨鐔凤拷鐕佹綈闁瑰皷鏅犲畷浼村冀椤愵剚瀚规慨妯煎帶濞呭秹鎸婂┑瀣厪濠㈣泛妫欏▍鍡涙煕鐎Ｑ冨⒉缂佺粯绻冪换婵嬪磼濞戞ɑ顏犳俊鐐�х徊浠嬪Χ閹间礁绠栧ù鐘差儛閺佸秵淇婇妶鍜佸剱閻庢俺顫夌换婵嬪閻樺樊浼掔紓鍌氱С缁舵艾顕ｉ锕�纾奸柣鎰綑閻у嫭绻濋姀锝呯厫闁挎碍绻涢崼顒佸? by changhao
public class CAbsentReturnTeam extends __CAbsentReturnTeam__ {

	private Team team;

	@Override
	protected void process() {
		TeamManager.logger.debug("Enter: " + this.getClass());
		// protocol handle
		final long memberRoleId = gnet.link.Onlines.getInstance().findRoleid(
				this);
		if (memberRoleId < 0)
			return;
		if (checkPvP(memberRoleId, absent) != 0) {
			return;
		}

		PAbsentReturnTeam absentReturnTeamP = new PAbsentReturnTeam(
				memberRoleId, absent);

		if (absent == 1)
		{ //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵割暡婵炵厧绻樺畷濂稿Ψ閿旇瀚肩紓鍌欑椤戝棛锟界瑳鍐胯�块柟娈垮枤绾惧吋銇勯弮锟介崕鎶藉煝閸儲鐓欐い鏃傜摂濞堟粎锟芥鍠栭…閿嬩繆閻戣姤鏅滈柟顖嗗啰顔戦梻鍌氬�风欢姘焽瑜旈垾锕傚醇閵夈儳锛熼梻渚囧墮缁嬩線寮崒娑栦簻闁圭儤鍨甸顏堟煟閹捐泛鏋涢柡灞诲姂瀵剟宕归钘夛拷顖炴煟鎼淬垻鍟查柟鍑ゆ嫹 by changhao
			absentReturnTeamP.submit();
		} 
		/*
		else if (absent == 2) //闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜堕弫鍥煏韫囨洖啸闁告繃顨婂缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閺囥垹绠ｆ繝銏＄箓缂嶅﹤鐣峰Δ鍛闁兼祴鏅濋埢蹇涙⒒娴ｈ櫣甯涢柛鏃�娲熼弫鍐敂閸繆鎽曢梺鎸庣箓椤︻垳绮诲☉娆嶄簻闁哄秲鍔嶉惃鎴炴叏閿濆啫鐏紒杈ㄦ尰閹峰懘宕滈崣澶橈拷鍡涙⒑閻熸澘娈╅柟鍑ゆ嫹(闂傚倸鍊搁崐椋庣矆娴ｉ潻鑰块梺顒�绉撮崒銊ф喐閺冨牆绠栨繛宸簻鎯熼梺瀹犳〃濞村洭骞楅弴銏♀拺闂傚牊鍗曢崼銉ョ柧闁冲搫鎳庨弸渚�鎮楅敐搴′簴濞存粍绮撻弻锟犲炊閺堢數鍑归柣搴㈣壘缂嶅﹪骞冨Δ鍐╁枂闁告洦鍓涢敍姗�姊虹粙鎸庡攭婵炲懏娲滅划瀣箳濡や焦娅囬梺绋挎湰缁嬫垵鈻撻悢鍏尖拺闂傚牊渚楀Σ鍫曟煕鎼淬劋鎲鹃柟顕�鏀遍幆鏃堝Ω閿旇瀚藉┑鐐舵彧缂嶏拷妞ゎ偄顦靛畷鎴︽偐缂佹鍘遍柟鍏肩暘閸ㄥ宕ｉ敓浠嬫倵鐟欏嫭绀冩繛鑼枛閻涱喗鎯旈敐鍥攺闁诲函缍嗛崑鍛枍瀹ュ鐓熼柣鏂挎憸閻苯顭胯椤ㄥ牓寮锟介獮鎺楀籍閸屾瑧鐟濋梻浣瑰缁诲倿骞忕�ｎ亗锟芥帗绻濆顓烇拷鐢告煥濠靛棛鍑圭紒銊ヮ煼閺岋綁鏁傞崫鍕瀳闂傚洤顦甸弻锝夊箻閹剁瓔锟芥鏌ㄩ悢缁橆棄婵炲皷锟芥剚鍤曞┑鐘宠壘鍥撮梺绯曞墲閻熲晛顬婇鐣岀瘈闁靛骏绲剧涵鐐亜閿曞倷鎲鹃柟顖氬閹棃濮�閵忋垻妲囨繝鐢靛仜閻楀棝鎮樺┑瀣嚑闁瑰墽绮悡娑㈡煕濞戝崬鏋ゆ繛鎻掔摠閵囧嫰濮�閳ュ啿鎽甸梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣銏犲閺佸﹪鏌″搴″箹缂佹劖顨婇弻鈥愁吋鎼粹�冲闂佽桨绀佺�氫即寮诲☉妯锋婵炲棙鍔曢崜褰掓⒑鏉炴壆顦︽い鎴濐樀瀵鎮㈢亸浣圭亖闂佸壊鐓堥崰妤呮倶瀹ュ鍊甸悷娆忓缁�锟藉銈忕細閸楄櫕淇婇悽绋跨妞ゆ牗鑹鹃崬銊ヮ渻閵堝棗濮︽繝顫嫹濠电偛鐭堟禍顏勵潖濞差亜绠伴幖杈剧岛濡俱劑姊虹紒姗嗘畷婵炲弶绻堥幃妯硷拷锝庡枟閳锋垿鎮归幁鎺戝婵炲懏鍔欓弻鐔煎礄閵堝棗顏�?)
		{
			Long teamId = xtable.Roleid2teamid.select(memberRoleId);
			if (teamId != null)
				team = new Team(teamId, true);
			else
				return;
			
			if (!team.isInTeam(memberRoleId))
				return;
			long leaderRoleId = team.getTeamInfo().getTeamleaderid();
			PropRole prole = new PropRole(leaderRoleId, true);
			SAbsentReturnTeam sendret = new SAbsentReturnTeam();		
			if(prole.getProperties().getCruise() > 0) {
				TeamManager.logger.debug("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱閺嬫盯鏌涢弬娆惧剶闁哄矉绻濆畷顏呮媴缁嬪簱鎷梻浣告惈閺堫剟鎯勯鐐拷渚�寮撮姀鈥充汗闂佸湱绮敮鎺楋綖濮樿埖鐓熼柣鎰嚟椤ｈ尙绱掔拠鑼妞ゎ偄绻戠换婵嗩潩椤掑偊绱查梻浣瑰濡礁螞閸曨垼鏁傞柛顐ｆ礃閳锋帒霉閿濆懏鍟為柛鐔哄仱閺岋絽螖婵犲倸绠诲┑鈥冲级閸旀瑥顕ｉ幘顔藉亹闁汇垻鏁搁崝鍫曟⒒娴ｈ櫣銆婇柛鎾寸箘缁瑩骞掑Δ浣镐簵闂佺粯鏌ㄩ崥瀣偂韫囨挴鏀介柣鎰皺娴犮垽鏌涢弮锟界喊宥夊Φ閸曨喚鐤�濠电姴鍟悵姘舵⒑鐠団�虫灈缂傚秴锕悰顕�宕堕澶嬫櫍闂佺粯鏌ㄩ幖顐﹀吹閹烘鈷掑〒姘炬嫹婵炰匠鍏炬稑鈻庨幋鐐存闂佺偨鍎辩壕顓㈠汲閿斿浜滈柟鏉垮閻ｉ亶宕鐐粹拺闂傚牊渚楀Σ褰掓煕閺傜偛鎳愭稉宥夋煙閹规劦鍤欓柦鍐枛閺岋綁寮崹顔藉�梺鍝勬噺閹倿寮婚妸鈺傚亞闁稿本绋戦锟�?,婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖缁愭淇婇妶鍛殶缂佹唻绠撻弻娑滎槼妞ゃ劌鎳愭竟鏇°亹閹烘挾鍘搁悗瑙勬惄閸犳牠寮甸鍌︽嫹闂堟稓鐒告慨濠呮缁瑩骞愭惔銏″缂傚倷绀侀鍡涘箲閸ヮ剙鏄ラ柕蹇嬪�曠猾宥夋煕瀹�瀣閻庢俺顫夐〃銉╂倷閼碱兛铏庨梺鍛婃⒐瀹�鎼佸蓟閿濆憘鏃堟晸閽樺）娑樷攽閸℃瑦娈鹃梺闈涙禋濠線骞忛悜鑺ヮ棃婵炴垶鐟ラ弳鍫ユ⒑閸濄儱校闁告梹鐟╁濠氭晲閸涘倹妫冮弫鎾寸鐎ｎ偄浜遍梺绯曞墲椤﹂缚銇愰幒婵囨櫓闂佺懓鐡ㄧ敮鐐电不濮樿埖鐓熼柣妯哄级閸樺倿鏌涢弴銊ヤ航濞寸》鎷�,teamId: " + teamId);
				fire.pb.talk.MessageMgr.sendMsgNotify(memberRoleId, 160435, null);
				sendret.ret = 0;
			} else {
				sendret.ret = 1;
			}
			gnet.link.Onlines.getInstance().send(memberRoleId, sendret);
			return;
		}
		*/
		else
		{
			Long teamId = xtable.Roleid2teamid.select(memberRoleId);

			if (teamId != null)
				team = new Team(teamId, true);
			else
				return;
			
			//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕妞ゎ偄顦遍敓浠嬫涧閵堢顕ｉ崼鏇炵闁绘ê鐏氬В搴㈢節閻㈤潧浠﹂柟绋款煼閹垽顢楅崟顐ゎ唵婵＄偛顑呴崙浠嬪箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︻參姊虹粙璺ㄧ閽冨崬菐閸パ嶈含妤犵偞鐗楅幏鍛村传閵夈儱绠伴梻鍌欒兌椤牓鎳熼鐐茬９闁荤喐鍣村ú顏勫唨妞ゆ挾鍠撻悾鎶芥⒒閸屾瑨鍏岀紒顕呭灦楠炴劗绮欏Λ鐢垫嚀閻ｏ繝骞嶉鐣屾闂傚倸鍊搁崐宄懊归崶顒�纾婚柟鎷屽焽閿熻棄鍊块、姘舵晸娴犲宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘 by changhao
			if (!team.isInTeam(memberRoleId))
				return;
			
			long leaderRoleId = team.getTeamInfo().getTeamleaderid();
			PropRole prole = new PropRole(leaderRoleId, true);
			if(prole.getProperties().getCruise() > 0) {
				TeamManager.logger.debug("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱閺嬫盯鏌涢弬娆惧剶闁哄矉绻濆畷顏呮媴缁嬪簱鎷梻浣告惈閺堫剟鎯勯鐐拷渚�寮撮姀鈥充汗闂佸湱绮敮鎺楋綖濮樿埖鐓熼柣鎰嚟椤ｈ尙绱掔拠鑼妞ゎ偄绻戠换婵嗩潩椤掑偊绱查梻浣瑰濡礁螞閸曨垼鏁傞柛顐ｆ礃閳锋帒霉閿濆懏鍟為柛鐔哄仱閺岋絽螖婵犲倸绠诲┑鈥冲级閸旀瑥顕ｉ幘顔藉亹闁汇垻鏁搁崝鍫曟⒒娴ｈ櫣銆婇柛鎾寸箘缁瑩骞掑Δ浣镐簵闂佺粯鏌ㄩ崥瀣偂韫囨挴鏀介柣鎰皺娴犮垽鏌涢弮锟界喊宥夊Φ閸曨喚鐤�濠电姴鍟悵姘舵⒑鐠団�虫灈缂傚秴锕悰顕�宕堕澶嬫櫍闂佺粯鏌ㄩ幖顐﹀吹閹烘鈷掑〒姘炬嫹婵炰匠鍏炬稑鈻庨幋鐐存闂佺偨鍎辩壕顓㈠汲閿斿浜滈柟鏉垮閻ｉ亶宕鐐粹拺闂傚牊渚楀Σ褰掓煕閺傜偛鎳愭稉宥夋煙閹规劦鍤欓柦鍐枛閺岋綁寮崹顔藉�梺鍝勬噺閹倿寮婚妸鈺傚亞闁稿本绋戦锟�?,婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖缁愭淇婇妶鍛殶缂佹唻绠撻弻娑滎槼妞ゃ劌鎳愭竟鏇°亹閹烘挾鍘搁悗瑙勬惄閸犳牠寮甸鍌︽嫹闂堟稓鐒告慨濠呮缁瑩骞愭惔銏″缂傚倷绀侀鍡涘箲閸ヮ剙鏄ラ柕蹇嬪�曠猾宥夋煕瀹�瀣閻庢俺顫夐〃銉╂倷閼碱兛铏庨梺鍛婃⒐瀹�鎼佸蓟閿濆憘鏃堟晸閽樺）娑樷攽閸℃瑦娈鹃梺闈涙禋濠線骞忛悜鑺ヮ棃婵炴垶鐟ラ弳鍫ユ⒑閸濄儱校闁告梹鐟╁濠氭晲閸涘倹妫冮弫鎾寸鐎ｎ偄浜遍梺绯曞墲椤﹂缚銇愰幒婵囨櫓闂佺懓鐡ㄧ敮鐐电不濮樿埖鐓熼柣妯哄级閸樺倿鏌涢弴銊ヤ航濞寸》鎷�,teamId: " + teamId);
				fire.pb.talk.MessageMgr.sendMsgNotify(memberRoleId, 160435, null);
				return;
			}
			PropRole pmemrole = new PropRole(memberRoleId, true);
			if(pmemrole.getProperties().getCruise() > 0) {
				TeamManager.logger.debug("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱閺嬫盯鏌涢弬娆惧剶闁哄矉绻濆畷顏呮媴缁嬪簱鎷梻浣告惈閺堫剟鎯勯鐐拷渚�寮撮姀鈥充汗闂佸湱绮敮鎺楋綖濮樿埖鐓熼柣鎰嚟椤ｈ尙绱掔拠鑼妞ゎ偄绻愮叅妞ゅ繐瀚粣娑欑節閻㈤潧孝閻庢皜鍐剧�堕柕濞炬櫆閳锋垿鏌熺粙鍨劉濠㈣泛瀚伴弻娑氾拷锝庝簼椤ユ粓宕￠柆宥嗙厵闂侇叏绠戞晶缁樼箾鐏忔牗娅婇柡灞诲�濋獮鏍ㄦ媴鐟欏嫰鏁梻浣告啞閹尖晠宕ｉ崘顭戞綎婵炲樊浜滃婵嗏攽閻樻彃鏆欐い锔规櫊濮婅櫣绮欏▎鎯у壈濡炪倧绠掓禍顒勫礆閹烘鏅查柛娑樺�瑰褰掑箯閸涘瓨鎯為悹鍥ｏ拷铏珬闂傚倸鍊峰ù鍥綖婢跺﹦鏆︽俊顖濄��閺嬪秹鏌￠崶銉ョ仼缂佺姷鍠撶槐鎺旓拷锝庝簽濮樸劑鏌￠敓浠嬫嚍閵夛絼绨婚梺鍝勫暙濞层倛顣块梻浣侯焾閿曘儵宕濋弽顓滐拷鍐Ψ閳哄倸锟藉鏌涢妷锝呭妞ゅ骏鎷�?,婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖缁愭淇婇妶鍛殶缂佹唻绠撻弻娑滎槼妞ゃ劌鎳愭竟鏇°亹閹烘挾鍘搁悗瑙勬惄閸犳牠寮甸鍌︽嫹闂堟稓鐒告慨濠呮缁瑩骞愭惔銏″缂傚倷绀侀鍡涘箲閸ヮ剙鏄ラ柕蹇嬪�曠猾宥夋煕瀹�瀣閻庢俺顫夐〃銉╂倷閼碱兛铏庨梺鍛婃⒐瀹�鎼佸蓟閿濆憘鏃堟晸閽樺）娑樷攽閸℃瑦娈鹃梺闈涙禋濠線骞忛悜鑺ヮ棃婵炴垶鐟ラ弳鍫ユ⒑閸濄儱校闁告梹鐟╁濠氭晲閸涘倹妫冮弫鎾寸鐎ｎ偄浜遍梺绯曞墲椤﹂缚銇愰幒婵囨櫓闂佺懓鐡ㄧ敮鐐电不濮樿埖鐓熼柣妯哄级閸樺倿鏌涢弴銊ヤ航濞寸》鎷�,teamId: " + teamId);
				fire.pb.talk.MessageMgr.sendMsgNotify(memberRoleId, 160436, null);
				return;
			}
			
			Long leaderclanfightid = xtable.Roleid2clanfightid.select(leaderRoleId); //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涘Ο缁樺�愭鐐村姍閺佹挻绂掔�ｎ偀鎷绘繛杈剧秬濞咃絿鏁☉銏＄厸閻忕偠顕ф慨鍌滐拷瑙勬磸閸庢娊鏁撻弬銈囩У闁跨喓鐡旈崹杈╂暜閿熺姷宓侀柛銉墯閸嬪鏌涢鐘茬仼妤犵偛鐗撳缁樻媴閻熼偊鍤嬮梺鍝勮閸旀垿鐛弽顓ф晝闁挎繂瀚粻姘節闂堟稑锟芥悂骞夐敓鐘冲亗闁哄洨鍠撶粻楣冩煕閳╁厾顏呮叏閸垻纾奸柨鐔剁矙瀹曟﹢顢欓挊澶涙嫹閻㈠憡鐓熼柕蹇嬪�栧☉褔鎮介婵嗙厫闁靛洤瀚伴、鏇㈡晲閸モ晝鏉芥俊鐐�戦崹娲晝閵忋倕绠栨繛鍡樻尭缁�鍌炴煕濠靛嫬鍔滅�规洜鍠栧濠氬磼濮橆剨鎷锋搴㈩偨婵﹩鍓﹂悞浠嬫煠婵劕锟芥绋夊澶嬬厵闁绘垶锚閻掔偓绻涚�涙澧甸柡灞炬礃缁绘稖顦查柟铏姍閹箖鎳滈悽鐢电槇闂侀潧楠忕徊浠嬫偂閹扮増鐓曢柡鍐挎嫹闁绘濮撮悾鐑芥偨缁嬭法顦板銈嗙墬缁嬫捇宕ｉ崘銊㈡斀闁宠棄妫楅悘鐔兼偣閿熶粙鏁冮敓钘夊祫闂侀潻瀵岄崢鍓у婵傚憡鐓ラ柣鏂垮閻瑩鏌℃担瑙勫鞍缂佸倹甯為敓鏂ょ秵閸嬪嫭绂掗鐐╂斀闁绘顕滃銉╂煙閸愭煡鍙勯柕鍡楀�圭缓浠嬪川婵犲倷缂撴俊鐐�栭悧妤呫�冮幇鏉跨鐎瑰嫰鍋婇悢鍡涙煕閺囩偛顣崇紒澶樺櫍閺屸剝鎷呯粙鍖℃嫹閸ф绠板┑鐘插暙缁剁偞淇婇婊冨妺妞ゆ棑鎷�? by changhao
			if (leaderclanfightid != null)
			{
				Long memberclanfightid = xtable.Roleid2clanfightid.select(memberRoleId);
				if (!leaderclanfightid.equals(memberclanfightid))
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(memberRoleId, 410020, null); //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈滈柡灞革拷鎰佸悑閹肩补锟藉磭顔愭繝娈垮枦椤鎮￠垾鎰佹綎婵炲樊浜堕弫鍡涙煥閻旂儤娅曠紒顔芥楠炴﹢顢欓懖鈺婂敼闂備礁澹婇崑鍛哄锟介幃陇绠涢幘顖涙杸闂佺粯鍔樼亸娆愮閵忋倖鐓曢柡鍐挎嫹婵ǜ鍔戦獮澶愬箹娴ｅ摜楠囬梺鍦焾鐎垫帒螞閻愮儤鈷掗柛銉戝本鈻堥梺鍝勬湰缁嬫牜绮诲☉姗嗘僵妞ゆ垶瀵ч惈蹇斾繆閻愵亜锟窖呭緤妤ｅ啯鍋傞柨鐔哄Т閽冪喐绻涢幋鏃�鍣伴柨鐔告灮缁犳捇鐛�ｎ亖鏀介柛鈥崇箲鐎氼剟姊虹拠鍙夊攭妞ゎ偄顦叅婵犲﹤鐗嗙粈鍌涗繆椤栨繃顏犻柡鍡檮閵囧嫰骞囬崜浣烘殸缂備緤鎷烽悗锝庡亖娴滄粓鏌熼弶鍨暢缂佸绮换娑㈠醇濠婂懐鐓撳┑顔硷工椤嘲鐣烽幒鎴旀瀻闁硅揪绲块悰銉╂⒒娴ｅ憡鎲稿┑顔炬暬楠炴垿宕惰閺嗭附绻濋棃娑冲姛闁汇倧鎷锋繝鐢靛仦閸ㄥ爼鈥﹂崶顑﹀洩顦查柍瑙勫灴椤㈡瑧绮电�ｎ偒鍚呴梻浣告贡閸忔﹢藟閹剧粯鏅搁柛濠勫櫏濞兼劖绻涢崣澶屽⒌闁诡喓鍎茬缓鐣岀矙鐠恒劎鏆繝鐢靛仜濡瑩骞愭繝姘惞闁瑰鍋戞禍婊堟煙閻戞ê鐏ラ柨鐔诲Г閸旀瑩寮幘缁樻櫢闁跨噦鎷� by changhao
					fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 410021, null); //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈滄鐐寸墪鑿愭い鎺炴嫹濠德ゅ亹缁辨帡鎮╅棃娑欑亪闂佸搫鐬奸崰鏍嵁閸℃稒鍋嬮柛顐亝椤ュ姊绘担鍛婅础闁硅櫕鎹囬幃銉︾附缁嬭儻鎽曢梺鍝勬川閸犳挾绮绘ィ鍐╃厱妞ゎ厽鍨甸弸娑樷攽椤斿ジ鍙勯柟顔煎槻椤劑宕熼鍌氬殥婵犵妲呴崑鍛淬�冩繝鍌﹁�垮〒姘炬嫹婵﹨娅ｇ划娆戞崉閵娧屽晥闂備胶顭堥鍡涘礉濞嗘挸违闁稿瞼鍋涢拑鐔兼煏婢舵稑顩柛妯哄船椤啴濡舵惔鈥崇闂佹悶鍔岄悘姘跺疾閸撲緤鎷烽悽鍛婁氦闁圭兘顥撻幉鎾礋椤掑偆妲堕梻浣侯焾缁绘垿鏁嬮梺浼欑悼閸忔﹢銆侀弴銏℃櫇闁跨喓鏅划鍫拷锝庡枟閻撴洘銇勯鐔风仴濞存粍鍔欓弻锛勶拷锝庝邯椤庢鏌嶇憴鍕伌闁诡喗鐟╁鍫曞箣閻樿鲸顢橀梻鍌欑濠�閬嶁�﹂崼銉ョ婵犲﹤鎳庨崹婵嬫煛閸愩劎澧涢柛濠傤煼閺岋箑螣娓氼垱楔濡炪伅浣稿暊閺�鑺ャ亜閺冨倻鎽傛繛鍫秮閺岀喖鎮滅粵瀣棖闂佽法鍠庨敓鐣屽櫏濞兼劖绻涢崣澶屽⒌闁诡喓鍎茬缓鐣岀矙鐠恒劎鏆繝鐢靛仜濡瑩骞愭繝姘惞闁瑰鍋戞禍婊堟煙閻戞ê鐏ラ柨鐔诲Г閸旀瑩寮幘缁樻櫢闁跨噦鎷� by changhao
					return;
				}
			}
			
			Role memberRole = RoleManager.getInstance().getRoleByID(memberRoleId);
			Role leaderRole = RoleManager.getInstance().getRoleByID(leaderRoleId);
			if (memberRole == null || leaderRole == null)
			{
				TeamManager.logger.error("can't get role scene when return team");
				return;
			}
			
			if (memberRole.getScene() == leaderRole.getScene()) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘鏉戝摵濠碉繝娼ч埞鎴狅拷锝庡亜閿熺晫鏁婚弻锝堫槻闁硅绱曢敓鑺ヨ壘缂嶅﹤顫忓ú顏勫窛濠电姴鍟ˇ鈺呮⒑缁嬫寧鎹ｉ柛蹇斆锝夊箻椤旇棄锟藉爼鎮归崶顏勭毢缂佸妞介弻鐔碱敊閻熸澘鈷夐梺璇″灡濡啴寮澶嬪殝妞ゆ帪鎷烽柣蹇ｄ簽缁辨帞绱掑Ο鑲╃杽闂佽桨鐒﹂幐鑽ょ矉閹烘棑鎷烽敐鍛粵闁哄懏绮撳娲礈閹绘帊绨肩紓浣筋嚙濡粓路閸岀偞鈷掑ù锝囩摂閸ゆ瑧绱掔紒妯烘诞鐎规洘鍨块幃鈺冩嫚閼碱剨绱遍梻渚�锟芥稑宓嗛柛瀣躬瀵偊宕掗悙瀵稿幈濠德板�曢崯顐ｇ鐟欏嫪绻嗛柟缁樺笧婢э箓鏌″畝锟介崰鏍х暦瑜版帩鏁婇柛蹇撳悑椤撹法绱撻崒娆撴闁告柨娴烽崚鎺楊敍濠婂嫬搴婂┑鐘绘涧椤剙顬婇鍫熲拺鐟滅増甯╁Λ鎴︽煕韫囨枂顏堬綖韫囨拋娲敂閸涱厺绮￠梺璇插缁嬫帡鏁嬪銈呴獜閹凤拷? by changhao
			{
				//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼幑鎰靛殭閹兼潙锕弻锛勪沪鐠囨彃澹愰梺鎼炲労閸擄箓寮澶嬬厽闁归偊鍓欑痪褎淇婂顔煎⒋闁诡喗顨婇幆鍌炲川婵犲偆浼撻梻鍌欑閹测�趁洪敃鍌氱婵鎷锋鐐村姍閺佹挻绂掔�ｎ偀鎷绘繛杈剧秬濞咃絿鏁☉銏＄厸閻忕偠顕ф慨鍌滐拷瑙勬磸閸庢娊鏁撻弬銈囩У闁跨喓鐡旈崹杈╂暜閿熺姷宓侀柛銉墯閸嬪鏌涢锝囶暡閻庢艾銈稿缁樻媴閼恒儳銆婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�? by changhao
				fire.pb.team.PGotoTeamLeader go = new fire.pb.team.PGotoTeamLeader(team, memberRoleId, 1);
				go.submit();				
				//absentReturnTeamP.submit();
			}
			else
			{
				//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼幑鎰靛殭閹兼潙锕弻锛勪沪鐠囨彃澹愰梺鎼炲労閸擄箓寮澶嬬厽闁归偊鍓欑痪褎淇婂顔煎⒋闁诡喗顨婇幆鍌炲川婵犲偆浼撻梻鍌欑閹测�趁洪敃鍌氱婵鎷锋鐐村姍閺佹挻绂掔�ｎ偀鎷绘繛杈剧秬濞咃絿鏁☉銏＄厸閻忕偠顕ф慨鍌滐拷瑙勬磸閸庢娊鏁撻弬銈囩У闁跨喓鐡旈崹杈╂暜閿熺姷宓侀柛銉墯閸嬪鏌涢锝囶暡閻庢艾銈稿缁樻媴閼恒儳銆婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�? by changhao
				fire.pb.team.PGotoTeamLeader go = new fire.pb.team.PGotoTeamLeader(team, memberRoleId, 2);
				go.submit();
			}
		}
	}

	// 婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佲枙闁绘帟濮ょ换娑㈠幢濡纰嶉梺缁樻尰閿曘垽寮婚悢鐑樺磯妞ゎ厽鍨堕锟�
	private static int checkPvP(long roleId, byte absent) {
		// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠煑閼恒儳鈽夐摶鏍煕濞戝崬骞橀柨娑欑懄缁绘繈鎮介棃娴讹綁鏌涢埡浣告殻闁轰焦鎹囬幊鐐哄Ψ瑜嶉埛宀勬倵鐟欏嫭绀�闁绘牕銈搁妴浣肝旈崨顔芥闂佷紮绲介惉鍏肩▔瀹ュ鐓ユ繝闈涙－濡插綊鏌ｉ幘瀵搞�掗柨鐔凤拷鐕佹綈闁瑰皷鏅犲畷浼村冀椤愵剚瀚规慨妯煎帶濞呭秹鎸婂┑瀣厪濠㈣泛妫欏▍鍡涙煕鐎Ｑ冨⒉缂佺粯绻冪换婵嬪礃閵娿儺娼旈梺璇插閻旑剟骞忛敓锟�?
		return fire.pb.battle.pvp.PvPTeamHandle.onAbsentReturn(roleId, absent);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794441;

	public int getType() {
		return 794441;
	}

	public byte absent; // 1表示暂离 0表示回归

	public CAbsentReturnTeam() {
	}

	public CAbsentReturnTeam(byte _absent_) {
		this.absent = _absent_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(absent);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		absent = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAbsentReturnTeam) {
			CAbsentReturnTeam _o_ = (CAbsentReturnTeam)_o1_;
			if (absent != _o_.absent) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)absent;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(absent).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAbsentReturnTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = absent - _o_.absent;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}
