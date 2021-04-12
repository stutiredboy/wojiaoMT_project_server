
package fire.pb.fushi.monthcard;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CBuyMonthCard__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犲鏌″畝瀣М濠殿噯鎷烽梺闈涚箚閺呮繈宕濋崫銉х＝濞撴艾锕ョ�氳绻濋姀锝呯厫闁告梹鐗犻幃锟犲Ψ閳哄倻鍘搁梺鎼炲劗閺呮稒绂掑鍫熺叆闁绘棁顕ц闂佽鍠栭崐鎼佹偩閻戣棄绠虫俊銈忔嫹閹喖姊洪幐搴㈢叆濠⒀傜矙椤㈡瑩寮撮姀鈥筹拷鐢告煟閻斿憡绶叉い銉ョ箻閺屾盯鎮╅搹顐ゎ槶闂佸吋妞芥禍鍫曞箠閿熺姴围闁搞儮鏅槐鏌ユ⒒娴ｈ櫣甯涢柣鐔间憾楠炲繘鎮滈懞銉у幈闂侀潧顭堥崝宥囨兜閻愵兙浜滄い鎰╁灮缁犱即鎮￠妶鍡愪簻闊洦鎸炬牎闂佸搫鎳岄崹钘夘潖閾忚宕夐柕濞垮劜閻忎線姊洪崫鍕闁稿妫濆畷姘跺箳濡わ拷缁秹鏌涘畝瀣閻庢艾缍婇弻锝夊閻樺啿鏆堟繛瀛樺殠閸婃繈寮婚悢椋庢殝闁哄瀵т簺婵＄偑鍊ら崑鍛崲閸儯锟戒礁螖娴ｅ摜绐為柣搴�ラ崟顓ㄦ嫹娴煎瓨鈷掗柛灞剧懅椤︼箓鏌熺喊鍗炰喊鐎殿喚鏁婚、妤呭礋椤掞拷閸擃喖顪冮妶鍡欏⒈闁稿鍨块弫鎾诲箣閹烘梻鐛㈤悗娈垮枟閹歌櫕鎱ㄩ敓浠嬫煃閳轰礁鏆為柣婵囧▕濮婄粯鎷呯憴鍕哗闂佺瀵掗崳锝咁嚕閹绘巻鏀介悗锝庝簼鏉堝牓姊洪棃娑氬婵☆偅姊婚幑銏ゅ幢濞戞瑧鍘梺鍓插亝缁诲啴骞栭幇鏉跨柈闁归棿鐒﹂埛鎴犵磼鐎ｎ亞浠㈡い鎺嬪灲閺屾盯濡搁妷锕�浠撮梺缁樹緱閸犳稓绮诲☉妯锋婵炲棙鍔栭鐔兼⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟� by changhao
 */
