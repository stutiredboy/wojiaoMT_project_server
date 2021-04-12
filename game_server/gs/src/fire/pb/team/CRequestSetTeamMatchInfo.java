
package fire.pb.team;
import fire.pb.main.ConfigManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestSetTeamMatchInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠抽柨鐔凤拷鐕佹綈婵炲弶鐗曠叅闁靛ň鏅滈崕妤呮煕閳╁喚妯呯憸鐗堝笚閺呮煡鏌涢顐簼缂傚秴鐗嗛埞鎴︽倷閸欏娅ф繝娈垮枟閹稿啿锕㈡笟锟藉铏圭磼濡浚浜滆灒濠电姴娲ょ壕鍧楁煙閹殿喖顣奸柣鎾存礋閹鏁愰崨顓熷�庨梻渚囧弾閸ㄥ爼寮婚敍鍕勃闁告挆鍕灡闂備胶纭堕弲娑氾拷姘緲閻ｅ嘲顫滈敓浠嬨�侀弮锟介幏鍛嫚閳╁啰绉剧紓鍌氬�搁崐鎼佸磹妞嬪孩顐介柕鍫濐槸缁狀垰顪冪�ｎ亜鍤遍柟椋庡厴閹倿宕ㄦ繝鍌や紦闂傚倷娴囧▔鏇㈠窗瀹ュ洤鍨濇繛鍡樻尵瀹撲礁顭块懜闈涘缂佺姷鎳撻湁闁挎繂娲﹂崵锟芥繛瀛樼矒娴滆泛顫忓ú顏勭闁圭粯甯婄花鑲╃磽娴ｇ瓔鍤欓悗姘嵆楠炲啴鎮滈挊澹┾晠鏌嶉崫鍕拷濠氬储娴犲鈷戦梻鍫熺〒缁犳岸鏌￠崨顔炬创闁诡喗锕㈤幃鈺冪磼濡厧骞堥梻浣虹帛濡線顢氳瀹曟繈鎮介崹顐㈡瀾婵☆偊顣﹂懗鍓佺玻閺冿拷閹便劍绻濋崘鈹夸虎濡ょ姷鍋為悧鐘诲箖濞嗘挸绠甸柟鐑樺毄閵壯呯＝闁稿本鐟︾粊浼存倶韫囷絼绨奸柟渚垮姂婵¤埖寰勬繝鍕叄闂備礁澹婇崑鍛洪弽顐や笉闁汇垹鎲￠悡娆撴偡濞嗗繐顏存繛鍫熸⒐缁绘繈鏁撴禒瀣闁绘劏鏅滈～宥夋⒑濮瑰洤鐏╅柟璇х節閹繝濡烽埡鍌氾拷鐢告煥濠靛棛鍑归柟鍙夊劤闇夌痪顓㈡敱鐎氾拷
 * @author changhao
 *
 */
