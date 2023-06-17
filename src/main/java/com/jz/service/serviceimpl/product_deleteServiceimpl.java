package com.jz.service.serviceimpl;

import com.jz.dao.product_delete_dao;

import com.jz.pojo.Product;
import com.jz.service.product_deleteService;

public class product_deleteServiceimpl implements product_deleteService{
    @Override
    public int delete(Product product) {
        product_delete_dao product_delete_dao=new product_delete_dao();
        int temp=product_delete_dao.delete(product);
        return temp;
    }
}

