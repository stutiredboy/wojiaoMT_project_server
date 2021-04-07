
package fire.pb.fushi.monthcard;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGrabMonthCardRewardAll__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 濠电姷鏁告慨鐑姐�傞挊澹╋綁宕ㄩ弶鎴狅紱闂佸憡渚楅崣搴ㄦ偄閸℃ü绻嗘い鏍ㄧ懅缁夋寧绻涢幋鐑嗙劯闁哄啫鐗嗙粈瀣煃閻氬瓨瀚瑰┑顔款潐椤ㄥ﹤顫忓ú顏勭闁绘劖褰冩慨鍫曟⒑閸涘﹥灏伴柣鐔濆洦鏅搁柤鎭掑劥婢规ɑ銇勯敂鐐毈鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸煤閵娾晜鍋╅梻鍫熷厷閺冨牊鍋愰梻鍫熺◥閺夘參姊洪幖鐐插缂傚秴锕畷娲倷閸濆嫮顓洪梺鎸庢穿閹烽鐥幆褍鎮戠紒缁樼洴楠炲鎮欑捄渚闂備焦鍓氭禍锝夛綖婢跺本宕叉繝闈涙閺嬫棃鏌涢…鎴濇灍闁绘繍鍨跺娲偡閺夋寧顔�闂佺懓鍤栭幏锟� by changhao
 *
 */
