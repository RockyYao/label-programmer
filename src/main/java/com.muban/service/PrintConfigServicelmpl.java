package com.muban.service;

import com.muban.mapper.LabelprintconfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrintConfigServicelmpl implements PrintConfigService {

/**
 * 查询打印机名字

 */
    @Autowired
    LabelprintconfigMapper labelprintconfigMapper;

    @Override
    public String  findPrintMeachine(String ip, String templateName) {

       String printname= labelprintconfigMapper.selectPrintName(ip,templateName);

       return printname;

    }



}
