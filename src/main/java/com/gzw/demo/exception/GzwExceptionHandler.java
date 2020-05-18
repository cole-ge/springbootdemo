package com.gzw.demo.exception;

import com.gzw.demo.commonUtils.GzwJsonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class GzwExceptionHandler {

	public static final String GZW_ERROR_VIEW = "error";
	/*
	//@ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest reqest,
    		HttpServletResponse response, Exception e) throws Exception {

    	e.printStackTrace();

		ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", reqest.getRequestURL());
        mav.setViewName(GZW_ERROR_VIEW);
        return mav;
    }
	*/
	@ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest reqest, 
    		HttpServletResponse response, Exception e) throws Exception {
    	
    	e.printStackTrace();

    	if (isAjax(reqest)) {
			//如果是ajax请求，返回json数据
			return GzwJsonResult.errorException(e.getMessage());
    	} else {
    		//否则跳转页面
    		ModelAndView mav = new ModelAndView();
            mav.addObject("exception", e);
            mav.addObject("url", reqest.getRequestURL());
            mav.setViewName(GZW_ERROR_VIEW);
            return mav;
    	}
    }

	@ExceptionHandler(value = GzwException.class)
	public Object gzwExceptionHandler(HttpServletRequest reqest,
							   HttpServletResponse response, Exception e) throws Exception {

		e.printStackTrace();

		if (isAjax(reqest)) {
			//如果是ajax请求，返回json数据
			return GzwJsonResult.errorException(e.getMessage() + "gzwExceptionHandler");
		} else {
			//否则跳转页面
			ModelAndView mav = new ModelAndView();
			mav.addObject("exception", e);
			mav.addObject("url", reqest.getRequestURL() + "~~~~~gzwExceptionHandler");
			mav.setViewName(GZW_ERROR_VIEW);
			return mav;
		}
	}

	/**
	 * 
	 * @Title: IMoocExceptionHandler.java
	 * @Package com.imooc.exception
	 * @Description: 判断是否是ajax请求
	 * Copyright: Copyright (c) 2017
	 * Company:FURUIBOKE.SCIENCE.AND.TECHNOLOGY
	 * 
	 * @author leechenxiang
	 * @date 2017年12月3日 下午1:40:39
	 * @version V1.0
	 */
	public static boolean isAjax(HttpServletRequest httpRequest){
		return  (httpRequest.getHeader("X-Requested-With") != null  
					&& "XMLHttpRequest"
						.equals( httpRequest.getHeader("X-Requested-With").toString()) );
	}
}
