
package fire.pb.mission;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqMissionCanAccept__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqMissionCanAccept extends __CReqMissionCanAccept__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid( this );
		if ( roleid < 0 )
			return;
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞剧洴楠炲洭顢涘鍗烆槱闂備焦鐪归崹褰掆�﹀畡閭︽綎缂備焦蓱婵挳鏌ｉ悢鐓庝喊闁搞倕顑呴埞鎴︽倷閹绘帞楠囬梺缁橆殘婵挳鎮鹃悜钘夌疀闁哄娉曢鎰箾鏉堝墽鎮兼い顓炵墦閹顢橀姀鈾�鎷虹紓浣割儓濞夋洟鎮橀柆宥嗙厱閻庯綆鍓欐禒閬嶆煙椤曞棛绡�濠碉紕鍏橀崺锟犲磼濠婂啫绠洪梻鍌欑閹碱偄煤閵娾晛纾绘繛鎴欏灪閺呮悂鏌﹀Ο渚Ч閻犳劧绻濋弻銊╂偄鐠囨畫鎾绘煟閺冩垵澧存鐐茬箻閺佹捇鏁撻敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐鍛傜喎鈻庨幆褎顔勭紓鍌欒兌婵挳鎮樺璺何﹂柛鏇ㄥ枤閻わ拷闂佸湱鍋撻幆灞轿涢悙鐢电＝濞达絿鏅崼顏堟煕婵犲啰绠炵�殿喛顕ч埥澶婎煥鎼粹懣顏堟⒒娓氾拷濞佳兠洪敃鍌涘剮妞ゆ牜鍋涢弸渚�鏌熼幑鎰靛殭婵☆偅锕㈤弻鏇㈠醇濠靛洤绐涢梺鍝勬閸婃繈骞冨Δ鍐╁枂闁告洦鍓涢ˇ銉╂⒑闂堟稓澧曢柟璇х節楠炲牓濡搁埡鍌涙婵炲濮撮鍡涙偂閸愵喗鐓忓鑸电〒閻ｅ崬顭胯閸ㄥ爼寮婚妸鈺傚亜閻犲洦鐣幘缁樼厽闁冲搫锕ら悘鐘炽亜椤愩垻绠伴悡銈嗐亜韫囨挸顏х紒鍗炵埣濮婃椽宕ㄦ繝鍐槱闂侀潻缍嗛崰鏍�﹂崶顒�閱囬柡鍥╁暱閹疯櫣绱撴担鍓插剰闁诲繑绻堥、妤呭閵堝棛鍘介梺鐟扮仢鐎氼喚寮ч敓钘壩旈悩闈涗粶闁哥喐鎸冲畷瑙勩偅閸愩劍顥濋梺闈涱檧婵″洭鏁撻挊澶樼吋婵﹨娅ｉ幉鎾礋椤愩垹袘婵＄偑鍊栧ú锕傚矗閸愩劎鏆﹂柕蹇嬪�栭ˉ鍫熺箾閹达綁鍝洪悗闈涚焸濮婃椽妫冨☉姘暫濠碘槅鍋呴悷褎绂嶉幖浣瑰仺闁告稑锕﹂崢閬嶆⒑缂佹◤顏勵嚕閸洖绠查柨婵嗘川绾惧吋銇勯弴鐐村櫣鐎殿噮鍠楅〃銉╂倷閺夋垹鐟ㄩ柧缁樼墪闇夐柨婵嗘噺閹牊顨ラ悙鑼ⅵ婵﹦绮幏鍛村川婵犲啫鍓甸梻浣告憸婵敻鎯勯鐐靛祦闊洦绋掗崐濠氭煠閹帒鍔ら柛妯圭矙濮婅櫣绱掑Ο鑽ゅ弳閻庢鍠涘▔娑㈠煝瀹ュ棛绡�闁告洝鍩栫�氳绻涢崼婵堜虎闁哄绋掗妵鍕敇閻樻彃骞嬪Δ鐘靛仜閸熷瓨鎱ㄩ敓浠嬫煏閸繃顥滄繛鍫熷姍濮婅櫣锟藉湱濮甸妴鍐煠閸愯尙鍩ｅ┑鈥崇埣閺佸啴宕掑☉鎺撳濠电偠鎻徊鍧椻�﹂崼銉嬪绠涘☉娆戝幗闂佽鍎崇壕顓熸櫠閿旀拝鎷风憴鍕婵犮垺锕㈤敐鐐测攽鐎ｅ灚鏅ｉ梺缁樺灥濡鈻撴總鍛娾拻濞达絿顭堥ˉ蹇涙煕鐎ｂ晝绐旂�规洘娲熷濠氬Ψ閵壯嶇串闂備焦鐪归崹褰掑箟閿熺姴纾婚柍鈺佸暟缁犻箖鏌涢埄鍐炬畼缂佺姷澧楅妵鍕疀閿濆嫮鏁栫紓浣介哺鐢偞绂掗敃鍌涘殟闁靛鍎板ǎ顕�姊绘担鍛婃儓闁活剙銈稿畷浼村冀瑜忛弳锔界箾閸℃ɑ灏崶鎾⒑缁洖澧叉い銊ョ箲鐎靛ジ鏁撻敓锟�?
		SReqMissionCanAccept send = new SReqMissionCanAccept();
		Module.getInstance().getCanAcceptMission( roleid, send.missions );
		gnet.link.Onlines.getInstance().send( roleid, send );
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805456;

	public int getType() {
		return 805456;
	}


	public CReqMissionCanAccept() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqMissionCanAccept) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqMissionCanAccept _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

