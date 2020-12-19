
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
		// client only. 锟斤拷使锟斤拷 submit 锟斤拷式锟斤拷锟斤拷 rpc 时锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟截碉拷锟斤拷
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

