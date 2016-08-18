package com.william.batch.dao;

import com.william.batch.model.BatchExeDefine;

public interface BatchExeDefineMapper {
    int deleteByPrimaryKey(String batchId);

    int insert(BatchExeDefine record);

    int insertSelective(BatchExeDefine record);

    BatchExeDefine selectByPrimaryKey(String batchId);

    int updateByPrimaryKeySelective(BatchExeDefine record);

    int updateByPrimaryKey(BatchExeDefine record);
}