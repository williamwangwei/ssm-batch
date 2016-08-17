package com.william.socket.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;

/**
 * Socket Service服务
 * @author 王伟
 *
 */
public class SocketService {
	
	/**
	 * 发送消息
	 * @param address	地址
	 * @param port		端口
	 * @param sendmsg	发送消息
	 * @param number
	 * @return
	 */
	public String SendMsg(String address, int port, String sendmsg, String number) {
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
	 * @param req
	 * @param inputSeqNo
	 * @return
	 */
	public String replaceSeqNo(String req,String inputSeqNo){
		
		try {
			org.dom4j.Document document = DocumentHelper.parseText(req);
			Element root = document.getRootElement();
			Node element = root.selectSingleNode("//data[@name='SEQ_NO']/field");
			
			element.setText(inputSeqNo);
			
			req = document.asXML();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return req;
	}
}
