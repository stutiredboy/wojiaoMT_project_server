
package fire.pb.clan.fight;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGetClanFightList__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冪Ч濠�渚�姊虹紒妯虹伇婵☆偄瀚板鍛婄瑹閿熶粙寮诲☉妯锋婵鐗婇弫鎯р攽閻愬弶鍣藉┑顔肩仛缁岃鲸绻濋崶顬囨煕濞戝崬鏋涙繛鍜冪節濮婅櫣鎹勯妸銉︾亞濠碘槅鍋勭�氭澘鐣烽鐐茬骇闁瑰濮靛▓楣冩⒑闂堟单鍫ュ疾濞戞氨妫憸鏃堝蓟閻旂尨鎷烽悽娈跨劸濞寸媴濡囬幃顕�鏁愭径瀣ф嫼闁荤姴娲ゅ鍫曞箲閿濆棛绠鹃柛娑卞亜閻忓弶顨ラ悙鑼闁诡喗绮撻幊鐐哄Ψ瑜嶅鎶芥⒒娴ｈ櫣甯涢柡灞诲妽閺呰埖鎯旈妸锕�鍓瑰┑鐐叉閸╁﹪骞忓畡鎵虫灁闁割煈鍠楅悵顕�姊虹粙娆惧剰闁挎洦浜俊瀛樻媴閸撳弶鍍甸梺鑲╊焾閻忔艾鈻嶉姀锛勭閻庣數顭堝瓭濡炪倖鍨甸崯鎾极閹捐绠ｉ柟鐑樻濡差噣姊虹�圭媭鍤欓梺甯秮閻涱喖顫滈敓钘夘嚕閸洖绠ｉ柣鎴濇閹垿姊婚崒姘拷椋庢濮橆剦鐒界憸鏃堝箖瑜斿畷鍗烆渻閺囩喐銇濆┑鈩冩倐婵＄柉顦虫繛鍫ョ畺濮婃椽宕滈幓鎺嶇凹濠电偛寮堕敃銏ゅ春濞戙垹绠抽柟鐐藉妼缂嶅﹪寮幇鏉跨倞鐟滃秵淇婂ú顏呪拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懎顥忛柛姘閺屸剝寰勬繝鍕檸濡炪値鍋勫ú顓烆潖濞差亝鍊烽柦妯侯槸婵绱撴担鍝勑ｉ柟鍛婃倐閹箖鎮滈挊澶岀暰闂備緡鍙忛梽鍕毄闂傚倸鍊风粈渚�骞栭锔绘晞闁糕剝銇傚☉銏犵妞ゆ棁澹堥幗鏇㈡⒑缂佹ɑ鈷掗悘蹇嬪姂楠炲繘鎮滈懞銉ヤ缓濠电偛鐗愬▔鏇㈠礉缁嬫娓婚柕鍫濇噹椤掋垽鏌熼悷鐗堝枠鐎殿喖顭烽幃銏ゅ礂閻撳函鎷锋繝姘厾闁诡厽甯掗崝婊堟煛閸℃瑥鈻堟慨濠冩そ閹兘寮堕幐骞晠姊虹涵鍛彧闁挎岸鏌ｉ敐鍛Щ妞ゎ偅绮撻弫鎾寸鐎ｎ亞鐣哄┑鐐叉閹尖晠寮崱娑欑厱閻忕偛澧介弫鏍煏婢跺棙娅嗛柍閿嬪浮閺屾稓浠﹂崜褎鍣銈忚缁犳垿鈥﹂崸妤佸仭閻㈩垼鍠涢崥顐︽⒑鐠団�虫珯缂佺粯绻傞悾閿嬬附缁嬭銊╂煏婢诡垰鏈倴婵犵數濮烽弫鎼佸磻閻愬搫鍨傛い鏍仜閸ㄥ倿鏌涢敂璇插箻濞戞挸绉归弻鈥愁吋鎼粹�崇闂佺粯鎸堕崕鐢稿蓟閿濆鍗抽柣鎰嚋閹风兘宕烽銊﹀婵鍋撶�氾拷? by changhao
 */
public class CGetClanFightList extends __CGetClanFightList__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		mkdb.Procedure getclanfightlist = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				long cur = System.currentTimeMillis();
				
				if (which != 0 && which != 1)
				{
					return false;
				}
				
				if (which == 0)
				{
					long mon1 = fire.pb.activity.clanfight.ActivityClanFightManager.GetMonday1500ByTime(cur);
					if (cur < mon1)
					{
						return false;
					}
				}
				
				if (which == 1)
				{
					long wed1 = fire.pb.activity.clanfight.ActivityClanFightManager.GetWednesday1500ByTime(cur);
					if (cur < wed1)
					{
						return false;
					}
				}
				
				long createtime = which == 0 ? fire.pb.activity.clanfight.ActivityClanFightManager.GetMonday1500ByTime(cur) : fire.pb.activity.clanfight.ActivityClanFightManager.GetWednesday1500ByTime(cur);
				
				int curweek = fire.pb.activity.clanfight.ActivityClanFightManager.getInstance().curweek.get();
				SGetClanFightList msg = new SGetClanFightList();
				
				if (curweek == -1)
				{
					msg.curweek = -1;
					mkdb.Procedure.psendWhileCommit(roleid, msg);					
					
					return true;
				}
				
				int curweekvalue = curweek % 8;
				
				msg.curweek = curweekvalue;
				
				int  result = 0;
				xbean.ClanFights clanfights = xtable.Clanfights.select(createtime);
				if (clanfights != null)
				{
					for (xbean.ClanFight c : clanfights.getClan1vschan2().values())
					{
						fire.pb.clan.fight.ClanFight f = new fire.pb.clan.fight.ClanFight();
						f.clanid1 = c.getClanindex1();
						f.clanname1 = c.getClanname1();
						f.clanid2 = c.getClanindex2();
						f.clanname2 = c.getClanname2();
						f.winner = c.getWinner();
						
						if (f.winner != -1)
						{
							result = 1;
						}
						
						msg.clanfightlist.add(f);
					}
				}
				
				msg.over = result;
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);
				
				return true;
			}
		};
		
		getclanfightlist.submit();			
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808532;

	public int getType() {
		return 808532;
	}

	public int whichweek; // 历史那一周(0-7周)(如果填-1表示当前周) by changhao
	public int which; // 0是周一那场，1是周三那场 by changhao

	public CGetClanFightList() {
	}

	public CGetClanFightList(int _whichweek_, int _which_) {
		this.whichweek = _whichweek_;
		this.which = _which_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(whichweek);
		_os_.marshal(which);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		whichweek = _os_.unmarshal_int();
		which = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGetClanFightList) {
			CGetClanFightList _o_ = (CGetClanFightList)_o1_;
			if (whichweek != _o_.whichweek) return false;
			if (which != _o_.which) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += whichweek;
		_h_ += which;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(whichweek).append(",");
		_sb_.append(which).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGetClanFightList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = whichweek - _o_.whichweek;
		if (0 != _c_) return _c_;
		_c_ = which - _o_.which;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

