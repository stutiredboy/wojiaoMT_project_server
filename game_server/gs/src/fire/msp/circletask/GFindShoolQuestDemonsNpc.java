
package fire.msp.circletask;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GFindShoolQuestDemonsNpc__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GFindShoolQuestDemonsNpc extends __GFindShoolQuestDemonsNpc__ {
	@Override
	protected void process() {
		// protocol handle
		
		java.util.Set<Long> objlist = fire.pb.scene.manager.RoleManager.getInstance().getSchoolRoles(objschool);
		java.util.List<fire.pb.scene.movable.Role> objrolelist = new java.util.ArrayList<fire.pb.scene.movable.Role>();
		if (objlist != null){
			for (Long rid:objlist){
				fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(rid);
				if (role == null)
					continue;
				if (role.getLevel() >= levelmin && role.getLevel() <= levelmax)
					objrolelist.add(role);
			}
		}
		if (!objrolelist.isEmpty()){
			int rand = fire.pb.util.Misc.getRandomBetween(0, objrolelist.size()-1);
			fire.pb.scene.movable.Role dstrole = objrolelist.get(rand);
			npcinfo.name = dstrole.getName();
			npcinfo.shape = dstrole.getModeid();
		}
		
		java.util.List<fire.msp.npc.NpcInfo> rlist = fire.pb.scene.manager.SceneNpcManager.getInstance().createNpc(npcinfo);
		
		// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倹绻涘顔荤盎缁炬儳娼￠弻銈吤圭�ｎ偅鐝旈梺鎼炲妽缁诲牓寮诲☉銏犵婵°倧鎷烽悗姘煎墴瀵悂宕掗悙绮规嫼闂佸湱顭堢�涒晠藟閸℃せ鏀芥い鏂挎惈閿熻姤鐗滅划瀣吋婢跺á褍顭跨捄渚剳闁告ɑ鎮傚铏圭矙閹稿孩鎷辩紓浣割儐閸ㄥ潡銆佸顒夌叆闁告侗鍨抽敍婊堟⒑鐠恒劌鏋嶇紒顔界懇瀵偊骞橀懜娈挎綗缂傚倸绋勯幏锟�
		if (rlist == null || rlist.isEmpty() || rlist.size() < npcinfo.num){
			fire.msp.npc.MCreateNpcUniversalRet mret = new fire.msp.npc.MCreateNpcUniversalRet();
			mret.interfaceid = interfaceid;
			mret.result = 0;
			fire.pb.scene.SceneClient.pSend(mret);
			return;
		}
		// 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛瀣ㄥ�濋弻鏇熺箾閻愵剚鐝旂紓渚婃嫹濠㈣埖鍔栭悡娑㈡煕閵夈垺娅呴柡瀣灴閺屾稑鈻庤箛鏇狀啋闂佸搫琚崝鎴﹀箖閵堝纾兼繛鎴烇供娴硷拷  闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愬弶鐤勫┑掳鍊х徊浠嬪疮椤愩倧鎷峰顒夋Ч闁靛洤瀚伴獮鎺楀箣濠垫劒绱濋梻浣芥〃缁�浣肝涘┑瀣摕闁挎繂顦粻娑欍亜閹哄秶鍔嶉柛搴㈡尵缁辨挻绗熸繝鍐伓闂備胶纭堕崜婵堢矙閹烘鍋傞柣鏃傚劋閸犳劗锟藉箍鍎遍幃鍨洪鍛闂佽法鍣﹂幏锟� NPC闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径宀嬫嫹閻у憡瀚归梺璺ㄥ枍缁瑩寮幘缁樺殟闁靛鍎卞В鍫熺箾鐎涙鐭嬬紒璇插閸掓帒顫濋鐔虹Ф闂侀潧臎閸涱垱顫岄梻鍌欑劍閹爼宕曞鍫濆窛妞ゆ牗绋掗锟�?
		fire.msp.npc.MUpdateNpcInfo mUpdateNpcInfo = new fire.msp.npc.MUpdateNpcInfo();
		mUpdateNpcInfo.npcs.addAll(rlist);
		fire.pb.scene.SceneClient.pSend(mUpdateNpcInfo);
		
		if (interfaceid > 0){
			fire.msp.npc.MCreateNpcUniversalRet mret = new fire.msp.npc.MCreateNpcUniversalRet();
			mret.interfaceid = interfaceid;
			mret.result = 1;
			mret.npclist.addAll(rlist);
			fire.pb.scene.SceneClient.pSend(mret);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 741900;

	public int getType() {
		return 741900;
	}

	public long interfaceid;
	public int objschool; // 寻找玩家所属的门派
	public int levelmin; // 最低等级
	public int levelmax; // 最高等级
	public fire.msp.npc.CreateNpcInfoUniverse npcinfo; // 找不到玩家时，按照npcinfo生成任务npc

	public GFindShoolQuestDemonsNpc() {
		npcinfo = new fire.msp.npc.CreateNpcInfoUniverse();
	}

	public GFindShoolQuestDemonsNpc(long _interfaceid_, int _objschool_, int _levelmin_, int _levelmax_, fire.msp.npc.CreateNpcInfoUniverse _npcinfo_) {
		this.interfaceid = _interfaceid_;
		this.objschool = _objschool_;
		this.levelmin = _levelmin_;
		this.levelmax = _levelmax_;
		this.npcinfo = _npcinfo_;
	}

	public final boolean _validator_() {
		if (!npcinfo._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(interfaceid);
		_os_.marshal(objschool);
		_os_.marshal(levelmin);
		_os_.marshal(levelmax);
		_os_.marshal(npcinfo);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		interfaceid = _os_.unmarshal_long();
		objschool = _os_.unmarshal_int();
		levelmin = _os_.unmarshal_int();
		levelmax = _os_.unmarshal_int();
		npcinfo.unmarshal(_os_);
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GFindShoolQuestDemonsNpc) {
			GFindShoolQuestDemonsNpc _o_ = (GFindShoolQuestDemonsNpc)_o1_;
			if (interfaceid != _o_.interfaceid) return false;
			if (objschool != _o_.objschool) return false;
			if (levelmin != _o_.levelmin) return false;
			if (levelmax != _o_.levelmax) return false;
			if (!npcinfo.equals(_o_.npcinfo)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)interfaceid;
		_h_ += objschool;
		_h_ += levelmin;
		_h_ += levelmax;
		_h_ += npcinfo.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(interfaceid).append(",");
		_sb_.append(objschool).append(",");
		_sb_.append(levelmin).append(",");
		_sb_.append(levelmax).append(",");
		_sb_.append(npcinfo).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

