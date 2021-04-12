
package fire.pb.team;
import java.util.Arrays;

import fire.pb.fushi.DayPayManager;
import fire.pb.main.ConfigManager;
import fire.pb.talk.ChatChannel;
import fire.pb.talk.ChatMsgId;
import fire.pb.talk.LastChatTime;
import fire.pb.talk.MessageMgr;
import fire.pb.util.FireProp;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __COneKeyTeamMatch__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鍝勫閸庨亶鍩為幋锔藉亹闁告瑥顦伴幃娆戠磽娴ｅ搫顎岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欓煫顓犳晼闂備浇妗ㄧ粈浣猴拷姘煎幘閹广垹鈽夐姀鐘茶�垮┑鈽嗗灥椤曆呭枈瀹ュ洨纾藉ù锝囨嚀婵牊銇勯妸銉含鐎殿喖顭烽崹楣冨箛娴ｅ憡鍊梺纭呭亹鐞涖儵鏁撻挊澶岋紞妞ゆ梹鍔欏缁樻媴閸涘﹤鏆堥梺鎼炲姀椤鎹㈠☉銏℃櫢濞寸姴顑嗛悡娑㈡倶閻愭彃鈷旀繛鎻掔摠閵囧嫰濮�閳╁啰顦伴梺璇″枓閺呯娀骞婇悩娲绘晞閻犳亽鍔嶉敍蹇涙⒒閸屾瑦绁版い鏇嗗拑鎷峰☉鎺撴珚闁诡喓鍨介、妤呭礋椤愩値鍞甸梻浣芥硶閸ｏ箓骞忛敓锟�?
 * @author by changhao
 *
 */
