package com.jz.pojo;

public class customer {
    int customerId;//编号
    String customerName;//账号
    String customerN;//昵称
    String customerPassword;//密码
    String typ;

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerN() {
        return customerN;
    }

    public void setCustomerN(String customerN) {
        this.customerN = customerN;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public customer(int customerId, String customerName, String customerN, String customerPassword,String typ) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerN = customerN;
        this.customerPassword = customerPassword;
        this.typ=typ;
    }

    public customer() {
    }

}
