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
		
		//db select �˻� �� ��� 
		EmpDto dbEmpDto = signDao.SelectIDAndPw(emp_code);
		
		if(dbEmpDto!=null){
			if(emp_code.equals(dbEmpDto.getEmp_code())){
				logger.debug("SignService : loginProcess : �����ȣ Ȯ��!");
				System.out.println("SignService : loginProcess : �����ȣ Ȯ��!");
			}
		}else{
			logger.debug("SignService : loginProcess : �������� �ʴ� �����ȣ �Դϴ�");
		}
		
		return dbEmpDto;
	}

	
}
