
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
				if (!ok) {// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒绾惧鍞归梺璺ㄥ枑閺嬭崵绮婚幘姹囷拷浣肝旀担鐟邦�撴繛鎾村嚬閸ㄩ亶鏌ㄩ妶鍡欑瘈鐎典即鏀卞姗�鏁撻懞銉︾妤犵偛锕ラ幆鏃堝Ω閵夈儳锟筋參姊虹粙璺ㄧ伇闁稿鍋ら幃锟犳晲婢跺苯褰勯梺鎼炲劘閸斿矂宕甸浣虹闁稿繒鍘ф慨宥夋煛瀹�瀣瘈鐎规洖宕灒闁兼祴鏅濋崢婊堟⒒娴ｅ憡鎯堥悶姘煎亰瀹曟繈骞嬮敃锟界粻鏍煏閸繍妲哥痪鎯у悑缁绘盯骞嬮悜鍥︾返婵炲銆嬮幏锟�
					Procedure.psend(roleId, new SReturnLogin());
					StringBuilder sbd = new StringBuilder();
					sbd.append("闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸啴鏁撴禒瀣�挎繛宸簼閻撴洟鏌熼幍铏珔濠碘�茬矙閺岋繝宕卞Ο婊勫緧=").append(roleId).append(", 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐礃椤曆囧煘閹达附鍋愰柛娆忣槹閹瑧绱撴担鍝勵�岄柛銊ョ埣瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘介梺瑙勫劤椤曨參骞婇崨顖滅＜閺夊牄鍔岀粭褔鏌ㄩ悢鍛婄伄缂傚秴妫欑粋宥夋倷鐎靛壊娴勯梺闈涚返妫颁胶鐩庨梻浣烘嚀閹碱偊顢栭崨瀛樺�舵い蹇撶墛閻撳繘鏌涢妷鎴濆枤娴煎倿姊虹紒妯荤叄缂佽埖宀稿璇测槈閵忕姈銊╂煥濠靛棙鍣归崬顖炴⒒娴ｇ儤鍤�闁搞垺鐓￠垾锕�鐣￠柇锔界稁闂佹儳绻愬﹢閬嶆儗濞嗘挻鐓欑紒瀣仢椤掋垽鏌熼悿顖欏惈缂佽鲸鎸荤粭鐔煎炊瑜庨悘鍫濃攽閻愬瓨缍戦柛銏＄叀椤㈡岸鏁愰崼顐ｂ枌闂備浇妗ㄩ悞锕傚箲閸ヮ剙绠栭柟顖嗗懏娈曢梺璺ㄥ枔閺咁偅绔熼弴銏″癄濠㈣绻傜紞濠囧极閹版澘閱囨い鎰╁灪閻ｇ増绻濋悽闈涗粶闁绘锕ら～蹇氥亹閹烘嚦锕傛煕閺囥劌鐏￠柡鍛矒閺岋綁骞囬棃娑橆潽濠殿噯绲介悧鎾愁潖閾忓湱纾兼俊顖氭贡缁讳線姊洪崫銉バｉ柣妤冨█瀹曟椽濮�閳╁啫鍔呴梺闈涚墕濞层劑寮堕幖浣光拺闁圭娴风粻鎾绘煙閸愯尙绠荤�规洘鍔欓、娑㈡倷缁瀚藉┑鐐舵彧缁蹭粙骞夐敓鐘茬柈闁绘劕顕粻楣冩偣閸ュ洤鎳愰弳銈夋倵鐟欏嫭纾搁柛銊︽そ婵″爼鏁愭径濠勵槰闂侀潧臎閸愩劎顔婇梻鍌氬�风粈渚�骞栭鈷氭椽濮�閵堝懎鐎┑鐐叉▕娴滄粓鎮￠弴銏＄厵闁绘垶锚閻忓秹鏌￠敓鑺ョ鐎ｎ偆鍘藉┑鈽嗗灠閻忔繈鎯冨ú顏呯厱闁瑰瓨绻冪拹锛勭磼鏉堛劌娴┑鈩冪摃椤︽娊鏌￠崱鈺佸⒋闁哄矉绱曟禒锕傚礈瑜庨崚娑欑節绾版ê澧查柟顔煎�规穱濠囧箹娴ｈ娅嗛柣鐘辩閸熷潡骞楃�ｎ喗鈷掗柛灞剧懄缁佺増淇婂鐓庡婵炲棎鍨介弫鎾绘偐閺屻儲锛楅梻浣瑰缁诲倿藝椤栫偛鍑犲〒姘炬嫹闁哄瞼鍠栭獮鍡氼檨闁搞倗鍠愰妵鍕煛閸愩劌骞嬮梺璇″枟椤ㄥ﹪寮幇顓熷劅闁炽儴灏欓弫鏍⒒娴ｅ憡鍟為柣鐔村劚铻炴繝闈涙－濞兼牠鏌ц箛姘兼綈鐎规洖顦甸弻鏇熺箾閸喖濮曢梺缁樼缚閸ㄨ棄顫忓ú顏呭仭闁哄瀵ч锟介梻浣烘嚀閸ゆ牠骞忛敓锟�?");
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

