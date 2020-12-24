package fire.pb.item.petequip;

import xbean.Item;
import fire.pb.item.PetEquipItem;
import fire.pb.item.PetEquipItemType;
import fire.pb.item.ItemMgr;

public class HammerItem extends PetEquipItem implements IEquipType {
	
	public HammerItem(ItemMgr im, int itemid) {
		super(im, itemid);
		// TODO Auto-generated constructor stub
	}

	public HammerItem(ItemMgr im, Item item) {
		super(im, item);
		// TODO Auto-generated constructor stub
	}

	public void setUnfixedAttribute(int genWay){
	}

	@Override
	public int getEquipType() {
		return PetEquipItemType.WAISTBAND;
	}

}
