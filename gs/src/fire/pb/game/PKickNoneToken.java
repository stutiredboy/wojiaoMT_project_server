package fire.pb.game;
import org.apache.log4j.Logger;
import fire.pb.util.FireProp;
import mkdb.Procedure;
public class PKickNoneToken extends Procedure {

    private static Logger logger = Logger.getLogger("ITEM");
	private final long roleId;
	public PKickNoneToken(long roleId) {
		super();
		this.roleId = roleId;
	}
	@Override
	protected boolean process() throws Exception {
        gnet.link.Onlines.getInstance().kick(roleId,fire.pb.KickErrConst.ERR_GM_KICKOUT);
        return true;
    }

}