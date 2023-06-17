package com.jz.pojo;

public class material {
    int materialid;//编号
    String materialname;
    int materialnum;
    int materialprice;

    public int getMaterialid() {
        return materialid;
    }

    public void setMaterialid(int materialid) {
        this.materialid = materialid;
    }

    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname;
    }

    public int getMaterialnum() {
        return materialnum;
    }

    public void setMaterialnum(int materialnum) {
        this.materialnum = materialnum;
    }

    public int getMaterialprice() {
        return materialprice;
    }

    public void setMaterialprice(int materialprice) {
        this.materialprice = materialprice;
    }

    public material(int materialid, String materialname, int materialnum, int materialprice) {
        this.materialid = materialid;
        this.materialname = materialname;
        this.materialnum = materialnum;
        this.materialprice = materialprice;
    }

    public material() {
    }
}
