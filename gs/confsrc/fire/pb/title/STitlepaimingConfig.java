package fire.pb.title;


public class STitlepaimingConfig implements mytools.ConvMain.Checkable ,Comparable<STitlepaimingConfig>{

	public int compareTo(STitlepaimingConfig o){
		return this.id-o.id;
	}

	
	
	static class NeedId extends RuntimeException{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
	}
	public STitlepaimingConfig(){
		super();
	}
	public STitlepaimingConfig(STitlepaimingConfig arg){
		this.id=arg.id ;
		this.zhanlichenghao=arg.zhanlichenghao ;
		this.jianxianchenghao=arg.jianxianchenghao ;
		this.availtime=arg.availtime ;
	}
	public void checkValid(java.util.Map<String,java.util.Map<Integer,? extends Object> > objs){
	}
	/**
	 * 排名
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
	public int zhanlichenghao  = 0  ;
	
	public int getZhanlichenghao(){
		return this.zhanlichenghao;
	}
	
	public void setZhanlichenghao(int v){
		this.zhanlichenghao=v;
	}
	
	/**
	 * 
	 */
	public int jianxianchenghao  = 0  ;
	
	public int getJianxianchenghao(){
		return this.jianxianchenghao;
	}
	
	public void setJianxianchenghao(int v){
		this.jianxianchenghao=v;
	}
	
	/**
	 * -1为没有固定的有效时间
	 */
	public int availtime  = 0  ;
	
	public int getAvailtime(){
		return this.availtime;
	}
	
	public void setAvailtime(int v){
		this.availtime=v;
	}
	
	
};