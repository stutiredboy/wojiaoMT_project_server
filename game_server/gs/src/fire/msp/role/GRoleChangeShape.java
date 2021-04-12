
package fire.msp.role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GRoleChangeShape__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GRoleChangeShape extends __GRoleChangeShape__ {
	@Override
	protected void process() {
		// protocol handle
		fire.pb.scene.movable.Role  role = 
				fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
			if(role == null) return;
			if(null == role.getScene()) return;
			role.setModeid(shape);
			mkio.Protocol send;
			if (reason == HUANSE) {
				send = new fire.pb.move.SRoleModelChange();
				((fire.pb.move.SRoleModelChange)send).roleid = roleid;
				((fire.pb.move.SRoleModelChange)send).shape = shape;
			} else {
				send = new fire.pb.move.SRoleChangeShape();
				((fire.pb.move.SRoleChangeShape)send).roleid = roleid;
				((fire.pb.move.SRoleChangeShape)send).shape = shape;
			}
		//	role.sendWhoSeeMeAndMe(send);
			if(role.checkVisible())
			{
				role.sendAround(send);
			}
			// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬姘卞闂佹眹鍨归…宄邦潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙鎻掔骇闁绘濮撮悾鐑藉箛閺夎法顔愭繛杈剧悼椤牓鎮楅銏♀拺缂佸娉曢悘閬嶆煕鐎ｎ剙浠遍柟顕嗙節婵＄兘鍩￠崒婊冨箺闂備礁鎼ú銊╁磻濞戙垺鏅搁柦妯侯槹鐠愶繝鏌ㄩ悢璇残撻柣鏃戝墴楠炲繘鏁撻敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ銈囩磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿京纾藉ù锝堟鐢盯鏌ｉ埡濠傜仩闁伙絿鍏橀、鏃堝醇濠靛牜妲版俊鐐�曠换鎰板蓟婵犲偆鐓ラ柛顐ゅ暱閹疯櫣绱掔紒銏犲箹闁瑰啿绻橀幃鐢割敂閸℃瑧锛滃銈嗘婵倗浜搁銏＄厽闁挎繂顦伴弫杈╃磼閾忚娅曠紒顔界懇瀹曞綊顢欓懖鈹垮仏闂傚倸鍊烽懗鍓佸垝椤栫偛钃熼柕濞垮労閸ゆ洟鏌涢幘鑼瓘闁瑰嘲鍢查～婵嬵敃閵堝洨鍘繝娈垮枛閿曪妇鍒掗鐐茬闁告稒娼欏婵嗏攽閻樻彃锟界懓鈻撳锟藉缁樻媴閸涘﹤鏆堝┑鈽嗗亝閸ㄥ灝顫忔禒瀣妞ゆ挾濮烽悞鍧楁倵楠炲灝鍔氶柟宄邦儔閹繝濡烽埡鍌滃幈濡炪倖鍔х徊璺ㄧ不閹剧粯鐓曢柕鍫濇閻忔挳鏌″畝锟介崰鏍х暦濡ゅ懏鍤冮柍鍝勫�归鍐⒒娴ｅ憡鍟為柡灞诲妿缁棁銇愰幒鎴犵暫闂佺偨鍎查弸濂稿几鎼淬劍鐓欓柣鎰靛墯缂嶆垵霉閻欙拷閸ㄨ泛顫忓ú顏勭闁绘劖褰冩慨搴♀攽閻愯尙婀撮柛濠冾殜閺佹捇鎳為妷銉ユ瘓闂佸憡鎸鹃崰鏍Υ娓氾拷瀵噣宕奸悢鍛婎仧闂備浇娉曢崳锕傚箯閿燂拷,婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕烽鐘电効闂佸湱鍎ゅΛ鎴﹀箯閻戣姤鏅查幖绮癸拷鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼閸ゅ秹鏌曟径濠傛灓濞存粠浜ｅΛ鐔奉渻閵堝棛澧遍柛瀣☉鏁堥柡灞诲劜閳锋垶銇勯幒鐐村缂備礁顦遍弫濠氬箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫬鏆欓柛濠呭吹閺侇喖鈽夊▎宥勭盎闂侀潧顦崕鍝勎ｉ搹鍦＜閺夊牄鍔嶇亸顓熴亜閹剧偨鍋㈢�规洦浜畷姗�顢橀悙鏉戝壍婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴欏灩閻ゎ喗銇勯幇鈺佸姢濞存粈绮欏娲嚒閵堝憛銏＄箾濞村娅囧ù婊咁焾閳诲酣骞嬮悩闈涚闂備胶绮崝妤呭磿閵堝鐓曢柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘嚚鐟邦煥閿熶粙宕￠幎钘夎摕婵炴垯鍨圭粻濠氭倵闂堟稒鍟為柛锝勫嵆濮婅櫣鎷犻垾铏彎濠电偘鍖犻崱娆庤埅闂傚倷鑳堕崢褔锝為弴銏犵９婵°倕鎳忛崕濠囨煕椤愮姴鍔滈柍閿嬪灴濮婂宕奸悢鐑樺垱闂佺粯绋掔划搴ｆ閹烘绠甸柟鐑樺灍閹稿啫鈹戦悙鏉戠仴闁诲繑宀告俊鍫曟晲婢跺﹦顦ㄩ梺鍐叉惈閸燁偊鐛幇鐗堚拻濞达絿顭堥ˉ蹇涙煕鐎ｎ偄娴�规洘鍨垮畷鐔碱敆娴ｅ湱褰块梻浣告贡閾忓酣宕板Δ鍛亗婵炲棙鍔戞禍婊堟煛閸ユ湹绨奸悗姘贡缁辨挻鎷呴崫鍕戯綁鏌ｅΔ鍐ㄐ㈡い鏇稻缁绘繂顫濋锟介懓鍨攽鎺抽崐鏇㈡晝閵堝绠栭柟杈鹃檮閳锋垹绱掗娑欑濠⒀勭叀閺屾洟宕堕埡浣锋閻庤娲滄繛锟界�殿喕绮欓、姗�鎮㈤崣澶婎伜婵犵數鍋犻幓顏嗙礊閿熻棄鈹戦鍝勶拷妤�鈽夐悽绋块唶闁哄洨鍠撻崢閬嶆⒑閹稿海绠撶紒缁樺浮閹箖宕归顐ｎ啍闂佺粯鍔樼亸娆戠不婵犳碍鐓涘ù锝堫潐瀹曞矂鏌℃担瑙勫磳闁轰焦鎹囬弫鎾绘晸閿燂拷?
			if (!teammembers.isEmpty())
				gnet.link.Onlines.getInstance().send(teammembers, send);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730914;

	public int getType() {
		return 730914;
	}

	public final static int TUIBIAN = 0;
	public final static int HUANSE = 1;
	public final static int OTHER = 2;

	public long roleid;
	public int shape;
	public int reason;
	public java.util.HashSet<Long> teammembers;

	public GRoleChangeShape() {
		teammembers = new java.util.HashSet<Long>();
	}

	public GRoleChangeShape(long _roleid_, int _shape_, int _reason_, java.util.HashSet<Long> _teammembers_) {
		this.roleid = _roleid_;
		this.shape = _shape_;
		this.reason = _reason_;
		this.teammembers = _teammembers_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(shape);
		_os_.marshal(reason);
		_os_.compact_uint32(teammembers.size());
		for (Long _v_ : teammembers) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		shape = _os_.unmarshal_int();
		reason = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			long _v_;
			_v_ = _os_.unmarshal_long();
			teammembers.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GRoleChangeShape) {
			GRoleChangeShape _o_ = (GRoleChangeShape)_o1_;
			if (roleid != _o_.roleid) return false;
			if (shape != _o_.shape) return false;
			if (reason != _o_.reason) return false;
			if (!teammembers.equals(_o_.teammembers)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += shape;
		_h_ += reason;
		_h_ += teammembers.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(shape).append(",");
		_sb_.append(reason).append(",");
		_sb_.append(teammembers).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

