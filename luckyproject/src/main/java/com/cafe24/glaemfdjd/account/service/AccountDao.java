package com.cafe24.glaemfdjd.account.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao implements AccountDaoImpl{
	@Autowired
	private SqlSession query;
}
