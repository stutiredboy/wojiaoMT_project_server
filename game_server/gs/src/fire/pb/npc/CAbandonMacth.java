
package fire.pb.npc;
import java.util.ArrayList;
import java.util.List;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAbandonMacth__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAbandonMacth extends __CAbandonMacth__ {
	@Override
	protected void process() {
		// protocol handle
		final Long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				xbean.npcBattleInfoCol npcBattle = xtable.Npcbattleinfo.get(npckey); 
				if (npcBattle == null)
					return false;
				if (!npcBattle.getBattleroles().containsKey(roleid))
					return false;
				//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁惧墽绮换娑㈠箣濞嗗繒鍔撮梺杞扮椤戝棝濡甸崟顖氱閻犺櫣鍎ら悗楣冩⒑閸涘﹦鎳冪紒缁橈耿楠炲啫螖閿熶粙鍩ユ径濞炬瀻婵炲棗娴锋潻鏃�绻濋悽闈涗粶闁绘鎳愰崚鎺戔枎閹惧疇鎽曞┑鐐村灦鑿ら柡锟芥禒瀣厱闁哄洢鍔屾禍婊冣攽椤旇偐效婵﹨娅ｇ槐鎺懳熼搹鍦噯闂備焦瀵уú蹇涘磿閸偂绻嗛柣銏㈩焾缁�瀣亜閺嶃劏澹樼�规挸妫楅—鍐Χ閸涱垳顔囬梺鐟板暱闁帮綁銆侀弮鍫濋唶闁哄洨鍟块幏缁樼箾鏉堝墽鍒伴柟璇х節楠炲棝宕奸妷锔惧幘濠电偠灏褔鎮橀敃鍌涚厸濞达絿顭堥弳锝呪攽闄囬崺鏍ь嚗閸曨倠鐔虹磼濡崵褰庡┑鐘垫暩婵烇拷婵炰匠鍥х９濠电姵鍩冮敓鏂ょ畵瀹曠厧鈹戦幇顒佹珚婵犵數濞�濞佳兠洪姀锛勵洸婵犲﹤鐗婇悡娆撴煙鐟欏嫬濮堢痪顓炲⒔娴滄瓕绠涢弴鐘碉紳婵炴挻鑹惧ú銈夊几閻斿吋鐓欑紒瀣仢閺嗚鲸銇勯銏㈢閻撱倖銇勮箛鎾村櫣婵炲牄鍎靛娲濞戞艾顣洪梺鐟板暱缁夋挳鍩㈡禒瀣垫晜闁糕剝鐟ч敍婵囩箾鏉堝墽鍒板鐟帮躬瀹曟洝绠涢弴鐘碉紲缂傚倷鐒﹂埣銈夘敂閸喎浠奸悗鐟板婢瑰寮ㄦ禒瀣�甸柨婵嗙凹缁ㄨ姤銇勯幘瀛樸仢婵﹥妞介獮鎰償閵忊懇鏁嶉梻浣哥秺椤ユ捇宕楀Ο渚綎濠电姵鑹剧壕濂告煏閸繃鍣藉ù鐘虫倐濮婃椽宕崟顓犲姽缂傚倸绉崇欢姘舵偘椤旀拝鎷烽敐搴℃灍闁哄懏鐓￠弻娑㈠煢閿熶粙寮插鍩跺寰勫畝锟界壕浠嬫煕鐏炲墽鎳呯紒娑樼箻閺岀喐顦版惔鈥冲箣闂佸搫鏈惄顖炲春閸曨垰绀冩い蹇庣劍椤庡洭姊绘担铏瑰笡闁规悂绠栧畷浼村箛椤撶姭鏀虫繝鐢靛Т濞村倿寮鍡欑瘈闂傚牊绋掗ˉ娆愭叏鐟欏嫷娈滈柡宀嬬秮婵拷闁宠桨鑳舵禒顓㈡⒑閻戔晜娅撻柛銊ㄦ硾椤曪絾绻濆顓熸珳闂佸憡渚楁禍婵嬪棘閿熶粙姊绘担鍛婅础闁稿鎸搁…鍥р枎閹垮啯鏅滈梺璺ㄥ櫐閹凤拷
				npcBattle.getBattleroles().remove(roleid);
				xtable.Role2npcbattle.remove(roleid);
				
				//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗鎸抽幃娆戞嫚瑜庣�氬湱鎲搁悧鍫濈瑨缁炬儳顭烽弻銊╂偄閸濆嫅锝夋煟閹惧啿鏆ｇ�殿喖鐖奸幃娆撳级閹搭厽顥嬮梺璇查叄濞佳囧Χ閹间礁钃熼柕濞垮劗閺�浠嬫煕閳撅拷閺呮粍鏅ラ梻鍌欑閹碱偊骞婅箛鏇熷床闁割偁鍎遍拑鐔哥箾閹寸偟鐓繛宀婁邯閺岀喓鎲撮崟顐㈩潓濡炪們鍎茬换鍕閹惧瓨濯撮柣鐔告緲椤秶绱撴担鍓插剱闁搞劌娼″畷娲倷閸濆嫮顓洪梺鎸庢穿閹风兘鏌ｉ幙鍕瘈闁哄本鐩崺鍕礃閻愵剛鏆┑鐐差嚟婵參寮查悩宸綎婵炲樊浜滈幑鑸点亜閹惧鈾侀悗姘洴濮婅櫣绮欏▎鎯у壈濠碘槅鍋呴〃濠囥�佸璺何ㄩ柨鏂垮⒔閻﹀牓姊虹粙娆惧剾闁搞劌宕—鍐╃鐎ｎ煉鎷锋笟锟藉顕�宕煎┑鍡欑崺婵＄偑鍊曠换鎰板箠鎼搭煈鏁傞柣鐔稿閺�浠嬫煥濞戞ê顏╁ù婊冦偢閺屾稒绻濋崘顏勨拰閻庤娲樼换鍡浰囩�涙ü绻嗛柛娆忣槸婵秶锟芥鍠楅幐鎶藉箖閳哄懏鍋ㄩ梻鍫熺〒椤斿矂姊婚崒娆戭槮闁圭⒈鍋婂畷鏉库槈閵忕姷顔嗛悗鐟板婢с儲鎯旈妸銉у�為悷婊勭箞瀹曟繈鎮㈤崗鑲╁幍婵＄偛顑呮鎼佺�锋俊鐐�ч梽鍕箰閹惰棄钃熼柨婵嗩槹閺呮煡鏌涘☉鍗炵仧缂侇喚鏁诲娲焻濞戞埃鏁�闂佸憡鏌ㄧ粔鍫曞箲閵忕姭鏀介悗锝庝簽閿涙粌鈹戦悩璇у伐闁瑰弶鐩俊鎼佸煛閸屾熬鎷烽悽鍛婂仭婵炲棗绻愰顏嗙磼閿熶粙鏁撻悾宀�纾介柛灞炬皑瀛濋梺鎸庢处娴滎亝淇婄�涙ɑ濯寸紒顖涙礃閻庡姊洪崷顓炰壕婵炲吋鐟︾粋宥呂旈崨顔惧幍闂佺绻楅崑鎰板汲濮楋拷閺屾盯鍩℃担鍓蹭純閻庤娲忛崕鎶芥晸閺傘倗绉甸柛鎾寸〒婢规洘绂掔�ｎ偆鍘遍柣蹇曞仦瀹曟ɑ绔熷锟介弻銊╂偄鐠囨畫鎾绘煙椤旂厧锟芥悂鎮鹃悜钘夌疀妞ゆ挆鍕懷囨煙閼圭増褰х紒鎻掓健閹偤宕楅懖鈺冾啎闁哄鐗嗘晶浠嬪箖婵傚憡鐓曢幖瀛樼☉閿熻姤娲熼幃楣冩倻閽樺鎽曢梺闈涱檧婵″洭宕㈤悽鍛娾拻濞撴艾娲ゅ璺ㄧ磼閻樺啿鐏撮柟顔矫埥澶娢熻箛鏇熷殌妞ゎ厹鍔戝畷姗�顢旈崰鑸姂濮婃椽宕崟顒佹嫳闂佺儵鏅╅崹杈ㄧ┍婵犲洦鍊婚柦妯侯槺椤撳搫顪冮妶鍡欏缂佸鍨块、鏃堟嚋閻㈢數鐦堢紒鍓у閿氬褑灏欓幉鎼佸级閸喗娈婚梺璇″暙閸パ咁啋闁荤姴娲╃亸顏堝箺閺囩偐鏀介柣鎰綑閻忕喖鏌涢埡浣割伃鐎殿噮鍋婂畷姗�顢欓悾灞藉箺婵犵妲呴崹浼存倶濠靛鍎嶉柛婵嗗▕瑜版帗鍋愰柤濮愬�楅弳顐⑩攽椤旂》鍔熼柛搴涘�楅敓鐣屾暩閸樠囧煝鎼淬劌绠ｉ柣妯簧戠喊宥嗙┍婵犲洦鍊烽悗娑欘焽缁嬪洭姊虹涵鍛撶紒顔芥崌閻涱噣骞嬮敃锟介～鍛存煟濮楀棗浜濇い顐㈢Ч濮婃椽妫冨☉姘鳖唺婵犳鍠氶崗姗�銆佸锟藉畷顐﹀礋閵婏附鏉搁梻浣虹帛椤洨鍒掗姘ｆ鐟滄棃寮婚敐鍛傛棃鏁撻挊澹╂稑鈹戞繝鍕敶闂傚倷娴囧▔鏇㈠窗閺囩倣娑㈠礋椤栨氨鍘撮梺纭呮彧闂勫嫰宕愭搴嫹閻熸澘顥忛柛鐘崇墪閳绘捇宕奸弴鐔叉嫼闂傚倸鐗婄粙鎺椝夊鍕╀簻闁瑰瓨绻嶅Ο锟介梺缁樹緱閸犳稓绮诲☉妯锋婵炲棙鍔栭鐔兼⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�
				List<Long> allRoles = new ArrayList<Long>();
				Team team = TeamManager.selectTeamByRoleId(roleid);
				if (team != null) {
					allRoles.addAll(team.getNormalMemberIds());
					mkdb.Procedure.psend(allRoles, new SMacthResult(npckey, 0));
				}
				
				if (npcBattle.getBattleroles().size() == 0)
					xtable.Npcbattleinfo.remove(npckey);
				
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795670;

	public int getType() {
		return 795670;
	}

	public long npckey; // npckey

	public CAbandonMacth() {
	}

	public CAbandonMacth(long _npckey_) {
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAbandonMacth) {
			CAbandonMacth _o_ = (CAbandonMacth)_o1_;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAbandonMacth _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

