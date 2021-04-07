
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
        	fire.log.Module.logger.error("SQL闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔鐢稿磻閿熺姵鐓欓柟顖滃椤ュ顨ラ悙顏勭伈闁哄苯绉瑰畷顐﹀礋椤愵剚瀚圭憸鐗堝笒缁狙囨煙闂傚鍔嶉柍閿嬪笒闇夐柨婵嗘噺閸熺偤鏌熼姘卞ⅵ闁哄矉绲借灃闁跨喕妫勮灋婵犻潧锕ラˉ銈夋⒒閸屾艾锟芥悂鎮ф繝鍥х婵﹩鍏樺Σ鍫ユ煏韫囧鎷烽搹顐ゆ澓缂傚倷鑳堕崑鎾愁熆濮楋拷钘濋梺顒�绉甸崕妤佷繆閵堝繑瀚归梺瀹狀潐閸ㄥ潡銆佸▎鎴犻┏閻庯綆鍋嗛弳銉╂⒒娴ｈ櫣甯涙い銊ユ噽閹广垽骞掗幘鍓佸骄闂佸搫娲㈤崹娲疾閹间焦鐓ラ柣鏇炲�圭�氾拷");
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
				// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸モ晝鍘梻浣告啞濞诧箓宕㈤挊澶屾殾闁告瑥顦辩弧锟介梻鍌氱墛娓氭宕曢幇鐗堢厱閻庯綆鍊栭幋鐐碘攳濠电姴娲ょ粻姘辨喐婢舵劖鏅搁柤鎭掑劚瀹撳攢.pb.PropConf.ServerId.ServerId
				if (fire.pb.PropConf.ServerId.ServerId != id) {
					fire.log.Module.logger.error("fire.pb.PropConf.ServerId.ServerId:" + fire.pb.PropConf.ServerId.ServerId
							+ " != ServerIDResponse.serverId:" + id);
					ManagementFactory.getPlatformMBeanServer().setAttribute(
							new javax.management.ObjectName("bean:name=stopper"),
							new javax.management.Attribute("StopTime", 0));
				}
				// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸モ晝鍘梻浣告啞濞诧箓宕㈤挊澶屾殾闁告瑥顦辩弧锟介梻鍌氱墛娓氭宕曢幇鐗堢厱閻庯綆鍊栭幋鐐碘攳濠电姴娲ょ粻姘辨喐婢舵劖鏅搁柤鎭掑劚瀹撳攢.pb.main.Gs.serverid
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
				 // 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囨繝寰锋澘锟芥洟宕导瀛樺剹婵炲棙鎸婚悡娆撴倵閻㈡鐒鹃崯鍝ョ磼閹冪稏缂侇喗鐟╁濠氭偄閻撳海顔夐梺褰掑亰閸撴盯宕㈤锔界厽閹兼番鍨婚。鍙夋叏濡濡挎俊鍙夊姍楠炴鎷犻弻銉ユ暪闂備線娼х换鎺撴叏瀹�鍕ㄩ柍鍝勫�婚崢浠嬫⒑缂佹ɑ鐓ラ柟鑺ョ矌缁顫滈敓浠嬪蓟閵娾晜鍋勯柣鎴炆戦悵顏堟⒑鏉炴壆顦﹂柟璇х節瀵尙鎹勬担鏇熸瀹曘劑顢曢浣割伓闂佸憡鍔﹂崰鏍ь啅濠靛鐓涘璺侯儏濞堥箖鏌ㄩ弴鐐诧拷褰掓偂閺囥垺鐓忓璺虹墕閻忣亝绻涢崨顓燁棦闁哄矉绻濆畷鍗炍熼懖鈺冨帨闂備礁鎼張顒勬儎椤栫偑锟戒線寮撮姀鈥充簻缂備礁顑嗙�笛囨偟娴煎瓨鈷掑ù锝堝Г閵嗗啰绱掗敓鑺ユ媴閻氬瓨瀚规慨姗嗗幗缁跺弶銇勯銏㈢缂佺粯绻傞～婵嬵敆閸岋妇搴婂┑鐘愁問閸犳鈥﹂崼鐔翠粓闁归棿绀佺粻鐔封攽閸屾碍鍟為柍閿嬪灴閺屾稑鈹戦崱妤婁痪濡炪們鍎虫繛锟介柡灞剧洴閹晛鐣烽崶褉鎷伴梻浣虹帛娓氭宕抽敐澶婃瀬闁瑰墽绮弲鎼佹煥閻曞倹瀚�?
				fire.pb.friends.Module Module = new fire.pb.friends.Module();
		      Module.createXsh(Long.MAX_VALUE);
			}
		  
					
			Properties prop = ConfigManager.getInstance().getPropConf("sys");
			fire.pb.main.Gs.isYingyongbao = Integer.valueOf(FireProp.getStringValue(prop, "sys.plat.isYingyongbao")).intValue() == 1 ? true : false;
			fire.log.Module.logger.info("Gs.isYingyongbao=" + fire.pb.main.Gs.isYingyongbao);
		} catch (Exception e) {
			e.printStackTrace();
			fire.log.Module.logger.error("Mysql闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵嬫濞戝崬鍓扮紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帒鍊风划鐢告⒑閸濆嫭顥炵紒顔芥崌瀵鎮㈤搹鍦紲闂侀潧绻掓慨鐢告倶閸儲鐓熼幖娣灱婢规ɑ銇勯敂璇茬仸闁炽儻绠撳畷绋课旀担鍛婄杺闂傚倸鍊搁悧濠勭矙閹达讣缍栫�广儱顦伴埛鎴︽煙缁嬫寧鎹ｉ柍鍙ョ窔閺岋絽螖娴ｅ湱顦梺璇茬箰椤戝顫忛搹鍦＜婵妫欓悾鍫曟⒑缂佹﹩娈橀柛瀣ㄥ�曢悾宄拔旈崪浣规櫌闂佺鏈划搴ㄦ晬濠婂牊鐓涘璺猴功婢ф垿鏌涢弬璺ㄧ伇缂侇噮鍙�椤﹀綊鏌″畝锟介崰鎰八囬悧鍫熷劅闁宠鲸甯徊楣冨Φ閸曨垱鏅滈柟顖嗗本姣夐梻浣筋嚃閸ㄩ亶寮婚妸鈺嬬稏婵犲﹤鐗嗛柋鍥煟閺傛娈犲ù鍏兼尰缁绘繄鍠婂Ο娲绘綉闂佹悶鍔嶆繛濠冧繆鐎甸潻鎷烽敐搴℃灈缂佺媭鍨伴—鍐拷锝庝簻椤掋垽鏌涢悩鍙夘棦闁哄本鐩鎾Ω閵夈倗鐩庨梻浣告贡閺咁偊寮拠宸綎婵炲樊浜滃婵嗏攽閻愭惌娈曠紒顔芥尭閻ｇ兘骞囬鈺傛瀹曟﹢鍩℃繝鍐◥闂傚倷绀侀幖顐﹀疮椤愶附鍋嬫繝濠傜墕閺嬩礁鈹戦悩鍙夊闁绘挾濞�閹嘲鈻庤箛鎿冧痪缂備浇鍩栭悡锟犲蓟閿濆應鏀介柟閭﹀墰娴犫晠姊虹�圭媭娼愰柛銊ユ健瀹曟椽濡烽埡浣哥獩濡炪倖姊婚埛鍫熷閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜閻犱警鐓夐幏椋庢喆閸曨剛顦ュ┑鐐茬湴閸斿海鍒掗崼鐔虹瘈闁稿被鍊楅崬鐢告煟閻樿崵绱版繛鍜冪秮閹ɑ娼忛埡鍐╋紡闂佽鍨庨崘鈺侊拷顖滅磽娴ｈ櫣甯涚紒璇插暟閹广垹鈹戠�ｎ亞顦ㄩ梺闈涱焾閸庡搫顭囬弴鐘电＝濞达絽鎼禍楣冩煕鎼淬垹鈻曞┑鈥崇埣楠炴牗鎷呴崫銉ф毇婵犵妲呴崹闈涒枖閺囥垺鍋柨鐔剁矙濮婃椽宕烽鐐板闂佽鍨伴懟顖濈亱闂佺粯鍔楅崕銈夊煕閹达附鐓曟繛鎴烇供閻擃剙霉閸忓吋绀嬮柡灞剧洴婵＄兘鏁愰崨顓囥劑姊洪崷顓熺効妞ゆ泦鍥ｏ拷鏃堝礃椤斿槈褔鏌涢埄鍏狀亪寮冲Δ鍛拺闁告縿鍎辨牎闂佸憡姊归〃鍫ュ礆閹烘梹瀚氭繛鏉戭儐椤秹姊洪棃娑㈢崪缂佽鲸娲熷畷銏ゆ焼瀹ュ棌鎷洪梺鍛婄箓鐎氼剟鏁撻崐鐔峰惞濞存粍鎮傛俊鎼佸煛娴ｄ警鍞甸梻浣虹帛閸ㄥ吋鎱ㄩ妶澶婄畾闁绘劖鐣禍婊堟煙閹佃櫕娅呴柨鐔诲Г濞叉粎妲愰悙鐑樻櫢闁跨噦鎷�.");
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

