
package fire.pb.skill.liveskill;




import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.item.GroceryItemShuXing;
import fire.pb.main.ConfigManager;
import fire.pb.skill.SSkillError;
import fire.pb.skill.SkillConstant;
import fire.pb.skill.SkillRole;
import fire.pb.util.BagUtil;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveSkillMakeStuff__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╄兌閿熻棄绠嶉崕閬嵥囬婊呯焼閻庯綆鍋佹禍婊堟煙閸濆嫮肖闁告柨绉甸妵鍕棘閹稿骸顦╃紓浣虹帛缁诲倿顢氶妷鈺傜叆閻庯綆鍋嗛崙锟犳⒑鐠恒劌鏋旈柣娑栧�濆畷鎯邦槾妞ゆ柨妫濆铏圭磼濡櫣浼囨繝娈垮枔閸婃繈骞冮敓鐘参ㄩ柍鍝勫�婚崢鎼佹⒑閹肩偛鍔撮柣鎾茬窔椤㈡棃宕奸悢鍑ゆ嫹閸洘鐓犵痪鏉垮船婢ч箖鏌熼悜绛嬫闁瑰弶鎸冲畷鐔碱敆閸屻倖肖闂傚倷鑳堕…鍫㈡崲閹达附鏅濋柕蹇嬪�曡繚婵炶揪绲芥竟濠傤焽閵娾晜鐓ラ柣鏂垮閻瑦顨ラ悙鎻掓殻闁糕斁鍓濋幏鍛村矗婢跺奔绨撮梻鍌欑濠�閬嶁�﹂崼婵愬晠闁冲搫鎳忛弲婵嬫煕鐏炲墽鈻撻柟宄邦煼濮婅櫣绮欓幐搴㈡嫳闂佽崵鍟欓崶浣告喘閺佸啴宕掑☉姘箥缂備胶鍋撳妯虹暦椤掍胶顩查柟娈垮櫙閹烽鎲撮崟顒�顦╅梺鎼炲妼閻栧ジ濡存笟锟藉鎾閳╁啯鐝栭梻浣芥硶閸犳捇寮查锝囩彾闁哄毝棰佹睏闂佸湱鍎ら幐楣冨储閻愵剛绡�婵炲牆鐏濋弸鐔兼煕閺冿拷濞茬喖寮幘缁樺殟闁靛鍠楅悾椋庣磽娴ｅ壊鍎忔い锔诲灦椤㈡﹢宕楅悡搴ｇ獮闁诲函缍嗛崜娆忣嚕閹惰姤鈷掑ù锝堟鐢稒绻涢崣澶屽⒌鐎规洘鍔欏畷鐑筋敇閵婏箑顏跺┑顔筋焽閸嬫挾锟芥熬鎷�?
 * @author changhao
 *
 */
