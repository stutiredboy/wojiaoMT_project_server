package fire.pb.item;


public class STransformationEffectConfig implements mytools.ConvMain.Checkable ,Comparable<STransformationEffectConfig>{

	public int compareTo(STransformationEffectConfig o){
		return this.id-o.id;
	}

	
	
	static class NeedId extends RuntimeException{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
	}
	public STransformationEffectConfig(){
		super();
	}
	public STransformationEffectConfig(STransformationEffectConfig arg){
		this.id=arg.id ;
		this.shapeid=arg.shapeid ;
		this.color=arg.color ;
		this.speed_value=arg.speed_value ;
		this.uplimithp_value=arg.uplimithp_value ;
		this.curmp_value=arg.curmp_value ;
		this.magicdef_value=arg.magicdef_value ;
		this.magicattack_value=arg.magicattack_value ;
		this.phyattack_value=arg.phyattack_value ;
		this.defend_value=arg.defend_value ;
		this.magicdouble_value=arg.magicdouble_value ;
		this.medical_value=arg.medical_value ;
		this.phycruellv_value=arg.phycruellv_value ;
		this.magiccruellv_value=arg.magiccruellv_value ;
		this.buffid=arg.buffid ;
	}
	public void checkValid(java.util.Map<String,java.util.Map<Integer,? extends Object> > objs){
	}
	/**
	 * id
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
	public int shapeid  = 0  ;
	
	public int getShapeid(){
		return this.shapeid;
	}
	
	public void setShapeid(int v){
		this.shapeid=v;
	}
	
	/**
	 * 
	 */
	public String color  = null  ;
	
	public String getColor(){
		return this.color;
	}
	
	public void setColor(String v){
		this.color=v;
	}
	
	/**
	 * 
	 */
	public int speed_value  = 0  ;
	
	public int getSpeed_value(){
		return this.speed_value;
	}
	
	public void setSpeed_value(int v){
		this.speed_value=v;
	}
	
	/**
	 * 
	 */
	public int uplimithp_value  = 0  ;
	
	public int getUplimithp_value(){
		return this.uplimithp_value;
	}
	
	public void setUplimithp_value(int v){
		this.uplimithp_value=v;
	}
	
	/**
	 * 
	 */
	public int curmp_value  = 0  ;
	
	public int getCurmp_value(){
		return this.curmp_value;
	}
	
	public void setCurmp_value(int v){
		this.curmp_value=v;
	}
	
	/**
	 * 
	 */
	public int magicdef_value  = 0  ;
	
	public int getMagicdef_value(){
		return this.magicdef_value;
	}
	
	public void setMagicdef_value(int v){
		this.magicdef_value=v;
	}
	
	/**
	 * 
	 */
	public int magicattack_value  = 0  ;
	
	public int getMagicattack_value(){
		return this.magicattack_value;
	}
	
	public void setMagicattack_value(int v){
		this.magicattack_value=v;
	}
	
	/**
	 * 
	 */
	public int phyattack_value  = 0  ;
	
	public int getPhyattack_value(){
		return this.phyattack_value;
	}
	
	public void setPhyattack_value(int v){
		this.phyattack_value=v;
	}
	
	/**
	 * 
	 */
	public int defend_value  = 0  ;
	
	public int getDefend_value(){
		return this.defend_value;
	}
	
	public void setDefend_value(int v){
		this.defend_value=v;
	}
	
	/**
	 * 
	 */
	public int magicdouble_value  = 0  ;
	
	public int getMagicdouble_value(){
		return this.magicdouble_value;
	}
	
	public void setMagicdouble_value(int v){
		this.magicdouble_value=v;
	}
	
	/**
	 * 
	 */
	public int medical_value  = 0  ;
	
	public int getMedical_value(){
		return this.medical_value;
	}
	
	public void setMedical_value(int v){
		this.medical_value=v;
	}
	
	/**
	 * 
	 */
	public int phycruellv_value  = 0  ;
	
	public int getPhycruellv_value(){
		return this.phycruellv_value;
	}
	
	public void setPhycruellv_value(int v){
		this.phycruellv_value=v;
	}
	
	/**
	 * 
	 */
	public int magiccruellv_value  = 0  ;
	
	public int getMagiccruellv_value(){
		return this.magiccruellv_value;
	}
	
	public void setMagiccruellv_value(int v){
		this.magiccruellv_value=v;
	}
	
	/**
	 * 
	 */
	public int buffid  = 0  ;
	
	public int getBuffid(){
		return this.buffid;
	}
	
	public void setBuffid(int v){
		this.buffid=v;
	}
	
	
};