package com.william.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
* @ClassName: SocketController
* @Description: Socket web控制器  完成页面跳转  数据传递
* @author 王伟   
* @date 2016年8月18日 上午10:03:22
*
 */
@Controller
@RequestMapping("/socket/")
public class SocketController {
	@RequestMapping("index")
	public String index(){
		
		return "socket/index";
	}
	
	@RequestMapping("req")
	public String request(){
		
		return null;
	}

}
