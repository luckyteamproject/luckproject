package com.cafe24.glaemfdjd.sign.service;

import com.cafe24.glaemfdjd.emp.domain.EmpDto;

public interface SignServiceImpl {
	public EmpDto signInProcess(String emp_code, String emp_password);
}
