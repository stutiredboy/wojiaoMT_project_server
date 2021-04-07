
package fire.pb.skill;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CUpdateInborn__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CUpdateInborn extends __CUpdateInborn__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleId <= 0)
			return;
		final int apId = this.id;
		if(apId <= 0) return;
		if(flag == 0){
			new mkdb.Procedure(){
				@Override
				protected boolean process(){
					SkillRole srole = new SkillRole(roleId);
					srole.updateInbornWithValid(apId);
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠煕濮橆厽銇濆┑陇鍩栧鍕拷锝庝簷濡叉劙姊绘笟锟藉褑澧濋梺鍝勬噺閻╊垶骞忛幋锔藉亜閻忓繋鐒﹂弬锟介梻浣虹帛閿氱�殿喛鍩栧鍕礋椤栨稓鍘遍柣搴秵閸嬪棛绮婚悙鐑樼厸閻忕偟鏅牎濠电偟鈷堟禍顏堢嵁瀹ュ鏁婇悹鎭掑妿瀹曞爼姊婚崒娆戭槮闁硅姤绮撳畷鎶芥晝閸屾氨顔嗘俊鐐差儏濞撮澹曟禒瀣厱閻忕偞宕樻竟姗�鏌ㄩ悢鐑樻珪闁稿繑锕㈤獮濠偽旈崨顓㈠敹闂佸搫娲ㄩ崑娑㈠磻瀹ュ鍋℃繝濠傚椤ュ牓鏌ｅ☉鍗炴珝鐎规洘锕㈤崺锟犲磼濮橆剙韦闂傚倷鐒︾�笛呮崲閸屾粍宕查柟瀵稿閹峰嘲顫濋鍌溞ㄩ梺鍝勬湰閻╊垶寮崒婊勫珰闁圭粯甯為鎰攽閻愬樊鍤熷┑顔炬暩閸掓帒鐣濋崟顐ゅ幋闂佺鎻�靛矂寮繝鍥ㄧ厾婵炴潙顑嗗▍鍥ㄣ亜閺冿拷鐢帟鐏冮梺缁橈耿濞佳勭閿曞倹鍋ㄦい鏍ュ�楃弧锟介梺缁樹緱閸ｏ綁鐛幒鎳虫棃鏁撴禒瀣闁规儼濮ら悡蹇撯攽閻樿尙绠绘俊缁㈠櫍閺屸剝寰勬繝鍐ㄦ殘缂備胶绮换鍌炲煝閹捐鍨傛い鏃傛櫕瑜版煡姊绘担鐑樺殌闁搞倖鐗犻獮蹇涙晸閿燂拷?
					mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PRoleZongheRankProc(roleId));
					return true;
				}
			}.submit();
		}else{
			new PInbornWithValidProc(roleId, apId).submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800445;

	public int getType() {
		return 800445;
	}

	public int id;
	public byte flag; // 0默认方式  1=一键

	public CUpdateInborn() {
	}

	public CUpdateInborn(int _id_, byte _flag_) {
		this.id = _id_;
		this.flag = _flag_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		_os_.marshal(flag);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_int();
		flag = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CUpdateInborn) {
			CUpdateInborn _o_ = (CUpdateInborn)_o1_;
			if (id != _o_.id) return false;
			if (flag != _o_.flag) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += id;
		_h_ += (int)flag;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(flag).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CUpdateInborn _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = id - _o_.id;
		if (0 != _c_) return _c_;
		_c_ = flag - _o_.flag;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

