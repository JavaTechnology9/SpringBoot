package com.javatechnology;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class CustomErrorHandling implements ErrorController{
	/*
	 * @RequestMapping("/error")
	 * 
	 * @ResponseBody public String handleError(HttpServletRequest request) { Integer
	 * statusCode=(Integer)request.getAttribute("java.servlet.error.status_code");
	 * Exception exception
	 * =(Exception)request.getAttribute("javax.servlet.error.exception"); return
	 * String.format("<html> <body><h2> Error Information</h2>" +
	 * "<div>Exception Message</div></body></html>",
	 * statusCode,exception==null?"N?A":exception.getMessage()); }
	 */
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "/error";
	}

}
