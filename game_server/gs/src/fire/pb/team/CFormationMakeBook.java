
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CFormationMakeBook__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囨繝寰锋澘锟窖囧箯閻戣姤鐓ラ柡鍥悘鑼拷瑙勬礈閸忔﹢銆佸锟介幃鈺佲枔閹稿巩锕傛⒒閸屾瑧顦﹂柟纰卞亰瀹曨垶顢曢敂钘変罕闂佺硶鍓濋悷褔鎯岄崱娑欑厱閻忕偞鍎抽崵顒勬煟閺傛寧顥㈤柟顔炬嚀鐓ゆい蹇撴缁愭鏌ｆ惔銏㈩暡濠㈢懓妫涘Σ鎰板箳濡や礁浜归柣搴℃贡婵挳藟濠靛鈷戦悗鍦У椤ュ銇勯敂鐐毈鐎殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�?
 * @author changhao
 *
 */
public class CFormationMakeBook extends __CFormationMakeBook__ {
	@Override
	protected void process() {
		// protocol handle
		
		//final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		
		mkdb.Procedure formationmakebook = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				/*
				fire.pb.item.GroceryItemAttr config = ConfigManager.getInstance().getConf(fire.pb.item.GroceryItemAttr.class).get(bookid);
				if (config == null)
				{
					psend(roleid, new STeamError(TeamError.UnKnuownFormBook));
					TeamManager.logger.debug("CFormationMakeBook:濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮诲☉銏╂晝闁挎繂妫涢ˇ銊╂⒑缁嬫鍎忛柛濠傛健瀵濡搁埡鍌氫簻闂佸憡绻傜�氬懘鏁愭径瀣幗闂佸湱鍎ら崹顖炲磻閵忋倖鐓涚�癸拷閿熶粙宕伴弽顓犲祦闁硅揪绠戠粻娑欍亜閹烘垵锟藉摜鏁崸妤佲拻濞达綁顥撴稉鑼磽瀹ュ嫮鍔嶇紒鍌氱Ч瀹曞ジ寮撮悙鑸垫啺婵犵數鍋為崹鍓佸垝鎼淬劍鍋柨鐔剁矙濮婃椽鎮烽幍顔昏檸闂佸摜鍣ラ崹閬嶃�冨▎蹇婃斀閹烘娊宕愬Δ浣瑰弿闁绘垼妫勭壕缁樼箾閹寸儐鐒告繛鎴炃氶弸搴ㄦ煙鐎电啸闁绘挻鎹囧铏规崉閵娿儲鐝㈤梺鐟板殩閹凤拷? "+roleid);
					return true;
				}
				
				if (config.getItemtypeid() == TeamManager.ITEMTYPE_FORMBOOK_ID)
				{
					psend(roleid, new STeamError(TeamError.UnKnuownFormBook));
					TeamManager.logger.debug("CFormationMakeBook:濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮诲☉銏╂晝闁挎繂妫涢ˇ銊╂⒑缁嬫鍎忛柛濠傛健瀵濡搁埡鍌氫簻闂佸憡绻傜�氬懘鏁愭径瀣幗闂佸湱鍎ら崹顖炲磻閵忋倖鐓涚�癸拷閿熶粙宕伴弽顓犲祦闁硅揪绠戠粻娑欍亜閹烘垵锟藉摜鏁崸妤佲拻濞达綁顥撴稉鑼磽瀹ュ嫮鍔嶇紒鍌氱Ч瀹曞ジ寮撮悙鑸垫啺婵犵數鍋為崹鍓佸垝鎼淬劍鍋柨鐔剁矙濮婃椽鎮烽幍顔昏檸闂佸摜鍣ラ崹閬嶃�冨▎蹇婃斀閹烘娊宕愬Δ浣瑰弿闁绘垼妫勭壕缁樼箾閹寸儐鐒告繛鎴炃氶弸搴ㄦ煙鐎电啸闁绘挻鎹囧铏规崉閵娿儲鐝㈤梺鐟板殩閹凤拷? "+roleid);
					return true;					
				}
					
				fire.pb.common.SCommon itemidconfig = ConfigManager.getInstance().getConf(fire.pb.common.SCommon.class).get(TeamManager.FORMBOOKHALF_COMMON_ID);
				
				String str = itemidconfig.getValue(); //闂傚倸鍊峰ù鍥敋瑜嶉湁闁绘垼妫勯弸渚�鏌涘☉姗堟敾婵炲懐濮垫穱濠囧Χ閸涱喖娅￠梺璺ㄥ枙濡嫰宕弶鎴犳殾闁靛ň鏅涚痪褔鏌熺�电浠︾悮锝夋⒒娴ｇ瓔鍤欑紒缁樺浮瀹曟垿鎮╂笟顖涙瘞闂傚倷绀侀幖顐︻敄閸℃あ娑㈠礃椤旇偐鐣哄┑掳鍊曢幊蹇涘疾閺屻儱绠归悗娑欘焽缁犳﹢鏌ｉ埡浣规崳缂佽鲸鎸婚幏鍛槹鎼搭喗袦缂傚倸鍊哥粔鎾晝椤忓嫷鍤曞┑鐘崇閺呮彃顭跨捄濂斤繝鍩￠崨顔惧帾婵犮垼娉涢悧鍡涘礉閺夋嚚褰掓偂鎼粹剝娈茬紓浣虹帛缁嬫捇鏁撻懞銉р檨妞ゎ厼娲幆宀勫箳閺冨倻锛滈梺缁樏壕顓熸櫠椤忓牊鐓熼柨婵嗘噹濡插鎽堕弽顓熺厱闁规澘鍚�缁ㄤ粙鏌ｉ幘瀛橆棃婵﹨娅ｅ☉鐢稿椽娴ｅ憡娅嶉梻浣烘嚀閸ゆ牠骞忛敓锟� by changhao
				int itemid = Integer.parseInt(str);
				
				Bag bag = new Bag(roleid, false);
				
				int number = bag.removeItemById(itemid, TeamManager.FORMBOOKHALF_COMBINE_NUM, fire.log.YYLogger.COUNTER_TYPE, 0, TeamManager.MAKE_FORMBOOK);
				if(number != TeamManager.FORMBOOKHALF_COMBINE_NUM){
					
					psend(roleid, new STeamError(TeamError.FormBookHalfNotEnough));
					TeamManager.logger.debug("CFormationMakeBook:闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣筋潐濠㈡﹢宕ｉ幘璇茬倞妞ゆ帊鑳堕崝鍫曟倵楠炲灝鍔氭繛灞傚�楃划濠囨晝閸屾稈鎷虹紓渚囧灡濞叉牗鏅堕崣澶堜簻妞ゆ挾鍋為崰姗�鏌涢埞鍨伈鐎殿喗鎸虫慨锟介柨娑樺瀵娊姊绘担鍛婃儓闁哥噥鍋婂畷鎰版偡閹佃櫕鐎洪梺鍝勬储閸ㄦ椽鎮″☉銏＄厱闁斥晛鍠氶悞浠嬫煙閸愬弶鍠橀柡宀嬬磿娴狅箓宕滆濡插牓鏌х紒妯煎⒌闁哄本鐩鎾Ω閵夈儮鎷ら梻浣告啞閼归箖宕愰懡銈嗩潟闁规儳鐡ㄦ刊鎾偣閸ワ絽澧查柣锝堟硾椤啴濡惰箛鏇犳殼婵炲瓨绮岄悥濂告偘椤曪拷瀵粙顢橀悢鍛婎仧闂備浇娉曢崳锕傚箯閿燂拷? "+roleid);		
					return false;
				}				
				
				int added = BagUtil.addBindItem(roleid, bookid, 1, TeamManager.MAKE_FORMBOOK, fire.log.YYLogger.COUNTER_TYPE, 1, true);
				
				if (1 != added)
				{
					psend(roleid, new STeamError(TeamError.UnkownError));
					TeamManager.logger.debug("CFormationMakeBook:闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣筋潐濠㈡﹢宕ｉ幘璇茬倞妞ゆ帊鑳堕崝鍫曟倵楠炲灝鍔氭繛灞傚�楃划濠囨晝閸屾稈鎷虹紓渚囧灡濞叉牗鏅堕崣澶堜簻妞ゆ挾鍋為崰姗�鏌涢埞鍨伈鐎殿喗鎸虫慨锟介柨娑樺瀵娊姊绘担鍛婃儓婵炴潙鍊圭粋宥呪攽閸剚瀚规慨姗嗗墰缁夌儤鎱ㄦ繝鍐┿仢妤犵偞鐗犻幃娆撳箵閹烘繄锟芥娊鏌ｆ惔銈庢綈婵炶绠撳畷婊堟偄缁楃尨鎷锋担鍓叉僵妞ゆ垼濮ら悗濠氭⒑鐟欏嫬鍔ら柛妯荤墱濡叉劙宕奸弴鐔叉嫼闂佸憡绋戦敃銉у閻㈠憡鐓涢柛娑卞枤閹冲洨锟芥鍠栭悥濂搞�佸锟芥慨锟介柨娑樺楠炴姊绘担铏瑰笡闁荤喆鍎甸獮濠呯疀閺囶亝瀚规慨妯煎亾鐎氾拷? "+roleid);	
					return false;						
				}				
				*/
				return true;
			}
		};
		
		formationmakebook.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794552;

	public int getType() {
		return 794552;
	}


	public CFormationMakeBook() {
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
		if (_o1_ instanceof CFormationMakeBook) {
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

	public int compareTo(CFormationMakeBook _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

