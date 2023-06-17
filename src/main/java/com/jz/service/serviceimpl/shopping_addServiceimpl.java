package com.jz.service.serviceimpl;

import com.jz.dao.shopping_add_dao;
import com.jz.dao.workers_add_dao;
import com.jz.pojo.shopping;

import com.jz.service.shopping_addService;

public class shopping_addServiceimpl implements shopping_addService {
    @Override
    public int add(shopping shopping) {
        shopping_add_dao shopping_add_dao=new shopping_add_dao();
        int temp=shopping_add_dao.add(shopping);
        return temp;
    }
}
