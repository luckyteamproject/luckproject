package com.cafe24.glaemfdjd.sign.service;

import com.cafe24.glaemfdjd.emp.domain.EmpDto;

public interface SignDaoImpl {
	public EmpDto SelectCodeAndPw(String emp_code);
}
