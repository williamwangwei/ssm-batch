package com.william.active.jms.service;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


public class SpringMyMessageListener implements MessageListener{

	public void onMessage(Message message) {
		
		try{
			TextMessage tMessage = (TextMessage) message;
			
			System.out.println("收到的消息是 ========="+tMessage);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
