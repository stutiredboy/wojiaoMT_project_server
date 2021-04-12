
package fire.pb.pet;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSetFightPet__ extends mkio.Protocol { }

/** 请求宠物参战
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSetFightPet extends __CSetFightPet__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0 || !fire.pb.StateCommon.isOnline(roleid))
			return;

		Long battleId = xtable.Roleid2battleid.select(roleid);
		if (battleId == null) {
			PSetFightPetProc proc = new PSetFightPetProc(roleid, petkey, true);
			proc.submit();
		} else {
			// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垹绠婚悗闈涙啞閸掓稑顪冮妶鍐ㄧ仾闁挎洏鍨归悾鐑筋敃閿曪拷缁�瀣煏婵犲繘妾柡澶嬫倐濮婄粯鎷呴崫銉︾�┑鈽嗗亜鐎氼剝鐏嬪┑掳鍊曢幊蹇涘磹閸洘鐓ユ繝闈涙瀹告繄鐥幆褍鎮戦柕鍥у瀵挳鎮欓弶鎴烆仩闂備浇顕ф蹇曠不閹捐钃熼柣鏃傗拡閺佸﹪鏌ｉ褍浜藉ù婊庝邯閵嗕礁螣閼姐倝妾紓浣割儏閻忔繄绮ｅ☉姗嗘富闁靛牆鎳愮粻浼存煙瀹勯偊鍎忔い顓炴喘瀵噣宕奸悢鍙夊濠电偠鎻徊鍧楀磿閵堝鍚归柨鐔剁矙濮婅櫣鎷犻懠顒傤唹缂備浇顕ч悧鍡涙偩閻戠瓔鏁嶉柣鎴濇閺呮繈姊洪幐搴⑩拹闁稿骸纾划濠囨晝閿熶粙鍩為幋鐐茬疇闂佺锕ュú鐔风暦閺夊簱妲堥柕蹇曞Х椤斿棙淇婇悙宸剰閻庢稈鏅犲畷浼村幢濞戞瑧鍘遍梺鍝勬储閸斿本鏅堕悧鍫涗簻闁挎棁顕у▍宥夋煛瀹�瀣К缂佺姵鐩獮姗�宕滄笟鍥ф暭闂傚倷娴囧畷鐢稿疮閸ф鐤鹃柣妯烘▕閸ゆ洘銇勯幇鍓佺暠缂佺姴顭烽幃褰掑炊瑜嶇痪褎銇勯妷锔剧疄婵﹥妞藉Λ鍐ㄢ槈濮橆剦鏆繝纰樻閸嬪懘銆冩繝鍥ワ拷渚�寮崼鐔告闂佽法鍣﹂幏锟�?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎处缁绘繂顕ラ柨瀣凡闁跨喕濮ゅú鐔肩嵁婵犲懐鐤�婵炴垶顭囬敍娑㈡⒑鐠恒劌鏋斿┑顔炬暬閹繝濡烽埡鍌滃幐闂佹悶鍎弲娑欑濠婂牊鐓ラ柣鏃囶嚙琚氶梺璇″枛閸婃悂鎮鹃悿顖樹汗闁圭儤鍨归敍婊冣攽閻愭潙鐏﹂柣妤佹⒒閼鸿鲸绻濆顓涙嫼闂侀潻瀵岄崢濂稿礉鐎ｎ喗鐓曢柕濞у嫭姣堝銈冨灪濡啴宕洪敓鐘茬＜婵炲棙鍨归悾鐐繆閻愵亜锟芥牠宕濊缁辨挻寰勯幇顒傤吅闂佺粯鍔楅。浠嬪绩閾忣偆绡�闁汇垽娼у瓭濠电偛鐪伴崐鏇灻洪崸妤佲拻濞达絽鎲￠崯鐐层�掑顓ф疁鐎规洏鍨介幐濠冨緞閸℃浜栭梺鑽ゅ█缂傛岸濡撮敓浠嬫煛閿熻姤绂掔�ｎ偆鍘介梺褰掑亰閸撴岸鍩㈤弴鐔剁箚闁圭粯甯為崺锝夋煛鐏炲墽娲村┑鈩冩倐婵″爼宕堕埡鍐ㄥ箚闂佽瀛╅鏍窗閺嶎厸锟斤箓鎮滈挊澶嬫К闂佸憡娲﹂崹鎵矆閸愵喗鐓忓┑鐐戝啯鍣界�规挷绶氬缁樻媴缁涘娈紓浣虹帛鐢�崇暦閹达附鍋愰柧蹇ｅ亜瀵潡姊洪棃娑氬妞わ缚鍗冲畷鎰版濞戞帗鏂�闂佺粯锚绾绢參銆傞弻銉︾厓闂佸灝顑呴悘鎾煙椤旇偐绉虹�规洖鐖奸弫鎰疀閺傛浼撻梻浣瑰劤濞存岸宕戦崱妯碱洸闁肩鍚�缁诲棝鏌ｉ幇鍏哥盎闁跨喕濮ら崹鍨暦濠靛棛鏆嗛柛鏇ㄥ墯濞呭洤顪冮妶鍛闁绘绻愰悾鍨瑹閿熶粙寮诲☉銏犵疀闁靛闄勯悵鏍ь渻閵堝倹娅囬柛蹇旓耿楠炲啫螖閸涱喗娅滈柟鑲╄ˉ閿熷�熷皺閻╁骸鈹戦悙鑼憼缂侇喖绉堕崚鎺楀箻閹颁焦缍庡┑鐐叉▕娴滄粌顔忓┑鍡忔斀闁绘ɑ褰冮銈嗕繆閹绘帞澧︽慨濠冩そ楠炴劖鎯旈姀顫喘闂備胶顭堝ù鐑藉极婵犳氨宓侀柛鎰靛枟閸嬨劑鏌涘☉姗堟敾婵炲懌鍨藉铏规崉閵娿儲鐝㈤梺鐟板殩閹凤拷
			mkdb.Procedure proc = new mkdb.Procedure() {
				@Override
				protected boolean process() throws Exception {
					final xbean.BattleInfo battle = xtable.Battle.get(battleId);
					if (battle != null) {
						Integer index = battle.getRoleids().get(roleid);
						if (index != null) {
							xbean.Fighter fighter = battle.getFighters().get(index);
							if (fighter != null) {
								fighter.setInipetkey(petkey);
								fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 180031);
							}
						}
					}
					return true;
				}
			};
			proc.submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788440;

	public int getType() {
		return 788440;
	}

	public int petkey; // 请求参战的宠物

	public CSetFightPet() {
	}

	public CSetFightPet(int _petkey_) {
		this.petkey = _petkey_;
	}

	public final boolean _validator_() {
		if (petkey < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(petkey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		petkey = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSetFightPet) {
			CSetFightPet _o_ = (CSetFightPet)_o1_;
			if (petkey != _o_.petkey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += petkey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(petkey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSetFightPet _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = petkey - _o_.petkey;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

