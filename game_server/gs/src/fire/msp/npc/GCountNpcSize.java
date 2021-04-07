
package fire.msp.npc;
import java.util.Map;

import fire.pb.scene.DynamicScene;
import fire.pb.scene.SceneManager;

import fire.pb.scene.movable.NPC;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GCountNpcSize__ extends mkio.Protocol { }

/** 统计动态场景里npc的数量
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GCountNpcSize extends __GCountNpcSize__ {
	@Override
	protected void process() {
		// protocol handle
		DynamicScene ds = SceneManager.getInstance().getSceneByMapAndOwner(mapid, ownerid);
		if (ds == null) {
			SceneManager.logger.error(new StringBuilder().append("缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備焦鍔栭〃濠囧蓟閿熺姴鐐婇柕澶堝劤閸旀挳姊烘潪鎵槮婵炲樊鍙冨濠氭偄閸忓皷鎷婚柣搴ㄦ涧婢瑰﹤危椤斿墽纾藉〒姘攻鐎氳绻濋姀锝呯厫闁告梹鐗犻幃陇绠涢幘顖涙杸闂佺粯顭堢亸娆戠不閺屻儲鍊垫慨妯煎亾鐎氾拷?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁躲倕霉閻樺樊鍎忕紒鐘靛枛閺屻劌鈽夊Ο渚紓婵犳鍠涘▍鏇㈠箞閵娿儙鐔煎垂椤旀儳甯块梻浣虹帛閹稿鎯勯鐐茶摕婵炴垶菤濡插牓鏌涘Δ鍐ㄤ户濞寸媭鍙冨娲箰鎼达絺妾ㄩ梺鐚存嫹缂佸弶宀稿濠氬磼濮橆剨鎷峰畡鎳婂綊宕惰濞存牠鏌曟繛鍨姶婵炴挸顭烽弻鐔兼倻濮楀棙鐣剁紒缁㈠弿閹风兘姊绘担绛嬫綈闁稿海鍘ц灋闁告洦鍨遍埛鎺撱亜閺嶎偄浠﹂柣鎾卞劦閺岋綁寮撮悙璇ф嫹閸︻叏鎷峰鐐:")
					.append(",ownerid:").append(ownerid)
					.append(",mapid:").append(mapid));
			return;
		}
		
		Map<Long, NPC> npcs = ds.getSceneNpcs();
		final int npcsize = npcs.size();
		if (npcsize == 0) {
			MCountNpcSize countnpcsize = new MCountNpcSize();
			countnpcsize.ownerid = ownerid;
			countnpcsize.saveid = saveid;
			countnpcsize.npcnum = npcsize;
			
			fire.pb.scene.SceneClient.pSend(countnpcsize);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730441;

	public int getType() {
		return 730441;
	}

	public long ownerid;
	public int mapid;
	public int saveid;

	public GCountNpcSize() {
	}

	public GCountNpcSize(long _ownerid_, int _mapid_, int _saveid_) {
		this.ownerid = _ownerid_;
		this.mapid = _mapid_;
		this.saveid = _saveid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(ownerid);
		_os_.marshal(mapid);
		_os_.marshal(saveid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		ownerid = _os_.unmarshal_long();
		mapid = _os_.unmarshal_int();
		saveid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GCountNpcSize) {
			GCountNpcSize _o_ = (GCountNpcSize)_o1_;
			if (ownerid != _o_.ownerid) return false;
			if (mapid != _o_.mapid) return false;
			if (saveid != _o_.saveid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)ownerid;
		_h_ += mapid;
		_h_ += saveid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(ownerid).append(",");
		_sb_.append(mapid).append(",");
		_sb_.append(saveid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GCountNpcSize _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(ownerid - _o_.ownerid);
		if (0 != _c_) return _c_;
		_c_ = mapid - _o_.mapid;
		if (0 != _c_) return _c_;
		_c_ = saveid - _o_.saveid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

