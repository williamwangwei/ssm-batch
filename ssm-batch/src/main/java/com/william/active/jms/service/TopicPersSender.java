package com.william.active.jms.service;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class TopicPersSender {
	public static void main(String[] args)  {
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
			
			
			//创建  需要事物   消息怎么确认 自动确认
			 session= conn.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
			//建立消息队列 目的地
			 Destination destination = session.createTopic(TopicUtil.PERSISTENCE_TOPIC_NAME);
			//创建生产者  发出消息 到 目的地队列
			MessageProducer producer = session.createProducer(destination);
			
			//持久化
			producer.setDeliveryMode(DeliveryMode.PERSISTENT);
			
			conn.start();
			for(int i=0; i<2; i++){
				/*TextMessage message = session.createTextMessage("message-------"+i);
				message.setStringProperty("property"+i, "property"+i+"===========william"+i);
				message.setStringProperty("username", "william");
				message.setJMSDestination(arg0);*/
				
				 TextMessage message = session.createTextMessage(" send Message 3 PERSISTENT...."+i+"-----哒哒！！！");
				message.setStringProperty("william extra", "学习"+i );
				//停1秒
				//Thread.sleep(1000);
				//通过消息生成者发送消息
				producer.send(message);
			}
			//批量发送  提升性能
			session.commit();
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
