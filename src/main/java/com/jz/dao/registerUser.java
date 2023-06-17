package com.jz.dao;


import java.sql.SQLException;

import com.jz.pojo.customer;
import com.jz.util.Database_connection;
import com.jz.pojo.User;
import org.apache.commons.dbutils.QueryRunner;

public class registerUser {
    private QueryRunner qr  = new QueryRunner(Database_connection.getDatasource());
    public int add(customer customer){
        if(customer.getCustomerPassword()==null||customer.getCustomerName()==null){
            return 0;
        }
        if(customer.getCustomerPassword().length()>8||customer.getCustomerPassword().length()<6){
            return 1;
        }
         User register_user=null;
         int update;//更新数据
         String sql="INSERT INTO customer (customerName,customerPassword,customerN,typ) VALUES(?,?,?,?)";
         Object[] params={customer.getCustomerName(),customer.getCustomerPassword(),customer.getCustomerN(),customer.getTyp()};
         try {
             update = qr.update(sql, params);
         } catch (SQLException throwables){
             throw new RuntimeException(throwables);
         }
         return 2;
     }
}
