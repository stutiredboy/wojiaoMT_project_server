
package fire.pb.talk;

import com.locojoy.base.Octets;







import fire.pb.HelpCountManage;
import fire.pb.circletask.CircleTask;
import fire.pb.circletask.anye.RoleAnYeTask;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChatItemTips__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChatItemTips extends __CChatItemTips__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		if (displayinfo == null || displayinfo.roleid < 0)
			return;
		if(displayinfo.displaytype == DisplayInfo.DISPLAY_TASK && 
				displayinfo.shopid == 2){
			//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾粌顤�闂佺顑戠换婵嬪蓟瀹ュ浼犻柛鏇ㄥ墮濞咃綁姊婚崒姘簽闁搞劏娉涢～蹇撁洪鍕�銈嗘礀閹冲酣宕滈幍顔剧＝濞达絿顭堥。鎶芥煕鐎ｃ劌锟芥繂顕ｇ拠娴嬫闁靛繒濮村畵鍡涙⒑闂堟侗鐒鹃柛搴や含缁煤椤忓應鎷虹紓浣割儏鐏忓懘宕濋悢鍏肩厱閻庯綆鍓欓弸娑㈡煛娴ｈ宕岄柟顔煎⒔娴狅箓鎮欓浣烘闂傚倷鑳堕…鍫ヮ敄閸涘瓨鏅濋柕澹懐鐒块悗骞垮劚椤︿即宕愰悜鑺ョ叄闊洦娲橀崵锟界紓浣风筏缁犳挸顫忛搹鐟板闁哄洨鍋涢埛澶婎渻閵堝骸骞栨繛宸弮婵℃挳宕ㄧ�涙ê锟藉鏌ら幁鎺戝姎濞寸媭鍨跺娲箹閻愭彃濮岄梺鍛婃煥閻厧顕ユ繝鍕＜婵☆垶鏅茬花璇差渻閵堝棗濮﹂柛鎾存皑閿熻姤鐔幏锟�
			new mkdb.Procedure(){
				@Override
				protected boolean process(){
					SChatItemTips tips = new SChatItemTips();
					tips.displayinfo = displayinfo;
					boolean ret = CircleTask.getRoleSpecialQuest(displayinfo.roleid, displayinfo.uniqid, displayinfo.counterid, tips);
					if(ret) {
						psendWhileCommit(roleId, tips);
						return true;
					} else {
						psendWhileRollback(roleId, new SChatItemTips(displayinfo, new Octets()));
						return false;
					}
				}
			}.submit();
		} else if(displayinfo.displaytype == DisplayInfo.DISPLAY_TASK && 
				displayinfo.shopid == 3){
			//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾粌顤�闂佺顑戠换婵嬪蓟瀹ュ浼犻柛鏇ㄥ墮濞咃綁姊婚崒姘簽闁搞劏娉涢～蹇撁洪鍕�銈嗘礀閹冲酣宕滈幍顔剧＝濞达絿顭堥。鎶芥煕鐎ｃ劌锟芥繂顕ｇ拠娴嬫闁靛繒濮村畵鍡涙⒑闂堟侗鐒鹃柛搴や含缁煤椤忓應鎷虹紓浣割儏鐏忓懘宕濋悢鍏肩厱閻庯絻鍔岄敓鑺ョ箓椤曪絾绻濆顓熸闂佺粯蓱瑜板啴鎳撻崹顔规斀妞ゆ梻鐡斿▓鏃�淇婇锝囨噰闁诡喖澧介幑鍕瑹椤栨稑鐦滈梻渚�娼уú銈呯暦椤掑嫬纾瑰┑鐘宠壘缁�澶岋拷骞垮劚椤︿即鎮¤箛娑欑厱闁靛绲芥俊鍧楁煙閸愬弶澶勯柕鍥у婵拷闁宠棄妫欓悾鐑芥⒑閻熸澘妲婚柟铏悾鐑筋敃閿曪拷鍞梺闈涚墕濞诧箓寮叉總鍛娾拻闁稿本鑹鹃敓鐣屽厴閹偤鏁冮崒姘辩暫闂佸壊鍋呭ú鏍閸ф鐓曟繝闈涙椤忔挳鏌ｉ弬鎸庮棦闁哄被鍔戦幃銏ゅ礈娴ｈ櫣鍘梻浣告惈閻ジ宕伴弽顓熷仒妞ゆ洩鎷风�规洖缍婇、娆撳矗閵壯咁槱闂備浇顕у锕傦綖婢跺♁娲煛閸涱厾顔嗛梺璺ㄥ櫐閹凤拷?
			new mkdb.Procedure(){
				@Override
				protected boolean process(){
					//濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倿鏌ｉ幘宕囧哺闁哄鐗楃换娑㈠箣閻愰潧鏆￠梺鐟板槻閸㈡煡锝炲┑瀣亗閹兼番鍨昏ぐ搴繆閵堝洤啸闁稿鐩畷顖烆敍濠婂嫬搴婂┑鐘绘涧椤戝懐绮堢�ｎ偁浜滈柟缁㈠灡閸ｄ即鏌￠敓浠嬪传閸曘劍鏂�闂佺粯锕╅崰鏍倶鏉堛劎绠惧璺侯儑濞叉挳鏌熼姘辩劯鐎规洘甯￠幃娆撳级閹存粎閽甸梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�
					//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧潡鏌熺�电啸缂侊拷婵犲洦鐓ラ柣鏃囶嚙琚氶梺闈涙搐鐎氭澘顕ｉ幘顔煎耿婵°倧鎷锋い蹇ｄ邯閺屾稑鈻庤箛鏇狀啋闂佸搫鐭夌紞渚�鐛崶顒夋晢濞达絿鎳撻崜鐢电磽閸屾瑨鍏屽┑顔惧厴瀵偅绻濆顒冩憰闂佹枼鏅涢崯顐ゆ閻愮儤鍊甸柨婵嗙凹缁ㄨ棄霉閻樿櫕灏﹂柟顔挎硾椤繈宕￠悙鎰╁劤缁辨帗娼忛妸锕�闉嶉梺鐟板槻閹虫ê鐣烽悜绛嬫晣婵炴垶鐟鏂库攽閿涘嫬浜奸柛濞у懐涓嶉柟鐑樻尪娴犲牓鏌熼梻鎾闁跨喕妫勯崯瀛樹繆閻戣棄鐓涘ù锝呮惈閿熺晫鍋涢—鍐Χ閸℃鐟愰柣鐘辩劍閻擄繝鐛幇鏉跨妞ゆ棁袙閹锋椽鎮峰鍛暭閻㈩垱甯楃粋宥嗗鐎涙鍘遍梺瑙勫劤椤曨參骞婇崶顒佺厵妞ゆ洖妫涚弧锟介梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�
					int submiterLv = xtable.Properties.selectLevel(roleId);
					if(submiterLv<fire.pb.circletask.PSubmitThings.getGiveHelpLevel()){
						MessageMgr.sendMsgNotify(roleId, 145390, null);
						return false;
					}
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔戒氦闂傚倷绀侀幉锟犳偡閵夆晜鏅濋柕澶嗘櫅妗呴梺鍛婃处閸ㄤ即宕橀敓浠嬫⒑闂堟丹娑氫沪閻愵剦鍟囬梻鍌氬�烽懗鍫曗�﹂崼鐕佹闁归棿鐒﹂弲婵囥亜韫囨挾澧曢柦鍐枛閺岋綁寮崶顭戜哗缂佺偓鍎抽崥瀣┍婵犲浂鏁嶆繝闈涙閹偟绱撴担鍓插剰婵炶濡囬幑銏犫攽閸″繑鐏侀梺鍓茬厛閸犳鎮甸鐣岀閻庢稒顭囬惌銈吤瑰搴濋偗闁绘侗鍣ｅ畷姗�顢樿閳诲矂姊绘担铏广�婇柡鍌欑窔瀹曟粌鈹戠�ｎ亞顔嗛梺鍛婁緱閸ㄩ亶宕伴崱娑欑厱闁哄洢鍔屾禍婊冾熆閻熸澘鏆欓柍瑙勫灴閹晠宕归锝嗙槑闂備胶顭堥鍡欑矙閹达絿浜遍柣搴ｆ閹风兘鏌涢弴銊ヤ簽妞わ富鍘奸埞鎴︽偐缂佹ɑ閿銈嗗灥閹冲孩鏅ラ梺鍝勮閸庢煡鎮￠悢鍏肩厸闁告劑鍔岄敓钘夋憸閺侇噣宕奸弴鐔哄幈濠电偛妫楁蹇涘绩婵犳碍鐓忛柛銉戝喚浼冮悗娈垮枙缁瑦淇婂宀婃闂佸搫妫寸换婵嗩潖閾忓湱鐭欓柛褎顨忛敓鑺ヮ殜閺屻劑寮村Ο鍝勫Б闂佺懓绠嶉崹褰掑煘閹寸媴鎷烽敐搴′簼婵炲懌鍨藉铏规崉閵娿儲鐝㈤梺鐟板殩閹凤拷?
					if(!HelpCountManage.getInstance().canAddHelpGiveItemNum(roleId)){
						//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡寮堕崼姘珔闁搞劍绻冮妵鍕冀椤愵澀绮剁紓渚婃嫹濠㈣泛顑勭换鍡涙煏閸繃鍣洪柛锝囨嚀椤╁ジ宕ㄩ娑欐杸濡炪倖姊归弸缁樼瑹濞戙垺鐓曢煫鍥ㄦ瀭椤忓嫬绁梻浣稿閸嬩線宕曢弻銉﹀亗闁哄洨鍠嗘禍婊堟煙閹佃櫕娅呴柨鐔诲Г濞茬喎顕ｇ粙娆惧悑闁搞儮鏅濋敍婊堟⒑鐟欏嫬绲绘い鎴濇閿熻姤鐔幏锟�
						fire.pb.talk.MessageMgr.sendMsgNotify(roleId, 166088, null);
						return false;
					}
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔芥祰闂傚倷鑳堕…鍫燁殽閸濄儻鎷峰☉鎺撴珚濠碉紕鏁诲畷鐔碱敍濮樿京娼夐梻浣侯焾閺堫剛绮欓幒妤佸仧妞ゅ繐鐗婇埛鎴︽煙閼测晛浠滃┑鈥炽偢閺屾洟宕奸悢绋匡拷鎰殽閻愭彃鏆㈤柕鍥ㄥ姍楠炴帡骞嬮悩璇ф嫹閻愬樊娓婚柕鍫濇缁楀倿鏌ｉ幒鐐电暤鐎殿喗濞婇幃鈺冪磼濡攱瀚兼繝鐢靛仩鐏忣亪顢欐繝鍕С闁稿繗鍋愮弧锟介梺闈涚箚濡插嫰鎳撻崸妤佺厱闁崇懓鐏濋悘顏堟煙椤栨稒顥堝┑鈩冩倐婵＄柉顦插┑顔肩埣濮婄粯鎷呴崨濠傛殘闂佸憡鏌ㄧ换妯侯嚕閹绘帩鐓ラ柛顐亝閺呪晠鎮楅獮鍨姎妞わ缚鍗抽崺娑㈠箣閿旂晫鍘卞┑鐘绘涧濡顢旈埡鍌樹簻闊洦姊圭亸锕傛煛鐏炲墽娲村┑鈩冩倐婵″爼宕ㄩ鐘仏濠德板�楁慨鐑藉磻濞戞娑樷枎閹惧磭顔嗛梺鍛婄♁濞兼瑧绮堥崼銉︾厵缂備焦锚缁楁碍绻涢崨顓ㄨ含婵﹦绮幏鍛村川婵犲倹娈橀梻浣藉吹閸犲棝宕曟担鍐╊棨婵＄偑鍊栭悧妤冪矙閹烘鐭楅煫鍥ㄧ♁閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹
			    	xbean.helpcount taskrolehelpcount = xtable.Helpcount.select(displayinfo.roleid);
			    	int maxtaskrolehelpcount=HelpCountManage.getInstance().getHelpItemNumMax(displayinfo.roleid);
			    	if(taskrolehelpcount!=null&&taskrolehelpcount.getHelpitemnum()>=maxtaskrolehelpcount){
			    		MessageMgr.sendMsgNotify(roleId, 166093, null);
			    		return false;
			    	}
					
					SChatItemTips tips = new SChatItemTips();
					tips.displayinfo = displayinfo;
					//tips:displayinfo闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径鎰�堕柣鎰版涧娴滅偓绻涢崨顖氣枅闁哄备鍓濆鍕節閸屾粈杩榤id闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕缂傚秴锕獮鍐╃鐎ｎ亜绐涙繝鐢靛Т閸婄兘鎯�椤忓牊鈷掑ù锝堟閵嗗﹪鏌涢幘瀵哥畼缂侇喗鐟╅獮瀣晝閿熶粙宕欓悩缁樼叆闁绘洖鍊圭�氾拷?
					boolean ret = RoleAnYeTask.getRoleAnYeTask(roleId, displayinfo.roleid, displayinfo.uniqid, displayinfo.teamid, tips);
					if(ret) {
						psendWhileCommit(roleId, tips);
						return true;
					} else {
						psendWhileRollback(roleId, new SChatItemTips(displayinfo, new Octets()));
						return false;
					}
				}
			}.submit();
		} else {
			new mkdb.Procedure(){
				@Override
				protected boolean process(){
					SChatItemTips tips = new SChatItemTips();
					tips.tips = ChatChannel.getInstance().getOctets(roleId, displayinfo);
					if (tips.tips == null)
						return false;
					tips.displayinfo = displayinfo;
					psendWhileCommit(roleId, tips);
					//gnet.link.Onlines.getInstance().send(roleId, tips);
					return true;
				}
			}.submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 792445;

	public int getType() {
		return 792445;
	}

	public fire.pb.talk.DisplayInfo displayinfo;

	public CChatItemTips() {
		displayinfo = new fire.pb.talk.DisplayInfo();
	}

	public CChatItemTips(fire.pb.talk.DisplayInfo _displayinfo_) {
		this.displayinfo = _displayinfo_;
	}

	public final boolean _validator_() {
		if (!displayinfo._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(displayinfo);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		displayinfo.unmarshal(_os_);
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChatItemTips) {
			CChatItemTips _o_ = (CChatItemTips)_o1_;
			if (!displayinfo.equals(_o_.displayinfo)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += displayinfo.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(displayinfo).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CChatItemTips _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = displayinfo.compareTo(_o_.displayinfo);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

