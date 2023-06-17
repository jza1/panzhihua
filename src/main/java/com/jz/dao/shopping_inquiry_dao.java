package com.jz.dao;

import com.jz.pojo.shopping;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class shopping_inquiry_dao {
    QueryRunner qr = new QueryRunner(Database_connection.getDatasource());
    List<com.jz.pojo.shopping> shopping=null;

    public List<shopping> inquiry() {
        String sql= "select * from shopping";//查询表
        List<shopping> shopping;
        try {
            shopping = qr.query(sql, new BeanListHandler<shopping>(shopping.class));//执行SQL语句
        } catch (SQLException throwables) {
            throw  new RuntimeException(throwables);
        }
        return shopping;
    }
}
