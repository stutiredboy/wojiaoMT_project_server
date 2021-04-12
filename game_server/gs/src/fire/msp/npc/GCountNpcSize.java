
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
			SceneManager.logger.error(new StringBuilder().append("缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氱紓鍌氬�烽悞锕傚礉閺嶎厹锟藉啯绻濋崶褑鎽曢梺璺ㄥ枔婵挳鎮欐繝鍥ㄧ厪濠㈣泛鐗嗛崝銈夋煕閺冿拷閹稿啿顫忛悜妯诲闁规鍣Σ顔尖攽閻愬弶鈻曢柛娆忓暙椤曪絾绻濆顓炰簻闂佺绻愰惃鐑藉箯婵犳碍鐓熼幖娣妽濞懷冾熆閻熷府宸ラ崡杈ㄣ亜閺傚灝鈷旂痪鎹愭閵嗘帒顫濋濠冩暰闁诲孩淇洪～澶屾崲濠靛顫呴柨婵嗘噽閸橆偊姊洪崨濠冣拹闁绘濞�楠炲啴妾辩紒鐘崇洴楠炴﹢顢涘☉娆愭緫闂傚倷鑳剁划顖炩�﹂崼顫剨婵炲棙鍨规稉宥夋煛鐏炶鍔滈柛濠傜仛閹便劌螣閻撳簼澹曢柣搴㈢啲閹凤拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫炵紓浣界堪閸婃洟婀侀梺缁樏Ο濠囧磿韫囨洜纾奸柣姗�娼ч弸娑㈡煛鐏炶濡奸柍钘夘槸铻ｅ〒姘煎灟缁辨挸鈹戦悩鎰佸晱闁哥姵绋戦埢宥夊即閵忕姷鐤勯梺闈涱焾閸庢瑩鎮㈤悡搴＄�銈嗘⒐閸庡磭鏁崸妤佲拻濞达綀娅ｇ敮娑㈡煙缁嬫鐓奸柟顖氬椤㈡盯鎮欓懠鑸垫啺婵犵數鍋為崹鎯板綔濠碘剝褰冮悧鎾诲蓟濞戞鏃堝礃閵娿倖鍩涘┑鐐差嚟婵參宕ｉ崘顭戞綎婵炲樊浜滅粻浼村箹鏉堝墽宀涙俊淇卞姂濮婃椽鎮�涙ê顏剁紓鍌欑瀵泛鐣濈粙娆炬綎濠电姵鑹剧壕鍏兼叏濮楀棗澧鹃柟宄板槻閻ｏ繝骞婃繝鍌滅Ш鐎规洘鍎奸¨浣圭箾鐎涙澧甸柡灞炬礃缁绘盯宕归鐓幮ゆ繝鐢靛仦閹告悂鈥﹂悜钘夎摕闁绘柨鍚嬮崐缁樻叏濡わ拷濡瑩鎮鹃崜浣虹＜缂備降鍨瑰鍧楁煙妞嬪骸鍘存慨濠勭帛閹峰懐绮电�ｎ偆绉烽梻浣侯焾濞寸兘宕㈣閻忓姊洪崨濠冨闁搞劑浜堕崺娑㈠箳閹惧彉绨婚梺鍝勭▉閸嬪嫭绂掗敃鍌涚厽闁规儳宕崝锕傛煛瀹�瀣М鐎殿喗鎸抽幃娆戞嫚瑜庣�氬綊鏌涢敂璇插伎闁瑰嘲鍢查～婵嬫倷椤掞拷椤忥拷:")
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

