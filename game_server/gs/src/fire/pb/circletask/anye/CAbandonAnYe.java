
package fire.pb.circletask.anye;
import fire.pb.circletask.CircleTaskManager;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAbandonAnYe__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAbandonAnYe extends __CAbandonAnYe__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		CircleTaskManager.logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀崣澶樻▊闂佺粯甯掗敃顏堝蓟閺囩喓绠鹃柣鎰靛墯閻濇梻绱撴担鍝勵�岄柛銊ョ埣瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘遍柣搴到婢у海绮旈锟介弻锛勪沪閸撗�妲堥梺瀹狀潐閸ㄥ灝鐣烽崡鐐嶆梹绻濇担鐑橈紡闂傚倸鍊峰ù鍥敋閺嶎厼鍨傚ù鐓庣摠閸嬪鏌熼幑鎰靛殭闁藉啰鍠栭弻銊モ攽閸♀晜笑缂備胶濮撮…鐑藉蓟濞戙垹绠涙い鏍电到濞堟繈姊鸿ぐ鎺濇闁稿繑锚閻ｉ绮欑拠鐐閺佹挻绂掔�ｎ偄鐝旈梺缁樻煥閸氬鎮￠妷鈺傜厽闁哄倹瀵ч幆鍫ュ冀閿熺姵鈷戦柛婵嗗閸ｈ姤銇勯鐐靛ⅵ婵狅拷娓氾拷濮婅櫣绱掑Ο蹇ｄ簻铻ｅ┑鐘叉搐绾惧潡鐓崶銊︾缁炬儳銈搁弻锝呂熼幐搴ｅ涧闂佹眹鍔嶉崹鍧楀蓟閻旂厧鐭楀璺烘湰閹叉瑧绱撴担鍝勑ｉ柣鈺婂灠椤曪綁骞橀钘夛拷濠氭煕閳╁喛渚涙俊顐犲劜缁绘繂顕ラ柨瀣凡闁跨喓鐛ら崨顓犵瓘婵炲濮撮鍛存偪椤斿浜滈柡宥庡亜娴狅箓鏌涚�ｎ亜锟藉湱鎹㈠☉銏犵婵炲棗绻掓禒楣冩⒑缂佹ɑ灏版繛鑼枛瀵顓兼径濠勫幐婵炶揪绲介幉锟犳倶閺囩喓绠鹃柟鎯ь嚟椤ｈ尙绱掔�ｎ偄绗ч柟骞垮灩閳藉濮�閻樿鏁归梻浣虹帛濮婅崵娑甸崼鏇炵鐟滅増甯楅埛鎴︽⒒閸喓鈾侀柟鍏煎姍閹顫濋悡搴ｄ桓闁芥ɑ绻堝娲敆閿熺晫绮旈悽鍛婂亗闁绘柨鍚嬮悡娆撴煣韫囨洘鍤�濞寸姵绮嶉妵鍕煛婵犲倸顫紓浣介哺鐢繝銆佸▎鎴濇瀳闁告鍋涙竟搴繆閵堝洤啸闁稿鍋熼弫顕�鍨鹃幇浣告濡炪倖娲╅幏鐑芥煛娴ｈ宕岄柟顔藉劤閻ｆ繄锟斤綆鍋勯璺衡攽椤旀枻渚涢柛妯恒偢瀹曨偄煤椤忓懐鍘搁悗鐧告嫹闁跨喍绮欏畷浼村箻閼告娼熼梺鍦劋閸わ箓鎮㈤崨濠傤潯闂佸搫顦悘婵嬫倶娴ｇ硶鏀介柣妯虹仛閺嗏晠鏌涚�ｎ剙鏋涚�规洏鍨奸ˇ鍦拷瑙勬处閸ㄨ泛鐣风粙璇炬棃鏁撴禒瀣亗婵鎷烽柡宀�鍠愬蹇斻偅閸愨晩锟藉秹姊虹粙鍖″姛闁稿繑锕㈠濠氬焺閸愩劎绐為柣搴秵娴滅偞绂掗崗鑲╃閻庣數顭堟牎闂佸湱顭堥崯鍧楋綖韫囨稒鎯為柛锔诲幘閿涙粌鈹戦绛嬫當婵☆偅鐟╅幃楣冨醇閺囩啿鎷洪梺鍦焾鐎涒晝澹曢幖浣圭厱閹兼番鍨归埢鏇㈡煛娴ｈ灏扮紒鍌涘笧閿熸枻缍嗛崑鍛存煥椤撱垺鈷戦梻鍫熺〒婢ф盯鏌熼鐓庯拷鎼侇敋閿濆鏁冮柨鏇嫹缂佺姾宕电槐鎾存媴閼测剝鍨甸埢宥夊閵堝棌鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷.闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸啴鏁撻悾灞筋棜濠靛倸鎲￠悡銉╂煛閸愩劍澶勬い銉ヮ槹閵囧嫯绠涢妷锕�顏�" + roleid + "]闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绉柡灞诲姂瀵噣宕堕…鎴烆棄闂備浇娉曢崰鏇炍涢崟顐劷闁跨喓濮撮拑鐔兼煏婵炵偓娅呴柛妤佸▕閺岋綁骞囬锝呮疂闂佸湱鍏橀ˉ鎾跺垝濞嗘垶瀚氶柣鎰靛墰閳藉鎽堕敐鍛斀闁稿本绻冮ˉ澶岀磽瀹ュ拑韬�殿噮鍋婇獮鍥级閸喚鐛╂俊鐐�栭幐鍡涘礋閸偒妫撻梻鍌氬�搁崐鐑芥倿閿曞倸绠栭柛顐ｆ礀绾惧綊鏌″搴ｄ汗婵炲樊浜濋崑鍕煟閹捐櫕鍞夐柟鑺ユ礀閳规垿鎮欓弶鎴犱户闂佹悶鍔屽﹢杈╁垝鐠囨祴妲堥柕蹇ョ磿閸橆亝绻濋悽闈浶㈢紒缁樏‖濠囶敋閿熶粙寮婚敐鍛斀闁搞儯鍔庨ˇ銉ヮ渻閵堝簼绨婚柛鐔风摠娣囧﹪宕奸弴鐐茶�垮┑鈽嗗灣閸樠冾嚕閹惰姤鈷掑ù锝勮閻掗箖鏌ㄩ弴妯哄姦妤犵偛鍟村畷鎺楁倷閼碱兛绱滈梻浣瑰濞叉牠宕愰幖浣圭叆闁靛牆妫旂换鍡涙煏閸繂顏い锔奸檮缁绘盯宕奸悢铏圭杽濠殿喖锕ら幖顐ｆ櫏闂佹悶鍎滈崨顒傜？闂傚倷娴囧銊╂倿閿曞倸绠栭柛宀�鍋涚粻鏍煟閹邦剦鍤熼梻鍕閺屾稑鈽夊Ο鎴濈墦楠炲繐煤椤忓應鎷洪梺鐓庮潟閸婃洟寮搁幋婵愮唵闁荤喓澧楅ˉ銏ゆ煙椤曪拷缁犳牠銆佸锟芥慨锟介柨娑樺楠炲牓姊绘笟锟藉褔鈥﹂崼銉ョ鐎广儱锛嗘径瀣窞闁归偊鍘鹃崢浠嬫⒑閹稿海绠撴繛灞傚�濆畷銏ゅ箻椤旂晫鍘告繛杈剧秬椤鐣峰畝鍕厸濞达綀顫夊畷宀勬煛娴ｈ宕岄柡浣规崌閺佹捇鏁撻敓锟�?:" + questid);
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				RoleAnYeTask rayt = new RoleAnYeTask(roleid);
				rayt.abandonTask();
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 807460;

	public int getType() {
		return 807460;
	}

	public int questid; // 放弃的任务id(暗夜马戏团1080000)

	public CAbandonAnYe() {
	}

	public CAbandonAnYe(int _questid_) {
		this.questid = _questid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(questid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		questid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAbandonAnYe) {
			CAbandonAnYe _o_ = (CAbandonAnYe)_o1_;
			if (questid != _o_.questid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += questid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(questid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAbandonAnYe _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = questid - _o_.questid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