public class CRequestSetTeamMatchInfo extends __CRequestSetTeamMatchInfo__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestsetteammatchinfo = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{	
				if (!checkLevel()) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋婵愭綗闁跨喕妫勯崐鍧楀箰婵犲啰鐝堕柍鍝勵儑缁夘喚锟借娲滈崰鏍�佸☉姗嗘僵濡插本鐗曢弫鎼佹⒒閸屾瑦绁版繛澶嬫礋瀹曟娊鏁冮崒姘鳖唵闂佽法鍣﹂幏锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囨煕閳╁啨浠︾紒顔瑰墲娣囧﹪鎮欓鍕舵嫹閺嶎厼绀夌憸蹇曞垝婵犳艾绠ｉ柣妯烘▕濡粓姊虹粔鍡楀濞堟洟鏌ｉ幘瀵告噰闁哄瞼鍠栭、娑樷槈濞嗘垵鍤掗柣鐐寸瀹�绋款潖閾忓湱鐭欐繛鍡樺劤閸擃參姊虹粙鍖℃敾缂佽鐗嗛锝嗙節濮橆厼浜滈梺缁樿壘閻°劎锟芥艾缍婇弻锝夊閳藉棗鏅遍梺缁樺浮缁犳牕鐣烽婊呯煓閹煎瓨鎸婚弬锟介梻浣哥枃濡嫬螞濡や胶顩插Δ锝呭暞閻撴瑩鏌涢幋娆忥拷鏍拷姘炬嫹? by changhao
				{
					psend(roleid, new STeamError(TeamError.LevelError));
					TeamManager.logger.debug("CRequestSetTeamMatchInfo闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处缂傚啯娲熷缁樻媴閸涘﹥鍎撳┑鐐茬湴閸斿秹骞堥妸锔绘Ч閹艰揪绲块悞鍏肩節閻㈤潧孝闁稿﹦鏁诲銊︾鐎ｎ偆鍘藉┑鈽嗗灠閹碱偆鐥閺岀喖宕楅悡搴☆潚闂佸搫鏈粙鎾寸閿旂偓瀚氶柟缁樺俯濞煎酣姊绘担鍛婃儓闁哄牜鍓欑叅闁绘棃顥撻弳锕傛煟閹惧磭宀搁柡锟芥禒瀣厱闁靛鍨甸幊鎰暦閻戞绡�缁炬澘顦辩壕鍧楁煕鐎ｎ剙鏋涙鐐诧躬楠炴鎷犻懠顒佺劸闂備胶顫嬮崟鈺�绮堕梺璺ㄥ枑閺嬬粯淇婇崶顒�绠查柛鏇ㄥ灠鎯熼梺鎸庢穿閹烽鐥紒銏犵仸婵﹥妞介獮鍡氼槾缂佺姷澧楃换婵嬫晸娴犲鐒肩�广儱鎳愰ˇ顔碱渻閵堝棛澧遍柛瀣仱閸╂盯骞嬮悩鐢碉紳婵炶揪缍�椤曟牠鎮炴禒瀣厓闁告瑣鍎崇粣鏃堟煛瀹�锟介崰鏍箖閻戣姤鍋嬮柛顐ｇ箖閻忓孩淇婇妶鍥ラ柛瀣洴瀹曨垱瀵奸弶鎴犵枀闂佸湱铏庨崰鏍矆鐎ｎ偁浜滈柟铏瑰仦鐎氱懓顪冮妶鍛劉闁圭澧藉Σ鎰板箻鐎涙ê顎撻梺鍛婃尰瑜板啴宕滈幍顔剧＝濞达綁娼ф慨鍌毭瑰鍐煟闁绘侗鍣ｉ獮鍥级鐠侯煈妲版俊鐐�栧Λ浣筋暰闂佺懓鍢查幖顐﹀煘閹达富鏁婇柣鎰靛墮濞堝苯鈹戦悙鑼勾闁稿﹥绻堝顐﹀箻缂佹ê娈熼梺闈涱檧婵″洭藝閵夆晜鐓ｉ柤濮愬�曟禒锔剧磼缂佹绠炴俊顐㈠暙閳藉宕￠悙鎻掝棈闂傚倷娴囧Λ鍕疮娴兼潙绐楅柡宥庡幖閽冪喖鏌￠崶鈺佹灁缂佺娀绠栭弻娑⑩�﹂幋婵囩亪婵犳鍠栭ˇ闈涱潖濞差亜浼犻柛鏇㈡涧閸撲即姊绘担绋跨盎缂傚秳绀侀锝嗙節濮橆厼浜滈梺绋跨箳閸樠囨晸閻ｅ瞼甯涘ǎ鍥э躬椤㈡稑鈹戦崱鏇熺潖闂備椒绱紞浣割焽瑜旈崺鐐哄箣閿旇棄锟界兘鏌ょ喊鍗炲闁冲嘲锕娲偡閺夋寧顔�闂佺懓鍤栭幏锟� "+roleid);
					return true;					
				}				
				
