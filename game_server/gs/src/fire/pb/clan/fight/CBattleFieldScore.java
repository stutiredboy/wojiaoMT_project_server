
package fire.pb.clan.fight;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CBattleFieldScore__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CBattleFieldScore extends __CBattleFieldScore__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		mkdb.Procedure battlefieldscore = new mkdb.Procedure()
		{
			@Override
			protected boolean process()  throws Exception
			{
				Long c1 = xtable.Roleid2clanfightid.select(roleid); //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕稿Δ锟界粻鏉库攽閻樻彃鏆熼柣婵嗙埣閺屽秹宕崟闈涘壋缂備礁顦介崰姘舵晸閸婄噥娼愭繛鍙夌矒瀹曚即寮介婊愭嫹娴ｇ硶妲堟慨妤�妫欓崓鍨繆閹绘帗婀伴柣妤佹礋瀵偊骞栨担鍏夋嫽闂佺鏈悷锔剧矈閻楀牏绠惧璺侯儐缁�瀣拷瑙勬礃婵炲﹪寮崘顔肩＜婵﹢纭搁崬鐢告⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈嗐亜椤撶姴鍘寸�殿喖顭烽弫鎰緞婵犲嫮鏉告俊鐐�栫敮濠勬媼閺屻儱鍑犳繛鍡樻尰閳锋垹绱撴担濮戭亞绮埡浣叉斀妞ゆ柨鎼敓鑺ヮ殜楠炴垿濮�閻橆偅顫嶉梺闈涚箳婵挳鎳撻崹顔规斀闁宠棄妫楅悘锝囩磼椤曞懎鐏︾�规洘娲橀幆鏃堝Ω閿旇瀚奸梺鍝勵槺閸嬬偞绔熼崱娴板洭鏁冮崒娑橈拷鍨叏濮楀棗浜滅�规挸妫涢敓鑺ヮ問閸犳盯顢氳閸┿儲寰勯幇顒夋綂闂佺粯锕㈠褎鎱ㄩ崼鏇熲拻濞达絽鎲￠崯鐐烘煕閺傜偛鎳愮壕鑺ユ叏濡法绨垮┑顔藉▕閺岋綁濮�閻樺啿鏆堥梺鎶芥敱閸ㄥ潡寮婚悢铏圭煓闁圭瀛╁畷宕囩磽娴ｅ搫校闁圭顭锋俊鐢稿礋椤栨稒娅嗛柣鐘叉穿鐏忔瑦绂掗婊呯＝濞撴艾娲ら弸娑欍亜椤撶姴鍘存鐐插暣閹粓鎸婃径宀�鏋冨┑鐘垫暩婵挳宕愰懡銈囩煋婵炲樊浜濋悡娑樏归敐鍥ㄥ殌濠殿喖绉堕敓鍊燁潐濞叉牕鐣烽鍕厺閹兼番鍔岀粻娑欍亜閹捐泛浠︽繛鍛灲濮婄粯鎷呴挊澶婃優闂佺顑囬崑鐔煎窗婵犲偆鍚嬮柛銉ｅ妼鎼村﹪姊洪崜鎻掍簼缂佽绉撮…鍥冀椤愩倗锛濇繛杈剧秬閸嬪倿骞嬮悙鎻掔亖闂佸湱铏庨崰妤呮偂閻斿吋鐓熼柡鍐ㄥ�哥敮璺好瑰锟介崡鎶藉蓟濞戙垹围闁告粈绀侀崜浼存⒑鐎圭媭娼愰柛銊ユ健楠炲啫鈻庨幋顖涘闁割煈鍋呴崑鐘绘煕鐎ｎ剙浠辨慨濠冩そ瀹曨偊宕熼锟藉▍褎绻濋悽闈涘壋闁归鍏樺铏圭磼濡湱绻侀梺鍝ュУ缁嬫挾鍒掔拠娴嬫婵☆垶鏀遍～宥呪攽閻愬弶顥為柛銊╂涧椤曪綁骞庨懞銉㈡嫼闁荤姴娲﹁ぐ鍐吹鏉堚晝纾界�广儱鎳忛ˉ銏拷瑙勬礃缁矂鍩ユ径鎰潊闁炽儱鍟挎晶楣冩⒒娴ｇ顥忛柛瀣╃窔瀹曟洟寮婚妷銉у幈闂佺鎻梽鍕磻閿濆鐓欐い鎾跺枎缁楁帒鈹戦垾鐐藉仮闁哄矉绱曢敓鏂ょ秵娴滅偠鍊寸紓鍌欐祰妞村摜鏁敓鐘拷浣糕枎閹炬潙浠奸柣蹇曞仦閸庡啿鈻嶅鑸碘拻濞撴熬鎷锋繛浣冲吘娑㈠籍閸屾侗鍋ㄥ┑顔斤供閸擄箓宕甸弴鐔翠簻闁哄浂浜濈�氬綊鎮楃憴鍕闁告鍥х厴闁瑰濯撮幏鐑芥晲鎼存繄鍑归梺鍝勬－娴滄粓鍩為幋锔藉亹闁割煈鍋呭В鍕節閻㈤潧鍓抽柟宄板槻閳规垿鎮欓弶鍨殶闂佹悶鍎崝灞剧閸楃偐鏀介柣妯款嚋瀹搞儵鏌ｅΔ锟藉Λ娑㈠箟閹绢喗鏅濋柛灞剧〒閸樺崬鈹戦悙鏉戠仴鐎规洦鍓熷鎼佸Χ閸モ晝锛滈梺瀹犳閹冲繒锟芥艾婀辩槐鎾诲磼濞嗘埈妲繝鈷�鍡椥撻柡鍛版硾铻栭柛鏇ㄥ墯閸ｅ嘲鈹戦敍鍕杭闁稿鍊濆畷鎴﹀礋椤栨稒娅囧銈呯箰閻楀棝鎷戦悢鍝ョ闁瑰瓨鐟ラ悘鈺呭箚閻斿吋鈷戦柟绋垮缁屽潡鏌熸搴″幋闁哄苯绉剁槐鎺懳熼懡銈庢Ф闂備浇娉曢崰搴ㄦ晸閻ｅ苯娅忔繛鍏煎姈缁绘盯宕ｆ竟婵愪簽閸欏懘姊虹紒妯活棃闁哄懓灏欓幑銏ゅ幢濞戞瑧鍘卞銈嗗姧缁插墽绮堥敓浠嬫⒑缂佹ê濮囬柨鏇樺劦婵＄敻宕熼鍓ф澑闂佽鍎崇壕顓°亹閸涘瓨鈷戦柣鎰閸旀粓鏌＄�ｎ亗鍋㈢�殿喓鍔戦幊鐐哄Ψ閿濆嫮鐩庨梻浣告惈閸犳盯骞忛悜鑺ョ厸閻庯綆鍓涚敮娑氱磼濡ゅ啫鏋庨柍钘夘樀婵拷闁挎稑瀚獮鍫ユ⒒婵犲骸浜滄繛璇х畵瀵悂宕掗悜鍡樻櫆闂佸憡娲﹂崑鍡涘Χ椤愶附鈷掗柛灞剧懅椤︼箑顭块悷甯含鐎规洘鍨剁粭鐔兼晸閽樺鏆﹂柡鍥ュ灩閽冪喖鏌曟径娑氱暠濞存粍顨婂娲濞戣鲸孝闂佸搫鎳忕划鎾诲箖閿熺姵鍋勯柛蹇氬亹閸樻悂姊洪幖鐐插姉闁哄懏绋掔粋鎺戭煥閸喓鍙嗛梺缁樻⒒缁垶藟婢跺绡�闁跨喍绮欓弻鍡楊吋閸℃ɑ顏熼梻浣稿悑娴滀粙宕曢幎钘夌柈闁哄被鍎查悡娆撴煕閹存瑥锟芥牜锟芥熬鎷�? by changhao
				if (c1 == null)
				{
					return false;
				}
				
				SBattleFieldScore msg = new SBattleFieldScore();
				msg.myrank = -1;
				
				fire.pb.clan.fight.ClanFightBattleField bf = fire.pb.clan.fight.ClanFightFactory.getClanFightBattleField(c1, true);
				if (bf != null)
				{
					msg.clanscore1 = bf.getClanfightBean().getClanscore1();
					msg.clanscroe2 = bf.getClanfightBean().getClanscore2();
					
					ClanFightBattleField.RankInfo info = bf.getRankSorceByRoleId(roleid);
					if (info != null)
					{
						msg.myrank = info.rank;
						msg.myscore = info.scroe;						
					}
					
					psendWhileCommit(roleid, msg);
				}
				
				return true;
			}
		};
		
		battlefieldscore.submit();	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808535;

	public int getType() {
		return 808535;
	}


	public CBattleFieldScore() {
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
		if (_o1_ instanceof CBattleFieldScore) {
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

	public int compareTo(CBattleFieldScore _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

