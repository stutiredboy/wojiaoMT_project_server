package fire.pb.shop;


public class SExpChangeTable implements mytools.ConvMain.Checkable ,Comparable<SExpChangeTable>{

	public int compareTo(SExpChangeTable o){
		return this.id-o.id;
	}

	
	
	static class NeedId extends RuntimeException{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
	}
	public SExpChangeTable(){
		super();
	}
	public SExpChangeTable(SExpChangeTable arg){
		this.id=arg.id ;
		this.needexp=arg.needexp ;
	}
	public void checkValid(java.util.Map<String,java.util.Map<Integer,? extends Object> > objs){
	}
	/**
	 * 道具id
	 */
	public int id  = 0  ;
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int v){
		this.id=v;
	}
	
	/**
	 * 所需经验
	 */
	public int needexp  = 0  ;
	
	public int getNeedexp(){
		return this.needexp;
	}
	
	public void setNeedexp(int v){
		this.needexp=v;
	}
	
	
};