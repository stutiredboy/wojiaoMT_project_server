
package gnet;
import java.lang.management.ManagementFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import fire.pb.main.ConfigManager;
import fire.pb.main.Gs;
import fire.pb.mysql.C3P0Util;
import fire.pb.util.FireProp;







import com.locojoy.base.Runnable;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __ServerIDResponse__ extends mkio.Protocol { }

/** gs连上deliver上，发给gs；用户登录完成后，发给客户端
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class ServerIDResponse extends __ServerIDResponse__ {
	
	private void testMysqlConnect() {
		Connection conn = C3P0Util.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            if (stmt.execute("SELECT count(*) FROM role_relation")){
            	rs = stmt.getResultSet();
            }
            if (rs != null){
            	while(rs.next()) {
            		fire.log.Module.logger.info("mysql connect role_relation table,count(*):" + rs.getString("count(*)"));
            	}
            }
        } catch (SQLException ex1) {
        	fire.log.Module.logger.error("SQL闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撻柣銏㈩焾绾惧鏌ㄩ悢鍝勑ｉ柣鎾寸懇閺岀喖顢涘鍐炬毉濡炪們鍎遍ˇ浼淬�冮妷鈺傚�锋い蹇撳娴煎牓姊洪崫鍕缂佸鎳撻悾鐑筋敃閿曪拷缁�瀣亜閹伴潧澧悗姘贡閹叉悂鎮ч崼婵堢懆缂備胶瀚忛崶銊у幍闂傚倸鍊搁顓㈠礉瀹ュ鐓冮梺鍨儏缁楁帡妫佹径鎰叆婵犻潧妫欓崳娲煕閻斿搫浠遍柡宀�鍠栭、娑橆潩閸楃偐鍙洪梻浣告惈閻寰婇崐鐔轰簷闂備浇娉曢崰鏇炍涢崟顔句罕婵犵數濞�濞佳囨晝閵夆敡澶愬Χ婢跺鎷婚梺绋挎湰閼归箖鏁撻懞銉﹀�愰柟顔ㄥ嫮绡�闁搞儜鍜佹Н婵犳鍠楅敃鈺呭礂濡綍锝夊醇閵夛妇鍘棅顐㈡搐椤參骞忛悜鑺ユ優妞ゆ劑鍊栧鎾剁磽閸屾艾锟界兘鎳楅崼鏇炵；闁圭偓鍓氶悢鍡樻叏濡ゅ瀚归柦妯荤箞濮婃椽顢楅敓鐣岀矓閻㈢纾挎俊銈勬缁诲棝鏌曢崼婵堢閻庢艾缍婂铏癸拷鍦濞兼劙鏌涢妸銉﹀仴闁靛棔绀侀埢搴ㄥ箣閻樼儵鏀洪梺璇插嚱缂嶅棝宕戦崱娑樻辈闁靛鏅滈埛鎺懨归敐鍫燁仩閻㈩垱绋掗妵鍕Ω閵夛箑娅ч梺鐟扮畭閸ㄤ粙鐛幒妤�绠婚柛鎾茬妤犲嫰姊绘担鍛婃儓婵炲眰鍨藉畷鐟懊洪鍕煣闂佸綊妫块悞锕傛偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷");
        	ex1.printStackTrace();
        } finally {
        	if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore
                rs = null;
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore
                stmt = null;
            }
        }  
        C3P0Util.close(conn,null,null);
	}
	
	@Override
	protected void process() {
		fire.pb.main.Gs.platType = plattype;
		try {
			String serverId = serverid.getString("ISO-8859-1");
			//
			if (fire.pb.PropConf.ServerId.ServerId != 0) {
				Integer id = Integer.parseInt(serverId);
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囨煕閵夈垺娅囬柛姗嗗灦濮婄粯鎷呴崨濠傛殘濠电偠顕滅粻鎾崇暦閵忋倖瀵犲璺烘湰濞堥箖姊洪崨濠勬噧妞わ箒浜褔鏁撴禒瀣拻闁稿本姘ㄦ晶娑樸�掑顓ф疁鐎规洘娲熼獮鍥偋閸垹骞堥梺璇插嚱缂嶅棝宕愰弽顓炵闁绘劗顣介弨铏節閻㈤潧孝婵炲眰鍊楃划璇差潩鏉堛劌鏋戞繝銏ｅ煐閸旀牠寮查幖浣圭厾闁诡厽甯掗崝姘憋拷瑙勬尭閺�锟�.pb.PropConf.ServerId.ServerId
				if (fire.pb.PropConf.ServerId.ServerId != id) {
					fire.log.Module.logger.error("fire.pb.PropConf.ServerId.ServerId:" + fire.pb.PropConf.ServerId.ServerId
							+ " != ServerIDResponse.serverId:" + id);
					ManagementFactory.getPlatformMBeanServer().setAttribute(
							new javax.management.ObjectName("bean:name=stopper"),
							new javax.management.Attribute("StopTime", 0));
				}
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囨煕閵夈垺娅囬柛姗嗗灦濮婄粯鎷呴崨濠傛殘濠电偠顕滅粻鎾崇暦閵忋倖瀵犲璺烘湰濞堥箖姊洪崨濠勬噧妞わ箒浜褔鏁撴禒瀣拻闁稿本姘ㄦ晶娑樸�掑顓ф疁鐎规洘娲熼獮鍥偋閸垹骞堥梺璇插嚱缂嶅棝宕愰弽顓炵闁绘劗顣介弨铏節閻㈤潧孝婵炲眰鍊楃划璇差潩鏉堛劌鏋戞繝銏ｅ煐閸旀牠寮查幖浣圭厾闁诡厽甯掗崝姘憋拷瑙勬尭閺�锟�.pb.main.Gs.serverid
				if (fire.pb.main.Gs.serverid.equals(serverId) == false) {
					fire.log.Module.logger.error("fire.pb.main.Gs.serverid:" + fire.pb.main.Gs.serverid
							+ " != ServerIDResponse.serverId:" + serverId);
					ManagementFactory.getPlatformMBeanServer().setAttribute(
							new javax.management.ObjectName("bean:name=stopper"),
							new javax.management.Attribute("StopTime", 0));
				}
			} else {
				fire.pb.main.Gs.serverid = serverId;
			}
			fire.log.Module.logger.info("plattype:"+plattype+",serverid:"+fire.pb.main.Gs.serverid);
			if(ConfigManager.getUseMysql()){
				fire.log.Module.logger.info("Default Config JdbcUrl:" + C3P0Util.getCPDS().getJdbcUrl());
				if(C3P0Util.MYSQLDBNAME != null && !C3P0Util.MYSQLDBNAME.isEmpty() && C3P0Util.MYSQLDBNAME != "") {
					C3P0Util.getCPDS().setJdbcUrl("jdbc:mysql://" + C3P0Util.MYSQLIP + ":" + C3P0Util.MYSQLPORT + "/" + C3P0Util.MYSQLDBNAME + "?&useUnicode=true&characterEncoding=utf-8");
				} else
					C3P0Util.getCPDS().setJdbcUrl("jdbc:mysql://" + C3P0Util.MYSQLIP + ":" + C3P0Util.MYSQLPORT + "/mt3_" + "weibo" + "_" + fire.pb.main.Gs.serverid + "?&useUnicode=true&characterEncoding=utf-8");
				C3P0Util.getCPDS().setUser(C3P0Util.MYSQLUSER);
				C3P0Util.getCPDS().setPassword(C3P0Util.MYSQLPASS);
				C3P0Util.getCPDS().setMaxIdleTime(1800);
				C3P0Util.getCPDS().setPreferredTestQuery("SELECT 1");
				C3P0Util.getCPDS().setIdleConnectionTestPeriod(30000);
				C3P0Util.getCPDS().setTestConnectionOnCheckout(true);
				C3P0Util.getCPDS().setAcquireRetryAttempts(3);
				C3P0Util.getCPDS().setCheckoutTimeout(3000);
				C3P0Util.getCPDS().setInitialPoolSize(10);
				C3P0Util.getCPDS().setMaxPoolSize(20);//100?
				C3P0Util.getCPDS().setMinPoolSize(10);
				C3P0Util.getCPDS().setMaxStatements(200);
				fire.log.Module.logger.info("Real Connect JdbcUrl:" + C3P0Util.getCPDS().getJdbcUrl());
				
				Gs.getExecService().execute(new Runnable() {
					@Override
					public void run() {
						testMysqlConnect();
					}
				});	
				 // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎处缁绘繂顕ラ柨瀣凡闁跨喕濮ゅú鐔风暦椤栨稑顕遍悗娑櫭崜鐟扳攽閻愬弶顥為柟绋款煼閹�斥枎閹炬潙锟界敻鏌ｉ姀鈽嗗晱闁绘帡绠栧畷顖炲传閵壯咃紲闂佽鍨庨崘顏嗏棨缂傚倷绶￠崰妤呮偡閳轰緡鍤曞┑鐘崇閸嬪嫰鏌ｉ幘铏崳妞ゆ柨顦靛楦裤亹閹烘垳鍠婇梺鍛婃尰閻╊垰鐣烽姀銈庢晝闁挎梻鏅崢浠嬫煙閸忚偐鏆橀柛銊ヮ煼閵嗗倿宕ｆ径瀣伎濠碘槅鍨抽…鍫熶繆閹稿簼绻嗛柛娆忣槸婵秵顨ラ悙鎼劷闁归濞�瀵濡烽妷锔芥瘑闂傚倸鍊风欢姘焽瑜忛幑銏ゅ箳閹炬潙寮块悗鐧告嫹闁告洦鍊犻妸鈺傜厓闁告繂瀚敓钘夘煼瀹曘垺绂掔�ｎ偀鎷虹紓鍌欑劍钃遍柣鎾卞劦閺岀喖鎳為妷褏鐓傜紓渚囧枦椤曆囷綖濠婂牊鏅稿ù鐘差儏閽冪喖鏌曟繛鐐珕闁稿瀚伴弻锝夊箣閻愬棙鍨块幃鐢割敂閸啿鎷洪柡澶屽仦婢瑰棝藝閿曞倹鐓欓悹鍥囧懐鐦堥悗娈垮枦鐏忔瑩骞戦崟顒佸闁哄洨鍠愰ˉ鍫拷瑙勬磸閸旀垿銆侀弴銏╂晢濞达絽澹婃导鎾绘⒒娴ｅ憡鍟為柛鏃撶畵瀹曚即寮借閸熷懏绻濋棃娑卞剱闁绘挻绋戦…璺ㄦ崉娓氼垰鍓板┑鐐茬墦缁犳牠寮婚妸鈺佸嵆闁绘劘顕滈幏鐤亹閹烘挸浜楅梺鍝勬储閸ㄦ椽鎮¤箛鎿冪唵閻犻缚娅ｆ晶鏇㈡煟韫囷絼绨肩紒缁樼洴瀹曘劑顢橀悤浣癸紗闂備礁鎼惌澶屾崲濠靛棛鏆﹂柛妤冨�ｉ悢鍏煎殐闁冲搫鍟敮銊╂⒒閸屾瑧顦﹂柟纰卞亰瀵敻顢楅崟顒�鍓銈嗙墱閸嬫垿鏁撻幋鎺旂獢鐎殿喗鎸虫慨锟介柍銉ュ帠缁ㄨ崵绱撻崒娆戭槮妞ゆ垵妫涢敓鐣岀懗閸ャ劌浠ф繛瀵稿帶閻°劑鍩涢幒鎳ㄥ綊鏁愰崼婢捇鏌曢崱妤�鏆熺紒杈ㄥ浮閺佹捇鎳為妷锕�顎撻梺缁樿壘閻°劎锟芥俺顫夐幈銊ヮ潨閸℃绠虹紓浣芥硾瀵爼濡甸崟顖ｆ晝闁靛繈鍨婚澶岀磽娴ｈ櫣甯涚紒璇插�块敐鐐测攽鐎ｅ灚鏅㈤梺绋跨焿婵″洦鎯旀繝鍌楁斀闁绘ɑ鍓氶崯蹇涙煕閻樻剚娈滈柍銉畵瀹曞ジ鎮㈢紙鐘电煉闂備礁缍婂Λ璺ㄧ矆娴ｈ櫣涓嶉柣鏂跨殱閺�浠嬫煕鐏炲墽顣查柛鐔哄仱閺屽秹鏌ㄧ�ｎ亞浼岄梺鍝勬湰缁嬫垿鍩為幋锕�骞㈡俊銈咃梗閻ヮ亝淇婇悙顏勶拷鎴﹀磿閾忣偆绠鹃柨鐔剁矙閺岋紕浠﹂崜褎鍒涢梺璇″枓閺呮盯鎮鹃悜钘夌倞鐟滃骞忔导瀛樷拻濞达綀娅ｇ敮娑樸�掑顓ф疁鐎规洘濞婇弫鎰緞婵犲啰锟筋剟姊洪悷鏉库挃缂侇噮鍨跺鏌ュ箹娴ｅ湱鍙嗛梺缁樻礀閸婂湱锟芥熬鎷�?
				fire.pb.friends.Module Module = new fire.pb.friends.Module();
		      Module.createXsh(Long.MAX_VALUE);
			}
		  
					
			Properties prop = ConfigManager.getInstance().getPropConf("sys");
			fire.pb.main.Gs.isYingyongbao = Integer.valueOf(FireProp.getStringValue(prop, "sys.plat.isYingyongbao")).intValue() == 1 ? true : false;
			fire.log.Module.logger.info("Gs.isYingyongbao=" + fire.pb.main.Gs.isYingyongbao);
		} catch (Exception e) {
			e.printStackTrace();
			fire.log.Module.logger.error("Mysql闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繝闈涱儐椤ュ牊绻涢幋婵嗚埞闁告挻澹嗙槐鎺楁倷椤掞拷閸斻倖銇勯鐘插幋鐎殿喖顭烽弫鎰緞婵犲嫮鏉告俊鐐�栫敮鎺楀磹妞嬪骸鍨濋柣銏犳啞閳锋垿鏌涘┑鍡楊仾妞ゃ儳鍋熺槐鎺楊敊閼恒儱纾抽悗娈垮枛椤兘骞冮姀銈嗘優闁革富鍙忕槐鏌ユ⒒娓氾拷濞佳呮崲閹烘挻鍙忛柣銏犳啞閸婂爼鏌涢鐘插姕闁绘挾鍠栭獮鏍庨锟介悘鍗烆熆鐟欏媶鎴﹀Φ閸曨垱鏅滈悹鍥皺娴犳悂姊洪悙钘夊姷缂佺姵鎸搁悾椋庣矙鐠囩偓姊归幏鍛村川婵犲嫭婢撻梻鍌氬�搁崐鎼佸磹閹间焦鍋嬪┑鐘插閻瑩鏌熸潏鎹愵吅缂傚秵鐗滈敓钘夌畭閸庨亶藝娴兼潙鐓曢柟杈鹃檮閻撴瑧绱掔�ｎ偄顕滈柟鐧哥秮閺屽秹宕ｉ妷褏鐛㈤梺鍝勭焿缁插�熺亙婵炶揪绲藉﹢閬嵥囬锟藉铏规嫚閼碱剛顔囧銈嗗灥椤︻垶锝炶箛娑欐優闁革富鍘鹃敍婊冣攽椤旂瓔娈旀俊顐ｇ懇閹箖宕奸弴鐔叉嫼缂傚倷鐒﹂敃鈺佲枔濮楋拷閺屾稓锟斤絻鍔岄敓鑺ユ礋閹儳鐣￠幏鏃�妫冨畷顏呮媴鐟欏嫭鐝滈梻鍌欒兌椤牓寮甸鍌氬灊閹兼番鍔嶉弲顒佺節婵犲倻澧涢柣鎾寸☉椤法鎹勯悮鏉戝婵犫拃鍕伌闁哄本鐩顒傛崉閵娧傜礃缂傚倷绶￠崳顕�宕ｉ敓鑺ャ亜閿曪拷缂嶅﹪寮婚垾宕囨殕闁跨喍绮欏畷浼村箛閸忣偄娲幃褔宕奸悢宄板Τ闂備礁鐤囨ご鍝ユ暜椤忓棗绶ゅΔ锝呭暙妗呴梺鍛婃处閸ㄩ亶寮插鍫熺厵妞ゆ牕妫楅張顒�袙婢舵劖鈷掑ù锝囩摂閸ゅ啴鏌涢妸鈺�鎲剧�殿喖顭锋俊鎼佸煛鐎ｎ剛鈼ゆ繝鐢靛Т閿曘倝鎮ч崱娑欑厑闁搞儺鍓氶悡鐔兼煛閸屾侗鍎ユ繛鍫㈠Т闇夐柛蹇撳悑鐏忔壆绱掔紒妯肩畼闁哥姴锕よ灒婵炶尙绮紞澶愭⒒娴ｈ鍋犻柛鏂跨У缁绘稒绻濋崘褏绠氶柣搴ｆ暬濞煎骞忛悜鑺ユ櫜閹肩补鍓濋悘鍫㈢磽娴ｅ搫顎岄柛銊ゅ嵆閳ユ棃宕橀搴㈠闁挎繂绨肩花缁樸亜閹哄鐏查柡灞剧洴閹晠宕ｆ径妯伙紗闂備礁鎼張顒勬儎椤栨凹鍤曢柟缁㈠枛鎯熼梺闈涱槶閸婃鎯勬惔銊︹拻濞达絽鎲＄拹锟犳煛閸滀礁浜扮�殿噮鍋嗛幏鐘差啅椤旂晫绋佹繝鐢靛仜濡﹥绂嶅鍐惧晠婵犻潧妫岄弨浠嬫煟閹邦厽鍎楁繛鍫熸礈缁辨帡顢欓懞銉ョ闂佷紮绲块崗姗�鐛崶顒夋晞闁冲搫鍊归ˉ鍫拷瑙勬礃閿曘垽宕洪埄鍐瘈闁告劦浜為埣銉╂⒒閸屾艾锟介绮堟笟锟介獮鏍敃閿曪拷閻ゎ喗銇勯幇鍫曟闁稿顑嗙换婵囩節閸屾粌顣洪梺鍝勵儎缁�渚�鍩為幋锔藉亹闁告瑥顦ˇ鈺呮⒑缂佹ɑ灏靛┑鐑囨嫹闂佽鍠栭崲鏌ュ煝鎼淬倗鐤�闁瑰灝鍟╅惀顏嗙磽閸屾瑦绁伴柛鈺傜墵閹繝鏁撻悩鑼舵憰闂佹寧绻傞幊澶愬绩娴犲鐓欓梺顓ㄧ畱婢ф澘霉閻橆偅娅婃慨濠呮閿熻棄婀辨刊顓烆焽閹扮増鐓曢柕濞垮劜閸嬨儳锟借娲樺鑺ヤ繆閻戣棄鐓涘ù锝呮憸閻涒晜淇婇悙顏勶拷鏍ь潖婵犳艾鐓曢柛顐ゅ枎椤曢亶鏌ㄩ悤鍌涘?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囨煕閳╁啨浠︾紒顔瑰墲娣囧﹪鎮欓鍕舵嫹閺嶎厼绀夌憸蹇曞垝婵犳艾绠ｉ柣妯烘▕濡粓鏌ｉ悩杈劅闁绘挸顦甸獮蹇旑槹鎼淬垹鏋傞梺鍛婃处閸撴盯藝閵夈儮鏀介柣鎰皺濠�鎾煕閺傛寧鎹ｉ柛鎺撳浮瀹曞ジ鎮㈤搹鍦闂備胶顭堢悮顐﹀磹濡ゅ懎鑸归柣銏犳啞閻撶喖鏌ｅΟ鍨惞缂佽京澧楃换娑㈠椽閸愵亞袦闂佽鍠楄摫婵炵厧绻橀崺锟犲礃閳哄纭�闂傚倷娴囬鏍垂鎼淬劌绀冮柍杞扮筏閹风兘顢涘鍛紳婵炶揪缍�濞咃絿鏁☉姘辩＜閻犲洦褰冮弳鐔兼煙楠炲灝鐏╅柍瑙勫灩閿熸枻缍嗘禍鐐核囬妸鈺傗拺闂傚牊渚楅悞楣冩煕鎼粹剝鎯堟い顓炴喘瀵挳鎮╅悽纰夌闯濠电偠鎻徊浠嬪箹椤愶絿顩插Δ锝呭暞閻撴洟骞栧ǎ顒�鐏╅柍缁樻礀閳规垿鍨惧畷鍥х厽濡ょ姷鍋為悧妤呭箯閸涙潙浼犻柕澹嫭鐦掓繝鐢靛Х椤ｈ棄危閸涙潙鍨傞梻鍫熺▓閺嬫牠鏌￠崶銉ョ仾闁稿浜弻銊╂偄閸撲胶鐓撳┑顔硷攻濡炶棄鐣烽悜绛嬫晣闁绘劖婢橀ˉ姘舵⒒娴ｇ瓔鍤冮柛銊ゅ嵆閹崇喖顢涘┑鍫滅綍闂傚倷鑳剁划顖炲礉濡ゅ懎纾块柕鍫濐槸閻撴洟鏌熸潏楣冩闁绘挻娲樼换娑㈠箣閻戝洣绶甸梺缁樻惄閸撴瑩婀侀梺绋跨箰閸氬绮堢�ｎ喗鐓涢悘鐐插⒔濞叉潙鈹戦敍鍕幋闁轰焦鍔欏畷銊╊敇閸ャ儱濮傛慨濠冩そ瀹曠兘顢橀悢鍝勫Ы婵＄偑鍊栧▔锕傚炊閿濆繑瀚归柡鍐ㄧ墕缁�鍐┿亜閺傛寧顫嶇憸鏃堝蓟濞戙垹鐒洪柛蹇曞娴滎亜顕ｉ崘鍙傛棃宕ㄩ瑙勫闂備礁鎲＄缓鍧楀磿鏉堛劎澧￠梻鍌欑閹测�愁潖瑜版帇锟藉啴宕奸妷銉ь槴闂佸湱鍎ゅ鍦拷姘缁绘盯寮堕幋顓炲壉濡炪値鍋勭粔鐟邦潖濞差亝顥堟繛鎴欏灮瀹曨亞绱撴担浠嬪摵婵炶尙鍠庨悾鐑藉閵堝棛鍔堕悗骞垮劚濡矂骞忓ú顏呪拺闁告稑锕︾粻鎾绘倵濮樼厧澧撮柡浣规崌瀹曟劙鎮㈠畡鐗堝劒濠电偛鐡ㄧ划宥夊箖閸屾稐绻嗛柟闂寸閻撴稑霉閿濆嫯顒熼柛鐐垫暬濮婄粯鎷呴搹鐟扮闂佹悶鍔岄崥瀣箞閵娾晛围濠㈣泛锕﹂悾楣冩⒑缂佹ê濮堥柣锝庝簼缁傚秴顭ㄩ崼鐔哄幍闂侀�涚祷濞呮洖鈻嶉崨瀛樼叆闁绘棁顕ц濠电偛寮剁划搴∥ｉ幇鐗堝�烽柣鎴炆戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹.");
        	try{
        		ManagementFactory.getPlatformMBeanServer().setAttribute(new javax.management.ObjectName("bean:name=stopper"),
					new javax.management.Attribute("StopTime", 1));
        	} catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 8902;

	public int getType() {
		return 8902;
	}

	public int plattype; // 当前服务器组，登录的是那个平台
	public com.locojoy.base.Octets serverid; // 当前服务器组的标识

	public ServerIDResponse() {
		serverid = new com.locojoy.base.Octets();
	}

	public ServerIDResponse(int _plattype_, com.locojoy.base.Octets _serverid_) {
		this.plattype = _plattype_;
		this.serverid = _serverid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(plattype);
		_os_.marshal(serverid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		plattype = _os_.unmarshal_int();
		serverid = _os_.unmarshal_Octets();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof ServerIDResponse) {
			ServerIDResponse _o_ = (ServerIDResponse)_o1_;
			if (plattype != _o_.plattype) return false;
			if (!serverid.equals(_o_.serverid)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += plattype;
		_h_ += serverid.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(plattype).append(",");
		_sb_.append("B").append(serverid.size()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

