
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestClanFightRoleList__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜堕弫鍥煏韫囨洖啸闁告繃顨婂缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閺囥垹绠ｆ繝銏＄箓缂嶅﹤鐣峰Δ鍛闁兼祴鏅濋埢蹇曠磽閸屾瑧绛忛柟椋庡厴閺屾稓浠﹂崜褉妫ㄦ繛瀛樼矋缁捇寮婚悢鍛婄秶闁告挆鍚锋垹绱掔紒銏犲箹濠⒀冩捣濡叉劙骞掑Δ锟界粻娑欍亜閹炬瀚弶褰掓⒒娴ｅ憡鎯堥柣顒�銈稿畷浼村箻缂佹ɑ娅㈤梺鍏间航閸庢娊鍩︽笟锟介弻銊╁即閵娿儰鍠婇梺纭呮珪閹瑰洤鐣风粙璇炬梹鎷呴崫鍕疄闂傚倷鐒︾�笛呮崲閸岀倛鍥寠婢光晜鐩獮瀣晜閻ｅ苯骞嶉梻浣告啞閻熴儵藝閹殿喕鐒婇柨鏃傜摂濞堜粙鏌ｉ幇顓熺稇婵炴惌鍠氶敓鑺ヮ問閸犳骞愰幎钘夌畺婵犲﹤鐗嗛獮銏℃叏濡わ拷濡瑩藟閺傚簱鏀介柣妯虹仛閺嗏晠鏌涙惔銏犵仼鐎垫澘锕幐濠冪珶濠靛洦銇濋柟顔规櫇閹风娀鎳犻澶嬓ゅ┑鐘垫暩婵烇拷婵炰匠鍏犳椽濡舵径妯绘櫔闂備緡鍓欑粔鐢告偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷 by changhao
 *
 */
public class CRequestClanFightRoleList extends __CRequestClanFightRoleList__ {
	@Override
	protected void process() {
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
				if (num > 20)
				{
					return false;
				}
				
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
					
					SRequestClanFightRoleList msg = new SRequestClanFightRoleList();
					java.util.Map<Long, Integer> v = bf.getClanroleidsByWhich(side);
					
					java.util.List<Long> sortdata = new java.util.ArrayList<Long>();
					if (v != null)
					{
						sortdata.addAll(v.keySet());
					}
					
					sortdata.sort(new java.util.Comparator<Long>(){
						@Override
						public int compare(Long o1, Long o2)
						{
							if (o1 > o2)
							{
								return 1;
							}
							else
							{
								return -1;
							}
						}
					});
					
					if (v != null)
					{
						int curnum = 0;
						for (Long e : sortdata)
						{
							if (start != 0 && e <= start)
							{
								continue;
							}
							
							Long teamid = xtable.Roleid2teamid.select(e);
							if (teamid == null)
							{
								xbean.Properties prop = xtable.Properties.select(e);
								if (prop != null)
								{
									fire.pb.team.RoleSimapleInfo info = new fire.pb.team.RoleSimapleInfo();
									info.roleid = e;
									info.rolename = prop.getRolename();
									info.level = prop.getLevel();
									info.schoold = prop.getSchool();
									info.shape = prop.getShape();
									msg.rolelist.add(info);
									
									curnum ++;
									if (curnum >= num)
									{
										break;
									}	
								}								
							}
						}						
					}
					
					msg.isfresh = isfresh;
					if (msg.rolelist.size() == 0)
					{
						msg.ret = -1;
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
	public static final int PROTOCOL_TYPE = 794559;

	public int getType() {
		return 794559;
	}

	public int isfresh; // 客户端用 0刷新 1不刷新  by qyl
	public long start; // 起始roleid by changhao
	public int num; // 请求的数量 by changhao

	public CRequestClanFightRoleList() {
	}

	public CRequestClanFightRoleList(int _isfresh_, long _start_, int _num_) {
		this.isfresh = _isfresh_;
		this.start = _start_;
		this.num = _num_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(isfresh);
		_os_.marshal(start);
		_os_.marshal(num);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		isfresh = _os_.unmarshal_int();
		start = _os_.unmarshal_long();
		num = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestClanFightRoleList) {
			CRequestClanFightRoleList _o_ = (CRequestClanFightRoleList)_o1_;
			if (isfresh != _o_.isfresh) return false;
			if (start != _o_.start) return false;
			if (num != _o_.num) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += isfresh;
		_h_ += (int)start;
		_h_ += num;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(isfresh).append(",");
		_sb_.append(start).append(",");
		_sb_.append(num).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestClanFightRoleList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = isfresh - _o_.isfresh;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(start - _o_.start);
		if (0 != _c_) return _c_;
		_c_ = num - _o_.num;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

