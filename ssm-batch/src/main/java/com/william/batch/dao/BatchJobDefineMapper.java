package com.william.batch.dao;

import com.william.batch.model.BatchJobDefine;
import com.william.batch.model.BatchJobDefineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchJobDefineMapper {
    int countByExample(BatchJobDefineExample example);

    int deleteByExample(BatchJobDefineExample example);

    int deleteByPrimaryKey(String jobId);

    int insert(BatchJobDefine record);

    int insertSelective(BatchJobDefine record);

    List<BatchJobDefine> selectByExample(BatchJobDefineExample example);

    BatchJobDefine selectByPrimaryKey(String jobId);

    int updateByExampleSelective(@Param("record") BatchJobDefine record, @Param("example") BatchJobDefineExample example);

    int updateByExample(@Param("record") BatchJobDefine record, @Param("example") BatchJobDefineExample example);

    int updateByPrimaryKeySelective(BatchJobDefine record);

    int updateByPrimaryKey(BatchJobDefine record);
}