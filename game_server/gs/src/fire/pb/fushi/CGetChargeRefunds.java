
package fire.pb.fushi;

import org.apache.log4j.Logger;

import fire.pb.RoleConfigManager;
import fire.pb.common.SCommon;
import fire.pb.main.Gs;
import gnet.DataBetweenAuAnyAndGS;
import gnet.DeliveryManager;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGetChargeRefunds__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGetChargeRefunds extends __CGetChargeRefunds__ {
	private static Logger logger=Logger.getLogger("RECHARGE");
	
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		final int userid = ((gnet.link.Dispatch) this.getContext()).userid;
		if (roleid < 0 || userid <0) {
			logger.error("CGetChargeRefunds.userid:" + userid + ",roleid:" + roleid + ".闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿噮鍣ｉ弫鎾寸鐎ｎ亞顔嗗┑鐘绘涧椤戝懐绮婚姘兼富閻庯綆浜濋幑锝囩磼閻樿櫕鈷愮紒缁樼洴楠炲鎮欓崱妯虹仸鐎垫澘瀚板畷鐔碱敍濞戞艾骞堥梺璇插嚱缁茶姤鏅舵惔锝呭К闁跨喍绮欏娲传閸曨剚鎷卞┑鐐插级椤洭骞戦姀鐘闁靛繆锟界鎷烽柨瀣ㄤ簻闁瑰搫绉烽崗宀�鎲搁幍顔兼灈婵﹦绮幏鍛存嚍閵夛綇鎷烽崘顏嗙＜闁跨喕濮ょ粭鐔兼晸娴犲锟戒線寮介妸銉х獮闂佸綊鍋婇崜婵嬪箺閺囥垺鈷戦柛婵嗗閸屻劑鏌涢妸銉хШ闁哄苯顑夊畷鍫曞Ω瑜忛惁鍫ユ⒑閸撹尙鍘涢柛瀣閹便劑宕奸妷銉︾�梺鍓插亖閸庢煡鍩涢幒鎳ㄥ綊鏁愰崨顔兼殘闂佽鍨伴悧鎾诲蓟閻斿吋鐓ラ悗锝庝簽娴煎苯螖閻橀潧浠滅紒缁橈耿瀵偊骞樼紒妯绘闂佽法鍣﹂幏锟�?");
			return;
		}
		final SCommon cc = RoleConfigManager.getRoleCommonConfig(309);
		if (cc == null) {
			logger.error("CGetChargeRefunds.闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆欑穿闂備浇娉曢崰鎰板几閼姐倗涓嶉柟鎯х－閺嗭箑鈹戦崒婊庣劸妞ゎ偄鎳橀弻宥夊Ψ閵夈儲姣愮紓浣靛妸閸庨潧顫忕紒妯诲闁告稑锕ㄧ涵锟藉┑鐘媰閸曞灚鐣跺銈庡幖閻忔繆鐏掗梺鍏肩ゴ閺呮瑧绮径鎰拺缂備焦锕╅悞鐣岀磼椤曞懎鐏﹂柟顕嗙節婵＄兘鍩￠崒婊冨箺闂備礁鎼ú銊╁磻濞戙垺鏅搁柦妯侯槹鐠愶繝鏌ㄩ悢璇残撻柣鏃戝墴楠炲繘鏁撻敓锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為梺闈浤涢崨顓㈢崕闂傚倷绀佹竟濠囧磻娓氾拷瀹曟洟鎳￠妶鍥╊槸闂佸搫璇炲畝锟介崬鐢告煟閻樼儤銆冮悹锟介敃鍌氱？闁硅揪闄勯悡鐔哥節闂堟稒顥犻柛鈺嬬秮閺岋紕浠﹂崜褎鍒涢梺绯曟櫅鐎氭澘鐣峰锟介、鏃堝川椤撶喓褰┑鐘垫暩閸嬬偤宕归崼鏇炵闁告縿鍎抽惌鎾舵喐閻楀牆绗掗柦鍐枛閺屻劌鈽夊Ο渚还濠电偛鐭堟禍顏堝箖瑜版帒鐐婇柕濞垮劤缁侀攱绻濆▓鍨灈婵炴挳顥撳Σ鎰板箻鐎涙ê顎撻梺鍛婄箓鐎氼喛銇愬▎鎾粹拺闁硅偐鍋涢崝姗�鏌涢弬鍧楀弰鐎规洏鍨介獮妯肩磼濡攱瀚奸梻浣告啞缁嬫垿鏁冮敂鍓т笉闁瑰墽绮崐鍨叏濡厧甯跺褜鍨崇槐鎺楀磼濮樻瘷褔鏌熼鐣屾噰闁诡喗绮岃灒闁绘挸楠哥粻娲⒒閸屾瑨鍏岄柟铏崌楠炴牠顢曢妶鍥╃厠闂佸壊鍋呭ú姗�宕曞Δ浣虹闁糕剝蓱鐏忎即鏌ｉ幘瀵搞�掗柨鐔烘櫕濞呫垽骞忛悜鑺ュ�甸柨婵嗛婢ф壆鎮敃鍌涒拻濞达綀娅ｉ妴濠囨煛閸涱喚銆掗柨鐔诲Г绾板秴顭垮锟介幃鎯х暋闁附寤洪梺璺ㄥ枙婵倖绌辨繝鍌ゆ桨鐎癸拷婵犲唭銊╂⒒娴ｇ瓔鍤冮柛锝庡灣缁辩偞鎷呴崜鍙夌稁缂傚倷鐒﹁摫濠殿垱鎸抽弻娑㈡晜鐠囨彃绠洪梺鐓庣仢濞差厼顫忛搹鍦煓闁圭瀛╁畷鎶芥⒑缁嬭法鏄傞柛濠冾殘閸掓帞锟斤綆浜堕崥瀣熆鐠轰警鍎愭繛鍛矋缁绘繈濮�閵忊槅浠х紓浣哄У閸ㄧ數鍙呭銈嗘尪閸ㄥ綊寮告笟锟介弻鐔煎礈瑜忕敮娑㈡煛閸涱喗鍊愰柡灞诲姂閹倝宕掑☉姗嗕紦?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ姀鐘差棌闁轰礁锕弻鈥愁吋鎼粹�崇缂備焦鍔栭〃鍡樼┍婵犲洤围闁告侗鍠栧▍婵嬫⒑鐠恒劌鏋戦柡瀣吹缁骞樺畷鍥ㄦ婵犻潧鍊搁幉锟犲磻閸曨厾纾介柛顐犲灩鍟搁梺娲诲幗鐢�愁潖缂佹ɑ濯撮柛婵勫劤妤旀繝纰樻閸嬪鈻旈弴鐘插灊闁割偆鍠愭刊鎾煙閹殿喖鏆�闁搞儜鍡樻啺闂備線娼ч敍蹇涘礃閵娧冾嚤闂傚倸鍊烽悞锕傚箖閸洖纾挎い鏍仜缁�澶愬箹濞ｎ剙濡奸柣鎾卞灩閵嗘帒顫濋悙顒�顏堕梻浣告惈閼活垳绮旇ぐ鎺戣摕闁靛ě宥嗗闁挎繂绨肩花钘壝归悡搴ｇ劯婵﹥妞藉畷顐﹀礋椤愵偅校闂備礁鎲￠幐鑽ゆ崲閸岀儐鏁嬮柕澶嗘櫅缁�瀣亜閹哄秶顦﹂柛鏂挎嚇濮婃椽妫冨☉姘辩暰闂佺顑嗛幑鍥极閹剧粯瀵犲鑸电閸氼偊姊洪崫鍕潶闁稿﹥绻傞悾鐑芥晲閸℃绐為柣蹇曞仩琚欓柟椋庡缁绘繂鈻撻崹顔界亪闂佹寧娲忛崐婵嬬嵁閺嶎収鏁冮柨婵嗘閻濓繝姊婚崒娆戝妽闁诡喖鐖煎畷鏇烆煥閸愭儳鎮戦梺绯曞墲椤ㄥ繑瀵奸幘缁樼厽闁绘柨鎽滈惌瀣繆椤愩垹鏆ｉ柟顔诲嵆椤㈡瑧鎹勯妸褎婢戞繝鐢靛仦閸ㄥ爼鎮烽敃锟介埢宥夊閵堝棌鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷309婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈鏍″┑鐘灪椤牓鎮橀崘顔解拺闁圭娴风粻鎾绘煙閸愭煡鍙勭�殿喗濞婇幃娆撴倻濡厧骞堥梺纭呭閹活亞妲愰弴鐔告珡闂傚倷绀侀幖顐︽儗婢跺瞼绀婂ù锝呭閸ゆ洖霉閻樺樊鍎忛幆鐔兼⒑闂堟侗妾ч梻鍕閳绘捇銆傞敓锟�!userid:" + userid + ",roleid:" + roleid);
			return;
		}
		int rolelevel = xtable.Properties.selectLevel(roleid);
		if(rolelevel < (cc == null ? 0 : Integer.parseInt(cc.getValue()))) {
			logger.error("CGetChargeRefunds.缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿噮鍓熷畷褰掝敊鐟欏嫬鐦遍梻鍌欑劍濡炲潡宕㈡禒瀣仭闁冲搫鎳庨拑鐔兼煟閺傝法娈遍柡瀣叄濮婁粙宕堕澶嬫櫔閻熸粌绉堕崣鍛存⒑閹稿孩绌块柟鐑芥敱閵囧嫰顢橀悙瀵糕敍缂備胶濮电粙鎴﹀煡婢舵劕绠抽柣鎰綑椤忓爼姊洪幐搴㈢闁稿﹤鎽滅划濠氭晲婢跺鍘介梺鐟扮摠缁诲啴藟濠婂牊鐓涢柛婊�绀佹晶瀛樻叏婵犲偆鐓肩�规洘甯掗埢搴ㄥ箣濠靛棭鐎撮梻鍌欐祰椤曟牠宕伴弽顓熷亯闁绘挸娴烽弳锕傛煛閸ャ儱鐒洪柡浣哥Ч閺岋綁骞囬姘辨濡炪倧瀵岄崳锝夊蓟閻旂厧绀傞柤娴嬫櫆濞堫剟姊洪崨濠冪叆闁活厼鍊块獮鍐灳閺傘儲鏂�闁诲函缍嗛崑鍡涘储閹间焦鈷戦柛娑橈工婵倿鏌涢弬鎸庢拱缂佸倸绉电�佃偐锟芥稒顭囬崢鍨繆閻愬樊鍎忓Δ鐘虫倐瀹曘垽骞橀鐣屽幗濠电偞鍨靛畷顒�鈻嶅鍥锋嫹鐟欏嫭绀�缂傚秴锕妴浣糕枎閹炬潙浜楅柟鍏兼儗閸犳绱為幘缁樷拻闁稿本鑹鹃敓鐣屽厴閹虫宕滄担绋跨亰濡炪倖鐗滈崑鎴︽晸閽樺鏆ｇ�规洏鍔戦、姗�宕堕妸褉妲堥梺瀹狀潐閸ㄥ灝鐣烽崡鐐╂瀻闁归偊鍙庨崯搴㈢節閻㈤潧浠滄い鏇ㄥ弮瀹曘垼顦归柟顔芥そ婵℃悂鍩℃担鐑樼叄闂備礁缍婂Λ鍧楁倿閿曞倹鍋傞柕澶嗘櫆閻撶喖鏌￠崶鈺佷粶闁跨喕妫勫﹢閬嶆晸閼恒儳鍟查柟鍑ゆ嫹,婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹤顕ｇ拠娴嬫婵☆垶鏀遍弬锟介梻浣告啞濞诧箓宕戦崟顒佸弿闁靛繈鍊栭埛鎴炵箾閼奸鍤欐鐐搭殜閺岀喖宕ㄦ繝鍐拷鎰版煃閵夛附顥堢�规洘锕㈤、鏃�鎯旈姀鐙�浼撻梻浣瑰缁诲倻鑺遍懖鈺勫С缂備焦菧娴滄粓鏌熼崫鍕靛剰闁诲浚鍣ｉ弻銊╂偄閸戙倖瀚归柣鏇氱劍缂嶅牆鈹戦悙鎻掔骇闁挎洏鍨介獮鍐晸閻樿櫕娅㈤梺缁橆焾鐏忣亪骞楅弴銏♀拺缂備焦蓱閳锋帡鎮樿箛瀣妤犵偛绻橀幃婊堟嚍閵夈儰缂撴繝鐢靛仜閻楁劕鈻旈弴銏犵闁告稑锕︾粻楣冩倵閻㈡鐒炬い搴㈡尵缁辨帡鎮╅崘鑼紝濠电媴鎷峰ù锝囩《閺�浠嬫煟濡鍤嬮柡锟芥繝姘厱闁哄喛鎷烽柣妤佺矒閺佹捇鎳為妷褍鏆￠梺鐟板殩閹凤拷?!userid:" + userid + ",roleid:" + roleid);
			return;
		}
		
		xbean.AUUserInfo userinfo = xtable.Auuserinfo.select(userid);
		if(userinfo == null) {
			logger.error("CGetChargeRefunds.AUUserInfo婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈鏍″┑鐘灪椤牓鎮橀崘顔解拺闁圭娴风粻鎾绘煙閸愭煡鍙勭�殿喗濞婇幃娆撴倻濡厧骞堥梺纭呭閹活亞妲愰弴鐔告珡闂傚倷绀侀幖顐︽儗婢跺瞼绀婂ù锝呭閸ゆ洖霉閻樺樊鍎忛幆鐔兼⒑闂堟侗妾ч梻鍕閳绘捇銆傞敓锟�!userid:" + userid + ",roleid:" + roleid);
			return;
		}
		String username = userinfo.getUsername();
		DataBetweenAuAnyAndGS ausnd = new DataBetweenAuAnyAndGS();
		ausnd.flag = DataBetweenAuAnyAndGS.GS_TO_AuAny;
		ausnd.qtype = 9003;
		ausnd.userid = userid;
		OctetsStream temp = new OctetsStream();
		temp.marshal(username);
		temp.marshal(Gs.serverid);
		ausnd.info = temp;
		DeliveryManager.getInstance().send(ausnd);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812485;

	public int getType() {
		return 812485;
	}


	public CGetChargeRefunds() {
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
		if (_o1_ instanceof CGetChargeRefunds) {
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

	public int compareTo(CGetChargeRefunds _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

