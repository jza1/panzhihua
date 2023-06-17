package com.jz.service.serviceimpl;

import com.jz.dao.information_add_dao;
import com.jz.pojo.information;
import com.jz.service.information_addService;

public class information_addServiceimpl implements information_addService {
    @Override
    public int add(information information) {
        information_add_dao information_add_dao=new information_add_dao();
        int temp=information_add_dao.add(information);
        return temp;
    }
}
