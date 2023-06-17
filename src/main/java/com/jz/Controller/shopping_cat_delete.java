package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.pojo.shopping_cat;
import com.jz.service.serviceimpl.shopping_cat_deleteServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/shopping_cat_deletes")
public class shopping_cat_delete extends AllBase{
    public void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        ObjectMapper mapper = new ObjectMapper();
        int product_id=Integer.parseInt(req.getParameter("product_id"));
        //调用职工属性类
        shopping_cat shopping_cat=new shopping_cat();
        shopping_cat.setProduct_id(product_id);
        //接受判断函数返回值
        shopping_cat_deleteServiceimpl shopping_cat_deleteServiceimpl=new shopping_cat_deleteServiceimpl();

        int delete =shopping_cat_deleteServiceimpl.delete(shopping_cat);//返回给前端的数据
        try {
            mapper.writeValue(resp.getWriter(),delete);//直接将传入的对象序列化为json，并且返回给客户端，第一个参数是传入对象，第二个参数是返回值
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
