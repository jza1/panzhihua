package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.pojo.Product;
import com.jz.service.serviceimpl.product_inquiry1Serviceimpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/product_inquiry1")
public class product_inquiry1 extends AllBase{
    public void inquiry1(HttpServletRequest res, HttpServletResponse resp) throws IOException {
        product_inquiry1Serviceimpl product_inquiry1Serviceimpl=new product_inquiry1Serviceimpl();
        ObjectMapper mapper = new ObjectMapper();
        String product_id=res.getParameter("product_id1");
        Product product=new Product();
        product.setProduct_id(product_id);
        List<Product> inquiry1 =product_inquiry1Serviceimpl.getproductInfo(product_id);
        try {
            mapper.writeValue(resp.getWriter(),inquiry1);//直接将传入的对象序列化为json，并且返回给客户端，第一个参数是传入对象，第二个参数是返回值
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
