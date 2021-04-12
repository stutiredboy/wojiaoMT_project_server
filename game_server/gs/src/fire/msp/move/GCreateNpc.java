
package fire.msp.move;
import fire.pb.scene.SceneManager;
import fire.pb.scene.manager.SceneNpcManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GCreateNpc__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GCreateNpc extends __GCreateNpc__ {
	@Override
	protected void process() {
		// protocol handle
		for ( CreateNpcInfo npc : npcs ) {
			fire.pb.scene.movable.NPC ezei = 
				fire.pb.scene.manager.SceneNpcManager.getInstance().createNpc(
				npc.npcid, npc.npcname, npc.dir);
			fire.pb.scene.Scene dstscene = SceneManager.getInstance().getSceneByID(npc.sceneid);
			if (dstscene == null){
				SceneManager.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘鐓涢柛鏇楁櫅閸旓箓鏌＄仦鍓ф创鐎殿喗鎸虫俊鎼佸Ψ瑜岄崫妤呮⒒娴ｈ鍋犻柛鏂跨焸瀹曟劙骞栨担鍝ュ幋闂佺鎻粻鎴犲閸忚偐绡�濠电姴鍊归幑锝夋煕閺傛寧鎲哥紒杈ㄦ尰閹峰懘鎮烽弶娆炬綌婵＄偑鍊戦崝灞轿涘▎鎴犵煔閺夊牄鍔庣弧锟介梺鎼炲労閻忔稖顦归柣鎿冨亰瀹曞爼濡搁敂鎯у汲婵＄偑鍊曠换鎰版偉閻撳寒娼栨繛宸簻缁�鍌炴煟閹惧啿鐦ㄩ柛銈咁儔濮婃椽宕ㄦ繝鍐ｆ嫻闂佽崵鍟块弲娑㈩敋閿濆棛绡�婵﹩鍘兼禍婊堟⒑缂佹ɑ灏繛瀵稿厴閹偓銈ｉ崘鈹炬嫼缂傚倷鐒﹂敃鈺佲枔閺冨牊鐓熸俊銈勮兌閻﹪鎽堕悙鐑樼厱闁哄洢鍔岄獮妯肩棯閹规劖顥夐柕鍡樺笒椤繈顢楁担瑙勫�峰┑鐐茬摠缁秶鍒掓惔锝嗩潟闁圭儤鎸哥欢鐐测攽閻樻彃顏Δ鏃堟煟鎼淬埄鍟忛柛鐘崇墵閳ワ箑鐣￠柇锕�娈ㄩ梺鍦檸閸犳宕戦崟顐富閻庯綆浜濋幑锝夋煟濞戝崬娅嶆慨濠勭帛閹峰懐绮欏▎鐐棏闂備胶顭堥鍛村箠閹版澘绠查柕蹇嬪�曠壕鍏肩箾閹寸偟鎳冪�殿喖娼″娲濞戞氨鐤勯梺绋匡攻閻楃娀宕哄☉銏犵闁绘鏁搁敍婊冾渻閵堝棛澧紒瀣笧缁牓宕橀埡鍐啎闂佸憡渚楅崢浠嬎夐悙鐑樼厪闁搞儜鍐句純婵犵鍓濋幃鍌涗繆閻戣姤鏅濋柨鐔绘閳绘挸螖閿熶粙鍩為幋锔藉亼闁告侗鍠栭璺衡攽閻愬瓨灏伴柣鏃戝墴楠炲繘鏌ㄧ�ｎ偄寮挎繝鐢靛Т閹冲繘顢旈悩鐢电＜閺夊牄鍔岀粭鎺楁懚閿濆鍙撻柛銉ｅ姀婢规ê霉濠婂啰绉洪柡宀�鍠庨悾锟犲级閹稿孩顔掗梻浣芥〃缁�渚�宕弶鎴犳殾闁圭儤鍩堝鈺傘亜閹哄秶顦﹂柛鏃�甯掗埞鎴︽偐閸偅姣勯梺绋款儐缁嬫垼鐏嬪┑掳鍊曢崯顖氱暦閺屻儲鐓曢柍鈺佸暟閳藉绱撴担鍙夋珚闁哄被鍊濋獮渚�骞掗幋婵嗩潙濠电偛鐡ㄧ划宥囧垝閹捐钃熼柨鐔哄Т閻愬﹪鏌嶆潪鐗堫樂婵炲矈浜滈—鍐Χ閸愩劌濮㈤梺绋款儍閸婃繈鐛崘銊庢棃鏁撴禒瀣剁稏婵犻潧顑嗛崐閿嬨亜閹虹偞瀚瑰銈呴獜閹凤拷--濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊閻樺樊妫岄梺杞扮閿曨亪寮婚垾鎰佸悑閹肩补锟藉磭顔愮紓鍌欑劍閸旀牠銆冩繝鍥ц摕闁炽儱纾弳銈嗐亜閺冨洤浜归崯鎼佹⒑鐠恒劌鏋欐俊顐㈠椤洭鍨鹃幇浣圭稁濠电偛妯婃禍鍫曞极閸℃稒鐓ラ柣鏃傚劋濞呮洜绱掗鑺モ拻闁跨喍绮欏褔骞楀鍫熷仢缂備焦眉缁诲棝鏌曢崼婵囧櫤闁革絾妞介弻锝夊箻鐎靛憡鍣板┑顔硷攻濡炰粙銆佸锟芥俊姝岊槾闁哄棛濞�濮婃椽宕崟闈涘壄闂佺锕ュú鐔煎春閵夛箑绶為柟閭﹀墰椤旀帡鎮楃憴鍕婵炲绠撴俊鑸靛緞鐎ｎ剙骞嶉梻浣告啞閻熴儵藝娴兼潙纾归柟鎵閻撴瑦銇勯弬璇插婵炲眰鍊濋弻瀣炊閵娧呯槇闂傚倸鐗婄粙鎾存櫠閵忋倖鐓欓柛鎰级椤ョ姷绱掓潏銊﹀磳鐎规洘甯掗埢搴ㄥ箳閹存繂鑵愭繝鐢靛У椤旀牠宕板璺烘瀬闁归棿绀侀弸浣广亜閺囶亝瀚归梺杞扮劍閹瑰洭骞冮埡鍛殤闁肩鐏氶崯娲⒒閸屾瑨鍏岀紒顕呭灠椤繑绻濆顒傚幈闂佸壊鍋侀崕閬嶅几娴ｇ尨鎷烽獮鍨姎婵☆偅绋撶划缁樸偅閸愨晝鍘遍梺鏂ユ櫅閸犳艾鈻撳Ο鑲╃＜闁绘ê鍟块ˉ瀣磼鏉堛劌绗氱紒妤冨枛瀹曟儼顦抽柣婵囩箓閳规垿顢欑涵閿嬫暰濠碉紕鍋犲Λ鍕偩閻戠瓔鏁冮柨鏇嫹閸烆垶姊洪棃娑辨Ф闁稿﹥顨婇獮鎴﹀即閵忊檧鎷绘繛杈剧秬濞咃絿鏁☉銏＄厽婵°倓鐒︾粈瀣攽閳ュ啿顣崇紒顔界懃閳诲酣骞嗚椤撳灝鈹戦悩鍨毄濠殿喚鏁搁崰濠傤吋婢跺﹦锛涢梺鍛婃处閸ㄩ亶鎮￠悢鍏肩厵闁绘劦鍓欓埢鏇熴亜鎼淬埄娈滈柡宀嬬稻閹棃顢欓悡搴ｎ啇婵＄偑鍊ゆ禍婊堝疮鐎涙ü绻嗛柛顐ｆ礀楠炪垺淇婇妶蹇斿濡炪値鍋勫ú顓烆潖濞差亜绠归柣鎰絻椤懎顪冮妶搴′簻妞わ妇鏁婚悰顕�宕奸妷銉庘晠鏌嶆潪鎵窗婵炵厧锕娲濞戞艾顣哄┑鈽嗗亜閻倿鐛箛娑欐優闁革富鍘鹃敍婵囩箾閹剧澹樻繛灞傚�濋幃姗�鍩勯崘顏嗩啎闂佸憡鐟ラˉ銏ゎ敂閸繄鍘洪悗骞垮劚椤︻垰顔忓┑瀣�垫繛鎴炵懐閻掍粙鏌涘Ο缁樺�愭慨濠冩そ瀹曟粓骞撻幒宥堝焻闂備胶顭堥鍛拷姘煎弮瀵煡宕奸弴鐐殿吋濡炪倖鏌ㄦ晶浠嬫晬濠婂喚娓婚柕鍫濇閳锋帡鏌￠崪浣镐喊妤犵偛锕畷鐔碱敇閵婏箑顏堕梺鍓茬厛閸嬪懐娆㈤弻銉﹀�垫慨妯煎帶楠炴﹢鏌熼獮鍨仼闁宠鍨垮畷鍫曞Ω閵夈儱韦闂傚倷鐒﹂弸濂稿疾濞戙垹鐤い鎰堕檮閺呭摜绱掑☉姗嗗剰闁诲骏闄勯幈銊︾節閸曨厼绗￠梺鐟板槻閹虫劙骞夐幘顔肩妞ゆ劏锟借櫕鎲㈤梻鍌氬�烽懗鍫曗�﹂崼顫嫹閸偄娴�规洖婀遍幑鍕惞鐟欏嫭顔曟繝鐢靛█濞佳兠洪敃鍌氱？闁绘柨鍚嬮悡蹇撯攽閻樿尙绠抽柣锝呭船闇夐柣妯哄暱濞搭喗鎱ㄦ繝鍐┿仢婵☆偄鍟埥澶嬫綇閵婃劑鍨藉娲传閸曨剙娅ょ紓渚囧枟閹瑰洤鐣烽崫鍕ㄦ闁靛繒濮烽娲⒑缂佹ê濮堟繛鍏肩懃椤曪綁宕稿Δ浣叉嫼闂佺厧顫曢崐鏇㈠几閺傛鐔嗙憸搴ㄣ�冩繝鍥╁祦闁哄稁鍘肩粻娑欍亜閹达絽袚闁哄偊鎷烽梻鍌欒兌閸嬨劑宕曢幎钘夌；闁靛ň鏅涚壕濠氭煏韫囧锟芥牠鎮″▎鎰╀簻闁哄啫鍊婚幗鍌涚箾閸喐鈷愰柕鍥у椤㈡洟鏁愰崶鈺冩澖闂備浇顕栭崰鎺楀礈濠靛绠氶柡鍐ㄧ墕閻擄繝鏌涢埄鍏犵厧顫濋敃鍌涒拻闁稿本鑹鹃敓鐣屽厴閹偤鏁傞幘鍛缂佹绋戦崢鐐偊鐠恒劎鏉稿┑鐐村灦閿氶柣搴幗缁绘稓锟界數顭堝瓭濡炪倖鍨靛ú銈夋偩閸偅濯撮悷娆忓瀵灝鈹戞幊閸婃洟顢栭崱娆欐嫹濮樿鲸鍤�妞ゎ亜鍟存俊鍫曞礃閵娧傜棯闂備浇宕甸崯鍧楀疾閻樿崵宓佸┑鐘叉搐閸愶拷濡炪倖鎸鹃崑鐔煎储閸涘﹦绠鹃柟鍓ь棎婢规﹢鏌ㄩ弴妯哄姢闁跨喕濮ら懝鍓х礊婵犲洤钃熼柕濞炬櫆閸嬪棝鏌涚仦鍓р槈妞ゅ骏鎷�?");
				continue;
			}
			
			SceneNpcManager.getInstance().summonNpcAndUpdateGS(dstscene, 
					new fire.pb.scene.sPos.GridPos( npc.xpos, npc.ypos ).toPosition()	, ezei,0);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 724903;

	public int getType() {
		return 724903;
	}

	public java.util.LinkedList<fire.msp.move.CreateNpcInfo> npcs;

	public GCreateNpc() {
		npcs = new java.util.LinkedList<fire.msp.move.CreateNpcInfo>();
	}

	public GCreateNpc(java.util.LinkedList<fire.msp.move.CreateNpcInfo> _npcs_) {
		this.npcs = _npcs_;
	}

	public final boolean _validator_() {
		for (fire.msp.move.CreateNpcInfo _v_ : npcs)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(npcs.size());
		for (fire.msp.move.CreateNpcInfo _v_ : npcs) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.msp.move.CreateNpcInfo _v_ = new fire.msp.move.CreateNpcInfo();
			_v_.unmarshal(_os_);
			npcs.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GCreateNpc) {
			GCreateNpc _o_ = (GCreateNpc)_o1_;
			if (!npcs.equals(_o_.npcs)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += npcs.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npcs).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

