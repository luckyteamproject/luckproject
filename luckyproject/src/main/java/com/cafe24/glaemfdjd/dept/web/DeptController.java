package com.cafe24.glaemfdjd.dept.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.glaemfdjd.dept.service.DeptService;

@Controller
public class DeptController {
	private static final Logger logger = LoggerFactory.getLogger(DeptController.class);
	
	@Autowired
	DeptService deptService;
	
	@RequestMapping(value = "/DeptController", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("DeptController {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "content/main.layoutTypeA";
	}
}
