package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.pojo.material;
import com.jz.service.serviceimpl.material_addServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/material_adds")
public class material_add extends AllBase{
    public void add(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        ObjectMapper mapper = new ObjectMapper();
        int materialid=Integer.parseInt(req.getParameter("materialid"));
        String materialname=req.getParameter("materialname");
        int materialprice=Integer.parseInt(req.getParameter("materialprice"));
        int materialnum=Integer.parseInt(req.getParameter("materialnum"));
        //调用属性类
        material material=new material();
        material.setMaterialid(materialid);
        material.setMaterialname(materialname);
        material.setMaterialnum(materialnum);
        material.setMaterialprice(materialprice);
        //接受判断函数返回值

        material_addServiceimpl material_addServiceimpl=new material_addServiceimpl();

        int add =material_addServiceimpl.add(material);//返回给前端的数据
        try {
            mapper.writeValue(resp.getWriter(),add);//直接将传入的对象序列化为json，并且返回给客户端，第一个参数是传入对象，第二个参数是返回值
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
