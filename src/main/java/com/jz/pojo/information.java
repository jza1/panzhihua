package com.jz.pojo;

public class information {
    int cusomer_id;
    int product_id;
    String information;

    public int getCusomer_id() {
        return cusomer_id;
    }

    public void setCusomer_id(int cusomer_id) {
        this.cusomer_id = cusomer_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public information(int cusomer_id, int product_id, String information) {
        this.cusomer_id = cusomer_id;
        this.product_id = product_id;
        this.information = information;
    }

    public information() {
    }
}
