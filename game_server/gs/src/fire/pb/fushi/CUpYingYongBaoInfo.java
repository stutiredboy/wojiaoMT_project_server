
package fire.pb.fushi;

import org.apache.http.client.methods.HttpGet;
import fire.pb.main.Gs;
import fire.pb.state.StateManager;
import gnet.link.Dispatch;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CUpYingYongBaoInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CUpYingYongBaoInfo extends __CUpYingYongBaoInfo__ {
	@Override
	protected void process() {
		// protocol handle
		final int userID = ((Dispatch)this.getContext()).userid;
		final long roleID = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleID < 0)
			return;
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				String gsServer = Gs.serverid;
				FushiManager.logger.info(new StringBuilder().append("CUpYingYongBaoInfo,userID:").append(userID) 
						.append(",roleID:").append(roleID) 
						.append(",openid:").append(openid) 
						.append(",openkey:").append(openkey)
						.append(",paytoken:").append(paytoken)
						.append(",pf:").append(pf)
						.append(",pfkey:").append(pfkey)
						.append(",zoneid:").append(zoneid)
						.append(",platformname:").append(platformname));
				xbean.YingYongBao yyb = xtable.Yingyongbaoinfos.get(userID);
			    if (yyb == null){
			    	yyb = xbean.Pod.newYingYongBao();
			    	xtable.Yingyongbaoinfos.insert(userID, yyb);
			    }
			    
			    //openkey 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К缂傚倷鑳舵慨閿嬬箾閿熶粙鏌″畝锟介崰鏍嵁閸℃凹妲诲銈忕到閸熷潡鍩ユ径鎰鐎规洖娉﹂妶澶嬬叆闁绘梻绮ˉ澶岀磼閻樿尙效鐎规洘娲熼弻鍡楃暤閵夈儲鍠樻い銏＄洴閹瑩骞撻幒鏃撴嫹椤撱垺鈷戠紒瀣濠�鎵磼鐎ｎ偅灏电紒顔碱煼瀹曟粏顧傞柟椋庡厴閹兘寮跺▎鐐棏闂備礁鎽滄慨闈浢哄鍫熷殟閺夊牄鍔庣弧锟藉┑顔斤供閸橀箖宕㈤柆宥嗏拺闂傚牊渚楅悞楣冩煕鎼淬劋鎲鹃柡浣规崌閹稿﹥寰勫畝锟芥婵°倗濮烽崑娑㈡偋閹剧繝绻嗛柟闂寸鍞銈嗘濡嫮绱撻幘缁樷拻濞达綀娅ｉ妴濠囨煕閹惧绠為柕鍡楀暣瀹曘劑顢涘锟界粭澶愭煟閻樺弶鎼愭俊顖氾工閵嗘帗绻濆顓犲帾闂佸壊鍋呯换鍌炴晸閻ｅ本鍤�闁宠绉瑰畷鍫曨敆娴ｅ搫骞堥梻濠庡亜濞诧箑螞閹达附鍤�閻犱警鐓夐幏宄扳枔閸喗鐏堝銈庡幖閸㈡煡顢氶敐澶婄妞ゆ棁妫勬禍婊勪繆閻愬樊鍎忔繛瀵稿厴閹即顢氶敓钘夘潖缂佹ɑ濯寸紒瀣儥濡矂姊虹粙娆惧剰闁硅櫕鍔欓獮鎴﹀閵堝懐锛滃┑鐐村灦閻熴儱顕ｉ崸妤佺厵闁兼祴鏅炶棢濠碘剝褰冮幊搴ㄥΥ閹烘挾绡�婵﹩鍘鹃崢顏堟⒑閸撴彃浜濈紒璇插�垮鍐测枎閹惧鍙嗛梺缁樻椤曆嗩暱婵犵數鍋犵亸娆撳窗閺嶎厽鍋樻い鏃傛櫕缁★拷闂佺琚崐鏍ь嚈濞差亝鈷戦悹鎭掑妼閺嬫瑦淇婇銏狀伃妞ゃ垺宀搁弫鎰板幢濞嗘垹妲囨繝娈垮枟閿曗晠宕㈤挊澶嗘瀺婵犲﹤瀚弧锟介梺闈涢獜缁插墽娑甸崜褎瀚柍鍝勬噺閻撳啴鏌涘┑鍡楊仾闁革絾妞介弻锝夊箻瀹曞洨顔囧銈庡弨濞夋洟骞戦崟顖涙優闁荤喖鍋婇弳顐︽⒒娴ｅ憡鍟為柡宀嬬秮瀹曟劕鈹戠�ｎ亣鎽曞┑鐐村灦鑿ら柡瀣叄閻擃偊宕堕妸锕�纰嶆繝娈垮枛濠㈡姲oken婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐鍛傜喎鈻庨幆褎顔勭紓鍌欒兌婵挳鎮樺璺何﹂柛鏇ㄥ枤閻わ拷闂佽宕樺▔娑€�傞搹鍦＝濞达絽鎼宀勬煕閵娿儳鍩ｇ�殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?,SDK缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃闁硅櫕鎹囬垾鏃堝礃椤忓孩瀚归柨婵嗙凹缁ㄥジ鏌熼惂鍝ョМ闁哄矉缍侀、姗�鎮欓幖顓燁棧闂傚倸娲らˇ鐢稿蓟閵娿儮鏀介柛鈩兩戦幃娆撴⒑濮瑰洤濡介柛銊ユ健瀵鎮㈡搴㈡疂闂佸搫顦扮�笛傜昂濠碉紕鍋戦崐銈夊磻閸涱垱宕查柛顐犲劚缁犳牠鏌嶉埡浣告殲闁稿海鍠栭弻銊モ攽閸℃浠奸柣搴＄仛閻撯�愁潖婵犳艾纾兼繛鍡樺笒閸橈繝姊虹涵鍛彧闁圭澧介崚鎺旀嫚瀹割喖鎮戞繝銏ｆ硾閿曘倝鎮楅銏♀拺闁兼亽鍎嶉鍩跺洦绂掔�ｎ亜鎯為梺鍝勬川娴兼繆銇愰幒鎾充汗閻庣懓澹婇崰鏍礈娴煎瓨鐓欐い鏍ㄧ矊閺嬫盯鏌熼鐓庢Щ妞ゎ厹鍔戝畷姗�鎮欓鑺ョ�伴梺璇插椤旀牠宕板鍨涳拷锕傚醇閵夈儳鍘洪柟鍏肩暘閸斿瞼绮婚懡銈囩＜妞ゆ梹顑欏鎰版倵濮橆兙鍋㈡慨濠勭帛閹峰懘宕ㄦ繝鍌涙畼闂備胶鎳撻幉鈥澄ｉ幒妤�桅闁圭増婢樼粈鍐煃閸濆嫬鏋ゆ繛鍙夋倐濮婃椽宕ㄦ繝鍐ㄧ樂闂佸憡渚楅崹鐣屾閹惰姤鐓熼幖杈剧磿閻ｎ參鏌涙惔銊ゆ喚妤犵偛锕ㄧ粻娑樏归弶娆炬Ц妞ゎ厹鍔戝畷濂告偄閾氬倻鏆楅梻鍌欑窔濞佳囨偋閸℃蛋鍥ㄥ鐎涙ê浜楅梺闈涱檧婵″洨寮ч敓浠嬫⒒閸屾氨澧涚紒瀣浮钘熼柣鎰暘娴滄粓鏌曟竟顖氬暕濡叉劙姊洪崫鍕拱缂佸鍨块崺銏℃償閵堝洨鏉搁梺鍝勬川婵參宕�ｎ喗鈷掑ù锝呮啞閹牓鏌ｉ鐑嗘Ш缂佽京鍋炵粭鐔兼晸娴犲宓侀柛鎰靛枛椤懘鏌曢崼婵囧櫣缂佹劖绋掔换婵嬫偨闂堟刀銏ゆ倵濮樼厧澧寸�规洜鏁婚獮鎺懳旀担鍙夊濠电偠鎻紞锟藉┑顔哄�楀☉鐢稿醇閺囩喓鍘遍梺缁樕戦悡锟犲矗閸曨垱鐓涘ù锝堫潐瀹曞矂鏌熼鐓庘挃濞寸媴绠撻幊鐐哄Ψ瑜嶇紞鎴︽⒒閸屾瑧鍔嶉柟顔肩埣瀹曟劙寮介鐔蜂画闂佸啿鎼幊搴ㄦ嫅閻旂尨鎷烽獮鍨姎婵炲眰鍔庢竟鏇㈠礂闂傚绠氬銈嗙墬缁诲秹宕靛▎鎴犳／闁绘劦鍓欓埢鏇熸叏婵犲嫬鍔嬫繛纰变邯楠炲秹顢欓悡搴�撮梻鍌欑濠�閬嶅箠閹捐秮娲敇閻戝棗娈ㄥ銈嗗姧缁犳垹绮婚懡銈囩＝濞达綀鍋傞幋婵冩瀺闁靛繈鍊栭埛鎴︽偣閹帒濡兼繛鍛姍閺岀喖宕欓妶鍡楊伓
			    if (platformname.equals("qq")) {
			    	yyb.setOpenkey(paytoken);
			    }
			    else {
			    	yyb.setOpenkey(openkey);
			    }
			    
			    yyb.setOpenid(openid);
			    
//			    yyb.setPaytoken(paytoken);
			    
			    yyb.setPf(pf);
			    yyb.setPfkey(pfkey);
			    yyb.setZoneid(gsServer);
			    yyb.setPlatformname(platformname);
			    
			    try {
					final HttpGet request = FushiManager.makeYybGetCurrencyRequest(userID, roleID);
					if (request != null) {
						Gs.getHttpClient().execute(request, 
							new YybGetCurrencyHandler(userID, roleID){
							@Override
							protected boolean executeHandler(int balance, int genBalance, int firstSave, int saveAmt){
//								FushiManager.refreshRoleFushi(roleID, balance, saveAmt);
								return true;
							}
						});
					} else {
						StateManager.logger.error(new StringBuilder("roleId=").append(roleID).append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忓爼鏌ｆ惔銈庢綈婵炴彃绻樺畷鏇㈠箮閼恒儲娅㈤梺鍝勫�堕崐妤冪矓閻㈠憡鐓曢柣妯虹－婢у崬顭跨憴鍕鐎规洜顭堣灃濞达絽鎼獮宥夋⒒娴ｇ瓔鍤冮柛銊ㄦ珪閺呰泛螖閸氳棄顦板鍕箛椤掑偆鍟囬梻浣告惈椤︿即宕烘繝鍥╁彆妞ゆ帒瀚悡娑㈡倶閻愰鍤欓柨鐔诲Г缁诲牓鐛繝鍌楁斀閻庯綆浜為鐓庮渻閵堝棙顥嗛柛瀣姈閺呭爼顢涘锝嗘杸闂佺粯鍔樼亸娆撳箺閻樼數纾兼い鏃囧亹閻忚京绱掓潏鈺佷沪缂佺粯绻堝畷鎯邦樁闁硅姤娲栭埞鎴︽倷閺夋垹浠ч梺鎼炲妿閹虫捇寮锟藉缁樻媴閻熼偊鍤嬬紓浣筋嚙閸婂潡鐛繝鍐╁劅闁靛婢侀幏鐑藉冀閵娿儳绐為梺褰掑亰閸樻悂骞忛搹鍦＝濞达絽澹婇崕鎰版倵缁楁稑娲ょ粻鏌ユ煥濠靛棭妲归柣鎾存礋閺岋絽螣閾忕櫢绱炴繝鈷�鍛毄闁跨喕濮ら鏍窗閺嶎厸锟斤箓鎮滈挊澶嬬�梺鐟板⒔缁垶宕戦幇鐗堢厾缁炬澘宕晶缁樹繆闊厼宓嗘慨濠勭帛缁楃喖鏁撻挊澶樼劷鐟滄棃鍨鹃敃鍌氶唶闁靛鍎抽敍鐔哥節閻㈤潧校闁肩懓澧界划濠氼敍閻愬鍘介梺闈涚墕妤犳悂鎮樺☉妯忕懓顭ㄩ崘顏喰ㄩ梺鍝勭灱閸犳牠骞冨鍏剧喖鎼归柅娑欘敇闂備礁鎼ˇ顖炴偋閸℃稒鍋嬮柟鐐窞濞戙垹宸濋柟纰卞幗閺呮繈姊洪棃娑氱畾闁跨喕濮ら崜姘ｆ潏鈺冪＝闁稿本鐟чˇ锔姐亜閹存繃顥犻柡渚囧櫍閸ㄦ儳鐣烽崶銊︻啎闂備浇顫夋竟鍡樻櫠濡ゅ懎纾婚柕濞炬櫆閻撴洘绻涢幋鐑囧叕鐎规悶鍎遍湁闁绘瑱鎷烽柛妯恒偢閸╃偤骞嬮敂钘夛拷鐑芥煕濞嗗浚妯堟俊顐ゅ仧缁辨挻鎷呴搹鐟扮闂佸憡姊归悷鈺呭Υ娓氾拷瀵噣宕奸锝嗘珖闂備線娼ч悧鍡椕洪妸鈺傛櫖婵犲﹤鐗婇埛鎴犵磽娴ｅ厜妫ㄦい蹇撴椤ユ碍銇勯幘璺烘瀾婵炲懐濞�閺岋綁濮�閻樺啿鏆堥梺缁樻尰缁嬫捇鏁撻悾灞绢仧闁归鍏橀幃妤呮晲鎼粹�愁潾闂佷紮绠戦悧鎾诲箖濡ゅ啯鍠嗛柛鏇ㄥ墰椤︺儵鎮楃憴鍕闁告挾鍠栧畷娲閳╁啫鍔呴梺闈涚墕濞层劑寮堕幖浣光拺闁告繂瀚弳娆撴煕婵犲嫬鍘撮柡灞芥喘椤㈡稑顫濋敐鍡樻澑闂佸湱鍎ゆ繛濠傜暦閹邦儵鏃�鎷呴悷鏉夸紟闂備胶绮崹鐓幬涢崟顓烆棜濠电姵纰嶉悡鐔兼煙闁箑澧柟顖氱墦閺屾盯濡搁妷銉嫹閸ф钃熸繛鎴炵矤濡插ジ姊洪棃娑欏缂侇喗鎹囧顐﹀箻鐠囪尙顓洪梺鍦劋濡繐危椤曪拷濮婅櫣锟藉湱濯崵娆撴⒑鐢喚绉柣娑卞枤閿熸枻缍嗛崰妤呭磻閹扮増鐓熼柕蹇曞Х娴犳稒绻涢崼婊呯煓婵﹦绮幏鍛村川婵犲啫鍓垫俊鐐�х粻鎾寸鐠鸿櫣鏆﹂柟杈鹃檮閸嬪嫰鏌涘☉姗堟敾闁绘繂鍢查埞鎴炲箠闁稿ě鍥х闂佸灝顑冩禍婊勩亜閹捐泛浠﹂柛瀣ㄥ劦閺屸剝鎷呯憴鍕瀺缂備礁鍊圭敮鐐烘晸閺傘倗绉甸柛瀣舵嫹闂佸綊顥撶划顖滄崲濞戞瑦缍囬柛鎾楀憛姘攽閳藉棗浜滈悗姘緲閻ｇ兘濡烽埡鍌氫画闂侀�涚祷濞呮洟寮敓鑺ヤ繆閻愵亜锟芥牕顫忔繝姘；闁规崘顕уЧ鍙夈亜閹烘垵浜伴柟鐑筋棑閹叉挳宕熼鍌ゆО缂傚倷娴囬褔鎮ч幘缁樺仒妞ゆ梹鎷濋幏鐑芥晲鎼粹剝鐏嶉梺鍝勬噺缁诲牓寮婚妸鈺傚亜闁绘垶蓱閻濐亝绻濋姀锝庢綈婵炶尙鍠庨悾椋庣矙鐠囩偓姊归幏鍛村传閸曨偆顔掑┑鐘垫暩婵敻顢欓弽顓炵獥婵°倕鎳庣粈澶愭煛閸ャ儱鐏柡鍛倐閺屻倝骞侀幒鎴濆Б婵犫拃鍛毈闁哄被鍔岄埞鎴﹀醇濠靛懏顫曢柣搴㈩問閸犳骞愰搹顐ｅ弿闁跨喍绮欓弻銊モ槈濡警浠奸悗娈垮枟婵炲﹤顫忕紒妯诲闁惧繒鎳撶粭鈥斥攽閻愭彃绾ч柣妤冨Т閻ｇ兘骞囬弶鎸庡祶濡炪倖鎸堕崝宥囷拷姘愁潐閹便劌螣閻撳簼澹曢柣搴㈢啲閹凤拷"));
					}
				}
				catch(Exception e){
					StateManager.logger.error(new StringBuilder("roleId=").append(roleID).append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撻柟缁㈠枛绾惧ジ鏌曟繛褍瀚弸鎴︽⒑閸濆嫬鏆欓柣妤�妫涚划濠氬冀閵娧咁啎閻庣懓澹婇崰鏇犺姳婵犳艾绠氶柣鏂垮悑閳锋垿姊婚崼鐔剁繁婵☆垰鐗撻弻娑㈡偐閹颁焦鐣肩紓浣戒含閸嬬偤骞嗛弮鍫濐潊闁靛繈鍨诲Σ鍥⒒娴ｅ湱婀介柛銊ㄦ椤洩顦抽柣妤�閰ｅ缁樻媴閸濆嫬浠樼紓鍌氱Т閿曪妇鍒掓繝姘唨鐟滄粓宕甸弴銏＄厱婵炴垶锕崝鐔兼煟閻旈绉洪柡灞诲姂閹垽宕滄担铏瑰幆闁诲孩顔栭崰鏍�﹀畡閭﹀殨闁圭虎鍠栭～鍛存煟濡鍤欓柡浣筋潐缁绘繈鎮介棃娑掓瀰濠电偘鍖犻崗鐘虫そ婵℃悂鍩℃担鍕撳嫨浜滈柟鏉跨埣濡绢噣鏌嶉柨瀣仼闁瑰弶鎮傞幃褔宕煎┑鍛灁婵犵妲呴崑鍛村垂閸ф钃熸繛鎴炵矌閻わ拷闂佸搫鍟幑渚�鏁撻崐鐔哥《闁跨喕濮ら鏍闯椤曪拷瀹曟垶绻濋崶鈺佺ウ濠碘槅鍨甸崑鎰閸忛棿绻嗘い鏍ㄧ矌鐢稒銇勮箛鏇炴灈婵﹦绮幏鍛存嚍閵壯侊拷濠囨⒑闂堚晝绉剁紒鐘虫崌閻涱喛绠涘☉娆愭闂佽法鍣﹂幏锟�? 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬姘卞闂佹眹鍨归…宄邦潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙鎻掔骇闁绘濮撮悾鐑藉箛閺夎法顔愭繛杈剧悼椤牓鎮楅銏♀拺缂佸娉曢悘閬嶆煕鐎ｎ剙浠遍柟顕嗙節婵＄兘鍩￠崒婊冨箺闂備礁鎼ú銊╁磻濞戙垺鏅搁柦妯侯槹鐠愶繝鏌ㄩ悢璇残撻柣鏃戝墴楠炲繘鏁撻敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ鐐电磽娴ｇ晫鍫柛濠冩礋濠�渚�姊虹紒妯忣亜螣婵犲洤纾块煫鍥ㄦ礈绾惧ジ鏌ｅΟ纭咁劅婵炲吋鍔欓弻鏇㈠炊瑜嶉顓燁殽閻愬弶鍠橀柛鈹惧墲缁楃喐绻濋崘顭戜紦闂備礁鎼粙渚�宕戦幘璇茬鐎瑰嫰鍋婂鈺傘亜閹烘埈妲洪柛姘儔濮婃椽宕崟顓犲姽缂傚倸绉崇粈渚�顢氶敐澶樻晢闁告洦鍋勯悗顓烆渻閵堝棙顥嗘俊顐㈠閺佹挾绮电�ｎ亞浠稿┑顔硷龚濞咃絿鍒掑▎鎾崇闁炽儱鍟块～鐘绘⒒娴ｈ姤銆冪紒锟芥笟锟介垾锕�鐣￠柇锕�娈ㄦ繝鐢靛У绾板秹寮查幓鎺濈唵閻犺桨璀﹂崕蹇撁瑰鍕煉婵﹥妞藉畷銊︾節閸曘劍顫嶉梻浣瑰濞测晝绮婚幘宕囨殾婵炲棙鎸搁悘鎶芥煙妫颁胶鍔嶉悗闈涚焸濮婃椽妫冨☉姘暫缂備胶绮敮鐐靛垝閺冨牜鏁嗗ù锝堟椤旀洟姊洪崨濠佺繁闁哥姵顨堢划鍫ュ醇閵夛妇鍘靛Δ鐘靛仜閻忔繈鎮橀埡鍛厓闁芥ê顦藉Ο锟芥繝娈垮櫙閹风兘姊虹紒姗嗙劸妞ゆ泦鍥ф瀬鐟滅増甯楅埛鎺懨归敐鍫燁仩閻㈩垱绋掓穱濠囶敃閵忕姵娈婚柦妯煎枛閺岀喖骞嗚閸ょ喐銇勯埡鍐ㄥ幋闁哄被鍊曢湁閻庯綆鍋呴悵鏍磼閻愵剙绀冩俊顐㈠婵℃挳骞掗幋顓熷兊濡炪倖甯婇悞锕傚箖濞嗗繆鏀介柣鎰级閸ｆ椽鏌ㄩ弴妯虹伈鐎殿喛顕ч埥澶娢熼柨瀣拷濠氭椤愩垺澶勯柟姝岊嚙閳绘挻绻濆顓烇拷鍨箾閸繄浠㈡繛鍛耿閺屾稓锟斤綆浜峰銉╂煟閿濆洤鍘存鐐村笒铻栧ù锝夋交閹风兘鎮滈懞銉у幘缂佺偓婢樺畷顒佹櫠缂佹ü绻嗛柟缁樺笧閸╋綁鏌″畝瀣М闁诡喓鍨藉畷顐﹀Ψ瑜忛崢鎰磽閸屾瑧顦︽い锔垮嵆楠炴劙骞庢慨鎰舵嫹娴ｅ壊娼╅悹杞扮秿閵娾晜鐓冮弶鐐村閸忓本銇勯弮锟界敮锟犲蓟閿濆棙鍎熼柕濠忛檮闁款參姊虹涵鍛撶紒顔芥崌閵嗕礁鈻庨幘鍐插祮闂侀潧绻嗗褔骞忓ú顏呪拺闁革富鍙庨悞鐐箾閹绢噮妫戠紒顔碱煼楠炴绱掑Ο鐓庡箥闂備礁鎲￠崝妯间焊濞嗘垹涓嶇�规洖娲ㄧ壕鍏笺亜閺冨洤浜瑰褎娲熼弻锝夋晲閸℃瑧鐤勯悗瑙勬礈閸犳牠銆佸Δ鍛＜婵﹩鍓涢悿鍕⒒閸屾艾锟藉嘲霉閸ヮ剨缍栧鑸靛姇绾惧潡鏌熼崜浣烘憘闁轰礁顑嗛妵鍕箻鐠虹洅銉モ槈閹惧磭效闁哄备锟芥剚鍚嬮幖绮癸拷宕囶啈闂備胶顭堥敃锕傚极鐠囧樊娼栧┑鐘宠壘闁卞洭鏌ｉ弮鍥ワ拷锟芥俊顐犲姂濮婅櫣绮欏▎鎯у壄闂佹悶鍔岄…鐑藉极閹捐纾归柣鏇氱劍缂嶅牆鈹戦悙鏉戠祷缂佺粯锚閻ｅ嘲鈹戦崶銊ュ妳闂侀潧顭梽鍕枍閵忋倖鈷戦柛蹇涙？閼割亪鏌涙惔銏犫枙闁糕晪闄勯幏鍛寸嵁婢跺摜鐩庢俊鐐�栭幐楣冨磻閻愬搫绐楁俊顖溿�嬮幏椋庢喆閸曨剛鈹涚紓鍌氱С缁�渚�鎮鹃悜钘夌闁绘垵妫欑�靛瞼绱撻崒娆戝妽閽冮亶鏌℃径瀣�愭慨濠勭帛閹峰懘鎼归悷鎵偧闂備礁鎲″鐟懊洪弽顓ф晪闁挎繂顦柋鍥煛閸ラ攱瀚规繝銏ｅ煐閸旀牠宕愰悜鑺ョ厽闁瑰浼濋鍛浄闁告繂瀚峰〒濠氭煏閸繃顥犲褜鍓氶妵鍕Ω閵夛富妫為梺瀹狀嚙缁夌數鎹㈠┑瀣闁兼悂娼ч鍫曟煟閻斿摜鎳冮悗姘煎幘缁牓宕奸妷锔惧幐婵炶揪绲块悺鏃堝吹濞嗘劑浜滈柡鍥朵簽缁嬭崵绱掗崒娑樼闁跨喐鏋荤徊浠嬫倶濮樿泛鐤鹃柨婵嗩槹閳锋垹绱撴担鑲℃垿鎮￠妷鈺傜厵缁炬澘宕禍婊勩亜閺囶亞绉鐐查叄閹崇偤濡烽姀鈥愁伜婵犵數鍋犻幓顏嗙礊閿熻棄鈹戦鍝勶拷妤�鈽夐悽绋块唶闁哄洨鍠撻崢閬嶆⒑閹稿海绠撶紒缁樺浮閹箖宕归顐ｎ啍闂佺粯鍔樼亸娆戠不婵犳碍鐓涘ù锝堫潐瀹曞矂鏌℃担瑙勫磳闁轰焦鎹囬弫鎾绘晸閿燂拷?") , e);
				}
			    
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812492;

	public int getType() {
		return 812492;
	}

	public java.lang.String openid;
	public java.lang.String openkey;
	public java.lang.String paytoken;
	public java.lang.String pf;
	public java.lang.String pfkey;
	public java.lang.String zoneid;
	public java.lang.String platformname;

	public CUpYingYongBaoInfo() {
		openid = "";
		openkey = "";
		paytoken = "";
		pf = "";
		pfkey = "";
		zoneid = "";
		platformname = "";
	}

	public CUpYingYongBaoInfo(java.lang.String _openid_, java.lang.String _openkey_, java.lang.String _paytoken_, java.lang.String _pf_, java.lang.String _pfkey_, java.lang.String _zoneid_, java.lang.String _platformname_) {
		this.openid = _openid_;
		this.openkey = _openkey_;
		this.paytoken = _paytoken_;
		this.pf = _pf_;
		this.pfkey = _pfkey_;
		this.zoneid = _zoneid_;
		this.platformname = _platformname_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(openid, "UTF-16LE");
		_os_.marshal(openkey, "UTF-16LE");
		_os_.marshal(paytoken, "UTF-16LE");
		_os_.marshal(pf, "UTF-16LE");
		_os_.marshal(pfkey, "UTF-16LE");
		_os_.marshal(zoneid, "UTF-16LE");
		_os_.marshal(platformname, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		openid = _os_.unmarshal_String("UTF-16LE");
		openkey = _os_.unmarshal_String("UTF-16LE");
		paytoken = _os_.unmarshal_String("UTF-16LE");
		pf = _os_.unmarshal_String("UTF-16LE");
		pfkey = _os_.unmarshal_String("UTF-16LE");
		zoneid = _os_.unmarshal_String("UTF-16LE");
		platformname = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CUpYingYongBaoInfo) {
			CUpYingYongBaoInfo _o_ = (CUpYingYongBaoInfo)_o1_;
			if (!openid.equals(_o_.openid)) return false;
			if (!openkey.equals(_o_.openkey)) return false;
			if (!paytoken.equals(_o_.paytoken)) return false;
			if (!pf.equals(_o_.pf)) return false;
			if (!pfkey.equals(_o_.pfkey)) return false;
			if (!zoneid.equals(_o_.zoneid)) return false;
			if (!platformname.equals(_o_.platformname)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += openid.hashCode();
		_h_ += openkey.hashCode();
		_h_ += paytoken.hashCode();
		_h_ += pf.hashCode();
		_h_ += pfkey.hashCode();
		_h_ += zoneid.hashCode();
		_h_ += platformname.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(openid.length()).append(",");
		_sb_.append("T").append(openkey.length()).append(",");
		_sb_.append("T").append(paytoken.length()).append(",");
		_sb_.append("T").append(pf.length()).append(",");
		_sb_.append("T").append(pfkey.length()).append(",");
		_sb_.append("T").append(zoneid.length()).append(",");
		_sb_.append("T").append(platformname.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

