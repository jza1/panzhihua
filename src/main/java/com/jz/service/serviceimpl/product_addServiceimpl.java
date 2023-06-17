package com.jz.service.serviceimpl;


import com.jz.dao.product_add_dao;
import com.jz.pojo.Product;
import com.jz.service.product_addService;


public class product_addServiceimpl implements product_addService {
    @Override
    public int add(Product product) {
        product_add_dao product_add_dao=new product_add_dao();
        int temp=product_add_dao.add(product);
        return temp;
    }
}
