
package fire.pb;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSetPilotType__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSetPilotType extends __CSetPilotType__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid( this );
		if (roleId < 0)
			return ;
		new mkdb.Procedure()
		{
			protected boolean process() throws Exception {
				final xbean.Properties roleProp = xtable.Properties.get(roleId);
				if (null == roleProp)
					return false;
				roleProp.setPilot(pilottype);
				
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鏉戭潩鏉堚敩銏ゆ⒒娴ｈ鍋犻柛搴㈡そ瀹曟粓鏁冮崒姘�梺鍛婂姦閸犳鎮￠妷鈺傜厸闁搞儲婀圭花濂告倵濮橆剛绉烘慨濠傛惈鏁堥柛銉戝秵瀚规俊銈呮噹绾惧鏌熼幑鎰厫鐎规洖寮剁换婵嬫濞戞瑥绐涚紓浣叉閹风兘姊绘担渚劸闁哄牜鍓涢崚鎺戠暆閸曗晪鎷烽崒鐐存優闁革富鍘鹃敍婵囩箾閹剧澹橀柨鏇樺劤閿熻姤淇洪～澶屾崲濠靛顫呴柨婵嗘閵嗘劕顪冮妶鍡楃仴婵☆偅绻傞悾鐑芥晲閸垻鏉搁梺鍝勫�告晶鐣岀不濮樿埖鈷戦梻鍫熺〒婢ф洟鏌熷畡閭﹀剶鐎规洘娲熼獮鍥偋閸繐鎷烽崹顐ｅ弿婵☆垰娼￠崫娲煕閵堝繑瀚归梻浣稿⒔缁垶鎮ч悩璇茶摕闁挎繂鎷嬪銊╂煥閻旂粯顥夋い顓炴穿椤﹀磭绱掗崒娑樼瑨妞ゎ厹鍔戝畷鐔碱敂閸℃瑧鏆板┑锛勫亼閸婃牠宕濊瀵板﹦鎹勯妸褌绗夐梺缁樺姉椤ｎ噣骞忓畡鎵虫灁闁割煈鍠楅悵顕�姊虹粙娆惧剰闁挎洦浜幃浼搭敊閸㈠鍠撳☉鐢告煥鐎ｎ亶浼撻梻鍌氬�搁悧濠勭矙閹次诲绠涢弮鍌滎啎闂佸搫顦伴崹鐢割敂椤撱垺鐓涚�癸拷鐎ｎ剛蓱闂佽鍨卞Λ鍐�佸☉姗嗙叆闁告稑鎷戠紞浣割潖閾忓湱鐭欐繛鍡樺劤閸撴澘鈹戦埥鍡椾簼缂佽鍊块幃楣冩倻閽樺娼婇梺闈涚墕閹虫劙顢欓幇顓犵閺夊牆澧介崚浼存煕濡崵鐭掓鐐茬箰鐓ゆい蹇撴噳閹锋椽姊洪崨濠勨槈闁挎洩绠撻崺銉﹀緞閹邦厾鍙嗛梺鍝勬处閿氶柨鐔诲Г閻楃娀鐛崼銉ノ╂い顓熷灦闉嬬紓鍌氬�峰ù鍥ㄣ仈閸濄儲鏆滈柨鐔哄Т缁犳牠鏌嶉崫鍕櫣缂侊拷閸愵喗鐓犵痪鏉垮船閸樺摜绱掓潏銊х疄闁哄矉绲鹃幆鏃堝Χ鎼淬垻绉锋繝鐢靛仜瀵爼鈥﹂崶顒�绠查柕蹇嬪�曠壕濂告煟閹存繃宸濈紒瀣箰閳规垿鎮╃紒妯婚敪濠电偠顕滄俊鍥╂閻愬搫鐐婃い鎺嶈兌閸樻捇姊洪崨濠勭畵閻庢凹鍓熷鎼佹晜閸撗咃紲闁哄鐗勯崝宀�寰婃繝姘厓閻熸瑥瀚悘鎾煙椤旂晫鎳呴柨鐔诲Г缁嬫帡鈥﹂崶鈺冪煓闁搞儺鍓氶埛鎴︽煕濞戞﹫榫氬瑙勆戦妵鍕箣濠垫劖鈻堝Δ鐘靛仜閸熸挳骞冨鍫熷殟闁靛闄勯悵鏇㈡⒒娴ｇ瓔娼愰柛搴㈠▕楠炲﹨绠涢弴顏呭婵ɑ鍓氬鎰版煙娓氬灝濡奸摶锝夋煟閹惧磭鍑瑰瑙勬礋閺岋絾鎯旈姀銏犳殹闂佺懓鍤栭幏锟�
				fire.log.YYLogger.usrFlgLog(roleId, "E1 : " + pilottype);
				
				return true;
			};
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786543;

	public int getType() {
		return 786543;
	}

	public int pilottype; // 适配引导类型  0新手 1老手

	public CSetPilotType() {
	}

	public CSetPilotType(int _pilottype_) {
		this.pilottype = _pilottype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(pilottype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		pilottype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSetPilotType) {
			CSetPilotType _o_ = (CSetPilotType)_o1_;
			if (pilottype != _o_.pilottype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += pilottype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(pilottype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSetPilotType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = pilottype - _o_.pilottype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

