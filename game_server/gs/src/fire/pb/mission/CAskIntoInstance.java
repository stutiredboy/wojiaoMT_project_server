
package fire.pb.mission;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

import fire.pb.mission.instance.PEnterInstanceMap;
import fire.pb.talk.MessageMgr;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAskIntoInstance__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAskIntoInstance extends __CAskIntoInstance__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		mkdb.Procedure askIntoInst = new mkdb.Procedure() {
			@Override
			protected boolean process()	{
				Long teamid = xtable.Roleid2teamid.select(roleid);
				if (teamid == null)
					return false;
				
				fire.pb.team.Team team = fire.pb.team.TeamManager.getTeamByTeamID(teamid);
				if (team == null)
					return false;
				
				final java.util.ArrayList<Long> roleids = new java.util.ArrayList<Long>();
				roleids.addAll(team.getNormalMemberIds());
				this.lock(xtable.Locks.ROLELOCK, roleids);
				
				xbean.InstanceAskInfo askInst = xtable.Instanceaskinfos.get(teamid);
				if (askInst == null)
					return false;
				
				if (!askInst.getAnswerinfo().containsKey(roleid)) {
					return false;
				}
				
				if (answer == 0) {
					askInst.getAnswerinfo().put(roleid, 0);
					String roleName = xtable.Properties.selectRolename(roleid);
					if (roleName == null)
						return false;
					List<String> para = new ArrayList<String>(1);
					para.add(roleName);
					for (Long rid : roleids) {
						if (rid != roleid) {
							MessageMgr.psendMsgNotifyWhileCommit(rid, 160211, para);
						}
					}
					
					/*if (insttype == 0) {
						ScheduledFuture<?> future = fire.pb.mission.instance.InstanceManager.askInstFuture.get(teamid);
						if (future != null) {
							future.cancel(true);
							fire.pb.mission.instance.InstanceManager.askInstFuture.remove(teamid);
						}
					}
					else if (insttype == 1) {
						ScheduledFuture<?> future = fire.pb.mission.instance.line.LineInstManager.askInstFuture.get(teamid);
						if (future != null) {
							future.cancel(true);
							fire.pb.mission.instance.line.LineInstManager.askInstFuture.remove(teamid);
						}
					}
					
					xtable.Instanceaskinfos.remove(teamid);*/
					
					SAnswerInstance answerInst = new SAnswerInstance();
					answerInst.roleid = roleid;
					answerInst.answer = 0;
					mkdb.Procedure.psendWhileCommit(roleids, answerInst);
					
					return true;
				}
				
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬪銈冨灪閻熲晠骞冮埄鍐╁劅妞ゆ棁濮ょ粊浼存⒒閸屾艾锟界兘鎮為敂鐣岀濠电姴娲ょ紒鈺呮⒑椤掞拷缁夊绮婚弻銉︾厱闁靛鍠栨晶顕�鏌﹂崘顏勬灈闁哄被鍔岄埞鎴﹀幢閳哄倐锕�鈹戦埥鍡椾簼闁挎洏鍨藉璇测槈閳垛晪鎷烽敃鍌氱婵犻潧娲ㄨぐ顖炴⒒娴ｅ憡鎯堟俊顐㈤叄瀹曞綊鎳￠妶鍡╂綗闂佽鍎抽顓㈡偡閻熸壋鏀介柣妯诲絻閺嗘瑦銇勮箛姘【闁宠鍨块幃鈺呭垂椤愶絾鐦庡┑鐘愁問閸犳牠鎮洪妸褝鎷烽棃娑栧仮鐎规洏鍔庨敓鑺ョ♁閿氬ù鐙�鍙冨缁樼瑹閸パ冧紟婵犵锟借櫕鍠樼�规洩缍佸畷鍗炩槈濞嗗本瀚奸梻浣告啞缁嬫垿鏁冮敐鍥偨闂侇剙绉甸悡鏇熶繆椤栨碍鎯堥柟顔藉灥鑿愰柛銉戝秴浼愰柣鎾卞�栭妵鍕疀閹炬潙娅濋梺褰掓敱濡炶棄顫忓ú顏勫窛濠电姴瀚悾鐢告煟鎼淬垹鍤柛娆忓暢濡垽姊虹紒姗嗙劷缂侇噮鍨堕幃锟犲即閵忥紕鍘藉┑鈽嗗灥濞咃綁鏁嶅鍜佺唵鐟滄粍绂嶅┑瀣﹂柛鏇ㄥ灠閸楄櫕銇勮箛鎾搭棤鐞氾箓鏌ｆ惔銈庢綈婵炲弶鐗滅槐鐐寸節閸ャ儻鎷锋笟锟藉鎾閻欙拷濞煎﹪姊洪棃娑氱疄闁搞劏顕ч悾鍨瑹閿熻棄顫忕紒妯诲缂佹稑顑呭▓顓㈡⒑閸涘﹤鐏╅柡鍜佸亞濡叉劙鎮欓崫鍕�垮┑鐐村灦椤洭鏁嶅☉銏♀拺闁革富鍘兼禍楣冩煙椤栨俺瀚伴柍缁樻尰缁傛帞锟斤綆鍓欒ぐ鍕⒑閹肩偛鍔橀柛鏂块叄閸╋附绗熼敓浠嬪蓟瀹ュ鐓ラ悗锝庝簽娴煎矂姊洪崫鍕拱缂佸鍨块崺銉﹀緞婵犲孩寤洪梺鍓插亝缁诲倿锝為悩缁樷拻濞达絿鍎ら崵锟介梺鍝ュ枙濞夋洟鏁撻懞銉х叝闁告鍟块锝嗙節濮橆儵鈺呮煏婢舵ê鏋熼柛宥囨暬濮婃椽宕楅崗鐓庯拷鎰箾娴ｅ啿娲﹂弲鎼佹煟閿濆懏婀伴柡鍡忔櫊閺岋綁濡烽濠氬仐閻庢鍠涘▔娑㈠煝鎼淬劍鍊锋い鎴�ら崶銊у幗闁瑰吋鐣崹濠氬疮閺屻儲鐓欓柛鎴欏�栫�氾拷
				if (askInst.getAnswerinfo().size() != roleids.size()) {
					for (Long rid : roleids) {
						MessageMgr.psendMsgNotifyWhileCommit(rid, 166057, null);
					}

					if (insttype == 0) {
						ScheduledFuture<?> future = fire.pb.mission.instance.InstanceManager.askInstFuture.get(teamid);
						if (future != null) {
							future.cancel(true);
							fire.pb.mission.instance.InstanceManager.askInstFuture.remove(teamid);
						}
					}
					else if (insttype == 1) {
						ScheduledFuture<?> future = fire.pb.mission.instance.line.LineInstManager.askInstFuture.get(teamid);
						if (future != null) {
							future.cancel(true);
							fire.pb.mission.instance.line.LineInstManager.askInstFuture.remove(teamid);
						}
					}
					
					xtable.Instanceaskinfos.remove(teamid);
					return true;
				}
				
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠抽柨鐔凤拷鐕佹綈婵炲弶鐗曠叅闁靛ň鏅滈崕妤呮煕閳╁喚妯呯憸鐗堝笚閺呮煡鏌涢顐簼缂傚秴鐗嗛埞鎴︽倷閸欏娅ф繝娈垮枟閹稿啿锕㈡笟锟藉铏圭磼濡浚浜滆灒濠电姴娲ょ壕鍧楁煙閹殿喖顣奸柣鎾存礋閹鏁愰崨顓熷�庨梻渚囧弾閸ㄥ爼寮婚敍鍕勃闁告挆鍕灡闂備胶纭堕弲娑氾拷姘緲閻ｅ嘲顫滈敓钘夌暦濠婂棭妲绘繝娈垮枟濡炶棄顫忕紒妯诲闁告縿鍎荤槐鐐电磽娓氬洤娅橀柛銊﹀閻忓姊洪崨濠傚Е闁哥姵鐗犻幏鎴︽偄閸濄儳顔曢梺鐟邦嚟閸婃垵顫濈捄铏瑰摋婵炲濮撮鍡涙偂閺囥垺鐓冮柍杞扮閺嬨倖绻涢崼娑樼仼闂囧鏌ｅΟ鍨惞闁伙絿鍎ら幈銊︾節閸涱噮浠╃紓渚囧枟閻熲晛鐣烽悩缁橆�愰梺鍛婂嚬閸嬪懐鎹㈠☉姘炬嫹濞戞瑯鐒介柣顓烇躬閺岋綁寮介銏犱粯濡炪倖娲╃徊鍓ф崲濠靛棭娼╂い鎾跺仒缁ㄥ姊绘担渚劸缂佺粯鍔欏畷銉э拷锝庝簴閺嬪秹鏌曡箛瀣拷鏍煕閹达附鍋ｉ柟顓熷笒婵″吋绻涢崨顔煎闁哄瞼鍠栧畷娆撳Χ閸℃浼�?
				SAnswerInstance answerInst = new SAnswerInstance();
				answerInst.roleid = roleid;
				answerInst.answer = 1;
				mkdb.Procedure.psendWhileCommit(roleids, answerInst);
				
				int nNum = 0;
				askInst.getAnswerinfo().put(roleid, 1);
				for (Integer ret : askInst.getAnswerinfo().values()) {
					if (ret == 1) nNum ++;
				}
				
				if (nNum == askInst.getAnswerinfo().size()) {
					xbean.InstanceInfoCol teamLeadreInfoCol = xtable.Roleinstancetask.get(team.getTeamLeaderId());
					if (teamLeadreInfoCol == null) {
						return false;
					}					
					int instanceZoneId = teamLeadreInfoCol.getLastinstanceid();
					
					if (insttype == 0) {
						ScheduledFuture<?> future = fire.pb.mission.instance.InstanceManager.askInstFuture.get(teamid);
						if (future == null)
							return false;
						future.cancel(true);
						
						fire.pb.mission.instance.InstanceManager.askInstFuture.remove(teamid);
						
						new PEnterInstanceMap(team.getTeamId(), instanceZoneId).call();
					}
					else if (insttype == 1) {
						ScheduledFuture<?> future = fire.pb.mission.instance.line.LineInstManager.askInstFuture.get(teamid);
						if (future == null)
							return false;
						future.cancel(true);
						
						fire.pb.mission.instance.line.LineInstManager.askInstFuture.remove(teamid);
						
						new fire.pb.mission.instance.line.PEnterLineMap(team.getTeamId(), instanceZoneId).call();
					}
					xtable.Instanceaskinfos.remove(teamid);
				}
				
				return true;
			}
		};
		
		askIntoInst.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805539;

	public int getType() {
		return 805539;
	}

	public short answer; // 1表示同意, 0表示不同意
	public int insttype; // 0 日常副本; 1时光之穴

	public CAskIntoInstance() {
	}

	public CAskIntoInstance(short _answer_, int _insttype_) {
		this.answer = _answer_;
		this.insttype = _insttype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(answer);
		_os_.marshal(insttype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		answer = _os_.unmarshal_short();
		insttype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAskIntoInstance) {
			CAskIntoInstance _o_ = (CAskIntoInstance)_o1_;
			if (answer != _o_.answer) return false;
			if (insttype != _o_.insttype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += answer;
		_h_ += insttype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(answer).append(",");
		_sb_.append(insttype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAskIntoInstance _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = answer - _o_.answer;
		if (0 != _c_) return _c_;
		_c_ = insttype - _o_.insttype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

