package com.cafe24.glaemfdjd.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.glaemfdjd.dept.domain.DeptDto;
import com.cafe24.glaemfdjd.emp.domain.EmpDto;

@Service
public class EmpService implements EmpServiceImpl{
	@Autowired
	private EmpDao empDao;

	//EmpDto���� deptDto, CompanyInfoDto, clientDto�� ������ �÷����� ���ϱ� ���� �޼���
	@Override
	public EmpDto EmpInfoSelect(String emp_code) {
		return empDao.SelectEmpInfo(emp_code);
		
	}

	//EmpDto���� deptDto�� ���ϱ� ���� �޼�����
	@Override
	public DeptDto EmpDeptInfoSelect(String emp_code) {
		return empDao.SelectEmpDeptInfo(emp_code);
	}
	
	
	
}
