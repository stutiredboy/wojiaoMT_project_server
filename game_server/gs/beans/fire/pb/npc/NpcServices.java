
package fire.pb.npc;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

/** NpcC�����Ӧ���
*/
public class NpcServices implements Marshal , Comparable<NpcServices>{
	public final static int FORTUNE_WHEEL = 14; // ���˴�ת��
	public final static int SEND_MAIL = 69; // ����: (��̬����)
	public final static int CHECK_CHIEF_ABILITY = 96; // �鿴��ϯ-��������
	public final static int CHALLENGE_CHIEF = 97; // ��ս��ϯ-����
	public final static int RUN_FOR_CHIEF = 98; // ��Ҫ��ѡ
	public final static int VOTING = 99; // ��ҪͶƱ
	public final static int REFRESH_CHIEF_ABILITY = 100; // ��Ҫˢ����ϯ-��������
	public final static int ATTEND_IMPEXAM = 136; // ��Ҫ�μ��ǻ�����
	public final static int LEARN_IMPEXAM_RULE = 137; // �����˽��ǻ�������������
	public final static int WINNER_START = 166; // ׼������,��������ǵ�һ�ص���ս�ص�
	public final static int CHECK_PERSONAL_CREDIT = 167; // �����ѯ���Լ��Ļ����
	public final static int ADD_PET_LIFE = 168; // �������ӳ�������
	public final static int FIGHT_WINNER = 171; // ��ս�ھ���������
	public final static int ENTER_BINGFENG = 355; // �����������
	public final static int BACK_COPY_SERVICE = 1469; // �ص���������
	public final static int CIRCTASK_SCHOOL1 = 3000; // ��ѭ������-ְҵ
	public final static int CIRCTASK_SCHOOL2 = 3001; // ��ѭ������-ְҵ
	public final static int CIRCTASK_SCHOOL3 = 3002; // ��ѭ������-ְҵ
	public final static int CIRCTASK_SCHOOL4 = 3003; // ��ѭ������-ְҵ
	public final static int CIRCTASK_SCHOOL5 = 3004; // ��ѭ������-ְҵ
	public final static int CIRCTASK_SCHOOL6 = 3005; // ��ѭ������-ְҵ
	public final static int CIRCTASK_SCHOOL_SUBMIT1 = 3010; // ��ѭ�������ύ-ְҵ
	public final static int CIRCTASK_SCHOOL_SUBMIT2 = 3011; // ��ѭ�������ύ-ְҵ
	public final static int CIRCTASK_SCHOOL_SUBMIT3 = 3012; // ��ѭ�������ύ-ְҵ
	public final static int CIRCTASK_SCHOOL_SUBMIT4 = 3013; // ��ѭ�������ύ-ְҵ
	public final static int CIRCTASK_SCHOOL_SUBMIT5 = 3014; // ��ѭ�������ύ-ְҵ
	public final static int CIRCTASK_SCHOOL_SUBMIT6 = 3015; // ��ѭ�������ύ-ְҵ
	public final static int CATCH_IT = 4000; // ѭ������-׽��
	public final static int CATCH_IT_SUBMIT = 4001; // ѭ������-׽��
	public final static int CATCH_IT_QUERY = 4002; // ѭ������-��ѯ׽��
	public final static int CATCH_IT_BJ = 4003; // ѭ������-���׽��
	public final static int CATCH_IT_Battle = 4004; // ѭ������-׽�����ս��
	public final static int TIMER_NPC_Battle = 4005; // ��ʱˢ�ֽ���ս��
	public final static int EVENT_NPC_Battle = 4006; // �¼�ˢ�ֽ���ս��
	public final static int SUBMIT_CIRCTASK = 5000; // �ύѭ������
	public final static int RENXING_CIRCTASK = 5001; // ����һ��ѭ������
	public final static int BUY_MEDICINE = 30000; // ����ҩƷ
	public final static int BUY_GOODS = 30001; // ������Ʒ
	public final static int BUY_EQUIP = 30002; // ����װ��
	public final static int BUY_PET = 30003; // �������
	public final static int OPEN_SHANGHUI = 30004; // ���̻�
	public final static int QUERY_LINEINST = 100049; // ��ѯ��Ӣ��������
	public final static int RESET_LINEINST = 100187; // ���ø���
	public final static int ONE_LIEVEL_TITLE = 900054; // һ����ν by changhao
	public final static int TWO_LIEVEL_TITLE = 900055; // ������ν by changhao
	public final static int THREE_LIEVEL_TITLE = 900056; // ������ν by changhao
	public final static int LEADER_SEE_CAMPAIGN_LIST = 900057; // �鿴��ѡ���� by changhao
	public final static int LEADER_MY_CAMPAIGN = 900058; // �ҵľ�ѡ by changhao
	public final static int LEADER_CHALLENGE = 900059; // ��ս���� by changhao
	public final static int LEADER_CAMPAIGN = 900060; // ��ѡ���� by changhao
	public final static int PET_STORE = 100012; // ����ֿ�
	public final static int EXCHANGE_CODE = 100600; // �һ���
	public final static int IMPEXAM_STATE = 100704; // �ǻ�����
	public final static int LOOK_YAO_QIAN = 200101; // �չ�ҡǮ��
	public final static int ENTER_1V1_PVP = 910000; // ����ȥ������
	public final static int LEAVE_1V1_PVP = 910004; // �뿪������
	public final static int ENTER_3V3_PVP = 910010; // ����ȥ3v3������
	public final static int LEAVE_3V3_PVP = 910014; // �뿪3v3������
	public final static int ENTER_5V5_PVP = 910020; // ����ȥ5v5������
	public final static int LEAVE_5V5_PVP = 910024; // �뿪5v5������
	public final static int WATCH_NPC_BATTLE = 910115; // ��ʱ�����׹ֹ�ս
	public final static int WATCH_EVENTNPC_BATTLE = 910116; // �¼������׹ֹ�ս
	public final static int WATCH_INST_NPC_BATTLE = 910201; // ���ḱ����ս��ť����
	public final static int END_INST_NPC_BATTLE = 910202; // ���ḱ����ֹս������
	public final static int ENTER_CLAN_FIGHT = 910030; // ���빫��ս by changhao


	public NpcServices() {
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
		if (_o1_ instanceof NpcServices) {
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

	public int compareTo(NpcServices _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}

