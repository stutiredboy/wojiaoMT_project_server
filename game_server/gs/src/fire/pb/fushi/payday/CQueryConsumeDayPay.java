
package fire.pb.fushi.payday;

import fire.pb.fushi.DayPayManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CQueryConsumeDayPay__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閻樻爠鍥╁彄闁搞儯鍔嶉悡銉︺亜韫囨碍纭鹃柍瑙勫灴椤㈡瑩鎯岄顐＄盎闁伙絿鍏橀、妤呭礋椤愩垹浜堕梺璇叉捣閺佽顭囨繝姘濡炲瀛╅崰鍡涙煕閺囥劌澧版い锔诲枛椤啴濡舵惔鈥茬盎濡炪倧绠撴禍鍫曞极閹惧顩烽悗锝庡亝闁款參姊洪棃娑氬ⅱ妞ゎ厼鐗撻、姘舵晲婢跺﹪鍞堕梺鍝勬川閸嬬喖顢樺ú顏呪拺缂備焦鈼ら鍫熷�舵慨姗嗗劮閹烘挻鍎熼柕蹇嬪灮閻﹀牓姊哄Ч鍥х伈婵炰匠鍕浄闁挎洖鍊归悡娆戠磼鐎ｎ偒鍎ラ柣鎾炽偢閺岀喖顢欓崫鍕紙濡炪們鍨洪〃濠傜暦閻旂⒈鏁冮柕鍫濋閺佹悂姊婚崒姘拷椋庣矆娓氾拷閹ê鈹戠�ｅ灚鏅為梺褰掑亰閸忔﹢寮搁弬妫靛綊鎮╁顔煎壉闂佺粯鎸鹃崰鏍蓟閻斿吋鐒介柨鏇嫹闁诲繒濞�閺岋綁濡搁敂濮愪虎閻庢鍣崑濠傜暦婵傜唯闁挎棁顫夌�氬ジ姊洪崫鍕垫Ш闁稿鍋炵粩鐔煎幢濞戞顦悗骞垮劚椤︿即鎮￠弴銏＄厸闁告劖瀵х�氬綊姊洪懡銈呮瀭闁稿海鏁婚獮鍐┿偅閸愨晛锟藉鏌﹀Ο渚Ш妞ゃ垹鎳樺铏圭磼濡櫣浠村┑鈽嗗亝閻熴儵顢氬▎寰濇椽顢旈崨顏呭闂備礁鎲￠幐鏄忋亹閸愨晝顩查柡宥庡幗閻撴洟鏌曟繛鍨姶闁绘挸銈搁幐濠傗攽閸ャ儰绨婚梺瑙勬緲閻栫厧顬婇锟介弻宥夋煥鐎ｎ亝璇為梺鍝勬湰缁嬫挻绂掗敃鍌氱鐟滃酣宕抽鍓х＝濞达絿鎳撴慨鍫熸叏婵犲倹璐￠柟骞垮灩閳藉濮�閳ュ厖绨甸梺鐟板悑閹矂宕板璺鸿Е閻庯綆锟筋厽妫冮幃鈺呮濞戞鎹曠紓鍌欒兌缁垶鏁冮姀鐙�鍤曟い鎰剁畱缁犺崵绱撴担鑲℃垵鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�? by changhao
 */
