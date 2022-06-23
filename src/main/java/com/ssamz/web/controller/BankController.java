package com.ssamz.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssamz.biz.KBSTAR.KBSTARBankVO;
import com.ssamz.biz.WOORI.WOORIBankVO;
import com.ssamz.biz.service.BankService;

@Controller
public class BankController {

	@Autowired
	private BankService bankService;

	@RequestMapping("/getBalance.do")
	public String getBalnce(WOORIBankVO vo, HttpSession session) {
		if (bankService.getWOORIAccount(vo) != null) {
			session.setAttribute("wooriVO", bankService.getWOORIAccount(vo));
			return "getBalance";
		}
		return "forward:WEB-INF/errors/inputError.jsp";

	}

	@RequestMapping("/transferView.do")
	public String transferView() {
		return "transfer";
	}

	@RequestMapping("/transfer.do")
	public String transfer(WOORIBankVO wooriBankVO, KBSTARBankVO kbstarBankVO, HttpServletRequest req, Model model) {

		String bankName = (String) req.getParameter("bankName");
		int transferMoney = Integer.parseInt(req.getParameter("transferMoney"));

		System.out.println(kbstarBankVO.toString());

		if (bankName.equals("KBSTAR")) {
			if (bankService.getKBSTARAccount(kbstarBankVO) != null) {
				wooriBankVO = bankService.getWOORIAccount(wooriBankVO);
				if (wooriBankVO.getBalance() >= transferMoney) {

					wooriBankVO.setTransferMoney(transferMoney);

					kbstarBankVO = bankService.getKBSTARAccount(kbstarBankVO);
					kbstarBankVO.setTransferMoney(transferMoney);

					bankService.withdrawWOORI(wooriBankVO);
					bankService.receiptKBSTAR(kbstarBankVO);
					bankService.transfer(wooriBankVO, kbstarBankVO);

					model.addAttribute("wooriVO", bankService.getWOORIAccount(wooriBankVO));
					model.addAttribute("kbstarVO", bankService.getKBSTARAccount(kbstarBankVO));

					return "transferResult";
				}
				return "forward:WEB-INF/errors/inputMoneyError.jsp";
			}
		}
		return "forward:WEB-INF/errors/inputError.jsp";
	}
}
