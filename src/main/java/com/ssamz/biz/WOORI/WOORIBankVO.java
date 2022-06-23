package com.ssamz.biz.WOORI;

import java.sql.Date;

import lombok.Data;
@Data
public class WOORIBankVO {
		private String accountNumberW;
		private String name;
		private int balance;
		private Date receiptDate;
		private Date withdrawDate;
		
		//이체할 금액
		private int transferMoney;
}
