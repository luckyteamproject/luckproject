package com.cafe24.glaemfdjd.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService implements EmpServiceImpl{
	@Autowired
	private EmpDao empDao;
	
	
	
}
