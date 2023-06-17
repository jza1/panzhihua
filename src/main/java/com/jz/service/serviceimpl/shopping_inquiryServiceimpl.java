package com.jz.service.serviceimpl;

import com.jz.dao.material_inquiry_dao;
import com.jz.dao.shopping_inquiry_dao;
import com.jz.pojo.material;
import com.jz.pojo.shopping;
import com.jz.service.shopping_inquiryService;

import java.util.List;

public class shopping_inquiryServiceimpl implements shopping_inquiryService {
    private com.jz.dao.shopping_inquiry_dao shopping_inquiry_dao = new shopping_inquiry_dao();
    @Override
    public List<shopping> getAllshoppingInfo() {
        List<shopping> shopping = shopping_inquiry_dao.inquiry();
        return shopping;
    }
}
