
package fire.msp;

import java.util.HashSet;
import java.util.Set;

import fire.pb.scene.Scene;
import fire.pb.scene.SceneClient;
import fire.pb.scene.SceneManager;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GGetRolesByConditions__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GGetRolesByConditions extends __GGetRolesByConditions__ {
	@Override
	protected void process() {
		Set<Long> sendroleIds = new HashSet<Long>(); 
		int rolenum = 0;
		if(limitnum == -1)
			limitnum = Integer.MAX_VALUE;
		if(sceneid != -1)
		{//濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰▕閻掕姤绻涢崱妯诲碍閻熸瑱绠撻幃妤呮晲鎼粹剝鐏嶉梺鍝勬媼娴滎亜顫忕紒妯诲闁告稑锕ら弳鍫ユ煢閸愵喕鎲鹃柡宀嬬秮閸┾剝绻濋崒婊�妗撻梻浣虹帛娓氭宕抽敐澶屽祦闁搞儺鍓﹂弫鍥煟閹邦喗鏆╅柣娑卞枛閳规垿鎮╅崹顐ｆ瘎婵犳鍠楅幐鍐茬暦椤栨稑顕遍悗娑櫭崜顓熺節閻㈤潧校缁炬澘绉归崺娑㈠箣閿旂晫鍘卞┑鐘绘涧濡顢旈鍕ㄦ斀妞ゆ牗鍝庨崑銏ゆ煛鐏炲墽娲村┑鈩冩倐閺佸啴鏁撴禒瀣厺闁哄洨濯撮幏椋庢喆閸曨剛顦ㄩ柣銏╁灙閸撴繃绌辨繝鍥х濞达綀鍊介妸锔轰簻闁哄倸鐏濋幃鎴炪亜閹垮嫭瀚�?
			Scene scene = SceneManager.getInstance().getSceneByID(sceneid);
			if (scene == null)
			{
				SceneManager.logger.error("GGetRolesByConditions:sceneid error[" + sceneid + "]");
				return;
			}
			
			for(Role role : scene.getSceneRoles().values())
			{
				if(schoolid != -1 && role.getSchoolId() != schoolid)
					continue;
				if(minlevel != -1 && role.getLevel() < minlevel)
					continue;
				if(maxlevel != -1 && role.getLevel() > maxlevel)
					continue;
				sendroleIds.add(role.getRoleID());
				rolenum++;
				if(rolenum >= limitnum)
					break;
			}
		}
		else if(schoolid != -1)
		{//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔顕�鏁撻弬銈囩暤鐎规洖銈告俊椋庯拷锝庝簼閸犳ɑ淇婇銏犳殭闂囧鏌ц箛锝呬簽婵炴彃鐡ㄩ妵鍕閳藉棙鐤侀梺杞扮劍閹瑰洭骞冮崜褌娌柦妯侯槺閺屟囨⒒閸屾艾锟介绮堟笟锟介獮澶愭晸閻樿尙顔囬梺绯曞墲缁嬫垹绮堥崘顔界厪濠电偛鐏濋敓鑺ョ墵瀹曟澘顫濋懜纰樻嫼闁荤姴娲ゅ鍫曞箲閿濆棎浜滈柨婵嗛濞呭秵顨ラ悙鑼闁轰焦鎹囬弫鎾绘晸閿燂拷?
			Set<Long> schoolroles = RoleManager.getInstance().getSchoolRoles(schoolid);
			for(long sroleId :  schoolroles)
			{
				Role role = RoleManager.getInstance().getRoleByID(sroleId);
				if(minlevel != -1 && role.getLevel() < minlevel)
					continue;
				if(maxlevel != -1 && role.getLevel() > maxlevel)
					continue;
				sendroleIds.add(sroleId);
				rolenum++;
				if(rolenum >= limitnum)
					break;
			}
		}
		else
		{//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣稿閸嬩線宕曟潏鈺冪焼濠㈣埖鍔栭悡娆撴倵閻㈡鐒惧ù鐘欏嫨浜滈柍鍝勫�婚崣锟介梺鍝勬湰閻╊垶銆侀弴銏℃櫜闁糕剝鐟Σ顒勬⒒娴ｄ警鐒鹃悶姘煎亰瀹曟繈骞嬮敃锟介拑鐔哥箾閹存瑥鐏╅柣鎺撴そ閺屾盯骞囬妸锔界彇濠电偛鐗勯崐妤冩閹惧瓨濯撮柛婵嗗珔閿濆鐓熸俊銈勭贰濞堟﹢鏌熼獮鍨仼闁宠鍨垮畷鍫曞煛閸愭儳鏅梻鍌欑婢瑰﹪鎮￠崼銉ラ棷妞ゆ牜鍋涚粻顖滐拷鐟板鐎氬牓寮崼婵嗙獩濡炪倖妫冨Λ鍨ｉ幇鐗堚拻濞达絿鍎ら崵锟藉銈嗘处閸樹粙骞堥妸銉ф殝闁归攱姊归惄顖炲极閹剧粯鏅搁柨鐕傛嫹?
			for(Role role : RoleManager.getInstance().getRoles().values())
			{
				if(minlevel != -1 && role.getLevel() < minlevel)
					continue;
				if(maxlevel != -1 && role.getLevel() > maxlevel)
					continue;
				sendroleIds.add(role.getRoleID());
				rolenum++;
				if(rolenum >= limitnum)
					break;
			}
		}
		
		MGetRolesByConditions snd = new MGetRolesByConditions();
		snd.callbackid = callbackid;
		snd.roleids.addAll(sendroleIds);
		SceneClient.pSend(snd);
	}
	
//	public static void getRolesByConditions(int schoolId, int minlevel, int maxlevel, long sceneId, int limitnum, IGetRolesCallBack callback) 
//	{
//		if(Transaction.current() != null)
//			new PGetRolesByConditions(schoolId, minlevel, maxlevel, sceneId, limitnum, callback).call();
//		else
//			new PGetRolesByConditions(schoolId, minlevel, maxlevel, sceneId, limitnum, callback).submit();
//	}
//	
//	static class PGetRolesByConditions extends xdb.Procedure
//	{
//		private IGetRolesCallBack callback2; // 闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�哥粻鏍煕椤愶絾绀�缁炬儳娼￠弻鐔煎箚閻楀牜妫勭紒鐐劤椤兘寮婚敐鍛傜喖鎳栭埡浣侯偧闂備胶顭堟鍝ョ矓瑜版帒钃熼柨婵嗩槸缁狅綁鏌ｅΟ鎸庣彧婵炲牞鎷�
//		private int schoolid2; // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻娑㈩敃閿濆棛顦ョ紓渚婃嫹濠㈣泛鐭夐幏鐑界嵁閸喖濮庨梺璇″灡閹稿骞嗛弮鍫澪╅柨鏇嫹闁告挸婀辩槐鎾存媴閸撴彃鍓梺绋匡攻缁诲倿锝炶箛鎾佹椽顢旈崟顓у敹闂佺澹堥幓顏嗗緤閸濆嫀锝夊醇閵夛腹鎷洪梺绋跨箰閸氬濡甸悢鍏肩厱闁靛鍎抽崺锝呪攽閳╁啯灏︾�规洏鍔戦弻鍥晜鐟欙絾鐎搁梻浣筋嚙鐎涒晠顢欓弽顓炵獥婵ê鐏堥敓鏂ょ畵瀹曞ジ濡烽～顔藉闁挎洖鍊告儫闂佸疇妗ㄩ懗鍫曀囬弶娆炬富闁靛牆妫楃粭鎺楁煥閺囥劋閭柟顔芥緲椤劑宕奸悢鍙夊闂備胶顭堥張顒勬嚌妤ｅ啯鏅搁柦妯侯槹閹叉悂鏌ㄩ悢璇残撻柛鎴濈秺瀹曪綁宕橀妸褎娈惧┑鐘绘涧椤戝懘宕￠幎鑺ョ厪闊洦娲栨牎濠碘�虫▕閸撴瑩鍩為幋鐐茬疇闂佺锕ラ幑鍥箠濡ゅ懎绀堝ù锝堟〃缁楀姊虹捄銊ユ珢闁瑰嚖鎷�?-1
//		private int minlevel2; // 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾叉閻掑﹪鏌曟繛鐐珔缂佺媭鍨堕弻銊╂偆閸屾稑顏�?闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘骞戦姀銈呯疀妞ゆ棁妫勬惔濠囨⒑瑜版帒浜伴柛鐘愁殔閻ｇ兘寮婚妷锔惧幍闂佺粯鍨堕敃鈺佲枔閺囥垺鐓曢悗锝冨妼閿熻姤绻堝濠氭偄閻氬瓨瀚归柣銏☆問閻掗箖宕粙搴撴斀闁宠棄妫楁禍浠嬫煕閵婏箑鈻曟鐐差槺缁瑦鎯旈幘瀛樻澑闂備礁澹婇崑鍡涘闯閵夈儺鐒介柣鏂跨殱閺�浠嬫煟濡偐甯涙繛鎳峰嫮绠鹃悹鍥囧懏鍋ч梺鐟扮畭閸ㄨ棄鐣烽崡鐐╂婵炲棙鍨甸獮鍫ユ⒑鐠囪尙绠抽柛瀣♁閺呰埖绂掔�ｎ�儵鏌熼悜妯烘闁荤喖鍋婇悡銉╁箹鏉堝墽纾垮ù鐘虫倐濮婃椽宕崟顓犲姽缂備胶绮换鍌炴偩瀹勯偊娼ㄩ柨鐔剁矙閵嗕線寮崼婵堫槹闂侀潧顭俊鍥晸閻ｅ苯顣肩紒缁樼箘閸犲﹥寰勫畝锟介敍鐔兼⒑缁嬫鍎愰柟鍛婃倐閳ユ棃宕橀钘夌檮婵犮垼娉涢張顒�鈻撻幆褉鏀芥い鏃傜摂閻掓儳顪冪�靛壊鐒鹃柣锝夋敱瀵板嫰骞囬鐘插箺婵犳鍠楅敃鈺呭礈閿曞倸鍚归柣鏃囨绾惧ジ鎮楅敐鍫濈厫閻庢熬鎷�-1
//		private int maxlevel2; // 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾叉閻掑﹪鏌曟繛鐐珔缂佺媭鍨堕弻銊╂偆閸屾稑顏�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿顦甸弻鏇＄疀鐎ｎ亷鎷烽弴鐑嗗晠婵犻潧娲㈡禍婊堟煛瀹ュ啫濡块柍鍙ョ窔閺屾稒鎯旈鑲╀化缂備浇椴搁幑鍥х暦閹烘垟鏋庨柟鐑樺灥鐢垶姊虹拠鎻掝劉闁肩懓澧介幑銏ゅ箛闁附鏅ｆ繝闈涘�婚…鍫ユ倷婵犲洦鐓冮柛婵嗗閺�濠氬疮缁嬪簱鏀介柣妯虹仛閺嗏晛鈹戦鎯у幋闁靛棗鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告创闁诡垰鐗撳畷鐔碱敍濞戞帗瀚肩紓鍌氬�烽悞锕傛晝閳哄懏鍊块柣锝呯灱绾惧吋銇勯弴鐐村櫣闁诲骏闄勯妵鍕閳╁啫纰嶉梺瀹狀嚙闁帮綁鐛Ο纭锋嫹閻㈡鐒炬鐐茬墦濮婄粯鎷呴崨濠呯闂佺绨洪崐鏇犲弲濠碘槅鍨伴崥瀣礂濠婂吘鏃堟晲閸涱厽娈查梺缁樻尪閸庤尙鎹㈠┑瀣瀭妞ゆ劧绲介棄宥夋煟鎼淬垻鍟查柟鍑ゆ嫹-1
//		private long sceneid2; // 闂傚倸鍊搁崐鎼佸磹妞嬪孩顐芥慨姗嗗墻閻掔晫绱撴担濮戣偐鎹㈤崱娑欑厱闁靛鍠栨晶顔剧棯閹勫仴闁哄本娲熷畷鐓庘攽閸パ勭彺闂備礁鎼鍛矓閻㈢绠為柕濞垮剻閺冿拷缁绘繈宕橀鍡樻闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏃�鎷濋幏椋庣箔濞戞ɑ鍣介柣顓熺懇閺岀喐娼忔ィ鍐╊�嶉梺鎼炲�栭崝鏍Φ閸曨垰鍐�妞ゆ劦婢�閺夘參姊虹捄銊ユ灆婵☆偄瀚伴獮濠囧箻閸戞澘娲畷鐑筋敇閵婏箑顏跺┑鐐茬墕閻忔繈寮搁妶鍡愪簻妞ゆ挾鍋熸晶锕傛煃閵夘垳鐣靛┑鈩冩倐閸┾剝鎷呮笟顖浶у┑锛勫亼閸婃牜鏁幒妤佹櫇妞ゅ繐鐗婇崑妯荤節婵犲倻澧涢柍閿嬪浮閺屾稓浠﹂幑鎰棟闂佽法鍠曞Λ鍕箺濠婂牊鏅搁柤鎭掑劚閸ゎ剟鏌涘▎蹇撴殭闁伙絽鍢查埞鎴狅拷锝庝簻瀹撳棝姊洪棃娑氱濠殿噣娼у嵄妞ゆ帪鎷烽柍瑙勫灦楠炲﹪鏌涙繝鍐╁磳闁硅櫕顨婂畷婊勬媴鏉炴壆鐟濋梻浣芥硶閸ｏ箓骞忛敓锟�?-1
//		private int limitnum2; // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌涘┑鍕姷闁瑰嘲鍢查～婵嬫偂鎼达紕鐫勯柣搴ゎ潐濞叉鎹㈤崼婵愬殨闁圭虎鍠栭～鍛存煟濡寧鐝悮锝呪攽閻樿尙妫勯柡澶婂皡閹风兘骞樼紒妯烘畱闂佸壊鍋呭ú鏍偂濠靛鐓涢柛鎰鐎氬綊姊洪棃娑欐悙閻庢凹鍨崇划璇测槈閵忕姷顔掗梺鍝勵槹閸ㄥ爼顢旈埄鍐瘈闁汇垽娼ф禒婊堟煟濡わ拷濡繈骞冮妷锔鹃檮缂佸鍎婚幗鏇㈡⒑闂堟侗鐒鹃柛搴枛鍗遍柛顐ゅ枍缁诲棙銇勯弽銊х煂閻㈩垱鐩弻鐔风暋閺夎儻鍩為梺瀹狀潐閸ㄥ潡宕洪妷鈺佸耿婵＄偛澧介幐澶愭⒒娴ｄ警鐒鹃柨鏇樺劤閹广垽宕掗悜鍥╃◤闂婎偄娲﹀濠氥�呴悜鑺ュ�甸柨婵嗙凹缁ㄤ粙鏌ｉ妶蹇斿婵犵绱曢崑鎴﹀磹閺嶎偅鏆滄い蹇撶墕缁狀垶鏌ｉ幋锝呅撻柣鎾跺枛閺岀喖鎮欓浣虹▏闂佽绻堥崕鐢稿蓟瀹ュ洦鍠嗛柛鏇ㄥ亞娴煎矂姊烘潪鎵妽闁圭懓娲顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷?-1
//		public PGetRolesByConditions(int schoolid, int minlevel, int maxlevel, long sceneid, int limitnum, IGetRolesCallBack callback)
//		{
//			this.callback2 = callback;
//			this.schoolid2 = schoolid;
//			this.minlevel2 = minlevel;
//			this.maxlevel2 = maxlevel;
//			this.sceneid2 = sceneid;
//			this.limitnum2 = limitnum;
//		}
//		@Override
//		protected boolean process()
//		{
//			if(callback2 == null)
//				return true;
//			xbean.GetRolesCallBackInst callbackbean = xbean.Pod.newGetRolesCallBackInst();
//			callbackbean.setCallback(callback2);
//			long callbackId =  xtable.Getrolescallback.insert(callbackbean);
//			GGetRolesByConditions getroles = new GGetRolesByConditions(callbackId, schoolid2, minlevel2, maxlevel2, sceneid2, limitnum2);
//			GsClient.sendToScene(getroles);
//			return true;
//		}
//		
//	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 720907;

	public int getType() {
		return 720907;
	}

	public long callbackid; // 回调Id
	public int schoolid; // 门派ID，如果无限制填-1
	public int minlevel; // 最小等级，如果无限制填-1
	public int maxlevel; // 最大等级，如果无限制填-1
	public long sceneid; // 场景ID，如果无限制填-1
	public int limitnum; // 限制个数，无限制填-1

	public GGetRolesByConditions() {
	}

	public GGetRolesByConditions(long _callbackid_, int _schoolid_, int _minlevel_, int _maxlevel_, long _sceneid_, int _limitnum_) {
		this.callbackid = _callbackid_;
		this.schoolid = _schoolid_;
		this.minlevel = _minlevel_;
		this.maxlevel = _maxlevel_;
		this.sceneid = _sceneid_;
		this.limitnum = _limitnum_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(callbackid);
		_os_.marshal(schoolid);
		_os_.marshal(minlevel);
		_os_.marshal(maxlevel);
		_os_.marshal(sceneid);
		_os_.marshal(limitnum);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		callbackid = _os_.unmarshal_long();
		schoolid = _os_.unmarshal_int();
		minlevel = _os_.unmarshal_int();
		maxlevel = _os_.unmarshal_int();
		sceneid = _os_.unmarshal_long();
		limitnum = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GGetRolesByConditions) {
			GGetRolesByConditions _o_ = (GGetRolesByConditions)_o1_;
			if (callbackid != _o_.callbackid) return false;
			if (schoolid != _o_.schoolid) return false;
			if (minlevel != _o_.minlevel) return false;
			if (maxlevel != _o_.maxlevel) return false;
			if (sceneid != _o_.sceneid) return false;
			if (limitnum != _o_.limitnum) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)callbackid;
		_h_ += schoolid;
		_h_ += minlevel;
		_h_ += maxlevel;
		_h_ += (int)sceneid;
		_h_ += limitnum;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(callbackid).append(",");
		_sb_.append(schoolid).append(",");
		_sb_.append(minlevel).append(",");
		_sb_.append(maxlevel).append(",");
		_sb_.append(sceneid).append(",");
		_sb_.append(limitnum).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GGetRolesByConditions _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(callbackid - _o_.callbackid);
		if (0 != _c_) return _c_;
		_c_ = schoolid - _o_.schoolid;
		if (0 != _c_) return _c_;
		_c_ = minlevel - _o_.minlevel;
		if (0 != _c_) return _c_;
		_c_ = maxlevel - _o_.maxlevel;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(sceneid - _o_.sceneid);
		if (0 != _c_) return _c_;
		_c_ = limitnum - _o_.limitnum;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

