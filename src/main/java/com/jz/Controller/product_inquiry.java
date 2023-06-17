package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.pojo.Product;
import com.jz.pojo.material;
import com.jz.service.serviceimpl.material_inquiryServiceimpl;
import com.jz.service.serviceimpl.product_inquiryServiceimpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/product_inquiry")
public class product_inquiry extends AllBase {
    public void inquiry(HttpServletRequest res, HttpServletResponse resp) throws IOException {
        product_inquiryServiceimpl product_inquiryServiceimpl=new product_inquiryServiceimpl();
        ObjectMapper mapper = new ObjectMapper();
        /*list集合中存放的是好多workers对象*/
        List<Product> product =product_inquiryServiceimpl.getAllproductInfo();
        /*将list集合装换成json对象*/
        mapper.writeValue(resp.getWriter(),product);
    }
}
