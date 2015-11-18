package com.cafe24.glaemfdjd.contract.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractService implements ContractServiceImpl{
	@Autowired
	private ContractDao contractDao;
	
	
	
}
