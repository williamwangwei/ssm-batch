package com.william.active.jms.service;

import java.util.Enumeration;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.ConnectionMetaData;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicSubscriber;

import org.apache.activemq.ActiveMQConnectionFactory;

/**
* @ClassName: TopicUtil
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 王伟 
* @date 2016年9月1日 下午3:26:53
*
*/ 
public class TopicUtil {
	
	/**
	 * 持久化队列名称
	 */
	public final static String PERSISTENCE_TOPIC_NAME="persisten_topical";
	/**
	* @Title: createTopicSub
	* @Description: TODO  创建订阅者
	* @param @param clientId
	* @param @param tips    设定文件
	* @return void    返回类型
	* @throws
	*/ 
	public static void createTopicSub(int clientId,String tips){
		ConnectionFactory connectionFactory = null;
		Connection conn = null;
		Session session = null;
		try {
			// 协议 地址
			String brokerURL = "tcp://192.168.88.142:61616";
			// 建立消息服务器连接
			connectionFactory = new ActiveMQConnectionFactory(brokerURL);
			// 创建连接
			conn = connectionFactory.createConnection();

			// 持久化订阅 接收需要设置客户ID
			conn.setClientID("CC"+clientId);

			// 创建 需要事物 消息怎么确认 自动确认
			session = conn.createSession(Boolean.TRUE, Session.CLIENT_ACKNOWLEDGE);
			// 建立消息队列 目的地
			Topic destination = session.createTopic(PERSISTENCE_TOPIC_NAME);
			// 创建订阅者
			TopicSubscriber topicSubscriber = session.createDurableSubscriber(destination, "T1");

			conn.start();

			ConnectionMetaData metaData = conn.getMetaData();
			Enumeration jmxProper = metaData.getJMSXPropertyNames();
			while (jmxProper.hasMoreElements()) {
				String eleName = (String) jmxProper.nextElement();
				System.out.print(eleName + "==>");
			}
			System.out.println();
			System.out.println("线程名称：  "+Thread.currentThread().getName() +tips);
			Message tMessage = (Message) topicSubscriber.receive();
			while (tMessage != null) {
				TextMessage textMessage = (TextMessage) tMessage;
				System.out.println("客户ID： "+conn.getClientID() + "  线程名称  "+Thread.currentThread().getName() + "  textMessage-----收到的消息-------" + textMessage.getText());
				tMessage = (TextMessage) topicSubscriber.receive(1000L);
			}

			session.commit();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (session != null) {
				try {
					session.close();
				} catch (JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (conn != null) {
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
