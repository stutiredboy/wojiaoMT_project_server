package fire.pb.item;


public class STaozhuangEffect implements mytools.ConvMain.Checkable ,Comparable<STaozhuangEffect>{

	public int compareTo(STaozhuangEffect o){
		return this.id-o.id;
	}

	
	
	static class NeedId extends RuntimeException{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
	}
	public STaozhuangEffect(){
		super();
	}
	public STaozhuangEffect(STaozhuangEffect arg){
		this.id=arg.id ;
		this.skillId=arg.skillId ;
		this.effect1=arg.effect1 ;
		this.effect2=arg.effect2 ;
		this.effect3=arg.effect3 ;
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
	public int skillId  = 0  ;
	
	public int getSkillId(){
		return this.skillId;
	}
	
	public void setSkillId(int v){
		this.skillId=v;
	}
	
	/**
	 * 
	 */
	public int effect1  = 0  ;
	
	public int getEffect1(){
		return this.effect1;
	}
	
	public void setEffect1(int v){
		this.effect1=v;
	}
	
	/**
	 * 
	 */
	public int effect2  = 0  ;
	
	public int getEffect2(){
		return this.effect2;
	}
	
	public void setEffect2(int v){
		this.effect2=v;
	}
	
	/**
	 * 
	 */
	public int effect3  = 0  ;
	
	public int getEffect3(){
		return this.effect3;
	}
	
	public void setEffect3(int v){
		this.effect3=v;
	}
	
	
};