
package fire.pb.battle.livedie;

import fire.pb.PropRole;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
import gnet.link.Onlines;
import java.util.Map.Entry;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveDieBattleWatchView__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CLiveDieBattleWatchView extends __CLiveDieBattleWatchView__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				SLiveDieBattleWatchView sLiveDieBattleWatchView=new SLiveDieBattleWatchView();
				for(Entry<Long, Long> entry:LiveDieMange.liveDieFightRoleids.entrySet()){
					long oneid=entry.getKey();
					long otherid=entry.getValue();
					LDRoleInfoDes qCRoleInfoDes1 = createLDRoleInfoDes(oneid);
					LDRoleInfoDes qCRoleInfoDes2 = createLDRoleInfoDes(otherid);
					LDRoleInfoWatchDes lDRoleInfoWatchDes=new LDRoleInfoWatchDes();
					lDRoleInfoWatchDes.role1=qCRoleInfoDes1;
					lDRoleInfoWatchDes.role2=qCRoleInfoDes2;
					sLiveDieBattleWatchView.rolewatchlist.add(lDRoleInfoWatchDes);
				}
				Onlines.getInstance().send(roleid, sLiveDieBattleWatchView);
				return true;
			};
		}.submit();
		
	}
	
	/**
	 * 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻鏇熷緞閸℃ɑ鐝旂紒鐐劤濠�閬嶅箟閹间焦鍋嬮柛顐ｇ箘閻熴劑姊洪幖鐐插闁稿﹤缍婃俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁伙拷闁哥姴锕娲捶椤撶偛骞嬮梺鐚存嫹闂侇剙绉寸粻顖炴煕濞戞瑦缍戠紒锟介崘顔界厽闁逛即娼ф晶鎵磼婢跺﹤妲婚柍瑙勫灴閹晠顢曢敐鍜侊拷蹇涙⒑閸涘﹥澶勯柛姗�绠栭幃锟犲磼閻愮补鎷洪悷婊呭鐢晛螞閹存績鏀介柣鎴濇处鐎氬綊姊绘担鑺ャ�冪紒锟芥笟锟藉畷鎰板锤濡わ拷缁犳澘鈹戦悩鎻掓殭缂佸墎鍋涢埞鎴︽偐閹绘帊绨藉┑鈽嗗亾閹凤拷
	 * @param id
	 * @return
	 */
	public LDRoleInfoDes createLDRoleInfoDes(long id){
		PropRole propRole = new PropRole(id, true);
		LDRoleInfoDes lDRoleInfoDes = new LDRoleInfoDes();
		lDRoleInfoDes.roleid=propRole.getRoleId();//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕鍏兼叏濮楋拷绾悂寮抽敓锟�
		lDRoleInfoDes.rolename=propRole.getName();//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敂钘変汗闂佸憡鐟ラˇ浼村箖濞嗘挻鐓熼柣鏂挎憸閹虫洟鏌熼崙銈嗗?
		lDRoleInfoDes.shape=propRole.getShape();//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敂钘変汗闂佸憡鐟ラˇ顖炈囬埡鍛拺缂備焦锚缁楁帗銇勯鐘插幋鐎殿喖顭烽弫鎰板川閸屾粌鏋涚�规洖缍婇、娆撴倷椤掑娈戦梻鍌氬�峰ù鍥р枖閺囥垹绐楅柟鐗堟緲閸戠姴鈹戦悩瀹犲缂佺媭鍨堕弻銊╂偆閸屾稑顏�
		lDRoleInfoDes.level=propRole.getLevel();//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敂钘変汗闂佸湱绮敮鈺傚閿熻棄鈹戦敍鍕户闁硅櫕鎹囧畷顖炲锤濡炰紮鎷烽敂鐐磯闁靛绠戠壕顖炴⒑閹呯婵狅拷闁秴绀夋い鏍仦閳锋垹绱撴担濮戭亪宕伴弴銏＄厵闁告垯鍊栫�氾拷
		lDRoleInfoDes.school=propRole.getSchool();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻娑㈩敃閿濆棛顦ョ紓渚婃嫹濠㈣泛鐭夐幏鐑界嵁閸喖濮庨梺璇″灡閹稿骞嗛弮鍫澪╅柨鏃囧Г椤忕喖姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷
		Team team = TeamManager.selectTeamByRoleId(id);
		if(team!=null&&team.getTeamLeaderId()==id){
			lDRoleInfoDes.teamnum=team.getTeamInfo().getMembers().size()+1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱閻忥綁鏌涢顐＄盎闂囧绻濇繝鍌氭殶缂佸妞介弻鈥崇暆閿熶粙宕伴弽顓犲祦闁糕剝鍑瑰Σ濠氭⒑閸濆嫭顥″瀛樻倐婵＄敻宕熼姣佳囨煕濞戝崬鏋涙繛鍜冪秮濮婂宕惰濡插湱绱掔紒妯肩畺缂佺粯绻堝畷鎺戔槈濡椿浠╅梻鍌欑閹诧繝寮婚妸鈺婃晞濠㈣埖鍔曢拑鐔兼煥閻斿搫孝妤犵偑鍨洪妵鍕箻鐠虹儤鐎诲銈呴獜閹凤拷
			lDRoleInfoDes.teamnummax=TeamManager.MAX_MEMBER_COUNT+1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱婢ь垶鏌熼姘卞ⅵ闁诡喗顨呴～婵嬫倷椤掞拷椤忥拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿顦甸弻鏇＄疀鐎ｎ亷鎷烽弴鐘差棜闁稿繗鍋愮粻楣冩煙鐎电浠фい锝堝皺缁辨帡濡歌娴犺鲸鎱ㄦ繝鍕笡闁瑰嘲鎳樺畷顐﹀礋椤撶噥鍚囬梻鍌欒兌閹虫捇宕甸弽顓炵闁跨噦鎷�?
		}else{
			lDRoleInfoDes.teamnum=0;
			lDRoleInfoDes.teamnummax=0;
		}
		return lDRoleInfoDes;
	}
	
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793840;

	public int getType() {
		return 793840;
	}


	public CLiveDieBattleWatchView() {
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
		if (_o1_ instanceof CLiveDieBattleWatchView) {
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

	public int compareTo(CLiveDieBattleWatchView _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

