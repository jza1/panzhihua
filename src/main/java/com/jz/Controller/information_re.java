package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.pojo.information;
import com.jz.service.serviceimpl.information_addServiceimpl;
import com.jz.service.serviceimpl.product_addServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/information")
public class information_re extends AllBase{
    public void add(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        ObjectMapper mapper = new ObjectMapper();
        String information1=req.getParameter("information");
        int cusomer_id=Integer.parseInt(req.getParameter("cusomer_id"));

        //调用属性类
        information information=new information();
        information.setInformation(information1);
        information.setCusomer_id(cusomer_id);
        //接受判断函数返回值
        information_addServiceimpl information_addServiceimpl=new information_addServiceimpl();

        int add =information_addServiceimpl.add(information);//返回给前端的数据
        try {
            mapper.writeValue(resp.getWriter(),add);//直接将传入的对象序列化为json，并且返回给客户端，第一个参数是传入对象，第二个参数是返回值
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
