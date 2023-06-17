package com.jz.dao;

import com.jz.pojo.Product;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class product_delete_dao {
    private QueryRunner qr  = new QueryRunner(Database_connection.getDatasource());
    public int delete(Product product) {
        int update;
        String sql="delete from product where product_id=?";
        Object[] params={product.getProduct_id()};
        try {
            update = qr.update(sql, params);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return update;
    }
}
