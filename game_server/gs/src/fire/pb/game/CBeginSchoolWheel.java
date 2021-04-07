
package fire.pb.game;
import java.util.ArrayList;
import java.util.List;

import fire.pb.team.TeamManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CBeginSchoolWheel__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CBeginSchoolWheel extends __CBeginSchoolWheel__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid <= 0) return;
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				TeamManager.getTeamByRoleId(roleid);//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐婵犵绻濆褑鐏掗梺绋跨箳閳峰牓宕戦妸銉㈡斀妞ゆ梹鏋绘笟娑㈡煕鎼达絾鏆柡浣瑰姈瀵板嫮锟斤綆鍋呴悵鏇㈡⒒娴ｈ棄袚闁挎碍銇勯敂璺ㄧ煓鐎规洜鏁婚弫鎾绘晸閿燂拷?
				List<Long> list = new ArrayList<Long>();
				list.add(roleid);
				lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, list));//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐婵犵绻濆褑鐏掗梺鍏肩ゴ閺呮繈鎮為崗鑲╃閺夊牆澧界粔顒佺箾閸滃啰鎮肩紒顔肩墛缁绘繈宕堕妸銉嫹閻㈠憡鐓ユ繝闈涙椤庢鏌＄�ｎ偆銆掔紒杈ㄥ浮閺佹挻绂掔�ｎ亪鍞跺銈庡亽閸犳锟芥俺顫夐〃銉╂倷閼碱兛铏庨梺鍛婃⒐瀹�鎼佸蓟閿濆憘鏃�鎷呴搹鍦帎婵＄偑鍊ら崢鐓幟洪銏犳瀬闁瑰墽绮崑鎰拷瑙勬礀濞层倝鐛锟藉缁樻媴閼恒儳銆婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�?
				xbean.SchoolWheel schoolWheel = xtable.Openschoolwheeltable.get(roleid);
				if (schoolWheel == null) {
					schoolWheel = xbean.Pod.newSchoolWheel();
					xtable.Openschoolwheeltable.insert(roleid, schoolWheel);
				}
				
				int itemIndex = GameManager.getInstance().getAwardItemIndex(GameManager.SCHOOLWHEEL);
				if (itemIndex == -1) {
					return false;
				}
				
				schoolWheel.setItemindex(itemIndex);
				schoolWheel.setAwardid(GameManager.SCHOOLWHEEL);
				
				//TODO 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔鏌ユ晸閽樺锟藉潡銆佸▎鎾崇鐟滃繘藝椤栨稓绠鹃弶鍫濆⒔閹偐鐥鐐靛煟鐎殿喚顭堥鍏煎緞婵犲嫷鍟囨繝鐢靛剳缂嶅棝宕滃▎鎾村�舵い蹇撳閺�鑺ャ亜閺冨倹娅曢柣顓烆儔閺屾洟宕惰椤忣厽顨ラ悙鏉戞诞妤犵偛顑呴埞鎴﹀箻閺夋埈浼撻梻渚�娼荤�靛矂宕㈡總鏉嗗顫濋懜鐢靛幍闂傚倸鍊搁顓㈠礉瀹ュ鐓熼柟鎹愭硾瀛濋柧缁樼墵閺屻劑寮村鍗炲缂佺虎鍘兼晶搴ｆ閹烘惟闁靛绠戞禒鎾⒑閸濆嫭婀伴柣鈺婂灦閸ㄩ箖鏁冮崒姘鳖唺闂佸湱鍋撻崜姘閿燂拷
				fire.pb.item.Pack bag = new fire.pb.item.Pack(roleid, false);
				long ret = bag.subCurrency(-60, MoneyType.MoneyType_ProfContribute, "schoolwheel", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_zhuanpan, 0);
				if (ret == 0)
					return false;
				
				SBeginSchoolWheel beginWheel = new SBeginSchoolWheel();
				beginWheel.wheelindex = itemIndex;
				
				mkdb.Procedure.psendWhileCommit(roleid, beginWheel);
				
				return true;
			}
			
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810363;

	public int getType() {
		return 810363;
	}


	public CBeginSchoolWheel() {
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
		if (_o1_ instanceof CBeginSchoolWheel) {
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

	public int compareTo(CBeginSchoolWheel _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

