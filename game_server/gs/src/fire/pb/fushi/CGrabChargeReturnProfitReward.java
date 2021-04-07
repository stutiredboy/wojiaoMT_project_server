
package fire.pb.fushi;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGrabChargeReturnProfitReward__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 濠电姷鏁告慨鐑姐�傞挊澹╋綁宕ㄩ弶鎴狅紱闂佸憡渚楅崣搴ㄦ偄閸℃ü绻嗘い鏍ㄧ懅缁夋寧绻涢幋鐑嗙劯闁哄啫鐗嗙粈瀣煃閻氬瓨瀚瑰┑顔款潐椤ㄥ﹤顫忓ú顏勭闁绘劖褰冩慨鍫曟⒑閸涘﹥灏伴柣鐔濆懎鍨濋柛顐犲劚绾惧ジ鏌ｉ幇顒夊殶闁告ê宕埞鎴︽倷閺夋垹浼囧┑鐐叉噺濞叉粓鏁撻懞銉у暡闁瑰嚖鎷�?闂傚倸鍊搁崐宄懊归崶銊х彾闁割偁鍎荤紞鏍ь熆鐠轰警鍎戦柣婵嗙埣閺屾盯鍩勯崘顏呭櫘婵炴垶鎸哥粔褰掑蓟閿涘嫪娌悹鍥ㄥ絻婵洟姊虹紒妯诲鞍婵炶尙鍠栧濠氭偄閻撳簼绱堕梺鍛婃处閸擄箑螞閳ユ枼鏀介柣鎰级閸ｅ綊鏌熼崘鑼濠碉紕鏁诲畷鐔碱敍濮ｅ皷鏅犻弻銊╁籍閸屾矮澹曢梺鍛婂笚閻╊垶骞冨Δ鍐╁枂闁告洦鍓涢埞娑㈡⒑閻熸澘娈╅柟鍑ゆ嫹?
 * @author changhao
 *
 */
