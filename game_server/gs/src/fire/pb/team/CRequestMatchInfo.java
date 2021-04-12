
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestMatchInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞稿墲瀵板嫮锟斤綆浜濋鍛攽閻愬弶鈻曞ù婊冪埣瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎲＄换鍐�冩繝鍌ゆ綎缂備焦顭囬悷褰掓煕閵夋垵鍠氬鑽ょ磽閸屾瑧顦︽い锕備憾瀵偆鎷犻懠顒佹闂佸搫娲㈤崹鍦不閿濆棛绡�闁靛骏绱曠粻鎾剁磽瀹ュ拑宸ラ柣锝呭槻铻栭柛娑卞幘椤ρ囨⒑閸忚偐銈撮柡鍛箞閸┿垼绠涢弴鐘碉紳闂佺鏈悷褏绮佃箛娑欑厵闁绘垹鐡斿Λ鎴︽煥閻旂儤娅曟繛鍛灲楠炲繘鎮滈懞銉у弳闂佺粯鏌ㄦ晶搴ㄦ儗濞嗘劦娈介柣鎰▕濡拷濡ょ姷鍋為悧妤呭箯閸涘瓨鍋″Λ棰佽兌缂嶅秹姊婚崒娆戭槮濠㈢懓锕畷鎴﹀川椤栨稑搴婇梺鍛婃处閸ㄩ亶宕戦敓鐘崇厪濠电偟鍋撳▍鍡涙煟閹捐泛鏋涢柡灞炬礉缁犳稒绻濋崘鈺冨絽闂備浇顕х换鎺撶箾閿熶粙鏌＄仦鍓ф创闁诡喓鍨婚幏鐘诲箵閹烘嚩銉╂煟閻斿摜鐭掓い锝忓濞嗐垹顫濋澶嬬稁濠电偛妯婃禍婊呯不瑜版帗鐓熼柟閭﹀幖缁茶鈹戦锟介ˉ鎾舵閹惧瓨濯撮柦妯侯槼閺佹寧绻濆▓鍨灁闁稿﹥绻傞锝夊蓟閵夈儵鍞堕梺鍝勬川閸嬬喖顢欏畝鍕拺缁绢厼鎷嬪鎰亜閵娿儲鍣归柨鏇樺灲瀹曪繝鎮欓埡鍌ゆ綌闂備焦鐪归崹褰掑箟閿熺姵鍋傞柕澶嗘櫆閸婄敻鏌ㄥ┑鍡欏嚬闁瑰弶鍎抽湁缁绢參鏀辩�氾拷
 * @author changhao
 *
 */
public class CRequestMatchInfo extends __CRequestMatchInfo__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestmatchinfo = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				SRequestMatchInfo msg = new SRequestMatchInfo();
				
				xbean.ETeamMatch ematch = xtable.Targetid2teammatch.get(0);
				if (ematch == null)
				{
					msg.playermatchnum = 0;
					msg.teammatchnum = 0;
				}
				else
				{
					msg.teammatchnum = ematch.getTeammatchdatalist().size();
					msg.playermatchnum = ematch.getRolematchdatalist().size();
				}
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);
				
				return true;
			}
		};
		
		requestmatchinfo.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794512;

	public int getType() {
		return 794512;
	}


	public CRequestMatchInfo() {
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
		if (_o1_ instanceof CRequestMatchInfo) {
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

	public int compareTo(CRequestMatchInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

