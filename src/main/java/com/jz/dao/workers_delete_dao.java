package com.jz.dao;

import com.jz.pojo.User;
import com.jz.pojo.workers;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class workers_delete_dao {
    private QueryRunner qr  = new QueryRunner(Database_connection.getDatasource());
    public int delete(workers workers) {
        int update;
        String sql="delete from workers where workersId=?";
        Object[] params={workers.getWorkersId()};
        try {
            update = qr.update(sql, params);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return update;
    }
}
