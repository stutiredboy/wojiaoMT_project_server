
package fire.pb.school;

import fire.pb.school.shouxi.ProfessionLeaderManager;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSendElectorWords__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垹顭峰缁樻媴閻熼偊鍤嬪┑鐐插级閻楃姴鐣烽幇鏉跨濞达絿顭堥悗顓㈡⒑缁嬭法鐏遍柛瀣仱閹繝濡烽埡鍌滃幗闂佸搫娲ㄩ崑娑㈡晸閽樺璐￠柨鐔诲Г閻旑剟骞忛敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫ょ紓渚婃嫹濠电姴娲﹂悡銉╂煟閺冨浂鍤欑悮姘辩磽娴ｈ櫣甯涢柣鈺婂灠閻ｇ兘顢旈崼婵堫槰濡炪倕绻愰弻濠傤潩閼哥鎷洪梻鍌氱墛缁嬫帗寰勯崟顖涚厱闁哄喛鎷烽柣妤佺矌閸掓帞锟斤綆鍠栫粻鎶芥煛閸愨晜灏伴悗姘秺閺屻劌鈹戦崱娑憋拷妤�霉濠婂嫬濮嶉柡宀�鍠庨悾锟犳偋閸喎鍓垫俊鐐�ゆ禍婊堝疮鐎涙ü绻嗛柛顐ｆ礀楠炪垺淇婇妶蹇斿濡炪値鍋勫ú顓烆潖閾忕懓瀵查柡鍥╁枑閻濇棃鏌ｆ惔銏犲毈闁告挻鐟ラ悾鐢稿礋椤栨稈鎷洪梺鍛婄☉閿曪箓鍩ユ径瀣ㄤ簻妞ゆ挾鍋熸晶娑氱磼閸屾氨孝妞ゎ厹鍔戝畷濂告偄閸濆嫬绠ラ梻鍌欒兌椤㈠﹪锝炴径鎰闁挎洩鎷锋い顓炴喘楠炲洭顢樺锟界花濠氭椤愩垺澶勬繛鍙夌墵閸┿垽宕奸妷锔惧幐閻庣櫢鎷烽柨鐔剁矙瀹曚即骞樼捄鍝勭亰闂佹眹鍨归悘姘跺窗閸℃稒鐓曢柡鍥ュ妼娴滆棄霉绾攱瀚�? by changhao
 *
 */
