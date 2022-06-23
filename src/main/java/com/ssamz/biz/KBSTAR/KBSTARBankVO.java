package com.ssamz.biz.KBSTAR;

import java.sql.Date;

import lombok.Data;

@Data
public class KBSTARBankVO {
		private String accountNumberK;
		private String name;
		private int balance;
		private Date receiptDate;
		private Date withdrawDate;
		
		//임금될 금액
		private int transferMoney;
				
}
