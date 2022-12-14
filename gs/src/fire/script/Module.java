package fire.script;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import fire.log.Logger;
import fire.pb.activity.timernpc.TimerNpcData;
import fire.pb.attr.AttrType;
import fire.pb.battle.BattleConfig;
import fire.pb.battle.ai.Require;
import fire.pb.battle.ai.TargetFilter;
import fire.pb.main.ModuleInterface;
import fire.pb.main.ModuleManager;
import fire.pb.main.ReloadResult;

public class Module implements ModuleInterface {

	static Logger logger = Logger.getLogger("BATTLE");
	public final static String MODULE_NAME = "script";
	
/*	private javax.script.ScriptEngineManager em; 
	private javax.script.ScriptEngine se;
*/
	Map<String, JavaScript> javaScripts = new HashMap<String, JavaScript>();
	static Map<String, Integer> javaScriptExpr = new HashMap<String, Integer>();
	static Map<String, Integer> funExpr = new HashMap<String, Integer>();
	static Map<Integer, List<Integer>> funExprElements = new HashMap<Integer, List<Integer>>(); 
	private static boolean isEndRegister = false;

	List<String> extParamNames = new ArrayList<String>();
	
	public void setEndRegister(boolean isEndRegister)
	{
		this.isEndRegister = isEndRegister;
	}

	public void InitextParamNames()
	{
		extParamNames.clear();
		extParamNames.add("quality");
		extParamNames.add("friendlva");
		extParamNames.add("survivala");
		extParamNames.add("survivalnopeta");
		extParamNames.add("survivalb");
		extParamNames.add("survivalnopetb");
		extParamNames.add("effectnuma");
		extParamNames.add("TeamLv");
		extParamNames.add("TeamNum");
		extParamNames.add("RoleLv");
		extParamNames.add("Time");		
		extParamNames.add("Ring");
		extParamNames.add("PetLv");
		extParamNames.add("CurExp");
		extParamNames.add("MapLv");
		extParamNames.add("MonsterNum");
		extParamNames.add("MasterNum");
		extParamNames.add("MonsterLv");
		extParamNames.add("IsNoMul");
		extParamNames.add("IsDouble");
		extParamNames.add("IsSTrible");
		extParamNames.add("IsTrible");
		extParamNames.add("IsTL");
		extParamNames.add("IsPetTrible");
		extParamNames.add("Score");		
		extParamNames.add("Saveid");
		extParamNames.add("Discount");
		extParamNames.add("Rank");
		extParamNames.add("MaxLv");
		extParamNames.add("MinLv");
		extParamNames.add("IsSerMul");
		extParamNames.add("BNum");
		extParamNames.add("xiakeLv");
		extParamNames.add("vipLv");
		extParamNames.add("DkTrible");
		extParamNames.add("TjTrible");
		extParamNames.add("MergeServer");
		extParamNames.add("StdExp");
		extParamNames.add("StdMoney");
		extParamNames.add("IsDbPoint"); //????????????????????????
		extParamNames.add("TaskLv"); //x?????????????????????.xlsx ????????????
		extParamNames.add("SwXs"); //????????????		
		extParamNames.add("battleround");	//???????????????	
		extParamNames.add("fighterround");	//??????????????????
		extParamNames.add("airound");		//ai???????????????
		extParamNames.add("maindamage");

		extParamNames.add("FuBenId");		//??????id
		extParamNames.add("FuBenLv");		//??????????????????
		extParamNames.add("AnswerCnt");		//??????????????????
		extParamNames.add("PVPCnt");		//?????????????????????
		extParamNames.add("PVPTargetCnt");	//???????????????????????????
		
		extParamNames.add("preaimcount");
	}
	
	public static Module getInstance()
	{
		//????????????????????????????????????ModuleManager?????????????????????
		return ((fire.script.Module)ModuleManager.getInstance().getModuleByName(MODULE_NAME));
	}
	
