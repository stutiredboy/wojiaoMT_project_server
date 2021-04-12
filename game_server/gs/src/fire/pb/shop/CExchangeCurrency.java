
package fire.pb.shop;

import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.game.MoneyType;

import fire.pb.main.Gs;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CExchangeCurrency__ extends mkio.Protocol { }

/** 货币兑换
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CExchangeCurrency extends __CExchangeCurrency__ {
	@Override
	protected void process() {
		// protocol handle
		
		long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		final int userid = ((gnet.link.Dispatch) this.getContext()).userid;
		
		new mkdb.Procedure() {
			
			@Override
			protected boolean process() throws Exception {
				fire.pb.item.Pack bag = new fire.pb.item.Pack(roleid, false);
				
				long ret = 0;
				int newMoney = 0;
				// 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚归柛顐ｆ礃閺呮悂鏌﹀Ο渚Ц闁哄棴绲鹃〃銉╂倷閸欏鏋犲銈冨灪閿氶柍瑙勫灴瀹曞ジ濮�閵忊剝鐦為梻鍌氬�搁崐鐑芥倿閿曞倸绠栭柛顐ｆ礀绾炬寧绻涘顔荤盎缂侊拷閸喐鍙忔俊顖涘绾墽鐥幆褜鐓奸柡灞剧☉閻ｆ繈鏁撴禒瀣；闁绘劗鍎ら崑鍌炴煛閸モ晛鏋傚ù婊勭矒閺岀喖寮堕崹顕呮殺缂備礁顑堝畷鐢垫閹烘鏅稿ù鐘差儐閺呮悂鏌ｉ敐鍛伇缁炬崘妫勯妴鎺戭潩椤掑﹥鏁鹃柣搴㈣壘缂嶅﹤顫忛搹鍦煓閻犳亽鍔庢导鍥⒑缁嬫鍎戦柛瀣ㄥ�濋獮鍐灳閺傘儲鐎婚梺鍦亾濞兼瑩鏁撻悾灞炬毈闁哄矉缍佹慨锟介柍钘夋閺呴亶姊虹紒妯虹瑲闁稿孩濞婂﹢渚�姊虹紒妯忣亞澹曢銏″剹闁圭儤鎼╁▓浠嬫煟閹邦剦鍤熷褜鍓氱换娑㈡偂鎼达絿顔掗梺璇″枟閻熲晠銆佸Δ鍛櫢濞寸姴顑愰弫鍌炴煥閻曞倹瀚�
				if (srcmoneytype == fire.pb.game.MoneyType.MoneyType_HearthStone) {
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾椤懘鏌嶉妷銉ユ毐缂併劊鍎靛缁樻媴娓氼垱鏁梺瑙勬た娴滅偟鍒掓繝姘闁挎洩鎷烽柛銊ュ�块弻娑樼暆閿熶粙宕戦悙鍝勭；闁挎繂鎲橀弮鍫熸櫆闁芥ê顦介崵瀣渻閵堝懐绠冲┑鐑囨嫹闂佸搫鐭夌换婵嗙暦闁稁鏁囬柣妯虹仛濞堝ジ姊绘担鍛婃儓闁活厼顦卞Σ鎰板即閻斾警娴勯梺鎸庢⒒閸嬫挾锟芥碍宀搁弻鐔虹磼濡櫣鐟ㄥ銈庡亝瀹�绋款潖缂佹ɑ濯撮柧蹇曟嚀缁楋繝姊洪崷顓涙嫛闁稿妫涘Σ鎰版倷鐎靛摜鎳濋梺璺ㄥ枍缁瑩鎮伴锟藉畷姗�顢旈崨顓熺�梻浣告啞濞插秹寮插☉娆戭洸濞寸厧鐡ㄩ埛鎴︽煕閿旇寮鹃柣鎺楃畺閹宕归銏㈢懖缂備礁鍊圭敮锟犲春閳╁啰鐟归柛銉ｅ妼閻︽粓姊绘笟锟藉褔鎮ч崱娑樼疇婵鎷烽柟顔芥緲椤劑宕奸悢鍝勫箥闂備礁鎲￠崹顖炲磹閺嶎偓鎷峰鐐.
					if (fire.pb.fushi.Module.GetPayServiceType() == 1)
						return false;
					
					if (dstmoneytype == fire.pb.game.MoneyType.MoneyType_SilverCoin && this.dealHearthStone()) {
						newMoney = money * 10000;
						ret = bag.addSysMoney(newMoney, "1缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚归柛顐ｆ礃閺呮悂鏌﹀Ο渚Ц闁哄棴绲鹃〃銉╂倷閸欏鏋犲銈冨灪閿氶柍瑙勫灴瀹曞ジ濮�閵忊剝鐦為梻鍌氬�搁崐鐑芥倿閿曞倸绠栭柛顐ｆ礀绾炬寧绻涘顔荤盎缂侊拷閸喐鍙忔俊顖涘绾墽鐥幆褜鐓奸柡灞剧☉閻ｆ繈鏁撴禒瀣；闁绘劗鍎ら崑鍌炴煛閸モ晛鏋傚ù婊勭矒閺岀喖寮堕崹顕呮殺缂備礁顑堝畷鐢垫閹烘鏅稿ù鐘差儐閺呮悂鏌ｉ敐鍛伇缁炬崘妫勯妴鎺戭潩椤掑﹥鏁鹃柣搴㈣壘缂嶅﹤顫忛搹鍦煓閻犳亽鍔庢导鍥⒑缁嬫鍎戦柛瀣ㄥ�濋獮鍐灳閺傘儲鐎婚梺鍦亾濞兼瑩鏁撻悾灞炬毈闁哄矉缍佹慨锟介柍钘夋閺呴亶姊虹紒妯虹瑲闁稿孩濞婂﹢渚�姊虹紒妯忣亞澹曢銏″剹闁圭儤鎼╁▓浠嬫煟閹邦剦鍤熷褜鍓氱换娑㈡偂鎼达絿顔掗梺璇″枟閻熲晠銆佸Δ鍛櫢濞寸姴顑愰弫鍌炴煥閻曞倹瀚�10000闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳顢旈崨顓т紦闂傚倷妞掔槐顔惧緤娴犲搴婇柤鐓庡娴滀粙姊洪懡銈呬沪缂佸鐗撳畷婊冣攽鐎ｎ偄锟藉爼鏌涢幇鈺佸Ψ闁猴拷娴犲鐓熼柟閭﹀幗缂嶆垿鏌ｈ箛銉╂闁逛究鍔岃灒缂佸鐏濋～鍥倵鐟欏嫭纾甸柨鐔诲Г閸撴艾顭囬埡鍛厾闁告縿鍎查弳鈺呮煕濞嗗繑顥㈡慨濠呮缁辨帒螣閼姐値妲梻浣侯焾閿曘倕锕㈤柆宥嗘櫢闁兼亽鍎抽崯鏌ユ煙閸戙倖瀚�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuan, 0);
						if (ret != 0) {
							fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 160402, java.util.Arrays.asList(Integer.toString(money), Integer.toString(newMoney)));
						}
					} 
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾椤懘鏌嶉妷銉ユ毐缂併劊鍎靛缁樻媴娓氼垱鏁梺瑙勬た娴滅偟鍒掓繝姘闁挎洩鎷烽柛銊ュ�块弻娑樼暆閿熶粙宕戦悙鍝勭；闁挎繂鎲橀弮鍫熸櫆闁芥ê顦介崵瀣渻閵堝懐绠冲┑鐑囨嫹闂佸搫鐭夌换婵嗙暦闁稁鏁囬柣妯虹仛濞堝ジ姊绘担鍛婃儓闁活厼顦卞Σ鎰板即閻斾警娴勯梺鎸庢⒒閸嬫挾锟芥碍宀搁弻鐔虹磼濡櫣鐟ㄥ銈庡亝瀹�绋款潖缂佹ɑ濯撮柧蹇曟嚀缁楋繝姊洪悷鐗堝暈闁诡喖鍊搁悾鐑藉箛閺夊潡鏁滃┑掳鍊ч幏鐑芥煢閸愵亜鏋涢柡宀嬬秮瀵噣宕掑杈吇闂備胶鎳撻崲鏌ュ床閺屻儱鐓″璺号堥弸搴繆椤栨粌甯跺┑顔挎缁辨捇宕掑▎鎺戝帯婵犳鍠曠徊濠氬箺椤愶附鈷戦梻鍫熺♁閹兼劙鎮楀鐓庣仯缂侇喛顕ч埥澶愬閻樻牓鍔戦弻銊╁即椤忓懎顏舵俊鐐�曟蹇涘箯閿燂拷
					else if (dstmoneytype == fire.pb.game.MoneyType.MoneyType_GoldCoin && this.dealHearthStone()) {
						newMoney = money * 100;
						ret = bag.addSysGold(newMoney, "1缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚归柛顐ｆ礃閺呮悂鏌﹀Ο渚Ц闁哄棴绲鹃〃銉╂倷閸欏鏋犲銈冨灪閿氶柍瑙勫灴瀹曞ジ濮�閵忊剝鐦為梻鍌氬�搁崐鐑芥倿閿曞倸绠栭柛顐ｆ礀绾炬寧绻涘顔荤盎缂侊拷閸喐鍙忔俊顖涘绾墽鐥幆褜鐓奸柡灞剧☉閻ｆ繈鏁撴禒瀣；闁绘劗鍎ら崑鍌炴煛閸モ晛鏋傚ù婊勭矒閺岀喖寮堕崹顕呮殺缂備礁顑堝畷鐢垫閹烘鏅稿ù鐘差儐閺呮悂鏌ｉ敐鍛伇缁炬崘妫勯妴鎺戭潩椤掑﹥鏁鹃柣搴㈣壘缂嶅﹤顫忛搹鍦煓閻犳亽鍔庢导鍥⒑缁嬫鍎戦柛瀣ㄥ�濋獮鍐灳閺傘儲鐎婚梺鍦亾濞兼瑩鏁撻悾灞炬毈闁哄矉缍佹慨锟介柍钘夋閺呴亶姊虹紒妯虹瑲闁稿孩濞婂﹢渚�姊虹紒妯忣亞澹曢銏″剹闁圭儤鎼╁▓浠嬫煟閹邦剦鍤熷褜鍓氱换娑㈡偂鎼达絿顔掗梺璇″枟閻熲晠銆佸Δ鍛櫢濞寸姴顑愰弫鍌炴煥閻曞倹瀚�100闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡樺櫣妞ゃ儱绻橀弻娑㈠Χ閸℃顦伴梺鍝勬湰閻╊垶銆侀弴銏℃櫜闁糕剝鐟Σ顒勬⒒娴ｈ鍋犻柛鏂跨焸瀹曟劙宕稿Δ锟介拑鐔兼煥濠靛棭妲告い顐㈡嚇閺屾洝绠涙繝鍌氣拤濠殿噯绲界�氭澘顫忓ú顏勫窛濠电姴瀛╅悾鐑芥倵閻у憡瀚归梺褰掓？缁�渚�鎷戦悢鍏肩厪濠电偟鍋撳▍鍡涙煕鐎ｎ亝顥㈤柡灞剧〒娴狅箓宕滆濡插牆顪冮妶鍛寸崪闁瑰嚖鎷�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuan, 0);						
						if (ret != 0) {
							ret = bag.addSysCurrency((long)(newMoney*fire.pb.fushi.Module.getCreditPointValue(fire.pb.fushi.Module.CREDITPOINT_IN_FS2GOLD))
									, MoneyType.MoneyType_EreditPoint, "1缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚归柛顐ｆ礃閺呮悂鏌﹀Ο渚Ц闁哄棴绲鹃〃銉╂倷閸欏鏋犲銈冨灪閿氶柍瑙勫灴瀹曞ジ濮�閵忊剝鐦為梻鍌氬�搁崐鐑芥倿閿曞倸绠栭柛顐ｆ礀绾炬寧绻涘顔荤盎缂侊拷閸喐鍙忔俊顖涘绾墽鐥幆褜鐓奸柡灞剧☉閻ｆ繈鏁撴禒瀣；闁绘劗鍎ら崑鍌炴煛閸モ晛鏋傚ù婊勭矒閺岀喖寮堕崹顕呮殺缂備礁顑堝畷鐢垫閹烘鏅稿ù鐘差儐閺呮悂鏌ｉ敐鍛伇缁炬崘妫勯妴鎺戭潩椤掑﹥鏁鹃柣搴㈣壘缂嶅﹤顫忛搹鍦煓閻犳亽鍔庢导鍥⒑缁嬫鍎戦柛瀣ㄥ�濋獮鍐灳閺傘儲鐎婚梺鍦亾濞兼瑩鏁撻悾灞炬毈闁哄矉缍佹慨锟介柍钘夋閺呴亶姊虹紒妯虹瑲闁稿孩濞婂﹢渚�姊虹紒妯忣亞澹曢銏″剹闁圭儤鎼╁▓浠嬫煟閹邦剦鍤熷褜鍓氱换娑㈡偂鎼达絿顔掗梺璇″枟閻熲晠銆佸Δ鍛櫢濞寸姴顑愰弫鍌炴煥閻曞倹瀚�100闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡樺櫣妞ゃ儱绻橀弻娑㈠Χ閸℃顦伴梺鍝勬湰閻╊垶銆侀弴銏℃櫜闁糕剝鐟Σ顒勬⒒娴ｈ鍋犻柛鏂跨焸瀹曟劙宕稿Δ锟介拑鐔兼煥濠靛棭妲告い顐㈡嚇閺屾洝绠涙繝鍌氣拤濠殿噯绲界�氭澘顫忓ú顏勫窛濠电姴瀛╅悾鐑芥倵閻у憡瀚归梺褰掓？缁�渚�鎷戦悢鍏肩厪濠电偟鍋撳▍鍡涙煕鐎ｎ亝顥㈤柡灞剧〒娴狅箓宕滆濡插牆顪冮妶鍛寸崪闁瑰嚖鎷�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuan, 0);
							fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 160403, java.util.Arrays.asList(Integer.toString(money), Integer.toString(newMoney)));
						}
					}
				}
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡樺櫣妞ゃ儱绻橀弻娑㈠Χ閸℃顦伴梺鍝勬湰閻╊垶銆侀弴銏℃櫜闁糕剝鐟Σ顒勬⒒娴ｈ鍋犻柛鏂跨焸瀹曟劙宕稿Δ锟介拑鐔兼煥濠靛棭妲告い顐㈡嚇閺屾洝绠涙繝鍌氣拤濠殿噯绲界�氭澘顫忓ú顏勫窛濠电姴瀛╅悾鐑芥倵閻у憡瀚归梺褰掓？缁�渚�鎷戦悢鍏肩叆婵犻潧妫Σ鍛娿亜椤愩垺鍤囬柡灞炬礉缁犳稒绻濋崘鈺冨絿闂備礁鎲￠弻銊╁箺濠婂懏顫曢柟鎯ь嚟閻熺懓鈹戦悩鎻掓殭妞ゅ繐鐖煎缁樻媴娓氼垳鍔搁梺娲诲墮閵堢鐣烽幋锔藉�烽柣鎴灻禍妤�鈹戦悙鍙夘棡闁圭顭峰畷鎰版偨閸涘﹦鍘介梺闈涚箚濡插懘宕箛娑欑厽闁圭儤鎸搁崝銈夋婢舵劖鐓熸俊顖濇閿涘秹鏌ｉ鐔风瑲妞ゃ劊鍎甸幃娆戯拷鐢殿焾椤冣攽閻愰潧甯剁紒缁橈耿楠炲啫鈻庨幙鍐╂櫌闂佽法鍠嶇划娆撱�侀弮鍫熸櫢闁跨噦鎷�
				else if (srcmoneytype == fire.pb.game.MoneyType.MoneyType_GoldCoin && this.dealGold()) {
					newMoney = money * 100;
					ret = bag.addSysMoney(newMoney, "1闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡樺櫣妞ゃ儱绻橀弻娑㈠Χ閸℃顦伴梺鍝勬湰閻╊垶銆侀弴銏℃櫜闁糕剝鐟Σ顒勬⒒娴ｈ鍋犻柛鏂跨焸瀹曟劙宕稿Δ锟介拑鐔兼煥濠靛棭妲告い顐㈡嚇閺屾洝绠涙繝鍌氣拤濠殿噯绲界�氭澘顫忓ú顏勫窛濠电姴瀛╅悾鐑芥倵閻у憡瀚归梺褰掓？缁�渚�鎷戦悢鍏肩叆婵犻潧妫Σ鍛娿亜椤愩垺鍤囬柡灞炬礉缁犳稒绻濋崘鈺冨絿闂備礁鎲￠弻銊╁箺濠婂懏顫曢柟鎯ь嚟閻熺懓鈹戦悩鎻掓殭妞ゅ繐鐖煎缁樻媴娓氼垳鍔搁梺娲诲墮閵堢鐣烽幋锔藉�烽柣鎴灻禍妤�鈹戦悙鍙夘棡闁圭顭峰畷鎰版偨閸涘﹦鍘介梺闈涚箚濡插懘宕箛娑欑厽闁圭儤鎸搁崝銈夋婢舵劖鐓熸俊顖濇閿涘秹鏌ｉ鐔风瑲妞ゃ劊鍎甸幃娆戯拷鐢殿焾椤冣攽閻愰潧甯剁紒缁橈耿楠炲啫鈻庨幙鍐╂櫌闂佽法鍠嶇划娆撱�侀弮鍫熸櫢闁跨噦鎷�100闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳顢旈崨顓т紦闂傚倷妞掔槐顔惧緤娴犲搴婇柤鐓庡娴滀粙姊洪懡銈呬沪缂佸鐗撳畷婊冣攽鐎ｎ偄锟藉爼鏌涢幇鈺佸Ψ闁猴拷娴犲鐓熼柟閭﹀幗缂嶆垿鏌ｈ箛銉╂闁逛究鍔岃灒缂佸鐏濋～鍥倵鐟欏嫭纾甸柨鐔诲Г閸撴艾顭囬埡鍛厾闁告縿鍎查弳鈺呮煕濞嗗繑顥㈡慨濠呮缁辨帒螣閼姐値妲梻浣侯焾閿曘倕锕㈤柆宥嗘櫢闁兼亽鍎抽崯鏌ユ煙閸戙倖瀚�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuan, 0);
					if (ret != 0) {
						fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 160404, java.util.Arrays.asList(Integer.toString(money), Integer.toString(newMoney)));
					}
				}
				
				return ret == 0 ? false : true ;
			}
			
			
			/**
			 * 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚归柛顐ｆ礃閺呮悂鏌﹀Ο渚Ц闁哄棴绲鹃〃銉╂倷閸欏鏋犲銈冨灪閿氶柍瑙勫灴瀹曞ジ濮�閵忊剝鐦為梻鍌氬�搁崐鐑芥倿閿曞倸绠栭柛顐ｆ礀绾炬寧绻涘顔荤盎缂侊拷閸喐鍙忔俊顖涘绾墽鐥幆褜鐓奸柡灞剧☉閻ｆ繈鏁撴禒瀣；闁绘劕鎼壕濠氭煥濠靛棭妲哥紒鐙欏洦鐓熼柟閭﹀幗缂嶆垶銇勯妷銉剳缂佽鲸甯楀鍕節閸愩劋娣梻浣告惈鐞氼偊宕濋幋锕�绠栭柕鍫濐槸绾惧吋绻涢幋鐑囦緵濞寸》鎷�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囨煕閳╁啨浠︾紒顔瑰墲娣囧﹪鎮欓鍕舵嫹閺嶎厼绀夌憸蹇曞垝婵犳艾绠ｉ柣妯烘▕濡粓姊虹粔鍡楀濞堟洟鏌嶉柨瀣仸闁靛洤瀚伴獮鎺楁倷閺夋埈浼撶紓鍌氬�风粈渚�藝闁秴鏋侀悹鍥皺閺嗭箓鏌ｉ姀銏╃劸缂佺姵鐩弻锝呂旈敓浠嬫偋韫囨稑鍌ㄥù鐘差儐閳锋垿鏌涘┑鍡楊仼闁哄棙鐟╅弻娑欑節閸屾稒鍠愰梺杞扮贰閸ｏ絽鐣峰鍕闁惧繒娅㈢槐鏌ユ⒒娴ｈ櫣甯涢柨鏇楁櫊瀹曚即寮介鐐殿槷闂佹寧娲栭崐褰掓偂濞戙垺鍊堕柣鎰邦杺閸ゆ瑥鈹戦垾鐐藉仮闁哄苯绉堕幉鎾礋椤愩倓绱濋柣搴ゎ潐濞茬喐绂嶉崼鏇炴槬闁跨喓濮寸壕濂告煕鐏炶棄鏆欐繛璇х畵閸╂盯骞嬮悩鐢碉紳婵炶揪缍�椤曟牠鎮為悾宀�纾奸柣妯哄船瀹撳棝鏌″畝锟介崰鏍х暦濞嗘挸围闁糕剝顨忔导锟�
			 * @return true ok
			 */
			public boolean dealHearthStone() {
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏堕柣搴ゎ潐濞插繘宕曢幎鑺ユ櫢闁哄倶鍊楃粔鐢告煕閻樺磭澧卞瑙勬礋瀹曠螖娴ｅ搫骞嶉梻浣筋嚃閸ㄨ櫕鏅跺Δ鍚藉寰勯幇顒傤啇闂佸搫顦伴崺濠囩叕椤掑嫭鐓涢悘鐐额嚙閿熻姤绻堥獮濠傗攽鐎ｎ亞顓煎銈嗘閸嬫劖鏅堕姘ｆ斀闁绘劘灏欓幗鐘电磼椤旇偐鐏辩紒杈╁仦缁绘繈宕惰閹芥洖鈹戦悙鏉戠仧闁搞劎鎳撻弫顕�姊绘笟锟藉褏鎹㈤崱娑樼婵犻潧顑嗛崑鐔兼煛瀹ュ骸浜炵痪鎹愭闇夐柨婵嗘噺閹牓寮介垾鏂ユ斀闁宠棄妫楁禍婊堟煕閻斿憡缍戞い鏇稻缁绘繂顫濋鈹炬櫊閺屽秵娼幍顔煎濡炪們鍎茬换鍫濐潖濞差亜绀堥柤纰卞墮鐢儵姊洪崫銉バｉ悽顖ょ節閻涱噣骞囬弶璺槰濡炪倖妫佽闁归攱妞藉娲川婵犲嫧妲堥梺鎸庢穿缁犳捇鐛繝鍥у嵆闁靛骏绱曢崢鐢告⒑閸涘﹤鐏熼柛濠冪墱閿熻姤鐔幏锟�
				if (fire.pb.fushi.Module.getIsYYBUser(userid)) {
					return fire.pb.fushi.FushiManager.subFushiFromUser(userid, roleid, money, 0, 0,
							fire.pb.fushi.FushiConst.REASON_SUB_EXCHANGE_CURRENCY, YYLoggerTuJingEnum.tujing_Value_huobiduihuancost, true);
				}
				else {
					xbean.YbNums ybNums = xtable.Fushinum.get(userid);
					if (ybNums == null) {
						return false;
					}
					xbean.YbNum ybNum = ybNums.getRoleyb().get(roleid);
					if (ybNum == null) {
						return false;
					}
					if (ybNum.getNum() < 0 || ybNum.getSysnum() < 0) {
						return false;
					}

					return fire.pb.fushi.FushiManager.subFushiFromUser(userid, roleid, money, 0, 0,
							fire.pb.fushi.FushiConst.REASON_SUB_EXCHANGE_CURRENCY, YYLoggerTuJingEnum.tujing_Value_huobiduihuancost, true);
				}
			}
			
			/**
			 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撻柡灞诲劜閺呮悂鏌﹀Ο渚Ц闁跨喕妫勫锟犲Υ娴ｇ硶鏋庨柟鎯х－椤︻參鎮峰鍐閽樻繃銇勯弽銊с�掔紒鐘荤畺瀵爼宕煎┑鍡忔寖闂佽鍠涢崑鎰版儉椤忓牜鏁囬柣鎰版涧閻撶喖鎮楀▓鍨灓妞ゎ厼鐗撻、姗�宕楅悡搴ｇ獮婵犵數濮寸�氱兘宕崶銊х瘈闁汇垽娼ч崜宕囩磽瀹ュ懏顥㈢�规洘绮岄埢搴ㄥ箛椤忓棛鐣惧┑鐐差嚟婵挳顢栭崱娑欏亗闁绘柨鍚嬮悡娆撴煙椤栧棗鍟В鎰版⒑鐠恒劌鏋欐俊顐㈠椤洭鍨鹃幇浣告婵犵數濮电喊宥夊磻閸曨垱鐓熸慨姗嗗墰閹界娀鎮楀鎰佹綈缂佺粯鐩獮瀣倷閸偄娅ч梻浣虹帛鐢偤寮查銈嗩潟闁圭儤顨嗛崑鎰版煙鐎涙ê濮堥柛銊﹀娣囧﹪鎮界粙璺槹濡炪倖鏌ㄦ晶浠嬪级閹间焦鈷戦梻鍫熶緱濡狙呯磼閻樺啿鐏存い銏℃閺佹捇鏁撻敓锟�
			 * @return true ok
			 */
			public boolean dealGold() {
				fire.pb.item.Pack bag = new fire.pb.item.Pack(roleid, false);
				long ret = bag.subGold(-money, "闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡宀嬬秮婵拷闁靛繆鏅濋崝鍝ョ磽娓氬﹥瀚归梺鍓插亞閸犲棙绂嶅鍫熺厵闁绘垶锚閻忋儲銇勮箛濠冩珖缂佽鲸甯￠弫鎾寸鐎ｎ亞顦ㄩ梺宕囨嚀閵囨鑺辨繝姘棅妞ゆ劑鍨烘径鍕煙閸涘﹤鍔ら柣顭戝墰缁辨捇宕掑▎鎰偘婵＄偛鐡ㄩ幃鍌炲箖閻戣棄鐓涘〒姘处缂嶅海绱撻崒娆戝妽閽冨崬鈹戦娑欑稇闁靛棙甯掗～婵嬫偂鎼达絼鍖栭梻浣告啞閺屻劑骞楀鍛潟闁规儳鐡ㄦ刊鎾煣韫囨洘鍤�缂佹绻濆娲箹閻愭彃顬堥梺璇茬箲缁诲牓骞冩ィ鍐╁�婚柦妯侯槹瀹撳秴顪冮妶鍡樺暗闁哥姴娴锋竟鏇㈩敍閻愮补鎷洪梺璇″瀻閸涱垼鍟堟俊鐐�ら崑鍕囬鐐茬厺闁圭偓鐣崑鍛存煕閹般劍鏉归柟閿嬫そ閺岋綁鎮╅崗鍛板焻闂佸憡鏌ㄩ懟顖炲煝瀹ュ绠涢柣妤�鐗忛崢鐢告⒑閸涘﹤鐏熼柛濠冪墱閿熻姤鐔幏锟�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuancost, 0);
				return ret == 0 ? false : true ;
			}
			
			
		}.submit();
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810653;

	public int getType() {
		return 810653;
	}

	public int srcmoneytype; // 源类型 参考game.xml中MoneyType
	public int dstmoneytype; // 目标类型 参考game.xml中MoneyType
	public int money; // 数量

	public CExchangeCurrency() {
	}

	public CExchangeCurrency(int _srcmoneytype_, int _dstmoneytype_, int _money_) {
		this.srcmoneytype = _srcmoneytype_;
		this.dstmoneytype = _dstmoneytype_;
		this.money = _money_;
	}

	public final boolean _validator_() {
		if (srcmoneytype < 1 || srcmoneytype > 10) return false;
		if (dstmoneytype < 1 || dstmoneytype > 10) return false;
		if (money < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(srcmoneytype);
		_os_.marshal(dstmoneytype);
		_os_.marshal(money);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		srcmoneytype = _os_.unmarshal_int();
		dstmoneytype = _os_.unmarshal_int();
		money = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CExchangeCurrency) {
			CExchangeCurrency _o_ = (CExchangeCurrency)_o1_;
			if (srcmoneytype != _o_.srcmoneytype) return false;
			if (dstmoneytype != _o_.dstmoneytype) return false;
			if (money != _o_.money) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += srcmoneytype;
		_h_ += dstmoneytype;
		_h_ += money;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(srcmoneytype).append(",");
		_sb_.append(dstmoneytype).append(",");
		_sb_.append(money).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CExchangeCurrency _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = srcmoneytype - _o_.srcmoneytype;
		if (0 != _c_) return _c_;
		_c_ = dstmoneytype - _o_.dstmoneytype;
		if (0 != _c_) return _c_;
		_c_ = money - _o_.money;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

