package com.money.biz.service;

import com.money.biz.KBSTAR.KBSTARBankVO;
import com.money.biz.WOORI.WOORIBankVO;

// Service 인터페이스
public interface BankService {

	// 계좌 조회
	WOORIBankVO getWOORIAccount(WOORIBankVO vo);
	
	KBSTARBankVO getKBSTARAccount(KBSTARBankVO vo);
	
	void transfer(WOORIBankVO woorivo, KBSTARBankVO kbstarvo) ;

	// 우리은행 출금
	 void withdrawWOORI(WOORIBankVO woorivo) ;
	// 국민은행 입금
	 void receiptKBSTAR(KBSTARBankVO kbstarvo);
}