<xdb xgenOutput="src" trace="debug" traceTo=":file:out" corePoolSize="5" procPoolSize="20" schedPoolSize="5" dbhome="xdb" logpages="4096" backupDir="xbackup" checkpointPeriod="60000" backupIncPeriod="600000" backupFullPeriod="3600000" angelPeriod="5000" xdbVerify="true" allowBackup="false">
	<ProcedureConf executionTime="3000" maxExecutionTime="0" retryTimes="3" retryDelay="100"/>
sinclude(`conf.m4')
	<xbean name="Item">
		<variable name="id" type="int"/> 物品编号 
		<variable name="flags" type="int"/> 标志，叠加的时候，flags 也 OR 叠加
		<variable name="position" type="int" default="-1"/> 背包属性，位置。从0开始编号
		<variable name="number" type="int"/>数量
		<variable name="numbermap" type="map" key="int" value="int" capacity="8"/>数量		
		<variable name="timeout" type="long" default="0"/> 到期时间。如果为0，代表没有时间限制
		<variable name="extid" type="long"/> 扩展动态属性
		<variable name="uniqueid" type="long"/> 物品的唯一id
		<variable name="loseeffecttime" type="long"/> 物品失效时间
		<variable name="markettime" type="long"/> 摆摊道具冻结时间
	</xbean>
	
	<xbean name="Bag">
		<variable name="currency" type="map" key="int" value="long"/> 货币, key 为枚举值, value为货币值
		<variable name="capacity" type="int"/>
		<variable name="nextid" type="int"/>
		<variable name="items" type="map" key="int" value="Item"/>
		<variable name="locked" type="int" default="0"/> 0 没有锁。1 有锁
	</xbean>
	<!--存储临时背包物品时间获取的-->
	<xbean name="TempTime">
		<variable name="items" type="map" key="int" value="long"/>
	</xbean>
	<table name="temptime" key="long" value="TempTime" persistence="MEMORY" cacheCapacity="10240"/>
	<table name="bag" key="long" value="Bag" foreign="key:properties" cacheCapacity="7024" cachehigh="512" cachelow="256" lock="rolelock"/>
	<table name="depot" key="long" value="Bag" foreign="key:properties" cacheCapacity="7024" cachehigh="512" cachelow="256" lock="rolelock"/>
	<table name="depotactive" key="long" value="boolean" default="false" foreign="key:properties" cacheCapacity="7024" cachehigh="512" cachelow="256" lock="rolelock"/>
	<table name="equip" key="long" value="Bag" foreign="key:properties" cacheCapacity="7024" cachehigh="512" cachelow="256" lock="rolelock"/>
	<table name="temp" key="long" value="Bag" cacheCapacity="10240" cachehigh="512" cachelow="256" lock="rolelock"/>
	<table name="questbag" key="long" value="Bag" foreign="key:properties" cacheCapacity="7024" cachehigh="512" cachelow="256" lock="rolelock"/>
	
	<xbean name="BagTimeLock"> 背包时间锁
		<variable name="itemkey" type="int"/>
		<variable name="num" type="int"/>
		<variable name="timeout" type="long"/>超时时间
	</xbean>
	<table name="bagtimelock" key="long" value="BagTimeLock" cacheCapacity="10240" cachehigh="512" cachelow="256" lock="rolelock" persistence="MEMORY"/>
	
	<xbean name="DiscardItem">
		<variable name="item" type="Item"/> 物品固有属性
		<variable name="deletedate" type="long"/> 删除日期
	</xbean>
	<table name="itemrecyclebin" key="long" value="DiscardItem" cacheCapacity="8196" cachehigh="512" cachelow="256"/> 物品回收站
	
	<xbean name="DiscardPet">
		<variable name="pet" type="PetInfo"/> 宠物属性
		<variable name="roleid" type="long"/> 宠物删除时的主人
		<variable name="deletedate" type="long"/> 删除日期
		<variable name="reason" type="int"/> 删除原因
	</xbean>
	<table name="petrecyclebin" key="long" value="DiscardPet" cacheCapacity="1024" cachehigh="512" cachelow="256"/> 宠物回收站
	<xbean name="UniquePet">
		<variable name="roleId" type="long"/> 所属角色
	</xbean>
	<table name="uniquepets" key="long" value="UniquePet" cacheCapacity="10240" cachehigh="512" cachelow="256"/> 宠物的唯一信息
	
	<xbean name="User">
		<variable name="prevLoginRoleid" type="long"/>  	 上一次登录的角色
		<variable name="idlist" type="vector" value="long"/> 用户的角色列表 value是roleid
		<variable name="createtime" type="long" /> 帐号第一次进入游戏的时间
		<variable name="isfirst" type="int" default="0"/> 是否第一次登陆0第一次   1不是第一次
	</xbean>
	<table name="user" key="int" value="User" cacheCapacity="1024" cachehigh="512" cachelow="256" lock="userlock"/>
	
	<xbean name="UserDeviceInfo">
		<variable name="TelcoOper" type="string"/> 用户网络运营商
		<variable name="ChId" type="string"/> 渠道ID
		<variable name="PlatType" type="string"/> 平台ID(IOS,android,wp)
		<variable name="DeviId" type="string"/> 玩家设备(mac/idfv)设备唯一标识
		<variable name="IMEI" type="string"/> 入网标识符
		<variable name="Ip" type="string"/> 玩家设备IP
		<variable name="NetEnvir" type="string"/> 网络环境(如：3G,4G,wifi)
		<variable name="OsVer" type="string"/> 玩家系统版本(具体版本如ios9,android4.1)
		<variable name="BrType" type="string"/> 玩家手机类型(如联想，酷派)
		<variable name="FirstDeviId" type="string"/> 玩家设备(mac/idfv) 注册设备唯一标识
	</xbean>
	<table name="userdeviceinfotab" key="int" value="UserDeviceInfo" cacheCapacity="10240" cachehigh="512" cachelow="256"/>
	
	<xbean name="AUUserInfo">		
		<variable name="retcode" type="int"/>
		<variable name="func" type="int"/>
		<variable name="funcparm" type="int"/>
		<variable name="loginip" type="int"/>
		<variable name="blisgm" type="int"/>
		<variable name="auth" type="vector" value="int" />
		<variable name="algorithm" type="int"/>
		<variable name="nickname" type="string"/>
		<variable name="username" type="string"/>
		
		<variable name="mac" type="string"/>
		<variable name="os" type="string"/>
		<variable name="platform" type="string"/>
		<variable name="clientsource" type="string"/>
		<variable name="idfa" type="string"/>
	</xbean>		
	<table name="auuserinfo" key="int" value="AUUserInfo" cacheCapacity="40240" cachehigh="512" cachelow="256"  persistence="MEMORY"/>
	
	 <!-- 称谓保存的信息 -->
	<xbean name="TitleInfo">
		<variable name="titleid" type="int" /> 称谓id
		<variable name="titlename" type="string" /> 称谓名
		<variable name="availtime" type="long" />剩余有效时间
	</xbean>

  <!-- 基础战斗属性 -->
  <xbean name="BasicFightProperties">
    <variable name="str" type="int"/>		力量
    <variable name="iq" type="int"/>		智力
    <variable name="cons" type="int"/>		体质
    <variable name="endu" type="int"/>		耐力
    <variable name="agi" type="int"/>		敏捷
  </xbean>
	
	<!-- 角色加点战斗属性 -->
	<xbean name="RoleAddPointProperties">
    <variable name="cons_save" type="map" key="int" value="int"/> 已分配体质
    <variable name="iq_save" type="map" key="int" value="int"/> 已分配智力
    <variable name="str_save" type="map" key="int" value="int"/> 已分配力量
    <variable name="endu_save" type="map" key="int" value="int"/> 已分配耐力
    <variable name="agi_save" type="map" key="int" value="int"/> 已分配敏捷
  </xbean>
	
	<xbean name="FormBean">
		<variable name="activeTimes" type="int"/>	 
		<variable name="level" type="int"/>等级
		<variable name="exp" type="int"/> 经验 by changhao
	</xbean>
	
	<xbean name="RoleColorType"> 保存的染色方案
		<variable name="colorpos1" type="int"/> 染色部位1
		<variable name="colorpos2" type="int"/>	染色部位2 
	</xbean>
	
	<xbean name="Properties">
		<variable name="rolename" type="string"/> 角色名
		<variable name="usedname" type="list" value="string"/>  曾用名
		<variable name="level" type="int"/>	 等级
		<variable name="shape" type="int"/>  	主角ID(是指游戏中设定的10个角色id)
		<variable name="sex" type="int"/>      人物性别
		<variable name="exp" type="long"/>	 	当前经验
		<variable name="race" type="int"/>		 种族
		<variable name="school" type="int"/>	  职业
		<variable name="color" type="int"/>      配色方案
		<variable name="title" type="int" default="-1" />	 称谓
		<variable name="hp" type="int"/>		气血
		<variable name="uplimithp" type="int"/>    当前气血上限
		<variable name="wound" type="int"/> 伤，当前血上限=最大血上限-伤，伤：[0,MaxHp-1]
		<variable name="mp" type="int"/>		法力
		<variable name="sp" type="int" default = "0" />    怒气
		<variable name="bfp" type="BasicFightProperties"/> 存储基础的点数    
		<variable name="addpointfp" type="RoleAddPointProperties"/> 人物加点方案		
		<variable name="point" type="map" key="int" value="int"/>		潜能。未分配点数
		<variable name="scheme" type="int" default="1"/> 人物加点方案
		<variable name="schemechanges" type="int" default="0"/> 人物加点方案切换次数
		<variable name="schemechangetimes" type="long"/> 人物加点方案切换最后时间
		<variable name="allexp" type="long"/>     玩家出生后获得所有经验
		<variable name="sceneid" type="long"/>		角色所在场景ID
		<variable name="posx" type="int"/>		坐标x
		<variable name="posy" type="int"/>		坐标y
		<variable name="posz" type="int"/>		坐标z
		<variable name="laststaticsceneid" type="long"/>		最后一次玩家所在的静态场景ID
		<variable name="laststaticposx" type="int"/>				最后一次玩家所在的静态场景x
		<variable name="laststaticposy" type="int"/>				最后一次玩家所在的静态场景y
		<variable name="laststaticposz" type="int"/>				最后一次玩家所在的静态场景z
		<variable name="fightpetkey" type="int" default="-1"/>  当前战斗宠物
		<variable name="showpetkey" type="int"/>  当前展示宠物
		<variable name="sysconfigmap" type="map" key="int" value="int"/> 系统设置
		<variable name="titles" type="map" key="int" value="TitleInfo" /> 拥有的称谓列表
		
		<variable name="defultform" type="int" /> 默认光环
		<variable name="formationsMap" type="map" key="int" value="FormBean"/>key=光环id  value=光环等级
		<variable name="clanKey" type="long" default="-1" /> 角色对应公会的key
		<variable name="oldClanKey" type="long" default="-1" /> 角色对应的上次公会key
		<variable name="exitstate" type="int" default="-1" />角色退出公会方式，0主动退出    1被踢出    2解散          key by hzl
		<variable name="onlineTime" type="long" default="-1" /> 角色上次登录时间
		<variable name="offlineTime" type="long" default="-1" /> 角色上次离线时间
		
		<variable name="createtime" type="long" /> 角色创建时间
		<variable name="sumonlinetime" type="long" /> 累积在线时长,ms,这个时长只有在下线的时候才会改变，其他情况还需要通过上次登录时间进行计算
		<variable name="userid" type="int" /> 帐号角色id
		<variable name="addRankList" type="boolean" default="true"/> 角色是否参与排行榜
		<variable name="deletetime" type="long" /> 角色被删除的时间,如果角色没有被删除,这个值为0
		<variable name="lastloginip" type="int" /> 
		<variable name="platformUid" type="string" /> userid在平台的唯一id
		<variable name="vipLevel" type="int"/>vip等级
		<variable name="energy" type="int"/> 活力 by changhao
	
		<variable name="playtimetimes" type="int" default="10"/> 战斗播放时长倍数 10为1倍速 liuxinhua		
		<variable name="rolezonghemaxscore" type="int" default="0"/> 人物综合实力历史最高评分 by changhao
		<variable name="skillscore" type="int"  default="0"/> 技能评分 by changhao
		<variable name="petscore" type="int"  default="0"/> 最强单宠物评分 by changhao
		<variable name="manypetscore" type="int"  default="0"/> 多宠物评分 by changhao
		<variable name="levelscore" type="int"  default="0"/> 等级评分 by changhao
		<variable name="xiulianscroe" type="int"  default="0"/> 修炼评分 by changhao
		<variable name="rolescore" type="int"  default="0"/> 人物评分 by changhao
		<variable name="equipscore" type="int"  default="0"/> 装备评分 by changhao
		
		<variable name="ride" type="int" default="0"/> 当前坐骑 by changhao
		<variable name="bestpetid" type="long"/>
		<variable name="rolecolor1" type="int" default="101"/> 染色方案1
		<variable name="rolecolor2" type="int" default="201"/> 染色方案2
		<variable name="colorroomlist" type="list" value="RoleColorType" capacity="15"/>  衣橱
		<variable name="fighteai" type="list" value="BattleAI"  capacity="16"/> 主角ai
		<variable name="equipeffect" type="int" default="0"/> 当前装备特效
	</xbean>
	
	<table name="properties" key="long" value="Properties" cacheCapacity="6000" cachehigh="512" cachelow="256" lock="rolelock" autoIncrement="true"/> nobody
	
	<xbean name="helpcount"> 援助统计
		<variable name="expvalue" type="long"/> 经验
		<variable name="shengwangvalue" type="int"/> 声望
		<variable name="clanvalue" type="int"/> 帮贡
		<variable name="clanhelpnum" type="int"/> 公会本周援助次数
		<variable name="clanhishelpnum" type="int"/> 公会历史援助次数
	</xbean>
	<table name="helpcount" key="long" value="helpcount" foreign="key:properties" cacheCapacity="10240" cachehight="512" cachelow="256" lock="rolelock"/>
	
	<xbean name="RoleUpdateTime">
		<variable name="dateupdatetime" type="long" default="0"/> 每日更新时间
		<variable name="weekupdatetime" type="long" default="0"/> 每周更新时间
	</xbean>
	
	<table name="roleupdatetimetab" key="long" value="RoleUpdateTime" foreign="key:properties" cacheCapacity="10240" cachehight="512" cachelow="256" lock="rolelock"/>
	
	<table name="requestgoto" key="long" value="long" cacheCapacity="6000" cachehigh="512" cachelow="256" lock="rolelock" persistence="MEMORY"/>

	<xbean name="NpcFollowInfo">
		<variable name="npcid" type="int" default="0"/> npc跟随的id
		<variable name="questid" type="int" default="0"/> 
		<variable name="validdate" type="long" default="0"/> npc跟随的时限
	</xbean>
	<table name="npcfollowroles" key="long" value="NpcFollowInfo" cacheCapacity="6000" cachehigh="512" cachelow="256" lock="rolelock" persistence="MEMORY"/>

	<xbean name="TransfromInfo">
		<variable name="transformid" type="int" default="0"/> 人物变身时的shape
		<variable name="questid" type="int" default="0"/> 
		<variable name="validdate" type="long" default="0"/> 人物变身时的时限
		<variable name="ride" type="int" default="0"/> 人物变身时的坐骑
	</xbean>
	<table name="transfromroles" key="long" value="TransfromInfo" cacheCapacity="6000" cachehigh="512" cachelow="256" lock="rolelock" persistence="MEMORY"/>
	
	<xbean name="ChatTime">
		<variable name="lastWorldChatTime" type="long" />上次世界聊天时间
		<variable name="lastCurrentChatTime" type="long" />上次当前聊天时间
		<variable name="lastProfessionChatTime" type="long" />上次职业聊天时间
		<variable name="lastClanChatTime" type="long" />上次公会聊天时间
		<variable name="lastTeamApplyChatTime" type="long" />上次组队申请喊话时间
	</xbean>
	<table name="chattimetab" key="long" value="ChatTime" cacheCapacity="20240" cachehigh="512" cachelow="256" persistence="MEMORY" />
	
	<xbean name="OfflineFuture" any="true">
		<variable name="timefuture" type="java.util.concurrent.ScheduledFuture&lt;?>"/> 人物下线后的计时任务
	</xbean>
	<table name="offlinefuture" key="long" value="OfflineFuture" cacheCapacity="10240" cachehigh="512" cachelow="256" lock="rolelock" persistence="MEMORY"/> key 是roleid
	
	<xbean name="OnlinerefreshFuture" any="true">
		<variable name="furvec" type="java.util.concurrent.ScheduledFuture&lt;?>" />
	</xbean>
	<table name="onlinerefresh" key="long" value="OnlinerefreshFuture" cacheCapacity="10240" cachehigh="512" cachelow="256" lock="rolelock" persistence="MEMORY" />
	<xbean name="PetInfo">
		<variable name="id" type="int"/>          宠物ID 
		<variable name="key" type="int"/>         在宠物栏、仓库、商会柜台里的key
		<variable name="uniqid" type="long"/>     宠物唯一ID 
	    <variable name="name" type="string"/>     名称
		<variable name="level" type="int"/>	      等级    	*short够了
		<variable name="initbfp" type="BasicFightProperties"/>   初始的基础战斗属性
		<variable name="bfp" type="BasicFightProperties"/>   基础战斗属性
		<variable name="hp" type="int"/>          当前气血
		<variable name="mp" type="int"/>          当前法力
		<variable name="growrate" type="int"/>   成长率 		*short够了
		<variable name="life" type="int"/>       寿命
		<variable name="exp" type="long"/>         当前经验
		<variable name="bornattackapt" type="int"/>  出生时攻击资质	*short够了 	 	
		<variable name="borndefendapt" type="int"/>  出生时防御资质	*short够了 
		<variable name="bornphyforceapt" type="int"/>出生时体力资质	*short够了 
		<variable name="bornmagicapt" type="int"/>   出生时法力资质	*short够了 
		<variable name="bornspeedapt" type="int"/>   出生时速度资质	*short够了 
		<variable name="borndodgeapt" type="int"/>   出生时躲闪资质	*short够了 
		<variable name="kind" type="int"/>        宠物类型 野生、宝宝	*byte够了
		<!--EffectPet-->
		<variable name="effects" type="map" key="int" value="float" /> key = effect type id
		<variable name="finalattrs" type="map" key="int" value="float" capacity="50"/> key = attr type
		<!--EffectPet-->
		<variable name="buffPet" type="BuffAgent"/>	 buff
		<variable name="islocked" type="boolean" default="false"/>	 是否锁定
		<variable name="isbinded" type="boolean" default="false"/>	 是否绑定
		<variable name="timeout" type="long" default="0"/>	时间锁的到期时间，为0则只是普通锁
		<variable name="petScore" type="int"/> 宠物评分
		<variable name="petBaseScore" type="int"/> 宠物一级属性评分
		<variable name="ownerID" type="long"/> 宠物的主人
		<variable name="skills" type="list" value="PetSkill" capacity="15"/> 宠物拥有的战斗技能
		<variable name="point" type="int"/> 潜能点
		<variable name="autoaddcons" type="int"/> 加点方案-升级自动加体质
		<variable name="autoaddiq" type="int"/> 加点方案-升级自动加智力
		<variable name="autoaddstr" type="int"/> 加点方案-升级自动加力量
		<variable name="autoaddendu" type="int"/> 加点方案-升级自动加耐力
		<variable name="autoaddagi" type="int"/> 加点方案-升级自动加敏捷
		<variable name="pointresetcount" type="int" /> 宠物加点的重置次数 *short够了
		<variable name="aptaddcount" type="int" /> 资质培养次数 *byte够了
		<variable name="growrateaddcount" type="int" /> 成长率培养次数 *byte够了
		<variable name="washcount" type="int" /> 洗练次数 *short够了
		<variable name="treasure" type="int" default="0"/> 0表示不是珍品;1表示是珍品
	</xbean>
	<xbean name="PetSkill">
		<variable name="skillId" type="int"/> 技能id
		<variable name="skillType" type="int"/> 0=先天技能  1=后天通过技能书打上去的技能
		<variable name="certification" type="int"/> 0=未认证 1=认证
	</xbean>
	<xbean name="Pets">	
		<variable name="capacity" type="int"/>
		<variable name="nextid" type="int"/>		下一个id
		<variable name="petMap" type="map" key="int" value="PetInfo" capacity="15"/>
	</xbean>
	
	<table name="petdepot" key="long" value="Pets" foreign="key:properties" cacheCapacity="1024" cachehight="512" cachelow="256" lock="rolelock"/>
	
	<table name="pet" key="long" value="Pets" foreign="key:properties" cacheCapacity="10240" cachehigh="512" cachelow="256" lock="rolelock"/> 

	<!-- 宠物每天出售的次数限制 START -->
	<xbean name="PetSellCount">
		<variable name="count" type="int"/> 次数 *byte够了
		<variable name="resetTime" type="long"/> 重置时间
	</xbean>
	<table name="rolepetsellcount" key="long" value="PetSellCount" foreign="key:properties" cacheCapacity="6000" cachehight="512" cachelow="256" lock="rolelock"/>
	<!-- 宠物每天出售的次数限制 END -->

	
	<!-- 多倍时间相关的表-->
	<xbean name="MultiExpInfo">
		<variable name="multiexptime" type="map" key="int" value="int" /> key 为buff类型，即为buffid， value为剩余的可领取的时间，单位为秒
		<variable name="remainnum"  type="int" /> 本周可以使用的个数
		<variable name="dupdannum" type="int" />本周可以使用的双倍丹的个数
		<variable name="lastbacktime" type="long" /> 上次返还多倍时间的时间
		<variable name="refreshtime" type="long"  /> 刷新的时间
	</xbean>
	<table name="multiexp" type="map" key="long" value="MultiExpInfo" cacheCapacity="6240" foreign="key:properties" lock="rolelock" /> 保存角色多倍时间的状态
	<!-- 多倍时间相关的表定义 end-->
	
	
	<table name="roleonoffstate" type="map" key="long" value="int" cacheCapacity="10240" lock="rolelock" persistence="MEMORY"/> key是roleid,value是state
	
	
	<xbean name="Decision">
		<variable name="operateType" type="int"/> 	操作类型
		<variable name="operator" type="int"/> 		操作方的战斗单位索引
		<variable name="aim" type="int"/>			目标的战斗单位索引
		<variable name="operateID" type="int"/> 	操作数，如使用物品的物品ID
		<variable name="isAuto" type="boolean" default="false"/> 	操作是否是自动
	</xbean>
	
	
	<xbean name="Fighter">
		<variable name="uniqueid" type="long"/>			ID：如果是角色，这里是roleId；如果是宠物或者怪物，这里是baseId
		<variable name="fightername" type="string"/>	名称
		<variable name="subtype" type="int"/>	子类型
		<variable name="fighterType" type="int"/>		战斗单位的类型
		<variable name="battleindex" type="int"/> 		战斗者的战斗单位索引，即fighterId
		<variable name="fighterkey" type="int"/> 		战斗者key,fighterId可能会重复，不能唯一确定一个战斗者，此自增的key不会重复
		<variable name="isHost" type="boolean"/>  是否是战斗的主方
		<variable name="round" type="int" default = "0" /> 战斗者进入战斗的回合数
		<variable name="positionX" type="int" /> 战斗者位置x，位置为阵营内的相对位置，一个阵营的坐标为5*4的位置矩阵
		<variable name="positionY" type="int" /> 战斗者位置y
		<variable name="iniHP" type="int"/> 		战斗者的初始hp
		<variable name="iniWound" type="int" default="0" /> 		战斗者的初始伤
		<variable name="iniMP" type="int"/> 		战斗者的初始mp
		<variable name="iniSP" type="int"/> 		战斗者的初始怒气
		<variable name="footLogoId" type="int"/> 足印效果id
		<variable name="ShapeId" type="int"/> 模型id
		<variable name="actioncount" type="map" key="int" value="int" />记录一场战斗的法术物理的攻击和受击次数
		<variable name="fightedpets" type="map" key="int" value="int" />当此fighter为角色时，记录其战斗过的宠物，key为petkey,value是result,逃跑,击飞,召回
		<variable name="initAttrs" type="map" key="int" value="float" />记录角色进入战斗时的初始值
		<variable name="useditems" type="map" key="int" value="int" />记录在此场战斗中用过的物品
		
		<enum name="DrugStuffID" value="275"/>
		<enum name="FoodID" value="290"/>			食品
		<enum name="DrugID" value="291"/>		药品		

		<enum name="DrugStuffTime" value="20"/>			药材
		<enum name="DrugFoodTime" value="10"/>			食品药品
		
		<enum name="FIGHTER_ROLE" value="1"/>			角色
		<enum name="FIGHTER_PET" value="2"/>			宠物
		<enum name="FIGHTER_PARTNER" value="3"/>		伙伴（玩家自带助战）
		<enum name="FIGHTER_MONSTER_HIDE" value="4"/>			暗雷野怪（20000~23999）
		<enum name="FIGHTER_MONSTER_NPC" value="5"/>		战斗npc（24000以上）
		<enum name="FIGHTER_SYSTEM_PARTNER" value="6"/>			系统安排的助战
		
		<enum name="PHY_ATTACK" value="1"/>			一场战斗进行了多少次物理攻击，包括多次技能连击、合击
		<enum name="PHY_HURT" value="2"/>			一场战斗受到了多少次物理伤害，包括保护
		<enum name="MAGIC_ATTACK" value="3"/>		一场战斗进行了多少次法术攻击
		<enum name="MAGIC_HURT" value="4"/>			一场战斗受到了多少次法术伤害
	</xbean>
	
	<xbean name="Protectors">
		<variable name="protectorList" type="list" value="int" />
	</xbean>
	
	<xbean name="BattleResult">
		<variable name="battleid" type="long"/>									战斗ID
		<variable name="configId" type="int" default="0"/>			战斗配置ID，默认为0时不是通过战斗配置new的ID
		<variable name="environment" type="int" />              战场环境
		<variable name="phase" type="int"/>										  战斗的阶段
		<variable name="battletype" type="int"/>								战斗类型
		<variable name="areatype" type="int"/>									练功区类型
		<variable name="areaconf" type="int"/>									练功区配置值
		<variable name="hostform" type="int"/>   								主方光环
		<variable name="guestform" type="int"/>   							客方光环
		<variable name="monstertype" type="int"/>								怪物类型
		<variable name="roleids" type="map" key="long" value="int"/>			所有参战的角色ID : 角色的战斗索引
		<variable name="fighters" type="treemap" key="int" value="Fighter"/>	所有的参战者 战斗索引 ： 战斗者 按索引排序
		<variable name="skipedDeadFighters" type="set" value="int" /> 本回合因为死亡而未出手的战斗者，出手结束清除
		<variable name="monsters" type="map" key="int" value="Monster" /> 所有在该场战斗中生成的怪物/NPC，key为fighterId
		<variable name="failedMonsters" type="list" value="FailedMonster" /> 失败的怪物（包括己方客方）
		<variable name="inifighters" type="treemap" key="int" value="Fighter"/> 把参战者的状态在战斗前保存一份,切磋pk会用到
		<variable name="audience" type="map" key="long" value="int"/>					观战的roleid battleindex
		<variable name="watchers" type="treemap" key="int" value="Fighter"/>
		<variable name="monsterid" type="long" default="-1"/> 明雷怪id 
		<variable name="round" type="int" default="1" />				战斗当前的回合数
		<variable name="roundTime" type="long"/>								PRoundStart后是本回合的开始时间;PPlayScript后是播放开始的时间
		<variable name="scriptPlayTime" type="long" default="1000"/>           脚本播放时间（ms），根据脚本计算出来的播放时间，是脚本播放的最短时间，最短1秒
		<variable name="decisions" type="map" key="int" value="Decision"/>		战斗单元决策结果
		<variable name="feedbacks" type="set" value="long"/> roleid				角色的反馈记录
		<variable name="battleResult" type="int" default="2"/> 战斗是否结束及战斗结果，参考BattleField.BATTLE_XXX,默认为2（BATTLE_NOT_END）
		<variable name="roundResult" type="map" key="int" value="int"/>			战斗单位：战斗结果
		<variable name="protectorMap" type="map" key="int" value="Protectors"/>	被保护人：保护者列表
<!--
		<variable name="roundEndAIAction" type="list" value="int" /> 在回合末结算时触发的服务器AI动作，将在下一回合读秒完成后先被执行
		<variable name="battleAIs" type="map" key="int" value="int" />挂在战场上的AI
-->		
		<variable name="battledatas" type="map" key="int" value="float" /> 保存战斗相关的一些数据
	</xbean>
	
	<xbean name="RoundResultItems" any="true">
		<variable name="resultItems" type="list" value="fire.pb.battle.NewResultItem" /> 一个回合战斗的demo
		<variable name="aiActions" type="list" value="fire.pb.battle.AIOperation" /> 随战斗脚本播放的客户端AI动作
		<variable name="fighterFinallyHps" type="map" key="int" value="int" /> 回合结束时战斗者血量的最终值
		<variable name="fighterFinallyMps" type="map" key="int" value="int" /> 回合结束时战斗者兰量的最终值
	</xbean>
	
	<xbean name="BattleInfo" any="true">
		<variable name="battleid" type="long"/>									战斗ID
		<variable name="configId" type="int" default="0"/>			战斗配置ID，默认为0时不是通过战斗配置new的ID
		<variable name="background" type="int" default="0"/>		战斗地图
		<variable name="bgm" type="int" default="0"/>						背景音乐
		<variable name="environment" type="int" />              战场环境
		<variable name="gmActionTimeTimes" type="int" default="10"/>        时间倍率应用除以10.0，用于调试，gm使用。
		<variable name="envchangefrom" type="int" />            环境改变来源（0 = 场外， 1 = 场内）
		<variable name="phase" type="int"/>										  战斗的阶段
		<variable name="round" type="int" default="0" />				战斗当前的回合数
		<variable name="canrunaway" type="boolean" default="true" /> 本场战斗是否能逃跑
		<variable name="autokey" type="int" default="0"/>				战斗者key，fighterId可能会重复，不能唯一确定一个战斗者，此自增的key不会重复
		
		<variable name="battletype" type="int"/>								战斗类型
		<variable name="areatype" type="int"/>									练功区类型
		<variable name="areaconf" type="int"/>									练功区配置值
		<variable name="babyflag" type="int" default="0"/>						是否是含有宝宝的战斗 0不是     1是含有宝宝的战斗
		<variable name="babybagfull" type="int" default="0"/>   宠物栏是否满  0不满    1满
		<variable name="hostroleid" type="long"/>               发起战斗的主角或者队长的id
		<variable name="monsterid" type="long" default="-1"/>   明雷怪npckey
		<variable name="monstertype" type="int" default="-1"/>	怪物类型
		<variable name="battleEndHandlers" type="vector" value="fire.pb.battle.BattleEndHandler" capacity="2"/> 处理战斗结束的handler
		<variable name="hostform" type="int"/>   								主方光环
		<variable name="guestform" type="int"/>   							客方光环
		<variable name="hostformLevel" type="int"/>   						主方光环等级
		<variable name="guestformLevel" type="int"/>   						客方光环等级
		<variable name="figterInfoOnBegin" type="list" value="fire.pb.battle.FighterInfo" capacity="30"/> 出战斗时的战斗者信息	
		<variable name="roleids" type="map" key="long" value="int" capacity="10"/>			所有参战的角色ID : 角色的战斗索引
		<variable name="fighters" type="treemap" key="int" value="Fighter" capacity="30"/>	所有的参战者 战斗索引 ： 战斗者 按索引排序
		<variable name="fighterObjects" type="map" key="int" value="fire.pb.battle.Fighter" capacity="30"/>  包装好的Fighter类，战斗开始时直接创建完，不用每次用的时候再new,注意使用前要锁rolelock
		<variable name="skipedDeadFighters" type="set" value="int" capacity="10"/> 本回合因为死亡而未出手的战斗者，出手结束清除
		<variable name="monsters" type="map" key="int" value="Monster" capacity="30"/> 所有在该场战斗中生成的怪物/NPC，key为fighterId
		<variable name="failedMonsters" type="list" value="FailedMonster" capacity="30"/> 失败的怪物（包括己方客方）
		<variable name="inifighters" type="treemap" key="int" value="Fighter" capacity="10"/> 把参战者的状态在战斗前保存一份,切磋pk会用到
		<variable name="audience" type="map" key="long" value="int" capacity="30"/>					观战的roleid battleindex
		<variable name="watchers" type="treemap" key="int" value="Fighter" capacity="30"/>
		<variable name="offlineroleids" type="list" value="long" capacity="10" /> 战斗中掉线的角色，不能发送协议

		<variable name="roundTime" type="long"/>								PRoundStart后是本回合的开始时间;PPlayScript后是播放开始的时间
		<variable name="scriptPlayTime" type="long" default="1000"/>           脚本播放时间（ms），根据脚本计算出来的播放时间，是脚本播放的最短时间，最短1秒
		<variable name="decisions" type="map" key="int" value="Decision" capacity="20"/>		战斗单元决策结果
		<variable name="feedbacks" type="set" value="long" capacity="20"/> roleid				角色的反馈记录
		<variable name="battleResult" type="int" default="2"/> 战斗是否结束及战斗结果，参考BattleField.BATTLE_XXX,默认为2（BATTLE_NOT_END）
		<variable name="roundResult" type="map" key="int" value="int" capacity="30"/>			战斗单位：战斗结果
		<variable name="protectorMap" type="map" key="int" value="Protectors" capacity="10"/>	被保护人：保护者列表
		<variable name="timeout" type="java.util.concurrent.ScheduledFuture&lt;?>"/>	超时检测
		<variable name="battleAIs" type="list" value="BattleAI" capacity="30"/> 挂在战场上的AI
		<variable name="engine" type="fire.script.FightJSEngine"/> 用于本场战斗的JS引擎
		<variable name="fighterChangedAttrs" type="map" key="int" value="fire.pb.battle.ActionChangedAttrs" capacity="30"/> 战斗者每个回合改变的属性,key=fighterId
		<variable name="battledatas" type="map" key="int" value="float" /> 保存战斗相关的一些数据
		<variable name="fieldfighter" type="fire.pb.battle.Fighter"/> 战场虚拟的Fighter，为战场技能而用，虚拟数据的来源是此战斗中的一个怪
		<variable name="endprocedures" type="list" value="BattleEndProcedure" capacity="10"/> 战斗者出战斗时执行的Procedure
		<variable name="roundresultItem" type="map" key="int" value="RoundResultItems" capacity="200"/> 整场战斗的demo
		<variable name="itemTimeList" type="list" value="int" capacity="40"/> 整场战斗的demo时间
		<variable name="reliveacts" type="vector" value="fire.pb.battle.operate.Operate" capacity="5"/> 复活后要出手的行动
		<variable name="battleDeads" type="map" key="long" value="int" /> 第几回合死掉的角色
		<variable name="battleMaxRound" type="int"/> 战斗的最大回合数 如果不设置默认为200回合
		<variable name="params" type="map" key="int" value="int" capacity="50"/> 与战斗有关的一些参数
		<enum name="PHASE_GOING" value="0"/>			战斗进行中
		<enum name="PHASE_WAITOPERATION" value="1"/>	等待角色选择操作
		<enum name="PHASE_WAITFEEDBACK" value="2"/>		等待角色反馈操作结束
		
		<enum name="AREA_BATTLEHIDE" value="1"/>	暗雷
		<enum name="AREA_BATTLESHOW" value="2"/>	明雷	
		<enum name="MAX_ROUNDNUM" value="200"/>		战斗最多持续多少回合
		
		<enum name="DATA_MONSTER_NUM" value="1"/>		进入战斗时怪物的个数，只统计客方怪物的数量，不算主方怪物
		<enum name="DATA_MONSTER_CHIEF_NUM" value="2"/>		进入战斗时怪物头领的个数，只统计客方怪物的数量，不算主方怪物
		<enum name="DATA_HOST_ROLE_NUM" value="3"/>		进入战斗时主队角色的个数
		<enum name="DATA_GUEST_ROLE_NUM" value="4"/>		进入战斗时客队角色的个数
		<enum name="DATA_HOST_ROLE_AVERAGE_LEVEL" value="5"/>		进入战斗时主队角色的平均等级
		<enum name="DATA_GUEST_ROLE_AVERAGE_LEVEL" value="6"/>		进入战斗时主队角色的平均等级
		<enum name="DATA_HOST_AVERAGE_CREDIT" value="7"/>		进入战斗时主队角色的平均切磋积分
		<enum name="DATA_GUEST_AVERAGE_CREDIT" value="8"/>		进入战斗时客队角色的平均切磋积分
		<enum name="DATA_MONSTER_AVERAGE_LEVEL" value="9"/>		入战斗时客方怪物的平均等级
		<enum name="DATA_HOST_ROLE_MAX_LEVEL" value="10"/>		进入战斗时，主方角色的最大等级
		<enum name="DATA_HOST_ROLE_MIN_LEVEL" value="11"/>		进入战斗时，主方角色的最小等级
		<enum name="DATA_BATTLE_CONFIG_LEVEL" value="12"/>		进入战斗时，如果战斗配置表里有等级公式，计算出的等级
		
		<variable name="quitteamroleids" type="list" value="long"/> 战斗中有退队角色,战后自动退队 by changhao
		
		<variable name="absentteamroleids" type="list" value="long"/> 战斗中有暂离角色,战后自动暂离 by changhao
		
		<variable name="teamidlist" type="list" value="long"/> 战斗里所有队伍id by changhao
		
	</xbean>
	
	<xbean name="BattleEndProcedure" any="true">
		<variable name="fighterId" type="int"/>	战斗者ID，（现在应该是只有角色，将来还可能会有宠物） 
		<variable name="endprocedure" type="mkdb.Procedure"/>	战斗者出战斗时执行的Procedure
	</xbean>
	
	<table name="battle" key="long" value="BattleInfo" persistence="MEMORY" cacheCapacity="3500" autoIncrement="true"/>Key 是 battleid; nobody
	
	<table name="roleid2battleid" key="long" value="long" lock="rolelock" cacheCapacity="10240" persistence="MEMORY"/> key是roleid value是角色所在战场 nobody
	<table name="watcherid2battleid" key="long" value="long" lock="rolelock" cacheCapacity="10240" persistence="MEMORY"/> key是观战者的id
	
	<!-- monster -->
	<xbean name="Monster">
		<variable name="monsterId" type="int" /> 怪物Id，此Id为在战斗NPC表中配的Id，为monster的baseId
		<variable name="shape" type="int" />造型Id
		<variable name="school" type="int" />职业
		<variable name="level" type="int" default="1"/> 等级
		<variable name="bodysize" type="float" default="1"/> 体型大小
		<variable name="hp" type="int" /> 血
		<variable name="uplimithp" type="int"/> 当前气血上限
		<variable name="mp" type="int" /> 蓝
		<variable name="sp" type="int" /> 怒
		<variable name="bfp" type="BasicFightProperties"/>   基础战斗属性
		<variable name="effects" type="map" key="int" value="float" /> 效果 key = effect type id
		<variable name="finalattrs" type="map" key="int" value="float" />最终属性 key = attr type
		<variable name="buffAgent" type="BuffAgent" /> buff代理		
		<variable name="ais" type="list" value="BattleAI" capacity="30"/> 怪物ai
		<variable name="fightnpctype" type="int" /> 战斗单位类型,主角（玩家控制）,宠物,伙伴（玩家自带助战）,暗雷野怪（20000~23999）,战斗npc（24000以上）,系统安排的助战
		<variable name="monstertype" type="int" /> 怪物类型,普通,精英,宝宝,boss
		<variable name="specialtype" type="int" /> 1控制,2治疗,3惧控,4惧疗,5隐身
		<variable name="skills" type="list" value="MonsterSkill" /> value= MonsterSkill
		<variable name="immunebuffs" type="list" value="int"/>该怪物免疫的buffId
		<variable name="extradata" type="map" key="int" value="int" />记录一些额外数据
		
		<!--额外数据的key含义-->		
		<enum name="BATTLE_TITLE_ID" value="2"/>	战斗内称谓id		
	</xbean>
	<xbean name="FailedMonster" >
		<variable name="fighterId" type="int" /> 怪物在战场上时的战斗ID，注意，这个ID可能跟其他怪重复
		<variable name="ishost" type="boolean" /> 主方or客方怪物
		<variable name="monsterId" type="int" /> 怪物Id，此Id为在战斗NPC表中配的Id，为monster的baseId
		<variable name="level" type="int" /> 等级
		<variable name="shape" type="int" /> 造型Id
		<variable name="fightnpctype" type="int" /> 战斗单位类型,主角（玩家控制）,宠物,伙伴（玩家自带助战）,暗雷野怪（20000~23999）,战斗npc（24000以上）,系统安排的助战
		<variable name="monstertype" type="int" /> 怪物类型,普通,精英,宝宝,boss
		<variable name="result" type="int" /> 结束时的结果，参考fire.pb.battle.ResultType
	</xbean>
	
	<xbean name="MonsterSkill">
		<variable name="id" type="int" />
		<variable name="skilllevel" type="int" />
		<variable name="castrate" type="int" />以千为底
	</xbean>
	
	<xbean name="BattleAI">
		<variable name="id" type="int" />
		<variable name="count" type="int" default="0" /> 成功执行的次数
		<variable name="enableround" type="int" default="0" /> 启用时的回合数
	</xbean>
	
	
	<!-- monster end-->

	<xbean name="TeamInfo">
		<variable name="teamLeaderId" type="long"/>队长ID
		<variable name="minLevel" type="int"/>最小级别
		<variable name="maxLevel" type="int"/>最大级别
		<variable name="formation" type="int"/>阵型id
		<variable name="formationLevel" type="int"/>光环等级
		<variable name="switchLeaderId" type="long"/>改变队长时，保存新队长id，用于返回时验证，不处于改变队长状态时为-1
		<variable name="switchLeaderTime" type="long"/>记录改变队长操作的时间，判断超时用（30秒）
		<variable name="successSwitchTime" type="long"/>记录上一次改变队长成功的时间，成功更换后2分钟内不能更换队长
		<variable name="members" type="list" value="TeamMember" capacity="4"/>
		<variable name="applierIds" type="map" key="long" value="long" capacity="15"/>
		<variable name="invitingIds" type="map" key="long" value="long" capacity="4"/> 被邀请者的IDs 和时间 map by changhao
		<variable name="state" type="int" defatult="1"/> 队伍状态，参考协议中的kngiht.pb.team.TeamState
		<variable name="smapId" type="int" defatult="0"/> 地图玩法ID，主要用于在3状态时保存玩法ID；当处于普通队伍状态时，smapId为0
		<variable name="hugs" type="map" key="long" value="long" defatult="0"/> 拥抱的队员们
		<variable name="targetid" type="int"/>
		<variable name="onekeytimestamp" type="long"/> 一键喊话时间戳
	</xbean>	
	
	<xbean name="TeamMember">
		<variable name="roleId" type="long"/>
		<variable name="state" type="int"/>
	</xbean>
	
	<xbean name="SingleInvitings">
		<variable name="invitingIds" type="map" key="long" value="long" capacity="4"/>
		
	</xbean>
	
	<xbean name="InviteInfo">
		<variable name="beingInvited" type="boolean"/>
		<variable name="inviting" type="TeamInvite"/>
		<variable name="invited" type="list" value="TeamInvite"/>
	</xbean>
	
	<xbean name="TeamInvite">
		<variable name="teamid" type="long"/>
		<variable name="roleid" type="long"/>
		<variable name="invitetime" type="long"/>
	</xbean>
	
	<xbean name="TeamFilter" any="true">
		<variable name="filter" type="fire.pb.team.TeamFilter"/>
	</xbean>
	
	<table name="team" key="long" value="TeamInfo" lock="teamlock" autoIncrement="true" persistence="MEMORY" cacheCapacity="10240"/> nobody
	
	<!--便捷组队 start-->
	<xbean name="BJTeamInfo">
		<variable name="serviceid" type="int"/>
		<variable name="bjdata" type="vector" value="long"/>
	</xbean>
	<table name="bianjieteam" key="int" value="BJTeamInfo" persistence="MEMORY" cacheCapacity="10240"/>
	<table name="roleid2bj" key="long" value="int" lock="rolelock" persistence="MEMORY" cacheCapacity="10240"/>
	<!--便捷组队 end-->
	
	<xbean name="ETeamMatch">
		<variable name="roleid2matchdata" type="map" key="long" value="TeamMatch"/>
		<variable name="teamid2matchdata" type="map" key="long" value="TeamMatch"/>
		<variable name="teammatchdatalist" type="list" value="TeamMatch"/>
		<variable name="rolematchdatalist" type="list" value="TeamMatch"/>
	</xbean>
	
	<xbean name="TeamMatch"> 组队匹配数据 by changhao
		<variable name="roleid" type="long"/>  角色ID by changhao
		<variable name="matchtype" type="int"/> 	   类型0是个人1是队伍 by changhao
		<variable name="targetid" type="int"/> 目标ID by changhao
		<variable name="levelmin" type="int"/> 需要最小等级 个人匹配这个忽略 by changhao
		<variable name="levelmax" type="int"/> 需要最大等级 个人匹配这个忽略 by changhao
		<variable name="onekeytimestamp" type="long"/> 一键喊话时间戳 by changhao
		<variable name="timestamp" type="long"/> 匹配后的时间戳 by changhao
	</xbean>
	
	<xbean name="ETeamMelon">
		<variable name="melonid2melons" type="map" key="long" value="TeamMelon"/> 队伍分赃链表 by changhao
		<variable name="melontype" type="int" default="0"/> 分赃类型 0表示以前默认的;1表示循环打明雷怪任务,2表示精英副本
		<variable name="dataid" type="int"/> 结合melontype,表示子类型;精英副本里表示副本id
		<variable name="dataid2" type="long"/> 明雷怪用的角色id,如果是在队伍内,则是队长id;精英副本里表示副本唯一id
		<variable name="melonerlist" type="list" value="long"/> 有资格分赃的原始人员 by changhao
	</xbean>
	
	<xbean name="RollItem">
		<variable name="itemid" type="int" /> 道具表id by changhao
		<variable name="itemnum" type="int" /> 数量id by changhao
		<variable name="countertype" type="int" />
		<variable name="xiangguanid" type="int" />
		<variable name="awardid" type="int" />
	</xbean>
	
	<xbean name="TeamMelon"> 队伍分赃信息 by changhao
		<variable name="itemid" type="int" /> 道具表id by changhao
		<variable name="itemnum" type="int" /> 道具数量 by changha
		<variable name="itemdata" type="Item"/> 道具数据 by changhao
		<variable name="awardid" type="int" /> 奖励表id
		
		<variable name="melonroleids" type="map" key="long" value="int"/> 分赃人员(roll点决定) by changhao
		<variable name="opmelonroleids" type="map" key="long" value="int"/> 已经操作的分赃人员 by changhao
		
		<variable name="maxrollpoint" type="int" /> 最大ROLL点 by changhao
		<variable name="opnum" type="int"/> 已经ROLL点的人员数量 by changhao
		
		<variable name="battleid" type="long" /> 战斗ID by changhao
		<variable name="battleresult" type="int"/> 战斗结果 by changhao
	</xbean>
	
	<table name="roleid2teamid" key="long" value="long" lock="rolelock" persistence="MEMORY" cacheCapacity="10240"/>
	
	<table name="singleinviting" key="long" value="SingleInvitings" lock="rolelock" persistence="MEMORY" cacheCapacity="10240"/>
	
	<table name="teaminvite" key="long" value="InviteInfo" lock="rolelock" persistence="MEMORY"  cacheCapacity="10240"/>
	
	<table name="targetid2teammatch" key="int" value="ETeamMatch" lock="teammatchlock" persistence="MEMORY"  cacheCapacity="10240"/> 目标对应匹配数据 by changhao
	
	<table name="battlemelonid2melon" key="long" value="ETeamMelon" persistence="MEMORY" cacheCapacity="10240"/> 队伍当前的等待分赃的东西 by changhao
	
	<table name="roleid2battlemelonid" key="long" value="long" lock="rolelock" persistence="MEMORY" cacheCapacity="10240"/> 队伍当前的等待分赃的东西 by changhao
	
	<table name="teamfilters" key="long" value="TeamFilter" lock="teamlock" persistence="MEMORY"  cacheCapacity="10240"/>
	
	<xbean name="ERole">
		<variable name="finalattrs" type="map" key="int" value="float" />最终属性 key = attr type
		<variable name="effects" type="map" key="int" value="float" /> key = effect type id
	</xbean>
	<xbean name="EPet">
		<variable name="effects" type="map" key="int" value="float" /> key = effect type id
		<variable name="finalattrs" type="map" key="int" value="float" /> key = attr type
	</xbean>
	
	<table name="erole" lock="rolelock" type="map" key="long" value="ERole" persistence="MEMORY"  cacheCapacity="0"/> nobody
	<!-- 恢复物品属性 -->
	<xbean name="RecoveryAttr">
		<variable name="quality" type="int"/>
	</xbean>
	<table name="quality" key="long" value="RecoveryAttr" cacheCapacity="10240" autoIncrement="true" />
	
	<xbean name="EnhancementAttr">
		<variable name="level" type="int" /> 等级 by changhao
		<variable name="attrmap" type="map" key="int" value="int"/> 附魔增加的属性 by changhao
	</xbean>
	
	<table name="enhancement" key="long" value="EnhancementAttr" cacheCapacity="10240" autoIncrement="true" /> 附魔属性表 by changhao	
	
	<!-- buff,effect -->
	<xbean name="BuffRole">
		<variable name="roleId" type="long" />
		<variable name="buffAgent" type="BuffAgent"/>
	</xbean>
	

	<xbean name="BuffAgent">
		<variable name="buffs" type="map" key="int" value="Buff" />key为buffId
		<variable name="battleendclear" type="map" key="int" value="int" />如果在战斗中buff到时，id放入此表，等战斗结束一起执行。key为buffId，value为处理方式：1为detach，2为period process
		<variable name="timerFutures" type="map" key="int" value="long" />key=buffId value=future id
	</xbean>
	<xbean name="NotifyList">
		<variable name="notifyTypeId" type="int" />
		<variable name="buffIds" type="list" value="int" />
	</xbean>
	<xbean name="Buff">
		<variable name="index" type="int" />buff类型Id，一种类型的buff只能有一个
		<variable name="impactTime" type="long" default="0"/>buff attach时的时间，用于计算剩余时间和检测到期
		<variable name="remainTime" type="long" default="0"/>计时buff总持续时间（period时的period）
		<variable name="round" type="int" default="0"/>计数buff剩余回合（period时的count）
		<variable name="value" type="long" default="0"/>buff的剩余量（period时的initDelay）
		<variable name="effects" type="map" key="int" value="float"  /> key = effect type id
		<variable name="fighterkey" type="int"/> 当在战斗中添加的buff时，记录战斗者key		
		<enum name="BATTLE_END_IMPACT" value="1"/>			战斗结束detach
		<enum name="BATTLE_END_PROCESS" value="2"/>	    战斗结束process
	</xbean>

	<xbean name="Effect">
		<variable name="effectTypeId" type="int" />目标加成属性类型Id
		<variable name="value" type="float" />加成的值
		<variable name="enable" type="boolean" />是否生效
	</xbean>
	<table name="buffroles" lock="rolelock" type="map" key="long" value="BuffRole" cacheCapacity="0" persistence="MEMORY" /> nobody
	
	<xbean name="StoredBuffRole">
		<variable name="buffs" type="map" key="int" value="Buff"/>
	</xbean>
	<table name="buffrolestodisk" type="map" lock="rolelock" key="long" value="StoredBuffRole" cacheCapacity="6024" foreign="key:properties" />保存的BuffRole中只有storeToDisk为true的Buff及附带的Effect
	<!-- buff,effect end -->	
	
	<xbean name="TimerFuture" any="true">
		<variable name="future" type="java.util.concurrent.ScheduledFuture&lt;?>" />
	</xbean>
	<table name="timerfutures" lock="futurelock" type="map"  autoIncrement="true" key="long"  value="TimerFuture" persistence="MEMORY" /> nobody
	<!-- timer future end-->

	<xbean name="DebugFlag">
		<variable name="debugs" type="list" value="int"/> 不在list中的为非调试状态
		
		<enum name="BATTLE" value="1"/>
	</xbean>
	<table name="debugflag" lock="rolelock" type="map" key="long" value="DebugFlag" cacheCapacity="5024" foreign="key:properties" />	nobody

	
	<!--Skill-->

	<xbean name="AssistSkill">
		<variable name="level" type="int" />
		<variable name="exp" type="long" />
	</xbean>
	
	<xbean name="SpecialSkill">
		<variable name="skillId" type="int" />
		<variable name="equipType" type="int" />
	</xbean>
	
	<xbean name="SkillRole">
		<variable name="skillBases" type="map" key="int"  value="int" /> key = skillbase id; value = skillbase level
		<variable name="inborns" type="map" key="int"  value="int" /> key = inborn id; value = inborn level
		<variable name="lastDegradeTime" type="long" /> 上次穴位降级时间，一天只能降级一次
		<variable name="assistSkills" type="map" key="int" value="AssistSkill" /> 辅助技能
		<variable name="practiceSkill" type="map" key="int" value="PracticeSkill"/> 修炼技能 by changhao
		<variable name="liveSkill" type="map" key="int" value="LiveSkill"/> 生活技能 by changhao
		<variable name="specialSkills" type="list" value="SpecialSkill" />装备提供的特技特效
		<variable name="otherSkills" type="map" key="int" value="int" /> 其他技能，只有级别且暂无归类的技能放在这里
		<variable name="extSkills" type="map" key="int"  value="int" /> key = extskill id; value = extskill level
		<variable name="skillSequence" type="map" key="int" value="int" /> 技能顺序，key为技能ID。value=1~100时为职业技能，101~200时为特技
		<variable name="lastusedtime" type="map" key="int" value="long" /> 上一次使用技能的时间，目前只用在结拜拉人技能里
	</xbean>
	
	
	<table name="skillroles" lock="rolelock" type="map" key="long" value="SkillRole" cacheCapacity="20240" foreign="key:properties" /> nobody
	
	<table name="firstfullskillbase" type="map" key="SkillbaseLevel" value="FirstFullSkillbase" cacheCapacity="1"/> nobody
	
	<cbean name="SkillbaseLevel">
		<variable name="level" type="int" />
	</cbean>
	
	<xbean name="FirstFullSkillbase">
		<variable name="roleIds" type="map" key="long" value="long"/> key=roleid，value=time
	</xbean>
	
	<xbean name="LiveSkill">
		<variable name="level" type="int"/>	
	</xbean>
	
	<xbean name="ELiveSkill">
		<variable name="liveskilllist" type="map" key="int" value="LiveSkill"/>
	</xbean>
	
	<table name="roleid2liveskill" key="long" value="ELiveSkill" lock="rolelock"  cacheCapacity="10240"/> 每个角色的生活技能信息 by changhao
	
	<xbean name="ParticleSkill">
		<variable name="level" type="int"/>
		<variable name="exp" type="int"/>
	</xbean>
	
	<xbean name="PracticeSkill"> 修炼技能 by changhao
		<variable name="level" type="int"/>
		<variable name="exp" type="int"/>
	</xbean>
	
	<xbean name="EParticleSkill">
		<variable name="particleskill" type="map" key="int" value="ParticleSkill"/>
	</xbean>
	
	<table name="roleid2particleskill" key="long" value="EParticleSkill" lock="rolelock" cacheCapacity="10240"/> 修炼技能等级 by changhao	
	<!--Skill end-->	
		
	<xbean name="ArchMap">
	   <variable name="mapid" type="int" />藏宝图上记录的地图id
	   <variable name="posx" type="int" />藏宝图上记录的x坐标
	   <variable name="posy" type="int" />藏宝图上记录的y坐标	   
	</xbean>	 
	<table name="archmaps" key="long" value="ArchMap" cacheCapacity="5024" autoIncrement="true"/> 藏宝图表,key为宝图的id
	
	<!--Imperial Exam Table-->
	<xbean name="KejuRecord"> 科举答题记录
         <variable name="maxvillexamright" type="int" />		xs历史最多答对题目数
		 <variable name="currexamaccexp" type="int" />			本次测试累积获得多少经验
		 <variable name="accrightnum" type="int" />				累积答对次数(xs---hs--ds)
		 <variable name="currexamaccright" type="int" />		当前测试答对次数(xs或hs或ds)
		 <variable name="delwrongval" type="int" />				地王令
		 <variable name="chorightval" type="int" />				天王令
		 <variable name="maxcontinueright" type="int" />		最多连续答对次数(xs---hs---ds)
		 <variable name="rightquesmap" type="map" key="int" value="int" capacity="4"/>		每一卷考卷答对的题目map
		 <variable name="stateexamsendquestime" type="long" />	上一次发题时间(ds专用)
		 <variable name="minstateexamtime" type="long" />		ds历史最短时间
		 <variable name="maxstateexamright" type="int" />		ds历史最多答对题目数
		 <variable name="stateexamtime" type="long" />			通过ds所用的时间
	     <variable name="lastAnswerTime" type="long" /> 最后一次答题时间
		 <variable name="accumulateWeekWencai" type="int" />本周累积文采值
		 <variable name="currentWeekWencai" type="int" />本周当前文采值
		 <variable name="step" type="int" /> 当前进度 1=xs 2=hs 3=ds
		 <variable name="flag" type="int" /> 1=答题中 2=放弃 3=过关失败 4=答题顺利通过
	     <variable name="qIDList" type="vector" value="int" />题目的List,一开始的时候就生成,玩家每答完一题就发送下一题
		 <variable name="quesID" type="int" />最近一道题序号
	     <variable name="answer" type="int" />最近一道题的答案
		 <variable name="lastRight" type="int" /> 上一题答对了还是答错了,1表示对,0表示错 -1=第一次发出来题目
		 <variable name="worngQuesList" type="vector" value="int" />最近一道题的错误答案List(hs专用)
		 <variable name="beginTime" type="long" /> 开始答题时间
	</xbean>
	<table name="role2keju" key="long" value="KejuRecord" cacheCapacity="5024" foreign="key:properties" />
	
	<xbean name="KejuDianshiRecord"> 科举答题记录
	    <variable name="idsList" type="vector" value="long" />能参加科举ds的id
	    <variable name="PassIdsList" type="vector" value="long" />通过的角色Id
	</xbean>
	<table name="kejudianshi" key="int" value="KejuDianshiRecord" cacheCapacity="1"/> 记录科举ds的资格和前三名
	<!--Keju table End-->
	
	<!--冠军试炼start-->
	<xbean name="WinnerRoleRecord">
	<variable name="roleid" type="long" />
	<variable name="score" type="int" /> 记录个人的成绩
	<variable name="time" type="long" />  记录成绩变化的时间
	<variable name="awardflag" type="int" /> 是否领取过奖励的标记,0为没有领取   1为领取过了
	</xbean>
	<table name="winnerscore" key="long" value="WinnerRoleRecord" cacheCapacity="5024" foreign="key:properties" /> 冠军试炼记录的个人成绩表
	<!--冠军试炼end-->
	
	<xbean name="YbNum">
	<variable name="num" type="int" /> 可交易符石数量
	<variable name="bindNum" type="int" /> 绑定符石数量
	<variable name="sysNum" type="int" /> 系统赠送符石数量
	<variable name="noPresentNum" type="int"/> 没有包含赠送的实际符石 by changhao
	<variable name="snList" type="vector" value="long"/> 玩家充值的序列号
	<variable name="bindOrSysNumToday" type="int" /> 该玩家今天获得的符石数量(不包括充值的),不能超过10万
	<variable name="bindOrSysNumTodayTime" type="long" /> 这个time跟下面time不一样,这个time只有绑定或系统符石增加的时候才会变
	<variable name="time" type="long" />最近一次符石数量发生变化的时间
	</xbean>
	<xbean name="YbNums">
		<variable name="roleYb" type="map" key="long" value="YbNum"/>  角色id -> 符石 by changhao
	</xbean>
	<xbean name="BiaoQing">
	<variable name="biaoqinginfos" type="map" key="int" value="long"/> 
	</xbean>

	<xbean name="FirstCharge">    
	   <variable name="firstChargeTime" type="long"/>首冲的时间,可以被刷新的
	   <variable name="firstChargeClearPresentTime" type="long"/>
	   <variable name="chargestatus" type="long"/> 记录玩家首冲数据，0--未充过值 1-－充值了，未领取礼包 2，领取礼包了
    </xbean>

	<table name="fushinum" key="int" value="YbNums" cacheCapacity="5024" lock="userlock"/>记录玩家有多少符石.key为userid
	<table name="firstchargenew" key="int" value="FirstCharge" cacheCapacity="5024" lock="userlock"/> 首冲记录 by changhao
	<table name="fushisuishenskill" key="int" value="int" cacheCapacity="1024" lock="userlock"/> 
	<table name="biaoqing" key="long" value="BiaoQing" cacheCapacity="5024" foreign="key:properties" lock="rolelock"/>
	
	<!--FortuneWheelProgress-->
	<xbean name="WheelItem"> 大转盘中的一格
	<variable name="itemtype" type="int" />1为物品,2为经验,3为金钱
	<variable name="itemid" type="int" />金钱和经验的id为0
	<variable name="num" type="int"  />数量
	<variable name="times" type="int" />倍数,为实际倍数的10倍
	<variable name="bind" type="int" /> 是否绑定,只对物品有效
	<variable name="limit" type="int" /> 最大上限,只对物品有效
	<variable name="msgid" type="int" /> 发公告,只对物品有效
	</xbean>
	<xbean name="WheelInfo"> 一个大转盘的信息
	<variable name="time" type="long"  />答题的时间
	<variable name="npcbaseid" type="int"  />大转盘可能有多个npc有服务,所以要有npc的id
	<variable name="serviceid" type="int"  />一个npc可以有多个大转盘,所以要有服务的id
	<variable name="finish" type="boolean"  />是否完成了这个大转盘
	<variable name="baseMoney" type="int"  />金钱的基数(在翻倍的时候用得上)
	<variable name="baseSMoney" type="int"  />
	<variable name="baseExp" type="int"  />
	<variable name="msgid" type="int"  /> 策划要求每个大转盘给的闲话id都不一样
	<variable name="msgParas" type="vector" value="string" capacity="10"/>
	<variable name="index" type="int"  /> 真正中奖的那个item的下标
	<variable name="wheelItems" type="vector" value="WheelItem" capacity="50"/> 一个大转盘所包含的格子
	</xbean>
	<xbean name="WheelInfos"> 一个玩家可以有多个大转盘
	<variable name="wheelList" type="vector" value="WheelInfo" capacity="20"/>
	</xbean>
	<xbean name="WheelItemLimit"> 一个玩家可以有多个大转盘
	<variable name="limitMap" type="map" key="int" value="int" capacity="20"/>
	</xbean>
	<table name="wheelprogress" key="long" value="WheelInfos" lock="rolelock" foreign="key:properties" cacheCapacity="1000"/>记录玩家的幸运大转盘开始时间
	<table name="wheelitemlimit" key="int" value="WheelItemLimit" cacheCapacity="500"/> key为awardIndex
	
	<xbean name="ChannelAwards">
		<variable name="awards" type="map" key="int" value="long"/> key为奖励ID，value为发放时间，为0时说明未发放
	</xbean>
	<table name="channelawards" key="long" value="ChannelAwards" lock="rolelock" foreign="key:properties" cacheCapacity="4096"/>记录玩家获得渠道奖励
	
	<!-- 装备表 -->	
	<xbean name="EnhancementData">
		<variable name="enhancementAttr" type="map" key="int" value="int"/> 附魔属性 by changhao
		<variable name="enhancementTime" type="long"/> 附魔时间 by changhao		
	</xbean>
	
	<xbean name="Equip">
		<variable name="equiplevel" type="int"/>装备等级
		<variable name="repairtimes" type="int"/>修理失败次数
		<variable name="endure" type="int"/>耐久
		<variable name="curMaxEndure" type="int" /> 当前最大耐久
		<variable name="producer" type="string"/>制造者		
		<variable name="extendure" type="int" default="0"/> 当值为100时,减少1
		<variable name="maxEndure" type="int"/>
		<variable name="skill" type="int" default="0"/> 技能
		<variable name="effect" type="int" default="0"/> 特效
		<variable name="treasure" type="int" default="0"/> 0表示不是珍品;1表示是珍品
		<variable name="attr" type="map" key="int" value="int"/>  基础属性		
		<variable name="addattr" type="map" key="int" value="int"/>  附加属性
		<variable name="enhancement" type="map" key="int" value="EnhancementData"/> 附魔属性 by changhao		
		<variable name="equipScore" type="int" /> 装备评分
		<variable name="diamonds" type="list" value="int" capacity="32"/> 宝石列表
	</xbean>
	<table name="equips" key="long" value="Equip" cacheCapacity="20240" autoIncrement="true"/>
	
<!-- 好友系统相关表 start -->
	<xbean name="FriendGroups">
		<variable name="refuseStrangerMsg" type="int"/> 0=收听陌生人消息  1= 拒绝陌生人消息
		<variable name="friendsMap"  type="map" key="long"  value = "int" />
		<variable name="offLineMsgList" type="vector" value="OfflineMsg" />角色收到的离线消息上线发送以后立刻清除
	</xbean>
	<table name="friends" key="long" lock="rolelock" value="FriendGroups" foreign="key:properties"  cacheCapacity="1024" cachehigh="512" cachelow="256"/>
	
	<xbean name="OfflineMsg">
		<variable name="roleId" type="long" validator="value=[0,)" />
        <variable name="content" type="string" />
		<variable name="details" type="list" value="binary" /> 展示品信息
		<variable name="showinfos" type="list" value="ShowInfoBean" /> 展示品信息
		<variable name="sendTime" type="string" />
	</xbean>
	
	<xbean name="ShowInfoBean">
		<variable name="showType" type="int"/> 类型
		<variable name="roleid" type="long" /> 角色id 
		<variable name="shopid" type="long" /> 商店id,成就类型的时候是完成时间
		<variable name="counterid" type="int" /> 柜台id,成就类型的时候是成就进度
		<variable name="thisID" type="int"/> 唯一id,成就类型的时候是是成就id
	</xbean>
<!-- 好友系统相关表 end-->

	<!--节日礼物-->
	<xbean name="FestivalGift">
	  <variable name="time" type="long"/>  上次领取节日礼物的时间
	  <variable name="onlineTotal" type="long"/>   距上次领取礼物累计时间
	</xbean>
	<table name="festival" type="map" key="long" value="FestivalGift" cacheCapacity="7024" foreign="key:properties" /> key为roleid
	<!--节日礼物 End-->
	
	
	<!--离线消息表-->
	<xbean name="OfflineMsgList" >
		<variable name="protocolList" type="vector" value="OfflineMsgProtocol" />
	</xbean>
	<xbean name="OfflineMsgProtocol" >
		<variable name="proType" type="int" />
		<variable name="content" type="binary" capacity="128"/> 
		<variable name="proClassName" type="string" />
		<variable name="tick" type="long" /> 插入到离线协议的时间
	</xbean>
	<table name="offlinemsg" key="long" value="OfflineMsgList" cacheCapacity="5024" cachehigh="512" cachelow="256"/>
	
	<!--全服系统消息表-->
	<xbean name="BroadcastMsgList" >
		<variable name="msglist" type="vector" value="BroadcastMsg" />
	</xbean>
	<xbean name="BroadcastMsg" >
		<variable name="msgprotocol" type="OfflineMsgProtocol"/>
		<variable name="broadtime" type="long"/>
		<variable name="broadendtime" type="long"/> 如果默认是0，则没有广播的结束时间
	</xbean>
	<table name="broadcastmsgtab" key="int" value="BroadcastMsgList" cacheCapacity="1" cachehigh="1" cachelow="1"/> 只有一行记录key = 1
	
	
	<!--角色名称对应表，key为角色名称（包括曾用名），value为roleid-->
	<table name="rolename2key" key="string" value="long" cacheCapacity="8000" cachehigh="512" cachelow="256"/>

	<!-- 公会start -->
	<xbean name="ClanIndex">
		<variable name="index"  type="map" key="int" value="long"  /> 
	</xbean>
	<table name="clanindex" type="map" key="int" value="ClanIndex" cacheCapacity="1"/>
	
	<table name="tablekeynum" key="int" value="int" cacheCapacity="5024"/>
	
	<xbean name="ClanMemberInfo">
		<variable name="clanPosition" type="int"/> 职位信息
		<variable name="isBannedTalk" type="boolean" default="false"/> 是否被禁言
		<variable name="bannedTalkTime"  type="long" default="0" /> 被禁言的时间
		<variable name="salutation"  type="string" /> 公会中的称谓
		<variable name="jointime" type="long"/> 加入公会时间
		<variable name="ownbonus" type="int" default="0" />		可领取分红
		<variable name="bonusgettime" type="long"/>		领取分红时间
	</xbean>
	
	<xbean name="ClanSkill">	公会技能
		<variable name="clanSkillid" type="int"/> 		技能id
		<variable name="clanSkilllevel" type="int"/> 	技能当前等级
		<variable name="clanSkillexp" type="int"/> 		技能当前经验
	</xbean>
	
	<xbean name="DynamicMapInfo2">		公会副本信息
		<variable name="basemapid"  type="int"  />
	</xbean>
	
	<xbean name="ClanInfo">
		<variable name="index"  type="int"  /> 							公会序号
		<variable name="key"  type="long"  /> 							公会表里的key
		<variable name="clanName"  type="string"  /> 				公会名字
		<variable name="oldClanName" type="string" /> 				公会曾用名
		<variable name="creator"  type="long"  />						公会创始人
		<variable name="popularity"  type="int"  /> 					公会人气度
		<variable name="clanLevel"  type="int" default="1" /> 		公会级别
		<variable name="clanLevelMax" type="int" default="1"/>		公会增加到达的最大等级 by changhao
		<variable name="clanAim"  type="string"  /> 					公会宗旨
		<variable name="clanMaster"  type="long"  />					会长
		<variable name="clanViceMaster"  type="long" default="-1" />	副会长
		<variable name="clanrank" type="int"/>						公会排名
		<variable name="clanSkillMap"  type="map" key="int" value="ClanSkill" />	公会技能信息
		<variable name="members"  type="map" key="long" value="ClanMemberInfo"  />	公会成员
		<variable name="applicants"  type="map" key="long" value="long"  /> 		申请加入公会人员
		<variable name="createtime" type="long"/> 						公会创建时间
		<variable name="money" type="int" default="0"/> 公会资金 by changhao
		<variable name="house" type="map" key="int" value="int"/> 2金库3药房4旅馆  对应等级  by changhao
		<variable name="bonus" type="int"/> 公会分红 by changhao
		<variable name="autostate" type="int" default="0" /> 公会自动接收申请人入会的状态：0关闭 1开启
		<variable name="totalscore" type="int" /> 公会总评分 by changhao
		<variable name="firemembernum" type="int" /> 每日踢出次数
	</xbean>
	
	<xbean name="RoleClanPoint">		玩家帮贡表
		<variable name="freezedClanPoint" type="int"  default="0"/> 	已冻结公会贡献度
		<variable name="currentClanPoint" type="int"  default="0"/> 当前公会贡献度
		<variable name="historyClanPoint" type="int"  default="0"/> 历史公会贡献度
		<variable name="weekClanPoint" type="int"  default="0"/> 周公会贡献度by hzl
		<variable name="oldhistoryClanPoint" type="int"  default="0"/> 旧的历史公会贡献度
		<variable name="oldfreezedClanPoint" type="int"  default="0"/> 	上次退出公会时候冻结公会贡献度
	</xbean>
	
	<xbean name="ClanRoleEvent">    玩家公会事件表
		<variable name="roleeventinfo" type="string"/> 事件信息
	</xbean>
	
	<table name="clanroleevent" key="long" value="ClanRoleEvent" cacheCapacity="10240" cachehigh="512" cachelow="256" lock="rolelock"/>
	
	
	<xbean name="MedicItem">
		<variable name="itemid" type="int"/> 药品id
		<variable name="itemnum" type="int"/> 药品数量
	</xbean>
	
	<xbean name="MedicItemList">
		<variable name="medicitemrefreshtime" type="long" /> 刷新时间
		<variable name="selecttype" type="int" default="0" /> 选择几倍产药类型   0正常  1双倍    2三倍
		<variable name="medicitems" type="map" key="int" value="MedicItem"/> 道具
	</xbean>
	
	<table name="medicitemlisttab" key="long" value="MedicItemList" cacheCapacity="10240" cachehigh="512" cachelow="256" lock="rolelock"/>
	
	
	<xbean name="ClanWeekNum">
		<variable name="weeknum" type="long" default="-1" /> 公会周更新记录周数
	</xbean>
	<table name="clanweeknumtab" key="long" value="ClanWeekNum" cacheCapacity="10240" cachehigh="512" cachelow="256" lock="rolelock"/>
	
	<xbean name="BuyMedicItemNum">
		<variable name="buynum" type="int" default="0" /> 药房道具购买数量
	</xbean>
	<table name="buymedicitemnum" key="long" value="BuyMedicItemNum" cacheCapacity="10240" cachehigh="512" cachelow="256" lock="rolelock"/>
	
	<xbean name="RuneInfo">
		<variable name="dayrequestnum" type="int"/> 请求次数
		<variable name="allgivenum" type="int"/>捐符数
		<variable name="allacceptnum" type="int"/>收符数
		<variable name="itemlevel" type="int"/> 物品等级
	</xbean>
	<table name="runeinfotab" key="long" value="RuneInfo" cacheCapacity="10240" cachehigh="512" cachelow="256" lock="rolelock"/>  公会符文存储信息表
	
	<xbean name="RequestRuneInfo">
		<variable name="roleid" type="long"/>  请求角色roleid
		<variable name="targetroleid" type="long"/>  目标roleid
		<variable name="actiontype" type="int"/>动作类型  0 请求符文    1捐献符文
		<variable name="requesttime" type="long"/>请求时间
		<variable name="itemid" type="int"/> 物品id
		<variable name="itemlevel" type="int"/> 物品等级
	</xbean>
	
	<xbean name="RequestRuneInfoList">
		<variable name="requestrunelists" type="vector" value="RequestRuneInfo"/> 
	</xbean>
	<table name="requestruneinfotab" key="long" value="RequestRuneInfoList" cacheCapacity="10240" cachehigh="512" cachelow="256" lock="rolelock"/>
	
	
	
	<xbean name="RoleApplyClan">		玩家申请公会对象
		<variable name="clankey" type="long" /> 公会key		
		<variable name="state" type="int" />	         申请状态
		<variable name="applytiem" type="long" />  申请时间
	</xbean>
	
	<xbean name="RoleApplyClanList">		玩家申请公会列表
		<variable name="onekeylasttime" type="long" /> 上次一键申请时间
		<variable name="onekeyapplymap" type="map" key="long" value="RoleApplyClan"/>
		<variable name="applymap" type="map" key="long" value="RoleApplyClan"/>
	</xbean>
	
	<table name="clans" key="long" value="ClanInfo" cacheCapacity="1024" cachehigh="512" cachelow="256" autoIncrement="true"/>
	<table name="roleidclan" key="long" value="long" lock="rolelock" cacheCapacity="10240" cachehigh="512" cachelow="256"/>
	<table name="roleclanpoint" key="long" value="RoleClanPoint" cacheCapacity="10240" cachehigh="512" cachelow="256" lock="rolelock"/>
	
	<table name="roleapplyclantab" key="long" value="RoleApplyClanList" cacheCapacity="10240" cachehigh="512" cachelow="256" lock="rolelock"/>
	
	<!--公会排行榜相关表-->
	<xbean name="ClanRankList">
		<variable name="records" type="list" value="ClanRankRecord"/> 所有的记录
	</xbean>
	<xbean name="ClanRankRecord">
		<variable name="rank" type="int"/> 排名
		<variable name="clankey" type="long" /> 公会表唯一键值
		<variable name="clanname" type="string"/> 公会名称
		<variable name="level" type="int" /> 公会等级
		<variable name="membernum" type="int" /> 公会成员数
		<variable name="hotel" type="int" /> 旅馆等级 by changhao
		<variable name="triggertime" type="long"/> 触发时间 by changhao
	</xbean>
	<!--公会排行榜table key为id=1，只有一条记录一个map-->
	<table name="clanranklist" key="int" value="ClanRankList" cacheCapacity="1"/>
	
	<xbean name="ClanZongHeRankList"> 公会综合排行 by changhao
		<variable name="records" type="list" value="ClanZongHeRankRecord"/>
	</xbean>	
	
	<xbean name="ClanZongHeRankRecord"> 
		<variable name="rank" type="int"/> 排名
		<variable name="clankey" type="long" /> 公会表唯一键值
		<variable name="clanname" type="string"/> 公会名称
		<variable name="level" type="int" /> 公会等级
		<variable name="zonghe" type="int" /> 综合 by changhao
		<variable name="triggertime" type="long"/> 触发时间 by changhao
	</xbean>	
	
	<table name="clanzonghelist" key="int" value="ClanZongHeRankList" cacheCapacity="1"/>
	
	<!--公会End-->
	
	<!--人物综合实力排行榜相关表-->
	<xbean name="RoleZongheRankList">
		<variable name="records" type="list" value="RoleZongheRankRecord"/> 所有的记录
	</xbean>
	<xbean name="RoleZongheRankRecord">
		<variable name="rank" type="int"/> 排名
		<variable name="roleid" type="long"/> 人物ID
		<variable name="rolename" type="string" /> 人物名称
		<variable name="school" type="int"/> 职业
		<variable name="level" type="int" /> 等级
		<variable name="score" type="int" /> 总评分
		<variable name="triggertime" type="long"/> 触发时间 by changhao
	</xbean>
	<!--人物综合实力榜table key为id=1，只有一条记录一个map-->
	<table name="rolezonghelist" key="int" value="RoleZongheRankList" cacheCapacity="1"/>
	<!--人物综合实力排行榜相关表-->
	
	<xbean name="RoleProfessionRankRecord">
		<variable name="rank" type="int"/> 排名
		<variable name="roleid" type="long"/> 人物ID
		<variable name="rolename" type="string" /> 人物名称
		<variable name="school" type="int"/> 职业
		<variable name="level" type="int" /> 等级
		<variable name="score" type="int" /> 总评分
		<variable name="clanname" type="string" /> 帮会 by changhao
		<variable name="triggertime" type="long"/> 触发时间 by changhao
	</xbean>
	
	<xbean name="RoleProfessionRankList">
		<variable name="records" type="list" value="RoleProfessionRankRecord"/>
	</xbean>
	
	<table name="roleprofessionranklist" key="int" value="RoleProfessionRankList"  cacheCapacity="1"/> 职业排行榜（战士，法师，牧师，圣骑士，猎人，德鲁伊) by changhao
	
	<xbean name="ClanProgressRankRecord"> 公会进度 by changhao
		<variable name="rank" type="int"/> 排名 by changhao
		<variable name="clankey" type="long"/> 
		<variable name="clanname" type="string" /> 公会名称 by changhao
		<variable name="time" type="long"/> 时间 by changhao
		<variable name="progress" type="int" /> 进度 by changhao
		<variable name="clanmastername" type="string"/> 会长名字 by changhao
		<variable name="triggertime" type="long"/> 触发时间 by changhao
	</xbean>
	
	<xbean name="ClanProgressRankList">
		<variable name="records" type="list" value="ClanProgressRankRecord"/>
	</xbean>
	
	<table name="clanprogressranklist" key="int" value="ClanProgressRankList"  cacheCapacity="1"/> 公会进度排行榜 by changhao

	<xbean name="RoleRankRecord">
		<variable name="rank" type="int"/> 排名 by changhao
		<variable name="roleid" type="long"/> 人物ID by changhao
		<variable name="rolename" type="string" /> 人物名称 by changhao
		<variable name="school" type="int"/> 职业 by changhao
		<variable name="level" type="int" /> 等级 by changhao
		<variable name="score" type="int" /> 人物评分 by changhao
		<variable name="triggertime" type="long"/> 触发时间 by changhao
	</xbean>
	
	<xbean name="RoleRankList"> 人物排行榜数据链 by changhao
		<variable name="records" type="list" value="RoleRankRecord"/>
	</xbean>
	
	<table name="rolerankdatalist" key="int" value="RoleRankList"  cacheCapacity="1"/> 人物 by changhao
	
	<!--排行榜相关表-->	
	<!--个人级别榜相关表-->
	<xbean name="RoleLevelRankList">
		<variable name="records" type="list" value="RoleLevelListRecord"/> 所有的记录
	</xbean>
	
	<xbean name="RoleLevelListRecord">
		<variable name="time" type="long"/> 达到这个数量的时间
		<variable name="marshalData" type="MarshalRoleLevelRecord"/> 
	</xbean>
	
	<xbean name="MarshalRoleLevelRecord">  按角色等级排行 by changhao
		<variable name="roleid" type="long" /> roleid
		<variable name="rolename" type="string"/> 名字
		<variable name="level" type="int"/> 等级
		<variable name="school" type="int"/> 职业id
		<variable name="rank" type="int"/> 排名
	</xbean>
	
	<!--个人级别榜table key为个人级别榜的id=1，只有一条记录一个map-->
	<table name="rolelevellist" key="int" value="RoleLevelRankList" cacheCapacity="1"/>
	
	<!--出徒数量榜相关表-->
	<xbean name="ApprenticeRankList">
		<variable name="records" type="list" value="ApprenticelListRecord"/> 所有的记录
	</xbean>
	
	<xbean name="ApprenticelListRecord">
		<variable name="time" type="long"/> 达到这个数量的时间
		<variable name="marshalData" type="MarshalApprenticeRecord"/> 
	</xbean>
	
	<xbean name="MarshalApprenticeRecord">
		<variable name="roleid" type="long" /> roleid
		<variable name="nickname" type="string"/> 名字
		<variable name="level" type="int"/> 等级
		<variable name="schoolid" type="int"/> 职业id
		<variable name="apprenticeNum" type="int"/> 出徒数量
		<variable name="rank" type="int"/> 排名
	</xbean>
	
	<!--出徒数量榜table key为个人级别榜的id=1，只有一条记录一个map-->
	<table name="apprenticelist" key="int" value="ApprenticeRankList" cacheCapacity="1"/>	
	
	<!--个人财富榜相关表-->
	<xbean name="RoleMoneyRankList">
		<variable name="records" type="list" value="RoleMoneyListRecord"/> 所有的记录
	</xbean>
	
	<xbean name="RoleMoneyListRecord">
		<variable name="time" type="long"/> 达到这个数量的时间
		<variable name="marshalData" type="MarshalRoleMoneyRecord"/> 
	</xbean>
	
	<xbean name="MarshalRoleMoneyRecord">
		<variable name="roleid" type="long" /> roleid
		<variable name="nickname" type="string"/> 名字
		<variable name="wealth" type="long"/> 财富
		<variable name="school" type="int"/> 职业id
		<variable name="rank" type="int"/> 排名
	</xbean>
	
	<!--个人财富榜table key为个人级别榜的id=1，只有一条记录一个map-->
	<table name="rolemoneylist" key="int" value="RoleMoneyRankList" cacheCapacity="1"/>
	
	<!--宠物能力榜相关表-->
	<xbean name="PetScoreRankList">
		<variable name="records" type="list" value="PetScoreListRecord"/> 所有的记录
	</xbean>
	
	<xbean name="PetScoreListRecord">
		<variable name="time" type="long"/> 达到这个数量的时间
		<variable name="marshalData" type="MarshalPetScoreRecord"/> 
	</xbean>
	
	<xbean name="MarshalPetScoreRecord">
		<variable name="roleid" type="long" /> roleid
		<variable name="uniquePetId" type="long" /> 宠物的唯一id
		<variable name="nickname" type="string"/> 名字
		<variable name="petname" type="string"/> 宠物名字
		<variable name="petgrade" type="int"/> 宠物评分
		<variable name="rank" type="int"/> 排名
		<variable name="colour" type="int"/> 宠物颜色
	</xbean>
	
	<!--宠物能力榜table key为个人级别榜的id=1，只有一条记录一个map-->
	<table name="petscorelist" key="int" value="PetScoreRankList" cacheCapacity="1"/>
	<table name="feiliuduom" key="int" value="int" cacheCapacity="1024" cachehigh="512" cachelow="256"/>
		
	<!--副本排行榜相关表-->
	<xbean name="BingFengRank">
		<variable name="ranks" type="map" key="int" value="BingFengRankList"/> key为职业id
	</xbean>
	
	<xbean name="BingFengRankList">
		<variable name="records" type="list" value="BingFengListRecord"/> 所有的记录
	</xbean>
	
	<xbean name="BingFengListRecord">
		<variable name="time" type="long"/> 达到这个数量的时间
		<variable name="marshalData" type="MarshalBingFengRecord"/> 
	</xbean>
	
	<xbean name="MarshalBingFengRecord">
		<variable name="shool" type="int"/> 职业
		<variable name="rank" type="int"/> 排名
		<variable name="roleid" type="long" /> roleid
		<variable name="roleName" type="string" /> 玩家的名字
		<variable name="stage" type="int" /> 关数
		<variable name="times" type="int" /> 耗时
	</xbean>
	
	<!--副本排行榜table key为等级区间-->
	<table name="bingfenglists" key="int" value="BingFengRank" cacheCapacity="100"/>
	<!--FortuneWheelProgress End-->
	<!--进度条信息-->
	<xbean name="ProgressBarInfo">
	 <enum name="TREASURE_MAP" value="1"/> 进度条类型:藏宝图
	 <enum name="SUPER_TREASURE_MAP" value="2"/> 进度条类型:超级藏宝图
	 <variable name="bartype" type="int"/> 进度条类型
	 <variable name="itemkey" type="int"/>  物品的key,是在背包里的key,不是itemid,如果进度条不需要消耗物品,itemkey可以默认为0
	 <variable name="inProgress" type="int"/> 进度条是否已经开始.1表示已经开始,0表示没有开始
	 <variable name="starttime" type="long"/> 进度条的开始时间
	</xbean>
	<table name="progressbartable" key="long" value="ProgressBarInfo" cacheCapacity="40960" persistence="MEMORY"/>
	<!--进度条信息End-->
	
	
	<!--
	<xbean name="RoleTasks">
		<variable name="showing" type="int" default="0"/> 正在施放任务效果的任务id
		<variable name="comitted" type="set" value="int"/>已提交任务线的set
		<variable name="accepted" type="map" key="int" value="Task"/>
	</xbean>
	<table name="scenariotask" key="long" value="RoleTasks" foreign="key:properties" />
	-->
	
	<!--藏宝图开图信息-->
	<xbean name="TreasureMapInfo">
	 <variable name="awardId" type="int"/>  奖励id
	 <variable name="tableIndex" type="int"/> 奖励表里的唯一id
	 <variable name="itemid" type="int"/> 使用的物品id
	</xbean>
	<table name="opentreasuremaptable" key="long" value="TreasureMapInfo" cacheCapacity="40960" persistence="MEMORY"/>
	<!--藏宝图开图信息End-->
	
	<xbean name="SchoolWheel">
	 <variable name="awardid" type="int"/>  奖励id
	 <variable name="itemindex" type="int"/> 物品列的索引
	</xbean>
	<table name="openschoolwheeltable" key="long" value="SchoolWheel" cacheCapacity="40960" persistence="MEMORY"/>
	
	<!-- 单个任务状态 -->
	<xbean name="Mission">
		<variable name="id" type="int"/>
		<variable name="status" type="int" default="0"/>
		<variable name="path" type="vector" value="int"/>
		<variable name="taskvalue" type="int" default="0"/>
		<variable name="deadline" type="long" default="0"/>
		<variable name="round" type="int" default="0"/> 剧情任务和主线任务用默认的0就可以了
	</xbean>
		
	<xbean name="CommitedMissions">
		<variable name="committed" type="list" value="int" capacity="128"/>
	</xbean>
	<table name="commitedmission" key="long" value="CommitedMissions" lock="rolelock" cacheCapacity="5024" cachehigh="512" cachelow="256"/>
	
	<xbean name="CommitedScenarioMission">
		<variable name="committed" type="list" value="int" capacity="128"/>
	</xbean>
	<table name="commitedscenariomission" key="long" value="CommitedScenarioMission" lock="rolelock" cacheCapacity="5024" cachehigh="512" cachelow="256"/>
	
	<xbean name="AcceptedScenarioMission">
		<variable name="accepted" type="map" key="int" value="Mission" capacity="128"/>
	</xbean>
	<table name="acceptedscenariomission" key="long" value="AcceptedScenarioMission" lock="rolelock" cacheCapacity="5024" cachehigh="512" cachelow="256"/>
	<xbean name="ShowingMission">
		<variable name="missionid" type="int"/>
		<variable name="isleader" type="boolean"/>
	</xbean>
	<table name="showingmission" key="long" value="ShowingMission" cacheCapacity="10240" cachehigh="512" cachelow="256" persistence="MEMORY"/>

	<table name="majorscenariomission" key="long" value="Mission" lock="rolelock" cacheCapacity="5024" cachehigh="512" cachelow="256"/>

	<xbean name="Track">
		<variable name="date" type="long"/> 接受任务
	</xbean>
	<xbean name="TrackedMission">
		<variable name="questids" type="map" key="int" value="Track" capacity="32"/>
	</xbean>
	<table name="trackedmission" key="long" value="TrackedMission" lock="rolelock" cacheCapacity="8024"/>
	<!-- 明雷怪区域 -->
	<!--xbean name="PosList">
		<variable name="poslist" type="list" value="Pos"/>
	</xbean>
	<xbean name="Area">
		<variable name="area" type="map" key="int" value="PosList"/>
	</xbean>
	<table name="monstershowarea" key="int" value="Area" persistence="MEMORY"/-->
	
	<xbean name="CircleTaskInfo">
		<variable name="id" type="int" /> x循环任务总表里面的id,标识一个唯一的任务,在第一环时确定该id,直到第十环结束如果再有循环任务,则重新确定该id
		<variable name="questid" type="int" /> 任务id,代表 职业 公会 捉鬼之类
		<variable name="queststate" type="int" /> 任务状态
		<variable name="round" type="int" /> 当前任务的环数
		<variable name="sumnum" type="int" /> 累积次数. 根据不同的任务，拥有不同的含义
		<variable name="smallaward" type="int" /> 小 奖励 累计次数
		<variable name="bigaward" type="int" /> 大 奖励 累积次数
		<variable name="questtype" type="int" /> 任务类型(这里是代表具体循环任务的id)
		<variable name="dstmapid" type="int" /> 目的地图id
		<variable name="givetasknpcid" type="int" /> 接任务npc的id
		<variable name="dstnpckey" type="long" /> 目的npc的key
		<variable name="dstnpcid" type="int" /> 目的npc的id
		<variable name="dstitemid" type="int" /> 目的道具的id
		<variable name="dstitemnum" type="int" /> 目的道具的数量
		<variable name="dstx" type="int" /> 目的坐标
		<variable name="dsty" type="int" /> 目的坐标
		<variable name="lastgiveuptime" type="long" /> 本次任务放弃，下次任务的可接时间:已为放弃时间+delay. 0 为没有放弃,
		<variable name="takequesttime" type="long" /> 接任务的时间,单位毫秒
		<variable name="sametimes" type="int" /> 相同任务类型的次数
		<variable name="lasttype" type="int" /> 上次的任务类型
		<variable name="battlenum" type="int" /> 战斗次数(传说战斗次数)
		<variable name="firstTaskTime" type="long" /> 今天第一次职业的时间,成就系统用.
		<variable name="doneparam" type="int" default="0"/> 任务完成参数
		<variable name="npcname" type="string" /> npc名称
		<variable name="questclass" type="int" /> 任务类型--类似送信，使用物品之类的任务
		<variable name="questgroup" type="int" /> 组类型--类似需要在任务中分种族的任务
		<variable name="autocomp" type="int" default="1" /> 是否自动完成,0:不自动完成,1:是自动完成
		<variable name="submitnpc" type="int" /> 非自动完成任务的提交npc
		<variable name="openawardnum" type="int" /> 转盘奖励计数
		<variable name="catchitsingletime" type="int" /> 单倍捉鬼次数
		<variable name="catchitdoubletime" type="int" /> 双倍捉鬼次数
	</xbean>
	<xbean name="CircleTaskMap">
		<variable name="taskmap" type="map" key="int" value="CircleTaskInfo" />
	</xbean>
	<table name="rolecircletask" type="map" key="long" value="CircleTaskMap"  cacheCapacity="6024" foreign="key:properties" lock="rolelock" />  key 为roleid
	
	<xbean name="RenXingData">
		<variable name="renxinmap" type="map" key="int" value="int" /> key 为循环类型
	</xbean>
	<table name="rolerenxingdata" type="map" key="long" value="RenXingData"  cacheCapacity="6024" foreign="key:properties" lock="rolelock" />  key 为roleid
	
	<!-- 记录循环任务高奖环数完成次数 -->
	<xbean name="CircleTaskCompleteTimes">
		<variable name="circletaskcounts" type="map" key="int" value="int" /> key 为循环类型
		<variable name="logtime" type="long" />
	</xbean>
	<table name="rolecircletaskcomplete" type="map" key="long" value="CircleTaskCompleteTimes"  cacheCapacity="6024" foreign="key:properties" lock="rolelock" />  key 为roleid
	
	<xbean name="SpecailquestFuture" any="true">
		<variable name="questfuture" type="map" key="int" value="java.util.concurrent.ScheduledFuture&lt;?>" capacity="80"/>
	</xbean>
	<table name="rolespecialquesttimer" key="long" value="SpecailquestFuture"  cacheCapacity="7024" lock="rolelock" persistence="MEMORY"/> key为roleid
	
	<xbean name="CreateNpcExecType"  any="true">
		<variable name="execinstance" type="fire.msp.GMCreateNpcExec" />
	</xbean>
	
	<table name="gmcreatenpcuniversal" key="long" value="CreateNpcExecType" persistence="MEMORY" autoIncrement="true" />
	<xbean name="MazeInfo">
		<variable name="mapid" type="int" /> 地图id
		<variable name="pos" type="int" /> 位置编号或者npcid，待定
	</xbean>
	<xbean name="VecList">
		<variable name="list" type="vector" value="MazeInfo" />
	</xbean>
	<table name="fdqmazelist" type="map" key="long" value="VecList" cacheCapacity="10240" lock="rolelock" persistence="MEMORY"/>

	<!-- 人物的特殊任务  包括 职业 end -->
	<!-- 职业领袖  begin-->
	<xbean name="ShouxiInfo">
		<variable name="roleid" type="long" /> 职业领袖对应的role的id
		<variable name="refreshTimes" type="int" /> 每天刷新职业领袖能力不超过5次
		<variable name="lastRefreshTime" type="long" /> 上次刷新的时间
		<variable name="monsterbean" type="vector" value="Monster"/> 血,魔和其他攻击属性都从Monster中获取,其实本应不用vector,但生成的代码没有set function
	  <variable name="shapecomponent" type="map" key="int" value="int"/>
	</xbean>
	<xbean name="CandInfo">
	  <variable name="roleid" type="long" /> roleid
		<variable name="tickets" type="int" /> role的得票
		<variable name="words" type="string" /> role的宣言
		
	</xbean>
		<xbean name="VoteInfo">
		<variable name="voteTime" type="long" /> role最近一次投票的时间
		<variable name="challengeTime" type="long" /> role最近一次挑战成功的时间
	</xbean>
	<xbean name="ShouxiCand">
		<variable name="candidateList" type="vector" value="long" /> 职业领袖候选人list,该表每周清除一次
	</xbean>
	<table name="shouxinpc" type="map" key="int" value="ShouxiInfo"  cacheCapacity="10"/>  key为职业id
	<table name="shouxicandidates" type="map" key="int" value="ShouxiCand"  cacheCapacity="10"/> key为职业id value为每个职业的候选人列表
	<table name="shouxidizi" type="map" key="long" value="VoteInfo" cacheCapacity="1024" foreign="key:properties" /> 玩家的投票和挑战信息
	<table name="roleidtoshouxicand" type="map" key="long" value="CandInfo"  cacheCapacity="1024" foreign="key:properties" /> 玩家的选举信息,为了节省开销,该表不清除
	<table name="shouxicandability" type="map" key="long" value="Monster"  cacheCapacity="1024" foreign="key:properties" /> 候选人的能力列表,因为能力下线后就不存在了,所以把候选人的都保存下来,否则当刷新首席的时候,如果当选者不在线,则首席能力为0
	<!-- 职业领袖 end -->
	<xbean name="TaskDlgInfo">
		<variable name="taskid" type="int" /> 任务id
		<variable name="taskstate" type="int" /> 任务状态
		<variable name="round" type="int" /> 当前任务的环数
		<variable name="sumnum" type="int" /> 累积次数. 根据不同的任务，拥有不同的含义：如职业，是每天的累积次数。的话，是每周的累积次数
		<variable name="dstmapid" type="int" /> 目的地图id
		<variable name="dstnpckey" type="long" /> 目的npc的key
		<variable name="endTime" type="long" />  任务的结束时间
		<variable name="dstnpcid" type="int" /> 目的npc的id
		<variable name="dstitemid" type="int" /> 目的道具的id
		<variable name="dstitemnum" type="int" /> 目的道具的数量
		<variable name="dstx" type="int" /> 目的坐标
		<variable name="dsty" type="int" /> 目的坐标
	</xbean>
	<xbean name="TaskInfos">
		<variable name="tasksMap" type="map" key="int" value="TaskDlgInfo" />
	</xbean>
	<table name="roletasks" type="map" key="long" value="TaskInfos"  cacheCapacity="5024" lock="rolelock" foreign="key:properties" />
	
	<!-- NPC内存表 -->	
	<xbean name="NpcInfo">
		<variable name="isInBattle" type="int" /> 0表示不在战斗中,1表示在战斗中,2表示在战斗中且已经到期,战斗结束就要删除
		<!--<variable name="baseId" type="int" />npcBaseId
		<variable name="name" type="string" />npc名称
		<variable name="shape" type="int" />npc造型
		<variable name="scene" type="long" default="-1" /> 场景实例ID，默认为-1，表示还没设置，下同
		<variable name="mapid" type="int" default="-1"  /> 地图ID
		<variable name="posx" type="int" default="-1" /> 坐标x
		<variable name="posy" type="int" default="-1" /> 坐标y
		<variable name="futureId" type="long" default="-1" /> 如果是限时NPC，这里存放npc的future在xtable.Timerfuture中的key-->
	</xbean>
	<table name="npcs" type="map" key="long" value="NpcInfo" persistence="MEMORY" cacheCapacity="200000" /> nobody
	<!-- 角色坐标内存表 -->	
	<!-- <xbean name="RoleMapInfo">
		<variable name="scene" type="long" /> 场景实例ID
		<variable name="mapid" type="int" /> 地图ID
		<variable name="posx" type="int" /> 坐标x
		<variable name="posy" type="int" /> 坐标y
	</xbean>
	<xbean name="RoleHideBattleInfo">
		<variable name="roadLen" type="int" default="0"/> 角色累计的行走路程
		<variable name="patrolstep" type="int" default="0"/> 在职业和公会任务中，角色累计的行走路程
		<variable name="lastHideBattleTick" type="long" default="0" /> 上一次进入暗雷战斗的时刻
		<variable name="lastEscortBattleTick" type="long" default="0"/> 上一次进入护送任务战斗的时刻
	</xbean>
	<table name="rolemapinfo" key="long" value="RoleMapInfo" persistence="MEMORY" /> nobody
	<table name="rolehidebattleinfo" key="long" value="RoleHideBattleInfo" persistence="MEMORY" /> nobody-->	
  
<!-- 师徒系统start -->  
    <xbean name="ApprentceChieve">
       <variable name="currNumber" type="int"/> 当前次数
	   <variable name="total" type="int"/> 当前总量
	   <variable name="flag" type="int"/> 0=未完成 1=完成 2=已经领奖
	   <variable name="content" type="int"/> 记录一个数值
    </xbean>
  
   <xbean name="CurrApprent">
		<variable name="titleId" type="int"/> 徒弟的当前称谓
		<variable name="level" type="int"/> 拜师时候的等级
		<variable name="apprentInfo" type="HasApprent"/> 徒弟的基本信息
		<variable name="achievement" type="map" key="int" value="ApprentceChieve"/>徒弟的各项成就
		 <variable name="masterComment" type="int"/>师傅对徒弟的评价
		 <variable name="apprentComment" type="int"/>徒弟对师傅的评价
		 <variable name="baishiTime" type="long"/>
	</xbean>
	
  <xbean name="HasApprent">
       <variable name="name" type="string"/>
	   <variable name="level" type="int"/>
	   <variable name="school" type="int"/>
	   <variable name="roleId" type="long"/>
	   <variable name="camp" type="int"/>
	   <variable name="shap" type="int"/>
   </xbean>
	<xbean name="MenstorInfo">
		<variable name="currApprentices" type="list" value="CurrApprent"/> 当前的所有的徒弟注意要有顺序性
		<variable name="apprentices" type="list" value="HasApprent"/> 当前已经出徒的徒弟
		<variable name="updateTime" type="long"/>每日上线的时候 只更新一次
	</xbean>
  	<table name="apprents" key="long" lock="mentorlock" value="MenstorInfo" cacheCapacity="2024" cachehigh="512" cachelow="256"/>徒弟信息表  key为师傅的roleId  注意这个表不是roleLock
	
	
    <xbean name="MenstorAndApprent">
	     <variable name="flag" type="int"/> 0=什么也不是 1=当前阶段是徒弟 2=当前阶段是师傅
		 
		<!--flag=2 时生效 表apprents的key为自己的roleid  表示所有的徒弟信息-->
		<variable name="menstorTitleId" type="int"/> 为师时的titleId 表apprents 为自己的徒弟信息表
		<variable name="firstBaishiTime" type="long"/> 第一个出师徒弟的拜师时间
        <variable name="firstApprentId" type="long"/> 第一个出师徒弟的id
        <variable name="shidezhi" type="long"/>师傅的师德值		
		
		<!--flag=1 时生效 表apprents的key为menstorId -->
		<variable name="menstorId" type="long"/> 师傅的角色id 也是apprents表key 表示自己的师兄弟信息
		<variable name="bashiTime" type="long"/> 罢师时间
		<variable name="bashiFlag" type="int"/> 1=师傅7天没登录罢师 2=强行罢师
		<variable name="eqipmentScore" type="int"/> 拜师时候的装备评分
		<variable name="achievement" type="map" key="int" value="int"/>每达成一项就要记录一项
		<variable name="baishiTime" type="long"/>拜师时间
		
		<variable name="lastGiveFuShiTime" type="long"/> 上次获得符石的时间
        <variable name="fushi" type="long"/> 获得符石数量
		
	</xbean>
  	<table name="menstor"  key="long" lock="rolelock" value="MenstorAndApprent" cacheCapacity="2048" cachehigh="512" cachelow="256"/>师徒信息表
	
	
		<!--人物师德值排行榜-->
	<xbean name="ShiDeZhiRankList">
		<variable name="records" type="list" value="MasterRankRecord"/> 所有的记录
	</xbean>
	<xbean name="MasterRankRecord">
		<variable name="roleid" type="long"/> 人物ID
		<variable name="rolename" type="string" /> 人物名称
		<variable name="shidezhi" type="long" /> 师德值
	</xbean>
	<!--人物综合实力榜table key为id=1，只有一条记录一个map-->
	<table name="roleshidelist" key="int" value="ShiDeZhiRankList" cacheCapacity="1"/>
	<!-- 师徒系统end -->
    
	<!--幻境模式-->
	<xbean name="RolePos">
		<enum name="OUTDREAM" value="1" /> 不在幻境中
		<enum name="INDREAM" value="2" /> 在幻境中
		<enum name="ABSENTDREAM" value="3" /> 暂离幻境
		<variable name="mapid" type="int"/> 
		<variable name="posx" type="int"/> 
		<variable name="posy" type="int"/> 
		<variable name="ownerid" type="long"/> 这个幻境是属于哪个玩家的
		<variable name="dynamicMap" type="int"/> 
		<variable name="dynamicPosx" type="int"/> 
		<variable name="dynamicPosy" type="int"/>
		<variable name="status" type="int"/> 
		<variable name="hasTask" type="int"/> 玩家是否有幻境任务 0没有,1有
	</xbean>
	<table name="roleposes" type="map" key="long" value="RolePos" lock="rolelock" cacheCapacity="5024" foreign="key:properties" /> 玩家进入幻境之前的坐标,出幻境后要回到原地
	<!--幻境模式 End-->
	
	<!--技能栏-->
	<xbean name="SkillbarInfo">
		<variable name="lockBar" type="int"/> 技能栏是否锁定
	  <variable name="skills" type="map" key="int" value="BarInfo"/> 在技能栏里的技能id
	</xbean>
	<xbean name="BarInfo">
		<variable name="id" type="int" /> 
    <variable name="key" type="int" /> 
    <variable name="bartype" type="int" /> 
	</xbean>
	<table name="skillbartable" type="map" key="long" value="SkillbarInfo"  cacheCapacity="3024" foreign="key:properties" /> key为roleid
	<!--技能栏 End-->
	
	<!-- 定时奖励礼包开始 -->
	<xbean name="RewardData">
		<variable name="rewardid" type="int"/>			领了多少个奖励,缺省是0
	    <variable name="lastrewardtime" type="long"/>	上次领取奖励的时间
		<variable name="timewait" type="long"/>			距离下次奖励领取等待时间
	</xbean>
	<table name="timingreward" type="map" key="long" value="RewardData" lock="rolelock"  cacheCapacity="5024"  foreign="key:properties" /> key为roleid
	<!-- 定时奖励礼包结束 -->
	
	<!--副本相关表-->
	<xbean name="InstanceNpcInfo">
		<variable name="npckey" type="long" /> 目的npc的key
		<variable name="npcid" type="int" /> 目的npc的id
		<variable name="mapid" type="int" /> 目的npc的mapid
		<variable name="posx" type="int" /> 目的坐标
		<variable name="posy" type="int" /> 目的坐标
	</xbean>
	
	<xbean name="InstanceInfo">
		<variable name="roleids" type="set" value="long"/> 一起接任务的人的id,包括自己,如果有人放弃了任务,则删除他的id
		<variable name="npcs" type="vector" value="InstanceNpcInfo" /> 召出来的npc列表,如果服务器重启,npc都要被重新召出来
		<variable name="asistNpcs" type="vector" value="InstanceNpcInfo" /> 召出来的辅助npc列表
		<variable name="copyFlag" type="int" /> 副本类型  1为单人副本   2为组队副本
		<variable name="instanceId" type="int" /> 副本id 跟 任务配置.xlsx 表里的 副本ID 对应
		<variable name="currentStep" type="int" /> 当前做到哪一阶段
		<variable name="currentstate" type="int" /> 当前阶段的状态
		<variable name="currentTaskid" type="int" />当前做到哪一步了
		<variable name="serviceid" type="int" /> 当前服务id
		<variable name="currentMapId" type="int" />当前在哪个地图
		<variable name="acceptTime" type="long" /> 接任务时间		
		<variable name="finalcounts" type="int"/> 已经完成的次数
		<variable name="subsaves" type="map" key="int" value="int" cacheCapacity="20"/> 子进度状态，value是子进度计数
	</xbean>	
	
	<xbean name="InstanceFutureInfo" any="true">
		<variable name="timeOutfuture" type="java.util.concurrent.ScheduledFuture&lt;?>"/>
	</xbean>
	
	<xbean name="InstanceTaskInfo">
		<variable name="Id" type="int"/> excel表唯一id
		<variable name="InstanceOnlyId" type="long"/> instancetask 表里的唯一id
	    <variable name="InstanceFlag" type="int"/>0=没有任务 1=任务成功 2=放弃任务 3=任务领取 4=任务超时
		<variable name="Counts" type="int"/> 今天做了多少次
		<variable name="Defaulttimes" type="int"/> 一天默认做多少次
		<variable name="currentStep" type="int" /> 当前做到哪一阶段
		<variable name="currentTaskid" type="int" />当前做到哪一步了
		<variable name="AcceptTime" type="long"/> 最后接任务时间
		<variable name="totalExp" type="int"/> 经验
		<variable name="state" type="int"/> 角色当天关于该副本的状态 0未完成, 1表示未开启(主要用于一次性副本) 2表示已经完成
		<variable name="stepAwardTimes" type="map" key="int" value="int"/> key stepId, value 该step给的奖励次数
	</xbean>
	<xbean name="InstanceInfoCol">
		<variable name="LastInstanceId" type="int"/> 最后进入的一个副本
		<variable name="counts" type="int"/> 今天做了多少次副本
		<variable name="AcceptTime" type="long"/> 最后接副本时间
		<variable name="InstInfo" type="map" key="int" value="InstanceTaskInfo"/> key 副本id, value InstanceTaskInfo
	</xbean>
	
	<!--副本进入询问-->
	<xbean name="InstanceAskInfo">		
		<variable name="answerInfo" type="map" key="long" value="int"/> key为角色id,value为回答状态,0为不同意,1为同意
	</xbean>
	
	<table name="instanceaskinfos" key="long" value="InstanceAskInfo" lock="teamlock" persistence="MEMORY" cacheCapacity="10240"/> key是队伍的id,队伍
	<table name="instancefuture" type="map" key="long" value="InstanceFutureInfo" cacheCapacity="5024"  persistence="MEMORY" /> 
	<table name="instancetask" type="map" key="long" value="InstanceInfo" cacheCapacity="1024" autoIncrement="true" /> 
	<table name="roleinstancetask" type="map" key="long" value="InstanceInfoCol" cacheCapacity="5024" foreign="key:properties" />
	<!--副本相关表 End-->
	
	<!--活跃账户统计-->
	<xbean name="ActiveUserInfo">
		<variable name="firsttimeEnter" type="int" /> 第一次进入服务器 当前天
		<variable name="lasttimeEnter" type="int"  /> 最近一次进入服务器 当前天
		<variable name="lasttimeActiveDay1" type="int"  /> 最近两次活跃的 当前天 day1比day2新,下同
		<variable name="lasttimeActiveDay2" type="int" /> 
		<variable name="lasttimeActiveWeek1" type="int"  /> 最近两次活跃的 当前周 week1比week2新,下同
		<variable name="lasttimeActiveWeek2" type="int" /> 
		<variable name="firsttimeActiveDay" type="int" /> 第一次活跃的 当前天
		<variable name="firsttimeActiveWeek" type="int" /> 第一次活跃的 当前周
		<variable name="lasttimeChargeDay1" type="int" /> 最近2次充值的当前天
		<variable name="lasttimeChargeDay2" type="int" /> 最近2次充值的当前天
		<variable name="lasttimeChargeWeek1" type="int" /> 最近2次充值的当前周
		<variable name="lasttimeChargeWeek2" type="int" /> 最近2次充值的当前周
		<variable name="firsttimeChargeDay" type="int" /> 第一次充值 当前天
		<variable name="firsttimeChargeWeek" type="int" /> 第一次充值 当前周
		<variable name="lasttimeChargeDay" type="int" /> 最近一天充值 当前天,理论上跟lasttimeChargeDay1是相等的
		<variable name="lasttimeChargeDayTotalAmount" type="int" />最近一天充值的总额 当前天
		<variable name="lasttimeChargeWeek" type="int" /> 最近一周充值 当前周,理论上跟lasttimeChargeWeek1相等
		<variable name="lasttimeChargeWeekTotalAmount" type="int" />最近一周充值的总额 当前周
		<variable name="chargeTotalAmount" type="int" /> 充值总额
		<variable name="chargeTotalRmb" type="int" /> 充值rmb总额
		<variable name="chargeTotalAmountLong" type="long" /> 充值总额
		<variable name="chargeTotalRmbLong" type="long" /> 充值rmb总额
		<variable name="chargeTotalRmbUntilLastDay" type="int" />截止昨天的充值总额，方便计算当日充值多少
		<variable name="chargeTotalRmbUntilLastDayLong" type="long" />截止昨天的充值总额，方便计算当日充值多少
		<variable name="convertChargeTotalAmoutToLong" type="int"  /> 是否已经把充值总额转变成了long型
		<variable name="fushiConsumeTotalAmount" type="long" /> 符石消耗的总量
		<variable name="cashfushiConsumeTotalAmount" type="long" /> 现金充值符石消耗的总量
		<variable name="lasttimeFushiConsumeDay" type="int" /> 最近天 消耗符石,记录的是天数
		<variable name="lasttimeFushiConsumeDayTotalAmount" type="int" /> 最近天 消耗的符石数量
    <variable name="lasttimeFushiConsumeWeek" type="int" /> 最近周 消耗符石,记录的是周数
    <variable name="lasttimeFushiConsumeWeekTotalAmount" type="int" /> 最近周 消耗的符石数量
    <variable name="fushiBuyTotalAmount" type="long" /> 符石购买的总量,给log用,不影响活跃
    <variable name="fushiSellTotalAmount" type="long" /> 符石出售的总量,给log用
    <variable name="cashFushi" type="int" /> 剩余流通符石
    <variable name="bindFushi" type="int" /> 剩余绑定rmb符石
    <variable name="sysFushi" type="int" /> 剩余系统赠送符石
    <variable name="fushiInPlatform" type="int" /> 在交易平台里面的挂单符石
	</xbean>
	<xbean name="ActiveRoleInfo">
		<variable name="createTime" type="int" /> 创建时间 当前天
		<variable name="enterWorldTime" type="long" /> 最近一次登录游戏的时间
		<variable name="dayOnline" type="int"  /> 在线时长 当前天 分钟为单位
		<variable name="dayOnlineTime" type="int"  /> 在线时长 当前天 分钟为单位
		<variable name="weekOnline" type="int"  /> 在线时长 当前周 分钟为单位
		<variable name="weekOnlineTime" type="int"  /> 在线时长 当前周 分钟为单位
		<variable name="lasttimeActiveDay1" type="int" /> 最近两次活跃的 当前天 day1比day2新,下同
		<variable name="lasttimeActiveDay1OnlineTime" type="int" /> 最近一次日活跃的在线时长
		<variable name="lasttimeActiveDay2" type="int" /> 
		<variable name="lasttimeActiveWeek1" type="int"  /> 最近两次活跃的 当前周 week1比week2新,下同
		<variable name="lasttimeActiveWeek1OnlineTime" type="int" /> 最近一次周活跃的在线时长
		<variable name="lasttimeActiveWeek2" type="int" /> 
		<variable name="firsttimeActiveDay" type="int" /> 第一次活跃的 当前天
		<variable name="firsttimeActiveWeek" type="int" /> 第一次活跃的 当前周
		<variable name="dealMoneyInPlatform" type="long" /> 交易平台挂单游戏币
    <variable name="tmpMoneyInPlatform" type="long" /> 交易平台暂存游戏币
    <variable name="moneyInCofc" type="long" /> 商会资金
	</xbean>
	
	<xbean name="LianyunAwardInfo">
		<variable name="awards" type="map" key="int" value="long" />
	</xbean>
	<table name="activeusertable" type="map" key="int" value="ActiveUserInfo" cacheCapacity="5024"/> 
	<table name="activeroletable" type="map" key="long" value="ActiveRoleInfo" cacheCapacity="5024" foreign="key:properties" /> 
	<table name="lianyunaward" type="map" key="int" value="LianyunAwardInfo" cacheCapacity="512" lock="userlock"/> 
	<!--活跃账户统计 End-->
	
	<!-- 新手引导表 -->
	<xbean name="BeginnerTip">
		<variable name="tips" type="map" key="int" value="int" capacity="1024"/>
	</xbean>
	<table name="beginnertip" key="long" value="BeginnerTip" cacheCapacity="5024"/>
	
	<xbean name="Gather">
		<enum name="GETITEM" value="0"/> 获得物品
		<enum name="LAUNCHBATTLE" value="1"/> 开始战斗
		<variable name="gatherkey" type="long"/> 采集物key
		<variable name="result" type="int"/> 采集的结果,战斗或者获得物品
		<variable name="endgathertime" type="long"/> 开始采集的时间
	</xbean>
	
	<table name="gather" key="long" value="Gather" cacheCapacity="16392" cachehigh="512" cachelow="256" persistence="MEMORY"/>
	<!--xbean name="MakeApprenticeOrMasterRequest">
		<enum name="ASAPPRENTICE" value="0"/>
		<enum name="ASMASTER" value="1"/>
		<variable name="objid" type="long"/>
		<variable name="requesttype" type="int"/>
		<variable name="requestdate" type="long"/> 请求日期
	</xbean>
	<xbean name="MakeApprenticeOrMasterRequests">
		 <variable name="requests" type="vector" value="MakeApprenticeOrMasterRequest" capacity="128"/>
	</xbean>
	<table name="amrequests" key="long" value="MakeApprenticeOrMasterRequests" cacheCapacity="16392" cachehigh="512" cachelow="256" persistence="MEMORY"/-->
  
  <xbean name="ItemStatistics">
  	<variable name="produced" type="long"/> 生产数量
  	<variable name="removed" type="long"/> 删除数量
  </xbean>
  <table name="itemstatistics" key="int" value="ItemStatistics" cacheCapacity="10240" cachehigh="512" cachelow="256"/>
  
  <!-- 从地图模块获取一系列角色然后回调，存放回调接口 -->
  <xbean name="GetRolesCallBackInst" any="true">
  	<variable name="callback" type="fire.msp.IGetRolesCallBack" />
  </xbean>
  <table name="getrolescallback" key="long" value="GetRolesCallBackInst" cacheCapacity="10240" autoIncrement="true" persistence="MEMORY" />
  
  <!-- roleId到userId的反向索引 -->
  <table name="roleid2userid" key="long" value="int" cacheCapacity="40960" persistence="MEMORY" lock="rolelock"/>
  
  <xbean name="forbidinfo">
	<variable name="forbidtime" type="long" />
	<variable name="reason" type="string" />
  </xbean>
  <table name="userid2forbidtime" key="int" value="forbidinfo" cacheCapacity="20240" persistence="MEMORY" />
  
  <xbean name="SecurityRole">
  	<variable name="password" type="binary" /> 安全密码
  	<variable name="passwordtime" type="long"/> 登录后输入安全密码的时间（用来确定是否再次输入密码）
  	<variable name="wrongtimes" type="int" /> 一天内输入错误的次数
  	<variable name="lastwrongtime" type="long" /> 最后一次输入错误的时间
  	<variable name="forcecleartime" type="long" /> 到期清除的时间
  </xbean>
  <table name="security" key="long" value="SecurityRole" cacheCapacity="5024" lock="rolelock" foreign="key:properties" /> nobody
    
  <xbean name="RoleQuitStatistics">
  	<variable name="money" type="long"/>  	
  	<variable name="exp" type="int"/>
	<variable name="currency" type="map" key="int" value="long"/>
  	<variable name="lastcountdate" type="long"/> 最近统计钱,储备金,经验的时间
  	<variable name="lastrewardidx" type="int"/> 上次领取奖励序号
  	<variable name="rewarddate" type="long"/> 上次领取上线奖励
  </xbean>
  
  <!-- 人物统计表 -->
  <table name="rolequitstatistics" key="long" value="RoleQuitStatistics" foreign="key:properties" cacheCapacity="5024" cachehigh="512" cachelow="256"/>
   
  <!-- 历程 -->
  <xbean name="Course">
  	<variable name="id" type="int"/> id
  	<variable name="count" type="int"/> 完成次数, 有的历程需要多次完成一个操作
	<variable name="state" type="int"/> 状态 0 未完成, 1 已经完成, 2 已经领奖
  </xbean>
  <xbean name="lichengxinxi">
  	<variable name="licheng" type="map" key="int" value="Course" capacity="1024"/>
  </xbean>
  <table name="courses" key="long" value="lichengxinxi" foreign="key:properties" cacheCapacity="5024" cachehigh="512" cachelow="256"/>
  
   <!-- 活动日历 -->
   <xbean name="DayFinishTask">
  	<variable name="taskList" type="list" value="int" />
   </xbean>
   <xbean name="ActivityCalendarStatus">
    <variable name="week" type="int"/> 该记录是今年的第几周的 
  	<variable name="dayStatus" type="map" key="int" value="DayFinishTask"/>
   </xbean>
   <table name="activitycalendar" key="long" value="ActivityCalendarStatus" lock="rolelock" foreign="key:properties" cacheCapacity="5024" cachehigh="512" cachelow="256"/>
   <!-- 活动日历End -->
   
   <!-- 活跃度：这个是从玩法角度的活跃度，与统计角度的活跃度不同 -->
   <xbean name="PlayActiveData">
  	<variable name="id" type="int" />
  	<variable name="count" type="int" /> 完成次数
	<variable name="activeness" type="int" /> 完成共获得的活跃度
   </xbean>
   
   <xbean name="NewPlayActiveDay">
	<variable name="time" type="long"/> 活动记录时间
	<variable name="activeness" type="int" default="0"/> 今天总的活跃度值
	<variable name="chests" type="map" key="int" value="int" capacity="32"/> key为宝箱id,value为是否打开0未开,1已打开
	<variable name="actives" type="map" key="int" value="PlayActiveData" capacity="1024" /> key为活动id,一天的计次数据	
	<variable name="activescount" type="map" key="int" value="int" capacity="1024" /> key为活动id, 一天的次数
	<variable name="yingfutime" type="long"/> 盈福经验记录时间
	<variable name="yingfuexp" type="long"/> 累积的盈福经验	
   </xbean>
   
   <xbean name="NewPlayActiveWeek">
	<variable name="time" type="long"/> 活动记录时间
	<variable name="actives" type="map" key="int" value="PlayActiveData" capacity="1024" /> key为活动id,一周的计次数据
   </xbean>
   
   <table name="rolesplayactive" key="long" value="NewPlayActiveDay" foreign="key:properties" lock="rolelock" cacheCapacity="5024" cachehigh="512" cachelow="256"/> key为roleid
   <table name="rolesplayactiveweek" key="long" value="NewPlayActiveWeek" foreign="key:properties" lock="rolelock" cacheCapacity="5024" cachehigh="512" cachelow="256"/> key为roleid
   
   <xbean name="PlayActiveDay">
   	<variable name="weekday" type="int"/>1-7 周1-周日
   	<variable name="activeness" type="int" default="0"/> 今天的活跃度值 
   	<variable name="chest" type="int" default="0"/> 活跃度宝箱，按位，1为已打开
	<variable name="fushiAward" type="int"/> 1=领取过符石奖励
  	<variable name="actives" type="map" key="int" value="PlayActiveData" cacheCapacity="7" />一天的数据
   </xbean>
   <xbean name="PlayActiveRole">
      <variable name="week" type="int"/> 该记录是今年的第几周
  	  <variable name="activedays" type="map" key="int" value="PlayActiveDay"/> 一周每天的数据
	  <variable name="currentActiveness" type="int"/>当前剩余的活跃度
   </xbean>
   
   <table name="playactiveroles" key="long" value="PlayActiveRole" foreign="key:properties" lock="rolelock" cacheCapacity="5024" cachehigh="512" cachelow="256"/>
   <!-- 活跃度End -->   
  

	<xbean name="UserPunish">
		<variable name="userid" type="int"/> 用户id
		<variable name="records" type="list" value="PunishRecord"/> 封禁记录
		<variable name="releasetime" type="long"/> 解封的时间,gacd用
		<variable name="waiguaTimes" type="int"/> 使用外挂的次数,gacd用
		<variable name="sendMsgtime" type="long"/> 解封后发消息给玩家的时间,如果没有发过消息,为0
	</xbean>
	<xbean name="PunishRecord">
  	<variable name="userid" type="int"/> 用户id
  	<variable name="roleid" type="long"/> 角色id，roleid为0时是对整个账户的处罚
  	<variable name="type" 	type="int"/> 惩罚类型，参考下面
  	<variable name="forbidtime" type="long"/> 封禁的持续时间
  	
  	<variable name="gmuserid" type="int"/> 封禁操作的GM用户id
  	<variable name="optime" type="long" defalut="0"/> 操作时间
  	<variable name="reason" type="string"/> 原因
  	
  	<enum name="TYPE_FORBID_LOGIN" value="1"/>禁止登陆
  	<enum name="TYPE_SHUTUP" value="2"/>禁言
  	<enum name="TYPE_UNFORBID_LOGIN" value="3"/>解除禁止登陆
  	<enum name="TYPE_UNSHUTUP" value="4"/>解除禁言
  </xbean>
  <xbean name="GacdPicStatus">
		<variable name="pictime" type="long"/> 答图形码的时间
		<variable name="answer" type="string"/> 正确答案
		<variable name="result" type="int"/> 答对还是答错
		<variable name="questiontime" type="long"/> 答题的时间,30分钟内不再出题
	</xbean>
	<xbean name="GacdQuestionStatus">
		<variable name="questiontime" type="long"/> 答题的时间,30分钟内不再出题
		<variable name="expratio" type="int"/> 经验系数
	</xbean>
	<xbean name="FreshcardUsed">
	  <variable name="freshcards" type="map" key="int" value="CardInfo"/>
	  <variable name="forbidTypes" type="set" value="string"/>
      <variable name="mt3TongMa" type="int"/> mt3通码领取奖励 0=没有领取过  1=领取过 
      <variable name="lastMT3TongMaTime" type="long"/> 上次领取的时间	 	  
	</xbean>
	<xbean name="CardInfo">
		<variable name="userid" type="int"/> 
		<variable name="roleid" type="long"/>
		<variable name="useCardTime" type="long"/> 用掉新手卡的时间
		<variable name="answer" type="string"/> 新手卡号
		<variable name="parentType" type="int"/> 父类型
		<variable name="type" type="int"/> 子类型
	</xbean>

	<xbean name="Freshcards">
	    <variable name="starttime" type="long"/>
		<variable name="endtime" type="long"/>
		<variable name="itemid" type="int"/> 
		<variable name="minlv" type="int"/> 
		<variable name="maxlv" type="int"/> 
		<variable name="forbidCardtypes" type="set" value="string"/> 
		<variable name="cardids" type="set" value="string"/> 
		<variable name="serverids" type="string"/> 
	</xbean>
  <table name="userpunish" key="int" value="UserPunish" cacheCapacity="1639" cachehigh="512" cachelow="256"/>
  <table name="gacdpic" key="int" value="GacdPicStatus" cacheCapacity="10392" cachehigh="512" cachelow="256" persistence="MEMORY"/>	
  <table name="gacdquestion" key="long" value="GacdQuestionStatus" cacheCapacity="1639" cachehigh="512" cachelow="256" />
  <!--<table name="freshcard" key="long" value="FreshcardInfo" cacheCapacity="1042" cachehigh="512" cachelow="256"/>-->
  <table name="rolefreshcard" key="long" value="FreshcardUsed" lock="rolelock" cacheCapacity="1042" cachehigh="512" cachelow="256"/>
  <table name="freshcards" key="string" value="Freshcards" cacheCapacity="1042" cachehigh="512" cachelow="256"/>
  
	<xbean name="LimitItemInfo">
		<variable name="maxNum" type="int"/>
		<variable name="num" type="int"/>
	</xbean>
	<xbean name="ActivityItemLimit">
		<variable name="limitItemMap" type="map" key="int" value="LimitItemInfo"/> key为itemid
	</xbean>
	<table name="awarditemlimit" key="int" value="ActivityItemLimit" cacheCapacity="1024" cachehigh="512" cachelow="256"/>

	<!-- 补偿相关 START -->
	<xbean name="CompensationInfo">
		<variable name="receiveAwardTime" type="long"/> 领取奖励的时间
		<variable name="readFlag" type="int"/> 是否已读 0=未读 1=已读
	</xbean>
	<xbean name="Compensation">
		<variable name="compensationMap" type="map" key="int" value="CompensationInfo"/> 领取补偿的id
	</xbean>
	<table name="compensation" key="long" value="Compensation" cacheCapacity="5042" cachehigh="512" cachelow="256"/>
	<table name="usercompensation" key="string" value="Compensation" cacheCapacity="5042" cachehigh="512" cachelow="256"/> 给user的补偿,一个账户只能给一次
	<!-- 补偿相关 END -->

	<!-- GM补偿 START -->
	<xbean name="SingleCompensation">
		<variable name="time" type="long"/> 操作时间
		<variable name="validTime" type="long"/> 有效时间
		<variable name="title" type="string"/> 标题
		<variable name="content" type="string"/> 内容
		<variable name="items" type="map" key="int" value="int"/> 物品列表 key = 物品id, value = 物品数量
		<!--variable name="state" type="int" default="0"/--> 0 = 生效，1 = 取消
		<variable name="roleids" type="list" value="long" cacheCapacity="1000" /> key = roleid, value = get time
		<variable name="opid" type="string"/> 操作流水号,10字节定长字符串,运营需求
		<variable name="sign" type="string"/> 签名,32字节定长字符串,运营需求
	</xbean>
	<table name="singlecompensations" key="long" autoIncrement="true"  value="SingleCompensation" cacheCapacity="1024" cachehigh="512" cachelow="256"/> key = 补偿key

	<xbean name="CompensationRole"> 每个角色可领取的补偿列表
		<variable name="singlecompensations" type="map" key="long" value="long"  cacheCapacity="20"/> key = 补偿key, value = 是否已读 0=未读 1=已读
	</xbean>
	<table name="compensationroles" key="long" foreign="key:properties"  value="CompensationRole" cacheCapacity="1024" cachehigh="512" cachelow="256"/> key = roleid
	<!-- GM补偿 END -->

	<xbean name="ActivityStatus">
		<variable name="id" type="int"/> 活动的id
		<variable name="baseid" type="int"/> 活动的baseid
		<variable name="inistarttime" type="long"/> 活动预计的开始的时间(填在表里的时间)
		<variable name="iniendtime" type="long"/> 活动预计的结束的时间(填在表里的时间)
		<variable name="laststarttime" type="long"/> 最近开始的时间
		<variable name="lastendtime" type="long"/> 最近结束的时间
		<variable name="costtime" type="long"/> 活动已经过去了多少时间
	</xbean>
	<table name="activitytable" key="int" value="ActivityStatus" cacheCapacity="100" cachehigh="512" cachelow="256"/> 活动表,在服务器中已经开启的活动
  
  <table name="npcfightnum" key="long" value="int" cacheCapacity="8" cachehigh="8" cachelow="8" persistence="MEMORY"/>
  
  <xbean name="InvestQuestionnaire">
  	<variable name="answer" type="map" key="int" value="int" capacity="128"/> key为题目,value为答案
  </xbean>
  <xbean name="TaskDivineInfo">
  	<variable name="curid" type="int"/> 实际相当于步骤
  	<variable name="state" type="int"/> 任务状态 
  	<variable name="history" type="map" key="int" value="InvestQuestionnaire" capacity="16"/> 任务结果,key为历史任务id,value为任务结果
  </xbean>
  <table name="taskdivine" key="long" foreign="key:properties" value="TaskDivineInfo" cacheCapacity="1024" cachehigh="512" cachelow="256"/>
  
  <!--等级封印-->
  <xbean name="LevelSeal">
  	<variable name="level" type="int"/> 到达等级
  	<variable name="rolenum" type="int"/> 已经到达这个等级的人数
  </xbean>
  <table name="levelseal" key="int" value="LevelSeal" cacheCapacity="10" cachehigh="512" cachelow="256"/> 
  
   
    <!-- 副本玩法START -->
  	<!-- 副本实例START -->
  <xbean name="InstanceZone">
  	<variable name="instZoneId" type="int"/>
  	<variable name="ownerId" type="long"/>
  	<variable name="zonestate" type="int"/> 副本区域当前的状态
  	<variable name="extId" type="long" default="-1"/> 副本如果有额外存储的数据,-1为没有
  	<variable name="roleIds" type="list" value="long" cacheCapacity="20"/>当前在副本内的角色
  	<variable name="saves" type="map" key="int" value="InstanceSave" cacheCapacity="1024"/>进度状态
  	<variable name="npcs" type="map" key="int" value="InstanceNpc" cacheCapacity="100" />副本NPC状态，注意这里保存的是npcid相关的npc状态，不具体到实例
  	<variable name="services" type="map" key="int" value="InstanceNpcServ" cacheCapacity="100" />副本NPC服务状态，注意这里保存的是serviceid相关的，不具体到哪个npc
  	<variable name="timers" type="map" key="int" value="InstanceTimer" cacheCapacity="10"/>副本定时器，key=定时器id
  	
  	<enum name="STATE_INITING" value="0"/> 副本区域正在初始化
  	<enum name="STATE_ACTIVE" value="1"/> 副本区域激活，可以正常进入
  	<enum name="STATE_CLOSING" value="2"/> 副本区域正在进行关闭处理，不能进入
  	<enum name="STATE_CLOSED" value="3"/> 副本区域已关闭
  </xbean>
  <xbean name="InstanceNpcSave">
	<variable name="npckey" type="long"/> npckey
	<variable name="roleid" type="long"/> 有值表示被该角色占用,没有值表示空闲
	<variable name="finishcount" type="int"/> 已经完成的数量
	<variable name="count" type="int"/> 需要完成的数量
  </xbean>
  <xbean name="InstanceSave">
  	<variable name="saveId" type="int"/>
	<variable name="state" type="int"/>
	<variable name="subsaves" type="map" key="int" value="int" cacheCapacity="20"/>子进度状态，value是子进度计数
	<variable name="npcsaves" type="map" key="long" value="InstanceNpcSave" cacheCapacity="100"/> npc的状态存储, key 是npckey
  </xbean>
  <xbean name="InstanceNpc">
  	<variable name="npcbaseId" type="int"/> npcbaseId
	<variable name="state" type="int"/> 状态 1 显示 2 隐藏
  </xbean>
  
  <xbean name="InstanceNpcServ">
  	<variable name="serviceId" type="long"/> serviceid
	<variable name="actId" type="int" /> 0为隐藏，大于0则为某个服务动作的ID，显示出来肯定得有服务动作
  </xbean>  
  
  <xbean name="InstanceTimer">
	<variable name="state" type="int"/> 状态 0=未开始；1=已开始；2=已结束
	<variable name="starttime" type="long"/>开始时间
	<variable name="endtime" type="long"/>结束时间
	<variable name="futurekey" type="long"/>在timerfutures中的key
	<enum name="STATE_UNSTART" value="0"/>
	<enum name="STATE_START" value="1"/>
	<enum name="STATE_END" value="2"/>
  </xbean>
  
  <xbean name="InstanceActivity">
	<variable name="instanceid" type="int"/> 副本id,跟任务配置.xlsx中的id对应
	<variable name="state" type="int"/> 状态,0=未开始；1=已开始；2=已结束
	<variable name="baseid" type="int"/> 活动基础id
	<variable name="starttime" type="long" default="0"/> 开始时间
	<variable name="endtime" type="long" default="0"/> 结束时间
	<enum name="STATE_UNSTART" value="0"/>
	<enum name="STATE_START" value="1"/>
	<enum name="STATE_END" value="2"/>
  </xbean>
  <xbean name="InstanceTurnGroup">
	<variable name="turngroup" type="int"/> 轮换组id
	<variable name="turnindex" type="int"/> 轮换组当前id		
	<variable name="turntype" type="int"/> 轮换类型
  </xbean>
  
  <table name="instancezones" key="long" value="InstanceZone" autoIncrement="true" cacheCapacity="5000"/>
  <table name="role2instancezone" key="long" value="long" cacheCapacity="8192"/>角色当前在哪个副本玩法中
  <table name="instanceactivitys" key="int" value="InstanceActivity" cacheCapacity="8192"/> 服务器副本的开启状态
  <table name="instanceturngroups" key="int" value="InstanceTurnGroup" cacheCapacity="256"/> 服务器副本的开启状态
  <table name="role2instancetask" key="long" value="long" cacheCapacity="8192"/>角色当前在哪个日常副本玩法中
  <!-- 副本实例END -->
  
  <!-- 副本玩法END -->
  
  <!-- 公会副本数据START --> 
  <xbean name="ClanSaveInfo">
	<variable name="savestate" type="map" key="int" value="long"/> key为进度id; value为进度使用的时间
	<variable name="refreshtime" type="long"/> 刷新时间
  </xbean>
  <xbean name="ClanInstances">
	<variable name="clanId" type="long" default="0"/> 公会id
	<variable name="currentzonekey" type="long" default="0"/> 当前激活的公会副本key，0为该公会没有激活公会副本
	<variable name="instkey" type="map" key="int" value="long"/> 公会副本,key副本id; value为对应的副本key.
	<variable name="inststate" type="map" key="int" value="int"/> 公会副本,key副本id; value为对应的副本状态. 0 表示未完成, 1 表示已经完成
	<variable name="inststep" type="map" key="int" value="int"/> 公会副本进行的副本id对应的层数
	<variable name="saveinfo" type="map" key="int" value="ClanSaveInfo" cacheCapacity="100"/> key副本id
	<variable name="instreset" type="map" key="int" value="long"/> 公会副本是否需要重启重置, key副本id, value 表示是否重置: 0 表示没有重置,1 表示重置
  </xbean>
  <table name="claninstances" foreign="key:properties" lock="rolelock" key="long" value="ClanInstances" cacheCapacity="8192"/> key=clanid
  <!-- 公会副本数据END -->
  
  <!-- 冰封王座副本START -->
  <xbean name="RoleBFInfo">
    <variable name="instzoneId" type="int" default="0"/>
  	<variable name="losetimes" type="int" default="0"/>
  	<variable name="receivelastaward" type="int" default="0"/>
  	<variable name="lastrank" type="int" default="0"/>
  	<variable name="stage" type="int" default="0"/>
	<variable name="lastenterstage" type="int" default="0"/>
	<variable name="stagetime" type="map" key="int" value="long" />
  	<variable name="yesterStage" type="int" default="0"/> 
  	<variable name="lastchangetime" type="long" default="0"/>
	<variable name="lastbattletime" type="long" default="0"/> 最后一次战斗状态的改变时间
	<variable name="stagefanpai" type="map" key="int" value="int" /> 记录每个关卡翻牌的次数
	<variable name="autogo" type="int" default="0"/> 是否自动寻路
  </xbean>
  <xbean name="BingFengRole">
    <variable name="instzoneId" type="int" default="0"/>
    <variable name="times" type="int" default="0"/>
  	<variable name="chargetimes" type="int" default="0"/>
  	<variable name="infos" type="map" key="int" value="RoleBFInfo" cacheCapacity="10"/>每一个冰封王座的状态
  </xbean>
  <table name="bingfengroles" foreign="key:properties" lock="rolelock" key="long" value="BingFengRole" cacheCapacity="4192"/>
  <xbean name="BingFengWangZuo">
  	<variable name="deathtimes" type="map" key="long" value="int"/> 死亡次数 key为角色id
  </xbean>
  <table name="bingfengwangzuos" key="long" value="BingFengWangZuo" autoIncrement="true" persistence="MEMORY" cacheCapacity="8192"/>
  
  <xbean name="BingFengInfo">
    <variable name="instzoneId" type="int" default="0"/>
	<variable name="stagetime" type="map" key="int" value="int" /> 记录每个关卡最快通关的时间
	<variable name="stagebest" type="map" key="int" value="long" /> 记录每个关卡最快通关的角色的id
  </xbean>
  <table name="bingfenginfos" key="int" value="BingFengInfo" cacheCapacity="10240"/>
  <!-- 冰封王座副本END -->

  
  <xbean name="ItemRecycleIndex">
  	<variable name="dayrecycle" type="set" value="long" capacity="8192"/>
  </xbean>
  <cbean name="ItemRecycleDate">
	<variable name="year" type="int"/>
	<variable name="dayofyear" type="int"/>
  </cbean>
  <table name="itemrecycleidx" key="ItemRecycleDate" value="ItemRecycleIndex" cacheCapacity="8192"/>
   
  <xbean name="TriggerRole">
  	<variable name="triggeredIds" type="list" value="int"/>	
  </xbean>
  <table name="triggerroles" key="long" value="TriggerRole" lock="rolelock" foreign="key:properties" cacheCapacity="5024"/>
  
  <xbean name="RandomNameInfo">   
  	<variable name="randomtime" type="long" />
  </xbean>
  <table name="randomnametab" key="int" value="RandomNameInfo" persistence="MEMORY" cacheCapacity="8192"/>  
  
  <xbean name="EventInfo" any="true">
  	<variable name="event" type="fire.pb.WorldEventTab.CrontabTask"/>
  </xbean>
  <table name="worldeventtab" key="long" value="EventInfo" cacheCapacity="5096" lock="rolelock" persistence="MEMORY"/>
  <xbean name="OnetimeEvent" any="true">
  	<variable name="onetimeevent" type="fire.pb.WorldEventTab.OnetimeTask"/>
  </xbean>
  <table name="onetimeeventtab" key="long" value="OnetimeEvent" cacheCapacity="5096" lock="rolelock" persistence="MEMORY"/>
  <xbean name="TaskEventInfo">
  	<variable name="eventindexs" type="map" key="int" value="long" capacity="64"/> key为taskid,value为eventidx
  </xbean>
  <table name="roletaskeventtab" key="long" value="TaskEventInfo" cacheCapacity="5096" lock="rolelock" persistence="MEMORY"/>
 <xbean name="QuickPayInfo">
	<variable name="mintVector" type="vector" value="int"/> 绑定的支付商信息
 </xbean>
 <table name="quickpay" key="int" value="QuickPayInfo" cacheCapacity="2048" cachehigh="512" cachelow="256" /> key为userid
 
 <xbean name="PlatformInfo">
	<variable name="id" type="int"/> 商家id
	<variable name="name" type="string"/> 商家名，UTF-16LE编码
	<variable name="discount" type="int"/> 折扣介于1-100之间	
 </xbean>
 <table name="payplatform" key="int" value="PlatformInfo" cacheCapacity="20" cachehigh="512" cachelow="256" /> key为支付平台id

	<!-- mt3称谓 -->
	<cbean name="MT3TitleKey">
		<variable name="guoer" type="long"/> 
		<variable name="longer" type="long"/> 
	</cbean>
	
	<table name="mt3" key="MT3TitleKey" value="int" cacheCapacity="1024" cachehigh="512" cachelow="256" />

<xbean name="ImperialExamAnnoRec">
    <variable name="rolename" type="string"/>
	<variable name="rank" type="int"/> 名次
	<variable name="updatetime" type="long"/>
	<variable name="gmsvid" type="int"/>   合服用，缺省值0  以后合进来递增
</xbean>

<xbean name="ImperialExamAnnoVec">
    <variable name="idvec" type="vector" value="ImperialExamAnnoRec" />
</xbean>
<xbean name="ServerRoles">
    <variable name="rolenum" type="int"/>
    <variable name="createtime" type="long"/>
</xbean>
<table name="rolenumfornewserver"  key="int" value="ServerRoles" cacheCapacity="1" cachehigh="512" cachelow="256"/>
<table name="imperialexamannotbl"  key="int" value="ImperialExamAnnoVec" cacheCapacity="1024" cachehigh="512" cachelow="256"/>

<!--单人pvp-->
<xbean name="SPvPRole"> 单人pvp记录
	<variable name="grade" type="int"/> 此记录所属的赛级
	<variable name="lastBattleTime" type="long"/> 上次战斗结束的时间，以此来计算相关数据是不是本场或者本赛季
	<variable name="score" type="int"/> 积分，跨赛季归千
	<variable name="comboWinNum" type="int"/> 连胜次数，失败或者跨赛季清零
	<variable name="tenwinaward" type="int"/> 十连胜
	<variable name="firstwinaward" type="int"/> 首胜
	<variable name="tenbattleaward" type="int"/> 10战
	<variable name="battleNum" type="int"/> 本场比赛的次数
	<variable name="winNum" type="int"/> 本场比赛的赢的次数
	<variable name="lastEnermyId" type="long"/> 上次战斗的角色id
	<variable name="lastEnterTime" type="long"/> 上次进入赛场时间
	
	<variable name="lastSeasonid" type="int"/> 第几届竞技场
	<variable name="lastFightRoleIds" type="list" value="long"/>  最后三场战斗过的角色id
	<variable name="battleWin" type="int"/> 季后赛胜利次数
	<variable name="battleLost" type="int"/> 季后赛失败次数
	<variable name="lastOutBattleTime" type="long"/> 出战斗时间
</xbean>
<table name="spvproles" key="long" value="SPvPRole" lock="rolelock" cacheCapacity="4096" cachehigh="512" cachelow="256"/>

<xbean name="SPvPRaceRole"> 赛场中的角色
	<variable name="roleid" type="long"/>
	<variable name="name" type="string"/>
	<variable name="score" type="int"/> 积分
	<variable name="battleNum" type="int"/> 本场比赛的次数
	<variable name="winNum" type="int"/> 本场比赛的赢的次数
</xbean>

<xbean name="SPvPRaceRoleWins"> 赛场中的角色
	<variable name="roleid" type="long"/>
	<variable name="name" type="string"/>
	<variable name="combonum" type="int"/> 连胜次数
</xbean>

<xbean name="SPvPQueueRole"> 等待队列中的角色
	<variable name="roleid" type="long"/>
	<variable name="enterqueuetime" type="long"/> 进入队列的时间
</xbean>
<xbean name="SPvPRace"> 赛场
	<variable name="allRoles" type="list" value="SPvPRaceRole" cacheCapacity="500"/> 所有赛场中的角色的积分排行
	<variable name="allRolesId" type="list" value="long" cacheCapacity="500"/> 所有赛场中的角色的积分排行
	<variable name="allRolesWins" type="list" value="SPvPRaceRoleWins" cacheCapacity="10"/> 赛场中角色连胜排行
	<variable name="watingQueue" type="list" value="SPvPQueueRole" cacheCapacity="300"/> 等待序列
</xbean>
<table name="spvpraces" key="int" value="SPvPRace" lock="spvpgradelock" cacheCapacity="8" cachehigh="512" cachelow="256" persistence="MEMORY"/>

<xbean name="EnterRole"> 等待队列中的角色
	<variable name="roleid" type="long"/>
	<variable name="lastOutBattleTime" type="long"/> 出战斗时间
	<variable name="flag" type="int"/> 战斗状态 0=空闲 1=战斗中 2=战败或者主动离开PK地图
	<variable name="battleWin" type="int"/> 胜利次数
	<variable name="battleLost" type="int"/> 失败次数
	<variable name="outmapIndex" type="int"/>
</xbean>

<xbean name="SPvPGrade"> 赛级
	<variable name="currentTimes" type="int"/> 第几场
	<variable name="seasonid" type="int"/> 第几届竞技场
	<variable name="lastEndTime" type="long"/> 上一次结束时间
	<variable name="jueSaiRolesId" type="list" value="long"/> 进阶到决赛的角色id
	<variable name="enterRolesId" type="map" key="long" value="EnterRole"/>角色id value=上一场的战斗时间
	<variable name="outmapIndex" type="int"/> 每离开一个+1
	<variable name="gjRoleid" type="long"/>
	<variable name="firstClear" type="int"/> 0=清除
	<variable name="outRoleIds" type="list" value="long"/> 进阶到决赛的角色id
</xbean>
<table name="spvpgrades" key="int" value="SPvPGrade" cacheCapacity="1"/>
<!--单人pvp END-->

<!--pvp 积分 start-->
<xbean name="RoleScoreBean">
	<variable name="roleid" type="long" /> roleid(当是npc的时候 记录的是npc的id)
	<variable name="roleName" type="string" /> 玩家的名字
	<variable name="historyScore" type="int" /> 分数
	<variable name="school" type="int"/>	  职业
	<variable name="fightPower" type="int" /> 战斗力
	<variable name="flag" type="int"/> 1=npc
	<variable name="shape" type="int" /> 角色模型
	<variable name="level" type="int"/>	 角色等级
</xbean>
<xbean name="RoleScoreList">
	<variable name="lastUpdateTime" type="long" /> 最后一次更新记录的时间
	<variable name="records" type="list" value="RoleScoreBean"/> 所有的记录
</xbean>
<table name="rolescoreranklist" key="int" value="RoleScoreList" cacheCapacity="1"/>

<table name="protecttime" key="int" value="long" cacheCapacity="1"/>（第一次折算积分的保护时间超过这个保护时间跨月才能折算积分 日期为开服时间15天）

<!--pvp 积分 end
<xbean name="RoleScoreRecord">
    <variable name="pvpScore" type="int" /> pvp积分
	<variable name="wuxun" type="int" /> 功勋值
	<variable name="lastAddScoreTime" type="long"/>最后一次加积分时间
</xbean>
<table name="rolescore" key="long" value="RoleScoreRecord" foreign="key:properties" cacheCapacity="1024" cachehight="512" cachelow="256" lock="rolelock"/>
-->

<!--3人pvp START-->
<xbean name="PvP3Role"> pvp记录
	<variable name="grade" type="int"/> 此记录所属的赛级
	<variable name="score" type="int"/> 积分
	<variable name="battleNum" type="int"/> 本场比赛的次数
	<variable name="winNum" type="int"/> 本场比赛赢的次数
	<variable name="continueWinNum" type="int"/> 连胜次数
	<variable name="firstWinAward" type="int"/> 首胜奖励
	<variable name="fiveWinAward" type="int"/> 五胜奖励
	<variable name="tenBattleAward" type="int"/> 十战奖励
	<variable name="lastBattleTime" type="long"/> 上次战斗结束的时间
	<variable name="lastEnemyId" type="long"/> 上次战斗的角色id
	<variable name="lastEnterTime" type="long"/> 上次进入赛场时间
</xbean>
<table name="pvp3roles" key="long" value="PvP3Role" lock="rolelock" cacheCapacity="4096" cachehigh="512" cachelow="256"/>

<xbean name="PvP3RaceRole"> 赛场中的角色
	<variable name="roleId" type="long"/>
	<variable name="name" type="string"/>
	<variable name="score" type="int"/> 积分
</xbean>
<xbean name="PvP3QueueRole"> 等待队列中的角色
	<variable name="roleId" type="long"/>
	<variable name="enterQueueTime" type="long"/> 进入队列的时间
</xbean>
<xbean name="PvP3Race"> 赛场
	<variable name="allRoles" type="list" value="PvP3RaceRole" cacheCapacity="500"/> 所有赛场中的角色的积分排行
	<variable name="allRolesId" type="list" value="long" cacheCapacity="500"/> 所有赛场中的角色的积分排行
	<variable name="waitingQueue" type="list" value="PvP3QueueRole" cacheCapacity="300"/> 等待序列
</xbean>
<table name="pvp3races" key="int" value="PvP3Race" lock="spvpgradelock" cacheCapacity="8" cachehigh="512" cachelow="256" persistence="MEMORY"/>

<!--3人pvp END-->

 <xbean name="ModifyNameRole">
	<variable name="lastBuytime" type="long"/> 上次购买的时间
	<variable name="lastModtime" type="long"/> 上次改名的时间
	<variable name="buyCount" type="int" default="0"/> 记录已经购买的次数
	<variable name="modCount" type="int" default="0"/> 记录已经修改名字的次数
</xbean>
<table name="modnameitemroles" key="long" value="ModifyNameRole" lock="rolelock" /> 记录角色购买改名道具信息

<!-- 充值订单   开始-->
<xbean name="ChargeOrder">
  <variable name="status" type="int" />
	<variable name="platformSn" type="string"/> 充值的平台的sn
	<variable name="platType" type="string"/> 来自哪个平台的充值
	<variable name="platformUid" type="string"/> 充值的平台的账号id
	<variable name="receipt" type="string"/> 只有苹果官方平台才有
	<variable name="transcationid" type="string"/> 只有苹果官方平台才有
	<variable name="roleid" type="long"/> 充值的角色id
	<variable name="num" type="int"/> 充值金额
	<variable name="goodid" type="int" />
	<variable name="goodnum" type="int" />
	<variable name="createTime" type="long" />
	<variable name="userid" type="int"/> 充值的userid
	<variable name="retryTimes" type="int" default="10"/> 超过10次单子被标记为失败
</xbean>
<xbean name="ChargeHistory"> 
	<variable name="charges" type="map" key="long" value="ChargeOrder" capacity="40"/>
</xbean>
<xbean name="AppstoretidStatus"> 
	<variable name="chargesn" type="long"/>  
	<variable name="status" type="int" /> 0处理中,1充值成功,2充值失败
</xbean>
<table name="chargeorder" key="long" value="ChargeOrder" cacheCapacity="4096" autoIncrement="true"/>
<table name="failedchargeorder" key="long" value="ChargeOrder" cacheCapacity="4096" />
<table name="chargehistory" key="int" value="ChargeHistory" cacheCapacity="1024" cachehigh="512" cachelow="256" lock="userlock"/>
<table name="appstoretidstatus" key="long" value="AppstoretidStatus" cacheCapacity="4096" />
<!-- 充值订单   结束-->
  
  <xbean name="RollCardInfo">随机卡信息
	   <variable name="serviceid" type="int"/>
	   <variable name="takeFlag" type="int"/>0没有领取 1=提取过
	   <variable name="baseMoney" type="int"/>
	   <variable name="baseSMoney" type="int"/>
	   <variable name="baseExp" type="int"/>
	   <variable name="index" type="int"/>the real card
	   <variable name="wheelItems" type="vector" value="WheelItem" capacity="4"/> 4张卡
  </xbean>
<table name="rolerollcard" key="long" value="RollCardInfo" lock="rolelock" foreign="key:properties" cacheCapacity="1024"/>

	<xbean name="WelfareBean">
		<variable name="buyTimes" type="int"/>购买次数
		<variable name="lastBuyTime" type="long" />
	</xbean>

	<xbean name="VipWelfare"> vip福利
	   <variable name="takeAwardFlag" type="int"/> 0=无奖励可领取  1=有半年vip奖励可以领取  2=已经领取过奖励了
	   <variable name="dayWelfare" type="map" key="int" value="WelfareBean"/>数量
       <variable name="flag" type="int"/> 0=没有初始化过 1=初始化过
  </xbean>
<table name="rolevipwelfare" key="long" value="VipWelfare" lock="rolelock" foreign="key:properties" cacheCapacity="1024"/>

  <xbean name="MoneyTreeBean">
          <variable name="lastReqTime" type="long"/> 最后一次请求的时间
		  <variable name="currentTimes" type="int"/> 当前次数
		  <variable name="defaultTimes" type="int"/> 最大次数
		  <variable name="lastReqCommonTime" type="long"/> 最后一次请求普通的时间
  </xbean>
<table name="rolemoneytree" key="long" value="MoneyTreeBean" lock="rolelock" foreign="key:properties" cacheCapacity="1024"/>
	<xbean name="RoleFutureNotifyMap" any="true">
		<variable name="notifyMap" type="map" key="int" value="java.util.concurrent.ScheduledFuture&lt;?>"/>
	</xbean>
	<xbean name="RolesNotifyMap" any="true">
		<variable name="rolesFutureMap" type="map" key="long" value="RoleFutureNotifyMap"/>
	</xbean>
<table name="notify" type="map" key="int" value="RolesNotifyMap" cacheCapacity="1" persistence="MEMORY"/>

<xbean name="NeiceReturn">
     <variable name="roleid" type="long"/> 角色id
	 <variable name="fushiNum" type="int"/> 返还的符石数
	 <variable name="returnTime" type="long"/> 返还符石时间
</xbean>
<table name="fushineice" key="int" value="NeiceReturn" cacheCapacity="1024" lock="userlock"/>记录玩家返还了多少符石

<!-- 邀请人相关开始 -->
<xbean name="InvitePeopleInfo">
	<variable name="inviteMe" type="long"/> 邀请我的人
	<variable name="amInvites" type="list" value="long"/> 我邀请的人
	<variable name="awardHistory" type="list" value="int"/> 已经领取过的奖励ID 0-填写邀请人奖励
</xbean>
<table name="invitepeopleinfo" key="long" value="InvitePeopleInfo" lock="rolelock" cacheCapacity="1024" cachehigh="512" cachelow="256"/>

 <!-- 离线挂机表 -->
<xbean name="OffLineHook">
     <variable name="hookTime" type="long"/>开始挂机时间
	 <variable name="remainFiveBeiTime" type="long"/>点击使用5倍的时候封存5倍时间
	 <variable name="fiveBeiTimeStart" type="long"/>开始使用五倍时间的时间
	 <variable name="fiveBeiTotalUseTime" type="long"/>最后一次点击前总的使用时间
	 <variable name="flag" type="int"/> 0=无挂机或者已经领取了挂机经验 1=单倍挂机 2=5倍挂机
</xbean>
<table name="roleofflinehook" key="long" value="OffLineHook" lock="rolelock" cacheCapacity="1024" cachelow="256"/>

<xbean name="TransfromByItemData">
	<variable name="useitemid" type="int"/>
	<variable name="transformid" type="int"/>
	<variable name="validdate" type="long"/>
</xbean>
<table name="transformbyitem" key="long" value="TransfromByItemData" lock="rolelock" cacheCapacity="1024" cachelow="256"/>

<xbean name="TicketItemExInfo">
      <variable name="ticketCode" type="string"/>
</xbean>
<table name="ticketiteminfo" key="long" value="TicketItemExInfo" cacheCapacity="1024" autoIncrement="true"/>
 <!-- 玩家安全锁表 -->
<xbean name="RoleLockInfo">
     <variable name="password" type="string"/>安全锁密码,为空表示没有设置安全锁
	 <variable name="unlockTime" type="long"/>开始解锁的时间,为0表示没解锁
	 <variable name="forceUnlockTime" type="long"/>开始强行解锁的时间,为0表示没有申请强制解锁
	 <variable name="errorTimes" type="int"/>连续输错密码的次数
	 <variable name="fullErrorTime" type="long"/>连续输错密码达上限的时间
</xbean>
<table name="rolesafelock" key="long" value="RoleLockInfo" lock="rolelock" cacheCapacity="1024" cachelow="256"/>

 <!-- 玩家安全锁表 -->
<xbean name="totalNumber">
     <variable name="totalNumber" type="long"/>
</xbean>
<table name="totalregisternum" key="int" value="totalNumber" cacheCapacity="1"/>

<!--七日登录开始-->
<xbean name="MulDayLoginGift">
	<variable name="logindays" type="int"/>		累计登录天数
	<variable name="logintime" type="long"/>	更新时间
	<variable name="rewardmap" type="map" key="int" value="long"/> 七日登录奖励(key-奖励ID，val-领取时间(0表示未领取))
</xbean>
<table name="rolemuldayloginreward" key="long" value="MulDayLoginGift" lock="rolelock" cacheCapacity="10240"/>
<!--七日登录结束-->

<!-- 定时刷怪活动相关信息表 -->
<xbean name="RefreshMonsterNpcInfo">
	<variable name="npcInfos" type="map" key="long" value="int"/> //npckey 对应的战斗状态 0=空闲  1=战斗中
</xbean>
<table name="refreshmonsterinfo" key="int" value="RefreshMonsterNpcInfo" persistence="MEMORY" cacheCapacity="1024"/> key=活动id  定时刷怪活动相关

<xbean name="timerNpcInfo">
	<variable name="npcId" type="int"/> //npcid 补充怪物时需要用到
	<variable name="npcStatus" type="int"/> //npckey 对应的战斗状态 0=空闲 1=战斗中 2=已经消失
</xbean>
<xbean name="timerNpcInfoCol">
	<variable name="npcInfo" type="map" key="long" value="timerNpcInfo"/> //npckey 对应的Npc状态信息
</xbean>
<table name="timernpcinfotable" key="int" value="timerNpcInfoCol" persistence="MEMORY" cacheCapacity="1024"/> key=活动id  定时刷怪活动相关
<xbean name="RoleTimerNpcInfo">
	<variable name="awardTimes" type="int"/> //领取奖励次数
	<variable name="lastAwardTime" type="long"/> //上次领取奖励时间
</xbean>
<xbean name="RoleActiveTimerNpcInfo">
	<variable name="actInfo" type="map" key="int" value="RoleTimerNpcInfo"/> //key是活动id
</xbean>
<table name="roletimernpcinfos" key="long" value="RoleActiveTimerNpcInfo" cacheCapacity="1024"/> key为角色id

<xbean name="RoleEventNpcInfo">
	<variable name="awardTimes" type="int"/> //领取奖励次数
	<variable name="lastAwardTime" type="long"/> //上次领取奖励时间
</xbean>
<xbean name="RoleEventNpcInfoColumn">
	<variable name="eventInfo" type="map" key="int" value="RoleEventNpcInfo"/> //key是活动id
</xbean>
<table name="roleeventnpcinfos" key="long" value="RoleEventNpcInfoColumn" cacheCapacity="1024"/> key为角色id
 <!-- 定时刷怪活动相关信息表 -->

<xbean name="WeiBoChoice">
	 <variable name="times" type="int"/>次数
	 <variable name="setting" type="int"/>设定
</xbean>
<xbean name="WeiBoNotify">
     <variable name="weibo" type="map" key="int" value="WeiBoChoice"/> key=类型 value=微博相关数据
	 <variable name="takeAwardFlag" type="int"/>1=可以领奖  2=领取过了
</xbean>
<table name="role2weibonotify" key="long" value="WeiBoNotify" lock="rolelock" cacheCapacity="1024" cachelow="512"/>

<!-- 角色npc奖励相关信息表 -->
<xbean name="RolenpcjiangliInfo">
	<variable name="awardTimes" type="int"/> //领取奖励次数
	<variable name="lastAwardTime" type="long"/> //上次领取奖励时间
</xbean>
<table name="rolenpcjiangliinfos" key="long" value="RolenpcjiangliInfo"  cacheCapacity="1024"/> key为角色id

<!-- 角色黑名单(屏蔽的玩家)列表信息 -->
<xbean name="RolePingBiRolesInfo">
	<variable name="pingBiRoles" type="map" key="long" value="long"/> //存储黑名单角色id
</xbean>
<table name="rolepingbirolesinfos" key="long" value="RolePingBiRolesInfo"  cacheCapacity="1024"/> key为角色id




<!-- 角色排行榜 start   -->
<xbean name="RoleRankNotifyTimeInfo">
	<variable name="lastTime" type="map" key="int" value="long" />  上次各个排行榜变化通知时间
</xbean>

<table name="roleranknotifytime" key="long" value="RoleRankNotifyTimeInfo" lock="rolelock" cacheCapacity="1024" />
<!-- 角色排行榜  end   -->

<!-- 幸运大转盘begin -->
    <xbean name="XinyunDaZhuanPan">
        <variable name="recharge" type="long" />  活动期间充值金额
        <variable name="stopBNYYNums" type="int" />   百年一遇停止 次数
        <variable name="awardBNYYNums" type="int" />  百年一遇领取次数
        <variable name="awardBNYYIndex" type="int" /> 百年一遇获取的奖励
        <variable name="stopQZNFNums" type="int" />   千载难逢停止 次数
        <variable name="awardQZNFNums" type="int" />  千载难逢领取次数
        <variable name="awardQZNFIndex" type="int" /> 千载难逢获取的奖励
		<variable name="awardItemId" type="int" />  奖励的道具Id
		<variable name="lastEndtime" type="long" /> 上次活动时间
    </xbean>
    <table name="xinyundazhuanpan" key="int" lock="userlock" value="XinyunDaZhuanPan" cacheCapacity="4096" />
	
	
    <xbean name="DaZhuanPanStatic">  活动期间大转盘信息统计
        <variable name="totalnums" type="int" />   获取总次数
        <variable name="daynums" type="int" />     当天获取次数
        <variable name="time" type="long" />       时间
    </xbean>
	<xbean name="DStatic">  活动期间大转盘信息统计
	    <variable name="bainian" type="map" key="int" value="DaZhuanPanStatic"/> 
		<variable name="qiannian" type="map" key="int" value="DaZhuanPanStatic"/> 
	    <variable name="lastEndtime" type="long" />
    </xbean>
	<table name="dazhuanpanstatic" key="int" value="DStatic" cacheCapacity="1" />
<!-- 幸运大转盘end -->

<!-- 符石消耗大转盘begin -->
    <xbean name="ConsumeDaZhuanPan">
        <variable name="totalConsume" type="long" />      活动期间消耗符石数
        <variable name="bfbzLeftNums" type="int" />       百发百中剩余次数
        <variable name="wsryLeftNums" type="int" />       万事如意剩余次数
		<variable name="awardItemId" type="int" />        奖励的Id
		<variable name="lastZtype" type="int" />          上次转盘类型
		<variable name="lastEndtime" type="long" />       上次活动时间
    </xbean>
    <table name="roleconsumedazhuanpan" key="long" value="ConsumeDaZhuanPan" lock="rolelock" cacheCapacity="1024" />
	
    <xbean name="ConsumeDaZhuanPanStatic">  活动期间大转盘信息统计
        <variable name="totalnums" type="int" />   获取总次数
        <variable name="daynums" type="int" />     当天获取次数
        <variable name="endtime" type="long" />    时间
    </xbean>
	<xbean name="ConsumeStatic">  活动期间大转盘信息统计
	    <variable name="baifa" type="map" key="int" value="ConsumeDaZhuanPanStatic"/> 
		<variable name="wanshi" type="map" key="int" value="ConsumeDaZhuanPanStatic"/> 
	    <variable name="lastEndtime" type="long" />
    </xbean>
	<table name="consumestatic" key="int" value="ConsumeStatic" cacheCapacity="1" />
<!-- 符石消耗大转盘end -->

<!-- 历史充值反馈活动begin -->
	<xbean name="RechargeHisBack">  活动期间大转盘信息统计
		<variable name="acculateDays"  type="int" /> 累计登陆天数
		<variable name="lastLoginTime" type="long" /> 上次登陆时间
		<variable name="activityEndTime" type="long" /> 结束时间
	    <variable name="awardStatus" type="int" />  0:没有领奖励; 1 : 已经领了
    </xbean>
	<table name="role2rechargehisback" key="long" lock="rolelock" value="RechargeHisBack" foreign="key:properties"  cacheCapacity="2048" cachehigh="1024" cachelow="512"/>
<!-- 历史充值反馈活动end -->


<!--每日任务 和 日积月累活动start-->
    <xbean name="AChieve">
       <variable name="currNumber" type="int"/> 当前次数
	   <variable name="total" type="int"/> 当前总量
	   <variable name="flag" type="int"/> 0=未完成 1=完成 2=已经领奖
    </xbean>
	
	<xbean name="RoleDayTaskInfo">
	    <variable name="activeTime" type="long"/> 每日更新时间
		<variable name="achievement" type="map" key="int" value="AChieve"/>每达成一项就要记录一项
	</xbean>
  	<table name="roledaytask"  key="long" lock="rolelock" value="RoleDayTaskInfo" cacheCapacity="2048" cachehigh="512" cachelow="256"/>每日任务信息表
	
    <xbean name="AccumulateChargeInfo">
	    <variable name="activeTime" type="long"/> 活动开始时间
		<variable name="dayFuShiNum" type="int"/> 每日充值需要查过这个数目
		<variable name="lastChargeTime" type="long"/> 上次充值时间
		<variable name="tadayChargeFushiNum" type="int"/> 今日充值符石数目
		<variable name="takeFirstAwardTime" type="long"/> 领取第一个奖励的时间
		<variable name="accumulateDays" type="int"/> 累积充值天数
		<variable name="achievementAward" type="map" key="int" value="int"/>key=天数 value=1 表示已经领奖
	</xbean>
  	<table name="accumulatecharge"  key="long" lock="rolelock" value="AccumulateChargeInfo" cacheCapacity="2048" cachehigh="512" cachelow="256"/>日积月累充值活动表
<!--每日任务 end-->

<!-- 日文版180天符石过期   -->
<xbean name="FuShiRecord">
	<variable name="addTime" type="long"  /> 增加的时间
	<variable name="currentNum" type="int"  /> 当前数量
</xbean>
	
<xbean name="RoleFuShiRecord">
	<variable name="records" type="vector" value="FuShiRecord" />
</xbean>
	
<table name="fushirecordtable" key="long" value="RoleFuShiRecord" cacheCapacity="4096" lock="rolelock"/>	

<!-- 签到模块开始 --> 
<xbean name="RegDay">
	<variable name="rewardFlag" type="int" /> 奖励标志(1-过期 2-已领取 3-未领取)
	<variable name="day" type="int"/>第几天
</xbean>
	
<xbean name="RegMonth">
	<variable name="dayMap" type="map" key="int" value="RegDay" />
	<variable name="suppRegNum" type="int"/> 补签次数
</xbean>
	
<xbean name="RegRec">
	<variable name="monthMap" type="map" key="int" value="RegMonth" /> 月Map
	<variable name="lastRegTime" type="long"/> 上次签到时间
</xbean>

<table name="regtbl" key="long" value="RegRec" cacheCapacity="4096" lock="rolelock" />
<!-- 签到结束 --> 

<xbean name="RoleDoubleChareInfo">
    <variable name="activeTime" type="long"/> 活动开始时间
	<variable name="achievement" type="map" key="int" value="int"/> value=1 表示充值过  商品的id -> flag
	<variable name="flag" type="int"/> 0=没有初始化过  1=初始化过 2=网页充值临时初始化
</xbean>

 <table name="roledoublecharge"  key="long" lock="rolelock" value="RoleDoubleChareInfo" cacheCapacity="2048" cachehigh="512" cachelow="256"/> 充值返还多倍 by changhao

 <xbean name="ActivityQuestion">
	<variable name="activityquestionstarttime" type="long"/> 活动答题开启时间 by changhao
	<variable name="questionids" type="list" value="int"/> 题目 by changhao
	<variable name="curquestionindex" type="int"/> 当前回答的问题 by changhao
	<variable name="curquestionstep" type="int"/> 当前回答的步骤 by changhao
	<variable name="answerrighttimes" type="int"/> 回答正确的次数 by changhao
	<variable name="totalanswernum" type="int"/> 总共回答的数量 by changhao
	<variable name="grabreward" type="int"/> 1是可以领取2是已经领取3是不能领取 by changhao
	<variable name="totalexp" type="int"/> 总经验 by changhao
	<variable name="totalmoney" type="int"/> 总金币 by changhao
	<variable name="helptimes" type="int"/> 帮助次数 by changhao
</xbean>

<table name="roleid2activityquestion" key="long" lock="rolelock" value="ActivityQuestion" persistence="MEMORY" cacheCapacity="2048" cachehigh="1024" cachelow="256"/> 活动答题 by changhao
 
 <xbean name="ChargeReturnProfit">
	<variable name="id" type="int"/>
	<variable name="value" type="int"/>
	<variable name="maxvalue" type="int"/>
	<variable name="status" type="int"/> 0是领取了1是未领取2是未到达 by changhao
 </xbean>
 
 <xbean name="EChargeReturnProfit">
	<variable name="returnprofitmap" type="map" key="int" value="ChargeReturnProfit"/>
 </xbean>

 <table name="roleid2chargereturnprofit"  key="long" lock="rolelock" value="EChargeReturnProfit" cacheCapacity="2048" cachehigh="512" cachelow="256"/> 充值返还利 by changhao

 <!-- NPC发奖励功能 start-->
 <xbean name="npcaward">
	<variable name="lasttime" type="long"/>上次领取时间
	<variable name="count" type="int"/>已经领取次数
	<variable name="totalcount" type="int"/>领取总次数
 </xbean>
 <xbean name="npcawardrecords">
	<variable name="records" type="map" key="int" value="npcaward"/>
 </xbean>
 <table name="role2npcawards"  key="long" lock="rolelock" value="npcawardrecords" cacheCapacity="2048" cachehigh="512" cachelow="256"/>
 <!-- NPC发奖励功能 end-->
  
 <!--伙伴系统 start-->
	<xbean name="HuoBanInfo">
		<variable name="id" type="int"/>			编号
		<variable name="level" type="int"/>	    	等级
		<variable name="color" type="int"/>	    	颜色 
		<variable name="infight" type="int"/> 		是否参战,1为参战
		<variable name="state" type="int"/> 		是否解锁, 0为未解锁; 1为永久使用; 2为本周免费; 3为免费剩余天数
		<variable name="type" type="int"/>          伙伴类型 法攻,物攻,辅助,治疗,封印
		<variable name="times" type="long"/>			到期时间;当state为1时,此值无效
		<!-- <variable name="bfp" type="BasicFightProperties"/>  一级属性
		<variable name="effects" type="map" key="int" value="float" /> key = effect type id
		<variable name="finalattrs" type="map" key="int" value="float" capacity="50"/> key = attr type
		<variable name="buffhuoban" type="BuffAgent"/>	 buff
		<variable name="skills" type="vector" value="int"/> 			huoban拥有的战斗技能
		<variable name="skillmaster" type="int"/>   精通技能
		<variable name="battleai" type="vector" value="int"/> huoban拥有的战斗ai
		<variable name="levelfactor" type="float"/>   技能等级系数
		<variable name="levelconstant" type="int"/>   技能等级常数 -->
	</xbean>
	<xbean name="HuoBanColumn">
		<variable name="fighthuobans" type="vector" value="int"/>  所有参战伙伴
		<variable name="huobans" type="map" key="int" value="HuoBanInfo" capacity="15"/>
		<variable name="week" type="int"/>			当前周数,计算伙伴状态的时候使用
	</xbean>
	<table name="huobancolumns" key="long" value="HuoBanColumn" foreign="key:properties" cacheCapacity="10240" cachehigh="512" cachelow="256" lock="rolelock"/>
  
	<xbean name="HuoBanZhenrongInfo">
		<variable name="zhenfa" type="int"/>  阵容光环编号
		<variable name="huoban" type="vector" value="int"/>  value-伙伴id
	</xbean>
	<xbean name="HuoBanZhenrong">
		<variable name="current" type="int"/>	当前阵容编号
		<variable name="zhenrong" type="map" key="int" value="HuoBanZhenrongInfo"/> key-阵容编号(1,2,3)
	</xbean>
	<table name="huobanzhenrongs" key="long" value="HuoBanZhenrong" foreign="key:properties" cacheCapacity="10240" lock="rolelock"/>
	
	<xbean name="HuoBanshuxing">
		<variable name="level" type="int"/>	    	等级
		<variable name="effects" type="map" key="int" value="float" /> key = effect type id
		<variable name="finalattrs" type="map" key="int" value="float" capacity="50"/> key = attr type
		<variable name="skills" type="vector" value="int"/> 			huoban拥有的战斗技能
		<variable name="skillmaster" type="int"/>   精通技能
		<variable name="battleai" type="vector" value="int"/> huoban拥有的战斗ai
		<variable name="levelfactor" type="float"/>   技能等级系数
		<variable name="levelconstant" type="int"/>   技能等级常数
	</xbean>
	<xbean name="HuoBanShuxingLevel">
		<variable name="huobans" type="map" key="int" value="HuoBanshuxing" capacity="1024"/> key 为等级id,value为等级对应的伙伴信息
	</xbean>
	<table name="huobanproperty" key="int" value="HuoBanShuxingLevel" persistence="MEMORY" cacheCapacity="65535"/> key 为伙伴id 此表不需要加任何锁
 <!--伙伴系统 end-->
 
 <!--角色购买道具记录start-->
 <xbean name="NumberAndTime">
	<variable name="number" type="int"/>购买或售卖次数
	<variable name="time" type="long" />最后购买或售卖时间
 </xbean>
 <xbean name="RoleBuyGoodsLimit">
	<variable name="daylimit" type="map" key="int" value="NumberAndTime"/> key=goodsid日限购
	<variable name="weeklimit" type="map" key="int" value="NumberAndTime"/> 周限购
	<variable name="monthlimit" type="map" key="int" value="NumberAndTime"/> 月限购
 </xbean>
 <table name="rolebuygoodslimits" key="long" value="RoleBuyGoodsLimit" foreign="key:properties" cacheCapacity="2048" cachehigh="512" cachelow="256" lock="rolelock"/>
 <xbean name="RoleSaleGoodsLimit">
	<variable name="daylimit" type="map" key="int" value="NumberAndTime"/> 日限售
	<variable name="weeklimit" type="map" key="int" value="NumberAndTime"/> 周限售
	<variable name="monthlimit" type="map" key="int" value="NumberAndTime"/> 月限售
 </xbean>
 <table name="rolesalegoodslimits" key="long" value="RoleSaleGoodsLimit" foreign="key:properties" cacheCapacity="2048" cachehigh="512" cachelow="256" lock="rolelock"/>
 <!--角色购买道具记录end-->
 <!--系统购买商品数量记录start-->
 <xbean name="GoodsBusiness">
	<variable name="buynum" type="long"/>本期购买的数量
	<variable name="salenum" type="long"/>本期售卖的数量
	<variable name="lastnum" type="long"/>上期成交量
	<variable name="priorperiodprice" type="int" defatult="0"/>上期价格
	<variable name="price" type="int"/>商品价格
	<variable name="count" type="int"/>周期成交量小于等于零的次数,降价后次数清零重新计数
 </xbean>
 <xbean name="NpcSaleBusiness">
	<variable name="goodsmap" type="map" key="int" value="GoodsBusiness"/> key=goodsid
	<variable name="isActive" type="short" defatult="0"/>是否统计,默认为0不启动,1是启动
	<variable name="time" type="long" />最后统计时间
 </xbean>
 <table name="npcsalebusinesstab" key="long" value="NpcSaleBusiness" foreign="key:properties" cacheCapacity="2048" cachehigh="512" cachelow="256" lock="rolelock"/>
 <!--系统购买商品数量记录end-->
 
 <!--摆摊start-->
 <table name="market" key="long" value="Bag" foreign="key:properties" cacheCapacity="70240" cachehigh="512" cachelow="256" lock="rolelock"/>摆摊道具容器表
 <table name="marketpet" key="long" value="Pets" foreign="key:properties" cacheCapacity="70240" cachehigh="512" cachelow="256" lock="rolelock"/>摆摊宠物容器表
 
 <xbean name="LogBean">
 	<variable name="itemid" type="int"/> 
 	<variable name="level" type="int"/>
 	<variable name="number" type="int"/>
 	<variable name="money" type="int"/>
 </xbean>
 <xbean name="MarketTradeLog">
	<variable name="buylog" type="vector" value="LogBean"/> 买记录
	<variable name="salelog" type="vector" value="LogBean"/> 卖记录
 </xbean>
 <table name="markettradelogtab" key="long" value="MarketTradeLog" foreign="key:properties" cacheCapacity="70240" cachehigh="512" cachelow="256" lock="rolelock"/>买卖日志表
 
 <xbean name="MarketFloatingGoods">
 	<variable name="floatingmin" type="float" defatult="0"/>价格下限
	<variable name="floatingmax" type="float" defatult="0"/>价格上限
	<variable name="floatingprice" type="float" defatult="0"/>浮动价格系数
 	<variable name="basehangordernum" type="int" defatult="0"/>基准挂单量
 	<variable name="basesalenum" type="int" defatult="0"/>基准成交量
	<variable name="hangordernum" type="int" defatult="0"/>挂单量
	<variable name="salenum" type="int" defatult="0"/>当期成交量
	<variable name="priorperiodprice" type="int" defatult="0"/>上期价格
	<variable name="price" type="int" defatult="0"/>当前价格
	<variable name="totalmoney" type="int" defatult="0"/>本期售卖总金额
 </xbean>
 
 <table name="marketfloatingtab" key="string" value="MarketFloatingGoods" cacheCapacity="70240" cachehigh="512" cachelow="256"/>摆摊销售表key=itemid
 
 <xbean name="MarketDbData">
 	<variable name="normalList" type="vector" value="binary"/>普通道具
 	<variable name="equpList" type="vector" value="binary"/>装备道具
 	<variable name="petList" type="vector" value="binary"/>宠物道具
 </xbean>
 
 <table name="marketdbtab" key="string" value="MarketDbData" cacheCapacity="70240" cachehigh="512" cachelow="256"/>摆摊数据表key="db"
 
 <xbean name="AttentionGoodsBean">
 	<variable name="id" type="string"/>物品类型+数据库id
 	<variable name="expiretime" type="long"/>物品过期时间
 </xbean> 
 
 <xbean name="AttentionGoods">
	<variable name="attentiongoodsbeans" type="vector" value="AttentionGoodsBean"/>数据库表中的id,关注数量最多8个
 </xbean>

 <table name="marketattentiongoodstab" key="long" value="AttentionGoods" cacheCapacity="70240" cachehigh="512" cachelow="256"/>角色关注商品表

 <xbean name="AttentionRole">
	<variable name="roleIds" type="set" value="long"/>角色id
 </xbean>

 <table name="marketattentionroletab" key="string" value="AttentionRole" cacheCapacity="70240" cachehigh="512" cachelow="256"/>商品被角色关注的表
 
 <xbean name="NormalItem">
 	<variable name="id" type="long" defatult="0"/>主键id
 	<variable name="firstno" type="int" defatult="0"/>一级菜单
 	<variable name="twono" type="int" defatult="0"/>二级菜单
 	<variable name="threeno" type="int" defatult="0"/>三级菜单
 	<variable name="uniquid" type="long" defatult="0"/>道具唯一id
 	<variable name="key" type="int" defatult="0"/>背包中key
 	<variable name="itemid" type="int" defatult="0"/>道具id
 	<variable name="extid" type="long" defatult="0"/>道具属性扩展id
 	<variable name="name" type="string"/>道具名称
 	<variable name="roleid" type="long" defatult="0"/>拥有者id
 	<variable name="level" type="int" defatult="0"/>道具等级
 	<variable name="number" type="int" defatult="0"/>道具数量
 	<variable name="price" type="int" defatult="0"/>道具价格
 	<variable name="attentionnumber" type="int" defatult="0"/>关注数量
 	<variable name="showtime" type="long" defatult="0"/>公示时间
 	<variable name="expiretime" type="long" defatult="0"/>到期时间
 </xbean>
 
 <table name="normaltab" key="long" value="NormalItem" cacheCapacity="70240" cachehigh="512" cachelow="256" autoIncrement="true"/>普通道具表
 
 <xbean name="EquipItem">
 	<variable name="id" type="long" defatult="0"/>主键id
 	<variable name="firstno" type="int" defatult="0"/>一级菜单
 	<variable name="twono" type="int" defatult="0"/>二级菜单
 	<variable name="threeno" type="int" defatult="0"/>三级菜单
 	<variable name="uniquid" type="long" defatult="0"/>道具唯一id
 	<variable name="key" type="int" defatult="0"/>背包中key
 	<variable name="itemid" type="int" defatult="0"/>道具id
 	<variable name="extid" type="long" defatult="0"/>道具属性扩展id
 	<variable name="name" type="string"/>道具名称
 	<variable name="roleid" type="long" defatult="0"/>拥有者id
 	<variable name="level" type="int" defatult="0"/>道具等级
 	<variable name="number" type="int" defatult="0"/>道具数量
 	<variable name="price" type="int" defatult="0"/>道具价格
 	<variable name="attentionnumber" type="int" defatult="0"/>关注数量
 	<variable name="showtime" type="long" defatult="0"/>公示时间
 	<variable name="expiretime" type="long" defatult="0"/>到期时间
 	<variable name="attr" type="map" key="int" value="int"/> 基础属性
 	<variable name="addattr" type="map" key="int" value="int"/> 附加属性
 </xbean>
 
 <table name="equiptab" key="long" value="EquipItem" cacheCapacity="70240" cachehigh="512" cachelow="256" autoIncrement="true"/>装备道具表
 
 <xbean name="PetItem">
 	<variable name="id" type="long" defatult="0"/>主键id
 	<variable name="firstno" type="int" defatult="0"/>一级菜单
 	<variable name="twono" type="int" defatult="0"/>二级菜单
 	<variable name="threeno" type="int" defatult="0"/>三级菜单
 	<variable name="uniquid" type="long" defatult="0"/>道具唯一id
 	<variable name="key" type="int" defatult="0"/>背包中key
 	<variable name="itemid" type="int" defatult="0"/>道具id
 	<variable name="extid" type="long" defatult="0"/>道具属性扩展id
 	<variable name="name" type="string"/>道具名称
 	<variable name="roleid" type="long" defatult="0"/>拥有者id
 	<variable name="level" type="int" defatult="0"/>道具等级
 	<variable name="number" type="int" defatult="0"/>道具数量
 	<variable name="price" type="int" defatult="0"/>道具价格
 	<variable name="attentionnumber" type="int" defatult="0"/>关注数量
 	<variable name="showtime" type="long" defatult="0"/>公示时间
 	<variable name="expiretime" type="long" defatult="0"/>到期时间
 	<variable name="attack" type="int" defatult="0"/>攻击
 	<variable name="defend" type="int" defatult="0"/>防御
 	<variable name="speed" type="int" defatult="0"/>速度
 	<variable name="magicattack" type="int" defatult="0"/>法术攻击
 	<variable name="magicdef" type="int" defatult="0"/>法术防御
 	<variable name="attackapt" type="int" defatult="0"/>攻击资质
 	<variable name="defendapt" type="int" defatult="0"/>防御资质
 	<variable name="phyforceapt" type="int" defatult="0"/>体力资质
 	<variable name="magicapt" type="int" defatult="0"/>法力资质
 	<variable name="speedapt" type="int" defatult="0"/>速度资质
 	<variable name="dodgeapt" type="int" defatult="0"/>躲闪资质
 	<variable name="growrate" type="int" defatult="0"/>成长率
 	<variable name="skills" type="vector" value="int"/>速度资质
 	<variable name="petscore" type="int" defatult="0"/>宠物评分
 </xbean>
 
 <table name="pettab" key="long" value="PetItem" cacheCapacity="70240" cachehigh="512" cachelow="256" autoIncrement="true"/>宠物道具表
 
 <!--摆摊end-->
 
 <!--挂机start-->
 <xbean name="HookData">
	<variable name="cangetdpoint" type="short" defatult="0"/>可领取双倍点数
	<variable name="getdpoint" type="short" defatult="0"/>已领取双倍点数
	<variable name="isautobattle" type="boolean" defatult="false"/>是否自动战斗
	<variable name="charoptype" type="short" defatult="1"/>人物操作类型
	<variable name="charopid" type="int" defatult="0"/>人物操作id
	<variable name="petoptype" type="short" defatult="1"/>宠物操作类型
	<variable name="petopid" type="int" defatult="0"/>宠物操作id
	<variable name="offlineexp" type="long" defatult="0"/>离线经验
	<variable name="lastgettime" type="long"/> 上次系统发放双倍点数时间
 </xbean>
 <table name="rolehook" key="long" value="HookData" foreign="key:properties" cacheCapacity="2048" cachehigh="512" cachelow="256" lock="rolelock"/>
 <!--挂机end-->
 
 <table name="rolelockscreen" type="map" key="long" value="boolean" default="false" cacheCapacity="10240" lock="rolelock" persistence="MEMORY"/> key是roleid,value是是否需要锁屏自动战斗状态
 
 <!--角色道具使用记录 start-->
 <xbean name="ItemUseCount"> 道具使用统计
	<variable name="itemid" type="int"/> 道具id
	<variable name="usetimes" type="int"/> 使用次数
	<variable name="lastusetime" type="long"/> 上次使用时间
 </xbean>
 <xbean name="ItemUse">
	<variable name="iteminfo" type="map" key="int" value="ItemUseCount"/> 每个道具的使用次数
 </xbean> 
 <table name="roleuseitemcount" key="long" value="ItemUse" foreign="key:properties" cacheCapacity="6000" cachehight="512" cachelow="256" lock="rolelock"/>
 <!--角色道具使用记录 end-->
 
 <!--角色捡宝箱次数 start--> 
 <xbean name="BaoXiangInfo">
	<variable name="opentimes" type="int"/> 拾取次数
	<variable name="lastopentime" type="long"/> 上次拾取时间
 </xbean> 
 <table name="rolekaibaoxiang" key="long" value="BaoXiangInfo" foreign="key:properties" cacheCapacity="6000" cachehight="512" cachelow="256" lock="rolelock"/>
 <!--角色捡宝箱次数 end--> 
 
 <!--服务器开服相关记录-->
 <xbean name="ServiceInfo">
	<variable name="year" type="int" defatult="1973"/>年
	<variable name="weeks" type="int" defatult="0"/>当前开服第几周(今年的第几周)
	<variable name="activerecommend" type="int" default="1"/>当前推荐活动
 </xbean>
 <xbean name="WeekIndex">
	<variable name="index" type="int" defatult="0"/>伙伴免费轮换索引
	<variable name="instanceindex" type="int" defatult="0"/>副本轮换索引
 </xbean>
 <table name="serviceinfos" key="int" value="ServiceInfo" cacheCapacity="128"/> 服务器开服状态(key 服务器id)
 <table name="weekindexs" key="int" value="WeekIndex" cacheCapacity="128"/> 周索引
 <table name="roleid2instanceid" key="long" value="long" lock="rolelock" cacheCapacity="10240" persistence="MEMORY"/> key是roleid value是角色所在副本id
 <!--服务器开服相关记录end-->
 
 <TableSysConf name="_sys_" cacheCapacity="1" cachehigh="512" cachelow="256"/>
	<UniqNameConf localId="UN_LOCAL_ID">
		<XioConf name="mkdb.util.UniqName">
			<Manager name="Client" keepSize="1" maxSize="1">
				<Coder>
					<Rpc class="mkdb.util.UniqName$Allocate"/>
					<Rpc class="mkdb.util.UniqName$Confirm"/>
					<Rpc class="mkdb.util.UniqName$Release"/>
					<Rpc class="mkdb.util.UniqName$Exist"/>
					<Rpc class="mkdb.util.UniqName$AllocateId"/>
					<Rpc class="mkdb.util.UniqName$ReleaseId"/>
				</Coder>
				<Connector remoteIp="UNIQNAME_SERVER_IP" remotePort="22200" sendBufferSize="16384" receiveBufferSize="16384" tcpNoDelay="true" inputBufferSize="131072" outputBufferSize="131072"/>
			</Manager>
		</XioConf>
	</UniqNameConf>  

</xdb>
