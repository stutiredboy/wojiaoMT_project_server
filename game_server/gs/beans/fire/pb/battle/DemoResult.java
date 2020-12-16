
package fire.pb.battle;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class DemoResult implements Marshal {
	public int resulttype; // ������� 0��ͨ 1���� 2���� 3׷�� 4���� 5ս������ 6������
	public int targetid; // �ܻ���id
	public int flagtype; // �������ṩ�ͻ��˱�ʾ
	public int hpchange; // �ܻ���Ѫ���仯��Ϊ���Ǽ�Ѫ��Ϊ���ǿ�Ѫ
	public int mpchange; // �ܻ���ħ���仯��Ϊ���Ǽ�����Ϊ���ǿ���
	public int spchange; // �ܻ���ŭ���仯��Ϊ���Ǽ�ŭ����Ϊ���ǿ�ŭ��
	public int epchange; // �ܻ���Ч����仯��Ϊ���Ǽ�Ч���㣬Ϊ���ǿ�Ч����
	public int shapechange; // ģ�͸ı� 0ΪĬ������Ϊ�����õġ�
	public int uplimithpchange; // �ܻ��ߵ�ǰѪ���ޱ仯��Ϊ���Ǽӣ�Ϊ���Ǽ�
	public int targetresult; // �ܻ��߽�����ͣ�ResultType��ö��ֵ����
	public int returnhurt; // �ܻ�����ɵķ���ֵ�����Ϊ0�����û�з���
	public int attackback; // �ܻ�����ɵķ���ֵ�����Ϊ0�����û�з���
	public int stealhp; // ��������������Ѫֵ�����Ϊ0�����û����Ѫ
	public int attackerresult; // �����߽�����ͣ�ResultType��ö��ֵ����
	public int attackerulhpchange; // ������Ѫ���ޱ仯
	public int protecterid; // ������ID
	public int protecterhpchange; // ������Ѫ���仯��Ϊ���Ǽ�Ѫ��Ϊ���ǿ�Ѫ����Ȼ��Ϊ���ģ�
	public int protecterulhpchange; // ������Ѫ���ޱ仯
	public int protecterresult; // �����߽�����ͣ�ResultType��ö��ֵ����
	public int assisterid; // �ϻ���ID
	public int stealmp; // ����������������ֵ�����Ϊ0�����û������
	public int godblesshp; // ����Ѫ���仯
	public java.util.LinkedList<fire.pb.battle.DemoBuff> demobuffs; // ÿһ��demo��buff�仯
	public java.util.LinkedList<fire.pb.battle.DemoAttr> demoattrs; // ÿһ��demo����������ֵ

	public DemoResult() {
		demobuffs = new java.util.LinkedList<fire.pb.battle.DemoBuff>();
		demoattrs = new java.util.LinkedList<fire.pb.battle.DemoAttr>();
	}

	public DemoResult(int _resulttype_, int _targetid_, int _flagtype_, int _hpchange_, int _mpchange_, int _spchange_, int _epchange_, int _shapechange_, int _uplimithpchange_, int _targetresult_, int _returnhurt_, int _attackback_, int _stealhp_, int _attackerresult_, int _attackerulhpchange_, int _protecterid_, int _protecterhpchange_, int _protecterulhpchange_, int _protecterresult_, int _assisterid_, int _stealmp_, int _godblesshp_, java.util.LinkedList<fire.pb.battle.DemoBuff> _demobuffs_, java.util.LinkedList<fire.pb.battle.DemoAttr> _demoattrs_) {
		this.resulttype = _resulttype_;
		this.targetid = _targetid_;
		this.flagtype = _flagtype_;
		this.hpchange = _hpchange_;
		this.mpchange = _mpchange_;
		this.spchange = _spchange_;
		this.epchange = _epchange_;
		this.shapechange = _shapechange_;
		this.uplimithpchange = _uplimithpchange_;
		this.targetresult = _targetresult_;
		this.returnhurt = _returnhurt_;
		this.attackback = _attackback_;
		this.stealhp = _stealhp_;
		this.attackerresult = _attackerresult_;
		this.attackerulhpchange = _attackerulhpchange_;
		this.protecterid = _protecterid_;
		this.protecterhpchange = _protecterhpchange_;
		this.protecterulhpchange = _protecterulhpchange_;
		this.protecterresult = _protecterresult_;
		this.assisterid = _assisterid_;
		this.stealmp = _stealmp_;
		this.godblesshp = _godblesshp_;
		this.demobuffs = _demobuffs_;
		this.demoattrs = _demoattrs_;
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
		_os_.marshal(hpchange);
		_os_.marshal(mpchange);
		_os_.marshal(spchange);
		_os_.marshal(epchange);
		_os_.marshal(shapechange);
		_os_.marshal(uplimithpchange);
		_os_.marshal(targetresult);
		_os_.marshal(returnhurt);
		_os_.marshal(attackback);
		_os_.marshal(stealhp);
		_os_.marshal(attackerresult);
		_os_.marshal(attackerulhpchange);
		_os_.marshal(protecterid);
		_os_.marshal(protecterhpchange);
		_os_.marshal(protecterulhpchange);
		_os_.marshal(protecterresult);
		_os_.marshal(assisterid);
		_os_.marshal(stealmp);
		_os_.marshal(godblesshp);
		_os_.compact_uint32(demobuffs.size());
		for (fire.pb.battle.DemoBuff _v_ : demobuffs) {
			_os_.marshal(_v_);
		}
		_os_.compact_uint32(demoattrs.size());
		for (fire.pb.battle.DemoAttr _v_ : demoattrs) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		resulttype = _os_.unmarshal_int();
		targetid = _os_.unmarshal_int();
		flagtype = _os_.unmarshal_int();
		hpchange = _os_.unmarshal_int();
		mpchange = _os_.unmarshal_int();
		spchange = _os_.unmarshal_int();
		epchange = _os_.unmarshal_int();
		shapechange = _os_.unmarshal_int();
		uplimithpchange = _os_.unmarshal_int();
		targetresult = _os_.unmarshal_int();
		returnhurt = _os_.unmarshal_int();
		attackback = _os_.unmarshal_int();
		stealhp = _os_.unmarshal_int();
		attackerresult = _os_.unmarshal_int();
		attackerulhpchange = _os_.unmarshal_int();
		protecterid = _os_.unmarshal_int();
		protecterhpchange = _os_.unmarshal_int();
		protecterulhpchange = _os_.unmarshal_int();
		protecterresult = _os_.unmarshal_int();
		assisterid = _os_.unmarshal_int();
		stealmp = _os_.unmarshal_int();
		godblesshp = _os_.unmarshal_int();
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
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof DemoResult) {
			DemoResult _o_ = (DemoResult)_o1_;
			if (resulttype != _o_.resulttype) return false;
			if (targetid != _o_.targetid) return false;
			if (flagtype != _o_.flagtype) return false;
			if (hpchange != _o_.hpchange) return false;
			if (mpchange != _o_.mpchange) return false;
			if (spchange != _o_.spchange) return false;
			if (epchange != _o_.epchange) return false;
			if (shapechange != _o_.shapechange) return false;
			if (uplimithpchange != _o_.uplimithpchange) return false;
			if (targetresult != _o_.targetresult) return false;
			if (returnhurt != _o_.returnhurt) return false;
			if (attackback != _o_.attackback) return false;
			if (stealhp != _o_.stealhp) return false;
			if (attackerresult != _o_.attackerresult) return false;
			if (attackerulhpchange != _o_.attackerulhpchange) return false;
			if (protecterid != _o_.protecterid) return false;
			if (protecterhpchange != _o_.protecterhpchange) return false;
			if (protecterulhpchange != _o_.protecterulhpchange) return false;
			if (protecterresult != _o_.protecterresult) return false;
			if (assisterid != _o_.assisterid) return false;
			if (stealmp != _o_.stealmp) return false;
			if (godblesshp != _o_.godblesshp) return false;
			if (!demobuffs.equals(_o_.demobuffs)) return false;
			if (!demoattrs.equals(_o_.demoattrs)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += resulttype;
		_h_ += targetid;
		_h_ += flagtype;
		_h_ += hpchange;
		_h_ += mpchange;
		_h_ += spchange;
		_h_ += epchange;
		_h_ += shapechange;
		_h_ += uplimithpchange;
		_h_ += targetresult;
		_h_ += returnhurt;
		_h_ += attackback;
		_h_ += stealhp;
		_h_ += attackerresult;
		_h_ += attackerulhpchange;
		_h_ += protecterid;
		_h_ += protecterhpchange;
		_h_ += protecterulhpchange;
		_h_ += protecterresult;
		_h_ += assisterid;
		_h_ += stealmp;
		_h_ += godblesshp;
		_h_ += demobuffs.hashCode();
		_h_ += demoattrs.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(resulttype).append(",");
		_sb_.append(targetid).append(",");
		_sb_.append(flagtype).append(",");
		_sb_.append(hpchange).append(",");
		_sb_.append(mpchange).append(",");
		_sb_.append(spchange).append(",");
		_sb_.append(epchange).append(",");
		_sb_.append(shapechange).append(",");
		_sb_.append(uplimithpchange).append(",");
		_sb_.append(targetresult).append(",");
		_sb_.append(returnhurt).append(",");
		_sb_.append(attackback).append(",");
		_sb_.append(stealhp).append(",");
		_sb_.append(attackerresult).append(",");
		_sb_.append(attackerulhpchange).append(",");
		_sb_.append(protecterid).append(",");
		_sb_.append(protecterhpchange).append(",");
		_sb_.append(protecterulhpchange).append(",");
		_sb_.append(protecterresult).append(",");
		_sb_.append(assisterid).append(",");
		_sb_.append(stealmp).append(",");
		_sb_.append(godblesshp).append(",");
		_sb_.append(demobuffs).append(",");
		_sb_.append(demoattrs).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

}