	@Override
	public void exit() {
		
	}

	public void Writer2File()
	{
		try {
				File file = new File("./src/fire/script/JsFunManager.java");
				if(file.exists()){
					file.delete();
					file.createNewFile();
					}
	
				final BufferedWriter writer = new BufferedWriter(new FileWriter(file));
				
				writer.write("package fire.script; \n\n");
				
				writer.write("import java.util.HashMap;\n");
				writer.write("import java.util.Map;\n");
				writer.write("import fire.pb.battle.Fighter;\n\n");
				
				writer.write("public class JsFunManager\n{\n");				

				writer.write("\tstatic Map<String, Integer> funMap = new HashMap<String, Integer>();\n");
				
				writer.write("\tpublic JsFunManager(){InitFunMap();}\n");			
				writer.write("\tstatic public float randfloat(int t, int t1) { return (float)(t1 > t ? Math.random()*(t1-t) + t : Math.random()*(t-t1) + t1) ; }\n");
				writer.write("\tstatic public int   randint(int t,int t1) {return (int)(t1 > t ? Math.round(Math.random()*(t1-t)) + t : Math.round(Math.random()*(t-t1)) + t1) ;}\n");
				writer.write("\tstatic public int GetFunID(String fun)	{  if(funMap.size() < 1) return -1;if(funMap.get(fun)!= null) return funMap.get(fun); else return -1; }\n");
				writer.write("\tstatic public void InitFunMap()\n\t{\n");
				
				for (Map.Entry<String, Integer> entry : funExpr.entrySet()) {
					writer.write("\t\tfunMap.put(\""+entry.getKey()+"\","+entry.getValue()+");\n");
				}
				writer.write("\t}\n");
				
				writer.write("\tpublic static Object JsFunbyID(IJavaScriptEngine engine, Fighter opf, Fighter aimf, int id)\n\t{\n");
				writer.write("\t\tswitch(id)\n\t\t{\n");
				
				for (Map.Entry<String, Integer> entry : funExpr.entrySet()) {
					// ?????????????????????
					writer.write("\t\t\tcase "+entry.getValue()+": ");
					String js =entry.getKey();
					try {
						js = converjs2fun(js, funExprElements.get(entry.getValue()));
					} catch (Exception e) {
						// TODO ??????????????? catch ???
						e.printStackTrace();
					}	
					String funcDefine = String.format(" %s\n", js);
					writer.write(funcDefine);
				}
				writer.write("\t\t}\n\t\treturn null;\n\t}\n}");
				
				writer.flush();
				writer.close();
			} catch (IOException e) {
			// TODO ??????????????? catch ???
			e.printStackTrace();
		}
	}
	
