
package fire.msp.role;

import fire.pb.main.ConfigManager;
import fire.pb.map.MapConfig;
import fire.pb.move.SAddUserScreen;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GAddUserScreen__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GAddUserScreen extends __GAddUserScreen__ {
	@Override
	protected void process() {
		// protocol handle
		Role reqRole = RoleManager.getInstance().getRoleByID(reqroleid);
		Role addRole = RoleManager.getInstance().getRoleByID(addroleid);
		if(reqRole == null || addRole == null)
			return;
		if(reqRole.getScene().getSceneID() != addRole.getScene().getSceneID())
			return;//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ψ瑜忕壕钘壝归敐鍛儓鐏忓繘姊洪崨濠庢畷濠电偛锕ら锝囨嫚濞村顫嶅┑鈽嗗灦閺�閬嶅棘閿熶粙姊绘担鍛婂暈婵炶绠撳畷鎴﹀礋椤掍礁寮块梺闈涚箞閸婃牠鍩涢幋鐐电闁煎ジ顤傞崵娆愵殽閻愭惌娈滈柡宀�鍠栭幃鐑芥偋閸繃鐏庨柣搴㈩問閸犳牠鈥﹂悜钘夋槬闁告洦鍨扮粈鍐煏婵炑冩噽瀹撲線姊绘担绛嬪殭闁告垹鏅槐鐐哄幢濡⒈娲搁梺缁樺姇閹碱偊宕掗妸鈺傜厵闁规鍠栭。濂告煃闁垮鐏撮柡灞诲�曢湁閻庯綆鍋呴悵鏂款渻閵堝繒鍒伴柕鍫熸倐楠炲啫螖閸愵亞鐣跺┑鐐村灦钃遍柟鍏煎姇椤╁ジ宕ㄧ�涙ǚ鎷洪梺鍛婄☉閿曘儲寰勯崟顖涚厱闁绘ê鍟块崫娲煙椤斿吋鍋ラ柡浣规尰缁傛帞锟斤綆鍋�閹锋椽鏌ｉ悢鍝ユ噧閻庢凹鍓涚划鍫ュ礃閳哄啰顔曟繝銏ｆ硾椤戝洤煤閹绢喗鐓忛柛鈩冾殔閿熻棄鎽滈崣鍛渻閵堝懐绠伴柟铏姍瀹曘垺绂掔�ｎ偀鎷虹紓鍌欑劍钃遍柣鎾卞劦閺岀喖鎳為妷褏鐓夊Δ鐘靛仜閿曨亜顕ｉ幘顔藉亹闁汇垻顣槐鏌ユ⒒娴ｈ櫣甯涙い顓炵墕閳诲秹寮撮悙鍨闁诲繒鍋熼搹搴♀枔娴犲鐓熼柟閭﹀幖缁插鏌￠崱妯兼噭闁靛洤瀚伴、鏇㈡晲閸モ晝鍘滈梻浣芥〃閻掞箓骞愰懡銈囩焿闁圭儤妫戦幏鐑芥晲鎼存繄鏁栭梺浼欑到閹碱偊鍩為幋锔藉�烽柛娆忣樈濡繝姊洪幖鐐插婵炲鐩幃楣冩煥鐎ｎ亞绐為梺褰掑亰閸撴稒顨ラ崶顒佲拺缂備焦锚婵秵绻涙担鍐叉储閿熻棄鍊圭缓浠嬪川婵犲嫬骞楁俊鐐�栭崝鎴﹀垂閼姐倗涓嶉柟缁樺川鎼淬劌鐐婄憸婵嬬叕椤掑嫭鐓欐い鏃傛櫕閹冲洦銇勯姀鈩冾棃鐎规洜鍠栭幊婊堟濞戝彉绱﹂梻鍌欑閹碱偄煤閵婏附鍙忛梻鍫熺〒閺嗭箓鏌涘▎蹇ｆХ缂佽妫欓妵鍕冀閵娧呯暤闂佸憡淇洪～澶愬Φ閸曨垰鐓涢柛灞剧矊瀵劑姊洪崫鍕拱闁烩晩鍨堕妴渚�寮撮姀鈩冩珳闂佺硶鍓濋悷顖毼ｉ鍕拻濞达綀濮らˉ澶愭煕閻旇泛宓嗙�规洑鍗抽獮鍥敊閽樺绨ユ繝鐢靛仦閸垶宕归崷顓犱笉闁挎繂妫涚粻楣冩煕閳╁喚娈樼紒鐘插暱闇夐柣妯垮吹閻ｇ儤鎱ㄦ繝鍐┿仢鐎规洦鍋婂畷鐔碱敆閿熻棄鈻嶉妶鍥╃＝濞撴艾娲ら弸鐔兼煙閻熺増鎼愭い鏇稻缁绘繂顫濋鐐扮盎缂備胶鍋撴刊鑺ャ仈閹间礁鐤炬い鎺戝閳锋垹绱掗娑欑濠⒀冨级閵囧嫰濡搁妷锕�娈楅悗娈垮枛閸熷潡鍩㈡惔銊ョ疀闁崇尨鎷风紒銊嚙椤啴濡堕崱妤呭殝闂佸湱鍏橀弨杈ㄧ┍婵犲浂鏁冮柨婵嗘处閸ｎ噣姊洪悷鎵暛闁搞劌缍婇崺鐐哄箣閻欏懏瀚归柨婵嗛娴滄粌霉閻樿櫕銇濇慨濠傤煼瀹曟帒顫濋崡鐑嗘澑缂傚倷绀侀鍡涘礉濡ゅ懎绀嗛柟鐑橆殔闁卞洭鏌￠崶鈺佹毐闁归攱妞藉娲嚒閵堝懏鐎惧┑鐘灪閿曘垹顕ｉ搹顐ｇ秶闁冲搫鍟伴敍婊呯磽閸屾瑧鍔嶉柨鏇ㄥ亰閹虫捇骞愭惔顔筋啍闂佺粯鍔栬ぐ鍐汲閿濆鐓欐い鏃傛櫕閻帡鏌熷畷鍥т槐濠碉紕鍏橀弫鍌炴偩鐏炵晫绋婚梻鍌氬�搁崐椋庣矆娓氾拷楠炲鏁撻悩鑼唶闂佺硶鍓濈粙鎴濐啅濠靛洢浜滈柡宥冨姀婢规绱掗悩瀹犲闁宠鍨块幃鈺呭垂椤愶絾鐦庡┑鐘愁問閸犳洟宕￠崘鑼殾鐟滅増甯楅崑鍌炲箹鐎涙〞鎴︽倶閸愩劉鏀介柣鎰綑閻忕喖鏌涢妸锔姐仢鐎殿喗褰冮埞鎴狅拷锝庡亞閸欏棝姊洪崫鍕窛闁稿鐩弫鎾绘偩瀹�濠勫姼闁轰礁鐗撻弻锛勪沪鐠囨彃濮曢梺绋匡功閺佸寮婚妸銉㈡斀闁糕剝渚楅敓鑺ヮ殔闇夋繝濠傚缁犵偤鏌＄仦鍓р槈闁宠姘︾粻娑㈠即閻欙拷閸炲湱绱撻崒娆掑厡缂侇噮鍨抽幑銏ゅ醇濠㈩亝鐩畷姗�濡搁姀鈽嗘綌婵犳鍠楅敃鈺呭礂濮楋拷楠炲繘顢旈崼鐔叉嫽婵炶揪绲介幗婊呯矓閻戞ǜ浜滈柕澶涢檮瀹曞瞼锟借娲橀〃鍛达綖濠婂牊鏅搁柦妯侯樈閸ゆ洘銇勯幇鍓佺暠缂佺姾宕电槐鎾存媴閼测剝鍨甸埢宥夊閵堝棌鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷
		MapConfig mapcfg = ConfigManager.getInstance().getConf(MapConfig.class).get(reqRole.getScene().getMapID());
		if(mapcfg == null)
			return;
		if(mapcfg.getVisibletype() == 1)//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氶梻鍌欒兌椤牏鎮锕�绀夐幖娣妼缁犵喖鏌熼梻瀵割槮缂侇偄绉归弻娑㈩敃閿濆棗鍓烽梺闈涱槴閺呮粓鎮￠弴銏＄厵闁煎壊鍓欐俊鑺ョ箾閸涱厽顥㈤柡灞剧♁閹棃鏁愰崨顔句邯闂備礁鎼張顒�煤濠靛牏涓嶆繛鎴炵啲閹风兘鏁愭惔婵堟晼闂佸憡姊瑰娆撳煘閹达附鍊烽悹楦挎濮ｃ垹顪冮妶搴″箹闁绘鎹囧畷娲倷閸濆嫮顓洪梺鎸庢濡嫭绂嶈ぐ鎺撶厽闁绘ê寮堕崢鍌炴煕閹板苯鎳愰悡鎴︽⒒閸屾艾锟界兘鎳楅崼鏇炵疇闁规崘顕ч悿顕�鎮归幁鎺戝鐎规洘鐓￠弻鐔煎箥椤旂⒈鏆梺绋款儌閺呯娀寮婚敐澶婄闁挎繂妫Λ鍕磽娴ｅ搫啸闁轰礁顭峰濠氭偄閻撳簼绱堕梺鍛婃礋濞佳囧礉閿熶粙姊绘担鍝ョШ妞ゃ儲鎹囧畷妤�顫滈敓浠嬫偘椤曪拷楠炴帒螖閿熺晫绮婚敐鍡愪簻闁规崘娉涢弸搴ㄦ煕韫囨搫韬慨濠勭帛閹峰懘鎼归悷鎵偧闂備礁鎲″Λ鎴犵不閹惧磭鏆︽繝濠傚暊閺嬪酣鏌熼崹顔兼殲闁哄懏绮撳娲礈閹绘帊绨煎┑鐐插级閿曘垽骞冮敓鐘冲亜闁绘挸娴烽鎰攽閻戝洨绉甸柛鎾寸懇閺佹挻鎱ㄩ幇顒婃嫹閺団懇锟斤箓宕堕锟界粻娑欍亜閹捐泛啸妞ゆ梹娲栭埞鎴︽倷鐎涙绋囧銈嗗灥濡鍩㈠澶婄倞闁冲搫鍟伴敍婊堟煛婢跺﹦澧愰柡鍛♁缁傛帡鏁傞崜褏锛滃┑掳鍊曢崯顐﹀几濞戙垺鐓涘ù锝堫潐鐏忔壆绱掗崒娑樼闁跨喐鏋荤紞鍡涙晸缁涘骞戦柛搴ㄤ憾濠�渚�姊洪幐搴ｇ畵婵炲眰鍔戞俊瀛樼節閸愌呯畾闂佸湱绮敮鐐存櫠濞戞〒搴ㄥ炊瑜濋煬顒併亜閵忥紕娲撮柟顔界懅閿熻姤绋掕摫婵炲牊鎮傚缁樻媴閸涘﹥鍎撻梺绋款儏閿曨亪鐛箛娑欏�婚柤鎭掑劗閹峰姊虹粙鎸庢拱闁荤啙鍥佸洭鏁傞崜褏锛濋悗骞垮劚閹锋垿鐓鍌︽嫹鐟欏嫭绀冮柛銊ュ閹广垹鈹戠�ｎ亞鍊為悷婊冪Ч瀹曟垵顓兼径瀣ф嫼闂佸憡绋戦敃銉э拷鍨懇閺屾稑鈽夐崡鐐典化闂佸憡顭囨繛锟芥慨濠勭帛閹峰懘鎳為妷褋锟藉﹪姊洪棃鈺冪Ф缂佺姵鎹囬悰顔跨疀濞戞瑦娅㈤梺璺ㄥ櫐閹凤拷
			return;
		if(mapcfg.getVisibletype() == 2)//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐差渻閵堝棗绗掓い锔垮嵆瀵煡顢旈崼鐔蜂画濠电姴锕ら崯鎵不缂佹﹩娈介柣鎰綑閻忔潙鈹戦鍡樺闂備線娼ч悧鍡涘箠閹扮増鍋柨鐔诲Г娣囧﹪鎮欓鍕舵嫹閺嶎灛娑欐媴閼叉繃鐩畷鐔碱敆娴ｇ濡冲┑鐘垫暩婵潙煤閿曞倸鐓曢柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘嚚鐟邦煥閿熶粙宕￠幎钘夎摕婵炴垯鍨洪崑鎰版煙妫颁胶鍔嶉柣锝呯埣濮婄儤瀵煎▎鎴炲仹闂佺绻戦敋闁伙絿鍏橀弫鎰板幢濡ゅ啰鐛┑鐘灱濞夋盯鎯夋總鍛婂仼闁绘劦鍏涚换鍡涙煟閹板吀绨婚柨鐔诲Г閻楃娀骞冭铻栭柛娑卞枛娴狀參鎮峰鍐闁告帗甯″顕�宕煎┑瀣殔婵犲痉鏉匡拷鎾绘嚄閸洖鐭楅柛鈩冦仜閺�浠嬫煟濡偐甯涙繛鎳峰嫪绻嗘い鎰靛亜楠炴牠宕℃潏鈺傚枑闁绘鐗嗙粭姘舵煟閹惧娲撮柡灞剧☉閳藉宕￠悙瀵镐壕缂傚倷鑳舵慨鐑藉磻閵堝钃熼柨娑樺濞岊亪鏌涢幘妞剧筏閹风兘骞掗幊銊ョ秺閹亪宕ㄩ婊勬闂備浇顕栭崰妤呮偡閳哄懌锟戒礁螖閸涱厾锛滃┑鐐村灥瀹曨剟骞冪�ｎ喗鈷掗柛灞捐壘閿熺晫鍏橀幊妤呭礈娴ｇ鐏婂銈嗙墱閸嬫稓绮婚弶搴撴斀闁绘ê鐤囨竟姗�鏌涢妸銉ワ拷鍧楀蓟閿濆顫呴柕蹇婂亾閿熻棄锕弻銊╂偄鐠囨畫鎾翠繆椤愩垹鏆欓柣锝呭槻椤粓鏁撴禒瀣拷浣糕枎閹惧啿绨ユ繝銏ｎ嚃閸ㄦ澘煤閿曞倹鍋傞柡鍥ュ灪閻撳啴鏌嶆潪鎵槮闁哄棛鍠栭弻鐔煎礃閹绘帗娈查梺闈涙搐鐎氫即銆侀弴鐔稿劅闁斥晛鍟▍褏绱掗悙顒�绀冩俊顐㈠濠�渚�姊洪幐搴ｇ畵婵炲眰鍔戦獮妤呭磼閻愬鍘遍梺闈涚墕濡盯骞婇崨顖滅＜閺夊牄鍔岀粭姘憋拷鍨緲鐎氼噣鏁撻弬銈囩У闁稿瀚板畷顒佸緞閹邦厸鎷洪梺缁樺姌濡嫰宕濋悽鐢电＜闁绘娅曠亸顓㈡煟閿濆洤鍘寸�规洖銈稿鎾Ω閿旇姤鐝滄繝鐢靛仩閹活亞绱為敓鑺ャ亜椤愩埄妯�妞ゃ垺妫冮幃銏ゅ礂鐏忔牗瀚藉┑鐐舵彧缂嶏拷濠殿喓鍊楀☉鐢稿醇閺囩喓鍘遍梺鎸庣箓缁绘帡鎮鹃崹顐闁绘劘灏欑粻濠氭煛娴ｈ宕岄柡浣规崌閺佹捇鏁撻敓锟�
		{
			final long reqteamid = reqRole.getTeamID();
			final long addteamid = addRole.getTeamID();
			if(reqteamid == 0 || addteamid == 0 || reqteamid != addteamid)
				return;
		}
		
		SAddUserScreen sadduser = new SAddUserScreen();
		sadduser.rolelist.add(addRole.getRoleBasic());
		gnet.link.Onlines.getInstance().send(reqroleid, sadduser);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730909;

	public int getType() {
		return 730909;
	}

	public long reqroleid;
	public long addroleid;

	public GAddUserScreen() {
	}

	public GAddUserScreen(long _reqroleid_, long _addroleid_) {
		this.reqroleid = _reqroleid_;
		this.addroleid = _addroleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(reqroleid);
		_os_.marshal(addroleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		reqroleid = _os_.unmarshal_long();
		addroleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GAddUserScreen) {
			GAddUserScreen _o_ = (GAddUserScreen)_o1_;
			if (reqroleid != _o_.reqroleid) return false;
			if (addroleid != _o_.addroleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)reqroleid;
		_h_ += (int)addroleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(reqroleid).append(",");
		_sb_.append(addroleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GAddUserScreen _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(reqroleid - _o_.reqroleid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(addroleid - _o_.addroleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

