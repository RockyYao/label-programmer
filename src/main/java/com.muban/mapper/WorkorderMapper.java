package com.muban.mapper;

import com.muban.pojo.Workorder;
import com.muban.pojo.WorkorderExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface WorkorderMapper {
    int countByExample(WorkorderExample example);

    int deleteByExample(WorkorderExample example);

    int deleteByPrimaryKey(String workorderid);

    int insert(Workorder record);

    int insertSelective(Workorder record);

    List<Workorder> selectByExample(WorkorderExample example);

    Workorder selectByPrimaryKey(String workorderid);

    int updateByExampleSelective(@Param("record") Workorder record, @Param("example") WorkorderExample example);

    int updateByExample(@Param("record") Workorder record, @Param("example") WorkorderExample example);

    int updateByPrimaryKeySelective(Workorder record);

    int updateByPrimaryKey(Workorder record);
}