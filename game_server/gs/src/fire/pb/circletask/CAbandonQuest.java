
package fire.pb.circletask;
import java.util.Map;





import fire.pb.circletask.anye.RoleAnYeTask;
import fire.pb.mission.PAbandonScenarioMission;
import fire.pb.mission.Sbukefangqirenwu;
import fire.pb.mission.UtilHelper;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAbandonQuest__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAbandonQuest extends __CAbandonQuest__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		CircleTaskManager.logger.info("闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾叉閻掑﹪鏌曟繛鐐珔缂佺媭鍨堕弻锝夊箣閿濆憛鎾绘煕鐎ｅ墎绉柡灞剧☉閳规垿宕卞Δ濠佺棯闂備浇顕栭崹浼存偋閹捐钃熼柨婵嗩槸缁犲鏌涢幇顖ｅ殝闁归鍏樺畷绋课旈敓浠嬫嫅閻斿吋鐓ラ柣鏂挎惈鏍￠梺鍝勬噽椤牓婀侀梺缁樏Ο濠囧磿韫囨洜纾奸柣妯挎珪閻ㄦ垿鏌熼崣澶屾憙缂佺姵鐩鎾倻閸℃﹩妫ラ梻鍌欐祰椤曟牠宕规總鍛婂�堕柟閭﹀灛娴滃綊鏌熼悜妯诲碍濞存粏顫夌换娑㈠箻閺夋垵姣堥梺鎼炲妽濠㈡﹢鍩㈤幘娲绘晣闁绘棁娅ｉ惁鍫濃攽閻愯尙澧曢柣蹇旂箞瀵悂濡舵径瀣幈闂佺粯蓱閻擄繝宕ｉ崟顖涚厱闁崇懓鐏濋崝婊咃拷鍨緲鐎氫即鐛崶顒夋晢闁告洦鍋呴弳顏堟⒒閸屾瑨鍏岀紒顕呭灦瀵濡搁敂鑺ョ彿闁硅壈鎻徊鍧楁儗閸℃稒鐓ラ柣鏇炲�圭�氾拷.闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕濂告煥閺冨洦顥夋い蹇ユ嫹" + roleid + "]闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ㄩ弮鍥棄闁跨喕妫勫锟犲蓟閵娾晛鍗抽柣鎰嚋閹烽绮欑拠鐐☉铻ｅ┑鍌濇缂嶅﹪寮幇鏉垮窛妞ゆ挆鍕垫闂傚倷鐒﹂幃鍫曞磹閺嶎灐娲偄閻撳氦鎽曞┑鐐村灟閸ㄥ湱绮诲☉銏″�堕柣鎰煐椤ュ銇勮箛濠冩珚妤犵偞鐗犲鍫曞箣椤栨繂鎯堟繝娈垮枛閿曘儱顪冮挊澹╂盯宕橀鑲╁幐闂佺鏈崙瑙勫閿燂拷?:" + questid);
		if(questid == 1080000) {
			//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾叉閻掑﹪鏌曟繛鐐珔缂佺媭鍨堕弻锝夊箣閿濆憛鎾绘煟閹惧鎳勯柕鍥у瀵�燁槼妞ゃ儲绮撻弻鐔兼惞椤愩垹顫掗梺杞扮缁夊綊骞冨▎鎾村�绘俊顖炴敱鐎氬ジ姊绘担鍛婂暈缂佽鍊婚敓鑺ュ嚬閸欏啳妫㈤梺缁樺姈閻ｎ亝绂嶅鍫熺厪濠电偛鐏濋崝婊堟煕閵堝懏宸濈�殿啫鍥х閻℃帊绀佺紞濠囧极閹版澘宸濇い鏍ㄧ矋濞堫垰鈹戦悙宸殶濠殿喚鏁搁崰濠傤吋婢跺á锕傛煕閺囥劌鐏犵紒鐘茬－閿熻棄绠嶉崕鍗灻归崒姣硷綁顢氶敓钘夘潖閾忚瀚氶柤纰卞墰椤斿洤鈹戦埥鍡椾簼缂佽鐗嗛锝囨嫚濞村顫嶉梺闈涚箳婵牓濡搁敂杞扮盎闂佸搫鍟崐鐟扳枍閺囩姷纾奸柟閭﹀幗椤ュ牊鎱ㄦ繝鍐┿仢闁诡喚鍏橀獮宥夘敊閻愵剚顔嗛梻鍌欑劍閹爼宕濊箛鎾愭盯宕熼娑樹患閻庣懓瀚竟瀣绩娴犲鍊甸柨婵嗙凹缁ㄨ棄霉閻撳寒鍎旀慨濠冩そ閹虫牠鍩為悙顒�鐝遍梻浣告啞閹稿鎯勯姘辨殾闁规壆澧楅崐鐑芥煟閹寸儐鐒介柛妯圭矙濮婅櫣绱掑Ο鍏煎櫑闂佺懓鍟跨换鎺楁晸閼恒儳鍟查柟鍑ゆ嫹?
			new mkdb.Procedure() {
				@Override
				protected boolean process() {
					RoleAnYeTask rayt = new RoleAnYeTask(roleid);
					rayt.endLegendAnYeTask();
					rayt.refreshAnYeTasks(-1);
					return true;
				}
			}.submit();
			return;
		}
		
		//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜滈～鍛存煏閸繃鍣介柨娑氬枑缁绘盯寮堕幋婵囧�┑鐐插悑閻熝呭垝婵犳艾钃熼柕澶涘閸橆亪妫呴銏℃悙妞ゆ垵鎳橀弫鎾绘嚍閵夛妇顦紓渚囧枛閻楀﹤顕ラ崟顖氱疀妞ゆ挾濮寸敮妤呮⒒娓氾拷濞佳囁囬銏犵鐎癸拷閸曨剙鍓┑鐐叉▕娴滄繈鎮￠悢鍏肩厽闁哄倹瀵ч幉鍝ョ磼閻橀潧浠遍柡宀嬬磿娴狅箓宕滆濡插牓姊虹�圭媭鍤欏Δ鐘崇摃閻忔帡姊洪幆褏绠婚柨鐔诲Г缁嬫帡宕哄☉娆戠瘈闁汇垽娼ф禒婊堟煟鎺抽崝搴ㄥ礆閹烘埈鍚嬮柛銉ｅ妽濞堜即姊洪悙钘夊姕闁告挻宀稿畷鐢稿即閵忥紕鍘繝鐢靛仧閸嬫挸鈻嶉崨顖滅＜闁绘娅曢惃鎴︽煙閸欏鎽冪紒鐘崇洴瀵挳鎮滈崱姗嗘％闂傚倷娴囧▔鏇㈠闯閿曞倸绠柨鐕傛嫹
		if(questid == 205303){
			return;
		}
		Map<Integer,Sbukefangqirenwu> map =  fire.pb.main.ConfigManager.getInstance().getConf(Sbukefangqirenwu.class);
		if(map != null){
			if(map.get(questid) != null){
				fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 141484, null);
				return;
			}
		}
		
		if ( UtilHelper.isBranchScenarioMission( questid ) ) {
			new PAbandonScenarioMission( roleid, questid ).submit();
			return;
		}
		
		new PAbandonCircleTask(roleid, questid).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 807434;

	public int getType() {
		return 807434;
	}

	public int questid; // 放弃的任务id

	public CAbandonQuest() {
	}

	public CAbandonQuest(int _questid_) {
		this.questid = _questid_;
	}

	public final boolean _validator_() {
		if (questid <= 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(questid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		questid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAbandonQuest) {
			CAbandonQuest _o_ = (CAbandonQuest)_o1_;
			if (questid != _o_.questid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += questid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(questid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAbandonQuest _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = questid - _o_.questid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

