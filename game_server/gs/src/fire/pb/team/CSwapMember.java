
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSwapMember__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏灪閸嬨倝鏌曟繛鐐珔闁告艾缍婇獮鏍庨锟芥俊鑲╃棯閹呯Ш闁哄备锟藉磭鏆ゆい鏂垮悑閸ｇ儤绻涢崼銉х暫婵﹥妞藉畷顐﹀礋椤曞懏钑夐梻浣侯焾鐎涒晠鎮￠敓鐘叉槬婵炴垯鍨圭粻鑽ょ磽娴ｈ鐒介柛妯圭矙濮婃椽宕崟顐ｆ闂佺粯顨呴敃顏勵嚕椤愶附鐒肩�广儱妫涢崢閬嶆⒑缂佹鎳冮柟鍐茬箳閿熻姤鐔幏锟�
 * @author changhao
 *
 */
public class CSwapMember extends __CSwapMember__ {
	@Override
	protected void process() {
		// protocol handle
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long leaderRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (leaderRoleId < 0)
			return;
		mkdb.Procedure swapMemberP = new mkdb.Procedure()
		{

			@Override
			protected boolean process()
			{
				Long teamId = xtable.Roleid2teamid.select(leaderRoleId);
				//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣筋潐婢瑰棙鏅跺Δ鍛；閻庯綆鍠楅悡娆撴煕閹炬鎳庣粭锟犳⒑缁嬫鍎愰拑杈╃磼缂佹娲寸�规洖宕灒闁惧繘锟芥稒顢橀梻浣筋嚙鐎涒晝鍠婂澶嬪殞濡わ絽鍟繚闂佸湱鍎ら崺鍫濐焽閳哄懏鐓熼柟浼存涧婢ь喗銇勮箛姘厫缂佺粯绻傞銉╁几椤愵澁鎷烽妶澶婂惞閻庯綆鍠楅埛鎺楁煕閺囥劌浜滄い蹇ｅ亰閺屻劑鎮㈤悜妯荤彧闂佽桨鐒﹂幃鍌氱暦閵忥綆妯勫銈冨灪钃辩紒铏规櫕缁瑩宕归鍖℃嫹閸喒鏀介柍钘夋閻忥綁鏌涙惔銏犵仼缂侇喖顭烽獮妯兼嫚閼艰埖鎲版繝鐢靛仦閸ㄥ爼鏁冮埡渚囩劷闁冲搫鎳忛悡鏇㈡煙閻愵剦娈旈柟铏姍閹即濡烽埡鍌楁嫼闂佺厧顫曢崐鏇熺墡闂備礁鎲″褰掋�冩繝鍌滄殾濞村吋娼欑粻濠氭偣閸濆嫭鎯堥柣蹇擄躬濮婅櫣鎹勯妸銉︾彚闂佺懓鍤栭幏锟�?
				Team team = null;
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				
				if(!checkleaderInTeam(leaderRoleId, team))
				{
					//闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇悗骞垮劚閻楀棝宕㈤垾鎰佹富闁靛牆鍊瑰▍鍡涙煟閹垮嫮绡�鐎殿喖顭峰鎾閻樿鏁规繝鐢靛█濞佳兠归崒姣兼盯鎮欓悜妯煎幍闂佺绻愰崥瀣礊閹达附鐓ラ柡鍥ュ妺闁垳锟芥鍠栭…鐑藉极閹邦厼绶炲┑鐐╂噰閺呯娀寮婚弴鐔风窞闁割偅绻傛慨鑸电箾鐎电啸闁硅櫕鎹囬崺鐐哄箣閿旂粯鏅╅梺缁樺姦閸撴瑥鈻撶仦绛嬫富闁靛牆绻樺顔碱熆閻熺増顥犻柛鎺撳笒閳诲酣骞囬鍌滅嵁濠电姷鏁告慨瀛橆殽閹间礁绠栭柟杈鹃檮閳锋垹绱掗娑欑濠⒀冨级閵囧嫰顢橀悙宸純闂佽桨绀侀崯鏉戠暦閹烘垟妲堥柟鐑樻尭椤忔椽姊婚崒娆戭槮闁硅绻濆畷婵嬫晜閻ｅ矈娲稿┑鐘诧工閻楀棝宕欓悩宕囩闁瑰瓨鐟ラ悘顏堟煟閹惧娲撮柡灞剧洴閸╁嫰宕橀浣癸級闂備浇顫夐悡锛勭不閺嶎厼钃熼柍鈺佸暞婵挳鏌涘┑鍕壘鐟滃繘鏁撻崐鐕佹綈婵炲弶锕㈤獮鍐磼濮樼厧娈ㄩ梺瑙勵問閸犳碍銇欏畷鍥╃＜濠㈣泛锕ョ紞鎻砽闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟〃閻掑﹪鏌涘☉娆愮稇缂佺媭鍨堕弻銊╂偆閸屾稑顏�?
					fire.pb.talk.MessageMgr.psendMsgNotify(leaderRoleId, 141192, null);
					TeamManager.logger.debug("FAIL:闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇悗骞垮劚閻楀棝宕㈤垾鎰佹富闁靛牆鍊瑰▍鍡涙煟閹垮嫮绡�鐎殿喖顭峰鎾閻樿鏁规繝鐢靛█濞佳兠归崒姣兼盯鎮欓悜妯煎幍闂佺绻愰崥瀣礊閹达附鐓ラ柡鍥ュ妺闁垳锟芥鍠栭…鐑藉极閹邦厼绶炲┑鐐╂噰閺呯娀寮婚弴鐔风窞闁割偅绻傛慨鑸电箾鐎电啸闁硅櫕鎹囬崺鐐哄箣閿旂粯鏅╅梺缁樺姦閸撴瑥鈻撶仦绛嬫富闁靛牆绻樺顔碱熆閻熺増顥犻柛鎺撳笒閳诲酣骞囬鍌滅嵁濠电姷鏁告慨瀛橆殽閹间礁绠栭柟杈鹃檮閳锋垹绱掗娑欑濠⒀冨级閵囧嫰顢橀悙宸純闂佽桨绀侀崯鏉戠暦閹烘垟妲堥柟鐑樻尭椤忔椽姊婚崒娆戭槮闁硅绻濆畷婵嬫晜閻ｅ矈娲稿┑鐘诧工閻楀棝宕欓悩宕囩闁瑰瓨鐟ラ悘顏堟煟閹惧娲撮柡灞剧洴閸┿儵宕卞Δ锟界粻娲煟鎼淬垻鍟查柟鍑ゆ嫹,  leaderRoleId:" + leaderRoleId);
				}
				else if(!checkIndexValid(team , index1, index2))
				{
					//闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇悗骞垮劚閻楀棝宕㈤垾鎰佹富闁靛牆鍊瑰▍鍡涙煟閹垮嫮绡�鐎殿喖顭峰鎾閻樿鏁规繝鐢靛█濞佳兠归崒姣兼盯鎮欓悜妯煎幍闂佺绻愰崥瀣礊閹达附鐓ラ柡鍥ュ妺闁垳锟芥鍠栭…鐑藉极閹邦厼绶炲┑鐐╂噰閺呯娀寮婚弴鐔风窞闁割偅绻傛慨鑸电箾鐎电孝缂傚秴锕濠氭晲婢跺锟界兘鏌℃径瀣仴闁硅棄鐏氱换娑氾拷娑欘焽閻孩绻涙径瀣创闁挎繄鍋犵粻娑㈠籍閸岀偞顎嶉梻浣告啞缁嬫垿鏁冮妶鍡欘洸婵犲﹤鐗婇埛鎺懨归敐鍛喐濞寸姰鍨洪妵鍕箣濠靛洤娈楅悗娈垮枟閹倿寮幘璺虹筏闁绘牕銈積x濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚悢铏圭＜闁靛繒濮甸悘鍫㈢磽娴ｅ搫校闁绘濞�閻涱噣寮介銏犵亰闁荤喐鐟ョ�氱兘鏁撻挊澶嬵棦闁哄矉绱曢敓鏂ょ秵閸嬪棙鏅堕悽鍛婄厸鐎癸拷鐎ｎ剛鐦堥悗瑙勬礀閻栫厧顕ｉ悽鍛婂仺闁割煈鍋呭▍锔剧磽閸屾艾锟介娆㈤妶澶婄闁绘垼濮ら悡鏇㈡煙閻戞ɑ鈷愰柛搴ｅ盁igal闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟〃閻掑﹪鏌涘☉娆愮稇缂佺媭鍨堕弻銊╂偆閸屾稑顏�?
					TeamManager.logger.debug("FAIL:闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇悗骞垮劚閻楀棝宕㈤垾鎰佹富闁靛牆鍊瑰▍鍡涙煟閹垮嫮绡�鐎殿喖顭峰鎾閻樿鏁规繝鐢靛█濞佳兠归崒姣兼盯鎮欓悜妯煎幍闂佺绻愰崥瀣礊閹达附鐓ラ柡鍥ュ妺闁垳锟芥鍠栭…鐑藉极閹邦厼绶炲┑鐐╂噰閺呯娀寮婚弴鐔风窞闁割偅绻傛慨鑸电箾鐎电孝缂傚秴锕濠氭晲婢跺锟界兘鏌℃径瀣仴闁硅棄鐏氱换娑氾拷娑欘焽閻孩绻涙径瀣创闁挎繄鍋犵粻娑㈠籍閸岀偞顎嶉梻浣告啞缁嬫垿鏁冮妶鍡欘洸婵犲﹤鐗婇埛鎺懨归敐鍛喐濞寸姰鍨洪妵鍕箣濠靛洤娈楅悗娈垮枟閹倿寮幘璺虹筏闁绘牕銈積x濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚悢铏圭＜闁靛繒濮甸悘鍫㈢磽娴ｅ搫校闁绘濞�閻涱噣寮介銏犵亰闁荤喐鐟ョ�氱兘鏁撻挊澶嬵棦闁哄矉绱曢敓鏂ょ秬閸╂牜锟芥熬鎷�?,  index1: " + index1 + " ;index2: "+ index2);
				}
				else if(!checkMemsberStateValid(team, index1, index2))
				{
					//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅絾绻濋崹顐㈠閻庨潧鐭傚娲捶椤撶偛濡洪梺绯曟櫅閻楀棝鈥﹂崶顒�鐓涢柛娑卞枤閸欏棝姊洪崫鍕窛闁稿鐩弫鎾绘寠婢跺鍠愮紓渚囧枛椤嘲顕ｆ繝姘ㄩ柨鏃�鍎崇敮楣冩⒒婵犲骸浜滄繛灞傚�濋、鏍川鐎涙ê锟借埖銇勮箛鎾跺闁绘挾鍠栭弻銊モ攽閸℃ê娅ｉ梺鑲╊焾缂嶅﹪寮诲澶嬪癄濠㈣埖蓱閳诲牆螖閻橀潧浠﹂柨鏇樺灩閻ｇ兘鏁撻悩鍐诧拷濠氭煕閵夛絽濡兼い蹇氭硾閳规垿鎮╃紒妯婚敪闂佸搫鑻悧鎾诲极閹邦厼绶為悗锝庡亝閻濇牠姊绘担渚劸闁哄牜鍓熼幊婵嬪礈瑜忛悳缁樼箾閹寸們姘跺绩娴犲鐓冮柦妯侯槹椤ユ粓鏌ｈ箛瀣姕缂佺粯鐩畷顏堝礃椤忓懎浠圭紓鍌欑贰閸犳牠鈥﹂悜鐣屽祦閻庯綆浜栭弨浠嬫煙闁箑骞栭柣锔界矒濮婄粯绗熼敓钘夘焽瑜旈幃褔宕卞☉妯碱唵闁诲函缍嗛崰妤呭磻閸屾埃鏀介柛灞剧閸熺偤鏌ｉ幘瀛樼闁绘搩鍋婂畷鍫曞Ω閿旀拝鎷锋總鍛婄厵閻庢稒顭囩粻銉╂煕閵堝棭娈滈柡灞剧洴瀵挳濡搁妷褌鍝楃紓鍌欑筏閹风兘鎮楅敐搴′簴濞存粍绮撻悡顐﹀炊閵婏箑闉嶅銈冨劗閿熻姤鍓氶悢鍡涙偡濞嗗繐鈻曟い蹇撶墕閻撴﹢鏌熸潏鎯х槣闁轰礁锕弻锝夋晲閸涱垳浼囧銈嗘煥濞层劎妲愰幘瀛樺闁芥ê顦辨径鍕磽娓氬洤鏋熼柣鐔叉櫊閻涱噣宕橀鍢夈劑鏌嶆潪鎵獢闁哥偛鐖煎娲传閸曨剙绐涢梺鍝ュТ鐎涒晝绮嬪鍫涗汗闁圭儤鎸撮幏鐑樼節闂堟稑锟芥悂骞夐埄鍐洸闁靛牆顦伴悡娆撴煕閹存瑥锟芥牜锟芥熬鎷�??
					psend(leaderRoleId, new STeamError(TeamError.MembersNotNormal));
					fire.pb.talk.MessageMgr.psendMsgNotify(leaderRoleId, 141193, null);
					TeamManager.logger.debug("FAIL:闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅絾绻濋崹顐㈠閻庨潧鐭傚娲捶椤撶偛濡洪梺绯曟櫅閻楀棝鈥﹂崶顒�鐓涢柛娑卞枤閸欏棝姊洪崫鍕窛闁稿鐩弫鎾绘寠婢跺鍠愮紓渚囧枛椤嘲顕ｆ繝姘ㄩ柨鏃�鍎崇敮楣冩⒒婵犲骸浜滄繛灞傚�濋、鏍川鐎涙ê锟借埖銇勮箛鎾跺闁绘挾鍠栭弻銊モ攽閸℃ê娅ｉ梺鑲╊焾缂嶅﹪寮诲澶嬪癄濠㈣埖蓱閳诲牆螖閻橀潧浠﹂柨鏇樺灩閻ｇ兘鏁撻悩鍐诧拷濠氭煕閵夛絽濡兼い蹇氭硾閳规垿鎮╃紒妯婚敪闂佸搫鑻悧鎾诲极閹邦厼绶為悗锝庡亝閻濇牠姊绘担渚劸闁哄牜鍓熼幊婵嬪礈瑜忛悳缁樼箾閹寸們姘跺绩娴犲鐓冮柦妯侯槹椤ユ粓鏌ｈ箛瀣姕缂佺粯鐩畷顏堝礃椤忓懎浠圭紓鍌欑贰閸犳牠鈥﹂悜鐣屽祦閻庯綆浜栭弨浠嬫煙闁箑骞栭柣锔界矒濮婄粯绗熼敓钘夘焽瑜旈幃褔宕卞☉妯碱唵闁诲函缍嗛崰妤呭磻閸屾埃鏀介柛灞剧閸熺偤鏌ｉ幘瀛樼闁绘搩鍋婂畷鍫曞Ω閿旀拝鎷锋總鍛婄厵閻庢稒顭囩粻銉╂煕閵堝棭娈滈柡灞剧洴瀵挳濡搁妷褌鍝楃紓鍌欑筏閹风兘鎮楅敐搴′簴濞存粍绮撻悡顐﹀炊閵婏箑闉嶅銈冨劗閿熻姤鍓氶悢鍡涙偡濞嗗繐鈻曟い蹇撶墕閻撴﹢鏌熸潏鎯х槣闁轰礁锕弻锝夋晲閸涱垳浼囧銈嗘煥濞层劎妲愰幘瀛樺闁芥ê顦辨径鍕磽娓氬洤鏋熼柣鐔叉櫊閻涱噣宕橀鍢夈劑鏌嶆潪鎵獢闁哥偛鐖煎娲传閸曨剙绐涢梺鍝ュТ鐎涒晝绮嬪鍫涗汗闁圭儤鎸撮幏鐑樼節闂堟稑锟芥悂骞夐埄鍐洸闁靛牆顦伴悡娆撴煕閹存瑥锟芥牜锟芥熬鎷�??,  index1: " + index1 + " ;index2: "+ index2);
				}
				else
				{
					TeamManager.logger.debug("SUCC:闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢绘俊鐐�栭悧婊堝磻濞戙垹鍨傞柛灞剧◤娴滄粓鏌″鍐ㄥ闁靛棙甯楅妵鍕煛閸屾粌寮ㄩ梺鍝勭灱閸犳牠骞冨鍏剧喓鎷犻崣澶嬵唫濠碉紕鍋戦崐鎰板疾濠婂牊鍋傞柨鐔哄Т閽冪喖鏌￠崶銉ョ仼闂佸崬娲︾换婵嬫濞戞瑧銈╁┑鈽嗗亞閸嬨倝寮婚悢鐓庣闁稿繗鍋愮粙鍥⒑閹稿孩澶勫ù婊勭矒閿濈偠绠涢弮鍌滅槇濠殿喗锕╅崜娑⑺囬妸銉富闁靛牆鎳愮粻浼存倵濮樼厧寮柟顔筋殕缁绘繂顫濋娑欏缂備胶铏庨崢濂稿箯鐎ｎ喖鍚归悗锝庡枟閻撴瑩鏌涢幋娆忥拷鏍拷姘炬嫹,  index1: " + index1 + " ;index2: "+ index2);
					team.switchTeamMemberWithSP(index1, index2);
//					long roleId1 = team.getTeamInfo().getMembers().get(index1-1).getRoleid();
//					long roleId2 = team.getTeamInfo().getMembers().get(index2-1).getRoleid();
//					team.getTeamInfo().getMembers().get(index2-1).setRoleid(roleId1);
//					team.getTeamInfo().getMembers().get(index1-1).setRoleid(roleId2);
//					
//					//闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘骞戦姀銈呯疀妞ゆ棁妫勬惔濠囨⒑瑜版帒浜伴柛搴ㄦ涧閳藉螣闁垮锟藉姊虹憴鍕姢闁汇倕娲獮妤呭即閻旇櫣鐦堥梺姹囧灲濞佳冪摥闂備礁鎽滈崰鍡涘礉瀹ュ洨鐭夌�广儱鎷嬮悡銉╂煕椤愩倕鏋旈柛妯哄船閳规垿鎮╃紒妯婚敪濠碘槅鍋呴〃濠囥�侀弮鍫晝闁靛牆娲﹂敍蹇涙⒑閸濆嫷妲兼繛澶嬫礃閻楀孩淇婇悙顏勶拷鎴﹀礉婵犲洤纾块柣銏㈩焾缁犳牗绻涢崱妯诲碍缂佺嫏鍥ㄧ厵闁圭⒈鍘奸獮鏍ㄧ箾閸喓绠炴慨濠勭帛閹峰懐绮电�ｎ偆绉烽梻浣筋嚃閸犳牠宕愰崷顓犵焿鐎广儱娲﹀畷澶愭煣韫囨凹娼愭繛鍫熷劤閳规垿顢欑粵瀣姼闂佺硶鏅滈悧鐘茬暦閹寸媴鎷烽敐搴℃灍闁绘挻娲橀妵鍕箛閸撲焦鍋х紓浣哄О閸庣敻寮婚敓鐘插耿妞ゆ挾濮烽惁鍫濃攽椤旂》鏀绘俊鐐舵閻ｇ兘顢曢敃锟界粈瀣亜閹捐泛鍓遍柡鍡╁亝娣囧﹪鎮欓鍕舵嫹瑜忕划濠氬箻閹颁胶鍔烽悷婊冪Т閻ｇ敻宕熼娑掓嫼闂佸湱顭堢�涒晝绮堥敓浠嬫⒑缁嬪尅鍔熸い顓炵墦椤㈡瑨绠涘☉娆愭闂佽法鍣﹂幏锟�?
//					Set<Long> roleids = new HashSet<Long>();
//					SMemberSequence sMemberSequence = new SMemberSequence();
//					sMemberSequence.teammemeberlist.add(team.getTeamInfo().getTeamleaderid());
//					roleids.add(team.getTeamInfo().getTeamleaderid());
//					for (xbean.TeamMember member : team.getTeamInfo().getMembers())
//					{
//						sMemberSequence.teammemeberlist.add(member.getRoleid());
//						roleids.add(member.getRoleid());
//					}
//					// 闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘骞戦姀銈呯疀妞ゆ棁妫勬惔濠囨⒑瑜版帒浜伴柛搴ㄦ涧閳藉螣闁垮鏉搁梻浣告憸婵參宕抽婊呯濞撴熬鎷风�殿噮鍋婂畷鎺楁倷閺夋垹妾┑鐘灱閸╂牠鏁嬪┑鐐茬墕閵堟悂寮婚敐鍡樺劅闁挎稑瀚弳娑㈡⒑缁嬪潡顎楃�规洦鍓濋悘瀣攽鎺抽崐鏇㈠箠韫囨稑纾归柛顐ｆ礃閻撴洟鏌曟径妯烘灈濠⒀屽灦閺岋綁骞樼�涙顦ㄧ紓浣虹帛閻╊垶鐛�ｎ喗鍊烽柛顭戝亜濞堝繘姊绘担绋挎倯婵犮垺锚椤洭鏁撻悩鑼舵憰闂佸搫娲㈤崹褰掔嵁閵忊�茬箚闁靛牆绻戠�氱懓顪冮妶鍡楃闁搞劋绮欏濠氭偄绾拌鲸鏅┑鐐村灦閻燁垰顫忕捄銊х＝濞达絽鎼牎闂佺儵鏅╅崹鍫曟偘椤斿槈鐔兼惞鐟欏嫭顔曢梻浣规偠閸庢粓宕ㄩ姘疇闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌ㄩ悢鍝勑㈢痪鎯ь煼閺屾稓浠﹂崜褏鐓傞梺娲诲幖濡濡撮幒鎴僵闁绘劦鍓欓鍫曟煟鎼淬値娼愭繛鍙夌墵楠炴牠顢曢敂钘変患濠电娀娼ч鍛矆鐎ｎ偁浜滈柟鎵虫櫅閿熷鍊濆畷銉╂晸閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎽傜�ｎ喖鐐婇柕濞垮労閸ゃ倝姊洪崫鍕垫Ч闁搞劎鏁婚幃妤咁敇閻愨晜鏂�濡炪倖姊婚悺鏃堟倿閻愵剛绠惧璺侯儑閳藉銇勯弬璺ㄧ闁轰焦鎹囬弫鎾绘晸閿燂拷?
//					xdb.Procedure.psendWhileCommit(roleids, sMemberSequence);
				}
				return true;
			}
			
		};
		swapMemberP.submit();
	}

	

