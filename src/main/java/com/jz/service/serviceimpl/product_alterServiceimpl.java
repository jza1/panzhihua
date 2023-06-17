package com.jz.service.serviceimpl;

import com.jz.dao.product_alter_dao;
import com.jz.dao.workers_alter_dao;
import com.jz.pojo.Product;
import com.jz.pojo.workers;
import com.jz.service.product_alterService;

public class product_alterServiceimpl implements product_alterService {
    @Override
    public int alter(Product product) {
        product_alter_dao product_alter_dao=new product_alter_dao();
        int temp=product_alter_dao.alter(product);
        return temp;
    }
}
