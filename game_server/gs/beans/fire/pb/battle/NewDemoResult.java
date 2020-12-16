
package fire.pb.battle;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class NewDemoResult implements Marshal {
	public final static int HP_CHANGE = 1; // �ܻ���Ѫ���仯��Ϊ���Ǽ�Ѫ��Ϊ���ǿ�Ѫ
	public final static int MP_CHANGE = 2; // �ܻ���ħ���仯��Ϊ���Ǽ�����Ϊ���ǿ���
	public final static int SP_CHANGE = 3; // �ܻ���ŭ���仯��Ϊ���Ǽ�ŭ����Ϊ���ǿ�ŭ��
	public final static int UL_HP_CHANGE = 4; // �ܻ��ߵ�ǰѪ���ޱ仯��Ϊ���Ǽӣ�Ϊ���Ǽ�
	public final static int TARGET_RESULT = 5; // �ܻ��߽�����ͣ�ResultType��ö��ֵ����
	public final static int RETURN_HURT = 6; // �ܻ�����ɵķ���ֵ�����Ϊ0�����û�з���
	public final static int ATTACK_BACK = 7; // �ܻ�����ɵķ���ֵ�����Ϊ0�����û�з���
	public final static int STEAL_HP = 8; // ��������������Ѫֵ�����Ϊ0�����û����Ѫ
	public final static int ATTACKER_RESULT = 9; // �����߽�����ͣ�ResultType��ö��ֵ����
	public final static int PROTECTER_ID = 10; // ������ID
	public final static int PROTECTER_HP_CHANGE = 11; // ������Ѫ���仯��Ϊ���Ǽ�Ѫ��Ϊ���ǿ�Ѫ����Ȼ��Ϊ���ģ�
	public final static int PROTECTER_RESULT = 12; // �����߽�����ͣ�ResultType��ö��ֵ����
	public final static int ASSISTER_ID = 13; // �ϻ���ID
	public final static int STEAL_MP = 14; // ����������������ֵ�����Ϊ0�����û������
	public final static int RETURN_HURT_DEATH = 15; // ��������Ϊ�����˻򷴻��������������˵ı仯
	public final static int PROTECTER_MAXHP_CHANGE = 16; // ��������Ϊ�����������������˵ı仯
	public final static int MESSAGE_ID = 17; // �ж�ʱ������ʾID
	public final static int HP_GODBLESS = 18; // ����Ѫ���仯
	public final static int EP_CHANGE = 19; // �ܻ���Ч����仯��Ϊ���Ǽ�Ч���㣬Ϊ���ǿ�Ч����
	public final static int SHAPE_CHANGE = 20; // ģ�͸ı�

	public int resulttype; // ������� 0��ͨ 1���� 2���� 3׷�� 4���� 5ս������ 6������
	public int targetid; // Ŀ��id��������
	public int flagtype; // �������ṩ�ͻ��˱�ʾ
	public java.util.LinkedList<fire.pb.battle.DemoBuff> demobuffs; // ÿһ��demo��buff�仯
	public java.util.LinkedList<fire.pb.battle.DemoAttr> demoattrs; // ÿһ��demo����������ֵ
	public java.util.HashMap<Integer,Integer> datas; // �洢���ݣ�key�ο�����ֵ����datas��ĳkeyֵû����valueĬ��Ϊ0

	public NewDemoResult() {
		demobuffs = new java.util.LinkedList<fire.pb.battle.DemoBuff>();
		demoattrs = new java.util.LinkedList<fire.pb.battle.DemoAttr>();
		datas = new java.util.HashMap<Integer,Integer>();
	}

	public NewDemoResult(int _resulttype_, int _targetid_, int _flagtype_, java.util.LinkedList<fire.pb.battle.DemoBuff> _demobuffs_, java.util.LinkedList<fire.pb.battle.DemoAttr> _demoattrs_, java.util.HashMap<Integer,Integer> _datas_) {
		this.resulttype = _resulttype_;
		this.targetid = _targetid_;
		this.flagtype = _flagtype_;
		this.demobuffs = _demobuffs_;
		this.demoattrs = _demoattrs_;
		this.datas = _datas_;
	}

	public final boolean _validator_() {
		for (fire.pb.battle.DemoBuff _v_ : demobuffs)
			if (!_v_._validator_()) return false;
		for (fire.pb.battle.DemoAttr _v_ : demoattrs)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(resulttype);
		_os_.marshal(targetid);
		_os_.marshal(flagtype);
		_os_.compact_uint32(demobuffs.size());
		for (fire.pb.battle.DemoBuff _v_ : demobuffs) {
			_os_.marshal(_v_);
		}
		_os_.compact_uint32(demoattrs.size());
		for (fire.pb.battle.DemoAttr _v_ : demoattrs) {
			_os_.marshal(_v_);
		}
		_os_.compact_uint32(datas.size());
		for (java.util.Map.Entry<Integer, Integer> _e_ : datas.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		resulttype = _os_.unmarshal_int();
		targetid = _os_.unmarshal_int();
		flagtype = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.battle.DemoBuff _v_ = new fire.pb.battle.DemoBuff();
			_v_.unmarshal(_os_);
			demobuffs.add(_v_);
		}
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.battle.DemoAttr _v_ = new fire.pb.battle.DemoAttr();
			_v_.unmarshal(_os_);
			demoattrs.add(_v_);
		}
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			int _k_;
			_k_ = _os_.unmarshal_int();
			int _v_;
			_v_ = _os_.unmarshal_int();
			datas.put(_k_, _v_);
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof NewDemoResult) {
			NewDemoResult _o_ = (NewDemoResult)_o1_;
			if (resulttype != _o_.resulttype) return false;
			if (targetid != _o_.targetid) return false;
			if (flagtype != _o_.flagtype) return false;
			if (!demobuffs.equals(_o_.demobuffs)) return false;
			if (!demoattrs.equals(_o_.demoattrs)) return false;
			if (!datas.equals(_o_.datas)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += resulttype;
		_h_ += targetid;
		_h_ += flagtype;
		_h_ += demobuffs.hashCode();
		_h_ += demoattrs.hashCode();
		_h_ += datas.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(resulttype).append(",");
		_sb_.append(targetid).append(",");
		_sb_.append(flagtype).append(",");
		_sb_.append(demobuffs).append(",");
		_sb_.append(demoattrs).append(",");
		_sb_.append(datas).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

}

