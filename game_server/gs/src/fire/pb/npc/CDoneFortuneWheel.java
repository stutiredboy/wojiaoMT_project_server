
package fire.pb.npc;


import fire.pb.circletask.CircleTaskManager;
import fire.pb.fanpai.PPlayCardItemProc;
import fire.pb.map.Npc;
import fire.pb.map.SceneNpcManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CDoneFortuneWheel__ extends mkio.Protocol { }

/** 玩家完成转盘,发给玩家奖励
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CDoneFortuneWheel extends __CDoneFortuneWheel__ {
	@Override
	protected void process() {
		final long	roleid = gnet.link.Onlines.getInstance().findRoleid(this);
        if(roleid<0) return;
        //闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倝绠栭弻宥夊传閸曨剙娅ｇ紓浣瑰姈椤ㄥ﹪寮婚垾鎰佸悑闁告劑鍔岄‖澶娾攽閻愬弶鍣藉┑鐑囨嫹闂佸搫鐭夌徊鍊熺亽濠电偛妫欓崕鍐测枔椤撱垺鈷戦柛娑橈功閹冲啴鏌ㄩ弴妯哄姦濠碉紕鏁诲畷鐔碱敍濮橆剙鏁ら梻渚�娼ц噹闁告侗鍨扮敮鎺楁⒒閸屾瑧顦﹂柟纰卞亜铻炴繛鎴炵懄閸欏繘鏌熺紒銏犳灀闁跨喐鏋荤粻鎾崇暦缁嬭鏃堟晸娴犲鐓侀柛銉墯閻撴洟鏌嶉埡浣告灓婵炲牊娲橀妵鍕Ψ瑜嶆禒褏绱掓潏銊ョ瑲缂佹鍠栧畷鎯邦槼闁绘繃绻堝娲传閸曨厾鍔圭紓鍌氱С缁舵艾鐣峰ú顏呮櫢闁绘灏欓敍娑㈡⒑閸撹尙鍘涢柛瀣閹﹢鏌嗗鍡欏幈闂佺粯娲戠粈渚�鎮橀敂鑺ュ弿濠电姴鎳忛鐘电磼椤旇姤顥堢�规洖宕灃闁跨喍绮欓、鏃傦拷娑欘焽缁犻箖鏌涢銈呮瀾缂侊拷閸愵亞纾肩紓浣诡焽濞叉挳鏌熼搹顐ゅ⒌闁糕晪绻濆畷鎺戔槈濞嗘垶顫栭梻鍌氬�烽懗鍫曞箠閹捐搴婇柤纰卞墰缁�濠傗攽閻樺弶鎼愮紒鐘崇墵閺屾洝绠涚�ｎ亷鎷烽弽顓炲惞闁圭儤顨嗛悡蹇涙煕椤愶絿绠栭柟鍏煎姈椤ㄣ儵鎮滈崶銊ヮ伓闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁躲倝鏌ら幁鎺戝姢闁绘繆娉涢埞鎴︽偐閹绘帪鎷烽悽绋垮嚑闁哄喛鎷烽柕鍥у瀵粙顢曢～顓熷媰闂備胶绮幐璇裁洪悢鐓庤摕闁跨喓濮寸壕鍏兼叏濡搫缍侀柧蹇撴捣缁辨捇宕掑姣欙紕绱掗敓鑺ユ媴閽樺鍊掗梻鍌欑劍閹爼宕曞鍐惧悑闁割偅绻冮崕鎾斥攽鎺抽崐妤佹叏閻戣棄纾绘俊顖氬悑椤愯姤鎱ㄥΟ璺ㄥ牚闁跨喐鍨濈粈渚�鍩ユ径濠庢建闁糕剝鐟ュ鎶芥⒒娴ｅ憡鍟炵紒瀣笒椤灝顫滈敓浠嬪箖閿熺姴绠ｉ柨鏃囆掗幏娲煟閻樺弶澶勯柣鎿勭節椤㈡挸螖閸愵亞锛滈梺缁橆焾鐏忔瑦鏅ラ柣搴ゎ潐濞叉粓骞婇幘璺哄疾婵＄偑鍊曠换鎰拷姘煎幖鍗辨い鎺炴嫹闁宠鍨块幃娆撳级閹寸姳妗撴繝娈垮枟鑿ч柛鏃�鍨甸悾鐑芥晸閻樿櫕娅㈤梺璺ㄥ櫐閹凤拷?,闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯悹楦裤��閺嬪秹鏌曡箛瀣拷鏇犵不椤栫偞鐓ラ柣鏇炲�圭�氾拷?濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏焺閺佸銇勯幘璺烘瀾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴犵棯閹勫仴闁哄瞼鍠栭獮鍡涙偋閸偅顥夐梻浣告惈椤戝嫰鎮為敃鍌毼﹂柛鏇ㄥ灡閺呮粓鏌﹀Ο渚Ш妞わ富娲婇梻鍌氬�搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇氱秴闁搞儺鍓﹂弫鍥煏韫囨洖啸闁挎稓鍠栧缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閹达箑围濠㈣泛顑囬崢顏呯節閻㈤潧浠ч柛瀣尭閳诲秹宕ㄩ婊咃紳婵炶揪绲藉璺衡枍閸モ晝纾奸弶鍫涘妼缁椦囨煙閻熸澘顏柟顔界矊铻ｉ柤娴嬫櫇瀹曠,key闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕妞ゎ偄顦遍敓鐣屾暩閸樠嗗絹濡炪倖甯掗敃銉э拷姘秺閺屾盯骞囬埡浣肝ㄥ┑鈩冨絻閻楁捇寮婚弴锛勭杸闁哄洨鍊妷锔轰簻闁挎棁顕у▍宥夋煛鐏炵澧茬�垫澘瀚换婵嬪礋椤愵偅娈奸梻鍌欑閹碱偊骞婅箛鏇炲灊闁规崘顕х粻鏍煟閹伴潧澧紓宥呮喘閺屽秹宕崟顐ｆ闂佹寧绋掔划宀勨�旈崘顔嘉ч柛鈩冾殔椤洭姊虹粙鍨劉婵＄偠妫勯悾鐑芥濞戞帗鐎婚梺瑙勫劤椤曨參宕㈡禒瀣厵闁稿繐鍚嬮崕妤呮煕閵娿劋鍚柨鐔诲Г閻旑剟骞忛敓锟�(闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽顐粶濡楀懎鈹戦悙鏉戠仧闁搞劌缍婇幃鍧楁倷椤掑倻顔曢梺鐟扮摠閻熴儵鎮橀埡鍐＜闁绘灏欑粔娲煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�,缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗘搐閸斿锟借娲栧鍫曞箞閵娿儙鏃傦拷锝庡亜椤忓爼姊绘担绛嬪殐闁哥姵顨呴…鍨潨閿熶粙宕洪姀鈩冨劅闁靛鍎抽鎺楁倵鐟欏嫭绀�婵炴潙鍊垮畷銉╁川鐎涙ǚ鎷绘繛杈剧到閹诧繝骞嗛崼銏㈢＜閻庯絺鏅濈粣鏃傦拷瑙勬磸閸ㄤ粙骞冮崜褌娌柤娴嬫櫅婢ч箖姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷),value
        //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔筋焽閸樠囧几濞戙垺鎳氶柣鎰暩濡垱銇勯幘璺轰沪缂傚秵鎮哾.濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿顦甸弻鏇＄疀鐎ｎ亷鎷烽弴銏㈠祦闁靛繆锟借尙绠氬銈嗙墬缁娀宕曢悩缁樼厱閻庯綆鍋嗘晶鍨叏婵犲嫮甯涢柟宄版嚇瀹曨偊宕熼鈶挎洟姊绘担鍛婃儓闁瑰啿绻掗崚鎺楀箻鐠囪尙浼嬮梺鎸庢礀閸婃悂鎮欐繝鍕枑濠㈣埖鍔曢崙鐘绘煛閸愩劎澧涢柣鎾寸懇閹鎮藉▓璺ㄥ姼婵炲濮嶉崶銊㈡嫽闂佸憡娲﹂崑鍕敂椤撱垺鐓涢悘鐐烘交閹峰嘲鐣烽崶銊︻啌婵＄偑鍊栧濠氬储瑜斿顐︻敂閸喓鍘撻梺闈涱槶閸庢娊宕㈤弮鍫濈婵烇綆鍓欐俊濂告煟閹邦剨韬柡灞诲妼閳规垿宕卞Ο鐑橆仩闂備礁鍟块崲鏌ニ囬幍顔藉床婵炴垶鐔幏鐑芥偨濞堣法鍔搁柣銏╁灠閻栧ジ寮婚悢鍏兼優妞ゆ劧鎷锋い蹇撶墱閺佸鏌ㄥ┑鍡╂Ч闁哄懏鎮傞弻銊╂偆閸屾稑顏�?濠电姷鏁告慨鐑藉极閸涘﹦绠鹃柨鐔诲Г缁绘稒鎷呴崘鍙夋悙缁炬儳缍婇弻锕�螣閻氬绀嗗┑鐐村灟閸ㄥ湱绮堢�ｎ偁浜滈柟鐑樺灥娴滅偞绻涢弶鎴濐仼闁宠鍨块幃娆撳级閹寸姳鎴烽梻浣规偠閸斿苯锕㈡潏鈺佸灊濠电姵纰嶉弲鎻掝熆鐠轰警鍎戦柛妯兼暬濮婄粯绗熼崶褍浼庣紓鍌氬�瑰銊╂嚍闁秵鍤嶉柕澶涚导缁ㄥ妫呴銏″缂佸鍔欓獮澶嬨偅閸愨晝鍘搁柣蹇曞仱濞煎骞忛悜钘夌疀濞达絽鎲￠崐顖氣攽閻橆喖鐏遍柛鈺傜墳閹筋偄顪冮妶鍐ㄥ姕闁绘娲熼崺鐐哄箣閿旇棄锟界兘鏌ょ喊鍗炲闁冲嘲锕娲偡閺夋寧顔�闂佺懓鍤栭幏锟�,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鐓熼煫鍥ㄦ礀娴狅箓鏌涙惔銏犫枙鐎规洏鍨介幃鐑芥焽閿旇棄鐦滈梻渚�娼ч悧鍡椢涘▎鎾嶅宕卞☉娆戝幈闁诲函缍嗛崑鍕叏瀹ュ浄鎷峰▓鍨灈闁绘牕銈搁獮鎰節閸愩劎绐為梺绯曞墲閿曗晛顭囬弮鍫熲拻濞达絿鐡斿鎰版煕鎼达紕锛嶅瑙勬礋椤㈡﹢鎮欓崹顐ゆ缂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇嫹妞ゎ偄绻楅妵鎰板箳閹寸媭鍞堕梻浣告啞閸旀洖螣婵犲洤鍚归柡鍥ュ灪閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹?,闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囨繝寰锋澘锟芥洟骞婅箛娑樼；闁跨喓濮甸悡銉╂煛閸モ晛浠滈柨鐔诲Г閹倿寮婚妸鈺佄ч柛娑变簼閺傦拷闂備胶绮敋鐎殿喖鐖奸獮鏍箛椤斿墽锛滈梺璺ㄥ枙婵倕顕ラ崟顖氱疀妞ゆ挾濮撮獮妤佺節绾版ɑ顫婇柛銊ゅ嵆婵￠潧顫滈敓钘夌暦閵夆晩鏁冮柨婵嗗暕缁ㄥ妫呴銏″闁瑰憡鎮傞幊婊嗐亹閹烘挾鍘撻梺鑺ッˇ钘壩熼敓钘壩旈悩闈涗沪闁荤啿鏅涢悾宄拔熷▎鐐梻浣告啞閸ㄧ數绱炴繝鍌ゆ綎婵炲樊浜滄导鐘绘煕閺囥劌鏋涙い蹇ｅ弮濮婃椽骞愭惔銏狀槱婵炲瓨绮犳禍顏堟偘椤曪拷瀹曞崬鈽夊Ο纰辨О婵＄偑鍊栧Λ渚�宕戦幇鍏洭顢曢妶鍥╋紳婵炶揪缍�婵倗娑垫ィ鍐╃厸闁割偆鍠愮亸濯渃al闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇氱秴闁搞儺鍓﹂弫鍥煏韫囨洖啸闁挎稓鍠栧缁樼瑹閸パ冾潻闂佸憡顨嗗ú鐔风暦閸洦鏁嗛柨鐔剁矙閹�斥槈閵忥紕鍘卞┑鐐村灥瀹曨剟寮稿☉妯忓綊鎮崨顔碱伓?,PFinishFortuneWheel
        //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢绘俊鐐�栭悧婊堝磻濞戙垹鍨傞柛灞剧◤娴滄粓鏌″鍐ㄥ闁靛棙甯楅妵鍕煛閸屾粌寮ㄩ梺鍝勭灱閸犳牠骞冨鍐炬建闁糕剝顭囬弳锕傛⒒娴ｈ櫣甯涢柟鍛婃倐瀹曟劖绻濆顓熸闂佽姤锚椤﹂亶鎮鹃銏＄厱閹肩补锟藉疇鍩為柣鎾卞�濋弻銊╁即閻愯鎷风粙鍟冄囧蓟閵夛妇鍙嗛梺缁樻礀閸婂湱锟芥熬鎷�
//        java.util.Map<Integer, Integer> fortuneWheelMsgs=new java.util.HashMap<Integer, Integer>();
//        fortuneWheelMsgs.put(2, fire.pb.specialquest.SpecialQuestNpcMsg.SubmitQHYCSuccess);
        
        if(flag == 0){
        	fire.pb.PropRole prole = new fire.pb.PropRole(roleid, true);
        	Npc npc = SceneNpcManager.selectNpcByKey(npckey);
        	int masterid = CircleTaskManager.getInstance().getMasterMap().get(prole.getSchool()).masterid;
        	if (npc != null && npc.getNpcID() == masterid){
        	}
        	new PFinishFortuneWheel(roleid,npckey,taskid,succ).submit();
        }else{
			new PPlayCardItemProc(roleid).submit();
		}
      
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795457;

	public int getType() {
		return 795457;
	}

	public long npckey; // npckey为npc的唯一ID
	public int taskid; // 当前转盘的任务id
	public int succ; // 1表示正常完成,0表示玩家提前关闭了大转盘
	public byte flag; // 0 大转盘  1翻盘子

	public CDoneFortuneWheel() {
	}

	public CDoneFortuneWheel(long _npckey_, int _taskid_, int _succ_, byte _flag_) {
		this.npckey = _npckey_;
		this.taskid = _taskid_;
		this.succ = _succ_;
		this.flag = _flag_;
	}

	public final boolean _validator_() {
		if (npckey < 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		_os_.marshal(taskid);
		_os_.marshal(succ);
		_os_.marshal(flag);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		taskid = _os_.unmarshal_int();
		succ = _os_.unmarshal_int();
		flag = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CDoneFortuneWheel) {
			CDoneFortuneWheel _o_ = (CDoneFortuneWheel)_o1_;
			if (npckey != _o_.npckey) return false;
			if (taskid != _o_.taskid) return false;
			if (succ != _o_.succ) return false;
			if (flag != _o_.flag) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		_h_ += taskid;
		_h_ += succ;
		_h_ += (int)flag;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(taskid).append(",");
		_sb_.append(succ).append(",");
		_sb_.append(flag).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CDoneFortuneWheel _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		_c_ = taskid - _o_.taskid;
		if (0 != _c_) return _c_;
		_c_ = succ - _o_.succ;
		if (0 != _c_) return _c_;
		_c_ = flag - _o_.flag;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

