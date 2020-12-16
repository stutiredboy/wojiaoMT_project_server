
package fire.pb.team;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class TeamError implements Marshal , Comparable<TeamError>{
	public final static int UnkownError = 0; // δ֪����
	public final static int SelfInTeam = 1; // �Լ��Ѿ��ڶ�����
	public final static int SelfNotInTeam = 2; // �Լ����ڶ�����
	public final static int ObjectInTeam = 3; // �Է��Ѿ��ڶ�����
	public final static int SelfNOtLeader = 4; // �Լ����Ƕӳ�
	public final static int ObjectNotLeader = 5; // �Է����Ƕӳ�
	public final static int ObjectOffline = 6; // �Է������ߣ���ͳһ��Error��
	public final static int SelfTeamFunctionClose = 7; // �Լ���ӿ��عر�
	public final static int ObjectTeamFunctionClose = 8; // �Է���ӿ��عر�
	public final static int SelfInUnteamState = 9; // �Լ��ڲ������״̬
	public final static int ObjectInUnteamState = 10; // �Է��ڲ������״̬
	public final static int TeamFull = 11; // ������������
	public final static int InvitedInTeam = 12; // �Է��Ѿ��ڶ�����
	public final static int BeingInvited = 13; // �Է����ڱ�������������
	public final static int InvitedIn30s = 14; // 30����ֻ������һ��ͬһ���
	public final static int InviteingsFull = 15; // �������������ﵽ4�����������������
	public final static int InviterTeamNotExist = 16; // �������Ķ����Ѿ���ɢ
	public final static int InviterNotLeader = 17; // �����߲��Ƕӳ�
	public final static int ApplierInTeam = 18; // �������Ѿ��ڶ�����
	public final static int ApplyTimeout = 19; // �������Ѿ���ʱ
	public final static int ApplyListFull = 20; // ���������б�����
	public final static int ApplierLevelValid = 21; // �����߼��𲻷��϶���Ҫ��
	public final static int ChangeLeaderUnable = 22; // ���鴦�ڲ����Ի��ӳ���״̬
	public final static int InChangeLeaderStatus = 23; // �Ѿ���������ӳ����ȴ���Ӧ��
	public final static int ChangeLeaderInCD = 24; // ����2����ֻ�ܸ����ӳ�һ��
	public final static int MembersNotNormal = 25; // ��Ա����������״̬
	public final static int TooFar = 26; // �����Զ�����ܹ��
	public final static int NoAbsentMember = 27; // ����û������Ķ�Ա
	public final static int RefuseChangeLeader = 28; // �ܾ���Ϊ�ӳ�
	public final static int ObjectNotInTeam = 29; // �Է����ڶ�����
	public final static int AlreadyApply = 30; // �Է��Ѿ��ڴ˶���������б���
	public final static int AbsentCantBeLeader = 31; // �����Ա���ܳ�Ϊ�ӳ�
	public final static int LevelSetError = 32; // �ȼ����ô��� by changhao
	public final static int LevelError = 33; // �ȼ������� by changhao
	public final static int NoTarget = 34; // û������Ŀ�� by changhao
	public final static int TeamEnoughFull = 35; // �����Ѿ����� by changhao
	public final static int InMatching = 36; // �Ѿ���ƥ���� by changhao
	public final static int ActiveNotOpen = 37; // �δ���� by changhao
	public final static int NoFaction = 38; // û�й��� by changhao
	public final static int TeamStateError = 39; // ���״̬�ͻ��˷�������ͬ�� by changhao
	public final static int OneKeyApplyTeamNoTime = 40; // һ����������ʱ�� by changhao
	public final static int NoRollNotInTeam = 50; // ���ڶ����в���ROLL�� by changhao
	public final static int NoReward = 51; // û�н����ɷ��� by changhao
	public final static int FormBookHalfNotEnough = 55; // �⻷�о��� by changhao
	public final static int UnKnuownFormBook = 56; // ��Ч�Ĺ⻷�� by changhao
	public final static int FromLevelMax = 57; // �⻷�ȼ��Ѿ������ by changhao
	public final static int FormIdError = 58; // �⻷ID ���� by changhao
	public final static int FormBookNotEnough = 59; // �⻷�鲻�� by changhao


	public TeamError() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof TeamError) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(TeamError _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}

