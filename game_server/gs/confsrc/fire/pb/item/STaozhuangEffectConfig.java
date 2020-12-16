package fire.pb.item;


public class STaozhuangEffectConfig implements mytools.ConvMain.Checkable ,Comparable<STaozhuangEffectConfig>{

	public int compareTo(STaozhuangEffectConfig o){
		return this.id-o.id;
	}

	
	
	static class NeedId extends RuntimeException{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
	}
	public STaozhuangEffectConfig(){
		super();
	}
	public STaozhuangEffectConfig(STaozhuangEffectConfig arg){
		this.id=arg.id ;
		this.successRate=arg.successRate ;
		this.needCount=arg.needCount ;
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
	public int successRate  = 0  ;
	
	public int getSuccessRate(){
		return this.successRate;
	}
	
	public void setSuccessRate(int v){
		this.successRate=v;
	}
	
	/**
	 * 
	 */
	public int needCount  = 0  ;
	
	public int getNeedCount(){
		return this.needCount;
	}
	
	public void setNeedCount(int v){
		this.needCount=v;
	}
	
	
};