
package fire.pb.huoban;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CZhenrongMember__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CZhenrongMember extends __CZhenrongMember__ {
	@Override
	protected void process() {
		// protocol handle		
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		
		if (members.size() > 4)
			return;
		
		java.util.Set<Integer> setMember = new java.util.HashSet<Integer>(members.size());
		setMember.addAll(members);
		
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶鎸抽弻鈩冩媴閻熸澘顫掗悗瑙勬磸閸旀垿銆佸▎鎾崇妞ゎ剦鍠掗弳鏄〆rs闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵潙顫濋懜娈匡拷鏍ㄧ箾鐎涙鐭婄紓宥咃躬瀵鈽夐姀鐘电杸闂傚倸鐗婄粙鎺楁倶閸儲鐓熼幖娣灱婢规ɑ銇勯敂鍨祮濠碉紕鏁诲畷鐔碱敍濮橀硸鍞洪梻浣虹帛閸旀牕顭囧▎鎿冩晜闁割偅娲橀埛鎴︽煕濞戞﹩鐓繛鍫熺矊闇夋繝濠傚暟閸╋絿锟芥鍠栭…鐑藉箖閵忋倕绀傞悘蹇旂墬鐎氫粙姊虹拠鏌ュ弰婵炰匠鍕彾濠电姴浼ｉ敐澶樻晪闁跨喍绮欏濠氭晲婢跺浜滈梺鍛婄缚閸庢煡宕甸崒婊呯＝濞达絽鎼牎闂佸湱鎳撳ú銈夘敋閿濆棛绡�婵﹩鍎甸埡鍛厓閺夌偞濯介崗宀勬煟椤愩垹顏慨濠冩そ楠炴牠鎮欓幓鎺懶ら梻浣筋嚙缁绘垹鎹㈤崼銉у祦婵鎷风�规洘绮嶉幏鍛存偖鐎电绨ラ梻鍌氬�烽懗鍓佸垝椤栫偞鏅梻浣告憸閸犲酣鎮樺┑瀣畳婵＄偑鍊栧Λ浣规叏閵堝鐭楅煫鍥ㄦ尨閺�浠嬫煟濡绲婚柡鍡欏仱閺屾洟宕堕妸褏鐣哄銈冨妸閸庣敻骞冨▎鎴嫹濞戞顏嗗閸愬弬鏃堟偐闂堟稐娌柣銏╁灙閿熻姤鍓氶崵鏇熴亜閹虹偞瀚归梺瀹狀潐閸ㄥ灝鐣烽悢纰辨晝闁靛牆瀚Λ顖炴⒒閸屾瑧绐旀繛浣冲厾娲Χ閸ラ攱瀚规慨姗嗗亜瀹撳棛锟芥鍣崑濠傜暦閹烘鍊烽柡澶嬪灣閹綁姊虹拠鑼闁稿濮磋灋闁告洦鍘剧壕濂告煃閸濆嫭鍣洪柍閿嬪笒闇夐柨婵嗘川閹藉倿鏌涢妶鍛殻闁哄本鐩俊鎼佸Χ閸涱厾銈柣搴ゎ潐濞诧箓宕圭捄渚殨闁割偅娲栫粻锝夋煟濡寧鐝い鏃�娲樼换婵嗏枔閸喗鐏嶅銈庡幖閻楁挸鐣峰ú顏勫唨妞ゆ挾鍋熼敍娑㈡⒑缂佹﹩鐒界紒顕呭灦閹繝濡烽埡鍌滃幗闂佸搫娲ㄩ崑娑㈡晸閽樺璐￠柨鐔诲Г閻旑剟骞忛敓锟�
		if (setMember.size() != members.size()) {
			return;
		}
		
		new PUpdateHuoBanZhenRong(roleId, 0, zhenyingid, members, PUpdateHuoBanZhenRong.HUOBAN).submit();
		
//		new xdb.Procedure()
//		{
//			protected boolean process() throws Exception {
//				if (members.size() > 4)
//					return false;
//				xdb.Procedure.pexecute(new PUpdateHuoBanZhenRong(roleId, 0, zhenyingid, members, PUpdateHuoBanZhenRong.HUOBAN));
//				return true;
//				boolean suc = huobancol.setFightHuoBans(members);
//				if (suc) {
//					//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍讲鏋欓梺缁樺笩婵倗鎹㈠☉銏犲耿婵☆垵顕х喊宥夋煟閻斿摜鎳曠紒鐘虫崌楠炲啫螖閸涱喗娅滈柟鑲╄ˉ閸撴繈鎮樺澶嬧拺缂佸顑欓崕婊呯磼缂佹绠炵�殿喖顭峰鎾閻樿鏁规繝鐢靛Т閻忔岸宕濋弽顐ゆ噮缂傚倸鍊烽懗鍫曟惞鎼淬劌鐭楅煫鍥ㄧ☉缁狀垶鏌ｉ幋锝呅撻柍閿嬪笒闇夐柨婵嗘川閹藉倹绻涢崗鐓庡闁哄本绋掗幆鏃堝灳閾忣偄锟筋垶姊洪柅娑氣敀闁告梹鍨舵穱濠囨嚋闂堟稓绐炴繝鐢靛Т鐎氼剟鐛崼銉︹拻濞达絿鍎ら崵锟芥繝鈷�鍛珪闁告帗甯￠、娑㈡倷閼碱剙骞堥梻浣告贡閸庛倝銆冮崱娑欏亗闁哄洨鍠嗘禍婊堟煙閹佃櫕娅呴柨鐔诲Г濞茬喎顕ｇ粙娆惧悑闁搞儮鏅濋敍婊堟⒑閸撴彃浜濇繛鍙夊灴楠炲銈ｉ崘鈺冨幐闁诲繒鍋涙晶钘壝洪幘顔界厵妞ゆ柨鎼悘鏌ユ煛鐏炶濡块柨鐔告灮缂嶅棙绂嶅┑瀣�堕幖娣妽閳锋帒霉閿濆懏鍟為柟顖氱墦閺岋綁顢橀悜鍡樞ㄩ梺鐟扮畭閸ㄥ綊鍩為幋锕�骞㈡繛鍡樺姈椤旀洟姊绘担绛嬪殐闁搞劌鐖煎畷鎴炵節閸嬫枻绲鹃妶锝夊礃閳圭偓瀚奸梻渚�娼荤�靛矂宕㈤挊澶嗘瀺闁哄洨鍋愰弨浠嬫煟閹存繃澶勯悗姘秺濮婄粯鎷呴崨濠冨創婵犮垼娉涘ú顓㈠极閹剧粯瀵犲璺虹焿缁辩偤姊洪崫鍕棞婵☆偅绻堥獮鍐ㄎ旈崨顔芥珳闁硅偐琛ラ敓鍊熷皺閻╁孩淇婇悙顏勶拷鏇燁殽韫囨稑绠柨鐕傛嫹
//					xdb.Procedure.pexecute(new PUpdateHuoBanZhenRong(roleId, 0, zhenyingid, members, PUpdateHuoBanZhenRong.HUOBAN));
//				}
//				else {
//					SChangeZhenrong snd = new SChangeZhenrong();
//					snd.zhenrong = zhenyingid;
//					snd.zhenfa = 0;
//					snd.huobanlist.clear();;
//					snd.reason = 5;
//					xdb.Procedure.psendWhileCommit(roleId, snd);
//				}
//				return suc;
//			};
//		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 818838;

	public int getType() {
		return 818838;
	}

	public int zhenyingid;
	public java.util.ArrayList<Integer> members;

	public CZhenrongMember() {
		members = new java.util.ArrayList<Integer>();
	}

	public CZhenrongMember(int _zhenyingid_, java.util.ArrayList<Integer> _members_) {
		this.zhenyingid = _zhenyingid_;
		this.members = _members_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(zhenyingid);
		_os_.compact_uint32(members.size());
		for (Integer _v_ : members) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		zhenyingid = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			int _v_;
			_v_ = _os_.unmarshal_int();
			members.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CZhenrongMember) {
			CZhenrongMember _o_ = (CZhenrongMember)_o1_;
			if (zhenyingid != _o_.zhenyingid) return false;
			if (!members.equals(_o_.members)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += zhenyingid;
		_h_ += members.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(zhenyingid).append(",");
		_sb_.append(members).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

