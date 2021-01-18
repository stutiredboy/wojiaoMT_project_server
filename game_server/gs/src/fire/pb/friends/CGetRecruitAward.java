
package fire.pb.friends;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import fire.pb.RoleConfigManager;
import fire.pb.activity.award.RewardMgr;
import fire.pb.common.SCommon;
import fire.pb.http.HttpCallBackHandler;
import fire.pb.main.ConfigManager;
import fire.pb.main.Gs;
import fire.pb.mission.instance.LevelGroupAward;
import fire.pb.talk.MessageMgr;
import fire.pb.util.FireProp;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.http.client.methods.HttpGet;












// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGetRecruitAward__ extends mkio.Protocol { }

/** 招募
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGetRecruitAward extends __CGetRecruitAward__ {
	public static final Logger logger = Logger.getLogger("FRIEND");
	public static final String address = FireProp.getStringValue("sys", "sys.zhaomu.address");
	public static final String func1 = "/enlist/set_times_prize";
	public static final String func2 = "/enlist/set_prize_status";
	
	private static void distributeAward(final long roleid, final int awardid, final int IsDbPoint, Map<String, Object> paras) {
		if (paras == null)
			paras = new HashMap<String, Object>(20);
		
		fire.pb.activity.award.RewardMgr.getInstance().distributeAllAward(roleid, awardid, paras,
						fire.log.enums.YYLoggerTuJingEnum.tujing_Value_shifu, awardid,
						0, "閹锋稑瀚欐總鏍уС");
	}
	
	private static class GetRecruitAwardHttpHandler extends HttpCallBackHandler {
		private HttpGet request;
		private final long roleId;
		private final int awardtype;
		private CGetRecruitAward proto;
		
		public GetRecruitAwardHttpHandler(long roleId, HttpGet request, int awardtype, CGetRecruitAward proto) {
			this.request = request;
			this.roleId = roleId;
			this.awardtype = awardtype;
			this.proto = proto;
		}
		
		@Override
		protected boolean process(JSONObject json) {
			final String errno = json.getString("errno");
			SGetRecruitAward snd = new SGetRecruitAward();
			snd.awardtype = proto.awardtype;
			snd.awardid = proto.awardid;
			snd.recruitrole = proto.recruitrole;
			snd.recruitserver = proto.recruitserver;
			snd.result = 0;
            if(errno.isEmpty() || errno.equals("")) {
            	new mkdb.Procedure() {
    				@Override
    				protected boolean process() {
    					//閸欐垵顨涢崝?
    					if(awardtype == 1) {
    						RecruitAwards ra = ConfigManager.getInstance().getConf(RecruitAwards.class).get(proto.awardid);
    						if(ra == null) {
    							logger.info("CGetRecruitAward.鐟欐帟澹奫" + roleId + "]閸戝棗顦０鍡楀絿閹锋稑瀚欓弫浼村櫤閻ㄥ嫬顨涢崝?:" + proto.awardid + ",娴ｅ棝鍘ょ純顔昏礋缁岀尨绱�");
    							snd.result = 0;
    						} else {
    							String [] awardLst = ra.getAwards().split(";");
    							for (String awardStr : awardLst) {
    								int pureAwardId = Integer.parseInt(awardStr);
    								CGetRecruitAward.distributeAward(roleId, pureAwardId, 0, null);
    							}
    							snd.result = 1;
    						}
    					} else if(awardtype == 2) {
    						//閼藉鍋挎す顒傜摜閸掓帗鏁奸棁?濮瑰偊绱濋惂钘変粵
//    						RecruitChargeAwards rca = ConfigManager.getInstance().getConf(RecruitChargeAwards.class).get(proto.awardid);
//    						if(rca == null) {
//    							logger.info("CGetRecruitAward.鐟欐帟澹奫" + roleId + "]閸戝棗顦０鍡楀絿鐟欐帟澹奫" + proto.recruitrole + "]閹锋稑瀚欓崗鍛�?鑲╂畱婵傛牕濮�:" + proto.awardid + ",娴ｅ棝鍘ょ純顔昏礋缁岀尨绱�");
//    							snd.result = 0;
//    						} else {
//    							String [] awardLst = rca.getAwards().split(";");
//    							for (String awardStr : awardLst) {
//    								int pureAwardId = Integer.parseInt(awardStr);
//    								CGetRecruitAward.distributeAward(roleId, pureAwardId, 0, null);
//    							}
//    							snd.result = 1;
//    						}
    					} else if(awardtype == 3) {
    						MyRecruitAwards mra = ConfigManager.getInstance().getConf(MyRecruitAwards.class).get(proto.awardid);
    						if(mra == null) {
    							logger.info("CGetRecruitAward.鐟欐帟澹奫" + roleId + "]閸戝棗顦０鍡楀絿鐟欐帟澹奫" + proto.recruitrole + "]閹锋稑瀚欑粵澶岄獓閻ㄥ嫬顨涢崝?:" + proto.awardid + ",娴ｅ棝鍘ょ純顔昏礋缁岀尨绱�");
    							snd.result = 0;
    						} else {
    							String [] awardLst = mra.getAwards().split(";");
    							for (String awardStr : awardLst) {
    								int pureAwardId = Integer.parseInt(awardStr);
    								CGetRecruitAward.distributeAward(roleId, pureAwardId, 0, null);
    							}
    							snd.result = 1;		
    							xbean.RecruitAward srcra = xtable.Rolerecruitaward.get(roleId);
    							if(srcra != null){
	    							srcra.setGetnum(srcra.getGetnum() + 1);
	    							final long now = Calendar.getInstance().getTimeInMillis();
	    							srcra.setGettime(now);
	    							logger.info("CGetRecruitAward.鐟欐帟澹奫" + roleId + "]妫板棗褰囨禍鍡氼潡閼圭瀲" + proto.recruitrole + "]閹锋稑瀚欑粵澶岄獓閻ㄥ嫬顨涢崝?:" + proto.awardid + "!" + roleId + "瀹歌尙绮￠懢宄扮繁" + srcra.getGetnum() + "濞嗭紕銇滈悧?.");
    							} else {
    								logger.error("CGetRecruitAward.鐟欐帟澹奫" + roleId + "]妫板棗褰囨禍鍡楊殯閸�?,娴ｅ棙妲搁幏娑樺珯xdb閺佺増宓乶ull!");
    							}
    						}
    					}
    					psendWhileCommit(roleId, snd);
    					return true;
    				}
    			}.submit();
            } else {
            	logger.info("CGetRecruitAward.GetRecruitAwardHttpHandler:errno=" + errno + ",message=" + json.getString("message"));
            	snd.result = 0;
            	gnet.link.Onlines.getInstance().send(roleId, snd);
            }
			return true;
		}
	}
	
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		logger.info("CGetRecruitAward.鐟欐帟澹奫" + roleid + "]閸戝棗顦０鍡楀絿閹锋稑瀚欐總鏍уС!" + 
			"type=" + awardtype + ",id=" + awardid + ",recruitrole=" + recruitrole + "@server=" + recruitserver);
		try {
			String serverid = Gs.serverid;
			if(awardtype == 1) {
				//閹锋稑瀚欐稉顏呮殶婵傛牕濮�
				RecruitAwards ra = ConfigManager.getInstance().getConf(RecruitAwards.class).get(awardid);
				if(ra == null) {
					logger.info("CGetRecruitAward.鐟欐帟澹奫" + roleid + "]閸戝棗顦０鍡楀絿閹锋稑瀚欓弫浼村櫤閻ㄥ嫬顨涢崝?:" + awardid + ",娴ｅ棝鍘ょ純顔昏礋缁岀尨绱�");
					return;
				}
				final SCommon cc = RoleConfigManager.getRoleCommonConfig(423);
				int conditionLevel = cc != null ? Integer.parseInt(cc.getValue()) : 0; //閹锋稑瀚欐總钘夊几缁涘楠囬梽鎰煑
				final String buildurl = String.format(
						"http://%1$s%2$s?serverid=%3$s&roleid=%4$s&times=%5$s&level=%6$s",
						address, func1, serverid, roleid, ra.getNum(), conditionLevel); //閹锋稑瀚欏▎鈩冩殶(娴滅儤鏆�)婵傛牕濮�
				final HttpGet request = new HttpGet(buildurl);
				Gs.getHttpClient().execute(request, new GetRecruitAwardHttpHandler(roleid, request, awardtype, this));
			} else if(awardtype == 2) {
				//閸忓懎?鐓庮殯閸�?//閼藉鍋挎す顒傜摜閸掓帗鏁奸棁?濮瑰偊绱濋惂钘変粵
//				RecruitChargeAwards rca = ConfigManager.getInstance().getConf(RecruitChargeAwards.class).get(awardid);
//				if(rca == null) {
//					logger.info("CGetRecruitAward.鐟欐帟澹奫" + roleid + "]閸戝棗顦０鍡楀絿鐟欐帟澹奫" + recruitrole + "]閹锋稑瀚欓崗鍛�?鑲╂畱婵傛牕濮�:" + awardid + ",娴ｅ棝鍘ょ純顔昏礋缁岀尨绱�");
//					return;
//				}
//				final String buildurl = String.format(
//						"http://%1$s%2$s?serverid=%3$s&roleid=%4$s&new_serverid=%5$s&new_roleid=%6$s&prize_type=%7$s&amount=%8$s",
//						address, func2, serverid, roleid, recruitserver, recruitrole, 1, rca.getLevel()); //婵傛牕濮崇猾璇茬�穚rize_type=1閸忓懎??
//				final HttpGet request = new HttpGet(buildurl);
//				Gs.getHttpClient().execute(request, new GetRecruitAwardHttpHandler(roleid, request, awardtype, this));
			} else if(awardtype == 3) {
				//閸楀洨楠囨總鏍уС
				final long now = Calendar.getInstance().getTimeInMillis();
				Long gettime = xtable.Rolerecruitaward.selectGettime(roleid);
				long lastgettime = (gettime == null ? 0L : gettime.longValue());
				if (fire.pb.util.DateValidate.inTheSameWeek(lastgettime, now)){
					//閺勵垰鎮撴稉?閸�?,濡�?濞村顐奸弫?
					final SCommon cc = RoleConfigManager.getRoleCommonConfig(422);
					int maxnum = cc != null ? Integer.parseInt(cc.getValue()) : 0; //濮ｅ繐鎳嗛惃鍕付婢堆嗗箯瀵版顐奸弫?
					int alreadynum = xtable.Rolerecruitaward.selectGetnum(roleid); //瀹歌尙绮￠懢宄扮繁濞嗏剝鏆�
					if(alreadynum < maxnum) {
						//濞屸剝婀佺搾鍛扮箖濞嗏剝鏆�,缂佈呯敾
					} else {
						//MessageMgr.psendMsgNotify(roleid, 170043, null);
						MessageMgr.sendMsgNotify(roleid, 170043, null);
						logger.info("CGetRecruitAward.鐟欐帟澹奫" + roleid + "]閸戝棗顦０鍡楀絿鐟欐帟澹奫" + recruitrole + "]閹锋稑瀚欑粵澶岄獓閻ㄥ嫬顨涢崝鎲嬬礉娴ｅ棙婀伴崨銊ュ嚒缂佸繗绉存潻鍥暙閸欐牗顐奸弫棰佺瑐闂�?(" + maxnum + ")閿涘奔绗夋导姘冲箯瀵版銇滈悧鈺嬬磼");
						return;
					}
				} else {
					//娑撳秵妲搁崥灞肩閸�?,濞撳懐鈹�(娑撳﹤鎳�)閸樺棗褰舵０鍡楀絿濞嗏剝鏆�
					new mkdb.Procedure() {
	    				@Override
	    				protected boolean process() {
	    					logger.info("CGetRecruitAward.鐟欐帟澹奫" + roleid + "]閸戝棗顦０鍡楀絿鐟欐帟澹奫" + recruitrole + "]閹锋稑瀚欑粵澶岄獓閻ㄥ嫬顨涢崝鎲嬬礉鐠恒劌銇夋禍鍡礉濞撳懐鈹栭崢鍡楀蕉妫板棗褰囧▎鈩冩殶閿�?");
	    					xbean.RecruitAward srcra = xtable.Rolerecruitaward.get(roleid);
							if(srcra == null){
								logger.error("CGetRecruitAward.鐟欐帟澹奫" + roleid + "]閹锋稑瀚檟db閺佺増宓乶ull!");
	    						return false;
							}
							srcra.setGetnum(0);
	    					return true;
	    				}
					}.submit().get();
				}
				MyRecruitAwards mra = ConfigManager.getInstance().getConf(MyRecruitAwards.class).get(awardid);
				if(mra == null) {
					logger.info("CGetRecruitAward.鐟欐帟澹奫" + roleid + "]閸戝棗顦０鍡楀絿鐟欐帟澹奫" + recruitrole + "]閹锋稑瀚欑粵澶岄獓閻ㄥ嫬顨涢崝?:" + awardid + ",娴ｅ棝鍘ょ純顔昏礋缁岀尨绱�");
					return;
				}
				final String buildurl = String.format(
						"http://%1$s%2$s?serverid=%3$s&roleid=%4$s&new_serverid=%5$s&new_roleid=%6$s&prize_type=%7$s&amount=%8$s",
						address, func2, serverid, roleid, recruitserver, recruitrole, 0, mra.getLevel()); //婵傛牕濮崇猾璇茬�穚rize_type=0缁涘楠�
				final HttpGet request = new HttpGet(buildurl);
				Gs.getHttpClient().execute(request, new GetRecruitAwardHttpHandler(roleid, request, awardtype, this));
			}	
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 806662;

	public int getType() {
		return 806662;
	}

	public int awardtype; // 奖励类型 1招募人数奖励 2招募玩家充值奖励 3招募玩家等级奖励
	public int awardid; // 配置招募奖励表里的id
	public long recruitrole; // 被招募的角色id
	public java.lang.String recruitserver; // 被招募的角色所在服务器id

	public CGetRecruitAward() {
		recruitserver = "";
	}

	public CGetRecruitAward(int _awardtype_, int _awardid_, long _recruitrole_, java.lang.String _recruitserver_) {
		this.awardtype = _awardtype_;
		this.awardid = _awardid_;
		this.recruitrole = _recruitrole_;
		this.recruitserver = _recruitserver_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(awardtype);
		_os_.marshal(awardid);
		_os_.marshal(recruitrole);
		_os_.marshal(recruitserver, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		awardtype = _os_.unmarshal_int();
		awardid = _os_.unmarshal_int();
		recruitrole = _os_.unmarshal_long();
		recruitserver = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGetRecruitAward) {
			CGetRecruitAward _o_ = (CGetRecruitAward)_o1_;
			if (awardtype != _o_.awardtype) return false;
			if (awardid != _o_.awardid) return false;
			if (recruitrole != _o_.recruitrole) return false;
			if (!recruitserver.equals(_o_.recruitserver)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += awardtype;
		_h_ += awardid;
		_h_ += (int)recruitrole;
		_h_ += recruitserver.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(awardtype).append(",");
		_sb_.append(awardid).append(",");
		_sb_.append(recruitrole).append(",");
		_sb_.append("T").append(recruitserver.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

