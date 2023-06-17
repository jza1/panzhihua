package com.jz.service.serviceimpl;


import com.jz.dao.workers_alter_dao;
import com.jz.pojo.workers;
import com.jz.service.workers_alterService;

public class workers_alterServiceimpl implements workers_alterService {
    @Override
    public int alter(workers workers) {
        workers_alter_dao workers_alter_dao=new workers_alter_dao();
        int temp=workers_alter_dao.alter(workers);
        return temp;
    }
}
