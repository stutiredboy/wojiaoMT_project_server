
package fire.pb.game;

import java.util.ArrayList;
import java.util.List;

import fire.pb.team.TeamManager;
import fire.pb.util.BagUtil;
import fire.pb.util.MessageUtil;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CEndSchoolWheel__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CEndSchoolWheel extends __CEndSchoolWheel__ {
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
					return false;
				}
				
				WheelAwardItem awardItem = GameManager.getInstance().getAwardItem(GameManager.SCHOOLWHEEL, schoolWheel.getItemindex());
				if (awardItem == null)
					return false;
				
				int realAdd = BagUtil.addItem(roleid, awardItem.itemid, awardItem.itemnum, "schoolwheel", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_rollschoolwheel, awardItem.itemid);
				
				if (realAdd == awardItem.itemnum) {
					MessageUtil.psendAddItemWhileCommit(roleid, awardItem.itemid, realAdd);
				}
				
				int mustAdd = 0;
				if (awardItem.mustitem > 0)
					mustAdd = BagUtil.addItem(roleid, awardItem.mustitem, awardItem.mustnum, "schoolwheel", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_rollschoolwheel, awardItem.mustitem);
				if (mustAdd > 0 && mustAdd == awardItem.mustnum) {
					MessageUtil.psendAddItemWhileCommit(roleid, awardItem.mustitem, mustAdd);
				}
				
				xtable.Openschoolwheeltable.remove(roleid);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810365;

	public int getType() {
		return 810365;
	}


	public CEndSchoolWheel() {
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
		if (_o1_ instanceof CEndSchoolWheel) {
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

	public int compareTo(CEndSchoolWheel _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

