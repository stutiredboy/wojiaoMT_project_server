
package fire.pb.clan.fight;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGetClearTime__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/**
 * 闂傚倸鍊峰ù鍥敋瑜嶉湁闁绘垼妫勯弸渚�鏌涘☉姗堟敾婵炲懐濮垫穱濠囧Χ閸涱喖娅￠梺璺ㄥ枙濡嫰宕弶鎴犳殾闁靛ň鏅涚痪褔鏌熺�电浠︾悮锝夋⒒娴ｇ瓔鍤欑紒缁樺浮瀹曟垵鈽夊▎鎰彿婵炲濮撮鍛存偂濠靛鐓涢柛鎰╁妿婢ф盯鏌涙繝鍕毈闁哄被鍔岄埞鎴﹀幢濞戞唻鎷峰Δ锟介湁婵犲鎷风紒顔界懇瀵鈽夊鐐闁挎繂妫欓悡銉╂倵濮樼厧鏋ょ紒顔剧帛閵堬綁宕橀埡鍐ㄥ箥闂備胶顢婇～澶愬礉閺嶎厽鍋熸い蹇撶墛閻撴洟鏌曢崼婵囧櫤濠㈣泛瀚槐鎺旂磼濡吋鍒涢悗瑙勬磸閸旀垿銆佸锟芥慨锟介柣妯诲絻瀵兘姊虹拠鎻掝劉妞ゆ梹鐗犲畷鎶筋敋閿熻棄鐣烽幋鐐电瘈闁搞儜鍛毇闁荤喐绮嶉弻銊╂偩閻戣姤鍋傞幖瀛樕戦弬锟介梻浣稿閸嬪懐绮欓幋鐐殿洸濞寸厧鐡ㄩ埛鎺楁煕鐏炲墽鎳呮い锔肩畵閺岀喓鍠婇崡鐐板枈閻庤娲﹂崹鍫曘�侀弴銏℃櫆闁芥ê顦崙浠嬫⒒娴ｈ櫣甯涢柟绋挎憸閿熷�燁嚃閸嬪嫰鍩ユ径鎰潊闁斥晛鍟鐔兼⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟� by changhao
 *
 */
public class CGetClearTime extends __CGetClearTime__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure getcleartime = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{	
				int curweek = fire.pb.activity.clanfight.ActivityClanFightManager.getInstance().curweek.get();
				if (curweek == -1)
				{
					return false;
				}
				
				long cur = System.currentTimeMillis();
				
				long monday0000 = fire.pb.activity.clanfight.ActivityClanFightManager.GetMonday0000ByTime(cur);
				curweek = curweek % 24;;
				int r = 24 - curweek;
				
				long day1 = 24 * 3600 * 1000;
				
				long end = monday0000 + day1 * 7 * r;
				
				SGetClearTime msg = new SGetClearTime();
				msg.cleartime = end;
								
				mkdb.Procedure.psendWhileCommit(roleid, msg);

				return true;
			}
		
		};
		
		getcleartime.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808545;

	public int getType() {
		return 808545;
	}


	public CGetClearTime() {
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
		if (_o1_ instanceof CGetClearTime) {
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

	public int compareTo(CGetClearTime _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

