package com.cafe24.glaemfdjd.cashFlow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CashFlowService implements CashFlowServiceImpl{
	@Autowired
	private CashFlowDao cashFlowDao;
	
	
	
}
