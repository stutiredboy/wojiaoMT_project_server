
package fire.pb;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class SysConfigType implements Marshal , Comparable<SysConfigType>{
	public final static int Music = 1; // ����
	public final static int Volume = 2; // ����
	public final static int SoundSpecEffect = 3; // ��Ч
	public final static int SceneEffect = 4; // ������Ч
	public final static int MaxScreenShowNum = 5; // ����ͬ�������ʾ����
	public final static int ScreenRefresh = 6; // ����ˢ��Ƶ��
	public final static int AutoVoiceGang = 7; // �Զ�����--����Ƶ��
	public final static int AutoVoiceWorld = 8; // �Զ�����--����Ƶ��
	public final static int AutoVoiceTeam = 9; // �Զ�����--���Ƶ��
	public final static int AutoVoiceSchool = 10; // �Զ�����--ְҵƵ��
	public final static int RefuseFriend = 11; // �ܾ���������
	public final static int WorldChannel = 12; // ����Ƶ��
	public final static int GangChannel = 13; // ����Ƶ��
	public final static int SchoolChannel = 14; // ְҵƵ��
	public final static int CurrentChannel = 15; // ��ǰƵ��
	public final static int TeamChannel = 16; // ���Ƶ��
	public final static int PVPNotify = 17; // PVPNotify
	public final static int friendchatencrypt = 18; // ���������¼����
	public final static int friendmessage = 19; // ֻ���ܺ�����Ϣ
	public final static int rolePointAdd = 20; // rolePointAdd
	public final static int petPointAdd = 21; // petPointAdd
	public final static int skillPointAdd = 22; // skillPointAdd
	public final static int huoyueduAdd = 23; // huoyueduAdd
	public final static int zhenfaAdd = 24; // zhenfaAdd
	public final static int skillopen = 25; // ���ܿ���
	public final static int factionopen = 26; // ���Ὺ��
	public final static int petopen = 27; // ���￪��
	public final static int patopen = 28; // ��ս����
	public final static int zuduichannel = 29; // ���Ƶ��
	public final static int guajiopen = 30; // �һ�����
	public final static int zhiyinopen = 31; // ָ������
	public final static int huodongopen = 32; // �����
	public final static int refuseqiecuo = 33; // �д�
	public final static int ts_julonghuwei = 34; // ���;�������
	public final static int ts_julongjuntuan = 35; // ���;�������
	public final static int ts_guanjunshilian = 36; // ���͹ھ�����
	public final static int ts_renwentansuo = 37; // ��������̽��
	public final static int ts_1v1 = 38; // ����1v1
	public final static int ts_gonghuifuben = 39; // ���͹��ḱ��
	public final static int ts_3v3 = 40; // ����3v3
	public final static int ts_zhihuishilian = 41; // �����ǻ�����
	public final static int refuseclan = 42; // �ܾ���������
	public final static int refuseotherseeequip = 43; // �ܾ����˲鿴װ�� by changhao
	public final static int screenrecord = 44; // ¼������
	public final static int equipendure = 45; // װ���;�
	public final static int ts_gonghuizhan = 46; // ����ս
	public final static int rolldianshezhi = 47; // ROLL������
	public final static int framesimplify = 48; // �����


	public SysConfigType() {
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
		if (_o1_ instanceof SysConfigType) {
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

	public int compareTo(SysConfigType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}

