package com.cafe24.glaemfdjd.emp.service;

import com.cafe24.glaemfdjd.dept.domain.DeptDto;
import com.cafe24.glaemfdjd.emp.domain.EmpDto;

public interface EmpServiceImpl {
	public EmpDto EmpInfoSelect(String emp_code);
	public DeptDto EmpDeptInfoSelect(String emp_code);
}