	public String converjs2fun(String js, List<Integer> elements)
	{
		String fun = js;
		String param = "with(Math)";
		fun = fun.replace(param, "");
		
		for (int i = 0; i < fire.pb.effect.Module.fightAttrTypeIds.length; i++)
		{
			if(fire.pb.effect.Module.fightAttrTypeIds[i] != AttrType.EFFECT_POINT)
			{
				String name = fire.pb.effect.Module.getInstance().getEffectNameById(fire.pb.effect.Module.fightAttrTypeIds[i]);
				if(fun.contains(name+"a"))
				{
					param = name+"a";
					fun = fun.replace(param, "opf.getEffectRole().getAttrById("+fire.pb.effect.Module.fightAttrTypeIds[i]+")");
				}
				if(fun.contains(name+"b"))
				{
					param = name+"b";
					fun = fun.replace(param, "aimf.getEffectRole().getAttrById("+fire.pb.effect.Module.fightAttrTypeIds[i]+")");
				}
			}
			else
			{
				String name = fire.pb.effect.Module.getInstance().getEffectNameById(fire.pb.effect.Module.fightAttrTypeIds[i]);
				if(fun.contains(name+"a"))
				{
					param = name+"a";
					fun = fun.replace(param, "opf.getFighterBean().getInitattrs().get("+fire.pb.effect.Module.fightAttrTypeIds[i]+")");
				}
				if(fun.contains(name+"b"))
				{
					param = name+"b";
					fun = fun.replace(param, "aimf.getFighterBean().getInitattrs().get("+fire.pb.effect.Module.fightAttrTypeIds[i]+")");
				}
			}
		}	
		for (int i = 0; i < fire.pb.effect.Module.extfightAttrTypeIds.length; i++)
		{
			String name = fire.pb.effect.Module.getInstance().getEffectNameById(fire.pb.effect.Module.extfightAttrTypeIds[i]);
			if(js.contains(name+"a"))
			{
				param = name+"a";
				fun = fun.replace(param, "opf.getEffectRole().getAttrById("+fire.pb.effect.Module.extfightAttrTypeIds[i]+")");
			}
			if(js.contains(name+"b"))
			{
				param = name+"b";
				fun = fun.replace(param, "aimf.getEffectRole().getAttrById("+fire.pb.effect.Module.extfightAttrTypeIds[i]+")");
			}
		}		
		
		param = "skilllevela";
		fun = fun.replace(param, "engine.getDouble(\"skillleveala\").intValue()");
		param = "skilllevel";
		fun = fun.replace(param, "engine.getDouble(\"skilllevel\").intValue()");
		param = "skillleveala";
		fun = fun.replace(param, "skilllevel");

		param = "gradea";		
		fun = fun.replace(param, "engine.getDouble(\"gradea\").intValue()");
		
		param = "gradeb";
		fun = fun.replace(param, "aimf.getEffectRole().getLevel()");

		for(String extParamName:extParamNames)
		{
			param = extParamName;
			String aimstr = "engine.getDouble(\""+param+"\").intValue()";
			fun = fun.replace(param, aimstr);
		}
		
		param = "random(";
		fun = fun.replace(param, "Math.random(");
		param = "floor(";
		fun = fun.replace(param, "Math.floor(");
		param = "max(";
		fun = fun.replace(param, "Math.max(");
		param = "min(";
		fun = fun.replace(param, "Math.min(");
		param = "pow(";
		fun = fun.replace(param, "Math.pow(");
		param = "abs(";
		fun = fun.replace(param, "Math.abs(");
		param = "round(";
		fun = fun.replace(param, "Math.round(");
		
		param = "pve";
		fun = fun.replace(param, "((boolean)engine.get(\"pve\")");
		
		param = "havebuffa(";
		fun = fun.replace(param, "opf.getBuffAgent().existBuff(");
		param = "havebuffb(";
		fun = fun.replace(param, "aimf.getBuffAgent().existBuff(");

		if(elements!=null&&elements.size() > 0)
		{
			for (Integer element: elements) {
				// ?????????????????????
				param = "_"+element+"_";
				if( 9999< element && element <100000)
					fun = fun.replace(param, "engine.getDouble(\"_"+element+"_\").intValue()");
				else
					fun = fun.replace(param, "(Boolean)engine.get(\"_"+element+"_\")");
			}	
		}
		return fun;
	}
	
	@Override
	public void init() throws Exception {
/*		em=new javax.script.ScriptEngineManager();
		se=em.getEngineByName("JavaScript");
*/		
		JsFunManager.InitFunMap();
		InitextParamNames();
		
		return;
	}	


	public JavaScript getJavaScript(String fileName) {
		JavaScript js = javaScripts.get(fileName);
		return js != null ? js : null;
	}

