
package fire.msp.npc;

import fire.pb.map.SceneNpcManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __MUpdateNpcInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class MUpdateNpcInfo extends __MUpdateNpcInfo__ {
	@Override
	protected void process() {
		// protocol handle

		new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				for (NpcInfo createinfo : npcs)
				{
					SceneNpcManager.getInstance().createAddNewNpc(createinfo);

				}

				// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戞ǚ鏋庨煫鍥ㄤ緱閿熻姤顨嗛妵鍕敃閵忋垻顔掗梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绉柡宀嬬到铻ｉ柛蹇撳悑濮ｅ嫰姊虹紒妯虹瑨闁告艾顑囬幑銏犫槈濞嗘劗绉堕梺鍛婃寙閸涘懏绮岄埞鎴︽倷闂堟稑浠樺銈庡幘閸忔﹢鐛繝鍥х閻犲洦鐓￠弫婊冣攽鎺抽崐鎾绘嚄閸洖鍌ㄩ柦妯侯槴閺�鑺ャ亜閺冨倻鎽傞柣鎺撳劤闇夋繝濠傞婢ь垳绱掗崒姘毙ょ紒杈╁仦閵堬綁宕橀埞鐐闂備胶顭堥張顒勬嚌妤ｅ啯鏅稿ù鐘差儛濡垹绱掗鑲╁缂佹鍠栭弫鎾寸鐎ｎ剙绁︽繝銏ｅ煐閸旀牠寮查鍕厱闁哄洢鍔屾晶顖涚箾閸喐绶查柍瑙勫灦楠炲﹪鏌涙繝鍐╃鐎规洦鍨辩�佃偐锟芥稒锚閸撶懓鈹戦悙鍙夘棡闁圭顭烽幃鈥斥枎閹炬潙锟界敻鏌ｉ姀鈽嗗晱闁绘帡绠栧畷顖炲传閵壯咃紲闂佽鍨庨崘顏嗏棨缂傚倷绶￠崰妤呮偡閳轰緡鍤曞┑鐘崇閸嬪嫰鏌ｉ幘铏崳妞ゆ柨顦靛娲焻濞戞ê绁┑鐐板尃閸愶絾鐏佸銈嗘尪閸ㄦ椽鎮￠悢鍏肩厽闁哄倹瀵ч幉鎼佹煙閾忣偅绀堢紒杈ㄥ浮閹晠鎼归銏紦闂備胶绮笟妤呭闯閿濆拋鍤曞ù鐘差儌閿熻姤鐗犳俊鐑藉Ψ閳轰礁鍙婃俊鐐�戦崹娲偋濠婂牆绠查柛鏇ㄥ灠鎯熼悷婊勭矊鍗辨い鏍仦閳锋帡鏌涚仦鍓ф噮妞わ讣绠撻弻鐔哄枈閸楃偘绨婚柣鎾卞�濋弻鏇＄疀鐎ｎ亷鎷烽弴銏犲瀭闁稿本绮嶉崰鎰版煟濡わ拷閻楀棛绮鑸电厱閹兼番鍩勫▓鏇炃庨崶褝韬┑鈥崇埣瀹曘劑顢欓崗纰变画闂傚倷鑳剁划顖炲箰婵犳碍鍋￠柍鍝勬噹缁犳牗淇婇妶蹇斿闂佸疇妫勯ˇ顖炲煝鎼粹垾鐔兼偂鎼粹寬銊╂⒒閸屾瑧鍔嶆俊鐐叉健瀹曘垺绺界粙鍨彉濡炪倖甯掔�氼剚顢婇梻浣告啞濞诧箓宕板鑸靛仾闁跨喍绮欏铏规喆閸曨偄濮㈤梺姹囧�曞ú顓炵暦濞差亝鍊烽柣鎴炃氶幏濠氭⒑閹肩偛鍔�閻忕偞瀚庤缁辨挻鎷呴搹鐟扮缂備浇顕ч崯浼村箲閵忕姭鏀介悗锝庝簽閿涙粌鈹戦鏂よ�挎俊顐ユ硶濡叉劙骞嬮敂瑙ｆ嫽婵炶揪绲介幗婊堟晬瀹ュ棎浜滈柟瀵稿仦缁�瀣拷瑙勬礃濞叉牠鎮鹃悜钘夌倞妞ゎ厽鍨剁紞妤呮⒒娴ｅ憡璐￠柛搴涘�濋妴鍐川椤旂厧濮呴梻鍌氬�烽悞锔撅拷绗涘懏宕查柛宀�鍋涚粻鐘诲箹濞ｎ剙濡烽柨鐔诲Г閻楁顕ラ崟顐ゆ殕闁跨喓鏅竟鏇㈡寠婢规繂缍婇弫鎰板炊閸撲礁濮煎┑鐐茬摠缁牓宕￠幎钘夎摕闁绘梻鍘х粈鍕煏閸繃顥滄い蹇ユ嫹?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垻绮穱濠囨倷椤忓嫸鎷烽弽顓熷亱婵犲﹤鐗嗙壕缁樼箾閹存瑥鐏╅柛銊ュ�块弻娑氫沪閸撗�妫ㄦ繛瀛樼矋缁捇寮婚垾鎰佸悑闁告劑鍔岄‖瀣⒑闂堟稒顥為悽顖涱殜婵＄敻宕熼姘卞幐闂佺鏈划灞筋嚕閵娾晜鈷戦柛婵嗗閻忛亶鏌涢悩宕囧⒌妤犵偛鍟…銊╁礃閻愵剙缂撻梻浣虹《閸撴繈鈥﹂崶顒�姹查柕澶嗘櫆閳锋帒霉閿濆懏鍟為悹鎰剁節閺岀喖鎼归锝呯３闂佽鍠撻崕鑼紦閻ｅ瞼鐭欓柤鎰佸灡閹蹭即姊绘担鍛婃儓婵炲眰鍔戝畷浼村箻閸撲椒绗夋俊銈忕到閸燁垶鎮￠弴鐔翠簻妞ゆ挾鍠庨悘銉╂煛鐎ｎ偆鈾侀柕鍥у椤㈡鏁撴禒瀣垫晞闁搞儮鏅滈～鏇㈡煙閹呮憼濠殿垱鎸抽弻娑樷攽閸℃褰呴梺闈涱槴閺呮粓鎮″▎鎾寸叄闊浄绲芥禍婵堬拷瑙勬礀閻倿寮诲☉銏犵厴闁割煈鍠栨慨鏇㈡倵閸偅绶查悗姘嵆閻涱噣宕堕澶嬫櫌闂佺琚崐鏇㈠疾椤忓牊鈷掑ù锝堟閸氱懓鈹戦悜鍥ㄥ缂傚倸鍊搁崐褰掓嚌妤ｅ啫鐓濈�广儱顦伴弲鏌ユ煕濠婏拷閼冲爼鏁撻挊澶婎暢缂佽鲸甯楀鍕拷锝呯仛閻庣帪edure闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵潙顫濋懜娈匡拷鏍ㄧ箾鐎涙鐭婄紓宥咃躬瀵鈽夐姀鐘电杸闂傚倸鐗婄粙鎺楁倶瀹ュ鈷戠紒瀣仢椤掋垺銇勯妸銉含鐎殿喛顕ч埥澶婎潩椤愶絽濯伴梻浣筋嚃閸ㄥ酣宕橀埡鍐╊潨闂傚倸鍊烽懗鍓佸垝椤栨粍鏆滈柣鏃囧仱濞戙垹绀嬫い鏍ㄧ〒閻ｆ娊姊婚崒娆掑厡妞ゎ厼鐗忛幑銏ゅ箛閺夎儻袝闁诲函缍嗛崜娑氱矆婵犲洦鐓欓悗鐢殿焾鍟哥紒鐐劤閵堟悂寮婚妸鈺傚亜闁告挷鑳堕悡鎾绘⒑鏉炴壆鍔嶉柟鐟版喘瀵偊骞樼紒妯绘闂佽法鍣﹂幏锟�?
				pexecuteWhileCommit(new PExecuteAfterNpcCreate(npcs));
				return true;
			}
		}.submit();

	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730397;

	public int getType() {
		return 730397;
	}

	public java.util.LinkedList<fire.msp.npc.NpcInfo> npcs;

	public MUpdateNpcInfo() {
		npcs = new java.util.LinkedList<fire.msp.npc.NpcInfo>();
	}

	public MUpdateNpcInfo(java.util.LinkedList<fire.msp.npc.NpcInfo> _npcs_) {
		this.npcs = _npcs_;
	}

	public final boolean _validator_() {
		for (fire.msp.npc.NpcInfo _v_ : npcs)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(npcs.size());
		for (fire.msp.npc.NpcInfo _v_ : npcs) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.msp.npc.NpcInfo _v_ = new fire.msp.npc.NpcInfo();
			_v_.unmarshal(_os_);
			npcs.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof MUpdateNpcInfo) {
			MUpdateNpcInfo _o_ = (MUpdateNpcInfo)_o1_;
			if (!npcs.equals(_o_.npcs)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += npcs.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npcs).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

