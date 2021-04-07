
package fire.pb.fushi.monthcard;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CBuyMonthCard__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌ｉ姀銏╃劸缂侊拷婢舵劖鐓ラ柡鍥╁仜閿熻姤鎮傚畷鎺楀Ω閿斿墽顔曢悗鐟板閸犳洜鑺遍懡銈囩＜闁绘瑱鎷烽柛銊ㄦ硾椤繐煤椤忓秵鏅㈤梺璺ㄥ枔閺咁偆鍒掗弮鍌︽嫹閻㈠憡浜ら柟宄板槻椤繈顢楁径瀣ф瀰闂備礁鎼張顒勬儎椤栫偑锟戒線寮撮姀鈩冩珳闂佹悶鍎弲婵嬪汲閵堝棔绻嗛柕鍫濇搐鍟搁梺绋垮閸ㄥ潡鐛箛娑欐櫢闁跨噦鎷� by changhao
 */
public class CBuyMonthCard extends __CBuyMonthCard__ {
	@Override
	protected void process() {
		// protocol handle
		
 		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
		{
			return;
		}
		
		mkdb.Procedure buymonthcard = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				if (fire.pb.fushi.Module.GetPayServiceType() == 0) //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫绮婚鐐村�甸柨婵嗛閺嬫盯姊婚崒銈呯仸闁哄被鍔戦幃銈夊磼濞戞﹩浼�?濠电姷鏁告慨鐢割敊閺嶎厼绐楁俊銈呮噺閺呮繈鏌嶉崫鍕櫣闁稿被鍔戦弻锝夋晲閸涱垳浼囨繛鎴炴尭缁夌數鎹㈠☉銏犵婵炲棗绻掓禒楣冩⒑缂佹ɑ灏伴柣鐔叉櫅椤繑绻濆顒勫敹闂佺粯姊规禍浠嬫晸閼恒儱娴�规洦鍨堕獮鏍ㄦ媴閸忓瀚肩紓鍌欑椤戝牆鈻旈弴鐘典笉闁告瑥顦禍婊勩亜閹捐泛浠﹂柛鐘成戦〃銉╂倷閼碱剛顔戦梺闈涙处閸旀瑩鐛幒鎴旀斀闁搞儯鍔嶉悵婵嗏攽閻樺灚鏆╁┑鐑囨嫹濠电偘鍖犻崗鐘虫そ婵¤埖寰勫Ο缁樻珕濠电偛顕崢褔鎮洪妸鈺佺厱闁硅揪闄勯悡鏇熺節闂堟稒顥滄い蹇ｅ亜椤儻顦虫繛鑼枛瀵鏁愰崨鍌涙閺佹捇鎸婃竟鈺傜☉铻栭柛娑卞枛娴犲ジ姊虹紒妯虹伇濠殿喓鍊濆鏌ュ箹娴ｅ湱鍙嗛梺缁樻礀閸婂湱锟芥熬鎷�  by changhao
				{
					boolean ok = fire.pb.fushi.MonthCardManager.getInstance().CheckMonthCardLimit(roleid);
					if (ok)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 190067, null);					
					}
					else
					{
						xbean.Properties prop = xtable.Properties.select(roleid);
						if (prop != null)
						{
							fire.pb.fushi.MonthCardManager.getInstance().ProcessMonthCard(prop.getUserid(), roleid);						
						}
					}					
				}
							
				return true;
			}
		};
		buymonthcard.submit();		
		
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812687;

	public int getType() {
		return 812687;
	}


	public CBuyMonthCard() {
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
		if (_o1_ instanceof CBuyMonthCard) {
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

	public int compareTo(CBuyMonthCard _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

