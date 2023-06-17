package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.pojo.Product;
import com.jz.pojo.material;
import com.jz.service.serviceimpl.material_deleteServiceimpl;
import com.jz.service.serviceimpl.product_deleteServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/material_deletes")
public class material_delete extends AllBase{
    public void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        ObjectMapper mapper = new ObjectMapper();
//        String materialid = req.getParameter("materialid");
        int materialid=Integer.parseInt(req.getParameter("materialid"));
        //调用属性类
        material material=new material();
        material.setMaterialid(materialid);
        //接受判断函数返回值

        material_deleteServiceimpl material_deleteServiceimpl=new material_deleteServiceimpl();
        int delete =material_deleteServiceimpl.delete(material);//返回给前端的数据
        try {
            mapper.writeValue(resp.getWriter(),delete);//直接将传入的对象序列化为json，并且返回给客户端，第一个参数是传入对象，第二个参数是返回值
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
