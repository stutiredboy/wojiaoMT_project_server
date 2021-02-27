package fire.pb.item;


public class SClearTypeConfig implements mytools.ConvMain.Checkable ,Comparable<SClearTypeConfig>{

	public int compareTo(SClearTypeConfig o){
		return this.id-o.id;
	}

	
	
	static class NeedId extends RuntimeException{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
	}
	public SClearTypeConfig(){
		super();
	}
	public SClearTypeConfig(SClearTypeConfig arg){
		this.id=arg.id ;
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
	
	
};