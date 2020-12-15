
package xbean;

public interface NameState extends xdb.Bean {
	public NameState copy(); // deep clone
	public NameState toData(); // a Data instance
	public NameState toBean(); // a Bean instance
	public NameState toDataIf(); // a Data instance If need. else return this
	public NameState toBeanIf(); // a Bean instance If need. else return this

	public final static int STATE_ALLOCATE = 0; // 
	public final static int STATE_CONFIRM = 1; // 

	public int getState(); // ���ַ���״̬
	public int getLocalid(); // ���ַ����Զ�˷�����
	public String getPeerip(); // ���ַ����Զ�˷�������ַ
	public com.goldhuman.Common.Octets getPeeripOctets(); // ���ַ����Զ�˷�������ַ
	public long getTime(); // ���ַ����ʱ��

	public void setState(int _v_); // ���ַ���״̬
	public void setLocalid(int _v_); // ���ַ����Զ�˷�����
	public void setPeerip(String _v_); // ���ַ����Զ�˷�������ַ
	public void setPeeripOctets(com.goldhuman.Common.Octets _v_); // ���ַ����Զ�˷�������ַ
	public void setTime(long _v_); // ���ַ����ʱ��
}
