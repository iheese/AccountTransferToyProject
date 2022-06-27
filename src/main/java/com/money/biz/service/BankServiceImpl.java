package com.money.biz.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.money.biz.KBSTAR.KBSTARBankDAO;
import com.money.biz.KBSTAR.KBSTARBankVO;
import com.money.biz.WOORI.WOORIBankDAO;
import com.money.biz.WOORI.WOORIBankVO;

@Service
public class BankServiceImpl implements BankService {
	@Autowired
	private WOORIBankDAO wooriBankDAO;
	@Autowired
	private KBSTARBankDAO kbstarBankDAO;

	long miliseconds = System.currentTimeMillis();
    Date date = new Date(miliseconds);

	// 우리은행 계좌 상세 조회
	@Override
	public WOORIBankVO getWOORIAccount(WOORIBankVO vo) {
		return wooriBankDAO.getWOORIAccount(vo);
	}

	// 국민은행 계좌 상세 조회
	@Override
	public KBSTARBankVO getKBSTARAccount(KBSTARBankVO vo) {
		return kbstarBankDAO.getKBSTARAccount(vo);
	}

	// 계좌이체 업데이트 처리
	@Override
	public void transfer(WOORIBankVO woorivo, KBSTARBankVO kbstarvo) {
		
		wooriBankDAO.updateWOORI(woorivo);
		kbstarBankDAO.updateKBSTAR(kbstarvo);
	}

	// 우리은행 출금
	public void withdrawWOORI(WOORIBankVO woorivo) {
		woorivo.setBalance(woorivo.getBalance() - woorivo.getTransferMoney());
		woorivo.setWithdrawDate(date);
	}

	// 국민은행 입금
	public void receiptKBSTAR(KBSTARBankVO kbstarvo) {
		kbstarvo.setBalance(kbstarvo.getBalance() + kbstarvo.getTransferMoney());
		kbstarvo.setReceiptDate(date);
	}

}