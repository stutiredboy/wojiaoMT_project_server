
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestMatchInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犲鏌＄仦绋垮⒉鐎垫澘瀚敓鏂ょ秵娴滄繈顢欓崨顓涙斀闁绘劕寮堕埢鏇灻瑰鍐煟鐎殿噮鍋婂畷鍫曨敆娴ｅ搫甯鹃梻濠庡亜濞诧箑煤閺嵮勬瘎闂傚倷绀侀幉锛勬崲閸愵喓锟藉啯绻濋崒銈嗙稁缂傚倷鐒﹂…鍥偡瑜版帗鐓曢柕澶嬪灥閸犳艾顭囬懡銈囩＝闁稿本鐟чˇ锔姐亜閿曞倷鎲剧�殿噮鍋嗛幏鐘绘嚑椤掍焦顔曢梻浣告惈濞层垽宕归崷顓犱笉闁挎繂妫涚弧锟介梺闈涢獜缁辨洜绮婚幘鍓佺＝鐎广儱鎷戝銉╂煟閿濆懎妲婚摶鏍煕濞戝崬骞樻い蟻鍥ㄢ拺闁稿繗鍋愰妶鎾煛閸涱喚绠為柛鈹垮灱缁犳盯寮撮悩纰夌闯闂備胶顭堥張顒勬偡瑜忕划浣冪疀濞戞瑧鍘甸梺缁樺灩閻℃柨螞閹达附鐓ラ柣鏃傚劋濞呮洘绻涢崨顐㈢伈妤犵偛绻橀幃婊堟嚍閵壯冨汲闂備胶绮弻銊︽櫠鎼淬劍鍎楁繛鍡樺姦濞堜粙鏌ｉ幇顒佲枙婵☆垽鎷锋俊銈囧Х閸嬬偤鎮уΔ鍛闁告稑鐡ㄩ崑鈥澄涙０浣藉厡缂傚秴绉瑰濠氬磼濞嗘埈妲繝銏㈡嚀閿曨亜鐣烽幋锕�宸濇い鏍ㄧ☉鎼村﹪姊洪崨濠冨闁搞劑浜跺畷鎴︽晸閻樺磭鍘繝鐢靛仧閸嬫挸鈻嶉崱娑欑厽闁规崘娉涢弸娑㈡煛鐏炵偓绀夌紒鐘崇♁缁绘繈宕橀埡鍐ㄧ到闂傚倷娴囬褏鎹㈤幒鎾剁闁跨喍绮欓弻锛勪沪閸撗勫垱闂佽鍠撻崹濠氬箯閻樿绠甸柟鐑樺毄閵夆晜鐓熼柣鏂挎憸閻帗銇勯敐蹇擃洭婵炲棎鍨归～婵嬵敆婢跺绋佹繝鐢靛仜濡﹥绂嶅鍛笉鐟滅増甯楅悡鐔兼煙闁箑骞栫紒鑼额嚙閳规垿顢氶敓浠嬎夐幘鑸殿潟闁规儳鐡ㄦ刊鎾煢濡警妲奸柡浣瑰缁绘繂鈻撻崹顔界亖闂佺锕ョ换鍌烆敋閿濆钃熼柕澶堝劦閸炲爼姊洪崫鍕窛闁稿鍠栭、娆忕暆閸曨兘鎷虹紒缁㈠幖閹峰顭囬幇顓滀簻闁靛鍎查崳褰掓煥閺囨ê鐏茬�规洩绻濋幃娆撳煛閸屻倖缍岄梻鍌欑劍閻綊宕硅ぐ鎺戠疅闁跨喓濮甸崑鍌炴煏婢跺棙娅嗛柛濠勬暬閺屻劌鈹戦崱娆忓毈闂佺懓寮堕崕鎶芥箒缂佺虎鍙冮弨杈╋拷姘炬嫹
 * @author changhao
 *
 */
public class CRequestMatchInfo extends __CRequestMatchInfo__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestmatchinfo = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				SRequestMatchInfo msg = new SRequestMatchInfo();
				
				xbean.ETeamMatch ematch = xtable.Targetid2teammatch.get(0);
				if (ematch == null)
				{
					msg.playermatchnum = 0;
					msg.teammatchnum = 0;
				}
				else
				{
					msg.teammatchnum = ematch.getTeammatchdatalist().size();
					msg.playermatchnum = ematch.getRolematchdatalist().size();
				}
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);
				
				return true;
			}
		};
		
		requestmatchinfo.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794512;

	public int getType() {
		return 794512;
	}


	public CRequestMatchInfo() {
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
		if (_o1_ instanceof CRequestMatchInfo) {
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

	public int compareTo(CRequestMatchInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

