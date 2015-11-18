package com.cafe24.glaemfdjd.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements ClientServiceImpl{
	@Autowired
	private ClientDao clientDao;
	
	
	
}
