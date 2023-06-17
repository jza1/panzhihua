package com.jz.dao;

import com.jz.pojo.Product;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class product_alter_dao {
    private QueryRunner qr  = new QueryRunner(Database_connection.getDatasource());
    public int alter(Product product) {
        int update;
        String sql="UPDATE product SET product_name=?,product_price=?,product_describe=?,product_address=?where product_id=?";
        Object[] params={product.getProduct_name(),product.getProduct_price(),product.getProduct_describe(),product.getProduct_address(),product.getProduct_id()};
        try {
            update = qr.update(sql, params);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return update;
    }
}
