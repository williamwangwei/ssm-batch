package com.william.active.jms.service;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * 队列消费
* @ClassName: QueneReciver
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 王伟 
* @date 2016年8月31日 下午5:37:07
*
 */
public class QueneReciver {
public static void main(String[] args) {
	ConnectionFactory connectionFactory = null;
	Connection conn = null;
	Session session= null;
	try{
		//协议  地址
		String brokerURL = "tcp://192.168.88.142:61616";
		//建立消息服务器连接
		 connectionFactory = new ActiveMQConnectionFactory(brokerURL );
		//创建连接
		 conn = connectionFactory.createConnection();
		conn.start();
		
		//创建  需要事物   消息怎么确认 自动确认
		 session= conn.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
		//建立消息队列 目的地
		Destination destination = session.createQueue("my-quene");
		//创建消費者
		 MessageConsumer consumer = session.createConsumer(destination);
		
		for(int i=0; i<3; i++){
			TextMessage tMessage = (TextMessage) consumer.receive();
			//确认接收一个消息
			session.commit();
			
			System.out.println("TextMessage-----收到的消息-------->"+i+"===="+tMessage);
		}
		
	}catch (Exception e) {
		// TODO: handle exception
	}finally {
		if(session!=null){
			try {
				session.close();
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(conn!=null){
			try {
				conn.close();
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
}
