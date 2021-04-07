
package fire.pb.npc;
import java.util.ArrayList;
import java.util.List;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAbandonMacth__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAbandonMacth extends __CAbandonMacth__ {
	@Override
	protected void process() {
		// protocol handle
		final Long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				xbean.npcBattleInfoCol npcBattle = xtable.Npcbattleinfo.get(npckey); 
				if (npcBattle == null)
					return false;
				if (!npcBattle.getBattleroles().containsKey(roleid))
					return false;
				//濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏焺閺佸銇勯幘璺烘瀾闁告瑥绻橀幃妤�鈽夊▎娆庣返濠电偛鐗呯划娆撳蓟濞戞ǚ鏀介柛鏇ㄥ亜婵秹姊虹紒妯虹瑨闁挎洏鍎垫俊鐢稿礋椤栨艾宓嗗銈呯箰閹冲酣顢旈崼鏇熲拻濞达絽鎲￠幆鍫ユ煠濞茶鐏﹂柡浣稿暣婵¤埖寰勫Ο缁樻珝濠电娀娼ч崐濠氣�﹂崼婵愬晠婵犻潧娲㈡禍婊堟煙閹规劖纭剧亸蹇曠磽娓氬洤鏋熼柟绋垮暱椤繐煤椤忓懎娈ラ梺闈涚墕閹冲秴鈻介鍡欑＝濞达絽澹婇崕蹇曠磼缂佹◤顏堟偩瀹勬壋鏀介悗锝庝簽椤撴椽姊洪幐搴㈢┛闁归鍏樺濠氬磼閵堝懐浠搁梺鍝勭焿缂嶄線鐛�ｎ喗鏅查柛鈾�鏅滈ˉ澶岀磽閸屾瑧绛忛柟椋庡厴閺屾盯鍩勯崘顏佹闂佺粯鎸鹃崰鎰┍婵犲浂鏁嶆繝闈涙濮规鏌ｉ姀鈺佺仭闁烩晩鍨跺濠氭晲閸涱亝鏂�闂佸湱鍋撳娆擃敂閿燂拷
				npcBattle.getBattleroles().remove(roleid);
				xtable.Role2npcbattle.remove(roleid);
				
				//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾婚柨鐔哄У閻撳啴寮堕悙鏉戭棆閻庨潧銈搁弻銊モ攽閸♀晜效闂佸搫鎳忕换鍫ュ蓟濞戞矮娌柟瑙勫姇椤ユ繄绱撴担鐟板缂佸鍨块崺鐐哄箣閿曪拷閻擄繝鏌涢埄鍐炬畼濞寸姭鏅犲娲捶椤撴稒瀚涢梺绋款儏濡顢氶妷锔剧瘈闁稿鍨卞浠嬨�侀弮鍫濆窛妞ゅ繐鎳庨鐟扳攽閿涘嫬浜奸柛濠冪墵瀹曟繆顦存俊鍙夊姍瀵挳鎮╅悽闈涚闂備礁鎼崰娑㈠箯瀹勬墥搴ㄥ炊瑜濋崝鐔兼煙妞嬪骸鞋妞わ附鎸抽弻锝夋晲閸涱垯绮甸梺閫涚┒閸斿秶鎹㈠┑瀣＜婵犲﹤鎲涢妸鈺傚�甸悷娆忓缁�锟界紓鍌氱Т閿曨亪濡存担绯曟瀻闁圭偓娼欐禍妤呮煙閸忚偐鏆橀柛鈺佸瀹曘儳锟斤綆鍓涚壕浠嬫煕鐏炴崘澹橀柨鐔诲Г閹倸鐣烽幇顓фЧ閹艰揪绲块悞鍏肩箾鏉堝墽鎮奸柛搴涘�曢悾鐑藉蓟閵夛妇鍘甸梻渚囧弿缁犳垿鎮樺☉妯忕懓顭ㄩ崘顏喰ㄩ梺鍝勬湰閻╊垱淇婇悜钘夌妞ゆ牗绋戦鑸电節绾版ê澧茬憸鏉垮暣閹囧箻鐠囪尪鎽曞┑鐐村灟閸╁嫰寮崘顔界厽婵☆垰鐏濋惃鍝劽归悩鑽ょ暫婵﹦鍎ょ�电厧鈻庨幋鐘樻碍淇婇悙瀛樼稇闁硅姤绮撻獮鎴﹀閻橆偅顫嶉梺闈涚箳婵兘顢橀崫鍕ㄦ斀闁绘绮☉褔鏌ｅΔ锟藉Λ婵婄熅闂佽法鍠曞Λ鍕煘閹达附鍊风�瑰壊鍠栧▓鍫曟⒑闂堟稒顥滄い鎴濐樀閻涱喛绠涘☉娆愭闂佽法鍣﹂幏锟�
				List<Long> allRoles = new ArrayList<Long>();
				Team team = TeamManager.selectTeamByRoleId(roleid);
				if (team != null) {
					allRoles.addAll(team.getNormalMemberIds());
					mkdb.Procedure.psend(allRoles, new SMacthResult(npckey, 0));
				}
				
				if (npcBattle.getBattleroles().size() == 0)
					xtable.Npcbattleinfo.remove(npckey);
				
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795670;

	public int getType() {
		return 795670;
	}

	public long npckey; // npckey

	public CAbandonMacth() {
	}

	public CAbandonMacth(long _npckey_) {
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAbandonMacth) {
			CAbandonMacth _o_ = (CAbandonMacth)_o1_;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAbandonMacth _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

