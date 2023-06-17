package com.jz.service.serviceimpl;

import com.jz.dao.workers_inquiry_dao;
import com.jz.pojo.workers;
import com.jz.service.workers_inquiryService;

import java.util.List;

public class workers_inquiryServiceimpl implements workers_inquiryService {
    private workers_inquiry_dao workers_inquiry_dao = new workers_inquiry_dao();
    @Override
    public List<workers> getAllWorkersInfo(){
        List<workers> workers=workers_inquiry_dao.inquiry();
        return workers;
    }
}
