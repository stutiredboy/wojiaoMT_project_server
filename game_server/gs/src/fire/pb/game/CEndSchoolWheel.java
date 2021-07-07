
package fire.pb.game;

import java.util.ArrayList;
import java.util.List;

import fire.pb.team.TeamManager;
import fire.pb.util.BagUtil;
import fire.pb.util.MessageUtil;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CEndSchoolWheel__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CEndSchoolWheel extends __CEndSchoolWheel__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid <= 0) return;
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				TeamManager.getTeamByRoleId(roleid);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃闁硅櫕鎹囬垾鏃堝礃椤忓孩瀚归柨婵嗙凹缁ㄥジ鏌熼惂鍝ョМ闁哄矉缍侀、姗�鎮欓幖顓燁棧闂備線娼уΛ娆戞暜閹烘缍栨繝闈涱儐閸婇攱銇勯幒鐐村濡炪倕绻楀▔娑㈠煘閹达附鍋愭繛鍫熷濞堟壆绱撴担铏瑰笡缂佽鍊块垾锕傚炊椤忓秵鈻夐梻浣筋嚙缁绘垹鏁垾鎰佹綎闁惧繐婀遍惌娆撴偣閹帒濡挎い鏂匡躬濮婃椽宕橀幓鎺撔╅梺缁橆殕閹告悂鎮鹃悜钘夌闁挎洩鎷烽幆鐔兼⒑闂堟侗妲堕柛銊︽そ瀵剟鏁撻懞銉ょ箚闁绘劦浜滈敓鑺ョ墪椤繗銇愰幒鎴濆殤缂傚倷鐒﹂…鍥偡鐟欏嫮绠鹃柟瀛樼懃閻忣亪鏌ｉ幘瀛樼妤犵偞鐗楀蹇涘礈瑜忚摫闂備礁鎼Λ顓㈠礈閻旂厧钃熼柍鈺佸暞婵挳鏌ｉ悢鍛婄凡妞ゎ偄绉归幃妤呭垂椤愶絿鍑￠柣搴㈠嚬閸ｏ綁寮幘璇叉闁靛牆娲ㄦ牎闂備胶顭堥鍛村箠濮楋拷楠炲啴鎮界粙鍨祮闂侀潧绻嗗褔骞忕紒妯肩閺夊牆澧界粔顒佷繆椤愩垹顏い锝呮健濮婄粯鎷呴悷閭﹀殝缂佺偓婢樼粔瑙勪繆閻㈢绀嬫い鏍ㄧ♁濞呭棝鏌ｉ悩鍏呰埅闁告柨閰ｉ幃锟犲箻缂佹ê锟界敻鎮峰▎蹇擃仾缂侊拷閸儲鐓涘ù锝呭閻撹偐锟芥鍣崑濠囩嵁濡偐纾兼俊顖滅帛椤忕喖姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷?
				List<Long> list = new ArrayList<Long>();
				list.add(roleid);
				lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, list));//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃闁硅櫕鎹囬垾鏃堝礃椤忓孩瀚归柨婵嗙凹缁ㄥジ鏌熼惂鍝ョМ闁哄矉缍侀、姗�鎮欓幖顓燁棧闂備線娼уΛ娆戞暜閹烘缍栨繝闈涱儐閸婇攱銇勯幒鐐村濡炪倕绻楀▔娑㈠煘閹达附鍋愭繛鍫熷濞堟壆绱撴担铏瑰笡缂佽鍊块垾锕傚炊椤忓秵鈻夐梻浣筋嚙缁绘垹鏁垾鎰佹綎婵炲樊浜滅粈鍌炴煠濞村鏉洪柛瀣仱濮婃椽宕崟顒�娅ょ紓浣筋嚙閻楁捇鐛崘顔藉�烽柛婵嗗椤ρ囨⒑閸忚偐銈撮柡鍛箞椤㈡瑩寮撮姀锛勫幐婵犮垼娉涢敃锔芥櫠閺囩儐鐔嗙憸蹇涘疾椤愩倕鍨濋柡鍐ㄧ墱閺佸棗霉閿濆牊顏犳い鏃�娲熷娲川婵犲嫮鐓�闂佸摜鍠嶉崡鎶界嵁閸愵喗鍤冮柍鍝勫暟閿涙粌顪冮妶鍡橆梿闁稿鍔栭弲璺衡槈濮樿京锛滅紓鍌欑劍椤洨绮婚悙纰夋嫹鐟欏嫭绀�闁绘牕鍚嬫穱濠囧箹娴ｈ倽銊︺亜閺嶃劎鈽夋い蹇撶埣濮婂搫效閸パ呬患闂佺顕滅换婵嬪箖閿熺姴唯闁挎柨澧介惁鍫ユ⒒閸屾氨澧涚紒瀣浮钘熼柕寰涢绨婚柟鍏肩暘閸╁嫬鈻撳鍫熺厸鐎癸拷鐎ｎ剛锛熼梺璺ㄥ枑閺嬭崵绱為崱娑樼；闁糕剝绋戣繚闂佸湱鍎ゅ鑽ゅ婵傜绾ч柛顐ｇ☉婵″吋绻涢幖顓炴珝闁哄备鍓濋幏鍛喆閸曨偊鐎虹紓鍌欑閸婂湱鏁悙鐑樻櫢闁哄倶鍊楃粔闈浢瑰搴濋偗鐎规洦鍓涢幑鍕瑹椤栨稑鐦滈梻渚�娼ч悧鍡橆殽閸涘﹦顩插ù鐘差儐閻撴洟鏌ｅΟ璇插婵炲牊锕㈤弻銊╂偄鐠囨畫鎾城庨崶銊︺仢闁挎繄鍋炲鍕箛閳哄瀚归柛鎰靛枛鍞梺鍐叉惈閸婃悂鏁撻悾灞藉幋闁哄被鍊楅崰濠囧础閻愭彃绠伴梻浣瑰劤缁绘劙鏌婇敐鍜佹綎婵炲樊浜滃婵嗏攽閻樻彃鏆婇柟宄扮秺閹鎯傞崨濠傤伓闂備礁缍婂Λ璺ㄧ矆娓氾拷閹锋垿鎮㈤崗鑲╁弳濠电娀娼уΛ娆撳疮閹烘鐓涢柛鎰鐎氬綊姊洪悷鏉挎Щ闁硅櫕锕㈤獮鏍亹閹烘垶宓嶅銈嗘尵閸嬫稓绮仦鍓х瘈缁炬澘顦辩壕鍧楁煕鐎ｎ偄鐏寸�规洘鍔欐俊鑸靛緞婵犲倸浜堕梻浣虹帛閹稿摜寮ч崘顭嬫椽顢斿鍡樻珝闂備線娼х换鎺撴叏閻㈠憡鍊垫い鎺戝閳锋垿鏌ｉ悢鍛婄凡闁抽攱姊荤槐鎺楊敋閸涱厾浠搁悗瑙勬礃閸ㄥ潡鐛崶顒夋晪闁糕剝锚椤忓爼鏌ｉ悢鍝ユ噧閻庢凹鍘剧划鍫ユ晸閽樺鏀介柣鎰皺濠�鎾煕婵犲啰绠為柟顔诲嵆椤㈡瑧鍠婃潏銊ョ紦闂備浇娉曢崰鏇炍涢崟顖ょ稏闊洦娲滅壕鍏间繆椤栨繍鍤欐い搴㈡崌濮婃椽宕楅梻纾嬪焻闂佺瀛╂繛濠冧繆鐎涙绡�闁搞儯鍔夐幏娲⒒閸屾氨澧愰柡鍛箘缁棃宕滄担铏癸紲闂佺粯顭堝▍鏇炵暦瀹�鍕厽婵炴垵宕弸锔剧磼閻樺磭鈽夐柍钘夘槸閳诲酣骞囬褌鎴烽梻鍌氬�峰ù鍥р枖閺囥垹闂柨鏇炲�哥粻顖炴煥閻曞倹瀚�?
				xbean.SchoolWheel schoolWheel = xtable.Openschoolwheeltable.get(roleid);
				if (schoolWheel == null) {
					return false;
				}
				
				WheelAwardItem awardItem = GameManager.getInstance().getAwardItem(GameManager.SCHOOLWHEEL, schoolWheel.getItemindex());
				if (awardItem == null)
					return false;
				
				int realAdd = BagUtil.addItem(roleid, awardItem.itemid, awardItem.itemnum, "schoolwheel", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_rollschoolwheel, awardItem.itemid);
				
				if (realAdd == awardItem.itemnum) {
					MessageUtil.psendAddItemWhileCommit(roleid, awardItem.itemid, realAdd);
				}
				
				int mustAdd = 0;
				if (awardItem.mustitem > 0)
					mustAdd = BagUtil.addItem(roleid, awardItem.mustitem, awardItem.mustnum, "schoolwheel", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_rollschoolwheel, awardItem.mustitem);
				if (mustAdd > 0 && mustAdd == awardItem.mustnum) {
					MessageUtil.psendAddItemWhileCommit(roleid, awardItem.mustitem, mustAdd);
				}
				
				xtable.Openschoolwheeltable.remove(roleid);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810365;

	public int getType() {
		return 810365;
	}


	public CEndSchoolWheel() {
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
		if (_o1_ instanceof CEndSchoolWheel) {
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

	public int compareTo(CEndSchoolWheel _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

