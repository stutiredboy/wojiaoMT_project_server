
package fire.pb;
import java.util.Properties;

import gnet.link.Dispatch;
import gnet.link.Kick;
import gnet.link.Onlines;
import mkdb.util.UniqName;
import fire.log.Module;
import fire.pb.main.ConfigManager;
import fire.pb.state.StateManager;

import com.locojoy.base.Octets;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRoleList__ extends mkio.Protocol { }

/** 客户端发给服务器，请求已有角色列表
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRoleList extends __CRoleList__ {
	@Override
	protected void process() {
		
		final int userID = ((Dispatch)this.getContext()).userid;
		if(userID == -1){
			kickUser(-1000);
			 mkdb.Trace.info("CRoleList====userid = -1  闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻缁炬儳顑愰崬褰掓⒑鐠恒劌鏋戦柡瀣吹缁骞樺Ч鍥锋嫹娴ｈ倽鏃�鎷呴悷閭︼拷鎾寸箾閹炬潙鍤柛銊╀憾閺屻劑濡堕崱娆戠槇閻庡吀鍗抽弨鍗烆熆濮楋拷閺佹捇鎳為妷锔绢槹濡ょ姷鍋涢敃銉╁箚閺冨牆惟闁靛鍎抽敓绛嬪弮濮婅櫣绮欑捄銊т紘闂佺顑囬崑銈夊箖閿熺姵鏅插璺鸿嫰瑜板嫰姊洪幖鐐插姌闁告柨鐭傚畷鐢割敆娴ｈ櫣顔曢梺绋跨箳閸樠勬叏瀹ュ鐓涚�癸拷鐎ｎ剛鐦堥悗瑙勬礀瀹曨剝鐏掗梺鍏肩ゴ閺呮繈宕㈠鍫熲拻濞达絽鎲￠幆鍫ユ偠濮樼厧浜扮�规洘绻堥獮瀣晝閿熺晫绮婚弽顓熺厪闁割偅绻嶅Σ鍝ョ棯閹冩倯缂佺粯鐩獮瀣倻閸ワ妇杩斿┑鐐差嚟閵嗗骞忛敓锟�  =============");
			return;
		}
		StateManager.logger.info(new StringBuilder("userID=").append(userID).append(" CRoleList"));
		
		fire.pb.main.ConfigManager manager = fire.pb.main.ConfigManager.getInstance();
		if (manager.isNeedActive()) {
			if (!checkUserAccount(userID)) {
				SUserNeedActive sUserNeedActive = new SUserNeedActive((byte) 0);
				Onlines.getInstance().sendResponse(this, sUserNeedActive);	
				return;
			}
		}
		if(manager.getLoginLimitType() != Module.LIMIT_NORMAL_MODE && manager.getUserIDList().size() != 0){
			if(manager.getLoginLimitType() == Module.LIMIT_BLACLIST_MODE){
				if(manager.getUserIDList().contains(userID)){
					Onlines.getInstance().sendResponse(this, new SCreateRoleError(manager.getErrorType()));	
					return;
				}
			}else if(manager.getLoginLimitType() == Module.LIMIT_WHITELIST_MODE){
				if(!manager.getUserIDList().contains(userID)){
					Onlines.getInstance().sendResponse(this, new SCreateRoleError(manager.getErrorType()));	
					return;
				}
			}
		}
		
		long curTime = System.currentTimeMillis();
		xbean.UserPunish userPunish = xtable.Userpunish.select(userID);
		if (userPunish!=null){
			if (curTime<userPunish.getReleasetime()){
				if (!userPunish.getRecords().isEmpty()) {
					try {
						String reason = userPunish.getRecords().get(userPunish.getRecords().size()-1).getReason();
						long endtime = userPunish.getReleasetime();
						Onlines.getInstance().sendResponse(this, new SGACDKickoutMsg(reason, endtime));
					} catch (Exception e) {
						Module.logger.error("send kickoutmsg error", e);
					}
				}
			//	Onlines.getInstance().kick(roleid, -1000);
				kickUser(-1000);
				//p1.send(this.getConnection());
				return;
			}
		}
		
		Integer blisgm = xtable.Auuserinfo.selectBlisgm(userID);
		boolean isGm = false;
		if (blisgm!=null&&(blisgm==1||blisgm==2)) 
			isGm = true;
		Onlines.getInstance().getConnectedUsers().online(this,isGm);
		Properties prop = ConfigManager.getInstance().getPropConf("sys");
		String value = prop.getProperty("sys.apps.cheat");
		fire.pb.SNotifyShieldState sNotifyShieldState = new SNotifyShieldState((byte) 0);
		if (value!=null&&value.equals("0")){
			sNotifyShieldState.state = 1;
		}
		Onlines.getInstance().sendResponse(this, sNotifyShieldState);	
	}
	
	private boolean checkUserAccount(int userID) {
		if (UniqName.exist("activeuser", String.valueOf(userID))!= UniqName.RPC_NOT_EXISTS) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊炲銈嗗笒椤︿即寮查鍫熷仭婵犲﹤鍟扮粻濠氭煛娴ｈ宕岄柟宕囧仱婵＄柉顦柡瀣濮婃椽宕崟顒�娅ょ紓浣筋嚙鐎氭澘鐣峰璺虹闁瑰瓨姊归悗濠氭⒑鐟欏嫬鍔ょ痪缁㈠弮椤㈡瑦绻濋崒妤佹杸闁圭儤濞婂畷鎰板箻缂佹ê锟藉潡鏌ㄩ弴顏呭闂佸疇顕х粔鐟邦嚕椤掍焦鍎熼柟鎯х摠閺夋悂姊绘担铏瑰笡闁挎岸鏌ｈ箛鏂垮摵鐎殿喗濞婇崺鈩冩媴閸欏鏉告俊鐐�栭悧妤冪矙閹烘柧鐒婇柨鏃傜摂濞堜粙鏌ｉ幇顖氱毢缂佺姴顭烽弻锛勪沪鐠囨彃顬嬮梺璺ㄥ枑閺嬭崵寰婃繝姘閻庯綆鍓濇慨鍐测攽閻樺磭顣叉い銉ワ攻閵囧嫰骞囬埡浣轰痪婵犮垼娉涚�氫即寮婚悢铏圭煓婵炲棗澧介崥瀣煢濡厧鏋涢柡宀嬬秮楠炲洭顢欓悡搴☆瀱闂備胶顭堥敃銈夋倶濮樿泛绠為柕濞垮労濞笺劑鏌涢埄鍐炬當缂佺姴缍婂娲川婵犲嫮鐣哄┑锛勫仒缁瑥顕ｆ繝姘亜缁炬媽椴搁弲鈺冪磽娴ｅ湱鈽夋い鎴濇閹箖宕奸弴鐔叉嫼闁诲骸婀辨慨鐢杆夋径瀣ㄤ簻闁挎棁顕ч悘锕傛煕閳瑰灝鐏╂い鎾冲悑瀵板嫮锟斤綆鍋勯崝鎺撲繆閻愵亜锟芥牠宕濋幋锕�鍨傜紓浣姑杈╋拷鐧告嫹闁告洦鍏橀幏娲⒑閸︻収鐒炬繛鎾棑缁顫滈敓浠嬪蓟濞戞熬鎷烽敐鍐ㄥ闁跨喕濮ゅú鐔笺�佸鑸垫櫜闁糕剝鐟ù鍕煟鎼搭垳鍒伴柣蹇斿哺瀵彃鈹戦崱鈺傚瘜闂侀潧鐗嗗Λ妤冪箔閸屾粎纾奸柨鐔诲Г缁楃喖鏁撴禒瀣拷渚�寮崼婵嬪敹闂佸搫娲ㄩ崰鎾诲储娴犲鈷戠紓浣股戦悡銉╂煙閼恒儳鐭掓鐐诧躬瀹曟﹢顢欓挊澶涙嫹閸偅鍙忔俊顖滃帶鐢埖绻涢崨顓犘ｆい銊ｅ劦閹瑩骞栭鐔烘澒闁诲氦顫夊ú姗�鏁冮姀銈冿拷浣糕枎閹炬潙鐧勬繝銏ｅ煐缁嬫帞锟芥艾缍婇弻娑㈩敃閿濆棛顦梺鍛婄懄閹瑰洭寮诲☉銏犖ㄩ柨婵嗘噹椤姊洪幎鑺ユ暠閻㈩垽绻濆濠氭偄閻撳海顦ㄩ梺鍛婄懃椤︻垰鈻撳Δ鍛拺闁告繂瀚﹢浼存煟閳哄﹤鐏﹂柣娑卞櫍楠炴帒螖閿熺晫绮绘繝姘叄闊浄绲芥禍顖炴煟瑜岀欢姘潖缂佹ɑ濯撮悷娆忓娴犫晠姊洪崨濠冣拹闁搞劌婀遍崚鎺撶節濮橆剙鍞ㄩ悷婊勭矒瀹曠敻寮撮悢缈犵盎闂佸湱鍎ら崹鐢割敂閳哄懎鑸规い鏍仦閳锋垿鏌熺粙鍨劉妞ゃ儱妫楅埞鎴︻敊閸濆嫸鎷烽弴鈶╋拷锕傚锤濡や焦娅㈤梺璺ㄥ櫐閹凤拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆ繛纭风節瀵鎮㈤崨濠勭Ф闂佸憡鎸嗛崨顔筋啅缂傚倸鍊烽懗鑸靛垔椤撱垹鍨傞柛顐ｆ礀閽冪喖鏌曟繛鐐珕闁稿妫濋弻娑氫沪閸撗�妲堝銈呴獜閹凤拷?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬姘卞闂佹眹鍨荤划顖涚┍婵犲洦鍊锋い蹇撳閹风兘寮介鐔蜂罕濠电姴锕ら悧鍡欏缂佹绠鹃柟瀛樼懃閻忊晠鏌涢妸銉ワ拷鍧楀蓟濞戞矮娌柛鎾楋拷濡劍绻涚�涙鐭嬬紒顔芥崌瀵鍨鹃幇浣告倯闂佸憡鍔戦崝宀勨�栫�ｎ喗鈷戦梻鍫熺♁椤ョ偤鎮介娑辨疁濠碉紕鏁诲畷鐔碱敍濮樺崬骞愰梻浣侯焾閺堫剛鍒掔仦绛嬪殨闁靛ň鏅滈埛鎴︽煕濠靛棗顏柣蹇涗憾閺屾盯鎮╁畷鍥р拰濡ょ姷鍋涢崯顐︹�﹂妸鈺佺闁绘劦鍓欑紓鎾绘⒒娴ｈ櫣銆婇柛鎾寸箞閳ワ箓宕堕锟藉Ч鏌ユ煥閺囩偛锟藉綊鍩涢幒鎳ㄥ綊鏁愰崟顕呭妳闂佺粯甯楅崕瀹犵亙闂佺粯顭堝▍鏇㈠磹閹扮増鐓涢悘鐐存灮闊剟鏌℃担鐟板鐎垫澘瀚换婵嬪礋椤撶喐鐦掓繝鐢靛Т閻ュ寮堕崠鈩冨鐟滄棃鐛箛娑欏�婚柤鎭掑劤閸樻捇姊洪懞銉冾亪藝閽樺）锝夊箹娴ｅ湱鍘撻柣鐘叉穿鐏忔瑦鏅ユ俊鐐�戦崹娲�﹂崼銉嬪洦娼忛埡鍐紲闂侀潧顭堥崝灞剧瑜版帗鐓ラ柣鏃傜帛椤ュ鏌ｈ箛鏃囧妞ゎ厼鐏濊灒缁绢參鏀辩�氳鎱ㄥΟ鐓庡付濠⒀冪摠閵囧嫰濮�閳藉懓锟借法锟借娲橀〃濠囧箖閳╁啯鍎熼柨婵嗘川瀹撲焦绻濋悽闈浶ラ柡浣告啞閹便劎锟界敻娼婚幏宄邦潩椤愩垹绁梺璇″枙閸楁娊鐛Ο鑲╃＜婵☆垶鏀辩�氳棄鈹戦悙鑸靛涧缂佹彃娼￠垾锕傚醇閵夈儲杈堥梻渚囧墮缁夌敻鎮″▎鎴犳／闁哄鐏濋懜鐟懊瑰鍕棆闁跨喎锟界噥娼愭繛鍙夛耿瀹曟繈寮介锝呭簥濠电娀娼уΛ顓烆焽閳哄倶浜滈柟鐑樺灥閿熺晫顭堥锝夊Ω閵夈垺鏂�闂佺粯锕╅崰鏍倶闁秵鐓曢柍鍝勫�绘晶鐢碉拷瑙勬礃缁诲牆顕ｆ禒瀣垫晣闁绘棁娓圭花鐢告⒒娴ｅ憡鎯堟繛灞傚姂瀹曚即骞橀崜浣风瑝婵°倧绲介崯顖炴偂閺囥垺鐓冮柍杞扮閺嬨倖绻涢崼鐕佺劷缂佽鲸甯￠幃鈺呭箵閹烘棃鐛撻梻渚�娼уú銈囷拷姘卞娣囧﹪鎮滈懞銉︽珕闂佸憡鎸嗛崨顓炶緟闂傚倸鍊风粈渚�骞栭锕�瀚夋い鎺炴嫹閻撱倝鏌ｉ弮鍫闁哄棴绠撻弻娑樜旈崘顭掓嫹閿濆鍋勯柛蹇曞帶閿熺晫绮穱濠囶敍濠靛洨銆婂┑鈥插嫎閸旀垵顫忛搹瑙勫珰闁告瑥顦弨顓烆渻閵堝骸浜滄い锔诲灣閸欏懘妫呴銏″缂佸鍨圭划鍫熷緞瀹�瀣妤犵偛鐏濋崝姘箾鐠囇呯暠闁伙絿鍏樺畷锝嗗緞瀹�锟介惁鍫ユ⒒閸屾氨澧涘〒姘殜瀹曟洝绠涢弴鐘筹紡闂佽鍨庨崘鈺侊拷顖滅磽娴ｈ櫣甯涚紒璇插暟閹广垹鈹戞繝鍕澑闂佸搫鍊归娆愬閹惧墎纾介柛灞捐壘閿熶粙顥撳▎銏ゆ晸閻樺啿浜楁繝銏ｅ煐閸旀洜绮婚鐐寸叆闁绘洖鍊圭�氾拷
			return true;
		
		return false;
	}

	private void kickUser(int error) {
		Kick p1 = new Kick();
		p1.linksid = ((Dispatch)this.getContext()).linksid;
		p1.action = Kick.A_QUICK_CLOSE;
		p1.error = error;
		Onlines.sendProtocl(p1, this.getConnection());
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786433;

	public int getType() {
		return 786433;
	}


	public CRoleList() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRoleList) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRoleList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

