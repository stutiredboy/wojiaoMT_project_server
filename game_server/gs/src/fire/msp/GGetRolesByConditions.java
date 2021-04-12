
package fire.msp;

import java.util.HashSet;
import java.util.Set;

import fire.pb.scene.Scene;
import fire.pb.scene.SceneClient;
import fire.pb.scene.SceneManager;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GGetRolesByConditions__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GGetRolesByConditions extends __GGetRolesByConditions__ {
	@Override
	protected void process() {
		Set<Long> sendroleIds = new HashSet<Long>(); 
		int rolenum = 0;
		if(limitnum == -1)
			limitnum = Integer.MAX_VALUE;
		if(sceneid != -1)
		{//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍讲鏋欓梺缁樺笩婵倗鎹㈠☉銏犲耿婵☆垵顕х喊宥夋煟閻斿摜鎳曠紒鐘虫崌楠炲啫螖閸涱喗娅滈柟鑲╄ˉ閸撴繈鎮樺澶嬧拺闁告繂瀚刊鐓幟瑰搴濈盎妞ゎ偄绻掔槐鎺懳熺拠宸拷鎾绘⒑閸涘﹦鈽夐柨鏇樺�濆鎶藉醇閵夛妇鍙冮梺鍛婂姦閸犳洟骞夋ィ鍐╃厸鐎癸拷鐎ｎ剛袦闂佺硶鏂侀崜婵堟崲濠靛纾兼繝濠忔嫹婵℃鎹囧缁樻媴閾忕懓绗℃繛鎾寸椤ㄥ﹤鐣烽幎鑺ユ櫜濠㈣泛鑻粊锕傛⒑閹肩偛鍔撮柛鎿勭畵瀵偊宕堕浣哄幗闂佸綊鍋婇崰妤呭汲閳哄懏鐓熸繛鎴濆船閺嬫盯鏌嶇憴鍕伌闁诡喒鏅犲畷褰掝敃閿濆棛妲戞繝鐢靛У椤旀牠宕板Δ鍛闁告劘灏欓弳锔姐亜閺嶃劎鈽夋い鏇憾閹鈽夊▍顓т邯瀹曟粓顢橀悢铏圭槇闂佹眹鍨藉褎鐗庣紓浣哄亾濠㈡绮旇ぐ鎺戞槬婵炴垯鍨圭粻锝夋煥閺冨倹娅曢柛妯哄船閳规垿鎮╃紒妯婚敪濠碘槅鍋呴〃濠囥�侀弮鍫晜闁告洏鍔嶉弬锟芥俊鐐�栭悧妤呭传鎼淬劌纾婚柕蹇嬪�栭悡娑㈡倶閻愭彃鈷旀繛鍙夋綑閳规垿鍩勯崘鈺侊拷鎰版煛娴ｇ鏆ｉ柡浣规尰缁傛帞锟斤綆浜為崢娲⒑閸濆嫭宸濆┑顖涙尦楠炲繑顦版惔銏犳瀭闂佸憡娲﹂崜娑⑺囬妸鈺傜厽闁靛繆鏅涢悘娆撴煕閹惧绠栫紒宀冮哺缁绘繈宕惰椤旀劖绻涙潏鍓хК闁稿﹣绮欐俊鎼佹晜鏉炴壆鐩庨梻浣告惈閸婃悂鎮樺┑瀣畺闁瑰鍋戞禍婊堟煙閸喖顏悗姘炬嫹?
			Scene scene = SceneManager.getInstance().getSceneByID(sceneid);
			if (scene == null)
			{
				SceneManager.logger.error("GGetRolesByConditions:sceneid error[" + sceneid + "]");
				return;
			}
			
			for(Role role : scene.getSceneRoles().values())
			{
				if(schoolid != -1 && role.getSchoolId() != schoolid)
					continue;
				if(minlevel != -1 && role.getLevel() < minlevel)
					continue;
				if(maxlevel != -1 && role.getLevel() > maxlevel)
					continue;
				sendroleIds.add(role.getRoleID());
				rolenum++;
				if(rolenum >= limitnum)
					break;
			}
		}
		else if(schoolid != -1)
		{//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撴い鏇嫹闁轰焦鎹囧顒勫Χ閸モ晜娈奸柣搴ゎ潐濞叉牠濡堕崨濠佺箚濡炲鍑介幏鐑芥晲鎼存繄鍑归梺鍝ュУ钃卞ǎ鍥э躬椤㈡洟濮�閻樿櫕顔勯梻鍌氭搐椤︾敻寮昏缁犳盯鏁愰崨顒傛晼婵犵數鍋炶ぐ鍐偤閵娾晛桅闁告洦鍨伴～鍛存煃閽樺顥為柣銈勭窔濮婄儤娼幍顔煎闂佸湱鎳撳ú顓㈢嵁閸愵喖绀堢憸灞解柦椤忓牊鐓㈡俊顖欒濡叉椽鏌＄仦鐔锋处閳锋帡鏌涚仦鎹愬闁跨喍绮欓ˉ鎾跺垝閸喓鐟归柨鐔剁矙閻涱喗寰勯幇顓熸闂佺粯顭堢亸娆擃敊閸ヮ剚鈷戠紒顖涙礀婢ц尙绱掔�ｎ偄鐏╃紒顔肩墦瀹曟﹢顢欓悾灞藉妇濠电姷鏁搁崑娑㈡倶濠靛鏅搁柤鎭掑劤婢х數锟借娲樺姗�锝炲┑瀣殝缁剧増蓱鐎氬ジ姊洪懡銈呅㈡繛灞傚�曢锝夊醇閺囩偟顔夐梺鎸庣箓濡孩绂嶅鍫熺叆婵犻潧妫濋妤佺箾閸涱厾校妞ゃ劊鍎甸幃娆撴嚑椤掑偆鍟嬮梻浣芥〃閻掞箓骞戦崶顒�鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘?
			Set<Long> schoolroles = RoleManager.getInstance().getSchoolRoles(schoolid);
			for(long sroleId :  schoolroles)
			{
				Role role = RoleManager.getInstance().getRoleByID(sroleId);
				if(minlevel != -1 && role.getLevel() < minlevel)
					continue;
				if(maxlevel != -1 && role.getLevel() > maxlevel)
					continue;
				sendroleIds.add(sroleId);
				rolenum++;
				if(rolenum >= limitnum)
					break;
			}
		}
		else
		{//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾椤懘鏌嶉妷銉ユ毐缂併劊鍎靛缁樻媴缁嬫妫岄梺绋款儎缁舵艾鐣烽弴鐔哥秶闁冲搫鍟伴悞鍏肩節閵忥絽鐓愰柛鏃�鐗犻幃鈥斥枎閹炬潙锟界敻鏌ｉ姀鈽嗗晱闁绘帗鍎抽湁闁绘ɑ鐟ョ�氥劍绂嶅鍫熺厓闁告繂瀚敓钘夘煼瀹曪綁鏁撴禒瀣拺闁告繂瀚﹢浼存煟閳哄﹤鐏﹂柕鍡曠窔瀵挳濮�閳╁啯鐝抽梻浣虹《閸撴繈鎮烽姣硷綁顢楅崟顑芥嫽婵炶揪绲肩拃锕傛倿妤ｅ啯鍋犳慨妯煎帶娴滄壆锟借娲樼换鍫ョ嵁鐎ｎ喗鏅濋柨鐔剁矙閹锋垿鎮㈤崫銉ь啎闂佺懓鐡ㄩ悷銉╂倶閳哄懏鐓熼柟鐑樻尰閵囨繈鏌＄仦鍓ф创妤犵偛娲俊鎼佹晜閻ｅ苯绲垮┑鐘垫暩閸嬫盯鎮ч崟顖氱９婵°倕鍟～鏇㈡煙閹呮憼濠殿垱鎸抽弻娑樷攽閸℃褰呴梺鎸庣箓椤︿即鎮￠悢闀愮箚闁靛牆瀚拹鐗堢箾閸噦鑰块柡宀�鍠栭悰顕�宕归鍙ユ偅闂備礁鐤囬～澶愬垂閸喚鏆﹂柛顐ｆ礀閻撴盯鏌涢幇顓炲姢闁哄拋鍙冨濠氬磼濞嗘埈妲繝銏㈡嚀閿曨亪骞冮敓鐘查唶闁靛鍎靛Λ宄邦渻閵堝棛澧遍柛瀣〒缁顢涘鎰闁荤喐婢橀顏堟倵濮橆剛澧︾�殿噮鍣ｅ畷鐓庘攽閸℃瑧宕哄┑锛勫亼閸婃牕螞閸愩剮娑㈠垂椤斻儻缍侀獮鍥偋閸碍瀚藉┑鐐舵彧缁插潡宕曢妶澶婂惞闁跨喕妫勯—鍐Χ閸℃ê顦╅梺鍛娒肩划娆撶嵁閸儱惟闁靛／鍕杺闂備礁缍婇弨鍗烆潖瑜版帗鍎庢い鏍仜閺嬩線鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓?
			for(Role role : RoleManager.getInstance().getRoles().values())
			{
				if(minlevel != -1 && role.getLevel() < minlevel)
					continue;
				if(maxlevel != -1 && role.getLevel() > maxlevel)
					continue;
				sendroleIds.add(role.getRoleID());
				rolenum++;
				if(rolenum >= limitnum)
					break;
			}
		}
		
		MGetRolesByConditions snd = new MGetRolesByConditions();
		snd.callbackid = callbackid;
		snd.roleids.addAll(sendroleIds);
		SceneClient.pSend(snd);
	}
	
//	public static void getRolesByConditions(int schoolId, int minlevel, int maxlevel, long sceneId, int limitnum, IGetRolesCallBack callback) 
//	{
//		if(Transaction.current() != null)
//			new PGetRolesByConditions(schoolId, minlevel, maxlevel, sceneId, limitnum, callback).call();
//		else
//			new PGetRolesByConditions(schoolId, minlevel, maxlevel, sceneId, limitnum, callback).submit();
//	}
//	
//	static class PGetRolesByConditions extends xdb.Procedure
//	{
//		private IGetRolesCallBack callback2; // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹閸濄儳涓嶉柡宥庡幗閻撴洘銇勯幇鍓佺ɑ缂侊拷閿熺晫绱掗悙顒�鍔ゆ繛纭风節瀵鎮㈤悡搴ｇ暰闂佺粯顨呴悧婊兾涢崟顓犵＜闁绘劦鍓欓崝銈嗐亜椤撶姴鍘寸�殿喖顭烽弫鎰板川閸屾粌鏋涢柟铏墵閸┾剝鎷呮笟顖氫还闂傚倸鍊烽懗鍫曗�﹂崼鐕佹闁告縿鍎抽惌鎾舵喐閻楀牆绗掗柦鍐枛閺屻劌鈹戦崱鈺傂︾紓浣哄缂嶄線寮婚敐鍛傜喖骞愭惔锝呮锭婵犵數鍋涢悧鐐哄箯閿燂拷
//		private int schoolid2; // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉〒姘攻鐎氳绻濋姀锝嗙【闁活厼顦甸獮蹇涙倻閻ｅ苯绁﹂梺鍓茬厛閸犳牗鎱ㄦ惔銊︹拺閻犲洠锟藉磭浠梺鍦焾椤兘鐛崱娑樼睄闁割偅鎯婇埡鍛叆闁哄浂浜濈�氬綊姊洪崨濠冨碍婵狅拷鏉堚晜顫曢柟鎯х摠婵挳鏌涢幘鏉戠祷闁告搩鍙冨铏圭矙閸栤剝鏁剧紓浣筋嚙閸婂潡鏁愰悙鍓佺杸闁瑰彞鐒﹀浠嬨�侀弮鍫濈妞ゆ挆鍐╂毆闂傚倷鑳堕、濠冪珶閸儱绠垫い蹇撴缁躲倝鏌涘┑鍡楃弸闁挎繂顦柋鍥煏婢舵稖鍚傞柟閿嬫そ濮婅櫣绮欑捄銊ь唶闂佸憡鑹鹃澶嬩繆閻㈠憡鍋勯柛蹇氬亹閸橀亶姊洪棃娑辩劸闁稿孩濞婂畷娲晲閸涱亝鏂�闂佹枼鏅涢崯顖滀焊閿旀拝鎷风憴鍕８闁告梹鍨垮濠氬炊椤掍焦娅嗛柣鐔哥懕缁查箖鎮楅幖浣光拻濞达絿鐡旈崵娆撴倵濞戞帗娅婃い銏＄懇瀵粙顢橀悙鐢靛炊婵犳鍠楅敋闁诲繐鐗撻弫鎾诲棘閵堝洨鏆ら悗瑙勬礀閵堝憡淇婇悜鏂ょ稏妞ゆ棁妫勯鍫曟⒑閹稿孩绀�闁稿﹤鎲￠崕顐︽⒒娴ｅ摜鏋冩俊妞煎姂閹虫宕奸弴锟介崶顒�绾ф繛鍡欏亾鐎靛矂姊洪棃娑氬婵☆偅顨堢划顓㈠箳濡や胶鍙嗛梺鍝勬储閸斿鏌囬鐐寸厵妞ゆ棁濮ょ欢鍙夈亜椤撴粌濮傜�规洖銈搁幃銏ゅ矗婢跺浼滈梻鍌氬�烽懗鍫曗�﹂崼銉ュ珘妞ゆ帒瀚崵灞轿旈敐鍛殲闁哄懏鎮傞弻锕�螣娓氼垱效闂佺懓寮堕幃鍌炲蓟閵娾晜鍋勯悹鍥ㄧ暙閹剧粯鐓曢柟瀛樼箘缁夎櫣锟借娲╃紞浣哥暦濮楋拷婵℃瓕顦虫繛鍫熷劤閳规垿鎮╃紒妯婚敪濡炪倖鍨甸幊妯虹暦閿熺姴绠柤鎭掑劤閸橆亪妫呴銏″婵炲弶鐗楅悧搴㈢節绾版﹫鎷烽搹顐熸灆闂佸憡鎸婚悷鈺呭春閻愬搫绠ｉ柣鎰皺閻ゅ洭姊绘担渚劸闁挎洏鍎甸獮鎴﹀炊椤掞拷缁犵姵淇婇妶鍛櫣缂侊拷閸緷褰掓晲閸喆锟藉啰绱掑Δ锟介ˇ闈涱潖閾忚宕夐柕濞垮劜閻濄垽姊洪悷鏉挎闁瑰嚖鎷�?-1
//		private int minlevel2; // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀崣澶樻▊闂佺粯甯掗敃顏堝蓟閺囩喓绠鹃柣鎰靛墯閻濇梻绱撴担鍝勵�岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰绠绘鐐村灴婵拷闁靛牆鎳愰悿锟芥俊鐐�栧Λ浣肝涢崟顒佸劅濠电姴娲﹂埛鎴犳喐閻楀牆绗掑ù婊�鍗抽弻娑㈡偐閹颁焦鐣堕梺浼欑悼閸忔ê顕ｆ繝姘ㄩ柨鏃�鍎抽獮宥夋⒒娴ｈ櫣甯涢柛銊ョ埣閺佸啴鍩℃担鍙夌亖闂佸搫娲㈤崹娲偂閺囥垺鍊甸柨婵嗗暙婵″ジ鏌ㄩ悢璇残撶紒璇茬墕椤曪絾绻濆顓炰簻闂佺粯鑹鹃悺銊э拷姘秺閺岋綁濮�閳藉棗鏅遍梺缁樺浮缁犳牕鐣烽婊呯煓閹煎瓨鎸婚弬锟介梻浣哥枃濡嫬螞濡や胶顩插ù鐘差儐閻撴洟鏌曟繝蹇曠暠闁崇粯娲橀〃銉╂倷瀹割喗楔缂備緡鍠楅悷锕傚箚閺冨牆绠婚悗娑櫳戝鎴︽⒒閸屾瑧顦﹀鐟帮躬瀹曟垿宕卞☉姗�妫烽梺闈涱槶閸庢椽鎮炴禒瀣厽闁哄倽娉曞▓閬嶆煛閿熻姤绂掔�ｎ偆鍘藉┑鈽嗗灥閸嬫劗鏁☉娆戠闁瑰啿鍢茬�氼喚绮绘ィ鍐╁仯闁搞儱娲ら幊蹇涘磻瑜斿娲偡閹殿喚鏆涢梺鎼炲姀濡嫰鎮鹃悜钘夌闁绘劏鏅滈～宥呪攽閻愬弶顥為柛銊ф暬閻涱噣宕奸妷锔规嫼闁荤姴娲╃亸娆戠不閹惰姤鐓曢悗锝庡亞閳句線鏌￠崨鏉跨厫缂佸倹甯為敓鏂ょ秵閿熺瓔鍘归崕鐢稿蓟閻斿吋鍊绘俊顖滃劋椤斿懘姊洪懡銈呮灈闁稿锕幃锟犲Ψ閳轰胶顔愰柡澶婄墕婢х晫澹曢崹顔氬綊鎮╅搹顐拷鎰叏婵犲啯銇濈�规洦鍋婂畷鐔碱敇閻樻彃蝎缂傚倸鍊烽懗鍓佸垝椤栨粍宕查柛宀�鍋為崑鈺冿拷鐟板閸嬪﹤顭囬妸鈺傜叆闁绘柨澧庨惌娆撴煏閸℃洜绐旂�殿噮鍣ｅ畷鐓庘攽閸偅效闂傚倷绶氬褔鈥﹂鐔剁箚闁搞儺鍓氶弲鎼佹煟閿濆懓瀚版い锝堝亹缁辨帞绱掑Ο鑲╃暭闂佸摜濮撮敃銉ヮ嚗閸曨偆鏆嗛柨鐔剁矙閺佸秹鎮㈤崗灏栨嫼缂備礁顑嗛娆撳磿閹扮増鐓欓柛娑橈攻閸婃劙鏌嶉妷锔筋棃鐎规洘锕㈤、娆撴寠婢跺本顎嶆繝鐢靛О閸ㄧ厧鈻斿☉銏犲珘妞ゆ帪鎷烽柍缁樻崌楠炲棜顦柡锟介懞銉ｄ簻闁哄啫鍊婚幗鍌炴煟閹烘挸鍔ゆい顏勫暟閿熶粙娼ф竟濠囨倿妤ｅ啯鐓熼柨婵嗩槹閺佽京锟藉灚婢樼�氫即鐛崶顒夋晣闁绘ɑ褰冪粻鍝勨攽閻樻剚鍟忛柛鐘愁殜閺佸啴鍩￠崨顓狀槶闂佹寧娲栭崐鎼佸触瑜版帗鐓熼柡鍐ㄦ处椤忕姷鐥幆褋鍋㈤柟顔筋殜閺佹劙宕煎┑鍫濆缚闂佽瀛╅悢顒勫箯閿燂拷-1
//		private int maxlevel2; // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀崣澶樻▊闂佺粯甯掗敃顏堝蓟閺囩喓绠鹃柣鎰靛墯閻濇梻绱撴担鍝勵�岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉骞夐幖浣瑰亱闁割偅绻勯悷鏌ユ⒑缁嬫鍎忔い锔炬暬瀵寮撮敍鍕澑闁诲函缍嗘禍鐑藉箯閻戣棄鍗抽柣鎴濇閺呯姴鈹戦悩缁樻锭婵炲眰鍨虹粋宥咁煥閸喓鍘搁悗骞垮劚閸燁偅淇婇崸妤佺厓闁告瑣鍎崇粣鏃堟煛鐏炲墽鈾侀柟顖涙椤㈡瑩鎳栭埡锟介崠鏍磽閸屾瑦绁板瀛樻倐楠炴垿宕惰閺嗭箓鏌熼悜妯虹亶闁哄閰ｉ弻鐔兼倻濡櫣浠撮柣銏╁灱閸ㄨ泛顫忛搹瑙勫珰闁圭粯甯╅崝澶愭⒑閼测晜鍤�濠⒀傜矙楠炴垿濮�閵堝懐鐤�闂備緡鍙忛梽鍕疾閿濆棛绡�闂傚牊绋戦敓钘夘煼閳ワ箓宕奸妷锕�锟藉嘲鈹戦悩鍙夊闁绘挸鍟撮弻娑樷攽閸℃浼掗梺鐚存嫹濠电姵鑹鹃悿顔剧磼鐎ｎ亞姘ㄩ柡锟芥禒瀣厽婵☆垵娅ｆ禒娑㈡煛閸″繑娅呴柍瑙勫灴椤㈡瑩骞嗚楠炲姊洪棃娑欘棞闁稿﹤婀辩划瀣箳閺冩挻瀚归柨婵嗛娴滄繃绻涢崨顐㈢伈婵﹥妞介幊鐐哄Ψ閸愬彞閭挊婵囥亜閺嶎偄浠滄慨瑙勭叀濮婃椽顢楅敓鐣岀矓閻㈠憡鍋傞柕澶嗘櫆閻撶喖鏌￠崘銊ワ拷鑽ゆ暜濞戞瑣浜滈柕澶堝労濡茶櫣绱掓潏銊﹀碍妞ゆ挸銈稿畷顏堝礃椤撶偞鍎撳┑掳鍊楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垹绠婚悗闈涙啞閸掓盯姊虹拠鈥崇仩闁绘鎸搁悾鐑芥偄绾拌鲸鏅┑鐐村灦鐢锟芥俺鍋愮槐鎾诲磼濮橆剨鎷烽悜鑺ュ�块柨鏇炲�归弲婵嬫煃閸濆嫭鍣洪柛濠傛健閺岋綁鏁愰崨顖滀紘缂佺偓鍎抽崥瀣Φ閸曨垰鍗抽柣鎰綑濞咃綁姊虹拠鏌ョ崪闂傚嫬瀚版俊鐢稿礋椤栨凹娼婇梺鏂ユ櫅閸燁偆鍠婂澶嬧拺閻庡湱濯崵娆撴⒑鐢喚绉柣娑卞枛铻ｇ痪顓㈡敱鐎氬綊鏌ｉ姀鈽嗗晱闁绘帞鍋撻〃銉╂倷閼碱剙鈪靛┑顔硷功缁垶骞忛崨鏉戝窛濠电姴鎳愰、鍛存⒒娴ｄ警鐒剧紒銊︽そ瀹曟劙寮撮悩鎻掔柧濠电姷顣藉Σ鍛村垂娴兼潙瑙﹂悗锝庡枛缁�鍌涚節婵犲倸鎮╅柡鍐ㄧ墛閺呮煡鏌涘☉鍗炲箺婵炲牊鐓″铏圭磼濡钄奸梺绋挎唉鐏忔瑩骞戦姀鐘斀閻庯綆浜滈悗顓烆渻閵堝棗濮х紒韫矙濡嫬顓兼径瀣幗闁瑰吋鐣崹濠氬疮閺屻儲鐓欓柛鎴欏�栫�氾拷-1
//		private long sceneid2; // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亜顒㈡い鎰Г閹便劌顫滈崱妤�鈷掗梺缁樺笧閺咁偆妲愰幘瀛樺濠殿喗鍨奸崑鎰板箲閵忋倕骞㈡繛鎴炵懅閸橀亶姊洪棃娑辨▓闁哥姵鐗楅弲鍫曨敊閸撗勶紡闂佽鍨庨崟顐℃樊闂備礁鎼張顒�煤閻旈鏆﹂柣鎾崇岸閺�浠嬫煕閵夋垵瀚ぐ娲⒒閸屾瑧顦﹂柟纰卞亰椤㈡牠宕ㄩ婊呯厠闂佹眹鍨婚…鍫㈢不閻愮儤鐓忓┑鐐茬仢閸撳鏌￠崘鎸庡缂備胶绮换鍫濈暦濮楋拷椤㈡棃宕卞Ο娲诲晫闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮敓浠嬪箯濠靛绠瀣捣缁犳梹绻涢幋鐐嗘垿宕虫禒瀣厽妞ゆ挾鍠撻幊鍥煛瀹�锟介崰鎰焽韫囨柣鍋呴柛鎰ㄦ櫓閿熻棄绉瑰娲箹閻愯鎷烽弽顓炵闁哄稁鍘兼闂佸憡娲﹂崹浼村礃閿熻棄顪冮妶鍡楀Е婵狀澁鎷烽梺鍝勵樈閸欏啫顫忛搹瑙勫磯闁靛鍎查悘鍡椻攽閳藉棗浜滈悗姘嵆閻涱喗绻濋崶褏顔掗梺鍛婂灦濠㈡ê煤椤撶偟鏆﹂柣鎴犵摂閺佸洭鏌曟繝蹇曠暠妞ゅ繗娉涢埞鎴︽倷閼碱剙顣洪梺璇茬箲缁诲牆顕ｉ幖浣肝ч柛鈩冨姃缁ㄨ顪冮妶鍡樺暗闁稿鍠愰弲鍫曟晝閸屾稓鍘撻梺闈涱樈閸ㄦ娊鎮鹃棃娑掓斀闁斥晛鍟崐鎰版煕閳规儳澧查柟宄版噺缁楃喖顢涘ù鍫嗗啠鏀介柨娑樺娴滃ジ鏌涙繝鍐⒈闁轰緡鍣ｉ獮鎺懳旀担瑙勭彇婵＄偑鍊曠换鎰版偋婵犲洤纾绘俊顖濆吹缁★拷婵犵數濮撮崐缁樻櫠濞戙垺鐓冮梺鍨儏濞搭噣鏌＄仦鍓с�掑ù鐙呯畵楠炴垿骞囬澶嬵棨闂傚倷娴囧▔鏇㈠窗閺囩倣娑㈠礋椤栨氨顔戝┑鐘诧工閻楀﹪寮查幖浣圭厾闁诡厽甯掗崝姘舵煕閵堝骸澧撮柡灞剧☉閳诲氦绠涢幘瀛橆唲闂備椒绱徊浠嬪床閺屻儱鐓橀柟瀵稿閹风兘鏁愭惔婵堢泿閻庤鎸稿Λ婵嗩潖濞差亝顥堟繛鎴炴皑椤斿﹥绻濆▓鍨珝婵炰匠鍐ㄧカ婵＄偑鍊栫敮顏堝箯閻戣姤鐓冮悷娆忓閻忥附顨ラ悙璇ц含闁哄本绋掔换婵嬪礃閳轰胶锛撻梻浣侯攰濞呮洟銆冩繝鍌滄殾婵犲﹤瀚刊鎾级閻愭潙顥嬮柣鐔哥箞濮婄粯鎷呴懞銉с�婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�?-1
//		private int limitnum2; // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮诲☉妯锋斀闁告洦鍋勬慨鐑芥⒑閻熸澘妲婚柛銏＄叀閿濈偛鈹戠�ｎ偄浜楅柟鑹版彧缁辨洟鎯堥崟顖涚厽閹兼番鍊ゅ鎰箾閸欏鐒介柟骞垮灲瀹曠厧鈹戦幇顒侇吙闂備礁婀遍搹搴ㄥ窗閺嶎叏缍栭柛娑樼摠閻撶喐淇婇娑橆嚋闁绘繍浜為幃顕�鏁愰崨顏呮杸闂佺粯顭堢亸娆徫涢崟顖涚厸濠㈣泛锕ら惃锟犳煙妞嬪骸鍘存鐐搭焽缁辨帒螣閻戞鏆犻梻鍌欑婢瑰﹪宕戦崨顒兼椽寮介鐔蜂簵濠电娀娼ч鍡涙偂濞戙垺鐓曢柟閭﹀幖椤曟粓鎮楀顒傜Ш婵﹥妞藉Λ鍐ㄢ槈濞嗘劖鍊烽梺璇插閸戝綊宕瑰畷鍥у灊閻犲洦绁村Σ鍫ユ煏韫囨洖啸妞ゆ梹甯″娲传閸曞灚效闂佹悶鍔岄悥濂搞�侀弮鍫濈労闁告劦浜為惁鍫ユ⒑濮瑰洤鐏叉繛浣冲嫮顩锋繝濠傜墛閻撶喐淇婇妶蹇斿濠碘槅鍋呯换鍫ョ嵁閸愵喖唯闁挎棃绠栧顔剧磽娴ｅ壊鍎撻柛搴☆煼楠炴寮撮姀鈾�鎷洪梻鍌氱墛娓氭鎮炴ィ鍐╃厱閹兼惌鍠栭弸娑㈠础闁秵鐓曟い鎰╁�曢弸宥囩磼鐠囧弶顥為柕鍥у瀵粙濡歌閻撳倿鏌ｉ姀鈺佺仭闁烩晩鍨跺濠氭偄妞嬪孩娈濋梺鍝勵槼閸庡宕洪悙鐑樷拺閻庡湱濯鎰版煕閵娿儲鍋ョ�规洘妞芥俊鐑藉煛娴ｆ瓕锟藉灝鈹戦敍鍕粶濠⒀傜矙楠炴劖寰勯幇顓涙嫽婵炶揪绲肩拃锕傛倿妤ｅ啯鐓ラ柡鍥崝銈夋煙楠炲灝鐏茬�规洘甯￠幃婊堝炊閳哄啠妫ㄩ梻鍌氼煬閸嬪嫬煤閿曪拷椤繑绻濆銉嫹閸涘瓨鍊婚柤鎭掑劚閿熺晫鏁婚弻銊モ攽閸℃瑥鍤紓浣靛妺缁瑩寮婚敐澶娢ч煫鍥ㄦ煥椤忚泛鈹戦悩娈挎殰缂佽鲸娲熷畷鎴﹀箣閿曪拷绾惧綊鏌″搴′簼闁哄棙绮嶉妵鍕疀閹捐泛顣虹紓浣哄閸ㄥ爼寮婚敐澶婄闁挎繂鎲涢幘缁樼厽闁规崘娉涢弸娑㈡煛瀹�锟介崰鏍箖濞嗘搩鏁嗗ù锝堟閳诲繘姊绘担绛嬪殭缂佽鐗撳畷鏇㈡偨缁嬭儻鎽曢悗骞垮劚濞诧箓宕伴崱娑欑厱闁哄洢鍔屾禍鐐裁归悡搴ｇ劯婵﹦鍎ゅ顏堝箥椤旂厧顬夐梻浣告贡閹虫挸煤椤撶儐鍤曟い鎰剁畱缁犺崵绱撴担鑲℃垵鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�?-1
//		public PGetRolesByConditions(int schoolid, int minlevel, int maxlevel, long sceneid, int limitnum, IGetRolesCallBack callback)
//		{
//			this.callback2 = callback;
//			this.schoolid2 = schoolid;
//			this.minlevel2 = minlevel;
//			this.maxlevel2 = maxlevel;
//			this.sceneid2 = sceneid;
//			this.limitnum2 = limitnum;
//		}
//		@Override
//		protected boolean process()
//		{
//			if(callback2 == null)
//				return true;
//			xbean.GetRolesCallBackInst callbackbean = xbean.Pod.newGetRolesCallBackInst();
//			callbackbean.setCallback(callback2);
//			long callbackId =  xtable.Getrolescallback.insert(callbackbean);
//			GGetRolesByConditions getroles = new GGetRolesByConditions(callbackId, schoolid2, minlevel2, maxlevel2, sceneid2, limitnum2);
//			GsClient.sendToScene(getroles);
//			return true;
//		}
//		
//	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 720907;

	public int getType() {
		return 720907;
	}

	public long callbackid; // 回调Id
	public int schoolid; // 门派ID，如果无限制填-1
	public int minlevel; // 最小等级，如果无限制填-1
	public int maxlevel; // 最大等级，如果无限制填-1
	public long sceneid; // 场景ID，如果无限制填-1
	public int limitnum; // 限制个数，无限制填-1

	public GGetRolesByConditions() {
	}

	public GGetRolesByConditions(long _callbackid_, int _schoolid_, int _minlevel_, int _maxlevel_, long _sceneid_, int _limitnum_) {
		this.callbackid = _callbackid_;
		this.schoolid = _schoolid_;
		this.minlevel = _minlevel_;
		this.maxlevel = _maxlevel_;
		this.sceneid = _sceneid_;
		this.limitnum = _limitnum_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(callbackid);
		_os_.marshal(schoolid);
		_os_.marshal(minlevel);
		_os_.marshal(maxlevel);
		_os_.marshal(sceneid);
		_os_.marshal(limitnum);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		callbackid = _os_.unmarshal_long();
		schoolid = _os_.unmarshal_int();
		minlevel = _os_.unmarshal_int();
		maxlevel = _os_.unmarshal_int();
		sceneid = _os_.unmarshal_long();
		limitnum = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GGetRolesByConditions) {
			GGetRolesByConditions _o_ = (GGetRolesByConditions)_o1_;
			if (callbackid != _o_.callbackid) return false;
			if (schoolid != _o_.schoolid) return false;
			if (minlevel != _o_.minlevel) return false;
			if (maxlevel != _o_.maxlevel) return false;
			if (sceneid != _o_.sceneid) return false;
			if (limitnum != _o_.limitnum) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)callbackid;
		_h_ += schoolid;
		_h_ += minlevel;
		_h_ += maxlevel;
		_h_ += (int)sceneid;
		_h_ += limitnum;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(callbackid).append(",");
		_sb_.append(schoolid).append(",");
		_sb_.append(minlevel).append(",");
		_sb_.append(maxlevel).append(",");
		_sb_.append(sceneid).append(",");
		_sb_.append(limitnum).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GGetRolesByConditions _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(callbackid - _o_.callbackid);
		if (0 != _c_) return _c_;
		_c_ = schoolid - _o_.schoolid;
		if (0 != _c_) return _c_;
		_c_ = minlevel - _o_.minlevel;
		if (0 != _c_) return _c_;
		_c_ = maxlevel - _o_.maxlevel;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(sceneid - _o_.sceneid);
		if (0 != _c_) return _c_;
		_c_ = limitnum - _o_.limitnum;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

