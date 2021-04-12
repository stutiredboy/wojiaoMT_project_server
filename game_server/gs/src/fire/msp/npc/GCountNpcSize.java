
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
			SceneManager.logger.error(new StringBuilder().append("缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘遍梺闈涚墕閹冲酣顢旈銏＄厸閻忕偛澧藉ú瀛樸亜閵忊剝绀嬮柡浣瑰姍瀹曞崬鈻庡Ο鎭嶆氨绱撻崒姘拷鐑芥倿閿曞倸绀夐柡宥庡幑閿熻棄鍟换婵嬪炊瑜戦幗鏇㈡⒑鐠恒劌鏋斿┑顔芥尦閹瑦绻濋崶銊у帾婵犮垼娉涢悧鍡涘礉閵堝鐓曢柡鍐挎嫹闁圭鍟块～蹇涙倻濡顫￠梺瑙勵問閸ｎ喖危椤斿皷鏀介柣鎰级閳绘洟鏌涘▎蹇撴殭妞ゆ洩绲剧换婵嗩潩椤撶偘绨婚梻浣侯焾缁绘劙鎯冮悜钘夌濠电姵纰嶉悡鐔煎箹濞ｎ剙濡芥繛鎳峰喚鐔嗛柣鐔峰簻瀹搞儵宕℃潏銊ｄ簻闁哄倸鐏濋埛鏃傜棯閹规劖顥夐柕鍡樺笒椤繈顢楁繝鍐╂毎闂佽瀛╂穱娲綖婢跺本宕叉繝闈涱儏椤懘鏌ㄥ┑鍡樺櫧闁告﹩鍋婂娲川婵犲啠鎷归梺缁橆殘婵烇拷妤犵偛鍟村杈╃磼閻樺磭娲存鐐达耿椤㈡稑鈽夊▎鎰帆闂傚倸鍊烽懗鍓佸垝椤栫偐锟斤箓宕奸～顓犲墾濠电偛妫欓崹瑙勭▔瀹ュ鐓涢悘鐐额嚙閸旀粓鏌涙繝鍌滀粵闁逛究鍔岃灒闁绘挸绨兼竟鏇㈡煟鎼淬垻鍟查柟鍑ゆ嫹?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ鐐电磽娴ｇ晫鍫柛濠冩礋濠�渚�姊虹紒妯忣亜螣婵犲洤纾块煫鍥ㄦ礈绾惧ジ鏌ｅ锟藉褔寮稿☉銏＄厸閻忕偠顕ф俊濂告煃閽樺妲搁摶锝呫�掑鐓庣仧缂佽鲸鎸搁埞鎴︽偐閹颁礁鏅遍梺鍝ュУ缁嬫垿鍩㈠澶婂嵆闁靛繒濮烽悿鍕⒑闂堟侗鐒鹃柛搴㈢懇閹垽鎮℃惔锛勶拷顓烆渻閵堝棙鈷愰柛搴＄－閺侇噣宕稿Δ浣叉嫽婵炶揪缍�濞咃絿鏁☉銏＄厵缂佸顑欓悡濂告煙椤栨艾顏い銏＄洴閹瑩鎳犻懜鍨暫濠电姷鏁搁崑鐐哄垂閹澘缍旀繝纰樺墲瑜板啴鎮ч幘璇茶摕婵炴垶顭傞弮鍫濈闁靛鍊栭崺娑樷攽閻愬樊鍤熷┑顖ｅ弮瀹曪綁宕橀…鎴炵稁濠电偛妯婃禍婊呯不娴兼潙绠归弶鍫濆⒔瀹�娑欎繆娣囧崬濮傛慨濠冩そ閹喚锟芥稒锚椤忓墎绱撻崒娆戭槮鐎殿喛娉涢悾婵堢矙濞嗙偓缍庢繝鐢靛У閼瑰墽澹曢崗鍏煎弿婵妫楁晶楣冩煙瀹勬澘妲婚柣锝忕節楠炲﹥绻濋崒婊呅ㄩ悗瑙勬礃閸庡ジ篓娴ｅ湱绠鹃悗娑欘焽婢х敻鏌＄仦鐐缂佺粯鐩畷褰掝敊閻撳巩銈嗙節閻㈤潧浠﹂柟鍛婃倐閳ワ箓鎮滈挊澶庢憰闂佺粯鏌ㄩ崥瀣磹缂佹ɑ鍙忔俊銈忔嫹婵☆偅鐟╅幃楣冨礈娴ｈ櫣锛滅紓鍌欓檷閸ㄧ懓顕ｉ崸妤佺厵濡炲楠搁崢瀛樻叏婵犲嫮甯涢柟宄版噽缁數锟斤綆鍋嗙粔鐑芥⒒娴ｄ警鐒炬繛瀵稿厴瀹曘垼顦堕柣蹇擃儔濮婃椽宕ㄦ繝鍐槱闂佹悶鍔戞禍鍫曞春濞戙垹绠抽柟鎯у綁缁ㄥ姊洪崫鍕枆闁稿瀚粋鎺楁晝閸屾稓鍘介梺瑙勫劤瀹曨剟宕濋敃鍌涚厸鐎癸拷鐎ｎ剛袦閻庢鍠楅幐鎶藉箖濞嗘垶瀚氱憸搴ｏ拷姘秺閺屾盯鏁傜拠鎻掍紟闂佺懓鍢查崲鏌ワ綖濠靛鍊锋い鎺炴嫹妞ゅ骏鎷�:")
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

