
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestClanFightTeamRoleNum__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}
/***
 * 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜堕弫鍥煏韫囨洖啸闁告繃顨婂缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閺囥垹绠ｆ繝銏＄箓缂嶅﹤鐣峰Δ鍛闁兼祴鏅濋埢蹇曠磽閸屾瑧绛忛柟椋庡厴閺屾稓浠﹂崜褉妫ㄦ繛瀛樼矋缁捇寮婚悢鍛婄秶闁告挆鍚锋垹绱掔紒銏犲箹濠⒀冩捣濡叉劙骞掑Δ锟界粻娑欍亜閹炬瀚弶褰掓⒒娴ｅ憡鎯堥柣顒�銈稿畷浼村箻缂佹ɑ娅㈤梺鍏间航閸庢娊鍩︽笟锟介弻宥囩箔閸濆嫸鎷峰┑瀣拷渚�寮崼婵嗙獩濡炪倖姊婚崢褎瀵兼惔銊︹拻濠电姴楠告禍婊勭箾鐠囇呯暠閻撱倖鎱ㄥΔ瀣閻庤娲戦崡鍐茬暦閸楃偐妲堟繛鍡樺灥楠炲秹姊绘担铏瑰笡闁搞劍鍎奸幗顐ょ磽娓氬﹥瀚归梺璺ㄥ枙濡嫰鈥旈崘顔嘉ч柛鎰╁妼婵海绱撴担铏瑰笡闁挎洏鍨归锝囨嫚濞村顫嶅┑顔筋殔濡盯宕ｉ崱娑欌拺闁告稑锕ゆ慨锕�霉濠婂懎浠辩�规洘绻堥、娑橆潩閿濆棙鏉搁梻鍌氬濞差參銆佸顒夌叆闁割偆鍟块幐鍐⒑閸涘﹥澶勯柛娆忕箻楠炲繘鎮滈懞銉ヤ缓闂傚倸鐗婄粙鎴炵濡警娓婚柕鍫濇鐏忣參鏌曢崼銏╃劸闁伙絿鍏樺畷锟犳倷瀹ュ洤鏋庨悡銈夋偣閸パ冪骇婵炲懎鍟村濠氬磼濮橆剨鎷烽幖浣哥９濡炲瀛╅浠嬫煏閸繍妲哥紒鐙�鍨堕弻銊╂偆閸屾稑顏�? by changhao
 *
 */
public class CRequestClanFightTeamRoleNum extends __CRequestClanFightTeamRoleNum__ {
	@Override
	protected void process() {
		// protocol handle
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
		{
			return;
		}
		
		mkdb.Procedure r = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				int side = 0;
				Long c1 = xtable.Roleid2clanfightid.select(roleid); //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佲枙闁绘帟濮ょ换娑㈠幢濡粯鍎庨梺杞扮鐎氫即寮诲☉銏犵労闁告劧缂氱花鐢告⒑閹稿海绠撴い锔诲灣缁鎮烽幊濠傜秺閺佹劙宕卞▎鎰晸闁荤偞纰嶇换鍫濐潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙瀵搞偞闁哄懐濞�閻涱喛绠涘☉娆戝弳闁诲函缍嗛崜娑㈡儊閸儲鈷戦悹鎭掑妼閺嬪秶绱掗鐣屾噰闁靛棔绶氬顕�宕煎┑瀣暪婵犵數濞�濞佳囨偋濠婂牆瑙﹂柛娑卞枤缁★拷缂佸墽澧楄摫妞ゎ偄锕弻娑㈠Ω閿曪拷閳绘洜锟借娲樺ú鐔镐繆閸洖鐐婃い蹇撳珔閳ユ枼鏀芥い鏃�鏋绘笟娑㈡煕韫囨枂顏勫祫闂佸壊鍋侀崕鏌ユ偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷? by changhao
				if (c1 == null)
				{
					return false;
				}
			
				fire.pb.clan.fight.ClanFightBattleField bf = fire.pb.clan.fight.ClanFightFactory.getClanFightBattleField(c1, true);
				if (bf != null)
				{
					Long clanid = xtable.Roleidclan.select(roleid);
					if (clanid == null)
					{
						return false;
					}
					
					if (clanid == bf.getClanfightBean().getClanid1())
					{
						side = 0;
					}
					else if (clanid == bf.getClanfightBean().getClanid2())
					{
						side = 1;
					}
					else
					{
						return false;
					}
					
					SRequestClanFightTeamRoleNum msg = new SRequestClanFightTeamRoleNum();
					java.util.Map<Long, Integer> v = bf.getClanroleidsByWhich(side);
					if (v != null)
					{
						java.util.Set<Long> teamidset = new java.util.HashSet<Long>();
						for (Long e : v.keySet())
						{
							Long teamid = xtable.Roleid2teamid.select(e);
							if (teamid != null)
							{
								if (!teamidset.contains(teamid))
								{
									msg.teamnum ++;
								}
								
								teamidset.add(teamid);
							}
							else
							{
								msg.rolenum ++;
							}
						}						
					}
					
					mkdb.Procedure.psendWhileCommit(roleid, msg);
				}
				
				return true;
			}
		};
		
		r.submit();	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794561;

	public int getType() {
		return 794561;
	}


	public CRequestClanFightTeamRoleNum() {
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
		if (_o1_ instanceof CRequestClanFightTeamRoleNum) {
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

	public int compareTo(CRequestClanFightTeamRoleNum _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

