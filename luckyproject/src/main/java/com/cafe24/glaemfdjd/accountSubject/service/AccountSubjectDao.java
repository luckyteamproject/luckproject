package com.cafe24.glaemfdjd.accountSubject.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountSubjectDao implements AccountSubjectDaoImpl{
	@Autowired
	private SqlSession query;
}
