package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.pojo.Product;
import com.jz.service.serviceimpl.product_alterServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/product_alters")
public class product_alter extends AllBase {
    public void alter(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        ObjectMapper mapper = new ObjectMapper();
        String product_id = req.getParameter("product_id");
        String product_name = req.getParameter("product_name");
        int product_price=Integer.parseInt(req.getParameter("product_price"));
        String product_describe = req.getParameter("product_describe");
//        int product_num=Integer.parseInt(req.getParameter("product_num"));
        String product_address=req.getParameter("product_address");
//        int product_num1=Integer.parseInt(req.getParameter("product_num1"));
        //调用职工属性类
        Product product=new Product();
//        product.setProduct_num1(product_num1);
//        product.setProduct_num(product_num);
        product.setProduct_price(product_price);
        product.setProduct_describe(product_describe);
        product.setProduct_address(product_address);
        product.setProduct_name(product_name);
        product.setProduct_id(product_id);
        //接受判断函数返回值
        product_alterServiceimpl product_alterServiceimpl=new product_alterServiceimpl();

        int alter=product_alterServiceimpl.alter(product);//返回给前端的数据
        try {
            mapper.writeValue(resp.getWriter(),alter);//直接将传入的对象序列化为json，并且返回给客户端，第一个参数是传入对象，第二个参数是返回值
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
