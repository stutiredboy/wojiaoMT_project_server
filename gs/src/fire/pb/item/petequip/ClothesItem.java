package fire.pb.item.petequip;

import fire.pb.item.PetEquipItem;
import fire.pb.item.PetEquipItemType;
import fire.pb.item.ItemMgr;

public class ClothesItem extends PetEquipItem implements IEquipType {

	public ClothesItem(ItemMgr im, int itemid) {
		super(im, itemid);
	}
	
	public ClothesItem(ItemMgr im, xbean.Item item ) {
		super(im, item );
	}
	
	//只能在存储过程中调用
	public void setUnfixedAttribute(int genWay){
	}

	@Override
	public int getEquipType() {
		return PetEquipItemType.LORICAE;
	}
	
}
