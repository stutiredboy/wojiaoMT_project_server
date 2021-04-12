
package fire.pb.game;

import fire.log.LogManager;
import fire.pb.SReturnLogin;
import fire.pb.fushi.DayPayManager;
import fire.pb.fushi.Module;
import mkdb.Procedure;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CNoOperationKick__ extends mkio.Protocol { }

/** 踢掉长时间不操作的玩家
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CNoOperationKick extends __CNoOperationKick__ {
	@Override
	protected void process() {
		// protocol handle
		
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		
		new mkdb.Procedure() {

			@Override
			protected boolean process() throws Exception {
				
				xbean.Properties prop = xtable.Properties.select(roleId);
//				if (prop.getLevel() > 20) {
//					return false;
//				}
				
				boolean ok = false;
				if (Module.GetPayServiceType() == 1 ? true : false) {
					ok = DayPayManager.getInstance().CheckDayPay(roleId, DayPayManager.adddaypatime);
				} else {
					xbean.YbNums ybNums = xtable.Fushinum.select(prop.getUserid());
					int norpresentNum = 0;
					if (ybNums != null) {
						xbean.YbNum ybNum = ybNums.getRoleyb().get(roleId);
						if (ybNum != null) 
							norpresentNum = ybNum.getNopresentnum();
					}
					ok = norpresentNum == 0 ? false : true;
				}
				if (!ok) {// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻缁炬儳顑愰崬褰掓⒑鐠恒劌鏋戦柡瀣吹缁骞樺Ч鍥锋嫹娴ｈ倽鏃�鎷呴悷閭︼拷鎾寸箾閹炬潙鍤柛銊╀憾閺屻劑濡堕崱娆戠槇閻庡吀鍗抽弨鍗烆熆濮楋拷閺佹捇鎳為妷锔绢槹濡ょ姷鍋涢敃銉╁箚閺冨牆惟闁靛鍎抽敓绛嬪弮濮婅櫣绮欑捄銊т紘闂佺顑囬崑銈夊箖閿熺姵鏅插璺鸿嫰瑜板嫰姊洪幖鐐插姌闁告柨鐭傚畷鐢割敆娴ｈ櫣顔曢梺绋跨箳閸樠勬叏瀹ュ鐓涚�癸拷鐎ｎ剛鐦堥悗瑙勬礀瀹曨剝鐏掗梺鍏肩ゴ閺呮繈宕㈠鍫熲拻濞达絽鎲￠幆鍫ユ偠濮樼厧浜扮�规洘绻堥獮瀣晝閿熺晫绮婚弽顓熺厪闁割偅绻嶅Σ鍝ョ棯閹冩倯缂佺粯鐩獮瀣倻閸ワ妇杩斿┑鐐差嚟閵嗗骞忛敓锟�
					Procedure.psend(roleId, new SReturnLogin());
					StringBuilder sbd = new StringBuilder();
					sbd.append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽鐎ｎ亣鎽曢梺闈浥堥弲娑氱尵瀹ュ鐓曢悘鐐插⒔閻擃垰顭跨憴鍕婵﹥妞藉畷顐﹀礋椤掑锛佺紓鍌欑贰閸犳骞戦崶褜鍤曞┑鐘崇閺呮彃顭跨捄鐚存敾妞ゃ儲绻堝娲捶椤撗呭姼闁诲孩绋堥弲鐘茬暦娴兼潙绠涢柣妤�鐗冮幏铏圭磽閸屾瑧鍔嶆い顓炴川缁顫濋鐘殿啎婵犮垼娉涢鍥洪幘顔界厱闁冲搫鍟禒杈殽閻愬樊鍎旈柡浣稿暣閺佹挻绂掔�ｎ偄锟芥寧绻涘顔荤凹闁绘挻娲熼弻鐔煎箥閾忣偅鐝旀繝纰橈拷鑼煓闁哄矉绻濆畷鍗炍熷鍕阀=").append(roleId).append(", 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙绀冩い鏇嗗洤鐓橀柟杈鹃檮閸嬫劙鏌涘▎蹇ｆЧ闁诡喗鐟х槐鎾存媴閸濆嫷锟藉矂鏌涢妸銉у煟鐎殿喖顭烽弫鎰緞婵犲嫷鍚呴梻浣瑰缁诲倿骞夊☉銏犵缂備焦顭囬崢浠嬫⒑鐟欏嫬鍔ゆい鏇ㄥ弮楠炲﹪宕ㄩ婊咃紲闁哄鐗勯崝宀�绮閺屻劑鎮㈤崨濠勪紕缂傚倸绉村Λ娆戠矉瀹ュ鍊烽悗闈涘濞村嫰姊洪棃娑氳繑濡鑳堕惄搴ㄦ⒒娴ｇ儤鍤�闁圭⒈鍋婇、鏍川鐎涙ê锟借埖銇勮箛鎾跺闁绘挸绻橀弻娑㈠Ψ閹存繂鏋ゅù鐓庡�垮铏圭磼濡崵鍙勭紓浣藉煐瀹�绋款嚕鐠囨祴妲堥柕蹇曞閵娾晜鐓ユ繝闈涙閸ｅ綊宕鐐粹拻濞达絿鍎ら崵锟介梺鎼炲灪閻擄繝鍨鹃敃锟介悾锟犳焽閿旂晫绋侀梻浣瑰劤缁绘劕锕㈤柆宥嗗剹婵炲棙鎸婚悡娆戠磼鐎ｎ亞浠㈡い鎺嬪灲閺岀喖鎮块娆忔儓缂備浇椴搁幐鑽ょ箔閻旂厧鐐婄憸搴ㄦ倶閸績鏀介柣鎰摠缂嶆垿鏌涢姀锛勫弨妞ゃ垺宀搁弫鎰板醇椤愶絺鏋岄梻鍌欐祰濡椼劑鎮為敃鍌氱闁搞儺鍓欑粻鏍煙椤栧棗鎳忓▓鏇㈡⒑鐠恒劌鏋旈柡鍜佸亝缁旂喖寮撮姀鈥崇檮婵犮垼顫夌换鍌滅礊婵犲洤鏋侀柟鐗堟緲闁卞洦銇勯幇鈺佺仾闁伙絿澧楃换婵嬫偨闂堟稐绮堕梺缁橆殔閿曘倝锝炶箛姘ヤ汗闁圭儤鍤﹂敃鍌涚厱闁哄洢鍔岄悘锟犳煛閸涱喚鐭掗柡宀嬬秮楠炲洭妫冨☉姗嗘浇婵犳鍣徊浠嬫偋閹炬剚娼栭柧蹇撴贡绾惧吋淇婇姘础缂佽绶氬娲传閵夈儛锝夋煟濡ゅ啫鈻堢�规洘妞芥慨锟介柍鈺佸暙閸斿懘姊洪棃娑氬婵炲眰鍔戝鍫曞箹娴ｅ厜鎷洪梺鍦焾濞撮绮婚幘缁樼厵闁告劘灏欑粻鑽わ拷瑙勬礃閸旀瑩銆佸☉銏″�风紒顔款潐鐎氳棄鈹戦悙鑸靛涧缂佽弓绮欓獮澶愭晸閻樿尙鏌堥梺缁樺姇椤曨厾绮绘ィ鍐╁仯闁搞儱娲ら幊鎰板汲閵堝鍊甸悷娆忓绾炬悂鏌涢妸锔姐仢濠碘�崇埣閺佹劖寰勬繝鍕垫О闂備線娼ц噹闁告劑鍔庨濠囨⒒閸屾艾锟介绮堟笟锟介獮鏍敃閳锋碍妞芥慨锟介柕鍫濇噹閻庮厼鈹戦悙鍙夆枙濞存粍绮撻幃锟犲即閵忥紕鍘甸梺缁樺灦閿氶柣蹇撶Ч閺岋繝鏁撻懞銉ь浄閻庯綆鍋嗛崢钘夆攽閳藉棗鐏犻柣蹇旂箞閹啫煤椤忓懐鍘遍梺鐟扮摠缁诲啰鎷归敍鍕＜閺夊牄鍔屽ù顔尖攽閳╁啰鎽冩い锔藉▕閺岋繝宕遍埡浣糕拫闂佸搫鐭夌槐鏇熺閿曞倸绀堢憸搴ㄥ礆濞戞瑧绡�缁剧増锚婢ф煡鏌熼鐓庯拷瑙勭┍婵犲洤绠瑰ù锝堫潐濞呭棝鏌ｉ悩杈╊槮闁哥喎娼￠獮妤冿拷锝庡枟閳锋帡鏌涚仦鍓ф噭缂佷胶澧楁穱濠傤渻閻撳骸顬嬪┑鐐叉閸ㄤ粙寮幘缁樺亹闁哄被鍎查敍妤呮⒒娴ｇ懓顕滅紒璇插�胯棟妞ゆ牜鍋涢崙鐘层�掑鐐闂佸搫鐬奸崰鏍嵁閸℃凹妾ㄩ梺鎼炲�楅崰鎰板Φ閸曨垰鐓涢柛鎰╁妼楠炲姊虹拠鈥虫灍妞ゃ劌锕顐﹀箛椤撶喎鍔呴梺鐐藉劥鐏忔瑩寮弽顓熲拻濞达絽鎲￠崯鐐烘煟閻旀潙鍔氶摶鐐寸節闂堟稒锛嶆繛鍏肩墵閺屟嗙疀濮樺吋缍堥悗瑙勬礀椤︾敻寮婚弴鐔虹闁割煈鍠栨慨鏇㈡⒑缂佹缂氶柛銊ㄦ椤繐煤椤忓懎浠梺鍝勵槹鐎笛囶敊閿熶粙姊绘担鐑樺殌闁搞倖鐗犻獮蹇涙晸閿燂拷?");
					LogManager.logger.error(sbd.toString());
				}
				return true;
			}
		
		}.submit();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810375;

	public int getType() {
		return 810375;
	}


	public CNoOperationKick() {
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
		if (_o1_ instanceof CNoOperationKick) {
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

	public int compareTo(CNoOperationKick _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

