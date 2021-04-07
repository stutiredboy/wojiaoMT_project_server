
package fire.pb.mission;
import fire.pb.battle.PSendCameraUrl;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CActiveMissionAIBattle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CActiveMissionAIBattle extends __CActiveMissionAIBattle__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid( this );
		if ( roleid < 0 )
			return;
		final MissionConfig conf = MissionManager.getInstance().getMissionConfig( missionid );
		if (conf == null)
			throw new NullPointerException( "濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏焺閺佸銇勯幘璺烘瀾闁告瑥绻愯灃闁挎繂鎳庨弸銈夋煛娴ｅ壊鍎戦柟鎻掓啞閹棃濡搁妷褏鏉介梻渚�娼ц墝闁哄懏绮撳畷鎰板箰鎼达絿顔曢悗鐧告嫹閻庯綆鍋勯锟�=" + missionid + "闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径宀嬫嫹閻у憡瀚归梺璺ㄥ枍缁瑩寮幘缁樺殟闁靛／鍛綆闂備礁鎲￠〃鍛村疮閸ф鍋╅柣鎴ｆ椤懘鏌曢崼婵囧晵鐟滄棃寮诲☉銏犖ㄩ柕蹇婂墲閻濇牠姊洪幐搴ｃ�掗柛瀣洴閳ユ棃宕橀鍢壯囨煕閳╁叇姘跺箯閻熸壋鏀介柍銉ュ暱缁狙囨偨椤栨粌浠ч柛鎺撳浮瀹曞ジ鎮㈠畡鎵簴婵犵绱曢崑鎾剁箔閹硷拷" );
		if(activetype == 0){
			if (conf.exeIndo.share == 0) {
				fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleid);
				if (team != null){
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 174001, null);
					Module.logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕濂告煥閺冨洦顥夋い蹇ユ嫹" + roleid + "]濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查弶鍫涘妸娴滄粓鐓崶椋庡闂侇収鍨堕弻锛勪沪閸撗岀伇缂備胶濮甸惄顖炵嵁濡偐椹抽悷娆忓椤忓爼姊洪崜鑼帥闁哥姵宀稿鎶芥晝閸屾稓鍘介梺纭呮彧缁查箖藟婢舵劕绠氶柣鏂垮悑閸嬧剝绻濇繝鍌氭殶缂佺姴顭烽弻鐔碱敍濮樿京浼囬梺璺ㄥ枑閺嬭崵绱為崱娑樼獥婵°倕鎳庨悡鏇㈡煙閻戞﹩娈曢柣鎾存礋閺岀喖寮堕崹顔藉�庣紓浣靛妼椤兘寮婚敍鍕舵嫹閿濆骸浜濋柣鎾卞劦閺屽秶鎲撮崟顐や紝濡炪們鍨洪悷鈺呭箠閻愬搫唯闁靛鍨辩�氬綊鏌熼柇锕�寮炬繛鍫滅矙閺岋綁骞嬪┑鍥ь槱闁诲孩姘ㄩ幊鎾诲煘閹达附鍊烽柤鎼佹涧濞懷呯磽閸屾氨小缂佽埖淇哄Λ銏ゆ⒑閻熸澘鈷旂紒顕呭灦瀹曟垿鏁撻悩宕囧幍闂佺顫夐崝锕傚吹濞嗘垹纾奸柣娆愮懃濞诧箓鎮￠崘顔界厱婵犻潧妫楅鈺呮煥閻旂粯顥夋い顓犲厴瀹曟椽濡烽敃锟界欢鐐烘煙闁箑骞橀柛妯哄船閳规垿鎮欓崣澶樻缂備胶绮崹鑳＂闂侀潧绻嗛敓鍊熷皺缁犳艾顪冮妶鍡楀闁搞劌缍婂鎶芥晲婢跺鍘靛銈嗘⒒閺咁偊骞婇崶顒佺厵妞ゆ棁宕甸惌娆撴煙椤旇崵鐭欓柟顔荤矙濡啫鈽夊Ο鑲╂噯闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈滄鐐寸墪鑿愭い鎺炴嫹濠碘�炽偢閺岋綁顢橀悤浣圭杹闂佸搫鑻粔褰掑春閳╁啯濯撮柛娑橈攻椤斿秵淇婇悙顏勶拷鎰板疾濞戞﹩鍤曢柛顐ｆ礀妗呴梺鍛婃处閸ㄦ壆绮诲☉銏＄厪濠电偛鐏濋崝姘舵煃瀹勯偊妯�闁诡喗顨堥幉鎾礋椤掑偆妲伴梻浣虹帛閹碱偆鎹㈠┑鍡╁殨閻犲洦绁村Σ鍫ユ煏韫囨洖啸闁活偄瀚板娲偡闁箑娈堕梺绋款儑閸嬨倕鐣烽鐐存櫢闁跨噦鎷�" + missionid + "]闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径宀嬫嫹閻у憡瀚归梺璺ㄥ枍缁瑩寮幘缁樺殟闁靛鍎卞В鍫ユ⒑閸涘﹦鎳冮柛鐕佸亰閹箖鎮块妯规睏闂佸湱鍎ょ换鍐疾閵忋倖鈷戦柛娑橈攻婢跺嫰鏌涚�ｎ亝鍤囬挊鐔兼煥閻曞倹瀚�?,闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曞┑鐘垫暩婵瓨瀵奸崨顒兼椽顢旈崟顓у悈闂備胶绮…鍥极閹间焦鍋╅柤鍝ユ暩缁★拷闂侀潧楠忕徊浠嬫偂閹扮増鐓曢柡鍐挎嫹婵炲弶绮庨崚鎺楀醇閵夈儳顦板銈嗙墬缁嬫捇宕㈤柆宥嗏拺閻庡湱濮甸ˉ澶嬩繆椤愶綆娈滈柣娑卞枛铻ｉ柤娴嬫櫆閿涘繘姊虹憴鍕姢闁瑰啿绻掗敓鑺ョ啲閹凤拷" );
					return;
				}
			}
			
			if ( !fire.pb.map.SceneNpcManager.checkDistance( npckey, roleid ) )
				return;
			
			final int npcid = fire.pb.npc.NpcServiceManager.getNpcIDByKey( npckey );
			if (npcid == -1)
				return;
		
			MissionColumn sml = new MissionColumn( roleid, true );
		
			RoleMission mission = sml.getMission(missionid);
			if ( mission == null ) {
				Module.logger.debug( "婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ婢舵劖鐓ユ繝闈涙閹兼劙鏌涢弬娆惧剶闁诡喗顨呴～婵嬵敇閻愬弶鎳欓梻浣告惈閺堫剙煤濡警鍤楅柛鏇ㄥ灠闁卞洦绻濋崹顐ｅ鞍閻庢艾缍婇弻鈥崇暤椤斿吋鍣烘繛鍫ョ畺濮婃椽宕崟顕呮蕉闂佺瀛╅悡锟犲箖閿熺姴鍗抽柕蹇ョ磿閸樻悂姊洪崨濠傚闁哄懏绮庢禍鎼佹偨閻㈠灚锛忛梺缁樺姦閸撴瑩顢氬鍛＜缂備焦顭囧ú瀵革拷瑙勬礀閵堟悂骞冮姀鈽嗘Ч閹煎瓨绻冮、妯肩磽閸屾艾锟介绮堟笟锟介幆宀勫磼濞戞凹娲搁梺鍓插亝濞叉牠寮伴妷鈺傜厱闁哄洢鍔岄悘鐘电磼閿熶粙宕橀鍛瀾闂婎偄娲﹀ú婊堟儗閸℃稒鐓ラ柣鏇炲�圭�氾拷" );
				return;
			}
			final int status = mission.getState();
		
			if ( npcid == conf.exeIndo.npcID && status == MissionStatus.PROCESSING ) {
				if ( !checkEnterBattle( roleid, conf ) ) {
					return;
				}
				final int aiid = conf.aiInfo.aIID;
				new MissionBattle(roleid, aiid, 
						new MissionBattleEndHandler(missionid, conf.aiInfo.battleResult, roleid),
						conf.scenarioInfo.animationID).submit();
			}
		} else if (activetype == 1) {
			//TODO:闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛瀣ㄥ�濋弻鏇熺箾閸喖顬夐梺鐟板暱閻倸顫忕紒妯诲闁告稑锕ラ崕鎾愁渻閵堝棗鐏ユ繛宸幖閻ｉ攱瀵奸弶鎴濆祮闂侀潧绻掓慨鍫ユ晝閸屾稓鍘甸梺缁橆殔閻楀﹦娆㈤弻銉︾厱婵°倓绀侀埢鏇㈡煛瀹�瀣М妤犵偛娲、姗�鎮欓悽鐐瑰仭婵犵數濮伴崹濂革綖婢舵劖鍋嬮柣妯烘▕濞兼牗绻涘顔荤盎鐎瑰憡绻傞埞鎴︽偐閹绘帗娈滈梺鐟板槻椤嘲顫忓ú顏勪紶闁靛鍎涢敐鍡欑闁肩⒈鍓欓弸搴ㄦ煟閿濆懎妲婚摶鏍煕濞戝崬鏋熸繛鍛灲濮婅櫣鎹勯妸銉︾彚闂佺懓鍤栭幏锟�
			final int aiid = conf.aiInfo.aIID;
			new PSendCameraUrl(aiid,roleid).submit();
		}
	}
	
	private static boolean checkEnterBattle( final long roleid, final MissionConfig conf ) {
		fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId( roleid );
		if ( team == null && conf.exeIndo.teamState == 2 ) {
			return false;
		}
		if ( team != null && !team.isAbsentMember( roleid ) && conf.exeIndo.teamState == 0 ) {
			Module.logger.error( "濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏焺閺佸銇勯幘璺烘瀾闁告瑥绻愯灃闁挎繂鎳庨弸銈夋煛娴ｅ壊鍎戦柟鎻掓啞閹棃濡搁妷褏鏉介梻渚�娼ц墝闁哄懏绮撳鏌ュ箹娴ｅ湱鍙嗛梺缁樻礀閸婂湱锟芥熬鎷�" + conf.missionId + "濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚敐澶婄闁挎繂妫Λ鍕磽娓氬﹥瀚归梺绋挎湰缁嬫帡宕ｈ箛鏂剧箚闁靛牆鎷嬮崕鎰版倵濮橆剛绉洪柟顔筋殔閳绘捇宕归鐣屼邯闂備浇顕х换鎴︽嚌妤ｅ喚鏁嬮柕澶嗘櫅缁�瀣亜閺嶃劍鐨戦柣銈忔嫹濠碉紕鍋戦崐鏍箰閹间絸鍥级濡灚妞藉浠嬵敇閻旇櫣鏆㈤梻鍌氬�烽懗鍓佸垝椤栫偛绠扮紒瀣紩瑜版帗鐓ラ悗锝庡墮閳即姊绘担钘夊惞闁哥姵鍔楅崚鎺楀箻濮瑰浄鎷烽崒鐐存櫇闁稿本绋戦敓钘夋健閺屻劑寮崹顔规寖闂佹椿鍘奸ˇ鐢稿蓟閵娾晜鍋嗛柛灞剧☉椤忥拷?" );
			fire.pb.talk.MessageMgr.sendMsgNotify( roleid, 141711, null );
			return false;
		}
		if ( conf.exeIndo.hasOtherLimit == 1 ) {
			final SSpecialScenarioQuestConfig sconf = conf.getSpecialScenarioQuestConfig();
			if ( sconf == null )
				return false;
			if ( sconf.缂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌ㄩ悢鍝勑㈢痪鎹愵嚙椤潡鎳滈棃娑樞曢梺杞扮椤戝洭骞夐幖浣哥睄闁割偅绻勯悾鍝勨攽鎺抽崐鏇㈠疮娴煎瓨鍎楁繛鍡樻尰閻撳繘鏌涢埥鍡楀箺閻庢熬鎷�2 == 2 ) {
				// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔戒氦缂傚倸鍊风欢銈夊箯閻戣姤鐓曢柡鍥ュ妼閻忥繝鏌ｉ幘璺烘灈闁哄瞼鍠撻敓鐣屾暬閺呰尙妲愰搹顐犱簻闊洦鎸炬晶娑㈡煕婵犲懎鐓愮紒缁樼洴楠炲鈻庤箛鏇氱棯闂備胶顭堥敃锕傚极婵犳艾钃熸繛鎴欏灪閺呮粓鎮归崶銊ョ祷缂佺姴缍婇弻娑㈡偄闁垮鏆堢紓浣虹帛缁诲牓宕哄☉銏℃櫢闁芥ê顦介崥瀣煕閳╁喚娈㈠ù纭锋嫹
				final int fightpetkey =
					xtable.Properties.selectFightpetkey( roleid );
				fire.pb.pet.PetColumn pc = new fire.pb.pet.PetColumn( roleid, 
						fire.pb.pet.PetColumnTypes.PET, true );
				xbean.PetInfo pi = pc.getPetInfo( fightpetkey );
				if ( pi == null || 
						(sconf.activeparams != null && 
						!sconf.activeparams.contains( pi.getId() ) ) ) {
					fire.pb.talk.MessageMgr.sendMsgNotify( roleid, sconf.emsg, conf.exeIndo.npcID, null );
					return false;
				}
			}
		}
		return true;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805452;

	public int getType() {
		return 805452;
	}

	public int missionid; // 任务id
	public long npckey; // npc的key
	public int activetype; // 激活类型:0进入AI战斗,1观看战斗录像

	public CActiveMissionAIBattle() {
	}

	public CActiveMissionAIBattle(int _missionid_, long _npckey_, int _activetype_) {
		this.missionid = _missionid_;
		this.npckey = _npckey_;
		this.activetype = _activetype_;
	}

	public final boolean _validator_() {
		if (missionid < 1001 || missionid >  999999) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(missionid);
		_os_.marshal(npckey);
		_os_.marshal(activetype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		missionid = _os_.unmarshal_int();
		npckey = _os_.unmarshal_long();
		activetype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CActiveMissionAIBattle) {
			CActiveMissionAIBattle _o_ = (CActiveMissionAIBattle)_o1_;
			if (missionid != _o_.missionid) return false;
			if (npckey != _o_.npckey) return false;
			if (activetype != _o_.activetype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += missionid;
		_h_ += (int)npckey;
		_h_ += activetype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(missionid).append(",");
		_sb_.append(npckey).append(",");
		_sb_.append(activetype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CActiveMissionAIBattle _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = missionid - _o_.missionid;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		_c_ = activetype - _o_.activetype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

