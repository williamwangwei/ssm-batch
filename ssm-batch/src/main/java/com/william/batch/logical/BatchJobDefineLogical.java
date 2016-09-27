package com.william.batch.logical;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.william.batch.model.BatchJobDefine;
import com.william.batch.model.BatchJobDefineExample;
import com.william.batch.service.BatchService;

@Service
public class BatchJobDefineLogical {

	@Autowired
	private BatchService batchService;
	
	public Map listBatchJobDefine(BatchJobDefineExample example){
		int count = batchService.countBatchJobDefineByExampleS(example);
		List<BatchJobDefine> datas = batchService.selectBatchJobDefineByExampleS(example);
		
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("total", count);
		map.put("rows", datas);
		
		return map;
	}
}
