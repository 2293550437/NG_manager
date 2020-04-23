package com.cqm.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbArea implements Serializable {
    private Long id;

    private String name;

    private String description;

    private Date createtime;

    private String dishno;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDishno() {
        return dishno;
    }

    public void setDishno(String dishno) {
        this.dishno = dishno == null ? null : dishno.trim();
    }
}