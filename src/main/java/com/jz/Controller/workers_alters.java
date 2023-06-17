package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.pojo.workers;
import com.jz.service.serviceimpl.workers_addServiceimpl;
import com.jz.service.serviceimpl.workers_alterServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/workers_alters")
public class workers_alters extends AllBase{
    public void alter(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        ObjectMapper mapper = new ObjectMapper();
        String workersId = req.getParameter("workersId");
        String workersN = req.getParameter("workersN");
        String workersSal = req.getParameter("workersSal");
        String workersTelephone = req.getParameter("workersTelephone");
        String workersName=req.getParameter("workersName");
        String workersPassword=req.getParameter("workersPassword");
        //调用职工属性类
        workers workers=new workers();
        workers.setWorkersId(workersId);
        workers.setWorkersName(workersName);
        workers.setWorkersSal(workersSal);
        workers.setWorkersTelephone(workersTelephone);
        workers.setWorkersPassword(workersPassword);
        workers.setWorkersN(workersN);

        //接受判断函数返回值
        workers_alterServiceimpl workers_alterServiceimpl=new workers_alterServiceimpl();

        int alter=workers_alterServiceimpl.alter(workers);//返回给前端的数据
        try {
            mapper.writeValue(resp.getWriter(),alter);//直接将传入的对象序列化为json，并且返回给客户端，第一个参数是传入对象，第二个参数是返回值
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
