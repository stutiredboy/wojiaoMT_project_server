package fire.pb.clan;

import fire.log.beans.FactionOpbean;

import fire.pb.talk.MessageMgr;
import fire.pb.util.StringValidateUtil;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangeClanAim__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChangeClanAim extends __CChangeClanAim__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;

		if (!fire.pb.util.StringValidateUtil.checkIllegalWord(newaim)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 142261, null);
			return;
		}
		if (!StringValidateUtil.checkValidName(newaim)) {
			MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙绀冩い鏇嗗洤鐓橀柟杈鹃檮閸嬫劙鏌涘▎蹇ｆЧ闁诡喗鐟х槐鎾存媴閸濆嫷锟藉矂鏌涢妸銉у煟鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍蓟閸ヮ剚鏅濋柨鐔剁矙瀹曟繈骞掗幘鍓侇啎閻庣懓澹婇崰鏇犺姳閼姐倗纾奸柣娆忔噽缁夘噣鏌″畝瀣埌閾伙綁鏌涜箛鎾虫倯婵絽瀚板铏圭磼濡櫣鐟ㄩ梺鍛婅壘椤戝洭骞戦姀鐘闁靛繒濮烽鎺楁煟鎼达絾鏆╂い顓炵墦瀵娊鏁撻悩鏂ユ嫼閻熸粎澧楃敮鈺佄涢幋锔界厱闊洦妫戦懓璺拷娈垮枛椤兘骞冮姀銏犳瀳閺夊牄鍔嶅▍鏍ㄧ節濞堝灝鏋熼柨姘憋拷瑙勬处閸撶喖宕洪崨瀛樺仺闁告稑锕ら敓鐣屾暬閹嘲鈻庤箛鎿冧痪缂備緤鎷烽柨鐔剁矙閹鎲撮崟顒�顦╅梺鍛婃尵閸犳牕鐣峰ú顏勎ㄩ柨鏇嫹缂佸墎鍋涢埞鎴︽倷闂堟稐澹曢梺璇查椤嘲螞閸涙惌鏁冮柕蹇婏拷鎰佹П婵犵數鍋涘鍫曟偋濠婂懏顫曢柣鎰劋閺呮悂鏌ㄩ悤鍌涘?$缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗鎸抽幃娆戞嫚瑜庣�氬綊鏌涢锝嗙闁哄懏鎮傞弻锕�螣娓氼垱笑闂佸搫妫寸徊楣冦�冮妷鈺傚�烽柛娆忣槸閺嬬姴顪冮妶鍐ㄧ仾闁荤啿鏅涢悾鐑芥晲婢跺á銊ф喐韫囨稑绠熺憸鐗堝笚閳锋帡鏌涚仦鍓ф噯闁稿繐鏈妵鍕閻欏懓鍚Δ鐘靛仦閹瑰洭銆侀弮鍫濆耿婵°倕鍟伴悺妯肩磽閸屾艾锟界兘鎮為敃鍌楋拷锕傚炊椤戞拝鎷烽崨瀛樺殤妞ゆ帊绀侀弸鎴︽⒑缂佹﹩娈旈柣妤�妫涚划顓烆潩閼哥數鍘介梺瑙勫劤閻°劎绮堥崼銉︾厵闁圭粯甯楅崯鐐烘煙椤栨稒顥堝┑鈩冩倐閺佹劘绠涢弬娆句紦闂備礁鎲￠崝锕傚窗閺嶎厾宓侀柕蹇ョ磿缁犻箖鏌熺�电鍓遍柣鎺嶇矙閺岋紕浠﹂悢宄版灓婵炴挸顭烽弻鏇㈠醇濠靛浂妫炵紓浣诡殕鐢繝骞冨Δ锟介～婵嬫偂鎼达紕鐫勯柣搴ゎ潐濞叉﹢宕濆▎蹇曟殾濠靛倻顭堥崡鎶芥煟閺傛寧鎯堟鐐搭殜濮婄粯鎷呴崫銉ㄩ梺绋款儏閿曨亜鐣风憴鍕嚤閻庢稒锚娴滄姊鸿ぐ鎺戜喊闁告顫夌粋宥咁煥閸喓鍘繝銏ｆ硾閻楀棝宕濈�涙ü绻嗛柛娆忣槹閵囨繈鏌″畝锟介崰鏍х暦閿濆棗绶為悗锝庝悍閹风兘骞囬鍡樺婵炲牆鐏濋弸娑㈡煟閺嵮佸仮闁绘侗鍣ｉ獮鍥敇閻斿嘲濡虫俊鐐�栧褰掑几閼姐倖顫曟俊銈呮噺閳锋帡鏌涚仦鍓ф噮妞わ讣绠撻弻鐔哄枈閸楃偘鍠婇悗娈垮枤閺佸銆佸Δ鍛＜婵犲﹤鎳愰崢顖炴⒒娴ｄ警鏀伴柟娲讳簽缁骞嬮敂钘変簵闂佺偨鍎查崜姘舵偄閸℃稒鍋ｉ弶鐐村椤掔喖鏌ｉ幙鍐ㄥ缂佺粯绋撶划顓㈠传閸曨偒娼庨梻浣告惈閺堫剟鎯勯鐐拷渚�寮撮姀鈩冩珳闂佹悶鍎弲婵嬪汲閻樼數纾介柛灞剧懅閸斿秹鏌涢悙璺哄惞缂佽京鍋炵粭鐔兼晸閽樺鍤曞┑鐘崇閺呮彃顭跨捄渚剰濞存粍绮撳娲川婵犲嫮绱伴梺绋垮婵炲﹪骞冮埄鍐╁缂侇垱娲橀弬锟介梻浣虹帛閿曗晠宕伴弽顓熷�舵い蹇撶墛閻撱儵鏌￠崶顭嬵亪鎮橀埡鍛厽闁挎繂娲ら崢瀛橆殽閻愬弶鍠樼�殿喖鐖煎畷绋课旀担瑙勭暥婵犵數濮撮惀澶愬级閸栤剝瀚圭憸鏃堢嵁韫囨稒鍊婚柤鎭掑劤閸欏啴姊洪崨濠傚Е濞存粍绮撳绋库槈閵忥紕鍘搁柣蹇曞仜婢т粙鍩ユ径鎰厓闁芥ê顦藉Ο锟介悗瑙勬穿缁绘繈骞冨▎鎴嫹閻㈠憡娅滈柟鑼亾缁绘繈鎮介棃娴讹絾銇勯弮锟介悧鐘茬暦鐟欏嫬顕遍柟纰卞幗閺咁亜顪冮妶鍡樺暗濠殿喚鏁婚敐鐐哄即閵忥紕鍘甸梺缁樺灦钃辨い銉︾墵閺岀喐顦版惔鈥冲箣闂佽桨鐒﹂崝鏍箚閺冨牆鐏崇�规洖娴傞崯鍫㈢磽閸屾瑨鍏岄柧蹇撻叄瀹曘垺绺介崨濠備函婵犻潧鍊婚…鍫ユ嫅閻斿摜绠鹃柟瀵稿剱閻掓悂鏌ｉ弮鍌氬妺閻庢碍宀搁弻娑樷枎韫囷絾歇闂佽皫鍌滃妽缂佺粯绻傞埢鎾诲垂椤旂晫浜梻浣瑰濞插繘宕曢柆宥侊拷鏃堝礃閳哄喚娴勯柣搴秵娴滅偤鎮惧ú顏呪拺闁哄倶鍎插▍鍛存煕閻曚礁鐏︾�规洘娲熼幃銏ゅ礂鐏忔牗瀵栭梻浣规偠閸庢椽宕滃▎鎾冲強闁靛鏅滈悡鐔兼煙闁箑鏋涢柛鏂款儔閺屽秹鏌ㄧ�ｎ亞浼岄梺鍝勭灱閸犳挾鍒掑▎鎾冲瀭妞ゆ洖鎳庢俊椋庣磽娴ｇ鈷旈柛瀣崌楠炲啴宕掗悙鑼舵憰濠电偞鍨堕悷褏寮ч敓浠嬫⒑閸涘﹤濮﹀ù婊呭仱閹箖鎮滃Ο鑲╊啎闂佹寧绻傞幊蹇涘箹閹扮増鐓ラ柡鍥ュ妺缁ㄥ鏌ｉ敐鍥ㄧ効闁靛洦鍔欓獮鎺戔攽閸ャ劍鐝栭梻鍌欑窔濞佳呮崲閸儱鍨傚┑鐘崇閸嬫ɑ銇勯弴顏呭濠殿喖锕ㄥ▍锝夊箯閻樿绠甸柟鐑樺灦閻︼絿绱撻崒姘拷鍝ョ矓閺夋嚦娑樷攽閸℃瑦娈惧┑掳鍊ч幏閿嬨亜椤愶絿鐭掗柡浣规崌閹稿﹥寰勫Ο鐑橆吙闂備礁缍婂Λ璺ㄧ矆娓氾拷瀹曟﹢鏁撻挊澶樻富闁靛牆妫欑亸鐢告煕閻樻煡鍙勯柡浣规崌閹稿﹥寰勭仦鑲╅┏婵＄偑鍊戦崝濠囧磿閻㈢绠栨繛鍡樻尰閸ゆ垶銇勯幋锝呭姷婵＄偓鎮傚缁樻媴閸涘﹤鏆堝┑顔硷功閹虫捇鎮惧┑瀣濞达絾鐡曢幗鏇㈡⒑閹稿海绠撻柟鍙夛耿瀵噣宕奸悢鍛婎仧闂備浇濮ら敋闁挎稑顦埥澶娢熼柨瀣澑闂備胶纭堕崜婵嬫偡閿曪拷閳绘挻銈ｉ崘鈹炬嫼闂傚倸鐗婄粙鎾剁不閻愮儤鐓曞┑鐘插暞缁�鍫㈢磼椤斿灝鍚圭紒杈ㄥ笒铻ｉ梻锟介幇顔炬晨闂傚倷绀侀幖顐﹀疮椤愶箑纾归柣鐔稿閺嬪秹鏌￠崶銉ョ仾闁绘挻娲樻穱濠囶敍濠婂懎绗￠梺绋匡攻閸旀牠骞堥妸锔剧瘈闁告侗鍣禒鈺呮⒑閸︻厽鍤�閻庢氨澧楁穱濠囧箹娴ｈ倽銊╂煥閺冿拷閸庡磭绱為幒妤佲拻闁稿本鐟ㄩ崗宀勬煙閾忣偅宕岀�规洜鏁诲浠嬵敇閻愭鍞甸梻浣芥硶閸ｏ箓骞忛敓锟�?$缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗鎸抽幃娆戞嫚瑜庣�氬綊鏌涢锝嗙闁哄懏鎮傞弻锕�螣娓氼垱笑闂佸搫妫寸徊楣冦�冮妷鈺傚�烽柛娆忣槸閺嬬姴顪冮妶鍐ㄧ仾闁荤啿鏅涢悾鐑芥晲婢跺á銊ф喐韫囨稑绠熺憸鐗堝笚閳锋帡鏌涚仦鍓ф噯闁稿繐鏈妵鍕閻欏懓鍚Δ鐘靛仦閹瑰洭銆侀弮鍫濆耿婵°倕鍟伴悺妯肩磽閸屾艾锟界兘鎮為敃鍌楋拷锕傚炊椤戞拝鎷烽崨瀛樺殤妞ゆ帊绀侀弸鎴︽⒑缂佹﹩娈旈柣妤�妫涚划顓烆潩閼哥數鍘介梺瑙勫劤瀹曨剟宕濋敃鍌涚厸鐎癸拷鐎ｎ剛袦閻庢鍠楅幐鎶藉箖濞嗘垶瀚氱憸搴ｏ拷姘秺閺屾盯鏁傜拠鎻掍紟闂佺懓鍢查崲鏌ワ綖濠靛鍊锋い鎺炴嫹妞ゅ骏鎷�
		if(newaim.contains("$")){
			MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		
		
		if (newaim.length() == 0) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 145091, null);
			return;
		}
		if (newaim.length() > fire.pb.clan.srv.ClanManage.AIMWORD_MAX) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 145112, null);
			return;
		}
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				xbean.ClanInfo clanInfo = ClanUtils.getClanInfoById(roleid, false);
				if (clanInfo == null) {
					fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 145077, null);
					return false;
				}
				if (clanInfo.getClanmaster() != roleid && clanInfo.getClanvicemaster() != roleid) {
					fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 150127, null);
					return false;
				}
				clanInfo.setClanaim(newaim);
				mkdb.Procedure.psendWhileCommit(roleid, new SChangeClanAim(newaim));
				fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 145074, null);
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簻椤掋垺銇勯幇顖毿撻柟渚垮妼椤粓宕卞Δ锟介埛鎺楁⒑缂佹ê绗傜紒顔界懇瀵濡堕崱妯哄伎闂佸綊鍋婇崜銊╁箯閻戣棄鍐�妞ゆ劦鍓氱�氳鎱ㄥ鍡楀⒒闁绘挸銈搁弻鈥崇暆鐎ｎ剛袦閻庢鍣崳锝呯暦閹烘埈娼╂い鎴ｆ硶鐢稓绱撻崒姘拷椋庢閵堝绠�瑰嫰鍋婇悢鍡涙偣妤︽寧顏犻柣鎺戞健閺岀喐顦版惔鈥冲箣闂佽鍨伴崐鍨暦閵婏妇绡�闁稿被鍊撶槐锕傛⒒閸屾艾锟介绮堟笟锟介獮澶愬灳鐡掍焦妞介弫鍐磼濮樻唻绱遍梻浣虹《閸撴繄绮欓幒妤�纾婚柛宀�鍋為悡娆撳级閸儳鐣烘俊缁㈠櫍閺屽秹鏌ㄧ�ｎ亞浼岄梺鍝勬湰缁嬫垿鍩為幋锕�骞㈡俊銈咃梗閻ヮ亪鏌ｆ惔锝嗗殌闁硅绱曢幑銏ゅ醇閵夈儴鎽曞┑鐐村灟閸ㄦ椽宕戦幇鐗堢厸閻忕偠顕ч崝姘憋拷娈垮枟濠㈡﹢鈥旈崘顔嘉ч柛鎰╁妿娴犲墽绱掗悙顒佺凡缂佸鎸抽垾锕傚炊椤忓棛鏉稿┑鐐村灦椤倿鍩￠崨顔惧弳闂佸搫娴傛禍婵堬拷姘秺閹鈻撻崹顔界亪闂佽绻戠换鍫ュ春閻愬搫绠ｉ柨鏃傜帛閺呪晝绱撴担鍦槈妞ゆ垵妫濋、妯好洪鍛嫼闂侀潻瀵岄崢濂稿储閹绢喗鐓涢柨鐔剁矙閺屽棗顓奸崨鍌︾畵閺屾盯寮撮妸銉т哗闁搞儲鎸冲娲川婵犱胶绻侀梺鍛婄懃缁绘﹢鐛箛娑欏�婚柦妯侯槸閻庮厼顪冮妶鍡樼闁瑰啿楠搁埢鎾诲Ω閳哄倵鎷洪柣鐔哥懃鐎氼剟宕濋懜鍏哥箚妞ゆ劑鍨归鈺呮煛娓氬洤娅嶆慨濠勭帛閹峰懐绮欓幐搴㈢槪闂備礁婀遍埛鍫ュ磻婵犲倻鏆﹂柟鎵閸嬨劎绱掔�ｎ厽纭舵い鏂挎濮婃椽宕ㄦ繝鍕暤闁诲孩鑹鹃崲鏌ュΥ閹烘挾绡�婵﹩鍘鹃崢顏堟⒑閸撴彃浜濈紒璇插暣钘熸繝濠傛噽绾惧吋淇婇妶蹇斿闂佺锕ゅ鈥愁嚕婵犳碍鏅插璺猴功椤斿﹪姊虹紒妯哄婵☆垰锕ょ叅妞ゆ挾鍠撶粻楣冩倵濞戞瑯鐒介柣顓烆儔閺岀喖顢欓悡搴嫹閸ф违濞达絽澹婂銊╂煥閻斿墎鐭欐鐐插暣閸╋繝宕ㄩ鐙�妲伴梻浣告啞閻熴儵藝闁秵鏅稿ù鐘差儑閻ｇ儤鎱ㄦ繝鍕笡闁瑰嘲鎳樺畷銊︾節閸愩劌澹嶅┑锛勫亼閸娧咃拷闈涚焸瀹曞綊宕奸弴鐐电暫濠碘槅鍨甸妴锟介柡锟芥禒瀣�甸柨婵嗛娴滄繃绻涢崨顐㈢伈婵﹥妞介幊鐐哄Ψ閸愬彞閭挊婵喢归崗鍏肩稇缁炬儳顭烽弻鏇熺珶椤栨氨校閻庢俺顫夌换娑㈠醇濠靛牅铏庨梺鍝勵儐缁嬫帡濡甸崟顖ｆ晣闁绘劕寮朵簺闂備椒绱徊鍧楀礂濡绻嗛柟闂寸閻撴稑鈹戦悩鎻掓殲婵炲懏鎹囧缁樻媴閽樺－鎾绘煥濮橆厹浜滈柨鏃囨硶閻瑩鏌℃担瑙勫磳闁瑰磭鍋ゆ俊鐑芥晝閿熺晫澹曢崘娴嬫斀妞ゆ梻銆嬮弨缁樹繆閻愯埖顥夐摶鐐烘煕閹伴潧鏋涢柣鎾寸☉闇夐柨婵嗘搐閸斿鎮▎鎾粹拻闁稿本鐟чˇ锕傛煙閻氭嚎鍊栭幊宀�绱撻崒娆戣窗闁哥姵顨婇獮鎰磼濡皷鏀虫繝鐢靛Т濞诧箓宕愭繝姘參婵☆垯璀﹀Σ娲煕濡粯鍊愭慨濠呮缁瑩骞愭惔銏″缂傚倷绶￠崰鏍儗閸岀偞鍋樻い鏃傗拡閸氬顭跨捄渚剬闁归绮换娑欐綇閸撗呅氭繝娈垮枔閸婃鈽夐悽绋块唶闁哄洨鍠撻崢閬嶆⒑閹稿海绠撶紒缁樺浮閹箖宕归顐ｎ啍闂佺粯鍔樼亸娆戠不婵犳碍鐓涘ù锝堫潐瀹曞矂鏌℃担瑙勫磳闁轰焦鎹囬弫鎾绘晸閿燂拷?
				String name=xtable.Properties.selectRolename(roleid);
				if (name != null) {
					fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(clanInfo.getMembers().keySet(), 160367, 0,
							java.util.Arrays.asList(name, newaim));
				}
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮村杈┬㈤梻浣规偠閸庢椽宕滈敃鍌氭瀬闁告劦鍠楅悡銉╂煛閸ユ湹绨奸悗姘秺濮婂搫效閸パ嶆嫹濡ゅ懎纾婚柟鎹愬煐瀹曞弶绻濋棃娑欏窛缂佲槄鎷烽梻浣侯焾閺堫剛鍒掑畝鍕╋拷鍌炴惞閸︻厾锛濇繛鎾磋壘閿曘儳锟芥俺顫夌换婵嬪閿濆棛銆愬銈嗗灥濡繂鐣烽敐鍫㈢杸闁哄倸澧界粻姘舵⒑闂堟稓澧曢柟宄邦儔瀹曟洟骞囬悧鍫濓拷鍨叏濡潡鍝洪柛銈忔嫹闂佸墽绮悧鐘诲蓟閿濆拋娼ㄩ柨鐔绘椤洩顦崇紒鍌涘笒椤劑宕熼鍡欑暰婵＄偑鍊栭崝褏寰婄捄銊т笉闁绘劗顣幏宄扳枔閸喗鐝梺绋款儏閿曨亪鎮伴鍢夌喓娑甸柨瀣伓闂傚倸鐗婄粙鎴λ夎箛鏃傜闁哄鍨甸顓㈡煛瀹�瀣ɑ闁诡垱妫冮、娑橆煥閸涘拑缍佸铏圭矙濞嗘儳鍓板┑鈽嗗亝缁诲倿鎮鹃悜钘夘潊闁靛牆鎳愰鎰箾鏉堝墽鍒伴柛妯荤矒楠炲繐煤椤忓應鎷洪梺鍛婄☉閿曪箓鍩ユ径鎰叆闁哄洦锚閿熻姤鐗犻獮鍫ュΩ椤垶鞋缂傚倷娴囨ご鍝ユ暜閿熺姴绠栭柍鍝勬噹缁�鍐煠绾板崬鍘哥紒杈ㄧ箞閺岋絾鎯旈妶搴㈢秷濠电偛寮堕…鍥箲閵忋倕纾奸柣鎴濇川缁嬪繐鈹戦悩缁樻锭婵炶濡囩槐鐐哄炊椤掍胶鍘撻梺鍛婄箓鐎氼剟寮搁敂鍓х＜閺夊牄鍔岀徊濠氭煃鐟欏嫬鐏撮柟顔界懅閿熻姤绋掗…鍥╃矙閸ヮ剚鈷戦柛娑橈龚婢规ɑ銇勯幋婵愭█妤犵偛鍟撮幃婊堟嚍閵夛附鐝曢梻浣筋潐閸庢娊骞婅箛鏇嫹濮樻剚娼愰柟渚垮妼铻ｉ柣鎾崇凹婢规洟鏌ｆ惔銏㈠暡闁瑰嚖鎷�
				xbean.ClanMemberInfo fmi = clanInfo.getMembers().get(roleid);
				FactionOpbean factionOpbean = new FactionOpbean(clanInfo.getKey(), clanInfo.getClanname(), 
						FactionOpbean.TYPE_CHANGE_AIM, fmi.getClanposition(), clanInfo.getMembers().size(),
						clanInfo.getClanlevel(), clanInfo.getHouse().entrySet());
				int weekpoint=fire.pb.clan.srv.ClanManage.getWeekclanpoint(roleid,clanInfo);
				fire.log.YYLogger.factionOPEventLog(roleid, factionOpbean,weekpoint);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808459;

	public int getType() {
		return 808459;
	}

	public java.lang.String newaim;

	public CChangeClanAim() {
		newaim = "";
	}

	public CChangeClanAim(java.lang.String _newaim_) {
		this.newaim = _newaim_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(newaim, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		newaim = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangeClanAim) {
			CChangeClanAim _o_ = (CChangeClanAim)_o1_;
			if (!newaim.equals(_o_.newaim)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += newaim.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(newaim.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}
