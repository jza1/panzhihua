package com.jz.service.serviceimpl;

import com.jz.dao.material_inquiry_dao;
import com.jz.pojo.material;
import com.jz.service.material_inquiryService;

import java.util.List;

public class material_inquiryServiceimpl implements material_inquiryService {
    private com.jz.dao.material_inquiry_dao material_inquiry_dao = new material_inquiry_dao();
    @Override
    public List<material> getAllmaterialInfo() {
        List<material> material = material_inquiry_dao.inquiry();
        return material;
    }
}

