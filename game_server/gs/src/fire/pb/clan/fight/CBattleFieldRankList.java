
package fire.pb.clan.fight;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CBattleFieldRankList__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/**
 * 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵閸犳牜澹曢崸妤佺厵闁诡垳澧楅ˉ澶愬箹閺夋埊韬柡灞诲�濋幊婵嬪箥椤旇偐澧┑鐐茬摠缁瞼绱炴繝鍥ц摕婵炴垯鍨瑰敮濡炪倖姊婚崢褔锝為埡鍐＝濞达絽鎼鎾剁磼閼碱剙浜剧紒宀冮哺缁绘繈宕堕懜鍨珫婵犵數濮撮敃銈夊疮椤愶絼绻嗛柧蹇撴贡绾捐棄霉閿濆娑у┑鈥茬矙閺屻倛銇愰幒鏃傛毇闂佺硶鏂傞崕鎻掝嚗閸曨垰绠涙い鎺戝亞閸熷矂姊绘担鍛婂暈闁告梹鍨垮畷婵嗙暆閿熺晫鍒掗懡銈嗗珰婵炴潙顑嗛弬锟介梻浣虹帛閸旀浜稿▎鎰珷婵炴垯鍨洪悡鏇㈡煏婵炲灝鍔滈悹鎰剁節閺屾盯骞掗幘铏癁閻庢鍣崳锝呯暦婵傚壊鏁冮柨婵嗘閻濐偄鈹戦悩鎰佸晱闁哥姵顨婇弫鍐煛閸涱厾顦┑鐐村灟閸ㄦ椽寮查幖浣圭參婵☆垯璀﹀Ο鍫ユ煟閹剧偨鍋㈤柡灞革拷宕囨殕闁跨喍绮欏畷浼村冀椤撶偟鐣哄┑鐘诧工閸氭﹢鎮㈤崗鍏煎劒闁荤姴娲犻敓钘夊暱婢瑰棙绻濈喊澶岀？闁稿鍨垮畷鎰板Χ閸滀胶鍞垫繛鎾寸啲閹烽攱顨ラ悙鑼闁轰焦鎹囬弫鎾绘晸閿燂拷 by changhao
 */
