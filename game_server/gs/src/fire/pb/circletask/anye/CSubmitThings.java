
package fire.pb.circletask.anye;
import fire.pb.HelpCountManage;
import fire.pb.item.ItemBase;
import fire.pb.item.Pack;
import fire.pb.npc.SubmitType;
import fire.pb.pet.PetColumnTypes;
import fire.pb.talk.MessageMgr;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSubmitThings__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSubmitThings extends __CSubmitThings__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		fire.pb.item.Pack submiterBag = new fire.pb.item.Pack(roleid, true);
		for (SubmitThing unit : things) {
			if (submittype == SubmitType.PET)
				continue;
			if (submittype == SubmitType.MONEY) {
				long money = unit.key;
				if (submiterBag.getMoney() < money)
					continue;
			} else {
				ItemBase bi = submiterBag.getItem(unit.key);
				if (bi == null) {
					continue;
				}
				if (bi.getNumber() < unit.num) {
					continue;
				}
			}
		}
		
		java.util.List<xbean.PetInfo> pis = null;
		if (submittype == SubmitType.PET) {
			pis = new java.util.ArrayList<xbean.PetInfo>();
			final fire.pb.pet.PetColumn petcol = new fire.pb.pet.PetColumn(roleid, PetColumnTypes.PET, true);
			for (SubmitThing unit : things) {
				fire.pb.pet.Pet pet = petcol.getPet(unit.key);
				if (pet == null || pet.isLocked() != -1)
					return;
				if (petcol.petIsFightPet(unit.key) || petcol.petIsShowPet(unit.key)) {
					MessageMgr.sendMsgNotify(roleid, 144418, null);
					return;
				}
				pis.add(pet.getPetInfo().copy());
			}
		}
		
		if (submittype == SubmitType.ITEM) {
			Pack bag = new Pack(roleid, true);
			for (SubmitThing unit : things) {
				ItemBase item = bag.getItem(unit.key);
				if (item == null)
					return;
			}
		}
		
		if (taskid == 1080000 && roleid != taskrole) {
			//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔戒氦缂傚倸鍊烽懗鑸靛垔鐎靛摜绀婂〒姘炬嫹鐎殿喖顭烽幃銏ゆ偖鐎涙ê顏堕梺姹囧灪椤旀牠鎮炴ィ鍐ㄥ唨闁跨喓濮甸埛鎴澝归崗鑲╂噮缂佸鍠栭湁婵犲﹤鍟伴崺锝囷拷娈垮枛椤兘骞冮姀銈嗘優闁革富鍙忕槐鍙夌節绾版ɑ顫婇柛銊╂涧閻ｇ兘鎮介悽鐢电厯闂佹悶鍎崝搴ｅ姬閿熻棄鈹戦悙鑼闁诲繑绻傞埢宥呂熸總鐣屾嚀椤劑宕熼鐘靛帨闂備胶纭堕弬鍌炲垂濞差亜绠氶柡鍐ㄧ墕鎯熼梺闈涳紡閸愩剱銈夋⒒閸屾瑧顦﹂柟璇х節瀹曟繆绠涘☉妯兼煣濠电姴锕ら悧婊堝极婵犲嫸鎷烽獮鍨姎妞わ缚鍗抽崺娑㈠箣閿旂晫鍘卞┑鐘绘涧濡顢旈埡鍌樹簻闊洦姊圭亸锕傛煛鐏炲墽娲村┑鈩冩倐婵″爼宕ㄩ鐘仏濠德板�楁慨鐑藉磻濞戞娑樷枎閹惧磭顔嗛梺鍛婄♁濞兼瑧绮堥崼銉︾厵缂備焦锚缁楁碍绻涢崨顓ㄨ含婵﹦绮幏鍛村川婵犲倹娈橀梻浣藉吹閸犲棝宕曟担鍐╊棨婵＄偑鍊栭悧妤冪矙閹烘鐭楅煫鍥ㄧ♁閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹
			//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧潡鏌熺�电啸缂侊拷婵犲洦鐓ラ柣鏃囶嚙琚氶梺闈涙搐鐎氭澘顕ｉ幘顔煎耿婵°倧鎷锋い蹇ｄ邯閺屾稑鈻庤箛鏇狀啋闂佸搫鐭夌紞渚�鐛崶顒夋晢濞达絿鎳撻崜鐢电磽閸屾瑨鍏屽┑顔惧厴瀵偅绻濆顒冩憰闂佹枼鏅涢崯顐ゆ閻愮儤鍊甸柨婵嗙凹缁ㄨ棄霉閻樿櫕灏﹂柟顔挎硾椤繈宕￠悙鎰╁劤缁辨帗娼忛妸锕�闉嶉梺鐟板槻閹虫ê鐣烽悜绛嬫晣婵炴垶鐟鏂库攽閿涘嫬浜奸柛濞у懐涓嶉柟鐑樻尪娴犲牓鏌熼梻鎾闁跨喕妫勯崯瀛樹繆閻戣棄鐓涘ù锝呮惈閿熺晫鍋涢—鍐Χ閸℃鐟愰柣鐘辩劍閻擄繝鐛幇鏉跨妞ゆ棁袙閹锋椽鎮峰鍛暭閻㈩垱甯楃粋宥嗗鐎涙鍘遍梺瑙勫劤椤曨參骞婇崶顒佺厵妞ゆ洖妫涚弧锟介梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�
			int submiterLv = xtable.Properties.selectLevel(roleid);
			if(submiterLv<fire.pb.circletask.PSubmitThings.getGiveHelpLevel()){
				MessageMgr.sendMsgNotify(roleid, 145390, null);
	    		return;
			}
			
			xbean.helpcount helpcount = xtable.Helpcount.select(roleid);
	    	int max=HelpCountManage.getInstance().getHelpGiveItemNumMax(roleid);
	    	if(helpcount!=null&&helpcount.getHelpgiveitemnum()>=max){
	    		MessageMgr.sendMsgNotify(roleid, 166088, null);
	    		return;
	    	}
	    	//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔芥祰闂傚倷鑳堕…鍫燁殽閸濄儻鎷峰☉鎺撴珚濠碉紕鏁诲畷鐔碱敍濮樿京娼夐梻浣侯焾閺堫剛绮欓幒妤佸仧妞ゅ繐鐗婇埛鎴︽煙閼测晛浠滃┑鈥炽偢閺屾洟宕奸悢绋匡拷鎰殽閻愭彃鏆㈤柕鍥ㄥ姍楠炴帡骞嬮悩璇ф嫹閻愬樊娓婚柕鍫濇缁楀倿鏌ｉ幒鐐电暤鐎殿喗濞婇幃鈺冪磼濡攱瀚兼繝鐢靛仩鐏忣亪顢欐繝鍕С闁稿繗鍋愮弧锟介梺闈涚箚濡插嫰鎳撻崸妤佺厱闁崇懓鐏濋悘顏堟煙椤栨稒顥堝┑鈩冩倐婵＄柉顦插┑顔肩埣濮婄粯鎷呴崨濠傛殘闂佸憡鏌ㄧ换妯侯嚕閹绘帩鐓ラ柛顐亝閺呪晠鎮楅獮鍨姎妞わ缚鍗抽崺娑㈠箣閿旂晫鍘卞┑鐘绘涧濡顢旈埡鍌樹簻闊洦姊圭亸锕傛煛鐏炲墽娲村┑鈩冩倐婵″爼宕ㄩ鐘仏濠德板�楁慨鐑藉磻濞戞娑樷枎閹惧磭顔嗛梺鍛婄♁濞兼瑧绮堥崼銉︾厵缂備焦锚缁楁碍绻涢崨顓ㄨ含婵﹦绮幏鍛村川婵犲倹娈橀梻浣藉吹閸犲棝宕曟担鍐╊棨婵＄偑鍊栭悧妤冪矙閹烘鐭楅煫鍥ㄧ♁閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹
	    	xbean.helpcount taskrolehelpcount = xtable.Helpcount.select((long) taskrole);
	    	int maxtaskrolehelpcount=HelpCountManage.getInstance().getHelpItemNumMax(taskrole);
	    	if(taskrolehelpcount!=null&&taskrolehelpcount.getHelpitemnum()>=maxtaskrolehelpcount){
	    		MessageMgr.sendMsgNotify(roleid, 166093, null);
	    		return;
	    	}
		}
		
		fire.pb.circletask.PSubmitThings proc= new fire.pb.circletask.PSubmitThings(roleid,taskrole,things,taskpos);
		mkdb.Procedure.execute(proc);
		return;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 807455;

	public int getType() {
		return 807455;
	}

	public int taskpos; // 任务栏位
	public int taskid; // 任务id
	public long taskrole; // 任务所属角色id(帮别人提交物品时用到)
	public int submittype; // 提交的类型 1道具 2宠物 3金钱
	public java.util.ArrayList<fire.pb.circletask.anye.SubmitThing> things; // 提交的道具key 或者宠物的key

	public CSubmitThings() {
		things = new java.util.ArrayList<fire.pb.circletask.anye.SubmitThing>();
	}

	public CSubmitThings(int _taskpos_, int _taskid_, long _taskrole_, int _submittype_, java.util.ArrayList<fire.pb.circletask.anye.SubmitThing> _things_) {
		this.taskpos = _taskpos_;
		this.taskid = _taskid_;
		this.taskrole = _taskrole_;
		this.submittype = _submittype_;
		this.things = _things_;
	}

	public final boolean _validator_() {
		if (taskpos < 0) return false;
		if (taskid < 0) return false;
		if (taskrole < 0) return false;
		if (submittype < 0) return false;
		for (fire.pb.circletask.anye.SubmitThing _v_ : things)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(taskpos);
		_os_.marshal(taskid);
		_os_.marshal(taskrole);
		_os_.marshal(submittype);
		_os_.compact_uint32(things.size());
		for (fire.pb.circletask.anye.SubmitThing _v_ : things) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		taskpos = _os_.unmarshal_int();
		taskid = _os_.unmarshal_int();
		taskrole = _os_.unmarshal_long();
		submittype = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.circletask.anye.SubmitThing _v_ = new fire.pb.circletask.anye.SubmitThing();
			_v_.unmarshal(_os_);
			things.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSubmitThings) {
			CSubmitThings _o_ = (CSubmitThings)_o1_;
			if (taskpos != _o_.taskpos) return false;
			if (taskid != _o_.taskid) return false;
			if (taskrole != _o_.taskrole) return false;
			if (submittype != _o_.submittype) return false;
			if (!things.equals(_o_.things)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += taskpos;
		_h_ += taskid;
		_h_ += (int)taskrole;
		_h_ += submittype;
		_h_ += things.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(taskpos).append(",");
		_sb_.append(taskid).append(",");
		_sb_.append(taskrole).append(",");
		_sb_.append(submittype).append(",");
		_sb_.append(things).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

