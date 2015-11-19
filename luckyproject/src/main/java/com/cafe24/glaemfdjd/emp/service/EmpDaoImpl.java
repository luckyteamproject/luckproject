package com.cafe24.glaemfdjd.emp.service;

import com.cafe24.glaemfdjd.dept.domain.DeptDto;
import com.cafe24.glaemfdjd.emp.domain.EmpDto;

public interface EmpDaoImpl {
	public EmpDto SelectEmpInfo(String emp_code);
	public DeptDto SelectEmpDeptInfo(String emp_code);
}
