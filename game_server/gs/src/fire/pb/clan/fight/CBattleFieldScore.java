
package fire.pb.clan.fight;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CBattleFieldScore__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CBattleFieldScore extends __CBattleFieldScore__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		mkdb.Procedure battlefieldscore = new mkdb.Procedure()
		{
			@Override
			protected boolean process()  throws Exception
			{
				Long c1 = xtable.Roleid2clanfightid.select(roleid); //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋婵愭綗闁跨喕妫勯崐鍧楀箰婵犲啰鐝堕柍鍝勵儑缁夘喚锟借娲滈崰鏍�佸☉姗嗘僵濡插本鐗曢弫鎼佹⒒閸屾瑦绁版繛澶嬫礋瀹曟娊鏁冮崒姘鳖唵闂佽法鍣﹂幏锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊璁查弸娆撴⒑缂佹ê绗╁┑顔哄�楅幑銏犫槈閵忕姴鑰垮┑鈽嗗灣缁垶宕曟惔銊︹拺閺夌偞澹嗛ˇ锕傛倵濮橆偄宓嗙�殿喛顕ч埥澶愬閻橀潧濮堕梻浣告啞閸斞呯磽濮樿精濮抽柣銏犳啞閳锋垿鏌熺粙鎸庢崳缂佺姵鎸婚妵鍕晜鐠囪尙浠紓渚囧枛椤兘骞冮悜钘夌疇濠电姴鍊荤粔娲煛娴ｇ懓濮嶇�规洖宕埢搴ㄥ箛椤撶偞娅㈤梻浣藉吹閸嬬偟鍠婂鍥ㄥ床闁割偅绻嶅鏍磽娴ｈ偂鎴炲垔閹绢喗鐓熼柣鏃傚帶娴滀即鏌涢妶鍜佸剰闁宠鍨块幃娆戯拷鍨偠閸嬬偤姊洪崫鍕櫧濠电儑鎷烽梺缁樹緱閸犳稓绮诲☉妯锋婵炲棙鍨靛鎶芥⒑鐠囨彃鍤辩紓宥呮瀹曟粌鈽夐姀鈥冲墾闂佸壊鍋侀崕鏌ュ煕閹达附鍋ｉ柟顓熷笒婵″ジ鏌＄�ｎ亞肖缂佽鲸甯￠、娆撴偩鐏炴儳娅氶梻渚�娼уΛ鏃傛濮橆剦鍤曟い鏇嫹鐎规洜鍘ч埞鎴狅拷锝庝簼閺嗩亜鈹戦悩鍨毄濠电儑鎷峰┑鐐板尃閸ャ劌浜卞┑鐘诧工閻楀棛鎲撮敃鍌涚厱婵炴垵宕弸銈囩磼閳藉懏瀚圭紓鍌欑婢ц姤鏅跺Δ鍕噷婵＄偑鍊ら崑鍕晝椤忓牆钃熸繛鎴欏灩鎯熼梺鎸庢穿閹风兘鏌嶇紒妯荤闁跨喎锟界噥娼愭繛鍙壝叅闁绘棃鏅茬换鍡涙煕椤愶絾绀�闁绘劕锕ラ妵鍕疀閹惧磭褰呴梺鐐藉劜閺嬪ジ寮ㄩ懞銉ｄ簻闁哄喛鎷烽柡瀣帛缁楃喎鈽夐姀锛勫幈闂婎偄娲﹂弸鍌烆敂閸曨偆銈梻鍌欑婢瑰﹪宕戞笟锟藉畷鏇㈠蓟閵夛箑浜楅梺闈涱槴閺呮粓鎮￠悢鍏肩厸闁搞儮鏅涙禒婊堟煥閻旂粯顥夋繝锟介柆宥嗘櫢闁兼亽鍎抽崯鏌ユ煙閸戙倖瀚�? by changhao
				if (c1 == null)
				{
					return false;
				}
				
				SBattleFieldScore msg = new SBattleFieldScore();
				msg.myrank = -1;
				
				fire.pb.clan.fight.ClanFightBattleField bf = fire.pb.clan.fight.ClanFightFactory.getClanFightBattleField(c1, true);
				if (bf != null)
				{
					msg.clanscore1 = bf.getClanfightBean().getClanscore1();
					msg.clanscroe2 = bf.getClanfightBean().getClanscore2();
					
					ClanFightBattleField.RankInfo info = bf.getRankSorceByRoleId(roleid);
					if (info != null)
					{
						msg.myrank = info.rank;
						msg.myscore = info.scroe;						
					}
					
					psendWhileCommit(roleid, msg);
				}
				
				return true;
			}
		};
		
		battlefieldscore.submit();	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808535;

	public int getType() {
		return 808535;
	}


	public CBattleFieldScore() {
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
		if (_o1_ instanceof CBattleFieldScore) {
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

	public int compareTo(CBattleFieldScore _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

