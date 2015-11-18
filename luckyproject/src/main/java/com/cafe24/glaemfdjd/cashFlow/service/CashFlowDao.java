package com.cafe24.glaemfdjd.cashFlow.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CashFlowDao implements CashFlowDaoImpl{
	@Autowired
	private SqlSession query;
}
