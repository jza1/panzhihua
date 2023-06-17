package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.pojo.shopping;
import com.jz.pojo.shopping_cat;
import com.jz.service.serviceimpl.shopping_cat_inquiryServiceimpl;
import com.jz.service.serviceimpl.shopping_inquiryServiceimpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/shopping_cat_inquiry")
public class shopping_cat_inquiry extends AllBase{
    public void inquiry(HttpServletRequest res, HttpServletResponse resp) throws IOException {
        shopping_cat_inquiryServiceimpl shopping_cat_inquiryServiceimpl=new shopping_cat_inquiryServiceimpl();
        ObjectMapper mapper = new ObjectMapper();
        /*list集合中存放的是好多workers对象*/
        List<shopping_cat> shopping_cat =shopping_cat_inquiryServiceimpl.getAllshopping_catInfo();
        /*将list集合装换成json对象*/
        mapper.writeValue(resp.getWriter(),shopping_cat);
    }
}
