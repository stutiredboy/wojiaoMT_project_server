
package fire.msp;

import gnet.link.Onlines;

import java.util.HashSet;
import java.util.Set;

import fire.pb.scene.Scene;
import fire.pb.scene.SceneManager;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GSendAllByCondition__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GSendAllByCondition extends __GSendAllByCondition__ {
	@Override
	protected void process() {
		// protocol handle
		Set<Long> sendroleIds = new HashSet<Long>(); 
		if(sceneid != -1)
		{//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婄拋鏌ュ几濞嗘挻鈷戠紓浣姑粭鈺佲攽椤斿搫锟芥骞戦姀鐘闁靛繒濮撮懓鍨攽閳藉棗鐏ユい鏇嗗懎鏋堢�广儱顦伴悡鐔兼煟閺傛寧鎲搁柟铏礈缁辨帡鎮╅搹顐㈢３濡ょ姷鍋涢崯顐ョ亙闂佸憡渚楅崰妤�鈻嶅鍫熺厵闁兼祴鏅炶棢闂佸憡鎸荤换鍫ュ箖濡警鍚嬪璺侯儌閹锋椽姊洪崨濠勭畵閻庢凹鍘介崚濠囨偂楠炵喓鎳撻…銊︽償濠靛牏娉挎俊鐐�ら崑鍕崲閹烘梹顫曢柟鐑樺殾閻旂儤瀚氱�瑰壊鍣幏鐑藉箻缂佹ǚ鎷洪梺鍛婄☉閿曪箓鍩ユ径鎰叆闁哄洦锚閿熻姤绻傞锝夊箮閽樺鍞堕梺闈涱檧婵″洭宕ｉ崘顔解拺闁告稑锕ゆ慨锕傛煕閻樿櫕绀嬫鐐差槹閵堬綁宕橀埡鍐ㄥ箰闁诲海娅㈤幏鐑芥倵閿濆骸澧扮悮锕傛⒒娴ｈ櫣銆婇柡鍌欑窔瀹曟粌鈹戦崼鐔峰簥濠电娀娼ч鍛閸忚偐绡�濠电姴绻戠�氱懓鈹戦埄鍐炬畷闁圭懓娲ら～蹇曠磼濡顎撻梺鎯х箳閹虫挾绮埄鍐闁规儳顕。鍙夈亜閵娿儻宸ラ柣锝囧厴楠炲酣鎳為妷锔界彸濠电姰鍨煎▔娑㈡嚐椤栨粎鐭堥柨鏇炲�归埛鎴︽煙閼测晛浠滈柛鏃�鎸抽弻娑㈠箼閸曨厾鏆ら悗娈垮櫘閸嬪﹤鐣烽崼鏇ㄦ晢濞达絽鎼獮妤呮⒒娴ｅ摜绉洪柛瀣躬瀹曟澘螖閸涱厽杈堥梺鍐叉惈閹冲繘鎮￠悢鍝ョ闁瑰瓨绻傞懜褰掓煛鐎ｎ偆娲撮柡灞界Ф閹叉挳宕熼銈勭礉闂備浇顕栭崰鎺楀疾閻樿尙鏆︾憸鐗堝俯閺佸啴鏌ㄥ┑鍡橆棤婵″弶鍨剁换婵嬫偨闂堟刀锝嗐亜閺冿拷閻楃姴鐣烽弶璇炬棃宕ㄩ鐙�鍞堕梻浣告啞閸旀浜稿▎鎾虫辈闁挎柨顫曟禍婊堟煛瀹ュ啫濡块柍钘夘槹閵囧嫰寮撮～顓熷枤闂佽鍠楅〃鍛村煡婢跺ň鏋嶆い鎾楀倿鍋楅悗瑙勬礃缁捇銆佸锟介幃銏ゆ惞閸︻厽顫岄梻鍌欑劍閻綊宕归挊澶樼劷鐟滃酣鎮ф惔锝囩＝濞达絽鎼禍鐐節閵忊槅鐒界紒顔芥閵囨劙骞掗幋鐐葱氭繝鐢靛仦閸垶宕归崷顓犱笉闁挎繂顦伴悡銉╂煛閸愩劌锟界懓鈻嶉弴銏＄厱婵☆垰鎼懜褰掓煃鐟欏嫬鐏撮柟顔规櫇缁辨帒螣婵犳碍鏆樺┑鐘殿暯濡插懘宕戦崨娣拷鍐╃節閸ャ儻鎷锋笟锟藉顕�宕奸锝嗘珕闂備礁鎲″ú蹇涘礉瀹ュ妫橀柨鐔诲Г娣囧﹪鎮欓鍕舵嫹閺嶎厽鍋嬫俊銈呮噹娴肩娀骞栧ǎ顒�濡肩痪鎯ь煼閺屾洝绠涚�ｎ亷鎷烽弽顓熷亗婵炴垯鍨洪崐鍫曟煟閹邦厼绲婚柍閿嬫⒐缁绘盯宕ｆ径瀣▏闂佸疇顫夐崹鍧楀春閸曨垰绀冮柍杞扮筏閹风兘骞囬悧鍫㈠幐婵炶揪绲块…鍫ュ汲閿濆鐓涘ù锝堫潐鐏忔壆绱掗崒娑樼闁跨喐鏋荤紞鍡樼閻愬搫鍌ㄦ繛宸簼閳锋垿鏌涘┑鍡楊仾鐎瑰憡绻傞埞鎴︻敍濞戞瑥鍞夊Δ鐘靛仜缁绘垿藝閻楀牊鍎熼柕蹇曞У閻庮參姊绘担鍛婂暈婵炶绠撳畷婊冣槈閳跺搫娲俊鎼佸煛閸屾粌骞楅梻渚�娼х换鍡涘疾濞戙垺鍊舵繛鍡樻尰閻撴洟鏌熼幆褜鍤熺紒鐘崇墱缁辨帒鐣濋崘顔兼懙缂備胶绮换鍫濈暦閹偊妲惧銈嗘⒐閸旀牜鎹㈠☉娆愮秶闁告挆鍛呮岸姊虹粙鍖℃缂侇喗鐟︽穱濠囧箹娴ｈ娅嗛柡澶屽仦婢瑰棝鎯勬惔銊︹拻濞达絽鎲￠幆鍫ユ煕婵犲啯鍊愰柟顔矫埞鎴狅拷锝庝簽閻ｆ椽姊洪悷閭﹀殶闁稿鍨剁粋宥咁煥閸喓鍘甸梺鍓茬厛閸犳牠顢旈鍫熷�垫慨妯煎亾鐎氾拷?
			Scene scene = SceneManager.getInstance().getSceneByID(sceneid);
			for(Role role : scene.getSceneRoles().values())
			{
				if(schoolid != -1 && role.getSchoolId() != schoolid)
					continue;
				if(minlevel != -1 && role.getLevel() < minlevel)
					continue;
				if(maxlevel != -1 && role.getLevel() > maxlevel)
					continue;
				sendroleIds.add(role.getRoleID());
			}
		}
		else if(schoolid != -1)
		{//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂傚洤顦甸弻銊モ攽閸♀晜效婵炲瓨鍤庨崐婵嬪蓟閵堝绾ч柟绋块娴犳潙鈹戦纭锋敾婵＄偘绮欓妴浣肝旈崨顔芥闂佷紮绲介惉濂告儗閹炬番浜滈柡鍥朵簼鐎氬綊姊烘潪鎵妽闁圭懓娲ら锝夘敆閸曨倠褔鏌涢妷銏℃珕婵炲牆銈搁弻锝嗘償閵堝孩缍堝┑鐐插级閻楃姵淇婇崼鏇炲窛濠电姳鑳剁粻姘繆閻愬樊鍎忛柛鎴滅矙楠炲繘鎮滈懞銉︽珳闁圭厧鐡ㄧ换鍕礄瑜版帗鈷戦柛婵勫劚鏍￠柦鍐ㄥ船鑿愰柛銉戝秷鍚銈冨灪濞茬喐鎱ㄩ敓浠嬫煟濡寧鐝い鏂垮濮婂宕掑顓熸倷濡炪倧濡囬弫璇差嚕閺勫浚妯佺紓浣哄У閻╊垶寮幇鏉垮窛妞ゆ帒鍊归弲鐓庘攽閻樺灚鏆╅柛瀣仩閵囨劙宕橀钘変槐闂侀潧艌閺呮稒顢婇梻浣告啞濞诧箓宕规导杈剧稏闁告稑鐡ㄩ悡鍐煢濡警妲规い銉у仱閺岋綁濡堕崟顓犵崲濠殿喖锕﹂崕銈咁焽椤忓牆绠ユい鏃傚帶椤姊绘担鍛婅础闁硅櫕鎸哥叅妞ゆ挶鍨诲畵渚�鏌涢幇闈涙灈缂侊拷閸垺鍠愰悘鐐缎掗弻锔姐亜韫囨挾澧涢柣鎾卞灪娣囧﹪顢涘▎鎺濆妳濠碘�冲级濡炰粙寮婚敍鍕勃闁绘棃鏀辨径鍕煃闁垮娴柡灞剧〒娴狅箓骞戦幇顒夋闂備浇娉曢崰宥囧垝濞嗘拲澶愬箻鐠哄搫鐏婇梺鍓插亞閸犳捇鎮疯ぐ鎺撶叆闁绘柨澧庨惌娆撴煟濞戝崬鏋熺�垫澘瀚伴獮鍥敇閻斿壊浠ч梻鍌欒兌缁垶鈥﹂崼顫剨婵炲棙鎼╅弫濠囨煕閵夘喖澧柍閿嬪灩缁辨帡顢涘☉娆戭槬婵犫拃鍡楃毢缂佽鲸甯為敓鏂ょ秵閸嬪嫰鎮橀埡鍐＜妞ゆ棁鍋愭晶锔撅拷瑙勬礃閿曘垽銆佸▎鎾村仼閻忕偠妫勬俊鍥ㄧ節閻㈤潧啸闁轰焦鎮傚畷鎴濃槈閵忊�筹拷鑸电節闂堟侗鍎愰柡鍛倐閺屻倝骞侀幒鎴濆Б婵犫拃鍛毄闁跨喎锟界噥娼愭繛鍙壝…鍨潨閿熶粙鏁愰悙娴嬫斀閻庯綆鍋勫▓婵堢磼閸撗冾暭閽冮亶鎮楀顑惧仮婵﹥妞介幊锟犲Χ閸涘懌鍨虹换娑氫沪閸屾熬鎷烽弴銏╂晪闁挎繂顦柋鍥煛閸モ晛浠фい鏂款樀濮婃椽骞愭惔锝囩暤濠碘槅鍋勭�涒晝绮嬪鍜佺叆闁割偆鍠撻崣鍡椻攽閻樼粯娑ф俊顐ｇ箞椤㈡挸螖娴ｈ櫣顔曢梺鍛婁緱閸樼偓鐗庢俊鐐�戦崝濠囧磿閻㈢绠栨繛鍡樻尰閸ゆ垶銇勯幒鎴濅簽闁哥喎顑夊缁樻媴閼恒儯锟藉啴鏌ｉ幒鐐电暤妤犵偞鍨垮畷鍫曨敆閿熶粙寮告笟锟介弻鐔煎礈瑜忕敮娑㈡煛閸涱喗鍊愰柡灞诲姂閹倝宕掑☉姗嗕紦?
			Set<Long> schoolroles = RoleManager.getInstance().getSchoolRoles(schoolid);
			if (schoolroles!=null) 
			for(long sroleId :  schoolroles)
			{
				Role role = RoleManager.getInstance().getRoleByID(sroleId);
				if(minlevel != -1 && role.getLevel() < minlevel)
					continue;
				if(maxlevel != -1 && role.getLevel() > maxlevel)
					continue;
				sendroleIds.add(sroleId);
			}
		}
		else if (camp >0) {
			Set<Long> campRoles = RoleManager.getInstance().campRoles.get(camp);
			if (campRoles != null){
				for (long rid : campRoles) {
					sendroleIds.add(rid);
				}
			}
		}
		else if (null != exceptroles) {
		    Set<Long> allRoles = RoleManager.getInstance().getRoles().keySet();
            if (allRoles != null){
                for (long sroleId : allRoles) {
                    Role role = RoleManager.getInstance().getRoleByID(sroleId);
                    if (minlevel != -1 && role.getLevel() < minlevel)
                        continue;
                    if (maxlevel != -1 && role.getLevel() > maxlevel)
                        continue;
                    sendroleIds.add(sroleId);
                }
            }
		    sendroleIds.removeAll(exceptroles);
		}
		else
		{//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎娆戠┛闂傚倷娴囧▔鏇㈠窗閹版澘鍑犻柤濮愬�楁稉宥夋煙閹咃紞闁哄棴绠戦埞鎴﹀磼濠婂海鍔稿銈庡亜閹虫﹢寮诲澶娢ㄩ柕澶堝劜濮ｆ劗绱撴担闈涘Ω闁稿酣娼ч～蹇曠磼濡顎撶紓浣割儐椤戞瑥螞瀹�鍕拺缂佸顑欓崕搴ｇ磼閼镐絻澹橀柣锝囧厴瀵挳鎮㈤崫銉ら梻浣稿暱閹碱偊宕导瀛樺�块柛蹇氬亹缁★拷闂侀潧楠忕徊浠嬫偂閹扮増鐓曢柡鍐挎嫹闁绘濞�楠炲啴鍨鹃弬銉︾�婚梺鍦亾濞兼瑩鏁撻悾灞炬毈闁哄矉缍佹慨锟介柍钘夋閺呴亶姊虹紒妯虹瑲闁稿孩濞婂﹢渚�姊虹紒妯曟垿鎮烽妷褝鎷峰銉ュ缂佸倸绉撮…銊╁醇閻斿搫甯楅梻浣告啞缁诲倻锟芥凹鍓熼弫鎾绘寠婢舵鍚嬮悗瑙勬穿缂嶄線寮幘瀵割浄閻庯綆鍋�閹锋椽姊洪崨濠勭畵閻庢凹鍘奸敃銏″鐎涙鍘介梺鍐叉惈閿曘倝鎮橀敃鍌涚厪闁糕剝娲滅粣鏃傦拷娈垮枟閹歌櫕鎱ㄩ敓浠嬫煃閳轰礁鏆為柣婵囧▕濮婄粯鎷呴搹骞匡拷濠囨煕閹惧绠為柟顔惧厴椤㈡稑袙绾绉い銏☆殜瀹曠喖顢栭懞銉ヮ伜婵犵數鍋犻幓顏嗗緤閼测晜濯伴柨鏇炲�归崐鍨旈敐鍛殲闁稿濮甸幈銊ノ熼悡搴′粯婵炲瓨绮嶆竟鍡涙晸閸婄噥娼愭繛鍙夘焽閹广垽宕奸妷褍绁﹂柣搴秵閸犳寮插┑瀣叆闁绘柨澧庨惌娆撴煙闁垮鐏撮柟顔哄灲瀹曨偊濡疯閸熷酣姊绘担鐑樺殌闁宦板姂閹兘濡烽埡鍌氾拷鍫曟煃閸濆嫭鍣洪柣鎾跺枛閺岀喖鎮滃Ο璇查瀺闂侀潧娲︾换鍫ュ蓟閿涘嫪娌柛鎾楀嫬鍨辨俊銈囧Х閸嬫稑煤椤撶喍绻嗛柟闂寸劍閺呮粓鏌ｉ敐鍛板缂佹彃鐏濋埞鎴︽偐閸偅姣勯梺绋款儐閻╊垶骞冭瀹曠喖顢涘鎲嬬串婵犲痉鏉匡拷鏇㈠疮椤栫儑缍栭柡鍥ュ灪閻撴瑩鏌熼鍡楁噺閹插吋绻濆▓鍨仭闁瑰憡濞婂璇测槈濡攱鏂�闂佺硶鍓濋〃鍫ｃ亹閸涘瓨鈷戦柟绋挎捣缁犳挻銇勯敂鍨祮闁诡噯绻濋幃銏ゆ⒐閹邦喚鐣鹃梻渚�娼ч悧鍡欙拷姘煎枤閹峰綊鎮ч崼銏㈩啎闂佸壊鍋嗛崳锕傛嚀閸ф鐓涚�癸拷閿熶粙宕伴弽顓熷仒妞ゆ洩鎷风�规洖缍婇、娆撳矗閵夛箑浜濋梻鍌氬�风粈渚�鎮块崶顒婄稏濠㈣埖鍔曢崹鍌炴煕椤垵鏋ら柡鍡畵閺屾盯顢曢敐鍡欘槬闂佺粯鎸婚惄顖炲蓟濞戙垹绠涙い鎾跺仜婵垽姊洪崫鍕闁告瑥鍟～蹇旂節濮橆剛锛滃┑鐐叉閸╁牆危椤旂晫绡�闁靛繈鍨洪崵锟介梺鎸庢处娴滎亪鐛崘顔芥櫢闁绘ɑ鐓￠崬鍫曟⒑闂堟侗妲堕柛搴ㄦ涧铻炵�瑰嫰鍋婂〒濠氭煏閸繃顥犲褔浜堕弻娑氾拷锝庡亞閵嗘帞绱掗纰辩吋妞ゃ垺绋戦…銊╁箛椤撶儐浼撻梻浣藉吹閸犳劕顭垮锟介、鏃堫敂閸喎锟藉灚鎱ㄥ鍡楀濠⒀嶅閿熻姤顔栭崳顕�宕抽敐鍛殾闁绘挸绨堕弨浠嬫煕閳╁啰鎳呯�规洖鎼埞鎴︽晬閸曨偂鏉梺绋匡攻閻楁洝鐏嬮梺鍛婂姂閸擃喖鈽夐姀鐘茬�銈嗘煟閸庤崵绱炴笟锟介悰顕�宕堕浣镐罕闂佸壊鍋呯喊宥囷拷姘虫閳规垿鎮欓懜闈涙锭缂備焦褰冨鈥崇暦閺囥垹围濠㈣泛锕ら幆鐐烘⒑鐠恒劌鏋欐俊顐㈠閳ユ棃宕橀鍢壯囨煕閳╁厾顏埶囬埡鍛拺闁告稑鈾侀懖鈺佸灊婵炲棙鎸惧畵渚�鏌涢鐘插姎閹喖姊洪棃娑崇础闁告洦鍓涢弶娲⒒閸屾瑧顦︾紓宥咃躬瀵劑宕￠悜鍡樼稁閻熸粎澧楃敮妤呭磿鎼粹偓浜滈柡宥庡亜娴犳粓鏌＄�ｂ晝绐旈柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻锟犲川椤旇棄锟芥劙鏌＄仦璇插闁诡喓鍊濆畷鎺戔槈濮楀棔绱�?
			for(Role role : RoleManager.getInstance().getRoles().values())
			{
				if(minlevel != -1 && role.getLevel() < minlevel)
					continue;
				if(maxlevel != -1 && role.getLevel() > maxlevel)
					continue;
				sendroleIds.add(role.getRoleID());
			}
		}
		
		Onlines.getInstance().sendOctets(sendroleIds, protype,protocol);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 720903;

	public int getType() {
		return 720903;
	}

	public int protype; // 协议的类型
	public com.locojoy.base.Octets protocol; // 协议marshal完的数据
	public int schoolid; // 门派ID，如果无限制填-1
	public int minlevel; // 最小等级，如果无限制填-1
	public int maxlevel; // 最大等级，如果无限制填-1
	public long sceneid; // 场景ID，如果无限制填-1
	public int camp; // 阵营频道,如果无限制填-1
	public java.util.ArrayList<Long> exceptroles; // 不发送协议的role

	public GSendAllByCondition() {
		protocol = new com.locojoy.base.Octets();
		exceptroles = new java.util.ArrayList<Long>();
	}

	public GSendAllByCondition(int _protype_, com.locojoy.base.Octets _protocol_, int _schoolid_, int _minlevel_, int _maxlevel_, long _sceneid_, int _camp_, java.util.ArrayList<Long> _exceptroles_) {
		this.protype = _protype_;
		this.protocol = _protocol_;
		this.schoolid = _schoolid_;
		this.minlevel = _minlevel_;
		this.maxlevel = _maxlevel_;
		this.sceneid = _sceneid_;
		this.camp = _camp_;
		this.exceptroles = _exceptroles_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(protype);
		_os_.marshal(protocol);
		_os_.marshal(schoolid);
		_os_.marshal(minlevel);
		_os_.marshal(maxlevel);
		_os_.marshal(sceneid);
		_os_.marshal(camp);
		_os_.compact_uint32(exceptroles.size());
		for (Long _v_ : exceptroles) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		protype = _os_.unmarshal_int();
		protocol = _os_.unmarshal_Octets();
		schoolid = _os_.unmarshal_int();
		minlevel = _os_.unmarshal_int();
		maxlevel = _os_.unmarshal_int();
		sceneid = _os_.unmarshal_long();
		camp = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			long _v_;
			_v_ = _os_.unmarshal_long();
			exceptroles.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GSendAllByCondition) {
			GSendAllByCondition _o_ = (GSendAllByCondition)_o1_;
			if (protype != _o_.protype) return false;
			if (!protocol.equals(_o_.protocol)) return false;
			if (schoolid != _o_.schoolid) return false;
			if (minlevel != _o_.minlevel) return false;
			if (maxlevel != _o_.maxlevel) return false;
			if (sceneid != _o_.sceneid) return false;
			if (camp != _o_.camp) return false;
			if (!exceptroles.equals(_o_.exceptroles)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += protype;
		_h_ += protocol.hashCode();
		_h_ += schoolid;
		_h_ += minlevel;
		_h_ += maxlevel;
		_h_ += (int)sceneid;
		_h_ += camp;
		_h_ += exceptroles.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(protype).append(",");
		_sb_.append("B").append(protocol.size()).append(",");
		_sb_.append(schoolid).append(",");
		_sb_.append(minlevel).append(",");
		_sb_.append(maxlevel).append(",");
		_sb_.append(sceneid).append(",");
		_sb_.append(camp).append(",");
		_sb_.append(exceptroles).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

