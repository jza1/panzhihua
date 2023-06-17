package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.pojo.Product;
import com.jz.pojo.workers;
import com.jz.service.serviceimpl.product_inquiry1Serviceimpl;
import com.jz.service.serviceimpl.workers_inquiry1Serviceimpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/workers_inquiry1")
public class workers_inquiry1 extends AllBase{
    public void inquiry1(HttpServletRequest res, HttpServletResponse resp) throws IOException {
        workers_inquiry1Serviceimpl workers_inquiry1Serviceimpl=new workers_inquiry1Serviceimpl();
        ObjectMapper mapper = new ObjectMapper();
        String workersName=res.getParameter("workersName");
        String workersPassword=res.getParameter("workersPassword");
        workers workers=new workers();
        workers.setWorkersName(workersName);
        workers.setWorkersPassword(workersPassword);
        List<workers> inquiry1 =workers_inquiry1Serviceimpl.inquiry1(workersName,workersPassword);
        try {
            mapper.writeValue(resp.getWriter(),inquiry1);//直接将传入的对象序列化为json，并且返回给客户端，第一个参数是传入对象，第二个参数是返回值
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
