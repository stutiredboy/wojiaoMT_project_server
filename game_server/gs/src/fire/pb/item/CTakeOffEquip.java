
package fire.pb.item;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CTakeOffEquip__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CTakeOffEquip extends __CTakeOffEquip__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid( this );
		if (roleId < 0)
			return;
		
		if (fire.pb.buff.Module.existState(roleId, fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleId, 131451, null);
			return;
		}
		// protocol handle
		new mkdb.Procedure(){

			@Override
			protected boolean process() throws Exception {
				final Equip srcbag = new Equip(roleId, false);
				final ItemMaps dstbag = new Pack(roleId, false);
				
				ItemBase bi = srcbag.TransOut(equipkey, -1, "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮堥柕鍥у瀵挳鎮欓幖顓燂紒闂佽瀛╅懝鍓х礊婵犲洤钃熸繛鎴欏灩缁犳盯鏌曟繝蹇涙闁绘繃鐗滅槐鎾存媴閸欏娼愰梺褰掝棑閸忔ê顫忕紒妯诲閻熸瑥瀚禒鈺呮⒑缁嬪灝顒㈢紒顔芥尭閻ｇ兘濡搁埡濠冩櫓闂佽鍨庨崘銊ユ尋闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帪鎷风痪鎯ь煼閺岀喖鎮ч崼鐔哄嚒闂佺粯鎸诲ú鐔煎蓟濞戙埄鏁冮柣妯诲絻婵海绱撴笟濠冨闂佸壊鍋嗛崰鎾剁不妤ｅ啯鐓欓悗鐢殿焾娴狅箓鏌ｉ妸锕�鐏ラ柍钘夘樀楠炴ê鐣烽崶鍠插洦鐓涚�癸拷鐎ｎ剛鐦堥悗瑙勬礃閿曘垺淇婂宀婃Щ濡炪們鍊ч幏鐑芥⒒閸屾瑨鍏岀紒顕呭灦楠炴劗鎷犵憗浣告惈铻ｉ柛蹇曞帶鎼村﹤鈹戦悙鏉戠仧闁搞劌婀辩划濠氭晲閸℃瑧鐦堥梻鍌氱墛缁嬫帡藟閿熺姵鐓曢柍鍝勫暙娴犺鲸鎱ㄦ繝鍛仩闁归濞�瀵濡疯濡炵晫绱撻崒娆掑厡缂侇噮鍨抽幑銏ゅ醇濠垫劕娈ㄩ柣鐘叉处缁佹潙危閸儲鐓忛煫鍥ь煭閹风兘宕楅崨顖滄晨缂傚倸鍊搁崐椋庣矆娓氾拷椤㈡牠宕煎┑鍐╃亙闂佸搫娲ㄩ崰搴敋鏉堚晪鎷烽惂鍛婂闂佸憡娲﹂崗姗�骞忓ú顏呪拺闁告稑锕︾粻鎾绘倵濮樼厧骞栭柨鏇樺灲楠炲秹顢欓崜褝绱查梺璇插嚱缂嶅棝宕戦崟顖涘�堕柟缁㈠枟閻撴洟鏌嶉悷鎵虎闁告梹绮庨敓钘夌仛濠㈡锟芥矮鍗抽悰顕�宕堕澶嬫櫌闂佺琚崐鏍极閵堝鈷掗柛灞剧懆閸忓瞼绱掗鍛仸鐎规洘绻堝浠嬵敄閸欍儲鐫忛梻浣告啞閸旓箓宕抽锟藉顐﹀幢濡偐鐦堟繝鐢靛Т閸婃悂顢旈銈囩＜闁宠棄鎳忕�氬綊姊虹拠鍙夋崳闁轰礁鎲￠弲璺何旈崨顔硷拷鑸垫叏濡寧纭剧痪鎯х秺閺屾洟宕煎┑鎰﹂梺鍛婅壘缂嶅﹪骞冨Δ鍛櫜閹肩补鍓濋悘宥夋⒑缂佹ɑ灏伴柣鐔叉櫊瀵鈽夐姀鐘殿吅濠电偛妫楁蹇涘箯閻戣棄鍐�妞ゆ劦鍓氱�氳鎱ㄥΟ鐓庝壕閻庢熬鎷�");
				if (bi == null)
					return false;
				ItemBase dstitem;
				java.util.List<Integer> freepos = dstbag.getFreepos();
				if (freepos.size() > 0) {
					posinpack = freepos.get(0);
				} else {
					return false;
				}
				if (posinpack != -1)
					dstitem = dstbag.getItemByPos(posinpack);
				else
					dstitem = null;
				if (dstitem != null) {
					return false;
				}
				if (!dstbag.TransIn(bi, posinpack))
					return false;
				if (bi instanceof EquipItem)
					srcbag.onUnequip((EquipItem) bi);
				
				return true;
			}
			
		}.submit();
	}
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787446;

	public int getType() {
		return 787446;
	}

	public int equipkey;
	public int posinpack;

	public CTakeOffEquip() {
	}

	public CTakeOffEquip(int _equipkey_, int _posinpack_) {
		this.equipkey = _equipkey_;
		this.posinpack = _posinpack_;
	}

	public final boolean _validator_() {
		if (equipkey < 1) return false;
		if (posinpack < -1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(equipkey);
		_os_.marshal(posinpack);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		equipkey = _os_.unmarshal_int();
		posinpack = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CTakeOffEquip) {
			CTakeOffEquip _o_ = (CTakeOffEquip)_o1_;
			if (equipkey != _o_.equipkey) return false;
			if (posinpack != _o_.posinpack) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += equipkey;
		_h_ += posinpack;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(equipkey).append(",");
		_sb_.append(posinpack).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CTakeOffEquip _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = equipkey - _o_.equipkey;
		if (0 != _c_) return _c_;
		_c_ = posinpack - _o_.posinpack;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

