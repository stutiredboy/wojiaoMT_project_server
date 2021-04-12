
package fire.pb.npc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CStartFortuneWheel__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CStartFortuneWheel extends __CStartFortuneWheel__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		fire.pb.map.Npc npc = fire.pb.map.SceneNpcManager.selectNpcByKey(npckey);
		if (npc ==null){
			fire.log.LogManager.logger.info("npc is null.npckey:"+npckey);
			return;
		}
		// protocol handle
		//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃缂侇噮鍨抽幑銏犫槈閵忕姷顓洪梺鍝勫枦閹风兘鏌涢妶鍛ч柡灞剧洴婵＄兘顢欓悡搴樻嫽闂備浇妗ㄧ粈浣该洪銏犺摕闁哄浄绱曢悿锟介梺鍝勬川閸婎偊濮�閵堝棛鍘介柟鍏兼儗閸犳牠鐛弽顓熺厓閻熸瑥瀚悘鎾煙椤旂晫鎳囩�规洩绲惧鍕幢濡棿绨藉┑鐘垫暩閸嬫盯鎮洪妸褍鍨濈�广儱娲ら崹婵嬫煙閹规劦鍤欑紒鐙�鍨堕弻鐔告綇妤ｅ啯顎嶉梺绋款儏鐎氼剟鍩為幋锕�纾兼慨妯哄悑妤旈梻浣告憸閸嬬喖寮拠宸綎婵炲樊浜滅粈鍌炴煕韫囨洖甯堕柨鐔诲Г閸旀牜鎹㈠☉娆愬闁告劖褰冮顏堟煕濞嗗繒绠婚柡灞剧洴婵＄兘顢欓悡搴浇闂備胶绮幐楣冨窗閺嶎厼钃熼柡鍥ュ灩闁卞洦绻濋棃娑卞剾闁跨喕濮ら〃鍡欐崲濞戙垹宸濇い鎾跺瑜旈弻鈥崇暆鐎ｎ剛锛熸繛瀵稿缁犳挸鐣峰鍡╂Ъ闂佸憡甯楅惄顖氼潖閾忕懓瀵查柡鍥╁枑閻濇棃鏌ｆ惔銏㈩暡婵犮垺锕㈤幃鎯х暋闁附寤洪梺璺ㄥ枍缁瑥鐣峰ú顏呮櫢闁绘灏欓ˇ銊╂⒑缂佹ê濮﹂柛搴ｅ厴閹瑩鎮滃Ο閿嬪闂備胶顭堥張顒勬偡瑜斿畷婵嗩吋閸℃洜绠氶梺缁樺姈濞兼瑩顢氬鍛＜闁稿本姘ㄥ瓭闂佸疇顕ч柊锝夌嵁鐎ｎ亖鏀介柛鈩冪懁閸犲﹤鈹戦悩鍨毄闁稿绋戣灋婵炲棙鎸哥粻浼存煙闂傚鍔嶉悗姘嚇閺岋綁寮崹顔藉�梺缁樻尪閸庤尙鎹㈠┑瀣棃婵炴垶鐟辩槐鐐测攽閳ュ啿绾ч柟顔煎�块悰顕�宕卞☉娆忎簻闂佺绻愰惃鐑藉箯濞差亝鈷掗柛灞炬皑婢ф稑銆掑顓ф當閸楅亶鏌涢锝嗙闁绘挻娲熼獮鏍ㄦ綇閸撗冨煂闂佸憡鏌ㄩ鍥╂閹烘纾兼繛鎴烆焽閻熻尙绱撴担鑺ャ�冪紒顔界懃閻ｇ兘濡搁敂鍓ь啎闂佺粯鍔﹂崜娆擃敂瑜版帗鈷掗柛灞捐壘閿熻姤鎮傚畷鎰板箹娴ｇ懓浜辨繝鐢靛Т鐎氼噣鎯屽▎鎾寸厵闁绘垶锕╁▓鏃傜磼閻樿尙绉洪柡宀�鍠栭弻鍥晝閿熶粙鐛Ο鑲╃＜闁绘宕甸悾娲煙椤旇偐绉虹�规洖鐖煎畷鎯邦槼闁革絼绮欓弻锟犲幢濞嗗警銏°亜椤忓嫬鏆ｅ┑陇鍩栭幆鏃堝灳瀹曞浂鍟囧┑鐘垫暩閸嬫稑螣婵犲洤鐭楅柛鎰靛枛杩濇繛鎾寸啲閹烽锟芥鍣崳锝呯暦閻撳簶鏀介悗锝庝簼閺嗩亜鈹戦敍鍕杭闁稿﹥鐗犲畷婵婎槾鐎垫澘锕獮鍡氼槷闁哄绉堕敓鐣屾閹风兘鏌涢弴銊ュ幋闁归绮换娑欐綇閸撗冾嚤闁荤媴鎷烽柨鏇炲�归崐鍨旈敐鍛殲闁绘挻鐩弻娑㈩敃椤愵澀绨绘繝鈷�鍕棆缂佽鲸甯￠、娆撴偩鐏炴儳娅氭俊銈囧Х閸嬬偤鈥﹂崶鈺傤潟闁圭儤鍤﹂悢铏圭＜婵☆垳鍘у娲⒒閸屾艾锟藉嘲霉閸パ�鏋栭柡鍥ュ灩闂傤垶鏌ㄩ弴鐐诧拷鍝ョ不椤栫偞鐓ラ柣鏇炲�圭�氾拷
		new PReqFortuneWheel(roleid, npckey,npc.getNpcID(),true,fire.pb.npc.NpcServices.FORTUNE_WHEEL).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795494;

	public int getType() {
		return 795494;
	}

	public long npckey; // 正在交互的Npckey

	public CStartFortuneWheel() {
	}

	public CStartFortuneWheel(long _npckey_) {
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CStartFortuneWheel) {
			CStartFortuneWheel _o_ = (CStartFortuneWheel)_o1_;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CStartFortuneWheel _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

