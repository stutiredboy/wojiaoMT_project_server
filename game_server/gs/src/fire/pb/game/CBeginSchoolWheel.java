
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
				TeamManager.getTeamByRoleId(roleid);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗娉涢埞鎴︽偐濞堟寧娈扮紓浣虹帛缁诲倿鈥﹂崶顏嶆▉闂佽绻戠敮鈥愁潖閾忓湱鐭欓悹鎭掑妿椤斿﹪姊洪崘鎻掓Щ闁绘鎸搁悾鐑藉箣閿曪拷鎯熼梺闈涱槶閸ㄦ椽寮敓鑺ヤ繆閻愵亜锟芥牕顫忚ぐ鎺戝嚑缂備焦顭囬悷瑙勭箾閹存瑥鐏柣鎾存礋楠炴牗娼忛崜褏蓱闂佸搫妫崜鐔煎蓟閳╁啯濯撮柣鐔告緲椤秹鎮楅崹顐ｇ凡閻庢凹鍣ｉ弫鎾诲棘閵堝洨校闂佺顑呴幊姗�骞冮悽绋垮嵆闁靛繆妾ч幏缁樼箾鏉堝墽绉俊顐㈠椤ｅ潡姊绘担鐟邦嚋缁炬澘绉规俊鐢稿礋椤栨稒娅嗛柣鐘充航閸斿酣鎮￠幘缁樺�甸悷娆忓缁�鍫ユ煛娴ｅ壊鐓肩�殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�?
				List<Long> list = new ArrayList<Long>();
				list.add(roleid);
				lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, list));//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗娉涢埞鎴︽偐濞堟寧娈扮紓浣虹帛缁诲倿鈥﹂崶顏嶆▉闂佽绻戠敮鈥愁潖濞差亜绀傞柤娴嬫杺閸嬬偤姊洪崫鍕櫤缂佽鐗撻獮鍐倷閸濆嫮顦ч梺鍏肩ゴ閺呮繈顢欓弴銏＄厸濠㈣泛锕︽晶鏇烆熆瑜忛弲顐ゅ垝閺冨牜鏁嗗ù锝堟椤旀洟姊洪崨濠勭煀闁哥喍鍗抽獮鍐嚃閳哄啰锛滃銈嗘閸嬫劖鏅跺☉姘辩＜缂備焦顭囩粻鐐碉拷瑙勬礀閻栧吋淇婇幖浣肝ㄦい鏍ㄧ☉椤忓爼姊哄Ч鍥х仼闁硅绻濋幃锟犲Ψ閿斿墽鐦堥梻鍌氱墛缁嬫帡藟閵徛颁簻閹兼番鍩勫▓婊堟煛瀹�瀣？闁跨喐鏋荤紞鍡涘磻閸℃稑违闁圭儤姊荤壕濂稿级閸稑濡兼繛鎼櫍閺屸剝鎷呯憴鍕瀺缂備礁鍊圭敮鐐烘晸閺傘倗绉靛ù婊庝邯瀹曨剛鎹勬笟顖涘瘜闂侀潧鐗嗘鍛婄娴犲鐓曢柣妯诲墯濞堟﹢鏌ㄩ悢璇残撳ǎ鍥ㄦそ閿濈偞寰勯幇鈺嬫嫹閸愵喖唯闁冲搫鍊搁敓鐣屽厴閺屻倗鍠婇崡鐐插箰闂佹儳绻愰柊锝咁潖濞差亜宸濆┑鐘插暊閹峰綊鎮楅惂鍛婂闂佸綊妫跨粈渚�鎷戦悢鍏肩叆婵犻潧妫欓崯鎺楁煛閸愭寧瀚归梺鐟板槻閹虫﹢骞栬ぐ鎺戞嵍妞ゆ挾鍋涚粭灞剧節绾板纾块柛瀣灴瀹曟劙濡舵径濠傚亶闂佺粯鎸哥弧鍐洪宥嗘櫍闂侀潧绻掓慨鐢告倵椤掑嫭鈷戦柣鐔告緲閳锋梻绱掗鍛仸鐎规洘鍨块獮鍥敋閸℃ê顏堕柣鐔哥懃鐎氼厾绮堥敓钘夆攽閻愯尙婀撮柛濠冪箞閹即顢欑喊杈ㄥ缓闂佽法鍠曞Λ鍕綖韫囨洜纾兼俊顖濐嚙椤庢捇姊洪崗闂磋埅闁稿孩濞婃俊瀛樼節閸ャ劉鎷洪梻鍌氱墐閺呮繄绮旈崜浣虹＜闁绘娅曞畷宀勬煟濞戝崬鏋︾紒鐘崇☉閳藉鈻庨幇顓т户闂傚倷娴囧▔鏇㈠闯閿曞倸绠柨鐕傛嫹?
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
				
				//TODO 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡╂Ч濞存嚎鍊濋弻銈夊级閹稿骸浠村┑顔硷攻濡炰粙銆佸Δ鍛櫢闁伙絽鐬奸惌鎾绘煛鐏炶鍔滈柡鍛倐閺岋箑螣娓氼垱笑闂佽法鍠曞Λ鍕焽閿熺姴违濞达絿纭堕弸搴ㄦ煙閹咃紞妞わ富鍙冮幃宄邦煥閸愵亞顔掗柦妯荤箖閵囧嫰寮介妸褋锟芥帞绱掗悩鑽ょ暫鐎殿喖鐖煎畷鐓庘攽閸″繑瀵栭梻浣筋嚃閸犳盯宕戦幇鐗堝剦妞ゅ繐鐗滈弫鍥煟閹扮増娑ч柣鎾跺枛閹鈻撻崹顔界亾濡炪値鍘奸悧鎾汇�佸锟藉畷妤呮偂鎼达絿鐛┑鐘垫暩婵锟芥氨鍏樺畷顖炲炊閵娧呯槇闂佹眹鍨藉褔宕滃畷鍥╃＝鐎广儱鎳忛ˉ銏拷瑙勬礃缁矂鍩㈡惔銊ョ闁哄鍩婇幏鐑芥嚋閻愰�涚盎闂婎偄娲﹂幐鎼侇敂閵堝鐓涢柨鐔剁矙閹崇偤濡烽敐鍕泿闂備礁鎼崯顐﹀磹閻熸壋鏋嶉柡鍥ュ灪閻撶喐銇勯幘璺哄壉闁稿孩妫冮弻锛勪沪閻愵剛顦伴悗瑙勬礃閸庡ジ藝閸欏浜滈煫鍥风到楠炴銇勯妸锝呭姦闁诡喗鐟╁鍫曞箣閻愬墎妾ㄥ┑掳鍊楁慨鐑藉磻濞戙埄鏁勯柛娑欐綑閻撴﹢鏌熸潏鍓х暠缂佺姴顭烽弻鈩冨緞鐎ｎ亞鍔告繛鏉戝悑閹瑰洤顫忕紒妯肩懝闁跨喕妫勯…鍥嚒閵堝繑瀚归梻鍫熺〒閻掑摜锟借娲忛崹铏圭紦娴犲绾ч柛鈩冾殢濡插憡銇勯锝囩疄闁硅櫕绮撻幃浠嬫濞戞顓奸梻鍌氬�搁崐鎼佸磹閹间礁纾归柟闂寸贰閺佸銇勯幘鍗炵仼缂侊拷婢跺矉鎷烽獮鍨姎妞わ缚鍗抽幃锟犳偄閸忚偐鍘甸梺纭咁潐閸旀牜娑甸崜褝鎷峰☉娆戠疄闁哄睙鍛＜婵☆垳鍘ч埛宀勬⒑閸濆嫯顫﹂柛鏃�鍨甸锝夊级閹搭厽鍍甸梺鍛婎殘閸嬫盯鈥栨径宀�纾藉ù锝夌細濡炬悂鏌涘Ο鍝勬倯闁哄懓鍩栭幆鏃堟晲閸♀晜缍楅梻浣告贡閸庛倝銆冮崨顔煎姅闂傚倷绶氬褔篓閿熺晫绱掗悩鍐茬仸缂佸倹甯￠獮姗�顢欑憴锝嗗闂備礁鎲＄换鍌滐拷姘煎幖閿曘垺瀵肩�涙鍘介梺鍐叉惈閿曘倝鎮橀敃鍌涚厱闁靛ň鏅濋悾娲煛娴ｇ鏆ｇ�规洘甯掗～婵囶潙閺嵮勬毌闂傚倸鍊风粈浣革耿闁秴纾婚柟鎹愵嚙缁�鍫熸叏濮楀棗骞栨い鏇憾閺屻劑鎮ら崒娑橆伓
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

