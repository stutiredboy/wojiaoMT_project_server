package fire.pb.mission;


public class SLandPingJi implements mytools.ConvMain.Checkable ,Comparable<SLandPingJi>{

	public int compareTo(SLandPingJi o){
		return this.id-o.id;
	}

	
	
	static class NeedId extends RuntimeException{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
	}
	public SLandPingJi(){
		super();
	}
	public SLandPingJi(SLandPingJi arg){
		this.id=arg.id ;
		this.level=arg.level ;
		this.minround=arg.minround ;
		this.maxround=arg.maxround ;
		this.exppersent=arg.exppersent ;
		this.tubiaolujing=arg.tubiaolujing ;
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
	public String level  = null  ;
	
	public String getLevel(){
		return this.level;
	}
	
	public void setLevel(String v){
		this.level=v;
	}
	
	/**
	 * 
	 */
	public int minround  = 0  ;
	
	public int getMinround(){
		return this.minround;
	}
	
	public void setMinround(int v){
		this.minround=v;
	}
	
	/**
	 * 
	 */
	public int maxround  = 0  ;
	
	public int getMaxround(){
		return this.maxround;
	}
	
	public void setMaxround(int v){
		this.maxround=v;
	}
	
	/**
	 * 
	 */
	public int exppersent  = 0  ;
	
	public int getExppersent(){
		return this.exppersent;
	}
	
	public void setExppersent(int v){
		this.exppersent=v;
	}
	
	/**
	 * 
	 */
	public String tubiaolujing  = null  ;
	
	public String getTubiaolujing(){
		return this.tubiaolujing;
	}
	
	public void setTubiaolujing(String v){
		this.tubiaolujing=v;
	}
	
	
};