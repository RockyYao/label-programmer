package com.muban.mapper;

import com.muban.pojo.Labeljob;
import com.muban.pojo.LabeljobExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LabeljobMapper {
    int countByExample(LabeljobExample example);

    int deleteByExample(LabeljobExample example);

    int deleteByPrimaryKey(String jobid);

    int insert(Labeljob record);

    int insertSelective(Labeljob record);

    List<Labeljob> selectByExample(LabeljobExample example);

    Labeljob selectByPrimaryKey(String jobid);

    int updateByExampleSelective(@Param("record") Labeljob record, @Param("example") LabeljobExample example);

    int updateByExample(@Param("record") Labeljob record, @Param("example") LabeljobExample example);

    int updateByPrimaryKeySelective(Labeljob record);

    int updateByPrimaryKey(Labeljob record);
}