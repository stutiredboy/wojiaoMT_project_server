
package fire.pb.mission;

import fire.pb.map.DuplicateHelper;
import fire.pb.map.GridPos;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.move.DynamicSceneType;
import fire.pb.move.SRoleEnterScene;
import fire.pb.talk.MessageMgr;
import fire.pb.team.PAbsentReturnTeam;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;






// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CDefineTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CDefineTeam extends __CDefineTeam__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid <= 0) {
			return;
		}
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				Long teamId = xtable.Roleid2teamid.select(roleid);
				if (teamId == null)
					return false;
				
				Team team = TeamManager.selectTeamByTeamID(teamId);
				if (team == null)
					return false;
				
				if (answer == 1) {
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氱紓鍌欒兌閸嬫捇宕曢崘宸劷闁跨喓濮撮拑鐔兼煥濠靛棭妲告い顐㈡嚇閺屾洝绠涙繝鍐╃彇闂佸憡姊归幃鍌氼潖閸濆嫅褔宕惰閹峰嘲螖閸涱厾锛涢梺瑙勫礃閸╂牕鐣烽崣澶岀闁瑰瓨鐟ラ悘鈺冪磼閻欏懐绋荤紒缁樼洴瀹曞崬螖閸愵亶鍞哄┑鐐差嚟婵烇拷缂佺姵鐗曢～蹇涙惞閸︻厾鐓撳┑鐐叉閸庢娊宕滈銏♀拺缂佸灏呴弨鑽ょ磼鐠囪尙澧曟い鏇稻缁绘繂顫濋锟藉畵鍡涙⒑缂佹ɑ顥嗘繛鍜冪秮椤㈡瑩寮撮姀鈥充画濠电姴锕ら崯鎷屽�撮梻浣芥硶閸犳洘鎱ㄩ妶澶婄鐟滅増甯掗崒銊モ攽閸屾粠鐒鹃柣鎾寸箞閺岀喖鎮欓浣虹▏濡炪倖娲熸禍鍫曞箖濡わ拷閳藉鈻庡Ο鐓庡Ш闂備礁鎲＄湁缂侇喗鐟╁濠氭偄閻撳海顦ч梺鍏肩ゴ閺呮粌鈻撻鍕拺闁硅偐鍋涙俊鍏笺亜椤撶姴鍘寸�规洘妞介弫鍌炴偩瀹�锟介幊婵嬫⒑鐠恒劌鏋嶇紒顔界懇閻涱喛绠涘☉妯碱吅闂佹寧娲╅幏椋庣棯椤撱劍瀚归梻鍌欐祰椤曆呮崲濡わ拷閻ｇ兘鎮界粙璺ㄧ枃闂佽宕橀褔鎮″锟介弻娑㈠箛闂堟稒鐏堥梺鎼炲妼閸婂綊濡甸崟顖氬嵆闁绘劖鎯屽Λ锟犳煟鎼淬垼澹樼紓宥咃躬瀵鍨鹃幇浣告倯闁硅偐琛ラ敓鍊熷皺閸戝綊鏌ｆ惔銈庢綈婵炲弶鐗曢锝夊礈娴ｇ懓搴婂┑鐐村灟閸ㄥ湱绮婚敐鍡欑闁糕剝顨堢粻鍐裁归悩鍝勪汗缂佽鲸鎸婚幏鍛村传閸曠鎷烽幘鍓佺＝鐎广儱瀚粣鏃傦拷娈垮枛椤兘寮幇鏉块唶闁靛繈鍨哄鎴︽⒒娴ｅ憡鎯堥柛鐘崇洴楠炲繘鎮滈懞銉у帾闂佹悶鍎弲娑㈠几鎼淬劍顥嗗璺侯儑缁★拷婵犵數濮撮崐鎼侇敂椤愶附鐓熸い鎾跺枎缁楁岸鏌曢崶褍顏┑顕嗘嫹闂佺偨鍎遍崯鍧楀箺閻㈠憡鈷戦弶鐐村閸斿秹鏌涢弮锟介悧鏇㈩敋閵夆晛绀嬫い鎺戝�婚惁鍫ユ⒑閸涘﹥绀嬫繛浣冲洤鏋侀柛顐ｆ礃閳锋帡鏌涚仦鍓ф噮妞わ讣绠撻弻娑橆潩椤掑鍓辩紓浣稿�哥粔鐢电矉閹烘棑鎷烽敐搴濈敖闁挎稓鍠庨—鍐Χ閸℃鈹涢梺鍦厴閺�閬嶃�冮妷鈺傚�烽柤纰卞墰椤斿绱撴担铏瑰笡缂佽鍊块敐鐐测攽鐎ｅ灚鏅ｅ┑鐐村灦閻熴儵顢旇ぐ鎺撯拻闁稿本鐟чˇ锕傛煙鐠囇呯？缂侇喗鐟╅獮瀣晜閼恒儲鐝栭梻渚�娼ч悧鍡椢涘▎鎾崇煑闊洦绋掗悡銉╂煛閸ユ湹绨奸悗姘秺濮婂宕惰濡插湱绱掔紒妯肩畺缂佺粯绻堝畷鎺戭潩闂傚纾婚梻鍌欑劍濡炲潡宕㈤悾灞炬殰闁绘劗鍎ら弲鎼佹煠閹帒鍔撮柛鐔风箻閺屾盯鎮╅崘鎻掓懙闂佺偨鍎荤粻鎾崇暦婵傜唯闁靛／鍐ㄧ哗婵犵數濮伴崹濂稿春閺嶎厼绀夐柡鍥舵緛缂嶆牠鏌涘☉妯兼憼闁绘挶鍎茬换娑㈠箣閻忔椿浜、鏃堝煛閸屻倖顔旈梺缁樺姈濞兼瑦鎱ㄥ鍡樺弿濠电姴瀚敮娑㈡煙瀹勭増鍤囬柟鐓庣秺閻涱噣宕犻埄鍐伓婵犵數濮村ú锕傛偂閺囥垺鐓欓柟顖嗗苯娈剁紓浣哄У椤洨妲愰幒妤婃晩闁伙絽鏈崳鏉课旈悩闈涗粶婵炲樊鍘奸锝夊礈娴ｇ懓纾梺闈浤涢崟顓ㄦ嫹椤愶附鈷掗柛灞剧懆閸忓瞼绱掗鍛仸鐎规洘绻堥弫鍐磼濮橀硸妲堕梻浣瑰濞测晠骞忛悜鑺ョ厓缂備焦蓱鐏忔壆绱掗崒娑樼闁跨喐鏋荤紞鍡涘磻閸℃稑鍌ㄥù鐘差儐閳锋垿鏌ｉ悢绋款棆闁圭晫濮风槐鎺旀嫚閹绘帗娈查悗鍨緲鐎氭澘鐣烽悢纰辨晬婵炴垶锕幏鐑藉垂椤愶絽寮垮┑鈽嗗灣閸樠勭妤ｅ啯鍊垫慨妯煎亾鐎氾拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨绘い鎺嬪灪閵囧嫰骞囬姣挎捇鏌熸笟鍨妞ゎ偅绮撳畷鍗炍旈敓浠嬪煕閹烘鈷戠紓浣姑粭鍌滅磼椤旂晫鎳囩�殿喖顭锋俊鍫曞幢濡搫浼庨梻浣哥秺閸嬪﹪宕滈妸鈺佺闁绘垼妫勯崘锟藉銈嗗姦閸撴氨锟芥俺顫夐幈銊ヮ潨閸℃鈷掗梺缁樻尭閵堟悂寮婚垾宕囨殕閻庯綆鍓涜ⅵ闁诲孩顔栭崳顕�宕抽敐鍛殾闁圭儤鍩堝鈺傘亜閹达絾纭堕悽顖涚〒缁辨捇宕掑顒婃嫹妞嬪孩顐介柕鍫濐槸缁狀垳锟界懓瀚伴崑濠囨偄閸℃稒鐓犻柟闂寸劍濞懷冣攽椤斿吋宸濈紒杈ㄥ浮閹晠宕ｆ径搴ｎ攨缂傚倷娴囨ご鍝ユ暜閿熺姰锟戒礁鈻庤箛濠冪�婚梺缁樺姦閸撴稓绮旈柨瀣╃箚闁绘劦浜滈敓鑺ユ礃椤ㄣ儳绮欑拠鐐☉閳规垹锟斤綆浜ｉ幗鏇㈡⒑閹稿海鈽夐悗姘倐楠炲繘鎮滈懞銉︽珳闁硅偐琛ラ敓鍊熷皺閸戣淇婇悙顏勶拷鎴﹀磿闁秵鍋嬮柟鎹愵嚙閽冪喖鏌嶉妷銉э紞闁哄棗妫濋弻銊╂偄閸撲胶鐓撻悗瑙勬磻閸楁娊鐛崶顒夋晢濠㈣泛鑻慨娲⒒婵犲骸浜滄繛璇у缁瑩骞嬮悩鐢电劶闂佸壊鍋侀崹娲窗閹版壆鍙撻柛銉ｅ妿閳藉鎱ㄧ憴鍕弨闁哄矉绲借灒闁稿繐鍚嬪В鍕磼閻愵剙绀冩俊顐㈠婵℃挳骞掗幋顓熷兊濡炪倖甯掗敃銉╁极妤ｅ啯鐓熼幖鎼線娴溿垺銇勯銏╂Ш闁瑰箍鍨归埞鎴狅拷锝庝憾濞煎﹪姊洪幐搴ｇ畵闁硅櫕鍔欏畷銏ゎ敃閿旇В鎷洪梺鍛婄☉閿曘儵鍩涢幇鐗堢厽婵°倕鍟埢鍫燁殽閻愭彃鏆ｆ俊鎹愪含缁辨帡鎮╁畷鍥ㄥ垱濡ょ姷鍋為敃銏ゃ�佸☉妯锋婵炲棙鍔栫欢顐︽⒒閸屾艾锟界兘鎳楅崜浣稿灊妞ゆ牜鍋愰敓鏂ょ畵瀹曞ジ锝為鐘插⒕婵犵數鍋涘Λ娆撳垂鐟欏嫮鈻旂�广儱顦伴悡娑㈡倶閻愰鍤欓柛鏃�绮撻弻娑欑節閸屾粈绮甸梺閫涚┒閸斿矁鐏掗梺缁樻尭缁ㄥ吋绔熼弴銏＄厽閹兼番鍨婚崯鏌ユ煙閸戙倖瀚�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐鍛傜喎鈻庨幆褎顔勭紓鍌欒兌婵挳鎮樺璺何﹂柛鏇ㄥ枤閻わ拷闂佸湱鍋撻幆灞轿涢悙鐢电＝濞达絿鏅崼顏堟煕婵犲啯绀嬫繝锟芥笟锟藉铏圭磼濡浚浜滆灒濠电姴娲ょ壕鍧楃叓閸ャ劍绀堢痪鎯с偢閺岋絽顫滈敓钘夘焽瑜斿绋库槈閵忥紕鍘搁柣蹇曞仩椤曆勪繆婵傚憡鐓冮柦妯侯樈濡叉悂鎽堕敐鍛拷鎺戭潩閻撳海浠х紓浣介哺閹告悂鍩為幋锔藉亹闁归绀侀弲閬嶆⒑閸濄儱校缂佸鍨块崺銏狀吋婢跺﹤宓嗛梺闈涚箳婵兘鎮块崟顖涒拺闂傚牊渚楅悞楣冩煕鎼淬垻鎳囬柟顔哄灲閹剝鎯旈敍鍕舵嫹椤撶儐娓婚柕鍫濇閳锋劙鏌涙惔锛勶紞闁轰緡鍣ｅ畷绋课旀担鍙夊濠电偠鎻紞锟芥繛鍜冪悼閺侇喖鈽夐姀锛勫幍缂備礁顑嗛娆撴偂婵傚憡鐓欐い鏍ㄨ壘椤忣厽銇勯姀锛勬创闁诡喗鐟╅幊鐘绘嚋閸偄鏆繝鐢靛Х閺佹悂宕戦悙鍝勫瀭闁割偅娲橀弲婵嬫煃閸濆嫭鍣洪柛瀣�块弻鏇熷緞閸℃ɑ鐝曢梺缁樻尪閸庣敻寮婚敐澶婄睄闁稿本鑹炬俊鍝勨攽閻愬弶鍣烘繛鍙夌矌濡叉劙骞掑Δ濠冩櫓闂佸吋绁撮弲娑⒙烽敓鐣岀磽閸屾瑧鍔嶆い銊ョ墦瀹曚即寮介鐐寸�梺瑙勫劤椤曨參銆呴悜鑺ュ�甸柨婵嗙凹缁ㄤ粙鏌ｉ敐鍛儓闁宠鍨块、娆戠驳鐎ｎ偒鍚呴梻浣哥秺椤ユ捇宕楀锟藉濠氭偄绾拌鲸鏅╅梺鍛婄箓鐎氼喗瀵奸崼銉﹀�甸悷娆忓缁�鍐┿亜閵娿儻韬鐐诧躬瀵粙顢橀悙闈涘箰濠电偠鎻徊浠嬪箺濠婂牜鏁婇柟鐑樻⒒绾句粙鏌涚仦鎹愬闁跨喓鏅崗姗�骞婂Δ鍛唶闁哄洨鍋熼敍娑㈡⒑閸︻厼浜鹃柛鎾村哺閹垽宕卞Ο璇插伎濠德板�曢鍡欙拷姘秺閺岋箑螣閼姐倗鐤勯梺鍝勭灱閸犲酣鍩㈤幘璇插瀭妞ゆ梻鏅ぐ鏌ユ⒒娴ｇ儤鍤�闁搞垺鐓″畷鏌ュ蓟閵夘垳绋忓┑鐘绘涧椤戝棝宕愰柨瀣ㄤ簻闁硅櫣鍋炵�氱懓顪冮妶鍛寸崪闁瑰嚖鎷�
					long leaderroleId = team.getTeamInfo().getTeamleaderid();
					
					Role leaderRole = RoleManager.getInstance().getRoleByID(leaderroleId);
					
					GridPos gridPos = leaderRole.getPos().toGridPos();
					DuplicateHelper.enterDynamicSceneByIdWhileCommit(roleid, leaderRole.getMapId(), leaderRole.getScene(),
							gridPos.getX(), gridPos.getY(),
							DynamicSceneType.NORMAL_SCENE, SRoleEnterScene.CHEFU);
					
					PAbsentReturnTeam absentReturnTeamP = new PAbsentReturnTeam(roleid, 0);	
					mkdb.Executor.getInstance().schedule(new Runnable() {
						@Override
						public void run() {
							absentReturnTeamP.submit();
						}
					}, 2, TimeUnit.SECONDS);
				}
				else {
					String roleName = xtable.Properties.selectRolename(roleid);
					if (roleName == null)
						return false;
					List<String> para = new ArrayList<String>(1);
					para.add(roleName);
					for (Long rid : team.getNormalMemberIds()) {
						if (rid != roleid) {
							MessageMgr.psendMsgNotifyWhileCommit(rid, 160211, para);
						}
					}
				}
				return true;
			}
			
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805548;

	public int getType() {
		return 805548;
	}

	public short answer; // 1表示同意, 0表示不同意

	public CDefineTeam() {
	}

	public CDefineTeam(short _answer_) {
		this.answer = _answer_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(answer);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		answer = _os_.unmarshal_short();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CDefineTeam) {
			CDefineTeam _o_ = (CDefineTeam)_o1_;
			if (answer != _o_.answer) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += answer;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(answer).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CDefineTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = answer - _o_.answer;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