public class CQueryConsumeDayPay extends __CQueryConsumeDayPay__ {
	@Override
	protected void process() {
		
		if (yesorno == 1)
		{			
			final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
			if (roleid < 0)
				return;
			mkdb.Procedure queryconsumedaypay = new mkdb.Procedure()
			{
				@Override
				protected boolean process()
				{		
					gnet.link.Role linkrole = gnet.link.Onlines.getInstance().find(roleid);
					if (linkrole != null)
					{
						int userid = linkrole.getUserid();
						if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴楠炴﹢鎳犻澶嬓滈梻浣规偠閸斿秶鎹㈤崘顔嘉﹂柛鏇ㄥ灠閸愶拷濡炪倖鍔﹀锟界紒顔煎缁辨挻绗熸繝鍐伓濠电姰鍨煎▔娑㈩敄閸曨厽宕查柛鈩冪♁閻撳繘鏌涢锝囩畺闁革絾妞介弻娑㈡晲閸涱喛纭�缂備浇椴哥敮锟犲箖閳哄懏顥堟繛鎴炲笚閻庝即姊绘担鍛婃儓闁活剙銈稿畷浼村冀椤撶姴绁﹂梺绯曞墲閸戠懓危妤ｅ啯鈷戦柟绋挎捣閳藉绱掓径濠勭Ш鐎殿喖顭烽弫鎾绘偐閹绘帟锟藉灝顪冮妶鍡樺暗濠殿喚鍏樺鎶藉Χ閸涱亝鏂�濡炪倖姊婚妴瀣绩缂佹ü绻嗛柣鎰閻瑩鏌曢崱鏇狀槮閾绘牠鏌涘☉鍗炴灍婵炲懌鍨藉鐑樺濞嗘垵鍩岄梺娲诲墮閵堟悂骞嗗畝鍕缂備焦锚閿熺晫鏁婚弻锝夊閻樺啿鏆堟繛瀛樺殠閸婃繈寮婚悢椋庢殝闁哄瀵т簺婵＄偑鍊ら崑鍛崲閸儯锟戒礁螖娴ｅ摜绐為柣搴稻閹稿爼宕濋幋婵愭綎闁惧繗顫夊畷澶愭煏婵炲灝鍔滈柣蹇撴閳规垿鍩ラ崱妞剧盎闁诲孩鍑归崰姘跺礆閹烘梹瀚氱�瑰壊鍠栭幃鎴炵節閵忥絾纭鹃柨鏇畵閺佸秹鎮㈤崗灏栨嫽婵炴挻鑹惧ú銈嗘櫠椤斿墽纾煎璺侯煬閸ょ喓绱掗纰辩吋闁诡喒鏅濋幏鐘绘嚑椤掑鏅ｉ梻鍌欑濠�閬嶅煕閸儱鍌ㄥΔ锝呭暙閸屻劍绻濇繝鍌涘櫧缁惧墽鏅敓钘夌畭閸庡崬螞濞戞瑦娅犻柣銏犳啞閻撴盯鎮橀悙闈涗壕缂侊拷鐎ｎ剨鎷风憴鍕闁告鍥х厴闁硅揪绠戠粻娑欍亜閹剧绱￠柛銉ｅ妷閹疯櫣绱撻崒娆戝妽閽冮亶鎮樿箛鏇烆暭缂佺粯鐩幊鐘活敆閿熶粙寮稿☉姘炬嫹濞堝灝鏋涙い顓㈡敱娣囧﹪骞栨担鍝ュ幐闂佺鏈惌顔捐姳娴犲鈷掑ù锝勮閻掗箖鏌￠崼顐㈠缂侇喗鐟╅獮瀣晜缂佹ɑ娅嗛梻浣芥硶閸ｏ箓骞忛敓锟�? by changhao
						{
							fire.pb.fushi.DayPayManager.getInstance().ProcessDayPay(userid, roleid);	
						}					
					}
					
					return true;
				}
			};
			
			queryconsumedaypay.submit();	
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812595;

	public int getType() {
		return 812595;
	}

	public int yesorno; // 0是没有1是消耗 by changhao

	public CQueryConsumeDayPay() {
	}

	public CQueryConsumeDayPay(int _yesorno_) {
		this.yesorno = _yesorno_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(yesorno);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		yesorno = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CQueryConsumeDayPay) {
			CQueryConsumeDayPay _o_ = (CQueryConsumeDayPay)_o1_;
			if (yesorno != _o_.yesorno) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += yesorno;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(yesorno).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CQueryConsumeDayPay _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = yesorno - _o_.yesorno;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

