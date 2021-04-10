package fire.pb.item;


public class SEquipUpgradeConfig implements mytools.ConvMain.Checkable ,Comparable<SEquipUpgradeConfig>{

	public int compareTo(SEquipUpgradeConfig o){
		return this.id-o.id;
	}

	
	
	static class NeedId extends RuntimeException{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
	}
	public SEquipUpgradeConfig(){
		super();
	}
	public SEquipUpgradeConfig(SEquipUpgradeConfig arg){
		this.id=arg.id ;
		this.oldEquipID=arg.oldEquipID ;
		this.newEquipID=arg.newEquipID ;
		this.needCold=arg.needCold ;
	}
	public void checkValid(java.util.Map<String,java.util.Map<Integer,? extends Object> > objs){
	}
	/**
	 * 
	 */
	public int id  = 0  ;
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int v){
		this.id=v;
	}
	
	/**
	 * 
	 */
	public int oldEquipID  = 0  ;
	
	public int getOldEquipID(){
		return this.oldEquipID;
	}
	
	public void setOldEquipID(int v){
		this.oldEquipID=v;
	}
	
	/**
	 * 
	 */
	public int newEquipID  = 0  ;
	
	public int getNewEquipID(){
		return this.newEquipID;
	}
	
	public void setNewEquipID(int v){
		this.newEquipID=v;
	}
	
	/**
	 * 
	 */
	public int needCold  = 0  ;
	
	public int getNeedCold(){
		return this.needCold;
	}
	
	public void setNeedCold(int v){
		this.needCold=v;
	}
	
	
};