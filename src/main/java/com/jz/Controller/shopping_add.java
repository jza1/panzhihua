package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.pojo.shopping;
import com.jz.service.serviceimpl.shopping_addServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/shopping_adds")
public class shopping_add extends AllBase{
    public void add(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        ObjectMapper mapper = new ObjectMapper();
        int product_id=Integer.parseInt(req.getParameter("product_id"));
        String product_name=req.getParameter("product_name");
//        int product_price=Integer.parseInt(req.getParameter("product_price"));
        int num=Integer.parseInt(req.getParameter("num"));
        //调用属性类
        shopping shopping=new shopping();
        shopping.setProduct_id(product_id);
        shopping.setNum(num);
        shopping.setProduct_name(product_name);
//        shopping.setProduct_price(product_price);
        //接受判断函数返回值

        shopping_addServiceimpl shopping_addServiceimpl=new shopping_addServiceimpl();

        int add =shopping_addServiceimpl.add(shopping);//返回给前端的数据
        try {
            mapper.writeValue(resp.getWriter(),add);//直接将传入的对象序列化为json，并且返回给客户端，第一个参数是传入对象，第二个参数是返回值
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
