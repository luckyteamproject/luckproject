package com.cafe24.glaemfdjd.sign.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cafe24.glaemfdjd.emp.domain.EmpDto;
import com.cafe24.glaemfdjd.sign.web.SignController;

@Repository
public class SignDao implements SignDaoImpl{
	private static final Logger logger = LoggerFactory.getLogger(SignDao.class);
	
	@Autowired
	private SqlSession query;

	@Override
	public EmpDto SelectIDAndPw(String emp_code) {
		logger.debug("EmpDto : SelectIDAndPw()");
		
		EmpDto empDto = query.selectOne("com.cafe24.glaemfdjd.sign.selectIdAndPw", emp_code);
		return empDto;
	}
	 
}
