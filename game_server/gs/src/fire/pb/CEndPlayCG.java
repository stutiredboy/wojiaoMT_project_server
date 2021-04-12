
package fire.pb;

import fire.pb.util.CGPlayUtil;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CEndPlayCG__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CEndPlayCG extends __CEndPlayCG__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid <= 0)
			return;
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姈閵囧嫰骞囬棃娑橆潽闁诲孩鑹剧紞濠囧蓟閵娾晛鍗抽柣鎰嚋閹风兘骞栨担鐟帮拷宄扳攽閻樺弶澶勯柣鎾冲暣瀵爼鎮欓弶鎴濡炪倧璁ｇ粻鎾诲蓟閿濆牏鐤�闁瑰灝瀚导鎰渻閵堝簼绨婚柛鐔风摠娣囧﹪宕奸弴鐐茶�垮┑鐐叉濞存艾顭囨搴ｇ＝闁稿本鐟х拹浼存煕閻樺磭澧辩紒顔芥閹兘鏌囬敃锟藉▓銊╂⒑閸涘﹤濮囨俊顖氾躬閹繝濡烽埡鍌滃幈濡炪倖鍔戦崐鏇㈠几閺冨牊鐓曟繛鍡楃箲椤ャ垺鎱ㄦ繝鍛仩缂佽鲸甯掕灒闁煎鍊曞鍐测攽閻橆偅濯伴柛鎰靛枛瀵即姊虹拠鈥崇仩闁兼椿鍨堕崺銏℃償閵娿儳顔掗柣搴ｆ暩椤牓鐛幇鐗堢厽閹艰揪绲鹃鐔兼煙妞嬪骸鍘撮柟顔筋殜閺佹劖鎯旈垾鎰佹交闂備胶纭堕弲娑㈡儗閸屾凹娼栭柛婵嗗閺嗭箓鏌涢妷锝呭婵炲牆鐭傚娲传閵夈儲鐎鹃梺鐟版啞婵炲﹪鎮伴锟藉畷姗�濡搁姀锛勶拷濠氭⒑閻熸壆浠㈤柛鐕佸灦瀵煡濮�閿涘嫮顔曢柡澶婄墕婢т粙宕氭导瀛樼厵缁炬澘宕禍鐐碉拷鍨緲閿曨亪骞愭繝鍐ㄧ窞闁糕剝蓱閺夋悂姊绘担鐟邦嚋缂佸鍨归敓鑺ュ嚬閸撴氨绮嬪鍡欓檮闁告稑锕﹂崢杈ㄧ節閻㈤潧孝闁哥喓澧楅弲鍫曟偨绾板瀚规繛鍫濈仢閺嬫稒銇勯銏℃暠濞ｅ洤锕ら～銏犵暆婵犲唭顒勬⒒娴ｈ銇熼柛妯圭矙楠炴劖銈ｉ崘銊х枀闂佸綊妫块悞锕傚磻鐎ｎ喗鐓曟い鎰剁悼缁犳﹢鏌ｉ悢鍝ュ弨婵﹨娅ｇ划娆忊枎閹冨闂備胶顭堥敃銈囩礊婵犲啩绻嗛柣銏㈩焾缁�瀣亜閺嶃劍鐨戞い鏂匡躬濮婃椽鎮烽幍顔芥喖缂備浇顕х粔鐢碉拷鐢靛帶閻ｆ繈宕熼鑺ュ闂佸搫顦遍崑鐐寸珶閸℃蛋鍥晝閸屾稓鍘遍梺缁樻煥閹诧紕浜搁敂鎾呮嫹濞堝灝鏋涙い顓㈡敱娣囧﹪骞栨担鑲濄劑鏌曡箛濠冾潑婵炲吋姊圭换婵堝枈濡椿娼戦梺鍓茬厛閸ㄦ娊骞忛崘顔芥櫆闁芥ê顦介崵銈夋⒑鐠恒劌鏋嶇紒顔界懃椤繒绱掑Ο璇差�撻梺缁樺灦閿氭繛鍫濊嫰閳规垿鍩ラ崱妤冧哗闂佹寧娲忛崕宕囧垝鐎ｎ亶鍚嬪鑸瞪戦弲婊堟⒑閸涘﹥绀�闁诲繑姘ㄧ槐鐐存償閵婏腹鎷洪梺鍛婄☉閿曪妇绮婚幘缁樺�垫慨姗嗗墯閸わ拷濡炪倧绠戝﹢閬嶆晸閸婄噥娼愭繛鍙夛耿瀹曟洘绺介弶鍡楁喘瀹曪絾寰勯崼婊呯泿婵＄偑鍊栫敮顏堝箯閻戣姤鐓熸俊銈勭劍瀹曞瞼锟芥鍠栭…鐑藉极閹版澘骞㈡俊顖氭惈婵℃娊姊绘笟锟藉褏鎹㈤幒鎾村弿闁哄鍤╅幒妤�閱囬柕澶涜吂閹锋椽姊洪崨濠勨槈闁挎洩绠撻獮濠囧礃椤旂晫鍘遍梺缁樻煥閹诧紕浜搁敃鍌涚厵妞ゆ棁顕у畵鍡樸亜閵忊�冲摵闁轰焦鎸荤粋鎺旓拷锝庡墮缁侊箓姊洪幖鐐插姶闁告挻宀稿畷鎴狅拷锝庡枟閻撴洘銇勯幇顔夹㈤柣蹇婃櫅閳规垿顢欓懞銉ワ拷鎰版煛瀹�瀣ɑ闁诡垱妫冮弫宥夊礋椤撶喐顔嗛梻鍌欒兌椤牓鏌婇敐鍡欘洸闁割偅娲滃畵浣糕攽閻樺弶鎼愮紒鐘崇洴閺屸剝寰勬繛澶哥钵缂備浇绮惧▔娑㈠煘閹寸偛绠犻梺绋匡攻濞茬喖鐛繝鍛杸婵炴垶顭囬崢閬嶆⒑绾懏褰ч梻鍕瀹曟垿鏁愭径瀣幈闂侀潧顦介崹宕囩矓閸洘鐓欑�瑰嫭婢樺Σ濠氭煟閿濆洤鍘寸�规洖鐖奸弻銊э拷锝庝憾娴兼挸鈹戦悩鍨毄濠殿喚鏁搁崰濠傤吋婢跺浜楅梺鍝勬储閸ㄦ椽鎮″▎鎾粹拺妞ゆ挶鍔庨悾鍗烆熆瑜滈崳锝夊蓟閿熺姴骞㈡繛鍡楃箣濞岊亪姊洪棃娑欐悙閻庢氨澧楁穱濠囧箹娴ｈ倽銊︺亜閺嶃劎绠撻柟顖氱墦閺岋絾鎯旈姀鈺佹櫛闂佸摜濮甸悧鐘诲灳閿曞倹鍊婚柦妯侯槹閻庮剟姊鸿ぐ鎺戜喊闁告鍋愬▎銏ゆ倷濞村鏂�闂佺粯蓱瑜板啴顢楅姀銏㈢＝鐎广儱鎳庨敓钘夌仢椤繒绱掑Ο鑲╂嚌闂佽法鍠曞Λ鍕�﹂崶顏嶆Ь闂佺懓绠嶉崹浠嬬嵁閹烘绠婚柡澶嬪灥娴煎酣姊绘担铏瑰笡闁搞劎鍘ц灋闁告洦鍘惧Λ顖滄喐韫囨洘顫曢柟鐑橆殔鎯熼梺闈涳紡閿熶粙寮ㄧ弧锟�
		new mkdb.Procedure(){

			@Override
			protected boolean process() throws Exception {
				
				fire.pb.buff.BuffAgent agent = new fire.pb.buff.BuffRoleImpl(roleid,false);
				agent.removeCBuffWithSP(CGPlayUtil.cgBuffID);
				/*fire.pb.map.Role role = RoleManager.getInstance().getRoleByID(roleid);
				if(id >= 11001 && id <= 11009)
				{
					Transfer.justGotoWhileCommit(roleid, role.getScene(), role.getPos().toGridPos().getX(), role.getPos().toGridPos().getY(), SRoleEnterScene.QUEST);
				}*/
				//GsClient.sendToScene(new GSetPlayCGState(roleid,(byte)0));
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786456;

	public int getType() {
		return 786456;
	}

	public int id; // 动画的id

	public CEndPlayCG() {
	}

	public CEndPlayCG(int _id_) {
		this.id = _id_;
	}

	public final boolean _validator_() {
		if (id <= 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CEndPlayCG) {
			CEndPlayCG _o_ = (CEndPlayCG)_o1_;
			if (id != _o_.id) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += id;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CEndPlayCG _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = id - _o_.id;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

