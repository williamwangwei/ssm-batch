package com.william.socket.dao;

/**
 * 返回报文
* @ClassName: ReciveMessage
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 王伟 
* @date 2016年8月18日 上午10:39:40
*
 */
public class ReciveMessage {

	private String seqNo;
	private String  recMessage;
	public String getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}
	public String getRecMessage() {
		return recMessage;
	}
	public void setRecMessage(String recMessage) {
		this.recMessage = recMessage;
	}
	
	
}
