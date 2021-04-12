
package fire.msp;

import gnet.link.Onlines;

import java.util.HashSet;
import java.util.Set;

import fire.pb.scene.Scene;
import fire.pb.scene.SceneManager;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GSendAllByCondition__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GSendAllByCondition extends __GSendAllByCondition__ {
	@Override
	protected void process() {
		// protocol handle
		Set<Long> sendroleIds = new HashSet<Long>(); 
		if(sceneid != -1)
		{//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊璁查弸娆撴⒑缂佹ê绗╁┑顔哄�楅幑銏犫槈閵忕姴鑰垮┑鈽嗗灥椤曆呭枈瀹ュ鐓熼柣鏂挎憸閹虫洜绱掗悩铏磳妤犵偛鍟灃闁告侗鍠楀▍婊堟煙閼测晞藟闁告挻绻堥幃妯侯吋婢跺鎷洪梺鍛婄箓鐎氼厽鍒婇悡骞熺懓顭ㄦ惔婵堢泿濡炪値鍋勭换鎺旀閹烘嚦鐔烘嫚瀹割噯鎷烽幘缁樷拺闁告稑锕﹂埥澶愭煥閺囨ê锟芥繂顕ｉ幎钘夐唶闁靛濡囬崣鍐⒑閸涘﹤濮﹂柛鐘虫礋楠炲銈ｉ崘鈺冨幐閻庣櫢鎷烽悗锝庡墰琚﹂梻浣虹《閺備線宕滃┑鍫熷床婵犻潧顑呯壕鍏肩節婵犲繑瀚瑰┑鈩冾殕閹瑰洤顫忕紒妯诲闁惧繒鎳撶粭鈩冪箾閹惧顣叉い銊ワ工閻ｇ兘骞庨懞銉︽珳婵犮垼娉涢懟顖滅矈閿曞倹鈷戦柟鑲╁仜閸旀挳鏌涢幙鍕暤鐎殿噮鍋婂畷鍫曨敆娴ｅ搫骞楅梻浣哥秺閸嬪﹪宕板Δ鍛辈闁冲搫鎳忛悡鐔哥箾閹存繂鑸归柡瀣洴閺屽秶鎲撮崟顐や紝闂佽鍠掗弲鐘茬暦瑜版帩鏁冮柨婵嗘濡叉垶绻濋悽闈浶ｆい鏃�鐗犲畷鏉课旈崨顓狀唶闂佸憡鍔樼亸娆撳汲閿斿浜滈柡宥冨妿閳藉銇勯弴顫喚闁诡喗顨呴埥澶娾枍椤撗傞偗鐎规洘绮撻、姗�鎮㈤搹鍦闂備焦鐪归崹钘夘焽瑜庨悧搴ｇ磽娴ｅ搫浜炬繝銏☆焽缁棁銇愰幒鎴炴К濠电偞鍨崹鍦不閿濆鐓ラ柡鍐ㄥ�瑰▍鏇㈡煕濡搫鑸归柍瑙勫灴閹晝绱掑Ο濠氭暘婵犵妲呴崑鍛淬�冩繝鍥ワ拷渚�寮崼顐ｆ櫆闂佸憡娲忛崝宥夊棘閿熻姤淇婇悙顏勶拷鏍偋濡ゅ懎浼犻幖娣妼绾惧鏌曡箛瀣拷鏍偂濞戙垺鍊堕柣鎰絻閳锋梹绻涢崣澶嬬稇闁宠鍨块崺鍕礃閳轰緤鎷烽幇鐗堢厸濞达絿顭堥弳锝夋煛娴ｈ灏扮紒鍌涘笧閿熸枻缍嗘禍鐐哄储濞差亝鈷戦柛婵嗗瀹告繂鈹戦娑欏唉妤犵偛绻戦ˇ鐗堟償閵忕姵鐎梻浣告啞濞诧箓宕滃☉鈶哄洭濡搁埡鍌滃幗闂侀潧绻嗛弲娑㈡倶濞嗘挻鐓曢柟鎯ь嚟缁犳牜绱掑畝鍐摵缂佺粯绻堝畷鎯邦槾妞ゆ梹鍔栫换娑欐綇閸撗呅氶梺绋匡梗缁瑦淇婇幖浣规櫆閺夌偞澹嗛惄搴ㄦ⒒娴ｅ憡鎯堥柛濠冩倐閹ê鈹戠�ｎ亞鐣洪梺鐟邦嚟閸嬫垶绂嶅鍫熺厵闁割煈鍠栭顏堟倵濮樼偓瀚�?
			Scene scene = SceneManager.getInstance().getSceneByID(sceneid);
			for(Role role : scene.getSceneRoles().values())
			{
				if(schoolid != -1 && role.getSchoolId() != schoolid)
					continue;
				if(minlevel != -1 && role.getLevel() < minlevel)
					continue;
				if(maxlevel != -1 && role.getLevel() > maxlevel)
					continue;
				sendroleIds.add(role.getRoleID());
			}
		}
		else if(schoolid != -1)
		{//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡╂Ч濞存嚎鍊濋弻銈夊级閹稿骸浠村┑顔硷攻濡炰粙銆佸Δ鍛櫢闁伙絽鐬奸惌鎾淬亜閺囶亝瀚归梺杞扮劍閹瑰洤顕ｉ鍕ч柛銉㈡櫆濞堝ジ鏌ｆ惔銈庢綈婵炲弶鐗犳俊鍫曞川婵犱胶绠氭俊鐐差儏閸戜粙骞忛悜鑺ユ櫜閹煎瓨绻勯崙褰掓⒑閸濄儱校閽冨崬菐閸パ嶈含妞ゃ垺娲熸慨锟介柣妯挎珪椤斿嫰姊婚崒姘悙妞わ妇鏁诲鏄忣樁缂佺姵鐩弫鎰板川椤掑倹鏅煎┑鐘垫暩閸嬬偠銇愰崘顔藉仱闁靛ň鏅涙闂佸憡娲﹂崹浼达綖閸涘瓨鐓冮柦妯侯槹椤ョ偤鏌ｉ妶鍕獢婵﹦鍎ゅ顏堝箥椤旂厧顬夐梻浣告贡閹虫挸煤椤撱垻宓侀柛鎰靛枛缁�鍫㈡喐鐏炶В鏌︽い蹇撶墛閻撱垺淇婇娆掝劅婵″弶妞介弻锛勪沪閻旈攱澶勯柍閿嬪浮閺屾稓浠﹂幑鎰棟闂佽法鍠嶇划娆撍夐幘璺哄灊闁割偆鍠撻悷褰掓煥閻斿墎鐭欓柣娑卞枟瀵板嫰骞囬鐔割仧闂備胶绮…鍫焊濞嗘搩鏁婇柛銉墯閳锋垹绱掗娑欑濠⒀嗗皺缁辨帞锟斤綆鍋勯悘鈺冪磼椤旇偐澧︾�规洘锕㈤、娆撴偩鐏炶棄濡囨繝鐢靛Х閺佹悂宕戝☉銏″�舵繝闈涱儐閺呮悂鏌ら幁鎺戝姢濠⒀呮暩閿熷�燁潐濞叉ê顭垮锟介敐鐐测攽鐎ｎ偄娈濈紒鍓у钃遍悗姘偢濮婃椽鎳￠妶鍛呫垺绻涚仦鍌氾拷鏇㈩敋閿濆閱囬柡鍥╁仧椤斿姊洪幐搴ｇ畵婵☆偄瀛╃粋宥咁煥閸喓鍙嗗┑鐘绘涧濡繈顢撳Δ浣虹闁告侗鍘炬牎濡炪們鍔婇崕鐢稿箖濞嗘挻鍤戞い鎺戝亞閸熷姊绘担鑺ャ�冮柣鎺炵畵楠炴垿宕堕锟介弸渚�鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓?
			Set<Long> schoolroles = RoleManager.getInstance().getSchoolRoles(schoolid);
			if (schoolroles!=null) 
			for(long sroleId :  schoolroles)
			{
				Role role = RoleManager.getInstance().getRoleByID(sroleId);
				if(minlevel != -1 && role.getLevel() < minlevel)
					continue;
				if(maxlevel != -1 && role.getLevel() > maxlevel)
					continue;
				sendroleIds.add(sroleId);
			}
		}
		else if (camp >0) {
			Set<Long> campRoles = RoleManager.getInstance().campRoles.get(camp);
			if (campRoles != null){
				for (long rid : campRoles) {
					sendroleIds.add(rid);
				}
			}
		}
		else if (null != exceptroles) {
		    Set<Long> allRoles = RoleManager.getInstance().getRoles().keySet();
            if (allRoles != null){
                for (long sroleId : allRoles) {
                    Role role = RoleManager.getInstance().getRoleByID(sroleId);
                    if (minlevel != -1 && role.getLevel() < minlevel)
                        continue;
                    if (maxlevel != -1 && role.getLevel() > maxlevel)
                        continue;
                    sendroleIds.add(sroleId);
                }
            }
		    sendroleIds.removeAll(exceptroles);
		}
		else
		{//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆欑穿闂備浇娉曢崰鎰板几閼姐倗涓嶉柟鎯х－閺嗭箑鈹戦崒婊庣劸妞ゎ偄鎳橀弻宥夊Ψ閵夈儲姣愮紓浣靛妸閸庨潧顫忕紒妯诲缂佸顑欏Λ宀勬⒑缁嬫鍎庣紒鑸佃壘閻ｇ兘寮撮悢鍝ョФ闂佸啿鎼崯浼存倿閸忚偐绡�闁靛骏绲介悡鎰版煕閺冿拷閻楃娀骞冮垾鏂ユ瀻闁圭偓娼欓敓鐣屾暬閺岋綁濮�閳藉棗鏅遍梺缁樺笚閸庢娊婀侀梺缁樕戦悷銉э拷姘ュ妽缁傚秴顭ㄩ崼鐔哄帗闂佸憡绻傜�氼剟鏁撻挊澶樼吋鐎规洩缍侀弫鎾寸鐎ｎ偀鎷洪梺鍛婄箓鐎氼厼锕㈡导瀛樼厽闁冲搫锕ら悘锕傛煏閸℃洜绐旂�殿喗鎸虫慨锟介柍鈺佸暞閻濇娊姊绘担铏广�婇柛鎾寸箞閹兘顢涘В纭风秮椤㈡宕熼鑺ュ濠电偠鎻徊鑲╂媰閿曞倹鍊垮Δ锝呭暞閸嬬姵鎱ㄥΟ鐓庡付濞存粍澹嗛敓鍊燁潐濞叉鎹㈤崼銉у祦閻庯綆鍠楅弲婵嬫煥閻斿墎鐭欓柟閿嬪灴閹垽宕妷褜鍟庨梻浣烘嚀閻°劑鎮烽妷鈺傚�堕柍鍝勬噺閻撶喖鏌熼悜妯诲鞍闁靛洦绻堥弻锛勪沪閸撗勫垱濡ょ姷鍋涘ú顓熶繆閹间焦鏅滈柣锝呰嫰缁插灝鈹戦悩鍨毄闁稿鐩幃褔宕熼姘憋紮濠德板�曢崯顖烇綖閺囥垺鐓欓柟顖嗗懏鎲兼繝娈垮灡閹告娊寮诲☉妯锋斀闁糕剝顨堣ぐ鍛存⒑閹稿海绠撴い锔垮嵆閹繝鎮㈤梹鎰畾闂侀潧鐗嗙�氼喚鎷归悧鍫㈢闁割偆鍣﹂懓鍧楁煛瀹�锟介崰鏍偘椤曪拷瀹曞綊顢欓崣銉﹀亝闂傚倷绀侀悿鍥綖婢舵劕鍨傞柛顭戝枤閺嗭箓鏌涢锝嗙闁绘挻鐩弻娑㈠箛椤撶偛濮㈤梺鍝勬媼閸欏啫顫忔繝姘＜婵炲棙鍩堝Σ顔界節閵忋垺鍤�闁挎洦浜獮鍐晸閻樻煡鍞堕梺闈涱槶閸庨潧螞瀹勯偊娓婚柕鍫濇婢ч亶鏌涚�ｎ偆銆掔紒顔碱煼椤㈡稑顭ㄩ幇顓烆伓闂佽崵鍠愬姗�顢旈鍫熷�垫慨姗嗗墰婢э妇锟芥鍣崳锝呯暦閻撳簶鏀介柛鈩冪懅瀹曞搫鈹戦敍鍕杭闁稿﹥鐗曡灋闁告劑鍓☉銏犲瀭妞ゆ柣鍎荤紞渚�鐛崶顒佸亱闁割偅纰嶇�氳棄鈹戦悙鑸靛涧缂佹彃娼″畷鏇㈠Χ婢跺﹤鎯為梺璺ㄥ枙濡嫰鈥旈崘顔嘉ч柛鈩兠ˇ鈺呮⒑閸涘♁鑲╁垝濞嗘挾宓侀柛顐犲劚鎯熼梺闈涳紡閸曨剛鏉洪梻鍌欑缂嶅﹪寮ㄩ崡鐑嗘綎鐟滅増甯楅崕搴€亜閺嶎偄浠滈柡瀣╃窔閺岀喖宕滆鐢盯鏌￠崨顔藉�愰柡灞诲姂閹倝宕掑☉姗嗕紦?
			for(Role role : RoleManager.getInstance().getRoles().values())
			{
				if(minlevel != -1 && role.getLevel() < minlevel)
					continue;
				if(maxlevel != -1 && role.getLevel() > maxlevel)
					continue;
				sendroleIds.add(role.getRoleID());
			}
		}
		
		Onlines.getInstance().sendOctets(sendroleIds, protype,protocol);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 720903;

	public int getType() {
		return 720903;
	}

	public int protype; // 协议的类型
	public com.locojoy.base.Octets protocol; // 协议marshal完的数据
	public int schoolid; // 门派ID，如果无限制填-1
	public int minlevel; // 最小等级，如果无限制填-1
	public int maxlevel; // 最大等级，如果无限制填-1
	public long sceneid; // 场景ID，如果无限制填-1
	public int camp; // 阵营频道,如果无限制填-1
	public java.util.ArrayList<Long> exceptroles; // 不发送协议的role

	public GSendAllByCondition() {
		protocol = new com.locojoy.base.Octets();
		exceptroles = new java.util.ArrayList<Long>();
	}

	public GSendAllByCondition(int _protype_, com.locojoy.base.Octets _protocol_, int _schoolid_, int _minlevel_, int _maxlevel_, long _sceneid_, int _camp_, java.util.ArrayList<Long> _exceptroles_) {
		this.protype = _protype_;
		this.protocol = _protocol_;
		this.schoolid = _schoolid_;
		this.minlevel = _minlevel_;
		this.maxlevel = _maxlevel_;
		this.sceneid = _sceneid_;
		this.camp = _camp_;
		this.exceptroles = _exceptroles_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(protype);
		_os_.marshal(protocol);
		_os_.marshal(schoolid);
		_os_.marshal(minlevel);
		_os_.marshal(maxlevel);
		_os_.marshal(sceneid);
		_os_.marshal(camp);
		_os_.compact_uint32(exceptroles.size());
		for (Long _v_ : exceptroles) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		protype = _os_.unmarshal_int();
		protocol = _os_.unmarshal_Octets();
		schoolid = _os_.unmarshal_int();
		minlevel = _os_.unmarshal_int();
		maxlevel = _os_.unmarshal_int();
		sceneid = _os_.unmarshal_long();
		camp = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			long _v_;
			_v_ = _os_.unmarshal_long();
			exceptroles.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GSendAllByCondition) {
			GSendAllByCondition _o_ = (GSendAllByCondition)_o1_;
			if (protype != _o_.protype) return false;
			if (!protocol.equals(_o_.protocol)) return false;
			if (schoolid != _o_.schoolid) return false;
			if (minlevel != _o_.minlevel) return false;
			if (maxlevel != _o_.maxlevel) return false;
			if (sceneid != _o_.sceneid) return false;
			if (camp != _o_.camp) return false;
			if (!exceptroles.equals(_o_.exceptroles)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += protype;
		_h_ += protocol.hashCode();
		_h_ += schoolid;
		_h_ += minlevel;
		_h_ += maxlevel;
		_h_ += (int)sceneid;
		_h_ += camp;
		_h_ += exceptroles.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(protype).append(",");
		_sb_.append("B").append(protocol.size()).append(",");
		_sb_.append(schoolid).append(",");
		_sb_.append(minlevel).append(",");
		_sb_.append(maxlevel).append(",");
		_sb_.append(sceneid).append(",");
		_sb_.append(camp).append(",");
		_sb_.append(exceptroles).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

