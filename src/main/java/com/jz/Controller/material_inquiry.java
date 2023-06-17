package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.pojo.material;
import com.jz.service.serviceimpl.material_inquiryServiceimpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/material_inquiry")
public class material_inquiry extends AllBase {
    public void inquiry(HttpServletRequest res, HttpServletResponse resp) throws IOException {
        material_inquiryServiceimpl material_inquiryServiceimpl=new material_inquiryServiceimpl();
        ObjectMapper mapper = new ObjectMapper();
        /*list集合中存放的是好多workers对象*/
        List<material> material =material_inquiryServiceimpl.getAllmaterialInfo();
        /*将list集合装换成json对象*/
        mapper.writeValue(resp.getWriter(),material);
    }
}
