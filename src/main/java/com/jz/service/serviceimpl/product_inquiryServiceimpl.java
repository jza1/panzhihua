package com.jz.service.serviceimpl;

import com.jz.dao.material_inquiry_dao;
import com.jz.dao.product_inquiry_dao;
import com.jz.pojo.Product;
import com.jz.pojo.material;
import com.jz.service.product_inquiryService;

import java.util.List;

public class product_inquiryServiceimpl implements product_inquiryService {
    private com.jz.dao.product_inquiry_dao product_inquiry_dao = new product_inquiry_dao();
    @Override
    public List<Product> getAllproductInfo() {
        List<Product> product = product_inquiry_dao.inquiry();
        return product;
    }
}
