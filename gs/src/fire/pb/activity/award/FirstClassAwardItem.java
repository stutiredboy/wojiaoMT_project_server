
package fire.pb.activity.award;


public class FirstClassAwardItem {

	private int itemID; // 该物品的id

	private int itemNum; // 数量

	private int prop; // 属性

	private int propValue; // 属性值

	public FirstClassAwardItem(int itemID, int itemNum, int prop, int propValue) {

		super();
		this.itemID = itemID;
		this.itemNum = itemNum;
		this.prop = prop;
		this.propValue = propValue;
	}

	
	public int getItemID() {
	
		return itemID;
	}

	
	public void setItemID(int itemID) {
	
		this.itemID = itemID;
	}

	
	public int getItemNum() {
	
		return itemNum;
	}

	
	public void setItemNum(int itemNum) {
	
		this.itemNum = itemNum;
	}

	
	public int getProp() {
	
		return prop;
	}

	
	public void setProp(int prop) {
	
		this.prop = prop;
	}

	
	public int getPropValue() {
	
		return propValue;
	}

	
	public void setPropValue(int propValue) {
	
		this.propValue = propValue;
	}

}
