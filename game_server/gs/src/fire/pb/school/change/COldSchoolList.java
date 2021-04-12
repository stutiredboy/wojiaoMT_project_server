
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
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬姘卞闂佹眹鍨归…宄邦潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙鎻掔骇闁绘濮撮悾鐑藉箛閺夎法顔愭繛杈剧悼椤牓鎮楅銏♀拺缂佸娉曢悘閬嶆煕鐎ｎ剙浠遍柟顕嗙節婵＄兘鍩￠崒婊冨箺闂備礁鎼ú銊╁磻濞戙垺鏅搁柦妯侯槹鐠愶繝鏌ㄩ悢璇残撻柣鏃戝墴楠炲繘鏁撻敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ銈囩磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫鍊荤敮娑欍亜閵夈儺妯�闁哄苯绉堕幉鎾礋椤愩倓绱濇俊鐐�戦崹娲偡閳轰胶鏆︽い鎰剁畱缁�瀣煠閹间焦娑фい蹇氭硾閳规垶骞婇柛濠冩礋瀹曨垶顢曢敃锟介崹鍌涚節闂堟稒顥戦柡锟芥禒瀣厽婵☆垰鎼痪褏绱掓担鍙夋珚闁哄备鍓濋幏鍛村礈閹绘帒澹庨梻浣告惈鐞氼偊宕濋幋锕�绠栭柕蹇嬪�曠粈鍫澝归敐鍫燁仩闁告﹩鍨堕弻锝嗘償閵忊晛鏅遍梺鍝ュУ閻楃娀鍨鹃敃鍌涚叆閻庯絺鏅濈粻姘舵⒑閸忓吋鍊愭繛浣冲懏顐介柣鎰ゴ閺�浠嬫煟濡绲绘い蹇旀尦閺岋繝鏁撴禒瀣╅柍鍝勫�甸幏缁樼箾鏉堝墽绉繛鍜冪悼閺侇喖鈽夐姀锛勫幈闂佸搫鍠涢幏閿嬬箾閸欏澧抽柣蹇斿笚缁绘繈鎮介棃娴躲垽鏌涙繝鍕毈鐎殿喗鎮傚顕�鏁撴禒瀣﹂柛鏇ㄥ灠缁犲鎮归搹鐟板妺闁诲繋鑳剁槐鎾存媴閸濆嫧鏋呯紓浣哄У閻楃姴顕ｆ繝姘╅柕澶堝灪閺傦拷闂備胶纭堕崜婵嬫晪濠电偛鎳岄崐婵嗩潖濞差亝鍋￠柡澶嬪閸婎垶姊洪崨濠冣拹闁荤啿鏅涢锝嗙節濮橆儵鈺呮煃鏉炴壆顦︾�规挸妫濆娲濞戣京鍔搁梺绋匡攻缁诲牆鐣烽幋婢棃宕ㄩ瑙勫缂傚倸鍊烽悞锔炬箒缂備礁鐖兼禍鍫曞蓟濞戙垺鏅查煫鍥ㄦ礈琚﹂柣搴㈩問閸ｎ噣宕戞繝鍥╁祦婵☆垵鍋愮壕鍏间繆椤栨粎甯涙い蹇曞枛濮婄粯鎷呴懞銉с�婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�?
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

