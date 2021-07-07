
package fire.pb.game;

import mkdb.Procedure;

import fire.pb.RoleConfigManager;
import fire.pb.item.Pack;
import fire.pb.product.Commontext;
import fire.pb.talk.MessageMgr;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRoleAccusationCheck__ extends mkio.Protocol { }

/** 举报时候客户端给服务器发消息,用于扣费
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRoleAccusationCheck extends __CRoleAccusationCheck__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid( this );
		if (roleId < 0)
			return;
		new mkdb.Procedure()
		{
			protected boolean process() throws Exception {
				int money = Integer.parseInt(RoleConfigManager.getRoleCommonConfig(332).getValue());
				Pack bag = (Pack) fire.pb.item.Module.getInstance().getItemMaps(roleId,
						fire.pb.item.BagTypes.BAG, false);
				if (money > bag.getMoney()) {
					MessageMgr.sendMsgNotify(roleId, 120025, null);
					return true;
				}
				
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂傚洤顦甸弻銊モ攽閸♀晜效婵炲瓨鍤庨崐婵嬪蓟閵堝绾ч柟绋块娴犳潙鈹戦纭锋敾婵＄偘绮欓妴浣肝旈崨顔芥闂佷紮绲介惉濂告儗閹剧粯鐓涢悘鐐额嚙閸旀粓鏌￠崨顔藉�愰柡宀嬬畱铻ｅ〒姘煎灡绗戦梻浣芥硶閸犳洖螞閸曨偒鐒介柨鐔哄Т杩濇繛杈剧悼绾爼寮告惔銊︾厵闁诡垎鍜冪礊濡炪倧瀵岄崣鍐箖瀹勯偊鐓ラ柛鎰典簽椤旀帡鏌﹀Ο鑽ょ畺闁靛洤瀚板浠嬪Ω瑜嬮敓鑺ュ笧缁辨帡鎮╅懡銈囨毇闂佸搫鐬奸崰鏍嵁閸℃凹妾ㄩ梺鎼炲�楅崰鏍蓟濞戙垺鍋勯柛婵勫劚瀵劑姊洪崫鍕伇闁哥姵鐗犻獮鍐煥閸喎娈熼梺闈涱檧闂勫嫬鈻撻崨濠佺箚闁绘劦浜滈敓鑺ュ灴瀹曟繃绻濋崶褏锛熼梺姹囧灮椤牏绮婚弽銊х闁糕剝蓱鐏忣厾绱掗悪娆忔处閻撴瑩鎮楀☉娆樼劷缂佺姰鍎茬换娑㈠礂閻撳骸鎽靛┑顔硷功缁垶骞忛崨瀛樺殟闁靛缍囬幏鐑藉礃椤旂晫鍘介梺纭呮閸嬬喖鎮鹃崹顐闁绘劖娼欓悘瀵革拷瑙勬礀閻栧ジ銆佸Δ鍛櫢濞寸姴顑呴崙鐘层�掑鐐闂佸搫鐬奸崰鏍х暦濠婂棭妲鹃柣銏╁灡閻╊垶寮婚敓鐘插窛妞ゆ棁妫勯敓鑺ュ姍閺岋紕浠︾拠鎻掝潎闂佽鍠撻崐婵嗙暦閹烘垟妲堟慨妤�妫旂槐锟�
				if (bag.subMoney(-money, Commontext.REASON_STRING,
						fire.log.enums.YYLoggerTuJingEnum.tujing_Value_jubao, 0) != -money) {
					MessageMgr.sendMsgNotify(roleId, 120025, null);
					return true;
				}
				
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂傚洤顦甸弻銊モ攽閸♀晜效婵炲瓨鍤庨崐婵嬪蓟閵堝绾ч柟绋块娴犳潙鈹戦纭锋敾婵＄偘绮欓妴浣肝旈崨顔芥闂佷紮绲介惉濂告儗閹剧粯鐓涢悘鐐额嚙閸旀粓鏌￠崨顔藉�愰柡宀嬬畱铻ｅ〒姘煎灡绗戦梻浣芥硶閸犳洖螞閸曨偒鐒介柨鐔哄Т杩濇繛杈剧悼绾爼寮告惔銊︾厵闁诡垎鍜冪礊闂佷紮缍佺粻鏍箖瀹勯偊鐓ラ柛鎰典簽椤斿﹦绱撴笟鍥ф灆缂佽尪宕电划璇测槈閵忕姵顥濋梺鍛婃寙閸涱垱姣庨梻鍌氬�风欢姘焽瑜旈幃褔宕卞▎鎰簥闂佸湱鍎ら〃鍛矆閸℃褰掓偂鎼达絾鎲奸梺缁樻尰濞茬喖寮婚敐鍛傜喖宕崟顒佺槪闂備礁鎲＄换鍡椻枍閿濆鏅搁柤鎭掑労閸熷繘鏌涢敐搴℃珝鐎规洘鍨剁换婵嬪磼濠婂嫭顔曢梻浣虹帛濮婂鍩涢崼銉ユ瀬闁糕剝绋掗悡鏇㈡倶閻愭彃鈷旈柣顓滃�濋弻娑㈡偄閻戣棄寮板┑顔硷功缁垶骞忛崨瀛樻優妤犵偛灏呴幏閿嬬節閸ャ劎鍘遍梺瑙勫劤椤曨厾绮诲鑸电厵缂佹稑顑呮禍浼存煛瀹�瀣К缂佺姵鐩獮妯硷拷闈涘濞插爼姊绘担鍛婂暈闁挎艾顭胯濡嫬宓勯梺鍦濠㈡绮婚搹顐＄箚闁靛牆瀚ˇ锕�霉濠婂啨鍋㈡慨濠冩そ瀹曘劍绻濇担铏圭畳闂備焦鎮堕崝宀勬偪閸ヮ剙鐒婚柣銏犳啞閳锋帡鏌涚仦鍓ф噮妞わ讣绠撻弻鐔哄枈閸楃偘鍠婇梺璇″灠椤︽壆缂撻悾宀�鐭欓悹鎭掑妿瀹曞爼姊绘担鍛婃儓缂佸绶氬畷銏＄附閸涘﹤鐝旈梺缁樻煥閸氬鎮￠弴銏＄厪濠㈣埖锚閺嬫稑顭胯閸ㄥ爼寮婚敓鐘插窛妞ゆ柨澧介悿鍕⒑閸濆嫯顫﹂柛鏃�鍨块獮鍐閵忊�崇彴濠电偛鐗嗛鍡涘箲閸ヮ剙钃熼柨鐔哄Т瀹告繃銇勯幘璺盒㈤柣鎾跺枎椤啴濡堕崘銊т痪闂佽崵鍣︾粻鎾荤嵁閸儱惟闁宠桨鑳堕悿锟芥俊鐐�曠换鎰涘☉妯锋灃闁割煈鍠掗弨浠嬫煥濞戞ê顏╁ù婊冦偢閺屾稒绻濋崘顏勨拰閻庤娲樼换鍫ュ极閸愵喖纾兼慨姗�纭稿Σ鑸电節濞堝灝鏋熼拑閬嶆煕閻愬樊鐓兼鐐茬箰閻ｏ繝鏌囬敂钘夊厞闂備胶绮崝锕傚礈濞嗘搩鏁傞柨鐕傛嫹
				Procedure.psendWhileCommit(roleId, new SRoleAccusationCheck(0));
				return true;
			};
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810372;

	public int getType() {
		return 810372;
	}


	public CRoleAccusationCheck() {
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
		if (_o1_ instanceof CRoleAccusationCheck) {
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

	public int compareTo(CRoleAccusationCheck _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

