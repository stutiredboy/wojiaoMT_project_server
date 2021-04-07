
package fire.pb.battle.livedie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import fire.pb.PropRole;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.talk.MessageMgr;
import fire.pb.title.COffTitle;
import gnet.link.Onlines;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CInvitationLiveDieBattleOK__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CInvitationLiveDieBattleOK extends __CInvitationLiveDieBattleOK__ {
	public static final Logger logger = Logger.getLogger("BATTLE");
	@Override
	protected void process() {
		//缂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礃閹偤骞栧ǎ顒�濡奸柣顓燁殜楠炴牕菐椤掞拷婵¤偐绱掗幇顓ф疁闁哄备锟芥剚鍚嬮幖绮癸拷宕囶啈闂備胶顭堥鍌炲疾濞戞粎浜欓梻浣瑰缁诲倿骞婃惔銊ユ辈婵炲棙鎸婚悡鏇熺箾閸℃鐛滈柡锟芥繝姘厪闁搞儜鍐句純閻庢鍠曠划娆愪繆濮濆矈妾ㄩ梺鍝勬４缁绘繂顫忛搹鍦煓闁秆勵殢閿熻姤顨婇弻銊╁即濡尨鎷峰┑瀣槬闁靛绠戠欢鐐烘煙闁箑澧版い鏃�甯″楦裤亹閹烘繃娈ョ紓渚婃嫹濞撴熬鎷风�规洘绮撻弻鍡楊吋閸″繑瀚奸梻浣告啞閹逛胶浜稿▎鎾冲偍婵炴垯鍨洪悡鏇㈡煙閹呮憼闁汇劍鍨圭槐鎺楊敊閻ｅ本鍣伴梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�?
		final long hostid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (hostid <= 0)
			return;
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔芥祰闂傚倷鑳堕…鍫燁殽閸濄儻鎷峰☉鎺撴珚濠碉紕鏁诲畷鐔碱敍濮樿京娼夐梻浣侯焾閺堫剛绮欓幒妤佸仧妞ゅ繐鐗婇埛鎴︽煙閼测晛浠滃┑鈥炽偢閺屾洟宕奸悢绋匡拷鎰拷娈垮枛椤兘寮幇鏉垮窛妞ゅ繐鎳忛弳濠囨⒒娴ｈ櫣甯涢柛鏃撶畵瀹曟粌顫濋懜闈涗户闂佸搫鍊归娆忋�掓繝姘厪闁割偅绻冮ˉ鐐烘煟閹惧崬鍔ょ紒杈ㄥ笚瀵板嫮浠﹂幆褎鐣俊鐐�栧ú鈺冨緤閸撗嶆嫹闂堟稏鍋㈡鐐寸墵椤㈡﹢鎮㈤崨濠勫建婵犵數濮甸鏍窗濡ゅ懏鏅濋柍鍝勬噹閸屻劌鈹戦崒婊庣劸缂侊拷閸儲鐓忓┑鐐靛亾濞呭棝鏌嶉柨瀣伌婵﹤顭峰畷鐓庮潩椤撶喓褰堢紓鍌欑筏閹风兘鎮楅敐搴℃灍闁绘挻娲熼弻锟犲磼濮橆厼浠撮梺鍛婄懃鐎氼噣鏁撻崐鐕佹綈婵炲弶绮撳顐ｇ節濮橆剚鐎梺鐟板⒔缁垶寮查幖浣圭叆闁绘洖鍊圭�氾拷
				Role gRole = RoleManager.getInstance().getRoleByID(objectid);
				if (gRole == null){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
					return false;
				}
				xbean.Properties guestprop=xtable.Properties.select(objectid);
				if(guestprop==null){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
					return false;
				}
				//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涘Ο鐓庡付闁崇粯鎸搁…銊╁礃閻愵剙鐦滈梻渚�娼ч悧鍡涘箠閹邦喚涓嶅ù鐓庣摠閸婂灚鎱ㄥΟ鐓庡付闁哄鍊楃槐鎺楊敊绾拌京鍚嬪Δ鐘靛仦鐢帟鐏冩繛鎾磋壘濞诧箓藟婵犲啩绻嗛柣鎰典簻閿熻姤鐗滈弫顕�骞掑婵嗘喘椤㈡稑鈽夊鍏奸敜婵犲痉鏉匡拷鏇㈠疮閹殿喖顥氶柛蹇涙？缁诲棝鏌曢崼婵堢閻庢艾缍婂铏圭矙閸栤�充紣闂佽绻戠换鍫ャ�佸鑸垫櫜濠㈣泛锕ら悗顓烆渻閵堝棗濮傞柛銊ㄥ吹缁綁鎮欓悜妯煎幗闂婎偄娲﹀ú鏍ㄧ瑜旈弻娑氾拷锝庡亝鐏忣參鏌嶇拠鑼у┑顕嗘嫹闂佺粯锕╅崑鍛村棘閿熻姤淇婇悙顏勶拷鏍ь潖婵犳艾鐤炬い鎰╁�楁稉宥嗕繆椤栨繂浜圭痪鎯у悑閵囧嫰寮撮悙鏉戞闂佽楠忔俊鍥晸閸婄噥娼愭繛鍙夌墱缁辩偞绻濋崶銉嫹娴ｈ倽鏃堝川椤撶媴绱叉繝鐢靛Т閿曘倝骞婇幇鏉垮偍闁绘绮埛鎺懨归敐鍛暈闁诡垰鐗婇妵鍕晜鐠囪尙浠搁梺璇″枟閿氶柍瑙勫灴瀹曞爼鍩￠崘鎯ф櫗闂傚倷鐒﹂幃鍫曞磿濞差亜绀堟慨妯垮煐閸嬪倿鏌曟径娑橆洭缂佺娀绠栭弻鐔猴拷鐢告櫜缁辫櫕銇勮箛鎾跺闁跨喕妫勯崯顐﹀煝鎼淬劌绠ｉ柣妯碱暜缁卞弶绻濆閿嬫緲閿熺獤鍥х闂佸灝顑冩禍婊堟煥閺冨倸浜鹃柡鍡╁墯椤ㄣ儵鎮欑拠褍浼愰柧缁樼墵閺屾稑鈽夐崡鐐茬濡炪倖鎸诲钘夘潖濞差亜鎹舵い鎾跺仜婵″搫鈹戦纭峰伐妞ゎ厾鍏橀悰顔藉緞閹板灚鏅梺璺ㄥ枙濡嫰锝炶箛鎾佹椽顢旈崨顓濈敾闂備浇顫夐鏍窗濡ゅ懎绠熷┑鍌氭啞閻撶喐銇勮箛鎾愁伌婵☆垽鎷烽梻浣告惈閺堫剟鎯勯姘煎殨妞ゆ洩鎷锋鐐达耿瀵爼骞嬮婵堝
				fire.pb.PropRole hostprole = new fire.pb.PropRole(hostid, true);
				Role hostrole = RoleManager.getInstance().getRoleByID(hostid);
				if(hostrole != null){
					if(COffTitle.isLiveDieTitle(hostprole)){
						fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162088, null);
						return false;
					}
				}
				//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾粌顤�闂佺顑戠换婵嬪蓟瀹ュ浼犻柛鏇ㄥ墮濞咃綁姊婚崒姘簽闁搞劌鐖煎濠氭晲婢跺﹦顓洪梺鎸庣箓閹叉盯骞樺ǎ顑跨盎闂侀潧顦介崹杈╋拷姘炬嫹?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ｅΟ鍏兼毄闁绘帒鍚嬬换娑㈠箻鐎电鏆￠梺鍦厴椤ユ捇鏁撻崐鐕佹綈婵炲弶绻堥敐鐐村緞瀹�锟介惌澶愭煙閻戞ɑ顥栭柟椋庡厴閺佹劖鎯斿┑鍫濆毈婵＄偑鍊戦崕鑼崲閸岀偐锟芥棃宕橀鍢壯囨煕閳╁厾顏堝汲濡ゅ懏鈷戦柛婵勫劚瀛濋梻浣稿簻缂嶄線鐛崘銊庣喓鎷犻懠顒傜嵁闂備礁缍婇崑濠囧储妤ｅ啫鍌ㄩ柟闂寸劍閳锋垿鏌涘☉姗堟敾缂侊拷鐎ｎ偆绠惧ù锝呭暱濞诧箓宕愰崼鏇熺厽婵☆垵鍋愮敮娑㈡煟閹惧鎳勯柕鍥у瀵粙濡歌閸ｎ喖顪冮妶蹇氼吅闂傚嫬瀚版俊鐢稿礋椤栨碍顥濋柣鐘充航閸斿酣顢欓幒妤佲拺闁荤喐澹嗛敍宥呪攽閻戝洦瀚规俊鐐�戦崹娲�冩繝鍌滄殾闁圭儤鍩堥悡銉╂煕閺囨ê濡介悗鍨殔閳规垿鎮╅崹顐ｆ瘎闂佺顑囬崑銈呯暦瑜版帒閱囬柡鍥╁仧椤斿洭姊鸿ぐ鎺擄紵缂佽绻濆顐﹀礋椤栨稓鍘卞銈嗗姉婵挳鎮橀鍡嫹鐟欏嫭绀冮柣鎿勭節瀵鈽夐姀鐘电杸闂傚倸鐗婄粙鎺楁倶閸垻纾藉ù锝呮惈椤庢挾绱掗懠顒�浜剧紒宀冮哺缁绘繈宕堕懜鍨珫婵犵數濮撮敃銈囷拷姘煎墮閳绘挾浠﹂崜褏鐦堝┑鐐茬墕閻忔繂鈻嶅▎鎾寸厵闁告垯鍊栫�氾拷
				xbean.LiveDieRoleInfo hostliveDieRoleInfo=xtable.Livedieroleinfotab.select(hostid);
				if(hostliveDieRoleInfo!=null){
					if(System.currentTimeMillis()-hostliveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						String name=new PropRole(hostliveDieRoleInfo.getObjectid(),true).getName();
						if(objectid==hostliveDieRoleInfo.getObjectid()){
							//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡寮堕崼姘珔闁搞劍绻冮妵鍕冀椤愵澀绮剁紓渚婃嫹濠㈣泛顑勭换鍡涙煏閸繃鍣洪柛锝囨嚀椤╁ジ宕ㄩ娑欐杸濡炪倖姊归弸缁樼瑹濞戙垺鐓曢柟鍨閻ｇ數锟借娲﹂崹璺虹暦閵娧嶆嫹濞戞瑯鐒介柛妯哄⒔缁辨帡鎮欓浣哄嚒閻庤娲﹂崜姘跺疾閼搁潧顕遍悗娑欘焽閸樹粙姊洪棃娑辨Ф闁稿孩鐓″畷鐢稿炊椤掍胶鍘搁柣蹇曞仜婢т粙鍩ユ径鎰厓閻犲洦鐓￠崣鍕殽閻愬弶鍠樻い銏☆殜瀹曟帒鈻庨幋鐙�妲�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁躲倝鏌涜椤ㄥ懘鎮块悙顑句簻闁规壋鏅涢敓鑺ヮ殕缁嬪顓兼径瀣弳闂佺粯娲栭崐鍦拷姘炬嫹162073
							fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162073, Arrays.asList(name));
						}else{
							//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡寮堕崼姘珔闁搞劍绻冮妵鍕冀椤愵澀绮剁紓渚婃嫹濠㈣泛顑勭换鍡涙煏閸繃鍣洪柛锝囨嚀椤╁ジ宕ㄩ娑欐杸濡炪倖姊归弸缁樼瑹濞戙垺鐓曢柟鍨閻ｇ數锟借娲﹂崹璺虹暦閵娧嶆嫹濞戞瑯鐒介柛妯哄⒔缁辨帡鎮欓浣哄嚒閻庤娲﹂崜姘跺疾閼搁潧顕遍悗娑欘焽閸樹粙姊洪棃娑辨Ф闁稿孩鐓″畷鐢稿炊椤掍胶鍘搁柣蹇曞仜婢т粙鍩ユ径鎰厓閻犲洦鐓￠崣鍕殽閻愬弶鍠樻い銏☆殜瀹曟帒鈻庨幋鐙�妲�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁躲倝鏌涜椤ㄥ懘鎮块悙顑句簻闁规壋鏅涢敓鑺ヮ殕缁嬪顓兼径瀣弳闂佺粯娲栭崐鍦拷姘炬嫹162074
							fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162074, Arrays.asList(name));
						}
						return false;
					}
				}
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔戒氦缂傚倸鍊烽懗鑸靛垔鐎靛摜绀婂〒姘炬嫹鐎殿喖顭烽幃銏ゆ偖鐎涙ê顏堕梺姹囧灪椤旀牠鎮為幆顬″綊鎮崨顓ф喘缂備緡鍣崣鍐嵁鐎ｎ喗鏅滈悷娆欑稻鐎氬ジ姊绘担鍛婂暈缂佸鍨块弫鍐晝閸屾氨鏌堥梺鑲┾拡閸撴稓澹曟總鍛婄厽婵☆垰鎼弳閬嶆煟韫囨搩鍤熼柨鐔凤拷鐕佹綈婵炲弶锕㈤幃鐑藉煛閸涱厽鐎悗骞垮劚椤︻垳绮堢�ｎ偁浜滈柟鎹愭硾椤庢挾绱掓潏銊у弨婵﹦绮换婵囨償閳ヨ尙鐩庢繝鐢靛仩椤曟粎绮婚幘鎰佸殨濠电姵鑹炬儫闂佹寧娲╅幏椋庣磼閸撲礁浠ч柨鐔绘缁犲秹宕曢柆宓ュ洦瀵肩�涙ê浜楅梺鍝勬川閸犳挾绮绘ィ鍐╃厱闁斥晛鍘鹃鍛弿闁挎梻鏅粻楣冩煕椤愩倕鏋旈柟鍐叉噽缁辨帗娼忛妸銉ь儌闂佸綊顥撴繛锟芥鐐存崌楠炴帡骞橀幖顓炴櫔闂備浇顕у锕傦綖婢跺♁鍝勎熼搹瑙勬畷闂佸綊妫块梽宥夋晸閹存帞绐旂�殿喗鎸虫慨锟介柣姗�娼ф慨鍫曟⒒娴ｅ憡鍟為柛鏃撻檮缁傚秴鈹戦崼锝呅￠梺缁樺姉閸庛倝鍩涢幒鎳ㄥ綊鏁愰崨顔跨濠电媴鎷峰ù鐘差儐閻撴洟鏌￠崒婵囩《闁诲繘浜堕弻銊╂偄鐠囨畫鎾绘煕閹存繄绉虹�规洩缍佸畷姗�濡歌濞堥箖鎮峰鍛暭閻㈩垪鏅犲顐﹀幢濡炴洖缍婇弫鎰板醇濞戣櫕瀚归柨鐔剁矙閺岋紕锟斤綀鍩栫�氾拷?
				Long selfid=xtable.Livedie2key.select(hostid);
				if(selfid!=null){
					xbean.LiveDieRoleInfo otherLiveDieRoleInfo=xtable.Livedieroleinfotab.select(selfid);
					if(otherLiveDieRoleInfo!=null&&System.currentTimeMillis()-otherLiveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						String name=new PropRole(selfid,true).getName();
						fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162076, Arrays.asList(name));
						return false;
					}
				}
				//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倝绠栭弻宥夊传閸曨剙娅ｇ紓浣瑰姈椤ㄥ棙绌辨繝鍥ч柛娑卞枛濞呫倝姊虹粙娆惧剰妞わ妇鏁诲濠氬Ω閵夈垺鏂�闂佺硶妾ч弲婊勵殭闂傚倷绀侀幉锟犳偡閿曪拷鐓ゆ慨妤嬫嫹濠碉紕鏁诲畷鐔碱敍濮樿京鏉搁梻浣告啞閹哥兘鎳楅崼鏇熸櫖闁绘柨鍚嬮埛鎴︽煠婵劕锟芥洟寮搁幋锔界厱闁哄喛鎷烽柣鐔叉櫅椤曪絾绻濆顓熸闂佺粯蓱閻擄繝宕捄琛℃斀闁绘灏欐禒娑㈡煕閺冿拷閻楁銆冨▎鎾粹拻闁稿本鐟︾粊鐗堜繆濡炵厧濮傞柟顔惧仱閺佸啴宕掑槌栧敹闂備礁缍婂Λ璺ㄦ閵堝洨绀婇柡宥庡幗閻撳繘鐓崶褜鍎忛柣蹇ｅ枤閻ヮ亪骞嗚閹垵菐閸パ嶈含妞ゃ垺绋戦埞鎴﹀炊閺堥潧鎽嬫繝鐢靛仜椤曨厽鎱ㄩ悽闈涘灊閹艰揪绲鹃～鏇㈡煙閹呮憼濠殿垱鎸抽弻娑㈠箻閸愯尙楠囬柡浣哥墛缁绘繈鎮介棃娴剁偤鏌涢妸锔姐仢闁炽儻绠撳畷濂稿Ψ閵夊函绠撻弻鐔兼偋閸喓鍑￠梻浣斤骏閸婃牗绌辨繝鍥ч柛鏇ㄥ幖婵¤棄鈹戦悙鍙夊櫤闁绘濞�瀵鏁愰崼銏㈡澑闂佸搫娲ㄩ崑姗�宕Δ鍛拺缂佸顑欓崕鎰版煕閺冿拷閻熲晠鐛崘銊ф殝闁逛絻娅曢弬锟介梺璇插嚱缂嶅棝宕戦崱娑樺偍濡わ絽鍟埛鎴︽煙椤栧棗瀚々浼存⒑缁嬫鍎忛悗姘嵆楠炲啫螣閼姐倗鐦堥梺鍛婃处閸橀箖鏁嶅鍐ｆ斀閹烘娊宕愯楠炲繘鎮滈懞銉у幍闂佹儳娴氶崑鎾绘嚀閸ф鐓熸繛鎴濆船閺嬨倝鏌ㄩ悢鍛婄伄缂傚秴妫濋弫鎾剁驳鐎ｎ亜绠婚梺鍝ュУ閻楃娀鐛崘顔藉�婚柦妯侯槺妤犲洤鈹戦悙鍙夘棤闁稿鎸搁湁闁跨噦鎷�
				fire.pb.PropRole guestprole = new fire.pb.PropRole(objectid, true);
				if(COffTitle.isLiveDieTitle(guestprole)){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162089, null);
					return false;
				}
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔芥祰闂傚倷鑳堕…鍫燁殽閸濄儻鎷峰☉鎺撴珚濠碉紕鏁诲畷鐔碱敍濮樿京娼夐梻浣侯焾閺堫剛绮欓幒妤佸仧妞ゅ繐鐗婇埛鎴︽煙閼测晛浠滃┑鈥炽偢閺屾洟宕奸悢绋匡拷鎰拷娈垮枛椤兘寮幘缁樺亹闁肩⒈鍓﹀Σ褰掓⒒閸屾艾锟芥悂鎮ф繝鍕煓闁规儳顕々鐑芥煃閸濆嫭鍣洪柍閿嬪灴閹綊宕堕敐蹇斿鐎规洖娲ｉ幋鐑芥⒒娴ｈ櫣甯涢悽顖ｄ簼娣囧﹪宕堕埡浣哥亰濠电偛妫欓崝鏇犳閻愮鎷烽惂鍛婂闁诲函缍嗛崑鍕敂閸洘鈷戦柟绋挎捣缁犳挸螖閻樿櫕鍊愰柣娑卞枛铻ｉ柤娴嬫櫇閿涙粓姊虹紒妯忣亞澹曢鐔告珷闁汇垹鎲￠悡娑氾拷鐧告嫹闁跨喍绮欏畷浼村箻缂佹ɑ娅㈤梺鍏间航閸庢娊鍩︽笟锟介弻宥囩箔閸濆嫸鎷烽弽顐ょ处闁伙絽鐬奸惌娆撴偣娓氼垳鍘涙俊鑼厴濮婄粯鎷呴懞銉с�婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�
				xbean.LiveDieRoleInfo geustliveDieRoleInfo=xtable.Livedieroleinfotab.select(objectid);
				if(geustliveDieRoleInfo!=null){
					if(System.currentTimeMillis()-geustliveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						String name=new PropRole(objectid,true).getName();
						fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162077, Arrays.asList(name));
						return false;
					}
				}
				//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倝绠栭弻宥夊传閸曨剙娅ｇ紓浣瑰姈椤ㄥ棙绌辨繝鍥ч柛娑卞枛濞呫倝姊虹粙娆惧剰妞わ妇鏁诲濠氬Ω閵夈垺鏂�闂佺硶妾ч弲婊呯懅闂傚倷绀侀幉锟犳偡閵夆晜鏅濋柕澶嗘櫅妗呴梺鍛婃处閸ㄤ即宕橀敓浠嬫⒑闂堟丹娑氫沪閻愵剦鍟囬梻鍌氬�烽懗鍫曗�﹂崼鐕佹闁归棿鐒﹂弲婵囥亜韫囨挾澧曢柦鍐枛閺岋綁寮崒姘粯缂備胶濮电敮锟犲蓟閻斿吋鍊绘俊顖濇娴犲瓨绻濆▓鍨灈闂佸府缍侀獮鍐ㄧ暋闁妇鍙嗛梺鍛婃处閸撴盯宕欓敓鐘斥拺缂備焦锕╁▓鏃堟煥閺囶亜顩柛鎺撳笧閿熸枻缍嗘禍鍫曞触鐎ｎ亶鐔嗛悹铏瑰皑瀹搞儵鏌ら弶璺ㄤ虎闁宠鍨堕獮濠囨煕婵炑冩搐缁狀垶鏌ｉ幋锝呅撻柣鎾跺枛閺岀喖鎮滃Ο鑽ゅ弳闁汇埄鍨伴悥鐓幬涙担鐟扮窞閻庯綆鍓涢惁鍫熺節閻㈤潧孝闁稿﹤缍婅棢闁绘劖鐣禍婊堢叓閸ャ劍绀�閺嶏紕绱撴担铏瑰笡闁烩晩鍨伴悾閿嬬附閸涘﹤浜滄俊鐐差儏缁ㄨ偐妲愬┑鍥︾箚闁靛牆娲ゅ暩闂佺顑嗛惄顖炪�侀弽顓炲窛闁规鍠曢懜顏堟⒒閸屾瑦绁扮�规洜鏁诲畷浼村箛椤掑鍞靛┑顔筋殣閹风兘鏌ㄥ┑鍫濅槐闁轰焦鎹囬弫鎾绘晸閿燂拷
				Long otherid=xtable.Livedie2key.select(objectid);
				if(otherid!=null){
					xbean.LiveDieRoleInfo otherLiveDieRoleInfo=xtable.Livedieroleinfotab.select(otherid);
					if(otherLiveDieRoleInfo!=null&&System.currentTimeMillis()-otherLiveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						if(otherLiveDieRoleInfo.getObjectid()==hostid){
							String name=new PropRole(objectid,true).getName();
							fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162075, Arrays.asList(name));
							return false;
						}else{
							String name=new PropRole(objectid,true).getName();
							fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162077, Arrays.asList(name));
							return false;
						}
					}
				}
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾捐鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ｅΟ璇插闁稿鍔岄埞鎴︻敊缁涘鍔稿┑鐐差槹缁嬫挾妲愰幒妤�鐓涢柛娑卞枤閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷
				List<Long> list = new ArrayList<Long>();
				list.add(hostid);
				list.add(objectid);
				mkdb.Lockeys.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, list));
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔鏌ユ晸閽樺锟藉潡銆佸▎鎾崇鐟滃繘藝椤栨稓绠鹃弶鍫濆⒔閹偐鐥鐐靛煟鐎殿喚顭堥鍏煎緞婵犲嫷鍟囨繝鐢靛剳缂嶅棝宕滃▎鎰箚濞寸姴顑嗛悡鐔兼煙閸喖顏紒澶樺櫍閺岀喖顢欏▎鐐秷闂侀潧鐗炵粻鎾荤嵁閹邦厽鍎熸い鏃囶嚙閹藉鈹戦敍鍕杭闁稿﹥娲橀〃銉ㄧ疀濞戞顔嗛梺璺ㄥ櫐閹凤拷
				fire.pb.item.Pack bag = new fire.pb.item.Pack(hostid, false);
				int cost=LiveDieMange.getLiveDieCostMoney();
				if(bag.getMoney()<cost){
//					MessageMgr.sendMsgNotify(hostid, 145005, null);
					return false;
				}
				if (bag.subMoney(-cost, "濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻鐔兼⒒鐎垫瓕绐楅梺杞扮鐎氫即寮诲☉銏犵労闁告劦浜栧Σ鍫ユ⒑閹肩偛濡奸柛濠傜秺婵＄敻宕熼姘鳖唺閻庡箍鍎遍悧鍡涘储閿熺姵鈷戠�规洖娲ㄧ敮娑欑箾閼碱剙鏋涚�殿喖顭锋俊鎼佸煛娴ｈ櫣娼夐梻浣规偠閸庢椽鎮￠崼婢盯宕熼娑掓嫼闂佸憡鍔栬ぐ鍐ㄎｉ懡銈囩＜缂備焦鈼ら鍫稏闊洦姊荤弧锟藉┑顔斤供閸撴盯藝娴煎瓨鈷戦悗鍦У閵嗗啰绱掗煬鎻掞拷婵嬬嵁韫囨挾鏆嬮柟浣冩珪閺傦拷闂佽鍑界紞鍡樼閻愪警鏁婇柟杈鹃檮閻撴稑顭跨捄鐚村姛濠⒀勫姍閺岋繝宕ㄩ鍓х厜閻庢鍠楁繛濠囧极閹剧粯鏅搁柨鐕傛嫹?", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_xiazhanshu, 0) != -cost) {
//					MessageMgr.sendMsgNotify(hostid, 145005, null);
					return false;
				}
				hostliveDieRoleInfo=xtable.Livedieroleinfotab.get(hostid);
				//濠电姷鏁告慨鐑藉极閹间礁纾块柟瀵稿Т缁躲倝鏌﹀Ο渚＆婵炲樊浜濋弲婊堟煟閹伴潧澧幖鏉戯躬濮婅櫣绮欑捄銊т紘闂佺顑囬崑銈呯暦閹达箑围濠㈣泛顑囬崢顏呯節閻㈤潧浠ч柛瀣尭閳诲秹宕ㄧ�涙鍘搁柣搴岛閺呮繄绮ｉ弮鍫熺厸鐎癸拷鐎ｎ剙鍩岄柧缁樼墵閺屻劑鎮㈤崜浣虹厯闂佽鍟崶褍鑰垮┑鐐叉閸ㄥ綊鎮炴ィ鍐┾拺闁圭瀛╃粈锟介梺绋匡工閹芥粎鍒掗弰蹇嬩汗闁圭儤鎸鹃崣鍡涙⒑缂佹ɑ绀�闁稿﹤婀遍敓鑺ョ啲閹凤拷?
				if(hostliveDieRoleInfo==null){
					hostliveDieRoleInfo=xbean.Pod.newLiveDieRoleInfo();
					xtable.Livedieroleinfotab.insert(hostid, hostliveDieRoleInfo);
				}
				hostliveDieRoleInfo.setObjectid(objectid);
				hostliveDieRoleInfo.setSelecttype(selecttype);
				hostliveDieRoleInfo.setInvitationtime(System.currentTimeMillis());
				hostliveDieRoleInfo.setAcceptflag(0);
				
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡寮堕崼姘珔闁搞劍绻冮妵鍕冀閵娧呯厑闂佸搫妫欑划鎾诲蓟閻斿吋鍊绘慨妤�妫欓悾鍫曟⒑濞茶骞楁い銊ワ躬瀵鈽夐姀鐘靛姶闂佸憡鍔︽禍鏍ｉ崼銏㈢＝濞撴艾锕ョ�氬綊姊虹粙璺ㄧ伇闁稿鍋ゅ畷鎰版偨閸涘﹦鍘遍梺鎸庢椤曆囩嵁閺嶎偂鐒婇煫鍥ㄦ礈绾捐棄銆掑顒佹悙闁哄鍠栭弻鐔兼偡閻楀牆鏋犲Δ鐘靛仜閸熸潙鐣锋總绋垮嵆闁绘柨鎲￠鐔兼⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�?
				Long object=xtable.Livedie2key.get(objectid);
				if(object==null){
					xtable.Livedie2key.insert(objectid, hostid);
				}else{
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熶粙鎮块濮愪簻闁规澘鐖煎顕�鏌涚�ｎ亶妯�闁哄矉缍侀獮姗�宕樺顔兼暔婵犵數鍋為崹顖炲垂閸︻厾涓嶅ù鍏兼綑缁犲綊鏌熺喊鍗炲箺缂佽埖纰嶉幈銊ヮ潨閸垻鏆ゅ┑顔硷攻濡炰粙鐛弽顓熷�烽柟缁樺笒椤垿姊绘担鍛婂暈闁哄被鍔庣划鏃堟偡閹殿喗娈惧┑鐐叉▕娴滄粎澹曢崗鍏煎弿闁挎繂楠搁獮姗�鏌熼搹顐ｅ磳闁炽儻绠撴俊鎼佸煛娴ｄ警妲伴梻浣稿暱閹碱偊顢栭崶褜鍟呮繝闈涚墢绾句粙鏌涚仦鍓ф噭缂佷焦婢橀—鍐级閹寸偞鍠愰梺鐟扮畭閸ㄨ棄鐣锋總绋课ㄩ柕澶堝妽閹蹭即姊虹拠鑼闁稿鍠栭幃娲籍閸繆袝闁诲函缍嗛崰妤呮偂閺囥垺鐓冮柍杞扮閺嬨倝鏌ｉ幒宥囩煓闁哄本绋戣灒閻犲洦褰冮～鎺楁⒑閸濆嫮鐒跨紓宥勭窔楠炲啴鍩￠崒娑氱Ф闂佸啿鎼敃銉ㄢ叺濠电姷鏁告慨顓㈠箯閸愵喖纾兼繝濠傛噽閸橆垶姊绘担绛嬪殐闁哥姵鐗曢…鍥灳瀹曞洦娈鹃梺鍛婎殘閸嬫劕危閸喍绻嗘い鏍ㄥ殠閿熻棄顑囧Σ鎰版晸閿燂拷?
					xtable.Livedie2key.remove(objectid);
					xtable.Livedie2key.insert(objectid, hostid);
				}
				SInvitationLiveDieBattleOK sInvitationLiveDieBattleOK =new SInvitationLiveDieBattleOK();
				sInvitationLiveDieBattleOK.sourceid=hostid;
				sInvitationLiveDieBattleOK.sourcename=hostprole.getName();
				sInvitationLiveDieBattleOK.selecttype=selecttype;
				Onlines.getInstance().send(objectid, sInvitationLiveDieBattleOK);
				
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁躲倝鏌熼鍡楁湰鐎靛本绻涚�电孝妞ゆ垵鎳愮划鍫ュ磼閻愬鍘遍梺闈涱槶閸ㄥ搫鈻嶉崶鈺冩／闁硅鍔栭ˉ澶愭婢舵劖鐓ユ繝闈涙閸ｆ椽鏌熼姘卞ⅵ闁哄矉绱曢敓鏂ょ秵娴滎亪宕ｉ崟顖涚厸閻忕偛澧介埥澶愭煃鐠囨煡鍙勬鐐叉喘椤㈡﹢鎮敓钘壩ｈぐ鎺撶厽閹兼番鍊ゅ鎰箾濞村娅婃鐐茬箻閺佹捇鏁撻敓锟�?
				String hostname=new PropRole(hostid,true).getName();
				String guestname=new PropRole(objectid,true).getName();
				MessageMgr.sendSystemMsg(162066,Arrays.asList(hostname,guestname));
				
				logger.info("闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�搁埞鎴︽偐鐎圭姴顥濈紓浣瑰姈椤ㄥ﹪寮婚悢绋款嚤闁哄鍨抽崰濠囨⒑鏉炴壆顦︽俊顐ｇ箞瀵鎮㈤搹鍦紲闂侀潧绻掓慨鐢告倶閸垻纾藉ù锝呮惈椤庢挾绱掗弻銉х暫妤犵偛鐗撴俊鎼佸Ψ鎼淬垺顥堥柡浣规尰缁傛帞锟斤綆鍋勬禍閬嶆椤愩垺澶勬繛鍙夌矒閹矂宕卞Δ濠勫數闁荤姴鎼ぐ鍧楀醇濠㈩亷缍佸畷濂稿Ψ閿旀儳骞嶉梻浣虹帛閸旓箓宕滃▎鎰珷妞ゆ牜鍋為悡鏇㈠箹濞ｎ剙鐏╁┑顔肩Ч閺岋紕浠﹂崜褎鍒涢梺鐐藉劵缁犳捇鐛�ｎ亖鏀介柛鈾�鏅滃ù鍥╃磽閸屾艾锟介绮堟笟锟介、鏍箣閿曪拷缁狀垶鏌ㄩ悤鍌涘?,闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕鍏肩節婵犲倹濯奸柛搴嫹"+hostid+"\t闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘鎳為柆宥嗗殐闁宠桨鑳剁粵蹇旂節閻㈤潧校闁绘棏鍓涚槐鐐哄冀瑜滈悢鍡涙偣鏉炴媽顒熼柛搴㈠姈缁绘盯宕ㄩ姣匡絿绱掔紒妯兼创妤犵偞锚閻ｇ兘宕惰缁愶拷"+objectid+"\t闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗霉閿濆懎顥忛柛銈嗘礋閺屾盯顢曢敐鍡欘槬闂佹悶鍔岄崐鍧楀蓟濞戞粠妲煎銈冨妼閹虫劗鍒掔紒妯侯嚤閻庢稒顭囬崢鍗烆渻閵堝棗濮х紒鎻掑⒔缁牓鏁撴禒瀣拺闁告繂瀚烽崕搴ｇ磼閿熻姤绗熼敓钘夛耿娓氾拷濮婅櫣绮欑捄銊ь唶闂佸憡鑹鹃鍥╂閻愬搫绠ｉ柣鎰暩椤旀洟姊洪崨濠勭煀闁哥噥鍨抽敓鑺ョ啲閹凤拷"+cost);
				return true;
			};
		}.submit();
		
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793835;

	public int getType() {
		return 793835;
	}

	public long objectid; // 目标玩家id
	public int selecttype; // 0单人   1组队

	public CInvitationLiveDieBattleOK() {
	}

	public CInvitationLiveDieBattleOK(long _objectid_, int _selecttype_) {
		this.objectid = _objectid_;
		this.selecttype = _selecttype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(objectid);
		_os_.marshal(selecttype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		objectid = _os_.unmarshal_long();
		selecttype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CInvitationLiveDieBattleOK) {
			CInvitationLiveDieBattleOK _o_ = (CInvitationLiveDieBattleOK)_o1_;
			if (objectid != _o_.objectid) return false;
			if (selecttype != _o_.selecttype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)objectid;
		_h_ += selecttype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(objectid).append(",");
		_sb_.append(selecttype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CInvitationLiveDieBattleOK _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(objectid - _o_.objectid);
		if (0 != _c_) return _c_;
		_c_ = selecttype - _o_.selecttype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