	// 闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掓ィ鍐┾拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬礃濠㈡鐏冮梺鍛婂姦娴滄繈宕抽灏栨斀闁绘ê鐏氶弳鈺呮煕鐎ｎ剙浠辩�规洜鍎ょ换婵嬪炊瑜忛鍡涙⒑鐠恒劌娅愰柟鍑ゆ嫹?濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨偓鎷锋繝姘ワ拷鍛村矗婢跺牅绨婚棅顐㈡处閹告悂鎮电�ｎ喗鐓ユ繝闈涙－濡插綊鏌￠崨顔剧煉闁哄矉绠戣灒濞撴凹鍨遍埢鎾绘⒑閹肩偛锟芥垿宕愬┑瀣畺婵°倕鎳愬畵渚�鏌涢…鎴濇灈濠殿喖楠搁埞鎴︽倷妫版繂娈濈紓浣哄У閹瑰洭鐛崘鈹垮亝闁告劏鏅濋崝鍫曟倵楠炲灝鍔氭俊顐㈢焸楠炲繑绻濆顓涙嫼闂佸憡绋戦敃銈嗘叏閿曪拷闇夋繝濠傚閻帞锟芥鍠氶…鍫ュ煡婢舵劕顫呴柨娑樺楠炴劙姊绘担铏广�婇柛鎾寸箘缁瑩骞囬弶璺ㄧ枀婵°倧绲介崯顖炴偂濞戞◤褰掓晲閸涱喗鍠愰柡浣哥墦濮婅櫣鎷犻垾铏亖闂佹悶鍔岀紞濠囧箖妤ｅ啯鏅搁柣妯哄暱娴滈亶姊洪崜鎻掍簴闁稿孩鐓″鍐差潨閿熻棄顫忔繝姘＜婵炲棙甯掗崢锟犳⒑閸涘鐒奸柛銉ｅ妼娴犻箖姊洪幖鐐插姶闁诲繑绋戦埥澶愬閻樻妲规俊鐐�栭崝锕傚礈濠靛鏅搁柦妯侯槹閸嬨儵鏌″畝瀣埌闁宠閰ｉ獮瀣晲閸涱厾鐣眔cedure濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨剙娅ｉ梺娲诲幗椤ㄥ﹪寮婚妸鈺傚亜閻犲洦鐣幘缁樼厪闁搞儜鍐句純濡炪們鍨哄ú鐔笺�佸Δ鍛櫢濞寸姴顑冮敓钘夋嚇椤㈡宕熼鍌氬箥濠电娀娼ч崐鎼佀囬娑氼洸闁规鍣幏椋庢喆閸曨剛顦ㄩ梺鎸庢磸閸ㄤ粙濡存笟锟藉顕�宕煎┑鍡欑崺婵＄偑鍊栧濠氭偤閺冨牆瑙﹂柨鐕傛嫹
	private boolean checkleaderInTeam(long leaderRoleId,Team team)
	{
		if (team != null && team.getTeamInfo().getTeamleaderid() == leaderRoleId)
			return true;
		else
			return false;
	}
	//index闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愬弶鐤勫┑掳鍊х徊浠嬪疮椤栫偛纾婚悗锝庝簴閺�浠嬫煟濡绲绘い蹇ｄ邯閺屾稖绠涢弮鍌滅厜闂佸搫鏈惄顖炪�侀弴銏℃櫜闁糕剝鐟Σ浼存⒒娴ｅ憡鎯堥柟閿嬪灴楠炲繘鏁撻敓锟�?
	private boolean checkIndexValid(Team team, long index_1, long index_2)
	{
		if(index_1 >= 1 && index_1 <= team.getTeamInfo().getMembers().size() && index_2 >=1 && index_2 <=team.getTeamInfo().getMembers().size() && index_1 != index_2)
			return true;
		else 
			return false;
	}
	//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅絾绻濋崹顐㈠閻庨潧鐭傚娲捶椤撶偛濡洪梺绯曟櫅閻楀棝鈥﹂崶顒�鐓涢柛娑卞枤閸欏棝姊洪崫鍕窛闁稿鐩弫鎾绘寠婢跺鍠愮紓渚囧枛椤嘲顕ｆ繝姘ㄩ柨鏃�鍎崇敮楣冩⒒婵犲骸浜滄繛灞傚�濋、鏍川鐎涙ê锟借埖銇勮箛鎾跺闁绘挾鍠栭弻銊モ攽閸℃ê娅ｉ梺鑲╊焾缂嶅﹪寮诲澶嬪癄濠㈣埖蓱閳诲牆螖閻橀潧浠﹂柨鏇樺灩閻ｇ兘鏁撻悩鍐诧拷濠氭煕閵夛絽濡兼い蹇氭硾閳规垿鎮╃紒妯婚敪闂佸搫鑻悧鎾诲极閹邦厼绶為悗锝庡亝閻濇牠姊绘担渚劸闁哄牜鍓熼幊婵嬪礈瑜忛悳缁樼箾閹寸們姘跺绩娴犲鐓冮柦妯侯槹椤ユ粓鏌ｈ箛鏇炴灈闁诡喖缍婇弫鎾寸鐎ｎ偅娅囬梺璺ㄥ枙濡嫬鐣甸崟顖涒拺闁告稑顭▓妯好归崗鑲╃疄闁诡喚鍏橀弻鍥晜閹冩辈闂傚倷绀侀幉锟犲礉閿曞倹鍋傞柛顐犲劚缁�澶婎熆鐠轰警鐓繛鎾愁煼閺屾洟宕煎┑鍥舵缂備焦顨嗗銊ф閹烘鏁婂┑鍌滎焾瀵即鎮楀▓鍨珮闁稿锕妴浣割潩閼稿灚娅㈤梺鑺ッˇ閬嶅汲閿斿浜滈柟鏉垮閻ｉ亶宕鐐粹拺闂傚牊渚楀Σ褰掓煕閺傜偛鎳愭稉宥夋煙閹规劦鍤欓柦鍐枛閺岋綁寮崒妤佸珱闂佽桨绀佺�氫即骞冭ぐ鎺戠畳闁圭儤鍨甸‖瀣⒑閻戔晛澧叉い顓炴川濡叉劙骞樼�涙ê顎撻梺鑽ゅ枔婢ф寮虫导瀛樷拺闁荤喐婢樺▓鈺呮煙閸戙倖瀚�
	private boolean checkMemsberStateValid(Team team,  int index_1, int index_2)
	{
		if(team.getTeamInfo().getMembers().get(index_1 - 1).getState() == TeamMemberState.eTeamNormal &&
				team.getTeamInfo().getMembers().get(index_2 - 1).getState() == TeamMemberState.eTeamNormal)
			return true;
		else 
			return false;
	}
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794452;

	public int getType() {
		return 794452;
	}

	public int index1; // index是队员的序号，5人队伍的话，就是0~4
	public int index2;

	public CSwapMember() {
	}

	public CSwapMember(int _index1_, int _index2_) {
		this.index1 = _index1_;
		this.index2 = _index2_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(index1);
		_os_.marshal(index2);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		index1 = _os_.unmarshal_int();
		index2 = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSwapMember) {
			CSwapMember _o_ = (CSwapMember)_o1_;
			if (index1 != _o_.index1) return false;
			if (index2 != _o_.index2) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += index1;
		_h_ += index2;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(index1).append(",");
		_sb_.append(index2).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSwapMember _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = index1 - _o_.index1;
		if (0 != _c_) return _c_;
		_c_ = index2 - _o_.index2;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

