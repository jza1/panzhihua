package com.jz.service.serviceimpl;

import com.jz.dao.shopping_alter_dao;
import com.jz.dao.workers_alter_dao;
import com.jz.pojo.shopping;
import com.jz.pojo.workers;
import com.jz.service.shopping_alterService;

public class shopping_alterServiceimpl implements shopping_alterService {
    @Override
    public int alter(shopping shopping) {
        shopping_alter_dao shopping_alter_dao=new shopping_alter_dao();
        int temp=shopping_alter_dao.alter(shopping);
        return temp;
    }
}
