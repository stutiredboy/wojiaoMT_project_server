
package fire.pb.shop;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CMarketContainerBrowse__ extends mkio.Protocol { }

/** 摆摊容器浏览
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CMarketContainerBrowse extends __CMarketContainerBrowse__ {
	@Override
	protected void process() {
		// protocol handle
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		if (!fire.pb.shop.srv.market.Market.useMarketCheck(roleId))
			return;
		
/*		
		fire.pb.item.ItemColumn itemcol = fire.pb.item.Module.getInstance().getItemColumn(roleId, fire.pb.item.BagTypes.MARKET, true);
		fire.pb.pet.PetColumn petcol = new fire.pb.pet.PetColumn(roleId, fire.pb.pet.PetColumnTypes.MARKETPET,true);
		SMarketContainerBrowse browse = new SMarketContainerBrowse();
		browse.items = itemcol.getBagInfo().items;
		browse.pets = petcol.getAllProtocolPets();
		gnet.link.Onlines.getInstance().send(roleId, browse);
		*/
		new mkdb.Procedure() {
			protected boolean process() {
				if (fire.pb.main.Gs.isMergeServer()) {
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囨煕閳╁啨浠︾紒顔瑰墲娣囧﹪鎮欓鍕舵嫹閺嶎厼绀夌憸蹇曞垝婵犳艾绠ｉ柣妯烘▕濡粓姊虹粔鍡楀濞堟洟鏌ｉ幘瀵告噮缂佽鲸鎸婚幏鍛存濞戞矮鎮ｆ繝鐢靛仜閹冲繘鏁冮姀銈呰摕闁斥晛鍟刊鎾煕閹炬潙绲婚柛鎾归哺缁绘盯鏁愰崨顔芥倷闂佹寧娲︽禍婵囩┍婵犲洤閱囬柡鍥╁仜缁愭稑顪冮妶鍡樺暗闁哥姵鍔欓、娆愬緞閹邦厸鎷绘繛杈剧导鐠�锕傛倿閻愵兙浜滈柟瀛樼箖椤ャ垽鏌℃担绋挎殻濠殿噯鎷烽梺闈涚墕閹虫捇骞楅弴銏♀拺闁告繂瀚婵嬫煕閻樿櫕灏电紒顔剧帛閵堬綁宕橀埡鍐ㄥ箞婵＄偑鍊ら崢浠嬪垂闂堟稈鏋嶆繛鍡樻尰閻撴瑧锟界懓瀚妯何ｆ繝姘厓闁芥ê顦藉Ο锟芥繝娈垮櫙閹风兘姊虹紒妯曟垼銇愰崘鈺冾洸闁肩鍚�缁诲棝鏌ｉ幇鍏哥盎闁跨喕濮ら悧婊堝极椤旂晫绡�闁搞儯鍔岄敓钘夋健閺屻劑寮撮悙璇ф嫹閹间焦鍎楁俊銈呮噽閸欐捇鏌涢妷锝呭闁抽攱甯炵槐鎺楀煡閸涱喖顏堕梻鍌氬�搁崐鎼佸磹閹间焦鍋嬪┑鐘插閻瑩鏌熸潏鎯х槣闁轰礁鍊块弻宥夊传閸曨剙娅ら梺缁樻尪閸庣敻寮婚敐澶婄睄闁搞儴娉涘▓顓㈡偠濮橆厼鍝烘慨濠冩そ閹粓鍩￠崒娑氬綗闂備焦鎮堕崝宀勬偉閻撳寒鍤曟い鎰剁畱缁犳盯鏌ｅΔ锟介悧鍡涙晸閻ｅ苯鍘撮柡灞剧☉閳诲氦绠涢幙鍕闁荤喐瀚堝☉銏犵闁靛ě鍕啎闂備線娼ц墝闁哄應鏅犲顐ｇ節閸ャ劎鍘遍棅顐㈡处閼圭偓绂嶈ぐ鎺撶厸濠㈣泛顦遍惌娆愭叏婵犲偆鐓肩�规洘甯掗埢搴ㄥ箣椤撶啘婊堟⒒娴ｄ警鏀版い鏇熺矌閹广垹鈹戠�ｎ亞鐣洪梺缁樺灱濡嫬鏁梻浣稿暱椤曟牠宕橀埡浣圭亷婵°倗濮烽崑娑氱矓瑜版帇锟戒礁鈻庨幘鏉戯拷閿嬨亜閹虹偞瀚瑰┑鐐叉噺閿曘垹顫忔繝姘＜婵﹩鍓ㄩ幏鐑藉箹娴ｅ摜锛欐俊鐐差儏濞寸兘鎯岄崱妞硷拷鎺戭潩閻愵剙顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处缂併劎绮穱濠囨倷椤忓嫸鎷烽弽顐ｆ殰闁圭儤妫戦幏宄邦潩閻撳骸绫嶉梺绯曟櫆閻╊垰顕ｉ锟藉畷濂告偄閸濆嫬绠為梻鍌欑閹碱偄煤閵忋倕绀夐悘鐐插⒔椤╂彃螖閿濆懎鏆為柣鎾跺█閺屸剝寰勬惔銏€�婃繛瀵稿О閸ㄤ粙寮婚弴銏犲耿婵☆垵娅ｉ悷銊ヮ渻閵堝骸浜濈紒璇茬墦楠炲啫鈻庨幙鍐╂櫌闂佽法鍠嶇划娆撱�侀弮鍫濋唶闁哄洨鍠撻崢浠嬫煙閸忚偐鏆橀柛濞垮�曢…鍥箛椤撶姷顔曞┑鐐存綑椤戝棗鈻嶉崶鈺冪＜閺夊牃鏅涙禒锕傛煙瀹勭増鍤囩�规洘绮撻獮鎾诲箳閹垮啫鎮梻鍌氬�烽懗鍫曗�﹂崼銉︽櫇闁挎洖鍊搁梻顖炴煏婢跺牆鍓婚柨婵嗩槹閸ゅ啴鏌嶉崫鍕殶闁挎稒绻冪换娑㈠箻绾惧顥濋梺鎸庢磸閸庢娊鏁撻懞銉ㄥ缂傚秴锕ら～蹇涙惞鐟欏嫬纾梺闈涱焾閸庢煡鎮橀崱妯肩瘈婵炲牆鐏濋弸鏃堟煕婵犲喚娈滄鐐村灴婵拷闁绘﹩鍋呴～宥夋⒑闂堟稓绠冲┑顔惧厴椤㈡ê煤椤忓應鎷虹紓鍌欑劍閿氬┑顔肩墛缁绘盯宕楅懖鈺傚櫘闂佸摜濮撮敃銈夘敇閸忕厧绶為悗锛卞嫬顏归梻浣筋嚙濞村嘲鈻嶉姀銈嗏挃闁告洦鍋掗悢鍡樹繆椤栨繍鍞虹紒璇叉閺屾稖绠涢弴銊ュ妴婵炲瓨绮嶇划宥夊Φ閸曨喚鐤�闁圭偓鍓氭禒濂告⒑閸濆嫭锛旂紒鎻掓健閺佹捇宕愰悤浣圭秷濠电偛寮堕…鍥极椤曪拷閺佹捇鎮╅懠顒傛毇婵犵數鍋涘Λ娆撳箰婵犳艾鍚归柟瀵稿亼娴滄粓鏌熼悜妯虹劸婵″弶鎮傞弻鈩冩媴鐟欏嫬锟芥劖鎱ㄦ繝鍛仩闁归濞�瀵濡烽鍡樺婵°倕鍟扮壕濂告煟濡灝鐨洪弫鍫ユ倵鐟欏嫭绀冩繛鑼枛瀵宕卞Δ濠傛倯闂佸憡渚楅崹鎶藉几閸愵喗鈷戠痪顓炴噹椤ュ秹鏌熷ú璁崇敖鐎垫澘锕畷绋课旀担绋垮闂備胶纭堕崜婵嬫偡闁秴绠柣鎴ｅГ閸庡矂鏌涘☉姗堝伐妞ゅ繐鐖煎缁樻媴閸涘﹤鏆堝┑鐐额嚋缁犳挸鐣峰Δ锟介～婊堟晸娴犲宓侀煫鍥ㄧ☉娴肩娀鏌涢弴鐐典粵閻庨潧鐭傚娲濞戞艾顣哄┑鈽嗗亝椤ㄥ牏鍒掗銏犵＜闁绘劕顕崢浠嬫⒑绾懏顏犻柛瀣洴閵嗗懘顢楅敓浠嬫箒濠电姴锕ょ�氼參宕愰幇顓滀簻闁靛繆妲勯懓鍨攽椤曞棙瀚归梻浣瑰缁嬫垹锟芥凹鍓熼悰顕�宕奸悢铏圭槇闂佹眹鍨藉褎绂掑鍕箚妞ゆ劧缍嗗▓姗�鏌熼獮鍨伈妤犵偛顑夐弫鍐晸閻ｅ苯顥氬┑鐘崇閻撳繐顭跨捄鐑橆棡婵炲懎妫濋弻锝夊箻鐎靛憡鍣梺闈涙搐鐎氭澘顕ｆ禒瀣╅柕濞垮労濡喖姊绘担鍛婃儓婵☆偄顕濠囧锤濡や焦娅㈤梺绋匡功閸ｃ儱顭囬幇顓犵闁告瑥顦遍惌鎺旓拷瑙勬磻閸楀啿顕ｆ禒瀣垫晣婵犲﹥鍔栫�氱懓銆掑鐐閻庢鍠楅幐铏叏閿熶粙鏌ｅ▎娆愬濠电偟鍘ч敃顏勵潖閾忓湱纾兼俊顖氭禋娴滅偞绔熼弴銏╂晣闁绘鏁搁悡瀣偡濠婂懎顣奸悽顖涱殜閸╂盯骞掑Δ浣哄幈闁诲繒鍋涙晶浠嬪箠閸涱垳纾奸柟閭﹀幗閳锋劗绱掔紒妯兼创闁诡喒鍓濋幆鏃堫敊閹勫�┑掳鍊楁慨鐑藉磻濞戞碍宕叉慨妤嬫嫹鐎殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�?
					Integer val = xtable.Takebackmarketcontainertab.select(roleId);
					if (val == null) {
						fire.pb.shop.srv.market.MarketManager.getInstance().sendTempMarketContainer(roleId);
						if (fire.pb.shop.srv.market.MarketManager.LOG.isInfoEnabled()) {
							StringBuilder sbd = new StringBuilder();
							sbd.append("role=").append(roleId).append(", 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊璁查弸娆撴⒑缂佹ê绗╁┑顔哄�楅幑銏犫槈閵忕姴鑰垮┑鈽嗗灥濞咃絾绂掗幖浣瑰�甸悷娆忓缁�锟介悗娈垮枦閸╂牜绮氭潏銊х瘈闁搞儺鐏涜閺屾稑鈽夐崡鐐寸亪闂佺粯绻冨鑽ゆ閹捐纾兼慨妯荤樂閿濆鐓熸俊銈勮兌閻帡鏌℃担瑙勫磳闁圭锕ュ鍕暆閿熶粙寮冲☉銏♀拺缂佸娼￠崣鍕瑰鍕姸婵☆偆鍠愮换娑氾拷鐢殿焾鐢爼鏌ｆ幊閸旀垵鐣烽幇鏉垮瀭妞ゆ棁顫夐弬锟介梻浣侯焾閺堫剛鍠婂澶婄柈闁绘劗鍎ら悡鐔兼煙閹屽殶闁瑰啿娲弻鈥崇暆閿熶粙宕伴弽顓滐拷浣糕槈閵忕姴鑰垮┑掳鍊ч幏鐑芥煛閸℃瑥浠﹂柟渚垮姂閺佹劙宕卞Δ锟介～鎺楁⒑鐠団�虫灍妞ゃ劌锕獮鍐╃鐎ｎ偒妫冨┑鐐村灱妞寸袙婢跺绡�缁剧増蓱椤﹪鏌涚�ｎ亜顏�规洦鍨堕、鏇㈡晜缂佹ɑ娅旈梻浣瑰缁诲倿藝椤栫偞鐓侀柛銉墯閻撴盯鏌涢妷銏℃珔濞寸姍鍥ㄧ厱婵☆垳绮崐鎰叏婵犲懏顏犵紒顔界懇楠炴劖鎯旈姀鈥愁伆缂傚倸鍊风粈渚�顢栭崱娑樼闁搞儜鍛闂佹寧绻傞ˇ顖炵嵁閵忊�茬箚闁绘劗鏁哥敮娑㈡煛閸岋附瀚归梻鍌氬�烽懗鍓佸垝椤栫偛绀夐柡宥庡厵娴滃綊鏌涢幇鍏哥敖婵☆偒鍨抽幉鎼佸籍閸繆鎽曢梺鎸庣箓閹叉﹢寮敓鐣岀箔閻旂厧鐐婇柕濞у嫭鐦旂紓鍌氬�搁崐椋庢閿熺姴绐楁俊銈呮噺閸嬶繝鏌ㄩ弴顏呭濡炪倖娲忛崕闈涚暦閻旂⒈鏁冮柕鍫濇閻ｇ兘姊虹拠鎻掑毐缂傚秴妫濆畷鎴﹀礋椤栵絾鏅滈柣鐘荤細閵嗭拷闁猴拷娴犲鐓熼柟閭﹀幗缂嶆垿鏌ｈ箛銉╂闁靛洤瀚粻娑欐償閳ュ磭銈俊銈囧Х閸嬫盯顢栭崟顓犵闁告稑鐡ㄩ悡鏇㈡煏婢舵ê鏋欓柟鑼亾娣囧﹪顢涘顒変純濠殿喖锕ュ钘夌暦椤愶箑绀嬫い鏇炴噺閽戝姊绘担渚劸闁挎洏鍎抽幑銏ゅ磼閻愭潙浠奸悗鐟板閸嬪﹤顭囬妸鈺傜叆闁绘柨澧庨惌娆愵殽閻愯韬柟顔规櫊瀹曞綊顢曢姀顫础婵犵數鍋為幐濠氬礄瑜版帒鍨傛い鏍ㄧ矋椤洟鏌￠崘銊у闁抽攱甯掗湁闁挎繂娲ㄩ幗鍌炴煕閵堝棛鎳冮摶鏍煟濡寧鐝柛濠冨姍閺岀喖顢欓惌顐邯閿濈偛鈹戠�ｎ偄娈濋梺鍓茬厛閸嬪懘鎮甸弽顓熲拻濞撴熬鎷锋繛浣冲懏宕查柛顐犲劚绾惧綊鏌￠崶銉ョ仼闁告垹濮撮妴鎺戭潩閻愵剙顏堕梻浣告惈鐞氼偊宕濋幋锕�绠栭柕鍫濐槸绾惧吋绻涢幋鐑囦緵濞寸》鎷�?");
							fire.pb.shop.srv.market.MarketManager.LOG.info(sbd.toString());
						}
						return true;
					}
				}
				fire.pb.shop.srv.market.MarketManager.getInstance().sendMarketContainerByRoleId(roleId);
				return true;
			}
		}.submit();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810647;

	public int getType() {
		return 810647;
	}


	public CMarketContainerBrowse() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CMarketContainerBrowse) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CMarketContainerBrowse _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

