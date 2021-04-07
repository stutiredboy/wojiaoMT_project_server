
package fire.pb.skill.liveskill;




import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.item.GroceryItemShuXing;
import fire.pb.main.ConfigManager;
import fire.pb.skill.SSkillError;
import fire.pb.skill.SkillConstant;
import fire.pb.skill.SkillRole;
import fire.pb.util.BagUtil;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveSkillMakeStuff__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囨繝寰锋澘锟窖囧箯閻戣姤鐓ラ柡鍥悘鑼拷瑙勬礈閸忔﹢銆佸锟介幃鈺佲枔閹稿巩锕傛⒒閸屾瑧顦﹂柟纰卞亰瀹曨垶顢曢敃锟界壕褰掓煠婵劕锟芥绋夊澶嬬叆闁绘洖鍊圭�氾拷?
 * @author changhao
 *
 */
public class CLiveSkillMakeStuff extends __CLiveSkillMakeStuff__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure livemakstuff = new mkdb.Procedure()
		{
			@Override
			/*闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸崹楣冨箛娴ｅ湱绋佺紓鍌氬�烽悞锕傗�﹂崶鈺冧笉濡わ絽鍟悡銉╂煟閺傚灝顣抽柣顓熺懇閺屸�崇暆鐎ｎ剛鐦堥梺杞扮劍閹歌崵绮嬮幒鏃撴嫹閿濆骸浜濇繛鍛矒濮婅櫣鍖栭弴鐐测拤闂佸憡姊圭敮鐐烘嚍鏉堛劎绡�婵﹩鍘搁幏娲⒑閸涘﹦鈽夐柨鏇缁骞樼紒妯猴拷鍨叏濡厧甯堕柡瀣ㄥ�濋弻娑㈡偐鐠囇嗗惈闂佽桨鐒﹂幑鍥极閹剧粯鏅搁柨鐕傛嫹 team->roleid->match by changhao*/
			protected boolean process()
			{	
				fire.pb.item.GroceryItemShuXing config = (GroceryItemShuXing) fire.pb.item.Module.getInstance().getItemManager().getAttr(itemid);
				if (config == null)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return true;						
				}
				
				int skillid = LiveSkillManager.getInstance().GetMakeStuffSkillIdByItemId(config);
				if (skillid == 0)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return true;						
				}
				
				SkillRole skillrole = new SkillRole(roleid);
				
				xbean.LiveSkill liveskill = skillrole.getLiveSkills().get(skillid);	//闂傚倸鍊峰ù鍥敋瑜嶉湁闁绘垼妫勯弸渚�鏌涘☉姗堟敾婵炲懐濮垫穱濠囧Χ閸涱喖娅￠梺璺ㄥ枙濡嫰宕弶鎴犳殾闁靛ň鏅涚痪褔鏌熺�电浠︾悮锝夋⒑鐠囧弶鎹ｆ繛鍛灲楠炲繘鎮滈懞銉у幈闂佸搫娲㈤崝灞炬櫠椤旀祹褰掓偐閾忣偁浠㈠┑顔硷龚濞咃絿妲愰幒鎳崇喖鎳￠妶鍛辈闂傚倷鑳堕、濠囶敋濠婂懏宕叉繝闈涙矗缁诲棝鏌ｉ姀鐘冲暈闁稿瀚伴弻娑滅疀濮橆兛姹楅梺鍛婎焽閺佽顫忛搹瑙勫磯闁靛鍎查悵銏ゆ⒑閻熸澘娈╅柟鍑ゆ嫹?闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲歌箛鏃傜彾闁哄洢鍩勯弫鍥煏韫囨洖啸闁哄睙鍐炬富闁靛牆妫楁慨褔姊婚崟顐㈩伃鐎规洘鍨挎俊鑸靛緞鐎ｎ剙骞嶉梺璇叉捣閺佹悂鈥﹂崼婵囨瘎濠电姷顣藉Σ鍛村磻閹捐绠柨鐕傛嫹? by changhao			
				if (liveskill == null)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.SkillLevelNotEnough));
					return true;					
				}
				
				int skilllevel = liveskill.getLevel();
				
				int needlevel = LiveSkillManager.getInstance().GetMakeStuffNeedLevelByItemId(config);
				
				if (skilllevel < needlevel)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.SkillLevelNotEnough));
					return true;						
				}
							
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(roleid, skillid, 
						needlevel,"闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛濠呭煐閹便劌螣閹稿海銆愮紓浣哄У濠㈡鐏冮梺鎸庣箓閹冲酣寮搁妶澶嬬厸濞达絿顭堥顓㈡煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�", YYLoggerTuJingEnum.tujing_Value_liveskillcost, false);
				
				if (energyenough == false) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓闁搞劌鍊块弻锝夊閻樺啿鏆堥梺绋款儏椤戝寮婚妸鈺傚亞闁稿本绋戦锟�?濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氬綊鏌熼崜褏甯涢柛濠傛健閺屻劑寮撮悙璇ф嫹閸涘鏀伴梻鍌欒兌缁垶寮婚妸鈺佽Е閻庯綆鍠楅崑鍌炴煛閸ャ儱鐏柣鎾卞劦閺岋綁寮撮悙璇ф嫹閸︻叏鎷峰鐐? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.EnergyNotEnough));
					return true;						
				}
				
				int added = BagUtil.addItem(roleid, itemid, itemnum, LiveSkillManager.MakeStuff, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_zhizuofu, 1, true);
				
				if (itemnum != added)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.UnkownError));
					return false;						
				}
				
				SLiveSkillMakeStuff msg = new SLiveSkillMakeStuff();
				msg.ret = 0;
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);
				
				return true;
			}
			
		};
		livemakstuff.submit();	
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800517;

	public int getType() {
		return 800517;
	}

	public int itemid; // 物品的ID by changhao
	public int itemnum; // 物品数量 by changhao

	public CLiveSkillMakeStuff() {
	}

	public CLiveSkillMakeStuff(int _itemid_, int _itemnum_) {
		this.itemid = _itemid_;
		this.itemnum = _itemnum_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(itemid);
		_os_.marshal(itemnum);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		itemid = _os_.unmarshal_int();
		itemnum = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLiveSkillMakeStuff) {
			CLiveSkillMakeStuff _o_ = (CLiveSkillMakeStuff)_o1_;
			if (itemid != _o_.itemid) return false;
			if (itemnum != _o_.itemnum) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += itemid;
		_h_ += itemnum;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(itemid).append(",");
		_sb_.append(itemnum).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CLiveSkillMakeStuff _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = itemid - _o_.itemid;
		if (0 != _c_) return _c_;
		_c_ = itemnum - _o_.itemnum;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

