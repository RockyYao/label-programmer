package com.muban.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Workorder {
    private String workorderid;

    private String machineid;

    private BigDecimal planqty;

    private String unit;

    private String partno;

    private String description;

    private String status;

    private Date updatedat;

    private String ordertype;

    private Date createdorderat;

    private Date sentorderat;

    private Date planstartat;

    private Date planendat;

    private String plnnr;

    public String getWorkorderid() {
        return workorderid;
    }

    public void setWorkorderid(String workorderid) {
        this.workorderid = workorderid == null ? null : workorderid.trim();
    }

    public String getMachineid() {
        return machineid;
    }

    public void setMachineid(String machineid) {
        this.machineid = machineid == null ? null : machineid.trim();
    }

    public BigDecimal getPlanqty() {
        return planqty;
    }

    public void setPlanqty(BigDecimal planqty) {
        this.planqty = planqty;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getPartno() {
        return partno;
    }

    public void setPartno(String partno) {
        this.partno = partno == null ? null : partno.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype == null ? null : ordertype.trim();
    }

    public Date getCreatedorderat() {
        return createdorderat;
    }

    public void setCreatedorderat(Date createdorderat) {
        this.createdorderat = createdorderat;
    }

    public Date getSentorderat() {
        return sentorderat;
    }

    public void setSentorderat(Date sentorderat) {
        this.sentorderat = sentorderat;
    }

    public Date getPlanstartat() {
        return planstartat;
    }

    public void setPlanstartat(Date planstartat) {
        this.planstartat = planstartat;
    }

    public Date getPlanendat() {
        return planendat;
    }

    public void setPlanendat(Date planendat) {
        this.planendat = planendat;
    }

    public String getPlnnr() {
        return plnnr;
    }

    public void setPlnnr(String plnnr) {
        this.plnnr = plnnr == null ? null : plnnr.trim();
    }
}