
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
	 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽鐎ｎ亣鎽曢梺鍝勬川閸犲海娆㈤悙鐑樼厱闁斥晛鍙愰幋锔藉仧闁哄啫鍊荤壕濂告煟閹伴潧澧柛鏂诲�栫换婵嬫晸娴犲鐒肩�广儱鎳愰悿鍛存⒑瑜版帗锛熼柣鎺炵畵瀹曟垹锟斤綆鍠楅悡鏇熴亜閹板墎鎮肩紒鐘筹耿閺岋綁鎮㈤弶鎴濐潎濠殿喖锕ュ浠嬬嵁閺嶎厽鍊烽柟缁樺俯閻庢娊姊绘担渚劸闁挎洏鍊楃槐鐐寸節閸愌呯畾闂佹眹鍨婚…鍫㈢矆鐎ｎ偁浜滈柡宥冨妽閻ㄦ垶銇勯弬鍖¤含婵﹥妞介幃鐑藉箥椤旇姤鍠栫紓鍌欐缁鳖噣骞忛悜鑺モ拺闁告縿鍎卞瓭闂佹寧娲︽禍婊堬綖韫囨拋娲敂閸曨剙绁舵俊鐐�栭幐楣冨磻濞戙垻宓侀悗锝庡枟閳锋垿鏌ｅ顒傛憼閻庢艾缍婂缁樼瑹閸パ冾潻缂備礁顦顓犲垝婵犳凹鏁嶉柣鎰嚟閸樺崬鈹戦悙鏉戠仸闁荤噦濡囩槐鐐哄箣閻樼數锛滈梺璺ㄥ枍缁瑥鐣峰锟介、娆撴偩鐏炶棄绠洪梻鍌欑窔閿熻姤绋戝畵鍡樼箾娴ｅ啿瀚▍鐘绘煙濞堝灝鏋ょ痪鍓у帶椤法鎹勯悮鏉戜紣濠碘剝褰冮…鐑藉蓟瀹ュ洦鍠嗛柛鏇ㄥ亞娴煎矂姊虹拠鈥虫灀闁哄懐濞�閵嗕線寮撮姀鈩冩珳闂佸憡绮堢欢銈夊箯閻ゎ垳鐤�婵炴垶鐟㈤幏娲⒑閸涘﹦鈽夐柨鏇樺劜瀵板嫰宕熼娑氬幈濠殿喗顨愰幏椋庣磼閻樺磭澧垫鐐插暣閺佹捇鎮╅懠顒婄床闂備胶绮崝妤冩偘閵夆晛绠繛宸簼閸嬧剝绻濇繝鍌涘櫣妞わ絽銈搁幃浠嬵敍濡や焦鐝旈柧鑽ゅ仱閺岀喓锟芥稒顭囨俊鍥煛閿熻姤绂掔�ｎ偆鍘介梺鐟扮摠缁诲啯寰勯崟顖涘�垫慨姗嗗墰缁夌儤鎱ㄦ繝鍕笡闁瑰嘲鎳橀幊鐐哄Ψ閿濆繑瀚归柛鎰典簽绾惧ジ鏌ㄩ悢璇残撶紒妤冨枛閺佹捇鎸婃径灞炬闂佸湱澧楀姗�鏌ㄩ妶鍡曠箚闁靛牆绻戠�氬湱绱撴担鍝勑ｆ繝銏★耿閸╃偤骞嬮敂钘変汗闂佸湱绮敮妤�鈻撻鐘电＝濞达絿顭堥。鎶芥煕鐎ｎ偆娲撮柛鈺冨仱楠炲鏁傞挊澶夋睏闂備礁婀辩划顖滄暜婵犲嫯濮抽柦妯侯槴閺�浠嬫煃閽樺顥滃ù婊堢畺閺岀喖宕欓妶鍡楊伓
	 * @param id
	 * @return
	 */
	public LDRoleInfoDes createLDRoleInfoDes(long id){
		PropRole propRole = new PropRole(id, true);
		LDRoleInfoDes lDRoleInfoDes = new LDRoleInfoDes();
		lDRoleInfoDes.roleid=propRole.getRoleId();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽鐎ｎ亣鎽曢梺闈浥堥弲娑氱尵瀹ュ鐓曢悘鐐插⒔閻擃垰顭跨憴鍕婵﹥妞藉畷顐﹀礋椤掑锛佺紓鍌欑贰閸犳骞戦崶褜鍤曞┑鐘崇閺呮彃顭跨捄鐚存敾妞ゃ儲绻堝娲捶椤撗呭姼闁诲孩绋堥弲鐘茬暦娴兼潙绠涢柣妤�鐗冮幏铏圭磽閸屾瑧鍔嶆い顓炴川缁顫濋鐘殿啎婵犮垼娉涢鍥洪幘顔界厱闁冲搫鍟禒杈殽閻愬樊鍎旈柡浣稿暣閺佹捇鎮剧仦绛嬫闂佺绻愰崥瀣矗韫囨梹鍙忔俊銈咁儐鐎氬湱绱掔紒銏犲箺闁诡喖鍊搁锝夊箮閼恒儲娅㈤梺璺ㄥ櫐閹凤拷
		lDRoleInfoDes.rolename=propRole.getName();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽鐎ｎ亣鎽曢梺闈浥堥弲娑氱尵瀹ュ鐓曢悘鐐插⒔閻擃垰顭跨憴鍕婵﹥妞藉畷顐﹀礋椤掑锛佺紓鍌欑贰閸犳骞戦崶褜鍤曞┑鐘崇閺呮彃顭跨捄鐚存敾妞ゃ儲绻堝娲捶椤撗呭姼闁诲孩绋堥弲鐘茬暦娴兼潙绠涢柣妤�鐗冮幏铏圭磽閸屾瑧鍔嶆い顓炴川缁顫濋鐘殿啎婵犮垼娉涢鍥洪幘顔界厱闁冲搫鍟禒杈殽閻愬樊鍎旈柡浣稿�块幐濠冨緞婢跺娼栭梻鍌氬�风粈渚�骞夐敓鐘冲仭闁靛鏁￠崶銊ヮ嚤闁哄鍨归悾鍝勨攽閻愬弶顥為柟绋款煼閹繝鎮㈤崗鑲╁幗闂佸搫鍊圭�笛囧箟閹间焦鐓欓柧蹇ｅ亝缁�瀣煛瀹�锟介崰鏍х暦濞嗘挸围闁糕剝顨忔导锟�?
		lDRoleInfoDes.shape=propRole.getShape();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽鐎ｎ亣鎽曢梺闈浥堥弲娑氱尵瀹ュ鐓曢悘鐐插⒔閻擃垰顭跨憴鍕婵﹥妞藉畷顐﹀礋椤掑锛佺紓鍌欑贰閸犳骞戦崶褜鍤曞┑鐘崇閺呮彃顭跨捄鐚存敾妞ゃ儲绻堝娲捶椤撗呭姼闁诲孩绋堥弲鐘茬暦娴兼潙绠涢柣妤�鐗冮幏铏圭磽閸屾瑧鍔嶆い顓炴川缁顫濋鐘殿啎婵犮垼娉涢鍥洪幘顔界厱闁冲搫鍟禒杈殽閻愬樊鍎旈柡浣稿�块幐濠冨緞婢跺娼栭梻鍌氬�风粈渚�骞夐敓鐘冲仭闁靛鏁￠崶顒夋晬闁绘劕鐗嗗ú顓㈠春閿熺姴宸濇い鏃囶潐鐎氳偐绱撻崒姘拷鐑芥倿閿曞倹鏅紓鍌欑劍椤ㄥ棛鏁Δ鍛﹂柛鏇ㄥ灱閺佸洭鏌ｅΟ璇茬祷妤犵偛顑夐幃妤�鈻撻崹顔界亪濡炪値鍘鹃崗妯侯嚕椤愶箑绠涢柡澶婄仢缁愭盯姊虹粙鎸庢拱缂侇喖鐭傚绋库槈濮樼偓瀚归悷娆忓缁�锟界紓鍌氱Т閿曨亪濡存担绯曟瀻闁圭偓娼欓敓浠嬫敱閵囧嫰骞掗幋顓熜﹀┑鐐茬墛閸ㄥ灝顫忔繝姘＜婵﹩鍓ㄩ幏宄扮暋閹冲﹤缍婂畷鎯邦槷闁哄鐗犻弻锟犲炊閵夈儳浠肩紓浣瑰姈椤ㄥ﹪寮婚悢鍏煎亱闁割偆鍠撻崙锟犳⒑閸涘﹤鐏╁┑顔芥尦閸╃偤骞嬮敂钘変汗闁诲骸婀辨慨鎾夊┑鍫㈢＝濞达絽鎼宀勬煕閵娿儳鍩ｇ�殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�
		lDRoleInfoDes.level=propRole.getLevel();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽鐎ｎ亣鎽曢梺闈浥堥弲娑氱尵瀹ュ鐓曢悘鐐插⒔閻擃垰顭跨憴鍕婵﹥妞藉畷顐﹀礋椤掑锛佺紓鍌欑贰閸犳骞戦崶褜鍤曞┑鐘崇閺呮彃顭跨捄鐚存敾妞ゃ儲绻堝娲捶椤撗呭姼闁诲孩绋堥弲鐘茬暦娴兼潙绠涢柣妤�鐗冮幏铏圭磽閸屾瑧鍔嶆い顓炴川缁顫濋鐘殿啎婵犮垼娉涢鍥洪幘顔界厱闁冲搫鍟禒杈殽閻愬樊鍎旈柡浣稿�块幐濠冨緞婢跺娼栭梻鍌氬�风粈浣革耿鏉堚晛鍨濇い鏍ㄧ矋閺嗘粓鏌嶉崫鍕拷鎼侇敋闁秵鐓ラ柣鏃傜帛椤ュ鏌嶇憴鍕伌闁轰礁绉瑰畷鐔碱敃閳╁啫鐓曢梻鍌欒兌椤㈠﹤鈻嶉弴銏犵闁搞儜鍛濡炪倖鐗滈崑娑㈡煥閵堝棔绻嗛柣鎰娑撴煡鏌熸搴″幋闁轰礁鍊块幃娆擃敆閿熺晫澹曢鐐粹拺闂傚牊渚楅悡顓犵磼閻樺啿鐏╁瑙勬礋椤㈡盯鎮欑划瑙勫闂備浇顕栭崹搴ㄥ川椤栵絽鏁瑰┑鐘垫暩婵挳骞忛悜鑺モ拺妞ゆ帪鎷风紒澶婎嚟缁牊寰勭�ｃ劋绨婚梺鍝勭▉閸嬪嫭绂掗敃鍌涚厓闂佸灝顑呴悘鈺冪磼鏉堛劍灏伴柟宄版噺閹便劑骞嬮婵嬪仐閻庤娲戦崡鍐差嚕閹绢喖顫呴柨娑樺楠炲秹姊绘担鍛婂暈闁割煈鍨跺畷鎰板冀椤愵剚瀚规慨妯煎亾鐎氾拷
		lDRoleInfoDes.school=propRole.getSchool();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈囩磽瀹ュ拑韬�殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ψ瑜忕壕钘夈�掑顒婃敾閻庢俺顫夌换婵嬪閿濆棛銆愰梺娲诲幖椤︾敻鐛箛娑欏�婚柣锝呰嫰缁侊箓姊洪崜鑼帥闁哥姵鐗楅幈銊︽償閵婏腹鎷洪柣鐘叉礌閿熻棄纾禒顓㈡⒑閸︻収鐒炬い顓犲厴閻涱噣宕卞☉妯肩潉闂佸壊鍋呴幆濠囧煛閸涱喚鍙嗛梺鍝勫暙濞层倛顣挎俊鐐�曠换鎺楀窗閺嵮屾綎缂備焦蓱婵挳鏌ら幁鎺戝姢闁靛棗锕娲閳哄啰肖缂備胶濮甸幑鍥偘椤旇法鐤�婵炴垶鐟﹀▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹
		Team team = TeamManager.selectTeamByRoleId(id);
		if(team!=null&&team.getTeamLeaderId()==id){
			lDRoleInfoDes.teamnum=team.getTeamInfo().getMembers().size()+1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ锟藉鍝勑ч崶褝鎷烽妶澶婄獥闁哄稁鍘界粻鎺楁⒒娴ｄ警鐒剧紒缁樺姍瀹曘儳锟斤綆鍓涚粈濠囨煙鐎电啸缁炬儳銈搁弻鐔兼焽閿曪拷瀵偓绻涢崼鐕傝�块柡灞诲姂閹垻绱掑鍡橆棄缂傚倷鑳舵慨瀵哥矓閻熸壆鏆﹂柡鍥ュ灩绾拷闂佽绻掔划顖氼渻娴犲鏋侀柛鎰靛枛绾惧ジ鏌ㄩ弬鍨挃闁崇鍊濆缁樻媴閸涘﹥鍎撳┑鐐茬湴閸ㄨ棄鐣烽悷鎳婃椽顢旈崨顓濈暗闂備胶绮弻銊╁触鐎ｎ喗鍋傛繛鍡樻尰閳锋垶銇勯幘鍗炲闁伙綁浜堕弻锝堢疀閵壯呅滈梺鍝勬湰閻╊垶銆侀弴銏╂晝闁挎稑瀚▔鍧楁⒒閸屾碍鎼愭い锔藉閹广垹鈹戦崶鈺冪槇闂佺鏈喊宥呪枔閸撲胶纾藉ù锝呭濡茶淇婇悙鎵煓鐎殿喖顭烽崹鎯х暦閸ャ劍鐣烽梻浣芥硶閸犲秶鍒掑▎蹇曟殾濞村吋娼欓崘锟藉銈嗘尵婵绮婇敃鍌涒拺缂侇垱娲栨晶鏌ユ煕閹寸姵鍤�閸楀崬鈹戦悩宕囶暡闁抽攱鍨块弻娑樷攽閸℃浠惧銈冨劗閿熻姤鍓氬〒濠氭倵濞戞鎴﹀磹閹邦兘鏀介柨娑樺閺嗩剛锟借娲滈崰鏍�佸☉妯炴帗鎷呴崘鍙夊闁绘挻娲樼换娑㈠箣濠靛棜鍩為梺鍝勵儐缁嬫帞鎹㈠☉銏犳そ闁告劦浜炶ⅵ婵犳鍠栭敃銈夆�﹀畡鎵殾闁诡垶鍋婂銊モ攽閳╁啫绲绘繝锟芥潏鈺傤潟闁圭儤姊荤壕鍏间繆椤栨繂浜归柣锝堟缁辨挻鎷呴搹鐟扮缂備浇顕ч悧鍡涙偩閻戣棄绠抽柟瀛樻⒐椤秴鈹戦埥鍡楃仭婵＄偞瀵х粋鎺楀煛閸涱喒鎷婚梺绋挎湰閻熝囁囬敃鍌涚厵閻犲泧鍛槇閻庢鍠栭…閿嬩繆閹间礁鐓涘┑鐘插暞濞呭牆鈹戦悩顔肩伇闁糕晜鐗犲畷婵嬪即閵忊�崇彅闂佺粯鏌ㄩ崥瀣偂閵夆晜鐓熼柡鍌涘閹牏锟芥稒绻傝灃闁绘﹢娼ф禍濂告煕閵婏附銇濆┑锛勬暬瀹曠喖顢涘槌栧晪闂佽崵濮惧▍锝夊磿閵堝鍊甸悹鍥ф▕濞撳鏌曢崼婵囧殗闁绘稒绮撻弻鐔煎礄閵堝棗顏�
			lDRoleInfoDes.teamnummax=TeamManager.MAX_MEMBER_COUNT+1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ锟藉鍝勑ч崶褝鎷烽妶澶婄獥闁哄稁鍘界粻鎺楁⒒娴ｄ警鐒剧紒缁樺姍瀹曘儳锟斤綆鍓涚粈濠囨煙鐎电啸缁炬儳銈搁弻鐔兼焽閿曪拷瀵偓绻涢崼鐕傝�块柡灞诲姂閹垻绱掑鍡橆棄缂傚倷鑳舵慨瀵哥矓閻熸壆鏆﹂柡鍥ュ灩绾拷闂佽绻掔划顖氼渻娴犲鏋侀柛鎰靛枛绾惧ジ鏌ㄩ弬鍨挃闁崇鍊濆缁樻媴閸涘﹥鍎撳┑鐐茬湴閸ㄨ棄鐣烽悷鎳婃椽顢旈崨顓濈暗闂備胶绮弻銊╁触鐎ｎ喗鍋傛繛鍡樻尰閳锋垶銇勯幘鍗炲闁伙絽宕…鑳檨闁搞劌鐖煎濠氭偄绾拌鲸鏅┑顔矫畷顒勫焻閻㈠憡鈷戦悹鍥ｏ拷铏亶濡炪們鍔岄幊姗�鏁愰悙娴嬫斀閻庯綆鍋勯敓浠嬫敱閵囧嫰骞掗悙鏉戭伓婵＄偑鍊曟蹇涘箯閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘劙婀侀梺绋跨箰閸氬绱為幋锔界厱闁靛鍎遍敓钘夘煼楠炲骞栨担鐟颁罕闂佸壊鍋呯换鍕偡閺屻儲鈷戠紒瀣儥閸庡繑銇勯敂鐐毈鐎殿喖顭峰鎾晬閸曨厽婢戦梺璇插嚱缂嶅棙绂嶉悜钘夌闁绘垼妫勯崡鎶芥煟濡儤鈻曟俊顐ｇ矒濮婅櫣绮欑捄銊ь啈闂佺顑嗛崝妤冨垝缂佹ǜ鍋呴柛鎰ㄦ櫇閸樼敻鏌ｆ惔锝嗘毄妞ゎ厼鐗婄粋鎺曨槼闁靛洤瀚伴弫鎰板醇濠靛牊顕楃紓鍌欐祰妞村摜鏁埄鍐х箚婵繂鐭堝Σ缁樼箾鐎电鞋濡炲瓨鎮傞獮鍫ュΩ閿斿墽鐦堥梺鍛婃处閸樿偐绮敓鐘斥拺闁荤喐婢樺Σ濠氭煙閾忣個顏堟偩閻戠瓔鏁冮柨鏇嫹缂侊拷鐎ｎ偁浜滈柟鎹愭硾濞呭繘鏌涘顒佸枠婵﹤顭峰畷鎺戔枎閹烘垵甯梻浣侯攰濞呮洟骞戦崶褏鏆﹂柣銏㈩焾閸愶拷濡炪倖鎸鹃崑鐔碱敊閸℃稒鈷戦悹鎭掑妼濞呮劙鏌熼崙銈嗗?
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

