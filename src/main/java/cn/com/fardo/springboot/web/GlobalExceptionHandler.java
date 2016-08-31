/**
 * 
 */
package cn.com.fardo.springboot.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.fardo.springboot.exception.MyException;
import cn.com.fardo.springboot.vo.ErrorInfo;

/**
 * 创建全局异常处理类：
 * 通过使用 ControllerAdvice定义统一的异常处理类，而不是每个Controller中逐个定义。
 * 
 * @author lmq
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	public static final String DEFAULT_ERROR_VIEW = "error";
	/**
	 * ExceptionHandler用来定义函数针对的异常类型，最后将Exception对象和请求ＵＲＬ映射到error.html中
	 * @param req
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value=Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest req,Exception e)throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception",e);
		mav.addObject("url",req.getRequestURI());
		mav.setViewName(DEFAULT_ERROR_VIEW);
		return mav;
	}
	@ExceptionHandler(value=MyException.class)
	@ResponseBody
	public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req,MyException e)throws Exception{
		ErrorInfo<String> r = new ErrorInfo<String>();
		r.setCode(ErrorInfo.ERROR);
		r.setData("Some Data");
		r.setUrl(req.getRequestURL().toString());
		return r;
	}
}
