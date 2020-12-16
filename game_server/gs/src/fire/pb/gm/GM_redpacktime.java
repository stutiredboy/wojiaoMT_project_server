package fire.pb.gm;

import fire.pb.fushi.redpack.RedPackManage;

public class GM_redpacktime extends GMCommand {

	@Override
	boolean exec(String[] args) {

		if (args.length < 1) {
			sendToGM("参数格式错误：" + usage());
			return false;
		}

		final long time;
		time = Long.parseLong(args[0]);
		if (time<=0||time>24*60) {
			return false;
		}

		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				RedPackManage.setValidRedPackTime(time);
				return true;
			}
		}.submit();

		return true;
	}

	@Override
	String usage() {
		return "change redpack time";
	}

}
