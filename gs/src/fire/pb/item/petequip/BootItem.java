package fire.pb.item.petequip;

import fire.pb.item.PetEquipItem;
import fire.pb.item.PetEquipItemType;
import fire.pb.item.ItemMgr;

public class BootItem extends PetEquipItem implements IEquipType{
	public BootItem(ItemMgr im, int itemid) {
		super(im, itemid);
	}
	
	public BootItem(ItemMgr im, xbean.Item item ) {
		super(im, item );
	}


	//只能在存储过程中调用
	public void setUnfixedAttribute(int genWay){
		
		
	}
	
	@Override
	public int getEquipType() {
		return PetEquipItemType.BOOT;
	}
}
