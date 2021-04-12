
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
		
		Team temp = TeamManager.selectTeamByRoleId(roleid); //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠為柟钘夊�婚敓鏂ょ秵閸犳牠鎮欐繝鍐︿簻闁瑰搫绉剁拹鐗堜繆椤愩垹鏆欓柍瑙勫灴閹瑥顔忛鍏碱啀婵＄偑鍊栫敮鐔轰焊濞嗘垶顫曢柣鎰嚟閻熷綊鏌ㄩ悢缁橆棄妞ゆ洩缍侀、鏇㈡晝閿熺晫澹曟總鍛婄厽闁归偊鍘界紞鎴︽煟瑜嶇�氼厾鎹㈠┑瀣潊闁挎繂鎳愰崢顐︽⒑閹稿海顣茬紒缁樼洴瀹曠厧鈹戦崟顐″垝闂備礁鎼惌澶屽緤妤ｅ啫绠氶柡鍐ㄧ墛閺咁剟鏌涢弴銊ュ箺婵炲牜鍨跺缁樻媴娓氼垳鍔稿┑顔斤公闂勫嫮绮嬪澶樻晢闁告洦鍓氬▍銏ゆ⒑閸忛棿鑸柛搴ㄤ憾瀹曠敻顢楅崟顒傚幈闂佹寧绻傜换鎺旂矓椤旂瓔娈介柣鎰絻閺嗘瑩鏌ｉ敐蹇曠瘈妤犵偛绉归幖褰掝敃閿濆棙绶梻鍌欐祰椤曆囧礄閻ｅ瞼绀婇柛鈩冪☉绾惧鏌涢弴銊ュ妞も晝鍏橀弻宥夊传閸曨剙娅ら梺鎶芥敱閸ㄥ潡骞冭ぐ鎺戠畳闁圭儤鍨甸‖鍫濃攽閻愬弶鍣洪柛鏃�鐟╁濠氭偄閻撳海顦╅梺闈涚墕濡顢旈敓锟�? by 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达絿鐡斿鎰版煕鎼淬倖鐝柡鍛板煐閹棃鏁愰崪浣诡棥闂備礁鍚嬫禍浠嬪磿閺屻儱鐭楅煫鍥ㄦ煣缁诲棙銇勯弽銊︾殤濞寸姰鍨介弻锝夊箻閺夋垵顫掗梺鍝勭焿缂嶄線鐛锟介幊鐘活敆閸屾粌搴婇梻鍌欑閹碱偊寮甸鍕剮妞ゆ牗绋愮换鍡涙煟閹寸姷鎽傞柡浣革躬閺岋綁骞橀崘鑼О濠电偤妫跨划娆忣潖缂佹ɑ濯村〒姘煎灣閸斿憡淇婇妶鍥㈤柟鑺ョ矌閸掓帡寮崶銉ゆ睏闂佸湱鍎ら崹濂稿箺閺囩偐鏀介柣鎰綑閻忕喖鏌涢妸銉﹁础缂侇喖顭烽幖褰掝敃閵堝洨妲囬梻鍌氬�搁悧濠勭矙閹烘挸绶為柛鏇ㄥ灡閻撶喐绻濋棃娑氬闁稿绠痝hao
		if(temp != null && temp.isNormalMember(roleid) ){
			return;
		}
		if(mapid==fire.pb.clan.ClanUtils.MAPID){ //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垹绠婚悗闈涙啞閸Ｑ冾渻閵堝棙绌跨紒韫矙閹箖鏁撻悩宕囧姺闂佹寧妫佸Λ鍕儊濠婂牊鈷掑〒姘炬嫹婵炰匠鍥ㄥ亱闁糕剝銇傚☉妯锋婵炲棙鍔栭悵宄邦渻閵堝棗绗掗悗姘煎弮閹繝鎮╃紒妯煎幗闂佺粯鏌ㄩ幉锛勬閺屻儲鐓冮梺鍨儐椤ュ牓鏌＄仦璇诧拷鏍Χ閿旇棄绶炵紒瀣閸庢挾绱撻崒娆愮グ濡炴潙鎽滈弫顕�骞掗弴鐘辫埅闂傚倷绀侀崥瀣矈閹绢喖鐤鹃柍鍝勬噹閻ゎ噣骞栧ǎ顒�濡介柍閿嬪笒闇夐柨婵嗘噺閸熺偤鏌涢悢鍝勪槐闁哄矉缍侀幃銏ゅ级閹存繂袝闂佽姤蓱缁诲啴濡甸崟顖氬唨妞ゆ劦婢�缁墎绱撴笟濠冨婵犮垼鍩栭崝鏍偂韫囨稒鐓曟い鎰剁悼缁犳牗銇勯妷褍啸缂佽鲸甯￠崺銉╁川椤旂⒈浼撻梻鍌氬�搁崐宄懊归崶褉鏋栭柡鍥ュ灩缁愭锟藉箍鍎卞ú銈夊垂濠靛洨绠鹃柛鈩兩戠亸鐢碉拷瑙勬尫閻掞箓骞堥妸銉庢梻锟斤綆鍋勯鑸典繆閻愵亜锟芥垿宕瑰ú顏呭仭闁冲搫鎳庣粻鐘绘煛瀹ュ骸骞栭柣鎾寸☉閵嗘帒顫濋濠冩暰闁诲孩鑹剧紞濠囧蓟閵娾晜鍋嗛柛灞剧☉椤忥拷? by 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濠电姴楠告禍婊勭箾鐠囇冾洭缂侇喗鐟╅獮瀣偐瀹割喗顥￠梻浣侯潒閸曞灚鐣烽梺缁樻尭缁绘﹢寮诲☉銏╂晝闁挎繂娲ㄩ悾娲⒑闂堚晝绋诲┑鐐诧躬瀵鏁嶉崟鑸靛闁挎繂绨肩花浠嬪极閸儲鈷戦柛婵嗗濠�鐗堢箾閼碱剙鏋庨柣锝囧厴閹剝鎯斿Ο缁樻澑闂備礁缍婇崑濠囧储濠婂牊鏅濋柛灞剧▓閹峰搫鈹戦悙璺鸿敿妞ゆ泦鍥╁祦婵°倓闄嶆禍婊堟煏婵炲灝鍔甸棅顒夊墰閿熻姤顔栭崰娑㈩敋瑜旈崺銉﹀緞閹邦剦娼婇梺鍐叉惈閸婄懓鈻嶉崶顒佲拻濞撴熬鎷锋繛浣冲洦鍋嬮柛鈩冪☉缁犵娀鐓崶銊р檨闁稿﹦鏁婚弻娑㈠箻濡わ拷閹虫劙鏁嶅┑鍥╃閺夊牆澧界粔顔界箾娴ｅ啿瀚换鍡涙煟閿濆懐鐒块柟椋庡厴閹倿宕ㄦ繝鍌や紦闂傚倷绀佺紞濠偽涚捄銊х焼濞达綀娅ｆ稉宥夋煛瀹ュ骸浜濋柛鐘冲姍閺岋絽螖閿熶粙鎮ч崱娆戠當闁圭儤姊荤壕濂告煟濡櫣锛嶉柍鍙ョ窔閺屾洟宕惰椤忣厾锟芥鍠曠划娆愪繆濮濆矈妲鹃梺鍛婄懄缁诲倿鍩為幋锔绘晩婵炲棛鍋撶紞鍫濐渻閵堝啫濡奸柟铏耿瀹曟椽鎮欓崫鍕吅闂佹寧妫佸Λ鍕晸閻ｅ苯鍘撮柡灞诲�楅崰濠囧础閻愬樊娼绘俊鐐�戦崐褔骞忛悜鑺モ拻闁稿本鐟чˇ锕傛煙鐠囇呯瘈闁诡喚鏌夐ˇ瀵哥磼椤旇棄鍝洪柟顔肩埣璺痪鎯у焻ao
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷褰掑磿閹寸姵鍠愰柣妤�鐗嗙粭鎺楁煛閸曗晛鍔﹂柡灞剧洴瀵挳濡搁妷褌鍝楅梻浣规偠閸斿矂宕愰幖浣哥厴闁硅揪绠戠壕鍏肩節婵犲倹鎹ｉ柛鏂挎憸缁辨挻鎷呴悷鏉款潔濡炪們鍔屽Λ娆戠矚鏉堛劎绡�闁搞儺鐏涜閻擃偊宕堕妸锔惧弳濡炪倕绻愰悥鐓庮潖濞差亜绀傞柣鎾冲瘨閸ゅ姊洪崨濠冣拹闁荤啿鏅涢锝嗙節濮橆厼浜滈梺缁樻尭濞寸兘鎮炬ィ鍐┾拺缂備焦锕╁▓鏃堟煟濡や胶鐭婇摶鐐烘煕閺囥劌鐏￠柍閿嬪灴閺屾盯鏁傜拠鎻掔闂佹悶鍊ч幏鐑芥⒒娴ｈ櫣甯涢柣妤佹礋婵″墎绮欏▎鎯ф婵犵數濮甸懝楣冩倿濞差亝鐓曢柟鎵虫櫅婵¤法绱掗幇顔间槐闁哄矉绲鹃幆鏃堫敍濠婂憛锝嗙箾鐎涙鐭婇柣鏍帶閻ｇ兘鎮界喊澶嬪闁挎繂楠告晶鎵棯閹规劖顥夐棁澶愭煥濠靛棙绁╅柣鎺楃畺閺屻劑鎮㈢拠娈嬫捇鏌熼鐓庯拷鍧楃嵁閸愵収妯勫Δ鐘靛仦椤洭骞忛悩缁樺殤妞ゆ帒鍊瑰В鍥⒑閼姐倕鏋戠紒顔煎閺呰泛螖閸愨晜娈伴梺鍦劋閹告悂顢氶柆宥嗙厽婵☆垵鍋愮敮娑㈡煟閹惧瓨绀嬮柡宀嬬節瀹曞爼濡烽妷銉�虫俊銈囧Х閸嬬偤銆冩繝鍥ц摕闁挎繂妫欓崕鐔搞亜閺傚灝鎮戦柣蹇撶墦濮婅櫣锟藉湱濯鎰版煕閵娿儲鍋ユ鐐插暙閳诲酣骞橀弶鎴炵杺闂傚倸鍊搁悧濠勭矙閹烘鐓ユい鎾卞灪閳锋帒霉閿濆洤鍔嬮柛銈忔嫹闂備焦鎮堕崐鏍偋閻樿崵宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘
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

