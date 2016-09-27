package com.william.sys.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 *系统服务 
* @ClassName: SystemService
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 王伟 
* @date 2016年9月7日 下午5:52:31
*
 */
@Service
public class SystemService {
	private static final Logger logger = Logger.getLogger(SystemService.class);
	@Value("${productName}")
	private String productName;
	@Value("${copyrightYear}")
	private String copyrightYear;
	@Value("${version}")
	private String version;
	/**
	 * 获取Key加载信息
	 */
	public  boolean printKeyLoadMessage(){
		StringBuilder sb = new StringBuilder();
		sb.append("\r\n======================================================================\r\n");
		sb.append("\r\n    欢迎使用 "+productName+"  - Powered By http://localhost:8080/ssm-batch/\r\n");
		sb.append("\r\n======================================================================\r\n");
		logger.info(sb.toString());
		return true;
	}
}
