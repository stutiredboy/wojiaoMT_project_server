
package fire.pb.mission;

import fire.pb.talk.MessageMgr;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
import fire.pb.util.DateUtil;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqGoto__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqGoto extends __CReqGoto__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0){
			return;
		}
		
		Team temp = TeamManager.selectTeamByRoleId(roleid); //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎽傜�ｎ喖鐐婃い鎺嶇贰濡啫鈹戦悙宸殶妞ゆ帟灏欑槐鐐寸瑹閿熻棄顕ｉ锕�纾奸柣鎰綑閻у嫭绻濋姀锝呯厫闁挎碍绻涢崼婵勫仮闁哄矉绲鹃幆鏃堟晬閸曨厽娈梻浣侯焾濮橈附绂嶉鍕櫢闁兼亽鍎遍崵顒勬煕閿濆繒绉鐐插暙閻ｏ繝骞嶉搹顐ｆ澑闂佽鍑界紞鍡涘磻閸曨剛顩烽柍鍝勬噺閳锋垿鎮归幁鎺戝婵炲懏鍔欓弻鐔煎礄閵堝棗顏�? by 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣筋潐閸庤櫕鏅舵惔锝咁棜闁兼亽鍎查崣蹇斾繆椤栨氨浠㈤柣鎾村姍閺岋綁骞橀懠顒傜崲闂佸搫鏈惄顖涗繆閻戠瓔鏁婇柣鎾冲瘨濞间粙姊绘担渚劸濡ょ姴鎽滅划鏃囥亹閹烘垼鎽曞┑鐐村灟閸ㄥ湱绮婚搹顐ょ瘈闂傚牊绋掓径鍕煟濠靛牊鍋﹏ghao
		if(temp != null && temp.isNormalMember(roleid) ){
			return;
		}
		if(mapid==fire.pb.clan.ClanUtils.MAPID){ //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告噧妞ゆ洩绲介悾锟犳焽閿旇棄鐦滈梻渚�娼ч悧鍡椢涘☉娆愭珷妞ゆ帒瀚悡鐘绘煟閻斿憡绶查柍閿嬫閺屻倖銈︽径绋挎儓缂備浇椴哥敮鎺曠亽闂佸吋绁撮弲鈺呭疮鎼淬劍鈷掑ù锝呮啞閸熺偤鏌ｉ悢鏉戝姦閽樻繃銇勯弽顐粶缂侊拷婢舵劖鐓忛柛顐ｇ箖椤ョ姷绱掗埥鍛闂傚倷娴囧▔鏇㈠窗瀹ュ洤鍨濇繛鍡樻尵瀹撲焦鎱ㄥΔ瀣濡炪們鍨洪悷鈺呭箠閺嶎厼鐓涘〒姘攻鐎氬綊鏌ㄩ悤鍌涘? by 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻濠庡亜濞诧妇绮欓幋鐘差棜闁秆勵殕閻撳繘鏌涢锝囩畺闁革絾濞婇弻锛勶拷锝庝簽鏁堥梺鍝勬湰濞茬喎鐣烽悡搴樻斀闁归偊鍘滈敃鍌涒拺婵炶尪顕ч獮妤併亜閵娿儻韬�殿喛顕ч埥澶愬閳哄倹娅囬梻渚�娼ч悧鍡涘箠韫囨稒鍊甸柛鎾楀懐锛濇繛杈剧秮濞佳勪繆閻ｅ矉鎷烽惂鍛婂闂佸綊妫跨粈浣虹不閺嶎偅鍠愰柣妤�鐗嗙粭鎺旂磼閻樺磭鈾侀柕鍥у瀵粙濡歌閸欐繂鈹戦娆炬綈妞ゃ劌鎳橀崺鐐哄箣閿旇棄锟界兘鏌ょ喊鍗炲妞ゃ倧鎷烽梻鍌欑閹诧繝鎮疯缁岸鎮堕·纾刪ao
			//闂傚倸鍊搁崐鐑芥倿閿曞倹鍎戠憸鐗堝笒閺勩儵鏌涢弴銊ョ仩闁搞劌鍊搁埞鎴﹀磼濠婂海鍔哥紓浣瑰姈椤ㄥ棙绌辨繝鍥ч煫鍥ㄦ煥椤忓爼姊洪崗鐓庮嚋闁告梹鐟╁濠氭偄閻撳海鐣鹃梺缁橆殔閻楁粌螞閸曨垱鈷戦柛锔诲幗閸わ拷闂佺粯鐗曢妶绋款嚕婵犳艾鐒洪柛鎰╁妿缁愮偤鏌ｆ惔顖滅У濞存粌鐖煎畷鐢碉拷锝庡墰绾捐棄霉閿濆浂鐒鹃柨鐔诲Г閹倿骞冭楠炴鎷犻懠顒傛毇闁荤喐绮庢晶妤冩暜閹烘挸顕遍柣妯肩帛閻撴洟鏌￠崶銉ュ妤犵偞顨婇弻锝嗘償椤斿吋鐏堥梺瀹狀潐閸ㄥ潡骞冨▎鎾村殝闂傚牊绋掗柨顓㈡⒒娴ｇ儤鍤�闁搞倖鐗犻獮蹇涙晸閿燂拷
			fire.pb.clan.ClanUtils.enterClanMap(roleid, xpos, ypos);
			return;
		}
		
		final long now = java.util.Calendar.getInstance().getTimeInMillis();
		Long lasttime = xtable.Requestgoto.select(roleid);
		if(lasttime !=null)
		{
			long interval = now - lasttime.longValue();
			if(interval < 1 * DateUtil.ONE_SECOND / 2 * 5){
				MessageMgr.sendMsgNotify(roleid, 162064, null);
				return;
			}
		}
		
		ExecuteReqGoto.trans2Pos(roleid, mapid, xpos, ypos, false);
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				xtable.Requestgoto.remove(roleid);
				xtable.Requestgoto.insert(roleid, now);
				/*if (fire.pb.mission.instance.InstanceManager.getInstance().isInstanceCopy(mapid)) {
					return true;
				}
				
				if (fire.pb.mission.instance.line.LineInstManager.getInstance().isInstanceCopy(mapid)) {
					return true;
				}*/
//				xtable.Role2instancetask.remove(roleid);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805516;

	public int getType() {
		return 805516;
	}

	public int mapid;
	public int xpos;
	public int ypos;

	public CReqGoto() {
	}

	public CReqGoto(int _mapid_, int _xpos_, int _ypos_) {
		this.mapid = _mapid_;
		this.xpos = _xpos_;
		this.ypos = _ypos_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(mapid);
		_os_.marshal(xpos);
		_os_.marshal(ypos);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		mapid = _os_.unmarshal_int();
		xpos = _os_.unmarshal_int();
		ypos = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqGoto) {
			CReqGoto _o_ = (CReqGoto)_o1_;
			if (mapid != _o_.mapid) return false;
			if (xpos != _o_.xpos) return false;
			if (ypos != _o_.ypos) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += mapid;
		_h_ += xpos;
		_h_ += ypos;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(mapid).append(",");
		_sb_.append(xpos).append(",");
		_sb_.append(ypos).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqGoto _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = mapid - _o_.mapid;
		if (0 != _c_) return _c_;
		_c_ = xpos - _o_.xpos;
		if (0 != _c_) return _c_;
		_c_ = ypos - _o_.ypos;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

