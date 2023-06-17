package com.jz.service.serviceimpl;

import com.jz.dao.product_inquiry_dao;
import com.jz.dao.workers_inquiry_dao;
import com.jz.pojo.Product;
import com.jz.pojo.workers;
import com.jz.service.workers_inquiry1Service;

import java.util.List;

public class workers_inquiry1Serviceimpl implements workers_inquiry1Service {
    private com.jz.dao.workers_inquiry_dao workers_inquiry_dao = new workers_inquiry_dao();
    @Override
    public List<workers> inquiry1(String workersName,String workersPassword) {
        List<workers> workers = null;//查询模糊查询商品
        workers= (List<workers>) workers_inquiry_dao.inquiry1(workersName,workersPassword);
        return workers;
    }
}
