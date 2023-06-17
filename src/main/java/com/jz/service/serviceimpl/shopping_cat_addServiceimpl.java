package com.jz.service.serviceimpl;


import com.jz.dao.shopping_cat_add_dao;
import com.jz.pojo.shopping;
import com.jz.pojo.shopping_cat;
import com.jz.service.shopping_cat_addService;

public class shopping_cat_addServiceimpl implements shopping_cat_addService {
    @Override
    public int add(shopping_cat shopping_cat) {
        shopping_cat_add_dao shopping_cat_add_dao=new shopping_cat_add_dao();
        int temp=shopping_cat_add_dao.add(shopping_cat);
        return temp;
    }
}
