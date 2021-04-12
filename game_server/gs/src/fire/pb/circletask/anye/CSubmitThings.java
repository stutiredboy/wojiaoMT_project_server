
package fire.pb.circletask.anye;
import fire.pb.HelpCountManage;
import fire.pb.item.ItemBase;
import fire.pb.item.Pack;
import fire.pb.npc.SubmitType;
import fire.pb.pet.PetColumnTypes;
import fire.pb.talk.MessageMgr;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSubmitThings__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSubmitThings extends __CSubmitThings__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		fire.pb.item.Pack submiterBag = new fire.pb.item.Pack(roleid, true);
		for (SubmitThing unit : things) {
			if (submittype == SubmitType.PET)
				continue;
			if (submittype == SubmitType.MONEY) {
				long money = unit.key;
				if (submiterBag.getMoney() < money)
					continue;
			} else {
				ItemBase bi = submiterBag.getItem(unit.key);
				if (bi == null) {
					continue;
				}
				if (bi.getNumber() < unit.num) {
					continue;
				}
			}
		}
		
		java.util.List<xbean.PetInfo> pis = null;
		if (submittype == SubmitType.PET) {
			pis = new java.util.ArrayList<xbean.PetInfo>();
			final fire.pb.pet.PetColumn petcol = new fire.pb.pet.PetColumn(roleid, PetColumnTypes.PET, true);
			for (SubmitThing unit : things) {
				fire.pb.pet.Pet pet = petcol.getPet(unit.key);
				if (pet == null || pet.isLocked() != -1)
					return;
				if (petcol.petIsFightPet(unit.key) || petcol.petIsShowPet(unit.key)) {
					MessageMgr.sendMsgNotify(roleid, 144418, null);
					return;
				}
				pis.add(pet.getPetInfo().copy());
			}
		}
		
		if (submittype == SubmitType.ITEM) {
			Pack bag = new Pack(roleid, true);
			for (SubmitThing unit : things) {
				ItemBase item = bag.getItem(unit.key);
				if (item == null)
					return;
			}
		}
		
		if (taskid == 1080000 && roleid != taskrole) {
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬪銈冨灪閻熲晠骞冮埄鍐╁劅妞ゆ梹鍨濆锔剧磽閸屾艾锟芥悂宕愰悜鑺ュ殑闁兼悂娼ч崹鏃堟倵闂堟稒鎲哥紒锟芥繝鍌橈拷鎺戭潩閻愵剙顏堕柣搴㈩問閸犳牠鈥﹂悜钘夌畺闁靛繈鍊栭崑鏍倵濞戞顏堫敂閸洘鈷戞慨鐟版搐閻忣亝銇勯弮锟介悧鐘诲箖閻愭番鍋呴柛鎰╁妼閸炪劑姊虹捄銊ユ灁濠殿喚鏁婚崺娑㈠箣濠㈡繂缍婂畷妤呮嚃閳哄倸娅樼紓鍌欑椤︿粙宕伴弽顓熺畳婵犵數濮撮敃銈夊疮娴兼潙鏄ラ柨婵嗘祫閹峰嘲鈻撻崹顔界亪濡炪値鍘鹃崗姗�鐛崘顔碱潊闁靛牆妫欓崕顏堟⒑闂堚晛鐦滈柛娆忕箳濡叉劙宕ｆ径宀�鐦堢紒鍓у钃辨い顐躬閺屾盯濡搁埡鍌涢敪闂佷紮绲块崗姗�骞冩禒瀣仺闁汇垻鏁搁崢顖炴⒒娴ｈ鍋犻柛搴灦瀹曟繃鎯旈敐鍛氶梺璺ㄥ枙濡嫰鍩為幋锔藉�烽柤纰卞墮椤ｆ椽姊虹拠鑼缂佽鍊块崺銏狀吋閸涘倻鍠愮缓浠嬫偩鐏炴儳娈屽銈庡幑閸旀垵鐣烽悢纰辨晣闁绘﹢娼х敮銊╂⒒閸屾瑨鍏岀痪顓炵埣瀵剟宕掗悙鎻掔�┑鐐叉▕娴滄粎绮诲鑸电厸闁告劑鍔庢晶鏇㈠箚閻斿吋鈷戦梻鍫熷喕缁憋繝鏌涢幇鈺佸闁靛牆顦伴埛鎺楁煕鐏炲墽鎳呮い锔肩畵閺岀喓鎷犺缁★拷閻庤娲樼换鍡欑不濞戞ǚ妲堟俊顖氬悑閻擄絾绻濋悽闈浶㈤柨鏇樺�濋幃褍顭ㄩ崼婵囩�繝鐢靛Т鐎氭悂骞忛悜鐣屽祦闁割煈鍠栨慨搴☆渻閵堝繒绱伴柛妤佸▕瀹曞搫鈽夐姀鐘殿吅闂佹寧姊婚弲顐﹀储閸楃偐鏀介柣妯肩帛濞懷勪繆椤愶綆娈滄い銏℃閸╋繝宕掑Ο鍦泿闂傚鍋勫ú锕�顫忛崷顓濈剨闁挎洖鍊归悡娑㈡倶閻愭彃鈷旀繛鍙夋綑閳规垿鍩勯崘鈺侊拷鎰攽閳ュ磭鍩ｇ�规洏鍔戦、姗�鎮╅闂寸病濠电姴鐥夐弶鍖℃嫹濡や焦鍙忛柣鎴ｆ绾剧粯绻涢幋鐑嗙劯婵炴垶菤閺嬪酣鏌熼幆褏锛嶆い鏂挎濮婃椽宕ㄦ繝鍕ㄦ濠电偛鍚嬮悷褏鍒掗崼銉ラ唶闁靛濡囬崢鐢电磽閸屾瑧鍔嶉柨姘辩磼濡や胶顣茬紒缁樼洴瀹曘劑顢橀妸銊ユ儓婵犳鍠栭敃锔惧垝椤栫偛绠柛娑欐綑瀹告繂鈹戦悩鎻掞拷鐟扳枔濮楋拷濮婄粯鎷呴挊澶婃優闂佸摜濮村Λ婵嗙暦閺囩喐濯撮柛鎰ㄦ櫓濡劌鈹戦敍鍕杭闁稿﹥鐗犻幃褍螖閸愵亞鐓撻梺鍦劋椤ㄥ懘鎯屽Δ鍛彄闁搞儯鍔庨埦渚�鏌ｉ幘鍗炲姦闁哄矉缍佸鎾倷鐠囇勫闁革富鍙忛幏宄邦潩閻愵剙顏�
			//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤濞硷繝寮婚悢鐚存嫹閻㈡鐒鹃崯鍝ョ磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿埖鈷戦梻鍫熺♁閹兼劙鎮楀顓熺凡妞ゆ洩缍侀獮姗�顢欓悡搴わ拷鍨攽鎺抽崐褔骞忛柨瀣ㄤ簻闊浄绲奸柇顖炴煛鐏炲墽鈽夐柍璇叉唉缁犳盯寮撮悪锟介崯瀣⒒娴ｅ憡鎯堥柣顓烆槺缁辩偞绗熼敓浠嬫偘椤曪拷瀹曞爼顢楁径瀣珜濠电偠鎻徊鍧楀箠閹捐绀堥柣銏㈡暩绾句粙鏌涚仦鍓ф噯闁稿繐鑻埞鎴︻敊閹冨箣閻庢鍣崑鍛崲濠靛棭娼╂い鎺戝暞閹蹭即姊绘担瑙勭伇闁哄懏鐩畷顖烆敃閵堝棭鍋ㄩ梺缁樺姉閸庛倝宕愰悽鍛婄叆婵犻潧妫涢崙鍦磼閵娿劍顥夐棁澶愭煟濡寧鐝悘蹇ョ畵閺岀喖顢欓幐搴ｃ�愬銈庡亝缁诲牆鐣烽敓鐘冲�烽柟鎵虫櫅閸斻倗绱掓潏銊ョ瑲婵炵厧绻樻俊鎼佹晝閿熶粙妫勫澶嬧拺闁荤喐婢樺Σ濠氭煙閾忣個顏堟偩閻戣姤鍊荤紒娑橆儐閺咃絽鈹戦悙鏉戠仸闁荤噥鍨伴…鍥棘鎼存挻鏂�闂佹寧绋戠�氼剚绂嶆總鍛婄厱濠电倯鍐╁櫧濞戞挸绉归弻鐔兼倻濡钄兼繛瀵稿Т閻楁捇寮婚悢鍏尖拻闁圭虎鍠楅鏍⒑鐠恒劌鏋欐俊顐㈠瀹曨垳锟芥稒眉缁诲棝鏌ｉ幋锝嗩棄闁绘挻绋戦湁闁挎繂鎳忛幆鍫ユ煥閻旂儤娅曢柛瀣洴閳ユ棃宕橀鍢壯囨煕閳╁喚娈橀柣鐔稿姍閺岋綁鎮╂潏鈺佸闂佺粯鎼换婵嬫偘椤曪拷楠炲洭寮剁捄顭戞О婵＄偑鍊栧Λ浣筋暰闂佸綊鏀卞浠嬪箖瀹勯偊鐓ラ柛娑卞弾閺嗩參鏌ｉ姀鈺佺仭閻㈩垱顨堢划瀣吋閸℃鍤ら柣搴㈢♁椤洭宕㈤柆宥嗏拺閻熸瑥瀚崝銈嗐亜閺囥劌寮鐐诧躬瀹曞爼顢楁担鍝勫箥婵＄偑鍊栧ú鏍涘☉姘К闁跨喍绮欏鐑樻姜閹殿喖濡介梺鍦嚀濞差厼顕ｉ锕�绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹
			int submiterLv = xtable.Properties.selectLevel(roleid);
			if(submiterLv<fire.pb.circletask.PSubmitThings.getGiveHelpLevel()){
				MessageMgr.sendMsgNotify(roleid, 145390, null);
	    		return;
			}
			
			xbean.helpcount helpcount = xtable.Helpcount.select(roleid);
	    	int max=HelpCountManage.getInstance().getHelpGiveItemNumMax(roleid);
	    	if(helpcount!=null&&helpcount.getHelpgiveitemnum()>=max){
	    		MessageMgr.sendMsgNotify(roleid, 166088, null);
	    		return;
	    	}
	    	//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬪銈冨灪閻熲晠骞冮埄鍐╁劅妞ゆ棁濮ょ粊浼存⒒閸屾艾锟界兘鎳楅崼鏇楋拷锕傚醇閻曚焦顔旈梺鍛婄缚閸庡骞忓畡鎵虫闁圭儤鎸婚悵姘節绾板纾块柡浣筋嚙閻ｇ兘鎮㈢喊杈ㄦ櫖濠殿喗顭堟禍顒�顭囨径鎰拻濞达絼璀﹂悞楣冩煛閸偄澧扮紒顔界懇楠炴帒螖娴ｉ晲鎴锋俊鐐�曠换鎰版偋婵犲洤鐓曢柟杈鹃檮閻撴瑩鏌ゅù瀣珔濞寸姵绮岄埞鎴﹀灳閻愯棄浠梺鍝勬湰濞茬喎鐣锋總鍛婂亜缂佸灏呴幏鐑藉箛椤撗勵啍闂佺粯鍔栬ぐ鍐汲閵忋倖鐓忛柛銉ｅ妼婵秵顨ラ悙鏉戞诞妤犵偛顑夐幃鈺冩嫚瑜庣�氬綊鏌ｉ幇顒佲枙婵炴挸顭烽弻鏇㈠醇濠靛浂妫炵紓浣诡殔閸婂潡寮婚敐澶婄闁绘劗鏁搁弳銈夋倵濞堝灝鏋熷┑鐐诧躬楠炲啴鍩￠崘顏嗭紲濠碘槅鍨堕弨杈╋拷姘悑缁绘繈鎮介棃娑楀摋闁诲繐娴氭禍顏堛�佸▎鎰瘈闁告洦鍠栧皬闂備胶顭堢换妤呭磻閹邦喖濮柨鐔剁矙濮婃椽妫冨☉姘辩暰濠碘剝褰冪�氫即骞婇幘璇查敜婵°倓鑳堕崢閬嶆⒑瀹曞洦鍤�闁诲繑绻堥幃姗�顢旈崼鐔哄幍濡炪倖鐗楃粙鎺椝夐崼婵冩斀闁斥晛鍟崐鎰攽閿涘嫭鐒挎い锔藉絻閳规垿顢欓懖鈺佺厽濠殿喖锕︾划顖炲箯閸涙潙宸濆┑鐘插�瑰▓姗�姊绘担鍛婂暈闁哄被鍔庨幑銏犖熸笟顖氭闂佸湱绮敮鈺呮偂閵夆晜鐓曟い鎰靛亜娴滄繈鏌￠崨顏呮珚闁诡喗顨婇悰顕�宕归鐓庮潛婵＄偑鍊х紓姘跺础閹惰棄鏄ユ繛鎴欏灩缁狅綁鏌ㄩ弮鍌涙珪闁告ê宕埞鎴︽偐缂佹ɑ閿┑鈽嗗亝椤ㄥ﹪銆侀弮鍫濈厸闁稿本眉缁ㄥ妫呴銏″婵﹤婀辨禍鎼佹晝閸屾稓鍘搁柣蹇曞仜婢ц棄煤閺夋垟鏀介柍鈺佸暞閸婃劕鈹戦垾宕囧煟鐎规洏鍔戦、姗�鎮╅闂寸病濠电姴鐥夐弶鍖℃嫹濡や焦鍙忛柣鎴ｆ绾剧粯绻涢幋鐑嗙劯婵炴垶菤閺嬪酣鏌熼幆褏锛嶆い鏂挎濮婃椽宕ㄦ繝鍕ㄦ濠电偛鍚嬮悷褏鍒掗崼銉ラ唶闁靛濡囬崢鐢电磽閸屾瑧鍔嶉柨姘辩磼濡や胶顣茬紒缁樼洴瀹曘劑顢橀妸銊ユ儓婵犳鍠栭敃锔惧垝椤栫偛绠柛娑欐綑瀹告繂鈹戦悩鎻掞拷鐟扳枔濮楋拷濮婄粯鎷呴挊澶婃優闂佸摜濮村Λ婵嗙暦閺囩喐濯撮柛鎰ㄦ櫓濡劌鈹戦敍鍕杭闁稿﹥鐗犻幃褍螖閸愵亞鐓撻梺鍦劋椤ㄥ懘鎯屽Δ鍛彄闁搞儯鍔庨埦渚�鏌ｉ幘鍗炲姦闁哄矉缍佸鎾倷鐠囇勫闁革富鍙忛幏宄邦潩閻愵剙顏�
	    	xbean.helpcount taskrolehelpcount = xtable.Helpcount.select((long) taskrole);
	    	int maxtaskrolehelpcount=HelpCountManage.getInstance().getHelpItemNumMax(taskrole);
	    	if(taskrolehelpcount!=null&&taskrolehelpcount.getHelpitemnum()>=maxtaskrolehelpcount){
	    		MessageMgr.sendMsgNotify(roleid, 166093, null);
	    		return;
	    	}
		}
		
		fire.pb.circletask.PSubmitThings proc= new fire.pb.circletask.PSubmitThings(roleid,taskrole,things,taskpos);
		mkdb.Procedure.execute(proc);
		return;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 807455;

	public int getType() {
		return 807455;
	}

	public int taskpos; // 任务栏位
	public int taskid; // 任务id
	public long taskrole; // 任务所属角色id(帮别人提交物品时用到)
	public int submittype; // 提交的类型 1道具 2宠物 3金钱
	public java.util.ArrayList<fire.pb.circletask.anye.SubmitThing> things; // 提交的道具key 或者宠物的key

	public CSubmitThings() {
		things = new java.util.ArrayList<fire.pb.circletask.anye.SubmitThing>();
	}

	public CSubmitThings(int _taskpos_, int _taskid_, long _taskrole_, int _submittype_, java.util.ArrayList<fire.pb.circletask.anye.SubmitThing> _things_) {
		this.taskpos = _taskpos_;
		this.taskid = _taskid_;
		this.taskrole = _taskrole_;
		this.submittype = _submittype_;
		this.things = _things_;
	}

	public final boolean _validator_() {
		if (taskpos < 0) return false;
		if (taskid < 0) return false;
		if (taskrole < 0) return false;
		if (submittype < 0) return false;
		for (fire.pb.circletask.anye.SubmitThing _v_ : things)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(taskpos);
		_os_.marshal(taskid);
		_os_.marshal(taskrole);
		_os_.marshal(submittype);
		_os_.compact_uint32(things.size());
		for (fire.pb.circletask.anye.SubmitThing _v_ : things) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		taskpos = _os_.unmarshal_int();
		taskid = _os_.unmarshal_int();
		taskrole = _os_.unmarshal_long();
		submittype = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.circletask.anye.SubmitThing _v_ = new fire.pb.circletask.anye.SubmitThing();
			_v_.unmarshal(_os_);
			things.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSubmitThings) {
			CSubmitThings _o_ = (CSubmitThings)_o1_;
			if (taskpos != _o_.taskpos) return false;
			if (taskid != _o_.taskid) return false;
			if (taskrole != _o_.taskrole) return false;
			if (submittype != _o_.submittype) return false;
			if (!things.equals(_o_.things)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += taskpos;
		_h_ += taskid;
		_h_ += (int)taskrole;
		_h_ += submittype;
		_h_ += things.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(taskpos).append(",");
		_sb_.append(taskid).append(",");
		_sb_.append(taskrole).append(",");
		_sb_.append(submittype).append(",");
		_sb_.append(things).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

