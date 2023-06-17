package com.jz.service.serviceimpl;

import com.jz.dao.LoginUser;
import com.jz.service.loginService;

public class loginServiceimpl implements loginService {
    @Override
//    public boolean findall(String username, String password) {
//        LoginUser loginUser=new LoginUser();
//        boolean temp=loginUser.findall(username,password);
//        return temp;
//    }
    public int findall(String username, String password,String typ) {
        LoginUser loginUser=new LoginUser();
        int temp=loginUser.findall(username,password,typ);
        return temp;
    }

    public int findall1(String workersName,String workersPassword,String typ){
        LoginUser loginUser=new LoginUser();
        int temp=loginUser.findall1(workersName,workersPassword,typ);
        return temp;
    }

    public int findall2(String customerName,String customerPassword,String typ){
        LoginUser loginUser=new LoginUser();
        int temp=loginUser.findall2(customerName,customerPassword,typ);
        return temp;
    }

}
