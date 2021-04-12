
package fire.pb.mission;
import fire.pb.battle.PSendCameraUrl;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CActiveMissionAIBattle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CActiveMissionAIBattle extends __CActiveMissionAIBattle__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid( this );
		if ( roleid < 0 )
			return;
		final MissionConfig conf = MissionManager.getInstance().getMissionConfig( missionid );
		if (conf == null)
			throw new NullPointerException( "婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵婵炲棗绻掗崝鎾⒑鏉炴壆顦︽い鎴濇婵＄敻宕熼姘鳖啋闁荤姾娅ｉ崕銈夋倵妤ｅ啯鈷戦柛娑橈功閹冲啰绱掔紒妯哄闁诲繐鍟村娲箰鎼达絿鐣甸梺鐟板暱闁帮絽顕ｉ幖浣肝у璺侯儑閸樺憡绻涙潏鍓у埌濠㈢懓锕畷鏇㈠箣閿旂晫鍘甸梺鍦帛鐢宕悙鐑樼厵妞ゆ牗绋掗ˉ鍫濃攽閳╁啯鍊愬┑锛勬焿椤︽挳鏌℃径澶岀煓婵﹦绮粭鐔兼晸閽樺鐒界憸鎴炴櫠濠靛鈷戦柛婵嗗閸ｈ櫣绱掗鑺ュ碍闁伙絿鍏橀獮鍥级鐠侯煈鍞堕梺纭呭閹活亞寰婇崸妤婃晩闁哄洢鍨洪崐鐢告煟瑜嶉幉锛勶拷姘秺閺岋絾鎯旈婊呅ｉ梺绋款儏鐎氫即銆侀弮鍫熸櫢闁跨噦鎷�=" + missionid + "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚圭憸鐗堝笒绾惧潡鏌熺�电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑樻⒒绾惧ジ鏌ㄩ悢璇残撶�垫澘瀚悾婵堬拷锝庡亜椤忓爼姊虹拫搴″暞閸熺偤鎮楀顒傜Ш婵﹨娅ｉ幑鍕Ω閵夛妇锟借櫣绱撴笟鍥ф灍闁荤啿鏅涢锝夘敃閿曪拷缁犺崵绱撴担濮戭亜鈻撻悢鍏尖拺闂傚牊鍐荤槐锟犳煕濞戝崬骞栫紓宥呮濮婂宕掑▎鎴М闂佺顕滅换婵嬪Υ閸愵喖宸濋柡澶嬪灩閺屽牓姊虹粔鍡楀濞堟洟鏌涚�Ｑ勬珚闁哄矉缍侀獮瀣晲閸♀晜顥夋俊鐐�ら崑鍕箠濮楋拷瀵寮撮姀鐘诲敹濠电娀娼уú銈夊疾閻㈠憡鍋℃繝濠傚椤ュ牏锟芥鍠涢褔鍩ユ径鎰潊闁绘ɑ鐗撻崝鎴﹀蓟閺囷紕鐤�濠电姴鍊搁埛澶愭⒑缂佹绠栭柣妤冨Т椤繐煤椤忓嫮顔囬柟鑹版彧缁插鏁撻懞銉ユ诞闁哄本绋撻敓鏂ょ秵閸嬪棗煤閹绢喗鐓冮柕澶涢檮椤ュ牏锟借娲橀敃銏ゃ�佸▎鎾冲簥濠㈣鍨板ú锕傛偂閺囥垺鐓冮柍杞扮瀵瓨鎱ㄥΟ鎸庣【缂佺媭鍨堕弻锝夋偄缁嬫妫庨梺鐚存嫹濞寸姴顑嗛悡鍐煏婢跺牆鍔氶柡鍡氫含缁辨帡鎮▎蹇斿闁稿鍔嶉妵鍕冀閵娧呯厐婵炲濮嶉崶銊у幈闂佸湱鍎ら幐绋棵归鎾呮嫹鐟欏嫭绀�闁靛牊鎮傞獮鍐閻樺灚娈濋梺瑙勵問閸犳洜鑺遍弶鎴旀斀闁绘ɑ顔栭弳婊呯磼鏉堛劍绀嬬�规洘鍨块獮姗�宕滄担铏规殽闂備礁婀遍妴瀣箯閿燂拷" );
		if(activetype == 0){
			if (conf.exeIndo.share == 0) {
				fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleid);
				if (team != null){
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 174001, null);
					Module.logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽鐎ｎ亣鎽曢梺闈浥堥弲娑氱尵瀹ュ鐓曢悘鐐插⒔閻擃垰顭跨憴鍕婵﹥妞藉畷顐﹀礋椤掑锛佺紓鍌欑贰閸犳骞戦崶褜鍤曞┑鐘崇閺呮彃顭跨捄鐚存敾妞ゃ儲绻堝娲捶椤撗呭姼闁诲孩绋堥弲鐘茬暦娴兼潙绠涢柣妤�鐗冮幏铏圭磽閸屾瑧鍔嶆い顓炴川缁顫濋鐘殿啎婵犮垼娉涢鍥洪幘顔界厱闁冲搫鍟禒杈殽閻愬樊鍎旈柡浣稿暣閺佹捇鎮剧仦绛嬫婵犻潧鍊搁幉锟犳偂閵夆晜鐓涢柛鎰╁妽婢跺嫭銇勯妷銉Ч闁靛洤瀚粻娑㈠Ψ閿曪拷椤忥拷" + roleid + "]婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕烽鐘电効闂佸湱鍎ゅΛ鎴﹀箯閻戣姤鏅查幖绮癸拷鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼閸ゅ秹鏌曟径濠傛灓濞存粠浜ｅΛ鐔奉渻閵堝棛澧遍柛瀣☉鏁堥柡灞诲劚缁狙囨煕椤愶絿鈽夊┑锛勵焾闇夋繝濠傚閻帡鏌ｉ幙鍐ㄤ喊鐎规洝鍩栭ˇ鐗堟償閳藉棗娈奸梻鍌氬�风欢锟犲矗鎼淬劌鍨傞柛顐ｆ礀閽冪喖鏌ㄥ☉妯侯仹婵炲矈浜弻娑㈠箻濡わ拷閻吋瀵奸崶鈺冪＝闁稿本鐟ㄩ崗灞解攽椤旂偓鏆柟顖氬椤㈡盯鎮欓棃娑氥偊婵犵妲呴崹鐢稿磻閹邦厹浠氶柟鎯板Г閸嬧剝绻涢崱妤冪妞ゅ繆鏅滈妵鍕疀閹捐泛鐓熷┑顔硷攻濡炶棄鐣峰鍫熷殤妞ゆ帪鎷烽悽顖樺劦濮婃椽宕妷銉愶絿锟界櫢鎷风紒瀣儥閸ゆ洟鏌熼幆鏉啃撻柡鍛箞閺屾稓浠﹂崜褋锟芥帡鏌涘Ο鍦煓婵﹨娅ｅ☉鐢稿川椤斿吋閿紓鍌欑劍閻擄紕绮婚弽顒侊紓濠电姰鍨奸崺鏍礉閺囩姷涓嶆慨妯垮煐閻撶喖鏌￠崒姘变虎闁诡喗鍨块弻娑氾拷锛卞啫鈷夌紓浣虹帛缁诲啰鎹㈠┑瀣＜婵﹩鍘介宥囩磽閸屾瑨鍏屽┑顔芥尦閳ワ箓鎮滈挊澶庢憰闂佺粯姊婚埛鍫ュ极瀹ュ棙鍙忔俊顖氥仒閸氼偄霉閻撳孩鍠樻慨濠呮閹瑰嫰濡搁妷锔撅拷楣冩⒑閸濆嫷鍎撶�规洜鏁稿Σ鎰版倷閸濆嫬鑰垮┑鐐村灦椤洭鎮伴妷銉㈡斀閹烘娊宕愰弴銏犵疇閹兼番鍔嶉崑鍌炴煛閸ャ儱鐏柣鎾寸懇閺岋綁骞嬮悜鍥︾返濠电偛鐗婂ú鐔煎蓟閿濆绠婚悗娑欘焽椤︿即姊洪崫鍕伇闁哥姵鐗曢锝夊醇閺囩偛鐎銈嗘濡嫰鏁撻挊澶嬫崳缂佽鲸鎸婚幏鍛存濞戞﹩鐎虫俊鐐�ら崢楣冨礂濡警鍤曞┑鐘崇閺咁剟鏌涢弴鈥崇厫閻庢艾缍婇弻銊モ攽閸℃侗锟芥霉濠婂嫮绠為柡宀嬬秮楠炴﹢宕￠悙鎻捫曢梻浣告惈閼活垳绮旈崼鏇炵疅闁圭虎鍠栫粈瀣亜閹扳晛锟芥挾妲愬┑鍥︾箚闁绘劦浜滈敓鑺ュ灴瀹曠懓煤椤忓懎浠梺鍐叉惈閹冲海绮婚悩缁樼厽闁归偊鍓氶幆鍫ュ船椤栫偞鈷戦梻鍫熶緱濡牓鏌涢妸銊ゅ惈闁跨喕濮ら懝鍓х礊婵犲洤钃熼柣鏂垮悑閻掍粙鏌ㄩ弴顏呭閻庢鍠氶崑鎾舵崲濞戙垹閱囨繝濠傛噽閻撴捇姊洪崫鍕効缂傚秳绶氶悰顔撅拷锝庝簴閺�浠嬫煕閵夋垵鏈ⅸ闂傚倷娴囬褏锟芥稈鏅涢～婵嬪Ω閳轰胶鐤囬梺瑙勫礃椤曆囨偂濮楋拷閺岀喐娼忔ィ鍐╊�嶉梺绋匡功閸忔﹢寮婚妶澶婄濞达綀顫夐柨顓炩攽閻愭潙姣嗛柛娑卞灣閿涙繈姊虹粙鎸庢拱婵ǜ鍔岄惃顒傜磽閸屾瑦绁伴柛鈺傜墬缁岄亶宕崟搴㈢洴婵拷闁靛牆妫岄幏娲⒑閼姐倕鏋戞繝銏★耿閸╂盯寮崒婊咃紲濡炪倖娲栭幊搴ㄦ倶閿旀拝鎷风憴鍕闁搞劌娼″顐﹀箻缂佹ê浜归悗瑙勬礀濞层倝鐛澶嬧拻濞达絼璀﹂弨鐗堛亜椤愩埄妯�鐎规洘绻堥弫鍐磼濮橆剚鍎繝鐢靛仜濡瑩宕归崷顓烆棜濠靛倸鎲￠悡鐔哥箾閸℃ê濮夐柟鍐插暞缁绘稓鎷犺閻ｇ敻鏌熼鍡欑瘈鐎规洘锕㈤、娆撴偩鐏炶棄绠炲┑鐘垫暩婵烇拷婵炰匠鍏炬稑螖閸滀焦鏅滈梺鍐叉惈閹冲繘鎮￠妷鈺傜厽闁哄啫鍊荤敮娑欍亜閵夈儺妲归柕鍥у椤㈡﹢鎮╅幓鎺戠闁诲氦顫夊ú妯侯渻閼恒儰绻嗛柣鎴ｅГ閺呮繈鏌ㄩ悢鐑樻珪婵炲棎鍨介幃娆撴倻濡厧骞嶉梻鍌欑贰閸欏繒绮婚幋锔惧祦婵鎷烽柡灞剧☉铻ｉ柛婵嗗閸╃偤姊虹�圭媭娼愰柛銊ユ健楠炲啫鈻庨幘宕囩厬婵犮垼鍩栬摫妞ゃ儻绲跨槐鎾诲磼濞嗘帒鍘＄紓渚囧櫘閸ㄨ泛鐣疯ぐ鎺撳殑妞ゆ牗鍐荤槐鎾绘⒒閸屾瑧绐旀繛浣冲懏宕查柛鈩冪♁閺呮悂鏌涙繝鍕瀻闁汇劏娅ｇ槐鎺楁偐鐎圭姴顥濆銈庝簻閸熷瓨淇婇崼鏇炲耿婵°倧鎷锋い顐㈡喘濮婃椽骞栭悙鎻掝瀳缂傚倸绉撮敃銈夘敋閿濆绠柤鎭掑劜濞呮粍绻濋姀锝嗙【妞ゆ垵娲畷銏ゆ濞戣鲸瀵岄梺闈涚墕濡瑩鍩涢幒妤佺厸闁告粈绀佹禍鐗堫殽閻愯韬�规洖鐖奸、妤佹媴閸濆嫬绠ュ┑锛勫亼閸婃牕螞娴ｅ摜鏆﹂柣銏犳啞閸庢绻涢崱妯诲鞍闁绘挻鐟﹂妵鍕籍閸パ冩優闂佹椿鍘介悷鈺呭蓟閻旂⒈鏁婇柤濮愬�楅悡鎾斥攽閳藉棗浜滈柛鐕佸亰閸┿儲寰勬繛銏㈠枛閹虫牠鍩￠崒姘彲闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ锟藉鍝勑ч崶褝鎷烽妶澶婄獥闁哄稁鍘界粻鎺楁⒒娴ｄ警鐒剧紒缁樺姍瀹曘儳锟斤綆鍓涚粈濠囨煙鐎电啸缁炬儳銈搁弻鐔兼焽閿曪拷瀵偓绻涢崼鐔虹煁妞ゃ劊鍎甸幃娆戯拷鐢殿焾閳綊鏌ら幐搴″闁靛洤瀚伴獮鎺楁倷閺夋埈浼撴繝鐢靛Х椤ｄ粙鏁撻悾灞戒缓闁稿鍨介弻鈥崇暆鐎ｎ剛袦濡炪們鍨洪敃銏ゅ箖閵堝棙濯撮柛锔诲幗濠㈡帡姊婚崒娆戭槮闁圭⒈鍋婇幊鐔碱敍濠婂懐鐓嬮悷婊呭鐢帡寮伴妷鈺傜厓闁宠桨绀侀弳鐐测攽椤栨稒灏﹂柡灞剧☉閳藉顫滈崼鐔告毎婵＄偑鍊栭弻銊х矓閸偆鈹嶅┑鐘叉处閸婇攱銇勮箛鎾愁伒闁归鍏橀獮鍥级鐠恒劍鐓ｆ繝鐢靛仦閸ㄥ爼鏁冮埡鍛惞闁哄洢鍨洪悡鏇熴亜閹板墎绋荤紒锟介敓鑺ヤ繆濡わ拷閹虫ê顫忓ú顏勫窛濠电姴鍟ˇ鈺呮⒑閹肩偛濡藉鐟版閸掓帞鎷犲ù瀣潔闂侀潧楠忕槐鏇㈠储椤忓懐绡�闁汇垽娼ф禒婊堟煟韫囨梻绠炵�规洘绻傞～婵嬫嚋閻㈤潧甯楅柣搴ｆ嚀鐎氫即宕戞繝鍋界喖鏁撴禒瀣拺閻犲洠锟借櫕鐏嶅銈冨妼閻楁捇鐛径鎰妞ゆ棁鍋愰ˇ鏉款渻閵堝棗绗掗柛瀣鍗卞ù鐓庣摠閳锋帒霉閿濆牊顏犻悽顖涚洴閺岀喓鍠婇崡鐐扮敖闂佺懓绠嶉崹褰掑煘閹达箑骞㈤柍杞扮劍椤撳潡姊洪懡銈呅㈡繛璇у缁﹪寮堕幊绛圭秮瀹曞ジ濡烽敂鎯у妇闂傚鍋勫ú锕�煤閺嵮勬瘎闂傚倷鐒﹀鍧楀磻閸曨叏鎷峰顓熺凡妞ゎ偄绻愮叅妞ゅ繐鎳庢禒顓㈡⒒娓氬洤寮跨紒鐘冲灥閳绘捇宕奸弴鐔叉嫼缂備礁顑嗛娆撳磿閹达附鐓曢悗锝冨妼閿熻姤娲熼幃楣冩倻缁涘鏅梺缁樺姇閻°劌鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�" + missionid + "]闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚圭憸鐗堝笒绾惧潡鏌熺�电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑樻⒒绾惧ジ鏌ㄩ悢璇残撶�垫澘瀚悾婵堬拷锝庡亜椤忓爼姊虹拫搴″暞閸熺偤鎮楀顒傜Ш婵﹨娅ｉ幑鍕Ω閵夛妇锟借櫣绱撴笟鍥ф灍闁荤啿鏅涢锝夘敃閿曪拷缁犺崵绱撴担濮戭亜鈻撻悢鍏尖拺闂傚牊渚楀Σ鍫曟煕鎼粹�宠埞鐞氭瑩鏌涢鐘插姕闁抽攱鍨块弻娑樷槈濮楀牆濮涢梺鐟板暱閸熸挳寮诲☉銏″亞濞达綁鏅查崰濠囨⒑鐠団�虫珝缂佺姵鐗犻獮鍐锤濡ゅ﹥鏅┑鈽嗗灥椤鎯堣箛娑欌拻濞达絽鎲＄拹锟犳煕鎼存稑锟芥骞戦姀銈呯妞ゆ棁鍋愰弻褔姊洪棃娑氱疄闁稿﹥鐗犻崺娑㈠箣閿旂晫鍘卞┑鐐村灦閿曨偊寮ㄧ拠宸唵閻犲搫鎼顓㈡煛鐏炲墽銆掗柨鐔告灮缂嶅棙绂嶅┑瀣惞闁搞儺鍓氱�电娀鏌ｉ弬鍨倯闁绘挶鍎甸弻锝夊即閻愯鎷烽崷顓ㄦ嫹濮樼偓瀚�?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閳╁啯鐝曢梻浣藉Г閿氭い锔诲枤缁辨棃寮撮悙鈺傛杸闂佺粯锚閻忔岸寮抽埡浣叉斀妞ゆ棁鍋愰幗鐘绘倵闂堟稏鍋㈢�规洏鍔戦、妤呭礂閸忕浠㈠銈冨灪濡啫鐣烽悢纰辨晣鐟滃秹骞冮崼銉︹拻闁稿本鐟ㄩ崗宀�绱掗鍛仸闁炽儻绠撳畷鍫曨敆閿熶粙寮告笟锟介弻鐔兼⒒鐎电濡介梺绋款儌閺呯娀寮婚妶澶婁紶闁靛闄勫В鍕磽娴ｅ弶顫夐柟椋庡厴濮婄粯绗熼敓钘夘焽瑜庨〃銉ㄧ疀閺囩偟绛忔繛瀵稿Т椤戝棝宕戦崒鐐寸厵闁规鍠栭。濂告煟閹惧瓨绀嬮柡宀嬬節瀹曟﹢骞愭惔鈽嗕紦濠电姷鏁搁崑娑橆嚕閸撲礁鍨濋幖娣妼缁�鍡涙煙閻戞﹩娈旈梺鍗炴喘閺屾洘寰勯崼婵嗗Б濡炪倧闄勫姗�鈥旈崘顔嘉ч柛鈩冪懃椤呯磽娴ｅ壊鍎愰柟鐟版搐閻ｇ兘濮�閵堝棛鍔堕悗骞垮劚濡矂骞忓ú顏呯厽閹肩补鍓濈拹鈥斥攽椤旂偓鏆挊鐔奉熆鐠轰警鍎庣紒璇叉閵囧嫰骞囬崜浣盒ｅ┑鐐茬墛缁捇寮婚敐鍛闁告鍋為悘鍫ユ煣娴兼瑧绉柡灞诲�曢湁閻庯綆鍋呴悵鏇㈡⒑閹稿海鈽夌紒缁樏～蹇涙惞鐟欏嫬鏋傞梺鍛婃处閸嬪嫭鎱ㄩ姀銈嗏拺闁荤喐婢橀弳杈╃磼缂佹ê娴柡浣规崌閹崇偤濡疯閺嗭繝姊洪悷鏉挎闁瑰嚖鎷�" );
					return;
				}
			}
			
			if ( !fire.pb.map.SceneNpcManager.checkDistance( npckey, roleid ) )
				return;
			
			final int npcid = fire.pb.npc.NpcServiceManager.getNpcIDByKey( npckey );
			if (npcid == -1)
				return;
		
			MissionColumn sml = new MissionColumn( roleid, true );
		
			RoleMission mission = sml.getMission(missionid);
			if ( mission == null ) {
				Module.logger.debug( "濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃缂侇噮鍨抽幑銏犫槈閵忕姷顓洪梺缁樺姇閻忔岸宕宠缁辨挻鎷呯粙娆炬殺闂佺顑冮崐婵嗩嚕鐠囨祴妲堥柕蹇曞閵婏负浜滈柡鍐ㄥ�哥敮鑸点亜椤愮喐娅囩紒杈ㄦ尰缁楃喐绻濋崘顭戜紦闂傚倷绀佹竟濠囧磻閸℃稑绐楅柟鎹愭硾婵剟鏌ㄩ悢鍓佺煓婵﹤顭峰畷鎺戭潩閸楃儐鏉哥紓鍌欑椤戝棛鏁敓鐘叉瀬鐎广儱顦猾宥夋煕椤愩倕鏋旈柛姗�绠栧娲传閸曞灚歇濠电偛顦板ú妯肩矉閹烘顫呴柕鍫濇－濮婃寧绻濋姀锝呯厫闁告梹鐗犻幃锟犲Ψ閿斿墽鐦堥梻鍌氱墛缁嬫帡藟閻愮儤鐓欓柛蹇曞帶婵秹鏌＄仦鍓ф创鐎殿噮鍓欓埢搴ㄥ箚瑜嶆竟搴ㄦ⒒娴ｇ瓔鍤冮柛鐘愁殜閵嗗啴宕ㄦ潏鍓х◤濠电娀娼ч鎰板极閸ヮ剚鐓熼柟閭﹀墮缁狙囨煙閾忣偆鎳囨慨濠勭帛閹峰懘宕ㄦ繝鍐ㄥ壍闂備礁鎼悧婊堝礈濞嗘垵寮叉繝纰樻閸垳鎷冮敃鍌氬惞婵°倕鎳忛悡鏇㈡煛閸ャ儱濡奸柣蹇曞█濮婃椽宕￠悙鏉戭槱缂備胶绮换鍫濈暦瑜版帩鏁冮柨婵嗘嚇閻庢椽姊虹拠鎻掝劉闁肩懓澧界槐鐐寸節閸パ嗘憰闂佺偨鍎辩壕顓㈠汲閵堝棎浜滈柡鍌氱仢閹垿鏌涢敐鍥у妺缂佺粯鐩畷濂稿Ψ瑜忛弳顐⑩攽椤旂》鏀绘俊鐐舵閻ｇ兘顢曢敃锟界粈瀣亜閺囩偞鍣洪柦鎴濐樀濮婄粯鎷呮笟顖滃姼闁诲孩绋堥弲鐘诲箖閿熺姵鏅搁柣妯垮皺閻ｆ椽姊虹捄銊ユ灁濠殿喗鎸冲畷锟犲箮閼恒儳鍘棅顐㈡储閸庡磭澹曢崸妤佺厱婵☆垳绮崐鎰叏婵犲啯銇濈�规洏鍔嶇换婵嬪磼濮樺吋缍傞梻鍌欑閹碱偊骞婅箛鏇炲灊閹兼番鍨婚々鏌ユ煙闂傚鍔嶉柛瀣ㄥ姂閺岋綁濮�閻樺吀绮甸梺鎸庣☉缁绘ê顫忛搹鍦＜婵☆垰鎼闂備礁鎲￠幐濠氭偡閳哄懌锟戒礁顫濋澶屽弳闂佸憡渚楅崹鎶芥晬濠婂懐纾介柛灞剧懅閸斿秵銇勯鐐存悙閻撱倝鎮楅悽鍛婁氦闁圭兘顥撻幉鎾礋椤掑偆妲梻渚�娼ч悧濠囧箖閸岀偟宓侀柛鎰靛枛椤懘鏌嶉挊澶嬵棡閺佸牓姊洪崷顓炲付闁宦板妿閹广垽宕橀鐚存嫹娴ｈ倽鐔兼嚃閳哄喛绱抽梻浣侯焾閺堫剟鎳濇ィ鍐╂櫢濞寸姴顑愬Λ鎴犵磼椤旇偐澧涚紒妤冨枛閺佹挻绂掔�ｎ亞鐣鹃悗鐧告嫹闁告洦鍋嗛敍婊冣攽閻愭潙鐏﹂柛鎴犳嚀鐓ら柟闂寸劍閳锋垿鏌涢幘鏉戠祷濞存粍绻冪换娑㈠矗婢跺苯鈷岄悗娈垮枙閸楄櫕淇婇悜钘夌厸闁稿本绮岄獮鍫ユ⒒娴ｅ憡鎯堟繛灞傚灲瀹曟繂鐣濋崟顒�锟藉爼鏌ｅΟ鍏兼毄缁炬儳銈搁弻銊╂偄閸撲胶鐓撻悗瑙勬礃閿曘垽銆侀弮鍫濆窛妞ゆ挾鍠撻敓浠嬬畺濮婄粯绻濇惔鈥茬盎濠电偠顕滅粻鎴犲弲濠电姴锕ら悧濠囧磿濡ゅ懏鐓曢柍鈺佸暟閳句線鏌ｉ幘鍗炲姦闁哄矉缍佸鎾倷鐠囇勫闁革富鍙忛幏宄邦潩閻愵剙顏�" );
				return;
			}
			final int status = mission.getState();
		
			if ( npcid == conf.exeIndo.npcID && status == MissionStatus.PROCESSING ) {
				if ( !checkEnterBattle( roleid, conf ) ) {
					return;
				}
				final int aiid = conf.aiInfo.aIID;
				new MissionBattle(roleid, aiid, 
						new MissionBattleEndHandler(missionid, conf.aiInfo.battleResult, roleid),
						conf.scenarioInfo.animationID).submit();
			}
		} else if (activetype == 1) {
			//TODO:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К缂傚倷鑳舵慨閿嬬箾閿熶粙鏌″畝锟介崰鏍х暦濠婂棭妲鹃柣銏╁灡閻╊垶寮诲☉姘炬嫹閿濆啫濡奸柨鐔诲Г缁诲牆顕ｆ繝姘嵆闁绘棁娅ｉ鏇㈡⒑閸撹尙鍘涢柛鐘崇墵閳ユ牗寰勯幇顓涙嫼闂佽崵鍠愬姗�寮抽柆宥嗙厽妞ゆ挾鍋涢敓鑺ユ倐閿濈偠绠涢弴鐘碉紲濠碘槅鍨甸褔顢撻幘缁樷拺闁告稑锕﹂埥澶愭煥閺囨ê鍔︾�规洘娲熼獮姗�骞囨担鐟扮槣闂備線娼ч悧鍡椢涘Δ鍛�堕柕澶涘缁犲墽锟界懓澹婇崰鏍嵁閺嶎厽鐓熼柨婵嗩槹閺侀亶鎮楅棃娑栧仮鐎殿喖鐖奸獮瀣攽閸℃瑣鍋栭梻鍌氬�风欢姘焽瑜忛幑銏ゅ箳閹炬潙寮块梺鍓插亖閸庢煡寮插┑瀣厱閻忕偛澧介妴鎺楁煕濡吋鏆慨濠呮缁辨帒顫滈崱妯兼殽闂備胶绮〃鍛存晝閿曪拷閳诲酣濮�閵堝懓鎽曢梺闈涱檧婵″洭宕㈤崡鐐╂斀閹烘娊宕愰幘鍓佺焼濞撴熬鎷烽柛鈹垮灲瀵挳濮�閿涘嫬骞愰柣搴ｆ閹风兘鎮楅敐搴″鐞氾附淇婇妶鍥ラ柛瀣☉鐓ゆい鎾亾閿熸垝绀侀～婊堟晸娴犲绠栨繛鍡樻尰閸嬨劑鏌ｉ幇顔藉殌濞寸媭鍘奸埞鎴︽偐閸偅姣勬繝娈垮枙閸楀啿鐣风憴鍕檮闂傚牃鏅濈粙蹇旂節閵忥絽鐓愰柛鏃�鐗犲畷鎴狅拷锝庡枟閻撶喐淇婇婊冨妺闁崇粯娲樼换娑㈠礂閼测晛顫х紓浣虹帛缁嬫垿顢欒箛娑辨晩闁煎鍊楀▔鍧楁煟鎼达絾鍤�闁硅绱曢幑銏ゅ磼閻愯尙鍘撮梺纭呮彧闂勫嫰宕戦幇鐗堢厵缂備焦锚缁楁碍绻涢崼鐔虹煉婵﹥妞介幃鐑藉级閹稿巩鈺侇渻閵堝骸骞栭柛銏＄叀閿濈偠绠涢幘浣规そ椤㈡棃宕熼鍡欏�為梻鍌欑窔濞佳囁囬銏犵？婵炴垯鍨洪弲鏌ユ煕閳╁啰鎳呮い鏃�娲熷娲嚃閳圭偓瀚涢梺鍛婃尰閻熲晛顕ｉ崨濠冨劅闁靛濡囬崢浠嬫⒑閹稿海绠撻柟鍐查鍗卞┑鐘崇閹虫岸鏌″搴″箺闁绘挻娲樼换娑㈠箣濠靛棜鍩為梺鍝勵儑閸犳劗鎹㈠☉銏犲窛妞ゆ劑鍨绘导鍫濃攽椤旂》榫氭繛鍜冪秮楠炴垿宕熼姣尖晠鏌曟径娑橆洭鐟滅増宀稿缁樻媴閻戞ê娈岄梺鎼炲�栭悧鐘荤嵁韫囨稒鏅搁柨鐕傛嫹
			final int aiid = conf.aiInfo.aIID;
			new PSendCameraUrl(aiid,roleid).submit();
		}
	}
	
	private static boolean checkEnterBattle( final long roleid, final MissionConfig conf ) {
		fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId( roleid );
		if ( team == null && conf.exeIndo.teamState == 2 ) {
			return false;
		}
		if ( team != null && !team.isAbsentMember( roleid ) && conf.exeIndo.teamState == 0 ) {
			Module.logger.error( "婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵婵炲棗绻掗崝鎾⒑鏉炴壆顦︽い鎴濇婵＄敻宕熼姘鳖啋闁荤姾娅ｉ崕銈夋倵妤ｅ啯鈷戦柛娑橈功閹冲啰绱掔紒妯哄闁诲繐鍟村娲箰鎼达絿鐣甸梺鐟板暱闁帮絽顕ｉ幖浣肝у璺侯儑閸樺憡绻涙潏鍓у埌濠㈢懓锕畷鏇㈠箣閿旂晫鍘甸梺鍦帛鐢宕悙鐑樼厵妞ゆ牗绋掗ˉ鍫濃攽閳╁啯鍊愬┑锛勬焿椤︽挳鏌℃径澶岀煓婵﹦绮粭鐔兼晸閽樺鐒界憸鎴炴櫠濠靛鈷戦柛婵嗗閸ｈ櫣绱掗鑺ュ碍妞ゆ洩缍佸濠氬Ψ閵壯屽晣濠电偠鎻徊钘夛耿闁秴鐭楅柛鈩冪♁閳锋垹绱撴担鑲℃垹绮堥敓浠嬫⒑缁嬪尅宸ユ繝锟介柆宥嗘櫢闁兼亽鍎抽崯鏌ユ煙閸戙倖瀚�" + conf.missionId + "婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹤顕ｇ拠娴嬫婵☆垶鏀遍弬锟介梻浣告啞濞诧箓宕戦崟顒佸弿闁靛繈鍊栭埛鎴炵箾閼奸鍤欐鐐搭殜閺岀喖鎮烽悧鍫濇灎閻庢鍠栭…鐑藉极閹邦厼绶炲┑鐘插閸氬懘姊绘担鐟邦嚋缂佽鍊歌灋妞ゆ挾鍊ｅ☉銏犵妞ゆ挾濮烽敍婵囩箾閹剧澹橀柨鏇樺劤閿熻姤鑹剧紞濠傤潖閾忓湱鐭欓柟绋垮閹疯京绱撴担鍓插剱閻㈩垪锟藉磭鏆﹂柨婵嗙墢閻わ拷闂佸搫鍊告晶鐣岀不濮樿埖鈷戦梻鍫熺〒婢ф洟鏌熷畡閭﹀剶鐎规洘娲熼獮鍥偋閸繐鎷烽崹顐ｅ弿婵妫楁晶鎵磼婢跺銇濋柡宀�鍠栭、娆戠驳鐎ｎ偆鏆ラ梻浣哥－缁垶骞戦崶褏鏆︾憸鐗堝俯閺佸﹪鏌ｉ敐鍛殭闂侇収鍨跺濠氬磼濞嗘劗銈板銈嗘肠閸涱喖搴婇梺纭呮彧闂勫嫰宕电仦杞挎棃鏁愰崨顓熺亾闂佽桨绀侀澶愬蓟閺囩喎绶為柛鈩兩戦悵鏃傜磽娓氬﹥瀚归柣搴秵閸嬩焦绂嶅鍫熺厸鐎广儱鍟俊浠嬫煟閵婏箑鐏撮柡宀嬬秮婵℃儼绠涢弬娆句紦婵犵數濮烽。顔炬閺囥垹纾婚柟杈剧畱绾惧綊鏌″搴″箹缂佺姳鍗抽弻鐔兼⒒鐎垫瓕绠為梺鎼炲労閸撴瑧鐥娣囧﹪顢曢姀顫驳濠碉紕鍋犲Λ鍕敋閿濆棛顩烽悗锝呯仛閺咃綁姊虹紒妯活梿婵炲拑缍佸鎶藉閵堝棌鎷婚梺绋挎湰閼归箖鏁撻悾灞藉幋闁硅櫕顨婂畷婊勬媴缁嬭法浜版俊鐐�栭悧婊堝磻濞戞氨涓嶉柟娈垮枤绾惧ジ鎮楅敐搴′壕缂佹墎鏅濋幉鎼佹偋閸繄鐟查梺缁樻尪閸庣敻骞冨Δ鍛櫜閹肩补锟芥剚娼婚梻浣瑰墯娴滄瑩宕￠崘宸綎缂備焦蓱婵挳鏌﹀Ο渚Ц闁诡垳鍋ゅ娲传閵夈儛锝夋煕閺冿拷椤ㄥ﹤鐣峰璺虹婵°倧鎷风紒鐘电帛閹便劑鎮烽悧鍫€偒闂佸綊顥撻崗妯虹暦閹烘鍊烽悗娑櫳戦悵鏍⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂鑺ユ闂佽姤锚椤︿即宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮櫘閸撶喎鐣疯ぐ鎺濇晩閻熸瑥瀚惁閬嶆⒒閸屾瑧鍔嶆俊鐐叉健瀹曘垺绺介弶鍡楁喘閹晫绮欓懗顖涙啺闂備線娼ц墝闁哄懏绮撳畷鎴﹀幢濞戞瑧鍘遍柣蹇曞仜婢т粙鍩ユ径瀣ㄤ簻闊洢鍎茬�氾拷?" );
			fire.pb.talk.MessageMgr.sendMsgNotify( roleid, 141711, null );
			return false;
		}
		if ( conf.exeIndo.hasOtherLimit == 1 ) {
			final SSpecialScenarioQuestConfig sconf = conf.getSpecialScenarioQuestConfig();
			if ( sconf == null )
				return false;
			if ( sconf.缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨绘い鎺嬪灪閵囧嫰骞囬鍡欑厯闂佸搫琚崝鎴﹀箖閵忋倕浼犻柛鏇熷灟閸ㄥ鎯�椤忓牆绠查柟浼存涧濞堫厼顪冮妶搴″箹婵炵》绻濋獮濠傤煥閸噥妫冨┑鐐村灦椤嫰寮撮姀鈾�鎷洪柡澶屽仦婢瑰棝藝閿斿浜滈柟瀛樼箖閸犳ɑ顨ラ悙宸█妤犵偞鐗楅幏鍛村传閵壯勭秮闂傚倷绀佹竟濠囧磻閸涱垱宕查柛鏇ㄥ灡閸嬧晠鏌涘┑鍡楊仱闁猴拷娴犲绠抽柟鎯版绾惧綊鏌￠崶銉ョ仼闁汇値鍠栭湁闁绘挸娴烽幗鐘绘煕鎼淬埄娈曠紒缁樼洴瀹曞崬螣鐠囨煡鐎洪梻浣虹帛閹稿摜鎹㈠锟藉璇测槈閵忕姷鍙�闂佺硶鍓濋〃鍛不濞差亝鐓熼幖娣灮閸熸煡鏌熼崙銈嗗2 == 2 ) {
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡枠婵﹦绮幏鍛喆閸曨偂鍝楅梻浣侯焾鐎涒晛顪冮挊澶屾殾婵犲﹤鍟犻弸搴ㄦ煙鐎涙绠ユ俊顐ｇ矒閹嘲顭ㄩ崨顓ф毉闁汇埄鍨遍〃濠囧箖閳ユ枼妲堟慨妯煎亾鐎氳顨ラ悙鑼虎闁告梹鑹捐灃闁绘娅曢崐鎰版煟濞戝崬娅嶇�殿喕绮欓、姗�鎮㈤崫鍕睄闂傚倷绀侀幉锟犲礉閿旂晫顩叉繝濠傜墕閸戠姵绻涢幋娆忕仾闁绘挻鐩幃姗�鎮欓幓鎺嗘寖濠电偛寮跺娆撳煘閹达附鏅柛鏇ㄥ亜楠炲顪冮妶鍐ㄧ仾闁荤啿鏅犻獮鍐焺閸愨晛鍔呭銈嗘⒐閸ㄦ繂顫濋敂鍓х＝闁稿本鑹鹃敓鑺ユ倐瀹曟劖顦版惔銏╁仺闂侀潧鐗嗛ˇ顖滅不椤栫偞鐓熼柟杈剧到琚氶梺缁樻尰濞茬喖寮婚敓鐘茬倞闁靛鍎遍‖鍫ユ⒑鐠囨煡鐛滅紒缁樼箞瀵鏁愭径濠勵啋闁荤姾娅ｉ崕銈夋倶閸儲鈷戦柛婵嗗閻忛亶鏌涢悩铏磳闁轰焦鎹囬幃鍓т沪閻愵剚鐦撻梻浣告惈閹虫挾浜稿▎寰綁骞囬悧鍫熷劒濡炪倖鍔楁慨宕囪姳婵犳碍顥婃い鎰╁灪婢跺嫰鏌熼崫銉ヤ壕闁哄懓娉涢埥澶愬閿涘嫬骞堝┑鐘垫暩婵挳骞婃惔銊﹀亗闁归偊鍠氱壕鑲╃磽娴ｈ鐒芥繛鎻掔摠椤ㄣ儵鎮欏顔煎壈闂佸疇顕у锔剧不濞戙垹鍗虫慨妯块哺閿涘繘姊婚崒姘拷鐑芥嚄閸洍锟斤箓宕奸妷锔芥珖闂佹寧娲栭崐鎼佸几娴ｇ硶鏀介柣妯虹枃婢规﹢鏌﹂崘顏勬瀾缂佺粯鐩獮瀣枎韫囨洑鐥梻浣告惈閹冲繒鍒掗幘璇茬畺鐟滅増甯掗悙濠囨煏婵炲灝鍔ょ紒渚�顥撶槐鎾存媴閸濆嫅銏㈢磽瀹ュ拑韬�殿喛顕ч埥澶愬閳ュ厖绨婚梻鍌欑閻忔繈顢栭崨鏉戞辈闁割偁鍨荤壕钘壝归敐鍫燁仩閻㈩垱绋撶槐鎺旀嫚閼碱剙鈪甸悗瑙勬礀閹碱偊鍩ユ径鎰潊闁斥晛鍟鐔兼⒒娴ｈ棄袚闁挎碍銇勯敂璺ㄧ煓鐎规洏鍎抽敓鏂ょ秵閸犳鎮￠弴銏＄厓闁宠桨绀侀弸銈嗙箾閸稑鐏╅棁澶岀棯椤撱垺鏁遍悗姘炬嫹
				final int fightpetkey =
					xtable.Properties.selectFightpetkey( roleid );
				fire.pb.pet.PetColumn pc = new fire.pb.pet.PetColumn( roleid, 
						fire.pb.pet.PetColumnTypes.PET, true );
				xbean.PetInfo pi = pc.getPetInfo( fightpetkey );
				if ( pi == null || 
						(sconf.activeparams != null && 
						!sconf.activeparams.contains( pi.getId() ) ) ) {
					fire.pb.talk.MessageMgr.sendMsgNotify( roleid, sconf.emsg, conf.exeIndo.npcID, null );
					return false;
				}
			}
		}
		return true;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805452;

	public int getType() {
		return 805452;
	}

	public int missionid; // 任务id
	public long npckey; // npc的key
	public int activetype; // 激活类型:0进入AI战斗,1观看战斗录像

	public CActiveMissionAIBattle() {
	}

	public CActiveMissionAIBattle(int _missionid_, long _npckey_, int _activetype_) {
		this.missionid = _missionid_;
		this.npckey = _npckey_;
		this.activetype = _activetype_;
	}

	public final boolean _validator_() {
		if (missionid < 1001 || missionid >  999999) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(missionid);
		_os_.marshal(npckey);
		_os_.marshal(activetype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		missionid = _os_.unmarshal_int();
		npckey = _os_.unmarshal_long();
		activetype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CActiveMissionAIBattle) {
			CActiveMissionAIBattle _o_ = (CActiveMissionAIBattle)_o1_;
			if (missionid != _o_.missionid) return false;
			if (npckey != _o_.npckey) return false;
			if (activetype != _o_.activetype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += missionid;
		_h_ += (int)npckey;
		_h_ += activetype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(missionid).append(",");
		_sb_.append(npckey).append(",");
		_sb_.append(activetype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CActiveMissionAIBattle _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = missionid - _o_.missionid;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		_c_ = activetype - _o_.activetype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

