
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

/** ��ļ
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
						0, "招募奖励");
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
    					//发奖�?
    					if(awardtype == 1) {
    						RecruitAwards ra = ConfigManager.getInstance().getConf(RecruitAwards.class).get(proto.awardid);
    						if(ra == null) {
    							logger.info("CGetRecruitAward.角色[" + roleId + "]准备领取招募数量的奖�?:" + proto.awardid + ",但配置为空！");
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
    						//草泥马策划改�?求，白做
//    						RecruitChargeAwards rca = ConfigManager.getInstance().getConf(RecruitChargeAwards.class).get(proto.awardid);
//    						if(rca == null) {
//    							logger.info("CGetRecruitAward.角色[" + roleId + "]准备领取角色[" + proto.recruitrole + "]招募充�?�的奖励:" + proto.awardid + ",但配置为空！");
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
    							logger.info("CGetRecruitAward.角色[" + roleId + "]准备领取角色[" + proto.recruitrole + "]招募等级的奖�?:" + proto.awardid + ",但配置为空！");
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
	    							logger.info("CGetRecruitAward.角色[" + roleId + "]领取了角色[" + proto.recruitrole + "]招募等级的奖�?:" + proto.awardid + "!" + roleId + "已经获得" + srcra.getGetnum() + "次礼�?.");
    							} else {
    								logger.error("CGetRecruitAward.角色[" + roleId + "]领取了奖�?,但是招募xdb数据null!");
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
		logger.info("CGetRecruitAward.角色[" + roleid + "]准备领取招募奖励!" + 
			"type=" + awardtype + ",id=" + awardid + ",recruitrole=" + recruitrole + "@server=" + recruitserver);
		try {
			String serverid = Gs.serverid;
			if(awardtype == 1) {
				//招募个数奖励
				RecruitAwards ra = ConfigManager.getInstance().getConf(RecruitAwards.class).get(awardid);
				if(ra == null) {
					logger.info("CGetRecruitAward.角色[" + roleid + "]准备领取招募数量的奖�?:" + awardid + ",但配置为空！");
					return;
				}
				final SCommon cc = RoleConfigManager.getRoleCommonConfig(423);
				int conditionLevel = cc != null ? Integer.parseInt(cc.getValue()) : 0; //招募好友等级限制
				final String buildurl = String.format(
						"http://%1$s%2$s?serverid=%3$s&roleid=%4$s&times=%5$s&level=%6$s",
						address, func1, serverid, roleid, ra.getNum(), conditionLevel); //招募次数(人数)奖励
				final HttpGet request = new HttpGet(buildurl);
				Gs.getHttpClient().execute(request, new GetRecruitAwardHttpHandler(roleid, request, awardtype, this));
			} else if(awardtype == 2) {
				//充�?�奖�?//草泥马策划改�?求，白做
//				RecruitChargeAwards rca = ConfigManager.getInstance().getConf(RecruitChargeAwards.class).get(awardid);
//				if(rca == null) {
//					logger.info("CGetRecruitAward.角色[" + roleid + "]准备领取角色[" + recruitrole + "]招募充�?�的奖励:" + awardid + ",但配置为空！");
//					return;
//				}
//				final String buildurl = String.format(
//						"http://%1$s%2$s?serverid=%3$s&roleid=%4$s&new_serverid=%5$s&new_roleid=%6$s&prize_type=%7$s&amount=%8$s",
//						address, func2, serverid, roleid, recruitserver, recruitrole, 1, rca.getLevel()); //奖励类型prize_type=1充�??
//				final HttpGet request = new HttpGet(buildurl);
//				Gs.getHttpClient().execute(request, new GetRecruitAwardHttpHandler(roleid, request, awardtype, this));
			} else if(awardtype == 3) {
				//升级奖励
				final long now = Calendar.getInstance().getTimeInMillis();
				Long gettime = xtable.Rolerecruitaward.selectGettime(roleid);
				long lastgettime = (gettime == null ? 0L : gettime.longValue());
				if (fire.pb.util.DateValidate.inTheSameWeek(lastgettime, now)){
					//是同�?�?,�?测次�?
					final SCommon cc = RoleConfigManager.getRoleCommonConfig(422);
					int maxnum = cc != null ? Integer.parseInt(cc.getValue()) : 0; //每周的最大获得次�?
					int alreadynum = xtable.Rolerecruitaward.selectGetnum(roleid); //已经获得次数
					if(alreadynum < maxnum) {
						//没有超过次数,继续
					} else {
						//MessageMgr.psendMsgNotify(roleid, 170043, null);
						MessageMgr.sendMsgNotify(roleid, 170043, null);
						logger.info("CGetRecruitAward.角色[" + roleid + "]准备领取角色[" + recruitrole + "]招募等级的奖励，但本周已经超过领取次数上�?(" + maxnum + ")，不会获得礼物！");
						return;
					}
				} else {
					//不是同一�?,清空(上周)历史领取次数
					new mkdb.Procedure() {
	    				@Override
	    				protected boolean process() {
	    					logger.info("CGetRecruitAward.角色[" + roleid + "]准备领取角色[" + recruitrole + "]招募等级的奖励，跨天了，清空历史领取次数�?");
	    					xbean.RecruitAward srcra = xtable.Rolerecruitaward.get(roleid);
							if(srcra == null){
								logger.error("CGetRecruitAward.角色[" + roleid + "]招募xdb数据null!");
	    						return false;
							}
							srcra.setGetnum(0);
	    					return true;
	    				}
					}.submit().get();
				}
				MyRecruitAwards mra = ConfigManager.getInstance().getConf(MyRecruitAwards.class).get(awardid);
				if(mra == null) {
					logger.info("CGetRecruitAward.角色[" + roleid + "]准备领取角色[" + recruitrole + "]招募等级的奖�?:" + awardid + ",但配置为空！");
					return;
				}
				final String buildurl = String.format(
						"http://%1$s%2$s?serverid=%3$s&roleid=%4$s&new_serverid=%5$s&new_roleid=%6$s&prize_type=%7$s&amount=%8$s",
						address, func2, serverid, roleid, recruitserver, recruitrole, 0, mra.getLevel()); //奖励类型prize_type=0等级
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

	public int awardtype; // �������� 1��ļ�������� 2��ļ��ҳ�ֵ���� 3��ļ��ҵȼ�����
	public int awardid; // ������ļ���������id
	public long recruitrole; // ����ļ�Ľ�ɫid
	public java.lang.String recruitserver; // ����ļ�Ľ�ɫ���ڷ�����id

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

