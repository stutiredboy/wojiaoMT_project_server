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
		this.freeCurrencyType=arg.freeCurrencyType ;
		this.freeCurrencyCount=arg.freeCurrencyCount ;
		this.freeItemType=arg.freeItemType ;
		this.freeItemCount=arg.freeItemCount ;
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
	public int freeCurrencyType  = 0  ;
	
	public int getFreeCurrencyType(){
		return this.freeCurrencyType;
	}
	
	public void setFreeCurrencyType(int v){
		this.freeCurrencyType=v;
	}
	
	/**
	 * 
	 */
	public int freeCurrencyCount  = 0  ;
	
	public int getFreeCurrencyCount(){
		return this.freeCurrencyCount;
	}
	
	public void setFreeCurrencyCount(int v){
		this.freeCurrencyCount=v;
	}
	
	/**
	 * 
	 */
	public int freeItemType  = 0  ;
	
	public int getFreeItemType(){
		return this.freeItemType;
	}
	
	public void setFreeItemType(int v){
		this.freeItemType=v;
	}
	
	/**
	 * 
	 */
	public int freeItemCount  = 0  ;
	
	public int getFreeItemCount(){
		return this.freeItemCount;
	}
	
	public void setFreeItemCount(int v){
		this.freeItemCount=v;
	}
	
	
};