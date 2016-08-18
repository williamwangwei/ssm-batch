package com.william.socket.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Random;


import org.apache.log4j.Logger;
import org.apache.poi.util.StringUtil;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import com.william.socket.dao.ReciveMessage;

/**
 * Socket Service服务
 * 
 * @author 王伟
 *
 */
public class SocketService {
	private static final Logger logger = Logger.getLogger(SocketService.class);

	/**
	 * 发送消息
	 * 
	 * @param address
	 *            地址
	 * @param port
	 *            端口
	 * @param sendmsg
	 *            发送消息
	 * @param number
	 * @return
	 */
	public static String SendMsg(String address, int port, String sendmsg, String number) {
		String resp = "";
		StringBuilder sb = new StringBuilder();
		try {
			Socket socket = new Socket(address, port);
			OutputStream out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(out);
			OutputStreamWriter ow = new OutputStreamWriter(out, "UTF-8");

			String tmpString = sendmsg;
			int num = tmpString.getBytes("UTF-8").length;
			String tString = null;

			if ((number.equals("")) || (number == null)) {
				number = "8";
			}

			tString = String.format("%0" + number + "d", new Object[] { Integer.valueOf(num) });

			if (number.equals("*")) {
				tString = "";
			}

			logger.info("tString=============>" + tString);
			ow.write(tString + tmpString);
			ow.flush();
			socket.shutdownOutput();

			InputStream in = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));

			String tmp = "";
			int index = 0;
			while ((tmp = br.readLine()) != null) {
				if ((index = tmp.indexOf("eof")) != -1) {
					sb.append(tmp.substring(0, index));
					break;
				}
				sb.append(tmp);
			}

			resp = sb.toString();
			socket.shutdownInput();
			br.close();
			in.close();
			pw.close();
			out.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resp;
	}

	/**
	 * 替换序列号
	 * 
	 * @param req
	 * @param inputSeqNo
	 * @return
	 */
	public static String replaceSeqNo(String req, String inputSeqNo) {

		try {
			org.dom4j.Document document = DocumentHelper.parseText(req);
			Element root = document.getRootElement();
			Node element = root.selectSingleNode("//data[@name='SEQ_NO']/field");
			Random random = new Random();
			int rdNum = random.nextInt(100000);
			element.setText(inputSeqNo + rdNum);

			req = document.asXML();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return req;
	}

	public static void parserXml(String fileName, ReciveMessage recMes) throws DocumentException
			 {
		org.dom4j.Document document = DocumentHelper.parseText(fileName);
		Element root = document.getRootElement();
		Node element = root.selectSingleNode("//data[@name='SEQ_NO']/field");
		
		if(element.getText()!=null && !"".equals(element.getText())){
			logger.info("element.getText()=================="+element.getText());
			recMes.setSeqNo(element.getText());
		}else{
			Node element1 = root.selectSingleNode("//data[@name='RET_MSG']/field");
			logger.info("element1.getText()=================="+element1.getText());
			recMes.setSeqNo(element1.getText());
		}
		
		recMes.setRecMessage(fileName);
	}
}
