package com.jz.service.serviceimpl;

import com.jz.dao.information_inquiry_dao;
import com.jz.dao.material_inquiry_dao;
import com.jz.pojo.information;
import com.jz.pojo.material;
import com.jz.service.information_inquiryService;

import java.util.List;

public class information_inquiryServiceimpl implements information_inquiryService {
    private com.jz.dao.information_inquiry_dao information_inquiry_dao = new information_inquiry_dao();
    @Override
    public List<information> getAllinformationInfo() {
        List<information> information = information_inquiry_dao.inquiry();
        return information;
    }
}
