package org.Mercury.entity.bo;

import org.Mercury.entity.Spu;

public class SpuBo extends Spu {

    private String cname;
    private String bname;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}
