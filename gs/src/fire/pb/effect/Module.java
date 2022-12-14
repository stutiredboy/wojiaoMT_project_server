package fire.pb.effect;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import fire.pb.attr.AttrType;
import fire.pb.attr.FightAttrType;
import fire.pb.main.ModuleInterface;
import fire.pb.main.ModuleManager;
import fire.pb.main.ReloadResult;

import org.apache.log4j.Logger;


public class Module implements ModuleInterface
{
	public static AtomicBoolean initOnce = new AtomicBoolean(false);
	static public final Logger logger = Logger.getLogger("BATTLE");
	//public int LEVEL_UP_LIMIT = FireProp.getIntValue(ConfigManager.getInstance().getPropConf("sys"), "sys.levelup.limit");

	java.util.Map<Integer, Class<? extends IEffect>> id2class;
	private java.util.Map<String, Integer> effectName2Ids;
	private java.util.Map<Integer, String> effectId2Names;
	private java.util.Map<String, Integer> attrName2Ids;
	private java.util.Map<Integer, Float> attrId2InitValue;
	
	private java.util.List<Integer> needSendAttrIds; //需要发送的属性id by changhao

//	private static Module instance;

	public static Module getInstance()
	{
		return ((fire.pb.effect.Module)ModuleManager.getInstance().getModuleByName("effect"));
	}

	@Override
	public void exit()
	{

	}

	public final static int[] clientAttrTypeIds;
	static
	{

		Field[] fields = AttrType.class.getFields();
		clientAttrTypeIds = new int[fields.length];
		for (int i = 0; i < fields.length; i++)
		{
			try
			{
				clientAttrTypeIds[i] = fields[i].getInt(null);
			} catch (IllegalArgumentException e)
			{
				e.printStackTrace();
			} catch (IllegalAccessException e)
			{
				e.printStackTrace();
			}
		}
	}

	public final static int[] fightAttrTypeIds;// 战斗中用到的一级二级隐含属性
	public final static int[] extfightAttrTypeIds;// 战斗中用到的一级二级隐含属性
	static
	{

		Field[] fields = FightAttrType.class.getFields();
		fightAttrTypeIds = new int[fields.length];
		for (int i = 0; i < fields.length; i++)
		{
			try
			{
				fightAttrTypeIds[i] = fields[i].getInt(null);
			} catch (IllegalArgumentException e)
			{
				e.printStackTrace();
			} catch (IllegalAccessException e)
			{
				e.printStackTrace();
			}
		}
		extfightAttrTypeIds = new int[3];
		extfightAttrTypeIds[0] = 80;
		extfightAttrTypeIds[1] = 100;
		extfightAttrTypeIds[2] = 120;
	}
	
	public static boolean isFightAttr(int attrid)
	{
		if(attrid <= 0)
			return false;
		for(int i = 0 ; i <fightAttrTypeIds.length; i++)
		{
			if(fightAttrTypeIds[i] == attrid)
				return true;
		}
		return false;
	}
	
	public java.util.Map<String, Integer> getEffectName2Ids()
	{
		return this.effectName2Ids;
	}

	public java.util.List<Integer> getNeedSendAttrIds()
	{
		return this.needSendAttrIds;
	}
	
