package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.pojo.Product;
import com.jz.service.serviceimpl.sales_inquiryServiceimpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/sales_inquiry")
public class sales_inquiry extends AllBase{
    public void inquiry(HttpServletRequest res, HttpServletResponse resp) throws IOException {

        sales_inquiryServiceimpl sales_inquiryServiceimpl=new sales_inquiryServiceimpl();
        ObjectMapper mapper = new ObjectMapper();
        /*list集合中存放的是好多workers对象*/
        List<Product> Product =sales_inquiryServiceimpl.getAllproductInfo();
        /*将list集合装换成json对象*/
        mapper.writeValue(resp.getWriter(),Product);
    }
}
