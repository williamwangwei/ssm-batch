package com.william.active.jms.service;


public class TopicPersReciver {
	public static void main(String[] args) {
		
		 String tips;
		 int clientId = 0;
		while(clientId < 5){
			tips = " COME ON !!"+ clientId;
			new TopicPersReciver().startThread(clientId, tips);
			clientId++;
		}
		
	}
	
	public void startThread(final int clientId,final String tips){
		new Thread(new Runnable() {
			
			
			public void run() {
				
				TopicUtil.createTopicSub( clientId, tips);
				
			}
		}).start();
	}
	
	
}
