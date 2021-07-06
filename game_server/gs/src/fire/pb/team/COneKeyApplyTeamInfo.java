
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __COneKeyApplyTeamInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class COneKeyApplyTeamInfo extends __COneKeyApplyTeamInfo__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure onekeyteammatch = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{					
				Team team = null;
								
				team = TeamManager.getTeamByTeamID(teamid);	//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ剙浠遍柟顔ㄥ洦鍋愭慨鐟版祫閹烽攱绗熼敓钘夘嚕閹绢喖顫呴柍鈺佸暞閻濇洟姊绘担钘壭撻柨姘亜閿旇鏋ょ紒杈ㄦ瀵挳濮�閳撅拷閹风粯绻涙潏鍓хК婵炲拑缍佹俊瀛樼節閸ャ劎鍘遍梺瑙勫劤椤曨厾绮婚悙鐑樼厵闁芥ê顦敓钘夘煼閺佹捇寮妶鍥┬ｉ梺鍝ュУ閻楃娀骞冨▎鎰瘈闁告劧缂氱花濠氭⒑閻熺増鎯堢紒澶婂閹峰綊鎮ч崼婊呯畾濡炪倖鍔戦崹褰掑汲濞嗘挻鐓冮悷娆忓閻忔挳鏌熼鐣屾噧妞ゆ柨绻橀、娆撳礂绾板崬鏅欐繝纰夌磿閸嬫垿宕愰弽顐ｆ殰闁绘棁妗ㄩ悞濠冪箾閸℃ê鐏︽い顐ｆ礋閺岋綁骞囬澶婃闂佽崵鍠庣紞濠囧蓟閵娾晜鍋勭紓浣癸供濡嫬顪冮妶鍡樼┛缂傚秳绶氶妴渚�寮撮姀鈩冩珖闂佽法鍠撻弲顐ゅ垝閸儱绀冮柍鐟般仒缁ㄥ姊洪崫鍕殭婵炲眰鍊栫粋宥堛亹閹烘挾鍙嗗┑鐐村灦閻熝囨儗婵犲洦鐓冮悷娆忓閻忓瓨銇勯姀锛勬噰鐎殿噮鍓熸俊鍫曞醇椤掍礁顏堕柣鐘充航閸斿骸螞椤栨稏浜滈柟鎹愭硾椤庡矂鏌ｉ幒妤冪暫鐎规洍鍓濆蹇涘Ω閿濆嫮鐩庨梻浣告惈缁嬩線宕戦崟顒傤浄闁挎洖鍊归悡鍐⒑閸噮鍎忕紒妤佸浮濡焦寰勯幇顓犲弳濠电娀娼уΛ娆戠矈閳哄懏鐓熼柟鐑樻煥娴滈箖鏌曢崶褍顏┑锛勫厴婵＄柉顦存い鏃�甯″娲传閸曨剚鎷辩紓浣割儐閹瑰洭寮幘璇叉闁靛牆娲ㄦ牎濠电偛鐡ㄧ划宥囨崲閸絾锛傞梻渚�娼уù姘熆娓氾拷楠炲繑顦版惔銏犳瀭闂佸憡娲﹂崜娑⑺囬鐔虹瘈闁冲嚖鎷烽柛鏇炵仛閻や礁螖閻橀潧浠滄俊顐ｇ箓椤曪綁顢氶敓钘夌暦閻撳簶鏀介柟閭﹀幘缁夐亶姊婚崒娆掑厡缂侇噮鍨甸幗顐︽偡濠婂嫭绶查柛鐔告尦閺佹劙鎮欑�靛摜鐦堥梺鎼炲劘閸斿骞忔繝姘拺缂佸瀵у﹢浼存煠瑜版帞鐣洪柡浣规崌閹崇偤濡烽敃锟介敓鑺ュ姉閿熷�燁潐濞叉﹢宕濆▎鎾跺祦闁哄秲鍔嶆刊鎾煕濠靛嫬鍔电紒槌栧櫍濮婄粯鎷呴崫銉ㄥ┑鈽嗗亯濞夋洜鍒掗崼鐔稿闁告繂瀚峰Λ婊堟偡濠婂懎顣奸悽顖涱殜閹�斥枎閹剧补鎷婚梺绋挎湰閸戝綊宕甸悢鎼炰簻闁挎棁鍋愰悾鐢告煛瀹�瀣М濠德ゅ煐閹棃鍩勯崘顏冮偗闂傚倸鍊稿ú銈壦囬悽绋胯摕婵炴垶绮庨悿锟介梺瑙勫礃濞呮洟宕愰婊呯＝闁稿本姘ㄦ牎闂佹悶鍔屽﹢鍗炍ｉ幇鏉跨婵°倧鎷风紒鐘崇♁閵囧嫰骞樺Δ锟界�氼噣寮抽銏♀拻濞达綀濮ょ涵鍫曟煕閻樿櫕绀�閾荤偤鏌涢弴銊ュ箻濞戞挸绉堕敓钘夌畭閸庨亶藝椤栨粌顥氶柛褎顨嗛悡鏇熶繆閵堝懎鏆曠紒杈珪缁绘稑顔忛鑽ゅ嚬闂佸搫鎳忕换鍫ュ蓟濞戞鏆嗛悗锝庝憾濞差厾绱撴担鍓插剰缂佺粯锚椤繐煤椤忓嫪绱堕梺鍛婃处閸撴瑩宕戝澶嬧拺闁硅偐鍋涙俊鑺ヤ繆閻愭壆鐭欐鐐插暣閺佹捇鎮╅崘韫盎闂備胶顭堢换妤呭磻閹版澘鍌ㄩ柣銏犳啞閳锋帒銆掑顒佹悙鐎殿喛娉曠槐鎺楁偐閸愯尙浼岄悗娈垮枤椤牓鍩ユ径鎰潊闁挎稑瀚獮鍫ユ⒒娴ｅ憡鎯堥柛濠傜秺椤㈡牕鈻庨幘宕囷紵闂佸搫鍟悧濠囨偂濞戞熬鎷烽惂鍛婂闁诲函缍嗛崜娑溾叺濠德板�楁慨鐑藉磻閻愮儤鏅濋柕蹇曞Х閺嗭箓鏌ㄩ悢鍝勑ｉ柛濠勫厴閺岀喓绱掑Ο杞板垔濠电偛鍚嬮惄顖氼潖婵犳艾纾兼慨姗嗗墾閹烽绮欏Λ鍨そ婵¤埖绔熼敃锟藉ú顓㈠箖閻ｅ瞼鐭欓柤鎰佸灡閹蹭即姊绘笟锟藉褔鈥﹂崼銉ョ？妞ゆ洩鎷风�殿喓鍔嶇粋鎺旓拷锝庡亞閸橀亶姊洪搹顐ｅ珪闁归鍏橀弻锟犲川椤斿墽鐓夐梺绯曟杺閸ㄤ粙鐛锟藉顒勫Ψ閿旇姤婢戦梻鍌欑閻ゅ洤螞閸曨倠娑樜旀担渚锤濠电娀娼ч鍡涙偂閺囥垺鐓忓┑鐐茬仢閸旀粓鎮归幇銊ュ⒉濞ｅ洤锕畷锝嗗緞婵犲偆娼氭俊銈囧Х閸嬬偟鏁敓鐘靛祦婵☆垵娅ｉ弳锕傛煕閵夈垺娅囩�规挷绀侀埞鎴︽偐閸偅姣勯梺绋款儑閸嬨倕鐣疯ぐ鎺戦唶闁哄洨鍠庢禒顓㈡⒑闂堟侗妲撮柡鍛櫊瀵偊宕掗悙瀵稿弳闂佺粯娲栭崐鍦拷姘炬嫹 by changhao	
				if (team != null)
				{
					SOneKeyApplyTeamInfo msg = new SOneKeyApplyTeamInfo();
					
					msg.teamid = teamid;
					
					msg.memberlist.add(team.getTeamMemeberSimple(team.getTeamLeaderId()));
					
					for (xbean.TeamMember member : team.getTeamInfo().getMembers())
					{
						long memberid = member.getRoleid();
						
						msg.memberlist.add(team.getTeamMemeberSimple(memberid));
					}
					
					mkdb.Procedure.psendWhileCommit(roleid, msg);
				}
						
				return true;
			}
			
		};
		
		onekeyteammatch.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794517;

	public int getType() {
		return 794517;
	}

	public long teamid; // 队伍的ID by changhao

	public COneKeyApplyTeamInfo() {
	}

	public COneKeyApplyTeamInfo(long _teamid_) {
		this.teamid = _teamid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(teamid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		teamid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof COneKeyApplyTeamInfo) {
			COneKeyApplyTeamInfo _o_ = (COneKeyApplyTeamInfo)_o1_;
			if (teamid != _o_.teamid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)teamid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(teamid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(COneKeyApplyTeamInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(teamid - _o_.teamid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

