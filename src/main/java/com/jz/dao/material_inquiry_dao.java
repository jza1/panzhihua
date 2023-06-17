package com.jz.dao;

import com.jz.pojo.material;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class material_inquiry_dao {
    QueryRunner qr = new QueryRunner(Database_connection.getDatasource());
    List<material> material=null;

    public List<material> inquiry() {
        String sql= "select * from material";//查询user表中username
        List<material> material;
        try {
            material = qr.query(sql, new BeanListHandler<material>(material.class));//执行SQL语句
        } catch (SQLException throwables) {
            throw  new RuntimeException(throwables);
        }
        return material;
    }
}
