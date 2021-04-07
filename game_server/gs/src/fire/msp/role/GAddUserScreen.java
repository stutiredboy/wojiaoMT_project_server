
package fire.msp.role;

import fire.pb.main.ConfigManager;
import fire.pb.map.MapConfig;
import fire.pb.move.SAddUserScreen;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GAddUserScreen__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GAddUserScreen extends __GAddUserScreen__ {
	@Override
	protected void process() {
		// protocol handle
		Role reqRole = RoleManager.getInstance().getRoleByID(reqroleid);
		Role addRole = RoleManager.getInstance().getRoleByID(addroleid);
		if(reqRole == null || addRole == null)
			return;
		if(reqRole.getScene().getSceneID() != addRole.getScene().getSceneID())
			return;//濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚埄鍐ㄧ窞閻庯綆浜為崢鎰版⒑閼测晛顣奸悗绗涘洤桅闁告洦鍠氶悿锟介梺瑙勫礃濞夋盯銆傚ú顏呯厽闁绘柨鎽滈幊鏇犵磼閻樿櫕宕屾鐐插暙椤粓鏁撴禒瀣畺婵炲棙鍨跺畷澶愬级閻愰潧顣奸柣顐㈢箲娣囧﹪鎮欓鍕舵嫹閺囩姵宕叉俊顖濆吹椤╂煡鏌涢锝嗙闁藉啰鍠愮换娑㈠箣濞嗗繒浠鹃梺鍝勬噺缁捇寮婚悢纰辨晬闁糕剝顨呴弳娆愩亜椤掞拷濡瑧鎹㈠┑瀣仺闂傚牊绋愮划鍫曟⒑閻熸澘鏆辩紒缁橈耿楠炲啴鎮滈懞銉︽珕闂佸憡鎸嗛崨顖氬箚婵犵數濮伴崹鐓庘枖濞戙垺鏅濋柨鏇炲�稿Ч鏌ユ倵閿濆骸浜濋柛娆忕箲缁绘繈妫冨☉姘拪闂佸綊顥撻崗姗�寮幘缁樻櫢闁跨噦鎷�
		MapConfig mapcfg = ConfigManager.getInstance().getConf(MapConfig.class).get(reqRole.getScene().getMapID());
		if(mapcfg == null)
			return;
		if(mapcfg.getVisibletype() == 1)//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲搁弮鍫澪ラ柛鎰ㄦ櫆閸庣喖鏌曡箛瀣労婵炶尙顭堥埞鎴︽偐鐠囇冧紣闂佺懓鍟跨换鎰版偩閻戣棄绠甸柟鍝勵儜閹风兘骞掗幋顓熷兊闂佺粯鍔﹂崜娆擃敂閸洘鐓熼幖娣�ゅ鎰箾濞村娅囩紒杈╁仦缁楃喖鏁撴禒瀣ュù锝囩《濡插牊淇婇鐐存暠闁哄偊鎷烽梻鍌欑缂嶅﹪宕戞繝鍥у偍闁告挆鍛厠闂佽法鍣﹂幏锟�
			return;
		if(mapcfg.getVisibletype() == 2)//闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘骞戦姀銈呯疀妞ゆ棁妫勬惔濠囨⒑瑜版帒浜伴柛鐘愁殔閻ｇ兘宕ｆ径澶岀畾濡炪倖鐗楅悷褏绮旈崸妤佺叆婵犻潧妫Σ褰掓煛閸涱喚绠為柡灞剧〒娴狅箓鎮欓鍌涱吇闂備胶绮幐濠氬垂閻㈢硶锟芥棃宕橀鍢壯囨煕閳╁啰鎳冩い顐庡懐纾藉ù锝囩摂閸ゆ瑧绱掓径瀣唉闁炽儻绠撳畷鍫曨敆娴ｈ顏熼梻浣芥硶閸ｏ箓骞忛敓锟�
		{
			final long reqteamid = reqRole.getTeamID();
			final long addteamid = addRole.getTeamID();
			if(reqteamid == 0 || addteamid == 0 || reqteamid != addteamid)
				return;
		}
		
		SAddUserScreen sadduser = new SAddUserScreen();
		sadduser.rolelist.add(addRole.getRoleBasic());
		gnet.link.Onlines.getInstance().send(reqroleid, sadduser);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730909;

	public int getType() {
		return 730909;
	}

	public long reqroleid;
	public long addroleid;

	public GAddUserScreen() {
	}

	public GAddUserScreen(long _reqroleid_, long _addroleid_) {
		this.reqroleid = _reqroleid_;
		this.addroleid = _addroleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(reqroleid);
		_os_.marshal(addroleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		reqroleid = _os_.unmarshal_long();
		addroleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GAddUserScreen) {
			GAddUserScreen _o_ = (GAddUserScreen)_o1_;
			if (reqroleid != _o_.reqroleid) return false;
			if (addroleid != _o_.addroleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)reqroleid;
		_h_ += (int)addroleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(reqroleid).append(",");
		_sb_.append(addroleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GAddUserScreen _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(reqroleid - _o_.reqroleid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(addroleid - _o_.addroleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

