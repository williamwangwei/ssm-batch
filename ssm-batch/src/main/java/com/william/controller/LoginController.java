package com.william.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录首页
 * @author 王伟
 *
 */
@Controller
public class LoginController {
	private static final Logger logger = Logger.getLogger(LoginController.class);
	/**
	 * 打开首页
	 * @return
	 */
	@RequestMapping("/")
	public String showIndex(){
		logger.info("进入首页！------------》");
		return "index";
	}
	
	/**
	 * 展示其它页面
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
}
