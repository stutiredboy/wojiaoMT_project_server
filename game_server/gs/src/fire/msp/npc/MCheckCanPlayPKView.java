
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
		qCRoleInfoDes.roleid=propRole.getRoleId();//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸啴鏁撻悾灞筋棜闁稿繐鍚嬮崣蹇旀叏濡ゅ瀚圭紒缁㈠幗閹倸顕ｉ幎鑺ユ櫢闁跨噦鎷�
		qCRoleInfoDes.rolename=propRole.getName();//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸倿鎸婃径澶嬬潖闂傚倷绀侀幉锟犳偡閵夆敡鍥ㄥ閺夋垹鐣哄┑鐐叉閹稿鎮￠悢鍏肩厽闁哄倹瀵ч幉鎼佹煙閾忣偅绀嬮柡宀�鍠栧畷娆撳Χ閸℃浼�?
		qCRoleInfoDes.shape=propRole.getShape();//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸倿鎸婃径澶嬬潖闂傚倷绀侀幉锟犳偡閵夆敡鍥敍閻愬牆娲崺锟犲川椤旇瀚肩紓鍌氬�烽悞锕傛晪缂備焦顨嗙敮妤呭Φ閸曨垼鏁囬柣妯诲絻楠炲鎮楀▓鍨灈妞ゎ厾鍏樺顐﹀箛閺夊灝绐涢梺绋挎湰缁矂寮稿☉姘炬嫹鐟欏嫭绀�缂傚秴锕妴浣糕枎閹炬潙锟介攱銇勯幒鎴Ц婵炲牊鍨垮濠氬磼濮橆剨鎷峰畡鎳婂綊宕惰閺嬫牠鏌￠崶銉ョ仼缂佹劖顨婇弻鐔兼偋閸喓鍑￠梺鍛婂灩婵挳鍩為幋锔藉亹閻庡湱濮撮ˉ婵堢磽娴ｅ搫顎岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷
		qCRoleInfoDes.level=propRole.getLevel();//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸倿鎸婃径澶嬬潖闂傚倷绀佸﹢杈╁垝椤栨粍鏆滈柍鍝勫�搁閬嶆煥閻旂粯顥夐柍瑙勫灴閺佸秹宕熼鈩冨煕闂備胶顢婂▍鏇㈠箲閸パ呮殾妞ゆ牜鍋涢柨銈嗕繆閻愭壆涓查柟椋庡厴閺佸倿鎮欓锟界壕顖炴⒑闂堟侗鐓紒鐘冲灩婢规洟顢涢悙绮规嫼闂佽鍨庨崨顖ｅ敹婵犵數濯撮幏鐑芥⒑椤掞拷缁夊绮堟径瀣ㄤ簻闁哄稁鍋勬禒锕傛煃闁垮鐏╃紒杈ㄦ尰閹峰懏鎱ㄩ幋顓濋偗鐎规洑鍗冲鎾閿涘嫬骞嶉梻浣告啞閸垶宕愰弽顐嫹濮樼偓瀚�
		qCRoleInfoDes.school=propRole.getSchool();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉〒姘攻鐎氳绻濋姀锝嗙【闁活厼顦甸獮蹇涙倻閻ｅ苯绁﹂梺鍓茬厛閸犳牗鎱ㄦ惔銊︹拺閻犲洠锟藉磭浠梺鍦焾椤兘鐛崱娑樼睄闁割偅鎯婇埡鍛叆闁哄啫娲よ濡炪倕绻掗崰鏍ь潖缂佹ɑ濯撮柤鎭掑劤閵嗗﹪姊洪棃鈺冪Ф缂佺姵鎹囬悰顔跨疀濞戞瑦娅㈤梺璺ㄥ櫐閹凤拷
		Team team = TeamManager.selectTeamByRoleId(id);
		if(team!=null){
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繝闈涙川缁★拷闂佺鏈划宀劼烽敓浠嬫⒒娴ｄ警鐒炬い鎴炲灩閹广垹鈹戠�ｎ亣鎽曢悗骞垮劚椤︻垱瀵奸悩缁樼厱闁哄洢鍔屾晶顔界箾閸滃啰绉慨濠傤煼瀹曟帒顫濋璺ㄦ晼闂備焦鎮堕崝宀勬偉閻撳寒鍤曞┑鐘崇閺呮彃顭跨捄鐚村姛妞ゆ挻妞藉娲箰鎼达絿鐣甸梺鐟板级閻╊垶鐛Ο鑲╃＜婵☆垳鍘х敮妤呮⒒閸屾瑧顦﹂柣蹇旂箞椤㈡牠宕卞Δ鍐╂閻庣櫢鎷烽柛鏇ㄥ墰閸樻悂鎮楅惂鍛婂闁诲函缍嗛崜娑溾叺闂佽瀛╅鏍闯椤曪拷瀹曟粓鎮㈡搴㈡閻熸粎澧楃敮鈺呭极鐎ｎ喗鐓曟繛鎴濆船閺嬬喐銇勯弮锟介崹鍦閹捐纾兼慨姗嗗墾閹烽攱顦版惔銏╁仺闂侀潧鐗嗛ˇ顖滅不椤栨粣鎷烽悷鏉款仾濠㈢懓顑夊銊︾鐎ｎ偆鍘藉┑鈽嗗灠閹碱偆鐥椤法鎹勯崫鍕典純闂佸搫鐭夌紞渚�鐛Ο纭锋嫹閸偅鍋犻柨鐔诲Г鐢繝寮婚妸鈺傚亜缂備焦锕╁Λ鍕磽娴ｅ搫孝缂佸鎳撻悾鐑藉即閵忥紕鍔堕悗骞垮劚閹虫劙鎮块崶顒侇棅妞ゆ劑鍨烘径鍕磼鐎ｎ偄鐏╃紒顔芥閵囨劙骞掗幘璺哄箥闂傚倷绶￠崣蹇曠不閹达箑鍑犻柕鍫濇川濡垶鏌熺憴鍕濞存粌婀辩槐鎺撴綇閵婏箑闉嶉梺鐟板槻閹虫﹢骞婇弽顓炵労闁告劑鍔庢导宀勬煢濡厧鏋涢柡灞剧洴椤㈡洟濡堕崨顔撅拷铏圭磽娴ｇ瓔鍤欐俊顐ｇ懇婵＄敻宕熼姘辩杸闂傚倸鐗婄粙鎴︼綖椤忓牊鐓熼幖娣灮閸熸煡鏌熼崙銈嗗?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绋荤紒缁樼箞婵拷闁挎稑瀚悾鐢电磽閸屾氨孝闁挎洦浜滈锝夘敃閿曪拷缁犺崵绱撴担鑲℃垵鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�?闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋涢ˇ鐢稿极閹剧粯鍋愰柤纰卞墻濡茬兘姊绘担鐟邦嚋婵炲弶鐗犲畷鎰板箹娴ｅ摜锛滈梺闈涱焾閸庡秷銇愰幒鎾充汗閻庣懓澹婇崰鏍礈妤ｅ啯鈷戦弶鐐靛椤﹂绱掗懜闈涘摵鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷� 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘靛幀闂佸吋浜介崕鎶藉煡婢舵劖鎳氶柡宥庡幗閻撴洘绻涢幋婵嗚埞妤犵偞锕㈤弻銊モ槈濞嗘垶鍣紓浣虹帛缁诲牓骞冩禒瀣棃婵炵顔愮紞渚�寮诲☉銏犵厸濞达絽鎲″▓濠氭⒑鏉炴壆鍔嶉柟鐟版喘楠炲﹪鎮欓崫鍕庛劎鎲稿澶婄厱鐎癸拷閸曨剙锟界敻鎮峰▎蹇擃仾缂侊拷閿熶粙姊虹紒妯煎ⅹ闁靛牊鎮傛俊瀛樻媴閼叉繃姊归幏鍛存偡闁讣鎷烽幘缁樷拺闁告稑锕﹂幊鍐┿亜閿旇鐏﹂柟顖欐祰椤﹁鎱ㄦ繝鍌ょ吋鐎规洘甯掗埢搴ㄥ箳閹存繂鑵愮紓鍌氬�风欢锟犲闯椤曪拷瀹曞湱鎹勬笟顖氭婵犵數濮甸懝鐐劔闂備焦瀵уΛ浣规叏閵堝鍋熼柣鎴ｅГ閻撴瑩鏌ら崷顓烆暭鐟滄妸鍛＜闁圭粯甯楅崑銉╂煙椤栨氨鐒哥�规洖宕—鍐磼濡粯婢戦梻鍌欒兌缁垶鏁嬮悗娈垮枦閸╂牕顕ラ崟顖氱妞ゆ牗绋撻崢浠嬫⒑鐟欏嫬绀冩繛澶嬬洴瀵鈽夐姀锛勫幐闁诲繒鍋熼崑鎾剁矆閸愵亞纾肩紓浣诡焽濞插锟借娲栫紞濠囥�佸▎鎾村亗閹兼惌鍠楃紞鎾寸節绾板纾块柛瀣灴瀹曟劙寮撮悘鑽ゆ嚀椤繄鎹勯搹鐧哥幢濠电姷鏁告慨鏉懨洪妶鍥╀笉闁哄稁鐏愯ぐ鎺撳亹鐎瑰壊鍠栭崜楣冩⒑鏉炴壆顦︾紒澶屾暩閹广垹鈹戠�ｎ偒妫冨┑鐐村灦閻熝囧Χ閳哄倻绠鹃悗鐢殿焾琚ラ梺鍝勬噽婵挳锝炶箛娑欐優閻熸瑥瀚壕顖炴⒑闂堟侗鐒鹃柛搴㈢叀閹ɑ绗熼敓钘夘潖濞差亜浼犻柛鏇ㄥ墮椤庢盯姊虹粙娆惧剰闁挎洦浜濇穱濠勶拷娑櫳戞刊鎾煕閿旇骞橀柣锕�鐗撳铏圭矙閹稿孩鎷卞銈冨妼濡繈骞冨锟藉畷姗�濡搁姀鈩冩澑闂備胶绮崝鏍ь焽濞嗘挻鍊堕柨鏇炲�归悡銉╂煛閸ャ儱濡煎ù婊�鍗抽弻鐔兼惞椤愶絽纾冲Δ鐘靛仦閸旀牠骞嗛弬搴撴婵°倕鍟板▔鍧楁⒒閸屾凹鐓柛瀣鐓ら柨鏇炲�哥粻浼存煟閹伴潧澧繛鍛█閺岋繝宕堕埡浣囥儳鐥幆褋鍋㈤柡灞诲姂閹垽宕滄担铏瑰幆闁诲氦顫夊ú鏍х暦椤掑嫬鐓″璺号堥弸搴ㄦ煙鐎涙绠撶紒鐘靛仱濮婂宕掑▎鎴犵崲濠电偘鍖犻崶浣告喘椤㈡﹢濮�閻樿尙锟筋參姊洪崨濠勭畵閻庢皜鍥у嚑鐎广儱顦伴悡娆撴煕閹炬鎳愰惁鍫㈢磽娴ｇ瓔鍤欐俊顐ｇ懇婵＄敻宕熼姘辩杸闂傚倸鐗婄粙鎴︼綖椤忓牊鐓熼幖娣灮閸熸煡鏌熼崙銈嗗
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繛鎴欏灩缁狅綁鏌ｉ幇銊︽珕闁挎稑鐗嗛埞鎴︽倷閸欏鏋欐繛瀛樼矋缁诲牆顕ｉ幓鎺嗘斀閻庯綆鍋嗛崢閬嶆煟韫囨洖浠ч柛瀣崌閹啴骞嬮悙顏冪盎闂佸搫鍊圭�笛囧吹閸ャ劍鍙忓┑鐘插暞閵囨繃淇婇銏犳殭闁宠棄顦～婵嬵敆婢跺鐦掓繝纰夌磿閸嬫垿宕愯閿熶粙娼ч惌鍌氱暦閻熸壆鏆﹂柛銉戝啰浜板┑鐘垫暩婵敻鎳濋崜褏鐭嗛柛鎰典悍閹风兘鎮烽弶娆炬闂佸摜濮靛畝绋跨暦椤掑嫭鍋ㄩ柛娑樑堥幏娲⒑缁嬭法绠伴柛姘儔瀹曟劙骞囬鐘殿啎婵炶揪绲介崯璺拷姘煎弮瀹曪綀绠涘☉娆戝幈濡炪倖鍔х徊鎸庝繆閸ヮ剚鐓涢柨鐔剁矙閹崇偤濡烽敐鍕泿闂備礁鎼崯顐﹀磹閻熸壋鏋嶉柡鍥ュ灪閻撶喐銇勯幘璺烘瀻缂佹宀搁弻鐔哥瑹閸喖顬夌紓浣虹帛缁诲牆鐣烽幒妤�围闁搞儜鍕拷顖炴⒑鐠囧弶鍞夋い顐㈩槸鐓ゆ慨妤嬫嫹闁轰礁鍟存慨锟介柕鍫濆枦閹烽攱绗熼敓钘夘嚕椤曪拷瀹曠厧鈹戦崼顐Ｐу┑锛勫亼閸婃牜鏁幒妤�纾归柣鎴ｅГ閻掕姤銇勯弽顐沪闁抽攱甯￠弻娑氫沪閸撗勫櫘濡炪倧璁ｇ粻鎾诲蓟閻斿搫鏋堥柛妤冨仒缁ㄥ鏌ч懡銈呬沪缂佺粯绻堝Λ鍐ㄢ槈濞嗗繒鐛╂俊鐐�愰弲婊堟偂閿熺姴钃熸繛鎴欏焺閺佸啴鏌ㄥ┑鍡橆棤妞わ富鍙冮幃妤冩喆閸曨剙鐭紓浣藉煐瀹�鎼佺嵁閸愩剮鏃堝川椤旇姤鐝抽梺纭呭亹鐞涖儵宕滃┑瀣�堕柛顐犲灮绾捐棄霉閿濆懏鎯堥弽锛勭磽娴ｅ壊鍎愰悽顖楀墲娣囧﹪鎮界粙璺槹濡炪倖鐗楀銊╊敊婵犲洦鍊垫鐐茬仢閸旀碍绻涢弶鎴濓拷绋垮祫濡炪倖娲╅幏閿嬫叏婵犲啯銇濈�规洦鍋婂畷鐔兼濞戞ê螚闂傚倷鑳堕幊鎾诲吹閺嶎厼绠柨鐕傛嫹
			if(team.getTeamLeaderId()!=id){
				qCRoleInfoDes.teamnum=0;
				qCRoleInfoDes.teamnummax=0;
			}else{
				qCRoleInfoDes.teamnum=team.getNormalMemberIds().size();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顕�姊哄Ч鍥э拷銈夊窗閺嶎厽绠掗梻浣侯焾缁绘劙宕ョ�ｎ剛绀婇柟瀵稿Х绾惧ジ鏌熼柇锕�寮炬繛鍫燂耿閺屻劑鎮㈢紒姗嗘缂備胶濮寸粔鐟扮暦閺囥垹纭�闁诲繒绮浠嬪极閸愵喖纾奸柨鏂垮⒔閳笺倝姊绘担鍛婃儓婵炲眰鍨藉畷鐟懊洪鍛簵闂佺粯鏌ㄩ崥瀣偂濞嗘挻鈷戞い鎾卞妿閻ｉ亶鏌ｈ箛銉хМ闁哄本鐩、鏇㈩敃閿涘嫮娉块梻鍌氭搐椤︽壆鎹㈠┑鍥╃瘈闁稿本纰嶅▓鍓佺磽娴ｅ壊妲规俊鐐扮矙瀵鍨惧畷鍥ㄦ畷闂佽法鍠嶇划娆忕暦娴兼潙鍐�妞ゆ挾濮寸粊锕傛⒑缁洖澧查柛鎴犳嚀鍗卞┑鐘崇閳锋垿鏌涘┑鍡楊仾妞ゃ儮锟芥剚娓婚悗娑櫳戦崐鎰攽閿涘嫭鏆�规洜鍠栭、娑樞掓担鍐叉处閻撴洘绻涢幋婵嗚埞闁哄绋掔换娑㈠椽閸愵亞袦濠殿喖锕ら…宄扮暦閹偊妾ㄥ┑鈩冨絻濠�杈╂閹烘梻纾兼俊顖濆亹閻ｈ櫣绱撴担铏瑰笡缂佽鐗嗛悾鐑藉箳閹存梹顫嶅┑鈽嗗灡濡炴寧绂掗埡鍛拻闁稿本鐟чˇ锕傛煙鐠囇呯瘈鐎殿喖顭锋俊鎼佸煛婵犲啯娅堝┑鐘灱閸╂牠宕濋弴銏″珔闁绘柨鍚嬮悡銉╂煟閺傛寧鎯堢�涙繂螖閻橀潧浜奸柛銊︽そ婵＄敻宕熼姘鳖啋闁荤姾娅ｉ崕銈夋倵鐠囧樊娓婚柕鍫濇嚇閻涙粓鏌熼崙銈嗗
				qCRoleInfoDes.teamnummax=TeamManager.MAX_MEMBER_COUNT+1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顕�姊哄Ч鍥э拷銈夊窗閺嶎厽绠掗梻浣侯焾缁绘劙宕ョ�ｎ剛绀婇柟瀵稿Х绾惧ジ鏌熼柇锕�寮炬繛鍫燂耿閺屻劑鎮㈢紒姗嗘缂備胶濮寸粔鐟扮暦閺囥垹纭�闁诲繒绮浠嬪极閸愵喖纾奸柨鏂垮⒔閳笺倝姊绘担鍛婃儓婵炲眰鍨藉畷鐟懊洪鍛簵闂佺粯鏌ㄩ崥瀣偂濞嗘挻鈷戞い鎾卞妿閻ｅ崬顭胯閸ㄥ爼寮婚悢纰辨晬婵ê宕埅鐢告⒑鐠団�虫灍妞ゃ劌鎳橀敐鐐测攽鐎ｎ偄锟介攱銇勯幒鐐村濡炪倕楠忛幏锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉骞夐幖浣瑰亱闁割偅绻勯悷鏌ユ⒑缁嬫鍎忔い锔炬暬瀵寮撮敍鍕澑闁诲函缍嗘禍鐑藉箯閻戣棄鍗抽柣妯烘▕濡粓姊虹粙璺ㄧ闁稿鍔楃划缁樸偅閸愨晝鍘甸柣搴ｆ暩椤牊绂掕閵囧嫰鏁愰崼婵堟缂備浇椴哥敮鈩冧繆濮濆矈妲绘繛瀵稿Ь妞存悂骞堥妸锔剧瘈闁告洦鍘肩粭锟犳⒑閻熸澘妲婚柟铏悾鐑筋敃閿曪拷缁�瀣亜閹捐泛娅忛柛姘喘濮婂宕掑▎鎺戝帯闂佺娅曢幑鍥х暦閻㈢鍐�妞ゆ挾鍋熼鍡涙⒑鐠恒劌娅愰柟鍑ゆ嫹?
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

