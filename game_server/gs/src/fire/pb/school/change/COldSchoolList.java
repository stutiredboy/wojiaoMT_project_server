
package fire.pb.school.change;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __COldSchoolList__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class COldSchoolList extends __COldSchoolList__ {
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;

		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垹顭峰缁樻媴閻熼偊鍤嬪┑鐐插级閻楃姴鐣烽幇鏉跨濞达絿顭堥悗顓㈡⒑缁嬭法鐏遍柛瀣仱閹繝濡烽埡鍌滃幗闂佸搫娲ㄩ崑娑㈡晸閽樺璐￠柨鐔诲Г閻旑剟骞忛敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫ょ紓渚婃嫹濠电姴娲﹂悡銉╂煟閺冨倻甯涙い銉ヮ樀閺屽秶鎲撮崟顐や紝濡炪們鍨洪悷鈺佺暦椤愶箑绀嬮柤鎼佹涧椤忚泛鈹戞幊閸婃洟宕锕�鍨傛繝闈涙閺�浠嬫煟濡搫绾х紒浣叉櫊閺屸剝鎷呴崜鎻掑壎闂佸搫琚崝鎴﹀箖閵忋倕绀堝ù锝堟閸橆垶鏌ｆ惔銏╁晱闁哥姵鐗犻垾锕傛煥鐎ｂ晝绠氶梺鍏兼倐濞佳呮閻愭祴鏀介柣妯诲絻椤忔挳鏌￠敓浠嬪Ω閳哄倵鎷绘繛杈剧秬濞咃絿鏁☉銏＄厱闁哄喛鎷锋繛鍙夌墳閻忔帗绻濋悽闈浶㈤柛濠勬暬瀵悂寮敓浠嬪Φ閸曨垰绠婚悹铏瑰劋閻忎胶绱撴担鍝勨枅缂佺姵鐗犲濠氬Ω閵夈垺鏂�闂佺硶鍓濋敋婵炲懌鍊濆娲偡閺夋寧鍊梺鍛婃⒐閻熲晛顕ｆ繝姘╅柍杞扮瀹撳棝姊洪棃娑辩劸闁稿﹥绻堝畷鎴澪旈崨顔规嫼缂傚倷鐒︾湁缂佸爼浜堕弻娑㈡晲韫囨洜袦閻庢鍣崑濠囩嵁濡偐纾兼俊顖滅帛椤忕喖姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷?
				SOldSchoolList send = new SOldSchoolList();
				xbean.ChangeSchoolInfo info = xtable.Changeschool.select(roleId);
				if (info != null) {
					for (xbean.ChangeSchoolRecord record : info.getRecords()) {
						send.oldshapelist.add(record.getShape());
						send.oldschoollist.add(record.getSchool());
					}
				}
				mkdb.Procedure.psendWhileCommit(roleId, send);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810483;

	public int getType() {
		return 810483;
	}


	public COldSchoolList() {
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
		if (_o1_ instanceof COldSchoolList) {
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

	public int compareTo(COldSchoolList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

