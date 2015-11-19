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
		
		logger.debug("SignService : loginProcess!");
		logger.debug("SignService : loginProcess : emp_code : {}",emp_code);
		logger.debug("SignService : loginProcess : emp_password : {} ",emp_password);
		
		//db select 검색 후 결과 
		EmpDto dbEmpDto = signDao.SelectCodeAndPw(emp_code);
		
		if(dbEmpDto!=null){
			if(emp_code.equals(dbEmpDto.getEmp_code())){
				logger.debug("SignService : loginProcess : 사원번호 확인!");
				
				if(emp_password.equals(dbEmpDto.getEmp_password())){
					logger.debug("SignService : loginProcess : 비밀번호확인!");
					logger.debug("SignService : loginProcess : 로그인 가능!");
					return dbEmpDto;
				}else{
					logger.debug("SignService : loginProcess : 비밀번호가 맞지 않습니다!");
					return null;
				}
			}
		}else{
			logger.debug("SignService : loginProcess : 존재하지 않는 사원번호 입니다");
		}
		return null;
	}
}
