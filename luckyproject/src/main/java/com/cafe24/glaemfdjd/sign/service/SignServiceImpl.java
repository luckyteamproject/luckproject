package com.cafe24.glaemfdjd.sign.service;

import com.cafe24.glaemfdjd.emp.domain.EmpDto;

public interface SignServiceImpl {
	public EmpDto loginProcess(String emp_code, String emp_password);
}