public class COneKeyTeamMatch extends __COneKeyTeamMatch__ {
	@Override
	protected void process() {
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		/*闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鍨傚Δ锝呭暙缁犳稑霉閿濆懏璐＄紒瀣╄兌缁辨捇宕掑顒婃嫹閻戣姤鍊块柨鏇炲�甸敓鏂ょ畵瀹曞爼鍩￠崘褏鐟濆┑掳鍊х徊浠嬪疮椤栫偞鍋傞柕澶嗘櫆閻撶喖鏌￠崒姘变虎妞わ絾濞婇弻锝夘敇閻旂儤鍣伴梺鍝勫閿熻棄纾弳鍡涙倵閿濆骸澧伴柣锕�鐗撳鐑樻姜閹殿喖濡介梺瑙勭摃瀹曠數鍒掔�ｎ喖绠抽柡鍐╂尰鐎氬綊鏌ㄥ┑鍡涱�楀ù婊勭箖缁绘盯宕ㄩ鍓х厜濠殿喖锕ㄥ▍锝夊礌閺嶎厼鍗抽柣鎰ゴ閹枫倝姊绘担鍛婂暈婵﹤婀遍弫顕�鎮欓悜妯烘疅闁哄鐗勯崝搴ｅ姬閿熻棄鈹戦鏂や緵闁告ɑ鎮傞獮蹇撁洪鍛嫼闂佸憡绋戦敃锕傚煡婢舵劖鐓ラ柡鍥朵簻椤╊剛绱掗纰辩吋妤犵偞顭囩槐鎺懳熼悮瀛樺闁割煈鍋呴崣蹇斾繆椤栨粌甯堕悽顖氱埣閺岋紕锟斤絻鍔岄敓鑺ョ箞瀵鈽夐姀鈥充汗闁荤姴娉ч崱妤佸創闂傚倷娴囧銊╂倿閿曞倸绠查柛銉墮閺嬩線鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓 team->roleid->match by changhao*/
		mkdb.Procedure onekeyteammatch = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				
				fire.pb.team.SOneKeyTeamMatch msg = new fire.pb.team.SOneKeyTeamMatch();
				if (channeltype != fire.pb.talk.ChannelType.CHANNEL_TEAM_APPLY &&
					channeltype != fire.pb.talk.ChannelType.CHANNEL_WORLD &&
					channeltype != fire.pb.talk.ChannelType.CHANNEL_CURRENT &&
					channeltype != fire.pb.talk.ChannelType.CHANNEL_CLAN)
				{
					msg.ret = 1;
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					return false;
				}
				
				//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垹绠婚悗闈涙啞閸Ｑ冾渻閵堝棙绌跨紒韫矙閹箖鏁撻悩宕囧姺闂佹寧妫佸Λ鍕儊濠婂牊鈷掑〒姘炬嫹婵炰匠鍥ㄥ亱闁糕剝銇傚☉妯锋婵炲棙鍔栭悵宄邦渻閵堝棗绗掗悗姘煎弮閹繝鎮╃紒妯轰画濠电偛妫楃换鎰邦敂閳哄啰纾奸柨鐔剁矙瀹曟﹢顢欓悾灞藉妇闂備焦鎮堕崕顖炲礉鐏炵偓鍙忕�广儱娴勯幏椋庢喆閸曨剛顦ラ悗瑙勬处閸撶喖鍨鹃弮鍫濈妞ゆ梻鍘у畵鍡涙⒑缂佹ê濮夐柡浣告啞椤ㄦ瑩姊虹拠鍙夊攭妞ゎ偄顦叅婵鎷烽柕鍡楀暞缁绘繈宕惰閻ゅ洤鈹戦悩缁樻锭妞ゆ垵鎳愰惀顏囶槼缂佺粯鐩畷鍗炩枎韫囧骸顥氭俊鐐�戦崕顖炲磹濠靛棭娼栨繛宸簼閸ゆ帡鏌曢崼婵囧櫤闁诲骸澧界槐鎾寸瑹閸パ勭亪缂備礁顦伴幐鎶藉灳閿曞倸鍨傛い鏇炴噺瀵ゆ椽姊虹捄銊ユ灆婵☆偄瀚伴幃楣冩倻閽樺鐤�闂佸搫顦锟犲极濠婂啠鏀介幒鎶藉磹瑜旈獮蹇涙倻閼恒儳鍙冮梺鍛婂姦娴滄粓寮稿☉銏＄厸閻忕偛澧介埥澶愭煃閽樺妯�鐎规洩绻濋幃娆戯拷鐢告櫜婢规洟姊婚崒娆愮グ鐎规洜鏁诲畷浼村箻鐠囪尙鐤囬梺瑙勫礃椤曆囨偂濮楋拷閺岀喐娼忔ィ鍐╊�嶉梺绋款儐閸旀瑩寮婚悢铏圭＜婵☆垵妗ㄩ崚濠冪箾鐎垫悶锟藉骞忓畡鎵虫斀闁挎稑瀚禍濂告煕婵炑冩嫅閹风兘妫冨☉姘卞姱閻庤娲樻繛濠囧极閹版澘妞藉ù锝呮贡缁嬩線姊绘担鍛婂暈缂佽鍊圭换娑欑節閸ャ劍鍎柣鐔哥懃鐎氼剟顢撳☉銏″�甸悷娆忓缁�锟藉┑鐐茬湴閸斿矂鍩㈤弮鍫濈閹煎瓨绻勭粻姘舵⒑缂佹ê濮﹀ù婊勭矒閺佹捇鎳為妷褍鈷岄悗瑙勬礀缂嶅﹤螞閸愵煁褰掑閳╁啨浠㈡繝寰枫倕鐓愮�垫澘瀚敓鏂ょ秵閸嬪懘鎮甸弽顓熲拻濞撴熬鎷锋繛浣冲懏宕查柛顐犲劚绾惧綊鏌￠崶鈺佸壉闁哥喎鎳忕换婵嬫濞戝崬鍓遍梺缁樻尰缁嬫垿鈥︾捄銊﹀磯濞撴凹鍨伴崜浼存⒑鐠囪尙绠為柛搴㈠▕閺佹捇鎳為妷顔兼櫛闂佸摜濮甸悧鐘茬暦閺屻儱钃熼柕澶樻緛閹风兘寮崼婵堫槰濡炪倖鏌ㄥΣ鍫ｎ樄闁哄本鐩崺鍕礃椤忓懎娅戞俊鐐�ら崐銈夊川椤栨粣绱查梻浣虹帛閸旓箓宕滃杈偨闁肩⒈鍓涚壕鐓庮熆鐠虹儤婀伴柛銈忔嫹闂備椒绱徊鍧楀礂濡警鍤曢柟缁㈠枟閸嬪嫰鏌ц箛鎾磋础婵℃彃娲缁樻媴鐟欏嫬浠╅梺绋垮瘨閸ㄨ泛鐣峰┑鍥ㄥ劅闁靛鍎遍崑宥夋⒑瑜版帗锛熼柣鎺炵畵閸╂盯骞嬮敂鐣屽幈闂佸湱鍋撳娆戝緤鐠囪鐟邦煥閸曨厾鐣肩紓浣介哺鐢偤骞忛悩缁樺殤妞ゆ埈鍋侀崹钘夌暦閿熺姵鐒肩�广儱妫涢崢鐢告⒒閸屾艾锟芥悂顢氶銏犵鐎广儱顦伴悡鐔兼煙閹呮憼缂侊拷閸愵亞纾肩紓浣诡焽濞插锟借娲栧畷顒冪亽闂佸憡绻傜�氬嘲顭囬弮鍌滅＝闁稿本鐟х粵蹇涙煙妞嬪骸鍘撮柡灞剧洴楠炲洭妫冨☉娆戜憾闂備胶顭堥敃锕傚极閹间焦鍎夋い蹇撶墕缁狙勭箾閸℃瑥浜鹃弫鍫ユ⒑鐠囨彃顒㈤柣鏃戝墴楠炲繘鏁撻敓锟�? by changhao
				if (channeltype == fire.pb.talk.ChannelType.CHANNEL_CLAN)
				{
					xbean.Properties prop = xtable.Properties.select(roleid);
					if (prop != null)
					{
						if (prop.getClankey() <= 0)
						{
							MessageMgr.sendMsgNotify(roleid, 141053, null);	
							
							msg.ret = 1;
							mkdb.Procedure.psendWhileCommit(roleid, msg);
							return false;
						}
					}
				}
				
				Long teamid = xtable.Roleid2teamid.select(roleid);
				if (teamid == null)
				{
					psend(roleid, new STeamError(TeamError.SelfNOtLeader));
					TeamManager.logger.error("COneKeyTeamMatch:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟閹间礁绫嶉柛顐ｆ儕閵夆晜鐓曢柟鑸妽濞呭棝鏌涙惔锝呮灈闁哄本娲濈粻娑氾拷锝庝簽閸旀潙鈹戦悙璺虹毢妞ゎ厼鐗撻崺鐐哄箣閿旇棄浜归柣鐘叉厂閸愌呯煑闂傚倷鑳堕幊鎾诲疮鐠恒劍宕查柟鎵閸嬧晠鏌ｉ幋锝嗩棄缂佺姷鏁婚弻鐔烘喆閸曞灚鐣剁紓鍌氱Т閿曨亜顕ｉ锕�绠涢柡澶婄仢缁愭稑顪冮妶鍡橆梿婵炲娲熼妴渚�宕ㄧ�涙ǚ鎷绘繛杈剧到閹芥粓鏁嶅鍥╃＜妞ゆ洖鎳庨悘鐘炽亜椤愩垻绠茬紒缁樼箓椤繈顢橀悢鍓蹭户闂傚倷娴囨慨銈夋晪濡炪倧绠撴禍鍫曞箖妤ｅ喚鏁囬柕蹇ョ磿閸橀亶鏌熼懖鈺勊夐柨鐔绘閻ゅ洭宕洪悙鐑樼叄闁煎鍊曟禒锔剧磼缂佹娲寸�规洖宕灒闁惧繘锟芥稒鍋呴梻鍌欒兌閹虫捇宕崸妤�绠犳俊顖欒濞兼牕鈹戦悩瀹犲缁炬儳鍚嬮幈銊ヮ潨閸℃鈷曢梺褰掝棑閸忔﹢鐛弽銊﹀闁告縿鍎荤槐顕�姊绘担鍝ョШ婵☆偉娉曠划鍫熺瑹閿熶粙骞冮崸妤婃晩婵炴潙楠哥紞濠傜暦濡ゅ懎绀傞柤娴嬫櫇閳诲繒绱撻崒娆戝妽闁告梹鐗犻妴鍐╃節閸パ嗘憰闂佺偨鍎查崜姘跺触鐎ｎ喖绠圭紒顔炬閹峰嘲鐣烽崶璺烘櫍婵犵數濮甸鏍窗濞戭澁缍栧鑸靛姈閸嬪倿鏌ㄩ悢鍝勑㈤柦鍐枛閺屾洘绻涢悙顒佺彆闂佺顑呭Λ婵嬪蓟濞戞矮娌柛鎾楋拷濡插牆顪冮妶鍛寸崪闁瑰嚖鎷� "+roleid);
					
					msg.ret = 1;
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					return true;					
				}
				
				Team team = null;
				team = TeamManager.getTeamByTeamID(teamid);	//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠為柟钘夊�婚敓鏂ょ秵閸犳牠鎮欐繝鍐︿簻闁瑰搫绉剁拹鐗堜繆椤愩垹鏆欓柍瑙勫灴閹瑥顔忛鍏碱啀婵＄偑鍊栫敮鐔轰焊濞嗘垶顫曢柣鎰嚟閻熷綊鏌ㄩ悢缁橆棄妞ゆ洩缍侀、鏇㈡晝閿熺晫绮堥崘鈹夸簻闁哄啫娲ゆ禍褰掓煥濞戞瑧鐭婇柍瑙勫灴椤㈡瑩寮妶鍫嫹鐠恒劎妫い鎾跺閻掗箖宕℃潏銊ｄ簻闁哄稁鍋勬禒锕傛煃闁垮绗掗棁澶愭煥濠靛棙绁╅柣鎺斿亾閵囧嫰濡烽妷褏顔掗梺鍝勬湰缁嬫捇鏁撻弬銈囩У濞存粍绻堣棢闁靛浚婢侀幏椋庢喆閸曨剛顦繝鈷�鍕垫疁妤犵偛妫濆顕�宕煎┑鎰秱闂備胶绮摫鐟滄澘鍟撮敐鐐寸節閸ャ劉鎷婚梺绋挎湰閼归箖鏁撻懞銉﹀�愮�规洘鍔欓獮鏍ㄦ媴閸濄儻绱梻浣哥秺濡法绮堟担鍝勵棜鐟滅増甯楅悡娆撴⒒閸屾凹鍤熸い锔肩畵閺岋綁濡舵惔鈩冪亪闂傚洤顦甸弻娑滅疀閹捐櫕鍊紓鍌氱У閸ㄥ湱妲愰幒妤�绠涙い鎾楀嫮鏆梻浣芥硶閸犳洖螞閸曨厾涓嶇�广儱顦壕鍧楁煕濡ゅ啩绱虫繛宸簼閺呮繈鏌涘畝瀣洭缂佸绻樺娲传閸曨剙鍋嶉梺鎼炲妽濡炰粙骞冮敓鐘冲亜闁稿繗鍋愰崢鐢告⒒娓氬洤寮跨紒鐘冲灴瀵鈽夐姀锛勫幈闂佸搫鍊归娆撳磿閺冨牊鐓涚�癸拷鐎ｎ剛袦濡ょ姷鍋為敃銏犵暦閿熺姵鍊烽柟缁樺俯濞兼盯姊婚崒姘拷绋棵洪妶澹﹀洭鎮界粙鑳憰闂侀潧顭堥崕顕�寮ㄦ禒瀣厱闁虫拝鎷烽柡鍛矒閸┿垽骞橀弬銉︽杸闂佸疇妫勫Λ妤佺濠靛鐓曢柕濞垮劜鐠愨剝淇婇崣澶婂妤犵偞甯￠獮妯虹暦閸モ晝宓佸┑鐘垫暩閸嬬偤宕归崼鏇熷仭闁靛鏅╅弫鍌炴煥閻曞倹瀚� by changhao	
				if (!team.isTeamLeader(roleid))
				{
					psend(roleid, new STeamError(TeamError.SelfNOtLeader));
					TeamManager.logger.error("COneKeyTeamMatch:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟閹间礁绫嶉柛顐ｆ儕閵夆晜鐓曢柟鑸妽濞呭棝鏌涙惔锝呮灈闁哄本娲濈粻娑氾拷锝庝簽閸旀潙鈹戦悙璺虹毢妞ゎ厼鐗撻崺鐐哄箣閿旇棄浜归柣鐘叉厂閸愌呯煑闂傚倷鑳堕幊鎾诲疮鐠恒劍宕查柟鎵閸嬧晠鏌ｉ幋锝嗩棄缂佺姷鏁婚弻鐔烘喆閸曞灚鐣剁紓鍌氱Т閿曨亜顕ｉ锕�绠涢柡澶婄仢缁愭稑顪冮妶鍡橆梿婵炲娲熼妴渚�宕ㄧ�涙ǚ鎷绘繛杈剧到閹芥粓鏁嶅鍥╃＜妞ゆ洖鎳庨悘鐘炽亜椤愩垻绠茬紒缁樼箓椤繈顢橀悢鍓蹭户闂傚倷娴囨慨銈夋晪濡炪倧绠撴禍鍫曞箖妤ｅ喚鏁囬柕蹇ョ磿閸橀亶鏌熼懖鈺勊夐柨鐔绘閻ゅ洭宕洪悙鐑樼叄闁煎鍊曟禒锔剧磼缂佹娲寸�规洖宕灒闁惧繘锟芥稒鍋呴梻鍌欒兌閹虫捇宕崸妤�绠犳俊顖欒濞兼牕鈹戦悩瀹犲缁炬儳鍚嬮幈銊ヮ潨閸℃鈷曢梺褰掝棑閸忔﹢鐛弽銊﹀闁告縿鍎荤槐顕�姊绘担鍝ョШ婵☆偉娉曠划鍫熺瑹閿熶粙骞冮崸妤婃晩婵炴潙楠哥紞濠傜暦濡ゅ懎绀傞柤娴嬫櫇閳诲繒绱撻崒娆戝妽闁告梹鐗犻妴鍐╃節閸パ嗘憰闂佺偨鍎查崜姘跺触鐎ｎ喖绠圭紒顔炬閹峰嘲鐣烽崶璺烘櫍婵犵數濮甸鏍窗濞戭澁缍栧鑸靛姈閸嬪倿鏌ㄩ悢鍝勑㈤柦鍐枛閺屾洘绻涢悙顒佺彆闂佺顑呭Λ婵嬪蓟濞戞矮娌柛鎾楋拷濡插牆顪冮妶鍛寸崪闁瑰嚖鎷� "+roleid);
					
					msg.ret = 1;
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					return true;						
				}
				
				teamid = xtable.Roleid2teamid.get(roleid);		
				if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�妞ゆ劦婢�缁墎绱撴笟濠冨婵犮垼娉涢鍕崲閸℃稒鐓忛柛顐ｇ箖閸ｆ椽鏌涢敐鍛础缂佽鲸甯￠幃鈺呮濞戞帗鐎伴梻浣告惈閻ジ宕伴弽顓犲祦闁糕剝鍑瑰Σ楣冩⒑閹稿海鈽夌紒澶婄秺瀵鏁撻悩鎻掕�垮銈嗘尵婵兘寮抽妶鍛斀妞ゆ梻銆嬮弨缁樹繆閻愭壆鐭欓柕鍡曠铻栭柛娑卞枟濞呫垽姊烘导娆戝埌闁活剙銈搁幆宀勫箻缂佹ê锟界敻鏌ｉ姀鐘冲暈濞存嚎鍊濋弻鐔风暋閺夋寧些濡炪値鍋呯换鍫ャ�佸Δ浣哥窞閻庯絾鎸堕崝鎴濐潖閾忚宕夐柕濞垮劜閻忓棗鈹戦埥鍡椾簻閻庢凹鍠氶崚鎺旀嫚瀹割喖鎮戞繝銏ｆ硾閿曪箓鏁嶉悢鍏尖拻濞撴艾娲ゆ晶顔剧磼婢跺鍤熺紒顔碱煼閹晝鎷犻懠顒夊晣闂備礁婀遍埛鍫ュ储妤ｅ啫鍌ㄦ繝濠傛噽绾剧晫锟藉箍鍎卞Λ娑欐櫠閻㈠憡鐓涢悘鐐靛亾缁�瀣拷瑙勬礈閸樠囧煘閹达箑绠涙い鎾筹紡閸ャ劉鎷虹紓鍌欑劍钃遍悘蹇曞缁绘盯鎳犻锟介弸娑氾拷娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�? by changhao
				{
					DSTeamMatchInfo config = ConfigManager.getInstance().getConf(DSTeamMatchInfo.class).get(team.getTeamInfo().getTargetid());
					if (config == null)
					{
						psend(roleid, new STeamError(TeamError.NoTarget));
						TeamManager.logger.error("COneKeyTeamMatch:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂佺偓鍎冲锟犲蓟閿濆顫呴柕蹇婃櫇閸旀悂姊哄Ч鍥э拷婵堢不閺嶎厼钃熺�广儱顦导鐘绘煕閺囥劌澧繛鍜冪悼缁辨挻鎷呴悷鏉款潔濡炪們鍔屽Λ娆戠矚鏉堛劎绡�闁搞儺鐏涜閺屾稑鈽夐崡鐐寸亪濠电偛鎳岄崐婵嗩潖閾忓湱鐭欐繛鍡樺劤閸撴澘顪冮妶蹇曠窗闁告娅曟穱濠囨偨缁嬭法顦板銈嗙墬椤曡精顦归柡灞剧☉閳藉宕￠悙鍏稿寲闂備胶绮幐璇参涢崘顭戞綎濠电姵鑹剧壕鍏兼叏濮楀棗澧鹃柟椋庡厴楠炴牗鎷呴崫銉串闂備胶绮崹鍏兼叏閵堝纾归柛褎顨嗛悡銉╂煛閸愭寧瀚归梺褰掓敱缁诲牓鐛箛鏃戞Ч閹艰揪绲块悾璺衡攽閻愭潙鐏﹂拑鍗烆熆鐠哄搫顏柡灞剧〒閿熸枻绲芥晶搴ｅ姬閿熶粙姊洪崫鍕拱婵炲弶顭囬幑銏犫槈閵忊�筹拷閿嬨亜閹哄秷鍏岀憸鎵枛濮婄粯鎷呴懞銉ｏ拷鍐磼閿熻姤绗熼敓浠嬨�侀弽銊ョ窞闁归偊鍓濋幗鏇㈡⒑闂堟单鍫ュ疾濠婂牆纾婚柛鈩冪♁閻撴洟鎮橀悙鎻掆挃闁宠棄顦伴妵鍕疀閵夛箑顏� "+roleid);
						
						msg.ret = 1;
						mkdb.Procedure.psendWhileCommit(roleid, msg);
						return true;					
					}					
				}
				else
				{
					STeamMatchInfo config = ConfigManager.getInstance().getConf(STeamMatchInfo.class).get(team.getTeamInfo().getTargetid());
					if (config == null)
					{
						psend(roleid, new STeamError(TeamError.NoTarget));
						TeamManager.logger.error("COneKeyTeamMatch:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂佺偓鍎冲锟犲蓟閿濆顫呴柕蹇婃櫇閸旀悂姊哄Ч鍥э拷婵堢不閺嶎厼钃熺�广儱顦导鐘绘煕閺囥劌澧繛鍜冪悼缁辨挻鎷呴悷鏉款潔濡炪們鍔屽Λ娆戠矚鏉堛劎绡�闁搞儺鐏涜閺屾稑鈽夐崡鐐寸亪濠电偛鎳岄崐婵嗩潖閾忓湱鐭欐繛鍡樺劤閸撴澘顪冮妶蹇曠窗闁告娅曟穱濠囨偨缁嬭法顦板銈嗙墬椤曡精顦归柡灞剧☉閳藉宕￠悙鍏稿寲闂備胶绮幐璇参涢崘顭戞綎濠电姵鑹剧壕鍏兼叏濮楀棗澧鹃柟椋庡厴楠炴牗鎷呴崫銉串闂備胶绮崹鍏兼叏閵堝纾归柛褎顨嗛悡銉╂煛閸愭寧瀚归梺褰掓敱缁诲牓鐛箛鏃戞Ч閹艰揪绲块悾璺衡攽閻愭潙鐏﹂拑鍗烆熆鐠哄搫顏柡灞剧〒閿熸枻绲芥晶搴ｅ姬閿熶粙姊洪崫鍕拱婵炲弶顭囬幑銏犫槈閵忊�筹拷閿嬨亜閹哄秷鍏岀憸鎵枛濮婄粯鎷呴懞銉ｏ拷鍐磼閿熻姤绗熼敓浠嬨�侀弽銊ョ窞闁归偊鍓濋幗鏇㈡⒑闂堟单鍫ュ疾濠婂牆纾婚柛鈩冪♁閻撴洟鎮橀悙鎻掆挃闁宠棄顦伴妵鍕疀閵夛箑顏� "+roleid);
						
						msg.ret = 1;
						mkdb.Procedure.psendWhileCommit(roleid, msg);
						return true;					
					}						
				}
				
				long systemTime = System.currentTimeMillis();
				
				final long now = System.currentTimeMillis();
				final long delaytime = ChatChannel.getInstance().getWorldChatDelayTime();
				final LastChatTime rctime = new LastChatTime(roleid, false);
				if (channeltype == fire.pb.talk.ChannelType.CHANNEL_WORLD && rctime.getLastWorldChatTime() + delaytime > now) {
					java.util.ArrayList<String> args = new java.util.ArrayList<String>();
					args.add("" + (rctime.getLastWorldChatTime() + delaytime - now) / 1000);
					MessageMgr.sendMsgNotify(roleid, ChatMsgId.CHAT_WORLD_CHANNEL_TIME_LIMIT, args);
					
					msg.ret = 1;
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					return true;
				}
				
				long delta = systemTime - team.getTeamInfo().getOnekeytimestamp() - TeamManager.ONE_KEY_APPLY_TEAM;
				if (delta < 0)
				{
					String s = String.format("%d", (int)-delta / 1000);
					MessageMgr.sendMsgNotify(roleid, 150028, Arrays.asList(s));
					TeamManager.logger.info("COneKeyTeamMatch:濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鍝勫閸庨亶鍩為幋锔藉亹闁告瑥顦伴幃娆戠磽娴ｅ搫顎岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欓煫顓犳晼闂備浇妗ㄧ粈浣猴拷姘煎幘閹广垹鈽夐姀鐘茶�垮┑鈽嗗灥椤曆呭枈瀹ュ洨纾藉ù锝囨嚀婵牊銇勯妸銉含鐎殿喖顭烽崹楣冨箛娴ｅ憡鍊梺纭呭亹鐞涖儵鏁撻挊澶岋紞妞ゆ梹鍔欏缁樻媴閸涘﹤鏆堥梺鎼炲姀椤鎹㈠☉銏℃櫢濞寸姴顑嗛悡娑㈡倶閻愭彃鈷旀繛鎻掔摠閵囧嫰濮�閳╁啰顦伴梺璇″枓閺呯娀骞婇悩娲绘晞閻犳亽鍔嶉敍蹇涙⒒閸屾瑦绁版い鏇嗗拑鎷峰☉鎺撴珖闁哥姴锕ら濂稿炊瑜庨悗鎶芥倵楠炲灝鍔氭繛璇х畱閻ｇ兘宕ｆ径宀�鐦堥梻鍌氱墛娓氭宕曢幇顓滀簻闁靛鍎虫晶娑氱磼缂佹娲存鐐差儔閹瑩宕归銏＄彛濠碉紕鍋戦崐褔鎳欒ぐ鎺戠柧婵炴垟鎳囬敓鑺ユ瀹曟﹢顢欓崲澶涢檮閵囧嫰寮介妸褎鍣銈忚闂勫嫮鎹㈠☉姘珰鐟滃繘鎮鹃悽鍛婄厱闁冲搫鍊诲ú瀛橆殽閻愭潙绗掗摶鏍归敐鍛儓妤犵偛鐗撳铏规嫚閼碱剛顔婇梺绋款儐缁嬫帡寮查懜鐢殿浄閻庯綆浜為崣鍐╃箾閹惧鍟查柟椋庡厴閺岀喖顢欑粵瀣姼缂備胶濮甸惄顖涗繆閻戣棄鐓涢柛灞诲�ч幏宄邦吋閸℃瑧顔曢梺鎸庣箓閹冲繘骞栭幇鐗堢叆闁哄洢鍔嬮柇顖炴煏閸℃洜绐旂�殿喗鎸虫慨锟介柣娆欐嫹婵炵厧锕娲倷閽樺濮庨梺鍛娚戦悧鏇″絹濡炪倖姊婚弲顐ゅ姬閿熻棄鈹戦悙鑼闁诲繑绻堝绋库槈濞嗗秳绨诲銈嗘寙閸愩劎鐫勬俊銈囧Х閸嬫稓鎹㈠锟藉顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷?60缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忓爼姊洪懞銉夋垹鎹㈤崼銉ヨ摕闁绘柨鐨濋弸鏃堟煕椤垵鏋熼柣蹇撶Ч濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳艾惟闁冲搫鍊告禍鐐烘⒑缁嬫寧婀扮紒瀣灴椤㈡棃鏁撻敓锟�?? "+roleid);
					
					msg.ret = 1;
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					return true;						
				}
				
				team.getTeamInfo().setOnekeytimestamp(systemTime);
				
				/*
				fire.pb.message.SStringRes msg1 = ConfigManager.getInstance().getConf(fire.pb.message.SStringRes.class).get(285);
				if (msg1 == null)
				{
					TeamManager.logger.error("COneKeyTeamMatch:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗙墛椤忕姷绱掗敓鑺ョ節閸屾鏂�闂佺粯蓱瑜板啯绂嶉悙鐑樼厽闁圭儤姊瑰▍鏇㈡煙閸欏鍊愭鐐差儔閺佸啴鏁撻懞銉敯闂傚倷娴囬～澶嬬珶閸℃ɑ娅犳俊銈呮噹绾惧綊鏌ｉ幋锝呅撻柣鎾跺枛閺屾洝绠涚�ｎ亞浠鹃梺鍝勬閺呯娀寮婚敐澶嬫櫜闁割偅绻勯崢顐ょ磽娴ｈ櫣甯涚紒璇茬墛閹便劑鏁撴禒瀣叆婵犻潧妫欓崳浠嬫煕濮楀棗浜版慨濠冩そ瀹曘劍绻濋崘锝嗗婵犵數鍋涘鍓佸垝鎼淬劌绀嗛柟鐑橆殔闁卞洭鏌曟径鍫濆姎闁兼澘鐏濋埞鎴︽倷閺夋垹浠搁梺鑽ゅ暀閸パ冨亶闂佸憡绋戦敃锔惧姬閿熶粙姊洪棃娑㈢崪缂佹彃澧藉☉鍨偅閸愨晛锟藉灚绻涢幋鐐茬瑲婵炲懎娲︾换娑㈠箣閻樿櫕姣堥悗瑙勬礀閵堢顕ｉ幘顔藉亜闁告繂瀚粻銉╂⒒閸屾瑦顦风紒槌栧枤瀵板﹥绂掔�ｎ偄娈ｅ銈嗙墱閸嬫盯宕欓悩缁樼厸闁告劑鍔岄敓鍊熷吹婢规洘绺界粙璺ㄩ獓闂佸壊鍋呯粙鎴炰繆閼测晝纾兼俊銈勭濞搭噣鏌熼挊澶屽煟鐎殿喕绮欓、姗�鎮㈤崙銈嗗闁汇垹鎲￠悡銉︾節闂堟稒顥㈡い搴㈩殔椤儻顦冲鐟版濡叉劙骞掑Δ锟界粻娑欍亜閹炬瀚弶褰掓⒒娴ｅ憡鎯堥柣顓烆槺缁辩偞绗熼敓浠嬬嵁閸愵喖顫呴柕鍫濇噹缁愭稒绻濋悽闈浶㈤悗姘�鍥ф瀬鐎广儱顦伴埛鎺懨归敐鍥у妺闁搞倧鎷烽梻浣规偠閸婃牠鎮ч悩鑽ゅ祦闊洦绋掗弲鎼佹煥閻曞倹瀚� "+roleid);
					return false;						
				}
				*/
				
				fire.pb.message.SStringRes msg2 = ConfigManager.getInstance().getConf(fire.pb.message.SStringRes.class).get(286);
				if (msg2 == null)
				{
					TeamManager.logger.error("COneKeyTeamMatch:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗙墛椤忕姷绱掗敓鑺ョ節閸屾鏂�闂佺粯蓱瑜板啯绂嶉悙鐑樼厽闁圭儤姊瑰▍鏇㈡煙閸欏鍊愭鐐差儔閺佸啴鏁撻懞銉敯闂傚倷娴囬～澶嬬珶閸℃ɑ娅犳俊銈呮噹绾惧綊鏌ｉ幋锝呅撻柣鎾跺枛閺屾洝绠涚�ｎ亞浠鹃梺鍝勬閺呯娀寮婚敐澶嬫櫜闁割偅绻勯崢顐ょ磽娴ｈ櫣甯涚紒璇茬墛閹便劑鏁撴禒瀣叆婵犻潧妫欓崳浠嬫煕濮楀棗浜版慨濠冩そ瀹曘劍绻濋崘锝嗗婵犵數鍋涘鍓佸垝鎼淬劌绀嗛柟鐑橆殔闁卞洭鏌曟径鍫濆姎闁兼澘鐏濋埞鎴︽倷閺夋垹浠搁梺鑽ゅ暀閸パ冨亶闂佸憡绋戦敃锔惧姬閿熶粙姊洪棃娑㈢崪缂佹彃澧藉☉鍨偅閸愨晛锟藉灚绻涢幋鐐茬瑲婵炲懎娲︾换娑㈠箣閻樿櫕姣堥悗瑙勬礀閵堢顕ｉ幘顔藉亜闁告繂瀚粻銉╂⒒閸屾瑦顦风紒槌栧枤瀵板﹥绂掔�ｎ偄娈ｅ銈嗙墱閸嬫盯宕欓悩缁樼厸闁告劑鍔岄敓鍊熷吹婢规洘绺界粙璺ㄩ獓闂佸壊鍋呯粙鎴炰繆閼测晝纾兼俊銈勭濞搭噣鏌熼挊澶屽煟鐎殿喕绮欓、姗�鎮㈤崙銈嗗闁汇垹鎲￠悡銉︾節闂堟稒顥㈡い搴㈩殔椤儻顦冲鐟版濡叉劙骞掑Δ锟界粻娑欍亜閹炬瀚弶褰掓⒒娴ｅ憡鎯堥柣顓烆槺缁辩偞绗熼敓浠嬬嵁閸愵喖顫呴柕鍫濇噹缁愭稒绻濋悽闈浶㈤悗姘�鍥ф瀬鐎广儱顦伴埛鎺懨归敐鍥у妺闁搞倧鎷烽梻浣规偠閸婃牠鎮ч悩鑽ゅ祦闊洦绋掗弲鎼佹煥閻曞倹瀚� "+roleid);
					
					msg.ret = 1;
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					return false;						
				}				
				
				//String msgstring1 = msg1.msg;
				String msgstring2 = msg2.msg;

				/*
				msgstring1 = msgstring1.replaceAll("\\$parameter1\\$", config.Target);
				msgstring1 = msgstring1.replaceAll("\\$parameter2\\$", Integer.toString(team.getTeamInfo().getMinlevel()));
				msgstring1 = msgstring1.replaceAll("\\$parameter3\\$", Integer.toString(team.getTeamInfo().getMaxlevel()));
				msgstring1 = msgstring1.replaceAll("\\$parameter4\\$", Long.toString(roleid));
				*/
				
				final java.util.ArrayList<fire.pb.talk.DisplayInfo> showinfos  = new java.util.ArrayList<fire.pb.talk.DisplayInfo>();
				
				boolean ret = ChatChannel.getInstance().process(roleid, channeltype, text, msgstring2, showinfos, 1);
				
				if (ret == true)
				{					
					MessageMgr.sendMsgNotify(roleid, 162025, null);					
				}
				else
				{
					msg.ret = 1;
				}
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);
								
				return ret;
			}
			
		};
		onekeyteammatch.submit();	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794498;

	public int getType() {
		return 794498;
	}

	public int channeltype; // 频道类型 14组队申请 1当前频道 4帮派 5世界频道 by changhao
	public java.lang.String text; // 发送的文本 by changhao

	public COneKeyTeamMatch() {
		text = "";
	}

	public COneKeyTeamMatch(int _channeltype_, java.lang.String _text_) {
		this.channeltype = _channeltype_;
		this.text = _text_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(channeltype);
		_os_.marshal(text, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		channeltype = _os_.unmarshal_int();
		text = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof COneKeyTeamMatch) {
			COneKeyTeamMatch _o_ = (COneKeyTeamMatch)_o1_;
			if (channeltype != _o_.channeltype) return false;
			if (!text.equals(_o_.text)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += channeltype;
		_h_ += text.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(channeltype).append(",");
		_sb_.append("T").append(text.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

