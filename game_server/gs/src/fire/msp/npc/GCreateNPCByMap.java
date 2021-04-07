package fire.msp.npc;

import fire.msp.move.DynamicSceneParams;
import fire.pb.move.DynamicSceneType;
import fire.pb.scene.MapUtil;
import fire.pb.scene.Scene;
import fire.pb.scene.SceneFactory;
import fire.pb.scene.SceneManager;
import fire.pb.scene.manager.SceneNpcManager;
import fire.pb.scene.movable.NPC;
import fire.pb.scene.sPos.GridPos;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GCreateNPCByMap__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GCreateNPCByMap extends __GCreateNPCByMap__ {
	@Override
	protected void process() {

		Scene scene = null;
		GridPos gpos = null;
		try {
			NPC n = SceneNpcManager.getInstance().createNpcWithKey(npc.npckey,
					npc.npcbaseid, npc.name, npc.dir);
			if (n == null) {
				if (SceneManager.logger.isInfoEnabled()) {
					SceneManager.logger.info(new StringBuilder().append("闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷鐓庮熆濠靛牊鍤�妞ゎ偅绻勯幑鍕惞鐠団剝袧濠电姷鏁搁崑鐐哄垂閸撲礁鏋堢�广儱顧�缂嶆牠鏌￠崶鈺�绱崇憸鐗堝笒缁�鍌炴煕韫囨艾浜圭紒瀣川缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閸℃顩叉繝濠傜墛閻撴稓锟藉箍鍎遍崯顐ｄ繆閸ф鐓冮柛娆嶅劤缁愭棃鏌″畝锟介崰鏍箖濠婂牆绠ｉ柟鐑樻尭閺嬨倝姊绘担鍛婃儓闁哄牜鍓熼幆鍕敍閻愰潧绁﹂梺鍦劋閸わ箓寮敓浠嬪箯閸涱垱鍠嗛柛鏇ㄥ墻閸燂拷??:").append(npc.npcbaseid)
							.append(",sceneid:").append(npc.sceneid)
							.append(",ownerid:").append(npc.ownerid));
				}
			}
			if (npc.ownerid > 0) {
				scene = SceneManager.getInstance().getSceneByMapAndOwner((int) npc.sceneid, npc.ownerid);
				if (scene == null) {
					DynamicSceneParams params = new DynamicSceneParams();
					scene = SceneFactory.createDynamicScene((int)npc.sceneid, npc.ownerid, "",
							-1, DynamicSceneType.NORMAL_SCENE, params.marshal(new OctetsStream()));
					
					SceneManager.logger.error(new StringBuilder().append("闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷鐓庮熆濠靛牊鍤�妞ゎ偅绻勯幑鍕惞鐠団剝袧濠电姷鏁搁崑鐐哄垂閸撲礁鏋堢�广儱顧�缂嶆牠鏌￠崶鈺�绱崇憸鐗堝笒缁�鍌炴煕韫囨艾浜圭紒瀣川缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閸℃顩叉繝濠傜墛閻撴稓锟藉箍鍎遍崯顐ｄ繆閸ф鐓冮柛娆嶅劤缁愭棃鏌″畝锟介崰鏍箖濠婂牆绠ｉ柟鐑樻尭閺嬨倝姊绘担鍛婃儓闁哄牜鍓熼幆鍕敍閻愰潧绁﹂梺鍦劋閸わ箓寮敓浠嬪箯閸涱垱鍠嗛柛鏇ㄥ墻閸燂拷??:").append(npc.npcbaseid)
							.append(",sceneid:").append(npc.sceneid)
							.append(",ownerid:").append(npc.ownerid)
							.append(",sceneidlong:").append(scene.getSceneID())
							.append(",npckey:").append(npc.npckey));
				}
			}
			else
				scene = SceneManager.getInstance().getSceneByID(npc.sceneid);
			gpos = MapUtil.getRandomArrivablePos(scene.getSceneID(), toufangareatype);
			int mapid = (int) npc.sceneid;
			if (mapid >= 1851 && mapid <= 1870) {
				if (SceneManager.logger.isInfoEnabled()) {
					SceneManager.logger.info(new StringBuilder().append("闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷鐓庮熆濠靛牊鍤�妞ゎ偅绻勯幑鍕惞鐠団剝袧濠电姷鏁搁崑鐐哄垂閸撲礁鏋堢�广儱顧�缂嶆牠鏌￠崶鈺�绱崇憸鐗堝笒缁�鍌炴煕韫囨艾浜圭紒瀣川缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閸℃顩叉繝濠傜墛閻撴稓锟藉箍鍎遍崯顐ｄ繆閸ф鐓冮柛娆嶅劤缁愭棃鏌″畝锟介崰鏍箖濠婂牆绠ｉ柟鐑樻尭閺嬨倝姊绘担鍛婃儓闁哄牜鍓熼幆鍕敍閻愰潧绁﹂梺鍦劋閸わ箓寮敓浠嬪箯閸涱垱鍠嗛柛鏇ㄥ墻閸燂拷??:").append(npc.npcbaseid)
							.append(",闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ穿缂嶆牠鎮楅敐搴℃灈缂侊拷鐎ｎ偁浜滈柟鎵虫櫅閻掔儤绻涢崗鍏碱棃婵﹦绮幏鍛存惞閻熸壆顐奸梻浣虹帛椤ㄥ繘宕㈤崜褎顫曢柣鎰摠婵挳鏌涢幘鏉戠祷婵炲牄鍔嶇换娑氾拷鐢殿焾鐢爼鏌ｆ幊閸旀垵鐣烽幋锔绘晜闁割偆鍠撻崣鍡涙⒑缂佹ɑ绀�闁稿﹤婀遍敓鑺ョ啲閹凤拷:").append(gpos.getX())
							.append(",闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ穿缂嶆牠鎮楅敐搴℃灈缂侊拷鐎ｎ偁浜滈柟鎵虫櫅閻掔儤绻涢崗鍏碱棃婵﹦绮幏鍛存惞閻熸壆顐奸梻浣虹帛椤ㄥ繘宕㈤崜褎顫曢柣鎰摠婵挳鏌涢幘鏉戠祷婵炲牄鍔嶇换娑氾拷鐢殿焾鐢爼鏌ｆ幊閸旀垵鐣烽弴鐔风窞闁归偊鍘鹃崣鍡涙⒑缂佹ɑ绀�闁稿﹤婀遍敓鑺ョ啲閹凤拷:").append(gpos.getY())
							.append(",sceneid:").append(npc.sceneid)
							.append(",ownerid:").append(npc.ownerid)
							.append(",sceneidlong:").append(scene.getSceneID())
							.append(",npckey:").append(npc.npckey));
				}
			}
				
			SceneNpcManager.getInstance().summonNpcAndUpdateGS(scene, gpos.toPosition(), n, npc.time);
		} catch (Exception e) {
			SceneManager.logger.error("create npc by map failed.npcid:"
					+ npc.npcbaseid + ",sceneid:" + npc.sceneid + ",ownerid:" + npc.ownerid + ",scene:" + scene
					+ ",pos:" + gpos, e);
			if (scene != null) {
				SceneManager.logger.error("sceneidlong:" + scene.getSceneID());
			}
		}
		// System.out.println("濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿顦甸弻鏇＄疀鐎ｎ亷鎷烽弴銏㈠祦闁靛繆锟借尙绠氬銈嗙墬缁瞼鏁懜鐢电闁瑰啿鍢插ú锕傚煕閹烘嚚褰掓晲閸涱喖鏆堥梺鍝ュ枔閸嬨倝骞冩禒瀣垫晬婵炴垼椴搁悾鑲╃磽娓氬洤鏋熼柣鐔叉櫊閻涱喚锟斤綆鍠楅崑鎰版煟閵忋埄鏆滅紒杈ㄥ▕濮婄粯鎷呯粵瀣秷闂佺瀛╂繛濠囥�佸棰濇晣闁逞屽墾閹风兘宕ㄩ弶鎴ｆ憰闂侀潧顧�婵″洭宕㈤崡鐐╂斀闁绘绮☉褎淇婇顐㈠箹闁崇粯鎸惧褔鏁撻敓锟� 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟〃閻掑﹪鏌涘☉娆愮稇缂佺媭鍨堕弻銊╂偆閸屾稑顏�? " + n.getName() + "闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ穿缂嶆牠鎮楅敐搴℃灈缂侊拷鐎ｎ偁浜滈柟鎵虫櫅閻掔儤绻涢崗鍏碱棃婵﹦绮幏鍛存惞閻熸壆顐奸梻浣虹帛椤ㄥ繘宕㈤崜褎顫曢柣鎰摠婵挳鏌涢幘鏉戠祷婵炲牄鍔嶇换娑㈠级閹存繃鍊梺璇″灠閻倸顕ｉ銏╁悑濠㈣泛顑囬崢顏堟⒑閸撴彃浜濈紒璇插暙椤斿繐鈹戠�ｎ偆鍘藉┑鐐村灱濞呮洜锟芥熬鎷� X 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧鏌曟繛鐐珔缁炬儳娼￠弻锛勪沪鐠囨彃濮庨梺钘夊暟閸犳牠寮婚妸鈺傚亞闁稿本绋戦锟�??" +
		// gpos.getX() + "Y 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧鏌曟繛鐐珔缁炬儳娼￠弻锛勪沪鐠囨彃濮庨梺钘夊暟閸犳牠寮婚妸鈺傚亞闁稿本绋戦锟�??" + gpos.getY());

	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730398;

	public int getType() {
		return 730398;
	}

	public fire.msp.npc.CreateNpcInfo npc;
	public int toufangareatype; // 0-普通的投放区域,1-新的投放区域,包含1级轻功

	public GCreateNPCByMap() {
		npc = new fire.msp.npc.CreateNpcInfo();
	}

	public GCreateNPCByMap(fire.msp.npc.CreateNpcInfo _npc_, int _toufangareatype_) {
		this.npc = _npc_;
		this.toufangareatype = _toufangareatype_;
	}

	public final boolean _validator_() {
		if (!npc._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npc);
		_os_.marshal(toufangareatype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npc.unmarshal(_os_);
		toufangareatype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GCreateNPCByMap) {
			GCreateNPCByMap _o_ = (GCreateNPCByMap)_o1_;
			if (!npc.equals(_o_.npc)) return false;
			if (toufangareatype != _o_.toufangareatype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += npc.hashCode();
		_h_ += toufangareatype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npc).append(",");
		_sb_.append(toufangareatype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}
