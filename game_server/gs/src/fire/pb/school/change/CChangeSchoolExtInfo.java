
package fire.pb.school.change;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangeSchoolExtInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChangeSchoolExtInfo extends __CChangeSchoolExtInfo__ {
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;

		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞剧洴楠炲洭顢涘鍗烆槱闂備焦鐪归崹褰掆�﹀畡閭︽綎缂備焦蓱婵挳鏌ｉ悢鐓庝喊闁搞倕顑呴埞鎴︽倷閹绘帞楠囬梺缁橆殘婵挳鎮鹃悜钘夌疀闁哄娉曢鎰箾鏉堝墽鎮兼い顓炵墦閹顢橀姀鈾�鎷虹紓浣割儓濞夋洟鎮橀柆宥嗙厱閻庯綆鍓欐禒閬嶆煙椤曞棛绡�濠碉紕鍏橀崺锟犲磼濠婂啫绠洪梻鍌欑閹碱偄煤閵娾晛纾绘繛鎴欏灪閺呮悂鏌﹀Ο渚Ч閻犳劧绻濋弻銊╂偄鐠囨畫鎾绘煟閺冩垵澧存鐐茬箻閺佹捇鏁撻敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐鍛傜喎鈻庨幆褎顔勭紓鍌欒兌婵挳鎮樺璺何﹂柛鏇ㄥ枤閻わ拷闂佸湱鍋撻幆灞轿涢妶鍥╃＝濞撴艾锕ョ�氳绻濋悽闈浶㈡繛璇х畵閹繝濡烽埡鍌滃幗闂佸搫鍟崐鑽ゆ暜濞戞瑣浜滈柕澶堝労濡拷闂佸搫鑻粔鍫曞箟閹绢喖绀嬫い鎰╁�撶槐婵囦繆閻愵亜锟芥垿宕瑰ú顏呭仭闁宠桨鑳堕弳锔姐亜閹板墎鐣辩紒锟界�ｎ喗鐓犻柟闂寸劍濞懷勩亜韫囨碍纭鹃柍瑙勫灦楠炲﹪鏌涙繝鍐╃鐎规洦鍨堕、鏇㈡晝閿熶粙宕归崒娑氱瘈闂傚牊绋掗ˉ鎴︽煛閿熻姤绂掔�ｎ偆鍘藉┑鈽嗗灠閹碱偆鐥缁辨帗鎷呴崣澶嬬彋闂佸搫澶囬崜婵嬪箯閸涙潙绀堥柟缁樺笒婢瑰酣姊绘担鍛婃儓閻炴凹鍋婂畷婵嬪箣閿曪拷缁犳牠鏌曡箛瀣拷鏇犵矆閸緷褰掓晲閸噥浠╅梺鍛婏供閸ㄥ爼寮婚敐鍡樺劅闁靛繆鏅涢弲閬嶆⒑閸濄儱校闁绘濞�閸ㄩ箖鏁冮崒娑氬弳闁诲函绲洪弲婵堢不濮樿埖鈷戦柛蹇撳悑閸婃劖绻涙担鍐叉噺椤愪粙鏌ｉ幇顓犮偞闁猴拷娴犲鐓熸俊顖濐嚙缁茬粯銇勮箛鏃�灏﹂柡宀嬬節閺佹挻绂掔�ｎ�晠鏌嶉崫鍕拷鐢稿箯缂佹绠鹃弶鍫濆⒔缁夘剚绻涢崪鍐偧闁轰緡鍠栭埥澶愬閿涘嫬骞堥梻浣告惈閸犳盯骞忛柨瀣闁告瑥顦辨晶鎶芥煟韫囨柨绗氱紒缁樼箞閹粙妫冨ù韬插灲閺屾稒绻濋崟顒佹瘓閻庢鍠楅幃鍌氼嚕椤曪拷閺佹挻绂掔�ｎ�箓鏌涢弴銊ョ仩缂佺姴顭烽幃褰掓惞閻熸澘濡洪梺璇茬箣閼冲墎妲愰幘瀛樺闁告繂瀚ч弸鍛磽娴ｅ搫校闁绘濮撮锝嗙節濮橆儵鈺呮煏婢跺牆鐏柡鍌︽嫹闂傚倷鑳剁涵鍫曞礈濠靛鏅繝鐢靛仜閹冲矂宕愬┑鍡╂綎婵炲樊浜濋崑锟犳煛婢跺顕滈柛濠庡灦濮婃椽宕ㄦ繝鍐ｆ嫻闂佽崵鍟块弲娑㈩敋閿濆棛绡�婵﹩鍎甸埡鍛厓閺夌偞澹嗛ˇ锔撅拷瑙勬尭濡繂顫忓ú顏咁棃婵炴垼浜崝鎼佹⒑缁嬪尅鏀荤紒璇茬墕閻ｇ兘骞嬪顏呮瀹曘劑顢欑憴鍕伖缂傚倸鍊搁崐鐑芥倿閿旂偓绠掔紓鍌欑閻栧吋绂嶉崼鏇炶摕婵炴垯鍨洪弲鏌ョ叓閸ャ劍绀堢悮锕傛煟鎼淬埄鍟忛柛锝庡櫍瀹曟垶绻濋崶鈺佺ウ濠碘槅鍨甸崑鎰閸忛棿绻嗘い鏍ㄧ矌鐢稒銇勮箛鏇炴灈婵﹦绮幏鍛存嚍閵壯侊拷濠囨⒑闂堚晝绉剁紒鐘虫崌閻涱喛绠涘☉娆愭闂佽法鍣﹂幏锟�?
				SChangeSchoolExtInfo send = new SChangeSchoolExtInfo();
				xbean.ChangeSchoolInfo info = xtable.Changeschool.select(roleId);
				if (info != null) {
					int maxChangeWeaponCount = ChangeSchoolUtils.getMaxChangeWeaponCount();
					int maxChangeGemCount = ChangeSchoolUtils.getMaxChangeGemCount();
					send.remainchangeweaponcount = Math.max(maxChangeWeaponCount - info.getChangeweaponcount(), 0);
					send.remainchangegemcount = Math.max(maxChangeGemCount - info.getChangeweaponcount(), 0);
				}
				mkdb.Procedure.psendWhileCommit(roleId, send);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810487;

	public int getType() {
		return 810487;
	}

	public int oldkey; // 旧武器的Key

	public CChangeSchoolExtInfo() {
	}

	public CChangeSchoolExtInfo(int _oldkey_) {
		this.oldkey = _oldkey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(oldkey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		oldkey = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangeSchoolExtInfo) {
			CChangeSchoolExtInfo _o_ = (CChangeSchoolExtInfo)_o1_;
			if (oldkey != _o_.oldkey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += oldkey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(oldkey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CChangeSchoolExtInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = oldkey - _o_.oldkey;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

