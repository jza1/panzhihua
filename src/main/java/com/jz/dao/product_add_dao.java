package com.jz.dao;

import com.jz.pojo.Product;
import com.jz.pojo.workers;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class product_add_dao {
    private QueryRunner qr  = new QueryRunner(Database_connection.getDatasource());
    public int add(Product product) {
        int update;
        String sql="INSERT INTO product (product_id,product_name,product_price,product_describe,product_num,product_address,product_num1,imgpath) VALUES(?,?,?,?,?,?,?,?)";
        Object[] params={product.getProduct_id(),product.getProduct_name(),product.getProduct_price(),product.getProduct_describe(),product.getProduct_num(),product.getProduct_address(),product.getProduct_num1(),product.getImgpath()};
        try {
            update = qr.update(sql, params);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return update;
    }
}
