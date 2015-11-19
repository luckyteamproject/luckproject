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
		
		//db select �˻� �� ��� 
		EmpDto dbEmpDto = signDao.SelectCodeAndPw(emp_code);
		
		if(dbEmpDto!=null){
			if(emp_code.equals(dbEmpDto.getEmp_code())){
				logger.debug("SignService : loginProcess : �����ȣ Ȯ��!");
				
				if(emp_password.equals(dbEmpDto.getEmp_password())){
					logger.debug("SignService : loginProcess : ��й�ȣȮ��!");
					logger.debug("SignService : loginProcess : �α��� ����!");
					return dbEmpDto;
				}else{
					logger.debug("SignService : loginProcess : ��й�ȣ�� ���� �ʽ��ϴ�!");
					return null;
				}
			}
		}else{
			logger.debug("SignService : loginProcess : �������� �ʴ� �����ȣ �Դϴ�");
		}
		return null;
	}
}
