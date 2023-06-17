package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.pojo.Product;
import com.jz.service.serviceimpl.product_deleteServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/product_deletes")
public class product_delete extends AllBase{
    public void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        ObjectMapper mapper = new ObjectMapper();
        String product_id = req.getParameter("product_id");
        //调用属性类
        Product product=new Product();
        product.setProduct_id(product_id);
        //接受判断函数返回值

        product_deleteServiceimpl product_deleteServiceimpl=new product_deleteServiceimpl();
        int delete =product_deleteServiceimpl.delete(product);//返回给前端的数据
        try {
            mapper.writeValue(resp.getWriter(),delete);//直接将传入的对象序列化为json，并且返回给客户端，第一个参数是传入对象，第二个参数是返回值
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
