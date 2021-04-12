
package fire.pb.battle.livedie;

import fire.pb.PropRole;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
import gnet.link.Onlines;
import java.util.Map.Entry;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveDieBattleWatchView__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CLiveDieBattleWatchView extends __CLiveDieBattleWatchView__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				SLiveDieBattleWatchView sLiveDieBattleWatchView=new SLiveDieBattleWatchView();
				for(Entry<Long, Long> entry:LiveDieMange.liveDieFightRoleids.entrySet()){
					long oneid=entry.getKey();
					long otherid=entry.getValue();
					LDRoleInfoDes qCRoleInfoDes1 = createLDRoleInfoDes(oneid);
					LDRoleInfoDes qCRoleInfoDes2 = createLDRoleInfoDes(otherid);
					LDRoleInfoWatchDes lDRoleInfoWatchDes=new LDRoleInfoWatchDes();
					lDRoleInfoWatchDes.role1=qCRoleInfoDes1;
					lDRoleInfoWatchDes.role2=qCRoleInfoDes2;
					sLiveDieBattleWatchView.rolewatchlist.add(lDRoleInfoWatchDes);
				}
				Onlines.getInstance().send(roleid, sLiveDieBattleWatchView);
				return true;
			};
		}.submit();
		
	}
	
	/**
	 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁哄洨鍠庣欢鐐烘煕閳╁叐鎴︽偟閺冨倻纾奸柣鎰靛墮閸斻倖绻濋敓浠嬫焼瀹ュ懐鐤呴梺褰掓？閻掞箓宕戠�ｎ喗鐓曟い鎰剁悼缁犳﹢鏌ｉ悢鏉戝婵﹥妞介獮鏍倷閹绘帩鐎抽梻浣侯焾閿曘倗绱炴繝鍐х箚闁汇垻顭堢粈瀣亜閺嶃劍鐨戞い鏂匡躬濮婃椽鎮烽幍顔芥喖缂備椒绱幏鐑芥⒑閸濄儱孝闁挎洦浜滈～蹇撁洪鍕祶濡炪倖鎸鹃崑娑㈢嵁鐎ｎ喗鈷戦柣姘摠鐎氬綊姊绘笟鍥у缂佸顕划濠氼敍閻愬鍘卞┑鐐村灦閻燂妇绱為幋鐘电＜闁跨喍绮欏畷姗�顢欓悾灞藉箺闂備線锟芥稑宓嗘繛浣冲嫭娅犻柟娈垮枤绾剧厧顭跨捄鐚村伐婵℃彃顭烽弻宥囨喆閸曨偆浼岄梺璇″枓閺呯娀銆侀弴銏℃櫜闁告粈绶ら幏鐤疀濞戞瑢鎷洪梺鍛婄☉閿曘儲寰勯崟顖涚厱婵鎷风紒鐘崇墵楠炲啴鏁撻悩鑼紲闂佺粯鍔楃悰銉╁箯濞差亝鍋℃繝濠傛噹椤ｅジ鎮介妤佹珔閾荤偤鏌熺�涙濡囬柡锟芥禒瀣厽闁瑰瓨绻冩径鍕倵濮橆剛绉烘慨濠勭帛閹峰懘鎳為妷锝忔嫹閸愵亞纾奸柨鐔诲Г缁楃喖鏁撻挊澶屾殾闁圭増婢橀柨銈嗕繆閵堝繑瀚圭紓浣哄У濠㈡﹢鍩為幋锔藉亹闁圭粯甯楀▓顓犵磽娴ｇ顣抽柛瀣洴閸╃偤骞嬮敂钘変汗闂佸湱绮敮濠勮姳閽樺鏀介柍钘夋娴滈箖鏌熼崙銈嗗
	 * @param id
	 * @return
	 */
	public LDRoleInfoDes createLDRoleInfoDes(long id){
		PropRole propRole = new PropRole(id, true);
		LDRoleInfoDes lDRoleInfoDes = new LDRoleInfoDes();
		lDRoleInfoDes.roleid=propRole.getRoleId();//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸啴鏁撻悾灞筋棜闁稿繐鍚嬮崣蹇旀叏濡ゅ瀚圭紒缁㈠幗閹倸顕ｉ幎鑺ユ櫢闁跨噦鎷�
		lDRoleInfoDes.rolename=propRole.getName();//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸倿鎸婃径澶嬬潖闂傚倷绀侀幉锟犳偡閵夆敡鍥ㄥ閺夋垹鐣哄┑鐐叉閹稿鎮￠悢鍏肩厽闁哄倹瀵ч幉鎼佹煙閾忣偅绀嬮柡宀�鍠栧畷娆撳Χ閸℃浼�?
		lDRoleInfoDes.shape=propRole.getShape();//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸倿鎸婃径澶嬬潖闂傚倷绀侀幉锟犳偡閵夆敡鍥敍閻愬牆娲崺锟犲川椤旇瀚肩紓鍌氬�烽悞锕傛晪缂備焦顨嗙敮妤呭Φ閸曨垼鏁囬柣妯诲絻楠炲鎮楀▓鍨灈妞ゎ厾鍏樺顐﹀箛閺夊灝绐涢梺绋挎湰缁矂寮稿☉姘炬嫹鐟欏嫭绀�缂傚秴锕妴浣糕枎閹炬潙锟介攱銇勯幒鎴Ц婵炲牊鍨垮濠氬磼濮橆剨鎷峰畡鎳婂綊宕惰閺嬫牠鏌￠崶銉ョ仼缂佹劖顨婇弻鐔兼偋閸喓鍑￠梺鍛婂灩婵挳鍩為幋锔藉亹閻庡湱濮撮ˉ婵堢磽娴ｅ搫顎岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷
		lDRoleInfoDes.level=propRole.getLevel();//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸倿鎸婃径澶嬬潖闂傚倷绀佸﹢杈╁垝椤栨粍鏆滈柍鍝勫�搁閬嶆煥閻旂粯顥夐柍瑙勫灴閺佸秹宕熼鈩冨煕闂備胶顢婂▍鏇㈠箲閸パ呮殾妞ゆ牜鍋涢柨銈嗕繆閻愭壆涓查柟椋庡厴閺佸倿鎮欓锟界壕顖炴⒑闂堟侗鐓紒鐘冲灩婢规洟顢涢悙绮规嫼闂佽鍨庨崨顖ｅ敹婵犵數濯撮幏鐑芥⒑椤掞拷缁夊绮堟径瀣ㄤ簻闁哄稁鍋勬禒锕傛煃闁垮鐏╃紒杈ㄦ尰閹峰懏鎱ㄩ幋顓濋偗鐎规洑鍗冲鎾閿涘嫬骞嶉梻浣告啞閸垶宕愰弽顐嫹濮樼偓瀚�
		lDRoleInfoDes.school=propRole.getSchool();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉〒姘攻鐎氳绻濋姀锝嗙【闁活厼顦甸獮蹇涙倻閻ｅ苯绁﹂梺鍓茬厛閸犳牗鎱ㄦ惔銊︹拺閻犲洠锟藉磭浠梺鍦焾椤兘鐛崱娑樼睄闁割偅鎯婇埡鍛叆闁哄啫娲よ濡炪倕绻掗崰鏍ь潖缂佹ɑ濯撮柤鎭掑劤閵嗗﹪姊洪棃鈺冪Ф缂佺姵鎹囬悰顔跨疀濞戞瑦娅㈤梺璺ㄥ櫐閹凤拷
		Team team = TeamManager.selectTeamByRoleId(id);
		if(team!=null&&team.getTeamLeaderId()==id){
			lDRoleInfoDes.teamnum=team.getTeamInfo().getMembers().size()+1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顕�姊哄Ч鍥э拷銈夊窗閺嶎厽绠掗梻浣侯焾缁绘劙宕ョ�ｎ剛绀婇柟瀵稿Х绾惧ジ鏌熼柇锕�寮炬繛鍫燂耿閺屻劑鎮㈢紒姗嗘缂備胶濮寸粔鐟扮暦閺囥垹纭�闁诲繒绮浠嬪极閸愵喖纾奸柨鏂垮⒔閳笺倝姊绘担鍛婃儓婵炲眰鍨藉畷鐟懊洪鍛簵闂佺粯鏌ㄩ崥瀣偂濞嗘挻鈷戞い鎾卞妿閻ｉ亶鏌ｈ箛銉хМ闁哄本鐩、鏇㈩敃閿涘嫮娉块梻鍌氭搐椤︽壆鎹㈠┑鍥╃瘈闁稿本纰嶅▓鍓佺磽娴ｅ壊妲规俊鐐扮矙瀵鍨惧畷鍥ㄦ畷闂佽法鍠嶇划娆忕暦娴兼潙鍐�妞ゆ挾濮寸粊锕傛⒑缁洖澧查柛鎴犳嚀鍗卞┑鐘崇閳锋垿鏌涘┑鍡楊仾妞ゃ儮锟芥剚娓婚悗娑櫳戦崐鎰攽閿涘嫭鏆�规洜鍠栭、娑樞掓担鍐叉处閻撴洘绻涢幋婵嗚埞闁哄绋掔换娑㈠椽閸愵亞袦濠殿喖锕ら…宄扮暦閹偊妾ㄥ┑鈩冨絻濠�杈╂閹烘梻纾兼俊顖濆亹閻ｈ櫣绱撴担铏瑰笡缂佽鐗嗛悾鐑藉箳閹存梹顫嶅┑鈽嗗灡濡炴寧绂掗埡鍛拻闁稿本鐟чˇ锕傛煙鐠囇呯瘈鐎殿喖顭锋俊鎼佸煛婵犲啯娅堝┑鐘灱閸╂牠宕濋弴銏″珔闁绘柨鍚嬮悡銉╂煟閺傛寧鎯堢�涙繂螖閻橀潧浜奸柛銊︽そ婵＄敻宕熼姘鳖啋闁荤姾娅ｉ崕銈夋倵鐠囧樊娓婚柕鍫濇嚇閻涙粓鏌熼崙銈嗗
			lDRoleInfoDes.teamnummax=TeamManager.MAX_MEMBER_COUNT+1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顕�姊哄Ч鍥э拷銈夊窗閺嶎厽绠掗梻浣侯焾缁绘劙宕ョ�ｎ剛绀婇柟瀵稿Х绾惧ジ鏌熼柇锕�寮炬繛鍫燂耿閺屻劑鎮㈢紒姗嗘缂備胶濮寸粔鐟扮暦閺囥垹纭�闁诲繒绮浠嬪极閸愵喖纾奸柨鏂垮⒔閳笺倝姊绘担鍛婃儓婵炲眰鍨藉畷鐟懊洪鍛簵闂佺粯鏌ㄩ崥瀣偂濞嗘挻鈷戞い鎾卞妿閻ｅ崬顭胯閸ㄥ爼寮婚悢纰辨晬婵ê宕埅鐢告⒑鐠団�虫灍妞ゃ劌鎳橀敐鐐测攽鐎ｎ偄锟介攱銇勯幒鐐村濡炪倕楠忛幏锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉骞夐幖浣瑰亱闁割偅绻勯悷鏌ユ⒑缁嬫鍎忔い锔炬暬瀵寮撮敍鍕澑闁诲函缍嗘禍鐑藉箯閻戣棄鍗抽柣妯烘▕濡粓姊虹粙璺ㄧ闁稿鍔楃划缁樸偅閸愨晝鍘甸柣搴ｆ暩椤牊绂掕閵囧嫰鏁愰崼婵堟缂備浇椴哥敮鈩冧繆濮濆矈妲绘繛瀵稿Ь妞存悂骞堥妸锔剧瘈闁告洦鍘肩粭锟犳⒑閻熸澘妲婚柟铏悾鐑筋敃閿曪拷缁�瀣亜閹捐泛娅忛柛姘喘濮婂宕掑▎鎺戝帯闂佺娅曢幑鍥х暦閻㈢鍐�妞ゆ挾鍋熼鍡涙⒑鐠恒劌娅愰柟鍑ゆ嫹?
		}else{
			lDRoleInfoDes.teamnum=0;
			lDRoleInfoDes.teamnummax=0;
		}
		return lDRoleInfoDes;
	}
	
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793840;

	public int getType() {
		return 793840;
	}


	public CLiveDieBattleWatchView() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLiveDieBattleWatchView) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CLiveDieBattleWatchView _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

