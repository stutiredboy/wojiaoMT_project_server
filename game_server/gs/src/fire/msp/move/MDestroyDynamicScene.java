
package fire.msp.move;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __MDestroyDynamicScene__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class MDestroyDynamicScene extends __MDestroyDynamicScene__ {
	@Override
	protected void process() {
		// protocol handle
		if (scenetype == fire.pb.move.DynamicSceneType.DREAMLAND_SCENE) {
			for (Long roleid : roleids) 
			if (fire.pb.mission.Module.getInstance().hasUnfinishedFairylandMission(roleid)>0) {
				     //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌ょ喊鍗炲⒒闁哥喎娲缁樻媴缁嬫寧姣愰梺鍦拡閸嬪﹪鐛繝鍐╁劅闁靛鍎遍悗顓㈡⒑缁嬭法鐏遍柛瀣仱閹繝寮撮悢鍓佺畾闂侀潧鐗嗛幊搴ㄥ汲濞嗘挻鐓曢柟鐐綑閳绘洟鏌＄仦璇诧拷婵嗩嚕閸撲焦宕夐柕濞垮�涘鎼佹⒒閸屾碍鎼愭い锔炬暬瀵鏁愭径濠勵啋闂佹儳娴氶崑鍛暦閹惰姤鈷戦柛锔诲幗濞呮洖鈹戦悜鍥ㄥ闂備礁鎼惌澶岀礊娓氾拷閻涱喖鈻庨幘宕囶槹濡炪倖甯幏閿嬨亜韫囥儲瀚�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ姀鐘差棌闁轰礁锕弻鈥愁吋鎼粹�崇闂傚倸鍋嗛崹閬嶅Φ閸曨垰鍐�闁靛ě鍛帎缂傚倷娴囩紙浼村磹閺囥垹鐓橀柟杈剧畱绾惧吋鎱ㄥ鍡楀箹闁哄棗鐗撳铏圭矙閸栤�充紣濠电偟銆嬬换婵嗩嚕婵犳艾惟闁宠桨绀佸畵鍡楊渻閵堝懐绠伴柟鍐查叄椤㈡棃鎳滈崗鍝ョ畾闂佺粯鍔︽禍婊堟晸婵劕锟芥牜绮嬪鍜佺叆闁割偅绻勯弻鍫ユ⒑閸濆嫷妲归柛銊ョ秺瀵娊鏁冮崒娑氬幍闂佺粯鍨堕敋闁绘帞鍋撶换娑氫焊閺嶃劍鐝氶梺鍝勭焿缂嶄線鐛锟藉畷妯侯啅椤旂厧唯濠碉紕鍋戦崐鏍箰閹间焦鍊舵繝闈涱儏閻撴﹢鏌熺�电浠滅紒鐘靛█濮婅櫣绮欑壕鏇熺洴瀹曞爼濡搁姀鈥崇槺闂傚倷绀侀幉鈥趁洪敃鍌氬瀭濠靛倻顭堥弸渚�鏌涢弴銊ュ缂佺娀绠栭弻娑㈠焺閸忊晜鍨规禍鎼侇敇閻樼數锛濇繛杈剧到瀵泛鈻嶉崨瀛橆梿濠㈣埖鍔栭悡鐔镐繆椤栨粌鍔嬮柍缁樻礋閺屾稒鎯旈姀鐘差潚闂佸搫鏈粙鎾绘晸閺傘倗鍒板褍娴风划鏃堫敋閿熶粙寮婚敍鍕勃闁告挆锟藉Σ鍫ユ⒑鐎圭媭娼愰柛銊ョ仢閻ｇ兘宕￠悙宥嗘⒐缁绘繃鎷呴搹鐧哥幢闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曢敂缁樻櫈闂佸憡绋掑娆撴偪椤斿浜滈柡宥冨妿閻锟借娲栧鍓佹崲濞戙垹绠ｆ繛鍡楃箳娴犺偐绱撴担鍝勭彙闁搞儯鍔庨崢鐢告煟鎼达絾鏆╂い顓炵墦瀹曟粍娼忛妸銈囩畾濡炪倖鍔﹂崜娑㈡偩閸偅鍙忓┑鐘叉噺椤忕娀鏌熸搴♀枅闁搞劍鍎抽悾鐑藉炊閿曪拷閹藉姊婚崒娆戭槮闁硅姤绮撳畷浼村箛椤掑鍔峰┑鐐叉閹稿宕戦埡鍛厽闁硅揪绲借闂佺顑呯�氼噣鎯�椤忓牆绠�癸拷閸曨偅鎳欓梻浣告惈閹锋垹绱炴担鍓叉綎闁惧繐婀辩壕鍏间繆椤栨稒銇熸慨濠傜仢閳规垿鎮欓崣澶婄彅缂備浇寮撶划娆撳箖妤ｅ啯鍊婚柦妯侯樀閸炲爼姊洪崫鍕窛闁哥喎娼￠獮蹇曠磼濡偐顔曢柡澶婄墕婢т粙宕氶悧鍫㈢瘈闁跨喍绮欏畷锟犳倻閸ヮ亷鎷烽崹顔氬綊鎮╁顔煎壉闂佺粯鎸诲ú鐔煎蓟閿熺姴纾兼繝闈涙川閵嗗﹪姊虹拠鑼濞存粌鐖煎濠氬Ω閳哄倸浜滈柣鐘叉处閻ｎ偊骞樼紒妯煎幈闂佺懓鐡ㄧ换鍕矓閾忕櫢鎷风憴鍕缂侇喖鐭傞崺銏℃償閵娿儳顔掗柣搴㈢♁钃遍柣婵囩墵濮婄粯绗熼敓钘夘焽瑜忛幑銏ゅ醇閵夈儳锛欓梺鍝勬川婵攱绋夊鍥╃＝濞达綁顎囧鍕洸婵犲﹤鐗婇悡娑㈡煕閹扳晛濡藉璺哄閵囧嫰濡烽妷顔叫х紓浣虹帛閻╊垰鐣锋總鍛婂亜鐎瑰嫰鍋婂鎾翠繆閻愵亜锟姐倖绂嶅鍫濈柈閻庢稒眉缁诲棝鏌涢锝嗙妤犵偑鍨虹换娑㈠幢濡や胶顩板┑鐐层偢閺�杈╂崲濠靛棌鏋旈柛顭戝枟閻忓秹鏌ら崹锕�娲﹂悡鏇㈡煛閸愭寧瀚归梺鎼炲妿閺佸銆佸鑸垫櫜濠㈣泛锕﹂鍛存⒑閼恒儍顏埶囨潏顭戞闁搞儺鍓氶悡娆撴煟閹捐櫕鎹ｉ柟鐣屽█閺岀喓绮欏▎鍓у悑闂佹寧绻勯崑娑㈩敇閸忕厧绶為悗锛卞嫬顏归梻浣藉吹閸犳劙鎮烽妷褝鎷峰鐓庡⒋鐎规洘绻堟俊鍫曞炊閳哄偊绱＄紓鍌氬�烽梽宥夊垂瑜版帞宓佹俊銈呮噺閻撶喐淇婇妶蹇斿闁诲孩绋堥弲婵嬪箲閵忕姭鏀介柛鈾�鏅涘▓顐︽⒑閸濆嫷鍎涢柛瀣閺佹捇鎳為妷锔绢槹闂佽鍨伴崯鎾箖濠婂吘鐔兼⒐閹邦喚娉垮┑锛勫亼閸婃牠骞愭ィ鍐ㄧ；闁绘柨鎲″▍鐘绘煥閺囩偛锟藉綊鎮￠妷锔剧瘈闂傚牊绋撴晶鏇灻归悩顐ｆ珖缂佽鲸甯￠幃鈺佺暦閸ワ絾顫嶉梻浣哥枃濡嫰藝椤栫偛鐓濋幖娣妼缁犳稒銇勯幘璺盒㈢紒鎻掓健濮婂宕掑顒婃嫹瀹勬噴褰掑炊瑜夐弸鏍煛閸ャ儱鐏╃紒鎰殘閿熻棄绠嶉崕鍗灻洪妶澶婂瀭婵犻潧娲ㄧ粻楣冩煕閳╁叐鎴犱焊椤撶喐浜ゆ繝闈涱儐閳锋垹绱掔�ｎ厽纭堕柣蹇涗憾閺屾稓锟斤綆鍓欐禒杈╋拷娈垮枟閻擄繝鐛弽銊﹀闁革富鍘煎鎶芥⒒娴ｈ櫣甯涙繛鍙夌墵瀹曟劙宕烽銊﹀婵鍋撶�氾拷,闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绉柡宀嬬到铻ｉ悹鍥ㄥ絻椤亪姊虹粙娆惧剭闁告梹鍨甸～蹇涙惞鐟欏嫬纾梺闈涱焾閸庢煡鎮甸姀銈嗏拺闁荤喐婢樺▓鈺呮煙閸戙倖瀚�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣銏犲閺佸﹪鏌″搴″箹缂佹劖顨嗘穱濠囧Χ閸涱喖娅濋梺璺ㄥ枑閺嬭崵绮婚幘宕囨殾濠靛倸鎲￠崑鍕�掑鐓庣仭闂佽￥鍊栨穱濠囨倷椤忓嫸鎷烽弽顐ｆ殰闁圭儤妫戦幏宄邦潩閻撳骸鈷嬮梺璇″灠閼活垵鐏冮梺鍛婁緱閸犳岸宕ｉ崱娑欌拺缂備焦蓱閻撱儱顭胯闁帮綁骞嗙仦瑙ｆ瀻闁规儳顕崢鎼佹倵閻у憡瀚归柣搴秵閸撴稖鎽梻鍌欐祰椤曟牠宕归崡鐐嶆盯宕橀鍏肩�悗骞垮劚椤︻垳绮堢�ｎ偁浜滈柟鎹愭硾閺嬫垶銇勯弬鎸庮棦婵﹤顭峰畷鎺戔枎閹存繂顬夐梻浣筋嚃閸犳牠鎮ラ悡搴ｆ殾婵犻潧妫崥瀣煕濠婏拷閻掞妇锟介潧鐭傚娲嚍閵夊喚浜棟闂侇剙绉村Ч鏌ユ煥閺囩偛锟藉綊鎮￠弴鐔虹瘈闂傚牊绋掗ˉ婊勩亜韫囧锟芥牗绌辨繝鍥х闁圭儤鏌ㄩ·锟介梻渚�锟芥稓鈹掗柛鏂跨焷閻忔帡姊洪崨濠勭畵閻庢凹鍨跺畷娲倷閻戞ê锟界敻鎮峰▎蹇擃仾缂佸苯娼￠弻鐔煎礄閵堝棗顏�?
					fire.pb.mission.SFairylandStatus sds = new fire.pb.mission.SFairylandStatus();
					sds.status = fire.pb.mission.FairylandStatus.LANDABSENT;
					if (mkdb.Transaction.current()==null) 
					    gnet.link.Onlines.getInstance().send(roleid, sds);
					else 
						mkdb.Procedure.psendWhileCommit(roleid, sds);
				
			}else {//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸缂備礁顑嗙敮锟犲极瀹ュ绫嶉柛顐ゅ枔閸橀箖姊洪崫鍕垫Ъ婵炲娲樼粋鎺楀閵堝棭姊挎繝銏ｅ煐閸旀牠鎮￠妷锔剧瘈闂傚牊绋掗ˉ鐐烘煕閿濆牜娼愰柕鍥у婵＄兘濡疯椤斿绱撴担铏瑰笡闁烩晩鍨伴悾宄拔旈崨顔兼異闂佸疇妗ㄧ拋鏌ュ箯娴煎瓨鈷掑ù锝呮啞閹牓鎮跺鐓庝喊鐎规洘绻堥獮瀣攽閹邦剚顓块梻浣告贡閾忓酣宕抽锟藉顐﹀磼閻愬鍘卞┑鐐村灥瀹曨剙顕ｉ幆顬″綊宕楅崗鐓庣闂佸疇顫夐崹鍧楀极瀹ュ绀嬫い鎰ㄥ墲濠拷闂傚倷鑳堕…鍫ｅ櫣闂佸憡渚楅崢鍓х驳韫囨梻绡�闁汇垽娼ф牎闂佽偐鎳撴晶鐣屽垝閸喎绶炵�癸拷鐎ｎ偄顏跺Δ鐘靛仜閻忔繈宕濆顓犵閻忕偛鍊告慨鍌炴煙椤栨碍婀扮�垫澘瀚伴獮鍥敇閻樻彃绠ラ梻鍌欒兌缁垶宕归幆鐗堟噷闂備焦濞婇弨閬嶅礉濞嗘挸绠栨俊銈忔嫹妞ゎ偅绻堥、姗�鎮欓崣澶嬪殘闂傚倷绀侀幖顐︽儔婵傜绐楅柟鎹愬煐椤洟鏌熼悜妯烘闁绘柨鎲℃慨婊堟煛婢跺﹦浠㈤柣蹇庣閳规垿鎮╅崹顐ｆ瘎闂佺顑囬崰鏍ㄤ繆鐎甸潻鎷烽敐搴℃灈缂佺媭鍨堕弻銊╂偆閸屾稑顏�
				fire.pb.mission.SFairylandStatus sds = new fire.pb.mission.SFairylandStatus();
				sds.status = fire.pb.mission.FairylandStatus.LANDOUT;
				if (mkdb.Transaction.current()==null) 
				    gnet.link.Onlines.getInstance().send(roleid, sds);
				else 
					mkdb.Procedure.psendWhileCommit(roleid, sds);
			}
		}
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 724913;

	public int getType() {
		return 724913;
	}

	public long sceneid; // 场景模块创建的场景ID
	public long ownerid; // 副本的所有者ID(可能是角色ID,也可能是团体ID)
	public int scenetype; // 副本场景的类型，如果为0，表示为静态场景
	public java.util.LinkedList<Long> roleids; // 副本销毁时被强行踢出副本的roleid

	public MDestroyDynamicScene() {
		roleids = new java.util.LinkedList<Long>();
	}

	public MDestroyDynamicScene(long _sceneid_, long _ownerid_, int _scenetype_, java.util.LinkedList<Long> _roleids_) {
		this.sceneid = _sceneid_;
		this.ownerid = _ownerid_;
		this.scenetype = _scenetype_;
		this.roleids = _roleids_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(sceneid);
		_os_.marshal(ownerid);
		_os_.marshal(scenetype);
		_os_.compact_uint32(roleids.size());
		for (Long _v_ : roleids) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		sceneid = _os_.unmarshal_long();
		ownerid = _os_.unmarshal_long();
		scenetype = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			long _v_;
			_v_ = _os_.unmarshal_long();
			roleids.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof MDestroyDynamicScene) {
			MDestroyDynamicScene _o_ = (MDestroyDynamicScene)_o1_;
			if (sceneid != _o_.sceneid) return false;
			if (ownerid != _o_.ownerid) return false;
			if (scenetype != _o_.scenetype) return false;
			if (!roleids.equals(_o_.roleids)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)sceneid;
		_h_ += (int)ownerid;
		_h_ += scenetype;
		_h_ += roleids.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(sceneid).append(",");
		_sb_.append(ownerid).append(",");
		_sb_.append(scenetype).append(",");
		_sb_.append(roleids).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

