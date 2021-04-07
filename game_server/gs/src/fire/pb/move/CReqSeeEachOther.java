
package fire.pb.move;

import fire.pb.main.ConfigManager;
import fire.pb.map.MapConfig;
import fire.pb.scene.Scene;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqSeeEachOther__ extends mkio.Protocol { }

/** 主动请求跟某个在周围的角色互相看见，如果在周围，就推下来
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqSeeEachOther extends __CReqSeeEachOther__ {
	@Override
	protected void process() {
		// protocol handle
		final long reqroleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (reqroleId < 0)
			return;
		Role reqrole = RoleManager.getInstance().getRoleByID(reqroleId);
		Role seerole = RoleManager.getInstance().getRoleByID(roleid);
		
		if(reqrole == null || seerole == null)
			return;//濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚埄鍐ㄧ窞閻庯綆浜為崢鎰版⒑閼测晛顣奸悗绗涘洤桅闁告洦鍠氶悿锟介梺鍦亾閹苯螞閵堝應鏀介柍钘夋娴滈箖鏌熼崙銈嗗?
		
		if(reqrole.getScene() != seerole.getScene())
			return;//濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚埄鍐ㄧ窞閻庯綆浜為崢鎰版⒑閼测晛顣奸悗绗涘洤桅闁告洦鍠氶悿锟介梺瑙勫礃濞夋盯銆傚ú顏呯厽闁绘柨鎽滈幊鏇犵磼閻樿櫕宕屾鐐插暙椤粓鏁撴禒瀣畺婵炲棙鍨跺畷澶愬级閻愰潧顣奸柣顐㈢箲娣囧﹪鎮欓鍕舵嫹閺囩姵宕叉俊顖濆吹椤╂煡鏌涢锝嗙闁藉啰鍠愮换娑㈠箣濞嗗繒浠鹃梺鍝勬噺缁捇寮婚悢纰辨晬闁糕剝顨呴弳娆愩亜椤掞拷濡瑧鎹㈠┑瀣仺闂傚牊绋愮划鍫曟⒑瑜版帗鏁遍柛銊ユ健閻涱喛绠涘☉娆愭闂佽法鍣﹂幏锟�
		
		Scene s = reqrole.getScene();
		int reqscreenindex = s.getScreenIndex(reqrole.getPos());
		int seescreenindex = s.getScreenIndex(seerole.getPos());
		if(Math.abs(reqscreenindex - seescreenindex) > 1)
			return;//濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚埄鍐ㄧ窞閻庯綆浜為崢鎰版⒑閼测晛顣奸悗绗涘洤桅闁告洦鍠氶悿锟介梺瑙勫礃濞夋盯路閿熶粙姊绘担鐟扳枙闁猴拷閸楃倣娑㈠礃椤旇壈鎽曞┑鐐村灟閸ㄥ綊宕￠幎鑺ョ厪濠电偛鐏濋崝婊堟煟韫囨梹灏电紒杈ㄦ尰閹峰懘宕崟纰夋嫹瀹�鍕厱闁挎繂绻掔粔顔筋殽閻愭彃鏆欐い顐ｇ矒閺佹挻绂掔�ｎ亞鐣哄┑鐐叉閹稿宕甸幋鐐簻闁圭儤鍨垫禍鐐烘煕閻愯泛鐓愮紒缁樼箞閹粙妫冨☉妤冩崟闂備焦鐪归崝搴ㄥ礂濡櫣鏆︽繝濠傚暊閺�浠嬫煕椤愮姴鐏柣鎾存尰缁绘繈濮�閿濆懐鍘梺鍛婃缁犳挸顕ｉ锕�鐐婃い鎺嶈兌閸橆亝绻濋悽闈涳拷顖炲礃閳轰緡锟芥稑鈹戦埄鍐ㄧ祷闁搞垺鐓￠崺鐐哄箣閿旇棄锟界兘鏌ょ喊鍗炲闁硅尪鍋愮槐鎾寸瑹閸パ勭亪缂備礁顦悥鐓庮嚕椤愶富鏁嬮柨鐔剁矙楠炲啫鈻庨幋鐐叉櫝婵炶揪绲块悺鏂款焽閹邦噯鎷烽崹顐ｇ凡閻庢矮鍗抽悰顕�宕堕澶嬫櫍闂佺粯鍔栬ぐ鍐夐幇鐗堚拻濞达絿鐡旈崵娆撴煕閹寸姵娅曠�垫澘锕ょ叅妞ゅ繐瀚弻褍鈹戦悩缁樻锭妞ゆ垵妫濆畷鎴﹀焺閸愵亞鐦堥梻鍌氱墛娓氭宕曢幇鐗堢厽闁规儳鐡ㄧ粈瀣煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�?
		
		MapConfig mapcfg = ConfigManager.getInstance().getConf(MapConfig.class).get(s.getMapID());
		if(mapcfg == null)
			return;
		if(mapcfg.getVisibletype() == 1)//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲搁弮鍫澪ラ柛鎰ㄦ櫆閸庣喖鏌曡箛瀣労婵炶尙顭堥埞鎴︽偐鐠囇冧紣闂佺懓鍟跨换鎰版偩閻戣棄绠甸柟鍝勵儜閹风兘骞掗幋顓熷兊闂佺粯鍔﹂崜娆擃敂閸洘鐓熼幖娣�ゅ鎰箾濞村娅囩紒杈╁仦缁楃喖鏁撴禒瀣ュù锝囩《濡插牊淇婇鐐存暠闁哄偊鎷烽梻鍌欑缂嶅﹪宕戞繝鍥у偍闁告挆鍛厠闂佽法鍣﹂幏锟�
			return;
		if(mapcfg.getVisibletype() == 2)//闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘骞戦姀銈呯疀妞ゆ棁妫勬惔濠囨⒑瑜版帒浜伴柛鐘愁殔閻ｇ兘宕ｆ径澶岀畾濡炪倖鐗楅悷褏绮旈崸妤佺叆婵犻潧妫Σ褰掓煛閸涱喚绠為柡灞剧〒娴狅箓鎮欓鍌涱吇闂備胶绮幐濠氬垂閻㈢硶锟芥棃宕橀鍢壯囨煕閳╁啰鎳冩い顐庡懐纾藉ù锝囩摂閸ゆ瑧绱掓径瀣唉闁炽儻绠撳畷鍫曨敆娴ｈ顏熼梻浣芥硶閸ｏ箓骞忛敓锟�
		{
			final long reqteamid = reqrole.getTeamID();
			final long addteamid = seerole.getTeamID();
			if(reqteamid == 0 || addteamid == 0 || reqteamid != addteamid)
				return;
		}
		
		reqrole.seeSomeone(seerole);
		seerole.seeSomeone(reqrole);
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 790486;

	public int getType() {
		return 790486;
	}

	public long roleid;

	public CReqSeeEachOther() {
	}

	public CReqSeeEachOther(long _roleid_) {
		this.roleid = _roleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqSeeEachOther) {
			CReqSeeEachOther _o_ = (CReqSeeEachOther)_o1_;
			if (roleid != _o_.roleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqSeeEachOther _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