	@Override
	public void init() throws Exception
	{
		logger.info("effect模块初始化开始。");
		if(!initOnce.get())
		{//第一次初始化时
			xtable.Properties.getTable().addListener(new fire.pb.team.PropertiesListener(), "value", "hp"); 
			xtable.Properties.getTable().addListener(new fire.pb.team.PropertiesListener(), "value", "mp"); 
		}
		//LEVEL_UP_LIMIT = FireProp.getIntValue(ConfigManager.getInstance().getPropConf("sys"), "sys.levelup.limit");
		Map<Integer, SAttrEffectID2Name> sAttrEffects = fire.pb.main.ConfigManager
				.getInstance().getConf(fire.pb.effect.SAttrEffectID2Name.class);
		effectId2Names = new java.util.HashMap<Integer, String>();
		effectName2Ids = new java.util.HashMap<String, Integer>();
		attrId2InitValue = new java.util.HashMap<Integer, Float>();
		attrName2Ids = new HashMap<String, Integer>();
		needSendAttrIds = new java.util.ArrayList<Integer>();
		synchronized (effectId2Names)
		{
			synchronized (effectName2Ids)
			{
				synchronized (attrId2InitValue)
				{
					synchronized (attrName2Ids)
					{
						effectId2Names.clear();
						effectName2Ids.clear();
						attrId2InitValue.clear();
						attrName2Ids.clear();
						for (SAttrEffectID2Name attreffect : sAttrEffects.values())
						{
							effectId2Names.put(attreffect.getId(), attreffect.getAttrname());
							effectId2Names.put(attreffect.getAblEffctId(), attreffect.getAblEffctName());
							effectId2Names.put(attreffect.getPctEffctId(), attreffect.getPctEffctName());
							effectName2Ids.put(attreffect.getAttrname(), attreffect.getId());
							effectName2Ids.put(attreffect.getAblEffctName(), attreffect.getAblEffctId());
							effectName2Ids.put(attreffect.getPctEffctName(), attreffect.getPctEffctId());
							attrId2InitValue.put(attreffect.getId(), (float) attreffect.getInitValue());
							attrName2Ids.put(attreffect.getAttrname(), attreffect.getId());
							
							if (attreffect.needSendAttr == 1)
							{
								needSendAttrIds.add(attreffect.getId());
							}
						}
						attrName2Ids.put("curhp_percent", 61);
						attrName2Ids.put("curmp_percent", 91);
						effectName2Ids.put("curhpb", 61);
						effectName2Ids.put("curmpb", 91);
						effectName2Ids.put("curhp", 61);
						effectName2Ids.put("curmp", 91);
						effectName2Ids.put("mineffect", 2990);
					}
				}
			}
		}
		initOnce.set(true);
		logger.debug("=====printFinalAttrs begin=====\n");
		for(Map.Entry<String, Integer> entry: effectName2Ids.entrySet())
		{
			logger.debug("effectid:" + entry.getValue()+ "\t" + "effectName:" + entry.getKey()+ "\n");
		}		
		logger.debug("=====printFinalAttrs end=====\n");
		logger.info("effect模块初始化完成。");

	}
	@Override
	public ReloadResult reload() throws Exception
	{
		try
		{
			init();
			return new ReloadResult(true);
		}
		catch(Exception e)
		{
			logger.error(e);
			return new ReloadResult(false,"effect module reload failed, ");
		}
	}
	
	public Integer getIdByName(String effectname)
	{
		String name = effectname.trim();
		return effectName2Ids.get(name);
	}
	
	
	public String getEffectNameById(int effectId)
	{
		return effectId2Names.get(effectId);
	}

	public static Map<Integer, Float> parseEffects(String effectstrs) throws Exception
	{
		Map<Integer, Float> effectMap = new HashMap<Integer, Float>();
		if (effectstrs != null && !effectstrs.equals(""))
		{
			String[] effectStr = effectstrs.split(";");
			for (int i = 0; i < effectStr.length; i++)
			{
				String[] tmpstrs = effectStr[i].split("=");
				if (tmpstrs.length >= 2)
				{
					int effectId = fire.pb.effect.Module.getInstance().getIdByName(tmpstrs[0].trim());// 第一个“=”之前的字符串是Effectname
					Float effectValue = Float.valueOf((effectStr[i].substring(tmpstrs[0].length() + 1)).trim());// 取第一个“=”之后的字符串，是效果值
					effectMap.put(effectId, effectValue);
				}
			}
		}
		return effectMap;
	}

	public float getInitValueByAttrId(int attrId)
	{
		Float inivalue = attrId2InitValue.get(attrId);
		if (inivalue == null)
			return 0f;
		else
			return inivalue;
	}
	
	public int getAttrIdByName(String name)
	{
		Integer id = attrName2Ids.get(name);
		if(id == null)
			return 0;
		return id;
	}

	
	public float getAblLimit(int attrId){
		Map<Integer, SAttrEffectID2Name> sAttrEffects = fire.pb.main.ConfigManager
				.getInstance().getConf(fire.pb.effect.SAttrEffectID2Name.class);
		if(sAttrEffects !=null){
			SAttrEffectID2Name effectAttrCfg = sAttrEffects.get(attrId);
			if(effectAttrCfg!=null){
				return (float)(effectAttrCfg.ablLimit);
			}
		}
		return 0;
	}
	
	public float getPctLimit(int attrId){
		Map<Integer, SAttrEffectID2Name> sAttrEffects = fire.pb.main.ConfigManager
				.getInstance().getConf(fire.pb.effect.SAttrEffectID2Name.class);
		if(sAttrEffects !=null){
			SAttrEffectID2Name effectAttrCfg = sAttrEffects.get(attrId);
			if(effectAttrCfg!=null){
				return (float)(effectAttrCfg.pctLimit);
			}
		}
		return 0;
	}
	
	public static Map<Integer, Float> getClientAttrs(Map<Integer, Float> attrs)
	{
		Map<Integer,Float> clientAttrs = new HashMap<Integer, Float>();
		
		for(int attrId : fire.pb.effect.Module.clientAttrTypeIds)
		{
			Float value = attrs.get(attrId);
			if(value != null)
				clientAttrs.put(attrId, value);
		}
		
		return clientAttrs;
	}
}
