
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
								msg.rolelist.put(e, 2); //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤濠�閬嶆晸閻ｅ本鍤�閻庢凹鍙冨畷宕囧鐎ｃ劋姹楅梺鍦劋閸ㄥ綊宕愰悙鐑樺仭婵犲﹤瀚惌濠囨婢舵劖鐓涚�广儱楠搁獮妤呮煟閹惧磭绠伴柍瑙勫灴閹瑩骞嬪┑鍡樻闂侀潻绲肩划娆撳蓟閿濆绠抽柟瀛樼箖閸婎垳绱撴担铏瑰笡闁烩晩鍨堕悰顔嘉熺涵閿嬪闁汇垺顔栭悞楣冩煛閸☆厾绡�婵﹪缂氶妵鎰板箳濠靛浂妫栭梻浣侯焾缁绘垿鏁冮姀鐙�鍤曞┑鐘崇閸嬪嫬顪冪�ｎ亜顒㈡繛鍫ョ畺濮婃椽骞栭悙鎻掑Η闂佸憡娲﹂崢娲焽椤栨埃鏀介柨娑樺娴滃ジ鏌涙繝鍐ㄧ伌鐎规洜鎳撶叅妞ゅ繐鎳庨崜顔碱渻閵堝棛澧遍柛瀣〒缁寮介妸褏鐦堟繝鐢靛Т閸婄粯鏅堕弴鐕佹闁绘劦浜滈悘顏勄庨崶褝韬い銏＄☉椤劑宕ㄩ鐙�鍋ч梻鍌欒兌缁垳缂撻崸妤�绀夌�癸拷閸曨偆鍘撮梺纭呮彧闂勫嫰寮查鍕厱闁哄洢鍔屾禍妤呮煛婢舵ê寮慨濠呮缁瑩宕犻埄鍐╂毎闂備胶绮〃鍡椕哄鍫濈煑闁告稑鐡ㄩ埛鎴︽煕閹邦剙绾ч柟顖氱墦閺岀喖宕橀崣澶嬪闯缂備緡鍠栭…鐑姐�佸☉銏″�烽悗鐢殿焾楠炴姊绘担渚敯闁规椿浜炲濠囧磹閻曚焦姣愰梻鍌氬�烽懗鍓佸垝椤栫偛绠板┑鐘崇閸嬶繝鏌ㄩ弴鐐诧拷鍛婎攰闂備礁鎲″ú锕傚垂娴兼潙绀冮柨鐔剁矙濮婃椽妫冨☉杈ㄐら梺绋块椤兘鐛箛娑欏�婚柦妯侯槸閸炪劌顪冮妶鍡楀Е闁告挻姘ㄩ敓鑺ヤ亢椤骞堥妸銉庣喖鎮℃惔婵嗩棜闂佽瀛╅悢顒勫箯閿燂拷? by changhao
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

