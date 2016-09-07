package com.william.active.jms.service;

import java.net.URI;

import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;
import org.apache.xbean.spring.context.XmlWebApplicationContext;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * active mq 启动的不同方式
* @ClassName: BrokerInner
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 王伟 
* @date 2016年9月1日 下午4:57:17
*
 */
public class BrokerInner {

	public static void main(String[] args) {
		
		//start02();
		ApplicationContext aContext = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext-dao.xml");
		
	}
	
	@Test
	public void test01(){
		ApplicationContext aContext = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext-dao.xml");
		BrokerService broker =(BrokerService)aContext.getBean("broker");
		
	}
	
	public static void start01(){
		BrokerService broker1 = new BrokerService();
		broker1.setUseJmx(true);
		String bindAddress = "tcp://localhost:61616";
		try {
			broker1.addConnector( bindAddress );
			
			broker1.start();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(""+e.getMessage());
		}
	}
	
	public static void start02(){
		
		String bindAddress = "properties:broker.properties";
		try {
			
			BrokerService broker1 = BrokerFactory.createBroker(new URI(bindAddress));
			broker1.addConnector( "tcp://localhost:61616" );
			broker1.start();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(""+e.getMessage());
		}
	}
}
