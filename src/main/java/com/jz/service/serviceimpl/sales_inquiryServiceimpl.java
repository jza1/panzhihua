package com.jz.service.serviceimpl;

import com.jz.dao.sales_inquiry_dao;
import com.jz.pojo.Product;
import com.jz.service.sales_inquiryService;

import java.util.List;

public class sales_inquiryServiceimpl implements sales_inquiryService {
    private sales_inquiry_dao sales_inquiry_dao = new sales_inquiry_dao();
    @Override
    public List<Product> getAllproductInfo() {
        List<Product> Product = sales_inquiry_dao.inquiry();
        return Product;
    }
}
