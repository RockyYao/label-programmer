package com.muban.controller;
/**
 * author:rockyyao
 * time:2018.3.5
 */

import com.muban.pojo.BoxSum;
import com.muban.pojo.Labeljob;
import com.muban.pojo.Labeltoprint;
import com.muban.service.LabelPrintService;
import com.muban.service.PrintConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class LabelPrintController {

    @Autowired
    LabelPrintService labelPrintService;

    @Autowired
    PrintConfigService printConfigService;

    @RequestMapping("/main")
    public String mainjsp() {
        return "laberprint";
    }

    @RequestMapping("/findall")
    public ModelAndView findAll(String workorder, String custIndustry) {
        ModelAndView mv = new ModelAndView();
        //  Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
        BoxSum boxSum = labelPrintService.boxSumGet(workorder);
        if (custIndustry.equals("TRW半成品标签")) {
            String type = "trw";
            mv.addObject("type", type);
        } else if (custIndustry.equals("汽车和工业件成品标签")) {
            String type = "car";
            mv.addObject("type", type);
        } else if (custIndustry.equals("汽车和工业件其他标签")) {
            String type = "car2";
            mv.addObject("type", type);

        }

        List list = new ArrayList();
        int i;
        if (boxSum.getLastQty() != 0) {


            if (boxSum.getLsizeQty() != 0 && boxSum.getMsizeQty() != 0) {


                for (i = 0; i < boxSum.getLsizeQty(); i++) {
                    Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
                    labeltoprint.setBoxsum(Long.valueOf(boxSum.getBoxSum()));
                    labeltoprint.setBoxno(String.valueOf(i + 1));
                    labeltoprint.setBoxszie("大");
                    labeltoprint.setQtysum(boxSum.getLSize());
                    list.add(labeltoprint);
                }

                Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
                labeltoprint.setBoxsum(Long.valueOf(boxSum.getBoxSum()));
                labeltoprint.setBoxno(String.valueOf(boxSum.getBoxSum()));
                labeltoprint.setBoxszie("中");
                labeltoprint.setQtysum(boxSum.getQtySum() - boxSum.getLSize() * boxSum.getLsizeQty());
                list.add(labeltoprint);


            } else if (boxSum.getLsizeQty() != 0 && boxSum.getSsizeQty() != 0) {

                for (i = 0; i < boxSum.getLsizeQty(); i++) {
                    Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
                    labeltoprint.setBoxsum(Long.valueOf(boxSum.getBoxSum()));
                    labeltoprint.setBoxno(String.valueOf(i + 1));
                    labeltoprint.setBoxszie("大");
                    list.add(labeltoprint);

                }


                Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
                labeltoprint.setBoxsum(Long.valueOf(boxSum.getBoxSum()));
                labeltoprint.setBoxno(String.valueOf(boxSum.getBoxSum()));
                labeltoprint.setBoxszie("小");
                labeltoprint.setQtysum(boxSum.getQtySum() - boxSum.getLSize() * boxSum.getLsizeQty());
                list.add(labeltoprint);


            } else if (boxSum.getMsizeQty() != 0 && boxSum.getSsizeQty() != 0) {


                for (i = 0; i < boxSum.getMsizeQty(); i++) {
                    Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
                    labeltoprint.setBoxsum(Long.valueOf(boxSum.getBoxSum()));
                    labeltoprint.setBoxno(String.valueOf(i + 1));
                    labeltoprint.setBoxszie("中");
                    list.add(labeltoprint);

                }

                Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
                labeltoprint.setBoxsum(Long.valueOf(boxSum.getBoxSum()));
                labeltoprint.setBoxno(String.valueOf(boxSum.getBoxSum()));
                labeltoprint.setBoxszie("小");
                labeltoprint.setQtysum(boxSum.getQtySum() - boxSum.getMSize() * boxSum.getMsizeQty());
                list.add(labeltoprint);

            } else if (boxSum.getLsizeQty() != 0 && boxSum.getSsizeQty() == 0 && boxSum.getMsizeQty() == 0) {

                for (i = 0; i < boxSum.getLsizeQty() - 1; i++) {
                    Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
                    labeltoprint.setBoxsum(Long.valueOf(boxSum.getBoxSum()));
                    labeltoprint.setBoxno(String.valueOf(i + 1));
                    labeltoprint.setBoxszie("大");
                    labeltoprint.setQtysum(boxSum.getLSize());
                    list.add(labeltoprint);
                }

                Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
                labeltoprint.setBoxsum(Long.valueOf(boxSum.getBoxSum()));
                labeltoprint.setBoxno(String.valueOf(boxSum.getBoxSum()));
                labeltoprint.setBoxszie("大");
                labeltoprint.setQtysum(boxSum.getQtySum() - boxSum.getLSize() * (boxSum.getLsizeQty() - 1));
                list.add(labeltoprint);


            } else if (boxSum.getLsizeQty() == 0 && boxSum.getSsizeQty() != 0 && boxSum.getMsizeQty() == 0) {

                for (i = 0; i < boxSum.getMsizeQty() - 1; i++) {
                    Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
                    labeltoprint.setBoxsum(Long.valueOf(boxSum.getBoxSum()));
                    labeltoprint.setBoxno(String.valueOf(i + 1));
                    labeltoprint.setBoxszie("中");
                    list.add(labeltoprint);

                }

                Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
                labeltoprint.setBoxsum(Long.valueOf(boxSum.getBoxSum()));
                labeltoprint.setBoxno(String.valueOf(boxSum.getBoxSum()));
                labeltoprint.setBoxszie("中");
                labeltoprint.setQtysum(boxSum.getQtySum() - boxSum.getMSize() * (boxSum.getMsizeQty() - 1));
                list.add(labeltoprint);


            } else if (boxSum.getLsizeQty() == 0 && boxSum.getSsizeQty() == 0 && boxSum.getMsizeQty() != 0) {

                for (i = 0; i < boxSum.getSsizeQty() - 1; i++) {
                    Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
                    labeltoprint.setBoxsum(Long.valueOf(boxSum.getBoxSum()));
                    labeltoprint.setBoxno(String.valueOf(i + 1));
                    labeltoprint.setBoxszie("小");
                    list.add(labeltoprint);

                }

                Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
                labeltoprint.setBoxsum(Long.valueOf(boxSum.getBoxSum()));
                labeltoprint.setBoxno(String.valueOf(boxSum.getBoxSum()));
                labeltoprint.setBoxszie("小");
                labeltoprint.setQtysum(boxSum.getQtySum() - boxSum.getMSize() * (boxSum.getSsizeQty() - 1));
                list.add(labeltoprint);


            }


        } else {
            if (boxSum.getLsizeQty() != 0) {

                for (i = 0; i < boxSum.getLsizeQty(); i++) {
                    Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
                    labeltoprint.setBoxsum(Long.valueOf(boxSum.getBoxSum()));
                    labeltoprint.setBoxno(String.valueOf(i + 1));
                    labeltoprint.setBoxszie("大");
                    labeltoprint.setQtysum(boxSum.getLSize());
                    list.add(labeltoprint);
                }

            }
            if (boxSum.getMsizeQty() != 0) {

                for (i = 0; i < boxSum.getMsizeQty(); i++) {
                    Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
                    labeltoprint.setBoxsum(Long.valueOf(boxSum.getBoxSum()));
                    labeltoprint.setBoxno(String.valueOf(i + 1));
                    labeltoprint.setBoxszie("中");
                    list.add(labeltoprint);

                }


            }

            if (boxSum.getSsizeQty() != 0) {

                for (i = 0; i < boxSum.getSsizeQty(); i++) {
                    Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
                    labeltoprint.setBoxsum(Long.valueOf(boxSum.getBoxSum()));
                    labeltoprint.setBoxno(String.valueOf(i + 1));
                    labeltoprint.setBoxszie("小");
                    list.add(labeltoprint);

                }


            }


        }


        mv.addObject("list", list);
        mv.addObject("boxsum", boxSum);
        //    mv.addObject("label", labeltoprint);
        mv.setViewName("laberprint");
        return mv;
    }

    //打印TRW
    @RequestMapping("printTrw")
    @ResponseBody
    public String printTrw(String workorder, HttpServletRequest res, int qtysum, String boxszie, int boxsum, int boxno) {


        Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
        //print
        UUID uuid = UUID.randomUUID();
        String uuidSid = String.valueOf(uuid);
        labeltoprint.setJobid(uuidSid);

        Date date = new Date();
        // SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        labeltoprint.setUpdatetime(date);
        labeltoprint.setPrinttime(date);
        labeltoprint.setPrintqty(1);
        labeltoprint.setStatus("P");
        labeltoprint.setQtysum(qtysum);
        labeltoprint.setBoxszie(boxszie);
        labeltoprint.setBoxno(String.valueOf(boxno + "/" + boxsum));
        labeltoprint.setBoxsum(Long.valueOf(boxsum));
        labeltoprint.setPrinttemplate("Tp008.yncx");

        labeltoprint.setProductiondate(String.valueOf(date));
        //获取IP JOB
        String Ip = res.getRemoteAddr();

        Labeljob labeljob = new Labeljob();

        labeljob.setJobid(uuidSid);
        labeljob.setCreateddttm(date);
        labeljob.setUpdateddttm(date);
        labeljob.setTemplate("Tp008.yncx");
        labeljob.setJobtype("P");
        labeljob.setJobstatus(0);

        labeljob.setJobowner(Ip);
        labeljob.setUpdatedby(Ip);

        labelPrintService.pringLabel(labeljob, labeltoprint);
        return "success";
    }

    //预览TRW

    @RequestMapping("viewTrw")
    @ResponseBody
    public String viewTrw(String workorder, HttpServletRequest res, int qtysum, String boxszie, int boxsum, int boxno) {


        Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
        //print
        UUID uuid = UUID.randomUUID();
        String uuidSid = String.valueOf(uuid);
        labeltoprint.setJobid(uuidSid);

        Date date = new Date();
        // SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        labeltoprint.setUpdatetime(date);
        labeltoprint.setPrinttime(date);
        labeltoprint.setPrintqty(1);
        labeltoprint.setStatus("V");
        labeltoprint.setQtysum(qtysum);
        labeltoprint.setBoxszie(boxszie);
        labeltoprint.setBoxno(String.valueOf(boxno + "/" + boxsum));
        labeltoprint.setBoxsum(Long.valueOf(boxsum));
        labeltoprint.setPrinttemplate("Tp008.yncx");

        labeltoprint.setProductiondate(String.valueOf(date));
        //获取IP JOB
        String Ip = res.getRemoteAddr();

        Labeljob labeljob = new Labeljob();

        labeljob.setJobid(uuidSid);
        labeljob.setCreateddttm(date);
        labeljob.setUpdateddttm(date);
        labeljob.setTemplate("Tp008.yncx");
        labeljob.setJobtype("V");
        labeljob.setJobstatus(0);

        labeljob.setJobowner(Ip);
        labeljob.setUpdatedby(Ip);

        labelPrintService.pringLabel(labeljob, labeltoprint);
        return "success";
    }


    //打印汽车成品件
    @RequestMapping("printCar")
    @ResponseBody
    public String printCar(String workorder, HttpServletRequest res, int qtysum, String boxszie, int boxsum, int boxno) {


        Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
        //print
        UUID uuid = UUID.randomUUID();
        String uuidSid = String.valueOf(uuid);
        labeltoprint.setJobid(uuidSid);

        Date date = new Date();
        // SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        labeltoprint.setUpdatetime(date);
        labeltoprint.setPrinttime(date);
        labeltoprint.setPrintqty(1);
        labeltoprint.setStatus("P");
        labeltoprint.setQtysum(qtysum);
        labeltoprint.setBoxszie(boxszie);
        labeltoprint.setBoxno(String.valueOf(boxno + "/" + boxsum));
        labeltoprint.setBoxsum(Long.valueOf(boxsum));
        labeltoprint.setPrinttemplate("Tp007.yncx");

        labeltoprint.setProductiondate(String.valueOf(date));


        //获取IP JOB
        String Ip = res.getRemoteAddr();

        Labeljob labeljob = new Labeljob();

        labeljob.setJobid(uuidSid);
        labeljob.setCreateddttm(date);
        labeljob.setUpdateddttm(date);
        labeljob.setTemplate("Tp007.yncx");
        labeljob.setJobtype("P");
        labeljob.setJobstatus(0);

        labeljob.setJobowner(Ip);
        labeljob.setUpdatedby(Ip);

        labelPrintService.pringLabel(labeljob, labeltoprint);
        return "success";
    }

    //View Car
    @RequestMapping("viewCar")
    @ResponseBody
    public String viewCar(String workorder, HttpServletRequest res, int qtysum, String boxszie, int boxsum, int boxno) {


        Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
        //print
        UUID uuid = UUID.randomUUID();
        String uuidSid = String.valueOf(uuid);
        labeltoprint.setJobid(uuidSid);

        Date date = new Date();
        // SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        labeltoprint.setUpdatetime(date);
        labeltoprint.setPrinttime(date);
        labeltoprint.setPrintqty(1);
        labeltoprint.setStatus("V");
        labeltoprint.setQtysum(qtysum);
        labeltoprint.setBoxszie(boxszie);
        labeltoprint.setBoxno(String.valueOf(boxno + "/" + boxsum));
        labeltoprint.setBoxsum(Long.valueOf(boxsum));
        labeltoprint.setPrinttemplate("Tp007.yncx");

        labeltoprint.setProductiondate(String.valueOf(date));


        //获取IP JOB
        String Ip = res.getRemoteAddr();

        Labeljob labeljob = new Labeljob();

        labeljob.setJobid(uuidSid);
        labeljob.setCreateddttm(date);
        labeljob.setUpdateddttm(date);
        labeljob.setTemplate("Tp007.yncx");
        labeljob.setJobtype("V");
        labeljob.setJobstatus(0);

        labeljob.setJobowner(Ip);
        labeljob.setUpdatedby(Ip);

        labelPrintService.pringLabel(labeljob, labeltoprint);
        return "success";
    }


    //打印汽车其他件
    @RequestMapping("printCar2")
    @ResponseBody
    public String printCar2(String workorder, HttpServletRequest res, int qtysum, String boxszie, int boxsum, int boxno) {


        Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
        //print
        UUID uuid = UUID.randomUUID();
        String uuidSid = String.valueOf(uuid);
        labeltoprint.setJobid(uuidSid);

        Date date = new Date();
        // SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        labeltoprint.setUpdatetime(date);
        labeltoprint.setPrinttime(date);
        labeltoprint.setPrintqty(1);
        labeltoprint.setStatus("P");
        labeltoprint.setQtysum(qtysum);
        labeltoprint.setBoxszie(boxszie);
        labeltoprint.setBoxno(String.valueOf(boxno + "/" + boxsum));
        labeltoprint.setBoxsum(Long.valueOf(boxsum));
        labeltoprint.setPrinttemplate("Tp006.yncx");

        labeltoprint.setProductiondate(String.valueOf(date));


        //获取IP JOB
        String Ip = res.getRemoteAddr();

        Labeljob labeljob = new Labeljob();

        labeljob.setJobid(uuidSid);
        labeljob.setCreateddttm(date);
        labeljob.setUpdateddttm(date);
        labeljob.setTemplate("Tp006.yncx");
        labeljob.setJobtype("P");
        labeljob.setJobstatus(0);

        labeljob.setJobowner(Ip);
        labeljob.setUpdatedby(Ip);

        labelPrintService.pringLabel(labeljob, labeltoprint);
        return "success";
    }


    @RequestMapping("viewCar2")
    @ResponseBody
    public String viewCar2(String workorder, HttpServletRequest res, int qtysum, String boxszie, int boxsum, int boxno) {


        Labeltoprint labeltoprint = labelPrintService.findTrwALL(workorder);
        //print
        UUID uuid = UUID.randomUUID();
        String uuidSid = String.valueOf(uuid);
        labeltoprint.setJobid(uuidSid);

        Date date = new Date();
        // SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        labeltoprint.setUpdatetime(date);
        labeltoprint.setPrinttime(date);
        labeltoprint.setPrintqty(1);
        labeltoprint.setStatus("V");
        labeltoprint.setQtysum(qtysum);
        labeltoprint.setBoxszie(boxszie);
        labeltoprint.setBoxno(String.valueOf(boxno + "/" + boxsum));
        labeltoprint.setBoxsum(Long.valueOf(boxsum));
        labeltoprint.setPrinttemplate("Tp006.yncx");

        labeltoprint.setProductiondate(String.valueOf(date));


        //获取IP JOB
        String Ip = res.getRemoteAddr();

        Labeljob labeljob = new Labeljob();

        labeljob.setJobid(uuidSid);
        labeljob.setCreateddttm(date);
        labeljob.setUpdateddttm(date);
        labeljob.setTemplate("Tp006.yncx");
        labeljob.setJobtype("V");
        labeljob.setJobstatus(0);

        labeljob.setJobowner(Ip);
        labeljob.setUpdatedby(Ip);

        labelPrintService.pringLabel(labeljob, labeltoprint);
        return "success";
    }


    @RequestMapping("config")
    public String config() {
        return "config";
    }


    @RequestMapping("searchPrintMachine")
    public void searchPrintMachine(HttpServletRequest res, String custIndustry) {

        String templateName = null;
        if (custIndustry == "TRW半成品标签") {
            templateName = "tp008.yncx";
        } else if (custIndustry == "汽车和工业件成品标签") {
            templateName = "tp007.yncx";
        } else if (custIndustry == "汽车和工业件其他标签") {
            templateName = "tp006.yncx";
        }

        String Ip = res.getRemoteAddr();
        String printname = printConfigService.findPrintMeachine(Ip, templateName);

        ModelAndView mv = new ModelAndView();
        mv.addObject("printname", printname);

        mv.setViewName("config");


    }


}






