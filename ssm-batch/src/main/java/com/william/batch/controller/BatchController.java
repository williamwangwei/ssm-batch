package com.william.batch.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.william.batch.logical.BatchJobDefineLogical;
import com.william.batch.model.BatchJobDefineExample;
import com.william.batch.model.BatchJobDefineExample.Criteria;
import com.william.batch.service.BatchService;
/**
 * 
* @ClassName: BatchController
* @Description: 批处理首页
* @author 王伟 
* @date 2016年9月27日 下午4:09:08
*
 */
@Controller
@RequestMapping("/batch/")
public class BatchController {
	private static final Logger logger = Logger.getLogger(BatchController.class);
	@Value("${productName}")
	private String productName;
	
	@Autowired
	private BatchService batchService;
	@Autowired
	private BatchJobDefineLogical batchJobDefineLogical;
	
	@RequestMapping("index")
	public String index(){
		logger.info("进入首页！------------》");
		return "batch/index";
	}
	
	
	@RequestMapping("list")
	@ResponseBody
	public MappingJacksonValue list(String search,String order,int limit,int offset){
		logger.info("获取批处理列表-------------------》》》"+productName
				+"参数1"+limit+"    参数2"+offset+"       参数3"+search);
		BatchJobDefineExample example = new BatchJobDefineExample();
		Criteria cri = example.createCriteria();
		cri.andJobNameLike("%"+search+"%");
		MappingJacksonValue jacksonValue =new MappingJacksonValue(batchJobDefineLogical.listBatchJobDefine(example));
		logger.info("json数据==============="+jacksonValue);
		return jacksonValue;
	}
}
