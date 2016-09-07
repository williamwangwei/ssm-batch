package com.william.active.jms.service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;


public class SpringQueneSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext aContext = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext-mq.xml");
		
		//JmsTemplate jmsTemplate = (JmsTemplate)aContext.getBean("jmsTemplate");
		//JmsTemplate jmsTopicTemplate  = (JmsTemplate)aContext.getBean("jmsTopicTemplate");
		JmsTemplate jmsTopicTemplate = (JmsTemplate)aContext.getBean("jmsContainer");
		jmsTopicTemplate.send(new MessageCreator() {
			
			public Message createMessage(Session session) throws JMSException {
				
				TextMessage msg = session.createTextMessage(" ----nio---Spring msg ====1231");
				return msg;
			}
		});
	}

}
