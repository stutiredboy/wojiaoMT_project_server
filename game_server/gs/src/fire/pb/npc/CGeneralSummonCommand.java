
package fire.pb.npc;
import fire.pb.activity.winner.PWinnerCallPlayer;
import fire.pb.move.SRoleEnterScene;
import fire.pb.npc.TransmitTypes;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGeneralSummonCommand__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGeneralSummonCommand extends __CGeneralSummonCommand__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫绮婚悩璇茬婵烇綆鍓欐俊鑲╃磼閻樹警娼愰柕鍥у楠炲洭宕滄担鑽锋垿姊洪崨濠勬噧缂佺粯锕㈤幃锟狀敃閿曪拷閻愬﹪鏌曟繝蹇擃洭妞わ负鍔戦弻锝嗘償閵忋埄鏆￠悗鐧告嫹闁归棿绀侀拑鐔兼煥閻斿搫孝闁绘劕锕弻宥嗘姜閹殿喗鍋ч梺闈涱槴閺呮粓鎮￠悢鎼炰簻闁规崘娉涢崜鎶芥椤掑澧撮柡灞革拷宕囨殕闁跨喍绮欏畷鐗堟償閵婏箑浠奸梺璺ㄥ枔婵敻鎮炴禒瀣叆闁哄倸鐏濆娲煏婢跺牆鍔楅柡锟介懞銉ｄ簻闁哄啫鍊告禍鐐亜韫囨洖鏋涢柡宀�鍠栧畷娆撳Χ閸℃浼�
		if (summontype == TransmitTypes.impexamsystem)
			return;
		// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閼碱剦妲锋繝寰锋澘锟芥捇鎮為敃鍌氱煑闊洦绋掗悡娆戠磽娴ｉ潧鐏╅柡瀣洴閺岋綁濡舵惔鈩冪亶婵烇絽娲ら敃顏呬繆閸洖宸濇い鎾跺枑椤斿姊虹拠鎻掝劉缁炬澘绉撮悾婵嬪箹娴ｆ瓕鎽曢梺璺ㄥ枔婵挳鎮欐繝鍥ㄧ厓閺夌偞澹嗛幃濂告煏韫囨洖违鐟滅増甯楅崑鎰版煠绾板崬澧板Δ鏃堟⒒娴ｅ憡鎯堥柣顒�銈稿畷鐗堟償閵婏箑浠奸梺璺ㄥ枔婵敻鎮炴禒瀣叆闁哄倸鐏濆娲煏婢跺牆鍔楅柡锟介懞銉ｄ簻闁哄啫鍊告禍鐐亜韫囨洖鏋涢柡宀�鍠栧畷娆撳Χ閸℃浼�
		if (summontype == TransmitTypes.winnercall && agree == 1) {
			new PWinnerCallPlayer(roleid).submit();
			return;
		}
		if (summontype == TransmitTypes.singlepvp && agree == 1) {
			fire.pb.battle.pvp1.PvP1Control.getInstance().applyEnter(roleid, SRoleEnterScene.SYSTEM_DRAG);
			return;
		}
		if (summontype == TransmitTypes.pvp3 && agree == 1) {
			fire.pb.battle.pvp3.PvP3Control.getInstance().applyEnter(roleid, SRoleEnterScene.SYSTEM_DRAG);
			return;
		}
		if (summontype == TransmitTypes.pvp5 && agree == 1) {
			fire.pb.battle.pvp5.PvP5Control.getInstance().applyEnter(roleid, SRoleEnterScene.SYSTEM_DRAG);
			return;
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795506;

	public int getType() {
		return 795506;
	}

	public int summontype; // 拉人类型 见TransmitTypes
	public long npckey; // npckey
	public int agree; // 1为同意，0为拒绝

	public CGeneralSummonCommand() {
	}

	public CGeneralSummonCommand(int _summontype_, long _npckey_, int _agree_) {
		this.summontype = _summontype_;
		this.npckey = _npckey_;
		this.agree = _agree_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(summontype);
		_os_.marshal(npckey);
		_os_.marshal(agree);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		summontype = _os_.unmarshal_int();
		npckey = _os_.unmarshal_long();
		agree = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGeneralSummonCommand) {
			CGeneralSummonCommand _o_ = (CGeneralSummonCommand)_o1_;
			if (summontype != _o_.summontype) return false;
			if (npckey != _o_.npckey) return false;
			if (agree != _o_.agree) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += summontype;
		_h_ += (int)npckey;
		_h_ += agree;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(summontype).append(",");
		_sb_.append(npckey).append(",");
		_sb_.append(agree).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGeneralSummonCommand _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = summontype - _o_.summontype;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		_c_ = agree - _o_.agree;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

