
package fire.pb;

import fire.pb.state.DRoleOnlineFail;
import fire.pb.state.PRoleOnline;
import fire.pb.state.StateManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CEnterWorld__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CEnterWorld extends __CEnterWorld__ {
	@Override
	protected void process() {
		//XXX:濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏焺閺佸銇勯幘璺烘瀾闁告瑥绻樺濠氬醇閻斿墎绻佸┑鐐插悑閻楃娀寮婚妶鍡樺弿闁归偊鍓ㄩ幏鐑藉即閵忕姴鐎┑鐘绘涧椤戝洭宕ｉ幘缁樼厱闁靛绲芥俊鍧楁煃閸欍儳绐旈柡灞剧洴婵℃儼绠涢弬娆句紦闂傚倸鍊搁崐椋庣矆娓氾拷楠炲鏁撻悩鑼槷闂佹寧娲栭崐鎼佸磼閵娿儍褰掓偐瀹割喖鍓鹃梺杞版閻掞箓骞堥妸銉建闁糕剝顨呴獮瀣攽閳╁啫绲婚柣妤佹崌瀵鎮㈤崗鐓庯拷閿嬨亜閹虹偞瀚规繝鈷�灞界仸闁哄本绋掗幆鏃堝閵忋垻鍘掔紓鍌欐祰妞村摜鏁Δ锟介…鍥疀濞戞鈺冩喐韫囨稒鍋╅柣鎴烆焽缁犻箖鏌ㄥ┑鍡樺櫤闁瑰吋鍔欓弻銊╁即閵娿倗鐩庨梺浼欑悼閸忔﹢鐛幒妤�绠ｉ柡鍐挎嫹妞ゎ偄绉撮埞鎴︻敊閺傘倓绶甸梺绋款儏鐎氭澘鐣烽悽鍛婄劶鐎广儱妫岄幏娲⒑閸涘﹦绠撻悗姘槻鍗遍柟缁㈠枟閻撴盯鏌涘☉鍗炴灓闁活厽甯￠弻鐔碱敊閹冨箣婵犲痉銈呯厫鐎垫澘瀚敓鏂ょ秵娴滄繈鎮炬總鍛娾拻濞达絼璀﹂弨浼存煙濞茶閭慨濠佺矙瀹曠喖顢涘鍗炲箞闂備礁婀遍崕銈夈�冮崱娑樼９闁割煈鍋嗙粻楣冩煙鐎电鍓卞ù鐓庢閺岀喓锟界數顭堝暩婵炴垶鎸哥粔褰掑蓟閻斿吋鍊绘慨妤�妫欓悾鐑芥⒑缂佹ɑ灏伴柣鈺婂灦瀵鈽夐姀鐘电杸闂傚倸鐗婄粙鎴犵不閾忓湱纾肩紓浣靛灩楠炴﹢鏌涚�ｎ偅灏扮紒宀冮哺缁绘繈宕堕懜鍨珫婵犳鍠楄摫鐎规洘锕㈠畷銉╊敃閳惰姤妫冮幃鈺呮濞戞ê顥愰梻浣哥秺椤ユ捇宕楀锟藉濠氭偄閸忕厧浜楅柟鑹版彧缁查箖骞夐懖鈺冪＝濞达絿鐡旈崵娆撴倵濮橆偄宓嗘鐐插暣瀹曠螖閿熺晫绮堢�ｎ偁浜滈柡宥冨妿閵嗘帡鏌涘锟芥禍璺侯潖閾忚宕夐柕濞垮劜閻濄垽姊洪悷鏉挎闁瑰嚖鎷�?
		//TODO:10缂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐闁芥ɑ绻堥弻鐔封枔閸喗鐏嶉梺鍝勬缁捇寮婚悢鍏煎�绘慨妤�妫欓悾鍫曟⒑閼测晩鐒剧紓宥咃躬瀵鎮㈤搹鍦紲闂侀潧绻掓慨鐢告倶閸儲鈷戞繛鑼额嚙楠炴銇勯妸銉︻棦濠碉紕鏁诲畷鐔碱敊閸撗勬緫闂備浇顫夐崕鎶筋敋椤撱垹围闁冲搫鎳忛埛鎴︽煕濠靛嫬鍔氬ù婊冦偢閺屾盯寮敓浠嬪垂閸噮鍤曞┑鐘崇閺呮煡鏌涢顐簼闁宠顦版穱濠囨倷椤忓嫸鎷烽弽褉鏋栭柨鏇炲�稿婵囥亜閺嶃劎鐭ゆ俊鍙夋倐閺岋絾鎯旈敍鍕殯闂佺楠稿畷顒冪亱濠电偞鍨崹褰掓偂濠靛鐓ラ柣鏇炲�圭�氾拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋娆忕仼闁告垹濞�閺岀喓绱掗姀鐘崇亶闂佸搫鎳忛幃鍌炲蓟閵娾晜鍋嗛柛灞剧☉椤忥拷?闂傚倸鍊搁崐鐑芥嚄閸洍锟斤箓宕奸妷锕�鍓舵繝闈涘�婚…鍫㈠婵犳碍鐓熼柟閭﹀幖椤ュ鏌￠崟顐拷鍨潖婵犳艾纾兼繛鍡樺笒閸橈繝鏌ｈ箛鎾剁疄闁告梹鍨块悰顔跨疀濞戞瑥锟藉鏌ら幁鎺戝姎濞寸媭鍨跺娲箹閻愭彃濮岄梺鍛婃煥閻厧顕ユ繝鍕＜婵☆垵顕у鍧楁⒑閹稿海绠撻柟閿嬪灴閻擃剟顢楅崟顒傚幐闁诲繒鍋熼崑鎾剁矆鐎ｎ喗鐓涘ù锝堫潐瀹曞矂鏌℃担瑙勫磳闁轰焦鎹囬弫鎾绘晸閿燂拷?
		final int userId=((gnet.link.Dispatch)this.getContext()).userid;
		final xbean.User usr = xtable.User.select(userId);
		if(null == usr || !usr.getIdlist().contains(roleid))
		{
			StateManager.logger.error(new StringBuilder("CEnterWorld: 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌ｉ姀銏╃劸缂侊拷婢跺本鍠愰煫鍥ㄦ礀閸ㄦ繂鈹戦悩瀹犲缂佺媴缍侀弻銊モ攽閸℃娈ㄥ┑顔款潐椤ㄥ牏妲愰幘瀛樺闁告稑锕ラ崕鎾绘⒑閸撹尙鍘滈柟鍑ゆ嫹 = ").append(userId).append("婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ婢舵劖鐓ユ繝闈涙婢ц鲸绻涢崗鐓庡闂囧绻濊閻忔繈鏁撻懞銉у⒈闁瑰箍鍨归埥澶愬閻樿尪锟藉灝鈹戞幊閸婃洟骞婃惔鈽嗗殨濞寸厧鐡ㄩ埛鎴︽煙閼测晛浠滈柨鐔诲Г濞茬喖銆侀弽銊ョ窞闁归偊鍓涢悾娲倵閻熸澘顏鐟邦儔瀵憡鎯旈妸锔惧幍闂備緡鍙忕粻鎴炴櫠閻楀牄浜滈柟瀛樼箓椤忣亞绱掔紒妯肩疄濠殿噯鎷烽梺闈涚箚閿熷�熸珪閻ｎ剟姊绘担鐟邦嚋婵炶闄勭粋宥夘敂閸曢潧娈ㄥ銈嗗姧闂勫嫰寮查幖浣圭叆闁绘洖鍊圭�氾拷?").append(roleid).append(", 闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掍礁鍓銈嗗姧缁犳垿鐛姀銈嗙厓閺夌偞澹嗛崝宥嗐亜閺傚灝顏紒杈ㄦ崌瀹曟帒顫濋濠冨闁告縿鍎抽惌鎾绘倵闂堟稒鎲搁柣顓熸崌濮婂宕奸悢鍓佺箒闂佹悶鍊栭〃濠囧蓟濞戙垹鍗抽柕濞垮劚椤亞绱撻崒姘毙㈡繛璇х畵婵＄敻宕熼姘辩杸闂佸疇妗ㄧ粈浣圭珶濮楋拷濮婃椽宕崟顒�鍋嶉梺鎼炲妽濡炰粙骞冮檱缁犳稑鈽夊▎鎴濆汲闂備胶绮ú鏍磹閸︻叏鎷峰鐐?"));
			return;
		}
		StateManager.logger.info(new StringBuilder("roleid=").append(roleid).append(" 闂傚倸鍊峰ù鍥敋瑜嶉湁闁绘垵顫曢敓钘夊�块、姘舵晸娴犲宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣銏犲閺佸﹪鏌″搴″箹缂佹劖顨婇弻鈥愁吋鎼粹�冲闂佽桨绀佺�氫即寮诲☉銏╂晝闁绘灏欐禒楣冩倵鐟欏嫭绀�鐎殿喖鐖奸獮鍫ュΩ閵夊孩姊婚敓鏂ょ秵閸嬪嫰顢旈崼鏇熺厽閹兼番鍊ゅ鎰箾閸欏鑰块柕鍡楀暞缁绘繈宕樿缁犳岸姊虹紒妯虹伇婵☆偄瀚ú鍧楁⒒娴ｈ鍋犻柛搴櫍瀵彃顭ㄩ崼婵嬫７婵炲濮撮鍡涘煕閹烘嚚褰掓晲婢舵ɑ顥栨繛鎴炴尰閻擄繝寮婚悢鐓庣闁靛牆妫楅锟�?"));
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸崹楣冨箛娴ｅ湱绋佺紓鍌氬�烽悞锕佹懌闂佸憡鐟ョ换姗�寮婚悢铏圭＜闁靛繒濮甸悘鍫ユ⒑濞茶骞楁い銊ワ躬瀵鈽夐姀鐘靛姶闂佸憡鍔︽禍鏍ｉ崼婵冩斀闁宠棄妫楁禍婵嬫煥閺囨ê鐏茬�殿喖顭烽幃銏焊娴ｅ湱浜栭梻浣稿閻撳牓宕板Δ鍛�剁�广儱顦伴埛鎴澝归崗鑲╂噮缂佸鍠栭湁婵犲﹤鍟伴崺锝嗩殽閻愭彃鏆欓柣锝忕節楠炲秹鎼归銈忔嫹婵犳碍鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告创妞ゃ垺鐗犲畷鐔碱敆閸屾粎妲囬梻渚�娼х换鍫ュ垂濞差亶鏁傞柣鏂垮悑閻撴瑩鏌涢幋娆忥拷鏍拷姘炬嫹,闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾粌顤�闂佺顑戠换婵嬪蓟閺囥垹閱囨繝闈涙搐缁愭盯姊洪崨濠庢畷鐎癸拷閹间礁钃熼柣鏃囨绾惧ジ鏌曡箛鏇炐ｉ柣蹇撶墦濮婂搫煤鐠囨彃绠哄銈冨妼閿曨亜顕ｆ繝姘嵆闁绘棃顥撶粣鐐烘⒑閸撴彃浜濈紒璇插�归幈銊╁閵忋垻锛濇繛杈剧到閹碱偅鐗庨梻浣规偠閸斿酣寮繝姘伋闁哄啫鐗嗙粈鍐┿亜閺傛寧顫嶇憸鏃堝蓟濞戙垹唯闁靛繆鍓濋悵鏃傜磽娴ｈ娈ｇ紒缁樼箓椤繐煤椤忓嫪绱堕梺鍛婃处閸嬫捇骞忛柨瀣垫Ч閹兼番鍩勯崑銊モ攽椤旀枻渚涢柛鎾寸洴瀵娊鏁冮崒娑氬幗闂佺鎻徊楣兯夋径鎰畾闁绘柨顨庡〒濠氭煏閸繈顎楁鐐搭殜閺屾盯濡搁妷褍鐓熼悗瑙勬礃閸ㄦ寧淇婇悜钘夌厸闁稿本顨嗙�氬ジ姊绘担绋挎倯缂佷焦鎸冲鏌ュ煛閸涱厾鍝楁繛瀵稿帶閻°劑宕愰崼鏇犲彄闁搞儵顥撶�佃偐绱掗妸銈囩煓闁哄瞼鍠栭悰顕�宕归鍙ユ偅婵＄偑鍊ら崑鍛垝閹捐鏋侀柟鍓х帛鐎电姴顭跨捄鐑樻拱婵炲牊鍎抽埞鎴炲箠闁稿﹥娲熼獮濠冩償閳╁啯娈伴梻鍌氬�风欢姘焽瑜旂瘬闁跨喕妫勯埞鎴﹀灳閾忣偄鏋犻梺璇″灠閸燁垳鎹㈠┑鍡╂僵妞ゆ挻绋掔�氬ジ姊绘担鍛婂暈缂佽鍊婚敓鑺ュ嚬閸樹粙宕氭繝鍐檮闁告稑锕﹂崢閬嶆⒑闂堟丹娑㈠礃閻愵剚鐦旈梻鍌欑閹碱偊骞婃惔銊﹀亯濠靛倻顭堥弸渚�鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓
		gnet.link.Onlines.getInstance().insert(this, roleid);
		StateManager.logger.error(new StringBuilder("roleid=").append(roleid).append(" CEnterWorld: 闂傚倸鍊峰ù鍥敋瑜嶉～婵嬫晝閸岋妇绋忔繝銏ｅ煐閸旀牠宕戦妶澶嬬厸闁搞儮鏅涘皬闂佺粯甯掗敃銉ф崲濞戙垹骞㈡俊顖濇娴犳挳姊洪幖鐐插缂佽鐗撳濠氬Ω閳哄倸浜滈梺鍛婄箓鐎氬懘濮�閵忋垻锛滈梺璺ㄥ枙婵倕顕ラ崟顖氱疀妞ゆ挾濮撮獮妤佺節绾版ɑ顫婇柛銊ф暬椤㈡俺顦寸�垫澘锕幊锟犲Χ韫囨柨顏跺┑鐐茬墕閻忔繈寮搁悢灏佹斀闁绘劘顕滈煬顒傦拷娈垮枛椤嘲顕ｉ幘顔碱潊闁斥晛鍟鐔兼⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�?"));
		
		PRoleOnline pRoleOnline = new PRoleOnline(userId,roleid);
		try
		{
			if (rolesnum > 0) 
				new mkdb.Procedure()
				{
					protected boolean process() throws Exception {
						final xbean.Properties roleProp = xtable.Properties.get(roleid);
						if (null == roleProp)
							return false;
						if(roleProp.getSysconfigmap().size() == 0){
							GameSystemConfig.resetSysConfig(roleProp);
						}
						
						Integer oldMaxScreenShowNum = roleProp.getSysconfigmap().get(SysConfigType.MaxScreenShowNum);
						if(oldMaxScreenShowNum == null)
							oldMaxScreenShowNum = 0;
						if(rolesnum == oldMaxScreenShowNum)
							return true;
						roleProp.getSysconfigmap().put(SysConfigType.MaxScreenShowNum, rolesnum);
						return true;
					};
				}.submit().get();
			pRoleOnline.submit().get();
		} catch (Exception e)
		{
			StateManager.logger.error(new StringBuilder("roleid=").append(roleid).append(" 闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掍礁鍓銈嗗姧缁犳垿鐛姀銈嗙厓閺夌偞澹嗛崝宥嗐亜閺傚灝顏慨濠勭帛閹峰懘宕ㄦ繝鍌涙畼闂備浇宕甸崰鍡涘磿鏉堫偆浜辨繝鐢靛█濞佳兾涘☉銏犳辈闁挎梻鏅粻楣冩煕閳╁喚娈橀悹鎰ㄦ櫆缁绘稑顔忛缁樺枤闂佽桨绀侀崐鍧楀蓟濞戞ǚ妲堥柛妤冨仦閻忓秹姊虹紒妯肩缂佺姵鎸搁～蹇曠磼濡顎撴繛鎾村嚬閸ㄥ崬鈻撴导瀛樷拺闁荤喐婢樺▓鈺呮煙閸戙倖瀚�?").append(e));
		}
		new DRoleOnlineFail().doDone(pRoleOnline);
	}
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786437;

	public int getType() {
		return 786437;
	}

	public long roleid;
	public int rolesnum; // 同屏能看见的人数

	public CEnterWorld() {
	}

	public CEnterWorld(long _roleid_, int _rolesnum_) {
		this.roleid = _roleid_;
		this.rolesnum = _rolesnum_;
	}

	public final boolean _validator_() {
		if (roleid < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(rolesnum);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		rolesnum = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CEnterWorld) {
			CEnterWorld _o_ = (CEnterWorld)_o1_;
			if (roleid != _o_.roleid) return false;
			if (rolesnum != _o_.rolesnum) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += rolesnum;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(rolesnum).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CEnterWorld _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = rolesnum - _o_.rolesnum;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

