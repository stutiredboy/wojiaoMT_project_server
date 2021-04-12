
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
        	fire.log.Module.logger.error("SQL闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡╂Ч濞存嚎鍊濋弻銈夊级閹稿骸浠村┑顔硷攻濡炰粙銆佸Δ鍛櫢闁伙絽鐬奸惌鎾绘煟閵忋埄鐒剧痪鎯ь煼閺屻劑鎮㈤崫鍕戯綁鏌ｉ幘瀵告噰闁哄瞼鍠栭、娑橆煥閸愮偓姣夋俊鐐�戦崕閬嵥囨导娣拷鍐Ψ閳哄倸锟介攱銇勮箛鎾愁伀濞寸厧鐗撳娲传閸曨喖顏紓浣割槺閹虫捇鎮鹃悜绛嬫晝闁挎洩鎷风紒锟界�ｎ偁浜滈柟浼存涧婢ь垶鎮楀顒佽础闁瑰弶鎮傞幃褔宕煎┑鍫㈡噯缂傚倷鑳剁�氬繘宕堕妸褍骞嶉梻鍌氬�搁崐鎼侇敋椤撱垹绀夌�广儱顦伴悡鍐⒑閸噮鍎忕紒妤佸浮濡焦寰勯幇顓犲弳濠电娀娼уΛ娆撳闯濞差亝鐓曢柣鏂挎惈娴犻亶鏌″畝锟介崰鏍�佸☉姗嗘僵闁告鍋愰崣娲⒒娴ｅ憡鎯堥柣顓烆槺瀵板﹪宕愰悢杞扮胺闂傚倷娴囧▔鏇㈠窗閺囩倣娑㈠礋椤斿彞缃曞┑鐘垫暩婵烇拷婵炰匠鍥ㄦ櫇闁靛鏁℃径鎰у璺侯儌閹峰姊虹粙鎸庢拱闁煎綊绠栭弫鎾绘嚍閵夛箑锟芥劙鏌熼銊ュ缁★拷闂佹悶鍎滈崪浣剐濆┑鐘愁問閸犳鏁冮埡鍛婵☆垯缍嶉敐澶婇唶闁靛濡囬崢顏堟椤愩垺鎼愭い顓у弮楠炲繘鎮滈懞銉﹀劒濡炪倖鍔戦崐鏍ь熆閹惧墎纾介柛灞捐壘閿熺晫鍏橀幊妤呭醇閺囩偟锛涢梺鍦亾閸撴岸鎮㈤崱妯诲弿婵°倕顑嗙�氬綊鏌﹀Ο鑽ょ疄婵﹥妞介、妤呮晸閻ｅ瞼鐭撻柣銏㈩焾绾炬寧淇婇妶鍕樂缂佽妫濋弻鏇㈠醇濠靛牏顔夐柣搴㈣壘缂嶅﹤顫忛搹鐧告嫹閸︻厼顎屾繛鍏煎姍閺屾盯濡搁妷锕�浠撮梺闈涙缁�渚�鍩㈡惔銊ョ闁绘鍎甸弨娲⒑鐠囨彃鍤辩紓宥呮瀹曟垿宕卞☉妯昏緢闂侀潧顦弲婊堝煕閹烘嚚褰掓晲閸噥浠╅柣銏╁灡缁嬫帡濡甸崟顖毼╅柕澶涚畱濞呇囨⒑閻熸壆鐣柛銊ょ矙閻涱噣骞掑Δ锟界粻濠氭煕閹捐尙顦﹀Δ鐘插濮婄粯鎷呴崨濠冨創濠电偛鐪伴崹钘夌暦閻熸噴娲敂閸曨厽鐓ｉ梻浣哥秺濡潡鎮為敃鍌涘亗闁靛鏅滈悡鐔兼煛閸モ晛浠滈柨鐔绘濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹");
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
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閻樻爠鍥ㄧ厱闁靛鍨哄▍鍥煕濮楀棗鐏︽慨濠勭帛閹峰懘宕ㄦ繝鍌涙畼婵犵數鍋犻婊呯不閹惧磭鏆﹂柕蹇嬪�栫�电姴顭跨捄鐑樻拱婵炲牓绠栧娲川婵犲嫭鍣у銈忕畳娴滎剙顕ｈ閺佹挻绂掔�ｎ偀鎷婚梺绋挎湰濮樸劍鏅跺☉妯革拷鎺戭潩椤撗勭杹閻庤娲樺ú鐔肩嵁閸ヮ剚鍋嬮柛顐犲灩楠炲牓姊虹拠鎻掑毐缂傚秴妫濆畷鎰板冀椤撶偟顓洪梺缁樺姉椤ｄ粙寮ㄩ搹顐ょ瘈闁汇垽娼у瓭濠电偛鐪伴崐妤冨垝鐠囧樊娼╅弶鍫涘妼閺嬫垶绻濋姀锝呯厫闁告梹鐗犲鏌ュ箹娴ｅ湱鍘鹃梺璇″幗鐢帡宕濆鎲嬫嫹鐟欏嫭灏柡锟介敓锟�.pb.PropConf.ServerId.ServerId
				if (fire.pb.PropConf.ServerId.ServerId != id) {
					fire.log.Module.logger.error("fire.pb.PropConf.ServerId.ServerId:" + fire.pb.PropConf.ServerId.ServerId
							+ " != ServerIDResponse.serverId:" + id);
					ManagementFactory.getPlatformMBeanServer().setAttribute(
							new javax.management.ObjectName("bean:name=stopper"),
							new javax.management.Attribute("StopTime", 0));
				}
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閻樻爠鍥ㄧ厱闁靛鍨哄▍鍥煕濮楀棗鐏︽慨濠勭帛閹峰懘宕ㄦ繝鍌涙畼婵犵數鍋犻婊呯不閹惧磭鏆﹂柕蹇嬪�栫�电姴顭跨捄鐑樻拱婵炲牓绠栧娲川婵犲嫭鍣у銈忕畳娴滎剙顕ｈ閺佹挻绂掔�ｎ偀鎷婚梺绋挎湰濮樸劍鏅跺☉妯革拷鎺戭潩椤撗勭杹閻庤娲樺ú鐔肩嵁閸ヮ剚鍋嬮柛顐犲灩楠炲牓姊虹拠鎻掑毐缂傚秴妫濆畷鎰板冀椤撶偟顓洪梺缁樺姉椤ｄ粙寮ㄩ搹顐ょ瘈闁汇垽娼у瓭濠电偛鐪伴崐妤冨垝鐠囧樊娼╅弶鍫涘妼閺嬫垶绻濋姀锝呯厫闁告梹鐗犲鏌ュ箹娴ｅ湱鍘鹃梺璇″幗鐢帡宕濆鎲嬫嫹鐟欏嫭灏柡锟介敓锟�.pb.main.Gs.serverid
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
				 // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡缂佺粯绻傞銉╂煥鐎ｎ偆鍑￠梺璺ㄥ枙婵倕煤閻旈鏆︽い鏍ㄧ☉椤曢亶鎮楀☉娅亪宕滈悷鎵虫斀闁绘劕寮堕ˉ鐐烘煙缁嬫鐓奸柟顔癸拷鏂ユ瀻闁圭偓娼欓敓鐣屾暬閺岋綁濮�閳藉棗鏅遍梺缁樺浮缁犳牕鐣烽鐐蹭紶闁靛／鍜冪床闂備浇顕栭崹搴ㄥ礃椤忓棌妫ㄧ紓鍌氬�风欢锟犲窗濡ゅ懏鍋￠柍杞扮贰閸ゆ洖鈹戦悩宕囶暡闁稿瀚伴弻锝夊箻閾忣偅宕冲銈嗘煥椤﹂潧顫忔ウ瑁や汗闁圭儤鍨抽崰濠囨⒑閸涘﹥灏伴柣鈺婂灠閻ｇ兘濮�閵堝孩鏅濋梺鎸庢⒒閺咁偊宕㈡禒瀣厵闁稿繗鍋愰弳姗�鏌涢妸銉吋闁靛棗鍊垮畷锝嗗緞鐎ｎ亜浼庢繝纰樻閸ㄦ娊鈥﹂崼鐔剁箚闁圭绨肩换鍡涙煕濞嗗浚妲稿┑顔肩У椤ㄣ儵鎮欓幖顓犲姺闂佸綊顥撴繛锟界�殿喖顭锋俊鐑藉Ψ閿旇姤鐦戦梻鍌氬�搁崐椋庢濮橆剦鐒界憸蹇涘箲閵忋倕绠抽柟鐐綑瀵潡鎮楅惂鍛婂闂佸憡娲﹂崐鐘诲Ω閳哄倻鍘撻梺鍛婄箓鐎氼剟鏁撻挊澶樼吋鐎规洏鍨虹粋鎺旓拷锝庡亐閹疯櫣绱撻崒娆戝妽閽冮亶鏌ｉ幘鍗炲姦闁哄瞼鍠栭幊鐐哄Ψ瑜忛悡鍌滅磽娓氬洤鏋︽い鏇嗗浄缍栨繝濠傜墛閺呯霉閻樺樊鍎忛柦鍐枛閺屾洘绻涢悙顒佺彆闂佺顑呯�氫即寮婚敐澶婄闁绘劕妫欓崹鍧楀箖閻㈠壊鏁傞柛顐ゅ暱閹锋椽鏌℃径灞戒沪濠㈢懓妫濊棟闁挎洖鍊归悡娆撴偣閸ュ洤鎳愰惁鍫ユ倵濞堝灝鏋﹂悘蹇旂懇楠炴垿宕熼浣割�撻梺鍝勬川閸犳劙藟閸澁鎷风憴鍕８闁告梹鍨块妴渚�寮撮姀鈺傛櫌婵炶揪绲芥竟濠冨閹剧粯鈷掑ù锝呮啞閸熺偤鏌涢弮鎾剁暤鐎规洑鍗冲鍊燁檨闁哥喎鎳忕换婵嬫濞戝崬鍓遍梺缁樻尰缁嬫垿鈥︾捄銊﹀磯濞撴凹鍨伴崜鏉库攽閻愯尙澧︾紒鐘崇墵瀵濡搁埡浣稿祮闂佺粯鍔橀婊堝箯閻ゎ垬浜归柟鐑樻尭娴滄姊洪崫鍕偍闁搞劍妞介幃陇绠涢幙鍐數闁荤娀缂氬▍锝嗘櫠閺囥垺鐓熼煫鍥风导缁ㄨ偐绱掔紒妯兼创鐎规洏鍔戦、姗�鎮ゆ担鐧哥礂闂傚倷绀侀幖顐︽儗婢跺本宕叉繝闈涙閺嗭箓鏌涘Δ鍐拷锝夋偄閸忕厧娈愰梺鍐叉惈閸燁偆鏁妸鈺傗拻闁稿本鐟чˇ锕傛煙绾板崬浜扮�殿喚鏁婚、妤呭礋椤掞拷閸擃喖顪冮妶鍡欏⒈闁稿鍨块弫鎾诲箣閹烘梻鐛㈤悗娈垮枟閹歌櫕鎱ㄩ敓浠嬫煃閵夈儱甯犵紒銊ㄥ吹缁辨捇宕掑▎鎴М濡炪倖鍨靛Λ娑㈡晸閻ｅ瞼鎳楅柛銉ｅ妼娴犙勭箾鐎电甯堕柣掳鍔戦崺娑㈠箳閹炽劌缍婇弫鎰板醇濠㈩剚鎹囬弻鏇㈠幢濡わ拷閺嗙喓绱掓潏銊ユ诞闁轰焦鎹囬幊鐐哄Ψ閿曪拷椤庢捇姊虹紒妯垮闁宦板妿閿熻姤淇洪～澶愬箞閵娿儺娼ㄩ柛鈩冾殔缁犺櫣绱撴担鑺ョ【鐎殿喖鐖兼俊鐢稿礋椤栵絾鏅濋梺闈涚箞閸ㄥ顢欐径宀�纾藉ù锝堟鐢稓绱掔拠鎻掞拷鍧楁晲閻愭祴鏀介悗锝呯仛閺呫垽姊虹粙璺ㄧ効濠碘�虫处閹梹绻濋崒妤佹杸闂佺粯蓱閸撴岸宕箛娑欑厱闁绘ɑ鍓氬▓婊堟煃閵夘垳鐣电�规洖銈搁幃銏㈢礄閻樼數鐓夐梻鍌欑缂嶅﹤螞鐠恒劎鐭嗗ù锝堟娑撳秹鏌ｉ弬璺ㄦ闁猴拷娴犲鐓曢悘鐐插⒔椤ｆ煡鏌涢悢鍝勪槐闁哄苯绉归弻銊э拷锝庝簽娴煎矂姊洪崫鍕拱缂佸鍨块崺鐐哄箣閿曪拷楠炪垺淇婇妶鍜冩闁汇儺浜濇穱濠囨倷椤忓嫸鎷烽幋锕�纾块柧蹇ｅ亞缁犻箖鏌ㄩ悢鍓佺煓闁哄矉绱曟禒锕傚礈瑜庨崚娑㈡⒑鐠団�虫灀闁哄懏鐩幃楣冩倻閽樺鍊為悷婊冾樀楠炲繑瀵肩�涙ǚ鎷绘繛杈剧秬濞咃絿鏁☉妯革拷鎺戭潩椤撗勭杹閻庤娲樻繛濠囧极閹邦厼绶炲┑鐘插暟閿熺瓔鍓熷娲偡閺夊簱鎸冪紓渚囧櫘閸ㄨ泛顕ｉ弻銉ョ濞达絽婀遍崣鍡涙⒑缂佹ɑ绀�闁稿﹤婀遍敓鑺ョ啲閹凤拷?
				fire.pb.friends.Module Module = new fire.pb.friends.Module();
		      Module.createXsh(Long.MAX_VALUE);
			}
		  
					
			Properties prop = ConfigManager.getInstance().getPropConf("sys");
			fire.pb.main.Gs.isYingyongbao = Integer.valueOf(FireProp.getStringValue(prop, "sys.plat.isYingyongbao")).intValue() == 1 ? true : false;
			fire.log.Module.logger.info("Gs.isYingyongbao=" + fire.pb.main.Gs.isYingyongbao);
		} catch (Exception e) {
			e.printStackTrace();
			fire.log.Module.logger.error("Mysql闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮村杈┬㈤梻浣规偠閸庢椽宕滈敃鍌氭瀬闁告劦鍠楅悡銉╂煛閸ユ湹绨奸悗姘秺濮婂搫效閸パ嶆嫹濡ゅ懎纾婚柟鎹愬煐瀹曞弶绻濋棃娑卞剱妞ゃ儱鐗婄换娑㈠箣濠靛棜鍩為梺鍛婃尰婢瑰棛妲愰幒妤佸�锋い鎺炴嫹闁告柣鍊栭妵鍕敇閻樻彃骞嬮悗娈垮枛椤兘寮幇顓炵窞濠电姴瀚弶鍛婁繆閻愵亜锟芥牜鏁幒妤�纾瑰瀣閸ㄦ繈鏌ｉ姀鐘冲暈闁抽攱鍨块弻娑樷攽閸℃浠惧銈冨劤閸嬬喓妲愰幒妤婃晩闁兼亽鍎辩壕鎶芥倵濞堝灝鏋涙い顓犲厴楠炲啴濮�閵堝棙鍎梺闈╁瘜閸欏繒妲愰弻銉︹拻濞撴熬鎷锋繛浣冲懏宕查柟鐑樻尰閸欏繘鏌ｉ姀鐘冲暈闁稿﹤鐖奸弻娑㈩敃閻樻彃濮曢梺缁樻尵閸犳牠鐛弽顬ュ酣顢楅敓浠嬫倶閸楃儐鐔嗛悷娆忓閹达箑桅闁告洦鍨遍弲婊堟偣閸ヮ亜鐨哄ù鐘虫倐濮婃椽鎮欓挊澶婂Х缂備胶濮甸幐鎼佹偩妞嬪海鐭欓悹鍥╁亾濮婂綊骞忛崨鏉戝窛濠电姴瀚鎾绘⒒閸屾艾锟芥悂宕愰幖浣哥９闁归棿鐒﹂崑瀣攽閻樻彃顏柣顓熺懇閺岀喐娼忛幑鎰靛悈缂傚倸绉甸悧婊堟晸閽樺鐣柛搴ㄤ憾钘濆ù鍏兼綑閻撴洟鏌熸潏楣冩闁绘挻鐟х槐鎺旓拷锝庡亜椤曟粓鏌熼惂鍝ョМ闁哄苯绉瑰畷锝夊Ψ瑜忛悰銏ゆ⒑閸濆嫮鐒跨紒鎻掞拷鐔轰簷濠电偠鎻徊钘夛耿闁单鍥敋閿熻棄顫忛搹瑙勫珰闁肩⒈鍓涢鍥ь渻閵堝棗鐏ユい锔诲灦閿濈偠绠涘☉娆愬劒闂侀潻瀵岄崢楣冩晬濠婂啠鏀芥い鏃傜摂濞堟梹淇婇锝囨噰闁诡噣绠栧畷濂稿即閻斿弶瀚肩紓鍌氬�烽悞锕傛晝閳轰讲鏋旀慨妤嬫嫹闁哄本绋撻敓鏂ょ祷閸斿矂鏁撻懞銉︾闁诡喗鍎抽悾锟犲箯閺冿拷濡啫鐣烽鍛閻熸瑥瀚悵婊堟⒒閸屾瑨鍏屾い顓炵墦瀵敻顢楅崒姘亰闁瑰吋鐣崝宥夊疾椤掍胶绡�濠电姴鍊绘晶娑㈡煟閹惧鈽夋い顓℃硶閹瑰嫰鎮弶鎴濐潬濠电姭鎷冮崟顐や紝闂佸搫鏈惄顖氼嚕椤掑倹宕夐柕濞у倻绀冪紓鍌氬�风欢锟犲闯椤曪拷瀹曪綁鏁撻懞銉ｄ簻闁挎洩鎷风紓宥咃躬瀵鍨惧畷鍥ㄦ畷闂佽法鍠嶇划娆忕暦娴兼潙绠涢柛蹇ｅ亜濞差參骞冭瀹曞ジ鎮㈠畡鏉课ら梻鍌欑閻ゅ洦銇旈崫銉︽殰妞ゅ繐妫楃欢銈呂旈敐鍛殭濡楀懘姊洪崨濠冨闁搞劑浜跺鎻掝煥閸喓鍘靛銈嗙墪濡寮甸锟借濠㈣埖鍔栭埛鎺懨归敐鍥╂憘闁搞倕鍟撮弻娑㈠Ω閳猴拷閹插墽锟芥鍠栭…閿嬩繆閹间礁鐓涢悗锝庡墰閳笺倖绻濋悽闈浶㈤柨鏇樺�濋幃褔宕卞☉娆戝帒闂佹悶鍎洪崜姘舵偂閻斿吋鐓涢柛灞句緱閸庛儲绻涢崼銏犘㈤棁澶愭煕韫囨挸鎮戦悘蹇斿缁辨帞绱掑Ο鑲╃暭闂佸摜濮撮敃銈堢亽濠电偠灏欑划顖滅礊婢舵劖鈷掑ù锝堫潐閸嬬娀鏌涢弬璺ㄐｇ紒缁樼♁缁绘繈宕樿缁犳岸鏌ｆ惔锝嗘毈婵炵厧顭烽獮蹇涙倻閼恒儲娅滈柟鑲╄ˉ閸撴繈鎮橀崼銏㈢＝濞达絽鎼宀勬煕閵娿倕宓嗛柍銉︽瀹曟﹢顢旀惔銏狀伓闂佹寧绻傜花鑲╄姳缂佹ǜ浜滈柟鍝勵儏閻忔煡鏌＄仦鍓ф创闁诡喒鏅犲畷锝嗗緞濡紮绱楅梻鍌欑閹碱偊寮甸鍕剮妞ゆ牗鍑归崵鏇㈡煙缂併垹鏋涢幆鐔兼⒑闂堟侗妲堕柛濠冾殜閹嫭鎯旈妸锔规嫽婵炶揪绲介幉锛勬嫻閿熺姵鐓涢柛婊�绀佹禍鎵拷娈垮櫘閸嬪棝骞忛悩宸晠妞ゆ梻鏅粙浣圭節閻㈤潧浠滄俊顖氾攻缁傚秴顭ㄩ崘鎯ф櫊濠电娀娼уΛ宀勫绩娴犲鐓熼柟閭﹀幗閸庢绻涢崼鐔哥缂佽鲸甯￠、娆撴嚍閵夈儳顣查梻浣风串缁插潡宕楀锟介悰顕�宕堕澶嬫櫈闂佸啿鎼崐褰捤夐崼顫嫹鐟欏嫭绀冮柨鏇樺灲瀹曟椽鍩勯崘顏嗙槇闂佸憡鍔︽禍鐐哄煟閵夆晜鈷掗柛灞捐壘閿熶粙顥撶划鍫熺瑹閿熶粙鐛弽顓ф晝闁挎洩鎷烽柣銈庡枟閵囧嫰骞囬崼鏇燁�嶉梺绋款儏椤戝棛鎹㈠┑鍥╃瘈闁稿本绮岄。娲⒑閸濆嫷鍎庣紒锟芥笟锟介崺鐐哄箣閿旇棄浜归梺鍛婄懃椤︻垶藝閳哄懏鈷戠紓浣股戠亸闈涒攽閻戝洦瀚归梻浣筋嚃閸犳牠宕查弻銉ョ厺閹兼番鍊楅悿锟介梺鐟扮仢閸熲晠鎯�椤忓棛纾介柛灞剧懄缁佷即鏌涢埡鍌滃⒌闁诡噯绻濋弫鎾绘偐閼艰埖鎲伴梻浣瑰缁诲倿骞婃径鎰哗濞寸姴顑嗛悡娆撴⒑椤撱劎鐣卞褎婢橀湁闁绘﹩鍋呭▍濠冩叏婵犲懏顏犻柨鐔绘濠�杈ㄥ垔椤撶儐鐒介柟鎵閻撴洟鏌曟繛鍨姕闁稿鍎抽敓鍊燁潐濞叉ê顪冮懞銉ょ箚闁绘垼妫勯悡娑樏归敐鍛喐闁绘稈鏅滄穱濠囨倷椤忓嫸鎷烽弽褜娼栧┑鐘宠壘閻撴洟鏌涢銈呮瀻妞ゆ洟浜堕弻銊╂偆閸屾稑顏�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閻樻爠鍥ㄧ厱闁斥晛鍟ㄦ禒锔剧磼椤旂懓澧插ǎ鍥э躬閹瑩顢旈崟鑸靛闁哄稁鍘肩粈澶屾喐韫囨洖鍨濆┑鐘宠壘缁狅綁鏌ｅΟ鐑樷枙婵☆偅绮撻弻锝夋偐鏉堫偒鍔呴梺缁樻尭椤︾敻鐛箛鏃戞Ч閹兼番鍨归弸鍌炴⒑閸涘﹥澶勯柛鎾寸洴钘濋柕澶堝劗閺�浠嬫煟閹邦垰鐨烘繝锟介幘顔界厱闁哄倹瀵ч幑锝夋煕閹烘挸娴�规洖銈搁幃銏ゆ惞閸︻厽顫岄梻鍌欒兌椤牏鎮锕�纾规俊銈呮噹閼稿綊鏌ｉ姀鐘冲暈闁绘挾鍠栭弻锝呂熼崹顔兼優缂備浇浜晶妤冩崲濞戙垹妞介柛鎰典簽琚﹂梻浣筋嚃閸犳鎽┑鐐靛帶缁绘﹢宕洪敓鐘茬闁冲搫顑囩涵锟介梻鍌氬�峰ù鍥敋閺嶎厼鍨傞幖娣妼缁�鍐煃鏉炴壆绛忛柟椋庡厴椤㈡稑顭ㄩ崨顖ょ闯濠电偠鎻紞锟芥繛鍜冪悼閺侇喖鈽夊杈╋紲闁荤姴娲﹁ぐ鍐汲閻斿吋鐓欐鐐茬仢閻忊晠鏌嶇憴鍕仼闁跨喐鏋荤紞鍡樼閻愭牳鍥Ω閳哄倵鎷洪梻鍌氱墛娓氭鎮炴ィ鍐╃厱閹肩补鍓濋幆鍫熴亜椤撶偞鍠樼�殿喗鎸抽幃鈺呮偨绾板闂繝鐢靛仩閹活亞寰婃禒瀣妞ゆ劧绲块々鎻捨旈敐鍛殲闁绘挻娲熼獮鏍庨锟介悘鈺呮煃缂佹ɑ绀�闁宠鍨块崹鎯х暦閸パ呭幗婵°倗濮烽崑鐐烘偋濡ゅ懎绠柛娑欐綑娴肩娀鏌曟竟顖氬閻︽帗绻濋悽闈浶ユい锝堟鍗遍柛娑欐綑閸ㄥ倿姊婚崼鐔衡枔闁哄鐗犻弻锟犲炊閵夈儳浠鹃梺绋款儛娴滎亪寮婚妸鈺傚亜闁告挷鑳堕悡鎾斥攽椤旂》鏀绘俊鐐舵閻ｇ兘鎮滅粵瀣櫍闂佺粯鍔栧姗�藟濮樿埖鈷掑ù锝囩摂閸ゅ啴鏌涢妸銈呭祮闁瑰磭鍠栭、娑樷攽閸粎缍嶉梻鍌氬�烽懗鍓佸垝椤栫偛绀夋俊銈呮噹绾惧潡鏌曢崼婵愭Ц闁绘挻娲熼弻鐔告綇妤ｅ啯顎嶉梺缁樻尰濞叉鎹㈠☉銏犵闁绘垵娲ｇ欢鐢告⒑缂佹ɑ鎯勯柛鎾寸懇濠�渚�姊虹粙璺ㄧ闁告艾顑囩划鍫拷锝庡枟閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬮梺杞扮劍閸旀瑥鐣烽妸鈺婃晣闁搞儯鍎辨慨鍌涙叏婵犲啯銇濈�规洜鍏橀、姗�鎮㈤崫鍕┑锛勫亼閸婃牕鈻旈敃鍌氱倞闁挎繂绻戠�氬綊鏌￠崘銊у缂侊拷閸愨斂浜滈柡鍌涘椤秶鎲搁弮鍫濊摕婵炴垯鍨归悞娲煕韫囨洖顎屽ù婊庝簻椤曪綁宕橀崣鍌涙瀹曘劑顢欑憴鍕伖闂傚倷绀侀幉锛勭紦閸ф纾块弶鍫涘妿婢э繝姊婚崒娆戭槮闁规祴锟芥剚娼栫憸鐗堝竾閿熻棄鍟村畷濂稿Ψ閵壯屾Т闂備礁婀遍崕銈咁潖閸︻叏鎷峰顓狀暡缂佺粯鐩鍫曞箣椤撶偛澹夋俊鐐�ら崑鍕矓閻熼偊娼栨繛宸簼椤ュ牊绻涢幋娆忕伄鐎规洦浜炵槐鎾存媴娴犲鎽靛┑鐐跺皺閸犲酣鎮鹃悜钘夘潊闁靛牆妫涢崝鍫曟倵楠炲灝鍔氭俊顐㈢焸楠炲繐煤椤忓應鎷洪梺鍛婄☉閿曪妇绮婚幘缁樺�垫慨妯煎帶婢ф挳鏌℃担瑙勫磳鐎规洘鍔欓幃銏犵暋閻楀牆鍔掓繝鐢靛仜閻°劎鍒掑澶婄畺闁稿本绋愮换鍡涙煙闂傚顦﹂柣鎾寸☉闇夐柨婵嗗椤掔喖鏌涢悙鍨毈婵﹦绮幏鍛存惞閻熸壆顐奸梻浣规偠閸斿矂宕ョ�ｎ喖绠為柕濞炬櫅鍥存繝銏ｆ硾閿曪箓鎮炬ィ鍐┾拺缂備焦锚婵牓鏌ｉ敐搴濈凹缂佸倸绉撮…銊╁醇閻斿搫骞嶉梻渚�锟芥稓绁锋繛鍛礀閳诲秹宕ㄧ�涙鍙嗛梺缁樻椤曆嗩暱婵犵數鍋涘鍓佸垝鎼粹垾锝夊箛閻楀牆锟界兘鏌ｉ幋鐐嗘垵鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�.");
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

