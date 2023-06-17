package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.pojo.workers;
import com.jz.service.serviceimpl.workers_inquiryServiceimpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/workers_inquiry")
public class workers_inquiry extends AllBase{
    public void inquiry(HttpServletRequest res, HttpServletResponse resp) throws IOException {
        workers_inquiryServiceimpl workers_inquiryServiceimpl=new workers_inquiryServiceimpl();
        ObjectMapper mapper = new ObjectMapper();
        /*list集合中存放的是好多workers对象*/
        List<workers> workers =workers_inquiryServiceimpl.getAllWorkersInfo();
        /*将list集合装换成json对象*/
        mapper.writeValue(resp.getWriter(),workers);
    }
}
