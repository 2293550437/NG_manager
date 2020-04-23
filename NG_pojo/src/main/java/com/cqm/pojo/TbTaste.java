package com.cqm.pojo;

import java.io.Serializable;

public class TbTaste implements Serializable {
    private Long id;

    private String name;

    private String tasteDesc;

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

    public String getTasteDesc() {
        return tasteDesc;
    }

    public void setTasteDesc(String tasteDesc) {
        this.tasteDesc = tasteDesc == null ? null : tasteDesc.trim();
    }
}