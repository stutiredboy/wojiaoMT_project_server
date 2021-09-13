package fire.pb.ranklist;
import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

/** 金币排行榜
*/
public class GoldCoinRank implements Marshal {
	public int rank; // 排名 by changhao
	public int school; // 职业id
	public java.lang.String nickname; // 名字
	public int coincount; // 金币数量 by changhao

	public GoldCoinRank() {
		nickname = "";
	}

	public GoldCoinRank(int _rank_, int _school_, java.lang.String _nickname_, int _coincount_) {
		this.rank = _rank_;
		this.school = _school_;
		this.nickname = _nickname_;
		this.coincount = _coincount_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(rank);
		_os_.marshal(school);
		_os_.marshal(nickname, "UTF-16LE");
		_os_.marshal(coincount);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		rank = _os_.unmarshal_int();
		school = _os_.unmarshal_int();
		nickname = _os_.unmarshal_String("UTF-16LE");
		coincount = _os_.unmarshal_int();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GoldCoinRank) {
			GoldCoinRank _o_ = (GoldCoinRank)_o1_;
			if (rank != _o_.rank) return false;
			if (school != _o_.school) return false;
			if (!nickname.equals(_o_.nickname)) return false;
			if (coincount != _o_.coincount) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += rank;
		_h_ += school;
		_h_ += nickname.hashCode();
		_h_ += coincount;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(rank).append(",");
		_sb_.append(school).append(",");
		_sb_.append("T").append(nickname.length()).append(",");
		_sb_.append(coincount).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

}

