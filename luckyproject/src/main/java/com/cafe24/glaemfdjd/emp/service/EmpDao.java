package com.cafe24.glaemfdjd.emp.service;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.glaemfdjd.dept.domain.DeptDto;
import com.cafe24.glaemfdjd.emp.domain.EmpDto;
import com.cafe24.glaemfdjd.sign.service.SignDao;

@Repository
public class EmpDao implements EmpDaoImpl{
	private static final Logger logger = LoggerFactory.getLogger(EmpDao.class);
	
	@Autowired
	private SqlSession query;
	private String QS = "com.cafe24.glaemfdjd.emp";


	@Override
	public EmpDto SelectEmpInfo(String emp_code) {
		return query.selectOne(QS+".SelectEmpInfo",emp_code);
	}


	@Override
	public DeptDto SelectEmpDeptInfo(String emp_code) {
		return query.selectOne(QS+".SelectEmpDeptInfo",emp_code);
	}
	
}
