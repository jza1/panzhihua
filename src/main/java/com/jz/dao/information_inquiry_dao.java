package com.jz.dao;

import com.jz.pojo.information;
import com.jz.pojo.material;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class information_inquiry_dao {
    QueryRunner qr = new QueryRunner(Database_connection.getDatasource());
    List<com.jz.pojo.information> information=null;

    public List<information> inquiry() {
        String sql= "select * from information";//查询user表中username
        List<information> information;
        try {
            information = qr.query(sql, new BeanListHandler<information>(information.class));//执行SQL语句
        } catch (SQLException throwables) {
            throw  new RuntimeException(throwables);
        }
        return information;
    }
}