				if (targetid != 0)
				{
					if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�妞ゆ劦婢�缁墎绱撴笟濠冨婵犮垼娉涢鍕崲閸℃稒鐓忛柛顐ｇ箖閸ｆ椽鏌涢敐鍛础缂佽鲸甯￠幃鈺呮濞戞帗鐎伴梻浣告惈閻ジ宕伴弽顓犲祦闁糕剝鍑瑰Σ楣冩⒑閹稿海鈽夌紒澶婄秺瀵鏁撻悩鎻掕�垮銈嗘尵婵兘寮抽妶鍛斀妞ゆ梻銆嬮弨缁樹繆閻愭壆鐭欓柕鍡曠铻栭柛娑卞枟濞呫垽姊烘导娆戝埌闁活剙銈搁幆宀勫箻缂佹ê锟界敻鏌ｉ姀鐘冲暈濞存嚎鍊濋弻鐔风暋閺夋寧些濡炪値鍋呯换鍫ャ�佸Δ浣哥窞閻庯絾鎸堕崝鎴濐潖閾忚宕夐柕濞垮劜閻忓棗鈹戦埥鍡椾簻閻庢凹鍠氶崚鎺旀嫚瀹割喖鎮戞繝銏ｆ硾閿曪箓鏁嶉悢鍏尖拻濞撴艾娲ゆ晶顔剧磼婢跺鍤熺紒顔碱煼閹晝鎷犻懠顒夊晣闂備礁婀遍埛鍫ュ储妤ｅ啫鍌ㄦ繝濠傛噽绾剧晫锟藉箍鍎卞Λ娑欐櫠閻㈠憡鐓涢悘鐐靛亾缁�瀣拷瑙勬礈閸樠囧煘閹达箑绠涙い鎾筹紡閸ャ劉鎷虹紓鍌欑劍钃遍悘蹇曞缁绘盯鎳犻锟介弸娑氾拷娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�? by changhao
					{
						DSTeamMatchInfo config = ConfigManager.getInstance().getConf(DSTeamMatchInfo.class).get(targetid);
						if (config == null)
						{
							psend(roleid, new STeamError(TeamError.NoTarget));
							TeamManager.logger.debug("CRequestSetTeamMatchInfo:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂佺偓鍎冲锟犲蓟閿濆顫呴柕蹇婃櫇閸旀悂姊哄Ч鍥э拷婵堢不閺嶎厼钃熺�广儱顦导鐘绘煕閺囥劌澧繛鍜冪悼缁辨挻鎷呴悷鏉款潔濡炪們鍔屽Λ娆戠矚鏉堛劎绡�闁搞儺鐏涜閺屾稑鈽夐崡鐐寸亪濠电偛鎳岄崐婵嗩潖閾忓湱鐭欐繛鍡樺劤閸撴澘顪冮妶蹇曠窗闁告娅曟穱濠囨偨缁嬭法顦板銈嗙墬椤曡精顦归柡灞剧☉閳藉宕￠悙鍏稿寲闂備胶绮幐璇参涢崘顭戞綎濠电姵鑹剧壕鍏兼叏濮楀棗澧鹃柟椋庡厴楠炴牗鎷呴崫銉串闂備胶绮崹鍏兼叏閵堝纾归柛褎顨嗛悡銉╂煛閸愭寧瀚归梺褰掓敱缁诲牓鐛箛鏃戞Ч閹艰揪绲块悾璺衡攽閻愭潙鐏﹂拑鍗烆熆鐠哄搫顏柡灞剧〒閿熸枻绲芥晶搴ｅ姬閿熶粙姊洪崫鍕拱婵炲弶顭囬幑銏犫槈閵忊�筹拷閿嬨亜閹哄秷鍏岀憸鎵枛濮婄粯鎷呴懞銉ｏ拷鍐磼閿熻姤绗熼敓浠嬨�侀弽銊ョ窞闁归偊鍓濋幗鏇㈡⒑闂堟单鍫ュ疾濠婂牆纾婚柛鈩冪♁閻撴洟鎮橀悙鎻掆挃闁宠棄顦伴妵鍕疀閵夛箑顏� "+roleid);
							return true;					
						}							
					}
					else
					{
						STeamMatchInfo config = ConfigManager.getInstance().getConf(STeamMatchInfo.class).get(targetid);
						if (config == null)
						{
							psend(roleid, new STeamError(TeamError.NoTarget));
							TeamManager.logger.debug("CRequestSetTeamMatchInfo:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂佺偓鍎冲锟犲蓟閿濆顫呴柕蹇婃櫇閸旀悂姊哄Ч鍥э拷婵堢不閺嶎厼钃熺�广儱顦导鐘绘煕閺囥劌澧繛鍜冪悼缁辨挻鎷呴悷鏉款潔濡炪們鍔屽Λ娆戠矚鏉堛劎绡�闁搞儺鐏涜閺屾稑鈽夐崡鐐寸亪濠电偛鎳岄崐婵嗩潖閾忓湱鐭欐繛鍡樺劤閸撴澘顪冮妶蹇曠窗闁告娅曟穱濠囨偨缁嬭法顦板銈嗙墬椤曡精顦归柡灞剧☉閳藉宕￠悙鍏稿寲闂備胶绮幐璇参涢崘顭戞綎濠电姵鑹剧壕鍏兼叏濮楀棗澧鹃柟椋庡厴楠炴牗鎷呴崫銉串闂備胶绮崹鍏兼叏閵堝纾归柛褎顨嗛悡銉╂煛閸愭寧瀚归梺褰掓敱缁诲牓鐛箛鏃戞Ч閹艰揪绲块悾璺衡攽閻愭潙鐏﹂拑鍗烆熆鐠哄搫顏柡灞剧〒閿熸枻绲芥晶搴ｅ姬閿熶粙姊洪崫鍕拱婵炲弶顭囬幑銏犫槈閵忊�筹拷閿嬨亜閹哄秷鍏岀憸鎵枛濮婄粯鎷呴懞銉ｏ拷鍐磼閿熻姤绗熼敓浠嬨�侀弽銊ョ窞闁归偊鍓濋幗鏇㈡⒑闂堟单鍫ュ疾濠婂牆纾婚柛鈩冪♁閻撴洟鎮橀悙鎻掆挃闁宠棄顦伴妵鍕疀閵夛箑顏� "+roleid);
							return true;					
						}							
					}				
				}
				
