
package fire.pb.skill.liveskill;
import fire.pb.skill.SkillRole;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestLiveSkillList__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜堕弫鍥煏韫囨洖啸闁告繃顨婂缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閺囥垹绠ｆ繝銏＄箓缂嶅﹪骞冮埄鍐╁劅闁挎繂妫欓崰鏍⒒娴ｄ警鐒炬い鎴濆暣瀹曟繈骞嬮敃锟介拑鐔兼煥濠靛棭妲告俊顐ｏ耿閺岀喓绮欓崸妤婏拷妤呮煛閸℃澧︽慨濠冩そ濡啫鈽夊▎蹇曠崺闂備礁鎽滄慨鐢告偋閺囶澁缍栭煫鍥ㄦ媼濞差亶鏁傞柛娑卞弿閹风兘鏌ㄧ�ｃ劋绨婚梺纭呮閸嬬偟锟芥艾婀辩槐鎾寸瑹婵犲啫顏堕梻浣告啞閸旓箓宕板Δ鍛亗闊洦绋掗悡鏇㈡煃閽樺顥滄鐐搭殜閹顫濋悙顒�顏�
 * @author changhao
 *
 */
public class CRequestLiveSkillList extends __CRequestLiveSkillList__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestlearnliveskill = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{		
				SRequestLiveSkillList msg = new SRequestLiveSkillList();
			
				SkillRole skillrole = new SkillRole(roleid);	
				
				for(java.util.Map.Entry<Integer, xbean.LiveSkill> e : skillrole.getLiveSkills().entrySet())
				{
					fire.pb.skill.liveskill.LiveSkill skill = new fire.pb.skill.liveskill.LiveSkill();
					skill.level = e.getValue().getLevel();
					skill.id = e.getKey();
					msg.skilllist.add(skill);
				}
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);				
				
				return true;
			}
		};
		
		requestlearnliveskill.submit();	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800513;

	public int getType() {
		return 800513;
	}


	public CRequestLiveSkillList() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestLiveSkillList) {
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

	public int compareTo(CRequestLiveSkillList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

