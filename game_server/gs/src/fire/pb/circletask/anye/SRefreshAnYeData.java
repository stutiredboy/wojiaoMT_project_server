
package fire.pb.circletask.anye;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SRefreshAnYeData__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SRefreshAnYeData extends __SRefreshAnYeData__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 807454;

	public int getType() {
		return 807454;
	}

	public int times; // �����ۼƴ���
	public int renxins; // �Ѿ����Դ���
	public java.util.ArrayList<fire.pb.circletask.anye.AnYeTask> anyetasks; // ������Ϣ����½ʱ��ȫ��10�����Ժ�ÿ�ο���һ�������ܼ���
	public long awardexp; // ��������
	public long awardsilver; // ��������
	public long swardgold; // �������
	public long jointime; // �״βμ�ʱ��
	public int legendpos; // ��ǰ���ڴ�˵��������ǳ���0~7����ʾ��Χ�����ֵ������ǰû�д�˵����

	public SRefreshAnYeData() {
		anyetasks = new java.util.ArrayList<fire.pb.circletask.anye.AnYeTask>();
	}

	public SRefreshAnYeData(int _times_, int _renxins_, java.util.ArrayList<fire.pb.circletask.anye.AnYeTask> _anyetasks_, long _awardexp_, long _awardsilver_, long _swardgold_, long _jointime_, int _legendpos_) {
		this.times = _times_;
		this.renxins = _renxins_;
		this.anyetasks = _anyetasks_;
		this.awardexp = _awardexp_;
		this.awardsilver = _awardsilver_;
		this.swardgold = _swardgold_;
		this.jointime = _jointime_;
		this.legendpos = _legendpos_;
	}

	public final boolean _validator_() {
		for (fire.pb.circletask.anye.AnYeTask _v_ : anyetasks)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(times);
		_os_.marshal(renxins);
		_os_.compact_uint32(anyetasks.size());
		for (fire.pb.circletask.anye.AnYeTask _v_ : anyetasks) {
			_os_.marshal(_v_);
		}
		_os_.marshal(awardexp);
		_os_.marshal(awardsilver);
		_os_.marshal(swardgold);
		_os_.marshal(jointime);
		_os_.marshal(legendpos);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		times = _os_.unmarshal_int();
		renxins = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.circletask.anye.AnYeTask _v_ = new fire.pb.circletask.anye.AnYeTask();
			_v_.unmarshal(_os_);
			anyetasks.add(_v_);
		}
		awardexp = _os_.unmarshal_long();
		awardsilver = _os_.unmarshal_long();
		swardgold = _os_.unmarshal_long();
		jointime = _os_.unmarshal_long();
		legendpos = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SRefreshAnYeData) {
			SRefreshAnYeData _o_ = (SRefreshAnYeData)_o1_;
			if (times != _o_.times) return false;
			if (renxins != _o_.renxins) return false;
			if (!anyetasks.equals(_o_.anyetasks)) return false;
			if (awardexp != _o_.awardexp) return false;
			if (awardsilver != _o_.awardsilver) return false;
			if (swardgold != _o_.swardgold) return false;
			if (jointime != _o_.jointime) return false;
			if (legendpos != _o_.legendpos) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += times;
		_h_ += renxins;
		_h_ += anyetasks.hashCode();
		_h_ += (int)awardexp;
		_h_ += (int)awardsilver;
		_h_ += (int)swardgold;
		_h_ += (int)jointime;
		_h_ += legendpos;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(times).append(",");
		_sb_.append(renxins).append(",");
		_sb_.append(anyetasks).append(",");
		_sb_.append(awardexp).append(",");
		_sb_.append(awardsilver).append(",");
		_sb_.append(swardgold).append(",");
		_sb_.append(jointime).append(",");
		_sb_.append(legendpos).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

