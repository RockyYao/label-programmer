package com.muban.mapper;

import com.muban.pojo.Labelmasterdata;
import com.muban.pojo.LabelmasterdataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LabelmasterdataMapper {
    int countByExample(LabelmasterdataExample example);

    int deleteByExample(LabelmasterdataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Labelmasterdata record);

    int insertSelective(Labelmasterdata record);

    List<Labelmasterdata> selectByExample(LabelmasterdataExample example);

    Labelmasterdata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Labelmasterdata record, @Param("example") LabelmasterdataExample example);

    int updateByExample(@Param("record") Labelmasterdata record, @Param("example") LabelmasterdataExample example);

    int updateByPrimaryKeySelective(Labelmasterdata record);

    int updateByPrimaryKey(Labelmasterdata record);

    Labelmasterdata fiindLabelMasterMessage(String sapmaterialno);
}