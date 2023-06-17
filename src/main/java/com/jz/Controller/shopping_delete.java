package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.pojo.shopping;
import com.jz.service.serviceimpl.shopping_deleteServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/shopping_deletes")
public class shopping_delete extends AllBase{
    public void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        ObjectMapper mapper = new ObjectMapper();
//        String shopping_id = req.getParameter("shopping_id");
        int product_id=Integer.parseInt(req.getParameter("product_id"));
        //调用职工属性类
        shopping shopping=new shopping();
        shopping.setProduct_id(product_id);
        //接受判断函数返回值
        shopping_deleteServiceimpl shopping_deleteServiceimpl=new shopping_deleteServiceimpl();

        int delete =shopping_deleteServiceimpl.delete(shopping);//返回给前端的数据
        try {
            mapper.writeValue(resp.getWriter(),delete);//直接将传入的对象序列化为json，并且返回给客户端，第一个参数是传入对象，第二个参数是返回值
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
