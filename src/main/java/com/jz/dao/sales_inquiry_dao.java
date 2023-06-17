package com.jz.dao;

import com.jz.pojo.Product;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class sales_inquiry_dao {
    QueryRunner qr = new QueryRunner(Database_connection.getDatasource());

    public List<Product> inquiry() {
        String sql= "select * from Product";//查询Product表
        List<Product> Product;
        try {
            Product= qr.query(sql, new BeanListHandler<Product>(Product.class));//执行SQL语句
        } catch (SQLException throwables) {
            throw  new RuntimeException(throwables);
        }
        return Product;
    }
}
