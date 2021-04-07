
package fire.msp.npc;

import java.util.Map;

import fire.pb.PropRole;
import fire.pb.battle.QCRoleInfoDes;
import fire.pb.battle.QCRoleInfoWatchDes;
import fire.pb.battle.QCmodelType;
import fire.pb.battle.SPlayPKFightView;

import fire.pb.team.Team;
import fire.pb.team.TeamManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __MCheckCanPlayPKView__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class MCheckCanPlayPKView extends __MCheckCanPlayPKView__ {
	@Override
	protected void process() {
		mkdb.Procedure proc=new mkdb.Procedure(){
			@Override
			protected boolean process() throws Exception {
				SPlayPKFightView sPlayPKFightView=new SPlayPKFightView();
				sPlayPKFightView.levelindex=levelindex;
				sPlayPKFightView.modeltype=modeltype;
				sPlayPKFightView.school=school;
				
				if(modeltype==QCmodelType.WATCH_FIGHT){
					for (Map.Entry<Long, Long> entry : watchid.entrySet()){
						long oneid=entry.getKey();
						long otherid=entry.getValue();
						QCRoleInfoDes qCRoleInfoDes1 = createQCRoleInfoDes(oneid);
						QCRoleInfoDes qCRoleInfoDes2 = createQCRoleInfoDes(otherid);
						QCRoleInfoWatchDes qcRoleInfoWatchDes=new QCRoleInfoWatchDes();
						qcRoleInfoWatchDes.role1=qCRoleInfoDes1;
						qcRoleInfoWatchDes.role2=qCRoleInfoDes2;
						sPlayPKFightView.rolewatchlist.add(qcRoleInfoWatchDes);
					}
				}else{
					for(Long id:rolelistid){
						QCRoleInfoDes qCRoleInfoDes = createQCRoleInfoDes(id);
						sPlayPKFightView.rolelist.add(qCRoleInfoDes);
					}
				}
				
				mkdb.Procedure.psendWhileCommit(hostid, sPlayPKFightView);
				return true;
			}
			
		};
		proc.submit();
	}
	
	private QCRoleInfoDes createQCRoleInfoDes(long id){
		PropRole propRole = new PropRole(id, true);
		QCRoleInfoDes qCRoleInfoDes = new QCRoleInfoDes();
		qCRoleInfoDes.roleid=propRole.getRoleId();//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕鍏兼叏濮楋拷绾悂寮抽敓锟�
		qCRoleInfoDes.rolename=propRole.getName();//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敂钘変汗闂佸憡鐟ラˇ浼村箖濞嗘挻鐓熼柣鏂挎憸閹虫洟鏌熼崙銈嗗?
		qCRoleInfoDes.shape=propRole.getShape();//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敂钘変汗闂佸憡鐟ラˇ顖炈囬埡鍛拺缂備焦锚缁楁帗銇勯鐘插幋鐎殿喖顭烽弫鎰板川閸屾粌鏋涚�规洖缍婇、娆撴倷椤掑娈戦梻鍌氬�峰ù鍥р枖閺囥垹绐楅柟鐗堟緲閸戠姴鈹戦悩瀹犲缂佺媭鍨堕弻銊╂偆閸屾稑顏�
		qCRoleInfoDes.level=propRole.getLevel();//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敂钘変汗闂佸湱绮敮鈺傚閿熻棄鈹戦敍鍕户闁硅櫕鎹囧畷顖炲锤濡炰紮鎷烽敂鐐磯闁靛绠戠壕顖炴⒑閹呯婵狅拷闁秴绀夋い鏍仦閳锋垹绱撴担濮戭亪宕伴弴銏＄厵闁告垯鍊栫�氾拷
		qCRoleInfoDes.school=propRole.getSchool();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻娑㈩敃閿濆棛顦ョ紓渚婃嫹濠㈣泛鐭夐幏鐑界嵁閸喖濮庨梺璇″灡閹稿骞嗛弮鍫澪╅柨鏃囧Г椤忕喖姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷
		Team team = TeamManager.selectTeamByRoleId(id);
		if(team!=null){
			//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾粌顤�闂佺顑戠换婵嬪蓟瀹ュ浼犻柛鏇ㄥ墮濞咃綁姊婚崒姘簽闁搞劌鐖煎濠氭晲婢跺﹦顓洪梺鎸庣箓閹叉盯骞樼紒妯煎帗闂備礁鐏濋鍡楃暦瀹�鍕厸鐎癸拷鐎ｎ剛袦閻庢鍣崜鐔风暦瑜版帩鏁嬮柛娑卞枟椤旀垹绱撻崒姘拷椋庢閵堝绠�瑰嫭澹嬮弨浠嬫煟濡搫绾у璺哄閺岋綁骞樼�垫悶锟芥帡鏌ㄩ悢缁橆棄缂佺姴绉瑰畷鏇㈡焼瀹ュ懐鐤囬棅顐㈡处缁嬫垹绮昏ぐ鎺撶厵闂侇叏绠戦弸銈囩棯閹规劕浜圭紒杈ㄦ尰閹峰懘鎳栭埄鍐ㄧ伌閽樼喖鏌涢銈呮瀺缂佽妫欓妵鍕箛闂堟稑顫柣搴㈢啲閹凤拷?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅絾绻濋姀锛勭畵缂傚秴锕顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷?闂傚倸鍊搁崐椋庣矆娓氾拷楠炲鏁撻悩鑼槷闂佹寧娲栭崐鎼佸磼閵娿儍褰掓偐瀹割喖鍓鹃梺杞版缁舵岸寮婚妸鈺傚亞闁稿本绋戦锟� 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠煑閼恒儳鈽夐摶鏍煕濞戝崬骞橀柨娑欑懄缁绘繈鎮介棃娴讹綁鏌涢埡浣告殻闁轰焦鎹囬幊鐐哄Ψ瑜嶉埛宀勬倵鐟欏嫭绀�闁绘牕銈搁妴浣肝旀担鐟邦�撻梺鍛婄懃椤︻垶鎯佽濮婂宕掑▎鎺戝帯缂備緡鍣崹璺侯嚕婵犳艾惟闁挎棁濮ら悵鐑芥煙閼圭増褰х紒鎻掓健閹矂宕卞缁樻杸闂佺粯锚瀵埖寰勯崟顖涚厽闁规崘娉涢弸娑㈡煛鐏炵偓绀冪紒缁樼洴瀹曞綊顢欓悡搴經濠碉紕鍋戦崐鏇灻瑰璺虹；濠电姴娲ょ粻鏍归悩宸剾闁轰礁绉电换婵嬫濞戞瑧銈╂繛瀵稿Л閺呯姴顫忛搹瑙勫磯闁靛鍎查悘渚�姊洪崫鍕闁稿锕俊瀛樻媴閸︻厾鐦堥梺绋挎湰椤ㄥ棝鎮橀崘銊㈡斀闁绘劖娼欓悘锕傛煥閺囥劌浜伴柟铏崌楠炴劖鎯斿☉妤冪泿闂傚鍋勫ú锕傚箰閻愵剚娅犻柡鍥╁Х绾惧ジ鏌ㄩ悢鍓佺煓鐎规洖宕埥澶娾枎閹存繂绠為梻鍌欑窔濞佳囁囬銏犲瀭闁告繂瀚ч弸宥夋煙閸撗呯瘈缂佽妫欓妵鍕箛闂堟稑顫柣搴㈢啲閹凤拷
			//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换娑㈠箣閻愨晜锛堝┑鐐叉▕娴滄繈寮插┑瀣厱閻忕偟鍋撻惃鎴炪亜閺傛寧鍤囨慨濠冩そ濡啫鈽夊顒夋毇婵＄偑鍊х�靛矂宕瑰畷鍥у灊濠电姵鑹剧粈鍐拷鐟板閸犳岸宕悽鍛娾拺闁稿繐鍚嬮崐鎰箾娴ｅ啿瀚崣蹇涙煕椤愶絿濡囬柡锟介懞銉ｄ簻闁哄啫鍊瑰▍鏇㈡煟椤撶喎绗氶柟渚垮妽缁绘繈宕掗妶鍥ф倯闁诲氦顫夊ú姗�鏁冮姀銈冿拷渚�寮崼婵堫槹濡炪倖甯掗崐鐑芥焽椤栫偞鈷掗柛灞剧懅椤︼箓鏌熺喊鍗炰簻閾荤偞绻濋棃娑欏窛妞も晜鐓￠弻娑㈩敃閿濆棛顦悗瑙勬尫缁舵岸骞冨Δ鍛櫜閹肩补鍓濋悘鍫㈢磽娴ｅ搫校缂佸甯℃俊鐢稿礋椤栨氨顔婇悗骞垮劚濞村倸危椤曪拷濮婃椽宕崟闈涘妧闂佺懓鍤栭幏锟�
			if(team.getTeamLeaderId()!=id){
				qCRoleInfoDes.teamnum=0;
				qCRoleInfoDes.teamnummax=0;
			}else{
				qCRoleInfoDes.teamnum=team.getNormalMemberIds().size();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱閻忥綁鏌涢顐＄盎闂囧绻濇繝鍌氭殶缂佸妞介弻鈥崇暆閿熶粙宕伴弽顓犲祦闁糕剝鍑瑰Σ濠氭⒑閸濆嫭顥″瀛樻倐婵＄敻宕熼姣佳囨煕濞戝崬鏋涙繛鍜冪秮濮婂宕惰濡插湱绱掔紒妯肩畺缂佺粯绻堝畷鎺戔槈濡椿浠╅梻鍌欑閹诧繝寮婚妸鈺婃晞濠㈣埖鍔曢拑鐔兼煥閻斿搫孝妤犵偑鍨洪妵鍕箻鐠虹儤鐎诲銈呴獜閹凤拷
				qCRoleInfoDes.teamnummax=TeamManager.MAX_MEMBER_COUNT+1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱婢ь垶鏌熼姘卞ⅵ闁诡喗顨呴～婵嬫倷椤掞拷椤忥拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿顦甸弻鏇＄疀鐎ｎ亷鎷烽弴鐘差棜闁稿繗鍋愮粻楣冩煙鐎电浠фい锝堝皺缁辨帡濡歌娴犺鲸鎱ㄦ繝鍕笡闁瑰嘲鎳樺畷顐﹀礋椤撶噥鍚囬梻鍌欒兌閹虫捇宕甸弽顓炵闁跨噦鎷�?
			}
		}else{
			qCRoleInfoDes.teamnum=0;
			qCRoleInfoDes.teamnummax=0;
		}
		return qCRoleInfoDes;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730440;

	public int getType() {
		return 730440;
	}

	public long hostid;
	public int modeltype; // 模块类型
	public int school; // 删选的职业 -1表示全职业
	public int levelindex; // 删选的角色等级区间 0表示全选
	public java.util.LinkedList<Long> rolelistid; // 角色列表
	public java.util.HashMap<Long,Long> watchid; // 观看角色列表

	public MCheckCanPlayPKView() {
		rolelistid = new java.util.LinkedList<Long>();
		watchid = new java.util.HashMap<Long,Long>();
	}

	public MCheckCanPlayPKView(long _hostid_, int _modeltype_, int _school_, int _levelindex_, java.util.LinkedList<Long> _rolelistid_, java.util.HashMap<Long,Long> _watchid_) {
		this.hostid = _hostid_;
		this.modeltype = _modeltype_;
		this.school = _school_;
		this.levelindex = _levelindex_;
		this.rolelistid = _rolelistid_;
		this.watchid = _watchid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(hostid);
		_os_.marshal(modeltype);
		_os_.marshal(school);
		_os_.marshal(levelindex);
		_os_.compact_uint32(rolelistid.size());
		for (Long _v_ : rolelistid) {
			_os_.marshal(_v_);
		}
		_os_.compact_uint32(watchid.size());
		for (java.util.Map.Entry<Long, Long> _e_ : watchid.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		hostid = _os_.unmarshal_long();
		modeltype = _os_.unmarshal_int();
		school = _os_.unmarshal_int();
		levelindex = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			long _v_;
			_v_ = _os_.unmarshal_long();
			rolelistid.add(_v_);
		}
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			long _k_;
			_k_ = _os_.unmarshal_long();
			long _v_;
			_v_ = _os_.unmarshal_long();
			watchid.put(_k_, _v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof MCheckCanPlayPKView) {
			MCheckCanPlayPKView _o_ = (MCheckCanPlayPKView)_o1_;
			if (hostid != _o_.hostid) return false;
			if (modeltype != _o_.modeltype) return false;
			if (school != _o_.school) return false;
			if (levelindex != _o_.levelindex) return false;
			if (!rolelistid.equals(_o_.rolelistid)) return false;
			if (!watchid.equals(_o_.watchid)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)hostid;
		_h_ += modeltype;
		_h_ += school;
		_h_ += levelindex;
		_h_ += rolelistid.hashCode();
		_h_ += watchid.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(hostid).append(",");
		_sb_.append(modeltype).append(",");
		_sb_.append(school).append(",");
		_sb_.append(levelindex).append(",");
		_sb_.append(rolelistid).append(",");
		_sb_.append(watchid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

