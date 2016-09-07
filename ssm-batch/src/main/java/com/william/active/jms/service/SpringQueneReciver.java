package com.william.active.jms.service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class SpringQueneReciver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext aContext = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext-mq.xml");
		
		//JmsTemplate jmsTemplate = (JmsTemplate)aContext.getBean("jmsTemplate");
		JmsTemplate jmsTopicTemplate  = (JmsTemplate)aContext.getBean("jmsTopicTemplate");
		String msg = (String)jmsTopicTemplate.receiveAndConvert();
		System.out.println(msg);
	}
}
