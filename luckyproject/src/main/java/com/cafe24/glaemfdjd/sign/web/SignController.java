package com.cafe24.glaemfdjd.sign.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.w3c.dom.events.Event;

import com.cafe24.glaemfdjd.emp.domain.EmpDto;
import com.cafe24.glaemfdjd.sign.service.SignService;

@Controller
@SessionAttributes(value={"loginEmp"})
public class SignController {
	private static final Logger logger = LoggerFactory.getLogger(SignController.class);
	
	@Autowired
	SignService signService;
	
	//�α��� ��
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginForm(Locale locale, Model model) {
		logger.info("SignController {}.", locale);
		
		return "content/loginForm.lu.layoutA";
	}
	
	//�α��� ���� �� �ּ�â���� index�� ���� �Է����� �� session�� ������ ä index �������� �̵�
	@RequestMapping(value = "/index.lu", method = RequestMethod.GET)
	public String loginProcess(@ModelAttribute(value="loginEmp") EmpDto empDto, Model model) {
		logger.info("SignController : loginProcess()! : GET");
		
		//session�� ����� loginEmp�� model�� ������ �ѷ���
		model.addAttribute("loginEmp", empDto);
		
		return "content/index.lu.layoutA";
	}

	//�α���
	@RequestMapping(value = "/index.lu", method = RequestMethod.POST)
	public String loginProcess(Model model, @RequestParam(value="emp_code") String emp_code, 
											@RequestParam(value="emp_password") String emp_password) {
		logger.info("SignController : loginProcess()! : POST");
		logger.debug("@RequestParam <- emp_code : {}", emp_code);
		logger.debug("@RequestParam <- emp_password : {}", emp_password);
		
		EmpDto empDto = signService.loginProcess(emp_code, emp_password);
		
		logger.debug("SignController : loginProcess : empDto : {}", empDto);
		
		if(empDto==null){
			return "content/loginForm.layoutA";
		}
		
		//session�� ����� loginEmp�� model�� ������ �ѷ���
		model.addAttribute("loginEmp", empDto);
		
		return "content/index.lu.layoutA";
	}

}
