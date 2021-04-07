
package fire.pb.mission;


import fire.pb.map.MapConfig;
import fire.pb.mission.fairyland.FairylandMgr;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReturnFairyland__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReturnFairyland extends __CReturnFairyland__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣筋潐婢瑰棙鏅跺Δ鍛；閻庯綆浜栭弨浠嬫煟濡搫绾у璺哄閺屾稓锟斤綆浜堕崕鏃堟煛瀹�锟介崰鎾舵閹烘顫呴柣妯虹－娴滎亞绱撻崒娆掑厡濠殿喗娼欓锝夊醇閺囩倣锕傛煕閺囥劌鐏犵紒顐㈢Ч閺屾稓浠﹂崜褏鐓�缂備焦顨愮换婵嬪箖濡ゅ啯鍠嗛柛鏇ㄥ墰椤︺劑姊虹紒妯绘儓缂佺粯绻傞锝囨嫚濞村顫嶉梺闈涚箳婵敻藟濠靛鈷戦柛娑橈功缁犳捇鎮楀鐓庡⒋闁糕晜绋掑鍕箾閻愵剚鏉搁梻浣虹帛閸旀ê鈻斿☉娆戭洸鐟滅増甯楅悡娑樏归敐鍥╂憘闁搞倖鐟╅弻锝夋晲閸涱厽些濡炪値鍋呯换鍕箲閸曨剚濯撮柡鍥ф濞诧箓鎮￠弴銏＄厓闁宠桨绀侀弸銈夋煟閹哄秶鐭欓柡灞剧洴瀵噣宕掑顒�绠ｆ繝娈垮枛閿曘儱顪冮挊澶屾殾妞ゆ劧绠戠粈瀣亜閹伴潧浜楃紒杈ㄧ箞濮婄粯鎷呯憴鍕哗闂佸憡鏌ㄩ澶婄暦閿熺姴绠柣锝呰嫰缁侊箓姊虹化鏇炲⒉妞ゎ厼娲幃鐤亹閹烘挾鍙嗛梺缁樻煥婢у酣鎯屽▎鎰垫闁绘劘顕滃銉╂懚閺嶎厽鐓曟繛鎴濆船楠炴﹢鏌ㄥ☉娆戞噰婵﹨娅ｇ槐鎺懳熷ú缁樷挅婵犵數鍋涢幏鎴犵礊娓氾拷閵嗕礁鈻庨幇顒傜獮闂佸綊鍋婇崢鎼佸箯濞差亝鈷戠痪顓炴噹娴滃綊鏌涚�ｎ偆娲寸�规洘绻堟俊鑸靛緞鐎ｎ剙骞堥梺璇插嚱缂嶅棝宕滃▎鎰浄闂侇剙绉甸悡鏇㈡煃鏉炴壆鍔嶉柛銈呮川閿熷�燁潐濞叉牜绱炴繝鍥ワ拷渚�寮撮姀鈩冩珳闂佺硶鍓濋悷銉︾箾閿燂拷?
		
		final fire.pb.map.Role role = fire.pb.map.RoleManager.getInstance().getRoleByID(roleid);
		if (role==null)
			return ;
		MapConfig mc = role.getCurMapConfig();
		if (!(mc.getDynamic()==0&&mc.getVisibletype()==0)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 143366, null);
			return;
		}
		xbean.RolePos rolePos = xtable.Roleposes.select(roleid);
		//if (rolePos==null||rolePos.getDynamicmap()<1500) {
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌ㄩ悢鍝勑㈢紒鎰殕缁绘盯骞嬮悙鍨櫗闂佸憡鐟ョ换姗�寮婚弴銏犻唶婵犻潧娲ㄩ妶顐︽⒑瑜版帩妫戦柛蹇斆悾鐤亹閹烘繃鏅濋梺闈涚墕濞层劑宕㈠鍫熲拻濞达絿鐡旈崵鍐煕閻斿憡宕屽┑陇鍩栭幆鏃堝煑鐟併倕濮傛慨濠勭帛閹峰懘鎮滃Ο鐑樼暚缂傚倷鑳舵慨瀵哥矓閻熸壆鏆︾憸鐗堝笚鐎电姴顭跨捄鐑樻拱婵炲牊鍎抽埞鎴︽偐缂佹ɑ閿銈嗗灥閹虫﹢骞冮悙瑁佹椽顢旈崨顖氬箞闂備胶顢婇崺鍥礉瀹ュ應鏋嶅┑鐘插暕缁诲棝鏌涢幘妤�鍟獮瀣攽椤旂》鏀绘俊鐐扮矙楠炲啴鎮滈挊澶岊吋濡炪倖妫佸畷鍨仚閹惰姤鐓熼幖娣�ゅ鎰箾閸欏鑰块柡浣稿暣婵拷闁靛牆鎳愰悾鍝勨攽閻樿宸ラ柣妤�锕鎻掝煥閸喓鍘鹃梺璇″幗鐢帡宕濆顓滀簻妞ゆ劗鍣﹂幏鐑藉箛娴ｇ懓鐦滈梻渚�娼ч悧鍡椢涘Δ鍐當闁圭儤顨嗛悡鏇炩攽閻樻彃锟借崵绮斿ú顏呯厵妞ゆ洩鎷风紒鐘崇墵瀵宕卞Δ濠傛倯闂佺硶鍓濋悷銉╃嵁閸儲鈷掑ù锝囨嚀椤曟粍淇婇锛勫妽闁逛究鍔戞俊鍫曞炊椤垵浠洪梻浣告啞閻熴儵藝鏉堚晝涓嶅Δ锝呭暙缁狙囨煕椤愮姴鐏╁ù婊堢畺閹顫濋悙顒�顏�,闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�哥粻鏍煕椤愶絾绀�缁炬儳娼￠弻褑绠涢敐鍛凹闂佸憡鐟ョ换鎺楁晸閸婄噥娼愭繛鍙夌墪鐓ら柨鏃�鎷濋幏宄邦潩椤掑鍚嬮梺鍝勭焿缂嶄礁顕ｉ鍕閹兼番鍨归弸鎴︽⒒娴ｅ摜锛嶇紒顕呭灠鐓ら柣鏃傚帶缁犳牗淇婇妶鍛櫤闁哄懏鐓￠獮鏍拷娑欘焽缁犳﹢鏌ｉ埡渚�顎楁い顏勫暣婵″爼宕橀…鎺撳闁哄洢鍨圭粻鐘虫叏濡ゅ瀚瑰Δ鐘靛仜閸燁偉鐏冮梺璺ㄥ枍缁瑩宕洪妷锕�绶炲┑鐐靛亾閻庤鈹戦埥鍡楃仯闁告鍕弿闁绘垶顭囩弧锟介梺姹囧灲濞佳勭濠婂牊鐓熸俊銈忔嫹闁挎洦浜滈悾鐤亹閹烘垵鐎銈嗘⒒閸嬫挸鈻撴ィ鍐┾拺鐟滅増甯楅敍鐔虹磼閿熻姤鎷呴搹閫涚瑝濠电偞鍨堕悷锝嗙濠婂牊鐓欓柟瑙勫姈绾墽锟芥稒绻堝铏规嫚閼碱剛顔掓繛瀛樼矎濞夋盯锝炶箛鎾佹椽顢旈崟顐ょ崺濠电姷鏁告慨瀵革拷姘煎弮瀹曡櫕绂掔�ｎ偀鎷洪梺纭呭亹閸嬫稒淇婇崸妤佺厸濞达絿鐡旈崵娆撴煟閿濆懎妲婚摶鏍煥閻斿墎鐭欓柨婵堝仜椤劑宕奸悢鍛婎仧闂備浇濮ら敋妞わ箓浜跺鎶芥晝閸屾稓鍘卞銈嗗姧缁插墽绮堥崘顔界厱閻庯綆鍋勬慨宥囷拷娈垮枛閻栫厧鐣锋總鍓叉晝妞ゎ偒鍘鹃弫鏍ㄤ繆閻愵亜锟窖囨⒔閸曨剛鐝堕柛鈩冪懄椤洟鏌熼幑鎰靛殭缁炬儳鍚嬬换娑㈠幢濡櫣鍔稿┑鈥虫▕閸ｏ綁寮婚敐鍡樺劅闁靛繈鍩勯弳鈥斥攽閻橆喖鐏柨姘憋拷瑙勬尭鐎氭澘顫忓ú顏勭閹兼番鍨婚ˇ銉╂⒑缁嬪尅鍔熸い顓炵墛閺呫儵姊洪崫鍕潶闁稿孩鐓￠幃锟犲即閵忊�筹拷鍫曟煟閹邦厼绲婚柍閿嬫閺岋綁顢樺鍐挎嫹濠靛钃熼柨婵嗘閸庣喖鏌曢崼婵囧櫧婵絻鍨荤槐鎾存媴娴犲鎽甸柣銏╁灙閿熻棄纾弳锕傛煙閻戞ê鐒炬繛灏栨櫊閺屻倕霉鐎ｎ偅鐝旈梺璇″枟閸ㄥ墎鎹㈠┑鍡╁殫闁哄鍋勯敓濮愬�濆畷鐢碉拷锝庝簴閺�浠嬫煃閵夈劍鐝�瑰憡绻堥弻娑㈠箳閹捐櫕璇為悗瑙勬礀缂嶅﹪銆侀弴銏狀潊闁靛繈鍨诲畵浣圭節閻㈤潧啸闁轰礁鎲￠幈銊╁箻椤旇偐锛欓悷婊呭鐢帡宕欓悩鍙傛棃鏁愰崨顓熸闂佹娊鏀遍崹鍧楀蓟閻斿吋鍤冮柍杞版缁爼姊洪崨濠冪厽闁稿﹥娲熼崺鐐哄箣閿旂粯鏅╅梺鍏肩ゴ閺咁亞妲愰悙鐢电＝濞撴艾娲ゅ▍姗�鏌涘Ο鎸庮棄妞ゆ洏鍎靛畷鐔碱敍濮樿京鏉告俊鐐�栫敮鎺楀磻閸℃あ锝夋晸閿燂拷?
			MissionMajorScenario majorTask = new MissionMajorScenario( roleid, true );
			MissionConfig conf = majorTask.getConf();
			if ( conf == null )
				return;
			
		//	MissionConfig.MissionRewardInfo rewardInfo = conf.rewardInfo;
			if ( FairylandMgr.isInDreamMap(conf.exeIndo.mapID ) ) {
				fire.pb.mission.fairyland.FairylandMgr.getInstance().enterIntoDreamLand(roleid, conf.exeIndo.mapID, rolePos.getDynamicposx(), rolePos.getDynamicposy(),false,true );
			}
			
			return;
		//}
//		else {
//			int mapid = rolePos.getDynamicmap();
//			int posx = rolePos.getDynamicposx();
//			int posy = rolePos.getDynamicposy();
//			fire.pb.mission.dreamland.DreamLandManager.getInstance().enterIntoDreamLand(roleid, mapid, posx, posy,false,true);
//		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805455;

	public int getType() {
		return 805455;
	}


	public CReturnFairyland() {
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
		if (_o1_ instanceof CReturnFairyland) {
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

	public int compareTo(CReturnFairyland _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

