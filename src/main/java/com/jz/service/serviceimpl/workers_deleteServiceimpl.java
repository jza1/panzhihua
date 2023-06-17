package com.jz.service.serviceimpl;


import com.jz.dao.workers_delete_dao;
import com.jz.pojo.workers;

import com.jz.service.workers_deleteService;

public class workers_deleteServiceimpl implements workers_deleteService {
    @Override
    public int delete(workers workers) {
        workers_delete_dao workers_delete_dao=new workers_delete_dao();
        int temp=workers_delete_dao.delete(workers);
        return temp;
    }
}
