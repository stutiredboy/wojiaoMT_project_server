
package fire.pb;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

/** һЩ����ĳ�ʼ��ֵ
*/
public class DataInit implements Marshal , Comparable<DataInit>{
	public final static int ROLE_LEVEL_MAX = 155; // ��ɫ���ȼ�
	public final static int ROLE_UP_POINT = 5; // ��ɫ�������Ǳ����
	public final static int PET_UP_POINT = 5; // �����������Ǳ����
	public final static int ROLE_UP_PHY = 5; // ÿ��һ������5������
	public final static int ROLE_UP_ENERGY = 5; // ÿ��һ������5�����
	public final static int PET_INIT_LOY = 80; // �����ʼ�ҳ϶�
	public final static int PET_MAX_LOY = 100; // ��������ҳ϶ȡ�
	public final static int PET_MAX_LIFE = 20000; // �����������
	public final static int PET_FIGHT_LIFE_LIMIT = 50; // �����ս�������������
	public final static int FULL_PETLOY_LEVEL = 30; // �������ҳ϶ȵĳ���ȼ�����
	public final static int ROLE_PET_LEVEL_SPACE = 6; // �������ĵȼ������Ϊ6����
	public final static int ROLE_PET_LEVEL_SPACE_OFEXPITEM = 10; // ʹ�þ������ʱ,�������ĵȼ������Ϊ10��
	public final static int BASENUM = 1000; // ��ɫ���Լ�������ֵ�Ļ���
	public final static int PET_LEVEL_MAX = 160; // �������ȼ�
	public final static int PET_USELEVEL_SPACE = 10; // �����սʱ���˵����ȼ���
	public final static int AUTO_UPGRADE_LEVEL = 20; // �����Զ������ĵȼ�����
	public final static int WILD_PET_MAXGENGU = 40;
	public final static int WILD_PET_MINGENGU = 1;
	public final static int PET_UP_LEVEL_ADD_POINT = 5; // ����ÿ��һ��������Ǳ�ܵ���
	public final static int HAIR_COLOR_SCHEMES_NUM = 4; // ͷ����ɫ��������
	public final static int BODY_COLOR_SCHEMES_NUM = 4; // �·���ɫ��������
	public final static int TURNON_REFINE_NEED_ONLINE_TIME = 200; // ����װ��������Ҫ���ۻ�ʱ����
	public final static int TURNON_REFINE_NEED_FRIEND_LEVEL = 1000; // ����װ��������Ҫ���Ѻö�
	public final static int TURNON_REFINE_NEED_ANTIQUE_NUM = 1; // ����װ��������Ҫ�ĹŶ���
	public final static int COMMEN_ROLE_ADDPOINT = 100; // ��������ֶ��ӵ�ĵȼ���Ӧ���õ�ID
	public final static int EQUIP_CAN_REPAIR = 157; // װ���;ö�Ϊ80%ʱ�ſ�������


	public DataInit() {
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
		if (_o1_ instanceof DataInit) {
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

	public int compareTo(DataInit _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}

