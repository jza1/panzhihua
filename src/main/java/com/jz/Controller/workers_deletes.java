package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.pojo.workers;
import com.jz.service.serviceimpl.workers_deleteServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/workers_deletes")
public class workers_deletes extends AllBase{
    public void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        ObjectMapper mapper = new ObjectMapper();
        String workersId = req.getParameter("workersId");
        //调用职工属性类
        workers workers=new workers();
        workers.setWorkersId(workersId);
        //接受判断函数返回值
        workers_deleteServiceimpl workers_deleteServiceimpl=new workers_deleteServiceimpl();

        int delete =workers_deleteServiceimpl.delete(workers);//返回给前端的数据
        try {
            mapper.writeValue(resp.getWriter(),delete);//直接将传入的对象序列化为json，并且返回给客户端，第一个参数是传入对象，第二个参数是返回值
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
