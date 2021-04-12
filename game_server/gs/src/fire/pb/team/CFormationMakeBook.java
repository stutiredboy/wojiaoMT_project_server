
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CFormationMakeBook__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎处缁绘繂顕ラ柨瀣凡闁跨喓鐛ら崶褏顔嗛梺缁樺灱婵倝鎮￠妷鈺傜厸闁搞儺鐓侀鍫熷�堕柤纰卞墾閹烽鎲撮崟顒傤槶闂佺绻戦敃銏ゅΥ娴ｅ壊娼ㄩ柨鐔剁矙楠炲啴鍩℃担鍙夌亖闂佸湱顭堝鈺呮晝閸屾稈鎷婚梺绋挎湰閻熝囁囬敃鍌涚厵缁炬澘宕禍鎵拷瑙勬处閸ㄥ爼銆侀弴銏℃櫆闁芥ê顦純鏇㈡⒒娴ｈ櫣銆婇柛鎾寸箞閹柉顦归柟顖氱焸瀹曞崬鈽夊▎鎴濆箞闂佽绻掗崑鐐哄磿閹惰棄鍚规い鎺戝閻撶喖鏌￠崒娑橆嚋妞ゃ儯鍨介弻鐔碱敊閻愵剙娈岄柣鎾卞�栭妵鍕疀閹炬惌妫ょ紓浣瑰姈椤ㄥ﹪寮婚敐鍡樺劅闁靛繈鍩勯弳鈩冪節閵忋垺鍤�婵☆偅绋戝嵄闁圭増婢樼粻铏繆閵堝嫮顦﹀ù婊冪秺閺岋絾鎯旈埄鍐婵犳鍠楅幐瀹犳＂濠电娀娼ч鍡涘煕閹达附鍊甸柛锔诲幖鏍″銈冨劚椤︿即濡甸崟顖涙櫆闁绘劦鍓氬В鍫ユ倵濞堝灝娅橀柛瀣躬閻涱喖螣閼测晝锛滃┑鈽嗗灣缁垶顢旈悢鍏尖拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟�?
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
					TeamManager.logger.debug("CFormationMakeBook:濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ω閳哄倵鎷虹紓浣割儐椤戞瑩宕曡箛娑欑厱濠电姴鍊归崑銉э拷娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花濠氭⒒娴ｅ憡鍟炵紒璇插�婚敓鑺ヨ壘閹虫﹢寮幇顓炵窞閻庯綆鍓欓獮妤呮⒒娴ｅ憡璐￠柛搴涘�濆畷褰掝敍閻愯尙锛涢梺闈涚箞閸婃牠鎮″☉姘炬嫹閻у憡瀚归梺璺ㄥ枍缁瑥鐣锋导鏉戝唨妞ゆ挾濮寸粊锕傛⒑绾懏褰х紒鐘冲灩缁鈽夊▎宥勭盎闂佸湱鍎ら崹鐢告晸閽樺鎲搁柡渚囧櫍瀹曠螖娴ｅ弶瀚藉┑鐐舵彧缂嶄線藟閹惧鈻旈柤纰卞墰绾剧晫锟藉箍鍎辩�氼噣宕濆鍥╃＜闁稿本姘ㄦ晥閻庤娲栭妶绋款嚕閹绢喗鍊烽柤绋跨仛閸熷搫鈹戦悩鍨毄闁稿鍋ゅ畷褰掑礈娴ｇ鐏婇柟鍏肩暘閸斿秹宕戦鍫熺叆闁绘柨澧庨惌娆愭叏婵犲啯銇濋柟顔惧厴楠炲秹顢欓弰蹇旑�楅梻鍌欑閹芥粓宕抽妷鈺佸瀭闂侇剙绉查敓钘夊暙閳诲氦绠涙繝鍐╂澑闂佸湱鍎ゆ繛濠傜暦閹邦儵鏃�鎷呴悷鏉夸紟闂備胶绮崹鐓幬涢崟顓烆棜缂備焦顭囩粻楣冩煙鐎电鍓遍柣鎺戞啞缁绘盯骞嬮悙鍐╁哺瀵憡鎯旈妸锔惧幍闁诲海鏁搁…鍫濇毄闂備胶绮幐濠氬箲閸パ屾綎闁惧繗顫夊畷澶愭煏婵炲灝鍔滈柣婵勫灲濮婃椽鎮烽弶鎸庮唨闂佺懓鍤栭幏锟�? "+roleid);
					return true;
				}
				
				if (config.getItemtypeid() == TeamManager.ITEMTYPE_FORMBOOK_ID)
				{
					psend(roleid, new STeamError(TeamError.UnKnuownFormBook));
					TeamManager.logger.debug("CFormationMakeBook:濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ω閳哄倵鎷虹紓浣割儐椤戞瑩宕曡箛娑欑厱濠电姴鍊归崑銉э拷娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花濠氭⒒娴ｅ憡鍟炵紒璇插�婚敓鑺ヨ壘閹虫﹢寮幇顓炵窞閻庯綆鍓欓獮妤呮⒒娴ｅ憡璐￠柛搴涘�濆畷褰掝敍閻愯尙锛涢梺闈涚箞閸婃牠鎮″☉姘炬嫹閻у憡瀚归梺璺ㄥ枍缁瑥鐣锋导鏉戝唨妞ゆ挾濮寸粊锕傛⒑绾懏褰х紒鐘冲灩缁鈽夊▎宥勭盎闂佸湱鍎ら崹鐢告晸閽樺鎲搁柡渚囧櫍瀹曠螖娴ｅ弶瀚藉┑鐐舵彧缂嶄線藟閹惧鈻旈柤纰卞墰绾剧晫锟藉箍鍎辩�氼噣宕濆鍥╃＜闁稿本姘ㄦ晥閻庤娲栭妶绋款嚕閹绢喗鍊烽柤绋跨仛閸熷搫鈹戦悩鍨毄闁稿鍋ゅ畷褰掑礈娴ｇ鐏婇柟鍏肩暘閸斿秹宕戦鍫熺叆闁绘柨澧庨惌娆愭叏婵犲啯銇濋柟顔惧厴楠炲秹顢欓弰蹇旑�楅梻鍌欑閹芥粓宕抽妷鈺佸瀭闂侇剙绉查敓钘夊暙閳诲氦绠涙繝鍐╂澑闂佸湱鍎ゆ繛濠傜暦閹邦儵鏃�鎷呴悷鏉夸紟闂備胶绮崹鐓幬涢崟顓烆棜缂備焦顭囩粻楣冩煙鐎电鍓遍柣鎺戞啞缁绘盯骞嬮悙鍐╁哺瀵憡鎯旈妸锔惧幍闁诲海鏁搁…鍫濇毄闂備胶绮幐濠氬箲閸パ屾綎闁惧繗顫夊畷澶愭煏婵炲灝鍔滈柣婵勫灲濮婃椽鎮烽弶鎸庮唨闂佺懓鍤栭幏锟�? "+roleid);
					return true;					
				}
					
				fire.pb.common.SCommon itemidconfig = ConfigManager.getInstance().getConf(fire.pb.common.SCommon.class).get(TeamManager.FORMBOOKHALF_COMMON_ID);
				
				String str = itemidconfig.getValue(); //闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冪Ч濠�渚�姊虹紒妯虹伇婵☆偄瀚板鍛婄瑹閿熶粙寮诲☉妯锋婵鐗婇弫鎯р攽閻愬弶鍣藉┑顔肩仛缁岃鲸绻濋崶顬囨煕濞戝崬鏋涙繛鍜冪節濮婅櫣鎹勯妸銉︾亞濠碘槅鍋勭�氭澘鐣烽鐐茬骇闁瑰濮靛▓楣冩⒑闂堟单鍫ュ疾濞戞氨妫憸鏃堝蓟閻旂尨鎷烽悽娈跨劸濞寸媴濡囬幃顕�鏁愭径瀣ф嫽婵炶揪绲块悺鏃堝吹濞嗘垹纾肩紓浣姑ù顔撅拷瑙勬礃閸ㄥ潡骞冮埡鍌滅懝妞ゆ牗绋掗惁鐐烘⒒閸屾艾锟介绮堟笟锟介獮鏍敃閿旂粯鏅為梺绯曞墲閵囧倸鈽夐姀鐘殿槰濡炪倖妫侀崑鎰版偩閸濆嫧鏀介幒鎶藉磹閺囥垹绠犻煫鍥ㄧ☉閻ら箖鏌＄仦璇插姎缂佺姴缍婇幃妤�鈽夊▎妯煎姺缂備胶濮甸敃銏ゅ蓟閿濆鐓涘ù锝堫潐瀹曞磭绱撴担浠嬪摵闁圭顭烽獮蹇涘川椤曞懏效闁瑰吋鎯岄崰妤勨叺缂傚倸鍊搁崐鎼佸磹閸濄儳鐭撻柟缁㈠枟閺呮繃銇勮箛鎾愁伌闁搞倖娲栭埞鎴︽偐瀹曞浂鏆￠梺鍝勬噺瑜板啴鈥︾捄銊﹀磯濠靛倹鏋荤换婵嬪春閿熺姴宸濇い鏃�鍎崇敮鎯р攽閻橆喖鐏辨繛澶嬬洴閹囧幢濞戞顦梺鍝勵槹閸ゆ俺銇愰幒鎾充簵闁硅偐琛ラ崜婵嗏枔閼碱剛纾藉ù锝堟鐢稓绱掔�ｎ偅宕岄柡浣规崌閹崇偤濡疯濡俱劌顪冮妶搴″箹婵炲樊鍙冮獮鍡楃暆閸曨偆顔婇梺鍝勫暙閸婂鏁嶅鍫熲拺缂備焦鈼ら鍡楊棜妞ゆ挾鍠愬▍鐘炽亜韫囨挾澧涢柣鎾跺枛閺屻劌鈹戦崱妯烘濠碘剝褰冮…鐑藉箺閸洖鍐�妞ゆ挾鍠撻崢閬嶆⒑鐟欏嫭绶查柛姘炬嫹缂備降鍔嬬划娆撳蓟閿濆绠婚悗娑欙供濡啫鈹戦纭烽練婵炲拑绲介埥澶愭偨缁嬫寧銇濇繛杈剧到閹测�斥枍瀹ュ鈷掑ù锝囧劋閸わ拷闂佹悶鍊栭悧鐘荤嵁韫囨稒鏅搁柨鐕傛嫹 by changhao
				int itemid = Integer.parseInt(str);
				
				Bag bag = new Bag(roleid, false);
				
				int number = bag.removeItemById(itemid, TeamManager.FORMBOOKHALF_COMBINE_NUM, fire.log.YYLogger.COUNTER_TYPE, 0, TeamManager.MAKE_FORMBOOK);
				if(number != TeamManager.FORMBOOKHALF_COMBINE_NUM){
					
					psend(roleid, new STeamError(TeamError.FormBookHalfNotEnough));
					TeamManager.logger.debug("CFormationMakeBook:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾椤懘鏌嶉妷銉ユ毐缂併劊鍎靛缁樻媴缁涘缍堝┑鐘灪閿曘垹鐣烽敐澶婄閻犲洩灏欓崐鐐差渻閵堝棗绗傞柤鍐茬埣瀹曟繈宕奸弴鐔凤拷鍨殽閻愯尙浠㈤柛鏃�纰嶇换娑氫沪閸屾熬鎷峰Δ鍐ㄥ灊濠电姴娲﹂弲婵嬫煕鐏炲墽鈻撻柟鐤缁辨挻绗熼崶褏浠┑鐐插级閻楁寮查崼鏇炵煑濠㈣泛鐗呯花璇差渻閵堝棙灏甸柛瀣仱瀹曟澘顫滈敓浠嬪蓟濞戙垹鐓橀柛顭戝枤娴煎牓鎮楀▓鍨灍闁规瓕娅曢幈銊╂晸娴犲鐓ユ繛鎴灻鈺冿拷娈垮枟婵炲﹤顫忕紒妯诲闁告稑锕ラ崕鎾绘⒑閸濄儱娅忛柛瀣工閻ｇ兘骞囬悧鍫濅画闂侀�涚祷濞呮洟鎮楀ú顏呪拺闁告繂瀚崒銊╂煕閵婏附銇濋柟顔癸拷鏂ユ闁靛骏绱曢崢閬嶆⒑閺傘儲娅呴柛鐘冲哺閹偞绂掔�ｎ偆鍘甸梺鍛婂姇瀵爼宕板锟介弻鈥崇暆鐎ｎ剛锛熸繛瀵稿缁犳挸鐣峰鍡╂Х濠碘剝褰冮悧鎾诲蓟瑜忕槐鎺懳熼悡搴樻嫲闂備礁鎼張顒勬儎椤栨凹鍤曢柟缁㈠枛鎯熼梺闈涱槶閸庮噣骞忛妶澶嬧拻濞达絽鎲￠崯鐐烘煠瑜版帞鐣虹�规洘鍔欓幊锟犲Χ閸♀晜缍楅梻浣筋潐閸庢娊鎮洪妸锕�鍨旈柟缁㈠枟閸嬶綁鏌涢妷顖滃埌濠⒀勭叀閺岋綁鏁愰崼鐔恒�愬銈庝簻閸熷瓨淇婇幆鎵杸闁哄洨濮靛▓鐓庘攽閻愯尙鎽犵紒顔肩焸閹儲绺介崨濠備粧濡炪倖娲╅幏椋庯拷娈垮枙缁瑩銆佸锟介幃銏ゅ川婵犲簼鎴烽梻鍌氬�峰ù鍥р枖閺囥垹闂柨鏇炲�哥粻顖炴煥閻曞倹瀚�? "+roleid);		
					return false;
				}				
				
				int added = BagUtil.addBindItem(roleid, bookid, 1, TeamManager.MAKE_FORMBOOK, fire.log.YYLogger.COUNTER_TYPE, 1, true);
				
				if (1 != added)
				{
					psend(roleid, new STeamError(TeamError.UnkownError));
					TeamManager.logger.debug("CFormationMakeBook:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾椤懘鏌嶉妷銉ユ毐缂併劊鍎靛缁樻媴缁涘缍堝┑鐘灪閿曘垹鐣烽敐澶婄閻犲洩灏欓崐鐐差渻閵堝棗绗傞柤鍐茬埣瀹曟繈宕奸弴鐔凤拷鍨殽閻愯尙浠㈤柛鏃�纰嶇换娑氫沪閸屾熬鎷峰Δ鍐ㄥ灊濠电姴娲﹂弲婵嬫煕鐏炲墽鈻撻柟鐤缁辨挻绗熼崶褏浠┑鐐插级閻楁寮查崼鏇炵煑濠㈣泛鐗呯花璇差渻閵堝棙灏甸柛瀣仱瀹曟澘顫滈敓浠嬪蓟濞戙垹鐓橀柛顭戝枤娴煎牓鎮楀▓鍨灍闁规瓕娅曢幈銊╂晸娴犲鐓ユ繛鎴灻鈺冿拷娈垮枟婵炲﹤顫忕紒妯诲闁告稑锕ラ崕鎾斥攽閻愬瓨缍戦柛濠傛贡缁顓奸崨顏呮杸闂佸壊鍋掗崜姘憋拷姘愁潐閹便劌顫滈崱妤�顫紓浣割槺閸庛倝骞堥妸锔剧瘈闁告劏鏂傛禒銏犖旈悩闈涗沪闁绘濞�楠炲啫鈻庨幘宕囶唽闂佸湱鍎ょ换鍕晸閼恒儱鈻曢柡宀嬬稻閹棃濡舵惔銏㈢Х婵犵數鍋犻婊呯不閹惧磭鏆︽繝濠傜墛閸嬪嫮绱掑Δ鍐ㄧ殤闁圭兘鏀遍幏鍛村礈閸欏鍏婃俊鐐�栭崹鍏兼叏閵堝鍊靛┑鐘崇閳锋垿鎮峰▎蹇擃仼闁告柣鍊濋弻娑樜熼懡銈呪拡濠碘�冲级閸旀瑥鐣锋總绋垮嵆闁绘柨寮剁�氬ジ姊绘担鍛婂暈缂佸鍨块弫鍐Ψ瑜嶉ˉ姘舵煟閵忕姵鍟為柣鎾寸洴閺屾稑鈽夐崡鐐寸亾闂佺懓鍟垮ú銊╂晸閼恒儺鍟忛柛鐘崇墵閹儲绺介幖鐑囨嫹娴ｅ壊娼ㄩ柨鐔诲Г閹便劑鏁撴禒瀣叆婵炴垶锚椤忊晜顨ラ悙鎼疁婵﹦绮幏鍛存惞閻熸壆顐奸梻浣藉吹閸犲棝宕曢悽鍝ュ祦濠电姴鎳愰悿锟介梺鍝勬祩娴滄繄锟芥俺顫夐幈銊ノ熼悡搴濆闁诲孩鐔幏锟�? "+roleid);	
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

