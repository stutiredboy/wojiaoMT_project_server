
package gnet;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS

abstract class __SetMaxOnlineNum__ extends mkio.Rpc<gnet.SetMaxOnlineNumArg, gnet.SetMaxOnlineNumRes> { }
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SetMaxOnlineNum extends __SetMaxOnlineNum__ {
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
		// client only. 闁跨喐鏋婚幏铚傚▏闁跨喐鏋婚幏锟� submit 闁跨喐鏋婚幏宄扮础闁跨喐鏋婚幏鐑芥晸閺傘倖瀚� rpc 閺冨爼鏁撻弬銈嗗闁跨喐鏋婚幏鐑芥晸閺傘倖瀚归柨鐔告灮閹风兘鏁撻弬銈嗗闁跨喐鏋婚幏鐑芥晸閹搭亞顣幏鐑芥晸閺傘倖瀚�
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public int getType() {
		return 205;
	}

	public SetMaxOnlineNum() {
		super.setArgument(new gnet.SetMaxOnlineNumArg());
		super.setResult(new gnet.SetMaxOnlineNumRes());
	}

	public SetMaxOnlineNum(gnet.SetMaxOnlineNumArg argument) {
		super.setArgument(argument);
		super.setResult(new gnet.SetMaxOnlineNumRes());
	}

	public int getTimeout() {
		return 1000 * 20;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}
}

