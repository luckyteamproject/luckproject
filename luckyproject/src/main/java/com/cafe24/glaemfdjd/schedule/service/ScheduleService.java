package com.cafe24.glaemfdjd.schedule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService implements ScheduleServiceImpl{
	@Autowired
	private ScheduleDao scheduleDao;
	
	
	
}
