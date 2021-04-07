
package fire.pb;
import fire.pb.common.SCommon;
import fire.pb.main.ConfigManager;

import java.util.Map;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqColorRoomView__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqColorRoomView extends __CReqColorRoomView__ {
	@Override
	protected void process() {
		// protocol handle
		//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜堕弫鍥煏韫囨洖啸闁告繃顨婂缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閺囥垹绠ｉ柨鏃傛櫕閸樿棄鈹戞幊閸娧囧箯閻戣姤鐓熸俊銈忔嫹缂佺粯锕㈡俊鎾川閺夋垼鎽曢梺闈涱檧婵″洭宕ｉ崟顖涱棅妞ゆ劑鍨烘径鍕箾閸欏鑰跨�规洜鏁婚弫鎾寸鐎ｎ偀鎷洪梺瑙勫劶婵倝寮柆宥嗙厽婵°倕鍟埢鍫拷娈垮枛椤兘寮澶婄妞ゅ繐鎳庢刊浼存⒒娴ｈ櫣甯涢柛鏃撶畵瀹曟粌鈻庨幋婵愭闂佸啿鎼崐鑽ゅ姬閿熶粙姊洪棃娑氱疄闁搞劍妞藉畷鐢告晸娴犲鈷戦柟绋垮缁岃法绱掗悩铏磳闁绘侗鍣ｅ畷姗�鍩℃笟鍥ф闂佽瀛╃粙鎺曟懌濠电偛鎳忕划鎾愁潖閾忕懓瀵查柡鍥朵簼鐎氬湱锟借娲栧ú銊╊敊婢舵劖鈷戦弶鐐村椤︼箓鏌ｈ箛鏃�鐨戦柟骞垮灩閳藉濮�閳╁啯鐝抽梻浣告啞娓氭宕板绔洭鏌嗗鍡忔嫼闂佸憡绋戦敃銉т焊閹殿喚纾奸悹鍥ㄥ絻閺嗙喖鏌ㄩ悢鍓佺煓婵炰匠鍥ч柟闂寸閺嬩線鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
//				xbean.Properties prop=xtable.Properties.select(roleid);
//				if(prop==null){
//					return false;
//				}
//				SReqColorRoomView sReqColorRoomView=new SReqColorRoomView();
//				java.util.List<xbean.RoleColorType> list=prop.getColorroomlist();
//				for(xbean.RoleColorType type:list){
//					if(type!=null){
//						fire.pb.RoleColorType rolecolortype=new fire.pb.RoleColorType();
//						rolecolortype.colorpos1=type.getColorpos1();
//						rolecolortype.colorpos2=type.getColorpos2();
//						sReqColorRoomView.rolecolortypelist.add(rolecolortype);
//					}
//				}
//				int max=0;
//				Map<Integer, SCommon> commonMap = ConfigManager.getInstance().getConf(SCommon.class);
//				if(commonMap!=null){
//					SCommon sCommon=commonMap.get(228);
//					if(sCommon!=null){
//						max=Integer.parseInt(sCommon.getValue());
//					}
//				}
//				sReqColorRoomView.nummax=max;//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫锟芥艾顦伴妵鍕箳閹存繍浠肩紓浣哄У瑜板啴婀侀梺鎸庣箓閹冲繒鎷归敓鐘崇厽婵犻潧锕ョ涵楣冩煃鐟欏嫬鐏撮柟顔规櫊楠炴捇骞掑鍥ㄦ櫦濠电姷鏁搁崑鐔碱敄閺囥垹绀夐柟瀛樼箥閸ゆ洟鏌涢锝嗙闂佸崬娲︾换娑㈠箣閻忔椿浜垾鏍拷锝庡枟閳锋垿鏌涘☉姗嗙劦闁硅揪闄勯崑鍌炴煥閻斿搫孝闁藉啰鍠栭弻銊╂偄閸濆嫅锝夋煛閸涱喗鍊愰柡灞诲姂閹倝宕掑☉姗嗕紦?濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿顦甸弻鏇＄疀鐎ｎ亷鎷烽弽顓炵柧闁归棿鐒﹂悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�??
//				gnet.link.Onlines.getInstance().send(roleid, sReqColorRoomView);
				
				sendColorRoomInfo(roleid);
				
				return true;
			}
		}.submit();
		
	}
	
	/**
	 * 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁躲倕霉閻樺樊鍎滅紓宥嗙墵閺岋繝宕堕妷銉т痪闂佸搫鎳忛幃鍌炲蓟閿曪拷铻ｅ〒姘煎灡绗戦梻浣芥硶閸犳洘鎱ㄩ妶澶婄畺闁稿瞼鍋為弲鏌ユ煟閹邦剚鈻曢柣鎾卞劦閺屾盯顢曢敐鍥╃暭闂佺粯鎸婚崹鐢稿煘閹达箑鐓￠柛鈩冾殘娴犫晛鈹戦悪鍛闁哄鐗冮弲婵囩▔瀹ュ棙鍙忔俊顖氱仢閻撴劙鏌嶉柨瀣伌闁哄矉缍�椤︽煡鏌熺拠褏纾块柨鐔诲Г閻旑剟骞忛敓锟�?
	 * @param roleid
	 */
	public static void sendColorRoomInfo(long roleid){
		xbean.Properties prop=xtable.Properties.select(roleid);
		if(prop==null){
			return ;
		}
		SReqColorRoomView sReqColorRoomView=new SReqColorRoomView();
		java.util.List<xbean.RoleColorType> list=prop.getColorroomlist();
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴閺佹劙宕ㄩ褏锟借京绱撻崒娆愮グ妞ゆ泦鍏炬稑鈹戠�ｎ亣鎽曞┑鐐村灦閻喖鈻介鍫熺厱闁圭偓銇炵欢銈夊箯閻戣棄绠抽柟鐐藉妿閹虫捇鈥﹂妸锔藉劅闁挎稑瀚鎾绘⒒娴ｇ瓔鍤冮柛鐘崇☉閳绘柨鈽夐姀鐘靛弨婵犮垼娉涢敃锕傚汲閿曞倹鐓曢柕澶堝灪閺嗗鏌熸潏楣冩闁抽攱鍨归敓鍊燁潐濞叉牕煤閿曞倸鍚归柨鐔烘櫕缁辨挻鎷呴崜鍙壭ч梺鐟版啞婵炲﹤鐣峰ú顏勵潊闁挎稑瀚峰ù鍕煟鎼搭垳绉靛ù婊呭仱瀹曟繈骞橀瑙ｆ嫼闂佸憡绋戦敃銈嗘叏閿熶粙姊洪崫鍕櫤缂佽鐗撻獮鍐┿偅閸愨晜鍎銈嗗姂閸婃鎯侀崼銉︹拻闁稿本姘ㄦ晶娑氱磼鐎ｎ偄鐏撮柡浣规崌閹稿﹥寰勫畝锟芥闂備線娼уΛ妤呭疮椤栨凹鍤楅柛鏇ㄥ灠缁犳盯鏌涢幇鐢靛帥婵℃彃婀辩槐鎺旂磼濡偐鐤勯悗瑙勬礃閿曘垽銆侀弮锟介幏鍛喆閸曨剚顔撻梻鍌氬�搁崐鐑芥倿閿曞倸鍑犲┑鍌滎焾閻ょ偓绻涢幋娆忕仼闁汇値鍣ｉ弻宥夊传閸曨偅娈插銈庡亝濞茬喖寮婚垾鎰佸悑閹肩补锟藉磭顔戦梻浣虹帛閹稿爼宕曢懠顒佸床婵炴垯鍨圭粻锝夋煟閹存繃顥犻柛鏃傚厴濮婅櫣绱掑Ο铏圭懆闂佺濮ょ划搴∥ｉ幇鏉跨婵°倕锕ラ弲顏堟⒑閸涘﹣绶遍柛妯煎亾缁傛帡顢涢悙绮规嫼闂佽崵鍠愬妯何ｇ紒妯镐簻闁瑰瓨绻嶅Σ鐟扒庨崶褝韬�规洖銈稿鎾倷閼艰鎷烽崹顔规斀闁宠棄妫楅悘锕傛煛閿熶粙鏌嗗鍡楋拷鍫曟煕閹板吀绨界痪鍙ョ矙閺屾稓浠﹂崜褎鍣紓浣圭☉缁绘﹢寮婚悢椋庢殝闁哄瀵т簺闂佸墽绮悧鐘诲蓟閵娾晛鍗虫い蹇撴噹椤忚埖绻濋悽闈涗户闁靛棗顑囬幑銏犫攽鐎ｎ亞鐣洪梺璺ㄥ枔婵挳鎮″☉妯忓綊鏁愰崨顓犻獓濡炪値鍋勭粔鐟邦潖濞差亝鍋￠柡澶婄氨閹稿啫顪冮妶鍡楃瑲闁绘挴锟藉磭鏆︽繝闈涱儐閸嬪嫰鏌涘┑鍕姢妞ゆ梹娲熷娲礈閹绘帊绨介梺鍝ュТ闁帮綁骞冨锟介弫鍌炲礈瑜忛敍婊堟煟鎼搭垳绉柛鈺傜墱閿熻姤鐔幏锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊块、姘舵晸娴犲宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘?
		if(list.size()==0){
			xbean.RoleColorType rolecolortyoe=xbean.Pod.newRoleColorType();
			rolecolortyoe.setColorpos1(prop.getRolecolor1());
			rolecolortyoe.setColorpos2(prop.getRolecolor2());
			prop.getColorroomlist().add(rolecolortyoe);
		}
		
		
		
		for(xbean.RoleColorType type:list){
			if(type!=null){
				fire.pb.RoleColorType rolecolortype=new fire.pb.RoleColorType();
				rolecolortype.colorpos1=type.getColorpos1();
				rolecolortype.colorpos2=type.getColorpos2();
				sReqColorRoomView.rolecolortypelist.add(rolecolortype);
			}
		}
		int max=0;
		Map<Integer, SCommon> commonMap = ConfigManager.getInstance().getConf(SCommon.class);
		if(commonMap!=null){
			SCommon sCommon=commonMap.get(228);
			if(sCommon!=null){
				max=Integer.parseInt(sCommon.getValue());
			}
		}
		sReqColorRoomView.nummax=max;//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫锟芥艾顦伴妵鍕箳閹存繍浠肩紓浣哄У瑜板啴婀侀梺鎸庣箓閹冲繒鎷归敓鐘崇厽婵犻潧锕ョ涵楣冩煃鐟欏嫬鐏撮柟顔规櫊楠炴捇骞掑鍥ㄦ櫦濠电姷鏁搁崑鐔碱敄閺囥垹绀夐柟瀛樼箥閸ゆ洟鏌涢锝嗙闂佸崬娲︾换娑㈠箣閻忔椿浜垾鏍拷锝庡枟閳锋垿鏌涘☉姗嗙劦闁硅揪闄勯崑鍌炴煥閻斿搫孝闁藉啰鍠栭弻銊╂偄閸濆嫅锝夋煛閸涱喗鍊愰柡灞诲姂閹倝宕掑☉姗嗕紦?濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿顦甸弻鏇＄疀鐎ｎ亷鎷烽弽顓炵柧闁归棿鐒﹂悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�??
		gnet.link.Onlines.getInstance().send(roleid, sReqColorRoomView);
	}
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786534;

	public int getType() {
		return 786534;
	}


	public CReqColorRoomView() {
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
		if (_o1_ instanceof CReqColorRoomView) {
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

	public int compareTo(CReqColorRoomView _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

