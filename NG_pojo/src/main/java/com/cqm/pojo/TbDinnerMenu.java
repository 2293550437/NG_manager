package com.cqm.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbDinnerMenu implements Serializable {
    private Long id;

    private String custtype;

    private Long memberid;

    private Long custcount;

    private String addstatus;

    private Date createtime;

    private Date endtime;

    private Long employid;

    private String foodslist;

    private String ispackage;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCusttype() {
        return custtype;
    }

    public void setCusttype(String custtype) {
        this.custtype = custtype == null ? null : custtype.trim();
    }

    public Long getMemberid() {
        return memberid;
    }

    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    public Long getCustcount() {
        return custcount;
    }

    public void setCustcount(Long custcount) {
        this.custcount = custcount;
    }

    public String getAddstatus() {
        return addstatus;
    }

    public void setAddstatus(String addstatus) {
        this.addstatus = addstatus == null ? null : addstatus.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Long getEmployid() {
        return employid;
    }

    public void setEmployid(Long employid) {
        this.employid = employid;
    }

    public String getFoodslist() {
        return foodslist;
    }

    public void setFoodslist(String foodslist) {
        this.foodslist = foodslist == null ? null : foodslist.trim();
    }

    public String getIspackage() {
        return ispackage;
    }

    public void setIspackage(String ispackage) {
        this.ispackage = ispackage == null ? null : ispackage.trim();
    }
}