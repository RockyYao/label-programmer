package com.muban.mapper;

import com.muban.pojo.Batchid;
import com.muban.pojo.BatchidExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BatchidMapper {
    int countByExample(BatchidExample example);

    int deleteByExample(BatchidExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Batchid record);

    int insertSelective(Batchid record);

    List<Batchid> selectByExample(BatchidExample example);

    Batchid selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Batchid record, @Param("example") BatchidExample example);

    int updateByExample(@Param("record") Batchid record, @Param("example") BatchidExample example);

    int updateByPrimaryKeySelective(Batchid record);

    int updateByPrimaryKey(Batchid record);

    Batchid selectBatchNo(String workorder);
}