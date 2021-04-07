
package fire.msp.npc;

import fire.pb.map.SceneNpcManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __MUpdateNpcInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class MUpdateNpcInfo extends __MUpdateNpcInfo__ {
	@Override
	protected void process() {
		// protocol handle

		new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				for (NpcInfo createinfo : npcs)
				{
					SceneNpcManager.getInstance().createAddNewNpc(createinfo);

				}

				// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涘▎蹇涱�楁い顐㈢箻閺佹捇鏁撻敓锟�?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ｅΟ鍏兼毄闁绘帒鍚嬬换娑欐綇閸撗呅滃┑鐐靛帶椤兘骞婇幘璇查敜婵°倓鑳堕崢钘夆攽椤旂瓔鐒惧ù婊庡墯缁傚秶绱炴ィ鍐┾拻闁稿本鑹鹃敓浠嬵棑缁牊绗熼敓浠嬬嵁婢舵劖鏅柛鏇ㄥ墯濞堟澘鈹戞幊閸婃洟宕导瀛樺剹婵炲棙鎸婚悡娆撴倵閻㈡鐒鹃崯鍝ョ磼閹冪稏缂侇喗鐟╁濠氭偄閻撳海顔夐梺閫涘嵆濞佳冣枔椤撱垺鐓熼柣鏂挎憸閹虫洜绱掗悩铏磳闁绘侗鍣ｅ浠嬧�栭妷銉╁弰妞ゃ垺鐗滈幑鍕Ω瑜滃Σ顖炴⒒閸屾瑧顦﹂柟纰卞亜鐓ら柕蹇嬪�曢崹鍌滄喐閻楀牆绗氶柛搴㈩殕娣囧﹪濡堕崨顔兼闂佺粯鎸婚悷鈺呭箖濡わ拷閳藉鈻庡Ο鐓庡Ш闂備焦妞块崢濂稿嫉椤掑嫬桅闁告洦鍠氶悿锟介梺瑙勫劤閻ゅ洭宕洪悙鐑樷拻闁搞儜灞拘х紓浣虹帛缁诲啰鎹㈠┑瀣＜婵﹢妫跨槐鎴︽⒒娴ｅ摜锛嶆い鎴炴礋瀹曟洖鐣烽崶顭戞綗闂佸湱鍎ら〃鍛劔闂備焦瀵х换鍌炲箠鎼淬劉锟芥牗寰勫畝锟界壕钘壝归敐鍥剁劸濞存粈鍗抽弻鐔煎礄閵堝棗顏�?,闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢绘俊鐐�栭悧婊堝磻濞戙垹鍨傞柛灞剧◤娴滄粓鏌″鍐ㄥ闁靛棙甯楅妵鍕煛閸屾粌寮ㄩ梺鍝勭灱閸犳牠骞冨鍐炬建闁糕剝顭囬弳銉╂⒒娴ｅ憡璐￠柟铏崌閹儲绺界粙鑳憰闂佸搫娲ㄩ崰鎾剁不妤ｅ啯鐓曟い顓熷灥閺嬫稒銇勯锟介鍥╂閹惧瓨濯撮柛婵嗗珔閵夆晜鐓欓柧蹇ｅ亝瀹曞矂鏌涢埞鍨姕鐎垫澘瀚伴獮鍥敆閸屻倕鏅梻浣藉吹婵烇拷缂傚倹鑹鹃埢宥夋晲閸滀胶锟藉墎绱掓径瀣垫瀫cedure闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴姘舵濞存粌缍婇弻娑㈠箛闂堟稒鐏嶉梺绋垮椤ㄥ﹪寮诲☉姘勃闁诡垎鍐╃槗闂備胶绮敮鐔肺涢崟顖涚畳闂備胶顭堢换鎰板触鐎ｎ剛绀婇柟瀵稿Х绾惧ジ鏌ㄩ悢鍓佺煓闁轰焦鎹囬弫鎾绘晸閿燂拷?
				pexecuteWhileCommit(new PExecuteAfterNpcCreate(npcs));
				return true;
			}
		}.submit();

	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730397;

	public int getType() {
		return 730397;
	}

	public java.util.LinkedList<fire.msp.npc.NpcInfo> npcs;

	public MUpdateNpcInfo() {
		npcs = new java.util.LinkedList<fire.msp.npc.NpcInfo>();
	}

	public MUpdateNpcInfo(java.util.LinkedList<fire.msp.npc.NpcInfo> _npcs_) {
		this.npcs = _npcs_;
	}

	public final boolean _validator_() {
		for (fire.msp.npc.NpcInfo _v_ : npcs)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(npcs.size());
		for (fire.msp.npc.NpcInfo _v_ : npcs) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.msp.npc.NpcInfo _v_ = new fire.msp.npc.NpcInfo();
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
		if (_o1_ instanceof MUpdateNpcInfo) {
			MUpdateNpcInfo _o_ = (MUpdateNpcInfo)_o1_;
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

