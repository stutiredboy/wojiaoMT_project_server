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
				return;//婵犵數濮烽弫鍛婃叏閻戝锟藉倹绂掔�ｎ偅娅㈤梺鑺ッˇ顖炲汲闁秵鐓ラ柣鏃傜帛椤ュ绱撳鍜冭含妤犵偛鍟灒閻犲洩灏欑粣鐐寸節閻㈤潧孝閻庢稈鏅涢々濂稿Ω閳哄倵鎷洪梺鍦焾濞撮绮婚幘缁樼厵闁告劘灏欑粻濠氭煟閹垮啫澧存い銏☆殜瀹曠喖顢楅崒姘疄闂傚倸顭崑鍕洪敃鍌氳摕闁靛ň鏅涢悡婵嬫煛閸モ晛鏋嶇紒璇叉閵囧嫰骞囬崜浣荷戦柣蹇撻獜缁犳捇寮婚埄鍐╁闁告縿鍎涢妶鍚ゅ綊鎮崨顖滄殼闂佸湱顭堥敃銉ヮ嚗閸曨厺娌柛蹇曞帶閻撴洖鈹戦悩鍨毄闁稿鍋ゅ畷褰掑醇閺囩偟顔囬梺鍛婄缚閸庢娊鎯岄幘缁樼厽闁靛繒濮锋禒娑㈡煛閸℃鐭掗柡宀�鍠撶槐鎺楀閻樺磭浜梻浣规た閸樹粙銆冮崱妯尖攳濠电姴娲﹂崐鐑芥⒒閸喓鈼ュ瑙勬礋閹鎲撮崟顒傤槰閻熸粍婢橀崯鏉戯耿娓氾拷濮婃椽骞愭惔锝囩暤濠碘槅鍋呴悷褏鍒掗崼銉︽櫢濞寸姴顑嗛崐鐢告偡濞嗗繐顏紒锟介崘鈹夸簻闁靛鍎虫晶锔筋殽閻愯尙绠抽柨鐔告灮缂嶅棝宕抽锟藉顐ｇ節閸ャ劎鍘炬繝娈垮枟閸旀洟鏁撻懞銉︾鐎殿喗鐓￠弫鎾绘晸閿燂拷
			
			if(logger.isDebugEnabled())
				logger.debug(new StringBuilder("Recv : class=").append(p.getClass().getName()).append(" size=").append(octstram.size()));
			
			//闂傚倸鍊搁崐椋庢濮橆剦鐒藉┑鐘崇閳锋棃鏌涢弴銊ヤ航闁绘柨妫欐穱濠囶敍濮樸儱浠洪梺鑽ゅ枛閸嬪﹤顭囬妸鈺傜叆闁绘梻绮ˉ澶愭煟閿濆洤鍘存俊鎹愪含缁辨帡鎮╁畷鍥ｆ濡炪値鍋呯换鍫ュ箖閳╁啯鍎熼柕蹇婂墲椤旓拷
			if(fire.pb.scene.MapThread.getInstance().tryAdd(p,stub2))
				return;
			
			//婵犵數濮烽弫鍛婃叏閻戝锟藉倹绂掔�ｎ偅娅㈤梺鑺ッˇ顖炲汲闁秵鐓ラ柣鏃傜帛椤ュ绱撳鍜冭含妤犵偛鍟灒閻犲洩灏欑粣鐐烘⒑瑜版帒浜伴柛鎾寸懃椤曪絽鐣￠柇锔藉瘜闂侀潧鐗嗗Λ娑欐櫠椤掑倻纾兼い鏃囧亹鏁堝銈冨灪濡啯鎱ㄩ敓浠嬫煏閸繃顥戦柟宄邦煼濮婃椽宕ㄦ繝鍐槱闂佺顑呴幊妯挎＂濠电姴锕ら幏鎴﹀箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︺劌顪冮妶鍐ㄥ闁绘鎹囬悰顔跨疀閺囶亝瀚归柨婵嗛濞呮﹢鏌℃担鍓插剶闁哄本鐩崺鍕礃椤忓懎娅樻俊鐐�х�靛矂宕抽敐鍜佹綎濠电姵鑹剧壕鍏兼叏濮楀棗骞橀柕鍫亰濮婇缚銇愰幒婵囶棖闂佺绻戦敃銏ょ嵁閸愵喗鍊婚柦妯侯槸瀹撳棗鈹戦鐭亪宕崸妤�鍌ㄩ柨娑樺绾捐棄霉閿濆洦鍤�闁轰焦鍎抽埞鎴﹀灳閾忣偄鏋犻梺杞扮劍閹瑰洭骞婇悙鍝勎ㄧ憸澶婎瀶閵娾晜鐓熸い蹇撳濡茶櫣绱掓潏銊ユ诞鐎殿噮鍓涢幑鍕Ω閿旇棄鏋涚紓鍌氬�风粈渚�顢栭崨姝ゅ洭鏌嗗鍡樻闂佸搫鍊堕崐妤冪矓闂堟耽鐟邦煥閸曨厾鐓夐悗娈垮枟瑜板啴鍩㈡惔銊ョ閻庣數顭堥獮宥囩磽閸屾瑧鍔嶆い銊ユ缁瑩骞嬪顏呯洴椤㈡﹢濮�閻橀潧鎽嬮梻浣芥硶閸ｏ箓骞忛敓锟�
			if(EnterWorldThread.getInstance().tryAdd(p))
				return;
			//闂傚倸鍊搁崐鐑芥嚄閸洏锟戒焦绻濋崑鑺ョ洴瀹曠喖顢曠�ｎ偆鈽夐柍璇查叄楠炴ê鐣烽崶鈺傜�梻鍌欐祰濞夋洟宕伴幘瀛樺弿閻庨潧鎲￠崗婊堟煥閻斿墎鐭欐俊顐㈡嚇椤㈡洟濮�閳ユ剚妲遍梻浣告啞閸ㄧ數绱炴繝鍌滄殾妞ゆ帒瀚弲鎼佹煥閻曞倹瀚�
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
