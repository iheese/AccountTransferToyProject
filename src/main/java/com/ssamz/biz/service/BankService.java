package com.ssamz.biz.service;

import com.ssamz.biz.KBSTAR.KBSTARBankVO;
import com.ssamz.biz.WOORI.WOORIBankVO;

//3. Service 인터페이스
public interface BankService {

	// 계좌 조회
	WOORIBankVO getWOORIAccount(WOORIBankVO vo);
	
	KBSTARBankVO getKBSTARAccount(KBSTARBankVO vo);
	
	void transfer(WOORIBankVO woorivo, KBSTARBankVO kbstarvo);

	// 우리은행 출금
	 void withdrawWOORI(WOORIBankVO woorivo);
	// 국민은행 입금
	 void receiptKBSTAR(KBSTARBankVO kbstarvo);
}