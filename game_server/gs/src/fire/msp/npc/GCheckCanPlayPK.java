
package fire.msp.npc;
import fire.pb.battle.PPlayPKFightView;
import fire.pb.scene.SceneClient;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;
import fire.pb.scene.sPos.GridPos;
import fire.pb.talk.MessageMgr;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GCheckCanPlayPK__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GCheckCanPlayPK extends __GCheckCanPlayPK__ {
	@Override
	protected void process() {
		Role hostRole = RoleManager.getInstance().getRoleByID(hostid);
		Role gestRole = RoleManager.getInstance().getRoleByID(guestid);
		GridPos hostGridPos = hostRole.getPos().toGridPos();
		GridPos guestGridPos = gestRole.getPos().toGridPos();
		
		//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鐓熼幖鎼灣缁夌敻鏌涜箛鏃撹�跨�殿喗鎮傚浠嬵敇閻斿嚖鎷烽崹顐闁绘劘灏欐禒銏ゆ煕閺冿拷绾板秵绌辨繝鍥舵晝闁挎繂娲﹂崳顕�姊洪懡銈呮殌闁搞儯鍔夐幏缁樼箾閹惧鍟查柟鐑芥敱缁绘盯鎳濋弶鍨優闂佺懓鍢茬紞濠囧箖閵忋倖鍋傞幖杈剧秵濡茬兘鏌ｆ惔锝嗩仧闁归鍏橀弻娑㈠即閵娿儰绨婚梺璇插瘨閸欏啫螞閸涙惌鏁冮柕蹇婏拷鎰佹П婵犵數鍋涘鍫曟偋閻樼儤锛傛繝娈垮枟椤牓宕洪弽顓炵９闁汇垹鎲￠悡銉︾節闂堟稒顥犻柛鎴濇贡缁辨帡濡搁妷锝呬划闂佸搫鏈惄顖氼嚕閹绢喖顫呴柕蹇嬪灪濮ｅ洭姊绘担鍛婃儓闁哄牜鍓熼幆鍕敍濞戞绠氶梺缁樺灱濡嫬鏁梻渚�娼чˇ顓㈠垂閾忕櫢鎷烽崹顐ゅ缂佺粯绻堥幃浠嬫濞戞鎹曢梻浣虹帛椤ㄥ懘鏁冮鍕殾鐟滅増甯掗柨銈嗕繆閵堝繑瀚归梺鍝勵儎閼冲爼鏁撻挊澶岀暛闁稿酣浜堕獮濠囧箛閺夋寧杈堥梺绯曞墲缁嬫帡鎮￠弴銏＄厸闁搞儯鍎辨俊濂告煕濡儤鎲哥紒杈ㄥ浮椤㈡岸宕ㄩ鐘辨闂備礁鎼惌澶岀礊娓氾拷楠炲啴濮�閵堝懎绐涙繝鐢靛Т鐎氬摜妲愭潏鈺冪＝闁稿本鐟х粵蹇涙煙瀹勬澘妲婚柕鍡樺笒椤繈鎮欓锟介鍫曟煟鎼淬値娼愭繛鍙夌箞閿濈偞寰勫畝锟介惌澶愭煙閻戞ɑ顥栭柟椋庡厴閺佹劖鎯斿┑鍫濆毈婵＄偑鍊戦崕鑼崲閸岀偐锟芥棃宕橀鍢壯囨煕閳╁厾顏堝汲濡ゅ懏鈷戦柛婵勫劚鏍￠梺鍛婃⒐椤ㄥ﹪骞冮悿顖ｆ▌濠殿喖锕︾划顖炲箯閸涙潙宸濆┑鐘插�瑰▓姗�姊绘担铏瑰笡婵☆偄绻樺畷婊堟偄婵傚缍庢繛瀵稿Т椤戝懐绮堢�ｎ偁浜滈柟閭﹀墻閸庢粎绱撳鍕獢闁绘侗鍣ｅ浠嬪Ω閿曪拷椤庢挸鈹戦鐣岀畵闁活偅顨婂鎾閿涘嫬骞楅梻濠庡亜濞诧箑煤閺嶃劎顩风憸鏃堝蓟閿熺姴妞藉ù锝夋櫜缁ㄨ顪冮妶搴″箹婵炲眰鍊濋幃鎯р攽鐎ｎ亞顦板銈嗗笒閸婄顕ｉ搹顐ょ瘈闁汇垽娼ф禒锕傛煕閵娿儳鍩ｉ柍銉畵瀹曞ジ锝為钘夘伓濠殿喗锚瀹曨剟銆傛總鍛婄厪闁搞儜鍐句純闂佺硶鏅濋崑銈夈�佸锟介幃娆戯拷娑櫳戦崐鐑芥⒒娴ｅ憡鍟為柛銊潐閹便劑鎮介崹顐㈠簥濠电娀娼уú銊у姬閿熶粙姊虹粙鎸庢拱缁炬澘绉撮埢鎾诲蓟閵夛腹鎷绘繝鐢靛Т妤犲憡鏅舵繝姘厱闁规崘娉涢弸娑氾拷娈垮枦椤曆囧煡婢舵劕顫呴柣妯活問閸炴椽姊绘担鐑樺殌妞ゆ洦鍙冨畷鎴濃槈濮樿京骞撳┑鐐村灦閿曗晛銆掓繝姘厪闁割偅绻傞弳娆撴煕閺冿拷缁捇寮诲☉銏犵睄闁跨喍绮欓幃鐑藉Ψ閳哄倸浠奸梺缁樺灱婵倝宕愭繝姘參婵☆垯璀﹀Σ鍝勎旈悩鍙夊枠婵﹥妞藉畷鐑筋敇瑜忛崝绋库攽閻愬樊鍤熼柛蹇旓耿婵℃挳宕ㄩ幖顓熸櫍闂侀潧楠忕槐鏇㈠储娴犲顥婃い鎰╁灪婢跺嫰鏌熺粙鍨挃缂侇喖顭烽獮宥夘敋閸℃ê顏堕柣鐔哥懃鐎氼厽寰勯崟顖涚厱闁规崘娉涢弸搴ㄦ煟閿濆妫戦柟鍙夋尦瀹曠喖顢樿缁侇偊姊虹拠鎻掑毐缂傚秴妫欑粋宥呪攽鐎ｅ骸顦埞鎴﹀幢閳哄倸鐦滈梻渚�娼ч悧鍡椢涘▎鎾崇畾闁割偁鍨荤壕濂稿级閸稑濡界紒锟界�ｎ喗鐓欐い鏃囶嚙瀹撳棝鏌涢埡瀣瘈鐎规洘锕㈤、鏃堝幢椤撶姴绨ラ梻鍌氬�峰ù鍥р枖閺囥垹闂柨鏇炲�哥粻顖炴煥閻曞倹瀚�?//濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚埄鍐ㄧ窞閻庯綆浜為崢鎰版⒑閼测晛顣奸悗绗涘洤桅闁告洦鍠氶悿锟介梺瑙勫礃濞夋盯銆傞搹鍦＝濞达絽鎼瓭闂侀潧鐗婇幃鍌氼嚕鐠囨祴妲堟慨姗嗗亝閸曞啴姊虹涵鍜佹綈闁告梹娲熻棢婵犻潧顑嗛埛鎺懨归敐鍛Щ鐎规挸妫楅湁婵犲﹤鍟伴崺锝囷拷娈垮枛椤攱淇婇幖浣肝ㄩ柕蹇婃濞兼梹绻濈喊妯活潑闁搞劋鍗抽幃妯衡攽鐎ｅ灚鏅滃銈嗘尪閸ㄦ椽鍩涢幋锔界厵闁兼祴鏅涙禒婊冣攽闄囧▍锝囨閹烘鏁婇柣锝呮湰閸Ｑ冾渻閵堝棙绌跨紓宥勭窔閵嗕礁螖閸涱厾顦伴梺鍓茬厛閸嬪懎鈻嶅澶嬧拻濞达綀娅ｇ敮娑欐叏婵犲倻绉虹�规洘绻堝畷銊э拷娑櫳戝▍鍥⒑缁嬫寧婀扮紒瀣灦缁傛帡顢涢悙绮规嫼缂傚倷鐒﹂敋闁诲骏闄勯妵鍕敇閻愭潙绐涚紓渚囧枦椤曆嗙亽濠殿喚鎳撳ú锝囪姳鐠囧樊娓婚柕鍫濇闁叉粓鏌熼悜鑺ユ暠缂佺粯绋戦蹇涱敊閻撳海鐫勯柣搴㈩問閸ｎ噣宕戦崟顖ｆ晣濠靛倻顭堝婵囥亜閺嶃劎鈾侀柣锝囧厴濮婄粯鎷呴崨濠傛殘闂佸憡妫戦梽鍕矉瀹ュ鍊峰〒姘煎灡閺呪晠姊鸿ぐ鎺戜喊闁告ê澧界划缁樸偅閸愨晝鍘甸柣搴ｆ暩椤牊绂掗敃鍌涚厵妞ゆ牗鑹鹃鈺呮婢跺绡�濠电姴鍊搁顐︽煟椤撶儑韬柡灞诲姂瀵潙螣閾忛�涚礄婵＄偑鍊戦崹鍝勎涢崘銊ф殾闁绘挸绨堕弨浠嬫煕椤愵偄浜濋懖鏍⒒娴ｇ瓔鍤欏Δ鐘叉憸缁顓兼径濠勶紵闂備緡鍓欓崡鏇㈠炊椤掞拷缁狙勭箾閸℃瑥浜剧紒鍌氭濮婃椽妫冨ù銈嗙☉椤撳ジ宕卞Δ濠佺处闂備浇宕甸崰鎰版偡閵壯嶆嫹濮樼厧娅嶆鐐搭殜瀹曟﹢顢欓挊澶涙嫹閸洜鍙撻柛銉ｅ妽閳锋帡鏌熼崘鍙夊殗闁哄本鐩獮鎺楀箻閾忣偉鐧侀梻浣芥〃閻掞箓骞戦崶顒�绠栭柍鍝勬噺閸ゆ垶銇勯幒鎴Ч鐎涙繈姊婚崒姘拷椋庢濮橆剦鐒界憸鏃堝箖瑜斿畷鍗烆渻閵忥紕鈽夐柍璇查叄楠炴﹢寮堕幋顖涘闁割煈鍟旇ぐ鎺撳亹鐎瑰壊鍠栭崜鎵磽娴ｅ搫鐝￠柛銉ｅ妿閸樻捇鏌℃径灞戒沪濠㈢懓妫濆畷婵嗩吋婢跺鍘藉銈嗘尵閸ｃ儱鈻撳Ο鑲╃＜閺夊牄鍔屽ù顕�鏌嶉妷顖滅暤妤犵偞甯″顕�宕掑鍕垫綋闂傚倸鍊峰ù鍥ь浖閵娧呯焼濞达綀娅ｉ惌鎾绘煙缂併垹鏋熼柛瀣ф櫆缁绘繈妫冨☉鍗炲壈缂備緤鎷烽柛鎰ㄦ杺娴滄粓鐓崶銊﹀鞍闁挎稑绉归弻娑㈡偄闁垮鏋犲┑顔硷工椤嘲鐣烽幒鎴旀瀻闁瑰瓨绻傞‖澶愭煟閻斿摜鐭嬫繝銏★耿瀹曨垶骞橀鑲╃枃闂佺粯姊婚埛鍫ュ极瀹ュ棙鍙忔俊顖氭惈閹垿鏌涘鍥ㄦ毈婵﹥妞藉Λ鍐ㄢ槈鏉堚晛褰嬪┑鐘殿暯閿熷�熸珪閸犳﹢鏌涢埞鍨伈鐎殿噮鍣ｅ畷鎺楁晜閽樺浼撴俊銈囧Х閸嬫盯鎮樺┑瀣婵﹩鍘规禍婊堟煥閺冿拷閸庢娊銆傞懖鈺冪＜闁稿本绋戠粭鎺撱亜椤愶絿鐭掗柡浣规尰缁傛帞锟斤綆浜為悾娲⒑缂佹ê鐏辨俊顐㈠瀹曪繝鎼归锝呭伎濠殿喗顨愰幏椋庣棯椤撶媭鐒鹃崡杈ㄣ亜閺冨倵鎷℃繛鎾愁煼閺屾洟宕煎┑鍫㈩啈闂佸憡鑹鹃崐鍧楀蓟閿熺姴宸濇い鏍ㄥ焹閺嬪懎螖閻橀潧浠滈柛鐔告綑閻ｉ攱绺界粙鍨祮闂佺粯鍔樼亸顏堟晸閽樺鍋ユ慨濠冩そ瀹曨偊宕熼锟界粣娑欑節濞堝灝鏋熼柟绋垮暱椤曪綁寮婚妷锔芥闂佽法鍣﹂幏锟�
		if (hostRole.getScene().getMapInfo().getBlockInfo().checkCanQiecuo(hostGridPos.getX(), hostGridPos.getY())
				&&gestRole.getScene().getMapInfo().getBlockInfo().checkCanQiecuo(guestGridPos.getX(), guestGridPos.getY())) {
			//闂傚倸鍊搁崐鎼佸磹妞嬪孩顐芥慨姗嗗墻閻掍粙鏌ゆ慨鎰拷鏍拷姘煼閺岋綁寮崒姘粯缂備緤鎷峰璺虹焿閹风兘鐛崹顔煎濡炪倧瀵岄崹宕囧垝閺勫繈浜归柟鐑樻尵閸橆亝绻濋悽闈涗户闁稿鎸搁埢宥夊川鐎涙鍘藉銈嗘尪閸斿秶锟芥熬鎷�?
			if (!(hostRole.getScene().getMapID() == PPlayPKFightView.CQMAPID && gestRole.getScene().getMapID() == PPlayPKFightView.CQMAPID)){
				MessageMgr.sendMsgNotify(hostid, 120063, null);
				return ;
			}
			Team team = TeamManager.selectTeamByRoleId(hostid);
			if (team!=null){
				if(team.isInTeam(guestid)){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 141389, null);
					return;
				}
			}
		}
		SceneClient.pSend(new MCheckCanPlayPK(hostid, guestid));
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730413;

	public int getType() {
		return 730413;
	}

	public long hostid;
	public long guestid;
	public int checklevel;

	public GCheckCanPlayPK() {
	}

	public GCheckCanPlayPK(long _hostid_, long _guestid_, int _checklevel_) {
		this.hostid = _hostid_;
		this.guestid = _guestid_;
		this.checklevel = _checklevel_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(hostid);
		_os_.marshal(guestid);
		_os_.marshal(checklevel);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		hostid = _os_.unmarshal_long();
		guestid = _os_.unmarshal_long();
		checklevel = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GCheckCanPlayPK) {
			GCheckCanPlayPK _o_ = (GCheckCanPlayPK)_o1_;
			if (hostid != _o_.hostid) return false;
			if (guestid != _o_.guestid) return false;
			if (checklevel != _o_.checklevel) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)hostid;
		_h_ += (int)guestid;
		_h_ += checklevel;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(hostid).append(",");
		_sb_.append(guestid).append(",");
		_sb_.append(checklevel).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GCheckCanPlayPK _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(hostid - _o_.hostid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(guestid - _o_.guestid);
		if (0 != _c_) return _c_;
		_c_ = checklevel - _o_.checklevel;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

