
package fire.pb.clan.fight;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestRoleIsEnemy__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRequestRoleIsEnemy extends __CRequestRoleIsEnemy__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		mkdb.Procedure requestroleisenemy = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				SRequestRoleIsEnemy msg = new SRequestRoleIsEnemy(); 
				
				Long chanid = xtable.Roleidclan.select(roleid);
				if (chanid == null)
				{
					psendWhileCommit(roleid, msg);
					return true;
				}
				
				for (Long e : roleidlist)
				{
					if (e != null)
					{
						Long c = xtable.Roleidclan.select(e);
						if (c != null)
						{
							if (!c.equals(chanid))
								msg.rolelist.put(e, 2); //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂嫮鐭婇棁澶愭煛瀹ュ骸骞楅柣鎾崇箰閳规垿鎮欓幋婵嗘殲闁革絼绮欓弻锝夊箳閹存繃鍊紓浣虹帛閻╊垶鐛Ο纭锋嫹閻㈡鐒鹃柡鍡節濮婇缚銇愰幒婵囶棖闂佺绻戦敃銏狀嚕婵犳碍鍋勫瀣濞堥箖姊洪幖鐐插妧闁告洦鍘洪柇顖氣攽閿涘嫬浜奸柛濠冨灴瀹曠懓煤椤忓懎鍓銈嗙墱閸嬫稓绮婚弽銊х瘈濠电姴鍊绘晶鏇燁殽閻愵亜鐏ǎ鍥э躬椤㈡稑顭ㄩ崨顓狀偧闂備胶绮缓鍧楀礉瀹�鍕厴闁硅揪闄勯弲顒勬煕閺囥劌浜楅柡澶樺弮濮婅櫣绮欓崠鈩冩暰闂佺粯顨嗗ú婊堝矗閸涘瓨鈷戦柛鎰级閹牓鏌熼崘鍙夋崳缂侇喖顭烽、娑㈡倷鐎电骞楅梻浣侯攰閹活亞寰婇崐鐕佹毐闂傚倷鑳剁划顖炲箰婵犳碍鍋￠柨鏇炲�告闂佸憡娲﹂崹浼村礃閿熶粙姊洪棃娑辨Ф闁稿骸顭烽獮蹇涙倻閽樺鍞ㄥ銈嗗姦閸撴氨锟芥俺顫夐幈銊ノ熼悡搴濆闁诲孩鐔幏锟�? by changhao
							else
								msg.rolelist.put(e, 1);
						}
						else
						{
							msg.rolelist.put(e, -1);
						}
					}
				}
				
				psendWhileCommit(roleid, msg);				
				
				return true;
			}
		};
		
		requestroleisenemy.submit();			
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808541;

	public int getType() {
		return 808541;
	}

	public java.util.LinkedList<Long> roleidlist; // 角色list  by changhao

	public CRequestRoleIsEnemy() {
		roleidlist = new java.util.LinkedList<Long>();
	}

	public CRequestRoleIsEnemy(java.util.LinkedList<Long> _roleidlist_) {
		this.roleidlist = _roleidlist_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(roleidlist.size());
		for (Long _v_ : roleidlist) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			long _v_;
			_v_ = _os_.unmarshal_long();
			roleidlist.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestRoleIsEnemy) {
			CRequestRoleIsEnemy _o_ = (CRequestRoleIsEnemy)_o1_;
			if (!roleidlist.equals(_o_.roleidlist)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += roleidlist.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleidlist).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

