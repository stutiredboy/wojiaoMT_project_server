
package fire.pb;

import fire.pb.util.CGPlayUtil;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CEndPlayCG__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CEndPlayCG extends __CEndPlayCG__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid <= 0)
			return;
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮堥柕鍥у楠炲洭妫冨☉姗嗘浇闂佽瀛╅懝鍓х礊婵犲洤钃熼柕濞炬櫅閸楁娊鏌ｉ幇顖ｅ殝闁归鍏橀獮鏍ㄦ媴閻熷府鎷峰畡鎵虫斀闁绘ê寮舵径鍕煟閹惧啿鏆ｇ�殿喖鐖奸幃娆撳级閹搭厽顥嬫俊鐐�х拋锝囩不閹捐钃熼柨婵嗙墢閻わ拷闂佺懓鐏濈�氼剚瀵奸幇顒夋富闁靛牆绨肩花濠氭煕閻旈鎽犲ǎ鍥э躬瀹曞ジ寮撮悙鑼讹拷鍨攽閻愬弶顥滄繛瀛樿壘椤洦顦版惔锝囷紳闂佺鏈悷褏鎷规导瀛樼厱闁绘ê纾晶杈╃磼椤旇姤顥堥柟顔惧厴閺屽洭鏁冮敓钘夆枔閵娾晜鈷戦柛娑橈工婵洦淇婇姘捐含闁诡噯绻濇俊鐑藉煛閸屾粌骞堟俊鐐�栭崝鎴﹀磹閺囥垹鍑犻柡鍐ㄧ墛閻撴洘绻涢崱妤冪妞ゃ儯鍨洪幈銊︾節閸涱噮浠╃紓浣介哺鐢帟鐏掗梺鐓庮潟閸婃洖顕ｉ崘娴嬫斀闁绘﹩鍋呮刊浼存煕閹伴潧鏋涚�殿喕鍗冲铏规嫚閳ュ磭浠╅梺鍏兼た閸ㄥ爼宕洪姀鈩冨劅闁靛鍎抽鎺楁煟鎼达絾鏆╂い顓炵墦閻涱噣骞囬悧鍫㈠幗闁硅壈鎻徊楣冾敂閻斿吋鐓欏瀣閸樻挳鏌熼绛嬫疁闁轰焦鍔栭幆鏃堝灳閹颁焦浜ら梻鍌欒兌绾爼寮插☉銏″剹闁稿本鍑瑰鏍煕濠靛棗顏柡鍡畵閺屾盯濡烽敐鍛瀳濠电偛鐗嗛惌鍌氼潖濞差亜浼犻柕澶堝劜閻庨箖姊洪悷鐗堝暈濠电偛锕幃浼搭敋閿熻棄鐣峰锟芥俊鎼佸閿涘嫸鎷锋繝姘拺闁荤喐澹嗘禒銏ゆ煕閻曚礁鐏︾�殿喗鐓℃慨锟介柨娑樺椤旀洟鏌℃径濠勫濠⒀傜矙瀹曟碍瀵肩�涙鍘电紒鐐緲瀹曨剚绂嶉悙纰夋嫹閸偅绶查柨鏇ㄤ邯楠炴劖绻濋崘銊х獮闂佺硶鍓濊摫闁哄鎮傚缁樻媴閻熼偊鍤嬬紓浣割儐閸ㄥ綊鏁撻懞銉ュ毈闁告挻姘ㄧ划瀣吋閸℃瑩妾梺鍛婄☉閿曪箓宕㈡潏銊х瘈闁汇垽娼у瓭闂佸摜鍠撴晶妤呭疾閸洘鍋ㄧ痪鏉款槹鐎氳绻涢崼婵堜虎闁哄绋掗妵鍕敇閵忊剝鏆犳繛锝呮搐閿曘倝锝為姀鐘垫殕濠电姴鍞鍕拻濞达綀顫夐妵鐔兼煕濡湱鐭欐鐐村姈閵堬綁宕橀妸褏鏋�闂備礁缍婂Λ鍧楁倿閿曞倸纾婚悗锝庡枟閻撴洘銇勯幇鍓佹偧缂佺姵锕㈤弻锝夋偄閸濄儱寮ㄥ┑顔硷龚濞咃絿鍒掑▎蹇婃瀻闁诡垎鍐棈闂傚倷鑳堕…鍫ユ晝閵堝洨绀婂┑鐘插暕缁诲棝鏌ｉ姀銏╃劸缂侊拷鐎ｎ偁浜滈柡宥冨妽閻ㄦ垶銇勯弬鍖¤含婵﹥妞介幃鐑藉箥椤旇姤鍠栫紓鍌欐祰椤曆呯矓閻㈢鎷烽悽闈涘付闁伙絾绻堝畷鐔碱敄閼恒儱顏归梻浣告惈椤﹂亶宕戦悙瀵哥彾闁糕剝铔嬮崶顒佹櫇闁稿本绋撻崢閬嶆⒑缂佹ɑ鐓ラ柟璇х磿娴滄悂鏁傞幘鍛婵炲牆鐏濋弸娑欍亜椤撱垺鏁卞ǎ鍥э躬楠炴牗鎷呴懖婵勫姂閺屾洝绠涙繝鍐炬綉濠电偛鍚嬪鍦崲濠靛牆鏋堟俊顖涙た濞兼垿姊洪崜鑼帥闁搞劍濞婇獮蹇涘礃椤旇姤娅嗛梺鑺ッˇ浠嬪吹閵堝鈷戦悹鎭掑妼閺嬪秶绱掗鐣屾噧妞ゎ偄绻掔槐鎺懳熺拠宸拷鎾绘⒑缂佹ê鐏﹂柨姘箾閸繆瀚伴柍瑙勫灴閸┿儵宕卞Δ鍐у摋闂備焦瀵уú蹇涘磿瀹曞洤鍨濋悗锝庝憾閸氬顭块懜鐬垿寮插鍫熲拺闁告稑锕ョ粈锟介梺璇茬箲濮樸劎妲愰悙瀛樺劅闁靛鑵归幏娲⒑閸涘﹦鈽夐柨鏇缁骞樼紒妯猴拷鍨叏濮楀棗澧柛銈忔嫹婵＄偑鍊х粻鎴濓耿闁秵鏅搁柛濠勫櫏濞兼劖绻涢崣澶涜�跨�规洘娲樼缓浠嬪级閸℃鍠樼�规洩绲惧鍕醇濠婂懐娉垮┑锛勫亼閸婃牜鏁鍫濈闁绘垼濮ら悡鐔镐繆閵堝嫮鍔嶇�规洖鐬奸敓鑺ヮ問閸犳牠鈥﹂悜钘夋瀬闁圭増婢橀獮銏′繆椤栨碍鎯堝┑鈩冨▕濮婄粯绗熼敓钘夘焽瑜忛幑銏ゅ箳閹炬潙寮块梺鍝勵槹閸も晠骞掑Δ锟介柋鍥煏婢舵稖鍚傞柟閿嬫そ濮婃椽宕ㄦ繝鍕ㄦ闂佹寧娲╃粻鎾荤嵁婵犲洤绀冩い鏃傛櫕閸橀亶姊虹紒妯荤叆闁硅绱曟禍鎼佹晝閸屾稓鍘靛銈嗘椤曆冪暤閸℃ǜ浜滈柕蹇婏拷鍐叉懙闂佽桨鐒﹂幐鑽ょ矉閹烘棑鎷烽敐搴″缂佷緤绠撳娲箹閻愭彃濮堕梺鍛婃尰瀹�绋跨暦閹寸媴鎷烽敐搴℃灍闁绘挻娲橀妵鍕箛椤斿す銏ゆ煟韫囧﹥娅呴柍瑙勫灴椤㈡瑩鎳為妷銉嫹閹扮増鐓涚�癸拷鐎ｎ剛蓱闂佽鍨卞Λ鍐极瀹ュ绀嬫い鎾跺枑椤斿棝姊婚崒娆掑厡妞ゎ厼鐗撻弻濠囨晲閸℃瑯娲搁梺鍓插亝濞叉粌鐣垫担绯曟斀闁绘ê寮堕幖鎰磼閻樺磭娲撮柡灞稿墲瀵板嫭绻涙径鍝ラ挼缂傚倷娴囩划鎯р枖濞戙垹鐓橀柟瀵稿仜缁犵娀姊虹粙鍖℃敾婵炶尙鍠栭悰顔界節閸涱垳鏉稿┑鐐村灦椤洭宕㈤柆宥嗏拺缁绢厼鎳忚ぐ褔姊婚崟顐㈩伃鐎规洘鍨块弫鎰緞鐎ｎ剙骞堥梻渚�娼чˇ浠嬪垂瀹曞洨鐭撻柛顐ｆ礃閻撴瑧锟界懓瀚妯何ｆ繝姘厽闁挎繂娲ら崢瀵革拷瑙勬礀閻栧ジ寮婚妸褝鎷烽敐搴濇喚濞村吋鎸搁埞鎴︽偐閸偅姣勬繝娈垮枤閺佹悂宕版繝鍌ゅ悑濠㈣泛顑呮禍妤呮⒑閸濆嫭鍌ㄩ柛銊︽そ閹�斥枎閹剧补鎷哄銈嗘尪閸斿酣鎮鹃崡鐑嗙唵鐟滄粓宕抽敐澶婅摕闁跨喓濮撮獮銏＄箾閸℃绠ｆ繛宀婁邯濮婃椽妫冨☉娆愭倷闁诲孩姘ㄦ晶妤佺┍婵犲洤绠瑰ù锝堝�介妸锔轰簻闁哄秲鍔庣粻鎾绘煙椤栨氨澧﹂柡宀嬬稻閹棃濮�閳轰焦娅涢梻浣告憸婵敻鎮ч悩璇茬伋闁挎洖鍊归崐濠氭煢濡警妲归柣搴墴濮婇缚銇愰幒鎴滃枈闂佸憡顭堥崑鎰枎閵忋倖鍊锋繛鏉戭儐閺傦拷闂備胶绮摫鐟滄澘鍟撮、妤呭閵忋垻锛濋悗骞垮劚閹冲酣鏁撻挊澶屼虎妞ゎ偄绻掔槐鎺懳熼懖鈺傚殞闂備浇娉曢崰鏇炍涢崟顖楋拷锕傚炊椤忓秵鞋闂備胶鎳撶粻宥夊垂娴犲宓侀柟鐑橆殔缁犲鏌℃径瀣仴濞寸厧閰ｅ缁樻媴閾忕懓绗￠梺鎼炲妿閸樠嗙亱闂佸憡娲﹂崢鎯涢婊勫枑闊洦娲橀～鏇㈡煙閻戞﹩娈旈幆鐔兼⒑闂堟冻绱￠柨鐔剁矙瀵劎寮ч敓锟�
		new mkdb.Procedure(){

			@Override
			protected boolean process() throws Exception {
				
				fire.pb.buff.BuffAgent agent = new fire.pb.buff.BuffRoleImpl(roleid,false);
				agent.removeCBuffWithSP(CGPlayUtil.cgBuffID);
				/*fire.pb.map.Role role = RoleManager.getInstance().getRoleByID(roleid);
				if(id >= 11001 && id <= 11009)
				{
					Transfer.justGotoWhileCommit(roleid, role.getScene(), role.getPos().toGridPos().getX(), role.getPos().toGridPos().getY(), SRoleEnterScene.QUEST);
				}*/
				//GsClient.sendToScene(new GSetPlayCGState(roleid,(byte)0));
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786456;

	public int getType() {
		return 786456;
	}

	public int id; // 动画的id

	public CEndPlayCG() {
	}

	public CEndPlayCG(int _id_) {
		this.id = _id_;
	}

	public final boolean _validator_() {
		if (id <= 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CEndPlayCG) {
			CEndPlayCG _o_ = (CEndPlayCG)_o1_;
			if (id != _o_.id) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += id;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CEndPlayCG _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = id - _o_.id;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

