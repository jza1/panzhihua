package com.jz.dao;

import com.jz.pojo.shopping;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class shopping_alter_dao {
    private QueryRunner qr  = new QueryRunner(Database_connection.getDatasource());
    public int alter(shopping shopping) {
        int update;
        String sql="UPDATE shopping SET num=? where product_id=?";
        Object[] params={shopping.getNum(),shopping.getProduct_id()};
        try {
            update = qr.update(sql, params);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return update;
    }
}
