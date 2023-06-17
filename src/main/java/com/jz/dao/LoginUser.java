package com.jz.dao;

import com.jz.pojo.customer;
import com.jz.pojo.workers;
import com.jz.util.Database_connection;
import com.jz.pojo.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;


import java.sql.SQLException;

public class LoginUser {
    QueryRunner qr = new QueryRunner(Database_connection.getDatasource());
//    public boolean findall(String username,String password) {
//        User user=null;
//        String sql= "select * from user where username=?";//查询user表中username
//        try {
//            user = qr.query(sql, new BeanHandler<User>(User.class), username);//执行SQL语句
//        } catch (SQLException sqlException) {
//            sqlException.printStackTrace();
//        }
//
//        if (user!=null){
//            if (user.getPassword().equals(password)&&user.getUsername().equals(username)){
//                return true;
//            }else {
//                return false;
//            }
//        }else{
//            return false;
//        }
//    }
    public int findall(String username,String password,String typ) {
        User user=null;
        String sql= "select * from user where username=?";//查询user表中username
        try {
            user = qr.query(sql, new BeanHandler<User>(User.class), username);//执行SQL语句
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        if (user!=null){
            if (user.getPassword().equals(password)&&user.getUsername().equals(username)&&user.getTyp().equals(typ)){
                return 1;
            }else {
                return 0;
            }
        }else{
            return 0;
        }
    }
    public int findall1(String workersName,String workersPassword,String typ) {
        workers workers = null;
        String sql = "select * from workers where workersName=?";
        try {
            workers = qr.query(sql, new BeanHandler<workers>(workers.class), workersName);//执行SQL语句
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        if (workers != null) {
            if (workers.getWorkersPassword().equals(workersPassword) && workers.getWorkersName().equals(workersName) && workers.getTyp().equals(typ)) {
                return 2;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public int findall2(String customerName,String customerPassword,String typ) {
        customer customer = null;
        String sql = "select * from customer where customerName=?";
        try {
            customer = qr.query(sql, new BeanHandler<customer>(customer.class), customerName);//执行SQL语句
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        if (customer != null) {
            if (customer.getCustomerName().equals(customerName)&&customer.getCustomerPassword().equals(customerPassword)&& customer.getTyp().equals(typ)) {
                return 3;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }



}
