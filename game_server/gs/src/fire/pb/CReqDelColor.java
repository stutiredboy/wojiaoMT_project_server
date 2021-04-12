
package fire.pb;
import org.apache.log4j.Logger;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqDelColor__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqDelColor extends __CReqDelColor__ {
	public static final Logger logger = Logger.getLogger("SYSTEM");
	@Override
	protected void process() {
//		闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呴搹鐟扮闂佸憡姊瑰ú鐔笺�佸棰濇晣闁绘ê鍚�缁楀淇婇妶蹇曞埌闁哥噥鍨堕幃锟犲Ψ閳哄倻鍘介梺鍝勫暙濞村倿宕靛▎鎴炲仏婵浜壕钘壝归敐鍫燁仩閻㈩垱鐩弻锝夊煛婵犲倻浠╅梺浼欑悼閸忔ɑ淇婇幖浣哥厸濠电姴鍟▍宥夋⒒娴ｈ櫣甯涙慨濠傤煼閳ワ箓宕奸妷锔规嫽濡炪倖鐗滈崑鐐哄煕閹烘嚚褰掓晲閸モ晜鎲橀梺鎼炲�曢崯鎾蓟濞戙垺鍋愰柧蹇ｅ亞椤︿即鎮楃憴鍕┛缂佺粯绻堥悰顔芥償閵婏箑鐧勬繝銏ｆ硾椤戝洭鏁撶粵瀣⒋婵﹥妞藉畷鐑筋敇閻戝棙姣夋繝鐢靛О閸ㄦ椽鏁冮姀銈嗗仒妞ゆ洩鎷峰┑顕嗘嫹闂佹寧绋戠�氼噣顢欓弴銏♀拺缂侇垱娲栨晶鍙夈亜閵娿儳澧㈢紒顔碱煼楠炲秹顢欓崜褝绱查梻浣虹帛閿曘垹顭囪瀵鈽夊▎鎰伎婵犵數濮撮崑鍡涙偂閼测晪鎷风憴鍕閻㈩垱甯￠崺銏℃償閵娿儳顓哄┑鐘绘涧濡參鎮楅弶鎴旀斀闁绘ê鐏氶弳鈺佲攽椤旇宓嗙�规洜鎳撶叅妞ゅ繋绶ら幏鐑芥晝閸屾氨鍊為梺瀹犳〃缁�渚�鎮樻繝鍥ㄢ拺闁告繂瀚弳娆撴煟濡わ拷閿曨亪骞冮敓鐘参ㄩ柍鍝勫�搁敓鐣屾暬閺屻劌鈹戦崱娑憋拷妤�顭胯婢瑰棝骞夐幖浣哥妞ゆ棃妫挎竟鏇犵磽娴ｈ櫣甯涚紒璇茬墦楠炲啯绂掔�ｎ偒妫冨┑鐐殿棎缂堜即宕归搹瑙勫床婵炴垶鐭▽顏堟煕鐏炲墽鍟查柟椋庡厴瀵挳鏁嶉崟顏嗙秿婵犵數濮甸鏍窗濡ゅ懌锟藉啴骞囬弶璺唵闂佺粯鍨兼慨銈夋偂濞嗘劑浜滈柡鍐ㄥ�哥敮鑸典繆閹绘帩鐓奸柡灞界Ф閹风娀宕ｆ径濠冩暘缂傚倷鑳舵慨鐢告儎椤栫偟宓佹繛鍡樻尭缁�鍐喐韫囨洜鐭嗗鑸靛姈閳锋帡鏌涚仦鍓ф噯闁稿繐鐭傞幃妯跨疀鐎ｎ亜顫囧Δ鐘靛仜缁绘﹢骞冨鍫熷殟闁靛／鍐ㄦ辈闂傚倷鑳剁划顖毭洪弽顓炵９闁革富鍙忛幏宄邦潩閻愵剙顏�
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				xbean.Properties prop=xtable.Properties.get(roleid);
				if(prop==null){
					return false;
				}
				java.util.List<xbean.RoleColorType> list=prop.getColorroomlist();
				if(removeindex<0||removeindex>=list.size()){
					return false;
				}
				list.remove(removeindex);
				
//				SReqDelColor sReqDelColor=new SReqDelColor();
//				gnet.link.Onlines.getInstance().send(roleid, sReqDelColor);
				CReqColorRoomView.sendColorRoomInfo(roleid);
				logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸啴鏁撻悾灞筋棜闁稿繗鍋愮弧锟芥繝鐢靛Т閸婅鍒婃總鍛婄厱閹兼惌鍨辩�氾拷 "+roleid+"闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呴搹鐟扮闂佸憡姊瑰ú鐔笺�佸棰濇晣闁绘ê鍚�缁楀淇婇妶蹇曞埌闁哥噥鍨堕幃锟犲Ψ閳哄倻鍘介梺鍝勫暙濞村倿宕靛▎鎴炲仏婵浜壕钘壝归敐鍫燁仩閻㈩垱鐩弻锝夊煛婵犲倻浠╅梺浼欑悼閸忔ɑ淇婇幖浣哥厸濠电姴鍟▍宥夋⒒娴ｈ櫣甯涙慨濠傤煼閳ワ箓宕奸妷锔规嫽濡炪倖鐗滈崑鐐哄煕閹烘嚚褰掓晲閸モ晜鎲橀梺鎼炲�曢崯鎾蓟濞戙垺鍋愰柧蹇ｅ亞椤︿即鎮楃憴鍕┛缂佺粯绻堥悰顔芥償閵婏箑鐧勬繝銏ｆ硾椤戝洭鏁撶粵瀣⒋婵﹥妞藉畷鐑筋敇閻戝棙姣夋繝鐢靛О閸ㄦ椽鏁冮姀銈嗗仒妞ゆ洩鎷峰┑顕嗘嫹闂侀潧鐗嗗ú銈堛亹閸曨垱鈷戦柟鑲╁仜閸旀﹢鏌涢弬璺ㄐч柛鈺傜洴楠炲洭鎮ч崼銏犲箰闂備胶纭堕崜婵嬪礉閺囥垺鏅搁柤鎭掑劤缁犳挻銇勯銏㈢缂佽鲸甯掕灒閻犲洤妯婇敓鑺ユ崌濮婃椽妫冮埡浣烘В闂佸憡眉缁瑩骞婇敐澶婄倞妞ゆ帊璁查幏娲⒑閸涘﹦鈽夐柨鏇樺劦閹繝濡烽埡鍌滃幗濡炪倖甯幏鐑芥煏閸喐鍊愮�殿噮鍋婇獮妯肩磼濡儤鐤呴梻渚�娼чˇ顓㈠磿閸楃倫鎺楀醇閵夛腹鎷洪梺鍛婄☉閿曪箓骞婇崘顔界厱闁绘柨鎲＄亸锕傛煟濞戝崬娅嶇�规洘锕㈤、娆撴嚍閵夛妇褰ㄩ梻鍌欑閹测�趁哄┑瀣槬闁哄稁鍋撻幏宄邦潩椤掑倻楔闂佸搫琚崝宀勫煘閹达箑骞㈡繛鎴炲敾閹峰嘲螖閸涱喚鍘搁柣搴秵閸撴瑩寮稿☉銏＄厸閻忕偛澧藉ú鏉戔攽閳ュ磭鍩ｇ�规洏鍔戦、娑橆煥閸愩剱鐔兼⒒閸屾瑧顦﹂柟纰卞亰瀵敻顢楅崒婊呯厯闂佺鎻粻鎴︽偂濠靛绠规繛锝庡墮閿熻姤顨婇幃鍧楁晸娴犲鈷戦柟绋挎捣缁犳捇鏌＄仦鏂ら練妞わ箒顫夐幈銊︾節閸涱噮浠╃紓浣介哺鐢帟鐏掗柣鐘叉处閻擄繝鎮楀ú顏呪拻濞达綀妫勯崥褰掓煕閿濆繒鐣垫慨濠佺矙瀹曠喖顢橀悩鐢靛幇闂佸搫顦悧鍕礉鎼达絽濮柨鐔剁矙濮婃椽骞栭悙鎻掑闂佸憡鏌ㄧ粔鎾煝瀹ュ顫呴柕鍫濇閹锋椽鏌ｉ悩鍏呰埅闁告柨鑻埢宥夊箛閻楀牏鍘甸梺鍛婂灟閸婃牜锟芥熬鎷�? "+removeindex);
				return true;
			}
		}.submit();
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786536;

	public int getType() {
		return 786536;
	}

	public int removeindex; // 删除索引

	public CReqDelColor() {
	}

	public CReqDelColor(int _removeindex_) {
		this.removeindex = _removeindex_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(removeindex);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		removeindex = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqDelColor) {
			CReqDelColor _o_ = (CReqDelColor)_o1_;
			if (removeindex != _o_.removeindex) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += removeindex;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(removeindex).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqDelColor _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = removeindex - _o_.removeindex;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

