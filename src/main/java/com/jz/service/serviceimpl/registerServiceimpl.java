package com.jz.service.serviceimpl;

import com.jz.dao.registerUser;
import com.jz.pojo.User;
import com.jz.pojo.customer;
import com.jz.service.registerService;

public class registerServiceimpl implements registerService {

    @Override
    public int add(customer customer) {
        registerUser registerUser=new registerUser();
        int temp=registerUser.add(customer);
        return temp;
    }
}
