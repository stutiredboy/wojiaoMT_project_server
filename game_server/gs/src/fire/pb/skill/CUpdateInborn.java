
package fire.pb.skill;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CUpdateInborn__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CUpdateInborn extends __CUpdateInborn__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleId <= 0)
			return;
		final int apId = this.id;
		if(apId <= 0) return;
		if(flag == 0){
			new mkdb.Procedure(){
				@Override
				protected boolean process(){
					SkillRole srole = new SkillRole(roleId);
					srole.updateInbornWithValid(apId);
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閻橀潧骞堟繝娈垮枟閿曗晠宕㈡禒瀣︽繝闈涙閺�浠嬫⒔閸ヮ剙鏄ラ柡宓苯娈梺鍛婃处閸欏繘骞忛悜鑺ユ櫜閹煎瓨绻勯懗鍝勨攽閳ュ啿绾ч柛鏃�鐟ラ～蹇曠磼濡偐鎳濋梺璺ㄥ枙濡嫰鈥﹂崶顏嶆▉婵犫拃鍕疄婵﹥妞藉畷顐﹀礋椤掞拷濞呫倝姊洪悜鈺傛珦闁搞劌鐖奸悰顔跨疀濞戞顓洪梺鎸庢濡嫭绂嶅鍫熺厽闊洦鎸剧粻锝夋煟閹虹偟鐣电�殿噮鍓熼弫鎾寸鐎ｎ偀鎷绘繛杈剧秬濞咃絿鏁☉銏＄叆婵ɑ鍞婚幏宄扳枔閸喗鐏曢梺绯曟櫆閻楁洟顢氶妷鈺佺妞ゆ牗姘ㄩˇ鏉款渻閵堝棛澧紒瀣崌瀹曘垽鏌嗗鍡欏幗闁瑰吋鎯岄崹宕囩矓閻㈠憡鐓曢悗锝庝簼椤ョ姷绱掗纰辩吋闁诡喗鐟╅幃婊兾熼悡搴＄闂備浇顕х换鎺楀磻閻旂厧鐤炬い鎰剁悼婢р�斥攽閻樺灚鏆╅柛瀣枛閸╂盯宕奸悢渚锤濡炪倕绻愰悧蹇撶暤娴ｇ尨鎷烽獮鍨姎妞わ缚绮欏顐ｇ節閸ャ劌浠梺璇″幗鐢帗淇婄捄顭掓嫹鐟欏嫭绀�闁绘牜鍘ч～蹇旂節濮橆剛锛滃┑鐐叉閸╁牆危椤曪拷濮婅櫣娑甸崨顓夋挾绱掗鑺ュ碍闁伙絿鍏橀獮搴ㄦ嚍閵夛附鐝栭梻浣侯焾閺堫剙顫濋妸鈺婃晩闁糕剝眉缁诲棝鏌ｉ幇顒佲枙闁稿骸绻戠换娑㈠箻椤曞懏顥栨繝銏ｎ潐濞叉绮嬮幒鏃撴嫹閿濆骸浜為柛姗�浜堕弻锝堢疀閺囩偘娌悗瑙勬礃钃辩紒鏃傚枎椤粓鏁撴禒瀣摕闁靛ň鏅滈崑鍕煟閹寸倖鎴︽偟椤忓牊鈷戠紒瀣硶缁犳煡鏌ㄩ弴妯虹伈闁绘侗鍠楃换婵嬪磻閼恒儲顥堢�规洏鍔戦、姗�濮�閻樿櫕姣嗛梻鍌氬�风粈渚�骞栭鈷氭椽濡搁埡浣猴紱濠电偞鍨崹鍦閼姐倧鎷烽獮鍨姎妞わ缚鍗冲畷鎴﹀焺閸愵亞鐦堟繝鐢靛Т閸婃悂顢旈鍛簻闁靛鍎虫晶锕傛煛瀹�瀣埌闁宠棄顦靛畷锟犳倷鐎电缍嗛梺璇叉唉椤煤濮楋拷閺佸啴濮�閵堝懏妲梺璺ㄥ枔婵澹曢崗鍏煎弿婵妫楁晶顕�妫呴敃鍌涒拻闁稿本鑹鹃敓鐣屽厴閹偤鏁傞幘鍛缂佹绋戦幊蹇撶暦閺屻儲鐓曢悘鐐插⒔閻锟借娲橀悡锟犲蓟閻旂尨鎷烽悽娈跨劸妞ゅ孩鎹囬弻鐔风暋閺夋寧些濡炪値鍋呯换鍫ャ�佸Δ鍛＜婵犙呭亼閸旀垵顫忓ú顏勪紶闁告洦鍓氶幏閬嶆⒑閻戔晜娅撻柛銊ㄦ硾椤曪綁顢曢敃锟界壕鍏肩節婵犲倸顏╅柣婵呭嵆濮婃椽宕烽鐘茬闁汇埄鍨抽崑銈夈�佸▎鎾崇疀妞ゆ垼濮ら弬锟介梻浣虹帛閸旀洖螣婵犲洤鍚归柣鏂跨殱閺�鑺ャ亜閺冨倸浜鹃柡鍡忔櫊閺屾盯骞掗幘宕囩懆闂佷紮绲剧换鍫濈暦閻旂⒈鏁冮柕鍫濇噹缁狅綁姊婚崒娆掑厡妞ゃ垹锕獮鎾活敂閸☆厽瀚归梻鍫熺〒閻掑摜锟芥鍣崑鍛崲濠靛鐐婇柕濞у啫绠诲┑鐘垫暩閸嬬偛顭囧▎鎿冩晞闁糕剝銇涢弸宥夋煕閵夛絽濡稿ù婊勭矒閺岋繝宕橀幐搴☆伓闂佹眹鍩勯崹杈╂暜閻斿吋鍊堕柛鎰靛枟閳锋垹绱撴担鐧稿叕闁肩増瀵х换娑欐媴閸愭彃顏い鈺冨厴閺屻劑寮撮悙璇ф嫹瑜版帒纾婚柕濠忚礋娴滄粓鏌″鍐ㄥ姎闁跨喕濮ら〃鍫濐嚕瑜旈弫鎾寸鐎ｎ偀鎷虹紓鍌欑劍鐪夌紒鍫曚憾閺屾盯鏁愯箛鏇犘滈梺缁樹緱閸ｏ綁鐛幒妤�绠犻柧蹇ｅ亝椤ュ牓鏌℃担瑙勫鞍缂佸倹甯為敓鏂ょ秵娴滅偤銆侀崨瀛樷拺閻熸瑥瀚崝璺衡攽椤斿搫锟芥繈骞冮檱缁犳盯骞橀娑欐澑闂備胶绮…鍫焊濞嗘垹涓嶇紓浣姑肩换鍡欑磽娴ｉ潧鐏╂繛鍛Ч閺岋紕浠︾粙鍨拤閻庡灚婢樼�氼厾鎹㈠┑瀣闁靛闄勯悾鑲╃磽閸屾艾锟界兘鎳楅崜浣稿灊妞ゆ牗绮嶅畷鏌ユ煕瀹�锟介崑娑㈡偂濠靛鐓欓柟瑙勫姦閸ゆ瑩鏌涢妸銉ワ拷褰掑Φ閸曨垰绫嶉柛灞剧♁閻濐亪鎮峰鍛暭闁绘挴锟芥剚娼栫紓浣股戞刊鎾煟閹寸伝顏勨枔瀹�鍕拺闁硅偐鍋涢敓鑺ョ墵閹囨偐閼姐倕绁﹂棅顐㈡处缁嬫帡寮查幖浣圭叆闁绘洖鍊圭�氾拷?
					mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PRoleZongheRankProc(roleId));
					return true;
				}
			}.submit();
		}else{
			new PInbornWithValidProc(roleId, apId).submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800445;

	public int getType() {
		return 800445;
	}

	public int id;
	public byte flag; // 0默认方式  1=一键

	public CUpdateInborn() {
	}

	public CUpdateInborn(int _id_, byte _flag_) {
		this.id = _id_;
		this.flag = _flag_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		_os_.marshal(flag);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_int();
		flag = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CUpdateInborn) {
			CUpdateInborn _o_ = (CUpdateInborn)_o1_;
			if (id != _o_.id) return false;
			if (flag != _o_.flag) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += id;
		_h_ += (int)flag;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(flag).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CUpdateInborn _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = id - _o_.id;
		if (0 != _c_) return _c_;
		_c_ = flag - _o_.flag;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

