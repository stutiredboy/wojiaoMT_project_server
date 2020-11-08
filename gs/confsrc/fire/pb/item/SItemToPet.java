package fire.pb.item;


public class SItemToPet implements mytools.ConvMain.Checkable ,Comparable<SItemToPet>{

	public int compareTo(SItemToPet o){
		return this.id-o.id;
	}

	
	
	static class NeedId extends RuntimeException{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
	}
	public SItemToPet(){
		super();
	}
	public SItemToPet(SItemToPet arg){
		this.id=arg.id ;
		this.petId=arg.petId ;
		this.bagType=arg.bagType ;
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
	public int petId  = 0  ;
	
	public int getPetId(){
		return this.petId;
	}
	
	public void setPetId(int v){
		this.petId=v;
	}
	
	/**
	 * 0表示进背包;1表示不进背包
	 */
	public int bagType  = 0  ;
	
	public int getBagType(){
		return this.bagType;
	}
	
	public void setBagType(int v){
		this.bagType=v;
	}
	
	
};