public class CBuyMonthCard extends __CBuyMonthCard__ {
	@Override
	protected void process() {
		// protocol handle
		
 		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
		{
			return;
		}
		
		mkdb.Procedure buymonthcard = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				if (fire.pb.fushi.Module.GetPayServiceType() == 0) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閳╁啯鐝栭梻浣芥硶閸犳捇寮查銈呭灊濠电姵鍑归弫宥夋煟閹邦厽缍戦柨鐔烘櫕閺佸寮婚妸銉㈡斀闁糕剝渚楅敓鑺ヮ殜閺岋紕锟斤綆鍋嗗ú瀛樻叏婵犲偆鐓肩�规洘甯℃俊鍫曞川椤栨瑦顢橀梻鍌欑閹碱偆鎮锕�绀夐柟杈剧畱缁犳牠鏌曢崼婵愭Ц缁炬儳鍚嬬换娑㈠箣閻戝洣绶垫繛瀵搞�嬮幏锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ姀鐘差棌闁轰礁锕弻鈥愁吋鎼粹�崇缂備焦鍔栭〃鍡樼┍婵犲洤围闁告侗鍠栧▍銈夋⒑閸濆嫭鍣虹紒璇茬墦瀵顓兼径濠佺炊闂佸憡娲﹂崜娆忊枍閿濆鈷戠紒瀣劵椤箓鏌涢弮锟介崹鍨嚕婵犳碍鏅插璺侯儐濞呮粓姊洪崨濠佺繁闁搞劏娅曠�靛ジ宕堕妸褏顔曢梺鐟邦嚟閸嬬偟浜搁鐘电＜濠㈣泛鏈弳鈺呮煙楠炲灝鐏╅柍钘夘樀婵拷闁绘ɑ顔栭崥鍛節閻㈤潧浠滄俊顐ｎ殘閹广垽骞掗幘棰濇祫婵°倧绲介崯顖炲煕閹寸姷纾藉ù锝堝亗閹寸姳鐒婂ù鐓庣摠閻撶喖鏌ｉ弬鍨骇婵炲懎鎳忛妵鍕敃閵忋垻顔夌紓浣虹帛缁诲倿锝炲┑瀣垫晢闁告洦鍋呴弳顏堟⒒閸屾瑨鍏岀紒顕呭灠椤繒鎲撮崟顓ф锤婵炲濮撮鍡涘疾閹间焦鐓犻柟顓熷笒閸旀碍绻涢幖顓炴灓闁跨喎锟界噥娼愭繛璇х畵瀹曞綊宕奸弴鐘茬ウ闂佸搫绉查崝宥嗗垔閹绢喗鐓曢煫鍥ㄦ惄濡插綊鎮楀鍐蹭汗缂佽鲸鎹囧畷鎺戔枎閹搭厽袦婵＄偑鍊栭崹鐢告偋閸℃稑鐓濋柡鍐ㄧ墕閸楁娊鏌ｅΟ鍝勬倎缂佹顦靛娲川婵犲嫭鍣у銈忓瘜閸樼晫绮嬪鍜佺叆闁告洍鏅欑花濠氭⒑鐟欏嫬绀冩繛澶嬬♁缁傛帡鏁冮崒娑氬幈闂佺粯蓱閸ㄦ岸骞嬮敂鐚存嫹閸愵喖唯闁冲搫鍊搁敓鐣屽厴閺屻倗鍠婇崡鐐差潾濡炪倖姊归崹鍨潖濞差亝顥堟繛鎴炵懃椤︹晠姊洪崨濠冣拹闁荤啿鏅犻幃浼搭敋閿熶粙鐛幒妤�绠ｉ柡鍐挎嫹闁哄偊鎷烽梻鍌欑劍閹爼宕曢鐐茬鐎广儱顦伴崑鐔哥節闂堟稒顥戦柡锟芥禒瀣厽婵☆垵娅ｆ禒娑㈡煛閸″繑娅呴柍瑙勫灴閹粓宕堕妸銉紦婵犵數濮烽弫鎼佸磻濮楋拷瀹曠娀鎮╃拠鑼槯闂佺粯顭堝▍鏇㈠Φ濠靛棌鏀介梽鍥春閺嵮屽殫闁告洦鍊犻悢铏圭＜婵☆垵宕佃ぐ鍡椻攽閻樺灚鏆╅柛瀣洴椤㈡岸顢橀姀鐘插亶閻熸粍妫冮獮鍐洪鍕庘晠鏌嶆潪鎷屽厡闁告﹢浜跺铏规兜閸涱喖娑ч梻鍌氬鐎氫即骞冮敓鐘插嵆闁绘棁娅ｉ惁鍫ユ⒒閸屾氨澧涚紒瀣浮钘熸繝濠傚娴滄粓鐓崶椋庡埌濞存粍绮嶉妵鍕敇閳ュ啿濮峰銈忕畳濞呮洜鎹㈠☉銏″殤妞ゆ帪鎷烽柡瀣〒閿熻姤顔栭崰鏍�﹂悜钘夋瀬闁圭増婢樺婵嬫煕鐏炲墽鈾佹い銉ョ墦閺屸剝鎷呯憴鍕３闂佸湱顭堥敃銉х博閻旂厧鐓涢柛灞惧濡插牓鏌х紒妯煎⒌闁哄本绋戦埥澶愬础閻愬浜┑鐐差嚟婵挳濡剁粙娆炬綎闁惧繐婀辩壕鍏间繆椤栨繃顏犲ù鐓庢处缁绘繂鈻撻崹顔界亖闂佺锕ョ换鍌烆敋閿濆钃熼柕澶堝劤椤旀劖绻涙潏鍓у埌婵狅拷闁秴鐭楅柛鈩冪♁閳锋垹绱撴担鑲℃垹绮堥敓浠嬫⒑缁嬪尅宸ユ繝锟介柆宥嗘櫢闁兼亽鍎抽崯鏌ユ煙閸戙倖瀚�  by changhao
				{
					boolean ok = fire.pb.fushi.MonthCardManager.getInstance().CheckMonthCardLimit(roleid);
					if (ok)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 190067, null);					
					}
					else
					{
						xbean.Properties prop = xtable.Properties.select(roleid);
						if (prop != null)
						{
							fire.pb.fushi.MonthCardManager.getInstance().ProcessMonthCard(prop.getUserid(), roleid);						
						}
					}					
				}
							
				return true;
			}
		};
		buymonthcard.submit();		
		
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812687;

	public int getType() {
		return 812687;
	}


	public CBuyMonthCard() {
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
		if (_o1_ instanceof CBuyMonthCard) {
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

	public int compareTo(CBuyMonthCard _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

