package com.jz.dao;

import com.jz.pojo.Product;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class product_inquiry_dao {
    QueryRunner qr = new QueryRunner(Database_connection.getDatasource());
    List<Product> product=null;

    public List<Product> inquiry() {
        String sql= "select * from product";//查询user表中username
        List<Product> product;
        try {
            product = qr.query(sql, new BeanListHandler<Product>(Product.class));//执行SQL语句
        } catch (SQLException throwables) {
            throw  new RuntimeException(throwables);
        }
        return product;
    }
    public List<Product> inquiry1(String product_id) {
        String sql = "select * from product where product_id=?";//查询user表中username
        List<Product> product;
        try {
            product = qr.query(sql, new BeanListHandler<Product>(Product.class),product_id);//执行SQL语句
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return product;
    }
}
