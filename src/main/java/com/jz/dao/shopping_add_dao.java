package com.jz.dao;

import com.jz.pojo.shopping;

import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class shopping_add_dao {
    private QueryRunner qr  = new QueryRunner(Database_connection.getDatasource());
    public int add(shopping shopping) {
        int update;
        int price=0;
        String sql1= "select product_price from product where product_id=?";

        try {
            shopping query = qr.query(sql1, new BeanHandler<shopping>(shopping.class),shopping.getProduct_id());
             price =query.getProduct_price();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        String sql="INSERT INTO shopping (product_id,product_price,product_name,num) VALUES(?,?,?,?)";
        Object[] params={shopping.getProduct_id(),price,shopping.getProduct_name(),shopping.getNum()};

        try {
            update = qr.update(sql, params);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return update;
    }
}
