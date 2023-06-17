package com.jz.dao;

import com.jz.pojo.material;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class material_delete_dao {
    private QueryRunner qr  = new QueryRunner(Database_connection.getDatasource());
    public int delete(material material) {
        int update;
        String sql="delete from material where materialid=?";
        Object[] params={material.getMaterialid()};
        try {
            update = qr.update(sql, params);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return update;
    }
}
