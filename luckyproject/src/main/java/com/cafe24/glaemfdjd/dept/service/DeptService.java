package com.cafe24.glaemfdjd.dept.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService implements DeptServiceImpl{
	@Autowired
	private DeptDao deptDao;
	
	
	
}
