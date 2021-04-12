
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
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К缂備胶鍋撻崕鍐差焽閿熺姴钃熼柨婵嗩槸椤懘鏌曡箛濠冩珖闁告梹鎮傚鍝勑ч崶褝鎷峰Δ鍛；闁规崘鍩栧畷鍙夌箾閹存瑥鐏╃紒鐙呯稻缁绘盯宕卞Δ鍐唺婵炲濞�缁犳牕顫忛搹鍦煓婵炲棙鍎抽崜顓㈡⒑缁嬪尅鏀荤紒璇茬墕椤曪絾绻濆顒�宓嗛梺缁樻濞咃綁顢欓弴銏″仭婵犲﹤鍟拌倴闂佽法鍠曟慨銈夊礄瑜版帒鍌ㄥ┑鍌滎焾閻撴繈鏌熼悙顒佺稇妞ゆ洟浜堕幃妤�鈽夊▎妯煎姺闂佸憡眉缁瑩寮婚悢鐓庣闁兼祴鏅滃▓顒勬⒑閹肩偛濡兼い顓犲厴瀹曟椽鏁傞悾宀�鎳濋梺璺ㄥ枍缁瑩鐛箛娑樼闁挎洩鎷风痪顓ㄦ嫹闂備浇顕х换妤�鐣烽悽绋跨疇闁规崘顕ч悡姗�鏌涢幇闈涙灈闁搞劌鍊归妵鍕即閻愭惌妫￠柣搴㈣壘缂嶅﹪寮婚垾鎰佸悑閹肩补锟借尙鍑归柣搴ゎ潐濞叉牕顕ｉ崜浣瑰床婵炴垯鍨圭粻锝嗙箾閸℃绠冲ù鐘哄亹缁辨挻鎷呴崫鍕碉拷鎾剁磽瀹ュ嫮绐旂�殿喖顭烽弫鎰板醇閵忋垺婢戦梻浣告惈閸犳盯骞忛悜鑺ョ厪闁搞儮鏅涢弸搴ㄦ婢跺绡�濠电姴鍊搁顐︽煟椤撶喎绗氶柕鍥у婵拷闁炽儱鍟块幗鐢告⒑鏉炴壆鍔嶉柛鏃�鐗曢銉╁礋椤掑倻鐦堥梺鍛婃礋濞佳囧极閸洘鈷掗柛灞剧懅椤︼箓鏌涘顒夊剱缂佸倸绉电粋鎺旓拷锝庝簽閿涚喎顪冮妶鍡樼┛闁圭兘鏀遍〃銉╂倷閼碱剛顔夌紓浣虹帛缁诲倿锝炲┑瀣垫晣婵炴垶鐟ラ褰掓⒒閸屾瑧顦﹂柟璇х磿缁瑩骞嬮敂鑺ユ珖闂侀潧鐗嗗Λ娆撳矗韫囨稒鐓ラ柡鍥朵簼鐎氬綊姊婚崶褜妲圭紒缁樼箖缁绘繈宕掑闂寸磻闂備焦妞块崢鐣屾暜閻愮儤鏅搁柤鎭掑労閸熷繘鏌涢悩鍐插摵闁炽儻绠撳畷濂稿Ψ閵壯冨绩濠电姰鍨奸崺鏍礉閺囶澁缍栭柛娑樼摠閻撱儲绻涢幋鐏活亪顢旈埡鍌ゆ闁绘劖娼欐慨宥嗘叏婵犲嫮甯涢柟宄版嚇閹煎綊鐛崠鈩冨濠电姴娲﹂悡鏇㈡煙閹屽殶缂佺姵顭囩槐鎺楊敊閻ｅ本鍣板Δ鐘靛仜濞差厼顕ｉ崜浣瑰磯闁靛ě鍕拷顐︽⒒閸屾瑨鍏岀紒顕呭灦瀹曟繈鏁冮崒姘鳖槶闂佹寧娲╅幏鐑芥煃缂佹ɑ灏扮紒鍌涘笧閿熸枻缍嗛崑鍡涘储娴犲鈷戦柣鐔稿閹界姷绱掔拠鎻掓殲鐎垫澘瀚板畷鐔碱敍濞戞﹫鎷烽崹顐ｅ弿婵☆垳鍘ф禍楣冩倵濮樼偓瀚�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簻椤掋垺銇勯幇顖毿撻柟渚垮妼椤粓宕卞Δ锟介埛鎺楁⒑缂佹ê绗傜紒顔界懇瀵濡堕崱妯哄伎闂佸綊鍋婇崜銊╁箯閻戣棄鍐�妞ゆ劦鍓氱�氳鎱ㄥ鍡楀⒒闁绘挸銈搁弻鈥崇暆鐎ｎ剛袦閻庢鍣崳锝呯暦閹烘埈娼╂い鎴ｆ硶鐢稓绱撻崒姘拷椋庢閵堝绠�瑰嫰鍋婇悢鍡涙煠閹间焦娑у┑顔兼川缁辨帡鎮╅崣澶庣缂備浇椴哥敮锟犮�佸▎蹇婃瀻闁绘劦鍓涚粔閿嬩繆閻愵亜锟芥洘顨ョ粙璇炬稑鈹戠�ｎ亣鎽曢梺鎸庣☉鐎氭悂骞忛悜鑺ユ櫜閹肩补锟借尙鍑规俊鐐�戦崕閬嶆偋閹捐钃熼柍銉ョ－閺嗗棝鏌ㄩ悢鍓佺煓鐎规洑鍗抽獮鍥敆婢跺苯濮洪梻濠庡亜濞诧妇绮欓幋鐘电焼闁割偁鍨洪崰鎰扮叓閸ャ劎鈽夋慨瑙勭叀閺岋絽螣閸忓吋姣勭紒鐐礃濡嫰濡撮幒鎴僵妞ゆ帒锕ラ弫楣冩煟鎼搭澀浜㈡い顐㈩槺閹广垹鈹戠�ｎ亶娼婇梺鎸庣箓閹虫劙宕㈤锔解拺闁告稑锕ラ埛鎰版煟濡ゅ啫鈻堟鐐插暣濡捐京绱掗悩宕囨创妤犵偞锕㈤、娑樷槈濞嗘劖绶梻鍌氬�烽懗鍓佸垝椤栫偐锟斤箓宕奸～顓犲墾濠电偛妫欓崹瑙勭▔瀹ュ鐓涢悘鐐额嚙閸旀粓鏌涙繝鍌滀粵闁逛究鍔岃灒闁绘挸绨兼竟鏇㈡煟鎼淬垻鍟查柟鍑ゆ嫹?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ鐐电磽娴ｇ晫鍫柛濠冩礋濠�渚�姊虹紒妯忣亜螣婵犲洤纾块煫鍥ㄦ礈绾惧ジ鏌ｅ锟藉褔寮稿☉銏＄厸閻忕偠顕ф俊濂告煃閽樺妲搁摶锝呫�掑鐓庣仧缂佽鲸鎸搁埞鎴︽偐閹颁礁鏅遍梺鍝ュУ缁嬫垿鍩㈠澶婂嵆闁靛繒濮烽悿鍕⒑闂堟侗鐒鹃柛搴㈢懇閹垽鎮℃惔锛勶拷顓烆渻閵堝棙鈷愰柛搴＄－閺侇噣宕稿Δ浣叉嫽婵炶揪缍�濞咃絿鏁☉銏＄厵缂佸顑欓悡濂告煙椤栨艾顏い銏＄洴閹瑩鎳犻懜鍨暫濠电姷鏁搁崑鐐哄垂閸洘鏅濋柍鍝勬噺閸嬪倿鏌曟径鍡樻珕闁绘挶鍎甸弻锝夊籍閸屾艾濡哄┑鐐叉噺濞叉粎妲愰幒妤婃晩闁兼祴鏅涢·锟界紓鍌欑劍椤ㄥ牓宕伴弽顓炴瀬闁规儳顕々鐑芥倵閿濆簼绨介柣锝呮惈閳规垿顢欑粵瀣吅闂佸綊顥撻崗姗�寮婚悢纰辨晩闁告繂瀚导鍫ユ倵鐟欏嫭绀冩い銊ワ躬楠炲﹪寮介鐐靛幐婵炶揪绲介幗婊堫敊閹烘梻纾介柛灞捐壘閿熺晫鍏橀幊妤呭醇閺囩偟锛涢梺鍦亾閸撴岸鎮㈤崱妯诲弿婵°倕顑嗙�氬綊鏌﹀Ο鑽ょ疄闁哄瞼鍠庨埢鎾诲垂椤旂晫褰查梻浣烘嚀閸㈡煡宕查弻銉稏婵犻潧顑嗛崐閿嬨亜閹虹偞瀚瑰銈呴獜閹凤拷
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

