package com.jz.dao;

import com.jz.pojo.shopping;
import com.jz.pojo.shopping_cat;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class shopping_cat_delete_dao {
    private QueryRunner qr  = new QueryRunner(Database_connection.getDatasource());
    public int delete(shopping_cat shopping_cat) {
        int update;
        String sql="delete from shopping_cat where product_id=?";
        Object[] params={shopping_cat.getProduct_id()};
        try {
            update = qr.update(sql, params);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return update;
    }
}
