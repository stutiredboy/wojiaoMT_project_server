
package fire.pb.circletask.anye;

import fire.pb.circletask.CircleTaskManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLengendAnYetask__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CLengendAnYetask extends __CLengendAnYetask__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;	
		CircleTaskManager.logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀崣澶樻▊闂佺粯甯掗敃顏堝蓟閺囩喓绠鹃柣鎰靛墯閻濇梻绱撴担鍝勵�岄柛銊ョ埣瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘遍柣搴到婢у海绮旈锟介弻锛勪沪閸撗�妲堥梺瀹狀潐閸ㄥ灝鐣烽崡鐐嶆梹绻濇担鐑橈紡闂傚倸鍊峰ù鍥敋閺嶎厼鍨傚ù鐓庣摠閸嬪鏌熼幑鎰靛殭闁藉啰鍠栭弻銊モ攽閸♀晜笑缂備胶濮撮…鐑藉蓟濞戙垹绠涙い鏍电到濞堟繈姊鸿ぐ鎺濇闁稿繑锕㈤悰顕�寮介妸锕�顎撻梺闈╁瘜閸橀箖寮抽姀銈嗏拻闁稿本鑹鹃敓浠嬵棑缁牊绗熼敓钘夌暦閵壯嶆嫹閿濆骸澧伴柣顓炵墦閺岀喓绱掗姀鐘崇亪闂佹眹鍊楅崑鎾舵崲濞戙垹绠ｆ繛鍡楃箳娴煎嫰姊虹捄銊ユ瀺缂侇喗鐟╁銊︽綇閵娧�鏀虫繝鐢靛Т濞诧箓宕愰柨瀣ㄤ簻闊洦鎸搁鐢告煙妞嬪骸鍘寸�殿喕绮欓垾鏍灳閾忣偅鍎撳銈嗘尭閸氬顕ラ崟顒傜瘈闁告洦鍓涢崣鍕攽閻樺灚鏆╁┑顔芥尦閺佸啴濡舵径濠勭枃闂佽澹嗘晶妤呭磿濡わ拷椤潡鎳滈棃娑橆潔闂佺粯鎸婚悷鈺呭蓟閿濆绠ｉ柣鎰閸ㄥ潡宕哄☉銏犵疀闁绘鐗嗛敓钘夌仛閹便劌顫滈崱妤�绠归梺鍛婄箖濡炰粙寮婚垾宕囨殕闁跨喍绮欏畷浼村箻閼告娼熼梺鍦劋閸わ箓鎮㈤崨濠傤潯闂佸搫顦悘婵嬫倶娴ｇ硶鏀介柣妯虹仛閺嗏晠鏌涚�ｎ剙鏋涚�规洏鍨奸ˇ鍦拷瑙勬处閸ㄨ泛鐣风粙璇炬棃鏁撴禒瀣亗婵鎷烽柡宀�鍠愬蹇斻偅閸愨晩锟藉秹姊虹粙鍖″姛闁稿繑锕㈠濠氬焺閸愩劎绐為柣搴秵娴滅偞绂掗崗鑲╃閻庣數顭堟牎闂佸湱顭堥崯鍧楋綖韫囨稒鎯為柛锔诲幘閿涙粌鈹戦绛嬫當婵☆偅鐟╅幃楣冨醇閺囩啿鎷洪梺鍦焾鐎涒晝澹曢幖浣圭厱閹兼番鍨归埢鏇㈡煛娴ｈ灏扮紒鍌涘笧閿熸枻缍嗛崑鍛存煥椤撱垺鈷戦梻鍫熺〒婢ф盯鏌熼鐓庯拷鎼侇敋閿濆鏁冮柨鏇嫹缂佺姾宕电槐鎾存媴閼测剝鍨甸埢宥夊閵堝棌鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷.闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸啴鏁撻悾灞筋棜濠靛倸鎲￠悡銉╂煛閸愩劍澶勬い銉ヮ槹閵囧嫯绠涢妷锕�顏�" + roleid + "]闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绋荤紒缁樼箞瀹曞綊顢曢姀鐙�娼旈梺璇查叄濞佳囨儗閸屾凹娼栨繛宸簻閹硅埖銇勯幘璺轰粶濠碘�虫惈閳规垿顢欑涵宄颁紣缂傚倸绉撮敃顏堝极閹扮増鍊烽柛婵嗗瀹撳棝姊洪棃娑㈢崪缂佽鲸娲熷畷銏ゆ焼瀹ュ棌鎷洪柣鐔哥懃鐎氼剛绮堥崘顔藉�堕煫鍥ㄦ⒒閹冲洨锟借娲樼换鍌烆敇閸忕厧绶為悗锝庝悍閹风兘宕归锝呭伎濠殿喗顨呭Λ妤呯嵁濡ゅ懏鐓熼柕濠忕畱閻忊晝绱掓潏銊ョ瑲婵炵厧绻樻俊鎼佹晝閿熺晫澹曢幎鑺ュ�甸悷娆忓缁�锟介梺闈涚墕閹诧繝骞堥妸鈺傛櫢濞寸姴顑嗛悡鐔镐繆椤栨粣绱版繝濠傜墕绾捐法锟借娲栧ú锕傦綖閺囥垺鐓欓柣鎴炆戠亸顓犵磼閸撲礁浠滈柍瑙勫灴閹晠寮婚妷顕嗘嫹濡や胶绠鹃柛顐ｇ箓椤ｅ磭绱掓潏銊﹀鞍闁瑰嘲鎳忕粋鎺旓拷锝庝簼閹虫瑩姊绘担鍛婅础闁硅櫕鎸哥叅妞ゆ挾鍎愰崵鏇熴亜閹板墎鐣辩紒鐘哄吹缁辨挻鎷呴懖鈩冨灥閳诲秹濮�閵堝棌鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷?" + taskpos + "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘梻纾奸柨鐔诲Г瀵板嫬鐣濈�ｎ偄顏堕梺璋庡啯鍟為悗姘秺濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熲晛顕ｉ锕�绠荤紓浣姑▓鐔兼⒑闂堟冻绱￠柛娑卞幖缂嶅棝姊婚崒娆戭槮闁硅绻濋妴鍐幢濡偐顔曟繝鐢靛Т閸婂寮抽敂鐣岀鐎瑰壊鍠曠花濂告煕婵犲嫬鍘撮柡灞剧☉閳规垿宕卞Δ濠佺磾闂備礁鎽滈崑娑㈡偉閻撳寒娼栨繛宸簼椤ュ牊绻涢幋锝夊摵閼叉牠姊绘担渚劸閻庢稈鏅滅换娑欑節閸ャ儻鎷锋担鑲濈喐绺介懞銉︺仢妞ゃ垺妫冨畷顏呮媴鐠団剝顥婃繝纰夌磿閸嬫垿宕愰弽顓炵闁硅揪绠戦崹鍌炴煟閹寸伝顏嗘閻愮儤鐓曢柡鍥ュ妼閻忥繝鏌ｉ幘瀵告噭闁逛究鍔岄埞鎴﹀幢濮橆剦浼冮梻浣告啞閼规儳锕㈡潏鈺傤潟闁圭儤顨忛弫濠囨煠濞村娅呴柍顏堜憾濮婅櫣鎹勯妸銉︾�鹃梺鍝勵儓瀹曠數妲愰悙鍝勫耿婵炴垶鐟﹀▍銏＄節濞堝灝鏋熼柛鏃�娲熼幃姗�鍩￠崘顏嗭紳閻庡箍鍎遍幏鎴︾叕椤掍緡娈介柣鎰絻閺嗭綁鏌涢埡瀣瘈鐎规洘甯掗…銊╁川椤斿吋鐤勬繝纰夌磿閸嬫垿宕愰弽顓熷亱婵°倕鍟弸鍫拷骞垮劚椤︿粙寮繝鍥ㄧ厱闁哄洢鍔屾禍鎰版煛閿熻姤绂掔�ｎ偆鍘藉┑鈽嗗灥椤曆勬櫠椤栫偞鐓曢柣鏃堫棑缁犲鏌＄仦鍓ф创闁轰焦鍔栭幆鏃堟晬閸曨亝顢樺┑掳鍊楁慨鐑藉磻濞戞碍宕叉慨妤嬫嫹鐎殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�!");
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				RoleAnYeTask rayt = new RoleAnYeTask(roleid);
				rayt.startLegendAnYeTask(taskpos);
				rayt.refreshAnYeTasks(taskpos);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 807458;

	public int getType() {
		return 807458;
	}

	public int taskpos; // 任务栏位

	public CLengendAnYetask() {
	}

	public CLengendAnYetask(int _taskpos_) {
		this.taskpos = _taskpos_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(taskpos);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		taskpos = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLengendAnYetask) {
			CLengendAnYetask _o_ = (CLengendAnYetask)_o1_;
			if (taskpos != _o_.taskpos) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += taskpos;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(taskpos).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CLengendAnYetask _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = taskpos - _o_.taskpos;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

