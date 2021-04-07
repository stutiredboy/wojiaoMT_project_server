
package fire.pb.clan;

import java.util.Arrays;
import java.util.List;

import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.PropRole;
import fire.pb.clan.srv.ClanManage;
import fire.pb.ranklist.RankType;
import fire.pb.ranklist.proc.PRoleZongheRankProc;
import fire.pb.talk.MessageMgr;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangeClanName__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChangeClanName extends __CChangeClanName__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0 || newname == null)
			return;
		
		final int userid = ((gnet.link.Dispatch) this.getContext()).userid;
		
		int resultCode = fire.pb.util.CheckName.checkValid(newname);
		if (resultCode == fire.pb.util.CheckName.WORD_ILLEGALITY) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 142260, null);
			return;
		} else if (resultCode == fire.pb.util.CheckName.SPECIAL_WORD_TOO_MANY) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 142294, null);
			return;
		} else if (resultCode == fire.pb.util.CheckName.NONE_CHARACTER) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 146238, null);
			return;
		}

		if (!fire.pb.util.StringValidateUtil.checkIllegalWord(newname)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		int chineseCnt = 0;
		int otherCnt = 0;
		for (int i = 0; i < newname.length(); i++) {
			// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓缃曢梻浣告惈濞层劍鎱ㄦ搴ｇ焼濠电姴鍊甸弨浠嬫煟濡搫绾ч柟鍏煎姍閺屾稓浠︾拠鎻掝潎闂佸搫鏈ú鐔风暦閻撳簶鏀介柛銉戝嫭顏ら梺鑽ゅ枑缁本顨ラ幖渚囨晪闁靛鏅涚粈瀣亜閹烘垵锟藉鎯侀崼銉︹拺闁告稑锕ユ径鍕煕閹炬潙鍝虹�规洑鍗抽弫鎾绘晸閿燂拷
			String regexStr = fire.pb.util.CheckName.getRegexStr();
			if (newname.substring(i, i + 1).matches(regexStr)) {
				chineseCnt++;
			} else {
				otherCnt++;
			}
		}
		double total = chineseCnt + otherCnt / 2.0;
		int factionNameLen = 5;
		if (total < 2 || total > factionNameLen) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 145088, null);
			return;
		}
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				
				if (!mkdb.util.UniqName.allocate("clan", newname)) {
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 142402, null);
					return false;
				}
				
				xbean.ClanInfo clanInfo = ClanUtils.getClanInfoById(roleid, false);
				if (clanInfo == null) {
					fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 145077, null);
					return false;
				}
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴閺佹劙宕ㄩ褏锟界兘姊绘担鍝ワ紞闁硅櫕鎸剧划鏃堟偨缁嬭锕傛煕閺囥劌鐏犵紒顐㈢Ч閺屾盯濡烽鍙ヨ檸闂佺懓澧界划顖炴偂濞戙垺鐓曢柍鎾呮嫹闁哄懏绋戦锝夘敋閿熶粙寮婚敍鍕勃缂佸鐏濋埛澶愭倵閸偅绶查悗姘煎幘閹广垹鈹戠�ｎ亞锛滃┑鐐村灦閻燁垶宕�ｎ亖鏀介柣妯活問閺嗘粎绱掓潏銊︾鐎规洘鍨块獮姗�骞囨担鐟扮槣濠电偛顕慨鎾敄閸涙潙鍑犲ù锝囧皑閹风兘鐛崹顔煎濠电偠顕滅徊浠嬪煝娴犲鏁傞柛顐ゅ枔閸欏啫鈹戦埥鍡楃仧閻狅拷閿曪拷鍗辩憸鐗堝笚閳锋垶绻涢崱妯哄姢鐎殿噮鍠楅幈銊︾節閸愨斂浠㈤悗瑙勬处閸嬪﹤鐣烽悢纰辨晣闁绘垵妫欏В鍥р攽閿涘嫬浜奸柛濞у拑鎷烽棃娑氱劯鐎规洘婢橀～婵嬵敄閳哄绉鐐叉喘椤㈡﹢鎮滈崱妤侇啌闂備浇顕х�涒晝绮欓幒鏇炵稊闂備胶鎳撻崲鑼礊婵犲偆娼栨繛宸簻缁�鍫ユ煠绾板崬澧悽顖樺劦濮婃椽宕妷銉愶綁鏌ｅΔ浣虹煉妤犵偛绻掗敓鏂ょ秵閸犳牜绮婚悽鍛婄厵閻熸瑥瀚峰▓鏃傜磽瀹ュ拑韬鐐插暣閸╋繝宕担瑙勬珦闂備胶绮幐鍛婎殽閹间緤缍栭柟鐑橆殕閳锋帒銆掑鐐闂佽法鍠曟慨銈囩矙閹捐鐓橀柟鐑橆殕閻撴洟鏌￠崘鎸庡闂佹悶鍔庨弫濠氥�佸鑸垫櫜濠㈣泛顑嗗▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹?
				if (clanInfo.getClanmaster() != roleid) {
					fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 150127, null);
					return false;
				}
				clanInfo.setOldclanname(clanInfo.getClanname());// 闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘骞戦姀銈呯疀妞ゆ棁妫勬惔濠囨⒑瑜版帒浜伴柛搴ㄦ涧閳藉螣濠婂嫭顥堢�规洘锕㈤、鏃堝幢閳哄倐锕傛⒒娴ｇ瓔鍤欓柛鎴犳櫕缁辩偤宕卞☉妯肩崶闂佸搫绋侀崑鍡涙儗閸℃稒鐓曟い鎰靛亝缁舵盯鏌熸搴″幋闁绘侗鍣ｅ畷褰掝敊閻撳寒娼涢梻鍌欒兌閹虫捇宕崹顕呮僵闁挎洖鍊告闂佸湱澧楀姗�鐛姀鈥茬箚闁绘劕鐡ㄧ粈锟界紓鍌氱Т閿曘倝鎮惧畡鎷旀棃宕ㄩ鍏肩杽闂備礁鎼ˇ浼搭敄濞嗗精娑㈡偄閸忓皷鎷绘繛杈剧悼閻℃棃宕甸崘顔界厱闁绘ɑ鍓氬▓鏃堟偂閵堝棛绡�濠电姴鍊归崳褰掓煕閵婏妇绠為柡宀嬬節瀹曟﹢濡歌椤ｈ櫣绱撴担鍝勵�岄柛銊﹀▕閺佹捇鎮剧仦缁户闂佺懓鍢查崲鏌ュ煘閹达附鍋愰柟缁樺釜閹风兘鎮烽幍铏�哄┑掳鍊曢崯鎵娴犲鐓曢悘鐐村礃婢规﹢鏌ㄩ悢璇残撻柟顔煎�搁悾鐑藉级濞嗙偓鍍甸柣鐘荤細濞咃綁鎮伴妷鈺傗拺闁告繂瀚埢澶愭煕濡亽鍋㈢�殿喕鍗虫俊鐤檪闁归鍏橀幆鍌炲川婵犲偆浼撻梻鍌欑閹测�趁洪敃鍌氱；闁告洦鍋嗛弳銈夋煕閳╁啰鈾侀柍閿嬪灴閺屾稑鈽夊鍫熸暰闁诲骸鐏氶悷鈺呭蓟濞戙垹鍗抽柕濞垮劚椤亜顪冮妶鍡樺碍缂傚秴锕ら～蹇曠磼濡顎撻梺鍛婄☉閿曘倝寮抽崼銉︹拺闁兼祴鏅滈崵锟芥繝鈷�鍛珪闁告帗甯″顕�宕煎┑鍫敶闂備礁鍚嬫禍浠嬪磿閸楃偐鏋旀慨妤嬫嫹婵﹨娅ｉ幑鍕Ω閵夛妇褰氶梻浣烘嚀閸ゆ牠骞忛敓锟�
				clanInfo.setClanname(newname);
				
				int costHearthStone = fire.pb.clan.srv.ClanAuthManager.getInstance().getChangeClanNameCostHearthStone();
				
				if (!fire.pb.fushi.FushiManager.subFushiFromUser(userid, 
						roleid, costHearthStone, 0, 0,
						fire.pb.fushi.FushiConst.REASON_SUB_CHANGEFACTIONNAME,
						YYLoggerTuJingEnum.tujing_Value_gonghuigaiming,true
						)) {
					return false;
				}
				
				for (java.util.Map.Entry<Long, xbean.ClanMemberInfo> entry : clanInfo.getMembers().entrySet()) {
					mkdb.Procedure.pexecuteWhileCommit(ClanUtils.addClanTitleByPositionProc(entry.getKey(), clanInfo.getClanname(), entry.getValue().getClanposition()));
				}
				
				mkdb.Procedure.psendWhileCommit(roleid, new SChangeClanName(newname));
				fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 160068, null);
				
				//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷鐓庮熆濠靛牊鍤�妞ゎ偅绻勯幑鍕惞鐠団剝袧濠电姷鏁搁崑鐐哄垂閸撲礁鏋堢�广儱顧�缂嶆牠鏌￠崶銉ョ仾闁绘挾鍠愭穱濠囧Χ韫囨柨顏堕梻浣虹帛椤ㄥ牓宕戦悢鑲猴綁骞囬悧鍫熸珳婵犮垼娉涢鍥储閻㈠憡鐓涘璺猴功婢ф洖顭胯閺咁偄危閹版澘绾ф繛鍡楀⒔閸炵敻鏌ｉ悢鍝ユ噧閻庢凹鍘剧划鍫拷锝庡枟閻撴盯鎮橀悙鎻掆挃闁宠棄顦甸弻宥囨嫚閺屻儱寮板Δ鐘靛仜濞差參銆佸Δ鍛＜婵炲棙鍨归ˇ锟�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁躲倝鏌﹀Ο渚闁兼澘娼￠弻娑樜旈崘銊ゆ勃濠殿噯绲界�氭澘顫忔繝姘＜婵炲棙甯掗崢鈥斥攽閻愬弶鍣烽柛銊ょ矙閻涱喛绠涘☉娆愭闂佽法鍣﹂幏锟�?
				MessageMgr.psendMsgNotifyWhileCommit(clanInfo.getMembers().keySet(), 160396, 0,Arrays.asList(newname));
				//濠电姷鏁告慨鐑藉极閸涘﹦绠鹃柨鐔诲Г缁绘稒鎷呴崘鍙夋悙缁炬儳缍婇弻锕�螣閻氬绀嗗┑鐐村灟閸ㄥ湱绮堢�ｎ偁浜滈柟浼存涧娴滄粍绻涢崼娑樺婵﹥妞藉畷銊︾節閸曘劍顫嶆俊鐐�ら崣搴ㄥ储閹灛锝夊箛閻楀牊娅滄繝銏ｆ硾椤戝洭宕㈤悽鍛婄厸濠㈣泛锕︽晶鏇烆熆瑜忛弲顐⑽ｉ幇鏉跨骇婵炲棗澧介崬鐢告煟閻斿摜鎳冮悗姘煎幘缁牏锟斤綆鍠楅悡娑氾拷鐧告嫹闁跨喍绮欏畷浼村箻閼告娼熼梺鍦劋閸わ箓鎮㈤悡搴濈炊闂佸憡娲栭悘姘辩礊瀹ュ鈷掗柛灞剧懅缁愭梹绻涙担鍐插幘瑜版帒绀嬫い鏍ㄦ皑椤斿棝姊虹捄銊ユ珢闁瑰嚖鎷�
				MessageMgr.psendSystemMessageToRoles(clanInfo.getMembers().keySet(), 160396, Arrays.asList(newname));
				
				fire.pb.clan.srv.ClanManage.logger.info("闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽銊с�掗柣婵嗙埣閺岋繝宕堕妷銉т患闂佹眹鍊楅崑鎾舵崲濞戙垹绠ｆ繛鍡楃箳閸旀挳姊烘潪鎵槮闁挎洩绠撻弫鎾绘寠婢跺瞼鏆涢梺绋块瀹曨剛鍙呴梺鎸庢礀閸婂摜绮ｅΔ鍛厱闁斥晛鍟伴埦渚�鏌ｉ幘瀵告噰闁哄矉缍侀獮瀣倷閸℃ê鐏╃紒顔肩墦閺佹捇鎸婃径妯诲瘜闂侀潧鐗嗛崯顐﹀礉濮樿埖鐓欐い鏇炴噺閻掞拷 "+roleid+"\t濠电姷鏁告慨鐑藉极閹间礁纾块柟瀵稿Т缁躲倝鏌﹀Ο渚＆鐟滅増甯掔壕濂告煟閹邦垰鐨洪柣娑栧劚閳规垶骞婇柛濠冩礋楠炲﹥鎯旈妸銉ュ殤婵炶揪绲跨涵鍫曞绩娴犲鐓曢悘鐐插⒔閻倝鏌ｉ幒鎴濃挃缂佽鲸甯￠弫鎾寸鐎ｎ亞锛滃┑鐐村灦閻楁梻鑺辨繝姘拺缁绢厼鎳忚ぐ褏绱掗幓鎺戔挃婵炴垹鏁诲畷婊勬媴閾忕櫢绱查梻浣哥秺閸嬪﹪宕ｆ惔鈾�鏋旀繝濠傜墛閻撴盯鎮橀悙鎻掆挃闁宠棄顦伴妵鍕敃閿濆洨鐤勫銈冨灪椤ㄥ﹤鐣烽幒妤�纾兼俊顖滃皑閹峰嘲螖閸涱厾鐣哄銈嗘穿閹峰嘲鈹戦埄鍐╁�愰柛鈺嬬節瀹曟帒顭ㄩ崘銊﹁緢婵犵數濮烽弫鎼佸磻閻愬搫鍨傞柟顖滃閹冲本绻濋悽闈涱�撻柟椋庡厴閺岀喎鈻撻崹顔界亾缂佹儳澧介崢褔鈥︾捄銊﹀磯濡わ箑鐏濋顓㈡⒑閸涘鎴﹀箰閹惰棄钃熼柣鏂垮悑閹偞銇勯幇鍓佸埌缁炬澘绉归弻褏绱掑Ο鐓庘拰闂佸搫鏈惄顖炵嵁閸ヮ剦鏁囬柣鎰絻琚橀梻鍌欑閹诧繝骞愰崼鏇炵闁瑰瓨绻嶅鏍煟閹寸伝顏堫敋鏉堛劎绠鹃柛鈩兠慨鍥ㄣ亜韫囥儲瀚�? "+costHearthStone);
				
				for (long members : clanInfo.getMembers().keySet())
				{
					mkdb.Procedure.pexecuteWhileCommit(new PRoleZongheRankProc(members));
				}
				
				mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PFactionZongHeProc(clanInfo.getKey(), false));
				mkdb.Procedure.pexecuteWhileCommit(new fire.pb.clan.srv.PClanUpdateChangeName(clanInfo.getKey(), newname));	
				mkdb.Procedure.pexecuteWhileCommit(new fire.pb.clan.fight.PClanFightUpdateChangeName(clanInfo.getKey(), clanInfo.getClanname()));					
				
				String mastername = new PropRole(roleid, true).getName();
				//濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倿鏌ｉ幘宕囧哺闁哄鐗楃换娑㈠箣閻愰潧鏆￠梺鐟板槻閸㈡煡锝炲┑瀣亗閹兼番鍨昏ぐ搴繆閵堝洤啸闁稿鐩畷顖烆敍濠婂嫬搴婂┑鐘绘涧椤戝懐绮堢�ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡濞ｅ洤锕幃娆擃敂閸曡埖瀚归柡宥庣仜濞戞瑦濯撮悷娆忓瀵潡姊洪棃娑氬妞わ缚鍗冲畷鎰節濮橆厾鍙嗛梺鍝勬祩娴滄繄锟芥艾缍婂濠氬炊瑜滃Σ鍦磼缂佹绠栫紒缁樼箞瀹曟帒顫濋鐘卞闂傚倷鑳堕…鍫燁殽閸濄儻鎷峰☉鎺撴珖闁瑰箍鍨归埥澶愬閻樿尪锟藉灝顪冮妶鍡樺暗闁哥姴閰ｉ、鏃堟晸閿燂拷
				ClanManage.addDealClanEventInfo(clanInfo,ClanManage.EVENT_CHANGE_NAME,roleid,mastername,newname,"");
								
				//闂傚倸鍊峰ù鍥敋瑜嶉～婵嬫晝閸岋妇绋忔繝銏ｅ煐閸旀洜绮婚弽顓熺厱妞ゆ劧绲剧粈锟界紒鐐劤濞硷繝寮婚悢灏佹灁闁割煈鍠楅悘宥咁渻閵堝骸浜濇繛鑼枛瀵鎮㈢亸浣圭亖闂佸壊鐓堥崰妤呮倶閹剧粯鈷戦柛娑橆煬濞堟洜锟界櫢鎷烽柟闂寸閽冪喖鏌ㄥ┑鍡╂Ц缂佺姵鐩弻銈夊箹娴ｈ閿銈呴獜閹凤拷?闂傚倸鍊搁崐鐑芥嚄閸撲礁鍨濇い鏍仜閽冪喖鏌曟繝蹇擃洭闁绘繆娉涢埞鎴︽偐閹绘帪鎷烽崼鏇熸櫢闁兼亽鍎卞ù顕�鏌熼鐣岀煉闁瑰磭鍋ゆ俊鐤槻妤犵偛鐗撳缁樻媴閸涘﹨纭�闂佺绨洪崐婵嗩嚕婵犳艾惟闁宠桨鑳堕崢娲⒑閸撴彃浜為柛鐘虫尵缁粯銈ｉ崘鈺冨幈濠电姴锕ら崯顐﹀汲閻愮儤鍊垫慨妯煎亾鐎氾拷 by changhao
				xbean.ClanProgressRankList clanprogressrankmclist = xtable.Clanprogressranklist.get(RankType.FACTION_COPY);
				if(null != clanprogressrankmclist)
				{
					List<xbean.ClanProgressRankRecord> list = clanprogressrankmclist.getRecords();
					for(xbean.ClanProgressRankRecord record : list)
					{
						if(record.getClankey() == clanInfo.getKey())
						{
							record.setClanname(newname);
							break;
						}
					}
				}
				
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808484;

	public int getType() {
		return 808484;
	}

	public java.lang.String newname;

	public CChangeClanName() {
		newname = "";
	}

	public CChangeClanName(java.lang.String _newname_) {
		this.newname = _newname_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(newname, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		newname = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangeClanName) {
			CChangeClanName _o_ = (CChangeClanName)_o1_;
			if (!newname.equals(_o_.newname)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += newname.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(newname.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

