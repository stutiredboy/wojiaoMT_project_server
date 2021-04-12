
package fire.pb.mission;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqMissionCanAccept__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqMissionCanAccept extends __CReqMissionCanAccept__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid( this );
		if ( roleid < 0 )
			return;
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垹顭峰缁樻媴閻熼偊鍤嬪┑鐐插级閻楃姴鐣烽幇鏉跨濞达絿顭堥悗顓㈡⒑缁嬭法鐏遍柛瀣仱閹繝濡烽埡鍌滃幗闂佸搫娲ㄩ崑娑㈡晸閽樺璐￠柨鐔诲Г閻旑剟骞忛敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫炵紓浣界堪閸婃繈寮诲☉婊庢Ъ闂侀潧娲﹂惄顖炲极閹捐妫橀柕鍫濇川閺嗐倝鎮楃憴鍕闁靛牆鎲￠幈銊╂晸娴犲鐓冮柕澶涚畱婢ь垶鏌ㄩ悢璇残撻柣鈺婂灠椤繐煤椤忓嫪绱堕梺鍛婃处閸ｎ喖顭囬崼鏇熲拺缂佸鐏濋銏ゆ煟閹垮嫮绡�妤犵偛鍟撮崹楣冨棘閵夛妇锟藉姊虹憴鍕姢妞ゆ洦鍙冨畷銏ゆ濞戣鲸瀵岄梺闈涚墕濡瑧浜搁悽鍛婄厱闁绘ê寮堕幑锝囩磼椤曞懎寮鐐村笒铻栧ù锝呮惈楠炲牓姊绘担鍛婃儓闁哥姵鐩獮蹇涙倻閼恒儳鍘介梺缁樻煥瀵泛鈻嶆繝鍕舵嫹濞堝灝鏋涙い顓犲厴楠炲啴濮�閵堝棗娈愰梺瀹犳〃閼冲爼濡堕敃鍌涒拻濞达絿顭堥ˉ蹇涙煟閹惧磭澧︾�规洘婢橀～婵嬵敇閻戝棗娈奸梻浣稿閸嬩線宕曢弻銉ョ９闁汇垹鎲￠崑鈩冪箾閸℃绠版い蹇ｄ簽缁辨帞浠﹂懞銉ヤ淮闂佸搫鐬奸崰鏍х暦濞嗘挸围闁糕剝顨忔导锟�?
		SReqMissionCanAccept send = new SReqMissionCanAccept();
		Module.getInstance().getCanAcceptMission( roleid, send.missions );
		gnet.link.Onlines.getInstance().send( roleid, send );
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805456;

	public int getType() {
		return 805456;
	}


	public CReqMissionCanAccept() {
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
		if (_o1_ instanceof CReqMissionCanAccept) {
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

	public int compareTo(CReqMissionCanAccept _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

