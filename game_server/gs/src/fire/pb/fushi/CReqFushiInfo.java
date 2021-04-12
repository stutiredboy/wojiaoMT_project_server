
package fire.pb.fushi;

import org.apache.http.client.methods.HttpGet;
import fire.pb.main.Gs;
import gnet.link.Dispatch;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqFushiInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqFushiInfo extends __CReqFushiInfo__ {
	@Override
	protected void process() {
		final int userID = ((Dispatch)this.getContext()).userid;
		final long roleID = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleID < 0)
			return;
		FushiManager.logger.info("CReqFushiInfo:userid:" + userID + ",roleid:" + roleID);
		if (fire.pb.fushi.Module.getIsYYBUser(userID)){
			try {
				final HttpGet request = FushiManager.makeYybGetCurrencyRequest(userID, roleID);
				if(request != null) {
					Gs.getHttpClient().execute(request, 
						new YybGetCurrencyHandler(userID, roleID) {
						@Override
						protected boolean executeHandler(int balance, int genBalance, int firstSave, int saveAmt){
							return true;
						}
					});
				} 
				else {
					FushiManager.logger.error(new StringBuilder("roleId=").append(roleID).append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏堕柣搴ゎ潐濞插繘宕曢幎鑺ユ櫢闁哄倶鍊楃粔鐢告煕閻樺磭澧卞瑙勬礋瀹曠螖娴ｅ搫骞嶉梻浣筋嚃閸ㄨ櫕鏅跺Δ鍚藉寰勯幇顒傤啇闂佸搫顦伴崺濠囩叕椤掑嫭鐓涢悘鐐额嚙閿熻姤绻堥獮濠傗攽鐎ｎ亞顓煎銈嗘閸嬫劖鏅堕姘ｆ斀闁绘劘灏欓幗鐘电磼椤旇偐鐏辩紒杈╁仦缁绘繈宕惰閹芥洖鈹戦悙鏉戠仧闁搞劎鎳撻弫顕�姊绘担鐟邦嚋缂佽鍊块獮濠冩償閵婎澁鎷烽弽銊ョ窞闁归偊鍘搁幏铏圭磽娴ｅ壊鍎愰悗绗涘洤绠查柨婵嗩槹閻撴洟鏌ｅΟ铏癸紞濠⒀呮暩閿熻姤顔栭崰鏍�﹂悜钘夋瀬闁瑰墽绮崑鎰版煠绾板崬澧绘俊韫嵆濮婄粯绗熼敓钘夘焽瑜旈垾锕傚醇閵夈儳锛熸繝鐢靛У閼瑰墽绮婚鐐寸厽闁靛牆楠搁悘娑樏瑰鍐Ш闁哄瞼鍠栭幃婊兾熼搹閫涙闂佸搫顦悧鍡涙偋閹炬緞娑㈠川閹碱厽鏅濋梺闈涚箚閿熻姤鍓氬Σ杈╃磽閸屾瑧顦︽い鎴濇閺侇噣鍨惧畷鍥ㄦ闂佽澹嗘晶妤呭磻閵娾晜鐓曟繛鎴烇公瀹搞儱霉閻欙拷閸樺ジ鍩為幋锔藉�烽柛娆忣樈濡偟绱撴担铏瑰笡闁告梹鐟╅妴渚�寮崼顐ｆ櫇闂侀潧鐗嗗ú銊╂晬濠婂牊鈷戠紓浣光棨椤忓棗顥氭い鎾跺枑濞呯娀鏌ｉ姀鐘冲暈闁绘挻绋撻敓鐣屾閹风兘鎮楅敐搴″闁伙箑鐗撻幃妤冩喆閸曨剛顦ラ悗瑙勬处閸撶喖宕洪姀鈩冨劅闁靛牆娲ㄩ弶鎼佹⒑閸濆嫬鏆欓柛濠勫厴閺屽洭顢涘锝嗘杸闁圭儤濞婂畷鎰旀担鐟板伎闂佺粯鍨煎Λ鍕婵犳碍鐓熼柟閭﹀墯閹牓鏌涢妸銉ワ拷鍧楀蓟濞戞粠妲奸梺闈涙处缁捇寮幘璇茬闁圭儤妫忓Σ顕�姊虹�圭媭鍤欓梺甯秮閻涱喚锟斤綆鍠楅崑鎰版煟閵忕姷浠涙繛鍫滅矙濮婄粯鎷呴崨濠冨創濡炪倧绠撴禍璺虹暦閹达附鍋勯柛娑橈攻閻濆嘲鈹戞幊閸娧囧箯闁垮浜滄い鎾跺仦閸嬨儵鏌℃担瑙勫鞍缂佸倹甯為敓鏂ょ秵閸嬶拷闁归绮换娑欐綇閸撗呅氬┑鈽嗗亜鐎氭澘鐣烽妷鈺傚仭闁逛絻娅曢弬锟芥俊鐐�栧濠氬磻閹捐姹叉い鎺戝亰閹烽鎲撮崟顒傤槰缂備浇顕ч悧鎾绘偘椤旀拝鎷烽敐搴℃灍闁哄懏绻堥弻銊╂偄閻戞ɑ鐝繝銏ｎ潐濞茬喎鐣风粙璇炬梹鎷呴崫鍕婵犵數濮甸鏍窗濡ゅ懎绀夐柡鍥ュ灪閺呮悂鏌ら幁鎺戝姢濠⒀呮暬閺屻劌鈹戦崼婵呮閻庢鍠楅幐铏叏閿熶粙鏌ㄥ☉妯侯仼鐎殿喗濞婂缁樻媴閾忕懓绗″┑鐐插级閻楃姴鐣烽幇鏉挎嵍妞ゆ挶鍔嶇�氳鎱ㄥΟ鐓庝壕閻庢熬鎷�"));
				}
			}
			catch(Exception e){
				FushiManager.logger.error(new StringBuilder("roleId=").append(roleID).append("闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗霉閿濆浜ら柤鏉挎健濮婃椽顢楅敓鐣岀矓閹绢喖纾奸柕濞у嫬鏋戦梺鍝勫暙閻楀棛绮婚弽銊х鐎瑰壊鍠曠花濠氬箚閻斿吋鈷戦梻鍫熶緱濡牓鏌涢悩鎰佹畼缂佽京鍋為幆鏃堝閵忋垻妲囬梻浣圭湽閸ㄨ棄顭囪閻楀酣姊绘担鍝勫付缂傚秴锕︾划濠氬冀瑜滈崵鏇㈡煕濞戞﹫鍔熼柣鐔风秺閺屻劑鎮㈤崜浣虹厯閻庢鍠栭…宄邦嚕閹绢喖顫呴柣妯款嚙閺佽绻濋悽闈涒枅婵炰匠鍏犳椽濡搁埡浣勓勩亜閹板爼妾柍閿嬪灩閹叉悂鎮ч崼婵呭垔濠碘槅鍋呴崹鍧楀蓟濞戞粎鐤�闁哄啯鎹侀敓鍊熸硶閿熻姤顔栭崳顕�宕戞繝鍥╁祦婵☆垵鍋愮壕鍏间繆椤栨粎甯涙い蹇曞枛濮婄粯鎷呴懞銉с�婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�? 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垹顭峰缁樻媴閻熼偊鍤嬪┑鐐插级閻楃姴鐣烽幇鏉跨濞达絿顭堥悗顓㈡⒑缁嬭法鐏遍柛瀣仱閹繝濡烽埡鍌滃幗闂佸搫娲ㄩ崑娑㈡晸閽樺璐￠柨鐔诲Г閻旑剟骞忛敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫炵紓浣界堪閸婃洟婀侀梺缁樏Ο濠囧磿韫囨洜纾奸柣妯硅濞兼劙鏌曢崶褍顏鐐叉喘閸┾剝绗熸繝鍐伓闂佸搫绋侀崑鎾诲箯瀹勯偊娼╂い鎺戭槺閸氬姊洪崫鍕効缂傚秳绀侀锝夘敆閸曨偄鐎銈嗘濡嫰鏁撶粵瀣仸婵﹨娅ｇ划娆撳礌閳ュ啿顫犻梻浣芥〃缁�渚�鈥﹀畡閭﹀殨濠电姵纰嶉弲鎻掝熆鐠轰警鍎忓ù婊勭矒濮婃椽宕ㄦ繝鍕ㄦ闂佹寧娲╃粻鎾崇暦濞嗘挸鐏抽柟棰佺劍鐎靛矂姊洪棃娑氬缂佺粯甯炵划鏃堫敆娴ｈ櫣顔曢梺鍛婁緱閸犳绮堥崼銉︾厵妤犵偛鐏濋悘鈺呮煃閽樺妯�濠殿噯鎷烽梺缁橆焾椤曆囧极瑜版帗鈷掑ù锝堟鐢稒淇婇銏犳殻閽樼喖鏌熼幆褜鍤熸い鈺冨厴閺屻倕霉鐎ｎ偅鐝栫紒鐐礃濡嫰濡撮幒鎴僵妞ゆ帊鐒﹂幃娆忊攽閻愬弶鍣洪柨鏇樺灲瀵鈽夊Ο閿嬬�婚棅顐㈡处閹歌鈻撴繝姘�垫繛鍫濈仢濞呮﹢鏌涚�ｎ亷宸ラ柣锝囧厴楠炴帒螖娴ｉ潻鎷烽悜鑺ョ厾缁炬澘宕晶缁樹繆閹绘帞鍩ｉ柡宀嬬秮閹垽宕妷褏鍘愮紓鍌欑椤︿即骞愰幎濮愶拷浣割潩鐠轰綍銊╂煃鏉炴媽鍏屾い鏃�甯￠弻锝嗘償閵婏附閿梺纭呭Г缁捇銆佸▎鎾冲嵆闁靛繆妾ч幏娲⒑閸︻収鐒炬繛鎾棑缁骞樼紒妯煎幍闂佸憡鍔樼亸娆戠不瀹曞洨纾兼い鏃囧亹婢ф洟鏌ｉ敐鍡欑疄鐎规洜鍠栭、妤呭磼濮橆剛鐤勯梻鍌氬�峰ù鍥綖婢舵劕纾块柟鍓佺摂閺佸銇勯幘璺盒ュ☉鎾崇Ч閺屸�愁吋鎼粹�崇闂佺锕﹂弫璇差潖婵犳艾閱囬柣鏃囥��濡劑姊虹粙娆惧剭闁搞劌顭烽弫鎾诲磹閻曚焦缍堝┑鐐村絻缁绘ê鐣峰┑鍥ㄥ劅闁靛闄勫▍銏ゆ⒑閸忛棿鑸柛搴㈠▕閸╋附鎷呴獮澶哥盎濡炪倖鎸鹃崑鐐哄窗濡》鎷风憴鍕┛缂傚秳绀侀悾鐑藉础閻戝棙瀵岀紓鍌欑劍钃遍柡澶嬫倐濮婄粯鎷呴搹鐟扮闂佸憡姊瑰ú鏍敋閿濆閱囬柡鍥锋嫹濠㈣埖鍔栭崐鐑芥煟閹寸伝顏呯閸濆嫷娓婚柕鍫濇婢ь剚銇勯妸銉︻棞闁宠绉电换婵嬪礋閼搁潧顏堕柣鐔哥懃鐎氼厾绮堥崼銉︾厸濞达絿鐡旈崵娆愩亜閺囶亞绋荤紒鍌涘笧閿熸枻绲介悘姘跺疾閿濆鈷戠紓浣股戦悡銉╂煙绾板崬浜滄い鏇秮楠炲酣鎳為妷銏″濠电偠鎻紞锟藉┑顔哄�楀☉鐢稿醇閺囩喓鍘遍梺鎸庣箓缁绘帡鎮鹃崹顐闁绘劘灏欑粻濠氭煛娴ｈ宕岄柡浣规崌閺佹捇鏁撻敓锟�?") , e);
			}
		} 
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812490;

	public int getType() {
		return 812490;
	}


	public CReqFushiInfo() {
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
		if (_o1_ instanceof CReqFushiInfo) {
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

	public int compareTo(CReqFushiInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

