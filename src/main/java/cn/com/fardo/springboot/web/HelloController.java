/**
 * 
 */
package cn.com.fardo.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.fardo.springboot.exception.MyException;

/**
 * @author lmq
 *
 */
@Controller
public class HelloController {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "Hello World!!";
	}
	
	@RequestMapping("/testError")
	public String error() throws Exception{
		throw new Exception("error test");
	}
	@RequestMapping("/json")
	public String json() throws MyException{
		throw new MyException("test json Error!!!!");
	}
	
	@RequestMapping("/")
	public String index(ModelMap map){
		map.addAttribute("host", "http://www.163.com?ll");
		return "index";
	}
}