				Long teamid = xtable.Roleid2teamid.select(roleid);
				
				Team team = null;
				if(teamid != null)
				{
					team = TeamManager.getTeamByTeamID(teamid);	//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠為柟钘夊�婚敓鏂ょ秵閸犳牠鎮欐繝鍐︿簻闁瑰搫绉剁拹鐗堜繆椤愩垹鏆欓柍瑙勫灴閹瑥顔忛鍏碱啀婵＄偑鍊栫敮鐔轰焊濞嗘垶顫曢柣鎰嚟閻熷綊鏌ㄩ悢缁橆棄妞ゆ洩缍侀、鏇㈡晝閿熺晫绮堥崘鈹夸簻闁哄啫娲ゆ禍褰掓煥濞戞瑧鐭婇柍瑙勫灴椤㈡瑩寮妶鍫嫹鐠恒劎妫い鎾跺閻掗箖宕℃潏銊ｄ簻闁哄稁鍋勬禒锕傛煃闁垮绗掗棁澶愭煥濠靛棙绁╅柣鎺斿亾閵囧嫰濡烽妷褏顔掗梺鍝勬湰缁嬫捇鏁撻弬銈囩У濞存粍绻堣棢闁靛浚婢侀幏椋庢喆閸曨剛顦繝鈷�鍕垫疁妤犵偛妫濆顕�宕煎┑鎰秱闂備胶绮摫鐟滄澘鍟撮敐鐐寸節閸ャ劉鎷婚梺绋挎湰閼归箖鏁撻懞銉﹀�愮�规洘鍔欓獮鏍ㄦ媴閸濄儻绱梻浣哥秺濡法绮堟担鍝勵棜鐟滅増甯楅悡娆撴⒒閸屾凹鍤熸い锔肩畵閺岋綁濡舵惔鈩冪亪闂傚洤顦甸弻娑滅疀閹捐櫕鍊紓鍌氱У閸ㄥ湱妲愰幒妤�绠涙い鎾楀嫮鏆梻浣芥硶閸犳洖螞閸曨厾涓嶇�广儱顦壕鍧楁煕濡ゅ啩绱虫繛宸簼閺呮繈鏌涘畝瀣洭缂佸绻樺娲传閸曨剙鍋嶉梺鎼炲妽濡炰粙骞冮敓鐘冲亜闁稿繗鍋愰崢鐢告⒒娓氬洤寮跨紒鐘冲灴瀵鈽夐姀锛勫幈闂佸搫鍊归娆撳磿閺冨牊鐓涚�癸拷鐎ｎ剛袦濡ょ姷鍋為敃銏犵暦閿熺姵鍊烽柟缁樺俯濞兼盯姊婚崒姘拷绋棵洪妶澹﹀洭鎮界粙鑳憰闂侀潧顭堥崕顕�寮ㄦ禒瀣厱闁虫拝鎷烽柡鍛矒閸┿垽骞橀弬銉︽杸闂佸疇妫勫Λ妤佺濠靛鐓曢柕濞垮劜鐠愨剝淇婇崣澶婂妤犵偞甯￠獮妯虹暦閸モ晝宓佸┑鐘垫暩閸嬬偤宕归崼鏇熷仭闁靛鏅╅弫鍌炴煥閻曞倹瀚� by changhao
					team.getTeamInfo().setTargetid(targetid);
					team.getTeamInfo().setMinlevel(levelmin);
					team.getTeamInfo().setMaxlevel(levelmax);
				}
				
