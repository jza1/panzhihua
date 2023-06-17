package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.jz.pojo.User;
import com.jz.pojo.customer;
import com.jz.service.serviceimpl.registerServiceimpl;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registers")
public class registers extends AllBase {
//    User user=new User();
         public void add(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
             ObjectMapper mapper = new ObjectMapper();
             String customerName = req.getParameter("customerName");
             String customerPassword = req.getParameter("customerPassword");
             String customerN = req.getParameter("customerN");
             String typ=req.getParameter("typ");
             //调用属性类
//             User user = new User(username,password,name);

             customer customer=new customer();
             customer.setCustomerN(customerN);
             customer.setCustomerName(customerName);
             customer.setCustomerPassword(customerPassword);
             customer.setTyp(typ);
             //接受判断函数返回值
             registerServiceimpl registerServiceimpl=new registerServiceimpl();
             int add =registerServiceimpl.add(customer);//返回给前端的数据
             try {
                 mapper.writeValue(resp.getWriter(),add);//直接将传入的对象序列化为json，并且返回给客户端，第一个参数是传入对象，第二个参数是返回值
             } catch (IOException e) {
                 e.printStackTrace();
             }

     }
}

