package com.muban.mapper;

import com.muban.pojo.Labeltoprint;
import com.muban.pojo.LabeltoprintExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LabeltoprintMapper {


    int countByExample(LabeltoprintExample example);

    int deleteByExample(LabeltoprintExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Labeltoprint record);

    int insertSelective(Labeltoprint record);

    List<Labeltoprint> selectByExample(LabeltoprintExample example);

    Labeltoprint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Labeltoprint record, @Param("example") LabeltoprintExample example);

    int updateByExample(@Param("record") Labeltoprint record, @Param("example") LabeltoprintExample example);

    int updateByPrimaryKeySelective(Labeltoprint record);

    int updateByPrimaryKey(Labeltoprint record);



}