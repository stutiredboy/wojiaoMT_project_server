
package fire.msp.circletask;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GFindShoolQuestDemonsNpc__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GFindShoolQuestDemonsNpc extends __GFindShoolQuestDemonsNpc__ {
	@Override
	protected void process() {
		// protocol handle
		
		java.util.Set<Long> objlist = fire.pb.scene.manager.RoleManager.getInstance().getSchoolRoles(objschool);
		java.util.List<fire.pb.scene.movable.Role> objrolelist = new java.util.ArrayList<fire.pb.scene.movable.Role>();
		if (objlist != null){
			for (Long rid:objlist){
				fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(rid);
				if (role == null)
					continue;
				if (role.getLevel() >= levelmin && role.getLevel() <= levelmax)
					objrolelist.add(role);
			}
		}
		if (!objrolelist.isEmpty()){
			int rand = fire.pb.util.Misc.getRandomBetween(0, objrolelist.size()-1);
			fire.pb.scene.movable.Role dstrole = objrolelist.get(rand);
			npcinfo.name = dstrole.getName();
			npcinfo.shape = dstrole.getModeid();
		}
		
		java.util.List<fire.msp.npc.NpcInfo> rlist = fire.pb.scene.manager.SceneNpcManager.getInstance().createNpc(npcinfo);
		
		// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁樺姍濠�渚�姊虹粙璺ㄧ闁告艾顑囩槐鐐哄箣閿旂晫鍘遍梺闈涱焾閸庨亶鏁撻挊澶嬭础闁瑰箍鍨归埥澶婎潨閸℃娅婃俊鐐�栧Λ浣哥暦閻㈠憡鍎庨幖杈剧悼绾惧ジ鏌ｉ幇闈涘闁告柣鍊栫换娑氭兜妞嬪海鐦堥悗娈垮枛椤攱淇婇崼鏇炶Е闁靛牆鎳忕拹锟犳煥閻斿憡鐏紓宥呮瀹曟垿宕ㄧ�涙ê浠ч梺鍝勫暙閻楀﹪鍩涢幋锔界厵闁兼祴鏅涙禒婊冣攽閿涘嫭娅曠紒杈ㄥ笧閹风娀鎳犻锟介埅鐢告倵濞堝灝鏋︽い鏇嗗洤鐓″鑸靛姇椤懘鏌ｅΟ娲诲晱闁哥喎顑嗙换婵嗩嚗闁垮绶查柨鐔虹崵閸パ咁唵闂佺粯鍨兼慨銈夊磹閸偅鍙忔俊顖滃帶鐢泛顭胯椤曨參鏁撻懞銉晱闁哥姵顨婇獮鍐磼濮樿鲸娈鹃梺鍦劋椤ㄥ棝宕愭搴ｇ＜妞ゆ梹顑欏鎰版倵濮橆兙鍋㈡慨濠勭帛閹峰懘宕ㄦ繝鍛攨婵＄偑鍊ら崢濂告偋韫囨稒鏅搁柤鎭掑劤閳绘捇鏌￠崨顖毿俊顐犲灲濮婅櫣鍖栭弴鐐测拤闂侀潧娲﹂惄顖氼嚕閵娾晜鍤嶉柕澶涚导缁ㄥ姊洪崫鍕拷鍦拷绗涘洤绠氶柛顐犲劜閻撱儵鏌ｉ弮鍥跺殭鐞氭岸姊虹紒姗嗘畷缂侇喖閰ｅ畷姘跺箳閺冩挻瀚归柨婵嗙凹閹查箖鏌涘顒夊剰妞ゎ叀娉曢幑鍕附闁捐埇鍊ゅΣ璇差渻閵堝骸寮ㄦ繛澶嬫礋楠炴垿宕熼鍌滄嚌濡炪倖鐗楅懝鐐珶鐎ｎ喗鈷掑ù锝呮啞閸熺偤鎷戦柆宥嗙厵妞ゆ梻鍘ч敓鑺ユ倐閿濈偠绠涘☉娆愬劒闂侀潻瀵岄崢楣冩偂閹剧粯鈷戦柛锔诲弾閻掗箖鎮楀☉鎺撴珚妤犵偛绻戝蹇涘煛閸愵亷绱冲┑鐐舵彧缁茶姤绔熸繝鍥х？闁规壆澧楅悡鏇㈡煏婵炲灝鍔滈柛瀣ㄥ劦閺屾洟宕遍弴鐙�妲銈庡亝缁诲牓銆佸Δ浣哥窞閻忕偠妫勫Ч鏌ユ⒒閸屾瑧顦﹂柟娴嬪墲缁楃喎螖閸涱厼鐎梺瑙勫劶婵倝寮查浣虹瘈濠电姴鍊绘晶娑㈡煃闁垮鐏撮柟顔肩秺楠炰線骞掗幋婵愮�抽梻浣告惈椤戝懐绮旈崜浣诡潟闁圭儤顨忛弫濠囨煟閿濆懏婀伴柛锝勫嵆閹鈻撻崹顔界彯闂佺顑呴敃顏堟偘椤旂⒈娼ㄩ柨鐔剁矙楠炲﹤顭ㄩ崘锝嗙亖闂佸湱顭堝ù椋庣矙閹邦喚纾介柛灞捐壘閿熻姤鎮傚畷鎰板传閵壯呯厯闂佸憡娲﹂崹鎵不椤栫偞鐓ラ柣鏇炲�圭�氾拷
		if (rlist == null || rlist.isEmpty() || rlist.size() < npcinfo.num){
			fire.msp.npc.MCreateNpcUniversalRet mret = new fire.msp.npc.MCreateNpcUniversalRet();
			mret.interfaceid = interfaceid;
			mret.result = 0;
			fire.pb.scene.SceneClient.pSend(mret);
			return;
		}
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氱紓鍌氬�烽懗鑸垫叏闁垮绠鹃柨鐔剁矙閺屸�崇暆閿熶粙宕伴弽褏鏆︽繝濠傛－濡查箖鏌ｉ姀鈺佺仭闁烩晩鍨跺璇测槈濮樼偓瀚归柨婵嗗暙婵″ジ鏌ㄩ悢璇残撶紒璇茬墕椤曪絾绻濆顒�宓嗛梺缁樻濞咃綁顢欓弴銏♀拺缂備焦锚婵箓鏌涢幘鏉戝摵闁诡喚鏁诲顕�宕掑鍜冪闯濠电偞鎸婚懝楣冩晝閵壯嶆嫹濮樻剚娼愮紒缁樼箞婵拷闁挎繂鎳愰崢顐︽⒑閸涘﹥鈷愰柣妤冨█楠炲啴鍨鹃弬銉︻潔闂侀潧楠忕槐鏇㈠储闁秵鈷戦梻鍫熶緱濡插爼鏌涢妸銉︽儓闁宠绉瑰畷銊э拷娑欘焽閸樻悂鏌ｆ惔顖滅У闁稿瀚伴幃姗�骞橀鐣屽幐闁诲繒鍋涙晶浠嬪煡婢舵劖鐓冮悹鍥у级閸炲绱掗悩宕囨创鐎殿喗鎸抽幃顏堟晸娴犲鐤悗锝庡枟閳锋帒霉閿濆懏鍟為柟顖氱墦閹泛顫濋悡搴濆枈閻庤娲樼换鍫ョ嵁鐎ｎ喗鏅濋柨鐔烘櫕缁寮介鐔哄帾闂佸壊鍋呯换宥呂ｉ崫銉ф／闁诡垎鍐╁�紓浣虹帛閻╊垶鐛�ｎ喗鍊婚柛銉鏉╂柨鈹戦悙宸殶闁靛棗顑夐獮蹇涙晸閿燂拷  闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞剧洴楠炲洭顢楅敓鐣岀棯瑜旈弻锝夊Χ閸涱収浠奸梺瀹狀潐閸ㄥ爼鐛繝鍥ㄧ厱濠电倯鍐╁櫣缂佽翰鍊曢湁闁绘ê妯婇崕蹇涙煟閵堝骸鏋熼柕鍥у楠炲洭鍩℃笟濠冨鐟滄棃鐛箛鎾舵殝闂侇叏闄勯崓闈涱渻閵堝棗绗掓い锔惧閺呫儵姊婚崒娆戠獢婵炰匠鍏犳椽濡堕崶閿嬪婵﹩鍋勫畵鍡涙煟濞戝崬娅嶆鐐村笒铻栭柨鐔烘櫕缁鏁愰崱娆戠槇闂佸壊鐓堥崑鍕叏閸愵亞纾奸弶鍫涘妿缁犵偞鎱ㄦ繝鍕笡闁瑰嘲鎳橀幊鐐哄Ψ閿濆繑瀚归柛鎰典簽绾惧ジ鏌ㄩ悢璇残撻柟宄版嚇閹虫牕鈹戦崶鈹炬闂佸疇顫夐崹褰掓晸閺傘倗绉靛ù婊愮秮楠炴寮撮姀鈾�鎷洪梺鍦焾濞撮绮婚幘娣簻闁挎棁顕ч悘锝囩磼椤旀鍤欓柍钘夘槸閳诲骸顓奸崟顓犳晨闂傚倷鑳堕幊鎾诲箹椤愩倗鐭撻柛顐ｆ礀缁�澶岋拷骞垮劚椤︿即鎮￠弴銏犵婵烇綆鍓欓悘顏堟倶韫囨洘鏆╃紒杈ㄥ笚濞煎繘濡搁敃锟介棄宥囩磽娴ｈ娈橀柛鐘冲姉閹广垹鈹戠�ｎ亞顦ㄥ銈庡幗閸ㄥ磭妲愰敃鍌涒拻闁稿本鑹鹃敓鐣屽厴閹虫宕滄担鐟板幑闂佸壊鍋呭ú鏍矆閸喓绡�闂傚牊绋撴晶銏ゆ煟椤撶喓鎳囬柡宀�鍠栭幃婊冾潨閸℃鏆﹂梻浣侯焾椤戝懘宕愰崸妤�钃熼柨婵嗩槸缁秹鏌涚仦鎹愬濠碘剝妞藉娲传閵夈儛锝夋煕閺冿拷椤ㄥ﹪寮幘缁樺癄濠㈣泛鐬奸弳娑㈡⒑缁嬪潡鍙勫ù婊冪埣閻涱噣宕橀鐓庣�銈嗘⒐绾板秴顪冩禒瀣拷渚�寮崼婵嗙獩濡炪倖姊婚悺鏃�绂掕濮婂宕掑▎鎰偘濠电偛顦板ú鐔风暦閹惰姤鏅濋柛灞炬皑椤斿棝姊虹捄銊ユ珢闁瑰嚖鎷� NPC闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗鎸抽幃娆戞嫚瑜庣�氬湱鎲搁悧鍫濈瑨缁炬儳娼￠弻鐔猴拷鐢殿焾鏍￠梺鍝ュУ閸旀瑩寮婚敐鍛傛棃鏁撴禒瀣亱闁糕剝鐟х粻鏃堟煙閻戞ɑ鈷掔痪鎯с偢閺屻劑鎮㈢拠娈嬫挾锟藉灚婢樼�氼剟鎮惧┑鍫嫹閿濆骸浜滄い蹇撶埣濮婅櫣鎷惔鈥虫殲闁哥喓鍋ら幃妤�顫濋鍌溞ㄥ┑顔硷龚濞咃綁骞戦崟顖毼╅柕澶涘閿熷�熸缁辨挻绗熼崶褎鐏嶉梺鑽ゅ暱閺呮盯顢氶敐澶樻晝闁挎洩鎷风紒鐘哄吹缁辨挻鎷呮慨鎴簻閳绘捇鎮㈤崗灏栨嫼闂傚倸鐗婃笟妤�危閸洘鐓曢幖绮癸拷瀹犲煘閻炴碍鐟╅弻娑㈩敃閵堝懏鐏佺紓浣哄█缁犳牠骞冨Δ锟介埥澶娾枎濡厧濮洪梻浣规た閸樺ジ顢栭崶鈺傤潟闁圭儤姊圭�氭岸鏌熺紒妯轰刊濞寸》鎷烽梻鍌欑閹诧紕鏁Δ鍐╂殰闁圭儤顨愮紞鏍ㄧ節闂堟侗鍎涢柡浣告喘閺岋綁寮崶顭戜哗闁煎弶鐗犲濠氬磼濞嗘垹鐛㈠┑鐐板尃閸℃顏犻梻鍌欑閹测剝绗熷Δ鍛瀭闂侇剙绋勭紞鏍拷鐧告嫹闁告洦鍏橀幏濠氭⒑缁嬫寧婀伴柣鐔濆洤绀夌�广儱顦伴悡娆愩亜閺冨洤浜归柛鈺嬬悼閿熷�燁潐濞叉ê煤閺嶎厸锟斤箓濡搁埡渚�鍞跺┑鐘绘涧濡盯鎮伴埡鍌欑箚闁绘劦浜滈敓鑺ョ墵閹兾旈崘顏嗙厯闂佸湱鍎ら〃蹇涘极婵犲洦鐓ラ柣鏇炲�圭�氾拷?
		fire.msp.npc.MUpdateNpcInfo mUpdateNpcInfo = new fire.msp.npc.MUpdateNpcInfo();
		mUpdateNpcInfo.npcs.addAll(rlist);
		fire.pb.scene.SceneClient.pSend(mUpdateNpcInfo);
		
		if (interfaceid > 0){
			fire.msp.npc.MCreateNpcUniversalRet mret = new fire.msp.npc.MCreateNpcUniversalRet();
			mret.interfaceid = interfaceid;
			mret.result = 1;
			mret.npclist.addAll(rlist);
			fire.pb.scene.SceneClient.pSend(mret);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 741900;

	public int getType() {
		return 741900;
	}

	public long interfaceid;
	public int objschool; // 寻找玩家所属的门派
	public int levelmin; // 最低等级
	public int levelmax; // 最高等级
	public fire.msp.npc.CreateNpcInfoUniverse npcinfo; // 找不到玩家时，按照npcinfo生成任务npc

	public GFindShoolQuestDemonsNpc() {
		npcinfo = new fire.msp.npc.CreateNpcInfoUniverse();
	}

	public GFindShoolQuestDemonsNpc(long _interfaceid_, int _objschool_, int _levelmin_, int _levelmax_, fire.msp.npc.CreateNpcInfoUniverse _npcinfo_) {
		this.interfaceid = _interfaceid_;
		this.objschool = _objschool_;
		this.levelmin = _levelmin_;
		this.levelmax = _levelmax_;
		this.npcinfo = _npcinfo_;
	}

	public final boolean _validator_() {
		if (!npcinfo._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(interfaceid);
		_os_.marshal(objschool);
		_os_.marshal(levelmin);
		_os_.marshal(levelmax);
		_os_.marshal(npcinfo);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		interfaceid = _os_.unmarshal_long();
		objschool = _os_.unmarshal_int();
		levelmin = _os_.unmarshal_int();
		levelmax = _os_.unmarshal_int();
		npcinfo.unmarshal(_os_);
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GFindShoolQuestDemonsNpc) {
			GFindShoolQuestDemonsNpc _o_ = (GFindShoolQuestDemonsNpc)_o1_;
			if (interfaceid != _o_.interfaceid) return false;
			if (objschool != _o_.objschool) return false;
			if (levelmin != _o_.levelmin) return false;
			if (levelmax != _o_.levelmax) return false;
			if (!npcinfo.equals(_o_.npcinfo)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)interfaceid;
		_h_ += objschool;
		_h_ += levelmin;
		_h_ += levelmax;
		_h_ += npcinfo.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(interfaceid).append(",");
		_sb_.append(objschool).append(",");
		_sb_.append(levelmin).append(",");
		_sb_.append(levelmax).append(",");
		_sb_.append(npcinfo).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