public class CGrabChargeReturnProfitReward extends __CGrabChargeReturnProfitReward__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		mkdb.Procedure grabchargereturnprofitreward = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				xbean.EChargeReturnProfit profits = xtable.Roleid2chargereturnprofit.get(roleid);
				
				if (profits == null)
				{
					FushiManager.logger.info("婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫梺鍝勬噺閹倿寮婚敃锟借灒濞撴凹鍨辩瑧闂備礁鎼Λ婵囩閸洖绠栧ù鐘差儛閺佸秵绻濇繝鍌氭殜闁哄鎳樺娲传閸曨剚鎷辩紓浣割儐鐢偤骞戦姀鐘斀閻庯綆浜為崐鐐差渻閵堝骸骞楅悽顖滃仱瀹曘儵宕烽鐘碉紳闂佺鏈悷褔宕濆鍡愪簻闁靛鍎查崵鍥寠濠靛鐓熼柕蹇嬪焺閻掑墽绱掗悩闈浶ｅǎ鍥э躬婵″爼宕熼鐓庡腐婵＄偑鍊愰弲婵嬪礂濮楋拷楠炲啫螖閸涱喗娅滈梺鍛婁緱閸垳鍒掗棃娑掓斀闁绘劘灏欐晶閬嶆煕濞嗗繐鏆欐い顐㈢箰鐓ゆい蹇撴媼濡啴姊洪崘鍙夋儓闁稿﹥鎮傞、鏃堟晸閿燂拷?");
					return true;
				}
				
				xbean.ChargeReturnProfit profit = profits.getReturnprofitmap().get(id);
				if (profit == null)
				{
					FushiManager.logger.info("婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ婢舵劖鐓ユ繝闈涙婢ц鲸绻涢崗鐓庡闂囧绻濊閻忔繈鏁撻懞銉у⒈闁瑰箍鍨归埥澶愬閻樿尪锟藉灝鈹戞幊閸婃洟骞婃惔鈽嗗殨濞寸厧鐡ㄩ埛鎴︽煙閼测晛浠滈柨鐔诲Г濞茬喖銆侀弽銊ョ窞闁归偊鍓濋幗鏇炩攽閻愭潙鐏︾紒顔奸叄閹潡鏁撴禒瀣拺闁革富鍘兼禍鐐箾閸忚偐鎳冮柍璇茬Ч閺佹捇鏁撻敓锟�?闂傚倸鍊搁崐宄懊归崶銊х彾闁割偁鍎荤紞鏍ь熆鐠轰警鍎戦柣婵嗙埣閺屾盯鍩勯崘顏呭櫘婵炴垶鎸哥粔褰掑蓟閿涘嫪娌悹鍥ㄥ絻婵洟姊虹紒妯诲鞍婵炶尙鍠栧濠氭偄閻撳簼绱堕梺鍛婃处閸擄箑螞閳ユ枼鏀介柣鎰级閸ｅ綊鏌ㄩ弴銊ら偗鐎殿喖顭峰鎾閻樿尪锟藉灝鈹戞幊閸婃洟宕鈽嗘▌闂佸搫鐬奸崰鏍�佸☉銏犖ч柛鈩冾殢娴硷拷?");
					return true;					
				}
				
				SChargeReturnProfit config = fire.pb.main.ConfigManager.getInstance().getConf(SChargeReturnProfit.class).get(id);
				if (config == null)
				{
					FushiManager.logger.info("婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ婢舵劖鐓ユ繝闈涙婢ц鲸绻涢崗鐓庡闂囧绻濊閻忔繈鏁撻懞銉у⒈闁瑰箍鍨归埥澶愬閻樿尪锟藉灝鈹戞幊閸婃洟骞婃惔鈽嗗殨濞寸厧鐡ㄩ埛鎴︽煙閼测晛浠滈柨鐔诲Г濞茬喖銆侀弽銊ョ窞闁归偊鍓濋幗鏇炩攽閻愭潙鐏︾紒顔奸叄閹潡鏁撴禒瀣拺闁革富鍘兼禍鐐箾閸忚偐鎳冮柍璇茬Ч閺佹捇鏁撻敓锟�?闂傚倸鍊搁崐宄懊归崶銊х彾闁割偁鍎荤紞鏍ь熆鐠轰警鍎戦柣婵嗙埣閺屾盯鍩勯崘顏呭櫘婵炴垶鎸哥粔褰掑蓟閿涘嫪娌悹鍥ㄥ絻婵洟姊虹紒妯诲鞍婵炶尙鍠栧濠氭偄閻撳簼绱堕梺鍛婃处閸擄箑螞閳ユ枼鏀介柣鎰级閸ｅ綊鏌ㄩ弴銊ら偗鐎殿喖顭峰鎾閻樿尪锟藉灝鈹戞幊閸婃洟宕鈽嗘▌闂佸搫鐬奸崰鏍�佸☉銏犖ч柛鈩冾殢娴硷拷?");
					return true;						
				}
				
				if (profit.getStatus() == 1) // 
				{
					int c = 0;
					for (Integer id : config.getRewarditems())
					{	
						int c1 = 0; //缂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡炪們鍨洪悧鐘茬暦閵娾晩鏁嶆繝濠傛噽閸樼娀姊虹拠鎻掝劉缂佸甯￠垾锕傚炊椤戞拝鎷烽崨鏉戣摕闁靛濡囬崢鎼佹⒑閹肩偛鍔橀柛搴ㄤ憾閹﹢鍩￠崨顔硷拷鍨叏濮楀棗澧绘俊鎻掓啞閵囧嫰顢橀埄鍐�婇梺鍦嚀鐎氼參濡堕敃鍌氬瀭妞ゆ洖鎳嶇槐鏃�绻濋悽闈涗粶妞ゆ洦鍘介崚濠囶敇閵忕姴鐎梺鍓插亝濞叉牠鎷戦悢鍏肩叆闁绘柨鎼瓭濠碉紕鍋樼划娆撳蓟濞戙垹绠涢梻鍫熺♁閻忓秴顪冮妶鍛搭�楃紒澶婄秺瀵鏁愭径瀣汗闁哄鐗冮弲婵嬫偤濮楋拷濮婃椽鎮烽弶鎸庮唨闂佺懓鍤栭幏锟� by changhao
						for (Integer num : config.getRewarditemnums())
						{
							if (c == c1) //闂傚倸鍊峰ù鍥敋瑜嶉湁闁绘垼妫勯弸渚�鏌涘☉姗堟敾婵炲懐濮垫穱濠囧Χ閸涱喖娅￠梺璺ㄥ枙濡嫰宕弶鎴犳殾闁靛ň鏅涚痪褔鏌熺�电浠︾悮锝夋⒒娴ｇ瓔鍤欑紒缁樺浮瀹曟垵鈽夊▎鎰彿婵炲濮撮鍡涘煕閺冨牊鐓曢柡鍥ュ妼閻忥繝鏌ｉ幘瀵搞�掗柨鐔凤拷鐕佹綈闁瑰皷鏅犲畷浼村冀椤撶偠鍩炲銈嗘尪閸ㄦ椽寮查幖浣圭厽婵☆垰鎼弳閬嶆煥閻旂儤娅曢柡浣割煼瀵鏁愭径濠庢綂闂佺粯锚閸氾拷缂侇喚鏁诲娲箹閻愯鎷疯楠炲繑顦版惔锝囷紳闂佺鏈悷鈺侇瀶閻戣姤鐓曢柡鍌濇硶鏁堥梺璇″櫙缁绘繈寮幘缁樺亹闁肩⒈鍓涢弳浼存⒒娴ｅ憡鍟為柛鏃撶畵瀹曚即寮介銈囩劶闁诲函缍嗛崑浣圭濠婂牊鐓欓柛婵嗗鑲栭梺鍛婃煥缁夌敻濡甸崟顖氭閻犳亽鍓辫閹便劍绻濋崟顓炵缂備焦顨堥崰鎰崲濠靛绀冩い顓熷灣缁憋拷? by changhao
							{
								int added = fire.pb.util.BagUtil.addItem(roleid, id, num, fire.pb.skill.liveskill.LiveSkillManager.ChargetGrab, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_chongzhifanli, 1, true);
								
								if (num != added)
								{
									FushiManager.logger.info("闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡鏇熴亜閹板墎绋荤紒锟介敓钘夆攽閳藉棗浜濋柨姘舵婢舵劖鐓ユ繝闈涙閸ｆ椽鎮归幇鍓佺瘈婵﹤顭峰畷鐔碱敃閵忊晙绱旈梻浣告惈婢跺洭鏁撻挊澶岋紞闁哄棎鍊栭妵鍕籍閸屾艾浠橀梺杞扮贰娴滎亪寮诲澶娢ㄩ柨鏇嫹濠⒀屽灦閺岋綁寮幐搴＆闂佸搫鐬奸崰鏍�佸☉妯锋婵妫欓ˉ瀣磽閸屾瑩妾烽柛鏂胯嫰椤洭鏁撻悩鑼暫閻庣懓瀚竟瀣几鎼淬垻绠鹃柛鈩兠悘鈺呮煛閸℃劕锟芥繈骞冨Δ鍐╁枂闁告洦鍓涢埞娑氱磽閸屾氨小缂佽埖宀告俊瀛樻媴缁洘顫嶅┑鈽嗗灦閺�閬嶅棘閿熶粙姊绘担铏广�婇柛鎾寸箞閵嗗啴宕ㄩ婊�绗夐梺鎸庣箓椤︿即鍩涢幒鎳ㄥ綊鏁愰崨顔兼殘闂佽鍨伴悧鎾诲箖濡わ拷椤繈宕￠悙鎻掔闁诲氦顫夊ú鏍礊婵犲洤绠栭柣锝呯灱閻瑩鎮规笟顖滃帨缂佸崬鐏氱换婵嗩嚗闁垮绶查柨鐔诲Г濞茬喖鐛繝鍐╁劅闁挎繂娲ㄩ悞濂告倵閻у憡瀚归梺鍛婃处閸撴盯宕㈤崡鐐╂斀闁绘劖娼欓悘銉э拷瑙勬处閸撶喎顕ｇ粙搴撴婵☆垶鏀遍弬锟芥俊鐐�栧ú鏍箠鎼淬垺娅犳い鏇嫹婵☆偂鐒﹀鍕箛椤撶姴寮抽梻浣虹帛濞叉牠宕愰崷顓ㄦ嫹濮樼偓瀚�?");
									fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 140655, null);
									return false;						
								}									
							}							
							
							c1 ++;
						}
						
						c ++;
					}
					 
					profit.setStatus(0); //闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸偅缍堝┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锝呭悁闁垶鏌＄仦鍓ф创闁糕晛瀚板畷姗�宕滆婵椽姊绘担鍝ワ紞缂侇噮鍨拌灋闁告劦鍠栭拑鐔哥箾閹寸們姘跺绩娴犲鐓曢柍鈺佸枤濞堛垹霉閻樺眰鍋㈡慨濠冩そ楠炴牠鎮欑拠褎瀚归柡宥庡亝閺嗘粓鏌熼悜妯荤濞存粓浜跺缁樻媴閸涘﹥鍎撳銈忛檮婢瑰棝鏁撻悾宀�鎳楅柛銉ょ椤︻垶鈥﹂妸鈺佸窛妞ゆ柨鍚嬮悗楣冩⒒娴ｅ憡鎯堟い锔藉閿熺晫鐟抽崶褏鐛ュ┑顔筋殣閹风兘鏌″畝锟介崰鏍�佸▎鎴炲枂闁告洦鍓涜ぐ瀣⒒娴ｄ警鏀版繛鍛礈閸掓帡骞樼拠鍙夌�梺鐟板⒔缁垶寮查幖浣圭叆闁绘洖鍊圭�氾拷?? by changhao
					SGrabChargeReturnProfitReward msg = new SGrabChargeReturnProfitReward();
					msg.id = profit.getId();
					msg.status = 0;
					
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					
					fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 160009, null);
				}
				
				return true;
			};
		};
		
		grabchargereturnprofitreward.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812481;

	public int getType() {
		return 812481;
	}

	public int id; // 充值返利项目ID by changhao

	public CGrabChargeReturnProfitReward() {
	}

	public CGrabChargeReturnProfitReward(int _id_) {
		this.id = _id_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGrabChargeReturnProfitReward) {
			CGrabChargeReturnProfitReward _o_ = (CGrabChargeReturnProfitReward)_o1_;
			if (id != _o_.id) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += id;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGrabChargeReturnProfitReward _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = id - _o_.id;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

