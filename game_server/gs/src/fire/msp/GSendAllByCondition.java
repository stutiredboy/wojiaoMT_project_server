
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
		{//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍讲鏋欓梺缁樺笩婵倗鎹㈠☉銏犲耿婵☆垵顕х喊宥夋煟閻斿摜鎳曠紒鐘虫崌楠炲啫螖閸涱喗娅滈柟鑲╄ˉ閸撴繈鎮樺澶嬧拺闁告繂瀚刊鐓幟瑰搴濈盎妞ゎ偄绻掔槐鎺懳熺拠宸拷鎾绘⒑閸涘﹦鈽夐柨鏇樺�濆鎶藉醇閵夛妇鍙冮梺鍛婂姦閸犳洟骞夋ィ鍐╃厸鐎癸拷鐎ｎ剛袦闂佺硶鏂侀崜婵堟崲濠靛纾兼繝濠忔嫹婵℃鎹囧缁樻媴閾忕懓绗℃繛鎾寸椤ㄥ﹤鐣烽幎鑺ユ櫜濠㈣泛鑻粊锕傛⒑閹肩偛鍔撮柛鎿勭畵瀵偊宕堕浣哄幗闂佸綊鍋婇崰妤呭汲閳哄懏鐓熸繛鎴濆船閺嬫盯鏌嶇憴鍕伌闁诡喒鏅犲畷褰掝敃閿濆棛妲戞繝鐢靛У椤旀牠宕板Δ鍛闁告劘灏欓弳锔姐亜閺嶃劎鈽夋い鏇憾閹鈽夊▍顓т邯瀹曟粓顢橀悢铏圭槇闂佹眹鍨藉褎鐗庣紓浣哄亾濠㈡绮旇ぐ鎺戞槬婵炴垯鍨圭粻锝夋煥閺冨倹娅曢柛妯哄船閳规垿鎮╃紒妯婚敪濠碘槅鍋呴〃濠囥�侀弮鍫晜闁告洏鍔嶉弬锟芥俊鐐�栭悧妤呭传鎼淬劌纾婚柕蹇嬪�栭悡娑㈡倶閻愭彃鈷旀繛鍙夋綑閳规垿鍩勯崘鈺侊拷鎰版煛娴ｇ鏆ｉ柡浣规尰缁傛帞锟斤綆浜為崢娲⒑閸濆嫭宸濆┑顖涙尦楠炲繑顦版惔銏犳瀭闂佸憡娲﹂崜娑⑺囬妸鈺傜厽闁靛繆鏅涢悘娆撴煕閹惧绠栫紒宀冮哺缁绘繈宕惰椤旀劖绻涙潏鍓хК闁稿﹣绮欐俊鎼佹晜鏉炴壆鐩庨梻浣告惈閸婃悂鎮樺┑瀣畺闁瑰鍋戞禍婊堟煙閸喖顏悗姘炬嫹?
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
		{//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撴い鏇嫹闁轰焦鎹囧顒勫Χ閸モ晜娈奸柣搴ゎ潐濞叉牠濡堕崨濠佺箚濡炲鍑介幏鐑芥晲鎼存繄鍑归梺鍝ュУ钃卞ǎ鍥э躬椤㈡洟濮�閻樿櫕顔勯梻鍌氭搐椤︾敻寮昏缁犳盯鏁愰崨顒傛晼婵犵數鍋炶ぐ鍐偤閵娾晛桅闁告洦鍨伴～鍛存煃閽樺顥為柣銈勭窔濮婄儤娼幍顔煎闂佸湱鎳撳ú顓㈢嵁閸愵喖绀堢憸灞解柦椤忓牊鐓㈡俊顖欒濡叉椽鏌＄仦鐔锋处閳锋帡鏌涚仦鎹愬闁跨喍绮欓ˉ鎾跺垝閸喓鐟归柨鐔剁矙閻涱喗寰勯幇顓熸闂佺粯顭堢亸娆擃敊閸ヮ剚鈷戠紒顖涙礀婢ц尙绱掔�ｎ偄鐏╃紒顔肩墦瀹曟﹢顢欓悾灞藉妇濠电姷鏁搁崑娑㈡倶濠靛鏅搁柤鎭掑劤婢х數锟借娲樺姗�锝炲┑瀣殝缁剧増蓱鐎氬ジ姊洪懡銈呅㈡繛灞傚�曢锝夊醇閺囩偟顔夐梺鎸庣箓濡孩绂嶅鍫熺叆婵犻潧妫濋妤佺箾閸涱厾校妞ゃ劊鍎甸幃娆撴嚑椤掑偆鍟嬮梻浣芥〃閻掞箓骞戦崶顒�鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘?
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
		{//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾椤懘鏌嶉妷銉ユ毐缂併劊鍎靛缁樻媴缁嬫妫岄梺绋款儎缁舵艾鐣烽弴鐔哥秶闁冲搫鍟伴悞鍏肩節閵忥絽鐓愰柛鏃�鐗犻幃鈥斥枎閹炬潙锟界敻鏌ｉ姀鈽嗗晱闁绘帗鍎抽湁闁绘ɑ鐟ョ�氥劍绂嶅鍫熺厓闁告繂瀚敓钘夘煼瀹曪綁鏁撴禒瀣拺闁告繂瀚﹢浼存煟閳哄﹤鐏﹂柕鍡曠窔瀵挳濮�閳╁啯鐝抽梻浣虹《閸撴繈鎮烽姣硷綁顢楅崟顑芥嫽婵炶揪绲肩拃锕傛倿妤ｅ啯鍋犳慨妯煎帶娴滄壆锟借娲樼换鍫ョ嵁鐎ｎ喗鏅濋柨鐔剁矙閹锋垿鎮㈤崫銉ь啎闂佺懓鐡ㄩ悷銉╂倶閳哄懏鐓熼柟鐑樻尰閵囨繈鏌＄仦鍓ф创妤犵偛娲俊鎼佹晜閻ｅ苯绲垮┑鐘垫暩閸嬫盯鎮ч崟顖氱９婵°倕鍟～鏇㈡煙閹呮憼濠殿垱鎸抽弻娑樷攽閸℃褰呴梺鎸庣箓椤︿即鎮￠悢闀愮箚闁靛牆瀚拹鐗堢箾閸噦鑰块柡宀�鍠栭悰顕�宕归鍙ユ偅闂備礁鐤囬～澶愬垂閸喚鏆﹂柛顐ｆ礀閻撴盯鏌涢幇顓炲姢闁哄拋鍙冨濠氬磼濞嗘埈妲繝銏㈡嚀閿曨亪骞冮敓鐘查唶闁靛鍎靛Λ宄邦渻閵堝棛澧遍柛瀣〒缁顢涘鎰闁荤喐婢橀顏堟倵濮橆剛澧︾�殿噮鍣ｅ畷鐓庘攽閸℃瑧宕哄┑锛勫亼閸婃牕螞閸愩剮娑㈠垂椤斻儻缍侀獮鍥偋閸碍瀚藉┑鐐舵彧缁插潡宕曢妶澶婂惞闁跨喕妫勯—鍐Χ閸℃ê顦╅梺鍛娒肩划娆撶嵁閸儱惟闁靛／鍕杺闂備礁缍婇弨鍗烆潖瑜版帗鍎庢い鏍仜閺嬩線鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓?
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

