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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.w3c.dom.events.Event;

import com.cafe24.glaemfdjd.emp.domain.EmpDto;
import com.cafe24.glaemfdjd.sign.service.SignService;


@Controller
@SessionAttributes(value={"emp_code", "emp_password", ""})
public class SignController implements HttpSessionListener{
	private static final Logger logger = LoggerFactory.getLogger(SignController.class);
	
	@Autowired
	SignService signService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginForm(Locale locale, Model model) {
		logger.info("SignController {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "content/loginForm.layoutTypeA";
	}
	
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public String home(Model model, @RequestParam(value="emp_code") String emp_code, 
									@RequestParam(value="emp_password") String emp_password) {
		logger.info("SignController");
		logger.debug("@RequestParam <- emp_code : {}", emp_code);
		logger.debug("@RequestParam <- emp_password : {}", emp_password);
		
		EmpDto empDto;
		
		empDto = signService.loginProcess(emp_code, emp_password);
		
		return "content/loginForm.layoutTypeA";
	}


	@Override
	public void sessionCreated(HttpSessionEvent event) {
		logger.debug("技记 积己");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		logger.debug("技记 昏力");
		
	}}
