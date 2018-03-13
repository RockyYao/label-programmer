package com.muban.pojo;

import java.util.Date;

public class Labeljob {
    private String jobid;

    private String jobowner;

    private String jobtype;

    private Integer jobstatus;

    private String createdby;

    private Date createddttm;

    private String updatedby;

    private Date updateddttm;

    private String template;

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid == null ? null : jobid.trim();
    }

    public String getJobowner() {
        return jobowner;
    }

    public void setJobowner(String jobowner) {
        this.jobowner = jobowner == null ? null : jobowner.trim();
    }

    public String getJobtype() {
        return jobtype;
    }

    public void setJobtype(String jobtype) {
        this.jobtype = jobtype == null ? null : jobtype.trim();
    }

    public Integer getJobstatus() {
        return jobstatus;
    }

    public void setJobstatus(Integer jobstatus) {
        this.jobstatus = jobstatus;
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

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template == null ? null : template.trim();
    }
}