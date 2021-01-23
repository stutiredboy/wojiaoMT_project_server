
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
						0, "闁归攱绋戠�氭瑦绺介弽褍小");
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
    					//闁告瑦鍨甸〃娑㈠礉?
    					if(awardtype == 1) {
    						RecruitAwards ra = ConfigManager.getInstance().getConf(RecruitAwards.class).get(proto.awardid);
    						if(ra == null) {
    							logger.info("CGetRecruitAward.閻熸瑦甯熸竟濂�" + roleId + "]闁告垵妫楅ˇ顒侊紣閸℃绲块柟閿嬬☉鐎氭瑩寮导鏉戞闁汇劌瀚〃娑㈠礉?:" + proto.awardid + ",濞达絽妫濋崢銈囩磾椤旀槒绀嬬紒宀�灏ㄧ槐锟�");
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
    						//闁艰棄顦伴崑鎸庛仚椤掑倻鎽滈柛鎺撳笚閺佸ジ妫�?婵懓鍋婄槐婵嬫儌閽樺绮�
//    						RecruitChargeAwards rca = ConfigManager.getInstance().getConf(RecruitChargeAwards.class).get(proto.awardid);
//    						if(rca == null) {
//    							logger.info("CGetRecruitAward.閻熸瑦甯熸竟濂�" + roleId + "]闁告垵妫楅ˇ顒侊紣閸℃绲块悷娆愬笩婢瑰カ" + proto.recruitrole + "]闁归攱绋戠�氭瑩宕楅崨锟�?閼测晜鐣卞┑鍌涚墪婵拷:" + proto.awardid + ",濞达絽妫濋崢銈囩磾椤旀槒绀嬬紒宀�灏ㄧ槐锟�");
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
    							logger.info("CGetRecruitAward.閻熸瑦甯熸竟濂�" + roleId + "]闁告垵妫楅ˇ顒侊紣閸℃绲块悷娆愬笩婢瑰カ" + proto.recruitrole + "]闁归攱绋戠�氭瑧绮垫径宀勭崜闁汇劌瀚〃娑㈠礉?:" + proto.awardid + ",濞达絽妫濋崢銈囩磾椤旀槒绀嬬紒宀�灏ㄧ槐锟�");
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
	    							logger.info("CGetRecruitAward.閻熸瑦甯熸竟濂�" + roleId + "]濡澘妫楄ぐ鍥ㄧ閸℃凹娼￠柤鍦��" + proto.recruitrole + "]闁归攱绋戠�氭瑧绮垫径宀勭崜闁汇劌瀚〃娑㈠礉?:" + proto.awardid + "!" + roleId + "鐎规瓕灏欑划锟犳嚔瀹勬壆绻�" + srcra.getGetnum() + "婵炲棴绱曢妵婊堟偋?.");
    							} else {
    								logger.error("CGetRecruitAward.閻熸瑦甯熸竟濂�" + roleId + "]濡澘妫楄ぐ鍥ㄧ閸℃娈柛锟�?,濞达絽妫欏Σ鎼佸箯濞戞ê鐝痻db闁轰胶澧楀畵涔秛ll!");
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
		logger.info("CGetRecruitAward.閻熸瑦甯熸竟濂�" + roleid + "]闁告垵妫楅ˇ顒侊紣閸℃绲块柟閿嬬☉鐎氭瑦绺介弽褍小!" + 
			"type=" + awardtype + ",id=" + awardid + ",recruitrole=" + recruitrole + "@server=" + recruitserver);
		try {
			String serverid = Gs.serverid;
			if(awardtype == 1) {
				//闁归攱绋戠�氭瑦绋夐鍛濠靛倹鐗曟慨锟�
				RecruitAwards ra = ConfigManager.getInstance().getConf(RecruitAwards.class).get(awardid);
				if(ra == null) {
					logger.info("CGetRecruitAward.閻熸瑦甯熸竟濂�" + roleid + "]闁告垵妫楅ˇ顒侊紣閸℃绲块柟閿嬬☉鐎氭瑩寮导鏉戞闁汇劌瀚〃娑㈠礉?:" + awardid + ",濞达絽妫濋崢銈囩磾椤旀槒绀嬬紒宀�灏ㄧ槐锟�");
					return;
				}
				final SCommon cc = RoleConfigManager.getRoleCommonConfig(423);
				int conditionLevel = cc != null ? Integer.parseInt(cc.getValue()) : 0; //闁归攱绋戠�氭瑦绺介挊澶婂嚑缂佹稑顦辨鍥⒔閹邦剙鐓�
				final String buildurl = String.format(
						"http://%1$s%2$s?serverid=%3$s&roleid=%4$s&times=%5$s&level=%6$s",
						address, func1, serverid, roleid, ra.getNum(), conditionLevel); //闁归攱绋戠�氭瑥鈻庨埄鍐╂(濞存粎鍎ら弳锟�)濠靛倹鐗曟慨锟�
				final HttpGet request = new HttpGet(buildurl);
				Gs.getHttpClient().execute(request, new GetRecruitAwardHttpHandler(roleid, request, awardtype, this));
			} else if(awardtype == 2) {
				//闁稿繐鎳�?閻撳寒娈柛锟�?//闁艰棄顦伴崑鎸庛仚椤掑倻鎽滈柛鎺撳笚閺佸ジ妫�?婵懓鍋婄槐婵嬫儌閽樺绮�
//				RecruitChargeAwards rca = ConfigManager.getInstance().getConf(RecruitChargeAwards.class).get(awardid);
//				if(rca == null) {
//					logger.info("CGetRecruitAward.閻熸瑦甯熸竟濂�" + roleid + "]闁告垵妫楅ˇ顒侊紣閸℃绲块悷娆愬笩婢瑰カ" + recruitrole + "]闁归攱绋戠�氭瑩宕楅崨锟�?閼测晜鐣卞┑鍌涚墪婵拷:" + awardid + ",濞达絽妫濋崢銈囩磾椤旀槒绀嬬紒宀�灏ㄧ槐锟�");
//					return;
//				}
//				final String buildurl = String.format(
//						"http://%1$s%2$s?serverid=%3$s&roleid=%4$s&new_serverid=%5$s&new_roleid=%6$s&prize_type=%7$s&amount=%8$s",
//						address, func2, serverid, roleid, recruitserver, recruitrole, 1, rca.getLevel()); //濠靛倹鐗曟慨宕囩尵鐠囪尙锟界rize_type=1闁稿繐鎳�??
//				final HttpGet request = new HttpGet(buildurl);
//				Gs.getHttpClient().execute(request, new GetRecruitAwardHttpHandler(roleid, request, awardtype, this));
			} else if(awardtype == 3) {
				//闁告娲ㄦ鍥ㄧ附閺嵮冃�
				final long now = Calendar.getInstance().getTimeInMillis();
				Long gettime = xtable.Rolerecruitaward.selectGettime(roleid);
				long lastgettime = (gettime == null ? 0L : gettime.longValue());
				if (fire.pb.util.DateValidate.inTheSameWeek(lastgettime, now)){
					//闁哄嫷鍨伴幃鎾寸▔?闁革拷?,婵★拷?婵炴潙顑嗛濂稿极?
					final SCommon cc = RoleConfigManager.getRoleCommonConfig(422);
					int maxnum = cc != null ? Integer.parseInt(cc.getValue()) : 0; //婵絽绻愰幊鍡涙儍閸曨剚浠樺鍫嗗棗绠�电増顨嗛濂稿极?
					int alreadynum = xtable.Rolerecruitaward.selectGetnum(roleid); //鐎规瓕灏欑划锟犳嚔瀹勬壆绻佹繛鍡忓墲閺嗭拷
					if(alreadynum < maxnum) {
						//婵炲备鍓濆﹢浣烘惥閸涙壆绠栨繛鍡忓墲閺嗭拷,缂備綀鍛暰
					} else {
						//MessageMgr.psendMsgNotify(roleid, 170043, null);
						MessageMgr.sendMsgNotify(roleid, 170043, null);
						logger.info("CGetRecruitAward.閻熸瑦甯熸竟濂�" + roleid + "]闁告垵妫楅ˇ顒侊紣閸℃绲块悷娆愬笩婢瑰カ" + recruitrole + "]闁归攱绋戠�氭瑧绮垫径宀勭崜闁汇劌瀚〃娑㈠礉閹插绀夊ù锝呮濠�浼村川閵娿儱鍤掔紓浣哥箺缁夊瓨娼婚崶顒夋殭闁告瑦鐗楅濂稿极妫颁胶鐟愰梻锟�?(" + maxnum + ")闁挎稑濂旂粭澶嬪濮樺啿绠�电増顨堥妵婊堟偋閳哄纾�");
						return;
					}
				} else {
					//濞戞挸绉靛Σ鎼佸触鐏炶偐顏遍柛锟�?,婵炴挸鎳愰埞锟�(濞戞挸锕ら幊锟�)闁告ê妫楄ぐ鑸碉紣閸℃绲挎繛鍡忓墲閺嗭拷
					new mkdb.Procedure() {
	    				@Override
	    				protected boolean process() {
	    					logger.info("CGetRecruitAward.閻熸瑦甯熸竟濂�" + roleid + "]闁告垵妫楅ˇ顒侊紣閸℃绲块悷娆愬笩婢瑰カ" + recruitrole + "]闁归攱绋戠�氭瑧绮垫径宀勭崜闁汇劌瀚〃娑㈠礉閹插绀夐悹鎭掑妼閵囧绂嶉崱顓犵婵炴挸鎳愰埞鏍储閸℃钑夊Λ鏉挎瑜板洤鈻庨埄鍐╂闁匡拷?");
	    					xbean.RecruitAward srcra = xtable.Rolerecruitaward.get(roleid);
							if(srcra == null){
								logger.error("CGetRecruitAward.閻熸瑦甯熸竟濂�" + roleid + "]闁归攱绋戠�氭獰db闁轰胶澧楀畵涔秛ll!");
	    						return false;
							}
							srcra.setGetnum(0);
	    					return true;
	    				}
					}.submit().get();
				}
				MyRecruitAwards mra = ConfigManager.getInstance().getConf(MyRecruitAwards.class).get(awardid);
				if(mra == null) {
					logger.info("CGetRecruitAward.閻熸瑦甯熸竟濂�" + roleid + "]闁告垵妫楅ˇ顒侊紣閸℃绲块悷娆愬笩婢瑰カ" + recruitrole + "]闁归攱绋戠�氭瑧绮垫径宀勭崜闁汇劌瀚〃娑㈠礉?:" + awardid + ",濞达絽妫濋崢銈囩磾椤旀槒绀嬬紒宀�灏ㄧ槐锟�");
					return;
				}
				final String buildurl = String.format(
						"http://%1$s%2$s?serverid=%3$s&roleid=%4$s&new_serverid=%5$s&new_roleid=%6$s&prize_type=%7$s&amount=%8$s",
						address, func2, serverid, roleid, recruitserver, recruitrole, 0, mra.getLevel()); //濠靛倹鐗曟慨宕囩尵鐠囪尙锟界rize_type=0缂佹稑顦辨锟�
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

