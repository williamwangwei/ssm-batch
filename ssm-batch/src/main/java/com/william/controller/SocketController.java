package com.william.controller;

import org.apache.log4j.Logger;
import org.dom4j.DocumentException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.william.socket.dao.ReciveMessage;
import com.william.socket.dao.ReqMessage;
import com.william.socket.service.SocketService;

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
	private static final Logger logger = Logger.getLogger(SocketController.class);
	
	@RequestMapping("index")
	public String index(){
		
		return "socket/index";
	}
	
	@RequestMapping(value="req",method=RequestMethod.POST)
	@ResponseBody
	public Object request(@ModelAttribute("ReqMessage") ReqMessage reqMess){
		
		
		//生成流水号
		String message = SocketService.replaceSeqNo(reqMess.getMessage(), "WILLIAM20160818");
		
		reqMess.setMessage(message);
		//发送请求
		String resc = SocketService.SendMsg(reqMess.getAddress(), reqMess.getPort(), reqMess.getMessage(), reqMess.getNumber());
		int red = Integer.parseInt(reqMess.getNumber());
		resc = resc.substring(red);
		logger.info(resc);
		//解析报文
		ReciveMessage recMes = new ReciveMessage();
		
		try {
			SocketService.parserXml(resc, recMes);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return recMes;
	}

}
