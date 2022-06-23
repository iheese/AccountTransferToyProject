package com.ssamz.biz.KBSTAR;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

// DAO(Data Access Object) 클래스
//@Repository
public class KBSTARBankDAO{
		
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public KBSTARBankVO getKBSTARAccount(KBSTARBankVO vo) {
		System.out.println("KBSTAR 상세 조회");
		return mybatis.selectOne("KBSTARDAO.getKBSTARAccount",vo);
	}
	
	public void updateKBSTAR(KBSTARBankVO vo) {
		System.out.println("KBSTAR 입금");
		mybatis.update("KBSTARDAO.updateKBSTAR", vo);
	}
}