public class CSendElectorWords extends __CSendElectorWords__ {
	@Override
	protected void process()
	{
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		fire.pb.PropRole propRole=new fire.pb.PropRole(roleid,true);
		final int school=propRole.getSchool();
		xbean.ProfessionLeaderVoteInfo voteInfo=xtable.Professionleadervotechallenge.select(roleid);
		
		boolean b = false;
		
		if (voteInfo != null)
		{
			b = ProfessionLeaderManager.getInstance().isInChallengePeriod(voteInfo.getChallengetime());
		}
		
		xbean.ProfessionLeaderInfo shouxiInfo=xtable.Professionleader.select(school);
		if(shouxiInfo != null && shouxiInfo.getRoleid() == roleid)
		{
			b = true;
		}		
		
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繝闈涙川缁★拷闂佺鏈笟妤�螞閿熺姵鈷戦柣鐔告緲閺嗛亶鏌ｉ鐐诧拷鎼侊綖韫囨洜纾兼俊顖濐嚙椤庢捇姊洪棃鈺佺槣闁告ü绮欓幊锝夊炊椤掍讲鎷虹紓浣割儏濞硷繝宕ｉ崟顐�鐟邦煥閸愵亜鐓熼梺缁樹緱閸犳鎹㈠┑瀣＜闁靛牆妫楃紓鎾绘⒒娴ｈ姤纭堕柛鐘茬Ф閸掓帒鈻庨幘宕囩暫婵炴潙鍚嬮幆宀勫极鐎ｎ喗鐓ラ柣鏂垮閻瑩鏌ｅ☉鍗炴珝鐎规洖鐖奸、妤呮晸閻ｅ瞼妫憸鏃堝箖鐟欏嫮鐟规い鏍ㄧ矊鐢儵姊洪崨濠呭闁硅櫕锚椤繒绱掑Ο璇差�撻梺鎯х箳閹虫挾绮敓鐘斥拺闁告稑锕ラ埛鎰亜椤撶偞澶勭紒鍌氱Ф缁瑦鎯旈幘瀵革拷濠氭⒑瑜版帒浜伴柛锝庡枛闇夐柛鏇ㄥ亐閺�浠嬫煟濡鍤嬬�规悶鍎甸弻锝呂旈敓浠嬫晝椤忓牆鏄ユ繛鎴欏灩缁狅綁鏌ㄩ弮鍌涙珪闁告ü绮欏铏圭磼濡儵鎷诲銈庡幖閻楁捁妫㈤柣搴秵閸犳鎮″▎鎾寸厽闁挎繂鎳撶�氫即鏌嶇拠鑼ⅵ闁哄矉绱曟禒锕傚礈瑜庨崚娑㈡倵濞堝灝娅橀柛锝忕秮瀵偊骞樼紒妯虹檮婵犮垼顫夌换鍌炲箹椤愶讣缍栨繝濠傜墛閺呯霉閻樺樊鍎戠�规挷绶氶弻娑㈩敃閻樻彃濮庨柟顖滃枛濮婃椽宕橀崣澶嬪創闂佺锕﹂幊鎾诲煝瀹ュ顫呴柕鍫濇閹锋椽鏌ｉ悩鍏呰埅闁告柨鑻埢宥夊箛閻楀牏鍘甸梺鍛婂灟閸婃牜锟芥熬鎷�  by changhao
		if(b == false)
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 170009, null);	
			return ;
		}
		
		//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔曢顓犲姬閿熶粙姊哄Ч鍥х伈婵炰匠鍐懃婵犲痉鏉匡拷妤佹叏閻㈢绠栭柛灞惧嚬閸ゆ洟鏌＄仦璇插姕闁稿鍔楃槐鎾存媴妤犮劍宀搁獮蹇撁洪鍛嫼闂傚倸鐗冮弲娑㈡儊濠婂牊鐓曟俊顖氭惈閳锋棃鏌℃笟鍥ф灈闁宠棄顦垫慨锟介柍銉ュ帠缂傛挻淇婇悙顏勶拷鏍偋濡ゅ啰鐭欓柟瀵稿Х缁犳棃鏌熼悜姗嗘畷闁硅櫕宀搁弻锝夊箛椤掑倹鎲奸梺鍛婄懃缁绘垶绌辨繝鍥ч柛婊�绀侀崜閬嶆煟鎼淬垼澹樼紓宥咃工椤繐煤椤忓嫪绱堕梺鍛婃处閸撴岸骞忛柆宥嗏拺闁绘垟鏅滃▍鎾绘煕閵娿倕宓嗘い銏″哺閺佹劖寰勫Ο缁樻珨闂備浇娉曢崰鏇炍涢崟顖涘仼闁绘垼妫勭粻鎶芥煙鐎圭姴鐓愰悽顖滃仱楠炲螖閸涱厙褔鏌涘☉鍗炲箹鐞氭繈姊婚崒娆戭槮闁圭⒈鍋婇幆灞惧緞鐏炵晫绛忔繛瀵稿Т椤戝懘鎮″锟介弻鐔告綇閸撗呮殸闂備礁宕ú顓㈠蓟閿濆妫橀柟绋块閺嗗牓姊烘导娆撴闁圭懓娲ら～蹇曠磼濡顎撻梺鍛婄☉閿曘儵宕曢幘缁樷拺闁稿繐鍚嬮妵鐔兼煕閵娿儳鍩ｉ柣娑卞枟缁绘繈宕ㄩ婊勬緫闂備胶鎳撻悘婵嬪疮椤愨懇鏋旀い鎰堕檮閳锋垿鏌涘☉姗堟敾濠㈣泛瀚伴弻娑㈠Ω閿曪拷椤ュ绱掗娆惧殭闁宠棄顦埢搴☆吋閸曨厾娉块梻鍌欒兌椤㈠﹪骞撻鍡楃筏闁告挆鍕幑闂佸壊鍋呭ú姗�鎮￠弴銏＄厵閻庣數顭堟牎闂佹悶鍊ч幏鐑芥⒒娴ｅ摜鏋冩い顐㈩樀瀹曞綊宕稿Δ锟界粻鏍ㄧ箾閸℃ɑ灏紒鐙欏洦鐓欓悗鐢殿焾灏忓┑鈩冾殕閹瑰洤顫忕紒妯诲闁告稑锕ラ崕鎾绘煟閻愭潙鍤柛瀣工閻ｅ嘲鈹戠�ｎ亞顓洪梺鎸庢穿閹烽绱掗悩宕囧⒈闁瑰弶鎮傚顒傛崉閵婏附顔曢梻渚�娼ц墝闁哄懏绋撻惀顏囶樄闁哄瞼鍠撻敓鐣屾暩椤牆鏆╅梻浣告惈椤︻喚鍒掑▎蹇ｆ綎缂備焦顭囬悷褰掓煥閻旂粯顥夋い顓炴穿椤﹁泛顭胯缁诲牆顫忓ú顏勪紶闁告洦鍓欏▍銈囩磽娴ｅ壊鍎愰柟鍛婂劤鍗遍柟鐗堟緲缁犺櫕淇婇妶蹇斿闂佺粯鎸婚惄顖炲蓟濞戞ǚ妲堥柛妤冨仦閻忔捇姊洪崨濠忚�垮ù婊嗘硾椤繐煤椤忓嫮顔囬柟鍏肩暘閸╁嫬顫忛崹顕呮富闁靛牆妫欓懖鐘绘煕閵夈垺娅呯紒渚婄畱閳规垿鍩ラ崱妤冧哗闂佸憡鑹鹃澶婄暦娴兼潙绠涙い鎴旀櫆缁嬫帡鏁嶉幇顓熷闁芥ê顦敮顖炴⒒娴ｈ銇熼柛妯圭矙閹兘鏁冮崒姘辩杽闂侀潧顭俊鍥╁姬閿熶粙姊洪崨濠傚闁哄倸鍊圭粋鎺楀閻欙拷濞撳鏌曢崼婵嗘殭闁诲浚浜濈换娑㈡嚑椤掞拷閺嬫垿鏌熸笟鍨闁轰焦鎸荤粋鎺旓拷锝庡亞閸樻捇姊洪崨濠勭畵閻庢凹鍓熼弫鎾绘嚍閵夈儱顫掑銈冨灪濡啫鐣锋總鍛婂亜闁告瑥顦瑙勭節閻㈤潧浠︽繛鍏肩懇瀹曘儳锟斤綆鍠楅崑锟犳煏婵炵偓娅撻柡浣告处缁绘稑顔忛鑽ゅ嚬闂佺粯鎸婚悷鈺呭蓟濞戙垹绠ｆ繛鍡楅獜閹风兘寮介顒佸婵鍋撶�氾拷 by changhao
		boolean modify = false;
        xbean.ProfessionLeaderTicketInfo candInfo=fire.pb.school.shouxi.ProfessionLeaderManager.getInstance().getCandInfoFromRoleid(roleid, school);
        if(candInfo!=null)
        {
        	modify = true;
        }
        
        if (modify == false)
        {
    		if (!ProfessionLeaderManager.getInstance().isInChallengePeriod(System.currentTimeMillis()))
    		{//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紭闂佽法鍠愰崹婵嬫倿閿旂偓宕叉繝闈涱儏閻愬﹦鎲告惔鈭ワ綁顢楅崟顑芥嫼闂佸憡绻傜�氼噣鍩㈡径鎰厽闊洦鏌ㄦ慨宥囷拷瑙勬处閸嬪﹤鐣烽悢鍏煎仺闂傚牊绋戝Ч鏌ユ⒒閸屾瑧顦﹀鐟帮躬瀹曟垿宕ㄩ弶鎴犵暰婵犵數濮撮幏瀣熼崟顖涒拺闁告繂瀚﹢鐗堢箾閸欏鐒介柟骞垮灩閳藉顭ㄦ惔鈶库晠姊虹拠鎻掝劉闁告垵缍婂畷婊冣槈濞嗘垹褰鹃梺鍝勬储閸╁嫰寮澶嬬厽闁归偊鍠涜棢闂佸湱鏌夊▍锝囨閹捐纾兼繛鍡樺灥婵′粙鏌﹂崘顓㈠摵闁靛洤瀚版俊鐑藉Ψ閿旂粯锛佺紓鍌欒兌缁垶鎯勯姘辨殾妞ゅ繐鐗嗙粈鍐┿亜韫囨挻鐓�婵鍩栭埛鎴︽⒒閸喓鈾佸璺哄閺屾盯寮敓浠嬫偋濠婂懎鍨濋悗锝庡枛缁犳娊鏌￠崘鈺傚鞍閻庢艾缍婇弻銊モ攽閸℃侗锟芥霉濠婂嫬濮嶉柡宀�鍠庨悾锟犳偋閸喎鍓垫俊鐐�ゆ禍婊堝疮鐎涙ü绻嗛柛顐ｆ礀楠炪垺淇婇妶蹇斿濡炪値鍋勫ú顓烆潖閾忕懓瀵查柡鍥╁枑閻濇棃鏌ｆ惔銏犲毈闁告挻鐟ラ悾鐢稿礋椤栨稓鍘介梺缁樻煥閹芥粓骞婇崘顔藉�垫慨姗�妫跨花浠嬫煙楠炲灝鐏茬�规洖宕埥澶娾枎閹存繂绠洪梻鍌欑缂嶅﹪宕戞繝鍥у偍闁兼祴鏅涚欢銈呪攽閻樺磭顣查柣鎾卞劦閺岋綁寮崒婊冪濡炪們鍎遍ˇ鎵崲濠靛鏅搁柤鎭掑劜缂嶅洭鏌嶆潪鎵槮闁诲繐锕ら埞鎴︽倷閸欏妫￠梺鍦焾椤嘲顕ｉ弻銉ョ濞达絽婀遍崣鍡涙⒑缂佹ɑ绀�闁稿﹤婀遍敓鑺ョ啲閹凤拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫孝缂傚秴锕璇差吋婢跺﹣绱堕梺鍛婃处閸嬫捇骞忛柨瀣瘈婵ǜ鍎婚幏鐑藉川閺夋垹鐓戞繝銏ｆ硾閻ジ鎯侀崼銉︹拻闁稿本姘ㄦ晶娑氱磼鐎ｎ偄娴柡浣哥Т椤撳ジ宕卞▎鎴晭闂備礁婀遍崑鎾诲礈濮樿埖鍋傚┑鍌氭啞閻撴盯鎮橀悙鎻掆挃闁宠棄顦甸弻锝夋晲閸℃瑧鐤勯梺杞扮劍閹歌崵绮嬮幒鏃撴嫹閿濆簼绨介柨娑欑洴濮婅櫣绱掑Ο鍝勵潓闂佸湱鈷堥崑濠囧箖閿熺姴鍗抽柕蹇ョ磿閸樼敻姊虹紒妯虹仸闁挎洍鏅涢埢鎾诲即閵忥紕鍘辨繝鐢靛Т閸婄粯绂掑☉姘辩＜缂備焦顭囧ú瀛橆殽閻愬樊鍎旈柟顔界懇瀹曞綊顢曢姀锛勬殲濠电姷鏁搁崑鐐哄箰閼姐倕鏋堢�广儱顦伴崕搴€亜閺嶎偄浠滈柦鍐枑缁绘盯骞嬪▎蹇曚痪闂佺锕ら…鐑藉蓟濞戙垹唯闁挎繂鎳庨‖鍫濐渻閵堝懘鐛滈柟鍑ゆ嫹
    			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 141983, null);
    			return;
    		}        	
        }
        
        if (electorwords.length()>25)
        {
			return;
		}
        
		new fire.pb.school.shouxi.PSendElectorWords(roleid,electorwords, modify).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810435;

	public int getType() {
		return 810435;
	}

	public java.lang.String electorwords;

	public CSendElectorWords() {
		electorwords = "";
	}

	public CSendElectorWords(java.lang.String _electorwords_) {
		this.electorwords = _electorwords_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(electorwords, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		electorwords = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSendElectorWords) {
			CSendElectorWords _o_ = (CSendElectorWords)_o1_;
			if (!electorwords.equals(_o_.electorwords)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += electorwords.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(electorwords.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

