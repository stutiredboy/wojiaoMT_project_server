
package fire.pb.clan.fight;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CBattleFieldScore__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CBattleFieldScore extends __CBattleFieldScore__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		mkdb.Procedure battlefieldscore = new mkdb.Procedure()
		{
			@Override
			protected boolean process()  throws Exception
			{
				Long c1 = xtable.Roleid2clanfightid.select(roleid); //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佲枙闁绘帟濮ょ换娑㈠幢濡粯鍎庨梺杞扮鐎氫即寮诲☉銏犵労闁告劧缂氱花鐢告⒑閹稿海绠撴い锔诲灣缁鎮烽幊濠傜秺閺佹劙宕卞▎鎰晸闁荤偞纰嶇换鍫濐潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙瀵搞偞闁哄懐濞�閻涱喛绠涘☉娆戝弳闁诲函缍嗛崜娑㈡儊閸儲鈷戦悹鎭掑妼閺嬪秶绱掗鐣屾噰闁靛棔绶氬顕�宕煎┑瀣暪婵犵數濞�濞佳囨偋濠婂牆瑙﹂柛娑卞枤缁★拷缂佸墽澧楄摫妞ゎ偄锕弻娑㈠Ω閿曪拷閳绘洜锟借娲樺ú鐔镐繆閸洖鐐婃い蹇撳珔閳ユ枼鏀芥い鏃�鏋绘笟娑㈡煕韫囨枂顏勫祫闂佸壊鍋侀崕鏌ユ偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷? by changhao
				if (c1 == null)
				{
					return false;
				}
				
				SBattleFieldScore msg = new SBattleFieldScore();
				msg.myrank = -1;
				
				fire.pb.clan.fight.ClanFightBattleField bf = fire.pb.clan.fight.ClanFightFactory.getClanFightBattleField(c1, true);
				if (bf != null)
				{
					msg.clanscore1 = bf.getClanfightBean().getClanscore1();
					msg.clanscroe2 = bf.getClanfightBean().getClanscore2();
					
					ClanFightBattleField.RankInfo info = bf.getRankSorceByRoleId(roleid);
					if (info != null)
					{
						msg.myrank = info.rank;
						msg.myscore = info.scroe;						
					}
					
					psendWhileCommit(roleid, msg);
				}
				
				return true;
			}
		};
		
		battlefieldscore.submit();	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808535;

	public int getType() {
		return 808535;
	}


	public CBattleFieldScore() {
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
		if (_o1_ instanceof CBattleFieldScore) {
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

	public int compareTo(CBattleFieldScore _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

