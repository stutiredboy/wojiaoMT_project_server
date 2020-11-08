package fire.pb.item;


public class SXilianEffect implements mytools.ConvMain.Checkable ,Comparable<SXilianEffect>{

	public int compareTo(SXilianEffect o){
		return this.id-o.id;
	}

	
	
	static class NeedId extends RuntimeException{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
	}
	public SXilianEffect(){
		super();
	}
	public SXilianEffect(SXilianEffect arg){
		this.id=arg.id ;
		this.attrId=arg.attrId ;
		this.attrName=arg.attrName ;
		this.attrInitvalue=arg.attrInitvalue ;
		this.attrAddvalue=arg.attrAddvalue ;
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
	public int attrId  = 0  ;
	
	public int getAttrId(){
		return this.attrId;
	}
	
	public void setAttrId(int v){
		this.attrId=v;
	}
	
	/**
	 * 
	 */
	public String attrName  = null  ;
	
	public String getAttrName(){
		return this.attrName;
	}
	
	public void setAttrName(String v){
		this.attrName=v;
	}
	
	/**
	 * 
	 */
	public int attrInitvalue  = 0  ;
	
	public int getAttrInitvalue(){
		return this.attrInitvalue;
	}
	
	public void setAttrInitvalue(int v){
		this.attrInitvalue=v;
	}
	
	/**
	 * 
	 */
	public int attrAddvalue  = 0  ;
	
	public int getAttrAddvalue(){
		return this.attrAddvalue;
	}
	
	public void setAttrAddvalue(int v){
		this.attrAddvalue=v;
	}
	
	
};