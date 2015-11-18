package com.cafe24.glaemfdjd.sign.service;

import com.cafe24.glaemfdjd.emp.domain.EmpDto;

public interface SignDaoImpl {
	public EmpDto SelectIDAndPw(String emp_code);
}
