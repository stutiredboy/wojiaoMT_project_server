
package fire.msp.npc;
import fire.msp.move.DynamicSceneParams;
import fire.pb.move.DynamicSceneType;
import fire.pb.scene.Scene;
import fire.pb.scene.SceneFactory;
import fire.pb.scene.SceneManager;
import fire.pb.scene.manager.SceneNpcManager;
import fire.pb.scene.movable.NPC;
import fire.pb.scene.sPos.Position;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GCreateNPCByPos__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GCreateNPCByPos extends __GCreateNPCByPos__ {
	@Override
	protected void process() {
		// protocol handle
		Scene scene = null;
		try {
			NPC n = SceneNpcManager.getInstance().createNpcWithKey(npc.npckey,npc.npcbaseid, npc.name, npc.dir);
			if (n == null) {
				if (SceneManager.logger.isInfoEnabled()) {
					SceneManager.logger.info(new StringBuilder().append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹂柣鎾冲瘨閻斿棙绻濋棃娑氬闁搞倧鎷锋俊鐐�ら崑鍛崲閸曨垰绠查柛鏇ㄥ灡閹偤鎮归崶锝呭⒉鐞氀勭節閻㈤潧啸闁轰焦鎮傚畷鎴︽倷閸濆嫬鐎梺鍛婃尫缁�渚�寮搁崼顫嫹楠炲灝鍔氭い褝鎷风紓鍌氱У閻楃娀寮婚敓鐘茬倞闁崇尨鎷风紒鍗炵－閹叉悂鎮ч崼婵堢懆缂備緤鎷烽柛宀�鍋為悡鏇㈢叓閸ャ劏澹樺ù婊冩贡缁辨帞锟斤綆浜濆婵堢磼鏉堛劍灏扮紒妤冨枑缁绘繈宕橀…鎴滅处闂傚倸鍊风粈浣圭珶婵犲洤纾婚柛鈩冪☉缁愭鏌涢埄鍐剧劷妞も晛寮剁换婵囩節閸屾粌顤�闂佺粯鎸荤粙鎾绘晸閽樺鐣柛搴ㄤ憾瀹曨垶顢曢敐鍕畾闂佺鍕垫畷闁绘挸鍟撮弻娑樷枎瀹ュ懎濮㈢紓浣瑰姈濡啴寮婚垾宕囨殕闁跨喍绮欏畷浼村冀椤撶偟鐣哄┑鐘诧工閻楀棛绮婚敐澶嬬厵闁绘垶蓱鐏忣參鏌＄�ｃ劌锟芥繂顫忕紒妯诲闁告稑锕ラ崕鎾绘⒑閸濆嫮澧遍柛鎾跺枛楠炲棝宕熼锝嗘櫖闂佺粯鍔欏褏绮婇敃鍌涒拺闁革富鍘奸崝瀣煕閵堝繒鐣电�殿噮鍣ｉ弫鎾寸鐎ｎ亞顔嗛梺鍛婁緱閸ㄩ亶宕伴崱娑欑厱闁哄洢鍔屾晶濠氭煕閻曞倹瀚�??:").append(npc.npcbaseid)
							.append(",sceneid:").append(npc.sceneid)
							.append(",ownerid:").append(npc.ownerid));
				}
			}
			
			if (npc.ownerid > 0) {
				scene = SceneManager.getInstance().getSceneByMapAndOwner((int) npc.sceneid, npc.ownerid);
				if (scene == null) {
					DynamicSceneParams params = new DynamicSceneParams();
					scene = SceneFactory.createDynamicScene((int) npc.sceneid,
							npc.ownerid, "", -1, DynamicSceneType.NORMAL_SCENE,
							params.marshal(new OctetsStream()));
					
					SceneManager.logger.error(new StringBuilder().append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹂柣鎾冲瘨閻斿棙绻濋棃娑氬闁搞倧鎷锋俊鐐�ら崑鍛崲閸曨垰绠查柛鏇ㄥ灡閹偤鎮归崶锝呭⒉鐞氀勭節閻㈤潧啸闁轰焦鎮傚畷鎴︽倷閸濆嫬鐎梺鍛婃尫缁�渚�寮搁崼顫嫹楠炲灝鍔氭い褝鎷风紓鍌氱У閻楃娀寮婚敓鐘茬倞闁崇尨鎷风紒鍗炵－閹叉悂鎮ч崼婵堢懆缂備緤鎷烽柛宀�鍋為悡鏇㈢叓閸ャ劏澹樺ù婊冩贡缁辨帞锟斤綆浜濆婵堢磼鏉堛劍灏扮紒妤冨枑缁绘繈宕橀…鎴滅处闂傚倸鍊风粈浣圭珶婵犲洤纾婚柛鈩冪☉缁愭鏌涢埄鍐剧劷妞も晛寮剁换婵囩節閸屾粌顤�闂佺粯鎸荤粙鎾绘晸閽樺鐣柛搴ㄤ憾瀹曨垶顢曢敐鍕畾闂佺鍕垫畷闁绘挸鍟撮弻娑樷枎瀹ュ懎濮㈢紓浣瑰姈濡啴寮婚垾宕囨殕闁跨喍绮欏畷浼村冀椤撶偟鐣哄┑鐘诧工閻楀棛绮婚敐澶嬬厵闁绘垶蓱鐏忣參鏌＄�ｃ劌锟芥繂顫忕紒妯诲闁告稑锕ラ崕鎾绘⒑閸濆嫮澧遍柛鎾跺枛楠炲棝宕熼锝嗘櫖闂佺粯鍔欏褏绮婇敃鍌涒拺闁革富鍘奸崝瀣煕閵堝繒鐣电�殿噮鍣ｉ弫鎾寸鐎ｎ亞顔嗛梺鍛婁緱閸ㄩ亶宕伴崱娑欑厱闁哄洢鍔屾晶濠氭煕閻曞倹瀚�??:").append(npc.npcbaseid)
							.append(",sceneid:").append(npc.sceneid)
							.append(",ownerid:").append(npc.ownerid)
							.append(",sceneidlong:").append(scene.getSceneID()));
				}
			}
			else
				scene = SceneManager.getInstance().getSceneByID(npc.sceneid);
			SceneNpcManager.getInstance().summonNpcAndUpdateGS(scene, new Position(posx, posy), n,npc.time);
			
			int mapid = (int) npc.sceneid;
			if (mapid >= 1851 && mapid <= 1870) {
				if (SceneManager.logger.isInfoEnabled()) {
					SceneManager.logger.info(new StringBuilder().append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹂柣鎾冲瘨閻斿棙绻濋棃娑氬闁搞倧鎷锋俊鐐�ら崑鍛崲閸曨垰绠查柛鏇ㄥ灡閹偤鎮归崶锝呭⒉鐞氀勭節閻㈤潧啸闁轰焦鎮傚畷鎴︽倷閸濆嫬鐎梺鍛婃尫缁�渚�寮搁崼顫嫹楠炲灝鍔氭い褝鎷风紓鍌氱У閻楃娀寮婚敓鐘茬倞闁崇尨鎷风紒鍗炵－閹叉悂鎮ч崼婵堢懆缂備緤鎷烽柛宀�鍋為悡鏇㈢叓閸ャ劏澹樺ù婊冩贡缁辨帞锟斤綆浜濆婵堢磼鏉堛劍灏扮紒妤冨枑缁绘繈宕橀…鎴滅处闂傚倸鍊风粈浣圭珶婵犲洤纾婚柛鈩冪☉缁愭鏌涢埄鍐剧劷妞も晛寮剁换婵囩節閸屾粌顤�闂佺粯鎸荤粙鎾绘晸閽樺鐣柛搴ㄤ憾瀹曨垶顢曢敐鍕畾闂佺鍕垫畷闁绘挸鍟撮弻娑樷枎瀹ュ懎濮㈢紓浣瑰姈濡啴寮婚垾宕囨殕闁跨喍绮欏畷浼村冀椤撶偟鐣哄┑鐘诧工閻楀棛绮婚敐澶嬬厵闁绘垶蓱鐏忣參鏌＄�ｃ劌锟芥繂顫忕紒妯诲闁告稑锕ラ崕鎾绘⒑閸濆嫮澧遍柛鎾跺枛楠炲棝宕熼锝嗘櫖闂佺粯鍔欏褏绮婇敃鍌涒拺闁革富鍘奸崝瀣煕閵堝繒鐣电�殿噮鍣ｉ弫鎾寸鐎ｎ亞顔嗛梺鍛婁緱閸ㄩ亶宕伴崱娑欑厱闁哄洢鍔屾晶濠氭煕閻曞倹瀚�??:").append(npc.npcbaseid)
							.append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欌敍缂傚倸绉甸悧鐘诲箖濡ゅ懏鏅查幖绮瑰墲閻忓牏绱撴笟濠冨闁诲函缍嗛崑浣圭濠婂牊鐓欓柟浣冩珪濞呭懘鏌ｉ幒鏂垮妺缂佺粯鐩畷妤呭礂绾拌鲸顥堟繝娈垮枛閿曪妇鍒掗鐐茬闁告稑鐡ㄩ幆鐐烘煟閻旂顥嬫い鎰偢濮婄粯鎷呴搹鐟扮濡炪們鍔岀换妯虹暦閵忋倕绀堢憸搴綖閺囥垺鐓熼柟閭﹀墰閹界姴鈹戦娑欏唉闁哄本鐩獮姗�寮堕幋鐘点偡婵犵數鍋涢悧鍕礉瀹ュ洦宕叉繛鎴欏灩缁狙囨煙鐎涙绠栭柛濠庡灦濮婅櫣鎷犻垾宕囦哗闂佹椿鍘奸崐鎼侇敋閿濆鏁冮柕蹇婃櫅閹垶绻濋姀锝嗙【妞ゆ垵娲畷銏ゎ敂閸啿鎷洪梺鍛婃尰瑜板啯绂嶅┑鍫㈢＜閻犲洦褰冮弳娆愩亜閺傝法绠伴柍瑙勫灩閿熸枻缍嗛崑鍡涘储閽樺鏀介柣鎰綑閻忚鲸绻涢崨顔界闁跨喕濮ら悢顒勫箯閿燂拷 X 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂佺偓鍎抽…鐑藉蓟閺囩喓绠鹃柣鎰靛墯閻濇梻绱掗悙顒�鍔ゆ繛纭风節瀵鏁嶉崟顏呭媰闁荤姴娲﹁ぐ鍐╂叏鎼淬劍鈷戦柦妯侯槸閺嗙喖鏌涢悩宕囧⒌鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�??").append(posx)
							.append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欌敍缂傚倸绉甸悧鐘诲箖濡ゅ懏鏅查幖绮瑰墲閻忓牏绱撴笟濠冨闁诲函缍嗛崑浣圭濠婂牊鐓欓柟浣冩珪濞呭懘鏌ｉ幒鏂垮妺缂佺粯鐩畷妤呭礂绾拌鲸顥堟繝娈垮枛閿曪妇鍒掗鐐茬闁告稑鐡ㄩ幆鐐烘煟閻旂顥嬫い鎰偢濮婄粯鎷呴搹鐟扮濡炪們鍔岀换妯虹暦閵忋倕绀堢憸搴綖閺囥垺鐓熼柟閭﹀墰閹界姴鈹戦娑欏唉闁哄本鐩獮姗�寮堕幋鐘点偡婵犵數鍋涢悧鍕礉瀹ュ洦宕叉繛鎴欏灩缁狙囨煙鐎涙绠栭柛濠庡灦濮婅櫣鎷犻垾宕囦哗闂佹椿鍘奸崐鎼侇敋閿濆鏁冮柕蹇婃櫅閹垶绻濋姀锝嗙【妞ゆ垵娲畷銏ゎ敂閸啿鎷洪梺鍛婃尰瑜板啯绂嶅┑鍫㈢＜閻犲洦褰冮弳娆愩亜閺傝法绠伴柍瑙勫灩閿熸枻缍嗛崑鍡涘储閽樺鏀介柣鎰綑閻忚鲸绻涢崨顔界闁跨喕濮ら悢顒勫箯閿燂拷 Y 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂佺偓鍎抽…鐑藉蓟閺囩喓绠鹃柣鎰靛墯閻濇梻绱掗悙顒�鍔ゆ繛纭风節瀵鏁嶉崟顏呭媰闁荤姴娲﹁ぐ鍐╂叏鎼淬劍鈷戦柦妯侯槸閺嗙喖鏌涢悩宕囧⒌鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�??").append(posx)
							.append(",sceneid:").append(npc.sceneid)
							.append(",ownerid:").append(npc.ownerid)
							.append(",sceneidlong:").append(scene.getSceneID()));
				}
			}
		}
		catch (Exception e) {
			SceneManager.logger.error("create npc by map failed.npcid:"
					+ npc.npcbaseid + ",sceneid:" + npc.sceneid + ",ownerid:" + npc.ownerid + ",scene:" + scene
					, e);
			if (scene != null) {
				SceneManager.logger.error("sceneidlong:" + scene.getSceneID());
			}
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730399;

	public int getType() {
		return 730399;
	}

	public fire.msp.npc.CreateNpcInfo npc;
	public int posx;
	public int posy;

	public GCreateNPCByPos() {
		npc = new fire.msp.npc.CreateNpcInfo();
	}

	public GCreateNPCByPos(fire.msp.npc.CreateNpcInfo _npc_, int _posx_, int _posy_) {
		this.npc = _npc_;
		this.posx = _posx_;
		this.posy = _posy_;
	}

	public final boolean _validator_() {
		if (!npc._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npc);
		_os_.marshal(posx);
		_os_.marshal(posy);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npc.unmarshal(_os_);
		posx = _os_.unmarshal_int();
		posy = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GCreateNPCByPos) {
			GCreateNPCByPos _o_ = (GCreateNPCByPos)_o1_;
			if (!npc.equals(_o_.npc)) return false;
			if (posx != _o_.posx) return false;
			if (posy != _o_.posy) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += npc.hashCode();
		_h_ += posx;
		_h_ += posy;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npc).append(",");
		_sb_.append(posx).append(",");
		_sb_.append(posy).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

