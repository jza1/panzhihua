package com.jz.service.serviceimpl;

import com.jz.dao.workers_add_dao;
import com.jz.pojo.workers;
import com.jz.service.workers_addService;

public class workers_addServiceimpl implements workers_addService {
    @Override
    public int add(workers workers) {
        workers_add_dao workers_add_dao=new workers_add_dao();
        int temp=workers_add_dao.add(workers);
        return temp;
    }
}
