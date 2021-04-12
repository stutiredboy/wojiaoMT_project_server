
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
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犲鏌＄仦绋垮⒉鐎垫澘瀚敓鏂ょ秵娴滄繈顢欓崨顓涙斀闁绘劕寮堕埢鏇灻瑰鍐煟鐎殿噮鍋婂畷鍫曨敆娴ｅ搫甯鹃梻濠庡亜濞诧箑煤閺嵮勬瘎闂傚倷绀侀幉锛勬崲閸愵喓锟藉啯绻濋崒銈嗙稁缂傚倷鐒﹂…鍥偡瑜版帗鐓曢柕澶嬪灥閸犳艾顭囬懡銈囩＝闁稿本鐟чˇ锔姐亜閿曞倷鎲剧�殿噮鍋嗛幏鐘绘嚑椤掍焦顔曢梻浣告惈濞层垽宕归崷顓犱笉闁挎繂妫涚弧锟介梺闈涢獜缁辨洜绮婚幘鍓佺＝鐎广儱鎷戦煬顒侇殽閻愭彃鏆ｉ柛鈺佸瀹曟﹢鍩℃担绋课ら梻鍌欑劍鐎笛呮崲閸屾娑樷枎閹惧磭鐛ラ梺鍝勭▉閸樹粙鍩涢幒鎳ㄥ綊鏁愰崟顕呭妳闂佺粯甯為崑鎾诲Φ閸曨垰绠ｆ繝闈涙濞堝鎮楃憴鍕缂佽鐗撻悰顔撅拷锝庡枟閺呮繈鏌ㄩ悢鍓佺煓闁归攱鍨块幃銏ゅ礂閼测晛寮虫繝鐢靛█濞佳兾涢鐐嶏綁宕ㄦ繝浣虹畾濡炪倖鍔х紞鍥嚀閸ф鐓涚�癸拷閿熶粙宕伴幘璺哄灊婵炲棙鎸搁柨銈嗕繆閵堝拋鐓柟宄板槻铻栭柛娑卞枤閸樻悂姊虹化鏇炲⒉妞ゃ劌鐗婇弲鍫曟晜閼恒儱寮挎繝鐢靛Т閸燁垶濡靛┑鍥︾箚妞ゆ劑鍨归弳娆撴煃閽樺妲搁柍璇叉唉缁犳盯寮撮悩鍙夋К闂傚倸鍊搁崐椋庣矆娓氾拷楠炴顭ㄩ崟顒�寮块梺姹囧灩閹诧繝宕戠�ｎ喗鐓涢柛銉ㄥ煐缁舵稓绱撳鍡欏⒌闁绘搩鍋婂畷鍫曞Ω閿曪拷椤庢稑鈹戦悙鍙夆枙濞存粌鐖煎顐﹀磼閻愬鍘卞┑鐐村灥瀹曨剙顕ｉ崸妤佺厵濡炲楠搁崢鎾煛鐏炶濡块柨鐔告灮缁插宕濈�ｎ剝濮冲┑鐘崇閳锋垹鐥鐐村櫤妞ゅ繒濞�閺屾稓锟斤綆鍓欐禒褔鏌ㄩ悢璇残撻柤瑙勫劤閿曘垺娼忛埡鍌ゆ綗闂佽鍎抽顓㈡偡閻熸壋鏀介柣妯诲絻閺嗘瑦銇勮箛鎾跺煟婵﹦绮幏鍛村川婵犲倹娈橀梻浣告啞濡垹绮婚幘宕囨殾闁哄顕抽弮鍫濆窛妞ゆ棃妫跨花鐢告⒒婵犲骸浜滄繛璇у缁瑩骞掑Δ浣镐簵闂佸搫娲㈤崹娲偂閸愵喗鐓㈡俊顖欒濡茶銇勯妷锔剧煁妞ゃ劊鍎甸幃娆撳箹椤撶喓鏉归梻浣筋嚃閸犳銆冮崨杈剧稏婵犻潧顑嗛崐閿嬨亜閹虹偞瀚瑰銈呴獜閹凤拷
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

