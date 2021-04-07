
package fire.pb.shop;

import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.game.MoneyType;

import fire.pb.main.Gs;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CExchangeCurrency__ extends mkio.Protocol { }

/** 货币兑换
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CExchangeCurrency extends __CExchangeCurrency__ {
	@Override
	protected void process() {
		// protocol handle
		
		long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		final int userid = ((gnet.link.Dispatch) this.getContext()).userid;
		
		new mkdb.Procedure() {
			
			@Override
			protected boolean process() throws Exception {
				fire.pb.item.Pack bag = new fire.pb.item.Pack(roleid, false);
				
				long ret = 0;
				int newMoney = 0;
				// 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷鍫曟晸閽樺鏆ｆ鐐叉喘椤㈡ê鈹戦崼銏㈡毎闂傚倷鐒﹂幃鍫曞磿濞差亜绀堟慨妯挎硾绾惧鏌涘畝锟介崑鐐烘偂閺囩喆浜滈柟鏉垮缁嬭崵绱掗敓浠嬫晸閻ｅ瞼纾藉〒姘攻鐎氬綊姊虹粙璺ㄧ伇闁稿鍋ら幃鈥斥枎閹炬潙锟界敻鏌ｉ姀鈽嗗晱闁绘帗鍎抽湁闁绘ê纾惌鎺擃殽閻愬澧繛鐓庣箻閹瑩顢楅敓浠嬵敂閿燂拷
				if (srcmoneytype == fire.pb.game.MoneyType.MoneyType_HearthStone) {
					// 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣侯攰閹活亞绮婚幋锕�鍨傞柛宀�鍋為崑锝呂旈敂钘夘嚋妞ゅ繒濞�閺岋繝宕遍鐘垫殼闂佸搫鐭夌槐鏇熺閿旂偓瀚氶柟缁樺笒椤岸姊绘担铏瑰笡闁圭⒈鍋嗙槐鐐寸瑹閿熶粙鐛崘顏呭枂闁告洍鏅涙禍浼存⒑閸︻収鐒鹃悗鍨笚缁傛帡鍩℃笟鍥ㄥ瘜闂侀潧鐗嗛幊姗�鎮板鍫熺厵闁告垯鍊栫�氾拷.
					if (fire.pb.fushi.Module.GetPayServiceType() == 1)
						return false;
					
					if (dstmoneytype == fire.pb.game.MoneyType.MoneyType_SilverCoin && this.dealHearthStone()) {
						newMoney = money * 10000;
						ret = bag.addSysMoney(newMoney, "1缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷鍫曟晸閽樺鏆ｆ鐐叉喘椤㈡ê鈹戦崼銏㈡毎闂傚倷鐒﹂幃鍫曞磿濞差亜绀堟慨妯挎硾绾惧鏌涘畝锟介崑鐐烘偂閺囩喆浜滈柟鏉垮缁嬭崵绱掗敓浠嬫晸閻ｅ瞼纾藉〒姘攻鐎氬綊姊虹粙璺ㄧ伇闁稿鍋ら幃鈥斥枎閹炬潙锟界敻鏌ｉ姀鈽嗗晱闁绘帗鍎抽湁闁绘ê纾惌鎺擃殽閻愬澧繛鐓庣箻閹瑩顢楅敓浠嬵敂閿燂拷10000闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴顏呭闂佷紮绲介崲鑼剁亽闁荤偞绋堥崜婵嬫倶閸愩劉鏀介柣鎰綑閻忥附鎱ㄥΟ绋垮鐎规洍锟芥剚娼╅柤鍝ユ暩閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuan, 0);
						if (ret != 0) {
							fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 160402, java.util.Arrays.asList(Integer.toString(money), Integer.toString(newMoney)));
						}
					} 
					// 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣侯攰閹活亞绮婚幋锕�鍨傞柛宀�鍋為崑锝呂旈敂钘夘嚋妞ゅ繒濞�閺岋繝宕遍鐘垫殼闂佸搫鐭夌槐鏇熺閿旂偓瀚氶柟缁樺笒椤岸姊绘担铏瑰笡闁瑰憡鎮傚畷鎰板锤濡わ拷閽冪喖鏌ｉ弮鍌氱殤闁瑰嘲鍢查埥澶娾枎濡厧濮虹紓鍌欒兌婵絻鎽梺闈涙搐鐎氼垳绮诲☉銏犖ㄩ柨鏇嫹妞ゅ骏鎷�
					else if (dstmoneytype == fire.pb.game.MoneyType.MoneyType_GoldCoin && this.dealHearthStone()) {
						newMoney = money * 100;
						ret = bag.addSysGold(newMoney, "1缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷鍫曟晸閽樺鏆ｆ鐐叉喘椤㈡ê鈹戦崼銏㈡毎闂傚倷鐒﹂幃鍫曞磿濞差亜绀堟慨妯挎硾绾惧鏌涘畝锟介崑鐐烘偂閺囩喆浜滈柟鏉垮缁嬭崵绱掗敓浠嬫晸閻ｅ瞼纾藉〒姘攻鐎氬綊姊虹粙璺ㄧ伇闁稿鍋ら幃鈥斥枎閹炬潙锟界敻鏌ｉ姀鈽嗗晱闁绘帗鍎抽湁闁绘ê纾惌鎺擃殽閻愬澧繛鐓庣箻閹瑩顢楅敓浠嬵敂閿燂拷100闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗霉閿濆懎顥忛柛銈嗘礋閺屾盯顢曢敐鍡欘槬闂佹悶鍔岄崐鍧楀蓟閿濆顫呴柕蹇婂墲濮ｅ嫰姊洪崨濠庢畷鐎癸拷閹间礁钃熼柕濞炬櫆閸嬪棝鏌涚仦鍓р槈妞ゅ骏鎷�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuan, 0);						
						if (ret != 0) {
							ret = bag.addSysCurrency((long)(newMoney*fire.pb.fushi.Module.getCreditPointValue(fire.pb.fushi.Module.CREDITPOINT_IN_FS2GOLD))
									, MoneyType.MoneyType_EreditPoint, "1缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷鍫曟晸閽樺鏆ｆ鐐叉喘椤㈡ê鈹戦崼銏㈡毎闂傚倷鐒﹂幃鍫曞磿濞差亜绀堟慨妯挎硾绾惧鏌涘畝锟介崑鐐烘偂閺囩喆浜滈柟鏉垮缁嬭崵绱掗敓浠嬫晸閻ｅ瞼纾藉〒姘攻鐎氬綊姊虹粙璺ㄧ伇闁稿鍋ら幃鈥斥枎閹炬潙锟界敻鏌ｉ姀鈽嗗晱闁绘帗鍎抽湁闁绘ê纾惌鎺擃殽閻愬澧繛鐓庣箻閹瑩顢楅敓浠嬵敂閿燂拷100闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗霉閿濆懎顥忛柛銈嗘礋閺屾盯顢曢敐鍡欘槬闂佹悶鍔岄崐鍧楀蓟閿濆顫呴柕蹇婂墲濮ｅ嫰姊洪崨濠庢畷鐎癸拷閹间礁钃熼柕濞炬櫆閸嬪棝鏌涚仦鍓р槈妞ゅ骏鎷�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuan, 0);
							fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 160403, java.util.Arrays.asList(Integer.toString(money), Integer.toString(newMoney)));
						}
					}
				}
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗霉閿濆懎顥忛柛銈嗘礋閺屾盯顢曢敐鍡欘槬闂佹悶鍔岄崐鍧楀蓟閿濆顫呴柕蹇婂墲濮ｅ嫰姊洪崨濠庢畷鐎癸拷閹间礁钃熼柨婵嗩槸椤懘鏌曡箛濠冩珖闁告柨鎽滅槐鎾寸瑹婵犲啫顏堕梻浣侯焾閻ジ宕戦悙鐑樺亗婵炲棙鎸婚崐鐢告煟閵忊槅鍟忛柣鎺撳劤闇夐柣妯虹－閻帗顨ラ悙瀵稿婵炵厧绻橀幃娆擃敆閿熶粙顢旈敓锟�
				else if (srcmoneytype == fire.pb.game.MoneyType.MoneyType_GoldCoin && this.dealGold()) {
					newMoney = money * 100;
					ret = bag.addSysMoney(newMoney, "1闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗霉閿濆懎顥忛柛銈嗘礋閺屾盯顢曢敐鍡欘槬闂佹悶鍔岄崐鍧楀蓟閿濆顫呴柕蹇婂墲濮ｅ嫰姊洪崨濠庢畷鐎癸拷閹间礁钃熼柨婵嗩槸椤懘鏌曡箛濠冩珖闁告柨鎽滅槐鎾寸瑹婵犲啫顏堕梻浣侯焾閻ジ宕戦悙鐑樺亗婵炲棙鎸婚崐鐢告煟閵忊槅鍟忛柣鎺撳劤闇夐柣妯虹－閻帗顨ラ悙瀵稿婵炵厧绻橀幃娆擃敆閿熶粙顢旈敓锟�100闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴顏呭闂佷紮绲介崲鑼剁亽闁荤偞绋堥崜婵嬫倶閸愩劉鏀介柣鎰綑閻忥附鎱ㄥΟ绋垮鐎规洍锟芥剚娼╅柤鍝ユ暩閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuan, 0);
					if (ret != 0) {
						fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 160404, java.util.Arrays.asList(Integer.toString(money), Integer.toString(newMoney)));
					}
				}
				
				return ret == 0 ? false : true ;
			}
			
			
			/**
			 * 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷鍫曟晸閽樺鏆ｆ鐐叉喘椤㈡ê鈹戦崼銏㈡毎闂傚倷鐒﹂幃鍫曞磿濞差亜绀堟慨妯挎硾绾惧鏌涘畝锟介崑鐐哄磻閿濆绾ч柣鎰綑椤ュ绱掓径濠冨仴闁哄被鍔戦幃銈夊磼濞戞﹩浼�?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閳锋垶銇勯幒鐐村缂備礁顦遍弫璇茬暦閻㈢绠涢柣妤�鐗忛崢浠嬫⒑閸濆嫬鏆欓柛濠傛憸閺侇噣宕滄担铏癸紲闂佺粯锕╅崰鏍礉閿曞倹鐓涢悘鐐额嚙婵″ジ鏌嶇憴鍕伌鐎规洟浜堕崺锟犲磼閸屽啫娲﹂埛鎴犵磽娴ｈ鐒界紒鐘卞嵆閺岀喖宕欓妶鍡楊伓
			 * @return true ok
			 */
			public boolean dealHearthStone() {
				// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵閸犳牜澹曢崸妤佺厵闁诡垳澧楅ˉ澶愬箹閺夋埊韬柡灞诲�濋幊婵嬪箥椤旇偐澧┑鐐茬摠缁瞼绱炴繝鍥ц摕婵炴垯鍨瑰敮闂侀潧绻嗛崜婵嬫偟閺嶎偆纾藉ù锝呮惈鏍″┑鈽嗗亜閸熸潙顕ｆ繝姘╅柍杞扮劍椤ユ繈姊洪崜鑼帥闁哥姵甯￠獮鎰板礃椤旇В鎷洪梺鍛婄☉閿曪箓骞婇弴銏＄厵闁告垯鍊栫�氾拷
				if (fire.pb.fushi.Module.getIsYYBUser(userid)) {
					return fire.pb.fushi.FushiManager.subFushiFromUser(userid, roleid, money, 0, 0,
							fire.pb.fushi.FushiConst.REASON_SUB_EXCHANGE_CURRENCY, YYLoggerTuJingEnum.tujing_Value_huobiduihuancost, true);
				}
				else {
					xbean.YbNums ybNums = xtable.Fushinum.get(userid);
					if (ybNums == null) {
						return false;
					}
					xbean.YbNum ybNum = ybNums.getRoleyb().get(roleid);
					if (ybNum == null) {
						return false;
					}
					if (ybNum.getNum() < 0 || ybNum.getSysnum() < 0) {
						return false;
					}

					return fire.pb.fushi.FushiManager.subFushiFromUser(userid, roleid, money, 0, 0,
							fire.pb.fushi.FushiConst.REASON_SUB_EXCHANGE_CURRENCY, YYLoggerTuJingEnum.tujing_Value_huobiduihuancost, true);
				}
			}
			
			/**
			 * 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔鏌ユ晸閽樺锟藉潡銆佸▎鎾崇鐟滃繘藝椤栨稓绠鹃弶鍫濆⒔閹偐鐥鐐靛煟鐎殿喚顭堥鍏煎緞婵犲嫷鍟囨繝鐢靛剳缂嶅棝宕滃▎鎰箚濞寸姴顑嗛悡鐔兼煙閹冩毐闁跨喕妫勫鈥愁嚕婵犳碍鍋勯柣姘摠鐎氳绻涢幋鐐垫噽闁绘帞鏅槐鎺楁偐閹存劖鍨挎俊鐢稿礋椤斿墽鏉搁梺闈涱檧缁犳垿顢旈敓锟�
			 * @return true ok
			 */
			public boolean dealGold() {
				fire.pb.item.Pack bag = new fire.pb.item.Pack(roleid, false);
				long ret = bag.subGold(-money, "闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌ｉ姀銏╃劸缂侊拷閸喆浜滈柟鐑樺灥椤忊晝绱掗敓浠嬪礃閳瑰じ绨婚棅顐㈡处閹告儳鐨紓鍌欐祰妞存悂鎮烽埡渚囨綎缂備焦蓱婵潙銆掑鐓庣仯闁告柨鎽滅槐鎾存媴閾忕懓绗￠梺鎼炲妼閻忔繈鎮鹃悜钘夋嵍妞ゆ挾鍠庣壕顖炴⒑閹呯妞ゎ偄顦埢鎾淬偅閸愨斁鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuancost, 0);
				return ret == 0 ? false : true ;
			}
			
			
		}.submit();
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810653;

	public int getType() {
		return 810653;
	}

	public int srcmoneytype; // 源类型 参考game.xml中MoneyType
	public int dstmoneytype; // 目标类型 参考game.xml中MoneyType
	public int money; // 数量

	public CExchangeCurrency() {
	}

	public CExchangeCurrency(int _srcmoneytype_, int _dstmoneytype_, int _money_) {
		this.srcmoneytype = _srcmoneytype_;
		this.dstmoneytype = _dstmoneytype_;
		this.money = _money_;
	}

	public final boolean _validator_() {
		if (srcmoneytype < 1 || srcmoneytype > 10) return false;
		if (dstmoneytype < 1 || dstmoneytype > 10) return false;
		if (money < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(srcmoneytype);
		_os_.marshal(dstmoneytype);
		_os_.marshal(money);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		srcmoneytype = _os_.unmarshal_int();
		dstmoneytype = _os_.unmarshal_int();
		money = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CExchangeCurrency) {
			CExchangeCurrency _o_ = (CExchangeCurrency)_o1_;
			if (srcmoneytype != _o_.srcmoneytype) return false;
			if (dstmoneytype != _o_.dstmoneytype) return false;
			if (money != _o_.money) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += srcmoneytype;
		_h_ += dstmoneytype;
		_h_ += money;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(srcmoneytype).append(",");
		_sb_.append(dstmoneytype).append(",");
		_sb_.append(money).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CExchangeCurrency _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = srcmoneytype - _o_.srcmoneytype;
		if (0 != _c_) return _c_;
		_c_ = dstmoneytype - _o_.dstmoneytype;
		if (0 != _c_) return _c_;
		_c_ = money - _o_.money;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

