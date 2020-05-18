package com.gzw.demo.exception;

import com.gzw.demo.commonUtils.GzwJsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

//@RestControllerAdvice
public class GzwAjaxExceptionHandler {

//	@ExceptionHandler(value = Exception.class)
	public GzwJsonResult defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {

		e.printStackTrace();

		return GzwJsonResult.errorException(e.getMessage());
	}
}
