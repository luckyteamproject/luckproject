package com.cafe24.glaemfdjd.outsourcing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OutsourcingService implements OutsourcingServiceImpl{
	@Autowired
	private OutsourcingDao outsourcingDao;
	
	
	
}
