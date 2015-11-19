package com.cafe24.glaemfdjd.emp.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cafe24.glaemfdjd.emp.domain.EmpDto;
import com.cafe24.glaemfdjd.emp.service.EmpService;


@Controller
@SessionAttributes(value="signEmp")
public class EmpController {
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
	
	@Autowired
	EmpService empService;
	
	@RequestMapping(value = "/empInfo.lu", method = RequestMethod.GET)
	public String empInfo(Locale locale, Model model, @ModelAttribute(value="signEmp") EmpDto signEmp) {
		logger.info("EmpController {}.", locale);
		String emp_code = signEmp.getEmp_code();
		
		logger.debug("EmpController : empInfo : emp_code : {}.", emp_code);
		
		EmpDto empDto = empService.EmpInfoSelect(emp_code);
		empDto.setDeptDto(empService.EmpDeptInfoSelect(emp_code));
		//empDto의 DeptDto값이 잘 들어왔는지 확인하는 logger
		logger.debug("EmpController : empInfo : empDto.getDeptDto() : {}.", empDto.getDeptDto());
		
		model.addAttribute("empDto", empDto);
		return "emp/empInfo.lu.layoutC";
	}
}
