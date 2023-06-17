package com.jz.dao;

import com.jz.pojo.Product;
import com.jz.pojo.material;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class material_add_dao {
    private QueryRunner qr  = new QueryRunner(Database_connection.getDatasource());
    public int add(material material) {
        int update;
        String sql="INSERT INTO material (materialid,materialname,materialprice,materialnum) VALUES(?,?,?,?)";
        Object[] params={material.getMaterialid(),material.getMaterialname(),material.getMaterialprice(),material.getMaterialnum()};
        try {
            update = qr.update(sql, params);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return update;
    }
}
