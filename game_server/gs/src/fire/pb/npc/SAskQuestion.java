
package fire.pb.npc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SAskQuestion__ extends mkio.Protocol { }

/** ����ͳһЭ��
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SAskQuestion extends __SAskQuestion__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795520;

	public int getType() {
		return 795520;
	}

	public final static int QUEST = 1; // ����
	public final static int INSTANCE_ZONE = 2; // �����淨
	public final static int FRIEND_NPC_CHAT = 3; // ��ύ��npc�������
	public final static int SPECIALQUEST_ANSWER = 5; // ְҵ�����֧����
	public final static int GUILD_ANSWER = 7; // ���ḱ������
	public final static int ACTIVITY_ANSWER = 8; // ����� by changhao

	public byte lastresult; // 0 = û����һ���⣬1 = ��ȷ��-1 = ����
	public int questionid; // ��һ����ID�����û����һ��Ϊ-1
	public int questiontype; // �������ͣ����ݲ�ͬ�����ͣ��ͻ���/���������ܻ��в�ͬ�Ĵ���
	public long npckey; // npckey
	public int xiangguanid; // ������Ҫ�����id
	public int lasttime; // ����ʣ��ʱ��(��)
	public int cur; // ��ǰ��Լ��� by changhao
	public int num; // �Ѿ����˶��ٵ� by changhao
	public int totalexp; // �����ܾ��� by changhao
	public int totalmoney; // �����ܽ�Ǯ by changhao
	public int helptimes; // �Ѿ������Ĵ��� by changhao
	public int grab; // 1�ǿ�����ȡ2���Ѿ���ȡ3�ǲ�����ȡ by changhao
	public java.util.LinkedList<Integer> rightanswer; // �Ѿ��ش���Ķ�ѡ��ȷ��

	public SAskQuestion() {
		rightanswer = new java.util.LinkedList<Integer>();
	}

	public SAskQuestion(byte _lastresult_, int _questionid_, int _questiontype_, long _npckey_, int _xiangguanid_, int _lasttime_, int _cur_, int _num_, int _totalexp_, int _totalmoney_, int _helptimes_, int _grab_, java.util.LinkedList<Integer> _rightanswer_) {
		this.lastresult = _lastresult_;
		this.questionid = _questionid_;
		this.questiontype = _questiontype_;
		this.npckey = _npckey_;
		this.xiangguanid = _xiangguanid_;
		this.lasttime = _lasttime_;
		this.cur = _cur_;
		this.num = _num_;
		this.totalexp = _totalexp_;
		this.totalmoney = _totalmoney_;
		this.helptimes = _helptimes_;
		this.grab = _grab_;
		this.rightanswer = _rightanswer_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(lastresult);
		_os_.marshal(questionid);
		_os_.marshal(questiontype);
		_os_.marshal(npckey);
		_os_.marshal(xiangguanid);
		_os_.marshal(lasttime);
		_os_.marshal(cur);
		_os_.marshal(num);
		_os_.marshal(totalexp);
		_os_.marshal(totalmoney);
		_os_.marshal(helptimes);
		_os_.marshal(grab);
		_os_.compact_uint32(rightanswer.size());
		for (Integer _v_ : rightanswer) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		lastresult = _os_.unmarshal_byte();
		questionid = _os_.unmarshal_int();
		questiontype = _os_.unmarshal_int();
		npckey = _os_.unmarshal_long();
		xiangguanid = _os_.unmarshal_int();
		lasttime = _os_.unmarshal_int();
		cur = _os_.unmarshal_int();
		num = _os_.unmarshal_int();
		totalexp = _os_.unmarshal_int();
		totalmoney = _os_.unmarshal_int();
		helptimes = _os_.unmarshal_int();
		grab = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			int _v_;
			_v_ = _os_.unmarshal_int();
			rightanswer.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SAskQuestion) {
			SAskQuestion _o_ = (SAskQuestion)_o1_;
			if (lastresult != _o_.lastresult) return false;
			if (questionid != _o_.questionid) return false;
			if (questiontype != _o_.questiontype) return false;
			if (npckey != _o_.npckey) return false;
			if (xiangguanid != _o_.xiangguanid) return false;
			if (lasttime != _o_.lasttime) return false;
			if (cur != _o_.cur) return false;
			if (num != _o_.num) return false;
			if (totalexp != _o_.totalexp) return false;
			if (totalmoney != _o_.totalmoney) return false;
			if (helptimes != _o_.helptimes) return false;
			if (grab != _o_.grab) return false;
			if (!rightanswer.equals(_o_.rightanswer)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)lastresult;
		_h_ += questionid;
		_h_ += questiontype;
		_h_ += (int)npckey;
		_h_ += xiangguanid;
		_h_ += lasttime;
		_h_ += cur;
		_h_ += num;
		_h_ += totalexp;
		_h_ += totalmoney;
		_h_ += helptimes;
		_h_ += grab;
		_h_ += rightanswer.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(lastresult).append(",");
		_sb_.append(questionid).append(",");
		_sb_.append(questiontype).append(",");
		_sb_.append(npckey).append(",");
		_sb_.append(xiangguanid).append(",");
		_sb_.append(lasttime).append(",");
		_sb_.append(cur).append(",");
		_sb_.append(num).append(",");
		_sb_.append(totalexp).append(",");
		_sb_.append(totalmoney).append(",");
		_sb_.append(helptimes).append(",");
		_sb_.append(grab).append(",");
		_sb_.append(rightanswer).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

