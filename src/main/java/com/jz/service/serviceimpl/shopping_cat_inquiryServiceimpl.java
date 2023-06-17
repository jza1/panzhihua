package com.jz.service.serviceimpl;

import com.jz.dao.shopping_cat_inquiry_dao;
import com.jz.pojo.shopping_cat;
import com.jz.service.shopping_cat_inquiryService;

import java.util.List;

public class shopping_cat_inquiryServiceimpl implements shopping_cat_inquiryService {
    private com.jz.dao.shopping_cat_inquiry_dao shopping_cat_inquiry_dao = new shopping_cat_inquiry_dao();
    @Override
    public List<shopping_cat> getAllshopping_catInfo() {
        List<shopping_cat> shopping_cat = shopping_cat_inquiry_dao.inquiry();
        return shopping_cat;
    }
}
