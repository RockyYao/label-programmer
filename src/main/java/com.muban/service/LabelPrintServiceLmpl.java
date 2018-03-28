package com.muban.service;

import com.muban.mapper.*;
import com.muban.pojo.BoxSum;
import com.muban.pojo.Labeljob;
import com.muban.pojo.Labeltoprint;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class LabelPrintServiceLmpl implements LabelPrintService {

    @Autowired
    private WorkorderMapper workorderMapper;
    @Autowired
    private BatchidMapper batchidMapper;
    @Autowired
    private LabelmasterdataMapper labelmasterdataMapper;
    @Autowired
    private CommonUtils commonUtils;

    @Autowired
    private LabeltoprintMapper labeltoprintMapper;
    @Autowired
    private LabeljobMapper labeljobMapper;


    @Override
    public Labeltoprint findTrwALL(String workorder) {


        //根据工单查询SAP编号
        String SAPMaterialNo = workorderMapper.selectByPrimaryKey(workorder).getPartno();
        //根据工单查询生产批号


        String SAPMaterialBatchNo = batchidMapper.selectBatchNo(workorder).getBatchno();

        //其他信息LabelMes
        String ModelNo="无数据";
        String DifferentCode="无数据";

        if (labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getModelno()!=null&&
                labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getModelno().length()!=0){
           ModelNo = labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getModelno();
        }


       if (labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getDifferentcode()!=null&&
               labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getDifferentcode().length()!=0){
           DifferentCode=labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getDifferentcode();
        }
        String ProduceName = labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getProductname();
        String ProductNo = labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getProductno();
        String VersionIndex = labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getVersionindex();

        //汽车工业成品
        //收货方
        String CustomerName="无数据";
        if(labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getCustomername()!=null&&
                labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getMaterialno().length()!=0){
            CustomerName=labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getCustomername();
        }

        //物料名称
        String MaterialDescription="无数据";
        if (labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getMaterialdescription()!=null&&
                labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getMaterialdescription().length()!=0){
            MaterialDescription=labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getMaterialdescription();
        }

        //供应商物料编号
        String MaterialNo="无数据";
        if (labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getMaterialno()!=null&&
                labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getMaterialno().length()!=0){
            MaterialNo=labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getMaterialno();

        }


        //供应商代码

        Labeltoprint labeltoprint = commonUtils.trwPrint(workorder,SAPMaterialNo, SAPMaterialBatchNo, ModelNo, DifferentCode, ProduceName, ProductNo, VersionIndex,CustomerName,MaterialDescription,MaterialNo);

        return labeltoprint;
    }


    @Override
    public void pringLabel(Labeljob labeljob, Labeltoprint labeltoprint) {

        labeltoprintMapper.insertSelective(labeltoprint);
        labeljobMapper.insertSelective(labeljob);

    }

    @Override
    public BoxSum boxSumGet(String workorder) {

        String SAPMaterialNo = workorderMapper.selectByPrimaryKey(workorder).getPartno();
        BigDecimal QtySum = workorderMapper.selectByPrimaryKey(workorder).getPlanqty();
        int QtySunm2 = QtySum.intValue();

        //箱数
        int LSize=0;
        if (labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getLsize()!=0){
            LSize=labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getLsize();
        }
        int MSize=0;
        if (labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getMsize()!=0){
            MSize=labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getMsize();
        }
        int SSize=0;
        if (labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getSsize()!=0){
            SSize=labelmasterdataMapper.fiindLabelMasterMessage(SAPMaterialNo).getSsize();
        }

        int BoxSum=0;
        int LsizeQty=0;
        int MsizeQty=0;
        int SsizeQty=0;
        int LastQty=0;
        if (LSize!= 0&&MSize!=0&&SSize!=0){
            LsizeQty=(int)(QtySunm2/LSize);

            if ((QtySunm2-LsizeQty*LSize)>=MSize) {
                MsizeQty = (int) ((QtySunm2 - LsizeQty * LSize) / MSize);
                if ((QtySunm2 - LSize * LSize - MSize * MsizeQty) >= SSize) {
                    SsizeQty = (int) ((QtySunm2 - LSize * LSize - MSize * MsizeQty) / SSize);
                    if ((QtySunm2 - LSize * LSize - MSize * MsizeQty - SsizeQty * SSize) != 0) {
                        SsizeQty=SsizeQty+1;
                        LastQty = 1;
                    }
                }

            }else if ((QtySunm2-LsizeQty*LSize)<MSize&&(QtySunm2-LsizeQty*LSize)>SSize){
                MsizeQty=1;
                LastQty = 1;
            }else if ((QtySunm2-LsizeQty*LSize)<MSize&&(QtySunm2-LsizeQty*LSize)<SSize){
                SsizeQty=1;
                LastQty = 1;
            }


        }else if (LSize==0&&MSize!=0&&SSize!=0){

            MsizeQty=(int)(QtySunm2/MSize);
             if ((QtySunm2 - MSize * MsizeQty) >SSize&&(QtySunm2 - MSize * MsizeQty)<=MSize) {
                 MsizeQty=MsizeQty+1;
                 LastQty=1;
                }else if ((QtySunm2 - MSize * MsizeQty)<=SSize&&(QtySunm2 - MSize * MsizeQty)!=0){
                 SsizeQty=1;
                 LastQty=1;
             }


        }else if (LSize!=0&&MSize==0&&SSize!=0){
            LsizeQty=(int)(QtySunm2/LSize);

            if ((QtySunm2 - LSize * LsizeQty) > SSize&&(QtySunm2 - LSize * LsizeQty)<=LSize) {
                LsizeQty=LsizeQty+1;
                LastQty=1;
            }else if ((QtySunm2 - LSize * LsizeQty)<=SSize&&(QtySunm2 - LSize * LsizeQty)!=0){
                SsizeQty=1;
                LastQty=1;
            }


        }else if (LSize!=0&&MSize!=0&&SSize==0){
            LsizeQty=(int)(QtySunm2/LSize);

            if ((QtySunm2-LsizeQty*LSize)>MSize&&(QtySunm2-LsizeQty*LSize)<=LSize) {
              LsizeQty=LsizeQty+1;
                LastQty=1;
                }else if ((QtySunm2-LsizeQty*LSize)<=MSize&&(QtySunm2-LsizeQty*LSize)!=0){
                MsizeQty=1;
                LastQty=1;
            }

        }else if (LSize!=0&&MSize==0&&SSize==0){

            LsizeQty=(int)(QtySunm2/LSize);
            if ((QtySunm2-LsizeQty*LSize)!=0){
                LsizeQty=LsizeQty+1;
                LastQty=1;
            }

        }else if (LSize==0&&MSize!=0&&SSize==0){
            MsizeQty=(int)(QtySunm2/MSize);
            if ((QtySunm2-MsizeQty*MSize)!=0){
                MsizeQty=MsizeQty+1;
                LastQty=1;
            }

        }else if (LSize==0&&MSize==0&&SSize!=0){
            SsizeQty=(int)(QtySunm2/SSize);
            if ((QtySunm2-SsizeQty*SSize)!=0){
                SsizeQty=SsizeQty+1;
                LastQty=1;
            }
        }

        BoxSum=LsizeQty+MsizeQty+SsizeQty;
        BoxSum boxSum=new BoxSum();
        boxSum.setBoxSum(BoxSum);
        boxSum.setLsizeQty(LsizeQty);
        boxSum.setMsizeQty(MsizeQty);
        boxSum.setSsizeQty(SsizeQty);
        boxSum.setLSize(LSize);
        boxSum.setMSize(MSize);
        boxSum.setSSize(SSize);
        boxSum.setQtySum(QtySunm2);
        boxSum.setLastQty(LastQty);

        return boxSum;
    }

}



