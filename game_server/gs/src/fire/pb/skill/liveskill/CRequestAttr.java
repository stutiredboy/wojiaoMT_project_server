
package fire.pb.skill.liveskill;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestAttr__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞稿墲瀵板嫮锟斤綆浜濋鍛攽閻愬弶鈻曞ù婊冪埣瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎲＄换鍐�冩繝鍌ゆ綎缂備焦顭囬悷褰掓煕閵夋垵鍠氬鑽ょ磽閸屾瑧顦︽い锕備憾瀵偆鎷犻懠顒佹闂佸搫娲㈤崹鍦不閿濆棛绡�闁靛骏绱曠粻鎾剁磽瀹ュ拑宸ラ柣锝呭槻铻栭柛娑卞幘椤ρ囨⒑閸忚偐銈撮柡鍛箞閸┿垼绠涘☉娆屾嫽婵炶揪缍�婵倝藟婢舵劖鐓曢柣鏃囨硾瀹撳棛锟借娲戦崡鍐差嚕娴犲鏁囬柣鎰煐閹蹭即姊绘担铏瑰笡闁哄被鍔戝畷銉э拷锝庡枟閸婂灝霉閻樺樊鍎愰柣鎾卞劦閺岋繝宕橀妸锕�顦╃紒缁㈠幖閻栧ジ寮婚埄鍐╁闁革富鍘奸埛灞解攽椤旂》鏀绘俊鐐舵閻ｇ兘顢曢敃锟界粈瀣亜閹伴潧浜楅柟顕嗙秮濮婄粯鎷呮笟顖滃姼闂佹寧娲忛崐鏇⑩�﹂崶顒佹櫢闁绘﹢娼х粊锕傛⒑閸涘﹤濮﹂柣鎾崇墕椤洭濡搁埡鍌滃弳闂佺粯鏌ㄦ晶搴ㄦ儗濞嗘劦娈介柣鎰絻閺嗘瑩鏌嶇拠鏌ュ弰妤犵偞锕㈤獮鏍敇閻曚焦顥堟繝鐢靛Х閺佹悂宕戦悙鍝勫瀭闁割偅娲忛敓钘夊暣瀹曞崬鈽夊Ο纰辨Ч闂備浇娉曢崳锕傚箯閿燂拷?? by changhao
 */
public class CRequestAttr extends __CRequestAttr__ {
	private static Logger logger = Logger.getLogger("ITEM");
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestattr = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				xbean.Properties prop = xtable.Properties.select(roleid);
				if (prop == null)
				{
					return false;
				}
				
				fire.pb.attr.SRefreshRoleData refreshdata = new fire.pb.attr.SRefreshRoleData();
				if (attrid.contains(fire.pb.attr.AttrType.ENERGY))
				{
					int energy = prop.getEnergy();
					refreshdata.datas.put( fire.pb.attr.AttrType.ENERGY, (float)energy);					
				}
				logger.error("------------濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁惧墽绮换娑㈠箣濞嗗繒浠鹃梺绋款儍閸婃繈寮婚弴鐔虹鐟滃秹宕锔藉�跺┑鐘叉处椤ュ﹥銇勯幇鈺佺仾濠㈣泛瀚伴弻鐔煎川婵犲啫鍞夐悗娈垮枤椤牓顢橀崗鐓庣窞閻庯綆鍓欏铏節閻㈤潧鈻堟繛浣冲吘娑樷枎閹惧秴顦甸幃娆戯拷闈涙憸椤旀洟姊洪崨濠佺繁闁搞劋鍗抽崺銏ゅ醇閵夛妇鍘靛銈嗘閸嬫劗绮旈悜姗嗘闁绘劖澹嗙粣鏃�顨ラ悙鏉戞诞妤犵偛顑呴埞鎴﹀箛椤曞棙瀚归弶鍫涘妿缁★拷闂佹眹鍨藉褎绂掑鍫熺厽妞ゆ挾鍋熸晶娑氱磼閸屾氨效妞ゃ垺妫冨畷鐓庘攽婵犲啯鍟洪梻鍌欑劍鐎笛呮崲閸岀倛鍥敍濠婂懍绗夊┑鐐村灟閸ㄦ椽鎮￠悩缁樼厵闂傚倸顕崝宥嗙箾閹冲嘲瀚ㄦ禍婊堢叓閸ャ儱鍔滈悗姘炬嫹??-闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗙墛閵嗗啴鏌ｉ幒鎴含闁哄本绋戦埥澶娾枎閹邦喚鈻忕紓鍌欒兌婵參宕归崼鏇炶摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹?------------------"+refreshdata.datas);
				mkdb.Procedure.psendWhileCommit(roleid, refreshdata);					
				
				return true;
			}
		};
		
		requestattr.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800530;

	public int getType() {
		return 800530;
	}

	public java.util.LinkedList<Integer> attrid;

	public CRequestAttr() {
		attrid = new java.util.LinkedList<Integer>();
	}

	public CRequestAttr(java.util.LinkedList<Integer> _attrid_) {
		this.attrid = _attrid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(attrid.size());
		for (Integer _v_ : attrid) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			int _v_;
			_v_ = _os_.unmarshal_int();
			attrid.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestAttr) {
			CRequestAttr _o_ = (CRequestAttr)_o1_;
			if (!attrid.equals(_o_.attrid)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += attrid.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(attrid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

