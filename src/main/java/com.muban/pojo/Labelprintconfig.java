package com.muban.pojo;

import java.util.Date;

public class Labelprintconfig {
    private Long configid;

    private String ip;

    private String templatename;

    private String printername;

    private String createdby;

    private Date createddttm;

    private String updatedby;

    private Date updateddttm;

    private String printerip;

    private String status;

    public Long getConfigid() {
        return configid;
    }

    public void setConfigid(Long configid) {
        this.configid = configid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getTemplatename() {
        return templatename;
    }

    public void setTemplatename(String templatename) {
        this.templatename = templatename == null ? null : templatename.trim();
    }

    public String getPrintername() {
        return printername;
    }

    public void setPrintername(String printername) {
        this.printername = printername == null ? null : printername.trim();
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public Date getCreateddttm() {
        return createddttm;
    }

    public void setCreateddttm(Date createddttm) {
        this.createddttm = createddttm;
    }

    public String getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(String updatedby) {
        this.updatedby = updatedby == null ? null : updatedby.trim();
    }

    public Date getUpdateddttm() {
        return updateddttm;
    }

    public void setUpdateddttm(Date updateddttm) {
        this.updateddttm = updateddttm;
    }

    public String getPrinterip() {
        return printerip;
    }

    public void setPrinterip(String printerip) {
        this.printerip = printerip == null ? null : printerip.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}