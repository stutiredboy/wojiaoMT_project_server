
package fire.pb.shop;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CMarketBrowse__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CMarketBrowse extends __CMarketBrowse__ {
	@Override
	protected void process() {
		// protocol handle
		
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		
		new mkdb.Procedure() {
			
			@Override
			protected boolean process() throws Exception {
				long beginTime = System.currentTimeMillis();
				
				fire.pb.shop.srv.market.IMarket market = fire.pb.shop.srv.market.MarketManager.getInstance();
				fire.pb.shop.srv.market.proxy.MarketTransactionProxy handler = new fire.pb.shop.srv.market.proxy.MarketTransactionProxy(market);
				fire.pb.shop.srv.market.IMarket proxy = (fire.pb.shop.srv.market.IMarket) handler.getProxy();
				proxy.marketBrowse(roleId, firstno, twono, threeno,
						itemtype, limitmin, limitmax, browsetype, currpage, pricesort, issearch);
				
				long endTime = System.currentTimeMillis();
				long excuteTime = endTime - beginTime;
				if (excuteTime > 20) {
					StringBuilder sbd = new StringBuilder();
					sbd.append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備胶濮锋繛锟介柡宀�鍠栭獮鎴﹀箛闂堟稒顔勯梺鐟板悑濞兼瑩鏁冮鍫濊摕闁靛牆娲ら弸鍫ユ煕濡ゅ啫浠滄い顐亰濮婂搫煤鐠囨彃绠洪梺鍦嚀濞差厼顕ｆ繝姘労闁告劑鍔庣粣鐐烘煟鎼搭垳绉靛ù婊呭仦缁傛帗绺介崨濞炬嫼闂佸憡绻傜�氼參鏁嶉弮鍌滅＜闁绘娅曞畷宀�锟芥鍠栭…鐑藉极閹版澘宸濋柛灞剧矊閺嬪酣鏌嶇拠鏌ュ弰闁诡喗鐟╅、鏍嚍閵夈儳妯佺紓鍌氬�搁崐鐑芥嚄閸洘鎯為幖娣妼閸屻劌鈹戦崒婊庣劸缂佺姷濞�閺岀喖骞嶉纰辨毉闂佺顑愭禍顏堝蓟閵娾晜鍋勭紓浣癸供濡嫰姊虹�圭媭娼愰柛銊ユ健閵嗕礁鈻庨幘鏉戝壒濡炪倖鍔﹂崑鍌炴焽椤栨粣鎷风憴鍕８闁稿孩濞婇弫鎾诲棘閵堝洨校闂佸憡鎸荤粙鎾跺垝閸喓绡�闁告洝鍩栫�氬綊鏌ｈ閹诧紕锟芥艾缍婂娲川婵犲啫顦╅梺绋跨箲閿曘垽鐛箛鏇犵＜婵☆垵鍋愰鏇㈡⒑閻熸澘鈷旀い銉﹀姈缁旂喎螣閼姐倗顔曢柣蹇曞仜閸婃悂鏁撻懞銉у⒌鐎殿喗鐓″畷濂稿即閵婏附娅栭梻浣虹帛閸旀洟顢氶銏犲偍闁汇垹鎲￠埛鎴︽煕濞戞﹫鍔熼柍钘夘樀閺屻劑寮村Ο鍝勫Е閻庤娲橀崝娆撶嵁閸ヮ剦鏁嬮柛鈩兠鍫曟煟閻斿摜鎳冮悗姘煎幘缁氨鎹勯妸褏锛濋悗骞垮劚鐎氼噣藝閿曞倹鐓熼柨婵嗩樈濡垹绱掗鐣屾噮闁归濞�閹瑩顢楁担鍙夊闂備胶鎳撻崲鏌ュ箠濡警娼栫憸鐗堝笒缁犳稒銇勯弮锟介崕鎶剿囬埡鍛拻闁稿本鑹鹃敓鑺ユ倐瀹曟劖顦版惔銏╁仺濠殿喗锕╅崜锕傛倿閻ｅ本鍠愰柡鍐ㄧ墕閻忔娊鏌ㄩ弴鐐蹭簽闁轰礁娲弻鏇＄疀婵犲喚锟藉棝鏌熺粙鍨殻婵﹥妞藉畷銊︾節閸愵煈妲遍梻浣规偠閸斿娆㈠顒傛殾闁割偅娲﹂弫鍌滐拷骞垮劚濡矂寮稿畝鍕拻闁稿本鐟чˇ锕傛煙绾板崬浜為柟顕呭櫍椤㈡洟鏁冮敓鐣岀矆婢舵劖鐓欓弶鍫濆⒔閻ｉ亶鏌＄�ｂ晝绐旈柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻锟犲川椤旇棄锟芥劙鏌＄仦璇插闁诡喓鍊濆畷鎺戔槈濮楀棔绱�?").append(excuteTime).append("婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ姀鐘差棌闁轰礁锕弻鈥愁吋鎼粹�崇闂傚倸鍋嗛崹閬嶅Φ閸曨垰鍐�闁靛ě鍛帓缂傚倷绶ら幏宄扳攽閻樺弶澶勯柣鎾存礋閺屽秹鍩℃担鍛婃闂佸疇妫勯ˇ閬嶆儉椤忓牆绠氱憸婊堟偂婵傚憡鐓涢悘鐐插⒔濞叉挳鏌涢埡浣割伃鐎规洘锕㈡俊鎼佸Ψ閿斿彞绨界紓鍌氬�搁崐鎼佸磹閸濄儳鐭撻柣銏犳啞閸嬪鏌ｅΟ娆惧殭闁藉啰鍠栭弻鏇熺箾閻愵剚鐝曢梺绋款儏濡繈寮诲☉姘勃闁告挆锟藉Σ鍫濐渻閵堝懘鐛滈柟鍑ゆ嫹");
					fire.pb.shop.srv.market.MarketManager.LOG.error(sbd.toString());
				}
				return true;
			}
			
		}.submit();
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810639;

	public int getType() {
		return 810639;
	}

	public int browsetype; // 浏览类型  1 我要购买 2公示物品
	public int firstno; // 一级页签类型
	public int twono; // 二级页签类型
	public java.util.ArrayList<Integer> threeno; // 三级页签类型
	public int itemtype; // 物品类型
	public int limitmin; // 条件下限
	public int limitmax; // 条件上限
	public int currpage; // 当前页
	public int pricesort; // 价格排序  1升序  2降序
	public int issearch; // 0筛选 1搜索

	public CMarketBrowse() {
		threeno = new java.util.ArrayList<Integer>();
	}

	public CMarketBrowse(int _browsetype_, int _firstno_, int _twono_, java.util.ArrayList<Integer> _threeno_, int _itemtype_, int _limitmin_, int _limitmax_, int _currpage_, int _pricesort_, int _issearch_) {
		this.browsetype = _browsetype_;
		this.firstno = _firstno_;
		this.twono = _twono_;
		this.threeno = _threeno_;
		this.itemtype = _itemtype_;
		this.limitmin = _limitmin_;
		this.limitmax = _limitmax_;
		this.currpage = _currpage_;
		this.pricesort = _pricesort_;
		this.issearch = _issearch_;
	}

	public final boolean _validator_() {
		if (browsetype < 1 || browsetype > 2) return false;
		if (firstno < 1 || firstno > 20) return false;
		if (currpage < 1) return false;
		if (pricesort < 1 || pricesort > 2) return false;
		if (issearch < 0 || issearch > 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(browsetype);
		_os_.marshal(firstno);
		_os_.marshal(twono);
		_os_.compact_uint32(threeno.size());
		for (Integer _v_ : threeno) {
			_os_.marshal(_v_);
		}
		_os_.marshal(itemtype);
		_os_.marshal(limitmin);
		_os_.marshal(limitmax);
		_os_.marshal(currpage);
		_os_.marshal(pricesort);
		_os_.marshal(issearch);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		browsetype = _os_.unmarshal_int();
		firstno = _os_.unmarshal_int();
		twono = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			int _v_;
			_v_ = _os_.unmarshal_int();
			threeno.add(_v_);
		}
		itemtype = _os_.unmarshal_int();
		limitmin = _os_.unmarshal_int();
		limitmax = _os_.unmarshal_int();
		currpage = _os_.unmarshal_int();
		pricesort = _os_.unmarshal_int();
		issearch = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CMarketBrowse) {
			CMarketBrowse _o_ = (CMarketBrowse)_o1_;
			if (browsetype != _o_.browsetype) return false;
			if (firstno != _o_.firstno) return false;
			if (twono != _o_.twono) return false;
			if (!threeno.equals(_o_.threeno)) return false;
			if (itemtype != _o_.itemtype) return false;
			if (limitmin != _o_.limitmin) return false;
			if (limitmax != _o_.limitmax) return false;
			if (currpage != _o_.currpage) return false;
			if (pricesort != _o_.pricesort) return false;
			if (issearch != _o_.issearch) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += browsetype;
		_h_ += firstno;
		_h_ += twono;
		_h_ += threeno.hashCode();
		_h_ += itemtype;
		_h_ += limitmin;
		_h_ += limitmax;
		_h_ += currpage;
		_h_ += pricesort;
		_h_ += issearch;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(browsetype).append(",");
		_sb_.append(firstno).append(",");
		_sb_.append(twono).append(",");
		_sb_.append(threeno).append(",");
		_sb_.append(itemtype).append(",");
		_sb_.append(limitmin).append(",");
		_sb_.append(limitmax).append(",");
		_sb_.append(currpage).append(",");
		_sb_.append(pricesort).append(",");
		_sb_.append(issearch).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

