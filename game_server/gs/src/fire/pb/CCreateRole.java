
package fire.pb;

import java.io.UnsupportedEncodingException;

import fire.pb.cross.CrossManager;
import fire.pb.role.PCreateRole;
import fire.pb.util.CheckName;

import org.apache.log4j.Logger;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCreateRole__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}


public class CCreateRole extends __CCreateRole__ {
	public static final Logger logger = Logger.getLogger("SYSTEM");
	
	private boolean  sendError(int err){
		final SCreateRoleError res=new SCreateRoleError();
		res.err=err;
		return gnet.link.Onlines.getInstance().sendResponse(this, res);
	}
	
	@Override
	protected void process() {
		if(CrossManager.getInstance().isInCrossServer()){
			logger.error("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌涢…鎴濅簽妞も晜褰冮湁闁绘ê妯婇崕蹇曠磼閿熻姤寰勫畝瀣妤犵偛鐏濋崝姘舵煙闁垮鐏撮柟铏崌瀹曠螖娴ｅ搫骞堥梻渚�娼чˇ顓㈠垂閸濆嫧鏋嶉柛銉墯閻撶喐銇勯幘璺哄壉婵″弶鎮傚Λ浣瑰緞閹邦厾鍙嗗┑鐘绘涧濡稒鏅堕柆宥嗙厱闁靛牆鎳庨弳锝夋煛鐏炲墽娲存鐐达耿閹筹繝濡堕崶銊︾槖闂傚倷绀侀幖顐﹀嫉椤掑嫭鍎庢い鏍仧瀹撲線鏌熼悜姗嗘當缂佺姴顭烽弻娑㈠Ω閿旈敮妾ㄥ銈庡亜缁夊墎妲愰幘璇茬＜婵﹩鍓ㄩ幏鐑藉箹娴ｅ摜锛欓悷婊呭鐢帞绮婚弶璇炬棃鏁愰崨顓熸缂備胶濮烽崰鏍蓟閻旇櫣纾奸柕蹇曞У閻忓牏绱撴担鍝勑ｅ┑鐐诧躬瀵鏁撻悩鑼�為梺瀹犳〃缁�浣圭珶婢跺ň鏀介柍钘夋娴滈箖鏌熼崙銈嗗!!!");
			return;
		}
		
		if(!fire.pb.main.ConfigManager.isCanCreateRole) {
			sendError(SCreateRoleError.CREATE_CREATE_GM_FORBID);
			logger.error("GM闂傚倸鍊峰ù鍥敋瑜嶉～婵嬫晝閸岋妇绋忔繝銏ｅ煐閸旀牠宕戦妶澶嬬厸闁搞儮鏅涘皬闂佺粯甯掗敃銉ф崲濞戙垹骞㈡俊顖濇娴犳挳姊洪幖鐐插缂佽鐗撳濠氬Ω閳哄倸浜滈梺鍛婄箓鐎氬懘濮�閵忋垻锛滈梺璺ㄥ枍缁瑥鐣烽幒妤佸�烽悗鐢殿焾楠炲秹姊绘担绛嬪殐闁搞劌宕…鍨熷▎鐐瘣闂傚倸鍊烽悞锔撅拷绗涘懐鐭欓柟鐑樺殾濞戙垹绀冩い鏃囧閹芥洖鈹戦悙鏉戠仧闁搞劌婀辩划濠氬箮閼恒儳鍘甸梺璇″瀻閸涱剟鍋楁繝纰樺墲瑜板啴鎮ц箛鏇燁潟闁规崘顕х壕鍏兼叏濮楀棗澧鹃柟椋庢焿閵囨劙骞掗幋鐙�鍞跺┑掳鍊х徊浠嬪疮椤愩倗涓嶉柣鏂垮悑閻撴瑧绱撴担闈涚仼闁哄绋撶槐鎺楁偐閸愭祴鏋欓梺鍝勭焿缁绘繂鐣烽崼鏇炵厸濞达絿顭堥ˉ搴㈢節绾版ɑ顫婇柛瀣崌楠炲繘鏁撻敓锟�!!!");
			return;
		}
		
		// protocol handle
		final int userID=((gnet.link.Dispatch)this.getContext()).userid;		
		final xbean.User u = xtable.User.select(userID);
		// 婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜閻犱警鐓夐幏椋庢喆閸曨剛顦ュ┑鐐额嚋缁犳挸顕ｉ崘宸叆闁割偆鍠撻崣鍕椤愩垺澶勬繛鍙夛耿椤㈡棃鎮㈤崗鑲╁幍婵＄偛顑呮鎼佸储閹绢喗鐓欐い鏃�鍎抽崢瀛橆殽閻愯尙效妞ゃ垺鐟╅幊鏍煛娴ｅ摜顔�?婵犵數濮烽弫鍛婃叏娴兼潙鍨傞柣鎾崇岸閺嬫牗绻涢幋娆忕労闁轰礁瀚伴弻娑樷槈濞嗘劕鍓归梺杞扮閸婂潡寮婚弴鐔风窞闁糕剝蓱閻濇洟姊虹紒妯诲暗闁哥姵鐗犲濠氬即閻旇櫣顔曢梺鍓茬厛閸犳牗鎱ㄦ惔鈽嗘富闁靛牆鎳忕粋瀣煕閹炬潙鍝哄┑锛勬暬瀹曠喖顢涢敐鍡樻珖闂備焦瀵х换鍌滐拷娑掓櫊閹寧绗熼敓钘夘潖閾忚鍏滈柛娑卞枤瑜把呯磽娴ｇ瓔鍤欓柣妤佹崌楠炲啴鏁撻悪锟介弫鍐煥閺冨倻甯涢柡鍜冪秮濮婅櫣绱掑Ο蹇ｄ邯閹ê顫濈捄铏圭崶濠电偞鍨崹娲煕閹烘鐓曢悘鐐村礃婢规﹢鏌ㄩ悢璇残撻柟顔煎�搁悾鐑藉箛閺夊潡鍞堕梺鍝勬川閸嬬喖藝椤曪拷閹鐛崹顔煎闂佽鍨遍幐濠氬箚閺冨牆惟闁靛／灞芥暥闂傚倷娴囨慨銈夋晪濡炪倧瀵岄崹浼搭敋閿濆懐鏆嬮梺顓ㄩ檮鐎靛矂姊洪棃娑氬婵☆偅绋掗弲鍫曨敆閸屾粍锛忛梺鍝勵槼濞夋洘鏅ラ柣搴ゎ潐濞叉ê煤濡吋宕叉繝闈涱儏閻愬﹪鏌曟繛鍨姷闁归鍏橀幃浠嬪川婵犲嫬骞楅梻渚�娼х换鎺撴叏闁垮顩锋繛鎴欏灪閻撴洟鏌曢崼婵堢閻庢艾婀辩槐鎾诲磼濮橆剨鎷锋搴㈩偨闁跨喓濮甸崑鍌氼熆閼搁潧濮囩紒鐙�鍨堕弻銊╂偆閸屾稑顏�
		final fire.pb.role.SCreateRoleConfig config = RoleConfigManager.getCreateRoleConfig(shape);
		if (config == null)
		{
			logger.error("-------------------------婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ煏閸℃ê绗掓い顐ｇ箞閹瑩顢楅敓浠嬵敂閼稿吀绻嗛柕鍫濇搐鍟搁梺绋款儐缁嬫挾鍒掗弮鍥ヤ汗闁圭儤鏌ㄧ粊锕傛⒑缁洖澧查柛鎴犳嚀鍗卞┑鐘崇閳锋垹绱撴担鑲℃垹浜搁銏＄厱濠电姴鍊归崑銉︻殽閻愭彃鏆欓摶鏍煕濞戝崬鏋涘ù鐘虫そ濮婃椽宕滈懠顒�甯ラ梺绋款儏鐎氼剟鍩㈤幘宕囨殕闁跨喓鏅Σ鎰板箻鐎涙ê顎撻梻鍌氱墛缁嬫垿鈥栨径鎰拺缂備焦蓱閹牏绱掔紒妯肩疄闁绘侗鍣ｅ畷鍗炩槈濡⒈妲版俊鐐�栧Λ渚�宕戦幇鍏洭寮跺▎鐐瘜闂侀潧鐗嗗Λ娑欐櫠椤掑嫭鐓犻柣鐔告緲閳锋棃鏌熺粔鍡楁嫅閹风兘鏁愭惔鈥愁潾缂佹儳褰炵划娆撳蓟濞戞矮娌柟瑙勫姇椤ユ繈姊洪崫鍕靛剭闁稿﹥绻堝璇测槈閵忊�充汗闂佸綊顣﹂悞锕傛偪娓氾拷閹鈻撻崹顔界亶闂佽鍠栭崐鎼佹偩瀹勯偊娼ㄩ柨鐔剁矙瀹曟椽鏁撻悩鑼槰闂佺粯鍔﹂崜娑㈠Χ閿燂拷?!!!--------"+shape);
			return;
		}
			
		if (!config.schools.contains(school))
		{
			logger.error("------"+shape+"-------------------婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ煏閸℃ê绗掓い顐ｇ箞閹瑩顢楅敓浠嬵敂閼稿吀绻嗛柕鍫濇搐鍟搁梺绋款儐缁嬫挾鍒掗弮鍥ヤ汗闁圭儤鏌ㄧ粊锕傛⒑缁洖澧查柛鎴犳嚀鍗卞┑鐘崇閳锋垹绱撴担鑲℃垹浜搁銏＄厱濠电姴鍊归崑銉︻殽閻愭彃鏆欓摶鏍煕濞戝崬鏋涘ù鐘虫そ濮婃椽宕滈懠顒�甯ラ梺绋款儏鐎氼剟鍩㈤幘宕囨殕闁跨喓鏅Σ鎰板箻鐎涙ê顎撻梻鍌氱墛缁嬫垿鈥栨径鎰拺缂備焦蓱閹牏绱掔紒妯肩疄闁绘侗鍣ｅ畷鍗炩槈濡⒈妲版俊鐐�栧Λ渚�宕戦幇鍏洭寮跺▎鐐瘜闂侀潧鐗嗗Λ娆撳煕閹烘梻纾兼い鏇炴噹閻忕娀鏌ｉ敐鍥у幋妤犵偞顭囬敓浠嬫涧閹芥粓顢欓弴銏♀拺閻熸瑥瀚崕妤呮煕閵娿劋鍚柨鐔诲Г閻旑剟骞忛敓锟�?!!!------"+school);
			return;
		}
		
		
		//婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閻撴瑩鏌熼婊冾暭妞ゃ儱顦甸弻锛勶拷锝傛櫇缁愭棃鏌＄仦鐐鐎规洜鍘ч埞鎴﹀箛椤撳／鍥ㄢ拺缂佸顑欓崕宥夋煕閺冿拷閸ㄥ灝顕ｆ繝姘嵆闁绘棁娅ｉ惁鍫ユ椤愩垺澶勬繛鍙夌矒瀵娊鎮╃紒妯锋嫼缂傚倷鐒﹁摫閻忓繒澧楃换娑㈡嚑椤掞拷閺嬫稓锟芥鍠涢褔鍩ユ径濠庢建闁糕剝锚閸忓﹥淇婇悙顏勶拷鏍暜閹烘纾归柟閭﹀灱濡嫰姊洪崫鍕効缂佺粯绻傞悾鐑藉础閻戝棙鍍甸柣鐘烘閸庛倝骞婂▎鎾粹拻濞达絿鐡旈崵鍐煕閵娿儱鑸归摶鐐烘煕閹伴潧鏋涢柡瀣╃窔閺屾稑鐣濋敓浠嬪磻閻愬搫鍚圭�广儱顦伴悡蹇擃熆鐠轰警鍎忓┑顔ㄥ懐纾奸柣妯挎珪瀹曞瞼锟芥鍠涢褔鍩ユ径濠庢建闁糕剝锚閸忓﹪姊绘担鍛婂暈闁圭妫濆畷銊╊敊缁涘鏅犻梻鍌氬�搁崐宄懊归崶顒夋晪闁哄稁鍘肩粣妤呮煛瀹ュ骸骞楅柣鎿勬嫹闂備焦瀵х换鍌炈囬婊呬笉闁哄稁鍘介悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?
		int nameLen = CheckName.nameLen();
		int length=0;
		try {
			length=(new String(name.getBytes( "gb2312"), "ISO-8859-1")).length();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			sendError(SCreateRoleError.CREATE_OVERLEN);
			logger.error("闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愬弶鐤勯梻浣告啞閹稿棝宕ㄩ婊冨脯闂傚倷绀佸﹢閬嶆惞鎼淬劌绐楁俊銈呮噹绾惧鏌曢崼婵囧闁哥姵鍔欓弻锟犲磼濞戝崬鍔屽┑鐐插悑閻楁粓骞夐幖浣瑰亱闁割偅绻勯悷銊╂⒑閹肩偛濡奸柛濠傜秺婵＄敻宕熼姘辩潉闂佺鏈〃鍡欙拷姘洴濮婃椽宕妷銉ゆ埛闂佺绨洪崐妤呭箲閵忕姭妲堥柕蹇曞Х椤撴椽姊虹紒妯哄婵炲吋鐟ч崰濠傤吋閸モ晝锛濇繛杈剧到婢瑰﹤危瑜版帗鐓欓柛娑橈工閳绘洟鏌曢崱鏇狀槮妞ゎ偅绻堥幊婊堝垂椤愶綆浠ч梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�");
			return;
		} 
		
		
		if(length > nameLen){
			sendError(SCreateRoleError.CREATE_OVERLEN);
			logger.error("闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愬弶鐤勯梻浣告啞閹稿棝宕ㄩ婊冨脯闂傚倷绀佸﹢閬嶆惞鎼淬劌绐楁俊銈呮噹绾惧鏌曢崼婵囧闁哥姵鍔欓弻锟犲磼濞戝崬鍔屽┑鐐插悑閻楁粓骞夐幖浣瑰亱闁割偅绻勯悷銊╂⒑閹肩偛濡奸柛濠傜秺婵＄敻宕熼姘辩潉闂佺鏈〃鍡欙拷姘洴濮婃椽宕妷銉ゆ埛闂佺绨洪崐妤呭箲閵忕姭妲堥柕蹇曞Х椤撴椽姊虹紒妯哄婵炲吋鐟ч崰濠傤吋閸モ晝锛濇繛杈剧到婢瑰﹤危瑜版帗鐓欓柛娑橈工閳绘洟鏌曢崱鏇狀槮妞ゎ偅绻堥幊婊堝垂椤愶綆浠ч梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�");
			return;
		}
		else if (length < CCreateRole.NAMELEN_MIN){
			sendError(SCreateRoleError.CREATE_SHORTLEN);
			logger.error("闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愬弶鐤勯梻浣告啞閹稿棝宕ㄩ婊冨脯闂傚倷绀佸﹢閬嶆惞鎼淬劌绐楁俊銈呮噹绾惧鏌曢崼婵囧闁哥姵鍔欓弻锟犲磼濞戝崬鍔屽┑鐐插悑閻楁粓骞夐幖浣瑰亱闁割偅绻勯悷銊╂⒑閹肩偛濡奸柛濠傜秺婵＄敻宕熼姘辩潉闂佺鏈〃鍡欙拷姘洴濮婃椽宕妷銉ゆ埛闂佺绨洪崐妤呭箲閵忕姭妲堥柕蹇曞Х椤撴椽姊虹紒妯哄婵炲吋鐟ч崰濠傤吋閸モ晝锛濇繛杈剧到婢瑰﹤危瑜版帗鐓欓柛娑橈工閳绘洟鏌曢崱鏇狀槮妞ゎ偅绻堥幊婊堝垂椤愶綆浠ч梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�");
			return;
		}
		
		int resultCode = fire.pb.util.CheckName.checkValid(name);
		if(resultCode == CheckName.WORD_ILLEGALITY){
			sendError(SCreateRoleError.CREATE_INVALID);
			logger.error("闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢绘俊鐐�栭悧妤冪矙閹炬眹锟藉懘寮婚妷锔惧弳濠电娀娼уΛ顓炍ｉ崫銉х＜闁跨喍绮欏畷鎺戔槈濡ゅ啰鐣炬俊鐐�栭悧妤冨垝鎼达絾鏆滄繛鎴炴皑绾剧晫锟藉箍鍎遍幊蹇涘窗濮楋拷閺屸�崇暆閿熶粙宕伴弽顓犲祦闁糕剝鍑瑰Σ濠氭⒑閸濆嫭顥″ù婊庡墴閺佹捇鎳為妷顔兼櫛闂侀潻缍嗛崹鍫曠嵁韫囨稒鏅搁柨鐕傛嫹2-7濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨偓鎷锋繝姘ワ拷鍛村矗婢跺瞼顔曢梺绯曞墲钃遍悘蹇庡嵆閺屾盯濡堕崨顖氣叺闂佸搫鐬奸崰鎰焽韫囨稑绀堢憸蹇涘汲閻樻祴鏀介柍钘夋娴滄繈鏌ㄩ弴妯虹伈鐎殿喛顕ч埥澶愬閻樻牓鍔戦弻宥夊传閸曡埖鏁惧銈冨劜閻楁粎妲愰幘瀵哥懝濠电姴鍟鍫曟⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�4-14濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨偓鎷锋繝姘ワ拷鍛村蓟閵夛妇鍙嗗┑鐘绘涧濡瑧绮婇锔界厵鐎瑰嫭婢樺Σ缁樸亜椤愶絿绠炴い銏★耿閹瑩鍩￠崒婊�绨介梻浣筋嚙鐎涒晠顢欓弽顓為棷妞ゆ洩鎷风�规洘绮撻幃銏☆槹鎼淬垺顔曢梻浣稿閸嬪懎煤閺嶃劌鍔旈梻鍌欑窔濞佳囨晬韫囨稑纾兼繝濠傛噹缁犵敻姊婚崒姘拷鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵娴滃爼鎮㈤崱妯诲弿婵°倕顑嗙�氱懓螖閻橀潧浠滈柨鏇ㄤ邯瀵偊骞樼紒妯绘闂佽法鍣﹂幏锟�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁�濠囨煥閻旇袚闁靛洤瀚伴、鏇㈠閳哄倐锕傛⒑瀹曞洨甯涢柟鐟版搐閻ｉ攱绺界粙鍨祮闂佺粯鏌ㄩ崵鏍箯閻戣棄鍨傛い鎰╁�楅鏇㈡⒑閻熼偊鍤熼柛瀣枛楠炲﹪骞囬鐘殿啎闂佸壊鍋嗛崰鎰八夐崼銉︾厸閻忕偠顕ч敓鑺ョ箞楠炲﹪鏁撻悩鍙傃囨煕濞戝崬鏋ら柨鐔绘婢х晫妲愰幘瀛樺闁告挻褰冮崜鏉款渻閵堝繒鐣垫繛浣冲浂鏁嬮柨婵嗩樈閺佸棝鏌涢弴銊ヤ簽妞わ富鍙冮幃宄邦煥閸愵亞顔掑Δ鐘靛仜椤︽娊濡甸幇鏉跨闁圭虎鍨辩�氬ジ姊绘担铏瑰笡闁瑰摜顭堥湁闁绘垼妫勯崙鐘绘煕閹般劍娅冪紒璇叉閵囧嫰骞囬埡浣轰患濡炪倕娴氶崢浠嬨�冮妷鈺傚�烽柛娆忣樈濡箓鎮楃憴鍕闁靛牆鎲℃穱濠囨倻閽樺）銊╂煏婢诡垰鍟扮粔顔尖攽閻樺灚鏆╁┑顔诲嵆瀹曡绺界粙鎸庢К闂佸搫绋侀崢鑲╃矆婢舵劖鐓涚�广儱鍟俊浠嬫煕濞嗗繒绠茬紒缁樼箖缁绘繈宕掑闂寸磻缂傚倷鑳舵慨鐢稿磿閹惰В锟斤妇鎹勯妸锕�纾繛鎾村嚬閸ㄤ即宕滄潏鈺冪＝濞撴艾锕ョ�氬綊姊虹捄銊ユ瀺缂侇喗鐟ラ～蹇撁洪鍛拷濠氭煃鏉炴壆璐版繛鍏煎哺濮婃椽宕ㄦ繝浣虹箒闂佹悶鍔嶆繛濠囧箖妤ｅ啯鏅搁柨鐕傛嫹?");
			return;	
		}else if(resultCode == CheckName.SPECIAL_WORD_TOO_MANY){
			sendError(SCreateRoleError.CREATE_INVALID);
			logger.error("闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽顐杭闁跨喕妫勯崯顖氼嚗閸曨垰绠涢柛鎾茶兌閳笺倕鈹戦悩顔肩伇闁糕晜鐗犲畷婵嬪冀椤撶偟锛涢梺鍐叉惈閹冲繘鎮￠崘顔界厱婵犻潧妫楅鈺呮煛鐎ｅ墎鐣甸柡宀�鍠庨悾锟犲级閹稿巩鈺呮⒑鐎圭姵顥夋い锔诲灦閸┿垺鎯旈埈銉у枛閹筹繝濡堕崱妯兼濠电姷顣槐鏇㈠磻閹达箑纾归柡宥庡幖閸ㄥ倿鏌熼幆鏉啃撻柛濠傛健閺屻劑寮撮鍛伓婵＄偑鍊ら崢鐓幟洪敂鐐床婵犻潧妫鈺傘亜閹烘垵锟芥悂鏁撻悾灞戒槐闁诡喖鍢查…銊╁礋椤撶姷鍘愰梺鍙ョ串缂嶄線寮婚妸鈺傚亞闁稿本绋戦锟�");
			return;
		}else if(resultCode == CheckName.NONE_CHARACTER){
			sendError(SCreateRoleError.CREATE_INVALID);
			logger.error("闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤撶姷鍘梻浣告惈缁嬩線鎮樺☉妯锋闁靛繒濮烽ˇ鏉款渻閵堝棛澧慨妯稿姂閹儳煤椤忓應鎷洪梺鍛婄箓鐎氼厾绮婇銈囩＜閺夊牄鍔嶇粈瀣煙椤斿吋鍋ラ柡浣规尰缁傛帞锟斤綆鍋�閹锋椽姊洪崨濠勨槈闁挎洩绠撻崺锔界瑹閿熶粙寮婚敐澶嬫櫜閹煎瓨绻堥崑妤呮⒑鏉炴壆鍔嶉柟鐟版喘楠炴劖绻濋崘銊х獮閻庣櫢鎷烽柨鐔剁矙椤㈡瑩骞掑Δ浣革拷鐢告偡濞嗗繐顏紒锟介崼婵冩斀闁绘垵娲︾�氬綊鏌ｆ惔銈庢綈婵炴彃绻樺畷婵嬪箣閿旂尨鎷锋担鍓叉建闁跨喍绮欓獮鍐閻樺灚娈濋梺鍝勵槹椤戞瑥螞閹邦兘鏀介柣妯虹仛閺嗏晠鏌涚�ｎ剙浠辩�规洜鍎ょ换婵嬪炊瑜忛鍡涙⒑鐠恒劌娅愰柟鍑ゆ嫹?濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨偓鎷锋繝姘ワ拷鍛村矗婢跺瞼鐦堥梻鍌氱墛娓氭宕曢幇鐗堢厱閹兼番鍨归悘鎾煛瀹�瀣М闁轰焦鍔欏畷銊╊敍濠婂啫蝎闂傚倷鑳堕幊鎾诲床閺屻儱搴婇柡灞诲劚閻撯�愁熆鐠哄彿鍫ュ几鎼搭澀绻嗘い鏍ㄧ箓閸氬綊鏌￠崱顓犵暤婵﹦绮幏鍛喆閸曨偂鍝楅梻浣告啞閺屻劑鏁冮鍕殾婵犻潧顑呯粻锝夋煥閺囶亝瀚圭紓浣哄Х婵烇拷闁哄瞼鍠栭獮鎴﹀箛闂堟稒顔勯柣搴ｆ嚀閹诧紕鎹㈤崘顔嘉﹂柛鏇ㄥ灠缁犲鎮归搹瑙勭＊闁挎繂顦伴悡娆撴煠婵傚壊鏉洪柛銈嗙懇閺屽秶鎲撮崟顐や紝濡炪們鍨哄畝绋跨暦閸楃倣鐔哥瑹椤栨瑧澶�?");
			return;
		}
		

		if(null != u){
			int roleNum = 0;
			for (Long rid : u.getIdlist()) {
				xbean.Properties prop = xtable.Properties.select(rid);
				if (prop.getDeletetime()==0)
					roleNum++;
			}
			if(roleNum >= PCreateRole.maxCreateRoleNum){
				logger.error("-----------------------闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敂钘変汗闂佸憡鐟ラˇ浼村箖濞嗘垹纾藉〒姘攻鐎氬綊姊虹化鏇炲⒉妞ゎ厼娲ㄧ划缁樸偅閸愨晝鍘甸柣搴ｆ暩椤牓宕滈柆宥嗙厽闁圭儤姊瑰▍鏇犵磼鏉堛劌娴鐐差槺閿熸枻缍嗘禍璺好洪銏♀拺閻犳亽鍔岄弸搴ㄦ煥閻旂儤娅曢柛锝冨劚椤洭骞囬悧鍫㈠幗闂佹枼鏅涢崯顖滅矆閸緷鐟邦煥閸滀胶鍔搁梺瀹狀嚙闁帮綁鐛�ｎ亖鏀介柛鈩冪懁閸犲﹪姊婚崒娆戝妽闁哄銈稿鎻掆槈閵忕姷鏌堝銈嗙墬缁海绮堟繝鍥ㄧ厱闁靛鍠栨晶顖炴煟閹惧鎳勯柕鍥у瀵�燁槼妞ゃ儲绮撻弻娑㈡偄鐠哄搫绁悗瑙勬磸閸ㄤ粙鐛幒鎳虫梹鎷呴崣澶婎伖闂傚倷鑳剁划顖炴嚌妤ｅ啯鍋ら柕濞у秵瀚规慨妯煎亾鐎氾拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿顦甸弻鏇＄疀鐎ｎ亷鎷烽弴鐘电焼閻庯綆鍋佹禍婊堟煙閸濆嫮肖閻犳劒鍗抽弻娑㈡偆閸屾稑顏�");
				sendError(SCreateRoleError.CREATE_OVERCOUNT);
				return;
			}
		}
		
		
		
		final PCreateRole proc = new PCreateRole(this, userID, config.initequip);
		proc.submit();	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786435;

	public int getType() {
		return 786435;
	}

	public final static int NAMELEN_MAX = 14; // 名字的最大长度
	public final static int NAMELEN_MIN = 4; // 名字的最短长度

	public java.lang.String name; // 名称
	public int school; // 职业
	public int shape; // 角色id
	public java.lang.String code; // 招募码

	public CCreateRole() {
		name = "";
		code = "";
	}

	public CCreateRole(java.lang.String _name_, int _school_, int _shape_, java.lang.String _code_) {
		this.name = _name_;
		this.school = _school_;
		this.shape = _shape_;
		this.code = _code_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(name, "UTF-16LE");
		_os_.marshal(school);
		_os_.marshal(shape);
		_os_.marshal(code, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		name = _os_.unmarshal_String("UTF-16LE");
		school = _os_.unmarshal_int();
		shape = _os_.unmarshal_int();
		code = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CCreateRole) {
			CCreateRole _o_ = (CCreateRole)_o1_;
			if (!name.equals(_o_.name)) return false;
			if (school != _o_.school) return false;
			if (shape != _o_.shape) return false;
			if (!code.equals(_o_.code)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += name.hashCode();
		_h_ += school;
		_h_ += shape;
		_h_ += code.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(name.length()).append(",");
		_sb_.append(school).append(",");
		_sb_.append(shape).append(",");
		_sb_.append("T").append(code.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

