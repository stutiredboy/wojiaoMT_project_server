
package fire.pb.huoban;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CZhenrongMember__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CZhenrongMember extends __CZhenrongMember__ {
	@Override
	protected void process() {
		// protocol handle		
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		
		if (members.size() > 4)
			return;
		
		java.util.Set<Integer> setMember = new java.util.HashSet<Integer>(members.size());
		setMember.addAll(members);
		
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲撮柡浣瑰姍瀹曘劑顢欓崜顬暕bers闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴姘舵濞存粌缍婇弻娑㈠箛闂堟稒鐏堥柣搴㈣壘椤︿即濡甸崟顖氱闁绘劖娼欓鍫曟⒑閸涘娈滃ù婊冪埣瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ锟介弻锝夋偄閸濄儲鍤傜紓浣哄У閹瑰洤顕ｆ繝姘╅柍杞拌兌閻嫰姊洪幖鐐插姶闁诲繑绻堥獮姗�宕滄担鐚寸床闂備胶绮敋闁哥喎鐏濋湁妞ゆ棁濮ら崣蹇撯攽閻樻彃鏆為柕鍥ㄧ箖椤ㄣ儵鎮欑�涙ê纾冲Δ鐘靛仦鐢�愁嚕椤掞拷閳规垿宕熼銈勭棯闂備線娼уú銈囷拷姘嵆瀵偊宕掗悙鏉戜患闁诲繒鍋犲Λ鍕磼閳哄懏鈷掑ù锝囩摂閸ゅ啴鏌涢妸銈呭祮鐎规洦鍨跺鍫曞箣閻樿櫕顔曟繝娈垮枟椤牓宕洪弽顓炵；闁绘绮悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�
		if (setMember.size() != members.size()) {
			return;
		}
		
		new PUpdateHuoBanZhenRong(roleId, 0, zhenyingid, members, PUpdateHuoBanZhenRong.HUOBAN).submit();
		
//		new xdb.Procedure()
//		{
//			protected boolean process() throws Exception {
//				if (members.size() > 4)
//					return false;
//				xdb.Procedure.pexecute(new PUpdateHuoBanZhenRong(roleId, 0, zhenyingid, members, PUpdateHuoBanZhenRong.HUOBAN));
//				return true;
//				boolean suc = huobancol.setFightHuoBans(members);
//				if (suc) {
//					//濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰▕閻掕姤绻涢崱妯诲碍閻熸瑱绠撻幃妤呮晲鎼粹剝鐏嶉梺绋款儜缁绘繈寮婚弴銏犻唶婵犲灚鍔栫瑧缂備胶铏庨崣蹇涘箯閻戣姤鈷掑ù锝囩摂濞兼劙鏌涙惔鈥虫倯闁逛究鍔戞俊鑸靛緞婵犲嫬骞堥梻浣烘嚀婢х晫鍒掗鐐茬厱闁圭儤顨嗛悡鏇熴亜閹扳晛锟芥洟寮稿鍥╃＜闁割偅娲戦幉楣冩煛鐏炲墽娲撮柟顔哄灲閺屻劎锟斤綆浜濋悘搴ㄦ⒒娴ｅ憡鎯堥柣顓烆槺閹广垹鈹戦崱娆愭闂佽鍨堕崑濠偽ｆィ鍐┾拺闁革富鍘藉▍鏇炩攽閻戝洦瀚归梻浣告惈婢跺洭鏁撻挊澶岋紞闁哄棗妫濋幃妤呮晲鎼粹�茬盎濡炪倕楠忛幏锟�
//					xdb.Procedure.pexecute(new PUpdateHuoBanZhenRong(roleId, 0, zhenyingid, members, PUpdateHuoBanZhenRong.HUOBAN));
//				}
//				else {
//					SChangeZhenrong snd = new SChangeZhenrong();
//					snd.zhenrong = zhenyingid;
//					snd.zhenfa = 0;
//					snd.huobanlist.clear();;
//					snd.reason = 5;
//					xdb.Procedure.psendWhileCommit(roleId, snd);
//				}
//				return suc;
//			};
//		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 818838;

	public int getType() {
		return 818838;
	}

	public int zhenyingid;
	public java.util.ArrayList<Integer> members;

	public CZhenrongMember() {
		members = new java.util.ArrayList<Integer>();
	}

	public CZhenrongMember(int _zhenyingid_, java.util.ArrayList<Integer> _members_) {
		this.zhenyingid = _zhenyingid_;
		this.members = _members_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(zhenyingid);
		_os_.compact_uint32(members.size());
		for (Integer _v_ : members) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		zhenyingid = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			int _v_;
			_v_ = _os_.unmarshal_int();
			members.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CZhenrongMember) {
			CZhenrongMember _o_ = (CZhenrongMember)_o1_;
			if (zhenyingid != _o_.zhenyingid) return false;
			if (!members.equals(_o_.members)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += zhenyingid;
		_h_ += members.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(zhenyingid).append(",");
		_sb_.append(members).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

