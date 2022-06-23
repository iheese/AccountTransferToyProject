package com.ssamz.biz.WOORI;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

//우리은행 DAO
public class WOORIBankDAO{
		
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public WOORIBankVO getWOORIAccount(WOORIBankVO vo) {
		System.out.println("WOORI 상세 조회");
		return mybatis.selectOne("WOORIDAO.getWOORIAccount",vo);
	}

	public void updateWOORI(WOORIBankVO vo) {
		System.out.println("WOORI 출금");
		mybatis.update("WOORIDAO.updateWOORI", vo);
	}
}