public class CLiveSkillMakeStuff extends __CLiveSkillMakeStuff__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure livemakstuff = new mkdb.Procedure()
		{
			@Override
			/*闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柛銊ュ�歌灃闁挎繂鎳庨弳娆戠磼閻樺磭鈽夐棁澶愭煥濠靛棙鍣洪悹鎰剁磿缁辨帞锟斤絺鏅為崗宀�绱掓潏銊﹀磳鐎规洘甯掗～婵嬵敆婵犲啫顏堕梺缁樺灱婵倝宕愰崸妤佺叆闁哄洨鍋涢敓鐣屾暬閺佹捇寮妶鍥╂殼閻庤娲栭悥濂稿春閿熺姴绀冪憸蹇涙偡濠靛棌鏀介幒鎶藉磹瑜忓濠冪鐎ｎ亞鏌堝銈嗙墱閸嬬偤宕戦崒鐐寸厪濠㈣泛妫欏▍鍡涙煟閹捐泛鏋涢柡宀嬬節瀹曟帒顫濋崣妯挎婵＄偑鍊х徊鐐箾婵犲洤钃熼柨婵嗩樈閺佸洭鏌ｉ弮鍌氬妺闁革絼鍗冲娲传閸曨偒妲甸梺璺ㄥ枙濡嫮澹曢銏犳辈闁糕剝绋掗崐鐢告煥濠靛棝顎楀褌鍗抽弻锝夋晝閿熶粙鎮ч幘鎰佹綎闁绘垶蓱婵粓鏌熷▓鍨灈濠碘�茬矙濮婅櫣鎲撮崟顓熸啓閻庤娲滈弫鎼佸礆閹烘棑鎷烽敐搴℃灈缂佺姵濞婇弻锟犲礃閳哄倸闉嶉柣搴㈣壘缂嶅﹪寮婚妸銉㈡斀闁糕剝渚楅敓鑺ヮ殔闇夋繝濠傚缁犳牜绱掔紒妯兼创鐎规洏鍔戦、娆撳礈瑜忛崢婊勭節濞堝灝鏋涢柨鏇樺妼閳诲秹鏁愭径濠勵槺闂佸搫绋侀崢濂稿础閹惰姤鐓熼柟閭﹀幘閵堟挳鏌熼弸顐拷婵嗩潖缂佹ɑ濯撮柛娑橈工閺嗗牆鈹戦纭峰伐婵狅拷闁秴鏋佹い鏇嫹闁诡喗鐟╅幃婊兾熼悜妯兼瀫闂備礁鎼ˇ顖炴偋閸曨垰绀夐幖杈剧到婵剟鏌ㄩ悢缁橆棄闁宠鍨块、娆撳棘閵堝嫮杩旈梻浣告啞钃遍柟顔煎�块悰顔跨疀閹句焦妞介、鏃堝川椤忓懎顏归梻鍌欑閹诧紕绮欓幋锔芥櫇闁挎洖鍊搁悡鈥愁熆閼搁潧濮堥柣鎾卞劦閺岋繝宕堕張鐢电泿濡炪倐鏅╅崜娑氭閹烘鏁婄痪鎷屼含閸氬螖閻橀潧浠︽い顓炴川濡叉劙骞掗幊宕囧枛閹喚锟芥稒锚椤忓爼姊洪崜鑼帥闁稿鎳樺畷锝堢疀閺傚墽绠氬銈嗙墬缁瞼鏁崼鏇熷仺妞ゆ牗姘ㄩ崺锝夋煛瀹�瀣？闁跨喐鏋荤徊濠氬礉瀹�鍕櫢闁兼亽鍎崇粻鐐碉拷娈垮枦椤曆囧煡婢舵劕顫呴柍銉ュ帠濮规姊洪懡銈呅㈡繛澹洤骞㈡俊銈勭閸撶敻姊婚崒姘拷宄懊归崶褜娴栭柕濞炬櫆閸婂潡鏌ㄩ弴鐐诧拷鍝ョ不閺屻儲鐓曢柕澶樺枛婢ь噣鏌＄�ｂ晝绐旈柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻锟犲川椤旇棄锟芥劙鏌＄仦璇插闁诡喓鍊濆畷鎺戔槈濮楀棔绱� team->roleid->match by changhao*/
			protected boolean process()
			{	
				fire.pb.item.GroceryItemShuXing config = (GroceryItemShuXing) fire.pb.item.Module.getInstance().getItemManager().getAttr(itemid);
				if (config == null)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return true;						
				}
				
				int skillid = LiveSkillManager.getInstance().GetMakeStuffSkillIdByItemId(config);
				if (skillid == 0)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return true;						
				}
				
				SkillRole skillrole = new SkillRole(roleid);
				
				xbean.LiveSkill liveskill = skillrole.getLiveSkills().get(skillid);	//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊炲銈嗗笒椤︿即寮查鍫熷仭婵犲﹤鍟版晥濠电媴鎷峰〒姘炬嫹婵﹨娅ｇ槐鎺懳熼搹閫涚礃婵犵妲呴崑鍕拷姘緲椤曪綁宕ㄦ繝鍕嚌闂佽法鍠嶇划娆忣嚕鐠囨祴妲堟俊顖炴敱椤秴鈹戦绛嬫當闁绘锕顐﹀箚瑜夐弨浠嬫煟閹邦剙绾ч柛锝堟閳规垿顢欓懖鈺�绮电紓浣哥焷妞村摜鎹㈠┑瀣倞妞ゎ剦鍎搁崶銊у幈濠电偞鍨靛畷顒勫几濞戞瑧绠鹃柛婊冨暟缁★拷濠殿喖锕ㄥ▍锝夊箲閸曨垰惟闁靛濡囨禍鐐寸節绾版ɑ顫婇柛瀣閿熻姤纰嶅姗�鎮鹃悜绛嬫晬闁绘劘灏欐鍥⒑閻熼偊鍤熷┑顕�娼ч埢鎾淬偅閸愨斁鎷洪梻鍌氱墛閸楁洟宕奸妷銉ф煣濠电偞鍨跺銊ノ涢婊勫枑闁哄啫鐗嗛拑鐔兼煟閺冨倸鐨戦柟椋庡厴閹棄鈻撶捄銊ュЪ濠电偛顕刊瀛樹繆閸ヮ剙绠栨い鏇嫹闁轰焦鍔栧鍕拷锛卞嫬顏归梻浣藉吹婵潙煤閵堝拋鍤曢柛顐ｆ礀缁犳煡鏌ㄥ┑鍡橆棤缂佺娀绠栭弻娑樷槈閸楃偘绨婚梺璇茬箰瀵爼銆冮妷鈺傚�烽柤纰卞墰椤旀帡姊虹拠鈥虫灍缂侇喗鎹囬獮濠囨倷閸濆嫀銊ф喐瀹ュ宓侀柛顐犲劜閳锋帒霉閿濆懏鍟為柟顖氱墛缁绘稓浠﹂崒姘变紙閻庤娲樼换鍕閿曞倹鍊锋い鎺嶈兌瑜版寧淇婇悙顏勶拷鏍ь潖閸︻厾鐭堢痪顓炴噷娴滃綊鏌熼悜妯诲碍濞存粌缍婂娲箚瑜庣粋瀣煕鐎ｂ晝鍔嶇紒鍌涘浮婵拷闁绘﹩鍋呴弬锟芥俊鐐�栧濠氬Υ鐎ｎ倠娑橆潩椤撶姷顔曢梺鍛婄矊閸熶即骞冮崗闂寸箚闁告瑥顦慨宥嗩殽閻愭潙娴鐐诧工閻ｇ兘宕惰閻忓牓姊洪崷顓у姕缂佺粯绻冩穱濠囧醇閺囩偛绐涘銈嗘尵閸犳洜娆㈤姀銈嗏拻闁稿本鑹鹃敓鑺ユ倐瀹曟劙鎮滈懞銉ユ畱闂佸壊鍋呭ú蹇涙晸閹存帞鍔嶇紒缁樼箞瀹曞爼鎳滈崹顐ｇ彣濠电姷鏁告慨鎾晝閵堝绠犻煫鍥ㄦ尵閺嗭箓鏌涘▎蹇ｆШ缂佲槄鎷烽梻鍌氬�搁悧濠勭矙閹烘鍎楁俊銈呭暟绾惧ジ鎮归崶褍绾фい銉ｅ灲閺屸�崇暆鐎ｎ剛袦婵犳鍣幏鐑芥⒑缂佹◤顏堝疮閸ф姹查柛顐犲劜閳锋垹绱掔�ｎ偒鍎ラ柛搴＄箻閹顫濋銏犵ギ閻庢鍠涢褔鍩ユ径濠庣叆闁告侗鍨卞鎴炵節濞堝灝鏋熼柨鏇楁櫊瀹曟鈽夊Ο鐐戝吘鏃堝川椤旇瀚奸梻浣告啞缁嬫垿鈥﹂鍕�垮ù鐘差儐閻撴稑霉閿濆洨鎽傞柛銈嗙懄閵囧嫰顢曢姀銏㈩啋闂佸湱鍘у﹢閬嶅箟閹绢喖绀嬫い鎰╁�х槐锟犳⒒閸屾瑧绐旀繛浣冲洠锟斤箓宕奸妷銉э紵闂佸搫琚崕鏌ュ磻閻斿吋鐓忛煫鍥ь儏閿熻姤鐗犻崺娑㈠箣閿旂晫鍘介梺缁樻煥閹诧紕娆㈤崣澶岀闁割偅纰嶅▍濠囨煛瀹�锟介崰鏍х暦濞嗘挸围闁糕剝顨忔导锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氶梻鍌欒兌椤牏鎮锕�绀夐幖娣妼缁犵喐鎱ㄥ┑鍡欑伇闁汇倧鎷烽梻浣告惈閸燁偊宕愰弰蹇嬩汗濡わ絽鍟埛鎴︽煕濠靛棗顏柛灞诲姂閺屾盯鍩℃担鍓蹭純閻庢鍣崑濠傜暦閸洦鏁嗗ù锝呮惈鐢箖姊绘繝搴′簻婵炶绠戠叅闁哄诞鍕槑闂傚倸鍊风粈渚�骞栭锔藉創婵炲棙鎸哥粈鍐煟閹伴潧澧柣锔界矒濮婄粯绗熼敓钘夘焽瑜旈幃褔宕卞銏＄☉铻栧ù锝囨嚀瀵潡鎮峰鍕叆妞ゎ偄绻戠换婵嗩潩椤掑偆妲规俊鐐�栭崝鎴﹀春閸曨剙顕遍柛鎰靛枟閸婄敻鎮峰▎蹇擃仾缂侊拷閸愵喗鐓曢柕濠忕畱椤曟粌菐閸パ嶈含闁硅櫕绮撳Λ鍐ㄢ槈濮樿京宓侀梻浣筋嚙閸戠晫绱為崱娑樼婵炲棙鎸惧畵浣猴拷骞垮劚椤︿即鍩涢幋锔藉仯闁搞儜鍐獓闂佸湱娅㈢紞渚�寮婚埄鍐╁閻熸瑥瀚敓鑺ュ姍閺屽秹濡烽婊呮殼閻庤娲滈崢褔鍩為幋锕�鐐婇柕濞у嫷娼犲┑鐘垫暩婵兘寮崨濠冨弿闁绘垵顫曢敓钘夊�块幐濠冪珶閳哄绉�规洏鍔戝鍫曞箣閻欏懐骞㈤梻鍌欐祰椤鐣峰锟介、姘愁槾缂侇喖顭烽、娑㈡倷鐎电寮抽梻浣虹帛濞叉牠宕愰崷顓ㄦ嫹濮樼偓瀚�? by changhao			
				if (liveskill == null)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.SkillLevelNotEnough));
					return true;					
				}
				
				int skilllevel = liveskill.getLevel();
				
				int needlevel = LiveSkillManager.getInstance().GetMakeStuffNeedLevelByItemId(config);
				
				if (skilllevel < needlevel)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.SkillLevelNotEnough));
					return true;						
				}
							
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(roleid, skillid, 
						needlevel,"闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氱紓鍌氬�烽懗鑸垫叏闁垮绠鹃柨鐔剁矙閺屸�崇暆閿熶粙宕伴弽褏鏆︽繝濠傛－濡查箖鏌ｉ姀鈺佺仭闁烩晩鍨跺璇测槈濞嗘垹鐦堥梺鍛婁緱閸橀箖宕㈤锔解拺闂侇偅绋撻埞鎺楁煕閺傝法鐒烽柣蹇斿浮濮婃椽宕烽褏鍔稿┑鐐差嚟閸忔ɑ淇婇幘顔肩疀妞ゆ柨澧介敍婵囩箾鏉堝墽鍒伴柟纰卞亝閻楀孩绻濋悽闈浶為柛銊︽そ閳ワ箓宕奸妷锕�锟藉爼鏌涢幇闈涙灍闁抽攱鍨块弻鐔虹矙閹稿孩宕崇紓浣哄У閹瑰洭寮婚悢鐓庣闁哄被鍎卞浼存倵濞堝灝鏋熼柟顔煎�规穱濠囨嚋闂堟稓绐為柣搴秵閸撴瑩鐛幇顑芥斀闁绘劘鍩栬ぐ褏绱掗幓鎺撳仴闁炽儻绠撳畷濂稿Ψ椤旇姤娅嗘俊鐐�栭幐鍫曞垂濞差亝鍋傛繛鎴欏灪閸婂爼鏌ｉ幇閭︽澓闁搞倖鐟ラ埞鎴︻敊閻撳函鎷烽崸妤�钃熼柣鏃傗拡閺佸﹪鏌涘┑鍡楊伒闁瑰嘲鍢查埞鎴﹀幢濞嗘劖顔曢梻浣告贡閸庛倝宕归悢鑲猴綁宕奸悢绋垮伎濠德板�ч幏閿嬩繆椤愶絾鈷掓俊鍙夊姍閺佹捇鏁撻敓锟�", YYLoggerTuJingEnum.tujing_Value_liveskillcost, false);
				
				if (energyenough == false) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈嗐亜椤撶姴鍘寸�殿喖顭烽弫鎰緞婵犲嫮鏉告俊鐐�栫敮濠囨倿閿曞倸纾块柟鍓х帛閳锋垿鏌熼懖鈺佷粶濠碘�炽偢閺屾稒绻濋崒娑樹淮閻庢鍠栭…鐑藉极閹邦厼绶炲┑鐘插缂嶅倿姊绘担铏瑰笡闁挎岸鏌涢悢閿嬪仴鐎殿喗濞婂畷濂稿Ψ閿旇瀚肩紓鍌欑椤戝棝顢栧▎鎾崇？闊洦鏌ｆ禍婊堟煙鐎涙绠ユ俊顖ゆ嫹闁诲孩顔栭崰鏍�﹂柨瀣╃箚闁归棿绀侀悡娑㈡煕鐏炲墽鐓紒銊ょ矙濮婄粯鎷呮笟顖滃姼闂佸搫鐗滈崜娑氬垝濞嗘挸绠ｉ柨鏃傜帛閺呮粓姊虹捄銊ユ珢闁瑰嚖鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻鐔虹磼閵忕姵鐏嶉梺绋块椤︻垶鈥﹂崸妤佸殝闂傚牊绋戦～宀�绱撴担鍝勭彙闁搞儯鍔庨崢閬嶆⒑閸濆嫮袪闁稿﹥娲橀弲鍫曞蓟閵夛箑锟藉灚鎱ㄥ鍡楀缂佸妞介弻鈥崇暆閿熶粙宕伴弽褏鏆︽繝濠傛－濡查箖鏌ｉ姀鈺佺仭闁烩晩鍨跺璇测槈濞嗘垹鐦堥梺绋挎湰缁嬫垶绂掗幘顔解拺闁告繂瀚～锕傛煕閺冿拷閸ㄧ敻顢氶敐澶婄妞ゆ棁妫勯敓鐣屽厴閹綊宕堕崶褍顏╂い蹇撶埣濮婃椽宕ㄦ繝鍕ㄦ濡炪値鍙庨崜鐔奉嚕閵婏箑顕遍悗娑櫱氶幏濠氭⒑缁嬫寧婀伴柣鐔村姂瀹曟鐣濋敓鐣屾閹烘鏁嬮柛娑卞幘娴犳悂鎮楀▓鍨灈妞ゎ參鏀辨穱濠囧箹娴ｅ摜鍘告繛杈剧到瑜般劑寮撮姀锛勫幗闁瑰吋鎯岄崹宕囩矓閻㈠憡鐓曢柣妯诲墯濞堟粎锟借娲橀崹鍨暦閹烘鍊烽悗鐢殿焾楠炴劙姊绘担瑙勫仩闁稿寒鍨跺畷鏇㈡焼瀹ュ棗锟借埖銇勮箛鎾跺闁绘挾鍠栭弻鐔煎箚瑜嶉懜褰掓煕閺冩挾鐣甸柡灞革拷宕囨殕閻庯綆鍓涜ⅵ闁诲孩顔栭崰妤呭箰閹惰棄绠栨繛鍡樺灦鐎氭氨鎲告惔锝忔嫹濮橆剛绉洪柡灞剧洴閺佸倻鎷犻幓鎺嶇礋闂備胶鎳撻崲鏌ュ床閺屻儻缍栨繝闈涱儐閸婇攱銇勯幒鐐村濡炪倕楠忛幏锟�? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.EnergyNotEnough));
					return true;						
				}
				
				int added = BagUtil.addItem(roleid, itemid, itemnum, LiveSkillManager.MakeStuff, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_zhizuofu, 1, true);
				
				if (itemnum != added)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.UnkownError));
					return false;						
				}
				
				SLiveSkillMakeStuff msg = new SLiveSkillMakeStuff();
				msg.ret = 0;
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);
				
				return true;
			}
			
		};
		livemakstuff.submit();	
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800517;

	public int getType() {
		return 800517;
	}

	public int itemid; // 物品的ID by changhao
	public int itemnum; // 物品数量 by changhao

	public CLiveSkillMakeStuff() {
	}

	public CLiveSkillMakeStuff(int _itemid_, int _itemnum_) {
		this.itemid = _itemid_;
		this.itemnum = _itemnum_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(itemid);
		_os_.marshal(itemnum);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		itemid = _os_.unmarshal_int();
		itemnum = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLiveSkillMakeStuff) {
			CLiveSkillMakeStuff _o_ = (CLiveSkillMakeStuff)_o1_;
			if (itemid != _o_.itemid) return false;
			if (itemnum != _o_.itemnum) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += itemid;
		_h_ += itemnum;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(itemid).append(",");
		_sb_.append(itemnum).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CLiveSkillMakeStuff _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = itemid - _o_.itemid;
		if (0 != _c_) return _c_;
		_c_ = itemnum - _o_.itemnum;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

