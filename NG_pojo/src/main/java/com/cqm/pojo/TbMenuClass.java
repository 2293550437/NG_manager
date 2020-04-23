package com.cqm.pojo;

import java.io.Serializable;

public class TbMenuClass implements Serializable {
    private Long meclassId;

    private String name;

    private String greensBrand;

    private String greensTaste;

    private static final long serialVersionUID = 1L;

    public Long getMeclassId() {
        return meclassId;
    }

    public void setMeclassId(Long meclassId) {
        this.meclassId = meclassId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGreensBrand() {
        return greensBrand;
    }

    public void setGreensBrand(String greensBrand) {
        this.greensBrand = greensBrand == null ? null : greensBrand.trim();
    }

    public String getGreensTaste() {
        return greensTaste;
    }

    public void setGreensTaste(String greensTaste) {
        this.greensTaste = greensTaste == null ? null : greensTaste.trim();
    }
}