
package fire.pb.instancezone.bingfeng;
import fire.pb.util.DateValidate;
import mkdb.Procedure;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCanEnterBingFeng__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CCanEnterBingFeng extends __CCanEnterBingFeng__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid == -1)
			return;
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				BingFengRole bingFengRole = new BingFengRole(roleid, true);
				if (bingFengRole.getBingFengRoleBean().getTimes() <= 0) {
					//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐑嗙劯婵炴垶顭囬弳鍡涙煕閺囥劌浜炴い锔诲幖閳规垿鎮╃紒妯婚敪濡炪倖鍨甸幊搴㈡櫏闂佸搫琚崕鏌ユ偂閻斿吋鐓涢柛灞句緱閸庛儲绻涢崼銏犫枅闁哄本鐩幃銏ゆ煥鐎ｎ亝鐣婚梻浣告惈鐞氼偊宕愬Δ鍛獥濠电姴娲ょ涵锟介梺缁樺姇濡﹤顭囨ィ鍐┾拻濞达絽婀卞﹢浠嬫煕鎼淬劋鎲炬鐐诧工椤粓鏁撻挊澶樺殨濠电姵纰嶉弲鎻掝熆鐠虹尨鍔熼柛鏃撶畱椤啴濡堕崱妤呭殝闂佺懓鍢查崲鏌ュ煘閹达箑鐏抽柣鎰娴狀噣姊洪崫鍕効缂傚秳绶氬顐﹀箛椤撶喎鍔呴梺鐐藉劜閸撴艾顭囬悾宀�纾介柛灞剧懅椤︼箓鏌涚�ｎ亷韬鐐茬箻閺佹捇鏁撻敓锟�?
					xbean.RoleBFInfo rolebingFengInfo = BingFengLandMgr.getInstance().getRoleBingFengInfo(roleid, 0, false);
					bingFengRole.getBingFengRoleBean().setTimes(bingFengRole.getBingFengRoleBean().getTimes() - 1);
					long currentTime = System.currentTimeMillis();
					
					//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告噧妞ゆ洩绲介悾锟犳焽閿旇棄鐦滈梻渚�娼ч悧鍡椢涘☉娆愭珷妞ゆ帒鍊诲Λ顖炴煛婢跺孩纭堕弫鍫ユ⒑缂佹ɑ鎯勯柛鎾跺枛閵嗕礁螖閸涱厾顦板銈嗗笒閸婃悂鐛崼鐔虹瘈婵炲牆鐏濋弸鐔兼煥閺囨娅婄�规洘绮岄埢搴ㄥ箻閹插瀚归柛鎰╁妷閺嬪酣鏌熺�电啸闁挎稒绮撳娲传閸曨偓鎷烽挊澶嗘灃闁哄洢鍨圭粻娲煟濡⒈鏆滈柟椋庡厴濡啫鈽夊Ο鑲╂晨闂備胶鎳撻崵鏍箯閿燂拷?,闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囨繝寰锋澘锟芥洟骞婅箛娑樼；闁挎稑瀚崰鎰拷骞垮劚濞层倕顕ｉ弻銉︹拻濞达絼璀﹀鎺楁煕閺囩偟浠涢柣锝呭缁辨挻鎷呴崫鍕戯絽鈹戦悙璇ц含鐎殿喖顭峰鎾偄妞嬪海鐛梻浣稿閸嬪懐鎹㈤崒鐐╋拷鏍拷锝庡墰绾捐棄霉閿濆懏鎯堥弽锟犳⒑缂佹ɑ鎯堢紒缁樼箓椤曪絿鎷犲ù瀣潔闂侀潧绻掓慨鍫ュΩ瑜庨崰鎰拷骞垮劚濡盯銆呴悜鑺ョ厵闁绘垶蓱閳锋帞鐥幆褍鎮戝ǎ鍥э躬婵℃儼绠涢弬娆句紦濠碉紕鍋戦崐褎淇婇崶顒�鏋佸┑鐘虫皑瀹撲礁鈹戦悩韫抗闁哄啫鐗嗗婵囥亜閺冨洤浜规俊缁㈠枛閳规垿鎮╅鑲╀紘濠电偛顦伴惄顖炲极閸愵喖唯闁靛鍨洪悗娲⒑閸涘﹤濮﹂柛鐘愁殜閸╂盯骞嬮敂鐣屽幗闂佺粯姊婚…鍫ニ夌�ｎ�㈠綊鎮╁畷鍥ㄥ垱闂佸搫鐬奸崰鏍х暦閵婏妇绡�闁告劦鐓夐幏鐑藉箛椤曞棙瀚归悷娆忓婢跺嫰鏌涢妸銉у煟妤犵偞鐗為妵鎰板箳閹捐泛濮锋繝鐢靛仦閸ㄥ爼鎳濋悙顒佹珷闁诡垎锟介弨浠嬫煟閹邦垰鐓愮憸鎶婂懐纾奸棅顐幘閻瑦顨ラ悙瀵稿⒌妞ゃ垺娲熸俊鍫曞炊瑜嶇憴锕�鈹戞幊閸娧呭緤娴犲鐤い鎰╁�楁稉宥囨喐閻楀牆绗氶柣鎾存礋閺屾洘寰勯崼婵嗗闂佽偐顭堢紞濠囧蓟濞戞瑧绡�闁稿被鍊楅崥瀣倵鐟欏嫭澶勯柛銊ョ埣瀵偊骞樼紒妯绘闂佽法鍣﹂幏锟�
					if (DateValidate.inTheSameDay(currentTime, rolebingFengInfo.getLastchangetime())) {
						SCanEnterBingFeng scanenter = new SCanEnterBingFeng();
						scanenter.finish = 1;
						
						Procedure.psendWhileCommit(roleid, scanenter);
						return true;
					}
				}
				
				//濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洤顫忔繝姘唶闁绘柨鍢查獮蹇涙⒑閹稿海绠撴い锔诲灣缁鎮烽幊濠傜秺閺佹劙宕ㄩ鍏兼畼闁诲氦顫夐幐鍝ョ矓閻熼偊娼栨繛宸簼椤ュ牊绻涢幋锝勫惈闁告梹鎮傚铏圭矙閸噮鍔夐梺缁樻尨閿熻棄纾弳锕傛煙閻楀牊绶茬痪顓ㄦ嫹闂備胶绮崝蹇涘疾濠婂牞缍栫�广儱顦伴埛鎴︽偣閹帒濡兼繛鍛姍閺岀喖宕欓妶鍡楊伓?濠电姷鏁告慨鐑藉极閸涘﹤鍨旀い鎾跺剱閻斿棗銆掑鐐濡ょ姷鍋涚换姗�寮幘缁樻櫢闁跨噦鎷�?,闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛瀣ㄥ�濋弻鏇熺箾閻愵剚鐝曢梺绋款儏椤戝寮婚妸鈺傚亞闁稿本绋戦锟�?闂傚倸鍊搁崐椋庣矆娓氾拷楠炲鍩勯崘顏嗘嚌濠德板�曢幊搴ㄦ⒒椤栨稏浜滈柡鍥朵簼鐎氬綊鎮楃憴鍕闁搞劌銈歌棟鐟滅増甯楅悡娑㈡倶閻愭鐒惧褎鐓￠弻鐔风暋閻楀牆娈楅悗瑙勬处閸嬪﹤鐣烽悢鐓庡瀭妞ゆ劧绲垮Σ姗�姊婚崒姘拷鐑芥倿閿曞倹鍎戠憸鐗堝笒绾惧潡姊洪锟界粔瀵哥不閻樺厖绻嗘い鏍ㄧ懆椤掔喖鏌涢妶鍡樼闁哄本鐩垾锕傚箣濠靛懐鐩庣紓鍌欑婢у酣宕戦妶澶婄畺婵鎷烽柟顔界懇濡啫鈽夊Δ锟介ˉ姘節閻㈤潧浠滈柣妤�瀚板畷瑙勭鐎ｎ亣鎽曢梺鎸庣箓濡瑩宕曢悢鎼炰簻闁哄秲鍔庨埥澶嬨亜韫囥儲瀚�?,闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌ㄩ悢鍝勑㈢紒鎰殕缁绘盯骞嬮悜鍡欏姱濠电偞鍨崹鍦矆鐎ｎ偁浜滈柡鍐ㄦ处閵嗗啯鎱ㄧ憴鍕垫疁婵﹥妞藉畷銊︾節閸曨剙娅戞俊鐐�х粻鎾寸閸洖违闁告稑鐡ㄩ崐濠氭煠閹帒鍔ら柛姗嗕簼缁绘繈濮�閿濆棛銆愰梺缁橆殔濡繂鐣峰┑鍡╂僵闁煎摜鏁搁崢鎼佹⒑閸涘﹣绶遍柛鐘冲哺楠炲﹪宕堕浣哄幐閻庣櫢鎷烽柨鐔剁矙瀹曚即寮介鐐寸�梺鐟板⒔缁垶寮查幖浣圭叆闁绘洖鍊圭�氾拷?
				SCanEnterBingFeng scanenter = new SCanEnterBingFeng();
				scanenter.finish = 0;
				Procedure.psendWhileCommit(roleid, scanenter);
				return true;
			}
			
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 804557;

	public int getType() {
		return 804557;
	}


	public CCanEnterBingFeng() {
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
		if (_o1_ instanceof CCanEnterBingFeng) {
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

	public int compareTo(CCanEnterBingFeng _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