	public void registerJavaScriptExpr()
	{	
		for (Map.Entry<Integer, JavaScript> entry : fire.pb.activity.award.RewardMgr.getInstance().getMoneyAwardMap				().entrySet()){if(entry.getValue()!=null&&entry.getValue().getJavaScriptString() != null && JsFunManager.GetFunID(entry.getValue().getJavaScriptString()) < 0) fire.script.Module.registerJavaScriptExpr(entry.getValue().getJavaScriptString(), true, null);}	
		for (Map.Entry<Integer, JavaScript> entry : fire.pb.activity.award.RewardMgr.getInstance().getGoldAwardMap 	        	().entrySet()){if(entry.getValue()!=null&&entry.getValue().getJavaScriptString() != null && JsFunManager.GetFunID(entry.getValue().getJavaScriptString()) < 0) fire.script.Module.registerJavaScriptExpr(entry.getValue().getJavaScriptString(), true, null);}	
		for (Map.Entry<Integer, JavaScript> entry : fire.pb.activity.award.RewardMgr.getInstance().getContributionAwardMap 		().entrySet()){if(entry.getValue()!=null&&entry.getValue().getJavaScriptString() != null && JsFunManager.GetFunID(entry.getValue().getJavaScriptString()) < 0) fire.script.Module.registerJavaScriptExpr(entry.getValue().getJavaScriptString(), true, null);}	
		for (Map.Entry<Integer, JavaScript> entry : fire.pb.activity.award.RewardMgr.getInstance().getExpAwardMap				().entrySet()){if(entry.getValue()!=null&&entry.getValue().getJavaScriptString() != null && JsFunManager.GetFunID(entry.getValue().getJavaScriptString()) < 0) fire.script.Module.registerJavaScriptExpr(entry.getValue().getJavaScriptString(), true, null);}	
		for (Map.Entry<Integer, JavaScript> entry : fire.pb.activity.award.RewardMgr.getInstance().getFesCreditAwardMap 		().entrySet()){if(entry.getValue()!=null&&entry.getValue().getJavaScriptString() != null && JsFunManager.GetFunID(entry.getValue().getJavaScriptString()) < 0) fire.script.Module.registerJavaScriptExpr(entry.getValue().getJavaScriptString(), true, null);}	
		for (Map.Entry<Integer, JavaScript> entry : fire.pb.activity.award.RewardMgr.getInstance().getFaction_crontri 			().entrySet()){if(entry.getValue()!=null&&entry.getValue().getJavaScriptString() != null && JsFunManager.GetFunID(entry.getValue().getJavaScriptString()) < 0) fire.script.Module.registerJavaScriptExpr(entry.getValue().getJavaScriptString(), true, null);}	
		for (Map.Entry<Integer, JavaScript> entry : fire.pb.activity.award.RewardMgr.getInstance().getFactionTask_crontri 		().entrySet()){if(entry.getValue()!=null&&entry.getValue().getJavaScriptString() != null && JsFunManager.GetFunID(entry.getValue().getJavaScriptString()) < 0) fire.script.Module.registerJavaScriptExpr(entry.getValue().getJavaScriptString(), true, null);}	
		for (Map.Entry<Integer, JavaScript> entry : fire.pb.activity.award.RewardMgr.getInstance().getFactionTaskProfit_crontri	().entrySet()){if(entry.getValue()!=null&&entry.getValue().getJavaScriptString() != null && JsFunManager.GetFunID(entry.getValue().getJavaScriptString()) < 0) fire.script.Module.registerJavaScriptExpr(entry.getValue().getJavaScriptString(), true, null);}	
		for (Map.Entry<Integer, JavaScript> entry : fire.pb.activity.award.RewardMgr.getInstance().getShengWangAwardMap 		().entrySet()){if(entry.getValue()!=null&&entry.getValue().getJavaScriptString() != null && JsFunManager.GetFunID(entry.getValue().getJavaScriptString()) < 0) fire.script.Module.registerJavaScriptExpr(entry.getValue().getJavaScriptString(), true, null);}	
		for (Map.Entry<Integer, JavaScript> entry : fire.pb.activity.award.RewardMgr.getInstance().getPetExpAwardMap			().entrySet()){if(entry.getValue()!=null&&entry.getValue().getJavaScriptString() != null && JsFunManager.GetFunID(entry.getValue().getJavaScriptString()) < 0) fire.script.Module.registerJavaScriptExpr(entry.getValue().getJavaScriptString(), true, null);}	
		
		for (Map.Entry<Integer, Require> entry : fire.pb.battle.ai.BattleAIManager.getInstance().getRequires().entrySet()) 
		{	//targetFilterIds
			if (entry.getValue().requireJS != null&&entry.getValue().requireJS.getJavaScriptString()!= null
					&&JsFunManager.GetFunID(entry.getValue().requireJS.getJavaScriptString()) < 0 ) {
				fire.script.Module.registerJavaScriptExpr(entry.getValue().requireJS.getJavaScriptString(), true, entry.getValue().goalFilterIds);
				if(entry.getValue().requireJS.GetfunID() < 0)
					entry.getValue().requireJS.SetfunID(JsFunManager.GetFunID(entry.getValue().requireJS.getJavaScriptString()));
			}
			if (entry.getValue().strGoalRequire != null&&entry.getValue().strGoalRequire.getJavaScriptString()!= null
					&&JsFunManager.GetFunID(entry.getValue().strGoalRequire.getJavaScriptString()) < 0 ) {
				fire.script.Module.registerJavaScriptExpr(entry.getValue().strGoalRequire.getJavaScriptString(), true, entry.getValue().goalFilterIds);
				if(entry.getValue().strGoalRequire.GetfunID() < 0)
					entry.getValue().strGoalRequire.SetfunID(JsFunManager.GetFunID(entry.getValue().strGoalRequire.getJavaScriptString()));
			}
		}		
		
		for (Map.Entry<Integer, TargetFilter> entry : fire.pb.battle.ai.BattleAIManager.getInstance().getTargetFilters().entrySet()) 
		{	
			if (entry.getValue().buffjs != null&&entry.getValue().buffjs.getJavaScriptString()!= null
					&&JsFunManager.GetFunID(entry.getValue().buffjs.getJavaScriptString())  < 0) {
				fire.script.Module.registerJavaScriptExpr(entry.getValue().buffjs.getJavaScriptString(), true, entry.getValue().buffs);
				if(entry.getValue().buffjs.GetfunID() < 0)
					entry.getValue().buffjs.SetfunID(JsFunManager.GetFunID(entry.getValue().buffjs.getJavaScriptString()));
			}
		}
		
		for (Map.Entry<Integer, BattleConfig> entry : fire.pb.battle.Module.getInstance().getBattleConfigs().entrySet()) 
		{
			if (entry.getValue().monsterNumScript != null&&entry.getValue().monsterNumScript.getJavaScriptString()!= null
					&&JsFunManager.GetFunID(entry.getValue().monsterNumScript.getJavaScriptString())  < 0) {
				fire.script.Module.registerJavaScriptExpr(entry.getValue().monsterNumScript.getJavaScriptString(), true, null);
				if(entry.getValue().monsterNumScript.GetfunID() < 0)
					entry.getValue().monsterNumScript.SetfunID(JsFunManager.GetFunID(entry.getValue().monsterNumScript.getJavaScriptString()));
			}
			if (entry.getValue().leveljs != null&&entry.getValue().leveljs.getJavaScriptString()!= null
					&&JsFunManager.GetFunID(entry.getValue().leveljs.getJavaScriptString())  < 0) {
				fire.script.Module.registerJavaScriptExpr(entry.getValue().leveljs.getJavaScriptString(), true, null);
				if(entry.getValue().leveljs.GetfunID() < 0)
					entry.getValue().leveljs.SetfunID(JsFunManager.GetFunID(entry.getValue().leveljs.getJavaScriptString()));
			}
		}	/**/	
		
		for (Map.Entry<Integer, TimerNpcData> entry : fire.pb.activity.timernpc.TimerNpcService.getInstance().getTimerData().entrySet()) {
			if (entry.getValue() != null
					&& entry.getValue().npcCountScript.getJavaScriptString() != null
					&& JsFunManager.GetFunID(entry.getValue().npcCountScript.getJavaScriptString()) < 0)
				fire.script.Module.registerJavaScriptExpr(entry.getValue().npcCountScript.getJavaScriptString(), true, null);
		}
	}
	
