package gnet.link;

import fire.log.Logger;

import fire.pb.EnterWorldThread;
import fire.pb.main.Gs;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __Dispatch__ extends mkio.Protocol { }

/** link to gs
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class Dispatch extends __Dispatch__ {
	
	static private final Logger logger=Logger.getLogger("SYSTEM");

	@Override
	public void dispatch(Stub stub) throws Exception {
		int error = Kick.E_PROTOCOL_UNKOWN;
		try {
			Stub stub2 = ((Coder) (getManager().getCoder()))
					.getStub(this.ptype);
			mkio.Protocol p = stub2.newInstance();
			OctetsStream octstram = OctetsStream.wrap(this.pdata);
			p.unmarshal(octstram);
			p.setConnection(this.getConnection());
			p.setContext(this);
			if(Gs.isShutDown.get())
				return;//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔曢顓犲姬閿熶粙姊哄Ч鍥х伈婵炰匠鍐懃闂備浇顕х�涒晝绮欓崼銉ョ柧婵炴垟鍋撻敓钘夋噺缁虹晫绮欑拠閿櫊閺屽秹宕崟顐嫹閻㈢绠繛宸簼閳锋垿鏌涢敂璇插季闁绘帞鍋撶换娑㈠箻椤曞懏顥栫紓渚囧枛椤兘鐛Ο鑲╃＜婵☆垳鍘ч獮宥夋⒒娴ｅ憡鍟為柛鏃�顭囨禍绋库枎閹寸姳绗夋繝鐢靛У绾板秹鎮￠悢鍏肩厵闁割煈鍠栭弳娆忣熆瑜嶉悺銊╁Φ閸曨垰顫呴柍钘夋閻や線鎮楃憴鍕闁哥姵鐗犻妴浣肝旈崨顓狅紲濠殿喗锕╅崜娑㈡偪閸曨垱鈷掗柛灞捐壘閿熻姤鎮傞垾锕傤敆閸曨偆锛涢梺鍛婃处閸婂煤椤忓懏娅囬梺绋挎湰娣囨椽骞楅弴銏♀拺闂傚牊鍗曢崼銉ョ柧婵炴垯鍨洪崑鍌涚節闂堟侗鍎愰柣鎾寸洴閺屾盯濡烽姀鈩冪彅闂佸搫顑呯粔鍓佹閹烘梹瀚氶柛娆忣樈濡繝姊洪棃娑欐悙閻庢矮鍗抽悰顕�宕堕锟界粈鍫澝归敐鍫濈ス闁硅揪闄勯悡鐔肩叓閸ャ劍宕岄柣娑欑矌缁辨帡鎮╅搹顐㈢３閻庢鍠栭…鐑藉春閸曨垰绀冮柍杞扮贰閿熻姤鎹囧娲川婵犲嫮绱伴梺绋垮閻╊垱淇婇崼鏇炶Е闁靛牆鎳愮粔娲煙椤曞懍閭�规洏鍔戦、娑橆煥閸曨剦鍟岄梻鍌氬�风粈浣革耿闁秮锟斤箓宕奸妷锔芥珖闂侀潧顦崕娲吹濡ゅ懏鐓曢柡鍥ュ妼楠炴帗绻涘畝濠侀偗闁哄本绋栫粻娑㈠即閻愯弓绮梻浣虹帛閹歌煤閺嶎厼鐓橀柟杈鹃檮閸嬫劙鏌涢…鎴濅簼婵絽瀚板铏圭矙濞嗘儳鍓抽梺绋款儍閸婃洟鎮鹃悿顖樹汗闁圭儤鍨块崬鍫曟⒑閸濆嫭宸濋柛瀣枛椤㈡瑩宕堕浣叉嫼闂佸憡绋戦敃锔剧磽濮樿埖鐓曢幖娣灩閳绘洟鏌熼姘辩劯妤犵偞顭囩槐鎺懳熼悡搴＄闂傚倷绶氬褏鎹㈤幒鎾村弿闂佸灝顑囬々閿嬬箾閹存瑥鐏柣鎾寸洴閺屾盯鍩勯崘鍓у姺闂佹椿鍘界敮锟犲蓟閳ュ磭鏆嗛柨鐔剁矙瀹曚即骞橀懜娈挎綗闂佸湱鍎ら〃鍛达綖閸涘瓨鐓熸俊顖濇閿涘秴霉濠婂簼閭慨濠勭帛閹峰懐鎲撮崟鈺�鎴烽梻浣告啞鐪夌紒顔界懇婵℃挳宕橀鐓庤�垮┑鈽嗗灠閻ㄧ兘寮ㄩ搹顐ょ瘈闁汇垽娼у瓭濠电偠顕滅粻鎾崇暦閹扮増鍊婚柤鎭掑劗閹峰姊洪崜鎻掍簽闁哥姵鎹囬崺锝夊Ψ閵夘喚鍞甸柣鐔哥懃鐎氼厾绮堢�ｎ喗鐓欐い鏃傜摂濞堟﹢鏌熼崣澶嬪唉鐎规洜鍠栭、妤呭磼閵堝柊鐐烘⒑閼姐倕鏋戠紒顔肩Т椤灝顫滈敓钘夌暦椤栫偛绾ч柟鎼灥閿熻棄鐏濋妴鎺戭潩閻愵剙顏舵繝娈垮枛閿曘儱顪冩禒瀣祦闁归偊鍘介崕鐔兼煥濠靛棙宸濋柡鍡愬�栫换婵堝枈濡椿娼戦梺绋款儏閹虫﹢骞冮悿顖ｆЬ闂佸憡甯楃敮鈥崇暦婵傜唯闁挎棁濮ら鐔封攽閻愬樊鍤熷┑顔芥尦椤㈡牠宕卞☉妯硷紮闂佹眹鍨归幉锟犲磻閳╁啰绠鹃柛鈩冾殘缁犵増銇勮箛锝勭敖缂佽鲸甯￠弫鎾寸鐎ｎ亞顦ㄩ梺宕囨嚀閵囨鑺辨繝姘拺闂傚牊渚楅悞楣冩煕鎼淬倖鐝柡鍛埣閺佸倻绮电�ｎ偒鍟嶉梻浣虹帛閸旀浜稿▎鎴犱笉闁规儼濮ら悡銉╂煟閺傛寧鍟為柣蹇ｅ枤缁辨挸顓奸崨顕呮＆閻庤娲樻繛濠囥�佸鑸垫櫢闁芥ê顦介崵鏇熴亜閹板墎鎮肩紒鈽呮嫹闂備焦鎮堕崕顖炲礉鎼淬劌鍌ㄩ柣鎰靛墰缁★拷濠电偛鐗嗛悘婵嬪几閻斿吋鐓曢柡鍐挎嫹婵炶尙鍠栧顐﹀箻缂佹ê娈熼梺闈涱檧婵″洭藝娴煎瓨鍊垫繛鍫濈仢閺嬬喖鏌ｉ幙鍕瘈鐎殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�
			
			if(logger.isDebugEnabled())
				logger.debug(new StringBuilder("Recv : class=").append(p.getClass().getName()).append(" size=").append(octstram.size()));
			
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亜顒㈡い鎰Г閹便劌顫滈崱妤�鈷掗梺缁樺笩濡嫰鍩為幋锔藉亹鐎规洖娴傞弳锟犳⒑閹惰姤鏁辨俊顐㈠暣瀵鈽夐姀鐘插祮闂侀潧顭堥崕浼存嚋椤忓牊鈷戠紓浣股戦悡銉︿繆椤愶絿鎳勭紒宀冮哺缁绘繈宕堕懜鍨珫婵犳鍠楄彠闁稿氦椴哥粋鎺懨洪鍛嫼闂佺厧顫曢崐鏇㈠几濞戙垺鐓曢悗锝庝悍瀹搞儲銇勯鐐村枠濠碘剝鎮傞崺锟犲磼濠婂啫姹查梻鍌欒兌缁垰顫忛懡銈呭灊妞ゆ牜鍊涙径瀣窞闁归偊鍘鹃崢浠嬫⒑閹稿海绠撴繛灞傚�濆畷銏拷娑櫭肩换鍡涙煙鐟欏嫬濮冮柛姘煎亞缁辨帗娼忛妸銉﹁癁闂佽鍠掗弲娑㈡偩閻戣棄鐐婇柨婵嗘－濞兼柨鈹戦敍鍕杭闁稿鍊濆畷鎴﹀川椤栨稑搴婇梺鍓插亖閸庤京绮婚弽顓熺厓闁宠桨绀侀弳鐐烘煕鎼达絽鏋涢柡灞炬礉缁犳稒绻濋崒姘ｆ嫟婵＄偑鍊栧Λ鎴﹀箯閿燂拷
			if(fire.pb.scene.MapThread.getInstance().tryAdd(p,stub2))
				return;
			
			//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垹绠婚悗闈涙啞閸Ｑ冾渻閵堝棙绌跨紒韫矙閹箖鏁撻悩宕囧姺闂佹寧妫佸Λ鍕儊濠婂牊鈷掑〒姘炬嫹婵炰匠鍥ㄥ亱闁糕剝銇傚☉妯锋婵炲棙鍔栭悵宄邦渻閵堝棗绗掗柛濠呭吹婢规洟宕楃粭杞扮盎闂佸搫鍟ú銈嗙瑜版帒鏋侀柛顐ｇ箥濞撳鏌曢崼婵嗘殭闁诲浚浜濇穱濠囶敃閵忕姵娈查梺閫涚┒閸旀垿寮幘瀵割浄閻庯綆鍋嗛崢顏堟⒑閸撴彃浜濈紒璇插暣钘熼柟杈鹃檮閻撴瑧锟界懓瀚伴崑濠囨偂閸忓吋鍙忓┑鐘插暞閵囨繄锟借娲忛崝宥囨崲濠靛绀冩い顓熷灦琚╅梻鍌氬�烽懗鍫曗�﹂崼銉晞闁告稒娼欑粻鐘充繆椤栨稑顕滈柨娑樺�圭换婵嬫偨闂堟刀銏ゆ煥閺囨ê锟芥繈鐛箛娑樼闁挎洩鎷风紒鐙�鍨伴—鍐拷锝庝簻椤掋垽鏌涢悩鍙夘棦闁哄本鐩鎾Ω閵夈儺娼炬俊鐐�х拹鐔煎礉瀹�鍕拷鏃堝礃椤斿槈褔鏌涢幇鈺佸妞ゎ剙鐗撳铏圭磼濮楀棙鐣烽梺鍦嚀濞差參骞冩导鎼晩閻犳亽鍔庨弶鎼佹⒑閸濆嫭绁╁ù婊勭箘閿熻姤鑹剧紞濠囧蓟閵娿儮鏀介柛鈩冧緱閿熻姤顨嗙换娑㈠川椤曞棜锟藉潡鏌＄仦绋垮⒉闁瑰嘲鎳樺畷婊堝箵閹烘垵顥撻梻鍌欑閹碱偊寮甸鍕剮妞ゆ牜鍋涢弰銉╂煕閺囥劌鐏犵紒锟介崘鈹夸簻闊洦鎸婚崳瑙勭箾閸涱啝鎴炵┍婵犲洦鍊锋い蹇撳閹风柉顦撮柨鐔剁矙濞佳囨儗閸屾氨鏆﹂柟鎯板Г閺呮煡鏌涘锟介悞锔剧礊鎼淬垻绡�闁汇垽娼ф牎闂佽偐鎳撴晶鑺ョ珶閺囥垹绀傞柛蹇曞帶瀵灝鈹戦绛嬫當婵☆偅顨婇悰顔碱潨閿熶粙寮婚弴銏犻唶妞ゆ劦婢�閸犲﹤鈹戦纭疯含缂傚倹宀告俊鐢稿箛閺夎法顔婂┑鐘绘涧濞村倸螞閺嶎厽鈷掑ù锝勮閻掑墽绱掔紒妯虹伌闁轰礁鍟存慨锟介柕鍫濇搐缁侊箓姊洪崨濠傚Е闁哥姵顨婂畷鎰節濮橆厾鍙冨┑鈽嗗灟鐠�锕�危閸濄儻鎷风憴鍕碍婵☆偅顨婇崺鐐哄箣閿旂粯鏅╅梺娲诲弾閸嬫帗绂嶉鍕殾妞ゆ牜鍋涢柨銈嗕繆閵堝繑瀚归梺绋胯閸旀垿寮婚妸銉㈡婵☆垯璀︽导锟界紓浣哄亾瀹曟ê螞閸曨垱绠掗梻浣瑰缁诲倸煤閿曞倸鍚归柨鐔剁矙濮婄儤娼幍顔煎闂佺瀛╂繛濠囧春閻愬搫绠ｉ柨鏇嫹闁诲繑濞婇弻褑绠涢敐鍛盎闂佸搫顑囨繛锟芥慨濠勫劋濞碱亪骞嶉鐓庮瀴闂備礁婀遍幊鎾趁洪銏㈠祦濠电姴娲﹂崐鐑芥煕濠靛棗鐝嬮柕濞у嫬鏋戞繝銏ｆ硾椤剟鎮楅崼鏇熺厪濠电偟鍋撳▍鍡涙煟閹捐泛鏋戦柕鍥у缁犳盯骞橀幇浣风礉婵犲痉銈呰敿婵炲拑绲垮Σ鎰板箳閹惧绉堕梺闈涱焾閸庤尙鎷犻悙鐑樺�垫繛鍫濈仢濞呮﹢鏌涢幘瀵告创妤犵偞鍨垮畷鐔碱敍濮ｅ皷鏅犻弻銊╁籍閸ヮ煈妫勯梺鍝勵儐缁嬫挾妲愰幘璇茬＜婵﹩鍓ㄩ幏閿嬵槹鎼达絿鐒兼繛鎾寸啲閹烽攱銇勯姀锛勫⒌鐎规洏鍔岄～銏ゅΧ閸涱喖鏋犻梺鍝勮嫰濡顢樻總绋垮耿婵☆垱妞挎禒褔姊婚崒娆戭槮闁圭⒈鍋婂畷鎰板醇閺囩偟锛欏┑掳鍊曢崯浼存儗閹剧粯鈷掗柛顐ゅ枙閿熸垝绮欓幃鐑芥焽閿旀儳寮抽梻浣告啞濞诧箓宕㈡ィ鍐╁亗濠㈣埖鍔栭崐鍨箾閸繄浠㈤柡瀣枔閹叉悂寮堕崹顔芥闂佺硶鏂傞崹娲箚閺冨牆惟闁靛／灞芥櫔闂備浇顕уù鐑藉极閹间讲锟斤箓宕奸妷褍绁﹂悗骞垮劚濞层劎澹曟禒瀣厱閻忕偛澧介幊鍛存煕閺傝法校闁靛洤瀚版俊鎼佸Ψ閿旂粯锟ョ紓鍌欑贰閸犳鎮烽埡鍛祦閻庯綆浜堕悢鍡樸亜韫囨挻鍣芥繛鎻掔摠閵囧嫰濮�閳藉懓锟藉灝鈹戦鍡樺闂備胶绮敃銏狀焽瑜旈獮妤冿拷锝庡枟閳锋帒霉閿濆牆袚缁绢厼鐖奸弻娑㈡晲韫囨洜鏆ゅΔ鐘靛仜缁绘﹢寮幘缁樻櫢闁跨噦鎷�
			if(EnterWorldThread.getInstance().tryAdd(p))
				return;
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紭闂佽法鍠愰崹婵嬫倿閿旂偓宕叉繝闈涱儏绾惧鏌ら幁鎺戝姢婵炴彃顕敓鍊燁潐濞叉粓宕伴弽顓滐拷渚�寮撮悪鍛闁挎繂楠告禍鐐烘煃閽樺妯�闁哄苯绉堕幏鐘诲蓟閵夈儱鍙婃俊銈囧Х閸嬬偤鏁嬮梺浼欑悼閸忔ê鐣烽崼鏇炵厸闁稿本绮ｉ幏鐑筋敃閿旇В鎷婚梺绋挎湰閻燂妇绮婇悧鍫㈢濠㈣泛顑嗙粈瀣拷瑙勬磻閸楁娊鐛Ο纭锋嫹濞戞顏勵嚕閸ф鐓熼幖娣妽濞懷囨煙鐠囇呯瘈鐎规洘顨呴…銊╁醇閻斿搫寮抽梻浣虹帛閺屻劍鏅舵惔銊﹀剹婵炲棙鍔掔换鍡樸亜閹扳晛鐏柛銈呮处閵囧嫰濮�閳╁啰顦版繝娈垮櫙閹风兘姊洪悙钘夊姕闁告挻鑹惧嵄闂侇剙绉甸埛鎺懨归敐鍛暈闁哥喓鍋ら弻娑㈠Ω瑜庨弳鈺冪磼鏉堚晛浠︾紒缁樼箞瀹曟帒顭ㄩ崟顒夊晭濠碉紕鍋戦崐鏍暜閹烘棑鎷峰鐓庡籍鐎殿喗鐓￠獮鏍ㄦ媴閸︻厼寮抽梻浣虹帛濞叉牠宕愰崷顓ㄦ嫹濮樼偓瀚�
			if(fire.pb.shop.srv.market.MarketThread.getInstance().tryAdd(p))
				return;
			
			p.dispatch(stub);
			return;
		} catch (mkio.MarshalError e) {
			error = Kick.E_MARSHAL_EXCEPTION;
			//if(logger.isDebugEnabled())
				logger.error(new StringBuilder("Dispatch : error=E_MARSHAL_EXCEPTION ptype=")
											.append(this.ptype)	);
		} catch (Throwable e) {
			error = Kick.E_PROTOCOL_EXCEPTION;
			//if(logger.isDebugEnabled())
				logger.error(new StringBuilder("Dispatch : error=E_PROTOCOL_EXCEPTION ptype=")
											.append(this.ptype)	);
		}
		
		Kick kick = new Kick();
		kick.error = error;
		kick.action = Kick.A_DELAY_CLOSE;
		kick.linksid = this.linksid;
		kick.send(super.getConnection());
		
		logger.error(new StringBuilder("Kick User error=").append(error).append(" action=").append(Kick.A_DELAY_CLOSE).append(" linksid=").append(this.linksid)	);
		
	}

	@Override
	protected void process() {
		throw new UnsupportedOperationException();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 65541;

	public int getType() {
		return 65541;
	}

	public int linksid;
	public int userid;
	public int ptype;
	public com.locojoy.base.Octets pdata;

	public Dispatch() {
		pdata = new com.locojoy.base.Octets();
	}

	public Dispatch(int _linksid_, int _userid_, int _ptype_, com.locojoy.base.Octets _pdata_) {
		this.linksid = _linksid_;
		this.userid = _userid_;
		this.ptype = _ptype_;
		this.pdata = _pdata_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(linksid);
		_os_.marshal(userid);
		_os_.marshal(ptype);
		_os_.marshal(pdata);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		linksid = _os_.unmarshal_int();
		userid = _os_.unmarshal_int();
		ptype = _os_.unmarshal_int();
		pdata = _os_.unmarshal_Octets();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof Dispatch) {
			Dispatch _o_ = (Dispatch)_o1_;
			if (linksid != _o_.linksid) return false;
			if (userid != _o_.userid) return false;
			if (ptype != _o_.ptype) return false;
			if (!pdata.equals(_o_.pdata)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += linksid;
		_h_ += userid;
		_h_ += ptype;
		_h_ += pdata.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(linksid).append(",");
		_sb_.append(userid).append(",");
		_sb_.append(ptype).append(",");
		_sb_.append("B").append(pdata.size()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}
