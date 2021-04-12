
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
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯幇闈涘閻庢艾缍婇弻銊╁即閻愯鎷烽幖浣瑰�峰┑鐘叉处閻撳啴寮堕悙鏉戭棆妞わ讣绠撻弻锝堢疀閹垮嫬浼愬銈庝簻閸熷瓨淇婇崼鏇炲耿婵炲棗娴氬椋庣磽閸屾瑧璐伴柛鐘崇墱缁棃鎮烽柇锕�娈ㄩ梺鍛婂姇濡﹪鎮￠妷鈺傜厱妞ゆ劑鍊曢弸鏃堟煕濞嗗繑顥㈡慨濠呮缁辨帒螣閼姐倕寮冲┑鐘媰閸愵喖寮伴梺璇″灠閼活垶鍩㈡惔銊ョ閻庣數顭堥獮鎰版煟鎼达絾顏熼柟椋庡厴閹鏁愭惔鈥愁潻闂佺硶鏅涢惌鍌氼潖閸濆嫮鏆﹂柛銉ｅ妼濞堝矂姊洪崫銉ユ瀾闁瑰憡濞婇悰顕�宕橀妸銏＄�婚梺鐟扮仢閸燁垶寮查姀锛勭閺夊牆澧介崚浼存煙绾板崬浜炵�垫澘锕幐濠冨緞閸℃ɑ鏉搁梻浣瑰缁嬫垹锟芥凹鍓氱粋宥嗙附閸涘﹦鍘辨繝鐢靛Т閸熺増鏅堕悽纰夋嫹濞堝灝鏋涙い顓㈡敱娣囧﹤顫㈠畝濠冃梻浣规た閸樹粙骞愭ィ鍐ㄧ疅闁归棿鐒﹂崑瀣煕椤愶絿绠橀柣鐔哥叀濮婅櫣绮欏▎鎯у壈闂佺锕ょ紞濠冧繆閻㈢绀嬫い鏍ㄦ皑椤斿﹪姊洪悷鎵憼缂佽绉电�电厧鐣濋崟顑芥嫼闁哄鍋炴竟鍡浰囬敃鍌涚厱闁绘柨鎲＄亸锔撅拷娈垮枛椤攱淇婇幖浣肝ㄩ柕蹇婃濞兼梹绻濈喊妯活潑闁割煈鍨抽幏鍐晜閽樺鍤ら梺璺ㄥ枍缁瑥顫忕紒妯诲闁绘垶锚濞堝苯鈹戦埥鍡楃仩闁挎洏鍎崇划瀣吋婢舵ɑ鏅滈梺鍛婃礀閻忔氨绱炴惔銊︹拺闁告稑锕︾粻鎾绘倵濮橆剚鍤�妞わ箑婀遍敓鍊燁潐濞叉﹢宕曟總鏉嗗洭宕ｆ径鍫滅盎濡炪倖甯幏鐑芥煟濡や焦宕岀�殿喖顭烽弫鎰板幢濡搫濡抽梻渚�娼х换鎺撴叏閺夋嚩鎺楀醇閵夛腹鎷洪梺鍛婄☉閿曪箓骞婇崘顔界厱闁绘柨鎲＄亸锕傛煙椤旇宓嗘い銏″哺閺佹挻绂掔�ｎ剙绁﹂梺鎼炲労閸撴岸宕戠�ｎ喗鐓曟い鎰Т閻忊晛鈹戦鑺ュ�愰柡宀嬬稻閹棃鏁嶉崟顓熸闂備胶顭堥柊锝嗙閸洜宓佸┑鐘叉搐缁犳盯鏌℃径濞夸粧缂佽精娉涢埞鎴炲箠闁稿﹥娲熼獮濠呯疀濞戞鍘遍梺纭呮彧闂勫嫰宕戦敐澶嬬厱闁靛鍨崇粔鍫曟煙瀹勬澘妲婚柣锝囧厴瀹曞爼鏌ㄧ�ｎ亶浼撳┑鐘垫暩婵數鍠婂澶嬪亗闁哄洢鍨洪悡娆撴⒑椤撱劎鐣卞褜鍣ｉ弻锟犲幢濞嗗繋娌梺闈涙搐鐎氱増淇婇幖浣肝ㄦい鏍ㄧ箓閹牓鏌ｆ惔銏╁晱闁哥姵鐗犻垾锕傛倻閽樺鐎梺褰掑亰閸樿偐娆㈤悙娴嬫斀闁绘ɑ褰冮銏㈢磽瀹ュ懎锟藉灝顫忕紒妯肩懝闁跨喕妫勯…鍥槾闁瑰箍鍨介獮鎺楀箻閺夋垵浼庨梻浣虹帛閸ㄧ厧螞閸曨厾妫憸蹇曟閹烘惟闁靛／锟介弨绡�
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