	/**
	 * ??????JavaScript?????????
	 * @param expr ?????????
	 * @return ??????/??????
	 */
	public static boolean registerJavaScriptExpr(String expr, boolean bfun, List<Integer> elements) {
		if (isEndRegister == false && javaScriptExpr.containsKey(expr) == false) {
			logger.error("6:JS????????????JavaScript??????????????????:"+ expr);
			javaScriptExpr.put(expr, javaScriptExpr.size());
			if(bfun == true)
			{
				funExpr.put(expr, funExpr.size());
				if(elements != null && elements.size() > 0)
				{
					funExprElements.put(funExpr.size()-1, elements);
				}
			}
			return true;
		}
		if(isEndRegister == true)
			return false;
		return false;
	}

	/**
	 * ??????JavaScript????????????ID
	 * @param expr ?????????
	 * @return ?????????ID
	 */
	public int getJavaScriptExprID(String expr) {
		if (javaScriptExpr.containsKey(expr)) {
			return javaScriptExpr.get(expr);
		}
		return -1;
	}

	/**
	 * ????????????JavaScript?????????
	 * @param expr
	 * @return true/false
	 */
	public boolean isRegisterJavaScriptExpr(String expr) {
		return getJavaScriptExprID(expr) != -1;
	}
	
	/**
	 * ??????JavaScript?????????????????????
	 * @param expr ?????????
	 * @return ?????????
	 */
	public String getJavaScriptExprFunName(String expr) {
		if (javaScriptExpr.containsKey(expr)) {
			int id = javaScriptExpr.get(expr);
			String funcName = "unnamed_" + id;
			return funcName;
		}
		return "";
	}