public class CGrabMonthCardRewardAll extends __CGrabMonthCardRewardAll__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
		{
			return;
		}
		
		mkdb.Procedure grabmonthcardreward = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				xbean.EMonthCard monthcard = xtable.Roleid2monthcard.get(roleid);
				if (monthcard != null)
				{
					boolean grab = fire.pb.fushi.MonthCardManager.getInstance().IsGrabReward(roleid, monthcard.getGrabtime());
					if (grab == true) //闂傚倸鍊峰ù鍥敋瑜嶉～婵嬫晝閸岋妇绋忔繝銏ｅ煐閸旀牠宕戦妶澶嬬厸闁搞儮鏅涘皬闂佺粯甯掗敃銉ф崲濞戙垹骞㈡俊顖濇娴犳挳姊洪幖鐐插缂佽鐗撳璇差吋婢跺﹦鍘告繛杈剧到閹诧繝鎮橀弴鐘电＝濞达絿鎳撻弫鍓х磽瀹ュ嫮绐旂�殿喛顕ч埥澶愬閻橀潧濮堕梻浣告啞閸旀宕戦幘缁樺仼闁告挷鑳剁壕钘壝归敐鍥ㄥ殌缂佽尙绮换娑氫焊閺嶅灚瀚归柟棰佺濞堛劑姊洪崜鎻掍簼婵炲弶鐗犻幃鈥斥槈濡繐缍婇弫鎰板醇椤愶絿绉烽梻浣筋嚃閸犳鎮烽妷鈹撅拷鏃堝礃椤斿槈褔鏌涢幇鈺佸妞ゎ剙顦靛娲倻閳哄倹鐝﹂梺鎼炲妺閸楁娊骞冮幆褏鏆嬮柟浣冩珪閺傦拷闂佽鍑界紞鍡樼閻愮儤鍋傞柟瀛樼妇閺�浠嬫煃閽樺顥滈柣蹇ョ秮閺屾稑螣閻樺弶鎼愰柣銈夌畺閺屻劑鎮ら崒娑橆伓 by changhao
					{
						return false;
					}
					
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢绘俊鐐�栭悧婊堝磻濞戙垹鍨傞柛灞剧◤娴滄粓鏌″鍐ㄥ闁靛棙甯楅妵鍕煛閸屾粌寮ㄩ梺鍝勭灱閸犳牠骞冨鍏剧喓绱掑Ο鍝勫缂傚倸鍊烽悞锕傚船閼姐倗绀婂〒姘炬嫹鐎殿喛顕ч埥澶愬閻橀潧濮堕梻浣告啞閸旀宕戦幘缁樺仼闁告挷鑳剁壕钘壝归敐鍥ㄥ殌缂佹彃顭烽弻锝堢疀閺冨倻鐤勯梺绯曟櫇閸嬨倝鐛�ｎ喗鏅濋柨鐔烘櫕婢规洟宕楅懖鈺冾啎闂佺懓顕崑鐘崇珶濮楋拷閺屽秹顢旈崶鑸电秷缂備胶绮换鍌炲煝閹捐鍨傛い鏃傛櫕瑜版煡姊绘担鐑樺殌闁搞倖鐗犻獮蹇涙晸閿燂拷 by changhao
					{
						xbean.Properties prop = xtable.Properties.select(roleid);
						if (prop == null)
						{
							return false;
						}
						
						fire.pb.item.Pack bag = (fire.pb.item.Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, false);

						if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽顐粶缂侊拷婢跺绻嗛柕鍫濇噺閸ｅ湱绱掗悩闈涒枅闁哄瞼鍠栭獮鍡氼槾闁挎稑绉归弻锟犲幢椤撶姷鏆ゅ┑顔硷攻濡炰粙銆佸Δ鍛櫢闁伙絽鐬奸惌鎾绘倵閻㈠憡浜ら柟宄板槻椤繈顢楁径瀣撱劑姊虹捄銊ユ灆婵☆偄瀚划璇差吋婢跺﹦锛熼梻渚囧墮缁夊绮婚悩璇茬闁圭⒈鍘鹃崢婊呯磽瀹ュ棛澧甸柡灞炬礋瀹曠厧鈹戦幇顓壯囨⒑缂佹ɑ灏版繛鑼枛瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷? by changhao
						{
							java.util.Map<Integer, fire.pb.fushi.SMonthCardConfigDayPay> config = fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.fushi.SMonthCardConfigDayPay.class);
							for (fire.pb.fushi.SMonthCardConfigDayPay e : config.values())
							{
								if (e.getType() == 1)
								{
									java.util.Map<String, Object> paras = new java.util.HashMap<String, Object>(10);
									paras.put(fire.pb.activity.award.RewardMgr.ROLE_LEVEL, prop.getLevel());
									fire.pb.activity.award.RewardMgr.getInstance().distributeAllAward(roleid, e.getRewardid(), paras, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 0,fire.pb.PAddExpProc.OTHER, "闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繄绮欓幒妤�纾婚悗锝庡枟閻撴洟鏌嶉埡浣告灓婵炲牊锕㈤弻锟犲幢椤撶姷鏆ら悗娈垮枛閻栫厧鐣烽悡搴樻婵☆垯璀﹂悗鐑芥⒒閸屾艾锟藉摜锟芥凹鍓涢敓鑺ョ煯閸楀啿顕ｆ繝姘伋鐎规洖娲﹀▓鐓庮渻閵堝棙鈷掗柛妯犲洤鏋佹い蹇撶墛閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹");										
								}
								else if (e.getType() == 0)
								{
									if (bag.isFull())
									{
										fire.pb.item.ItemMaps tempBag = fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.TEMP, false);
										
										if (tempBag.doAddItem(e.getItemid(), e.getItemnum(), "闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繄绮欓幒妤�纾婚悗锝庡枟閻撴洟鏌嶉埡浣告灓婵炲牊锕㈤弻锟犲幢椤撶姷鏆ら悗娈垮枛閻栫厧鐣烽悡搴樻婵☆垯璀﹂悗鐑芥⒒閸屾艾锟藉摜锟芥凹鍓涢敓鑺ョ煯閸楀啿顕ｆ繝姘伋鐎规洖娲﹀▓鐓庮渻閵堝棙鈷掗柛妯犲洤鏋佹い蹇撶墛閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != e.getItemnum())
										{
											return false;
										}
									}
									else
									{
										if (bag.doAddItem(e.getItemid(), e.getItemnum(), "闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繄绮欓幒妤�纾婚悗锝庡枟閻撴洟鏌嶉埡浣告灓婵炲牊锕㈤弻锟犲幢椤撶姷鏆ら悗娈垮枛閻栫厧鐣烽悡搴樻婵☆垯璀﹂悗鐑芥⒒閸屾艾锟藉摜锟芥凹鍓涢敓鑺ョ煯閸楀啿顕ｆ繝姘伋鐎规洖娲﹀▓鐓庮渻閵堝棙鈷掗柛妯犲洤鏋佹い蹇撶墛閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != e.getItemnum())
										{
											return false;
										}
									}				
								}
							}							
						}
						else
						{
							java.util.Map<Integer, fire.pb.fushi.SMonthCardConfig> config = fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.fushi.SMonthCardConfig.class);
							for (fire.pb.fushi.SMonthCardConfig e : config.values())
							{
								if (e.getType() == 1)
								{
									java.util.Map<String, Object> paras = new java.util.HashMap<String, Object>(10);
									paras.put(fire.pb.activity.award.RewardMgr.ROLE_LEVEL, prop.getLevel());
									fire.pb.activity.award.RewardMgr.getInstance().distributeAllAward(roleid, e.getRewardid(), paras, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 0,fire.pb.PAddExpProc.OTHER, "闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繄绮欓幒妤�纾婚悗锝庡枟閻撴洟鏌嶉埡浣告灓婵炲牊锕㈤弻锟犲幢椤撶姷鏆ら悗娈垮枛閻栫厧鐣烽悡搴樻婵☆垯璀﹂悗鐑芥⒒閸屾艾锟藉摜锟芥凹鍓涢敓鑺ョ煯閸楀啿顕ｆ繝姘伋鐎规洖娲﹀▓鐓庮渻閵堝棙鈷掗柛妯犲洤鏋佹い蹇撶墛閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹");										
								}
								else if (e.getType() == 0)
								{
									if (bag.isFull())
									{
										fire.pb.item.ItemMaps tempBag = fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.TEMP, false);
										
										if (tempBag.doAddItem(e.getItemid(), e.getItemnum(), "闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繄绮欓幒妤�纾婚悗锝庡枟閻撴洟鏌嶉埡浣告灓婵炲牊锕㈤弻锟犲幢椤撶姷鏆ら悗娈垮枛閻栫厧鐣烽悡搴樻婵☆垯璀﹂悗鐑芥⒒閸屾艾锟藉摜锟芥凹鍓涢敓鑺ョ煯閸楀啿顕ｆ繝姘伋鐎规洖娲﹀▓鐓庮渻閵堝棙鈷掗柛妯犲洤鏋佹い蹇撶墛閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != e.getItemnum())
										{
											return false;
										}
									}
									else
									{
										if (bag.doAddItem(e.getItemid(), e.getItemnum(), "闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繄绮欓幒妤�纾婚悗锝庡枟閻撴洟鏌嶉埡浣告灓婵炲牊锕㈤弻锟犲幢椤撶姷鏆ら悗娈垮枛閻栫厧鐣烽悡搴樻婵☆垯璀﹂悗鐑芥⒒閸屾艾锟藉摜锟芥凹鍓涢敓鑺ョ煯閸楀啿顕ｆ繝姘伋鐎规洖娲﹀▓鐓庮渻閵堝棙鈷掗柛妯犲洤鏋佹い蹇撶墛閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_monthcard_reward, 2) != e.getItemnum())
										{
											return false;
										}
									}				
								}
							}								
						}
					}
					
					monthcard.setGrabtime(System.currentTimeMillis());
					
					fire.pb.fushi.MonthCardManager.getInstance().SendMonthCardInfo(roleid);
				}
				
				return true;
			}
		};
		grabmonthcardreward.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812690;

	public int getType() {
		return 812690;
	}


	public CGrabMonthCardRewardAll() {
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
		if (_o1_ instanceof CGrabMonthCardRewardAll) {
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

	public int compareTo(CGrabMonthCardRewardAll _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

