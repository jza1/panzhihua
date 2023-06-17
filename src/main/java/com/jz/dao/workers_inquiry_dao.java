package com.jz.dao;

import com.jz.pojo.Product;
import com.jz.pojo.workers;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class workers_inquiry_dao {
    QueryRunner qr = new QueryRunner(Database_connection.getDatasource());
    List<workers> workers=null;

    public List<workers> inquiry() {
        String sql= "select * from workers";//查询user表中username
        List<com.jz.pojo.workers> worker;
        try {
            worker = qr.query(sql, new BeanListHandler<workers>(workers.class));//执行SQL语句
        } catch (SQLException throwables) {
            throw  new RuntimeException(throwables);
        }
        return worker;
    }
    public List<workers> inquiry1(String workersName,String workersPassword) {
        String sql = "select * from workers where workersName=?";//查询user表中username
        List<workers> workers;
        try {
            workers = qr.query(sql, new BeanListHandler<workers>(workers.class),workersName);//执行SQL语句
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return workers;
    }
}
