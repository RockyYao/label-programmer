package com.muban.mapper;

import com.muban.pojo.Labelprintconfig;
import com.muban.pojo.LabelprintconfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LabelprintconfigMapper {
    int countByExample(LabelprintconfigExample example);

    int deleteByExample(LabelprintconfigExample example);

    int deleteByPrimaryKey(Long configid);

    int insert(Labelprintconfig record);

    int insertSelective(Labelprintconfig record);

    List<Labelprintconfig> selectByExample(LabelprintconfigExample example);

    Labelprintconfig selectByPrimaryKey(Long configid);

    int updateByExampleSelective(@Param("record") Labelprintconfig record, @Param("example") LabelprintconfigExample example);

    int updateByExample(@Param("record") Labelprintconfig record, @Param("example") LabelprintconfigExample example);

    int updateByPrimaryKeySelective(Labelprintconfig record);

    int updateByPrimaryKey(Labelprintconfig record);

    String selectPrintName(String ip,String templateName);
}