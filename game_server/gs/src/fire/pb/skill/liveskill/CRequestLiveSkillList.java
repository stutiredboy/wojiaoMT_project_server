
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
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞稿墲瀵板嫮锟斤綆浜濋鍛攽閻愬弶鈻曞ù婊冪埣瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎲＄换鍐�冩繝鍌ゆ綎缂備焦顭囬悷褰掓煕閵夋垵鍠氬鑽ょ磽閸屾瑧顦︽い锕備憾瀵偆鎷犻懠顒佹闂佸搫娲㈤崹鍦不閿濆棛绡�闁靛骏绱曠粻鎾剁磽瀹ュ拑韬鐐插暣閸╁嫰宕橀埡浣稿Τ闂備焦瀵х换鍌毼涘▎鎾崇獥闁哄稁鍘介埛鎺懨归敐鍕劅闁绘帞鍋撻妵鍕箣濠靛棙娈婚悗瑙勬礃缁诲牓鐛�ｎ喗鏅濋柨鐔剁矙閹锋垿鎮㈤崗鑲╁弳濠电娀娼уΛ顓炍ｉ崨濠佺箚妞ゆ劧缍囬懓鍧楁煛瀹�锟介崰鎾跺垝濞嗘挸閿ゆ俊銈咁煭閹峰嘲螖閸涱喚鍘搁梺绯曞墲椤ㄥ牊鏅堕敂鑺ュ弿濠电姴鍟妵婵囦繆椤愩垹鏆欓柍钘夘槸閳诲氦绠涢弴鐘叉槬闂傚倸鍊风粈渚�骞楀鍕弿闁汇垹鎲￠崑瀣煛閸ヨ埖绶涚紓宥嗙墵閻擃偊宕堕妸锕�顎涘┑鐐叉▕娴滃爼寮崒鐐寸厱婵炴垵宕鍧楁煙妞嬪骸鍘撮柡灞诲妿閿熸枻绲婚崝瀣姳婵犳碍鈷戠痪顓炴噺椤忕娀鏌涚�ｎ剙浠ч柨鐔诲Г閼规儳锕㈡潏鈺傤潟闁规儳顕悷鐟扳攽閻樻彃鏆欐い蹇撶埣濮婄粯鎷呴崨濠傛殘闂佸憡妫戠粻鎾崇暦閺夎鏃堝川椤旈棿绨甸梻濠庡亜濞诧妇绮欓幒妤佸亗闁哄洢鍨洪悡鍐煢濡警妲规い銉︾矋椤ㄣ儵鎮欓幖顓熺杹闂佽鍠楅〃鍛达綖濠靛鍊锋い鎺炴嫹妞ゅ骏鎷�
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

