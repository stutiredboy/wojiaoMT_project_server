
package fire.pb.shop;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SMarketSearchResult__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SMarketSearchResult extends __SMarketSearchResult__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810663;

	public int getType() {
		return 810663;
	}

	public int browsetype; // �������  1 ��Ҫ���� 2��ʾ��Ʒ
	public int firstno; // һ��ҳǩ����
	public int twono; // ����ҳǩ����
	public java.util.ArrayList<Integer> threeno; // ����ҳǩ����
	public int currpage; // ��ǰҳ
	public int totalpage; // ��ҳ��
	public java.util.ArrayList<fire.pb.shop.MarketGoods> goodslist; // �鿴��Ʒ�б�

	public SMarketSearchResult() {
		threeno = new java.util.ArrayList<Integer>();
		goodslist = new java.util.ArrayList<fire.pb.shop.MarketGoods>();
	}

	public SMarketSearchResult(int _browsetype_, int _firstno_, int _twono_, java.util.ArrayList<Integer> _threeno_, int _currpage_, int _totalpage_, java.util.ArrayList<fire.pb.shop.MarketGoods> _goodslist_) {
		this.browsetype = _browsetype_;
		this.firstno = _firstno_;
		this.twono = _twono_;
		this.threeno = _threeno_;
		this.currpage = _currpage_;
		this.totalpage = _totalpage_;
		this.goodslist = _goodslist_;
	}

	public final boolean _validator_() {
		if (browsetype < 1 || browsetype > 2) return false;
		if (firstno < 1 || firstno > 20) return false;
		if (currpage < 1) return false;
		if (totalpage < 1) return false;
		for (fire.pb.shop.MarketGoods _v_ : goodslist)
			if (!_v_._validator_()) return false;
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
		_os_.marshal(currpage);
		_os_.marshal(totalpage);
		_os_.compact_uint32(goodslist.size());
		for (fire.pb.shop.MarketGoods _v_ : goodslist) {
			_os_.marshal(_v_);
		}
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
		currpage = _os_.unmarshal_int();
		totalpage = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.shop.MarketGoods _v_ = new fire.pb.shop.MarketGoods();
			_v_.unmarshal(_os_);
			goodslist.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SMarketSearchResult) {
			SMarketSearchResult _o_ = (SMarketSearchResult)_o1_;
			if (browsetype != _o_.browsetype) return false;
			if (firstno != _o_.firstno) return false;
			if (twono != _o_.twono) return false;
			if (!threeno.equals(_o_.threeno)) return false;
			if (currpage != _o_.currpage) return false;
			if (totalpage != _o_.totalpage) return false;
			if (!goodslist.equals(_o_.goodslist)) return false;
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
		_h_ += currpage;
		_h_ += totalpage;
		_h_ += goodslist.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(browsetype).append(",");
		_sb_.append(firstno).append(",");
		_sb_.append(twono).append(",");
		_sb_.append(threeno).append(",");
		_sb_.append(currpage).append(",");
		_sb_.append(totalpage).append(",");
		_sb_.append(goodslist).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

