package fire.pb.item;


public class SDianhuaConfig implements mytools.ConvMain.Checkable ,Comparable<SDianhuaConfig>{

	public int compareTo(SDianhuaConfig o){
		return this.id-o.id;
	}

	
	
	static class NeedId extends RuntimeException{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
	}
	public SDianhuaConfig(){
		super();
	}
	public SDianhuaConfig(SDianhuaConfig arg){
		this.id=arg.id ;
		this.attrId=arg.attrId ;
		this.attrName=arg.attrName ;
		this.initValue=arg.initValue ;
		this.addValue=arg.addValue ;
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
	public int initValue  = 0  ;
	
	public int getInitValue(){
		return this.initValue;
	}
	
	public void setInitValue(int v){
		this.initValue=v;
	}
	
	/**
	 * 
	 */
	public int addValue  = 0  ;
	
	public int getAddValue(){
		return this.addValue;
	}
	
	public void setAddValue(int v){
		this.addValue=v;
	}
	
	
};