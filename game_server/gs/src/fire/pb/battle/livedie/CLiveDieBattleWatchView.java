
package fire.pb.battle.livedie;

import fire.pb.PropRole;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
import gnet.link.Onlines;
import java.util.Map.Entry;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveDieBattleWatchView__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CLiveDieBattleWatchView extends __CLiveDieBattleWatchView__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				SLiveDieBattleWatchView sLiveDieBattleWatchView=new SLiveDieBattleWatchView();
				for(Entry<Long, Long> entry:LiveDieMange.liveDieFightRoleids.entrySet()){
					long oneid=entry.getKey();
					long otherid=entry.getValue();
					LDRoleInfoDes qCRoleInfoDes1 = createLDRoleInfoDes(oneid);
					LDRoleInfoDes qCRoleInfoDes2 = createLDRoleInfoDes(otherid);
					LDRoleInfoWatchDes lDRoleInfoWatchDes=new LDRoleInfoWatchDes();
					lDRoleInfoWatchDes.role1=qCRoleInfoDes1;
					lDRoleInfoWatchDes.role2=qCRoleInfoDes2;
					sLiveDieBattleWatchView.rolewatchlist.add(lDRoleInfoWatchDes);
				}
				Onlines.getInstance().send(roleid, sLiveDieBattleWatchView);
				return true;
			};
		}.submit();
		
	}
	
	/**
	 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞楅梻渚�娼х换鍫ュ春閸曨垱鍊块柛鎾楀懐锛滈梺褰掑亰閸欏骸鈻撳鍫熺厸鐎癸拷閿熶粙宕伴弽顓犲祦鐎广儱顦介弫濠勭棯閹峰矂鍝烘慨锝咁樀濮婄粯鎷呮笟顖滃姼濡炪倖鍨堕崹褰掑箲閵忕姭鏀介悗锝庝海閹芥洟姊洪崫鍕窛闁哥姴娴峰▎銏ゆ倷閻戞鍘遍梺鏂ユ櫅閸欐劙骞嬮敂钘変户闂佸搫鍟崐鑽ゅ婵傚憡鐓熼柟浼存涧婢ь噣鏌涢弬璇诧拷鏍崲濠靛鏅稿ù鐘差儐閻掕偐锟藉箍鍎遍幊鎰版偪閸涘瓨鈷戠憸鐗堝笚閿涚喖鏌ｉ幒鐐电暤鐎规洘鍨归敓鏂ょ秵閸犳鎮￠弴鐔翠簻闁规澘澧庨幃鑲╃磼閻樼鑰块柡宀嬬秮閹垽寮堕幋婵愭綆婵犳鍠栭敃銉ヮ渻娴犲宓侀柡宥庡幗閸婄兘鏌熺紒妯轰刊闁诲孩濞婂缁樻媴娓氼垳鍔搁梺鎸庢磸閸婃妲愰悙瀵哥瘈闁告剬鍛暰闂備焦鐪归崹濠氣�﹂崼銏㈢焼閻庯綆鍋佹禍婊堟煛瀹ュ啫濡介柣銊﹀灦閵囧嫰寮崠陇鍚┑顔硷攻濡炰粙骞冮悜钘夌妞ゆ棁濮ら崰鏍磽閸屾瑦顦风紒槌栧櫍楠炲繘鎮滈懞銉㈡嫼闂佸憡绺块崕鍗炵摥闂備焦瀵уú锔界濠婂牞缍栭煫鍥ㄦ媼濞差亶鏁傞柛鏇ㄥ墮缁佽埖淇婇悙顏勶拷鏍箰妤ｅ啫纾绘繛鎴欏灮瀹撲線鎮楅敐搴℃灍闁抽攱鍨块弻锝咁潩椤掑倹鎲奸柣搴㈣壘缂嶅﹤顫忕紒妯肩懝闁搞儜鍐炬交缂傚倷绀侀ˇ顖烆敋椤撶姴鍨濆┑鐘冲嚬閺佸秹鏌ｉ幇顒夊殶闁告ê宕埞鎴︽倷閺夋垹浠搁梺鑽ゅ櫐婵″洨妲愰悙鍝勭闁绘鏁搁敍婊堟⒑鐠恒劌鏋嶇紒顔界懃閻ｅ嘲顫滈敓浠嬨�佸▎鎾村仼閻忕偠妫勭粻娲⒒閸屾瑧绐旈柨鐔诲Г缁嬫垵鐣甸崱妯肩濞达絽鍟跨�氼厼鈻嶉悩缁樼厵婵炲牆鐏濋弸銈囩棯閸撗冨付妞ゎ叀娉曢幑鍕偖閺夋垳绱ｆ繝纰樺墲瑜板啴鈥﹂悜钘夎摕鐎广儱娲﹂崰鍡涙煕閺囥劌浜炲ù鐓庣焸濮婅櫣鎷犻垾铏亐闂佸搫鎳愭繛锟介柕鍡曠窔瀵挳濮�閳╁啯鐝抽梻浣告啞缁牏娆㈤妶澶婄闁汇値鍨抽悿锟藉┑鐐村灦閻熴垽骞忓ú顏呪拺闁告稑锕﹂埥澶愭煥閺囨ê鍔滅�垫澘瀚板畷鐔碱敍濞戞艾骞堟繝娈垮枟椤ㄦ劙骞忔搴ｇ＜闁绘ê纾晶鍨殽閻愭彃鏆ｉ柡浣规崌閹晠鎳犻濠勫簥闂傚倷鑳剁划顖炲礉濡ゅ啯鍋橀柕澶嗘櫅缁狀垱绻涘顔荤凹闁稿鍓濈换婵囩節閸屾稑娅ｅ銈忕到閵堟悂骞冩禒瀣垫晬婵°倓鐒﹂悵鏃堟煣閼姐倕浠遍柡宀�鍠撻敓鑺ョ♁椤洦淇婇崶顒佺厸闁跨喕濮ょ粋鎺旓拷锝庡亞閸樹粙姊洪悷鎵憼缂佽鍟鍕礋椤栨稑锟藉灚鎱ㄥ鍡楀缂佸鍎ら幈銊︾節閸曨厼绗￠梺鐟板槻閹虫﹢骞婇悙鍝勎ㄩ柨婵嗙箲鐎氬綊鏌涢幇鍏哥敖缁炬儳銈搁弻銊╂偄鐠囨畫鎾剁磼濡ゅ啫鏋涢柡浣规崌閹稿﹥寰勭仦鐐啎闂備礁婀辨晶妤�顭垮锟介弻銊╁Χ閸℃洜绠氶梺闈涚墕缁绘垹锟芥艾婀辩槐鎾存媴閸濆嫅锝嗙節閵忊槄鑰块柛鈺冨仱楠炲鏁傞挊澶夋睏闂備礁婀辩划顖滄暜濡わ拷閳绘捇顢橀悩鐢碉紳婵炶揪绲块…鍫ャ�傞幎鑺ョ厱閻庯綆鍋嗗ú鎾煕閳哄啫浠辨鐐差儔閺佸倿鎸婃径澶嬬潖闂傚倷绀佸﹢杈╁垝椤栨粍鏆滃┑鐘插婵娊鏌﹀Ο渚Т闁猴拷娴犲鐓冮柦妯侯槹椤ユ粌霉濠婂牏鐣洪柡宀�鍠栧畷娆撳Χ閸℃浼�
	 * @param id
	 * @return
	 */
	public LDRoleInfoDes createLDRoleInfoDes(long id){
		PropRole propRole = new PropRole(id, true);
		LDRoleInfoDes lDRoleInfoDes = new LDRoleInfoDes();
		lDRoleInfoDes.roleid=propRole.getRoleId();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞楅梻渚�娼х换鍫ュ春閸曨垱鍊块柛鎾楀懐锛滈梺褰掑亰閸欏骸鈻撳鍫熺厸鐎癸拷閿熶粙宕伴弽顓犲祦鐎广儱顦介弫濠勭棯閹峰矂鍝烘慨锝咁樀濮婄粯鎷呮笟顖滃姼濡炪倖鍨堕崹褰掑箲閵忕姭鏀介悗锝庝海閹芥洟姊洪棃娴ュ牓寮插☉姘卞暗鐎广儱顦伴悡鏇㈡倶閻愭彃鈷旈柣鎿冨灠椤法鎲撮崟顒傤槹濠殿喖锕ュ钘夌暦椤愶箑绀嬫い鎺戭槹閿涗胶绱撻崒娆戣窗闁哥姵顨婇獮鎴﹀炊瑜滈崵鏇炩攽閻樺磭顣查柡鍛絻椤法鎹勯悮瀛樻暰濡炪們鍎茬换鍫濐潖濞差亜鎹舵い鎾楀懎濮奸梺璇插缁嬪牓寮查悩鑼殾濞村吋娼欑粻娑㈡煟濡わ拷閻楀啴骞忛搹鍦＝闁稿本鐟ч崝宥嗐亜椤撶偞宸濈紒顔款嚙椤繈顢橀悩娈垮晭濠电姰鍨煎▔娑㈩敄閸ヮ灐娲箻椤旂晫鍘遍梺鍐叉惈閸燁偅绂掓潏顭戞闁绘劕妯婇崕鏃堟煛娴ｇ鏆ｉ柡浣规崌閹墽浠︾粵瀣棥闂備胶顭堢换鎰板触鐎ｎ喖鐭楅煫鍥ㄦ⒐閸欏繑淇婇妶鍜佸剱閻庢艾婀辩槐鎺旂磼閵忕姴绠洪梺璇″枛閸婃悂顢氶敐澶婄闁兼亽鍎插▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹
		lDRoleInfoDes.rolename=propRole.getName();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞楅梻渚�娼х换鍫ュ春閸曨垱鍊块柛鎾楀懐锛滈梺褰掑亰閸欏骸鈻撳鍫熺厸鐎癸拷閿熶粙宕伴弽顓犲祦鐎广儱顦介弫濠勭棯閹峰矂鍝烘慨锝咁樀濮婄粯鎷呮笟顖滃姼濡炪倖鍨堕崹褰掑箲閵忕姭鏀介悗锝庝海閹芥洟姊洪棃娴ュ牓寮插☉姘卞暗鐎广儱顦伴悡鏇㈡倶閻愭彃鈷旈柣鎿冨灠椤法鎲撮崟顒傤槹濠殿喖锕ュ钘夌暦椤愶箑绀嬫い鎺戭槹閿涗胶绱撻崒娆戣窗闁哥姵顨婇獮鎴﹀炊瑜滈崵鏇炩攽閻樺磭顣查柡鍛絻椤法鎹勯悮瀛樻暰濡炪們鍎茬换鍫濐潖濞差亜鎹舵い鎾楀懎濮奸梺璇插缁嬪牓寮查悩鑼殾濞村吋娼欑粻娑㈡煟濡わ拷閻楀啴骞忛搹鍦＝闁稿本鐟ч崝宥嗐亜椤撶偞宸濈紒顔款嚙椤繈顢橀悩娈垮晭濠电姰鍨煎▔娑㈩敄閸ヮ灐娲箻椤旂晫鍘遍梺鍐叉惈閸燁偅绂掓潏顭戞闁绘劕妯婇崕鏃堟煛娴ｇ锟藉潡骞愭繝鍐ㄧ窞濠㈣泛顑囧鏍⒒閸屾艾锟介绮堟笟锟介獮澶愭晸閻樺啿浠梺闈涱槴閺侊繝宕堕妸銉殼闂佸搫顦伴崹褰掓偩閸濆嫧鏀介柣鎰级椤ョ偤鏌熺粙娆剧吋闁诡噯绻濋幃銏ゅ礂閼测晛骞楅梻浣告惈閸婂湱锟界瑳鍥х疅闁归棿鐒﹂悡娆撴煣韫囷絽浜濈紒锟界�ｎ喗鐓涚�癸拷閿熶粙宕伴弽褏鏆︽繛鍡樻尭鍥撮梺绯曞墲椤ㄥ繑瀵奸敓锟�?
		lDRoleInfoDes.shape=propRole.getShape();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞楅梻渚�娼х换鍫ュ春閸曨垱鍊块柛鎾楀懐锛滈梺褰掑亰閸欏骸鈻撳鍫熺厸鐎癸拷閿熶粙宕伴弽顓犲祦鐎广儱顦介弫濠勭棯閹峰矂鍝烘慨锝咁樀濮婄粯鎷呮笟顖滃姼濡炪倖鍨堕崹褰掑箲閵忕姭鏀介悗锝庝海閹芥洟姊洪棃娴ュ牓寮插☉姘卞暗鐎广儱顦伴悡鏇㈡倶閻愭彃鈷旈柣鎿冨灠椤法鎲撮崟顒傤槹濠殿喖锕ュ钘夌暦椤愶箑绀嬫い鎺戭槹閿涗胶绱撻崒娆戣窗闁哥姵顨婇獮鎴﹀炊瑜滈崵鏇炩攽閻樺磭顣查柡鍛絻椤法鎹勯悮瀛樻暰濡炪們鍎茬换鍫濐潖濞差亜鎹舵い鎾楀懎濮奸梺璇插缁嬪牓寮查悩鑼殾濞村吋娼欑粻娑㈡煟濡わ拷閻楀啴骞忛搹鍦＝闁稿本鐟ч崝宥嗐亜椤撶偞宸濈紒顔款嚙椤繈顢橀悩娈垮晭濠电姰鍨煎▔娑㈩敄閸ヮ灐娲箻椤旂晫鍘遍梺鍐叉惈閸燁偅绂掓潏顭戞闁绘劕妯婇崕鏃堟煛娴ｇ锟藉潡骞愭繝鍐ㄧ窞濠㈣泛顑囧鏍⒒閸屾艾锟介绮堟笟锟介獮澶愭晸閻樺啿浠梺闈涱槴閺侊繝宕堕澶嬫櫖闂佺粯鍔曢悧鍡椕洪銏犳槬闁跨喓濮村婵囥亜閺冨浂娼愰悗姘冲亹缁辨捇宕掑顒婃嫹閻戣姤鍊块柨鏇炲�归弲顏嗙磽閸屾瑧鍔嶆い銊ユ閺侇喖螖閸涱厙锕傛煕閺囥劌鐏遍柡浣告喘閺岋絽螣鐠囪尙绁峰Δ鐘靛仜椤戝骞冨Δ锟介埢鎾诲垂椤旂晫浜俊鐐�ら崢楣冨礂濡警鍤曟い鎰剁畱缁犳盯鏌℃径濠勪虎缂佹劖鐩铏圭矙閹稿孩鎷辩紓渚囧枛閻倸顕ｇ粙搴撴婵鍋撶�氬綊鎮峰▎蹇擃仾缂侊拷閿熺晫绱撻崒姘毙㈤柨鏇ㄤ邯婵″瓨鎷呯化鏇熺�婚梺鍦亾濞兼瑩鏁撴禒瀣暠闁靛洤瀚伴獮鎺楀箣椤撶啘锕�鈹戦悙鑼闁搞劌鐏濋～蹇旂節濮橆剛锛滃┑顔斤供閸撱劑骞忓畡鎵殝闁瑰啿锕ょ紞濠傜暦閹偊妲烽梺鍝勵儐閻楃娀寮婚敓鐘茬倞闁靛鍎虫禒鑲╃磽娴ｇ懓濮堟い銊ワ躬瀵鎮㈤崗鐓庝罕闂佸壊鍋嗛崰鎾诲礄閿熺姵鈷戦柛娑橈工閻忊晛鈹戦鑺ュ唉闁糕晝鍋ら獮瀣晜閽樺姹楅梺璇查濠�杈ㄦ叏閹绢啟澶娾攽閸垻锛濇繛杈剧到閹碱偊顢撳畝鍕厱闁靛鍎抽崺锝囷拷娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�
		lDRoleInfoDes.level=propRole.getLevel();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞楅梻渚�娼х换鍫ュ春閸曨垱鍊块柛鎾楀懐锛滈梺褰掑亰閸欏骸鈻撳鍫熺厸鐎癸拷閿熶粙宕伴弽顓犲祦鐎广儱顦介弫濠勭棯閹峰矂鍝烘慨锝咁樀濮婄粯鎷呮笟顖滃姼濡炪倖鍨堕崹褰掑箲閵忕姭鏀介悗锝庝海閹芥洟姊洪棃娴ュ牓寮插☉姘卞暗鐎广儱顦伴悡鏇㈡倶閻愭彃鈷旈柣鎿冨灠椤法鎲撮崟顒傤槹濠殿喖锕ュ钘夌暦椤愶箑绀嬫い鎺戭槹閿涗胶绱撻崒娆戣窗闁哥姵顨婇獮鎴﹀炊瑜滈崵鏇炩攽閻樺磭顣查柡鍛絻椤法鎹勯悮瀛樻暰濡炪們鍎茬换鍫濐潖濞差亜鎹舵い鎾楀懎濮奸梺璇插缁嬪牓寮查悩鑼殾濞村吋娼欑粻娑㈡煟濡わ拷閻楀啴骞忛搹鍦＝闁稿本鐟ч崝宥嗐亜椤撶偞宸濈紒顔款嚙椤繈顢橀悩娈垮晭濠电姰鍨煎▔娑㈩敄閸ヮ灐娲箻椤旂晫鍘遍梺鍐叉惈閸燁偅绂掓潏顭戞闁绘劕妯婇崕鏃堟煛娴ｇ锟藉潡骞愭繝鍐ㄧ窞濠㈣泛顑囧鏍⒒閸屾艾锟介绮堟担闈╄�块弶鍫氭櫅閸ㄦ繃銇勯弽銊х煁闁哄棙绮撻弻宥夊传閸曨偓鎷烽幖渚囨晪闂侇剙绉甸悡銉╂煟閺冨倻甯涙い銉ヮ樀閺屽秶鎲撮崟顐や紝闂佽桨绀佺粔鐟扮暦閻旂⒈鏁冮柍鈺佸暙閻撴洟姊婚崒娆掑厡妞ゃ垹锕ら埢宥夊即閵忕姷顔夐梺鎼炲劀閸涱喗顔曟俊鐐�栭悧婊堝磻濞戙垺鐓ラ柕鍫濇缁诲棝鏌ｉ幇顓烆棆濞戞挻鐓￠弻鐔割槹鎼粹�冲箣闂佽桨绀侀崐鍧楀箖濞嗘搩鏁嗛柨鐔烘櫕婢规洟顢涢悙绮规嫼闂傚倸鐗婃笟妤呮偂椤撶姷纾奸柣妯哄暱閻忊晛顭跨憴鍕妞ゃ垺鐩幃娆戝垝鐟欏嫬顏归梻鍌欐祰椤曟牠宕规惔銊ュ窛妞ゆ牭绲介弫鐟扳攽閻樺灚鏆╁┑顖涙尦楠炲繘鎮滈懞銉㈡嫼濡炪倖甯幏椋庣磼婢跺鍤熺紒顔肩墛瀵板嫮锟斤絻鍔嬬花濠氭⒑閸濆嫮鈻夐柛瀣缁傛帡鏁冮崒娑氬帗闂備礁鐏濋鍛存倶閳哄啰纾奸弶鍫涘妽鐏忎即鏌熷畡鐗堝櫤闁逛究鍔戦獮瀣敇濠靛浠愰柣搴ゎ潐濞叉垿宕￠崘宸殨闁圭虎鍠栭～鍛存煥濞戞ê顏╂鐐茬Ч濮婄粯鎷呴崨濠傛殘闂佸壊鐓堥崹璺虹暦閹版澘鍐�妞ゆ劦鍓氱�氳鎱ㄥΟ鐓庝壕閻庢熬鎷�
		lDRoleInfoDes.school=propRole.getSchool();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈囩磽瀹ュ拑韬�殿喖顭烽幃銏ゅ礂鐏忔牗瀚介梺璇查叄濞佳勭珶婵犲伣锝夘敊閸撗咃紲闂佺粯鍔﹂崜娆撳礉閵堝洨纾界�广儱鎷戦煬顒傦拷娈垮枦椤曆囧煡婢舵劕顫呴柍鍝勫�瑰▍鍥⒒娴ｇ懓顕滅紒璇插�歌灋婵炴垟鎳為崶顒�唯鐟滃繒澹曢挊澶堬拷鎺戭潩椤掑﹥鏁鹃柣搴亢椤鎹㈠┑瀣潊闁挎繂妫涢妴鎰版⒑濞茶骞栨い锔炬暬閻涱喛绠涘☉娆忥拷濠氭煟閿濆懓瀚扮紒渚婄畵濮婃椽宕滈懠顒�甯ラ梺鍝ュУ閻楁骞堥妸锔藉劅闁靛鑵归幏娲煟閻樺弶绀岄柨鐔绘绾绢厽绂掗銏♀拺闁革富鍙庨悞鐐亜椤撶姴鍘撮柣娑卞櫍瀹曞崬鈽夊Ο鑲╂綁闂備礁澹婇崑鍛村箚婵犲洤鐓涢柛娑卞枤閸欏棝姊洪崫鍕殭婵炲眰鍊涢。鎸庝繆閻愵亜锟芥洜鎹㈤幒妤�绐楅柡宓本缍庣紓鍌欑劍钃卞┑顖涙尦閺屻倝骞侀幒鎴濆Б闂侀潧妫楅敃顏勵潖濞差亝顥堥柍鍝勫暟鑲栫紓鍌欒兌婵敻骞戦崶顒佸仒妞ゆ棁娉曢悿锟藉┑鐐村灦閻燂箑鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�
		Team team = TeamManager.selectTeamByRoleId(id);
		if(team!=null&&team.getTeamLeaderId()==id){
			lDRoleInfoDes.teamnum=team.getTeamInfo().getMembers().size()+1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈囩磽瀹ュ拑韬�殿喖顭烽幃銏ゅ礂鐏忔牗瀚介梺璇查叄濞佳勭珶婵犲伣锝夘敋閿熻棄顫忛崫鍕懷囧炊瑜濋幏鐑藉Χ婢跺﹦鐛ラ梺鍝勭▉閸樼晫绮婚幒妤佲拻濞达絼璀﹂悞鍓х磼缂佹ê濮嶇�规洏鍎抽敓鏂ょ秵閸撴稓绮堟繝鍥ㄧ厵閻庣數顭堝暩缂佺偓鍎抽妶鎼佸蓟閻斿吋鐒介柨鏇嫹鐎殿喚鍋撶换娑㈠醇閻曞倽锟藉潡鏌＄仦璇插闁诡喓鍨荤槐鎺戭潨閸℃﹩妫勭紓鍌氬�烽懗鑸垫叏鐎靛摜鐭撻柣鐔稿閺嗭箓鏌￠崶銉ョ仼缁绢叏鎷烽梻浣筋嚙缁绘帞鍒掗姘兼富濞寸姴顑呴弸渚�鏌涢幇闈涙灈缁炬儳銈搁弻銊╁棘閸喒鎸冮梺宕囶儠閸婃繂顫忕紒妯诲闁告稑锕ラ崕鎾斥攽閻愯尙婀撮柛銊ㄦ閻ｇ兘鎮烽幊濠冩そ椤㈡棃宕ㄩ婵堟殫闂傚倷鑳剁划顖炲蓟閵娾晛瑙﹂悗锝庡枟閸嬪倹绻涢崱妯诲鞍闁抽攱鍨堕妵鍕箻閸楃偛顬嬮梺浼欑秮娴滃爼寮婚敐鍫㈢杸闁靛／鍛呮粓姊洪崫鍕拱闁烩晩鍨堕妴渚�寮撮姀鈺傛櫇闂佹寧绋戠�氼喖鈻旈崸妤佲拻闁稿本纰嶉幖鎰亜閿旇棄顥嬮柟骞垮灩閳规垿宕堕埡鍐闂備胶顭堥張顒傚枈瀹ュ應鏋旈柛鎾茶兌绾捐棄霉閿濆懎顥忔俊鑼额潐娣囧﹪鎮欓幍顔剧厯閻庢鍠栭…鐑藉垂閹呮殾闁搞儯鍔嶉悾鐑芥⒒娴ｈ姤纭堕柛鐘茬Ф閸掓帒鈻庤箛鏇熸婵炴潙鍚嬪娆撳礃閿熻棄顪冮妶鍡樺暗濠殿喖顕划濠囨晝閸屾稈鎷虹紓渚囧灡濞叉牗鏅堕弻銉︾厱闁瑰濮甸崵锟介柛妤�宕埞鎴︽偐瀹曞浂鏆￠梺鎶芥敱閸ㄥ潡寮诲☉妯锋斀闁糕剝顨忔禒鎯ь渻閵堝啫鍔楅柨鐔诲Г閸撴艾銆掓繝姘�垫繛鎴烆伆閹达箑纾归柟閭﹀厴閺�浠嬫煥濞戞ê顏柡鍡╁墰閿熷�燁潐濞叉粓宕伴弽顓滐拷浣糕槈濡偞甯楅幏鍛村礃閸欏顦╅梺缁樻尰濞叉鎹㈠☉銏犵婵犻潧妫滈崺鐐烘⒑閸濆嫷鍎愮紒瀣笧閹广垹鈽夐姀鐘炽仢闂佸憡鍔︽禍鐐垛叺濠电姵顔栭崰鏍晝閵堝锟斤箑鐣￠幍顔芥闂佽鍨堕崑濠傤瀶閵娿儮鏀介柍鈺佸暙缁茬粯绻濋敓鑺ユ綇閳哄偆娼熼梺鍦劋濮婅崵澹曢崗闂寸箚妞ゆ牗绻傛禍褰掓煟閿濆牊顏犵紒杈ㄦ尰閹峰懘鎼归悷鎵偧缂傚倷娴囬褔鎮ч崱娑欏仼闁绘垼妫勭粻鎶芥煙鐎涙ɑ鈷愭い顐㈢Т閳规垿鍩ラ崱妤冧画濠碉紕鍋炵�笛呯矉閹烘鐓涢柛娑卞枓閹峰姊虹粙鎸庢拱闁荤啙鍥佸洭鏁冮崒娑氬幍闁荤姴娉ч崨顖滄闁诲孩顔栭崰鏍�﹂柨瀣╃箚闁归棿绀侀悡娑樷攽閻樻彃鏆炴繛鍛墕閳规垿鎮╅鑲╀紘闂佺硶鏅滈悧鐘茬暦濠靛鍗抽柕蹇婏拷宕囧絽闂備胶绮弻銊╁触鐎ｎ喗鍋傞柕澶嗘櫆閻撶喖鏌￠崒娑橆嚋闁诡垰鐗忛敓鑺ョ♁缁诲倽鐏冮梺缁橈耿濞佳勭婵傚憡鐓曢柕濠忛檮閵囨繂鈹戦敍鍕毈鐎规洜鍠栭、娑橆潩妲屾牕鏅梻浣藉吹婵儳鈻嶉敐澶婄？闁靛牆顦伴崐鐢告偣閸パ勨枙婵炴挸顭烽弻鏇㈠醇濠靛洤娈楅梺缁樼♁缁捇寮婚悢鐓庣闁靛牆妫楅锟�
			lDRoleInfoDes.teamnummax=TeamManager.MAX_MEMBER_COUNT+1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈囩磽瀹ュ拑韬�殿喖顭烽幃銏ゅ礂鐏忔牗瀚介梺璇查叄濞佳勭珶婵犲伣锝夘敋閿熻棄顫忛崫鍕懷囧炊瑜濋幏鐑藉Χ婢跺﹦鐛ラ梺鍝勭▉閸樼晫绮婚幒妤佲拻濞达絼璀﹂悞鍓х磼缂佹ê濮嶇�规洏鍎抽敓鏂ょ秵閸撴稓绮堟繝鍥ㄧ厵閻庣數顭堝暩缂佺偓鍎抽妶鎼佸蓟閻斿吋鐒介柨鏇嫹鐎殿喚鍋撶换娑㈠醇閻曞倽锟藉潡鏌＄仦璇插闁诡喓鍨荤槐鎺戭潨閸℃﹩妫勭紓鍌氬�烽懗鑸垫叏鐎靛摜鐭撻柣鐔稿閺嗭箓鏌￠崶銉ョ仼缁绢叏鎷烽梻浣筋嚙缁绘帞鍒掗姘兼富濞寸姴顑呴弸渚�鏌涢幇闈涙灈缁炬儳銈搁弻銊╁棘閸喒鎸冮梺宕囶儠閸婃繂顫忕紒妯诲闁告稑锕ラ崕鎾斥攽閻愯尙婀撮柛銊ㄦ閻ｇ兘鎮烽幊濠冩そ椤㈡棃宕ㄩ婵堟殫闂傚倷鑳剁划顖炲蓟閵娾晛瑙﹂悗锝庡枟閸嬪倹绻涢崱妯诲鞍闁抽攱鍨堕妵鍕箻閸楃偛顬嬮梺浼欑到瀹曨剟鈥﹂懗顖ｆ闂佹悶鍔岄悥鐓庮嚕婵犳碍鍋勭痪鎷岄哺閺咁剙鈹戦鐭亜鐣烽鍕劵闁汇垹鎲￠埛鎴︽偣閸ワ綇鎷烽搹顐や憾婵＄偑鍊戦崝宀勫箠濮楋拷閺佹劙鎮欏ù瀣杸闁诲函缍嗛崑鍕晸娴犲鏁遍柕鍥у楠炴帡鎮欓弶鎴紦濠碉紕鍋戦崐鏇燁殽韫囨稑绠柨鐕傛嫹?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁樺姍濠�渚�姊虹粙璺ㄧ闁告艾顑囩槐鐐哄箣閿旂晫鍘遍梺闈涱焾閸庨亶鏁撻挊澶樼吋妤犵偛顦甸獮鏍ㄦ媴閻熼缃曢梻浣稿閸嬪懐鎹㈤崟顖涘仭闁哄被鍎查埛鎴犵磼鐎ｎ偒鍎ラ柛搴＄箲閵囧嫰鏁傞悙顒佹瘓閻庢鍠栭…宄邦嚕閹绢喗鏅柛鏇ㄥ幗濠㈡垿姊虹拠鎻掑毐缂傚秴妫欑粋宥夋倻閽樺顔嗛梺缁樺灱濡嫰宕￠幎鑺ョ厽婵☆垳鍎ら埢鏇熶繆椤愶絿鐭掓慨濠呮缁瑧鎹勯妸褜鍟堥梻浣侯焾椤戝棝宕濆Δ鍐ㄥ灊缂備焦菧閸嬪懘鏌涢幇銊︽珖闁告鏁婚弻锝嗘償閿濆棙姣勫銈庡幖閻楀﹦绮嬮幒鏇ㄦЪ闂侀潧娲ょ�氫即寮幇鏉块唶婵犻潧鐗婇妤冪磽閸屾瑦绁板鏉戞憸閺侇噣鍩勯崘褏绠氬┑顔界箓閻牆危缂佹绠鹃悗鐢殿焾闉嬫俊鐐茬摠閹倿鐛崼銉ノ╅柨鏂垮⒔閻﹀牓姊洪崨濠冨闁告鍋愮划顓㈡晸閻樻枼鎷洪梺鑽ゅ枑濠㈡ê危婵犳碍鐓欓柧蹇ｅ�嬮鍫熷仼闁绘垹鐡旈弫鍐煥閺囶亝瀚圭紓渚婃嫹閻庯綆鍋佹禍婊堟煙閹规劖纭炬繛鍛箻閺屾稑顫濋浣告灎濠殿喖锕ら…宄扮暦閹烘垟鏋庨柟鐑樺灥鐢垶姊绘担渚敯婵炲懏娲熼獮鎴﹀炊瑜忛弳锕傛煟閵忋埄鐒鹃柛鎰舵嫹婵＄偑鍊栭幐楣冨磻閻旂⒈鏁婇柛鈩冪♁閳锋垿鎮归幁鎺戝婵炲懏鍔欓弻鐔煎礄閵堝棗顏�?
		}else{
			lDRoleInfoDes.teamnum=0;
			lDRoleInfoDes.teamnummax=0;
		}
		return lDRoleInfoDes;
	}
	
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793840;

	public int getType() {
		return 793840;
	}


	public CLiveDieBattleWatchView() {
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
		if (_o1_ instanceof CLiveDieBattleWatchView) {
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

	public int compareTo(CLiveDieBattleWatchView _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

