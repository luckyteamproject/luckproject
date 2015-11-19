package com.cafe24.glaemfdjd.sign.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cafe24.glaemfdjd.emp.domain.EmpDto;

@Repository
public class SignDao implements SignDaoImpl{
	private static final Logger logger = LoggerFactory.getLogger(SignDao.class);
	
	@Autowired
	private SqlSession query;
	private String QS = "com.cafe24.glaemfdjd.sign";

	//로그인시 사원번호와 비밀번호를 확인하기 위한 메서드
	@Override
	public EmpDto SelectCodeAndPw(String emp_code) {
		logger.debug("EmpDto : SelectIDAndPw()!");
	
		return query.selectOne(QS+".selectIdAndPw", emp_code);
	} 
}
