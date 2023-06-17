package com.jz.service.serviceimpl;

import com.jz.dao.product_inquiry_dao;
import com.jz.pojo.Product;
import com.jz.service.product_inquiry1Service;

import java.util.List;


public class product_inquiry1Serviceimpl implements product_inquiry1Service {
    private com.jz.dao.product_inquiry_dao product_inquiry_dao = new product_inquiry_dao();
    @Override
    public List<Product> getproductInfo(String product_id) {
        List<Product> product = null;//查询模糊查询商品
        product= (List<Product>) product_inquiry_dao.inquiry1(product_id);
        return product;
    }

}
