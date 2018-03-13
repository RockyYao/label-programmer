package com.muban.service;

import com.muban.pojo.Labeltoprint;
import org.springframework.stereotype.Service;


@Service
public class CommonUtils {

    Labeltoprint trwPrint(String workorder,String SAPMaterialNo, String SAPMaterialBatchNo, String ModelNo, String DifferentCode, String ProduceName, String ProductNo, String VersionIndex, String CustomerName,String MaterialDescription,String MaterialNo){

        Labeltoprint labeltoprint = new Labeltoprint();
        labeltoprint.setSapmaterialno(SAPMaterialBatchNo);
        labeltoprint.setSapmaterialno(SAPMaterialBatchNo);
        labeltoprint.setModelno(ModelNo);
        labeltoprint.setDifferentcode(DifferentCode);
        labeltoprint.setProductname(ProduceName);
        labeltoprint.setProductno(ProductNo);
        labeltoprint.setVersionindex(VersionIndex);


        labeltoprint.setWorkorder(workorder);
        labeltoprint.setCustomername(CustomerName);
        labeltoprint.setMaterialdescription(MaterialDescription);
        labeltoprint.setMaterialno(MaterialNo);
        return labeltoprint;

    }


}
