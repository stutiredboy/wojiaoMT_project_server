
package fire.pb.game;
import java.util.ArrayList;
import java.util.List;

import fire.pb.team.TeamManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CBeginSchoolWheel__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CBeginSchoolWheel extends __CBeginSchoolWheel__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid <= 0) return;
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				TeamManager.getTeamByRoleId(roleid);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚泛鈹戦悩娈挎殰缂佺粯绻傞…鍥樁闁诲繑甯″铏圭矙鐠恒劎顔婇梺鍐插槻閻楁挸鐣烽幋锕�惟闁靛鍨洪弬锟芥俊鐐�栧褰掑几缂佹鐟规繛鎴欏灪閻撴洟骞栨潏鍓хɑ闁哄棭鍓熼弻鈩冩媴閻熸澘顫嶉悗鍨緲鐎氼噣鏁撻弬銈囩У闁稿鎳橀幃鐢稿即閵忊檧鎷绘繛杈剧秬濡嫯顣块梻浣瑰绾板秹濡甸崟顖涙櫆閻犳亽鍔庨悡鎾绘倵鐟欏嫭绀堥柡浣割煼瀵偊骞樼紒妯绘闂佽法鍣﹂幏锟�?
				List<Long> list = new ArrayList<Long>();
				list.add(roleid);
				lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, list));//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚泛鈹戦悩娈挎殰缂佺粯绻傞…鍥樁闁诲繑甯″娲礂閼测斂鍋為梺鍝勬噺缁诲牓骞冮悙鍝勭闁兼祴鏅濋鏇㈡煛婢跺﹦澧曞褏鏅划鏃堫敆娴ｈ櫣顔曢梺鍛婄矊閸熶即骞冮懖鈺冪＜妞ゆ棁鍋愭晶娑氱磼缂佹绠炵�规洖鐖兼俊鎼佸Ψ椤栨稑顏堕梺姹囧灩閹诧繝鎮￠妷锔剧瘈闂傚牊绋掗ˉ銏°亜鎼淬埄娈滈柡宀嬬磿閿熸枻缍嗛崑鍡涘Υ閹烘梻纾奸弶鍫涘妼濞搭噣鏌℃担瑙勫鞍缂佸倹甯為敓鏂ょ秵娴滎亪宕捄渚富闁靛牆楠告禍浠嬫煕閻樻剚娈橀柨鐔诲Г娣囨椽锝炴径鎰╋拷鍐Ψ閳哄倸锟界兘鏌ょ喊鍗炲幐闁惧繐閰ｅ娲川婵犲啠鎷归悗鐧告嫹闁归棿绀侀拑鐔兼煥濠靛棙鍟掗柡鍐挎嫹闁瑰嘲鎳橀幖褰掑捶椤撶偛绗屾繝纰夌磿閸嬫垿宕愰妶澶婂偍闁绘挸绡冨ú顏嶆晣闁靛繒濮甸悗顒勬⒑閻熸澘鈷旂紒顕呭灦瀹曟垿骞囬鍡樺閻熸瑥瀚粈锟藉┑鐐茬湴閸婃繈鎮伴纰辨建闁跨喕妫勯～蹇曠磼濡顎撻梺鍏间航閸庢娊濡存繝鍥ㄢ拺闂傚牃鏅濈粔鍓佺磼閻樿櫕宕岄柣娑卞枦缁犳稑鈽夊▎鎰仧闂備浇娉曢崳锕傚箯閿燂拷?
				xbean.SchoolWheel schoolWheel = xtable.Openschoolwheeltable.get(roleid);
				if (schoolWheel == null) {
					schoolWheel = xbean.Pod.newSchoolWheel();
					xtable.Openschoolwheeltable.insert(roleid, schoolWheel);
				}
				
				int itemIndex = GameManager.getInstance().getAwardItemIndex(GameManager.SCHOOLWHEEL);
				if (itemIndex == -1) {
					return false;
				}
				
				schoolWheel.setItemindex(itemIndex);
				schoolWheel.setAwardid(GameManager.SCHOOLWHEEL);
				
				//TODO 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撻柡灞诲劜閺呮悂鏌﹀Ο渚Ц闁跨喕妫勫锟犲Υ娴ｇ硶鏋庨柟鎯х－椤︻參鎮峰鍐閽樻繃銇勯弽銊с�掔紒鐘荤畺瀵爼宕煎┑鍡忔寖闂佽鍠涢崑鎰版儉椤忓牜鏁囬柣鎰版涧閻撶喖鎮楀▓鍨灓妞ゎ厼鐗撻、姗�宕楅悡搴ｇ獮婵犵數濮寸�氱兘宕崶銊х瘈闁汇垽娼ч崜宕囩磽瀹ュ懏顥㈢�规洘绮岄埢搴ㄥ箻閺夋埊鎷烽懜鐐逛簻闊洦鎸搁銈夋煛閿熶粙鎳為妷锝勭盎闂佸搫鍟崐鐟扳枍閺囥垺鐓熸い鎾跺剱閸庢棃鏌＄仦鐐鐎规洘鍎奸ˇ鍙夈亜韫囷絽骞楁い銊ｅ劦閹瑩寮堕幋鐐剁檨婵°倗濮烽崑娑㈩敄閸涙潙鐓橀柟杈剧畱缁犲鏌℃径瀣劸濞村吋鎹囧缁樼瑹閿熻棄顭囬懡銈忔嫹闂堟稓鐒哥�规洏鍨虹缓浠嬪级閸℃妲告い顐ｇ箞閹虫粓鎮介棃娑樼闂傚倸鍊搁崐鎼佸磹閹间緡鏁嬫い鎾卞灩缁�澶岋拷骞垮劚椤︿即鎮￠悢鍏肩厵闁硅鍔栫涵鍓э拷娑欑箞閺屟呯磼濡厧鈷岄梺鍝勮閸旀垵顕ｉ弶鎴僵闁告鍋涢‖澶岀磽娴ｉ缚妾搁柛妯哄悑閺呰埖鎯旈敐鍡╂綗闂佸湱鍎ら〃鍛劔闂備線娼ч¨锟界紒鐘冲灦缁傛帡骞橀瑙ｆ嫼闂佸憡绻傜�氼厼锕㈡导瀛樼厽闁冲搫锕ら悘锕傛煕閵娾晝鐣洪柡浣稿暣瀹曟帒顫濇鏍ф暯闂傚倷绀佸﹢閬嶅磻閹捐绀堟慨姗嗗幖椤曢亶鏌ㄩ悤鍌涘
				fire.pb.item.Pack bag = new fire.pb.item.Pack(roleid, false);
				long ret = bag.subCurrency(-60, MoneyType.MoneyType_ProfContribute, "schoolwheel", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_zhuanpan, 0);
				if (ret == 0)
					return false;
				
				SBeginSchoolWheel beginWheel = new SBeginSchoolWheel();
				beginWheel.wheelindex = itemIndex;
				
				mkdb.Procedure.psendWhileCommit(roleid, beginWheel);
				
				return true;
			}
			
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810363;

	public int getType() {
		return 810363;
	}


	public CBeginSchoolWheel() {
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
		if (_o1_ instanceof CBeginSchoolWheel) {
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

	public int compareTo(CBeginSchoolWheel _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

