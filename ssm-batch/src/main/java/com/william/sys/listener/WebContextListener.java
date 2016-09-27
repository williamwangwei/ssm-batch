package com.william.sys.listener;

import javax.servlet.ServletContext;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

import com.william.sys.service.SystemService;

/**
 * 
* @ClassName: WebContextListener
* @Description: 容器初始化信息  打印系统加载信息
* @author 王伟 
* @date 2016年9月7日 下午5:47:39
*
 */

public class WebContextListener extends ContextLoaderListener{

	/*@Resource
	private SystemService systemService;*/
	@Override
	public WebApplicationContext initWebApplicationContext(ServletContext servletContext) {
		if (!new SystemService().printKeyLoadMessage()){
			return null;
		}
		return super.initWebApplicationContext(servletContext);
	}
}
