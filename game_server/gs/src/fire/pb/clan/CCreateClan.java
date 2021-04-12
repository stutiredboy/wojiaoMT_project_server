
package fire.pb.clan;

import fire.pb.clan.srv.ClanBaseManager;
import fire.pb.talk.MessageMgr;
import fire.pb.util.CheckName;
import fire.pb.util.StringValidateUtil;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCreateClan__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CCreateClan extends __CCreateClan__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0 || clanname == null || clanaim == null)
			return;
		int resultCode = CheckName.checkValid(clanname);
		if (resultCode == CheckName.WORD_ILLEGALITY) {
			MessageMgr.sendMsgNotify(roleid, 142260, null);
			return;
		} else if (resultCode == CheckName.SPECIAL_WORD_TOO_MANY) {
			MessageMgr.sendMsgNotify(roleid, 142294, null);
			return;
		} else if (resultCode == CheckName.NONE_CHARACTER) {
			MessageMgr.sendMsgNotify(roleid, 146238, null);
			return;
		}

		if (!StringValidateUtil.checkValidName(clanaim)) {
			MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙绀冩い鏇嗗洤鐓橀柟杈鹃檮閸嬫劙鏌涘▎蹇ｆЧ闁诡喗鐟х槐鎾存媴閸濆嫷锟藉矂鏌涢妸銉у煟鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍蓟閸ヮ剚鏅濋柨鐔剁矙瀹曟繈骞掗幘鍓侇啎閻庣懓澹婇崰鏇犺姳閼姐倗纾奸柣娆忔噽缁夘噣鏌″畝瀣埌閾伙綁鏌涜箛鎾虫倯婵絽瀚板铏圭磼濡櫣鐟ㄩ梺鍛婅壘椤戝洭骞戦姀鐘闁靛繒濮烽鎺楁煟鎼达絾鏆╂い顓炵墦瀵娊鏁撻悩鏂ユ嫼閻熸粎澧楃敮鈺佄涢幋锔界厱闊洦妫戦懓璺拷娈垮枛椤兘骞冮姀銏犳瀳閺夊牄鍔嶅▍鏍ㄧ節濞堝灝鏋熼柨姘憋拷瑙勬处閸撶喖宕洪崨瀛樺仺闁告稑锕ら敓鐣屾暬閹嘲鈻庤箛鎿冧痪缂備緤鎷烽柨鐔剁矙閹鎲撮崟顒�顦╅梺鍛婃尵閸犳牕鐣峰ú顏勎ㄩ柨鏇嫹缂佸墎鍋涢埞鎴︽倷闂堟稐澹曢梺璇查椤嘲螞閸涙惌鏁冮柕蹇婏拷鎰佹П婵犵數鍋涘鍫曟偋濠婂懏顫曢柣鎰劋閺呮悂鏌ㄩ悤鍌涘?$缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗鎸抽幃娆戞嫚瑜庣�氬綊鏌涢锝嗙闁哄懏鎮傞弻锕�螣娓氼垱笑闂佸搫妫寸徊楣冦�冮妷鈺傚�烽柛娆忣槸閺嬬姴顪冮妶鍐ㄧ仾闁荤啿鏅涢悾鐑芥晲婢跺á銊ф喐韫囨稑绠熺憸鐗堝笚閳锋帡鏌涚仦鍓ф噯闁稿繐鏈妵鍕閻欏懓鍚Δ鐘靛仦閹瑰洭銆侀弮鍫濆耿婵°倕鍟伴悺妯肩磽閸屾艾锟界兘鎮為敃鍌楋拷锕傚炊椤戞拝鎷烽崨瀛樺殤妞ゆ帊绀侀弸鎴︽⒑缂佹﹩娈旈柣妤�妫涚划顓烆潩閼哥數鍘介梺瑙勫劤閻°劎绮堥崼銉︾厵闁圭粯甯楅崯鐐烘煙椤栨稒顥堝┑鈩冩倐閺佹劘绠涢弬娆句紦闂備礁鎲￠崝锕傚窗閺嶎厾宓侀柕蹇ョ磿缁犻箖鏌熺�电鍓遍柣鎺嶇矙閺岋紕浠﹂悢宄版灓婵炴挸顭烽弻鏇㈠醇濠靛浂妫炵紓浣诡殕鐢繝骞冨Δ锟介～婵嬫偂鎼达紕鐫勯柣搴ゎ潐濞叉﹢宕濆▎蹇曟殾濠靛倻顭堥崡鎶芥煟閺傛寧鎯堟鐐搭殜濮婄粯鎷呴崫銉ㄩ梺绋款儏閿曨亜鐣风憴鍕嚤閻庢稒锚娴滄姊鸿ぐ鎺戜喊闁告顫夌粋宥咁煥閸喓鍘繝銏ｆ硾閻楀棝宕濈�涙ü绻嗛柛娆忣槹閵囨繈鏌″畝锟介崰鏍х暦閿濆棗绶為悗锝庝悍閹风兘骞囬鍡樺婵炲牆鐏濋弸娑㈡煟閺嵮佸仮闁绘侗鍣ｉ獮鍥敇閻斿嘲濡虫俊鐐�栧褰掑几閼姐倖顫曟俊銈呮噺閳锋帡鏌涚仦鍓ф噮妞わ讣绠撻弻鐔哄枈閸楃偘鍠婇悗娈垮枤閺佸銆佸Δ鍛＜婵犲﹤鎳愰崢顖炴⒒娴ｄ警鏀伴柟娲讳簽缁骞嬮敂钘変簵闂佺偨鍎查崜姘舵偄閸℃稒鍋ｉ弶鐐村椤掔喖鏌ｉ幙鍐ㄥ缂佺粯绋撶划顓㈠传閸曨偒娼庨梻浣告惈閺堫剟鎯勯鐐拷渚�寮撮姀鈩冩珳闂佹悶鍎弲婵嬪汲閻樼數纾介柛灞剧懅閸斿秹鏌涢悙璺哄惞缂佽京鍋炵粭鐔兼晸閽樺鍤曞┑鐘崇閺呮彃顭跨捄渚剰濞存粍绮撳娲川婵犲嫮绱伴梺绋垮婵炲﹪骞冮埄鍐╁缂侇垱娲橀弬锟介梻浣虹帛閿曗晠宕伴弽顓熷�舵い蹇撶墛閻撱儵鏌￠崶顭嬵亪鎮橀埡鍛厽闁挎繂娲ら崢瀛橆殽閻愬弶鍠樼�殿喖鐖煎畷绋课旀担瑙勭暥婵犵數濮撮惀澶愬级閸栤剝瀚圭憸鏃堢嵁韫囨稒鍊婚柤鎭掑劤閸欏啴姊洪崨濠傚Е濞存粍绮撳绋库槈閵忥紕鍘搁柣蹇曞仜婢т粙鍩ユ径鎰厓闁芥ê顦藉Ο锟介悗瑙勬穿缁绘繈骞冨▎鎴嫹閻㈠憡娅滈柟鑼亾缁绘繈鎮介棃娴讹絾銇勯弮锟介悧鐘茬暦鐟欏嫬顕遍柟纰卞幗閺咁亜顪冮妶鍡樺暗濠殿喚鏁婚敐鐐哄即閵忥紕鍘甸梺缁樺灦钃辨い銉︾墵閺岀喐顦版惔鈥冲箣闂佽桨鐒﹂崝鏍箚閺冨牆鐏崇�规洖娴傞崯鍫㈢磽閸屾瑨鍏岄柧蹇撻叄瀹曘垺绺介崨濠備函婵犻潧鍊婚…鍫ユ嫅閻斿摜绠鹃柟瀵稿剱閻掓悂鏌ｉ弮鍌氬妺閻庢碍宀搁弻娑樷枎韫囷絾歇闂佽皫鍌滃妽缂佺粯绻傞埢鎾诲垂椤旂晫浜梻浣瑰濞插繘宕曢柆宥侊拷鏃堝礃閳哄喚娴勯柣搴秵娴滅偤鎮惧ú顏呪拺闁哄倶鍎插▍鍛存煕閻曚礁鐏︾�规洘娲熼幃銏ゅ礂鐏忔牗瀵栭梻浣规偠閸庢椽宕滃▎鎾冲強闁靛鏅滈悡鐔兼煙闁箑鏋涢柛鏂款儔閺屽秹鏌ㄧ�ｎ亞浼岄梺鍝勭灱閸犳挾鍒掑▎鎾冲瀭妞ゆ洖鎳庢俊椋庣磽娴ｇ鈷旈柛瀣崌楠炲啴宕掗悙鑼舵憰濠电偞鍨堕悷褏寮ч敓浠嬫⒑閸涘﹤濮﹀ù婊呭仱閹箖鎮滃Ο鑲╊啎闂佹寧绻傞幊蹇涘箹閹扮増鐓ラ柡鍥ュ妺缁ㄥ鏌ｉ敐鍥ㄧ効闁靛洦鍔欓獮鎺戔攽閸ャ劍鐝栭梻鍌欑窔濞佳呮崲閸儱鍨傚┑鐘崇閸嬫ɑ銇勯弴顏呭濠殿喖锕ㄥ▍锝夊箯閻樿绠甸柟鐑樺灦閻︼絿绱撻崒姘拷鍝ョ矓閺夋嚦娑樷攽閸℃瑦娈惧┑掳鍊ч幏閿嬨亜椤愶絿鐭掗柡浣规崌閹稿﹥寰勫Ο鐑橆吙闂備礁缍婂Λ璺ㄧ矆娓氾拷瀹曟﹢鏁撻挊澶樻富闁靛牆妫欑亸鐢告煕閻樻煡鍙勯柡浣规崌閹稿﹥寰勭仦鑲╅┏婵＄偑鍊戦崝濠囧磿閻㈢绠栨繛鍡樻尰閸ゆ垶銇勯幋锝呭姷婵＄偓鎮傚缁樻媴閸涘﹤鏆堝┑顔硷功閹虫捇鎮惧┑瀣濞达絾鐡曢幗鏇㈡⒑閹稿海绠撻柟鍙夛耿瀵噣宕奸悢鍛婎仧闂備浇濮ら敋闁挎稑顦埥澶娢熼柨瀣澑闂備胶纭堕崜婵嬫偡閿曪拷閳绘挻銈ｉ崘鈹炬嫼闂傚倸鐗婄粙鎾剁不閻愮儤鐓曞┑鐘插暞缁�鍫㈢磼椤斿灝鍚圭紒杈ㄥ笒铻ｉ梻锟介幇顔炬晨闂傚倷绀侀幖顐﹀疮椤愶箑纾归柣鐔稿閺嬪秹鏌￠崶銉ョ仾闁绘挻娲樻穱濠囶敍濠婂懎绗￠梺绋匡攻閸旀牠骞堥妸锔剧瘈闁告侗鍣禒鈺呮⒑閸︻厽鍤�閻庢氨澧楁穱濠囧箹娴ｈ倽銊╂煥閺冿拷閸庡磭绱為幒妤佲拻闁稿本鐟ㄩ崗宀勬煙閾忣偅宕岀�规洜鏁诲浠嬵敇閻愭鍞甸梻浣芥硶閸ｏ箓骞忛敓锟�?$缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗鎸抽幃娆戞嫚瑜庣�氬綊鏌涢锝嗙闁哄懏鎮傞弻锕�螣娓氼垱笑闂佸搫妫寸徊楣冦�冮妷鈺傚�烽柛娆忣槸閺嬬姴顪冮妶鍐ㄧ仾闁荤啿鏅涢悾鐑芥晲婢跺á銊ф喐韫囨稑绠熺憸鐗堝笚閳锋帡鏌涚仦鍓ф噯闁稿繐鏈妵鍕閻欏懓鍚Δ鐘靛仦閹瑰洭銆侀弮鍫濆耿婵°倕鍟伴悺妯肩磽閸屾艾锟界兘鎮為敃鍌楋拷锕傚炊椤戞拝鎷烽崨瀛樺殤妞ゆ帊绀侀弸鎴︽⒑缂佹﹩娈旈柣妤�妫涚划顓烆潩閼哥數鍘介梺瑙勫劤瀹曨剟宕濋敃鍌涚厸鐎癸拷鐎ｎ剛袦閻庢鍠楅幐鎶藉箖濞嗘垶瀚氱憸搴ｏ拷姘秺閺屾盯鏁傜拠鎻掍紟闂佺懓鍢查崲鏌ワ綖濠靛鍊锋い鎺炴嫹妞ゅ骏鎷�
		if(clanaim.contains("$")){
			MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		int chineseCnt = 0;
		int otherCnt = 0;
		for (int i = 0; i < clanname.length(); i++) {
			// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬姘卞缂傚倸鍟ú鐔奉潖缂佹ɑ濯撮柛娑橈攻閸庢挸鈹戦悙鑼勾闁告柨绉归獮鍫ュΩ閿旂粯效闁硅壈鎻徊鍧楁倿閸忚偐绡�闁汇垽娼у瓭闂佺锕﹂弫璇差嚕閵婏妇顩烽悗锝庡亞閸樿棄鈹戦埥鍡楃仩闁圭⒈鍋嗛惀顏囶樄闁哄瞼鍠栧畷妤呮偂鎼粹槅娼氶梻浣告惈閺堫剛绮欓幘瀵割浄闁挎梻鍋撶�氭岸鏌熺紒妯轰刊婵炵厧閰ｅ缁樻媴閸涘﹥鍎撻梺鍝勭墱閸撴瑧鍙呴梺缁樻椤ユ捇寮抽敃鍌涚厽闁规儳纾畝鎼佹煛閿熻姤绂掔�ｎ偆鍘遍梺闈涱槹閸ㄧ數锟芥凹鍙冮、鏃堝Χ婢跺鎷洪梺鐓庮潟閸婃洟寮搁幋鐘电＜妞ゆ柨鍚嬪﹢鐗堛亜閵婏絽鍔︽鐐寸墬缁楃喖宕堕妸锔界彣闂傚倷绶氬褔藝椤愶箑鐤炬繛鎴炴皑閻棝鎮楅敐搴′簴濞存粍绮撻弻鐔兼倻濡櫣浠撮梺璺ㄥ枙濡嫰鈥﹂悜钘夌畾濞撴熬鎷风�规洖銈告俊鐑芥晜鐟欏嫬顏归梻鍌欑閹诧紕绮欓幋锔芥櫇闁靛绠戠欢鐐烘煕閺囥劌鐏￠柣鎾存礋閺岀喖鎮欓浣虹▏闂佸憡绻嗗▍锝夋晸閸婄噥娼愭繛鍙夊灴瀹曪繝骞庨挊澶嬬�梺鐟板⒔缁垶寮查幖浣圭叆闁绘洖鍊圭�氾拷
			String regexStr = CheckName.getRegexStr();
			if (clanname.substring(i, i + 1).matches(regexStr)) {
				chineseCnt++;
			} else {
				otherCnt++;
			}
		}
		double total = chineseCnt + otherCnt / 2.0;
		int factionNameLen = 5;
		if (total < 2 || total > factionNameLen) {
			MessageMgr.sendMsgNotify(roleid, 145088, null);
			return;
		}
		if (clanaim.length() == 0) {
			MessageMgr.sendMsgNotify(roleid, 145091, null);
			return;
		}
		if (clanaim.length() > fire.pb.clan.srv.ClanManage.AIMWORD_MAX) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 145112, null);
			return;
		}
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				return ClanBaseManager.getInstance().createClan(roleid, clanname, clanaim);
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808450;

	public int getType() {
		return 808450;
	}

	public java.lang.String clanname; // 公会名字
	public java.lang.String clanaim; // 公会宗旨（公告）

	public CCreateClan() {
		clanname = "";
		clanaim = "";
	}

	public CCreateClan(java.lang.String _clanname_, java.lang.String _clanaim_) {
		this.clanname = _clanname_;
		this.clanaim = _clanaim_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(clanname, "UTF-16LE");
		_os_.marshal(clanaim, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		clanname = _os_.unmarshal_String("UTF-16LE");
		clanaim = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CCreateClan) {
			CCreateClan _o_ = (CCreateClan)_o1_;
			if (!clanname.equals(_o_.clanname)) return false;
			if (!clanaim.equals(_o_.clanaim)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += clanname.hashCode();
		_h_ += clanaim.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(clanname.length()).append(",");
		_sb_.append("T").append(clanaim.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

