
package fire.msp.npc;
import fire.pb.move.SAddUserScreen;
import fire.pb.move.SRemoveUserScreen;
import fire.pb.scene.manager.SceneNpcManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GHideOrShowNpc__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GHideOrShowNpc extends __GHideOrShowNpc__ {
	@Override
	protected void process() {
		// protocol handle
		fire.pb.scene.config.TemplateNpc tnpc =  fire.pb.scene.manager.TemplateNpcManager.getInstance().getTemplateNpc(npcid);
		
		if(null == tnpc) return;
		if(tnpc.checkVisible() ==  (0==state)) return;
		
		tnpc.setVisible(0 == state);
		
		java.util.List<fire.pb.scene.movable.NPC> npcs = SceneNpcManager.getInstance().getNpcByID(npcid);
		if (!npcs.isEmpty()){
			if (state == 0){
				// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔筋焽閸樠勬櫠椤栫偞鐓涢柛娑欐緲閻撴劗绱掗崒娑樼闁跨喐鏋荤紞鍡涙晸缁涘寮跨紒鐘虫崌瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷    婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧潡鏌熺�电啸缂侊拷婵犲洦鐓ラ柣鏃囶嚙琚氶梺闈涙搐鐎氭澘顕ｉ幘顔煎耿婵°倧鎷锋い蹇ｄ邯閺屾稑鈻庤箛鏇狀啋闂佸搫鐭夌紞渚�鐛崶顒夋晩闁绘挸楠搁‖鍡涙⒒娴ｈ櫣甯涢悽顖滃仧閸掓帡顢涢悙鑼杽闂侀潧顭堥崕娆撴偄缁嬭法绐炵紓浣割儐鐎笛囧磿閹剧粯鈷掑ù锝呮啞閸熺偤鏌ｉ悢闂存喚妤犵偛绻橀幃婊堟嚍閵夈垺瀚奸梺鑽ゅТ濞诧箓鎮￠敓鐙�鏁佹俊銈呭暟绾惧ジ鏌ｅΟ鍨毢閺佸牓鎮楃憴鍕闁硅櫕鎸鹃崣鍛渻閵堝懐绠伴悗姘煎幖鍗辨い鎺炴嫹闁宠鍨块幃娆撳级閹寸姳妗撴繝娈垮枟鑿ч柛鏃�鍨甸悾鐑藉灳閹颁焦鍍靛銈嗘尰缁牏鑺辨繝姘拺闁告繂瀚ⅹ闂佸憡鏌ㄩ柊锝夊春閵夛箑绶為悗锝庡墰椤旀洟姊虹粙璺ㄧ闁告鍥ㄥ�堕柟缁㈠枟閻撴盯鎮橀悙鎻掆挃婵炴彃顕敓鑺ヮ問閸ｎ噣宕抽敐鍛殾闁圭儤鍩堝鈺傘亜閹炬鍟弳妤禖
				for (fire.pb.scene.movable.NPC npc : npcs){
					npc.setVisible(true);
					final SAddUserScreen snd = new SAddUserScreen();
					snd.npclist.add(npc.getNpcBase());
					npc.sendAround(snd);
				}
			}
			else if (state == 1){
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缂佺姷濞�閻擃偊宕堕妸褉妲堢紓渚婃嫹濠㈣泛顑勭换鍡樸亜閺嶃劎鎳呯紒澶嬪缁绘盯骞嬪▎蹇曚痪闂佸搫鎳忛幃鍌炲蓟閵娾晜鍋嗛柛灞剧☉椤忥拷
				for (fire.pb.scene.movable.NPC npc : npcs){
					npc.setVisible(false);
					final SRemoveUserScreen snd = new SRemoveUserScreen();
					snd.npcids.add(npc.getUniqueID());
					//final int screenindex = npc.getPos().toScreenPos().getScreenIndex();
					npc.sendAround(snd);
				}
			}
		}
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730421;

	public int getType() {
		return 730421;
	}

	public int npcid; // 要隐藏或显示的npc
	public int state; // 1表示隐藏，0表示隐藏

	public GHideOrShowNpc() {
	}

	public GHideOrShowNpc(int _npcid_, int _state_) {
		this.npcid = _npcid_;
		this.state = _state_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npcid);
		_os_.marshal(state);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npcid = _os_.unmarshal_int();
		state = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GHideOrShowNpc) {
			GHideOrShowNpc _o_ = (GHideOrShowNpc)_o1_;
			if (npcid != _o_.npcid) return false;
			if (state != _o_.state) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += npcid;
		_h_ += state;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npcid).append(",");
		_sb_.append(state).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GHideOrShowNpc _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = npcid - _o_.npcid;
		if (0 != _c_) return _c_;
		_c_ = state - _o_.state;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

