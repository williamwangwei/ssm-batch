package com.william.batch.dao;

import com.william.batch.model.BatchManage;

public interface BatchManageMapper {
    int deleteByPrimaryKey(String jobId);

    int insert(BatchManage record);

    int insertSelective(BatchManage record);

    BatchManage selectByPrimaryKey(String jobId);

    int updateByPrimaryKeySelective(BatchManage record);

    int updateByPrimaryKey(BatchManage record);
}