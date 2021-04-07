
package fire.msp.move;

import fire.pb.battle.PSetBattleEndProcedure;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __MGotoAfterBattle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class MGotoAfterBattle extends __MGotoAfterBattle__ {
	@Override
	protected void process() {
		//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛瀣ㄥ�濋弻鏇熺箾閸喖顬夐梺鐟板暱閻倸顫忕紒妯诲闁告稑锕ラ崕鎾愁渻閵堝棗鐏ユ繛宸幖閻ｉ攱瀵奸弶鎴狀啋闂佺厧鎲￠鏍ь焽閻斿吋鈷戦柛锔诲幖閸斿銇勯妸銉﹀櫧缂侇喚绮换婵嗩潩椤撶儑鎷烽崹顐ょ闁瑰鍎愭禒鐐亜韫囨挾澧涢柛搴＄Ч閺屾洝绠涚�ｎ亷鎷烽弽顓炵厱闁硅揪闄勯悡鏇熺箾閹寸儑鍏顐ｈ壘椤法鎲撮崟鍡樺灩閹广垹鈽夐姀鐘甸獓闂佺懓鐡ㄧ换鍐х昂闂傚倷绀佺壕顓犲垝椤栫偛绠查柛銉墰瀹撲線鏌涢鐘插姕闁稿﹤鐏氱换婵嬪即閻樿櫕娈攅dure濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倿鏌ｉ幘宕囧哺闁哄鐗楃换娑㈠箣閻愰潧鏆￠梺鐟板槻閸㈡煡锝炲┑瀣亗閹兼番鍨昏ぐ搴繆閵堝洤啸闁稿鐩畷顖烆敍濠婂嫬搴婂┑鐘绘涧椤戝懘鎮欐繝鍥ㄧ厪濠电姴绻樺顕�鏌ｅ┑鎰喊婵﹨娅ｉ幏鐘绘嚑椤掑偆鍞洪梻浣侯焾椤戝洭宕伴弽顓炵畺婵炲樊浜滃Λ妯讳繆椤愩垻浠涙俊鐐跺Г娣囧﹪鎳滈棃娑氱獮闁诲函缍嗛崜娆撶嵁閹扮増鈷戦悹鍥ㄥ絻閸よ京绱撳鍛棦鐎规洘鍨垮畷鍗炩槈濞嗗繐澹掗梺璇插嚱缂嶅棝宕板Δ鍛亗闁哄洨鍠嗘禍婊勩亜閹捐泛鏋庨柣蹇嬪劚椤儻顦叉い鏇ㄥ弮閺佹捇鎳為妷顔兼櫛闂侀潻缍嗛崳锝呯暦濠婂啠鏋庨柟鐑樻煣缁ㄩ攱绻濋悽闈涗哗闁规椿浜炲濠囧锤濡わ拷绾惧潡鏌曢崼婵愭Ц闁绘挻娲熼弻锟犲炊閵夈儳浠鹃梺鎶芥敱閸ㄥ潡寮诲☉妯锋斀闁糕剝顨忔导锟藉┑鐘媰閸曨剛顦ㄩ梺闈涙搐鐎氫即寮崒婊勫珰闁告瑥顦辨禍楣冩⒒娴ｇ鎮戞俊鐐跺Г缁傚秹宕奸弴鐐寸�梺鐟板⒔缁垶宕戦幇鐗堢叄闊浄绲芥禍婵嬫煟濠垫劕浜版慨濠呮閹风娀鎳犻鍌ゅ敽闂備胶顭堥鍥ㄦ叏绾惧浜遍梻浣告啞濞诧箓宕归柆宥呯９闁割偅娲橀悡鐔兼煛閸屾氨浠㈤柟顔藉灴閺岋綁骞樼捄鐑樼亪闂佸搫鑻粔闈涱焽椤忓牆绠悘鐐舵鐢垶姊绘担鍛婅础闁哄拋鍋呯换娑㈡晸娴犲鐓欐い鏃囧吹閻瑦銇勯姀锛勨槈闁宠棄顦埢搴ょ疀閹惧瓨鏆樻繝寰锋澘锟芥鎱ㄩ悜钘夌；婵炴垶姘ㄩ惌鎾绘煟閹存繂顥為柛銉墯閸ゅ鏌ｉ幇甯嫹濞戞氨娉垮┑锛勫亼閸娿倝宕戦幒妤�绐楁俊銈呭枦閹峰嘲顫濋悙顒�顏�
		new PSetBattleEndProcedure(roleid, new PGotoAfterBattle(roleid, sceneid, posx, posy, gototype)).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 724899;

	public int getType() {
		return 724899;
	}

	public long roleid;
	public long sceneid; // 地图id
	public int posx;
	public int posy;
	public int gototype;

	public MGotoAfterBattle() {
	}

	public MGotoAfterBattle(long _roleid_, long _sceneid_, int _posx_, int _posy_, int _gototype_) {
		this.roleid = _roleid_;
		this.sceneid = _sceneid_;
		this.posx = _posx_;
		this.posy = _posy_;
		this.gototype = _gototype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(sceneid);
		_os_.marshal(posx);
		_os_.marshal(posy);
		_os_.marshal(gototype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		sceneid = _os_.unmarshal_long();
		posx = _os_.unmarshal_int();
		posy = _os_.unmarshal_int();
		gototype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof MGotoAfterBattle) {
			MGotoAfterBattle _o_ = (MGotoAfterBattle)_o1_;
			if (roleid != _o_.roleid) return false;
			if (sceneid != _o_.sceneid) return false;
			if (posx != _o_.posx) return false;
			if (posy != _o_.posy) return false;
			if (gototype != _o_.gototype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += (int)sceneid;
		_h_ += posx;
		_h_ += posy;
		_h_ += gototype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(sceneid).append(",");
		_sb_.append(posx).append(",");
		_sb_.append(posy).append(",");
		_sb_.append(gototype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(MGotoAfterBattle _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(sceneid - _o_.sceneid);
		if (0 != _c_) return _c_;
		_c_ = posx - _o_.posx;
		if (0 != _c_) return _c_;
		_c_ = posy - _o_.posy;
		if (0 != _c_) return _c_;
		_c_ = gototype - _o_.gototype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

