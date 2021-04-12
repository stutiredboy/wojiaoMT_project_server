
package fire.pb.move;
import java.util.List;


import fire.pb.move.Pos;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;
import fire.pb.scene.sPos.Position;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCheckMove__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CCheckMove extends __CCheckMove__ {

	@Override
	protected void process() {
		final Role role = RoleManager.getInstance().getRoleByProtocol(this);
		if(null == role) return;
		if(null == role.getScene()) return;
		
		final long curTick = System.currentTimeMillis();
		if(! role.checkValidFrequency(curTick)){
			return;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垻绮穱濠囨倷椤忓嫸鎷烽弽顓熷亱婵°倕鍟伴惌娆撴煙閻愵剛婀介柨鐔绘閹虫ê鐣烽敐鍡楃窞鐎癸拷閿熶粙鎯侀崼鐔虹瘈闁汇垽娼у瓭闂佺锕︾划顖炲疾閸洖鍗抽柣妯兼暩閿涙粓姊虹紒妯兼嚂闁归鍏橀弻娑㈠Ω閵壯冪厽閻庢鍠栭…鐑藉极閹邦厼绶炲┑鐘插閸氬懘姊绘担鐟邦嚋缂佽鍊块獮澶娾槈閵忕姷顔掔紓鍌欑劍椤洭宕㈤柆宥嗙厽閹兼惌鍨遍敓濮愬劦瀹曠喖顢楅崒姘辩Р闂傚倸鍊风粈渚�骞栭锕�瀚夋い鎺炴嫹閻撱倖淇婇娆掝劅闁搞倖顨婇弻娑㈠即閵娿儻鎷烽悩缁樺亜闁稿繐鍚嬮崕顏堟⒒娓氬洤浜濈紒瀣灩閿熸垝绲荤亸娆戞閹捐纾兼慨姗嗗墾閹烽攱顦版惔銏╁仺闂侀潧鐗嗛ˇ顖滅不椤栨粣鎷烽悷鏉款伃闁稿锕幃銏ゅ幢濞戞瑥浠梺鍛婄箓鐎氼剚绻涢崶顒佺厱妞ゆ劧绲鹃崕鏇㈡煥濠靛棭妲搁梺鍗炴喘閺屾洘寰勫☉姗嗘喘闂佸憡顭囬弫璇差潖閾忚瀚氶柍銉ョ－閿熻棄顭烽弻娑橆煥閸愩劍娈剁紓渚婃嫹濠电姴娲﹂埛鎴︽煕濠靛嫬鍔氶柡瀣⒐閵囧嫰顢橀悙闈涒叺闂佺硶鏅濋崑銈夌嵁鐎ｎ喗鏅滈柦妯侯檧閹风兘鎮滈懞銉у幐婵犮垼娉涢鍛存倶閳哄懏鐓曢柡鍌涘閸熺偟绱掔紒妯笺�掗柨鐔诲Г缁嬫帡鈥﹂崶顒佸剹闁靛牆鎮块悷閭︾叆閹煎瓨绻堥崑妤呮⒑鐠団�虫灆闁告濞婇妴浣割潩閼稿灚娅㈡繛瀵稿Т椤戝懘寮告笟锟介弻鐔煎礈瑜忕敮娑㈡煛閸涱喗鍊愰柡灞诲姂閹倝宕掑☉姗嗕紦?
		}
		
		checkmove(role, sceneid, curpos, poslist,curTick);
		
	}
	
	public static boolean checkmove(Role role,long sceneid, fire.pb.move.Pos curpos,List<fire.pb.move.Pos> poslist, long curTick)
	{
		if(role.getScene().getSceneID() != sceneid) return false;
		
		if(! role.checkMoveUnit())
		{
			//Scene.logger.debug("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠為柟钘夊�婚敓鏂ょ秵閸犳牠鎮欐繝鍐︿簻闁硅櫣鍋炵�氬湱绱撴担鍝勵�岄柛锝忕秮瀵鏁撻悩鑼紲濠碘槅鍨崇亸銊╁箯瀹勬嫈鏃堝礃椤忓棛鍘梻濠庡亜濞诧箓骞愰幘顔肩哗濞寸姴顑呯粻鎶芥煙閹増顥夌痪鎯х秺閺岋繝宕堕妷銉т患缂備胶濮锋繛锟介柣鎿冨亰瀹曞爼濡歌濡插牓姊洪崨濠呭婵狅拷闁秵鏅搁柣锝呮湰椤忕喖鏌熸搴″幋闁哄本鐩鎾Ω閵夈儺娼鹃梻浣告啞钃遍柟顔煎�垮濠氭晲閸垻鏉搁梺鍝勬川閸嬫﹢宕Δ锟介—鍐Χ閸℃鍋侀梺鎼炲劀閸滀焦啸濠电姷鏁告慨鎾晝閵堝绠犻煫鍥ㄧ☉绾惧鏌″鍐ㄥ缂佲槄鎷烽梻鍌氬�搁悧濠勭矙閹烘埈鍟呮繝闈涚墢绾惧ジ鏌ｅΟ鍨惞闁伙絾妞介弻鐔碱敊缁涘鐤侀梺璇″枦濡嫰鍩㈤幘鑸靛磯闁靛鍎辨瓏闂傚倷鐒﹂惇褰掑春閸曨垰鍨傞柣妤�鐗婂▍鐘诲箹鏉堝墽绋绘い顐ｆ礋閺岀喖鎮滃Ο璇茬缂備礁澧庨崑銈夊箖濡ゅ懏鏅查幖瀛樼箘閹稿姊洪崫鍕靛剱闁荤啿鏅涢～蹇涙惞鐟欏嫬鍘归梺鍛婁緱閸犳俺銇愯濮婃椽鎳￠妶鍛瘣闂佸搫鎳愭慨鎾敋閿濆鏁冮柨鏇嫹缂佺姾宕电槐鎾存媴閼测剝鍨甸埢宥夊閵堝棌鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷, 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ鐐电磽娴ｇ晫鍫柛濠冪箞瀵鏁冮敓鍊熺亽闂佺粯鑹鹃顓犵矆閸℃せ鏀介柣鎰綑閻忥箓鎳ｉ妶澶嬬厸闁跨喕濮ょ粋鎺旓拷锝庡亞閸橀亶姊洪搹顐ｅ珪闁归鍏橀弻锟犲川椤斿墽鐤勯悗瑙勬礃缁诲倿鎮鹃敓鐘崇劷闁挎棁妫勯惁婊堟⒒娓氾拷濞佳囨偋閸℃稑绠犻柟閭﹀枤娑撳秴霉閻撳海鎽犻柣鎾跺枑娣囧﹪濡惰箛鏂款伓闂備焦瀵уú锔界椤忓嫮鏆﹂柛婵嗗濡插牓鏌曡箛鏇炐ユい鏃�甯炵槐鎾诲磼濞嗘垵濡藉銈庡幖濞差厼鐣烽姀锛勵浄閻庯綆鍋�閹锋椽姊洪崨濠勭畵閻庢凹鍓熼弫鎾绘嚍閵夛箑锟芥劙鏌熼鐭亪鍩為幋鐙呮嫹閿濆簼绨介柣锝嗘そ濮婃椽鎮烽柇锕�娈堕梺绋款儑閸嬨倕鐣烽敐鍫㈢杸婵炴垶鐟ч崣鍡椻攽閻樼粯娑ф俊顐ｇ懇钘熸繝濠傚暊閺�鑺ャ亜閺冨洤浜归弫鍫ユ⒑閸濆嫮鐒跨紒杈ㄦ礃缁傛帡鏁冮崒姘鳖槶閻熸粌顦嵄闁割偁鍎查埛鎴︽倵閸︻厼顎岄柛銈嗙懇濮婅櫣鏁鍓滈梺缁樹緱閸ｏ絽鐣烽崼鏇ㄦ晢濠㈣泛顑嗗▍宀勬⒒娴ｄ警鐒鹃柡鍫墴閹兘鏁冮崒姗堟嫹娴ｈ倽鐔烘偘閳╁啯鏉搁梻浣虹帛閿氶柣蹇斿哺瀵娊鍩￠崨顔惧幈闁诲函缍嗛崑鍡椕洪弶鎴旀斀闁炽儱鍟块。宕囩磼椤旂晫鎳冮柍璇查叄瀹曟粏顦插┑顔芥そ閺岋綁鎮㈤崫銉х厑闂佹悶鍔屽锟犵嵁閸愵煈娼ㄩ柨鐔剁矙瀵偊骞樼紒妯绘闂佽法鍣﹂幏锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊璁查弸娆撴⒑缂佹ê绗╁┑顔哄�楅幑銏犫槈閵忕姴鑰垮┑鈽嗗灣缁垶宕曟惔銊︹拺閺夌偞澹嗛ˇ锕傛倵濮橆偄宓嗙�殿喛顕ч埥澶愬閻橀潧濮堕梻浣告啞閸旓附绂嶅┑瀣棷妞ゆ洩鎷锋慨濠傛惈鐓ら悹鍥ㄥ絻缁犳椽姊洪崷顓熷殌婵炲樊鍘奸锝嗙節濮橆厽娅滄繝銏ｆ硾閿曪箓顢樺ú顏呪拺闁圭娴风粻鎾翠繆椤愵偄骞栭摶鐐烘煕閺囥劌骞樼痪鎹愭闇夐柨婵嗘噺閹牓寮介敓鐘崇厽闁靛繆鏅涢悘鑼磼缂佹绠撴い鏇稻缁绘繂顫濋鐔哥彸濠电姰鍨煎▔娑滅檶闂侀潧艌閺呮粓鎮¤箛鎿冪唵闁肩绶遍鍕ㄦ瀺婵炲棙鎸婚悡娆忣渻鐎ｎ亪顎楅柛妯绘尦閺屸剝鎷呯憴鍕３闂佽桨鐒﹂幑鍥极閹剧粯鏅搁柨鐕傛嫹" + role.getName() + "\t" + role.getTeamIndex());
			return false;
		}
		
		if (!role.canMove())
		{
			role.confirmCurPosition();
			return false;
		}
		
		if(role.isJumping())
		{
			//role.getJumpRole().confirmPositionToStart();
			return false;
		}
		
		int z = role.getPos().getZ();
		final Position destPos = new Position(curpos.x, curpos.y, z);
		final java.util.List<Position> positions = new java.util.ArrayList<Position>();
		positions.add(role.getPos());// 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰绠绘鐐村灴婵拷闁靛牆鎳愰悿锟芥俊鐐�栧Λ浣肝涢崟顒佸劅濠电姴娲﹂埛鎴犳喐閻楀牆绗掑ù婊�鍗抽弻娑欐償閵婏附閿梺瀹犳椤︻垵鐏掗梻浣哥仢椤戝洭鏁撻挊澶樼吋婵☆偄鎳橀、鏇㈠閳ュ啿浜堕梻浣侯焾鐎涒晠骞愰幎钘夋瀬闁瑰墽绮�电姴顭跨捄渚剰濞寸姵鎸冲娲传閸曨剚鎷遍梺鐑╂櫓閸ㄨ鲸绌辨繝鍥ㄥ�荤紒娑橆儐閺呪晠姊虹紒妯诲碍閻庡灚甯掗…鍥嚒閵堝洨锛濋梺绋挎湰閻熝呯驳韫囨稒鐓欑�瑰嫭婢樺Σ缁樸亜椤撶偞鍋ラ柟铏矒濡啫鈽夊鍡樼秾闂傚倷鑳剁划顖炲箰閹间礁鐤柟缁㈠枛閽冪喖鏌￠崶鈺佹瀻缂佸墎鍋ら弻娑㈩敃閿濆洨鐣靛銈庡墮椤﹂潧顫忛搹鍦＜婵☆垵鍋愰鍏肩箾鐎涙鐭ゅù婊庝簻椤曪絾绻濆顓熸珳闂佸憡渚楁禍婵嬪棘閿熶粙姊绘担鍛婂暈婵炶绠撳畷鎴﹀箻鐠囪尙顔嗛梺缁樺灱濡嫰宕￠幎鑺ョ厪闊洦娲栧暩闂佸憡鐟遍幏閿嬬節閻㈤潧袨闁搞劌銈稿畷娲冀椤撶偟顦梺鍝勬川婵攱绋夊澶嬬厾濠殿喗鍔曢敓鑺ヮ殘婢规洟宕楅懖鈺冾啎闂佺懓顕崑鐔笺�傞弻銉︾厱闁靛牆绻戠�氳绻濋悽闈浶ｆい鏃�鐗犲畷鏉课旈崘顏嗙厯闂佺鎻粻鎴︽偂濮楋拷閺岀喐娼忔ィ鍐╊�嶉梺绋匡功閸忔﹢寮婚妶鍥ф瀳闁告鍋涢～鈺侇渻閵堝啫锟窖囧箯閻戣姤鈷掗柛灞剧懅閸斿秹鏌熼鑲╁煟鐎规洘绻傞悾婵嬪礋椤愬瑪鍥ㄧ厱婵炴垶锕妤冪磼鐠囧弶顥㈤柡宀嬬秮婵拷闁靛繆鏅濋崝鍝ョ磽娴ｅ搫校闁烩晩鍨跺濠氬焺閸愩劎绐為柟鍏肩暘閸ㄥ濡存繝鍌ゆ富闁靛牆妫欓埛鎰版偨椤栨鎷烽幇浣圭稁濠电偛妯婃禍婊冾啅濠靛棌鏀介柣妯诲絻閿熻姤鎮傞敐鐐典沪鐟欙絾鏂�闂佸疇妫勫Λ妤呮倶閻樼粯鐓ラ柡鍥ュ妺缁ㄧ粯銇勯弴顏嗙М妤犵偞鐗楅幏鍛喆閸曨剦浠ф繝鐢靛仜椤曨厽鎱ㄩ幘顕呮晞闁糕剝绋戦悡鏇㈡煙閻戞ê娈憸鐗堝笚閺呮彃顭块懜鐬垿藟閺嶃劎绠鹃柟瀵稿仦鐏忎即鏌ｉ幙鍕瘈鐎殿喖顭烽幃銏ゆ偂鎼达綆妲遍梻渚�娼ч悧鍡椢涘Δ鍜佹晜闁跨噦鎷�? 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鍨傚Δ锝呭暙缁犳稑霉閿濆懏璐＄紒瀣╄兌缁辨捇宕掑顒婃嫹閻戣姤鍊块柨鏇氱劍閹冲矂姊绘担鍛婂暈闁荤喆鍎抽幑銏狀潨閿熻棄顕ｆ繝姘亜闁惧繐婀遍敍婊堟⒑闂堟稓绠冲┑顔炬暬閹﹢宕奸妷锔规嫼濠电偠灏褔鐛Δ浣典簻闁靛鍎婚煬顒傦拷娈垮枦椤曆囧煡婢舵劕顫呴柣姗�娼ф慨鍫曟⒒娴ｅ憡鍟為柛鏃撻檮缁傚秹寮介‖顒婄秮瀹曞ジ濮�閵忣澁绱冲┑鐐存尰閼归箖鏁冮妷褝鎷峰顒傜Ш婵﹨娅ｉ崠鏍即閻愭祴鎷ゆ俊鐐�х粻鎾剁磽濮樿泛桅闁圭増婢樼粻鎶芥煙閹冨笭缂併劎鏁诲娲偡閺夋寧鍊梺璇″灠閻倸鐣锋导鏉戝唨鐟滃寮搁弮鍫熺厱妞ゆ劧绲剧粈鍐煕婵犲嫭鏆柟顔煎槻閳诲氦绠涢幙鍐х棯缂傚倷绀侀惌浣糕枖閺囩姵顫曢柟鐐墯閸氬鏌涢弴銊ュ箻闁绘稏鍨硅灃闁绘﹢娼ф禒婊堟煕閻旂鈻曞┑锛勬暬楠炲洭寮剁捄顭戝敽闂備胶鎳撻顓熸叏閹绢喗鏅搁柣锝呰嫰娴犺鲸鎱ㄦ繝鍐┿仢妤犵偞鍔栭幆鏃堝椤喚骞㈢紓鍌氬�风欢銈夊箯瀹勮埇锟芥帒顫濋悙顒�顏堕柣搴ゎ潐濞插繘宕规禒瀣瀬闁瑰墽绮崑鎰版煛閸屾ê鍔滈悗姘冲亹缁辨捇宕掑▎鎴М濡炪倖鍨靛Λ婵嬨�侀弽褉鏋庨柟鎯х－閿涚喎鈹戦悩璇у伐闁硅櫕鍔楁竟鏇㈡偩瀹�瀣妤犵偛鐏濋崝姘舵倵濮樼厧娅嶉挊婵嬫煥閺囩偛锟藉綊鎮￠悢鍏肩叆婵犻潧妫欓崳瑙勪繆閼碱剛甯涢柕鍥у椤㈡洟鏁愰崶鈺冩澖婵＄偑鍊戦崹娲�冮崱妤婂殫闁告洦鍙忛幏鐑芥晲鎼存繄鏁栧┑陇顕滅紞浣割潖婵犳艾纾兼繛鍡樺笒閸樷�愁渻閵堝啫鐏╅柨鏇ㄤ邯閺佹劙鎮欓弶鎴犵獮闂佸綊鍋婇崜娑⑺囬锟藉娲传閸曨剙鍋嶉梺鎼炲姀椤曆囨偩閸偆鐟归柨鐔剁矙瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷
		for(final Pos p : poslist)
			positions.add(new Position(p.x, p.y, z));
		
		final int length = destPos.getDistance(role.getPos());
		if(role.isJumping())
		{
			//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔曢顓犲姬閿熶粙姊哄Ч鍥х伈婵炰匠鍐懃闂備浇顕х�涒晝绮欓崼銉ョ柧婵炴垟鍋撻敓钘夋噺缁虹晫绮欑拠閿櫊閺屽秹宕崟顐嫹閻㈢绠繛宸簼閳锋垿鏌涢敂璇插季闁绘帞鍋撶换娑㈠箻椤曞懏顥栫紓渚囧枛椤兘鐛Ο鑲╃＜婵☆垳鍘ч獮宥夋⒒娴ｅ憡鍟為柛鏃�顭囨禍绋库枎閹寸姳绗夋繝鐢靛У绾板秹鎮￠悢鍏肩厵闁割煈鍠栭弳娆忣熆瑜嶉悺銊╁Φ閸曨垰顫呴柍钘夋閻や線鎮楃憴鍕闁哥姵鐗犻妴浣肝旈崨顔芥闂佸吋浜介崕鎶姐�呴柨瀣ㄤ簻闁哄稁鍋勬禒锕傛煃闁垮鐏撮柡灞剧☉閳藉顫滈崼婵嗩潬缂傚倷鑳舵慨鐢稿箲閸ヮ剙绠栨俊銈忔嫹妞ゎ偅绻堥幃鈩冩償閵忋垹缍嗛梺璇插椤旀牠宕板Δ鍛畺闁稿本姘ㄩ弳锔芥叏濡ゅ瀚瑰銈冨灪濡啫鐣烽崡鐐╂瀻婵炲棙鍨电花銉╂⒒娴ｇ瓔鍤欐繛鏉戝槻閳诲秹濮�閵堝懐顔嗛梺缁樺灱婵倝宕愰悽鍛婄叆婵犻潧妫濋妤�霉濠婂嫮鐭嬮柕鍥у缁犳盯濡烽敃锟介锟�
			if(!role.getJumpRole().checkValidJump(positions, destPos))
			{
				role.getJumpRole().confirmPositionToStart();
				return false;
			}
		}
		else
		{
			// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囨煕閵夈垺娅囬柛妯煎█濮婄粯鎷呴搹鐟扮闂佹悶鍔岄悥鐓庮嚕閹间焦鍤掗柕鍫濇川椤︻垶姊洪崫鍕檨鐎癸拷閿熶粙宕悽鍛婄厽闁绘鍎ら鐘绘倶韫囧濮傜�规洘绻堥幃銏ゅ礂閼测晛骞愰梻浣虹《閸撴繈宕濋弴銏℃櫢闁兼亽鍎茬粈瀣節閿熻姤绗熼敓钘夘潖濞差亜绠伴幖杈剧悼閻ｉ潧鈹戦悙鑼勾闁稿﹥绻傞悾宄扳攽閸剚瀚归柨婵嗛婢ч箖鏌熼悜绛嬫闁瑰弶鎸冲畷鐔碱敆閸屻倖袣濠碉紕鍋戦崐褏绱撳璺虹闁惧浚鍋傜换鍡涙煟閵忋埄鐒剧紒锟界�ｎ偁浜滈柡宥冨姀婢规﹢鏌涢悙顏勫婵﹥妞藉Λ鍐归妶鍡欐创鐎规洏鍔戦、娑橆潩椤掑倻鎲挎繝鐢靛Х閺佸憡鎱ㄩ悜钘夋瀬闁归棿绀佺壕缁樼箾閹存瑥鐏柛瀣儔閻擃偊宕堕妸锔规嫽缂備胶濞�缁犳牠寮婚妸鈺傚亜閻犲洦鐣幘缁樼厵濞撴艾鐏濇俊鐣岀磼缂佹绠炵�规洘甯℃俊鍫曞炊瑜庨崐顖炴⒒閸屾瑦绁版俊妞煎姂閹偤鏁冮崒姘鳖唶闂佺厧顫曢崐妤呮儗婢舵劖鐓欓柣鎴炆戦ˉ鏍煙妞嬪骸鍘撮柡浣瑰姈閹柨鈹戦崼銏℃櫒闂傚倷娴囬褏锟藉灚甯″畷銏＄附缁洩鎷烽弮鍫濈妞ゆ柨妲堣閺屾盯鍩勯崗锔藉哺楠炲繑绻濆顓涙嫼闂佸憡鍔栬ぐ鍐ㄎｆ繝姘厽婵°倓鐒︾亸顓㈡煟閿濆洤鍘存い銏☆殜閺佹捇鎮剧仦钘夌柧濠碉紕鍋戦崐鏇犳崲閹版澘绠犻柟鐗堟緲閸屻劑鏌涘☉姗堝姛缂佲槄鎷烽梻渚�娼ф蹇曞緤閸撗勫厹闁绘劦鍏涚换鍡樸亜閹板墎鎮奸柟鍐插暣閺屽秶鎷犻懠顑咃拷瑙勬礀瀹曨剟鍩㈡惔銊ョ闁绘瑥鎳愭惔濠囨⒒娴ｇ瓔鍤欓柛鎴犳櫕缁辩偤宕卞☉妯硷紱闂佺硶鍓濊摫婵炲懐濞�閺岋綁濮�閻樺啿鏆堥梺缁樻尭缁绘﹢寮诲☉銏犵労闁告劏鏅濋ˇ顓犵磽娴ｇ懓濮堟慨濠傜秺閵嗗啴濡烽埡鍌氾拷椋庯拷鐟板閸犳牠宕滈崼鏇熲拺閺夌偞澹嗛ˇ锕傛煕婵犲倹鍋ユ鐐插暣瀹曟粏顦辨繛宀婁邯閺岋箑螣閻氬绀婇梺闈涱槴閺呮粓鍩涢幒妤佺厱閻忕偛澧介幊鍡涙煕韫囨挾鐏辩紒杈ㄥ浮椤㈡岸宕ㄩ鐘辨闁诲孩顔栭崰鏍�﹂柨瀣╃箚闁归棿绀侀悡娑樏归敐鍛喐闁告繂閰ｅ缁樻媴閸涘﹥鍎撻柣鐐村嚬閸嬪﹤鐣烽弴鐏绘椽顢旈崟顒傦拷顒佺節閻㈤潧孝闁稿﹦鏁诲銊︾鐎ｎ偆鍘藉┑鈽嗗灠閹碱偆鐥椤法鎹勯崫鍕典純闂佸搫鐭夌紞渚�鐛Ο纭锋嫹濞戞瑯鐒芥い锔垮嵆濮婃椽宕崟顓犱紘闂佸摜濮甸悧鏇㈡偩閻戠瓔鏁冮柨鏇嫹缂侊拷鐎ｎ喗鈷掗柛顐ゅ枔閳藉顭块悷鎵ⅵ婵﹦绮幏鍛存嚍閵壯侊拷濠囨⒑閸濄儱校婵炲弶锕㈤獮鍫ュΩ閳轰絼褍顭跨捄渚剰濞存粓浜跺铏圭磼濡浚浜滆灒濠电姴娲ら崥褰掓煛閸モ晛浜归柡锟芥禒瀣厽婵☆垵娅ｉ敍宥嗐亜閿濆棛鍙�闁哄矉绻濆畷銊╊敊閽樺鎷烽幇鐗堢厸閻忕偠顕ф慨鍌炴煙椤斿搫锟芥繂鐣烽幒鎴旀婵妫旂槐锟�
			int cruiseid = role.getCruiseid();
			if(! role.checkValidMove(cruiseid, positions, destPos, curTick, length))
			{
				role.confirmCurPosition();
				return false;
			}
		}
		role.move(destPos);
		if(!role.isJumping())
			SceneBattle.process(role, length, curTick);
		return true;
	}
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 790435;

	public int getType() {
		return 790435;
	}

	public fire.pb.move.Pos curpos; // 人物当前点
	public java.util.LinkedList<fire.pb.move.Pos> poslist; // 路径上的关键点
	public long sceneid; // 场景id

	public CCheckMove() {
		curpos = new fire.pb.move.Pos();
		poslist = new java.util.LinkedList<fire.pb.move.Pos>();
	}

	public CCheckMove(fire.pb.move.Pos _curpos_, java.util.LinkedList<fire.pb.move.Pos> _poslist_, long _sceneid_) {
		this.curpos = _curpos_;
		this.poslist = _poslist_;
		this.sceneid = _sceneid_;
	}

	public final boolean _validator_() {
		if (!curpos._validator_()) return false;
		for (fire.pb.move.Pos _v_ : poslist)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(curpos);
		_os_.compact_uint32(poslist.size());
		for (fire.pb.move.Pos _v_ : poslist) {
			_os_.marshal(_v_);
		}
		_os_.marshal(sceneid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		curpos.unmarshal(_os_);
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.move.Pos _v_ = new fire.pb.move.Pos();
			_v_.unmarshal(_os_);
			poslist.add(_v_);
		}
		sceneid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CCheckMove) {
			CCheckMove _o_ = (CCheckMove)_o1_;
			if (!curpos.equals(_o_.curpos)) return false;
			if (!poslist.equals(_o_.poslist)) return false;
			if (sceneid != _o_.sceneid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += curpos.hashCode();
		_h_ += poslist.hashCode();
		_h_ += (int)sceneid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(curpos).append(",");
		_sb_.append(poslist).append(",");
		_sb_.append(sceneid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

