
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
				Long c1 = xtable.Roleid2clanfightid.select(roleid); //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崸妤�绠板┑鐘插暟閻濆爼鏌嶉崫鍕靛剳缂佸鍠氶敓鍊燁潐濞叉粓宕伴弽顓滐拷浣糕槈濮楀棙鍍垫俊鎻掓湰閻楁洟寮幖浣光拻闁稿本鐟︾粊鐗堢箾婢跺绀嬬�规洘濞婇弫鍐磼濮橀硸鍞甸梻浣芥硶閸ｏ箓骞忛敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婄拋鏌ュ几濞嗘挻鈷戠紓浣姑粭鈺佲攽椤斿搫锟芥骞戦姀鐘闁靛繒濮撮懓鍨攽閳藉棗鐏ｇ紒顕呭灦瀹曟洘鎯旈妸锔规嫼闁哄鍋炴竟鍡浰囬敃鍌涘�垫慨姗嗗亜瀹撳棛锟芥鍠涢褔鍩ユ径鎰潊闁绘﹢娼ф慨鍫曟⒒娴ｅ憡鍟為柛鏂炲懐纾芥慨妯跨簿婵娊鏌ｉ姀鐘冲暈闁抽攱鍨块弻鐔虹矙閹稿孩宕崇紓浣哄У閹稿濡甸崟顖涙櫆閻犲洩灏欐禒顖滅磽娓氬洤鏋涙い顓犲厴楠炲啴鎮滈挊澶岀枃婵犵數濮撮崐鑽ょ矓濞差亝鐓涘ù锝囨嚀婵秶锟借娲栧畷顒勫煝鎼淬劌绠涙い鎾跺仦濞呫垽姊绘担钘夊惞闁稿鍋熼崰濠傤吋閸ャ劌搴婇梺鍓插亝缁诲秴顭囬弽顐ょ＝濞达綀鍋傞幋鐐插灁闁圭虎鍠楅悡鐔兼煟閺冨倸甯跺ù婊�鍗抽弻娑㈠Χ閸滀礁鍓伴梺瀹狀潐閸ㄥ潡骞冨▎鎴嫹閸偅鍋犻柛瀣仱濮婃椽宕崟顒�娅ф繝鐢靛剳閹风兘姊虹紒妯圭繁闁哥姵绋撶划璇测槈濡攱顫嶅┑鐐叉閸ㄩ潧顕ｉ幎鑺モ拺閻犲洦褰冮崵杈╃磽瀹ュ懏顥㈢�规洘绮岄埥澶愬閳ュ啿澧鹃梻浣稿閸嬩線宕曢弻銉ョ厱闁硅揪闄勯崑锝夋煙椤撶喎绗掑┑鈥炽偢閺岋紕锟斤綆浜炶倴缂備浇椴哥敮锟犮�佸▎鎾村仼閻忕偞鍎冲▍姘舵⒒娓氾拷濞佳兾涢弮鍌涱偨婵﹩鍓﹂崵鏇熴亜閺囶亝瀚归悗瑙勬礈閸樠囧煘閹寸媴鎷烽敐搴濈凹闁哄棭浜滈埞鎴︽偐閸偅姣勬繝鐢靛剳閹峰嘲鈹戦悙鏉垮皟闁搞儯鍔屾禍鍗炩攽閻樿宸ラ柣妤�妫涢幉鎾晝閸屾稓鍘卞┑鐐村灥瀹曨剟寮搁妶鍥╃＜闁宠棄鎳忕�氬湱绱撻崒娆戭槮濠⒀嗗Г閺呰泛螖閸曨剚鍣峰┑锛勫亼閸娿倝宕戦崟顖涙櫇妞ゅ繐鐗嗛拑鐔哥箾閹存瑥鐏╅幆鐔兼⒑閹稿孩绌块柟椋庡厴閺屽秶绱掑Ο鑽ゎ槶闂佽法鍠庨敓鐣屽櫏濞兼劖绻涢崣澹濐亞鍙呴梺缁樻閺呰尙鎹㈤崱娑欑厱妞ゆ劧绲剧粈锟介梺缁樺姇閿曘儵濡甸崟顔剧杸闁规儳纾ぐ鍛存⒑閻愯棄鍔滈柡瀣偢瀵劑鎳為妷锝勭盎闂佸搫鍠涢幏鐑芥煛鐎ｎ剛甯涚紒妤冨枎閳藉濮�閿涘嫬骞堥梻濠庡亜濞诧箓寮搁崒鐑嗘晜闁告洦鍋嗛妶顐︽⒒閸屾瑧顦﹀鐟帮躬瀹曟垶绗熼敓钘夌暦閺囥垹钃熼柕澶涚畱娴滄姊洪棃娑辨Т闁哄懏绮撻幃锟犳偄閸忚偐鍘搁梺鎼炲劗閺呮稒绂掑鍫熺叆闁绘梻绮ˉ澶嬬節閿熶粙鏌嗗鍡樻闂佸吋浜介崕鎶藉疮閺屻儲鐓欓柛鎴欏�栫�氾拷? by changhao
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

