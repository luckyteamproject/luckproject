package com.cafe24.glaemfdjd.ongoingFacility.web;

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

import com.cafe24.glaemfdjd.accountSubject.service.AccountSubjectService;
import com.cafe24.glaemfdjd.ongoingFacility.service.OngoingFacilityDao;
import com.cafe24.glaemfdjd.ongoingFacility.service.OngoingFacilityService;


@Controller
public class OngoingFacilityController {
	private static final Logger logger = LoggerFactory.getLogger(OngoingFacilityController.class);
	
	@Autowired
	OngoingFacilityService ongoingFacilityService;
	
	@RequestMapping(value = "/OngoingFacilityController", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("OngoingFacilityController {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "content/main.layoutTypeA";
	}
}
