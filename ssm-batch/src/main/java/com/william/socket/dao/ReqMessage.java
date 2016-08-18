package com.william.socket.dao;

/**
 * 
* @ClassName: ReqMessage	请求报文模板
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 王伟 
* @date 2016年8月18日 上午10:39:19
*
 */
public class ReqMessage {

	private String address;
	private int port;
	private int number;
	private String message;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
