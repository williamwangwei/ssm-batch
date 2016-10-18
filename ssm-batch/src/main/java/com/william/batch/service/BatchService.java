package com.william.batch.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.william.batch.controller.BatchController;
import com.william.batch.dao.BatchExeDefineMapper;
import com.william.batch.dao.BatchJobDefineMapper;
import com.william.batch.model.BatchExeDefine;
import com.william.batch.model.BatchJobDefine;
import com.william.batch.model.BatchJobDefineExample;

@Transactional
@Service
public class BatchService {
	
	@Autowired
	private BatchExeDefineMapper batchExeDefineMapper;
	@Autowired
	private BatchJobDefineMapper batchJobDefineMapper;
	private static final Logger logger = Logger.getLogger(BatchController.class);
	@Value("${productName}")
	private String productName;
	
	public int deleteBatchExeDefineByPrimaryKeyS(String batchId){
		return batchExeDefineMapper.deleteByPrimaryKey(batchId);
	}

	public  int insertBatchExeDefineS(BatchExeDefine record){
    	return batchExeDefineMapper.insert(record);
    }

	public  int insertBatchExeDefineSelectiveS(BatchExeDefine record){
    	return batchExeDefineMapper.insertSelective(record);
    }

	public BatchExeDefine selectBatchExeDefineByPrimaryKeyS(String batchId){
		
		logger.info("========>>>>"+productName);
    	return batchExeDefineMapper.selectByPrimaryKey(batchId);
    }

	public int updateBatchExeDefineByPrimaryKeySelectiveS(BatchExeDefine record){
    	return batchExeDefineMapper.updateByPrimaryKeySelective(record);
    }

	public int updateBatchExeDefineByPrimaryKeyS(BatchExeDefine record){
    	return batchExeDefineMapper.updateByPrimaryKey(record);
    }
	
	
	
	//BatchJobDefine
	public int countBatchJobDefineByExampleS(BatchJobDefineExample example){
		return batchJobDefineMapper.countByExample(example);
	}

	public int deleteBatchJobDefineByExampleS(BatchJobDefineExample example){
    	return batchJobDefineMapper.deleteByExample(example);
    }

	public int deleteBatchJobDefineByPrimaryKeyS(String jobId){
    	return batchJobDefineMapper.deleteByPrimaryKey(jobId);
    }

	public int insertBatchJobDefineS(BatchJobDefine record){
		logger.info("insertBatchJobDefineS====================="+record);
    	return  batchJobDefineMapper.insert(record);
    }

	public int insertBatchJobDefineSelectiveS(BatchJobDefine record){
    	return  batchJobDefineMapper.insertSelective(record);
    }

	public List<BatchJobDefine> selectBatchJobDefineByExampleS(BatchJobDefineExample example){
    	return batchJobDefineMapper.selectByExample(example);
    }

	public BatchJobDefine selectBatchJobDefineByPrimaryKeyS(String jobId){
    	return batchJobDefineMapper.selectByPrimaryKey(jobId);
    }

	public int updateBatchJobDefineByExampleSelectiveS(@Param("record") BatchJobDefine record, @Param("example") BatchJobDefineExample example){
    	return batchJobDefineMapper.updateByExampleSelective(record, example);
    }

	public int updateBatchJobDefineByExampleS(@Param("record") BatchJobDefine record, @Param("example") BatchJobDefineExample example){
    	return batchJobDefineMapper.updateByExample(record, example);
    }

	public int updateBatchJobDefineByPrimaryKeySelectiveS(BatchJobDefine record){
    	return batchJobDefineMapper.updateByPrimaryKeySelective(record);
    }

	public int updateBatchJobDefineByPrimaryKeyS(BatchJobDefine record){
    	return batchJobDefineMapper.updateByPrimaryKey(record);
    }
}
