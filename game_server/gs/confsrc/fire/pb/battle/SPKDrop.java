package fire.pb.battle;


public class SPKDrop implements mytools.ConvMain.Checkable ,Comparable<SPKDrop>{

	public int compareTo(SPKDrop o){
		return this.id-o.id;
	}

	
	
	static class NeedId extends RuntimeException{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
	}
	public SPKDrop(){
		super();
	}
	public SPKDrop(SPKDrop arg){
		this.id=arg.id ;
		this.dropLevel=arg.dropLevel ;
		this.dropGoldCoin=arg.dropGoldCoin ;
		this.levelLimit=arg.levelLimit ;
		this.safeMapid=arg.safeMapid ;
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
	public int dropLevel  = 0  ;
	
	public int getDropLevel(){
		return this.dropLevel;
	}
	
	public void setDropLevel(int v){
		this.dropLevel=v;
	}
	
	/**
	 * 
	 */
	public int dropGoldCoin  = 0  ;
	
	public int getDropGoldCoin(){
		return this.dropGoldCoin;
	}
	
	public void setDropGoldCoin(int v){
		this.dropGoldCoin=v;
	}
	
	/**
	 * 
	 */
	public int levelLimit  = 0  ;
	
	public int getLevelLimit(){
		return this.levelLimit;
	}
	
	public void setLevelLimit(int v){
		this.levelLimit=v;
	}
	
	/**
	 * 
	 */
	public int safeMapid  = 0  ;
	
	public int getSafeMapid(){
		return this.safeMapid;
	}
	
	public void setSafeMapid(int v){
		this.safeMapid=v;
	}
	
	
};