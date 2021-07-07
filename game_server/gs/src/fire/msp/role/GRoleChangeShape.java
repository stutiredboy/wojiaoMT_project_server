
package fire.msp.role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GRoleChangeShape__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GRoleChangeShape extends __GRoleChangeShape__ {
	@Override
	protected void process() {
		// protocol handle
		fire.pb.scene.movable.Role  role = 
				fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
			if(role == null) return;
			if(null == role.getScene()) return;
			role.setModeid(shape);
			mkio.Protocol send;
			if (reason == HUANSE) {
				send = new fire.pb.move.SRoleModelChange();
				((fire.pb.move.SRoleModelChange)send).roleid = roleid;
				((fire.pb.move.SRoleModelChange)send).shape = shape;
			} else {
				send = new fire.pb.move.SRoleChangeShape();
				((fire.pb.move.SRoleChangeShape)send).roleid = roleid;
				((fire.pb.move.SRoleChangeShape)send).shape = shape;
			}
		//	role.sendWhoSeeMeAndMe(send);
			if(role.checkVisible())
			{
				role.sendAround(send);
			}
			// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞剧洴楠炲洭顢涘鍗烆槱闂備焦鐪归崹褰掆�﹀畡閭︽綎缂備焦蓱婵挳鏌ｉ悢鐓庝喊闁搞倕顑呴埞鎴︽倷閹绘帞楠囬梺缁橆殘婵挳鎮鹃悜钘夌疀闁哄娉曢鎰箾鏉堝墽鎮兼い顓炵墦閹顢橀姀鈾�鎷虹紓浣割儓濞夋洟鎮橀柆宥嗙厱閻庯綆鍓欐禒閬嶆煙椤曞棛绡�濠碉紕鍏橀崺锟犲磼濠婂啫绠洪梻鍌欑閹碱偄煤閵娾晛纾绘繛鎴欏灪閺呮悂鏌﹀Ο渚Ч閻犳劧绻濋弻銊╂偄鐠囨畫鎾绘煟閺冩垵澧存鐐茬箻閺佹捇鏁撻敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐鍛傜喎鈻庨幆褎顔勭紓鍌欒兌婵挳鎮樺璺何﹂柛鏇ㄥ枤閻わ拷闂佸湱鍋撻幆灞轿涢妶鍥╃＝濞撴艾锕ョ�氳绻濋悽闈浶㈡繛璇х畵閹繝濡烽埡鍌滃幗闂佸搫鍟ù鍌炲吹濞嗘垶鍋栨慨妯夸含绾捐棄霉閿濆牊顏犻悽顖涚洴閺岋綁鍩℃繝鍌滀哗闂佷紮绲块崗姗�銆侀弮鍫濋唶婵犻潧鐗滃Σ鐗堜繆閻愵亜锟芥洜鎹㈤幇鏉胯摕濠电姴鍋嗛悡銉╂煕椤愩倕鏆遍柟鐤缁辨帞绱掗姀鐘茬闂佺懓鍟跨换姗�骞冮悽鍓叉晜闁糕剝鐟ч敍婊冾渻閵堝棙顥嗗┑顔哄�楁禍鎼侇敇閵忥紕鍘介梺鎸庣箓椤︿即寮潏鈺冪＜闁惧繗顫夊▍鏇犵磼椤旂晫鎳囩�规洖缍婇、娆撴嚃閳瑰灝浠忛梻鍌氬�搁崐鐑芥嚄閸撲礁鍨濇い鏍仜閽冪喖鏌曟繛鍨姶闁搞倖娲熼弻娑㈠箻閼碱剛鐡橀梺鐟板槻閸㈡煡锝炲┑瀣垫晝闁靛牆娲ㄩ崢顖涚節濞堝灝鏋涢柨鏇閸掓帡顢涢悙鑼唵闂佸憡绋掑娆忣啅濠靛棌鏀介柣妯诲絻閿熺晫鎳撻埢鎾愁潨閿熻棄顫忕紒妯诲闁告稑锕ら弳鍫濃攽閳藉棗浜濋柛銊ョ仢椤繑绂掔�ｎ亞顦板銈嗘尵婵兘鎮為崸妤佸�垫鐐茬仢閸旀岸鏌熷畡閭﹀剶闁诡噯绻濇俊鐑藉煛閸屾粌骞堟俊鐐�栭崝褏寰婄捄銊т笉闁瑰墽绮悡鏇㈡煏閸繃顥滈柣蹇旀尦閺屸�崇暆閿熶粙宕伴弽褏鏆︽俊銈呮噺閸ゅ啴鏌嶉崫鍕拷褰掝敊閸愵喗鈷掑ù锝呮啞閸熺偤鏌＄仦璇插缂侇喗妫侀妵鎰板箳閹寸姷鏆梻浣哄仺閸庢煡寮告總绋垮嚑閹兼番鍔嶉悡娆撴煟閹伴潧澧紓宥嗗灥闇夐柣娆欐嫹闁搞劏娉涢～蹇撁洪鍕啇闂佺粯鍔栬ぐ鍐╂叏鎼粹檧鏀介柣鎰皺濠�鎾煕婵犲喚娈滈柡浣规崌閹崇偤濡烽妷銉︾槗闂備礁鎲￠幐楣冨窗閺嶎厼违濞撴熬鎷风�殿噮鍣ｅ畷濂告偄閸涘浠ч梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁橈耿瀵鏁愭径濠勵吅濠电姴鐏氶崝鏍礊濡ゅ懏鈷戦悹鎭掑妼閺嬫瑦淇婇銏狀伃鐎规洘鍔欏畷鐑筋敇閻樼數鍔归梻浣告贡閸庛倕螞閹达箑绠柣鎴ｅГ閺呮煡骞栫划鐧告嫹閼碱剙鍤┑鐘垫暩閸嬫盯骞婂畝鍕瀭闁芥ê顦藉鏍ㄧ箾瀹割喕绨奸柛銈呯Ч閺屾洘寰勬繝鍌涚亾婵炲瓨绮犳禍锝呂涢悢濂夋富闁靛牆妫涙晶閬嶆煕鐎ｎ偆鈽夐弫鍫ユ煛鐏炶鍔滈柍閿嬪灦閵囧嫰骞掗悙鏉戭伓缂傚倷绀侀ˇ閬嶅极婵犳艾绠栭柨鐔哄Т鍞梺鍐叉惈閸婂宕㈡禒瀣拺闁告繂瀚弳娆撴煕婵犲懎鍚归柡渚囧枛閳藉鈻庡鍕泿闂備線娼чˇ顓㈠磿閸濆嫀锝夋惞閸︻厾锛滈柡澶婄墑閸斿秶浜搁鐔翠簻闁瑰墽鍋ㄩ崑銏拷瑙勬处娴滎亜鐣峰锟介、姗�鎮欓弶鎴濆濠电姴鐥夐弶鍖℃嫹濡や焦鍙忛柣鎴ｆ绾剧粯绻涢幋娆忕仼闁汇値鍠楅妵鍕箛閳轰礁濮㈡繛瀛樼矆缁瑥顫忓ú顏呭殥闁靛牆鎲涢姀锛勭婵炴潙顑嗗▍鍥瑰鍜佺劸闁宠閰ｉ獮瀣偐闂堟稓顔岄梻鍌欒兌缁垶宕濆Δ鍛？闁靛牆顦悡鏇㈡煙鐎电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑樺殮閻熼偊鐓ラ柨鐔剁矙瀹曪繝骞庨挊澶庢憰濠电偞鍨崹鍦不婵犳碍鍊甸梻鍫熺♁閸熺偤鏌涢敐鍕祮婵﹨娅ｉ幏鐘诲灳閾忣偆褰庢繝鐢靛仒閸栫娀宕卞▎搴ゅ焻闂傚倸鍊烽懗鍫曞储瑜旈敐鐐哄即閵忕姷锛欏┑掳鍊曢幊蹇涘磿婵犲洦鐓曟い鎰Т閸旀粓鏌嶉柨瀣伌婵﹤顭峰畷濂告偄閻戞ê鍨遍梻浣虹帛缁嬫帞鍒掓惔锝嗩潟闁圭儤顨呯粻鐢告煙閻戞ê鐏嶉柟绋垮暙閳规垿鎮欓弶鎴犱淮闂佽绻戝畝鍛婁繆閸洘鏅插璺猴功椤︺劑姊洪崘鍙夋儓闁哥噥鍋婇悰顕�骞囬悧鍫氭嫽婵炶揪绲块…鍫ニ夎箛娑欑厱閻庯綆鍋勫ù顔撅拷瑙勬礃閸ㄥ灝鐣烽悢纰辨晢濞达絽婀辫ぐ鍧楁⒒娴ｅ憡璐￠柧蹇撻叄瀹曟澘螖閸涱喖浜楀┑鐐叉閸旀垶绂嶅鍫熺厸闁搞儲婀圭花濂告倵濮橆剚璐＄紒杈ㄦ尰閹峰懘宕崟鎴秮閺岋絽螖閸愩剱銏°亜閺囶亞绋荤紒缁樼箓椤繈顢楅敓浠嬫嚀閸喒鏀介幒鎶藉磹閺囥垺鏅濋柕鍫濐槸缁犳牠鏌熸潏楣冩闁抽攱鍨圭槐鎺楊敍濞戞瑧顦ユ繝鈷�鍕弨闁哄本娲熷畷鍫曞煛娴ｉ攱顫曢柣搴ゎ潐濞叉粍绻涢敓鐣岋拷娈垮枙缁瑩銆佸锟介幃銏ゅ矗婢跺浼滃┑鐘垫暩閸嬬娀骞撻鍡欑闁跨喕妫勯埞鎴︻敊閸濆嫸鎷峰Δ锟介埥澶愭偨缁嬪潡鍞堕梺鍝勬川閸犳捇宕㈤柆宥嗏拺闁圭娴风粻鎾剁磼缂佹ê娴柟顕�绠栧畷褰掝敃椤愶綆鍟嶉梻浣虹帛閸旀浜稿▎鎴犱笉濠电姵纰嶉悡娑樏归敐鍫綈鐎规洖鐭傞弻鈩冩媴鐟欏嫬纾抽梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�?
			if (!teammembers.isEmpty())
				gnet.link.Onlines.getInstance().send(teammembers, send);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730914;

	public int getType() {
		return 730914;
	}

	public final static int TUIBIAN = 0;
	public final static int HUANSE = 1;
	public final static int OTHER = 2;

	public long roleid;
	public int shape;
	public int reason;
	public java.util.HashSet<Long> teammembers;

	public GRoleChangeShape() {
		teammembers = new java.util.HashSet<Long>();
	}

	public GRoleChangeShape(long _roleid_, int _shape_, int _reason_, java.util.HashSet<Long> _teammembers_) {
		this.roleid = _roleid_;
		this.shape = _shape_;
		this.reason = _reason_;
		this.teammembers = _teammembers_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(shape);
		_os_.marshal(reason);
		_os_.compact_uint32(teammembers.size());
		for (Long _v_ : teammembers) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		shape = _os_.unmarshal_int();
		reason = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			long _v_;
			_v_ = _os_.unmarshal_long();
			teammembers.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GRoleChangeShape) {
			GRoleChangeShape _o_ = (GRoleChangeShape)_o1_;
			if (roleid != _o_.roleid) return false;
			if (shape != _o_.shape) return false;
			if (reason != _o_.reason) return false;
			if (!teammembers.equals(_o_.teammembers)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += shape;
		_h_ += reason;
		_h_ += teammembers.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(shape).append(",");
		_sb_.append(reason).append(",");
		_sb_.append(teammembers).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

