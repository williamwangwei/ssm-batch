package com.william.batch.controller;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.william.batch.logical.BatchJobDefineLogical;
import com.william.batch.model.BatchJobDefine;
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
	/**
	 * 分页获取BatchJobDefine信息
	* @Title: list
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param search
	* @param @param order
	* @param @param limit
	* @param @param offset
	* @param @return    设定文件
	* @return MappingJacksonValue    返回类型
	* @throws
	 */
	@RequestMapping("list")
	@ResponseBody
	public MappingJacksonValue list(String search,String order,int limit,int offset){
		logger.info("获取批处理列表-------------------》》》"+productName
				+"参数1"+limit+"    参数2"+offset+"       参数3"+search);
		if(!StringUtils.isEmpty(search)){
			try {
				search = new String (search.getBytes("iso-8859-1"),"utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		BatchJobDefineExample example = new BatchJobDefineExample();
		Criteria cri = example.createCriteria();
		if(!StringUtils.isEmpty(search)){
			logger.info(search+"------------->");
			cri.andJobNameLike("%"+search+"%");
		}
		
		
		MappingJacksonValue jacksonValue =new MappingJacksonValue(batchJobDefineLogical.listBatchJobDefine(example,limit,offset));
		return jacksonValue;
	}
	
	@RequestMapping("add")
	public String add(){
		logger.info("进入首页！------------》");
		return "batch/add";
	}
	
	/**
	 * 保存BatchJobDefine值
	* @Title: saveBatchJobDefine
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @return    设定文件
	* @return MappingJacksonValue    返回类型
	* @throws
	 */
	
	@RequestMapping("/addBatchJobDefine")
	@ResponseBody
	public MappingJacksonValue saveBatchJobDefine(@ModelAttribute BatchJobDefine batchJobDefine, HttpServletRequest request, HttpServletResponse response ){
		Map resMap = new HashMap<String, Object>();
		
		batchJobDefine = batchJobDefineLogical.saveAndReturnBatchJobDefineS(batchJobDefine);
		
		logger.info("Controller====================="+batchJobDefine);
		resMap.put("batchJobDefine", batchJobDefine);
		MappingJacksonValue jacksonValue =new MappingJacksonValue(resMap);
		return jacksonValue;
	}
	
	
	@RequestMapping("update")
	public ModelAndView update(String jobId){
		logger.info("进入首页！------------》");
		BatchJobDefine batchJobDefine = batchJobDefineLogical.getBatchJobDefineS(jobId);
		logger.info(batchJobDefine);
		Map<String,Object> data = new HashMap<String,Object>();  
		data.put("batchJobDefine",batchJobDefine);  
		return new ModelAndView("batch/update","batchJobDefine",batchJobDefine); 

		//return "batch/view";
	}
	
	@RequestMapping("/updateBatchJobDefine")
	@ResponseBody
	public MappingJacksonValue updateBatchJobDefine(@ModelAttribute BatchJobDefine batchJobDefine, HttpServletRequest request, HttpServletResponse response ){
		Map resMap = new HashMap<String, Object>();
		String message = "";
		try{
			batchJobDefine = batchJobDefineLogical.updateBatchJobDefineS(batchJobDefine);
			message = "1";
		}catch(Exception e){
				message = e.getMessage();
			
		}
		logger.info("Controller====================="+message);
		resMap.put("message", message);
		
		MappingJacksonValue jacksonValue =new MappingJacksonValue(resMap);
		return jacksonValue;
	}
	
	@RequestMapping("/deleteBatchJobDefine")
	@ResponseBody
	public MappingJacksonValue deleteBatchJobDefine(String jobId ){
		Map resMap = new HashMap<String,Object>();
		batchJobDefineLogical.deleteBatchJobDefineByIdS(jobId);
		logger.info("Controller====================="+jobId);
		resMap.put("flag", 1);
		MappingJacksonValue jacksonValue =new MappingJacksonValue(resMap);
		return jacksonValue;
		
	}
	
	
	@RequestMapping("view")
	public ModelAndView view(String jobId){
		logger.info("进入首页！------------》");
		BatchJobDefine batchJobDefine = batchJobDefineLogical.getBatchJobDefineS(jobId);
		logger.info(batchJobDefine);
		Map<String,Object> data = new HashMap<String,Object>();  
		data.put("batchJobDefine",batchJobDefine);  
		return new ModelAndView("batch/view","batchJobDefine",batchJobDefine); 

	}
	
	
	
	
	

	
}
