package com.myspring.pro28.ex05;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Controller("localeController")
public class LocaleController {
	
	@RequestMapping(value="/test/locale.do", method= {RequestMethod.GET})
	public String locale(HttpServletRequest request,
						 HttpServletResponse response) throws Exception {
		System.out.println("localeController¿‘¥œ¥Ÿ.");
		return "locale";
	}
	
}
