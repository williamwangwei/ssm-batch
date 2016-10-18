package com.william.batch.logical;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.william.batch.model.BatchJobDefine;
import com.william.batch.model.BatchJobDefineExample;
import com.william.batch.service.BatchService;

@Service
public class BatchJobDefineLogical {
	private static final Logger logger = Logger.getLogger(BatchJobDefineLogical.class);
	@Autowired
	private BatchService batchService;
	
	public Map listBatchJobDefine(BatchJobDefineExample example,int limit,int offset){
		//int count = batchService.countBatchJobDefineByExampleS(example);
		
		PageHelper.startPage( offset/limit+1,limit);
		List<BatchJobDefine> datas = batchService.selectBatchJobDefineByExampleS(example);
		PageInfo<BatchJobDefine> pageInfo = new PageInfo<BatchJobDefine>(datas);
		
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());
		
		return map;
	}
	
	public BatchJobDefine saveAndReturnBatchJobDefineS(BatchJobDefine batchJobDefine){
		
		batchService.insertBatchJobDefineS(batchJobDefine);
		logger.info("Logical====================="+batchJobDefine);
		return batchJobDefine;
	}
	
}
