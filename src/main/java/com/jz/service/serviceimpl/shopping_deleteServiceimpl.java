package com.jz.service.serviceimpl;

import com.jz.dao.shopping_delete_dao;
import com.jz.dao.workers_delete_dao;
import com.jz.pojo.shopping;
import com.jz.pojo.workers;
import com.jz.service.shopping_deleteService;

public class shopping_deleteServiceimpl implements shopping_deleteService {
    @Override
    public int delete(shopping shopping) {
        shopping_delete_dao shopping_delete_dao=new shopping_delete_dao();
        int temp=shopping_delete_dao.delete(shopping);
        return temp;
    }
}
