package com.william.active.jms.service;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * 队列发送信息
* @ClassName: QueneSender
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 王伟 
* @date 2016年8月31日 下午5:36:09
*
 */
public class QueneSender {
	
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
			conn.start();
			
			//创建  需要事物   消息怎么确认 自动确认
			 session= conn.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
			//建立消息队列 目的地
			Destination destination = session.createQueue("my-quene");
			//创建生产者  发出消息 到 目的地队列
			MessageProducer pro = session.createProducer(destination);
			
			for(int i=0; i<3; i++){
				TextMessage message = session.createTextMessage("message-------"+i);
				//停1秒
				Thread.sleep(1000);
				//通过消息生成者发送消息
				pro.send(message);
			}
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
