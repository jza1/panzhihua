package com.jz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.dao.LoginUser;
import com.jz.service.serviceimpl.loginServiceimpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;


@WebServlet("/logins")//servlet
public class logins extends AllBase{
    public void test (HttpServletRequest req, HttpServletResponse rps) throws UnsupportedEncodingException {
        loginServiceimpl loginServiceimpl = new loginServiceimpl();
        ObjectMapper mapper = new ObjectMapper();//把后端数据传给前端
        String username = req.getParameter("username");
        LoginUser loginUser = new LoginUser();
        String password= req.getParameter("password");;
        String typ=req.getParameter("typ");


        if(typ.equals("user")){
            int findall = loginServiceimpl.findall(username, password,typ);
            try {
                mapper.writeValue(rps.getWriter(),findall);//直接将传入的对象序列化为json，并且返回给客户端，第一个参数是传入对象，第二个参数是返回值
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(typ.equals("workers")){
            int findall1= loginServiceimpl.findall1(username, password,typ);
            try {
                mapper.writeValue(rps.getWriter(),findall1);//直接将传入的对象序列化为json，并且返回给客户端，第一个参数是传入对象，第二个参数是返回值
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(typ.equals("customer")){
            int findall2= loginServiceimpl.findall2(username, password,typ);
            try {
                mapper.writeValue(rps.getWriter(),findall2);//直接将传入的对象序列化为json，并且返回给客户端，第一个参数是传入对象，第二个参数是返回值
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        boolean findall = loginServiceimpl.findall(username, password);

//        try {
//            mapper.writeValue(rps.getWriter(),findall);//直接将传入的对象序列化为json，并且返回给客户端，第一个参数是传入对象，第二个参数是返回值
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

}
