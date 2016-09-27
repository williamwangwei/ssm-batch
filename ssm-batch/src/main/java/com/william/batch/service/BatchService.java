package com.william.batch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.william.batch.dao.BatchExeDefineMapper;
import com.william.batch.model.BatchExeDefine;

@Transactional
@Service
public class BatchService {
	@Autowired
	private BatchExeDefineMapper batchExeDefineMapper;
	
	public int deleteByPrimaryKeyS(String batchId){
		return batchExeDefineMapper.deleteByPrimaryKey(batchId);
	}

	public  int insertS(BatchExeDefine record){
    	return batchExeDefineMapper.insert(record);
    }

	public  int insertSelectiveS(BatchExeDefine record){
    	return batchExeDefineMapper.insertSelective(record);
    }

	public BatchExeDefine selectByPrimaryKeyS(String batchId){
    	return batchExeDefineMapper.selectByPrimaryKey(batchId);
    }

	public int updateByPrimaryKeySelectiveS(BatchExeDefine record){
    	return batchExeDefineMapper.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKeyS(BatchExeDefine record){
    	return batchExeDefineMapper.updateByPrimaryKey(record);
    }
}
