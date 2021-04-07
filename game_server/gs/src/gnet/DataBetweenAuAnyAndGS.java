
package gnet;
import org.apache.log4j.Logger;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __DataBetweenAuAnyAndGS__ extends mkio.Protocol { }

/** qtype:	(8001)GS_TO_AuAny更新玩家的服务器角色信息,此时info是玩家角色信息
				(10001)GS_TO_AuAny代理http请求,此时info是http请求地址及参数
				(10002)AuAny_TO_GS代理http请求的返回结果
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class DataBetweenAuAnyAndGS extends __DataBetweenAuAnyAndGS__ {
	private static Logger logger=Logger.getLogger("RECHARGE");
	@Override
	protected void process() {
		if(this.flag != AuAny_TO_GS) {
			logger.error("DataBetweenAuAnyAndGS.flag:" + this.flag + ",isnt AuAny_TO_GS!");
			return;
		}
		if(qtype==10002) {
			try {
				String infos = new String(info.getBytes(), "ISO-8859-1");//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍幉鎼佹偋閸繄鐟查梺绋款儏椤戝棛鎹㈠┑鍥╃瘈闁稿本绮岄·锟介梻浣侯焾椤戝懘藝閹殿喗宕叉繝闈涙川缁★拷闂佺鏈崙瑙勫閿熶粙姊绘担鍝ワ紞缂侇噮鍨伴～蹇旂節濮橆厽娅㈤梺鑺ッˇ閬嶆偩椤撱垺鐓曢幖娣妺閹查箖鏌熼銊ュ枤閻撱儵鏌涜箛鏇炐ｆ俊鐐扮矙瀵偊骞囬鐐电獮闁诲函缍嗛崜娆撶嵁閸儲鈷掑ù锝呮啞閹牓鏌涢悤浣哥仸鐎规洜顢婇妵鎰板箳閹存繂浜舵繝鐢靛Т閿曘倝骞婇幇顔碱棜濠靛倻顭堢痪褔鏌涢锝団槈濠德ゆ硶缁辨帡鎮╃粵纭咃拷鍧楁煛瀹�锟介崰鏍箠閻樻椿鏁嗛柨鐔剁矙閵嗗倹绺介崨濠勫幍閻庣懓瀚晶妤呭闯娴犲鐓欓柛娆忣槹鐏忥妇锟借娲滈崰鏍�佸Δ浣瑰闁绘垶锕╁鈺呮⒒閸屾艾锟芥悂宕愭搴ｇ焼濞撴熬鎷锋鐐差樀閺佹捇鎮╅懠鑸垫啺闂備焦瀵х换鍌炈囬婊呯焼濠㈣埖鍔栭崐鍫曟煟閹扮増娑уù婊堢畺閺屾稑鈻庤箛鏇狀啋闂佸搫鐭夌紞浣割嚕椤曪拷瀹曟儼顦查柟顖滃仱濮婂搫效閸パ嶆嫹瑜旈獮蹇涙倻閼恒儮鎷绘繛杈剧到閹诧繝宕悙鐑樼厱闁归偊鍓﹂悡鍏碱殽閻愯尙绠婚柡浣规崌閺佹捇鏁撻敓锟�?濠电姷鏁告慨鐢割敊閺嶎厼绐楁俊銈呮噳閿熸枻绠撳畷濂告偄娓氼垱閿ゆ俊鐐�栫敮鎺旓拷姘煎墴閹苯螖閸涱喚鍙嗛梺缁樻濞咃綁銆呴悹楣冩⒒閸屾艾锟芥悂宕愰悜鑺ュ殑闁割偅娲栫壕鍧楁煟閵忋埄鐒鹃柣銈囧亾缁绘繈妫冨☉鍗炲壃闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾鍞梺闈涳紡閸涱厼绠戦梻浣藉吹閸犳劗鍒掑畝锟介幑銏狀潨閿熶粙鎮伴璺ㄧ杸婵ǜ鍎板Ч妤呮⒑閸︻厼鍔嬮柟绋挎啞缁傚秴顭ㄩ崼鐔叉嫼闂佺粯鎸哥�垫帒顭囬悢鍏肩厱濠电姴鍠氬▓婊咃拷瑙勬磸閸ㄤ粙銆佸Δ浣瑰闁惧繗顕栭崯搴ㄦ⒑閸濆嫷妲搁柣妤�绻樺畷鎴﹀箻鐠佽瀚规慨妯煎亾鐎氾拷?
				logger.debug("DataBetweenAuAnyAndGS.user:" + userid + ",info:" + infos);
				//TODO:
				// 濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏灪閸嬨倝鏌曟繛褍鍟悘濠囨倵閻у憡瀚归梺鍛婃礀閻忔岸寮查悙鐑樷拺闁硅偐鍋涢崝姗�鏌涢弬璺ㄐ㈤柍璇茬Ч閹晝绱掑Ο鐓庡箥缂傚倷绀侀鍡欙拷绗涘洤绠查柨婵嗩槹閻撳啰绱撴担鑲℃垿鍩涢幇鐗堢厪闁搞儜鍐句純濡ょ姷鍋為…鍥箲閸曨垰浼犻柛鏇ㄥ亽濡﹤鈹戦悩鍨毄闁稿鐩幆鍥ㄥ閺夋垹锛欓梺鍝勬储閸ㄥ綊鎮￠垾鎰佺唵闁兼悂娼ф慨鍥╃磼閻樺樊鐓奸柡宀�鍠愰敍鎰媴娓氼垱袦闂備礁鎲￠幑鍥ь焽瑜戦悘鍐⒑缂佹﹫鑰挎繛浣冲嫮顩锋繝濠傛噽绾捐偐绱撴担濮戭亝鎱ㄥ鍡愪簻闁靛繆锟藉啿鎽垫繝纰夌磿閸忔ɑ淇婇柨瀣劅闁靛繆妲呭Λ鍐倵鐟欏嫭绀堥柛鐘崇墪閻ｇ柉銇愰幒婵囨櫇濡炪値鍋掗崢钘壩熸繝鍥ㄢ拻闁稿本鑹鹃敓鐣屽厴閹虫宕奸弴鐐嶃儵鎮楅敐搴℃灈缂佺媭鍨堕弻銊╂偆閸屾稑顏�?,闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽銊х煁闁哄棙绮撻弻锝夊棘鐠恒劍顔堥梺鍝勵儐閻楁鎹㈠☉銏犵婵炲棗绻掓禒鑲╃磽娴ｅ搫校闁绘顨嗙粚杈ㄧ節閸ヮ灛褔鏌涢弴銊ュ箹濠德ゅГ缁绘稓锟芥稒锚濞堢娀鏌涙繝鍐⒈闁瑰箍鍨归埥澶愬閻樻鍚呴梻浣虹帛閸旀寮幖浣瑰亗闁绘绮埛鎴︽煟濮橆剛鎽犻悗姘愁潐缁绘稓锟界數顭堝瓭濡炪倖鍨靛Λ婵嬪箖閿熺姵鍋勯柛蹇氬亹閸樻捇姊洪崨濠勭畵閻庢凹鍓熷鎼佸Χ婢跺鍘介梺鍦劋椤ㄥ牓鎮惧ú顏呯厸閻忕偛澧介埥澶愭煃鐠囪尙肖闁归濞�瀹曪絾寰勬繝搴⑿熼梻鍌欒兌缁垳鏁幒妞伙拷锕傛倻閽樺鎽曢梺璺ㄥ枔婵绮堢�ｎ偁浜滈柟鎵虫櫅閿熻姤顨婇、娆愮節閸ャ劎鍘介梺闈涚箚閺呮盯鎮橀悩鍏呯箚妞ゆ劧缍嗗▓婊堟煃閵夘垰顩柟鐟板婵℃悂鏁冮敓鐣屽椤栫偞鈷戦柛娑橈功缁犳捇鎮楀鑸垫暠閻庨潧銈搁弫鎾寸鐎ｎ偀鎷绘繛杈剧悼閻℃棃宕甸崘顔界厱闁挎繂楠搁悘锔筋殽閻愯尙绠婚柡浣规崌閺佹捇鏁撻敓锟�
			  	xbean.User xuser = xtable.User.select(userid);
				if(xuser == null || xuser.getIdlist().isEmpty())
					return;
				long roleid = xuser.getIdlist().get(0);
				new fire.pb.activity.exchangecode.PExchangeCodeAuReturn(roleid, infos).submit();
			} catch(Exception e) {
				logger.error("LocojoyPlat.httpRequestFromGS:", e);
			}
		} else {
			new fire.pb.fushi.PReceiveDataFromAuany(this).submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 8920;

	public int getType() {
		return 8920;
	}

	public final static int AuAny_TO_GS = 1;
	public final static int GS_TO_AuAny = 2;

	public int userid;
	public int qtype;
	public byte flag;
	public com.locojoy.base.Octets info;
	public int reserved;

	public DataBetweenAuAnyAndGS() {
		info = new com.locojoy.base.Octets();
	}

	public DataBetweenAuAnyAndGS(int _userid_, int _qtype_, byte _flag_, com.locojoy.base.Octets _info_, int _reserved_) {
		this.userid = _userid_;
		this.qtype = _qtype_;
		this.flag = _flag_;
		this.info = _info_;
		this.reserved = _reserved_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(userid);
		_os_.marshal(qtype);
		_os_.marshal(flag);
		_os_.marshal(info);
		_os_.marshal(reserved);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		userid = _os_.unmarshal_int();
		qtype = _os_.unmarshal_int();
		flag = _os_.unmarshal_byte();
		info = _os_.unmarshal_Octets();
		reserved = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof DataBetweenAuAnyAndGS) {
			DataBetweenAuAnyAndGS _o_ = (DataBetweenAuAnyAndGS)_o1_;
			if (userid != _o_.userid) return false;
			if (qtype != _o_.qtype) return false;
			if (flag != _o_.flag) return false;
			if (!info.equals(_o_.info)) return false;
			if (reserved != _o_.reserved) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += userid;
		_h_ += qtype;
		_h_ += (int)flag;
		_h_ += info.hashCode();
		_h_ += reserved;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(userid).append(",");
		_sb_.append(qtype).append(",");
		_sb_.append(flag).append(",");
		_sb_.append("B").append(info.size()).append(",");
		_sb_.append(reserved).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

