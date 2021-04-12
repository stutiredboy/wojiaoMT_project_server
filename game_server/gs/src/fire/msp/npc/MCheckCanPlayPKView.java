
package fire.msp.npc;

import java.util.Map;

import fire.pb.PropRole;
import fire.pb.battle.QCRoleInfoDes;
import fire.pb.battle.QCRoleInfoWatchDes;
import fire.pb.battle.QCmodelType;
import fire.pb.battle.SPlayPKFightView;

import fire.pb.team.Team;
import fire.pb.team.TeamManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __MCheckCanPlayPKView__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class MCheckCanPlayPKView extends __MCheckCanPlayPKView__ {
	@Override
	protected void process() {
		mkdb.Procedure proc=new mkdb.Procedure(){
			@Override
			protected boolean process() throws Exception {
				SPlayPKFightView sPlayPKFightView=new SPlayPKFightView();
				sPlayPKFightView.levelindex=levelindex;
				sPlayPKFightView.modeltype=modeltype;
				sPlayPKFightView.school=school;
				
				if(modeltype==QCmodelType.WATCH_FIGHT){
					for (Map.Entry<Long, Long> entry : watchid.entrySet()){
						long oneid=entry.getKey();
						long otherid=entry.getValue();
						QCRoleInfoDes qCRoleInfoDes1 = createQCRoleInfoDes(oneid);
						QCRoleInfoDes qCRoleInfoDes2 = createQCRoleInfoDes(otherid);
						QCRoleInfoWatchDes qcRoleInfoWatchDes=new QCRoleInfoWatchDes();
						qcRoleInfoWatchDes.role1=qCRoleInfoDes1;
						qcRoleInfoWatchDes.role2=qCRoleInfoDes2;
						sPlayPKFightView.rolewatchlist.add(qcRoleInfoWatchDes);
					}
				}else{
					for(Long id:rolelistid){
						QCRoleInfoDes qCRoleInfoDes = createQCRoleInfoDes(id);
						sPlayPKFightView.rolelist.add(qCRoleInfoDes);
					}
				}
				
				mkdb.Procedure.psendWhileCommit(hostid, sPlayPKFightView);
				return true;
			}
			
		};
		proc.submit();
	}
	
	private QCRoleInfoDes createQCRoleInfoDes(long id){
		PropRole propRole = new PropRole(id, true);
		QCRoleInfoDes qCRoleInfoDes = new QCRoleInfoDes();
		qCRoleInfoDes.roleid=propRole.getRoleId();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽鐎ｎ亣鎽曢梺闈浥堥弲娑氱尵瀹ュ鐓曢悘鐐插⒔閻擃垰顭跨憴鍕婵﹥妞藉畷顐﹀礋椤掑锛佺紓鍌欑贰閸犳骞戦崶褜鍤曞┑鐘崇閺呮彃顭跨捄鐚存敾妞ゃ儲绻堝娲捶椤撗呭姼闁诲孩绋堥弲鐘茬暦娴兼潙绠涢柣妤�鐗冮幏铏圭磽閸屾瑧鍔嶆い顓炴川缁顫濋鐘殿啎婵犮垼娉涢鍥洪幘顔界厱闁冲搫鍟禒杈殽閻愬樊鍎旈柡浣稿暣閺佹捇鎮剧仦绛嬫闂佺绻愰崥瀣矗韫囨梹鍙忔俊銈咁儐鐎氬湱绱掔紒銏犲箺闁诡喖鍊搁锝夊箮閼恒儲娅㈤梺璺ㄥ櫐閹凤拷
		qCRoleInfoDes.rolename=propRole.getName();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽鐎ｎ亣鎽曢梺闈浥堥弲娑氱尵瀹ュ鐓曢悘鐐插⒔閻擃垰顭跨憴鍕婵﹥妞藉畷顐﹀礋椤掑锛佺紓鍌欑贰閸犳骞戦崶褜鍤曞┑鐘崇閺呮彃顭跨捄鐚存敾妞ゃ儲绻堝娲捶椤撗呭姼闁诲孩绋堥弲鐘茬暦娴兼潙绠涢柣妤�鐗冮幏铏圭磽閸屾瑧鍔嶆い顓炴川缁顫濋鐘殿啎婵犮垼娉涢鍥洪幘顔界厱闁冲搫鍟禒杈殽閻愬樊鍎旈柡浣稿�块幐濠冨緞婢跺娼栭梻鍌氬�风粈渚�骞夐敓鐘冲仭闁靛鏁￠崶銊ヮ嚤闁哄鍨归悾鍝勨攽閻愬弶顥為柟绋款煼閹繝鎮㈤崗鑲╁幗闂佸搫鍊圭�笛囧箟閹间焦鐓欓柧蹇ｅ亝缁�瀣煛瀹�锟介崰鏍х暦濞嗘挸围闁糕剝顨忔导锟�?
		qCRoleInfoDes.shape=propRole.getShape();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽鐎ｎ亣鎽曢梺闈浥堥弲娑氱尵瀹ュ鐓曢悘鐐插⒔閻擃垰顭跨憴鍕婵﹥妞藉畷顐﹀礋椤掑锛佺紓鍌欑贰閸犳骞戦崶褜鍤曞┑鐘崇閺呮彃顭跨捄鐚存敾妞ゃ儲绻堝娲捶椤撗呭姼闁诲孩绋堥弲鐘茬暦娴兼潙绠涢柣妤�鐗冮幏铏圭磽閸屾瑧鍔嶆い顓炴川缁顫濋鐘殿啎婵犮垼娉涢鍥洪幘顔界厱闁冲搫鍟禒杈殽閻愬樊鍎旈柡浣稿�块幐濠冨緞婢跺娼栭梻鍌氬�风粈渚�骞夐敓鐘冲仭闁靛鏁￠崶顒夋晬闁绘劕鐗嗗ú顓㈠春閿熺姴宸濇い鏃囶潐鐎氳偐绱撻崒姘拷鐑芥倿閿曞倹鏅紓鍌欑劍椤ㄥ棛鏁Δ鍛﹂柛鏇ㄥ灱閺佸洭鏌ｅΟ璇茬祷妤犵偛顑夐幃妤�鈻撻崹顔界亪濡炪値鍘鹃崗妯侯嚕椤愶箑绠涢柡澶婄仢缁愭盯姊虹粙鎸庢拱缂侇喖鐭傚绋库槈濮樼偓瀚归悷娆忓缁�锟界紓鍌氱Т閿曨亪濡存担绯曟瀻闁圭偓娼欓敓浠嬫敱閵囧嫰骞掗幋顓熜﹀┑鐐茬墛閸ㄥ灝顫忔繝姘＜婵﹩鍓ㄩ幏宄扮暋閹冲﹤缍婂畷鎯邦槷闁哄鐗犻弻锟犲炊閵夈儳浠肩紓浣瑰姈椤ㄥ﹪寮婚悢鍏煎亱闁割偆鍠撻崙锟犳⒑閸涘﹤鐏╁┑顔芥尦閸╃偤骞嬮敂钘変汗闁诲骸婀辨慨鎾夊┑鍫㈢＝濞达絽鎼宀勬煕閵娿儳鍩ｇ�殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�
		qCRoleInfoDes.level=propRole.getLevel();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽鐎ｎ亣鎽曢梺闈浥堥弲娑氱尵瀹ュ鐓曢悘鐐插⒔閻擃垰顭跨憴鍕婵﹥妞藉畷顐﹀礋椤掑锛佺紓鍌欑贰閸犳骞戦崶褜鍤曞┑鐘崇閺呮彃顭跨捄鐚存敾妞ゃ儲绻堝娲捶椤撗呭姼闁诲孩绋堥弲鐘茬暦娴兼潙绠涢柣妤�鐗冮幏铏圭磽閸屾瑧鍔嶆い顓炴川缁顫濋鐘殿啎婵犮垼娉涢鍥洪幘顔界厱闁冲搫鍟禒杈殽閻愬樊鍎旈柡浣稿�块幐濠冨緞婢跺娼栭梻鍌氬�风粈浣革耿鏉堚晛鍨濇い鏍ㄧ矋閺嗘粓鏌嶉崫鍕拷鎼侇敋闁秵鐓ラ柣鏃傜帛椤ュ鏌嶇憴鍕伌闁轰礁绉瑰畷鐔碱敃閳╁啫鐓曢梻鍌欒兌椤㈠﹤鈻嶉弴銏犵闁搞儜鍛濡炪倖鐗滈崑娑㈡煥閵堝棔绻嗛柣鎰娑撴煡鏌熸搴″幋闁轰礁鍊块幃娆擃敆閿熺晫澹曢鐐粹拺闂傚牊渚楅悡顓犵磼閻樺啿鐏╁瑙勬礋椤㈡盯鎮欑划瑙勫闂備浇顕栭崹搴ㄥ川椤栵絽鏁瑰┑鐘垫暩婵挳骞忛悜鑺モ拺妞ゆ帪鎷风紒澶婎嚟缁牊寰勭�ｃ劋绨婚梺鍝勭▉閸嬪嫭绂掗敃鍌涚厓闂佸灝顑呴悘鈺冪磼鏉堛劍灏伴柟宄版噺閹便劑骞嬮婵嬪仐閻庤娲戦崡鍐差嚕閹绢喖顫呴柨娑樺楠炲秹姊绘担鍛婂暈闁割煈鍨跺畷鎰板冀椤愵剚瀚规慨妯煎亾鐎氾拷
		qCRoleInfoDes.school=propRole.getSchool();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈囩磽瀹ュ拑韬�殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ψ瑜忕壕钘夈�掑顒婃敾閻庢俺顫夌换婵嬪閿濆棛銆愰梺娲诲幖椤︾敻鐛箛娑欏�婚柣锝呰嫰缁侊箓姊洪崜鑼帥闁哥姵鐗楅幈銊︽償閵婏腹鎷洪柣鐘叉礌閿熻棄纾禒顓㈡⒑閸︻収鐒炬い顓犲厴閻涱噣宕卞☉妯肩潉闂佸壊鍋呴幆濠囧煛閸涱喚鍙嗛梺鍝勫暙濞层倛顣挎俊鐐�曠换鎺楀窗閺嵮屾綎缂備焦蓱婵挳鏌ら幁鎺戝姢闁靛棗锕娲閳哄啰肖缂備胶濮甸幑鍥偘椤旇法鐤�婵炴垶鐟﹀▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹
		Team team = TeamManager.selectTeamByRoleId(id);
		if(team!=null){
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮村杈┬㈤梻浣规偠閸庢椽宕滈敃鍌氭瀬闁告劦鍠楅悡銉╂煛閸ユ湹绨奸悗姘秺濮婂搫效閸パ嶆嫹濡ゅ懎纾婚柟鎹愬煐瀹曞弶绻濋棃娑欏窛缂佲槄鎷烽梻浣侯焾閺堫剛鍒掑畝鍔肩兘鏁撴禒瀣拻濞达絼璀﹂悞鐐亜閹寸偛鐏╅柟骞垮灩閳规垹锟斤綆浜ｉ幗鏇㈡倵楠炲灝鍔氭い锔诲灡鐎靛ジ鎮╃紒妯煎幈闂佸搫娲㈤崝灞炬櫠椤旂晫绠鹃柛婊冨暟缁夘喗鎱ㄦ繝鍌ょ吋鐎规洘甯掗～婵嬵敄鐠恒劍鏅奸梻鍌欑劍閹爼宕濆畝鍕亯闁绘挸瀵掗崵鏇炩攽閻樺磭顣查柡鍛絻椤法鎹勯悮鏉戝濡炪倖鎸诲钘夘潖濞差亜绠伴幖杈剧悼閻ｇ敻姊洪悷鏉跨骇闁烩晩鍨堕悰顔嘉熼懖鈺冿紲濠碘槅鍨抽崢褏鏁Δ鍛拻闁稿本鐟чˇ锕傛煟韫囨梻绠炴い銏＄墵瀹曞崬螖閸愨晜顔曢柣搴ｆ閹风兘鏌涢弴銊ュ闁告ɑ鎮傞幃妤呮儌閸涘﹤顏堕梺璇插嚱缂嶅棝宕滃☉婧惧徍闂備浇顕х�涒晠顢欓弽顓為棷妞ゆ洩鎷风�规洘绮撻幃銏☆槹鎼淬垺顔曢柣鐔哥矌婢ф鏁埡鍛瀬閻庯綆鍠楅悡鏇熺箾閹存繂鑸归柡瀣枑閵囧嫰寮敓浠嬪垂閸︻厽顫曢柟鎹愵嚙绾惧吋鎱ㄥ鍡楀⒕闁圭兘鏀遍ˇ鐗堟償閵忊晛浠洪梻渚�娼ч悧鍡浰囬婊呬笉妞ゆ牗绮ｉ幏鐑芥偡閺夋浠炬繝銏㈡嚀椤戝顕ｉ妸锔绢浄閻庯綆鍋嗛崢钘夆攽閳藉棗鐏犻柟纰卞亞閻ヮ亣顦叉い顓℃硶閹瑰嫰宕崟鍏哥磾闂備礁鎼惌澶岀礊娓氾拷閻涱喖螣绾攱瀚归柛顭戝亝閸嬬娀鏌ㄩ悢璇残撻悽顖ょ節瀵濡搁埡鍌氫簻缂傚倷鐒﹂敃鈺佄涢崟顓犵＝濞达絽鎼瓭缂備礁顦遍幊鎾绘偩閻戣棄鍗抽柕蹇ョ磿閸斿爼鎮楅獮鍨姎闁硅櫕鍔欓幃鍧楀炊椤掍緡妫呭銈嗗姂閸ㄧ儤寰勯崟顓犵＜閻庯綆鍋勯悘鈺冪磼椤旇姤顫楅柕鍥ㄥ姍楠炴帡骞樼捄鍝勭闂傚倸鍊风欢锟犲矗韫囨洜涓嶉柟杈剧畱閸戠娀鏌曢崼婵囧窛婵☆偒鍨堕弻鐔烘喆閸曨偄顫屾繛瀛樼矊濠�杈╂閹烘挻缍囬柕濠忕畱闂夊秹姊洪悷鏉挎Щ闁硅櫕锕㈤獮濠囧冀椤撶偟鍔撮梺鍛婂姂閸斿孩瀵煎畝鍕參婵☆垳鍘ч弸娑㈡煛鐏炲墽娲存い銏℃礋婵″爼宕ㄩ鎾呮嫹閾忓湱纾藉ù锝囩摂閸ゆ瑦淇婇锝囨噰濠碉紕鏁诲畷鐔碱敍濮樿京鏉搁梻鍌氬�搁悧濠勭矙閹达讣缍栨い蹇撶墛閻撶喖骞栧ǎ顒�鐏柛鐔哥叀閺岀喖宕欓妶鍡楊伓?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍蓟閸ヮ剚鏅濋柨鐔剁矙瀹曟繈骞掗幘鍓侇啎閻庣懓澹婇崰鏇犺姳閼姐倗纾奸柣娆忔噽缁嬭崵绱掔紒妯肩疄濠殿噯鎷烽梺鎸庣☉鐎氼噣鎮鹃悽鐢电＝闁稿本姘ㄥ瓭闂佹寧娲︽禍婊堫敋閿濆鏁冮柨鏇嫹缂佺姾宕电槐鎾存媴閼测剝鍨甸埢宥夊閵堝棌鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌ょ喊鍗炲⒒婵¤尙鍏樺缁樻媴閻熼偊鍤嬪┑鐐插级閻楃姴鐣烽幇鏉跨濞达絽鎽滈敍婊堟⒑闂堟侗鐒鹃柛搴＄Х閵囨劙骞掗幘鍏呮睏闁诲海鎳撴竟濠囧窗閺嶎厼绀堝Δ锝呭暞閳锋垿寮堕悙闈涱暭妞わ箓顥撶槐鎺楁嚋闂堟稑鎽甸悗娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟� 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閻橀潧骞�闂備礁鍚嬫禍浠嬪磿閹惰棄鐓″鑸靛姈閹虫岸鏌″搴″箺闁绘挻娲樼换娑㈠箣濠靛棜鍩炲Δ鐘靛仦閿曘垽寮婚妸銉㈡婵炲棙鍨堕崳顓犵磽娴ｈ櫣甯涚紒璇茬墦楠炲啯绂掔�ｎ偒妫冨┑鐐殿棎椤旀劗绱炴笟锟藉璇测槈閵忕姷鍘告繛杈剧到閹测�斥枔婵犳碍鈷戦弶鐐村閸斿秹鏌熼悷鐗堝枠妤犵偛锕幃娆撳传閸曞簺鍔庨幉绋款吋婢跺﹦鍘遍悗鐧告嫹闁告洦鍓欓敓鐣屾暬閹嘲鈻庤箛鎿冧痪缂備緤鎷烽柨鐔剁矙濮婅櫣绱掑Ο鐓庘吂闂侀潧鐗婇幃鍌涗繆鐎涙ɑ濯撮柤鍙夌箖濮婂綊骞忛崨瀛樺仭闂侇叏璁ｉ幏鐑藉箻缂佹ǚ鎷洪梺鍛婄☉閿曪箓骞婇崘鈹夸簻闁挎棁顕ч悘锕傛煙椤栨瑦绁版い锕侇潐閹便劍绻濋崒銈囧悑閻庤娲樼敮鎺楀煝鎼淬劌绠抽柟瀛樼箓閼垫劗绱撻崒姘拷椋庢閿熺姴闂い鏇嫹鐎规洖婀遍幑鍕瑹椤栨碍顓垮┑鐘垫暩婵敻鎳濋悙顒�鍔旈梻鍌欑劍鐎笛兾涙担瑙勫弿闁靛牆顦伴崑鐔兼煟閹达絽袚闁绘挻鐟╅弻銈夊捶椤撶儐鏆悷婊勫Ω閸涱垳锛滈梺鍦帛鐢宕戦妷鈺傜厵妞ゆ牗姘ㄩ悞鍝ワ拷瑙勬礀瀹曨剟鈥旈崘顏嗙＜婵☆垳绮鎴︽⒒閸屾瑨鍏岀紒顕呭灦閺佸鎮楀▓鍨灕闁糕晜鐗曢銉╁礋椤栨氨顦板銈嗙墬缁嬫捇宕㈡禒瀣拺閻熸瑥瀚粈鍐╃箾婢跺娲寸�殿喚顭堥埥澶愬閿涘嫬骞愰梺璇茬箳閸嬬喖宕戦幘鍓佺焼闁告劦浜炵壕鑲╃磽娴ｈ鐒芥繛鎻掝嚟閿熷�燁潐濞叉牜绱炴繝鍥ワ拷浣糕枎閹炬潙浜楅柟鍏兼儗閸犳绱為幘瀵哥瘈缁炬澘顦辩壕鍧楁煕鐎ｎ偄鐏寸�规洘鍔欏鎾倶閼姐倖鍤�妞ゎ偅绻勯幑鍕惞閻у摜骞㈡繝鐢靛Х閺佸憡鎱ㄩ弶鎳ㄦ椽濡堕崶鈺�绗夐梺鍝勭▉閻忔劘銇愰幒鎾充汗閻庣懓澹婇崰鏍礈妤ｅ啯鈷戦弶鐐村椤︼妇绱掓径灞炬毄闁瑰箍鍨归埞鎴狅拷锝庡亽濡啫鈹戦悙鏉戠仸闁荤啙鍥ч柍鍝勫�荤粻楣冩倵閻㈡鐒剧悮銉╂⒑閸濆嫭鍣藉┑顔芥尦閿濈偠绠涘☉娆愬劒闁荤喐鐟ョ�氼剛澹曢鐐粹拺闂傚牊渚楅悞楣冩煕鎼淬垻鍙�闁诡喗蓱缁楃喖鏁撻挊澶樻綎婵炲樊浜滄导鐘绘煕閺囥劌澧い搴㈢洴濮婅櫣绮欏▎鎯у壈闂佹寧娲︽禍婵囩┍婵犲嫸鎷峰☉娅虫垶鍒婇幘顔界厱闁挎棁顕ч獮姗�鏌ｉ敃锟介悧鎾愁潖閾忓湱鐭欓柟绋垮閹峰崬顪冮妶鍐ㄥ婵☆偅绻堥獮鍐潨閿熻棄鐣峰锟芥俊鎼佸閳╁啯婢戦梻鍌欒兌缁垶宕濋弽褜鐒芥繛鍡樻尰閸婂爼鏌ㄩ弴鐐诧拷褰掓偂閵夆晜鐓涢柛銉ｅ劚婵＄厧霉濠婏拷閸楁娊寮婚悢鍏兼優妞ゆ劧绲界壕鍐参旈悩闈涗沪闁告梹鐗犻獮鍡涘棘鎼存挻顫嶅┑掳鍊曢崯鏉库枖閸ф鈷掗柛灞惧嚬閻擃剟鏌涚�ｎ亜顏╅悡銈夋煥閺囩偛锟藉摜绮绘导瀛樼厽闁逛即娼ф晶顖涚箾閸涱垰鈻堥柡宀嬬節瀹曞爼鍩℃担鍥ュ劤閻ヮ亪骞嗚閸嬨垽鏌＄仦璇插闁诡喓鍨藉畷婊勬媴閾忕懓骞嗛梺璇叉唉椤煤閺嵮呮殾妞ゆ帒瀚悡鈥愁熆鐠哄彿鍫ュ几鎼淬劍鐓欓悗娑欘焽缁犳挾绱掗悩闈涗槐婵﹤顭峰畷鎺戔枎閹寸姷宕叉繝鐢靛仒閸栫娀宕舵担鍛婂枠妞ゃ垺锕㈡慨锟介柣妯垮皺閿熺瓔鍙冨娲川婵犲嫮鐣甸柣搴㈢殰閸パ冨殤閻庡箍鍎遍ˇ浼存偂濞嗘挻鐓曢柟鐐殔閹虫劙鎯侀崼銏㈢＝濞达絿鐡旈崵娆愪繆椤愶絿鎳囧┑锛勬暬瀹曠喖顢涘杈╂澑闂傚倸鍊搁悧濠勭矙閹达讣缍栨い蹇撶墛閻撶喖骞栧ǎ顒�鐏柛鐔哥叀閺岀喖宕欓妶鍡楊伓
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮村杈┬㈤梻浣规偠閸庢椽宕滈敃鍌氭瀬闁告劦鍠楅悡銉╂煛閸ユ湹绨奸悗姘秺濮婂搫效閸パ嶆嫹濡ゅ懎纾婚柟鎹愬煐瀹曞弶绻涢幋娆忕仼缂佺媴缍侀弻锝夊箛閵婏附鐝曢梺鎸庣☉閻楀棝鍩為幋锔藉�烽柛娆忣槴閺嬫瑦绻涚�涙鐭嬬紒璇茬墕椤曪綁骞撻幒鍡樻杸闁诲函缍嗛崑鍡涘储闁秵鐓熼煫鍥ㄦ礀娴犙囨煕鐎ｎ偅宕岄柟顖氬暣楠炲鎮欓鍐泿闂備礁鎼崐鍦拷绗涘洤鍚归柛銉ｅ妽閸欏繐鈹戦悩鎻掓殲闁靛洦绻冩穱濠囶敃閵忕姵娈梺瀹犳椤︻垶锝炲┑瀣垫晢濠㈣泛顑嗛惁鎺撶節绾板纾块柛瀣灴瀹曟劘顦撮柨鐔剁矙濞佳囨儗閸屾氨鏆﹂柣鐔稿閺嗭箓鏌涢妷鎴濆暟娴滄澘鈹戦悩鍨毄濠殿喚鏁婚幊婵嬪礈瑜忛惌鍡涙煕閹板吀鎮嶉柟椋庡厴閹兘寮跺▎鐐棏闂備礁鎽滄慨闈涚暆缁嬭法鏆︽い鎺戝閸嬨劑鏌涘☉妯戝牓骞忓ú顏呪拺缂佸娉曠粻浼存煕濮橆剦鍎旂�规洘鍔欓獮鍥敇閻樻鍟庡┑鐐舵彧缁蹭粙宕捄顭掓嫹濮樼厧寮�规洩缍�缁犳稑鈽夊▎鎴濆箞婵＄偑鍊栭崝褏寰婇幐搴濈箚闁搞儺鍓氶悡娑㈡煥閻斿墎鐭欓柟宕囧仱婵＄兘鏁愰崟顓犳晨闂傚倷绀侀幖顐﹀疮椤愶箑纾归柣鐔稿閺嬪秹鏌￠崶銉ョ仾闁绘挾鍠愰妵鍕箻鐠虹儤鐎荤紓浣诡殕瀹�鎼佸蓟閻斿摜鐟归柛顭戝枛椤绱撴担铏瑰笡缂佽鐗嗛悾鐑藉箳濡わ拷鍥撮梺鎼炲劀閸曨偓鎷烽鐐粹拺閻犲洤寮堕崬澶嬨亜椤愩埄妲搁悡銈嗘叏濡ゅ瀚归梺杞扮閸熷瓨鎱ㄩ敓浠嬫煏閸繂鏋﹂柟鐑芥敱缁楃喖鏁撻挊澶樺殨妞ゆ洩鎷风�规洜鍘ч埞鎴﹀醇椤愶及褍鈹戦敍鍕杭闁稿﹥鐗滈弫顕�骞掑Δ锟界壕褰掓煟閹达絽袚闁绘帟濮ら妵鍕冀椤愵澀娌梺鎶芥敱鐢繝寮诲☉姘勃闁告挆鍕珮婵＄偑鍊х拋锝囩不閹捐钃熼柣鏂挎惈閺嬪牓鏌涘Δ鍐ㄤ粧缂併劌顭烽弻褔鎳￠妶鍛勃缂備胶绮换鍫澪涢崘銊㈡婵炲棗绻掗悰鈺備繆閻愵亜锟芥劙寮插鍫熷亗闁跨喓濮撮拑鐔哥箾閹存瑥鐒洪柡浣稿暣閺屻劌鈹戦崱姗嗘￥濡炪倧瀵岄崣鍐箖濡ゅ啯鍠嗛柛鏇ㄥ墮閻喚绱撴担钘夌厫鐎癸拷閹间胶宓侀柛鎰╁壆閺冨牆宸濇い鏃囧Г閻濇娊姊虹涵鍛汗閻炴稏鍎靛畷婊冣攽鐎ｎ偄锟藉爼鏌涢鐘茬伄缁炬崘妫勯湁闁挎繂鎳忛幆鍫ュ冀閿涘嫮纾藉ù锝呭閸庢劙鎮介妤�澧插ǎ鍥э躬閹晫绮欑捄顭戞Ч婵＄偑鍊栭悧妤�顫濋妸鈺婃晩濠电姴娲﹂崐鍨殽閻愯尙浠㈤柛鏃�纰嶇换娑㈠级閹存繐鎷风粙鍨カ婵＄偑鍊栧ú鈺呭箯闁垮鍙忓┑鐘插暞閵囨繄锟借娲﹂崑濠傜暦閻斿吋顥堟繛鎴灻灇闂傚倸鍊烽懗鍫曞箠閹捐鍚归柡宥庡幖缁狀垶鏌ㄩ悤鍌涘
			if(team.getTeamLeaderId()!=id){
				qCRoleInfoDes.teamnum=0;
				qCRoleInfoDes.teamnummax=0;
			}else{
				qCRoleInfoDes.teamnum=team.getNormalMemberIds().size();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ锟藉鍝勑ч崶褝鎷烽妶澶婄獥闁哄稁鍘界粻鎺楁⒒娴ｄ警鐒剧紒缁樺姍瀹曘儳锟斤綆鍓涚粈濠囨煙鐎电啸缁炬儳銈搁弻鐔兼焽閿曪拷瀵偓绻涢崼鐕傝�块柡灞诲姂閹垻绱掑鍡橆棄缂傚倷鑳舵慨瀵哥矓閻熸壆鏆﹂柡鍥ュ灩绾拷闂佽绻掔划顖氼渻娴犲鏋侀柛鎰靛枛绾惧ジ鏌ㄩ弬鍨挃闁崇鍊濆缁樻媴閸涘﹥鍎撳┑鐐茬湴閸ㄨ棄鐣烽悷鎳婃椽顢旈崨顓濈暗闂備胶绮弻銊╁触鐎ｎ喗鍋傛繛鍡樻尰閳锋垶銇勯幘鍗炲闁伙綁浜堕弻锝堢疀閵壯呅滈梺鍝勬湰閻╊垶銆侀弴銏╂晝闁挎稑瀚▔鍧楁⒒閸屾碍鎼愭い锔藉閹广垹鈹戦崶鈺冪槇闂佺鏈喊宥呪枔閸撲胶纾藉ù锝呭濡茶淇婇悙鎵煓鐎殿喖顭烽崹鎯х暦閸ャ劍鐣烽梻浣芥硶閸犲秶鍒掑▎蹇曟殾濞村吋娼欓崘锟藉銈嗘尵婵绮婇敃鍌涒拺缂侇垱娲栨晶鏌ユ煕閹寸姵鍤�閸楀崬鈹戦悩宕囶暡闁抽攱鍨块弻娑樷攽閸℃浠惧銈冨劗閿熻姤鍓氬〒濠氭倵濞戞鎴﹀磹閹邦兘鏀介柨娑樺閺嗩剛锟借娲滈崰鏍�佸☉妯炴帗鎷呴崘鍙夊闁绘挻娲樼换娑㈠箣濠靛棜鍩為梺鍝勵儐缁嬫帞鎹㈠☉銏犳そ闁告劦浜炶ⅵ婵犳鍠栭敃銈夆�﹀畡鎵殾闁诡垶鍋婂銊モ攽閳╁啫绲绘繝锟芥潏鈺傤潟闁圭儤姊荤壕鍏间繆椤栨繂浜归柣锝堟缁辨挻鎷呴搹鐟扮缂備浇顕ч悧鍡涙偩閻戣棄绠抽柟瀛樻⒐椤秴鈹戦埥鍡楃仭婵＄偞瀵х粋鎺楀煛閸涱喒鎷婚梺绋挎湰閻熝囁囬敃鍌涚厵閻犲泧鍛槇閻庢鍠栭…閿嬩繆閹间礁鐓涘┑鐘插暞濞呭牆鈹戦悩顔肩伇闁糕晜鐗犲畷婵嬪即閵忊�崇彅闂佺粯鏌ㄩ崥瀣偂閵夆晜鐓熼柡鍌涘閹牏锟芥稒绻傝灃闁绘﹢娼ф禍濂告煕閵婏附銇濆┑锛勬暬瀹曠喖顢涘槌栧晪闂佽崵濮惧▍锝夊磿閵堝鍊甸悹鍥ф▕濞撳鏌曢崼婵囧殗闁绘稒绮撻弻鐔煎礄閵堝棗顏�
				qCRoleInfoDes.teamnummax=TeamManager.MAX_MEMBER_COUNT+1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ锟藉鍝勑ч崶褝鎷烽妶澶婄獥闁哄稁鍘界粻鎺楁⒒娴ｄ警鐒剧紒缁樺姍瀹曘儳锟斤綆鍓涚粈濠囨煙鐎电啸缁炬儳銈搁弻鐔兼焽閿曪拷瀵偓绻涢崼鐕傝�块柡灞诲姂閹垻绱掑鍡橆棄缂傚倷鑳舵慨瀵哥矓閻熸壆鏆﹂柡鍥ュ灩绾拷闂佽绻掔划顖氼渻娴犲鏋侀柛鎰靛枛绾惧ジ鏌ㄩ弬鍨挃闁崇鍊濆缁樻媴閸涘﹥鍎撳┑鐐茬湴閸ㄨ棄鐣烽悷鎳婃椽顢旈崨顓濈暗闂備胶绮弻銊╁触鐎ｎ喗鍋傛繛鍡樻尰閳锋垶銇勯幘鍗炲闁伙絽宕…鑳檨闁搞劌鐖煎濠氭偄绾拌鲸鏅┑顔矫畷顒勫焻閻㈠憡鈷戦悹鍥ｏ拷铏亶濡炪們鍔岄幊姗�鏁愰悙娴嬫斀閻庯綆鍋勯敓浠嬫敱閵囧嫰骞掗悙鏉戭伓婵＄偑鍊曟蹇涘箯閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘劙婀侀梺绋跨箰閸氬绱為幋锔界厱闁靛鍎遍敓钘夘煼楠炲骞栨担鐟颁罕闂佸壊鍋呯换鍕偡閺屻儲鈷戠紒瀣儥閸庡繑銇勯敂鐐毈鐎殿喖顭峰鎾晬閸曨厽婢戦梺璇插嚱缂嶅棙绂嶉悜钘夌闁绘垼妫勯崡鎶芥煟濡儤鈻曟俊顐ｇ矒濮婅櫣绮欑捄銊ь啈闂佺顑嗛崝妤冨垝缂佹ǜ鍋呴柛鎰ㄦ櫇閸樼敻鏌ｆ惔锝嗘毄妞ゎ厼鐗婄粋鎺曨槼闁靛洤瀚伴弫鎰板醇濠靛牊顕楃紓鍌欐祰妞村摜鏁埄鍐х箚婵繂鐭堝Σ缁樼箾鐎电鞋濡炲瓨鎮傞獮鍫ュΩ閿斿墽鐦堥梺鍛婃处閸樿偐绮敓鐘斥拺闁荤喐婢樺Σ濠氭煙閾忣個顏堟偩閻戠瓔鏁冮柨鏇嫹缂侊拷鐎ｎ偁浜滈柟鎹愭硾濞呭繘鏌涘顒佸枠婵﹤顭峰畷鎺戔枎閹烘垵甯梻浣侯攰濞呮洟骞戦崶褏鏆﹂柣銏㈩焾閸愶拷濡炪倖鎸鹃崑鐔碱敊閸℃稒鈷戦悹鎭掑妼濞呮劙鏌熼崙銈嗗?
			}
		}else{
			qCRoleInfoDes.teamnum=0;
			qCRoleInfoDes.teamnummax=0;
		}
		return qCRoleInfoDes;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730440;

	public int getType() {
		return 730440;
	}

	public long hostid;
	public int modeltype; // 模块类型
	public int school; // 删选的职业 -1表示全职业
	public int levelindex; // 删选的角色等级区间 0表示全选
	public java.util.LinkedList<Long> rolelistid; // 角色列表
	public java.util.HashMap<Long,Long> watchid; // 观看角色列表

	public MCheckCanPlayPKView() {
		rolelistid = new java.util.LinkedList<Long>();
		watchid = new java.util.HashMap<Long,Long>();
	}

	public MCheckCanPlayPKView(long _hostid_, int _modeltype_, int _school_, int _levelindex_, java.util.LinkedList<Long> _rolelistid_, java.util.HashMap<Long,Long> _watchid_) {
		this.hostid = _hostid_;
		this.modeltype = _modeltype_;
		this.school = _school_;
		this.levelindex = _levelindex_;
		this.rolelistid = _rolelistid_;
		this.watchid = _watchid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(hostid);
		_os_.marshal(modeltype);
		_os_.marshal(school);
		_os_.marshal(levelindex);
		_os_.compact_uint32(rolelistid.size());
		for (Long _v_ : rolelistid) {
			_os_.marshal(_v_);
		}
		_os_.compact_uint32(watchid.size());
		for (java.util.Map.Entry<Long, Long> _e_ : watchid.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		hostid = _os_.unmarshal_long();
		modeltype = _os_.unmarshal_int();
		school = _os_.unmarshal_int();
		levelindex = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			long _v_;
			_v_ = _os_.unmarshal_long();
			rolelistid.add(_v_);
		}
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			long _k_;
			_k_ = _os_.unmarshal_long();
			long _v_;
			_v_ = _os_.unmarshal_long();
			watchid.put(_k_, _v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof MCheckCanPlayPKView) {
			MCheckCanPlayPKView _o_ = (MCheckCanPlayPKView)_o1_;
			if (hostid != _o_.hostid) return false;
			if (modeltype != _o_.modeltype) return false;
			if (school != _o_.school) return false;
			if (levelindex != _o_.levelindex) return false;
			if (!rolelistid.equals(_o_.rolelistid)) return false;
			if (!watchid.equals(_o_.watchid)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)hostid;
		_h_ += modeltype;
		_h_ += school;
		_h_ += levelindex;
		_h_ += rolelistid.hashCode();
		_h_ += watchid.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(hostid).append(",");
		_sb_.append(modeltype).append(",");
		_sb_.append(school).append(",");
		_sb_.append(levelindex).append(",");
		_sb_.append(rolelistid).append(",");
		_sb_.append(watchid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