				Long roleidteamId = xtable.Roleid2teamid.get(roleid);
				if (teamid != roleidteamId)
				{
					psend(roleid, new STeamError(TeamError.UnkownError));
					TeamManager.logger.debug("CRequestSetTeamMatchInfo:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顕�姊哄Ч鍥э拷銈夊窗閺嶎厽绠掗梻浣侯焾缁绘劙宕ョ�ｎ剛绀婇柟瀵稿Х绾惧ジ鏌熼柇锕�寮炬繛鍫燂耿閺屻劑鎮㈢紒姗嗘缂備胶濮寸粔鐟扮暦閺囥垹纭�闁诲繒绮浠嬪极閸愵喖纾奸柨鏂垮⒔閳笺倝姊绘担鍛婃儓婵炲眰鍔戝畷浼村箻鐠哄搫袣闂佽法鍠嶇划娆忣潖閸濆嫅褔宕惰娴犲ジ姊虹拠鑼鐎癸拷閹间礁绠栨繛鍡樻尭缁犺櫕淇婇妶鍕唹闁瑰嘲顭峰铏圭矙閹稿孩鎷遍梺鑽ゅ暀閸ヤ礁娲弫鍐磼濞戞艾骞嶇紓浣哄亾濠㈡ê鐣烽浣侯洸濞寸厧鐡ㄩ悡娆愩亜閺傝濡兼繛灞傚�濋悰顕�濮�閿涘嫮顔曢柣搴㈢♁钃辩紒璺哄级缁绘稑顔忛鐓庣睄闂侀潧妫旂粈渚�鍩ユ径濞㈢喖鏌ㄧ�ｎ偅婢戦梻鍌欑閹测�趁洪敂鐣岊洸婵犻潧顑嗛崕鎾荤叓閸ャ劍灏ㄩ柡锟芥禒瀣厽婵妫楅弸娑㈡煟韫囨稐鎲鹃柡灞剧洴閸╋繝宕掑鍐ｆ嫲闁诲氦顫夊ú妯兼崲閸繍鍤曢柟缁㈠枟閸嬫劙鏌ｉ姀銏℃毄闁告柨鐖煎缁樻媴閼恒儳銆婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�? "+roleid);
					return true;
				}
								
