
package fire.pb.battle.livedie;

import gnet.link.Onlines;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveDieBattleGiveRose__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CLiveDieBattleGiveRose extends __CLiveDieBattleGiveRose__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid <= 0)
			return;
		
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔芥祰闂傚倷鑳堕…鍫ユ晝椤忓煻澶愬箻缂佹ê鍓﹀銈呯箰閻楁粓寮崶顒佺厽闁归偊鍘界紞鎴炵箾閸涘洤鍠氬〒濠氭煏閸繂锟界懓鈻嶉崶顒佺厸濞达絽澹婇悡鑲╋拷娈垮枛椤兘寮幇顓炵窞濠电偐鎳囬弲鐘诲蓟閺囩喎绶為柛顐ｇ箓婵埖绻涚�电鞋闁稿鍔楀Σ鎰板箻鐠囪尙锛滃┑顔缴戦惁鐑藉閵忋垻锛滄繝銏ｆ硾閺堫剟宕甸敓浠嬫⒑娴兼瑧鎮奸柛蹇旓耿閻涱喖顫滈敓钘夌暦閻戠瓔鏁囬柣妯挎珪缁额偊姊婚崒娆戭槮闁圭⒈鍋婂畷鏉库槈閵忕姷顔嗘俊鐐差儏濞撮绮婚弮鍫熺厵閺夊牓绠栧顕�鏌嶉柨瀣伌闁哄本绋戦埥澶婎潨閸繂顫犻梻浣告憸閸犳洜浜稿▎鎴烆潟闁圭儤顨嗛崑鎰版煕閹邦垰鐨哄ù鐓庣焸濮婅櫣鎷犻垾铏亶濠碉紕鍋犳慨銈嗙┍婵犲洤绠瑰ù锝呮憸閸樺憡绻涙潏鍓ф偧闁硅櫕鎸剧划濠囨晸閿燂拷?
				xbean.LDVideoRoleInfoDes des = LiveDieMange.ldvideoroleinfodeslistall.get(vedioid);
				if(des==null){
					return false;
				}
				xbean.LDVideoRoleInfoDesList lDVideoRoleInfoDesList=xtable.Ldvideoroleinfodeslisttab.get(1);
				if(lDVideoRoleInfoDesList==null){
					return false;
				}
				xbean.LDVideoRoleRoseInfoList list = xtable.Ldvideoroleroseinfolisttab.get(roleid);
				if(list==null){
					list=xbean.Pod.newLDVideoRoleRoseInfoList();
					xtable.Ldvideoroleroseinfolisttab.insert(roleid, list);
				}
				xbean.LDVideoRoleRoseInfo lDVideoRoleRoseInfo=list.getLdvideoroleroseinfolist().get(vedioid);
				if(lDVideoRoleRoseInfo==null){
					lDVideoRoleRoseInfo=xbean.Pod.newLDVideoRoleRoseInfo();
					list.getLdvideoroleroseinfolist().put(vedioid, lDVideoRoleRoseInfo);
				}
				if(lDVideoRoleRoseInfo.getRosenum()>=LiveDieMange.GIVE_ROSE_NUM_MAX){
					return false;
				}else{
					//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸偅缍堝┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锝呭悁闁垶鏌＄仦鍓ф创闁糕晛瀚板畷姗�顢旀担璇★拷鍥⒒娴ｄ警鐒炬い鎴濇閹广垽宕奸妷銉ㄦ憰閻庡箍鍎卞Λ娆愭叏濠婂牊鐓欐繛鍫濈仢閺嬶妇绱掗幇顓ф疁婵﹥妞藉畷顐﹀Ψ閵夛妇褰氶梻浣哥秺椤ユ捇宕楀Ο渚綎缂備焦蓱婵挳鏌涢敂璇插箺闁煎灝娲娲川婵犲啰鍙嗛梺娲诲墮閵堟悂寮幘缁樺殟闁靛鍎卞В鍫ユ⒑闂堚晝绉剁紒韫矙閹箖鎮滈挊澶岊吅闂佹寧妫佹慨銈呪枍濠婂牊鈷戦柟鑲╁仜閸旀﹢鏌涢弬璺ㄧ劯闁诡垰鍟撮、鏇㈡晜鐟欙絾瀚肩紓鍌氬�烽悞锕傛晪婵犳鍠栭悧鎾诲蓟閻旂⒈鏁嶆慨妯夸含閸旑垶鎮楃憴鍕闁搞劌銈歌棟鐟滅増甯楅悡娑氾拷鐧告嫹閻庯綆鍓涢惁鍫ユ⒑鏉炴壆鍔嶉柟鐟版喘瀵偊骞樼紒妯绘闂佽法鍣﹂幏锟�?
					lDVideoRoleRoseInfo.setRosenum(lDVideoRoleRoseInfo.getRosenum()+1);
				}
				//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸偅缍堝┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锝呭悁闁垶鏌＄仦鍓ф创闁糕晛瀚板畷姗�濡搁敂钘夊妿婵犵數鍋涢悺銊у垝瀹�锟界槐鐐寸節閸パ嗘憰闂佺粯姊婚崢褏绮诲杈ㄥ枑鐎广儱顦Ч鏌ュ级閸稑濡稿ù婊勭矒閺屾洟宕煎┑鍥ф闂侀潻绲肩划娆撳蓟閻旂厧鐭楀璺侯儏閿熻姤鍔欓弻鐔碱敊閵娿儲鎼愰梺鍗炴喘閺岋綁寮幑鎰靛妳濠碘�虫▕閸撶喎顫忕紒妯诲濞撴凹鍨抽崝鎼佹煟鎼淬垻鈻撻柡鍛洴閹儳鈹戠�ｎ亞顔愭繛杈剧到閹芥粓鎮炬ィ鍐┾拺闁告稑锕ゆ慨锕傛煕閻樺磭澧辩紒顔肩墢閿熸枻缍嗛崑浣圭濠婂牊鐓欓柟瑙勫姈绾儳霉閻樺啿娴柡灞剧洴瀵粙濡歌閳峰矂姊洪崫鍕効缂傚秳绶氶獮鍐煛娴ｅ弶鐎婚棅顐㈡处閺屻劌鈻嶉敐鍡欑閻庣數顭堥鎾绘⒒閸曨偄顏┑锛勬暬瀹曠喖顢涘杈╂澑婵＄偑鍊栭崹鍫曞磿閾忣偆顩锋い鏇嫹闁诡喗顨呴埢鎾诲垂椤旂晫褰查梻浣烘嚀閸ゆ牠骞忛敓锟�?
				des.setRosenum(des.getRosenum()+1);
				for(xbean.LDVideoRoleInfoDes desdb:lDVideoRoleInfoDesList.getLdvideoroleinfodeslistall()){
					if(desdb.getVideoid().equals(vedioid)){
						desdb.setRosenum(des.getRosenum());
						break;
					}
				}
				SLiveDieBattleGiveRose sLiveDieBattleGiveRose=new SLiveDieBattleGiveRose();
				sLiveDieBattleGiveRose.vedioid = vedioid;
				sLiveDieBattleGiveRose.rosenum = des.getRosenum();
				sLiveDieBattleGiveRose.roseflag = lDVideoRoleRoseInfo.getRosenum();
				Onlines.getInstance().send(roleid, sLiveDieBattleGiveRose);
				return true;
			};
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793844;

	public int getType() {
		return 793844;
	}

	public java.lang.String vedioid; // 录像id

	public CLiveDieBattleGiveRose() {
		vedioid = "";
	}

	public CLiveDieBattleGiveRose(java.lang.String _vedioid_) {
		this.vedioid = _vedioid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(vedioid, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		vedioid = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLiveDieBattleGiveRose) {
			CLiveDieBattleGiveRose _o_ = (CLiveDieBattleGiveRose)_o1_;
			if (!vedioid.equals(_o_.vedioid)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += vedioid.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(vedioid.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

