package fire.pb.item.groceries;
import fire.pb.item.GroceryItem;
import fire.pb.item.ItemMgr;
import fire.pb.item.UseItemHandler;
import xbean.Item;
import fire.pb.attr.SRefreshPointType;
import fire.pb.attr.SRefreshRoleData;
import fire.pb.effect.RoleImpl;
import fire.pb.item.Commontext;
import fire.pb.item.ItemBase;
import fire.pb.item.SPropertyItem;
import fire.pb.main.ConfigManager;
import fire.pb.talk.MessageMgr;
import java.util.HashMap;
import java.util.Map;
import mkdb.Procedure;
import mkio.Protocol;
import xbean.BasicFightProperties;
import xbean.Properties;

public class PropertyItem extends GroceryItem {
  public PropertyItem(ItemMgr im, int itemid) {
    super(im, itemid);
  }
  
  public PropertyItem(ItemMgr im, Item item) {
    super(im, item);
  }
  
  @Override
  protected UseItemHandler getUseItemHandler() {
    return new UsePropertyItemHandler();
  }


	
    private static class UsePropertyItemHandler implements UseItemHandler {

        @Override
        public Commontext.UseResult onUse(long roleId, ItemBase bi, int usednum) {
            final xbean.Properties prop = xtable.Properties.get(roleId);
          if (prop == null)
            throw new IllegalArgumentException("错误的"+ roleId); 
          SPropertyItem cnf = (SPropertyItem)ConfigManager.getInstance().getConf(SPropertyItem.class).get(Integer.valueOf(bi.getItemId()));
          BasicFightProperties bfp = prop.getBfp();
          int curScheme = prop.getScheme();
          int agi = 0, cons = 0, endu = 0, iq = 0, str = 0;
          int returnCnt = 0;
          if (cnf.getAgi() < 0) {
            if (Math.abs(cnf.getAgi()) > bfp.getAgi()) {
              agi = bfp.getAgi() * -1;
            } else {
              agi = cnf.getAgi();
            } 
            returnCnt++;
          } else {
            agi = cnf.getAgi();
          } 
          if (cnf.getCons() < 0) {
            if (Math.abs(cnf.getCons()) > bfp.getCons()) {
              cons = bfp.getCons() * -1;
            } else {
              cons = cnf.getCons();
            } 
            returnCnt++;
          } else {
            cons = cnf.getCons();
          } 
          if (cnf.getEndu() < 0) {
            if (Math.abs(cnf.getEndu()) > bfp.getEndu()) {
              endu = bfp.getEndu() * -1;
            } else {
              endu = cnf.getEndu();
            } 
            returnCnt++;
          } else {
            endu = cnf.getEndu();
          } 
          if (cnf.getIq() < 0) {
            if (Math.abs(cnf.getIq()) > bfp.getIq()) {
              iq = bfp.getIq() * -1;
            } else {
              iq = cnf.getIq();
            } 
            returnCnt++;
          } else {
            iq = cnf.getIq();
          } 
          if (cnf.getStr() < 0) {
            if (Math.abs(cnf.getStr()) > bfp.getStr()) {
              str = bfp.getStr() * -1;
            } else {
              str = cnf.getStr();
            } 
            returnCnt++;
          } else {
            str = cnf.getStr();
          } 
          int curpoint = ((Integer)prop.getPoint().get(Integer.valueOf(curScheme))).intValue();
          int savepoint = bfp.getAgi() + bfp.getCons() + 
            bfp.getEndu() + bfp.getIq() + bfp.getStr();
          int decpoints = agi + cons + endu + iq + str;
          if (savepoint + decpoints < 0) {
            MessageMgr.sendMsgNotify(roleId, 150015, null);
            return Commontext.UseResult.FAIL;
          } 
          prop.getPoint().put(Integer.valueOf(curScheme), Integer.valueOf(curpoint + Math.abs(decpoints)));
          bfp.setAgi((bfp.getAgi() + agi));
          bfp.setCons((bfp.getCons() + cons));
          bfp.setEndu((bfp.getEndu() + endu));
          bfp.setIq((bfp.getIq() + iq));
          bfp.setStr((bfp.getStr() + str));
          Map<Integer, Float> changedAttrs = new HashMap<>();
          RoleImpl roleImpl = new RoleImpl(roleId);
          changedAttrs.putAll(roleImpl.updateAllFinalAttrs());
          changedAttrs.put(Integer.valueOf(1400), Float.valueOf(((Integer)prop.getPoint().get(Integer.valueOf(curScheme))).intValue()));
          SRefreshRoleData roledata = new SRefreshRoleData();
          roledata.datas.putAll(changedAttrs);
          Procedure.psendWhileCommit(roleId, (Protocol)roledata);
          SRefreshPointType refresh = new SRefreshPointType();
          refresh.bfp.agi = bfp.getAgi();
          refresh.bfp.cons = bfp.getCons();
          refresh.bfp.endu = bfp.getEndu();
          refresh.bfp.iq = bfp.getIq();
          refresh.bfp.str = bfp.getStr();
          refresh.bfp.agi_save.putAll(prop.getAddpointfp().getAgi_save());
          refresh.bfp.cons_save.putAll(prop.getAddpointfp().getCons_save());
          refresh.bfp.endu_save.putAll(prop.getAddpointfp().getEndu_save());
          refresh.bfp.iq_save.putAll(prop.getAddpointfp().getIq_save());
          refresh.bfp.str_save.putAll(prop.getAddpointfp().getStr_save());
          refresh.point.putAll(prop.getPoint());
          refresh.pointscheme = prop.getScheme();
          refresh.schemechanges = prop.getSchemechanges();
          Procedure.psendWhileCommit(roleId, (Protocol)refresh);
          return Commontext.UseResult.SUCC;
        }
    }
}
