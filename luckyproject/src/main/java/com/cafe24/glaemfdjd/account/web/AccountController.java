package com.cafe24.glaemfdjd.account.web;

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

import com.cafe24.glaemfdjd.account.service.AccountService;


@Controller
public class AccountController {
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping(value = "/AccountController", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("AccountController {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		accountService.a();
		
		return "content/main.layoutTypeA";
	}
}
