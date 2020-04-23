package com.cqm.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbReserveTable implements Serializable {
    private Long reserveId;

    private Long areaid;

    private Long tableid;

    private Long mumberid;

    private String number;

    private Date starttime;

    private Date dinnertime;

    private static final long serialVersionUID = 1L;

    public Long getReserveId() {
        return reserveId;
    }

    public void setReserveId(Long reserveId) {
        this.reserveId = reserveId;
    }

    public Long getAreaid() {
        return areaid;
    }

    public void setAreaid(Long areaid) {
        this.areaid = areaid;
    }

    public Long getTableid() {
        return tableid;
    }

    public void setTableid(Long tableid) {
        this.tableid = tableid;
    }

    public Long getMumberid() {
        return mumberid;
    }

    public void setMumberid(Long mumberid) {
        this.mumberid = mumberid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getDinnertime() {
        return dinnertime;
    }

    public void setDinnertime(Date dinnertime) {
        this.dinnertime = dinnertime;
    }
}