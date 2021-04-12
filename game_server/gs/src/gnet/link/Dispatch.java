package gnet.link;

import fire.log.Logger;

import fire.pb.EnterWorldThread;
import fire.pb.main.Gs;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __Dispatch__ extends mkio.Protocol { }

/** link to gs
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class Dispatch extends __Dispatch__ {
	
	static private final Logger logger=Logger.getLogger("SYSTEM");

	@Override
	public void dispatch(Stub stub) throws Exception {
		int error = Kick.E_PROTOCOL_UNKOWN;
		try {
			Stub stub2 = ((Coder) (getManager().getCoder()))
					.getStub(this.ptype);
			mkio.Protocol p = stub2.newInstance();
			OctetsStream octstram = OctetsStream.wrap(this.pdata);
			p.unmarshal(octstram);
			p.setConnection(this.getConnection());
			p.setContext(this);
			if(Gs.isShutDown.get())
				return;//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋婵愭綗闁跨喕妫勯崐鍦矉閹烘棑鎷烽敐搴′簼婵炲懌鍨藉娲嚍閵夊喚浜棟妞ゆ牜鍋涘Ч鏌ユ⒑椤掞拷缁夌敻鎮￠妷鈺傜厽闁哄啫鍊荤敮娑欍亜閵夈儺妲虹紒杈ㄦ尭椤撳ジ宕崘顓炴儓婵°倗濮烽崑娑㈠疮椤愩儳浜介梺鑽ゅТ濞测晝浜稿▎鎴犵幓闁绘劕顕弧锟介梺姹囧灲濞佳冪摥闂佽瀛╃粙鍫ュ疾濞戔偓锟藉懏绺界粙璇锯晠鏌嶉崫鍕拷鐢稿箯濞差亝鈷戦柛锔诲弾閻掔偓绻涢幘顕呮缂侇喖顭烽獮妯肩磼濡厧骞嶉梻浣告啞閸旀浜稿▎鎴犱笉濠电姵纰嶉悡鐔兼煙閸喖鏆欏褍鐡ㄩ妵鍕閳藉棙鐤侀悗瑙勬礈閸犳牠銆佸Δ鍛＜婵﹩鍓涢悿鍕⒒閸屾艾锟芥悂鈥﹂鍕；闁告洦鍊嬪ú顏呮櫇闁稿本淇洪幗鏇㈡⒑闂堟单鍫ュ疾濞戙垺鍋傛繝闈涱儐閻撴盯鏌涢妷銏℃珔闁哄绉剁槐鎺旀嫚閸欏妫￠梺闈涙搐鐎氫即鐛崶顒�绀堝ù锝堝祹閹达附鐓熼煫鍥ㄦ崌閻涙粎绱掗悩铏磳鐎殿喖顭烽崺鍕礃閳轰緡锟芥捇姊洪崨濠勭細闁稿孩鐩俊鍫曞触閵堝懐绉洪柟顕呬邯瀹曘劑顢涘鍕啌闂傚倷绀佸﹢閬嶁�﹂崼銉︽櫇闁靛鍎洪崵妤呮煕閺囥劌骞掓繛宀婁邯閺屾稖绠涢弴鐐蹭粯闂佺粯鎸诲ú鏍煘閹达附鍋愰柛顭戝亝濮ｅ嫰姊虹粙娆惧剳闁稿鍊曢悾鐤亹閹烘垿鍞堕梺鍝勬川閸嬬喖顢欓崶顒佲拺闁告稑锕︾紓姘舵煕鎼淬垹鈻曢柟顖氱焸楠炴绱掑Ο鐓庡箺闂備線娼х换鎺撴叏闁垮顩锋繛鎴欏灪閻撴盯鏌涢埄鍐剧劷闁活厽甯￠弻鈥崇暆閿熶粙宕伴幘鑸殿潟闁圭儤顨呴～鍛存煟濡櫣锛嶅ù婊庝邯濮婄粯鎷呯憴鍕╀户闂佸憡眉缁瑩濡撮崘顔煎耿婵☆垰鐨烽弨铏節閻㈤潧孝婵炶绠撳畷鎰版倻閼恒儮鎷婚梺鍓插亞閸犳捇鍩ｉ妷銉唵閻熸瑥瀚粈瀣煙椤旂瓔娈橀柟鍙夋尦瀹曠喖顢楅崒銈喰為梺鑽ゅ枑缁秴顭垮锟藉畷顖炲级閹搭垵锟藉灝銆掑鐐濠殿喖锕ュ浠嬬嵁閹邦厽鍎熼柨婵嗘川閺嗐倖绻濈喊妯活潑闁稿鎳橀幃鐤槾闁告帗甯″畷濂稿Ψ閿旇姤顏熷┑鐐差嚟婵挳顢栭崱娑樼９闁汇垹鎲￠崑鈩冪箾閸℃绠版い蹇ｄ簽缁辨帡鏁撴禒瀣闁崇懓銇樼花濠氭⒑闂堟侗鐒鹃柛搴ゆ珪閺呭爼鏁傜粵瀣啍闂佺粯鍔樼亸娆戠不閹惰姤鐓ラ柣鏂挎啞閻忣喚绱撳鍛棦鐎规洘濞婇、姘舵晸閽樺鍤曟い鎰剁悼缁★拷闂佹悶鍎崝搴ㄥ储閻愵剛绡�婵炲牆鐏濋弸鐔兼煕閺冿拷濞茬喖寮幘缁樺殟闁靛濡囬ˇ浼存倵濞堝灝鏋熼柣鎿勭節瀵偊骞樼紒妯绘闂佽法鍣﹂幏锟�
			
			if(logger.isDebugEnabled())
				logger.debug(new StringBuilder("Recv : class=").append(p.getClass().getName()).append(" size=").append(octstram.size()));
			
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愯姤鎱ㄥ鍡楀⒒闁绘帟妫勯埞鎴︽偐瀹曞浂鏆￠梺鎶芥敱濡啴寮诲☉銏犲嵆闁靛鍎伴懜顏堟⒑缂佹ɑ鐓ユ俊顐ｇ懄缁岃鲸绻濋崶鑸垫櫖濠殿喗菧閸庤鲸绂掑ú顏呪拺闁煎鍊曢弸娑㈡煕鐎ｎ亷宸ユい顓炴喘婵℃悂鍩￠崒婊冨汲闂備胶绮鑽ゅ垝椤栫倛澶嬪緞閹邦厾鍘介梺鎸庣箓濞层倝宕㈢�涙ü绻嗛柟瑙勫姃閸氼偆绱掓潏銊ユ诞闁诡喒鏅涢悾鐑藉炊閿濆棭娼斿┑锛勫亼閸娿倝宕戦崨顖涘床闁割偁鍎辩粻鏍煃閳轰礁鏆為柛搴ｅ枛閺屾洝绠涙繝鍌氣拤濡炪倖妫戦幏锟�
			if(fire.pb.scene.MapThread.getInstance().tryAdd(p,stub2))
				return;
			
			//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋婵愭綗闁跨喕妫勯崐鍦矉閹烘棑鎷烽敐搴′簼婵炲懌鍨藉娲嚍閵夊喚浜棟妞ゆ牜鍋涘Ч鏌ユ⒑椤掞拷缁夌敻鎮￠妷鈺傜厽闁哄啫鍊荤敮娑欍亜閵夈儺妲虹紒杈ㄦ尭椤撳ジ宕崘顓炴儓婵°倗濮烽崑娑㈠疮椤愩儳浜介梺鑽ゅТ濞测晝浜稿▎鎴犵幓闁绘劗鍎ら埛鎴犳喐閻楀牆绗掑ù婊�鍗抽弻娑㈠箻鐎靛憡鍣у銈嗘穿缁蹭粙鎮鹃敓鐘崇劷闁挎棁妫勯惁婊堟⒒娓氾拷濞佳囨偋閸℃あ娑樷槈濞嗘劖鐝峰銈嗗笒閸婅崵澹曢崗绗轰簻闁哄啫娲ゆ禍褰掑极閸繍娓婚柕鍫濆暙閻忣亝淇婇銏犳殲闁逛究鍔戦弫鎾寸鐎ｎ偆鍘梺鍓插亝缁诲啴藟閹达附鐓欑�瑰嫰鍋婇悡鍏兼叏婵犲啯銇濈�规洏鍔嶇换婵嬪礃椤垶袩闂傚倷鑳堕…鍫ヮ敄閸涙潙绠犳俊顖涘閿涘倹绻濋悽闈浶㈤柨鏇樺�濋獮蹇涘箣閿曪拷缁狀垰顪冪�ｎ亜顒㈤柛鐘叉閺屾盯寮撮妸銉ヮ潾濡炪倧璐熼崝宀勨�旈崘顔嘉ч柛鎰╁妼椤牓姊虹紒姗嗘畷闁圭懓娲幃浼搭敊鐠恒劎鏉搁梺鍝勬祩娴滄繄锟芥艾缍婇弻銊モ攽閸℃侗锟芥绻涢崨顕嗚�块柡灞稿墲閹峰懘宕滈幓鎺戝闂備礁鎼張顒勬儎椤栫偛鏄ラ柛鏇ㄥ灠缁�鍐┿亜韫囨挻鍣规繛鍛戞穱濠囨倷椤忓嫸鎷疯閿熶粙娼ч惌鍌氱暦閹惰姤鏅查柛婊�鐒︾紞搴㈢節閻㈤潧校闁肩懓澧芥竟鏇㈠礂閸忕厧寮垮┑顔筋殔濡鐛锟介弻鏇㈠醇椤愵澀鍠婂┑顔硷躬缂傛岸濡甸幇鏉跨婵犻潧娴傚Λ鏍⒒娴ｄ警鐒剧紒缁樺灴閺佸啴濮�閵堝洤绁﹂梺鍛婂姦閸犳宕愭繝姘參婵☆垯璀﹀Σ鍝ワ拷瑙勬尭濡鍩為幋锔绘晩闁活収鍋掓禍顏勭暦椤栫偛閿ゆ俊銈忔嫹闁稿被鍔戦弻銊モ槈濡警浼�缂佺偓宕樺Λ鍕箒闂佹寧绻傚ú锕傚吹閿熶粙姊烘潪鎵妽闁稿孩濞婇崺鐐哄箣閿曪拷閻忔娊鏌ц箛锝呬簻闁哄濞�濮婄儤娼幍顔煎闂佸湱鎳撳ú顓㈢嵁婵犲洦鍊烽柛婵嗗珋閵娧勫枑濠㈣泛顭悗鍫曟煏婵炵偓娅嗛柣鎾跺枑閵囧嫯绠涢幘鎰佷紝濠德ゅ蔼濞咃絿妲愰幒鎾寸秶闁靛鍎茬拠鐐烘倵濞堝灝娅橀柛鎾寸洴楠炴垿宕熼姣尖晠鏌ㄩ弮鍥棄闁哄绋撶槐鎾诲磼濮橆剨鎷锋搴ｇ焼濞撴熬鎷锋い銏＄墵瀹曘劌顫㈤妶鍛枠闁哄苯妫楅濂稿幢濡椿浠ч梻鍌欑閹碱偊宕愰崼鏇炵９婵°倕鍟伴惌鎾绘⒒閸喕锟戒粙鎮烽柇锔惧弳闂佸憡娲﹂崢楣冩偂婢舵劖鍊垫繛鍫濈仢閺嬬喓鎲搁弶鍨殻闁糕斂鍨洪幆鏃堝Ω閵壯屽晪闂佽娴烽弫鎼佲�﹂崼銉у祦鐎广儱娲ㄧ壕浠嬫煕鐏炲墽鎳呴柛鏂跨У閵囧嫰濡搁妷锔绘￥缂備緡鍠楅悷鈺呯嵁鐎ｎ亶鐔嗘い蹇撴噽濞插瓨銇勯姀鈽呰�垮┑顕嗘嫹闂佺粯锕㈠褔骞楃�ｎ喗鈷掑ù锝堝Г绾爼鏌涢敐蹇曠暤妤犵偛绻橀弫鎾绘晸閿燂拷
			if(EnterWorldThread.getInstance().tryAdd(p))
				return;
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸ゅ嫰鏌涢锝嗙８闁跨喐鍨濋悞锔炬崲濠靛纾婚柤鎭掑劤濞插锟借娲滈崰鏍�侀弴鐙呮嫹閿濆骸浜為柍钘夘樀閺屽秶鎷犻弻銉ュ及濡ょ姷鍋為敋闁伙絿鍏樺畷鍫曞煛閸屾粣鎷烽锔解拻闁稿本鐟︾粊鐗堢箾婢跺绀嬬�规洑鍗抽獮妯硷拷娑櫭鍧楁煟鎼淬劍娑ч柟璇х節瀹曟顭ㄩ崼鐔哄弳闂佺粯鏌ㄦ晶搴ㄦ儗濞嗘劒绻嗘い鎰╁灪閸ゅ洦銇勯姀鈩冪濠殿噯鎷烽梺鐐藉劜閸撴艾危闁秵鈷掑ù锝呮啞閸熺偤鏌涢妸褎鏆╃紒杈╁仦缁绘繈宕掑鍕啎婵＄偑鍊栫敮鎺旓拷姘煎弮瀵煡骞栨担鍦弳闂佺粯娲栭崐鍦拷姘炬嫹
			if(fire.pb.shop.srv.market.MarketThread.getInstance().tryAdd(p))
				return;
			
			p.dispatch(stub);
			return;
		} catch (mkio.MarshalError e) {
			error = Kick.E_MARSHAL_EXCEPTION;
			//if(logger.isDebugEnabled())
				logger.error(new StringBuilder("Dispatch : error=E_MARSHAL_EXCEPTION ptype=")
											.append(this.ptype)	);
		} catch (Throwable e) {
			error = Kick.E_PROTOCOL_EXCEPTION;
			//if(logger.isDebugEnabled())
				logger.error(new StringBuilder("Dispatch : error=E_PROTOCOL_EXCEPTION ptype=")
											.append(this.ptype)	);
		}
		
		Kick kick = new Kick();
		kick.error = error;
		kick.action = Kick.A_DELAY_CLOSE;
		kick.linksid = this.linksid;
		kick.send(super.getConnection());
		
		logger.error(new StringBuilder("Kick User error=").append(error).append(" action=").append(Kick.A_DELAY_CLOSE).append(" linksid=").append(this.linksid)	);
		
	}

	@Override
	protected void process() {
		throw new UnsupportedOperationException();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 65541;

	public int getType() {
		return 65541;
	}

	public int linksid;
	public int userid;
	public int ptype;
	public com.locojoy.base.Octets pdata;

	public Dispatch() {
		pdata = new com.locojoy.base.Octets();
	}

	public Dispatch(int _linksid_, int _userid_, int _ptype_, com.locojoy.base.Octets _pdata_) {
		this.linksid = _linksid_;
		this.userid = _userid_;
		this.ptype = _ptype_;
		this.pdata = _pdata_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(linksid);
		_os_.marshal(userid);
		_os_.marshal(ptype);
		_os_.marshal(pdata);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		linksid = _os_.unmarshal_int();
		userid = _os_.unmarshal_int();
		ptype = _os_.unmarshal_int();
		pdata = _os_.unmarshal_Octets();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof Dispatch) {
			Dispatch _o_ = (Dispatch)_o1_;
			if (linksid != _o_.linksid) return false;
			if (userid != _o_.userid) return false;
			if (ptype != _o_.ptype) return false;
			if (!pdata.equals(_o_.pdata)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += linksid;
		_h_ += userid;
		_h_ += ptype;
		_h_ += pdata.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(linksid).append(",");
		_sb_.append(userid).append(",");
		_sb_.append(ptype).append(",");
		_sb_.append("B").append(pdata.size()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}
