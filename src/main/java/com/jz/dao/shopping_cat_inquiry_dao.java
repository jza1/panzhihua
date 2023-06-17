package com.jz.dao;

import com.jz.pojo.shopping;
import com.jz.pojo.shopping_cat;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class shopping_cat_inquiry_dao {
    QueryRunner qr = new QueryRunner(Database_connection.getDatasource());
    List<shopping_cat> shopping_cat=null;

    public List<shopping_cat> inquiry() {
        String sql= "select * from shopping_cat";//查询表
        List<shopping_cat> shopping_cat;
        try {
            shopping_cat = qr.query(sql, new BeanListHandler<shopping_cat>(shopping_cat.class));//执行SQL语句
        } catch (SQLException throwables) {
            throw  new RuntimeException(throwables);
        }
        return shopping_cat;
    }
}
