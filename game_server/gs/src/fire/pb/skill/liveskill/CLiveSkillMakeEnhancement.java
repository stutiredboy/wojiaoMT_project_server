
package fire.pb.skill.liveskill;
import java.util.ArrayList;
import java.util.List;

import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.item.AddItemResult;
import fire.pb.item.BagTypes;
import fire.pb.item.Pack;
import fire.pb.talk.MessageMgr;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveSkillMakeEnhancement__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌涘┑鍕姷闁瑰嘲鍢查～婵嬫偂鎼粹槅娼鹃梻浣芥硶閸犳洘鎱ㄩ妶澶嬪剹妞ゆ洩鎷风�规洩绻濋獮搴ㄦ寠婢跺瞼鏆繝鐢靛仜濡﹥绂嶅┑瀣；闁告洦鍨遍悡鐔兼煙閹规劖鐝柟鐧哥稻閵囧嫰鏁傜拠韫枈濠殿喖锕ュ钘夌暦椤愶箑绀嬫い鎾跺亹閸欙繝姊绘担鑺ャ�冪紒锟芥笟锟介獮妤�顭ㄩ崨顓炵亰濠电偛妫欓幐濠氬疾閹间焦鐓ラ柣鏇炲�圭�氾拷
 * @author changhao
 *
 */
public class CLiveSkillMakeEnhancement extends __CLiveSkillMakeEnhancement__ {
	@Override
	protected void process() {
		// protocol handle

		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure liveskillmakeenhancement = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				xbean.Properties prop = xtable.Properties.select(roleid);
				int school = prop.getSchool();
				
				int skilllevel = LiveSkillManager.getInstance().GetEnhanceLevelBySchool(roleid, school);//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愯ぐ鎺戠；閻庯綆鍠楅悡娑㈡煕閵夈垺娅呴弽鈥愁渻閵堝棗濮冪紒顔界懃椤繐煤椤忓秵鏅㈤梺璺ㄥ枔閺咁偆鍒掗弮鍫熷仺缂佸鐏濋幆鐐烘⒑缁嬭法鐏遍柛瀣仱瀹曟劙宕奸弴鐔哄幗闂佸綊鍋婇崹杈╂兜閹灐鐟邦煥閸愵亞楔闂佸搫鐭夌紞渚�骞冮姀鈽嗘Ч閹艰揪鍙婇妸鈺傗拺闁告繂瀚悘閬嶆煕閻樺磭澧电�殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�?闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲歌箛鏃傜彾闁哄洢鍩勯弫鍥煏韫囨洖啸闁哄睙鍐炬富闁靛牆妫楁慨褔姊婚崟顐㈩伃鐎规洘鍨挎俊鑸靛緞鐎ｎ剙骞嶉梺璇叉捣閺佹悂鈥﹂崼婵囨瘎濠电姷顣藉Σ鍛村磻閹捐绠柨鐕傛嫹?  by changhao
				if (skilllevel == 0)
				{
					LiveSkillManager.logger.debug("CLiveSkillMakeEnhancement skilllevel error:" + roleid);
					return true;
				}
				
				int liveskillid = LiveSkillManager.getInstance().GetEnhanceLiveSkillBySchool(school);
				int itemid = LiveSkillManager.getInstance().GetEnhanceItemIdBySchool(school);
							
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(roleid, 
						liveskillid, skilllevel,"闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌涘┑鍕姷闁瑰嘲鍢查～婵嬫偂鎼粹槅娼鹃梻浣芥硶閸犳洘鎱ㄩ妶澶嬪剹妞ゆ洩鎷风�规洩绻濋獮搴ㄦ寠婢跺瞼鏆繝鐢靛仜濡﹥绂嶅┑瀣柧闁归棿鐒﹂悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�", YYLoggerTuJingEnum.tujing_Value_fumo, false);
				
				if (energyenough == false) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓闁搞劌鍊块弻锝夊閻樺啿鏆堥梺绋款儏椤戝寮婚妸鈺傚亞闁稿本绋戦锟�?濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氬綊鏌熼崜褏甯涢柛濠傛健閺屻劑寮撮悙璇ф嫹閸涘鏀伴梻鍌欒兌缁垶寮婚妸鈺佽Е閻庯綆鍠楅崑鍌炴煛閸ャ儱鐏柣鎾卞劦閺岋綁寮撮悙璇ф嫹閸︻叏鎷峰鐐? by changhao
				{
					java.util.List<String> parameters = new java.util.ArrayList<String>();
					String s = Integer.toString(LiveSkillManager.getInstance().NeedEnergy(liveskillid, skilllevel));
					parameters.add(s);
					MessageMgr.psendMsgNotify(roleid, 143432, parameters);
					return true;						
				}							
				
				Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, false);
								
				SLiveSkillMakeEnhancement msg = new SLiveSkillMakeEnhancement();
				
				fire.pb.item.groceries.AttrUpItem item = (fire.pb.item.groceries.AttrUpItem)fire.pb.item.Module.getInstance().getItemManager().genItemBase(itemid, 1);
				item.GenAttr(skilllevel);
				
				if (bag.isFull())
				{
					fire.pb.item.ItemMaps tempBag = fire.pb.item.Module.getInstance().getItemMaps(roleid, BagTypes.TEMP, false);
					if (tempBag.doAddItem(item, -1, LiveSkillManager.Enhancement, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_fumoget, 2) != AddItemResult.SUCC)
					{
						return false;
					}
				}
				else
				{
					if(bag.doAddItem(item, -1, LiveSkillManager.Enhancement, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_fumoget, 2) != AddItemResult.SUCC)
					{
						return false;
					}						
				}
				
				List<String> param = new ArrayList<String>();
				param.add(item.getName());
				param.add("ffffff00");
				MessageMgr.psendMsgNotify(roleid, 150107, param);				
				mkdb.Procedure.psendWhileCommit(roleid, msg);
				
				return true;
			}
		};
		
		liveskillmakeenhancement.submit();			
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800525;

	public int getType() {
		return 800525;
	}


	public CLiveSkillMakeEnhancement() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLiveSkillMakeEnhancement) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CLiveSkillMakeEnhancement _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

