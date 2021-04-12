
package fire.pb.battle.livedie;

import gnet.link.Onlines;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveDieBattleGiveRose__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CLiveDieBattleGiveRose extends __CLiveDieBattleGiveRose__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid <= 0)
			return;
		
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬪銈冨灪閻熲晠骞冮埄鍐╁劅妞ゆ棁濮ょ粊浼存⒒閸屾艾锟界兘鎳楅崼鏇楋拷锕傚醇閵夛附娅囧銈呯箰閻撶粯寰勯幇顒傤啋缂傚倷鐒﹂敋闁告搫绠戦—鍐Χ閸涱垳顔囬梺缁橆殕缁挸顕ｉ锕�鐐婃い鎺嶈兌閸樹粙姊鸿ぐ鎺戜喊闁告鏅槐鐐哄箣閻愮數顔曢梺鍛婄☉濞层倝宕板顑撅拷鎺撶節濮橆厾鍘梺鍓插亝缁诲倿鏁撻悾灞惧殌闁宠绉瑰畷鍫曨敆娴ｅ搫骞愬┑鐐舵彧缁茶姤绔熸繝鍥ㄥ亗闁兼祴鏅幏宄扳枔閸喗鐏堝銈庡幘閸忔ê顕ｉ锕�绠涙い鎾跺仧缁愮偞绻濋悽闈涗汗闁瑰啿娲鏌ユ偐鐠囪尪鎽曢梺鍝勬川閸犲海娆㈤悙鐑樼厱妞ゆ劧绲跨粻鎾斥攽椤斿灝鐓愮紒缁樼〒閿熺晫鏁搁…鍫ョ�烽梻浣侯焾椤戝棝宕濆Δ锟藉嵄闁圭増婢樼粻濠氭偣閸ヮ亜鐨洪柨娑欑矊閳规垿顢欑紓瀛樺灴閹線鎮滈挊澶樻綂闂侀潧绻堥崹濠氭晬濠婂嫮绡�闁靛骏绲剧涵楣冩煛閸偄澧寸�规洜鏁婚弫鎾寸鐎ｎ偀鎷烘繛鏉戝悑閻熝囧箖婵傚憡鐓曢煫鍥ㄦ閼板潡鏌ｅ☉鍗炴灈妞ゎ偅绮撻弫鎾绘寠婢跺本娈鹃梺缁樺灩閻℃棃寮崶顒佺厽婵☆垱瀵ч悵顏嗙磼妫版繂浜版慨濠傤煼瀹曟帒鈻庨幋顓熜滈梻浣告贡閳峰牓宕戞繝鍌滄殾闁哄绨卞Σ鍫ユ煏韫囨洖啸妞ゆ柨妫欐穱濠囨倷瀹割喖鍓板┑鐐存尦椤ユ挾鍒掓繝姘睄闁割偆鍠撻崢鐢告煛婢跺﹦澧︾紒鐘崇墪椤﹪顢氶敓浠嬪蓟瀹ュ鐓ラ悗锝庝簽娴煎矂姊洪崫鍕拱缂佸鍨块崺銉﹀緞婵犲孩寤洪梺鍓插亝缁诲倿锝為悩缁樷拻濞达絽鎲￠幉鎼佹煕閻樿櫕绀堝ù婊咁焾閳诲酣骞嬮悜鍡樼稐闂備礁婀遍崕銈夈�冮崱娑樼；闁规壆澧楅悡鏇㈡煙闁箑鐏犻柣銊ユ惈闇夐柣鎾虫捣閻掑憡鎱ㄦ繝鍛仩闁归濞�閸ㄩ箖鎼归銈勬喚濠电姷顣槐鏇㈠磻閻樿櫕鍙忛柕鍫濇閳瑰秴鈹戦悩鍙夋悙缂佺姷鎳撻湁闁挎繂鎳忛幉鎼佹煕濡儤鍟炵紒缁樼♁濞煎繘宕滆閸嬔囨⒑绾懏鐝柟绋垮⒔閸掓帗绻濋崶銊︽闂佽法鍣﹂幏锟�?
				xbean.LDVideoRoleInfoDes des = LiveDieMange.ldvideoroleinfodeslistall.get(vedioid);
				if(des==null){
					return false;
				}
				xbean.LDVideoRoleInfoDesList lDVideoRoleInfoDesList=xtable.Ldvideoroleinfodeslisttab.get(1);
				if(lDVideoRoleInfoDesList==null){
					return false;
				}
				xbean.LDVideoRoleRoseInfoList list = xtable.Ldvideoroleroseinfolisttab.get(roleid);
				if(list==null){
					list=xbean.Pod.newLDVideoRoleRoseInfoList();
					xtable.Ldvideoroleroseinfolisttab.insert(roleid, list);
				}
				xbean.LDVideoRoleRoseInfo lDVideoRoleRoseInfo=list.getLdvideoroleroseinfolist().get(vedioid);
				if(lDVideoRoleRoseInfo==null){
					lDVideoRoleRoseInfo=xbean.Pod.newLDVideoRoleRoseInfo();
					list.getLdvideoroleroseinfolist().put(vedioid, lDVideoRoleRoseInfo);
				}
				if(lDVideoRoleRoseInfo.getRosenum()>=LiveDieMange.GIVE_ROSE_NUM_MAX){
					return false;
				}else{
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠抽柨鐔凤拷鐕佹綈婵炲弶鐗曠叅闁靛ň鏅滈崕妤呮煕閳╁喚妯呯憸鐗堝笚閺呮煡鏌涢顐簼缂傚秴鐗嗛埞鎴︽倷閸欏娅ф繝娈垮枟閹稿啿锕㈡笟锟藉铏圭磼濡浚浜滆灒濠电姴娲ょ壕鍧楁煙閹殿喖顣奸柣鎾存礋閹鏁愰崨顓熷�庨梻渚囧弾閸ㄥ爼寮婚敍鍕勃闁告挆鍕灡闂備胶纭堕弲娑氾拷姘緲閻ｅ嘲顫滈敓浠嬨�侀弮锟介幏鍛嫚閳藉懏瀚归柛銉墯閳锋帒霉閿濆嫯顒熼柣鎺斿亾閵囧嫰骞嬪┑鍥舵￥闂佺懓绠嶉崹钘夌暦婵傜唯闁靛鍔嶉幉浼存煟鎼达紕鐣柛搴″船铻炴繛鍡樺姈閸欏繑绻濇繝鍌滃闁绘挻鐟︾换娑㈠醇濠靛牅铏庨梺鍝勵儜婵″洨妲愰幒妤�绠涙い鎾楀嫮鏉规繝娈垮枛閿曘儱顪冮挊澶屾殾妞ゆ劧绠戝敮闂侀潧顧�婵″洩銇愬鑸碘拻濞达絽鎽滅粔鐑樸亜閵夛附宕岀�规洘顨呰灒濞撴凹鍨辩紞搴ｇ磽閸屾瑧鍔嶉拑鍗炩攽椤栨稒灏﹂柡灞剧洴閺佸倻鎷犻幓鎺旑啈闂備胶鍘ч悘婵喢洪鐑嗘綎婵炲樊浜滃婵嗏攽閻樻彃鏆熼柛娆忔濮婂搫煤鐠囨彃顫╅梺闈涚墛閹倸顕ｉ锕�绠荤紓浣姑▓鐔兼⒑闂堟侗妲堕柛搴″船琚欓柛顐犲劜閳锋垿姊婚崼姘珖缂佸澧庣槐鎺楃叓椤撶姷鐓撻梺璇″櫍缁犳牠骞冨鍫熷癄濠㈣泛鐭堥崥鍛存⒒娴ｇ懓顕滄俊顐＄劍閹便劑濡堕崨顏呯�哄┑鐘诧工閻楀﹪鍩涢幋锔界厵闁兼祴鏅涙禒婊堟煕閺冿拷閿曘垽寮诲☉銏犳閻犳亽鍔庨崝顖炴⒑鐠団�崇仩闁哥喐鎸抽妴渚�寮撮姀鈩冩珕闁荤喐鐟辩徊鍓э拷姘冲亹缁辨捇宕掑顒婃嫹閻戣姤鍊块柨鏇炲�归弲顏勨攽閻樻剚鍟忛柛鐘崇墵閹囧箻鐠囪尪鎽曢梺缁樻⒒閳峰牓寮鍡樺弿婵☆垰銇橀崥顐︽煕閺冩垵鐏﹂柟顔筋殘閹叉挳宕熼鍌ゆО闂備焦鎮堕崝宀勫Χ濮濆本顥ら柣鐔哥矌婢ф鏁Δ鍛亗婵炴垶鐔幏鐑芥儌閸涘﹤顏堕梺璇插嚱缂嶅棝宕滃☉銏″剨闁割偁鍎查埛鎴﹀级閻愭潙顥嬮柛鏂跨Ч閺岀喖鎮烽悧鍫濇灎閻庢鍣崑濠囩嵁濡偐纾兼俊顖滅帛椤忕喖姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷?
					lDVideoRoleRoseInfo.setRosenum(lDVideoRoleRoseInfo.getRosenum()+1);
				}
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠抽柨鐔凤拷鐕佹綈婵炲弶鐗曠叅闁靛ň鏅滈崕妤呮煕閳╁喚妯呯憸鐗堝笚閺呮煡鏌涢顐簼缂傚秴鐗嗛埞鎴︽倷閸欏娅ф繝娈垮枟閹稿啿锕㈡笟锟藉铏圭磼濡浚浜滆灒濠电姴娲ょ壕鍧楁煙閹殿喖顣奸柣鎾存礋閹鏁愰崨顓熷�庨梻渚囧弾閸ㄥ爼寮婚敍鍕勃闁告挆鍕灡闂備胶纭堕弲娑氾拷姘緲閻ｅ嘲顫滈敓鑺ヤ繆閹间焦鏅滈柦妯侯槸婵″灝鈹戦悩鍨毄闁稿鐩幃娲Ω瑜嶉崹婵堬拷鐧告嫹闁跨喓鏅Σ鎰版倷鐎靛摜鐦堥梺鎼炲劀閸℃ɑ鍟洪梻鍌欒兌缁垰顫忔繝姘偍鐟滃繒鍒掔拠宸僵閺夊牄鍔岄弸鎴︽倵楠炲灝鍔氭い锔诲灠鏁堥柡灞诲劚缁狙囨煕椤愶絿鈽夊┑锛勵焾闇夋繝濠傚閻帡鏌＄仦鐐鐎规洜鍘ч埞鎴﹀炊瑜庨锟犳⒒娓氾拷濞艰崵寰婇懖鈺佸灊婵炲棙鎸搁拑鐔兼煟閺冨倸甯堕柣顓燁殔椤法鎹勬笟顖氬壈闂佽法鍠曟慨銈夊礉濞嗘挸钃熼柣鏃傗拡閺佸﹪鏌曟繛鍨姕闁瑰吋鍔欏娲础閻愭潙鏋犻梺鍝勭焿缂嶄礁顕ｉ鍕闁逛即娼ф俊铏節绾版﹫鎷烽搹顐熸灆闂佸憡鎸鹃崰搴綖韫囨洜纾兼俊顖濐嚙椤庢挻绻涢幘鏉戝毈闁搞劍濞婂畷婵嬪箹娴ｅ湱鍘介柟鍏肩暘閸ㄥ鍩㈤幘缁樼厸闁告侗鍠氬ú鎾煙椤旇棄鍔ら柍瑙勫灩閿熸枻缍嗘禍鐐侯敊閹邦厾绠鹃弶鍫濆⒔閸掍即鏌熼懞銉х煉闁诡喚鍋撻妶锝夊礃閳圭偓瀚奸梻浣告啞缁嬫垿鏁冮妶鍡樺弿闁挎洖鍊归悡鏇㈡煟濡櫣锛嶅褑浜槐鎺楊敊閼测晛鈪遍梺璺ㄥ枑閺嬭崵绱為崱娑樼；濞达絽婀遍々鍙夌節婵犲倻澧涢柣鎾寸懇閺岀喓鎲撮崟顐㈩潔缂佺虎鍘介崕鎶芥箒闂佺粯锚閸熷灝霉椤曪拷閺岋紕浠﹂崜褎鍒涢悗娈垮枙缁瑦淇婂宀婃Щ闂佸啿鍢查惌鍌氼潖濞差亜浼犻柛鏇ㄥ幘閸斿湱绱撻崒姘毙＄紒鑸靛哺閻涱噣宕橀鑲╁幐婵炶揪绲藉鍫曟倵婵犳碍顥婃い鎰╁灪婢跺嫰鏌＄仦璇插闁宠绉归弫鎰板幢濞嗘埈鍟庨梺璇叉捣閺佹悂鈥﹂崼銉晛闁瑰墽绮埛鎺楁煕閺囥劌浜滄い蹇ｅ幖閳规垿鏁嶉崟顒佹瘓閻庤娲滈崰鏍�佸☉姗嗘僵閺夊牃鏅滃鎴濃攽閿涘嫬浜奸柛濠冪墵瀹曞綊宕奸弴鐐碉紵闂佹儳娴氶崑鍡涖�呴柨瀣ㄤ簻闁哄浂浜濈�氬綊姊虹拠鈥虫灍妞ゃ劌鎳橀崺銏ゅ箻鐠囨彃鐎銈嗘⒒閺咁偉銇愰弻銉︹拻濞达絿鍎ら崵锟介梺鎼炲�栭悧鐘荤嵁韫囨稒鏅搁柨鐕傛嫹?
				des.setRosenum(des.getRosenum()+1);
				for(xbean.LDVideoRoleInfoDes desdb:lDVideoRoleInfoDesList.getLdvideoroleinfodeslistall()){
					if(desdb.getVideoid().equals(vedioid)){
						desdb.setRosenum(des.getRosenum());
						break;
					}
				}
				SLiveDieBattleGiveRose sLiveDieBattleGiveRose=new SLiveDieBattleGiveRose();
				sLiveDieBattleGiveRose.vedioid = vedioid;
				sLiveDieBattleGiveRose.rosenum = des.getRosenum();
				sLiveDieBattleGiveRose.roseflag = lDVideoRoleRoseInfo.getRosenum();
				Onlines.getInstance().send(roleid, sLiveDieBattleGiveRose);
				return true;
			};
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793844;

	public int getType() {
		return 793844;
	}

	public java.lang.String vedioid; // 录像id

	public CLiveDieBattleGiveRose() {
		vedioid = "";
	}

	public CLiveDieBattleGiveRose(java.lang.String _vedioid_) {
		this.vedioid = _vedioid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(vedioid, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		vedioid = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLiveDieBattleGiveRose) {
			CLiveDieBattleGiveRose _o_ = (CLiveDieBattleGiveRose)_o1_;
			if (!vedioid.equals(_o_.vedioid)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += vedioid.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(vedioid.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