	/**
	 * ????????????????????????????????????
	 * @param engine ?????? 
	 */
	public void registerAllExprToEngine(ScriptEngine engine) {
		for (Map.Entry<String, Integer> entry : javaScriptExpr.entrySet()) {
			// ?????????????????????
			String funcName = "unnamed_" + entry.getValue();
			String funcDefine = String.format("function %s(){ %s; }", funcName, entry.getKey());
			try {
				boolean isCompile = false;
				if (isCompile) {
					if (engine instanceof Compilable) {
						Compilable c = (Compilable)engine;
						CompiledScript cs = c.compile(funcDefine);
						logger.error("2:JS??????????????????js?????????????????????:"+ funcDefine);
						cs.eval();
					}
				} else {
					logger.error("3:JS??????????????????js?????????????????????:"+ funcDefine);
					engine.eval(funcDefine);
				}
			} catch (ScriptException e) {
				// TODO ??????????????? catch ???
				e.printStackTrace();
			}
		}
		isEndRegister = true;
	}

	/**
	 * ???????????????????????????????????????
	 * @param engine ??????
	 * @param expr ?????????
	 * @return Object
	 */
	public Object invokeFunction(AbstractJSEngine engine, String expr, Object... args) {

		logger.error("4:JS????????????invokeFunction?????????:"+ expr);
		String funcName = getJavaScriptExprFunName(expr);
		if (!funcName.isEmpty()) {
			Invocable inv = (Invocable)engine.getEngine();
			try {
				return inv.invokeFunction(funcName, args);
			} catch (NoSuchMethodException e) {
				// TODO ??????????????? catch ???
				e.printStackTrace();
			} catch (ScriptException e) {
				// TODO ??????????????? catch ???
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public ReloadResult reload() throws Exception
	{
		return new ReloadResult(false,"module" + this.getClass().getName() + "not support reload");
	}
	 
}