public class CBattleFieldRankList extends __CBattleFieldRankList__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		mkdb.Procedure battlefieldranklist = new mkdb.Procedure()
		{
			@Override
			protected boolean process()  throws Exception
			{
				Long c1 = xtable.Roleid2clanfightid.select(roleid); //婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佲枙闁绘帟濮ょ换娑㈠幢濡粯鍎庨梺杞扮鐎氫即寮诲☉銏犵労闁告劧缂氱花鐢告⒑閹稿海绠撴い锔诲灣缁鎮烽幊濠傜秺閺佹劙宕卞▎鎰晸闁荤偞纰嶇换鍫濐潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙瀵搞偞闁哄懐濞�閻涱喛绠涘☉娆戝弳闁诲函缍嗛崜娑㈡儊閸儲鈷戦悹鎭掑妼閺嬪秶绱掗鐣屾噰闁靛棔绶氬顕�宕煎┑瀣暪婵犵數濞�濞佳囨偋濠婂牆瑙﹂柛娑卞枤缁★拷缂佸墽澧楄摫妞ゎ偄锕弻娑㈠Ω閿曪拷閳绘洜锟借娲樺ú鐔镐繆閸洖鐐婃い蹇撳珔閳ユ枼鏀芥い鏃�鏋绘笟娑㈡煕韫囨枂顏勫祫闂佸壊鍋侀崕鏌ユ偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷? by changhao
				if (c1 == null)
				{
					return false;
				}
				
				xbean.EClanFightStatistics statistics = xtable.Roleid2clanfightstatistics.select(roleid);
				if (statistics == null)
				{
					return false;
				}
				
				long cur = System.currentTimeMillis();
				if (cur < statistics.getLastcbattlefieldrankliststamp() + 20000) //闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿Ψ椤旇姤娅堥梻浣虹《閸撴繄绮欓幒妤�纾挎俊銈勯檷娴滄粓鏌￠崒姘变虎闁抽攱姊荤槐鎺楁偐閾忣偒妫冮梺鍝勬湰缁嬫垿鍩ユ径濞炬瀻闁归偊鍠氶埢蹇曠磽閸屾瑧璐伴柛瀣缁棁銇愰幒鎴ｆ憰濠电偞鍨崺鍕极閸愵喗鐓ユ繝闈涙椤ョ姵銇勯敂鍝勫婵﹥妞介獮鎰償閿濆喛鎷烽幒妤佺厱闁绘ê纾晶顏呫亜椤愩垻绠茬紒缁樼箓椤繈顢楅崒銈喰у┑锛勫亼閸婃牜鏁鍫濈鐎瑰嫭澹嬮弨鑺ャ亜閺傚灝鎮戦柛鐘筹耿閺岋紕浠﹂崜褎鍒涢梺绯曟櫔缁辨洟鏁撻弬銈囩У闁稿瀚伴、鏃堟晸閿燂拷 by changhao
				{
					return false;
				}
				
				SBattleFieldRankList msg = new SBattleFieldRankList();
				msg.myrank = -1;
				
				fire.pb.clan.fight.ClanFightBattleField bf = fire.pb.clan.fight.ClanFightFactory.getClanFightBattleField(c1, true);
				if (bf != null)
				{
					msg.clanscore1 = bf.getClanfightBean().getClanscore1();
					msg.clanscroe2 = bf.getClanfightBean().getClanscore2();
					
					int which = bf.getSideByRoleId(roleid);
					if (which != 0 && which != 1)
					{
						return false;
					}
					
					java.util.List<xbean.BattleFieldScroeRank> list = null;
					java.util.Map<Long, Integer> map = null;
					if (which == 0)
					{
						list = bf.getClanfightBean().getClan1roleranklist();
						map = bf.getClanfightBean().getClan1rolerankmap();
					}
					else if (which == 1)
					{
						list = bf.getClanfightBean().getClan2roleranklist();
						map = bf.getClanfightBean().getClan2rolerankmap();					
					}
					else
					{
						return false;
					}
					
					Integer rank = map.get(roleid);
					if (rank != null)
					{
						msg.myrank = rank;
						xbean.BattleFieldScroeRank r = list.get(rank);
						if (r != null)
						{
							msg.myscore = r.getScroe();
						}
					}
					
					int count = 0;
					for (xbean.BattleFieldScroeRank e : bf.getClanfightBean().getClan1roleranklist())
					{
						if (count >= 50) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌涘┑鍕姷闁瑰嘲鍢查～婵嬫偂鎼达紕鐫勯柣搴ゎ潐濞叉鎹㈤崼婵愬殨闁圭虎鍠栭～鍛存煟濡寧鐝悮锝呪攽閻樿尙妫勯柡澶婂皡閹风柉顦规鐐茬箲椤︾増鎯旈姀鐘辩病婵犵數鍋涘Λ娆撳箰妤ｅ啫鐭楅柟鍓х帛閻撴洟鏌曟径娑氬埌濠德ゅГ閵囧嫰濡烽敂绛嬫闂佸搫鏈粙鎾绘晸閺傘倗绋婚柡灞诲妼鐓ら柨鏇炲�归崑鍌炴煛閸モ晛鏋旂紒鐘荤畺閺屾盯鍩勯崘锝嗭紙闂佸吋绁撮弲鐐存叏閸愬樊娓婚悗锝庝簼閹癸絿鐥幆褋鍋㈤柡宀�鍠栭獮鎾诲箳濠靛棗澹夐梺璇插閻旑剟骞忛敓锟�50濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閺勩儱鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�? by changhao
						{
							break;
						}
						
						fire.pb.clan.fight.RoleBattleFieldRank r = new fire.pb.clan.fight.RoleBattleFieldRank();
						String name = bf.getClanfightBean().getEnterroleids().get(e.getRoleid());
						if (name != null)
						{
							r.rolename = name;
							r.rolescroe = e.getScroe();
							msg.ranklist1.add(r);
							count ++;							
						}
					}
					
					count = 0;
					for (xbean.BattleFieldScroeRank e : bf.getClanfightBean().getClan2roleranklist())
					{
						if (count >= 50) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌涘┑鍕姷闁瑰嘲鍢查～婵嬫偂鎼达紕鐫勯柣搴ゎ潐濞叉鎹㈤崼婵愬殨闁圭虎鍠栭～鍛存煟濡寧鐝悮锝呪攽閻樿尙妫勯柡澶婂皡閹风柉顦规鐐茬箲椤︾増鎯旈姀鐘辩病婵犵數鍋涘Λ娆撳箰妤ｅ啫鐭楅柟鍓х帛閻撴洟鏌曟径娑氬埌濠德ゅГ閵囧嫰濡烽敂绛嬫闂佸搫鏈粙鎾绘晸閺傘倗绋婚柡灞诲妼鐓ら柨鏇炲�归崑鍌炴煛閸モ晛鏋旂紒鐘荤畺閺屾盯鍩勯崘锝嗭紙闂佸吋绁撮弲鐐存叏閸愬樊娓婚悗锝庝簼閹癸絿鐥幆褋鍋㈤柡宀�鍠栭獮鎾诲箳濠靛棗澹夐梺璇插閻旑剟骞忛敓锟�50濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閺勩儱鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�? by changhao
						{
							break;
						}
						
						fire.pb.clan.fight.RoleBattleFieldRank r = new fire.pb.clan.fight.RoleBattleFieldRank();
						String name = bf.getClanfightBean().getEnterroleids().get(e.getRoleid());
						if (name != null)
						{
							r.rolescroe = e.getScroe();
							r.rolename = name;
							msg.ranklist2.add(r);
							count ++;
						}
					}
					
					psendWhileCommit(roleid, msg);
				}
				
				return true;
			}
		};
		
		battlefieldranklist.submit();			
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808538;

	public int getType() {
		return 808538;
	}


	public CBattleFieldRankList() {
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
		if (_o1_ instanceof CBattleFieldRankList) {
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

	public int compareTo(CBattleFieldRankList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

