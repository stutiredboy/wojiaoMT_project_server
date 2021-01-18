
package gnet;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS

abstract class __GetMaxOnlineNum__ extends mkio.Rpc<gnet.GetMaxOnlineNumArg, gnet.GetMaxOnlineNumRes> { }
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GetMaxOnlineNum extends __GetMaxOnlineNum__ {
	@Override
	protected void onServer() {
		// request handle
	}

	@Override
	protected void onClient() {
		// response handle
	}

	@Override
	protected void onTimeout(int code) {
		// client only. 閿熸枻鎷蜂娇閿熸枻鎷� submit 閿熸枻鎷峰紡閿熸枻鎷烽敓鏂ゆ嫹 rpc 鏃堕敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓鎴鎷烽敓鏂ゆ嫹
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public int getType() {
		return 206;
	}

	public GetMaxOnlineNum() {
		super.setArgument(new gnet.GetMaxOnlineNumArg());
		super.setResult(new gnet.GetMaxOnlineNumRes());
	}

	public GetMaxOnlineNum(gnet.GetMaxOnlineNumArg argument) {
		super.setArgument(argument);
		super.setResult(new gnet.GetMaxOnlineNumRes());
	}

	public int getTimeout() {
		return 1000 * 20;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}
}

