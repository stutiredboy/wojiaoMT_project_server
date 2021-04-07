
package fire.msp.move;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __MDestroyDynamicScene__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class MDestroyDynamicScene extends __MDestroyDynamicScene__ {
	@Override
	protected void process() {
		// protocol handle
		if (scenetype == fire.pb.move.DynamicSceneType.DREAMLAND_SCENE) {
			for (Long roleid : roleids) 
			if (fire.pb.mission.Module.getInstance().hasUnfinishedFairylandMission(roleid)>0) {
				     //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閼碱剦鍟囬梻浣稿暱閹碱偊骞婃惔銊ュ瀭闁稿瞼鍋為悡鏇熶繆閵堝懎鏆欓柛鎾村▕閺屻倝寮剁捄銊よ檸闂傚洤顦甸弻锝夊箻閾忣偅宕抽梺鍦櫕婵烇拷闁哄矉缍侀獮娆撳礋椤掞拷椤忥拷?婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖闂傤垱銇勯弽銊х煀缂佽翰鍊曢埞鎴﹀磼濮橆厼鏆堥梺绋匡工濞硷繝寮婚妸鈺佸嵆妞ゅ繐鎳庨鑸典繆閻愵亜锟姐倖绂嶅鍫濈柈闁哄鍨归弳锕傛煙閻戞ê鐒炬繛灏栨櫊閺岋綁骞橀崘宸妷濡炪倖鎸搁悘婵嬪煘閹寸偛绠犻梺绋磕涢崶銊㈡寖闂佸憡娲﹂崹濂稿极閸曨剛绠鹃柛鈩兩戠亸顓犵磽娴ｅ弶娅呴棁澶愭煟濡儤鈻曢柛搴㈠姍閺屾稓锟斤絽澧庣粔顕�鏌＄仦鍓р槈闁宠鍨垮畷鍗炍旀繝浣虹；闂傚倷绀侀幖顐︻敄閸涙潙鐤い鏍ㄧ矋瀹曞弶绻涢幋娆忕仼缂佺嫏鍥ㄧ厵閻庣數顭堥崜杈ㄤ繆椤愵剛鐣垫慨濠呮閹风娀鍨惧畷鍥﹀摋闂備礁鎽滈崰鎰焽濞嗘挻鍋╅柣鎴ｅГ閸嬪嫮鐥幏宀勫摵闁哄拑缍佸铏圭磼濡椿姊垮┑鐐叉嫅缁蹭粙鎮鹃悜钘夐唶闁哄洨鍟块幏缁樼箾鏉堝墽鍒版繝锟介崡鐑囪�垮ù鐘差儐閻撴洟鏌￠崒婵囩《闁诲繘浜堕弻銊╂偄鐠囨畫鎾绘煕閹存繄绉虹�规洘绮岄埢搴ㄥ箻鐎涙ɑ鐝栭梻渚�娼х换鍫ュ磹閺囩姷涓嶇紓浣骨滄禍婊堟煛閸愩劍澶勬い銉ヮ槹缁绘盯宕奸悢宄邦潓濡炪値浜滈崯瀛樹繆閸洖骞㈡繛鍡楁禋濞奸攱绻濆▓鍨灍閼垦囨煕閺冿拷閸ㄧ敻顢氶敐澶婄闁芥ê顦辨鍥煙閻撳海鎽犻柟绋款煼閿濈偛顓兼径瀣ф嫼闁荤喐鐟ョ�氼剟宕濋妶鍥╂／缂備降鍨归獮妤呮煟濡わ拷鐎涒晝鎹㈠┑鍡╁殫闁哄鍋勯敓鑺ユ礋閹啴鎮滃Ο闀愮盎濡炪倖鎸鹃崑鐔告櫠閿曞倹鐓ユ繝闈涚墕娴犫晝绱掗悩宕団槈闁宠棄顦埢搴ㄥ箛椤撶姴绲块梻鍌氬�峰ù鍥р枖閺囥垹绐楃�广儱娲ら崹婵囩箾閸℃ɑ灏潻婵嬫⒑缁嬭法鐏遍柛瀣仱瀵煡骞栨担鍦弳闂佺粯娲栭崐鍦拷姘炬嫹,闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ｅΟ璇插闁稿鍔戝铏规崉閵娿儲鐝㈤梺鐟板殩閹凤拷?濠电姷鏁告慨鐢割敊閺嶎厼绐楁俊銈呮噳閿熸枻绠撳畷濂告偄娓氼垱閿ゆ俊鐐�栫敮鎺旓拷姘煎墴閹苯螖閸涱喚鍙嗛梺缁樻煥婢у酣鎯屽▎鎾寸厸鐎癸拷鐎ｎ剛蓱闂佽鍨卞Λ鍐极瀹ュ绀嬫い鎾跺枑椤斿棝姊婚崒娆戝妽闁诡喖鐖煎畷婵嗩吋閸滀焦瀵岄梺鑺ッˇ閬嶅汲閿曞倹鐓曟繝闈涙椤忋倖淇婇幓鎺斿闁逛究鍔岃灒闁告繂瀚崺鐐烘倵鐟欏嫭绌块柟鍑ゆ嫹?
					fire.pb.mission.SFairylandStatus sds = new fire.pb.mission.SFairylandStatus();
					sds.status = fire.pb.mission.FairylandStatus.LANDABSENT;
					if (mkdb.Transaction.current()==null) 
					    gnet.link.Onlines.getInstance().send(roleid, sds);
					else 
						mkdb.Procedure.psendWhileCommit(roleid, sds);
				
			}else {//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ婢舵劖鐓ユ繝闈涙閸ｈ銇勯妷銉х缂佺粯鐩畷妤呮嚃閳轰讲鎷伴梻浣告惈鐞氼偊宕濋幋婵愬殨闁圭虎鍣弫鍌炴煕濞戝崬寮惧ù鍏兼尭閳规垿鏁嶉崟顐℃澀闂佺臎閸涱厾绛忔繝鐢靛У閼瑰墽绮堟径宀嬫嫹楠炲灝鍔氭繛灞傚姂閹本寰勯幇顓犲幍闂佺粯鍨惰摫闁抽攱鍔欓幃妤�顫濋鐐叉懙闂佸搫鐬奸崰鎾舵閹烘嚦鐔告姜閺夊灝鐏佸┑鐘垫暩閸嬬喖濡寸�ｎ喖绠柨鐕傛嫹
				fire.pb.mission.SFairylandStatus sds = new fire.pb.mission.SFairylandStatus();
				sds.status = fire.pb.mission.FairylandStatus.LANDOUT;
				if (mkdb.Transaction.current()==null) 
				    gnet.link.Onlines.getInstance().send(roleid, sds);
				else 
					mkdb.Procedure.psendWhileCommit(roleid, sds);
			}
		}
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 724913;

	public int getType() {
		return 724913;
	}

	public long sceneid; // 场景模块创建的场景ID
	public long ownerid; // 副本的所有者ID(可能是角色ID,也可能是团体ID)
	public int scenetype; // 副本场景的类型，如果为0，表示为静态场景
	public java.util.LinkedList<Long> roleids; // 副本销毁时被强行踢出副本的roleid

	public MDestroyDynamicScene() {
		roleids = new java.util.LinkedList<Long>();
	}

	public MDestroyDynamicScene(long _sceneid_, long _ownerid_, int _scenetype_, java.util.LinkedList<Long> _roleids_) {
		this.sceneid = _sceneid_;
		this.ownerid = _ownerid_;
		this.scenetype = _scenetype_;
		this.roleids = _roleids_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(sceneid);
		_os_.marshal(ownerid);
		_os_.marshal(scenetype);
		_os_.compact_uint32(roleids.size());
		for (Long _v_ : roleids) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		sceneid = _os_.unmarshal_long();
		ownerid = _os_.unmarshal_long();
		scenetype = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			long _v_;
			_v_ = _os_.unmarshal_long();
			roleids.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof MDestroyDynamicScene) {
			MDestroyDynamicScene _o_ = (MDestroyDynamicScene)_o1_;
			if (sceneid != _o_.sceneid) return false;
			if (ownerid != _o_.ownerid) return false;
			if (scenetype != _o_.scenetype) return false;
			if (!roleids.equals(_o_.roleids)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)sceneid;
		_h_ += (int)ownerid;
		_h_ += scenetype;
		_h_ += roleids.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(sceneid).append(",");
		_sb_.append(ownerid).append(",");
		_sb_.append(scenetype).append(",");
		_sb_.append(roleids).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

