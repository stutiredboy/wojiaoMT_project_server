
package fire.pb.title;


import fire.pb.PropRole;
import fire.pb.battle.livedie.LiveDieMange;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __COffTitle__ extends mkio.Protocol { }

/** 客户端请求卸下称谓
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class COffTitle extends __COffTitle__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0 || !fire.pb.StateCommon.isOnline(roleid))
			return;
		if (checkCOfftitle(roleid))
			new POnTitleProc(roleid, -1).submit();
	}
	
	public boolean checkCOfftitle(long roleid){
		fire.pb.PropRole prole = new fire.pb.PropRole(roleid, true);
		Role role = RoleManager.getInstance().getRoleByID(roleid);
		if(role != null){
			if(isLiveDieTitle(prole)){
				fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 162120, null);
				return false;
			}
//			if(isFactionTitle(prole)){
//				fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 144142, null);
//				return false;
//			}
		}
		
		return true;
		
	}
	
	/**
	 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘鐓曢柕濞垮劚閿熻姤鎮傞崺鐐哄箣閿旇棄浜归柣搴℃贡婵挳藟濠靛牏纾藉ù锝囨嚀婵牊銇勯妸銉含鐎殿喖顭烽幃銏㈢矙濞嗘儳娈奸梻浣告惈椤︿即宕归幎钘夌獥濠电姴娲﹂埛鎴﹀级閻愭潙顥嬫い锔奸檮娣囧﹪顢曢敐鍥╃杽閻庢鍠栭…鐑藉箖閵忋倖鎯為柛锔诲弿缁辨煡姊绘笟锟藉褏鎹㈤幒鎾村弿闁汇垹鎲￠崐鍫曟煕椤愮姴鐏痪鎹愭闇夐柨婵嗘噺閹牊銇勬惔銏″暗缂佽鲸甯￠幊鐘活敆閿熻姤绂嶉崜褏纾肩�癸拷閸愵喖鎽电紓浣虹帛缁诲牆鐣烽崼鏇熷殝闁割煈鍋呴悵顐⑩攽閻樻剚鍟忛柛鐘愁殜閺佸啴鍩￠崨顓狀槶濠殿喗顭堝▔娑氬鐟欏嫨浜滈柡宥庡亜娴狅箓鏌嶉柨瀣仴闂囧鏌涜箛姘汗闁瑰啿鎳愮槐鎺撳緞濡搫顫╅梻鍥ь槹缁绘繃绻濋崒鐑嗭拷妤�顭胯婢ф绌辨繝鍥х煑濠㈣泛锕ら～鎺懳旈悩闈涗沪閻㈩垽绻濋悰顔嘉熼搹瑙勬闂佹悶鍎弲婵嗙暤娓氾拷濮婄粯鎷呯粵瀣闂佸憡鍨归弲顐ゆ閻愬搫骞㈡繛鎴烆焽閿涙盯姊虹化鏇炲⒉缂佸鍨圭划鍫ュ礋椤栨稓鍙嗛梺缁樻煥閹碱偅鐗庨梻浣侯焾椤戝倿宕滃┑鍫熷床婵犻潧娲ㄧ弧锟介梺绋挎湰缁嬫垵鈻嶉敐鍜佹富闁靛牆绻掗崚浼存煏閸喐鍊愭鐐插暙铻栭柛鎰典簽閻ｈ泛鈹戦悙鏉戠仸閽冮亶鏌涢敐鍕煓闁哄矉缍侀、姗�鎮㈤悜妯烘珣婵＄偑鍊ら崣锟芥繛澶嬫礋楠炴垿宕熼鍌滄嚌濡炪倖鐗楃划宀冦亹閸℃稒鈷掑ù锝呮啞閸熺偤鏌よぐ鎺旂暫妞ゃ垺鐗楀鍕箛椤掑啯鎲版繝鐢靛仦閸垶宕洪崟顖氭瀬闁告劦鍠楅悡銉︾節闂堟稒顥炵�瑰憡绻堥弻锝夋晲婢跺閿柧缁樼墵閺岋絽顫滈敓钘夘焽瑜庣粋鎺戭煥閸曗晙绨婚梺鐟扮摠缁诲秴螣閿熶粙鎮楀▓鍨灈妞ゎ厾鍏樺顐﹀箛椤撶偟绐為柣搴秵娴滅兘骞忛悜鑺ュ�婚柤鎭掑劤閸樺憡绻濋姀锝嗙【妞ゆ垵鎳橀幃姗�濡烽敂钘夊伎闂佹寧绻傞幊鎰櫠閿旇姤鍙忓┑鐘叉噺椤忕姷绱掗鐣屾噧闁宠閰ｉ獮鍡氼槻濠㈢懓鐗撳缁樻媴閻戞ê娈岄梺鍝ュ枎濞硷繝寮绘繝鍥ㄦ櫜闁告粌鍟抽敓钘夌仢闇夐柨婵嗘川閵嗗﹪鏌￠敓鑺ョ鐎ｎ偆鍘介梺褰掑亰閸樼晫绱為幋锔界厽闊洢鍎抽悾鐢告煛瀹�瀣М闁诡喓鍨归埞鎴﹀幢濡粯鍊烽梻浣虹帛閹歌崵鎹㈤崼銉ヨ摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹?
	 * @param prole
	 * @return
	 */
	public static boolean isLiveDieTitle(PropRole prole){
		if(prole.getTitleID() == LiveDieMange.getLiveDieTitle()){
			return true;
		}
		return false;
	}
	
	
/*	private boolean isFactionTitle(PropRole prole) {
		if(prole.getTitleID() >= fire.pb.clan.Constant.FACTION_MASTER_TITLE && prole.getTitleID() <= fire.pb.clan.Constant.FACTION_MEMBER_TITLE)
			return true;
		return false;
	}*/

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 798437;

	public int getType() {
		return 798437;
	}


	public COffTitle() {
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
		if (_o1_ instanceof COffTitle) {
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

	public int compareTo(COffTitle _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

