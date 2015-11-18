package com.cafe24.glaemfdjd.sign.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.glaemfdjd.emp.domain.EmpDto;

@Service
public class SignService implements SignServiceImpl{
	private static final Logger logger = LoggerFactory.getLogger(SignService.class);
	
	@Autowired
	private SignDao signDao;

	@Override
	public EmpDto loginProcess(String emp_code, String emp_password) {
		
		logger.debug("SignService : loginProcess");
		
		//db select 검색 후 결과 
		EmpDto dbEmpDto = signDao.SelectIDAndPw(emp_code);
		
		if(dbEmpDto!=null){
			if(emp_code.equals(dbEmpDto.getEmp_code())){
				logger.debug("SignService : loginProcess : 사원번호 확인!");
				System.out.println("SignService : loginProcess : 사원번호 확인!");
			}
		}else{
			logger.debug("SignService : loginProcess : 존재하지 않는 사원번호 입니다");
		}
		
		return dbEmpDto;
	}

	
}
