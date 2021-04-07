
package fire.msp.npc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import fire.pb.activity.timernpc.TimerNpcService;
import fire.pb.game.SUseXueYueKey;
import fire.pb.map.Npc;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.map.SceneNpcManager;
import fire.pb.scene.movable.NPC;
import fire.pb.talk.MessageMgr;
import fire.pb.util.Misc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GFindNpcWithNpcId__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GFindNpcWithNpcId extends __GFindNpcWithNpcId__ {
	@Override
	protected void process() {
		// protocol handle
		int actId = TimerNpcService.getInstance().getActId(npcid);
		//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ鍝勬倎闁绘帒锕ラ妵鍕疀閹捐泛鈷堥梺杞扮椤戝洭骞夐崨濠冨劅闁靛鍎抽悿鍕⒑闂堟单鍫ュ疾濞戙垺鍋傛繛鎴欏灪閻撴洘绻涢幋婵嗚埞闁哄鍊濋弻娑樷枎韫囨棏妫為梺瀹狀潐閸ㄥ潡骞冨▎鎾崇煑濠㈣埖蓱閿涗線姊哄Ч鍥х労闁割煈浜鏌ユ偐閼碱剚娈鹃梺姹囧灩閹诧繝寮查幖浣圭叆闁绘洖鍊圭�氾拷
		if (actId == -1) {
			return;
		}
		
		boolean findit = false;
		int findmapid = 0;
		int findposx = 0;
		int findposy = 0;
		long npckey = 0;
		
		Role sceneRole = RoleManager.getInstance().getRoleByID(roleid);
		int roleMapid = sceneRole.getMapId();
		
		//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣筋潐婢瑰棙鏅跺Δ鍛；閻庯綆鍠楅悡鏇㈡煃閳轰礁鏋ゆ繛鍫秮閺屻倝鎮ч崼婵愬殝闂侀潧娲ょ�氼垳绮诲☉銏犵闁哄鍨垫禍璺衡攽閻愯尙鎽犵紒顔肩灱缁辩偞绻濋崶褑鎽曢梺缁樻⒒閸樠呯不濮樿鲸鍠愮�广儱顦Ч鏌ュ级閸稑濡稿ù婊勭矒閺屾洟宕煎┑鍥ф闂佹悶鍊曞ú顓㈠蓟閻旂⒈鏁婇柣鎾冲浜涢梻浣哥枃椤曆冾潩閿斿墽涓嶆繛鎴欏灩缁秹鏌熺�电鍓崇紒杈殜濮婂宕掑▎鎴犵崲濠电偠澹堝畷闈涱嚗婵犲洦鍋╃�癸拷閿熺晫绮堟繝鍌楁斀闁绘ê寮堕幖鎰版煢閸愵亜鏋旈柨鐔烘櫕濞呫垽骞忛悜鑺ョ叆闁绘棁顕ц缂備礁鍊圭敮锟犲极閸愵喖纾兼慨妯夸含閺嗕即鏌ｉ悢鍝ョ煁缂侇喖鐭侀悘瀣⒑缂佹ɑ顥嗘繛鍜冪悼婢规洟鎸婃竟婵嗙秺閺佹劙宕ㄩ钘夊壍闁诲孩绋掔换鍫ュ箖濡ゅ啯鍠嗛柛鏇ㄥ墮椤︹晠姊洪崨濠冨暗闁哥姵鐗犻悰顕�宕橀…瀣そ椤㈡棃宕ㄩ绛嬩户闂傚倷娴囧▔鏇㈠闯閿曞倸绠柨鐕傛嫹
		fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		Map<Long, NPC> allNpcInScreens = role.getAllNpcsInScreens();
		for (NPC npc : allNpcInScreens.values()) {
			if (npc.getNpcID() == npcid) {
				findit = true;
				findmapid = npc.getScene().getMapID();
				findposx = npc.getPos().toGridPos().getX();
				findposy = npc.getPos().toGridPos().getY();
				npckey = npc.getNpcKey();
				break;
			}
		}
		
		//闂傚倸鍊峰ù鍥х暦閻㈢绐楅柟閭﹀枛閸ㄦ繈骞栧ǎ顒�鐏繛鍛У娣囧﹪濡堕崨顔兼缂備胶濮抽崡鎶藉蓟濞戞ǚ妲堟慨妤�鐗婇弫鎯р攽閻愬弶鍣藉┑鐑囨嫹闂佸搫鐭夌徊鍊熺亽闂佹儳绻橀敓鑺ョ〒妞规娊姊绘担鍛婃喐濠殿喗娼欒灋婵犻潧顑呴拑鐔哥箾閹存瑥鐏╅柣鎺撴そ閺屾盯骞囬崗鍝ユ寜濠碘剝褰冮悧鍡涘煘閹达附鍊烽柛娆忣槸閻濇梻绱撻崒姘毙＄紒锟芥笟锟介敐鐐剁疀閹句焦妞介、鏃堝礋椤撗冩杸闂傚倷绀佸﹢閬嶅磿閵堝绠板┑鐘宠壘缁狀垶姊洪锟界粔鐢稿煕閹寸偞鍙忛柣鐔哄閹兼劙鏌涢弮锟藉畝鎼佸蓟閻斿吋鎯炴い鎰舵嫹妞ゅ繐鐗滈弫瀣煥濠靛棭妲搁柛銊ュ�归妵鍕箛閳轰胶浼勭紓浣瑰姉閸嬨倝寮婚敐鍡樺劅妞ゆ牗绮庢牎濠电偛鐡ㄧ划蹇撯枖濞戞粎浜遍梻浣虹帛閺屻劑宕ョ�ｎ喖鐓曢柟杈鹃檮閳锋帡鏌涢锝囶暡婵炲懎妫濋幃妤�顫濋悙顒�顏�?,闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囨繝寰锋澘锟芥洟骞婅箛娑樼；闁跨喓濮甸悡蹇擃熆鐠鸿櫣澧曢柛鏃傛暬閺屻倝鎮ч崼婵愬殝闂侀潧娲ょ�氼垳绮诲☉銏犵闁哄鍨垫禍璺衡攽閻愯尙鎽犵紒顔肩灱缁辩偞绻濋崶褑鎽曢梺缁樻⒒閸樠呯不濮樿鲸鍠愮�广儱顦Ч鏌ュ级閸稑濡稿ù婊勭矒閺屾洟宕煎┑鍥ф闂佹悶鍊曞ú顓㈠蓟閿涘嫪娌柛鎾楀嫬鍨遍梻浣芥〃缁�渚�宕愰崸妤�绠犻柣鎰惈鍞悷婊冪Ч瀹曠敻骞掗幘鍓佺槇闂佹眹鍨藉褎绂掑鍫熺厽閹烘娊宕濋幋锕�鏋侀柛鎰靛枛椤懘鏌曢崼婵囨悙缂佷緤绠撳铏规崉閵娿儲鐝㈤梺鐟板殩閹凤拷?
		if (!findit) {
			xbean.timerNpcInfoCol npcInfo = xtable.Timernpcinfotable.select(actId);
			if (npcInfo == null) {
				return;
			}
			
			List<Long> npcList = new ArrayList<Long>();
			for (Map.Entry<Long, xbean.timerNpcInfo> npcinfos : npcInfo.getNpcinfo().entrySet()) {
				//闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃秹婀侀梺缁樺灱濡嫰寮告笟锟介弻鐔兼⒒鐎靛壊妲紓浣哄Х婵烇拷闁哄瞼鍠栭幃娆擃敆閿熶粙宕濈捄琛℃斀妞ゆ棁妫勯埢鏇㈡煛瀹�瀣М妞ゃ垺顨嗗鍕拷锝庡亜濞堝徊闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径宀嬫嫹閻у憡瀚归梺璺ㄥ枍缁瑩寮幘缁樺殟闁靛鍎卞В鍫ユ⒑閸濄儱校妞ゃ劌锕悰顕�宕奸妷銉庘晠鏌嶆潪鎷屽厡妞ゆ梹鍔栫换娑欐綇閸撗冨煂闂佺濮ょ划鎾诲箖妤ｅ啯鏅搁柨鐕傛嫹? 0=缂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐閻庢鍠氶弫濠氥�佸Δ鍛櫢濞寸姴顑傞敓鑺ユ瀹曟﹢顢欓挊澶屾濠电姰鍨归崢婊堝疾濠婂牊鍎庢い鏍仜閺嬩線鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓 1=闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛瀣ㄥ�濋弻鏇熺箾閸喖顬夐梺鐟板暱閻倸顫忕紒妯诲闁告稑锕ラ崕鎾愁渻閵堝棗鐏ユ繛宸幖閻ｉ攱瀵奸弶鎴犵杸濡炪倖鏌ㄦ晶浠嬫偂閹剧粯鈷戦悹鎭掑妼濞呮劙鏌熼崙銈嗗? 2=闂傚倸鍊峰ù鍥敋瑜嶉～婵嬫晝閸岋妇绋忔繝銏ｅ煐閸旀牠宕戦妶澶嬬厸闁搞儮鏅涘皬闂佺粯甯掗敃銉ф崲濞戙垹骞㈡俊顖濇娴犳挳姊洪幖鐐插缂佽鐗撳璇差吋婢跺á銊╂煥閺冨倹娅曞ù鐓庢搐閳规垿鍩勯崘銊хシ闂佺粯顨嗛幑鍥ь嚕鐠囨祴妲堥柕蹇婃櫆閺呮繈姊洪幐搴ｇ畵婵炲眰鍔庡Σ鎰版偋閸垻顔曢柣搴㈢♁椤洭鎮虫繝姘厵闁告垯鍊栫�氾拷
				if (npcinfos.getValue().getNpcstatus() == 0) { //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ婢舵劖鐓ユ繝闈涙瀹告繈鏌曢崱妤嬫敾濞ｅ洤锕獮鎾诲箳閺傚簱鍙洪梻浣告惈閺堫剟鎯勯鐐拷渚�寮撮姀鈩冩珳闂佹悶鍎弲婵堢玻濡わ拷閳规垿鎮欓懠顒佹喖缂備緡鍣紞渚�鐛箛娑欐櫢闁跨噦鎷�
					npcList.add(npcinfos.getKey());
				}
			}
			
			for (Long npckeyy : npcList) {
				Npc npc = SceneNpcManager.selectNpcByKey(npckeyy);
				if (npc == null)
					continue;
				
				if (roleMapid == npc.getMapId()) {
					findit = true;
					findmapid = roleMapid;
					findposx = npc.getPos().toGridPos().getX();
					findposy = npc.getPos().toGridPos().getY();
					npckey = npckeyy;
					break;
				}
			}
		}
		
		if (!findit) {
			xbean.timerNpcInfoCol npcInfo = xtable.Timernpcinfotable.select(actId);
			if (npcInfo == null) {
				return;
			}
			
			List<Long> npcList = new ArrayList<Long>();
			for (Map.Entry<Long, xbean.timerNpcInfo> npcinfos : npcInfo.getNpcinfo().entrySet()) {
				//闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃秹婀侀梺缁樺灱濡嫰寮告笟锟介弻鐔兼⒒鐎靛壊妲紓浣哄Х婵烇拷闁哄瞼鍠栭幃娆擃敆閿熶粙宕濈捄琛℃斀妞ゆ棁妫勯埢鏇㈡煛瀹�瀣М妞ゃ垺顨嗗鍕拷锝庡亜濞堝徊闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径宀嬫嫹閻у憡瀚归梺璺ㄥ枍缁瑩寮幘缁樺殟闁靛鍎卞В鍫ユ⒑閸濄儱校妞ゃ劌锕悰顕�宕奸妷銉庘晠鏌嶆潪鎷屽厡妞ゆ梹鍔栫换娑欐綇閸撗冨煂闂佺濮ょ划鎾诲箖妤ｅ啯鏅搁柨鐕傛嫹? 0=缂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐閻庢鍠氶弫濠氥�佸Δ鍛櫢濞寸姴顑傞敓鑺ユ瀹曟﹢顢欓挊澶屾濠电姰鍨归崢婊堝疾濠婂牊鍎庢い鏍仜閺嬩線鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓 1=闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛瀣ㄥ�濋弻鏇熺箾閸喖顬夐梺鐟板暱閻倸顫忕紒妯诲闁告稑锕ラ崕鎾愁渻閵堝棗鐏ユ繛宸幖閻ｉ攱瀵奸弶鎴犵杸濡炪倖鏌ㄦ晶浠嬫偂閹剧粯鈷戦悹鎭掑妼濞呮劙鏌熼崙銈嗗? 2=闂傚倸鍊峰ù鍥敋瑜嶉～婵嬫晝閸岋妇绋忔繝銏ｅ煐閸旀牠宕戦妶澶嬬厸闁搞儮鏅涘皬闂佺粯甯掗敃銉ф崲濞戙垹骞㈡俊顖濇娴犳挳姊洪幖鐐插缂佽鐗撳璇差吋婢跺á銊╂煥閺冨倹娅曞ù鐓庢搐閳规垿鍩勯崘銊хシ闂佺粯顨嗛幑鍥ь嚕鐠囨祴妲堥柕蹇婃櫆閺呮繈姊洪幐搴ｇ畵婵炲眰鍔庡Σ鎰版偋閸垻顔曢柣搴㈢♁椤洭鎮虫繝姘厵闁告垯鍊栫�氾拷
				if (npcinfos.getValue().getNpcstatus() == 0) { //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ婢舵劖鐓ユ繝闈涙瀹告繈鏌曢崱妤嬫敾濞ｅ洤锕獮鎾诲箳閺傚簱鍙洪梻浣告惈閺堫剟鎯勯鐐拷渚�寮撮姀鈩冩珳闂佹悶鍎弲婵堢玻濡わ拷閳规垿鎮欓懠顒佹喖缂備緡鍣紞渚�鐛箛娑欐櫢闁跨噦鎷�
					npcList.add(npcinfos.getKey());
				}
			}
			
			int index = Misc.getRandomBetween(0, npcList.size() - 1);
			npckey = npcList.get(index);
			
			Npc npc = SceneNpcManager.selectNpcByKey(npckey);
			if (npc == null) {
				MessageMgr.psendMsgNotify(roleid, 170021, null);
				return;
			}
			findit = true;
			findmapid = npc.getMapId();
			findposx = npc.getPos().toGridPos().getX();
			findposy = npc.getPos().toGridPos().getY();
		}
		
		if (!findit)
			return;
		
		SUseXueYueKey useKey = new SUseXueYueKey(npcid, npckey, findmapid, findposx, findposy);
		gnet.link.Onlines.getInstance().send(roleid, useKey);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730436;

	public int getType() {
		return 730436;
	}

	public long roleid;
	public int npcid;

	public GFindNpcWithNpcId() {
	}

	public GFindNpcWithNpcId(long _roleid_, int _npcid_) {
		this.roleid = _roleid_;
		this.npcid = _npcid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(npcid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		npcid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GFindNpcWithNpcId) {
			GFindNpcWithNpcId _o_ = (GFindNpcWithNpcId)_o1_;
			if (roleid != _o_.roleid) return false;
			if (npcid != _o_.npcid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += npcid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(npcid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GFindNpcWithNpcId _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = npcid - _o_.npcid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

