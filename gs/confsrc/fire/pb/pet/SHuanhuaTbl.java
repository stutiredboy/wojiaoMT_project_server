package fire.pb.pet;


public class SHuanhuaTbl implements mytools.ConvMain.Checkable ,Comparable<SHuanhuaTbl>{

	public int compareTo(SHuanhuaTbl o){
		return this.id-o.id;
	}

	
	
	static class NeedId extends RuntimeException{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
	}
	public SHuanhuaTbl(){
		super();
	}
	public SHuanhuaTbl(SHuanhuaTbl arg){
		this.id=arg.id ;
		this.freeCurrency=arg.freeCurrency ;
		this.freeItem=arg.freeItem ;
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
	public String freeCurrency  = null  ;
	
	public String getFreeCurrency(){
		return this.freeCurrency;
	}
	
	public void setFreeCurrency(String v){
		this.freeCurrency=v;
	}
	
	/**
	 * 
	 */
	public String freeItem  = null  ;
	
	public String getFreeItem(){
		return this.freeItem;
	}
	
	public void setFreeItem(String v){
		this.freeItem=v;
	}
	
	
};