package com.william.batch.dao;

import com.william.batch.model.BatchJobDefine;

public interface BatchJobDefineMapper {
    int deleteByPrimaryKey(String jobId);

    int insert(BatchJobDefine record);

    int insertSelective(BatchJobDefine record);

    BatchJobDefine selectByPrimaryKey(String jobId);

    int updateByPrimaryKeySelective(BatchJobDefine record);

    int updateByPrimaryKey(BatchJobDefine record);
}