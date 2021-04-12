
package fire.pb.circletask;
import java.util.Map;





import fire.pb.circletask.anye.RoleAnYeTask;
import fire.pb.mission.PAbandonScenarioMission;
import fire.pb.mission.Sbukefangqirenwu;
import fire.pb.mission.UtilHelper;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAbandonQuest__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAbandonQuest extends __CAbandonQuest__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		CircleTaskManager.logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀崣澶樻▊闂佺粯甯掗敃顏堝蓟閺囩喓绠鹃柣鎰靛墯閻濇梻绱撴担鍝勵�岄柛銊ョ埣瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘遍柣搴到婢у海绮旈锟介弻锛勪沪閸撗�妲堥梺瀹狀潐閸ㄥ灝鐣烽崡鐐嶆梹绻濇担鐑橈紡闂傚倸鍊峰ù鍥敋閺嶎厼鍨傚ù鐓庣摠閸嬪鏌熼幑鎰靛殭闁藉啰鍠栭弻銊モ攽閸♀晜笑缂備胶濮撮…鐑藉蓟濞戙垹绠涙い鏍电到濞堟繈姊鸿ぐ鎺濇闁稿繑锚閻ｉ绮欑拠鐐閺佹挻绂掔�ｎ偄鐝旈梺缁樻煥閸氬鎮￠妷鈺傜厽闁哄倹瀵ч幆鍫ュ冀閿熺姵鈷戦柛婵嗗閸ｈ姤銇勯鐐靛ⅵ婵狅拷娓氾拷濮婅櫣绱掑Ο蹇ｄ簻铻ｅ┑鐘叉搐绾惧潡鐓崶銊︾缁炬儳銈搁弻锝呂熼幐搴ｅ涧闂佹眹鍔嶉崹鍧楀蓟閻旂厧鐭楀璺烘湰閹叉瑧绱撴担鍝勑ｉ柣鈺婂灠椤曪綁骞橀钘夛拷濠氭煕閳╁喛渚涙俊顐犲劦濮婂宕掑▎鎰偘濡炪倖娲橀悧鐘茬暦鐟欏嫮闄勯柛娑橈工閿熻棄鐖奸弻鐔兼焽閿曪拷閻忔稑霉濠婂啰绉洪柡宀�鍠栭幃婊兾熺拠鑼暡濠电偛鐡ㄧ划蹇涳綖婢跺本宕叉繛鎴欏灩缁犲鏌℃径瀣仴婵絽鐗撳娲箹閻愭彃顬夊┑鐘灪閿曘垽宕洪姀銈呯婵炶尙绮弲锝夋⒑缂佹ɑ顥嗘繛鍜冪秮閹線宕煎┑鍐╂杸闂佺粯鍔樼亸娆愭櫠閺囥垺鐓熼煫鍥ㄦ⒒缁犵偟锟芥鍠楅幃鍌涗繆閼搁潧绶為悗锝庡墮楠炲牓姊绘担铏瑰笡閽冮亶鏌ｉ幙鍕瘈鐎规洩缍佸畷鐔碱敍濞戞艾骞堥梻浣哥－閹虫捇鎮樺┑瀣婵犲﹤鎷戦幏鐑藉垂椤愶絿鍑￠柣搴㈢煯閸楁娊鎮伴锟藉畷鍫曨敆婢跺娅岄梻浣告啞濞诧箓宕戦崨鏉戞辈妞ゅ繐鐗婇埛鎺楁煕鐏炲墽鎳嗛柛蹇撶灱缁辨帡顢氶崨顓犱桓閻庢鍠栭…閿嬩繆閹间焦鏅滈柤鎭掑劤瑜板潡姊虹涵鍛棈闁规椿浜炲濠囧锤濡や礁鍓归梺绯曞墲缁嬫帡鎮￠妷鈺傜厽闁哄洨鍋涢敓钘夋贡閿熻姤鐔幏锟�.闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸啴鏁撻悾灞筋棜濠靛倸鎲￠悡銉╂煛閸愩劍澶勬い銉ヮ槹閵囧嫯绠涢妷锕�顏�" + roleid + "]闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绉柡灞诲姂瀵噣宕堕…鎴烆棄闂備浇娉曢崰鏇炍涢崟顐劷闁跨喓濮撮拑鐔兼煏婵炵偓娅呴柛妤佸▕閺岋綁骞囬锝呮疂闂佸湱鍏橀ˉ鎾跺垝濞嗘垶瀚氶柣鎰靛墰閳藉鎽堕敐鍛斀闁稿本绻冮ˉ澶岀磽瀹ュ拑韬�殿噮鍋婇獮鍥级閸喚鐛╂俊鐐�栭幐鍡涘礋閸偒妫撻梻鍌氬�搁崐鐑芥倿閿曞倸绠栭柛顐ｆ礀绾惧綊鏌″搴ｄ汗婵炲樊浜濋崑鍕煟閹捐櫕鍞夐柟鑺ユ礀閳规垿鎮欓弶鎴犱户闂佹悶鍔屽﹢杈╁垝鐠囨祴妲堥柕蹇婏拷绛规嫹閸洘鐓熼柟閭﹀灠閻撴劖銇勯妷銉Ч闁靛洤瀚粻娑欑節閸愨晝褰嬫俊銈囧Х閸嬬偤鎮ч悩宸殨闁割偅娲栫粻锝嗐亜閺嶃劎绠撻柟顖氱墛缁绘繂鈻撻崹顔界亪闂佹寧娲忛崕閬嶁�旈崘顔藉癄濠㈠厜鏅滈惄顖氱暦濮楋拷椤㈡瑩鎳栭埡浣哥闂傚倷鑳堕…鍫ュ嫉椤掑嫬绀勯悷娆忓椤曢亶鏌ㄩ悤鍌涘?:" + questid);
		if(questid == 1080000) {
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀崣澶樻▊闂佺粯甯掗敃顏堝蓟閺囩喓绠鹃柣鎰靛墯閻濇梻绱撴担鍝勵�岄柛銊ョ埣瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘介梺瑙勫劤椤曨參骞婇崟顖涚厪闁搞儜鍐句純閻庢鍠栭敓鐣屽櫏濡茬厧顪冮妶鍐ㄥ姕缂侇喗鎹囧濠氭偄閸忓吋鍎銈嗗姂閸ㄥ綊锝為幒妤佲拺閺夌偞澹嗛ˇ锔剧磼婢跺﹦绉烘鐐插暙閳诲酣骞橀弶鎴嫹缂佹ü绻嗘い鏍仦閺侀亶鎮楀顑惧仮婵﹦绮幏鍛村川婵犲倹娈樼紓鍌欐祰椤曆囧磹婵犳碍鏅搁柤鎭掑劚閸ゎ剟鏌涘▎蹇撴殺婵☆偁鍨藉铏圭磼濡搫顫嶉梺浼欑秵娴滄繄绮嬪鍜佺叆闁割偆鍠撻崢顏呯節閻㈤潧浠滈柣蹇旂箞瀹曟繂顭ㄩ崼鐔哄幈闂侀潧鐗嗛幊蹇擃啅濠靛牞鎷峰▓鍨殭闁搞儜鍜佸晪闂佺儵鍓濈敮濠勭矆娴ｈ櫣绀婂┑鐘叉搐閺嬩線鏌熼悧鍫熺凡鐎瑰憡绻冮妵鍕冀閵娧呯厑濠电偛鐗滈崹浼村煘閹达附鍊风�瑰壊鍠栧▓鑸电節濞堝灝鏋ら柡浣规倐瀹曠増绻濋崒銈呮倯婵犮垼娉涜癌闁挎洖鍊归悡鏇㈡煛閸ャ儱濡奸柣蹇曞Х缁辨帡鎮╅懠顒婄礊闂佽法鍠曞Λ鍕不瀹ュ纾块柛妤冧紳瑜版帒纾兼慨锝囥�嬬紞渚�銆佸鑸垫櫢闁芥ê顦藉鏍煣韫囨凹娼愰悗姘哺閺屻倗鍠婇崡鐐差潾濡炪倖鏌ㄥú銈夊煘閹达箑鐓￠柛鈩冦仦缁ㄨ偐绱撴担绛嬪殭闁绘妫濋、姘舵晲閸ャ劌鐝板┑鐐存綑椤戝棝锝炲澶嬧拺闂傚牊绋撶粻鍐测攽椤旇偐澧﹀┑鈩冩倐閺佸倹娼幍顔炬晨闂傚倷绀侀幖顐﹀疮椤愶箑纾归柣鐔稿閺嬪秹鏌￠崶鈺佇ョ痪鎯с偢閺岀喖鏌囬敃锟介獮妤併亜閵夈儳澧涢柟渚垮妽缁绘繈宕橀埞澶歌檸闂備浇顕栭崰姘跺礂濮楋拷閻涱喖顓兼径妯绘櫓闂佺粯鍔﹂崜姘额敊閸℃稒鈷掗柛灞剧懅閸斿秹鏌熼鑲╁煟鐎规洘绻嗙粻娑㈠箻閹邦厾娲寸�规洜鍠栭、娑樷槈濡鍋呴梺璇叉捣閹虫挾锟芥凹鍘界粩鐔猴拷锝庡枛缂佲晛霉閻樺樊鍎愰柛濠勬暬閺屻劌鈹戦崱娆忓毈缂備降鍔忓Λ鍕箒闂佺粯鎸哥�垫帡宕曢弮锟介幈銊︾節閸愨斂浠㈤梺纭呮珪閻楃娀宕洪悙鐑樺�锋い鎺炴嫹闁绘繈浜跺缁樻媴閸涘﹤鏆堥梺鍦焾椤兘骞嗛崟顖ｆ晬婵椴稿▓楣冩⒑鐟欏嫬顥嬪褎顨婂畷鎰版倻閼恒儳鍘介梺鐟邦嚟閸庢劙鎮炴禒瀣厱婵☆垰婀遍惌娆愭叏婵犲懏顏犵紒杈ㄥ笒铻ｉ柛蹇曞帶濞呮垿姊绘担鐑樺殌闁哥喕娉曢幑銏ゅ箳濡や焦娅㈤梺鍏间航閸庢娊宕弻銉︾厵闁告垯鍊栫�氾拷?
			new mkdb.Procedure() {
				@Override
				protected boolean process() {
					RoleAnYeTask rayt = new RoleAnYeTask(roleid);
					rayt.endLegendAnYeTask();
					rayt.refreshAnYeTasks(-1);
					return true;
				}
			}.submit();
			return;
		}
		
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞稿墲瀵板嫮锟斤綆浜濋鍛攽閻愬弶鈻曞ù婊勭矒閿濈偤宕ㄧ�涙鍘梺鍓插亝缁诲啴宕虫禒瀣叆婵炴垶鑹鹃弸鎴犵磼缂佹娲寸�殿喖鐖奸獮瀣攽閸パ嶆嫹椤栨埃鏀介柣鎰絻閹垿鏌ｉ悢婵嗘噹閸ㄦ繂鈹戦悩瀹犲闁藉啰鍠栭弻鏇熷緞濞戞﹩娲梺鍛婏供娴滎亜螞閸涙惌鏁冮柕蹇婂墲閹瑥顪冮妶鍡楃仴闁硅櫕锕㈠顐﹀箻缂佹ê娈熼梺闈涱檧婵″洭藝椤撶姷纾藉〒姘搐閺嬫盯鏌ｅΔ锟介敃銈夘敋閵夆晛绀嬫い鏍ㄦ皑閻わ拷婵＄偑鍊栭幐鐐叏鐎靛憡鏆滄俊銈呮噺閳锋帒銆掑鐐濠电偘鍖犻崶浣告喘椤㈡﹢濮�閻樻妲烽柣搴ｆ閹风兘鏌涢弴銊ュ闁告搩鍘奸埞鎴︽倷閸欏鏋欐繛瀛樼矋缁诲牓骞冮敓鐘冲亜闁稿繗鍋愰崢浠嬫⒑閸濆嫬锟藉湱锟界瑳鍥х疅闁告縿鍎崇壕濂告煟濮楋拷濞佳勭闁秵鐓涚�癸拷鐎ｎ剛锛熸繛瀵稿缁犳挸鐣峰鍡╂Х濠碘剝褰冮悧鎾愁潖閾忕櫢鎷烽崷顓烆�岄柛銈嗙懃铻栭柣妯虹－閹藉啴鏌ｈ箛鏂挎诞婵﹥妞介獮鍡氼槾缂佺姴顭烽弻銊╂偄鐠囨畫鎾剁磼鐎ｎ偄娴�规洖鎼埥澶娾枎閹寸姷妲囬梻浣圭湽閸ㄨ棄顭囪缁傛帒顭ㄩ崼鐔哄幗闁圭儤濞婂畷婵囨償閵娿儳顦梺鍦劋閸╁牓宕ョ�ｎ喗鐓曢柕澶涚到婵¤姤绻涢崼婊冨祮婵﹥妞介幃娆撴寠婢跺﹤顫氶梻浣告啞閹歌鐣濈粙璺ㄦ殾闁汇垻顭堥崡鎶芥煏韫囥儳纾块柛姗嗕簼缁绘繈鎮介棃娑楁埛闂佺顑嗛幐鎼佸煝瀹ュ宸濇い鏍ㄧ矌閿涙粓姊虹紒姗嗙劸婵炲懏娲熼幆鍐箣閿旂晫鍘甸梺鍛婄懃椤﹂亶骞楅崘顏嗙＜闁绘ê纾ú瀵革拷娈垮枟閹告娊骞冨鍫濆耿婵妫欓敍鍛存⒒閸屾艾锟藉嘲霉閸パ�鏋栭柡鍥ュ灩闂傤垶鏌ㄩ弴鐐诧拷鍝ョ不椤栫偞鐓ラ柣鏇炲�圭�氾拷
		if(questid == 205303){
			return;
		}
		Map<Integer,Sbukefangqirenwu> map =  fire.pb.main.ConfigManager.getInstance().getConf(Sbukefangqirenwu.class);
		if(map != null){
			if(map.get(questid) != null){
				fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 141484, null);
				return;
			}
		}
		
		if ( UtilHelper.isBranchScenarioMission( questid ) ) {
			new PAbandonScenarioMission( roleid, questid ).submit();
			return;
		}
		
		new PAbandonCircleTask(roleid, questid).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 807434;

	public int getType() {
		return 807434;
	}

	public int questid; // 放弃的任务id

	public CAbandonQuest() {
	}

	public CAbandonQuest(int _questid_) {
		this.questid = _questid_;
	}

	public final boolean _validator_() {
		if (questid <= 0) return false;
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
		if (_o1_ instanceof CAbandonQuest) {
			CAbandonQuest _o_ = (CAbandonQuest)_o1_;
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

	public int compareTo(CAbandonQuest _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = questid - _o_.questid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

