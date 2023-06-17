package com.jz.dao;

import com.jz.pojo.shopping_cat;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class shopping_cat_add_dao {
    private QueryRunner qr  = new QueryRunner(Database_connection.getDatasource());
    public int add(shopping_cat shopping_cat) {
        int update;
        int price=0;
        String sql1= "select product_price from product where product_id=?";

        try {
            shopping_cat query = qr.query(sql1, new BeanHandler<shopping_cat>(shopping_cat.class),shopping_cat.getProduct_id());
            price =query.getProduct_price();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        String sql="INSERT INTO shopping_cat (product_id,product_price,product_name,num) VALUES(?,?,?,?)";
        Object[] params={shopping_cat.getProduct_id(),price,shopping_cat.getProduct_name(),shopping_cat.getNum()};

        try {
            update = qr.update(sql, params);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return update;
    }
}
