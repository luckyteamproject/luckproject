package com.cafe24.glaemfdjd.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.glaemfdjd.dept.domain.DeptDto;
import com.cafe24.glaemfdjd.emp.domain.EmpDto;

@Service
public class EmpService implements EmpServiceImpl{
	@Autowired
	private EmpDao empDao;

	//EmpDto에서 deptDto, CompanyInfoDto, clientDto를 제외한 컬럼값을 구하기 위한 메서드
	@Override
	public EmpDto EmpInfoSelect(String emp_code) {
		return empDao.SelectEmpInfo(emp_code);
		
	}

	//EmpDto에서 deptDto를 구하기 위한 메서드임
	@Override
	public DeptDto EmpDeptInfoSelect(String emp_code) {
		return empDao.SelectEmpDeptInfo(emp_code);
	}
	
	
	
}