				SRequestTeamMatch msg = new SRequestTeamMatch();
				msg.levelmin = levelmin;
				msg.levelmax = levelmax;
				msg.targetid = targetid;
				msg.typematch = 3;
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);
				
				return true;
			}
			
		};
		requestsetteammatchinfo.submit();	
	}
	
	private boolean checkLevel() //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋婵愭綗闁跨喕妫勯崐鍧楀箰婵犲啰鐝堕柍鍝勵儑缁夘喚锟借娲滈崰鏍�佸☉姗嗘僵濡插本鐗曢弫鎼佹⒒閸屾瑦绁版繛澶嬫礋瀹曟娊鏁冮崒姘鳖唵闂佽法鍣﹂幏锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囨煕閳╁啨浠︾紒顔瑰墲娣囧﹪鎮欓鍕舵嫹閺嶎厼绀夌憸蹇曞垝婵犳艾绠ｉ柣妯烘▕濡粓姊虹粔鍡楀濞堟洟鏌ｉ幘瀵告噰闁哄瞼鍠栭、娑樷槈濞嗘垵鍤掗柣鐐寸瀹�绋款潖閾忓湱鐭欐繛鍡樺劤閸擃參姊虹粙鍖℃敾缂佽鐗嗛锝嗙節濮橆厼浜滈梺缁樿壘閻°劎锟芥艾缍婇弻锝夊閳藉棗鏅遍梺缁樺浮缁犳牕鐣烽婊呯煓閹煎瓨鎸婚弬锟介梻浣哥枃濡嫬螞濡や胶顩插ù鐘差儐閻撴洟鏌曟繝蹇曠暠闁崇粯娲橀〃銉╂倷瀹割喗笑濡炪値鍋侀崹褰掓偩濠靛鏅稿ù鐘差儐閸嬵亪鏌ㄩ悢鍓佺煓婵﹥妞介幃鐑藉级鐠恒劎鈼ゆ繝鐢靛仦濞兼瑥煤椤撱垺鏅查柣鎰綑缁剁偛鈹戦悩鏌ヮ�楁繛鍫亰濮婃椽宕ㄦ繝鍐槱闂佹悶鍔嶆竟鍡欏垝鐠囨祴妲堟繛鍡楃С缁ㄥ姊洪崷顓炲妺闁搞劌鐏氱粋宥夋倷缂堢姷绠氶悗鐟板閸犳牠鎮橀敂鑺ュ弿濠电姴瀚敮娑㈡煙瀹勭増鍣界紒顔炬暩閿熸枻缍嗛崑鍡欑矓閻戣姤鈷掑ù锝勮閻掓儳螖閻樿櫕鍊愮�规洏鍎抽敓鏂ょ秵閸犳牜绮婚悙鐑樼厪濠电偟鍋撳▍鍛村炊鐎涙绡�闁靛骏绲剧涵楣冩煥閺囶亞鐣电�殿喗妲掗ˇ瑙勬叏婵犲啯銇濈�规洘锕㈠畷锝嗗緞鐎ｎ亜澹嶉梻鍌欒兌閹虫捇宕捄銊﹀床婵☆垵娅ｉ弳锕傛煙鏉堥箖妾柡鍛絻椤法鎹勬笟顖氬壋闂佸憡鐟ュΛ婵嗩潖閾忓湱纾兼俊顖濆吹椤︺儵姊虹粙鍖″伐婵狅拷闁秵鏅搁柤鎭掑劤閸熸煡鏌熼崙銈嗗? by changhao
	{
		if (this.levelmin > this.levelmax)
		{
			return false;
		}
		
		if (this.levelmin <= 0 || this.levelmax <= 0)
		{
			return false;
		}
		
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垹顭峰缁樻媴閻熼偊鍤嬪┑鐐插级閻楃姴鐣烽幇顖樹汗闁圭儤鍨归敍娑㈡煟鎼搭垳绉甸柛鐘愁殜閹繝鎮㈤崗鑲╁幍闂備緡鍙忕粻鎴炴櫠椤栫偞鐓欐い鏍ㄦ皑婢ф稒绻涢懝閭﹀殭闁宠鍨归敓鏂ょ秵閸嬶拷闁归攱妞藉娲川婵犲嫧妲堥梺鎸庢磸閸婃牠骞堥妸鈺傛櫇闁稿本绋撻崢閬嶆⒑缂佹◤顏嗗椤撶喐娅犻柣銏㈩暜閹峰嘲鈻撻崹顔界亪闂佺顕滅槐鏇犲垝椤撱垺鍋勯柛蹇撳悑濞呫垺绻涚�电孝妞ゆ垵鎳橀幏鎴︽偄閸忚偐鍙嗗┑鐘绘涧濡瑩宕幒妤佺厸闁告劑鍔庢晶娑㈡煛閸涱垼鐒鹃棁澶愭煟濡儤鈻曢柛搴㈠姍閺屾稓锟斤綆浜堕崕鏃堟煛鐏炲墽娲撮柛鈺佸瀹曟﹢顢旈崨顓熺彯闂傚倷鐒﹀鍧楀储婵傚憡鍋嬮柟鎹愵嚙閽冪喖鏌曟繛鐐珔缂侇偄绉归弻銊╂偄閸撲胶鐓撻悗瑙勬礈閹虫捇鍩為幋锕�閱囬柣鏂垮槻缁ㄣ儵姊绘担铏广�婇柛鎾寸箘缁瑩骞掑Δ浣镐簵闂侀潧顦弲婊堟偂閻斿吋鐓涢柛銉㈡櫅娴犳粓鏌ㄩ悢缁橆棄婵狅拷闁秵鏅搁柤鎭掑劤閸熸煡鏌熼崙銈嗗?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囨煕閳╁啨浠︾紒顔瑰墲娣囧﹪鎮欓鍕舵嫹閺嶎厼绀夌憸蹇曞垝婵犳艾绠ｉ柣妯烘▕濡粓姊虹粔鍡楀濞堟洟鏌ｉ幘瀵告噮缂佽鲸鎸婚幏鍛叏閹搭厺閭�规洖缍婂畷鎺楁倷鐎电寮虫繝鐢靛█濞佳兾涢鐐嶏綁宕妷褏锛滈梺缁樏悘姘跺吹閿熶粙姊婚崶褜妯�闁哄被鍔岄埞鎴﹀幢濮楀棙锟ラ梻浣侯攰濡嫰宕导鏉戠畺妞ゆ柨鐨烽弨浠嬫倵閿濆骸浜愰柟椋庣帛缁绘稒娼忛崜褎鍋ч梺纭呮珪閹瑰洭銆佸顒夌叆闁告洦鍘鹃鏇㈡⒑閸涘﹦鎳冩い锔诲灦閹﹢鍩￠崘顏嗭紲濡炪倖妫侀崑鎰櫠濞戞氨纾兼俊銈呭暙閺嬫盯鏌℃担瑙勫鞍缂佸倹甯為敓鏂ょ秵娴滅偤鎮鹃悙顒傜闁规儳顕崯鏌ユ煙妞嬪骸鍘撮柡宀嬬磿娴狅箓鎳為妷顔筋棧婵＄偑鍊栭幐鎼佸Χ缁嬭法鏆﹂柛妤冨亹閺嬪酣鐓崶銊﹀暗闁汇倕瀚板濠氬磼濮橆剨鎷锋搴㈩偨婵﹩鍓﹂悞鐣屾喐閺冨倻妲甸梻浣芥硶閸犲秶鍒掑▎蹇ｆ綎濠电姵鑹剧粈瀣亜閹扳晛鐒哄ù纭锋嫹缂傚倸鍊峰ù鍥ㄧ椤掑嫬纾婚柕鍫濐槺瀹撲線鎮楅敐搴℃灍闁哄懏绮撻弻锝夋晲閸涙澘顏Δ鐘靛仜閻楁挸顫忕紒妯诲闁惧繒鎳撶粭锟犳⒑閹肩偛濮傛繛浣冲懎寮查梻浣瑰濮婂綊骞忓┑瀣鐎瑰嫰鍋婂鈺呮煟閹伴潧澧い蹇ユ嫹 by changhao
		
		return true;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794499;

	public int getType() {
		return 794499;
	}

	public int targetid; // 目标id by changhao
	public int levelmin; // 等级下限 如果是个人匹配这个忽略 by changhao
	public int levelmax; // 等级上限 如果是个人匹配这个忽略 by changhao

	public CRequestSetTeamMatchInfo() {
	}

	public CRequestSetTeamMatchInfo(int _targetid_, int _levelmin_, int _levelmax_) {
		this.targetid = _targetid_;
		this.levelmin = _levelmin_;
		this.levelmax = _levelmax_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(targetid);
		_os_.marshal(levelmin);
		_os_.marshal(levelmax);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		targetid = _os_.unmarshal_int();
		levelmin = _os_.unmarshal_int();
		levelmax = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestSetTeamMatchInfo) {
			CRequestSetTeamMatchInfo _o_ = (CRequestSetTeamMatchInfo)_o1_;
			if (targetid != _o_.targetid) return false;
			if (levelmin != _o_.levelmin) return false;
			if (levelmax != _o_.levelmax) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += targetid;
		_h_ += levelmin;
		_h_ += levelmax;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(targetid).append(",");
		_sb_.append(levelmin).append(",");
		_sb_.append(levelmax).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestSetTeamMatchInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = targetid - _o_.targetid;
		if (0 != _c_) return _c_;
		_c_ = levelmin - _o_.levelmin;
		if (0 != _c_) return _c_;
		_c_ = levelmax - _o_.levelmax;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

