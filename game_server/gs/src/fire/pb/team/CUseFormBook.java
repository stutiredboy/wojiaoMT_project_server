
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CUseFormBook__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氱紓鍌欒兌閸嬫捇宕曢崘宸劷闁跨喓濮撮拑鐔兼煥濠靛棭妲告い顐㈡嚇閺屾洝绠涙繝鍐╃彇闂佸憡鏌ㄩ幗婊呮閹烘鍊锋い鎺炴嫹闁告柣鍊栭妵鍕敇閻樻彃骞嬮悗娈垮枛椤兘骞冮姀銈嗗亗閹艰揪缍嗛崬褰掓⒒娓氾拷閿熻姤绋戝畵鍡樼箾娴ｅ啿鍟犻弸鏃�銇勯幘璺盒ョ痪鎹愭閵嗘帒顫濋濠冩暰闁诲孩淇洪～澶屾崲濠靛顫呴柨婵嗘閵嗘劙姊哄ú璇插箹妞わ妇鏁婚悰顔跨疀濞戞瑥锟藉鏌ら幁鎺戝姎闁告搩鍓熷娲川婵犲嫧妲堥梺鎸庢磸閸婃繈銆侀弮鍫濋唶闁哄洨鍟块幏缁樼箾鏉堝墽鍒伴柟璇х節瀹曨垶鎮欑�靛摜顔曢柣鐘叉厂閸涱垱娈奸柣搴ゎ潐濞叉﹢宕归崹顔炬殾闁绘梻鈷堥弫宥嗘叏濡鏁剧紒閬嶄憾閺岋絾鎯旈敍鍕殯闂佺閰ｆ禍鍫曠嵁婵犲啫绶為柟閭﹀墰閸濇绻涚�电孝妞ゆ垵妫濋幃锟犳偄闂�鎰畾濡炪倖鐗楁笟妤呭磿閵夆晜鐓曢柕鍫濇媼閸庢垿鏌ㄩ悢鍑ゆ嫹閻曚焦缍堥梺璇″枛閻栫厧鐣烽弴銏″仺缂佸鍎婚幗鏇㈡⒑閹稿海绠撻柟鍙夛耿瀵噣宕奸悢鍛婎仧濠电偛顕慨鎾敄閸℃稑鐤炬繝闈涙储娴滄粓鐓崶銊﹀碍妞ゅ浚鍋婇弻锟犲幢椤撶姷鏆ら梺鍝勭灱閸犳捇鏁撻懞銉р檨妞ゎ厼娲︽穱濠囧炊椤掍胶鍘搁梺璺ㄥ枙婵倗绮嬮幒鏃撴嫹閿濆骸浜為柛姗�浜跺娲濞戣鲸顎嗙紓浣藉紦缁瑥鐣峰┑鍡忔瀻闁瑰濮烽敍婊堟⒑闂堟侗鐒鹃柛搴㈡そ閹繝宕楅崗鐓庡伎婵犵數濮撮崯顖炲Φ濠靛牞鎷风憴鍕闁稿锕ら悾鐑芥偄绾拌鲸鏅ｆ繝銏ｆ硾閼活垶鍩㈤崼銉︾厸閻忕偛澧藉ú瀵革拷娈垮櫘閸撶喎鐣风粙璇炬棃鏁撻挊澶樺殨闁哄顕抽弮鍫熷亹闂傚牊绋愮划鍫曟⒑閹稿孩澶勫ù婊勭矒閹儳鐣￠柇锔藉缓闂佽法鍠曟慨銈嗙┍婵犲洤绠瑰ù锝呭濞煎﹪姊洪弬銉︽珔闁哥噥鍨伴…鍧楀箣濠靛啯鏂�闂佹寧绋戠�氼剚绂嶆總鍛婄厱濠电姴鍟版晶顏堟偂閵堝鐓涚�广儱娴锋禒婊勭箾閹寸們姘跺几鎼淬劍鐓欓柟纰卞幖閻忥繝鎮楀鎰佹綈闁逛究鍔岃灒闁绘挸绨兼竟鏇㈡煟鎼淬垻鍟查柟鍑ゆ嫹
 * @author changhao
 *
 */
public class CUseFormBook extends __CUseFormBook__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		for (fire.pb.team.UseFormBook book : listbook)
		{
			new PUseFormationItem(roleid, formationid, book.bookid, book.num).submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794553;

	public int getType() {
		return 794553;
	}

	public int formationid; // 光环ID by changhao
	public java.util.LinkedList<fire.pb.team.UseFormBook> listbook; // 使用的光环书 by changhao

	public CUseFormBook() {
		listbook = new java.util.LinkedList<fire.pb.team.UseFormBook>();
	}

	public CUseFormBook(int _formationid_, java.util.LinkedList<fire.pb.team.UseFormBook> _listbook_) {
		this.formationid = _formationid_;
		this.listbook = _listbook_;
	}

	public final boolean _validator_() {
		for (fire.pb.team.UseFormBook _v_ : listbook)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(formationid);
		_os_.compact_uint32(listbook.size());
		for (fire.pb.team.UseFormBook _v_ : listbook) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		formationid = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.team.UseFormBook _v_ = new fire.pb.team.UseFormBook();
			_v_.unmarshal(_os_);
			listbook.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CUseFormBook) {
			CUseFormBook _o_ = (CUseFormBook)_o1_;
			if (formationid != _o_.formationid) return false;
			if (!listbook.equals(_o_.listbook)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += formationid;
		_h_ += listbook.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(formationid).append(",");
		_sb_.append(listbook).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

