
package fire.pb.battle.livedie;

import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import gnet.link.Onlines;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CInvitationLiveDieBattle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CInvitationLiveDieBattle extends __CInvitationLiveDieBattle__ {
	@Override
	protected void process() {
		//濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻鐔兼⒒鐎垫瓕绐楅梺杞扮鐎氫即寮诲☉銏犵労闁告劦浜栧Σ鍫ユ⒑閹肩偛濡奸柛濠傜秺婵＄敻宕熼姘鳖唺閻庡箍鍎遍悧鍡涘储閿熺姵鈷戦柛蹇撴噽娑撴煡鏌熼崙銈嗗?
		final long hostid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (hostid <= 0)
			return;
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴婵拷闁斥晛鍟拌ぐ鍥р攽閿涘嫬浠ч柟铏崌瀹曨垶宕稿浼欐嫹閿旂偓宕夐柕濠忕畱绾绢垶姊洪幆褏绠版繝锟介柆宥呯妞ゆ牜鍋為埛鎴犵磽娴ｈ鐒介柍鍙ョ窔閺岀喖鎮烽悧鍫熸倷濡炪値鍋勭换鎴犳崲濠靛棭娼╂い鎾跺枑椤忕喖姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷?婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖闂傤垱銇勯弽顐粶缂佺媭鍨堕弻銊╂偆閸屾稑顏�?
				xbean.Properties hostprop=xtable.Properties.select(hostid);
				if(hostprop==null){
					return false;
				}
				if(hostprop.getLevel()<LiveDieMange.getLiveDieLevel()){
					return false;
				}
				
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔芥祰闂傚倷鑳堕…鍫燁殽閸濄儻鎷峰☉鎺撴珚濠碉紕鏁诲畷鐔碱敍濮樿京娼夐梻浣侯焾閺堫剛绮欓幒妤佸仧妞ゅ繐鐗婇埛鎴︽煙閼测晛浠滃┑鈥炽偢閺屾洟宕奸悢绋匡拷鎰拷娈垮枛椤兘寮幇鏉垮窛妞ゅ繐鎳忛弳濠囨⒒娴ｈ櫣甯涢柛鏃撶畵瀹曟粌顫濋懜闈涗户闂佸搫鍊归娆忋�掓繝姘厪闁割偅绻冮ˉ鐐烘煟閹惧崬鍔ょ紒杈ㄥ笚瀵板嫮浠﹂幆褎鐣俊鐐�栧ú鈺冨緤閸撗嶆嫹闂堟稏鍋㈡鐐寸墵椤㈡﹢鎮㈤崨濠勫建婵犵數濮甸鏍窗濡ゅ懏鏅濋柍鍝勬噹閸屻劌鈹戦崒婊庣劸缂侊拷閸儲鐓忓┑鐐靛亾濞呭棝鏌ｉ幘璺烘灈妤犵偞鐗曡彁妞ゆ帪鎷烽柣蹇ｅ櫍閺屽秹宕ｉ妷褏鐛㈤梺鍝勮閸斿矂锝炲┑瀣垫晣闁绘鏁稿Σ鍥⒒娴ｈ姤纭堕柛鐘茬Ф閸掓帒鈻庨幘铏�梺鐟板⒔缁垶寮查幖浣圭叆闁绘洖鍊圭�氾拷
				Long objectid;
				try {
					objectid=Long.parseLong(idorname);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					objectid=xtable.Rolename2key.select(idorname);
				}
				if(objectid==null){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
					return false;
				}
				//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲搁弮鍫澪ラ柛鎰ㄦ櫆閸庣喖鏌曡箛瀣労婵炶尙顭堥埞鎴︽偐鐠囇冧紣闂佺懓鍟跨换鎰版偩閻戣棄绠甸柟瑙勵殔缂嶅﹪寮幇鏉垮窛妞ゆ棁娉曢、鍛存⒒娴ｅ摜锛嶇紒顕呭灠椤繑绻濆顓熸闂佽姤锚椤﹂亶鎮鹃銏＄厱閹兼番鍔嬮幉楣冩煙椤斻劌娲ら獮銏＄箾閹寸伝顏堝磻瀹ュ鈷戦柛锔诲弨濡炬悂鏌涢悩鎰佹疁闁糕晜鐩獮瀣晜閻ｅ苯寮抽梻浣虹帛濞叉牠宕愰崷顓ㄦ嫹濮樼偓瀚�?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜滄儫闂佸疇妗ㄥù鍥箺閺囩喓绡�闁靛骏绲介悡鎰版煕閺冿拷濞茬喎鐣烽妷褎鍠嗛柛鏇ㄥ幘閻﹀牊绻濋悽闈浶㈤柛濠冩倐瀵悂濡舵径瀣幈闂佺粯娲栭崐鍦拷姘炬嫹?
				if(hostid==objectid){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 166006, 0, null);
					return false;
				}
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔芥祰闂傚倷鑳堕…鍫燁殽閸濄儻鎷峰☉鎺撴珚濠碉紕鏁诲畷鐔碱敍濮樿京娼夐梻浣侯焾閺堫剛绮欓幒妤佸仧妞ゅ繐鐗婇埛鎴︽煙閼测晛浠滃┑鈥炽偢閺屾洟宕奸悢绋匡拷鎰拷娈垮枛椤兘寮幇鏉垮窛妞ゅ繐鎳忛弳濠囨⒒娴ｈ櫣甯涢柛鏃撶畵瀹曟粌顫濋懜闈涗户闂佸搫鍊归娆忋�掓繝姘厪闁割偅绻冮ˉ鐐烘煟閹惧崬鍔ょ紒杈ㄥ笚瀵板嫮浠﹂幆褎鐣俊鐐�栧ú鈺冨緤閸撗嶆嫹闂堟稏鍋㈡鐐寸墵椤㈡﹢鎮㈤崨濠勫建婵犵數濮甸鏍窗濡ゅ懏鏅濋柍鍝勬噹閸屻劌鈹戦崒婊庣劸缂侊拷閸儲鐓忓┑鐐靛亾濞呭棝鏌嶉柨瀣伌婵﹤顭峰畷鐓庮潩椤撶喓褰堢紓鍌欑筏閹风兘鎮楅敐搴℃灍闁绘挻娲熼弻锟犲磼濮橆厼浠撮梺鍛婄懃鐎氼噣鏁撻崐鐕佹綈婵炲弶绮撳顐ｇ節濮橆剚鐎梺鐟板⒔缁垶寮查幖浣圭叆闁绘洖鍊圭�氾拷
				Role gRole = RoleManager.getInstance().getRoleByID(objectid);
				if (gRole == null){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
					return false;
				}
				xbean.Properties guestprop=xtable.Properties.select(objectid);
				if(guestprop==null){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
					return false;
				}
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴婵拷闁斥晛鍟拌ぐ锝夋⒒娴ｅ憡璐￠柛蹇旓耿瀵劑鏌嗗鍛唵闂佸憡绋掑娆戠矆閸愵喗鐓熼柟浼存涧婢ф壆绱掓径灞藉幋婵﹦绮幏鍛村川婵犲啫鍓甸梻浣规た閸撴瑩濡剁粙璺ㄦ殾濞村吋娼欑粻濠氭偣閸濆嫭鎯堥柣蹇擄躬濮婃椽宕滈懠顒�甯ラ梺绋款儏鐎氼喖鈻庨姀銈嗗�风痪鏉款槹鐎氬綊鏌ｈ閹诧紕锟芥艾缍婂娲川婵犲啫顦╅梺鍛婎焾閸嬫劗鍒掗崼銉ラ唶闁靛鑵归幏缁樼箾鏉堝墽鍒伴柟璇х節楠炲棝宕奸妷锕�锟藉灚鎱ㄥΟ鍝勮埞闁告ê顕敓鍊燁潐濞叉繈锝炴径宀嬫嫹闂堟稏鍋㈢�殿喖鐖奸獮瀣偐閸偅鐦炲┑鐘垫暩閸嬬娀骞撻鍡欑闁跨喕濮ょ换娑㈠椽閸愵亝鍋х紓渚囧枛椤嘲顕ｉ锟藉畷濂告偄閸濆嫬姹查梻鍌欑閹碱偄霉閸屾稓顩叉繝闈涚墳閹峰嘲顫濋鍌溞ㄥ┑顔硷龚濞咃綁骞忛悩璇茬伋闁惧浚鍋嗘禍顏呯節閻㈤潧浠滄い鏇ㄥ弮瀹曟顫滈敓浠嬫偘椤旇棄绶為柟閭﹀幖娴滈亶姊洪崜鎻掍簽闁哥姴閰ｉ、鎾诲箻缂佹ǚ鎷洪梻鍌氱墐閺呮盯鎯佸鍫熺厱婵☆垰婀遍惌娆戯拷瑙勬礈閸犳牠寮幘缁樻櫢闁跨噦鎷�
				if(guestprop.getLevel()<LiveDieMange.getLiveDieLevel()){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162078 , null);
					return false;
				}
				SInvitationLiveDieBattle sInvitationLiveDieBattle=new SInvitationLiveDieBattle();
				sInvitationLiveDieBattle.objectid=objectid;
				sInvitationLiveDieBattle.objectname=guestprop.getRolename();
				sInvitationLiveDieBattle.selecttype=selecttype;
				sInvitationLiveDieBattle.costmoney=LiveDieMange.getLiveDieCostMoney();
				Onlines.getInstance().send(hostid, sInvitationLiveDieBattle);
				
				return true;
			};
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793833;

	public int getType() {
		return 793833;
	}

	public java.lang.String idorname;
	public int selecttype; // 0单人   1组队

	public CInvitationLiveDieBattle() {
		idorname = "";
	}

	public CInvitationLiveDieBattle(java.lang.String _idorname_, int _selecttype_) {
		this.idorname = _idorname_;
		this.selecttype = _selecttype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(idorname, "UTF-16LE");
		_os_.marshal(selecttype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		idorname = _os_.unmarshal_String("UTF-16LE");
		selecttype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CInvitationLiveDieBattle) {
			CInvitationLiveDieBattle _o_ = (CInvitationLiveDieBattle)_o1_;
			if (!idorname.equals(_o_.idorname)) return false;
			if (selecttype != _o_.selecttype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += idorname.hashCode();
		_h_ += selecttype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(idorname.length()).append(",");
		_sb_.append(selecttype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

