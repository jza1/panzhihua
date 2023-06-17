package com.jz.pojo;

//珠宝实体类
public class Product {
    private String product_id;//产品id
    private String product_name;//产品名
    private int product_price;//产品价格
    private String product_describe;//产品描述
    private int product_num;//产品数量
    private String product_address;//产品地址
    private int product_num1;//产品出售数量
    private String imgpath;//产品出售数量

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public String getProduct_describe() {
        return product_describe;
    }

    public void setProduct_describe(String product_describe) {
        this.product_describe = product_describe;
    }

    public int getProduct_num() {
        return product_num;
    }

    public void setProduct_num(int product_num) {
        this.product_num = product_num;
    }

    public String getProduct_address() {
        return product_address;
    }

    public void setProduct_address(String product_address) {
        this.product_address = product_address;
    }

    public int getProduct_num1() {
        return product_num1;
    }

    public void setProduct_num1(int product_num1) {
        this.product_num1 = product_num1;
    }

    public Product(String product_id, String product_name, int product_price, String product_describe, int product_num, String product_address, int product_num1,String imgpath) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_describe = product_describe;
        this.product_num = product_num;
        this.product_address = product_address;
        this.product_num1 = product_num1;
        this.imgpath=imgpath;
    }

    public Product() {
    }
}
